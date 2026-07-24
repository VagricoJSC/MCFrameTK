package mcframe.serverMGBA.MGBAL0010;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBAL0010_MGT_PLN_SLS_Query_S01
	 */
	static MCQueryPlan MGBAL0010_MGT_PLN_SLS_S01() {
		MGT_PLN_SLS_R S0_T = MGT_PLN_SLS_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_BASE_UNIT = MAM_UNIT_R.create("BASE_UNIT");
		MAVM_ITM_UNIT_R S0_ITM_UNIT = MAVM_ITM_UNIT_R.create("ITM_UNIT");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_SUNDRY_ITM_R S0_SUNDRY = MAM_SUNDRY_ITM_R.create("SUNDRY");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_CNTRY_R S0_CST_CNTRY = MAM_CNTRY_R.create("CST_CNTRY");
		MAM_AREA_R S0_CST_AREA = MAM_AREA_R.create("CST_AREA");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_CNTRY_R S0_DLV_CNTRY = MAM_CNTRY_R.create("DLV_CNTRY");
		MAM_AREA_R S0_DLV_AREA = MAM_AREA_R.create("DLV_AREA");
		MAM_COST_DPT_R S0_SLS_DPT = MAM_COST_DPT_R.create("SLS_DPT");
		MAM_USR_R S0_SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_COST_DPT_R S0_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		MAM_COST_SLS_R S0_COST_SLS1 = MAM_COST_SLS_R.create("COST_SLS1");
		MAM_COST_SLS_R S0_COST_SLS2 = MAM_COST_SLS_R.create("COST_SLS2");
		MAM_COST_SLS_R S0_COST_SLS3 = MAM_COST_SLS_R.create("COST_SLS3");
		MAM_COST_SLS_R S0_COST_SLS4 = MAM_COST_SLS_R.create("COST_SLS4");
		MAM_COST_SLS_R S0_COST_SLS5 = MAM_COST_SLS_R.create("COST_SLS5");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_BP_GRP_R S0_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S0_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S0_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S0_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S0_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S0_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S0_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S0_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S0_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S0_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0010_MGT_PLN_SLS_Query_S01")
					.mainQuery()
					.select(
						S0_T.pln_sls_key,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_DAC.wg_nm,
						S0_T.ym,
						S0_T.mng_dpt_cd,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						nvl(
							S0_SUNDRY.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd.as("base_unit_cd"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.asst_typ,
						S0_T.cst_cd,
						S0_T.dlv_cd,
						S0_T.sls_dpt_cd,
						S0_T.sls_usr_cd,
						S0_T.alc_dpt_cd,
						S0_T.dest_cd1,
						S0_T.dest_cd2,
						S0_T.dest_cd3,
						S0_T.cost_sls_cd1,
						S0_COST_SLS1.cost_sls_nm.as("cost_sls_nm1"),
						S0_T.cost_sls_cd2,
						S0_COST_SLS2.cost_sls_nm.as("cost_sls_nm2"),
						S0_T.cost_sls_cd3,
						S0_COST_SLS3.cost_sls_nm.as("cost_sls_nm3"),
						S0_T.cost_sls_cd4,
						S0_COST_SLS4.cost_sls_nm.as("cost_sls_nm4"),
						S0_T.cost_sls_cd5,
						S0_COST_SLS5.cost_sls_nm.as("cost_sls_nm5"),
						S0_T.unit_cd,
						S0_ITM_UNIT.conv_base_qty,
						S0_ITM_UNIT.conv_qty,
						S0_ITM_UNIT.dec_place,
						S0_T.qty,
						MGPA_UNIT$F_GET_CONV_QTY_NE(
							S0_T.qty,
							S0_ITM_UNIT.conv_base_qty,
							S0_ITM_UNIT.conv_qty,
							S0_ITM.dec_place,
							S0_ITM.rnd_typ
						).as("base_unit_qty"),
						S0_T.cur_cd,
						S0_T.amt,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_DAC).on(S0_T.wg_cd.eq(S0_DAC.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_UNIT).on(
							S0_T.itm_cd.eq(S0_ITM_UNIT.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM_UNIT.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM_UNIT.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM_UNIT.itm_sub3))
							.and(S0_T.unit_cd.eq(S0_ITM_UNIT.unit_cd))
						)
						.leftOuterJoin(S0_SUNDRY).on(
							S0_T.itm_cd.eq(S0_SUNDRY.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_SUNDRY.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_SUNDRY.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_SUNDRY.itm_sub3))
							.and(S0_T.sno1.eq(S0_SUNDRY.sno1))
							.and(S0_T.sno2.eq(S0_SUNDRY.sno2))
							.and(S0_T.sno3.eq(S0_SUNDRY.sno3))
							.and(S0_T.sno4.eq(S0_SUNDRY.sno4))
						)
						.leftOuterJoin(S0_COST_SLS1).on(
							S0_T.cost_sls_cd1.eq(S0_COST_SLS1.cost_sls_cd)
							.and(value(MAC_COST_SLS_TYP.S1.value()).eq(S0_COST_SLS1.cost_sls_typ))
						)
						.leftOuterJoin(S0_COST_SLS2).on(
							S0_T.cost_sls_cd2.eq(S0_COST_SLS2.cost_sls_cd)
							.and(value(MAC_COST_SLS_TYP.S2.value()).eq(S0_COST_SLS2.cost_sls_typ))
						)
						.leftOuterJoin(S0_COST_SLS3).on(
							S0_T.cost_sls_cd3.eq(S0_COST_SLS3.cost_sls_cd)
							.and(value(MAC_COST_SLS_TYP.S3.value()).eq(S0_COST_SLS3.cost_sls_typ))
						)
						.leftOuterJoin(S0_COST_SLS4).on(
							S0_T.cost_sls_cd4.eq(S0_COST_SLS4.cost_sls_cd)
							.and(value(MAC_COST_SLS_TYP.S4.value()).eq(S0_COST_SLS4.cost_sls_typ))
						)
						.leftOuterJoin(S0_COST_SLS5).on(
							S0_T.cost_sls_cd5.eq(S0_COST_SLS5.cost_sls_cd)
							.and(value(MAC_COST_SLS_TYP.S5.value()).eq(S0_COST_SLS5.cost_sls_typ))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_DAC.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_SUNDRY.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_T.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T.alc_dpt_cd.like(bind("alc_dpt_cd")))
						.cutoff$and(S0_T.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T.cost_sls_cd1.like(bind("cost_sls_cd1")))
						.cutoff$and(S0_COST_SLS1.cost_sls_nm.like(bind("cost_sls_nm1")))
						.cutoff$and(S0_T.cost_sls_cd2.like(bind("cost_sls_cd2")))
						.cutoff$and(S0_COST_SLS2.cost_sls_nm.like(bind("cost_sls_nm2")))
						.cutoff$and(S0_T.cost_sls_cd3.like(bind("cost_sls_cd3")))
						.cutoff$and(S0_COST_SLS3.cost_sls_nm.like(bind("cost_sls_nm3")))
						.cutoff$and(S0_T.cost_sls_cd4.like(bind("cost_sls_cd4")))
						.cutoff$and(S0_COST_SLS4.cost_sls_nm.like(bind("cost_sls_nm4")))
						.cutoff$and(S0_T.cost_sls_cd5.like(bind("cost_sls_cd5")))
						.cutoff$and(S0_COST_SLS5.cost_sls_nm.like(bind("cost_sls_nm5")))
						.cutoff$and(S0_T.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.mng_dpt_cd.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.pln_sls_key.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("mng_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_MNG_DPT).on(S0_T.mng_dpt_cd.eq(S0_MNG_DPT.dpt_cd).and(S0_TERM.term.eq(S0_MNG_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("cst_cntry_nm", "cst_area_nm", "cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm", "cst_cntry_cd", "cst_area_cd"))
					.view(v -> v.leftOuterJoin(S0_CST).on(S0_T.cst_cd.eq(S0_CST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm"))).cutoff$and(S0_CST.cntry_cd.like(bind("cst_cntry_cd"))).cutoff$and(S0_CST.area_cd.like(bind("cst_area_cd")))),
				when(boundOr("cst_cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_CST_CNTRY).on(S0_CST.cntry_cd.eq(S0_CST_CNTRY.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_CST_CNTRY.cntry_nm.like(bind("cst_cntry_nm")))),
				when(boundOr("cst_area_nm"))
					.view(v -> v.leftOuterJoin(S0_CST_AREA).on(S0_CST.area_cd.eq(S0_CST_AREA.area_cd)))
					.predicate(p -> p.cutoff$and(S0_CST_AREA.area_nm.like(bind("cst_area_nm")))),
				when(boundOr("dlv_cntry_nm", "dlv_area_nm", "dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm", "dlv_cntry_cd", "dlv_area_cd"))
					.view(v -> v.leftOuterJoin(S0_DLV).on(S0_T.dlv_cd.eq(S0_DLV.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DLV.bp_nm.like(bind("dlv_nm"))).cutoff$and(S0_DLV.cntry_cd.like(bind("dlv_cntry_cd"))).cutoff$and(S0_DLV.area_cd.like(bind("dlv_area_cd")))),
				when(boundOr("dlv_cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_DLV_CNTRY).on(S0_DLV.cntry_cd.eq(S0_DLV_CNTRY.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_DLV_CNTRY.cntry_nm.like(bind("dlv_cntry_nm")))),
				when(boundOr("dlv_area_nm"))
					.view(v -> v.leftOuterJoin(S0_DLV_AREA).on(S0_DLV.area_cd.eq(S0_DLV_AREA.area_cd)))
					.predicate(p -> p.cutoff$and(S0_DLV_AREA.area_nm.like(bind("dlv_area_nm")))),
				when(boundOr("sls_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_SLS_DPT).on(S0_T.sls_dpt_cd.eq(S0_SLS_DPT.dpt_cd).and(S0_TERM.term.eq(S0_SLS_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_SLS_DPT.dpt_nm.like(bind("sls_dpt_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_SLS_USR).on(S0_T.sls_usr_cd.eq(S0_SLS_USR.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_SLS_USR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("alc_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_ALC_DPT).on(S0_T.alc_dpt_cd.eq(S0_ALC_DPT.dpt_cd).and(S0_TERM.term.eq(S0_ALC_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_ALC_DPT.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_DEST1).on(S0_T.dest_cd1.eq(S0_DEST1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_DEST2).on(S0_T.dest_cd2.eq(S0_DEST2.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_DEST3).on(S0_T.dest_cd3.eq(S0_DEST3.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLV_GRP1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLV_GRP2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLV_GRP3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLV_GRP4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLV_GRP5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLV_GRP6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLV_GRP7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLV_GRP8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLV_GRP9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLV_GRP10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("mng_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mng_dpt_nm", m.dpt_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
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
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.bp_nm,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.bp_nm,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("sls_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_dpt_nm", m.dpt_nm());
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
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("alc_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_dpt_nm", m.dpt_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					})
				)
			);
	}
}