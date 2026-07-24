package mcframe.serverMSBD.MSBDL0250;

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
	 * -- MSBDL0250_MST_PURC_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBDL0250_MST_PURC_DLV_SLIP_S01() {
		MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("PURCDLVSLIP");
		MST_PURC_DLV_SLIP_D_R PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIPD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MAM_BP_R BP_SPPL = MAM_BP_R.create("BP_SPPL");
		MAM_USR_R USR = MAM_USR_R.create("USR");
		MAM_DPT_R DPT = MAM_DPT_R.create("DPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R BPGRP1 = MAM_BP_GRP_R.create("BPGRP1");
		MAM_BP_GRP_R BPGRP2= MAM_BP_GRP_R.create("BPGRP2");
		MAM_BP_GRP_R BPGRP3= MAM_BP_GRP_R.create("BPGRP3");
		MAM_BP_GRP_R BPGRP4= MAM_BP_GRP_R.create("BPGRP4");
		MAM_BP_GRP_R BPGRP5= MAM_BP_GRP_R.create("BPGRP5");
		MAM_BP_GRP_R BPGRP6= MAM_BP_GRP_R.create("BPGRP6");
		MAM_BP_GRP_R BPGRP7= MAM_BP_GRP_R.create("BPGRP7");
		MAM_BP_GRP_R BPGRP8= MAM_BP_GRP_R.create("BPGRP8");
		MAM_BP_GRP_R BPGRP9= MAM_BP_GRP_R.create("BPGRP9");
		MAM_BP_GRP_R BPGRP10= MAM_BP_GRP_R.create("BPGRP10");

		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
				.setQuery(
					sql("MSBDL0250_MST_PURC_DLV_SLIP_Query_S01")
						.mainQuery()
						.selectDistinct(
							PURCDLVSLIP.purc_dlv_slip_src_typ,
							PURCDLVSLIP.po_no,
							PURCDLVSLIP.po_rev,
							PURCDLVSLIP.dlv_slip_no,
							PURCDLVSLIP.dlv_slip_seq,
							PURCDLVSLIP.dlv_slip_rev,
							PURCDLVSLIP.dlv_slip_mng_no,
							PURCDLVSLIP.dlv_slip_mng_seq,
							PURCDLVSLIP.dlv_inst_grp_no,
							PURCDLVSLIP.prms_rcpt_grp_no,
							trunc(
									PURCDLVSLIP.dlv_rqst_tm,
									MCDateFmt.DD
							).as("dlv_rqst_dt"),
							PURCDLVSLIP.bp_cd.as("sppl_cd"),
							BP_SPPL.bp_nm.as("sppl_nm"),
							PURCDLVSLIP.sppl_cntct_dpt,
							PURCDLVSLIP.sppl_cntct_psn,
							PURCDLVSLIP.usr_cd.as("purc_usr_cd"),
							USR.usr_nm.as("purc_usr_nm"),
							PURCDLVSLIP.dpt_cd.as("purc_dpt_cd"),
							DPT.dpt_nm.as("purc_dpt_nm"),
							PURCDLVSLIP.trd_rmrks,
							PURCDLVSLIP.ins_usr_id,
							PURCDLVSLIP.ins_usr_nm,
							PURCDLVSLIP.ins_func_id,
							PURCDLVSLIP.ins_ts,
							PURCDLVSLIP.upd_cntr,
							PURCDLVSLIP.upd_usr_id,
							PURCDLVSLIP.upd_usr_nm,
							PURCDLVSLIP.upd_func_id,
							PURCDLVSLIP.upd_ts,
							PURCDLVSLIP.upd_srv_req_no,
							addDynamicSelect(REP1),
							addDynamicSelect(DS0C_SPPL_GRP)
						)
						.from(
							PURCDLVSLIP
							.innerJoin(PURCDLVSLIPD).on(
								bracket(
									PURCDLVSLIPD.dlv_slip_mng_no.eq(PURCDLVSLIP.dlv_slip_mng_no)
									.and(PURCDLVSLIPD.dlv_slip_mng_seq.eq(PURCDLVSLIP.dlv_slip_mng_seq))
								)
							)
							.leftOuterJoin(PO).on(
								bracket(
									PO.po_no.eq(PURCDLVSLIP.po_no)
								)
							)
							.leftOuterJoin(BP_SPPL).on(
								bracket(
									PURCDLVSLIP.bp_cd.eq(BP_SPPL.bp_cd)
								)
							)
							.leftOuterJoin(USR).on(
								bracket(
									PURCDLVSLIP.usr_cd.eq(USR.usr_cd)
								)
							)
							.leftOuterJoin(DPT).on(
								bracket(
									PURCDLVSLIP.dpt_cd.eq(DPT.dpt_cd)
									.and(PURCDLVSLIP.dlv_rqst_tm.between(DPT.st_dt, DPT.end_dt))
								)
							)
							.innerJoin(S0_DAC).on(
									bracket(
											S0_DAC.dpt_cd.eq(PURCDLVSLIP.dpt_cd)
										)
									)
							.addDynamicView(REP1)
							.addDynamicView(DS0C_SPPL_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(PURCDLVSLIP.dlv_rqst_tm.gte(bind("dlv_rqst_dt_fr")))
							.cutoff$and(PURCDLVSLIP.dlv_rqst_tm.lte(bind("dlv_rqst_dt_to")))
							.cutoff$and(PURCDLVSLIP.po_no.like(bind("po_no")))
							.cutoff$and(PURCDLVSLIP.po_rev.eq(bind("po_rev")))
							.cutoff$and(PURCDLVSLIP.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(PURCDLVSLIP.dlv_slip_seq.eq(bind("dlv_slip_seq")))
							.cutoff$and(PURCDLVSLIP.purc_dlv_slip_src_typ.like(bind("purc_dlv_slip_src_typ")))
							.cutoff$and(PURCDLVSLIP.dpt_cd.like(bind("purc_dpt_cd")))
							.cutoff$and(DPT.dpt_nm.like(bind("purc_dpt_nm")))
							.cutoff$and(PURCDLVSLIP.usr_cd.like(bind("purc_usr_cd")))
							.cutoff$and(USR.usr_nm.like(bind("purc_usr_nm")))
							.cutoff$and(PURCDLVSLIP.bp_cd.like(bind("sppl_cd")))
							.cutoff$and(BP_SPPL.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(PURCDLVSLIP.trd_rmrks.like(bind("trd_rmrks")))
							.and(value(true).eq(
								cases()
									.when(PURCDLVSLIP.slip_prnt_flg.eq(value(false)))
									.then(
										cases()
										.when(
											bracket(
												BP_SPPL.po_dlv_slip_flg.eq(value(true))
												.and(PURCDLVSLIP.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value())))
											)
											.cutoff$or(bind("tmp_inv_non_prnt_flg").eq(value(true)))
										)
										.then(value(true))
										.when(
											bracket(
												BP_SPPL.dlv_inst_dlv_slip_flg.eq(value(true))
												.and(PURCDLVSLIP.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.DLV_INST.value())))
											)
											.cutoff$or(bind("tmp_inv_non_prnt_flg").eq(value(true)))
										)
										.then(value(true))
										.when(
											bracket(
												BP_SPPL.prms_rcpt_dlv_slip_flg.eq(value(true))
												.and(PURCDLVSLIP.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PRMS_RCPT.value())))
											)
											.cutoff$or(bind("tmp_inv_non_prnt_flg").eq(value(true)))
										)
										.then(value(true))
										.otherwise(bind("tmp_inv_non_prnt_flg"))
								)
								.otherwise(value(true))
							))
							.addDynamicPredicate(REP1)
							.addDynamicPredicate(DS0C_SPPL_GRP)
						)
						.orderBy(
							addDynamicOrderBy(ORDERBY),
							addDynamicOrderBy(REP1)
						)
				)
				.setDynamicSQLInfo(
						when(boundOr("sppl_grp_flg1"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd1.as("sppl_grp_cd1"), BPGRP1.bp_grp_nm.as("sppl_grp_nm1"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP1).on(BP_SPPL.bp_grp_cd1.eq(BPGRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BPGRP1.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(BPGRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
					when(boundOr("sppl_grp_flg2"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd2.as("sppl_grp_cd2"), BPGRP2.bp_grp_nm.as("sppl_grp_nm2"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP2).on(BP_SPPL.bp_grp_cd2.eq(BPGRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BPGRP2.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(BPGRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
					when(boundOr("sppl_grp_flg3"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd3.as("sppl_grp_cd3"), BPGRP3.bp_grp_nm.as("sppl_grp_nm3"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP3).on(BP_SPPL.bp_grp_cd3.eq(BPGRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BPGRP3.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(BPGRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
					when(boundOr("sppl_grp_flg4"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd4.as("sppl_grp_cd4"), BPGRP4.bp_grp_nm.as("sppl_grp_nm4"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP4).on(BP_SPPL.bp_grp_cd4.eq(BPGRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BPGRP4.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(BPGRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
					when(boundOr("sppl_grp_flg5"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd5.as("sppl_grp_cd5"), BPGRP5.bp_grp_nm.as("sppl_grp_nm5"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP5).on(BP_SPPL.bp_grp_cd5.eq(BPGRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BPGRP5.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(BPGRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
					when(boundOr("sppl_grp_flg6"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd6.as("sppl_grp_cd6"), BPGRP6.bp_grp_nm.as("sppl_grp_nm6"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP6).on(BP_SPPL.bp_grp_cd6.eq(BPGRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BPGRP6.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(BPGRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
					when(boundOr("sppl_grp_flg7"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd7.as("sppl_grp_cd7"), BPGRP7.bp_grp_nm.as("sppl_grp_nm7"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP7).on(BP_SPPL.bp_grp_cd7.eq(BPGRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BPGRP7.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(BPGRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
					when(boundOr("sppl_grp_flg8"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd8.as("sppl_grp_cd8"), BPGRP8.bp_grp_nm.as("sppl_grp_nm8"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP8).on(BP_SPPL.bp_grp_cd8.eq(BPGRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BPGRP8.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(BPGRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
					when(boundOr("sppl_grp_flg9"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd9.as("sppl_grp_cd9"), BPGRP9.bp_grp_nm.as("sppl_grp_nm9"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP9).on(BP_SPPL.bp_grp_cd9.eq(BPGRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BPGRP9.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(BPGRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
					when(boundOr("sppl_grp_flg10"))
						.select(DS0C_SPPL_GRP, BP_SPPL.bp_grp_cd10.as("sppl_grp_cd10"), BPGRP10.bp_grp_nm.as("sppl_grp_nm10"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(BPGRP10).on(BP_SPPL.bp_grp_cd10.eq(BPGRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BPGRP10.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(BP_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(BPGRP10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
				);
	}
	/**
	 * MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE01
	 */
	static MCDynamicSQLInfo MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE01() {
		MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("PURCDLVSLIP");
		MST_PURC_DLV_SLIP_D_R PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIPD");
		MST_DLV_SLIP_R DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_PURC_DLV_SLIP_R W1 = MST_PURC_DLV_SLIP_R.create("W1");
		MST_PURC_DLV_SLIP_D_R W2 = MST_PURC_DLV_SLIP_D_R.create("W2");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.select(REP1,
					PURCDLVSLIP.slip_prnt_flg, PURCDLVSLIP.slip_sts_typ,
					PURCDLVSLIPD.purc_ddlv_dlv_slip_no,
					PURCDLVSLIPD.purc_ddlv_dlv_slip_seq,
					DLVSLIP.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
					PURCDLVSLIP.dlv_slip_mng_seq.as("seq"),
					subQuery()
						.select(max(W1.dlv_slip_mng_seq))
						.from(W1)
						.where(W1.dlv_slip_mng_no.eq(PURCDLVSLIP.dlv_slip_mng_no))
						.as("max_seq")
				)
				.view(REP1, v ->
					v.leftOuterJoin(DLVSLIP).on(
						DLVSLIP.dlv_slip_no.eq(PURCDLVSLIPD.purc_ddlv_dlv_slip_no)
						.and(DLVSLIP.dlv_slip_seq.eq(PURCDLVSLIPD.purc_ddlv_dlv_slip_seq))
					)
				)
				.predicate(REP1, p ->
					p.cutoff$and(PURCDLVSLIP.slip_prnt_flg.eq(bind("dlv_prnt_flg_str")))
					.cutoff$and(
						exists(subQuery()
							.select(value("x"))
							.from(W2)
							.where(
								W2.dlv_slip_mng_no.eq(PURCDLVSLIP.dlv_slip_mng_no)
								.and(W2.dlv_slip_mng_seq.eq(PURCDLVSLIP.dlv_slip_mng_seq))
								.and(W2.purc_ddlv_dlv_slip_no.like(bind("purc_ddlv_dlv_slip_no")))
							)
						)
					)
					.and(
							PURCDLVSLIP.slip_sts_typ.eq(decode(
									bind("inv_can_flg"),
									value(true),
									PURCDLVSLIP.slip_sts_typ,
									value(MAC_SLIP_STS_TYP.CRT.value())
								)
							)
					)
					.and(PURCDLVSLIPD.dlv_slip_invalid_flg.eq(value(false)))
					.and(PO.dlv_slip_form_cd.isNotNull())
				);
	}
	/**
	 * MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE02
	 */
	static MCDynamicSQLInfo MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE02() {
		MST_PURC_DLV_SLIP_D_R PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIPD");
		MST_DLV_SLIP_R DLVSLIP1 = MST_DLV_SLIP_R.create("DLVSLIP1");
		MST_DLV_SLIP_R DLVSLIP2 = MST_DLV_SLIP_R.create("DLVSLIP2");
		MST_DLV_SLIP_R W1 = MST_DLV_SLIP_R.create("W1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
			when(null)
				.select(REP1,
					DLVSLIP2.slip_prnt_flg, DLVSLIP2.slip_sts_typ,
					DLVSLIP2.dlv_slip_no.as("purc_ddlv_dlv_slip_no"),
					DLVSLIP2.dlv_slip_seq.as("purc_ddlv_dlv_slip_seq"),
					DLVSLIP2.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
					DLVSLIP2.dlv_slip_seq.as("seq"),
					subQuery()
						.select(max(W1.dlv_slip_seq))
						.from(W1)
						.where(W1.dlv_slip_no.eq(DLVSLIP2.dlv_slip_no))
						.as("max_seq")
				)
				.view(REP1, v ->
					v.innerJoin(DLVSLIP1).on(
						DLVSLIP1.dlv_slip_no.eq(PURCDLVSLIPD.purc_ddlv_dlv_slip_no)
						.and(DLVSLIP1.dlv_slip_seq.eq(PURCDLVSLIPD.purc_ddlv_dlv_slip_seq))
					)
					.innerJoin(DLVSLIP2).on(
						DLVSLIP2.dlv_slip_no.eq(DLVSLIP1.dlv_slip_no)
						.and(DLVSLIP2.dlv_slip_seq.eq(DLVSLIP1.dlv_slip_seq))
					)
				)
				.predicate(REP1, p ->
					p.cutoff$and(PURCDLVSLIPD.purc_ddlv_dlv_slip_no.like(bind("purc_ddlv_dlv_slip_no")))
					.and(
							DLVSLIP2.slip_sts_typ.eq(decode(
									bind("inv_can_flg"),
									value(true),
									DLVSLIP2.slip_sts_typ,
									value(MAC_SLIP_STS_TYP.CRT.value())
								)
							)
					)
					.and(PURCDLVSLIPD.purc_ddlv_dlv_slip_no.isNotNull())
				)
				.orderBy(REP1, DLVSLIP2.dlv_slip_no.asc(), DLVSLIP2.dlv_slip_seq.asc());
	}
	/**
	 *  MSBDL0250_MST_PURC_DLV_SLIP_S01_ORDER_BY
	 */
	static MCDynamicSQLInfo MSBDL0250_MST_PURC_DLV_SLIP_S01_ORDER_BY() {
		MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("PURCDLVSLIP");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

		return when(null)
				.orderBy(ORDERBY,
					PURCDLVSLIP.dlv_slip_no.asc(), PURCDLVSLIP.dlv_slip_mng_no.asc(), PURCDLVSLIP.dlv_slip_mng_seq.asc()
				);
	}
}