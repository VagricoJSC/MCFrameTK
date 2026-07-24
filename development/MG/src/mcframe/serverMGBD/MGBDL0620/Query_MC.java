package mcframe.serverMGBD.MGBDL0620;

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
	 * -- MGBDL0620_MGT_ITM_FIX_Query_S01
	 */
	static MCQueryPlan MGBDL0620_MGT_ITM_FIX_S01() {
		MGT_ITM_FIX_R S0_T = MGT_ITM_FIX_R.create("T");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
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
		MAVM_RD_WG_R S1_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_WG_R S2_RDWG = MAVM_RD_WG_R.create("RDWG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0620_MGT_ITM_FIX_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.expns_cd,
						S0_T.base_qty,
						S0_T.std_upri,
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
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_CO.base_cur_cd.as("cur_cd"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.crossJoin(S0_CO)
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_CO.co_cd.eq(S0_CO.co_cd))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T.expns_cd.like(bind("expns_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
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
						.cutoff$and(S0_T.non_calc_flg.eq(bind("non_calc_flg_str")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.expns_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("expns_nm"))
					.view(v -> v.leftOuterJoin(S0_EXPNS).on(S0_T.expns_cd.eq(S0_EXPNS.expns_cd)))
					.predicate(p -> p.cutoff$and(S0_EXPNS.expns_nm.like(bind("expns_nm")))),
				when(boundOr("cmn_only_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_only_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(S1_RDWG.prAll()).from(S1_RDWG).where(S1_RDWG.wg_cd.eq(S0_T.wg_cd))))),
				when(boundOr("cmn_wg_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(exists(subQuery().select(S2_RDWG.prAll()).from(S2_RDWG).where(S2_RDWG.wg_cd.eq(S0_T.wg_cd)))))),
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
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0620_MGW_ITM_FIX_KEY_Query_S01
	 */
	static MCQueryPlan MGBDL0620_MGW_ITM_FIX_KEY_S01() {
		MGW_ITM_FIX_KEY_R S0_T = MGW_ITM_FIX_KEY_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0620_MGW_ITM_FIX_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3
					)
					.from(S0_T)
					.where(
						MGPA_FIX_CHK$F_FIX(
							S0_T.term,
							S0_T.calc_ctg_cd,
							S0_T.wg_cd,
							S0_T.itm_cd,
							S0_T.itm_sub1,
							S0_T.itm_sub2,
							S0_T.itm_sub3
						).eq(value(true))
					)
			);
	}
}