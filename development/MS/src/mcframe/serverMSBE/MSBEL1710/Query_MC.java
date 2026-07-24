package mcframe.serverMSBE.MSBEL1710;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

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
	
	static MCJoinerList<?> MSBEL1710_Ship_RsltR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_ITM_LCL_R.class, r -> toCondition(
					r.getStringNE("itm_cd"),
					r.getStringNE("itm_sub1"),
					r.getStringNE("itm_sub2"),
					r.getStringNE("itm_sub3"),
					r.getStringNE("prnt_lcl_cd")
				))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					String finalItmNm;
					if (r.getBooleanNE("sundry_itm_flg")) {
						finalItmNm = r.getString("sundry_iv_itm_nm");
					} else if (!isNull(m.itm_nm())) {
						finalItmNm = m.itm_nm();
					} else {
						finalItmNm = r.getString("itm_nm");
					}
					r.setStringNE("iv_itm_nm", finalItmNm);
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.getStringNE("ship_rqst_id_cd")
				))
				.addSelect(m -> toArray(
					m.acst_cd, m.cst_flg
				))
				.addMap((r, m) -> {
					if (m.cst_flg() && !isNull(m.acst_cd())) {
						r.setStringNE("s3_acst_cd", m.acst_cd()); 
					}
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.getStringNE("s3_acst_cd")
				))
				.addSelect(m -> toArray(
					m.bcst_cd, m.acst_flg
				))
				.addMap((r, m) -> {
					if (m.acst_flg() && !isNull(m.bcst_cd())) {
						r.setStringNE("s2_bcst_cd", m.bcst_cd());
					}
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.getStringNE("s2_bcst_cd")
				))
				.addSelect(m -> toArray(
					m.bill_cl_typ
				))
				.addMap((r, m) -> {
					r.setStringNE("bill_cl_typ", m.bill_cl_typ());
				}),
			j -> j
				.add(MSVT_WRK_SNO_R.class, r -> toCondition(
					r.getStringNE("sno1")
				))
				.addSelect(m -> toArray(
					m.wrk_no, m.wrk_nm
				))
				.addMap((r, m) -> {
					r.setStringNE("wrk_no", m.wrk_no());
					r.setStringNE("wrk_nm", m.wrk_nm());
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
				.add(MAM_TAX_R.class, r -> toCondition(
					r.getStringNE("tax_cd")
				))
				.addSelect(m -> toArray(
					m.tax_nm, m.tax_rate, m.inc_tax_flg
				))
				.addMap((r, m) -> {
					r.setStringNE("tax_nm", m.tax_nm());
					r.setNumberNE("tax_rate", m.tax_rate());
					r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
				.add(MAM_CUR_R.class, r -> toCondition(
					r.getStringNE("trd_cur_cd")
				))
				.addSelect(m -> toArray(
					m.cur_nm, m.amt_dec_place, m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.setStringNE("trd_cur_nm", m.cur_nm());
					r.setNumberNE("amt_dec_place", m.amt_dec_place());
					r.setNumberNE("upri_dec_place", m.upri_dec_place());
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
					m.conv_base_qty, m.conv_qty, m.dec_place, m.rnd_typ
				))
				.addMap((r, m) -> {
					r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
					r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					r.setNumberNE("trd_unit_dec_place", m.dec_place());
					r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.getStringNE("itm_cd"),
					r.getStringNE("itm_sub1"),
					r.getStringNE("itm_sub2"),
					r.getStringNE("itm_sub3"),
					r.getStringNE("base_unit_cd")
				))
				.addSelect(m -> toArray(
					m.dec_place, m.rnd_typ
				))
				.addMap((r, m) -> {
					r.setNumberNE("base_unit_dec_place", m.dec_place());
					r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
					r.getStringNE("schd_trd_unit_cd")
				))
				.addSelect(m -> toArray(
					m.dec_place, m.conv_base_qty, m.conv_qty, m.rnd_typ
				))
				.addMap((r, m) -> {
					r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
					r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
					r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
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
				})
		);
	}
	
	/**
	 * -- MSBEL1710_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1710_MST_SHIP_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_M03 = MAM_BP_R.create("M03");
		MAM_BP_R S0_M04 = MAM_BP_R.create("M04");
		MAM_BP_GRP_R S0_MMS1 = MAM_BP_GRP_R.create("MMS1");
		MAM_BP_GRP_R S0_MMS2 = MAM_BP_GRP_R.create("MMS2");
		MAM_BP_GRP_R S0_MMS3 = MAM_BP_GRP_R.create("MMS3");
		MAM_BP_GRP_R S0_MMS4 = MAM_BP_GRP_R.create("MMS4");
		MAM_BP_GRP_R S0_MMS5 = MAM_BP_GRP_R.create("MMS5");
		MAM_BP_GRP_R S0_MMS6 = MAM_BP_GRP_R.create("MMS6");
		MAM_BP_GRP_R S0_MMS7 = MAM_BP_GRP_R.create("MMS7");
		MAM_BP_GRP_R S0_MMS8 = MAM_BP_GRP_R.create("MMS8");
		MAM_BP_GRP_R S0_MMS9 = MAM_BP_GRP_R.create("MMS9");
		MAM_BP_GRP_R S0_MMS10 = MAM_BP_GRP_R.create("MMS10");
		MAM_BP_GRP_R S0_MMD1 = MAM_BP_GRP_R.create("MMD1");
		MAM_BP_GRP_R S0_MMD2 = MAM_BP_GRP_R.create("MMD2");
		MAM_BP_GRP_R S0_MMD3 = MAM_BP_GRP_R.create("MMD3");
		MAM_BP_GRP_R S0_MMD4 = MAM_BP_GRP_R.create("MMD4");
		MAM_BP_GRP_R S0_MMD5 = MAM_BP_GRP_R.create("MMD5");
		MAM_BP_GRP_R S0_MMD6 = MAM_BP_GRP_R.create("MMD6");
		MAM_BP_GRP_R S0_MMD7 = MAM_BP_GRP_R.create("MMD7");
		MAM_BP_GRP_R S0_MMD8 = MAM_BP_GRP_R.create("MMD8");
		MAM_BP_GRP_R S0_MMD9 = MAM_BP_GRP_R.create("MMD9");
		MAM_BP_GRP_R S0_MMD10 = MAM_BP_GRP_R.create("MMD10");
		MST_SHIP_SCHD_R S4_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S4_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S4_T3 = MST_SLO_D_R.create("T3");
		MST_SLO_R S4_T4 = MST_SLO_R.create("T4");
		MST_SHIP_INST_D_R S4_T6 = MST_SHIP_INST_D_R.create("T6");
		MST_PROV_SCHD_R S4_T8 = MST_PROV_SCHD_R.create("T8");
		MST_XFR_SCHD_R S4_T9 = MST_XFR_SCHD_R.create("T9");
		MST_SHIP_INST_R S4_T10 = MST_SHIP_INST_R.create("T10");
		MAM_ITM_R S4_M1 = MAM_ITM_R.create("M1");
		MAM_TRD_R S4_M3 = MAM_TRD_R.create("M3");
		MAM_LG_GRP_R S4_M13 = MAM_LG_GRP_R.create("M13");
		MAM_SUNDRY_ITM_R S4_M14 = MAM_SUNDRY_ITM_R.create("M14");
		MAM_BP_R S4_M16 = MAM_BP_R.create("M16");
		MAM_LOC_R S4_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S4_M20 = MAM_BP_R.create("M20");
		MAM_BP_R S4_M21 = MAM_BP_R.create("M21");
		MAM_ITM_TYP_D_R S4_M24 = MAM_ITM_TYP_D_R.create("M24");
		MAM_DPT_R S4_M25 = MAM_DPT_R.create("M25");
		MAM_LOC_R S4_M31 = MAM_LOC_R.create("M31");
		MSVM_SHIP_TO_ID_R S4_M32 = MSVM_SHIP_TO_ID_R.create("M32");
		MAM_ITM_LG_GRP_R S4_M38 = MAM_ITM_LG_GRP_R.create("M38");
		MAM_LOC_R S4_M39 = MAM_LOC_R.create("M39");
		MAM_ITM_GRP_R S4_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S4_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S4_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S4_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S4_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S4_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S4_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S4_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S4_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S4_MM10 = MAM_ITM_GRP_R.create("MM10");
		MAVM_RD_WG_R S5_M90 = MAVM_RD_WG_R.create("M90");
		MAVM_RD_LOC_R S6_M92 = MAVM_RD_LOC_R.create("M92");
		MST_SLS_SCHD_R S7_TX1 = MST_SLS_SCHD_R.create("TX1");
		MST_PURC_SCHD_R S7_TX2 = MST_PURC_SCHD_R.create("TX2");
		MST_ARR_PR_R S7_TX3 = MST_ARR_PR_R.create("TX3");
		MST_PO_D_R S7_TX4 = MST_PO_D_R.create("TX4");
		MST_PO_R S7_TX5 = MST_PO_R.create("TX5");
		MAM_BP_R S7_TX6 = MAM_BP_R.create("TX6");
		MAM_LG_CTL_R S8_M02 = MAM_LG_CTL_R.create("M02");
		
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_SHIP_RQST_ID_GRP = createDynamicSQLID("DS0C_SHIP_RQST_ID_GRP");
		MCDynamicSQLID DS4C_ITM_GRP = createDynamicSQLID("DS4C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1710_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						addDynamicSelect(DS0C_SHIP_RQST_ID_GRP),
						addDynamicSelect(DS0C_DLV_GRP)
					)
					.from(
						subQuery()
						.select(
							S4_T1.pr_sts_typ,
							S4_T4.slo_no,
							S4_T4.iv_no.as("slo_iv_no"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T3.slo_d_no)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_T3.slo_d_no)
								.otherwise(S4_T2.xfr_schd_no).as("ship_rqst_no"),
							S4_T3.sls_cststk_flg,
							S4_T4.cst_po_no,
							S4_T3.cst_po_d_no,
							S4_T1.ship_schd_no,
							S4_T1.re_ship_schd_flg,
							S4_M1.itm_typ,
							S4_M1.itm_typ_d_cd,
							S4_M24.itm_typ_d_nm,
							S4_T1.itm_cd,
							S4_T1.itm_sub1,
							S4_T1.itm_sub2,
							S4_T1.itm_sub3,
							cases()
								.when(S4_T1.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S4_T1.itm_nm,
											S4_M14.itm_nm
										)
								)
								.otherwise(S4_M1.itm_nm).as("itm_nm"),
							nvl(
								S4_T1.iv_itm_nm,
								S4_M14.itm_nm
							).as("sundry_iv_itm_nm"),
							S4_T1.sno1,
							S4_T1.sno2,
							S4_T1.sno3,
							S4_T1.sno4,
							decode(
									S4_T3.trd_unit_cd,
									nullValue(),
									S4_T1.trd_unit_cd,
									S4_T3.trd_unit_cd
							).as("trd_unit_cd"),
							S4_T1.base_unit_cd,
							bracket(
								S4_T1.base_unit_qty.subtract(S4_T1.abort_qty).subtract(S4_T1.iv_schd_qty).subtract(S4_T1.ship_ret_qty)
							).as("base_unit_qty"),
							nullValue().as("trd_unit_qty"),
							S4_T2.trd_cd,
							S4_M3.trd_nm,
							S4_M3.trd_ptn_typ,
							S4_T3.interim_flg,
							S4_T3.dscnt_rsn_cd,
							S4_T3.iv_upri,
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.tax_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T8.tax_cd,
								nullValue()
							).as("tax_cd"),
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.tax_fix_flg,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T8.tax_fix_flg,
								nullValue()
							).as("tax_fix_flg"),
							S4_T2.dlv_id_typ,
							nvl(
								S4_T1.dlv_cd,
								S4_T2.dlv_id_cd
							).as("dlv_id_cd"),
							nvl2(
								S4_T1.dlv_cd,
								nvl(
									S4_T1.dlv_nm,
									S4_M16.bp_nm
								),
								cases()
									.when(S4_T2.dlv_sundry_flg.eq(value(false)))
										.then(
											cases()
												.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
													.then(S4_M16.bp_nm)
												.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
													.then(S4_M16.bp_nm)
												.otherwise(S4_M17.loc_nm)
									)
									.otherwise(S4_T2.dlv_id_nm)
							).as("dlv_id_nm"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_sundry_flg,
								S4_T2.dlv_sundry_flg
							).as("dlv_sundry_flg"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_zip_cd,
								S4_T2.dlv_zip_cd
							).as("dlv_zip_cd"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_addr1,
								S4_T2.dlv_addr1
							).as("dlv_addr1"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_addr2,
								S4_T2.dlv_addr2
							).as("dlv_addr2"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_addr3,
								S4_T2.dlv_addr3
							).as("dlv_addr3"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_addr4,
								S4_T2.dlv_addr4
							).as("dlv_addr4"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_cntct_dpt,
								S4_T2.dlv_cntct_dpt
							).as("dlv_cntct_dpt"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_cntct_psn,
								S4_T2.dlv_cntct_psn
							).as("dlv_cntct_psn"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_tel,
								S4_T2.dlv_tel
							).as("dlv_tel"),
							nvl2(
								S4_T1.dlv_cd,
								S4_T1.dlv_fax,
								S4_T2.dlv_fax
							).as("dlv_fax"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_M16.cntry_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_M16.cntry_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_M17.cntry_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_M17.cntry_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_M17.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.SPPL.value()))
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.otherwise(nullValue()).as("ship_rqst_id_typ"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T2.cst_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_T2.cst_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_M17.sppl_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.gr_loc_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.gr_loc_cd)
								.otherwise(nullValue()).as("ship_rqst_id_cd"),
							S4_M20.sls_upri_cng_flg,
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_M20.bp_nm)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_M20.bp_nm)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_M21.bp_nm)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_M31.loc_nm)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_M31.loc_nm)
								.otherwise(nullValue()).as("ship_rqst_id_nm"),
							trunc(
								S4_T1.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S4_T1.ship_schd_tm.as("ship_schd_hm"),
							nvl(
								nvl(
									S4_T1.pd_inst_dlv_tm,
									S4_T2.dlv_rqst_tm
								),
								nvl(
									S4_T3.dlv_rqst_tm,
									S4_T9.gr_rqst_tm
								)
							).as("dlv_rqst_tm"),
							trunc(
								nvl(
									nvl(
										S4_T1.pd_inst_dlv_tm,
										S4_T2.dlv_rqst_tm
									),
									nvl(
										S4_T3.dlv_rqst_tm,
										S4_T9.gr_rqst_tm
									)
								),
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							nvl(
								nvl(
									S4_T1.pd_inst_dlv_tm,
									S4_T2.dlv_rqst_tm
								),
								nvl(
									S4_T3.dlv_rqst_tm,
									S4_T9.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
							nvl(
								S4_T1.via_dlv_typ,
								S4_T2.via_dlv_typ
							).as("via_dlv_typ"),
							nvl(
								S4_T1.tdlv_cd,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_id_cd,
									nullValue()
								)
							).as("tdlv_cd"),
							nvl2(
								S4_T1.tdlv_cd,
								nvl(
									S4_T1.tdlv_nm,
									S4_M32.ship_to_id_nm
								),
								cases()
									.when(S4_T2.ship_to_sundry_flg.eq(value(false)))
										.then(S4_M32.ship_to_id_nm)
									.otherwise(
										decode(
											S4_T2.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S4_T2.ship_to_id_nm,
											nullValue()
										)
									)
							).as("tdlv_nm"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_lg_grp_cd,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_lg_grp_cd,
									nullValue()
								)
							).as("tdlv_lg_grp_cd"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_sundry_flg,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_sundry_flg,
									value(false)
								)
							).as("tdlv_sundry_flg"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_zip_cd,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_zip_cd,
									nullValue()
								)
							).as("tdlv_zip_cd"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_addr1,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_addr1,
									nullValue()
								)
							).as("tdlv_addr1"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_addr2,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_addr2,
									nullValue()
								)
							).as("tdlv_addr2"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_addr3,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_addr3,
									nullValue()
								)
							).as("tdlv_addr3"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_addr4,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_addr4,
									nullValue()
								)
							).as("tdlv_addr4"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_tel,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_tel,
									nullValue()
								)
							).as("tdlv_tel"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_fax,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_fax,
									nullValue()
								)
							).as("tdlv_fax"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_cntct_dpt,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_cntct_dpt,
									nullValue()
								)
							).as("tdlv_cntct_dpt"),
							nvl2(
								S4_T1.tdlv_cd,
								S4_T1.tdlv_cntct_psn,
								decode(
									S4_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_T2.ship_to_cntct_psn,
									nullValue()
								)
							).as("tdlv_cntct_psn"),
							S4_T4.trnspt_cd,
							S4_T4.vssl_flght,
							S4_T4.load_port_cd,
							S4_T4.etd_dt,
							S4_T4.dschrg_port_cd,
							S4_T4.eta_dt,
							S4_T4.via_port_cd,
							S4_T4.via_schd_dt,
							S4_T4.sls_basis_typ,
							S4_T9.prov_basis_typ,
							S4_T4.tterm_cd1,
							S4_T4.tterm_rmrks1,
							S4_T4.tterm_cd2,
							S4_T4.tterm_rmrks2,
							S4_T4.tterm_cd3,
							S4_T4.tterm_rmrks3,
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T4.trd_cur_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_T8.trd_cur_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.trd_cur_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.trd_cur_cd)
								.otherwise(nullValue()).as("trd_cur_cd"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T4.xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_T8.xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.xrate_inpt_flg)
								.otherwise(nullValue()).as("xrate_inpt_flg"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T4.xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_T8.xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.xrate)
								.otherwise(nullValue()).as("xrate"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T4.ptax_xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_T8.ptax_xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.ptax_xrate_inpt_flg)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.ptax_xrate_inpt_flg)
								.otherwise(nullValue()).as("ptax_xrate_inpt_flg"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_T4.ptax_xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_T8.ptax_xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_T9.ptax_xrate)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_T9.ptax_xrate)
								.otherwise(nullValue()).as("ptax_xrate"),
							S4_T6.ship_inst_no,
							S4_T6.ship_inst_d_no,
							trunc(
									S4_T10.ship_inst_tm,
									MCDateFmt.DD
								).as("ship_inst_dt"),
							S4_T10.ship_inst_tm.as("ship_inst_hm"),
							S4_T1.ship_fr_lg_grp_cd,
							S4_M13.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S4_T3.cst_itm_cd,
							S4_T3.cst_itm_nm,
							S4_T1.sundry_itm_flg,
							S4_M1.sno1_mng_typ,
							S4_M1.sno2_mng_typ,
							S4_M1.sno3_mng_typ,
							S4_M1.sno4_mng_typ,
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_T3.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.trd_unit_cd,
								nullValue()
							).as("schd_trd_unit_cd"),
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_T3.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.trd_unit_qty,
								nullValue()
							).as("schd_trd_unit_qty"),
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.base_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_T3.base_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.base_unit_qty,
								nullValue()
							).as("schd_base_unit_qty"),
							S4_T3.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
							S4_T3.iv_amt.as("schd_iv_amt"),
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.trd_cur_upri,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.trd_cur_upri,
								nullValue()
							).as("schd_trd_cur_upri"),
							S4_T3.upri_not_tgt_flg,
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.trd_cur_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.trd_cur_amt,
								nullValue()
							).as("schd_trd_cur_amt"),
							decode(
								S4_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_T3.trd_cur_tax_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_T9.trd_cur_tax_amt,
								nullValue()
							).as("schd_trd_cur_tax_amt"),
							nvl(
								decode(
									S4_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_M20.sls_amt_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_M21.prov_amt_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("amt_rnd_typ"),
							nvl(
								decode(
									S4_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_M20.sls_upri_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_M21.sls_upri_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("upri_rnd_typ"),
							nvl(
								decode(
									S4_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_M20.sls_tax_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_M21.prov_tax_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("tax_rnd_typ"),
							cases()
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_M16.prnt_lcl_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_M16.prnt_lcl_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_M17.prnt_lcl_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_M17.prnt_lcl_cd)
								.when(S4_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_M17.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S4_T2.cst_cd,
							S4_M17.lg_grp_cd.as("ship_to_lg_grp_cd"),
							S4_T2.purc_ddlv_flg,
							S4_T1.ship_term_cd,
							S4_M20.ar_dpt_typ,
							MAPA_BP$F_GET_AR_DPT_CD_NE(
								S4_M20.bp_cd,
								bind("today"),
								value(false)
							).as("lnk_ar_dpt_cd"),
							S4_T1.ins_usr_id,
							S4_T1.ins_usr_nm,
							S4_T1.ins_func_id,
							nullValue().as("ins_func_nm"),
							S4_T1.ins_ts,
							S4_T1.upd_usr_id,
							S4_T1.upd_usr_nm,
							S4_T1.upd_func_id,
							nullValue().as("upd_func_nm"),
							S4_T1.upd_ts,
							S4_T1.upd_srv_req_no,
							addDynamicSelect(DS4C_ITM_GRP)
						)
						.from(
							S4_T1
							.innerJoin(S4_T2).on(S4_T1.ship_pr_no.eq(S4_T2.ship_pr_no))
							.leftOuterJoin(S4_T3).on(S4_T2.slo_d_no.eq(S4_T3.slo_d_no))
							.leftOuterJoin(S4_T4).on(S4_T3.slo_no.eq(S4_T4.slo_no))
							.leftOuterJoin(S4_T6).on(S4_T1.ship_inst_d_no.eq(S4_T6.ship_inst_d_no))
							.leftOuterJoin(S4_T10).on(S4_T6.ship_inst_no.eq(S4_T10.ship_inst_no))
							.leftOuterJoin(S4_T8).on(
								bracket(
									S4_T1.ship_schd_no.eq(S4_T8.prov_src_schd_no1)
									.and(MAC_TRD_PTN_TYP$IS_PROV(S4_T8.trd_ptn_typ).eq(value(true)))
								)
							)
							.leftOuterJoin(S4_T9).on(
								bracket(
									S4_T2.xfr_schd_no.eq(S4_T9.xfr_schd_no)
								)
							)
							.leftOuterJoin(S4_M1).on(
								bracket(
									S4_T1.itm_cd.eq(S4_M1.itm_cd)
									.and(S4_T1.itm_sub1.eq(S4_M1.itm_sub1))
									.and(S4_T1.itm_sub2.eq(S4_M1.itm_sub2))
									.and(S4_T1.itm_sub3.eq(S4_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S4_M3).on(S4_T2.trd_cd.eq(S4_M3.trd_cd))
							.leftOuterJoin(S4_M13).on(S4_T1.ship_fr_lg_grp_cd.eq(S4_M13.lg_grp_cd))
							.leftOuterJoin(S4_M14).on(
								bracket(
									S4_T1.itm_cd.eq(S4_M14.itm_cd)
									.and(S4_T1.itm_sub1.eq(S4_M14.itm_sub1))
									.and(S4_T1.itm_sub2.eq(S4_M14.itm_sub2))
									.and(S4_T1.itm_sub3.eq(S4_M14.itm_sub3))
									.and(S4_T1.sno1.eq(S4_M14.sno1))
									.and(S4_T1.sno2.eq(S4_M14.sno2))
									.and(S4_T1.sno3.eq(S4_M14.sno3))
									.and(S4_T1.sno4.eq(S4_M14.sno4))
								)
							)
							.leftOuterJoin(S4_M16).on(
								nvl(
									S4_T1.dlv_cd,
									S4_T2.dlv_id_cd
								).eq(S4_M16.bp_cd)
							)
							.leftOuterJoin(S4_M17).on(S4_T2.dlv_id_cd.eq(S4_M17.loc_cd))
							.leftOuterJoin(S4_M20).on(S4_T2.cst_cd.eq(S4_M20.bp_cd))
							.leftOuterJoin(S4_M21).on(S4_M17.sppl_cd.eq(S4_M21.bp_cd))
							.leftOuterJoin(S4_M24).on(
								bracket(
									S4_M1.itm_typ.eq(S4_M24.itm_typ)
									.and(S4_M1.itm_typ_d_cd.eq(S4_M24.itm_typ_d_cd))
								)
							)
							.leftOuterJoin(S4_M25).on(
								bracket(
									S4_T4.sls_dpt_cd.eq(S4_M25.dpt_cd)
									.and(S4_T4.slo_dt.between(S4_M25.st_dt, S4_M25.end_dt))
								)
							)
							.leftOuterJoin(S4_M31).on(S4_T9.gr_loc_cd.eq(S4_M31.loc_cd))
							.leftOuterJoin(S4_M32).on(
								bracket(
									S4_T2.ship_to_id_typ.eq(S4_M32.ship_to_id_typ)
									.and(
										nvl(
											S4_T1.tdlv_cd,
											S4_T2.ship_to_id_cd
										).eq(S4_M32.ship_to_id_cd)
									)
									.and(S4_T2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								)
							)
							.leftOuterJoin(S4_M38).on(
								bracket(
									S4_T9.itm_cd.eq(S4_M38.itm_cd)
									.and(S4_T9.itm_sub1.eq(S4_M38.itm_sub1))
									.and(S4_T9.itm_sub2.eq(S4_M38.itm_sub2))
									.and(S4_T9.itm_sub3.eq(S4_M38.itm_sub3))
									.and(S4_T9.gi_lg_grp_cd.eq(S4_M38.lg_grp_cd))
								)
							)
							.leftOuterJoin(S4_M39).on(
								bracket(
									S4_T9.gi_lg_grp_cd.eq(S4_M39.lg_grp_cd)
									.and(S4_M39.lg_def_flg.eq(value(true)))
									.and(S4_M39.del_flg.eq(value(false)))
								)
							)
							.addDynamicView(DS4C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S4_T1.pr_sts_typ.like(bind("pr_sts_typ")))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S5_M90)
									.where(
										S4_M25.wg_cd.eq(S5_M90.wg_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_M92)
										.where(
											coalesce(
												S4_T9.gi_loc_cd,
												S4_M38.lg_def_loc_cd,
												S4_M39.loc_cd
											).eq(S6_M92.loc_cd)
										)
									)
								)
							)
							.and(
								S4_T2.purc_ddlv_flg.eq(value(false))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S7_TX1
											.innerJoin(S7_TX2).on(
												bracket(
													S7_TX1.purc_schd_no.eq(S7_TX2.purc_schd_no)
												)
											)
											.innerJoin(S7_TX3).on(
												bracket(
													S7_TX2.arr_pr_no.eq(S7_TX3.arr_pr_no)
												)
											)
											.innerJoin(S7_TX4).on(
												bracket(
													S7_TX3.po_d_no.eq(S7_TX4.po_d_no)
												)
											)
											.innerJoin(S7_TX5).on(
												bracket(
													S7_TX4.po_no.eq(S7_TX5.po_no)
												)
											)
											.leftOuterJoin(S7_TX6).on(
												bracket(
													S7_TX5.sppl_cd.eq(S7_TX6.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S4_T1.ship_schd_no.eq(S7_TX1.ship_schd_no))
											.and(S7_TX1.cmpl_flg.eq(value(false)))
											.and(S7_TX1.purc_schd_no.isNotNull())
											.and(S7_TX4.rqst_can_flg.eq(value(false)))
											.and(S7_TX6.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
							.and(S4_T1.base_unit_qty.subtract(S4_T1.abort_qty).subtract(S4_T1.iv_schd_qty).subtract(S4_T1.ship_ret_qty).gt(value(0)))
							.cutoff$and(
								nvl(
									S4_T1.tdlv_cd,
									decode(
										S4_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_T2.ship_to_id_cd,
										nullValue()
									)
								).like(bind("tdlv_cd"))
							)
							.cutoff$and(S4_T1.ship_fr_lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
							.cutoff$and(S4_M13.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
							.cutoff$and(S4_T2.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S4_M3.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S4_T1.ship_schd_no.like(bind("ship_schd_no")))
							.cutoff$and(S4_T4.slo_no.like(bind("slo_no")))
							.cutoff$and(S4_T4.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S4_T3.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S4_T6.ship_inst_no.like(bind("ship_inst_no")))
							.cutoff$and(S4_T6.ship_inst_d_no.like(bind("ship_inst_d_no")))
							.cutoff$and(S4_T10.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
							.cutoff$and(S4_T10.ship_inst_tm.lte(bind("ship_inst_hm_to")))
							.cutoff$and(S4_T2.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(
								nvl(
									S4_T1.dlv_cd,
									S4_T2.dlv_id_cd
								).like(bind("dlv_id_cd"))
							)
							.cutoff$and(S4_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S4_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S4_M24.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S4_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S4_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S4_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S4_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S4_T3.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S4_T3.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S4_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
							.cutoff$and(S4_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
							.cutoff$and(S4_T4.etd_dt.gte(bind("etd_dt_fr")))
							.cutoff$and(S4_T4.etd_dt.lte(bind("etd_dt_to")))
							.cutoff$and(S4_T4.eta_dt.gte(bind("eta_dt_fr")))
							.cutoff$and(S4_T4.eta_dt.lte(bind("eta_dt_to")))
							.cutoff$and(S4_T4.via_schd_dt.gte(bind("via_schd_dt_fr")))
							.cutoff$and(S4_T4.via_schd_dt.lte(bind("via_schd_dt_to")))
							.addDynamicPredicate(DS4C_ITM_GRP)
						).view(S0_V1)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_V1.pr("ship_rqst_id_cd").eq(S0_M03.bp_cd)
								.and(S0_V1.pr("ship_rqst_id_typ").neq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_V1.pr("dlv_id_cd").eq(S0_M04.bp_cd)
								.and(S0_V1.pr(S4_T2.dlv_id_typ).eq(value(MSC_DLV_ID_TYP.DLV.value())))
							)
						)
						.addDynamicView(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bracket(
									value(MAC_TRD_PTN_TYP.SLS.value()).eq(S0_V1.pr(S4_M3.trd_ptn_typ))
									.or(value(MAC_TRD_PTN_TYP.SHIP.value()).eq(S0_V1.pr(S4_M3.trd_ptn_typ)))
								)
								.and(S0_M03.cst_iv_flg.eq(value(true)))
							)
							.or(
								value(MAC_TRD_PTN_TYP.SLS.value()).neq(S0_V1.pr(S4_M3.trd_ptn_typ))
								.and(value(MAC_TRD_PTN_TYP.SHIP.value()).neq(S0_V1.pr(S4_M3.trd_ptn_typ)))
								.and(value(MAC_TRD_PTN_TYP.PROV_RTN.value()).neq(S0_V1.pr(S4_M3.trd_ptn_typ)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S8_M02)
										.where(
											value(0).eq(value(0))
											.and(S0_V1.pr(S4_T1.ship_fr_lg_grp_cd).eq(S8_M02.fr_lg_grp_cd))
											.and(S0_V1.pr("ship_to_lg_grp_cd").eq(S8_M02.to_lg_grp_cd))
											.and(S8_M02.iv_trd_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_V1.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_no").like(bind("ship_rqst_no")))
						.cutoff$and(S0_V1.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_typ").like(bind("ship_rqst_id_typ")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_cd").like(bind("ship_rqst_id_cd")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
						.cutoff$and(S0_V1.pr("itm_nm").like(bind("itm_nm")))
						.cutoff$and(S0_V1.pr("dlv_rqst_tm").gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_V1.pr("dlv_rqst_tm").lte(bind("dlv_rqst_hm_to")))
						.addDynamicPredicate(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(
						S0_V1.pr(S4_T4.slo_no).asc(),
						S0_V1.pr("ship_rqst_no").asc(),
						S0_V1.pr(S4_T1.ship_schd_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ship_rqst_id_grp_flg1"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd1.as("ship_rqst_id_grp_cd1"), S0_MMS1.bp_grp_nm.as("ship_rqst_id_grp_nm1"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS1).on(S0_M03.bp_grp_cd1.eq(S0_MMS1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMS1.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd1.like(bind("ship_rqst_id_grp_cd1"))).cutoff$and(S0_MMS1.bp_grp_nm.like(bind("ship_rqst_id_grp_nm1")))),
				when(boundOr("ship_rqst_id_grp_flg2"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd2.as("ship_rqst_id_grp_cd2"), S0_MMS2.bp_grp_nm.as("ship_rqst_id_grp_nm2"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS2).on(S0_M03.bp_grp_cd2.eq(S0_MMS2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMS2.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd2.like(bind("ship_rqst_id_grp_cd2"))).cutoff$and(S0_MMS2.bp_grp_nm.like(bind("ship_rqst_id_grp_nm2")))),
				when(boundOr("ship_rqst_id_grp_flg3"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd3.as("ship_rqst_id_grp_cd3"), S0_MMS3.bp_grp_nm.as("ship_rqst_id_grp_nm3"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS3).on(S0_M03.bp_grp_cd3.eq(S0_MMS3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMS3.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd3.like(bind("ship_rqst_id_grp_cd3"))).cutoff$and(S0_MMS3.bp_grp_nm.like(bind("ship_rqst_id_grp_nm3")))),
				when(boundOr("ship_rqst_id_grp_flg4"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd4.as("ship_rqst_id_grp_cd4"), S0_MMS4.bp_grp_nm.as("ship_rqst_id_grp_nm4"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS4).on(S0_M03.bp_grp_cd4.eq(S0_MMS4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMS4.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd4.like(bind("ship_rqst_id_grp_cd4"))).cutoff$and(S0_MMS4.bp_grp_nm.like(bind("ship_rqst_id_grp_nm4")))),
				when(boundOr("ship_rqst_id_grp_flg5"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd5.as("ship_rqst_id_grp_cd5"), S0_MMS5.bp_grp_nm.as("ship_rqst_id_grp_nm5"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS5).on(S0_M03.bp_grp_cd5.eq(S0_MMS5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMS5.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd5.like(bind("ship_rqst_id_grp_cd5"))).cutoff$and(S0_MMS5.bp_grp_nm.like(bind("ship_rqst_id_grp_nm5")))),
				when(boundOr("ship_rqst_id_grp_flg6"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd6.as("ship_rqst_id_grp_cd6"), S0_MMS6.bp_grp_nm.as("ship_rqst_id_grp_nm6"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS6).on(S0_M03.bp_grp_cd6.eq(S0_MMS6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMS6.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd6.like(bind("ship_rqst_id_grp_cd6"))).cutoff$and(S0_MMS6.bp_grp_nm.like(bind("ship_rqst_id_grp_nm6")))),
				when(boundOr("ship_rqst_id_grp_flg7"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd7.as("ship_rqst_id_grp_cd7"), S0_MMS7.bp_grp_nm.as("ship_rqst_id_grp_nm7"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS7).on(S0_M03.bp_grp_cd7.eq(S0_MMS7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMS7.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd7.like(bind("ship_rqst_id_grp_cd7"))).cutoff$and(S0_MMS7.bp_grp_nm.like(bind("ship_rqst_id_grp_nm7")))),
				when(boundOr("ship_rqst_id_grp_flg8"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd8.as("ship_rqst_id_grp_cd8"), S0_MMS8.bp_grp_nm.as("ship_rqst_id_grp_nm8"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS8).on(S0_M03.bp_grp_cd8.eq(S0_MMS8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMS8.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd8.like(bind("ship_rqst_id_grp_cd8"))).cutoff$and(S0_MMS8.bp_grp_nm.like(bind("ship_rqst_id_grp_nm8")))),
				when(boundOr("ship_rqst_id_grp_flg9"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd9.as("ship_rqst_id_grp_cd9"), S0_MMS9.bp_grp_nm.as("ship_rqst_id_grp_nm9"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS9).on(S0_M03.bp_grp_cd9.eq(S0_MMS9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMS9.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd9.like(bind("ship_rqst_id_grp_cd9"))).cutoff$and(S0_MMS9.bp_grp_nm.like(bind("ship_rqst_id_grp_nm9")))),
				when(boundOr("ship_rqst_id_grp_flg10"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_M03.bp_grp_cd10.as("ship_rqst_id_grp_cd10"), S0_MMS10.bp_grp_nm.as("ship_rqst_id_grp_nm10"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_MMS10).on(S0_M03.bp_grp_cd10.eq(S0_MMS10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMS10.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_M03.bp_grp_cd10.like(bind("ship_rqst_id_grp_cd10"))).cutoff$and(S0_MMS10.bp_grp_nm.like(bind("ship_rqst_id_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd1.as("dlv_grp_cd1"), S0_MMD1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD1).on(S0_M04.bp_grp_cd1.eq(S0_MMD1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMD1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MMD1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd2.as("dlv_grp_cd2"), S0_MMD2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD2).on(S0_M04.bp_grp_cd2.eq(S0_MMD2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMD2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MMD2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd3.as("dlv_grp_cd3"), S0_MMD3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD3).on(S0_M04.bp_grp_cd3.eq(S0_MMD3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMD3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MMD3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd4.as("dlv_grp_cd4"), S0_MMD4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD4).on(S0_M04.bp_grp_cd4.eq(S0_MMD4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMD4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MMD4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd5.as("dlv_grp_cd5"), S0_MMD5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD5).on(S0_M04.bp_grp_cd5.eq(S0_MMD5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMD5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MMD5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd6.as("dlv_grp_cd6"), S0_MMD6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD6).on(S0_M04.bp_grp_cd6.eq(S0_MMD6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMD6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MMD6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd7.as("dlv_grp_cd7"), S0_MMD7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD7).on(S0_M04.bp_grp_cd7.eq(S0_MMD7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMD7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MMD7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd8.as("dlv_grp_cd8"), S0_MMD8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD8).on(S0_M04.bp_grp_cd8.eq(S0_MMD8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMD8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MMD8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd9.as("dlv_grp_cd9"), S0_MMD9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD9).on(S0_M04.bp_grp_cd9.eq(S0_MMD9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMD9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MMD9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M04.bp_grp_cd10.as("dlv_grp_cd10"), S0_MMD10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD10).on(S0_M04.bp_grp_cd10.eq(S0_MMD10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMD10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M04.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MMD10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd1.as("itm_grp_cd1"), S4_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM1).on(S4_M1.itm_grp_cd1.eq(S4_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S4_MM1.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S4_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd2.as("itm_grp_cd2"), S4_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM2).on(S4_M1.itm_grp_cd2.eq(S4_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S4_MM2.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S4_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd3.as("itm_grp_cd3"), S4_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM3).on(S4_M1.itm_grp_cd3.eq(S4_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S4_MM3.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S4_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd4.as("itm_grp_cd4"), S4_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM4).on(S4_M1.itm_grp_cd4.eq(S4_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S4_MM4.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S4_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd5.as("itm_grp_cd5"), S4_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM5).on(S4_M1.itm_grp_cd5.eq(S4_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S4_MM5.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S4_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd6.as("itm_grp_cd6"), S4_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM6).on(S4_M1.itm_grp_cd6.eq(S4_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S4_MM6.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S4_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd7.as("itm_grp_cd7"), S4_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM7).on(S4_M1.itm_grp_cd7.eq(S4_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S4_MM7.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S4_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd8.as("itm_grp_cd8"), S4_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM8).on(S4_M1.itm_grp_cd8.eq(S4_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S4_MM8.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S4_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd9.as("itm_grp_cd9"), S4_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM9).on(S4_M1.itm_grp_cd9.eq(S4_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S4_MM9.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S4_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS4C_ITM_GRP, S4_M1.itm_grp_cd10.as("itm_grp_cd10"), S4_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_MM10).on(S4_M1.itm_grp_cd10.eq(S4_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S4_MM10.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S4_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(MSBEL1710_Ship_RsltR_J01());
	}

	/**
	 * -- MSBEL1710_MST_SHIP_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL1710_MST_SHIP_INST_D_S01() {
		MCTempView S0_VSHIPINST = createTempView("VSHIPINST");
		MAM_BP_R S0_SHIPRQST = MAM_BP_R.create("SHIPRQST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_GRP_R S0_SHIPRQSTGRP1 = MAM_BP_GRP_R.create("SHIPRQSTGRP1");
		MAM_BP_GRP_R S0_SHIPRQSTGRP2 = MAM_BP_GRP_R.create("SHIPRQSTGRP2");
		MAM_BP_GRP_R S0_SHIPRQSTGRP3 = MAM_BP_GRP_R.create("SHIPRQSTGRP3");
		MAM_BP_GRP_R S0_SHIPRQSTGRP4 = MAM_BP_GRP_R.create("SHIPRQSTGRP4");
		MAM_BP_GRP_R S0_SHIPRQSTGRP5 = MAM_BP_GRP_R.create("SHIPRQSTGRP5");
		MAM_BP_GRP_R S0_SHIPRQSTGRP6 = MAM_BP_GRP_R.create("SHIPRQSTGRP6");
		MAM_BP_GRP_R S0_SHIPRQSTGRP7 = MAM_BP_GRP_R.create("SHIPRQSTGRP7");
		MAM_BP_GRP_R S0_SHIPRQSTGRP8 = MAM_BP_GRP_R.create("SHIPRQSTGRP8");
		MAM_BP_GRP_R S0_SHIPRQSTGRP9 = MAM_BP_GRP_R.create("SHIPRQSTGRP9");
		MAM_BP_GRP_R S0_SHIPRQSTGRP10 = MAM_BP_GRP_R.create("SHIPRQSTGRP10");
		MAM_BP_GRP_R S0_DLVGRP1 = MAM_BP_GRP_R.create("DLVGRP1");
		MAM_BP_GRP_R S0_DLVGRP2 = MAM_BP_GRP_R.create("DLVGRP2");
		MAM_BP_GRP_R S0_DLVGRP3 = MAM_BP_GRP_R.create("DLVGRP3");
		MAM_BP_GRP_R S0_DLVGRP4 = MAM_BP_GRP_R.create("DLVGRP4");
		MAM_BP_GRP_R S0_DLVGRP5 = MAM_BP_GRP_R.create("DLVGRP5");
		MAM_BP_GRP_R S0_DLVGRP6 = MAM_BP_GRP_R.create("DLVGRP6");
		MAM_BP_GRP_R S0_DLVGRP7 = MAM_BP_GRP_R.create("DLVGRP7");
		MAM_BP_GRP_R S0_DLVGRP8 = MAM_BP_GRP_R.create("DLVGRP8");
		MAM_BP_GRP_R S0_DLVGRP9 = MAM_BP_GRP_R.create("DLVGRP9");
		MAM_BP_GRP_R S0_DLVGRP10 = MAM_BP_GRP_R.create("DLVGRP10");
		MST_SHIP_INST_D_R S4_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S4_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S4_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S4_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S4_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S4_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S4_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S4_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MAM_ITM_R S4_ITM = MAM_ITM_R.create("ITM");
		MAM_TRD_R S4_TRD = MAM_TRD_R.create("TRD");
		MAM_LG_GRP_R S4_SHIPLGGRP = MAM_LG_GRP_R.create("SHIPLGGRP");
		MAM_SUNDRY_ITM_R S4_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_BP_R S4_DLV = MAM_BP_R.create("DLV");
		MAM_LOC_R S4_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S4_CST = MAM_BP_R.create("CST");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		MAM_ITM_TYP_D_R S4_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");
		MAM_DPT_R S4_DPT = MAM_DPT_R.create("DPT");
		MAM_LOC_R S4_GRLOC = MAM_LOC_R.create("GRLOC");
		MSVM_SHIP_TO_ID_R S4_SHIPTOID = MSVM_SHIP_TO_ID_R.create("SHIPTOID");
		MAM_ITM_LG_GRP_R S4_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S4_GILOC = MAM_LOC_R.create("GILOC");
		MAM_ITM_GRP_R S4_ITMGRP1 = MAM_ITM_GRP_R.create("ITMGRP1");
		MAM_ITM_GRP_R S4_ITMGRP2 = MAM_ITM_GRP_R.create("ITMGRP2");
		MAM_ITM_GRP_R S4_ITMGRP3 = MAM_ITM_GRP_R.create("ITMGRP3");
		MAM_ITM_GRP_R S4_ITMGRP4 = MAM_ITM_GRP_R.create("ITMGRP4");
		MAM_ITM_GRP_R S4_ITMGRP5 = MAM_ITM_GRP_R.create("ITMGRP5");
		MAM_ITM_GRP_R S4_ITMGRP6 = MAM_ITM_GRP_R.create("ITMGRP6");
		MAM_ITM_GRP_R S4_ITMGRP7 = MAM_ITM_GRP_R.create("ITMGRP7");
		MAM_ITM_GRP_R S4_ITMGRP8 = MAM_ITM_GRP_R.create("ITMGRP8");
		MAM_ITM_GRP_R S4_ITMGRP9 = MAM_ITM_GRP_R.create("ITMGRP9");
		MAM_ITM_GRP_R S4_ITMGRP10 = MAM_ITM_GRP_R.create("ITMGRP10");
		MCTempView S4_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S5_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MAVM_RD_WG_R S6_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S7_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S8_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S8_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S8_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S8_POD = MST_PO_D_R.create("POD");
		MST_PO_R S8_PO = MST_PO_R.create("PO");
		MAM_BP_R S8_SPPL = MAM_BP_R.create("SPPL");
		MAM_LG_CTL_R S9_LGCTL = MAM_LG_CTL_R.create("LGCTL");
		
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_SHIP_RQST_ID_GRP = createDynamicSQLID("DS0C_SHIP_RQST_ID_GRP");
		MCDynamicSQLID DS4C_ITM_GRP = createDynamicSQLID("DS4C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1710_MST_SHIP_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_VSHIPINST.prAll(),
						addDynamicSelect(DS0C_SHIP_RQST_ID_GRP),
						addDynamicSelect(DS0C_DLV_GRP)
					)
					.from(
						subQuery()
						.select(
							S4_SHIPSCHD.pr_sts_typ,
							S4_SHIPINST.ship_inst_no,
							S4_SHIPINSTD.ship_inst_d_no,
							S4_SLO.slo_no,
							S4_SLO.iv_no.as("slo_iv_no"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLOD.slo_d_no)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_SLOD.slo_d_no)
								.otherwise(S4_SHIPPR.xfr_schd_no).as("ship_rqst_no"),
							S4_SLOD.sls_cststk_flg,
							S4_SLO.cst_po_no,
							S4_SLOD.cst_po_d_no,
							S4_SHIPSCHD.ship_schd_no,
							S4_SHIPSCHD.re_ship_schd_flg,
							S4_ITM.itm_typ,
							S4_ITM.itm_typ_d_cd,
							S4_ITMTYP.itm_typ_d_nm,
							S4_SHIPINSTD.itm_cd,
							S4_SHIPINSTD.itm_sub1,
							S4_SHIPINSTD.itm_sub2,
							S4_SHIPINSTD.itm_sub3,
							cases()
								.when(S4_SHIPINSTD.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S4_SHIPINSTD.itm_nm,
											S4_SUNDRYITM.itm_nm
										)
								)
								.otherwise(S4_ITM.itm_nm).as("itm_nm"),
							nvl(
								S4_SHIPINSTD.iv_itm_nm,
								S4_SUNDRYITM.itm_nm
							).as("sundry_iv_itm_nm"),
							S4_SHIPINSTD.sno1,
							S4_SHIPINSTD.sno2,
							S4_SHIPINSTD.sno3,
							S4_SHIPINSTD.sno4,
							decode(
									S4_SLOD.trd_unit_cd,
									nullValue(),
									S4_SHIPSCHD.trd_unit_cd,
									S4_SLOD.trd_unit_cd
							).as("trd_unit_cd"),
							S4_SHIPINSTD.base_unit_cd,
							bracket(
								S4_SHIPINSTD.base_unit_qty.subtract(S4_SHIPINSTD.abort_qty).subtract(nvl(S4_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPSCHD.ship_ret_qty)
							).as("base_unit_qty"),
							nullValue().as("trd_unit_qty"),
							S4_SHIPPR.trd_cd,
							S4_TRD.trd_nm,
							S4_TRD.trd_ptn_typ,
							S4_SLOD.interim_flg,
							S4_SLOD.dscnt_rsn_cd,
							S4_SLOD.iv_upri,
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.tax_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_PROVSCHD.tax_cd,
								nullValue()
							).as("tax_cd"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.tax_fix_flg,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_PROVSCHD.tax_fix_flg,
								nullValue()
							).as("tax_fix_flg"),
							S4_SHIPPR.dlv_id_typ,
							nvl(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPPR.dlv_id_cd
							).as("dlv_id_cd"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								nvl(
									S4_SHIPSCHD.dlv_nm,
									S4_DLV.bp_nm
								),
								cases()
									.when(S4_SHIPPR.dlv_sundry_flg.eq(value(false)))
										.then(
											cases()
												.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
													.then(S4_DLV.bp_nm)
												.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
													.then(S4_DLV.bp_nm)
												.otherwise(S4_LOC.loc_nm)
									)
									.otherwise(S4_SHIPPR.dlv_id_nm)
							).as("dlv_id_nm"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_sundry_flg,
								S4_SHIPPR.dlv_sundry_flg
							).as("dlv_sundry_flg"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_zip_cd,
								S4_SHIPPR.dlv_zip_cd
							).as("dlv_zip_cd"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr1,
								S4_SHIPPR.dlv_addr1
							).as("dlv_addr1"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr2,
								S4_SHIPPR.dlv_addr2
							).as("dlv_addr2"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr3,
								S4_SHIPPR.dlv_addr3
							).as("dlv_addr3"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr4,
								S4_SHIPPR.dlv_addr4
							).as("dlv_addr4"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_cntct_dpt,
								S4_SHIPPR.dlv_cntct_dpt
							).as("dlv_cntct_dpt"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_cntct_psn,
								S4_SHIPPR.dlv_cntct_psn
							).as("dlv_cntct_psn"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_tel,
								S4_SHIPPR.dlv_tel
							).as("dlv_tel"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_fax,
								S4_SHIPPR.dlv_fax
							).as("dlv_fax"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.SPPL.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.otherwise(nullValue()).as("ship_rqst_id_typ"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SHIPPR.cst_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_SHIPPR.cst_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.sppl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.otherwise(nullValue()).as("ship_rqst_id_cd"),
							S4_CST.sls_upri_cng_flg,
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_SPPL.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_GRLOC.loc_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_GRLOC.loc_nm)
								.otherwise(nullValue()).as("ship_rqst_id_nm"),
							trunc(
								S4_SHIPINST.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S4_SHIPINST.ship_schd_tm.as("ship_schd_hm"),
							nvl(
								nvl(
									S4_SHIPSCHD.pd_inst_dlv_tm,
									S4_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S4_SLOD.dlv_rqst_tm,
									S4_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_tm"),
							trunc(
								nvl(
									nvl(
										S4_SHIPSCHD.pd_inst_dlv_tm,
										S4_SHIPPR.dlv_rqst_tm
									),
									nvl(
										S4_SLOD.dlv_rqst_tm,
										S4_XFRSCHD.gr_rqst_tm
									)
								),
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							nvl(
								nvl(
									S4_SHIPSCHD.pd_inst_dlv_tm,
									S4_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S4_SLOD.dlv_rqst_tm,
									S4_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
							trunc(
									S4_SHIPINST.ship_inst_tm,
									MCDateFmt.DD
								).as("ship_inst_dt"),
							S4_SHIPINST.ship_inst_tm.as("ship_inst_hm"),
							S4_SHIPINST.via_dlv_typ,
							nvl(
								S4_SHIPSCHD.tdlv_cd,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_id_cd,
									nullValue()
								)
							).as("tdlv_cd"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								nvl(
									S4_SHIPSCHD.tdlv_nm,
									S4_SHIPTOID.ship_to_id_nm
								),
								cases()
									.when(S4_SHIPPR.ship_to_sundry_flg.eq(value(false)))
										.then(S4_SHIPTOID.ship_to_id_nm)
									.otherwise(
										decode(
											S4_SHIPPR.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S4_SHIPPR.ship_to_id_nm,
											nullValue()
										)
									)
							).as("tdlv_nm"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_lg_grp_cd,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_lg_grp_cd,
									nullValue()
								)
							).as("tdlv_lg_grp_cd"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_sundry_flg,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_sundry_flg,
									value(false)
								)
							).as("tdlv_sundry_flg"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_zip_cd,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_zip_cd,
									nullValue()
								)
							).as("tdlv_zip_cd"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_addr1,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_addr1,
									nullValue()
								)
							).as("tdlv_addr1"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_addr2,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_addr2,
									nullValue()
								)
							).as("tdlv_addr2"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_addr3,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_addr3,
									nullValue()
								)
							).as("tdlv_addr3"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_addr4,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_addr4,
									nullValue()
								)
							).as("tdlv_addr4"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_tel,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_tel,
									nullValue()
								)
							).as("tdlv_tel"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_fax,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_fax,
									nullValue()
								)
							).as("tdlv_fax"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_cntct_dpt,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_cntct_dpt,
									nullValue()
								)
							).as("tdlv_cntct_dpt"),
							nvl2(
								S4_SHIPSCHD.tdlv_cd,
								S4_SHIPSCHD.tdlv_cntct_psn,
								decode(
									S4_SHIPPR.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPPR.ship_to_cntct_psn,
									nullValue()
								)
							).as("tdlv_cntct_psn"),
							S4_SLO.trnspt_cd,
							S4_SLO.vssl_flght,
							S4_SLO.load_port_cd,
							S4_SLO.etd_dt,
							S4_SLO.dschrg_port_cd,
							S4_SLO.eta_dt,
							S4_SLO.via_port_cd,
							S4_SLO.via_schd_dt,
							S4_SLO.sls_basis_typ,
							S4_XFRSCHD.prov_basis_typ,
							S4_SLO.tterm_cd1,
							S4_SLO.tterm_rmrks1,
							S4_SLO.tterm_cd2,
							S4_SLO.tterm_rmrks2,
							S4_SLO.tterm_cd3,
							S4_SLO.tterm_rmrks3,
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.otherwise(nullValue()).as("trd_cur_cd"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.otherwise(nullValue()).as("xrate_inpt_flg"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate)
								.otherwise(nullValue()).as("xrate"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.otherwise(nullValue()).as("ptax_xrate_inpt_flg"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.otherwise(nullValue()).as("ptax_xrate"),
							S4_SHIPINSTD.ship_lg_grp_cd.as("ship_fr_lg_grp_cd"),
							S4_SHIPLGGRP.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S4_SLOD.cst_itm_cd,
							S4_SLOD.cst_itm_nm,
							S4_SHIPINSTD.sundry_itm_flg,
							S4_ITM.sno1_mng_typ,
							S4_ITM.sno2_mng_typ,
							S4_ITM.sno3_mng_typ,
							S4_ITM.sno4_mng_typ,
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_unit_cd,
								nullValue()
							).as("schd_trd_unit_cd"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_unit_qty,
								nullValue()
							).as("schd_trd_unit_qty"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.base_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.base_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.base_unit_qty,
								nullValue()
							).as("schd_base_unit_qty"),
							S4_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
							S4_SLOD.iv_amt.as("schd_iv_amt"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_upri,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_upri,
								nullValue()
							).as("schd_trd_cur_upri"),
							S4_SLOD.upri_not_tgt_flg,
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_amt,
								nullValue()
							).as("schd_trd_cur_amt"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_tax_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_tax_amt,
								nullValue()
							).as("schd_trd_cur_tax_amt"),
							nvl(
								decode(
									S4_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_amt_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.prov_amt_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("amt_rnd_typ"),
							nvl(
								decode(
									S4_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_upri_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.sls_upri_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("upri_rnd_typ"),
							nvl(
								decode(
									S4_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_tax_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.prov_tax_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("tax_rnd_typ"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S4_SHIPPR.cst_cd,
							S4_LOC.lg_grp_cd.as("ship_to_lg_grp_cd"),
							S4_SHIPPR.purc_ddlv_flg,
							S4_SHIPINST.ship_term_cd,
							S4_CST.ar_dpt_typ,
							MAPA_BP$F_GET_AR_DPT_CD_NE(
								S4_CST.bp_cd,
								bind("today"),
								value(false)
							).as("lnk_ar_dpt_cd"),
							S4_SHIPINSTD.ins_usr_id,
							S4_SHIPINSTD.ins_usr_nm,
							S4_SHIPINSTD.ins_func_id,
							nullValue().as("ins_func_nm"),
							S4_SHIPINSTD.ins_ts,
							S4_SHIPINSTD.upd_usr_id,
							S4_SHIPINSTD.upd_usr_nm,
							S4_SHIPINSTD.upd_func_id,
							nullValue().as("upd_func_nm"),
							S4_SHIPINSTD.upd_ts,
							S4_SHIPINSTD.upd_srv_req_no,
							addDynamicSelect(DS4C_ITM_GRP)
						)
						.from(
							S4_SHIPINSTD
							.innerJoin(S4_SHIPINST).on(S4_SHIPINSTD.ship_inst_no.eq(S4_SHIPINST.ship_inst_no))
							.innerJoin(S4_SHIPSCHD).on(S4_SHIPINSTD.ship_inst_d_no.eq(S4_SHIPSCHD.ship_inst_d_no))
							.innerJoin(S4_SHIPPR).on(S4_SHIPSCHD.ship_pr_no.eq(S4_SHIPPR.ship_pr_no))
							.leftOuterJoin(S4_SLOD).on(S4_SHIPPR.slo_d_no.eq(S4_SLOD.slo_d_no))
							.leftOuterJoin(S4_SLO).on(S4_SLOD.slo_no.eq(S4_SLO.slo_no))
							.leftOuterJoin(S4_PROVSCHD).on(
								bracket(
									S4_SHIPSCHD.ship_schd_no.eq(S4_PROVSCHD.prov_src_schd_no1)
									.and(MAC_TRD_PTN_TYP$IS_PROV(S4_PROVSCHD.trd_ptn_typ).eq(value(true)))
								)
							)
							.leftOuterJoin(S4_XFRSCHD).on(
								bracket(
									S4_SHIPPR.xfr_schd_no.eq(S4_XFRSCHD.xfr_schd_no)
								)
							)
							.leftOuterJoin(subQuery().select(
									S5_IVSHIPINSTMAP.ship_inst_d_no,
									sum(S5_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
									).from(S5_IVSHIPINSTMAP)
									.groupBy(S5_IVSHIPINSTMAP.ship_inst_d_no)
									.view(S4_VIVSHIPINSTMAP))
							.on(S4_SHIPINSTD.ship_inst_d_no.eq(S4_VIVSHIPINSTMAP.pr(S5_IVSHIPINSTMAP.ship_inst_d_no)))
							.leftOuterJoin(S4_ITM).on(
								bracket(
									S4_SHIPINSTD.itm_cd.eq(S4_ITM.itm_cd)
									.and(S4_SHIPINSTD.itm_sub1.eq(S4_ITM.itm_sub1))
									.and(S4_SHIPINSTD.itm_sub2.eq(S4_ITM.itm_sub2))
									.and(S4_SHIPINSTD.itm_sub3.eq(S4_ITM.itm_sub3))
								)
							)
							.leftOuterJoin(S4_TRD).on(S4_SHIPPR.trd_cd.eq(S4_TRD.trd_cd))
							.leftOuterJoin(S4_SHIPLGGRP).on(S4_SHIPINSTD.ship_lg_grp_cd.eq(S4_SHIPLGGRP.lg_grp_cd))
							.leftOuterJoin(S4_SUNDRYITM).on(
								bracket(
									S4_SHIPINSTD.itm_cd.eq(S4_SUNDRYITM.itm_cd)
									.and(S4_SHIPINSTD.itm_sub1.eq(S4_SUNDRYITM.itm_sub1))
									.and(S4_SHIPINSTD.itm_sub2.eq(S4_SUNDRYITM.itm_sub2))
									.and(S4_SHIPINSTD.itm_sub3.eq(S4_SUNDRYITM.itm_sub3))
									.and(S4_SHIPINSTD.sno1.eq(S4_SUNDRYITM.sno1))
									.and(S4_SHIPINSTD.sno2.eq(S4_SUNDRYITM.sno2))
									.and(S4_SHIPINSTD.sno3.eq(S4_SUNDRYITM.sno3))
									.and(S4_SHIPINSTD.sno4.eq(S4_SUNDRYITM.sno4))
								)
							)
							.leftOuterJoin(S4_DLV).on(
								nvl(
									S4_SHIPSCHD.dlv_cd,
									S4_SHIPPR.dlv_id_cd
								).eq(S4_DLV.bp_cd)
							)
							.leftOuterJoin(S4_LOC).on(S4_SHIPPR.dlv_id_cd.eq(S4_LOC.loc_cd))
							.leftOuterJoin(S4_CST).on(S4_SHIPPR.cst_cd.eq(S4_CST.bp_cd))
							.leftOuterJoin(S4_SPPL).on(S4_LOC.sppl_cd.eq(S4_SPPL.bp_cd))
							.leftOuterJoin(S4_ITMTYP).on(
								bracket(
									S4_ITM.itm_typ.eq(S4_ITMTYP.itm_typ)
									.and(S4_ITM.itm_typ_d_cd.eq(S4_ITMTYP.itm_typ_d_cd))
								)
							)
							.leftOuterJoin(S4_DPT).on(
								bracket(
									S4_SLO.sls_dpt_cd.eq(S4_DPT.dpt_cd)
									.and(S4_SLO.slo_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
								)
							)
							.leftOuterJoin(S4_GRLOC).on(S4_XFRSCHD.gr_loc_cd.eq(S4_GRLOC.loc_cd))
							.leftOuterJoin(S4_SHIPTOID).on(
								bracket(
									S4_SHIPPR.ship_to_id_typ.eq(S4_SHIPTOID.ship_to_id_typ)
									.and(
										nvl(
											S4_SHIPSCHD.tdlv_cd,
											S4_SHIPPR.ship_to_id_cd
										).eq(S4_SHIPTOID.ship_to_id_cd)
									)
									.and(S4_SHIPPR.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								)
							)
							.leftOuterJoin(S4_ITMLGGRP).on(
								bracket(
									S4_XFRSCHD.itm_cd.eq(S4_ITMLGGRP.itm_cd)
									.and(S4_XFRSCHD.itm_sub1.eq(S4_ITMLGGRP.itm_sub1))
									.and(S4_XFRSCHD.itm_sub2.eq(S4_ITMLGGRP.itm_sub2))
									.and(S4_XFRSCHD.itm_sub3.eq(S4_ITMLGGRP.itm_sub3))
									.and(S4_XFRSCHD.gi_lg_grp_cd.eq(S4_ITMLGGRP.lg_grp_cd))
								)
							)
							.leftOuterJoin(S4_GILOC).on(
								bracket(
									S4_XFRSCHD.gi_lg_grp_cd.eq(S4_GILOC.lg_grp_cd)
									.and(S4_GILOC.lg_def_flg.eq(value(true)))
									.and(S4_GILOC.del_flg.eq(value(false)))
								)
							)
							.addDynamicView(DS4C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S4_SHIPINST.can_flg.eq(value(false)))
							.and(S4_SHIPINST.can_flg.eq(value(false)))
							.cutoff$and(S4_SHIPSCHD.pr_sts_typ.like(bind("pr_sts_typ")))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S6_RDWG)
									.where(
										S4_DPT.wg_cd.eq(S6_RDWG.wg_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_RDLOC)
										.where(
											coalesce(
												S4_XFRSCHD.gi_loc_cd,
												S4_ITMLGGRP.lg_def_loc_cd,
												S4_GILOC.loc_cd
											).eq(S7_RDLOC.loc_cd)
										)
									)
								)
							)
							.and(
								S4_SHIPPR.purc_ddlv_flg.eq(value(false))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S8_SLSSCHD
											.innerJoin(S8_PURCSCHD).on(
												bracket(
													S8_SLSSCHD.purc_schd_no.eq(S8_PURCSCHD.purc_schd_no)
												)
											)
											.innerJoin(S8_ARRPR).on(
												bracket(
													S8_PURCSCHD.arr_pr_no.eq(S8_ARRPR.arr_pr_no)
												)
											)
											.innerJoin(S8_POD).on(
												bracket(
													S8_ARRPR.po_d_no.eq(S8_POD.po_d_no)
												)
											)
											.innerJoin(S8_PO).on(
												bracket(
													S8_POD.po_no.eq(S8_PO.po_no)
												)
											)
											.leftOuterJoin(S8_SPPL).on(
												bracket(
													S8_PO.sppl_cd.eq(S8_SPPL.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S4_SHIPSCHD.ship_schd_no.eq(S8_SLSSCHD.ship_schd_no))
											.and(S8_SLSSCHD.cmpl_flg.eq(value(false)))
											.and(S8_SLSSCHD.purc_schd_no.isNotNull())
											.and(S8_POD.rqst_can_flg.eq(value(false)))
											.and(S8_SPPL.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
							.and(S4_SHIPINSTD.base_unit_qty.subtract(S4_SHIPINSTD.abort_qty).subtract(nvl(S4_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPSCHD.ship_ret_qty).gt(value(0)))
							.cutoff$and(
								nvl(
									S4_SHIPSCHD.tdlv_cd,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_id_cd,
										nullValue()
									)
								).like(bind("tdlv_cd"))
							)
							.cutoff$and(S4_SHIPINSTD.ship_lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
							.cutoff$and(S4_SHIPLGGRP.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
							.cutoff$and(S4_SHIPPR.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S4_TRD.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S4_SHIPSCHD.ship_schd_no.like(bind("ship_schd_no")))
							.cutoff$and(S4_SLO.slo_no.like(bind("slo_no")))
							.cutoff$and(S4_SLO.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S4_SLOD.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S4_SHIPINST.ship_inst_no.like(bind("ship_inst_no")))
							.cutoff$and(S4_SHIPINSTD.ship_inst_d_no.like(bind("ship_inst_d_no")))
							.cutoff$and(S4_SHIPPR.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(
								nvl(
									S4_SHIPSCHD.dlv_cd,
									S4_SHIPPR.dlv_id_cd
								).like(bind("dlv_id_cd"))
							)
							.cutoff$and(S4_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S4_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S4_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S4_SHIPINSTD.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S4_SHIPINSTD.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S4_SHIPINSTD.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S4_SHIPINSTD.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S4_SLOD.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S4_SLOD.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S4_SHIPINST.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
							.cutoff$and(S4_SHIPINST.ship_schd_tm.lte(bind("ship_schd_hm_to")))
							.cutoff$and(S4_SLO.etd_dt.gte(bind("etd_dt_fr")))
							.cutoff$and(S4_SLO.etd_dt.lte(bind("etd_dt_to")))
							.cutoff$and(S4_SLO.eta_dt.gte(bind("eta_dt_fr")))
							.cutoff$and(S4_SLO.eta_dt.lte(bind("eta_dt_to")))
							.cutoff$and(S4_SLO.via_schd_dt.gte(bind("via_schd_dt_fr")))
							.cutoff$and(S4_SLO.via_schd_dt.lte(bind("via_schd_dt_to")))
							.cutoff$and(S4_SHIPINST.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
							.cutoff$and(S4_SHIPINST.ship_inst_tm.lte(bind("ship_inst_hm_to")))
							.addDynamicPredicate(DS4C_ITM_GRP)
						).view(S0_VSHIPINST)
						.leftOuterJoin(S0_SHIPRQST).on(
							bracket(
								S0_VSHIPINST.pr("ship_rqst_id_cd").eq(S0_SHIPRQST.bp_cd)
								.and(S0_VSHIPINST.pr("ship_rqst_id_typ").neq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_VSHIPINST.pr("dlv_id_cd").eq(S0_DLV.bp_cd)
								.and(S0_VSHIPINST.pr(S4_SHIPPR.dlv_id_typ).eq(value(MSC_DLV_ID_TYP.DLV.value())))
							)
						)
						.addDynamicView(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bracket(
									value(MAC_TRD_PTN_TYP.SLS.value()).eq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ))
									.or(value(MAC_TRD_PTN_TYP.SHIP.value()).eq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								)
								.and(S0_SHIPRQST.cst_iv_flg.eq(value(true)))
							)
							.or(
								value(MAC_TRD_PTN_TYP.SLS.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ))
								.and(value(MAC_TRD_PTN_TYP.SHIP.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								.and(value(MAC_TRD_PTN_TYP.PROV_RTN.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S9_LGCTL)
										.where(
											value(0).eq(value(0))
											.and(S0_VSHIPINST.pr("ship_fr_lg_grp_cd").eq(S9_LGCTL.fr_lg_grp_cd))
											.and(S0_VSHIPINST.pr("ship_to_lg_grp_cd").eq(S9_LGCTL.to_lg_grp_cd))
											.and(S9_LGCTL.iv_trd_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_VSHIPINST.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_VSHIPINST.pr("ship_rqst_no").like(bind("ship_rqst_no")))
						.cutoff$and(S0_VSHIPINST.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_VSHIPINST.pr("ship_rqst_id_typ").like(bind("ship_rqst_id_typ")))
						.cutoff$and(S0_VSHIPINST.pr("ship_rqst_id_cd").like(bind("ship_rqst_id_cd")))
						.cutoff$and(S0_VSHIPINST.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
						.cutoff$and(S0_VSHIPINST.pr("itm_nm").like(bind("itm_nm")))
						.cutoff$and(S0_VSHIPINST.pr("dlv_rqst_tm").gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_VSHIPINST.pr("dlv_rqst_tm").lte(bind("dlv_rqst_hm_to")))
						.addDynamicPredicate(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(
						S0_VSHIPINST.pr(S4_SLO.slo_no).asc(),
						S0_VSHIPINST.pr("ship_rqst_no").asc(),
						S0_VSHIPINST.pr(S4_SHIPSCHD.ship_schd_no).asc(),
						S0_VSHIPINST.pr(S4_SHIPINST.ship_inst_no).asc(),
						S0_VSHIPINST.pr(S4_SHIPINSTD.ship_inst_d_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ship_rqst_id_grp_flg1"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd1.as("ship_rqst_id_grp_cd1"), S0_SHIPRQSTGRP1.bp_grp_nm.as("ship_rqst_id_grp_nm1"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP1).on(S0_SHIPRQST.bp_grp_cd1.eq(S0_SHIPRQSTGRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SHIPRQSTGRP1.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd1.like(bind("ship_rqst_id_grp_cd1"))).cutoff$and(S0_SHIPRQSTGRP1.bp_grp_nm.like(bind("ship_rqst_id_grp_nm1")))),
				when(boundOr("ship_rqst_id_grp_flg2"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd2.as("ship_rqst_id_grp_cd2"), S0_SHIPRQSTGRP2.bp_grp_nm.as("ship_rqst_id_grp_nm2"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP2).on(S0_SHIPRQST.bp_grp_cd2.eq(S0_SHIPRQSTGRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SHIPRQSTGRP2.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd2.like(bind("ship_rqst_id_grp_cd2"))).cutoff$and(S0_SHIPRQSTGRP2.bp_grp_nm.like(bind("ship_rqst_id_grp_nm2")))),
				when(boundOr("ship_rqst_id_grp_flg3"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd3.as("ship_rqst_id_grp_cd3"), S0_SHIPRQSTGRP3.bp_grp_nm.as("ship_rqst_id_grp_nm3"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP3).on(S0_SHIPRQST.bp_grp_cd3.eq(S0_SHIPRQSTGRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SHIPRQSTGRP3.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd3.like(bind("ship_rqst_id_grp_cd3"))).cutoff$and(S0_SHIPRQSTGRP3.bp_grp_nm.like(bind("ship_rqst_id_grp_nm3")))),
				when(boundOr("ship_rqst_id_grp_flg4"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd4.as("ship_rqst_id_grp_cd4"), S0_SHIPRQSTGRP4.bp_grp_nm.as("ship_rqst_id_grp_nm4"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP4).on(S0_SHIPRQST.bp_grp_cd4.eq(S0_SHIPRQSTGRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SHIPRQSTGRP4.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd4.like(bind("ship_rqst_id_grp_cd4"))).cutoff$and(S0_SHIPRQSTGRP4.bp_grp_nm.like(bind("ship_rqst_id_grp_nm4")))),
				when(boundOr("ship_rqst_id_grp_flg5"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd5.as("ship_rqst_id_grp_cd5"), S0_SHIPRQSTGRP5.bp_grp_nm.as("ship_rqst_id_grp_nm5"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP5).on(S0_SHIPRQST.bp_grp_cd5.eq(S0_SHIPRQSTGRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SHIPRQSTGRP5.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd5.like(bind("ship_rqst_id_grp_cd5"))).cutoff$and(S0_SHIPRQSTGRP5.bp_grp_nm.like(bind("ship_rqst_id_grp_nm5")))),
				when(boundOr("ship_rqst_id_grp_flg6"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd6.as("ship_rqst_id_grp_cd6"), S0_SHIPRQSTGRP6.bp_grp_nm.as("ship_rqst_id_grp_nm6"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP6).on(S0_SHIPRQST.bp_grp_cd6.eq(S0_SHIPRQSTGRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SHIPRQSTGRP6.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd6.like(bind("ship_rqst_id_grp_cd6"))).cutoff$and(S0_SHIPRQSTGRP6.bp_grp_nm.like(bind("ship_rqst_id_grp_nm6")))),
				when(boundOr("ship_rqst_id_grp_flg7"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd7.as("ship_rqst_id_grp_cd7"), S0_SHIPRQSTGRP7.bp_grp_nm.as("ship_rqst_id_grp_nm7"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP7).on(S0_SHIPRQST.bp_grp_cd7.eq(S0_SHIPRQSTGRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SHIPRQSTGRP7.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd7.like(bind("ship_rqst_id_grp_cd7"))).cutoff$and(S0_SHIPRQSTGRP7.bp_grp_nm.like(bind("ship_rqst_id_grp_nm7")))),
				when(boundOr("ship_rqst_id_grp_flg8"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd8.as("ship_rqst_id_grp_cd8"), S0_SHIPRQSTGRP8.bp_grp_nm.as("ship_rqst_id_grp_nm8"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP8).on(S0_SHIPRQST.bp_grp_cd8.eq(S0_SHIPRQSTGRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SHIPRQSTGRP8.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd8.like(bind("ship_rqst_id_grp_cd8"))).cutoff$and(S0_SHIPRQSTGRP8.bp_grp_nm.like(bind("ship_rqst_id_grp_nm8")))),
				when(boundOr("ship_rqst_id_grp_flg9"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd9.as("ship_rqst_id_grp_cd9"), S0_SHIPRQSTGRP9.bp_grp_nm.as("ship_rqst_id_grp_nm9"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP9).on(S0_SHIPRQST.bp_grp_cd9.eq(S0_SHIPRQSTGRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SHIPRQSTGRP9.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd9.like(bind("ship_rqst_id_grp_cd9"))).cutoff$and(S0_SHIPRQSTGRP9.bp_grp_nm.like(bind("ship_rqst_id_grp_nm9")))),
				when(boundOr("ship_rqst_id_grp_flg10"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd10.as("ship_rqst_id_grp_cd10"), S0_SHIPRQSTGRP10.bp_grp_nm.as("ship_rqst_id_grp_nm10"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP10).on(S0_SHIPRQST.bp_grp_cd10.eq(S0_SHIPRQSTGRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SHIPRQSTGRP10.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd10.like(bind("ship_rqst_id_grp_cd10"))).cutoff$and(S0_SHIPRQSTGRP10.bp_grp_nm.like(bind("ship_rqst_id_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVGRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLVGRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVGRP1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVGRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVGRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLVGRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVGRP2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVGRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVGRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLVGRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVGRP3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVGRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVGRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLVGRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVGRP4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVGRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVGRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLVGRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVGRP5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVGRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVGRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLVGRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVGRP6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVGRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVGRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLVGRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVGRP7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVGRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVGRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLVGRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVGRP8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVGRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVGRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLVGRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVGRP9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVGRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVGRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLVGRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVGRP10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVGRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd1.as("itm_grp_cd1"), S4_ITMGRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP1).on(S4_ITM.itm_grp_cd1.eq(S4_ITMGRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S4_ITMGRP1.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S4_ITMGRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd2.as("itm_grp_cd2"), S4_ITMGRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP2).on(S4_ITM.itm_grp_cd2.eq(S4_ITMGRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S4_ITMGRP2.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S4_ITMGRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd3.as("itm_grp_cd3"), S4_ITMGRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP3).on(S4_ITM.itm_grp_cd3.eq(S4_ITMGRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S4_ITMGRP3.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S4_ITMGRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd4.as("itm_grp_cd4"), S4_ITMGRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP4).on(S4_ITM.itm_grp_cd4.eq(S4_ITMGRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S4_ITMGRP4.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S4_ITMGRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd5.as("itm_grp_cd5"), S4_ITMGRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP5).on(S4_ITM.itm_grp_cd5.eq(S4_ITMGRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S4_ITMGRP5.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S4_ITMGRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd6.as("itm_grp_cd6"), S4_ITMGRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP6).on(S4_ITM.itm_grp_cd6.eq(S4_ITMGRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S4_ITMGRP6.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S4_ITMGRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd7.as("itm_grp_cd7"), S4_ITMGRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP7).on(S4_ITM.itm_grp_cd7.eq(S4_ITMGRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S4_ITMGRP7.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S4_ITMGRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd8.as("itm_grp_cd8"), S4_ITMGRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP8).on(S4_ITM.itm_grp_cd8.eq(S4_ITMGRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S4_ITMGRP8.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S4_ITMGRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd9.as("itm_grp_cd9"), S4_ITMGRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP9).on(S4_ITM.itm_grp_cd9.eq(S4_ITMGRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S4_ITMGRP9.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S4_ITMGRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd10.as("itm_grp_cd10"), S4_ITMGRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP10).on(S4_ITM.itm_grp_cd10.eq(S4_ITMGRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S4_ITMGRP10.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S4_ITMGRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(MSBEL1710_Ship_RsltR_J01());
	}
	/**
	 * -- MSBEL1710_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL1710_MST_SHIP_ACT_D_S01(Srch01_CndR up0) {
		MCTempView S0_VSHIPACT = createTempView("VSHIPACT");
		MAM_BP_R S0_SHIPRQST = MAM_BP_R.create("SHIPRQST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_GRP_R S0_SHIPRQSTGRP1 = MAM_BP_GRP_R.create("SHIPRQSTGRP1");
		MAM_BP_GRP_R S0_SHIPRQSTGRP2 = MAM_BP_GRP_R.create("SHIPRQSTGRP2");
		MAM_BP_GRP_R S0_SHIPRQSTGRP3 = MAM_BP_GRP_R.create("SHIPRQSTGRP3");
		MAM_BP_GRP_R S0_SHIPRQSTGRP4 = MAM_BP_GRP_R.create("SHIPRQSTGRP4");
		MAM_BP_GRP_R S0_SHIPRQSTGRP5 = MAM_BP_GRP_R.create("SHIPRQSTGRP5");
		MAM_BP_GRP_R S0_SHIPRQSTGRP6 = MAM_BP_GRP_R.create("SHIPRQSTGRP6");
		MAM_BP_GRP_R S0_SHIPRQSTGRP7 = MAM_BP_GRP_R.create("SHIPRQSTGRP7");
		MAM_BP_GRP_R S0_SHIPRQSTGRP8 = MAM_BP_GRP_R.create("SHIPRQSTGRP8");
		MAM_BP_GRP_R S0_SHIPRQSTGRP9 = MAM_BP_GRP_R.create("SHIPRQSTGRP9");
		MAM_BP_GRP_R S0_SHIPRQSTGRP10 = MAM_BP_GRP_R.create("SHIPRQSTGRP10");
		MAM_BP_GRP_R S0_DLVGRP1 = MAM_BP_GRP_R.create("DLVGRP1");
		MAM_BP_GRP_R S0_DLVGRP2 = MAM_BP_GRP_R.create("DLVGRP2");
		MAM_BP_GRP_R S0_DLVGRP3 = MAM_BP_GRP_R.create("DLVGRP3");
		MAM_BP_GRP_R S0_DLVGRP4 = MAM_BP_GRP_R.create("DLVGRP4");
		MAM_BP_GRP_R S0_DLVGRP5 = MAM_BP_GRP_R.create("DLVGRP5");
		MAM_BP_GRP_R S0_DLVGRP6 = MAM_BP_GRP_R.create("DLVGRP6");
		MAM_BP_GRP_R S0_DLVGRP7 = MAM_BP_GRP_R.create("DLVGRP7");
		MAM_BP_GRP_R S0_DLVGRP8 = MAM_BP_GRP_R.create("DLVGRP8");
		MAM_BP_GRP_R S0_DLVGRP9 = MAM_BP_GRP_R.create("DLVGRP9");
		MAM_BP_GRP_R S0_DLVGRP10 = MAM_BP_GRP_R.create("DLVGRP10");
		MST_SHIP_ACT_D_R S4_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S4_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S4_SHIPALLOCSTS= MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_SCHD_R S4_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_INST_D_R S4_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S4_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_PR_R S4_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S4_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S4_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S4_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S4_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MAM_ITM_R S4_ITM = MAM_ITM_R.create("ITM");
		MAM_TRD_R S4_TRD = MAM_TRD_R.create("TRD");
		MAM_LG_GRP_R S4_SHIPLGGRP = MAM_LG_GRP_R.create("SHIPLGGRP");
		MAM_SUNDRY_ITM_R S4_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_BP_R S4_DLV = MAM_BP_R.create("DLV");
		MAM_LOC_R S4_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S4_CST = MAM_BP_R.create("CST");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		MAM_ITM_TYP_D_R S4_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");
		MAM_DPT_R S4_DPT = MAM_DPT_R.create("DPT");
		MAM_LOC_R S4_GRLOC = MAM_LOC_R.create("GRLOC");
		MSVM_SHIP_TO_ID_R S4_SHIPTOID = MSVM_SHIP_TO_ID_R.create("SHIPTOID");
		MAM_ITM_LG_GRP_R S4_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S4_GILOC = MAM_LOC_R.create("GILOC");
		MAM_ITM_GRP_R S4_ITMGRP1 = MAM_ITM_GRP_R.create("ITMGRP1");
		MAM_ITM_GRP_R S4_ITMGRP2 = MAM_ITM_GRP_R.create("ITMGRP2");
		MAM_ITM_GRP_R S4_ITMGRP3 = MAM_ITM_GRP_R.create("ITMGRP3");
		MAM_ITM_GRP_R S4_ITMGRP4 = MAM_ITM_GRP_R.create("ITMGRP4");
		MAM_ITM_GRP_R S4_ITMGRP5 = MAM_ITM_GRP_R.create("ITMGRP5");
		MAM_ITM_GRP_R S4_ITMGRP6 = MAM_ITM_GRP_R.create("ITMGRP6");
		MAM_ITM_GRP_R S4_ITMGRP7 = MAM_ITM_GRP_R.create("ITMGRP7");
		MAM_ITM_GRP_R S4_ITMGRP8 = MAM_ITM_GRP_R.create("ITMGRP8");
		MAM_ITM_GRP_R S4_ITMGRP9 = MAM_ITM_GRP_R.create("ITMGRP9");
		MAM_ITM_GRP_R S4_ITMGRP10 = MAM_ITM_GRP_R.create("ITMGRP10");
		MCTempView S4_VIVSHIPACTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S5_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MAVM_RD_WG_R S6_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S7_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S8_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S8_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S8_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S8_POD = MST_PO_D_R.create("POD");
		MST_PO_R S8_PO = MST_PO_R.create("PO");
		MAM_BP_R S8_SPPL = MAM_BP_R.create("SPPL");
		MAM_LG_CTL_R S9_LGCTL = MAM_LG_CTL_R.create("LGCTL");
		MST_DLV_SLIP_R S10_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MCTempView S10_VDLVSLIP = createTempView("VDLVSLIP");
		
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_SHIP_RQST_ID_GRP = createDynamicSQLID("DS0C_SHIP_RQST_ID_GRP");
		MCDynamicSQLID DS4C_ITM_GRP = createDynamicSQLID("DS4C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1710_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_VSHIPACT.prAll(),
						addDynamicSelect(DS0C_SHIP_RQST_ID_GRP),
						addDynamicSelect(DS0C_DLV_GRP)
					)
					.from(
						subQuery()
						.select(
							decode(S4_SHIPACT.uplnd_flg, 
								value(true),
								value(MSC_PR_STS_TYP.SHIP.value()), 
								S4_SHIPSCHD.pr_sts_typ
							).as("pr_sts_typ"),
							S4_SHIPACT.ship_act_no,
							S4_SHIPACTD.ship_act_d_no,
							S4_SHIPINST.ship_inst_no,
							S4_SHIPINSTD.ship_inst_d_no,
							S4_SLO.slo_no,
							S4_SLO.iv_no.as("slo_iv_no"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLOD.slo_d_no)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_SLOD.slo_d_no)
								.otherwise(S4_SHIPPR.xfr_schd_no).as("ship_rqst_no"),
							S4_SLOD.sls_cststk_flg,
							S4_SHIPACTD.cst_po_no,
							S4_SHIPACTD.cst_po_d_no,
							S4_SHIPSCHD.ship_schd_no,
							S4_SHIPSCHD.re_ship_schd_flg,
							S4_ITM.itm_typ,
							S4_ITM.itm_typ_d_cd,
							S4_ITMTYP.itm_typ_d_nm,
							S4_SHIPACTD.itm_cd,
							S4_SHIPACTD.itm_sub1,
							S4_SHIPACTD.itm_sub2,
							S4_SHIPACTD.itm_sub3,
							cases()
								.when(S4_SHIPACTD.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S4_SHIPACTD.itm_nm,
											S4_SUNDRYITM.itm_nm
										)
								)
								.otherwise(S4_ITM.itm_nm).as("itm_nm"),
							nvl(
								S4_SHIPACTD.iv_itm_nm,
								S4_SUNDRYITM.itm_nm
							).as("sundry_iv_itm_nm"),
							S4_SHIPACTD.sno1,
							S4_SHIPACTD.sno2,
							S4_SHIPACTD.sno3,
							S4_SHIPACTD.sno4,
							decode(
									S4_SLOD.trd_unit_cd,
									nullValue(),
									S4_SHIPACTD.trd_unit_cd,
									S4_SLOD.trd_unit_cd
							).as("trd_unit_cd"),
							S4_SHIPACTD.base_unit_cd,
							bracket(
								S4_SHIPACTD.base_unit_qty.subtract(nvl(S4_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPACTD.ship_ret_qty)
							).as("base_unit_qty"),
							nullValue().as("trd_unit_qty"),
							S4_SHIPACTD.trd_cd,
							S4_TRD.trd_nm,
							S4_TRD.trd_ptn_typ,
							S4_SLOD.interim_flg,
							S4_SLOD.dscnt_rsn_cd,
							S4_SLOD.iv_upri,
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.tax_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_PROVSCHD.tax_cd,
								nullValue()
							).as("tax_cd"),
							decode(
								S4_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.tax_fix_flg,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_PROVSCHD.tax_fix_flg,
								nullValue()
							).as("tax_fix_flg"),
							S4_SHIPACTD.dlv_id_typ,
							S4_SHIPACTD.dlv_id_cd,
							cases()
								.when(S4_SHIPACTD.dlv_sundry_flg.eq(value(false)))
									.then(
										cases()
											.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
												.then(S4_DLV.bp_nm)
											.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
												.then(S4_DLV.bp_nm)
											.otherwise(S4_LOC.loc_nm)
								)
								.otherwise(S4_SHIPACTD.dlv_id_nm)
							.as("dlv_id_nm"),
							S4_SHIPACTD.dlv_sundry_flg,
							S4_SHIPACTD.dlv_zip_cd,
							S4_SHIPACTD.dlv_addr1,
							S4_SHIPACTD.dlv_addr2,
							S4_SHIPACTD.dlv_addr3,
							S4_SHIPACTD.dlv_addr4,
							S4_SHIPACTD.dlv_cntct_dpt,
							S4_SHIPACTD.dlv_cntct_psn,
							S4_SHIPACTD.dlv_tel,
							S4_SHIPACTD.dlv_fax,
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.SPPL.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.otherwise(nullValue()).as("ship_rqst_id_typ"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.sppl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.otherwise(nullValue()).as("ship_rqst_id_cd"),
							S4_CST.sls_upri_cng_flg,
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_SPPL.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_GRLOC.loc_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_GRLOC.loc_nm)
								.otherwise(nullValue()).as("ship_rqst_id_nm"),
							trunc(
								nvl(S4_SHIPINST.ship_schd_tm, S4_SHIPSCHD.ship_schd_tm),
								MCDateFmt.DD
							).as("ship_schd_dt"),
							nvl(S4_SHIPINST.ship_schd_tm, S4_SHIPSCHD.ship_schd_tm).as("ship_schd_hm"),
							nvl(
								nvl(
									S4_SHIPSCHD.pd_inst_dlv_tm,
									S4_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S4_SLOD.dlv_rqst_tm,
									S4_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_tm"),
							trunc(
								nvl(
									nvl(
										S4_SHIPSCHD.pd_inst_dlv_tm,
										S4_SHIPPR.dlv_rqst_tm
									),
									nvl(
										S4_SLOD.dlv_rqst_tm,
										S4_XFRSCHD.gr_rqst_tm
									)
								),
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							nvl(
								nvl(
									S4_SHIPSCHD.pd_inst_dlv_tm,
									S4_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S4_SLOD.dlv_rqst_tm,
									S4_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
							trunc(
									S4_SHIPINST.ship_inst_tm,
									MCDateFmt.DD
								).as("ship_inst_dt"),
							S4_SHIPINST.ship_inst_tm.as("ship_inst_hm"),
							trunc(
									S4_SHIPACT.ship_tm,
									MCDateFmt.DD
								).as("ship_dt"),
							S4_SHIPACT.ship_tm.as("ship_hm"),
							trunc(
									S4_SHIPACT.dlv_tm,
									MCDateFmt.DD
								).as("dlv_dt"),
							S4_SHIPACT.dlv_tm.as("dlv_hm"),
							S4_SHIPACT.via_dlv_typ,
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_id_cd,
								nullValue()
							).as("tdlv_cd"),
							cases()
								.when(S4_SHIPACT.ship_to_sundry_flg.eq(value(false)))
									.then(S4_SHIPTOID.ship_to_id_nm)
								.otherwise(
									decode(
										S4_SHIPACT.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPACT.ship_to_id_nm,
										nullValue()
									)
								).as("tdlv_nm"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_lg_grp_cd,
								nullValue()
							).as("tdlv_lg_grp_cd"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_sundry_flg,
								value(false)
							).as("tdlv_sundry_flg"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_zip_cd,
								nullValue()
							).as("tdlv_zip_cd"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_addr1,
								nullValue()
							).as("tdlv_addr1"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_addr2,
								nullValue()
							).as("tdlv_addr2"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_addr3,
								nullValue()
							).as("tdlv_addr3"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_addr4,
								nullValue()
							).as("tdlv_addr4"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_tel,
								nullValue()
							).as("tdlv_tel"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_fax,
								nullValue()
							).as("tdlv_fax"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_cntct_dpt,
								nullValue()
							).as("tdlv_cntct_dpt"),
							decode(
								S4_SHIPACT.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S4_SHIPACT.ship_to_cntct_psn,
								nullValue()
							).as("tdlv_cntct_psn"),
							S4_SLO.trnspt_cd,
							S4_SLO.vssl_flght,
							S4_SLO.load_port_cd,
							S4_SLO.etd_dt,
							S4_SLO.dschrg_port_cd,
							S4_SLO.eta_dt,
							S4_SLO.via_port_cd,
							S4_SLO.via_schd_dt,
							decode(S4_SHIPACT.uplnd_flg,
								value(false),
								S4_SLO.sls_basis_typ,
								S10_VDLVSLIP.pr(S10_DLVSLIP.sls_basis_typ)
							).as("sls_basis_typ"),
							S4_XFRSCHD.prov_basis_typ,
							S4_SLO.tterm_cd1,
							S4_SLO.tterm_rmrks1,
							S4_SLO.tterm_cd2,
							S4_SLO.tterm_rmrks2,
							S4_SLO.tterm_cd3,
							S4_SLO.tterm_rmrks3,
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.otherwise(nullValue()).as("trd_cur_cd"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.otherwise(nullValue()).as("xrate_inpt_flg"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate)
								.otherwise(nullValue()).as("xrate"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.otherwise(nullValue()).as("ptax_xrate_inpt_flg"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.otherwise(nullValue()).as("ptax_xrate"),
							S4_SHIPACT.ship_fr_lg_grp_cd,
							S4_SHIPLGGRP.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S4_SHIPACTD.cst_itm_cd, 
							S4_SHIPACTD.cst_itm_nm, 
							S4_SHIPACTD.sundry_itm_flg,
							S4_ITM.sno1_mng_typ,
							S4_ITM.sno2_mng_typ,
							S4_ITM.sno3_mng_typ,
							S4_ITM.sno4_mng_typ,
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.trd_unit_cd,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_unit_cd,
								nullValue()
							).as("schd_trd_unit_cd"),
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.trd_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_unit_qty,
								nullValue()
							).as("schd_trd_unit_qty"),
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.base_unit_qty,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S4_SLOD.base_unit_qty,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.base_unit_qty,
								nullValue()
							).as("schd_base_unit_qty"),
							S4_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
							S4_SLOD.iv_amt.as("schd_iv_amt"),
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_upri,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_upri,
								nullValue()
							).as("schd_trd_cur_upri"),
							S4_SLOD.upri_not_tgt_flg,
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_amt,
								nullValue()
							).as("schd_trd_cur_amt"),
							decode(
								S4_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S4_SLOD.trd_cur_tax_amt,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S4_XFRSCHD.trd_cur_tax_amt,
								nullValue()
							).as("schd_trd_cur_tax_amt"),
							nvl(
								decode(
									S4_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_amt_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.prov_amt_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("amt_rnd_typ"),
							nvl(
								decode(
									S4_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_upri_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.sls_upri_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("upri_rnd_typ"),
							nvl(
								decode(
									S4_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S4_CST.sls_tax_rnd_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S4_SPPL.prov_tax_rnd_typ,
									value(MAC_RND_TYP.RNDOFF.value())
								),
								value(MAC_RND_TYP.RNDOFF.value())
							).as("tax_rnd_typ"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd).as("cst_cd"),
							S4_LOC.lg_grp_cd.as("ship_to_lg_grp_cd"),
							S4_SHIPPR.purc_ddlv_flg,
							S4_SHIPACT.ship_term_cd,
							S4_CST.ar_dpt_typ,
							MAPA_BP$F_GET_AR_DPT_CD_NE(
								S4_CST.bp_cd,
								bind("today"),
								value(false)
							).as("lnk_ar_dpt_cd"),
							S4_SHIPACTD.ins_usr_id,
							S4_SHIPACTD.ins_usr_nm,
							S4_SHIPACTD.ins_func_id,
							nullValue().as("ins_func_nm"),
							S4_SHIPACTD.ins_ts,
							S4_SHIPACTD.upd_usr_id,
							S4_SHIPACTD.upd_usr_nm,
							S4_SHIPACTD.upd_func_id,
							nullValue().as("upd_func_nm"),
							S4_SHIPACTD.upd_ts,
							S4_SHIPACTD.upd_srv_req_no,
							addDynamicSelect(DS4C_ITM_GRP)
						)
						.from(
							S4_SHIPACTD
							.innerJoin(S4_SHIPACT).on(S4_SHIPACTD.ship_act_no.eq(S4_SHIPACT.ship_act_no))
							.leftOuterJoin(S4_SHIPALLOCSTS).on(S4_SHIPACTD.ship_alloc_sts_no.eq(S4_SHIPALLOCSTS.ship_alloc_sts_no))
							.leftOuterJoin(S4_SHIPSCHD).on(S4_SHIPALLOCSTS.ship_schd_no.eq(S4_SHIPSCHD.ship_schd_no))
							.leftOuterJoin(S4_SHIPPR).on(S4_SHIPSCHD.ship_pr_no.eq(S4_SHIPPR.ship_pr_no))
							.leftOuterJoin(S4_SHIPINSTD).on(S4_SHIPALLOCSTS.ship_inst_d_no.eq(S4_SHIPINSTD.ship_inst_d_no))
							.leftOuterJoin(S4_SHIPINST).on(S4_SHIPINSTD.ship_inst_no.eq(S4_SHIPINST.ship_inst_no))
							.leftOuterJoin(S4_SLOD).on(S4_SHIPPR.slo_d_no.eq(S4_SLOD.slo_d_no))
							.leftOuterJoin(S4_SLO).on(S4_SLOD.slo_no.eq(S4_SLO.slo_no))
							.leftOuterJoin(S4_PROVSCHD).on(
								bracket(
									S4_SHIPSCHD.ship_schd_no.eq(S4_PROVSCHD.prov_src_schd_no1)
									.and(MAC_TRD_PTN_TYP$IS_PROV(S4_PROVSCHD.trd_ptn_typ).eq(value(true)))
								)
							)
							.leftOuterJoin(S4_XFRSCHD).on(
								bracket(
									S4_SHIPPR.xfr_schd_no.eq(S4_XFRSCHD.xfr_schd_no)
								)
							)
							.leftOuterJoin(subQuery().select(
									S5_IVSHIPACTMAP.ship_act_d_no,
									sum(S5_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
									).from(S5_IVSHIPACTMAP)
									.groupBy(S5_IVSHIPACTMAP.ship_act_d_no)
									.view(S4_VIVSHIPACTMAP))
							.on(S4_SHIPACTD.ship_act_d_no.eq(S4_VIVSHIPACTMAP.pr(S5_IVSHIPACTMAP.ship_act_d_no)))
							.leftOuterJoin(subQuery()
									.selectDistinct(
										S10_DLVSLIP.dlv_slip_act_no,
										S10_DLVSLIP.sls_basis_typ
									).from(S10_DLVSLIP)
									.where(S10_DLVSLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.view(S10_VDLVSLIP)).on(S4_SHIPACT.uplnd_flg.eq(value(true)).and(S4_SHIPACT.ship_act_no.eq(S10_VDLVSLIP.pr(S10_DLVSLIP.dlv_slip_act_no))))
							.leftOuterJoin(S4_ITM).on(
								bracket(
									S4_SHIPACTD.itm_cd.eq(S4_ITM.itm_cd)
									.and(S4_SHIPACTD.itm_sub1.eq(S4_ITM.itm_sub1))
									.and(S4_SHIPACTD.itm_sub2.eq(S4_ITM.itm_sub2))
									.and(S4_SHIPACTD.itm_sub3.eq(S4_ITM.itm_sub3))
								)
							)
							.leftOuterJoin(S4_TRD).on(S4_SHIPACTD.trd_cd.eq(S4_TRD.trd_cd))
							.leftOuterJoin(S4_SHIPLGGRP).on(S4_SHIPACT.ship_fr_lg_grp_cd.eq(S4_SHIPLGGRP.lg_grp_cd))
							.leftOuterJoin(S4_SUNDRYITM).on(
								bracket(
									S4_SHIPACTD.itm_cd.eq(S4_SUNDRYITM.itm_cd)
									.and(S4_SHIPACTD.itm_sub1.eq(S4_SUNDRYITM.itm_sub1))
									.and(S4_SHIPACTD.itm_sub2.eq(S4_SUNDRYITM.itm_sub2))
									.and(S4_SHIPACTD.itm_sub3.eq(S4_SUNDRYITM.itm_sub3))
									.and(S4_SHIPACTD.sno1.eq(S4_SUNDRYITM.sno1))
									.and(S4_SHIPACTD.sno2.eq(S4_SUNDRYITM.sno2))
									.and(S4_SHIPACTD.sno3.eq(S4_SUNDRYITM.sno3))
									.and(S4_SHIPACTD.sno4.eq(S4_SUNDRYITM.sno4))
								)
							)
							.leftOuterJoin(S4_DLV).on(S4_SHIPACTD.dlv_id_cd.eq(S4_DLV.bp_cd))
							.leftOuterJoin(S4_LOC).on(S4_SHIPACTD.dlv_id_cd.eq(S4_LOC.loc_cd))
							.leftOuterJoin(S4_CST).on(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd).eq(S4_CST.bp_cd))
							.leftOuterJoin(S4_SPPL).on(S4_LOC.sppl_cd.eq(S4_SPPL.bp_cd))
							.leftOuterJoin(S4_ITMTYP).on(
								bracket(
									S4_ITM.itm_typ.eq(S4_ITMTYP.itm_typ)
									.and(S4_ITM.itm_typ_d_cd.eq(S4_ITMTYP.itm_typ_d_cd))
								)
							)
							.leftOuterJoin(S4_DPT).on(
								bracket(
									S4_SLO.sls_dpt_cd.eq(S4_DPT.dpt_cd)
									.and(S4_SLO.slo_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
								)
								.or(
									bracket(
											S4_SHIPACT.rqst_dpt_cd.eq(S4_DPT.dpt_cd)
											.and(S4_SHIPACT.ac_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
										)
								)
							)
							.leftOuterJoin(S4_GRLOC).on(S4_XFRSCHD.gr_loc_cd.eq(S4_GRLOC.loc_cd))
							.leftOuterJoin(S4_SHIPTOID).on(
								bracket(
									S4_SHIPACT.ship_to_id_typ.eq(S4_SHIPTOID.ship_to_id_typ)
									.and(S4_SHIPACT.ship_to_id_cd.eq(S4_SHIPTOID.ship_to_id_cd))
									.and(S4_SHIPACT.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								)
							)
							.leftOuterJoin(S4_ITMLGGRP).on(
								bracket(
									S4_XFRSCHD.itm_cd.eq(S4_ITMLGGRP.itm_cd)
									.and(S4_XFRSCHD.itm_sub1.eq(S4_ITMLGGRP.itm_sub1))
									.and(S4_XFRSCHD.itm_sub2.eq(S4_ITMLGGRP.itm_sub2))
									.and(S4_XFRSCHD.itm_sub3.eq(S4_ITMLGGRP.itm_sub3))
									.and(S4_XFRSCHD.gi_lg_grp_cd.eq(S4_ITMLGGRP.lg_grp_cd))
								)
							)
							.leftOuterJoin(S4_GILOC).on(
								bracket(
									S4_XFRSCHD.gi_lg_grp_cd.eq(S4_GILOC.lg_grp_cd)
									.and(S4_GILOC.lg_def_flg.eq(value(true)))
									.and(S4_GILOC.del_flg.eq(value(false)))
								)
							)
							.addDynamicView(DS4C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S4_SHIPACT.can_flg.eq(value(false)))
							.and(S4_SHIPACTD.can_flg.eq(value(false)))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S6_RDWG)
									.where(
										S4_DPT.wg_cd.eq(S6_RDWG.wg_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_RDLOC)
										.where(
											coalesce(
												S4_XFRSCHD.gi_loc_cd,
												S4_ITMLGGRP.lg_def_loc_cd,
												S4_GILOC.loc_cd
											).eq(S7_RDLOC.loc_cd)
										)
									)
								)
							)
							.and(
								bracket(
									S4_SHIPACT.uplnd_flg.eq(value(true))
									.or(
										S4_SHIPPR.purc_ddlv_flg.eq(value(false))
										.or(
											exists(
												subQuery()
												.select(value("X"))
												.from(
													S8_SLSSCHD
													.innerJoin(S8_PURCSCHD).on(
														bracket(
															S8_SLSSCHD.purc_schd_no.eq(S8_PURCSCHD.purc_schd_no)
														)
													)
													.innerJoin(S8_ARRPR).on(
														bracket(
															S8_PURCSCHD.arr_pr_no.eq(S8_ARRPR.arr_pr_no)
														)
													)
													.innerJoin(S8_POD).on(
														bracket(
															S8_ARRPR.po_d_no.eq(S8_POD.po_d_no)
														)
													)
													.innerJoin(S8_PO).on(
														bracket(
															S8_POD.po_no.eq(S8_PO.po_no)
														)
													)
													.leftOuterJoin(S8_SPPL).on(
														bracket(
															S8_PO.sppl_cd.eq(S8_SPPL.bp_cd)
														)
													)
												)
												.where(
													value(0).eq(value(0))
													.and(S4_SHIPSCHD.ship_schd_no.eq(S8_SLSSCHD.ship_schd_no))
													.and(S8_SLSSCHD.cmpl_flg.eq(value(false)))
													.and(S8_SLSSCHD.purc_schd_no.isNotNull())
													.and(S8_POD.rqst_can_flg.eq(value(false)))
													.and(S8_SPPL.sppl_iv_flg.eq(value(false)))
												)
											)
										)
									)
								)
							)
							.and(S4_SHIPACTD.base_unit_qty.subtract(nvl(S4_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPACTD.ship_ret_qty).gt(value(0)))
							.cutoff$and(
								decode(
										S4_SHIPACT.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPACT.ship_to_id_cd,
										nullValue()
									).like(bind("tdlv_cd"))
							)
							.cutoff$and(S4_SHIPACT.ship_fr_lg_grp_cd.like(bind("ship_fr_lg_grp_cd")))
							.cutoff$and(S4_SHIPLGGRP.lg_grp_nm.like(bind("ship_fr_lg_grp_nm")))
							.cutoff$and(S4_SHIPACTD.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S4_TRD.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S4_SHIPSCHD.ship_schd_no.like(bind("ship_schd_no")))
							.cutoff$and(S4_SLO.slo_no.like(bind("slo_no")))
							.cutoff$and(S4_SHIPACTD.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S4_SHIPACTD.cst_po_d_no.like(bind("cst_po_d_no")))
							.cutoff$and(S4_SHIPINST.ship_inst_no.like(bind("ship_inst_no")))
							.cutoff$and(S4_SHIPINSTD.ship_inst_d_no.like(bind("ship_inst_d_no")))
							.cutoff$and(S4_SHIPACT.ship_act_no.like(bind("ship_act_no")))
							.cutoff$and(S4_SHIPACTD.ship_act_d_no.like(bind("ship_act_d_no")))
							.cutoff$and(S4_SHIPACTD.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(S4_SHIPACTD.dlv_id_cd.like(bind("dlv_id_cd")))
							.cutoff$and(S4_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S4_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S4_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S4_SHIPACTD.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S4_SHIPACTD.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S4_SHIPACTD.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S4_SHIPACTD.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S4_SHIPACTD.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S4_SHIPACTD.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(nvl(S4_SHIPINST.ship_schd_tm, S4_SHIPSCHD.ship_schd_tm).gte(bind("ship_schd_hm_fr")))
							.cutoff$and(nvl(S4_SHIPINST.ship_schd_tm, S4_SHIPSCHD.ship_schd_tm).lte(bind("ship_schd_hm_to")))
							.cutoff$and(S4_SLO.etd_dt.gte(bind("etd_dt_fr")))
							.cutoff$and(S4_SLO.etd_dt.lte(bind("etd_dt_to")))
							.cutoff$and(S4_SLO.eta_dt.gte(bind("eta_dt_fr")))
							.cutoff$and(S4_SLO.eta_dt.lte(bind("eta_dt_to")))
							.cutoff$and(S4_SLO.via_schd_dt.gte(bind("via_schd_dt_fr")))
							.cutoff$and(S4_SLO.via_schd_dt.lte(bind("via_schd_dt_to")))
							.cutoff$and(S4_SHIPINST.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
							.cutoff$and(S4_SHIPINST.ship_inst_tm.lte(bind("ship_inst_hm_to")))
							.cutoff$and(S4_SHIPACT.ship_tm.gte(bind("ship_hm_fr")))
							.cutoff$and(S4_SHIPACT.ship_tm.lte(bind("ship_hm_to")))
							.cutoff$and(S4_SHIPACT.dlv_tm.gte(bind("dlv_hm_fr")))
							.cutoff$and(S4_SHIPACT.dlv_tm.lte(bind("dlv_hm_to")))
							.addDynamicPredicate(DS4C_ITM_GRP)
						).view(S0_VSHIPACT)
						.leftOuterJoin(S0_SHIPRQST).on(
							bracket(
								S0_VSHIPACT.pr("ship_rqst_id_cd").eq(S0_SHIPRQST.bp_cd)
								.and(S0_VSHIPACT.pr("ship_rqst_id_typ").neq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_VSHIPACT.pr(S4_SHIPACTD.dlv_id_cd).eq(S0_DLV.bp_cd)
								.and(S0_VSHIPACT.pr(S4_SHIPACTD.dlv_id_typ).eq(value(MSC_DLV_ID_TYP.DLV.value())))
							)
						)
						.addDynamicView(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bracket(
										value(MAC_TRD_PTN_TYP.SLS.value()).eq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ))
										.or(value(MAC_TRD_PTN_TYP.SHIP.value()).eq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
									)
								.and(S0_SHIPRQST.cst_iv_flg.eq(value(true)))
							)
							.or(
								value(MAC_TRD_PTN_TYP.SLS.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ))
								.and(value(MAC_TRD_PTN_TYP.SHIP.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
								.and(value(MAC_TRD_PTN_TYP.PROV_RTN.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S9_LGCTL)
										.where(
											value(0).eq(value(0))
											.and(S0_VSHIPACT.pr("ship_fr_lg_grp_cd").eq(S9_LGCTL.fr_lg_grp_cd))
											.and(S0_VSHIPACT.pr("ship_to_lg_grp_cd").eq(S9_LGCTL.to_lg_grp_cd))
											.and(S9_LGCTL.iv_trd_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_VSHIPACT.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_VSHIPACT.pr("ship_rqst_no").like(bind("ship_rqst_no")))
						.cutoff$and(S0_VSHIPACT.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_VSHIPACT.pr("ship_rqst_id_typ").like(bind("ship_rqst_id_typ")))
						.cutoff$and(S0_VSHIPACT.pr("ship_rqst_id_cd").like(bind("ship_rqst_id_cd")))
						.cutoff$and(S0_VSHIPACT.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
						.cutoff$and(S0_VSHIPACT.pr("itm_nm").like(bind("itm_nm")))
						.cutoff$and(S0_VSHIPACT.pr("dlv_rqst_tm").gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_VSHIPACT.pr("dlv_rqst_tm").lte(bind("dlv_rqst_hm_to")))
						.addDynamicPredicate(DS0C_SHIP_RQST_ID_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(
						S0_VSHIPACT.pr(S4_SLO.slo_no).asc(),
						S0_VSHIPACT.pr("ship_rqst_no").asc(),
						S0_VSHIPACT.pr(S4_SHIPSCHD.ship_schd_no).asc(),
						S0_VSHIPACT.pr(S4_SHIPACT.ship_act_no).asc(),
						S0_VSHIPACT.pr(S4_SHIPACTD.ship_act_d_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ship_rqst_id_grp_flg1"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd1.as("ship_rqst_id_grp_cd1"), S0_SHIPRQSTGRP1.bp_grp_nm.as("ship_rqst_id_grp_nm1"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP1).on(S0_SHIPRQST.bp_grp_cd1.eq(S0_SHIPRQSTGRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SHIPRQSTGRP1.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd1.like(bind("ship_rqst_id_grp_cd1"))).cutoff$and(S0_SHIPRQSTGRP1.bp_grp_nm.like(bind("ship_rqst_id_grp_nm1")))),
				when(boundOr("ship_rqst_id_grp_flg2"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd2.as("ship_rqst_id_grp_cd2"), S0_SHIPRQSTGRP2.bp_grp_nm.as("ship_rqst_id_grp_nm2"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP2).on(S0_SHIPRQST.bp_grp_cd2.eq(S0_SHIPRQSTGRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SHIPRQSTGRP2.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd2.like(bind("ship_rqst_id_grp_cd2"))).cutoff$and(S0_SHIPRQSTGRP2.bp_grp_nm.like(bind("ship_rqst_id_grp_nm2")))),
				when(boundOr("ship_rqst_id_grp_flg3"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd3.as("ship_rqst_id_grp_cd3"), S0_SHIPRQSTGRP3.bp_grp_nm.as("ship_rqst_id_grp_nm3"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP3).on(S0_SHIPRQST.bp_grp_cd3.eq(S0_SHIPRQSTGRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SHIPRQSTGRP3.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd3.like(bind("ship_rqst_id_grp_cd3"))).cutoff$and(S0_SHIPRQSTGRP3.bp_grp_nm.like(bind("ship_rqst_id_grp_nm3")))),
				when(boundOr("ship_rqst_id_grp_flg4"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd4.as("ship_rqst_id_grp_cd4"), S0_SHIPRQSTGRP4.bp_grp_nm.as("ship_rqst_id_grp_nm4"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP4).on(S0_SHIPRQST.bp_grp_cd4.eq(S0_SHIPRQSTGRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SHIPRQSTGRP4.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd4.like(bind("ship_rqst_id_grp_cd4"))).cutoff$and(S0_SHIPRQSTGRP4.bp_grp_nm.like(bind("ship_rqst_id_grp_nm4")))),
				when(boundOr("ship_rqst_id_grp_flg5"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd5.as("ship_rqst_id_grp_cd5"), S0_SHIPRQSTGRP5.bp_grp_nm.as("ship_rqst_id_grp_nm5"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP5).on(S0_SHIPRQST.bp_grp_cd5.eq(S0_SHIPRQSTGRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SHIPRQSTGRP5.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd5.like(bind("ship_rqst_id_grp_cd5"))).cutoff$and(S0_SHIPRQSTGRP5.bp_grp_nm.like(bind("ship_rqst_id_grp_nm5")))),
				when(boundOr("ship_rqst_id_grp_flg6"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd6.as("ship_rqst_id_grp_cd6"), S0_SHIPRQSTGRP6.bp_grp_nm.as("ship_rqst_id_grp_nm6"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP6).on(S0_SHIPRQST.bp_grp_cd6.eq(S0_SHIPRQSTGRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SHIPRQSTGRP6.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd6.like(bind("ship_rqst_id_grp_cd6"))).cutoff$and(S0_SHIPRQSTGRP6.bp_grp_nm.like(bind("ship_rqst_id_grp_nm6")))),
				when(boundOr("ship_rqst_id_grp_flg7"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd7.as("ship_rqst_id_grp_cd7"), S0_SHIPRQSTGRP7.bp_grp_nm.as("ship_rqst_id_grp_nm7"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP7).on(S0_SHIPRQST.bp_grp_cd7.eq(S0_SHIPRQSTGRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SHIPRQSTGRP7.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd7.like(bind("ship_rqst_id_grp_cd7"))).cutoff$and(S0_SHIPRQSTGRP7.bp_grp_nm.like(bind("ship_rqst_id_grp_nm7")))),
				when(boundOr("ship_rqst_id_grp_flg8"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd8.as("ship_rqst_id_grp_cd8"), S0_SHIPRQSTGRP8.bp_grp_nm.as("ship_rqst_id_grp_nm8"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP8).on(S0_SHIPRQST.bp_grp_cd8.eq(S0_SHIPRQSTGRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SHIPRQSTGRP8.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd8.like(bind("ship_rqst_id_grp_cd8"))).cutoff$and(S0_SHIPRQSTGRP8.bp_grp_nm.like(bind("ship_rqst_id_grp_nm8")))),
				when(boundOr("ship_rqst_id_grp_flg9"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd9.as("ship_rqst_id_grp_cd9"), S0_SHIPRQSTGRP9.bp_grp_nm.as("ship_rqst_id_grp_nm9"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP9).on(S0_SHIPRQST.bp_grp_cd9.eq(S0_SHIPRQSTGRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SHIPRQSTGRP9.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd9.like(bind("ship_rqst_id_grp_cd9"))).cutoff$and(S0_SHIPRQSTGRP9.bp_grp_nm.like(bind("ship_rqst_id_grp_nm9")))),
				when(boundOr("ship_rqst_id_grp_flg10"))
					.select(DS0C_SHIP_RQST_ID_GRP, S0_SHIPRQST.bp_grp_cd10.as("ship_rqst_id_grp_cd10"), S0_SHIPRQSTGRP10.bp_grp_nm.as("ship_rqst_id_grp_nm10"))
					.view(DS0C_SHIP_RQST_ID_GRP, v -> v.leftOuterJoin(S0_SHIPRQSTGRP10).on(S0_SHIPRQST.bp_grp_cd10.eq(S0_SHIPRQSTGRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SHIPRQSTGRP10.bp_grp_typ))))
					.predicate(DS0C_SHIP_RQST_ID_GRP, p -> p.cutoff$and(S0_SHIPRQST.bp_grp_cd10.like(bind("ship_rqst_id_grp_cd10"))).cutoff$and(S0_SHIPRQSTGRP10.bp_grp_nm.like(bind("ship_rqst_id_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVGRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLVGRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVGRP1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVGRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVGRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLVGRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVGRP2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVGRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVGRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLVGRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVGRP3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVGRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVGRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLVGRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVGRP4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVGRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVGRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLVGRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVGRP5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVGRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVGRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLVGRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVGRP6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVGRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVGRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLVGRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVGRP7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVGRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVGRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLVGRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVGRP8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVGRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVGRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLVGRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVGRP9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVGRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVGRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVGRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLVGRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVGRP10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVGRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd1.as("itm_grp_cd1"), S4_ITMGRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP1).on(S4_ITM.itm_grp_cd1.eq(S4_ITMGRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S4_ITMGRP1.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S4_ITMGRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd2.as("itm_grp_cd2"), S4_ITMGRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP2).on(S4_ITM.itm_grp_cd2.eq(S4_ITMGRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S4_ITMGRP2.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S4_ITMGRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd3.as("itm_grp_cd3"), S4_ITMGRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP3).on(S4_ITM.itm_grp_cd3.eq(S4_ITMGRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S4_ITMGRP3.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S4_ITMGRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd4.as("itm_grp_cd4"), S4_ITMGRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP4).on(S4_ITM.itm_grp_cd4.eq(S4_ITMGRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S4_ITMGRP4.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S4_ITMGRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd5.as("itm_grp_cd5"), S4_ITMGRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP5).on(S4_ITM.itm_grp_cd5.eq(S4_ITMGRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S4_ITMGRP5.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S4_ITMGRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd6.as("itm_grp_cd6"), S4_ITMGRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP6).on(S4_ITM.itm_grp_cd6.eq(S4_ITMGRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S4_ITMGRP6.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S4_ITMGRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd7.as("itm_grp_cd7"), S4_ITMGRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP7).on(S4_ITM.itm_grp_cd7.eq(S4_ITMGRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S4_ITMGRP7.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S4_ITMGRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd8.as("itm_grp_cd8"), S4_ITMGRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP8).on(S4_ITM.itm_grp_cd8.eq(S4_ITMGRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S4_ITMGRP8.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S4_ITMGRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd9.as("itm_grp_cd9"), S4_ITMGRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP9).on(S4_ITM.itm_grp_cd9.eq(S4_ITMGRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S4_ITMGRP9.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S4_ITMGRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS4C_ITM_GRP, S4_ITM.itm_grp_cd10.as("itm_grp_cd10"), S4_ITMGRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS4C_ITM_GRP, v -> v.leftOuterJoin(S4_ITMGRP10).on(S4_ITM.itm_grp_cd10.eq(S4_ITMGRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S4_ITMGRP10.itm_grp_typ))))
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S4_ITMGRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(r -> up0.ship_flg())
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_SHIPSCHD.pr_sts_typ.like(bind("pr_sts_typ")).or(S4_SHIPACT.uplnd_flg.eq(value(true))))),
				when(r -> !up0.ship_flg())
					.predicate(DS4C_ITM_GRP, p -> p.cutoff$and(S4_SHIPSCHD.pr_sts_typ.like(bind("pr_sts_typ"))))
					)
			.setJoinInfo(MSBEL1710_Ship_RsltR_J01());
	}
}