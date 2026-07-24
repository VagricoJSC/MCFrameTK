package mcframe.serverMGBD.MGBDL0530;

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
	 * -- MGBDL0530_MGT_BOM_Query_S01
	 */
	static MCQueryPlan MGBDL0530_MGT_BOM_S01() {
		MGT_BOM_R S0_T = MGT_BOM_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_ITM_TYP_D_R S0_PAR_ITM_TYP_D = MAM_ITM_TYP_D_R.create("PAR_ITM_TYP_D");
		MAM_ITM_JNL_R S0_PAR_ITM_JNL = MAM_ITM_JNL_R.create("PAR_ITM_JNL");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_ITM_R S0_CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_ITM_TYP_D_R S0_CHD_ITM_TYP_D = MAM_ITM_TYP_D_R.create("CHD_ITM_TYP_D");
		MAM_ITM_JNL_R S0_CHD_ITM_JNL = MAM_ITM_JNL_R.create("CHD_ITM_JNL");
		MAM_UNIT_R S0_PAR_UNIT = MAM_UNIT_R.create("PAR_UNIT");
		MAM_UNIT_R S0_CHD_UNIT = MAM_UNIT_R.create("CHD_UNIT");
		MAM_ALT_GRP_R S0_ALT_GRP = MAM_ALT_GRP_R.create("ALT_GRP");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAVM_RD_WG_R S1_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_WG_R S2_RDWG = MAVM_RD_WG_R.create("RDWG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0530_MGT_BOM_Query_S01")
					.mainQuery()
					.select(
						S0_T.par_itm_cd,
						S0_T.par_itm_sub1,
						S0_T.par_itm_sub2,
						S0_T.par_itm_sub3,
						S0_T.bom_ptn,
						S0_T.oper_cd,
						S0_T.oper_seq,
						S0_T.chd_itm_cd,
						S0_T.chd_itm_sub1,
						S0_T.chd_itm_sub2,
						S0_T.chd_itm_sub3,
						S0_T.alt_grp_cd,
						S0_T.expns_cd,
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.disp_seq,
						S0_T.par_rqmt_qty,
						S0_T.chd_rqmt_qty,
						S0_T.chd_base_qty,
						S0_T.fxd_chd_rqmt_qty,
						S0_T.chd_min_qty,
						S0_T.chd_batch_qty,
						S0_T.alt_itm_ratio,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
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
						S0_PAR_ITM.itm_typ.as("par_itm_typ"),
						S0_PAR_ITM.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						S0_PAR_ITM.itm_nm.as("par_itm_nm"),
						S0_PAR_ITM.itm_jnl_cd.as("par_itm_jnl_cd"),
						S0_PAR_ITM.cost_std_qty,
						S0_PAR_ITM.unit_cd.as("par_base_unit_cd"),
						S0_PAR_ITM.dec_place.as("par_dec_place"),
						addDynamicSelect(DS0D),
						// this field is appended by sql coverter.
						S0_T.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_PAR_ITM).on(
							S0_T.par_itm_cd.eq(S0_PAR_ITM.itm_cd)
							.and(S0_T.par_itm_sub1.eq(S0_PAR_ITM.itm_sub1))
							.and(S0_T.par_itm_sub2.eq(S0_PAR_ITM.itm_sub2))
							.and(S0_T.par_itm_sub3.eq(S0_PAR_ITM.itm_sub3))
						)
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
						.cutoff$and(S0_PAR_ITM.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_T.par_itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T.par_itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_T.par_itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_T.par_itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(S0_PAR_ITM.itm_nm.like(bind("par_itm_nm")))
						.cutoff$and(S0_T.chd_itm_cd.like(bind("chd_itm_cd")))
						.cutoff$and(S0_T.chd_itm_sub1.like(bind("chd_itm_sub1")))
						.cutoff$and(S0_T.chd_itm_sub2.like(bind("chd_itm_sub2")))
						.cutoff$and(S0_T.chd_itm_sub3.like(bind("chd_itm_sub3")))
						.cutoff$and(S0_T.alt_grp_cd.like(bind("alt_grp_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.oper_seq.eq(bind("oper_seq")))
						.cutoff$and(S0_T.bom_ptn.like(bind("bom_ptn")))
						.cutoff$and(S0_T.expns_cd.like(bind("expns_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9")))
						.cutoff$and(S0_PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10")))
						.cutoff$and(S0_T.non_calc_flg.eq(bind("non_calc_flg_str")))
						.cutoff$and(
							bind("no_alt_grp_flg_str").eq(value(true))
							.and(S0_T.alt_grp_cd.isNull())
						)
						.cutoff$and(
							bind("no_expns_flg_str").eq(value(true))
							.and(S0_T.expns_cd.isNull())
						)
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_PAR_ITM.itm_typ.asc(),
						S0_PAR_ITM.itm_typ_d_cd.asc(),
						S0_PAR_ITM.itm_jnl_cd.asc(),
						S0_T.par_itm_cd.asc(),
						S0_T.par_itm_sub1.asc(),
						S0_T.par_itm_sub2.asc(),
						S0_T.par_itm_sub3.asc(),
						S0_T.bom_ptn.asc(),
						S0_T.disp_seq.asc(),
						S0_T.alt_grp_cd.asc(),
						S0_T.chd_itm_cd.asc(),
						S0_T.chd_itm_sub1.asc(),
						S0_T.chd_itm_sub2.asc(),
						S0_T.chd_itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd).and(S0_T.wg_cd.eq(S0_WG.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("par_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_PAR_ITM_TYP_D).on(S0_PAR_ITM.itm_typ.eq(S0_PAR_ITM_TYP_D.itm_typ).and(S0_PAR_ITM.itm_typ_d_cd.eq(S0_PAR_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_PAR_ITM_TYP_D.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("par_itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_PAR_ITM_JNL).on(S0_PAR_ITM.itm_jnl_cd.eq(S0_PAR_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_PAR_ITM_JNL.itm_jnl_nm.like(bind("par_itm_jnl_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("chd_itm_typ_d_nm", "chd_itm_jnl_nm", "chd_itm_grp_nm1", "chd_itm_grp_nm2", "chd_itm_grp_nm3", "chd_itm_grp_nm4", "chd_itm_grp_nm5", "chd_itm_grp_nm6", "chd_itm_grp_nm7", "chd_itm_grp_nm8", "chd_itm_grp_nm9", "chd_itm_grp_nm10", "chd_itm_jnl_cd", "chd_itm_typ", "chd_itm_typ_d_cd", "chd_itm_nm", "chd_itm_grp_cd1", "chd_itm_grp_cd2", "chd_itm_grp_cd3", "chd_itm_grp_cd4", "chd_itm_grp_cd5", "chd_itm_grp_cd6", "chd_itm_grp_cd7", "chd_itm_grp_cd8", "chd_itm_grp_cd9", "chd_itm_grp_cd10"))
					.view(v -> v.leftOuterJoin(S0_CHD_ITM).on(S0_T.chd_itm_cd.eq(S0_CHD_ITM.itm_cd).and(S0_T.chd_itm_sub1.eq(S0_CHD_ITM.itm_sub1)).and(S0_T.chd_itm_sub2.eq(S0_CHD_ITM.itm_sub2)).and(S0_T.chd_itm_sub3.eq(S0_CHD_ITM.itm_sub3))))
					.predicate(p -> p.cutoff$and(S0_CHD_ITM.itm_jnl_cd.like(bind("chd_itm_jnl_cd"))).cutoff$and(S0_CHD_ITM.itm_typ.like(bind("chd_itm_typ"))).cutoff$and(S0_CHD_ITM.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd"))).cutoff$and(S0_CHD_ITM.itm_nm.like(bind("chd_itm_nm"))).cutoff$and(S0_CHD_ITM.itm_grp_cd1.like(bind("chd_itm_grp_cd1"))).cutoff$and(S0_CHD_ITM.itm_grp_cd2.like(bind("chd_itm_grp_cd2"))).cutoff$and(S0_CHD_ITM.itm_grp_cd3.like(bind("chd_itm_grp_cd3"))).cutoff$and(S0_CHD_ITM.itm_grp_cd4.like(bind("chd_itm_grp_cd4"))).cutoff$and(S0_CHD_ITM.itm_grp_cd5.like(bind("chd_itm_grp_cd5"))).cutoff$and(S0_CHD_ITM.itm_grp_cd6.like(bind("chd_itm_grp_cd6"))).cutoff$and(S0_CHD_ITM.itm_grp_cd7.like(bind("chd_itm_grp_cd7"))).cutoff$and(S0_CHD_ITM.itm_grp_cd8.like(bind("chd_itm_grp_cd8"))).cutoff$and(S0_CHD_ITM.itm_grp_cd9.like(bind("chd_itm_grp_cd9"))).cutoff$and(S0_CHD_ITM.itm_grp_cd10.like(bind("chd_itm_grp_cd10")))),
				when(boundOr("chd_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_CHD_ITM_TYP_D).on(S0_CHD_ITM.itm_typ.eq(S0_CHD_ITM_TYP_D.itm_typ).and(S0_CHD_ITM.itm_typ_d_cd.eq(S0_CHD_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_CHD_ITM_TYP_D.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))),
				when(boundOr("chd_itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_CHD_ITM_JNL).on(S0_CHD_ITM.itm_jnl_cd.eq(S0_CHD_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_CHD_ITM_JNL.itm_jnl_nm.like(bind("chd_itm_jnl_nm")))),
				when(boundOr("alt_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_ALT_GRP).on(S0_T.alt_grp_cd.eq(S0_ALT_GRP.alt_grp_cd).and(S0_T.wg_cd.eq(S0_ALT_GRP.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_ALT_GRP.alt_grp_nm.like(bind("alt_grp_nm")))),
				when(boundOr("expns_nm"))
					.view(v -> v.leftOuterJoin(S0_EXPNS).on(S0_T.expns_cd.eq(S0_EXPNS.expns_cd)))
					.predicate(p -> p.cutoff$and(S0_EXPNS.expns_nm.like(bind("expns_nm")))),
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("cmn_only_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_only_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(S1_RDWG.prAll()).from(S1_RDWG).where(S1_RDWG.wg_cd.eq(S0_T.wg_cd))))),
				when(boundOr("cmn_wg_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(exists(subQuery().select(S2_RDWG.prAll()).from(S2_RDWG).where(S2_RDWG.wg_cd.eq(S0_T.wg_cd)))))),
				when(boundOr("par_itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP1).on(S0_PAR_ITM.itm_grp_cd1.eq(S0_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP2).on(S0_PAR_ITM.itm_grp_cd2.eq(S0_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP3).on(S0_PAR_ITM.itm_grp_cd3.eq(S0_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP4).on(S0_PAR_ITM.itm_grp_cd4.eq(S0_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP5).on(S0_PAR_ITM.itm_grp_cd5.eq(S0_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP6).on(S0_PAR_ITM.itm_grp_cd6.eq(S0_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP7).on(S0_PAR_ITM.itm_grp_cd7.eq(S0_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP8).on(S0_PAR_ITM.itm_grp_cd8.eq(S0_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP9).on(S0_PAR_ITM.itm_grp_cd9.eq(S0_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAR_ITM_GRP10).on(S0_PAR_ITM.itm_grp_cd10.eq(S0_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10")))),
				when(boundOr("chd_itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP1).on(S0_CHD_ITM.itm_grp_cd1.eq(S0_CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP2).on(S0_CHD_ITM.itm_grp_cd2.eq(S0_CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP3).on(S0_CHD_ITM.itm_grp_cd3.eq(S0_CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP4).on(S0_CHD_ITM.itm_grp_cd4.eq(S0_CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP5).on(S0_CHD_ITM.itm_grp_cd5.eq(S0_CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP6).on(S0_CHD_ITM.itm_grp_cd6.eq(S0_CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP7).on(S0_CHD_ITM.itm_grp_cd7.eq(S0_CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP8).on(S0_CHD_ITM.itm_grp_cd8.eq(S0_CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP9).on(S0_CHD_ITM.itm_grp_cd9.eq(S0_CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CHD_ITM_GRP10).on(S0_CHD_ITM.itm_grp_cd10.eq(S0_CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CHD_ITM_GRP10.itm_grp_nm.like(bind("chd_itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_RD_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("par_itm_typ"),
							r.getStringNE("par_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("par_itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_jnl_nm", m.itm_jnl_nm());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("chd_itm_cd"),
							r.getStringNE("chd_itm_sub1"),
							r.getStringNE("chd_itm_sub2"),
							r.getStringNE("chd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_jnl_cd,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_typ", m.itm_typ());
							r.setStringNE("chd_itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("chd_itm_nm", m.itm_nm());
							r.setStringNE("chd_itm_jnl_cd", m.itm_jnl_cd());
							r.setStringNE("chd_base_unit_cd", m.unit_cd());
							r.setNumberNE("chd_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("chd_itm_typ"),
							r.getStringNE("chd_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("chd_itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("par_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("chd_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
					}),
					j -> j
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("expns_nm", m.expns_nm());
					}),
					j -> j
						.add(MAM_TERM_R.class, r -> toCondition(
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("term_nm", m.term_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0530_MGT_BOM_Query_U01
	 */
	static MCQueryPlan MGBDL0530_MGT_BOM_U01() {
		MGT_BOM_R S0 = MGT_BOM_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0530_MGT_BOM_Query_U01")
					.update(S0)
					.set(S0.par_itm_cd).eq(bind("new_par_itm_cd"))
					.set(S0.par_itm_sub1).eq(bind("new_par_itm_sub1"))
					.set(S0.par_itm_sub2).eq(bind("new_par_itm_sub2"))
					.set(S0.par_itm_sub3).eq(bind("new_par_itm_sub3"))
					.set(S0.bom_ptn).eq(bind("new_bom_ptn"))
					.set(S0.chd_itm_cd).eq(bind("new_chd_itm_cd"))
					.set(S0.chd_itm_sub1).eq(bind("new_chd_itm_sub1"))
					.set(S0.chd_itm_sub2).eq(bind("new_chd_itm_sub2"))
					.set(S0.chd_itm_sub3).eq(bind("new_chd_itm_sub3"))
					.set(S0.par_rqmt_qty).eq(bind("par_rqmt_qty"))
					.set(S0.chd_rqmt_qty).eq(bind("chd_rqmt_qty"))
					.set(S0.chd_base_qty).eq(bind("chd_base_qty"))
					.set(S0.fxd_chd_rqmt_qty).eq(bind("fxd_chd_rqmt_qty"))
					.set(S0.chd_min_qty).eq(bind("chd_min_qty"))
					.set(S0.chd_batch_qty).eq(bind("chd_batch_qty"))
					.where(
						value(0).eq(value(0))
						.and(S0.par_itm_cd.eq(bind("par_itm_cd")))
						.and(S0.par_itm_sub1.eq(bind("par_itm_sub1")))
						.and(S0.par_itm_sub2.eq(bind("par_itm_sub2")))
						.and(S0.par_itm_sub3.eq(bind("par_itm_sub3")))
						.and(S0.bom_ptn.eq(bind("bom_ptn")))
						.and(S0.chd_itm_cd.eq(bind("chd_itm_cd")))
						.and(S0.chd_itm_sub1.eq(bind("chd_itm_sub1")))
						.and(S0.chd_itm_sub2.eq(bind("chd_itm_sub2")))
						.and(S0.chd_itm_sub3.eq(bind("chd_itm_sub3")))
						.and(S0.term.eq(bind("term")))
						.and(S0.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0.oper_cd.eq(bind("oper_cd")))
						.cutoff$and(
							bind("no_oper_cd_str").eq(value(true))
							.and(S0.oper_cd.isNull())
						)
						.cutoff$and(S0.oper_seq.eq(bind("oper_seq")))
						.cutoff$and(
							bind("no_oper_seq_str").eq(value(true))
							.and(S0.oper_seq.isNull())
						)
						.cutoff$and(S0.alt_grp_cd.eq(bind("alt_grp_cd")))
						.cutoff$and(
							bind("no_alt_grp_cd_str").eq(value(true))
							.and(S0.alt_grp_cd.isNull())
						)
						.cutoff$and(S0.expns_cd.eq(bind("expns_cd")))
						.cutoff$and(
							bind("no_expns_cd_str").eq(value(true))
							.and(S0.expns_cd.isNull())
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0530_MGW_BOM_KEY_Query_S01
	 */
	static MCQueryPlan MGBDL0530_MGW_BOM_KEY_S01() {
		MGW_BOM_KEY_R S0_T = MGW_BOM_KEY_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0530_MGW_BOM_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.par_itm_cd,
						S0_T.par_itm_sub1,
						S0_T.par_itm_sub2,
						S0_T.par_itm_sub3
					)
					.from(S0_T)
					.where(
						MGPA_FIX_CHK$F_BOM(
							S0_T.term,
							S0_T.calc_ctg_cd,
							S0_T.wg_cd,
							S0_T.par_itm_cd,
							S0_T.par_itm_sub1,
							S0_T.par_itm_sub2,
							S0_T.par_itm_sub3
						).eq(value(true))
					)
			);
	}
}