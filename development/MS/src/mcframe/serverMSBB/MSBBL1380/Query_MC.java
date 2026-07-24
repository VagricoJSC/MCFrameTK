package mcframe.serverMSBB.MSBBL1380;

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
	 * -- MSBBL1380_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1380_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MST_SLS_ACT_D_R S0_R2 = MST_SLS_ACT_D_R.create("R2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1380_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
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
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sundry_itm_flg,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_T2.base_unit_qty,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_tax_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.tax_cd,
						S0_T2.base_cur_upri,
						S0_T2.base_cur_amt,
						S0_T2.base_cur_tax_amt,
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_amt,
						S0_T2.ptax_cur_tax_amt,
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T2.rsn_cd.as("dscnt_rsn_cd"),
						S0_T2.bill_crryovr_times,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.wrk_no,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.sls_act_d_no,
						S0_T2.sls_act_d_seq,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_seq,
						S0_T2.ref_sls_act_d_no,
						S0_T2.ref_sls_act_d_seq,
						S0_T2.base_sls_ac_dt,
						S0_R2.trd_unit_qty.as("ref_trd_unit_qty"),
						S0_R2.trd_unit_cd.as("ref_trd_unit_cd"),
						S0_R2.trd_cur_upri.as("ref_trd_cur_upri"),
						S0_R2.trd_cur_amt.as("ref_trd_cur_amt"),
						bracket(
							S0_R2.trd_cur_amt.add(S0_R2.trd_cur_tax_amt)
						).as("ref_trd_cur_inc_tax_amt"),
						S0_R2.tax_cd.as("ref_tax_cd"),
						S0_R2.trd_cur_tax_amt.as("ref_trd_cur_tax_amt"),
						S0_R2.base_cur_upri.as("ref_base_cur_upri"),
						S0_R2.base_cur_amt.as("ref_base_cur_amt"),
						bracket(
							S0_R2.base_cur_amt.add(S0_R2.base_cur_tax_amt)
						).as("ref_base_cur_inc_tax_amt"),
						S0_R2.base_cur_tax_amt.as("ref_base_cur_tax_amt"),
						S0_R2.ptax_cur_upri.as("ref_ptax_cur_upri"),
						S0_R2.ptax_cur_amt.as("ref_ptax_cur_amt"),
						bracket(
							S0_R2.ptax_cur_amt.add(S0_R2.ptax_cur_tax_amt)
						).as("ref_ptax_cur_inc_tax_amt"),
						S0_R2.ptax_cur_tax_amt.as("ref_ptax_cur_tax_amt"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_T2.disp_seq,
						S0_R2.itm_cd.as("join_itm_cd_"),
						S0_R2.itm_sub1.as("join_itm_sub1_"),
						S0_R2.itm_sub2.as("join_itm_sub2_"),
						S0_R2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(bind("prnt_lcl_cd").eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.trd_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_R2).on(
							bracket(
								S0_T2.ref_sls_act_d_no.eq(S0_R2.sls_act_d_no)
								.and(S0_T2.ref_sls_act_d_seq.eq(S0_R2.sls_act_d_seq))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T2.disp_seq.asc())
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
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_SLS_ACT_R.class, r -> toCondition(
							r.getStringNE("ref_sls_act_no"),
							r.getNumberNE("ref_sls_act_seq")
						))
						.addSelect(m -> toArray(
							m.ac_dt,
							m.sls_act_rev
						))
						.addMap((r, m) -> {
							r.setNumberNE("ref_sls_act_rev", m.sls_act_rev());
							r.setDateNE("ref_ac_dt", m.ac_dt());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("ref_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ref_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("ref_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("ref_trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("ref_tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("ref_tax_nm", m.tax_nm());
							r.setNumberNE("ref_tax_rate", m.tax_rate());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1380_SLS_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBBL1380_SLS_ACT_D_S02() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_BIZ_RSN_R S0_RSN = MAM_BIZ_RSN_R.create("RSN");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1380_SLS_ACT_D_Query_S02")
					.mainQuery()
					.select(
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
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sundry_itm_flg,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_T2.tax_cd,
						nullValue().as("dscnt_rsn_cd"),
						nullValue().as("dscnt_rsn_nm"),
						S0_T2.bill_crryovr_times,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.wrk_no,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T1.sls_act_no.as("ref_sls_act_no"),
						S0_T1.sls_act_rev.as("ref_sls_act_rev"),
						S0_T1.sls_act_seq.as("ref_sls_act_seq"),
						S0_T2.sls_act_d_no.as("ref_sls_act_d_no"),
						S0_T2.sls_act_d_seq.as("ref_sls_act_d_seq"),
						S0_T1.ac_dt.as("base_sls_ac_dt"),
						S0_T1.ac_dt.as("ref_ac_dt"),
						S0_T2.trd_unit_qty.as("ref_trd_unit_qty"),
						S0_T2.trd_unit_cd.as("ref_trd_unit_cd"),
						S0_T2.trd_cur_upri.as("ref_trd_cur_upri"),
						S0_T2.trd_cur_amt.as("ref_trd_cur_amt"),
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("ref_trd_cur_inc_tax_amt"),
						S0_T2.tax_cd.as("ref_tax_cd"),
						S0_T2.trd_cur_tax_amt.as("ref_trd_cur_tax_amt"),
						S0_T2.base_cur_upri.as("ref_base_cur_upri"),
						S0_T2.base_cur_amt.as("ref_base_cur_amt"),
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("ref_base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt.as("ref_base_cur_tax_amt"),
						S0_T2.ptax_cur_upri.as("ref_ptax_cur_upri"),
						S0_T2.ptax_cur_amt.as("ref_ptax_cur_amt"),
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ref_ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt.as("ref_ptax_cur_tax_amt"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_T2.disp_seq,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_qty
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(bind("prnt_lcl_cd").eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.trd_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_RSN).on(
							bracket(
								S0_T2.rsn_cd.eq(S0_RSN.biz_rsn_cd)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
						.and(
							S0_T2.rsn_cd.isNull()
							.or(S0_RSN.sls_acxfr_flg.eq(value(false)))
						)
						.and(S0_ITM.dscnt_itm_flg.eq(value(false)))
					)
					.orderBy(S0_T2.disp_seq.asc())
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
							r.setStringNE("ref_trd_unit_nm", m.unit_nm());
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
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("ref_trd_unit_dec_place", m.dec_place());
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
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("ref_tax_nm", m.tax_nm());
							r.setNumberNE("ref_tax_rate", m.tax_rate());
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
	
	/*
	 * MSBBL1380_SLS_ACT_S01
	 */
	static MCQueryPlan MSBBL1380_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MBT_APRV_R S0_APRV = MBT_APRV_R.create("APRV");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MCTempView S0_T1 = createTempView("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_DLV_SLIP_R S1_X = MST_DLV_SLIP_R.create("X");
		MST_SLS_ACT_R S5 = MST_SLS_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1380_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_T.trd_ptn_typ,
						S0_T.ac_ym,
						S0_T.sls_act_no,
						S0_T.sls_act_rev,
						S0_T.sls_act_seq,
						S0_T.dlv_slip_no,
						S0_T.sls_dt,
						S0_T.ac_dt,
						S0_T.bill_basis_dt,
						nullValue().as("can_ac_dt"),
						cases()
							.when(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_X)
									.where(
										S1_X.dlv_slip_no.eq(S0_T.dlv_slip_no)
										.and(
											S1_X.dlv_slip_seq.eq(
												S0_T.dlv_slip_seq.add(
													decode(
														S0_T.sls_act_rev,
														S0_T1.pr("max_rev"),
														decode(
															S0_T.slip_sts_typ,
															value(MAC_SLIP_STS_TYP.DIS.value()),
															value(1),
															value(0)
														),
														value(0)
													)
												)
											)
										)
										.and(S1_X.sls_prnt_flg.eq(value(true)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("sls_slip_prnted_flg"),
						S0_T.aprv_flg,
						S0_T.aprv_no,
						S0_T.aprv_sts_typ,
						S0_APRV.aprv_upd_flg,
						S0_APRV.aprv_can_flg,
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no,
						S0_T.ref_iv_no,
						S0_T.rcv_schd_dt,
						S0_T.trd_cur_cd,
						S0_T.base_cur_cd,
						S0_T.xrate,
						S0_T.xrate_cd,
						S0_T.ptax_cur_cd,
						S0_T.ptax_xrate,
						S0_T.cst_po_no,
						S0_T.acst_cd,
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_T.trd_rmrks,
						S0_T.intr_rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr,
						S0_T.slip_sts_typ,
						bracket(
							S0_T.dlv_slip_seq.add(
								decode(
									S0_T.sls_act_rev,
									S0_T1.pr("max_rev"),
									decode(
										S0_T.slip_sts_typ,
										value(MAC_SLIP_STS_TYP.DIS.value()),
										value(1),
										value(0)
									),
									value(0)
								)
							)
						).as("dlv_slip_seq"),
						S0_T.bcst_cd.as("join_bcst_cd_")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_APRV).on(
							bracket(
								S0_T.aprv_no.eq(S0_APRV.aprv_no)
								.and(S0_APRV.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S5.sls_act_no,
								max(S5.sls_act_rev).as("max_rev"),
								max(S5.sls_act_seq).as("max_seq")
							)
							.from(S5)
							.groupBy(S5.sls_act_no).view(S0_T1)
						).on(
							bracket(
								S0_T.sls_act_no.eq(S0_T1.pr(S5.sls_act_no))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.SLS_XTRA.value())
							)
						)
						.cutoff$and(
							S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T.sls_act_rev.eq(bind("srch_tgt_rev"))
							.and(S0_T.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.prnt_lcl_cd,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1380_SLS_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1380_SLS_ACT_S02() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1380_SLS_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T.sls_act_no,
						S0_T.sls_act_seq,
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						nullValue().as("iv_no"),
						S0_T.iv_no.as("ref_iv_no"),
						S0_T.trd_cur_cd,
						S0_T.base_cur_cd,
						S0_T.xrate,
						S0_T.xrate_cd,
						S0_T.ptax_cur_cd,
						S0_T.ptax_xrate,
						S0_T.cst_po_no,
						S0_T.acst_cd,
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3
					)
					.from(
						S0_T
						.leftOuterJoin(S0_TRD).on(
							bracket(
								S0_T.trd_cd.eq(S0_TRD.trd_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(
							S0_T.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.and(S0_T.sls_adjst_typ.isNull())
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.prnt_lcl_cd,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
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
							r.getStringNE("base_cur_cd")
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
					})
				)
			);
	}
}