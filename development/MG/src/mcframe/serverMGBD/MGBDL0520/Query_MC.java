package mcframe.serverMGBD.MGBDL0520;

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
	 * -- MGBDL0520_MGT_BOM_Query_S01
	 */
	static MCQueryPlan MGBDL0520_MGT_BOM_S01() {
		MGT_BOM_R S0_T = MGT_BOM_R.create("T");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_ITM_R S0_CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_ITM_TYP_D_R S0_CHD_ITM_TYP_D = MAM_ITM_TYP_D_R.create("CHD_ITM_TYP_D");
		MAM_UNIT_R S0_CHD_UNIT = MAM_UNIT_R.create("CHD_UNIT");
		MAM_ITM_R S0_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_UNIT_R S0_PAR_UNIT = MAM_UNIT_R.create("PAR_UNIT");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAVM_RD_WG_R S1_RDWG = MAVM_RD_WG_R.create("RDWG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0520_MGT_BOM_Query_S01")
					.mainQuery()
					.select(
						S0_T.oper_cd,
						S0_OPER.oper_nm,
						S0_T.oper_seq,
						S0_T.chd_itm_cd,
						S0_T.chd_itm_sub1,
						S0_T.chd_itm_sub2,
						S0_T.chd_itm_sub3,
						S0_CHD_ITM.itm_nm.as("chd_itm_nm"),
						S0_CHD_ITM.itm_typ.as("chd_itm_typ"),
						S0_CHD_ITM.itm_typ_d_cd.as("chd_itm_typ_d_cd"),
						S0_CHD_ITM_TYP_D.itm_typ_d_nm.as("chd_itm_typ_d_nm"),
						S0_CHD_ITM.unit_cd.as("chd_unit_cd"),
						S0_CHD_UNIT.unit_nm.as("chd_unit_nm"),
						S0_CHD_ITM.dec_place.as("chd_dec_place"),
						S0_PAR_ITM.unit_cd.as("par_unit_cd"),
						S0_PAR_UNIT.unit_nm.as("par_unit_nm"),
						S0_PAR_ITM.dec_place.as("par_dec_place"),
						S0_T.alt_grp_cd,
						S0_T.expns_cd,
						S0_EXPNS.expns_nm,
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
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T
						.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd))
						.leftOuterJoin(S0_CHD_ITM).on(
							S0_T.chd_itm_cd.eq(S0_CHD_ITM.itm_cd)
							.and(S0_T.chd_itm_sub1.eq(S0_CHD_ITM.itm_sub1))
							.and(S0_T.chd_itm_sub2.eq(S0_CHD_ITM.itm_sub2))
							.and(S0_T.chd_itm_sub3.eq(S0_CHD_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_CHD_ITM_TYP_D).on(
							S0_CHD_ITM.itm_typ.eq(S0_CHD_ITM_TYP_D.itm_typ)
							.and(S0_CHD_ITM.itm_typ_d_cd.eq(S0_CHD_ITM_TYP_D.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_CHD_UNIT).on(S0_CHD_ITM.unit_cd.eq(S0_CHD_UNIT.unit_cd))
						.leftOuterJoin(S0_PAR_ITM).on(
							S0_T.par_itm_cd.eq(S0_PAR_ITM.itm_cd)
							.and(S0_T.par_itm_sub1.eq(S0_PAR_ITM.itm_sub1))
							.and(S0_T.par_itm_sub2.eq(S0_PAR_ITM.itm_sub2))
							.and(S0_T.par_itm_sub3.eq(S0_PAR_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_PAR_UNIT).on(S0_PAR_ITM.unit_cd.eq(S0_PAR_UNIT.unit_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_T.expns_cd.eq(S0_EXPNS.expns_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.par_itm_cd.eq(bind("par_itm_cd")))
						.and(S0_T.par_itm_sub1.eq(bind("par_itm_sub1")))
						.and(S0_T.par_itm_sub2.eq(bind("par_itm_sub2")))
						.and(S0_T.par_itm_sub3.eq(bind("par_itm_sub3")))
						.and(S0_T.bom_ptn.eq(bind("bom_ptn")))
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(S1_RDWG.prAll()).from(S1_RDWG).where(S1_RDWG.wg_cd.eq(S0_T.wg_cd))))),
				when(null)
					.orderBy(DS0D, S0_T.oper_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.oper_seq.asc()),
				when(null)
					.orderBy(DS0D, S0_T.disp_seq.asc()),
				when(null)
					.orderBy(DS0D, S0_T.alt_grp_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.chd_itm_cd.asc()),
				when(null)
					.orderBy(DS0D, S0_T.chd_itm_sub1.asc()),
				when(null)
					.orderBy(DS0D, S0_T.chd_itm_sub2.asc()),
				when(null)
					.orderBy(DS0D, S0_T.chd_itm_sub3.asc())
			);
	}
	
	/**
	 * -- MGBDL0520_MGW_BOM_KEY_Query_S01
	 */
	static MCQueryPlan MGBDL0520_MGW_BOM_KEY_S01() {
		MGW_BOM_KEY_R S0_T = MGW_BOM_KEY_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0520_MGW_BOM_KEY_Query_S01")
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