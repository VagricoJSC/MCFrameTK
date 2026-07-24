package mcframe.serverMSBE.MSBEL2250;

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
	 * -- MSBEL2250_MST_RCPT_IV_Query_S01
	 */
	static MCQueryPlan MSBEL2250_MST_RCPT_IV_S01() {
		MST_RCPT_IV_P_R S0_T1 = MST_RCPT_IV_P_R.create("T1");
		MST_RCPT_IV_D_P_R S0_T2 = MST_RCPT_IV_D_P_R.create("T2");
		MST_PURC_SCHD_R S0_T3 = MST_PURC_SCHD_R.create("T3");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MST_PO_R S0_T7 = MST_PO_R.create("T7");
		MST_SLO_D_R S0_T8 = MST_SLO_D_R.create("T8");
		MST_WRK_R S0_T10 = MST_WRK_R.create("T10");
		MST_IV_R S0_T11 = MST_IV_R.create("T11");
		MSVT_WRK_SNO_R S0_T12 = MSVT_WRK_SNO_R.create("T12");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_USR_R S0_M13 = MAM_USR_R.create("M13");
		MAM_ITM_R S0_M17 = MAM_ITM_R.create("M17");
		MAM_ITM_TYP_D_R S0_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAVM_ITM_UNIT_R S0_M23 = MAVM_ITM_UNIT_R.create("M23");
		MAVM_ITM_UNIT_R S0_M24 = MAVM_ITM_UNIT_R.create("M24");
		MAM_ITM_LCL_R S0_M25 = MAM_ITM_LCL_R.create("M25");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_DPT_R S0_M31 = MAM_DPT_R.create("M31");
		MSVM_DLV_ID_R S0_M34 = MSVM_DLV_ID_R.create("M34");
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
		MAM_ITM_GRP_R S0_MM21 = MAM_ITM_GRP_R.create("MM21");
		MAM_ITM_GRP_R S0_MM22 = MAM_ITM_GRP_R.create("MM22");
		MAM_ITM_GRP_R S0_MM23 = MAM_ITM_GRP_R.create("MM23");
		MAM_ITM_GRP_R S0_MM24 = MAM_ITM_GRP_R.create("MM24");
		MAM_ITM_GRP_R S0_MM25 = MAM_ITM_GRP_R.create("MM25");
		MAM_ITM_GRP_R S0_MM26 = MAM_ITM_GRP_R.create("MM26");
		MAM_ITM_GRP_R S0_MM27 = MAM_ITM_GRP_R.create("MM27");
		MAM_ITM_GRP_R S0_MM28 = MAM_ITM_GRP_R.create("MM28");
		MAM_ITM_GRP_R S0_MM29 = MAM_ITM_GRP_R.create("MM29");
		MAM_ITM_GRP_R S0_MM210 = MAM_ITM_GRP_R.create("MM210");
		MST_RCPT_IV_R S0_T13 = MST_RCPT_IV_R.create("T13");
		MST_RCPT_IV_P_R S1_RCPTIVP = MST_RCPT_IV_P_R.create("RCPTIVP");
		MST_PURC_ACT_R S0_PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MST_PURC_ACT_D_R S0_PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_IO_R S0_PURCACTIO = MST_PURC_ACT_IO_R.create("PURCACTIO");
		MST_ARR_ACT_R S0_ARRACT = MST_ARR_ACT_R.create("ARRACT");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");

		MST_RCPT_IV_D_P_R S0_T14 = MST_RCPT_IV_D_P_R.create("T14");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");

		MCTempView S0_T14_TempView = createTempView("S0_T14_View");
		MCSingleView S0_T14_View = subQuery().select(
				S0_T1.rcpt_iv_mng_no,
				S0_T1.rcpt_iv_rev,
				decode(
						subQuery()
						.select(min(S0_T3.non_purc_flg))
						.from(S0_T3
							.innerJoin(S0_T14)
							.on(S0_T14.rcpt_iv_mng_no.eq(S0_T1.rcpt_iv_mng_no))
						)
						.where(S0_T3.purc_schd_no.eq(S0_T14.purc_schd_no)),
						value(true), value(false), S0_T1.purc_cmpl_flg
					).as("fix_flg")
				)
				.from(
					S0_T1
				).view(S0_T14_TempView);
		MCTempView S0_T15_TempView = createTempView("S0_T15_View");
		MCSingleView S0_T15_View = subQuery().select(
					S0_PURCACT.rcpt_iv_mng_no,
					S0_PURCACT.rcpt_iv_rev,
					S0_PURCACTD.rcpt_iv_d_no,
					S0_PURCACTD.base_unit_qty
				)
				.from(
					S0_PURCACT
					.leftOuterJoin(S0_PURCACTD).on(
						bracket(
							S0_PURCACT.purc_act_no.eq(S0_PURCACTD.purc_act_no)
							.and(S0_PURCACT.purc_act_seq.eq(S0_PURCACTD.purc_act_seq))
						)
					)
				).where(S0_PURCACT.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value()))).view(S0_T15_TempView);
		MCTempView S0_T16_TempView = createTempView("S0_T16_View");
		MCSingleView S0_T16_View = subQuery().select(
					S0_PURCACT.rcpt_iv_mng_no,
					S0_PURCACT.rcpt_iv_rev,
					S0_PURCACTD.rcpt_iv_d_no,
					sum(S0_ARRACT.base_unit_qty).as("arr_qty")
				)
				.from(
					S0_PURCACT
					.leftOuterJoin(S0_PURCACTD).on(
						bracket(
							S0_PURCACT.purc_act_no.eq(S0_PURCACTD.purc_act_no)
							.and(S0_PURCACT.purc_act_seq.eq(S0_PURCACTD.purc_act_seq))
						)
					)
					.leftOuterJoin(S0_PURCACTIO).on(
						bracket(
							S0_PURCACTIO.purc_act_d_no.eq(S0_PURCACTD.purc_act_d_no)
							.and(S0_PURCACTIO.purc_act_d_seq.eq(S0_PURCACTD.purc_act_d_seq))
						)
					)
					.leftOuterJoin(S0_ARRACT).on(
						bracket(
							S0_PURCACTIO.arr_act_no.eq(S0_ARRACT.arr_act_no)
						)
					)
				)
				.where(S0_PURCACT.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
				.groupBy(S0_PURCACT.rcpt_iv_mng_no,
					S0_PURCACT.rcpt_iv_rev,
					S0_PURCACTD.rcpt_iv_d_no
				).view(S0_T16_TempView);
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2250_MST_RCPT_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcpt_iv_mng_no,
						S0_T1.purc_cmpl_flg,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_rev,
						S0_T1.purc_schd_dt,
						S0_T1.purc_dt,
						S0_T1.iv_dt,
						S0_T1.sppl_cd,
						S0_M1.bp_nm.as("sppl_nm"),
						S0_T1.in_to_id_typ,
						S0_T1.in_to_id_cd,
						nvl(
							S0_T1.in_to_id_nm,
							S0_M34.dlv_id_nm
						).as("in_to_id_nm"),
						S0_T1.in_to_cntct_dpt,
						S0_T1.in_to_cntct_psn,
						S0_T1.in_to_zip_cd,
						S0_T1.in_to_addr1,
						S0_T1.in_to_addr2,
						S0_T1.in_to_addr3,
						S0_T1.in_to_addr4,
						S0_T1.in_to_tel,
						S0_T1.in_to_fax,
						S0_T1.in_to_cntry_cd,
						S0_T1.trnspt_cd,
						S0_T1.vssl_flght,
						S0_T1.load_port_cd,
						S0_T1.etd_dt,
						S0_T1.dschrg_port_cd,
						S0_T1.eta_dt,
						S0_T1.via_port_cd,
						S0_T1.via_schd_dt,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.pay_schd_dt,
						S0_T1.rcpt_iv_rmrks,
						S0_T1.intr_rmrks,
						nvl2(
							S0_T13.rcpt_iv_mng_no,
							value(false),
							value(true)
						).as("can_flg"),
						S0_T2.rcpt_iv_d_no,
						S0_T2.purc_schd_no,
						S0_T2.po_no,
						S0_T2.po_d_no,
						S0_T2.trd_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.itm_nm,
							S0_M17.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							S0_M25.itm_nm
						).as("iv_itm_nm"),
						S0_T2.maker_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						nvl(
							S0_T7.wrk_no,
							S0_T12.wrk_no
						).as("wrk_no"),
						nvl2(
							S0_T7.wrk_no,
							S0_T10.wrk_nm,
							S0_T12.wrk_nm
						).as("wrk_nm"),
						S0_T1.trd_cur_cd,
						S0_T1.ptax_xrate,
						S0_T1.xrate,
						S0_T2.trd_cur_upri,
						decode(
							S0_T6.outsrc_flg,
							value(true),
							S0_M1.repurc_obli_flg,
							value(false)
							).as("repurc_obli_flg"),
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.trd_cur_proc_upri,
						S0_T2.trd_cur_onr_prov_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_proc_amt,
						S0_T2.trd_cur_onr_prov_amt,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T2.dscnt_rsn_cd,
						S0_T2.wtax_amt,
						S0_T2.wtax_rate,
						S0_T6.interim_flg,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T6.dlv_cd.isNotNull())
										.then(S0_T8.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T6.dlv_cd.isNotNull())
										.then(S0_T8.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T2.purc_id_typ,
						S0_T2.purc_rsn_cd,
						S0_T2.purc_dpt_cd,
						S0_M12.dpt_nm.as("purc_dpt_nm"),
						S0_M12.wg_cd.as("purc_dpt_wg_cd"),
						S0_T2.purc_usr_cd,
						S0_T2.ap_dpt_cd,
						S0_M28.dpt_nm.as("ap_dpt_nm"),
						S0_T2.manual_add_flg,
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
						S0_M31.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_slo_no,
						S0_T2.bd_iv_no,
						S0_T2.bd_po_no,
						S0_T2.rcpt_iv_d_rmrks,
						S0_T2.intr_d_rmrks,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T8.cntry_org_cd,
						S0_T2.base_unit_cd,
						cases()
						.when(S0_T2.manual_add_flg.eq(value(true)))
							.then(S0_T15_TempView.pr("base_unit_qty"))
						.otherwise(S0_T3.base_unit_purc_qty).as("purc_qty"),
						S0_ARRSCHD.abort_qty,
						cases()
						.when(S0_T2.manual_add_flg.eq(value(true)))
							.then(S0_T16_TempView.pr("arr_qty"))
						.otherwise(S0_ARRSCHD.arr_qty).as("arr_qty"),
						S0_T3.base_unit_accpt_dfct_qty,
						S0_T3.base_unit_abort_qty,
						S0_T1.sub_char1.as("rcpt_iv_sub_char1"),
						S0_T1.sub_char2.as("rcpt_iv_sub_char2"),
						S0_T1.sub_char3.as("rcpt_iv_sub_char3"),
						S0_T2.sub_char1.as("rcpt_iv_d_sub_char1"),
						S0_T2.sub_char2.as("rcpt_iv_d_sub_char2"),
						S0_T2.sub_char3.as("rcpt_iv_d_sub_char3"),
						decode(
							S0_T11.pre_rcpt_iv_flg,
							value(true),
							value(false),
							value(false),
							value(true)
						).as("iv_reg_flg"),
						S0_T11.iv_no,
						S0_T2.upd_cntr,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_ts,
						S0_T2.ins_func_id,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_ts,
						S0_T2.upd_func_id,
						S0_T2.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						S0_T8.slo_no.as("join_slo_no_"),
						// すべて仕入対象外の場合は確定オフ
						S0_T14_TempView.pr("fix_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rcpt_iv_mng_no.eq(S0_T2.rcpt_iv_mng_no)
								.and(S0_T1.rcpt_iv_rev.eq(S0_T2.rcpt_iv_rev))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.purc_schd_no.eq(S0_T3.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_ARRSCHD).on(
							bracket(
								S0_ARRSCHD.arr_schd_no.eq(S0_T3.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T5.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.po_no.eq(S0_T7.po_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T6.slo_d_no.eq(S0_T8.slo_d_no)
								.and(S0_T6.dlv_cd.eq(S0_T8.dlv_cd))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T7.wrk_no.eq(S0_T10.wrk_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T1.rcpt_iv_mng_no.eq(S0_T11.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T2.sno1.eq(S0_T12.sno1)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.purc_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T1.iv_dt.gte(S0_M12.st_dt))
								.and(S0_T1.iv_dt.lte(S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M17.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M17.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M17.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M17.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_T2.trd_unit_cd.eq(S0_M23.unit_cd))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M24.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M24.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M24.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M24.itm_sub3))
								.and(S0_T3.trd_unit_cd.eq(S0_M24.unit_cd))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M25.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M25.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M25.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M25.itm_sub3))
								.and(S0_M25.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.iv_dt.gte(S0_M28.st_dt))
								.and(S0_T1.iv_dt.lte(S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M31.dpt_cd)
								.and(S0_T1.iv_dt.between(S0_M31.st_dt, S0_M31.end_dt))
							)
						)
						.leftOuterJoin(S0_M34).on(
							bracket(
								S0_T1.in_to_id_typ.eq(S0_M34.dlv_id_typ)
								.and(S0_T1.in_to_id_cd.eq(S0_M34.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_T13).on(
							S0_T1.rcpt_iv_mng_no.eq(S0_T13.rcpt_iv_mng_no)
						)
						.leftOuterJoin(S0_T14_View).on(
								value(0).eq(value(0))
								.and(S0_T14_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no).eq(S0_T1.rcpt_iv_mng_no))
								.and(S0_T14_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_rev).eq(S0_T1.rcpt_iv_rev))
							)
						.leftOuterJoin(S0_T15_View).on(
							value(0).eq(value(0))
							.and(S0_T15_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no).eq(S0_T2.rcpt_iv_mng_no))
							.and(S0_T15_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_rev).eq(S0_T2.rcpt_iv_rev))
							.and(S0_T15_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_d_no).eq(S0_T2.rcpt_iv_d_no))
						)
						.leftOuterJoin(S0_T16_View).on(
							value(0).eq(value(0))
							.and(S0_T16_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no).eq(S0_T2.rcpt_iv_mng_no))
							.and(S0_T16_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_rev).eq(S0_T2.rcpt_iv_rev))
							.and(S0_T16_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_d_no).eq(S0_T2.rcpt_iv_d_no))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.purc_cmpl_flg.eq(bind("tmp_cmpl_flg")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T2.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
						.cutoff$and(S0_T2.po_no.like(bind("po_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T2.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
						.cutoff$and(S0_T1.purc_schd_dt.lte(bind("purc_schd_dt_to")))
						.cutoff$and(S0_T1.purc_dt.gte(bind("purc_dt_fr")))
						.cutoff$and(S0_T1.purc_dt.lte(bind("purc_dt_to")))
						.cutoff$and(S0_T1.iv_dt.gte(bind("iv_dt_fr")))
						.cutoff$and(S0_T1.iv_dt.lte(bind("iv_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.in_to_id_typ.like(bind("in_to_id_typ")))
						.cutoff$and(S0_T1.in_to_id_cd.like(bind("in_to_id_cd")))
						.cutoff$and(
							nvl(
								S0_T1.in_to_id_nm,
								S0_M34.dlv_id_nm
							).like(bind("in_to_id_nm"))
						)
						.cutoff$and(S0_T2.purc_usr_cd.like(bind("purc_usr_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M12.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_M17.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M17.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M17.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T8.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T6.dlv_cd.isNotNull()))
						.cutoff$and(S0_T8.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T6.dlv_cd.isNotNull()))
						.cutoff$and(S0_T1.rcpt_iv_rmrks.like(bind("rcpt_iv_rmrks")))
						.cutoff$and(S0_T2.rcpt_iv_d_rmrks.like(bind("rcpt_iv_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("sub_d_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("sub_d_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("sub_d_char3")))
						.cutoff$and(
							bind("inc_can_flg_str").eq(value(false))
							.and(S0_T13.rcpt_iv_mng_no.isNotNull())
						)
						.cutoff$and(
							bind("inc_past_flg_str").eq(value(false))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S1_RCPTIVP)
									.where(
										S1_RCPTIVP.rcpt_iv_mng_no.eq(S0_T1.rcpt_iv_mng_no)
										.and(S1_RCPTIVP.rcpt_iv_rev.gt(S0_T1.rcpt_iv_rev))
									)
								)
							)
						)
						.cutoff$and(
							S0_T14_TempView.pr("fix_flg").eq(bind("TMP_FIX_FLG"))
						)
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.rcpt_iv_no.asc(),
						S0_T1.rcpt_iv_mng_no.asc(),
						S0_T3.purc_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T2.purc_usr_cd.eq(S0_M13.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_M17.itm_typ.eq(S0_M18.itm_typ).and(S0_M17.itm_typ_d_cd.eq(S0_M18.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM11.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M1.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM12.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M1.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM13.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M1.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM14.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M1.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM15.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M1.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM16.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M1.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM17.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M1.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM18.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M1.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM19.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M1.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM110.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M1.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M17.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M17.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M17.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M17.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M17.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M17.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M17.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M17.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M17.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M17.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M17.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M17.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.cst_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_cd", m.cst_cd());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("in_to_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
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
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2250_MST_RCPT_IV_Query_S02
	 */
	static MCQueryPlan MSBEL2250_MST_RCPT_IV_S02() {
		MST_RCPT_IV_P_R S0_T1 = MST_RCPT_IV_P_R.create("T1");
		MST_IV_R S0_T2 = MST_IV_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MSVM_DLV_ID_R S0_M34 = MSVM_DLV_ID_R.create("M34");
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
		MST_RCPT_IV_R S0_T3 = MST_RCPT_IV_R.create("T3");
		MST_RCPT_IV_D_P_R S0_T4 = MST_RCPT_IV_D_P_R.create("T4");
		MST_PURC_SCHD_R S0_T5 = MST_PURC_SCHD_R.create("T5");
		MST_RCPT_IV_D_P_R S0_T6 = MST_RCPT_IV_D_P_R.create("T6");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T4_TempView = createTempView("S0_T3_View");
		MCSingleView S0_T4_View = subQuery().select(
				S0_T4.rcpt_iv_mng_no,
				S0_T4.rcpt_iv_rev,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T4.trd_cur_amt.multiply(value(-1)),
						S0_T4.trd_cur_amt
					)
				).as("ttl_trd_cur_amt"),
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T4.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_T4.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_T4.trd_cur_amt.add(S0_T4.trd_cur_tax_amt))
				).as("ttl_trd_cur_inc_tax_amt")
				)
				.from(
					S0_T4
					.leftOuterJoin(itmR).on(
						bracket(
							S0_T4.itm_cd.eq(itmR.itm_cd)
							.and(S0_T4.itm_sub1.eq(itmR.itm_sub1))
							.and(S0_T4.itm_sub2.eq(itmR.itm_sub2))
							.and(S0_T4.itm_sub3.eq(itmR.itm_sub3))
						)
					)
				)
				.groupBy(
					S0_T4.rcpt_iv_mng_no,
					S0_T4.rcpt_iv_rev
				).view(S0_T4_TempView);
		MST_RCPT_IV_P_R S1_RCPTIVP = MST_RCPT_IV_P_R.create("RCPTIVP");

		MCTempView S0_T6_TempView = createTempView("S0_T6_View");
		MCSingleView S0_T6_View = subQuery().select(
				S0_T1.rcpt_iv_mng_no,
				S0_T1.rcpt_iv_rev,
				decode(
						subQuery()
						.select(min(S0_T5.non_purc_flg))
						.from(S0_T5
							.innerJoin(S0_T6)
							.on(S0_T5.purc_schd_no.eq(S0_T6.purc_schd_no)))
						.where(S0_T6.rcpt_iv_mng_no.eq(S0_T1.rcpt_iv_mng_no)),
						value(true), value(false), S0_T1.purc_cmpl_flg
					).as("fix_flg")
				)
				.from(
					S0_T1
				).view(S0_T6_TempView);
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2250_MST_RCPT_IV_Query_S02")
					.mainQuery()
					.select(
						S0_T1.rcpt_iv_mng_no,
						S0_T1.purc_cmpl_flg,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_rev,
						S0_T1.purc_schd_dt,
						S0_T1.purc_dt,
						S0_T1.iv_dt,
						S0_T1.sppl_cd,
						S0_T1.in_to_id_typ,
						S0_T1.in_to_id_cd,
						nvl(
							S0_T1.in_to_id_nm,
							S0_M34.dlv_id_nm
						).as("in_to_id_nm"),
						S0_T1.in_to_cntct_dpt,
						S0_T1.in_to_cntct_psn,
						S0_T1.in_to_zip_cd,
						S0_T1.in_to_addr1,
						S0_T1.in_to_addr2,
						S0_T1.in_to_addr3,
						S0_T1.in_to_addr4,
						S0_T1.in_to_tel,
						S0_T1.in_to_fax,
						S0_T1.in_to_cntry_cd,
						S0_T1.trnspt_cd,
						S0_T1.vssl_flght,
						S0_T1.load_port_cd,
						S0_T1.etd_dt,
						S0_T1.dschrg_port_cd,
						S0_T1.eta_dt,
						S0_T1.via_port_cd,
						S0_T1.via_schd_dt,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.pay_schd_dt,
						S0_T1.rcpt_iv_rmrks,
						S0_T1.intr_rmrks,
						nvl2(
							S0_T3.rcpt_iv_mng_no,
							value(false),
							value(true)
						).as("can_flg"),
						S0_T1.trd_cur_cd,
						S0_T4_TempView.pr("ttl_trd_cur_amt"),
						S0_T4_TempView.pr("ttl_trd_cur_inc_tax_amt"),
						S0_T1.sub_char1.as("rcpt_iv_sub_char1"),
						S0_T1.sub_char2.as("rcpt_iv_sub_char2"),
						S0_T1.sub_char3.as("rcpt_iv_sub_char3"),
						S0_T2.iv_no,
						decode(
							S0_T2.pre_rcpt_iv_flg,
							value(true),
							value(false),
							value(false),
							value(true)
						).as("iv_reg_flg"),
						S0_T1.upd_cntr,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						// すべて仕入対象外の場合は確定オフ
						S0_T6_TempView.pr("fix_flg"),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.rcpt_iv_mng_no.eq(S0_T2.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(S0_M34).on(
							bracket(
								S0_T1.in_to_id_typ.eq(S0_M34.dlv_id_typ)
								.and(S0_T1.in_to_id_cd.eq(S0_M34.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_T3).on(
							S0_T1.rcpt_iv_mng_no.eq(S0_T3.rcpt_iv_mng_no)
						)
						.leftOuterJoin(S0_T4_View).on(
							value(0).eq(value(0))
							.and(S0_T4_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no).eq(S0_T1.rcpt_iv_mng_no))
							.and(S0_T4_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_rev).eq(S0_T1.rcpt_iv_rev))
						)
						.leftOuterJoin(S0_T6_View).on(
							value(0).eq(value(0))
							.and(S0_T6_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no).eq(S0_T1.rcpt_iv_mng_no))
							.and(S0_T6_TempView.pr(MST_RCPT_IV_D_P_R.$rcpt_iv_rev).eq(S0_T1.rcpt_iv_rev))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.purc_cmpl_flg.eq(bind("tmp_cmpl_flg")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
						.cutoff$and(S0_T1.purc_schd_dt.lte(bind("purc_schd_dt_to")))
						.cutoff$and(S0_T1.purc_dt.gte(bind("purc_dt_fr")))
						.cutoff$and(S0_T1.purc_dt.lte(bind("purc_dt_to")))
						.cutoff$and(S0_T1.iv_dt.gte(bind("iv_dt_fr")))
						.cutoff$and(S0_T1.iv_dt.lte(bind("iv_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.in_to_id_typ.like(bind("in_to_id_typ")))
						.cutoff$and(S0_T1.in_to_id_cd.like(bind("in_to_id_cd")))
						.cutoff$and(
							nvl(
								S0_T1.in_to_id_nm,
								S0_M34.dlv_id_nm
							).like(bind("in_to_id_nm"))
						)
						.cutoff$and(S0_T1.rcpt_iv_rmrks.like(bind("rcpt_iv_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							bind("inc_can_flg_str").eq(value(false))
							.and(S0_T3.rcpt_iv_mng_no.isNotNull())
						)
						.cutoff$and(
							bind("inc_past_flg_str").eq(value(false))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S1_RCPTIVP)
									.where(
										S1_RCPTIVP.rcpt_iv_mng_no.eq(S0_T1.rcpt_iv_mng_no)
										.and(S1_RCPTIVP.rcpt_iv_rev.gt(S0_T1.rcpt_iv_rev))
									)
								)
							)
						)
						.cutoff$and(
							S0_T6_TempView.pr("fix_flg").eq(bind("TMP_FIX_FLG"))
						)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.rcpt_iv_no.asc(),
						S0_T1.rcpt_iv_mng_no.asc(),
						S0_T1.rcpt_iv_rev.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.sppl_cd.eq(S0_M1.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM11.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M1.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM12.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M1.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM13.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M1.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM14.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M1.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM15.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M1.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM16.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M1.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM17.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M1.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM18.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M1.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM19.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M1.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM110.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M1.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("in_to_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
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
					.add(MAM_CUR_R.class, r -> toCondition(
						r.getStringNE("trd_cur_cd")
					))
					.addSelect(m -> toArray(
						m.cur_nm,
						m.amt_dec_place
					))
					.addMap((r, m) -> {
						r.setStringNE("trd_cur_nm", m.cur_nm());
						r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
					})
				)
			);
	}
}