package mcframe.serverMSBD.MSBDL0090;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
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
	 * -- MSBDL0090_MST_PO_D_Query_S03
	 */
	static MCQueryPlan MSBDL0090_MST_PO_D_S03() {
		MCTempView S0_V1 = createTempView("V1");
		MCTempView S0_V2 = createTempView("V2");
		MST_ARR_PR_R S0_T4 = MST_ARR_PR_R.create("T4");
		MSW_PO_D_KEY_R S1_WK = MSW_PO_D_KEY_R.create("WK");
		MCTempView S1_T2 = createTempView("T2");
		MST_PRMS_RCPT_D_R S1_T3 = MST_PRMS_RCPT_D_R.create("T3");
		MST_ARR_PR_R S1_PR = MST_ARR_PR_R.create("PR");
		MST_PRMS_RCPT_R S2_TT = MST_PRMS_RCPT_R.create("TT");
		MSW_PO_D_KEY_R S3_WK = MSW_PO_D_KEY_R.create("WK");
		MST_ARR_PR_R S3_PR = MST_ARR_PR_R.create("PR");
		MCTempView S3_T2 = createTempView("T2");
		MST_PRMS_RCPT_D_R S3_T3 = MST_PRMS_RCPT_D_R.create("T3");
		MST_PRMS_RCPT_R S4_TT = MST_PRMS_RCPT_R.create("TT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_D_Query_S03")
					.mainQuery()
					.select(
						S0_V1.pr(S1_WK.po_d_no),
						bracket(
							cases()
								.when(
									bracket(
										S0_V1.pr("dly_prspct_qty").add(S0_V2.pr("prspct_qty")).subtract(S0_T4.arr_qty)
									).gt(value(0))
								)
									.then(
										cases()
											.when(
												bracket(
													value(0).lt(S0_T4.re_arr_schd_qty.add(S0_T4.base_unit_qty).subtract(S0_T4.prms_rcpt_qty).subtract(S0_T4.dlv_inst_prms_rcpt_qty))
													.and(value(0).lt(S0_T4.prms_rcpt_qty.add(S0_T4.dlv_inst_prms_rcpt_qty)))
												)
											)
												.then(
													cases()
														.when(
															bind("today").lte(S0_T4.arr_schd_tm)
															.and(S0_V2.pr("prspct_qty").subtract(S0_T4.arr_qty).gt(value(0)))
														)
															.then(S0_V1.pr("dly_prspct_qty").add(S0_T4.re_arr_schd_qty).add(S0_T4.base_unit_qty).subtract(S0_T4.prms_rcpt_qty).subtract(S0_T4.dlv_inst_prms_rcpt_qty))
														.otherwise(S0_V1.pr("dly_prspct_qty").add(S0_V2.pr("prspct_qty")).subtract(S0_T4.arr_qty).add(S0_T4.re_arr_schd_qty).add(S0_T4.base_unit_qty).subtract(S0_T4.prms_rcpt_qty).subtract(S0_T4.dlv_inst_prms_rcpt_qty))
											)
											.otherwise(
												cases()
													.when(
														bind("today").lte(S0_T4.arr_schd_tm)
														.and(S0_V2.pr("prspct_qty").subtract(S0_T4.arr_qty).gt(value(0)))
													)
														.then(S0_V1.pr("dly_prspct_qty"))
													.otherwise(S0_V1.pr("dly_prspct_qty").add(S0_V2.pr("prspct_qty")).subtract(S0_T4.arr_qty))
											)
								)
								.otherwise(
									cases()
										.when(
											bracket(
												value(0).lt(S0_T4.re_arr_schd_qty.add(S0_T4.base_unit_qty).subtract(S0_T4.prms_rcpt_qty).subtract(S0_T4.dlv_inst_prms_rcpt_qty))
												.and(value(0).lt(S0_T4.prms_rcpt_qty.add(S0_T4.dlv_inst_prms_rcpt_qty)))
											)
										)
											.then(S0_T4.re_arr_schd_qty.add(S0_T4.base_unit_qty).subtract(S0_T4.prms_rcpt_qty).subtract(S0_T4.dlv_inst_prms_rcpt_qty))
										.otherwise(value(0))
								)
						).as("dly_prspct_qty")
					)
					.from(
						subQuery()
						.select(
							S1_WK.po_d_no,
							nvl(
								sum(
									cases()
										.when(S1_PR.arr_schd_tm.lt(S1_T3.prms_dlv_tm))
											.then(S1_T3.base_unit_qty)
										.otherwise(value(0))
								),
								value(0)
							).as("dly_prspct_qty")
						)
						.from(
							S1_WK
							.leftOuterJoin(
								subQuery()
								.select(
									S2_TT.po_d_no,
									S2_TT.prms_rcpt_no
								)
								.from(S2_TT)
								.where(
									S2_TT.arr_schd_refl_flg.eq(value(false))
								).view(S1_T2)
							).on(S1_WK.po_d_no.eq(S1_T2.pr(S2_TT.po_d_no)))
							.leftOuterJoin(S1_T3).on(S1_T3.prms_rcpt_no.eq(S1_T2.pr(S2_TT.prms_rcpt_no)))
							.innerJoin(S1_PR).on(S1_WK.po_d_no.eq(S1_PR.po_d_no))
						)
						.groupBy(S1_WK.po_d_no).view(S0_V1)
						.innerJoin(
							subQuery()
							.select(
								S3_WK.po_d_no,
								nvl(
									sum(S3_T3.base_unit_qty),
									value(0)
								).as("prspct_qty")
							)
							.from(
								S3_WK
								.innerJoin(S3_PR).on(
									bracket(
										S3_WK.po_d_no.eq(S3_PR.po_d_no)
									)
								)
								.leftOuterJoin(
									subQuery()
									.select(
										S4_TT.po_d_no,
										S4_TT.prms_rcpt_no
									)
									.from(S4_TT)
									.where(
										S4_TT.arr_schd_refl_flg.eq(value(false))
									).view(S3_T2)
								).on(S3_WK.po_d_no.eq(S3_T2.pr(S4_TT.po_d_no)))
								.leftOuterJoin(S3_T3).on(
									S3_T2.pr(S4_TT.prms_rcpt_no).eq(S3_T3.prms_rcpt_no)
									.and(S3_T3.prms_dlv_tm.lte(S3_PR.arr_schd_tm))
								)
							)
							.groupBy(S3_WK.po_d_no).view(S0_V2)
						).on(S0_V1.pr(S1_WK.po_d_no).eq(S0_V2.pr(S3_WK.po_d_no)))
						.innerJoin(S0_T4).on(S0_V2.pr(S3_WK.po_d_no).eq(S0_T4.po_d_no))
					)
			);
	}
	
	/**
	 * -- MSBDL0090_MST_PO_Query_S02
	 */
	static MCQueryPlan MSBDL0090_MST_PO_S02() {
		MST_PO_R S0_T1 = MST_PO_R.create("T1");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MBT_APRV_R S0_T4 = MBT_APRV_R.create("T4");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MST_WRK_R S0_M41 = MST_WRK_R.create("M41");
		MAM_EXT_SYS_R S0_M42 = MAM_EXT_SYS_R.create("M42");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T5_TempView = createTempView("S0_T5_View");
		MCSingleView S0_T5_View = subQuery().select(
				S0_T5.po_no,
				S0_T5.po_rev,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T5.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_T5.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_T5.trd_cur_amt.add(S0_T5.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
				)
				.from(
						S0_T5
						.leftOuterJoin(itmR).on(
							bracket(
								S0_T5.itm_cd.eq(itmR.itm_cd)
								.and(S0_T5.itm_sub1.eq(itmR.itm_sub1))
								.and(S0_T5.itm_sub2.eq(itmR.itm_sub2))
								.and(S0_T5.itm_sub3.eq(itmR.itm_sub3))
							)
						)
				)
				.groupBy(
				S0_T5.po_no,
				S0_T5.po_rev
				).view(S0_T5_TempView);
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_Query_S02")
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
						S0_T1.upd_cntr.as("po_upd_cntr"),
						S0_T1.trd_cd,
						S0_T1.po_dt,
						S0_T1.po_print_dt,
						S0_T1.last_po_rev,
						S0_T1.po_print_flg,
						S0_T1.po_print_cd,
						S0_T1.upd_po_print_schd_dt,
						S0_T1.sppl_cd,
						S0_T1.sppl_zip_cd,
						S0_T1.sppl_addr1,
						S0_T1.sppl_addr2,
						S0_T1.sppl_addr3,
						S0_T1.sppl_addr4,
						S0_T1.sppl_tel,
						S0_T1.sppl_fax,
						S0_T1.sppl_cntct_dpt,
						S0_T1.sppl_cntct_psn,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_M11.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.xrate_inpt_flg,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.wrk_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.aprv_flg,
						S0_T4.aprv_upd_flg,
						S0_T4.aprv_can_flg,
						S0_T1.edi_flg.as("last_edi_flg"),
						cases()
							.when(bind("ref_flg").eq(value(true)))
								.then(value(false))
							.otherwise(
								decode(
									S0_IFCTL.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								)
							).as("edi_flg"),
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("edi_tgt_flg"),
						S0_T1.purc_if_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_po_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.po_print_rmrks,
						S0_T1.dlv_slip_rmrks,
						S0_T1.po_no,
						S0_T1.po_rev,
						S0_T1.can_flg,
						S0_T1.crct_rsn_cd,
						S0_T5_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T4).on(
							S0_T1.aprv_no.eq(S0_T4.aprv_no)
							.and(S0_T4.can_flg.eq(value(false)))
						)
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.po_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T5_TempView.pr(MST_PO_D_R.$po_no).eq(S0_T1.po_no))
							.and(S0_T5_TempView.pr(MST_PO_D_R.$po_rev).eq(S0_T1.po_rev))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("incl_can_flg").eq(value(true))
							.or(
								bind("incl_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("opn_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("fix_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("acpt_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("rjct_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("last_rjct_sts_str")))
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(false))
									.and(bind("aprv_flg_str").eq(value(true)))
								)
							)
						)
						.and(
							bracket(
								bind("purc_if_tgt_flg").eq(value(true))
								.and(S0_T1.purc_if_flg.eq(value(true)))
							)
							.or(
								bind("not_purc_if_tgt_flg").eq(value(true))
								.and(S0_T1.purc_if_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.cutoff$and(S0_T1.po_print_flg.eq(bind("po_prnt_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.po_dt.gte(bind("po_dt_fr")))
						.cutoff$and(S0_T1.po_dt.lte(bind("po_dt_to")))
						.cutoff$and(S0_T1.po_print_dt.gte(bind("po_print_dt_fr")))
						.cutoff$and(S0_T1.po_print_dt.lte(bind("po_print_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M11.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T1.ext_po_no.like(bind("ext_po_no")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.po_print_rmrks.like(bind("po_print_rmrks")))
						.cutoff$and(S0_T1.dlv_slip_rmrks.like(bind("dlv_slip_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(REP1)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_M11.wg_cd.eq(S0_M12.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_T1.purc_usr_cd.eq(S0_M10.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "iv_trgt_flg_str", "subcon_flg_str", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.sppl_iv_flg.eq(bind("iv_trgt_flg_str"))).cutoff$and(S0_M18.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_T1.trd_cur_cd.eq(S0_M24.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M24.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(S0_T1.wrk_no.eq(S0_M41.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_M41.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(S0_T1.ext_sys_cd.eq(S0_M42.ext_sys_cd)))
					.predicate(p -> p.cutoff$and(S0_M42.ext_sys_nm.like(bind("ext_sys_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M18.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M18.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M18.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M18.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M18.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M18.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M18.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M18.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M18.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M18.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("crct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd,
							m.bp_nm,
							m.cntry_cd,
							m.pay_crryovr_times,
							m.prnt_lcl_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_cal_cd,
							m.sppl_iv_flg,
							m.sppl_ship_form_cd,
							m.subcon_flg,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setBooleanNE("sppl_purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							r.setStringNE("sppl_ship_form_cd", m.sppl_ship_form_cd());
							r.setNumberNE("sppl_pay_crryovr_times", m.pay_crryovr_times());
							r.setStringNE("asppl_cd", m.asppl_cd());
							r.setBooleanNE("sppl_repurc_obli_flg", m.repurc_obli_flg());
							r.setStringNE("sppl_outsrc_upri_typ", m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("po_print_nm", m.po_print_nm());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
	/**
	 * -- MSBDL0090_MST_PO_P_Query_S02
	 */
	static MCQueryPlan MSBDL0090_MST_PO_P_S02() {
		MST_PO_P_R S0_T1 = MST_PO_P_R.create("T1");
		MST_PO_R S0_T6 = MST_PO_R.create("T6");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MBT_APRV_R S0_T4 = MBT_APRV_R.create("T4");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MST_WRK_R S0_M41 = MST_WRK_R.create("M41");
		MAM_EXT_SYS_R S0_M42 = MAM_EXT_SYS_R.create("M42");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_PO_D_P_R S0_T10 = MST_PO_D_P_R.create("T10");
		MST_PO_R S0_T11 = MST_PO_R.create("T11");
		MST_PO_P_R S0_T12 = MST_PO_P_R.create("T12");
		MST_PO_D_P_R S0_T13 = MST_PO_D_P_R.create("T13");
		MST_PO_P_R S0_T14 = MST_PO_P_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");

		MCTempView S0_T5_TempView = createTempView("S0_T5_View");
		MCSingleView S0_T5_View = subQuery()
									.select(
										S0_T10.po_no,
										S0_T10.po_rev,
										sum(
											decode(
												itmR.dscnt_itm_flg,
												value(true),
												S0_T10.trd_cur_amt.multiply(value(-1)).add(
													bracket(
														S0_T10.trd_cur_tax_amt.multiply(value(-1))
													)
												),
												S0_T10.trd_cur_amt.add(S0_T10.trd_cur_tax_amt))
										).as("trd_cur_inc_tax_amt")
									)
									.from(
										S0_T10
										.innerJoin(S0_T11).on(
											bracket(
												S0_T10.po_no.eq(S0_T11.po_no)
												.and(S0_T10.po_rev.eq(S0_T11.po_rev))
											)
										)
										.innerJoin(S0_T12).on(
											bracket(
												S0_T10.po_no.eq(S0_T12.po_no)
												.and(S0_T10.po_rev.eq(S0_T12.po_rev))
											)
										)
										.leftOuterJoin(itmR).on(
											bracket(
												S0_T10.itm_cd.eq(itmR.itm_cd)
												.and(S0_T10.itm_sub1.eq(itmR.itm_sub1))
												.and(S0_T10.itm_sub2.eq(itmR.itm_sub2))
												.and(S0_T10.itm_sub3.eq(itmR.itm_sub3))
											)
										)
									)
									.where(
										bracket(
											bracket(
												S0_T11.can_flg.eq(value(true))
												.and(S0_T10.upd_srv_req_no.eq(S0_T12.upd_srv_req_no))
											)
											.or(
												S0_T11.can_flg.eq(value(false))
												.and(S0_T10.can_flg.eq(value(false)))
											)
										)
									)
									.groupBy(
										S0_T10.po_no,
										S0_T10.po_rev
									)
									.unionAll(
										subQuery()
										.select(
											S0_T13.po_no,
											S0_T13.po_rev,
											sum(
												decode(
													itmR.dscnt_itm_flg,
													value(true),
													S0_T13.trd_cur_amt.multiply(value(-1)).add(
														bracket(
															S0_T13.trd_cur_tax_amt.multiply(value(-1))
														)
													),
													S0_T13.trd_cur_amt.add(S0_T13.trd_cur_tax_amt))
											).as("trd_cur_inc_tax_amt")
										)
										.from(
											S0_T13
											.innerJoin(S0_T14).on(
												bracket(
													S0_T13.po_no.eq(S0_T14.po_no)
													.and(S0_T13.po_rev.eq(S0_T14.po_rev))
												)
											)
											.leftOuterJoin(itmR).on(
												bracket(
													S0_T13.itm_cd.eq(itmR.itm_cd)
													.and(S0_T13.itm_sub1.eq(itmR.itm_sub1))
													.and(S0_T13.itm_sub2.eq(itmR.itm_sub2))
													.and(S0_T13.itm_sub3.eq(itmR.itm_sub3))
												)
											)
										)
										.where(
											notExists(
												subQuery()
												.select(S0_T15.prAll())
												.from(S0_T15)
												.where(
													S0_T13.po_no.eq(S0_T15.po_no)
													.and(S0_T13.po_rev.eq(S0_T15.po_rev))
												)
											)
											.and(S0_T13.can_flg.eq(value(false)))
										)
										.groupBy(
											S0_T13.po_no,
											S0_T13.po_rev
										)
									)
									.view(S0_T5_TempView);
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_P_Query_S02")
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
						S0_T6.upd_cntr.as("po_upd_cntr"),
						S0_T1.trd_cd,
						S0_T1.po_dt,
						S0_T1.po_print_dt,
						S0_T1.last_po_rev,
						S0_T1.po_print_flg,
						S0_T1.po_print_cd,
						S0_T1.upd_po_print_schd_dt,
						S0_T1.sppl_cd,
						S0_T1.sppl_zip_cd,
						S0_T1.sppl_addr1,
						S0_T1.sppl_addr2,
						S0_T1.sppl_addr3,
						S0_T1.sppl_addr4,
						S0_T1.sppl_tel,
						S0_T1.sppl_fax,
						S0_T1.sppl_cntct_dpt,
						S0_T1.sppl_cntct_psn,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_M11.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.xrate_inpt_flg,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.wrk_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.aprv_flg,
						S0_T4.aprv_upd_flg,
						S0_T4.aprv_can_flg,
						S0_T1.edi_flg.as("last_edi_flg"),
						cases()
							.when(bind("ref_flg").eq(value(true)))
								.then(value(false))
							.otherwise(
								decode(
									S0_IFCTL.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								)
							).as("edi_flg"),
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("edi_tgt_flg"),
						S0_T1.purc_if_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_po_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.po_print_rmrks,
						S0_T1.dlv_slip_rmrks,
						S0_T1.po_no,
						S0_T1.po_rev,
						S0_T6.can_flg,
						S0_T1.crct_rsn_cd,
						S0_T5_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T4).on(
							S0_T1.aprv_no.eq(S0_T4.aprv_no)
							.and(S0_T4.can_flg.eq(value(false)))
						)
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.po_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
									S0_T1.po_no.eq(S0_T6.po_no)
							)
						)
						.leftOuterJoin(S0_T5_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T5_TempView.pr(MST_PO_D_R.$po_no).eq(S0_T1.po_no))
							.and(S0_T5_TempView.pr(MST_PO_D_R.$po_rev).eq(S0_T1.po_rev))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("opn_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("fix_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("acpt_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("rjct_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("last_rjct_sts_str")))
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(false))
									.and(bind("aprv_flg_str").eq(value(true)))
								)
							)
						)
						.and(
							bracket(
								bind("purc_if_tgt_flg").eq(value(true))
								.and(S0_T1.purc_if_flg.eq(value(true)))
							)
							.or(
								bind("not_purc_if_tgt_flg").eq(value(true))
								.and(S0_T1.purc_if_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.cutoff$and(S0_T1.po_print_flg.eq(bind("po_prnt_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.po_dt.gte(bind("po_dt_fr")))
						.cutoff$and(S0_T1.po_dt.lte(bind("po_dt_to")))
						.cutoff$and(S0_T1.po_print_dt.gte(bind("po_print_dt_fr")))
						.cutoff$and(S0_T1.po_print_dt.lte(bind("po_print_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M11.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T1.ext_po_no.like(bind("ext_po_no")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.po_print_rmrks.like(bind("po_print_rmrks")))
						.cutoff$and(S0_T1.dlv_slip_rmrks.like(bind("dlv_slip_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(REP1)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_M11.wg_cd.eq(S0_M12.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_T1.purc_usr_cd.eq(S0_M10.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "iv_trgt_flg_str", "subcon_flg_str", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.sppl_iv_flg.eq(bind("iv_trgt_flg_str"))).cutoff$and(S0_M18.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_T1.trd_cur_cd.eq(S0_M24.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M24.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(S0_T1.wrk_no.eq(S0_M41.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_M41.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(S0_T1.ext_sys_cd.eq(S0_M42.ext_sys_cd)))
					.predicate(p -> p.cutoff$and(S0_M42.ext_sys_nm.like(bind("ext_sys_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M18.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M18.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M18.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M18.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M18.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M18.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M18.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M18.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M18.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M18.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("crct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd,
							m.bp_nm,
							m.cntry_cd,
							m.pay_crryovr_times,
							m.prnt_lcl_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_cal_cd,
							m.sppl_iv_flg,
							m.sppl_ship_form_cd,
							m.subcon_flg,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setBooleanNE("sppl_purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							r.setStringNE("sppl_ship_form_cd", m.sppl_ship_form_cd());
							r.setNumberNE("sppl_pay_crryovr_times", m.pay_crryovr_times());
							r.setStringNE("asppl_cd", m.asppl_cd());
							r.setBooleanNE("sppl_repurc_obli_flg", m.repurc_obli_flg());
							r.setStringNE("sppl_outsrc_upri_typ", m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("po_print_nm", m.po_print_nm());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
	
	/**
	 * MSBDL0090_MST_PO_P_S02_ORDER_BY
	 */
	static MCDynamicSQLInfo MSBDL0090_MST_PO_P_S02_ORDER_BY() {
		MST_PO_P_R S0T1 = MST_PO_P_R.create("T1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

		return when(null)
				.orderBy(ORDERBY, S0T1.po_no.asc(), S0T1.po_rev.asc());
	}

	/**
	 * MSBDL0090_MST_PO_S02_ORDER_BY
	 */
	static MCDynamicSQLInfo MSBDL0090_MST_PO_S02_ORDER_BY() {
		MST_PO_R S0T1 = MST_PO_R.create("T1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

		return when(null)
				.orderBy(ORDERBY, S0T1.po_no.asc());
	}

	/**
	 * MSBDL0090_MST_PO_S02_WHERE01
	 */
	static MCDynamicSQLInfo MSBDL0090_MST_PO_S02_WHERE01() {
		MST_PO_R t1 = MST_PO_R.create("T1");
		MST_PO_D_R S1ST1 = MST_PO_D_R.create("ST1");
		MST_ARR_PR_R S1ST2 = MST_ARR_PR_R.create("ST2");
		MAM_ITM_R S1SM1 = MAM_ITM_R.create("SM1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");


		return when(null).predicate(REP1, p -> p.and(notExists(subQuery().select(value("X"))
				.from(S1ST1.innerJoin(S1ST2).on(S1ST1.po_d_no.eq(S1ST2.po_d_no))
						.leftOuterJoin(S1SM1)
						.on(S1ST1.itm_cd.eq(S1SM1.itm_cd)
								.and(S1ST1.itm_sub1.eq(S1SM1.itm_sub1))
								.and(S1ST1.itm_sub2
										.eq(S1SM1.itm_sub2))
								.and(S1ST1.itm_sub3.eq(S1SM1.itm_sub3))))
				.where(S1ST1.po_no.eq(t1.po_no).and(S1ST1.can_flg.eq(value(false)))
						.and(S1ST1.po_rev.eq(t1.po_rev))
						.and(S1ST2.abort_flg.eq(value(true))
								.or(value(0).lt(S1ST2.rcpt_iv_qty))
								.or(value(0).lt(S1ST2.purc_qty))
								.or(value(0).lt(S1ST2.arr_qty))
								.or(value(0).lt(S1ST2.accpt_dfct_qty))
								.or(bracket(S1ST2.arr_cmpl_flg.eq(value(true))
										.and(S1ST2.abort_flg.eq(value(false)))
										.and(S1ST2.arr_schd_abort_qty
												.eq(S1ST2.trd_unit_qty)))
														.or(S1ST2.purc_cmpl_flg
																.eq(value(true))
																.and(S1ST2.purc_qty
																		.eq(value(0)))
																.and(S1ST2.accpt_dfct_qty
																		.eq(value(0)))
																.and(S1ST1.purc_id_typ
																		.neq(value(
																				MAC_PURC_ID_TYP.VMI
																						.value()))
																		.and(S1ST1.purc_id_typ
																				.neq(value(
																						MAC_PURC_ID_TYP.FFR_RCV
																								.value())))))))))));
	}
	/**
	 * -- MSBDL0090_MST_PO_Query_S04
	 */
	static MCQueryPlan MSBDL0090_MST_PO_S04() {
		MST_PO_R S0_T1 = MST_PO_R.create("T1");
		MST_PO_D_R S0_T2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MBT_APRV_R S0_T4 = MBT_APRV_R.create("T4");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MST_WRK_R S0_M41 = MST_WRK_R.create("M41");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MST_PO_SCHD_R S0_T6 = MST_PO_SCHD_R.create("T6");
		MST_ITM_ORDER_R S0_T7 = MST_ITM_ORDER_R.create("T7");
		MAM_ITM_TYP_D_R S0_M23 = MAM_ITM_TYP_D_R.create("M23");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MAVM_BP_NM_R S0_M22 = MAVM_BP_NM_R.create("M22");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_USR_R S0_M25 = MAM_USR_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_EXT_SYS_R S0_M42 = MAM_EXT_SYS_R.create("M42");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_Query_S04")
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
						S0_T1.upd_cntr.as("po_upd_cntr"),
						S0_T2.ins_usr_id.as("dtl_ins_usr_id"),
						S0_T2.ins_usr_nm.as("dtl_ins_usr_nm"),
						S0_T2.ins_ts.as("dtl_ins_ts"),
						S0_T2.ins_func_id.as("dtl_ins_func_id"),
						S0_T2.upd_usr_id.as("dtl_upd_usr_id"),
						S0_T2.upd_usr_nm.as("dtl_upd_usr_nm"),
						S0_T2.upd_ts.as("dtl_upd_ts"),
						S0_T2.upd_func_id.as("dtl_upd_func_id"),
						S0_T2.upd_srv_req_no.as("dtl_upd_srv_req_no"),
						S0_T1.trd_cd,
						S0_T1.po_dt,
						S0_T1.po_print_dt,
						S0_T1.last_po_rev,
						S0_T1.po_print_flg,
						S0_T1.po_print_cd,
						S0_T1.upd_po_print_schd_dt,
						S0_T1.po_dt.as("dpt_base_dt"),
						S0_T2.in_to_loc_cd,
						S0_T2.pri_print_flg,
						S0_T2.drct_dlv_typ,
						S0_T2.str_ln_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T2.sundry_itm_flg,
						S0_M2.asset_mng_typ,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M2.ver_flg,
						S0_M2.dscnt_itm_flg,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_T2.ver_no,
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.arr_skip_flg,
						S0_M2.purc_dlv_slip_flg,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_T1.sppl_cd,
						S0_T1.sppl_zip_cd,
						S0_T1.sppl_addr1,
						S0_T1.sppl_addr2,
						S0_T1.sppl_addr3,
						S0_T1.sppl_addr4,
						S0_T1.sppl_tel,
						S0_T1.sppl_fax,
						S0_T1.sppl_cntct_dpt,
						S0_T1.sppl_cntct_psn,
						S0_T2.maker_cd,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T2.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T2.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T2.bp_lot_no,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_T2.ap_dpt_cd,
						S0_T2.dlv_cd,
						S0_T2.dlv_sundry_flg,
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.tdlv_cd,
						S0_T2.tdlv_sundry_flg,
						S0_T2.tdlv_zip_cd,
						S0_T2.tdlv_addr1,
						S0_T2.tdlv_addr2,
						S0_T2.tdlv_addr3,
						S0_T2.tdlv_addr4,
						S0_T2.tdlv_tel,
						S0_T2.tdlv_fax,
						S0_T2.tdlv_cntct_dpt,
						S0_T2.tdlv_cntct_psn,
						trunc(
							S0_T2.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T2.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T2.purc_schd_dt,
						S0_T2.rqst_avl_rqst_dt,
						S0_T2.sync_flg,
						S0_T2.purc_basis_typ,
						S0_T2.po_conf_rcpt_flg,
						S0_T2.po_conf_rcpt_dt,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.pay_crryovr_times,
						S0_T2.purc_upri_req_typ,
						S0_T2.upri_not_tgt_flg,
						S0_T2.interim_flg,
						S0_T1.trd_cur_cd,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.trd_cur_proc_upri,
						S0_T2.trd_cur_proc_amt,
						S0_T2.trd_cur_onr_prov_upri,
						S0_T2.trd_cur_onr_prov_amt,
						S0_T1.xrate,
						S0_T1.xrate_inpt_flg,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.mfg_loc_cd,
						S0_T2.bom_ptn,
						S0_T2.outsrc_flg,
						S0_T2.outsrc_itm_ord_no,
						S0_T2.purc_id_typ,
						S0_T2.purc_rsn_cd,
						S0_T1.crct_rsn_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.wrk_no,
						S0_T2.bd_dpt_cd,
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
						S0_T2.bd_slo_no,
						S0_T2.bd_iv_no,
						S0_T2.bd_po_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.aprv_flg,
						S0_T4.aprv_upd_flg,
						S0_T4.aprv_can_flg,
						S0_T2.bndl_flg,
						S0_T2.rqst_can_flg,
						S0_T2.rqst_slo_flg,
						S0_T1.edi_flg.as("last_edi_flg"),
						bracket(
							cases()
								.when(S0_T5.arr_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("arr_flg"),
						bracket(
							cases()
								.when(
									S0_T5.purc_qty.gt(value(0))
									.or(S0_T5.accpt_dfct_qty.gt(value(0)))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("purc_flg"),
						bracket(
							cases()
								.when(S0_T5.rcpt_iv_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rcpt_iv_flg"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.po_print_rmrks,
						S0_T1.dlv_slip_rmrks,
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_T2.edi_sub_d_char1,
						S0_T2.edi_sub_d_char2,
						S0_T2.edi_sub_d_char3,
						S0_T2.edi_sub_d_char4,
						S0_T2.edi_sub_d_char5,
						S0_T2.edi_sub_d_num1,
						S0_T2.edi_sub_d_dt1,
						S0_T5.arr_cnt_rmrks,
						S0_T2.intr_rmrks.as("dtl_intr_rmrks"),
						S0_T2.trd_d_rmrks.as("dtl_trd_d_rmrks"),
						S0_T2.po_print_d_rmrks,
						S0_T2.dlv_slip_d_rmrks,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.dlv_slip_invalid_flg,
						S0_T1.po_no,
						S0_T2.po_rev,
						S0_T2.po_d_no,
						S0_T5.purc_sts_typ,
						S0_T5.arr_tm,
						S0_T5.arr_schd_split_flg,
						S0_T5.purc_dt,
						S0_T5.act_purc_lt,
						S0_T5.std_purc_lt,
						S0_T5.dlv_inst_dt,
						nvl(
							S0_T5.dlv_inst_qty,
							value(0)
						).as("dlv_inst_qty"),
						S0_T5.dlv_inst_prms_rcpt_dt,
						S0_T5.dlv_inst_prms_refl_dt,
						S0_T5.prms_rcpt_dt,
						S0_T5.prms_refl_dt,
						S0_T5.prms_dlv_dt,
						nvl(
							S0_T5.prms_rcpt_qty,
							value(0)
						).as("prms_rcpt_qty"),
						nvl(
							S0_T5.prms_refl_qty,
							value(0)
						).as("prms_refl_qty"),
						nvl(
							S0_T5.dlv_inst_prms_rcpt_qty,
							value(0)
						).as("dlv_inst_prms_rcpt_qty"),
						nvl(
							S0_T5.dlv_inst_prms_refl_qty,
							value(0)
						).as("dlv_inst_prms_refl_qty"),
						S0_T5.prms_dlv_dt_overdue_flg,
						S0_T5.dlv_rqst_dt_overdue_flg,
						trunc(
							S0_T5.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_T5.arr_schd_tm.as("arr_schd_hm"),
						trunc(
							S0_T5.arr_tm,
							MCDateFmt.DD
						).as("arr_dt"),
						S0_T5.arr_tm.as("arr_hm"),
						nvl(
							S0_T5.arr_schd_abort_qty,
							value(0)
						).as("arr_schd_abort_qty"),
						cases()
							.when(S0_T5.arr_cmpl_flg.eq(value(true)))
								.then(value(0))
							.when(S0_T5.arr_cmpl_flg.eq(value(false)))
								.then(S0_T5.base_unit_qty.add(S0_T5.re_arr_schd_qty).subtract(S0_T5.arr_qty).subtract(S0_T5.arr_schd_abort_qty))
							.otherwise(value(0)).as("yet_arr_qty"),
						nvl(
							S0_T5.arr_qty,
							value(0)
						).as("arr_qty"),
						nvl(
							S0_T5.purc_qty,
							value(0)
						).as("purc_qty"),
						MAPA_CALC$F_CALC_PER(
							S0_T2.base_unit_qty,
							nvl(
								S0_T5.arr_qty,
								value(0)
							)
						).as("arr_prgrs"),
						MAPA_CALC$F_CALC_PER(
							S0_T2.base_unit_qty,
							nvl(
								S0_T5.purc_qty,
								value(0)
							)
						).as("purc_prgrs"),
						nvl(
							S0_T5.rcpt_iv_qty,
							value(0)
						).as("rcpt_iv_qty"),
						S0_T2.schd_chg_flg,
						S0_T2.uplnd_flg,
						S0_T2.can_flg,
						S0_T5.arr_cmpl_flg,
						S0_T5.purc_cmpl_flg,
						S0_T2.iv_itm_nm.as("pod_iv_itm_nm"),
						S0_T2.dlv_nm.as("pod_dlv_nm"),
						S0_T2.tdlv_nm.as("pod_tdlv_nm"),
						S0_T1.purc_if_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_po_no,
						S0_T2.ext_po_d_no,
						addDynamicSelect(DS0D),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.po_no.eq(S0_T2.po_no))
						.leftOuterJoin(S0_T5).on(S0_T2.po_d_no.eq(S0_T5.po_d_no))
						.innerJoin(S0_M99).on(S0_T1.purc_dpt_cd.eq(S0_M99.dpt_cd))
						.leftOuterJoin(S0_T4).on(
							S0_T1.aprv_no.eq(S0_T4.aprv_no)
							.and(S0_T4.can_flg.eq(value(false)))
						)
						.leftOuterJoin(S0_M2).on(
							S0_T2.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T2.slo_d_no)
								)
						)
						.addDynamicView()
						.addDynamicView(DS0D)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("incl_can_flg").eq(value(true))
							.or(
								bind("incl_can_flg").eq(value(false))
								.and(S0_T2.can_flg.eq(value(false)))
							)
						)
						.and(
							bind("incl_abort_flg").eq(value(true))
							.or(
								bind("incl_abort_flg").eq(value(false))
								.and(
									S0_T5.abort_flg.isNull()
									.or(S0_T5.abort_flg.eq(value(false)))
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("opn_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("fix_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("acpt_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("rjct_sts_str")))
							.cutoff$or(S0_T1.aprv_sts_typ.eq(bind("last_rjct_sts_str")))
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(false))
									.and(bind("aprv_flg_str").eq(value(true)))
								)
							)
						)
						.and(
							bracket(
								bind("not_arr_flg").eq(value(true))
								.and(
									bind("incl_can_flg").eq(value(true))
									.and(S0_T2.can_flg.eq(value(true)))
									.or(
										S0_T5.arr_qty.eq(value(0))
										.and(
											S0_T5.arr_cmpl_flg.eq(value(false))
											.or(S0_T5.arr_cmpl_flg.eq(value(true)))
											.and(S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty).eq(value(0)))
											.and(S0_T5.purc_cmpl_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bind("part_arr_flg").eq(value(true))
								.and(
									S0_T5.arr_qty.gt(value(0))
									.and(S0_T5.arr_cmpl_flg.eq(value(false)))
									.or(S0_T5.arr_qty.eq(value(0)))
									.and(S0_T5.arr_cmpl_flg.eq(value(true)))
									.and(S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty).gt(value(0)))
									.and(S0_T5.purc_cmpl_flg.eq(value(false)))
								)
							)
							.or(
								bind("arr_compl_flg").eq(value(true))
								.and(S0_T5.arr_cmpl_flg.eq(value(true)))
								.and(
									S0_T5.arr_qty.gt(value(0))
									.or(S0_T5.arr_schd_abort_qty.gt(value(0)))
									.or(S0_T5.purc_cmpl_flg.eq(value(true)))
									.and(
										bracket(
											S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty)
										).gt(value(0))
										.or(S0_T5.purc_schd_abort_qty.gt(value(0)))
									)
								)
							)
						)
						.and(
							bracket(
								bind("not_purc_flg").eq(value(true))
								.and(
									bind("incl_can_flg").eq(value(true))
									.and(S0_T2.can_flg.eq(value(true)))
									.or(
										bracket(
											S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty)
										).eq(value(0))
										.and(
											S0_T5.purc_cmpl_flg.eq(value(false))
											.or(S0_T5.purc_cmpl_flg.eq(value(true)))
											.and(S0_T5.arr_qty.eq(value(0)))
											.and(S0_T5.arr_cmpl_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bind("part_purc_flg").eq(value(true))
								.and(
									bracket(
										S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty)
									).gt(value(0))
									.and(S0_T5.purc_cmpl_flg.eq(value(false)))
									.or(S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty).eq(value(0)))
									.and(S0_T5.purc_cmpl_flg.eq(value(true)))
									.and(S0_T5.arr_qty.gt(value(0)))
									.and(S0_T5.arr_cmpl_flg.eq(value(false)))
								)
							)
							.or(
								bind("purc_compl_flg").eq(value(true))
								.and(S0_T5.purc_cmpl_flg.eq(value(true)))
								.and(
									bracket(
										S0_T5.purc_qty.add(S0_T5.accpt_dfct_qty)
									).gt(value(0))
									.or(S0_T5.purc_schd_abort_qty.gt(value(0)))
									.or(S0_T5.arr_cmpl_flg.eq(value(true)))
									.and(
										S0_T5.arr_qty.gt(value(0))
										.or(S0_T5.arr_schd_abort_qty.gt(value(0)))
									)
								)
							)
						)
						.addDynamicPredicate(DS0D)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.cutoff$and(S0_T1.purc_if_flg.eq(bind("purc_if_flg_str")))
						.cutoff$and(S0_T1.po_print_flg.eq(bind("po_prnt_flg_str")))
						.cutoff$and(S0_T2.sundry_itm_flg.eq(bind("sundry_itm_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_T2.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T2.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T1.po_dt.gte(bind("po_dt_fr")))
						.cutoff$and(S0_T1.po_dt.lte(bind("po_dt_to")))
						.cutoff$and(S0_T1.po_print_dt.gte(bind("po_print_dt_fr")))
						.cutoff$and(S0_T1.po_print_dt.lte(bind("po_print_dt_to")))
						.cutoff$and(S0_T2.po_conf_rcpt_flg.eq(bind("po_conf_rcpt_flg_str")))
						.cutoff$and(S0_T2.po_conf_rcpt_dt.gte(bind("po_conf_rcpt_dt_fr")))
						.cutoff$and(S0_T2.po_conf_rcpt_dt.lte(bind("po_conf_rcpt_dt_to")))
						.cutoff$and(S0_T5.dlv_inst_dt.gte(bind("dlv_inst_dt_fr")))
						.cutoff$and(S0_T5.dlv_inst_dt.lte(bind("dlv_inst_dt_to")))
						.cutoff$and(S0_T5.arr_tm.gte(bind("arr_hm_fr")))
						.cutoff$and(S0_T5.arr_tm.lte(bind("arr_hm_to")))
						.cutoff$and(S0_T5.prms_dlv_dt_overdue_flg.eq(bind("prms_dlv_dt_overdue_flg_str")))
						.cutoff$and(S0_T5.dlv_rqst_dt_overdue_flg.eq(bind("dlv_rqst_dt_overdue_flg_str")))
						.cutoff$and(S0_T5.purc_sts_typ.like(bind("purc_sts_typ")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T2.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0_T2.in_to_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T2.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M2.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T10.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T2.dlv_cd.isNotNull()))
						.cutoff$and(S0_T10.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T2.dlv_cd.isNotNull()))
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_M2.asset_mng_typ.like(bind("asset_mng_typ")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T2.drct_dlv_typ.like(bind("drct_dlv_typ")))
						.cutoff$and(S0_T1.po_no.like(bind("po_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T2.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T2.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T1.ext_po_no.like(bind("ext_po_no")))
						.cutoff$and(S0_T2.ext_po_d_no.like(bind("ext_po_d_no")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.po_print_rmrks.like(bind("po_print_rmrks")))
						.cutoff$and(S0_T1.dlv_slip_rmrks.like(bind("dlv_slip_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("dtl_trd_d_rmrks")))
						.cutoff$and(S0_T2.po_print_d_rmrks.like(bind("po_print_d_rmrks")))
						.cutoff$and(S0_T2.dlv_slip_d_rmrks.like(bind("dlv_slip_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(REP1)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "iv_trgt_flg_str", "subcon_flg_str", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.sppl_iv_flg.eq(bind("iv_trgt_flg_str"))).cutoff$and(S0_M18.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(S0_T1.wrk_no.eq(S0_M41.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_M41.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M2.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M2.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M2.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M2.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M2.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M2.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M2.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M2.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M2.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M2.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M18.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M18.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M18.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M18.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M18.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M18.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M18.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M18.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M18.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M18.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("purc_dpt_nm", "purc_dpt_wg_nm"))
					.view(DS0D, v -> v.innerJoin(S0_M11).on(S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd).and(S0_T1.po_dt.between(S0_M11.st_dt, S0_M11.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M11.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M12).on(S0_M11.wg_cd.eq(S0_M12.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M12.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M10).on(S0_T1.purc_usr_cd.eq(S0_M10.usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M10.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M24).on(S0_T1.trd_cur_cd.eq(S0_M24.cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M24.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("po_schd_dt_fr", "po_schd_dt_to", "po_schd_src_typ", "po_schd_src_no", "rqst_fr_usr_cd", "rqst_fr_usr_nm", "rqst_fr_dpt_cd", "rqst_fr_dpt_nm", "po_schd_no", "po_cnt_rmrks", "po_schd_sub_char1", "po_schd_sub_char2", "po_schd_sub_char3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_T6).on(cases().when(S0_T2.bndl_flg.eq(value(false))).then(S0_T1.po_no).otherwise(nullValue()).eq(S0_T6.po_no).and(cases().when(S0_T2.bndl_flg.eq(value(false))).then(S0_T2.po_d_no).otherwise(nullValue()).eq(S0_T6.po_d_no))).leftOuterJoin(S0_T7).on(coalesce(S0_T2.outsrc_itm_ord_no,S0_T6.outsrc_itm_ord_no,S0_T6.pln_itm_ord_no).eq(S0_T7.itm_ord_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_T6.po_schd_dt.gte(bind("po_schd_dt_fr"))).cutoff$and(S0_T6.po_schd_dt.lte(bind("po_schd_dt_to"))).cutoff$and(S0_T6.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_T6.rqst_fr_usr_cd.like(bind("rqst_fr_usr_cd"))).cutoff$and(S0_T6.rqst_fr_dpt_cd.like(bind("rqst_fr_dpt_cd"))).cutoff$and(S0_T6.po_schd_src_no.like(bind("po_schd_src_no"))).cutoff$and(S0_T6.po_schd_no.like(bind("po_schd_no"))).cutoff$and(S0_T6.po_cnt_rmrks.like(bind("po_cnt_rmrks"))).cutoff$and(S0_T6.sub_char1.like(bind("po_schd_sub_char1"))).cutoff$and(S0_T6.sub_char2.like(bind("po_schd_sub_char2"))).cutoff$and(S0_T6.sub_char3.like(bind("po_schd_sub_char3")))),
				when(boundOr("rqst_fr_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M25).on(S0_T6.rqst_fr_usr_cd.eq(S0_M25.usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M25.usr_nm.like(bind("rqst_fr_usr_nm")))),
				when(boundOr("rqst_fr_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M26).on(S0_T6.rqst_fr_dpt_cd.eq(S0_M26.dpt_cd).and(S0_T6.reg_dt.between(S0_M26.st_dt, S0_M26.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M26.dpt_nm.like(bind("rqst_fr_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.innerJoin(S0_M23).on(S0_M2.itm_typ.eq(S0_M23.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M23.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M23.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M33).on(S0_T2.ap_dpt_cd.eq(S0_M33.dpt_cd).and(S0_T1.po_dt.between(S0_M33.st_dt, S0_M33.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M33.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M22).on(S0_T2.maker_cd.eq(S0_M22.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M22.bp_nm.like(bind("maker_nm")))),
				when(boundOr("site_cd", "in_to_loc_wg_cd", "in_to_loc_nm", "site_nm", "in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M6).on(S0_T2.in_to_loc_cd.eq(S0_M6.loc_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M6.site_cd.like(bind("site_cd"))).cutoff$and(S0_M6.wg_cd.like(bind("in_to_loc_wg_cd"))).cutoff$and(S0_M6.loc_nm.like(bind("in_to_loc_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M7).on(S0_M6.wg_cd.eq(S0_M7.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M7.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M19).on(S0_M6.site_cd.eq(S0_M19.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M19.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M8).on(S0_T2.str_ln_cd.eq(S0_M8.str_ln_cd).and(S0_T2.in_to_loc_cd.eq(S0_M8.loc_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("dlv_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M20).on(S0_T2.dlv_cd.eq(S0_M20.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_T2.dlv_nm,S0_M20.bp_nm).like(bind("dlv_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M42).on(S0_T1.ext_sys_cd.eq(S0_M42.ext_sys_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M42.ext_sys_nm.like(bind("ext_sys_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("crct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd,
							m.bp_nm,
							m.cntry_cd,
							m.pay_crryovr_times,
							m.prnt_lcl_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_cal_cd,
							m.sppl_iv_flg,
							m.sppl_ship_form_cd,
							m.subcon_flg,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setBooleanNE("sppl_repurc_obli_flg", m.repurc_obli_flg());
							r.setStringNE("sppl_outsrc_upri_typ", nvl(m.outsrc_upri_typ(), getCo().outsrc_upri_typ()));
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setBooleanNE("sppl_purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							r.setStringNE("sppl_ship_form_cd", m.sppl_ship_form_cd());
							r.setNumberNE("sppl_pay_crryovr_times", m.pay_crryovr_times());
							r.setStringNE("asppl_cd", m.asppl_cd());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
						j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_nm", m.dpt_nm());
							r.setStringNE("purc_dpt_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm",m.cntry_nm());
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
						.add(MAM_ITM_LCL_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("prnt_lcl_cd")
						))
						.addSelect(m -> toArray(
							m.lcl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("prnt_lcl_cd", m.lcl_cd());
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
							r.setStringNE("trd_cur_nm",m.cur_nm());
							r.setNumberNE("trd_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm",m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm",m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("po_print_nm",m.po_print_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1",m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2",m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3",m.tterm_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"), 
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("join_itm_typ_"), r.getStringNE("join_itm_typ_d_cd_")
						))
						.addSelect(m -> toArray(
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ",m.itm_typ());
							r.setStringNE("itm_typ_d_cd",m.itm_typ_d_cd());
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
							r.setStringNE("itm_typ_d_nm",m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm",m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg",m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("ap_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ap_dpt_nm",m.dpt_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm",m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_mng_typ,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm",m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd",m.wg_cd());
							r.setStringNE("site_cd",m.site_cd());
							r.setBooleanNE("str_ln_tgt_flg",m.str_ln_tgt_flg());
							r.setStringNE("outsrc_sppl_cd",m.sppl_cd());
							r.setStringNE("loc_mng_typ",m.loc_mng_typ());
							r.setStringNE("in_to_loc_cal_cd",m.cal_cd());
							r.setStringNE("lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("loc_grp_cd",m.loc_grp_cd());
							r.setStringNE("bef_in_to_loc_wg_cd",m.wg_cd());
							r.setStringNE("bef_lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("bef_loc_grp_cd",m.loc_grp_cd());
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
							r.setStringNE("site_nm",m.site_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm",m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"), 
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm",m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.dlv_cal_cd,
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm",m.bp_nm());
							r.setStringNE("dlv_cntry_cd",m.cntry_cd());
							r.setStringNE("dlv_cal_cd",m.dlv_cal_cd());
							r.setStringNE("dlv_lg_grp_cd",m.lg_grp_cd());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm",m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_nm",m.bp_nm());
							r.setStringNE("tdlv_lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("tdlv_cntry_cd",m.cntry_cd());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm",m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"), 
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place",m.dec_place());
							r.setStringNE("trd_unit_rnd_typ",m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty",m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty",m.conv_qty());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"), 
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place",m.dec_place());
							r.setStringNE("base_unit_rnd_typ",m.rnd_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm",m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm",m.tax_nm());
							r.setStringNE("tax_typ",m.tax_typ());
							r.setBooleanNE("inc_tax_flg",m.inc_tax_flg());
							r.setNumberNE("tax_rate",m.tax_rate());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm",m.loc_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"), 
							r.getStringNE("bd_itm_sub1"), 
							r.getStringNE("bd_itm_sub2"), 
							r.getStringNE("bd_itm_sub3")
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
							r.setStringNE("bd_itm_nm",m.itm_nm());
							r.setStringNE("bd_lot_mng_typ",m.lot_mng_typ());
							r.setStringNE("bd_sublot_mng_typ",m.sublot_mng_typ());
							r.setStringNE("bd_lot_no_typ",m.lot_no_typ());
							r.setStringNE("bd_sublot_no_typ",m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ",m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ",m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ",m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ",m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm",m.loc_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("bd_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_dpt_nm",m.dpt_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm",m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm",m.oper_nm());
					}),
					j -> j
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm",m.ext_sys_nm());
					})
				)
			);
	}

	/**
	 * MSBDL0090_MST_PO_S03_ORDER_BY
	 */
	static MCDynamicSQLInfo MSBDL0090_MST_PO_S03_ORDER_BY() {
		MST_PO_R S0T1 = MST_PO_R.create("T1");
		MST_PO_D_R S0T2 = MST_PO_D_R.create("T2");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

		return when(null)
				.orderBy(ORDERBY, S0T1.po_no.asc(), S0T2.po_rev.asc(), S0T2.disp_seq.asc());
	}

	/**
	 * MSBDL0090_MST_PO_S03_WHERE01
	 */
	static MCDynamicSQLInfo MSBDL0090_MST_PO_S03_WHERE01() {
		MST_ARR_PR_R S0T5 = MST_ARR_PR_R.create("T5");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.predicate(REP1, p -> p.and(value(0).eq(S0T5.rcpt_iv_qty)
						.and(value(0).eq(S0T5.purc_qty)
								.and(value(0).eq(S0T5.accpt_dfct_qty)))
						.and(S0T5.arr_cmpl_flg.eq(value(false))
								.or(S0T5.purc_cmpl_flg.eq(value(false))))));
	}
	
	/**
	 * -- MSBDL0090_MST_PO_SCHD_Query_S02
	 */
	static MCQueryPlan MSBDL0090_MST_PO_SCHD_S02() {
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M99 = MAVM_RD_WG_R.create("M99");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_ITM_LCL_R S0_M361 = MAM_ITM_LCL_R.create("M361");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_ITM_TYP_D_R S0_M23 = MAM_ITM_TYP_D_R.create("M23");
		MAVM_BP_NM_R S0_M22 = MAVM_BP_NM_R.create("M22");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_USR_R S0_M25 = MAM_USR_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_DPT_R S0_M27 = MAM_DPT_R.create("M27");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MAM_EDI_IF_CTL_R S1_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_SCHD_Query_S02")
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
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.po_schd_dt,
						S0_T1.reg_dt,
						S0_T1.reg_dt.as("dpt_base_dt"),
						S0_T1.in_to_loc_cd,
						bracket(
							cases()
								.when(S0_M18.sppl_ship_form_cd.isNull())
									.then(value(false))
								.otherwise(value(true))
						).as("pri_print_flg"),
						S0_T1.drct_dlv_typ,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.sundry_itm_flg,
						S0_T1.ver_no,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_M2.asset_mng_typ,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M2.ver_flg,
						S0_M2.dscnt_itm_flg,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.arr_skip_flg,
						S0_M2.purc_dlv_slip_flg,
						S0_T1.sppl_cd,
						S0_M18.bp_nm.as("sppl_nm"),
						S0_M18.cntry_cd.as("sppl_cntry_cd"),
						S0_M18.sppl_iv_flg,
						S0_M18.subcon_flg,
						S0_M18.repurc_obli_flg.as("sppl_repurc_obli_flg"),
						nvl(
								S0_M18.outsrc_upri_typ,
								value(getCo().outsrc_upri_typ())
								).as("sppl_outsrc_upri_typ"),
						S0_M18.prnt_lcl_cd,
						S0_M18.purc_upri_cng_flg.as("sppl_purc_upri_cng_flg"),
						S0_M18.purc_amt_rnd_typ,
						S0_M18.purc_tax_rnd_typ,
						S0_M18.sppl_cal_cd,
						S0_M18.sppl_ship_form_cd,
						S0_T1.maker_cd,
						S0_M18.asppl_cd,
						S0_M18.pay_crryovr_times.as("sppl_pay_crryovr_times"),
						bracket(
							cases()
								.when(S0_M2.pay_crryovr_times.isNull())
									.then(S0_M18.pay_crryovr_times)
								.otherwise(S0_M2.pay_crryovr_times)
						).as("pay_crryovr_times"),
						S0_M18.po_print_cd,
						S0_M18.sppl_tterm_cd1.as("tterm_cd1"),
						S0_M18.sppl_tterm_cd2.as("tterm_cd2"),
						S0_M18.sppl_tterm_cd3.as("tterm_cd3"),
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M27.ap_dpt_flg,
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T1.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T1.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						S0_T1.purc_schd_dt,
						S0_T1.rqst_avl_rqst_dt,
						bracket(
							cases()
								.when(
									trunc(
										S0_T1.dlv_rqst_tm,
										MCDateFmt.DD
									).eq(S0_T1.purc_schd_dt)
									.and(S0_M2.arr_skip_flg.eq(value(false)))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("sync_flg"),
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.upri_not_tgt_flg,
						S0_T1.purc_upri_req_typ,
						S0_T1.tax_cd,
						S0_T1.trd_cur_cd,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.outsrc_flg,
						S0_T1.outsrc_itm_ord_no,
						S0_T1.purc_rsn_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T2.wrk_no,
						S0_T2.wrk_nm,
						S0_T1.rqst_can_flg,
						S0_T1.sub_char1.as("po_schd_sub_char1"),
						S0_T1.sub_char2.as("po_schd_sub_char2"),
						S0_T1.sub_char3.as("po_schd_sub_char3"),
						S0_T1.po_cnt_rmrks,
						S0_T1.trd_d_rmrks.as("dtl_trd_d_rmrks"),
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						bracket(
							cases()
								.when(S0_T1.slo_d_no.isNull())
									.then(value(false))
								.otherwise(value(true))
						).as("rqst_slo_flg"),
						S0_T1.po_schd_src_typ,
						S0_T1.po_schd_src_no,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_T1.po_schd_no,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_loc_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.bd_wg_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T1.bd_bp_cd,
						S0_M2.itm_typ,
						S0_M2.itm_typ_d_cd,
						S0_T1.iv_itm_nm.as("po_schd_iv_itm_nm"),
						S0_T1.dlv_nm.as("po_schd_dlv_nm"),
						S0_T1.tdlv_nm.as("po_schd_tdlv_nm"),
						addDynamicSelect(DS0D),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_M99).on(S0_T1.wg_cd.eq(S0_M99.wg_cd))
						.leftOuterJoin(S0_T2).on(S0_T1.sno1.eq(S0_T2.sno1))
						.leftOuterJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd))
						.leftOuterJoin(S0_M361).on(
							S0_T1.itm_cd.eq(S0_M361.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M361.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M361.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M361.itm_sub3))
							.and(S0_M361.lcl_cd.eq(S0_M18.prnt_lcl_cd))
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T1.slo_d_no)
								)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M27.dpt_cd)
								.and(bind("today").between(S0_M27.st_dt, S0_M27.end_dt))
							)
						)
						.addDynamicView(DS0D)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_flg.eq(value(false)))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T1.abort_flg.eq(value(false)))
						.addDynamicPredicate(DS0D)
						.cutoff$and(S0_M2.sundry_itm_flg.eq(bind("sundry_itm_flg_str")))
						.cutoff$and(S0_M18.sppl_iv_flg.eq(bind("iv_trgt_flg_str")))
						.cutoff$and(
							bracket(
								bind("edi_flg_str").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_IFCTL)
										.where(
											S1_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value()))
											.and(S0_T1.sppl_cd.eq(S1_IFCTL.bp_cd))
											.and(bind("today").between(S1_IFCTL.st_dt, S1_IFCTL.end_dt))
											.and(S1_IFCTL.del_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bracket(
									bind("edi_flg_str").eq(value(false))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S1_IFCTL)
											.where(
												S1_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value()))
												.and(S0_T1.sppl_cd.eq(S1_IFCTL.bp_cd))
												.and(bind("today").between(S1_IFCTL.st_dt, S1_IFCTL.end_dt))
												.and(S1_IFCTL.del_flg.eq(value(false)))
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T1.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_T1.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_T1.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T1.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T1.po_schd_dt.gte(bind("po_schd_dt_fr")))
						.cutoff$and(S0_T1.po_schd_dt.lte(bind("po_schd_dt_to")))
						.cutoff$and(S0_M18.subcon_flg.eq(bind("subcon_flg_str")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.in_to_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T1.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_SUNDRYITM.itm_nm,
								S0_T1.itm_nm,
								S0_M2.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T10.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T1.dlv_cd.isNotNull()))
						.cutoff$and(S0_T10.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T1.dlv_cd.isNotNull()))
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_M2.asset_mng_typ.like(bind("asset_mng_typ")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.drct_dlv_typ.like(bind("drct_dlv_typ")))
						.cutoff$and(S0_T1.po_schd_src_typ.like(bind("po_schd_src_typ")))
						.cutoff$and(S0_T1.po_schd_src_no.like(bind("po_schd_src_no")))
						.cutoff$and(S0_T1.rqst_fr_usr_cd.like(bind("rqst_fr_usr_cd")))
						.cutoff$and(S0_T1.rqst_fr_dpt_cd.like(bind("rqst_fr_dpt_cd")))
						.cutoff$and(S0_T1.po_schd_no.like(bind("po_schd_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.po_cnt_rmrks.like(bind("po_cnt_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("po_schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("po_schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("po_schd_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(S0_T1.po_schd_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M2.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M2.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M2.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M2.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M2.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M2.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M2.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M2.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M2.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M2.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M18.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M18.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M18.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M18.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M18.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M18.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M18.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M18.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M18.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M18.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("purc_dpt_nm"))
					.view(DS0D, v -> v.innerJoin(S0_M11).on(S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd).and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M11.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M12).on(S0_T1.wg_cd.eq(S0_M12.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M12.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M10).on(S0_T1.purc_usr_cd.eq(S0_M10.usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M10.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M24).on(S0_T1.trd_cur_cd.eq(S0_M24.cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M24.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.innerJoin(S0_M23).on(S0_M2.itm_typ.eq(S0_M23.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M23.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M23.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("rqst_fr_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M25).on(S0_T1.rqst_fr_usr_cd.eq(S0_M25.usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M25.usr_nm.like(bind("rqst_fr_usr_nm")))),
				when(boundOr("rqst_fr_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M26).on(S0_T1.rqst_fr_dpt_cd.eq(S0_M26.dpt_cd).and(S0_T1.reg_dt.between(S0_M26.st_dt, S0_M26.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M26.dpt_nm.like(bind("rqst_fr_dpt_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M22).on(S0_T1.maker_cd.eq(S0_M22.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M22.bp_nm.like(bind("maker_nm")))),
				when(boundOr("site_cd", "in_to_loc_wg_cd", "in_to_loc_nm", "site_nm", "in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M6).on(S0_T1.in_to_loc_cd.eq(S0_M6.loc_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M6.site_cd.like(bind("site_cd"))).cutoff$and(S0_M6.wg_cd.like(bind("in_to_loc_wg_cd"))).cutoff$and(S0_M6.loc_nm.like(bind("in_to_loc_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M7).on(S0_M6.wg_cd.eq(S0_M7.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M7.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M19).on(S0_M6.site_cd.eq(S0_M19.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M19.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M8).on(S0_T1.str_ln_cd.eq(S0_M8.str_ln_cd).and(S0_T1.in_to_loc_cd.eq(S0_M8.loc_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("dlv_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M20).on(S0_T1.dlv_cd.eq(S0_M20.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_T1.dlv_nm,S0_M20.bp_nm).like(bind("dlv_nm"))))
				)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
						j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm",m.cntry_nm());
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
						.add(MAM_ITM_LCL_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("prnt_lcl_cd")
						))
						.addSelect(m -> toArray(
							m.lcl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("prnt_lcl_cd", m.lcl_cd());
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
							r.setStringNE("trd_cur_nm",m.cur_nm());
							r.setNumberNE("trd_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm",m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm",m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place",m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place",m.upri_dec_place());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("po_print_nm",m.po_print_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1",m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2",m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3",m.tterm_nm());
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
							r.setStringNE("itm_typ_d_nm",m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm",m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg",m.xpns_purc_flg());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm",m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_mng_typ,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm",m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd",m.wg_cd());
							r.setStringNE("site_cd",m.site_cd());
							r.setBooleanNE("str_ln_tgt_flg",m.str_ln_tgt_flg());
							r.setStringNE("outsrc_sppl_cd",m.sppl_cd());
							r.setStringNE("loc_mng_typ",m.loc_mng_typ());
							r.setStringNE("in_to_loc_cal_cd",m.cal_cd());
							r.setStringNE("lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("loc_grp_cd",m.loc_grp_cd());
							r.setStringNE("bef_in_to_loc_wg_cd",m.wg_cd());
							r.setStringNE("bef_lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("bef_loc_grp_cd",m.loc_grp_cd());
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
							r.setStringNE("site_nm",m.site_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm",m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"), 
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm",m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.dlv_cal_cd,
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm",m.bp_nm());
							r.setStringNE("dlv_cntry_cd",m.cntry_cd());
							r.setStringNE("dlv_cal_cd",m.dlv_cal_cd());
							r.setStringNE("dlv_lg_grp_cd",m.lg_grp_cd());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm",m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_nm",m.bp_nm());
							r.setStringNE("tdlv_lg_grp_cd",m.lg_grp_cd());
							r.setStringNE("tdlv_cntry_cd",m.cntry_cd());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm",m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"), 
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place",m.dec_place());
							r.setStringNE("trd_unit_rnd_typ",m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty",m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty",m.conv_qty());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm",m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"), 
							r.getStringNE("itm_sub1"), 
							r.getStringNE("itm_sub2"), 
							r.getStringNE("itm_sub3"), 
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place",m.dec_place());
							r.setStringNE("base_unit_rnd_typ",m.rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm",m.loc_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"), 
							r.getStringNE("bd_itm_sub1"), 
							r.getStringNE("bd_itm_sub2"), 
							r.getStringNE("bd_itm_sub3")
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
							r.setStringNE("bd_itm_nm",m.itm_nm());
							r.setStringNE("bd_lot_mng_typ",m.lot_mng_typ());
							r.setStringNE("bd_sublot_mng_typ",m.sublot_mng_typ());
							r.setStringNE("bd_lot_no_typ",m.lot_no_typ());
							r.setStringNE("bd_sublot_no_typ",m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ",m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ",m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ",m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ",m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm",m.loc_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("bd_dpt_cd"), 
							r.getDateNE("dpt_base_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_dpt_nm",m.dpt_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm",m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm",m.oper_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0090_MST_PURC_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBDL0090_MST_PURC_DLV_SLIP_S01() {
		MSW_PO_P_KEY_R S0_W1 = MSW_PO_P_KEY_R.create("W1");
		MST_PURC_DLV_SLIP_R S0_T1 = MST_PURC_DLV_SLIP_R.create("T1");
		MST_PURC_DLV_SLIP_D_R S0_T2 = MST_PURC_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R S0_T3 = MST_DLV_SLIP_R.create("T3");
		MST_ARR_PR_R S0_T4 = MST_ARR_PR_R.create("T4");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PURC_DLV_SLIP_Query_S01")
				.mainQuery()
				.select(
					S0_T1.po_no,
					S0_T2.po_d_no,
					S0_T1.dlv_slip_no,
					S0_T1.dlv_slip_seq,
					S0_T1.dlv_slip_rev,
					S0_T1.slip_prnt_flg.as("dlv_print_flg"),
					S0_T2.purc_ddlv_dlv_slip_no,
					S0_T3.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
					S0_T3.slip_prnt_flg.as("purc_ddlv_dlv_print_flg")
				)
				.from(
					S0_W1
					.innerJoin(S0_T1).on(
						bracket(
							S0_T1.po_no.eq(S0_W1.po_no)
							.and(S0_W1.po_rev.between(S0_T1.po_rev, S0_T1.last_po_rev))
						)
					)
					.innerJoin(S0_T2).on(
						bracket(
							S0_T2.dlv_slip_mng_no.eq(S0_T1.dlv_slip_mng_no)
							.and(S0_T2.dlv_slip_mng_seq.eq(S0_T1.dlv_slip_mng_seq))
						)
					)
					.leftOuterJoin(S0_T3).on(
						bracket(
							S0_T3.dlv_slip_no.eq(S0_T2.purc_ddlv_dlv_slip_no)
							.and(S0_T3.dlv_slip_seq.eq(S0_T2.purc_ddlv_dlv_slip_seq))
						)
					)
					.leftOuterJoin(S0_T4).on(
						bracket(
							S0_T4.po_d_no.eq(S0_T2.po_d_no)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value())))
					.and(
						value(true).eq(
							cases()
							.when(bind("tmp_can_flg").eq(value(true)))
								.then(
									cases()
									.when(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
									.then(value(true))
									.otherwise(value(false))
								)
								.otherwise(
									cases()
									.when(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
									.then(
											cases()
											.when(
												bracket(
													S0_T4.abort_flg.eq(value(true))
												)
											)
											.then(value(false))
											.otherwise(value(true))
										)
									.otherwise(value(false))
								)
							)
					)
				)
				.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T1.po_rev.desc(),
						S0_T1.last_po_rev.asc(),
						S0_T1.slip_sts_typ.asc()
				)
			);
	}
	
	/**
	 * -- MSBDL0090_MST_PO_SEND_IF_Query_S01
	 */
	static MCQueryPlan MSBDL0090_MST_PO_SEND_IF_S01() {
		MSW_PO_P_KEY_R S0_W1 = MSW_PO_P_KEY_R.create("W1");
		MST_PO_SEND_IF_R S0_W2 = MST_PO_SEND_IF_R.create("W2");
		PFT_SDRV_IF_R S0_W3 = PFT_SDRV_IF_R.create("W3");
		MST_PO_SEND_IF_R S0_T1 = MST_PO_SEND_IF_R.create("T1");
		PFT_SDRV_IF_R S0_T2 = PFT_SDRV_IF_R.create("T2");
		MAM_EXT_SYS_R S0_M1 = MAM_EXT_SYS_R.create("M1");
		MCTempView S0_V1 = createTempView("V1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0090_MST_PO_SEND_IF_Query_S01")
				.mainQuery()
				.select(
					S0_T1.data_lno,
					S0_T1.data_no,
					S0_T1.data_crud_typ,
					S0_T1.po_no,
					S0_T1.po_d_no,
					S0_T1.upd_cntr.as("po_send_if_upd_cntr"),
					S0_T1.exe_sts_typ,
					S0_T2.sdrv_sts_typ
				)
				.from(
					subQuery()
					.select(
						S0_W2.po_no,
						max(S0_W2.data_no).as("data_no")
					)
					.from(
						S0_W1
						.innerJoin(S0_W2).on(
							S0_W2.po_no.eq(S0_W1.po_no)
						)
						.innerJoin(S0_W3).on(
							S0_W3.data_no.eq(S0_W2.data_no)
						)
					)
					.where(
						S0_W2.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value()))
						.and(S0_W3.not_send_flg.eq(value(false)))
					)
					.groupBy(S0_W2.po_no)
					.view(S0_V1)
					.innerJoin(S0_T1).on(
						S0_T1.data_no.eq(S0_V1.pr("data_no"))
					)
					.innerJoin(S0_T2).on(
						S0_T2.data_no.eq(S0_T1.data_no)
					)
					.leftOuterJoin(S0_M1).on(
						S0_M1.ext_sys_cd.eq(S0_T1.ext_sys_cd)
					)
				)
				.where(
					S0_T1.exe_sts_typ.in(
						value(MAC_EXE_STS_TYP.NOT_EXE.value()),
						value(MAC_EXE_STS_TYP.ERR.value())
					)
					.and(S0_T2.sdrv_sts_typ.in(
						value(MAC_SDRV_STS_TYP.NOTYET.value()),
						value(MAC_SDRV_STS_TYP.SEND_CONV_ERR.value()),
						value(MAC_SDRV_STS_TYP.SEND_ERR.value())
					))
					.and(S0_M1.web_api_flg.eq(value(true)))
					.cutoff$and(S0_T1.data_no.eq(bind("data_no")))
				)
			);
	}
}