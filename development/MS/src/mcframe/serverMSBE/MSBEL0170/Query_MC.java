package mcframe.serverMSBE.MSBEL0170;

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
	 * -- MSBEL0170_MAM_STK_RPL_Query_S01
	 */
	static MCQueryPlan MSBEL0170_MAM_STK_RPL_S01() {
		MAM_STK_RPL_R S0_M1 = MAM_STK_RPL_R.create("M1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_SITE_R S0_M5 = MAM_SITE_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0170_MAM_STK_RPL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M2.itm_nm,
						S0_M2.asset_mng_typ,
						S0_M2.unit_cd,
						S0_M2.dec_place,
						S0_M1.loc_cd.as("strg_loc_cd"),
						S0_M4.loc_nm.as("strg_loc_nm"),
						S0_M4.site_cd.as("strg_site_cd"),
						S0_M4.lg_grp_cd.as("strg_lg_grp_cd"),
						S0_M4.wg_cd.as("strg_wg_cd"),
						S0_M2.ver_flg,
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_unit_cd,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M1.rord_stk_qty,
						S0_M1.gi_schd_flg,
						S0_M1.rord_rqst_qty,
						S0_M1.gi_loc_cd.as("rqst_loc_cd"),
						S0_M1.gi_loc_cd,
						S0_M1.gi_str_ln_cd.as("rqst_str_ln_cd")
						,S0_M4.sppl_cd.as("strg_sppl_cd")
					)
					.from(
						S0_M1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_M4.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.st_dt.lte(bind("master_dt")))
						.and(S0_M1.end_dt.gte(bind("master_dt")))
						.and(S0_M1.rord_stk_qty.isNotNull())
						.cutoff$and(S0_M4.site_cd.like(bind("strg_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M4.wg_cd.like(bind("strg_wg_cd")))
						.cutoff$and(S0_M4.lg_grp_cd.like(bind("strg_lg_grp_cd")))
						.cutoff$and(S0_M1.loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("strg_loc_nm")))
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_M1.itm_cd.asc(),
						S0_M1.itm_sub1.asc(),
						S0_M1.itm_sub2.asc(),
						S0_M1.itm_sub3.asc(),
						S0_M1.loc_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M3.itm_typ.eq(S0_M2.itm_typ).and(S0_M3.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("strg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M5.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.site_nm.like(bind("strg_site_nm")))),
				when(boundOr("strg_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M6.lg_grp_cd.eq(S0_M4.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("strg_lg_grp_nm")))),
				when(boundOr("strg_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.wg_cd.eq(S0_M4.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("strg_wg_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("strg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("strg_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_wg_nm", m.wg_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
							r.setBooleanNE("rqst_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd"),
							r.getStringNE("rqst_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					})
				)
			);
	}
}