package mcframe.serverMSBD.MSBDL0180;

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
	 * -- MSBDL0180_MST_PURC_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBDL0180_MST_PURC_ACT_D_S01() {
		MST_PURC_ACT_D_R S0_T1 = MST_PURC_ACT_D_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MST_MFG_INST_R S0_T5 = MST_MFG_INST_R.create("T5");
		MST_ITM_MFG_INST_R S0_T6 = MST_ITM_MFG_INST_R.create("T6");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_ITM_LCL_R S0_M22 = MAM_ITM_LCL_R.create("M22");
		MAM_LOC_R S0_M38 = MAM_LOC_R.create("M38");
		MAM_DPT_R S0_M39 = MAM_DPT_R.create("M39");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0180_MST_PURC_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							S0_M19.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_M22.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M2.asset_mng_typ,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_M2.dscnt_itm_flg,
						S0_M2.lot_mng_typ,
						S0_M2.sublot_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_T1.sundry_itm_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.maker_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.pay_crryovr_times,
						S0_T1.rsn_cd.as("dscnt_rsn_cd"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_typ,
						S0_T1.ap_dpt_cd,
						S0_M33.dpt_nm.as("ap_dpt_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.mfg_inst_no,
						S0_T1.slo_no,
						S0_T1.po_no,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						nvl(
							S0_M38.asst_dpt_cd,
							S0_T1.bd_dpt_cd
						).as("bd_dpt_cd"),
						nvl2(
							S0_M38.asst_dpt_cd,
							S0_M39.dpt_nm,
							S0_M36.dpt_nm
						).as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						nullValue().as("purc_act_d_no"),
						nullValue().as("purc_act_d_seq"),
						S0_T1.purc_act_no.as("ref_purc_act_no"),
						S0_T2.purc_act_rev.as("ref_purc_act_rev"),
						S0_T1.purc_act_seq.as("ref_purc_act_seq"),
						S0_T1.purc_act_d_no.as("ref_purc_act_d_no"),
						S0_T1.purc_act_d_seq.as("ref_purc_act_d_seq"),
						S0_T2.ac_dt.as("base_purc_ac_dt"),
						S0_T2.ac_dt.as("act_ac_dt"),
						S0_T1.trd_unit_qty.as("act_unit_qty"),
						S0_T1.trd_unit_cd.as("act_unit_cd"),
						S0_T1.trd_cur_upri.as("act_cur_upri"),
						S0_T1.trd_cur_amt.as("act_cur_amt"),
						S0_T1.tax_cd.as("act_tax_cd"),
						S0_T1.trd_cur_tax_amt.as("act_cur_tax_amt"),
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("act_tax_amt"),
						S0_T2.po_no,
						S0_T1.disp_seq,
						// this field is appended by sql coverter.
						S0_T1.po_d_no.as("join_po_d_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
							.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.itm_mfg_inst_no.eq(S0_T6.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_M33).on(
							S0_T1.ap_dpt_cd.eq(S0_M33.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M33.st_dt, S0_M33.end_dt))
						)
						.leftOuterJoin(S0_M36).on(
							S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M36.st_dt, S0_M36.end_dt))
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T2.sppl_cd.eq(S0_M19.bp_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_M22.lcl_cd.eq(S0_M19.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M38).on(
							bracket(
								S0_T6.mfg_loc_cd.eq(S0_M38.loc_cd)
							)
						)
						.leftOuterJoin(S0_M39).on(
							bracket(
								S0_M38.asst_dpt_cd.eq(S0_M39.dpt_cd)
								.and(S0_T2.ac_dt.between(S0_M39.st_dt, S0_M39.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_act_no.eq(bind("purc_act_no")))
						.and(S0_T1.purc_act_seq.eq(bind("purc_act_seq")))
						.and(S0_T1.ncv_flg.eq(value(false)))
						.and(S0_T1.accpt_dfct_flg.eq(value(false)))
						.and(S0_T1.base_unit_qty.gt(value(0)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("join_po_d_no_")
						))
						.addSelect(m -> toArray(
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
					}),
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
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("act_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("act_tax_nm", m.tax_nm());
							r.setNumberNE("act_tax_rate", m.tax_rate());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0180_MST_PURC_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBDL0180_MST_PURC_ACT_D_S02() {
		MST_PURC_ACT_D_R S0_T1 = MST_PURC_ACT_D_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MST_PURC_ACT_R S0_T91 = MST_PURC_ACT_R.create("T91");
		MST_PURC_ACT_D_R S0_T92 = MST_PURC_ACT_D_R.create("T92");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_ITM_LCL_R S0_M22 = MAM_ITM_LCL_R.create("M22");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0180_MST_PURC_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							S0_M6.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_M22.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M2.asset_mng_typ,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_M2.dscnt_itm_flg,
						S0_M2.lot_mng_typ,
						S0_M2.sublot_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_T1.sundry_itm_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.maker_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.purc_dtl_upd_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.pay_crryovr_times,
						S0_T1.rsn_cd.as("dscnt_rsn_cd"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_typ,
						S0_T1.ap_dpt_cd,
						S0_M33.dpt_nm.as("ap_dpt_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.mfg_inst_no,
						S0_T1.slo_no,
						S0_T1.po_no,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.ref_purc_act_no,
						S0_T91.purc_act_rev.as("ref_purc_act_rev"),
						S0_T1.ref_purc_act_seq,
						S0_T1.ref_purc_act_d_no,
						S0_T1.ref_purc_act_d_seq,
						S0_T1.base_purc_ac_dt,
						S0_T91.ac_dt.as("act_ac_dt"),
						S0_T92.trd_unit_qty.as("act_unit_qty"),
						S0_T92.trd_unit_cd.as("act_unit_cd"),
						S0_T92.trd_cur_upri.as("act_cur_upri"),
						S0_T92.trd_cur_amt.as("act_cur_amt"),
						S0_T92.tax_cd.as("act_tax_cd"),
						S0_T92.trd_cur_tax_amt.as("act_cur_tax_amt"),
						S0_T92.trd_cur_amt.add(S0_T92.trd_cur_tax_amt).as("act_tax_amt"),
						S0_T1.disp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
							.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
						)
						.leftOuterJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_M33).on(
							S0_T1.ap_dpt_cd.eq(S0_M33.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M33.st_dt, S0_M33.end_dt))
						)
						.leftOuterJoin(S0_M36).on(
							S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M36.st_dt, S0_M36.end_dt))
						)
						.leftOuterJoin(S0_T91).on(
							S0_T1.ref_purc_act_no.eq(S0_T91.purc_act_no)
							.and(S0_T1.ref_purc_act_seq.eq(S0_T91.purc_act_seq))
						)
						.leftOuterJoin(S0_T92).on(
							S0_T1.ref_purc_act_d_no.eq(S0_T92.purc_act_d_no)
							.and(S0_T1.ref_purc_act_d_seq.eq(S0_T92.purc_act_d_seq))
							.and(S0_T91.purc_act_no.eq(S0_T92.purc_act_no))
							.and(S0_T91.purc_act_seq.eq(S0_T92.purc_act_seq))
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.sppl_cd.eq(S0_M6.bp_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_M22.lcl_cd.eq(S0_M6.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_act_no.eq(bind("purc_act_no")))
						.and(S0_T1.purc_act_seq.eq(bind("purc_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
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
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("act_tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("act_tax_nm", m.tax_nm());
							r.setNumberNE("act_tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("act_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0180_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0180_MST_PURC_ACT_S01() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MAVM_RD_DPT_R S0_M14 = MAVM_RD_DPT_R.create("M14");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0180_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.purc_act_no,
						S0_T1.purc_act_rev,
						S0_T1.purc_act_seq,
						nullValue().as("purc_dt"),
						nullValue().as("ac_dt"),
						nullValue().as("ac_ym"),
						nullValue().as("pay_basis_dt"),
						S0_T1.sppl_cd,
						S0_M18.bp_nm.as("sppl_nm"),
						S0_M18.cntry_cd.as("sppl_cntry_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						S0_M18.sppl_iv_flg,
						S0_M18.prnt_lcl_cd,
						S0_M18.purc_amt_rnd_typ,
						S0_M18.purc_tax_rnd_typ,
						S0_M18.purc_tax_calc_typ,
						S0_M18.pay_crryovr_times.as("sppl_pay_crryovr_times"),
						nullValue().as("rcpt_iv_no"),
						S0_T1.rcpt_iv_no.as("ref_rcpt_iv_no"),
						nullValue().as("pay_schd_dt"),
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_M11.ap_dpt_flg,
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.base_cur_cd,
						nullValue().as("ptax_dt"),
						S0_T1.ptax_xrate,
						S0_T1.ptax_cur_cd,
						S0_M18.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M18.asppl_cd,
							bind("today"),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_M18.asppl_cd,
							bind("today"),
							value(false)
						).as("ap_dpt_cd"),
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						nullValue().as("ins_usr_id"),
						nullValue().as("ins_usr_nm"),
						nullValue().as("ins_func_id"),
						nullValue().as("ins_ts"),
						nullValue().as("upd_cntr"),
						nullValue().as("upd_usr_id"),
						nullValue().as("upd_usr_nm"),
						nullValue().as("upd_func_id"),
						nullValue().as("upd_ts"),
						nullValue().as("upd_srv_req_no"),
						// this field is appended by sql coverter.
						S0_M11.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_M14).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M14.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd))
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.purc_act_rev.eq(bind("rev_no")))
						.and(
							S0_T1.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
								value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value())
							)
						)
						.and(
							S0_T1.slip_sts_typ.in(
								value(MAC_SLIP_STS_TYP.CRT.value()),
								value(MAC_SLIP_STS_TYP.DIS.value())
							)
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
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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
	 * -- MSBDL0180_MST_PURC_ACT_Query_S02
	 */
	static MCQueryPlan MSBDL0180_MST_PURC_ACT_S02() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MAVM_RD_DPT_R S0_M14 = MAVM_RD_DPT_R.create("M14");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MST_PURC_ACT_R S1 = MST_PURC_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0180_MST_PURC_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.purc_act_no,
						S0_T1.purc_act_rev,
						S0_T1.purc_act_seq,
						decode(
							S0_T1.purc_act_rev,
							S0_T2.pr("max_rev"),
							value(1),
							value(0)
						).as("latest_flg"),
						decode(
							S0_T1.purc_act_rev,
							S0_T2.pr("max_rev"),
							decode(
								S0_T1.slip_sts_typ,
								value(MAC_SLIP_STS_TYP.CRT.value()),
								value(0),
								value(1)
							),
							value(0)
						).as("can_flg"),
						S0_T1.purc_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.pay_basis_dt,
						S0_T1.sppl_cd,
						S0_M18.bp_nm.as("sppl_nm"),
						S0_M18.cntry_cd.as("sppl_cntry_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						S0_M18.sppl_iv_flg,
						S0_M18.prnt_lcl_cd,
						S0_M18.purc_amt_rnd_typ,
						S0_M18.purc_tax_rnd_typ,
						S0_M18.purc_tax_calc_typ,
						S0_M18.pay_crryovr_times.as("sppl_pay_crryovr_times"),
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.pay_schd_dt,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_M11.ap_dpt_flg,
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.base_cur_cd,
						S0_T1.ptax_dt,
						S0_T1.ptax_xrate,
						S0_T1.ptax_cur_cd,
						S0_M18.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M18.asppl_cd,
							S0_T1.ac_dt,
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_M18.asppl_cd,
							S0_T1.ac_dt,
							value(false)
						).as("ap_dpt_cd"),
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
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
						// this field is appended by sql coverter.
						S0_M11.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1.purc_act_no,
								max(S1.purc_act_rev).as("max_rev")
							)
							.from(S1)
							.groupBy(S1.purc_act_no).view(S0_T2)
						).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T2.pr(S1.purc_act_no))
							)
						)
						.innerJoin(S0_M14).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M14.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd))
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.purc_act_rev.eq(bind("rev_no")))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
								value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value())
							)
						)
						.and(
							S0_T1.slip_sts_typ.in(
								value(MAC_SLIP_STS_TYP.CRT.value()),
								value(MAC_SLIP_STS_TYP.DIS.value())
							)
						)
						.and(
							bracket(
								S0_T2.pr("max_rev").eq(bind("rev_no"))
								.and(S0_T1.purc_act_rev.eq(S0_T2.pr("max_rev")))
							)
							.or(
								S0_T2.pr("max_rev").neq(bind("rev_no"))
								.and(S0_T1.purc_act_rev.eq(bind("rev_no")))
							)
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
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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