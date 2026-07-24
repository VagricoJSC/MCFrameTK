package mcframe.serverMSBE.MSBEL0080;

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
	 * -- MSBEL0080_MST_IO_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL0080_MST_IO_ACT_S01() {
		MST_IO_ACT_R S0T1 = MST_IO_ACT_R.create("T1");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S0M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S0M4 = MAM_SITE_R.create("M4");
		MAM_TRD_R S0M5 = MAM_TRD_R.create("M5");
		MAM_LG_GRP_R S0M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S0M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S0M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STR_LN_R S0M9 = MAM_STR_LN_R.create("M9");
		MAVM_BP_NM_R S0M10 = MAVM_BP_NM_R.create("M10");
		MAM_STK_GD_R S0M11 = MAM_STK_GD_R.create("M11");
		MAVM_BP_NM_R S0M12 = MAVM_BP_NM_R.create("M12");
		MAM_UNIT_R S0M13 = MAM_UNIT_R.create("M13");
		MAM_UNIT_R S0M14 = MAM_UNIT_R.create("M14");
		MAM_WG_R S0M17 = MAM_WG_R.create("M17");
		MAM_WG_R S0M18 = MAM_WG_R.create("M18");
		MAM_UNIT_R S0M19 = MAM_UNIT_R.create("M19");
		MAM_BIZ_RSN_R S0M21 = MAM_BIZ_RSN_R.create("M21");
		MAM_AC_RSN_R S0M22 = MAM_AC_RSN_R.create("M22");
		MAM_DPT_R S0M25 = MAM_DPT_R.create("M25");
		MAM_DPT_R S0M26 = MAM_DPT_R.create("M26");
		MAM_DPT_R S0M27 = MAM_DPT_R.create("M27");
		MAM_DPT_R S0M28 = MAM_DPT_R.create("M28");
		MAM_DPT_R S0M29 = MAM_DPT_R.create("M29");
		MAM_DPT_R S0M30 = MAM_DPT_R.create("M30");
		MAM_DPT_R S0M31 = MAM_DPT_R.create("M31");
		MAM_DPT_R S0M32 = MAM_DPT_R.create("M32");
		MAM_DPT_R S0M33 = MAM_DPT_R.create("M33");
		MAM_DPT_R S0M34 = MAM_DPT_R.create("M34");
		MAM_DPT_R S0M35 = MAM_DPT_R.create("M35");
		MAM_USR_R S0M36 = MAM_USR_R.create("M36");
		MAM_USR_R S0M37 = MAM_USR_R.create("M37");
		MAM_USR_R S0M38 = MAM_USR_R.create("M38");
		MAM_USR_R S0M39 = MAM_USR_R.create("M39");
		MAM_CUR_R S0M40 = MAM_CUR_R.create("M40");
		MAM_TAX_R S0M43 = MAM_TAX_R.create("M43");
		MAM_XRATE_R S0M44 = MAM_XRATE_R.create("M44");
		MAM_XRATE_R S0M45 = MAM_XRATE_R.create("M45");
		MAM_BP_R S0M46 = MAM_BP_R.create("M46");
		MAVM_BP_NM_R S0M47 = MAVM_BP_NM_R.create("M47");
		MAVM_BP_NM_R S0M48 = MAVM_BP_NM_R.create("M48");
		MAVM_BP_NM_R S0M49 = MAVM_BP_NM_R.create("M49");
		MAVM_BP_NM_R S0M50 = MAVM_BP_NM_R.create("M50");
		MAM_BP_R S0M51 = MAM_BP_R.create("M51");
		MAVM_BP_NM_R S0M52 = MAVM_BP_NM_R.create("M52");
		MAVM_BP_NM_R S0M53 = MAVM_BP_NM_R.create("M53");
		MAVM_BP_NM_R S0M54 = MAVM_BP_NM_R.create("M54");
		MAVM_BP_NM_R S0M55 = MAVM_BP_NM_R.create("M55");
		MAVM_BP_NM_R S0M56 = MAVM_BP_NM_R.create("M56");
		MAVM_BP_NM_R S0M57 = MAVM_BP_NM_R.create("M57");
		MAM_BP_R S0M58 = MAM_BP_R.create("M58");
		MAVM_BP_NM_R S0M59 = MAVM_BP_NM_R.create("M59");
		MAM_STTL_R S0M60 = MAM_STTL_R.create("M60");
		MAM_COST_CTG_R S0M63 = MAM_COST_CTG_R.create("M63");
		MAVM_BP_NM_R S0M64 = MAVM_BP_NM_R.create("M64");
		MAM_OPER_R S0M65 = MAM_OPER_R.create("M65");
		MAM_LOC_R S0M66 = MAM_LOC_R.create("M66");
		MAM_WG_R S0M67 = MAM_WG_R.create("M67");
		MAM_OPER_R S0M70 = MAM_OPER_R.create("M70");
		MAM_DPT_R S0M74 = MAM_DPT_R.create("M74");
		MSVT_LOT_LIST_R S0T3 = MSVT_LOT_LIST_R.create("T3");
		MSVT_WRK_SNO_R S0T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_BP_GRP_R S0DL1 = MAM_BP_GRP_R.create("DL1");
		MAM_BP_GRP_R S0DL2 = MAM_BP_GRP_R.create("DL2");
		MAM_BP_GRP_R S0DL3 = MAM_BP_GRP_R.create("DL3");
		MAM_BP_GRP_R S0DL4 = MAM_BP_GRP_R.create("DL4");
		MAM_BP_GRP_R S0DL5 = MAM_BP_GRP_R.create("DL5");
		MAM_BP_GRP_R S0DL6 = MAM_BP_GRP_R.create("DL6");
		MAM_BP_GRP_R S0DL7 = MAM_BP_GRP_R.create("DL7");
		MAM_BP_GRP_R S0DL8 = MAM_BP_GRP_R.create("DL8");
		MAM_BP_GRP_R S0DL9 = MAM_BP_GRP_R.create("DL9");
		MAM_BP_GRP_R S0DL10 = MAM_BP_GRP_R.create("DL10");
		MAM_BP_GRP_R S0CS1 = MAM_BP_GRP_R.create("CS1");
		MAM_BP_GRP_R S0CS2 = MAM_BP_GRP_R.create("CS2");
		MAM_BP_GRP_R S0CS3 = MAM_BP_GRP_R.create("CS3");
		MAM_BP_GRP_R S0CS4 = MAM_BP_GRP_R.create("CS4");
		MAM_BP_GRP_R S0CS5 = MAM_BP_GRP_R.create("CS5");
		MAM_BP_GRP_R S0CS6 = MAM_BP_GRP_R.create("CS6");
		MAM_BP_GRP_R S0CS7 = MAM_BP_GRP_R.create("CS7");
		MAM_BP_GRP_R S0CS8 = MAM_BP_GRP_R.create("CS8");
		MAM_BP_GRP_R S0CS9 = MAM_BP_GRP_R.create("CS9");
		MAM_BP_GRP_R S0CS10 = MAM_BP_GRP_R.create("CS10");
		MAM_BP_GRP_R S0SP1 = MAM_BP_GRP_R.create("SP1");
		MAM_BP_GRP_R S0SP2 = MAM_BP_GRP_R.create("SP2");
		MAM_BP_GRP_R S0SP3 = MAM_BP_GRP_R.create("SP3");
		MAM_BP_GRP_R S0SP4 = MAM_BP_GRP_R.create("SP4");
		MAM_BP_GRP_R S0SP5 = MAM_BP_GRP_R.create("SP5");
		MAM_BP_GRP_R S0SP6 = MAM_BP_GRP_R.create("SP6");
		MAM_BP_GRP_R S0SP7 = MAM_BP_GRP_R.create("SP7");
		MAM_BP_GRP_R S0SP8 = MAM_BP_GRP_R.create("SP8");
		MAM_BP_GRP_R S0SP9 = MAM_BP_GRP_R.create("SP9");
		MAM_BP_GRP_R S0SP10 = MAM_BP_GRP_R.create("SP10");
		MAM_ITM_GRP_R S0IT1 = MAM_ITM_GRP_R.create("IT1");
		MAM_ITM_GRP_R S0IT2 = MAM_ITM_GRP_R.create("IT2");
		MAM_ITM_GRP_R S0IT3 = MAM_ITM_GRP_R.create("IT3");
		MAM_ITM_GRP_R S0IT4 = MAM_ITM_GRP_R.create("IT4");
		MAM_ITM_GRP_R S0IT5 = MAM_ITM_GRP_R.create("IT5");
		MAM_ITM_GRP_R S0IT6 = MAM_ITM_GRP_R.create("IT6");
		MAM_ITM_GRP_R S0IT7 = MAM_ITM_GRP_R.create("IT7");
		MAM_ITM_GRP_R S0IT8 = MAM_ITM_GRP_R.create("IT8");
		MAM_ITM_GRP_R S0IT9 = MAM_ITM_GRP_R.create("IT9");
		MAM_ITM_GRP_R S0IT10 = MAM_ITM_GRP_R.create("IT10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0080_MST_IO_ACT_Query_S01")
					.mainQuery()
					.select(
						S0T1.slip_no,
						S0T1.slip_seq_no,
						S0T1.ac_ym,
						S0T1.ac_dt,
						trunc(
								S0T1.act_tm,
								MCDateFmt.DD
							).as("act_dt"),
						S0T1.act_tm.as("act_hm"),
						S0T1.loc_cd,
						S0T1.str_ln_cd,
						S0T1.stk_arrv_bp_cd,
						S0T1.gr_wg_cd,
						S0T1.gi_wg_cd,
						S0T1.itm_cd,
						S0T1.itm_sub1,
						S0T1.itm_sub2,
						S0T1.itm_sub3,
						S0T1.itm_nm,
						S0T1.lot_no,
						S0T1.sublot_no,
						S0T1.sno1,
						S0T1.sno2,
						S0T1.sno3,
						S0T1.sno4,
						S0T1.fix_no_typ,
						S0T1.fix_no,
						S0T1.io_act_typ,
						S0T1.io_typ,
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
								.then(S0T1.trd_unit_qty)
							.otherwise(value(0)).as("trd_unit_gr_qty"),
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.then(S0T1.trd_unit_qty)
							.otherwise(value(0)).as("trd_unit_gi_qty"),
						S0T1.trd_unit_cd,
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
								.then(S0T1.pack_unit_qty)
							.otherwise(value(0)).as("pack_unit_gr_qty"),
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.then(S0T1.pack_unit_qty)
							.otherwise(value(0)).as("pack_unit_gi_qty"),
						S0T1.pack_unit_cd,
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
								.then(S0T1.base_unit_qty)
							.otherwise(value(0)).as("base_unit_gr_qty"),
						cases()
							.when(S0T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.then(S0T1.base_unit_qty)
							.otherwise(value(0)).as("base_unit_gi_qty"),
						S0T1.base_unit_cd,
						S0T1.gd_cd,
						S0T1.in_xfr_typ,
						S0T1.quality_typ,
						S0T1.asst_typ,
						S0T1.stk_insp_typ,
						S0T1.stk_id_typ,
						S0T1.stk_bp_cd,
						S0T1.rsn_cd,
						S0T1.ac_slip_typ,
						S0T1.ac_rsn_cd,
						S0T1.ac_itm_grp_cd,
						S0T1.itm_jnl_cd,
						S0T1.act_dpt_cd,
						S0M25.dpt_nm.as("act_dpt_nm"),
						S0T1.purc_dpt_cd,
						S0M26.dpt_nm.as("purc_dpt_nm"),
						S0T1.ap_dpt_cd,
						S0M27.dpt_nm.as("ap_dpt_nm"),
						S0T1.sls_dpt_cd,
						S0M28.dpt_nm.as("sls_dpt_nm"),
						S0T1.ar_dpt_cd,
						S0M29.dpt_nm.as("ar_dpt_nm"),
						S0T1.gr_dpt_cd,
						S0M30.dpt_nm.as("gr_dpt_nm"),
						S0T1.gi_dpt_cd,
						S0M31.dpt_nm.as("gi_dpt_nm"),
						S0T1.bd_dpt_cd,
						S0M32.dpt_nm.as("bd_dpt_nm"),
						S0T1.sub_dpt_cd1,
						S0M33.dpt_nm.as("sub_dpt_nm1"),
						S0T1.sub_dpt_cd2,
						S0M34.dpt_nm.as("sub_dpt_nm2"),
						S0T1.sub_dpt_cd3,
						S0M35.dpt_nm.as("sub_dpt_nm3"),
						S0T1.act_usr_cd,
						S0T1.sls_usr_cd,
						S0T1.mfg_usr_cd,
						S0T1.purc_usr_cd,
						S0T1.slo_no,
						S0T1.po_no,
						S0T1.iv_no,
						S0T1.rcpt_iv_no,
						S0T1.un_fix_flg,
						S0T1.trd_cur_cd,
						S0T1.trd_cur_upri,
						S0T1.trd_cur_amt,
						S0T1.trd_cur_proc_amt,
						S0T1.trd_cur_onr_prov_amt,
						S0T1.trd_cur_tax_amt,
						S0T1.base_cur_cd,
						S0T1.base_cur_upri,
						S0T1.base_cur_amt,
						S0T1.base_cur_proc_amt,
						S0T1.base_cur_onr_prov_amt,
						S0T1.base_cur_tax_amt,
						S0T1.ptax_cur_cd,
						S0T1.ptax_cur_upri,
						S0T1.ptax_cur_amt,
						S0T1.ptax_cur_proc_amt,
						S0T1.ptax_cur_onr_prov_amt,
						S0T1.ptax_cur_tax_amt,
						S0T1.wtax_rate,
						S0T1.wtax_amt,
						S0T1.tax_cd,
						S0T1.foreign_flg,
						S0T1.xrate_cd,
						S0T1.xrate,
						S0T1.ptax_xrate_cd,
						S0T1.ptax_xrate,
						S0T1.dlv_cd,
						S0T1.tdlv_cd,
						S0T1.rcst_cd,
						S0T1.bcst_cd,
						S0T1.acst_cd,
						S0T1.cst_cd,
						S0T1.dest_cd1,
						S0T1.dest_cd2,
						S0T1.dest_cd3,
						S0T1.psppl_cd,
						S0T1.bsppl_cd,
						S0T1.asppl_cd,
						S0T1.sppl_cd,
						S0T1.cred_cd,
						S0T1.spot_flg,
						S0T1.sttl_schd_dt,
						S0T1.sttl_cd,
						S0T1.cst_itm_cd,
						S0T1.cst_itm_nm,
						S0T1.sppl_itm_cd,
						S0T1.sppl_itm_nm,
						S0T1.purc_typ,
						S0T1.area_cd,
						S0T1.cntry_cd,
						S0T1.bd_ctg_cd,
						S0T1.bd_bp_cd,
						S0T1.bd_oper_cd,
						S0T1.bd_loc_cd,
						S0T1.bd_slo_no,
						S0T1.bd_po_no,
						S0T1.bd_iv_no,
						S0T1.bd_wg_cd,
						S0T1.par_itm_cd,
						S0T1.par_itm_sub1,
						S0T1.par_itm_sub2,
						S0T1.par_itm_sub3,
						S0T1.par_itm_nm,
						S0T1.par_lot_no,
						S0T1.par_sublot_no,
						S0T1.par_sno1,
						S0T1.par_sno2,
						S0T1.par_sno3,
						S0T1.par_sno4,
						S0T1.par_ac_itm_grp_cd,
						S0T1.par_itm_jnl_cd,
						S0T1.mfg_inst_unit_typ,
						S0T1.itm_mfg_inst_no,
						S0T1.itm_inst_qty,
						S0T1.mfg_inst_no,
						S0T1.mfg_act_no,
						S0T1.mfg_st_qty,
						S0T1.oper_act_no,
						S0T1.yield_rate,
						S0T1.disp_seq,
						S0T1.oper_cd,
						S0T1.inpt_loc_cd,
						S0T1.inpt_str_ln_cd,
						S0T1.outsrc_mfg_loc_cd,
						S0T1.outsrc_mfg_loc_dpt_cd,
						S0M74.dpt_nm.as("outsrc_mfg_loc_dpt_nm"),
						S0T1.outsrc_mfg_loc_wg_cd,
						S0T1.strg_loc_cd,
						S0T1.strg_str_ln_cd,
						S0T1.stktk_base_dt,
						S0T1.trd_rmrks,
						S0T1.trd_d_rmrks,
						S0T1.slip_rev_no,
						S0T1.act_no,
						S0T1.act_seq,
						S0T1.act_rev_no,
						S0T1.act_d_no,
						S0T1.act_d_seq,
						S0T1.act_io_no,
						S0T1.act_io_seq,
						S0T1.slip_sts_typ,
						S0T1.trd_cd,
						S0T1.trd_ptn_typ,
						S0T1.trn_typ,
						S0T1.par_slip_no,
						S0T1.par_slip_seq_no,
						S0T1.slip_cmpl_flg,
						S0T1.send_flg,
						S0T1.c_imp_flg,
						S0T1.a_imp_flg,
						S0T1.sub_char1,
						S0T1.sub_char2,
						S0T1.sub_char3,
						S0T1.sub_char4,
						S0T1.sub_char5,
						S0T1.sub_char6,
						S0T1.sub_char7,
						S0T1.sub_char8,
						S0T1.sub_char9,
						S0T1.sub_char10,
						S0T1.sub_num1,
						S0T1.sub_num2,
						S0T1.sub_num3,
						S0T1.sub_dt1,
						S0T1.sub_dt2,
						S0T1.sub_dt3,
						S0T1.ins_usr_id,
						S0T1.ins_usr_nm,
						S0T1.ins_func_id,
						S0T1.ins_ts,
						S0T1.upd_usr_id,
						S0T1.upd_usr_nm,
						S0T1.upd_func_id,
						S0T1.upd_ts,
						S0T1.upd_srv_req_no,
						S0T1.repurc_obli_flg,
						S0T1.temp_ap_flg,
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0T1.gr_loc_cd.as("join_gr_loc_cd_")
					)
					.from(
						S0T1
						.leftOuterJoin(S0M25).on(
							S0T1.act_dpt_cd.eq(S0M25.dpt_cd)
							.and(S0T1.ac_dt.between(S0M25.st_dt, S0M25.end_dt))
						)
						.leftOuterJoin(S0M26).on(
							S0T1.purc_dpt_cd.eq(S0M26.dpt_cd)
							.and(S0T1.ac_dt.between(S0M26.st_dt, S0M26.end_dt))
						)
						.leftOuterJoin(S0M27).on(
							S0T1.ap_dpt_cd.eq(S0M27.dpt_cd)
							.and(S0T1.ac_dt.between(S0M27.st_dt, S0M27.end_dt))
						)
						.leftOuterJoin(S0M28).on(
							S0T1.sls_dpt_cd.eq(S0M28.dpt_cd)
							.and(S0T1.ac_dt.between(S0M28.st_dt, S0M28.end_dt))
						)
						.leftOuterJoin(S0M29).on(
							S0T1.ar_dpt_cd.eq(S0M29.dpt_cd)
							.and(S0T1.ac_dt.between(S0M29.st_dt, S0M29.end_dt))
						)
						.leftOuterJoin(S0M30).on(
							S0T1.gr_dpt_cd.eq(S0M30.dpt_cd)
							.and(S0T1.ac_dt.between(S0M30.st_dt, S0M30.end_dt))
						)
						.leftOuterJoin(S0M31).on(
							S0T1.gi_dpt_cd.eq(S0M31.dpt_cd)
							.and(S0T1.ac_dt.between(S0M31.st_dt, S0M31.end_dt))
						)
						.leftOuterJoin(S0M32).on(
							S0T1.bd_dpt_cd.eq(S0M32.dpt_cd)
							.and(S0T1.ac_dt.between(S0M32.st_dt, S0M32.end_dt))
						)
						.leftOuterJoin(S0M33).on(
							S0T1.sub_dpt_cd1.eq(S0M33.dpt_cd)
							.and(S0T1.ac_dt.between(S0M33.st_dt, S0M33.end_dt))
						)
						.leftOuterJoin(S0M34).on(
							S0T1.sub_dpt_cd2.eq(S0M34.dpt_cd)
							.and(S0T1.ac_dt.between(S0M34.st_dt, S0M34.end_dt))
						)
						.leftOuterJoin(S0M35).on(
							S0T1.sub_dpt_cd3.eq(S0M35.dpt_cd)
							.and(S0T1.ac_dt.between(S0M35.st_dt, S0M35.end_dt))
						)
						.leftOuterJoin(S0M74).on(
							S0T1.outsrc_mfg_loc_dpt_cd.eq(S0M74.dpt_cd)
							.and(S0T1.ac_dt.between(S0M74.st_dt, S0M74.end_dt))
						)
						.addDynamicView()
						.addDynamicView(REP1)
						.addDynamicView(REP2)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0T1.act_tm.gte(bind("act_hm_fr")))
						.cutoff$and(S0T1.act_tm.lte(bind("act_hm_to")))
						.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
						.cutoff$and(S0T1.gr_wg_cd.like(bind("gr_wg_cd")))
						.cutoff$and(S0T1.gi_wg_cd.like(bind("gi_wg_cd")))
						.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0T1.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0T1.sno1.like(bind("sno1")))
						.cutoff$and(S0T1.sno2.like(bind("sno2")))
						.cutoff$and(S0T1.sno3.like(bind("sno3")))
						.cutoff$and(S0T1.sno4.like(bind("sno4")))
						.cutoff$and(S0T1.fix_no_typ.like(bind("fix_no_typ")))
						.cutoff$and(S0T1.fix_no.like(bind("fix_no")))
						.cutoff$and(S0T1.trd_unit_cd.like(bind("trd_unit_cd")))
						.cutoff$and(S0T1.pack_unit_cd.like(bind("pack_unit_cd")))
						.cutoff$and(S0T1.base_unit_cd.like(bind("base_unit_cd")))
						.cutoff$and(S0T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0T1.in_xfr_typ.like(bind("in_xfr_typ")))
						.cutoff$and(S0T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0T1.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0M25.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0M26.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0M27.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0M28.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0T1.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0M29.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0T1.gr_dpt_cd.like(bind("gr_dpt_cd")))
						.cutoff$and(S0M30.dpt_nm.like(bind("gr_dpt_nm")))
						.cutoff$and(S0T1.gi_dpt_cd.like(bind("gi_dpt_cd")))
						.cutoff$and(S0M31.dpt_nm.like(bind("gi_dpt_nm")))
						.cutoff$and(S0T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0M32.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0T1.sub_dpt_cd1.like(bind("sub_dpt_cd1")))
						.cutoff$and(S0M33.dpt_nm.like(bind("sub_dpt_nm1")))
						.cutoff$and(S0T1.sub_dpt_cd2.like(bind("sub_dpt_cd2")))
						.cutoff$and(S0M34.dpt_nm.like(bind("sub_dpt_nm2")))
						.cutoff$and(S0T1.sub_dpt_cd3.like(bind("sub_dpt_cd3")))
						.cutoff$and(S0M35.dpt_nm.like(bind("sub_dpt_nm3")))
						.cutoff$and(S0T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0T1.mfg_usr_cd.like(bind("mfg_usr_cd")))
						.cutoff$and(S0T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0T1.po_no.like(bind("po_no")))
						.cutoff$and(S0T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0T1.un_fix_flg.neq(bind("amt_fix_true")))
						.cutoff$and(S0T1.un_fix_flg.eq(bind("un_fix_true")))
						.cutoff$and(S0T1.temp_ap_flg.eq(bind("temp_ap_true")))
						.cutoff$and(S0T1.temp_ap_flg.neq(bind("not_temp_ap_true")))
						.cutoff$and(S0T1.repurc_obli_flg.eq(bind("repurc_obli_true")))
						.cutoff$and(S0T1.repurc_obli_flg.neq(bind("not_repurc_obli_true")))
						.cutoff$and(S0T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0T1.foreign_flg.neq(bind("domestic_true")))
						.cutoff$and(S0T1.foreign_flg.eq(bind("foreign_true")))
						.cutoff$and(S0T1.xrate_cd.like(bind("xrate_cd")))
						.cutoff$and(S0T1.ptax_xrate_cd.like(bind("ptax_xrate_cd")))
						.cutoff$and(S0T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0T1.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(S0T1.rcst_cd.like(bind("rcst_cd")))
						.cutoff$and(S0T1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0T1.acst_cd.like(bind("acst_cd")))
						.cutoff$and(S0T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0T1.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0T1.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0T1.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0T1.psppl_cd.like(bind("psppl_cd")))
						.cutoff$and(S0T1.bsppl_cd.like(bind("bsppl_cd")))
						.cutoff$and(S0T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0T1.cred_cd.like(bind("cred_cd")))
						.cutoff$and(S0T1.spot_flg.eq(bind("spot_true")))
						.cutoff$and(S0T1.spot_flg.neq(bind("not_spot_true")))
						.cutoff$and(S0T1.sttl_schd_dt.gte(bind("sttl_schd_dt_fr")))
						.cutoff$and(S0T1.sttl_schd_dt.lte(bind("sttl_schd_dt_to")))
						.cutoff$and(S0T1.sttl_cd.like(bind("sttl_cd")))
						.cutoff$and(S0T1.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0T1.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0T1.sppl_itm_cd.like(bind("sppl_itm_cd")))
						.cutoff$and(S0T1.sppl_itm_nm.like(bind("sppl_itm_nm")))
						.cutoff$and(S0T1.bd_ctg_cd.like(bind("bd_ctg_cd")))
						.cutoff$and(S0T1.bd_bp_cd.like(bind("bd_bp_cd")))
						.cutoff$and(S0T1.bd_oper_cd.like(bind("bd_oper_cd")))
						.cutoff$and(S0T1.bd_loc_cd.like(bind("bd_loc_cd")))
						.cutoff$and(S0T1.bd_slo_no.like(bind("bd_slo_no")))
						.cutoff$and(S0T1.bd_po_no.like(bind("bd_po_no")))
						.cutoff$and(S0T1.bd_iv_no.like(bind("bd_iv_no")))
						.cutoff$and(S0T1.bd_wg_cd.like(bind("bd_wg_cd")))
						.cutoff$and(S0T1.par_itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0T1.par_itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0T1.par_itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0T1.par_itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(S0T1.par_itm_nm.like(bind("par_itm_nm")))
						.cutoff$and(S0T1.par_lot_no.like(bind("par_lot_no")))
						.cutoff$and(S0T1.par_sublot_no.like(bind("par_sublot_no")))
						.cutoff$and(S0T1.par_sno1.like(bind("par_sno1")))
						.cutoff$and(S0T1.par_sno2.like(bind("par_sno2")))
						.cutoff$and(S0T1.par_sno3.like(bind("par_sno3")))
						.cutoff$and(S0T1.par_sno4.like(bind("par_sno4")))
						.cutoff$and(S0T1.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0T1.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0T1.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0T1.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0T1.disp_seq.eq(bind("disp_seq")))
						.cutoff$and(S0T1.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0T1.io_act_typ.like(bind("io_act_typ")))
						.cutoff$and(S0T1.slip_no.like(bind("slip_no")))
						.cutoff$and(S0T1.slip_seq_no.eq(bind("slip_seq_no")))
						.cutoff$and(S0T1.slip_rev_no.eq(bind("slip_rev_no")))
						.cutoff$and(S0T1.slip_sts_typ.like(bind("slip_sts_typ")))
						.cutoff$and(S0T1.io_typ.like(bind("io_typ")))
						.cutoff$and(S0T1.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0T1.ac_slip_typ.like(bind("ac_slip_typ")))
						.cutoff$and(S0T1.ac_rsn_cd.like(bind("ac_rsn_cd")))
						.cutoff$and(S0T1.act_no.like(bind("act_no")))
						.cutoff$and(S0T1.act_seq.eq(bind("act_seq")))
						.cutoff$and(S0T1.act_rev_no.eq(bind("act_rev_no")))
						.cutoff$and(S0T1.act_d_no.like(bind("act_d_no")))
						.cutoff$and(S0T1.act_d_seq.eq(bind("act_d_seq")))
						.cutoff$and(S0T1.act_io_no.like(bind("act_io_no")))
						.cutoff$and(S0T1.act_io_seq.eq(bind("act_io_seq")))
						.cutoff$and(S0T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0T1.trd_ptn_typ.like(bind("trd_ptn_typ")))
						.cutoff$and(S0T1.trn_typ.like(bind("trn_typ")))
						.cutoff$and(S0T1.par_slip_no.like(bind("par_slip_no")))
						.cutoff$and(S0T1.par_slip_seq_no.eq(bind("par_slip_seq_no")))
						.cutoff$and(S0T1.slip_cmpl_flg.neq(bind("ex_slip_cmpl_true")))
						.cutoff$and(S0T1.send_flg.eq(bind("only_send_true")))
						.cutoff$and(S0T1.c_imp_flg.neq(bind("c_not_imp_true")))
						.cutoff$and(S0T1.c_imp_flg.eq(bind("c_imp_true")))
						.cutoff$and(S0T1.a_imp_flg.neq(bind("a_not_imp_true")))
						.cutoff$and(S0T1.a_imp_flg.eq(bind("a_imp_true")))
						.cutoff$and(S0T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0T1.sub_char4.like(bind("sub_char4")))
						.cutoff$and(S0T1.sub_char5.like(bind("sub_char5")))
						.cutoff$and(S0T1.sub_char6.like(bind("sub_char6")))
						.cutoff$and(S0T1.sub_char7.like(bind("sub_char7")))
						.cutoff$and(S0T1.sub_char8.like(bind("sub_char8")))
						.cutoff$and(S0T1.sub_char9.like(bind("sub_char9")))
						.cutoff$and(S0T1.sub_char10.like(bind("sub_char10")))
						.cutoff$and(S0T1.sub_num1.eq(bind("sub_num1")))
						.cutoff$and(S0T1.sub_num2.eq(bind("sub_num2")))
						.cutoff$and(S0T1.sub_num3.eq(bind("sub_num3")))
						.cutoff$and(S0T1.sub_dt1.gte(bind("sub_dt1_fr")))
						.cutoff$and(S0T1.sub_dt1.lte(bind("sub_dt1_to")))
						.cutoff$and(S0T1.sub_dt2.gte(bind("sub_dt2_fr")))
						.cutoff$and(S0T1.sub_dt2.lte(bind("sub_dt2_to")))
						.cutoff$and(S0T1.sub_dt3.gte(bind("sub_dt3_fr")))
						.cutoff$and(S0T1.sub_dt3.lte(bind("sub_dt3_to")))
						.addDynamicPredicate(REP1)
						.addDynamicPredicate(REP2)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd"))
						.view(v -> v.leftOuterJoin(S0M1).on(S0T1.itm_cd.eq(S0M1.itm_cd).and(S0T1.itm_sub1.eq(S0M1.itm_sub1)).and(S0T1.itm_sub2.eq(S0M1.itm_sub2)).and(S0T1.itm_sub3.eq(S0M1.itm_sub3))))
						.predicate(p -> p.cutoff$and(S0M1.itm_typ.like(bind("itm_typ"))).cutoff$and(S0M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S0M2).on(S0M1.itm_typ.eq(S0M2.itm_typ).and(S0M1.itm_typ_d_cd.eq(S0M2.itm_typ_d_cd))))
						.predicate(p -> p.cutoff$and(S0M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("site_nm", "lg_grp_nm", "alloc_grp_nm", "loc_grp_nm", "loc_nm", "site_cd", "lg_grp_cd", "alloc_grp_cd", "loc_grp_cd"))
						.view(v -> v.leftOuterJoin(S0M3).on(S0T1.loc_cd.eq(S0M3.loc_cd)))
						.predicate(p -> p.cutoff$and(S0M3.loc_nm.like(bind("loc_nm"))).cutoff$and(S0M3.site_cd.like(bind("site_cd"))).cutoff$and(S0M3.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0M3.alloc_grp_cd.like(bind("alloc_grp_cd"))).cutoff$and(S0M3.loc_grp_cd.like(bind("loc_grp_cd")))),
					when(boundOr("site_nm"))
						.view(v -> v.leftOuterJoin(S0M4).on(S0M3.site_cd.eq(S0M4.site_cd)))
						.predicate(p -> p.cutoff$and(S0M4.site_nm.like(bind("site_nm")))),
					when(boundOr("trd_nm"))
						.view(v -> v.leftOuterJoin(S0M5).on(S0T1.trd_cd.eq(S0M5.trd_cd)))
						.predicate(p -> p.cutoff$and(S0M5.trd_nm.like(bind("trd_nm")))),
					when(boundOr("lg_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M6).on(S0M3.lg_grp_cd.eq(S0M6.lg_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M6.lg_grp_nm.like(bind("lg_grp_nm")))),
					when(boundOr("alloc_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M7).on(S0M3.alloc_grp_cd.eq(S0M7.alloc_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M7.alloc_grp_nm.like(bind("alloc_grp_nm")))),
					when(boundOr("loc_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M8).on(S0M3.loc_grp_cd.eq(S0M8.loc_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M8.loc_grp_nm.like(bind("loc_grp_nm")))),
					when(boundOr("str_ln_nm"))
						.view(v -> v.leftOuterJoin(S0M9).on(S0T1.loc_cd.eq(S0M9.loc_cd).and(S0T1.str_ln_cd.eq(S0M9.str_ln_cd))))
						.predicate(p -> p.cutoff$and(S0M9.str_ln_nm.like(bind("str_ln_nm")))),
					when(boundOr("stk_arrv_bp_nm"))
						.view(v -> v.leftOuterJoin(S0M10).on(S0T1.stk_arrv_bp_cd.eq(S0M10.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M10.bp_nm.like(bind("stk_arrv_bp_nm")))),
					when(boundOr("gd_nm"))
						.view(v -> v.leftOuterJoin(S0M11).on(S0T1.gd_cd.eq(S0M11.gd_cd)))
						.predicate(p -> p.cutoff$and(S0M11.gd_nm.like(bind("gd_nm")))),
					when(boundOr("stk_bp_nm"))
						.view(v -> v.leftOuterJoin(S0M12).on(S0T1.stk_bp_cd.eq(S0M12.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M12.bp_nm.like(bind("stk_bp_nm")))),
					when(boundOr("pack_unit_nm"))
						.view(v -> v.leftOuterJoin(S0M13).on(S0T1.pack_unit_cd.eq(S0M13.unit_cd)))
						.predicate(p -> p.cutoff$and(S0M13.unit_nm.like(bind("pack_unit_nm")))),
					when(boundOr("base_unit_nm"))
						.view(v -> v.leftOuterJoin(S0M14).on(S0T1.base_unit_cd.eq(S0M14.unit_cd)))
						.predicate(p -> p.cutoff$and(S0M14.unit_nm.like(bind("base_unit_nm")))),
					when(boundOr("gr_wg_nm"))
						.view(v -> v.leftOuterJoin(S0M17).on(S0T1.gr_wg_cd.eq(S0M17.wg_cd)))
						.predicate(p -> p.cutoff$and(S0M17.wg_nm.like(bind("gr_wg_nm")))),
					when(boundOr("gi_wg_nm"))
						.view(v -> v.leftOuterJoin(S0M18).on(S0T1.gi_wg_cd.eq(S0M18.wg_cd)))
						.predicate(p -> p.cutoff$and(S0M18.wg_nm.like(bind("gi_wg_nm")))),
					when(boundOr("trd_unit_nm"))
						.view(v -> v.leftOuterJoin(S0M19).on(S0T1.trd_unit_cd.eq(S0M19.unit_cd)))
						.predicate(p -> p.cutoff$and(S0M19.unit_nm.like(bind("trd_unit_nm")))),
					when(boundOr("rsn_nm"))
						.view(v -> v.leftOuterJoin(S0M21).on(S0T1.rsn_cd.eq(S0M21.biz_rsn_cd)))
						.predicate(p -> p.cutoff$and(S0M21.biz_rsn_nm.like(bind("rsn_nm")))),
					when(boundOr("ac_rsn_nm"))
						.view(v -> v.leftOuterJoin(S0M22).on(S0T1.ac_rsn_cd.eq(S0M22.ac_rsn_cd)))
						.predicate(p -> p.cutoff$and(S0M22.ac_rsn_nm.like(bind("ac_rsn_nm")))),
					when(boundOr("act_usr_nm"))
						.view(v -> v.leftOuterJoin(S0M36).on(S0T1.act_usr_cd.eq(S0M36.usr_cd)))
						.predicate(p -> p.cutoff$and(S0M36.usr_nm.like(bind("act_usr_nm")))),
					when(boundOr("sls_usr_nm"))
						.view(v -> v.leftOuterJoin(S0M37).on(S0T1.sls_usr_cd.eq(S0M37.usr_cd)))
						.predicate(p -> p.cutoff$and(S0M37.usr_nm.like(bind("sls_usr_nm")))),
					when(boundOr("mfg_usr_nm"))
						.view(v -> v.leftOuterJoin(S0M38).on(S0T1.mfg_usr_cd.eq(S0M38.usr_cd)))
						.predicate(p -> p.cutoff$and(S0M38.usr_nm.like(bind("mfg_usr_nm")))),
					when(boundOr("purc_usr_nm"))
						.view(v -> v.leftOuterJoin(S0M39).on(S0T1.purc_usr_cd.eq(S0M39.usr_cd)))
						.predicate(p -> p.cutoff$and(S0M39.usr_nm.like(bind("purc_usr_nm")))),
					when(boundOr("trd_cur_nm"))
						.view(v -> v.leftOuterJoin(S0M40).on(S0T1.trd_cur_cd.eq(S0M40.cur_cd)))
						.predicate(p -> p.cutoff$and(S0M40.cur_nm.like(bind("trd_cur_nm")))),
					when(boundOr("tax_nm"))
						.view(v -> v.leftOuterJoin(S0M43).on(S0T1.tax_cd.eq(S0M43.tax_cd)))
						.predicate(p -> p.cutoff$and(S0M43.tax_nm.like(bind("tax_nm")))),
					when(boundOr("xrate_nm"))
						.view(v -> v.leftOuterJoin(S0M44).on(S0T1.xrate_cd.eq(S0M44.xrate_cd)))
						.predicate(p -> p.cutoff$and(S0M44.xrate_nm.like(bind("xrate_nm")))),
					when(boundOr("ptax_xrate_nm"))
						.view(v -> v.leftOuterJoin(S0M45).on(S0T1.ptax_xrate_cd.eq(S0M45.xrate_cd)))
						.predicate(p -> p.cutoff$and(S0M45.xrate_nm.like(bind("ptax_xrate_nm")))),
					when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm"))
						.view(v -> v.leftOuterJoin(S0M46).on(S0T1.dlv_cd.eq(S0M46.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M46.bp_nm.like(bind("dlv_nm")))),
					when(boundOr("tdlv_nm"))
						.view(v -> v.leftOuterJoin(S0M47).on(S0T1.tdlv_cd.eq(S0M47.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M47.bp_nm.like(bind("tdlv_nm")))),
					when(boundOr("rcst_nm"))
						.view(v -> v.leftOuterJoin(S0M48).on(S0T1.rcst_cd.eq(S0M48.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M48.bp_nm.like(bind("rcst_nm")))),
					when(boundOr("bcst_nm"))
						.view(v -> v.leftOuterJoin(S0M49).on(S0T1.bcst_cd.eq(S0M49.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M49.bp_nm.like(bind("bcst_nm")))),
					when(boundOr("acst_nm"))
						.view(v -> v.leftOuterJoin(S0M50).on(S0T1.acst_cd.eq(S0M50.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M50.bp_nm.like(bind("acst_nm")))),
					when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
						.view(v -> v.leftOuterJoin(S0M51).on(S0T1.cst_cd.eq(S0M51.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M51.bp_nm.like(bind("cst_nm")))),
					when(boundOr("dest_nm1"))
						.view(v -> v.leftOuterJoin(S0M52).on(S0T1.dest_cd1.eq(S0M52.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M52.bp_nm.like(bind("dest_nm1")))),
					when(boundOr("dest_nm2"))
						.view(v -> v.leftOuterJoin(S0M53).on(S0T1.dest_cd2.eq(S0M53.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M53.bp_nm.like(bind("dest_nm2")))),
					when(boundOr("dest_nm3"))
						.view(v -> v.leftOuterJoin(S0M54).on(S0T1.dest_cd3.eq(S0M54.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M54.bp_nm.like(bind("dest_nm3")))),
					when(boundOr("psppl_nm"))
						.view(v -> v.leftOuterJoin(S0M55).on(S0T1.psppl_cd.eq(S0M55.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M55.bp_nm.like(bind("psppl_nm")))),
					when(boundOr("bsppl_nm"))
						.view(v -> v.leftOuterJoin(S0M56).on(S0T1.bsppl_cd.eq(S0M56.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M56.bp_nm.like(bind("bsppl_nm")))),
					when(boundOr("asppl_nm"))
						.view(v -> v.leftOuterJoin(S0M57).on(S0T1.asppl_cd.eq(S0M57.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M57.bp_nm.like(bind("asppl_nm")))),
					when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
						.view(v -> v.leftOuterJoin(S0M58).on(S0T1.sppl_cd.eq(S0M58.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M58.bp_nm.like(bind("sppl_nm")))),
					when(boundOr("cred_nm"))
						.view(v -> v.leftOuterJoin(S0M59).on(S0T1.cred_cd.eq(S0M59.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M59.bp_nm.like(bind("cred_nm")))),
					when(boundOr("sttl_nm"))
						.view(v -> v.leftOuterJoin(S0M60).on(S0T1.sttl_cd.eq(S0M60.sttl_cd)))
						.predicate(p -> p.cutoff$and(S0M60.sttl_nm.like(bind("sttl_nm")))),
					when(boundOr("bd_ctg_nm"))
						.view(v -> v.leftOuterJoin(S0M63).on(S0T1.bd_ctg_cd.eq(S0M63.ctg_cd)))
						.predicate(p -> p.cutoff$and(S0M63.ctg_nm.like(bind("bd_ctg_nm")))),
					when(boundOr("bd_bp_nm"))
						.view(v -> v.leftOuterJoin(S0M64).on(S0T1.bd_bp_cd.eq(S0M64.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M64.bp_nm.like(bind("bd_bp_nm")))),
					when(boundOr("bd_oper_nm"))
						.view(v -> v.leftOuterJoin(S0M65).on(S0T1.bd_oper_cd.eq(S0M65.oper_cd)))
						.predicate(p -> p.cutoff$and(S0M65.oper_nm.like(bind("bd_oper_nm")))),
					when(boundOr("bd_loc_nm"))
						.view(v -> v.leftOuterJoin(S0M66).on(S0T1.bd_loc_cd.eq(S0M66.loc_cd)))
						.predicate(p -> p.cutoff$and(S0M66.loc_nm.like(bind("bd_loc_nm")))),
					when(boundOr("bd_wg_nm"))
						.view(v -> v.leftOuterJoin(S0M67).on(S0T1.bd_wg_cd.eq(S0M67.wg_cd)))
						.predicate(p -> p.cutoff$and(S0M67.wg_nm.like(bind("bd_wg_nm")))),
					when(boundOr("oper_nm"))
						.view(v -> v.leftOuterJoin(S0M70).on(S0T1.oper_cd.eq(S0M70.oper_cd)))
						.predicate(p -> p.cutoff$and(S0M70.oper_nm.like(bind("oper_nm")))),
					when(boundOr("ver_no"))
						.view(v -> v.leftOuterJoin(S0T3).on(S0T1.itm_cd.eq(S0T3.itm_cd).and(S0T1.itm_sub1.eq(S0T3.itm_sub1)).and(S0T1.itm_sub2.eq(S0T3.itm_sub2)).and(S0T1.itm_sub3.eq(S0T3.itm_sub3)).and(S0T1.lot_no.eq(S0T3.lot_no)).and(S0T1.sublot_no.eq(S0T3.sublot_no))))
						.predicate(p -> p.cutoff$and(S0T3.ver_no.like(bind("ver_no")))),
					when(boundOr("wrk_no", "wrk_nm"))
						.view(v -> v.leftOuterJoin(S0T5).on(S0T1.sno1.eq(S0T5.sno1)))
						.predicate(p -> p.cutoff$and(S0T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0T5.wrk_nm.like(bind("wrk_nm")))),
					when(boundOr("dlv_grp_flg1"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd1.as("dlv_grp_cd1"), S0DL1.bp_grp_nm.as("dlv_grp_nm1"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL1).on(S0M46.bp_grp_cd1.eq(S0DL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0DL1.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0DL1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
					when(boundOr("dlv_grp_flg2"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd2.as("dlv_grp_cd2"), S0DL2.bp_grp_nm.as("dlv_grp_nm2"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL2).on(S0M46.bp_grp_cd2.eq(S0DL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0DL2.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0DL2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
					when(boundOr("dlv_grp_flg3"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd3.as("dlv_grp_cd3"), S0DL3.bp_grp_nm.as("dlv_grp_nm3"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL3).on(S0M46.bp_grp_cd3.eq(S0DL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0DL3.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0DL3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
					when(boundOr("dlv_grp_flg4"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd4.as("dlv_grp_cd4"), S0DL4.bp_grp_nm.as("dlv_grp_nm4"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL4).on(S0M46.bp_grp_cd4.eq(S0DL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0DL4.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0DL4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
					when(boundOr("dlv_grp_flg5"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd5.as("dlv_grp_cd5"), S0DL5.bp_grp_nm.as("dlv_grp_nm5"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL5).on(S0M46.bp_grp_cd5.eq(S0DL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0DL5.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0DL5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
					when(boundOr("dlv_grp_flg6"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd6.as("dlv_grp_cd6"), S0DL6.bp_grp_nm.as("dlv_grp_nm6"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL6).on(S0M46.bp_grp_cd6.eq(S0DL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0DL6.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0DL6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
					when(boundOr("dlv_grp_flg7"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd7.as("dlv_grp_cd7"), S0DL7.bp_grp_nm.as("dlv_grp_nm7"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL7).on(S0M46.bp_grp_cd7.eq(S0DL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0DL7.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0DL7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
					when(boundOr("dlv_grp_flg8"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd8.as("dlv_grp_cd8"), S0DL8.bp_grp_nm.as("dlv_grp_nm8"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL8).on(S0M46.bp_grp_cd8.eq(S0DL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0DL8.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0DL8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
					when(boundOr("dlv_grp_flg9"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd9.as("dlv_grp_cd9"), S0DL9.bp_grp_nm.as("dlv_grp_nm9"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL9).on(S0M46.bp_grp_cd9.eq(S0DL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0DL9.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0DL9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
					when(boundOr("dlv_grp_flg10"))
						.select(DS0C_DLV_GRP, S0M46.bp_grp_cd10.as("dlv_grp_cd10"), S0DL10.bp_grp_nm.as("dlv_grp_nm10"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0DL10).on(S0M46.bp_grp_cd10.eq(S0DL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0DL10.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0M46.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0DL10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
					when(boundOr("cst_grp_flg1"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd1.as("cst_grp_cd1"), S0CS1.bp_grp_nm.as("cst_grp_nm1"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS1).on(S0M51.bp_grp_cd1.eq(S0CS1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0CS1.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0CS1.bp_grp_nm.like(bind("cst_grp_nm1")))),
					when(boundOr("cst_grp_flg2"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd2.as("cst_grp_cd2"), S0CS2.bp_grp_nm.as("cst_grp_nm2"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS2).on(S0M51.bp_grp_cd2.eq(S0CS2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0CS2.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0CS2.bp_grp_nm.like(bind("cst_grp_nm2")))),
					when(boundOr("cst_grp_flg3"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd3.as("cst_grp_cd3"), S0CS3.bp_grp_nm.as("cst_grp_nm3"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS3).on(S0M51.bp_grp_cd3.eq(S0CS3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0CS3.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0CS3.bp_grp_nm.like(bind("cst_grp_nm3")))),
					when(boundOr("cst_grp_flg4"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd4.as("cst_grp_cd4"), S0CS4.bp_grp_nm.as("cst_grp_nm4"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS4).on(S0M51.bp_grp_cd4.eq(S0CS4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0CS4.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0CS4.bp_grp_nm.like(bind("cst_grp_nm4")))),
					when(boundOr("cst_grp_flg5"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd5.as("cst_grp_cd5"), S0CS5.bp_grp_nm.as("cst_grp_nm5"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS5).on(S0M51.bp_grp_cd5.eq(S0CS5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0CS5.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0CS5.bp_grp_nm.like(bind("cst_grp_nm5")))),
					when(boundOr("cst_grp_flg6"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd6.as("cst_grp_cd6"), S0CS6.bp_grp_nm.as("cst_grp_nm6"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS6).on(S0M51.bp_grp_cd6.eq(S0CS6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0CS6.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0CS6.bp_grp_nm.like(bind("cst_grp_nm6")))),
					when(boundOr("cst_grp_flg7"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd7.as("cst_grp_cd7"), S0CS7.bp_grp_nm.as("cst_grp_nm7"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS7).on(S0M51.bp_grp_cd7.eq(S0CS7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0CS7.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0CS7.bp_grp_nm.like(bind("cst_grp_nm7")))),
					when(boundOr("cst_grp_flg8"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd8.as("cst_grp_cd8"), S0CS8.bp_grp_nm.as("cst_grp_nm8"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS8).on(S0M51.bp_grp_cd8.eq(S0CS8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0CS8.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0CS8.bp_grp_nm.like(bind("cst_grp_nm8")))),
					when(boundOr("cst_grp_flg9"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd9.as("cst_grp_cd9"), S0CS9.bp_grp_nm.as("cst_grp_nm9"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS9).on(S0M51.bp_grp_cd9.eq(S0CS9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0CS9.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0CS9.bp_grp_nm.like(bind("cst_grp_nm9")))),
					when(boundOr("cst_grp_flg10"))
						.select(DS0C_CST_GRP, S0M51.bp_grp_cd10.as("cst_grp_cd10"), S0CS10.bp_grp_nm.as("cst_grp_nm10"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0CS10).on(S0M51.bp_grp_cd10.eq(S0CS10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0CS10.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0M51.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0CS10.bp_grp_nm.like(bind("cst_grp_nm10")))),
					when(boundOr("sppl_grp_flg1"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd1.as("sppl_grp_cd1"), S0SP1.bp_grp_nm.as("sppl_grp_nm1"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP1).on(S0M58.bp_grp_cd1.eq(S0SP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0SP1.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0SP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
					when(boundOr("sppl_grp_flg2"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd2.as("sppl_grp_cd2"), S0SP2.bp_grp_nm.as("sppl_grp_nm2"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP2).on(S0M58.bp_grp_cd2.eq(S0SP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0SP2.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0SP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
					when(boundOr("sppl_grp_flg3"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd3.as("sppl_grp_cd3"), S0SP3.bp_grp_nm.as("sppl_grp_nm3"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP3).on(S0M58.bp_grp_cd3.eq(S0SP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0SP3.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0SP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
					when(boundOr("sppl_grp_flg4"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd4.as("sppl_grp_cd4"), S0SP4.bp_grp_nm.as("sppl_grp_nm4"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP4).on(S0M58.bp_grp_cd4.eq(S0SP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0SP4.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0SP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
					when(boundOr("sppl_grp_flg5"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd5.as("sppl_grp_cd5"), S0SP5.bp_grp_nm.as("sppl_grp_nm5"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP5).on(S0M58.bp_grp_cd5.eq(S0SP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0SP5.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0SP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
					when(boundOr("sppl_grp_flg6"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd6.as("sppl_grp_cd6"), S0SP6.bp_grp_nm.as("sppl_grp_nm6"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP6).on(S0M58.bp_grp_cd6.eq(S0SP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0SP6.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0SP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
					when(boundOr("sppl_grp_flg7"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd7.as("sppl_grp_cd7"), S0SP7.bp_grp_nm.as("sppl_grp_nm7"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP7).on(S0M58.bp_grp_cd7.eq(S0SP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0SP7.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0SP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
					when(boundOr("sppl_grp_flg8"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd8.as("sppl_grp_cd8"), S0SP8.bp_grp_nm.as("sppl_grp_nm8"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP8).on(S0M58.bp_grp_cd8.eq(S0SP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0SP8.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0SP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
					when(boundOr("sppl_grp_flg9"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd9.as("sppl_grp_cd9"), S0SP9.bp_grp_nm.as("sppl_grp_nm9"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP9).on(S0M58.bp_grp_cd9.eq(S0SP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0SP9.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0SP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
					when(boundOr("sppl_grp_flg10"))
						.select(DS0C_SPPL_GRP, S0M58.bp_grp_cd10.as("sppl_grp_cd10"), S0SP10.bp_grp_nm.as("sppl_grp_nm10"))
						.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0SP10).on(S0M58.bp_grp_cd10.eq(S0SP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0SP10.bp_grp_typ))))
						.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0M58.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0SP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd1.as("itm_grp_cd1"), S0IT1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT1).on(S0M1.itm_grp_cd1.eq(S0IT1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0IT1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0IT1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd2.as("itm_grp_cd2"), S0IT2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT2).on(S0M1.itm_grp_cd2.eq(S0IT2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0IT2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0IT2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd3.as("itm_grp_cd3"), S0IT3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT3).on(S0M1.itm_grp_cd3.eq(S0IT3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0IT3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0IT3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd4.as("itm_grp_cd4"), S0IT4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT4).on(S0M1.itm_grp_cd4.eq(S0IT4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0IT4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0IT4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd5.as("itm_grp_cd5"), S0IT5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT5).on(S0M1.itm_grp_cd5.eq(S0IT5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0IT5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0IT5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd6.as("itm_grp_cd6"), S0IT6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT6).on(S0M1.itm_grp_cd6.eq(S0IT6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0IT6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0IT6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd7.as("itm_grp_cd7"), S0IT7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT7).on(S0M1.itm_grp_cd7.eq(S0IT7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0IT7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0IT7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd8.as("itm_grp_cd8"), S0IT8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT8).on(S0M1.itm_grp_cd8.eq(S0IT8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0IT8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0IT8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd9.as("itm_grp_cd9"), S0IT9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT9).on(S0M1.itm_grp_cd9.eq(S0IT9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0IT9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0IT9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0M1.itm_grp_cd10.as("itm_grp_cd10"), S0IT10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0IT10).on(S0M1.itm_grp_cd10.eq(S0IT10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0IT10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0IT10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("alloc_grp_cd", m.alloc_grp_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_nm", m.wg_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_AC_RSN_R.class, r -> toCondition(
							r.getStringNE("ac_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.ac_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ac_rsn_nm", m.ac_rsn_nm());
					}),
					j -> j
						.add(MAM_AC_ITM_GRP_R.class, r -> toCondition(
							r.getStringNE("ac_itm_grp_cd")
						))
						.addSelect(m -> toArray(
							m.ac_itm_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ac_itm_grp_nm", m.ac_itm_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("mfg_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_usr_nm", m.usr_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
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
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
					}),
					j -> j
						.add(MAM_XRATE_R.class, r -> toCondition(
							r.getStringNE("xrate_cd")
						))
						.addSelect(m -> toArray(
							m.xrate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xrate_nm", m.xrate_nm());
					}),
					j -> j
						.add(MAM_XRATE_R.class, r -> toCondition(
							r.getStringNE("ptax_xrate_cd")
						))
						.addSelect(m -> toArray(
							m.xrate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_xrate_nm", m.xrate_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("psppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("psppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("cred_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cred_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("sttl_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sttl_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_AREA_R.class, r -> toCondition(
							r.getStringNE("area_cd")
						))
						.addSelect(m -> toArray(
							m.area_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("area_nm", m.area_nm());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("bd_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("bd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_AC_ITM_GRP_R.class, r -> toCondition(
							r.getStringNE("par_ac_itm_grp_cd")
						))
						.addSelect(m -> toArray(
							m.ac_itm_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_ac_itm_grp_nm", m.ac_itm_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("par_itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd"),
							r.getStringNE("inpt_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("outsrc_mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("outsrc_mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("outsrc_mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("outsrc_mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_gr_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
					}),
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
					})
				)
			);
	}
}