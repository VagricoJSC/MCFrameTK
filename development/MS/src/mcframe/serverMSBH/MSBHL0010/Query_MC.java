package mcframe.serverMSBH.MSBHL0010;

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
	 * -- MSBHL0010_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL0010_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_PAY_CHK_R S0_T2 = MST_PAY_CHK_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MST_AP_D_R S0_T5 = MST_AP_D_R.create("T5");
		MST_PAY_SCHD_R S0_T6 = MST_PAY_SCHD_R.create("T6");
		MST_PAY_CHK_R S0_T7 = MST_PAY_CHK_R.create("T7");
		MAVM_RD_DPT_R S0_M1 = MAVM_RD_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_GRP_R S0_BSPPL_GRP1 = MAM_BP_GRP_R.create("BSPPL_GRP1");
		MAM_BP_GRP_R S0_BSPPL_GRP2 = MAM_BP_GRP_R.create("BSPPL_GRP2");
		MAM_BP_GRP_R S0_BSPPL_GRP3 = MAM_BP_GRP_R.create("BSPPL_GRP3");
		MAM_BP_GRP_R S0_BSPPL_GRP4 = MAM_BP_GRP_R.create("BSPPL_GRP4");
		MAM_BP_GRP_R S0_BSPPL_GRP5 = MAM_BP_GRP_R.create("BSPPL_GRP5");
		MAM_BP_GRP_R S0_BSPPL_GRP6 = MAM_BP_GRP_R.create("BSPPL_GRP6");
		MAM_BP_GRP_R S0_BSPPL_GRP7 = MAM_BP_GRP_R.create("BSPPL_GRP7");
		MAM_BP_GRP_R S0_BSPPL_GRP8 = MAM_BP_GRP_R.create("BSPPL_GRP8");
		MAM_BP_GRP_R S0_BSPPL_GRP9 = MAM_BP_GRP_R.create("BSPPL_GRP9");
		MAM_BP_GRP_R S0_BSPPL_GRP10 = MAM_BP_GRP_R.create("BSPPL_GRP10");
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
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
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
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
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
		MAM_DPT_R S0_BSPPL_DPT = MAM_DPT_R.create("BSPPL_DPT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0010_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_schd_dt,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.ap_typ,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.tax_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.trd_cur_cd,
						S0_T1.sppl_cd,
						S0_T1.xrate,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pay_mtd_typ,
						S0_T1.bsppl_cl_dt,
						S0_T1.bsppl_cl_day,
						S0_T1.pay_crryovr_times,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.chk_flg,
						S0_T2.pay_sts_typ,
						S0_T1.act_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.bsppl_cd,
						S0_M2.bp_nm.as("bsppl_nm"),
						S0_T1.bsppl_dpt_cd,
						S0_T1.purc_dpt_cd,
						S0_T1.purc_usr_cd,
						S0_T1.pay_basis_dt,
						decode(
							S0_T1.chk_flg,
							value(false),
							S0_M2.pay_spot_flg,
							value(true),
							S0_T2.pay_spot_flg
						).as("pay_spot_flg"),
						S0_T1.crryovr_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.valid_flg,
						S0_T1.pay_schd_d_print_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ap_d_no,
						S0_T1.pay_chk_no,
						S0_T1.pay_chk_mng_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.purc_act_rev,
						S0_T1.base_purc_ac_dt,
						S0_T1.org_ap_d_no,
						S0_T1.crryovr_ap_d_no,
						S0_T1.crryovr_src_ap_d_no,
						S0_T1.sw_src_pay_schd_no,
						S0_T6.rcv_bill_no.as("sw_src_rcv_bill_no"),
						S0_T6.ap_sttl_cd.as("sw_src_ap_sttl_cd"),
						S0_T6.ap_sttl_typ.as("sw_src_ap_sttl_typ"),
						nvl(
							S0_T5.asppl_cd,
							S0_T6.asppl_cd
						).as("sw_src_asppl_cd"),
						nvl(
							S0_T5.ap_dpt_cd,
							S0_T6.ap_dpt_cd
						).as("sw_src_ap_dpt_cd"),
						nvl(
							S0_T5.bsppl_cd,
							S0_T7.bsppl_cd
						).as("sw_src_bsppl_cd"),
						nvl(
							S0_T5.bsppl_dpt_cd,
							S0_T7.bsppl_dpt_cd
						).as("sw_src_bsppl_dpt_cd"),
						nvl(
							S0_T5.wrk_no,
							S0_T7.wrk_no
						).as("sw_src_wrk_no"),
						S0_T1.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.po_wrk_no,
						S0_T4.wrk_nm.as("po_wrk_nm"),
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
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T2.pay_chk_mng_no.eq(S0_T1.pay_chk_mng_no))
						.leftOuterJoin(S0_T3).on(S0_T3.wrk_no.eq(S0_T1.wrk_no))
						.leftOuterJoin(S0_T4).on(S0_T4.wrk_no.eq(S0_T1.po_wrk_no))
						.leftOuterJoin(S0_T5).on(S0_T5.ap_d_no.eq(S0_T1.sw_src_ap_d_no))
						.leftOuterJoin(S0_T6).on(S0_T6.pay_schd_no.eq(S0_T1.sw_src_pay_schd_no))
						.leftOuterJoin(S0_T7).on(S0_T7.pay_chk_mng_no.eq(S0_T6.pay_chk_mng_no))
						.innerJoin(S0_M1).on(S0_T1.ap_dpt_cd.eq(S0_M1.dpt_cd))
						.leftOuterJoin(S0_M2).on(S0_M2.bp_cd.eq(S0_T1.bsppl_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(S0_T1.sw_flg.eq(value(false)))
						.cutoff$and(
							bind("tmp_ap").eq(value(true))
							.and(S0_T1.ap_d_no.eq(S0_T1.org_ap_d_no))
						)
						.cutoff$and(S0_T1.valid_flg.eq(bind("tmp_valid")))
						.cutoff$and(S0_T1.chk_flg.eq(bind("tmp_chk")))
						.cutoff$and(S0_T1.interim_flg.eq(bind("tmp_interim")))
						.cutoff$and(S0_T1.crryovr_flg.eq(bind("tmp_crryovr")))
						.cutoff$and(
							bracket(
								S0_T1.chk_flg.eq(value(true))
								.and(S0_T2.pay_spot_flg.eq(bind("tmp_pay_spot")))
								.or(S0_T1.chk_flg.eq(value(false)))
								.and(S0_M2.pay_spot_flg.eq(bind("tmp_pay_spot")))
							)
						)
						.and(
								bracket(
										S0_T1.ap_typ.neq(value(MAC_AP_TYP.TEMP_AP.value()))
									)
									.or(bind("accrued_flg").eq(value(true)))
						)
						.cutoff$and(S0_T1.pay_schd_dt.gte(bind("pay_schd_dt_fr")))
						.cutoff$and(S0_T1.pay_schd_dt.lte(bind("pay_schd_dt_to")))
						.cutoff$and(S0_T1.bsppl_cl_dt.gte(bind("bsppl_cl_dt_fr")))
						.cutoff$and(S0_T1.bsppl_cl_dt.lte(bind("bsppl_cl_dt_to")))
						.cutoff$and(S0_T1.act_dt.gte(bind("act_dt_fr")))
						.cutoff$and(S0_T1.act_dt.lte(bind("act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("tmp_pass_dt")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.bsppl_cd.like(bind("bsppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("bsppl_nm")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T1.pay_chk_no.like(bind("pay_chk_no")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T1.purc_act_d_no.like(bind("purc_act_d_no")))
						.cutoff$and(S0_T1.bp_dlv_slip_no.like(bind("bp_dlv_slip_no")))
						.cutoff$and(S0_T1.bp_dlv_slip_d_no.like(bind("bp_dlv_slip_d_no")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
						.cutoff$and(S0_T1.ap_d_no.like(bind("ap_d_no")))
						.cutoff$and(S0_T2.pay_sts_typ.like(bind("pay_sts_typ")))
						.cutoff$and(S0_T1.pay_mtd_typ.like(bind("pay_mtd_typ")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_T1.pay_schd_d_print_rmrks.like(bind("pay_schd_d_print_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T1.bsppl_cd.asc(),
						S0_T1.asppl_cd.asc(),
						S0_T1.sppl_cd.asc(),
						S0_T1.ac_dt.asc(),
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_rev.asc(),
						S0_T1.purc_act_d_no.asc(),
						S0_T1.ap_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bsppl_grp_flg1"))
					.select(DS0D, S0_M2.bp_grp_cd1.as("bsppl_grp_cd1"))
					.groupBy(DS0D, S0_M2.bp_grp_cd1),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("bsppl_grp_cd1")))),
				when(boundOr("bsppl_grp_flg1"))
					.select(DS0D, S0_BSPPL_GRP1.bp_grp_nm.as("bsppl_grp_nm1"))
					.groupBy(DS0D, S0_BSPPL_GRP1.bp_grp_nm),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_BSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP1.bp_grp_nm.like(bind("bsppl_grp_nm1")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS0D, S0_M2.bp_grp_cd2.as("bsppl_grp_cd2"))
					.groupBy(DS0D, S0_M2.bp_grp_cd2),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("bsppl_grp_cd2")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS0D, S0_BSPPL_GRP2.bp_grp_nm.as("bsppl_grp_nm2"))
					.groupBy(DS0D, S0_BSPPL_GRP2.bp_grp_nm),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_BSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP2.bp_grp_nm.like(bind("bsppl_grp_nm2")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS0D, S0_M2.bp_grp_cd3.as("bsppl_grp_cd3"))
					.groupBy(DS0D, S0_M2.bp_grp_cd3),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("bsppl_grp_cd3")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS0D, S0_BSPPL_GRP3.bp_grp_nm.as("bsppl_grp_nm3"))
					.groupBy(DS0D, S0_BSPPL_GRP3.bp_grp_nm),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_BSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP3.bp_grp_nm.like(bind("bsppl_grp_nm3")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS0D, S0_M2.bp_grp_cd4.as("bsppl_grp_cd4"))
					.groupBy(DS0D, S0_M2.bp_grp_cd4),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("bsppl_grp_cd4")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS0D, S0_BSPPL_GRP4.bp_grp_nm.as("bsppl_grp_nm4"))
					.groupBy(DS0D, S0_BSPPL_GRP4.bp_grp_nm),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_BSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP4.bp_grp_nm.like(bind("bsppl_grp_nm4")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS0D, S0_M2.bp_grp_cd5.as("bsppl_grp_cd5"))
					.groupBy(DS0D, S0_M2.bp_grp_cd5),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("bsppl_grp_cd5")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS0D, S0_BSPPL_GRP5.bp_grp_nm.as("bsppl_grp_nm5"))
					.groupBy(DS0D, S0_BSPPL_GRP5.bp_grp_nm),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_BSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP5.bp_grp_nm.like(bind("bsppl_grp_nm5")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS0D, S0_M2.bp_grp_cd6.as("bsppl_grp_cd6"))
					.groupBy(DS0D, S0_M2.bp_grp_cd6),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("bsppl_grp_cd6")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS0D, S0_BSPPL_GRP6.bp_grp_nm.as("bsppl_grp_nm6"))
					.groupBy(DS0D, S0_BSPPL_GRP6.bp_grp_nm),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_BSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP6.bp_grp_nm.like(bind("bsppl_grp_nm6")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS0D, S0_M2.bp_grp_cd7.as("bsppl_grp_cd7"))
					.groupBy(DS0D, S0_M2.bp_grp_cd7),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("bsppl_grp_cd7")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS0D, S0_BSPPL_GRP7.bp_grp_nm.as("bsppl_grp_nm7"))
					.groupBy(DS0D, S0_BSPPL_GRP7.bp_grp_nm),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_BSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP7.bp_grp_nm.like(bind("bsppl_grp_nm7")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS0D, S0_M2.bp_grp_cd8.as("bsppl_grp_cd8"))
					.groupBy(DS0D, S0_M2.bp_grp_cd8),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("bsppl_grp_cd8")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS0D, S0_BSPPL_GRP8.bp_grp_nm.as("bsppl_grp_nm8"))
					.groupBy(DS0D, S0_BSPPL_GRP8.bp_grp_nm),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_BSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP8.bp_grp_nm.like(bind("bsppl_grp_nm8")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS0D, S0_M2.bp_grp_cd9.as("bsppl_grp_cd9"))
					.groupBy(DS0D, S0_M2.bp_grp_cd9),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("bsppl_grp_cd9")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS0D, S0_BSPPL_GRP9.bp_grp_nm.as("bsppl_grp_nm9"))
					.groupBy(DS0D, S0_BSPPL_GRP9.bp_grp_nm),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_BSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP9.bp_grp_nm.like(bind("bsppl_grp_nm9")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS0D, S0_M2.bp_grp_cd10.as("bsppl_grp_cd10"))
					.groupBy(DS0D, S0_M2.bp_grp_cd10),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("bsppl_grp_cd10")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS0D, S0_BSPPL_GRP10.bp_grp_nm.as("bsppl_grp_nm10"))
					.groupBy(DS0D, S0_BSPPL_GRP10.bp_grp_nm),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_BSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP10.bp_grp_nm.like(bind("bsppl_grp_nm10")))),
				when(boundOr("asppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_T1.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm")))),
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
				when(boundOr("sppl_nm", "tmp_subcon", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S0_SPPL.subcon_flg.eq(bind("tmp_subcon")))),
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
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T1.itm_cd).and(S0_ITM.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_ITM.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_ITM.itm_sub3.eq(S0_T1.itm_sub3))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_T1.sundry_itm_flg,value(true),S0_T1.itm_nm,S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("ap_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_T1.ap_dpt_cd).and(S0_T1.ac_dt.between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm"))).cutoff$and(S0_AP_DPT.wg_cd.like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_AP_DPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("bsppl_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_DPT).on(S0_BSPPL_DPT.dpt_cd.eq(S0_T1.bsppl_dpt_cd).and(S0_T1.ac_dt.between(S0_BSPPL_DPT.st_dt, S0_BSPPL_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_DPT.dpt_nm.like(bind("bsppl_dpt_nm"))))
			);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBHL0010_Srch01_RsltR_J01() {
		return joinInfo(
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
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
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
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm,
					m.trd_ptn_typ
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
					r.trd_ptn_typ(m.trd_ptn_typ());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.dscnt_itm_flg,
					m.itm_nm,
					m.itm_typ,
					m.itm_typ_d_cd
				))
				.addMap((r, m) -> {
					r.itm_nm_itm(m.itm_nm());
					r.dscnt_itm_flg(m.dscnt_itm_flg());
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
					m.tax_nm
				))
				.addMap((r, m) -> {
					r.tax_nm(m.tax_nm());
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
					r.base_cur_upri_dec_place(m.upri_dec_place());
					r.base_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.subcon_flg
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
					r.subcon_flg(m.subcon_flg());
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
					m.dec_place
				))
				.addMap((r, m) -> {
					r.trd_unit_dec_place(m.dec_place());
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
					m.dec_place
				))
				.addMap((r, m) -> {
					r.base_unit_dec_place(m.dec_place());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bsppl_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bsppl_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.purc_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.purc_dpt_nm(m.dpt_nm());
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
				.add(MAM_STTL_R.class, r -> toCondition(
					r.sw_src_ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.sw_src_ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sw_src_asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.sw_src_asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.sw_src_ap_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.sw_src_ap_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sw_src_bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.sw_src_bsppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.sw_src_bsppl_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.sw_src_bsppl_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MST_WRK_R.class, r -> toCondition(
					r.sw_src_wrk_no()
				))
				.addSelect(m -> toArray(
					m.wrk_nm
				))
				.addMap((r, m) -> {
					r.sw_src_wrk_nm(m.wrk_nm());
				})
		);
	}
}