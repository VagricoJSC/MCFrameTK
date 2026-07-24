package mcframe.serverMSLA.MSLAL6220;

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
	 * -- MSLAL6220_MST_INPT_ACT_RECV_IF_Query_S02
	 */
	static MCQueryPlan MSLAL6220_MST_INPT_ACT_RECV_IF_S02() {
		MST_INPT_ACT_RECV_IF_R S0_T1 = MST_INPT_ACT_RECV_IF_R.create("T1");
		PFT_SDRV_IF_R S0_T2 = PFT_SDRV_IF_R.create("T2");
		MAM_EXT_SYS_R S0_M1 = MAM_EXT_SYS_R.create("M1");
		MST_ITM_MFG_INST_R S1_T11 = MST_ITM_MFG_INST_R.create("T11");
		MST_YIELD_ACT_R S2_T10 = MST_YIELD_ACT_R.create("T10");
		MST_OPER_ACT_R S3_T9 = MST_OPER_ACT_R.create("T9");
		MST_INPT_ACT_R S4_TI = MST_INPT_ACT_R.create("TI");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6220_MST_INPT_ACT_RECV_IF_Query_S02")
					.mainQuery()
					.select(
						value(MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.value()).as("if_proc_typ"),
						S0_T1.data_lno,
						S0_T1.data_no,
						S0_T1.exe_sts_typ,
						S0_T1.data_crud_typ,
						S0_T1.ext_sys_cd,
						S0_T1.ext_data_no,
						S0_T1.ext_data_lno,
						S0_T1.data_make_dt,
						S0_T1.imp_flg,
						S0_T1.recv_dt,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_rev,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T1.ext_oper_act_no,
						S0_T1.act_intr_rmrks,
						S0_T1.inpt_act_rpt_rmrks,
						S0_T1.act_trd_rmrks,
						S0_T1.abort_flg,
						S0_T1.inpt_schd_no,
						S0_T1.ext_inpt_act_no,
						S0_T1.ext_yield_act_no,
						cases()
							.when(S0_T1.ext_yield_act_no.isNotNull())
								.then(
									subQuery()
									.select(S1_T11.unschd_act_flg)
									.from(S1_T11)
									.where(
										S1_T11.can_flg.eq(value(false))
										.and(
											S1_T11.itm_mfg_inst_no.eq(subQuery()
												.select(S2_T10.itm_mfg_inst_no)
												.from(S2_T10)
												.where(
													S2_T10.ext_yield_act_no.eq(S0_T1.ext_yield_act_no)
												)
											)
										)
									)
							)
							.otherwise(value(false)).as("unschd_act_flg"),
						S0_T1.itm_cd,
						nvl(
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub1"),
						nvl(
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub2"),
						nvl(
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub3"),
						nvl(
							S0_T1.lot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("lot_no"),
						nvl(
							S0_T1.sublot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("sublot_no"),
						nvl(
							S0_T1.sno1,
							value(MAC_STR.NULL_VAL.value())
						).as("sno1"),
						nvl(
							S0_T1.sno2,
							value(MAC_STR.NULL_VAL.value())
						).as("sno2"),
						nvl(
							S0_T1.sno3,
							value(MAC_STR.NULL_VAL.value())
						).as("sno3"),
						nvl(
							S0_T1.sno4,
							value(MAC_STR.NULL_VAL.value())
						).as("sno4"),
						nvl2(
							coalesce(
								S0_T1.sno1,
								S0_T1.sno2,
								S0_T1.sno3,
								S0_T1.sno4
							),
							value(true),
							value(false)
						).as("sno_recv_flg"),
						S0_T1.gd_cd,
						S0_T1.act_tm,
						S0_T1.if_inpt_typ,
						S0_T1.inpt_rsn_cd,
						S0_T1.loss_rsn_cd,
						S0_T1.old_loss_rsn_cd,
						S0_T1.acxfr_qty,
						S0_T1.acxfr_rsn_cd,
						S0_T1.acxfr_bd_dpt_cd,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.stk_id_typ,
						S0_T1.base_unit_inpt_qty,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T1.cont_qty,
						S0_T1.not_pd_chk_flg,
						S0_T1.mfg_loc_cd,
						S0_T1.mfg_itm_cd,
						nvl(
							S0_T1.mfg_itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub1"),
						nvl(
							S0_T1.mfg_itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub2"),
						nvl(
							S0_T1.mfg_itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub3"),
						cases()
							.when(
								S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
								.and(S0_T1.ext_oper_act_no.isNotNull())
							)
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S3_T9)
									.where(
										S3_T9.ext_oper_act_no.eq(S0_T1.ext_oper_act_no)
										.and(S3_T9.ext_sys_cd.eq(S0_T1.ext_sys_cd))
									)
							)
							.otherwise(value(0)).as("ext_oper_act_cnt"),
						bracket(
							subQuery()
							.select(count(value("X")))
							.from(S4_TI)
							.where(
								S4_TI.ext_inpt_act_no.eq(S0_T1.ext_inpt_act_no)
								.and(S4_TI.ext_sys_cd.eq(S0_T1.ext_sys_cd))
							)
						).as("ext_act_cnt"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.sub_char4,
						S0_T1.sub_char5,
						S0_T1.sub_char6,
						S0_T1.sub_char7,
						S0_T1.sub_char8,
						S0_T1.sub_char9,
						S0_T1.sub_char10,
						S0_T1.sub_char11,
						S0_T1.sub_char12,
						S0_T1.sub_char13,
						S0_T1.sub_char14,
						S0_T1.sub_char15,
						S0_T1.sub_char16,
						S0_T1.sub_char17,
						S0_T1.sub_char18,
						S0_T1.sub_char19,
						S0_T1.sub_char20,
						S0_T1.sub_char21,
						S0_T1.sub_char22,
						S0_T1.sub_char23,
						S0_T1.sub_char24,
						S0_T1.sub_char25,
						S0_T1.sub_char26,
						S0_T1.sub_char27,
						S0_T1.sub_char28,
						S0_T1.sub_char29,
						S0_T1.sub_char30,
						S0_T1.sub_num1,
						S0_T1.sub_num2,
						S0_T1.sub_num3,
						S0_T1.sub_num4,
						S0_T1.sub_num5,
						S0_T1.sub_dt1,
						S0_T1.sub_dt2,
						S0_T1.sub_dt3,
						S0_T1.sub_dt4,
						S0_T1.sub_dt5,
						S0_T1.upd_srv_req_no,
						S0_M1.not_dup_imp_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.data_no.eq(S0_T1.data_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ext_sys_cd.eq(S0_T1.ext_sys_cd)
								.and(S0_M1.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T1.imp_flg.eq(value(true))
						.and(
							S0_T2.sdrv_sts_typ.isNull()
							.or(S0_T2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))
						)
						.cutoff$and(S0_T1.data_lno.eq(bind("data_lno")))
						.cutoff$and(S0_T1.data_no.eq(bind("data_no")))
						.cutoff$and(S0_T1.ext_data_no.eq(bind("ext_data_no")))
						.cutoff$and(S0_T1.ext_sys_cd.eq(bind("ext_sys_cd")))
					)
					.orderBy(
						S0_T1.ext_sys_cd.asc(),
						S0_T1.ext_data_no.asc(),
						S0_T1.if_inpt_typ.asc(),
						S0_T1.data_crud_typ.desc(),
						S0_T1.data_lno.asc()
					)
			);
	}
	
	/**
	 * -- MSLAL6220_MST_ITM_MFG_INST_Query_S05
	 */
	static MCQueryPlan MSLAL6220_MST_ITM_MFG_INST_S05() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_OPER_INST_R S0_T3 = MST_OPER_INST_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6220_MST_ITM_MFG_INST_Query_S05")
					.mainQuery()
					.selectDistinct(
						S0_T1.mfg_loc_cd.as("mfg_loc_cd_lasted"),
						S0_T1.site_cd.as("site_cd_lasted"),
						S0_T1.wg_cd.as("wg_cd_lasted"),
						S0_T1.mfg_mtd_typ.as("mfg_mtd_typ_lasted"),
						S0_T1.mfg_str_ln_cd.as("mfg_str_ln_cd_lasted"),
						S0_T1.itm_cd.as("mfg_itm_cd_lasted"),
						S0_T1.itm_sub1.as("mfg_itm_sub1_lasted"),
						S0_T1.itm_sub2.as("mfg_itm_sub2_lasted"),
						S0_T1.itm_sub3.as("mfg_itm_sub3_lasted"),
						S0_T1.strg_loc_cd.as("mfg_strg_loc_cd"),
						S0_T1.strg_str_ln_cd.as("mfg_strg_str_ln_cd"),
						S0_T1.unschd_act_flg,
						S0_T2.mfg_inst_no.as("mfg_inst_no_lasted"),
						S0_T2.mfg_inst_rev.as("mfg_inst_rev_lasted"),
						S0_T3.oper_cd.as("oper_cd_lasted"),
						S0_T3.oper_seq.as("oper_seq_lasted")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T3.mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T3.oper_inst_no.eq(bind("oper_inst_no")))
						.and(S0_T3.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSLAL6220_MST_OPER_ACT_RECV_IF_Query_S01
	 */
	static MCQueryPlan MSLAL6220_MST_OPER_ACT_RECV_IF_S01() {
		MST_OPER_ACT_RECV_IF_R S0_T1 = MST_OPER_ACT_RECV_IF_R.create("T1");
		PFT_SDRV_IF_R S0_T2 = PFT_SDRV_IF_R.create("T2");
		MAM_EXT_SYS_R S0_M1 = MAM_EXT_SYS_R.create("M1");
		MST_OPER_ACT_R S1_T9 = MST_OPER_ACT_R.create("T9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6220_MST_OPER_ACT_RECV_IF_Query_S01")
					.mainQuery()
					.select(
						value(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value()).as("if_proc_typ"),
						S0_T1.data_lno,
						S0_T1.data_no,
						S0_T1.exe_sts_typ,
						S0_T1.data_crud_typ,
						S0_T1.ext_sys_cd,
						S0_T1.ext_data_no,
						S0_T1.ext_data_lno,
						S0_T1.data_make_dt,
						S0_T1.imp_flg,
						S0_T1.recv_dt,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_rev,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T1.ext_oper_act_no,
						S0_T1.intr_rmrks,
						S0_T1.act_rpt_rmrks,
						S0_T1.not_cmpl_flg,
						S0_T1.st_act_tm,
						S0_T1.end_act_tm,
						S0_T1.oper_unit_qty,
						S0_T1.bkf_ctl_flg,
						S0_T1.wk_cost_calc_ctl_flg,
						S0_T1.oper_yield,
						S0_T1.mfg_loc_cd,
						S0_T1.mfg_itm_cd,
						nvl(
							S0_T1.mfg_itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub1"),
						nvl(
							S0_T1.mfg_itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub2"),
						nvl(
							S0_T1.mfg_itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub3"),
						cases()
							.when(
								S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
								.and(S0_T1.ext_oper_act_no.isNotNull())
							)
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S1_T9)
									.where(
										S1_T9.ext_oper_act_no.eq(S0_T1.ext_oper_act_no)
										.and(S1_T9.ext_sys_cd.eq(S0_T1.ext_sys_cd))
										.and(S1_T9.if_auto_reg_flg.eq(value(false)))
									)
							)
							.otherwise(value(0)).as("ext_oper_act_cnt"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.sub_char4,
						S0_T1.sub_char5,
						S0_T1.sub_char6,
						S0_T1.sub_char7,
						S0_T1.sub_char8,
						S0_T1.sub_char9,
						S0_T1.sub_char10,
						S0_T1.sub_char11,
						S0_T1.sub_char12,
						S0_T1.sub_char13,
						S0_T1.sub_char14,
						S0_T1.sub_char15,
						S0_T1.sub_char16,
						S0_T1.sub_char17,
						S0_T1.sub_char18,
						S0_T1.sub_char19,
						S0_T1.sub_char20,
						S0_T1.sub_char21,
						S0_T1.sub_char22,
						S0_T1.sub_char23,
						S0_T1.sub_char24,
						S0_T1.sub_char25,
						S0_T1.sub_char26,
						S0_T1.sub_char27,
						S0_T1.sub_char28,
						S0_T1.sub_char29,
						S0_T1.sub_char30,
						S0_T1.sub_num1,
						S0_T1.sub_num2,
						S0_T1.sub_num3,
						S0_T1.sub_num4,
						S0_T1.sub_num5,
						S0_T1.sub_dt1,
						S0_T1.sub_dt2,
						S0_T1.sub_dt3,
						S0_T1.sub_dt4,
						S0_T1.sub_dt5,
						S0_T1.upd_srv_req_no,
						S0_M1.not_dup_imp_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.data_no.eq(S0_T1.data_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ext_sys_cd.eq(S0_T1.ext_sys_cd)
								.and(S0_M1.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T1.imp_flg.eq(value(true))
						.and(
							S0_T2.sdrv_sts_typ.isNull()
							.or(S0_T2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))
						)
						.cutoff$and(S0_T1.data_lno.eq(bind("data_lno")))
						.cutoff$and(S0_T1.data_no.eq(bind("data_no")))
						.cutoff$and(S0_T1.ext_data_no.eq(bind("ext_data_no")))
						.cutoff$and(S0_T1.ext_sys_cd.eq(bind("ext_sys_cd")))
					)
					.orderBy(
						S0_T1.ext_sys_cd.asc(),
						S0_T1.ext_data_no.asc(),
						S0_T1.data_crud_typ.desc(),
						S0_T1.data_lno.asc()
					)
			);
	}
	
	/**
	 * -- MSLAL6220_MST_WK_ACT_RECV_IF_Query_S03
	 */
	static MCQueryPlan MSLAL6220_MST_WK_ACT_RECV_IF_S03() {
		MST_WK_ACT_RECV_IF_R S0_T1 = MST_WK_ACT_RECV_IF_R.create("T1");
		PFT_SDRV_IF_R S0_T2 = PFT_SDRV_IF_R.create("T2");
		MAM_EXT_SYS_R S0_M1 = MAM_EXT_SYS_R.create("M1");
		MST_ITM_MFG_INST_R S1_T11 = MST_ITM_MFG_INST_R.create("T11");
		MST_YIELD_ACT_R S2_T10 = MST_YIELD_ACT_R.create("T10");
		MST_OPER_ACT_R S3_T9 = MST_OPER_ACT_R.create("T9");
		MST_WK_ACT_R S4_TW = MST_WK_ACT_R.create("TW");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6220_MST_WK_ACT_RECV_IF_Query_S03")
					.mainQuery()
					.select(
						value(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value()).as("if_proc_typ"),
						S0_T1.data_lno,
						S0_T1.data_no,
						S0_T1.exe_sts_typ,
						S0_T1.data_crud_typ,
						S0_T1.ext_sys_cd,
						S0_T1.ext_data_no,
						S0_T1.ext_data_lno,
						S0_T1.data_make_dt,
						S0_T1.imp_flg,
						S0_T1.recv_dt,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_rev,
						S0_T1.div_seq,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T1.ext_oper_act_no,
						S0_T1.ext_yield_act_no,
						cases()
							.when(S0_T1.ext_yield_act_no.isNotNull())
								.then(
									subQuery()
									.select(S1_T11.unschd_act_flg)
									.from(S1_T11)
									.where(
										S1_T11.can_flg.eq(value(false))
										.and(
											S1_T11.itm_mfg_inst_no.eq(subQuery()
												.select(S2_T10.itm_mfg_inst_no)
												.from(S2_T10)
												.where(
													S2_T10.ext_yield_act_no.eq(S0_T1.ext_yield_act_no)
												)
											)
										)
									)
							)
							.otherwise(value(false)).as("unschd_act_flg"),
						S0_T1.intr_rmrks.as("wk_intr_rmrks"),
						S0_T1.abort_flg,
						S0_T1.wk_schd_no,
						S0_T1.ext_wk_act_no,
						S0_T1.brk_pd,
						S0_T1.wk_usr_dpt_cd,
						S0_T1.wk_usr_cd,
						S0_T1.wk_day_cd,
						S0_T1.wk_cost,
						S0_T1.wk_rsn_cd,
						S0_T1.wk_cost_cd,
						S0_T1.fclty,
						S0_T1.st_hm,
						S0_T1.end_hm,
						S0_T1.wk_cost_calc_upd_flg,
						S0_T1.ac_dt,
						S0_T1.dpt_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						cases()
							.when(
								S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
								.and(S0_T1.ext_oper_act_no.isNotNull())
							)
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S3_T9)
									.where(
										S3_T9.ext_oper_act_no.eq(S0_T1.ext_oper_act_no)
										.and(S3_T9.ext_sys_cd.eq(S0_T1.ext_sys_cd))
									)
							)
							.otherwise(value(0)).as("ext_oper_act_cnt"),
						cases()
							.when(S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value())))
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S4_TW)
									.where(
										S4_TW.ext_wk_act_no.eq(S0_T1.ext_wk_act_no)
										.and(S4_TW.ext_sys_cd.eq(S0_T1.ext_sys_cd))
									)
							)
							.otherwise(value(0)).as("ext_act_cnt"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.sub_char4,
						S0_T1.sub_char5,
						S0_T1.sub_char6,
						S0_T1.sub_char7,
						S0_T1.sub_char8,
						S0_T1.sub_char9,
						S0_T1.sub_char10,
						S0_T1.sub_char11,
						S0_T1.sub_char12,
						S0_T1.sub_char13,
						S0_T1.sub_char14,
						S0_T1.sub_char15,
						S0_T1.sub_char16,
						S0_T1.sub_char17,
						S0_T1.sub_char18,
						S0_T1.sub_char19,
						S0_T1.sub_char20,
						S0_T1.sub_char21,
						S0_T1.sub_char22,
						S0_T1.sub_char23,
						S0_T1.sub_char24,
						S0_T1.sub_char25,
						S0_T1.sub_char26,
						S0_T1.sub_char27,
						S0_T1.sub_char28,
						S0_T1.sub_char29,
						S0_T1.sub_char30,
						S0_T1.sub_num1,
						S0_T1.sub_num2,
						S0_T1.sub_num3,
						S0_T1.sub_num4,
						S0_T1.sub_num5,
						S0_T1.sub_dt1,
						S0_T1.sub_dt2,
						S0_T1.sub_dt3,
						S0_T1.sub_dt4,
						S0_T1.sub_dt5,
						S0_T1.upd_srv_req_no,
						S0_M1.not_dup_imp_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.data_no.eq(S0_T1.data_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ext_sys_cd.eq(S0_T1.ext_sys_cd)
								.and(S0_M1.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T1.imp_flg.eq(value(true))
						.and(
							S0_T2.sdrv_sts_typ.isNull()
							.or(S0_T2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))
						)
						.cutoff$and(S0_T1.data_lno.eq(bind("data_lno")))
						.cutoff$and(S0_T1.data_no.eq(bind("data_no")))
						.cutoff$and(S0_T1.ext_data_no.eq(bind("ext_data_no")))
						.cutoff$and(S0_T1.ext_sys_cd.eq(bind("ext_sys_cd")))
					)
					.orderBy(
						S0_T1.ext_sys_cd.asc(),
						S0_T1.ext_data_no.asc(),
						S0_T1.data_crud_typ.desc(),
						S0_T1.data_lno.asc()
					)
			);
	}
	
	/**
	 * -- MSLAL6220_MST_YIELD_ACT_RECV_IF_Query_S04
	 */
	static MCQueryPlan MSLAL6220_MST_YIELD_ACT_RECV_IF_S04() {
		MST_YIELD_ACT_RECV_IF_R S0_T1 = MST_YIELD_ACT_RECV_IF_R.create("T1");
		PFT_SDRV_IF_R S0_T2 = PFT_SDRV_IF_R.create("T2");
		MAM_EXT_SYS_R S0_M1 = MAM_EXT_SYS_R.create("M1");
		MST_OPER_ACT_R S1_T9 = MST_OPER_ACT_R.create("T9");
		MST_YIELD_ACT_R S2_TY = MST_YIELD_ACT_R.create("TY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6220_MST_YIELD_ACT_RECV_IF_Query_S04")
					.mainQuery()
					.select(
						value(MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.value()).as("if_proc_typ"),
						S0_T1.data_lno,
						S0_T1.data_no,
						S0_T1.exe_sts_typ,
						S0_T1.data_crud_typ,
						S0_T1.ext_sys_cd,
						S0_T1.ext_data_no,
						S0_T1.ext_data_lno,
						S0_T1.data_make_dt,
						S0_T1.imp_flg,
						S0_T1.recv_dt,
						S0_T1.unschd_act_flg,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_rev,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T1.ext_oper_act_no,
						S0_T1.mfg_act_intr_rmrks,
						S0_T1.mfg_act_rpt_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.yield_act_intr_rmrks,
						S0_T1.yield_act_rpt_rmrks,
						S0_T1.abort_flg,
						S0_T1.yield_schd_no,
						S0_T1.ext_yield_act_no,
						S0_T1.itm_cd,
						nvl(
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub1"),
						nvl(
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub2"),
						nvl(
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub3"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.act_tm,
						S0_T1.all_oper_act_reg_flg,
						S0_T1.yield_typ,
						S0_T1.yield_rsn_cd,
						S0_T1.yield_rate,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.same_lot_flg,
						S0_T1.itm_yield,
						S0_T1.strg_loc_cd,
						S0_T1.strg_str_ln_cd,
						S0_T1.insp_cnt_rmrks,
						S0_T1.quality_typ,
						S0_T1.mfg_act_usr_cd,
						S0_T1.mfg_act_dpt_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.mfg_str_ln_cd,
						S0_T1.bom_ptn,
						S0_T1.oper_ptn,
						S0_T1.mfg_itm_cd,
						nvl(
							S0_T1.mfg_itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub1"),
						nvl(
							S0_T1.mfg_itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub2"),
						nvl(
							S0_T1.mfg_itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("mfg_itm_sub3"),
						cases()
							.when(
								S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
								.and(S0_T1.ext_oper_act_no.isNotNull())
							)
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S1_T9)
									.where(
										S1_T9.ext_oper_act_no.eq(S0_T1.ext_oper_act_no)
										.and(S1_T9.ext_sys_cd.eq(S0_T1.ext_sys_cd))
									)
							)
							.otherwise(value(0)).as("ext_oper_act_cnt"),
						cases()
							.when(S0_T1.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value())))
								.then(
									subQuery()
									.select(count(value("X")))
									.from(S2_TY)
									.where(
										S2_TY.ext_yield_act_no.eq(S0_T1.ext_yield_act_no)
										.and(S2_TY.ext_sys_cd.eq(S0_T1.ext_sys_cd))
									)
							)
							.otherwise(value(0)).as("ext_act_cnt"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.sub_char4,
						S0_T1.sub_char5,
						S0_T1.sub_char6,
						S0_T1.sub_char7,
						S0_T1.sub_char8,
						S0_T1.sub_char9,
						S0_T1.sub_char10,
						S0_T1.sub_char11,
						S0_T1.sub_char12,
						S0_T1.sub_char13,
						S0_T1.sub_char14,
						S0_T1.sub_char15,
						S0_T1.sub_char16,
						S0_T1.sub_char17,
						S0_T1.sub_char18,
						S0_T1.sub_char19,
						S0_T1.sub_char20,
						S0_T1.sub_char21,
						S0_T1.sub_char22,
						S0_T1.sub_char23,
						S0_T1.sub_char24,
						S0_T1.sub_char25,
						S0_T1.sub_char26,
						S0_T1.sub_char27,
						S0_T1.sub_char28,
						S0_T1.sub_char29,
						S0_T1.sub_char30,
						S0_T1.sub_num1,
						S0_T1.sub_num2,
						S0_T1.sub_num3,
						S0_T1.sub_num4,
						S0_T1.sub_num5,
						S0_T1.sub_dt1,
						S0_T1.sub_dt2,
						S0_T1.sub_dt3,
						S0_T1.sub_dt4,
						S0_T1.sub_dt5,
						S0_T1.upd_srv_req_no,
						S0_M1.not_dup_imp_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.data_no.eq(S0_T1.data_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ext_sys_cd.eq(S0_T1.ext_sys_cd)
								.and(S0_M1.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T1.imp_flg.eq(value(true))
						.and(
							S0_T2.sdrv_sts_typ.isNull()
							.or(S0_T2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))
						)
						.cutoff$and(S0_T1.data_lno.eq(bind("data_lno")))
						.cutoff$and(S0_T1.data_no.eq(bind("data_no")))
						.cutoff$and(S0_T1.ext_data_no.eq(bind("ext_data_no")))
						.cutoff$and(S0_T1.ext_sys_cd.eq(bind("ext_sys_cd")))
					)
					.orderBy(
						S0_T1.ext_sys_cd.asc(),
						S0_T1.ext_data_no.asc(),
						S0_T1.data_crud_typ.desc(),
						S0_T1.data_lno.asc()
					)
			);
	}
}