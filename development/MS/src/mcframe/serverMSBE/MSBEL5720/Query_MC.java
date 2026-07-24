package mcframe.serverMSBE.MSBEL5720;

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
	 * -- MSBEL5720_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL5720_MST_IV_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_CO_LCL_R S0_M0 = MAM_CO_LCL_R.create("M0");
		MAM_BP_LCL_R S0_M1 = MAM_BP_LCL_R.create("M1");
		MAM_BP_R S0_M1B = MAM_BP_R.create("M1B");
		MAM_LOC_LCL_R S0_M2 = MAM_LOC_LCL_R.create("M2");
		MAM_LOC_R S0_M2B = MAM_LOC_R.create("M2B");
		MAM_BP_LCL_R S0_M3 = MAM_BP_LCL_R.create("M3");
		MAM_BP_R S0_M3B = MAM_BP_R.create("M3B");
		MAM_LOC_LCL_R S0_M4 = MAM_LOC_LCL_R.create("M4");
		MAM_LOC_R S0_M4B = MAM_LOC_R.create("M4B");
		MAM_TTERM_LCL_R S0_M5 = MAM_TTERM_LCL_R.create("M5");
		MAM_TTERM_R S0_M5B = MAM_TTERM_R.create("M5B");
		MAM_TRNSPT_LCL_R S0_M6 = MAM_TRNSPT_LCL_R.create("M6");
		MAM_TRNSPT_R S0_M6B = MAM_TRNSPT_R.create("M6B");
		MAM_EXIM_PORT_LCL_R S0_M7 = MAM_EXIM_PORT_LCL_R.create("M7");
		MAM_EXIM_PORT_R S0_M7B = MAM_EXIM_PORT_R.create("M7B");
		MAM_EXIM_PORT_LCL_R S0_M8 = MAM_EXIM_PORT_LCL_R.create("M8");
		MAM_EXIM_PORT_R S0_M8B = MAM_EXIM_PORT_R.create("M8B");
		MAM_EXIM_PORT_LCL_R S0_M9 = MAM_EXIM_PORT_LCL_R.create("M9");
		MAM_EXIM_PORT_R S0_M9B = MAM_EXIM_PORT_R.create("M9B");
		MAM_CUR_LCL_R S0_M10 = MAM_CUR_LCL_R.create("M10");
		MAM_CUR_R S0_M10B = MAM_CUR_R.create("M10B");
		MAM_TTERM_LCL_R S0_M11 = MAM_TTERM_LCL_R.create("M11");
		MAM_TTERM_R S0_M11B = MAM_TTERM_R.create("M11B");
		MAM_TTERM_LCL_R S0_M12 = MAM_TTERM_LCL_R.create("M12");
		MAM_TTERM_R S0_M12B = MAM_TTERM_R.create("M12B");
		MST_IV_R S1_T01 = MST_IV_R.create("T01");
		MAM_BP_R S1_M01 = MAM_BP_R.create("M01");
		MAM_LOC_R S1_M02 = MAM_LOC_R.create("M02");
		MAM_CUR_R S1_M03 = MAM_CUR_R.create("M03");
		MAM_CO_R S0_M13 = MAM_CO_R.create("M13");
		MAM_CNTRY_R S0_M14 = MAM_CNTRY_R.create("M14");
		MAM_CNTRY_R S0_M15 = MAM_CNTRY_R.create("M15");
		MAM_CNTRY_R S1_M04 = MAM_CNTRY_R.create("M04");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5720_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr("iv_no"),
						S0_T1.pr("iv_rev"),
						S0_T1.pr("iv_mng_no"),
						S0_T1.pr("trd_ptn_typ"),
						S0_T1.pr("iv_prnt_flg"),
						nvl(
							FCPA_CO$F_GET_CO_NM1(S0_T1.pr("prnt_lcl_cd")),
							FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())
						).as("co_nm"),
						S0_M0.addr1.as("co_addr1"),
						S0_M0.addr2.as("co_addr2"),
						S0_M0.addr3.as("co_addr3"),
						S0_M0.addr4.as("co_addr4"),
						nullValue().as("co_addr"),
						S0_M0.tel.as("co_tel"),
						S0_M0.fax.as("co_fax"),
						nullValue().as("prnt_dt"),
						S0_T1.pr("iv_dt"),
						S0_T1.pr("ship_rqst_id_cd"),
						S0_T1.pr("ship_rqst_id_typ"),
						cases()
							.when(S0_T1.pr("ship_rqst_id_typ").eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(
									nvl(
										S0_M2.loc_nm,
										S0_M2B.loc_nm
									)
							)
							.otherwise(
								nvl(
									S0_M1.bp_nm,
									S0_M1B.bp_nm
								)
							).as("ship_rqst_id_nm"),
						nvl(
							S0_M1.bp_alt_nm1,
							S0_M1B.bp_alt_nm1
						).as("ship_rqst_id_alt_nm1"),
						nvl(
							S0_M1.bp_alt_nm2,
							S0_M1B.bp_alt_nm2
						).as("ship_rqst_id_alt_nm2"),
						nvl(
							S0_M1.bp_alt_nm3,
							S0_M1B.bp_alt_nm3
						).as("ship_rqst_id_alt_nm3"),
						nvl(
							S0_M1.bp_alt_nm4,
							S0_M1B.bp_alt_nm4
						).as("ship_rqst_id_alt_nm4"),
						cases()
							.when(S0_T1.pr("ship_rqst_id_typ").eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_M2.addr1)
							.otherwise(
								MAPA_BP$F_GET_BP_ADDR(
									S0_T1.pr("ship_rqst_id_cd"),
									S0_T1.pr("iv_dt"),
									value(MAC_BP_ADDR_TYP.ADDR1.value())
								)
							).as("ship_rqst_addr1"),
						cases()
							.when(S0_T1.pr("ship_rqst_id_typ").eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_M2.addr2)
							.otherwise(
								MAPA_BP$F_GET_BP_ADDR(
									S0_T1.pr("ship_rqst_id_cd"),
									S0_T1.pr("iv_dt"),
									value(MAC_BP_ADDR_TYP.ADDR2.value())
								)
							).as("ship_rqst_addr2"),
						cases()
							.when(S0_T1.pr("ship_rqst_id_typ").eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_M2.addr3)
							.otherwise(
								MAPA_BP$F_GET_BP_ADDR(
									S0_T1.pr("ship_rqst_id_cd"),
									S0_T1.pr("iv_dt"),
									value(MAC_BP_ADDR_TYP.ADDR3.value())
								)
							).as("ship_rqst_addr3"),
						cases()
							.when(S0_T1.pr("ship_rqst_id_typ").eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_M2.addr4)
							.otherwise(
								MAPA_BP$F_GET_BP_ADDR(
									S0_T1.pr("ship_rqst_id_cd"),
									S0_T1.pr("iv_dt"),
									value(MAC_BP_ADDR_TYP.ADDR4.value())
								)
							).as("ship_rqst_addr4"),
						nullValue().as("ship_rqst_addr"),
						S0_T1.pr("dlv_id_typ"),
						S0_T1.pr("dlv_id_cd").as("dlv_cd"),
						cases()
							.when(S0_T1.pr("dlv_sundry_flg").eq(value(true)))
								.then(S0_T1.pr("dlv_id_nm"))
							.otherwise(
								cases()
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.DLV.value())))
										.then(
											nvl(
												S0_M3.bp_nm,
												S0_M3B.bp_nm
											)
									)
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.LOC.value())))
										.then(
											nvl(
												S0_M4.loc_nm,
												S0_M4B.loc_nm
											)
									)
									.otherwise(nullValue())
							).as("dlv_nm"),
						nvl(
							S0_M3.bp_alt_nm1,
							S0_M3B.bp_alt_nm1
						).as("dlv_id_alt_nm1"),
						nvl(
							S0_M3.bp_alt_nm2,
							S0_M3B.bp_alt_nm2
						).as("dlv_id_alt_nm2"),
						nvl(
							S0_M3.bp_alt_nm3,
							S0_M3B.bp_alt_nm3
						).as("dlv_id_alt_nm3"),
						nvl(
							S0_M3.bp_alt_nm4,
							S0_M3B.bp_alt_nm4
						).as("dlv_id_alt_nm4"),
						cases()
							.when(S0_T1.pr("dlv_sundry_flg").eq(value(true)))
								.then(S0_T1.pr("dlv_addr1"))
							.otherwise(
								cases()
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.DLV.value())))
										.then(
											MAPA_BP$F_GET_BP_ADDR(
												S0_T1.pr("dlv_id_cd"),
												S0_T1.pr("iv_dt"),
												value(MAC_BP_ADDR_TYP.ADDR1.value())
											)
									)
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.LOC.value())))
										.then(S0_M4.addr1)
									.otherwise(nullValue())
							).as("dlv_addr1"),
						cases()
							.when(S0_T1.pr("dlv_sundry_flg").eq(value(true)))
								.then(S0_T1.pr("dlv_addr2"))
							.otherwise(
								cases()
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.DLV.value())))
										.then(
											MAPA_BP$F_GET_BP_ADDR(
												S0_T1.pr("dlv_id_cd"),
												S0_T1.pr("iv_dt"),
												value(MAC_BP_ADDR_TYP.ADDR2.value())
											)
									)
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.LOC.value())))
										.then(S0_M4.addr2)
									.otherwise(nullValue())
							).as("dlv_addr2"),
						cases()
							.when(S0_T1.pr("dlv_sundry_flg").eq(value(true)))
								.then(S0_T1.pr("dlv_addr3"))
							.otherwise(
								cases()
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.DLV.value())))
										.then(
											MAPA_BP$F_GET_BP_ADDR(
												S0_T1.pr("dlv_id_cd"),
												S0_T1.pr("iv_dt"),
												value(MAC_BP_ADDR_TYP.ADDR3.value())
											)
									)
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.LOC.value())))
										.then(S0_M4.addr3)
									.otherwise(nullValue())
							).as("dlv_addr3"),
						cases()
							.when(S0_T1.pr("dlv_sundry_flg").eq(value(true)))
								.then(S0_T1.pr("dlv_addr4"))
							.otherwise(
								cases()
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.DLV.value())))
										.then(
											MAPA_BP$F_GET_BP_ADDR(
												S0_T1.pr("dlv_id_cd"),
												S0_T1.pr("iv_dt"),
												value(MAC_BP_ADDR_TYP.ADDR4.value())
											)
									)
									.when(S0_T1.pr("dlv_id_typ").eq(value(MSC_DLV_ID_TYP.LOC.value())))
										.then(S0_M4.addr4)
									.otherwise(nullValue())
							).as("dlv_addr4"),
						nullValue().as("dlv_addr"),
						S0_T1.pr("trnspt_cd"),
						nvl(
							S0_M6.trnspt_nm,
							S0_M6B.trnspt_nm
						).as("trnspt_nm"),
						S0_T1.pr("vssl_flght"),
						S0_T1.pr("etd_dt"),
						S0_T1.pr("load_port_cd"),
						nvl(
							S0_M7.port_nm,
							S0_M7B.port_nm
						).as("load_port_nm"),
						S0_T1.pr("dschrg_port_cd"),
						nvl(
							S0_M8.port_nm,
							S0_M8B.port_nm
						).as("dschrg_port_nm"),
						S0_T1.pr("via_port_cd"),
						nvl(
							S0_M9.port_nm,
							S0_M9B.port_nm
						).as("via_port_nm"),
						S0_T1.pr("tterm_cd3"),
						nvl(
							S0_M5.tterm_nm,
							S0_M5B.tterm_nm
						).as("tterm_nm3"),
						S0_T1.pr("tterm_rmrks3"),
						S0_T1.pr("trd_cur_cd").as("cur_cd"),
						nvl(
							S0_M10.cur_nm,
							S0_M10B.cur_nm
						).as("cur_nm"),
						S0_T1.pr("lc_no"),
						S0_T1.pr("lc_dt"),
						S0_T1.pr("lc_rmrks"),
						S0_T1.pr("bl_no"),
						S0_T1.pr("bl_dt"),
						S0_T1.pr("bl_rmrks"),
						S0_T1.pr("case_mrk1"),
						S0_T1.pr("case_mrk2"),
						S0_T1.pr("case_mrk3"),
						S0_T1.pr("case_mrk4"),
						S0_T1.pr("case_mrk5"),
						S0_T1.pr("case_mrk6"),
						S0_T1.pr("pl_rmrks"),
						S0_T1.pr("iv_rmrks"),
						S0_T1.pr("sub_char1").as("iv_sub_char1"),
						S0_T1.pr("sub_char2").as("iv_sub_char2"),
						S0_T1.pr("sub_char3").as("iv_sub_char3"),
						S0_T1.pr("prnt_lcl_cd"),
						S0_T1.pr(S1_M03.upri_dec_place),
						S0_T1.pr(S1_M03.amt_dec_place),
						S0_T1.pr("ttl_trd_cur_amt"),
						S0_T1.pr("tterm_cd1"),
						nvl(
							S0_M11.tterm_nm,
							S0_M11B.tterm_nm
						).as("tterm_nm1"),
						S0_T1.pr("tterm_cd2"),
						nvl(
							S0_M12.tterm_nm,
							S0_M12B.tterm_nm
						).as("tterm_nm2")
						,S0_M14.cntry_nm.as("co_cntry_nm")
						,S0_M15.cntry_nm.as("ship_rqst_cntry_nm")
						,S0_T1.pr("dlv_cntry_nm")
						,S0_T1.pr("dlv_cntry_cd")
					)
					.from(
						subQuery()
						.select(
							S1_T01.prAll(),
							cases()
								.when(S1_T01.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
									.then(S1_M01.prnt_lcl_cd)
								.otherwise(S1_M02.prnt_lcl_cd).as("prnt_lcl_cd"),
							S1_M03.upri_dec_place,
							S1_M03.amt_dec_place
							,S1_M04.cntry_nm.as("dlv_cntry_nm")
						)
						.from(
							S1_T01
							.leftOuterJoin(S1_M01).on(
								bracket(
									S1_T01.dlv_id_cd.eq(S1_M01.bp_cd)
								)
							)
							.leftOuterJoin(S1_M02).on(
								bracket(
									S1_T01.dlv_id_cd.eq(S1_M02.loc_cd)
								)
							)
							.leftOuterJoin(S1_M03).on(
								bracket(
									S1_T01.trd_cur_cd.eq(S1_M03.cur_cd)
								)
							)
							.leftOuterJoin(S1_M04).on(
								bracket(
									S1_M01.cntry_cd.eq(S1_M04.cntry_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T01.iv_mng_no.eq(bind("iv_mng_no")))
							.and(S1_T01.iv_rev.eq(bind("iv_rev")))
						).view(S0_T1)
						.leftOuterJoin(S0_M0).on(
							bracket(
								S0_M0.lcl_cd.eq(S0_T1.pr("prnt_lcl_cd"))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.pr("ship_rqst_id_cd").eq(S0_M1.bp_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M1.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M1B).on(
							bracket(
								S0_T1.pr("ship_rqst_id_cd").eq(S0_M1B.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.pr("ship_rqst_id_cd").eq(S0_M2.loc_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M2.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M2B).on(
							bracket(
								S0_T1.pr("ship_rqst_id_cd").eq(S0_M2B.loc_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.pr("dlv_id_cd").eq(S0_M3.bp_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M3.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M3B).on(
							bracket(
								S0_T1.pr("dlv_id_cd").eq(S0_M3B.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.pr("dlv_id_cd").eq(S0_M4.loc_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M4.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M4B).on(
							bracket(
								S0_T1.pr("dlv_id_cd").eq(S0_M4B.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.pr("tterm_cd3").eq(S0_M5.tterm_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M5.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M5B).on(
							bracket(
								S0_T1.pr("tterm_cd3").eq(S0_M5B.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.pr("trnspt_cd").eq(S0_M6.trnspt_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M6.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M6B).on(
							bracket(
								S0_T1.pr("trnspt_cd").eq(S0_M6B.trnspt_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.pr("load_port_cd").eq(S0_M7.port_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M7.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M7B).on(
							bracket(
								S0_T1.pr("load_port_cd").eq(S0_M7B.port_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.pr("dschrg_port_cd").eq(S0_M8.port_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M8.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M8B).on(
							bracket(
								S0_T1.pr("dschrg_port_cd").eq(S0_M8B.port_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.pr("via_port_cd").eq(S0_M9.port_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M9.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M9B).on(
							bracket(
								S0_T1.pr("via_port_cd").eq(S0_M9B.port_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.pr("trd_cur_cd").eq(S0_M10.cur_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M10.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M10B).on(
							bracket(
								S0_T1.pr("trd_cur_cd").eq(S0_M10B.cur_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.pr("tterm_cd1").eq(S0_M11.tterm_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M11.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M11B).on(
							bracket(
								S0_T1.pr("tterm_cd1").eq(S0_M11B.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.pr("tterm_cd2").eq(S0_M12.tterm_cd)
								.and(S0_T1.pr("prnt_lcl_cd").eq(S0_M12.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M12B).on(
							bracket(
								S0_T1.pr("tterm_cd2").eq(S0_M12B.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M0.co_cd.eq(S0_M13.co_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M13.cntry_cd.eq(S0_M14.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M1B.cntry_cd.eq(S0_M15.cntry_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBEL5720_MST_PL_D_Query_S01
	 */
	static MCQueryPlan MSBEL5720_MST_PL_D_S01() {
		MST_PL_D_R S0_T1 = MST_PL_D_R.create("T1");
		MAM_CNTRY_LCL_R S0_M1 = MAM_CNTRY_LCL_R.create("M1");
		MAM_CNTRY_R S0_M1B = MAM_CNTRY_R.create("M1B");
		MAM_UNIT_LCL_R S0_M2 = MAM_UNIT_LCL_R.create("M2");
		MAM_UNIT_R S0_M2B = MAM_UNIT_R.create("M2B");
		MAM_ITM_LCL_R S0_M3 = MAM_ITM_LCL_R.create("M3");
		MAM_ITM_R S0_M3B = MAM_ITM_R.create("M3B");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5720_MST_PL_D_Query_S01")
					.mainQuery()
					.select(
						nullValue().as("t_cont_no"),
						nullValue().as("t_itm_code"),
						nullValue().as("t_qty"),
						nullValue().as("t_net"),
						nullValue().as("t_grss"),
						nullValue().as("t_dim"),
						S0_T1.cntnr_no_fr,
						S0_T1.cntnr_no_to,
						nullValue().as("cntnr_no_fr_to"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						S0_T1.cntry_org_cd,
						nvl(
							S0_M1.cntry_nm,
							S0_M1B.cntry_nm
						).as("cntry_org_nm"),
						S0_T1.trd_unit_qty,
						nullValue().as("s_trd_unit_qty"),
						nullValue().as("s_int_trd_unit_qty"),
						nullValue().as("s_dec_trd_unit_qty"),
						S0_T1.trd_unit_cd,
						nvl(
							S0_M2.unit_nm,
							S0_M2B.unit_nm
						).as("trd_unit_nm"),
						value(MSC_PRNT_NUM.WT_DEC_PLACE.value()).as("wt_dec_place"),
						value(MSC_PRNT_NUM.DIM_DEC_PLACE.value()).as("dim_dec_place"),
						S0_T1.net_wt,
						nullValue().as("s_net_wt"),
						nullValue().as("s_int_net_wt"),
						nullValue().as("s_dec_net_wt"),
						S0_T1.grss_wt,
						nullValue().as("s_grss_wt"),
						nullValue().as("s_int_grss_wt"),
						nullValue().as("s_dec_grss_wt"),
						S0_T1.dim,
						nullValue().as("s_dim"),
						nullValue().as("s_int_dim"),
						nullValue().as("s_dex_dim"),
						nullValue().as("container"),
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T1.iv_itm_nm,
										S0_M4.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M3.itm_nm,
									S0_M3B.itm_nm
								)
							).as("iv_itm_nm"),
						nvl(
							S0_M3.itm_alt_nm1,
							S0_M3B.itm_alt_nm1
						).as("iv_itm_alt_nm1"),
						nvl(
							S0_M3.itm_alt_nm2,
							S0_M3B.itm_alt_nm2
						).as("iv_itm_alt_nm2"),
						nvl(
							S0_M3.itm_alt_nm3,
							S0_M3B.itm_alt_nm3
						).as("iv_itm_alt_nm3"),
						nvl(
							S0_M3.itm_alt_nm4,
							S0_M3B.itm_alt_nm4
						).as("iv_itm_alt_nm4"),
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.disp_seq,
						S0_T1.sub_char1.as("pl_d_sub_char1"),
						S0_T1.sub_char2.as("pl_d_sub_char2"),
						S0_T1.sub_char3.as("pl_d_sub_char3"),
						nullValue().as("t_total"),
						nullValue().as("sum_trd_unit_qty"),
						nullValue().as("s_sum_trd_unit_qty"),
						nullValue().as("sum_trd_unit_cd"),
						nullValue().as("sum_trd_unit_nm"),
						nullValue().as("sum_net_wt"),
						nullValue().as("s_sum_net_wt"),
						nullValue().as("sum_grss_wt"),
						nullValue().as("s_sum_grss_wt"),
						nullValue().as("sum_dim"),
						nullValue().as("s_sum_dim"),
						nullValue().as("f_cntry_org_cd"),
						nullValue().as("f_cntry_org_nm"),
						nullValue().as("t_made_in"),
						nullValue().as("free")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cntry_org_cd.eq(S0_M1.cntry_cd)
								.and(S0_M1.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M1B).on(
							bracket(
								S0_T1.cntry_org_cd.eq(S0_M1B.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M2.unit_cd)
								.and(S0_M2.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M2B).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M2B.unit_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_M3.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M3B).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M3B.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M3B.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M3B.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M3B.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M4.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M4.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M4.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M4.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M4.sno1))
								.and(S0_T1.sno2.eq(S0_M4.sno2))
								.and(S0_T1.sno3.eq(S0_M4.sno3))
								.and(S0_T1.sno4.eq(S0_M4.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.iv_no.eq(bind("iv_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
}