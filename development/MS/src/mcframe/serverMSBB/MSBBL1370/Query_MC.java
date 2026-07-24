package mcframe.serverMSBB.MSBBL1370;

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
	 * -- MSBBL1370_MST_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1370_MST_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MSVT_WRK_SNO_R S0_WSNO = MSVT_WRK_SNO_R.create("WSNO");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLS_RET_SCHD_D_R S0_RETSD = MST_SLS_RET_SCHD_D_R.create("RETSD");
		MST_SLS_RET_SCHD_R S0_RETS = MST_SLS_RET_SCHD_R.create("RETS");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R NEW_ACST = MAM_BP_R.create("NEWACST");
		MAM_CUR_R S0_TCUR = MAM_CUR_R.create("TCUR");
		MAM_USR_R S0_SUSR = MAM_USR_R.create("SUSR");
		MAM_DPT_R S0_SDPT = MAM_DPT_R.create("SDPT");
		MAM_DPT_R S0_ADPT = MAM_DPT_R.create("ADPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_LG_GRP_R S0_LGGRP = MAM_LG_GRP_R.create("LGGRP");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_ITM_TYP_D_R S0_ITD = MAM_ITM_TYP_D_R.create("ITD");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_STK_GD_R S0_GD = MAM_STK_GD_R.create("GD");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_DPT_R S0_BDPT = MAM_DPT_R.create("BDPT");
		MAM_UNIT_R S0_SCHDUNIT = MAM_UNIT_R.create("SCHDUNIT");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_ITM_GRP_R S0_ITMG1 = MAM_ITM_GRP_R.create("ITMG1");
		MAM_ITM_GRP_R S0_ITMG2 = MAM_ITM_GRP_R.create("ITMG2");
		MAM_ITM_GRP_R S0_ITMG3 = MAM_ITM_GRP_R.create("ITMG3");
		MAM_ITM_GRP_R S0_ITMG4 = MAM_ITM_GRP_R.create("ITMG4");
		MAM_ITM_GRP_R S0_ITMG5 = MAM_ITM_GRP_R.create("ITMG5");
		MAM_ITM_GRP_R S0_ITMG6 = MAM_ITM_GRP_R.create("ITMG6");
		MAM_ITM_GRP_R S0_ITMG7 = MAM_ITM_GRP_R.create("ITMG7");
		MAM_ITM_GRP_R S0_ITMG8 = MAM_ITM_GRP_R.create("ITMG8");
		MAM_ITM_GRP_R S0_ITMG9 = MAM_ITM_GRP_R.create("ITMG9");
		MAM_ITM_GRP_R S0_ITMG10 = MAM_ITM_GRP_R.create("ITMG10");
		MAM_BP_GRP_R S0_CSTG1 = MAM_BP_GRP_R.create("CSTG1");
		MAM_BP_GRP_R S0_CSTG2 = MAM_BP_GRP_R.create("CSTG2");
		MAM_BP_GRP_R S0_CSTG3 = MAM_BP_GRP_R.create("CSTG3");
		MAM_BP_GRP_R S0_CSTG4 = MAM_BP_GRP_R.create("CSTG4");
		MAM_BP_GRP_R S0_CSTG5 = MAM_BP_GRP_R.create("CSTG5");
		MAM_BP_GRP_R S0_CSTG6 = MAM_BP_GRP_R.create("CSTG6");
		MAM_BP_GRP_R S0_CSTG7 = MAM_BP_GRP_R.create("CSTG7");
		MAM_BP_GRP_R S0_CSTG8 = MAM_BP_GRP_R.create("CSTG8");
		MAM_BP_GRP_R S0_CSTG9 = MAM_BP_GRP_R.create("CSTG9");
		MAM_BP_GRP_R S0_CSTG10 = MAM_BP_GRP_R.create("CSTG10");
		MAM_BP_GRP_R S0_ACSTG1 = MAM_BP_GRP_R.create("ACSTG1");
		MAM_BP_GRP_R S0_ACSTG2 = MAM_BP_GRP_R.create("ACSTG2");
		MAM_BP_GRP_R S0_ACSTG3 = MAM_BP_GRP_R.create("ACSTG3");
		MAM_BP_GRP_R S0_ACSTG4 = MAM_BP_GRP_R.create("ACSTG4");
		MAM_BP_GRP_R S0_ACSTG5 = MAM_BP_GRP_R.create("ACSTG5");
		MAM_BP_GRP_R S0_ACSTG6 = MAM_BP_GRP_R.create("ACSTG6");
		MAM_BP_GRP_R S0_ACSTG7 = MAM_BP_GRP_R.create("ACSTG7");
		MAM_BP_GRP_R S0_ACSTG8 = MAM_BP_GRP_R.create("ACSTG8");
		MAM_BP_GRP_R S0_ACSTG9 = MAM_BP_GRP_R.create("ACSTG9");
		MAM_BP_GRP_R S0_ACSTG10 = MAM_BP_GRP_R.create("ACSTG10");
		MAM_BP_GRP_R S0_DLVG1 = MAM_BP_GRP_R.create("DLVG1");
		MAM_BP_GRP_R S0_DLVG2 = MAM_BP_GRP_R.create("DLVG2");
		MAM_BP_GRP_R S0_DLVG3 = MAM_BP_GRP_R.create("DLVG3");
		MAM_BP_GRP_R S0_DLVG4 = MAM_BP_GRP_R.create("DLVG4");
		MAM_BP_GRP_R S0_DLVG5 = MAM_BP_GRP_R.create("DLVG5");
		MAM_BP_GRP_R S0_DLVG6 = MAM_BP_GRP_R.create("DLVG6");
		MAM_BP_GRP_R S0_DLVG7 = MAM_BP_GRP_R.create("DLVG7");
		MAM_BP_GRP_R S0_DLVG8 = MAM_BP_GRP_R.create("DLVG8");
		MAM_BP_GRP_R S0_DLVG9 = MAM_BP_GRP_R.create("DLVG9");
		MAM_BP_GRP_R S0_DLVG10 = MAM_BP_GRP_R.create("DLVG10");
		MAM_BP_GRP_R S0_BCSTG1 = MAM_BP_GRP_R.create("BCSTG1");
		MAM_BP_GRP_R S0_BCSTG2 = MAM_BP_GRP_R.create("BCSTG2");
		MAM_BP_GRP_R S0_BCSTG3 = MAM_BP_GRP_R.create("BCSTG3");
		MAM_BP_GRP_R S0_BCSTG4 = MAM_BP_GRP_R.create("BCSTG4");
		MAM_BP_GRP_R S0_BCSTG5 = MAM_BP_GRP_R.create("BCSTG5");
		MAM_BP_GRP_R S0_BCSTG6 = MAM_BP_GRP_R.create("BCSTG6");
		MAM_BP_GRP_R S0_BCSTG7 = MAM_BP_GRP_R.create("BCSTG7");
		MAM_BP_GRP_R S0_BCSTG8 = MAM_BP_GRP_R.create("BCSTG8");
		MAM_BP_GRP_R S0_BCSTG9 = MAM_BP_GRP_R.create("BCSTG9");
		MAM_BP_GRP_R S0_BCSTG10 = MAM_BP_GRP_R.create("BCSTG10");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1370_MST_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_TRD.trd_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T2.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_ITM.comp_spec_typ,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T1.trd_cur_cd,
						S0_ITM.dscnt_itm_flg,
						S0_SLOD.sls_upri_req_typ,
						S0_SLO.slo_dt,
						trunc(
							S0_SLOD.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_SLOD.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_SLOD.sls_schd_dt.as("sls_schd_dt"),
						S0_T2.upri_not_tgt_flg,
						S0_T2.interim_flg,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						nvl(
							S0_SLOD.trd_unit_qty,
							S0_T2.trd_unit_qty
						).as("trd_unit_qty_for_upri"),
						decode(
							S0_SLOD.slo_d_no,
							nullValue(),
							decode(
								S0_RETSD.sls_ret_schd_d_no,
								nullValue(),
								S0_T2.trd_unit_cd,
								S0_RETSD.trd_unit_cd
							),
							S0_SLOD.trd_unit_cd
						).as("schd_trd_unit_cd"),
						S0_SCHDUNIT.unit_nm.as("schd_trd_unit_nm"),
						decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.SLS_XTRA.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.SLS_RTN.value()),
								nvl(
									S0_RETSD.tax_fix_flg,
									value(false)
								),
								nvl2(
									S0_IVD.iv_d_no,
									S0_IVD.tax_fix_flg,
									S0_SLOD.tax_fix_flg
								)
							).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri.as("sls_cost_upri"),
						S0_T2.cost_amt.as("sls_cost_amt"),
						S0_T1.base_cur_cd,
						S0_T1.xrate,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						decode(
							S0_IV.iv_no,
							nullValue(),
							decode(
								S0_SLO.slo_no,
								nullValue(),
								decode(
									S0_RETS.sls_ret_schd_no,
									nullValue(),
									value(false),
									S0_RETS.xrate_inpt_flg
								),
								S0_SLO.xrate_inpt_flg
							),
							S0_IV.xrate_inpt_flg
						).as("xrate_inpt_flg"),
						S0_T2.base_cur_upri,
						S0_T2.base_cur_upri.as("old_base_cur_upri"),
						S0_T2.base_cur_amt,
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt,
						S0_T2.base_cur_dscnt_amt,
						S0_T2.cost_amt.as("base_cur_sls_cost_amt"),
						S0_T1.ptax_cur_cd,
						S0_T1.ptax_xrate,
						decode(
							S0_IV.iv_no,
							nullValue(),
							decode(
								S0_SLO.slo_no,
								nullValue(),
								decode(
									S0_RETS.sls_ret_schd_no,
									nullValue(),
									value(false),
									S0_RETS.ptax_xrate_inpt_flg
								),
								S0_SLO.ptax_xrate_inpt_flg
							),
							S0_IV.ptax_xrate_inpt_flg
						).as("ptax_xrate_inpt_flg"),
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_upri.as("old_ptax_cur_upri"),
						S0_T2.ptax_cur_amt,
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt,
						S0_T2.ptax_cur_dscnt_amt,
						S0_T1.sls_dt,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.bill_basis_dt,
						S0_T1.rcv_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T2.cst_po_d_no,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("intr_d_rmrks"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.gd_cd,
						S0_T1.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_SDPT.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						bracket(
							cases()
								.when(bind("ope").eq(value("1")))
									.then(NEW_ACST.bcst_cd)
								.otherwise(S0_T1.bcst_cd)
						).as("bcst_cd"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.pri_prnt_flg,
						S0_T2.dlv_sundry_flg,
						S0_DLV.cntry_cd,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.tdlv_cd,
						nvl(
							S0_T2.tdlv_nm,
							S0_TDLV.bp_nm
						).as("tdlv_nm"),
						S0_T1.ship_lg_grp_cd,
						bracket(
							cases()
								.when(bind("ope").eq(value("1")))
									.then(S0_CST.acst_cd)
								.otherwise(S0_T1.acst_cd)
						).as("acst_cd"),
						S0_T1.ar_dpt_cd,
						S0_ADPT.dpt_nm.as("ar_dpt_nm"),
						S0_T1.dlv_slip_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.sls_act_no,
						S0_T1.sls_act_rev,
						S0_T2.sls_act_d_no,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T1.sls_ret_schd_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T2.qtn_d_no,
						S0_T2.purc_ddlv_po_no,
						S0_T2.purc_ddlv_po_d_no,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.cst_po_no,
						S0_T2.bill_crryovr_times,
						S0_T2.rsn_cd.as("biz_rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_BDPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.ext_sys_cd,
						S0_EXT.ext_sys_nm,
						S0_T2.ext_purc_act_d_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.disp_seq,
						S0_T2.loc_cd.as("io_loc_cd"),
						S0_T2.str_ln_cd.as("io_str_ln_cd"),
						S0_TRD.trd_ptn_typ,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_seq,
						S0_T1.upd_cntr.as("hdr_upd_cntr"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CST.cst_iv_flg,
						value(true).as("sls_upri_cng_flg"),
						S0_T2.bd_dpt_cd.as("bef_bd_dpt_cd"),
						S0_T2.base_sls_ac_dt,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ACST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_BCST_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
							.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_SLO).on(S0_T2.slo_no.eq(S0_SLO.slo_no))
						.leftOuterJoin(S0_SLOD).on(
							S0_T2.slo_no.eq(S0_SLOD.slo_no)
							.and(S0_T2.slo_d_no.eq(S0_SLOD.slo_d_no))
						)
						.leftOuterJoin(S0_RETSD).on(S0_T2.sls_ret_schd_d_no.eq(S0_RETSD.sls_ret_schd_d_no))
						.leftOuterJoin(S0_RETS).on(S0_RETSD.sls_ret_schd_no.eq(S0_RETS.sls_ret_schd_no))
						.leftOuterJoin(S0_TRD).on(S0_T1.trd_cd.eq(S0_TRD.trd_cd))
						.leftOuterJoin(S0_CST).on(S0_T1.cst_cd.eq(S0_CST.bp_cd))
						.leftOuterJoin(NEW_ACST).on(S0_CST.acst_cd.eq(NEW_ACST.bp_cd))
						.leftOuterJoin(S0_SDPT).on(
							S0_T1.sls_dpt_cd.eq(S0_SDPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_SDPT.st_dt, S0_SDPT.end_dt))
						)
						.leftOuterJoin(S0_ADPT).on(
							S0_T1.ar_dpt_cd.eq(S0_ADPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_ADPT.st_dt, S0_ADPT.end_dt))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T2.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_DLV).on(S0_T2.dlv_cd.eq(S0_DLV.bp_cd))
						.leftOuterJoin(S0_ITMLCL).on(
							S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
							.and(
								nvl(
									S0_DLV.prnt_lcl_cd,
									S0_CST.prnt_lcl_cd
								).eq(S0_ITMLCL.lcl_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(S0_T2.tdlv_cd.eq(S0_TDLV.bp_cd))
						.leftOuterJoin(S0_BDPT).on(
							S0_T2.bd_dpt_cd.eq(S0_BDPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_BDPT.st_dt, S0_BDPT.end_dt))
						)
						.leftOuterJoin(S0_SCHDUNIT).on(
							decode(
								S0_SLOD.slo_d_no,
								nullValue(),
								decode(
									S0_RETSD.sls_ret_schd_d_no,
									nullValue(),
									S0_T2.trd_unit_cd,
									S0_RETSD.trd_unit_cd
								),
								S0_SLOD.trd_unit_cd
							).eq(S0_SCHDUNIT.unit_cd)
						)
						.leftOuterJoin(S0_IV).on(
							decode(
								S0_T1.iv_no,
								value(MAC_STR.NULL_VAL.value()),
								nullValue(),
								S0_T1.iv_no
							).eq(S0_IV.iv_no)
						)
						.leftOuterJoin(S0_IVD).on(
							S0_T2.iv_d_no.eq(S0_IVD.iv_d_no)
						)
						.leftOuterJoin(S0_EXT).on(S0_T2.ext_sys_cd.eq(S0_EXT.ext_sys_cd))
						.innerJoin(S0_DAC).on(S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ACST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_adjst_typ.isNull())
						.and(
							bracket(
								bind("sls").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS.value()),
										value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
									)
								)
							)
							.or(
								bind("sls_ret").eq(value(true))
								.and(S0_TRD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
							.or(
								bind("sls_dscnt").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
										value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
									)
								)
							)
						)
						.cutoff$and(S0_CST.cst_iv_flg.eq(bind("cst_iv_flg_str")))
						.cutoff$and(S0_T2.interim_flg.eq(bind("interim_flg_str")))
						.and(
							S0_TRD.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
							)
							.or(
								bracket(
									bind("opn_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.OPN.value())))
								)
								.or(
									bind("fix_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.FIX.value())))
								)
								.or(
									bind("acpt_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
								)
								.or(
									bind("rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.RJCT.value())))
								)
								.or(
									bind("last_rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.LAST_RJCT.value())))
								)
								.or(
									bind("not_aprv_flg").eq(value(true))
									.and(S0_T1.aprv_flg.eq(value(false)))
								)
							)
						)
						.cutoff$and(S0_T1.sls_dt.gte(bind("sls_dt_fr")))
						.cutoff$and(S0_T1.sls_dt.lte(bind("sls_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.dlv_tm.gte(bind("dlv_hm_fr")))
						.cutoff$and(S0_T1.dlv_tm.lte(bind("dlv_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_SDPT.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.dlv_nm,
								S0_DLV.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.sls_act_no.like(bind("sls_act_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T2.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.ext_purc_act_d_no.like(bind("ext_purc_act_d_no")))
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(
								bind("foreign_flg_str").eq(value(true))
								.and(S0_CO.base_cur_cd.neq(S0_T1.trd_cur_cd))
							)
						.cutoff$and(S0_T2.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
						.cutoff$and(
							bracket(
								cases()
									.when(bind("ope").eq(value("1")))
										.then(NEW_ACST.bcst_cd)
									.otherwise(S0_T1.bcst_cd)
							)
							.like(bind("bcst_cd")))
						.cutoff$and(
							bracket(
								cases()
									.when(bind("ope").eq(value("1")))
										.then(S0_CST.acst_cd)
									.otherwise(S0_T1.acst_cd)
							)
							.like(bind("acst_cd")))
						.cutoff$and(S0_T1.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_ADPT.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T2.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.tdlv_nm,
								S0_TDLV.bp_nm
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ACST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						S0_T1.sls_act_no.asc(),
						S0_T1.sls_act_seq.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_WSNO).on(S0_T2.sno1.eq(S0_WSNO.sno1)))
					.predicate(p -> p.cutoff$and(S0_WSNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WSNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("bcst_grp_flg1", "bcst_grp_flg2", "bcst_grp_flg3", "bcst_grp_flg4", "bcst_grp_flg5", "bcst_grp_flg6", "bcst_grp_flg7", "bcst_grp_flg8", "bcst_grp_flg9", "bcst_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_BCST).on(
								bracket(
									cases()
										.when(bind("ope").eq(value("1")))
											.then(NEW_ACST.bcst_cd)
										.otherwise(S0_T1.bcst_cd)
								).eq(S0_BCST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BCST.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_ACST).on(
								bracket(
									cases()
										.when(bind("ope").eq(value("1")))
											.then(S0_CST.acst_cd)
										.otherwise(S0_T1.acst_cd)
								).eq(S0_ACST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_ACST.bp_nm.like(bind("acst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_TCUR).on(S0_T1.trd_cur_cd.eq(S0_TCUR.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_TCUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_SUSR).on(S0_T1.sls_usr_cd.eq(S0_SUSR.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_SUSR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T1.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_LGGRP).on(S0_T1.ship_lg_grp_cd.eq(S0_LGGRP.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_LGGRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITD).on(S0_ITM.itm_typ.eq(S0_ITD.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITD.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITD.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_TAX).on(S0_T2.tax_cd.eq(S0_TAX.tax_cd)))
					.predicate(p -> p.cutoff$and(S0_TAX.tax_nm.like(bind("tax_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_GD).on(S0_T2.gd_cd.eq(S0_GD.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_GD.gd_nm.like(bind("gd_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_DEST1).on(S0_T2.dest_cd1.eq(S0_DEST1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_DEST2).on(S0_T2.dest_cd2.eq(S0_DEST2.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_DEST3).on(S0_T2.dest_cd3.eq(S0_DEST3.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_ITMG1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG1).on(S0_ITM.itm_grp_cd1.eq(S0_ITMG1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITMG1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITMG1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_ITMG2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG2).on(S0_ITM.itm_grp_cd2.eq(S0_ITMG2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITMG2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITMG2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_ITMG3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG3).on(S0_ITM.itm_grp_cd3.eq(S0_ITMG3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITMG3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITMG3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_ITMG4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG4).on(S0_ITM.itm_grp_cd4.eq(S0_ITMG4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITMG4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITMG4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_ITMG5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG5).on(S0_ITM.itm_grp_cd5.eq(S0_ITMG5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITMG5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITMG5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_ITMG6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG6).on(S0_ITM.itm_grp_cd6.eq(S0_ITMG6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITMG6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITMG6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_ITMG7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG7).on(S0_ITM.itm_grp_cd7.eq(S0_ITMG7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITMG7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITMG7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_ITMG8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG8).on(S0_ITM.itm_grp_cd8.eq(S0_ITMG8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITMG8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITMG8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_ITMG9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG9).on(S0_ITM.itm_grp_cd9.eq(S0_ITMG9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITMG9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITMG9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_ITMG10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG10).on(S0_ITM.itm_grp_cd10.eq(S0_ITMG10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITMG10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITMG10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_CSTG1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG1).on(S0_CST.bp_grp_cd1.eq(S0_CSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CSTG1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CSTG1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_CSTG2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG2).on(S0_CST.bp_grp_cd2.eq(S0_CSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CSTG2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CSTG2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_CSTG3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG3).on(S0_CST.bp_grp_cd3.eq(S0_CSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CSTG3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CSTG3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_CSTG4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG4).on(S0_CST.bp_grp_cd4.eq(S0_CSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CSTG4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CSTG4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_CSTG5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG5).on(S0_CST.bp_grp_cd5.eq(S0_CSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CSTG5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CSTG5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_CSTG6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG6).on(S0_CST.bp_grp_cd6.eq(S0_CSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CSTG6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CSTG6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_CSTG7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG7).on(S0_CST.bp_grp_cd7.eq(S0_CSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CSTG7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CSTG7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_CSTG8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG8).on(S0_CST.bp_grp_cd8.eq(S0_CSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CSTG8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CSTG8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_CSTG9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG9).on(S0_CST.bp_grp_cd9.eq(S0_CSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CSTG9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CSTG9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_CSTG10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG10).on(S0_CST.bp_grp_cd10.eq(S0_CSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CSTG10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CSTG10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"), S0_ACSTG1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG1).on(S0_ACST.bp_grp_cd1.eq(S0_ACSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACSTG1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_ACSTG1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"), S0_ACSTG2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG2).on(S0_ACST.bp_grp_cd2.eq(S0_ACSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACSTG2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_ACSTG2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"), S0_ACSTG3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG3).on(S0_ACST.bp_grp_cd3.eq(S0_ACSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACSTG3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_ACSTG3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"), S0_ACSTG4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG4).on(S0_ACST.bp_grp_cd4.eq(S0_ACSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACSTG4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_ACSTG4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"), S0_ACSTG5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG5).on(S0_ACST.bp_grp_cd5.eq(S0_ACSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACSTG5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_ACSTG5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"), S0_ACSTG6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG6).on(S0_ACST.bp_grp_cd6.eq(S0_ACSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACSTG6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_ACSTG6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"), S0_ACSTG7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG7).on(S0_ACST.bp_grp_cd7.eq(S0_ACSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACSTG7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_ACSTG7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"), S0_ACSTG8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG8).on(S0_ACST.bp_grp_cd8.eq(S0_ACSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACSTG8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_ACSTG8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"), S0_ACSTG9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG9).on(S0_ACST.bp_grp_cd9.eq(S0_ACSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACSTG9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_ACSTG9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"), S0_ACSTG10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG10).on(S0_ACST.bp_grp_cd10.eq(S0_ACSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACSTG10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_ACSTG10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVG1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG1).on(S0_DLV.bp_grp_cd1.eq(S0_DLVG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVG1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVG1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVG2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG2).on(S0_DLV.bp_grp_cd2.eq(S0_DLVG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVG2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVG2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVG3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG3).on(S0_DLV.bp_grp_cd3.eq(S0_DLVG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVG3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVG3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVG4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG4).on(S0_DLV.bp_grp_cd4.eq(S0_DLVG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVG4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVG4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVG5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG5).on(S0_DLV.bp_grp_cd5.eq(S0_DLVG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVG5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVG5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVG6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG6).on(S0_DLV.bp_grp_cd6.eq(S0_DLVG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVG6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVG6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVG7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG7).on(S0_DLV.bp_grp_cd7.eq(S0_DLVG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVG7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVG7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVG8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG8).on(S0_DLV.bp_grp_cd8.eq(S0_DLVG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVG8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVG8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVG9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG9).on(S0_DLV.bp_grp_cd9.eq(S0_DLVG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVG9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVG9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVG10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG10).on(S0_DLV.bp_grp_cd10.eq(S0_DLVG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVG10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVG10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd1.as("bcst_grp_cd1"), S0_BCSTG1.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG1).on(S0_BCST.bp_grp_cd1.eq(S0_BCSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BCSTG1.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_BCSTG1.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd2.as("bcst_grp_cd2"), S0_BCSTG2.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG2).on(S0_BCST.bp_grp_cd2.eq(S0_BCSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BCSTG2.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_BCSTG2.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd3.as("bcst_grp_cd3"), S0_BCSTG3.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG3).on(S0_BCST.bp_grp_cd3.eq(S0_BCSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BCSTG3.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_BCSTG3.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd4.as("bcst_grp_cd4"), S0_BCSTG4.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG4).on(S0_BCST.bp_grp_cd4.eq(S0_BCSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BCSTG4.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_BCSTG4.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd5.as("bcst_grp_cd5"), S0_BCSTG5.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG5).on(S0_BCST.bp_grp_cd5.eq(S0_BCSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BCSTG5.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_BCSTG5.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd6.as("bcst_grp_cd6"), S0_BCSTG6.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG6).on(S0_BCST.bp_grp_cd6.eq(S0_BCSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BCSTG6.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_BCSTG6.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd7.as("bcst_grp_cd7"), S0_BCSTG7.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG7).on(S0_BCST.bp_grp_cd7.eq(S0_BCSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BCSTG7.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_BCSTG7.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd8.as("bcst_grp_cd8"), S0_BCSTG8.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG8).on(S0_BCST.bp_grp_cd8.eq(S0_BCSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BCSTG8.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_BCSTG8.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd9.as("bcst_grp_cd9"), S0_BCSTG9.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG9).on(S0_BCST.bp_grp_cd9.eq(S0_BCSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BCSTG9.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_BCSTG9.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd10.as("bcst_grp_cd10"), S0_BCSTG10.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG10).on(S0_BCST.bp_grp_cd10.eq(S0_BCSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BCSTG10.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_BCSTG10.bp_grp_nm.like(bind("bcst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("biz_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("biz_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("io_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("io_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("io_loc_cd"),
							r.getStringNE("io_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("io_str_ln_nm", m.str_ln_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1370_MST_SLS_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1370_MST_SLS_ACT_IO_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MSVT_WRK_SNO_R S0_WSNO = MSVT_WRK_SNO_R.create("WSNO");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLS_RET_SCHD_D_R S0_RETSD = MST_SLS_RET_SCHD_D_R.create("RETSD");
		MST_SLS_RET_SCHD_R S0_RETS = MST_SLS_RET_SCHD_R.create("RETS");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_CUR_R S0_TCUR = MAM_CUR_R.create("TCUR");
		MAM_USR_R S0_SUSR = MAM_USR_R.create("SUSR");
		MAM_DPT_R S0_SDPT = MAM_DPT_R.create("SDPT");
		MAM_DPT_R S0_ADPT = MAM_DPT_R.create("ADPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_LG_GRP_R S0_LGGRP = MAM_LG_GRP_R.create("LGGRP");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_ITM_TYP_D_R S0_ITD = MAM_ITM_TYP_D_R.create("ITD");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_STK_GD_R S0_GD = MAM_STK_GD_R.create("GD");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_DPT_R S0_BDPT = MAM_DPT_R.create("BDPT");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_ITM_GRP_R S0_ITMG1 = MAM_ITM_GRP_R.create("ITMG1");
		MAM_ITM_GRP_R S0_ITMG2 = MAM_ITM_GRP_R.create("ITMG2");
		MAM_ITM_GRP_R S0_ITMG3 = MAM_ITM_GRP_R.create("ITMG3");
		MAM_ITM_GRP_R S0_ITMG4 = MAM_ITM_GRP_R.create("ITMG4");
		MAM_ITM_GRP_R S0_ITMG5 = MAM_ITM_GRP_R.create("ITMG5");
		MAM_ITM_GRP_R S0_ITMG6 = MAM_ITM_GRP_R.create("ITMG6");
		MAM_ITM_GRP_R S0_ITMG7 = MAM_ITM_GRP_R.create("ITMG7");
		MAM_ITM_GRP_R S0_ITMG8 = MAM_ITM_GRP_R.create("ITMG8");
		MAM_ITM_GRP_R S0_ITMG9 = MAM_ITM_GRP_R.create("ITMG9");
		MAM_ITM_GRP_R S0_ITMG10 = MAM_ITM_GRP_R.create("ITMG10");
		MAM_BP_GRP_R S0_CSTG1 = MAM_BP_GRP_R.create("CSTG1");
		MAM_BP_GRP_R S0_CSTG2 = MAM_BP_GRP_R.create("CSTG2");
		MAM_BP_GRP_R S0_CSTG3 = MAM_BP_GRP_R.create("CSTG3");
		MAM_BP_GRP_R S0_CSTG4 = MAM_BP_GRP_R.create("CSTG4");
		MAM_BP_GRP_R S0_CSTG5 = MAM_BP_GRP_R.create("CSTG5");
		MAM_BP_GRP_R S0_CSTG6 = MAM_BP_GRP_R.create("CSTG6");
		MAM_BP_GRP_R S0_CSTG7 = MAM_BP_GRP_R.create("CSTG7");
		MAM_BP_GRP_R S0_CSTG8 = MAM_BP_GRP_R.create("CSTG8");
		MAM_BP_GRP_R S0_CSTG9 = MAM_BP_GRP_R.create("CSTG9");
		MAM_BP_GRP_R S0_CSTG10 = MAM_BP_GRP_R.create("CSTG10");
		MAM_BP_GRP_R S0_ACSTG1 = MAM_BP_GRP_R.create("ACSTG1");
		MAM_BP_GRP_R S0_ACSTG2 = MAM_BP_GRP_R.create("ACSTG2");
		MAM_BP_GRP_R S0_ACSTG3 = MAM_BP_GRP_R.create("ACSTG3");
		MAM_BP_GRP_R S0_ACSTG4 = MAM_BP_GRP_R.create("ACSTG4");
		MAM_BP_GRP_R S0_ACSTG5 = MAM_BP_GRP_R.create("ACSTG5");
		MAM_BP_GRP_R S0_ACSTG6 = MAM_BP_GRP_R.create("ACSTG6");
		MAM_BP_GRP_R S0_ACSTG7 = MAM_BP_GRP_R.create("ACSTG7");
		MAM_BP_GRP_R S0_ACSTG8 = MAM_BP_GRP_R.create("ACSTG8");
		MAM_BP_GRP_R S0_ACSTG9 = MAM_BP_GRP_R.create("ACSTG9");
		MAM_BP_GRP_R S0_ACSTG10 = MAM_BP_GRP_R.create("ACSTG10");
		MAM_BP_GRP_R S0_DLVG1 = MAM_BP_GRP_R.create("DLVG1");
		MAM_BP_GRP_R S0_DLVG2 = MAM_BP_GRP_R.create("DLVG2");
		MAM_BP_GRP_R S0_DLVG3 = MAM_BP_GRP_R.create("DLVG3");
		MAM_BP_GRP_R S0_DLVG4 = MAM_BP_GRP_R.create("DLVG4");
		MAM_BP_GRP_R S0_DLVG5 = MAM_BP_GRP_R.create("DLVG5");
		MAM_BP_GRP_R S0_DLVG6 = MAM_BP_GRP_R.create("DLVG6");
		MAM_BP_GRP_R S0_DLVG7 = MAM_BP_GRP_R.create("DLVG7");
		MAM_BP_GRP_R S0_DLVG8 = MAM_BP_GRP_R.create("DLVG8");
		MAM_BP_GRP_R S0_DLVG9 = MAM_BP_GRP_R.create("DLVG9");
		MAM_BP_GRP_R S0_DLVG10 = MAM_BP_GRP_R.create("DLVG10");
		MAM_BP_GRP_R S0_BCSTG1 = MAM_BP_GRP_R.create("BCSTG1");
		MAM_BP_GRP_R S0_BCSTG2 = MAM_BP_GRP_R.create("BCSTG2");
		MAM_BP_GRP_R S0_BCSTG3 = MAM_BP_GRP_R.create("BCSTG3");
		MAM_BP_GRP_R S0_BCSTG4 = MAM_BP_GRP_R.create("BCSTG4");
		MAM_BP_GRP_R S0_BCSTG5 = MAM_BP_GRP_R.create("BCSTG5");
		MAM_BP_GRP_R S0_BCSTG6 = MAM_BP_GRP_R.create("BCSTG6");
		MAM_BP_GRP_R S0_BCSTG7 = MAM_BP_GRP_R.create("BCSTG7");
		MAM_BP_GRP_R S0_BCSTG8 = MAM_BP_GRP_R.create("BCSTG8");
		MAM_BP_GRP_R S0_BCSTG9 = MAM_BP_GRP_R.create("BCSTG9");
		MAM_BP_GRP_R S0_BCSTG10 = MAM_BP_GRP_R.create("BCSTG10");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1370_MST_SLS_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_TRD.trd_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T2.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_ITM.comp_spec_typ,
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T1.trd_cur_cd,
						S0_ITM.dscnt_itm_flg,
						S0_SLOD.sls_upri_req_typ,
						S0_SLO.slo_dt,
						trunc(
							S0_SLOD.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_SLOD.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_SLOD.sls_schd_dt.as("sls_schd_dt"),
						S0_T2.interim_flg,
						S0_T3.trd_cur_upri,
						S0_T3.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T3.trd_cur_amt,
						bracket(
							S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						nvl(
							S0_SLOD.trd_unit_qty,
							S0_T3.trd_unit_qty
						).as("trd_unit_qty_for_upri"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.SLS_XTRA.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.SLS_RTN.value()),
							nvl(
								S0_RETSD.tax_fix_flg,
								value(false)
							),
							nvl2(
								S0_IVD.iv_d_no,
								S0_IVD.tax_fix_flg,
								S0_SLOD.tax_fix_flg
							)
						).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_T3.trd_cur_tax_amt,
						S0_T3.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T1.base_cur_cd,
						S0_T1.xrate,
						decode(
							S0_IV.iv_no,
							nullValue(),
							decode(
								S0_SLO.slo_no,
								nullValue(),
								decode(
									S0_RETS.sls_ret_schd_no,
									nullValue(),
									value(false),
									S0_RETS.xrate_inpt_flg
								),
								S0_SLO.xrate_inpt_flg
							),
							S0_IV.xrate_inpt_flg
						).as("xrate_inpt_flg"),
						S0_T3.base_cur_upri,
						S0_T3.base_cur_upri.as("old_base_cur_upri"),
						S0_T3.base_cur_amt,
						bracket(
							S0_T3.base_cur_amt.add(S0_T3.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T3.base_cur_tax_amt,
						S0_T3.base_cur_dscnt_amt,
						S0_T2.cost_amt.as("base_cur_sls_cost_amt"),
						S0_T1.ptax_cur_cd,
						S0_T1.ptax_xrate,
						decode(
							S0_IV.iv_no,
							nullValue(),
							decode(
								S0_SLO.slo_no,
								nullValue(),
								decode(
									S0_RETS.sls_ret_schd_no,
									nullValue(),
									value(false),
									S0_RETS.ptax_xrate_inpt_flg
								),
								S0_SLO.ptax_xrate_inpt_flg
							),
							S0_IV.ptax_xrate_inpt_flg
						).as("ptax_xrate_inpt_flg"),
						S0_T3.ptax_cur_upri,
						S0_T3.ptax_cur_upri.as("old_ptax_cur_upri"),
						S0_T3.ptax_cur_amt,
						bracket(
							S0_T3.ptax_cur_amt.add(S0_T3.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T3.ptax_cur_tax_amt,
						S0_T3.ptax_cur_dscnt_amt,
						S0_T1.sls_dt,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.bill_basis_dt,
						S0_T1.rcv_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T2.cst_po_d_no,
						S0_T2.ext_sys_cd,
						S0_EXT.ext_sys_nm,
						S0_T2.ext_purc_act_d_no,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("intr_d_rmrks"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.gd_cd,
						S0_T1.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_SDPT.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.bcst_cd,
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.pri_prnt_flg,
						S0_T2.dlv_sundry_flg,
						S0_DLV.cntry_cd,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.tdlv_cd,
						nvl(
							S0_T2.tdlv_nm,
							S0_TDLV.bp_nm
						).as("tdlv_nm"),
						S0_T1.ship_lg_grp_cd,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_ADPT.dpt_nm.as("ar_dpt_nm"),
						S0_T1.dlv_slip_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.sls_act_no,
						S0_T1.sls_act_rev,
						S0_T2.sls_act_d_no,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T1.sls_ret_schd_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T2.qtn_d_no,
						S0_T2.purc_ddlv_po_no,
						S0_T2.purc_ddlv_po_d_no,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.cst_po_no,
						S0_T2.bill_crryovr_times,
						S0_T2.rsn_cd.as("biz_rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_BDPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_T3.sub_char1.as("io_sub_char1"),
						S0_T3.sub_char2.as("io_sub_char2"),
						S0_T3.sub_char3.as("io_sub_char3"),
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_func_id,
						S0_T3.ins_ts,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_func_id,
						S0_T3.upd_ts,
						S0_T3.upd_srv_req_no,
						S0_T2.disp_seq,
						S0_T3.sls_act_io_no,
						S0_T3.ship_act_d_no,
						S0_T3.arr_act_no,
						S0_T3.purc_act_io_no,
						S0_T3.loc_cd.as("io_loc_cd"),
						S0_T3.str_ln_cd.as("io_str_ln_cd"),
						S0_TRD.trd_ptn_typ,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_seq,
						S0_T1.upd_cntr.as("hdr_upd_cntr"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CST.cst_iv_flg,
						S0_SLOD.sppl_cd,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ACST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_BCST_GRP),
						S0_T3.gd_cd.as("join_gd_cd_"),
						S0_T2.base_sls_ac_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
							.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
						)
						.innerJoin(S0_T3).on(
							S0_T2.sls_act_d_no.eq(S0_T3.sls_act_d_no)
							.and(S0_T2.sls_act_d_seq.eq(S0_T3.sls_act_d_seq))
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_SLO).on(S0_T2.slo_no.eq(S0_SLO.slo_no))
						.leftOuterJoin(S0_SLOD).on(
							S0_T2.slo_no.eq(S0_SLOD.slo_no)
							.and(S0_T2.slo_d_no.eq(S0_SLOD.slo_d_no))
						)
						.leftOuterJoin(S0_RETSD).on(
							S0_T2.sls_ret_schd_no.eq(S0_RETSD.sls_ret_schd_no)
							.and(S0_T2.sls_ret_schd_d_no.eq(S0_RETSD.sls_ret_schd_d_no))
						)
						.leftOuterJoin(S0_RETS).on(S0_RETSD.sls_ret_schd_no.eq(S0_RETS.sls_ret_schd_no))
						.leftOuterJoin(S0_TRD).on(S0_T1.trd_cd.eq(S0_TRD.trd_cd))
						.leftOuterJoin(S0_DLV).on(S0_T2.dlv_cd.eq(S0_DLV.bp_cd))
						.leftOuterJoin(S0_CST).on(S0_T1.cst_cd.eq(S0_CST.bp_cd))
						.leftOuterJoin(S0_SDPT).on(
							S0_T1.sls_dpt_cd.eq(S0_SDPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_SDPT.st_dt, S0_SDPT.end_dt))
						)
						.leftOuterJoin(S0_ADPT).on(
							S0_T1.ar_dpt_cd.eq(S0_ADPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_ADPT.st_dt, S0_ADPT.end_dt))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T2.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_ITMLCL).on(
							S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
							.and(
								nvl(
									S0_DLV.prnt_lcl_cd,
									S0_CST.prnt_lcl_cd
								).eq(S0_ITMLCL.lcl_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(S0_T2.tdlv_cd.eq(S0_TDLV.bp_cd))
						.leftOuterJoin(S0_BDPT).on(
							S0_T2.bd_dpt_cd.eq(S0_BDPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_BDPT.st_dt, S0_BDPT.end_dt))
						)
						.leftOuterJoin(S0_EXT).on(S0_T2.ext_sys_cd.eq(S0_EXT.ext_sys_cd))
						.leftOuterJoin(S0_IV).on(
							decode(
								S0_T1.iv_no,
								value(MAC_STR.NULL_VAL.value()),
								nullValue(),
								S0_T1.iv_no
							).eq(S0_IV.iv_no)
						)
						.leftOuterJoin(S0_IVD).on(
							S0_T2.iv_d_no.eq(S0_IVD.iv_d_no)
						)
						.innerJoin(S0_DAC).on(S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ACST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_adjst_typ.isNull())
						.and(
							bracket(
								bind("sls").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS.value()),
										value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
									)
								)
							)
							.or(
								bind("sls_ret").eq(value(true))
								.and(S0_TRD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
							.or(
								bind("sls_dscnt").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
										value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
									)
								)
							)
						)
						.cutoff$and(S0_CST.cst_iv_flg.eq(bind("cst_iv_flg_str")))
						.cutoff$and(S0_T2.interim_flg.eq(bind("interim_flg_str")))
						.and(
							S0_TRD.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
							)
							.or(
								bracket(
									bind("opn_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.OPN.value())))
								)
								.or(
									bind("fix_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.FIX.value())))
								)
								.or(
									bind("acpt_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
								)
								.or(
									bind("rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.RJCT.value())))
								)
								.or(
									bind("last_rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.LAST_RJCT.value())))
								)
								.or(
									bind("not_aprv_flg").eq(value(true))
									.and(S0_T1.aprv_flg.eq(value(false)))
								)
							)
						)
						.cutoff$and(S0_T1.sls_dt.gte(bind("sls_dt_fr")))
						.cutoff$and(S0_T1.sls_dt.lte(bind("sls_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.dlv_tm.gte(bind("dlv_hm_fr")))
						.cutoff$and(S0_T1.dlv_tm.lte(bind("dlv_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_SDPT.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.dlv_nm,
								S0_DLV.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.sls_act_no.like(bind("sls_act_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T2.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(
								bind("foreign_flg_str").eq(value(true))
								.and(S0_CO.base_cur_cd.neq(S0_T1.trd_cur_cd))
							)
						.cutoff$and(S0_T2.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T3.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_T1.acst_cd.like(bind("acst_cd")))
						.cutoff$and(S0_T1.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_ADPT.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T2.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.tdlv_nm,
								S0_TDLV.bp_nm
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T2.ext_purc_act_d_no.like(bind("ext_purc_act_d_no")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.cutoff$and(S0_T3.sub_char1.like(bind("io_sub_char1")))
						.cutoff$and(S0_T3.sub_char2.like(bind("io_sub_char2")))
						.cutoff$and(S0_T3.sub_char3.like(bind("io_sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ACST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						S0_T1.sls_act_no.asc(),
						S0_T1.sls_act_seq.asc(),
						S0_T2.disp_seq.asc(),
						S0_T3.sls_act_io_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_WSNO).on(S0_T3.sno1.eq(S0_WSNO.sno1)))
					.predicate(p -> p.cutoff$and(S0_WSNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WSNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("bcst_grp_flg1", "bcst_grp_flg2", "bcst_grp_flg3", "bcst_grp_flg4", "bcst_grp_flg5", "bcst_grp_flg6", "bcst_grp_flg7", "bcst_grp_flg8", "bcst_grp_flg9", "bcst_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_BCST).on(S0_T1.bcst_cd.eq(S0_BCST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BCST.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_ACST).on(S0_T1.acst_cd.eq(S0_ACST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_ACST.bp_nm.like(bind("acst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_TCUR).on(S0_T1.trd_cur_cd.eq(S0_TCUR.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_TCUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_SUSR).on(S0_T1.sls_usr_cd.eq(S0_SUSR.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_SUSR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T1.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_LGGRP).on(S0_T1.ship_lg_grp_cd.eq(S0_LGGRP.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_LGGRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITD).on(S0_ITM.itm_typ.eq(S0_ITD.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITD.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITD.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_TAX).on(S0_T2.tax_cd.eq(S0_TAX.tax_cd)))
					.predicate(p -> p.cutoff$and(S0_TAX.tax_nm.like(bind("tax_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_GD).on(S0_T3.gd_cd.eq(S0_GD.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_GD.gd_nm.like(bind("gd_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_DEST1).on(S0_T2.dest_cd1.eq(S0_DEST1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_DEST2).on(S0_T2.dest_cd2.eq(S0_DEST2.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_DEST3).on(S0_T2.dest_cd3.eq(S0_DEST3.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_ITMG1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG1).on(S0_ITM.itm_grp_cd1.eq(S0_ITMG1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITMG1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITMG1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_ITMG2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG2).on(S0_ITM.itm_grp_cd2.eq(S0_ITMG2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITMG2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITMG2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_ITMG3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG3).on(S0_ITM.itm_grp_cd3.eq(S0_ITMG3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITMG3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITMG3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_ITMG4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG4).on(S0_ITM.itm_grp_cd4.eq(S0_ITMG4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITMG4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITMG4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_ITMG5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG5).on(S0_ITM.itm_grp_cd5.eq(S0_ITMG5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITMG5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITMG5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_ITMG6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG6).on(S0_ITM.itm_grp_cd6.eq(S0_ITMG6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITMG6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITMG6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_ITMG7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG7).on(S0_ITM.itm_grp_cd7.eq(S0_ITMG7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITMG7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITMG7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_ITMG8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG8).on(S0_ITM.itm_grp_cd8.eq(S0_ITMG8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITMG8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITMG8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_ITMG9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG9).on(S0_ITM.itm_grp_cd9.eq(S0_ITMG9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITMG9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITMG9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_ITMG10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG10).on(S0_ITM.itm_grp_cd10.eq(S0_ITMG10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITMG10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITMG10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_CSTG1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG1).on(S0_CST.bp_grp_cd1.eq(S0_CSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CSTG1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CSTG1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_CSTG2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG2).on(S0_CST.bp_grp_cd2.eq(S0_CSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CSTG2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CSTG2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_CSTG3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG3).on(S0_CST.bp_grp_cd3.eq(S0_CSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CSTG3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CSTG3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_CSTG4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG4).on(S0_CST.bp_grp_cd4.eq(S0_CSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CSTG4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CSTG4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_CSTG5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG5).on(S0_CST.bp_grp_cd5.eq(S0_CSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CSTG5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CSTG5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_CSTG6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG6).on(S0_CST.bp_grp_cd6.eq(S0_CSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CSTG6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CSTG6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_CSTG7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG7).on(S0_CST.bp_grp_cd7.eq(S0_CSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CSTG7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CSTG7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_CSTG8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG8).on(S0_CST.bp_grp_cd8.eq(S0_CSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CSTG8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CSTG8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_CSTG9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG9).on(S0_CST.bp_grp_cd9.eq(S0_CSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CSTG9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CSTG9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_CSTG10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG10).on(S0_CST.bp_grp_cd10.eq(S0_CSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CSTG10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CSTG10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"), S0_ACSTG1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG1).on(S0_ACST.bp_grp_cd1.eq(S0_ACSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACSTG1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_ACSTG1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"), S0_ACSTG2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG2).on(S0_ACST.bp_grp_cd2.eq(S0_ACSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACSTG2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_ACSTG2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"), S0_ACSTG3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG3).on(S0_ACST.bp_grp_cd3.eq(S0_ACSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACSTG3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_ACSTG3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"), S0_ACSTG4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG4).on(S0_ACST.bp_grp_cd4.eq(S0_ACSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACSTG4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_ACSTG4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"), S0_ACSTG5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG5).on(S0_ACST.bp_grp_cd5.eq(S0_ACSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACSTG5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_ACSTG5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"), S0_ACSTG6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG6).on(S0_ACST.bp_grp_cd6.eq(S0_ACSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACSTG6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_ACSTG6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"), S0_ACSTG7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG7).on(S0_ACST.bp_grp_cd7.eq(S0_ACSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACSTG7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_ACSTG7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"), S0_ACSTG8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG8).on(S0_ACST.bp_grp_cd8.eq(S0_ACSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACSTG8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_ACSTG8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"), S0_ACSTG9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG9).on(S0_ACST.bp_grp_cd9.eq(S0_ACSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACSTG9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_ACSTG9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"), S0_ACSTG10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG10).on(S0_ACST.bp_grp_cd10.eq(S0_ACSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACSTG10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_ACSTG10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVG1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG1).on(S0_DLV.bp_grp_cd1.eq(S0_DLVG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVG1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVG1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVG2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG2).on(S0_DLV.bp_grp_cd2.eq(S0_DLVG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVG2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVG2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVG3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG3).on(S0_DLV.bp_grp_cd3.eq(S0_DLVG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVG3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVG3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVG4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG4).on(S0_DLV.bp_grp_cd4.eq(S0_DLVG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVG4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVG4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVG5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG5).on(S0_DLV.bp_grp_cd5.eq(S0_DLVG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVG5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVG5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVG6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG6).on(S0_DLV.bp_grp_cd6.eq(S0_DLVG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVG6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVG6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVG7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG7).on(S0_DLV.bp_grp_cd7.eq(S0_DLVG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVG7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVG7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVG8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG8).on(S0_DLV.bp_grp_cd8.eq(S0_DLVG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVG8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVG8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVG9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG9).on(S0_DLV.bp_grp_cd9.eq(S0_DLVG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVG9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVG9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVG10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG10).on(S0_DLV.bp_grp_cd10.eq(S0_DLVG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVG10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVG10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd1.as("bcst_grp_cd1"), S0_BCSTG1.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG1).on(S0_BCST.bp_grp_cd1.eq(S0_BCSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BCSTG1.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_BCSTG1.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd2.as("bcst_grp_cd2"), S0_BCSTG2.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG2).on(S0_BCST.bp_grp_cd2.eq(S0_BCSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BCSTG2.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_BCSTG2.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd3.as("bcst_grp_cd3"), S0_BCSTG3.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG3).on(S0_BCST.bp_grp_cd3.eq(S0_BCSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BCSTG3.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_BCSTG3.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd4.as("bcst_grp_cd4"), S0_BCSTG4.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG4).on(S0_BCST.bp_grp_cd4.eq(S0_BCSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BCSTG4.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_BCSTG4.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd5.as("bcst_grp_cd5"), S0_BCSTG5.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG5).on(S0_BCST.bp_grp_cd5.eq(S0_BCSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BCSTG5.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_BCSTG5.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd6.as("bcst_grp_cd6"), S0_BCSTG6.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG6).on(S0_BCST.bp_grp_cd6.eq(S0_BCSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BCSTG6.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_BCSTG6.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd7.as("bcst_grp_cd7"), S0_BCSTG7.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG7).on(S0_BCST.bp_grp_cd7.eq(S0_BCSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BCSTG7.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_BCSTG7.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd8.as("bcst_grp_cd8"), S0_BCSTG8.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG8).on(S0_BCST.bp_grp_cd8.eq(S0_BCSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BCSTG8.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_BCSTG8.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd9.as("bcst_grp_cd9"), S0_BCSTG9.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG9).on(S0_BCST.bp_grp_cd9.eq(S0_BCSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BCSTG9.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_BCSTG9.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd10.as("bcst_grp_cd10"), S0_BCSTG10.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG10).on(S0_BCST.bp_grp_cd10.eq(S0_BCSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BCSTG10.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_BCSTG10.bp_grp_nm.like(bind("bcst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("biz_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("biz_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("join_gd_cd_")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("io_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("io_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("io_loc_cd"),
							r.getStringNE("io_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("io_str_ln_nm", m.str_ln_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1370_MST_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1370_MST_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_CUR_R S0_TCUR = MAM_CUR_R.create("TCUR");
		MAM_USR_R S0_SUSR = MAM_USR_R.create("SUSR");
		MAM_DPT_R S0_SDPT = MAM_DPT_R.create("SDPT");
		MAM_DPT_R S0_ADPT = MAM_DPT_R.create("ADPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_LG_GRP_R S0_LGGRP = MAM_LG_GRP_R.create("LGGRP");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_CSTG1 = MAM_BP_GRP_R.create("CSTG1");
		MAM_BP_GRP_R S0_CSTG2 = MAM_BP_GRP_R.create("CSTG2");
		MAM_BP_GRP_R S0_CSTG3 = MAM_BP_GRP_R.create("CSTG3");
		MAM_BP_GRP_R S0_CSTG4 = MAM_BP_GRP_R.create("CSTG4");
		MAM_BP_GRP_R S0_CSTG5 = MAM_BP_GRP_R.create("CSTG5");
		MAM_BP_GRP_R S0_CSTG6 = MAM_BP_GRP_R.create("CSTG6");
		MAM_BP_GRP_R S0_CSTG7 = MAM_BP_GRP_R.create("CSTG7");
		MAM_BP_GRP_R S0_CSTG8 = MAM_BP_GRP_R.create("CSTG8");
		MAM_BP_GRP_R S0_CSTG9 = MAM_BP_GRP_R.create("CSTG9");
		MAM_BP_GRP_R S0_CSTG10 = MAM_BP_GRP_R.create("CSTG10");
		MAM_BP_GRP_R S0_ACSTG1 = MAM_BP_GRP_R.create("ACSTG1");
		MAM_BP_GRP_R S0_ACSTG2 = MAM_BP_GRP_R.create("ACSTG2");
		MAM_BP_GRP_R S0_ACSTG3 = MAM_BP_GRP_R.create("ACSTG3");
		MAM_BP_GRP_R S0_ACSTG4 = MAM_BP_GRP_R.create("ACSTG4");
		MAM_BP_GRP_R S0_ACSTG5 = MAM_BP_GRP_R.create("ACSTG5");
		MAM_BP_GRP_R S0_ACSTG6 = MAM_BP_GRP_R.create("ACSTG6");
		MAM_BP_GRP_R S0_ACSTG7 = MAM_BP_GRP_R.create("ACSTG7");
		MAM_BP_GRP_R S0_ACSTG8 = MAM_BP_GRP_R.create("ACSTG8");
		MAM_BP_GRP_R S0_ACSTG9 = MAM_BP_GRP_R.create("ACSTG9");
		MAM_BP_GRP_R S0_ACSTG10 = MAM_BP_GRP_R.create("ACSTG10");
		MAM_BP_GRP_R S0_BCSTG1 = MAM_BP_GRP_R.create("BCSTG1");
		MAM_BP_GRP_R S0_BCSTG2 = MAM_BP_GRP_R.create("BCSTG2");
		MAM_BP_GRP_R S0_BCSTG3 = MAM_BP_GRP_R.create("BCSTG3");
		MAM_BP_GRP_R S0_BCSTG4 = MAM_BP_GRP_R.create("BCSTG4");
		MAM_BP_GRP_R S0_BCSTG5 = MAM_BP_GRP_R.create("BCSTG5");
		MAM_BP_GRP_R S0_BCSTG6 = MAM_BP_GRP_R.create("BCSTG6");
		MAM_BP_GRP_R S0_BCSTG7 = MAM_BP_GRP_R.create("BCSTG7");
		MAM_BP_GRP_R S0_BCSTG8 = MAM_BP_GRP_R.create("BCSTG8");
		MAM_BP_GRP_R S0_BCSTG9 = MAM_BP_GRP_R.create("BCSTG9");
		MAM_BP_GRP_R S0_BCSTG10 = MAM_BP_GRP_R.create("BCSTG10");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MST_SLS_ACT_D_R S0_SLS_ACT_D = MST_SLS_ACT_D_R.create("S0_T3");
		MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create("SLSACT");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_SLS_ACT_D_TempView = createTempView("S0_T3_View");
		MCSingleView S0_RET_ACT_D_View = subQuery().select(
				S0_SLS_ACT_D.sls_act_no,
				S0_SLS_ACT_D.sls_act_seq,
				sum(
					cases()
						.when(
							itmR.dscnt_itm_flg.eq(value(true))
							.and(slsActR.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.SLS_DSCNT.value())))
						)
						.then(
							S0_SLS_ACT_D.trd_cur_amt.multiply(value(-1)).add(
								bracket(
									S0_SLS_ACT_D.trd_cur_tax_amt.multiply(value(-1))
								)
							)
						)
					.otherwise(S0_SLS_ACT_D.trd_cur_amt.add(S0_SLS_ACT_D.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
			)
			.from(
					S0_SLS_ACT_D
					.innerJoin(slsActR).on(
						bracket(
							S0_SLS_ACT_D.sls_act_no.eq(slsActR.sls_act_no)
							.and(S0_SLS_ACT_D.sls_act_seq.eq(slsActR.sls_act_seq))
						)
					)
					.leftOuterJoin(itmR).on(
						bracket(
							S0_SLS_ACT_D.itm_cd.eq(itmR.itm_cd)
							.and(S0_SLS_ACT_D.itm_sub1.eq(itmR.itm_sub1))
							.and(S0_SLS_ACT_D.itm_sub2.eq(itmR.itm_sub2))
							.and(S0_SLS_ACT_D.itm_sub3.eq(itmR.itm_sub3))
						)
					)
			)
			.groupBy(
					S0_SLS_ACT_D.sls_act_no,
					S0_SLS_ACT_D.sls_act_seq
			)
			.view(S0_SLS_ACT_D_TempView);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1370_MST_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_TRD.trd_nm,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.sls_dt,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.bill_basis_dt,
						S0_T1.rcv_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.ship_lg_grp_cd,
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_T1.cst_cd,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_SDPT.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.bcst_cd,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_ADPT.dpt_nm.as("ar_dpt_nm"),
						S0_T1.dlv_slip_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.sls_act_no,
						S0_T1.sls_act_rev,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.slo_no,
						S0_T1.sls_ret_schd_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.cst_po_no,
						S0_T1.ddlv_sls_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_TRD.trd_ptn_typ,
						S0_T1.sls_act_seq,
						S0_T1.upd_cntr.as("hdr_upd_cntr"),
						S0_SLS_ACT_D_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ACST_GRP),
						addDynamicSelect(DS0C_BCST_GRP)
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_SLO).on(S0_T1.slo_no.eq(S0_SLO.slo_no))
						.leftOuterJoin(S0_TRD).on(S0_T1.trd_cd.eq(S0_TRD.trd_cd))
						.leftOuterJoin(S0_SDPT).on(
							S0_T1.sls_dpt_cd.eq(S0_SDPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_SDPT.st_dt, S0_SDPT.end_dt))
						)
						.leftOuterJoin(S0_ADPT).on(
							S0_T1.ar_dpt_cd.eq(S0_ADPT.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_ADPT.st_dt, S0_ADPT.end_dt))
						)
						.innerJoin(S0_DAC).on(S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd))
						.leftOuterJoin(S0_RET_ACT_D_View)
						.on(
							(S0_SLS_ACT_D_TempView.pr(MST_SLS_ACT_D_R.$sls_act_no).eq(S0_T1.sls_act_no))
							.and((S0_SLS_ACT_D_TempView.pr(MST_SLS_ACT_D_R.$sls_act_seq).eq(S0_T1.sls_act_seq)))
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ACST_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_adjst_typ.isNull())
						.and(
							bracket(
								bind("sls").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS.value()),
										value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
									)
								)
							)
							.or(
								bind("sls_ret").eq(value(true))
								.and(S0_TRD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
							.or(
								bind("sls_dscnt").eq(value(true))
								.and(
									S0_TRD.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
										value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
									)
								)
							)
						)
						.addDynamicPredicate()
						.and(
							S0_TRD.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
							)
							.or(
								bracket(
									bind("opn_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.OPN.value())))
								)
								.or(
									bind("fix_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.FIX.value())))
								)
								.or(
									bind("acpt_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
								)
								.or(
									bind("rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.RJCT.value())))
								)
								.or(
									bind("last_rjct_flg").eq(value(true))
									.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.LAST_RJCT.value())))
								)
								.or(
									bind("not_aprv_flg").eq(value(true))
									.and(S0_T1.aprv_flg.eq(value(false)))
								)
							)
						)
						.cutoff$and(S0_T1.sls_dt.gte(bind("sls_dt_fr")))
						.cutoff$and(S0_T1.sls_dt.lte(bind("sls_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.dlv_tm.gte(bind("dlv_hm_fr")))
						.cutoff$and(S0_T1.dlv_tm.lte(bind("dlv_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_SDPT.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_T1.sls_act_no.like(bind("sls_act_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(
								bind("foreign_flg_str").eq(value(true))
								.and(S0_CO.base_cur_cd.neq(S0_T1.trd_cur_cd))
							)
						.cutoff$and(S0_T1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_T1.acst_cd.like(bind("acst_cd")))
						.cutoff$and(S0_T1.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_ADPT.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
							.or(bind("inc_past_flg").eq(value(true))
								.and(S0_T1.slip_sts_typ.in(value(MAC_SLIP_STS_TYP.CRT.value()),value(MAC_SLIP_STS_TYP.DIS.value())))
							)
						)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ACST_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						S0_T1.sls_act_no.asc(),
						S0_T1.sls_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_iv_flg_str", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_CST).on(S0_T1.cst_cd.eq(S0_CST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_CST.cst_iv_flg.eq(bind("cst_iv_flg_str"))).cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("bcst_grp_flg1", "bcst_grp_flg2", "bcst_grp_flg3", "bcst_grp_flg4", "bcst_grp_flg5", "bcst_grp_flg6", "bcst_grp_flg7", "bcst_grp_flg8", "bcst_grp_flg9", "bcst_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_BCST).on(S0_T1.bcst_cd.eq(S0_BCST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BCST.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_ACST).on(S0_T1.acst_cd.eq(S0_ACST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_ACST.bp_nm.like(bind("acst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_TCUR).on(S0_T1.trd_cur_cd.eq(S0_TCUR.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_TCUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_SUSR).on(S0_T1.sls_usr_cd.eq(S0_SUSR.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_SUSR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T1.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_LGGRP).on(S0_T1.ship_lg_grp_cd.eq(S0_LGGRP.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_LGGRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_CSTG1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG1).on(S0_CST.bp_grp_cd1.eq(S0_CSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CSTG1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CSTG1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_CSTG2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG2).on(S0_CST.bp_grp_cd2.eq(S0_CSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CSTG2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CSTG2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_CSTG3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG3).on(S0_CST.bp_grp_cd3.eq(S0_CSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CSTG3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CSTG3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_CSTG4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG4).on(S0_CST.bp_grp_cd4.eq(S0_CSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CSTG4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CSTG4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_CSTG5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG5).on(S0_CST.bp_grp_cd5.eq(S0_CSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CSTG5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CSTG5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_CSTG6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG6).on(S0_CST.bp_grp_cd6.eq(S0_CSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CSTG6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CSTG6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_CSTG7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG7).on(S0_CST.bp_grp_cd7.eq(S0_CSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CSTG7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CSTG7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_CSTG8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG8).on(S0_CST.bp_grp_cd8.eq(S0_CSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CSTG8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CSTG8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_CSTG9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG9).on(S0_CST.bp_grp_cd9.eq(S0_CSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CSTG9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CSTG9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_CSTG10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG10).on(S0_CST.bp_grp_cd10.eq(S0_CSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CSTG10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CSTG10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"), S0_ACSTG1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG1).on(S0_ACST.bp_grp_cd1.eq(S0_ACSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACSTG1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_ACSTG1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"), S0_ACSTG2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG2).on(S0_ACST.bp_grp_cd2.eq(S0_ACSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACSTG2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_ACSTG2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"), S0_ACSTG3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG3).on(S0_ACST.bp_grp_cd3.eq(S0_ACSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACSTG3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_ACSTG3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"), S0_ACSTG4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG4).on(S0_ACST.bp_grp_cd4.eq(S0_ACSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACSTG4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_ACSTG4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"), S0_ACSTG5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG5).on(S0_ACST.bp_grp_cd5.eq(S0_ACSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACSTG5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_ACSTG5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"), S0_ACSTG6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG6).on(S0_ACST.bp_grp_cd6.eq(S0_ACSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACSTG6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_ACSTG6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"), S0_ACSTG7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG7).on(S0_ACST.bp_grp_cd7.eq(S0_ACSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACSTG7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_ACSTG7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"), S0_ACSTG8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG8).on(S0_ACST.bp_grp_cd8.eq(S0_ACSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACSTG8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_ACSTG8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"), S0_ACSTG9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG9).on(S0_ACST.bp_grp_cd9.eq(S0_ACSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACSTG9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_ACSTG9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"), S0_ACSTG10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACSTG10).on(S0_ACST.bp_grp_cd10.eq(S0_ACSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACSTG10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_ACSTG10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd1.as("bcst_grp_cd1"), S0_BCSTG1.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG1).on(S0_BCST.bp_grp_cd1.eq(S0_BCSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BCSTG1.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_BCSTG1.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd2.as("bcst_grp_cd2"), S0_BCSTG2.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG2).on(S0_BCST.bp_grp_cd2.eq(S0_BCSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BCSTG2.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_BCSTG2.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd3.as("bcst_grp_cd3"), S0_BCSTG3.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG3).on(S0_BCST.bp_grp_cd3.eq(S0_BCSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BCSTG3.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_BCSTG3.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd4.as("bcst_grp_cd4"), S0_BCSTG4.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG4).on(S0_BCST.bp_grp_cd4.eq(S0_BCSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BCSTG4.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_BCSTG4.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd5.as("bcst_grp_cd5"), S0_BCSTG5.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG5).on(S0_BCST.bp_grp_cd5.eq(S0_BCSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BCSTG5.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_BCSTG5.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd6.as("bcst_grp_cd6"), S0_BCSTG6.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG6).on(S0_BCST.bp_grp_cd6.eq(S0_BCSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BCSTG6.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_BCSTG6.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd7.as("bcst_grp_cd7"), S0_BCSTG7.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG7).on(S0_BCST.bp_grp_cd7.eq(S0_BCSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BCSTG7.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_BCSTG7.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd8.as("bcst_grp_cd8"), S0_BCSTG8.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG8).on(S0_BCST.bp_grp_cd8.eq(S0_BCSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BCSTG8.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_BCSTG8.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd9.as("bcst_grp_cd9"), S0_BCSTG9.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG9).on(S0_BCST.bp_grp_cd9.eq(S0_BCSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BCSTG9.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_BCSTG9.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_BCST.bp_grp_cd10.as("bcst_grp_cd10"), S0_BCSTG10.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCSTG10).on(S0_BCST.bp_grp_cd10.eq(S0_BCSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BCSTG10.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_BCST.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_BCSTG10.bp_grp_nm.like(bind("bcst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
}