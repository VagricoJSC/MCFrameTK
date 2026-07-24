package mcframe.serverMSBC.MSBCL0290;

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

import java.util.ArrayList;

public class Query_MC {
	
	/**
	 * -- MSBCL0290_MAM_RSRC_LOC_Query_S01
	 */
	static MCQueryPlan MSBCL0290_MAM_RSRC_LOC_S01() {
		MAM_RSRC_LOC_R S0_M1 = MAM_RSRC_LOC_R.create("M1");
		MAVM_RD_LOC_R S0_M2 = MAVM_RD_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_SITE_R S0_M5 = MAM_SITE_R.create("M5");
		MAM_LOC_GRP_R S0_M6 = MAM_LOC_GRP_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MAM_RSRC_LOC_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_M2.loc_cd.as("mfg_loc_cd"),
						S0_M2.loc_nm.as("mfg_loc_nm"),
						nvl(
							S0_M2.cal_cd,
							S0_M7.sppl_cal_cd
						).as("cal_cd"),
						S0_M2.sppl_cd,
						nvl2(
							S0_M3.rsrc_cd,
							S0_M3.rsrc_cd,
							nullValue()
						).as("rsrc_cd1"),
						nvl2(
							S0_M3.rsrc_cd,
							S0_M3.rsrc_nm,
							nullValue()
						).as("rsrc_nm1"),
						nvl2(
							S0_M3.rsrc_cd,
							S0_M3.rsrc_unit_nm,
							nullValue()
						).as("rsrc_unit_nm1"),
						nvl2(
							S0_M3.rsrc_cd,
							S0_M3.dec_place,
							nullValue()
						).as("rsrc_dec_place1"),
						nvl2(
							S0_M3.rsrc_cd,
							S0_M3.rnd_typ,
							nullValue()
						).as("rsrc_rnd_typ1"),
						nvl2(
							S0_M4.rsrc_cd,
							S0_M4.rsrc_cd,
							nullValue()
						).as("rsrc_cd2"),
						nvl2(
							S0_M4.rsrc_cd,
							S0_M4.rsrc_nm,
							nullValue()
						).as("rsrc_nm2"),
						nvl2(
							S0_M4.rsrc_cd,
							S0_M4.rsrc_unit_nm,
							nullValue()
						).as("rsrc_unit_nm2"),
						nvl2(
							S0_M4.rsrc_cd,
							S0_M4.dec_place,
							nullValue()
						).as("rsrc_dec_place2"),
						nvl2(
							S0_M4.rsrc_cd,
							S0_M4.rnd_typ,
							nullValue()
						).as("rsrc_rnd_typ2")
					)
					.from(
						S0_M1
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_M1.mfg_loc_cd)
								.and(S0_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
								.and(S0_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
								.and(S0_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_M5.site_cd.eq(S0_M2.site_cd)
							)
						)
						.innerJoin(S0_M6).on(
							bracket(
								S0_M6.loc_grp_cd.eq(S0_M2.loc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.bp_cd.eq(S0_M2.sppl_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M1.st_dt.lte(bind("wk_dt_to")))
						.and(S0_M1.end_dt.gte(bind("wk_dt_fr")))
						.and(
							S0_M3.rsrc_cd.isNotNull()
							.or(S0_M4.rsrc_cd.isNotNull())
						)
						.and(S0_M2.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M2.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M5.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_M2.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M6.loc_grp_nm.like(bind("loc_grp_nm")))
						.cutoff$and(S0_M1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M2.loc_nm.like(bind("mfg_loc_nm")))
					)
			);
	}
	
	/**
	 * -- MSBCL0290_MST_ALLOC_PLN_Query_S01
	 */
	static MCQueryPlan MSBCL0290_MST_ALLOC_PLN_S01() {
		MST_MRPRQMT_R S0_T1 = MST_MRPRQMT_R.create("T1");
		MST_ALLOC_PLN_R S0_T2 = MST_ALLOC_PLN_R.create("T2");
		MSW_IO_SCHD_PR_R S0_W1 = MSW_IO_SCHD_PR_R.create("W1");
		MSW_IO_SCHD_PR_R S0_W2 = MSW_IO_SCHD_PR_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_ALLOC_PLN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T2.io_schd_pr_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rqmt_no.eq(S0_T2.rqmt_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.io_schd_pr_no.eq(S0_T1.itm_ord_no)
							)
						)
						.innerJoin(S0_W2).on(
							bracket(
								S0_W2.io_schd_pr_no.eq(S0_T2.io_schd_pr_no)
							)
						)
					)
			);
	}
	/**
	 * -- MSBCL0290_MST_ITM_ORDER_Query_S01 : 未確定、保存、確定（内製）
	 */
	static MCQueryPlan MSBCL0290_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					S0_T1.itm_ord_typ,
					decode(
						S0_T1.itm_ord_sts_typ,
						value(MSC_ITM_ORD_STS_TYP.OPN.value()),
						value(MSC_ITM_ORD_LD_STS_TYP.OPN.value()),
						value(MSC_ITM_ORD_STS_TYP.SAV.value()),
						value(MSC_ITM_ORD_LD_STS_TYP.SAV.value()),
						value(MSC_ITM_ORD_LD_STS_TYP.FIX.value())
					).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.not_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					S0_T1.mfg_st_schd_dt.as("mfg_st_dt"),
					S0_T1.mfg_end_schd_dt.as("mfg_end_dt"),
					S0_T1.mfg_lt,
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T1.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.master_dt,
					S0_T1.rqmt_no,
					S0_T1.inst_po_cnt_rmrks,
					S0_T1.intr_rmrks,
					S0_T1.sub_char1,
					S0_T1.sub_char2,
					S0_T1.sub_char3,
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M1.sppl_cd))
							.and(S0_T1.maker_cd.eq(S0_M1.maker_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M20.sno1))
							.and(S0_T1.sno2.eq(S0_M20.sno2))
							.and(S0_T1.sno3.eq(S0_M20.sno3))
							.and(S0_T1.sno4.eq(S0_M20.sno4))
							.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(
						S0_T1.itm_ord_typ.in(
							value(MSC_ITM_ORD_TYP.MFG.value()),
							value(MSC_ITM_ORD_TYP.OUTSRC.value())
						)
					)
					.and(
						S0_T1.itm_ord_sts_typ.in(
							bind("w_opn"),
							bind("w_sav"),
							bind("w_fix"),
							bind("w_fix_inst")
						)
					)
					.and(
						S0_T1.itm_ord_sts_typ.in(
							value(MSC_ITM_ORD_STS_TYP.OPN.value()),
							value(MSC_ITM_ORD_STS_TYP.SAV.value())
						)
						.or(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
							)
						)
						.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
					)
					.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
					.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
					.and(S0_T1.not_inst_qty.gt(value(0)))
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	/**
	 * -- MSBCL0290_MST_ITM_ORDER_Query_S02 : 確定（外注）
	 */
	static MCQueryPlan MSBCL0290_MST_ITM_ORDER_S02() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MST_PO_SCHD_R S0_T2 = MST_PO_SCHD_R.create("T2");
		MST_WG_RQST_R S0_T3 = MST_WG_RQST_R.create("T3");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_ITM_ORDER_Query_S02")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					S0_T1.itm_ord_typ,
					value(MSC_ITM_ORD_LD_STS_TYP.FIX.value()).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.not_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						nvl(
							S0_T3.not_cmpl_qty,
							S0_T2.base_unit_qty
						).multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						nvl(
							S0_T3.not_cmpl_qty,
							S0_T2.base_unit_qty
						).multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					S0_T1.mfg_st_schd_dt.as("mfg_st_dt"),
					S0_T1.mfg_end_schd_dt.as("mfg_end_dt"),
					S0_T1.mfg_lt,
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T1.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.master_dt,
					S0_T1.rqmt_no,
					S0_T1.inst_po_cnt_rmrks,
					S0_T1.intr_rmrks,
					S0_T1.sub_char1,
					S0_T1.sub_char2,
					S0_T1.sub_char3,
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.leftOuterJoin(S0_T2).on(
						bracket(
							S0_T1.itm_ord_no.eq(S0_T2.outsrc_itm_ord_no)
							.and(S0_T2.can_flg.eq(value(false)))
							.and(S0_T2.abort_flg.eq(value(false)))
							.and(S0_T2.po_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_T3).on(
						bracket(
							value(MSC_WG_RQST_SRC_TYP.ORD.value()).eq(S0_T3.wg_rqst_src_typ)
							.and(S0_T1.itm_ord_no.eq(S0_T3.wg_rqst_src_no))
							.and(S0_T3.can_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M1.sppl_cd))
							.and(S0_T1.maker_cd.eq(S0_M1.maker_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M20.sno1))
							.and(S0_T1.sno2.eq(S0_M20.sno2))
							.and(S0_T1.sno3.eq(S0_M20.sno3))
							.and(S0_T1.sno4.eq(S0_M20.sno4))
							.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
					.and(
						S0_T1.itm_ord_sts_typ.in(
							value(MSC_ITM_ORD_STS_TYP.FIX.value()),
							value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
						)
					)
					.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
					.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
					.and(
						nvl(
							S0_T3.not_cmpl_qty,
							S0_T2.base_unit_qty
						).gt(value(0))
					)
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	/**
	 * -- MSBCL0290_MST_ITM_ORDER_Query_S03
	 */
	static MCQueryPlan MSBCL0290_MST_ITM_ORDER_S03() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_ITM_ORDER_Query_S03")
					.mainQuery()
					.select(
						min(S0_T1.mfg_st_schd_dt).as("min_mfg_st_dt"),
						max(S0_T1.mfg_end_schd_dt).as("max_mfg_end_dt")
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(
							S0_T1.itm_ord_sts_typ.in(
								bind("w_opn"),
								bind("w_sav"),
								bind("w_fix"),
								bind("w_fix_inst")
							)
						)
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.OPN.value()),
								value(MSC_ITM_ORD_STS_TYP.SAV.value())
							)
							.or(
								S0_T1.itm_ord_sts_typ.in(
									value(MSC_ITM_ORD_STS_TYP.FIX.value()),
									value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
								)
							)
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
						)
						.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.not_inst_qty.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBCL0290_MST_ITM_ORDER_Query_S04
	 */
	static MCQueryPlan MSBCL0290_MST_ITM_ORDER_S04() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MST_PO_SCHD_R S0_T2 = MST_PO_SCHD_R.create("T2");
		MST_WG_RQST_R S0_T3 = MST_WG_RQST_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_ITM_ORDER_Query_S04")
					.mainQuery()
					.select(
						min(S0_T1.mfg_st_schd_dt).as("min_mfg_st_dt"),
						max(S0_T1.mfg_end_schd_dt).as("max_mfg_end_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.outsrc_itm_ord_no)
								.and(S0_T2.can_flg.eq(value(false)))
								.and(S0_T2.abort_flg.eq(value(false)))
								.and(S0_T2.po_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								value(MSC_WG_RQST_SRC_TYP.ORD.value()).eq(S0_T3.wg_rqst_src_typ)
								.and(S0_T1.itm_ord_no.eq(S0_T3.wg_rqst_src_no))
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
							)
						)
						.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(
							nvl(
								S0_T3.not_cmpl_qty,
								S0_T2.base_unit_qty
							).gt(value(0))
						)
					)
			);
	}
	/**
	 * -- MSBCL0290_MST_MFG_ACT_Query_S01 : 完了
	 */
	static MCQueryPlan MSBCL0290_MST_MFG_ACT_S01() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_ACT_R S0_T2 = MST_MFG_ACT_R.create("T2");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MST_ITM_ORDER_R S0_T10 = MST_ITM_ORDER_R.create("T10");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		MSVT_MFG_INST_PR_R S1_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S1_X2 = MST_MFG_INST_R.create("X2");

		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_MFG_ACT_Query_S01")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					decode(
						S0_T1.mfg_mtd_typ,
						value(MSC_MFG_MTD_TYP.INTNL.value()),
						value(MSC_ITM_ORD_TYP.MFG.value()),
						value(MSC_ITM_ORD_TYP.OUTSRC.value())
					).as("itm_ord_typ"),
					value(MSC_ITM_ORD_LD_STS_TYP.CMPL.value()).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.base_unit_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						bracket(
							S0_T2.base_unit_yield_qty.add(
								nvl(
									S0_T2.base_unit_dfct_qty,
									value(0)
								)
							)
						).multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						bracket(
							S0_T2.base_unit_yield_qty.add(
								nvl(
									S0_T2.base_unit_dfct_qty,
									value(0)
								)
							)
						).multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					trunc(
						S0_T2.st_act_tm,
						MCDateFmt.DD
					).as("mfg_st_dt"),
					trunc(
						S0_T2.end_act_tm,
						MCDateFmt.DD
					).as("mfg_end_dt"),
					nullValue().as("mfg_lt"),
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T10.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					S0_T1.master_dt,
					nullValue().as("rqmt_no"),
					nullValue().as("inst_po_cnt_rmrks"),
					nullValue().as("intr_rmrks"),
					nullValue().as("sub_char1"),
					nullValue().as("sub_char2"),
					nullValue().as("sub_char3"),
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.innerJoin(S0_T2).on(
						bracket(
							S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
						)
					)
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_M1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M1.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M1.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.innerJoin(S0_T10).on(
						bracket(
							S0_T10.itm_ord_no.eq(S0_T1.itm_ord_no)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T10.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T10.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T10.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T10.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T10.sno1.eq(S0_M20.sno1))
							.and(S0_T10.sno2.eq(S0_M20.sno2))
							.and(S0_T10.sno3.eq(S0_M20.sno3))
							.and(S0_T10.sno4.eq(S0_M20.sno4))
							.and(S0_T10.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.can_flg.eq(value(false)))
					.and(
						notExists(
							subQuery()
							.select(value("X"))
							.from(
								S1_X1
								.innerJoin(S1_X2).on(
									bracket(
										S1_X1.mfg_inst_no.eq(S1_X2.mfg_inst_no)
									)
								)
							)
							.where(
								S1_X1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
								.and(S1_X2.can_flg.eq(value(false)))
								.and(
									S1_X1.mfg_sts_typ.in(
										value(MSC_MFG_STS_TYP.YET.value()),
										value(MSC_MFG_STS_TYP.SAV.value()),
										value(MSC_MFG_STS_TYP.ORD.value()),
										value(MSC_MFG_STS_TYP.STT.value())
									)
								)
							)
						)
					)
					.and(S0_T2.st_act_tm.lt(bind("dt_to")))
					.and(S0_T2.end_act_tm.gte(bind("dt_fr")))
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	
	/**
	 * -- MSBCL0290_MST_MFG_ACT_Query_S02
	 */
	static MCQueryPlan MSBCL0290_MST_MFG_ACT_S02() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_ACT_R S0_T2 = MST_MFG_ACT_R.create("T2");
		MSVT_MFG_INST_PR_R S1_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S1_X2 = MST_MFG_INST_R.create("X2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_MFG_ACT_Query_S02")
					.mainQuery()
					.select(
						min(
							trunc(
								S0_T2.st_act_tm,
								MCDateFmt.DD
							)
						).as("min_mfg_st_dt"),
						max(
							trunc(
								S0_T2.end_act_tm,
								MCDateFmt.DD
							)
						).as("max_mfg_end_dt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S1_X1
									.innerJoin(S1_X2).on(
										bracket(
											S1_X1.mfg_inst_no.eq(S1_X2.mfg_inst_no)
										)
									)
								)
								.where(
									S1_X1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
									.and(S1_X2.can_flg.eq(value(false)))
									.and(
										S1_X1.mfg_sts_typ.in(
											value(MSC_MFG_STS_TYP.YET.value()),
											value(MSC_MFG_STS_TYP.SAV.value()),
											value(MSC_MFG_STS_TYP.ORD.value()),
											value(MSC_MFG_STS_TYP.STT.value())
										)
									)
								)
							)
						)
						.and(S0_T2.st_act_tm.lt(bind("dt_to")))
						.and(S0_T2.end_act_tm.gte(bind("dt_fr")))
					)
			);
	}
	/**
	 * -- MSBCL0290_MST_MFG_INST_Query_S01 : 指図済
	 */
	static MCQueryPlan MSBCL0290_MST_MFG_INST_S01() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MST_ITM_ORDER_R S0_T10 = MST_ITM_ORDER_R.create("T10");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		MSVT_MFG_INST_PR_R S1_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S1_X2 = MST_MFG_INST_R.create("X2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_MFG_INST_Query_S01")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					decode(
						S0_T1.mfg_mtd_typ,
						value(MSC_MFG_MTD_TYP.INTNL.value()),
						value(MSC_ITM_ORD_TYP.MFG.value()),
						value(MSC_ITM_ORD_TYP.OUTSRC.value())
					).as("itm_ord_typ"),
					value(MSC_ITM_ORD_LD_STS_TYP.INST.value()).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.base_unit_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						S0_T1.base_unit_inst_qty.multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						S0_T1.base_unit_inst_qty.multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					trunc(
						S0_T2.st_schd_tm,
						MCDateFmt.DD
					).as("mfg_st_dt"),
					trunc(
						S0_T2.end_schd_tm,
						MCDateFmt.DD
					).as("mfg_end_dt"),
					nullValue().as("mfg_lt"),
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T10.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.master_dt,
					nullValue().as("rqmt_no"),
					nullValue().as("inst_po_cnt_rmrks"),
					nullValue().as("intr_rmrks"),
					nullValue().as("sub_char1"),
					nullValue().as("sub_char2"),
					nullValue().as("sub_char3"),
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.innerJoin(S0_T2).on(
						bracket(
							S0_T1.frst_mfg_inst_no.eq(S0_T2.mfg_inst_no)
						)
					)
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_M1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M1.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M1.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.innerJoin(S0_T10).on(
						bracket(
							S0_T10.itm_ord_no.eq(S0_T1.itm_ord_no)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T10.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T10.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T10.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T10.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T10.sno1.eq(S0_M20.sno1))
							.and(S0_T10.sno2.eq(S0_M20.sno2))
							.and(S0_T10.sno3.eq(S0_M20.sno3))
							.and(S0_T10.sno4.eq(S0_M20.sno4))
							.and(S0_T10.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.can_flg.eq(value(false)))
					.and(S0_T2.can_flg.eq(value(false)))
					.and(S0_T2.abort_flg.eq(value(false)))
					.and(
						exists(
							subQuery()
							.select(value("X"))
							.from(
								S1_X1
								.innerJoin(S1_X2).on(
									bracket(
										S1_X1.mfg_inst_no.eq(S1_X2.mfg_inst_no)
									)
								)
							)
							.where(
								S1_X1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
								.and(S1_X2.can_flg.eq(value(false)))
								.and(
									S1_X1.mfg_sts_typ.in(
										value(MSC_MFG_STS_TYP.YET.value()),
										value(MSC_MFG_STS_TYP.SAV.value()),
										value(MSC_MFG_STS_TYP.ORD.value()),
										value(MSC_MFG_STS_TYP.STT.value())
									)
								)
							)
						)
					)
					.and(S0_T2.can_flg.eq(value(false)))
					.and(S0_T2.st_schd_tm.lt(bind("dt_to")))
					.and(S0_T2.end_schd_tm.gte(bind("dt_fr")))
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	
	
	/**
	 * -- MSBCL0290_MST_MFG_INST_Query_S02
	 */
	static MCQueryPlan MSBCL0290_MST_MFG_INST_S02() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MSVT_MFG_INST_PR_R S1_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S1_X2 = MST_MFG_INST_R.create("X2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_MFG_INST_Query_S02")
					.mainQuery()
					.select(
						min(
							trunc(
								S0_T2.st_schd_tm,
								MCDateFmt.DD
							)
						).as("min_mfg_st_dt"),
						max(
							trunc(
								S0_T2.end_schd_tm,
								MCDateFmt.DD
							)
						).as("max_mfg_end_dt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.frst_mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_X1
									.innerJoin(S1_X2).on(
										bracket(
											S1_X1.mfg_inst_no.eq(S1_X2.mfg_inst_no)
										)
									)
								)
								.where(
									S1_X1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
									.and(S1_X2.can_flg.eq(value(false)))
									.and(
										S1_X1.mfg_sts_typ.in(
											value(MSC_MFG_STS_TYP.YET.value()),
											value(MSC_MFG_STS_TYP.SAV.value()),
											value(MSC_MFG_STS_TYP.ORD.value()),
											value(MSC_MFG_STS_TYP.STT.value())
										)
									)
								)
							)
						)
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.st_schd_tm.lt(bind("dt_to")))
						.and(S0_T2.end_schd_tm.gte(bind("dt_fr")))
					)
			);
	}
	
	/**
	 * -- MSBCL0290_MST_PRCD_ALLOC_PLN_Query_S01
	 */
	static MCQueryPlan MSBCL0290_MST_PRCD_ALLOC_PLN_S01() {
		MST_PRCD_MRPRQMT_R S0_T1 = MST_PRCD_MRPRQMT_R.create("T1");
		MST_PRCD_ALLOC_PLN_R S0_T2 = MST_PRCD_ALLOC_PLN_R.create("T2");
		MSW_IO_SCHD_PR_R S0_W1 = MSW_IO_SCHD_PR_R.create("W1");
		MSW_IO_SCHD_PR_R S0_W2 = MSW_IO_SCHD_PR_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_PRCD_ALLOC_PLN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T2.io_schd_pr_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rqmt_no.eq(S0_T2.rqmt_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.io_schd_pr_no.eq(S0_T1.itm_ord_no)
							)
						)
						.innerJoin(S0_W2).on(
							bracket(
								S0_W2.io_schd_pr_no.eq(S0_T2.io_schd_pr_no)
							)
						)
					)
			);
	}
	/**
	 * -- MSBCL0290_MST_PRCD_ITM_ORDER_Query_S01 : 先行手配
	 */
	static MCQueryPlan MSBCL0290_MST_PRCD_ITM_ORDER_S01() {
		MST_PRCD_ITM_ORDER_R S0_T1 = MST_PRCD_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_PRCD_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					S0_T1.itm_ord_typ,
					value(MSC_ITM_ORD_LD_STS_TYP.PRCD.value()).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.not_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					S0_T1.mfg_st_schd_dt.as("mfg_st_dt"),
					S0_T1.mfg_end_schd_dt.as("mfg_end_dt"),
					S0_T1.mfg_lt,
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T1.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.master_dt,
					S0_T1.rqmt_no,
					S0_T1.inst_po_cnt_rmrks,
					S0_T1.intr_rmrks,
					S0_T1.sub_char1,
					S0_T1.sub_char2,
					S0_T1.sub_char3,
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.innerJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M1.sppl_cd))
							.and(S0_T1.maker_cd.eq(S0_M1.maker_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
							.and(S0_M1.pre_po_tgt_flg.eq(value(true)))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M20.sno1))
							.and(S0_T1.sno2.eq(S0_M20.sno2))
							.and(S0_T1.sno3.eq(S0_M20.sno3))
							.and(S0_T1.sno4.eq(S0_M20.sno4))
							.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(
						S0_T1.itm_ord_typ.in(
							value(MSC_ITM_ORD_TYP.MFG.value()),
							value(MSC_ITM_ORD_TYP.OUTSRC.value())
						)
					)
					.and(S0_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value())))
					.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
					.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	
	/**
	 * -- MSBCL0290_MST_PRCD_ITM_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL0290_MST_PRCD_ITM_ORDER_S02() {
		MST_PRCD_ITM_ORDER_R S0_T1 = MST_PRCD_ITM_ORDER_R.create("T1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_PRCD_ITM_ORDER_Query_S02")
					.mainQuery()
					.select(
						min(S0_T1.mfg_st_schd_dt).as("min_mfg_st_dt"),
						max(S0_T1.mfg_end_schd_dt).as("max_mfg_end_dt")
					)
					.from(
						S0_T1
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_M1.sppl_cd))
								.and(S0_T1.maker_cd.eq(S0_M1.maker_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
								.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
								.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
								.and(S0_T1.master_dt.gte(S0_M1.st_dt))
								.and(S0_T1.master_dt.lte(S0_M1.end_dt))
								.and(S0_M1.pre_po_tgt_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(S0_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value())))
						.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
					)
			);
	}
	
	/**
	 * -- MSBCL0290_MST_SIM_ALLOC_PLN_Query_S01
	 */
	static MCQueryPlan MSBCL0290_MST_SIM_ALLOC_PLN_S01() {
		MST_SIM_MRPRQMT_R S0_T1 = MST_SIM_MRPRQMT_R.create("T1");
		MST_SIM_ALLOC_PLN_R S0_T2 = MST_SIM_ALLOC_PLN_R.create("T2");
		MSW_IO_SCHD_PR_R S0_W1 = MSW_IO_SCHD_PR_R.create("W1");
		MSW_IO_SCHD_PR_R S0_W2 = MSW_IO_SCHD_PR_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_SIM_ALLOC_PLN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T2.io_schd_pr_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rqmt_no.eq(S0_T2.rqmt_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.io_schd_pr_no.eq(S0_T1.itm_ord_no)
							)
						)
						.innerJoin(S0_W2).on(
							bracket(
								S0_W2.io_schd_pr_no.eq(S0_T2.io_schd_pr_no)
							)
						)
					)
					.where(
						S0_T1.sim_mrp_no.eq(bind("sim_mrp_no"))
					)
			);
	}
	/**
	 * -- MSBCL0290_MST_SIM_ITM_ORDER_Query_S01 : シミュレーション
	 */
	static MCQueryPlan MSBCL0290_MST_SIM_ITM_ORDER_S01() {
		MST_SIM_ITM_ORDER_R S0_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_S1 = MSVT_WRK_SNO_R.create("S1");
		MAVM_ITM_DTL_MFG_R S0_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S0_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S0_M4 = MAM_RSRC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_R S0_ITM1 = MAM_ITM_R.create("ITM1");
		MAM_SUNDRY_ITM_R S0_ITM2 = MAM_SUNDRY_ITM_R.create("ITM2");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAW_LOC_KEY_R S0_W1 = MAW_LOC_KEY_R.create("W1");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_SIM_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_T1.itm_ord_no,
					S0_T1.itm_ord_typ,
					value(MSC_ITM_ORD_LD_STS_TYP.SIM.value()).as("itm_ord_ld_sts_typ"),
					S0_T1.io_schd_pr_no,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					nvl(
						S0_ITM2.itm_nm,
						S0_ITM1.itm_nm
					).as("itm_nm"),
					S0_T1.not_inst_qty.as("qty"),
					S0_ITM1.unit_cd.as("unit_cd"),
					S0_ITM1.dec_place.as("dec_place"),
					S0_M7.unit_nm,
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty1).divide(
								nvl(
									S0_M1.rsrc_unit_qty1,
									value(1)
								)
							),
						S0_M3.dec_place,
						S0_M3.rnd_typ
					).as("rsrc_act_qty1"),
					MAPA_CALC$F_RND_NE(
						S0_T1.not_inst_qty.multiply(S0_M1.rsrc_std_qty2).divide(
								nvl(
									S0_M1.rsrc_unit_qty2,
									value(1)
								)
							),
						S0_M4.dec_place,
						S0_M4.rnd_typ
					).as("rsrc_act_qty2"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_cd,
						nullValue()
					).as("rsrc_cd1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_nm,
						nullValue()
					).as("rsrc_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.dec_place,
						nullValue()
					).as("rsrc_dec_place1"),
					nvl2(
						S0_M3.rsrc_cd,
						S0_M3.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ1"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_cd,
						nullValue()
					).as("rsrc_cd2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_nm,
						nullValue()
					).as("rsrc_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rsrc_unit_nm,
						nullValue()
					).as("rsrc_unit_nm2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.dec_place,
						nullValue()
					).as("rsrc_dec_place2"),
					nvl2(
						S0_M4.rsrc_cd,
						S0_M4.rnd_typ,
						nullValue()
					).as("rsrc_rnd_typ2"),
					S0_T1.mfg_st_schd_dt.as("mfg_st_dt"),
					S0_T1.mfg_end_schd_dt.as("mfg_end_dt"),
					S0_T1.mfg_lt,
					S0_T1.mfg_loc_cd,
					S0_M2.loc_nm.as("mfg_loc_nm"),
					S0_T1.bom_ptn,
					S0_T1.sno1,
					S0_T1.sno2,
					S0_T1.sno3,
					S0_T1.sno4,
					S0_S1.wrk_no,
					S0_S1.wrk_nm,
					S0_T1.strg_loc_cd,
					S0_M5.loc_nm.as("strg_loc_nm"),
					S0_T1.wg_cd,
					S0_M6.wg_nm,
					decode(
						S0_M20.itm_cd,
						nullValue(),
						S0_T1.not_fix_flg,
						value(true)
					).as("not_fix_flg"),
					S0_T1.master_dt,
					S0_T1.rqmt_no,
					S0_T1.inst_po_cnt_rmrks,
					S0_T1.intr_rmrks,
					S0_T1.sub_char1,
					S0_T1.sub_char2,
					S0_T1.sub_char3,
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0C_ITM_GRP)
				)
				.from(
					S0_T1
					.leftOuterJoin(S0_S1).on(
						bracket(
							S0_S1.sno1.eq(S0_T1.sno1)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M1.sppl_cd))
							.and(S0_T1.maker_cd.eq(S0_M1.maker_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
							.and(S0_T1.bom_ptn.eq(S0_M1.bom_ptn))
							.and(S0_T1.wg_cd.eq(S0_M1.wg_cd))
							.and(S0_T1.master_dt.gte(S0_M1.st_dt))
							.and(S0_T1.master_dt.lte(S0_M1.end_dt))
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.rsrc_cd.eq(S0_M2.rsrc_cd1)
							.and(S0_M3.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.rsrc_cd.eq(S0_M2.rsrc_cd2)
							.and(S0_M4.del_flg.eq(value(false)))
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
						)
					)
					.leftOuterJoin(S0_ITM1).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_ITM2).on(
						bracket(
							S0_T1.itm_cd.eq(S0_ITM2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITM2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITM2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITM2.itm_sub3))
							.and(S0_T1.sno1.eq(S0_ITM2.sno1))
							.and(S0_T1.sno2.eq(S0_ITM2.sno2))
							.and(S0_T1.sno3.eq(S0_ITM2.sno3))
							.and(S0_T1.sno4.eq(S0_ITM2.sno4))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_T1.wg_cd.eq(S0_M6.wg_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.unit_cd.eq(S0_ITM1.unit_cd)
						)
					)
					.innerJoin(S0_W1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_T1.mfg_loc_cd)
						)
					)
					.leftOuterJoin(S0_M20).on(
						bracket(
							S0_T1.itm_cd.eq(S0_M20.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M20.sno1))
							.and(S0_T1.sno2.eq(S0_M20.sno2))
							.and(S0_T1.sno3.eq(S0_M20.sno3))
							.and(S0_T1.sno4.eq(S0_M20.sno4))
							.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
							.and(S0_M20.del_flg.eq(value(false)))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(
						S0_T1.itm_ord_typ.in(
							value(MSC_ITM_ORD_TYP.MFG.value()),
							value(MSC_ITM_ORD_TYP.OUTSRC.value())
						)
					)
					.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
					.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
					.and(S0_T1.sim_mrp_no.eq(bind("sim_mrp_no")))
					.and(S0_T1.exp_dt.isNull())
				)
			)
			.addDynamicSQLInfo(createSQLInfo_ITM_GRP(DS0C_ITM_GRP, S0_ITM1));
	}
	
	
	/**
	 * -- MSBCL0290_MST_SIM_ITM_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL0290_MST_SIM_ITM_ORDER_S02() {
		MST_SIM_ITM_ORDER_R S0_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0290_MST_SIM_ITM_ORDER_Query_S02")
					.mainQuery()
					.select(
						min(S0_T1.mfg_st_schd_dt).as("min_mfg_st_dt"),
						max(S0_T1.mfg_end_schd_dt).as("max_mfg_end_dt")
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(S0_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S0_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.sim_mrp_no.eq(bind("sim_mrp_no")))
						.and(S0_T1.exp_dt.isNull())
					)
			);
	}
	
	static MCDynamicSQLInfo[] createSQLInfo_ITM_GRP(MCDynamicSQLID id, MAM_ITM_R itmR) {
		ArrayList<MCDynamicSQLInfo> l = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			l.add(createSQLInfo_ITM_GRP(i, id, itmR));
		}
		
		return l.toArray(new MCDynamicSQLInfo[0]);
	}
	
	static MCDynamicSQLInfo createSQLInfo_ITM_GRP(int no, MCDynamicSQLID id, MAM_ITM_R itmR) {
		String flgCol = "itm_grp_flg" + no;
		String nmCol = "itm_grp_nm" + no;
		MCStringPermColumn grpCdCol = (MCStringPermColumn)itmR.getColumn$("itm_grp_cd" + no);
		MAC_ITM_GRP_TYP typ = getItmGrpTyp(no);
		MAM_ITM_GRP_R grpR = MAM_ITM_GRP_R.create("ITM_GRP" + no);
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol))
				.select(id, grpCdCol, grpR.itm_grp_nm.as(nmCol))
				.view(id, v -> v.leftOuterJoin(grpR).on(grpR.itm_grp_cd.eq(grpCdCol).and(grpR.itm_grp_typ.eq(value(typ.value())))));
	}
	
	static MAC_ITM_GRP_TYP getItmGrpTyp(int no) {
		if (no == 1) {
			return MAC_ITM_GRP_TYP.GRP1;
		}
		if (no == 2) {
			return MAC_ITM_GRP_TYP.GRP2;
		}
		if (no == 3) {
			return MAC_ITM_GRP_TYP.GRP3;
		}
		if (no == 4) {
			return MAC_ITM_GRP_TYP.GRP4;
		}
		if (no == 5) {
			return MAC_ITM_GRP_TYP.GRP5;
		}
		if (no == 6) {
			return MAC_ITM_GRP_TYP.GRP6;
		}
		if (no == 7) {
			return MAC_ITM_GRP_TYP.GRP7;
		}
		if (no == 8) {
			return MAC_ITM_GRP_TYP.GRP8;
		}
		if (no == 9) {
			return MAC_ITM_GRP_TYP.GRP9;
		}
		if (no == 10) {
			return MAC_ITM_GRP_TYP.GRP10;
		}
		return null;
	}

}