package mcframe.serverMSBC.MSBCL6090;

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
	 * -- MSBCL6090_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_INPT_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_T1 = MSW_MFG_ACT_KEY_R.create("T1");
		MST_MFG_ACT_R S0_T5 = MST_MFG_ACT_R.create("T5");
		MST_MFG_INST_R S0_T6 = MST_MFG_INST_R.create("T6");
		MST_OPER_INST_R S0_T7 = MST_OPER_INST_R.create("T7");
		MST_OPER_ACT_R S0_T2 = MST_OPER_ACT_R.create("T2");
		MST_INPT_ACT_R S0_T3 = MST_INPT_ACT_R.create("T3");
		MST_INPT_ACT_REM_R S0_T8 = MST_INPT_ACT_REM_R.create("T8");
		MST_INPT_SCHD_R S0_T4 = MST_INPT_SCHD_R.create("T4");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAM_ALT_GRP_R S0_M6 = MAM_ALT_GRP_R.create("M6");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_INPT_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.mfg_act_no,
						S0_T2.oper_act_no,
						S0_T3.itm_cd.as("inpt_act_itm_cd"),
						S0_T3.itm_sub1.as("inpt_act_itm_sub1_data"),
						S0_T3.itm_sub2.as("inpt_act_itm_sub2_data"),
						S0_T3.itm_sub3.as("inpt_act_itm_sub3_data"),
						S0_T3.inpt_act_no,
						nvl(
							S0_M5.itm_nm,
							S0_M3.itm_nm
						).as("inpt_act_itm_nm"),
						S0_M3.itm_alt_nm1.as("inpt_itm_alt_nm1"),
						S0_M3.itm_alt_nm2.as("inpt_itm_alt_nm2"),
						S0_M3.itm_alt_nm3.as("inpt_itm_alt_nm3"),
						S0_M3.itm_alt_nm4.as("inpt_itm_alt_nm4"),
						S0_T4.alt_grp_cd,
						S0_M6.alt_grp_nm,
						S0_T4.disp_seq,
						S0_T3.lot_no.as("inpt_act_lot_no_data"),
						S0_T3.sublot_no.as("inpt_act_sublot_no_data"),
						S0_T3.sno1.as("inpt_sno1_data"),
						S0_T3.sno2.as("inpt_sno2_data"),
						S0_T3.sno3.as("inpt_sno3_data"),
						S0_T3.sno4.as("inpt_sno4_data"),
						S0_T4.base_unit_inpt_qty.as("base_unit_inpt_inst_qty"),
						S0_T8.base_unit_inpt_qty.as("base_unit_inpt_schd_qty"),
						S0_T8.base_unit_rqmt_qty.as("base_unit_inpt_rqmt_qty"),
						S0_T8.base_unit_fxd_rqmt_qty.as("base_unit_inpt_fxd_rqmt_qty"),
						S0_T3.base_unit_inpt_qty.as("base_unit_inpt_act_qty"),
						S0_T3.base_unit_loss_qty.as("base_unit_loss_qty"),
						S0_T3.base_unit_fxd_loss_qty.as("base_unit_fxd_loss_qty"),
						S0_T8.cont_inpt_qty,
						S0_T8.cont_rqmt_qty.as("cont_inpt_rqmt_qty"),
						S0_T8.cont_fxd_rqmt_qty.as("cont_inpt_fxd_rqmt_qty"),
						S0_T3.cont_qty,
						S0_T3.cont_loss_qty,
						S0_T3.cont_fxd_loss_qty,
						S0_T3.base_unit_cd,
						S0_T3.cont_fctr_unit_cd,
						S0_T3.act_cont_fctr,
						S0_M3.cont_fctr_rnd_typ.as("cont_fctr_rnd_typ"),
						S0_M3.cont_fctr_dec_place.as("cont_fctr_unit_dec_place"),
						S0_T3.act_rpt_rmrks.as("inpt_act_rpt_rmrks"),
						trunc(
							S0_T3.act_tm,
							MCDateFmt.DD
						).as("inpt_act_dt"),
						S0_T3.act_tm.as("inpt_act_hm"),
						S0_T4.inpt_schd_no,
						S0_T3.ver_no,
						S0_T3.sub_char1.as("inpt_act_sub_char1"),
						S0_T3.sub_char2.as("inpt_act_sub_char2"),
						S0_T3.sub_char3.as("inpt_act_sub_char3")
					)
					.from(
						S0_T1
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T7.mfg_inst_no.eq(S0_T6.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_act_no.eq(S0_T5.mfg_act_no)
								.and(S0_T2.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no))
								.and(S0_T2.div_seq.eq(S0_T5.div_seq))
								.and(S0_T2.oper_inst_no.eq(S0_T7.oper_inst_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_T5.mfg_act_no)
								.and(S0_T3.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no))
								.and(S0_T3.div_seq.eq(S0_T5.div_seq))
								.and(S0_T3.oper_act_no.eq(S0_T2.oper_act_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.div_seq.eq(S0_T2.div_seq)
								.and(S0_T8.mfg_inst_no.eq(S0_T5.mfg_inst_no))
								.and(S0_T8.itm_mfg_inst_no.eq(S0_T6.itm_mfg_inst_no))
								.and(S0_T8.oper_inst_no.eq(S0_T7.oper_inst_no))
								.and(S0_T8.inpt_schd_no.eq(S0_T3.inpt_schd_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.inpt_schd_no.eq(S0_T8.inpt_schd_no)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M3.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M3.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M3.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M5.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M5.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M5.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_M5.sno1.eq(S0_T3.sno1))
								.and(S0_M5.sno2.eq(S0_T3.sno2))
								.and(S0_M5.sno3.eq(S0_T3.sno3))
								.and(S0_M5.sno4.eq(S0_T3.sno4))
							)
						)
						.leftOuterJoin(LOC).on(
							bracket(
								S0_T4.inpt_loc_cd.eq(LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.alt_grp_cd.eq(S0_T4.alt_grp_cd)
								.and(S0_M6.wg_cd.eq(LOC.wg_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T6.can_flg.eq(value(false)))
						.and(S0_T7.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("inpt_act_itm_cd"),
							r.getStringNE("inpt_act_itm_sub1_data"),
							r.getStringNE("inpt_act_itm_sub2_data"),
							r.getStringNE("inpt_act_itm_sub3_data"),
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
	 * -- MSBCL6090_MST_INPT_SCHD_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_INPT_SCHD_ALL_R_S01() {
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_UNIT_R S0M3 = MAM_UNIT_R.create("M3");
		MAM_ALT_GRP_R S0M4 = MAM_ALT_GRP_R.create("M4");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");

		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S0T2 = createTempView("T2");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
		
		
		return createQueryPlan().setQuery(sql("MSBCL6090_MST_INPT_SCHD_ALL_R_S01")
				.mainQuery()
				.select(S0T2.pr("mfg_inst_no"), S0T2.pr("oper_inst_no"),
						S0T2.pr("inpt_schd_no"),
						bind("mfg_inst_rev").as("mfg_inst_rev_no"),
						S0T2.pr("itm_cd").as("d_itm_cd"),
						S0T2.pr("itm_sub1").as("d_itm_sub1_data"),
						S0T2.pr("itm_sub2").as("d_itm_sub2_data"),
						S0T2.pr("itm_sub3").as("d_itm_sub3_data"),
						nvl(S0M2.itm_nm, S0M1.itm_nm).as("d_itm_nm"),
						S0M1.itm_alt_nm1.as("d_itm_alt_nm1"),
						S0M1.itm_alt_nm2.as("d_itm_alt_nm2"),
						S0M1.itm_alt_nm3.as("d_itm_alt_nm3"),
						S0M1.itm_alt_nm4.as("d_itm_alt_nm4"), S0T2.pr("alt_grp_cd"),
						S0M4.alt_grp_nm, bind("mfg_inst_rev").as("d_mfg_inst_rev_no"),
						trunc(
								S0T2.pr("schd_tm"),
								MCDateFmt.DD
							).as("schd_dt"),
						S0T2.pr("schd_tm").as("schd_hm"), S0T2.pr("base_unit_inpt_qty"),
						S0T2.pr("base_unit_rqmt_qty"), S0T2.pr("base_unit_fxd_rqmt_qty"),
						S0T2.pr("base_unit_cd"), S0M3.unit_nm.as("base_unit_nm"),
						S0M3.dec_place.as("base_unit_dec_place"), S0T2.pr("bom_id_no"),
						S0T2.pr("par_inst_qty"), S0T2.pr("chd_inpt_qty"),
						S0T2.pr("chd_rqmt_qty"), S0T2.pr("fxd_chd_rqmt_qty"),
						S0T2.pr("in_offst_typ"), S0T2.pr("in_offst"),
						S0T2.pr("disp_seq").as("d_disp_seq"), S0T2.pr("alt_grp_cd"),
						S0T2.pr("alt_grp_seq"), S0T2.pr("inpt_ctl_typ"))
				.from(addDynamicView(REP1).leftOuterJoin(S0M1)
						.on(bracket(S0M1.itm_cd.eq(S0T2.pr("itm_cd"))
								.and(S0M1.itm_sub1.eq(S0T2.pr("itm_sub1")))
								.and(S0M1.itm_sub2.eq(S0T2.pr("itm_sub2")))
								.and(S0M1.itm_sub3.eq(S0T2.pr("itm_sub3")))))
						.leftOuterJoin(S0M2)
						.on(bracket(S0T2.pr("itm_cd").eq(S0M2.itm_cd)
								.and(S0T2.pr("itm_sub1").eq(S0M2.itm_sub1))
								.and(S0T2.pr("itm_sub2").eq(S0M2.itm_sub2))
								.and(S0T2.pr("itm_sub3").eq(S0M2.itm_sub3))
								.and(S0T2.pr("sno1").eq(S0M2.sno1))
								.and(S0T2.pr("sno2").eq(S0M2.sno2))
								.and(S0T2.pr("sno3").eq(S0M2.sno3))
								.and(S0T2.pr("sno4").eq(S0M2.sno4))))
						.leftOuterJoin(S0M3)
						.on(bracket(S0M3.unit_cd.eq(S0T2.pr("base_unit_cd"))))
						.leftOuterJoin(LOC).on(S0T2.pr("inpt_loc_cd").eq(LOC.loc_cd))
						.leftOuterJoin(S0M4)
						.on(bracket(S0M4.alt_grp_cd.eq(S0T2.pr("alt_grp_cd"))
								.and(S0M4.wg_cd.eq(LOC.wg_cd)))))
				.where(value(0).eq(value(0)).addDynamicPredicate(REP2)
						.and(S0T2.pr("can_flg").eq(value(false)))));
	}
	
	/**
	 * -- MSBCL6090_MST_INPT_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_INPT_SCHD_S01() {
		MSW_MFG_INST_KEY_R S0_T1 = MSW_MFG_INST_KEY_R.create("T1");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAM_ALT_GRP_R S0_M6 = MAM_ALT_GRP_R.create("M6");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_INPT_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.mfg_inst_no,
						S0_T3.oper_inst_no,
						S0_T3.disp_seq,
						S0_T3.inpt_schd_no,
						S0_T3.alt_grp_cd,
						S0_T3.alt_grp_seq,
						S0_T3.inpt_ctl_typ,
						S0_T3.itm_cd.as("s_inpt_itm_cd"),
						S0_T3.itm_sub1.as("s_inpt_itm_sub1_data"),
						S0_T3.itm_sub2.as("s_inpt_itm_sub2_data"),
						S0_T3.itm_sub3.as("s_inpt_itm_sub3_data"),
						nvl(
							S0_M5.itm_nm,
							S0_M3.itm_nm
						).as("s_inpt_itm_nm"),
						S0_M3.itm_alt_nm1.as("s_inpt_itm_alt_nm1"),
						S0_M3.itm_alt_nm2.as("s_inpt_itm_alt_nm2"),
						S0_M3.itm_alt_nm3.as("s_inpt_itm_alt_nm3"),
						S0_M3.itm_alt_nm4.as("s_inpt_itm_alt_nm4"),
						S0_T3.alt_grp_cd,
						S0_M6.alt_grp_nm,
						S0_T3.lot_no.as("inpt_lot_no_data"),
						S0_T3.sublot_no.as("inpt_sublot_no_data"),
						S0_T3.sno1.as("inpt_sno1_data"),
						S0_T3.sno2.as("inpt_sno2_data"),
						S0_T3.sno3.as("inpt_sno3_data"),
						S0_T3.sno4.as("inpt_sno4_data"),
						S0_T3.base_unit_inpt_qty,
						S0_T3.base_unit_rqmt_qty,
						S0_T3.base_unit_fxd_rqmt_qty,
						S0_T3.base_unit_cd.as("d_base_unit_cd"),
						S0_T3.cont_inpt_qty,
						S0_T3.cont_rqmt_qty,
						S0_T3.cont_fxd_rqmt_qty,
						S0_T3.cont_fctr_unit_cd,
						S0_M3.cont_fctr_dec_place.as("cont_fctr_unit_dec_place"),
						S0_T3.inst_rpt_rmrks.as("inpt_inst_rmrks"),
						trunc(
							S0_T3.schd_tm,
							MCDateFmt.DD
						).as("inpt_inst_dt"),
						S0_T3.schd_tm.as("inpt_inst_hm"),
						S0_T3.ver_no.as("inpt_ver_no"),
						S0_T3.alloc_flg,
						S0_T3.disp_seq.as("inpt_schd_disp_seq"),
						S0_T3.sub_char1.as("inpt_schd_sub_char1"),
						S0_T3.sub_char2.as("inpt_schd_sub_char2"),
						S0_T3.sub_char3.as("inpt_schd_sub_char3")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T3.oper_inst_no.eq(S0_T2.oper_inst_no))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M3.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M3.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M3.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M5.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M5.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M5.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_M5.sno1.eq(S0_T3.sno1))
								.and(S0_M5.sno2.eq(S0_T3.sno2))
								.and(S0_M5.sno3.eq(S0_T3.sno3))
								.and(S0_M5.sno4.eq(S0_T3.sno4))
							)
						)
						.leftOuterJoin(LOC).on(
							bracket(
								S0_T3.inpt_loc_cd.eq(LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.alt_grp_cd.eq(S0_T3.alt_grp_cd)
								.and(S0_M6.wg_cd.eq(LOC.wg_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T3.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("d_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("d_base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("s_inpt_itm_cd"),
							r.getStringNE("s_inpt_itm_sub1_data"),
							r.getStringNE("s_inpt_itm_sub2_data"),
							r.getStringNE("s_inpt_itm_sub3_data"),
							r.getStringNE("d_base_unit_cd")
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
	 * -- MSBCL6090_MST_MFG_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_MFG_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MST_MFG_ACT_R S0_T1 = MST_MFG_ACT_R.create("T1");
		MST_OPER_ACT_R S0_T2 = MST_OPER_ACT_R.create("T2");
		MST_OPER_INST_R S0_T4 = MST_OPER_INST_R.create("T4");
		MST_MFG_INST_R S0_T5 = MST_MFG_INST_R.create("T5");
		MST_ITM_MFG_INST_R S0_T6 = MST_ITM_MFG_INST_R.create("T6");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MST_MFG_ACT_REM_R S0_T7 = MST_MFG_ACT_REM_R.create("T7");
		MST_OPER_ACT_REM_R S0_T8 = MST_OPER_ACT_REM_R.create("T8");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_MFG_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mfg_inst_no,
						S0_T1.div_seq,
						S0_T2.oper_inst_no,
						S0_T1.mfg_act_no,
						S0_T2.oper_act_no,
						S0_T4.oper_cd,
						S0_T4.disp_seq,
						S0_T4.oper_loc_cd,
						S0_T4.oper_str_ln_cd,
						trunc(
							S0_T2.st_act_tm,
							MCDateFmt.DD
						).as("oper_st_act_dt"),
						S0_T2.st_act_tm.as("oper_st_act_hm"),
						trunc(
							S0_T2.end_act_tm,
							MCDateFmt.DD
						).as("oper_end_act_dt"),
						S0_T2.end_act_tm.as("oper_end_act_hm"),
						S0_T4.base_unit_qty.as("oper_base_unit_qty"),
						S0_T8.base_unit_qty.as("oper_base_unit_mfg_qty"),
						S0_T4.oper_std_qty,
						S0_T4.oper_conv_qty,
						S0_T4.oper_unit_conv_rnd_typ,
						S0_T4.oper_unit_dec_place,
						S0_T4.oper_unit_cd,
						S0_T2.oper_unit_qty,
						S0_T4.usr_cd.as("oper_usr_cd"),
						S0_T2.oper_yield.as("oper_act_yield"),
						S0_T4.oper_lower_yield,
						S0_T4.oper_std_yield,
						S0_T4.oper_upper_yield,
						S0_T5.inst_dpt_cd,
						S0_M6.dpt_nm.as("inst_dpt_nm"),
						S0_T6.mfg_loc_cd,
						S0_M3.loc_nm.as("mfg_loc_nm"),
						S0_T6.mfg_str_ln_cd,
						S0_T5.inst_dt,
						S0_T6.itm_cd,
						S0_T6.itm_sub1.as("itm_sub1_data"),
						S0_T6.itm_sub2.as("itm_sub2_data"),
						S0_T6.itm_sub3.as("itm_sub3_data"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T1.itm_yield.as("itm_act_yield"),
						S0_T6.itm_lower_yield,
						S0_T6.itm_std_yield,
						S0_T6.itm_upper_yield,
						S0_T5.disp_pd,
						S0_T6.bom_ptn,
						S0_T6.lot_no.as("lot_no_data"),
						S0_T6.sublot_no.as("sublot_no_data"),
						S0_T5.base_unit_inst_qty.as("base_unit_inst_qty"),
						S0_T7.base_unit_mfg_qty,
						S0_T1.base_unit_yield_qty,
						S0_T1.base_unit_dfct_qty,
						S0_T1.base_unit_cd,
						trunc(
							S0_T1.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T1.st_act_tm.as("st_act_hm"),
						trunc(
							S0_T1.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T1.end_act_tm.as("end_act_hm"),
						S0_T6.itm_ord_no,
						S0_T2.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T1.act_rpt_rmrks.as("mfg_act_rpt_rmrks"),
						S0_T1.aprv_dt,
						S0_T1.aprv_dpt_cd,
						S0_M7.dpt_nm.as("aprv_dpt_nm"),
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_rsn,
						// this field is appended by sql coverter.
						S0_T6.site_cd.as("join_site_cd_"),
						S0_M1.dec_place.as("base_unit_dec_place")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_act_no.eq(S0_W1.mfg_act_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.oper_inst_no.eq(S0_T2.oper_inst_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.mfg_inst_no.eq(S0_T1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T6.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T6.sno1.eq(S0_T3.sno1)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T7.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T7.div_seq.eq(S0_T1.div_seq))
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T8.oper_inst_no.eq(S0_T4.oper_inst_no)
								.and(S0_T8.div_seq.eq(S0_T1.div_seq))
								.and(S0_T8.mfg_inst_no.eq(S0_T1.mfg_inst_no))
								.and(S0_T8.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T6.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T6.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T6.sno1.eq(S0_M2.sno1))
								.and(S0_T6.sno2.eq(S0_M2.sno2))
								.and(S0_T6.sno3.eq(S0_M2.sno3))
								.and(S0_T6.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_T6.mfg_loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.dpt_cd.eq(S0_T5.inst_dpt_cd)
								.and(S0_T5.inst_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M7.dpt_cd)
								.and(S0_T1.aprv_dt.between(S0_M7.st_dt, S0_M7.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.can_flg.eq(value(false)))
						.and(S0_T5.can_flg.eq(value(false)))
						.and(S0_T6.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_SITE_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("join_site_cd_")
						))
						.addSelect(m -> toArray(
							m.ntfy_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ntfy_nm", m.ntfy_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL6090_MST_MFG_INST_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_MFG_INST_ALL_R_S01() {
		MST_MFG_INST_P_R S0T3 = MST_MFG_INST_P_R.create("T3");
		MCTempView S0T7 = createTempView("T7");
		MAM_LOC_R S0M2 = MAM_LOC_R.create("M2");
		MAM_STR_LN_R S0M3 = MAM_STR_LN_R.create("M3");
		MAM_ITM_R S0M4 = MAM_ITM_R.create("M4");
		MAM_SUNDRY_ITM_R S0M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAM_DPT_R S0M10 = MAM_DPT_R.create("M10");
		MST_RE_EXT_HST_R S1TMP = MST_RE_EXT_HST_R.create("TMP");
		MST_RE_EXT_HST_R S2TMP2 = MST_RE_EXT_HST_R.create("TMP2");

		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S0T2 = createTempView("T2");
		MCTempView S0T9 = createTempView("T9");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
		MCDynamicSQLID REP3 = createDynamicSQLID("REP3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_MFG_INST_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0T2.pr("mfg_inst_no"),
						S0T3.mfg_inst_rev.as("old_mfg_inst_rev_no"),
						S0T2.pr("mfg_inst_rev").as("new_mfg_inst_rev_no"),
						S0T3.inst_prnt_tm.as("old_inst_prnt_tm"),
						S0T2.pr("inst_prnt_tm").as("new_inst_prnt_tm"),
						S0T7.pr(S1TMP.chng_no),
						S0T2.pr("inst_rpt_rmrks").as("mfg_inst_rpt_rmrks"),
						S0T9.pr("itm_cd").as("prod_itm_cd"),
						S0T9.pr("itm_sub1").as("prod_itm_sub1_data"),
						S0T9.pr("itm_sub2").as("prod_itm_sub2_data"),
						S0T9.pr("itm_sub3").as("prod_itm_sub3_data"),
						nvl(
							S0M5.itm_nm,
							S0M4.itm_nm
						).as("prod_itm_nm"),
						S0M4.itm_alt_nm1.as("prod_itm_alt_nm1"),
						S0M4.itm_alt_nm2.as("prod_itm_alt_nm2"),
						S0M4.itm_alt_nm3.as("prod_itm_alt_nm3"),
						S0M4.itm_alt_nm4.as("prod_itm_alt_nm4"),
						S0T9.pr("bom_ptn"),
						S0T9.pr("mfg_loc_cd"),
						S0M2.loc_nm.as("mfg_loc_nm"),
						S0T9.pr("mfg_str_ln_cd"),
						S0M3.str_ln_nm.as("mfg_str_ln_nm"),
						S0T2.pr("inst_dpt_cd"),
						S0M10.dpt_nm.as("inst_dpt_nm")
					)
					.from(addDynamicView(REP1)
						.innerJoin(S0T3).on(
							bracket(
								S0T3.mfg_inst_no.eq(bind("mfg_inst_no"))
								.and(S0T3.mfg_inst_rev.eq(bind("mfg_inst_rev").subtract(value(1))))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1TMP.mfg_inst_no,
								S1TMP.mfg_inst_rev,
								S1TMP.chng_no
							)
							.from(S1TMP)
							.where(
								value(0).eq(value(0))
								.and(S1TMP.mfg_inst_no.eq(bind("mfg_inst_no")))
								.and(S1TMP.mfg_inst_rev.eq(bind("mfg_inst_rev")))
								.and(
									S1TMP.re_ext_typ.in(
										value(MSC_RE_EXT_TYP.EXT.value())
									)
								)
								.and(
									S1TMP.ref_ord.in(
										subQuery()
										.select(max(S2TMP2.ref_ord))
										.from(S2TMP2)
										.where(
											value(0).eq(value(0))
											.and(S2TMP2.mfg_inst_no.eq(S1TMP.mfg_inst_no))
											.and(S2TMP2.mfg_inst_rev.eq(S1TMP.mfg_inst_rev))
											.and(
												S2TMP2.re_ext_typ.in(
													value(MSC_RE_EXT_TYP.EXT.value())
												)
											)
										)
									)
								)
							).view(S0T7)
						).on(
							bracket(
								S0T7.pr(S1TMP.mfg_inst_no).eq(S0T2.pr("mfg_inst_no"))
								.and(S0T7.pr(S1TMP.mfg_inst_rev).eq(S0T2.pr("mfg_inst_rev")))
							)
						)
						.addDynamicView(REP2)
						.leftOuterJoin(S0M2).on(
							bracket(
								S0M2.loc_cd.eq(S0T9.pr("mfg_loc_cd"))
							)
						)
						.leftOuterJoin(S0M3).on(
							bracket(
								S0M3.loc_cd.eq(S0T9.pr("mfg_loc_cd"))
								.and(S0M3.str_ln_cd.eq(S0T9.pr("mfg_str_ln_cd")))
							)
						)
						.leftOuterJoin(S0M4).on(
							bracket(
								S0T9.pr("itm_cd").eq(S0M4.itm_cd)
								.and(S0T9.pr("itm_sub1").eq(S0M4.itm_sub1))
								.and(S0T9.pr("itm_sub2").eq(S0M4.itm_sub2))
								.and(S0T9.pr("itm_sub3").eq(S0M4.itm_sub3))
							)
						)
						.leftOuterJoin(S0M5).on(
							bracket(
								S0T9.pr("itm_cd").eq(S0M5.itm_cd)
								.and(S0T9.pr("itm_sub1").eq(S0M5.itm_sub1))
								.and(S0T9.pr("itm_sub2").eq(S0M5.itm_sub2))
								.and(S0T9.pr("itm_sub3").eq(S0M5.itm_sub3))
								.and(S0T9.pr("sno1").eq(S0M5.sno1))
								.and(S0T9.pr("sno2").eq(S0M5.sno2))
								.and(S0T9.pr("sno3").eq(S0M5.sno3))
								.and(S0T9.pr("sno4").eq(S0M5.sno4))
							)
						)
						.leftOuterJoin(S0M10).on(
							bracket(
								S0T2.pr("inst_dpt_cd").eq(S0M10.dpt_cd)
								.and(S0T2.pr("inst_dt").between(S0M10.st_dt, S0M10.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0T2.pr("can_flg").eq(value(false)))
						.and(S0T3.can_flg.eq(value(false)))
						.and(S0T9.pr("can_flg").eq(value(false)))
						.addDynamicPredicate(REP3)
					)
			);
	}
	
	/**
	 * -- MSBCL6090_MST_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_MFG_INST_S01() {
		MSW_MFG_INST_KEY_R S0_W1 = MSW_MFG_INST_KEY_R.create("W1");
		MST_MFG_INST_R S0_T1 = MST_MFG_INST_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MST_ITM_ORDER_R S0_T4 = MST_ITM_ORDER_R.create("T4");
		MSVT_MFG_INST_PR_R S0_T7 = MSVT_MFG_INST_PR_R.create("T7");
		MST_OPER_INST_R S0_T8 = MST_OPER_INST_R.create("T8");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_ITM_DTL_R S0_M16 = MAM_ITM_DTL_R.create("M16");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1.as("itm_sub1_data"),
						S0_T2.itm_sub2.as("itm_sub2_data"),
						S0_T2.itm_sub3.as("itm_sub3_data"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T2.mfg_loc_cd,
						S0_T2.bom_ptn,
						S0_T2.strg_loc_cd,
						S0_T1.base_unit_inst_qty,
						S0_T1.base_unit_yield_qty,
						S0_T2.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("prod_st_dt"),
						S0_T1.st_schd_tm.as("prod_st_hm"),
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("prod_end_dt"),
						S0_T1.end_schd_tm.as("prod_end_hm"),
						trunc(
							S0_T8.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T8.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T8.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T8.end_schd_tm.as("end_schd_hm"),
						S0_T8.oper_unit_cd,
						S0_T8.usr_cd.as("oper_inst_usr_cd"),
						S0_T8.oper_lower_yield,
						S0_T8.oper_std_yield,
						S0_T8.oper_upper_yield,
						S0_T2.oper_ptn,
						S0_T2.lot_no.as("lot_no_data"),
						S0_T2.sublot_no.as("sublot_no_data"),
						S0_T2.lot_no.as("lot_no_view"),
						S0_T2.sublot_no.as("sublot_no_view"),
						S0_T2.sno1.as("sno1_data"),
						S0_T2.sno2.as("sno2_data"),
						S0_T2.sno3.as("sno3_data"),
						S0_T2.sno4.as("sno4_data"),
						S0_T1.inst_dt,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M6.dpt_nm.as("inst_dpt_nm"),
						S0_T2.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T1.abort_flg.as("inst_abort_flg"),
						S0_T1.inst_rpt_rmrks.as("mfg_inst_rpt_rmrks"),
						S0_T1.intr_rmrks,
						S0_T1.inst_po_cnt_rmrks,
						S0_T1.disp_pd,
						S0_T2.itm_lower_yield,
						S0_T2.itm_std_yield,
						S0_T2.itm_upper_yield,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_no.as("mfg_inst_no_bd"),
						S0_T1.mfg_inst_rev,
						S0_T8.oper_inst_no,
						S0_T8.oper_cd,
						S0_T8.oper_seq,
						S0_T8.disp_seq,
						S0_T8.oper_loc_cd,
						S0_T8.oper_str_ln_cd,
						S0_T8.base_unit_qty.as("oper_base_unit_qty"),
						S0_T8.oper_std_qty,
						S0_T8.oper_conv_qty,
						S0_T8.oper_unit_conv_rnd_typ,
						S0_T8.oper_unit_dec_place,
						S0_T1.inst_prnt_tm,
						S0_T1.inst_prnt_flg,
						S0_T1.can_flg,
						S0_T1.itm_mfg_inst_no,
						S0_T2.itm_ord_no,
						S0_T4.mfg_inst_unit_typ,
						S0_T1.schd_chg_flg,
						S0_T4.inst_qty.as("base_unit_ord_qty"),
						S0_T4.not_inst_qty.as("base_unit_not_inst_qty"),
						S0_T1.po_d_no.as("po_d_no"),
						S0_T1.po_auto_reg_flg,
						S0_T2.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T2.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T2.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T1.sub_char1.as("mfg_inst_sub_char1"),
						S0_T1.sub_char2.as("mfg_inst_sub_char2"),
						S0_T1.sub_char3.as("mfg_inst_sub_char3"),
						S0_T8.sub_char1.as("oper_inst_sub_char1"),
						S0_T8.sub_char2.as("oper_inst_sub_char2"),
						S0_T8.sub_char3.as("oper_inst_sub_char3"),
						S0_T1.mfg_aprv_sts_typ,
						S0_T1.aprv_dt,
						S0_T1.aprv_tm,
						S0_T1.aprv_dpt_cd,
						S0_M8.dpt_nm.as("aprv_dpt_nm"),
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_rsn,
						S0_T1.aprv_flg,
						S0_T8.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_M16.inst_rec_issue_flg,
						// this field is appended by sql coverter.
						S0_T2.site_cd.as("join_site_cd_")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_W1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T4.itm_ord_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T7.mfg_inst_no)
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T8.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M2.sno1))
								.and(S0_T2.sno2.eq(S0_M2.sno2))
								.and(S0_T2.sno3.eq(S0_M2.sno3))
								.and(S0_T2.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.inst_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M8.dpt_cd)
								.and(S0_T1.aprv_dt.between(S0_M8.st_dt, S0_M8.end_dt))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M16.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M16.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M16.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M16.itm_sub3))
								.and(S0_T2.mfg_loc_cd.eq(S0_M16.mfg_loc_cd))
								.and(S0_M16.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M16.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M16.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T2.wg_cd.eq(S0_M16.wg_cd))
								.and(S0_T2.bom_ptn.eq(S0_M16.bom_ptn))
								.and(S0_T2.master_dt.between(S0_M16.st_dt, S0_M16.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T8.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1_data")
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
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
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
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_SITE_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("join_site_cd_")
						))
						.addSelect(m -> toArray(
							m.ntfy_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ntfy_nm", m.ntfy_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL6090_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_YIELD_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_T1 = MSW_MFG_ACT_KEY_R.create("T1");
		MST_MFG_ACT_R S0_T5 = MST_MFG_ACT_R.create("T5");
		MST_MFG_INST_R S0_T6 = MST_MFG_INST_R.create("T6");
		MST_OPER_INST_R S0_T7 = MST_OPER_INST_R.create("T7");
		MST_OPER_ACT_R S0_T2 = MST_OPER_ACT_R.create("T2");
		MST_YIELD_ACT_R S0_T3 = MST_YIELD_ACT_R.create("T3");
		MST_YIELD_SCHD_R S0_T4 = MST_YIELD_SCHD_R.create("T4");
		MST_YIELD_ACT_REM_R S0_T8 = MST_YIELD_ACT_REM_R.create("T8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T3.mfg_act_no,
						S0_T2.oper_inst_no,
						S0_T3.yield_act_no,
						S0_T3.oper_act_no,
						trunc(
							S0_T3.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T3.act_tm.as("act_hm"),
						S0_T3.yield_schd_no,
						S0_T4.trd_unit_yield_qty.as("trd_unit_yield_schd_qty"),
						S0_T8.trd_unit_yield_qty,
						S0_T4.trd_unit_cd,
						S0_T3.trd_unit_qty.as("trd_unit_yield_act_qty"),
						S0_T3.trd_unit_cd,
						S0_T3.lot_no.as("yield_act_lot_no_data"),
						S0_T3.sublot_no.as("yield_act_sublot_no_data"),
						S0_T3.yield_typ,
						S0_T3.gd_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.act_rpt_rmrks.as("yield_act_rpt_rmrks"),
						S0_T3.sub_char1.as("yield_act_sub_char1"),
						S0_T3.sub_char2.as("yield_act_sub_char2"),
						S0_T3.sub_char3.as("yield_act_sub_char3"),
						// this field is appended by sql coverter.
						S0_T3.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						S0_T3.base_unit_cd.as("join_base_unit_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T7.mfg_inst_no.eq(S0_T6.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_act_no.eq(S0_T5.mfg_act_no)
								.and(S0_T2.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no))
								.and(S0_T2.div_seq.eq(S0_T5.div_seq))
								.and(S0_T2.oper_inst_no.eq(S0_T7.oper_inst_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_T1.mfg_act_no)
								.and(S0_T3.itm_mfg_inst_no.eq(S0_T6.itm_mfg_inst_no))
								.and(S0_T3.oper_act_no.eq(S0_T2.oper_act_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.yield_schd_no.eq(S0_T3.yield_schd_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.yield_schd_no.eq(S0_T4.yield_schd_no)
								.and(S0_T8.div_seq.eq(S0_T5.div_seq))
								.and(S0_T8.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no))
								.and(S0_T8.oper_inst_no.eq(S0_T7.oper_inst_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T3.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
						.and(S0_T6.can_flg.eq(value(false)))
						.and(S0_T7.can_flg.eq(value(false)))
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
							r.setStringNE("yield_act_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("yield_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("join_base_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dec_place", m.dec_place());
					})
				)
			);
	}

	/**
	 * -- MSBCL6090_MST_YIELD_SCHD_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_YIELD_SCHD_ALL_R_S01() {
		MAM_UNIT_R S0M1 = MAM_UNIT_R.create("M1");
		MAM_OPER_R S0M2 = MAM_OPER_R.create("M2");
		MAM_USR_R S0M3 = MAM_USR_R.create("M3");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S0T2 = createTempView("T2");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");

		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_YIELD_SCHD_ALL_R_Query_S01")
					.mainQuery()
					.select(
						bind("mfg_inst_rev").as("mfg_inst_rev_no"),
						S0T2.pr("mfg_inst_no"),
						S0T2.pr("oper_inst_no"),
						S0T2.pr("oper_cd"),
						S0M2.oper_nm,
						S0T2.pr("oper_seq"),
						S0T2.pr("disp_seq"),
						trunc(
								S0T2.pr("st_schd_tm"),
								MCDateFmt.DD
							).as("st_schd_dt"),
						S0T2.pr("st_schd_tm").as("st_schd_hm"),
						trunc(
								S0T2.pr("end_schd_tm"),
								MCDateFmt.DD
							).as("end_schd_dt"),
						S0T2.pr("end_schd_tm").as("end_schd_hm"),
						S0T2.pr("base_unit_qty").as("oper_base_unit_qty"),
						S0T2.pr("oper_unit_cd"),
						S0M1.unit_nm.as("oper_unit_nm"),
						S0T2.pr("oper_unit_dec_place"),
						S0T2.pr("oper_unit_conv_rnd_typ"),
						S0T2.pr("disp_seq").as("oper_disp_seq"),
						S0T2.pr("oper_lt"),
						S0T2.pr("oper_lt_add_qty"),
						S0T2.pr("oper_offst_typ"),
						S0T2.pr("oper_offst"),
						S0T2.pr("oper_offst_add_qty"),
						S0T2.pr("oper_std_qty"),
						S0T2.pr("oper_conv_qty"),
						S0T2.pr("inst_rpt_rmrks").as("oper_inst_rpt_rmrks"),
						S0T2.pr("sub_char1").as("oper_inst_sub_char1"),
						S0T2.pr("sub_char2").as("oper_inst_sub_char2"),
						S0T2.pr("sub_char3").as("oper_inst_sub_char3"),
						S0T2.pr("usr_cd").as("oper_inst_usr_cd"),
						S0M3.usr_nm.as("oper_inst_usr_nm")
					)
					.from(addDynamicView(REP1)
						.leftOuterJoin(S0M1).on(
							bracket(
								S0M1.unit_cd.eq(S0T2.pr("oper_unit_cd"))
							)
						)
						.leftOuterJoin(S0M2).on(
							bracket(
								S0M2.oper_cd.eq(S0T2.pr("oper_cd"))
							)
						)
						.leftOuterJoin(S0M3).on(
							bracket(
								S0M3.usr_cd.eq(S0T2.pr("usr_cd"))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(REP2)
						.and(S0T2.pr("can_flg").eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBCL6090_MST_YIELD_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL6090_MST_YIELD_SCHD_S01() {
		MSW_MFG_INST_KEY_R S0_T1 = MSW_MFG_INST_KEY_R.create("T1");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		MST_YIELD_SCHD_R S0_T3 = MST_YIELD_SCHD_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6090_MST_YIELD_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.mfg_inst_no,
						S0_T3.oper_inst_no,
						S0_T3.yield_schd_no,
						trunc(
							S0_T3.schd_tm,
							MCDateFmt.DD
						).as("schd_yield_dt"),
						S0_T3.schd_tm.as("schd_yield_hm"),
						S0_T3.trd_unit_yield_qty,
						S0_T3.trd_unit_cd.as("yield_unit_cd"),
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.inst_rpt_rmrks.as("yield_schd_rpt_rmrks"),
						S0_T3.disp_seq.as("yield_schd_disp_seq"),
						S0_T3.sub_char1.as("yield_schd_sub_char1"),
						S0_T3.sub_char2.as("yield_schd_sub_char2"),
						S0_T3.sub_char3.as("yield_schd_sub_char3"),
						// this field is appended by sql coverter.
						S0_T3.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T3.oper_inst_no.eq(S0_T2.oper_inst_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T3.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
						.and(S0_T3.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("yield_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("yield_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("yield_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dec_place", m.dec_place());
					})
				)
			);
	}
}