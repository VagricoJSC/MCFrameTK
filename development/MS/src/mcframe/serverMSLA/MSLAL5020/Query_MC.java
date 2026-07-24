package mcframe.serverMSLA.MSLAL5020;

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
	 * -- MSLAL5020_MST_PO_Query_S01
	 */
	static MCQueryPlan MSLAL5020_MST_PO_S01() {
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MSW_PO_KEY_R S0_W = MSW_PO_KEY_R.create("W");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_ARR_PR_R S0_PR = MST_ARR_PR_R.create("PR");
		MCTempView S0_V1 = createTempView("V1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_BP_LCL_R S0_BPLCL = MAM_BP_LCL_R.create("BPLCL");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_USR_LCL_R S0_USRLCL = MAM_USR_LCL_R.create("USRLCL");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_LCL_R S0_DPTLCL = MAM_DPT_LCL_R.create("DPTLCL");
		MAM_PO_PRINT_R S0_POPRNT = MAM_PO_PRINT_R.create("POPRNT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TTERM_LCL_R S0_TTERMLCL1 = MAM_TTERM_LCL_R.create("TTERMLCL1");
		MAM_TTERM_LCL_R S0_TTERMLCL2 = MAM_TTERM_LCL_R.create("TTERMLCL2");
		MAM_TTERM_LCL_R S0_TTERMLCL3 = MAM_TTERM_LCL_R.create("TTERMLCL3");
		MAM_TTERM_R S0_TTERM1 = MAM_TTERM_R.create("TTERM1");
		MAM_TTERM_R S0_TTERM2 = MAM_TTERM_R.create("TTERM2");
		MAM_TTERM_R S0_TTERM3 = MAM_TTERM_R.create("TTERM3");
		MAM_LOC_LCL_R S0_LOCLCL = MAM_LOC_LCL_R.create("LOCLCL");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_LCL_R S0_DLVLCL = MAM_BP_LCL_R.create("DLVLCL");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_LCL_R S0_TDLVLCL = MAM_BP_LCL_R.create("TDLVLCL");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_SITE_LCL_R S0_SITELCL = MAM_SITE_LCL_R.create("SITELCL");
		MAM_BP_R S0_OUTSRC_SPPL = MAM_BP_R.create("OUTSRC_SPPL");
		MAM_BP_LCL_R S0_OUTSRC_SPPLLCL = MAM_BP_LCL_R.create("OUTSRC_SPPLLCL");
		MAM_BP_LCL_R S0_MAKERLCL = MAM_BP_LCL_R.create("MAKERLCL");
		MAM_BP_R S0_MAKER = MAM_BP_R.create("MAKER");
		MAM_UNIT_LCL_R S0_UNITLCL = MAM_UNIT_LCL_R.create("UNITLCL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_BIZ_RSN_R S0_RSN = MAM_BIZ_RSN_R.create("RSN");
		MAM_BIZ_RSN_LCL_R S0_RSNLCL = MAM_BIZ_RSN_LCL_R.create("RSNLCL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_TAX_LCL_R S0_TAXLCL = MAM_TAX_LCL_R.create("TAXLCL");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_EXT_SYS_R S0_EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");
		MSW_PO_KEY_R S1_KEY = MSW_PO_KEY_R.create("KEY");
		MST_PO_D_R S2_POD = MST_PO_D_R.create("POD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5020_MST_PO_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(
								S0_PO.can_flg.eq(value(true))
								.or(S0_POD.can_flg.eq(value(true)))
							)
								.then(value(MAC_DATA_CRUD_TYP.DEL.value()))
							.when(S0_PO.po_rev.eq(value(1)))
								.then(value(MAC_DATA_CRUD_TYP.CRT.value()))
							.otherwise(value(MAC_DATA_CRUD_TYP.UPD.value())).as("data_crud_typ"),
						S0_PO.po_no,
						S0_PO.po_rev.as("hdr_po_rev"),
						S0_POD.po_rev,
						S0_POD.po_d_no,
						S0_CO.cntry_cd,
						S0_PO.purc_dpt_cd,
						nvl(
							S0_DPTLCL.dpt_nm,
							S0_DPT.dpt_nm
						).as("purc_dpt_nm"),
						S0_PO.wg_cd,
						S0_PO.purc_usr_cd,
						nvl(
							S0_USRLCL.usr_nm,
							S0_USR.usr_nm
						).as("purc_usr_nm"),
						S0_PO.sppl_cd,
						nvl(
							S0_BPLCL.bp_nm,
							S0_BP.bp_nm
						).as("sppl_nm"),
						S0_BP.cntry_cd.as("sppl_cntry_cd"),
						S0_PO.po_dt,
						S0_PO.upd_po_print_schd_dt,
						bracket(
							cases()
								.when(
									S0_V1.pr(S1_KEY.po_no).isNotNull()
									.and(S0_PO.can_flg.eq(value(true)))
								)
									.then(S0_POPRNT.txt_del_on)
								.when(
									S0_V1.pr(S1_KEY.po_no).isNull()
									.and(S0_PO.can_flg.eq(value(true)))
								)
									.then(S0_POPRNT.txt_del_off)
								.when(
									S0_V1.pr(S1_KEY.po_no).isNotNull()
									.and(S0_PO.can_flg.eq(value(false)))
									.and(S0_PO.po_rev.neq(value(1)))
								)
									.then(S0_POPRNT.txt_mod_on)
								.when(
									S0_V1.pr(S1_KEY.po_no).isNull()
									.and(S0_PO.can_flg.eq(value(false)))
									.and(S0_PO.po_rev.neq(value(1)))
								)
									.then(S0_POPRNT.txt_mod_off)
								.when(
									S0_V1.pr(S1_KEY.po_no).isNotNull()
									.and(S0_PO.last_po_rev.isNull())
								)
									.then(S0_POPRNT.txt_new_on)
								.otherwise(S0_POPRNT.txt_new_off)
						).as("po_print_txt"),
						S0_PO.trd_cur_cd,
						S0_PO.wrk_no,
						S0_PO.tterm_cd1,
						nvl(
							S0_TTERMLCL1.tterm_nm,
							S0_TTERM1.tterm_nm
						).as("tterm_nm1"),
						S0_PO.tterm_rmrks1,
						S0_PO.tterm_cd2,
						nvl(
							S0_TTERMLCL2.tterm_nm,
							S0_TTERM2.tterm_nm
						).as("tterm_nm2"),
						S0_PO.tterm_rmrks2,
						S0_PO.tterm_cd3,
						nvl(
							S0_TTERMLCL3.tterm_nm,
							S0_TTERM3.tterm_nm
						).as("tterm_nm3"),
						S0_PO.tterm_rmrks3,
						cases()
							.when(S0_POD.drct_dlv_typ.eq(value(MSC_DRCT_DLV_TYP.DDLV.value())))
								.then(value(true))
							.otherwise(value(false)).as("drct_dlv_flg"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(value(MSC_SHIP_TO_ID_TYP.LOC.value()))
							.otherwise(value(MSC_SHIP_TO_ID_TYP.DLV.value())).as("in_to_id_typ"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(S0_POD.in_to_loc_cd)
							.otherwise(S0_POD.dlv_cd).as("in_to_id_cd"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									nvl(
										S0_LOCLCL.loc_nm,
										S0_LOC.loc_nm
									)
							)
							.otherwise(
								nvl(
									S0_POD.dlv_nm,
									nvl(
										S0_DLVLCL.bp_nm,
										S0_DLV.bp_nm
									)
								)
							).as("in_to_nm"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_zip_cd).as("in_to_zip_cd"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.ADDR1.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_addr1).as("in_to_addr1"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.ADDR2.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_addr2).as("in_to_addr2"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.ADDR3.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_addr3).as("in_to_addr3"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.ADDR4.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_addr4).as("in_to_addr4"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(nullValue())
							.otherwise(S0_POD.dlv_cntct_dpt).as("in_to_cntct_dpt"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(nullValue())
							.otherwise(S0_POD.dlv_cntct_psn).as("in_to_cntct_psn"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.TEL.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_tel).as("in_to_tel"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									MAPA_LOC$F_GET_LOC_ADDR(
										S0_POD.in_to_loc_cd,
										S0_PO.po_dt,
										value(MAC_LOC_ADDR_TYP.FAX.value()),
										S0_BPLCL.lcl_cd
									)
							)
							.otherwise(S0_POD.dlv_fax).as("in_to_fax"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(value(false))
							.otherwise(S0_POD.dlv_sundry_flg).as("in_to_sundry_flg"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(nullValue())
							.otherwise(S0_DLV.cntry_cd).as("in_to_cntry_cd"),
						S0_POD.tdlv_cd,
						nvl(
							S0_POD.tdlv_nm,
							nvl(
								S0_TDLVLCL.bp_nm,
								S0_TDLV.bp_nm
							)
						).as("tdlv_nm"),
						S0_POD.tdlv_zip_cd,
						S0_POD.tdlv_addr1,
						S0_POD.tdlv_addr2,
						S0_POD.tdlv_addr3,
						S0_POD.tdlv_addr4,
						S0_POD.tdlv_cntct_dpt,
						S0_POD.tdlv_cntct_psn,
						S0_POD.tdlv_tel,
						S0_POD.tdlv_fax,
						S0_POD.tdlv_sundry_flg,
						S0_TDLV.cntry_cd.as("tdlv_cntry_cd"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(S0_LOC.site_cd)
							.otherwise(nullValue()).as("site_cd"),
						cases()
							.when(S0_POD.dlv_cd.isNull())
								.then(
									nvl(
										S0_SITELCL.site_nm,
										S0_SITE.site_nm
									)
							)
							.otherwise(nullValue()).as("site_nm"),
						cases()
							.when(
								S0_POD.dlv_cd.isNull()
								.and(S0_LOC.sppl_cd.isNotNull())
							)
								.then(S0_LOC.sppl_cd)
							.otherwise(nullValue()).as("drct_dlv_bp_cd"),
						cases()
							.when(
								S0_POD.dlv_cd.isNull()
								.and(S0_LOC.sppl_cd.isNotNull())
							)
								.then(
									nvl(
										S0_OUTSRC_SPPLLCL.bp_nm,
										S0_OUTSRC_SPPL.bp_nm
									)
							)
							.otherwise(nullValue()).as("drct_dlv_bp_nm"),
						cases()
							.when(
								S0_POD.dlv_cd.isNull()
								.and(S0_LOC.sppl_cd.isNotNull())
							)
								.then(S0_OUTSRC_SPPL.cntry_cd)
							.otherwise(nullValue()).as("drct_dlv_cntry_cd"),
						S0_POD.itm_cd,
						S0_POD.itm_sub1,
						S0_POD.itm_sub2,
						S0_POD.itm_sub3,
						S0_POD.sno1,
						S0_POD.sno2,
						S0_POD.sno3,
						S0_POD.sno4,
						cases()
							.when(S0_POD.sundry_itm_flg.eq(value(true)))
								.then(S0_POD.itm_nm)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("itm_nm"),
						cases()
							.when(S0_POD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_POD.iv_itm_nm,
										S0_POD.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						S0_POD.maker_cd,
						nvl(
							S0_MAKERLCL.bp_nm,
							S0_MAKER.bp_nm
						).as("maker_nm"),
						S0_POD.sppl_itm_cd,
						S0_POD.sppl_itm_nm,
						S0_POD.bp_lot_no,
						S0_POD.ver_no,
						S0_POD.trd_unit_cd,
						nvl(
							S0_UNITLCL.unit_nm,
							S0_UNIT.unit_nm
						).as("trd_unit_nm"),
						S0_POD.trd_unit_qty,
						S0_TAX.inc_tax_flg,
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_upri),
							S0_POD.trd_cur_upri
						).as("trd_cur_upri"),
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_amt),
							S0_POD.trd_cur_amt
						).as("trd_cur_amt"),
						S0_POD.trd_cur_dscnt_amt,
						S0_POD.dscnt_rsn_cd,
						nvl(
							S0_RSNLCL.biz_rsn_nm,
							S0_RSN.biz_rsn_nm
						).as("dscnt_rsn_nm"),
						S0_POD.interim_flg,
						S0_POD.tax_fix_flg,
						S0_TAX.tax_typ,
						S0_POD.tax_cd,
						nvl(
							S0_TAXLCL.tax_nm,
							S0_TAX.tax_nm
						).as("tax_nm"),
						S0_TAX.tax_rate,
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_tax_amt),
							S0_POD.trd_cur_tax_amt
						).as("trd_cur_tax_amt"),
						S0_POD.dlv_rqst_tm,
						S0_POD.purc_schd_dt,
						S0_PO.po_print_rmrks,
						S0_POD.po_print_d_rmrks,
						S0_PO.dlv_slip_rmrks,
						S0_POD.dlv_slip_d_rmrks,
						S0_POD.sundry_itm_flg,
						S0_POD.purc_id_typ,
						S0_POD.outsrc_flg,
						S0_PR.abort_flg,
						S0_POD.pri_print_flg,
						nvl(
							FCPA_CO$F_GET_CO_NM1(S0_BP.prnt_lcl_cd),
							FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())
							).as("co_nm"),
						S0_PO.edi_flg,
						S0_PO.aprv_sts_typ,
						S0_PO.po_print_flg,
						S0_PO.last_po_rev,
						S0_IFCTL.ext_sys_cd,
						S0_EXTSYS.null_val_if_flg,
						S0_EXTSYS.web_api_flg,
						S0_PO.edi_sub_char1,
						S0_PO.edi_sub_char2,
						S0_PO.edi_sub_char3,
						S0_PO.edi_sub_char4,
						S0_PO.edi_sub_char5,
						S0_PO.edi_sub_num1,
						S0_PO.edi_sub_dt1,
						S0_POD.edi_sub_d_char1,
						S0_POD.edi_sub_d_char2,
						S0_POD.edi_sub_d_char3,
						S0_POD.edi_sub_d_char4,
						S0_POD.edi_sub_d_char5,
						S0_POD.edi_sub_d_num1,
						S0_POD.edi_sub_d_dt1,
						// this field is appended by sql coverter.
						S0_PO.crct_rsn_cd.as("join_crct_rsn_cd_")
					)
					.from(
						S0_PO
						.innerJoin(S0_W).on(
							bracket(
								S0_PO.po_no.eq(S0_W.po_no)
							)
						)
						.innerJoin(S0_POD).on(
							bracket(
								S0_PO.po_no.eq(S0_POD.po_no)
							)
						)
						.leftOuterJoin(S0_PR).on(
							bracket(
								S0_POD.po_d_no.eq(S0_PR.po_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S1_KEY.po_no)
							.from(S1_KEY)
							.where(
								exists(
									subQuery()
									.select(S2_POD.po_no)
									.from(S2_POD)
									.where(
										S1_KEY.po_no.eq(S2_POD.po_no)
										.and(S2_POD.can_flg.eq(value(false)))
										.and(S2_POD.interim_flg.eq(value(true)))
									)
								)
							).view(S0_V1)
						).on(
							bracket(
								S0_PO.po_no.eq(S0_V1.pr(S1_KEY.po_no))
							)
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
						.leftOuterJoin(S0_BPLCL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BPLCL.bp_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_BPLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_USR).on(
							bracket(
								S0_PO.purc_usr_cd.eq(S0_USR.usr_cd)
							)
						)
						.leftOuterJoin(S0_USRLCL).on(
							bracket(
								S0_PO.purc_usr_cd.eq(S0_USRLCL.usr_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_USRLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_DPTLCL).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPTLCL.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPTLCL.st_dt, S0_DPTLCL.end_dt))
								.and(S0_BP.prnt_lcl_cd.eq(S0_DPTLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_POPRNT).on(
							bracket(
								S0_PO.po_print_cd.eq(S0_POPRNT.po_print_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERMLCL1).on(
							bracket(
								S0_PO.tterm_cd1.eq(S0_TTERMLCL1.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL1.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERMLCL2).on(
							bracket(
								S0_PO.tterm_cd2.eq(S0_TTERMLCL2.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL2.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERMLCL3).on(
							bracket(
								S0_PO.tterm_cd3.eq(S0_TTERMLCL3.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL3.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERM1).on(
							bracket(
								S0_PO.tterm_cd1.eq(S0_TTERM1.tterm_cd)
							)
						)
						.leftOuterJoin(S0_TTERM2).on(
							bracket(
								S0_PO.tterm_cd2.eq(S0_TTERM2.tterm_cd)
							)
						)
						.leftOuterJoin(S0_TTERM3).on(
							bracket(
								S0_PO.tterm_cd3.eq(S0_TTERM3.tterm_cd)
							)
						)
						.leftOuterJoin(S0_LOCLCL).on(
							bracket(
								S0_POD.in_to_loc_cd.eq(S0_LOCLCL.loc_cd)
								.and(S0_LOCLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_POD.in_to_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLVLCL).on(
							bracket(
								S0_POD.dlv_cd.eq(S0_DLVLCL.bp_cd)
								.and(S0_DLVLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_POD.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TDLVLCL).on(
							bracket(
								S0_POD.tdlv_cd.eq(S0_TDLVLCL.bp_cd)
								.and(S0_TDLVLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_POD.tdlv_cd.eq(S0_TDLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_SITE).on(
							bracket(
								S0_LOC.site_cd.eq(S0_SITE.site_cd)
							)
						)
						.leftOuterJoin(S0_SITELCL).on(
							bracket(
								S0_LOC.site_cd.eq(S0_SITELCL.site_cd)
								.and(S0_SITELCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_OUTSRC_SPPL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_OUTSRC_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_OUTSRC_SPPLLCL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_OUTSRC_SPPLLCL.bp_cd)
								.and(S0_OUTSRC_SPPL.prnt_lcl_cd.eq(S0_OUTSRC_SPPLLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_MAKERLCL).on(
							bracket(
								S0_POD.maker_cd.eq(S0_MAKERLCL.bp_cd)
								.and(S0_MAKERLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_MAKER).on(
							bracket(
								S0_POD.maker_cd.eq(S0_MAKER.bp_cd)
							)
						)
						.leftOuterJoin(S0_UNITLCL).on(
							bracket(
								S0_POD.trd_unit_cd.eq(S0_UNITLCL.unit_cd)
								.and(S0_UNITLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_UNIT).on(
							bracket(
								S0_POD.trd_unit_cd.eq(S0_UNIT.unit_cd)
							)
						)
						.leftOuterJoin(S0_RSN).on(
							bracket(
								S0_POD.dscnt_rsn_cd.eq(S0_RSN.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_RSNLCL).on(
							bracket(
								S0_POD.dscnt_rsn_cd.eq(S0_RSNLCL.biz_rsn_cd)
								.and(S0_RSNLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_POD.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_TAXLCL).on(
							bracket(
								S0_POD.tax_cd.eq(S0_TAXLCL.tax_cd)
								.and(S0_TAXLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_IFCTL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))
							)
						)
						.innerJoin(S0_EXTSYS).on(
							bracket(
								S0_IFCTL.ext_sys_cd.eq(S0_EXTSYS.ext_sys_cd)
							)
						)
					)
					.orderBy(
						S0_PO.po_no.asc(),
						S0_POD.disp_seq.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("join_crct_rsn_cd_")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("po_crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("po_crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
}