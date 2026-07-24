package mcframe.serverMGBE.MGBEL0210;

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
	 * -- MGBEL0210_MGT_STD_FIX_Query_S01
	 */
	static MCQueryPlan MGBEL0210_MGT_STD_FIX_S01() {
		MGT_STD_FIX_R S0_T = MGT_STD_FIX_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
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
		MGT_STD_FIX_R S1_W1 = MGT_STD_FIX_R.create("W1");
		MGT_STD_TOP_R S1_W2 = MGT_STD_TOP_R.create("W2");
		MGT_STD_INPT_R S1_W3 = MGT_STD_INPT_R.create("W3");
		MAM_ITM_R S1_W4 = MAM_ITM_R.create("W4");
		MGT_STD_TOP_R S2_W1 = MGT_STD_TOP_R.create("W1");
		MGT_STD_INPT_R S2_W2 = MGT_STD_INPT_R.create("W2");
		MAM_ITM_R S2_W3 = MAM_ITM_R.create("W3");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0210_MGT_STD_FIX_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_CALC_CTG.calc_ctg_nm,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						nvl(
							S0_ITM.cost_std_qty,
							value(1)
						).as("base_qty"),
						value(1).as("unit_qty"),
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T.term,
						S0_T.std_qty,
						S0_T.std_upri
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_CALC_CTG).on(S0_CALC_CTG.calc_ctg_cd.eq(S0_T.calc_ctg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.term.gte(bind("term_fr")))
						.and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
						.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
						.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
						.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
						.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
						.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
						.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
						.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
						.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
						.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("par_itm_cd", "par_itm_sub1", "par_itm_sub2", "par_itm_sub3", "par_itm_nm"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(value("X")).from(S1_W1.innerJoin(S1_W2).on(S1_W2.calc_no.eq(S1_W1.calc_no).and(S1_W2.calc_grp_cd.eq(S1_W1.calc_grp_cd)).and(S1_W2.itm_cd.eq(S1_W1.itm_cd)).and(S1_W2.itm_sub1.eq(S1_W1.itm_sub1)).and(S1_W2.itm_sub2.eq(S1_W1.itm_sub2)).and(S1_W2.itm_sub3.eq(S1_W1.itm_sub3)).and(S1_W2.wg_cd.eq(S1_W1.wg_cd))).innerJoin(S1_W3).on(S1_W3.calc_no.eq(S1_W2.calc_no).and(S1_W3.calc_grp_cd.eq(S1_W2.calc_grp_cd)).and(S1_W3.top_rec_no.eq(S1_W2.top_rec_no))).leftOuterJoin(S1_W4).on(S1_W4.itm_cd.eq(S1_W1.itm_cd).and(S1_W4.itm_sub1.eq(S1_W1.itm_sub1)).and(S1_W4.itm_sub2.eq(S1_W1.itm_sub2)).and(S1_W4.itm_sub3.eq(S1_W1.itm_sub3)))).where(value(0).eq(value(0)).and(S1_W1.term.eq(S0_T.term)).and(S1_W1.wg_cd.eq(S0_T.wg_cd)).cutoff$and(S1_W1.itm_cd.like(bind("par_itm_cd"))).cutoff$and(S1_W1.itm_sub1.like(bind("par_itm_sub1"))).cutoff$and(S1_W1.itm_sub2.like(bind("par_itm_sub2"))).cutoff$and(S1_W1.itm_sub3.like(bind("par_itm_sub3"))).and(S1_W2.sls_flg.eq(value(false))).and(S1_W3.itm_cd.eq(S0_T.itm_cd)).and(S1_W3.itm_sub1.eq(S0_T.itm_sub1)).and(S1_W3.itm_sub2.eq(S0_T.itm_sub2)).and(S1_W3.itm_sub3.eq(S0_T.itm_sub3)).cutoff$and(S1_W4.itm_nm.like(bind("par_itm_nm"))))))),
				when(boundOr("chd_itm_cd", "chd_itm_sub1", "chd_itm_sub2", "chd_itm_sub3", "chd_itm_nm"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(value("X")).from(S2_W1.innerJoin(S2_W2).on(S2_W2.calc_no.eq(S2_W1.calc_no).and(S2_W2.calc_grp_cd.eq(S2_W1.calc_grp_cd)).and(S2_W2.top_rec_no.eq(S2_W1.top_rec_no))).leftOuterJoin(S2_W3).on(S2_W3.itm_cd.eq(S2_W2.itm_cd).and(S2_W3.itm_sub1.eq(S2_W2.itm_sub1)).and(S2_W3.itm_sub2.eq(S2_W2.itm_sub2)).and(S2_W3.itm_sub3.eq(S2_W2.itm_sub3)))).where(value(0).eq(value(0)).and(S2_W1.calc_no.eq(S0_T.calc_no)).and(S2_W1.calc_grp_cd.eq(S0_T.calc_grp_cd)).and(S2_W1.itm_cd.eq(S0_T.itm_cd)).and(S2_W1.itm_sub1.eq(S0_T.itm_sub1)).and(S2_W1.itm_sub2.eq(S0_T.itm_sub2)).and(S2_W1.itm_sub3.eq(S0_T.itm_sub3)).and(S2_W1.wg_cd.eq(S0_T.wg_cd)).cutoff$and(S2_W2.itm_cd.like(bind("chd_itm_cd"))).cutoff$and(S2_W2.itm_sub1.like(bind("chd_itm_sub1"))).cutoff$and(S2_W2.itm_sub2.like(bind("chd_itm_sub2"))).cutoff$and(S2_W2.itm_sub3.like(bind("chd_itm_sub3"))).cutoff$and(S2_W3.itm_nm.like(bind("chd_itm_nm"))))).or(value(0).eq(value(0)).cutoff$and(S0_T.itm_cd.like(bind("chd_itm_cd"))).cutoff$and(S0_T.itm_sub1.like(bind("chd_itm_sub1"))).cutoff$and(S0_T.itm_sub2.like(bind("chd_itm_sub2"))).cutoff$and(S0_T.itm_sub3.like(bind("chd_itm_sub3"))).cutoff$and(S0_ITM.itm_nm.like(bind("chd_itm_nm")))))),
				when(null)
					.orderBy(DS0D, S0_ITM.itm_typ.asc()),
				when(null)
					.orderBy(DS0D, S0_ITM.itm_typ_d_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_ITM.itm_jnl_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.calc_ctg_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.term.asc()),
				when(null)
					.orderBy(DS0D, S0_T.wg_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.itm_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.itm_sub1.asc()),
				when(null)
					.orderBy(DS0D, S0_T.itm_sub2.asc()),
				when(null)
					.orderBy(DS0D, S0_T.itm_sub3.asc())
			);
	}
}