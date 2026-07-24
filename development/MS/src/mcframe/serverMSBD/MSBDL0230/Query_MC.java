package mcframe.serverMSBD.MSBDL0230;

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
	 * -- MSBDL0230_MST_ARR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0230_MST_ARR_SCHD_S01() {
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_ARR_PR_R S0_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_DLV_INST_RCPT_R S0_DLVINSTRCPT = MST_DLV_INST_RCPT_R.create("DLVINSTRCPT");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_PURC_DLV_SLIP_R S0_PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("PURCDLVSLIP");
		MST_PURC_DLV_SLIP_D_R S0_PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIPD");
		MST_DLV_SLIP_R S0_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		
		MAM_EDI_IF_CTL_R CTL = MAM_EDI_IF_CTL_R.create("CTL");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");
		
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DIV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDIV");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_STRLN = MAM_STR_LN_R.create("STRLN");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_CNTRY_R S0_CNTRYT = MAM_CNTRY_R.create("CNTRYT");
		MAM_LG_GRP_R S0_LGGRP = MAM_LG_GRP_R.create("LGGRP");
		MAM_LG_GRP_R S0_LGGRPT = MAM_LG_GRP_R.create("LGGRPT");
		MAM_ITM_TYP_D_R S0_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");

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

		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0230_MST_ARR_SCHD_S01")
					.mainQuery()
					.selectDistinct(
						S0_POD.po_no,
						S0_ARRPR.po_d_no,
						S0_ARRPR.purc_sts_typ,
						S0_PO.po_dt,
						S0_PO.sppl_cd,
						S0_SPPL.bp_nm.as("sppl_nm"),
						S0_PO.purc_dpt_cd,
						S0_DPT.dpt_nm.as("purc_dpt_nm"),
						S0_ARRSCHD.itm_cd,
						S0_ARRSCHD.itm_sub1,
						S0_ARRSCHD.itm_sub2,
						S0_ARRSCHD.itm_sub3,
						decode(
							S0_ARRSCHD.sundry_itm_flg,
							value(true),
							S0_ARRSCHD.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_SLOD.cst_itm_cd,
						S0_SLOD.cst_itm_nm,
						S0_POD.trd_unit_cd.as("src_trd_unit_cd"),
						S0_POD.trd_unit_qty.as("src_trd_unit_qty"),
						trunc(
							S0_ARRSCHD.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_ARRSCHD.arr_schd_tm.as("arr_schd_hm"),
						bind("today").as("dlv_inst_dt"),
						trunc(
							S0_ARRSCHD.arr_schd_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_ARRSCHD.arr_schd_tm.as("dlv_rqst_hm"),
						S0_PURCSCHD.purc_schd_dt,
						S0_ARRSCHD.sync_flg,
						S0_ARRSCHD.arr_loc_cd.as("in_to_loc_cd"),
						S0_LOC.loc_nm.as("in_to_loc_nm"),
						S0_ARRSCHD.str_ln_cd.as("in_to_str_ln_cd"),
						S0_STRLN.str_ln_nm.as("in_to_str_ln_nm"),
						S0_ARRSCHD.trd_unit_cd,
						S0_ARRSCHD.trd_unit_qty,
						S0_ARRSCHD.base_unit_cd,
						S0_ARRSCHD.base_unit_qty,
						S0_ARRSCHD.mfg_inst_no,
						S0_ARRSCHD.purc_act_d_no,
						S0_ARRSCHD.arr_schd_tm.as("prms_dlv_dt"),
						S0_ARRSCHD.arr_schd_tm.as("prms_dlv_hm"),
						S0_PURCSCHD.purc_schd_dt,
						S0_ARRSCHD.sync_flg,
						nullValue().as("inst_dlv_cd"),
						nullValue().as("dlv_nm"),
						nullValue().as("dlv_sundry_flg"),
						nullValue().as("pri_prnt_flg"),
						nullValue().as("dlv_lg_grp_cd"),
						nullValue().as("dlv_lg_grp_nm"),
						nullValue().as("dlv_cntry_cd"),
						nullValue().as("dlv_cntry_nm"),
						nullValue().as("dlv_zip_cd"),
						nullValue().as("dlv_addr1"),
						nullValue().as("dlv_addr2"),
						nullValue().as("dlv_addr3"),
						nullValue().as("dlv_addr4"),
						nullValue().as("dlv_tel"),
						nullValue().as("dlv_fax"),
						nullValue().as("dlv_cntct_dpt"),
						nullValue().as("dlv_cntct_psn"),
						nullValue().as("tdlv_req_flg"),
						nullValue().as("tdlv_cd"),
						nullValue().as("tdlv_nm"),
						nullValue().as("tdlv_sundry_flg"),
						nullValue().as("tdlv_lg_grp_cd"),
						nullValue().as("tdlv_lg_grp_nm"),
						nullValue().as("tdlv_cntry_cd"),
						nullValue().as("tdlv_cntry_nm"),
						nullValue().as("tdlv_zip_cd"),
						nullValue().as("tdlv_addr1"),
						nullValue().as("tdlv_addr2"),
						nullValue().as("tdlv_addr3"),
						nullValue().as("tdlv_addr4"),
						nullValue().as("tdlv_tel"),
						nullValue().as("tdlv_fax"),
						nullValue().as("tdlv_cntct_dpt"),
						nullValue().as("tdlv_cntct_psn"),
						nullValue().as("dlv_inst_rcpt_no"),
						S0_ARRSCHD.ins_usr_id,
						S0_ARRSCHD.ins_usr_nm,
						S0_ARRSCHD.ins_func_id,
						S0_ARRSCHD.ins_ts,
						S0_ARRSCHD.upd_usr_id,
						S0_ARRSCHD.upd_usr_nm,
						S0_ARRSCHD.upd_func_id,
						S0_ARRSCHD.upd_ts,
						S0_ARRSCHD.upd_srv_req_no,
						S0_PURCSCHD.purc_schd_no,
						S0_ARRSCHD.arr_schd_no,
						S0_ARRSCHD.arr_qty,
						S0_ARRSCHD.abort_qty.as("act_abort_qty"),
						S0_ARRSCHD.purc_qty.as("purc_act_qty"),
						S0_PURCSCHD.base_unit_abort_qty.as("purc_abort_qty"),
						S0_PURCSCHD.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
						S0_PURCSCHD.base_unit_schd_qty.as("base_unit_purc_schd_qty"),
						S0_PURCSCHD.cmpl_flg.as("purc_cmpl_flg"),
						S0_PURCSCHD.non_purc_flg,
						S0_ARRSCHD.cmpl_flg.as("arr_cmpl_flg"),
						S0_ARRSCHD.arr_skip_flg,
						S0_ARRPR.arr_pr_no,
						S0_ARRPR.upd_cntr.as("arr_pr_upd_cntr"),
						S0_POD.outsrc_flg,
						S0_POD.slo_d_no,
						S0_POD.purc_basis_typ,
						S0_POD.purc_id_typ,
						S0_POD.dlv_cd,
						S0_POD.mfg_loc_cd,
						S0_POD.bom_ptn,
						S0_POD.maker_cd,
						S0_ARRSCHD.arr_qty,
						S0_ARRSCHD.arr_skip_flg,
						decode(
							S0_EDI.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
								).as("edi_tgt_flg"),
						value(false).as("edi_flg"),
						S0_SPPL.dlv_inst_dlv_slip_flg,
						subQuery()
						.select(EXTSYS.ext_sys_typ)
						.from(
							EXTSYS
							.innerJoin(CTL).on(
								EXTSYS.ext_sys_cd.eq(CTL.ext_sys_cd)
								.and(EXTSYS.del_flg.eq(value(false))))
							)
						.where(
							CTL.bp_cd.eq(S0_PO.sppl_cd)
							.and(bind("today").between(CTL.st_dt, CTL.end_dt))
							.and(CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
							.and(CTL.del_flg.eq(value(false)))
						).as("dlv_inst_ext_sys_typ"),
						S0_ARRSCHD.dlv_slip_no,
						S0_PURCDLVSLIP.dlv_slip_mng_no,
						S0_PURCDLVSLIP.dlv_slip_mng_seq,
						S0_PURCDLVSLIP.dlv_slip_seq,
						S0_PURCDLVSLIP.dlv_slip_rev,
						S0_PURCDLVSLIP.slip_prnt_flg.as("dlv_slip_printed_flg"),
						S0_PURCDLVSLIPD.dlv_slip_d_no,
						S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_no,
						S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_seq,
						decode(
								S0_SLOD.proc_typ,
								value(MAC_SLO_PROC_TYP.PURC_DDLV.value()),
								value(true),
								value(false)
							).as("purc_ddlv_flg"),
						S0_DLVSLIP.slip_prnt_flg.as("purc_ddlv_dlv_slip_printed_flg"),
						S0_DLVSLIP.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
						S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_d_no,
						S0_POD.slo_no,
						addDynamicSelect(DS0D),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
							
					)
					.from(
						S0_ARRSCHD
						.leftOuterJoin(S0_ARRPR).on(
							bracket(
								S0_ARRPR.arr_pr_no.eq(S0_ARRSCHD.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_PURCSCHD).on(
							bracket(
								S0_PURCSCHD.arr_schd_no.eq(S0_ARRSCHD.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_POD).on(
							bracket(
								S0_POD.po_d_no.eq(S0_ARRPR.po_d_no)
							)
						)
						.innerJoin(S0_PO).on(
							bracket(
								S0_PO.po_no.eq(S0_POD.po_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_POD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_PURCDLVSLIP).on(
							bracket(
								S0_PURCDLVSLIP.dlv_slip_mng_no.eq(S0_ARRSCHD.dlv_slip_mng_no)
								.and(S0_PURCDLVSLIP.dlv_slip_mng_seq.eq(S0_ARRSCHD.dlv_slip_mng_seq))
							)
						)
						.leftOuterJoin(S0_PURCDLVSLIPD).on(
							bracket(
								S0_PURCDLVSLIPD.dlv_slip_mng_d_no.eq(S0_ARRSCHD.dlv_slip_mng_d_no)
								.and(S0_PURCDLVSLIPD.dlv_slip_mng_d_seq.eq(S0_ARRSCHD.dlv_slip_mng_d_seq))
							)
						)
						.leftOuterJoin(S0_DLVSLIP).on(
							bracket(
								S0_DLVSLIP.dlv_slip_no.eq(S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_no)
								.and(S0_DLVSLIP.dlv_slip_seq.eq(S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_ARRSCHD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_ARRSCHD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_ARRSCHD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_ARRSCHD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
							bracket(
								S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
								.and(S0_PO.sppl_cd.eq(S0_EDI.bp_cd)
								.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
								.and(S0_EDI.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_PO.purc_dpt_cd)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_LOC.loc_cd.eq(S0_ARRSCHD.arr_loc_cd)
							)
						)
						.leftOuterJoin(S0_STRLN).on(
							bracket(
								S0_STRLN.str_ln_cd.eq(S0_ARRSCHD.str_ln_cd)
								.and(S0_STRLN.loc_cd.eq(S0_ARRSCHD.arr_loc_cd))
							)
						)
						.addDynamicView(DS0D)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_ARRSCHD.dlv_inst_d_no.isNull())
						.and(S0_ARRSCHD.rcpt_iv_no.isNull())
						.and(S0_ARRSCHD.abort_qty.isNull().or(S0_ARRSCHD.abort_qty.eq(value(0))))
						.and(S0_PURCSCHD.base_unit_abort_qty.isNull().or(S0_PURCSCHD.base_unit_abort_qty.eq(value(0))))
						.and(S0_ARRSCHD.cmpl_flg.eq(value(false))
							.or(S0_ARRSCHD.cmpl_flg.eq(value(true)).and(S0_ARRSCHD.arr_skip_flg.eq(value(true)))))
						.and(S0_PURCSCHD.cmpl_flg.eq(value(false))
							.or(S0_PURCSCHD.cmpl_flg.eq(value(true)).and(S0_PURCSCHD.non_purc_flg.eq(value(true)))))
						.cutoff$and(S0_ARRSCHD.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
						.cutoff$and(S0_ARRSCHD.arr_schd_tm.lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_PO.po_dt.gte(bind("po_dt_fr")))
						.cutoff$and(S0_PO.po_dt.lte(bind("po_dt_to")))
						.cutoff$and(S0_ARRPR.dlv_inst_dt.gte(bind("dlv_inst_dt_fr")))
						.cutoff$and(S0_ARRPR.dlv_inst_dt.lte(bind("dlv_inst_dt_to")))
						.cutoff$and(S0_ARRPR.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_ARRPR.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_ARRPR.prms_rcpt_dt.gte(bind("dlv_inst_dt_fr")))
						.cutoff$and(S0_ARRPR.dlv_inst_dt.lte(bind("dlv_inst_dt_to")))
						.cutoff$and(S0_ARRPR.purc_sts_typ.like(bind("purc_sts_typ")))
						.cutoff$and(S0_PO.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_ARRSCHD.arr_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("in_to_loc_nm")))
						.cutoff$and(S0_ARRSCHD.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STRLN.str_ln_cd.like(bind("str_ln_nm")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_ARRSCHD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_ARRSCHD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_ARRSCHD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_ARRSCHD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_POD.po_no.like(bind("po_no")))
						.cutoff$and(S0_ARRPR.po_d_no.like(bind("po_d_no")))
						.cutoff$and(decode(
							S0_EDI.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).eq(bind("edi_flg_str")))
						.addDynamicPredicate(DS0D)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_ARRPR.po_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_typ_d_nm"))
						.view(DS0D, v -> v.innerJoin(S0_ITMTYP).on(S0_ITM.itm_typ.eq(S0_ITMTYP.itm_typ).and(S0_ITMTYP.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
						.predicate(DS0D, p -> p.cutoff$and(S0_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("dlv_inst_rcpt_flg"))
						.select(DS0D, 
							//仕入直送の場合、納入指示受領のデータを検索する
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull())
								)
								.then(
									trunc(
										S0_DLVINSTRCPT.dlv_rqst_tm,
										MCDateFmt.DD
									)
								)
								.otherwise(
									trunc(
										S0_ARRSCHD.arr_schd_tm,
										MCDateFmt.DD
									)
								).as("dlv_rqst_dt"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_rqst_tm)
								.otherwise(S0_ARRSCHD.arr_schd_tm)
								.as("dlv_rqst_hm"),
							decode(
								S0_DLVINSTRCPT.dlv_inst_rcpt_no,
								nullValue(),
								S0_PURCSCHD.purc_schd_dt,
								trunc(
									S0_DLVINSTRCPT.dlv_rqst_tm,
									MCDateFmt.DD
								)
							).as("purc_schd_dt"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.trd_unit_cd)
								.otherwise(S0_ARRSCHD.trd_unit_cd).as("trd_unit_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.trd_unit_qty)
								.otherwise(S0_ARRSCHD.trd_unit_qty).as("trd_unit_qty"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.base_unit_cd)
								.otherwise(S0_ARRSCHD.base_unit_cd).as("base_unit_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.base_unit_qty)
								.otherwise(S0_ARRSCHD.base_unit_qty).as("base_unit_qty"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_cd)
								.otherwise(nullValue()).as("inst_dlv_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull())
									.and(S0_DLVINSTRCPT.dlv_sundry_flg.eq(value(true))))
								.then(S0_DLVINSTRCPT.dlv_nm)
								.when(bind("dlv_inst_rcpt_flg").eq(value(false)))
								.then(nullValue())
								.otherwise(S0_DLV.bp_nm).as("dlv_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_sundry_flg)
								.otherwise(nullValue()).as("dlv_sundry_flg"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.pri_prnt_flg)
								.otherwise(nullValue()).as("pri_prnt_flg"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_lg_grp_cd)
								.otherwise(nullValue()).as("dlv_lg_grp_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_LGGRP.lg_grp_nm)
								.otherwise(nullValue()).as("dlv_lg_grp_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLV.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_CNTRY.cntry_nm)
								.otherwise(nullValue()).as("dlv_cntry_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_zip_cd)
								.otherwise(nullValue()).as("dlv_zip_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_addr1)
								.otherwise(nullValue()).as("dlv_addr1"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_addr2)
								.otherwise(nullValue()).as("dlv_addr2"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_addr3)
								.otherwise(nullValue()).as("dlv_addr3"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_addr4)
								.otherwise(nullValue()).as("dlv_addr4"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_tel)
								.otherwise(nullValue()).as("dlv_tel"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_fax)
								.otherwise(nullValue()).as("dlv_fax"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_cntct_dpt)
								.otherwise(nullValue()).as("dlv_cntct_dpt"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_cntct_psn)
								.otherwise(nullValue()).as("dlv_cntct_psn"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLV.tdlv_req_flg)
								.otherwise(nullValue()).as("tdlv_req_flg"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_cd)
								.otherwise(nullValue()).as("tdlv_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull())
									.and(S0_DLVINSTRCPT.tdlv_sundry_flg.eq(value(true))))
								.then(S0_DLVINSTRCPT.tdlv_nm)
								.when(bind("dlv_inst_rcpt_flg").eq(value(false)))
								.then(nullValue())
								.otherwise(S0_TDLV.bp_nm).as("tdlv_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_sundry_flg)
								.otherwise(nullValue()).as("tdlv_sundry_flg"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_lg_grp_cd)
								.otherwise(nullValue()).as("tdlv_lg_grp_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_LGGRPT.lg_grp_nm)
								.otherwise(nullValue()).as("tdlv_lg_grp_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_TDLV.cntry_cd)
								.otherwise(nullValue()).as("tdlv_cntry_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_CNTRYT.cntry_nm)
								.otherwise(nullValue()).as("tdlv_cntry_nm"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_zip_cd)
								.otherwise(nullValue()).as("tdlv_zip_cd"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_addr1)
								.otherwise(nullValue()).as("tdlv_addr1"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_addr2)
								.otherwise(nullValue()).as("tdlv_addr2"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_addr3)
								.otherwise(nullValue()).as("tdlv_addr3"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_addr4)
								.otherwise(nullValue()).as("tdlv_addr4"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_tel)
								.otherwise(nullValue()).as("tdlv_tel"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_fax)
								.otherwise(nullValue()).as("tdlv_fax"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_cntct_dpt)
								.otherwise(nullValue()).as("tdlv_cntct_dpt"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.tdlv_cntct_psn)
								.otherwise(nullValue()).as("tdlv_cntct_psn"),
							cases()
								.when(bind("dlv_inst_rcpt_flg").eq(value(true))
									.and(S0_DLVINSTRCPT.dlv_inst_rcpt_no.isNotNull()))
								.then(S0_DLVINSTRCPT.dlv_inst_rcpt_no)
								.otherwise(nullValue()).as("dlv_inst_rcpt_no")
						)
						.view(DS0D, v -> v.leftOuterJoin(S0_DLVINSTRCPT).on(
							bracket(
								S0_DLVINSTRCPT.slo_d_no.eq(S0_POD.slo_d_no)
								.and(S0_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
								.and(S0_DLVINSTRCPT.can_flg.eq(value(false)))
							))
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_DLV.bp_cd.eq(S0_DLVINSTRCPT.dlv_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_TDLV.bp_cd.eq(S0_DLVINSTRCPT.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								S0_CNTRY.cntry_cd.eq(S0_DLV.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRYT).on(
							bracket(
								S0_CNTRYT.cntry_cd.eq(S0_TDLV.cntry_cd)
							)
						)
						.leftOuterJoin(S0_LGGRP).on(
							bracket(
								S0_LGGRP.lg_grp_cd.eq(S0_DLVINSTRCPT.dlv_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_LGGRPT).on(
							bracket(
								S0_LGGRPT.lg_grp_cd.eq(S0_DLVINSTRCPT.tdlv_lg_grp_cd)
							)
						)),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_ITM.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_ITM.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_ITM.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_ITM.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_ITM.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_ITM.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_ITM.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_ITM.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_ITM.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_ITM.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("sppl_grp_flg1"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_SPPL.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
					when(boundOr("sppl_grp_flg2"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_SPPL.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
					when(boundOr("sppl_grp_flg3"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_SPPL.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
					when(boundOr("sppl_grp_flg4"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_SPPL.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
					when(boundOr("sppl_grp_flg5"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_SPPL.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
					when(boundOr("sppl_grp_flg6"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_SPPL.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
					when(boundOr("sppl_grp_flg7"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_SPPL.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
					when(boundOr("sppl_grp_flg8"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_SPPL.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
					when(boundOr("sppl_grp_flg9"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_SPPL.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
					when(boundOr("sppl_grp_flg10"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_SPPL.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
				)
			.setJoinInfo(
				joinInfo(
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd,
							m.subcon_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.wg_cd,
							m.site_cd,
							m.lg_grp_cd,
							m.sppl_cd,
							m.cal_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("in_to_loc_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setBooleanNE("in_to_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
						j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.assort_typ,
							m.cst_cd,
							m.slo_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("slo_dt", m.slo_dt());
							r.setStringNE("cst_cd", m.cst_cd());
							r.setStringNE("assort_typ", m.assort_typ());
					}),
						j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.set_itm_grp_no
						))
						.addMap((r, m) -> {
							r.setNumberNE("set_itm_grp_no", m.set_itm_grp_no());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.dlv_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cal_cd", m.dlv_cal_cd());
					})
				)
			);
	}

	/**
	 * -- MSBDL0230_MST_DLV_INST_D_Query_S01
	 */
	static MCQueryPlan MSBDL0230_MST_DLV_INST_D_S01() {
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_ARR_PR_R S0_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_DLV_INST_D_R S0_DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MST_DLV_INST_R S0_DLVINST = MST_DLV_INST_R.create("DLVINST");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_PURC_DLV_SLIP_R S0_PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("PURCDLVSLIP");
		MST_PURC_DLV_SLIP_D_R S0_PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIPD");
		MST_DLV_SLIP_R S0_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MAM_EDI_IF_CTL_R CTL = MAM_EDI_IF_CTL_R.create("CTL");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");

		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DIV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDIV");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_STRLN = MAM_STR_LN_R.create("STRLN");
		MAM_ITM_TYP_D_R S0_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");
		
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

		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0230_MST_DLV_INST_D_Query_S01")
					.mainQuery()
					.select(
							S0_POD.po_no,
							S0_DLVINST.po_d_no,
							S0_ARRPR.purc_sts_typ,
							S0_PO.po_dt,
							S0_PO.sppl_cd,
							S0_SPPL.bp_nm.as("sppl_nm"),
							S0_PO.purc_dpt_cd,
							S0_DPT.dpt_nm.as("purc_dpt_nm"),
							S0_POD.itm_cd,
							S0_POD.itm_sub1,
							S0_POD.itm_sub2,
							S0_POD.itm_sub3,
							decode(
								S0_POD.sundry_itm_flg,
								value(true),
								S0_POD.itm_nm,
								S0_ITM.itm_nm
							).as("itm_nm"),
							S0_SLOD.cst_itm_cd,
							S0_SLOD.cst_itm_nm,
							S0_POD.trd_unit_cd.as("src_trd_unit_cd"),
							S0_POD.trd_unit_qty.as("src_trd_unit_qty"),
							trunc(
								S0_ARRSCHD.arr_schd_tm,
								MCDateFmt.DD
							).as("arr_schd_dt"),
							S0_ARRSCHD.arr_schd_tm.as("arr_schd_hm"),
							S0_DLVINST.dlv_inst_dt,
							S0_DLVINST.dlv_inst_print_dt,
							S0_DLVINST.dlv_inst_print_rmrks,
							S0_DLVINST.dlv_inst_print_flg.as("dlv_inst_printed_flg"),
							S0_DLVINST.dlv_inst_no,
							S0_DLVINST.dlv_inst_rev,
							S0_DLVINST.can_flg,
							S0_DLVINST.intr_rmrks,
							S0_DLVINST.sub_char1,
							S0_DLVINST.sub_char2,
							S0_DLVINST.sub_char3,
							S0_DLVINST.dlv_inst_grp_no,
							trunc(
								S0_DLVINSTD.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S0_DLVINSTD.dlv_rqst_tm.as("dlv_rqst_hm"),
							S0_DLVINSTD.purc_schd_dt,
							S0_DLVINSTD.sync_flg,
							S0_DLVINSTD.in_to_loc_cd,
							S0_LOC.loc_nm.as("in_to_loc_nm"),
							S0_DLVINSTD.str_ln_cd.as("in_to_str_ln_cd"),
							S0_STRLN.str_ln_nm.as("in_to_str_ln_nm"),
							S0_DLVINSTD.trd_unit_cd,
							S0_DLVINSTD.trd_unit_qty,
							S0_DLVINSTD.base_unit_cd,
							S0_DLVINSTD.base_unit_qty,
							S0_DLVINSTD.mfg_inst_no,
							S0_DLVINSTD.purc_act_d_no,
							S0_DLVINSTD.can_flg.as("dtl_can_flg"),
							S0_DLVINSTD.dlv_inst_print_d_rmrks,
							S0_DLVINSTD.intr_rmrks.as("dtl_intr_rmrks"),
							S0_DLVINSTD.dlv_slip_d_rmrks,
							S0_DLVINSTD.sub_char1.as("dtl_sub_char1"),
							S0_DLVINSTD.sub_char2.as("dtl_sub_char2"),
							S0_DLVINSTD.sub_char3.as("dtl_sub_char3"),
							S0_DLVINSTD.dlv_inst_d_no,
							S0_DLVINSTD.dlv_cd.as("inst_dlv_cd"),
							decode(
								S0_DLVINSTD.dlv_sundry_flg,
								value(true),
								S0_DLVINSTD.dlv_nm,
								S0_DLV.bp_nm
							).as("dlv_nm"),
							S0_DLVINSTD.dlv_sundry_flg,
							S0_DLVINSTD.pri_prnt_flg,
							S0_DLVINSTD.dlv_lg_grp_cd,
							S0_DLV.cntry_cd.as("dlv_cntry_cd"),
							S0_DLVINSTD.dlv_zip_cd,
							S0_DLVINSTD.dlv_addr1,
							S0_DLVINSTD.dlv_addr2,
							S0_DLVINSTD.dlv_addr3,
							S0_DLVINSTD.dlv_addr4,
							S0_DLVINSTD.dlv_tel,
							S0_DLVINSTD.dlv_fax,
							S0_DLVINSTD.dlv_cntct_dpt,
							S0_DLVINSTD.dlv_cntct_psn,
							S0_DLVINSTD.tdlv_cd,
							decode(
								S0_DLVINSTD.tdlv_sundry_flg,
								value(true),
								S0_DLVINSTD.tdlv_nm,
								S0_TDLV.bp_nm
							).as("tdlv_nm"),
							S0_DLVINSTD.tdlv_sundry_flg,
							S0_DLVINSTD.tdlv_lg_grp_cd,
							S0_TDLV.cntry_cd.as("tdlv_cntry_cd"),
							S0_DLVINSTD.tdlv_zip_cd,
							S0_DLVINSTD.tdlv_addr1,
							S0_DLVINSTD.tdlv_addr2,
							S0_DLVINSTD.tdlv_addr3,
							S0_DLVINSTD.tdlv_addr4,
							S0_DLVINSTD.tdlv_tel,
							S0_DLVINSTD.tdlv_fax,
							S0_DLVINSTD.tdlv_cntct_dpt,
							S0_DLVINSTD.tdlv_cntct_psn,
							S0_TDLV.tdlv_req_flg,
							S0_DLVINSTD.ins_usr_id,
							S0_DLVINSTD.ins_usr_nm,
							S0_DLVINSTD.ins_func_id,
							S0_DLVINSTD.ins_ts,
							S0_DLVINSTD.upd_usr_id,
							S0_DLVINSTD.upd_usr_nm,
							S0_DLVINSTD.upd_func_id,
							S0_DLVINSTD.upd_ts,
							S0_DLVINSTD.upd_srv_req_no,
							S0_ARRPR.arr_pr_no,
							S0_ARRPR.upd_cntr.as("arr_pr_upd_cntr"),
							S0_POD.outsrc_flg,
							S0_DLVINST.dlv_inst_rev,
							S0_PURCSCHD.purc_schd_no,
							S0_ARRSCHD.arr_schd_no,
							S0_ARRSCHD.arr_qty,
							S0_ARRSCHD.cmpl_flg.as("arr_cmpl_flg"),
							S0_ARRSCHD.abort_qty.as("act_abort_qty"),
							S0_ARRSCHD.purc_qty.as("purc_act_qty"),
							S0_PURCSCHD.base_unit_abort_qty.as("purc_abort_qty"),
							S0_PURCSCHD.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
							S0_PURCSCHD.cmpl_flg.as("purc_cmpl_flg"),
							S0_PURCSCHD.non_purc_flg,
							S0_ARRSCHD.arr_skip_flg,
							S0_POD.slo_d_no,
							S0_POD.purc_basis_typ,
							S0_POD.purc_id_typ,
							S0_POD.dlv_cd,
							S0_POD.mfg_loc_cd,
							S0_POD.bom_ptn,
							S0_POD.maker_cd,
							decode(
								S0_EDI.if_proc_typ,
								nullValue(),
								value(false),
								value(true)
							).as("edi_tgt_flg"),
							S0_DLVINST.edi_flg,
							S0_SPPL.dlv_inst_dlv_slip_flg,
							subQuery()
							.select(EXTSYS.ext_sys_typ)
							.from(
								EXTSYS
								.innerJoin(CTL).on(
									EXTSYS.ext_sys_cd.eq(CTL.ext_sys_cd)
									.and(EXTSYS.del_flg.eq(value(false))))
								)
							.where(
								CTL.bp_cd.eq(S0_PO.sppl_cd)
								.and(bind("today").between(CTL.st_dt, CTL.end_dt))
								.and(CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
								.and(CTL.del_flg.eq(value(false)))
							).as("dlv_inst_ext_sys_typ"),
							S0_ARRSCHD.dlv_slip_no,
							S0_PURCDLVSLIP.dlv_slip_mng_no,
							S0_PURCDLVSLIP.dlv_slip_mng_seq,
							S0_PURCDLVSLIP.dlv_slip_seq,
							S0_PURCDLVSLIP.dlv_slip_rev,
							S0_PURCDLVSLIP.slip_prnt_flg.as("dlv_slip_printed_flg"),
							S0_PURCDLVSLIPD.dlv_slip_d_no,
							S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_no,
							S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_seq,
							decode(
								S0_SLOD.proc_typ,
								value(MAC_SLO_PROC_TYP.PURC_DDLV.value()),
								value(true),
								value(false)
							).as("purc_ddlv_flg"),
							S0_DLVSLIP.slip_prnt_flg.as("purc_ddlv_dlv_slip_printed_flg"),
							S0_DLVSLIP.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
							S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_d_no,
							S0_POD.slo_no,
							addDynamicSelect(DS0D),
							addDynamicSelect(DS0C_ITM_GRP),
							addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
							S0_DLVINSTD
							.leftOuterJoin(S0_DLVINST).on(
								bracket(
									S0_DLVINST.dlv_inst_no.eq(S0_DLVINSTD.dlv_inst_no)
								)
							)
							.leftOuterJoin(S0_POD).on(
								bracket(
									S0_POD.po_d_no.eq(S0_DLVINST.po_d_no)
								)
							)
							.leftOuterJoin(S0_ARRPR).on(
								bracket(
									S0_ARRPR.po_d_no.eq(S0_POD.po_d_no)
								)
							)
							.innerJoin(S0_PO).on(
								bracket(
									S0_PO.po_no.eq(S0_POD.po_no)
								)
							)
							.leftOuterJoin(S0_SLOD).on(
								bracket(
									S0_SLOD.slo_d_no.eq(S0_POD.slo_d_no)
								)
							)
							.leftOuterJoin(S0_ARRSCHD).on(
								bracket(
									S0_ARRSCHD.arr_pr_no.eq(S0_ARRPR.arr_pr_no)
									.and(S0_ARRSCHD.dlv_inst_d_no.eq(S0_DLVINSTD.dlv_inst_d_no))
								)
							)
							.leftOuterJoin(S0_PURCSCHD).on(
								bracket(
									S0_PURCSCHD.arr_pr_no.eq(S0_ARRPR.arr_pr_no)
									.and(S0_PURCSCHD.arr_schd_no.eq(S0_ARRSCHD.arr_schd_no))
								)
							)
							.leftOuterJoin(S0_PURCDLVSLIP).on(
								bracket(
									S0_PURCDLVSLIP.dlv_slip_mng_no.eq(S0_ARRSCHD.dlv_slip_mng_no)
									.and(S0_PURCDLVSLIP.dlv_slip_mng_seq.eq(S0_ARRSCHD.dlv_slip_mng_seq))
								)
							)
							.leftOuterJoin(S0_PURCDLVSLIPD).on(
								bracket(
									S0_PURCDLVSLIPD.dlv_slip_mng_d_no.eq(S0_ARRSCHD.dlv_slip_mng_d_no)
									.and(S0_PURCDLVSLIPD.dlv_slip_mng_d_seq.eq(S0_ARRSCHD.dlv_slip_mng_d_seq))
								)
							)
							.leftOuterJoin(S0_DLVSLIP).on(
								bracket(
									S0_DLVSLIP.dlv_slip_no.eq(S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_no)
									.and(S0_DLVSLIP.dlv_slip_seq.eq(S0_PURCDLVSLIPD.purc_ddlv_dlv_slip_seq))
								)
							)
							.leftOuterJoin(S0_ITM).on(
								bracket(
									S0_POD.itm_cd.eq(S0_ITM.itm_cd)
									.and(S0_POD.itm_sub1.eq(S0_ITM.itm_sub1))
									.and(S0_POD.itm_sub2.eq(S0_ITM.itm_sub2))
									.and(S0_POD.itm_sub3.eq(S0_ITM.itm_sub3))
								)
							)
							.leftOuterJoin(S0_SPPL).on(
								bracket(
									S0_PO.sppl_cd.eq(S0_SPPL.bp_cd)
								)
							)
							.leftOuterJoin(S0_DLV).on(
								bracket(
									S0_DLV.bp_cd.eq(S0_DLVINSTD.dlv_cd)
								)
							)
							.leftOuterJoin(S0_TDLV).on(
								bracket(
									S0_TDLV.bp_cd.eq(S0_DLVINSTD.tdlv_cd)
								)
							)
							.leftOuterJoin(S0_DPT).on(
								bracket(
									S0_PO.purc_dpt_cd.eq(S0_DPT.dpt_cd)
									.and(S0_PO.po_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
								)
							)
							.leftOuterJoin(S0_EDI).on(
								bracket(
									S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
									.and(S0_PO.sppl_cd.eq(S0_EDI.bp_cd)
									.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
									.and(S0_EDI.del_flg.eq(value(false)))
								)
							)
							.innerJoin(S0_DAC).on(
								bracket(
									S0_DAC.dpt_cd.eq(S0_PO.purc_dpt_cd)
								)
							)
							.leftOuterJoin(S0_LOC).on(
								bracket(
									S0_LOC.loc_cd.eq(S0_DLVINSTD.in_to_loc_cd)
								)
							)
							.leftOuterJoin(S0_STRLN).on(
								bracket(
									S0_STRLN.str_ln_cd.eq(S0_DLVINSTD.str_ln_cd)
									.and(S0_STRLN.loc_cd.eq(S0_DLVINSTD.in_to_loc_cd))
								)
							)
							.addDynamicView(DS0D)
							.addDynamicView(DS0C_ITM_GRP)
							.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_ARRSCHD.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
						.cutoff$and(S0_ARRSCHD.arr_schd_tm.lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_PO.po_dt.gte(bind("po_dt_fr")))
						.cutoff$and(S0_PO.po_dt.lte(bind("po_dt_to")))
						.cutoff$and(S0_DLVINST.dlv_inst_dt.gte(bind("dlv_inst_dt_fr")))
						.cutoff$and(S0_DLVINST.dlv_inst_dt.lte(bind("dlv_inst_dt_to")))
						.cutoff$and(S0_DLVINSTD.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_DLVINSTD.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_ARRPR.purc_sts_typ.like(bind("purc_sts_typ")))
						.cutoff$and(S0_PO.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_DLVINSTD.in_to_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("in_to_loc_nm")))
						.cutoff$and(S0_DLVINSTD.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STRLN.str_ln_cd.like(bind("str_ln_nm")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_POD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_POD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_POD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_POD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_POD.po_no.like(bind("po_no")))
						.cutoff$and(S0_DLVINST.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_DLVINST.dlv_inst_grp_no.like(bind("dlv_inst_grp_no")))
						.cutoff$and(S0_DLVINSTD.dlv_inst_no.like(bind("dlv_inst_no")))
						.cutoff$and(S0_DLVINSTD.dlv_inst_d_no.like(bind("dlv_inst_d_no")))
						.cutoff$and(S0_DLVINST.dlv_inst_print_rmrks.like(bind("dlv_inst_print_rmrks")))
						.cutoff$and(S0_DLVINST.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_DLVINSTD.dlv_inst_print_d_rmrks.like(bind("dlv_inst_print_d_rmrks")))
						.cutoff$and(S0_DLVINSTD.intr_rmrks.like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_DLVINSTD.dlv_slip_d_rmrks.like(bind("dlv_slip_d_rmrks")))
						.cutoff$and(S0_DLVINST.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_DLVINST.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_DLVINST.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_DLVINSTD.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_DLVINSTD.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_DLVINSTD.sub_char3.like(bind("dtl_sub_char3")))
						.and(
								bracket(
									bind("incl_can_flg").eq(value(true))
									.and(S0_DLVINSTD.dlv_inst_seq.eq(S0_DLVINST.dlv_inst_seq))
								)
								.or(
									bind("incl_can_flg").eq(value(false))
									.and(S0_DLVINSTD.can_flg.eq(value(false)))
									.and(S0_DLVINST.can_flg.eq(value(false)))
								)
						)
						.and(
								bind("not_dlv_inst_prnt_flg").eq(value(true))
								.and(S0_DLVINST.dlv_inst_print_flg.eq(value(false)))
								.or(
									bind("dlv_inst_prnt_flg").eq(value(true))
									.and(S0_DLVINST.dlv_inst_print_flg.eq(value(true)))
								)
						)
						.and(
							bracket(
								bind("trnst_flg_str").eq(value(false))
								.cutoff$and(S0_DLVINST.edi_flg.eq(bind("edi_flg_str")))
							)
							.or(
								bind("trnst_flg_str").eq(value(true))
								.cutoff$and(decode(
									S0_EDI.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								).eq(bind("edi_flg_str")))
							)
						)
						.addDynamicPredicate(DS0D)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_DLVINSTD.dlv_inst_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.innerJoin(S0_ITMTYP).on(S0_ITM.itm_typ.eq(S0_ITMTYP.itm_typ).and(S0_ITMTYP.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_ITM.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_ITM.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_ITM.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_ITM.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_ITM.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_ITM.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_ITM.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_ITM.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_ITM.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_ITM.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("sppl_grp_flg1"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_SPPL.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
					when(boundOr("sppl_grp_flg2"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_SPPL.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
					when(boundOr("sppl_grp_flg3"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_SPPL.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
					when(boundOr("sppl_grp_flg4"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_SPPL.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
					when(boundOr("sppl_grp_flg5"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_SPPL.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
					when(boundOr("sppl_grp_flg6"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_SPPL.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
					when(boundOr("sppl_grp_flg7"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_SPPL.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
					when(boundOr("sppl_grp_flg8"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_SPPL.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
					when(boundOr("sppl_grp_flg9"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_SPPL.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
					when(boundOr("sppl_grp_flg10"))
						.select(DS0C_SPPL_GRP, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_SPPL.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
				)
			.setJoinInfo(
				joinInfo(
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd,
							m.subcon_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.wg_cd,
							m.site_cd,
							m.lg_grp_cd,
							m.sppl_cd,
							m.cal_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("in_to_loc_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setBooleanNE("in_to_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
						j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.assort_typ,
							m.cst_cd,
							m.slo_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("slo_dt", m.slo_dt());
							r.setStringNE("cst_cd", m.cst_cd());
							r.setStringNE("assort_typ", m.assort_typ());
					}),
						j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.set_itm_grp_no
						))
						.addMap((r, m) -> {
							r.setNumberNE("set_itm_grp_no", m.set_itm_grp_no());
					}),
						j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.dlv_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cal_cd", m.dlv_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0230_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL0230_MST_PO_S01() {
		MST_PO_R PO = MST_PO_R.create("PO");
		MAM_EDI_IF_CTL_R IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0230_MST_PO_S01")
					.mainQuery()
					.select(
						PO.po_no,
						EXTSYS.ext_sys_typ
					)
					.from(
						PO
						.leftOuterJoin(IFCTL).on(
							bracket(
								IFCTL.bp_cd.eq(PO.sppl_cd)
								.and(IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
								.and(FCPA_DATE_UTIL$F_GET_TODAY1().between(IFCTL.st_dt, IFCTL.end_dt))
								.and(IFCTL.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(EXTSYS).on(
							bracket(
								EXTSYS.ext_sys_cd.eq(IFCTL.ext_sys_cd)
								.and(EXTSYS.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						PO.po_no.eq(bind("po_no"))
					)
			);
		
	}
}