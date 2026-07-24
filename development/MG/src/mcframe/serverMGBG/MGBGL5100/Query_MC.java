package mcframe.serverMGBG.MGBGL5100;

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
	 * -- MGBGL5100_MGT_PLN_ALC_AMT_Query_I01
	 */
	static MCQueryPlan MGBGL5100_MGT_PLN_ALC_AMT_I01() {
		MGT_PLN_ALC_AMT_R S0 = MGT_PLN_ALC_AMT_R.create();
		MCTempView S1_X = createTempView("X");
		MGT_PLN_ALC_AMT_IF_R S2_T = MGT_PLN_ALC_AMT_IF_R.create("T");
		MAW_WG_KEY_R S3_W = MAW_WG_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL5100_MGT_PLN_ALC_AMT_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_alc_amt_key,
						S0.calc_ctg_cd,
						S0.alc_rec_typ,
						S0.wg_cd,
						S0.ym,
						S0.alc_ac_cd,
						S0.dpt_cd,
						S0.loc_cd,
						S0.oper_cd,
						S0.bp_cd,
						S0.ctg_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.amt,
						S0.trd_wg_cd,
						S0.trd_calc_grp_cd,
						S0.trd_calc_no,
						S0.pre_alc_fin_flg,
						S0.rmrks,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.value())),
							bind("calc_ctg_cd_to").as("calc_ctg_cd"),
							value(MGC_ALC_REC_TYP.AC_IMP.value()).as("alc_rec_typ"),
							S1_X.pr(S2_T.wg_cd),
							S1_X.pr(S2_T.ym),
							S1_X.pr(S2_T.alc_ac_cd),
							S1_X.pr(S2_T.dpt_cd),
							S1_X.pr(S2_T.loc_cd),
							S1_X.pr(S2_T.oper_cd),
							S1_X.pr(S2_T.bp_cd),
							S1_X.pr(S2_T.ctg_cd),
							S1_X.pr(S2_T.itm_cd),
							S1_X.pr(S2_T.itm_sub1),
							S1_X.pr(S2_T.itm_sub2),
							S1_X.pr(S2_T.itm_sub3),
							S1_X.pr(S2_T.lot_no),
							S1_X.pr(S2_T.sublot_no),
							S1_X.pr(S2_T.sno1),
							S1_X.pr(S2_T.sno2),
							S1_X.pr(S2_T.sno3),
							S1_X.pr(S2_T.sno4),
							S1_X.pr("amt"),
							S1_X.pr("trd_wg_cd"),
							S1_X.pr("trd_calc_grp_cd"),
							S1_X.pr("trd_calc_no"),
							value(false),
							S1_X.pr(S2_T.rmrks),
							S1_X.pr(S2_T.sub_char1),
							S1_X.pr(S2_T.sub_char2),
							S1_X.pr(S2_T.sub_char3)
						)
						.from(
							subQuery()
							.select(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T.alc_ac_cd,
								S2_T.dpt_cd,
								S2_T.loc_cd,
								S2_T.oper_cd,
								S2_T.bp_cd,
								S2_T.ctg_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								sum(S2_T.amt).as("amt"),
								nullValue().as("trd_wg_cd"),
								nullValue().as("trd_calc_grp_cd"),
								nullValue().as("trd_calc_no"),
								S2_T.rmrks,
								S2_T.sub_char1,
								S2_T.sub_char2,
								S2_T.sub_char3
							)
							.from(S2_T)
							.where(
								value(0).eq(value(0))
								.and(S2_T.ym.between(bind("ym_fr"), bind("ym_to")))
								.and(S2_T.calc_ctg_cd.eq(bind("calc_ctg_cd_fr")))
								.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_W)
											.where(
												value(0).eq(value(0))
												.and(S3_W.wg_cd.eq(S2_T.wg_cd))
											)
										)
									)
							)
							.groupBy(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T.alc_ac_cd,
								S2_T.dpt_cd,
								S2_T.loc_cd,
								S2_T.oper_cd,
								S2_T.bp_cd,
								S2_T.ctg_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								S2_T.rmrks,
								S2_T.sub_char1,
								S2_T.sub_char2,
								S2_T.sub_char3
							).view(S1_X)
						)
						.where(
							value(0).eq(value(0))
						)
					)
			);
	}
	
	/**
	 * -- MGBGL5100_MAM_WG_Query_S01
	 */
	static MCQueryPlan MGBGL5100_MAM_WG_S01() {
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL5100_MAM_WG_Query_S01")
				.mainQuery()
				.select(S0_WG.wg_cd)
					.from(
						S0_WG
						.innerJoin(S1_W).on(S0_WG.wg_cd.eq(S1_W.wg_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(0).eq(value(1))
							.or(S0_WG.sls_flg.eq(value(true)))
							.or(S0_WG.lg_flg.eq(value(true)))
							.or(S0_WG.mfg_flg.eq(value(true)))
							.or(S0_WG.purc_flg.eq(value(true)))
							.or(S0_WG.sls_flg.eq(value(false)))
							.and(S0_WG.lg_flg.eq(value(false)))
							.and(S0_WG.mfg_flg.eq(value(false)))
							.and(S0_WG.purc_flg.eq(value(false)))
							.and(S0_WG.ar_flg.eq(value(false)))
							.and(S0_WG.ap_flg.eq(value(false)))
							.and(S0_WG.sd_flg.eq(value(false)))
							.and(S0_WG.plm_flg.eq(value(false)))
						)
					)
			);
	}
}