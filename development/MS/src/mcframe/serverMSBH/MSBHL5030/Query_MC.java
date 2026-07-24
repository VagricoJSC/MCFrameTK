package mcframe.serverMSBH.MSBHL5030;

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
	 * -- MSBHL5030_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL5030_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_AP_APPL_SCHD_R S0_T2 = MST_AP_APPL_SCHD_R.create("T2");
		MST_PAY_SCHD_R S0_T3 = MST_PAY_SCHD_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
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
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MST_WRK_R S0_WRK = MST_WRK_R.create("WRK");
		MAM_DPT_R S0_BSDPT = MAM_DPT_R.create("BSDPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_DPT_R S0_APDPT = MAM_DPT_R.create("APDPT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5030_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.bsppl_cl_dt,
						S0_T1.bsppl_cl_day,
						S0_T1.pay_crryovr_times,
						S0_T1.sppl_cd,
						S0_T1.asppl_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_upri,
						S0_T1.tax_cd,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.interim_flg,
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.pay_mtd_typ,
						S0_T1.wrk_no,
						S0_T1.po_wrk_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.act_dt,
						S0_T1.ac_dt,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_no,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.ap_typ,
						S0_T1.crryovr_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slip_sts_typ,
						S0_T1.ap_d_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_rev,
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.org_ap_d_no,
						S0_T1.crryovr_ap_d_no,
						S0_T1.crryovr_src_ap_d_no,
						S0_T1.sw_src_pay_schd_no,
						S0_T3.rcv_bill_no.as("sw_src_rcv_bill_no"),
						S0_T1.base_purc_ac_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.base_cur_proc_upri,
						S0_T1.base_cur_proc_amt,
						S0_T1.base_cur_onr_prov_upri,
						S0_T1.base_cur_onr_prov_amt,
						S0_T1.repurc_obli_flg,
						S0_T1.outsrc_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("ap_d_upd_cntr"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.sw_src_ap_appl_schd_no.eq(S0_T2.ap_appl_schd_no))
						.leftOuterJoin(S0_T3).on(S0_T2.pay_schd_no.eq(S0_T3.pay_schd_no))
						.innerJoin(S0_DAC).on(S0_T1.bsppl_dpt_cd.eq(S0_DAC.dpt_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(S0_T1.chk_flg.eq(value(false)))
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T1.bsppl_cd.eq(bind("bsppl_cd")))
						.and(S0_T1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value())))
						.cutoff$and(S0_T1.interim_flg.eq(bind("inc_interim_false")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.bp_dlv_slip_no.like(bind("bp_dlv_slip_no")))
						.cutoff$and(S0_T1.bp_dlv_slip_d_no.like(bind("bp_dlv_slip_d_no")))
						.cutoff$and(S0_T1.bsppl_cl_dt.gte(bind("bsppl_cl_dt_fr")))
						.cutoff$and(S0_T1.bsppl_cl_dt.lte(bind("bsppl_cl_dt_to")))
						.cutoff$and(S0_T1.pay_schd_dt.gte(bind("pay_schd_dt_fr")))
						.cutoff$and(S0_T1.pay_schd_dt.lte(bind("pay_schd_dt_to")))
						.cutoff$and(S0_T1.act_dt.gte(bind("act_dt_fr")))
						.cutoff$and(S0_T1.act_dt.lte(bind("act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.innerJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("asppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.innerJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_T1.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T1.itm_cd).and(S0_ITM.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_ITM.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_ITM.itm_sub3.eq(S0_T1.itm_sub3))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_T1.sundry_itm_flg,value(true),S0_T1.itm_nm,S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.innerJoin(S0_CUR).on(S0_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS0D, v -> v.innerJoin(S0_WRK).on(S0_WRK.wrk_no.eq(S0_T1.wrk_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("bsppl_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSDPT).on(S0_BSDPT.dpt_cd.eq(S0_T1.bsppl_dpt_cd).and(S0_T1.ac_dt.between(S0_BSDPT.st_dt, S0_BSDPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSDPT.dpt_nm.like(bind("bsppl_dpt_nm"))).cutoff$and(S0_BSDPT.wg_cd.like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_BSDPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_APDPT).on(S0_APDPT.dpt_cd.eq(S0_T1.ap_dpt_cd).and(S0_T1.ac_dt.between(S0_APDPT.st_dt, S0_APDPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_APDPT.dpt_nm.like(bind("ap_dpt_nm"))))
			);
	}
	
	/**
	 * -- MSBHL5030_MST_AP_D_Query_S02
	 */
	static MCQueryPlan MSBHL5030_MST_AP_D_S02() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_AP_APPL_SCHD_R S0_T2 = MST_AP_APPL_SCHD_R.create("T2");
		MST_PAY_SCHD_R S0_T3 = MST_PAY_SCHD_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
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
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MST_WRK_R S0_WRK = MST_WRK_R.create("WRK");
		MAM_DPT_R S0_BSDPT = MAM_DPT_R.create("BSDPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_DPT_R S0_APDPT = MAM_DPT_R.create("APDPT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5030_MST_AP_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.bsppl_cl_dt,
						S0_T1.bsppl_cl_day,
						S0_T1.pay_crryovr_times,
						S0_T1.sppl_cd,
						S0_T1.asppl_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_upri,
						S0_T1.tax_cd,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.interim_flg,
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.pay_mtd_typ,
						S0_T1.wrk_no,
						S0_T1.po_wrk_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.act_dt,
						S0_T1.ac_dt,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_no,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.ap_typ,
						S0_T1.crryovr_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slip_sts_typ,
						S0_T1.ap_d_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_rev,
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.org_ap_d_no,
						S0_T1.crryovr_ap_d_no,
						S0_T1.crryovr_src_ap_d_no,
						S0_T1.sw_src_pay_schd_no,
						S0_T3.rcv_bill_no.as("sw_src_rcv_bill_no"),
						S0_T1.base_purc_ac_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.base_cur_proc_upri,
						S0_T1.base_cur_proc_amt,
						S0_T1.base_cur_onr_prov_upri,
						S0_T1.base_cur_onr_prov_amt,
						S0_T1.repurc_obli_flg,
						S0_T1.outsrc_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("ap_d_upd_cntr"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.sw_src_ap_appl_schd_no.eq(S0_T2.ap_appl_schd_no))
						.leftOuterJoin(S0_T3).on(S0_T2.pay_schd_no.eq(S0_T3.pay_schd_no))
						.innerJoin(S0_DAC).on(S0_T1.bsppl_dpt_cd.eq(S0_DAC.dpt_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(S0_T1.chk_flg.eq(value(false)))
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T1.bsppl_cd.eq(bind("bsppl_cd")))
						.and(S0_T1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value())))
						.and(S0_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.interim_flg.eq(bind("inc_interim_false")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_T1.purc_act_no.eq(bind("purc_act_no")))
						.cutoff$and(S0_T1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
						.cutoff$and(S0_T1.rcpt_iv_no.eq(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wrk_no.eq(bind("wrk_no")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.bp_dlv_slip_no.like(bind("bp_dlv_slip_no")))
						.cutoff$and(S0_T1.bp_dlv_slip_d_no.like(bind("bp_dlv_slip_d_no")))
						.cutoff$and(S0_T1.bsppl_cl_dt.gte(bind("bsppl_cl_dt_fr")))
						.cutoff$and(S0_T1.bsppl_cl_dt.lte(bind("bsppl_cl_dt_to")))
						.cutoff$and(S0_T1.pay_schd_dt.gte(bind("pay_schd_dt_fr")))
						.cutoff$and(S0_T1.pay_schd_dt.lte(bind("pay_schd_dt_to")))
						.cutoff$and(S0_T1.act_dt.gte(bind("act_dt_fr")))
						.cutoff$and(S0_T1.act_dt.lte(bind("act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.innerJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("asppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.innerJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_T1.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T1.itm_cd).and(S0_ITM.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_ITM.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_ITM.itm_sub3.eq(S0_T1.itm_sub3))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_T1.sundry_itm_flg,value(true),S0_T1.itm_nm,S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.innerJoin(S0_CUR).on(S0_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS0D, v -> v.innerJoin(S0_WRK).on(S0_WRK.wrk_no.eq(S0_T1.wrk_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("bsppl_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSDPT).on(S0_BSDPT.dpt_cd.eq(S0_T1.bsppl_dpt_cd).and(S0_T1.ac_dt.between(S0_BSDPT.st_dt, S0_BSDPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSDPT.dpt_nm.like(bind("bsppl_dpt_nm"))).cutoff$and(S0_BSDPT.wg_cd.like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_BSDPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_APDPT).on(S0_APDPT.dpt_cd.eq(S0_T1.ap_dpt_cd).and(S0_T1.ac_dt.between(S0_APDPT.st_dt, S0_APDPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_APDPT.dpt_nm.like(bind("ap_dpt_nm"))))
			);
	}

	/**
	 * -- MSBHL5030_MST_PAY_SCHD_LOCK_Query_I01
	 */
	static MCQueryPlan MSBHL5030_MST_PAY_SCHD_LOCK_I01() {
		MST_PAY_SCHD_LOCK_R S0 = MST_PAY_SCHD_LOCK_R.create();
		MSW_PAY_SCHD_LOCK_KEY_R S1_W = MSW_PAY_SCHD_LOCK_KEY_R.create("W");
		MST_PAY_SCHD_LOCK_R S2_T = MST_PAY_SCHD_LOCK_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5030_MST_PAY_SCHD_LOCK_Query_I01")
					.insert(S0)
					.columns(
						S0.bsppl_cd,
						S0.bsppl_dpt_cd,
						S0.purc_act_no,
						S0.rcpt_iv_mng_no,
						S0.rcpt_iv_no,
						S0.wrk_no,
						S0.trd_cur_cd
					)
					.query(
						subQuery()
						.select(
							S1_W.bsppl_cd,
							S1_W.bsppl_dpt_cd,
							S1_W.purc_act_no,
							S1_W.rcpt_iv_mng_no,
							S1_W.rcpt_iv_no,
							S1_W.wrk_no,
							S1_W.trd_cur_cd
						)
						.from(S1_W)
						.where(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S2_T)
								.where(
									value(0).eq(value(0))
									.and(S2_T.bsppl_cd.eq(S1_W.bsppl_cd))
									.and(S2_T.bsppl_dpt_cd.eq(S1_W.bsppl_dpt_cd))
									.and(S2_T.purc_act_no.eq(S1_W.purc_act_no))
									.and(S2_T.rcpt_iv_mng_no.eq(S1_W.rcpt_iv_mng_no))
									.and(S2_T.rcpt_iv_no.eq(S1_W.rcpt_iv_no))
									.and(S2_T.wrk_no.eq(S1_W.wrk_no))
									.and(S2_T.trd_cur_cd.eq(S1_W.trd_cur_cd))
								)
							)
						)
					)
			);
	}
	
	public static MCJoinerList<PaySchd_Srch03_RsltR> MSBHL5030_PaySchd_Srch03_RsltR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.purc_tax_rnd_typ
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
					r.purc_tax_rnd_typ(m.purc_tax_rnd_typ());
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
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.itm_nm,
					m.itm_typ,
					m.itm_typ_d_cd
				))
				.addMap((r, m) -> {
					r.itm_nm_itm(m.itm_nm());
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
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.inc_tax_flg(m.inc_tax_flg());
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
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
					r.trd_cur_upri_dec_place(m.upri_dec_place());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.base_cur_upri_dec_place(m.upri_dec_place());
					r.base_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.trd_unit_dec_place(m.dec_place());
					r.trd_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.base_unit_dec_place(m.dec_place());
					r.base_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MST_WRK_R.class, r -> toCondition(
					r.wrk_no()
				))
				.addSelect(m -> toArray(
					m.wrk_nm
				))
				.addMap((r, m) -> {
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MST_WRK_R.class, r -> toCondition(
					r.po_wrk_no()
				))
				.addSelect(m -> toArray(
					m.wrk_nm
				))
				.addMap((r, m) -> {
					r.po_wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.purc_interim_cl_flg
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
					r.purc_interim_cl_flg(m.purc_interim_cl_flg());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bsppl_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.bsppl_dpt_nm(m.dpt_nm());
					r.wg_cd(m.wg_cd());
					r.setStringNE("join_wg_cd_", m.wg_cd());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("join_wg_cd_")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
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
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
				})
		);
	}
	/**
	 * MSBHL5030_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL5030_MST_PAY_ACT_D_S01() {
		MST_PAY_ACT_D_R PAYACTD = MST_PAY_ACT_D_R.create("PAYACTD");
		MST_PAY_ACT_R PAYACT = MST_PAY_ACT_R.create("PAYACT");
		MST_PAY_CHK_R PAYCHK = MST_PAY_CHK_R.create("PAYCHK");
		
		return createQueryPlan()
				.setQuery(
						sql("MSBHL5030_MST_PAY_ACT_D_Query_S01")
						.mainQuery()
						.select(
							PAYACT.ac_dt,
							PAYACT.ac_ym,
							PAYACTD.bsppl_cd,
							PAYACT.slip_sts_typ,
							PAYACTD.ap_sttl_cd,
							PAYACTD.ap_sttl_typ,
							PAYACT.pay_act_no,
							PAYACT.pay_act_rev,
							PAYACTD.pay_act_d_no,
							PAYACTD.pay_act_d_seq,
							PAYACTD.calc_tgt_pay_chk_mng_no,
							PAYACT.pay_act_dt,
							PAYACT.pay_basis_dt,
							PAYACT.trd_cur_cd,
							cases()
								.when(
									MAC_AP_STTL_TYP$IS_COM_PAID(PAYACTD.ap_sttl_typ).eq(value(false))
									.or(PAYACTD.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.SETOFF.value())))
								)
									.then(PAYACTD.trd_cur_amt)
									.otherwise(nullValue()).as("trd_cur_amt"),
							cases()
								.when(
									MAC_AP_STTL_TYP$IS_COM_PAID(PAYACTD.ap_sttl_typ).eq(value(true))
									.or(PAYACTD.ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.SETOFF.value())))
								)
								.then(PAYACTD.trd_cur_amt)
								.otherwise(nullValue()).as("trd_cur_com_paid"),
							PAYACTD.trd_cur_com_paid_tax_amt,
							PAYACTD.trd_cur_com_paid_tax_cd,
							PAYACT.xrate,
						cases()
							.when(
								MAC_AP_STTL_TYP$IS_COM_PAID(PAYACTD.ap_sttl_typ).eq(value(false))
								.or(PAYACTD.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.SETOFF.value())))
							)
								.then(PAYACTD.base_cur_amt)
								.otherwise(nullValue()).as("base_cur_amt"),
						cases()
							.when(
								MAC_AP_STTL_TYP$IS_COM_PAID(PAYACTD.ap_sttl_typ).eq(value(true))
								.or(PAYACTD.ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.SETOFF.value())))
							)
							.then(PAYACTD.base_cur_amt)
							.otherwise(nullValue()).as("base_cur_com_paid"),
							PAYACTD.base_cur_com_paid_tax_amt,
							PAYACTD.bsppl_dpt_cd,
							PAYACTD.trd_d_rmrks,
							PAYACTD.intr_d_rmrks,
							PAYACTD.upd_cntr.as("pay_act_upd_cntr"),
							PAYCHK.pay_chk_mng_no,
							PAYCHK.upd_cntr
							)
					.from(
							PAYACTD
							.innerJoin(PAYACT).on(PAYACTD.pay_act_no.eq(PAYACT.pay_act_no).and(PAYACTD.pay_act_seq.eq(PAYACT.pay_act_seq)))
							.innerJoin(PAYCHK).on(PAYACTD.pay_chk_mng_no.eq(PAYCHK.pay_chk_mng_no))
							)
					.where(
							value(0).eq(value(0))
							.and(PAYACTD.bsppl_cd.eq(bind("bsppl_cd")))
							.and(PAYACTD.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
							.and(PAYACT.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(bracket(PAYACTD.calc_tgt_pay_chk_mng_no.isNull().cutoff$or(PAYACTD.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")))))
							.cutoff$and(PAYACT.pay_basis_dt.lte(bind("bsppl_cl_dt")))
							)
					.orderBy(
							PAYACT.pay_act_no.asc(),
							PAYACT.pay_act_seq.asc(),
							PAYACTD.pay_act_d_no.asc(),
							PAYACTD.pay_act_d_seq.asc()
							)
					)
				.setJoinInfo(
					joinInfo(
						j -> j
							.add(MAM_STTL_R.class, r -> toCondition(
								r.getStringNE("ap_sttl_cd")
							))
							.addSelect(m -> toArray(
								m.sttl_cd,
								m.sttl_nm,
								m.bill_tax_disp_flg
							))
							.addMap((r, m) -> {
								r.setStringNE("ap_sttl_cd", m.sttl_cd());
								r.setStringNE("ap_sttl_nm", m.sttl_nm());
								r.setBooleanNE("bill_tax_disp_flg", m.bill_tax_disp_flg());
						}),
						j -> j
							.add(MAM_TAX_R.class, r -> toCondition(
								r.getStringNE("trd_cur_com_paid_tax_cd")
							))
							.addSelect(m -> toArray(
								m.tax_nm,
								m.tax_rate
							))
							.addMap((r, m) -> {
								r.setStringNE("trd_cur_com_paid_tax_nm", m.tax_nm());
								r.setNumberNE("trd_cur_com_paid_tax_rate", m.tax_rate());
						})
					)
			);
	}
	/**
	 * MSBHL5030_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL5030_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R ADVPAYACT = MST_ADV_PAY_ACT_R.create("ADVPAYACT");
		return createQueryPlan()
				.setQuery(
						sql("MSBHL5030_MST_ADV_PAY_ACT_Query_S01")
						.mainQuery()
						.select(
							ADVPAYACT.ac_dt,
							ADVPAYACT.bsppl_cd,
							ADVPAYACT.pay_act_dt,
							ADVPAYACT.slip_sts_typ,
							ADVPAYACT.ap_sttl_cd,
							ADVPAYACT.ap_sttl_typ,
							ADVPAYACT.trd_cur_cd,
							ADVPAYACT.trd_cur_amt,
							ADVPAYACT.com_paid_ap_sttl_typ,
							ADVPAYACT.trd_cur_com_paid,
							ADVPAYACT.trd_cur_com_paid_tax_amt,
							ADVPAYACT.trd_cur_com_paid_tax_cd,
							ADVPAYACT.xrate,
							ADVPAYACT.base_cur_amt,
							ADVPAYACT.base_cur_com_paid,
							ADVPAYACT.base_cur_com_paid_tax_amt,
							ADVPAYACT.pay_dpt_cd,
							ADVPAYACT.bsppl_dpt_cd,
							ADVPAYACT.bd_dpt_cd,
							ADVPAYACT.adv_pay_act_no,
							ADVPAYACT.adv_pay_act_seq,
							ADVPAYACT.adv_pay_act_rev,
							ADVPAYACT.pay_chk_mng_no,
							ADVPAYACT.upd_cntr.as("adv_pay_upd_cntr")
							)
					.from(
							ADVPAYACT
							)
					.where(
							value(0).eq(value(0))
							.and(ADVPAYACT.bsppl_cd.eq(bind("bsppl_cd")))
							.and(ADVPAYACT.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
							.and(ADVPAYACT.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(bracket(ADVPAYACT.pay_chk_mng_no.isNull().cutoff$or(ADVPAYACT.pay_chk_mng_no.eq(bind("pay_chk_mng_no")))))
							.and(ADVPAYACT.pay_ntc_adv_pay_flg.eq(value(true)))
							)
					.orderBy(
							ADVPAYACT.adv_pay_act_no.asc(),
							ADVPAYACT.adv_pay_act_seq.asc()
							)
					)
				.setJoinInfo(
					joinInfo(
						j -> j
							.add(MAM_STTL_R.class, r -> toCondition(
								r.getStringNE("ap_sttl_cd")
							))
							.addSelect(m -> toArray(
								m.sttl_cd,
								m.sttl_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("ap_sttl_cd", m.sttl_cd());
								r.setStringNE("ap_sttl_nm", m.sttl_nm());
						}),
						j -> j
							.add(MAM_TAX_R.class, r -> toCondition(
								r.getStringNE("trd_cur_com_paid_tax_cd")
							))
							.addSelect(m -> toArray(
								m.tax_nm,
								m.tax_rate
							))
							.addMap((r, m) -> {
								r.setStringNE("trd_cur_com_paid_tax_nm", m.tax_nm());
								r.setNumberNE("trd_cur_com_paid_tax_rate", m.tax_rate());
						}),
						j -> j
							.add(MAM_DPT_R.class, r -> toCondition(
								r.getStringNE("pay_dpt_cd"),
								r.getDateNE("ac_dt")
							))
							.addSelect(m -> toArray(
								m.dpt_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("pay_dpt_nm", m.dpt_nm());
						}),
						j -> j
							.add(MAM_DPT_R.class, r -> toCondition(
								r.getStringNE("bsppl_dpt_cd"),
								r.getDateNE("ac_dt")
							))
							.addSelect(m -> toArray(
								m.dpt_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("bsppl_dpt_nm", m.dpt_nm());
						}),
						j -> j
							.add(MAM_DPT_R.class, r -> toCondition(
								r.getStringNE("bd_dpt_cd"),
								r.getDateNE("ac_dt")
							))
							.addSelect(m -> toArray(
								m.dpt_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("bd_dpt_nm", m.dpt_nm());
						})
					)
			);
	}
}