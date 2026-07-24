package mcframe.serverMGBD.MGBDL0540;

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
	 * -- MGBDL0540_MGT_ITM_DTL_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_DTL_S01() {
		MGT_ITM_DTL_R S0_T = MGT_ITM_DTL_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_COST_DPT_R S0_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_COST_DPT_R S0_EXP_DPT = MAM_COST_DPT_R.create("EXP_DPT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.sppl_cd,
						S0_T.rqst_wg_cd,
						S0_T.cost_ratio,
						S0_T.oper_ptn,
						S0_T.bom_ptn,
						S0_T.min_lot_qty,
						S0_T.batch_lot_qty,
						S0_T.fxd_lot_qty,
						S0_T.fxd_yield_qty,
						S0_T.max_qty,
						S0_T.nmr_qty,
						S0_T.dnm_qty,
						S0_T.alc_dpt_cd,
						S0_T.exp_dpt_cd,
						S0_T.exp_prio,
						S0_T.alc_val1,
						S0_T.alc_val2,
						S0_T.alc_val3,
						S0_T.alc_val4,
						S0_T.alc_val5,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T.term.as("join_term_")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("dtl_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_RD_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
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
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("exp_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("exp_dpt_nm", m.dpt_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGT_ITM_FIX_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_FIX_S01() {
		MGT_ITM_FIX_R S0_T = MGT_ITM_FIX_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_FIX_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.base_qty,
						S0_T.expns_cd,
						S0_T.std_upri,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("fix_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.expns_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
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
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("expns_nm", m.expns_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGT_ITM_OPER_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_OPER_S01() {
		MGT_ITM_OPER_R S0_T = MGT_ITM_OPER_R.create("T");
		MGW_BOM_EX_OPER_R S0_BOM_EX_OPER = MGW_BOM_EX_OPER_R.create("BOM_EX_OPER");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_UNIT_R S0_OPER_UNIT = MAM_UNIT_R.create("OPER_UNIT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_OPER_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.oper_ptn,
						S0_T.loc_cd,
						S0_T.oper_seq,
						S0_T.disp_seq,
						S0_T.oper_cd,
						S0_T.yield_oper_flg,
						S0_T.nmr_qty,
						S0_T.dnm_qty,
						S0_T.oper_unit_cd,
						S0_T.oper_std_qty,
						S0_T.oper_conv_qty,
						S0_T.dec_place,
						S0_T.unit_conv_rnd_typ,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.innerJoin(S0_BOM_EX_OPER).on(
							S0_T.itm_cd.eq(S0_BOM_EX_OPER.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_BOM_EX_OPER.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_BOM_EX_OPER.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_BOM_EX_OPER.itm_sub3))
							.and(S0_T.calc_ctg_cd.eq(S0_BOM_EX_OPER.calc_ctg_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.non_calc_flg.eq(value(false)))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_ptn.asc(),
						S0_T.oper_cd.asc(),
						S0_T.oper_seq.asc(),
						S0_T.disp_seq.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGT_ITM_PROC_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_PROC_S01() {
		MGT_ITM_PROC_R S0_T = MGT_ITM_PROC_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_PROC_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.sppl_cd,
						S0_T.base_qty,
						S0_T.cur_cd,
						S0_T.upri,
						S0_T.cost_ratio,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("proc_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.sppl_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
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
	 * -- MGBDL0540_MGT_ITM_PROV_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_PROV_S01() {
		MGT_ITM_PROV_R S0_T = MGT_ITM_PROV_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_PRSPPL = MAM_BP_R.create("PRSPPL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_PROV_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.prsppl_cd,
						S0_T.prov_typ,
						S0_T.base_qty,
						S0_T.cur_cd,
						S0_T.upri,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("prov_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.prsppl_cd.asc(),
						S0_T.prov_typ.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
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
	 * -- MGBDL0540_MGT_ITM_PURC_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_PURC_S01() {
		MGT_ITM_PURC_R S0_T = MGT_ITM_PURC_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_PURC_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.sppl_cd,
						S0_T.base_qty,
						S0_T.cur_cd,
						S0_T.upri,
						S0_T.cost_ratio,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("purc_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.sppl_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
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
	 * -- MGBDL0540_MGT_ITM_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_S01() {
		MGT_ITM_R S0_T = MGT_ITM_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_CALC_PTN_R S0_CALC_PTN = MAM_CALC_PTN_R.create("CALC_PTN");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.calc_ptn_cd,
						S0_T.std_qty,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("itm_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.calc_ptn_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_CALC_PTN_R.class, r -> toCondition(
							r.getStringNE("calc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ptn_nm", m.calc_ptn_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGT_ITM_SLS_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_SLS_S01() {
		MGT_ITM_SLS_R S0_T = MGT_ITM_SLS_R.create("T");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_SLS_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.dpt_cd,
						S0_T.cst_cd,
						S0_T.dlv_cd,
						S0_T.dest_cd1,
						S0_T.dest_cd2,
						S0_T.dest_cd3,
						S0_T.base_qty,
						S0_T.cur_cd,
						S0_T.upri,
						S0_T.prio,
						S0_T.alc_val1,
						S0_T.alc_val2,
						S0_T.alc_val3,
						S0_T.alc_val4,
						S0_T.alc_val5,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T.term.as("join_term_")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.non_calc_flg.eq(value(false)))
						.and(S0_T.calc_ctg_cd.eq(bind("sls_calc_ctg_cd")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.dpt_cd.asc(),
						S0_T.cst_cd.asc(),
						S0_T.dlv_cd.asc(),
						S0_T.dest_cd1.asc(),
						S0_T.dest_cd2.asc(),
						S0_T.dest_cd3.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
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
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGT_ITM_WK_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGT_ITM_WK_S01() {
		MGT_ITM_WK_R S0_T = MGT_ITM_WK_R.create("T");
		MGW_BOM_EX_OPER_R S0_BOM_EX_OPER = MGW_BOM_EX_OPER_R.create("BOM_EX_OPER");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_WK_COST_R S0_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGT_ITM_WK_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.oper_ptn,
						S0_T.oper_cd,
						S0_T.oper_seq,
						S0_T.wk_cost_cd,
						S0_T.base_qty,
						S0_T.wk_cost,
						S0_T.fxd_wk_cost,
						S0_T.min_wk_cost,
						S0_T.batch_wk_cost,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.innerJoin(S0_BOM_EX_OPER).on(
							S0_T.itm_cd.eq(S0_BOM_EX_OPER.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_BOM_EX_OPER.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_BOM_EX_OPER.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_BOM_EX_OPER.itm_sub3))
							.and(S0_T.calc_ctg_cd.eq(S0_BOM_EX_OPER.calc_ctg_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_T.wg_cd.eq(bind("wg_cd")))
						)
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.non_calc_flg.eq(value(false)))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_ptn.asc(),
						S0_T.oper_cd.asc(),
						S0_T.oper_seq.asc(),
						S0_T.wk_cost_cd.asc()
					)
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("unit_cd", m.unit_cd());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
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
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0540_MGW_BOM_EX_Query_S01
	 */
	static MCQueryPlan MGBDL0540_MGW_BOM_EX_S01() {
		MGW_BOM_EX_R S0_T = MGW_BOM_EX_R.create("T");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_ITM_R S0_CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_ITM_TYP_D_R S0_CHD_ITM_TYP_D = MAM_ITM_TYP_D_R.create("CHD_ITM_TYP_D");
		MAM_ITM_JNL_R S0_CHD_ITM_JNL = MAM_ITM_JNL_R.create("CHD_ITM_JNL");
		MAM_ITM_R S0_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_UNIT_R S0_PAR_UNIT = MAM_UNIT_R.create("PAR_UNIT");
		MAM_UNIT_R S0_CHD_UNIT = MAM_UNIT_R.create("CHD_UNIT");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_CALC_CTG_R S0_ITM_CALC_CTG = MAM_CALC_CTG_R.create("ITM_CALC_CTG");
		MAM_CALC_CTG_R S0_DTL_CALC_CTG = MAM_CALC_CTG_R.create("DTL_CALC_CTG");
		MAM_CALC_CTG_R S0_PURC_CALC_CTG = MAM_CALC_CTG_R.create("PURC_CALC_CTG");
		MAM_CALC_CTG_R S0_PROC_CALC_CTG = MAM_CALC_CTG_R.create("PROC_CALC_CTG");
		MAM_CALC_CTG_R S0_PROV_CALC_CTG = MAM_CALC_CTG_R.create("PROV_CALC_CTG");
		MAM_CALC_CTG_R S0_SLS_CALC_CTG = MAM_CALC_CTG_R.create("SLS_CALC_CTG");
		MAM_CALC_CTG_R S0_FIX_CALC_CTG = MAM_CALC_CTG_R.create("FIX_CALC_CTG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0540_MGW_BOM_EX_Query_S01")
					.mainQuery()
					.select(
						S0_T.bom_lvl.as("hrrchy"),
						S0_T.loop_flg,
						S0_T.bottom_flg,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.bom_ptn,
						S0_T.oper_cd,
						S0_T.disp_seq,
						S0_T.par_rqmt_qty,
						S0_T.par_itm_cd,
						S0_T.par_itm_sub1,
						S0_T.par_itm_sub2,
						S0_T.par_itm_sub3,
						S0_T.chd_rqmt_qty,
						S0_T.chd_base_qty,
						S0_T.fxd_chd_rqmt_qty,
						S0_T.chd_min_qty,
						S0_T.chd_batch_qty,
						S0_T.alt_grp_cd,
						S0_T.alt_itm_ratio,
						S0_T.expns_cd,
						decode(
							S0_T.wg_cd,
							value(MAC_STR.NULL_VAL.value()),
							nullValue(),
							S0_T.wg_cd
						).as("wg_cd"),
						S0_T.calc_ctg_cd,
						S0_T.itm_calc_ctg_cd,
						S0_T.dtl_calc_ctg_cd,
						S0_T.purc_calc_ctg_cd,
						S0_T.proc_calc_ctg_cd,
						S0_T.prov_calc_ctg_cd,
						S0_T.sls_calc_ctg_cd,
						S0_T.fix_calc_ctg_cd,
						// this field is appended by sql coverter.
						S0_T.wg_cd.as("join_wg_cd_")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_T.sort_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
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
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_jnl_cd", m.itm_jnl_cd());
							r.setStringNE("chd_unit_cd", m.unit_cd());
							r.setNumberNE("chd_dec_place", m.dec_place());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("par_itm_cd"),
							r.getStringNE("par_itm_sub1"),
							r.getStringNE("par_itm_sub2"),
							r.getStringNE("par_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_nm", m.itm_nm());
							r.setStringNE("par_unit_cd", m.unit_cd());
							r.setNumberNE("par_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("par_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("chd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_unit_nm", m.unit_nm());
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
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("itm_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("dtl_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dtl_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("purc_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("proc_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("proc_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("prov_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prov_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("sls_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("fix_calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_calc_ctg_nm", m.calc_ctg_nm());
					})
				)
			);
	}
}