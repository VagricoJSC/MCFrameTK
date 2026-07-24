package mcframe.serverMSBB.MSBBL1350;

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
	 * -- MSBBL1350_MST_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_ACT_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
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
		MST_SLS_ACT_R S1_TA1 = MST_SLS_ACT_R.create("TA1");
		MST_SLS_RET_SCHD_R S1_TA2 = MST_SLS_RET_SCHD_R.create("TA2");
		MAM_TRD_R S1_MA1 = MAM_TRD_R.create("MA1");
		MAM_BP_R S1_MA2 = MAM_BP_R.create("MA2");
		MAM_BP_R S1_MA3 = MAM_BP_R.create("MA3");
		MAM_CUR_R S1_MA4 = MAM_CUR_R.create("MA4");
		MAM_CUR_R S1_MA5 = MAM_CUR_R.create("MA5");
		MAM_CUR_R S1_MA6 = MAM_CUR_R.create("MA6");
		MAM_USR_R S1_MA7 = MAM_USR_R.create("MA7");
		MAM_DPT_R S1_MA8 = MAM_DPT_R.create("MA8");
		MAM_WG_R S1_MA9 = MAM_WG_R.create("MA9");
		MAM_DPT_R S1_MA10 = MAM_DPT_R.create("MA10");
		MAVM_RD_DPT_R S1_VA1 = MAVM_RD_DPT_R.create("VA1");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		
		MST_SLS_ACT_D_R S0_SLS_ACT_D = MST_SLS_ACT_D_R.create("S0_T3");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_SLS_ACT_D_TempView = createTempView("S0_T3_View");
		MCSingleView S0_RET_ACT_D_View = subQuery().select(
				S0_SLS_ACT_D.sls_act_no,
				S0_SLS_ACT_D.sls_act_seq,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_SLS_ACT_D.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_SLS_ACT_D.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_SLS_ACT_D.trd_cur_amt.add(S0_SLS_ACT_D.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
			)
			.from(
					S0_SLS_ACT_D
					.leftOuterJoin(itmR).on(
						bracket(
							S0_SLS_ACT_D.itm_cd.eq(itmR.itm_cd)
							.and(S0_SLS_ACT_D.itm_sub1.eq(itmR.itm_sub1))
							.and(S0_SLS_ACT_D.itm_sub2.eq(itmR.itm_sub2))
							.and(S0_SLS_ACT_D.itm_sub3.eq(itmR.itm_sub3))
						)
					)
			)
			.groupBy(
					S0_SLS_ACT_D.sls_act_no,
					S0_SLS_ACT_D.sls_act_seq
			)
			.view(S0_SLS_ACT_D_TempView);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_TA1.trd_cd),
						S0_V1.pr(S1_MA1.trd_nm),
						S0_V1.pr(S1_TA1.trd_ptn_typ),
						S0_V1.pr(S1_TA1.sls_ret_schd_no),
						S0_V1.pr(S1_TA2.sls_ret_schd_dt),
						S0_V1.pr(S1_TA1.sls_act_no),
						S0_V1.pr(S1_TA1.sls_act_rev),
						S0_V1.pr(S1_TA1.sls_dt),
						S0_V1.pr(S1_TA1.ac_ym),
						S0_V1.pr(S1_TA1.ac_dt),
						S0_V1.pr(S1_TA1.dlv_slip_no),
						S0_V1.pr(S1_TA1.bill_basis_dt),
						S0_V1.pr(S1_TA1.rcv_schd_dt),
						S0_V1.pr(S1_TA1.cst_po_no),
						S0_V1.pr(S1_TA1.cst_cd),
						S0_V1.pr("cst_nm"),
						S0_V1.pr(S1_TA1.acst_cd),
						S0_V1.pr("acst_nm"),
						S0_V1.pr(S1_TA1.trd_cur_cd),
						S0_V1.pr("trd_cur_nm"),
						S0_V1.pr(S1_TA1.base_cur_cd),
						S0_V1.pr("base_cur_nm"),
						S0_V1.pr(S1_TA2.xrate_inpt_flg),
						S0_V1.pr(S1_TA1.xrate),
						S0_V1.pr(S1_TA1.ptax_cur_cd),
						S0_V1.pr("ptax_cur_nm"),
						S0_V1.pr(S1_TA2.ptax_xrate_inpt_flg),
						S0_V1.pr(S1_TA1.ptax_xrate),
						S0_V1.pr(S1_TA1.sls_usr_cd),
						S0_V1.pr("sls_usr_nm"),
						S0_V1.pr(S1_TA1.sls_dpt_cd),
						S0_V1.pr("sls_dpt_nm"),
						S0_V1.pr(S1_TA1.wg_cd),
						S0_V1.pr(S1_MA9.wg_nm),
						S0_V1.pr(S1_TA1.iv_no),
						S0_V1.pr(S1_TA1.ref_iv_no),
						S0_V1.pr(S1_TA1.ar_dpt_cd),
						S0_V1.pr("ar_dpt_nm"),
						S0_V1.pr(S1_TA1.trd_rmrks),
						S0_V1.pr("schd_intr_rmrks"),
						S0_V1.pr("act_intr_rmrks"),
						S0_V1.pr("schd_sub_char1"),
						S0_V1.pr("schd_sub_char2"),
						S0_V1.pr("schd_sub_char3"),
						S0_V1.pr("act_sub_char1"),
						S0_V1.pr("act_sub_char2"),
						S0_V1.pr("act_sub_char3"),
						S0_V1.pr("can_flg"),
						S0_V1.pr(S1_TA1.ins_usr_id),
						S0_V1.pr(S1_TA1.ins_usr_nm),
						S0_V1.pr(S1_TA1.ins_func_id),
						S0_V1.pr(S1_TA1.ins_ts),
						S0_V1.pr(S1_TA1.upd_usr_id),
						S0_V1.pr(S1_TA1.upd_usr_nm),
						S0_V1.pr(S1_TA1.upd_func_id),
						S0_V1.pr(S1_TA1.upd_ts),
						S0_V1.pr(S1_TA1.upd_srv_req_no),
						S0_V1.pr(S1_TA1.upd_cntr),
						S0_V1.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_TA1.trd_cd,
							S1_MA1.trd_nm,
							S1_TA1.trd_ptn_typ,
							S1_TA1.sls_ret_schd_no,
							S1_TA2.sls_ret_schd_dt,
							S1_TA1.sls_act_no,
							S1_TA1.sls_act_rev,
							S1_TA1.sls_dt,
							S1_TA1.ac_ym,
							S1_TA1.ac_dt,
							S1_TA1.dlv_slip_no,
							S1_TA1.bill_basis_dt,
							S1_TA1.rcv_schd_dt,
							S1_TA1.cst_po_no,
							S1_TA1.cst_cd,
							S1_MA2.bp_nm.as("cst_nm"),
							S1_TA1.acst_cd,
							S1_MA3.bp_nm.as("acst_nm"),
							S1_TA1.trd_cur_cd,
							S1_MA4.cur_nm.as("trd_cur_nm"),
							S1_TA1.base_cur_cd,
							S1_MA5.cur_nm.as("base_cur_nm"),
							S1_TA2.xrate_inpt_flg,
							S1_TA1.xrate,
							S1_TA1.ptax_cur_cd,
							S1_MA6.cur_nm.as("ptax_cur_nm"),
							S1_TA2.ptax_xrate_inpt_flg,
							S1_TA1.ptax_xrate,
							S1_TA1.sls_usr_cd,
							S1_MA7.usr_nm.as("sls_usr_nm"),
							S1_TA1.sls_dpt_cd,
							S1_MA8.dpt_nm.as("sls_dpt_nm"),
							S1_TA1.wg_cd,
							S1_MA9.wg_nm,
							S1_TA1.iv_no,
							S1_TA1.ref_iv_no,
							S1_TA1.ar_dpt_cd,
							S1_MA10.dpt_nm.as("ar_dpt_nm"),
							S1_TA1.trd_rmrks,
							S1_TA2.intr_rmrks.as("schd_intr_rmrks"),
							S1_TA1.intr_rmrks.as("act_intr_rmrks"),
							S1_TA2.sub_char1.as("schd_sub_char1"),
							S1_TA2.sub_char2.as("schd_sub_char2"),
							S1_TA2.sub_char3.as("schd_sub_char3"),
							S1_TA1.sub_char1.as("act_sub_char1"),
							S1_TA1.sub_char2.as("act_sub_char2"),
							S1_TA1.sub_char3.as("act_sub_char3"),
							cases()
								.when(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
									.then(value(true))
								.otherwise(value(false)).as("can_flg"),
							S0_SLS_ACT_D_TempView.pr("trd_cur_inc_tax_amt"),
							S1_TA1.ins_usr_id,
							S1_TA1.ins_usr_nm,
							S1_TA1.ins_func_id,
							S1_TA1.ins_ts,
							S1_TA1.upd_usr_id,
							S1_TA1.upd_usr_nm,
							S1_TA1.upd_func_id,
							S1_TA1.upd_ts,
							S1_TA1.upd_srv_req_no,
							S1_TA1.upd_cntr
						)
						.from(
							S1_TA1
							.leftOuterJoin(S1_TA2).on(
								bracket(
									S1_TA1.sls_ret_schd_no.eq(S1_TA2.sls_ret_schd_no)
								)
							)
							.leftOuterJoin(S1_MA1).on(
								bracket(
									S1_TA1.trd_cd.eq(S1_MA1.trd_cd)
								)
							)
							.leftOuterJoin(S1_MA2).on(
								bracket(
									S1_TA1.cst_cd.eq(S1_MA2.bp_cd)
								)
							)
							.leftOuterJoin(S1_MA3).on(
								bracket(
									S1_TA1.acst_cd.eq(S1_MA3.bp_cd)
								)
							)
							.leftOuterJoin(S1_MA4).on(
								bracket(
									S1_TA1.trd_cur_cd.eq(S1_MA4.cur_cd)
								)
							)
							.leftOuterJoin(S1_MA5).on(
								bracket(
									S1_TA1.base_cur_cd.eq(S1_MA5.cur_cd)
								)
							)
							.leftOuterJoin(S1_MA6).on(
								bracket(
									S1_TA1.ptax_cur_cd.eq(S1_MA6.cur_cd)
								)
							)
							.leftOuterJoin(S1_MA7).on(
								bracket(
									S1_TA1.sls_usr_cd.eq(S1_MA7.usr_cd)
								)
							)
							.leftOuterJoin(S1_MA8).on(
								bracket(
									S1_TA1.sls_dpt_cd.eq(S1_MA8.dpt_cd)
									.and(S1_TA1.ac_dt.between(S1_MA8.st_dt, S1_MA8.end_dt))
								)
							)
							.leftOuterJoin(S1_MA9).on(
								bracket(
									S1_TA1.wg_cd.eq(S1_MA9.wg_cd)
								)
							)
							.leftOuterJoin(S1_MA10).on(
								bracket(
									S1_TA1.ar_dpt_cd.eq(S1_MA10.dpt_cd)
									.and(S1_TA1.ac_dt.between(S1_MA10.st_dt, S1_MA10.end_dt))
								)
							)
							.innerJoin(S1_VA1).on(
								bracket(
									S1_TA1.sls_dpt_cd.eq(S1_VA1.dpt_cd)
								)
							)
							.leftOuterJoin(S0_RET_ACT_D_View)
							.on(
								(S0_SLS_ACT_D_TempView.pr(MST_SLS_ACT_D_R.$sls_act_no).eq(S1_TA1.sls_act_no))
								.and((S0_SLS_ACT_D_TempView.pr(MST_SLS_ACT_D_R.$sls_act_seq).eq(S1_TA1.sls_act_seq)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("iv_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(true)))
								)
								.or(
									bind("iv_not_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(false)))
								)
							)
							.cutoff$and(S1_TA2.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
							.cutoff$and(S1_TA2.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
							.cutoff$and(S1_TA1.sls_dt.gte(bind("sls_ret_dt_fr")))
							.cutoff$and(S1_TA1.sls_dt.lte(bind("sls_ret_dt_to")))
							.cutoff$and(S1_TA1.ac_ym.gte(bind("ac_ym_fr")))
							.cutoff$and(S1_TA1.ac_ym.lte(bind("ac_ym_to")))
							.cutoff$and(S1_TA1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_TA1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_TA1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_MA1.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S1_TA1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
							.cutoff$and(S1_TA1.sls_act_no.like(bind("sls_act_no")))
							.cutoff$and(S1_TA1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_TA1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_MA2.bp_nm.like(bind("cst_nm")))
							.cutoff$and(S1_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_MA4.cur_nm.like(bind("trd_cur_nm")))
							.cutoff$and(S1_TA1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_TA1.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_TA1.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_MA7.usr_nm.like(bind("sls_usr_nm")))
							.cutoff$and(S1_TA1.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_MA8.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(S1_TA1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_MA9.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_TA1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_TA1.intr_rmrks.like(bind("act_intr_rmrks")))
							.cutoff$and(S1_TA1.sub_char1.like(bind("act_sub_char1")))
							.cutoff$and(S1_TA1.sub_char2.like(bind("act_sub_char2")))
							.cutoff$and(S1_TA1.sub_char3.like(bind("act_sub_char3")))
							.and(
								bind("inc_can_flg").eq(value(false))
								.and(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.or(bind("inc_can_flg").eq(value(true)))
								.and(
									S1_TA1.slip_sts_typ.in(
										value(MAC_SLIP_STS_TYP.CRT.value()),
										value(MAC_SLIP_STS_TYP.DIS.value())
									)
								)
							)
							.and(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							.cutoff$and(S1_TA2.intr_rmrks.like(bind("schd_intr_rmrks")))
							.cutoff$and(S1_TA2.sub_char1.like(bind("schd_sub_char1")))
							.cutoff$and(S1_TA2.sub_char2.like(bind("schd_sub_char2")))
							.cutoff$and(S1_TA2.sub_char3.like(bind("schd_sub_char3")))
						).view(S0_V1)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(S0_V1.pr(S1_TA1.sls_act_no).asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_V1.pr(S1_TA1.cst_cd).eq(S0_M1.bp_cd)))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd1.as("cst_grp_cd1"), S0_MM1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd2.as("cst_grp_cd2"), S0_MM2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd3.as("cst_grp_cd3"), S0_MM3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd4.as("cst_grp_cd4"), S0_MM4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd5.as("cst_grp_cd5"), S0_MM5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd6.as("cst_grp_cd6"), S0_MM6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd7.as("cst_grp_cd7"), S0_MM7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd8.as("cst_grp_cd8"), S0_MM8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd9.as("cst_grp_cd9"), S0_MM9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd10.as("cst_grp_cd10"), S0_MM10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL1350_MST_SLS_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_ACT_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_ITM_GRP_R S0_MM31 = MAM_ITM_GRP_R.create("MM31");
		MAM_ITM_GRP_R S0_MM32 = MAM_ITM_GRP_R.create("MM32");
		MAM_ITM_GRP_R S0_MM33 = MAM_ITM_GRP_R.create("MM33");
		MAM_ITM_GRP_R S0_MM34 = MAM_ITM_GRP_R.create("MM34");
		MAM_ITM_GRP_R S0_MM35 = MAM_ITM_GRP_R.create("MM35");
		MAM_ITM_GRP_R S0_MM36 = MAM_ITM_GRP_R.create("MM36");
		MAM_ITM_GRP_R S0_MM37 = MAM_ITM_GRP_R.create("MM37");
		MAM_ITM_GRP_R S0_MM38 = MAM_ITM_GRP_R.create("MM38");
		MAM_ITM_GRP_R S0_MM39 = MAM_ITM_GRP_R.create("MM39");
		MAM_ITM_GRP_R S0_MM310 = MAM_ITM_GRP_R.create("MM310");
		MST_SLS_ACT_R S1_TA1 = MST_SLS_ACT_R.create("TA1");
		MST_SLS_ACT_D_R S1_TA2 = MST_SLS_ACT_D_R.create("TA2");
		MST_WRK_R S1_TA5 = MST_WRK_R.create("TA5");
		MST_SLS_RET_SCHD_R S1_TA6 = MST_SLS_RET_SCHD_R.create("TA6");
		MST_SLS_RET_SCHD_D_R S1_TA7 = MST_SLS_RET_SCHD_D_R.create("TA7");
		MST_LOT_R S1_TA8 = MST_LOT_R.create("TA8");
		MST_PURC_RET_ACT_D_R S1_TA9 = MST_PURC_RET_ACT_D_R.create("TA9");
		MST_PURC_RET_ACT_R S1_TA10 = MST_PURC_RET_ACT_R.create("TA10");
		MST_PURC_ACT_R S1_TA11 = MST_PURC_ACT_R.create("TA11");
		MST_PURC_ACT_D_R S1_TA12 = MST_PURC_ACT_D_R.create("TA12");
		MAM_TRD_R S1_MA1 = MAM_TRD_R.create("MA1");
		MAM_BP_R S1_MA2 = MAM_BP_R.create("MA2");
		MAM_BP_R S1_MA3 = MAM_BP_R.create("MA3");
		MAM_CUR_R S1_MA4 = MAM_CUR_R.create("MA4");
		MAM_CUR_R S1_MA5 = MAM_CUR_R.create("MA5");
		MAM_CUR_R S1_MA6 = MAM_CUR_R.create("MA6");
		MAM_USR_R S1_MA7 = MAM_USR_R.create("MA7");
		MAM_DPT_R S1_MA8 = MAM_DPT_R.create("MA8");
		MAM_WG_R S1_MA9 = MAM_WG_R.create("MA9");
		MAM_DPT_R S1_MA10 = MAM_DPT_R.create("MA10");
		MAM_BIZ_RSN_R S1_MA11 = MAM_BIZ_RSN_R.create("MA11");
		MAM_BP_R S1_MA12 = MAM_BP_R.create("MA12");
		MAM_CNTRY_R S1_MA13 = MAM_CNTRY_R.create("MA13");
		MAM_BP_R S1_MA14 = MAM_BP_R.create("MA14");
		MAM_BP_R S1_MA15 = MAM_BP_R.create("MA15");
		MAM_BP_R S1_MA16 = MAM_BP_R.create("MA16");
		MAM_ITM_R S1_MA17 = MAM_ITM_R.create("MA17");
		MAM_ITM_TYP_D_R S1_MA18 = MAM_ITM_TYP_D_R.create("MA18");
		MAM_ITM_LCL_R S1_MA19 = MAM_ITM_LCL_R.create("MA19");
		MAM_ITM_LCL_R S1_MA20 = MAM_ITM_LCL_R.create("MA20");
		MAM_CNTRY_R S1_MA21 = MAM_CNTRY_R.create("MA21");
		MAM_UNIT_R S1_MA22 = MAM_UNIT_R.create("MA22");
		MAM_UNIT_R S1_MA23 = MAM_UNIT_R.create("MA23");
		MAM_TAX_R S1_MA24 = MAM_TAX_R.create("MA24");
		MAM_STK_GD_R S1_MA25 = MAM_STK_GD_R.create("MA25");
		MAM_LOC_R S1_MA26 = MAM_LOC_R.create("MA26");
		MAM_SITE_R S1_MA27 = MAM_SITE_R.create("MA27");
		MAM_WG_R S1_MA28 = MAM_WG_R.create("MA28");
		MAM_STR_LN_R S1_MA29 = MAM_STR_LN_R.create("MA29");
		MAM_BIZ_RSN_R S1_MA30 = MAM_BIZ_RSN_R.create("MA30");
		MAM_DPT_R S1_MA31 = MAM_DPT_R.create("MA31");
		MAVM_RD_DPT_R S1_VA1 = MAVM_RD_DPT_R.create("VA1");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_V1.pr(S1_TA1.trd_cd),
						S0_V1.pr(S1_MA1.trd_nm),
						S0_V1.pr(S1_TA1.trd_ptn_typ),
						S0_V1.pr(S1_TA1.sls_ret_schd_no),
						S0_V1.pr(S1_TA2.sls_ret_schd_d_no),
						S0_V1.pr(S1_TA6.sls_ret_schd_dt),
						S0_V1.pr(S1_TA1.sls_act_no),
						S0_V1.pr(S1_TA1.sls_act_rev),
						S0_V1.pr(S1_TA2.sls_act_d_no),
						S0_V1.pr(S1_TA1.sls_dt),
						S0_V1.pr(S1_TA1.ac_ym),
						S0_V1.pr(S1_TA1.ac_dt),
						S0_V1.pr(S1_TA1.dlv_slip_no),
						S0_V1.pr(S1_TA1.bill_basis_dt),
						S0_V1.pr(S1_TA1.rcv_schd_dt),
						S0_V1.pr(S1_TA1.cst_po_no),
						S0_V1.pr(S1_TA1.cst_cd),
						S0_V1.pr("cst_nm"),
						S0_V1.pr(S1_TA1.acst_cd),
						S0_V1.pr("acst_nm"),
						S0_V1.pr(S1_TA1.trd_cur_cd),
						S0_V1.pr("trd_cur_nm"),
						S0_V1.pr(S1_TA1.base_cur_cd),
						S0_V1.pr("base_cur_nm"),
						S0_V1.pr(S1_TA6.xrate_inpt_flg),
						S0_V1.pr(S1_TA1.xrate),
						S0_V1.pr(S1_TA1.ptax_cur_cd),
						S0_V1.pr("ptax_cur_nm"),
						S0_V1.pr(S1_TA6.ptax_xrate_inpt_flg),
						S0_V1.pr(S1_TA1.ptax_xrate),
						S0_V1.pr(S1_TA1.sls_usr_cd),
						S0_V1.pr("sls_usr_nm"),
						S0_V1.pr(S1_TA1.sls_dpt_cd),
						S0_V1.pr("sls_dpt_nm"),
						S0_V1.pr(S1_TA1.wg_cd),
						S0_V1.pr(S1_MA9.wg_nm),
						S0_V1.pr(S1_TA1.iv_no),
						S0_V1.pr(S1_TA1.ref_iv_no),
						S0_V1.pr(S1_TA1.ar_dpt_cd),
						S0_V1.pr("ar_dpt_nm"),
						S0_V1.pr(S1_TA1.trd_rmrks),
						S0_V1.pr("schd_intr_rmrks"),
						S0_V1.pr("act_intr_rmrks"),
						S0_V1.pr("schd_sub_char1"),
						S0_V1.pr("schd_sub_char2"),
						S0_V1.pr("schd_sub_char3"),
						S0_V1.pr("act_sub_char1"),
						S0_V1.pr("act_sub_char2"),
						S0_V1.pr("act_sub_char3"),
						S0_V1.pr("sret_fr_cd"),
						S0_V1.pr("sret_fr_nm"),
						S0_V1.pr("sret_fr_sundry_flg"),
						S0_V1.pr("sret_fr_zip_cd"),
						S0_V1.pr("sret_fr_addr1"),
						S0_V1.pr("sret_fr_addr2"),
						S0_V1.pr("sret_fr_addr3"),
						S0_V1.pr("sret_fr_addr4"),
						S0_V1.pr("sret_fr_cntct_dpt"),
						S0_V1.pr("sret_fr_cntct_psn"),
						S0_V1.pr("sret_fr_tel"),
						S0_V1.pr("sret_fr_fax"),
						S0_V1.pr(S1_MA12.cntry_cd),
						S0_V1.pr(S1_MA13.cntry_nm),
						S0_V1.pr(S1_TA2.pri_prnt_flg),
						S0_V1.pr(S1_TA2.dest_cd1),
						S0_V1.pr("dest_nm1"),
						S0_V1.pr(S1_TA2.dest_cd2),
						S0_V1.pr("dest_nm2"),
						S0_V1.pr(S1_TA2.dest_cd3),
						S0_V1.pr("dest_nm3"),
						S0_V1.pr(S1_MA17.itm_typ),
						S0_V1.pr(S1_MA17.itm_typ_d_cd),
						S0_V1.pr(S1_MA18.itm_typ_d_nm),
						S0_V1.pr(S1_TA2.itm_cd),
						S0_V1.pr(S1_TA2.itm_sub1),
						S0_V1.pr(S1_TA2.itm_sub2),
						S0_V1.pr(S1_TA2.itm_sub3),
						S0_V1.pr("itm_nm"),
						S0_V1.pr("iv_itm_nm"),
						S0_V1.pr(S1_MA17.asset_mng_typ),
						S0_V1.pr(S1_TA2.sundry_itm_flg),
						S0_V1.pr(S1_TA2.cntry_org_cd),
						S0_V1.pr("cntry_org_nm"),
						S0_V1.pr(S1_TA2.trd_unit_qty),
						S0_V1.pr(S1_TA2.trd_unit_cd),
						S0_V1.pr("trd_unit_nm"),
						S0_V1.pr(S1_TA2.base_unit_cd),
						S0_V1.pr("base_unit_nm"),
						S0_V1.pr(S1_TA2.base_unit_qty),
						S0_V1.pr(S1_TA2.trd_cur_upri),
						S0_V1.pr(S1_TA2.interim_flg),
						S0_V1.pr(S1_TA2.trd_cur_amt),
						S0_V1.pr("trd_cur_inc_tax_amt"),
						S0_V1.pr(S1_TA2.trd_cur_dscnt_amt),
						S0_V1.pr(S1_TA2.dscnt_rsn_cd),
						S0_V1.pr("dscnt_rsn_nm"),
						S0_V1.pr(S1_TA2.cost_upri),
						S0_V1.pr("tax_fix_flg"),
						S0_V1.pr(S1_TA2.tax_cd),
						S0_V1.pr(S1_MA24.tax_nm),
						S0_V1.pr(S1_MA24.tax_rate),
						S0_V1.pr(S1_TA2.trd_cur_tax_amt),
						S0_V1.pr(S1_TA2.base_cur_upri),
						S0_V1.pr("base_cur_inc_tax_amt"),
						S0_V1.pr(S1_TA2.base_cur_tax_amt),
						S0_V1.pr(S1_TA2.base_cur_dscnt_amt),
						S0_V1.pr(S1_TA2.ptax_cur_upri),
						S0_V1.pr(S1_TA2.ptax_cur_amt),
						S0_V1.pr("ptax_cur_inc_tax_amt"),
						S0_V1.pr(S1_TA2.ptax_cur_tax_amt),
						S0_V1.pr(S1_TA2.ptax_cur_dscnt_amt),
						S0_V1.pr(S1_TA2.gd_cd),
						S0_V1.pr(S1_MA25.gd_nm),
						S0_V1.pr("cnsgn_gd_cd"),
						S0_V1.pr("cnsgn_gd_nm"),
						S0_V1.pr(S1_TA2.sno1),
						S0_V1.pr(S1_TA2.sno2),
						S0_V1.pr(S1_TA2.sno3),
						S0_V1.pr(S1_TA2.sno4),
						S0_V1.pr(S1_TA2.wrk_no),
						S0_V1.pr(S1_TA5.wrk_nm),
						S0_V1.pr(S1_MA26.site_cd),
						S0_V1.pr(S1_MA27.site_nm),
						S0_V1.pr("loc_wg_cd"),
						S0_V1.pr("loc_wg_nm"),
						S0_V1.pr(S1_TA2.loc_cd),
						S0_V1.pr(S1_MA26.loc_nm),
						S0_V1.pr(S1_TA2.str_ln_cd),
						S0_V1.pr(S1_MA29.str_ln_nm),
						S0_V1.pr(S1_TA2.lot_no),
						S0_V1.pr(S1_TA2.sublot_no),
						S0_V1.pr(S1_MA17.ver_flg),
						S0_V1.pr("ver_no"),
						S0_V1.pr("vmi_flg"),
						S0_V1.pr(S1_TA2.cst_po_d_no),
						S0_V1.pr(S1_TA2.cst_itm_cd),
						S0_V1.pr(S1_TA2.cst_itm_nm),
						S0_V1.pr("ret_rsn_cd"),
						S0_V1.pr("ret_rsn_nm"),
						S0_V1.pr(S1_TA2.bd_dpt_cd),
						S0_V1.pr("bd_dpt_nm"),
						S0_V1.pr(S1_TA2.wtax_rate),
						S0_V1.pr(S1_TA2.wtax_amt),
						S0_V1.pr(S1_TA2.bill_crryovr_times),
						S0_V1.pr(S1_TA2.trd_d_rmrks),
						S0_V1.pr("schd_d_intr_rmrks"),
						S0_V1.pr("act_d_intr_rmrks"),
						S0_V1.pr(S1_TA7.arr_cnt_rmrks),
						S0_V1.pr("schd_d_sub_char1"),
						S0_V1.pr("schd_d_sub_char2"),
						S0_V1.pr("schd_d_sub_char3"),
						S0_V1.pr("act_d_sub_char1"),
						S0_V1.pr("act_d_sub_char2"),
						S0_V1.pr("act_d_sub_char3"),
						S0_V1.pr(S1_TA2.ref_sls_act_no),
						S0_V1.pr(S1_TA2.ref_sls_act_d_no),
						S0_V1.pr(S1_TA2.base_sls_ac_dt),
						S0_V1.pr(S1_TA10.purc_ret_act_no),
						S0_V1.pr(S1_TA9.purc_ret_act_d_no),
						S0_V1.pr(S1_TA12.base_purc_ac_dt),
						S0_V1.pr(S1_TA2.disp_seq),
						S0_V1.pr("can_flg"),
						S0_V1.pr(S1_TA2.ins_usr_id),
						S0_V1.pr(S1_TA2.ins_usr_nm),
						S0_V1.pr(S1_TA2.ins_func_id),
						S0_V1.pr(S1_TA2.ins_ts),
						S0_V1.pr(S1_TA2.upd_usr_id),
						S0_V1.pr(S1_TA2.upd_usr_nm),
						S0_V1.pr(S1_TA2.upd_func_id),
						S0_V1.pr(S1_TA2.upd_ts),
						S0_V1.pr(S1_TA2.upd_srv_req_no),
						S0_V1.pr(S1_TA2.upd_cntr),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_TA1.trd_cd,
							S1_MA1.trd_nm,
							S1_TA1.trd_ptn_typ,
							S1_TA1.sls_ret_schd_no,
							S1_TA2.sls_ret_schd_d_no,
							S1_TA6.sls_ret_schd_dt,
							S1_TA1.sls_act_no,
							S1_TA1.sls_act_rev,
							S1_TA2.sls_act_d_no,
							S1_TA1.sls_dt,
							S1_TA1.ac_ym,
							S1_TA1.ac_dt,
							S1_TA1.dlv_slip_no,
							S1_TA1.bill_basis_dt,
							S1_TA1.rcv_schd_dt,
							S1_TA1.cst_po_no,
							S1_TA1.cst_cd,
							S1_MA2.bp_nm.as("cst_nm"),
							S1_TA1.acst_cd,
							S1_MA3.bp_nm.as("acst_nm"),
							S1_TA1.trd_cur_cd,
							S1_MA4.cur_nm.as("trd_cur_nm"),
							S1_TA1.base_cur_cd,
							S1_MA5.cur_nm.as("base_cur_nm"),
							S1_TA6.xrate_inpt_flg,
							S1_TA1.xrate,
							S1_TA1.ptax_cur_cd,
							S1_MA6.cur_nm.as("ptax_cur_nm"),
							S1_TA6.ptax_xrate_inpt_flg,
							S1_TA1.ptax_xrate,
							S1_TA1.sls_usr_cd,
							S1_MA7.usr_nm.as("sls_usr_nm"),
							S1_TA1.sls_dpt_cd,
							S1_MA8.dpt_nm.as("sls_dpt_nm"),
							S1_TA1.wg_cd,
							S1_MA9.wg_nm,
							S1_TA1.iv_no,
							S1_TA1.ref_iv_no,
							S1_TA1.ar_dpt_cd,
							S1_MA10.dpt_nm.as("ar_dpt_nm"),
							S1_TA1.trd_rmrks,
							S1_TA6.intr_rmrks.as("schd_intr_rmrks"),
							S1_TA1.intr_rmrks.as("act_intr_rmrks"),
							S1_TA6.sub_char1.as("schd_sub_char1"),
							S1_TA6.sub_char2.as("schd_sub_char2"),
							S1_TA6.sub_char3.as("schd_sub_char3"),
							S1_TA1.sub_char1.as("act_sub_char1"),
							S1_TA1.sub_char2.as("act_sub_char2"),
							S1_TA1.sub_char3.as("act_sub_char3"),
							S1_TA2.dlv_cd.as("sret_fr_cd"),
							nvl(
								S1_TA2.dlv_nm,
								S1_MA12.bp_nm
							).as("sret_fr_nm"),
							S1_TA2.dlv_sundry_flg.as("sret_fr_sundry_flg"),
							S1_TA2.dlv_zip_cd.as("sret_fr_zip_cd"),
							S1_TA2.dlv_addr1.as("sret_fr_addr1"),
							S1_TA2.dlv_addr2.as("sret_fr_addr2"),
							S1_TA2.dlv_addr3.as("sret_fr_addr3"),
							S1_TA2.dlv_addr4.as("sret_fr_addr4"),
							S1_TA2.dlv_cntct_dpt.as("sret_fr_cntct_dpt"),
							S1_TA2.dlv_cntct_psn.as("sret_fr_cntct_psn"),
							S1_TA2.dlv_tel.as("sret_fr_tel"),
							S1_TA2.dlv_fax.as("sret_fr_fax"),
							S1_MA12.cntry_cd,
							S1_MA13.cntry_nm,
							S1_TA2.pri_prnt_flg,
							S1_TA2.dest_cd1,
							S1_MA14.bp_nm.as("dest_nm1"),
							S1_TA2.dest_cd2,
							S1_MA15.bp_nm.as("dest_nm2"),
							S1_TA2.dest_cd3,
							S1_MA16.bp_nm.as("dest_nm3"),
							S1_MA17.itm_typ,
							S1_MA17.itm_typ_d_cd,
							S1_MA18.itm_typ_d_nm,
							S1_TA2.itm_cd,
							S1_TA2.itm_sub1,
							S1_TA2.itm_sub2,
							S1_TA2.itm_sub3,
							nvl(
								S1_TA2.itm_nm,
								S1_MA17.itm_nm
							).as("itm_nm"),
							cases()
								.when(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									.then(
										decode(
											S1_TA2.sundry_itm_flg,
											value(true),
											S1_TA2.iv_itm_nm,
											S1_MA19.itm_nm
										)
								)
								.when(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_DSCNT.value())))
									.then(
										decode(
											S1_TA2.sundry_itm_flg,
											value(true),
											S1_TA2.iv_itm_nm,
											S1_MA20.itm_nm
										)
								)
								.otherwise(S1_MA17.itm_nm).as("iv_itm_nm"),
							S1_MA17.asset_mng_typ,
							S1_TA2.sundry_itm_flg,
							S1_TA2.cntry_org_cd,
							S1_MA21.cntry_nm.as("cntry_org_nm"),
							S1_TA2.trd_unit_qty,
							S1_TA2.trd_unit_cd,
							S1_MA22.unit_nm.as("trd_unit_nm"),
							S1_TA2.base_unit_cd,
							S1_MA23.unit_nm.as("base_unit_nm"),
							S1_TA2.base_unit_qty,
							S1_TA2.trd_cur_upri,
							S1_TA2.interim_flg,
							S1_TA2.trd_cur_amt,
							bracket(
								S1_TA2.trd_cur_amt.add(S1_TA2.trd_cur_tax_amt)
							).as("trd_cur_inc_tax_amt"),
							S1_TA2.trd_cur_dscnt_amt,
							S1_TA2.dscnt_rsn_cd,
							S1_MA11.biz_rsn_nm.as("dscnt_rsn_nm"),
							S1_TA2.cost_upri,
							value(false).as("tax_fix_flg"),
							S1_TA2.tax_cd,
							S1_MA24.tax_nm,
							S1_MA24.tax_rate,
							S1_TA2.trd_cur_tax_amt,
							S1_TA2.base_cur_upri,
							bracket(
								S1_TA2.base_cur_amt.add(S1_TA2.base_cur_tax_amt)
							).as("base_cur_inc_tax_amt"),
							S1_TA2.base_cur_tax_amt,
							S1_TA2.base_cur_dscnt_amt,
							S1_TA2.ptax_cur_upri,
							S1_TA2.ptax_cur_amt,
							bracket(
								S1_TA2.ptax_cur_amt.add(S1_TA2.ptax_cur_tax_amt)
							).as("ptax_cur_inc_tax_amt"),
							S1_TA2.ptax_cur_tax_amt,
							S1_TA2.ptax_cur_dscnt_amt,
							S1_TA2.gd_cd,
							S1_MA25.gd_nm,
							nullValue().as("cnsgn_gd_cd"),
							nullValue().as("cnsgn_gd_nm"),
							S1_TA2.sno1,
							S1_TA2.sno2,
							S1_TA2.sno3,
							S1_TA2.sno4,
							S1_TA2.wrk_no,
							S1_TA5.wrk_nm,
							S1_MA26.site_cd,
							S1_MA27.site_nm,
							S1_MA26.wg_cd.as("loc_wg_cd"),
							S1_MA28.wg_nm.as("loc_wg_nm"),
							S1_TA2.loc_cd,
							S1_MA26.loc_nm,
							S1_TA2.str_ln_cd,
							S1_MA29.str_ln_nm,
							S1_TA2.lot_no,
							S1_TA2.sublot_no,
							S1_MA17.ver_flg,
							decode(
								S1_MA17.ver_flg,
								value(true),
								S1_TA8.ver_no,
								nullValue()
							).as("ver_no"),
							value(false).as("vmi_flg"),
							S1_TA2.cst_po_d_no,
							S1_TA2.cst_itm_cd,
							S1_TA2.cst_itm_nm,
							S1_TA2.rsn_cd.as("ret_rsn_cd"),
							S1_MA30.biz_rsn_nm.as("ret_rsn_nm"),
							S1_TA2.bd_dpt_cd,
							S1_MA31.dpt_nm.as("bd_dpt_nm"),
							S1_TA2.wtax_rate,
							S1_TA2.wtax_amt,
							S1_TA2.bill_crryovr_times,
							S1_TA2.trd_d_rmrks,
							S1_TA7.intr_rmrks.as("schd_d_intr_rmrks"),
							S1_TA2.intr_rmrks.as("act_d_intr_rmrks"),
							S1_TA7.arr_cnt_rmrks,
							S1_TA7.sub_char1.as("schd_d_sub_char1"),
							S1_TA7.sub_char2.as("schd_d_sub_char2"),
							S1_TA7.sub_char3.as("schd_d_sub_char3"),
							S1_TA2.sub_char1.as("act_d_sub_char1"),
							S1_TA2.sub_char2.as("act_d_sub_char2"),
							S1_TA2.sub_char3.as("act_d_sub_char3"),
							S1_TA2.ref_sls_act_no,
							S1_TA2.ref_sls_act_d_no,
							S1_TA2.base_sls_ac_dt,
							S1_TA10.purc_ret_act_no,
							S1_TA9.purc_ret_act_d_no,
							S1_TA12.base_purc_ac_dt,
							S1_TA2.disp_seq,
							cases()
								.when(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
									.then(value(true))
								.otherwise(value(false)).as("can_flg"),
							S1_TA2.ins_usr_id,
							S1_TA2.ins_usr_nm,
							S1_TA2.ins_func_id,
							S1_TA2.ins_ts,
							S1_TA2.upd_usr_id,
							S1_TA2.upd_usr_nm,
							S1_TA2.upd_func_id,
							S1_TA2.upd_ts,
							S1_TA2.upd_srv_req_no,
							S1_TA2.upd_cntr
						)
						.from(
							S1_TA1
							.innerJoin(S1_TA2).on(
								S1_TA1.sls_act_no.eq(S1_TA2.sls_act_no)
								.and(S1_TA1.sls_act_seq.eq(S1_TA2.sls_act_seq))
							)
							.leftOuterJoin(S1_TA5).on(S1_TA2.wrk_no.eq(S1_TA5.wrk_no))
							.leftOuterJoin(S1_TA6).on(S1_TA1.sls_ret_schd_no.eq(S1_TA6.sls_ret_schd_no))
							.leftOuterJoin(S1_TA7).on(S1_TA2.sls_ret_schd_d_no.eq(S1_TA7.sls_ret_schd_d_no))
							.leftOuterJoin(S1_TA8).on(
								S1_TA2.itm_cd.eq(S1_TA8.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_TA8.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_TA8.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_TA8.itm_sub3))
								.and(S1_TA2.lot_no.eq(S1_TA8.lot_no))
								.and(S1_TA2.sublot_no.eq(S1_TA8.sublot_no))
							)
							.leftOuterJoin(S1_TA9).on(
								S1_TA2.sls_act_d_no.eq(S1_TA9.sls_act_d_no)
								.and(S1_TA9.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_TA10).on(
								S1_TA9.purc_ret_act_no.eq(S1_TA10.purc_ret_act_no)
								.and(S1_TA9.purc_ret_act_rev.eq(S1_TA10.purc_ret_act_rev))
								.and(S1_TA10.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_TA11).on(
								S1_TA9.purc_ret_act_no.eq(S1_TA11.purc_ret_act_no)
								.and(S1_TA11.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_TA12).on(
								S1_TA11.purc_act_no.eq(S1_TA12.purc_act_no)
								.and(S1_TA11.purc_act_seq.eq(S1_TA12.purc_act_seq))
								.and(S1_TA9.purc_ret_act_d_no.eq(S1_TA12.purc_ret_act_d_no))
							)
							.leftOuterJoin(S1_MA1).on(S1_TA1.trd_cd.eq(S1_MA1.trd_cd))
							.leftOuterJoin(S1_MA2).on(S1_TA1.cst_cd.eq(S1_MA2.bp_cd))
							.leftOuterJoin(S1_MA3).on(S1_TA1.acst_cd.eq(S1_MA3.bp_cd))
							.leftOuterJoin(S1_MA4).on(S1_TA1.trd_cur_cd.eq(S1_MA4.cur_cd))
							.leftOuterJoin(S1_MA5).on(S1_TA1.base_cur_cd.eq(S1_MA5.cur_cd))
							.leftOuterJoin(S1_MA6).on(S1_TA1.ptax_cur_cd.eq(S1_MA6.cur_cd))
							.leftOuterJoin(S1_MA7).on(S1_TA1.sls_usr_cd.eq(S1_MA7.usr_cd))
							.leftOuterJoin(S1_MA8).on(
								S1_TA1.sls_dpt_cd.eq(S1_MA8.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA8.st_dt, S1_MA8.end_dt))
							)
							.leftOuterJoin(S1_MA9).on(S1_TA1.wg_cd.eq(S1_MA9.wg_cd))
							.leftOuterJoin(S1_MA10).on(
								S1_TA1.ar_dpt_cd.eq(S1_MA10.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA10.st_dt, S1_MA10.end_dt))
							)
							.leftOuterJoin(S1_MA11).on(S1_TA2.dscnt_rsn_cd.eq(S1_MA11.biz_rsn_cd))
							.leftOuterJoin(S1_MA12).on(S1_TA2.dlv_cd.eq(S1_MA12.bp_cd))
							.leftOuterJoin(S1_MA13).on(S1_MA12.cntry_cd.eq(S1_MA13.cntry_cd))
							.leftOuterJoin(S1_MA14).on(S1_TA2.dest_cd1.eq(S1_MA14.bp_cd))
							.leftOuterJoin(S1_MA15).on(S1_TA2.dest_cd2.eq(S1_MA15.bp_cd))
							.leftOuterJoin(S1_MA16).on(S1_TA2.dest_cd3.eq(S1_MA16.bp_cd))
							.leftOuterJoin(S1_MA17).on(
								S1_TA2.itm_cd.eq(S1_MA17.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA17.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA17.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA17.itm_sub3))
							)
							.leftOuterJoin(S1_MA18).on(
								S1_MA17.itm_typ.eq(S1_MA18.itm_typ)
								.and(S1_MA17.itm_typ_d_cd.eq(S1_MA18.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_MA19).on(
								S1_TA2.itm_cd.eq(S1_MA19.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA19.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA19.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA19.itm_sub3))
								.and(S1_MA12.prnt_lcl_cd.eq(S1_MA19.lcl_cd))
							)
							.leftOuterJoin(S1_MA20).on(
								S1_TA2.itm_cd.eq(S1_MA20.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA20.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA20.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA20.itm_sub3))
								.and(S1_MA2.prnt_lcl_cd.eq(S1_MA20.lcl_cd))
							)
							.leftOuterJoin(S1_MA21).on(S1_TA2.cntry_org_cd.eq(S1_MA21.cntry_cd))
							.leftOuterJoin(S1_MA22).on(S1_TA2.trd_unit_cd.eq(S1_MA22.unit_cd))
							.leftOuterJoin(S1_MA23).on(S1_TA2.base_unit_cd.eq(S1_MA23.unit_cd))
							.leftOuterJoin(S1_MA24).on(S1_TA2.tax_cd.eq(S1_MA24.tax_cd))
							.leftOuterJoin(S1_MA25).on(S1_TA2.gd_cd.eq(S1_MA25.gd_cd))
							.leftOuterJoin(S1_MA26).on(S1_TA2.loc_cd.eq(S1_MA26.loc_cd))
							.leftOuterJoin(S1_MA27).on(S1_MA26.site_cd.eq(S1_MA27.site_cd))
							.leftOuterJoin(S1_MA28).on(S1_MA26.wg_cd.eq(S1_MA28.wg_cd))
							.leftOuterJoin(S1_MA29).on(
								S1_TA2.str_ln_cd.eq(S1_MA29.str_ln_cd)
								.and(S1_TA2.loc_cd.eq(S1_MA29.loc_cd))
							)
							.leftOuterJoin(S1_MA30).on(S1_TA2.rsn_cd.eq(S1_MA30.biz_rsn_cd))
							.leftOuterJoin(S1_MA31).on(
								S1_TA2.bd_dpt_cd.eq(S1_MA31.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA31.st_dt, S1_MA31.end_dt))
							)
							.innerJoin(S1_VA1).on(S1_TA1.sls_dpt_cd.eq(S1_VA1.dpt_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("iv_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(true)))
								)
								.or(
									bind("iv_not_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(false)))
								)
							)
							.cutoff$and(S1_TA6.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
							.cutoff$and(S1_TA6.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
							.cutoff$and(S1_TA1.sls_dt.gte(bind("sls_ret_dt_fr")))
							.cutoff$and(S1_TA1.sls_dt.lte(bind("sls_ret_dt_to")))
							.cutoff$and(S1_TA1.ac_ym.gte(bind("ac_ym_fr")))
							.cutoff$and(S1_TA1.ac_ym.lte(bind("ac_ym_to")))
							.cutoff$and(S1_TA1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_TA1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_TA1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_MA1.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S1_TA1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
							.cutoff$and(S1_TA2.sls_ret_schd_d_no.like(bind("sls_ret_schd_d_no")))
							.cutoff$and(S1_TA1.sls_act_no.like(bind("sls_act_no")))
							.cutoff$and(S1_TA2.sls_act_d_no.like(bind("sls_act_d_no")))
							.cutoff$and(S1_TA1.dlv_slip_no.like(bind("dlv_slip_no")))
							.and(
								bind("inc_ret_dscnt_flg").eq(value(true))
								.and(
									bracket(
										S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()))
										.and(S1_MA30.sls_rtn_flg.eq(value(true)))
										.and(S1_MA30.sls_dscnt_flg.eq(value(true)))
									)
									.or(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
								.or(
									bind("inc_ret_dscnt_flg").eq(value(false))
									.and(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
							)
							.cutoff$and(S1_TA2.dlv_cd.like(bind("dlv_cd")))
							.cutoff$and(
								nvl(
									S1_TA2.dlv_nm,
									S1_MA12.bp_nm
								).like(bind("dlv_nm"))
							)
							.cutoff$and(S1_TA2.dest_cd1.like(bind("dest_cd1")))
							.cutoff$and(S1_MA14.bp_nm.like(bind("dest_nm1")))
							.cutoff$and(S1_TA2.dest_cd2.like(bind("dest_cd2")))
							.cutoff$and(S1_MA15.bp_nm.like(bind("dest_nm2")))
							.cutoff$and(S1_TA2.dest_cd3.like(bind("dest_cd3")))
							.cutoff$and(S1_MA16.bp_nm.like(bind("dest_nm3")))
							.cutoff$and(S1_TA1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_MA2.bp_nm.like(bind("cst_nm")))
							.cutoff$and(S1_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_MA4.cur_nm.like(bind("trd_cur_nm")))
							.cutoff$and(S1_TA1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_MA26.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_MA27.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_MA26.wg_cd.like(bind("loc_wg_cd")))
							.cutoff$and(S1_MA28.wg_nm.like(bind("loc_wg_nm")))
							.cutoff$and(S1_TA2.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_MA26.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_TA2.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_MA29.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1_MA18.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_MA18.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_MA18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_TA2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_TA2.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_TA2.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_TA2.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_TA2.itm_nm,
									S1_MA17.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_TA2.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_TA2.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_TA8.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_TA2.sno1.like(bind("sno1")))
							.cutoff$and(S1_TA2.sno2.like(bind("sno2")))
							.cutoff$and(S1_TA2.sno3.like(bind("sno3")))
							.cutoff$and(S1_TA2.sno4.like(bind("sno4")))
							.cutoff$and(S1_TA2.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_TA5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_TA2.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S1_TA2.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S1_TA2.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_MA25.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_TA2.rsn_cd.like(bind("ret_rsn_cd")))
							.cutoff$and(S1_MA30.biz_rsn_nm.like(bind("ret_rsn_nm")))
							.cutoff$and(S1_TA1.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_TA2.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S1_TA1.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_MA7.usr_nm.like(bind("sls_usr_nm")))
							.cutoff$and(S1_TA1.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_MA8.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(S1_TA1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_MA9.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_TA1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_TA1.intr_rmrks.like(bind("act_intr_rmrks")))
							.cutoff$and(S1_TA2.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_TA2.intr_rmrks.like(bind("act_d_intr_rmrks")))
							.cutoff$and(S1_TA1.sub_char1.like(bind("act_sub_char1")))
							.cutoff$and(S1_TA1.sub_char2.like(bind("act_sub_char2")))
							.cutoff$and(S1_TA1.sub_char3.like(bind("act_sub_char3")))
							.cutoff$and(S1_TA2.sub_char1.like(bind("act_d_sub_char1")))
							.cutoff$and(S1_TA2.sub_char2.like(bind("act_d_sub_char2")))
							.cutoff$and(S1_TA2.sub_char3.like(bind("act_d_sub_char3")))
							.and(
								bind("inc_can_flg").eq(value(false))
								.and(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.or(bind("inc_can_flg").eq(value(true)))
								.and(
									S1_TA1.slip_sts_typ.in(
										value(MAC_SLIP_STS_TYP.CRT.value()),
										value(MAC_SLIP_STS_TYP.DIS.value())
									)
								)
							)
							.cutoff$and(S1_TA6.intr_rmrks.like(bind("schd_intr_rmrks")))
							.cutoff$and(S1_TA6.sub_char1.like(bind("schd_sub_char1")))
							.cutoff$and(S1_TA6.sub_char2.like(bind("schd_sub_char2")))
							.cutoff$and(S1_TA6.sub_char3.like(bind("schd_sub_char3")))
							.cutoff$and(S1_TA7.intr_rmrks.like(bind("schd_d_intr_rmrks")))
							.cutoff$and(S1_TA7.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
							.cutoff$and(S1_TA7.sub_char1.like(bind("schd_d_sub_char1")))
							.cutoff$and(S1_TA7.sub_char2.like(bind("schd_d_sub_char2")))
							.cutoff$and(S1_TA7.sub_char3.like(bind("schd_d_sub_char3")))
						).view(S0_V1)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_V1.pr(S1_TA1.sls_act_no).asc(),
						S0_V1.pr(S1_TA2.disp_seq).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_V1.pr("sret_fr_cd").eq(S0_M1.bp_cd))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_V1.pr(S1_TA1.cst_cd).eq(S0_M2.bp_cd))),
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_V1.pr(S1_TA2.itm_cd).eq(S0_M3.itm_cd).and(S0_V1.pr(S1_TA2.itm_sub1).eq(S0_M3.itm_sub1)).and(S0_V1.pr(S1_TA2.itm_sub2).eq(S0_M3.itm_sub2)).and(S0_V1.pr(S1_TA2.itm_sub3).eq(S0_M3.itm_sub3)))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM11.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M1.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM12.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M1.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM13.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M1.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM14.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M1.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM15.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M1.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM16.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M1.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM17.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M1.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM18.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M1.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM19.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M1.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM110.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M1.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM21.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M2.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM22.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M2.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM23.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M2.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM24.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M2.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM25.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M2.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM26.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M2.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM27.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M2.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM28.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M2.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM29.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M2.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM210.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M2.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd1.as("itm_grp_cd1"), S0_MM31.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M3.itm_grp_cd1.eq(S0_MM31.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM31.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM31.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd2.as("itm_grp_cd2"), S0_MM32.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M3.itm_grp_cd2.eq(S0_MM32.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM32.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM32.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd3.as("itm_grp_cd3"), S0_MM33.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M3.itm_grp_cd3.eq(S0_MM33.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM33.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM33.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd4.as("itm_grp_cd4"), S0_MM34.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M3.itm_grp_cd4.eq(S0_MM34.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM34.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM34.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd5.as("itm_grp_cd5"), S0_MM35.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M3.itm_grp_cd5.eq(S0_MM35.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM35.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM35.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd6.as("itm_grp_cd6"), S0_MM36.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M3.itm_grp_cd6.eq(S0_MM36.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM36.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM36.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd7.as("itm_grp_cd7"), S0_MM37.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M3.itm_grp_cd7.eq(S0_MM37.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM37.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM37.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd8.as("itm_grp_cd8"), S0_MM38.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M3.itm_grp_cd8.eq(S0_MM38.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM38.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM38.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd9.as("itm_grp_cd9"), S0_MM39.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M3.itm_grp_cd9.eq(S0_MM39.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM39.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM39.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd10.as("itm_grp_cd10"), S0_MM310.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M3.itm_grp_cd10.eq(S0_MM310.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM310.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM310.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL1350_MST_SLS_ACT_Query_S03
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_ACT_S03() {
		MCDynamicSQLID DX1D = createDynamicSQLID("DX1D");
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_ITM_GRP_R S0_MM31 = MAM_ITM_GRP_R.create("MM31");
		MAM_ITM_GRP_R S0_MM32 = MAM_ITM_GRP_R.create("MM32");
		MAM_ITM_GRP_R S0_MM33 = MAM_ITM_GRP_R.create("MM33");
		MAM_ITM_GRP_R S0_MM34 = MAM_ITM_GRP_R.create("MM34");
		MAM_ITM_GRP_R S0_MM35 = MAM_ITM_GRP_R.create("MM35");
		MAM_ITM_GRP_R S0_MM36 = MAM_ITM_GRP_R.create("MM36");
		MAM_ITM_GRP_R S0_MM37 = MAM_ITM_GRP_R.create("MM37");
		MAM_ITM_GRP_R S0_MM38 = MAM_ITM_GRP_R.create("MM38");
		MAM_ITM_GRP_R S0_MM39 = MAM_ITM_GRP_R.create("MM39");
		MAM_ITM_GRP_R S0_MM310 = MAM_ITM_GRP_R.create("MM310");
		MST_SLS_ACT_R S1_TA1 = MST_SLS_ACT_R.create("TA1");
		MST_SLS_ACT_D_R S1_TA2 = MST_SLS_ACT_D_R.create("TA2");
		MST_SLS_ACT_IO_R S1_TA3 = MST_SLS_ACT_IO_R.create("TA3");
		MST_ARR_ACT_R S1_TA4 = MST_ARR_ACT_R.create("TA4");
		MST_WRK_R S1_TA5 = MST_WRK_R.create("TA5");
		MST_SLS_RET_SCHD_R S1_TA6 = MST_SLS_RET_SCHD_R.create("TA6");
		MST_SLS_RET_SCHD_D_R S1_TA7 = MST_SLS_RET_SCHD_D_R.create("TA7");
		MST_LOT_R S1_TA8 = MST_LOT_R.create("TA8");
		MST_PURC_RET_ACT_D_R S1_TA9 = MST_PURC_RET_ACT_D_R.create("TA9");
		MST_PURC_RET_ACT_R S1_TA10 = MST_PURC_RET_ACT_R.create("TA10");
		MST_PURC_ACT_R S1_TA11 = MST_PURC_ACT_R.create("TA11");
		MST_PURC_ACT_D_R S1_TA12 = MST_PURC_ACT_D_R.create("TA12");
		MAM_TRD_R S1_MA1 = MAM_TRD_R.create("MA1");
		MAM_BP_R S1_MA2 = MAM_BP_R.create("MA2");
		MAM_BP_R S1_MA3 = MAM_BP_R.create("MA3");
		MAM_CUR_R S1_MA4 = MAM_CUR_R.create("MA4");
		MAM_CUR_R S1_MA5 = MAM_CUR_R.create("MA5");
		MAM_CUR_R S1_MA6 = MAM_CUR_R.create("MA6");
		MAM_USR_R S1_MA7 = MAM_USR_R.create("MA7");
		MAM_DPT_R S1_MA8 = MAM_DPT_R.create("MA8");
		MAM_WG_R S1_MA9 = MAM_WG_R.create("MA9");
		MAM_DPT_R S1_MA10 = MAM_DPT_R.create("MA10");
		MAM_BIZ_RSN_R S1_MA11 = MAM_BIZ_RSN_R.create("MA11");
		MAM_BP_R S1_MA12 = MAM_BP_R.create("MA12");
		MAM_CNTRY_R S1_MA13 = MAM_CNTRY_R.create("MA13");
		MAM_BP_R S1_MA14 = MAM_BP_R.create("MA14");
		MAM_BP_R S1_MA15 = MAM_BP_R.create("MA15");
		MAM_BP_R S1_MA16 = MAM_BP_R.create("MA16");
		MAM_ITM_R S1_MA17 = MAM_ITM_R.create("MA17");
		MAM_ITM_TYP_D_R S1_MA18 = MAM_ITM_TYP_D_R.create("MA18");
		MAM_ITM_LCL_R S1_MA19 = MAM_ITM_LCL_R.create("MA19");
		MAM_ITM_LCL_R S1_MA20 = MAM_ITM_LCL_R.create("MA20");
		MAM_CNTRY_R S1_MA21 = MAM_CNTRY_R.create("MA21");
		MAM_UNIT_R S1_MA22 = MAM_UNIT_R.create("MA22");
		MAM_UNIT_R S1_MA23 = MAM_UNIT_R.create("MA23");
		MAM_TAX_R S1_MA24 = MAM_TAX_R.create("MA24");
		MAM_STK_GD_R S1_MA25 = MAM_STK_GD_R.create("MA25");
		MAM_LOC_R S1_MA26 = MAM_LOC_R.create("MA26");
		MAM_SITE_R S1_MA27 = MAM_SITE_R.create("MA27");
		MAM_WG_R S1_MA28 = MAM_WG_R.create("MA28");
		MAM_STR_LN_R S1_MA29 = MAM_STR_LN_R.create("MA29");
		MAM_BIZ_RSN_R S1_MA30 = MAM_BIZ_RSN_R.create("MA30");
		MAM_DPT_R S1_MA31 = MAM_DPT_R.create("MA31");
		MAVM_RD_DPT_R S1_VA1 = MAVM_RD_DPT_R.create("VA1");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_V1.pr(S1_TA1.trd_cd),
						S0_V1.pr(S1_MA1.trd_nm),
						S0_V1.pr(S1_TA1.trd_ptn_typ),
						S0_V1.pr(S1_TA1.sls_ret_schd_no),
						S0_V1.pr(S1_TA2.sls_ret_schd_d_no),
						S0_V1.pr(S1_TA6.sls_ret_schd_dt),
						S0_V1.pr(S1_TA3.arr_act_no),
						S0_V1.pr(S1_TA1.sls_act_no),
						S0_V1.pr(S1_TA1.sls_act_rev),
						S0_V1.pr(S1_TA2.sls_act_d_no),
						S0_V1.pr(S1_TA3.sls_act_io_no),
						S0_V1.pr(S1_TA1.sls_dt),
						S0_V1.pr(S1_TA1.ac_ym),
						S0_V1.pr(S1_TA1.ac_dt),
						S0_V1.pr(S1_TA1.dlv_slip_no),
						S0_V1.pr(S1_TA1.bill_basis_dt),
						S0_V1.pr(S1_TA1.rcv_schd_dt),
						S0_V1.pr(S1_TA1.cst_po_no),
						S0_V1.pr(S1_TA1.cst_cd),
						S0_V1.pr("cst_nm"),
						S0_V1.pr(S1_TA1.acst_cd),
						S0_V1.pr("acst_nm"),
						S0_V1.pr(S1_TA1.trd_cur_cd),
						S0_V1.pr("trd_cur_nm"),
						S0_V1.pr(S1_TA1.base_cur_cd),
						S0_V1.pr("base_cur_nm"),
						S0_V1.pr(S1_TA6.xrate_inpt_flg),
						S0_V1.pr(S1_TA1.xrate),
						S0_V1.pr(S1_TA1.ptax_cur_cd),
						S0_V1.pr("ptax_cur_nm"),
						S0_V1.pr(S1_TA6.ptax_xrate_inpt_flg),
						S0_V1.pr(S1_TA1.ptax_xrate),
						S0_V1.pr(S1_TA1.sls_usr_cd),
						S0_V1.pr("sls_usr_nm"),
						S0_V1.pr(S1_TA1.sls_dpt_cd),
						S0_V1.pr("sls_dpt_nm"),
						S0_V1.pr(S1_TA1.wg_cd),
						S0_V1.pr(S1_MA9.wg_nm),
						S0_V1.pr(S1_TA1.iv_no),
						S0_V1.pr(S1_TA1.ref_iv_no),
						S0_V1.pr(S1_TA1.ar_dpt_cd),
						S0_V1.pr("ar_dpt_nm"),
						S0_V1.pr(S1_TA1.trd_rmrks),
						S0_V1.pr("schd_intr_rmrks"),
						S0_V1.pr("act_intr_rmrks"),
						S0_V1.pr("schd_sub_char1"),
						S0_V1.pr("schd_sub_char2"),
						S0_V1.pr("schd_sub_char3"),
						S0_V1.pr("act_sub_char1"),
						S0_V1.pr("act_sub_char2"),
						S0_V1.pr("act_sub_char3"),
						S0_V1.pr(S1_TA3.sync_flg),
						S0_V1.pr("sret_fr_cd"),
						S0_V1.pr("sret_fr_nm"),
						S0_V1.pr("sret_fr_sundry_flg"),
						S0_V1.pr("sret_fr_zip_cd"),
						S0_V1.pr("sret_fr_addr1"),
						S0_V1.pr("sret_fr_addr2"),
						S0_V1.pr("sret_fr_addr3"),
						S0_V1.pr("sret_fr_addr4"),
						S0_V1.pr("sret_fr_cntct_dpt"),
						S0_V1.pr("sret_fr_cntct_psn"),
						S0_V1.pr("sret_fr_tel"),
						S0_V1.pr("sret_fr_fax"),
						S0_V1.pr(S1_MA12.cntry_cd),
						S0_V1.pr(S1_MA13.cntry_nm),
						S0_V1.pr(S1_TA2.pri_prnt_flg),
						S0_V1.pr(S1_TA2.dest_cd1),
						S0_V1.pr("dest_nm1"),
						S0_V1.pr(S1_TA2.dest_cd2),
						S0_V1.pr("dest_nm2"),
						S0_V1.pr(S1_TA2.dest_cd3),
						S0_V1.pr("dest_nm3"),
						S0_V1.pr(S1_MA17.itm_typ),
						S0_V1.pr(S1_MA17.itm_typ_d_cd),
						S0_V1.pr(S1_MA18.itm_typ_d_nm),
						S0_V1.pr(S1_TA2.itm_cd),
						S0_V1.pr(S1_TA2.itm_sub1),
						S0_V1.pr(S1_TA2.itm_sub2),
						S0_V1.pr(S1_TA2.itm_sub3),
						S0_V1.pr("itm_nm"),
						S0_V1.pr("iv_itm_nm"),
						S0_V1.pr(S1_MA17.asset_mng_typ),
						S0_V1.pr(S1_TA2.sundry_itm_flg),
						S0_V1.pr(S1_TA2.cntry_org_cd),
						S0_V1.pr("cntry_org_nm"),
						S0_V1.pr(S1_TA3.trd_unit_qty),
						S0_V1.pr(S1_TA3.trd_unit_cd),
						S0_V1.pr("trd_unit_nm"),
						S0_V1.pr(S1_TA3.base_unit_cd),
						S0_V1.pr("base_unit_nm"),
						S0_V1.pr(S1_TA3.base_unit_qty),
						S0_V1.pr(S1_TA2.dscnt_rsn_cd),
						S0_V1.pr("dscnt_rsn_nm"),
						S0_V1.pr("tax_fix_flg"),
						S0_V1.pr(S1_TA2.tax_cd),
						S0_V1.pr(S1_MA24.tax_nm),
						S0_V1.pr(S1_MA24.tax_rate),
						S0_V1.pr(S1_TA3.gd_cd),
						S0_V1.pr(S1_MA25.gd_nm),
						S0_V1.pr("cnsgn_gd_cd"),
						S0_V1.pr("cnsgn_gd_nm"),
						S0_V1.pr(S1_TA3.sno1),
						S0_V1.pr(S1_TA3.sno2),
						S0_V1.pr(S1_TA3.sno3),
						S0_V1.pr(S1_TA3.sno4),
						S0_V1.pr(S1_TA2.wrk_no),
						S0_V1.pr(S1_TA5.wrk_nm),
						S0_V1.pr(S1_MA26.site_cd),
						S0_V1.pr(S1_MA27.site_nm),
						S0_V1.pr("loc_wg_cd"),
						S0_V1.pr("loc_wg_nm"),
						S0_V1.pr(S1_TA3.loc_cd),
						S0_V1.pr(S1_MA26.loc_nm),
						S0_V1.pr(S1_TA3.str_ln_cd),
						S0_V1.pr(S1_MA29.str_ln_nm),
						S0_V1.pr(S1_TA3.lot_no),
						S0_V1.pr(S1_TA3.sublot_no),
						S0_V1.pr(S1_MA17.ver_flg),
						S0_V1.pr("ver_no"),
						S0_V1.pr("vmi_flg"),
						S0_V1.pr(S1_TA2.cst_po_d_no),
						S0_V1.pr(S1_TA2.cst_itm_cd),
						S0_V1.pr(S1_TA2.cst_itm_nm),
						S0_V1.pr("ret_rsn_cd"),
						S0_V1.pr("ret_rsn_nm"),
						S0_V1.pr(S1_TA2.bd_dpt_cd),
						S0_V1.pr("bd_dpt_nm"),
						S0_V1.pr(S1_TA2.wtax_rate),
						S0_V1.pr(S1_TA2.bill_crryovr_times),
						S0_V1.pr(S1_TA2.trd_d_rmrks),
						S0_V1.pr("schd_d_intr_rmrks"),
						S0_V1.pr("act_d_intr_rmrks"),
						S0_V1.pr(S1_TA7.arr_cnt_rmrks),
						S0_V1.pr("schd_d_sub_char1"),
						S0_V1.pr("schd_d_sub_char2"),
						S0_V1.pr("schd_d_sub_char3"),
						S0_V1.pr("act_d_sub_char1"),
						S0_V1.pr("act_d_sub_char2"),
						S0_V1.pr("act_d_sub_char3"),
						S0_V1.pr("act_io_sub_char1"),
						S0_V1.pr("act_io_sub_char2"),
						S0_V1.pr("act_io_sub_char3"),
						S0_V1.pr(S1_TA2.ref_sls_act_no),
						S0_V1.pr(S1_TA2.ref_sls_act_d_no),
						S0_V1.pr(S1_TA2.base_sls_ac_dt),
						S0_V1.pr(S1_TA10.purc_ret_act_no),
						S0_V1.pr(S1_TA9.purc_ret_act_d_no),
						S0_V1.pr(S1_TA12.base_purc_ac_dt),
						S0_V1.pr(S1_TA2.disp_seq),
						S0_V1.pr("can_flg"),
						S0_V1.pr(S1_TA3.ins_usr_id),
						S0_V1.pr(S1_TA3.ins_usr_nm),
						S0_V1.pr(S1_TA3.ins_func_id),
						S0_V1.pr(S1_TA3.ins_ts),
						S0_V1.pr(S1_TA3.upd_usr_id),
						S0_V1.pr(S1_TA3.upd_usr_nm),
						S0_V1.pr(S1_TA3.upd_func_id),
						S0_V1.pr(S1_TA3.upd_ts),
						S0_V1.pr(S1_TA3.upd_srv_req_no),
						S0_V1.pr(S1_TA3.upd_cntr),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_TA1.trd_cd,
							S1_MA1.trd_nm,
							S1_TA1.trd_ptn_typ,
							S1_TA1.sls_ret_schd_no,
							S1_TA2.sls_ret_schd_d_no,
							S1_TA6.sls_ret_schd_dt,
							S1_TA3.arr_act_no,
							S1_TA1.sls_act_no,
							S1_TA1.sls_act_rev,
							S1_TA2.sls_act_d_no,
							S1_TA3.sls_act_io_no,
							S1_TA1.sls_dt,
							S1_TA1.ac_ym,
							S1_TA1.ac_dt,
							S1_TA1.dlv_slip_no,
							S1_TA1.bill_basis_dt,
							S1_TA1.rcv_schd_dt,
							S1_TA1.cst_po_no,
							S1_TA1.cst_cd,
							S1_MA2.bp_nm.as("cst_nm"),
							S1_TA1.acst_cd,
							S1_MA3.bp_nm.as("acst_nm"),
							S1_TA1.trd_cur_cd,
							S1_MA4.cur_nm.as("trd_cur_nm"),
							S1_TA1.base_cur_cd,
							S1_MA5.cur_nm.as("base_cur_nm"),
							S1_TA6.xrate_inpt_flg,
							S1_TA1.xrate,
							S1_TA1.ptax_cur_cd,
							S1_MA6.cur_nm.as("ptax_cur_nm"),
							S1_TA6.ptax_xrate_inpt_flg,
							S1_TA1.ptax_xrate,
							S1_TA1.sls_usr_cd,
							S1_MA7.usr_nm.as("sls_usr_nm"),
							S1_TA1.sls_dpt_cd,
							S1_MA8.dpt_nm.as("sls_dpt_nm"),
							S1_TA1.wg_cd,
							S1_MA9.wg_nm,
							S1_TA1.iv_no,
							S1_TA1.ref_iv_no,
							S1_TA1.ar_dpt_cd,
							S1_MA10.dpt_nm.as("ar_dpt_nm"),
							S1_TA1.trd_rmrks,
							S1_TA6.intr_rmrks.as("schd_intr_rmrks"),
							S1_TA1.intr_rmrks.as("act_intr_rmrks"),
							S1_TA6.sub_char1.as("schd_sub_char1"),
							S1_TA6.sub_char2.as("schd_sub_char2"),
							S1_TA6.sub_char3.as("schd_sub_char3"),
							S1_TA1.sub_char1.as("act_sub_char1"),
							S1_TA1.sub_char2.as("act_sub_char2"),
							S1_TA1.sub_char3.as("act_sub_char3"),
							S1_TA3.sync_flg,
							S1_TA2.dlv_cd.as("sret_fr_cd"),
							nvl(
								S1_TA2.dlv_nm,
								S1_MA12.bp_nm
							).as("sret_fr_nm"),
							S1_TA2.dlv_sundry_flg.as("sret_fr_sundry_flg"),
							S1_TA2.dlv_zip_cd.as("sret_fr_zip_cd"),
							S1_TA2.dlv_addr1.as("sret_fr_addr1"),
							S1_TA2.dlv_addr2.as("sret_fr_addr2"),
							S1_TA2.dlv_addr3.as("sret_fr_addr3"),
							S1_TA2.dlv_addr4.as("sret_fr_addr4"),
							S1_TA2.dlv_cntct_dpt.as("sret_fr_cntct_dpt"),
							S1_TA2.dlv_cntct_psn.as("sret_fr_cntct_psn"),
							S1_TA2.dlv_tel.as("sret_fr_tel"),
							S1_TA2.dlv_fax.as("sret_fr_fax"),
							S1_MA12.cntry_cd,
							S1_MA13.cntry_nm,
							S1_TA2.pri_prnt_flg,
							S1_TA2.dest_cd1,
							S1_MA14.bp_nm.as("dest_nm1"),
							S1_TA2.dest_cd2,
							S1_MA15.bp_nm.as("dest_nm2"),
							S1_TA2.dest_cd3,
							S1_MA16.bp_nm.as("dest_nm3"),
							S1_MA17.itm_typ,
							S1_MA17.itm_typ_d_cd,
							S1_MA18.itm_typ_d_nm,
							S1_TA2.itm_cd,
							S1_TA2.itm_sub1,
							S1_TA2.itm_sub2,
							S1_TA2.itm_sub3,
							nvl(
								S1_TA2.itm_nm,
								S1_MA17.itm_nm
							).as("itm_nm"),
							cases()
								.when(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									.then(
										decode(
											S1_TA2.sundry_itm_flg,
											value(true),
											S1_TA2.iv_itm_nm,
											S1_MA19.itm_nm
										)
								)
								.when(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_DSCNT.value())))
									.then(
										decode(
											S1_TA2.sundry_itm_flg,
											value(true),
											S1_TA2.iv_itm_nm,
											S1_MA20.itm_nm
										)
								)
								.otherwise(S1_MA17.itm_nm).as("iv_itm_nm"),
							S1_MA17.asset_mng_typ,
							S1_TA2.sundry_itm_flg,
							S1_TA2.cntry_org_cd,
							S1_MA21.cntry_nm.as("cntry_org_nm"),
							S1_TA3.trd_unit_qty,
							S1_TA3.trd_unit_cd,
							S1_MA22.unit_nm.as("trd_unit_nm"),
							S1_TA3.base_unit_cd,
							S1_MA23.unit_nm.as("base_unit_nm"),
							S1_TA3.base_unit_qty,
							S1_TA2.dscnt_rsn_cd,
							S1_MA11.biz_rsn_nm.as("dscnt_rsn_nm"),
							value(false).as("tax_fix_flg"),
							S1_TA2.tax_cd,
							S1_MA24.tax_nm,
							S1_MA24.tax_rate,
							S1_TA3.gd_cd,
							S1_MA25.gd_nm,
							nullValue().as("cnsgn_gd_cd"),
							nullValue().as("cnsgn_gd_nm"),
							S1_TA3.sno1,
							S1_TA3.sno2,
							S1_TA3.sno3,
							S1_TA3.sno4,
							S1_TA2.wrk_no,
							S1_TA5.wrk_nm,
							S1_MA26.site_cd,
							S1_MA27.site_nm,
							S1_MA26.wg_cd.as("loc_wg_cd"),
							S1_MA28.wg_nm.as("loc_wg_nm"),
							S1_TA3.loc_cd,
							S1_MA26.loc_nm,
							S1_TA3.str_ln_cd,
							S1_MA29.str_ln_nm,
							S1_TA3.lot_no,
							S1_TA3.sublot_no,
							S1_MA17.ver_flg,
							decode(
								S1_MA17.ver_flg,
								value(true),
								S1_TA8.ver_no,
								nullValue()
							).as("ver_no"),
							value(false).as("vmi_flg"),
							S1_TA2.cst_po_d_no,
							S1_TA2.cst_itm_cd,
							S1_TA2.cst_itm_nm,
							S1_TA2.rsn_cd.as("ret_rsn_cd"),
							S1_MA30.biz_rsn_nm.as("ret_rsn_nm"),
							S1_TA2.bd_dpt_cd,
							S1_MA31.dpt_nm.as("bd_dpt_nm"),
							S1_TA2.wtax_rate,
							S1_TA2.bill_crryovr_times,
							S1_TA2.trd_d_rmrks,
							S1_TA7.intr_rmrks.as("schd_d_intr_rmrks"),
							S1_TA2.intr_rmrks.as("act_d_intr_rmrks"),
							S1_TA7.arr_cnt_rmrks,
							S1_TA7.sub_char1.as("schd_d_sub_char1"),
							S1_TA7.sub_char2.as("schd_d_sub_char2"),
							S1_TA7.sub_char3.as("schd_d_sub_char3"),
							S1_TA2.sub_char1.as("act_d_sub_char1"),
							S1_TA2.sub_char2.as("act_d_sub_char2"),
							S1_TA2.sub_char3.as("act_d_sub_char3"),
							S1_TA3.sub_char1.as("act_io_sub_char1"),
							S1_TA3.sub_char2.as("act_io_sub_char2"),
							S1_TA3.sub_char3.as("act_io_sub_char3"),
							S1_TA2.ref_sls_act_no,
							S1_TA2.ref_sls_act_d_no,
							S1_TA2.base_sls_ac_dt,
							S1_TA10.purc_ret_act_no,
							S1_TA9.purc_ret_act_d_no,
							S1_TA12.base_purc_ac_dt,
							S1_TA2.disp_seq,
							cases()
								.when(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
									.then(value(true))
								.otherwise(value(false)).as("can_flg"),
							S1_TA3.ins_usr_id,
							S1_TA3.ins_usr_nm,
							S1_TA3.ins_func_id,
							S1_TA3.ins_ts,
							S1_TA3.upd_usr_id,
							S1_TA3.upd_usr_nm,
							S1_TA3.upd_func_id,
							S1_TA3.upd_ts,
							S1_TA3.upd_srv_req_no,
							S1_TA3.upd_cntr
						)
						.from(
							S1_TA1
							.innerJoin(S1_TA2).on(
								S1_TA1.sls_act_no.eq(S1_TA2.sls_act_no)
								.and(S1_TA1.sls_act_seq.eq(S1_TA2.sls_act_seq))
							)
							.innerJoin(S1_TA3).on(
								S1_TA2.sls_act_d_no.eq(S1_TA3.sls_act_d_no)
								.and(S1_TA2.sls_act_d_seq.eq(S1_TA3.sls_act_d_seq))
							)
							.leftOuterJoin(S1_TA5).on(S1_TA2.wrk_no.eq(S1_TA5.wrk_no))
							.leftOuterJoin(S1_TA6).on(S1_TA1.sls_ret_schd_no.eq(S1_TA6.sls_ret_schd_no))
							.leftOuterJoin(S1_TA7).on(S1_TA2.sls_ret_schd_d_no.eq(S1_TA7.sls_ret_schd_d_no))
							.leftOuterJoin(S1_TA8).on(
								S1_TA2.itm_cd.eq(S1_TA8.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_TA8.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_TA8.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_TA8.itm_sub3))
								.and(S1_TA3.lot_no.eq(S1_TA8.lot_no))
								.and(S1_TA3.sublot_no.eq(S1_TA8.sublot_no))
							)
							.leftOuterJoin(S1_TA9).on(
								S1_TA2.sls_act_d_no.eq(S1_TA9.sls_act_d_no)
								.and(S1_TA9.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_TA10).on(
								S1_TA9.purc_ret_act_no.eq(S1_TA10.purc_ret_act_no)
								.and(S1_TA9.purc_ret_act_rev.eq(S1_TA10.purc_ret_act_rev))
								.and(S1_TA10.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_TA11).on(
								S1_TA9.purc_ret_act_no.eq(S1_TA11.purc_ret_act_no)
								.and(S1_TA11.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_TA12).on(
								S1_TA11.purc_act_no.eq(S1_TA12.purc_act_no)
								.and(S1_TA11.purc_act_seq.eq(S1_TA12.purc_act_seq))
								.and(S1_TA9.purc_ret_act_d_no.eq(S1_TA12.purc_ret_act_d_no))
							)
							.leftOuterJoin(S1_MA1).on(S1_TA1.trd_cd.eq(S1_MA1.trd_cd))
							.leftOuterJoin(S1_MA2).on(S1_TA1.cst_cd.eq(S1_MA2.bp_cd))
							.leftOuterJoin(S1_MA3).on(S1_TA1.acst_cd.eq(S1_MA3.bp_cd))
							.leftOuterJoin(S1_MA4).on(S1_TA1.trd_cur_cd.eq(S1_MA4.cur_cd))
							.leftOuterJoin(S1_MA5).on(S1_TA1.base_cur_cd.eq(S1_MA5.cur_cd))
							.leftOuterJoin(S1_MA6).on(S1_TA1.ptax_cur_cd.eq(S1_MA6.cur_cd))
							.leftOuterJoin(S1_MA7).on(S1_TA1.sls_usr_cd.eq(S1_MA7.usr_cd))
							.leftOuterJoin(S1_MA8).on(
								S1_TA1.sls_dpt_cd.eq(S1_MA8.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA8.st_dt, S1_MA8.end_dt))
							)
							.leftOuterJoin(S1_MA9).on(S1_TA1.wg_cd.eq(S1_MA9.wg_cd))
							.leftOuterJoin(S1_MA10).on(
								S1_TA1.ar_dpt_cd.eq(S1_MA10.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA10.st_dt, S1_MA10.end_dt))
							)
							.leftOuterJoin(S1_MA11).on(S1_TA2.dscnt_rsn_cd.eq(S1_MA11.biz_rsn_cd))
							.leftOuterJoin(S1_MA12).on(S1_TA2.dlv_cd.eq(S1_MA12.bp_cd))
							.leftOuterJoin(S1_MA13).on(S1_MA12.cntry_cd.eq(S1_MA13.cntry_cd))
							.leftOuterJoin(S1_MA14).on(S1_TA2.dest_cd1.eq(S1_MA14.bp_cd))
							.leftOuterJoin(S1_MA15).on(S1_TA2.dest_cd2.eq(S1_MA15.bp_cd))
							.leftOuterJoin(S1_MA16).on(S1_TA2.dest_cd3.eq(S1_MA16.bp_cd))
							.leftOuterJoin(S1_MA17).on(
								S1_TA2.itm_cd.eq(S1_MA17.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA17.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA17.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA17.itm_sub3))
							)
							.leftOuterJoin(S1_MA18).on(
								S1_MA17.itm_typ.eq(S1_MA18.itm_typ)
								.and(S1_MA17.itm_typ_d_cd.eq(S1_MA18.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_MA19).on(
								S1_TA2.itm_cd.eq(S1_MA19.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA19.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA19.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA19.itm_sub3))
								.and(S1_MA12.prnt_lcl_cd.eq(S1_MA19.lcl_cd))
							)
							.leftOuterJoin(S1_MA20).on(
								S1_TA2.itm_cd.eq(S1_MA20.itm_cd)
								.and(S1_TA2.itm_sub1.eq(S1_MA20.itm_sub1))
								.and(S1_TA2.itm_sub2.eq(S1_MA20.itm_sub2))
								.and(S1_TA2.itm_sub3.eq(S1_MA20.itm_sub3))
								.and(S1_MA2.prnt_lcl_cd.eq(S1_MA20.lcl_cd))
							)
							.leftOuterJoin(S1_MA21).on(S1_TA2.cntry_org_cd.eq(S1_MA21.cntry_cd))
							.leftOuterJoin(S1_MA22).on(S1_TA2.trd_unit_cd.eq(S1_MA22.unit_cd))
							.leftOuterJoin(S1_MA23).on(S1_TA2.base_unit_cd.eq(S1_MA23.unit_cd))
							.leftOuterJoin(S1_MA24).on(S1_TA2.tax_cd.eq(S1_MA24.tax_cd))
							.leftOuterJoin(S1_MA25).on(S1_TA3.gd_cd.eq(S1_MA25.gd_cd))
							.leftOuterJoin(S1_MA26).on(S1_TA3.loc_cd.eq(S1_MA26.loc_cd))
							.leftOuterJoin(S1_MA27).on(S1_MA26.site_cd.eq(S1_MA27.site_cd))
							.leftOuterJoin(S1_MA28).on(S1_MA26.wg_cd.eq(S1_MA28.wg_cd))
							.leftOuterJoin(S1_MA29).on(
								S1_TA3.str_ln_cd.eq(S1_MA29.str_ln_cd)
								.and(S1_TA3.loc_cd.eq(S1_MA29.loc_cd))
							)
							.leftOuterJoin(S1_MA30).on(S1_TA2.rsn_cd.eq(S1_MA30.biz_rsn_cd))
							.leftOuterJoin(S1_MA31).on(
								S1_TA2.bd_dpt_cd.eq(S1_MA31.dpt_cd)
								.and(S1_TA1.ac_dt.between(S1_MA31.st_dt, S1_MA31.end_dt))
							)
							.innerJoin(S1_VA1).on(S1_TA1.sls_dpt_cd.eq(S1_VA1.dpt_cd))
							.addDynamicView(DX1D)
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("iv_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(true)))
								)
								.or(
									bind("iv_not_trgt_flg").eq(value(true))
									.and(S1_MA2.cst_iv_flg.eq(value(false)))
								)
							)
							.cutoff$and(S1_TA6.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
							.cutoff$and(S1_TA6.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
							.cutoff$and(S1_TA1.sls_dt.gte(bind("sls_ret_dt_fr")))
							.cutoff$and(S1_TA1.sls_dt.lte(bind("sls_ret_dt_to")))
							.cutoff$and(S1_TA1.ac_ym.gte(bind("ac_ym_fr")))
							.cutoff$and(S1_TA1.ac_ym.lte(bind("ac_ym_to")))
							.cutoff$and(S1_TA1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_TA1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_TA1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_MA1.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S1_TA1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
							.cutoff$and(S1_TA2.sls_ret_schd_d_no.like(bind("sls_ret_schd_d_no")))
							.addDynamicPredicate(DX1D)
							.cutoff$and(S1_TA1.sls_act_no.like(bind("sls_act_no")))
							.cutoff$and(S1_TA2.sls_act_d_no.like(bind("sls_act_d_no")))
							.cutoff$and(S1_TA1.dlv_slip_no.like(bind("dlv_slip_no")))
							.and(
								bind("inc_ret_dscnt_flg").eq(value(true))
								.and(
									bracket(
										S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()))
										.and(S1_MA30.sls_rtn_flg.eq(value(true)))
										.and(S1_MA30.sls_dscnt_flg.eq(value(true)))
									)
									.or(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
								.or(
									bind("inc_ret_dscnt_flg").eq(value(false))
									.and(S1_TA1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
							)
							.cutoff$and(S1_TA2.dlv_cd.like(bind("dlv_cd")))
							.cutoff$and(
								nvl(
									S1_TA2.dlv_nm,
									S1_MA12.bp_nm
								).like(bind("dlv_nm"))
							)
							.cutoff$and(S1_TA2.dest_cd1.like(bind("dest_cd1")))
							.cutoff$and(S1_MA14.bp_nm.like(bind("dest_nm1")))
							.cutoff$and(S1_TA2.dest_cd2.like(bind("dest_cd2")))
							.cutoff$and(S1_MA15.bp_nm.like(bind("dest_nm2")))
							.cutoff$and(S1_TA2.dest_cd3.like(bind("dest_cd3")))
							.cutoff$and(S1_MA16.bp_nm.like(bind("dest_nm3")))
							.cutoff$and(S1_TA1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_MA2.bp_nm.like(bind("cst_nm")))
							.cutoff$and(S1_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_MA4.cur_nm.like(bind("trd_cur_nm")))
							.cutoff$and(S1_TA1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_MA26.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_MA27.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_MA26.wg_cd.like(bind("loc_wg_cd")))
							.cutoff$and(S1_MA28.wg_nm.like(bind("loc_wg_nm")))
							.cutoff$and(S1_TA3.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_MA26.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_TA3.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_MA29.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1_MA18.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_MA17.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_MA18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_TA2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_TA2.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_TA2.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_TA2.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_TA2.itm_nm,
									S1_MA17.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_TA3.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_TA3.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_TA8.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_TA3.sno1.like(bind("sno1")))
							.cutoff$and(S1_TA3.sno2.like(bind("sno2")))
							.cutoff$and(S1_TA3.sno3.like(bind("sno3")))
							.cutoff$and(S1_TA3.sno4.like(bind("sno4")))
							.cutoff$and(S1_TA2.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_TA5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_TA2.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S1_TA2.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S1_TA3.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_MA25.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_TA2.rsn_cd.like(bind("ret_rsn_cd")))
							.cutoff$and(S1_MA30.biz_rsn_nm.like(bind("ret_rsn_nm")))
							.cutoff$and(S1_TA1.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_TA2.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S1_TA1.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_MA7.usr_nm.like(bind("sls_usr_nm")))
							.cutoff$and(S1_TA1.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_MA8.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(S1_TA1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_MA9.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_TA1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_TA1.intr_rmrks.like(bind("act_intr_rmrks")))
							.cutoff$and(S1_TA2.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_TA2.intr_rmrks.like(bind("act_d_intr_rmrks")))
							.cutoff$and(S1_TA1.sub_char1.like(bind("act_sub_char1")))
							.cutoff$and(S1_TA1.sub_char2.like(bind("act_sub_char2")))
							.cutoff$and(S1_TA1.sub_char3.like(bind("act_sub_char3")))
							.cutoff$and(S1_TA2.sub_char1.like(bind("act_d_sub_char1")))
							.cutoff$and(S1_TA2.sub_char2.like(bind("act_d_sub_char2")))
							.cutoff$and(S1_TA2.sub_char3.like(bind("act_d_sub_char3")))
							.and(
								bind("inc_can_flg").eq(value(false))
								.and(S1_TA1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.or(bind("inc_can_flg").eq(value(true)))
								.and(
									S1_TA1.slip_sts_typ.in(
										value(MAC_SLIP_STS_TYP.CRT.value()),
										value(MAC_SLIP_STS_TYP.DIS.value())
									)
								)
							)
							.cutoff$and(S1_TA6.intr_rmrks.like(bind("schd_intr_rmrks")))
							.cutoff$and(S1_TA6.sub_char1.like(bind("schd_sub_char1")))
							.cutoff$and(S1_TA6.sub_char2.like(bind("schd_sub_char2")))
							.cutoff$and(S1_TA6.sub_char3.like(bind("schd_sub_char3")))
							.cutoff$and(S1_TA7.intr_rmrks.like(bind("schd_d_intr_rmrks")))
							.cutoff$and(S1_TA7.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
							.cutoff$and(S1_TA7.sub_char1.like(bind("schd_d_sub_char1")))
							.cutoff$and(S1_TA7.sub_char2.like(bind("schd_d_sub_char2")))
							.cutoff$and(S1_TA7.sub_char3.like(bind("schd_d_sub_char3")))
							.cutoff$and(S1_TA3.sub_char1.like(bind("act_io_sub_char1")))
							.cutoff$and(S1_TA3.sub_char2.like(bind("act_io_sub_char2")))
							.cutoff$and(S1_TA3.sub_char3.like(bind("act_io_sub_char3")))
						).view(S0_V1)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_V1.pr(S1_TA1.sls_act_no).asc(),
						S0_V1.pr(S1_TA2.disp_seq).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_V1.pr("sret_fr_cd").eq(S0_M1.bp_cd))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_V1.pr(S1_TA1.cst_cd).eq(S0_M2.bp_cd))),
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_V1.pr(S1_TA2.itm_cd).eq(S0_M3.itm_cd).and(S0_V1.pr(S1_TA2.itm_sub1).eq(S0_M3.itm_sub1)).and(S0_V1.pr(S1_TA2.itm_sub2).eq(S0_M3.itm_sub2)).and(S0_V1.pr(S1_TA2.itm_sub3).eq(S0_M3.itm_sub3)))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM11.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M1.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM12.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M1.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM13.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M1.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM14.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M1.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM15.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M1.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM16.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M1.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM17.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M1.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM18.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M1.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM19.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M1.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M1.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM110.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M1.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM21.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M2.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM22.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M2.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM23.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M2.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM24.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M2.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM25.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M2.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM26.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M2.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM27.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M2.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM28.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M2.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM29.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M2.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM210.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M2.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd1.as("itm_grp_cd1"), S0_MM31.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M3.itm_grp_cd1.eq(S0_MM31.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM31.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM31.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd2.as("itm_grp_cd2"), S0_MM32.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M3.itm_grp_cd2.eq(S0_MM32.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM32.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM32.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd3.as("itm_grp_cd3"), S0_MM33.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M3.itm_grp_cd3.eq(S0_MM33.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM33.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM33.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd4.as("itm_grp_cd4"), S0_MM34.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M3.itm_grp_cd4.eq(S0_MM34.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM34.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM34.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd5.as("itm_grp_cd5"), S0_MM35.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M3.itm_grp_cd5.eq(S0_MM35.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM35.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM35.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd6.as("itm_grp_cd6"), S0_MM36.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M3.itm_grp_cd6.eq(S0_MM36.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM36.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM36.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd7.as("itm_grp_cd7"), S0_MM37.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M3.itm_grp_cd7.eq(S0_MM37.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM37.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM37.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd8.as("itm_grp_cd8"), S0_MM38.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M3.itm_grp_cd8.eq(S0_MM38.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM38.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM38.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd9.as("itm_grp_cd9"), S0_MM39.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M3.itm_grp_cd9.eq(S0_MM39.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM39.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM39.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd10.as("itm_grp_cd10"), S0_MM310.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M3.itm_grp_cd10.eq(S0_MM310.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM310.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM310.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("arr_act_no"))
					.view(DX1D, v -> v.leftOuterJoin(S1_TA4).on(S1_TA3.arr_act_no.eq(S1_TA4.arr_act_no)))
					.predicate(DX1D, p -> p.cutoff$and(S1_TA4.arr_act_no.like(bind("arr_act_no"))))
			);
	}
	
	/**
	 * -- MSBBL1350_MST_SLS_RET_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_RET_SCHD_S01() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_USR_R S0_M5 = MAM_USR_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
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
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		
		MST_SLS_RET_SCHD_D_R S0_SLS_ACT_D = MST_SLS_RET_SCHD_D_R.create("S0_T3");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_SLS_RET_SCHD_D_TempView = createTempView("S0_T3_View");
		MCSingleView S0_SLS_RET_SCHD_D_View = subQuery().select(
				S0_SLS_ACT_D.sls_ret_schd_no,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_SLS_ACT_D.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_SLS_ACT_D.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_SLS_ACT_D.trd_cur_amt.add(S0_SLS_ACT_D.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
			)
			.from(
					S0_SLS_ACT_D
					.leftOuterJoin(itmR).on(
						bracket(
							S0_SLS_ACT_D.itm_cd.eq(itmR.itm_cd)
							.and(S0_SLS_ACT_D.itm_sub1.eq(itmR.itm_sub1))
							.and(S0_SLS_ACT_D.itm_sub2.eq(itmR.itm_sub2))
							.and(S0_SLS_ACT_D.itm_sub3.eq(itmR.itm_sub3))
						)
					)
			)
			.groupBy(
					S0_SLS_ACT_D.sls_ret_schd_no
			)
			.view(S0_SLS_RET_SCHD_D_TempView);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_RET_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.sls_ret_schd_no,
						S0_T1.sls_ret_schd_dt,
						S0_T1.cst_po_no,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_M2.acst_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M6.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.ar_dpt_cd,
						S0_M8.dpt_nm.as("ar_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T1.sync_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						S0_SLS_RET_SCHD_D_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M8.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M8.st_dt, S0_M8.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_SLS_RET_SCHD_D_View)
						.on(
							value(0).eq(value(0))
							.and(S0_SLS_RET_SCHD_D_TempView.pr(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_no).eq(S0_T1.sls_ret_schd_no))
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(true)))
							)
							.or(
								bind("not_sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
						.cutoff$and(S0_T1.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(S0_T1.sls_ret_schd_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.trd_cur_cd.eq(S0_M4.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.sls_usr_cd.eq(S0_M5.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.wg_cd.eq(S0_M7.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cst_grp_nm10"))))
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
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1350_MST_SLS_RET_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_RET_SCHD_S02() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MST_SLS_RET_SCHD_D_R S0_T2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_USR_R S0_M5 = MAM_USR_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_ITM_R S0_M14 = MAM_ITM_R.create("M14");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_ITM_LCL_R S0_M16 = MAM_ITM_LCL_R.create("M16");
		MAM_STK_GD_R S0_M22 = MAM_STK_GD_R.create("M22");
		MAM_LOC_R S0_M24 = MAM_LOC_R.create("M24");
		MAM_SITE_R S0_M25 = MAM_SITE_R.create("M25");
		MAM_WG_R S0_M26 = MAM_WG_R.create("M26");
		MAM_STR_LN_R S0_M27 = MAM_STR_LN_R.create("M27");
		MAM_BIZ_RSN_R S0_M28 = MAM_BIZ_RSN_R.create("M28");
		MAM_DPT_R S0_M29 = MAM_DPT_R.create("M29");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_ITM_GRP_R S0_MM31 = MAM_ITM_GRP_R.create("MM31");
		MAM_ITM_GRP_R S0_MM32 = MAM_ITM_GRP_R.create("MM32");
		MAM_ITM_GRP_R S0_MM33 = MAM_ITM_GRP_R.create("MM33");
		MAM_ITM_GRP_R S0_MM34 = MAM_ITM_GRP_R.create("MM34");
		MAM_ITM_GRP_R S0_MM35 = MAM_ITM_GRP_R.create("MM35");
		MAM_ITM_GRP_R S0_MM36 = MAM_ITM_GRP_R.create("MM36");
		MAM_ITM_GRP_R S0_MM37 = MAM_ITM_GRP_R.create("MM37");
		MAM_ITM_GRP_R S0_MM38 = MAM_ITM_GRP_R.create("MM38");
		MAM_ITM_GRP_R S0_MM39 = MAM_ITM_GRP_R.create("MM39");
		MAM_ITM_GRP_R S0_MM310 = MAM_ITM_GRP_R.create("MM310");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_RET_SCHD_Query_S02")
					.mainQuery()
					.select(
						cases()
							.when(
								S0_T3.arr_cmpl_flg.eq(value(false))
								.and(S0_T3.arr_qty.eq(value(0)))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.NON_ARR.value()))
							.when(
								S0_T3.arr_cmpl_flg.eq(value(false))
								.and(value(0).lt(S0_T3.arr_qty))
								.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
								.and(S0_T3.arr_qty.gt(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
								.and(S0_T2.abort_flg.eq(value(false)))
								.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR_NON_AC.value()))
							.when(
								bracket(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_T3.arr_qty))
										.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
										.and(S0_T3.arr_qty.eq(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_T3.arr_qty))
										.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
									)
								)
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR.value()))
							.when(
								bracket(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T2.cmpl_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T3.arr_qty.eq(value(0)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
								)
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL_ARR_NON_AC.value()))
							.when(S0_T2.cmpl_flg.eq(value(true)))
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL.value()))
							.otherwise(nullValue()).as("sret_schd_sts_typ"),
						S0_T2.abort_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.sls_ret_schd_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T1.sls_ret_schd_dt,
						S0_T1.cst_po_no,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_M2.acst_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M6.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.ar_dpt_cd,
						S0_M8.dpt_nm.as("ar_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T1.sync_flg,
						S0_T2.sret_fr_cd,
						nvl(
							S0_T2.sret_fr_nm,
							S0_M9.bp_nm
						).as("sret_fr_nm"),
						S0_T2.sret_fr_sundry_flg,
						S0_T2.sret_fr_zip_cd,
						S0_T2.sret_fr_addr1,
						S0_T2.sret_fr_addr2,
						S0_T2.sret_fr_addr3,
						S0_T2.sret_fr_addr4,
						S0_T2.sret_fr_cntct_dpt,
						S0_T2.sret_fr_cntct_psn,
						S0_T2.sret_fr_tel,
						S0_T2.sret_fr_fax,
						S0_M9.cntry_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_M14.itm_typ,
						S0_M14.itm_typ_d_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_M14.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T2.iv_itm_nm,
							nvl(
								S0_M16.itm_nm,
								S0_M14.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M14.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T3.arr_qty,
						S0_T3.sls_ret_qty,
						S0_T3.arr_cmpl_flg,
						S0_T2.trd_cur_upri,
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt.as("trd_cur_dscnt_amt"),
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.gd_cd,
						S0_T2.cnsgn_gd_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_M14.ver_flg,
						S0_T2.ver_no,
						S0_T2.vmi_flg,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.ret_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M29.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("schd_d_intr_rmrks"),
						S0_T2.arr_cnt_rmrks,
						S0_T2.sub_char1.as("schd_d_sub_char1"),
						S0_T2.sub_char2.as("schd_d_sub_char2"),
						S0_T2.sub_char3.as("schd_d_sub_char3"),
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_d_no,
						S0_T2.base_sls_ac_dt,
						S0_T2.disp_seq,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr,
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.sls_ret_schd_no.eq(S0_T2.sls_ret_schd_no))
						.innerJoin(S0_T3).on(S0_T2.sls_ret_schd_d_no.eq(S0_T3.sls_ret_schd_d_no))
						.leftOuterJoin(S0_M2).on(S0_T1.cst_cd.eq(S0_M2.bp_cd))
						.leftOuterJoin(S0_M6).on(
							S0_T1.sls_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
						.leftOuterJoin(S0_M8).on(
							S0_T1.ar_dpt_cd.eq(S0_M8.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M8.st_dt, S0_M8.end_dt))
						)
						.leftOuterJoin(S0_M9).on(S0_T2.sret_fr_cd.eq(S0_M9.bp_cd))
						.leftOuterJoin(S0_M14).on(
							S0_T2.itm_cd.eq(S0_M14.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M14.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M14.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M14.itm_sub3))
						)
						.leftOuterJoin(S0_M16).on(
							S0_T2.itm_cd.eq(S0_M16.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M16.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M16.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M16.itm_sub3))
							.and(S0_M9.prnt_lcl_cd.eq(S0_M16.lcl_cd))
						)
						.leftOuterJoin(S0_M29).on(
							S0_T2.bd_dpt_cd.eq(S0_M29.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M29.st_dt, S0_M29.end_dt))
						)
						.innerJoin(S0_V1).on(S0_T1.sls_dpt_cd.eq(S0_V1.dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("non_arr_flg").eq(value(true))
								.and(S0_T3.arr_cmpl_flg.eq(value(false)))
								.and(S0_T3.arr_qty.eq(value(0)))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("part_arr_non_ac_flg").eq(value(true))
								.and(
									S0_T3.arr_cmpl_flg.eq(value(false))
									.and(value(0).lt(S0_T3.arr_qty))
									.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
									.and(S0_T3.arr_qty.gt(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
									.and(S0_T2.abort_flg.eq(value(false)))
									.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
							)
							.or(
								bind("part_arr_flg").eq(value(true))
								.and(
									bracket(
										bracket(
											S0_T3.arr_cmpl_flg.eq(value(false))
											.and(value(0).lt(S0_T3.arr_qty))
											.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
											.and(S0_T3.arr_qty.eq(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
											.and(S0_T2.abort_flg.eq(value(false)))
											.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
										)
										.or(
											S0_T3.arr_cmpl_flg.eq(value(false))
											.and(value(0).lt(S0_T3.arr_qty))
											.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
											.and(S0_T2.abort_flg.eq(value(false)))
											.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
										)
									)
								)
							)
							.or(
								bind("cmpl_arr_non_ac_flg").eq(value(true))
								.and(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T2.cmpl_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T3.arr_qty.eq(value(0)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
								)
							)
							.or(
								bind("cmpl_flg").eq(value(true))
								.and(S0_T2.cmpl_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(true)))
							)
							.or(
								bind("not_sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("vmi_flg").eq(value(true))
								.and(S0_T2.vmi_flg.eq(value(true)))
							)
							.or(
								bind("not_vmi_flg").eq(value(true))
								.and(S0_T2.vmi_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
						.cutoff$and(S0_T1.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
						.cutoff$and(
							bracket(
								bind("inc_abort_flg_str").eq(value(false))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T2.sls_ret_schd_d_no.like(bind("sls_ret_schd_d_no")))
						.cutoff$and(S0_T2.sret_fr_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.sret_fr_nm,
								S0_M9.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T2.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M14.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M14.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M14.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.ret_rsn_cd.like(bind("ret_rsn_cd")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("schd_d_intr_rmrks")))
						.cutoff$and(S0_T2.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("schd_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("schd_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("schd_d_sub_char3")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.sls_ret_schd_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T2.sno1.eq(S0_T4.sno1)))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_T1.trd_cur_cd.eq(S0_M4.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.sls_usr_cd.eq(S0_M5.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.wg_cd.eq(S0_M7.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T2.dest_cd1.eq(S0_M11.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T2.dest_cd2.eq(S0_M12.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_T2.dest_cd3.eq(S0_M13.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_M14.itm_typ.eq(S0_M15.itm_typ).and(S0_M14.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T2.gd_cd.eq(S0_M22.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.gd_nm.like(bind("gd_nm")))),
				when(boundOr("site_nm", "loc_wg_nm", "site_cd", "loc_wg_cd", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_T2.loc_cd.eq(S0_M24.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M24.site_cd.like(bind("site_cd"))).cutoff$and(S0_M24.wg_cd.like(bind("loc_wg_cd"))).cutoff$and(S0_M24.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_M24.site_cd.eq(S0_M25.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(S0_M24.wg_cd.eq(S0_M26.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M26.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T2.str_ln_cd.eq(S0_M27.str_ln_cd).and(S0_T2.loc_cd.eq(S0_M27.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("ret_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M28).on(S0_T2.ret_rsn_cd.eq(S0_M28.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M28.biz_rsn_nm.like(bind("ret_rsn_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM11.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M9.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM12.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M9.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM13.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M9.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM14.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M9.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM15.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M9.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM16.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M9.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM17.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M9.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM18.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M9.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM19.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M9.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM110.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M9.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM21.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M2.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM22.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M2.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM23.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M2.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM24.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M2.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM25.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M2.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM26.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M2.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM27.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M2.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM28.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M2.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM29.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M2.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM210.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M2.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd1.as("itm_grp_cd1"), S0_MM31.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M14.itm_grp_cd1.eq(S0_MM31.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM31.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM31.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd2.as("itm_grp_cd2"), S0_MM32.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M14.itm_grp_cd2.eq(S0_MM32.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM32.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM32.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd3.as("itm_grp_cd3"), S0_MM33.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M14.itm_grp_cd3.eq(S0_MM33.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM33.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM33.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd4.as("itm_grp_cd4"), S0_MM34.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M14.itm_grp_cd4.eq(S0_MM34.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM34.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM34.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd5.as("itm_grp_cd5"), S0_MM35.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M14.itm_grp_cd5.eq(S0_MM35.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM35.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM35.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd6.as("itm_grp_cd6"), S0_MM36.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M14.itm_grp_cd6.eq(S0_MM36.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM36.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM36.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd7.as("itm_grp_cd7"), S0_MM37.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M14.itm_grp_cd7.eq(S0_MM37.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM37.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM37.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd8.as("itm_grp_cd8"), S0_MM38.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M14.itm_grp_cd8.eq(S0_MM38.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM38.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM38.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd9.as("itm_grp_cd9"), S0_MM39.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M14.itm_grp_cd9.eq(S0_MM39.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM39.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM39.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd10.as("itm_grp_cd10"), S0_MM310.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M14.itm_grp_cd10.eq(S0_MM310.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM310.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM310.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("cnsgn_gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("loc_wg_cd", m.wg_cd());
							r.setStringNE("loc_nm", m.loc_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1350_MST_SLS_RET_SCHD_Query_S03
	 */
	static MCQueryPlan MSBBL1350_MST_SLS_RET_SCHD_S03() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MST_SLS_RET_SCHD_D_R S0_T2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_USR_R S0_M5 = MAM_USR_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_ITM_R S0_M14 = MAM_ITM_R.create("M14");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_ITM_LCL_R S0_M16 = MAM_ITM_LCL_R.create("M16");
		MAM_STK_GD_R S0_M22 = MAM_STK_GD_R.create("M22");
		MAM_LOC_R S0_M24 = MAM_LOC_R.create("M24");
		MAM_SITE_R S0_M25 = MAM_SITE_R.create("M25");
		MAM_WG_R S0_M26 = MAM_WG_R.create("M26");
		MAM_STR_LN_R S0_M27 = MAM_STR_LN_R.create("M27");
		MAM_BIZ_RSN_R S0_M28 = MAM_BIZ_RSN_R.create("M28");
		MAM_DPT_R S0_M29 = MAM_DPT_R.create("M29");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_ITM_GRP_R S0_MM31 = MAM_ITM_GRP_R.create("MM31");
		MAM_ITM_GRP_R S0_MM32 = MAM_ITM_GRP_R.create("MM32");
		MAM_ITM_GRP_R S0_MM33 = MAM_ITM_GRP_R.create("MM33");
		MAM_ITM_GRP_R S0_MM34 = MAM_ITM_GRP_R.create("MM34");
		MAM_ITM_GRP_R S0_MM35 = MAM_ITM_GRP_R.create("MM35");
		MAM_ITM_GRP_R S0_MM36 = MAM_ITM_GRP_R.create("MM36");
		MAM_ITM_GRP_R S0_MM37 = MAM_ITM_GRP_R.create("MM37");
		MAM_ITM_GRP_R S0_MM38 = MAM_ITM_GRP_R.create("MM38");
		MAM_ITM_GRP_R S0_MM39 = MAM_ITM_GRP_R.create("MM39");
		MAM_ITM_GRP_R S0_MM310 = MAM_ITM_GRP_R.create("MM310");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1350_MST_SLS_RET_SCHD_Query_S03")
					.mainQuery()
					.select(
						cases()
							.when(
								S0_T3.arr_cmpl_flg.eq(value(false))
								.and(S0_T3.arr_qty.eq(value(0)))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.NON_ARR.value()))
							.when(
								S0_T3.arr_cmpl_flg.eq(value(false))
								.and(value(0).lt(S0_T3.arr_qty))
								.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
								.and(S0_T3.arr_qty.gt(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
								.and(S0_T2.abort_flg.eq(value(false)))
								.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR_NON_AC.value()))
							.when(
								bracket(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_T3.arr_qty))
										.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
										.and(S0_T3.arr_qty.eq(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_T3.arr_qty))
										.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
									)
								)
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR.value()))
							.when(
								bracket(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T2.cmpl_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T3.arr_qty.eq(value(0)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
								)
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL_ARR_NON_AC.value()))
							.when(S0_T2.cmpl_flg.eq(value(true)))
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL.value()))
							.otherwise(nullValue()).as("sret_schd_sts_typ"),
						S0_T2.abort_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.sls_ret_schd_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T1.sls_ret_schd_dt,
						S0_T1.cst_po_no,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_M2.acst_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M6.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.ar_dpt_cd,
						S0_M8.dpt_nm.as("ar_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T1.sync_flg,
						S0_T2.sret_fr_cd,
						nvl(
							S0_T2.sret_fr_nm,
							S0_M9.bp_nm
						).as("sret_fr_nm"),
						S0_T2.sret_fr_sundry_flg,
						S0_T2.sret_fr_zip_cd,
						S0_T2.sret_fr_addr1,
						S0_T2.sret_fr_addr2,
						S0_T2.sret_fr_addr3,
						S0_T2.sret_fr_addr4,
						S0_T2.sret_fr_cntct_dpt,
						S0_T2.sret_fr_cntct_psn,
						S0_T2.sret_fr_tel,
						S0_T2.sret_fr_fax,
						S0_M9.cntry_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_M14.itm_typ,
						S0_M14.itm_typ_d_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_M14.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T2.iv_itm_nm,
							nvl(
								S0_M16.itm_nm,
								S0_M14.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M14.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.cntry_org_cd,
						S0_T5.trd_unit_qty,
						S0_T5.trd_unit_cd,
						S0_T5.base_unit_cd,
						S0_T5.base_unit_qty,
						S0_T5.arr_qty,
						S0_T5.sls_ret_qty,
						S0_T5.cmpl_flg.as("arr_cmpl_flg"),
						S0_T2.dscnt_rsn_cd,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T5.gd_cd,
						S0_T5.ret_gd_cd.as("cnsgn_gd_cd"),
						S0_T5.sno1,
						S0_T5.sno2,
						S0_T5.sno3,
						S0_T5.sno4,
						S0_T5.arr_loc_cd.as("loc_cd"),
						S0_T5.str_ln_cd,
						S0_T5.lot_no,
						S0_T5.sublot_no,
						S0_T5.ver_no,
						S0_T2.vmi_flg,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.ret_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M29.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("schd_d_intr_rmrks"),
						S0_T2.arr_cnt_rmrks,
						S0_T2.sub_char1.as("schd_d_sub_char1"),
						S0_T2.sub_char2.as("schd_d_sub_char2"),
						S0_T2.sub_char3.as("schd_d_sub_char3"),
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_d_no,
						S0_T2.base_sls_ac_dt,
						S0_T5.sls_ret_qty.as("lst_sls_ret_qty"),
						S0_T5.gd_cd.as("lst_gd_cd"),
						S0_T2.disp_seq,
						S0_T5.ins_usr_id,
						S0_T5.ins_usr_nm,
						S0_T5.ins_func_id,
						S0_T5.ins_ts,
						S0_T5.upd_usr_id,
						S0_T5.upd_usr_nm,
						S0_T5.upd_func_id,
						S0_T5.upd_ts,
						S0_T5.upd_srv_req_no,
						S0_T5.upd_cntr,
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.sls_ret_schd_no.eq(S0_T2.sls_ret_schd_no))
						.innerJoin(S0_T3).on(S0_T2.sls_ret_schd_d_no.eq(S0_T3.sls_ret_schd_d_no))
						.innerJoin(S0_T5).on(S0_T3.arr_pr_no.eq(S0_T5.arr_pr_no))
						.leftOuterJoin(S0_M2).on(S0_T1.cst_cd.eq(S0_M2.bp_cd))
						.leftOuterJoin(S0_M6).on(
							S0_T1.sls_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
						.leftOuterJoin(S0_M8).on(
							S0_T1.ar_dpt_cd.eq(S0_M8.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M8.st_dt, S0_M8.end_dt))
						)
						.leftOuterJoin(S0_M9).on(S0_T2.sret_fr_cd.eq(S0_M9.bp_cd))
						.leftOuterJoin(S0_M14).on(
							S0_T2.itm_cd.eq(S0_M14.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M14.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M14.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M14.itm_sub3))
						)
						.leftOuterJoin(S0_M16).on(
							S0_T2.itm_cd.eq(S0_M16.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M16.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M16.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M16.itm_sub3))
							.and(S0_M9.prnt_lcl_cd.eq(S0_M16.lcl_cd))
						)
						.leftOuterJoin(S0_M29).on(
							S0_T2.bd_dpt_cd.eq(S0_M29.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M29.st_dt, S0_M29.end_dt))
						)
						.innerJoin(S0_V1).on(S0_T1.sls_dpt_cd.eq(S0_V1.dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("non_arr_flg").eq(value(true))
								.and(S0_T3.arr_cmpl_flg.eq(value(false)))
								.and(S0_T3.arr_qty.eq(value(0)))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("part_arr_non_ac_flg").eq(value(true))
								.and(
									S0_T3.arr_cmpl_flg.eq(value(false))
									.and(value(0).lt(S0_T3.arr_qty))
									.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
									.and(S0_T3.arr_qty.gt(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
									.and(S0_T2.abort_flg.eq(value(false)))
									.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
								)
							)
							.or(
								bind("part_arr_flg").eq(value(true))
								.and(
									bracket(
										bracket(
											S0_T3.arr_cmpl_flg.eq(value(false))
											.and(value(0).lt(S0_T3.arr_qty))
											.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
											.and(S0_T3.arr_qty.eq(S0_T3.sls_ret_qty.add(S0_T3.sls_ret_schd_abort_qty)))
											.and(S0_T2.abort_flg.eq(value(false)))
											.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
										)
										.or(
											S0_T3.arr_cmpl_flg.eq(value(false))
											.and(value(0).lt(S0_T3.arr_qty))
											.and(S0_T3.arr_qty.lt(S0_T3.base_unit_qty))
											.and(S0_T2.abort_flg.eq(value(false)))
											.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
										)
									)
								)
							)
							.or(
								bind("cmpl_arr_non_ac_flg").eq(value(true))
								.and(
									bracket(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T2.cmpl_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_T3.arr_cmpl_flg.eq(value(true))
										.and(S0_T3.arr_qty.eq(value(0)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
								)
							)
							.or(
								bind("cmpl_flg").eq(value(true))
								.and(S0_T2.cmpl_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(true)))
							)
							.or(
								bind("not_sync_flg").eq(value(true))
								.and(S0_T1.sync_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("vmi_flg").eq(value(true))
								.and(S0_T2.vmi_flg.eq(value(true)))
							)
							.or(
								bind("not_vmi_flg").eq(value(true))
								.and(S0_T2.vmi_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.sls_ret_schd_dt.gte(bind("sls_ret_schd_dt_fr")))
						.cutoff$and(S0_T1.sls_ret_schd_dt.lte(bind("sls_ret_schd_dt_to")))
						.cutoff$and(
							bracket(
								bind("inc_abort_flg_str").eq(value(false))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T2.sls_ret_schd_d_no.like(bind("sls_ret_schd_d_no")))
						.cutoff$and(S0_T2.sret_fr_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.sret_fr_nm,
								S0_M9.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T5.arr_loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T5.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M14.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M14.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M14.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T5.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T5.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T5.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T5.sno1.like(bind("sno1")))
						.cutoff$and(S0_T5.sno2.like(bind("sno2")))
						.cutoff$and(S0_T5.sno3.like(bind("sno3")))
						.cutoff$and(S0_T5.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T5.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.ret_rsn_cd.like(bind("ret_rsn_cd")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("schd_d_intr_rmrks")))
						.cutoff$and(S0_T2.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("schd_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("schd_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("schd_d_sub_char3")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.sls_ret_schd_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T5.sno1.eq(S0_T4.sno1)))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_T1.trd_cur_cd.eq(S0_M4.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.sls_usr_cd.eq(S0_M5.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.wg_cd.eq(S0_M7.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T2.dest_cd1.eq(S0_M11.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T2.dest_cd2.eq(S0_M12.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_T2.dest_cd3.eq(S0_M13.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_M14.itm_typ.eq(S0_M15.itm_typ).and(S0_M14.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T5.gd_cd.eq(S0_M22.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.gd_nm.like(bind("gd_nm")))),
				when(boundOr("site_nm", "loc_wg_nm", "site_cd", "loc_wg_cd", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_T5.arr_loc_cd.eq(S0_M24.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M24.site_cd.like(bind("site_cd"))).cutoff$and(S0_M24.wg_cd.like(bind("loc_wg_cd"))).cutoff$and(S0_M24.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_M24.site_cd.eq(S0_M25.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(S0_M24.wg_cd.eq(S0_M26.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M26.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T5.str_ln_cd.eq(S0_M27.str_ln_cd).and(S0_T5.arr_loc_cd.eq(S0_M27.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("ret_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M28).on(S0_T2.ret_rsn_cd.eq(S0_M28.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M28.biz_rsn_nm.like(bind("ret_rsn_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM11.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M9.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM12.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M9.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM13.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M9.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM14.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M9.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM15.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M9.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM16.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M9.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM17.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M9.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM18.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M9.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM19.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M9.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM110.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M9.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM21.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M2.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM22.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M2.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM23.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M2.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM24.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M2.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM25.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M2.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM26.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M2.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM27.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M2.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM28.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M2.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM29.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M2.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM210.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M2.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd1.as("itm_grp_cd1"), S0_MM31.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M14.itm_grp_cd1.eq(S0_MM31.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM31.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM31.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd2.as("itm_grp_cd2"), S0_MM32.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M14.itm_grp_cd2.eq(S0_MM32.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM32.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM32.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd3.as("itm_grp_cd3"), S0_MM33.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M14.itm_grp_cd3.eq(S0_MM33.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM33.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM33.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd4.as("itm_grp_cd4"), S0_MM34.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M14.itm_grp_cd4.eq(S0_MM34.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM34.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM34.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd5.as("itm_grp_cd5"), S0_MM35.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M14.itm_grp_cd5.eq(S0_MM35.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM35.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM35.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd6.as("itm_grp_cd6"), S0_MM36.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M14.itm_grp_cd6.eq(S0_MM36.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM36.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM36.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd7.as("itm_grp_cd7"), S0_MM37.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M14.itm_grp_cd7.eq(S0_MM37.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM37.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM37.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd8.as("itm_grp_cd8"), S0_MM38.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M14.itm_grp_cd8.eq(S0_MM38.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM38.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM38.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd9.as("itm_grp_cd9"), S0_MM39.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M14.itm_grp_cd9.eq(S0_MM39.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM39.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM39.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd10.as("itm_grp_cd10"), S0_MM310.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M14.itm_grp_cd10.eq(S0_MM310.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM310.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM310.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("cnsgn_gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("loc_wg_cd", m.wg_cd());
							r.setStringNE("loc_nm", m.loc_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
					})
				)
			);
	}
}