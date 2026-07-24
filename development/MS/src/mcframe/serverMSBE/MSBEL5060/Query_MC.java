package mcframe.serverMSBE.MSBEL5060;

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

import java.util.ArrayList;

public class Query_MC {
	
	/**
	 * -- MSBEL5060_MAW_BOM_EX_Query_S01
	 */
	static MCQueryPlan MSBEL5060_MAW_BOM_EX_S01(CndR up0) {
		MAW_BOM_EX_R S0_W1 = MAW_BOM_EX_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MSW_INV_TRANS_R S1_W2 = MSW_INV_TRANS_R.create("W2");
		MAM_LOC_R S1_M1 = MAM_LOC_R.create("M1");
		MAM_SITE_R S1_M2 = MAM_SITE_R.create("M2");
		MAM_WG_R S1_M3 = MAM_WG_R.create("M3");
		MAM_LG_GRP_R S1_M4 = MAM_LG_GRP_R.create("M4");
		MAM_ALLOC_GRP_R S1_M5 = MAM_ALLOC_GRP_R.create("M5");
		MAM_LOC_GRP_R S1_M6 = MAM_LOC_GRP_R.create("M6");
		MAM_STK_GD_R S1_M8 = MAM_STK_GD_R.create("M8");
		
		MCDynamicSQLID DS0C_BASE = createDynamicSQLID("MSBEL5060_MAW_BOM_EX_S01_DS0C_BASE");
		MCDynamicSQLID DS0C_LOC = createDynamicSQLID("MSBEL5060_MAW_BOM_EX_S01_DS0C_LOC");
		MCDynamicSQLID DS0C_NOT_EXISTS = createDynamicSQLID("MSBEL5060_MAW_BOM_EX_S01_DS0C_NOT_EXISTS");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5060_MAW_BOM_EX_Query_S01")
					.mainQuery()
					.selectDistinct(
						nullValue().as("io_schd_typ"),
						nullValue().as("io_schd_sts_typ"),
						nullValue().as("trd_cd"),
						nullValue().as("trd_nm"),
						nullValue().as("trd_ptn_typ"),
						nullValue().as("trn_typ"),
						nullValue().as("io_act_typ"),
						nullValue().as("io_typ"),
						nullValue().as("dt"),
						S0_W1.itm_cd,
						S0_W1.itm_sub1,
						S0_W1.itm_sub2,
						S0_W1.itm_sub3,
						S0_M1.itm_nm,
						nvl(
							S0_M1.ver_flg,
							value(false)
						).as("ver_flg"),
						nullValue().as("ver_no"),
						nullValue().as("sno1"),
						nullValue().as("sno2"),
						nullValue().as("sno3"),
						nullValue().as("sno4"),
						addDynamicSelect(DS0C_LOC),
						nullValue().as("wg_cd"),
						value(0).as("gr_schd_qty"),
						value(0).as("gi_schd_qty"),
						value(0).as("gr_act_qty"),
						value(0).as("gi_act_qty"),
						value(0).as("stk_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M7.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						nullValue().as("slo_no"),
						nullValue().as("slo_d_no"),
						nullValue().as("po_no"),
						nullValue().as("po_d_no"),
						nullValue().as("mfg_inst_no"),
						nullValue().as("oper_inst_no"),
						nullValue().as("par_itm_cd"),
						nullValue().as("par_itm_sub1"),
						nullValue().as("par_itm_sub2"),
						nullValue().as("par_itm_sub3"),
						nullValue().as("par_itm_nm"),
						nullValue().as("par_lot_no"),
						nullValue().as("par_sublot_no"),
						nullValue().as("par_sno1"),
						nullValue().as("par_sno2"),
						nullValue().as("par_sno3"),
						nullValue().as("par_sno4"),
						nullValue().as("par_itm_ord_no"),
						nullValue().as("par_oper_ord_no"),
						nullValue().as("par_dt_fr"),
						nullValue().as("bom_ptn"),
						nullValue().as("mfg_act_no"),
						nullValue().as("oper_act_no"),
						nullValue().as("str_ln_cd"),
						nullValue().as("str_ln_nm"),
						value(false).as("prcd_flg"),
						value(false).as("sim_flg"),
						value(false).as("stk_flg"),
						nullValue().as("prsppl_cd"),
						nullValue().as("mfg_wg_cd"),
						value(0).as("std_upri")
					)
					.from(
						S0_W1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M7).on(
								bracket(
									S0_M1.unit_cd.eq(S0_M7.unit_cd)
								)
						)
						.addDynamicView(DS0C_BASE)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.ver_flg.eq(bind("ver_flg")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_W1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_W1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_W1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_W1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S1_W2
									.innerJoin(S1_M1).on(
										bracket(
											S1_W2.loc_cd.eq(S1_M1.loc_cd)
										)
									)
									.addDynamicView(DS0C_NOT_EXISTS)
								)
								.where(
									value(0).eq(value(0))
									.and(S0_W1.itm_cd.eq(S1_W2.itm_cd))
									.and(S0_W1.itm_sub1.eq(S1_W2.itm_sub1))
									.and(S0_W1.itm_sub2.eq(S1_W2.itm_sub2))
									.and(S0_W1.itm_sub3.eq(S1_W2.itm_sub3))
									.addDynamicPredicate(DS0C_NOT_EXISTS)
								)
							)
						)
						.addDynamicPredicate(DS0C_BASE)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(DS0C_BASE, v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd)))))
					.predicate(DS0C_BASE, p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),

				when(boundOr("site_nm"))
					.view(DS0C_NOT_EXISTS, v -> v.leftOuterJoin(S1_M2).on(bracket(S1_M1.site_cd.eq(S1_M2.site_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M2.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0C_NOT_EXISTS,v -> v.leftOuterJoin(S1_M3).on(bracket(S1_W2.wg_cd.eq(S1_M3.wg_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M3.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(DS0C_NOT_EXISTS,v -> v.leftOuterJoin(S1_M4).on(bracket(S1_M1.lg_grp_cd.eq(S1_M4.lg_grp_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M4.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(DS0C_NOT_EXISTS,v -> v.leftOuterJoin(S1_M5).on(bracket(S1_M1.alloc_grp_cd.eq(S1_M5.alloc_grp_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M5.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(DS0C_NOT_EXISTS,v -> v.leftOuterJoin(S1_M6).on(bracket(S1_M1.loc_grp_cd.eq(S1_M6.loc_grp_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M6.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("gd_nm"))
					.view(DS0C_NOT_EXISTS,v -> v.leftOuterJoin(S1_M8).on(bracket(S1_W2.gd_cd.eq(S1_M8.gd_cd))))
					.predicate(DS0C_NOT_EXISTS,p -> p.cutoff$and(S1_M8.gd_nm.like(bind("gd_nm")))),
					
				when(r -> MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("loc_cd"), nullValue().as("loc_nm")),
				when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("site_cd"), nullValue().as("site_nm")),
				when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("wg_nm")),
				when(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("lg_grp_cd"), nullValue().as("lg_grp_nm")),
				when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("alloc_grp_cd"), nullValue().as("alloc_grp_nm")),
				when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, nullValue().as("loc_grp_cd"), nullValue().as("loc_grp_nm"))
			);
	}
	
	/**
	 * -- MSBEL5060_MST_IO_ACT_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_IO_ACT_I01(CndR up0, String tgtTyp) {
		MSW_INV_TRANS_R S0 = MSW_INV_TRANS_R.create();
		
		mcframe.serverCore.queryapi.MCDBContainer S1_T1 = null;
		if (MSC_IO_SCHD_TGT_TYP.isACCRUAL(tgtTyp)) {
			S1_T1 = MSVT_ACCRUAL_IO_ACT_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp)) {
			S1_T1 = MSVT_ACCPT_IO_ACT_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp)) {
			S1_T1 = MSVT_AVL_IO_ACT_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isDTL(tgtTyp)) {
			S1_T1 = MST_IO_ACT_R.create("T1");
		}
		MCStringPermColumn S1_T1_gi_loc_cd = (MCStringPermColumn)S1_T1.getColumn$("gi_loc_cd");
		MCStringPermColumn S1_T1_gr_loc_cd = (MCStringPermColumn)S1_T1.getColumn$("gr_loc_cd");
		MCStringPermColumn S1_T1_io_typ = (MCStringPermColumn)S1_T1.getColumn$("io_typ");

		MSVT_LOT_LIST_R S1_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S1_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAVM_RD_LOC_R S1_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SUNDRY_ITM_R S1_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_LOC_R S1_M6 = MAM_LOC_R.create("M6");
		MAW_BOM_EX_R S2_V = MAW_BOM_EX_R.create("V");
		MAM_ITM_VER_R S3_V2 = MAM_ITM_VER_R.create("V2");
		
		// 出荷実績明細ＮＯから結合するパターン用
		MST_ARR_MAP_R S1_T4 = MST_ARR_MAP_R.create("T4");
		MST_SHIP_ACT_D_R S1_T5 = MST_SHIP_ACT_D_R.create("T5");
		MST_SHIP_ACT_R S1_T6 = MST_SHIP_ACT_R.create("T6");
		
		// インボイス出荷実績明細ＮＯから結合するパターン用
		MST_ARR_MAP_R S1_T7 = MST_ARR_MAP_R.create("T7");
		MST_IV_SHIP_ACT_D_R S1_T8 = MST_IV_SHIP_ACT_D_R.create("T8");
		MST_SHIP_ACT_D_R S1_T9 = MST_SHIP_ACT_D_R.create("T9");
		MST_SHIP_ACT_R S1_T10 = MST_SHIP_ACT_R.create("T10");
		
		MAM_ITM_GRP_R S1_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1_MM10 = MAM_ITM_GRP_R.create("MM10");

		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		MCPredicate tmp_GIGR_WHERE = null;
		boolean grFlg = up0.gr_act_flg();
		boolean giFlg = up0.gi_act_flg();
		if (grFlg && !giFlg) {
			tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value()));
		}
		else if (!grFlg && giFlg) {
			tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value()));
		}
		final MCPredicate GIGR_WHERE = tmp_GIGR_WHERE;

		return createQueryPlan()
			.setQuery(
				sql("MSBEL5060_MST_IO_ACT_Query_I01")
					.insert(S0)
					.columns(
						S0.trd_cd,
						S0.trd_ptn_typ,
						S0.trn_typ,
						S0.io_act_typ,
						S0.io_typ,
						S0.dt,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.ver_flg,
						S0.ver_no,
						S0.gd_cd,
						S0.quality_typ,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.loc_cd,
						S0.wg_cd,
						S0.gr_schd_qty,
						S0.gi_schd_qty,
						S0.gr_act_qty,
						S0.gi_act_qty,
						S0.stk_qty,
						S0.base_unit_cd,
						S0.base_unit_dec_place,
						S0.slo_no,
						S0.po_no,
						S0.mfg_inst_no,
						S0.par_itm_cd,
						S0.par_itm_sub1,
						S0.par_itm_sub2,
						S0.par_itm_sub3,
						S0.par_itm_nm,
						S0.par_lot_no,
						S0.par_sublot_no,
						S0.par_sno1,
						S0.par_sno2,
						S0.par_sno3,
						S0.par_sno4,
						S0.mfg_act_no,
						S0.oper_act_no,
						S0.str_ln_cd
					)
					.query(
						subQuery()
						.select(
							S1_T1.getColumn$("trd_cd"),
							S1_T1.getColumn$("trd_ptn_typ"),
							S1_T1.getColumn$("trn_typ"),
							S1_T1.getColumn$("io_act_typ"),
							S1_T1.getColumn$("io_typ"),
							S1_T1.getColumn$("ac_dt"),
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							nvl(
								S1_M1.ver_flg,
								value(false)
							),
							S1_T2.ver_no,
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							decode(
								(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
								value(MSC_IO_TYP.GI.value()),
								(MCStringPermColumn)S1_T1.getColumn$("gi_wg_cd"),
								(MCStringPermColumn)S1_T1.getColumn$("gr_wg_cd")
							),
							value(0),
							value(0),
							sum(
								decode(
									(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
									value(MSC_IO_TYP.GR.value()),
									(MCNumberPermColumn)S1_T1.getColumn$("base_unit_qty"),
									value(0)
								)
							),
							sum(
								decode(
									(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
									value(MSC_IO_TYP.GI.value()),
									(MCNumberPermColumn)S1_T1.getColumn$("base_unit_qty"),
									value(0)
								)
							),
							value(0),
							S1_T1.getColumn$("base_unit_cd"),
							S1_M1.dec_place,
							S1_T1.getColumn$("slo_no"),
							S1_T1.getColumn$("po_no"),
							S1_T1.getColumn$("mfg_inst_no"),
							S1_T1.getColumn$("par_itm_cd"),
							S1_T1.getColumn$("par_itm_sub1"),
							S1_T1.getColumn$("par_itm_sub2"),
							S1_T1.getColumn$("par_itm_sub3"),
							S1_T1.getColumn$("par_itm_nm"),
							S1_T1.getColumn$("par_lot_no"),
							S1_T1.getColumn$("par_sublot_no"),
							S1_T1.getColumn$("par_sno1"),
							S1_T1.getColumn$("par_sno2"),
							S1_T1.getColumn$("par_sno3"),
							S1_T1.getColumn$("par_sno4"),
							S1_T1.getColumn$("mfg_act_no"),
							S1_T1.getColumn$("oper_act_no"),
							S1_T1.getColumn$("str_ln_cd")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_T2.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_T2.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_T2.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_T2.lot_no.eq((MCStringPermColumn)S1_T1.getColumn$("lot_no")))
									.and(S1_T2.sublot_no.eq((MCStringPermColumn)S1_T1.getColumn$("sublot_no")))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1"))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M1.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M1.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M1.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
								)
							)
							.innerJoin(S1_M3).on(
								bracket(
									S1_M3.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("loc_cd"))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M4.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M4.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M4.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_M4.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1")))
									.and(S1_M4.sno2.eq((MCStringPermColumn)S1_T1.getColumn$("sno2")))
									.and(S1_M4.sno3.eq((MCStringPermColumn)S1_T1.getColumn$("sno3")))
									.and(S1_M4.sno4.eq((MCStringPermColumn)S1_T1.getColumn$("sno4")))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("gi_loc_cd"))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M6.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("gr_loc_cd"))
								)
							)
							// 出荷実績明細ＮＯから結合するパターン
							.leftOuterJoin(S1_T4).on(
								bracket(
									((MCStringPermColumn)S1_T1.getColumn$("trn_typ")).eq(value(MSC_TRN_TYP.ARR.value()))
									.and(S1_T4.arr_act_no.eq((MCStringPermColumn)S1_T1.getColumn$("act_no")))
									.and(S1_T4.ship_act_d_no.eq((MCStringPermColumn)S1_T1.getColumn$("act_d_no")))
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.ship_act_d_no.eq(S1_T4.ship_act_d_no)
								)
							)
							.leftOuterJoin(S1_T6).on(
								bracket(
									S1_T6.ship_act_no.eq(S1_T5.ship_act_no)
								)
							)
							// インボイス出荷実績明細ＮＯから結合するパターン
							.leftOuterJoin(S1_T7).on(
								bracket(
									((MCStringPermColumn)S1_T1.getColumn$("trn_typ")).eq(value(MSC_TRN_TYP.ARR.value()))
									.and(S1_T7.arr_act_no.eq((MCStringPermColumn)S1_T1.getColumn$("act_no")))
									.and(S1_T7.iv_ship_act_d_no.eq((MCStringPermColumn)S1_T1.getColumn$("act_d_no")))
								)
							)
							.leftOuterJoin(S1_T8).on(
								bracket(
									S1_T8.iv_ship_act_d_no.eq(S1_T7.iv_ship_act_d_no)
								)
							)
							.leftOuterJoin(S1_T9).on(
								bracket(
									S1_T9.ship_act_d_no.eq(S1_T8.ship_act_d_no)
								)
							)
							.leftOuterJoin(S1_T10).on(
								bracket(
									S1_T10.ship_act_no.eq(S1_T9.ship_act_no)
								)
							)
							.addDynamicView()
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(((MCDatePermColumn)S1_T1.getColumn$("ac_dt")).gt(bind("ac_dt")))
							.and(((MCDatePermColumn)S1_T1.getColumn$("ac_dt")).lte(bind("srch_dt_to")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("loc_cd")).like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(
								decode(
									(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
									value(MSC_IO_TYP.GI.value()),
									(MCStringPermColumn)S1_T1.getColumn$("gi_wg_cd"),
									(MCStringPermColumn)S1_T1.getColumn$("gr_wg_cd")
								).like(bind("wg_cd"))
							)
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("gd_cd")).like(bind("gd_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ1"))
								.and(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).isNull()
									.or(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).like(bind("quality_typ1")))
								)
							)
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ2")))
							.cutoff$and(S1_M1.ver_flg.eq(bind("ver_flg")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd1")).like(bind("itm_grp_cd1")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd2")).like(bind("itm_grp_cd2")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd3")).like(bind("itm_grp_cd3")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd4")).like(bind("itm_grp_cd4")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd5")).like(bind("itm_grp_cd5")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd6")).like(bind("itm_grp_cd6")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd7")).like(bind("itm_grp_cd7")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd8")).like(bind("itm_grp_cd8")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd9")).like(bind("itm_grp_cd9")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd10")).like(bind("itm_grp_cd10")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).like(bind("itm_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).like(bind("itm_sub1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).like(bind("itm_sub2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M4.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T2.ver_no.like(bind("ver_no")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno1")).like(bind("sno1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno2")).like(bind("sno2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno3")).like(bind("sno3")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno4")).like(bind("sno4")))
							.cutoff$and(S1_T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V)
										.where(
											value(0).eq(value(0))
											.and(
												decode(
													(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
													value(MSC_IO_TYP.GI.value()),
													(MCStringPermColumn)S1_T1.getColumn$("gi_wg_cd"),
													(MCStringPermColumn)S1_T1.getColumn$("gr_wg_cd")
												).eq(S2_V.wg_cd)
											)
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).eq(S2_V.itm_cd))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).eq(S2_V.itm_sub1))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).eq(S2_V.itm_sub2))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).eq(S2_V.itm_sub3))
											.and(bind("par_itm_cd").isNotNull())
											.and(
												nvl(
													S2_V.st_dt,
													bind("dt_to")
												).lte(bind("dt_to"))
											)
											.and(
												nvl(
													S2_V.end_dt,
													bind("dt_fr")
												).gte(bind("dt_fr"))
											)
										)
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_V2)
									.where(
										value(0).eq(value(0))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).eq(S3_V2.itm_cd))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).eq(S3_V2.itm_sub1))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).eq(S3_V2.itm_sub2))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).eq(S3_V2.itm_sub3))
										.and(S1_T2.ver_no.eq(S3_V2.ver_no))
										.and(S1_M3.site_cd.eq(S3_V2.site_cd))
										.and(S3_V2.purc_st_dt.gte(bind("purc_dt_fr")))
										.and(S3_V2.purc_st_dt.lte(bind("purc_dt_to")))
										.and(
											S3_V2.cmpl_flg.in(
												value(false),
												bind("cmpl_flg_str")
											)
										)
									)
								)
							)
							.addDynamicPredicate()
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
						.groupBy(
							S1_T1.getColumn$("trd_cd"),
							S1_T1.getColumn$("trd_ptn_typ"),
							S1_T1.getColumn$("trn_typ"),
							S1_T1.getColumn$("io_act_typ"),
							S1_T1.getColumn$("io_typ"),
							S1_T1.getColumn$("ac_dt"),
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							S1_M1.ver_flg,
							S1_T2.ver_no,
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							decode(
								(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
								value(MSC_IO_TYP.GI.value()),
								(MCStringPermColumn)S1_T1.getColumn$("gi_wg_cd"),
								(MCStringPermColumn)S1_T1.getColumn$("gr_wg_cd")
							),
							S1_T1.getColumn$("base_unit_cd"),
							S1_M1.dec_place,
							S1_T1.getColumn$("slo_no"),
							S1_T1.getColumn$("po_no"),
							S1_T1.getColumn$("mfg_inst_no"),
							S1_T1.getColumn$("par_itm_cd"),
							S1_T1.getColumn$("par_itm_sub1"),
							S1_T1.getColumn$("par_itm_sub2"),
							S1_T1.getColumn$("par_itm_sub3"),
							S1_T1.getColumn$("par_itm_nm"),
							S1_T1.getColumn$("par_lot_no"),
							S1_T1.getColumn$("par_sublot_no"),
							S1_T1.getColumn$("par_sno1"),
							S1_T1.getColumn$("par_sno2"),
							S1_T1.getColumn$("par_sno3"),
							S1_T1.getColumn$("par_sno4"),
							S1_T1.getColumn$("mfg_act_no"),
							S1_T1.getColumn$("oper_act_no"),
							S1_T1.getColumn$("str_ln_cd")
						)
					)
			)
			.setDynamicSQLInfo(
				when(r -> MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ()))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_T1_gi_loc_cd.neq(S1_T1_gr_loc_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.site_cd.neq(S1_M6.site_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.site_cd.neq(S1_M6.site_cd)
						.or(S1_T6.ac_dt.lte(bind("ac_dt")).or(S1_T10.ac_dt.lte(bind("ac_dt")))))))),
				when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.wg_cd.neq(S1_M6.wg_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.wg_cd.neq(S1_M6.wg_cd)
						.or(S1_T6.ac_dt.lte(bind("ac_dt")).or(S1_T10.ac_dt.lte(bind("ac_dt")))))))),
				when(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ()))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.lg_grp_cd.neq(S1_M6.lg_grp_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_M5.alloc_grp_cd.isNull().or(S1_M6.alloc_grp_cd.isNull()).or(S1_M5.alloc_grp_cd.neq(S1_M6.alloc_grp_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_M5.alloc_grp_cd.isNull().or(S1_M6.alloc_grp_cd.isNull()).or(S1_M5.alloc_grp_cd.neq(S1_M6.alloc_grp_cd)
						.or(S1_T6.ac_dt.lte(bind("ac_dt")).or(S1_T10.ac_dt.lte(bind("ac_dt")))))))),
				when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.loc_grp_cd.neq(S1_M6.loc_grp_cd))))),
				when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
					.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.loc_grp_cd.neq(S1_M6.loc_grp_cd)
						.or(S1_T6.ac_dt.lte(bind("ac_dt")).or(S1_T10.ac_dt.lte(bind("ac_dt")))))))),

				when(r -> GIGR_WHERE != null)
					.predicate(p -> p.and(GIGR_WHERE)),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S1_M2).on(bracket(S1_M1.itm_typ.eq(S1_M2.itm_typ).and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM1).on(S1_M1.itm_grp_cd1.eq(S1_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM2).on(S1_M1.itm_grp_cd2.eq(S1_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM3).on(S1_M1.itm_grp_cd3.eq(S1_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM4).on(S1_M1.itm_grp_cd4.eq(S1_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM5).on(S1_M1.itm_grp_cd5.eq(S1_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM6).on(S1_M1.itm_grp_cd6.eq(S1_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM7).on(S1_M1.itm_grp_cd7.eq(S1_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM8).on(S1_M1.itm_grp_cd8.eq(S1_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM9).on(S1_M1.itm_grp_cd9.eq(S1_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM10).on(S1_M1.itm_grp_cd10.eq(S1_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	/**
	 * -- MSBEL5060_MST_PRCD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_PRCD_IO_SCHD_I01(CndR up0, String tgtTyp) {
		return MSBEL5060_MST_IO_SCHD_I01(up0, "MST_PRCD_IO_SCHD", tgtTyp, true, false, false, false, 0, false);
	}
	/**
	 * -- MSBEL5060_MST_ORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_ORD_IO_SCHD_I01(CndR up0, String tgtTyp) {
		return MSBEL5060_MST_IO_SCHD_I01(up0, "MST_ORD_IO_SCHD", tgtTyp, false, true, false, false, 0, false);
	}
	/**
	 * -- MSBEL5060_MST_SAVORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_SAVORD_IO_SCHD_I01(CndR up0, String tgtTyp) {
		return MSBEL5060_MST_IO_SCHD_I01(up0, "MST_SAVORD_IO_SCHD", tgtTyp, false, false, true, false, 0, false);
	}
	/**
	 * -- MSBEL5060_MST_SIM_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_SIM_IO_SCHD_I01(CndR up0, String tgtTyp) {
		return MSBEL5060_MST_IO_SCHD_I01(up0, "MST_SIM_IO_SCHD", tgtTyp, false, false, false, false, 0, true);
	}
	/**
	 * -- MSBEL5060_MST_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_IO_SCHD_I01(CndR up0, String fromTable, String tgtTyp, int no) {
		return MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, false, false, false, true, no, false);
	}
	/**
	 * -- MSBEL5060_MST_IO_SCHD_Query_I01 : core
	 */
	static MCQueryPlan MSBEL5060_MST_IO_SCHD_I01(CndR up0, String fromTable, String tgtTyp, boolean prcd_flg, boolean opn_flg, boolean sav_flg, boolean schd_flg, int no, boolean sim_flg) {
		MSW_INV_TRANS_R S0 = MSW_INV_TRANS_R.create();
		
		mcframe.serverCore.queryapi.MCDBContainer S1_T1 = null;
		String sqlId = "MSBEL5060_MST_IO_SCHD_Query_I01";
		if (isSame(fromTable, "MST_PRCD_IO_SCHD")) {
			S1_T1 = MST_PRCD_IO_SCHD_R.create("T1");
			sqlId = "MSBEL5060_MST_PRCD_IO_SCHD_Query_I01";
		}
		else if (isSame(fromTable, "MST_ORD_IO_SCHD")) {
			S1_T1 = MST_ORD_IO_SCHD_R.create("T1");
			sqlId = "MSBEL5060_MST_ORD_IO_SCHD_Query_I01";
		}
		else if (isSame(fromTable, "MST_SAVORD_IO_SCHD")) {
			S1_T1 = MST_SAVORD_IO_SCHD_R.create("T1");
			sqlId = "MSBEL5060_MST_SAVORD_IO_SCHD_Query_I01";
		}
		else if (isSame(fromTable, "MSVT_ACCRUAL_IO_SCHD")) {
			S1_T1 = MSVT_ACCRUAL_IO_SCHD_R.create("T1");
		}
		else if (isSame(fromTable, "MSVT_ACCPT_IO_SCHD")) {
			S1_T1 = MSVT_ACCPT_IO_SCHD_R.create("T1");
		}
		else if (isSame(fromTable, "MSVT_AVL_IO_SCHD")) {
			S1_T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		}
		else if (isSame(fromTable, "MST_IO_SCHD")) {
			S1_T1 = MST_IO_SCHD_R.create("T1");
		}
		else if (isSame(fromTable, "MST_SIM_IO_SCHD")) {
			S1_T1 = MST_SIM_IO_SCHD_R.create("T1");
			sqlId = "MSBEL5060_MST_SIM_IO_SCHD_Query_I01";
		}
		MCDatePermColumn S1_T1_schd_dt = (MCDatePermColumn)S1_T1.getColumn$("schd_dt");
		MCDatePermColumn tmp_S1_T1_accpt_schd_dt = (MCDatePermColumn)S1_T1.getColumn$("accpt_schd_dt");
		MCDatePermColumn S1_T1_accpt_schd_dt = tmp_S1_T1_accpt_schd_dt == null ? S1_T1_schd_dt : tmp_S1_T1_accpt_schd_dt; // when評価時のnvlのNullPointerExを回避するため
		MCDatePermColumn tmp_S1_T1_avl_schd_dt = (MCDatePermColumn)S1_T1.getColumn$("avl_schd_dt");
		MCDatePermColumn S1_T1_avl_schd_dt = tmp_S1_T1_avl_schd_dt == null ? S1_T1_schd_dt : tmp_S1_T1_avl_schd_dt; // when評価時のnvlのNullPointerExを回避するため
		MCStringPermColumn S1_T1_gi_loc_cd = (MCStringPermColumn)S1_T1.getColumn$("gi_loc_cd");
		MCStringPermColumn S1_T1_gr_loc_cd = (MCStringPermColumn)S1_T1.getColumn$("gr_loc_cd");
		MCStringPermColumn S1_T1_io_typ = (MCStringPermColumn)S1_T1.getColumn$("io_typ");
		MCStringPermColumn S1_T1_io_schd_no = (MCStringPermColumn)S1_T1.getColumn$("io_schd_no");
		MCStringPermColumn S1_T1_io_schd_typ = (MCStringPermColumn)S1_T1.getColumn$("io_schd_typ");
		MCStringPermColumn S1_T1_io_schd_sts_typ = (MCStringPermColumn)S1_T1.getColumn$("io_schd_sts_typ");
		MCStringPermColumn S1_T1_io_schd_pr_no = (MCStringPermColumn)S1_T1.getColumn$("io_schd_pr_no");
		MCStringPermColumn S1_T1_stk_id_typ = (MCStringPermColumn)S1_T1.getColumn$("stk_id_typ");
		MCStringPermColumn tmp_S1_T1_sim_mrp_no = null;
		if (sim_flg) {
			tmp_S1_T1_sim_mrp_no = (MCStringPermColumn)S1_T1.getColumn$("sim_mrp_no");
		}
		MCStringPermColumn S1_T1_sim_mrp_no = tmp_S1_T1_sim_mrp_no;
		MSVT_LOT_LIST_R S1_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S1_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAVM_RD_LOC_R S1_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SUNDRY_ITM_R S1_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_LOC_R S1_M6 = MAM_LOC_R.create("M6");
		MAW_BOM_EX_R S2_V = MAW_BOM_EX_R.create("V");
		MAM_ITM_VER_R S3_V2 = MAM_ITM_VER_R.create("V2");
		MST_PRCD_ITM_ORDER_R S4_W1 = MST_PRCD_ITM_ORDER_R.create("W1");
		MAM_ITM_DTL_R S4_W2 = MAM_ITM_DTL_R.create("W2");
		MST_IO_SCHD_R S5_W = MST_IO_SCHD_R.create("W");
		MSC_IO_SCHD_TYP_MAP_R S5_C = MSC_IO_SCHD_TYP_MAP_R.create("C");
		MST_SIM_ITM_ORDER_R S6_T1 = MST_SIM_ITM_ORDER_R.create("SORD");
		
		// 出荷実績明細ＮＯから結合するパターン用
		MST_SHIP_ACT_D_R S1_T4 = MST_SHIP_ACT_D_R.create("T4");
		MST_SHIP_ACT_R S1_T5 = MST_SHIP_ACT_R.create("T5");
		
		// インボイス出荷実績明細ＮＯから結合するパターン用
		MST_IV_SHIP_ACT_D_R S1_T6 = MST_IV_SHIP_ACT_D_R.create("T6");
		MST_SHIP_ACT_D_R S1_T7 = MST_SHIP_ACT_D_R.create("T7");
		MST_SHIP_ACT_R S1_T8 = MST_SHIP_ACT_R.create("T8");
		
		MAM_ITM_GRP_R S1_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1_MM10 = MAM_ITM_GRP_R.create("MM10");

		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_S1_T1_DT = createDynamicSQLID("DS0C_S1_T1_DT");
		
		MCPredicate tmp_GIGR_WHERE = null;
		MCPredicate tmp_IO_SCHD_WHERE = null;
		if (prcd_flg || sav_flg) {
			boolean grFlg = false;
			boolean giFlg = false;
			if (prcd_flg) {
				grFlg = up0.gr_prcd_flg();
				giFlg = up0.gi_prcd_flg();
			}
			else if (sav_flg) {
				grFlg = up0.gr_sts_ordsav_grp_flg();
				giFlg = up0.gi_sts_ordsav_grp_flg();
			}
			if (grFlg && !giFlg) {
				tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value()));
			}
			else if (!grFlg && giFlg) {
				tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value()));
			}
		}
		else if (opn_flg) {
			boolean grFlg = up0.gr_sts_opn_grp_flg();
			boolean giFlg = up0.gi_sts_opn_grp_flg();
			boolean ordsavFlg = up0.gi_sts_ordsav_grp_flg();
			if (grFlg && !giFlg && !ordsavFlg) {
				// 入庫のみ
				tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value()));
			}
			else if (!grFlg && (giFlg || ordsavFlg)) {
				// 出庫のみ
				if (!giFlg && ordsavFlg) {
					tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value())).and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())));
				}
				else if (giFlg && !ordsavFlg) {
					// 未確定のみ
					tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value())).and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.OPN.value())));
				}
				else {
					// 未確定および保存（受払予定状況区分に対する絞り込みは不要）
					tmp_GIGR_WHERE = S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value()));
				}
			}
			else {
				// 入庫および出庫
				if (!giFlg && ordsavFlg) {
					// 入庫および出庫（保存）
					tmp_GIGR_WHERE = bracket(
							S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value()))
							.or(S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value())).and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()))))
						);
				}
				else if (giFlg && !ordsavFlg) {
					// 入庫および出庫（未確定）
					tmp_GIGR_WHERE = bracket(
							S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value()))
							.or(S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value())).and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.OPN.value()))))
						);
				}
				else {
					// 入庫および出庫（保存、未確定両方）
					// ※入出庫区分および受払予定状況区分に対する絞り込みは不要
				}
			}
		}
		else if (schd_flg) {
			tmp_GIGR_WHERE = value(0).eq(value(1));
			// 入庫ステータスによる絞込み
			if (up0.gr_sts_fix_grp_flg() || up0.gr_sts_schd_grp_flg() || up0.gr_sts_ord_grp_flg()) {
				ArrayList<MCStringValue> inSql = new ArrayList<>();
				for (MSC_IO_SCHD_STS_TYP stsTyp : MSC_IO_SCHD_STS_TYP.array()) {
					if (up0.gr_sts_fix_grp_flg() && MSC_IO_SCHD_STS_TYP.is_fix_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
					if (up0.gr_sts_schd_grp_flg() && MSC_IO_SCHD_STS_TYP.is_schd_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
					if (up0.gr_sts_ord_grp_flg() && MSC_IO_SCHD_STS_TYP.is_ord_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
				}
				tmp_GIGR_WHERE = tmp_GIGR_WHERE.or(S1_T1_io_typ.eq(value(MSC_IO_TYP.GR.value())));
				if (!inSql.isEmpty()) {
					tmp_GIGR_WHERE = tmp_GIGR_WHERE.and(S1_T1_io_schd_sts_typ.in(inSql.toArray(new MCStringValue[0])));
				}
			}
			// 出庫ステータスによる絞込み
			if (up0.gi_sts_fix_grp_flg() || up0.gi_sts_schd_grp_flg() || up0.gi_sts_ord_grp_flg()) {
				ArrayList<MCStringValue> inSql = new ArrayList<>();
				for (MSC_IO_SCHD_STS_TYP stsTyp :MSC_IO_SCHD_STS_TYP.array()) {
					if (up0.gi_sts_fix_grp_flg() && MSC_IO_SCHD_STS_TYP.is_fix_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
					if (up0.gi_sts_schd_grp_flg() && MSC_IO_SCHD_STS_TYP.is_schd_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
					if (up0.gi_sts_ord_grp_flg() && MSC_IO_SCHD_STS_TYP.is_ord_grp(stsTyp.value())) {
						inSql.add(value(stsTyp.value()));
					}
				}

				tmp_GIGR_WHERE = tmp_GIGR_WHERE.or(S1_T1_io_typ.eq(value(MSC_IO_TYP.GI.value())));
				if (!inSql.isEmpty()) {
					tmp_GIGR_WHERE = tmp_GIGR_WHERE.and(S1_T1_io_schd_sts_typ.in(inSql.toArray(new MCStringValue[0])));
				}
			}
			tmp_GIGR_WHERE = bracket(tmp_GIGR_WHERE);
		}
		
		if (schd_flg) {
			// 引当済みの出庫予定を取得する
			if (no == 1) {
				tmp_IO_SCHD_WHERE = S1_T1_io_schd_typ.in(value(MSC_IO_SCHD_TYP.INPT.value()), value(MSC_IO_SCHD_TYP.ACXFR_GI.value()), value(MSC_IO_SCHD_TYP.SCRP.value()));
				tmp_IO_SCHD_WHERE = tmp_IO_SCHD_WHERE.and(((MCBooleanPermColumn)S1_T1.getColumn$("alloc_flg")).eq(value(true)));
			}
			// 引当済みの出庫予定と関連する出庫予定、入庫予定を取得する
			else if (no == 2) {
				tmp_IO_SCHD_WHERE = exists(
						subQuery()
						.select(value("X"))
						.from(
							S5_W
							.innerJoin(S5_C).on(bracket(
								S5_W.io_schd_typ.eq(S5_C.io_schd_typ)
							))
						)
						.where(
							value(0).eq(value(0))
							.and(S5_C.rel_io_schd_typ.eq(S1_T1_io_schd_typ))
							.and(S5_W.io_schd_sts_typ.eq(S1_T1_io_schd_sts_typ))
							.and(S5_W.io_schd_no.eq(S1_T1_io_schd_no))
							.and(MSC_IO_SCHD_TYP$IS_XFR_GI_ALL(S5_W.io_schd_typ).eq(value(true)))
							.and(S5_W.alloc_flg.eq(value(true)))
						)
				);
			}
			// 実績登録済みの出庫予定、入庫予定を取得する
			else if (no == 3) {
				ArrayList<MCStringValue> inSql = new ArrayList<>();
				MSC_IO_SCHD_TYP[] typs = {
					MSC_IO_SCHD_TYP.XFR_GI, MSC_IO_SCHD_TYP.XFR_GI_PROV, MSC_IO_SCHD_TYP.XFR_RTN_GI, MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV,
					MSC_IO_SCHD_TYP.XFR_IN, MSC_IO_SCHD_TYP.XFR_IN_PROV, MSC_IO_SCHD_TYP.XFR_OUT, MSC_IO_SCHD_TYP.XFR_OUT_PROV,
					MSC_IO_SCHD_TYP.XFR_GR, MSC_IO_SCHD_TYP.XFR_GR_PROV, MSC_IO_SCHD_TYP.XFR_RTN_GR, MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV,
					MSC_IO_SCHD_TYP.ACXFR_GI_XFR
					};
				for (MSC_IO_SCHD_TYP typ : typs) {
					inSql.add(value(typ.value()));
				}
				tmp_IO_SCHD_WHERE = S1_T1_io_schd_typ.in(inSql.toArray(new MCStringValue[0]));
				tmp_IO_SCHD_WHERE = tmp_IO_SCHD_WHERE.and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.SHIP.value())));
			}
			// 実績登録済みの出庫予定、入庫予定を取得する
			else if (no == 4) {
				ArrayList<MCStringValue> inSql = new ArrayList<>();
				MSC_IO_SCHD_TYP[] typs = {
					MSC_IO_SCHD_TYP.XFR_OUT, MSC_IO_SCHD_TYP.XFR_OUT_PROV,
					MSC_IO_SCHD_TYP.XFR_GR, MSC_IO_SCHD_TYP.XFR_GR_PROV, MSC_IO_SCHD_TYP.XFR_RTN_GR, MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV,
					MSC_IO_SCHD_TYP.ACXFR_GI_XFR
					};
				for (MSC_IO_SCHD_TYP typ : typs) {
					inSql.add(value(typ.value()));
				}
				tmp_IO_SCHD_WHERE = S1_T1_io_schd_typ.in(inSql.toArray(new MCStringValue[0]));
				tmp_IO_SCHD_WHERE = tmp_IO_SCHD_WHERE.and(S1_T1_io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.EX.value())));
			}
			// 上記以外の予定
			else if (no == 5) {
				ArrayList<MCStringValue> inSql = new ArrayList<>();
				MSC_IO_SCHD_TYP[] typs = {
						MSC_IO_SCHD_TYP.SLS, MSC_IO_SCHD_TYP.SLS_ACXFR, MSC_IO_SCHD_TYP.SLS_RTN_GI, MSC_IO_SCHD_TYP.SLS_RTN_GR,
						MSC_IO_SCHD_TYP.SLS_RTN_GI_ACXFR, MSC_IO_SCHD_TYP.SLS_RTN_GR_ACXFR, MSC_IO_SCHD_TYP.MFG, MSC_IO_SCHD_TYP.BYMFG,
						MSC_IO_SCHD_TYP.PURC_GI, MSC_IO_SCHD_TYP.PURC_GR, MSC_IO_SCHD_TYP.PURC_XFR_OUT,
						MSC_IO_SCHD_TYP.PURC_GI_PROV, MSC_IO_SCHD_TYP.PURC_GR_PROV, MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV, MSC_IO_SCHD_TYP.PURC_GR_DDLV,
						MSC_IO_SCHD_TYP.SHIP_OUT, MSC_IO_SCHD_TYP.SHIP_IN, MSC_IO_SCHD_TYP.SHIP_RTN_GI, MSC_IO_SCHD_TYP.SHIP_RTN_GR,
						MSC_IO_SCHD_TYP.ARR, MSC_IO_SCHD_TYP.ARR_PROV, MSC_IO_SCHD_TYP.ARR_RTN, MSC_IO_SCHD_TYP.ARR_RTN_PROV, MSC_IO_SCHD_TYP.ACXFR_GR,
						MSC_IO_SCHD_TYP.INSP_CMPL_GI, MSC_IO_SCHD_TYP.INSP_CMPL_GR
					};
				for (MSC_IO_SCHD_TYP typ : typs) {
					inSql.add(value(typ.value()));
				}
				tmp_IO_SCHD_WHERE = S1_T1_io_schd_typ.in(inSql.toArray(new MCStringValue[0]));
			}
		}
		

		final MCPredicate GIGR_WHERE = tmp_GIGR_WHERE;
		final MCPredicate IO_SCHD_WHERE = tmp_IO_SCHD_WHERE;
		
		return createQueryPlan()
			.setQuery(
				sql(sqlId)
					.insert(S0)
					.columns(
						S0.io_schd_typ,
						S0.io_schd_sts_typ,
						S0.io_typ,
						S0.dt,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.ver_flg,
						S0.ver_no,
						S0.gd_cd,
						S0.quality_typ,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.loc_cd,
						S0.wg_cd,
						S0.gr_schd_qty,
						S0.gi_schd_qty,
						S0.gr_act_qty,
						S0.gi_act_qty,
						S0.stk_qty,
						S0.base_unit_cd,
						S0.base_unit_dec_place,
						S0.io_schd_no,
						S0.io_schd_sub_typ1,
						S0.io_schd_sub_no1,
						S0.io_schd_sub_typ2,
						S0.io_schd_sub_no2,
						S0.io_schd_sub_typ3,
						S0.io_schd_sub_no3,
						S0.io_schd_sub_typ4,
						S0.io_schd_sub_no4,
						S0.str_ln_cd,
						S0.prcd_flg,
						S0.sim_flg
					)
					.query(
						subQuery()
						.select(
							S1_T1.getColumn$("io_schd_typ"),
							S1_T1.getColumn$("io_schd_sts_typ"),
							S1_T1.getColumn$("io_typ"),
							addDynamicSelect(DS0C_S1_T1_DT),
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							nvl(
								S1_M1.ver_flg,
								value(false)
							),
							S1_T1.getColumn$("ver_no"),
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							S1_T1.getColumn$("wg_cd"),
							sum(
								decode(
									(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
									value(MSC_IO_TYP.GR.value()),
									(MCNumberPermColumn)S1_T1.getColumn$("base_unit_qty"),
									value(0)
								)
							),
							sum(
								decode(
									(MCStringPermColumn)S1_T1.getColumn$("io_typ"),
									value(MSC_IO_TYP.GI.value()),
									(MCNumberPermColumn)S1_T1.getColumn$("base_unit_qty"),
									value(0)
								)
							),
							value(0),
							value(0),
							value(0),
							S1_T1.getColumn$("base_unit_cd"),
							S1_M1.dec_place,
							S1_T1.getColumn$("io_schd_no"),
							S1_T1.getColumn$("io_schd_sub_typ1"),
							S1_T1.getColumn$("io_schd_sub_no1"),
							S1_T1.getColumn$("io_schd_sub_typ2"),
							S1_T1.getColumn$("io_schd_sub_no2"),
							S1_T1.getColumn$("io_schd_sub_typ3"),
							S1_T1.getColumn$("io_schd_sub_no3"),
							S1_T1.getColumn$("io_schd_sub_typ4"),
							S1_T1.getColumn$("io_schd_sub_no4"),
							S1_T1.getColumn$("str_ln_cd"),
							bind("tmp_prcd_flg"),
							bind("tmp_sim_flg")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_T2.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_T2.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_T2.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_T2.lot_no.eq((MCStringPermColumn)S1_T1.getColumn$("lot_no")))
									.and(S1_T2.sublot_no.eq((MCStringPermColumn)S1_T1.getColumn$("sublot_no")))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1"))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
										S1_M1.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M1.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M1.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M1.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
								)
							)
							.innerJoin(S1_M3).on(
								bracket(
									S1_M3.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("loc_cd"))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
										S1_M4.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M4.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M4.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M4.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_M4.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1")))
									.and(S1_M4.sno2.eq((MCStringPermColumn)S1_T1.getColumn$("sno2")))
									.and(S1_M4.sno3.eq((MCStringPermColumn)S1_T1.getColumn$("sno3")))
									.and(S1_M4.sno4.eq((MCStringPermColumn)S1_T1.getColumn$("sno4")))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("gi_loc_cd"))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M6.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("gr_loc_cd"))
								)
							)
							// 出荷実績明細ＮＯから結合するパターン
							.leftOuterJoin(S1_T4).on(
								bracket(
									((MCStringPermColumn)S1_T1.getColumn$("io_schd_sts_typ")).eq(value(MSC_IO_SCHD_STS_TYP.SHIP.value()))
									.and(S1_T4.ship_act_d_no.eq((MCStringPermColumn)S1_T1.getColumn$("io_schd_no")))
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.ship_act_no.eq(S1_T4.ship_act_no)
								)
							)
							// インボイス出荷実績明細ＮＯから結合するパターン
							.leftOuterJoin(S1_T6).on(
								bracket(
									((MCStringPermColumn)S1_T1.getColumn$("io_schd_sts_typ")).eq(value(MSC_IO_SCHD_STS_TYP.EX.value()))
									.and(S1_T6.iv_ship_act_d_no.eq((MCStringPermColumn)S1_T1.getColumn$("io_schd_no")))
								)
							)
							.leftOuterJoin(S1_T7).on(
								bracket(
									S1_T7.ship_act_d_no.eq(S1_T6.ship_act_d_no)
								)
							)
							.leftOuterJoin(S1_T8).on(
								bracket(
									S1_T8.ship_act_no.eq(S1_T7.ship_act_no)
								)
							)
							.addDynamicView()
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("loc_cd")).like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("wg_cd")).like(bind("wg_cd")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("gd_cd")).like(bind("gd_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ1"))
								.and(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).isNull()
									.or(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).like(bind("quality_typ1")))
								)
							)
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ2")))
							.cutoff$and(S1_M1.ver_flg.eq(bind("ver_flg")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd1")).like(bind("itm_grp_cd1")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd2")).like(bind("itm_grp_cd2")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd3")).like(bind("itm_grp_cd3")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd4")).like(bind("itm_grp_cd4")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd5")).like(bind("itm_grp_cd5")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd6")).like(bind("itm_grp_cd6")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd7")).like(bind("itm_grp_cd7")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd8")).like(bind("itm_grp_cd8")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd9")).like(bind("itm_grp_cd9")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd10")).like(bind("itm_grp_cd10")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).like(bind("itm_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).like(bind("itm_sub1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).like(bind("itm_sub2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M4.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("ver_no")).like(bind("ver_no")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno1")).like(bind("sno1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno2")).like(bind("sno2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno3")).like(bind("sno3")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno4")).like(bind("sno4")))
							.cutoff$and(S1_T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V)
										.where(
											value(0).eq(value(0))
											.and(S2_V.wg_cd.eq((MCStringPermColumn)S1_T1.getColumn$("wg_cd")))
											.and(S2_V.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd")))
											.and(S2_V.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
											.and(S2_V.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
											.and(S2_V.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
											.and(bind("par_itm_cd").isNotNull())
											.and(
												nvl(
													S2_V.st_dt,
													bind("dt_to")
												).lte(bind("dt_to"))
											)
											.and(
												nvl(
													S2_V.end_dt,
													bind("dt_fr")
												).gte(bind("dt_fr"))
											)
										)
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_V2)
									.where(
										value(0).eq(value(0))
										.and(S3_V2.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd")))
										.and(S3_V2.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
										.and(S3_V2.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
										.and(S3_V2.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
										.and(S3_V2.ver_no.eq((MCStringPermColumn)S1_T1.getColumn$("ver_no")))
										.and(S1_M3.site_cd.eq(S3_V2.site_cd))
										.and(S3_V2.purc_st_dt.gte(bind("purc_dt_fr")))
										.and(S3_V2.purc_st_dt.lte(bind("purc_dt_to")))
										.and(
											S3_V2.cmpl_flg.in(
												value(false),
												bind("cmpl_flg_str")
											)
										)
									)
								)
							)
							.addDynamicPredicate()
							.addDynamicPredicate(DS0C_S1_T1_DT)
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
						.groupBy(
							S1_T1.getColumn$("io_schd_typ"),
							S1_T1.getColumn$("io_schd_sts_typ"),
							S1_T1.getColumn$("io_typ"),
							addDynamicGroupBy(DS0C_S1_T1_DT),
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							S1_M1.ver_flg,
							S1_T1.getColumn$("ver_no"),
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							S1_T1.getColumn$("wg_cd"),
							S1_T1.getColumn$("base_unit_cd"),
							S1_M1.dec_place,
							S1_T1.getColumn$("io_schd_no"),
							S1_T1.getColumn$("io_schd_sub_typ1"),
							S1_T1.getColumn$("io_schd_sub_no1"),
							S1_T1.getColumn$("io_schd_sub_typ2"),
							S1_T1.getColumn$("io_schd_sub_no2"),
							S1_T1.getColumn$("io_schd_sub_typ3"),
							S1_T1.getColumn$("io_schd_sub_no3"),
							S1_T1.getColumn$("io_schd_sub_typ4"),
							S1_T1.getColumn$("io_schd_sub_no4"),
							S1_T1.getColumn$("str_ln_cd")
						)
					)
				)
				.setDynamicSQLInfo(
					when(r -> schd_flg || MSC_IO_SCHD_TGT_TYP.isACCRUAL(tgtTyp) || MSC_IO_SCHD_TGT_TYP.isDTL(tgtTyp))
						.select(DS0C_S1_T1_DT, S1_T1_schd_dt)
						.predicate(DS0C_S1_T1_DT, p -> p.and(S1_T1_schd_dt.lte(bind("tmp_dt_to"))))
						.groupBy(DS0C_S1_T1_DT, S1_T1_schd_dt),
					when(r -> !schd_flg && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.select(DS0C_S1_T1_DT, coalesce(S1_T1_accpt_schd_dt, S1_T1_schd_dt).as("dt"))
						.predicate(DS0C_S1_T1_DT, p -> p.and(coalesce(S1_T1_accpt_schd_dt, S1_T1_schd_dt).lte(bind("tmp_dt_to"))))
						.groupBy(DS0C_S1_T1_DT, coalesce(S1_T1_accpt_schd_dt, S1_T1_schd_dt)),
					when(r -> !schd_flg && MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp))
						.select(DS0C_S1_T1_DT, coalesce(S1_T1_avl_schd_dt, S1_T1_schd_dt).as("dt"))
						.predicate(DS0C_S1_T1_DT, p -> p.and(coalesce(S1_T1_avl_schd_dt, S1_T1_schd_dt).lte(bind("tmp_dt_to"))))
						.groupBy(DS0C_S1_T1_DT, coalesce(S1_T1_avl_schd_dt, S1_T1_schd_dt)),
					
					when(r -> MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ()))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_T1_gi_loc_cd.neq(S1_T1_gr_loc_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.site_cd.neq(S1_M6.site_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.site_cd.neq(S1_M6.site_cd)
							.or(S1_T5.ac_dt.lte(bind("ac_dt")).or(S1_T8.ac_dt.lte(bind("ac_dt")))))))),
					when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.wg_cd.neq(S1_M6.wg_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.wg_cd.neq(S1_M6.wg_cd)
							.or(S1_T5.ac_dt.lte(bind("ac_dt")).or(S1_T8.ac_dt.lte(bind("ac_dt")))))))),
					when(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ()))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.lg_grp_cd.neq(S1_M6.lg_grp_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_M5.alloc_grp_cd.isNull().or(S1_M6.alloc_grp_cd.isNull()).or(S1_M5.alloc_grp_cd.neq(S1_M6.alloc_grp_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_M5.alloc_grp_cd.isNull().or(S1_M6.alloc_grp_cd.isNull()).or(S1_M5.alloc_grp_cd.neq(S1_M6.alloc_grp_cd)
							.or(S1_T5.ac_dt.lte(bind("ac_dt")).or(S1_T8.ac_dt.lte(bind("ac_dt")))))))),
					when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()) && MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.loc_grp_cd.neq(S1_M6.loc_grp_cd))))),
					when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()) && !MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp))
						.predicate(p -> p.and(bracket(S1_T1_gi_loc_cd.isNull().or(S1_T1_gr_loc_cd.isNull()).or(S1_M5.loc_grp_cd.neq(S1_M6.loc_grp_cd)
							.or(S1_T5.ac_dt.lte(bind("ac_dt")).or(S1_T8.ac_dt.lte(bind("ac_dt")))))))),
					
					when(r -> GIGR_WHERE != null)
						.predicate(p -> p.and(GIGR_WHERE)),
					when(r -> IO_SCHD_WHERE != null)
						.predicate(p -> p.and(IO_SCHD_WHERE)),
					
					when(r -> prcd_flg)
						.predicate(p -> p.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_W1
										.innerJoin(S4_W2).on(bracket(
												S4_W1.itm_cd.eq(S4_W2.itm_cd)
											.and(S4_W1.itm_sub1.eq(S4_W2.itm_sub1))
											.and(S4_W1.itm_sub2.eq(S4_W2.itm_sub2))
											.and(S4_W1.itm_sub3.eq(S4_W2.itm_sub3))
											.and(S4_W1.mfg_loc_cd.eq(S4_W2.mfg_loc_cd))
											.and(S4_W1.sppl_cd.eq(S4_W2.sppl_cd))
											.and(S4_W1.maker_cd.eq(S4_W2.maker_cd))
											.and(S4_W1.rqst_loc_cd.eq(S4_W2.rqst_loc_cd))
											.and(S4_W1.wg_cd.eq(S4_W2.wg_cd))
											.and(S4_W1.bom_ptn.eq(S4_W2.bom_ptn))
											.and(S4_W1.master_dt.between(S4_W2.st_dt, S4_W2.end_dt))
											.and(S4_W2.pre_po_tgt_flg.eq(value(true)))
										))
									)
									.where(
										S1_T1_io_schd_no.eq(S4_W1.itm_ord_no)
									)
								)
						)),
						
					when(r -> schd_flg && MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp))
						.predicate(p -> p.and(
										S1_T1_stk_id_typ.in(
											value(MSC_STK_ID_TYP.COSTK.value()),
											value(MSC_STK_ID_TYP.CSTSTK.value()),
											value(MSC_STK_ID_TYP.RNT_RCV.value()),
											value(MSC_STK_ID_TYP.NCV_RCV.value()),
											value(MSC_STK_ID_TYP.ONR_PROV.value())
									))
						),
					
					when(r -> sim_flg)
						.predicate(p -> p.and(S1_T1_sim_mrp_no.eq(bind("sim_mrp_no")))
								.and(S1_T1_io_schd_sts_typ.in(value(MSC_IO_SCHD_STS_TYP.OPN.value()), value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())))
								.and(exists(
									subQuery()
									.select(value("X"))
									.from(S6_T1)
									.where(
										value(0).eq(value(0))
										.and(S1_T1_sim_mrp_no.eq(S6_T1.sim_mrp_no))
										.and(S1_T1_io_schd_pr_no.eq(S6_T1.itm_ord_no))
									)
								))
								),
					
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S1_M2).on(bracket(S1_M1.itm_typ.eq(S1_M2.itm_typ).and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd)))))
						.predicate(p -> p.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM1).on(S1_M1.itm_grp_cd1.eq(S1_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM2).on(S1_M1.itm_grp_cd2.eq(S1_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM3).on(S1_M1.itm_grp_cd3.eq(S1_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM4).on(S1_M1.itm_grp_cd4.eq(S1_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM5).on(S1_M1.itm_grp_cd5.eq(S1_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM6).on(S1_M1.itm_grp_cd6.eq(S1_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM7).on(S1_M1.itm_grp_cd7.eq(S1_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM8).on(S1_M1.itm_grp_cd8.eq(S1_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM9).on(S1_M1.itm_grp_cd9.eq(S1_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM10).on(S1_M1.itm_grp_cd10.eq(S1_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL5060_MST_STK_Query_I01
	 */
	static MCQueryPlan MSBEL5060_MST_STK_I01(String tgtTyp) {
		MSW_INV_TRANS_R S0 = MSW_INV_TRANS_R.create();
		
		mcframe.serverCore.queryapi.MCDBContainer S1_T1 = null;
		if (MSC_IO_SCHD_TGT_TYP.isACCRUAL(tgtTyp)) {
			S1_T1 = MSVT_ACCRUAL_END_STK_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp)) {
			S1_T1 = MSVT_ACCPT_END_STK_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp)) {
			S1_T1 = MSVT_AVL_END_STK_R.create("T1");
		}
		else if (MSC_IO_SCHD_TGT_TYP.isDTL(tgtTyp)) {
			S1_T1 = MST_MLY_STK_DTL_R.create("T1");
		}
		MCStringPermColumn S1_T1_stk_id_typ = (MCStringPermColumn)S1_T1.getColumn$("stk_id_typ");
		
		MSVT_LOT_LIST_R S1_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S1_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAVM_RD_LOC_R S1_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SUNDRY_ITM_R S1_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAW_BOM_EX_R S2_V = MAW_BOM_EX_R.create("V");
		MAM_ITM_VER_R S3_V2 = MAM_ITM_VER_R.create("V2");
		
		MAM_ITM_GRP_R S1_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5060_MST_STK_Query_I01")
					.insert(S0)
					.columns(
						S0.dt,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.ver_flg,
						S0.ver_no,
						S0.gd_cd,
						S0.quality_typ,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.loc_cd,
						S0.wg_cd,
						S0.gr_schd_qty,
						S0.gi_schd_qty,
						S0.gr_act_qty,
						S0.gi_act_qty,
						S0.stk_qty,
						S0.base_unit_cd,
						S0.base_unit_dec_place,
						S0.stk_flg,
						S0.str_ln_cd
					)
					.query(
						subQuery()
						.select(
							nullValue(),
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							nvl(
								S1_M1.ver_flg,
								value(false)
							),
							S1_T2.ver_no,
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							S1_M3.wg_cd,
							value(0),
							value(0),
							value(0),
							value(0),
							sum((MCNumberPermColumn)S1_T1.getColumn$("base_unit_qty")),
							S1_M1.unit_cd,
							S1_M1.dec_place,
							value(true),
							cases()
								.when(
									bind("srch_flg").eq(value(true))
								)
									.then((MCStringPermColumn)S1_T1.getColumn$("str_ln_cd"))
								.otherwise(nullValue()).as("str_ln_cd")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_T2.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_T2.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_T2.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_T2.lot_no.eq((MCStringPermColumn)S1_T1.getColumn$("lot_no")))
									.and(S1_T2.sublot_no.eq((MCStringPermColumn)S1_T1.getColumn$("sublot_no")))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
										S1_T3.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1"))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
										S1_M1.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M1.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M1.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M1.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
								)
							)
							.innerJoin(S1_M3).on(
								bracket(
									S1_M3.loc_cd.eq((MCStringPermColumn)S1_T1.getColumn$("loc_cd"))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
										S1_M4.itm_cd.eq((MCStringPermColumn)S1_T1.getColumn$("itm_cd"))
									.and(S1_M4.itm_sub1.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")))
									.and(S1_M4.itm_sub2.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")))
									.and(S1_M4.itm_sub3.eq((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")))
									.and(S1_M4.sno1.eq((MCStringPermColumn)S1_T1.getColumn$("sno1")))
									.and(S1_M4.sno2.eq((MCStringPermColumn)S1_T1.getColumn$("sno2")))
									.and(S1_M4.sno3.eq((MCStringPermColumn)S1_T1.getColumn$("sno3")))
									.and(S1_M4.sno4.eq((MCStringPermColumn)S1_T1.getColumn$("sno4")))
								)
							)
							.addDynamicView()
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(((MCDatePermColumn)S1_T1.getColumn$("ac_ym")).eq(bind("ac_ym")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("loc_cd")).like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("gd_cd")).like(bind("gd_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ1"))
								.and(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).isNull()
									.or(((MCStringPermColumn)S1_T2.getColumn$("quality_typ")).like(bind("quality_typ1")))
								)
							)
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("quality_typ")).like(bind("quality_typ2")))
							.cutoff$and(S1_M1.ver_flg.eq(bind("ver_flg")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd1")).like(bind("itm_grp_cd1")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd2")).like(bind("itm_grp_cd2")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd3")).like(bind("itm_grp_cd3")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd4")).like(bind("itm_grp_cd4")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd5")).like(bind("itm_grp_cd5")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd6")).like(bind("itm_grp_cd6")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd7")).like(bind("itm_grp_cd7")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd8")).like(bind("itm_grp_cd8")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd9")).like(bind("itm_grp_cd9")))
							.cutoff$and(((MCStringPermColumn)S1_M1.getColumn$("itm_grp_cd10")).like(bind("itm_grp_cd10")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).like(bind("itm_cd")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).like(bind("itm_sub1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).like(bind("itm_sub2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M4.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T2.ver_no.like(bind("ver_no")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno1")).like(bind("sno1")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno2")).like(bind("sno2")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno3")).like(bind("sno3")))
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("sno4")).like(bind("sno4")))
							.cutoff$and(S1_T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V)
										.where(
											value(0).eq(value(0))
											.and(S1_M3.wg_cd.eq(S2_V.wg_cd))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).eq(S2_V.itm_cd))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).eq(S2_V.itm_sub1))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).eq(S2_V.itm_sub2))
											.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).eq(S2_V.itm_sub3))
											.and(bind("par_itm_cd").isNotNull())
											.and(
												nvl(
													S2_V.st_dt,
													bind("dt_to")
												).lte(bind("dt_to"))
											)
											.and(
												nvl(
													S2_V.end_dt,
													bind("dt_fr")
												).gte(bind("dt_fr"))
											)
										)
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_V2)
									.where(
										value(0).eq(value(0))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_cd")).eq(S3_V2.itm_cd))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub1")).eq(S3_V2.itm_sub1))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub2")).eq(S3_V2.itm_sub2))
										.and(((MCStringPermColumn)S1_T1.getColumn$("itm_sub3")).eq(S3_V2.itm_sub3))
										.and(S1_T2.ver_no.eq(S3_V2.ver_no))
										.and(S1_M3.site_cd.eq(S3_V2.site_cd))
										.and(S3_V2.purc_st_dt.gte(bind("purc_dt_fr")))
										.and(S3_V2.purc_st_dt.lte(bind("purc_dt_to")))
										.and(
											S3_V2.cmpl_flg.in(
												value(false),
												bind("cmpl_flg_str")
											)
										)
									)
								)
							)
							.cutoff$and(((MCStringPermColumn)S1_T1.getColumn$("io_act_typ")).eq(bind("io_act_typ")))
							.addDynamicPredicate()
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
						.groupBy(
							S1_T1.getColumn$("itm_cd"),
							S1_T1.getColumn$("itm_sub1"),
							S1_T1.getColumn$("itm_sub2"),
							S1_T1.getColumn$("itm_sub3"),
							coalesce(
								S1_M4.itm_nm,
								S1_M1.itm_nm
							),
							S1_T2.ver_no,
							S1_M1.ver_flg,
							S1_T1.getColumn$("gd_cd"),
							S1_T1.getColumn$("quality_typ"),
							S1_T1.getColumn$("sno1"),
							S1_T1.getColumn$("sno2"),
							S1_T1.getColumn$("sno3"),
							S1_T1.getColumn$("sno4"),
							S1_T1.getColumn$("loc_cd"),
							S1_T1.getColumn$("str_ln_cd"),
							S1_M3.wg_cd,
							S1_M1.unit_cd,
							S1_M1.dec_place
						)
					)
			)
			.setDynamicSQLInfo(
				when(r -> MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp))
					.predicate(p -> p.and(S1_T1_stk_id_typ.in(
							value(MSC_STK_ID_TYP.COSTK.value()),
							value(MSC_STK_ID_TYP.CSTSTK.value()),
							value(MSC_STK_ID_TYP.RNT_RCV.value()),
							value(MSC_STK_ID_TYP.NCV_RCV.value()),
							value(MSC_STK_ID_TYP.ONR_PROV.value())
							))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S1_M2).on(bracket(S1_M1.itm_typ.eq(S1_M2.itm_typ).and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM1).on(S1_M1.itm_grp_cd1.eq(S1_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM2).on(S1_M1.itm_grp_cd2.eq(S1_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM3).on(S1_M1.itm_grp_cd3.eq(S1_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM4).on(S1_M1.itm_grp_cd4.eq(S1_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM5).on(S1_M1.itm_grp_cd5.eq(S1_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM6).on(S1_M1.itm_grp_cd6.eq(S1_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM7).on(S1_M1.itm_grp_cd7.eq(S1_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM8).on(S1_M1.itm_grp_cd8.eq(S1_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM9).on(S1_M1.itm_grp_cd9.eq(S1_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1_MM10).on(S1_M1.itm_grp_cd10.eq(S1_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	/**
	 * -- MSBEL5060_MSW_INV_TRANS_Query_S01
	 */
	static MCQueryPlan MSBEL5060_MSW_INV_TRANS_S01(CndR up0) {
		MSW_INV_TRANS_R S0_W1 = MSW_INV_TRANS_R.create("W1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_SITE_R S0_M2 = MAM_SITE_R.create("M2");
		MAM_WG_R S0_M3 = MAM_WG_R.create("M3");
		MAM_LG_GRP_R S0_M4 = MAM_LG_GRP_R.create("M4");
		MAM_ALLOC_GRP_R S0_M5 = MAM_ALLOC_GRP_R.create("M5");
		MAM_LOC_GRP_R S0_M6 = MAM_LOC_GRP_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_STK_GD_R S0_M8 = MAM_STK_GD_R.create("M8");
		MAM_STR_LN_R S0_M9 = MAM_STR_LN_R.create("M9");
		MAM_TRD_R S0_M10 = MAM_TRD_R.create("M10");
		MST_PRCD_ITM_ORDER_R S0_T2 = MST_PRCD_ITM_ORDER_R.create("T2");
		MST_SIM_ITM_ORDER_R S0_T3 = MST_SIM_ITM_ORDER_R.create("T3");
		MST_ITM_ORDER_R S0_T4 = MST_ITM_ORDER_R.create("T4");
		MST_MFG_INST_R S0_T5 = MST_MFG_INST_R.create("T5");
		MST_ITM_MFG_INST_R S0_T6 = MST_ITM_MFG_INST_R.create("T6");
		MAM_ITM_R S0_M11 = MAM_ITM_R.create("M11");
		MAM_SUNDRY_ITM_R S0_M12 = MAM_SUNDRY_ITM_R.create("M12");

		MCDynamicSQLID DS0C_SNO = createDynamicSQLID("DS0C_SNO");
		MCDynamicSQLID DS0C_LOC = createDynamicSQLID("DS0C_LOC");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5060_MSW_INV_TRANS_Query_S01")
				.mainQuery()
				.select(
					S0_W1.io_schd_typ,
					S0_W1.io_schd_sts_typ,
					S0_W1.trd_cd,
					S0_M10.trd_nm,
					S0_W1.trd_ptn_typ,
					S0_W1.trn_typ,
					S0_W1.io_act_typ,
					S0_W1.io_typ,
					cases()
						.when(
							S0_W1.dt.lte(bind("st_dt"))
							.and(S0_W1.stk_flg.eq(value(false)))
						)
							.then(bind("st_dt"))
						.otherwise(S0_W1.dt).as("dt"),
					S0_W1.itm_cd,
					S0_W1.itm_sub1,
					S0_W1.itm_sub2,
					S0_W1.itm_sub3,
					S0_W1.itm_nm,
					S0_W1.ver_flg,
					S0_W1.ver_no,
					addDynamicSelect(DS0C_SNO),
					addDynamicSelect(DS0C_LOC),
					S0_W1.wg_cd,
					sum(S0_W1.gr_schd_qty).as("gr_schd_qty"),
					sum(S0_W1.gi_schd_qty).as("gi_schd_qty"),
					sum(S0_W1.gr_act_qty).as("gr_act_qty"),
					sum(S0_W1.gi_act_qty).as("gi_act_qty"),
					sum(S0_W1.stk_qty).as("stk_qty"),
					S0_W1.base_unit_cd,
					S0_M7.unit_nm.as("base_unit_nm"),
					S0_W1.base_unit_dec_place,
					nvl(
						S0_W1.slo_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					).as("slo_no"),
					nvl(
						S0_W1.slo_d_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					).as("slo_d_no"),
					nvl(
						S0_W1.po_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.PO_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					).as("po_no"),
					nvl(
						S0_W1.po_d_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					).as("po_d_no"),
					nvl(
						S0_W1.mfg_inst_no,
						decode(
							S0_W1.io_schd_sub_typ3,
							value(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value()),
							S0_W1.io_schd_sub_no3
						)
					).as("mfg_inst_no"),
					nvl(
						S0_W1.oper_inst_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.OPER_INST_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					).as("oper_inst_no"),
					nvl(
						S0_W1.par_itm_cd,
						nvl(
							S0_T6.itm_cd,
							nvl(
								S0_T4.itm_cd,
								nvl(
									S0_T3.itm_cd,
									S0_T2.itm_cd
								)
							)
						)
					).as("par_itm_cd"),
					nvl(
						S0_W1.par_itm_sub1,
						nvl(
							S0_T6.itm_sub1,
							nvl(
								S0_T4.itm_sub1,
								nvl(
									S0_T3.itm_sub1,
									S0_T2.itm_sub1
								)
							)
						)
					).as("par_itm_sub1"),
					nvl(
						S0_W1.par_itm_sub2,
						nvl(
							S0_T6.itm_sub2,
							nvl(
								S0_T4.itm_sub2,
								nvl(
									S0_T3.itm_sub2,
									S0_T2.itm_sub2
								)
							)
						)
					).as("par_itm_sub2"),
					nvl(
						S0_W1.par_itm_sub3,
						nvl(
							S0_T6.itm_sub3,
							nvl(
								S0_T4.itm_sub3,
								nvl(
									S0_T3.itm_sub3,
									S0_T2.itm_sub3
								)
							)
						)
					).as("par_itm_sub3"),
					nvl(
						S0_W1.par_itm_nm,
						nvl(
							S0_M12.itm_nm,
							S0_M11.itm_nm
						)
					).as("par_itm_nm"),
					nvl(
						S0_W1.par_lot_no,
						S0_T6.lot_no
					).as("par_lot_no"),
					nvl(
						S0_W1.par_sublot_no,
						S0_T6.sublot_no
					).as("par_sublot_no"),
					nvl(
						S0_W1.par_sno1,
						nvl(
							S0_T6.sno1,
							nvl(
								S0_T4.sno1,
								nvl(
									S0_T3.sno1,
									S0_T2.sno1
								)
							)
						)
					).as("par_sno1"),
					nvl(
						S0_W1.par_sno2,
						nvl(
							S0_T6.sno2,
							nvl(
								S0_T4.sno2,
								nvl(
									S0_T3.sno2,
									S0_T2.sno2
								)
							)
						)
					).as("par_sno2"),
					nvl(
						S0_W1.par_sno3,
						nvl(
							S0_T6.sno3,
							nvl(
								S0_T4.sno3,
								nvl(
									S0_T3.sno3,
									S0_T2.sno3
								)
							)
						)
					).as("par_sno3"),
					nvl(
						S0_W1.par_sno4,
						nvl(
							S0_T6.sno4,
							nvl(
								S0_T4.sno4,
								nvl(
									S0_T3.sno4,
									S0_T2.sno4
								)
							)
						)
					).as("par_sno4"),
					nvl(
						S0_W1.par_itm_ord_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					).as("par_itm_ord_no"),
					decode(
						S0_W1.io_schd_sub_typ2,
						value(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value()),
						S0_W1.io_schd_sub_no2
					).as("par_oper_ord_no"),
					nvl(
						S0_W1.par_dt_fr,
						nvl(
							trunc(
								S0_T5.st_schd_tm,
								MCDateFmt.DD
							),
							nvl(
								S0_T4.mfg_st_schd_dt,
								nvl(
									S0_T3.mfg_st_schd_dt,
									S0_T2.mfg_st_schd_dt
								)
							)
						)
					).as("par_dt_fr"),
					nvl(
						S0_W1.bom_ptn,
						nvl(
							S0_T6.bom_ptn,
							nvl(
								S0_T4.bom_ptn,
								nvl(
									S0_T3.bom_ptn,
									S0_T2.bom_ptn
								)
							)
						)
					).as("bom_ptn"),
					S0_W1.mfg_act_no,
					S0_W1.oper_act_no,
					S0_W1.str_ln_cd,
					S0_M9.str_ln_nm,
					S0_W1.prcd_flg,
					S0_W1.sim_flg,
					S0_W1.stk_flg,
					nvl(
						S0_T6.sppl_cd,
						nvl(
							S0_T4.sppl_cd,
							nvl(
								S0_T3.sppl_cd,
								S0_T2.sppl_cd
							)
						)
					).as("prsppl_cd"),
					nvl(
						S0_T6.wg_cd,
						nvl(
							S0_T4.wg_cd,
							nvl(
								S0_T3.wg_cd,
								S0_T2.wg_cd
							)
						)
					).as("mfg_wg_cd"),
					value(0).as("std_upri")
				)
				.from(
					S0_W1
					.innerJoin(S0_M1).on(
						bracket(
							S0_W1.loc_cd.eq(S0_M1.loc_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_W1.base_unit_cd.eq(S0_M7.unit_cd)
						)
					)
					.leftOuterJoin(S0_M9).on(
						bracket(
							S0_W1.loc_cd.eq(S0_M9.loc_cd)
							.and(S0_W1.str_ln_cd.eq(S0_M9.str_ln_cd))
						)
					)
					.leftOuterJoin(S0_M10).on(
						bracket(
							S0_W1.trd_cd.eq(S0_M10.trd_cd)
						)
					)
					.leftOuterJoin(S0_T2).on(
						bracket(
							value(0).eq(value(0))
							.and(S0_T2.itm_ord_no.eq(S0_W1.io_schd_sub_no1))
							.and(S0_W1.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
							.and(S0_W1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT_PLN.value())))
							.and(S0_W1.prcd_flg.eq(value(true)))
						)
					)
					.leftOuterJoin(S0_T3).on(
						bracket(
							value(0).eq(value(0))
							.and(S0_T3.itm_ord_no.eq(S0_W1.io_schd_sub_no1))
							.and(S0_W1.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
							.and(S0_W1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT_PLN.value())))
							.and(S0_W1.sim_flg.eq(value(true)))
						)
					)
					.leftOuterJoin(S0_T4).on(
						bracket(
							value(0).eq(value(0))
							.and(S0_T4.itm_ord_no.eq(S0_W1.io_schd_sub_no1))
							.and(S0_W1.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
							.and(
								S0_W1.io_schd_typ.in(
									value(MSC_IO_SCHD_TYP.INPT_PLN.value()),
									value(MSC_IO_SCHD_TYP.INPT.value())
								)
							)
							.and(
								S0_W1.io_schd_sts_typ.in(
									value(MSC_IO_SCHD_STS_TYP.OPN.value()),
									value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()),
									value(MSC_IO_SCHD_STS_TYP.FIX.value()),
									value(MSC_IO_SCHD_STS_TYP.SCHD.value())
								)
							)
						)
					)
					.leftOuterJoin(S0_T5).on(
						bracket(
							value(0).eq(value(0))
							.and(S0_T5.mfg_inst_no.eq(S0_W1.io_schd_sub_no3))
							.and(S0_W1.io_schd_sub_typ3.eq(value(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value())))
							.and(S0_W1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT.value())))
							.and(
								S0_W1.io_schd_sts_typ.in(
									value(MSC_IO_SCHD_STS_TYP.MFG_SAV.value()),
									value(MSC_IO_SCHD_STS_TYP.ORD.value()),
									value(MSC_IO_SCHD_STS_TYP.STT.value())
								)
							)
						)
					)
					.leftOuterJoin(S0_T6).on(
						bracket(
							S0_T6.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no)
						)
					)
					.leftOuterJoin(S0_M11).on(
						bracket(
							value(0).eq(value(0))
							.and(
								nvl(
									S0_W1.par_itm_cd,
									nvl(
										S0_T6.itm_cd,
										nvl(
											S0_T4.itm_cd,
											nvl(
												S0_T3.itm_cd,
												S0_T2.itm_cd
											)
										)
									)
								).eq(S0_M11.itm_cd)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub1,
									nvl(
										S0_T6.itm_sub1,
										nvl(
											S0_T4.itm_sub1,
											nvl(
												S0_T3.itm_sub1,
												S0_T2.itm_sub1
											)
										)
									)
								).eq(S0_M11.itm_sub1)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub2,
									nvl(
										S0_T6.itm_sub2,
										nvl(
											S0_T4.itm_sub2,
											nvl(
												S0_T3.itm_sub2,
												S0_T2.itm_sub2
											)
										)
									)
								).eq(S0_M11.itm_sub2)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub3,
									nvl(
										S0_T6.itm_sub3,
										nvl(
											S0_T4.itm_sub3,
											nvl(
												S0_T3.itm_sub3,
												S0_T2.itm_sub3
											)
										)
									)
								).eq(S0_M11.itm_sub3)
							)
						)
					)
					.leftOuterJoin(S0_M12).on(
						bracket(
							value(0).eq(value(0))
							.and(
								nvl(
									S0_W1.par_itm_cd,
									nvl(
										S0_T6.itm_cd,
										nvl(
											S0_T4.itm_cd,
											nvl(
												S0_T3.itm_cd,
												S0_T2.itm_cd
											)
										)
									)
								).eq(S0_M12.itm_cd)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub1,
									nvl(
										S0_T6.itm_sub1,
										nvl(
											S0_T4.itm_sub1,
											nvl(
												S0_T3.itm_sub1,
												S0_T2.itm_sub1
											)
										)
									)
								).eq(S0_M12.itm_sub1)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub2,
									nvl(
										S0_T6.itm_sub2,
										nvl(
											S0_T4.itm_sub2,
											nvl(
												S0_T3.itm_sub2,
												S0_T2.itm_sub2
											)
										)
									)
								).eq(S0_M12.itm_sub2)
							)
							.and(
								nvl(
									S0_W1.par_itm_sub3,
									nvl(
										S0_T6.itm_sub3,
										nvl(
											S0_T4.itm_sub3,
											nvl(
												S0_T3.itm_sub3,
												S0_T2.itm_sub3
											)
										)
									)
								).eq(S0_M12.itm_sub3)
							)
							.and(
								nvl(
									S0_W1.par_sno1,
									nvl(
										S0_T6.sno1,
										nvl(
											S0_T4.sno1,
											nvl(
												S0_T3.sno1,
												S0_T2.sno1
											)
										)
									)
								).eq(S0_M12.sno1)
							)
							.and(
								nvl(
									S0_W1.par_sno2,
									nvl(
										S0_T6.sno2,
										nvl(
											S0_T4.sno2,
											nvl(
												S0_T3.sno2,
												S0_T2.sno2
											)
										)
									)
								).eq(S0_M12.sno2)
							)
							.and(
								nvl(
									S0_W1.par_sno3,
									nvl(
										S0_T6.sno3,
										nvl(
											S0_T4.sno3,
											nvl(
												S0_T3.sno3,
												S0_T2.sno3
											)
										)
									)
								).eq(S0_M12.sno3)
							)
							.and(
								nvl(
									S0_W1.par_sno4,
									nvl(
										S0_T6.sno4,
										nvl(
											S0_T4.sno4,
											nvl(
												S0_T3.sno4,
												S0_T2.sno4
											)
										)
									)
								).eq(S0_M12.sno4)
							)
						)
					)
					.addDynamicView()
				)
				.where(
					value(0).eq(value(0))
					.addDynamicPredicate()
				)
				.groupBy(
					S0_W1.io_schd_typ,
					S0_W1.io_schd_sts_typ,
					S0_W1.trd_cd,
					S0_M10.trd_nm,
					S0_W1.trd_ptn_typ,
					S0_W1.trn_typ,
					S0_W1.io_act_typ,
					S0_W1.io_typ,
					S0_W1.dt,
					S0_W1.itm_cd,
					S0_W1.itm_sub1,
					S0_W1.itm_sub2,
					S0_W1.itm_sub3,
					S0_W1.itm_nm,
					S0_W1.ver_flg,
					S0_W1.ver_no,
					addDynamicGroupBy(DS0C_SNO),
					addDynamicGroupBy(DS0C_LOC),
					S0_W1.wg_cd,
					S0_W1.base_unit_cd,
					S0_M7.unit_nm,
					S0_W1.base_unit_dec_place,
					nvl(
						S0_W1.slo_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.SLO_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					),
					nvl(
						S0_W1.slo_d_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					),
					nvl(
						S0_W1.po_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.PO_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					),
					nvl(
						S0_W1.po_d_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					),
					nvl(
						S0_W1.mfg_inst_no,
						decode(
							S0_W1.io_schd_sub_typ3,
							value(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value()),
							S0_W1.io_schd_sub_no3
						)
					),
					nvl(
						S0_W1.oper_inst_no,
						decode(
							S0_W1.io_schd_sub_typ2,
							value(MSC_IO_SCHD_SUB_TYP.OPER_INST_NO.value()),
							S0_W1.io_schd_sub_no2
						)
					),
					nvl(
						S0_W1.par_itm_cd,
						nvl(
							S0_T6.itm_cd,
							nvl(
								S0_T4.itm_cd,
								nvl(
									S0_T3.itm_cd,
									S0_T2.itm_cd
								)
							)
						)
					),
					nvl(
						S0_W1.par_itm_sub1,
						nvl(
							S0_T6.itm_sub1,
							nvl(
								S0_T4.itm_sub1,
								nvl(
									S0_T3.itm_sub1,
									S0_T2.itm_sub1
								)
							)
						)
					),
					nvl(
						S0_W1.par_itm_sub2,
						nvl(
							S0_T6.itm_sub2,
							nvl(
								S0_T4.itm_sub2,
								nvl(
									S0_T3.itm_sub2,
									S0_T2.itm_sub2
								)
							)
						)
					),
					nvl(
						S0_W1.par_itm_sub3,
						nvl(
							S0_T6.itm_sub3,
							nvl(
								S0_T4.itm_sub3,
								nvl(
									S0_T3.itm_sub3,
									S0_T2.itm_sub3
								)
							)
						)
					),
					nvl(
						S0_W1.par_itm_nm,
						nvl(
							S0_M12.itm_nm,
							S0_M11.itm_nm
						)
					),
					nvl(
						S0_W1.par_lot_no,
						S0_T6.lot_no
					),
					nvl(
						S0_W1.par_sublot_no,
						S0_T6.sublot_no
					),
					nvl(
						S0_W1.par_sno1,
						nvl(
							S0_T6.sno1,
							nvl(
								S0_T4.sno1,
								nvl(
									S0_T3.sno1,
									S0_T2.sno1
								)
							)
						)
					),
					nvl(
						S0_W1.par_sno2,
						nvl(
							S0_T6.sno2,
							nvl(
								S0_T4.sno2,
								nvl(
									S0_T3.sno2,
									S0_T2.sno2
								)
							)
						)
					),
					nvl(
						S0_W1.par_sno3,
						nvl(
							S0_T6.sno3,
							nvl(
								S0_T4.sno3,
								nvl(
									S0_T3.sno3,
									S0_T2.sno3
								)
							)
						)
					),
					nvl(
						S0_W1.par_sno4,
						nvl(
							S0_T6.sno4,
							nvl(
								S0_T4.sno4,
								nvl(
									S0_T3.sno4,
									S0_T2.sno4
								)
							)
						)
					),
					nvl(
						S0_W1.par_itm_ord_no,
						decode(
							S0_W1.io_schd_sub_typ1,
							value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()),
							S0_W1.io_schd_sub_no1
						)
					),
					decode(
						S0_W1.io_schd_sub_typ2,
						value(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value()),
						S0_W1.io_schd_sub_no2
					),
					nvl(
						S0_W1.par_dt_fr,
						nvl(
							trunc(
								S0_T5.st_schd_tm,
								MCDateFmt.DD
							),
							nvl(
								S0_T4.mfg_st_schd_dt,
								nvl(
									S0_T3.mfg_st_schd_dt,
									S0_T2.mfg_st_schd_dt
								)
							)
						)
					),
					nvl(
						S0_W1.bom_ptn,
						nvl(
							S0_T6.bom_ptn,
							nvl(
								S0_T4.bom_ptn,
								nvl(
									S0_T3.bom_ptn,
									S0_T2.bom_ptn
								)
							)
						)
					),
					S0_W1.mfg_act_no,
					S0_W1.oper_act_no,
					S0_W1.str_ln_cd,
					S0_M9.str_ln_nm,
					S0_W1.prcd_flg,
					S0_W1.sim_flg,
					S0_W1.stk_flg,
					nvl(
						S0_T6.sppl_cd,
						nvl(
							S0_T4.sppl_cd,
							nvl(
								S0_T3.sppl_cd,
								S0_T2.sppl_cd
							)
						)
					),
					nvl(
						S0_T6.wg_cd,
						nvl(
							S0_T4.wg_cd,
							nvl(
								S0_T3.wg_cd,
								S0_T2.wg_cd
							)
						)
					)
				)
				.orderBy(
						// MSBEL5060_MAW_BOM_EX_S01とunion-allする場合のため、テーブル別名を削除する
						pr(S0_W1.itm_cd).asc(),
						pr(S0_W1.itm_sub1).asc(),
						pr(S0_W1.itm_sub2).asc(),
						pr(S0_W1.itm_sub3).asc(),
						pr(S0_W1.itm_nm).asc(),
						addDynamicOrderBy(DS0C_LOC),
						pr(S0_W1.ver_no).asc(),
						addDynamicOrderBy(DS0C_SNO)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_W1.gd_cd.eq(S0_M8.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.gd_nm.like(bind("gd_nm")))),
				
				when(boundOr("site_nm").or(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M1.site_cd.eq(S0_M2.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm").or(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_W1.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.lg_grp_cd.eq(S0_M4.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("alloc_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M5.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("loc_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.loc_grp_cd.eq(S0_M6.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.loc_grp_nm.like(bind("loc_grp_nm")))),
				
				when(r -> MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_W1.loc_cd, S0_M1.loc_nm)
					.groupBy(DS0C_LOC, S0_W1.loc_cd, S0_M1.loc_nm)
					.orderBy(DS0C_LOC, pr(S0_W1.loc_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.site_cd, S0_M2.site_nm)
					.groupBy(DS0C_LOC, S0_M1.site_cd, S0_M2.site_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.site_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M3.wg_nm)
					.groupBy(DS0C_LOC, S0_M3.wg_nm)
					.orderBy(DS0C_LOC, pr(S0_W1.wg_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.lg_grp_cd, S0_M4.lg_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.lg_grp_cd, S0_M4.lg_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.lg_grp_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.alloc_grp_cd, S0_M5.alloc_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.alloc_grp_cd, S0_M5.alloc_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.alloc_grp_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.loc_grp_cd, S0_M6.loc_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.loc_grp_cd, S0_M6.loc_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.loc_grp_cd).asc()),
					
				when(r -> up0.sno1_flg())
				.select(DS0C_SNO, S0_W1.sno1)
				.groupBy(DS0C_SNO, S0_W1.sno1),
				when(r -> !up0.sno1_flg())
				.select(DS0C_SNO, nullValue().as("sno1")),
				when(r -> up0.sno2_flg())
				.select(DS0C_SNO, S0_W1.sno2)
				.groupBy(DS0C_SNO, S0_W1.sno2),
				when(r -> !up0.sno2_flg())
				.select(DS0C_SNO, nullValue().as("sno2")),
				when(r -> up0.sno3_flg())
				.select(DS0C_SNO, S0_W1.sno3)
				.groupBy(DS0C_SNO, S0_W1.sno3),
				when(r -> !up0.sno3_flg())
				.select(DS0C_SNO, nullValue().as("sno3")),
				when(r -> up0.sno4_flg())
				.select(DS0C_SNO, S0_W1.sno4)
				.groupBy(DS0C_SNO, S0_W1.sno4),
				when(r -> !up0.sno4_flg())
				.select(DS0C_SNO, nullValue().as("sno4"))
			);
	}
	
	/**
	 * -- MSBEL5060_MSW_INV_TRANS_Query_S02
	 */
	static MCQueryPlan MSBEL5060_MSW_INV_TRANS_S02(CndR up0) {
		MCTempView S0_W1 = createTempView("W1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_SITE_R S0_M2 = MAM_SITE_R.create("M2");
		MAM_WG_R S0_M3 = MAM_WG_R.create("M3");
		MAM_LG_GRP_R S0_M4 = MAM_LG_GRP_R.create("M4");
		MAM_ALLOC_GRP_R S0_M5 = MAM_ALLOC_GRP_R.create("M5");
		MAM_LOC_GRP_R S0_M6 = MAM_LOC_GRP_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_STK_GD_R S0_M8 = MAM_STK_GD_R.create("M8");
		MAM_STR_LN_R S0_M9 = MAM_STR_LN_R.create("M9");
		MAM_TRD_R S0_M10 = MAM_TRD_R.create("M10");
		MSW_INV_TRANS_R S1_W1 = MSW_INV_TRANS_R.create("W1");
		
		MCDynamicSQLID DS0C_SNO = createDynamicSQLID("DS0C_SNO");
		MCDynamicSQLID DS0C_LOC = createDynamicSQLID("DS0C_LOC");

		return createQueryPlan()
			.setQuery(
				sql("MSBEL5060_MSW_INV_TRANS_Query_S02")
					.mainQuery()
					.select(
						S0_W1.pr(S1_W1.io_schd_typ),
						S0_W1.pr(S1_W1.io_schd_sts_typ),
						S0_W1.pr(S1_W1.trd_cd),
						S0_M10.trd_nm,
						S0_W1.pr(S1_W1.trd_ptn_typ),
						S0_W1.pr(S1_W1.trn_typ),
						S0_W1.pr(S1_W1.io_act_typ),
						S0_W1.pr(S1_W1.io_typ),
						S0_W1.pr("dt"),
						S0_W1.pr(S1_W1.itm_cd),
						S0_W1.pr(S1_W1.itm_sub1),
						S0_W1.pr(S1_W1.itm_sub2),
						S0_W1.pr(S1_W1.itm_sub3),
						S0_W1.pr(S1_W1.itm_nm),
						S0_W1.pr(S1_W1.ver_flg),
						S0_W1.pr(S1_W1.ver_no),
						addDynamicSelect(DS0C_SNO),
						addDynamicSelect(DS0C_LOC),
						S0_W1.pr(S1_W1.wg_cd),
						sum(S0_W1.pr("gr_schd_qty")).as("gr_schd_qty"),
						sum(S0_W1.pr("gi_schd_qty")).as("gi_schd_qty"),
						sum(S0_W1.pr("gr_act_qty")).as("gr_act_qty"),
						sum(S0_W1.pr("gi_act_qty")).as("gi_act_qty"),
						sum(S0_W1.pr("stk_qty")).as("stk_qty"),
						S0_W1.pr(S1_W1.base_unit_cd),
						S0_M7.unit_nm.as("base_unit_nm"),
						S0_W1.pr(S1_W1.base_unit_dec_place),
						nullValue().as("slo_no"),
						nullValue().as("slo_d_no"),
						nullValue().as("po_no"),
						nullValue().as("po_d_no"),
						nullValue().as("mfg_inst_no"),
						nullValue().as("oper_inst_no"),
						nullValue().as("par_itm_cd"),
						nullValue().as("par_itm_sub1"),
						nullValue().as("par_itm_sub2"),
						nullValue().as("par_itm_sub3"),
						nullValue().as("par_itm_nm"),
						nullValue().as("par_lot_no"),
						nullValue().as("par_sublot_no"),
						nullValue().as("par_sno1"),
						nullValue().as("par_sno2"),
						nullValue().as("par_sno3"),
						nullValue().as("par_sno4"),
						nullValue().as("par_itm_ord_no"),
						nullValue().as("par_oper_ord_no"),
						nullValue().as("par_dt_fr"),
						nullValue().as("bom_ptn"),
						nullValue().as("mfg_act_no"),
						nullValue().as("oper_act_no"),
						nullValue().as("str_ln_cd"),
						nullValue().as("str_ln_nm"),
						S0_W1.pr(S1_W1.prcd_flg),
						S0_W1.pr(S1_W1.sim_flg),
						S0_W1.pr(S1_W1.stk_flg),
						nullValue().as("prsppl_cd"),
						nullValue().as("mfg_wg_cd"),
						S0_W1.pr("std_upri")
					)
					.from(
						subQuery()
						.select(
							S1_W1.io_schd_typ,
							S1_W1.io_schd_sts_typ,
							S1_W1.trd_cd,
							S1_W1.trd_ptn_typ,
							S1_W1.trn_typ,
							S1_W1.io_act_typ,
							S1_W1.io_typ,
							cases()
								.when(
									S1_W1.dt.lte(bind("st_dt"))
									.and(S1_W1.stk_flg.eq(value(false)))
								)
									.then(bind("st_dt"))
								.otherwise(S1_W1.dt).as("dt"),
							S1_W1.itm_cd,
							S1_W1.itm_sub1,
							S1_W1.itm_sub2,
							S1_W1.itm_sub3,
							S1_W1.itm_nm,
							S1_W1.ver_flg,
							S1_W1.ver_no,
							S1_W1.sno1,
							S1_W1.sno2,
							S1_W1.sno3,
							S1_W1.sno4,
							sum(S1_W1.gr_schd_qty).as("gr_schd_qty"),
							sum(S1_W1.gi_schd_qty).as("gi_schd_qty"),
							sum(S1_W1.gr_act_qty).as("gr_act_qty"),
							sum(S1_W1.gi_act_qty).as("gi_act_qty"),
							sum(S1_W1.stk_qty).as("stk_qty"),
							S1_W1.base_unit_cd,
							S1_W1.base_unit_dec_place,
							S1_W1.prcd_flg,
							S1_W1.sim_flg,
							S1_W1.stk_flg,
							S1_W1.loc_cd,
							S1_W1.str_ln_cd,
							S1_W1.wg_cd,
							S1_W1.gd_cd,
							value(0).as("std_upri")
						)
						.from(S1_W1)
						.groupBy(
							S1_W1.io_schd_typ,
							S1_W1.io_schd_sts_typ,
							S1_W1.trd_cd,
							S1_W1.trd_ptn_typ,
							S1_W1.trn_typ,
							S1_W1.io_act_typ,
							S1_W1.io_typ,
							S1_W1.dt,
							S1_W1.itm_cd,
							S1_W1.itm_sub1,
							S1_W1.itm_sub2,
							S1_W1.itm_sub3,
							S1_W1.itm_nm,
							S1_W1.ver_flg,
							S1_W1.ver_no,
							S1_W1.sno1,
							S1_W1.sno2,
							S1_W1.sno3,
							S1_W1.sno4,
							S1_W1.base_unit_cd,
							S1_W1.base_unit_dec_place,
							S1_W1.prcd_flg,
							S1_W1.sim_flg,
							S1_W1.stk_flg,
							S1_W1.loc_cd,
							S1_W1.str_ln_cd,
							S1_W1.wg_cd,
							S1_W1.gd_cd
						).view(S0_W1)
						.innerJoin(S0_M1).on(
							bracket(
								S0_W1.pr(S1_W1.loc_cd).eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_W1.pr(S1_W1.base_unit_cd).eq(S0_M7.unit_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_W1.pr(S1_W1.loc_cd).eq(S0_M9.loc_cd)
								.and(S0_W1.pr(S1_W1.str_ln_cd).eq(S0_M9.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_W1.pr(S1_W1.trd_cd).eq(S0_M10.trd_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate()
					)
					.groupBy(
						S0_W1.pr(S1_W1.io_schd_typ),
						S0_W1.pr(S1_W1.io_schd_sts_typ),
						S0_W1.pr(S1_W1.trd_cd),
						S0_M10.trd_nm,
						S0_W1.pr(S1_W1.trd_ptn_typ),
						S0_W1.pr(S1_W1.trn_typ),
						S0_W1.pr(S1_W1.io_act_typ),
						S0_W1.pr(S1_W1.io_typ),
						S0_W1.pr("dt"),
						S0_W1.pr(S1_W1.itm_cd),
						S0_W1.pr(S1_W1.itm_sub1),
						S0_W1.pr(S1_W1.itm_sub2),
						S0_W1.pr(S1_W1.itm_sub3),
						S0_W1.pr(S1_W1.itm_nm),
						S0_W1.pr(S1_W1.ver_flg),
						S0_W1.pr(S1_W1.ver_no),
						addDynamicGroupBy(DS0C_SNO),
						addDynamicGroupBy(DS0C_LOC),
						S0_W1.pr(S1_W1.wg_cd),
						S0_W1.pr(S1_W1.base_unit_cd),
						S0_M7.unit_nm,
						S0_W1.pr(S1_W1.base_unit_dec_place),
						S0_W1.pr(S1_W1.prcd_flg),
						S0_W1.pr(S1_W1.sim_flg),
						S0_W1.pr(S1_W1.stk_flg),
						S0_W1.pr("std_upri")
					)
					.orderBy(
						// MSBEL5060_MAW_BOM_EX_S01とunion-allする場合のため、テーブル別名を削除する
						pr(S1_W1.itm_cd).asc(),
						pr(S1_W1.itm_sub1).asc(),
						pr(S1_W1.itm_sub2).asc(),
						pr(S1_W1.itm_sub3).asc(),
						pr(S1_W1.itm_nm).asc(),
						addDynamicOrderBy(DS0C_LOC),
						pr(S1_W1.ver_no).asc(),
						addDynamicOrderBy(DS0C_SNO)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_W1.pr(S1_W1.gd_cd).eq(S0_M8.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.gd_nm.like(bind("gd_nm")))),
				
				when(boundOr("site_nm").or(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M1.site_cd.eq(S0_M2.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm").or(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_W1.pr(S1_W1.wg_cd).eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.lg_grp_cd.eq(S0_M4.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("alloc_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M5.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("loc_grp_nm").or(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ())))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.loc_grp_cd.eq(S0_M6.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.loc_grp_nm.like(bind("loc_grp_nm")))),
				
				when(r -> MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_W1.pr(S1_W1.loc_cd), S0_M1.loc_nm)
					.groupBy(DS0C_LOC, S0_W1.pr(S1_W1.loc_cd), S0_M1.loc_nm)
					.orderBy(DS0C_LOC, pr(S1_W1.loc_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.site_cd, S0_M2.site_nm)
					.groupBy(DS0C_LOC, S0_M1.site_cd, S0_M2.site_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.site_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M3.wg_nm)
					.groupBy(DS0C_LOC, S0_M3.wg_nm)
					.orderBy(DS0C_LOC, pr(S1_W1.wg_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.lg_grp_cd, S0_M4.lg_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.lg_grp_cd, S0_M4.lg_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.lg_grp_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.alloc_grp_cd, S0_M5.alloc_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.alloc_grp_cd, S0_M5.alloc_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.alloc_grp_cd).asc()),
				when(r -> MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ()))
					.select(DS0C_LOC, S0_M1.loc_grp_cd, S0_M6.loc_grp_nm)
					.groupBy(DS0C_LOC, S0_M1.loc_grp_cd, S0_M6.loc_grp_nm)
					.orderBy(DS0C_LOC, pr(S0_M1.loc_grp_cd).asc()),
				
				when(r -> up0.sno1_flg())
				.select(DS0C_SNO, S0_W1.pr(S1_W1.sno1))
				.groupBy(DS0C_SNO, S0_W1.pr(S1_W1.sno1)),
				when(r -> !up0.sno1_flg())
				.select(DS0C_SNO, nullValue().as("sno1")),
				when(r -> up0.sno2_flg())
				.select(DS0C_SNO, S0_W1.pr(S1_W1.sno2))
				.groupBy(DS0C_SNO, S0_W1.pr(S1_W1.sno2)),
				when(r -> !up0.sno2_flg())
				.select(DS0C_SNO, nullValue().as("sno2")),
				when(r -> up0.sno3_flg())
				.select(DS0C_SNO, S0_W1.pr(S1_W1.sno3))
				.groupBy(DS0C_SNO, S0_W1.pr(S1_W1.sno3)),
				when(r -> !up0.sno3_flg())
				.select(DS0C_SNO, nullValue().as("sno3")),
				when(r -> up0.sno4_flg())
				.select(DS0C_SNO, S0_W1.pr(S1_W1.sno4))
				.groupBy(DS0C_SNO, S0_W1.pr(S1_W1.sno4)),
				when(r -> !up0.sno4_flg())
				.select(DS0C_SNO, nullValue().as("sno4"))
			);
	}
	
}