package mcframe.serverMSBE.MSBEL1770;

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
	 * -- MSBEL1770_MST_IV_D_Query_S01
	 */
	static MCQueryPlan MSBEL1770_MST_IV_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_LCL_R S0_M01 = MAM_ITM_LCL_R.create("M01");
		MAM_BP_R S0_M02 = MAM_BP_R.create("M02");
		MAM_BP_R S0_M03 = MAM_BP_R.create("M03");
		MAM_ITM_R S0_M04 = MAM_ITM_R.create("M04");
		MAM_BP_GRP_R S0_M021 = MAM_BP_GRP_R.create("M021");
		MAM_BP_GRP_R S0_M022 = MAM_BP_GRP_R.create("M022");
		MAM_BP_GRP_R S0_M023 = MAM_BP_GRP_R.create("M023");
		MAM_BP_GRP_R S0_M024 = MAM_BP_GRP_R.create("M024");
		MAM_BP_GRP_R S0_M025 = MAM_BP_GRP_R.create("M025");
		MAM_BP_GRP_R S0_M026 = MAM_BP_GRP_R.create("M026");
		MAM_BP_GRP_R S0_M027 = MAM_BP_GRP_R.create("M027");
		MAM_BP_GRP_R S0_M028 = MAM_BP_GRP_R.create("M028");
		MAM_BP_GRP_R S0_M029 = MAM_BP_GRP_R.create("M029");
		MAM_BP_GRP_R S0_M0210 = MAM_BP_GRP_R.create("M0210");
		MAM_BP_GRP_R S0_M031 = MAM_BP_GRP_R.create("M031");
		MAM_BP_GRP_R S0_M032 = MAM_BP_GRP_R.create("M032");
		MAM_BP_GRP_R S0_M033 = MAM_BP_GRP_R.create("M033");
		MAM_BP_GRP_R S0_M034 = MAM_BP_GRP_R.create("M034");
		MAM_BP_GRP_R S0_M035 = MAM_BP_GRP_R.create("M035");
		MAM_BP_GRP_R S0_M036 = MAM_BP_GRP_R.create("M036");
		MAM_BP_GRP_R S0_M037 = MAM_BP_GRP_R.create("M037");
		MAM_BP_GRP_R S0_M038 = MAM_BP_GRP_R.create("M038");
		MAM_BP_GRP_R S0_M039 = MAM_BP_GRP_R.create("M039");
		MAM_BP_GRP_R S0_M0310 = MAM_BP_GRP_R.create("M0310");
		MAM_ITM_GRP_R S0_M041 = MAM_ITM_GRP_R.create("M041");
		MAM_ITM_GRP_R S0_M042 = MAM_ITM_GRP_R.create("M042");
		MAM_ITM_GRP_R S0_M043 = MAM_ITM_GRP_R.create("M043");
		MAM_ITM_GRP_R S0_M044 = MAM_ITM_GRP_R.create("M044");
		MAM_ITM_GRP_R S0_M045 = MAM_ITM_GRP_R.create("M045");
		MAM_ITM_GRP_R S0_M046 = MAM_ITM_GRP_R.create("M046");
		MAM_ITM_GRP_R S0_M047 = MAM_ITM_GRP_R.create("M047");
		MAM_ITM_GRP_R S0_M048 = MAM_ITM_GRP_R.create("M048");
		MAM_ITM_GRP_R S0_M049 = MAM_ITM_GRP_R.create("M049");
		MAM_ITM_GRP_R S0_M0410 = MAM_ITM_GRP_R.create("M0410");
		MST_IV_P_R S1_T1 = MST_IV_P_R.create("T1");
		MST_IV_D_P_R S1_T2 = MST_IV_D_P_R.create("T2");
		MST_RCPT_IV_R S1_T4 = MST_RCPT_IV_R.create("T4");
		MST_WRK_SNO_R S1_T5 = MST_WRK_SNO_R.create("T5");
		MST_WRK_R S1_T6 = MST_WRK_R.create("T6");
		MCTempView S1_T7 = createTempView("T7");
		MST_SLO_R S1_T8 = MST_SLO_R.create("T8");
		MST_XFR_SCHD_R S1_T9 = MST_XFR_SCHD_R.create("T9");
		MST_SLO_D_R S1_T10 = MST_SLO_D_R.create("T10");
		MST_IV_R S1_T11 = MST_IV_R.create("T11");
		MAM_BP_R S1_M1 = MAM_BP_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_CNTRY_R S1_M3 = MAM_CNTRY_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S1_M6 = MAM_BP_R.create("M6");
		MAM_LG_GRP_R S1_M7 = MAM_LG_GRP_R.create("M7");
		MAM_TRNSPT_R S1_M8 = MAM_TRNSPT_R.create("M8");
		MAM_EXIM_PORT_R S1_M9 = MAM_EXIM_PORT_R.create("M9");
		MAM_EXIM_PORT_R S1_M10 = MAM_EXIM_PORT_R.create("M10");
		MAM_EXIM_PORT_R S1_M11 = MAM_EXIM_PORT_R.create("M11");
		MAM_TTERM_R S1_M12 = MAM_TTERM_R.create("M12");
		MAM_TTERM_R S1_M13 = MAM_TTERM_R.create("M13");
		MAM_TTERM_R S1_M14 = MAM_TTERM_R.create("M14");
		MAM_CUR_R S1_M15 = MAM_CUR_R.create("M15");
		MAM_CUR_R S1_M16 = MAM_CUR_R.create("M16");
		MAM_TRD_R S1_M17 = MAM_TRD_R.create("M17");
		MAM_ITM_R S1_M18 = MAM_ITM_R.create("M18");
		MAM_ITM_TYP_D_R S1_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_SUNDRY_ITM_R S1_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_BP_R S1_M21 = MAM_BP_R.create("M21");
		MAM_CNTRY_R S1_M22 = MAM_CNTRY_R.create("M22");
		MAM_STK_GD_R S1_M23 = MAM_STK_GD_R.create("M23");
		MAM_UNIT_R S1_M24 = MAM_UNIT_R.create("M24");
		MAM_UNIT_R S1_M25 = MAM_UNIT_R.create("M25");
		MAM_TAX_R S1_M26 = MAM_TAX_R.create("M26");
		MAM_BIZ_RSN_R S1_M27 = MAM_BIZ_RSN_R.create("M27");
		MAM_DPT_R S1_M28 = MAM_DPT_R.create("M28");
		MAM_BIZ_RSN_R S1_M29 = MAM_BIZ_RSN_R.create("M29");
		MAM_DPT_R S1_M30 = MAM_DPT_R.create("M30");
		MAM_USR_R S1_M31 = MAM_USR_R.create("M31");
		MAM_DPT_R S1_M32 = MAM_DPT_R.create("M32");
		MAVM_ITM_UNIT_R S1_M33 = MAVM_ITM_UNIT_R.create("M33");
		MAVM_ITM_UNIT_R S1_M34 = MAVM_ITM_UNIT_R.create("M34");
		MAM_LG_GRP_R S1_M35 = MAM_LG_GRP_R.create("M35");
		MAM_ITM_LG_GRP_R S1_M36 = MAM_ITM_LG_GRP_R.create("M36");
		MAM_LOC_R S1_M37 = MAM_LOC_R.create("M37");
		MST_SHIP_INST_R S2 = MST_SHIP_INST_R.create();
		MST_IV_MAP_R S3_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_SCHD_R S3_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_IV_MAP_R S4_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_SCHD_R S4_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MAM_LG_GRP_R S4_LGGRP = MAM_LG_GRP_R.create("LGGRP");
		MST_IV_P_R S5_IVP = MST_IV_P_R.create("IVP");
		MST_IV_R S1_T12 = MST_IV_R.create("T12");
		MST_IV_D_R S1_T13 = MST_IV_D_R.create("T13");
		MST_RCPT_IV_R S1_T14 = MST_RCPT_IV_R.create("T14");
		MST_WRK_SNO_R S1_T15 = MST_WRK_SNO_R.create("T15");
		MST_WRK_R S1_T16 = MST_WRK_R.create("T16");
		MCTempView S1_T17 = createTempView("T17");
		MST_SLO_R S1_T18 = MST_SLO_R.create("T18");
		MST_XFR_SCHD_R S1_T19 = MST_XFR_SCHD_R.create("T19");
		MST_SLO_D_R S1_T20 = MST_SLO_D_R.create("T20");
		MAM_BP_R S1_M38 = MAM_BP_R.create("M38");
		MAM_LOC_R S1_M39 = MAM_LOC_R.create("M39");
		MAM_CNTRY_R S1_M40 = MAM_CNTRY_R.create("M40");
		MAM_BP_R S1_M41 = MAM_BP_R.create("M41");
		MAM_LOC_R S1_M42 = MAM_LOC_R.create("M42");
		MAM_BP_R S1_M43 = MAM_BP_R.create("M43");
		MAM_LG_GRP_R S1_M44 = MAM_LG_GRP_R.create("M44");
		MAM_TRNSPT_R S1_M45 = MAM_TRNSPT_R.create("M45");
		MAM_EXIM_PORT_R S1_M46 = MAM_EXIM_PORT_R.create("M46");
		MAM_EXIM_PORT_R S1_M47 = MAM_EXIM_PORT_R.create("M47");
		MAM_EXIM_PORT_R S1_M48 = MAM_EXIM_PORT_R.create("M48");
		MAM_TTERM_R S1_M49 = MAM_TTERM_R.create("M49");
		MAM_TTERM_R S1_M50 = MAM_TTERM_R.create("M50");
		MAM_TTERM_R S1_M51 = MAM_TTERM_R.create("M51");
		MAM_CUR_R S1_M52 = MAM_CUR_R.create("M52");
		MAM_CUR_R S1_M53 = MAM_CUR_R.create("M53");
		MAM_TRD_R S1_M54 = MAM_TRD_R.create("M54");
		MAM_ITM_R S1_M55 = MAM_ITM_R.create("M55");
		MAM_ITM_TYP_D_R S1_M56 = MAM_ITM_TYP_D_R.create("M56");
		MAM_SUNDRY_ITM_R S1_M57 = MAM_SUNDRY_ITM_R.create("M57");
		MAM_BP_R S1_M58 = MAM_BP_R.create("M58");
		MAM_CNTRY_R S1_M59 = MAM_CNTRY_R.create("M59");
		MAM_STK_GD_R S1_M60 = MAM_STK_GD_R.create("M60");
		MAM_UNIT_R S1_M61 = MAM_UNIT_R.create("M61");
		MAM_UNIT_R S1_M62 = MAM_UNIT_R.create("M62");
		MAM_TAX_R S1_M63 = MAM_TAX_R.create("M63");
		MAM_BIZ_RSN_R S1_M64 = MAM_BIZ_RSN_R.create("M64");
		MAM_DPT_R S1_M65 = MAM_DPT_R.create("M65");
		MAM_BIZ_RSN_R S1_M66 = MAM_BIZ_RSN_R.create("M66");
		MAM_DPT_R S1_M67 = MAM_DPT_R.create("M67");
		MAM_USR_R S1_M68 = MAM_USR_R.create("M68");
		MAM_DPT_R S1_M69 = MAM_DPT_R.create("M69");
		MAVM_ITM_UNIT_R S1_M70 = MAVM_ITM_UNIT_R.create("M70");
		MAVM_ITM_UNIT_R S1_M71 = MAVM_ITM_UNIT_R.create("M71");
		MAM_LG_GRP_R S1_M72 = MAM_LG_GRP_R.create("M72");
		MAM_ITM_LG_GRP_R S1_M73 = MAM_ITM_LG_GRP_R.create("M73");
		MAM_LOC_R S1_M74 = MAM_LOC_R.create("M74");
		MST_SHIP_INST_R S6 = MST_SHIP_INST_R.create();
		MST_IV_MAP_R S7_IVMAP = MST_IV_MAP_R.create("IVMAP2");
		MST_SHIP_SCHD_R S7_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD2");
		MST_IV_MAP_R S8_IVMAP = MST_IV_MAP_R.create("IVMAP2");
		MST_SHIP_SCHD_R S8_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD2");
		MAM_LG_GRP_R S8_LGGRP = MAM_LG_GRP_R.create("LGGRP2");
		
		MCDynamicSQLID DS0C_DLV_ID_GRP = createDynamicSQLID("DS0C_DLV_ID_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SHIP_RQST_ID_GRP = createDynamicSQLID("DS0C_SHIP_RQST_ID_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1770_MST_IV_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						cases()
							.when(S0_V1.pr(S1_T2.sundry_itm_flg).eq(value(true)))
								.then(S0_V1.pr("sundry_iv_itm_nm"))
							.otherwise(
								nvl(
									S0_M01.itm_nm,
									S0_V1.pr("itm_nm")
								)
							).as("iv_itm_nm"),
						addDynamicSelect(DS0C_DLV_ID_GRP),
						addDynamicSelect(DS0C_SHIP_RQST_ID_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_T1.pl_skip_flg,
							S1_T1.cmpl_flg.as("ex_im_comp_flg"),
							S1_T1.non_cmpl_flg,
							S1_T1.iv_ship_flg,
							S1_T1.iv_prnt_flg,
							S1_T1.pl_prnt_flg,
							S1_T1.iv_no,
							S1_T1.iv_mng_no,
							S1_T1.iv_rev,
							S1_T1.cmpl_schd_dt,
							S1_T1.trd_schd_dt,
							S1_T1.cmpl_dt,
							S1_T1.iv_dt,
							S1_T1.dlv_id_typ,
							nullValue().as("dlv_id_typ_nm"),
							S1_T1.dlv_id_cd,
							cases()
								.when(S1_T1.dlv_sundry_flg.eq(value(true)))
									.then(S1_T1.dlv_id_nm)
								.otherwise(
									cases()
										.when(S1_T1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
											.then(S1_M2.loc_nm)
										.otherwise(S1_M1.bp_nm)
								).as("dlv_id_nm"),
							S1_T1.dlv_sundry_flg,
							S1_T1.dlv_cntry_cd,
							S1_M3.cntry_nm.as("dlv_cntry_nm"),
							S1_T1.dlv_zip_cd,
							S1_T1.dlv_addr1,
							S1_T1.dlv_addr2,
							S1_T1.dlv_addr3,
							S1_T1.dlv_addr4,
							S1_T1.dlv_tel,
							S1_T1.dlv_fax,
							S1_T1.dlv_cntct_dpt,
							S1_T1.dlv_cntct_psn,
							S1_T1.ship_rqst_id_typ,
							nullValue().as("ship_rqst_id_typ_nm"),
							S1_T1.ship_rqst_id_cd,
							cases()
								.when(S1_T1.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
									.then(S1_M5.loc_nm)
								.otherwise(S1_M4.bp_nm).as("ship_rqst_id_nm"),
							S1_T1.via_dlv_typ,
							nullValue().as("via_dlv_typ_nm"),
							S1_T1.tdlv_cd,
							nvl(
								S1_T1.tdlv_nm,
								S1_M6.bp_nm
							).as("tdlv_nm"),
							S1_T1.tdlv_sundry_flg,
							S1_T1.tdlv_lg_grp_cd,
							S1_M7.lg_grp_nm.as("tdlv_lg_grp_nm"),
							S1_T1.tdlv_zip_cd,
							S1_T1.tdlv_addr1,
							S1_T1.tdlv_addr2,
							S1_T1.tdlv_addr3,
							S1_T1.tdlv_addr4,
							S1_T1.tdlv_tel,
							S1_T1.tdlv_fax,
							S1_T1.tdlv_cntct_dpt,
							S1_T1.tdlv_cntct_psn,
							S1_T1.trnspt_cd,
							S1_M8.trnspt_nm,
							S1_T1.vssl_flght,
							S1_T1.load_port_cd,
							S1_M9.port_nm.as("load_port_nm"),
							S1_T1.etd_dt,
							S1_T1.dschrg_port_cd,
							S1_M10.port_nm.as("dschrg_port_nm"),
							S1_T1.eta_dt,
							S1_T1.via_port_cd,
							S1_M11.port_nm.as("via_port_nm"),
							S1_T1.via_schd_dt,
							S1_T1.tterm_cd1,
							S1_M12.tterm_nm.as("tterm_nm1"),
							S1_T1.tterm_rmrks1,
							S1_T1.tterm_cd2,
							S1_M13.tterm_nm.as("tterm_nm2"),
							S1_T1.tterm_rmrks2,
							S1_T1.trd_cur_cd,
							S1_M15.cur_nm.as("trd_cur_nm"),
							S1_M15.amt_dec_place.as("trd_cur_amt_dec_place"),
							S1_M15.upri_dec_place.as("trd_cur_upri_dec_place"),
							S1_T1.ptax_cur_cd,
							S1_M16.cur_nm.as("ptax_cur_nm"),
							S1_M16.amt_dec_place.as("ptax_cur_amt_dec_place"),
							S1_T1.xrate_inpt_flg,
							S1_T1.xrate,
							S1_T1.ptax_xrate_inpt_flg,
							S1_T1.ptax_xrate,
							S1_T1.ttl_trd_cur_amt,
							S1_T1.ttl_net_wt,
							S1_T1.ttl_grss_wt,
							S1_T1.ttl_dim,
							S1_T1.tterm_cd3,
							S1_M14.tterm_nm.as("tterm_nm3"),
							S1_T1.tterm_rmrks3,
							S1_T1.bill_basis_dt,
							S1_T1.rcv_schd_dt,
							S1_T1.pl_rmrks,
							S1_T1.case_mrk1,
							S1_T1.case_mrk2,
							S1_T1.case_mrk3,
							S1_T1.case_mrk4,
							S1_T1.case_mrk5,
							S1_T1.case_mrk6,
							S1_T1.lc_no,
							S1_T1.lc_dt,
							S1_T1.lc_rmrks,
							S1_T1.bl_no,
							S1_T1.bl_dt,
							S1_T1.bl_rmrks,
							S1_T1.iv_rmrks,
							S1_T1.pl_reg_flg,
							S1_T1.rcpt_iv_no,
							S1_T1.pre_rcpt_iv_flg,
							decode(
								S1_T1.pre_rcpt_iv_flg,
								value(true),
								value(false),
								value(true)
							).as("iv_reg_flg"),
							S1_T1.rcpt_iv_mng_no,
							S1_T1.intr_rmrks.as("iv_intr_rmrks"),
							S1_T1.sub_char1.as("iv_sub_char1"),
							S1_T1.sub_char2.as("iv_sub_char2"),
							S1_T1.sub_char3.as("iv_sub_char3"),
							nvl2(
								S1_T11.iv_mng_no,
								value(false),
								value(true)
							).as("can_flg"),
							S1_T2.trd_cd,
							S1_M17.trd_nm,
							S1_T2.iv_d_no,
							S1_T2.purc_schd_no,
							S1_T2.slo_no,
							nvl(
								S1_T2.slo_d_no,
								S1_T2.xfr_schd_no
							).as("ship_rqst_no"),
							S1_T2.cst_po_no,
							S1_T2.cst_po_d_no,
							trunc(
								S1_T2.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S1_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
							S1_T2.bndl_flg,
							S1_M18.itm_typ,
							nullValue().as("itm_typ_nm"),
							S1_M18.itm_typ_d_cd,
							S1_M19.itm_typ_d_nm,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							cases()
								.when(S1_T2.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S1_T2.itm_nm,
											S1_M20.itm_nm
										)
								)
								.otherwise(S1_M18.itm_nm).as("itm_nm"),
							nvl(
								S1_T2.iv_itm_nm,
								S1_M20.itm_nm
							).as("sundry_iv_itm_nm"),
							cases()
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S1_M1.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S1_M2.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S1_M2.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S1_M2.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S1_T2.sundry_itm_flg,
							S1_T2.cntry_org_cd,
							S1_M22.cntry_nm.as("cntry_org_nm"),
							S1_T2.sno1,
							S1_T2.sno2,
							S1_T2.sno3,
							S1_T2.sno4,
							S1_T5.wrk_no,
							S1_T6.wrk_nm,
							S1_M18.sno1_mng_typ,
							S1_M18.sno2_mng_typ,
							S1_M18.sno3_mng_typ,
							S1_M18.sno4_mng_typ,
							S1_T2.cst_itm_cd,
							S1_T2.cst_itm_nm,
							S1_T2.gd_cd,
							S1_M23.gd_nm,
							nullValue().as("ttl_iv_amt"),
							nullValue().as("ttl_ncv_amt"),
							nullValue().as("ttl_base_amt"),
							nullValue().as("ttl_freight_amt"),
							nullValue().as("ttl_insurance_amt"),
							nullValue().as("ttl_oth_amt"),
							S1_M18.dscnt_itm_flg,
							S1_M18.exim_xpns_typ,
							S1_T2.trd_unit_cd,
							S1_M24.unit_nm.as("trd_unit_nm"),
							S1_M33.dec_place.as("trd_unit_dec_place"),
							S1_T2.trd_unit_qty,
							S1_T2.base_unit_cd,
							S1_M25.unit_nm.as("base_unit_nm"),
							S1_M34.dec_place.as("base_unit_dec_place"),
							S1_T2.base_unit_qty,
							S1_T2.trd_cur_upri,
							S1_T2.trd_cur_amt,
							S1_T2.trd_cur_tax_amt,
							S1_T2.trd_cur_amt.add(S1_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
							S1_T2.tax_cd,
							S1_M26.tax_nm,
							S1_M26.tax_rate,
							S1_M26.tax_typ,
							nullValue().as("tax_typ_nm"),
							S1_T2.trd_cur_dscnt_amt,
							S1_T2.dscnt_rsn_cd,
							S1_M29.biz_rsn_nm.as("dscnt_rsn_nm"),
							S1_T2.ptax_cur_amt,
							S1_T2.wtax_rate,
							S1_T2.wtax_amt,
							S1_T2.iv_upri,
							S1_T2.iv_amt,
							S1_T2.rsn_cd,
							S1_M27.biz_rsn_nm.as("rsn_nm"),
							S1_T2.bd_dpt_cd,
							S1_M28.dpt_nm.as("bd_dpt_nm"),
							S1_T2.sls_dpt_cd,
							S1_M30.dpt_nm.as("sls_dpt_nm"),
							S1_T2.sls_usr_cd,
							S1_M31.usr_nm.as("sls_usr_nm"),
							S1_T2.manual_add_flg,
							S1_T2.ar_dpt_cd,
							S1_M32.dpt_nm.as("ar_dpt_nm"),
							S1_T2.iv_d_rmrks,
							S1_T2.intr_d_rmrks.as("iv_d_intr_rmrks"),
							S1_T2.sub_char1.as("iv_d_sub_char1"),
							S1_T2.sub_char2.as("iv_d_sub_char2"),
							S1_T2.sub_char3.as("iv_d_sub_char3"),
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							nullValue().as("ins_func_nm"),
							S1_T1.upd_cntr,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no,
							nullValue().as("upd_func_nm"),
							S1_T4.purc_cmpl_flg,
							S1_T1.trd_ptn_typ,
							S1_M30.wg_cd.as("sls_dpt_wg_cd"),
							S1_M35.wg_cd.as("lg_grp_wg_cd"),
							coalesce(
								S1_T9.gi_loc_cd,
								S1_M36.lg_def_loc_cd,
								S1_M37.loc_cd
							).as("chk_gi_loc_cd"),
							nvl2(
								S1_T10.slo_d_no,
								S1_T10.sls_cststk_flg,
								value(false)
							).as("sls_cststk_flg")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								S1_T1.iv_mng_no.eq(S1_T2.iv_mng_no)
								.and(S1_T1.iv_rev.eq(S1_T2.iv_rev))
							)
							.leftOuterJoin(S1_T4).on(S1_T1.rcpt_iv_mng_no.eq(S1_T4.rcpt_iv_mng_no))
							.leftOuterJoin(S1_T5).on(S1_T2.sno1.eq(S1_T5.sno1))
							.leftOuterJoin(S1_T6).on(S1_T5.wrk_no.eq(S1_T6.wrk_no))
							.leftOuterJoin(
								subQuery()
								.select(S2.iv_no)
								.from(S2)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S2.ship_inst_no.like(bind("ship_inst_no")))
									.and(S2.can_flg.eq(value(false)))
								).view(S1_T7)
							).on(S1_T1.iv_no.eq(S1_T7.pr(S2.iv_no)))
							.leftOuterJoin(S1_T8).on(S1_T2.slo_no.eq(S1_T8.slo_no))
							.leftOuterJoin(S1_T9).on(S1_T2.xfr_schd_no.eq(S1_T9.xfr_schd_no))
							.leftOuterJoin(S1_T10).on(S1_T2.slo_d_no.eq(S1_T10.slo_d_no))
							.leftOuterJoin(S1_T11).on(S1_T1.iv_mng_no.eq(S1_T11.iv_mng_no))
							.leftOuterJoin(S1_M1).on(S1_T1.dlv_id_cd.eq(S1_M1.bp_cd))
							.leftOuterJoin(S1_M2).on(S1_T1.dlv_id_cd.eq(S1_M2.loc_cd))
							.leftOuterJoin(S1_M3).on(S1_T1.dlv_cntry_cd.eq(S1_M3.cntry_cd))
							.leftOuterJoin(S1_M4).on(S1_T1.ship_rqst_id_cd.eq(S1_M4.bp_cd))
							.leftOuterJoin(S1_M5).on(S1_T1.ship_rqst_id_cd.eq(S1_M5.loc_cd))
							.leftOuterJoin(S1_M6).on(S1_T1.tdlv_cd.eq(S1_M6.bp_cd))
							.leftOuterJoin(S1_M7).on(S1_T1.tdlv_lg_grp_cd.eq(S1_M7.lg_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_T1.trnspt_cd.eq(S1_M8.trnspt_cd))
							.leftOuterJoin(S1_M9).on(S1_T1.load_port_cd.eq(S1_M9.port_cd))
							.leftOuterJoin(S1_M10).on(S1_T1.dschrg_port_cd.eq(S1_M10.port_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.via_port_cd.eq(S1_M11.port_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.tterm_cd1.eq(S1_M12.tterm_cd))
							.leftOuterJoin(S1_M13).on(S1_T1.tterm_cd2.eq(S1_M13.tterm_cd))
							.leftOuterJoin(S1_M14).on(S1_T1.tterm_cd3.eq(S1_M14.tterm_cd))
							.leftOuterJoin(S1_M15).on(S1_T1.trd_cur_cd.eq(S1_M15.cur_cd))
							.leftOuterJoin(S1_M16).on(S1_T1.ptax_cur_cd.eq(S1_M16.cur_cd))
							.leftOuterJoin(S1_M17).on(S1_T2.trd_cd.eq(S1_M17.trd_cd))
							.leftOuterJoin(S1_M18).on(
								S1_T2.itm_cd.eq(S1_M18.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_M18.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_M18.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_M18.itm_sub3))
							)
							.leftOuterJoin(S1_M19).on(
								S1_M18.itm_typ.eq(S1_M19.itm_typ)
								.and(S1_M18.itm_typ_d_cd.eq(S1_M19.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M20).on(
								S1_T2.itm_cd.eq(S1_M20.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_M20.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_M20.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_M20.itm_sub3))
								.and(S1_T2.sno1.eq(S1_M20.sno1))
								.and(S1_T2.sno2.eq(S1_M20.sno2))
								.and(S1_T2.sno3.eq(S1_M20.sno3))
								.and(S1_T2.sno4.eq(S1_M20.sno4))
							)
							.leftOuterJoin(S1_M21).on(S1_M2.sppl_cd.eq(S1_M21.bp_cd))
							.leftOuterJoin(S1_M22).on(S1_T2.cntry_org_cd.eq(S1_M22.cntry_cd))
							.leftOuterJoin(S1_M23).on(S1_T2.gd_cd.eq(S1_M23.gd_cd))
							.leftOuterJoin(S1_M24).on(S1_T2.trd_unit_cd.eq(S1_M24.unit_cd))
							.leftOuterJoin(S1_M25).on(S1_T2.base_unit_cd.eq(S1_M25.unit_cd))
							.leftOuterJoin(S1_M26).on(S1_T2.tax_cd.eq(S1_M26.tax_cd))
							.leftOuterJoin(S1_M27).on(S1_T2.rsn_cd.eq(S1_M27.biz_rsn_cd))
							.leftOuterJoin(S1_M28).on(
								S1_T2.bd_dpt_cd.eq(S1_M28.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T9.rcpt_dt,
										S1_T1.iv_dt
									).between(S1_M28.st_dt, S1_M28.end_dt)
								)
							)
							.leftOuterJoin(S1_M29).on(S1_T2.dscnt_rsn_cd.eq(S1_M29.biz_rsn_cd))
							.leftOuterJoin(S1_M30).on(
								S1_T2.sls_dpt_cd.eq(S1_M30.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T1.iv_dt
									).between(S1_M30.st_dt, S1_M30.end_dt)
								)
							)
							.leftOuterJoin(S1_M31).on(S1_T2.sls_usr_cd.eq(S1_M31.usr_cd))
							.leftOuterJoin(S1_M32).on(
								S1_T2.ar_dpt_cd.eq(S1_M32.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T1.iv_dt
									).between(S1_M32.st_dt, S1_M32.end_dt)
								)
							)
							.leftOuterJoin(S1_M33).on(
								S1_T2.itm_cd.eq(S1_M33.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_M33.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_M33.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_M33.itm_sub3))
								.and(S1_T2.trd_unit_cd.eq(S1_M33.unit_cd))
							)
							.leftOuterJoin(S1_M34).on(
								S1_T2.itm_cd.eq(S1_M34.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_M34.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_M34.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_M34.itm_sub3))
								.and(S1_T2.base_unit_cd.eq(S1_M34.unit_cd))
							)
							.leftOuterJoin(S1_M35).on(S1_T9.gi_lg_grp_cd.eq(S1_M35.lg_grp_cd))
							.leftOuterJoin(S1_M36).on(
								S1_T9.itm_cd.eq(S1_M36.itm_cd)
								.and(S1_T9.itm_sub1.eq(S1_M36.itm_sub1))
								.and(S1_T9.itm_sub2.eq(S1_M36.itm_sub2))
								.and(S1_T9.itm_sub3.eq(S1_M36.itm_sub3))
								.and(S1_T9.gi_lg_grp_cd.eq(S1_M36.lg_grp_cd))
							)
							.leftOuterJoin(S1_M37).on(
								S1_T9.gi_lg_grp_cd.eq(S1_M37.lg_grp_cd)
								.and(S1_M37.lg_def_flg.eq(value(true)))
								.and(S1_M37.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.cmpl_flg.eq(bind("cmpl_flg_str")))
							.cutoff$and(S1_T4.purc_cmpl_flg.eq(bind("purc_cmpl_flg_str")))
							.and(S1_T1.pre_rcpt_iv_flg.eq(value(false)))
							.cutoff$and(bind("pre_rcpt_iv_flg_str").eq(value(false)))
							.cutoff$and(
								bind("pl_ptn1").eq(value(true))
								.and(S1_T1.pl_reg_flg.eq(value(false)))
								.and(S1_T1.pl_skip_flg.eq(value(false)))
							)
							.cutoff$and(
								bind("pl_ptn2").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(false))
									.or(S1_T1.pl_reg_flg.eq(value(true)))
								)
								.and(S1_T1.pl_skip_flg.eq(value(false)))
							)
							.cutoff$and(
								bind("pl_ptn3").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(false))
									.or(S1_T1.pl_skip_flg.eq(value(true)))
								)
							)
							.cutoff$and(
								bind("pl_ptn4").eq(value(true))
								.and(S1_T1.pl_reg_flg.eq(value(true)))
							)
							.cutoff$and(
								bind("pl_ptn5").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(true))
									.or(S1_T1.pl_skip_flg.eq(value(true)))
								)
							)
							.cutoff$and(
								bind("pl_ptn6").eq(value(true))
								.and(S1_T1.pl_skip_flg.eq(value(true)))
							)
							.cutoff$and(S1_T1.iv_prnt_flg.eq(bind("iv_prnt_flg_str")))
							.cutoff$and(S1_T1.pl_prnt_flg.eq(bind("pl_prnt_flg_str")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T1.cmpl_schd_dt.gte(bind("cmpl_schd_dt_fr")))
							.cutoff$and(S1_T1.cmpl_schd_dt.lte(bind("cmpl_schd_dt_to")))
							.cutoff$and(S1_T1.cmpl_dt.gte(bind("cmpl_dt_fr")))
							.cutoff$and(S1_T1.cmpl_dt.lte(bind("cmpl_dt_to")))
							.cutoff$and(S1_T1.iv_dt.gte(bind("iv_dt_fr")))
							.cutoff$and(S1_T1.iv_dt.lte(bind("iv_dt_to")))
							.cutoff$and(S1_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
							.cutoff$and(S1_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
							.cutoff$and(S1_T1.tdlv_cd.like(bind("tdlv_cd")))
							.cutoff$and(S1_T1.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(S1_T1.dlv_id_cd.like(bind("dlv_id_cd")))
							.cutoff$and(S1_T1.ship_rqst_id_typ.like(bind("ship_rqst_id_typ")))
							.cutoff$and(S1_T1.ship_rqst_id_cd.like(bind("ship_rqst_id_cd")))
							.cutoff$and(S1_T2.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T2.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_T2.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.and(
								bind("ship_inst_no").isNull()
								.or(
									bind("ship_inst_no").isNotNull()
									.and(S1_T7.pr(S2.iv_no).isNotNull())
								)
							)
							.cutoff$and(S1_T2.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_M17.trd_nm.like(bind("trd_nm")))
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S3_IVMAP
										.innerJoin(S3_SHIPSCHD).on(S3_SHIPSCHD.ship_schd_no.eq(S3_IVMAP.ship_schd_no))
									)
									.where(
										S3_IVMAP.iv_d_no.eq(S1_T2.iv_d_no)
										.and(S3_SHIPSCHD.ship_fr_lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_IVMAP
										.innerJoin(S4_SHIPSCHD).on(S4_SHIPSCHD.ship_schd_no.eq(S4_IVMAP.ship_schd_no))
										.innerJoin(S4_LGGRP).on(S4_LGGRP.lg_grp_cd.eq(S4_SHIPSCHD.ship_fr_lg_grp_cd))
									)
									.where(
										S4_IVMAP.iv_d_no.eq(S1_T2.iv_d_no)
										.and(S4_LGGRP.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
									)
								)
							)
							.cutoff$and(S1_T2.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_M31.usr_nm.like(bind("sls_usr_nm")))
							.cutoff$and(S1_T2.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_M30.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(S1_M18.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M18.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T2.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T2.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T2.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T2.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S1_T2.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S1_T1.iv_rmrks.like(bind("iv_rmrks")))
							.cutoff$and(S1_T2.iv_d_rmrks.like(bind("iv_d_rmrks")))
							.cutoff$and(S1_T1.pl_rmrks.like(bind("pl_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("iv_intr_rmrks")))
							.cutoff$and(S1_T2.intr_d_rmrks.like(bind("iv_d_intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("iv_sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("iv_sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("iv_sub_char3")))
							.cutoff$and(S1_T2.sub_char1.like(bind("iv_d_sub_char1")))
							.cutoff$and(S1_T2.sub_char2.like(bind("iv_d_sub_char2")))
							.cutoff$and(S1_T2.sub_char3.like(bind("iv_d_sub_char3")))
							.cutoff$and(
								S1_T10.sls_cststk_flg.eq(bind("sls_cststk_flg_str"))
								.or(
									bind("sls_cststk_flg_str").eq(value(false))
									.and(S1_T10.slo_d_no.isNull())
								)
							)
							.cutoff$and(
								bind("inc_can_flg_str").eq(value(false))
								.and(S1_T11.iv_mng_no.isNotNull())
							)
							.cutoff$and(
								bind("inc_past_flg_str").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S5_IVP)
										.where(
											S5_IVP.iv_mng_no.eq(S1_T1.iv_mng_no)
											.and(S5_IVP.iv_rev.gt(S1_T1.iv_rev))
										)
									)
								)
							)
						).unionAll(
							subQuery()
							.select(
								S1_T12.pl_skip_flg,
								S1_T12.cmpl_flg.as("ex_im_comp_flg"),
								S1_T12.non_cmpl_flg,
								S1_T12.iv_ship_flg,
								S1_T12.iv_prnt_flg,
								S1_T12.pl_prnt_flg,
								S1_T12.iv_no,
								S1_T12.iv_mng_no,
								nullValue().as("iv_rev"),
								S1_T12.cmpl_schd_dt,
								S1_T12.trd_schd_dt,
								S1_T12.cmpl_dt,
								S1_T12.iv_dt,
								S1_T12.dlv_id_typ,
								nullValue().as("dlv_id_typ_nm"),
								S1_T12.dlv_id_cd,
								cases()
									.when(S1_T12.dlv_sundry_flg.eq(value(true)))
										.then(S1_T12.dlv_id_nm)
									.otherwise(
										cases()
											.when(S1_T12.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
												.then(S1_M39.loc_nm)
											.otherwise(S1_M38.bp_nm)
									).as("dlv_id_nm"),
								S1_T12.dlv_sundry_flg,
								S1_T12.dlv_cntry_cd,
								S1_M40.cntry_nm.as("dlv_cntry_nm"),
								S1_T12.dlv_zip_cd,
								S1_T12.dlv_addr1,
								S1_T12.dlv_addr2,
								S1_T12.dlv_addr3,
								S1_T12.dlv_addr4,
								S1_T12.dlv_tel,
								S1_T12.dlv_fax,
								S1_T12.dlv_cntct_dpt,
								S1_T12.dlv_cntct_psn,
								S1_T12.ship_rqst_id_typ,
								nullValue().as("ship_rqst_id_typ_nm"),
								S1_T12.ship_rqst_id_cd,
								cases()
									.when(S1_T12.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
										.then(S1_M42.loc_nm)
									.otherwise(S1_M41.bp_nm).as("ship_rqst_id_nm"),
								S1_T12.via_dlv_typ,
								nullValue().as("via_dlv_typ_nm"),
								S1_T12.tdlv_cd,
								nvl(
									S1_T12.tdlv_nm,
									S1_M43.bp_nm
								).as("tdlv_nm"),
								S1_T12.tdlv_sundry_flg,
								S1_T12.tdlv_lg_grp_cd,
								S1_M44.lg_grp_nm.as("tdlv_lg_grp_nm"),
								S1_T12.tdlv_zip_cd,
								S1_T12.tdlv_addr1,
								S1_T12.tdlv_addr2,
								S1_T12.tdlv_addr3,
								S1_T12.tdlv_addr4,
								S1_T12.tdlv_tel,
								S1_T12.tdlv_fax,
								S1_T12.tdlv_cntct_dpt,
								S1_T12.tdlv_cntct_psn,
								S1_T12.trnspt_cd,
								S1_M45.trnspt_nm,
								S1_T12.vssl_flght,
								S1_T12.load_port_cd,
								S1_M46.port_nm.as("load_port_nm"),
								S1_T12.etd_dt,
								S1_T12.dschrg_port_cd,
								S1_M47.port_nm.as("dschrg_port_nm"),
								S1_T12.eta_dt,
								S1_T12.via_port_cd,
								S1_M48.port_nm.as("via_port_nm"),
								S1_T12.via_schd_dt,
								S1_T12.tterm_cd1,
								S1_M49.tterm_nm.as("tterm_nm1"),
								S1_T12.tterm_rmrks1,
								S1_T12.tterm_cd2,
								S1_M50.tterm_nm.as("tterm_nm2"),
								S1_T12.tterm_rmrks2,
								S1_T12.trd_cur_cd,
								S1_M52.cur_nm.as("trd_cur_nm"),
								S1_M52.amt_dec_place.as("trd_cur_amt_dec_place"),
								S1_M52.upri_dec_place.as("trd_cur_upri_dec_place"),
								S1_T12.ptax_cur_cd,
								S1_M53.cur_nm.as("ptax_cur_nm"),
								S1_M53.amt_dec_place.as("ptax_cur_amt_dec_place"),
								S1_T12.xrate_inpt_flg,
								S1_T12.xrate,
								S1_T12.ptax_xrate_inpt_flg,
								S1_T12.ptax_xrate,
								S1_T12.ttl_trd_cur_amt,
								S1_T12.ttl_net_wt,
								S1_T12.ttl_grss_wt,
								S1_T12.ttl_dim,
								S1_T12.tterm_cd3,
								S1_M51.tterm_nm.as("tterm_nm3"),
								S1_T12.tterm_rmrks3,
								S1_T12.bill_basis_dt,
								S1_T12.rcv_schd_dt,
								S1_T12.pl_rmrks,
								S1_T12.case_mrk1,
								S1_T12.case_mrk2,
								S1_T12.case_mrk3,
								S1_T12.case_mrk4,
								S1_T12.case_mrk5,
								S1_T12.case_mrk6,
								S1_T12.lc_no,
								S1_T12.lc_dt,
								S1_T12.lc_rmrks,
								S1_T12.bl_no,
								S1_T12.bl_dt,
								S1_T12.bl_rmrks,
								S1_T12.iv_rmrks,
								S1_T12.pl_reg_flg,
								S1_T12.rcpt_iv_no,
								S1_T12.pre_rcpt_iv_flg,
								decode(
									S1_T12.pre_rcpt_iv_flg,
									value(true),
									value(false),
									value(true)
								).as("iv_reg_flg"),
								S1_T12.rcpt_iv_mng_no,
								S1_T12.intr_rmrks.as("iv_intr_rmrks"),
								S1_T12.sub_char1.as("iv_sub_char1"),
								S1_T12.sub_char2.as("iv_sub_char2"),
								S1_T12.sub_char3.as("iv_sub_char3"),
								value(false).as("can_flg"),
								S1_T13.trd_cd,
								S1_M54.trd_nm,
								S1_T13.iv_d_no,
								S1_T13.purc_schd_no,
								S1_T13.slo_no,
								nvl(
									S1_T13.slo_d_no,
									S1_T13.xfr_schd_no
								).as("ship_rqst_no"),
								S1_T13.cst_po_no,
								S1_T13.cst_po_d_no,
								trunc(
									S1_T13.dlv_rqst_tm,
									MCDateFmt.DD
								).as("dlv_rqst_dt"),
								S1_T13.dlv_rqst_tm.as("dlv_rqst_hm"),
								S1_T13.bndl_flg,
								S1_M55.itm_typ,
								nullValue().as("itm_typ_nm"),
								S1_M55.itm_typ_d_cd,
								S1_M56.itm_typ_d_nm,
								S1_T13.itm_cd,
								S1_T13.itm_sub1,
								S1_T13.itm_sub2,
								S1_T13.itm_sub3,
								cases()
									.when(S1_T13.sundry_itm_flg.eq(value(true)))
										.then(
											nvl(
												S1_T13.itm_nm,
												S1_M57.itm_nm
											)
									)
									.otherwise(S1_M55.itm_nm).as("itm_nm"),
								nvl(
									S1_T13.iv_itm_nm,
									S1_M57.itm_nm
								).as("sundry_iv_itm_nm"),
								cases()
									.when(S1_T12.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
										.then(S1_M38.prnt_lcl_cd)
									.when(S1_T12.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
										.then(S1_M39.prnt_lcl_cd)
									.when(S1_T12.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
										.then(S1_M39.prnt_lcl_cd)
									.when(S1_T12.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
										.then(S1_M39.prnt_lcl_cd)
									.otherwise(nullValue()).as("prnt_lcl_cd"),
								S1_T13.sundry_itm_flg,
								S1_T13.cntry_org_cd,
								S1_M59.cntry_nm.as("cntry_org_nm"),
								S1_T13.sno1,
								S1_T13.sno2,
								S1_T13.sno3,
								S1_T13.sno4,
								S1_T15.wrk_no,
								S1_T16.wrk_nm,
								S1_M55.sno1_mng_typ,
								S1_M55.sno2_mng_typ,
								S1_M55.sno3_mng_typ,
								S1_M55.sno4_mng_typ,
								S1_T13.cst_itm_cd,
								S1_T13.cst_itm_nm,
								S1_T13.gd_cd,
								S1_M60.gd_nm,
								nullValue().as("ttl_iv_amt"),
								nullValue().as("ttl_ncv_amt"),
								nullValue().as("ttl_base_amt"),
								nullValue().as("ttl_freight_amt"),
								nullValue().as("ttl_insurance_amt"),
								nullValue().as("ttl_oth_amt"),
								S1_M55.dscnt_itm_flg,
								S1_M55.exim_xpns_typ,
								S1_T13.trd_unit_cd,
								S1_M61.unit_nm.as("trd_unit_nm"),
								S1_M70.dec_place.as("trd_unit_dec_place"),
								S1_T13.trd_unit_qty,
								S1_T13.base_unit_cd,
								S1_M62.unit_nm.as("base_unit_nm"),
								S1_M71.dec_place.as("base_unit_dec_place"),
								S1_T13.base_unit_qty,
								S1_T13.trd_cur_upri,
								S1_T13.trd_cur_amt,
								S1_T13.trd_cur_tax_amt,
								S1_T13.trd_cur_amt.add(S1_T13.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
								S1_T13.tax_cd,
								S1_M63.tax_nm,
								S1_M63.tax_rate,
								S1_M63.tax_typ,
								nullValue().as("tax_typ_nm"),
								S1_T13.trd_cur_dscnt_amt,
								S1_T13.dscnt_rsn_cd,
								S1_M66.biz_rsn_nm.as("dscnt_rsn_nm"),
								S1_T13.ptax_cur_amt,
								S1_T13.wtax_rate,
								S1_T13.wtax_amt,
								S1_T13.iv_upri,
								S1_T13.iv_amt,
								S1_T13.rsn_cd,
								S1_M64.biz_rsn_nm.as("rsn_nm"),
								S1_T13.bd_dpt_cd,
								S1_M65.dpt_nm.as("bd_dpt_nm"),
								S1_T13.sls_dpt_cd,
								S1_M67.dpt_nm.as("sls_dpt_nm"),
								S1_T13.sls_usr_cd,
								S1_M68.usr_nm.as("sls_usr_nm"),
								S1_T13.manual_add_flg,
								S1_T13.ar_dpt_cd,
								S1_M69.dpt_nm.as("ar_dpt_nm"),
								S1_T13.iv_d_rmrks,
								S1_T13.intr_d_rmrks.as("iv_d_intr_rmrks"),
								S1_T13.sub_char1.as("iv_d_sub_char1"),
								S1_T13.sub_char2.as("iv_d_sub_char2"),
								S1_T13.sub_char3.as("iv_d_sub_char3"),
								S1_T12.ins_usr_id,
								S1_T12.ins_usr_nm,
								S1_T12.ins_ts,
								S1_T12.ins_func_id,
								nullValue().as("ins_func_nm"),
								S1_T12.upd_cntr,
								S1_T12.upd_usr_id,
								S1_T12.upd_usr_nm,
								S1_T12.upd_ts,
								S1_T12.upd_func_id,
								S1_T12.upd_srv_req_no,
								nullValue().as("upd_func_nm"),
								S1_T14.purc_cmpl_flg,
								S1_T12.trd_ptn_typ,
								S1_M67.wg_cd.as("sls_dpt_wg_cd"),
								S1_M72.wg_cd.as("lg_grp_wg_cd"),
								coalesce(
									S1_T19.gi_loc_cd,
									S1_M73.lg_def_loc_cd,
									S1_M74.loc_cd
								).as("chk_gi_loc_cd"),
								nvl2(
									S1_T20.slo_d_no,
									S1_T20.sls_cststk_flg,
									value(false)
								).as("sls_cststk_flg")
							)
							.from(
								S1_T12
								.innerJoin(S1_T13).on(
									S1_T12.iv_mng_no.eq(S1_T13.iv_mng_no)
									.and(S1_T12.iv_rev.eq(S1_T13.iv_rev))
								)
								.leftOuterJoin(S1_T14).on(S1_T12.rcpt_iv_mng_no.eq(S1_T14.rcpt_iv_mng_no))
								.leftOuterJoin(S1_T15).on(S1_T13.sno1.eq(S1_T15.sno1))
								.leftOuterJoin(S1_T16).on(S1_T15.wrk_no.eq(S1_T16.wrk_no))
								.leftOuterJoin(
									subQuery()
									.select(S6.iv_no)
									.from(S6)
									.where(
										value(0).eq(value(0))
										.cutoff$and(S6.ship_inst_no.like(bind("ship_inst_no")))
										.and(S6.can_flg.eq(value(false)))
									).view(S1_T17)
								).on(S1_T12.iv_no.eq(S1_T17.pr(S6.iv_no)))
								.leftOuterJoin(S1_T18).on(S1_T13.slo_no.eq(S1_T18.slo_no))
								.leftOuterJoin(S1_T19).on(S1_T13.xfr_schd_no.eq(S1_T19.xfr_schd_no))
								.leftOuterJoin(S1_T20).on(S1_T13.slo_d_no.eq(S1_T20.slo_d_no))
								.leftOuterJoin(S1_M38).on(S1_T12.dlv_id_cd.eq(S1_M38.bp_cd))
								.leftOuterJoin(S1_M39).on(S1_T12.dlv_id_cd.eq(S1_M39.loc_cd))
								.leftOuterJoin(S1_M40).on(S1_T12.dlv_cntry_cd.eq(S1_M40.cntry_cd))
								.leftOuterJoin(S1_M41).on(S1_T12.ship_rqst_id_cd.eq(S1_M41.bp_cd))
								.leftOuterJoin(S1_M42).on(S1_T12.ship_rqst_id_cd.eq(S1_M42.loc_cd))
								.leftOuterJoin(S1_M43).on(S1_T12.tdlv_cd.eq(S1_M43.bp_cd))
								.leftOuterJoin(S1_M44).on(S1_T12.tdlv_lg_grp_cd.eq(S1_M44.lg_grp_cd))
								.leftOuterJoin(S1_M45).on(S1_T12.trnspt_cd.eq(S1_M45.trnspt_cd))
								.leftOuterJoin(S1_M46).on(S1_T12.load_port_cd.eq(S1_M46.port_cd))
								.leftOuterJoin(S1_M47).on(S1_T12.dschrg_port_cd.eq(S1_M47.port_cd))
								.leftOuterJoin(S1_M48).on(S1_T12.via_port_cd.eq(S1_M48.port_cd))
								.leftOuterJoin(S1_M49).on(S1_T12.tterm_cd1.eq(S1_M49.tterm_cd))
								.leftOuterJoin(S1_M50).on(S1_T12.tterm_cd2.eq(S1_M50.tterm_cd))
								.leftOuterJoin(S1_M51).on(S1_T12.tterm_cd3.eq(S1_M51.tterm_cd))
								.leftOuterJoin(S1_M52).on(S1_T12.trd_cur_cd.eq(S1_M52.cur_cd))
								.leftOuterJoin(S1_M53).on(S1_T12.ptax_cur_cd.eq(S1_M53.cur_cd))
								.leftOuterJoin(S1_M54).on(S1_T13.trd_cd.eq(S1_M54.trd_cd))
								.leftOuterJoin(S1_M55).on(
									S1_T13.itm_cd.eq(S1_M55.itm_cd)
									.and(S1_T13.itm_sub1.eq(S1_M55.itm_sub1))
									.and(S1_T13.itm_sub2.eq(S1_M55.itm_sub2))
									.and(S1_T13.itm_sub3.eq(S1_M55.itm_sub3))
								)
								.leftOuterJoin(S1_M56).on(
									S1_M55.itm_typ.eq(S1_M56.itm_typ)
									.and(S1_M55.itm_typ_d_cd.eq(S1_M56.itm_typ_d_cd))
								)
								.leftOuterJoin(S1_M57).on(
									S1_T13.itm_cd.eq(S1_M57.itm_cd)
									.and(S1_T13.itm_sub1.eq(S1_M57.itm_sub1))
									.and(S1_T13.itm_sub2.eq(S1_M57.itm_sub2))
									.and(S1_T13.itm_sub3.eq(S1_M57.itm_sub3))
									.and(S1_T13.sno1.eq(S1_M57.sno1))
									.and(S1_T13.sno2.eq(S1_M57.sno2))
									.and(S1_T13.sno3.eq(S1_M57.sno3))
									.and(S1_T13.sno4.eq(S1_M57.sno4))
								)
								.leftOuterJoin(S1_M58).on(S1_M39.sppl_cd.eq(S1_M58.bp_cd))
								.leftOuterJoin(S1_M59).on(S1_T13.cntry_org_cd.eq(S1_M59.cntry_cd))
								.leftOuterJoin(S1_M60).on(S1_T13.gd_cd.eq(S1_M60.gd_cd))
								.leftOuterJoin(S1_M61).on(S1_T13.trd_unit_cd.eq(S1_M61.unit_cd))
								.leftOuterJoin(S1_M62).on(S1_T13.base_unit_cd.eq(S1_M62.unit_cd))
								.leftOuterJoin(S1_M63).on(S1_T13.tax_cd.eq(S1_M63.tax_cd))
								.leftOuterJoin(S1_M64).on(S1_T13.rsn_cd.eq(S1_M64.biz_rsn_cd))
								.leftOuterJoin(S1_M65).on(
									S1_T13.bd_dpt_cd.eq(S1_M65.dpt_cd)
									.and(
										coalesce(
											S1_T18.slo_dt,
											S1_T19.rcpt_dt,
											S1_T12.iv_dt
										).between(S1_M65.st_dt, S1_M65.end_dt)
									)
								)
								.leftOuterJoin(S1_M66).on(S1_T13.dscnt_rsn_cd.eq(S1_M66.biz_rsn_cd))
								.leftOuterJoin(S1_M67).on(
									S1_T13.sls_dpt_cd.eq(S1_M67.dpt_cd)
									.and(
										coalesce(
											S1_T18.slo_dt,
											S1_T12.iv_dt
										).between(S1_M67.st_dt, S1_M67.end_dt)
									)
								)
								.leftOuterJoin(S1_M68).on(S1_T13.sls_usr_cd.eq(S1_M68.usr_cd))
								.leftOuterJoin(S1_M69).on(
									S1_T13.ar_dpt_cd.eq(S1_M69.dpt_cd)
									.and(
										coalesce(
											S1_T18.slo_dt,
											S1_T12.iv_dt
										).between(S1_M69.st_dt, S1_M69.end_dt)
									)
								)
								.leftOuterJoin(S1_M70).on(
									S1_T13.itm_cd.eq(S1_M70.itm_cd)
									.and(S1_T13.itm_sub1.eq(S1_M70.itm_sub1))
									.and(S1_T13.itm_sub2.eq(S1_M70.itm_sub2))
									.and(S1_T13.itm_sub3.eq(S1_M70.itm_sub3))
									.and(S1_T13.trd_unit_cd.eq(S1_M70.unit_cd))
								)
								.leftOuterJoin(S1_M71).on(
									S1_T13.itm_cd.eq(S1_M71.itm_cd)
									.and(S1_T13.itm_sub1.eq(S1_M71.itm_sub1))
									.and(S1_T13.itm_sub2.eq(S1_M71.itm_sub2))
									.and(S1_T13.itm_sub3.eq(S1_M71.itm_sub3))
									.and(S1_T13.base_unit_cd.eq(S1_M71.unit_cd))
								)
								.leftOuterJoin(S1_M72).on(S1_T19.gi_lg_grp_cd.eq(S1_M72.lg_grp_cd))
								.leftOuterJoin(S1_M73).on(
									S1_T19.itm_cd.eq(S1_M73.itm_cd)
									.and(S1_T19.itm_sub1.eq(S1_M73.itm_sub1))
									.and(S1_T19.itm_sub2.eq(S1_M73.itm_sub2))
									.and(S1_T19.itm_sub3.eq(S1_M73.itm_sub3))
									.and(S1_T19.gi_lg_grp_cd.eq(S1_M73.lg_grp_cd))
								)
								.leftOuterJoin(S1_M74).on(
									S1_T19.gi_lg_grp_cd.eq(S1_M74.lg_grp_cd)
									.and(S1_M74.lg_def_flg.eq(value(true)))
									.and(S1_M74.del_flg.eq(value(false)))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1_T12.cmpl_flg.eq(bind("cmpl_flg_str")))
								.cutoff$and(S1_T14.purc_cmpl_flg.eq(bind("purc_cmpl_flg_str")))
								.and(S1_T12.pre_rcpt_iv_flg.eq(value(true)))
								.cutoff$and(bind("pre_rcpt_iv_flg_str").eq(value(true)))
								.cutoff$and(
									bind("pl_ptn1").eq(value(true))
									.and(S1_T12.pl_reg_flg.eq(value(false)))
									.and(S1_T12.pl_skip_flg.eq(value(false)))
								)
								.cutoff$and(
									bind("pl_ptn2").eq(value(true))
									.and(
										S1_T12.pl_reg_flg.eq(value(false))
										.or(S1_T12.pl_reg_flg.eq(value(true)))
									)
									.and(S1_T12.pl_skip_flg.eq(value(false)))
								)
								.cutoff$and(
									bind("pl_ptn3").eq(value(true))
									.and(
										S1_T12.pl_reg_flg.eq(value(false))
										.or(S1_T12.pl_skip_flg.eq(value(true)))
									)
								)
								.cutoff$and(
									bind("pl_ptn4").eq(value(true))
									.and(S1_T12.pl_reg_flg.eq(value(true)))
								)
								.cutoff$and(
									bind("pl_ptn5").eq(value(true))
									.and(
										S1_T12.pl_reg_flg.eq(value(true))
										.or(S1_T12.pl_skip_flg.eq(value(true)))
									)
								)
								.cutoff$and(
									bind("pl_ptn6").eq(value(true))
									.and(S1_T12.pl_skip_flg.eq(value(true)))
								)
								.cutoff$and(S1_T12.iv_prnt_flg.eq(bind("iv_prnt_flg_str")))
								.cutoff$and(S1_T12.pl_prnt_flg.eq(bind("pl_prnt_flg_str")))
								.cutoff$and(S1_T12.iv_no.like(bind("iv_no")))
								.cutoff$and(S1_T12.cmpl_schd_dt.gte(bind("cmpl_schd_dt_fr")))
								.cutoff$and(S1_T12.cmpl_schd_dt.lte(bind("cmpl_schd_dt_to")))
								.cutoff$and(S1_T12.cmpl_dt.gte(bind("cmpl_dt_fr")))
								.cutoff$and(S1_T12.cmpl_dt.lte(bind("cmpl_dt_to")))
								.cutoff$and(S1_T12.iv_dt.gte(bind("iv_dt_fr")))
								.cutoff$and(S1_T12.iv_dt.lte(bind("iv_dt_to")))
								.cutoff$and(S1_T13.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
								.cutoff$and(S1_T13.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
								.cutoff$and(S1_T12.tdlv_cd.like(bind("tdlv_cd")))
								.cutoff$and(S1_T12.dlv_id_typ.like(bind("dlv_id_typ")))
								.cutoff$and(S1_T12.dlv_id_cd.like(bind("dlv_id_cd")))
								.cutoff$and(S1_T12.ship_rqst_id_typ.like(bind("ship_rqst_id_typ")))
								.cutoff$and(S1_T12.ship_rqst_id_cd.like(bind("ship_rqst_id_cd")))
								.cutoff$and(S1_T13.slo_no.like(bind("slo_no")))
								.cutoff$and(S1_T13.cst_po_no.like(bind("cst_po_no")))
								.cutoff$and(S1_T13.cst_po_d_no.like(bind("cst_po_d_no")))
								.cutoff$and(S1_T12.rcpt_iv_no.like(bind("rcpt_iv_no")))
								.and(
									bind("ship_inst_no").isNull()
									.or(
										bind("ship_inst_no").isNotNull()
										.and(S1_T17.pr(S6.iv_no).isNotNull())
									)
								)
								.cutoff$and(S1_T13.trd_cd.like(bind("trd_cd")))
								.cutoff$and(S1_M54.trd_nm.like(bind("trd_nm")))
								.cutoff$and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S7_IVMAP
											.innerJoin(S7_SHIPSCHD).on(S7_SHIPSCHD.ship_schd_no.eq(S7_IVMAP.ship_schd_no))
										)
										.where(
											S7_IVMAP.iv_d_no.eq(S1_T13.iv_d_no)
											.and(S7_SHIPSCHD.ship_fr_lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
										)
									)
								)
								.cutoff$and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S8_IVMAP
											.innerJoin(S8_SHIPSCHD).on(S8_SHIPSCHD.ship_schd_no.eq(S8_IVMAP.ship_schd_no))
											.innerJoin(S8_LGGRP).on(S8_LGGRP.lg_grp_cd.eq(S8_SHIPSCHD.ship_fr_lg_grp_cd))
										)
										.where(
											S8_IVMAP.iv_d_no.eq(S1_T13.iv_d_no)
											.and(S8_LGGRP.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
										)
									)
								)
								.cutoff$and(S1_T13.sls_usr_cd.like(bind("sls_usr_cd")))
								.cutoff$and(S1_M68.usr_nm.like(bind("sls_usr_nm")))
								.cutoff$and(S1_T13.sls_dpt_cd.like(bind("sls_dpt_cd")))
								.cutoff$and(S1_M67.dpt_nm.like(bind("sls_dpt_nm")))
								.cutoff$and(S1_M55.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S1_M55.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S1_M56.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S1_T13.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S1_T13.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S1_T13.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S1_T13.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S1_T13.cst_itm_cd.like(bind("cst_itm_cd")))
								.cutoff$and(S1_T13.cst_itm_nm.like(bind("cst_itm_nm")))
								.cutoff$and(S1_T12.iv_rmrks.like(bind("iv_rmrks")))
								.cutoff$and(S1_T13.iv_d_rmrks.like(bind("iv_d_rmrks")))
								.cutoff$and(S1_T12.pl_rmrks.like(bind("pl_rmrks")))
								.cutoff$and(S1_T12.intr_rmrks.like(bind("iv_intr_rmrks")))
								.cutoff$and(S1_T13.intr_d_rmrks.like(bind("iv_d_intr_rmrks")))
								.cutoff$and(S1_T12.sub_char1.like(bind("iv_sub_char1")))
								.cutoff$and(S1_T12.sub_char2.like(bind("iv_sub_char2")))
								.cutoff$and(S1_T12.sub_char3.like(bind("iv_sub_char3")))
								.cutoff$and(S1_T13.sub_char1.like(bind("iv_d_sub_char1")))
								.cutoff$and(S1_T13.sub_char2.like(bind("iv_d_sub_char2")))
								.cutoff$and(S1_T13.sub_char3.like(bind("iv_d_sub_char3")))
								.cutoff$and(
									S1_T20.sls_cststk_flg.eq(bind("sls_cststk_flg_str"))
									.or(
										bind("sls_cststk_flg_str").eq(value(false))
										.and(S1_T20.slo_d_no.isNull())
									)
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_M01).on(
							S0_V1.pr(S1_T2.itm_cd).eq(S0_M01.itm_cd)
							.and(S0_V1.pr(S1_T2.itm_sub1).eq(S0_M01.itm_sub1))
							.and(S0_V1.pr(S1_T2.itm_sub2).eq(S0_M01.itm_sub2))
							.and(S0_V1.pr(S1_T2.itm_sub3).eq(S0_M01.itm_sub3))
							.and(S0_V1.pr("prnt_lcl_cd").eq(S0_M01.lcl_cd))
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_ID_GRP)
						.addDynamicView(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_V1.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_V1.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_no").like(bind("ship_rqst_no")))
						.cutoff$and(S0_V1.pr("itm_nm").like(bind("itm_nm")))
						.addDynamicPredicate(DS0C_DLV_ID_GRP)
						.addDynamicPredicate(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_V1.pr(S1_T1.iv_no).asc(),
						S0_V1.pr(S1_T1.iv_mng_no).asc(),
						S0_V1.pr(S1_T1.iv_rev).asc(),
						S0_V1.pr(S1_T2.iv_d_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_id_grp_flg1", "dlv_id_grp_flg2", "dlv_id_grp_flg3", "dlv_id_grp_flg4", "dlv_id_grp_flg5", "dlv_id_grp_flg6", "dlv_id_grp_flg7", "dlv_id_grp_flg8", "dlv_id_grp_flg9", "dlv_id_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M02).on(S0_V1.pr(S1_T1.dlv_id_cd).eq(S0_M02.bp_cd))),
				when(boundOr("ship_rqst_id_grp_flg1", "ship_rqst_id_grp_flg2", "ship_rqst_id_grp_flg3", "ship_rqst_id_grp_flg4", "ship_rqst_id_grp_flg5", "ship_rqst_id_grp_flg6", "ship_rqst_id_grp_flg7", "ship_rqst_id_grp_flg8", "ship_rqst_id_grp_flg9", "ship_rqst_id_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M03).on(S0_V1.pr(S1_T1.ship_rqst_id_cd).eq(S0_M03.bp_cd))),
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M04).on(S0_V1.pr(S1_T2.itm_cd).eq(S0_M04.itm_cd).and(S0_V1.pr(S1_T2.itm_sub1).eq(S0_M04.itm_sub1)).and(S0_V1.pr(S1_T2.itm_sub2).eq(S0_M04.itm_sub2)).and(S0_V1.pr(S1_T2.itm_sub3).eq(S0_M04.itm_sub3)))),
				when(boundOr("dlv_id_grp_flg1"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd1.as("dlv_id_grp_cd1"), S0_M021.bp_grp_nm.as("dlv_id_grp_nm1"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M021).on(S0_M02.bp_grp_cd1.eq(S0_M021.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_M021.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd1.like(bind("dlv_id_grp_cd1"))).cutoff$and(S0_M021.bp_grp_nm.like(bind("dlv_id_grp_nm1")))),
				when(boundOr("dlv_id_grp_flg2"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd2.as("dlv_id_grp_cd2"), S0_M022.bp_grp_nm.as("dlv_id_grp_nm2"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M022).on(S0_M02.bp_grp_cd2.eq(S0_M022.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_M022.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd2.like(bind("dlv_id_grp_cd2"))).cutoff$and(S0_M022.bp_grp_nm.like(bind("dlv_id_grp_nm2")))),
				when(boundOr("dlv_id_grp_flg3"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd3.as("dlv_id_grp_cd3"), S0_M023.bp_grp_nm.as("dlv_id_grp_nm3"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M023).on(S0_M02.bp_grp_cd3.eq(S0_M023.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_M023.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd3.like(bind("dlv_id_grp_cd3"))).cutoff$and(S0_M023.bp_grp_nm.like(bind("dlv_id_grp_nm3")))),
				when(boundOr("dlv_id_grp_flg4"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd4.as("dlv_id_grp_cd4"), S0_M024.bp_grp_nm.as("dlv_id_grp_nm4"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M024).on(S0_M02.bp_grp_cd4.eq(S0_M024.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_M024.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd4.like(bind("dlv_id_grp_cd4"))).cutoff$and(S0_M024.bp_grp_nm.like(bind("dlv_id_grp_nm4")))),
				when(boundOr("dlv_id_grp_flg5"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd5.as("dlv_id_grp_cd5"), S0_M025.bp_grp_nm.as("dlv_id_grp_nm5"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M025).on(S0_M02.bp_grp_cd5.eq(S0_M025.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_M025.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd5.like(bind("dlv_id_grp_cd5"))).cutoff$and(S0_M025.bp_grp_nm.like(bind("dlv_id_grp_nm5")))),
				when(boundOr("dlv_id_grp_flg6"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd6.as("dlv_id_grp_cd6"), S0_M026.bp_grp_nm.as("dlv_id_grp_nm6"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M026).on(S0_M02.bp_grp_cd6.eq(S0_M026.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_M026.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd6.like(bind("dlv_id_grp_cd6"))).cutoff$and(S0_M026.bp_grp_nm.like(bind("dlv_id_grp_nm6")))),
				when(boundOr("dlv_id_grp_flg7"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd7.as("dlv_id_grp_cd7"), S0_M027.bp_grp_nm.as("dlv_id_grp_nm7"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M027).on(S0_M02.bp_grp_cd7.eq(S0_M027.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_M027.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd7.like(bind("dlv_id_grp_cd7"))).cutoff$and(S0_M027.bp_grp_nm.like(bind("dlv_id_grp_nm7")))),
				when(boundOr("dlv_id_grp_flg8"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd8.as("dlv_id_grp_cd8"), S0_M028.bp_grp_nm.as("dlv_id_grp_nm8"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M028).on(S0_M02.bp_grp_cd8.eq(S0_M028.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_M028.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd8.like(bind("dlv_id_grp_cd8"))).cutoff$and(S0_M028.bp_grp_nm.like(bind("dlv_id_grp_nm8")))),
				when(boundOr("dlv_id_grp_flg9"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd9.as("dlv_id_grp_cd9"), S0_M029.bp_grp_nm.as("dlv_id_grp_nm9"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M029).on(S0_M02.bp_grp_cd9.eq(S0_M029.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_M029.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd9.like(bind("dlv_id_grp_cd9"))).cutoff$and(S0_M029.bp_grp_nm.like(bind("dlv_id_grp_nm9")))),
				when(boundOr("dlv_id_grp_flg10"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd10.as("dlv_id_grp_cd10"), S0_M0210.bp_grp_nm.as("dlv_id_grp_nm10"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M0210).on(S0_M02.bp_grp_cd10.eq(S0_M0210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_M0210.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd10.like(bind("dlv_id_grp_cd10"))).cutoff$and(S0_M0210.bp_grp_nm.like(bind("dlv_id_grp_nm10")))),
				when(boundOr("ship_rqst_id_grp_flg1"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd1.as("ship_rqst_id_grp_cd1"), S0_M031.bp_grp_nm.as("ship_rqst_id_grp_nm1"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M031).on(S0_M03.bp_grp_cd1.eq(S0_M031.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_M031.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd1.like(bind("ship_rqst_id_grp_cd1"))).cutoff$and(S0_M031.bp_grp_nm.like(bind("ship_rqst_id_grp_nm1")))),
				when(boundOr("ship_rqst_id_grp_flg2"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd2.as("ship_rqst_id_grp_cd2"), S0_M032.bp_grp_nm.as("ship_rqst_id_grp_nm2"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M032).on(S0_M03.bp_grp_cd2.eq(S0_M032.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_M032.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd2.like(bind("ship_rqst_id_grp_cd2"))).cutoff$and(S0_M032.bp_grp_nm.like(bind("ship_rqst_id_grp_nm2")))),
				when(boundOr("ship_rqst_id_grp_flg3"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd3.as("ship_rqst_id_grp_cd3"), S0_M033.bp_grp_nm.as("ship_rqst_id_grp_nm3"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M033).on(S0_M03.bp_grp_cd3.eq(S0_M033.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_M033.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd3.like(bind("ship_rqst_id_grp_cd3"))).cutoff$and(S0_M033.bp_grp_nm.like(bind("ship_rqst_id_grp_nm3")))),
				when(boundOr("ship_rqst_id_grp_flg4"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd4.as("ship_rqst_id_grp_cd4"), S0_M034.bp_grp_nm.as("ship_rqst_id_grp_nm4"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M034).on(S0_M03.bp_grp_cd4.eq(S0_M034.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_M034.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd4.like(bind("ship_rqst_id_grp_cd4"))).cutoff$and(S0_M034.bp_grp_nm.like(bind("ship_rqst_id_grp_nm4")))),
				when(boundOr("ship_rqst_id_grp_flg5"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd5.as("ship_rqst_id_grp_cd5"), S0_M035.bp_grp_nm.as("ship_rqst_id_grp_nm5"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M035).on(S0_M03.bp_grp_cd5.eq(S0_M035.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_M035.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd5.like(bind("ship_rqst_id_grp_cd5"))).cutoff$and(S0_M035.bp_grp_nm.like(bind("ship_rqst_id_grp_nm5")))),
				when(boundOr("ship_rqst_id_grp_flg6"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd6.as("ship_rqst_id_grp_cd6"), S0_M036.bp_grp_nm.as("ship_rqst_id_grp_nm6"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M036).on(S0_M03.bp_grp_cd6.eq(S0_M036.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_M036.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd6.like(bind("ship_rqst_id_grp_cd6"))).cutoff$and(S0_M036.bp_grp_nm.like(bind("ship_rqst_id_grp_nm6")))),
				when(boundOr("ship_rqst_id_grp_flg7"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd7.as("ship_rqst_id_grp_cd7"), S0_M037.bp_grp_nm.as("ship_rqst_id_grp_nm7"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M037).on(S0_M03.bp_grp_cd7.eq(S0_M037.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_M037.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd7.like(bind("ship_rqst_id_grp_cd7"))).cutoff$and(S0_M037.bp_grp_nm.like(bind("ship_rqst_id_grp_nm7")))),
				when(boundOr("ship_rqst_id_grp_flg8"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd8.as("ship_rqst_id_grp_cd8"), S0_M038.bp_grp_nm.as("ship_rqst_id_grp_nm8"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M038).on(S0_M03.bp_grp_cd8.eq(S0_M038.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_M038.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd8.like(bind("ship_rqst_id_grp_cd8"))).cutoff$and(S0_M038.bp_grp_nm.like(bind("ship_rqst_id_grp_nm8")))),
				when(boundOr("ship_rqst_id_grp_flg9"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd9.as("ship_rqst_id_grp_cd9"), S0_M039.bp_grp_nm.as("ship_rqst_id_grp_nm9"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M039).on(S0_M03.bp_grp_cd9.eq(S0_M039.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_M039.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd9.like(bind("ship_rqst_id_grp_cd9"))).cutoff$and(S0_M039.bp_grp_nm.like(bind("ship_rqst_id_grp_nm9")))),
				when(boundOr("ship_rqst_id_grp_flg10"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd10.as("ship_rqst_id_grp_cd10"), S0_M0310.bp_grp_nm.as("ship_rqst_id_grp_nm10"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M0310).on(S0_M03.bp_grp_cd10.eq(S0_M0310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_M0310.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd10.like(bind("ship_rqst_id_grp_cd10"))).cutoff$and(S0_M0310.bp_grp_nm.like(bind("ship_rqst_id_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd1.as("itm_grp_cd1"), S0_M041.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M041).on(S0_M04.itm_grp_cd1.eq(S0_M041.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_M041.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_M041.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd2.as("itm_grp_cd2"), S0_M042.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M042).on(S0_M04.itm_grp_cd2.eq(S0_M042.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_M042.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_M042.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd3.as("itm_grp_cd3"), S0_M043.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M043).on(S0_M04.itm_grp_cd3.eq(S0_M043.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_M043.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_M043.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd4.as("itm_grp_cd4"), S0_M044.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M044).on(S0_M04.itm_grp_cd4.eq(S0_M044.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_M044.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_M044.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd5.as("itm_grp_cd5"), S0_M045.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M045).on(S0_M04.itm_grp_cd5.eq(S0_M045.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_M045.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_M045.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd6.as("itm_grp_cd6"), S0_M046.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M046).on(S0_M04.itm_grp_cd6.eq(S0_M046.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_M046.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_M046.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd7.as("itm_grp_cd7"), S0_M047.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M047).on(S0_M04.itm_grp_cd7.eq(S0_M047.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_M047.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_M047.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd8.as("itm_grp_cd8"), S0_M048.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M048).on(S0_M04.itm_grp_cd8.eq(S0_M048.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_M048.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_M048.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd9.as("itm_grp_cd9"), S0_M049.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M049).on(S0_M04.itm_grp_cd9.eq(S0_M049.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_M049.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_M049.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd10.as("itm_grp_cd10"), S0_M0410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M0410).on(S0_M04.itm_grp_cd10.eq(S0_M0410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_M0410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_M0410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL1770_MST_IV_D_Query_S02
	 */
	static MCQueryPlan MSBEL1770_MST_IV_D_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_LCL_R S0_M01 = MAM_ITM_LCL_R.create("M01");
		MAM_BP_R S0_M02 = MAM_BP_R.create("M02");
		MAM_BP_R S0_M03 = MAM_BP_R.create("M03");
		MAM_ITM_R S0_M04 = MAM_ITM_R.create("M04");
		MAM_BP_GRP_R S0_M021 = MAM_BP_GRP_R.create("M021");
		MAM_BP_GRP_R S0_M022 = MAM_BP_GRP_R.create("M022");
		MAM_BP_GRP_R S0_M023 = MAM_BP_GRP_R.create("M023");
		MAM_BP_GRP_R S0_M024 = MAM_BP_GRP_R.create("M024");
		MAM_BP_GRP_R S0_M025 = MAM_BP_GRP_R.create("M025");
		MAM_BP_GRP_R S0_M026 = MAM_BP_GRP_R.create("M026");
		MAM_BP_GRP_R S0_M027 = MAM_BP_GRP_R.create("M027");
		MAM_BP_GRP_R S0_M028 = MAM_BP_GRP_R.create("M028");
		MAM_BP_GRP_R S0_M029 = MAM_BP_GRP_R.create("M029");
		MAM_BP_GRP_R S0_M0210 = MAM_BP_GRP_R.create("M0210");
		MAM_BP_GRP_R S0_M031 = MAM_BP_GRP_R.create("M031");
		MAM_BP_GRP_R S0_M032 = MAM_BP_GRP_R.create("M032");
		MAM_BP_GRP_R S0_M033 = MAM_BP_GRP_R.create("M033");
		MAM_BP_GRP_R S0_M034 = MAM_BP_GRP_R.create("M034");
		MAM_BP_GRP_R S0_M035 = MAM_BP_GRP_R.create("M035");
		MAM_BP_GRP_R S0_M036 = MAM_BP_GRP_R.create("M036");
		MAM_BP_GRP_R S0_M037 = MAM_BP_GRP_R.create("M037");
		MAM_BP_GRP_R S0_M038 = MAM_BP_GRP_R.create("M038");
		MAM_BP_GRP_R S0_M039 = MAM_BP_GRP_R.create("M039");
		MAM_BP_GRP_R S0_M0310 = MAM_BP_GRP_R.create("M0310");
		MAM_ITM_GRP_R S0_M041 = MAM_ITM_GRP_R.create("M041");
		MAM_ITM_GRP_R S0_M042 = MAM_ITM_GRP_R.create("M042");
		MAM_ITM_GRP_R S0_M043 = MAM_ITM_GRP_R.create("M043");
		MAM_ITM_GRP_R S0_M044 = MAM_ITM_GRP_R.create("M044");
		MAM_ITM_GRP_R S0_M045 = MAM_ITM_GRP_R.create("M045");
		MAM_ITM_GRP_R S0_M046 = MAM_ITM_GRP_R.create("M046");
		MAM_ITM_GRP_R S0_M047 = MAM_ITM_GRP_R.create("M047");
		MAM_ITM_GRP_R S0_M048 = MAM_ITM_GRP_R.create("M048");
		MAM_ITM_GRP_R S0_M049 = MAM_ITM_GRP_R.create("M049");
		MAM_ITM_GRP_R S0_M0410 = MAM_ITM_GRP_R.create("M0410");
		MST_IV_R S1_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_WRK_SNO_R S1_T5 = MST_WRK_SNO_R.create("T5");
		MST_WRK_R S1_T6 = MST_WRK_R.create("T6");
		MCTempView S1_T7 = createTempView("T7");
		MST_SLO_R S1_T8 = MST_SLO_R.create("T8");
		MST_XFR_SCHD_R S1_T9 = MST_XFR_SCHD_R.create("T9");
		MST_SLO_D_R S1_T10 = MST_SLO_D_R.create("T10");
		MAM_BP_R S1_M1 = MAM_BP_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_CNTRY_R S1_M3 = MAM_CNTRY_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S1_M6 = MAM_BP_R.create("M6");
		MAM_LG_GRP_R S1_M7 = MAM_LG_GRP_R.create("M7");
		MAM_TRNSPT_R S1_M8 = MAM_TRNSPT_R.create("M8");
		MAM_EXIM_PORT_R S1_M9 = MAM_EXIM_PORT_R.create("M9");
		MAM_EXIM_PORT_R S1_M10 = MAM_EXIM_PORT_R.create("M10");
		MAM_EXIM_PORT_R S1_M11 = MAM_EXIM_PORT_R.create("M11");
		MAM_TTERM_R S1_M12 = MAM_TTERM_R.create("M12");
		MAM_TTERM_R S1_M13 = MAM_TTERM_R.create("M13");
		MAM_TTERM_R S1_M14 = MAM_TTERM_R.create("M14");
		MAM_TRD_R S1_M17 = MAM_TRD_R.create("M17");
		MAM_ITM_R S1_M18 = MAM_ITM_R.create("M18");
		MAM_ITM_TYP_D_R S1_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_SUNDRY_ITM_R S1_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_BP_R S1_M21 = MAM_BP_R.create("M21");
		MAM_CNTRY_R S1_M22 = MAM_CNTRY_R.create("M22");
		MAM_STK_GD_R S1_M23 = MAM_STK_GD_R.create("M23");
		MAM_UNIT_R S1_M24 = MAM_UNIT_R.create("M24");
		MAM_UNIT_R S1_M25 = MAM_UNIT_R.create("M25");
		MAM_BIZ_RSN_R S1_M27 = MAM_BIZ_RSN_R.create("M27");
		MAM_DPT_R S1_M28 = MAM_DPT_R.create("M28");
		MAM_BIZ_RSN_R S1_M29 = MAM_BIZ_RSN_R.create("M29");
		MAM_DPT_R S1_M30 = MAM_DPT_R.create("M30");
		MAM_USR_R S1_M31 = MAM_USR_R.create("M31");
		MAM_DPT_R S1_M32 = MAM_DPT_R.create("M32");
		MAM_LOC_R S1_M33 = MAM_LOC_R.create("M33");
		MAM_LG_GRP_R S1_M34 = MAM_LG_GRP_R.create("M34");
		MAM_SITE_R S1_M35 = MAM_SITE_R.create("M35");
		MAM_BP_R S1_M36 = MAM_BP_R.create("M36");
		MAM_BP_R S1_M37 = MAM_BP_R.create("M37");
		MAM_STR_LN_R S1_M38 = MAM_STR_LN_R.create("M38");
		MAVM_ITM_UNIT_R S1_M39 = MAVM_ITM_UNIT_R.create("M39");
		MAVM_ITM_UNIT_R S1_M40 = MAVM_ITM_UNIT_R.create("M40");
		MAM_LG_GRP_R S1_M41 = MAM_LG_GRP_R.create("M41");
		MAM_ITM_LG_GRP_R S1_M42 = MAM_ITM_LG_GRP_R.create("M42");
		MAM_LOC_R S1_M43 = MAM_LOC_R.create("M43");
		MST_SHIP_INST_R S2 = MST_SHIP_INST_R.create();
		
		MCDynamicSQLID DS0C_DLV_ID_GRP = createDynamicSQLID("DS0C_DLV_ID_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SHIP_RQST_ID_GRP = createDynamicSQLID("DS0C_SHIP_RQST_ID_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S1_T4 = createTempView("T4");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1770_MST_IV_D_Query_S02")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						cases()
							.when(S0_V1.pr(S1_T2.sundry_itm_flg).eq(value(true)))
								.then(S0_V1.pr("sundry_iv_itm_nm"))
							.otherwise(
								nvl(
									S0_M01.itm_nm,
									S0_V1.pr("itm_nm")
								)
							).as("iv_itm_nm"),
						addDynamicSelect(DS0C_DLV_ID_GRP),
						addDynamicSelect(DS0C_SHIP_RQST_ID_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_T1.pl_skip_flg,
							S1_T1.cmpl_flg.as("ex_im_comp_flg"),
							S1_T1.non_cmpl_flg,
							S1_T1.iv_ship_flg,
							S1_T1.iv_prnt_flg,
							S1_T1.pl_prnt_flg,
							S1_T1.iv_no,
							S1_T1.iv_mng_no,
							S1_T1.iv_rev,
							S1_T1.cmpl_schd_dt,
							S1_T1.trd_schd_dt,
							S1_T1.cmpl_dt,
							S1_T1.iv_dt,
							S1_T1.dlv_id_typ,
							nullValue().as("dlv_id_typ_nm"),
							S1_T1.dlv_id_cd,
							cases()
								.when(S1_T1.dlv_sundry_flg.eq(value(true)))
									.then(S1_T1.dlv_id_nm)
								.otherwise(
									cases()
										.when(S1_T1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
											.then(S1_M2.loc_nm)
										.otherwise(S1_M1.bp_nm)
								).as("dlv_id_nm"),
							S1_T1.dlv_sundry_flg,
							S1_T1.dlv_cntry_cd,
							S1_M3.cntry_nm.as("dlv_cntry_nm"),
							S1_T1.dlv_zip_cd,
							S1_T1.dlv_addr1,
							S1_T1.dlv_addr2,
							S1_T1.dlv_addr3,
							S1_T1.dlv_addr4,
							S1_T1.dlv_tel,
							S1_T1.dlv_fax,
							S1_T1.dlv_cntct_dpt,
							S1_T1.dlv_cntct_psn,
							S1_T1.ship_rqst_id_typ,
							nullValue().as("ship_rqst_id_typ_nm"),
							S1_T1.ship_rqst_id_cd,
							cases()
								.when(S1_T1.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
									.then(S1_M5.loc_nm)
								.otherwise(S1_M4.bp_nm).as("ship_rqst_id_nm"),
							S1_T1.via_dlv_typ,
							nullValue().as("via_dlv_typ_nm"),
							S1_T1.tdlv_cd,
							nvl(
								S1_T1.tdlv_nm,
								S1_M6.bp_nm
							).as("tdlv_nm"),
							S1_T1.tdlv_lg_grp_cd,
							S1_M7.lg_grp_nm.as("tdlv_lg_grp_nm"),
							S1_T1.tdlv_zip_cd,
							S1_T1.tdlv_addr1,
							S1_T1.tdlv_addr2,
							S1_T1.tdlv_addr3,
							S1_T1.tdlv_addr4,
							S1_T1.tdlv_tel,
							S1_T1.tdlv_fax,
							S1_T1.tdlv_cntct_dpt,
							S1_T1.tdlv_cntct_psn,
							S1_T1.trnspt_cd,
							S1_M8.trnspt_nm,
							S1_T1.vssl_flght,
							S1_T1.load_port_cd,
							S1_M9.port_nm.as("load_port_nm"),
							S1_T1.etd_dt,
							S1_T1.dschrg_port_cd,
							S1_M10.port_nm.as("dschrg_port_nm"),
							S1_T1.eta_dt,
							S1_T1.via_port_cd,
							S1_M11.port_nm.as("via_port_nm"),
							S1_T1.via_schd_dt,
							S1_T1.tterm_cd1,
							S1_M12.tterm_nm.as("tterm_nm1"),
							S1_T1.tterm_rmrks1,
							S1_T1.tterm_cd2,
							S1_M13.tterm_nm.as("tterm_nm2"),
							S1_T1.tterm_rmrks2,
							S1_T1.tterm_cd3,
							S1_M14.tterm_nm.as("tterm_nm3"),
							S1_T1.tterm_rmrks3,
							S1_T1.bill_basis_dt,
							S1_T1.rcv_schd_dt,
							S1_T1.pl_rmrks,
							S1_T1.case_mrk1,
							S1_T1.case_mrk2,
							S1_T1.case_mrk3,
							S1_T1.case_mrk4,
							S1_T1.case_mrk5,
							S1_T1.case_mrk6,
							S1_T1.lc_no,
							S1_T1.lc_dt,
							S1_T1.lc_rmrks,
							S1_T1.bl_no,
							S1_T1.bl_dt,
							S1_T1.bl_rmrks,
							S1_T1.iv_rmrks,
							S1_T1.pl_reg_flg,
							S1_T1.intr_rmrks.as("iv_intr_rmrks"),
							S1_T1.sub_char1.as("iv_sub_char1"),
							S1_T1.sub_char2.as("iv_sub_char2"),
							S1_T1.sub_char3.as("iv_sub_char3"),
							S1_T2.trd_cd,
							S1_M17.trd_nm,
							S1_T2.iv_d_no,
							S1_T2.slo_no,
							nvl(
								S1_T2.slo_d_no,
								S1_T2.xfr_schd_no
							).as("ship_rqst_no"),
							S1_T2.cst_po_no,
							S1_T2.cst_po_d_no,
							S1_T2.cst_itm_cd,
							S1_T2.cst_itm_nm,
							S1_T2.dlv_rqst_tm,
							S1_T2.bndl_flg,
							S1_M18.itm_typ,
							nullValue().as("itm_typ_nm"),
							S1_M18.itm_typ_d_cd,
							S1_M19.itm_typ_d_nm,
							cases()
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S1_M1.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S1_M2.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S1_M2.prnt_lcl_cd)
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S1_M2.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S1_T2.sundry_itm_flg,
							S1_T2.cntry_org_cd,
							S1_M22.cntry_nm.as("cntry_org_nm"),
							S1_T2.rsn_cd,
							S1_M27.biz_rsn_nm.as("rsn_nm"),
							S1_T2.bd_dpt_cd,
							S1_M28.dpt_nm.as("bd_dpt_nm"),
							S1_T2.dscnt_rsn_cd,
							S1_M29.biz_rsn_nm.as("dscnt_rsn_nm"),
							S1_T2.sls_dpt_cd,
							S1_M30.dpt_nm.as("sls_dpt_nm"),
							S1_T2.sls_usr_cd,
							S1_M31.usr_nm.as("sls_usr_nm"),
							S1_T2.manual_add_flg,
							S1_T2.ar_dpt_cd,
							S1_M32.dpt_nm.as("ar_dpt_nm"),
							S1_T2.iv_d_rmrks,
							S1_T2.intr_d_rmrks.as("iv_d_intr_rmrks"),
							S1_T2.sub_char1.as("iv_d_sub_char1"),
							S1_T2.sub_char2.as("iv_d_sub_char2"),
							S1_T2.sub_char3.as("iv_d_sub_char3"),
							S1_T4.pr("ins_usr_id"),
							S1_T4.pr("ins_usr_nm"),
							S1_T4.pr("ins_ts"),
							S1_T4.pr("ins_func_id"),
							nullValue().as("ins_func_nm"),
							S1_T4.pr("upd_cntr"),
							S1_T4.pr("upd_usr_id"),
							S1_T4.pr("upd_usr_nm"),
							S1_T4.pr("upd_ts"),
							S1_T4.pr("upd_func_id"),
							S1_T4.pr("upd_srv_req_no"),
							nullValue().as("upd_func_nm"),
							S1_T4.pr("itm_cd"),
							S1_T4.pr("itm_sub1"),
							S1_T4.pr("itm_sub2"),
							S1_T4.pr("itm_sub3"),
							cases()
								.when(S1_T4.pr("sundry_itm_flg").eq(value(true)))
									.then(
										nvl(
											S1_T4.pr("itm_nm"),
											S1_M20.itm_nm
										)
								)
								.otherwise(S1_M18.itm_nm).as("itm_nm"),
							nvl(
								S1_T4.pr("iv_itm_nm"),
								S1_M20.itm_nm
							).as("sundry_iv_itm_nm"),
							S1_T4.pr("sno1"),
							S1_T4.pr("sno2"),
							S1_T4.pr("sno3"),
							S1_T4.pr("sno4"),
							S1_T5.wrk_no,
							S1_T6.wrk_nm,
							S1_M18.sno1_mng_typ,
							S1_M18.sno2_mng_typ,
							S1_M18.sno3_mng_typ,
							S1_M18.sno4_mng_typ,
							S1_T4.pr("gd_cd"),
							S1_M23.gd_nm,
							S1_M33.lg_grp_cd.as("ship_fr_lg_grp_cd"),
							S1_M34.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S1_T4.pr("ship_loc_cd"),
							S1_M33.loc_nm.as("ship_loc_nm"),
							S1_T4.pr("ship_str_ln_cd"),
							S1_M38.str_ln_nm.as("ship_str_ln_nm"),
							S1_M33.site_cd.as("ship_site_cd"),
							S1_M35.site_nm.as("ship_site_nm"),
							S1_T4.pr("lot_no"),
							S1_T4.pr("sublot_no"),
							S1_T4.pr("ver_no"),
							S1_T4.pr("stk_arrv_bp_cd"),
							S1_M36.bp_nm.as("stk_arrv_bp_nm"),
							S1_T4.pr("stk_id_typ"),
							nullValue().as("stk_id_typ_nm"),
							S1_T4.pr("stk_bp_cd"),
							S1_M37.bp_nm.as("stk_bp_nm"),
							S1_T4.pr("quality_typ"),
							nullValue().as("quality_typ_nm"),
							S1_T4.pr("stk_insp_typ"),
							nullValue().as("stk_insp_typ_nm"),
							S1_T2.trd_unit_cd,
							S1_M24.unit_nm.as("trd_unit_nm"),
							S1_M39.dec_place.as("trd_unit_dec_place"),
							S1_T2.trd_unit_qty,
							S1_T2.base_unit_cd,
							S1_M25.unit_nm.as("base_unit_nm"),
							S1_M40.dec_place.as("base_unit_dec_place"),
							S1_T2.base_unit_qty,
							S1_M30.wg_cd.as("sls_dpt_wg_cd"),
							S1_M41.wg_cd.as("lg_grp_wg_cd"),
							S1_T1.trd_ptn_typ,
							coalesce(
								S1_T9.gi_loc_cd,
								S1_M42.lg_def_loc_cd,
								S1_M43.loc_cd
							).as("chk_gi_loc_cd"),
							nvl2(
								S1_T10.slo_d_no,
								S1_T10.sls_cststk_flg,
								value(false)
							).as("sls_cststk_flg"),
							addDynamicSelect(REP1)
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(S1_T1.iv_mng_no.eq(S1_T2.iv_mng_no))
							.addDynamicView(REP1)
							.leftOuterJoin(S1_T5).on(S1_T4.pr("sno1").eq(S1_T5.sno1))
							.leftOuterJoin(S1_T6).on(S1_T5.wrk_no.eq(S1_T6.wrk_no))
							.leftOuterJoin(
								subQuery()
								.select(S2.iv_no)
								.from(S2)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S2.ship_inst_no.like(bind("ship_inst_no")))
									.and(S2.can_flg.eq(value(false)))
								).view(S1_T7)
							).on(S1_T1.iv_no.eq(S1_T7.pr(S2.iv_no)))
							.leftOuterJoin(S1_T8).on(S1_T2.slo_d_no.eq(S1_T8.slo_no))
							.leftOuterJoin(S1_T9).on(S1_T2.xfr_schd_no.eq(S1_T9.xfr_schd_no))
							.leftOuterJoin(S1_T10).on(S1_T2.slo_d_no.eq(S1_T10.slo_d_no))
							.leftOuterJoin(S1_M1).on(S1_T1.dlv_id_cd.eq(S1_M1.bp_cd))
							.leftOuterJoin(S1_M2).on(S1_T1.dlv_id_cd.eq(S1_M2.loc_cd))
							.leftOuterJoin(S1_M3).on(S1_T1.dlv_cntry_cd.eq(S1_M3.cntry_cd))
							.leftOuterJoin(S1_M4).on(S1_T1.ship_rqst_id_cd.eq(S1_M4.bp_cd))
							.leftOuterJoin(S1_M5).on(S1_T1.ship_rqst_id_cd.eq(S1_M5.loc_cd))
							.leftOuterJoin(S1_M6).on(S1_T1.tdlv_cd.eq(S1_M6.bp_cd))
							.leftOuterJoin(S1_M7).on(S1_T1.tdlv_lg_grp_cd.eq(S1_M7.lg_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_T1.trnspt_cd.eq(S1_M8.trnspt_cd))
							.leftOuterJoin(S1_M9).on(S1_T1.load_port_cd.eq(S1_M9.port_cd))
							.leftOuterJoin(S1_M10).on(S1_T1.dschrg_port_cd.eq(S1_M10.port_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.via_port_cd.eq(S1_M11.port_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.tterm_cd1.eq(S1_M12.tterm_cd))
							.leftOuterJoin(S1_M13).on(S1_T1.tterm_cd2.eq(S1_M13.tterm_cd))
							.leftOuterJoin(S1_M14).on(S1_T1.tterm_cd3.eq(S1_M14.tterm_cd))
							.leftOuterJoin(S1_M17).on(S1_T2.trd_cd.eq(S1_M17.trd_cd))
							.leftOuterJoin(S1_M18).on(
								S1_T4.pr("itm_cd").eq(S1_M18.itm_cd)
								.and(S1_T4.pr("itm_sub1").eq(S1_M18.itm_sub1))
								.and(S1_T4.pr("itm_sub2").eq(S1_M18.itm_sub2))
								.and(S1_T4.pr("itm_sub3").eq(S1_M18.itm_sub3))
							)
							.leftOuterJoin(S1_M19).on(
								S1_M18.itm_typ.eq(S1_M19.itm_typ)
								.and(S1_M18.itm_typ_d_cd.eq(S1_M19.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M20).on(
								S1_T4.pr("itm_cd").eq(S1_M20.itm_cd)
								.and(S1_T4.pr("itm_sub1").eq(S1_M20.itm_sub1))
								.and(S1_T4.pr("itm_sub2").eq(S1_M20.itm_sub2))
								.and(S1_T4.pr("itm_sub3").eq(S1_M20.itm_sub3))
								.and(S1_T4.pr("sno1").eq(S1_M20.sno1))
								.and(S1_T4.pr("sno2").eq(S1_M20.sno2))
								.and(S1_T4.pr("sno3").eq(S1_M20.sno3))
								.and(S1_T4.pr("sno4").eq(S1_M20.sno4))
							)
							.leftOuterJoin(S1_M21).on(S1_M2.sppl_cd.eq(S1_M21.bp_cd))
							.leftOuterJoin(S1_M22).on(S1_T2.cntry_org_cd.eq(S1_M22.cntry_cd))
							.leftOuterJoin(S1_M23).on(S1_T4.pr("gd_cd").eq(S1_M23.gd_cd))
							.leftOuterJoin(S1_M24).on(S1_T2.trd_unit_cd.eq(S1_M24.unit_cd))
							.leftOuterJoin(S1_M25).on(S1_T2.base_unit_cd.eq(S1_M25.unit_cd))
							.leftOuterJoin(S1_M27).on(S1_T2.rsn_cd.eq(S1_M27.biz_rsn_cd))
							.leftOuterJoin(S1_M28).on(
								S1_T2.bd_dpt_cd.eq(S1_M28.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T9.rcpt_dt,
										S1_T1.iv_dt
									).between(S1_M28.st_dt, S1_M28.end_dt)
								)
							)
							.leftOuterJoin(S1_M29).on(S1_T2.dscnt_rsn_cd.eq(S1_M29.biz_rsn_cd))
							.leftOuterJoin(S1_M30).on(
								S1_T2.sls_dpt_cd.eq(S1_M30.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T1.iv_dt
									).between(S1_M30.st_dt, S1_M30.end_dt)
								)
							)
							.leftOuterJoin(S1_M31).on(S1_T2.sls_usr_cd.eq(S1_M31.usr_cd))
							.leftOuterJoin(S1_M32).on(
								S1_T2.ar_dpt_cd.eq(S1_M32.dpt_cd)
								.and(
									coalesce(
										S1_T8.slo_dt,
										S1_T1.iv_dt
									).between(S1_M32.st_dt, S1_M32.end_dt)
								)
							)
							.leftOuterJoin(S1_M33).on(S1_T4.pr("ship_loc_cd").eq(S1_M33.loc_cd))
							.leftOuterJoin(S1_M34).on(S1_M33.lg_grp_cd.eq(S1_M34.lg_grp_cd))
							.leftOuterJoin(S1_M35).on(S1_M33.site_cd.eq(S1_M35.site_cd))
							.leftOuterJoin(S1_M36).on(S1_T4.pr("stk_arrv_bp_cd").eq(S1_M36.bp_cd))
							.leftOuterJoin(S1_M37).on(S1_T4.pr("stk_bp_cd").eq(S1_M37.bp_cd))
							.leftOuterJoin(S1_M38).on(
								S1_T4.pr("ship_loc_cd").eq(S1_M38.loc_cd)
								.and(S1_T4.pr("ship_str_ln_cd").eq(S1_M38.str_ln_cd))
							)
							.leftOuterJoin(S1_M39).on(
								S1_T4.pr("itm_cd").eq(S1_M39.itm_cd)
								.and(S1_T4.pr("itm_sub1").eq(S1_M39.itm_sub1))
								.and(S1_T4.pr("itm_sub2").eq(S1_M39.itm_sub2))
								.and(S1_T4.pr("itm_sub3").eq(S1_M39.itm_sub3))
								.and(S1_T2.trd_unit_cd.eq(S1_M39.unit_cd))
							)
							.leftOuterJoin(S1_M40).on(
								S1_T4.pr("itm_cd").eq(S1_M40.itm_cd)
								.and(S1_T4.pr("itm_sub1").eq(S1_M40.itm_sub1))
								.and(S1_T4.pr("itm_sub2").eq(S1_M40.itm_sub2))
								.and(S1_T4.pr("itm_sub3").eq(S1_M40.itm_sub3))
								.and(S1_T2.base_unit_cd.eq(S1_M40.unit_cd))
							)
							.leftOuterJoin(S1_M41).on(S1_T9.gi_lg_grp_cd.eq(S1_M41.lg_grp_cd))
							.leftOuterJoin(S1_M42).on(
								S1_T9.itm_cd.eq(S1_M42.itm_cd)
								.and(S1_T9.itm_sub1.eq(S1_M42.itm_sub1))
								.and(S1_T9.itm_sub2.eq(S1_M42.itm_sub2))
								.and(S1_T9.itm_sub3.eq(S1_M42.itm_sub3))
								.and(S1_T9.gi_lg_grp_cd.eq(S1_M42.lg_grp_cd))
							)
							.leftOuterJoin(S1_M43).on(
								S1_T9.gi_lg_grp_cd.eq(S1_M43.lg_grp_cd)
								.and(S1_M43.lg_def_flg.eq(value(true)))
								.and(S1_M43.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.addDynamicPredicate(REP1)
							.cutoff$and(S1_T1.cmpl_flg.eq(bind("cmpl_flg_str")))
							.cutoff$and(
								bind("pl_ptn1").eq(value(true))
								.and(S1_T1.pl_reg_flg.eq(value(false)))
								.and(S1_T1.pl_skip_flg.eq(value(false)))
							)
							.cutoff$and(
								bind("pl_ptn2").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(false))
									.or(S1_T1.pl_reg_flg.eq(value(true)))
								)
								.and(S1_T1.pl_skip_flg.eq(value(false)))
							)
							.cutoff$and(
								bind("pl_ptn3").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(false))
									.or(S1_T1.pl_skip_flg.eq(value(true)))
								)
							)
							.cutoff$and(
								bind("pl_ptn4").eq(value(true))
								.and(S1_T1.pl_reg_flg.eq(value(true)))
							)
							.cutoff$and(
								bind("pl_ptn5").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(true))
									.or(S1_T1.pl_skip_flg.eq(value(true)))
								)
							)
							.cutoff$and(
								bind("pl_ptn6").eq(value(true))
								.and(S1_T1.pl_skip_flg.eq(value(true)))
							)
							.cutoff$and(S1_T1.iv_prnt_flg.eq(bind("iv_prnt_flg_str")))
							.cutoff$and(S1_T1.pl_prnt_flg.eq(bind("pl_prnt_flg_str")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T1.cmpl_schd_dt.gte(bind("cmpl_schd_dt_fr")))
							.cutoff$and(S1_T1.cmpl_schd_dt.lte(bind("cmpl_schd_dt_to")))
							.cutoff$and(S1_T1.cmpl_dt.gte(bind("cmpl_dt_fr")))
							.cutoff$and(S1_T1.cmpl_dt.lte(bind("cmpl_dt_to")))
							.cutoff$and(S1_T1.iv_dt.gte(bind("iv_dt_fr")))
							.cutoff$and(S1_T1.iv_dt.lte(bind("iv_dt_to")))
							.cutoff$and(S1_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
							.cutoff$and(S1_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
							.cutoff$and(S1_T1.tdlv_cd.like(bind("tdlv_cd")))
							.cutoff$and(S1_M33.lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
							.cutoff$and(S1_M34.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
							.cutoff$and(S1_T1.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(S1_T1.dlv_id_cd.like(bind("dlv_id_cd")))
							.cutoff$and(S1_T4.pr("ship_loc_cd").like(bind("ship_loc_cd")))
							.cutoff$and(S1_M33.loc_nm.like(bind("ship_loc_nm")))
							.cutoff$and(S1_M33.site_cd.like(bind("ship_site_cd")))
							.cutoff$and(S1_M35.site_nm.like(bind("ship_site_nm")))
							.cutoff$and(S1_T1.ship_rqst_id_typ.like(bind("ship_rqst_id_typ")))
							.cutoff$and(S1_T1.ship_rqst_id_cd.like(bind("ship_rqst_id_cd")))
							.cutoff$and(S1_T2.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T2.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_T2.cst_po_d_no.like(bind("cst_po_d_no")))
							.and(
								bind("ship_inst_no").isNull()
								.or(
									bind("ship_inst_no").isNotNull()
									.and(S1_T7.pr(S2.iv_no).isNotNull())
								)
							)
							.cutoff$and(S1_T2.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_M17.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S1_T2.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_M31.usr_nm.like(bind("sls_usr_nm")))
							.cutoff$and(S1_T2.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_M30.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(S1_M18.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M18.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T4.pr("itm_cd").like(bind("itm_cd")))
							.cutoff$and(S1_T4.pr("itm_sub1").like(bind("itm_sub1")))
							.cutoff$and(S1_T4.pr("itm_sub2").like(bind("itm_sub2")))
							.cutoff$and(S1_T4.pr("itm_sub3").like(bind("itm_sub3")))
							.cutoff$and(S1_T2.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S1_T2.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S1_T1.iv_rmrks.like(bind("iv_rmrks")))
							.cutoff$and(S1_T2.iv_d_rmrks.like(bind("iv_d_rmrks")))
							.cutoff$and(S1_T1.pl_rmrks.like(bind("pl_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("iv_intr_rmrks")))
							.cutoff$and(S1_T2.intr_d_rmrks.like(bind("iv_d_intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("iv_sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("iv_sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("iv_sub_char3")))
							.cutoff$and(S1_T2.sub_char1.like(bind("iv_d_sub_char1")))
							.cutoff$and(S1_T2.sub_char2.like(bind("iv_d_sub_char2")))
							.cutoff$and(S1_T2.sub_char3.like(bind("iv_d_sub_char3")))
							.cutoff$and(
								S1_T10.sls_cststk_flg.eq(bind("sls_cststk_flg_str"))
								.or(
									bind("sls_cststk_flg_str").eq(value(false))
									.and(S1_T10.slo_d_no.isNull())
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_M01).on(
							S0_V1.pr("itm_cd").eq(S0_M01.itm_cd)
							.and(S0_V1.pr("itm_sub1").eq(S0_M01.itm_sub1))
							.and(S0_V1.pr("itm_sub2").eq(S0_M01.itm_sub2))
							.and(S0_V1.pr("itm_sub3").eq(S0_M01.itm_sub3))
							.and(S0_V1.pr("prnt_lcl_cd").eq(S0_M01.lcl_cd))
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_ID_GRP)
						.addDynamicView(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_V1.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_V1.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_no").like(bind("ship_rqst_no")))
						.cutoff$and(S0_V1.pr("itm_nm").like(bind("itm_nm")))
						.addDynamicPredicate(DS0C_DLV_ID_GRP)
						.addDynamicPredicate(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_id_grp_flg1", "dlv_id_grp_flg2", "dlv_id_grp_flg3", "dlv_id_grp_flg4", "dlv_id_grp_flg5", "dlv_id_grp_flg6", "dlv_id_grp_flg7", "dlv_id_grp_flg8", "dlv_id_grp_flg9", "dlv_id_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M02).on(S0_V1.pr(S1_T1.dlv_id_cd).eq(S0_M02.bp_cd))),
				when(boundOr("ship_rqst_id_grp_flg1", "ship_rqst_id_grp_flg2", "ship_rqst_id_grp_flg3", "ship_rqst_id_grp_flg4", "ship_rqst_id_grp_flg5", "ship_rqst_id_grp_flg6", "ship_rqst_id_grp_flg7", "ship_rqst_id_grp_flg8", "ship_rqst_id_grp_flg9", "ship_rqst_id_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M03).on(S0_V1.pr(S1_T1.ship_rqst_id_cd).eq(S0_M03.bp_cd))),
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M04).on(S0_V1.pr("itm_cd").eq(S0_M04.itm_cd).and(S0_V1.pr("itm_sub1").eq(S0_M04.itm_sub1)).and(S0_V1.pr("itm_sub2").eq(S0_M04.itm_sub2)).and(S0_V1.pr("itm_sub3").eq(S0_M04.itm_sub3)))),
				when(boundOr("dlv_id_grp_flg1"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd1.as("dlv_id_grp_cd1"), S0_M021.bp_grp_nm.as("dlv_id_grp_nm1"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M021).on(S0_M02.bp_grp_cd1.eq(S0_M021.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_M021.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd1.like(bind("dlv_id_grp_cd1"))).cutoff$and(S0_M021.bp_grp_nm.like(bind("dlv_id_grp_nm1")))),
				when(boundOr("dlv_id_grp_flg2"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd2.as("dlv_id_grp_cd2"), S0_M022.bp_grp_nm.as("dlv_id_grp_nm2"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M022).on(S0_M02.bp_grp_cd2.eq(S0_M022.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_M022.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd2.like(bind("dlv_id_grp_cd2"))).cutoff$and(S0_M022.bp_grp_nm.like(bind("dlv_id_grp_nm2")))),
				when(boundOr("dlv_id_grp_flg3"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd3.as("dlv_id_grp_cd3"), S0_M023.bp_grp_nm.as("dlv_id_grp_nm3"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M023).on(S0_M02.bp_grp_cd3.eq(S0_M023.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_M023.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd3.like(bind("dlv_id_grp_cd3"))).cutoff$and(S0_M023.bp_grp_nm.like(bind("dlv_id_grp_nm3")))),
				when(boundOr("dlv_id_grp_flg4"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd4.as("dlv_id_grp_cd4"), S0_M024.bp_grp_nm.as("dlv_id_grp_nm4"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M024).on(S0_M02.bp_grp_cd4.eq(S0_M024.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_M024.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd4.like(bind("dlv_id_grp_cd4"))).cutoff$and(S0_M024.bp_grp_nm.like(bind("dlv_id_grp_nm4")))),
				when(boundOr("dlv_id_grp_flg5"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd5.as("dlv_id_grp_cd5"), S0_M025.bp_grp_nm.as("dlv_id_grp_nm5"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M025).on(S0_M02.bp_grp_cd5.eq(S0_M025.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_M025.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd5.like(bind("dlv_id_grp_cd5"))).cutoff$and(S0_M025.bp_grp_nm.like(bind("dlv_id_grp_nm5")))),
				when(boundOr("dlv_id_grp_flg6"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd6.as("dlv_id_grp_cd6"), S0_M026.bp_grp_nm.as("dlv_id_grp_nm6"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M026).on(S0_M02.bp_grp_cd6.eq(S0_M026.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_M026.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd6.like(bind("dlv_id_grp_cd6"))).cutoff$and(S0_M026.bp_grp_nm.like(bind("dlv_id_grp_nm6")))),
				when(boundOr("dlv_id_grp_flg7"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd7.as("dlv_id_grp_cd7"), S0_M027.bp_grp_nm.as("dlv_id_grp_nm7"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M027).on(S0_M02.bp_grp_cd7.eq(S0_M027.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_M027.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd7.like(bind("dlv_id_grp_cd7"))).cutoff$and(S0_M027.bp_grp_nm.like(bind("dlv_id_grp_nm7")))),
				when(boundOr("dlv_id_grp_flg8"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd8.as("dlv_id_grp_cd8"), S0_M028.bp_grp_nm.as("dlv_id_grp_nm8"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M028).on(S0_M02.bp_grp_cd8.eq(S0_M028.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_M028.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd8.like(bind("dlv_id_grp_cd8"))).cutoff$and(S0_M028.bp_grp_nm.like(bind("dlv_id_grp_nm8")))),
				when(boundOr("dlv_id_grp_flg9"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd9.as("dlv_id_grp_cd9"), S0_M029.bp_grp_nm.as("dlv_id_grp_nm9"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M029).on(S0_M02.bp_grp_cd9.eq(S0_M029.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_M029.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd9.like(bind("dlv_id_grp_cd9"))).cutoff$and(S0_M029.bp_grp_nm.like(bind("dlv_id_grp_nm9")))),
				when(boundOr("dlv_id_grp_flg10"))
					.select(DS0C_DLV_ID_GRP, S0_M02.bp_grp_cd10.as("dlv_id_grp_cd10"), S0_M0210.bp_grp_nm.as("dlv_id_grp_nm10"))
					.view(DS0C_DLV_ID_GRP, v -> v.leftOuterJoin(S0_M0210).on(S0_M02.bp_grp_cd10.eq(S0_M0210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_M0210.bp_grp_typ))))
					.predicate(DS0C_DLV_ID_GRP, p -> p.cutoff$and(S0_M02.bp_grp_cd10.like(bind("dlv_id_grp_cd10"))).cutoff$and(S0_M0210.bp_grp_nm.like(bind("dlv_id_grp_nm10")))),
				when(boundOr("ship_rqst_id_grp_flg1"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd1.as("ship_rqst_id_grp_cd1"), S0_M031.bp_grp_nm.as("ship_rqst_id_grp_nm1"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M031).on(S0_M03.bp_grp_cd1.eq(S0_M031.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_M031.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd1.like(bind("ship_rqst_id_grp_cd1"))).cutoff$and(S0_M031.bp_grp_nm.like(bind("ship_rqst_id_grp_nm1")))),
				when(boundOr("ship_rqst_id_grp_flg2"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd2.as("ship_rqst_id_grp_cd2"), S0_M032.bp_grp_nm.as("ship_rqst_id_grp_nm2"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M032).on(S0_M03.bp_grp_cd2.eq(S0_M032.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_M032.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd2.like(bind("ship_rqst_id_grp_cd2"))).cutoff$and(S0_M032.bp_grp_nm.like(bind("ship_rqst_id_grp_nm2")))),
				when(boundOr("ship_rqst_id_grp_flg3"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd3.as("ship_rqst_id_grp_cd3"), S0_M033.bp_grp_nm.as("ship_rqst_id_grp_nm3"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M033).on(S0_M03.bp_grp_cd3.eq(S0_M033.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_M033.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd3.like(bind("ship_rqst_id_grp_cd3"))).cutoff$and(S0_M033.bp_grp_nm.like(bind("ship_rqst_id_grp_nm3")))),
				when(boundOr("ship_rqst_id_grp_flg4"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd4.as("ship_rqst_id_grp_cd4"), S0_M034.bp_grp_nm.as("ship_rqst_id_grp_nm4"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M034).on(S0_M03.bp_grp_cd4.eq(S0_M034.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_M034.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd4.like(bind("ship_rqst_id_grp_cd4"))).cutoff$and(S0_M034.bp_grp_nm.like(bind("ship_rqst_id_grp_nm4")))),
				when(boundOr("ship_rqst_id_grp_flg5"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd5.as("ship_rqst_id_grp_cd5"), S0_M035.bp_grp_nm.as("ship_rqst_id_grp_nm5"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M035).on(S0_M03.bp_grp_cd5.eq(S0_M035.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_M035.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd5.like(bind("ship_rqst_id_grp_cd5"))).cutoff$and(S0_M035.bp_grp_nm.like(bind("ship_rqst_id_grp_nm5")))),
				when(boundOr("ship_rqst_id_grp_flg6"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd6.as("ship_rqst_id_grp_cd6"), S0_M036.bp_grp_nm.as("ship_rqst_id_grp_nm6"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M036).on(S0_M03.bp_grp_cd6.eq(S0_M036.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_M036.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd6.like(bind("ship_rqst_id_grp_cd6"))).cutoff$and(S0_M036.bp_grp_nm.like(bind("ship_rqst_id_grp_nm6")))),
				when(boundOr("ship_rqst_id_grp_flg7"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd7.as("ship_rqst_id_grp_cd7"), S0_M037.bp_grp_nm.as("ship_rqst_id_grp_nm7"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M037).on(S0_M03.bp_grp_cd7.eq(S0_M037.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_M037.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd7.like(bind("ship_rqst_id_grp_cd7"))).cutoff$and(S0_M037.bp_grp_nm.like(bind("ship_rqst_id_grp_nm7")))),
				when(boundOr("ship_rqst_id_grp_flg8"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd8.as("ship_rqst_id_grp_cd8"), S0_M038.bp_grp_nm.as("ship_rqst_id_grp_nm8"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M038).on(S0_M03.bp_grp_cd8.eq(S0_M038.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_M038.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd8.like(bind("ship_rqst_id_grp_cd8"))).cutoff$and(S0_M038.bp_grp_nm.like(bind("ship_rqst_id_grp_nm8")))),
				when(boundOr("ship_rqst_id_grp_flg9"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd9.as("ship_rqst_id_grp_cd9"), S0_M039.bp_grp_nm.as("ship_rqst_id_grp_nm9"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M039).on(S0_M03.bp_grp_cd9.eq(S0_M039.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_M039.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd9.like(bind("ship_rqst_id_grp_cd9"))).cutoff$and(S0_M039.bp_grp_nm.like(bind("ship_rqst_id_grp_nm9")))),
				when(boundOr("ship_rqst_id_grp_flg10"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd10.as("ship_rqst_id_grp_cd10"), S0_M0310.bp_grp_nm.as("ship_rqst_id_grp_nm10"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_M0310).on(S0_M03.bp_grp_cd10.eq(S0_M0310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_M0310.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd10.like(bind("ship_rqst_id_grp_cd10"))).cutoff$and(S0_M0310.bp_grp_nm.like(bind("ship_rqst_id_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd1.as("itm_grp_cd1"), S0_M041.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M041).on(S0_M04.itm_grp_cd1.eq(S0_M041.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_M041.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_M041.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd2.as("itm_grp_cd2"), S0_M042.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M042).on(S0_M04.itm_grp_cd2.eq(S0_M042.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_M042.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_M042.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd3.as("itm_grp_cd3"), S0_M043.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M043).on(S0_M04.itm_grp_cd3.eq(S0_M043.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_M043.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_M043.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd4.as("itm_grp_cd4"), S0_M044.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M044).on(S0_M04.itm_grp_cd4.eq(S0_M044.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_M044.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_M044.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd5.as("itm_grp_cd5"), S0_M045.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M045).on(S0_M04.itm_grp_cd5.eq(S0_M045.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_M045.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_M045.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd6.as("itm_grp_cd6"), S0_M046.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M046).on(S0_M04.itm_grp_cd6.eq(S0_M046.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_M046.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_M046.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd7.as("itm_grp_cd7"), S0_M047.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M047).on(S0_M04.itm_grp_cd7.eq(S0_M047.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_M047.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_M047.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd8.as("itm_grp_cd8"), S0_M048.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M048).on(S0_M04.itm_grp_cd8.eq(S0_M048.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_M048.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_M048.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd9.as("itm_grp_cd9"), S0_M049.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M049).on(S0_M04.itm_grp_cd9.eq(S0_M049.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_M049.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_M049.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M04.itm_grp_cd10.as("itm_grp_cd10"), S0_M0410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_M0410).on(S0_M04.itm_grp_cd10.eq(S0_M0410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_M0410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_M0410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * MSBEL1770_MST_IV_D_S02_JOIN01
	 */
	static MCDynamicSQLInfo MSBEL1770_MST_IV_D_S02_JOIN01() {
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_IV_SHIP_INST_MAP_R S1_T3 = MST_IV_SHIP_INST_MAP_R.create("T3");
		MST_SHIP_INST_D_R S1_T4 = MST_SHIP_INST_D_R.create("T4");
		MST_SLO_D_R S1_T11 = MST_SLO_D_R.create("T11");
		MCTempView S1_T12 = createTempView("T12");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.select(REP1, S1_T4.ship_inst_no, S1_T4.ship_inst_d_no, S1_T12.pr("ship_inst_qty"), S1_T4.base_unit_qty.as("sum_ship_inst_qty"), S1_T11.io_schd_pr_no,
						S1_T4.sub_char1.as("ship_inst_d_sub_char1"),S1_T4.sub_char2.as("ship_inst_d_sub_char2"), S1_T4.sub_char3.as("ship_inst_d_sub_char3"))
				.view(REP1, v -> v.innerJoin(subQuery().select(S1_T3.iv_d_no, S1_T3.ship_inst_d_no, sum(S1_T3.base_unit_qty).as("ship_inst_qty"))
						.from(S1_T3).groupBy(S1_T3.iv_d_no, S1_T3.ship_inst_d_no).view(S1_T12))
						.on(S1_T2.iv_d_no.eq(S1_T12.pr(S1_T3.iv_d_no)))
						.innerJoin(S1_T4).on(S1_T12.pr(S1_T3.ship_inst_d_no).eq(S1_T4.ship_inst_d_no))
						.leftOuterJoin(S1_T11).on(S1_T11.slo_d_no.eq(S1_T2.slo_d_no)));
	}
	
	/**
	 * MSBEL1770_MST_IV_D_S02_JOIN02
	 */
	static MCDynamicSQLInfo MSBEL1770_MST_IV_D_S02_JOIN02() {
		MST_IV_R S1_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_IV_SHIP_ACT_D_R S1_T4 = MST_IV_SHIP_ACT_D_R.create("T4");
		MST_SHIP_ACT_D_R S1_T11 = MST_SHIP_ACT_D_R.create("T11");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.select(REP1, S1_T11.ship_act_no, S1_T4.ship_act_d_no, S1_T4.base_unit_qty.as("ship_act_qty"), S1_T4.io_schd_pr_no,
						nullValue().as("ship_act_d_sub_char1"),nullValue().as("ship_act_d_sub_char2"),nullValue().as("ship_act_d_sub_char3"),
						S1_T4.sub_char1.as("iv_ship_act_d_sub_char1"),S1_T4.sub_char2.as("iv_ship_act_d_sub_char2"), S1_T4.sub_char3.as("iv_ship_act_d_sub_char3"))
				.view(REP1, v -> v.innerJoin(S1_T4).on(S1_T2.iv_d_no.eq(S1_T4.iv_d_no))
						.leftOuterJoin(S1_T11).on(S1_T4.ship_act_d_no.eq(S1_T11.ship_act_d_no)))
				.predicate(REP1, p -> p.and(S1_T1.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value()))));
	}
	
	/**
	 * MSBEL1770_MST_IV_D_S02_JOIN03
	 */
	static MCDynamicSQLInfo MSBEL1770_MST_IV_D_S02_JOIN03() {
		MST_IV_R S1_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_IV_SHIP_ACT_MAP_R S1_T3 = MST_IV_SHIP_ACT_MAP_R.create("T3");
		MST_SHIP_ACT_D_R S1_T4 = MST_SHIP_ACT_D_R.create("T4");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.select(REP1, S1_T4.ship_act_no, S1_T4.ship_act_d_no, S1_T3.base_unit_qty.as("ship_act_qty"), S1_T4.io_schd_pr_no,
						S1_T4.sub_char1.as("ship_act_d_sub_char1"),S1_T4.sub_char2.as("ship_act_d_sub_char2"), S1_T4.sub_char3.as("ship_act_d_sub_char3"),
						nullValue().as("iv_ship_act_d_sub_char1"),nullValue().as("iv_ship_act_d_sub_char2"),nullValue().as("iv_ship_act_d_sub_char3"))
				.view(REP1, v -> v.innerJoin(S1_T3).on(S1_T2.iv_d_no.eq(S1_T3.iv_d_no))
						.innerJoin(S1_T4).on(S1_T3.ship_act_d_no.eq(S1_T4.ship_act_d_no)))
				.predicate(REP1, p -> p.and(S1_T1.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))));
	}
	
	/**
	 * MSBEL1770_MST_IV_D_S02_JOIN04
	 */
	static MCDynamicSQLInfo MSBEL1770_MST_IV_D_S02_JOIN04() {
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_SLS_ACT_D_R S1_T3 = MST_SLS_ACT_D_R.create("T3");
		MCTempView S1_T4 = createTempView("T4");
		MST_SLO_D_R S1_T11 = MST_SLO_D_R.create("T11");
		MST_SLS_ACT_R S1_T12 = MST_SLS_ACT_R.create("T12");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.select(REP1, S1_T4.pr("sls_act_no"), S1_T4.pr("sls_act_d_no"), S1_T4.pr("base_unit_qty").as("sls_qty"), S1_T11.io_schd_pr_no,
						S1_T4.pr("sub_char1").as("sls_act_d_sub_char1"),S1_T4.pr("sub_char2").as("sls_act_d_sub_char2"), S1_T4.pr("sub_char3").as("sls_act_d_sub_char3"))
				.view(REP1, v -> v.innerJoin(subQuery().select(S1_T3.prAll(), S1_T3.loc_cd.as("ship_loc_cd"), S1_T3.str_ln_cd.as("ship_str_ln_cd"),
						nullValue().as("ver_no"), nullValue().as("stk_arrv_bp_cd"), nullValue().as("stk_id_typ"), nullValue().as("stk_bp_cd"), nullValue().as("quality_typ"), nullValue().as("stk_insp_typ"))
						.from(S1_T3).view(S1_T4))
						.on(S1_T2.iv_d_no.eq(S1_T4.pr("iv_d_no")))
						.leftOuterJoin(S1_T11).on(S1_T11.slo_d_no.eq(S1_T2.slo_d_no))
						.leftOuterJoin(S1_T12).on(S1_T12.sls_act_no.eq(S1_T4.pr("sls_act_no"))
								.and(S1_T12.sls_act_seq.eq(S1_T4.pr("sls_act_seq")))))
				.predicate(REP1, p -> p.and(S1_T12.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
	}
	/**
	 * -- MSBEL1770_MST_IV_D_Query_S03
	 */
	static MCQueryPlan MSBEL1770_MST_IV_D_S03() {
		MST_IV_D_P_R IV_D_P1 = MST_IV_D_P_R.create("IV_D_P1");
		MST_IV_P_R IV_P1 = MST_IV_P_R.create("IV_P1");
		MSW_IV_D_KEY_R IV_D_KEY1 = MSW_IV_D_KEY_R.create("IV_D_KEY1");
		MSW_IV_D_KEY_R IV_D_KEY2 = MSW_IV_D_KEY_R.create("IV_D_KEY2");
		MSW_IV_D_KEY_R IV_D_KEY3 = MSW_IV_D_KEY_R.create("IV_D_KEY3");
		MSW_IV_D_KEY_R IV_D_KEY4 = MSW_IV_D_KEY_R.create("IV_D_KEY4");
		MSW_IV_D_KEY_R IV_D_KEY5 = MSW_IV_D_KEY_R.create("IV_D_KEY5");
		MST_SLO_D_R SLO_D1 = MST_SLO_D_R.create("SLO_D1");
		MCTempView VIEW1 = createTempView("VIEW1");
		MCTempView VIEW2 = createTempView("VIEW2");
		MCTempView VIEW3 = createTempView("VIEW3");
		MCTempView VIEW4 = createTempView("VIEW4");
		MST_IV_SHIP_INST_MAP_R SHIP_INST_MAP1 = MST_IV_SHIP_INST_MAP_R.create("SHIP_INST_MAP1");
		MST_IV_SHIP_ACT_D_R IV_SHIP_ACT_D1 = MST_IV_SHIP_ACT_D_R.create("IV_SHIP_ACT_D1");
		MST_IV_SHIP_ACT_MAP_R SHIP_ACT_MAP1 = MST_IV_SHIP_ACT_MAP_R.create("SHIP_ACT_MAP1");
		MST_SLS_ACT_D_R SLS_ACT_D1 = MST_SLS_ACT_D_R.create("SLS_ACT_D1");
		MST_SLS_ACT_R SLS_ACT1 = MST_SLS_ACT_R.create("SLS_ACT1");
		MST_IV_P_R IV_D_P2 = MST_IV_P_R.create("IV_D_P2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1770_MST_IV_D_Query_S03")
					.mainQuery()
					.select(
						IV_D_P1.iv_d_no,
						IV_D_P1.base_unit_qty,
						nvl(VIEW1.pr("ship_inst_qty"), value(0)).as("ship_inst_qty"),
						nvl(
							cases()
								.when(IV_P1.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())))
									.then(VIEW2.pr("ship_act_qty"))
							.otherwise(VIEW3.pr("ship_act_qty"))
							,value(0)
						).as("ship_act_qty"),
						nvl(VIEW4.pr("sls_qty"), value(0)).as("sls_qty"),
						IV_P1.trd_ptn_typ,
						SLO_D1.ship_inst_typ,
						SLO_D1.proc_typ,
						SLO_D1.sls_cststk_flg,
						SLO_D1.vmi_flg
					)
					.from(
						IV_D_P1
						.innerJoin(IV_D_KEY1).on(
							IV_D_KEY1.iv_d_no.eq(IV_D_P1.iv_d_no)
						)
						.innerJoin(IV_P1).on(
							IV_P1.iv_mng_no.eq(IV_D_P1.iv_mng_no)
							.and(IV_P1.iv_rev.eq(IV_D_P1.iv_rev))
						)
						.leftOuterJoin(SLO_D1).on(SLO_D1.slo_d_no.eq(IV_D_P1.slo_d_no))
						.leftOuterJoin(
							subQuery()
							.select(SHIP_INST_MAP1.iv_d_no, sum(SHIP_INST_MAP1.base_unit_qty).as("ship_inst_qty"))
							.from(
								SHIP_INST_MAP1
								.innerJoin(IV_D_KEY2).on(IV_D_KEY2.iv_d_no.eq(SHIP_INST_MAP1.iv_d_no))
							)
							.groupBy(SHIP_INST_MAP1.iv_d_no)
							.view(VIEW1)
						).on(IV_D_P1.iv_d_no.eq(VIEW1.pr(SHIP_INST_MAP1.iv_d_no)))
						.leftOuterJoin(
							subQuery()
							.select(IV_SHIP_ACT_D1.iv_d_no.as("iv_d_no"), value(MAC_VIA_DLV_TYP.NOT_VIA.value()).as("via_dlv_typ"), sum(IV_SHIP_ACT_D1.base_unit_qty).as("ship_act_qty"))
							.from(
								IV_SHIP_ACT_D1
								.innerJoin(IV_D_KEY3).on(IV_D_KEY3.iv_d_no.eq(IV_SHIP_ACT_D1.iv_d_no))
							)
							.groupBy(IV_SHIP_ACT_D1.iv_d_no)
							.view(VIEW2)
						).on(IV_D_P1.iv_d_no.eq(VIEW2.pr("iv_d_no")))
						.leftOuterJoin(
							subQuery()
							.select(SHIP_ACT_MAP1.iv_d_no.as("iv_d_no"), sum(SHIP_ACT_MAP1.base_unit_qty).as("ship_act_qty"))
							.from(
								SHIP_ACT_MAP1
								.innerJoin(IV_D_KEY4).on(IV_D_KEY4.iv_d_no.eq(SHIP_ACT_MAP1.iv_d_no))
							)
							.groupBy(SHIP_ACT_MAP1.iv_d_no)
							.view(VIEW3)
						).on(IV_D_P1.iv_d_no.eq(VIEW3.pr("iv_d_no")))
						.leftOuterJoin(
							subQuery()
							.select(SLS_ACT_D1.iv_d_no, sum(SLS_ACT_D1.base_unit_qty).as("sls_qty"))
							.from(
								SLS_ACT_D1
								.innerJoin(IV_D_KEY5).on(IV_D_KEY5.iv_d_no.eq(SLS_ACT_D1.iv_d_no))
								.innerJoin(SLS_ACT1).on(SLS_ACT1.sls_act_no.eq(SLS_ACT_D1.sls_act_no)
										.and(SLS_ACT1.sls_act_seq.eq(SLS_ACT_D1.sls_act_seq)))
							)
							.where(SLS_ACT1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.groupBy(SLS_ACT_D1.iv_d_no)
							.view(VIEW4)
						).on(IV_D_P1.iv_d_no.eq(VIEW4.pr(SLS_ACT_D1.iv_d_no)))
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(IV_D_P2)
								.where(
									IV_D_P2.iv_mng_no.eq(IV_D_P1.iv_mng_no)
									.and(IV_D_P2.iv_rev.gt(IV_D_P1.iv_rev))
								)
							)
						)
					)
			);
	}
}