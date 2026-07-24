package mcframe.serverMSBE.MSBEL5740;

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
	 * -- MSBEL5740_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5740_MST_PURC_SCHD_S01() {
		MST_PURC_SCHD_R PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARR_PR");
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
		MST_PRMS_RCPT_D_R PRMSRCPTD = MST_PRMS_RCPT_D_R.create("PRMSRCPTD");
		MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MAM_BP_R DLV = MAM_BP_R.create("DLV");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R SPPL = MAM_BP_R.create("SPPL");
		MAM_ITM_LCL_R ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5740_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						PURCSCHD.purc_schd_no,
						PO.sppl_cd,
						nvl2(
							POD.dlv_cd,
							value(MSC_IN_TO_ID_TYP.SCST.value()),
							value(MSC_IN_TO_ID_TYP.LOC.value())
						).as("in_to_id_typ"),
						nvl2(
							DLVINSTD.dlv_cd,
							nvl(
								DLVINSTD.dlv_nm,
								DLV.bp_nm
							),
							decode(
								POD.dlv_sundry_flg,
								value(true),
								POD.dlv_nm,
								nvl2(
									POD.dlv_cd,
									DLV.bp_nm,
									LOC.loc_nm
								)
							)
						).as("in_to_id_nm"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_cntct_dpt,
							POD.dlv_cntct_dpt
						).as("in_to_cntct_dpt"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_cntct_psn,
							POD.dlv_cntct_psn
						).as("in_to_cntct_psn"),
						nvl2(
							POD.dlv_cd,
							DLV.cntry_cd,
							LOC.cntry_cd
						).as("in_to_cntry_cd"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_sundry_flg,
							POD.dlv_sundry_flg
						).as("in_to_sundry_flg"),
						PO.trd_cur_cd,
						SPPL.purc_amt_rnd_typ,
						SPPL.purc_tax_rnd_typ,
						PO.po_no,
						PO.purc_dpt_cd,
						PO.purc_usr_cd,
						POD.po_d_no,
						POD.trd_cur_upri.as("trd_cur_upri"),
						POD.dscnt_rsn_cd,
						POD.wtax_rate,
						POD.tax_fix_flg,
						POD.tax_cd,
						POD.purc_rsn_cd,
						POD.bd_itm_cd,
						POD.bd_itm_sub1,
						POD.bd_itm_sub2,
						POD.bd_itm_sub3,
						POD.bd_sno1,
						POD.bd_sno2,
						POD.bd_sno3,
						POD.bd_sno4,
						POD.bd_loc_cd,
						POD.bd_lot_no,
						POD.bd_sublot_no,
						POD.bd_dpt_cd,
						POD.bd_wg_cd,
						POD.bd_ctg_cd,
						POD.bd_oper_cd,
						POD.bd_slo_no,
						POD.bd_iv_no,
						POD.bd_po_no,
						POD.bd_bp_cd,
						POD.trd_d_rmrks,
						PO.trd_cd,
						PO.trd_ptn_typ,
						ARRSCHD.arr_pr_no,
						ARRSCHD.arr_schd_no,
						ARRSCHD.rcpt_iv_no.as("old_rcpt_iv_no"),
						ARRSCHD.rcpt_iv_mng_no,
						ARRSCHD.itm_cd,
						ARRSCHD.itm_sub1,
						ARRSCHD.itm_sub2,
						ARRSCHD.itm_sub3,
						POD.itm_nm,
						POD.iv_itm_nm,
						ARRSCHD.sundry_itm_flg,
						ARRSCHD.sno1,
						ARRSCHD.sno2,
						ARRSCHD.sno3,
						ARRSCHD.sno4,
						ARRSCHD.sppl_itm_cd,
						ARRSCHD.sppl_itm_nm,
						ARRSCHD.maker_cd,
						decode(
							PURCSCHD.non_purc_flg,
							value(false),
							PURCSCHD.trd_unit_schd_qty,
							ARRSCHD.trd_unit_qty
						).as("trd_unit_qty"),
						decode(
							PURCSCHD.non_purc_flg,
							value(false),
							PURCSCHD.base_unit_schd_qty,
							ARRSCHD.base_unit_qty
						).as("base_unit_qty"),
						ARRSCHD.trd_unit_cd,
						ARRSCHD.base_unit_cd,
						ARRSCHD.purc_id_typ,
						POD.slo_d_no,
						PURCSCHD.trd_unit_cd.as("unit_cd"),
						POD.rqst_can_flg,
						PO.aprv_no,
						PO.po_no,
						PURCSCHD.base_unit_purc_qty.as("purc_qty"),
						PURCSCHD.base_unit_accpt_dfct_qty,
						PURCSCHD.base_unit_abort_qty,
						PURCSCHD.non_purc_flg,
						POD.trd_unit_cd.as("po_trd_unit_cd"),
						POD.trd_unit_qty.as("po_trd_unit_qty"),
						POD.trd_cur_upri.as("po_trd_cur_upri"),
						POD.trd_cur_dscnt_amt.as("po_trd_cur_dscnt_amt"),
						POD.trd_cur_proc_upri.as("po_trd_cur_proc_upri"),
						POD.trd_cur_onr_prov_upri.as("po_trd_cur_onr_prov_upri"),
						POD.trd_cur_amt.as("po_trd_cur_amt"),
						POD.trd_cur_proc_amt.as("po_trd_cur_proc_amt"),
						POD.trd_cur_onr_prov_amt.as("po_trd_cur_onr_prov_amt"),
						POD.trd_cur_tax_amt.as("po_trd_cur_tax_amt"),
						POD.trd_cur_amt.add(POD.trd_cur_tax_amt).as("po_trd_cur_inc_ctax_amt"),
						PO.wg_cd.as("po_wg_cd"),
						addDynamicSelect(REP1),
						// this field is appended by sql coverter.
						SLOD.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						POD.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						POD.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						POD.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						POD.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						PURCSCHD
						.innerJoin(ARRSCHD).on(
							bracket(
								PURCSCHD.arr_schd_no.eq(ARRSCHD.arr_schd_no)
							)
						)
						.innerJoin(ARRPR).on(
							bracket(
								PURCSCHD.arr_pr_no.eq(ARRPR.arr_pr_no)
							)
						)
						.innerJoin(POD).on(
							bracket(
								ARRPR.po_d_no.eq(POD.po_d_no)
							)
						)
						.innerJoin(PO).on(
							bracket(
								POD.po_no.eq(PO.po_no)
							)
						)
						.leftOuterJoin(SLOD).on(
							bracket(
								POD.slo_d_no.eq(SLOD.slo_d_no)
								.and(POD.dlv_cd.eq(SLOD.dlv_cd))
							)
						)
						.leftOuterJoin(PRMSRCPTD).on(
							bracket(
								ARRSCHD.prms_rcpt_d_no.eq(PRMSRCPTD.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(DLVINSTD).on(
							bracket(
								ARRSCHD.dlv_inst_d_no.eq(DLVINSTD.dlv_inst_d_no)
								.or(PRMSRCPTD.dlv_inst_d_no.eq(DLVINSTD.dlv_inst_d_no))
							)
						)
						.leftOuterJoin(DLV).on(
							bracket(
								nvl(
									DLVINSTD.dlv_cd,
									POD.dlv_cd
								).eq(DLV.bp_cd)
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
						.leftOuterJoin(SPPL).on(
							bracket(
								PO.sppl_cd.eq(SPPL.bp_cd)
							)
						)
						.leftOuterJoin(ITMLCL).on(
							bracket(
								POD.itm_cd.eq(ITMLCL.itm_cd)
								.and(POD.itm_sub1.eq(ITMLCL.itm_sub1))
								.and(POD.itm_sub2.eq(ITMLCL.itm_sub2))
								.and(POD.itm_sub3.eq(ITMLCL.itm_sub3))
								.and(ITMLCL.lcl_cd.eq(SPPL.prnt_lcl_cd))
							)
						)
						.addDynamicView(REP1)
					)
					.where(PURCSCHD.purc_schd_no.eq(bind("purc_schd_no")))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.cst_cd,
							m.slo_no,
							m.tterm_cd1,
							m.tterm_cd2,
							m.tterm_cd3,
							m.tterm_rmrks1,
							m.tterm_rmrks2,
							m.tterm_rmrks3
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_cd1", m.tterm_cd1());
							r.setStringNE("slo_tterm_rmrks1", m.tterm_rmrks1());
							r.setStringNE("slo_tterm_cd2", m.tterm_cd2());
							r.setStringNE("slo_tterm_rmrks2", m.tterm_rmrks2());
							r.setStringNE("slo_tterm_cd3", m.tterm_cd3());
							r.setStringNE("slo_tterm_rmrks3", m.tterm_rmrks3());
							r.setStringNE("slo_no", m.slo_no());
							r.setStringNE("join_cst_cd_", m.cst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_cst_cd_")
						))
						.addSelect(m -> toArray(
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("po_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("po_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("po_trd_unit_conv_base_qty", m.conv_base_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_qty,
							m.conv_base_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_upri_dec_place", m.upri_dec_place());
					})
				)
			);
	}
	/**
	 * MSBEL5740_MST_PURC_SCHD_S01_WHERE01
	 */
	static MCDynamicSQLInfo MSBEL5740_MST_PURC_SCHD_S01_WHERE01() {
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				nullValue().as("arr_dt"),
				nullValue().as("arr_hm"),
				nvl2(
					POD.dlv_cd,
					nvl(
						DLVINSTD.dlv_cd,
						POD.dlv_cd
					),
					POD.in_to_loc_cd
				).as("in_to_id_cd"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_zip_cd,
						POD.dlv_zip_cd
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
						nullValue()
					)
				).as("in_to_zip_cd"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr1,
						POD.dlv_addr1
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.ADDR1.value()),
						nullValue()
					)
				).as("in_to_addr1"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr2,
						POD.dlv_addr2
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.ADDR2.value()),
						nullValue()
					)
				).as("in_to_addr2"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr3,
						POD.dlv_addr3
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.ADDR3.value()),
						nullValue()
					)
				).as("in_to_addr3"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr4,
						POD.dlv_addr4
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.ADDR4.value()),
						nullValue()
					)
				).as("in_to_addr4"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_tel,
						POD.dlv_tel
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.TEL.value()),
						nullValue()
					)
				).as("in_to_tel"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_fax,
						POD.dlv_fax
					),
					MAPA_LOC$F_GET_LOC_ADDR(
						POD.in_to_loc_cd,
						PO.po_dt,
						value(MAC_BP_ADDR_TYP.FAX.value()),
						nullValue()
					)
				).as("in_to_fax"),
				nullValue().as("arr_act_no")
			)
			.view(REP1, v ->
				v.leftOuterJoin(LOC).on(
					bracket(
						POD.in_to_loc_cd.eq(LOC.loc_cd)
					)
				)
			);
	}
	/**
	 * MSBEL5740_MST_PURC_SCHD_S01_WHERE02
	 */
	static MCDynamicSQLInfo MSBEL5740_MST_PURC_SCHD_S01_WHERE02() {
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MST_ARR_ACT_R ARRACT = MST_ARR_ACT_R.create("ARRACT");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				trunc(
					ARRACT.arr_tm,
					MCDateFmt.DD
				).as("arr_dt"),
				ARRACT.arr_tm.as("arr_hm"),
				nvl2(
					POD.dlv_cd,
					nvl(
						DLVINSTD.dlv_cd,
						POD.dlv_cd
					),
					nvl2(
						ARRACT.arr_loc_cd,
						ARRACT.arr_loc_cd,
						POD.in_to_loc_cd
					)
				).as("in_to_id_cd"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_zip_cd,
						POD.dlv_zip_cd
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						)
					)
				).as("in_to_zip_cd"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr1,
						POD.dlv_addr1
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.ADDR1.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.ADDR1.value()),
							nullValue()
						)
					)
				).as("in_to_addr1"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr2,
						POD.dlv_addr2
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.ADDR2.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.ADDR2.value()),
							nullValue()
						)
					)
				).as("in_to_addr2"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr3,
						POD.dlv_addr3
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.ADDR3.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.ADDR3.value()),
							nullValue()
						)
					)
				).as("in_to_addr3"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_addr4,
						POD.dlv_addr4
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.ADDR4.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.ADDR4.value()),
							nullValue()
						)
					)
				).as("in_to_addr4"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_tel,
						POD.dlv_tel
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.TEL.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.TEL.value()),
							nullValue()
						)
					)
				).as("in_to_tel"),
				nvl2(
					POD.dlv_cd,
					nvl2(
						DLVINSTD.dlv_cd,
						DLVINSTD.dlv_fax,
						POD.dlv_fax
					),
					nvl2(
						ARRACT.arr_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							ARRACT.arr_loc_cd,
							ARRACT.arr_tm,
							value(MAC_BP_ADDR_TYP.FAX.value()),
							nullValue()
						),
						MAPA_LOC$F_GET_LOC_ADDR(
							POD.in_to_loc_cd,
							PO.po_dt,
							value(MAC_BP_ADDR_TYP.FAX.value()),
							nullValue()
						)
					)
				).as("in_to_fax"),
				ARRACT.arr_act_no
			)
			.view(REP1, v ->
				v.leftOuterJoin(ARRACT).on(
					ARRACT.arr_schd_no.eq(ARRSCHD.arr_schd_no)
					.and(ARRACT.can_flg.eq(value(false)))
				)
				.leftOuterJoin(LOC).on(
					bracket(
						ARRACT.arr_loc_cd.eq(LOC.loc_cd)
					)
				)
			);
	}
}