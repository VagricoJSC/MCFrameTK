package mcframe.serverMSLA.MSLAL5040;

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
	 * -- MSLAL5040_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSLAL5040_MST_PO_D_S01() {
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MAM_EDI_IF_CTL_R EDICTL = MAM_EDI_IF_CTL_R.create("EDICTL");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_BP_LCL_R BPL = MAM_BP_LCL_R.create("BPL");
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_CO_R CO = MAM_CO_R.create("CO");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5040_MST_PO_D_Query_S01")
				.mainQuery()
				.select(
					EDICTL.ext_sys_cd,
					PO.po_no,
					PO.po_rev,
					PO.sppl_cd,
					nvl2(
						BP.prnt_lcl_cd,
						BPL.bp_nm,
						BP.bp_nm
					).as("sppl_nm"),
					BP.cntry_cd.as("sppl_cntry_cd"),
					POD.itm_cd,
					POD.itm_sub1,
					POD.itm_sub2,
					POD.itm_sub3,
					POD.trd_unit_cd,
					POD.sundry_itm_flg,
					cases()
						.when(POD.sundry_itm_flg.eq(value(true)))
							.then(POD.itm_nm)
						.otherwise(
							nvl2(
								BP.prnt_lcl_cd,
								ITMLCL.itm_nm,
								ITM.itm_nm
							)
					).as("itm_nm"),
					cases()
						.when(POD.sundry_itm_flg.eq(value(true)))
							.then(
								nvl(
									POD.iv_itm_nm,
									POD.itm_nm
								)
						)
						.otherwise(
							nvl2(
								BP.prnt_lcl_cd,
								ITMLCL.itm_nm,
								ITM.itm_nm
							)
					).as("iv_itm_nm"),
					POD.sppl_itm_cd,
					POD.sppl_itm_nm,
					FCPA_CO$F_GET_CO_NM2(
							CO.co_cd,
							BP.prnt_lcl_cd
					).as("co_nm"),
					CO.cntry_cd,
					EXTSYS.null_val_if_flg,
					POD.po_d_no
				)
				.from(
					POD
					.innerJoin(PO).on(
						POD.po_no.eq(PO.po_no)
					)
					.innerJoin(EDICTL).on(
						EDICTL.bp_cd.eq(PO.sppl_cd)
						.and(FCPA_DATE_UTIL$F_GET_TODAY1().between(EDICTL.st_dt, EDICTL.end_dt))
						.and(EDICTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
						.and(EDICTL.del_flg.eq(value(false)))
					)
					.innerJoin(EXTSYS).on(
						bracket(
							EDICTL.ext_sys_cd.eq(EXTSYS.ext_sys_cd)
						)
					)
					.leftOuterJoin(BP).on(
						bracket(
							PO.sppl_cd.eq(BP.bp_cd)
						)
						)
					.leftOuterJoin(BPL).on(
						bracket(
							BP.bp_cd.eq(BPL.bp_cd)
							.and(BPL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.leftOuterJoin(ITM).on(
						bracket(
							POD.itm_cd.eq(ITM.itm_cd)
							.and(POD.itm_sub1.eq(ITM.itm_sub1))
							.and(POD.itm_sub2.eq(ITM.itm_sub2))
							.and(POD.itm_sub3.eq(ITM.itm_sub3))
						)
					)
					.leftOuterJoin(ITMLCL).on(
						bracket(
							POD.itm_cd.eq(ITMLCL.itm_cd)
							.and(POD.itm_sub1.eq(ITMLCL.itm_sub1))
							.and(POD.itm_sub2.eq(ITMLCL.itm_sub2))
							.and(POD.itm_sub3.eq(ITMLCL.itm_sub3))
							.and(ITMLCL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.crossJoin(CO)
				)
				.where(
					POD.po_d_no.eq(bind("po_d_no"))
				)
			);
	}
	
	/**
	 * -- MSLAL5040_MST_DLV_INST_Query_S01
	 */
	static MCQueryPlan MSLAL5040_MST_DLV_INST_S01() {
		MSW_PO_D_KEY_R PODW = MSW_PO_D_KEY_R.create("PODW");
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_DLV_INST_R INST = MST_DLV_INST_R.create("INST");
		MST_DLV_INST_D_R INSTD = MST_DLV_INST_D_R.create("INSTD");
		MST_ARR_PR_R PR = MST_ARR_PR_R.create("PR");
		MST_ARR_SCHD_R SCHD = MST_ARR_SCHD_R.create("SCHD");
		MST_PURC_SCHD_R PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_LOC_LCL_R LOCLCL = MAM_LOC_LCL_R.create("LOCLCL");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_BP_LCL_R DLVLCL = MAM_BP_LCL_R.create("DLVLCL");
		MAM_BP_R DLV = MAM_BP_R.create("DLV");
		MAM_BP_LCL_R TDLVLCL = MAM_BP_LCL_R.create("TDLVLCL");
		MAM_BP_R TDLV = MAM_BP_R.create("TDLV");
		MAM_UNIT_LCL_R UNITLCL = MAM_UNIT_LCL_R.create("UNITLCL");
		MAM_UNIT_R UNIT = MAM_UNIT_R.create("UNIT");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5040_MST_DLV_INST_Query_S01")
				.mainQuery()
				.select(
					INST.dlv_inst_no,
					INST.dlv_inst_rev,
					INSTD.dlv_inst_d_no,
					INST.po_d_no,
					INST.dlv_inst_dt,
					INST.dlv_inst_grp_no,
					nvl2(
						INSTD.dlv_cd,
						value(MSC_IN_TO_ID_TYP.SCST.value()),
						value(MSC_IN_TO_ID_TYP.LOC.value())
					).as("in_to_id_typ"),
					nvl2(
						INSTD.dlv_cd,
						INSTD.dlv_cd,
						INSTD.in_to_loc_cd
					).as("in_to_id_cd"),
					cases()
						.when(INSTD.dlv_cd.isNull())
							.then(
								nvl2(
									BP.prnt_lcl_cd,
									LOCLCL.loc_nm,
									LOC.loc_nm
								)
						)
						.otherwise(
							nvl(
								INSTD.dlv_nm,
								nvl2(
									BP.prnt_lcl_cd,
									DLVLCL.bp_nm,
									DLV.bp_nm
								)
							)
					).as("in_to_nm"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_zip_cd).as("in_to_zip_cd"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.ADDR1.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_addr1).as("in_to_addr1"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.ADDR2.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_addr2).as("in_to_addr2"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.ADDR3.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_addr3).as("in_to_addr3"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.ADDR4.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_addr4).as("in_to_addr4"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(nullValue())
					.otherwise(INSTD.dlv_cntct_dpt).as("in_to_cntct_dpt"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(nullValue())
					.otherwise(INSTD.dlv_cntct_psn).as("in_to_cntct_psn"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
									INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.TEL.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_tel).as("in_to_tel"),
					cases()
					.when(INSTD.dlv_cd.isNull())
						.then(
							MAPA_LOC$F_GET_LOC_ADDR(
								INSTD.in_to_loc_cd,
								PO.po_dt,
								value(MAC_LOC_ADDR_TYP.FAX.value()),
								BP.prnt_lcl_cd
							)
					)
					.otherwise(INSTD.dlv_fax).as("in_to_fax"),
					nvl2(
						INSTD.dlv_cd,
						INSTD.dlv_sundry_flg,
						value(false)
					).as("in_to_sundry_flg"),
					nvl2(
						INSTD.dlv_cd,
						BP.cntry_cd,
						nullValue()
					).as("in_to_cntry_cd"),
					INSTD.tdlv_cd,
					nvl(
						INSTD.tdlv_nm,
						nvl2(
							BP.prnt_lcl_cd,
							TDLVLCL.bp_nm,
							TDLV.bp_nm
						)
					).as("tdlv_nm"),
					INSTD.tdlv_zip_cd,
					INSTD.tdlv_addr1,
					INSTD.tdlv_addr2,
					INSTD.tdlv_addr3,
					INSTD.tdlv_addr4,
					INSTD.tdlv_cntct_dpt,
					INSTD.tdlv_cntct_psn,
					INSTD.tdlv_tel,
					INSTD.tdlv_fax,
					INSTD.tdlv_sundry_flg,
					TDLV.cntry_cd.as("tdlv_cntry_cd"),
					INSTD.trd_unit_cd,
					nvl2(
						BP.prnt_lcl_cd,
						UNITLCL.unit_nm,
						UNIT.unit_nm
					).as("trd_unit_nm"),
					INSTD.trd_unit_qty,
					INSTD.dlv_rqst_tm,
					INST.dlv_inst_print_rmrks,
					INSTD.dlv_inst_print_d_rmrks,
					INSTD.pri_prnt_flg.as("pri_print_flg"),
					INSTD.base_unit_qty,
					POD.itm_cd,
					POD.itm_sub1,
					POD.itm_sub2,
					POD.itm_sub3,
					SCHD.arr_qty,
					SCHD.abort_qty.as("arr_abort_qty"),
					SCHD.purc_qty.as("purc_act_qty"),
					PURCSCHD.base_unit_abort_qty.as("purc_abort_qty"),
					PURCSCHD.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
					SCHD.rcpt_iv_no,
					SCHD.cmpl_flg.as("arr_cmpl_flg"),
					PURCSCHD.cmpl_flg.as("purc_cmpl_flg"),
					SCHD.arr_skip_flg,
					PURCSCHD.non_purc_flg
				)
				.from(
					INST
					.innerJoin(PODW).on(
						bracket(
							INST.po_d_no.eq(PODW.po_d_no)
						)
					)
					.innerJoin(POD).on(
						bracket(
							POD.po_d_no.eq(PODW.po_d_no)
						)
					)
					.innerJoin(PO).on(
							bracket(
								PO.po_no.eq(POD.po_no)
							)
						)
					.innerJoin(INSTD).on(
						INST.dlv_inst_no.eq(INSTD.dlv_inst_no)
						.and(INSTD.can_flg.eq(value(false)))
					)
					.leftOuterJoin(BP).on(
						bracket(
							PO.sppl_cd.eq(BP.bp_cd)
						)
					)
					.leftOuterJoin(LOCLCL).on(
						bracket(
							INSTD.in_to_loc_cd.eq(LOCLCL.loc_cd)
							.and(LOCLCL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.leftOuterJoin(LOC).on(
						bracket(
							INSTD.in_to_loc_cd.eq(LOC.loc_cd)
						)
					)
					.leftOuterJoin(DLVLCL).on(
						bracket(
							INSTD.dlv_cd.eq(DLVLCL.bp_cd)
							.and(DLVLCL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.leftOuterJoin(DLV).on(
						bracket(
							INSTD.dlv_cd.eq(DLV.bp_cd)
						)
					)
					.leftOuterJoin(TDLVLCL).on(
						bracket(
							INSTD.tdlv_cd.eq(TDLVLCL.bp_cd)
							.and(TDLVLCL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.leftOuterJoin(TDLV).on(
						bracket(
							INSTD.tdlv_cd.eq(TDLV.bp_cd)
						)
					)
					.leftOuterJoin(UNITLCL).on(
						bracket(
							INSTD.trd_unit_cd.eq(UNITLCL.unit_cd)
							.and(UNITLCL.lcl_cd.eq(BP.prnt_lcl_cd))
						)
					)
					.leftOuterJoin(UNIT).on(
						bracket(
							INSTD.trd_unit_cd.eq(UNIT.unit_cd)
						)
					)
					.leftOuterJoin(PR).on(
						bracket(
							INST.po_d_no.eq(PR.po_d_no)
						)
					)
					.leftOuterJoin(SCHD).on(
						bracket(
							PR.arr_pr_no.eq(SCHD.arr_pr_no)
							.and(INSTD.dlv_inst_d_no.eq(SCHD.dlv_inst_d_no))
						)
					)
					.leftOuterJoin(PURCSCHD).on(
						bracket(
							PURCSCHD.arr_pr_no.eq(PR.arr_pr_no)
							.and(PURCSCHD.arr_schd_no.eq(SCHD.arr_schd_no))
						)
					)
				)
				.where(
						INST.can_flg.eq(value(false))
				)
			);
	}
}