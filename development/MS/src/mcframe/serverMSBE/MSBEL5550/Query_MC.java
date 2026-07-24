package mcframe.serverMSBE.MSBEL5550;

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
	 * -- MSBEL5550_MST_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_DLV_SLIP_D_S01() {
		MST_DLV_SLIP_D_R S0_T1 = MST_DLV_SLIP_D_R.create("T1");
		MSW_DLV_SLIP_KEY_R S0_W1 = MSW_DLV_SLIP_KEY_R.create("W1");
		MST_DLV_SLIP_R S0_T2 = MST_DLV_SLIP_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MCTempView S0_T4 = createTempView("T4");
		MAM_BP_R S0_M0 = MAM_BP_R.create("M0");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_LCL_R S0_M1L = MAM_ITM_LCL_R.create("M1L");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_UNIT_LCL_R S0_M3L = MAM_UNIT_LCL_R.create("M3L");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_UNIT_LCL_R S0_M4L = MAM_UNIT_LCL_R.create("M4L");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_UNIT_LCL_R S0_M5L = MAM_UNIT_LCL_R.create("M5L");
		MAM_UNIT_R S0_M6 = MAM_UNIT_R.create("M6");
		MAM_UNIT_LCL_R S0_M6L = MAM_UNIT_LCL_R.create("M6L");
		MAVM_ITM_UNIT_R S0_M10 = MAVM_ITM_UNIT_R.create("M10");
		MSW_DLV_SLIP_KEY_R S1_WW1 = MSW_DLV_SLIP_KEY_R.create("WW1");
		MST_DLV_SLIP_R S1_WW2 = MST_DLV_SLIP_R.create("WW2");
		MST_SLS_ACT_R S1_WW3 = MST_SLS_ACT_R.create("WW3");
		MST_DLV_SLIP_R S2_X = MST_DLV_SLIP_R.create("X");
		
		MCSubQuery S0_M10_dec_place = subQuery().select(S0_M10.dec_place).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T1.trd_unit_cd))
					));
		
		MCSubQuery S0_M10_unit_wt = subQuery().select(S0_M10.unit_wt).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T1.trd_unit_cd))
					));
		
		MCSubQuery S0_M10_unit_dim = subQuery().select(S0_M10.unit_dim).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T1.trd_unit_cd))
					));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dlv_slip_d_no,
						S0_T1.dlv_slip_d_seq,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T2.slip_sts_typ,
						decode(
							S0_T4.pr(S1_WW3.sls_basis_typ),
							value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
							value(MSC_TRN_TYP.SHIP.value()),
							S0_T2.trn_typ
						).as("trn_typ"),
						S0_T2.dlv_slip_inst_no,
						decode(
							S0_T4.pr(S1_WW3.sls_basis_typ),
							value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
							S0_T4.pr(S1_WW3.ship_act_no),
							S0_T2.dlv_slip_act_no
						).as("dlv_slip_act_no"),
						S0_T1.itm_cd.as("dlv_slip_itm_cd"),
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							nvl(
								S0_T1.itm_nm,
								S0_M2.itm_nm
							),
							nvl(
								S0_M1L.itm_nm,
								S0_M1.itm_nm
							)
						).as("dlv_slip_itm_nm"),
						nvl(S0_T1.itm_nm, S0_M2.itm_nm).as("org_itm_nm"),
						nvl(
							S0_M1L.itm_alt_nm1,
							S0_M1.itm_alt_nm1
						).as("dlv_slip_itm_alt_nm1"),
						nvl(
							S0_M1L.itm_alt_nm2,
							S0_M1.itm_alt_nm2
						).as("dlv_slip_itm_alt_nm2"),
						nvl(
							S0_M1L.itm_alt_nm3,
							S0_M1.itm_alt_nm3
						).as("dlv_slip_itm_alt_nm3"),
						nvl(
							S0_M1L.itm_alt_nm4,
							S0_M1.itm_alt_nm4
						).as("dlv_slip_itm_alt_nm4"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.lot_plural_flg,
						S0_T1.sublot_no.as("sublot_no_data"),
						S0_T1.sublot_plural_flg,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						nvl(
							S0_M3L.unit_nm,
							S0_M3.unit_nm
						).as("trd_unit_nm"),
						S0_M10_dec_place.as("trd_unit_dec_place"),
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						nvl(
							S0_M4L.unit_nm,
							S0_M4.unit_nm
						).as("base_unit_nm"),
						S0_T1.dlv_inst_qty,
						nvl(
							S0_M5L.unit_nm,
							S0_M5.unit_nm
						).as("dlv_inst_unit_nm"),
						S0_T1.dlv_inst_unit_cd,
						S0_T1.slo_qty.as("slo_po_qty"),
						nvl(
							S0_M6L.unit_nm,
							S0_M6.unit_nm
						).as("slo_po_unit_nm"),
						S0_T1.slo_unit_cd.as("slo_po_unit_cd"),
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.tax_cd,
						S0_T1.interim_flg,
						nvl(
							S0_T1.trd_cur_amt,
							value(0)
						).add(
							nvl(
								S0_T1.trd_cur_tax_amt,
								value(0)
							)
						).as("trd_cur_tax_in_amt"),
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dlv_inst_no,
						S0_T1.dlv_inst_d_no,
						S0_T1.cst_po_d_no.as("dlv_slip_po_d_no"),
						S0_T1.trd_unit_qty.multiply(S0_M10_unit_wt).as("ship_wt"),
						S0_T1.trd_unit_qty.multiply(S0_M10_unit_dim).as("ship_dim"),
						S0_T1.trd_d_rmrks,
						nullValue().as("pack_qty"),
						nullValue().as("ttl_pack_qty"),
						nullValue().as("po_d_sub_char1"),
						nullValue().as("po_d_sub_char2"),
						nullValue().as("po_d_sub_char3"),
						nullValue().as("arr_schd_sub_char1"),
						nullValue().as("arr_schd_sub_char2"),
						nullValue().as("arr_schd_sub_char3"),
						S0_T1.sub_char1.as("dlt_slip_d_sub_char1"),
						S0_T1.sub_char2.as("dlt_slip_d_sub_char2"),
						S0_T1.sub_char3.as("dlt_slip_d_sub_char3"),
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_M1.dscnt_itm_flg,
						S0_T3.proc_typ,
						S0_T1.ship_dlv_slip_d_no,
						S0_T3.sls_cststk_flg,
						// this field is appended by sql coverter.
						S0_T2.trd_cur_cd.as("join_trd_cur_cd_")
						,S0_T1.prov_basis_typ
						,S0_T1.base_ac_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_W1.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_T2.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.slo_d_no.eq(S0_T1.slo_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S1_WW3.sls_act_no,
								S1_WW3.ship_act_no,
								S1_WW3.sls_basis_typ
							)
							.from(
								S1_WW1
								.innerJoin(S1_WW2).on(
									bracket(
										S1_WW2.dlv_slip_no.eq(S1_WW1.dlv_slip_no)
										.and(S1_WW2.dlv_slip_seq.eq(S1_WW1.dlv_slip_seq))
										.and(S1_WW2.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
									)
								)
								.innerJoin(S1_WW3).on(
									bracket(
										S1_WW3.sls_act_no.eq(S1_WW2.dlv_slip_act_no)
										.and(S1_WW3.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
									)
								)
							)
							.where(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_X)
									.where(
										S2_X.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
										.and(S2_X.dlv_slip_act_no.eq(S1_WW3.ship_act_no))
									)
								)
							).view(S0_T4)
						).on(
							bracket(
								S0_T4.pr(S1_WW3.sls_act_no).eq(S0_T2.dlv_slip_act_no)
								.and(S0_T2.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
							)
						)
						.leftOuterJoin(S0_M0).on(
							bracket(
								S0_M0.bp_cd.eq(S0_T2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M1L).on(
							bracket(
								S0_M1L.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1L.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1L.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1L.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M1L.lcl_cd.eq(S0_M0.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M2.sno1.eq(S0_T1.sno1))
								.and(S0_M2.sno2.eq(S0_T1.sno2))
								.and(S0_M2.sno3.eq(S0_T1.sno3))
								.and(S0_M2.sno4.eq(S0_T1.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.unit_cd.eq(S0_T1.trd_unit_cd)
							)
						)
						.leftOuterJoin(S0_M3L).on(
							bracket(
								S0_M3L.unit_cd.eq(S0_T1.trd_unit_cd)
								.and(S0_M3L.lcl_cd.eq(S0_M0.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.unit_cd.eq(S0_T1.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M4L).on(
							bracket(
								S0_M4L.unit_cd.eq(S0_T1.base_unit_cd)
								.and(S0_M4L.lcl_cd.eq(S0_M0.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.unit_cd.eq(S0_T1.dlv_inst_unit_cd)
							)
						)
						.leftOuterJoin(S0_M5L).on(
							bracket(
								S0_M5L.unit_cd.eq(S0_T1.dlv_inst_unit_cd)
								.and(S0_M5L.lcl_cd.eq(S0_M0.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.unit_cd.eq(S0_T1.slo_unit_cd)
							)
						)
						.leftOuterJoin(S0_M6L).on(
							bracket(
								S0_M6L.unit_cd.eq(S0_T1.slo_unit_cd)
								.and(S0_M6L.lcl_cd.eq(S0_M0.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							nvl(
								S0_T3.ship_inst_typ,
								value(MAC_SHIP_INST_TYP.NON.value())
							).neq(value(MAC_SHIP_INST_TYP.NO_PICK.value()))
							.and(bind("not_exists_no_pick").eq(value(true)))
						)
					)
					.orderBy(
						S0_T1.dlv_slip_no.asc(),
						S0_T1.dlv_slip_seq.asc(),
						S0_T1.dlv_slip_d_no.asc(),
						S0_T1.dlv_slip_d_seq.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("join_trd_cur_cd_")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("dlv_slip_itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("dlv_slip_itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("dlv_inst_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dlv_inst_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("dlv_slip_itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("slo_po_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("slo_po_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_DLV_SLIP_D_Query_S02
	 */
	static MCQueryPlan MSBEL5550_MST_DLV_SLIP_D_S02() {
		MST_DLV_SLIP_D_R S0_T1 = MST_DLV_SLIP_D_R.create("T1");
		MSW_DLV_SLIP_KEY_R S0_W1 = MSW_DLV_SLIP_KEY_R.create("W1");
		MST_DLV_SLIP_R S0_T2 = MST_DLV_SLIP_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_DLV_SLIP_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.io_typ,
						S0_T1.dlv_slip_d_seq.as("disp_seq"),
						S0_T1.dlv_slip_d_no,
						S0_T1.dlv_slip_d_seq,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T2.slip_sts_typ,
						S0_T2.trn_typ,
						S0_T2.dlv_slip_act_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T1.sno1.as("sno1_data"),
						S0_T1.sno2.as("sno2_data"),
						S0_T1.sno3.as("sno3_data"),
						S0_T1.sno4.as("sno4_data"),
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.sublot_no.as("sublot_no_data"),
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.str_ln_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.quality_typ,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.fix_no,
						S0_T1.fix_no_typ,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3"),
						// this field is appended by sql coverter.
						S0_T2.xfr_loc_cd.as("join_xfr_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_W1.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_T2.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M2.sno1.eq(S0_T1.sno1))
								.and(S0_M2.sno2.eq(S0_T1.sno2))
								.and(S0_M2.sno3.eq(S0_T1.sno3))
								.and(S0_M2.sno4.eq(S0_T1.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.dlv_slip_no.asc(),
						S0_T1.dlv_slip_seq.asc(),
						S0_T1.dlv_slip_d_no.asc(),
						S0_T1.dlv_slip_d_seq.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_xfr_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
							r.setStringNE("stk_arrv_bp_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("stk_arrv_bp_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("stk_arrv_bp_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("stk_arrv_bp_alt_nm4", m.bp_alt_nm4());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
							r.setStringNE("stk_bp_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("stk_bp_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("stk_bp_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("stk_bp_alt_nm4", m.bp_alt_nm4());
					}),
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
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_DLV_SLIP_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MSW_DLV_SLIP_KEY_R S0_W1 = MSW_DLV_SLIP_KEY_R.create("W1");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MCTempView S0_T2 = createTempView("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_LCL_R S0_M1L = MAM_BP_LCL_R.create("M1L");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_LCL_R S0_M2L = MAM_DPT_LCL_R.create("M2L");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_USR_LCL_R S0_M3L = MAM_USR_LCL_R.create("M3L");
		MAM_TRD_R S0_M4 = MAM_TRD_R.create("M4");
		MAM_TRD_LCL_R S0_M4L = MAM_TRD_LCL_R.create("M4L");
		MAM_SLIP_FORM_R S0_M5 = MAM_SLIP_FORM_R.create("M5");
		MAM_SLIP_FORM_R S0_M6 = MAM_SLIP_FORM_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_CUR_LCL_R S0_M7L = MAM_CUR_LCL_R.create("M7L");
		MAM_LG_GRP_R S0_M8 = MAM_LG_GRP_R.create("M8");
		MAM_LG_GRP_LCL_R S0_M8L = MAM_LG_GRP_LCL_R.create("M8L");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_BP_LCL_R S0_M9L = MAM_BP_LCL_R.create("M9L");
		MAM_LOC_R S0_M10 = MAM_LOC_R.create("M10");
		MAM_LOC_R S0_M11 = MAM_LOC_R.create("M11");
		MST_DLV_SLIP_R S1 = MST_DLV_SLIP_R.create();
		MSW_DLV_SLIP_KEY_R S2_WW1 = MSW_DLV_SLIP_KEY_R.create("WW1");
		MST_DLV_SLIP_R S2_WW2 = MST_DLV_SLIP_R.create("WW2");
		MST_SLS_ACT_R S2_WW3 = MST_SLS_ACT_R.create("WW3");
		MST_DLV_SLIP_R S3_X = MST_DLV_SLIP_R.create("X");
		MAM_CO_R S0_M12 = MAM_CO_R.create("M12");
		MAM_CNTRY_R S0_M13 = MAM_CNTRY_R.create("M13");
		MAM_CNTRY_R S0_M14 = MAM_CNTRY_R.create("M14");
		MAM_CNTRY_R S0_M15 = MAM_CNTRY_R.create("M15");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						nvl(
							S0_T1.bp_nm,
							nvl(
								S0_M1L.bp_nm,
								S0_M1.bp_nm
							)
						).as("bp_nm"),
						S0_T1.bp_cd,
						S0_T1.bp_zip_cd,
						S0_T1.bp_addr1,
						S0_T1.bp_addr2,
						S0_T1.bp_addr3,
						S0_T1.bp_addr4,
						S0_T1.bp_tel,
						S0_T1.bp_fax,
						S0_T1.bp_cntct_dpt,
						S0_T1.bp_cntct_psn,
						S0_M1.cst_cntct_psn_title.as("bp_cntct_psn_title"),
						S0_T1.trd_cd,
						nvl(
							S0_M4L.trd_nm,
							S0_M4.trd_nm
						).as("trd_nm"),
						S0_M1.prnt_lcl_cd,
						S0_T1.trd_ptn_typ,
						nullValue().as("slip_sts_typ_nm"),
						S0_T1.slip_sts_typ,
						S0_T1.adjst_slip_flg,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_rev,
						S0_T1.dlv_slip_seq,
						decode(
							S0_T2.pr(S2_WW3.sls_basis_typ),
							value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
							value(MSC_TRN_TYP.SHIP.value()),
							S0_T1.trn_typ
						).as("trn_typ"),
						S0_T1.dlv_slip_inst_no,
						decode(
							S0_T2.pr(S2_WW3.sls_basis_typ),
							value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
							S0_T2.pr(S2_WW3.ship_act_no),
							S0_T1.dlv_slip_act_no
						).as("dlv_slip_act_no"),
						S0_T1.ship_fr_lg_grp_cd.as("lg_grp_cd"),
						nvl(
							S0_M8L.lg_grp_nm,
							S0_M8.lg_grp_nm
						).as("lg_grp_nm"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm,
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm,
						S0_T1.ac_dt,
						S0_T1.trd_cur_cd,
						S0_M1.cur_cd.as("cur_cd_for_attach"),
						nvl(
							S0_M7L.cur_nm,
							S0_M7.cur_nm
						).as("trd_cur_nm"),
						S0_M7.upri_dec_place,
						S0_M7.amt_dec_place,
						S0_T1.trd_cur_amt,
						nvl(
							S0_T1.trd_cur_amt,
							value(0)
						).add(
							nvl(
								S0_T1.trd_cur_tax_amt,
								value(0)
							)
						).as("trd_cur_tax_in_amt"),
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						nullValue().as("slo_co_cd"),
						nullValue().as("slo_std_co_cd"),
						FCPA_CO$F_GET_CO_NM1(S0_M1.prnt_lcl_cd).as("slo_co_nm"),
						nvl(
							S0_M2L.dpt_nm,
							S0_M2.dpt_nm
						).as("dpt_nm"),
						S0_T1.dpt_cd,
						S0_M2.zip_cd.as("slo_co_zip_cd"),
						S0_M2.tel.as("slo_co_tel"),
						S0_M2.fax.as("slo_co_fax"),
						S0_M2.addr1.as("slo_co_addr1"),
						S0_M2.addr2.as("slo_co_addr2"),
						S0_M2.addr3.as("slo_co_addr3"),
						S0_M2.addr4.as("slo_co_addr4"),
						nvl(
							S0_M3L.usr_nm,
							S0_M3.usr_nm
						).as("usr_nm"),
						S0_T1.usr_cd,
						S0_T1.bp_cd.as("po_co_cd"),
						nvl(
							S0_M1L.bp_nm,
							S0_M1.bp_nm
						).as("po_co_nm"),
						nvl(
							S0_M1L.bp_alt_nm1,
							S0_M1.bp_alt_nm1
						).as("po_co_alt_nm1"),
						nvl(
							S0_M1L.bp_alt_nm2,
							S0_M1.bp_alt_nm2
						).as("po_co_alt_nm2"),
						nvl(
							S0_M1L.bp_alt_nm3,
							S0_M1.bp_alt_nm3
						).as("po_co_alt_nm3"),
						nvl(
							S0_M1L.bp_alt_nm4,
							S0_M1.bp_alt_nm4
						).as("po_co_alt_nm4"),
						S0_T1.bp_zip_cd.as("po_co_zip_cd"),
						S0_T1.bp_addr1.as("po_co_addr1"),
						S0_T1.bp_addr2.as("po_co_addr2"),
						S0_T1.bp_addr3.as("po_co_addr3"),
						S0_T1.bp_addr4.as("po_co_addr4"),
						S0_T1.bp_tel.as("po_co_tel"),
						S0_T1.bp_fax.as("po_co_fax"),
						S0_T1.bp_cntct_dpt.as("po_co_cntct_dpt"),
						S0_T1.bp_cntct_psn.as("po_co_cntct_psn"),
						S0_T1.dlv_id_typ,
						cases()
							.when(S0_T1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
								.then(
									nvl(
										S0_T1.dlv_id_nm,
										S0_M10.loc_nm
									)
							)
							.otherwise(
								nvl(
									S0_T1.dlv_id_nm,
									nvl(
										S0_M9L.bp_nm,
										S0_M9.bp_nm
									)
								)
							).as("dlv_id_nm"),
						nvl(
							S0_M9L.bp_alt_nm1,
							S0_M9.bp_alt_nm1
						).as("dlv_id_alt_nm1"),
						nvl(
							S0_M9L.bp_alt_nm2,
							S0_M9.bp_alt_nm2
						).as("dlv_id_alt_nm2"),
						nvl(
							S0_M9L.bp_alt_nm3,
							S0_M9.bp_alt_nm3
						).as("dlv_id_alt_nm3"),
						nvl(
							S0_M9L.bp_alt_nm4,
							S0_M9.bp_alt_nm4
						).as("dlv_id_alt_nm4"),
						S0_T1.dlv_id_cd,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(S0_T1.bp_cntct_dpt)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(S0_T1.bp_cntct_dpt)
							.otherwise(S0_T1.dlv_cntct_dpt).as("dlv_cntct_dpt"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(S0_T1.bp_cntct_psn)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(S0_T1.bp_cntct_psn)
							.otherwise(S0_T1.dlv_cntct_psn).as("dlv_cntct_psn"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(S0_M1.sppl_cntct_psn_title)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(S0_M1.sppl_cntct_psn_title)
							.otherwise(S0_M9.dlv_cntct_psn_title).as("dlv_cntct_psn_title"),
						S0_T1.pri_prnt_flg,
						S0_T1.cst_po_no.as("dlv_slip_po_no"),
						S0_T1.trd_rmrks,
						nullValue().as("po_trd_rmrks"),
						nullValue().as("po_sub_char1"),
						nullValue().as("po_sub_char2"),
						nullValue().as("po_sub_char3"),
						S0_T1.sub_char1.as("dlv_slip_sub_char1"),
						S0_T1.sub_char2.as("dlv_slip_sub_char2"),
						S0_T1.sub_char3.as("dlv_slip_sub_char3"),
						nullValue().as("in_to_loc_cd"),
						nullValue().as("in_to_loc_nm"),
						S0_T1.slip_prnt_flg,
						S0_T1.ship_adv_prnt_flg,
						S0_T1.sls_prnt_flg,
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(S0_M6.slip_form_id)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(S0_M6.slip_form_id)
							.otherwise(
								nvl(
									S0_M5.slip_form_id,
									S0_M6.slip_form_id
								)
							).as("slip_form_id"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(S0_M6.copy_slip_form_id)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(S0_M6.copy_slip_form_id)
							.otherwise(
								decode(
									S0_M5.slip_form_id,
									nullValue(),
									S0_M6.copy_slip_form_id,
									S0_M5.copy_slip_form_id
								)
							).as("copy_slip_form_id"),
						S0_T1.xfr_loc_cd.as("ship_loc_cd"),
						S0_M11.loc_nm.as("ship_loc_nm"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						).as("ship_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.ADDR1.value()),
							nullValue()
						).as("ship_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.ADDR2.value()),
							nullValue()
						).as("ship_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.ADDR3.value()),
							nullValue()
						).as("ship_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.ADDR4.value()),
							nullValue()
						).as("ship_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.TEL.value()),
							nullValue()
						).as("ship_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.xfr_loc_cd,
							S0_T1.ship_tm,
							value(MAC_BP_ADDR_TYP.FAX.value()),
							nullValue()
						).as("ship_loc_fax"),
						S0_T1.slo_no,
						S0_SLO.sls_basis_typ,
						S0_M1.sls_basis_typ.as("sls_basis_typ_bp"),
						S0_M1.cst_iv_flg,
						bracket(
							subQuery()
							.select(max(S1.slip_prnt_flg))
							.from(S1)
							.where(
								S1.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S1.dlv_slip_rev.lte(S0_T1.dlv_slip_rev.subtract(value(1))))
							)
						).as("slip_prnted_flg"),
						S0_T1.dlv_id_nm.as("org_dlv_id_nm"),
						nvl(S0_T1.ac_dt, S0_T1.ship_tm).as("dpt_base_dt"),
						S0_T1.ship_dlv_slip_no
						,S0_T1.xrate,
						S0_T1.base_cur_tax_amt,
						S0_M1.cur_cd,
						S0_T1.tax_calc_typ
						,S0_M13.cntry_nm.as("slo_co_cntry_nm")
						,S0_M14.cntry_nm.as("po_co_cntry_nm")
						,S0_M15.cntry_nm.as("dlv_cntry_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_W1.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_T1.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S2_WW3.sls_act_no,
								S2_WW3.ship_act_no,
								S2_WW3.sls_basis_typ
							)
							.from(
								S2_WW1
								.innerJoin(S2_WW2).on(
									bracket(
										S2_WW2.dlv_slip_no.eq(S2_WW1.dlv_slip_no)
										.and(S2_WW2.dlv_slip_seq.eq(S2_WW1.dlv_slip_seq))
										.and(S2_WW2.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
									)
								)
								.innerJoin(S2_WW3).on(
									bracket(
										S2_WW3.sls_act_no.eq(S2_WW2.dlv_slip_act_no)
										.and(S2_WW3.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
									)
								)
							)
							.where(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_X)
									.where(
										S3_X.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
										.and(S3_X.dlv_slip_act_no.eq(S2_WW3.ship_act_no))
									)
								)
							).view(S0_T2)
						).on(
							bracket(
								S0_T2.pr(S2_WW3.sls_act_no).eq(S0_T1.dlv_slip_act_no)
								.and(S0_T1.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M1L).on(
							bracket(
								S0_M1L.bp_cd.eq(S0_T1.bp_cd)
								.and(S0_M1L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dpt_cd.eq(S0_T1.dpt_cd)
								.and(
									nvl(
										S0_T1.ac_dt,
										S0_T1.ship_tm
									).between(S0_M2.st_dt, S0_M2.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2L).on(
							bracket(
								S0_M2L.dpt_cd.eq(S0_T1.dpt_cd)
								.and(
									nvl(
										S0_T1.ac_dt,
										S0_T1.ship_tm
									).between(S0_M2L.st_dt, S0_M2L.end_dt)
								)
								.and(S0_M2L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.usr_cd.eq(S0_T1.usr_cd)
							)
						)
						.leftOuterJoin(S0_M3L).on(
							bracket(
								S0_M3L.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_M3L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.trd_cd.eq(S0_T1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M4L).on(
							bracket(
								S0_M4L.trd_cd.eq(S0_T1.trd_cd)
								.and(S0_M4L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.slip_form_cd.eq(S0_M1.cst_ship_form_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.slip_form_cd.eq(S0_M4.slip_form_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.cur_cd.eq(S0_T1.trd_cur_cd)
							)
						)
						.leftOuterJoin(S0_M7L).on(
							bracket(
								S0_M7L.cur_cd.eq(S0_T1.trd_cur_cd)
								.and(S0_M7L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M8L).on(
							bracket(
								S0_M8L.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(S0_M8L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.bp_cd.eq(S0_T1.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M9L).on(
							bracket(
								S0_M9L.bp_cd.eq(S0_T1.dlv_id_cd)
								.and(S0_M9L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.loc_cd.eq(S0_T1.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.loc_cd.eq(S0_T1.xfr_loc_cd)
							)
						)
						.crossJoin(S0_M12)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.cntry_cd.eq(S0_M12.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.cntry_cd.eq(S0_M1.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.cntry_cd.eq(S0_M9.cntry_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.dlv_slip_no.asc(),
						S0_T1.dlv_slip_seq.asc()
					)
					.forUpdate(S0_T1.dlv_slip_no)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_DLV_SLIP_Query_S02
	 */
	static MCQueryPlan MSBEL5550_MST_DLV_SLIP_S02() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MSW_DLV_SLIP_KEY_R S0_W1 = MSW_DLV_SLIP_KEY_R.create("W1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_TRD_R S0_M4 = MAM_TRD_R.create("M4");
		MAM_SLIP_FORM_R S0_M5 = MAM_SLIP_FORM_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_DLV_SLIP_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_M4.trd_nm,
						S0_T1.trd_ptn_typ,
						nullValue().as("slip_sts_typ_nm"),
						S0_T1.slip_sts_typ,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_rev,
						S0_T1.dlv_slip_seq,
						S0_T1.trn_typ,
						S0_T1.dlv_slip_act_no,
						S0_T1.ac_dt,
						S0_T1.xfr_loc_cd,
						S0_M1.loc_nm,
						S0_T1.dpt_cd,
						S0_M2.dpt_nm,
						S0_T1.usr_cd,
						S0_M3.usr_nm,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.slip_prnt_flg,
						S0_M5.slip_form_id
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dlv_slip_no.eq(S0_T1.dlv_slip_no)
								.and(S0_W1.dlv_slip_seq.eq(S0_T1.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.xfr_loc_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.usr_cd.eq(S0_T1.usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.trd_cd.eq(S0_T1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.slip_form_cd.eq(S0_M4.slip_form_cd)
							)
						)
					)
					.orderBy(
						S0_T1.dlv_slip_no.asc(),
						S0_T1.dlv_slip_seq.asc()
					)
					.forUpdate(S0_T1.dlv_slip_no)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_SHIP_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_SHIP_ACT_S01() {
		MCTempView S0_T2 = createTempView("T2");
		MSW_SHIP_ACT_P_KEY_R S0_T1 = MSW_SHIP_ACT_P_KEY_R.create("T1");
		MST_SHIP_ACT_R S0_W1 = MST_SHIP_ACT_R.create("W1");
		MST_SHIP_ACT_P_R S0_W2 = MST_SHIP_ACT_P_R.create("W2");
		MSVM_SHIP_TO_ID_R S0_M1 = MSVM_SHIP_TO_ID_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_CO_R S0_M6 = MAM_CO_R.create("M6");
		MAM_CNTRY_R S0_M7 = MAM_CNTRY_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_SHIP_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.pr("ship_act_no"),
						S0_T2.pr("ship_to_id_typ"),
						S0_T2.pr("ship_to_id_cd"),
						S0_T2.pr("ship_dpt_cd"),
						S0_M4.dpt_nm.as("ship_dpt_nm"),
						S0_T2.pr("ship_usr_cd"),
						nvl(
							S0_T2.pr("ship_to_id_nm"),
							S0_M1.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_M1.ship_to_id_alt_nm1,
						S0_M1.ship_to_id_alt_nm2,
						S0_M1.ship_to_id_alt_nm3,
						S0_M1.ship_to_id_alt_nm4,
						S0_T2.pr("ship_to_zip_cd"),
						S0_T2.pr("ship_to_addr1"),
						S0_T2.pr("ship_to_addr2"),
						S0_T2.pr("ship_to_addr3"),
						S0_T2.pr("ship_to_addr4"),
						S0_T2.pr("ship_to_tel"),
						S0_T2.pr("ship_to_fax"),
						S0_T2.pr("ship_to_sundry_flg"),
						S0_T2.pr("via_dlv_typ"),
						nvl2(
							S0_M1.sppl_cd,
							S0_M3.sppl_cntct_dpt,
							S0_T2.pr("ship_to_cntct_dpt")
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_M1.sppl_cd,
							S0_M3.sppl_cntct_psn,
							S0_T2.pr("ship_to_cntct_psn")
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_M1.sppl_cd,
							S0_M3.sppl_cntct_psn_title,
							S0_M2.dlv_cntct_psn_title
						).as("ship_to_cntct_psn_title"),
						S0_T2.pr("ship_to_id_nm").as("org_ship_to_id_nm"),
						decode(
							S0_T2.pr("ship_to_id_typ"),
							value(MSC_SHIP_TO_ID_TYP.LOC.value()),
							nullValue(),
							S0_M2.prnt_lcl_cd
						).as("prnt_lcl_cd")
						,S0_M1.cntry_nm.as("ship_to_cntry_nm")
						,S0_M7.cntry_nm
					)
					.from(
						subQuery()
						.select(
							S0_W1.ship_act_no,
							S0_W1.ship_tm,
							S0_W1.ship_to_id_typ,
							S0_W1.ship_to_id_cd,
							S0_W1.ship_to_id_nm,
							S0_W1.ship_to_sundry_flg,
							S0_W1.ship_to_zip_cd,
							S0_W1.ship_to_addr1,
							S0_W1.ship_to_addr2,
							S0_W1.ship_to_addr3,
							S0_W1.ship_to_addr4,
							S0_W1.ship_to_tel,
							S0_W1.ship_to_fax,
							S0_W1.ship_to_cntct_dpt,
							S0_W1.ship_to_cntct_psn,
							S0_W1.ship_dpt_cd,
							S0_W1.ship_usr_cd,
							S0_W1.via_dlv_typ
						)
						.from(
							S0_T1
							.innerJoin(S0_W1).on(
								S0_W1.ship_act_no.eq(S0_T1.ship_act_no)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S0_W2.ship_act_no,
								S0_W2.ship_tm,
								S0_W2.ship_to_id_typ,
								S0_W2.ship_to_id_cd,
								S0_W2.ship_to_id_nm,
								S0_W2.ship_to_sundry_flg,
								S0_W2.ship_to_zip_cd,
								S0_W2.ship_to_addr1,
								S0_W2.ship_to_addr2,
								S0_W2.ship_to_addr3,
								S0_W2.ship_to_addr4,
								S0_W2.ship_to_tel,
								S0_W2.ship_to_fax,
								S0_W2.ship_to_cntct_dpt,
								S0_W2.ship_to_cntct_psn,
								S0_W2.ship_dpt_cd,
								S0_W2.ship_usr_cd,
								S0_W2.via_dlv_typ
							)
							.from(
								S0_T1
								.innerJoin(S0_W2).on(
									S0_W2.ship_act_no.eq(S0_T1.ship_act_no)
									.and(S0_W2.ship_act_rev.eq(S0_T1.ship_act_rev))
								)
							)
							.where(notExists(subQuery()
								.select(value("x"))
								.from(S0_W1)
								.where(
									S0_W1.ship_act_no.eq(S0_W2.ship_act_no)
									.and(S0_W1.ship_act_rev.eq(S0_W2.ship_act_rev))
								)
							))
						).view(S0_T2)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_to_id_typ.eq(S0_T2.pr("ship_to_id_typ"))
								.and(S0_M1.ship_to_id_cd.eq(S0_T2.pr("ship_to_id_cd")))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T2.pr("ship_to_id_cd"))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.bp_cd.eq(S0_M1.sppl_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T2.pr("ship_dpt_cd"))
								.and(S0_T2.pr("ship_tm").between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.crossJoin(S0_M6)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.cntry_cd.eq(S0_M6.cntry_cd)
							)
						)
					)
					.orderBy(S0_T2.pr("ship_act_no").asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("ship_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_SHIP_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_SHIP_INST_D_S01() {
		MST_SHIP_INST_D_R S0_T1 = MST_SHIP_INST_D_R.create("T1");
		MSW_SHIP_INST_KEY_R S0_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_INST_R S0_T3 = MST_SHIP_INST_R.create("T3");
		MCTempView S0_T4 = createTempView("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_STK_GD_R S0_M3 = MAM_STK_GD_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_LG_GRP_R S0_M7 = MAM_LG_GRP_R.create("M7");
		MAM_UNIT_R S0_M15 = MAM_UNIT_R.create("M15");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAVM_ITM_UNIT_R S0_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAVM_ITM_UNIT_R S0_M11 = MAVM_ITM_UNIT_R.create("M11");
		MAVM_ITM_UNIT_R S0_M12 = MAVM_ITM_UNIT_R.create("M12");
		MAM_USR_R S0_M13 = MAM_USR_R.create("M13");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MSW_SHIP_INST_KEY_R S1_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_D_R S1_W2 = MST_SHIP_INST_D_R.create("W2");
		MST_SHIP_SCHD_R S1_W3 = MST_SHIP_SCHD_R.create("W3");
		MST_SHIP_PR_R S1_W4 = MST_SHIP_PR_R.create("W4");
		
		MCSubQuery S0_M10_dec_place = subQuery().select(S0_M10.dec_place).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T2.ent_unit_cd))
					));
		
		MCSubQuery S0_M11_dec_place = subQuery().select(S0_M11.dec_place).from(S0_M11).where(
				bracket(
						S0_M11.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M11.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M11.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M11.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M11.unit_cd.eq(S0_T2.pack_unit_cd))
					));
		
		MCSubQuery S0_M12_dec_place = subQuery().select(S0_M12.dec_place).from(S0_M12).where(
				bracket(
						S0_M12.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M12.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M12.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M12.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M12.unit_cd.eq(S0_T2.base_unit_cd))
					));
		
		MCSubQuery S0_M10_unit_wt = subQuery().select(S0_M10.unit_wt).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T2.ent_unit_cd))
					));
		
		MCSubQuery S0_M10_unit_dim = subQuery().select(S0_M10.unit_dim).from(S0_M10).where(
				bracket(
						S0_M10.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M10.unit_cd.eq(S0_T2.ent_unit_cd))
					));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_SHIP_INST_D_Query_S01")
					.mainQuery()
					.select(
						value(MSC_TRN_TYP.SHIP.value()).as("trn_typ"),
						S0_T1.ship_inst_no,
						S0_T2.ship_inst_d_no,
						S0_T2.dlv_slip_no,
						S0_T2.dlv_slip_d_no,
						S0_T3.ship_fr_lg_grp_cd.as("lg_grp_cd"),
						S0_M7.lg_grp_nm,
						trunc(
							S0_T3.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T3.ship_schd_tm,
						S0_T3.pick_prnt_flg,
						S0_T3.inst_dpt_cd,
						S0_M14.dpt_nm.as("inst_dpt_nm"),
						S0_T3.inst_usr_cd,
						S0_M13.usr_nm.as("inst_usr_nm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							nvl(
								S0_T1.itm_nm,
								S0_M2.itm_nm
							),
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T2.quality_typ,
						S0_M3.gd_nm,
						S0_T2.gd_cd,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_M4.bp_nm.as("stk_bp_nm"),
						S0_M4.bp_alt_nm1.as("stk_bp_alt_nm1"),
						S0_M4.bp_alt_nm2.as("stk_bp_alt_nm2"),
						S0_M4.bp_alt_nm3.as("stk_bp_alt_nm3"),
						S0_M4.bp_alt_nm4.as("stk_bp_alt_nm4"),
						S0_T2.stk_bp_cd,
						S0_T1.inst_d_rmrks,
						S0_M5.loc_nm.as("ship_loc_nm"),
						S0_T2.ship_loc_cd,
						S0_M6.str_ln_nm.as("ship_str_ln_nm"),
						S0_T2.ship_str_ln_cd,
						S0_T2.lot_no.as("lot_no_data"),
						S0_T2.sublot_no.as("sublot_no_data"),
						S0_T2.ver_no,
						S0_T2.sno1.as("sno1_data"),
						S0_T2.sno2.as("sno2_data"),
						S0_T2.sno3.as("sno3_data"),
						S0_T2.sno4.as("sno4_data"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T2.ent_unit_qty,
						S0_M15.unit_nm.as("ent_unit_nm"),
						S0_M10_dec_place.as("ent_unit_dec_place"),
						S0_T2.ent_unit_cd,
						S0_T2.pack_unit_qty,
						S0_M8.unit_nm.as("pack_unit_nm"),
						S0_M11_dec_place.as("pack_unit_dec_place"),
						S0_T2.pack_unit_cd,
						S0_T2.base_unit_qty.as("base_unit_qty"),
						S0_M9.unit_nm.as("base_unit_nm"),
						S0_M12_dec_place.as("base_unit_dec_place"),
						S0_T2.base_unit_cd.as("base_unit_cd"),
						S0_T2.alloc_flg,
						S0_T2.ent_unit_qty.multiply(S0_M10_unit_wt).as("ship_wt"),
						S0_T2.ent_unit_qty.multiply(S0_M10_unit_dim).as("ship_dim"),
						S0_T2.disp_seq,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_inst_d_no.eq(S0_T1.ship_inst_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.innerJoin(
							subQuery()
							.selectDistinct(S1_W3.ship_inst_d_no)
							.from(
								S1_W1
								.innerJoin(S1_W2).on(
									bracket(
										S1_W2.ship_inst_no.eq(S1_W1.ship_inst_no)
									)
								)
								.innerJoin(S1_W3).on(
									bracket(
										S1_W3.ship_inst_d_no.eq(S1_W2.ship_inst_d_no)
									)
								)
								.innerJoin(S1_W4).on(
									bracket(
										S1_W4.ship_pr_no.eq(S1_W3.ship_pr_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S1_W4.ship_inst_typ.in(
										value(MAC_SHIP_INST_TYP.PICK.value()),
										value(MAC_SHIP_INST_TYP.NON.value())
									)
								)
							).view(S0_T4)
						).on(
							bracket(
								S0_T4.pr(S1_W3.ship_inst_d_no).eq(S0_T1.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M2.sno1.eq(S0_T1.sno1))
								.and(S0_M2.sno2.eq(S0_T1.sno2))
								.and(S0_M2.sno3.eq(S0_T1.sno3))
								.and(S0_M2.sno4.eq(S0_T1.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.gd_cd.eq(S0_T2.gd_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.bp_cd.eq(S0_T2.stk_bp_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.loc_cd.eq(S0_T2.ship_loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.loc_cd.eq(S0_T2.ship_loc_cd)
								.and(S0_M6.str_ln_cd.eq(S0_T2.ship_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.lg_grp_cd.eq(S0_T3.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.unit_cd.eq(S0_T2.ent_unit_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.unit_cd.eq(S0_T2.pack_unit_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.unit_cd.eq(S0_T2.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.usr_cd.eq(S0_T3.inst_usr_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.dpt_cd.eq(S0_T3.inst_dpt_cd)
								.and(S0_T3.ship_inst_tm.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.abort_flg.eq(value(false)))
					)
					.orderBy(
						S0_T3.ship_inst_no.asc(),
						S0_T2.disp_seq.asc(),
						S0_T2.ship_inst_d_no.asc()
					)
					.forUpdate(S0_T3.ship_inst_no)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_SHIP_INST_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MST_SHIP_INST_R S0_T2 = MST_SHIP_INST_R.create("T2");
		MSW_SHIP_INST_P_KEY_R S0_W1 = MSW_SHIP_INST_P_KEY_R.create("W1");
		MST_SHIP_INST_R S0_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_P_R S0_W3 = MST_SHIP_INST_P_R.create("W3");
		MAM_SHIP_WK_R S0_M1 = MAM_SHIP_WK_R.create("M1");
		MAM_SHIP_TERM_R S0_M2 = MAM_SHIP_TERM_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MSVM_SHIP_TO_ID_R S0_M5 = MSVM_SHIP_TO_ID_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MST_SHIP_ALLOC_STS_R S1_W = MST_SHIP_ALLOC_STS_R.create("W");
		MAM_CO_R S0_M8 = MAM_CO_R.create("M8");
		MAM_CNTRY_R S0_M9 = MAM_CNTRY_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						value(MSC_TRN_TYP.SHIP.value()).as("trn_typ"),
						S0_T1.pr("ship_inst_no"),
						S0_T1.pr("ship_inst_rev"),
						S0_T1.pr("ship_schd_tm"),
						S0_T1.pr("dlv_schd_tm"),
						trunc(
							S0_T1.pr("ship_inst_tm"),
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.pr("ship_wk_cd"),
						S0_M1.ship_wk_nm,
						S0_T1.pr("ship_term_cd"),
						S0_M2.ship_term_nm,
						S0_T1.pr("ship_inst_tm"),
						S0_T1.pr("inst_dpt_cd"),
						S0_M3.dpt_nm.as("inst_dpt_nm"),
						S0_T1.pr("inst_usr_cd"),
						S0_M4.usr_nm.as("inst_usr_nm"),
						S0_T1.pr("ship_to_lg_grp_cd"),
						S0_T1.pr("ship_to_id_typ"),
						S0_T1.pr("ship_to_id_cd"),
						nvl(
							S0_T1.pr("ship_to_id_nm"),
							S0_M5.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_M5.ship_to_id_alt_nm1,
						S0_M5.ship_to_id_alt_nm2,
						S0_M5.ship_to_id_alt_nm3,
						S0_M5.ship_to_id_alt_nm4,
						S0_T1.pr("ship_to_zip_cd"),
						S0_T1.pr("ship_to_addr1"),
						S0_T1.pr("ship_to_addr2"),
						S0_T1.pr("ship_to_addr3"),
						S0_T1.pr("ship_to_addr4"),
						nvl2(
							S0_M5.sppl_cd,
							S0_M7.sppl_cntct_dpt,
							S0_T1.pr("ship_to_cntct_dpt")
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_M5.sppl_cd,
							S0_M7.sppl_cntct_psn,
							S0_T1.pr("ship_to_cntct_psn")
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_M5.sppl_cd,
							S0_M7.sppl_cntct_psn_title,
							S0_M6.dlv_cntct_psn_title
						).as("ship_to_cntct_psn_title"),
						S0_T1.pr("ship_to_tel"),
						S0_T1.pr("ship_to_fax"),
						S0_T1.pr("ship_to_sundry_flg"),
						S0_T1.pr("iv_no"),
						S0_T1.pr("pick_prnt_flg"),
						S0_T1.pr("ship_inst_prnt_flg"),
						S0_T1.pr("ship_adv_prnt_flg"),
						S0_T1.pr("intr_rmrks"),
						S0_T1.pr("inst_rmrks"),
						S0_T1.pr("sub_char1"),
						S0_T1.pr("sub_char2"),
						S0_T1.pr("sub_char3"),
						S0_T1.pr("via_dlv_typ"),
						bracket(
							subQuery()
							.select(countDistinct(S1_W.dlv_slip_no))
							.from(S1_W)
							.where(
								S1_W.ship_inst_no.eq(S0_T1.pr("ship_inst_no"))
							)
						).as("dlv_slip_num"),
						S0_T1.pr("ship_to_id_nm").as("org_ship_to_id_nm"),
						decode(
							S0_T1.pr("ship_to_id_typ"),
							value(MSC_SHIP_TO_ID_TYP.LOC.value()),
							nullValue(),
							S0_M6.prnt_lcl_cd
						).as("prnt_lcl_cd")
						,S0_M5.cntry_nm.as("ship_to_cntry_nm")
						,S0_M9.cntry_nm
					)
					.from(
						subQuery()
						.select(
							S0_W2.ship_inst_no,
							S0_W2.ship_inst_rev,
							S0_W2.ship_schd_tm,
							S0_W2.dlv_schd_tm,
							S0_W2.ship_inst_tm,
							S0_W2.ship_wk_cd,
							S0_W2.ship_term_cd,
							S0_W2.inst_dpt_cd,
							S0_W2.inst_usr_cd,
							S0_W2.ship_to_lg_grp_cd,
							S0_W2.ship_to_id_typ,
							S0_W2.ship_to_id_cd,
							S0_W2.ship_to_id_nm,
							S0_W2.ship_to_zip_cd,
							S0_W2.ship_to_addr1,
							S0_W2.ship_to_addr2,
							S0_W2.ship_to_addr3,
							S0_W2.ship_to_addr4,
							S0_W2.ship_to_cntct_dpt,
							S0_W2.ship_to_cntct_psn,
							S0_W2.ship_to_tel,
							S0_W2.ship_to_fax,
							S0_W2.ship_to_sundry_flg,
							S0_W2.iv_no,
							S0_W2.pick_prnt_flg,
							S0_W2.ship_inst_prnt_flg,
							S0_W2.ship_adv_prnt_flg,
							S0_W2.intr_rmrks,
							S0_W2.inst_rmrks,
							S0_W2.sub_char1,
							S0_W2.sub_char2,
							S0_W2.sub_char3,
							S0_W2.via_dlv_typ
						)
						.from(
							S0_W1
							.innerJoin(S0_W2).on(
								S0_W2.ship_inst_no.eq(S0_W1.ship_inst_no)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S0_W3.ship_inst_no,
								S0_W3.ship_inst_rev,
								S0_W3.ship_schd_tm,
								S0_W3.dlv_schd_tm,
								S0_W3.ship_inst_tm,
								S0_W3.ship_wk_cd,
								S0_W3.ship_term_cd,
								S0_W3.inst_dpt_cd,
								S0_W3.inst_usr_cd,
								S0_W3.ship_to_lg_grp_cd,
								S0_W3.ship_to_id_typ,
								S0_W3.ship_to_id_cd,
								S0_W3.ship_to_id_nm,
								S0_W3.ship_to_zip_cd,
								S0_W3.ship_to_addr1,
								S0_W3.ship_to_addr2,
								S0_W3.ship_to_addr3,
								S0_W3.ship_to_addr4,
								S0_W3.ship_to_cntct_dpt,
								S0_W3.ship_to_cntct_psn,
								S0_W3.ship_to_tel,
								S0_W3.ship_to_fax,
								S0_W3.ship_to_sundry_flg,
								S0_W3.iv_no,
								S0_W3.pick_prnt_flg,
								S0_W3.ship_inst_prnt_flg,
								S0_W3.ship_adv_prnt_flg,
								S0_W3.intr_rmrks,
								S0_W3.inst_rmrks,
								S0_W3.sub_char1,
								S0_W3.sub_char2,
								S0_W3.sub_char3,
								S0_W3.via_dlv_typ
							)
							.from(
								S0_W1
								.innerJoin(S0_W3).on(
									S0_W3.ship_inst_no.eq(S0_W1.ship_inst_no)
									.and(S0_W3.ship_inst_rev.eq(S0_W1.ship_inst_rev))
								)
							)
							.where(notExists(subQuery()
								.select(value("x"))
								.from(S0_W2)
								.where(
									S0_W2.ship_inst_no.eq(S0_W3.ship_inst_no)
									.and(S0_W1.ship_inst_rev.eq(S0_W3.ship_inst_rev))
								)
							))
						).view(S0_T1)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_inst_no.eq(S0_T1.pr("ship_inst_no"))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_wk_cd.eq(S0_T1.pr("ship_wk_cd"))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.ship_term_cd.eq(S0_T1.pr("ship_term_cd"))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.pr("inst_dpt_cd"))
								.and(S0_T1.pr("ship_inst_tm").between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.pr("inst_usr_cd"))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.ship_to_id_typ.eq(S0_T1.pr("ship_to_id_typ"))
								.and(S0_M5.ship_to_id_cd.eq(S0_T1.pr("ship_to_id_cd")))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bp_cd.eq(S0_M5.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.bp_cd.eq(S0_M5.sppl_cd)
							)
						)
						.crossJoin(S0_M8)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.cntry_cd.eq(S0_M8.cntry_cd)
							)
						)
					)
					.orderBy(S0_T1.pr("ship_inst_no").asc())
					.forUpdate(S0_T2.ship_inst_no)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_XFR_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_XFR_INST_D_S01() {
		MST_XFR_INST_D_R S0_T1 = MST_XFR_INST_D_R.create("T1");
		MSW_XFR_INST_KEY_R S0_W1 = MSW_XFR_INST_KEY_R.create("W1");
		MST_XFR_ALLOC_STS_R S0_T2 = MST_XFR_ALLOC_STS_R.create("T2");
		MST_XFR_INST_R S0_T3 = MST_XFR_INST_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_STK_GD_R S0_M3 = MAM_STK_GD_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_LG_GRP_R S0_M9 = MAM_LG_GRP_R.create("M9");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAVM_ITM_UNIT_R S0_M11 = MAVM_ITM_UNIT_R.create("M11");
		MAVM_ITM_UNIT_R S0_M12 = MAVM_ITM_UNIT_R.create("M12");
		MAM_USR_R S0_M13 = MAM_USR_R.create("M13");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_XFR_INST_D_Query_S01")
					.mainQuery()
					.select(
						value(MSC_TRN_TYP.XFR.value()).as("trn_typ"),
						S0_T1.xfr_inst_no,
						S0_T2.xfr_inst_d_no,
						nullValue().as("dlv_slip_no"),
						nullValue().as("dlv_slip_d_no"),
						S0_T3.lg_grp_cd,
						S0_M9.lg_grp_nm,
						S0_T3.xfr_inst_dt,
						S0_T3.xfr_schd_dt,
						S0_T3.inst_dpt_cd,
						S0_M14.dpt_nm.as("inst_dpt_nm"),
						S0_T3.inst_usr_cd,
						S0_M13.usr_nm.as("inst_usr_nm"),
						S0_T3.pick_prnt_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T2.quality_typ,
						S0_M3.gd_nm,
						S0_T2.gd_cd,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_M4.bp_nm.as("stk_bp_nm"),
						S0_M4.bp_alt_nm1.as("stk_bp_alt_nm1"),
						S0_M4.bp_alt_nm2.as("stk_bp_alt_nm2"),
						S0_M4.bp_alt_nm3.as("stk_bp_alt_nm3"),
						S0_M4.bp_alt_nm4.as("stk_bp_alt_nm4"),
						S0_T2.stk_bp_cd,
						S0_T2.inst_d_rmrks,
						S0_M5.loc_nm.as("gi_loc_nm"),
						S0_T2.gi_loc_cd,
						S0_M6.str_ln_nm.as("gi_str_ln_nm"),
						S0_T2.gi_str_ln_cd,
						S0_M10.str_ln_nm.as("gr_str_ln_nm"),
						S0_T2.gr_str_ln_cd,
						S0_T2.lot_no.as("lot_no_data"),
						S0_T2.sublot_no.as("sublot_no_data"),
						S0_T2.ver_no,
						S0_T2.alloc_sno1.as("sno1_data"),
						S0_T2.alloc_sno2.as("sno2_data"),
						S0_T2.alloc_sno3.as("sno3_data"),
						S0_T2.alloc_sno4.as("sno4_data"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T2.trd_unit_qty,
						S0_M7.unit_nm.as("trd_unit_nm"),
						S0_M11.dec_place.as("trd_unit_dec_place"),
						S0_T2.trd_unit_cd.as("trd_unit_cd"),
						S0_T2.base_unit_qty.as("base_unit_qty"),
						S0_M8.unit_nm.as("base_unit_nm"),
						S0_M12.dec_place.as("base_unit_dec_place"),
						S0_T2.base_unit_cd.as("base_unit_cd"),
						S0_T2.alloc_flg,
						S0_T2.inst_d_rmrks,
						S0_T2.disp_seq,
						S0_T2.sub_char1.as("d_sub_char1"),
						S0_T2.sub_char2.as("d_sub_char2"),
						S0_T2.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.xfr_inst_no.eq(S0_T1.xfr_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.xfr_inst_no.eq(S0_T1.xfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M2.sno1.eq(S0_T2.sno1))
								.and(S0_M2.sno2.eq(S0_T2.sno2))
								.and(S0_M2.sno3.eq(S0_T2.sno3))
								.and(S0_M2.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.gd_cd.eq(S0_T2.gd_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.bp_cd.eq(S0_T2.stk_bp_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.loc_cd.eq(S0_T2.gi_loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.loc_cd.eq(S0_T2.gi_loc_cd)
								.and(S0_M6.str_ln_cd.eq(S0_T2.gi_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.unit_cd.eq(S0_T2.trd_unit_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.unit_cd.eq(S0_T2.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.lg_grp_cd.eq(S0_T3.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.loc_cd.eq(S0_T2.gr_loc_cd)
								.and(S0_M10.str_ln_cd.eq(S0_T2.gr_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M11.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M11.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M11.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M11.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M12.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M12.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M12.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M12.unit_cd.eq(S0_T2.base_unit_cd))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.usr_cd.eq(S0_T3.inst_usr_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.dpt_cd.eq(S0_T3.inst_dpt_cd)
								.and(S0_T3.xfr_inst_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
					)
					.where(
						S0_T2.abort_flg.eq(value(false))
					)
					.orderBy(
						S0_T3.xfr_inst_no.asc(),
						S0_T2.disp_seq.asc(),
						S0_T2.xfr_inst_d_no.asc()
					)
					.forUpdate(S0_T3.xfr_inst_no)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_XFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_XFR_INST_S01() {
		MST_XFR_INST_R S0_T1 = MST_XFR_INST_R.create("T1");
		MSW_XFR_INST_KEY_R S0_W1 = MSW_XFR_INST_KEY_R.create("W1");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_CNTRY_R S0_M5 = MAM_CNTRY_R.create("M5");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_XFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.xfr_inst_no,
						S0_T1.trd_cd,
						S0_M1.trd_nm,
						S0_T1.xfr_inst_dt,
						S0_T1.xfr_schd_dt,
						S0_T1.inst_dpt_cd,
						S0_M3.dpt_nm.as("inst_dpt_nm"),
						S0_M3.tel.as("inst_tel"),
						S0_T1.inst_usr_cd,
						S0_M4.usr_nm.as("inst_usr_nm"),
						S0_T1.gr_loc_cd,
						S0_M2.loc_nm.as("gr_loc_nm"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						).as("zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							nullValue()
						).as("addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							nullValue()
						).as("addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							nullValue()
						).as("addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							nullValue()
						).as("addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T1.xfr_schd_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("fax"),
						S0_T1.inst_prnt_flg.as("xfr_inst_prnt_flg"),
						S0_T1.intr_rmrks,
						S0_T1.inst_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_M5.cntry_nm
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.xfr_inst_no.eq(S0_T1.xfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.trd_cd.eq(S0_T1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_T1.gr_loc_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.inst_dpt_cd)
								.and(S0_T1.xfr_inst_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.inst_usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
									S0_M5.cntry_cd.eq(S0_M2.cntry_cd)
							)
						)
					)
					.orderBy(S0_T1.xfr_inst_no.asc())
					.forUpdate(S0_T1.xfr_inst_no)
			);
	}
	/**
	 * -- MSBEL5550_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL5550_MST_IV_S01() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_IV_SHIP_INST_MAP_R S0_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_IVSHIPINSTMAP.ship_alloc_sts_no,
						S0_IVSHIPINSTMAP.ship_inst_fix_flg,
						S0_IV.xrate,
						S0_IV.ptax_xrate,
						S0_IV.via_dlv_typ,
						S0_IV.iv_ship_flg,
						S0_IVD.iv_d_no,
						S0_IVD.base_unit_qty,
						S0_IVD.trd_cur_upri,
						S0_IVD.interim_flg,
						S0_IVD.trd_cur_amt,
						S0_IVD.trd_cur_tax_amt,
						S0_IVD.trd_cur_dscnt_amt,
						S0_IVD.tax_cd
					)
					.from(
						S0_IV
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
								.and(S0_IV.iv_rev.eq(S0_IVD.iv_rev))
							)
						)
						.innerJoin(S0_IVMAP).on(S0_IVD.iv_d_no.eq(S0_IVMAP.iv_d_no))
						.innerJoin(S0_IVSHIPINSTMAP).on(S0_IVMAP.iv_d_no.eq(S0_IVSHIPINSTMAP.iv_d_no).and(S0_IVMAP.ship_schd_no.eq(S0_IVSHIPINSTMAP.ship_schd_no)))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_IVSHIPINSTMAP.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL5550_MST_IV_Query_S02
	 */
	static MCQueryPlan MSBEL5550_MST_IV_S02() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_IV_SHIP_ACT_MAP_R S0_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5550_MST_IV_Query_S02")
					.mainQuery()
					.select(
						S0_IVSHIPACTMAP.ship_act_d_no,
						S0_IVSHIPACTMAP.ship_act_fix_flg,
						S0_IV.xrate,
						S0_IV.ptax_xrate,
						S0_IV.via_dlv_typ,
						S0_IV.iv_ship_flg,
						S0_IVD.iv_d_no,
						S0_IVD.base_unit_qty,
						S0_IVD.trd_cur_upri,
						S0_IVD.interim_flg,
						S0_IVD.trd_cur_amt,
						S0_IVD.trd_cur_tax_amt,
						S0_IVD.trd_cur_dscnt_amt,
						S0_IVD.tax_cd
					)
					.from(
						S0_IV
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
								.and(S0_IV.iv_rev.eq(S0_IVD.iv_rev))
							)
						)
						.innerJoin(S0_IVMAP).on(S0_IVD.iv_d_no.eq(S0_IVMAP.iv_d_no))
						.innerJoin(S0_IVSHIPACTMAP).on(S0_IVMAP.iv_d_no.eq(S0_IVSHIPACTMAP.iv_d_no).and(S0_IVMAP.ship_schd_no.eq(S0_IVSHIPACTMAP.ship_schd_no)))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_IVSHIPACTMAP.ship_act_d_no.eq(bind("ship_act_d_no")))
					)
			);
	}
}