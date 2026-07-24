package mcframe.serverMSBE.MSBEL1490;

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
	 * -- MSBEL1490_MST_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBEL1490_MST_DLV_SLIP_S01() {
		MST_DLV_SLIP_R DLV_SLIP1 = MST_DLV_SLIP_R.create("DLV_SLIP1");
		MAM_DPT_R DPT1 = MAM_DPT_R.create("DPT1");
		MAM_USR_R USR1 = MAM_USR_R.create("USR1");
		MAM_TRD_R TRD1 = MAM_TRD_R.create("TRD1");
		MAM_CUR_R CUR1 = MAM_CUR_R.create("CUR1");
		MAM_LOC_R LOC1 = MAM_LOC_R.create("LOC1");
		MAM_BP_R BP1 = MAM_BP_R.create("BP1");
		MAM_BP_R BP2 = MAM_BP_R.create("BP2");
		MAM_BP_LCL_R BP_LCL1 = MAM_BP_LCL_R.create("BP_LCL1");
		MAM_WG_R WG1 = MAM_WG_R.create("WG1");
		MAVM_RD_WG_R RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1490_MST_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						DLV_SLIP1.dlv_slip_no,
						DLV_SLIP1.dlv_slip_seq,
						DLV_SLIP1.dlv_slip_rev,
						DLV_SLIP1.slip_sts_typ,
						DLV_SLIP1.slo_no,
						DLV_SLIP1.dlv_slip_inst_no,
						DLV_SLIP1.dlv_slip_act_no,
						DLV_SLIP1.sls_act_no,
						DLV_SLIP1.ship_dlv_slip_no,
						DLV_SLIP1.dpt_cd,
						DPT1.dpt_nm,
						DLV_SLIP1.usr_cd,
						USR1.usr_nm,
						trunc(
							DLV_SLIP1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						DLV_SLIP1.ship_tm.as("ship_hm"),
						trunc(
							DLV_SLIP1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						DLV_SLIP1.dlv_tm.as("dlv_hm"),
						DLV_SLIP1.ac_dt,
						DLV_SLIP1.trd_cd,
						TRD1.trd_nm,
						DLV_SLIP1.trd_ptn_typ,
						DLV_SLIP1.tax_calc_typ,
						DLV_SLIP1.cst_po_no,
						DLV_SLIP1.trd_cur_cd,
						DLV_SLIP1.trd_cur_nm,
						CUR1.amt_dec_place.as("trd_cur_amt_dec_place"),
						DLV_SLIP1.trd_cur_amt,
						DLV_SLIP1.trd_cur_amt.add(DLV_SLIP1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						DLV_SLIP1.trd_cur_tax_amt,
						DLV_SLIP1.trd_cur_dscnt_amt,
						DLV_SLIP1.base_cur_amt,
						DLV_SLIP1.base_cur_tax_amt,
						DLV_SLIP1.base_cur_dscnt_amt,
						DLV_SLIP1.xrate,
						DLV_SLIP1.ptax_xrate,
						DLV_SLIP1.bp_cd,
						DLV_SLIP1.bp_nm,
						DLV_SLIP1.dlv_id_typ,
						DLV_SLIP1.dlv_id_cd,
						cases()
						.when(DLV_SLIP1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
							.then(
								nvl(
									DLV_SLIP1.dlv_id_nm,
									LOC1.loc_nm
								)
						)
						.otherwise(
							nvl(
								DLV_SLIP1.dlv_id_nm,
								nvl(
									BP_LCL1.bp_nm,
									BP2.bp_nm
								)
							)
						).as("dlv_id_nm"),
						DLV_SLIP1.wg_cd,
						WG1.wg_nm,
						DLV_SLIP1.trd_rmrks,
						DLV_SLIP1.sls_basis_typ,
						DLV_SLIP1.slip_prnt_flg,
						DLV_SLIP1.sls_prnt_flg,
						DLV_SLIP1.ins_usr_id,
						DLV_SLIP1.ins_usr_nm,
						DLV_SLIP1.ins_ts,
						DLV_SLIP1.ins_func_id,
						DLV_SLIP1.upd_cntr,
						DLV_SLIP1.upd_usr_id,
						DLV_SLIP1.upd_usr_nm,
						DLV_SLIP1.upd_ts,
						DLV_SLIP1.upd_func_id,
						DLV_SLIP1.upd_srv_req_no
					)
					.from(
						DLV_SLIP1
						.innerJoin(RD_WG1).on(
							RD_WG1.wg_cd.eq(DLV_SLIP1.wg_cd)
						)
						.leftOuterJoin(DPT1).on(
							DPT1.dpt_cd.eq(DLV_SLIP1.dpt_cd)
							.and(
								nvl(
									DLV_SLIP1.ac_dt,
									DLV_SLIP1.ship_tm
								).between(DPT1.st_dt, DPT1.end_dt)
							)
						)
						.leftOuterJoin(USR1).on(
							USR1.usr_cd.eq(DLV_SLIP1.usr_cd)
						)
						.leftOuterJoin(TRD1).on(
							TRD1.trd_cd.eq(DLV_SLIP1.trd_cd)
						)
						.leftOuterJoin(CUR1).on(
							CUR1.cur_cd.eq(DLV_SLIP1.trd_cur_cd)
						)
						.leftOuterJoin(BP1).on(
							BP1.bp_cd.eq(DLV_SLIP1.bp_cd)
						)
						.leftOuterJoin(BP2).on(
							BP2.bp_cd.eq(DLV_SLIP1.dlv_id_cd)
						)
						.leftOuterJoin(BP_LCL1).on(
							BP_LCL1.bp_cd.eq(DLV_SLIP1.dlv_id_cd)
							.and(BP_LCL1.lcl_cd.eq(BP1.prnt_lcl_cd))
						)
						.leftOuterJoin(LOC1).on(
							LOC1.loc_cd.eq(DLV_SLIP1.dlv_id_cd)
						)
						.leftOuterJoin(WG1).on(
							WG1.wg_cd.eq(DLV_SLIP1.wg_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("inc_past_flg").eq(value(false))
								.and(DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.or(
								bind("inc_past_flg").eq(value(true))
								.and(
									DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.or(DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
								)
							)
						)
						.cutoff$and(DLV_SLIP1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(DLV_SLIP1.bp_cd.like(bind("bp_cd")))
						.cutoff$and(DLV_SLIP1.bp_nm.like(bind("bp_nm")))
						.cutoff$and(DLV_SLIP1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(WG1.wg_nm.like(bind("wg_nm")))
						.cutoff$and(DLV_SLIP1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(DPT1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(DLV_SLIP1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(DLV_SLIP1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(DLV_SLIP1.slo_no.like(bind("slo_no")))
						.cutoff$and(DLV_SLIP1.dlv_slip_inst_no.like(bind("dlv_slip_inst_no")))
						.cutoff$and(DLV_SLIP1.dlv_slip_act_no.like(bind("dlv_slip_act_no")))
						.cutoff$and(DLV_SLIP1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
						.cutoff$and(DLV_SLIP1.trd_rmrks.like(bind("trd_rmrks")))
					)
					.orderBy(
						DLV_SLIP1.dlv_slip_no.asc(),
						DLV_SLIP1.dlv_slip_rev.asc()
					)
			);
	}
	
	/**
	 * -- MSBEL1490_MST_PURC_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBEL1490_MST_PURC_DLV_SLIP_S01() {
		MST_PURC_DLV_SLIP_R PURC_DLV_SLIP1 = MST_PURC_DLV_SLIP_R.create("PURC_DLV_SLIP1");
		MAM_DPT_R DPT1 = MAM_DPT_R.create("DPT1");
		MAM_USR_R USR1 = MAM_USR_R.create("USR1");
		MAM_TRD_R TRD1 = MAM_TRD_R.create("TRD1");
		MAM_CUR_R CUR1 = MAM_CUR_R.create("CUR1");
		MAM_BP_R BP1 = MAM_BP_R.create("BP1");
		MAM_BP_R BP2 = MAM_BP_R.create("BP2");
		MAM_BP_LCL_R BP_LCL1 = MAM_BP_LCL_R.create("BP_LCL1");
		MAM_WG_R WG1 = MAM_WG_R.create("WG1");
		MAVM_RD_WG_R RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1490_MST_PURC_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						PURC_DLV_SLIP1.dlv_slip_no,
						PURC_DLV_SLIP1.dlv_slip_seq,
						PURC_DLV_SLIP1.dlv_slip_rev,
						PURC_DLV_SLIP1.slip_sts_typ,
						PURC_DLV_SLIP1.po_no,
						PURC_DLV_SLIP1.po_rev,
						PURC_DLV_SLIP1.last_po_rev,
						PURC_DLV_SLIP1.dpt_cd,
						DPT1.dpt_nm,
						PURC_DLV_SLIP1.usr_cd,
						USR1.usr_nm,
						trunc(
							PURC_DLV_SLIP1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						PURC_DLV_SLIP1.dlv_rqst_tm.as("dlv_rqst_hm"),
						PURC_DLV_SLIP1.trd_cd,
						TRD1.trd_nm,
						PURC_DLV_SLIP1.trd_ptn_typ,
						PURC_DLV_SLIP1.trd_cur_cd,
						PURC_DLV_SLIP1.trd_cur_nm,
						CUR1.amt_dec_place.as("trd_cur_amt_dec_place"),
						PURC_DLV_SLIP1.trd_cur_amt,
						PURC_DLV_SLIP1.trd_cur_amt.add(PURC_DLV_SLIP1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						PURC_DLV_SLIP1.trd_cur_tax_amt,
						PURC_DLV_SLIP1.trd_cur_dscnt_amt,
						PURC_DLV_SLIP1.base_cur_amt,
						PURC_DLV_SLIP1.base_cur_tax_amt,
						PURC_DLV_SLIP1.base_cur_dscnt_amt,
						PURC_DLV_SLIP1.xrate,
						PURC_DLV_SLIP1.ptax_xrate,
						PURC_DLV_SLIP1.bp_cd,
						BP1.bp_nm,
						PURC_DLV_SLIP1.arr_loc_cd,
						PURC_DLV_SLIP1.arr_loc_nm,
						PURC_DLV_SLIP1.sppl_id_typ,
						PURC_DLV_SLIP1.sppl_id_cd,
						cases()
						.when(PURC_DLV_SLIP1.sppl_id_typ.eq(value(MSC_DLV_ID_TYP.CO.value())))
							.then(
								FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())
						)
						.otherwise(
							nvl(
								BP_LCL1.bp_nm,
								BP2.bp_nm
							)
						).as("sppl_id_nm"),
						PURC_DLV_SLIP1.wg_cd,
						WG1.wg_nm,
						PURC_DLV_SLIP1.trd_rmrks,
						PURC_DLV_SLIP1.slip_prnt_flg,
						PURC_DLV_SLIP1.ins_usr_id,
						PURC_DLV_SLIP1.ins_usr_nm,
						PURC_DLV_SLIP1.ins_ts,
						PURC_DLV_SLIP1.ins_func_id,
						PURC_DLV_SLIP1.upd_cntr,
						PURC_DLV_SLIP1.upd_usr_id,
						PURC_DLV_SLIP1.upd_usr_nm,
						PURC_DLV_SLIP1.upd_ts,
						PURC_DLV_SLIP1.upd_func_id,
						PURC_DLV_SLIP1.upd_srv_req_no
					)
					.from(
						PURC_DLV_SLIP1
						.innerJoin(RD_WG1).on(
							RD_WG1.wg_cd.eq(PURC_DLV_SLIP1.wg_cd)
						)
						.leftOuterJoin(DPT1).on(
							DPT1.dpt_cd.eq(PURC_DLV_SLIP1.dpt_cd)
							.and(PURC_DLV_SLIP1.dlv_rqst_tm.between(DPT1.st_dt, DPT1.end_dt))
						)
						.leftOuterJoin(USR1).on(
							USR1.usr_cd.eq(PURC_DLV_SLIP1.usr_cd)
						)
						.leftOuterJoin(TRD1).on(
							TRD1.trd_cd.eq(PURC_DLV_SLIP1.trd_cd)
						)
						.leftOuterJoin(CUR1).on(
							CUR1.cur_cd.eq(PURC_DLV_SLIP1.trd_cur_cd)
						)
						.leftOuterJoin(BP1).on(
							BP1.bp_cd.eq(PURC_DLV_SLIP1.bp_cd)
						)
						.leftOuterJoin(BP2).on(
							BP2.bp_cd.eq(PURC_DLV_SLIP1.sppl_id_cd)
						)
						.leftOuterJoin(BP_LCL1).on(
							BP_LCL1.bp_cd.eq(PURC_DLV_SLIP1.sppl_id_cd)
							.and(BP_LCL1.lcl_cd.eq(BP1.prnt_lcl_cd))
						)
						.leftOuterJoin(WG1).on(
							WG1.wg_cd.eq(PURC_DLV_SLIP1.wg_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("inc_past_flg").eq(value(false))
								.and(PURC_DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.or(
								bind("inc_past_flg").eq(value(true))
								.and(
									PURC_DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.or(PURC_DLV_SLIP1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
								)
							)
						)
						.cutoff$and(PURC_DLV_SLIP1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(PURC_DLV_SLIP1.bp_cd.like(bind("bp_cd")))
						.cutoff$and(BP1.bp_nm.like(bind("bp_nm")))
						.cutoff$and(PURC_DLV_SLIP1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(WG1.wg_nm.like(bind("wg_nm")))
						.cutoff$and(PURC_DLV_SLIP1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(DPT1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(PURC_DLV_SLIP1.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(PURC_DLV_SLIP1.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(PURC_DLV_SLIP1.po_no.like(bind("po_no")))
						.cutoff$and(PURC_DLV_SLIP1.trd_rmrks.like(bind("trd_rmrks")))
					)
					.orderBy(
						PURC_DLV_SLIP1.dlv_slip_no.asc(),
						PURC_DLV_SLIP1.dlv_slip_rev.asc()
					)
			);
	}
}