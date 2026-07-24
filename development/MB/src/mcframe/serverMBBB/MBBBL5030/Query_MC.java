package mcframe.serverMBBB.MBBBL5030;

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
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_I01 ( MBT_AC_IO )
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_I01() {
		MBW_PRE_JOURNAL_R S0 = MBW_PRE_JOURNAL_R.create();
		MBT_AC_IO_R S1_T = MBT_AC_IO_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		MCDynamicSQLID ADD = createDynamicSQLID("ADD");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_I01")
					.insert(S0)
					.columns(
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.pre_jnl_seq,
						S0.jnl_unit,
						S0.wg_cd,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.ac_slip_typ,
						S0.ac_rsn_cd,
						S0.itm_jnl_cd,
						S0.can_flg,
						S0.purc_dpt_cd,
						S0.ap_dpt_cd,
						S0.sls_dpt_cd,
						S0.ar_dpt_cd,
						S0.gi_dpt_cd,
						S0.gr_dpt_cd,
						S0.bd_dpt_cd,
						S0.rcv_dpt_cd,
						S0.so_dpt_cd,
						S0.sub_dpt_cd1,
						S0.sub_dpt_cd2,
						S0.sub_dpt_cd3,
						S0.usr_cd,
						S0.purc_typ,
						S0.un_fix_flg,
						S0.temp_ap_flg,
						S0.foreign_flg,
						S0.asst_typ,
						S0.ac_itm_grp_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.trd_unit_qty,
						S0.trd_unit_cd,
						S0.base_cur_cd,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.trd_cur_cd,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.tax_cd,
						S0.xrate_cd,
						S0.xrate,
						S0.ptax_xrate_cd,
						S0.ptax_xrate,
						S0.iv_no,
						S0.wrk_no,
						S0.bill_no,
						S0.acst_cd,
						S0.cst_cd,
						S0.asppl_cd,
						S0.sppl_cd,
						S0.inv_com_cd,
						S0.rcst_cd,
						S0.setoff_cd,
						S0.setoff_nm,
						S0.quality_typ,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.cst_itm_cd,
						S0.cst_itm_nm,
						S0.sppl_itm_cd,
						S0.sppl_itm_nm,
						S0.slo_no,
						S0.po_no,
						S0.bank_ac_cd,
						S0.xfr_psn,
						S0.trd_itm_cd,
						S0.trd_itm_sub1,
						S0.trd_itm_sub2,
						S0.trd_itm_sub3,
						S0.trd_itm_nm,
						S0.trd_rmrks,
						S0.trd_d_rmrks,
						S0.jnl_key1,
						S0.jnl_key2,
						S0.jnl_key3,
						S0.jnl_key4,
						S0.jnl_key5,
						S0.jnl_key6,
						S0.jnl_key7,
						S0.jnl_key8,
						S0.jnl_key9,
						S0.jnl_key10,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3,
						S0.tmp_num,
						S0.auto_jnl_key_cd,
						S0.repurc_obli_flg,
						S0.trd_cur_proc_amt,
						S0.trd_cur_onr_prov_amt,
						S0.base_cur_proc_amt,
						S0.base_cur_onr_prov_amt,
						S0.ptax_cur_proc_amt,
						S0.ptax_cur_onr_prov_amt,
						S0.project_cd,
						S0.trd_project_cd,
						S0.summary_cd0,
						S0.trd_summary_cd0,
						S0.summary_cd1,
						S0.trd_summary_cd1,
						S0.summary_cd2,
						S0.trd_summary_cd2,
						S0.summary_cd3,
						S0.trd_summary_cd3,
						S0.summary_cd4,
						S0.trd_summary_cd4,
						S0.summary_cd5,
						S0.trd_summary_cd5
					)
					.query(
						subQuery()
						.select(
							bind("jnl_grp_no"),
							bind("ac_ym"),
							bracket(
								rowNumber()
									.over()
									.orderBy(S1_T.ac_slip_typ.asc())
								).add(bind("rec_cnt")).as("pre_jnl_seq"),
							cases()
								.when(S1_M.summary_typ.eq(bind("sum_non")))
									.then(bind("ac_io").concat(S1_T.data_no))
								.when(S1_M.summary_typ.eq(bind("sum_dd")))
									.then(
										toChar(
											S1_T.ac_dt,
											MCDateTimeFmt.YYYY,
											MCDateTimeFmt.MM,
											MCDateTimeFmt.DD
										)
								)
								.when(S1_M.summary_typ.eq(bind("sum_mm")))
									.then(bind("g_end_dt_str"))
								.otherwise(
									nvl(
										S1_T.trd_grp,
										decode(
											S1_T.slip_no,
											nullValue(),
											bracket(
												bind("ac_io").concat(S1_T.data_no)
											),
											bracket(
												bind("ac_io").concat(S1_T.slip_no)
											)
										)
									)
								).as("jnl_unit"),
							S1_T.wg_cd,
							bind("ac_slip_dt"),
							decode(
								S1_M.summary_typ,
								bind("sum_mm"),
								bind("g_end_dt"),
								S1_T.ac_dt
							),
							cases()
								.when(
									S1_M.summary_typ.in(
										bind("sum_non"),
										bind("sum_slip")
									)
								)
									.then(S1_T.slip_no)
								.otherwise(nullValue()),
							decode(
								S1_M.summary_typ,
								bind("sum_non"),
								S1_T.slip_seq_no,
								nullValue()
							),
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							S1_T.itm_jnl_cd,
							S1_T.can_flg,
							S1_T.purc_dpt_cd,
							S1_T.ap_dpt_cd,
							S1_T.sls_dpt_cd,
							S1_T.ar_dpt_cd,
							S1_T.gi_dpt_cd,
							S1_T.gr_dpt_cd,
							S1_T.bd_dpt_cd,
							nullValue().as("rcv_dpt_cd"),
							nullValue().as("so_dpt_cd"),
							S1_T.sub_dpt_cd1,
							S1_T.sub_dpt_cd2,
							S1_T.sub_dpt_cd3,
							S1_T.usr_cd,
							S1_T.purc_typ,
							S1_T.un_fix_flg,
							S1_T.temp_ap_flg,
							S1_T.foreign_flg,
							S1_T.asst_typ,
							S1_T.ac_itm_grp_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.itm_nm,
							S1_T.base_unit_qty,
							S1_T.base_unit_cd,
							decode(
								S1_M.trd_unit_flg,
								value(true),
								S1_T.trd_unit_qty,
								S1_T.base_unit_qty
							),
							decode(
								S1_M.trd_unit_flg,
								value(true),
								S1_T.trd_unit_cd,
								S1_T.base_unit_cd
							),
							nvl(
								S1_T.base_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.base_cur_amt,
							S1_T.base_cur_tax_amt,
							nvl(
								S1_T.trd_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.trd_cur_amt,
							S1_T.trd_cur_tax_amt,
							S1_T.ptax_cur_cd,
							S1_T.ptax_cur_amt,
							S1_T.ptax_cur_tax_amt,
							S1_T.tax_cd,
							S1_T.xrate_cd,
							S1_T.xrate,
							S1_T.ptax_xrate_cd,
							S1_T.ptax_xrate,
							decode(
								S1_M.iv_no_flg,
								value(true),
								S1_T.iv_no,
								nullValue()
							),
							S1_T.wrk_no,
							nullValue().as("bill_no"),
							S1_T.acst_cd,
							S1_T.cst_cd,
							S1_T.asppl_cd,
							S1_T.sppl_cd,
							nullValue().as("inv_com_cd"),
							nullValue().as("rcst_cd"),
							nullValue().as("setoff_cd"),
							nullValue().as("setoff_nm"),
							S1_T.quality_typ,
							S1_T.spot_flg,
							S1_T.sttl_schd_dt,
							S1_T.sttl_cd,
							S1_T.cst_itm_cd,
							S1_T.cst_itm_nm,
							S1_T.sppl_itm_cd,
							S1_T.sppl_itm_nm,
							decode(
								S1_M.slo_no_flg,
								value(true),
								S1_T.slo_no,
								nullValue()
							),
							decode(
								S1_M.po_no_flg,
								value(true),
								S1_T.po_no,
								nullValue()
							),
							nullValue().as("bank_ac_cd"),
							nullValue().as("xfr_psn"),
							S1_T.trd_itm_cd,
							S1_T.trd_itm_sub1,
							S1_T.trd_itm_sub2,
							S1_T.trd_itm_sub3,
							S1_T.trd_itm_nm,
							S1_T.trd_rmrks,
							S1_T.trd_d_rmrks,
							S1_T.jnl_key1,
							S1_T.jnl_key2,
							S1_T.jnl_key3,
							S1_T.jnl_key4,
							S1_T.jnl_key5,
							S1_T.jnl_key6,
							S1_T.jnl_key7,
							S1_T.jnl_key8,
							S1_T.jnl_key9,
							S1_T.jnl_key10,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3,
							decode(
								bind("tmp_num_flg"),
								value(false),
								value(0),
								abs(S1_T.base_unit_qty)
							),
							S1_M.auto_jnl_key_cd,
							S1_T.repurc_obli_flg,
							nvl(
								S1_T.trd_cur_proc_amt,
								value(0)
							),
							nvl(
								S1_T.trd_cur_onr_prov_amt,
								value(0)
							),
							nvl(
								S1_T.base_cur_proc_amt,
								value(0)
							),
							nvl(
								S1_T.base_cur_onr_prov_amt,
								value(0)
							),
							nvl(
								S1_T.ptax_cur_proc_amt,
								value(0)
							),
							nvl(
								S1_T.ptax_cur_onr_prov_amt,
								value(0)
							),
							addDynamicSelect(ADD)
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				)
				.setDynamicSQLInfo(
					when(r->r.getString("prj_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("project_cd"),
							nullValue().as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("project_cd"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("project_cd"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("project_cd"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.ac_itm_grp_cd).as("project_cd"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.itm_jnl_cd).as("project_cd"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("project_cd"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.acst_cd).as("project_cd"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.acst_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cst_cd).as("project_cd"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cst_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.asppl_cd).as("project_cd"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.asppl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sppl_cd).as("project_cd"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sppl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("project_cd"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("project_cd"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("project_cd"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("project_cd"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("project_cd"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("project_cd"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("project_cd"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("project_cd"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("project_cd"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("project_cd"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno1).as("project_cd"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno2).as("project_cd"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno3).as("project_cd"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno4).as("project_cd"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno4).as("trd_project_cd")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd0"),
							nullValue().as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("summary_cd0"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("summary_cd0"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("summary_cd0"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd0"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.itm_jnl_cd).as("summary_cd0"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("summary_cd0"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.acst_cd).as("summary_cd0"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.acst_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cst_cd).as("summary_cd0"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cst_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.asppl_cd).as("summary_cd0"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.asppl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sppl_cd).as("summary_cd0"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sppl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("summary_cd0"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("summary_cd0"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("summary_cd0"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("summary_cd0"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("summary_cd0"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("summary_cd0"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("summary_cd0"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("summary_cd0"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("summary_cd0"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("summary_cd0"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno1).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno2).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno3).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno4).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno4).as("trd_summary_cd0")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd1"),
							nullValue().as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("summary_cd1"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("summary_cd1"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("summary_cd1"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd1"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.itm_jnl_cd).as("summary_cd1"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("summary_cd1"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.acst_cd).as("summary_cd1"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.acst_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cst_cd).as("summary_cd1"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cst_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.asppl_cd).as("summary_cd1"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.asppl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sppl_cd).as("summary_cd1"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sppl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("summary_cd1"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("summary_cd1"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("summary_cd1"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("summary_cd1"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("summary_cd1"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("summary_cd1"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("summary_cd1"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("summary_cd1"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("summary_cd1"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("summary_cd1"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno1).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno2).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno3).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno4).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno4).as("trd_summary_cd1")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd2"),
							nullValue().as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("summary_cd2"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("summary_cd2"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("summary_cd2"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd2"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.itm_jnl_cd).as("summary_cd2"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("summary_cd2"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.acst_cd).as("summary_cd2"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.acst_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cst_cd).as("summary_cd2"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cst_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.asppl_cd).as("summary_cd2"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.asppl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sppl_cd).as("summary_cd2"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sppl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("summary_cd2"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("summary_cd2"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("summary_cd2"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("summary_cd2"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("summary_cd2"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("summary_cd2"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("summary_cd2"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("summary_cd2"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("summary_cd2"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("summary_cd2"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno1).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno2).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno3).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno4).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno4).as("trd_summary_cd2")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd3"),
							nullValue().as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("summary_cd3"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("summary_cd3"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("summary_cd3"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd3"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.itm_jnl_cd).as("summary_cd3"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("summary_cd3"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.acst_cd).as("summary_cd3"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.acst_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cst_cd).as("summary_cd3"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cst_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.asppl_cd).as("summary_cd3"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.asppl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sppl_cd).as("summary_cd3"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sppl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("summary_cd3"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("summary_cd3"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("summary_cd3"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("summary_cd3"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("summary_cd3"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("summary_cd3"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("summary_cd3"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("summary_cd3"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("summary_cd3"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("summary_cd3"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno1).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno2).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno3).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno4).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno4).as("trd_summary_cd3")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd4"),
							nullValue().as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("summary_cd4"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("summary_cd4"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("summary_cd4"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd4"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.itm_jnl_cd).as("summary_cd4"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("summary_cd4"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.acst_cd).as("summary_cd4"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.acst_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cst_cd).as("summary_cd4"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cst_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.asppl_cd).as("summary_cd4"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.asppl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sppl_cd).as("summary_cd4"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sppl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("summary_cd4"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("summary_cd4"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("summary_cd4"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("summary_cd4"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("summary_cd4"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("summary_cd4"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("summary_cd4"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("summary_cd4"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("summary_cd4"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("summary_cd4"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno1).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno2).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno3).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno4).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno4).as("trd_summary_cd4")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd5"),
							nullValue().as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("summary_cd5"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("summary_cd5"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("summary_cd5"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd5"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.itm_jnl_cd).as("summary_cd5"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("summary_cd5"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.acst_cd).as("summary_cd5"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.acst_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cst_cd).as("summary_cd5"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cst_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.asppl_cd).as("summary_cd5"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.asppl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sppl_cd).as("summary_cd5"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sppl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("summary_cd5"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("summary_cd5"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("summary_cd5"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("summary_cd5"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("summary_cd5"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("summary_cd5"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("summary_cd5"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("summary_cd5"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("summary_cd5"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("summary_cd5"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno1).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno2).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno3).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno4).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno4).as("trd_summary_cd5"))
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_I02 ( MBT_AC_STK )
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_I02() {
		MBW_PRE_JOURNAL_R S0 = MBW_PRE_JOURNAL_R.create();
		MBT_AC_STK_R S1_T = MBT_AC_STK_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		MCDynamicSQLID ADD = createDynamicSQLID("ADD");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_I02")
					.insert(S0)
					.columns(
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.pre_jnl_seq,
						S0.jnl_unit,
						S0.wg_cd,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.ac_slip_typ,
						S0.ac_rsn_cd,
						S0.itm_jnl_cd,
						S0.can_flg,
						S0.purc_dpt_cd,
						S0.ap_dpt_cd,
						S0.sls_dpt_cd,
						S0.ar_dpt_cd,
						S0.gi_dpt_cd,
						S0.gr_dpt_cd,
						S0.bd_dpt_cd,
						S0.rcv_dpt_cd,
						S0.so_dpt_cd,
						S0.sub_dpt_cd1,
						S0.sub_dpt_cd2,
						S0.sub_dpt_cd3,
						S0.usr_cd,
						S0.purc_typ,
						S0.un_fix_flg,
						S0.foreign_flg,
						S0.asst_typ,
						S0.ac_itm_grp_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.trd_unit_qty,
						S0.trd_unit_cd,
						S0.base_cur_cd,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.trd_cur_cd,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.tax_cd,
						S0.xrate_cd,
						S0.xrate,
						S0.ptax_xrate_cd,
						S0.ptax_xrate,
						S0.iv_no,
						S0.wrk_no,
						S0.bill_no,
						S0.acst_cd,
						S0.cst_cd,
						S0.asppl_cd,
						S0.sppl_cd,
						S0.inv_com_cd,
						S0.rcst_cd,
						S0.setoff_cd,
						S0.setoff_nm,
						S0.quality_typ,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.cst_itm_cd,
						S0.cst_itm_nm,
						S0.sppl_itm_cd,
						S0.sppl_itm_nm,
						S0.slo_no,
						S0.po_no,
						S0.bank_ac_cd,
						S0.xfr_psn,
						S0.trd_itm_cd,
						S0.trd_itm_sub1,
						S0.trd_itm_sub2,
						S0.trd_itm_sub3,
						S0.trd_itm_nm,
						S0.trd_rmrks,
						S0.trd_d_rmrks,
						S0.jnl_key1,
						S0.jnl_key2,
						S0.jnl_key3,
						S0.jnl_key4,
						S0.jnl_key5,
						S0.jnl_key6,
						S0.jnl_key7,
						S0.jnl_key8,
						S0.jnl_key9,
						S0.jnl_key10,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3,
						S0.tmp_num,
						S0.auto_jnl_key_cd,
						S0.repurc_obli_flg,
						S0.trd_cur_proc_amt,
						S0.trd_cur_onr_prov_amt,
						S0.base_cur_proc_amt,
						S0.base_cur_onr_prov_amt,
						S0.ptax_cur_proc_amt,
						S0.ptax_cur_onr_prov_amt,
						S0.project_cd,
						S0.trd_project_cd,
						S0.summary_cd0,
						S0.trd_summary_cd0,
						S0.summary_cd1,
						S0.trd_summary_cd1,
						S0.summary_cd2,
						S0.trd_summary_cd2,
						S0.summary_cd3,
						S0.trd_summary_cd3,
						S0.summary_cd4,
						S0.trd_summary_cd4,
						S0.summary_cd5,
						S0.trd_summary_cd5
					)
					.query(
						subQuery()
						.select(
							bind("jnl_grp_no"),
							bind("ac_ym"),
							bracket(
								rowNumber()
									.over()
									.orderBy(S1_T.ac_slip_typ.asc())
								).add(bind("rec_cnt")).as("pre_jnl_seq"),
							cases()
								.when(S1_M.summary_typ.eq(bind("sum_non")))
									.then(bind("ac_stk").concat(S1_T.data_no))
								.when(S1_M.summary_typ.eq(bind("sum_dd")))
									.then(
										toChar(
											S1_T.ac_dt,
											MCDateTimeFmt.YYYY,
											MCDateTimeFmt.MM,
											MCDateTimeFmt.DD
										)
								)
								.when(S1_M.summary_typ.eq(bind("sum_mm")))
									.then(bind("g_end_dt_str"))
								.otherwise(bind("ac_stk").concat(S1_T.data_no)).as("jnl_unit"),
							S1_T.wg_cd,
							bind("ac_slip_dt"),
							decode(
								S1_M.summary_typ,
								bind("sum_mm"),
								bind("g_end_dt"),
								S1_T.ac_dt
							),
							nullValue().as("slip_no"),
							nullValue().as("slip_seq_no"),
							S1_T.ac_slip_typ,
							nullValue().as("ac_rsn_cd"),
							S1_T.itm_jnl_cd,
							value(false).as("can_flg"),
							nullValue().as("purc_dpt_cd"),
							nullValue().as("ap_dpt_cd"),
							nullValue().as("sls_dpt_cd"),
							nullValue().as("ar_dpt_cd"),
							S1_T.dpt_cd.as("gi_dpt_cd"),
							S1_T.dpt_cd.as("gr_dpt_cd"),
							S1_T.dpt_cd.as("bd_dpt_cd"),
							nullValue().as("rcv_dpt_cd"),
							nullValue().as("so_dpt_cd"),
							S1_T.sub_dpt_cd1,
							S1_T.sub_dpt_cd2,
							S1_T.sub_dpt_cd3,
							S1_T.usr_cd,
							nullValue().as("purc_typ"),
							value(false).as("un_fix_flg"),
							decode(
								bind("cntry_cd"),
								S1_T.cntry_cd,
								value(false),
								value(true)
							).as("foreign_flg"),
							S1_T.asst_typ,
							S1_T.ac_itm_grp_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.itm_nm,
							S1_T.base_unit_qty,
							S1_T.base_unit_cd,
							S1_T.base_unit_qty,
							S1_T.base_unit_cd,
							bind("base_cur_cd"),
							value(0).as("base_cur_amt"),
							value(0).as("base_cur_tax_amt"),
							bind("base_cur_cd"),
							value(0).as("trd_cur_amt"),
							value(0).as("trd_cur_tax_amt"),
							nullValue().as("ptax_cur_cd"),
							value(0).as("ptax_cur_amt"),
							value(0).as("ptax_cur_tax_amt"),
							nullValue().as("tax_cd"),
							nullValue().as("xrate_cd"),
							nullValue().as("xrate"),
							nullValue().as("ptax_xrate_cd"),
							nullValue().as("ptax_xrate"),
							nullValue().as("iv_no"),
							nullValue().as("wrk_no"),
							nullValue().as("bill_no"),
							nullValue().as("acst_cd"),
							nullValue().as("cst_cd"),
							nullValue().as("asppl_cd"),
							nullValue().as("sppl_cd"),
							S1_T.inv_com_cd,
							nullValue().as("rcst_cd"),
							nullValue().as("setoff_cd"),
							nullValue().as("setoff_nm"),
							S1_T.quality_typ,
							value(false).as("spot_flg"),
							nullValue().as("sttl_schd_dt"),
							nullValue().as("sttl_cd"),
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							nullValue().as("sppl_itm_cd"),
							nullValue().as("sppl_itm_nm"),
							nullValue().as("slo_no"),
							nullValue().as("po_no"),
							nullValue().as("bank_ac_cd"),
							nullValue().as("xfr_psn"),
							nullValue().as("trd_itm_cd"),
							nullValue().as("trd_itm_sub1"),
							nullValue().as("trd_itm_sub2"),
							nullValue().as("trd_itm_sub3"),
							nullValue().as("trd_itm_nm"),
							nullValue().as("trd_rmrks"),
							nullValue().as("trd_d_rmrks"),
							S1_T.jnl_key1,
							S1_T.jnl_key2,
							S1_T.jnl_key3,
							S1_T.jnl_key4,
							S1_T.jnl_key5,
							S1_T.jnl_key6,
							S1_T.jnl_key7,
							S1_T.jnl_key8,
							S1_T.jnl_key9,
							S1_T.jnl_key10,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3,
							decode(
								bind("tmp_num_flg"),
								value(false),
								value(0),
								abs(S1_T.base_unit_qty)
							),
							S1_M.auto_jnl_key_cd,
							value(false).as("repurc_obli_flg"),
							value(0).as("trd_cur_proc_amt"),
							value(0).as("trd_cur_onr_prov_amt"),
							value(0).as("base_cur_proc_amt"),
							value(0).as("base_cur_onr_prov_amt"),
							value(0).as("ptax_cur_proc_amt"),
							value(0).as("ptax_cur_onr_prov_amt"),
							addDynamicSelect(ADD)
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				)
				.setDynamicSQLInfo(
					when(r->r.getString("prj_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("project_cd"),
							nullValue().as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("project_cd"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("project_cd"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("project_cd"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.ac_itm_grp_cd).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.itm_jnl_cd).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("project_cd"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("project_cd"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("project_cd"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("project_cd"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("project_cd"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("project_cd"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("project_cd"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("project_cd"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("project_cd"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("project_cd"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("project_cd"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno1).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno2).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno3).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno4).as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd0"),
							nullValue().as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("summary_cd0"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("summary_cd0"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("summary_cd0"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.itm_jnl_cd).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("summary_cd0"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("summary_cd0"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("summary_cd0"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("summary_cd0"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("summary_cd0"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("summary_cd0"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("summary_cd0"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("summary_cd0"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("summary_cd0"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("summary_cd0"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("summary_cd0"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno1).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno2).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno3).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno4).as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd1"),
							nullValue().as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("summary_cd1"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("summary_cd1"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("summary_cd1"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.itm_jnl_cd).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("summary_cd1"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("summary_cd1"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("summary_cd1"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("summary_cd1"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("summary_cd1"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("summary_cd1"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("summary_cd1"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("summary_cd1"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("summary_cd1"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("summary_cd1"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("summary_cd1"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno1).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno2).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno3).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno4).as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd2"),
							nullValue().as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("summary_cd2"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("summary_cd2"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("summary_cd2"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.itm_jnl_cd).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("summary_cd2"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("summary_cd2"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("summary_cd2"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("summary_cd2"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("summary_cd2"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("summary_cd2"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("summary_cd2"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("summary_cd2"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("summary_cd2"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("summary_cd2"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("summary_cd2"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno1).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno2).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno3).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno4).as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd3"),
							nullValue().as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("summary_cd3"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("summary_cd3"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("summary_cd3"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.itm_jnl_cd).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("summary_cd3"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("summary_cd3"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("summary_cd3"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("summary_cd3"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("summary_cd3"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("summary_cd3"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("summary_cd3"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("summary_cd3"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("summary_cd3"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("summary_cd3"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("summary_cd3"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno1).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno2).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno3).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno4).as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd4"),
							nullValue().as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("summary_cd4"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("summary_cd4"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("summary_cd4"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.itm_jnl_cd).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("summary_cd4"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("summary_cd4"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("summary_cd4"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("summary_cd4"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("summary_cd4"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("summary_cd4"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("summary_cd4"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("summary_cd4"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("summary_cd4"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("summary_cd4"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("summary_cd4"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno1).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno2).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno3).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno4).as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd5"),
							nullValue().as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("summary_cd5"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("summary_cd5"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("summary_cd5"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.itm_jnl_cd).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("summary_cd5"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("summary_cd5"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("summary_cd5"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("summary_cd5"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("summary_cd5"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("summary_cd5"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("summary_cd5"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("summary_cd5"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("summary_cd5"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("summary_cd5"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("summary_cd5"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno1).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno2).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno3).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno4).as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5"))
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_I03 ( MBT_AC_COST )
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_I03() {
		MBW_PRE_JOURNAL_R S0 = MBW_PRE_JOURNAL_R.create();
		MBT_AC_COST_R S1_T = MBT_AC_COST_R.create("T");
		MAM_COST_SLIP_JNL_R S1_M = MAM_COST_SLIP_JNL_R.create("M");
		MCDynamicSQLID ADD = createDynamicSQLID("ADD");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_I03")
					.insert(S0)
					.columns(
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.pre_jnl_seq,
						S0.jnl_unit,
						S0.wg_cd,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.ac_slip_typ,
						S0.ac_rsn_cd,
						S0.itm_jnl_cd,
						S0.can_flg,
						S0.purc_dpt_cd,
						S0.ap_dpt_cd,
						S0.sls_dpt_cd,
						S0.ar_dpt_cd,
						S0.gi_dpt_cd,
						S0.gr_dpt_cd,
						S0.bd_dpt_cd,
						S0.rcv_dpt_cd,
						S0.so_dpt_cd,
						S0.sub_dpt_cd1,
						S0.sub_dpt_cd2,
						S0.sub_dpt_cd3,
						S0.usr_cd,
						S0.purc_typ,
						S0.un_fix_flg,
						S0.foreign_flg,
						S0.asst_typ,
						S0.ac_itm_grp_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.trd_unit_qty,
						S0.trd_unit_cd,
						S0.base_cur_cd,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.trd_cur_cd,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.tax_cd,
						S0.xrate_cd,
						S0.xrate,
						S0.ptax_xrate_cd,
						S0.ptax_xrate,
						S0.iv_no,
						S0.wrk_no,
						S0.bill_no,
						S0.acst_cd,
						S0.cst_cd,
						S0.asppl_cd,
						S0.sppl_cd,
						S0.inv_com_cd,
						S0.rcst_cd,
						S0.setoff_cd,
						S0.setoff_nm,
						S0.quality_typ,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.cst_itm_cd,
						S0.cst_itm_nm,
						S0.sppl_itm_cd,
						S0.sppl_itm_nm,
						S0.slo_no,
						S0.po_no,
						S0.bank_ac_cd,
						S0.xfr_psn,
						S0.trd_itm_cd,
						S0.trd_itm_sub1,
						S0.trd_itm_sub2,
						S0.trd_itm_sub3,
						S0.trd_itm_nm,
						S0.trd_rmrks,
						S0.trd_d_rmrks,
						S0.jnl_key1,
						S0.jnl_key2,
						S0.jnl_key3,
						S0.jnl_key4,
						S0.jnl_key5,
						S0.jnl_key6,
						S0.jnl_key7,
						S0.jnl_key8,
						S0.jnl_key9,
						S0.jnl_key10,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3,
						S0.tmp_num,
						S0.auto_jnl_key_cd,
						S0.repurc_obli_flg,
						S0.trd_cur_proc_amt,
						S0.trd_cur_onr_prov_amt,
						S0.base_cur_proc_amt,
						S0.base_cur_onr_prov_amt,
						S0.ptax_cur_proc_amt,
						S0.ptax_cur_onr_prov_amt,
						S0.project_cd,
						S0.trd_project_cd,
						S0.summary_cd0,
						S0.trd_summary_cd0,
						S0.summary_cd1,
						S0.trd_summary_cd1,
						S0.summary_cd2,
						S0.trd_summary_cd2,
						S0.summary_cd3,
						S0.trd_summary_cd3,
						S0.summary_cd4,
						S0.trd_summary_cd4,
						S0.summary_cd5,
						S0.trd_summary_cd5
					)
					.query(
						subQuery()
						.select(
							bind("jnl_grp_no"),
							bind("ac_ym"),
							bracket(
								rowNumber()
									.over()
									.orderBy(S1_T.ac_slip_typ.asc())
								).add(bind("rec_cnt")).as("pre_jnl_seq"),
							cases()
								.when(S1_M.summary_typ.eq(bind("sum_non")))
									.then(bind("ac_cost").concat(S1_T.data_no))
								.when(S1_M.summary_typ.eq(bind("sum_dd")))
									.then(
										toChar(
											S1_T.ac_dt,
											MCDateTimeFmt.YYYY,
											MCDateTimeFmt.MM,
											MCDateTimeFmt.DD
										)
								)
								.when(S1_M.summary_typ.eq(bind("sum_mm")))
									.then(bind("g_end_dt_str"))
								.otherwise(
									nvl(
										S1_T.trd_grp,
										bind("ac_cost").concat(S1_T.data_no)
									)
								).as("jnl_unit"),
							S1_T.wg_cd,
							bind("ac_slip_dt"),
							decode(
								S1_M.summary_typ,
								bind("sum_mm"),
								bind("g_end_dt"),
								S1_T.ac_dt
							),
							nullValue().as("slip_no"),
							nullValue().as("slip_seq_no"),
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							S1_T.itm_jnl_cd,
							value(false).as("can_flg"),
							S1_T.purc_dpt_cd,
							S1_T.ap_dpt_cd,
							S1_T.sls_dpt_cd,
							S1_T.ar_dpt_cd,
							S1_T.gi_dpt_cd,
							S1_T.gr_dpt_cd,
							S1_T.bd_dpt_cd,
							nullValue().as("rcv_dpt_cd"),
							nullValue().as("so_dpt_cd"),
							S1_T.sub_dpt_cd1,
							S1_T.sub_dpt_cd2,
							S1_T.sub_dpt_cd3,
							S1_T.usr_cd,
							nullValue().as("purc_typ"),
							value(false).as("un_fix_flg"),
							S1_T.foreign_flg,
							S1_T.asst_typ,
							S1_T.ac_itm_grp_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.itm_nm,
							S1_T.base_unit_qty,
							S1_T.base_unit_cd,
							S1_T.base_unit_qty.as("trd_unit_qty"),
							S1_T.base_unit_cd.as("trd_unit_cd"),
							nvl(
								S1_T.base_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.amt,
							value(0).as("base_cur_tax_amt"),
							bind("base_cur_cd").as("trd_cur_cd"),
							value(0).as("trd_cur_amt"),
							value(0).as("trd_cur_tax_amt"),
							nullValue().as("ptax_cur_cd"),
							value(0).as("ptax_cur_amt"),
							value(0).as("ptax_cur_tax_amt"),
							nullValue().as("tax_cd"),
							nullValue().as("xrate_cd"),
							nullValue().as("xrate"),
							nullValue().as("ptax_xrate_cd"),
							nullValue().as("ptax_xrate"),
							decode(
								S1_M.iv_no_flg,
								value(true),
								S1_T.iv_no,
								nullValue()
							),
							S1_T.wrk_no,
							nullValue().as("bill_no"),
							nullValue().as("acst_cd"),
							S1_T.cst_cd,
							nullValue().as("asppl_cd"),
							S1_T.sppl_cd,
							S1_T.inv_com_cd,
							nullValue().as("rcst_cd"),
							nullValue().as("setoff_cd"),
							nullValue().as("setoff_nm"),
							nullValue().as("quality_typ"),
							value(false).as("spot_flg"),
							nullValue().as("sttl_schd_dt"),
							nullValue().as("sttl_cd"),
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							nullValue().as("sppl_itm_cd"),
							nullValue().as("sppl_itm_nm"),
							decode(
								S1_M.slo_no_flg,
								value(true),
								S1_T.slo_no,
								nullValue()
							),
							decode(
								S1_M.po_no_flg,
								value(true),
								S1_T.po_no,
								nullValue()
							),
							nullValue().as("bank_ac_cd"),
							nullValue().as("xfr_psn"),
							S1_T.trd_itm_cd,
							S1_T.trd_itm_sub1,
							S1_T.trd_itm_sub2,
							S1_T.trd_itm_sub3,
							S1_T.trd_itm_nm,
							nullValue().as("trd_rmrks"),
							nullValue().as("trd_d_rmrks"),
							S1_T.jnl_key1,
							S1_T.jnl_key2,
							S1_T.jnl_key3,
							S1_T.jnl_key4,
							S1_T.jnl_key5,
							S1_T.jnl_key6,
							S1_T.jnl_key7,
							S1_T.jnl_key8,
							S1_T.jnl_key9,
							S1_T.jnl_key10,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3,
							decode(
								bind("tmp_num_flg"),
								value(false),
								value(0),
								abs(S1_T.base_unit_qty)
							),
							S1_M.auto_jnl_key_cd,
							S1_T.repurc_obli_flg,
							value(0).as("trd_cur_proc_amt"),
							value(0).as("trd_cur_onr_prov_amt"),
							value(0).as("base_cur_proc_amt"),
							value(0).as("base_cur_onr_prov_amt"),
							value(0).as("ptax_cur_proc_amt"),
							value(0).as("ptax_cur_onr_prov_amt"),
							addDynamicSelect(ADD)
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_T.calc_grp_cd.eq(S1_M.calc_grp_cd))
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				)
				.setDynamicSQLInfo(
					when(r->r.getString("prj_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("project_cd"),
							nullValue().as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("project_cd"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.loc_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("project_cd"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.area_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("project_cd"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cntry_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.ac_itm_grp_cd).as("project_cd"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.itm_jnl_cd).as("project_cd"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("project_cd"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cst_cd).as("project_cd"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.cst_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sppl_cd).as("project_cd"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sppl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("project_cd"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("project_cd"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("project_cd"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("project_cd"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("project_cd"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("project_cd"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("project_cd"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("project_cd"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("project_cd"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("project_cd"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno1).as("project_cd"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno2).as("project_cd"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno3).as("project_cd"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sno4).as("project_cd"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.trd_sno4).as("trd_project_cd")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd0"),
							nullValue().as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("summary_cd0"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.loc_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("summary_cd0"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.area_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("summary_cd0"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cntry_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd0"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.itm_jnl_cd).as("summary_cd0"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("summary_cd0"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cst_cd).as("summary_cd0"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.cst_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sppl_cd).as("summary_cd0"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sppl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("summary_cd0"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("summary_cd0"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("summary_cd0"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("summary_cd0"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("summary_cd0"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("summary_cd0"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("summary_cd0"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("summary_cd0"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("summary_cd0"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("summary_cd0"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno1).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno2).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno3).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sno4).as("summary_cd0"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.trd_sno4).as("trd_summary_cd0")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd1"),
							nullValue().as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("summary_cd1"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.loc_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("summary_cd1"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.area_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("summary_cd1"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cntry_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd1"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.itm_jnl_cd).as("summary_cd1"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("summary_cd1"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cst_cd).as("summary_cd1"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.cst_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sppl_cd).as("summary_cd1"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sppl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("summary_cd1"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("summary_cd1"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("summary_cd1"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("summary_cd1"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("summary_cd1"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("summary_cd1"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("summary_cd1"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("summary_cd1"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("summary_cd1"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("summary_cd1"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno1).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno2).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno3).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sno4).as("summary_cd1"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.trd_sno4).as("trd_summary_cd1")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd2"),
							nullValue().as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("summary_cd2"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.loc_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("summary_cd2"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.area_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("summary_cd2"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cntry_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd2"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.itm_jnl_cd).as("summary_cd2"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("summary_cd2"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cst_cd).as("summary_cd2"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.cst_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sppl_cd).as("summary_cd2"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sppl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("summary_cd2"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("summary_cd2"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("summary_cd2"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("summary_cd2"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("summary_cd2"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("summary_cd2"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("summary_cd2"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("summary_cd2"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("summary_cd2"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("summary_cd2"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno1).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno2).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno3).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sno4).as("summary_cd2"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.trd_sno4).as("trd_summary_cd2")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd3"),
							nullValue().as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("summary_cd3"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.loc_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("summary_cd3"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.area_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("summary_cd3"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cntry_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd3"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.itm_jnl_cd).as("summary_cd3"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("summary_cd3"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cst_cd).as("summary_cd3"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.cst_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sppl_cd).as("summary_cd3"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sppl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("summary_cd3"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("summary_cd3"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("summary_cd3"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("summary_cd3"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("summary_cd3"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("summary_cd3"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("summary_cd3"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("summary_cd3"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("summary_cd3"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("summary_cd3"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno1).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno2).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno3).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sno4).as("summary_cd3"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.trd_sno4).as("trd_summary_cd3")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd4"),
							nullValue().as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("summary_cd4"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.loc_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("summary_cd4"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.area_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("summary_cd4"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cntry_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd4"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.itm_jnl_cd).as("summary_cd4"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("summary_cd4"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cst_cd).as("summary_cd4"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.cst_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sppl_cd).as("summary_cd4"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sppl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("summary_cd4"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("summary_cd4"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("summary_cd4"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("summary_cd4"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("summary_cd4"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("summary_cd4"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("summary_cd4"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("summary_cd4"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("summary_cd4"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("summary_cd4"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno1).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno2).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno3).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sno4).as("summary_cd4"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.trd_sno4).as("trd_summary_cd4")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd5"),
							nullValue().as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("summary_cd5"),
							decode(nvl(S1_T.loc_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.loc_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("summary_cd5"),
							decode(nvl(S1_T.area_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.area_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("summary_cd5"),
							decode(nvl(S1_T.cntry_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cntry_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							decode(nvl(S1_T.ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.ac_itm_grp_cd).as("summary_cd5"),
							decode(nvl(S1_T.trd_ac_itm_grp_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_ac_itm_grp_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							decode(nvl(S1_T.itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.itm_jnl_cd).as("summary_cd5"),
							decode(nvl(S1_T.trd_itm_jnl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_itm_jnl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("summary_cd5"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cst_cd).as("summary_cd5"),
							decode(nvl(S1_T.cst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.cst_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sppl_cd).as("summary_cd5"),
							decode(nvl(S1_T.sppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sppl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("summary_cd5"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("summary_cd5"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("summary_cd5"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("summary_cd5"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("summary_cd5"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("summary_cd5"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("summary_cd5"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("summary_cd5"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("summary_cd5"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("summary_cd5"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							decode(nvl(S1_T.sno1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno1).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							decode(nvl(S1_T.sno2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno2).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							decode(nvl(S1_T.sno3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno3).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							decode(nvl(S1_T.sno4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sno4).as("summary_cd5"),
							decode(nvl(S1_T.trd_sno4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.trd_sno4).as("trd_summary_cd5"))
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_I04 ( MBT_AC_RCV )
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_I04() {
		MBW_PRE_JOURNAL_R S0 = MBW_PRE_JOURNAL_R.create();
		MBT_AC_RCV_R S1_T = MBT_AC_RCV_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		MCDynamicSQLID ADD = createDynamicSQLID("ADD");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_I04")
					.insert(S0)
					.columns(
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.pre_jnl_seq,
						S0.jnl_unit,
						S0.wg_cd,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.ac_slip_typ,
						S0.ac_rsn_cd,
						S0.itm_jnl_cd,
						S0.can_flg,
						S0.purc_dpt_cd,
						S0.ap_dpt_cd,
						S0.sls_dpt_cd,
						S0.ar_dpt_cd,
						S0.gi_dpt_cd,
						S0.gr_dpt_cd,
						S0.bd_dpt_cd,
						S0.rcv_dpt_cd,
						S0.so_dpt_cd,
						S0.sub_dpt_cd1,
						S0.sub_dpt_cd2,
						S0.sub_dpt_cd3,
						S0.usr_cd,
						S0.purc_typ,
						S0.un_fix_flg,
						S0.foreign_flg,
						S0.asst_typ,
						S0.ac_itm_grp_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.trd_unit_qty,
						S0.trd_unit_cd,
						S0.base_cur_cd,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.trd_cur_cd,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.tax_cd,
						S0.xrate_cd,
						S0.xrate,
						S0.ptax_xrate_cd,
						S0.ptax_xrate,
						S0.iv_no,
						S0.wrk_no,
						S0.bill_no,
						S0.acst_cd,
						S0.cst_cd,
						S0.asppl_cd,
						S0.sppl_cd,
						S0.inv_com_cd,
						S0.rcst_cd,
						S0.setoff_cd,
						S0.setoff_nm,
						S0.quality_typ,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.cst_itm_cd,
						S0.cst_itm_nm,
						S0.sppl_itm_cd,
						S0.sppl_itm_nm,
						S0.slo_no,
						S0.po_no,
						S0.bank_ac_cd,
						S0.xfr_psn,
						S0.trd_itm_cd,
						S0.trd_itm_sub1,
						S0.trd_itm_sub2,
						S0.trd_itm_sub3,
						S0.trd_itm_nm,
						S0.trd_rmrks,
						S0.trd_d_rmrks,
						S0.jnl_key1,
						S0.jnl_key2,
						S0.jnl_key3,
						S0.jnl_key4,
						S0.jnl_key5,
						S0.jnl_key6,
						S0.jnl_key7,
						S0.jnl_key8,
						S0.jnl_key9,
						S0.jnl_key10,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3,
						S0.tmp_num,
						S0.auto_jnl_key_cd,
						S0.repurc_obli_flg,
						S0.trd_cur_proc_amt,
						S0.trd_cur_onr_prov_amt,
						S0.base_cur_proc_amt,
						S0.base_cur_onr_prov_amt,
						S0.ptax_cur_proc_amt,
						S0.ptax_cur_onr_prov_amt,
						S0.project_cd,
						S0.trd_project_cd,
						S0.summary_cd0,
						S0.trd_summary_cd0,
						S0.summary_cd1,
						S0.trd_summary_cd1,
						S0.summary_cd2,
						S0.trd_summary_cd2,
						S0.summary_cd3,
						S0.trd_summary_cd3,
						S0.summary_cd4,
						S0.trd_summary_cd4,
						S0.summary_cd5,
						S0.trd_summary_cd5
					)
					.query(
						subQuery()
						.select(
							bind("jnl_grp_no"),
							bind("ac_ym"),
							bracket(
								rowNumber()
									.over()
									.orderBy(S1_T.ac_slip_typ.asc())
								).add(bind("rec_cnt")).as("pre_jnl_seq"),
							cases()
								.when(S1_M.summary_typ.eq(bind("sum_non")))
									.then(bind("ac_rcv").concat(S1_T.data_no))
								.when(S1_M.summary_typ.eq(bind("sum_dd")))
									.then(
										toChar(
											S1_T.ac_dt,
											MCDateTimeFmt.YYYY,
											MCDateTimeFmt.MM,
											MCDateTimeFmt.DD
										)
								)
								.when(S1_M.summary_typ.eq(bind("sum_mm")))
									.then(bind("g_end_dt_str"))
								.otherwise(
									decode(
										S1_T.rcv_act_no,
										nullValue(),
										bracket(
											bind("ac_rcv").concat(S1_T.data_no)
										),
										bracket(
											bind("ac_rcv").concat(S1_T.rcv_act_no)
										)
									)
								).as("jnl_unit"),
							S1_T.wg_cd,
							bind("ac_slip_dt"),
							decode(
								S1_M.summary_typ,
								bind("sum_mm"),
								bind("g_end_dt"),
								S1_T.ac_dt
							),
							cases()
								.when(
									S1_M.summary_typ.in(
										bind("sum_non"),
										bind("sum_slip")
									)
								)
									.then(S1_T.rcv_act_no)
								.otherwise(nullValue()),
							decode(
								S1_M.summary_typ,
								bind("sum_non"),
								S1_T.rcv_act_seq,
								nullValue()
							),
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							nullValue().as("itm_jnl_cd"),
							S1_T.can_flg,
							nullValue().as("purc_dpt_cd"),
							nullValue().as("ap_dpt_cd"),
							nullValue().as("sls_dpt_cd"),
							S1_T.ar_dpt_cd,
							nullValue().as("gi_dpt_cd"),
							nullValue().as("gr_dpt_cd"),
							nullValue().as("bd_dpt_cd"),
							S1_T.rcv_dpt_cd,
							S1_T.so_dpt_cd,
							S1_T.sub_dpt_cd1,
							S1_T.sub_dpt_cd2,
							S1_T.sub_dpt_cd3,
							S1_T.usr_cd,
							nullValue().as("purc_typ"),
							value(false).as("un_fix_flg"),
							S1_T.foreign_flg,
							nullValue().as("asst_typ"),
							nullValue().as("ac_itm_grp_cd"),
							nullValue().as("itm_cd"),
							nullValue().as("itm_sub1"),
							nullValue().as("itm_sub2"),
							nullValue().as("itm_sub3"),
							nullValue().as("itm_nm"),
							value(0).as("base_unit_qty"),
							nullValue().as("base_unit_cd"),
							value(0).as("trd_unit_qty"),
							nullValue().as("trd_unit_cd"),
							nvl(
								S1_T.base_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.base_cur_amt,
							S1_T.base_cur_tax_amt,
							nvl(
								S1_T.trd_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.trd_cur_amt,
							S1_T.trd_cur_tax_amt,
							nullValue().as("ptax_cur_cd"),
							value(0).as("ptax_cur_amt"),
							value(0).as("ptax_cur_tax_amt"),
							S1_T.tax_cd,
							S1_T.xrate_cd,
							S1_T.xrate,
							nullValue().as("ptax_xrate_cd"),
							nullValue().as("ptax_xrate"),
							decode(
								S1_M.iv_no_flg,
								value(true),
								S1_T.iv_no,
								nullValue()
							),
							S1_T.wrk_no,
							decode(
								S1_M.bill_no_flg,
								value(true),
								S1_T.bill_no,
								nullValue()
							),
							S1_T.acst_cd,
							nullValue().as("cst_cd"),
							nullValue().as("asppl_cd"),
							nullValue().as("sppl_cd"),
							nullValue().as("inv_com_cd"),
							S1_T.rcst_cd,
							S1_T.setoff_cd,
							nullValue().as("setoff_nm"),
							nullValue().as("quality_typ"),
							value(false).as("spot_flg"),
							nullValue().as("sttl_schd_dt"),
							nullValue().as("sttl_cd"),
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							nullValue().as("sppl_itm_cd"),
							nullValue().as("sppl_itm_nm"),
							nullValue().as("slo_no"),
							nullValue().as("po_no"),
							S1_T.bank_ac_cd,
							S1_T.xfr_psn,
							nullValue().as("trd_itm_cd"),
							nullValue().as("trd_itm_sub1"),
							nullValue().as("trd_itm_sub2"),
							nullValue().as("trd_itm_sub3"),
							nullValue().as("trd_itm_nm"),
							S1_T.trd_rmrks,
							S1_T.trd_d_rmrks,
							S1_T.jnl_key1,
							S1_T.jnl_key2,
							S1_T.jnl_key3,
							S1_T.jnl_key4,
							S1_T.jnl_key5,
							S1_T.jnl_key6,
							S1_T.jnl_key7,
							S1_T.jnl_key8,
							S1_T.jnl_key9,
							S1_T.jnl_key10,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3,
							value(0).as("tmp_num"),
							S1_M.auto_jnl_key_cd,
							value(false).as("repurc_obli_flg"),
							value(0).as("trd_cur_proc_amt"),
							value(0).as("trd_cur_onr_prov_amt"),
							value(0).as("base_cur_proc_amt"),
							value(0).as("base_cur_onr_prov_amt"),
							value(0).as("ptax_cur_proc_amt"),
							value(0).as("ptax_cur_onr_prov_amt"),
							addDynamicSelect(ADD)
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				)
				.setDynamicSQLInfo(
					when(r->r.getString("prj_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("project_cd"),
							nullValue().as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("project_cd"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.acst_cd).as("project_cd"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.acst_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("project_cd"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("project_cd"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("project_cd"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("project_cd"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("project_cd"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("project_cd"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("project_cd"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("project_cd"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("project_cd"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("project_cd"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd0"),
							nullValue().as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("summary_cd0"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.acst_cd).as("summary_cd0"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.acst_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("summary_cd0"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("summary_cd0"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("summary_cd0"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("summary_cd0"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("summary_cd0"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("summary_cd0"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("summary_cd0"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("summary_cd0"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("summary_cd0"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("summary_cd0"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd1"),
							nullValue().as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("summary_cd1"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.acst_cd).as("summary_cd1"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.acst_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("summary_cd1"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("summary_cd1"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("summary_cd1"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("summary_cd1"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("summary_cd1"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("summary_cd1"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("summary_cd1"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("summary_cd1"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("summary_cd1"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("summary_cd1"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd2"),
							nullValue().as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("summary_cd2"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.acst_cd).as("summary_cd2"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.acst_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("summary_cd2"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("summary_cd2"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("summary_cd2"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("summary_cd2"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("summary_cd2"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("summary_cd2"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("summary_cd2"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("summary_cd2"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("summary_cd2"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("summary_cd2"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd3"),
							nullValue().as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("summary_cd3"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.acst_cd).as("summary_cd3"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.acst_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("summary_cd3"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("summary_cd3"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("summary_cd3"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("summary_cd3"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("summary_cd3"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("summary_cd3"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("summary_cd3"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("summary_cd3"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("summary_cd3"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("summary_cd3"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd4"),
							nullValue().as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("summary_cd4"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.acst_cd).as("summary_cd4"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.acst_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("summary_cd4"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("summary_cd4"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("summary_cd4"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("summary_cd4"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("summary_cd4"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("summary_cd4"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("summary_cd4"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("summary_cd4"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("summary_cd4"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("summary_cd4"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd5"),
							nullValue().as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("summary_cd5"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.acst_cd).as("summary_cd5"),
							decode(nvl(S1_T.acst_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.acst_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("summary_cd5"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("summary_cd5"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("summary_cd5"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("summary_cd5"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("summary_cd5"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("summary_cd5"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("summary_cd5"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("summary_cd5"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("summary_cd5"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("summary_cd5"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5"))
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_I05 ( MBT_AC_PAY )
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_I05() {
		MBW_PRE_JOURNAL_R S0 = MBW_PRE_JOURNAL_R.create();
		MBT_AC_PAY_R S1_T = MBT_AC_PAY_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		MCDynamicSQLID ADD = createDynamicSQLID("ADD");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_I05")
					.insert(S0)
					.columns(
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.pre_jnl_seq,
						S0.jnl_unit,
						S0.wg_cd,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.ac_slip_typ,
						S0.ac_rsn_cd,
						S0.itm_jnl_cd,
						S0.can_flg,
						S0.purc_dpt_cd,
						S0.ap_dpt_cd,
						S0.sls_dpt_cd,
						S0.ar_dpt_cd,
						S0.gi_dpt_cd,
						S0.gr_dpt_cd,
						S0.bd_dpt_cd,
						S0.rcv_dpt_cd,
						S0.so_dpt_cd,
						S0.sub_dpt_cd1,
						S0.sub_dpt_cd2,
						S0.sub_dpt_cd3,
						S0.usr_cd,
						S0.purc_typ,
						S0.un_fix_flg,
						S0.foreign_flg,
						S0.asst_typ,
						S0.ac_itm_grp_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.trd_unit_qty,
						S0.trd_unit_cd,
						S0.base_cur_cd,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.trd_cur_cd,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.tax_cd,
						S0.xrate_cd,
						S0.xrate,
						S0.ptax_xrate_cd,
						S0.ptax_xrate,
						S0.iv_no,
						S0.wrk_no,
						S0.bill_no,
						S0.acst_cd,
						S0.cst_cd,
						S0.asppl_cd,
						S0.sppl_cd,
						S0.inv_com_cd,
						S0.rcst_cd,
						S0.setoff_cd,
						S0.setoff_nm,
						S0.quality_typ,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.cst_itm_cd,
						S0.cst_itm_nm,
						S0.sppl_itm_cd,
						S0.sppl_itm_nm,
						S0.slo_no,
						S0.po_no,
						S0.bank_ac_cd,
						S0.xfr_psn,
						S0.trd_itm_cd,
						S0.trd_itm_sub1,
						S0.trd_itm_sub2,
						S0.trd_itm_sub3,
						S0.trd_itm_nm,
						S0.trd_rmrks,
						S0.trd_d_rmrks,
						S0.jnl_key1,
						S0.jnl_key2,
						S0.jnl_key3,
						S0.jnl_key4,
						S0.jnl_key5,
						S0.jnl_key6,
						S0.jnl_key7,
						S0.jnl_key8,
						S0.jnl_key9,
						S0.jnl_key10,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3,
						S0.tmp_num,
						S0.auto_jnl_key_cd,
						S0.repurc_obli_flg,
						S0.trd_cur_proc_amt,
						S0.trd_cur_onr_prov_amt,
						S0.base_cur_proc_amt,
						S0.base_cur_onr_prov_amt,
						S0.ptax_cur_proc_amt,
						S0.ptax_cur_onr_prov_amt,
						S0.project_cd,
						S0.trd_project_cd,
						S0.summary_cd0,
						S0.trd_summary_cd0,
						S0.summary_cd1,
						S0.trd_summary_cd1,
						S0.summary_cd2,
						S0.trd_summary_cd2,
						S0.summary_cd3,
						S0.trd_summary_cd3,
						S0.summary_cd4,
						S0.trd_summary_cd4,
						S0.summary_cd5,
						S0.trd_summary_cd5
					)
					.query(
						subQuery()
						.select(
							bind("jnl_grp_no"),
							bind("ac_ym"),
							bracket(
								rowNumber()
									.over()
									.orderBy(S1_T.ac_slip_typ.asc())
								).add(bind("rec_cnt")).as("pre_jnl_seq"),
							cases()
								.when(S1_M.summary_typ.eq(bind("sum_non")))
									.then(bind("ac_pay").concat(S1_T.data_no))
								.when(S1_M.summary_typ.eq(bind("sum_dd")))
									.then(
										toChar(
											S1_T.ac_dt,
											MCDateTimeFmt.YYYY,
											MCDateTimeFmt.MM,
											MCDateTimeFmt.DD
										)
								)
								.when(S1_M.summary_typ.eq(bind("sum_mm")))
									.then(bind("g_end_dt_str"))
								.otherwise(
									decode(
										S1_T.pay_act_no,
										nullValue(),
										bracket(
											bind("ac_pay").concat(S1_T.data_no)
										),
										bracket(
											bind("ac_pay").concat(S1_T.pay_act_no)
										)
									)
								).as("jnl_unit"),
							S1_T.wg_cd,
							bind("ac_slip_dt"),
							decode(
								S1_M.summary_typ,
								bind("sum_mm"),
								bind("g_end_dt"),
								S1_T.ac_dt
							),
							cases()
								.when(
									S1_M.summary_typ.in(
										bind("sum_non"),
										bind("sum_slip")
									)
								)
									.then(S1_T.pay_act_no)
								.otherwise(nullValue()),
							decode(
								S1_M.summary_typ,
								bind("sum_non"),
								S1_T.pay_act_seq,
								nullValue()
							),
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							nullValue().as("itm_jnl_cd"),
							S1_T.can_flg,
							nullValue().as("purc_dpt_cd"),
							S1_T.ap_dpt_cd,
							nullValue().as("sls_dpt_cd"),
							nullValue().as("ar_dpt_cd"),
							nullValue().as("gi_dpt_cd"),
							nullValue().as("gr_dpt_cd"),
							nullValue().as("bd_dpt_cd"),
							S1_T.pay_dpt_cd,
							S1_T.so_dpt_cd,
							S1_T.sub_dpt_cd1,
							S1_T.sub_dpt_cd2,
							S1_T.sub_dpt_cd3,
							S1_T.usr_cd,
							nullValue().as("purc_typ"),
							value(false).as("un_fix_flg"),
							S1_T.foreign_flg,
							nullValue().as("asst_typ"),
							nullValue().as("ac_itm_grp_cd"),
							nullValue().as("itm_cd"),
							nullValue().as("itm_sub1"),
							nullValue().as("itm_sub2"),
							nullValue().as("itm_sub3"),
							nullValue().as("itm_nm"),
							value(0).as("base_unit_qty"),
							nullValue().as("base_unit_cd"),
							value(0).as("trd_unit_qty"),
							nullValue().as("trd_unit_cd"),
							nvl(
								S1_T.base_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.base_cur_amt,
							S1_T.base_cur_tax_amt,
							nvl(
								S1_T.trd_cur_cd,
								bind("base_cur_cd")
							),
							S1_T.trd_cur_amt,
							S1_T.trd_cur_tax_amt,
							nullValue().as("ptax_cur_cd"),
							value(0).as("ptax_cur_amt"),
							value(0).as("ptax_cur_tax_amt"),
							S1_T.tax_cd,
							S1_T.xrate_cd,
							S1_T.xrate,
							nullValue().as("ptax_xrate_cd"),
							nullValue().as("ptax_xrate"),
							decode(
								S1_M.iv_no_flg,
								value(true),
								S1_T.iv_no,
								nullValue()
							),
							S1_T.wrk_no,
							decode(
								S1_M.bill_no_flg,
								value(true),
								S1_T.rcv_bill_no,
								nullValue()
							),
							nullValue().as("acst_cd"),
							nullValue().as("cst_cd"),
							S1_T.asppl_cd,
							nullValue().as("sppl_cd"),
							nullValue().as("inv_com_cd"),
							S1_T.psppl_cd,
							S1_T.setoff_cd,
							S1_T.setoff_nm,
							nullValue().as("quality_typ"),
							value(false).as("spot_flg"),
							nullValue().as("ttl_schd_dt"),
							nullValue().as("sttl_cd"),
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							nullValue().as("sppl_itm_cd"),
							nullValue().as("sppl_itm_nm"),
							nullValue().as("slo_no"),
							nullValue().as("po_no"),
							S1_T.bank_ac_cd,
							nullValue().as("xfr_psn"),
							nullValue().as("trd_itm_cd"),
							nullValue().as("trd_itm_sub1"),
							nullValue().as("trd_itm_sub2"),
							nullValue().as("trd_itm_sub3"),
							nullValue().as("trd_itm_nm"),
							S1_T.trd_rmrks,
							S1_T.trd_d_rmrks,
							S1_T.jnl_key1,
							S1_T.jnl_key2,
							S1_T.jnl_key3,
							S1_T.jnl_key4,
							S1_T.jnl_key5,
							S1_T.jnl_key6,
							S1_T.jnl_key7,
							S1_T.jnl_key8,
							S1_T.jnl_key9,
							S1_T.jnl_key10,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3,
							value(0).as("tmp_num"),
							S1_M.auto_jnl_key_cd,
							value(false).as("repurc_obli_flg"),
							value(0).as("trd_cur_proc_amt"),
							value(0).as("trd_cur_onr_prov_amt"),
							value(0).as("base_cur_proc_amt"),
							value(0).as("base_cur_onr_prov_amt"),
							value(0).as("ptax_cur_proc_amt"),
							value(0).as("ptax_cur_onr_prov_amt"),
							addDynamicSelect(ADD)
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				)
				.setDynamicSQLInfo(
					when(r->r.getString("prj_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("project_cd"),
							nullValue().as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("project_cd"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.usr_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.asppl_cd).as("project_cd"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.asppl_cd).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("project_cd"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char1).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("project_cd"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char2).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("project_cd"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char3).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("project_cd"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char4).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("project_cd"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char5).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("project_cd"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char6).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("project_cd"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char7).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("project_cd"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char8).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("project_cd"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char9).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("project_cd"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("prj_default_cd"), S1_T.sub_char10).as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("prj_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("prj_default_cd").as("project_cd"),
							bind("prj_default_cd").as("trd_project_cd")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd0"),
							nullValue().as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("summary_cd0"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.usr_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.asppl_cd).as("summary_cd0"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.asppl_cd).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("summary_cd0"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char1).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("summary_cd0"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char2).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("summary_cd0"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char3).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("summary_cd0"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char4).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("summary_cd0"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char5).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("summary_cd0"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char6).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("summary_cd0"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char7).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("summary_cd0"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char8).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("summary_cd0"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char9).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("summary_cd0"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum0_default_cd"), S1_T.sub_char10).as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum0_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum0_default_cd").as("summary_cd0"),
							bind("sum0_default_cd").as("trd_summary_cd0")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd1"),
							nullValue().as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("summary_cd1"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.usr_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.asppl_cd).as("summary_cd1"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.asppl_cd).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("summary_cd1"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char1).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("summary_cd1"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char2).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("summary_cd1"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char3).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("summary_cd1"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char4).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("summary_cd1"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char5).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("summary_cd1"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char6).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("summary_cd1"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char7).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("summary_cd1"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char8).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("summary_cd1"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char9).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("summary_cd1"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum1_default_cd"), S1_T.sub_char10).as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum1_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum1_default_cd").as("summary_cd1"),
							bind("sum1_default_cd").as("trd_summary_cd1")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd2"),
							nullValue().as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("summary_cd2"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.usr_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.asppl_cd).as("summary_cd2"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.asppl_cd).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("summary_cd2"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char1).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("summary_cd2"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char2).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("summary_cd2"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char3).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("summary_cd2"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char4).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("summary_cd2"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char5).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("summary_cd2"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char6).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("summary_cd2"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char7).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("summary_cd2"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char8).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("summary_cd2"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char9).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("summary_cd2"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum2_default_cd"), S1_T.sub_char10).as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum2_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum2_default_cd").as("summary_cd2"),
							bind("sum2_default_cd").as("trd_summary_cd2")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd3"),
							nullValue().as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("summary_cd3"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.usr_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.asppl_cd).as("summary_cd3"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.asppl_cd).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("summary_cd3"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char1).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("summary_cd3"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char2).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("summary_cd3"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char3).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("summary_cd3"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char4).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("summary_cd3"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char5).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("summary_cd3"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char6).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("summary_cd3"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char7).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("summary_cd3"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char8).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("summary_cd3"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char9).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("summary_cd3"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum3_default_cd"), S1_T.sub_char10).as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum3_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum3_default_cd").as("summary_cd3"),
							bind("sum3_default_cd").as("trd_summary_cd3")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd4"),
							nullValue().as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("summary_cd4"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.usr_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.asppl_cd).as("summary_cd4"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.asppl_cd).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("summary_cd4"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char1).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("summary_cd4"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char2).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("summary_cd4"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char3).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("summary_cd4"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char4).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("summary_cd4"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char5).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("summary_cd4"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char6).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("summary_cd4"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char7).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("summary_cd4"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char8).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("summary_cd4"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char9).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("summary_cd4"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum4_default_cd"), S1_T.sub_char10).as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum4_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum4_default_cd").as("summary_cd4"),
							bind("sum4_default_cd").as("trd_summary_cd4")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_STR.NULL_VAL.value()))
						.select(ADD,
							nullValue().as("summary_cd5"),
							nullValue().as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.LOC.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AREA.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CNTRY.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CATEG.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.JNL.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.USR.value()))
						.select(ADD,
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("summary_cd5"),
							decode(nvl(S1_T.usr_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.usr_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AR.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.CST.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.AP.value()))
						.select(ADD,
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.asppl_cd).as("summary_cd5"),
							decode(nvl(S1_T.asppl_cd, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.asppl_cd).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SPL.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB1.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("summary_cd5"),
							decode(nvl(S1_T.sub_char1, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char1).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB2.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("summary_cd5"),
							decode(nvl(S1_T.sub_char2, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char2).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB3.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("summary_cd5"),
							decode(nvl(S1_T.sub_char3, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char3).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB4.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("summary_cd5"),
							decode(nvl(S1_T.sub_char4, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char4).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB5.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("summary_cd5"),
							decode(nvl(S1_T.sub_char5, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char5).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB6.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("summary_cd5"),
							decode(nvl(S1_T.sub_char6, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char6).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB7.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("summary_cd5"),
							decode(nvl(S1_T.sub_char7, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char7).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB8.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("summary_cd5"),
							decode(nvl(S1_T.sub_char8, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char8).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB9.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("summary_cd5"),
							decode(nvl(S1_T.sub_char9, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char9).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SUB10.value()))
						.select(ADD,
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("summary_cd5"),
							decode(nvl(S1_T.sub_char10, bind("null_val")), bind("null_val"), bind("sum5_default_cd"), S1_T.sub_char10).as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO1.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO2.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO3.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5")),
					when(r->r.getString("sum5_set_col_typ").equals(MAC_SET_COL_TYP.SNO4.value()))
						.select(ADD,
							bind("sum5_default_cd").as("summary_cd5"),
							bind("sum5_default_cd").as("trd_summary_cd5"))
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORYD_Query_I01 ( MBT_AC_IO )
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORYD_I01() {
		MBT_JNL_HISTORYD_R S0 = MBT_JNL_HISTORYD_R.create();
		MBT_AC_IO_R S1_T = MBT_AC_IO_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORYD_Query_I01")
					.insert(S0)
					.columns(
						S0.data_no,
						S0.jnl_grp_no,
						S0.table_typ
					)
					.query(
						subQuery()
						.select(
							S1_T.data_no,
							bind("jnl_grp_no"),
							bind("ac_io")
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORYD_Query_I02 ( MBT_AC_STK )
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORYD_I02() {
		MBT_JNL_HISTORYD_R S0 = MBT_JNL_HISTORYD_R.create();
		MBT_AC_STK_R S1_T = MBT_AC_STK_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORYD_Query_I02")
					.insert(S0)
					.columns(
						S0.data_no,
						S0.jnl_grp_no,
						S0.table_typ
					)
					.query(
						subQuery()
						.select(
							S1_T.data_no,
							bind("jnl_grp_no"),
							bind("ac_stk")
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORYD_Query_I03 ( MBT_AC_COST )
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORYD_I03() {
		MBT_JNL_HISTORYD_R S0 = MBT_JNL_HISTORYD_R.create();
		MBT_AC_COST_R S1_T = MBT_AC_COST_R.create("T");
		MAM_COST_SLIP_JNL_R S1_M = MAM_COST_SLIP_JNL_R.create("M");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORYD_Query_I03")
					.insert(S0)
					.columns(
						S0.data_no,
						S0.jnl_grp_no,
						S0.table_typ
					)
					.query(
						subQuery()
						.select(
							S1_T.data_no,
							bind("jnl_grp_no"),
							bind("ac_cost")
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_T.calc_grp_cd.eq(S1_M.calc_grp_cd))
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORYD_Query_I04 ( MBT_AC_RCV )
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORYD_I04() {
		MBT_JNL_HISTORYD_R S0 = MBT_JNL_HISTORYD_R.create();
		MBT_AC_RCV_R S1_T = MBT_AC_RCV_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORYD_Query_I04")
					.insert(S0)
					.columns(
						S0.data_no,
						S0.jnl_grp_no,
						S0.table_typ
					)
					.query(
						subQuery()
						.select(
							S1_T.data_no,
							bind("jnl_grp_no"),
							bind("ac_rcv")
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORYD_Query_I05 ( MBT_AC_PAY )
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORYD_I05() {
		MBT_JNL_HISTORYD_R S0 = MBT_JNL_HISTORYD_R.create();
		MBT_AC_PAY_R S1_T = MBT_AC_PAY_R.create("T");
		MAM_SLIP_JNL_R S1_M = MAM_SLIP_JNL_R.create("M");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORYD_Query_I05")
					.insert(S0)
					.columns(
						S0.data_no,
						S0.jnl_grp_no,
						S0.table_typ
					)
					.query(
						subQuery()
						.select(
							S1_T.data_no,
							bind("jnl_grp_no"),
							bind("ac_pay")
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								S1_T.ac_slip_typ.eq(S1_M.ac_slip_typ)
								.and(S1_M.jnl_act_cd.eq(bind("jnl_act_cd")))
								.and(S1_M.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ac_ym")))
							.and(S1_T.ac_dt.between(bind("st_dt"), bind("end_dt")))
							.and(
								S1_T.wg_cd.eq(bind("wg_cd"))
								.or(bind("wg_cd").isNull())
							)
							.and(
								bind("rerun_flg").eq(value(true))
								.or(S1_T.jnl_fin_cnt.eq(value(0)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_S01
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_S01() {
		MCTempView S0_V = createTempView("V");
		MBW_PRE_JOURNAL_R S0_T = MBW_PRE_JOURNAL_R.create("T");
		MAM_AUTO_JNL_R S1_M1 = MAM_AUTO_JNL_R.create("M1");
		MAM_JNL_PTN_R S1_M2 = MAM_JNL_PTN_R.create("M2");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_S01")
					.mainQuery()
					.select(S0_V.prAll())
					.from(
						subQuery()
						.select(
							max(S0_T.pre_jnl_seq).as("pre_jnl_seq"),
							S0_T.jnl_unit,
							S0_T.wg_cd,
							S0_T.ac_slip_dt,
							max(S0_T.ac_dt).as("ac_dt"),
							S0_T.slip_no,
							S0_T.slip_seq_no,
							S0_T.ac_slip_typ,
							S0_T.ac_rsn_cd,
							S0_T.itm_jnl_cd,
							min(S0_T.can_flg).as("can_flg"),
							S0_T.purc_dpt_cd,
							S0_T.ap_dpt_cd,
							S0_T.sls_dpt_cd,
							S0_T.ar_dpt_cd,
							S0_T.gi_dpt_cd,
							S0_T.gr_dpt_cd,
							S0_T.bd_dpt_cd,
							S0_T.rcv_dpt_cd,
							S0_T.so_dpt_cd,
							S0_T.sub_dpt_cd1,
							S0_T.sub_dpt_cd2,
							S0_T.sub_dpt_cd3,
							S0_T.usr_cd,
							S0_T.purc_typ,
							S0_T.un_fix_flg,
							S0_T.temp_ap_flg,
							S0_T.foreign_flg,
							S0_T.asst_typ,
							S0_T.ac_itm_grp_cd,
							S0_T.itm_cd,
							S0_T.itm_sub1,
							S0_T.itm_sub2,
							S0_T.itm_sub3,
							S0_T.itm_nm,
							sum(S0_T.base_unit_qty).as("base_unit_qty"),
							S0_T.base_unit_cd,
							sum(S0_T.trd_unit_qty).as("trd_unit_qty"),
							S0_T.trd_unit_cd,
							S0_T.base_cur_cd,
							sum(S0_T.base_cur_amt).as("base_cur_amt"),
							sum(S0_T.base_cur_tax_amt).as("base_cur_tax_amt"),
							S0_T.trd_cur_cd,
							sum(S0_T.trd_cur_amt).as("trd_cur_amt"),
							sum(S0_T.trd_cur_tax_amt).as("trd_cur_tax_amt"),
							S0_T.ptax_cur_cd,
							sum(S0_T.ptax_cur_amt).as("ptax_cur_amt"),
							sum(S0_T.ptax_cur_tax_amt).as("ptax_cur_tax_amt"),
							S0_T.tax_cd,
							S0_T.xrate_cd,
							S0_T.xrate,
							S0_T.ptax_xrate_cd,
							S0_T.ptax_xrate,
							S0_T.iv_no,
							S0_T.wrk_no,
							S0_T.bill_no,
							S0_T.acst_cd,
							S0_T.cst_cd,
							S0_T.asppl_cd,
							S0_T.sppl_cd,
							S0_T.rcst_cd,
							S0_T.setoff_cd,
							S0_T.setoff_nm,
							S0_T.quality_typ,
							decode(
								S0_T.repurc_obli_flg,
								value(true),
								value(MAC_INV_LOC_TYP.REPURC_OBLI.value()),
								decode(
									S0_T.inv_com_cd,
									nullValue(),
									value(MAC_INV_LOC_TYP.COM.value()),
									value(MAC_INV_LOC_TYP.OTH.value())
								)
							).as("inv_loc_typ"),
							S0_T.spot_flg,
							S0_T.sttl_schd_dt,
							S0_T.sttl_cd,
							S0_T.cst_itm_cd,
							S0_T.cst_itm_nm,
							S0_T.sppl_itm_cd,
							S0_T.sppl_itm_nm,
							S0_T.slo_no,
							S0_T.po_no,
							S0_T.bank_ac_cd,
							S0_T.xfr_psn,
							S0_T.project_cd,
							S0_T.summary_cd0,
							S0_T.summary_cd1,
							S0_T.summary_cd2,
							S0_T.summary_cd3,
							S0_T.summary_cd4,
							S0_T.summary_cd5,
							S0_T.trd_itm_cd,
							S0_T.trd_itm_sub1,
							S0_T.trd_itm_sub2,
							S0_T.trd_itm_sub3,
							S0_T.trd_itm_nm,
							S0_T.trd_project_cd,
							S0_T.trd_summary_cd0,
							S0_T.trd_summary_cd1,
							S0_T.trd_summary_cd2,
							S0_T.trd_summary_cd3,
							S0_T.trd_summary_cd4,
							S0_T.trd_summary_cd5,
							S0_T.trd_rmrks,
							S0_T.trd_d_rmrks,
							S0_T.jnl_key1,
							S0_T.jnl_key2,
							S0_T.jnl_key3,
							S0_T.jnl_key4,
							S0_T.jnl_key5,
							S0_T.jnl_key6,
							S0_T.jnl_key7,
							S0_T.jnl_key8,
							S0_T.jnl_key9,
							S0_T.jnl_key10,
							S0_T.sub_char1,
							S0_T.sub_char2,
							S0_T.sub_char3,
							S0_T.sub_char4,
							S0_T.sub_char5,
							S0_T.sub_char6,
							S0_T.sub_char7,
							S0_T.sub_char8,
							S0_T.sub_char9,
							S0_T.sub_char10,
							S0_T.sub_num1,
							S0_T.sub_num2,
							S0_T.sub_num3,
							S0_T.sub_dt1,
							S0_T.sub_dt2,
							S0_T.sub_dt3,
							S0_T.auto_jnl_key_cd,
							S0_T.repurc_obli_flg,
							sum(S0_T.trd_cur_proc_amt).as("trd_cur_proc_amt"),
							sum(S0_T.trd_cur_onr_prov_amt).as("trd_cur_onr_prov_amt"),
							sum(S0_T.base_cur_proc_amt).as("base_cur_proc_amt"),
							sum(S0_T.base_cur_onr_prov_amt).as("base_cur_onr_prov_amt"),
							sum(S0_T.ptax_cur_proc_amt).as("ptax_cur_proc_amt"),
							sum(S0_T.ptax_cur_onr_prov_amt).as("ptax_cur_onr_prov_amt")
						)
						.from(S0_T)
						.where(
							value(0).eq(value(0))
							.and(S0_T.jnl_grp_no.eq(bind("jnl_grp_no")))
						)
						.groupBy(
							S0_T.jnl_unit,
							S0_T.wg_cd,
							S0_T.ac_slip_dt,
							S0_T.slip_no,
							S0_T.slip_seq_no,
							S0_T.ac_slip_typ,
							S0_T.ac_rsn_cd,
							S0_T.itm_jnl_cd,
							S0_T.purc_dpt_cd,
							S0_T.ap_dpt_cd,
							S0_T.sls_dpt_cd,
							S0_T.ar_dpt_cd,
							S0_T.gi_dpt_cd,
							S0_T.gr_dpt_cd,
							S0_T.bd_dpt_cd,
							S0_T.rcv_dpt_cd,
							S0_T.so_dpt_cd,
							S0_T.sub_dpt_cd1,
							S0_T.sub_dpt_cd2,
							S0_T.sub_dpt_cd3,
							S0_T.usr_cd,
							S0_T.purc_typ,
							S0_T.un_fix_flg,
							S0_T.temp_ap_flg,
							S0_T.foreign_flg,
							S0_T.asst_typ,
							S0_T.ac_itm_grp_cd,
							S0_T.itm_cd,
							S0_T.itm_sub1,
							S0_T.itm_sub2,
							S0_T.itm_sub3,
							S0_T.itm_nm,
							S0_T.base_unit_cd,
							S0_T.trd_unit_cd,
							S0_T.base_cur_cd,
							S0_T.trd_cur_cd,
							S0_T.ptax_cur_cd,
							S0_T.tax_cd,
							S0_T.xrate_cd,
							S0_T.xrate,
							S0_T.ptax_xrate_cd,
							S0_T.ptax_xrate,
							S0_T.wrk_no,
							S0_T.iv_no,
							S0_T.bill_no,
							S0_T.acst_cd,
							S0_T.cst_cd,
							S0_T.asppl_cd,
							S0_T.sppl_cd,
							S0_T.inv_com_cd,
							S0_T.rcst_cd,
							S0_T.setoff_cd,
							S0_T.setoff_nm,
							decode(
								S0_T.repurc_obli_flg,
								value(true),
								value(MAC_INV_LOC_TYP.REPURC_OBLI.value()),
								decode(
									S0_T.inv_com_cd,
									nullValue(),
									value(MAC_INV_LOC_TYP.COM.value()),
									value(MAC_INV_LOC_TYP.OTH.value())
								)
							),
							S0_T.quality_typ,
							S0_T.spot_flg,
							S0_T.sttl_schd_dt,
							S0_T.sttl_cd,
							S0_T.cst_itm_cd,
							S0_T.cst_itm_nm,
							S0_T.sppl_itm_cd,
							S0_T.sppl_itm_nm,
							S0_T.slo_no,
							S0_T.po_no,
							S0_T.bank_ac_cd,
							S0_T.xfr_psn,
							S0_T.project_cd,
							S0_T.summary_cd0,
							S0_T.summary_cd1,
							S0_T.summary_cd2,
							S0_T.summary_cd3,
							S0_T.summary_cd4,
							S0_T.summary_cd5,
							S0_T.trd_itm_cd,
							S0_T.trd_itm_sub1,
							S0_T.trd_itm_sub2,
							S0_T.trd_itm_sub3,
							S0_T.trd_itm_nm,
							S0_T.trd_project_cd,
							S0_T.trd_summary_cd0,
							S0_T.trd_summary_cd1,
							S0_T.trd_summary_cd2,
							S0_T.trd_summary_cd3,
							S0_T.trd_summary_cd4,
							S0_T.trd_summary_cd5,
							S0_T.trd_rmrks,
							S0_T.trd_d_rmrks,
							S0_T.jnl_key1,
							S0_T.jnl_key2,
							S0_T.jnl_key3,
							S0_T.jnl_key4,
							S0_T.jnl_key5,
							S0_T.jnl_key6,
							S0_T.jnl_key7,
							S0_T.jnl_key8,
							S0_T.jnl_key9,
							S0_T.jnl_key10,
							S0_T.sub_char1,
							S0_T.sub_char2,
							S0_T.sub_char3,
							S0_T.sub_char4,
							S0_T.sub_char5,
							S0_T.sub_char6,
							S0_T.sub_char7,
							S0_T.sub_char8,
							S0_T.sub_char9,
							S0_T.sub_char10,
							S0_T.sub_num1,
							S0_T.sub_num2,
							S0_T.sub_num3,
							S0_T.sub_dt1,
							S0_T.sub_dt2,
							S0_T.sub_dt3,
							S0_T.tmp_num,
							S0_T.auto_jnl_key_cd,
							S0_T.repurc_obli_flg
						)
						.having(sum(S0_T.base_unit_qty).neq(value(0))
								.or(sum(S0_T.base_cur_amt).neq(value(0)))
								.or(sum(S0_T.base_cur_tax_amt).neq(value(0)))
						).view(S0_V)
					)
					.where(
						exists(
							subQuery()
							.select(value("X"))
							.from(
								S1_M1
								.innerJoin(S1_M2).on(
									bracket(
										S1_M1.jnl_ptn_cd.eq(S1_M2.jnl_ptn_cd)
										.and(S1_M2.del_flg.eq(value(false)))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_M1.ac_slip_typ.eq(S0_V.pr("ac_slip_typ")))
								.and(
									nvl(
										S1_M1.auto_jnl_key_cd,
										bind("null_val")
									).eq(nvl(
											S0_V.pr("auto_jnl_key_cd"),
											bind("null_val")
										)
									)
								)
								.and(S1_M1.st_dt.lte(S0_V.pr("ac_dt")))
								.and(S1_M1.end_dt.gte(S0_V.pr("ac_dt")))
								.and(S1_M1.del_flg.eq(value(false)))
							)
						)
					)
					.orderBy(
						S0_V.pr("jnl_unit").asc(),
						S0_V.pr("ac_slip_typ").asc(),
						S0_V.pr("auto_jnl_key_cd").asc()
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBW_PRE_JOURNAL_Query_S02
	 */
	static MCQueryPlan MBBBL5030_MBW_PRE_JOURNAL_S02() {
		MCTempView S0_V = createTempView("V");
		MBW_PRE_JOURNAL_R S0_T = MBW_PRE_JOURNAL_R.create("T");
		MAM_AUTO_JNL_R S1_M1 = MAM_AUTO_JNL_R.create("M1");
		MAM_JNL_PTN_R S1_M2 = MAM_JNL_PTN_R.create("M2");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBW_PRE_JOURNAL_Query_S02")
					.mainQuery()
					.select(S0_V.prAll())
					.from(
						subQuery()
						.selectDistinct(
							max(S0_T.ac_dt).as("ac_dt"),
							S0_T.ac_slip_typ,
							S0_T.auto_jnl_key_cd
						)
						.from(S0_T)
						.where(
							value(0).eq(value(0))
							.and(S0_T.jnl_grp_no.eq(bind("jnl_grp_no")))
						)
						.groupBy(
							S0_T.jnl_unit,
							S0_T.wg_cd,
							S0_T.ac_slip_dt,
							S0_T.slip_no,
							S0_T.slip_seq_no,
							S0_T.ac_slip_typ,
							S0_T.ac_rsn_cd,
							S0_T.itm_jnl_cd,
							S0_T.purc_dpt_cd,
							S0_T.ap_dpt_cd,
							S0_T.sls_dpt_cd,
							S0_T.ar_dpt_cd,
							S0_T.gi_dpt_cd,
							S0_T.gr_dpt_cd,
							S0_T.bd_dpt_cd,
							S0_T.rcv_dpt_cd,
							S0_T.so_dpt_cd,
							S0_T.sub_dpt_cd1,
							S0_T.sub_dpt_cd2,
							S0_T.sub_dpt_cd3,
							S0_T.usr_cd,
							S0_T.purc_typ,
							S0_T.un_fix_flg,
							S0_T.temp_ap_flg,
							S0_T.foreign_flg,
							S0_T.asst_typ,
							S0_T.ac_itm_grp_cd,
							S0_T.itm_cd,
							S0_T.itm_sub1,
							S0_T.itm_sub2,
							S0_T.itm_sub3,
							S0_T.itm_nm,
							S0_T.base_unit_cd,
							S0_T.trd_unit_cd,
							S0_T.base_cur_cd,
							S0_T.trd_cur_cd,
							S0_T.ptax_cur_cd,
							S0_T.tax_cd,
							S0_T.xrate_cd,
							S0_T.xrate,
							S0_T.ptax_xrate_cd,
							S0_T.ptax_xrate,
							S0_T.wrk_no,
							S0_T.iv_no,
							S0_T.bill_no,
							S0_T.acst_cd,
							S0_T.cst_cd,
							S0_T.asppl_cd,
							S0_T.sppl_cd,
							S0_T.inv_com_cd,
							S0_T.rcst_cd,
							S0_T.setoff_cd,
							S0_T.setoff_nm,
							decode(
								S0_T.repurc_obli_flg,
								value(true),
								value(MAC_INV_LOC_TYP.REPURC_OBLI.value()),
								decode(
									S0_T.inv_com_cd,
									nullValue(),
									value(MAC_INV_LOC_TYP.COM.value()),
									value(MAC_INV_LOC_TYP.OTH.value())
								)
							),
							S0_T.quality_typ,
							S0_T.spot_flg,
							S0_T.sttl_schd_dt,
							S0_T.sttl_cd,
							S0_T.cst_itm_cd,
							S0_T.cst_itm_nm,
							S0_T.sppl_itm_cd,
							S0_T.sppl_itm_nm,
							S0_T.slo_no,
							S0_T.po_no,
							S0_T.bank_ac_cd,
							S0_T.xfr_psn,
							S0_T.project_cd,
							S0_T.summary_cd0,
							S0_T.summary_cd1,
							S0_T.summary_cd2,
							S0_T.summary_cd3,
							S0_T.summary_cd4,
							S0_T.summary_cd5,
							S0_T.trd_itm_cd,
							S0_T.trd_itm_sub1,
							S0_T.trd_itm_sub2,
							S0_T.trd_itm_sub3,
							S0_T.trd_itm_nm,
							S0_T.trd_project_cd,
							S0_T.trd_summary_cd0,
							S0_T.trd_summary_cd1,
							S0_T.trd_summary_cd2,
							S0_T.trd_summary_cd3,
							S0_T.trd_summary_cd4,
							S0_T.trd_summary_cd5,
							S0_T.trd_rmrks,
							S0_T.trd_d_rmrks,
							S0_T.jnl_key1,
							S0_T.jnl_key2,
							S0_T.jnl_key3,
							S0_T.jnl_key4,
							S0_T.jnl_key5,
							S0_T.jnl_key6,
							S0_T.jnl_key7,
							S0_T.jnl_key8,
							S0_T.jnl_key9,
							S0_T.jnl_key10,
							S0_T.sub_char1,
							S0_T.sub_char2,
							S0_T.sub_char3,
							S0_T.sub_char4,
							S0_T.sub_char5,
							S0_T.sub_char6,
							S0_T.sub_char7,
							S0_T.sub_char8,
							S0_T.sub_char9,
							S0_T.sub_char10,
							S0_T.sub_num1,
							S0_T.sub_num2,
							S0_T.sub_num3,
							S0_T.sub_dt1,
							S0_T.sub_dt2,
							S0_T.sub_dt3,
							S0_T.tmp_num,
							S0_T.auto_jnl_key_cd,
							S0_T.repurc_obli_flg
						)
						.having(sum(S0_T.base_unit_qty).neq(value(0))
								.or(sum(S0_T.base_cur_amt).neq(value(0)))
								.or(sum(S0_T.base_cur_tax_amt).neq(value(0)))
						).view(S0_V)
					)
					.where(
						notExists(
							subQuery()
							.select(value("X"))
							.from(
								S1_M1
								.innerJoin(S1_M2).on(
									S1_M1.jnl_ptn_cd.eq(S1_M2.jnl_ptn_cd)
									.and(S1_M2.del_flg.eq(value(false)))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_M1.ac_slip_typ.eq(S0_V.pr("ac_slip_typ")))
								.and(
									nvl(
										S1_M1.auto_jnl_key_cd,
										bind("null_val")
									).eq(nvl(
											S0_V.pr("auto_jnl_key_cd"),
											bind("null_val")
										)
									)
								)
								.and(S1_M1.st_dt.lte(S0_V.pr("ac_dt")))
								.and(S1_M1.end_dt.gte(S0_V.pr("ac_dt")))
								.and(S1_M1.del_flg.eq(value(false)))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JOURNAL_Query_S01
	 */
	static MCQueryPlan MBBBL5030_MBT_JOURNAL_S01() {
		MCTempView S0_X = createTempView("X");
		MBT_JOURNAL_R S1_T = MBT_JOURNAL_R.create("T");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JOURNAL_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(
						subQuery()
						.select(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.jnl_grp_no.eq(bind("jnl_grp_no")))
						)
						.groupBy(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no
						)
						.view(S0_X)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_HISTORY_Query_U01
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_HISTORY_U01() {
		MBT_JNL_HISTORY_R S0_T = MBT_JNL_HISTORY_R.create("T");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_HISTORY_Query_U01")
					.update(S0_T)
					.set(S0_T.data_typ).eq(value(MAC_DATA_TYP.JNL_MK.value()))
					.where(
						value(0).eq(value(0))
						.and(S0_T.jnl_grp_no.eq(bind("jnl_grp_no")))
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_NO_CTL_Query_U01
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_NO_CTL_U01() {
		MBT_JNL_NO_CTL_R S0_T = MBT_JNL_NO_CTL_R.create("T");
		MBT_JOURNAL_R S1_W = MBT_JOURNAL_R.create("W");
		MBT_JOURNAL_R S2_W = MBT_JOURNAL_R.create("W");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_NO_CTL_Query_U01")
					.update(S0_T)
					.set(S0_T.jnl_no).eq(subQuery()
						.select(max(S1_W.jnl_no))
						.from(S1_W)
						.where(
							S1_W.jnl_grp_no.eq(bind("jnl_grp_no"))
							.and(S1_W.ac_ym.eq(S0_T.ac_ym))
							.and(S1_W.ac_if_typ.eq(S0_T.ac_if_typ))
							.and(S1_W.slip_cnt_id.eq(S0_T.slip_cnt_id))
						)
					)
					.where(
						exists(
							subQuery()
							.select(value("X"))
							.from(S2_W)
							.where(
								S2_W.jnl_grp_no.eq(bind("jnl_grp_no"))
								.and(S2_W.ac_ym.eq(S0_T.ac_ym))
								.and(S2_W.ac_if_typ.eq(S0_T.ac_if_typ))
								.and(S2_W.slip_cnt_id.eq(S0_T.slip_cnt_id))
							)
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JNL_NO_CTL_Query_I01
	 */
	static MCQueryPlan MBBBL5030_MBT_JNL_NO_CTL_I01() {
		MBT_JNL_NO_CTL_R S0 = MBT_JNL_NO_CTL_R.create();
		MBT_JOURNAL_R S1_T = MBT_JOURNAL_R.create("T");
		MBT_JNL_NO_CTL_R S2_W = MBT_JNL_NO_CTL_R.create("W");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JNL_NO_CTL_Query_I01")
					.insert(S0)
					.columns(
						S0.ac_ym,
						S0.ac_if_typ,
						S0.slip_cnt_id,
						S0.jnl_no
					)
					.query(
						subQuery()
						.select(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							max(S1_T.jnl_no)
						)
						.from(S1_T)
						.where(
							S1_T.jnl_grp_no.eq(bind("jnl_grp_no"))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_W)
									.where(
										S2_W.ac_ym.eq(S1_T.ac_ym)
										.and(S2_W.ac_if_typ.eq(S1_T.ac_if_typ))
										.and(S2_W.slip_cnt_id.eq(S1_T.slip_cnt_id))
									)
								)
							)
						)
						.groupBy(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id
						)
					)
				);
	}
	
	/**
	 * -- MBBBL5030_MBT_JOURNAL_Query_S02
	 */
	static MCQueryPlan MBBBL5030_MBT_JOURNAL_S02() {
		MCTempView S0_S = createTempView("S");
		MBT_JOURNAL_R S1_T = MBT_JOURNAL_R.create("T");
		
		return createQueryPlan()
				.setQuery(
					sql("MBBBL5030_MBT_JOURNAL_Query_S02")
					.mainQuery()
					.select(
						S0_S.pr("jnl_ptn"),
						S0_S.pr("dr_base_cur_sum_amt"),
						S0_S.pr("cr_base_cur_sum_amt")
					)
					.from(
						subQuery()
						.select(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no,
							min(S1_T.jnl_ptn).as("jnl_ptn"),
							sum(
								decode(
									S1_T.dc_typ,
									value(MAC_DC_TYP.DR.value()),
									S1_T.base_cur_sum_amt,
									value(0)
								)
							).as("dr_base_cur_sum_amt"),
							sum(
								decode(
									S1_T.dc_typ,
									value(MAC_DC_TYP.DR.value()),
									value(0),
									S1_T.base_cur_sum_amt
								)
							).as("cr_base_cur_sum_amt")
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.jnl_grp_no.eq(bind("jnl_grp_no")))
						)
						.groupBy(
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no
						).view(S0_S)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_S.pr("dr_base_cur_sum_amt").neq(S0_S.pr("cr_base_cur_sum_amt")))
					)
				);
	}
}