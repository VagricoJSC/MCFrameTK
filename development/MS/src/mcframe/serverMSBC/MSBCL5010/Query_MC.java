package mcframe.serverMSBC.MSBCL5010;

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
	 * -- MSBCL5010_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSW_ITM_ORDER_KEY_R S0_T2 = MSW_ITM_ORDER_KEY_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T1.itm_ord_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.inst_qty,
						S0_T1.yield_schd_qty,
						S0_T1.not_inst_qty,
						S0_T1.mfg_inst_unit_typ,
						S0_T1.inst_yield_schd_qty,
						S0_T1.yield_act_qty,
						S0_T1.purc_act_qty,
						S0_T1.insp_act_qty,
						S0_T1.itm_ord_sts_typ,
						S0_T1.blk_flg,
						S0_T1.po_schd_dt,
						S0_T1.act_purc_lt,
						S0_T1.inst_mfg_st_schd_dt,
						S0_T1.mfg_st_act_dt,
						S0_T1.mfg_end_schd_dt,
						S0_T1.mfg_end_act_dt,
						S0_T1.act_mfg_lt,
						S0_T1.inst_gi_schd_dt,
						S0_T1.gi_act_dt,
						S0_T1.inst_strg_schd_dt,
						S0_T1.strg_act_dt,
						S0_T1.inst_accpt_schd_dt,
						S0_T1.accpt_act_dt,
						S0_T1.inst_insp_st_schd_dt,
						S0_T1.insp_st_act_dt,
						S0_T1.inst_insp_end_schd_dt,
						S0_T1.insp_end_act_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_ITM_ORDER_Query_U01
	 */
	static MCQueryPlan MSBCL5010_MST_ITM_ORDER_U01() {
		MST_ITM_ORDER_R S0_T = MST_ITM_ORDER_R.create("T");
		MSW_ITM_ORDER_R S1_W = MSW_ITM_ORDER_R.create("W");
		MSW_ITM_ORDER_R S2_W = MSW_ITM_ORDER_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ITM_ORDER_Query_U01")
					.update(S0_T)
					.set(
						S0_T.not_inst_qty,
						S0_T.inst_yield_schd_qty,
						S0_T.yield_act_qty,
						S0_T.purc_act_qty,
						S0_T.insp_act_qty,
						S0_T.itm_ord_sts_typ,
						S0_T.blk_flg,
						S0_T.po_dt,
						S0_T.act_purc_lt,
						S0_T.inst_mfg_st_schd_dt,
						S0_T.mfg_st_act_dt,
						S0_T.inst_mfg_end_schd_dt,
						S0_T.mfg_end_act_dt,
						S0_T.act_mfg_lt,
						S0_T.inst_gi_schd_dt,
						S0_T.gi_act_dt,
						S0_T.inst_strg_schd_dt,
						S0_T.strg_act_dt,
						S0_T.inst_accpt_schd_dt,
						S0_T.accpt_act_dt,
						S0_T.inst_insp_st_schd_dt,
						S0_T.insp_st_act_dt,
						S0_T.inst_insp_end_schd_dt,
						S0_T.insp_end_act_dt,
						S0_T.mfg_inst_unit_typ
					).eq(subQuery()
						.select(
							S1_W.not_inst_qty,
							S1_W.inst_yield_schd_qty,
							S1_W.yield_act_qty,
							S1_W.purc_act_qty,
							S1_W.insp_act_qty,
							S1_W.itm_ord_sts_typ,
							S1_W.blk_flg,
							S1_W.po_dt,
							S1_W.purc_lt,
							S1_W.inst_mfg_st_schd_dt,
							S1_W.mfg_st_act_dt,
							S1_W.inst_mfg_end_schd_dt,
							S1_W.mfg_end_act_dt,
							S1_W.mfg_lt,
							S1_W.inst_gi_schd_dt,
							S1_W.gi_act_dt,
							S1_W.inst_strg_schd_dt,
							S1_W.strg_act_dt,
							S1_W.inst_accpt_schd_dt,
							S1_W.accpt_act_dt,
							S1_W.inst_insp_st_schd_dt,
							S1_W.insp_st_act_dt,
							S1_W.inst_insp_end_schd_dt,
							S1_W.insp_end_act_dt,
							S1_W.mfg_inst_unit_typ
						)
						.from(S1_W)
						.where(
							value(0).eq(value(0))
							.and(S1_W.itm_ord_no.eq(S0_T.itm_ord_no))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W)
								.where(
									value(0).eq(value(0))
									.and(S2_W.itm_ord_no.eq(S0_T.itm_ord_no))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_OPER_ORDER_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_OPER_ORDER_D01() {
		MST_OPER_ORDER_R S0_T = MST_OPER_ORDER_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_OPER_ORDER_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.itm_ord_no.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MST_OPER_ORDER_S01() {
		MST_OPER_ORDER_R S0_T1 = MST_OPER_ORDER_R.create("T1");
		MSW_ITM_ORDER_KEY_R S0_T2 = MSW_ITM_ORDER_KEY_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(S0_T1.oper_ord_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.oper_ptn.neq(value(MAC_STR.NULL_VAL.value())))
					)
					.forUpdate(S0_T1.oper_ord_no)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_OPER_ORDER_Query_U01
	 */
	static MCQueryPlan MSBCL5010_MST_OPER_ORDER_U01() {
		MST_OPER_ORDER_R S0_T = MST_OPER_ORDER_R.create("T");
		MSW_OPER_ORDER_R S1_W = MSW_OPER_ORDER_R.create("W");
		MSW_OPER_ORDER_R S2_W = MSW_OPER_ORDER_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_OPER_ORDER_Query_U01")
					.update(S0_T)
					.set(
						S0_T.inst_st_schd_tm,
						S0_T.act_st_tm,
						S0_T.inst_end_schd_tm,
						S0_T.act_end_tm,
						S0_T.act_oper_lt,
						S0_T.oper_ord_sts_typ
					).eq(subQuery()
						.select(
							S1_W.inst_st_schd_tm,
							S1_W.act_st_tm,
							S1_W.inst_end_schd_tm,
							S1_W.act_end_tm,
							S1_W.act_oper_lt,
							S1_W.oper_ord_sts_typ
						)
						.from(S1_W)
						.where(
							value(0).eq(value(0))
							.and(S1_W.oper_ord_no.eq(S0_T.oper_ord_no))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W)
								.where(
									value(0).eq(value(0))
									.and(S2_W.oper_ord_no.eq(S0_T.oper_ord_no))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_ORD_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_ORD_IO_SCHD_D01() {
		MST_ORD_IO_SCHD_R S0_T = MST_ORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ORD_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(MSC_IO_TYP$IS_GR(S0_T.io_typ).eq(value(true)))
						.and(MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(S0_T.io_schd_sub_typ1).eq(value(true)))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_ORD_IO_SCHD_Query_D02
	 */
	static MCQueryPlan MSBCL5010_MST_ORD_IO_SCHD_D02() {
		MST_ORD_IO_SCHD_R S0_T = MST_ORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ORD_IO_SCHD_Query_D02")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_ORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBCL5010_MST_ORD_IO_SCHD_I01() {
		MST_ORD_IO_SCHD_R S0 = MST_ORD_IO_SCHD_R.create();
		MST_SAVORD_IO_SCHD_R S1_T = MST_SAVORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ORD_IO_SCHD_Query_I01")
					.insert(S0)
					.columns(
						S0.slip_schd_no,
						S0.io_schd_typ,
						S0.io_typ,
						S0.io_schd_sts_typ,
						S0.io_schd_no,
						S0.io_schd_seq,
						S0.io_schd_sub_typ1,
						S0.io_schd_sub_no1,
						S0.io_schd_sub_seq1,
						S0.io_schd_sub_typ2,
						S0.io_schd_sub_no2,
						S0.io_schd_sub_seq2,
						S0.io_schd_sub_typ3,
						S0.io_schd_sub_no3,
						S0.io_schd_sub_seq3,
						S0.io_schd_sub_typ4,
						S0.io_schd_sub_no4,
						S0.io_schd_sub_seq4,
						S0.io_schd_pr_no,
						S0.schd_dt,
						S0.accpt_schd_dt,
						S0.avl_schd_dt,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.ver_no,
						S0.alt_grp_cd,
						S0.alt_grp_seq,
						S0.oper_inst_no,
						S0.oper_ord_no,
						S0.alt_qty,
						S0.alt_itm_typ,
						S0.alt_itm_ratio,
						S0.alt_alloc_prio,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.stk_arrv_bp_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno1_null_flg,
						S0.sno2,
						S0.sno2_null_flg,
						S0.sno3,
						S0.sno3_null_flg,
						S0.sno4,
						S0.sno4_null_flg,
						S0.ex_sno1,
						S0.ex_sno2,
						S0.ex_sno3,
						S0.ex_sno4,
						S0.pack_unit_cd,
						S0.pack_unit_qty,
						S0.base_unit_cd,
						S0.base_unit_qty,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.asst_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd,
						S0.alloc_tgt_flg,
						S0.alloc_scope_typ,
						S0.alloc_flg,
						S0.alloc_wait_flg,
						S0.wg_cd,
						S0.sppl_cd,
						S0.vld_dt_fr,
						S0.vld_dt_to,
						S0.inpt_ctl_typ,
						S0.gi_loc_cd,
						S0.gr_loc_cd,
						S0.org_wg_cd,
						S0.sim_mrp_no,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3
					)
					.query(
						subQuery()
						.select(
							S1_T.slip_schd_no,
							S1_T.io_schd_typ,
							S1_T.io_typ,
							value(MSC_IO_SCHD_STS_TYP.OPN.value()),
							S1_T.io_schd_no,
							S1_T.io_schd_seq,
							S1_T.io_schd_sub_typ1,
							S1_T.io_schd_sub_no1,
							S1_T.io_schd_sub_seq1,
							S1_T.io_schd_sub_typ2,
							S1_T.io_schd_sub_no2,
							S1_T.io_schd_sub_seq2,
							S1_T.io_schd_sub_typ3,
							S1_T.io_schd_sub_no3,
							S1_T.io_schd_sub_seq3,
							S1_T.io_schd_sub_typ4,
							S1_T.io_schd_sub_no4,
							S1_T.io_schd_sub_seq4,
							S1_T.io_schd_pr_no,
							S1_T.schd_dt,
							S1_T.accpt_schd_dt,
							S1_T.avl_schd_dt,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.ver_no,
							S1_T.alt_grp_cd,
							S1_T.alt_grp_seq,
							S1_T.oper_inst_no,
							S1_T.oper_ord_no,
							S1_T.alt_qty,
							S1_T.alt_itm_typ,
							S1_T.alt_itm_ratio,
							S1_T.alt_alloc_prio,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.stk_arrv_bp_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno1_null_flg,
							S1_T.sno2,
							S1_T.sno2_null_flg,
							S1_T.sno3,
							S1_T.sno3_null_flg,
							S1_T.sno4,
							S1_T.sno4_null_flg,
							S1_T.ex_sno1,
							S1_T.ex_sno2,
							S1_T.ex_sno3,
							S1_T.ex_sno4,
							S1_T.pack_unit_cd,
							S1_T.pack_unit_qty,
							S1_T.base_unit_cd,
							S1_T.base_unit_qty,
							S1_T.gd_cd,
							S1_T.in_xfr_typ,
							S1_T.quality_typ,
							S1_T.asst_typ,
							S1_T.stk_insp_typ,
							S1_T.stk_id_typ,
							S1_T.stk_bp_cd,
							S1_T.alloc_tgt_flg,
							S1_T.alloc_scope_typ,
							S1_T.alloc_flg,
							S1_T.alloc_wait_flg,
							S1_T.wg_cd,
							S1_T.sppl_cd,
							S1_T.vld_dt_fr,
							S1_T.vld_dt_to,
							S1_T.inpt_ctl_typ,
							S1_T.gi_loc_cd,
							S1_T.gr_loc_cd,
							S1_T.org_wg_cd,
							S1_T.sim_mrp_no,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(MSC_IO_TYP$IS_GR(S1_T.io_typ).eq(value(true)))
							.and(MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(S1_T.io_schd_sub_typ1).eq(value(true)))
							.and(S1_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_ORD_IO_SCHD_Query_U01
	 */
	static MCQueryPlan MSBCL5010_MST_ORD_IO_SCHD_U01() {
		MST_ORD_IO_SCHD_R S0_T = MST_ORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_ORD_IO_SCHD_Query_U01")
					.update(S0_T)
					.set(S0_T.io_schd_sts_typ).eq(decode(
							bind("a_itm_ord_sts_typ"),
							value(MSC_ITM_ORD_STS_TYP.OPN.value()),
							value(MSC_IO_SCHD_STS_TYP.OPN.value()),
							value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())
						)
					)
					.where(
						value(0).eq(value(0))
						.and(MSC_IO_TYP$IS_GI(S0_T.io_typ).eq(value(true)))
						.and(MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(S0_T.io_schd_sub_typ1).eq(value(true)))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_PRCD_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_PRCD_IO_SCHD_D01() {
		MST_PRCD_IO_SCHD_R S0_T = MST_PRCD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_PRCD_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_PRCD_OPER_ORDER_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_PRCD_OPER_ORDER_D01() {
		MST_PRCD_OPER_ORDER_R S0_T = MST_PRCD_OPER_ORDER_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_PRCD_OPER_ORDER_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.itm_ord_no.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_SAVORD_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_SAVORD_IO_SCHD_D01() {
		MST_SAVORD_IO_SCHD_R S0_T = MST_SAVORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_SAVORD_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(MSC_IO_TYP$IS_GR(S0_T.io_typ).eq(value(true)))
						.and(MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(S0_T.io_schd_sub_typ1).eq(value(true)))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_SAVORD_IO_SCHD_Query_D02
	 */
	static MCQueryPlan MSBCL5010_MST_SAVORD_IO_SCHD_D02() {
		MST_SAVORD_IO_SCHD_R S0_T = MST_SAVORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_SAVORD_IO_SCHD_Query_D02")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_SAVORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MSBCL5010_MST_SAVORD_IO_SCHD_I01() {
		MST_SAVORD_IO_SCHD_R S0 = MST_SAVORD_IO_SCHD_R.create();
		MST_ORD_IO_SCHD_R S1_T = MST_ORD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_SAVORD_IO_SCHD_Query_I01")
					.insert(S0)
					.columns(
						S0.slip_schd_no,
						S0.io_schd_typ,
						S0.io_typ,
						S0.io_schd_sts_typ,
						S0.io_schd_no,
						S0.io_schd_seq,
						S0.io_schd_sub_typ1,
						S0.io_schd_sub_no1,
						S0.io_schd_sub_seq1,
						S0.io_schd_sub_typ2,
						S0.io_schd_sub_no2,
						S0.io_schd_sub_seq2,
						S0.io_schd_sub_typ3,
						S0.io_schd_sub_no3,
						S0.io_schd_sub_seq3,
						S0.io_schd_sub_typ4,
						S0.io_schd_sub_no4,
						S0.io_schd_sub_seq4,
						S0.io_schd_pr_no,
						S0.schd_dt,
						S0.accpt_schd_dt,
						S0.avl_schd_dt,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.ver_no,
						S0.alt_grp_cd,
						S0.alt_grp_seq,
						S0.oper_inst_no,
						S0.oper_ord_no,
						S0.alt_qty,
						S0.alt_itm_typ,
						S0.alt_itm_ratio,
						S0.alt_alloc_prio,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.stk_arrv_bp_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno1_null_flg,
						S0.sno2,
						S0.sno2_null_flg,
						S0.sno3,
						S0.sno3_null_flg,
						S0.sno4,
						S0.sno4_null_flg,
						S0.ex_sno1,
						S0.ex_sno2,
						S0.ex_sno3,
						S0.ex_sno4,
						S0.pack_unit_cd,
						S0.pack_unit_qty,
						S0.base_unit_cd,
						S0.base_unit_qty,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.asst_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd,
						S0.alloc_tgt_flg,
						S0.alloc_scope_typ,
						S0.alloc_flg,
						S0.alloc_wait_flg,
						S0.wg_cd,
						S0.sppl_cd,
						S0.vld_dt_fr,
						S0.vld_dt_to,
						S0.inpt_ctl_typ,
						S0.gi_loc_cd,
						S0.gr_loc_cd,
						S0.org_wg_cd,
						S0.sim_mrp_no,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3
					)
					.query(
						subQuery()
						.select(
							S1_T.slip_schd_no,
							S1_T.io_schd_typ,
							S1_T.io_typ,
							value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()),
							S1_T.io_schd_no,
							S1_T.io_schd_seq,
							S1_T.io_schd_sub_typ1,
							S1_T.io_schd_sub_no1,
							S1_T.io_schd_sub_seq1,
							S1_T.io_schd_sub_typ2,
							S1_T.io_schd_sub_no2,
							S1_T.io_schd_sub_seq2,
							S1_T.io_schd_sub_typ3,
							S1_T.io_schd_sub_no3,
							S1_T.io_schd_sub_seq3,
							S1_T.io_schd_sub_typ4,
							S1_T.io_schd_sub_no4,
							S1_T.io_schd_sub_seq4,
							S1_T.io_schd_pr_no,
							S1_T.schd_dt,
							S1_T.accpt_schd_dt,
							S1_T.avl_schd_dt,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.ver_no,
							S1_T.alt_grp_cd,
							S1_T.alt_grp_seq,
							S1_T.oper_inst_no,
							S1_T.oper_ord_no,
							S1_T.alt_qty,
							S1_T.alt_itm_typ,
							S1_T.alt_itm_ratio,
							S1_T.alt_alloc_prio,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.stk_arrv_bp_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno1_null_flg,
							S1_T.sno2,
							S1_T.sno2_null_flg,
							S1_T.sno3,
							S1_T.sno3_null_flg,
							S1_T.sno4,
							S1_T.sno4_null_flg,
							S1_T.ex_sno1,
							S1_T.ex_sno2,
							S1_T.ex_sno3,
							S1_T.ex_sno4,
							S1_T.pack_unit_cd,
							S1_T.pack_unit_qty,
							S1_T.base_unit_cd,
							S1_T.base_unit_qty,
							S1_T.gd_cd,
							S1_T.in_xfr_typ,
							S1_T.quality_typ,
							S1_T.asst_typ,
							S1_T.stk_insp_typ,
							S1_T.stk_id_typ,
							S1_T.stk_bp_cd,
							S1_T.alloc_tgt_flg,
							S1_T.alloc_scope_typ,
							S1_T.alloc_flg,
							S1_T.alloc_wait_flg,
							S1_T.wg_cd,
							S1_T.sppl_cd,
							S1_T.vld_dt_fr,
							S1_T.vld_dt_to,
							S1_T.inpt_ctl_typ,
							S1_T.gi_loc_cd,
							S1_T.gr_loc_cd,
							S1_T.org_wg_cd,
							S1_T.sim_mrp_no,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.io_typ.eq(value(MSC_IO_TYP.GR.value())))
							.and(S1_T.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
							.and(S1_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MST_SIM_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBCL5010_MST_SIM_IO_SCHD_D01() {
		MST_SIM_IO_SCHD_R S0_T = MST_SIM_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MST_SIM_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value())))
						.and(S0_T.io_schd_sub_no1.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_BOM_EXP_RSLT_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MSW_BOM_EXP_RSLT_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_PROV_UPRI_R S0_M1 = MAM_PROV_UPRI_R.create("M1");
		MCTempView S1_T1 = createTempView("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_ALT_GRP_R S1_M5 = MAM_ALT_GRP_R.create("M5");
		MAM_UNIT_R S1_M6 = MAM_UNIT_R.create("M6");
		MSW_BOM_EXP_RSLT_R S2_T1 = MSW_BOM_EXP_RSLT_R.create("T1");
		MSW_BOM_EXP_R S2_T2 = MSW_BOM_EXP_R.create("T2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MCTempView S3_T1 = createTempView("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_BOM_EXP_RSLT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S2_T1.peg_no),
						S0_T1.pr("bom_id"),
						S0_T1.pr("itm_seq"),
						S0_T1.pr(S2_T1.itm_ord_no),
						S0_T1.pr(S2_T2.oper_ord_no),
						S0_T1.pr(S2_T1.itm_cd),
						S0_T1.pr(S2_T1.itm_sub1),
						S0_T1.pr(S2_T1.itm_sub2),
						S0_T1.pr(S2_T1.itm_sub3),
						S0_T1.pr(S1_M1.itm_nm),
						S0_T1.pr(S2_T1.ver_no),
						S0_T1.pr(S2_T1.rqmt_qty),
						S0_T1.pr(S2_T1.loss_rqmt_qty),
						S0_T1.pr(S2_T1.inpt_qty),
						S0_T1.pr(S2_T1.fxd_rqmt_qty),
						decode(
							S0_T1.pr(S2_T1.alt_grp_cd),
							nullValue(),
							value((MCNumber) null),
							S0_T1.pr(S2_T1.rqmt_qty)
						).as("alt_qty"),
						S0_T1.pr(S1_M1.unit_cd),
						S0_T1.pr(S1_M2.unit_nm),
						S0_T1.pr(S1_M1.dec_place),
						S0_T1.pr(S1_M1.rnd_typ).as("unit_conv_rnd_typ"),
						S0_T1.pr(S2_M3.loc_cd),
						S0_T1.pr(S2_M3.loc_nm),
						S0_T1.pr(S2_M3.str_ln_tgt_flg),
						S0_T1.pr(S2_M3.sppl_cd),
						S0_T1.pr("sppl_nm"),
						S0_T1.pr(S2_T1.alt_grp_cd),
						S0_T1.pr(S1_M5.alt_grp_nm),
						S0_T1.pr(S2_T1.alt_itm_flg),
						S0_T1.pr(S2_T1.alt_grp_seq),
						S0_T1.pr(S2_T1.alt_itm_typ),
						S0_T1.pr(S2_T1.alt_itm_ratio),
						S0_T1.pr(S2_T1.alt_alloc_prio),
						S0_T1.pr(S2_T2.mst_wg_cd),
						S0_T1.pr(S2_T2.oper_cd),
						S0_T1.pr(S2_T2.oper_seq),
						S0_T1.pr(S2_T1.sno1),
						S0_T1.pr(S2_T1.sno_typ1),
						S0_T1.pr(S2_T1.sno2),
						S0_T1.pr(S2_T1.sno_typ2),
						S0_T1.pr(S2_T1.sno3),
						S0_T1.pr(S2_T1.sno_typ3),
						S0_T1.pr(S2_T1.sno4),
						S0_T1.pr(S2_T1.sno_typ4),
						S0_T1.pr(S2_T1.par_inst_qty),
						S0_T1.pr(S2_T1.chd_inpt_qty),
						S0_T1.pr(S2_T1.chd_rqmt_qty),
						S0_T1.pr(S2_T1.fxd_chd_rqmt_qty),
						S0_T1.pr(S2_T1.chd_rqmt_ratio),
						S0_T1.pr(S2_T1.chd_inpt_ratio),
						S0_T1.pr("schd_in_dt"),
						S0_T1.pr(S2_T1.byprod_flg),
						S0_T1.pr(S2_T1.in_offst_typ),
						S0_T1.pr(S2_T1.in_offst),
						S0_T1.pr(S2_T1.inpt_ctl_typ),
						S0_T1.pr(S2_T1.bkf_typ),
						S0_T1.pr(S2_T1.inst_lot_fix_flg),
						S0_T1.pr(S2_T1.lot_mix_flg),
						S0_T1.pr(S2_T1.sublot_mix_flg),
						S0_T1.pr(S2_T1.alloc_ctl_typ),
						S0_T1.pr(S2_T1.main_itm_flg),
						S0_T1.pr(S2_T1.memo1),
						S0_T1.pr(S2_T1.memo2),
						S0_T1.pr(S2_T1.memo3),
						S0_T1.pr(S2_T1.disp_seq),
						S0_T1.pr(S1_M1.cont_fctr_flg),
						S0_T1.pr(S1_M1.cont_fctr_unit_cd),
						S0_T1.pr("cont_fctr_unit_nm"),
						S0_T1.pr(S1_M1.std_cont_fctr),
						S0_T1.pr(S1_M1.cont_fctr_dec_place),
						S0_T1.pr(S1_M1.cont_fctr_rnd_typ),
						S0_T1.pr(S1_M1.sundry_itm_flg),
						S0_T1.pr(S1_M1.sno1_mng_typ),
						S0_T1.pr(S1_M1.sno2_mng_typ),
						S0_T1.pr(S1_M1.sno3_mng_typ),
						S0_T1.pr(S1_M1.sno4_mng_typ),
						S0_T1.pr(S1_M1.lot_mng_typ),
						S0_T1.pr(S1_M1.lot_no_typ),
						S0_T1.pr(S1_M1.lot_no_ptn_cd),
						S0_T1.pr(S1_M1.sublot_mng_typ),
						S0_T1.pr(S1_M1.sublot_no_typ),
						S0_T1.pr(S1_M1.sublot_no_ptn_cd),
						S0_T1.pr(S1_M1.ver_flg),
						S0_M1.prov_typ,
						S0_M1.upri.as("prov_upri"),
						S0_M1.cur_cd.as("prov_cur_cd"),
						S0_T1.pr(S1_M1.stk_mng_typ),
						S0_T1.pr(S2_T1.yield_calc_flg),
						S0_T1.pr(S1_M1.th_image),
						S0_T1.pr("oper_loc_wg_cd"),
						S0_T1.pr("oper_loc_sppl_cd")
					)
					.from(
						subQuery()
						.select(
							S1_T1.pr(S2_T1.peg_no),
							nullValue().as("bom_id"),
							nullValue().as("itm_seq"),
							S1_T1.pr(S2_T1.itm_ord_no),
							S1_T1.pr(S2_T2.oper_ord_no),
							S1_T1.pr(S2_T1.itm_cd),
							S1_T1.pr(S2_T1.itm_sub1),
							S1_T1.pr(S2_T1.itm_sub2),
							S1_T1.pr(S2_T1.itm_sub3),
							S1_M1.itm_nm,
							S1_T1.pr(S2_T1.ver_no),
							S1_T1.pr(S2_T1.rqmt_qty),
							S1_T1.pr(S2_T1.loss_rqmt_qty),
							S1_T1.pr(S2_T1.inpt_qty),
							S1_T1.pr(S2_T1.fxd_rqmt_qty),
							S1_M1.unit_cd,
							S1_M2.unit_nm,
							S1_M1.dec_place,
							S1_M1.rnd_typ,
							S1_T1.pr(S2_M3.loc_cd),
							S1_T1.pr(S2_M3.loc_nm),
							S1_T1.pr(S2_M3.str_ln_tgt_flg),
							S1_T1.pr(S2_M3.wg_cd),
							S1_T1.pr(S2_M3.sppl_cd),
							S1_M4.bp_nm.as("sppl_nm"),
							S1_T1.pr(S2_T1.alt_grp_cd),
							S1_M5.alt_grp_nm,
							S1_T1.pr(S2_T1.alt_itm_flg),
							S1_T1.pr(S2_T1.alt_grp_seq),
							S1_T1.pr(S2_T1.alt_itm_typ),
							S1_T1.pr(S2_T1.alt_itm_ratio),
							S1_T1.pr(S2_T1.alt_alloc_prio),
							S1_T1.pr(S2_T2.mst_wg_cd),
							S1_T1.pr(S2_T2.oper_cd),
							S1_T1.pr(S2_T2.oper_seq),
							S1_T1.pr(S2_T1.sno1),
							S1_T1.pr(S2_T1.sno_typ1),
							S1_T1.pr(S2_T1.sno2),
							S1_T1.pr(S2_T1.sno_typ2),
							S1_T1.pr(S2_T1.sno3),
							S1_T1.pr(S2_T1.sno_typ3),
							S1_T1.pr(S2_T1.sno4),
							S1_T1.pr(S2_T1.sno_typ4),
							S1_T1.pr(S2_T1.par_inst_qty),
							S1_T1.pr(S2_T1.chd_inpt_qty),
							S1_T1.pr(S2_T1.chd_rqmt_qty),
							S1_T1.pr(S2_T1.fxd_chd_rqmt_qty),
							S1_T1.pr(S2_T1.chd_rqmt_ratio),
							S1_T1.pr(S2_T1.chd_inpt_ratio),
							S1_T1.pr("schd_in_dt"),
							S1_T1.pr(S2_T1.byprod_flg),
							S1_T1.pr(S2_T1.in_offst_typ),
							S1_T1.pr(S2_T1.in_offst),
							S1_T1.pr(S2_T1.inpt_ctl_typ),
							S1_T1.pr(S2_T1.bkf_typ),
							S1_T1.pr(S2_T1.inst_lot_fix_flg),
							S1_T1.pr(S2_T1.lot_mix_flg),
							S1_T1.pr(S2_T1.sublot_mix_flg),
							S1_T1.pr(S2_T1.alloc_ctl_typ),
							S1_T1.pr(S2_T1.main_itm_flg),
							S1_T1.pr(S2_T1.yield_calc_flg),
							S1_T1.pr(S2_T1.memo1),
							S1_T1.pr(S2_T1.memo2),
							S1_T1.pr(S2_T1.memo3),
							S1_T1.pr(S2_T1.disp_seq),
							S1_M1.cont_fctr_unit_cd,
							S1_M6.unit_nm.as("cont_fctr_unit_nm"),
							S1_M1.std_cont_fctr,
							S1_M1.cont_fctr_flg,
							S1_M1.cont_fctr_rnd_typ,
							S1_M1.cont_fctr_dec_place,
							S1_M1.sundry_itm_flg,
							S1_M1.sno1_mng_typ,
							S1_M1.sno2_mng_typ,
							S1_M1.sno3_mng_typ,
							S1_M1.sno4_mng_typ,
							S1_M1.lot_mng_typ,
							S1_M1.lot_no_typ,
							S1_M1.lot_no_ptn_cd,
							S1_M1.sublot_mng_typ,
							S1_M1.sublot_no_typ,
							S1_M1.sublot_no_ptn_cd,
							S1_M1.ver_flg,
							S1_M1.stk_mng_typ,
							S1_M1.th_image,
							nvl(
								S1_T1.pr(S2_T2.cur_cd),
								S1_M4.cur_cd
							).as("cur_cd"),
							S1_T1.pr("oper_loc_cd"),
							S1_T1.pr("oper_loc_wg_cd"),
							S1_T1.pr("oper_loc_sppl_cd")
						)
						.from(
							subQuery()
							.select(
								S3_T1.pr(S2_T1.peg_no),
								S3_T1.pr(S2_T1.itm_ord_no),
								S3_T1.pr(S2_T2.oper_ord_no),
								S3_T1.pr(S2_T2.mst_wg_cd),
								S3_T1.pr(S2_T2.oper_cd),
								S3_T1.pr(S2_T2.oper_seq),
								S3_T1.pr(S2_T1.itm_cd),
								S3_T1.pr(S2_T1.itm_sub1),
								S3_T1.pr(S2_T1.itm_sub2),
								S3_T1.pr(S2_T1.itm_sub3),
								S3_T1.pr(S2_T1.ver_no),
								S3_T1.pr(S2_T1.rqmt_qty),
								S3_T1.pr(S2_T1.loss_rqmt_qty),
								S3_T1.pr(S2_T1.inpt_qty),
								S3_T1.pr(S2_T1.fxd_rqmt_qty),
								S2_M3.loc_cd,
								S2_M3.loc_nm,
								S2_M3.str_ln_tgt_flg,
								S2_M3.wg_cd,
								S2_M3.sppl_cd,
								S3_T1.pr(S2_T1.alt_itm_flg),
								S3_T1.pr(S2_T1.alt_grp_cd),
								S3_T1.pr(S2_T1.alt_grp_seq),
								S3_T1.pr(S2_T1.alt_itm_typ),
								S3_T1.pr(S2_T1.alt_itm_ratio),
								S3_T1.pr(S2_T1.alt_alloc_prio),
								S3_T1.pr(S2_T1.sno1),
								S3_T1.pr(S2_T1.sno_typ1),
								S3_T1.pr(S2_T1.sno2),
								S3_T1.pr(S2_T1.sno_typ2),
								S3_T1.pr(S2_T1.sno3),
								S3_T1.pr(S2_T1.sno_typ3),
								S3_T1.pr(S2_T1.sno4),
								S3_T1.pr(S2_T1.sno_typ4),
								S3_T1.pr(S2_T1.par_inst_qty),
								S3_T1.pr(S2_T1.chd_inpt_qty),
								S3_T1.pr(S2_T1.chd_rqmt_qty),
								S3_T1.pr(S2_T1.fxd_chd_rqmt_qty),
								S3_T1.pr(S2_T1.chd_rqmt_ratio),
								S3_T1.pr(S2_T1.chd_inpt_ratio),
								decode(
									S3_T1.pr(S2_T1.in_offst_typ),
									value(MAC_OFFST_TYP.BY_ST.value()),
									MAPA_DT$F_CAL_DATE_LOC(
										S3_T1.pr(S2_T2.st_schd_dt),
										value(0).subtract(S3_T1.pr(S2_T1.in_offst)),
										value(false),
										S2_M3.loc_cd,
										value(false)
									),
									MAPA_DT$F_CAL_DATE_LOC(
										S3_T1.pr(S2_T2.end_schd_dt),
										value(0).subtract(S3_T1.pr(S2_T1.in_offst)),
										value(false),
										S2_M3.loc_cd,
										value(false)
									)
								).as("schd_in_dt"),
								S3_T1.pr(S2_T1.in_offst_typ),
								S3_T1.pr(S2_T1.in_offst),
								S3_T1.pr(S2_T1.byprod_flg),
								S3_T1.pr(S2_T1.bkf_typ),
								S3_T1.pr(S2_T1.inst_lot_fix_flg),
								S3_T1.pr(S2_T1.lot_mix_flg),
								S3_T1.pr(S2_T1.sublot_mix_flg),
								S3_T1.pr(S2_T1.alloc_ctl_typ),
								S3_T1.pr(S2_T1.main_itm_flg),
								S3_T1.pr(S2_T1.yield_calc_flg),
								S3_T1.pr(S2_T1.inpt_ctl_typ),
								S3_T1.pr(S2_T1.disp_seq),
								S3_T1.pr(S2_T1.memo1),
								S3_T1.pr(S2_T1.memo2),
								S3_T1.pr(S2_T1.memo3),
								S3_T1.pr(S2_T2.cur_cd),
								S2_LOC.loc_cd.as("oper_loc_cd"),
								S2_LOC.wg_cd.as("oper_loc_wg_cd"),
								S2_LOC.sppl_cd.as("oper_loc_sppl_cd")
							)
							.from(
								subQuery()
								.select(
									S2_T1.peg_no,
									S2_T1.itm_ord_no,
									S2_T2.oper_ord_no,
									S2_T2.mst_wg_cd,
									S2_T2.oper_cd,
									S2_T2.oper_seq,
									S2_T1.itm_cd,
									S2_T1.itm_sub1,
									S2_T1.itm_sub2,
									S2_T1.itm_sub3,
									S2_T1.ver_no,
									S2_T1.rqmt_qty,
									S2_T1.loss_rqmt_qty,
									S2_T1.inpt_qty,
									S2_T1.fxd_rqmt_qty,
									S2_T1.alt_itm_flg,
									S2_T1.alt_grp_cd,
									S2_T1.alt_grp_seq,
									S2_T1.alt_itm_typ,
									S2_T1.alt_itm_ratio,
									S2_T1.alt_alloc_prio,
									S2_T1.sno1,
									S2_T1.sno_typ1,
									S2_T1.sno2,
									S2_T1.sno_typ2,
									S2_T1.sno3,
									S2_T1.sno_typ3,
									S2_T1.sno4,
									S2_T1.sno_typ4,
									S2_T1.par_inst_qty,
									S2_T1.chd_inpt_qty,
									S2_T1.chd_rqmt_qty,
									S2_T1.fxd_chd_rqmt_qty,
									S2_T1.chd_rqmt_ratio,
									S2_T1.chd_inpt_ratio,
									S2_T1.in_offst_typ,
									S2_T1.in_offst,
									S2_T1.byprod_flg,
									S2_T1.bkf_typ,
									S2_T1.inst_lot_fix_flg,
									S2_T1.lot_mix_flg,
									S2_T1.sublot_mix_flg,
									S2_T1.alloc_ctl_typ,
									S2_T1.main_itm_flg,
									S2_T1.yield_calc_flg,
									S2_T1.inpt_ctl_typ,
									S2_T1.disp_seq,
									S2_T1.memo1,
									S2_T1.memo2,
									S2_T1.memo3,
									S2_T2.st_schd_dt,
									S2_T2.end_schd_dt,
									S2_T2.cur_cd,
									MAPA_LOC$F_GET_IN_LOC(
										S2_T1.itm_cd,
										S2_T1.itm_sub1,
										S2_T1.itm_sub2,
										S2_T1.itm_sub3,
										S2_T2.oper_loc_cd
									).as("loc_cd"),
									S2_T2.oper_loc_cd
								)
								.from(S2_T1
									.innerJoin(S2_T2).on(
										bracket(
											S2_T1.peg_no.eq(S2_T2.peg_no)
										)
									)
								).view(S3_T1)
								.innerJoin(S2_M3).on(
									bracket(
										S3_T1.pr("loc_cd").eq(S2_M3.loc_cd)
									)
								)
								.innerJoin(S2_LOC).on(
									bracket(
										S3_T1.pr("oper_loc_cd").eq(S2_LOC.loc_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
							).view(S1_T1)
							.leftOuterJoin(S1_M1).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.pr(S2_T1.itm_cd).eq(S1_M1.itm_cd))
									.and(S1_T1.pr(S2_T1.itm_sub1).eq(S1_M1.itm_sub1))
									.and(S1_T1.pr(S2_T1.itm_sub2).eq(S1_M1.itm_sub2))
									.and(S1_T1.pr(S2_T1.itm_sub3).eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									bind("inst_exp_flg").eq(value(true))
									.and(S1_M1.unit_cd.eq(S1_M2.unit_cd))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.pr(S2_M3.sppl_cd).eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									bind("inst_exp_flg").eq(value(true))
									.and(S1_T1.pr(S2_T1.alt_grp_cd).eq(S1_M5.alt_grp_cd))
									.and(S1_T1.pr(S2_M3.wg_cd).eq(S1_M5.wg_cd))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									bind("inst_exp_flg").eq(value(true))
									.and(S1_M1.cont_fctr_unit_cd.eq(S1_M6.unit_cd))
								)
							)
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T1)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S2_T1.itm_cd).eq(S0_M1.itm_cd))
								.and(S0_T1.pr(S2_T1.itm_sub1).eq(S0_M1.itm_sub1))
								.and(S0_T1.pr(S2_T1.itm_sub2).eq(S0_M1.itm_sub2))
								.and(S0_T1.pr(S2_T1.itm_sub3).eq(S0_M1.itm_sub3))
								.and(S0_T1.pr("oper_loc_sppl_cd").eq(S0_M1.prsppl_cd))
								.and(S0_T1.pr("cur_cd").eq(S0_M1.cur_cd))
								.and(S0_T1.pr("oper_loc_wg_cd").eq(S0_M1.wg_cd))
								.and(S0_T1.pr("schd_in_dt").gte(S0_M1.st_dt))
								.and(S0_T1.pr("schd_in_dt").lte(S0_M1.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_BOM_EXP_Query_U01
	 */
	static MCQueryPlan MSBCL5010_MSW_BOM_EXP_U01() {
		MSW_BOM_EXP_R S0_T1 = MSW_BOM_EXP_R.create("T1");
		MAM_LOC_R S1_M1 = MAM_LOC_R.create("M1");
		MAM_LOC_R S2_M1 = MAM_LOC_R.create("M1");
		MAM_BOM_R S2_M2 = MAM_BOM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_BOM_EXP_Query_U01")
					.update(S0_T1)
					.set(S0_T1.mst_wg_cd).eq(subQuery()
						.select(S1_M1.wg_cd)
						.from(S1_M1)
						.where(
							value(0).eq(value(0))
							.and(S0_T1.oper_loc_cd.eq(S1_M1.loc_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S2_M1
									.innerJoin(S2_M2).on(
										S2_M2.wg_cd.eq(S2_M1.wg_cd)
										.and(S0_T1.itm_cd.eq(S2_M2.par_itm_cd))
										.and(S0_T1.itm_sub1.eq(S2_M2.par_itm_sub1))
										.and(S0_T1.itm_sub2.eq(S2_M2.par_itm_sub2))
										.and(S0_T1.itm_sub3.eq(S2_M2.par_itm_sub3))
										.and(S0_T1.bom_ptn.eq(S2_M2.bom_ptn))
										.and(S2_M2.del_flg.eq(value(false)))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.oper_loc_cd.eq(S2_M1.loc_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S01() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_MFG_INST_R S0_T4 = MST_MFG_INST_R.create("T4");
		MST_MFG_ACT_R S0_T5 = MST_MFG_ACT_R.create("T5");
		MST_YIELD_ACT_R S0_T7 = MST_YIELD_ACT_R.create("T7");
		MST_INSP_SCHD_R S0_T8 = MST_INSP_SCHD_R.create("T8");
		MST_INSP_INST_R S0_T9 = MST_INSP_INST_R.create("T9");
		MST_INSP_ACT_R S0_T10 = MST_INSP_ACT_R.create("T10");
		MST_YIELD_SCHD_R S0_T11 = MST_YIELD_SCHD_R.create("T11");
		MST_OPER_ORDER_R S0_T12= MST_OPER_ORDER_R.create("T12");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						S0_T2.oper_ptn,
						nvl(
							S0_T9.insp_sts_typ,
							S0_T8.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T9.col_schd_flg.as("insp_blk_flg"),
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_st_schd_dt"),
						trunc(
							S0_T5.st_act_tm,
							MCDateFmt.DD
						).as("mfg_st_act_dt"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_end_schd_dt"),
						trunc(
							S0_T5.end_act_tm,
							MCDateFmt.DD
						).as("mfg_end_act_dt"),
						cases()
							.when(
								S0_T8.insp_lt.isNotNull()
								.and(S0_T3.strg_loc_cd.isNotNull())
							)
								.then(
									MAPA_DT$F_CAL_DATE_LOC(
										trunc(
											S0_T11.schd_tm,
											MCDateFmt.DD
										),
										value(0).subtract(
											nvl(
												S0_T8.insp_offst,
												value(0)
											)
										),
										value(true),
										S0_T3.strg_loc_cd,
										value(false)
									)
							)
							.otherwise(nullValue()).as("inst_insp_st_schd_dt"),
						trunc(
							S0_T10.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						cases()
							.when(
								S0_T8.insp_lt.isNotNull()
								.and(S0_T3.strg_loc_cd.isNotNull())
							)
								.then(
									MAPA_DT$F_CAL_DATE_LOC(
										MAPA_DT$F_CAL_DATE_LOC(
											trunc(
												S0_T11.schd_tm,
												MCDateFmt.DD
											),
											value(0).subtract(
												nvl(
													S0_T8.insp_offst,
													value(0)
												)
											),
											value(true),
											S0_T3.strg_loc_cd,
											value(false)
										),
										S0_T8.insp_lt,
										value(true),
										S0_T3.strg_loc_cd,
										value(false)
									)
							)
							.otherwise(nullValue()).as("inst_insp_end_schd_dt"),
						trunc(
							S0_T10.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						nvl(
							S0_T3.base_unit_yield_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T7.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						nvl(
							S0_T10.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T4.mfg_inst_unit_typ,
						S0_T3.itm_mfg_inst_no,
						S0_T7.yield_act_no,
						S0_T10.insp_act_no,
						// this field is appended by sql coverter.
						S0_T4.mfg_inst_no.as("join_mfg_inst_no_"),
						// this field is appended by sql coverter.
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_"),
						S0_T12.oper_ord_no,
						S0_T12.oper_ord_sts_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.itm_mfg_inst_no.eq(S0_T4.itm_mfg_inst_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T5.mfg_act_no.eq(S0_T7.mfg_act_no)
								.and(S0_T7.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T4.mfg_inst_no.eq(S0_T8.src_no1))
								.and(S0_T8.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
								.and(S0_T8.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.insp_no.eq(S0_T9.insp_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T9.insp_no.eq(S0_T10.insp_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T11.mfg_inst_no)
								.and(S0_T11.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
								.and(S0_T11.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T12).on(
								bracket(
										S0_T2.itm_ord_no.eq(S0_T12.itm_ord_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S02
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S02() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_SCHD_R S0_T7 = MST_ARR_SCHD_R.create("T7");
		MST_ARR_ACT_R S0_T8 = MST_ARR_ACT_R.create("T8");
		MCTempView S0_T11 = createTempView("T11");
		MST_INSP_SCHD_R S0_T12 = MST_INSP_SCHD_R.create("T12");
		MST_INSP_INST_R S0_T13 = MST_INSP_INST_R.create("T13");
		MST_INSP_ACT_R S0_T14 = MST_INSP_ACT_R.create("T14");
		MST_PURC_ACT_R S1_T10T = MST_PURC_ACT_R.create("T10T");
		MST_PURC_ACT_D_R S1_T11T = MST_PURC_ACT_D_R.create("T11T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S02")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(S0_T3.abort_flg.eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						cases()
						.when(
							S0_T6.purc_cmpl_flg.eq(value(true))
							.and(S0_T6.arr_cmpl_flg.eq(value(true)))
						)
						.then(value(true))
						.otherwise(
							nvl2(
								S0_T5.po_d_no,
								value(false),
								S0_T3.abort_flg
							)
						).as("po_schd_abort_flg"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T7.pr_sts_typ.as("arr_sts_typ"),
						S0_T6.purc_cmpl_flg,
						S0_T6.arr_cmpl_flg,
						nvl(
							S0_T13.insp_sts_typ,
							S0_T12.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T13.col_schd_flg.as("insp_blk_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T8.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						nvl(
							S0_T11.pr(S1_T11T.base_unit_qty),
							value(0)
						).as("purc_act_qty"),
						nvl(
							S0_T14.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T4.po_dt,
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						trunc(
							S0_T8.arr_tm,
							MCDateFmt.DD
						).as("strg_act_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T11.pr(S1_T10T.purc_dt).as("accpt_act_dt"),
						trunc(
							S0_T14.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						trunc(
							S0_T14.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						S0_T5.po_d_no,
						S0_T8.arr_act_no,
						S0_T11.pr(S1_T11T.purc_act_d_no),
						S0_T14.insp_act_no,
						S0_T3.po_schd_no,
						S0_T6.arr_schd_tm,
						S0_T7.arr_loc_cd,
						S0_T12.insp_lt,
						nvl(
								S0_T12.insp_offst,
								value(0)
							).as("insp_offst"),
						// this field is appended by sql coverter.
						S0_T2.sppl_cd.as("join_sppl_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.arr_pr_no.eq(S0_T7.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.arr_schd_no.eq(S0_T8.arr_schd_no)
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(
								subQuery()
								.select(
									S1_T11T.purc_act_d_no,
									S1_T11T.base_unit_qty,
									S1_T11T.po_d_no,
									S1_T10T.purc_dt
								)
								.from(
									S1_T11T
									.innerJoin(S1_T10T).on(
										bracket(
											S1_T10T.purc_act_no.eq(S1_T11T.purc_act_no)
											.and(S1_T10T.purc_act_seq.eq(S1_T11T.purc_act_seq))
											.and(S1_T10T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								).view(S0_T11)
							).on(
								bracket(
									S0_T5.po_d_no.eq(S0_T11.pr(S1_T11T.po_d_no))
								)
							)
						
						.leftOuterJoin(S0_T12).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T5.po_d_no.eq(S0_T12.src_no1))
								.and(S0_T12.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
								.and(S0_T12.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T12.insp_no.eq(S0_T13.insp_no)
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T13.insp_no.eq(S0_T14.insp_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S03
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S03() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_SCHD_R S0_T7 = MST_ARR_SCHD_R.create("T7");
		MST_ARR_ACT_R S0_T8 = MST_ARR_ACT_R.create("T8");
		MST_PURC_ACT_R S0_T10 = MST_PURC_ACT_R.create("T10");
		MST_PURC_ACT_D_R S0_T11 = MST_PURC_ACT_D_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MST_MFG_INST_R S0_T13 = MST_MFG_INST_R.create("T13");
		MST_MFG_ACT_R S0_T14 = MST_MFG_ACT_R.create("T14");
		MST_YIELD_ACT_R S0_T16 = MST_YIELD_ACT_R.create("T16");
		MST_INSP_SCHD_R S0_T17 = MST_INSP_SCHD_R.create("T17");
		MST_INSP_INST_R S0_T18 = MST_INSP_INST_R.create("T18");
		MST_INSP_ACT_R S0_T19 = MST_INSP_ACT_R.create("T19");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S03")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T7.arr_pr_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(S0_T3.abort_flg.eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						cases()
						.when(
							S0_T6.purc_cmpl_flg.eq(value(true))
							.and(S0_T6.arr_cmpl_flg.eq(value(true)))
						)
						.then(value(true))
						.otherwise(
							nvl2(
								S0_T5.po_d_no,
								value(false),
								S0_T3.abort_flg
							)
						).as("po_schd_abort_flg"),
						S0_T7.pr_sts_typ.as("arr_sts_typ"),
						S0_T6.purc_cmpl_flg,
						S0_T6.arr_cmpl_flg,
						nvl(
							S0_T18.insp_sts_typ,
							S0_T17.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T18.col_schd_flg.as("insp_blk_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T8.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						nvl(
							S0_T11.base_unit_qty,
							value(0)
						).as("purc_act_qty"),
						nvl(
							S0_T19.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T4.po_dt.as("po_dt"),
						trunc(
							S0_T13.st_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_st_schd_dt"),
						trunc(
							S0_T14.st_act_tm,
							MCDateFmt.DD
						).as("mfg_st_act_dt"),
						trunc(
							S0_T13.end_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_end_schd_dt"),
						trunc(
							S0_T14.end_act_tm,
							MCDateFmt.DD
						).as("mfg_end_act_dt"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						trunc(
							S0_T8.arr_tm,
							MCDateFmt.DD
						).as("strg_act_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T10.purc_dt.as("accpt_act_dt"),
						trunc(
							S0_T19.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						trunc(
							S0_T19.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						S0_T5.po_d_no,
						S0_T8.arr_act_no,
						S0_T11.purc_act_d_no,
						S0_T19.insp_act_no,
						S0_T3.po_schd_no,
						S0_T6.arr_schd_tm,
						S0_T7.arr_loc_cd,
						S0_T17.insp_lt,
						nvl(
								S0_T17.insp_offst,
								value(0)
							).as("insp_offst"),
						// this field is appended by sql coverter.
						S0_T13.mfg_inst_no.as("join_mfg_inst_no_"),
						// this field is appended by sql coverter.
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.arr_pr_no.eq(S0_T7.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.arr_schd_no.eq(S0_T8.arr_schd_no)
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T4.po_no.eq(S0_T10.po_no)
								.and(S0_T10.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T11.po_d_no)
								.and(S0_T10.purc_act_no.eq(S0_T11.purc_act_no))
								.and(S0_T10.purc_act_seq.eq(S0_T11.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								nvl(
									S0_T5.outsrc_itm_ord_no,
									S0_T3.outsrc_itm_ord_no
								).eq(S0_T12.itm_ord_no)
								.and(S0_T12.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T12.itm_mfg_inst_no.eq(S0_T13.itm_mfg_inst_no)
								.and(S0_T13.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T13.itm_mfg_inst_no.eq(S0_T14.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								S0_T14.mfg_act_no.eq(S0_T16.mfg_act_no)
								.and(S0_T16.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
							)
						)
						.leftOuterJoin(S0_T17).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T5.po_d_no.eq(S0_T17.src_no1))
								.and(S0_T17.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
								.and(S0_T17.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T18).on(
							bracket(
								S0_T17.insp_no.eq(S0_T18.insp_no)
							)
						)
						.leftOuterJoin(S0_T19).on(
							bracket(
								S0_T18.insp_no.eq(S0_T19.insp_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S04
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S04() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_XFR_SCHD_R S0_T3 = MST_XFR_SCHD_R.create("T3");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MST_SHIP_SCHD_R S0_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_INST_D_R S0_T6 = MST_SHIP_INST_D_R.create("T6");
		MST_SHIP_INST_R S0_T7 = MST_SHIP_INST_R.create("T7");
		MST_SHIP_ALLOC_STS_R S0_T8 = MST_SHIP_ALLOC_STS_R.create("T8");
		MST_IO_SCHD_R S0_T16 = MST_IO_SCHD_R.create("T16");
		MST_SHIP_ACT_D_R S0_T9 = MST_SHIP_ACT_D_R.create("T9");
		MST_SHIP_ACT_R S0_T10 = MST_SHIP_ACT_R.create("T10");
		MST_DLV_SLIP_D_R S0_T11 = MST_DLV_SLIP_D_R.create("T11");
		MST_ARR_PR_R S0_T13 = MST_ARR_PR_R.create("T13");
		MST_ARR_SCHD_R S0_T14 = MST_ARR_SCHD_R.create("T14");
		MST_ARR_ACT_R S0_T15 = MST_ARR_ACT_R.create("T15");
		MST_DLV_SLIP_R S1_T11W = MST_DLV_SLIP_R.create("T11W");
		MSW_ITM_ORDER_KEY_R S1_T1 = MSW_ITM_ORDER_KEY_R.create("T17");
		MST_ITM_ORDER_R S1_T2 = MST_ITM_ORDER_R.create("T2");
		MST_XFR_SCHD_R S1_T3 = MST_XFR_SCHD_R.create("T3");
		MST_SHIP_PR_R S1_T4 = MST_SHIP_PR_R.create("T4");
		MST_SHIP_SCHD_R S1_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_ALLOC_STS_R S1_T6 = MST_SHIP_ALLOC_STS_R.create("T6");
		MST_SHIP_ACT_D_R S1_T7 = MST_SHIP_ACT_D_R.create("T7");
		MST_DLV_SLIP_D_R S1_T8 = MST_DLV_SLIP_D_R.create("T8");
		MST_ARR_PR_R S1_T9 = MST_ARR_PR_R.create("T9");
		MST_DLV_SLIP_R S2_T8W = MST_DLV_SLIP_R.create("T8W");
		MSW_ITM_ORDER_KEY_R S1_T10 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S1_T11 = MST_ITM_ORDER_R.create("T2");
		MST_XFR_SCHD_R S1_T12 = MST_XFR_SCHD_R.create("T3");
		MST_SHIP_PR_R S1_T13 = MST_SHIP_PR_R.create("T4");
		MST_SHIP_SCHD_R S1_T14 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_ALLOC_STS_R S1_T15 = MST_SHIP_ALLOC_STS_R.create("T6");
		MST_SHIP_ACT_D_R S1_T16 = MST_SHIP_ACT_D_R.create("T7");
		MST_DLV_SLIP_D_R S1_T17 = MST_DLV_SLIP_D_R.create("T8");
		MST_ARR_PR_R S2_T18 = MST_ARR_PR_R.create("T9");
		MST_DLV_SLIP_R S2_T17W = MST_DLV_SLIP_R.create("T8W");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S04")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T13.arr_pr_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T4.ship_inst_qty,
							value(0)
						).as("wk_inst_qty"),
						nvl(
							S0_T4.base_unit_qty,
							value(0)
						).subtract(nvl(
								S0_T4.ship_inst_qty,
								value(0)
							)).subtract(
								nvl(
									S0_T4.ship_schd_abort_qty,
									value(0)
								)
							).as("wk_not_inst_qty"),
						S0_T5.inst_bndl_flg.as("blk_flg"),
						S0_T5.pr_sts_typ.as("ship_sts_typ"),
						S0_T14.pr_sts_typ.as("arr_sts_typ"),
						S0_T4.ship_cmpl_flg,
						nvl2(
							S0_T6.ship_inst_d_no,
							value(false),
							nvl2(
								S0_T9.ship_act_d_no,
								value(false),
								S0_T5.abort_flg
							)
						).as("ship_schd_abort_flg"),
						cases()
							.when(S0_T5.ship_inst_d_no.isNotNull())
								.then(
									cases()
										.when(
											bracket(
												S0_T4.ship_cmpl_flg.eq(value(true))
												.and(S0_T5.ship_act_qty.eq(value(0)))
											)
											.or(
												S0_T4.ship_cmpl_flg.eq(value(true))
												.and(S0_T5.ship_act_qty.neq(value(0)))
												.and(S0_T6.abort_flg.eq(value(true)))
												.and(
													S0_T5.ship_act_qty.lte(subQuery()
														.select(sum(S1_T9.arr_qty))
														.from(
															S1_T1
															.innerJoin(S1_T2).on(
																bracket(
																	S1_T1.itm_ord_no.eq(S1_T2.itm_ord_no)
																)
															)
															.innerJoin(S1_T3).on(
																bracket(
																	S1_T2.itm_ord_no.eq(S1_T3.itm_ord_no)
																)
															)
															.innerJoin(S1_T4).on(
																bracket(
																	S1_T3.xfr_schd_no.eq(S1_T4.xfr_schd_no)
																)
															)
															.innerJoin(S1_T5).on(
																bracket(
																	S1_T4.ship_pr_no.eq(S1_T5.ship_pr_no)
																)
															)
															.innerJoin(S1_T6).on(
																bracket(
																	S1_T5.ship_schd_no.eq(S1_T6.ship_schd_no)
																)
															)
															.innerJoin(S1_T7).on(
																bracket(
																	S1_T6.ship_alloc_sts_no.eq(S1_T7.ship_alloc_sts_no)
																	.and(S1_T7.can_flg.eq(value(false)))
																)
															)
															.leftOuterJoin(S1_T8).on(
																bracket(
																	value(0).eq(value(0))
																	.and(S1_T7.dlv_slip_d_no.eq(S1_T8.dlv_slip_d_no))
																	.and(
																		exists(
																			subQuery()
																			.select(value("X"))
																			.from(S2_T8W)
																			.where(
																				value(0).eq(value(0))
																				.and(S2_T8W.dlv_slip_no.eq(S1_T8.dlv_slip_no))
																				.and(S2_T8W.dlv_slip_seq.eq(S1_T8.dlv_slip_seq))
																				.and(S2_T8W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
																			)
																		)
																	)
																)
															)
															.leftOuterJoin(S1_T9).on(
																bracket(
																	S1_T8.dlv_slip_d_no.eq(S1_T9.dlv_slip_d_no)
																)
															)
														)
														.where(
															S1_T1.itm_ord_no.eq(S0_T1.itm_ord_no)
														)
													)
												)
											)
										)
											.then(value(true))
										.otherwise(S0_T13.arr_cmpl_flg)
							)
							.otherwise(
								subQuery()
								.select(
									cases()
										.when(
											min(S2_T18.arr_cmpl_flg).eq(value(true))
											.and(sum(S1_T16.base_unit_qty).gt(sum(S2_T18.arr_qty)))
										)
											.then(value(false))
										.otherwise(min(S2_T18.arr_cmpl_flg))
								)
								.from(
									S1_T10
									.innerJoin(S1_T11).on(
										bracket(
											S1_T10.itm_ord_no.eq(S1_T11.itm_ord_no)
										)
									)
									.innerJoin(S1_T12).on(
										bracket(
											S1_T11.itm_ord_no.eq(S1_T12.itm_ord_no)
										)
									)
									.innerJoin(S1_T13).on(
										bracket(
											S1_T12.xfr_schd_no.eq(S1_T13.xfr_schd_no)
										)
									)
									.innerJoin(S1_T14).on(
										bracket(
											S1_T13.ship_pr_no.eq(S1_T14.ship_pr_no)
										)
									)
									.innerJoin(S1_T15).on(
										bracket(
											S1_T14.ship_schd_no.eq(S1_T15.ship_schd_no)
										)
									)
									.innerJoin(S1_T16).on(
										bracket(
											S1_T15.ship_alloc_sts_no.eq(S1_T16.ship_alloc_sts_no)
											.and(S1_T16.can_flg.eq(value(false)))
										)
									)
									.leftOuterJoin(S1_T17).on(
										bracket(
											value(0).eq(value(0))
											.and(S1_T16.dlv_slip_d_no.eq(S1_T17.dlv_slip_d_no))
											.and(
												exists(
													subQuery()
													.select(value("X"))
													.from(S2_T17W)
													.where(
														value(0).eq(value(0))
														.and(S2_T17W.dlv_slip_no.eq(S1_T17.dlv_slip_no))
														.and(S2_T17W.dlv_slip_seq.eq(S1_T17.dlv_slip_seq))
														.and(S2_T17W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
													)
												)
											)
										)
									)
									.leftOuterJoin(S2_T18).on(
										bracket(
											S1_T17.dlv_slip_d_no.eq(S2_T18.dlv_slip_d_no)
										)
									)
								)
							).as("arr_cmpl_flg"),
						nvl(
							S0_T4.ship_inst_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						trunc(
							S0_T7.ship_schd_tm,
							MCDateFmt.DD
						).as("inst_gi_schd_dt"),
						cases()
							.when(
								S0_T7.ship_inst_no.isNotNull()
								.and(S0_T7.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())))
							)
								.then(
									nvl(
										S0_T16.schd_dt,
										S0_T2.inst_strg_schd_dt
									)
							)
							.otherwise(
								trunc(
									S0_T7.dlv_schd_tm,
									MCDateFmt.DD
								)
							).as("inst_strg_schd_dt"),
						nvl(
							S0_T9.dlv_qty,
							value(0)
						).as("yield_act_qty"),
						trunc(
							S0_T10.ship_tm,
							MCDateFmt.DD
						).as("gi_act_dt"),
						trunc(
							S0_T15.arr_tm,
							MCDateFmt.DD
						).as("strg_act_dt"),
						S0_T4.ship_pr_no,
						S0_T13.arr_pr_no,
						S0_T3.gi_lg_grp_cd,
						S0_T3.gr_lg_grp_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.xfr_schd_no.eq(S0_T4.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.ship_pr_no.eq(S0_T5.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.ship_inst_d_no.eq(S0_T6.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.ship_inst_no.eq(S0_T7.ship_inst_no)
								.and(S0_T7.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T5.ship_inst_d_no.isNotNull().and(S0_T5.ship_inst_d_no.eq(S0_T8.ship_inst_d_no))
							).or(
								S0_T5.ship_inst_d_no.isNull().and(S0_T5.ship_schd_no.eq(S0_T8.ship_schd_no))
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								S0_T8.ship_alloc_sts_no.eq(S0_T16.io_schd_no)
								.and(
									S0_T16.io_schd_typ.in(
										value(MSC_IO_SCHD_TYP.XFR_GR.value()),
										value(MSC_IO_SCHD_TYP.XFR_GR_PROV.value())
									)
								)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.ship_alloc_sts_no.eq(S0_T9.ship_alloc_sts_no)
								.and(S0_T9.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T9.ship_act_no.eq(S0_T10.ship_act_no)
								.and(S0_T10.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T9.dlv_slip_d_no.eq(S0_T11.dlv_slip_d_no))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_T11W)
										.where(
											value(0).eq(value(0))
											.and(S1_T11W.dlv_slip_no.eq(S0_T11.dlv_slip_no))
											.and(S1_T11W.dlv_slip_seq.eq(S0_T11.dlv_slip_seq))
											.and(S1_T11W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T11.dlv_slip_d_no.eq(S0_T13.dlv_slip_d_no)
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T13.arr_pr_no.eq(S0_T14.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T15).on(
							bracket(
								S0_T14.arr_schd_no.eq(S0_T15.arr_schd_no)
								.and(S0_T15.can_flg.eq(value(false)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S05
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S05() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_XFR_SCHD_R S0_T3 = MST_XFR_SCHD_R.create("T3");
		MST_XFR_ALLOC_STS_R S0_T4 = MST_XFR_ALLOC_STS_R.create("T4");
		MST_XFR_ACT_D_R S0_T5 = MST_XFR_ACT_D_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S05")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T3.xfr_schd_no,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						S0_T2.itm_ord_sts_typ,
						S0_T3.ship_inst_typ,
						nvl(
							S0_T4.trd_unit_qty,
							value(0)
						).as("wk_trd_unit_qty"),
						S0_T4.inst_bndl_flg.as("blk_flg"),
						S0_T4.pr_sts_typ,
						S0_T4.cmpl_flg,
						S0_T4.abort_flg,
						S0_T4.xfr_schd_dt.as("inst_gi_schd_dt"),
						nvl(
							S0_T4.act_qty,
							value(0)
						).as("wk_act_qty"),
						// this field is appended by sql coverter.
						S0_T5.xfr_act_no.as("join_xfr_act_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.xfr_schd_no.eq(S0_T3.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.xfr_alloc_sts_no.eq(S0_T5.xfr_alloc_sts_no)
							)
						)
					)
					.where(
						S0_T3.gi_lg_grp_cd.eq(S0_T3.gr_lg_grp_cd)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_ACT_R.class, r -> toCondition(
							r.getStringNE("join_xfr_act_no_")
						))
						.addSelect(m -> toArray(
							m.xfr_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("gi_act_dt", m.xfr_dt());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S06
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S06() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_MFG_INST_R S0_T4 = MST_MFG_INST_R.create("T4");
		MST_MFG_ACT_R S0_T5 = MST_MFG_ACT_R.create("T5");
		MST_YIELD_ACT_R S0_T6 = MST_YIELD_ACT_R.create("T6");
		MST_YIELD_SCHD_R S0_T7 = MST_YIELD_SCHD_R.create("T7");
		MST_OPER_ORDER_R S0_T8= MST_OPER_ORDER_R.create("T8");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S06")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						S0_T2.oper_ptn,
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_st_schd_dt"),
						trunc(
							S0_T5.st_act_tm,
							MCDateFmt.DD
						).as("mfg_st_act_dt"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_end_schd_dt"),
						trunc(
							S0_T5.end_act_tm,
							MCDateFmt.DD
						).as("mfg_end_act_dt"),
						nvl(
							S0_T3.base_unit_yield_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T6.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						S0_T4.mfg_inst_unit_typ,
						S0_T3.itm_mfg_inst_no,
						S0_T6.yield_act_no,
						S0_T4.mfg_inst_no.as("join_mfg_inst_no_"),
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_"),
						S0_T8.oper_ord_no,
						S0_T8.oper_ord_sts_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.itm_mfg_inst_no.eq(S0_T4.itm_mfg_inst_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.mfg_act_no.eq(S0_T6.mfg_act_no)
								.and(S0_T6.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T7.mfg_inst_no)
								.and(S0_T7.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
								.and(S0_T7.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T8).on(
								bracket(
										S0_T2.itm_ord_no.eq(S0_T8.itm_ord_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S07
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S07() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_MFG_INST_R S0_T4 = MST_MFG_INST_R.create("T4");
		MST_INSP_SCHD_R S0_T5 = MST_INSP_SCHD_R.create("T5");
		MST_INSP_INST_R S0_T6 = MST_INSP_INST_R.create("T6");
		MST_INSP_ACT_R S0_T7 = MST_INSP_ACT_R.create("T7");
		MST_YIELD_SCHD_R S0_T8 = MST_YIELD_SCHD_R.create("T8");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S07")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						S0_T2.oper_ptn,
						nvl(
							S0_T6.insp_sts_typ,
							S0_T5.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T6.col_schd_flg.as("insp_blk_flg"),
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_st_schd_dt"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_end_schd_dt"),
						cases()
							.when(
								S0_T5.insp_lt.isNotNull()
								.and(S0_T3.strg_loc_cd.isNotNull())
							)
								.then(
									MAPA_DT$F_CAL_DATE_LOC(
										trunc(
											S0_T8.schd_tm,
											MCDateFmt.DD
										),
										value(0).subtract(
											nvl(
												S0_T5.insp_offst,
												value(0)
											)
										),
										value(true),
										S0_T3.strg_loc_cd,
										value(false)
									)
							)
							.otherwise(nullValue()).as("inst_insp_st_schd_dt"),
						trunc(
							S0_T7.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						cases()
							.when(
								S0_T5.insp_lt.isNotNull()
								.and(S0_T3.strg_loc_cd.isNotNull())
							)
								.then(
									MAPA_DT$F_CAL_DATE_LOC(
										MAPA_DT$F_CAL_DATE_LOC(
											trunc(
												S0_T8.schd_tm,
												MCDateFmt.DD
											),
											value(0).subtract(
												nvl(
													S0_T5.insp_offst,
													value(0)
												)
											),
											value(true),
											S0_T3.strg_loc_cd,
											value(false)
										),
										S0_T5.insp_lt,
										value(true),
										S0_T3.strg_loc_cd,
										value(false)
									)
							)
							.otherwise(nullValue()).as("inst_insp_end_schd_dt"),
						trunc(
							S0_T7.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						nvl(
							S0_T3.base_unit_yield_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T7.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T4.mfg_inst_unit_typ,
						S0_T3.itm_mfg_inst_no,
						S0_T7.insp_act_no,
						S0_T4.mfg_inst_no.as("join_mfg_inst_no_"),
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.itm_mfg_inst_no.eq(S0_T4.itm_mfg_inst_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T4.mfg_inst_no.eq(S0_T5.src_no1))
								.and(S0_T5.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
								.and(S0_T5.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.insp_no.eq(S0_T6.insp_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.insp_no.eq(S0_T7.insp_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T8.mfg_inst_no)
								.and(S0_T8.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S08
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S08() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_SCHD_R S0_T7 = MST_ARR_SCHD_R.create("T7");
		MST_ARR_ACT_R S0_T8 = MST_ARR_ACT_R.create("T8");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S08")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						nvl2(
							nvl(
							S0_T5.po_d_no,
							S0_T4.po_no),
							value(false),
							S0_T3.abort_flg
						).as("po_schd_abort_flg"),
						cases()
						.when(
							S0_T6.purc_cmpl_flg.eq(value(true))
							.and(S0_T6.arr_cmpl_flg.eq(value(true)))
						)
						.then(value(true))
						.otherwise(
							nvl2(
								nvl(
								S0_T5.po_d_no,
								S0_T4.po_no),
								value(false),
								S0_T3.abort_flg
							)
						).as("all_cmpl_flg"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T7.pr_sts_typ.as("arr_sts_typ"),
						S0_T6.purc_cmpl_flg,
						S0_T6.arr_cmpl_flg,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T8.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						S0_T4.po_dt,
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						trunc(
							S0_T8.arr_tm,
							MCDateFmt.DD
						).as("strg_act_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T5.po_d_no,
						S0_T8.arr_act_no,
						S0_T3.po_schd_no,
						S0_T6.arr_schd_tm,
						S0_T7.arr_loc_cd,
						S0_T2.sppl_cd.as("join_sppl_cd_"),
						S0_T7.arr_schd_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.arr_pr_no.eq(S0_T7.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.arr_schd_no.eq(S0_T8.arr_schd_no)
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S09
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S09() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MCTempView S0_T6 = createTempView("T6");
		MST_PURC_ACT_R S1_T7T = MST_PURC_ACT_R.create("T7T");
		MST_PURC_ACT_D_R S1_T8T = MST_PURC_ACT_D_R.create("T8T");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S09")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T6.pr(S1_T8T.base_unit_qty),
							value(0)
						).as("purc_act_qty"),
						S0_T4.po_dt,
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T6.pr(S1_T7T.purc_dt).as("accpt_act_dt"),
						S0_T5.po_d_no,
						S0_T6.pr(S1_T8T.purc_act_d_no),
						S0_T3.po_schd_no,
						S0_T2.sppl_cd.as("join_sppl_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(
								subQuery()
								.select(
									S1_T8T.purc_act_d_no,
									S1_T8T.base_unit_qty,
									S1_T8T.po_d_no,
									S1_T7T.purc_dt
								)
								.from(
									S1_T8T
									.innerJoin(S1_T7T).on(
										bracket(
											S1_T7T.purc_act_no.eq(S1_T8T.purc_act_no)
											.and(S1_T7T.purc_act_seq.eq(S1_T8T.purc_act_seq))
											.and(S1_T7T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								).view(S0_T6)
							).on(
								bracket(
									S0_T5.po_d_no.eq(S0_T6.pr(S1_T8T.po_d_no))
								)
							)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S10
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S10() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_INSP_SCHD_R S0_T12 = MST_INSP_SCHD_R.create("T12");
		MST_INSP_INST_R S0_T13 = MST_INSP_INST_R.create("T13");
		MST_INSP_ACT_R S0_T14 = MST_INSP_ACT_R.create("T14");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S10")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						nvl(
							S0_T13.insp_sts_typ,
							S0_T12.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T13.col_schd_flg.as("insp_blk_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T14.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T4.po_dt,
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						trunc(
							S0_T14.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						trunc(
							S0_T14.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						S0_T5.po_d_no,
						S0_T14.insp_act_no,
						S0_T3.po_schd_no,
						S0_T12.insp_lt,
						nvl(
								S0_T12.insp_offst,
								value(0)
							).as("insp_offst"),
						S0_T2.sppl_cd.as("join_sppl_cd_"),
						S0_T12.src_no3
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T5.po_d_no.eq(S0_T12.src_no1))
								.and(S0_T12.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
								.and(S0_T12.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T12.insp_no.eq(S0_T13.insp_no)
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T13.insp_no.eq(S0_T14.insp_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S11
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S11() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_SCHD_R S0_T7 = MST_ARR_SCHD_R.create("T7");
		MST_ARR_ACT_R S0_T8 = MST_ARR_ACT_R.create("T8");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S11")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T7.arr_pr_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						nvl2(
							nvl(
							S0_T5.po_d_no,
							S0_T4.po_no),
							value(false),
							S0_T3.abort_flg
						).as("po_schd_abort_flg"),
						cases()
						.when(
							S0_T6.purc_cmpl_flg.eq(value(true))
							.and(S0_T6.arr_cmpl_flg.eq(value(true)))
						)
						.then(value(true))
						.otherwise(
							nvl2(
								nvl(
								S0_T5.po_d_no,
								S0_T4.po_no),
								value(false),
								S0_T3.abort_flg
							)
						).as("all_cmpl_flg"),
						S0_T7.pr_sts_typ.as("arr_sts_typ"),
						S0_T6.purc_cmpl_flg,
						S0_T6.arr_cmpl_flg,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T8.base_unit_qty,
							value(0)
						).as("yield_act_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T4.po_dt.as("po_dt"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						trunc(
							S0_T8.arr_tm,
							MCDateFmt.DD
						).as("strg_act_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T5.po_d_no,
						S0_T8.arr_act_no,
						S0_T3.po_schd_no,
						S0_T6.arr_schd_tm,
						S0_T7.arr_loc_cd,
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_"),
						S0_T7.arr_schd_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.arr_pr_no.eq(S0_T7.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.arr_schd_no.eq(S0_T8.arr_schd_no)
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S12
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S12() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_PURC_ACT_R S0_T6 = MST_PURC_ACT_R.create("T6");
		MST_PURC_ACT_D_R S0_T7 = MST_PURC_ACT_D_R.create("T7");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S12")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T7.base_unit_qty,
							value(0)
						).as("purc_act_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T4.po_dt.as("po_dt"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T6.purc_dt.as("accpt_act_dt"),
						S0_T5.po_d_no,
						S0_T7.purc_act_d_no,
						S0_T3.po_schd_no,
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T4.po_no.eq(S0_T6.po_no)
								.and(S0_T6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T7.po_d_no)
								.and(S0_T6.purc_act_no.eq(S0_T7.purc_act_no))
								.and(S0_T6.purc_act_seq.eq(S0_T7.purc_act_seq))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S13
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S13() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_ITM_MFG_INST_R S0_T6 = MST_ITM_MFG_INST_R.create("T6");
		MST_MFG_INST_R S0_T7 = MST_MFG_INST_R.create("T7");
		MST_MFG_ACT_R S0_T8 = MST_MFG_ACT_R.create("T8");
		MST_YIELD_ACT_R S0_T9 = MST_YIELD_ACT_R.create("T9");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S13")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(nvl2(
									nvl(
										S0_T5.po_d_no,
										S0_T4.po_no),
										value(false),
									S0_T3.abort_flg).eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T4.po_dt.as("po_dt"),
						trunc(
							S0_T7.st_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_st_schd_dt"),
						trunc(
							S0_T8.st_act_tm,
							MCDateFmt.DD
						).as("mfg_st_act_dt"),
						trunc(
							S0_T7.end_schd_tm,
							MCDateFmt.DD
						).as("inst_mfg_end_schd_dt"),
						trunc(
							S0_T8.end_act_tm,
							MCDateFmt.DD
						).as("mfg_end_act_dt"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						S0_T5.po_d_no,
						S0_T3.po_schd_no,
						S0_T7.mfg_inst_no.as("join_mfg_inst_no_"),
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								nvl(
									S0_T5.outsrc_itm_ord_no,
									S0_T3.outsrc_itm_ord_no
								).eq(S0_T6.itm_ord_no)
								.and(S0_T6.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.itm_mfg_inst_no.eq(S0_T7.itm_mfg_inst_no)
								.and(S0_T7.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.itm_mfg_inst_no.eq(S0_T8.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.mfg_act_no.eq(S0_T9.mfg_act_no)
								.and(S0_T9.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_KEY_Query_S14
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_KEY_S14() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PO_SCHD_R S0_T3 = MST_PO_SCHD_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MST_INSP_SCHD_R S0_T6 = MST_INSP_SCHD_R.create("T6");
		MST_INSP_INST_R S0_T7 = MST_INSP_INST_R.create("T7");
		MST_INSP_ACT_R S0_T8 = MST_INSP_ACT_R.create("T8");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_KEY_Query_S14")
					.mainQuery()
					.select(
						S0_T2.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T2.ord_gnrt_typ,
						S0_T2.inst_qty,
						S0_T2.not_inst_qty,
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("wk_inst_qty"),
						cases()
							.when(
								S0_T5.base_unit_qty.isNull()
								.and(S0_T3.abort_flg.eq(value(false)))
							)
								.then(S0_T3.base_unit_qty)
							.otherwise(value(0)).as("wk_not_inst_qty"),
						nvl(
							S0_T7.insp_sts_typ,
							S0_T6.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_T7.col_schd_flg.as("insp_blk_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("inst_yield_schd_qty"),
						nvl(
							S0_T8.good_qty,
							value(0)
						).as("insp_act_qty"),
						S0_T5.bndl_flg.as("blk_flg"),
						S0_T4.po_dt.as("po_dt"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("inst_strg_schd_dt"),
						S0_T5.purc_schd_dt.as("inst_accpt_schd_dt"),
						trunc(
							S0_T8.st_tm,
							MCDateFmt.DD
						).as("insp_st_act_dt"),
						trunc(
							S0_T8.end_tm,
							MCDateFmt.DD
						).as("insp_end_act_dt"),
						S0_T5.po_d_no,
						S0_T8.insp_act_no,
						S0_T3.po_schd_no,
						S0_T6.insp_lt,
						nvl(
								S0_T6.insp_offst,
								value(0)
							).as("insp_offst"),
						S0_T2.mfg_loc_cd.as("join_mfg_loc_cd_"),
						S0_T6.src_no3
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T3.pln_itm_ord_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_no.eq(S0_T5.po_no)
								.and(S0_T3.po_d_no.eq(S0_T5.po_d_no))
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T5.po_d_no.eq(S0_T6.src_no1))
								.and(S0_T6.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
								.and(S0_T6.latest_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.insp_no.eq(S0_T7.insp_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.insp_no.eq(S0_T8.insp_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_MFG_INST_PR_R.class, r -> toCondition(
							r.getStringNE("join_mfg_inst_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_cal_cd", m.cal_cd());
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S01() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_ITM_DTL_R S0_M3 = MAM_ITM_DTL_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.peg_no,
						S0_T1.itm_ord_no,
						S0_T1.itm_ord_typ,
						S0_T1.wg_cd,
						S0_T1.bom_ptn,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.inst_qty,
						S0_T1.mfg_loc_cd,
						S0_T1.oper_ptn,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.master_dt,
						S0_T1.mfg_st_schd_dt,
						S0_T1.mfg_end_schd_dt,
						S0_M2.loc_nm.as("mfg_loc_nm"),
						S0_M2.str_ln_tgt_flg.as("oper_str_ln_tgt_flg"),
						S0_M2.sppl_cd,
						S0_M3.bkf_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_M2).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M2.loc_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M3.mfg_loc_cd))
								.and(S0_M2.wg_cd.eq(S0_M3.wg_cd))
								.and(S0_T1.bom_ptn.eq(S0_M3.bom_ptn))
								.and(S0_T1.master_dt.gte(S0_M3.st_dt))
								.and(S0_T1.master_dt.lte(S0_M3.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S02() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		MAM_ITM_OPER_R S0_M1 = MAM_ITM_OPER_R.create("M1");
		MAM_OPER_R S0_M2 = MAM_OPER_R.create("M2");
		MAM_WG_R S0_M3 = MAM_WG_R.create("M3");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAVM_ITM_DTL_MFG_R S0_M7 = MAVM_ITM_DTL_MFG_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_LOC_R S1_M = MAM_LOC_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S02")
					.mainQuery()
					.select(
						S0_T1.peg_no,
						cases()
							.when(S0_M1.oper_offst_typ.eq(value(MAC_OFFST_TYP.BY_ST.value())))
								.then(
									trunc(
										MAPA_DT$F_CAL_DATE_LOC(
											S0_T1.mfg_st_schd_dt,
											cases()
												.when(S0_M1.oper_offst.lte(value(0)))
													.then(
														value(-1).multiply(
															bracket(
																S0_M1.oper_offst.subtract(
																	decode(
																		S0_M1.oper_offst_add_qty,
																		nullValue(),
																		value(0),
																		trunc(
																			S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																			value(0)
																		)
																	)
																)
															)
														)
												)
												.otherwise(
													value(-1).multiply(
														bracket(
															S0_M1.oper_offst.add(
																decode(
																	S0_M1.oper_offst_add_qty,
																	nullValue(),
																	value(0),
																	trunc(
																		S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																		value(0)
																	)
																)
															)
														)
													)
												),
											value(false),
											nvl(
												S0_M1.oper_loc_cd,
												S0_T1.mfg_loc_cd
											),
											value(false)
										),
										MCDateFmt.DD
									)
							)
							.otherwise(
								trunc(
									MAPA_DT$F_CAL_DATE_LOC(
										MAPA_DT$F_CAL_DATE_LOC(
											S0_T1.mfg_end_schd_dt,
											cases()
												.when(S0_M1.oper_offst.lt(value(0)))
													.then(
														value(-1).multiply(
															bracket(
																S0_M1.oper_offst.subtract(
																	decode(
																		S0_M1.oper_offst_add_qty,
																		nullValue(),
																		value(0),
																		trunc(
																			S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																			value(0)
																		)
																	)
																)
															)
														)
												)
												.otherwise(
													value(-1).multiply(
														bracket(
															S0_M1.oper_offst.add(
																decode(
																	S0_M1.oper_offst_add_qty,
																	nullValue(),
																	value(0),
																	trunc(
																		S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																		value(0)
																	)
																)
															)
														)
													)
												),
											value(false),
											nvl(
												S0_M1.oper_loc_cd,
												S0_T1.mfg_loc_cd
											),
											value(false)
										),
										value(-1).multiply(
											bracket(
												S0_M1.oper_lt.add(
													decode(
														S0_M1.oper_lt_add_qty,
														nullValue(),
														value(0),
														trunc(
															S0_T1.inst_qty.divide(S0_M1.oper_lt_add_qty),
															value(0)
														)
													)
												)
											)
										),
										value(false),
										nvl(
											S0_M1.oper_loc_cd,
											S0_T1.mfg_loc_cd
										),
										value(false)
									),
									MCDateFmt.DD
								)
							).as("st_schd_tm"),
						cases()
							.when(S0_M1.oper_offst_typ.eq(value(MAC_OFFST_TYP.BY_ST.value())))
								.then(
									trunc(
										MAPA_DT$F_CAL_DATE_LOC(
											MAPA_DT$F_CAL_DATE_LOC(
												S0_T1.mfg_st_schd_dt,
												cases()
													.when(S0_M1.oper_offst.lte(value(0)))
														.then(
															value(-1).multiply(
																bracket(
																	S0_M1.oper_offst.subtract(
																		decode(
																			S0_M1.oper_offst_add_qty,
																			nullValue(),
																			value(0),
																			trunc(
																				S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																				value(0)
																			)
																		)
																	)
																)
															)
													)
													.otherwise(
														value(-1).multiply(
															bracket(
																S0_M1.oper_offst.add(
																	decode(
																		S0_M1.oper_offst_add_qty,
																		nullValue(),
																		value(0),
																		trunc(
																			S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																			value(0)
																		)
																	)
																)
															)
														)
													),
												value(false),
												nvl(
													S0_M1.oper_loc_cd,
													S0_T1.mfg_loc_cd
												),
												value(false)
											),
											S0_M1.oper_lt.add(
												decode(
													S0_M1.oper_lt_add_qty,
													nullValue(),
													value(0),
													trunc(
														S0_T1.inst_qty.divide(S0_M1.oper_lt_add_qty),
														value(0)
													)
												)
											),
											value(true),
											nvl(
												S0_M1.oper_loc_cd,
												S0_T1.mfg_loc_cd
											),
											value(false)
										),
										MCDateFmt.DD
									)
							)
							.otherwise(
								trunc(
									MAPA_DT$F_CAL_DATE_LOC(
										S0_T1.mfg_end_schd_dt,
										cases()
											.when(S0_M1.oper_offst.lt(value(0)))
												.then(
													value(-1).multiply(
														bracket(
															S0_M1.oper_offst.subtract(
																decode(
																	S0_M1.oper_offst_add_qty,
																	nullValue(),
																	value(0),
																	trunc(
																		S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																		value(0)
																	)
																)
															)
														)
													)
											)
											.otherwise(
												value(-1).multiply(
													bracket(
														S0_M1.oper_offst.add(
															decode(
																S0_M1.oper_offst_add_qty,
																nullValue(),
																value(0),
																trunc(
																	S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
																	value(0)
																)
															)
														)
													)
												)
											),
										value(false),
										nvl(
											S0_M1.oper_loc_cd,
											S0_T1.mfg_loc_cd
										),
										value(false)
									),
									MCDateFmt.DD
								)
							).as("end_schd_tm"),
						S0_M1.oper_lt.add(
							decode(
								S0_M1.oper_lt_add_qty,
								nullValue(),
								value(0),
								trunc(
									S0_T1.inst_qty.divide(S0_M1.oper_lt_add_qty),
									value(0)
								)
							)
						).as("oper_lt"),
						S0_M1.oper_lt.as("mst_oper_lt"),
						S0_M1.oper_lt_add_qty,
						S0_M1.oper_offst_typ,
						cases()
							.when(S0_M1.oper_offst.gt(value(0)))
								.then(
									S0_M1.oper_offst.add(
										decode(
											S0_M1.oper_offst_add_qty,
											nullValue(),
											value(0),
											trunc(
												S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
												value(0)
											)
										)
									)
							)
							.when(S0_M1.oper_offst.lt(value(0)))
								.then(
									S0_M1.oper_offst.subtract(
										decode(
											S0_M1.oper_offst_add_qty,
											nullValue(),
											value(0),
											trunc(
												S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
												value(0)
											)
										)
									)
							)
							.otherwise(
								cases()
									.when(S0_M1.oper_offst_typ.eq(value(MAC_OFFST_TYP.BY_ST.value())))
										.then(
											S0_M1.oper_offst.subtract(
												decode(
													S0_M1.oper_offst_add_qty,
													nullValue(),
													value(0),
													trunc(
														S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
														value(0)
													)
												)
											)
									)
									.when(S0_M1.oper_offst_typ.eq(value(MAC_OFFST_TYP.BY_END.value())))
										.then(
											S0_M1.oper_offst.add(
												decode(
													S0_M1.oper_offst_add_qty,
													nullValue(),
													value(0),
													trunc(
														S0_T1.inst_qty.divide(S0_M1.oper_offst_add_qty),
														value(0)
													)
												)
											)
									)
									.otherwise(nullValue())
							).as("oper_offst"),
						S0_M1.oper_offst.as("mst_oper_offst"),
						S0_M1.oper_offst_add_qty,
						S0_T1.inst_qty.as("oper_schd_qty"),
						value(MSC_OPER_ORD_STS_TYP.OPN.value()).as("oper_ord_sts_typ"),
						S0_T1.itm_ord_no,
						S0_M1.oper_ptn,
						S0_M1.oper_cd,
						S0_M2.oper_nm,
						S0_M1.oper_seq,
						S0_M1.disp_seq,
						S0_T1.mst_mfg_loc_cd,
						S0_T1.wg_cd,
						S0_M3.wg_nm,
						S0_M8.unit_cd.as("base_unit_cd"),
						S0_M9.unit_nm.as("base_unit_nm"),
						S0_M8.dec_place.as("base_dec_place"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							S0_M8.unit_cd,
							S0_M1.oper_unit_cd
						).as("oper_unit_cd"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							S0_M9.unit_nm,
							S0_M4.unit_nm
						).as("oper_unit_nm"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M1.oper_std_qty
						).as("oper_std_qty"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M1.oper_conv_qty
						).as("oper_conv_qty"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							S0_M8.dec_place,
							S0_M1.dec_place
						).as("dec_place"),
						decode(
							S0_M1.oper_unit_cd,
							nullValue(),
							value(MAC_RND_TYP.RNDUP.value()),
							S0_M1.unit_conv_rnd_typ
						).as("unit_conv_rnd_typ"),
						S0_M1.yield_oper_flg,
						S0_M1.yield_oper_ratio,
						S0_M1.oper_inst_grp,
						decode(
							S0_M1.oper_loc_cd,
							nullValue(),
							S0_T1.mfg_loc_cd,
							S0_M1.oper_loc_cd
						).as("oper_loc_cd"),
						decode(
							S0_M1.oper_loc_cd,
							nullValue(),
							S0_M6.loc_nm,
							S0_M5.loc_nm
						).as("oper_loc_nm"),
						decode(
							S0_M1.oper_loc_cd,
							nullValue(),
							S0_M6.str_ln_tgt_flg,
							S0_M5.str_ln_tgt_flg
						).as("oper_str_ln_tgt_flg"),
						S0_M1.lmt_fr_dt_flg,
						S0_M1.oper_lower_yield,
						S0_M1.oper_std_yield,
						S0_M1.oper_upper_yield,
						S0_M1.wip_rate,
						S0_M7.bkf_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_T1.mst_mfg_loc_cd.eq(S0_M1.loc_cd))
								.and(S0_T1.oper_ptn.eq(S0_M1.oper_ptn))
								.and(
									S0_T1.sno1.eq(S0_M1.sno1)
									.or(S0_M1.sno1.isNull())
								)
								.and(
									S0_T1.sno2.eq(S0_M1.sno2)
									.or(S0_M1.sno2.isNull())
								)
								.and(
									S0_T1.sno3.eq(S0_M1.sno3)
									.or(S0_M1.sno3.isNull())
								)
								.and(
									S0_T1.sno4.eq(S0_M1.sno4)
									.or(S0_M1.sno4.isNull())
								)
								.and(S0_T1.mfg_st_schd_dt.gte(S0_M1.st_dt))
								.and(S0_T1.mfg_st_schd_dt.lte(S0_M1.end_dt))
								.and(S0_M1.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.oper_cd.eq(S0_M2.oper_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M3.wg_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M1.oper_unit_cd.eq(S0_M4.unit_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M1.oper_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.innerJoin(S0_M6).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M6.loc_cd)
							)
						)
						.innerJoin(S0_M7).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M7.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M7.itm_sub3))
								.and(S0_T1.bom_ptn.eq(S0_M7.bom_ptn))
								.and(S0_M6.wg_cd.eq(S0_M7.wg_cd))
								.and(S0_T1.mfg_loc_cd.eq(S0_M7.mfg_loc_cd))
								.and(S0_T1.master_dt.gte(S0_M7.st_dt))
								.and(S0_T1.master_dt.lte(S0_M7.end_dt))
							)
						)
						.innerJoin(S0_M8).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M8.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M8.unit_cd.eq(S0_M9.unit_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(MAC_STR$IS_NULL_VAL(S0_T1.oper_ptn).eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M)
								.where(
									value(0).eq(value(0))
									.and(S1_M.loc_cd.eq(S0_T1.mfg_loc_cd))
									.and(S1_M.sppl_cd.isNull())
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S03
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S03() {
		MSW_ITM_ORDER_R S0_T = MSW_ITM_ORDER_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S03")
					.mainQuery()
					.select(
						S0_T.peg_no,
						S0_T.po_schd_dt,
						S0_T.purc_lt,
						S0_T.gi_schd_dt,
						S0_T.mfg_st_schd_dt,
						S0_T.mfg_lt,
						S0_T.mfg_end_schd_dt,
						S0_T.xfr_lt,
						S0_T.strg_schd_dt,
						S0_T.accpt_insp_lt,
						S0_T.accpt_schd_dt,
						S0_T.insp_offst,
						S0_T.insp_st_schd_dt,
						S0_T.insp_lt,
						S0_T.insp_end_schd_dt,
						S0_T.avl_schd_dt
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_T.peg_no.asc())
			);
	}

	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S05
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S05() {
		MCTempView S0_T = createTempView("T");
		MAM_PURC_DDLV_LT_R S0_M1 = MAM_PURC_DDLV_LT_R.create("M1");
		MAM_LG_CTL_R S0_M2 = MAM_LG_CTL_R.create("M2");
		MAM_LG_CTL_R S0_M3 = MAM_LG_CTL_R.create("M3");
		MAM_BP_STOP_R S0_M4 = MAM_BP_STOP_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MSW_ITM_ORDER_R S1_T1 = MSW_ITM_ORDER_R.create("T1");
		MST_ITM_ORDER_R S1_T2 = MST_ITM_ORDER_R.create("T2");
		MST_PRCD_ITM_ORDER_R S1_T21 = MST_PRCD_ITM_ORDER_R.create("T21");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_WG_R S1_M2 = MAM_WG_R.create("M2");
		MAM_ITM_DTL_R S1_M3 = MAM_ITM_DTL_R.create("M3");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_LOC_R S1_M6 = MAM_LOC_R.create("M6");
		MAM_ITM_NOT_FIX_R S1_M7 = MAM_ITM_NOT_FIX_R.create("M7");
		MAM_ITM_STOP_R S1_M8 = MAM_ITM_STOP_R.create("M8");
		MAM_BP_STOP_R S1_M9 = MAM_BP_STOP_R.create("M9");
		MAM_BP_R S1_M10 = MAM_BP_R.create("M10");
		MAM_CO_R S1_M11 = MAM_CO_R.create("M11");
		MST_SCHE_ORD_EXEC_R S1_T3 = MST_SCHE_ORD_EXEC_R.create("T3");
		MCTempView S1_T4 = createTempView("T4");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_ITM_VER_R S2_X1 = MAM_ITM_VER_R.create("X1");
		MSW_OPER_ORDER_R S3_T1 = MSW_OPER_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S05")
					.mainQuery()
					.select(
						S0_T.pr(S1_T1.peg_no),
						S0_T.pr(S1_T1.itm_ord_no),
						S0_T.pr(S1_T1.itm_ord_typ),
						S0_T.pr("a_itm_ord_sts_typ"),
						S0_T.pr("b_itm_ord_sts_typ"),
						S0_T.pr(S1_T1.ord_gnrt_typ),
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.ver_no),
						S0_T.pr(S1_T1.strg_loc_cd),
						S0_T.pr(S1_T1.mfg_loc_cd),
						S0_T.pr(S1_T1.sppl_cd),
						S0_T.pr(S1_T1.maker_cd),
						S0_T.pr(S1_T1.rqst_loc_cd),
						S0_T.pr("rqst_wg_cd"),
						S0_M5.wg_nm.as("rqst_wg_nm"),
						S0_T.pr(S1_T1.bom_ptn),
						S0_T.pr(S1_T1.oper_ptn),
						S0_T.pr(S1_T1.inst_qty),
						S0_T.pr(S1_T1.yield_schd_qty),
						S0_T.pr(S1_T1.not_inst_qty),
						S0_T.pr(S1_T1.inst_yield_schd_qty),
						S0_T.pr(S1_T1.yield_act_qty),
						S0_T.pr(S1_T1.purc_act_qty),
						S0_T.pr(S1_T1.insp_act_qty),
						S0_T.pr("nmr_qty"),
						S0_T.pr("dnm_qty"),
						S0_T.pr("fxd_yield_qty"),
						S0_T.pr(S1_T1.itm_ord_sts_typ),
						S0_T.pr(S1_T1.fix_dt),
						S0_T.pr(S1_T1.blk_flg),
						S0_T.pr(S1_T1.po_schd_dt),
						S0_T.pr(S1_T1.mrp_po_schd_dt),
						S0_T.pr(S1_T1.po_dt),
						cases()
							.when(S0_T.pr("purc_days").eq(nullValue()))
								.then(nullValue())
							.when(S0_T.pr("purc_days").eq(value(0)))
								.then(nullValue())
							.otherwise(S0_T.pr("purc_days").subtract(value(1))).as("purc_lt"),
						S0_T.pr(S1_T1.mfg_st_schd_dt),
						S0_T.pr(S1_T1.mrp_mfg_st_schd_dt),
						S0_T.pr(S1_T1.inst_mfg_st_schd_dt),
						S0_T.pr(S1_T1.mfg_st_act_dt),
						S0_T.pr(S1_T1.mfg_end_schd_dt),
						S0_T.pr(S1_T1.mrp_mfg_end_schd_dt),
						S0_T.pr(S1_T1.inst_mfg_end_schd_dt),
						S0_T.pr(S1_T1.mfg_end_act_dt),
						cases()
							.when(S0_T.pr("mfg_days").eq(nullValue()))
								.then(nullValue())
							.when(S0_T.pr("mfg_days").eq(value(0)))
								.then(nullValue())
							.otherwise(S0_T.pr("mfg_days").subtract(value(1))).as("mfg_lt"),
						S0_T.pr(S1_T1.gi_schd_dt),
						S0_T.pr(S1_T1.mrp_gi_schd_dt),
						S0_T.pr(S1_T1.inst_gi_schd_dt),
						S0_T.pr(S1_T1.gi_act_dt),
						S0_T.pr(S1_T1.strg_schd_dt),
						S0_T.pr(S1_T1.mrp_strg_schd_dt),
						S0_T.pr(S1_T1.inst_strg_schd_dt),
						S0_T.pr(S1_T1.strg_act_dt),
						coalesce(
							S0_M2.xfr_lt,
							S0_M3.xfr_lt,
							value(0)
						).as("xfr_lt"),
						S0_T.pr(S1_T1.accpt_schd_dt),
						S0_T.pr(S1_T1.mrp_accpt_schd_dt),
						S0_T.pr(S1_T1.inst_accpt_schd_dt),
						S0_T.pr(S1_T1.accpt_act_dt),
						S0_T.pr("accpt_insp_lt"),
						S0_T.pr(S1_T1.insp_st_schd_dt),
						S0_T.pr(S1_T1.mrp_insp_st_schd_dt),
						S0_T.pr(S1_T1.inst_insp_st_schd_dt),
						S0_T.pr(S1_T1.insp_st_act_dt),
						S0_T.pr(S1_T1.insp_end_schd_dt),
						S0_T.pr(S1_T1.mrp_insp_end_schd_dt),
						S0_T.pr(S1_T1.inst_insp_end_schd_dt),
						S0_T.pr(S1_T1.insp_end_act_dt),
						S0_T.pr(S1_T1.insp_lt),
						S0_T.pr(S1_T1.insp_offst),
						S0_T.pr(S1_T1.mrp_avl_schd_dt),
						S0_T.pr(S1_T1.avl_schd_dt),
						S0_T.pr(S1_T1.master_dt),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno_typ1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno_typ2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno_typ3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr(S1_T1.sno_typ4),
						S0_T.pr(S1_T1.lmt_dt),
						S0_T.pr(S1_T1.wg_cd),
						S0_T.pr(S1_T1.not_fix_flg),
						S0_T.pr(S1_M3.ord_fix_pd),
						S0_T.pr(S1_T1.rqmt_no),
						S0_T.pr(S1_T1.inst_po_cnt_rmrks),
						S0_T.pr(S1_T1.intr_rmrks),
						S0_T.pr(S1_T1.sub_char1),
						S0_T.pr(S1_T1.sub_char2),
						S0_T.pr(S1_T1.sub_char3),
						S0_T.pr(S1_M1.dec_place),
						S0_T.pr("mfg_sppl_cd"),
						S0_T.pr("mfg_maker_cd"),
						S0_T.pr("chk_itm_cd"),
						S0_T.pr("chk_wg_mfg_flg"),
						S0_T.pr("chk_wg_lg_flg"),
						S0_T.pr("chk_strg_loc_wg_cd"),
						S0_T.pr("chk_strg_loc_lg_grp_cd"),
						S0_T.pr("chk_strg_loc_site_cd"),
						S0_T.pr("chk_mfg_loc_wg_cd"),
						S0_T.pr("chk_rqst_loc_wg_cd"),
						S0_T.pr("chk_rqst_loc_lg_grp_cd"),
						S0_T.pr("chk_itm_ver_flg"),
						S0_T.pr("chk_valid_ver_no_flg"),
						S0_T.pr("chk_b_wg_cd"),
						S0_T.pr("chk_itm_sno1_mng_typ"),
						S0_T.pr("chk_itm_sno2_mng_typ"),
						S0_T.pr("chk_itm_sno3_mng_typ"),
						S0_T.pr("chk_itm_sno4_mng_typ"),
						S0_T.pr(S1_M1.unit_cd),
						S0_T.pr("chk_not_fix_flg"),
						S0_T.pr("chk_itm_stop_flg"),
						S0_T.pr("chk_order_stop_dt"),
						S0_T.pr("chk_sppl_stop_flg"),
						S0_T.pr("chk_sppl_stop_dt"),
						decode(
							S0_M4.bp_cd,
							nullValue(),
							value(false),
							value(true)
						).as("chk_mfg_sppl_stop_flg"),
						decode(
							S0_M4.bp_cd,
							nullValue(),
							value((MCDate) null),
							S0_M4.order_stop_dt
						).as("chk_mfg_sppl_stop_dt"),
						S0_T.pr("chk_sche_ord_flg"),
						S0_T.pr("chk_dft_oper_flg"),
						S0_T.pr(S1_M1.lot_mng_typ),
						S0_T.pr(S1_M1.sublot_mng_typ),
						S0_T.pr("m_itm_cd"),
						S0_T.pr("m_strg_loc_cd"),
						S0_T.pr("m_mfg_loc_cd"),
						S0_T.pr("m_rqst_loc_cd"),
						S0_T.pr("m_sppl_cd"),
						S0_T.pr("m_maker_cd")
					)
					.from(
						subQuery()
						.select(
							S1_T1.peg_no,
							S1_T1.itm_ord_no,
							S1_T1.itm_ord_sts_typ.as("a_itm_ord_sts_typ"),
							decode(
								bind("mrp_typ"),
								value(MSC_MRP_TYP.PRCD.value()),
								S1_T21.itm_ord_sts_typ,
								S1_T2.itm_ord_sts_typ
							).as("b_itm_ord_sts_typ"),
							S1_T1.itm_ord_typ,
							S1_T1.ord_gnrt_typ,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.ver_no,
							S1_T1.strg_loc_cd,
							S1_T1.mfg_loc_cd,
							decode(
								bind("mrp_typ"),
								value(MSC_MRP_TYP.PRCD.value()),
								S1_T21.mst_mfg_loc_cd,
								S1_T2.mst_mfg_loc_cd
							).as("mst_mfg_loc_cd"),
							S1_T1.sppl_cd,
							S1_T1.maker_cd,
							S1_T1.rqst_loc_cd,
							coalesce(
								S1_M6.wg_cd,
								S1_T1.rqst_wg_cd,
								S1_M3.rqst_wg_cd
							).as("rqst_wg_cd"),
							S1_T1.bom_ptn,
							S1_T1.oper_ptn,
							S1_T1.inst_qty,
							S1_T1.yield_schd_qty,
							S1_T1.not_inst_qty,
							S1_T1.inst_yield_schd_qty,
							S1_T1.yield_act_qty,
							S1_T1.purc_act_qty,
							S1_T1.insp_act_qty,
							decode(
								S1_T1.itm_ord_typ,
								value(MSC_ITM_ORD_TYP.MFG.value()),
								S1_M3.mfg_inst_qty,
								value(1)
							).as("dnm_qty"),
							decode(
								S1_T1.itm_ord_typ,
								value(MSC_ITM_ORD_TYP.MFG.value()),
								S1_M3.yield_schd_qty,
								value(1)
							).as("nmr_qty"),
							decode(
								S1_T1.itm_ord_typ,
								value(MSC_ITM_ORD_TYP.MFG.value()),
								S1_M3.fxd_rqmt_qty,
								value(0)
							).as("fxd_yield_qty"),
							S1_T1.itm_ord_sts_typ,
							S1_T1.fix_dt,
							S1_T1.blk_flg,
							S1_T1.po_schd_dt,
							S1_T1.mrp_po_schd_dt,
							S1_T1.po_dt,
							MAPA_DT$F_CAL_DAYS(
								S1_T1.po_schd_dt,
								S1_T1.strg_schd_dt,
								S1_M10.sppl_cal_cd
							).as("purc_days"),
							S1_T1.mfg_st_schd_dt,
							S1_T1.mrp_mfg_st_schd_dt,
							S1_T1.inst_mfg_st_schd_dt,
							S1_T1.mfg_st_act_dt,
							S1_T1.mfg_end_schd_dt,
							S1_T1.mrp_mfg_end_schd_dt,
							S1_T1.inst_mfg_end_schd_dt,
							S1_T1.mfg_end_act_dt,
							MAPA_DT$F_CAL_DAYS(
								S1_T1.mfg_st_schd_dt,
								S1_T1.mfg_end_schd_dt,
								nvl(
									S1_M5.cal_cd,
									S1_M11.std_cal_cd
								)
							).as("mfg_days"),
							S1_T1.gi_schd_dt,
							S1_T1.mrp_gi_schd_dt,
							S1_T1.inst_gi_schd_dt,
							S1_T1.gi_act_dt,
							S1_T1.strg_schd_dt,
							S1_T1.mrp_strg_schd_dt,
							S1_T1.inst_strg_schd_dt,
							S1_T1.strg_act_dt,
							S1_T1.accpt_schd_dt,
							S1_T1.mrp_accpt_schd_dt,
							S1_T1.inst_accpt_schd_dt,
							S1_T1.accpt_act_dt,
							cases()
								.when(
									S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value()))
									.or(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
								)
									.then(
										nvl(
											S1_M3.accpt_insp_lt,
											value(0)
										)
								)
								.otherwise(nullValue()).as("accpt_insp_lt"),
							S1_T1.insp_st_schd_dt,
							S1_T1.mrp_insp_st_schd_dt,
							S1_T1.inst_insp_st_schd_dt,
							S1_T1.insp_st_act_dt,
							S1_T1.insp_end_schd_dt,
							S1_T1.mrp_insp_end_schd_dt,
							S1_T1.inst_insp_end_schd_dt,
							S1_T1.insp_end_act_dt,
							S1_T1.insp_lt,
							S1_T1.insp_offst,
							S1_T1.mrp_avl_schd_dt,
							S1_T1.avl_schd_dt,
							S1_T1.master_dt,
							S1_T1.sno1,
							S1_T1.sno_typ1,
							S1_T1.sno2,
							S1_T1.sno_typ2,
							S1_T1.sno3,
							S1_T1.sno_typ3,
							S1_T1.sno4,
							S1_T1.sno_typ4,
							S1_T1.lmt_dt,
							S1_T1.wg_cd,
							S1_T1.not_fix_flg,
							S1_M3.ord_fix_pd,
							S1_T1.rqmt_no,
							S1_T1.inst_po_cnt_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_M1.dec_place,
							S1_M1.unit_cd,
							S1_M1.ver_flg.as("chk_itm_ver_flg"),
							S1_M1.sno1_mng_typ.as("chk_itm_sno1_mng_typ"),
							S1_M1.sno2_mng_typ.as("chk_itm_sno2_mng_typ"),
							S1_M1.sno3_mng_typ.as("chk_itm_sno3_mng_typ"),
							S1_M1.sno4_mng_typ.as("chk_itm_sno4_mng_typ"),
							S1_M1.ship_term_cd,
							S1_M1.lot_mng_typ,
							S1_M1.sublot_mng_typ,
							S1_M2.mfg_flg.as("chk_wg_mfg_flg"),
							S1_M2.lg_flg.as("chk_wg_lg_flg"),
							S1_M3.itm_cd.as("chk_itm_cd"),
							S1_M4.wg_cd.as("chk_strg_loc_wg_cd"),
							S1_M4.lg_grp_cd.as("chk_strg_loc_lg_grp_cd"),
							S1_M4.site_cd.as("chk_strg_loc_site_cd"),
							S1_M4.sppl_cd.as("strg_sppl_cd"),
							S1_M5.sppl_cd.as("mfg_sppl_cd"),
							S1_M5.maker_cd.as("mfg_maker_cd"),
							S1_M5.wg_cd.as("chk_mfg_loc_wg_cd"),
							S1_M5.lg_grp_cd.as("mfg_loc_lg_grp_cd"),
							S1_M6.wg_cd.as("chk_rqst_loc_wg_cd"),
							S1_M6.lg_grp_cd.as("chk_rqst_loc_lg_grp_cd"),
							cases()
								.when(S1_M1.ver_flg.eq(value(true)))
									.then(
										subQuery()
										.select(
											decode(
												countAll(),
												value(0),
												value(true),
												value(false)
											)
										)
										.from(S2_X1)
										.where(
											value(0).eq(value(0))
											.and(S2_X1.itm_cd.eq(S1_T1.itm_cd))
											.and(S2_X1.itm_sub1.eq(S1_T1.itm_sub1))
											.and(S2_X1.itm_sub2.eq(S1_T1.itm_sub2))
											.and(S2_X1.itm_sub3.eq(S1_T1.itm_sub3))
											.and(S2_X1.ver_no.eq(S1_T1.ver_no))
											.and(S2_X1.site_cd.eq(S1_M4.site_cd))
										)
								)
								.otherwise(value(false)).as("chk_valid_ver_no_flg"),
							decode(
								bind("mrp_typ"),
								value(MSC_MRP_TYP.PRCD.value()),
								S1_T21.wg_cd,
								S1_T2.wg_cd
							).as("chk_b_wg_cd"),
							decode(
								S1_M7.itm_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_not_fix_flg"),
							decode(
								S1_M8.itm_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_itm_stop_flg"),
							decode(
								S1_M8.itm_cd,
								nullValue(),
								value((MCDate) null),
								S1_M8.order_stop_dt
							).as("chk_order_stop_dt"),
							decode(
								S1_M9.bp_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_sppl_stop_flg"),
							decode(
								S1_M9.bp_cd,
								nullValue(),
								value((MCDate) null),
								S1_M9.order_stop_dt
							).as("chk_sppl_stop_dt"),
							decode(
								S1_T3.wg_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_sche_ord_flg"),
							decode(
								S1_T4.pr("oper_cnt"),
								value(1),
								value(false),
								value(true)
							).as("chk_dft_oper_flg"),
							S1_M1.itm_cd.as("m_itm_cd"),
							S1_M4.loc_cd.as("m_strg_loc_cd"),
							S1_M5.loc_cd.as("m_mfg_loc_cd"),
							S1_M6.loc_cd.as("m_rqst_loc_cd"),
							S1_M10.bp_cd.as("m_sppl_cd"),
							S1_M12.bp_cd.as("m_maker_cd")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_ord_no.eq(S1_T2.itm_ord_no))
									.and(
										bind("mrp_typ").isNull()
										.or(value(MSC_MRP_TYP.MRP.value()).eq(bind("mrp_typ")))
									)
								)
							)
							.leftOuterJoin(S1_T21).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_ord_no.eq(S1_T21.itm_ord_no))
									.and(value(MSC_MRP_TYP.PRCD.value()).eq(bind("mrp_typ")))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_cd.eq(S1_M1.itm_cd))
									.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.wg_cd.eq(S1_M2.wg_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_cd.eq(S1_M3.itm_cd))
									.and(S1_T1.itm_sub1.eq(S1_M3.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M3.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M3.itm_sub3))
									.and(S1_T1.bom_ptn.eq(S1_M3.bom_ptn))
									.and(S1_T1.mfg_loc_cd.eq(S1_M3.mfg_loc_cd))
									.and(S1_T1.sppl_cd.eq(S1_M3.sppl_cd))
									.and(S1_T1.maker_cd.eq(S1_M3.maker_cd))
									.and(S1_T1.rqst_loc_cd.eq(S1_M3.rqst_loc_cd))
									.and(S1_T1.wg_cd.eq(S1_M3.wg_cd))
									.and(S1_T1.master_dt.between(S1_M3.st_dt, S1_M3.end_dt))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M4.loc_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.mfg_loc_cd.eq(S1_M5.loc_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.rqst_loc_cd.eq(S1_M6.loc_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_cd.eq(S1_M7.itm_cd))
									.and(S1_T1.itm_sub1.eq(S1_M7.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M7.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M7.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M7.sno1))
									.and(S1_T1.sno2.eq(S1_M7.sno2))
									.and(S1_T1.sno3.eq(S1_M7.sno3))
									.and(S1_T1.sno4.eq(S1_M7.sno4))
									.and(S1_T1.wg_cd.eq(S1_M7.wg_cd))
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_cd.eq(S1_M8.itm_cd))
									.and(S1_T1.itm_sub1.eq(S1_M8.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M8.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M8.itm_sub3))
									.and(S1_T1.master_dt.gte(S1_M8.order_stop_dt))
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.sppl_cd.eq(S1_M9.bp_cd))
									.and(S1_T1.master_dt.gte(S1_M9.order_stop_dt))
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									value(0).eq(value(0))
									.and(
										cases()
											.when(
												S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value()))
											).then(
												S1_T1.sppl_cd
											).when(
												S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value()))
											).then(
												S1_M5.sppl_cd
											).otherwise(
												nullValue()
											)
										.eq(S1_M10.bp_cd)
									)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									value(0).eq(value(0))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T1.itm_ord_no.eq(S1_T3.itm_ord_no)
								)
							)
							.leftOuterJoin(
								subQuery()
								.select(
									S3_T1.itm_ord_no,
									count(S3_T1.oper_ord_no).as("oper_cnt")
								)
								.from(S3_T1)
								.where(
									value(0).eq(value(0))
								)
								.groupBy(S3_T1.itm_ord_no).view(S1_T4)
							).on(
								bracket(
									S1_T1.itm_ord_no.eq(S1_T4.pr(S3_T1.itm_ord_no))
								)
							)
							.leftOuterJoin(S1_M12).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.maker_cd.eq(S1_M12.bp_cd))
									.and(S1_M12.del_flg.eq(value(false)))
								)
							)
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.pr(S1_T1.itm_cd).eq(S0_M1.itm_cd))
								.and(S0_T.pr(S1_T1.itm_sub1).eq(S0_M1.itm_sub1))
								.and(S0_T.pr(S1_T1.itm_sub2).eq(S0_M1.itm_sub2))
								.and(S0_T.pr(S1_T1.itm_sub3).eq(S0_M1.itm_sub3))
								.and(S0_T.pr(S1_T1.sppl_cd).eq(S0_M1.sppl_cd))
								.and(S0_T.pr("chk_strg_loc_lg_grp_cd").eq(S0_M1.lg_grp_cd))
								.and(S0_T.pr(S1_T1.master_dt).gte(S0_M1.st_dt))
								.and(S0_T.pr(S1_T1.master_dt).lte(S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								value(0).eq(value(0))
								.and(
									nvl(
										S0_T.pr("mfg_loc_lg_grp_cd"),
										S0_T.pr("chk_rqst_loc_lg_grp_cd")
									).eq(S0_M2.fr_lg_grp_cd)
								)
								.and(S0_T.pr("chk_strg_loc_lg_grp_cd").eq(S0_M2.to_lg_grp_cd))
								.and(S0_T.pr(S1_M1.ship_term_cd).eq(S0_M2.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								value(0).eq(value(0))
								.and(
									nvl(
										S0_T.pr("mfg_loc_lg_grp_cd"),
										S0_T.pr("chk_rqst_loc_lg_grp_cd")
									).eq(S0_M3.fr_lg_grp_cd)
								)
								.and(S0_T.pr("chk_strg_loc_lg_grp_cd").eq(S0_M3.to_lg_grp_cd))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_M3.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.pr("mfg_sppl_cd").eq(S0_M4.bp_cd))
								.and(S0_T.pr(S1_T1.master_dt).gte(S0_M4.order_stop_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.pr("rqst_wg_cd").eq(S0_M5.wg_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S06
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S06() {
		MCTempView S0_T = createTempView("T");
		MAM_BP_STOP_R S0_M9 = MAM_BP_STOP_R.create("M9");
		MSW_ITM_ORDER_R S1_T1 = MSW_ITM_ORDER_R.create("T1");
		MST_ITM_ORDER_R S1_T2 = MST_ITM_ORDER_R.create("T2");
		MST_SCHE_ORD_EXEC_R S1_T3 = MST_SCHE_ORD_EXEC_R.create("T3");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_DTL_R S1_M2 = MAM_ITM_DTL_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_ITM_NOT_FIX_R S1_M6 = MAM_ITM_NOT_FIX_R.create("M6");
		MAM_ITM_STOP_R S1_M7 = MAM_ITM_STOP_R.create("M7");
		MAM_BP_STOP_R S1_M8 = MAM_BP_STOP_R.create("M8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S06")
					.mainQuery()
					.select(
						S0_T.pr(S1_T1.peg_no),
						S0_T.pr(S1_T1.itm_ord_no),
						S0_T.pr("b_itm_ord_sts_typ"),
						S0_T.pr(S1_T2.itm_ord_sts_typ),
						S0_T.pr(S1_T2.itm_ord_typ),
						S0_T.pr(S1_T2.ord_gnrt_typ),
						S0_T.pr(S1_T2.itm_cd),
						S0_T.pr(S1_T2.itm_sub1),
						S0_T.pr(S1_T2.itm_sub2),
						S0_T.pr(S1_T2.itm_sub3),
						S0_T.pr(S1_T2.ver_no),
						S0_T.pr(S1_T2.strg_loc_cd),
						S0_T.pr(S1_T2.mfg_loc_cd),
						S0_T.pr(S1_T2.mst_mfg_loc_cd),
						S0_T.pr(S1_T2.sppl_cd),
						S0_T.pr(S1_T2.maker_cd),
						S0_T.pr(S1_T2.rqst_loc_cd),
						S0_T.pr("rqst_wg_cd"),
						S0_T.pr(S1_T2.bom_ptn),
						S0_T.pr(S1_T2.oper_ptn),
						S0_T.pr(S1_T2.inst_qty),
						S0_T.pr(S1_T2.yield_schd_qty),
						S0_T.pr(S1_T2.nmr_qty),
						S0_T.pr(S1_T2.dnm_qty),
						S0_T.pr(S1_T2.fxd_yield_qty),
						S0_T.pr(S1_T2.po_schd_dt),
						S0_T.pr(S1_T2.purc_lt),
						S0_T.pr(S1_T2.mfg_st_schd_dt),
						S0_T.pr(S1_T2.mfg_end_schd_dt),
						S0_T.pr(S1_T2.mfg_lt),
						S0_T.pr(S1_T2.gi_schd_dt),
						S0_T.pr(S1_T2.strg_schd_dt),
						S0_T.pr(S1_T2.xfr_lt),
						S0_T.pr(S1_T2.accpt_schd_dt),
						S0_T.pr(S1_T2.accpt_insp_lt),
						S0_T.pr(S1_T2.insp_st_schd_dt),
						S0_T.pr(S1_T2.insp_end_schd_dt),
						S0_T.pr(S1_T2.insp_lt),
						S0_T.pr(S1_T2.insp_offst),
						S0_T.pr(S1_T2.avl_schd_dt),
						S0_T.pr(S1_T2.master_dt),
						S0_T.pr(S1_T2.sno1),
						S0_T.pr(S1_T2.sno_typ1),
						S0_T.pr(S1_T2.sno2),
						S0_T.pr(S1_T2.sno_typ2),
						S0_T.pr(S1_T2.sno3),
						S0_T.pr(S1_T2.sno_typ3),
						S0_T.pr(S1_T2.sno4),
						S0_T.pr(S1_T2.sno_typ4),
						S0_T.pr(S1_T2.lmt_dt),
						S0_T.pr(S1_T2.wg_cd),
						S0_T.pr(S1_T2.rqmt_no),
						S0_T.pr(S1_T2.inst_po_cnt_rmrks),
						S0_T.pr(S1_T2.sim_mrp_no),
						S0_T.pr(S1_T2.io_schd_pr_no),
						S0_T.pr(S1_M1.unit_cd),
						S0_T.pr("strg_lg_grp_cd"),
						S0_T.pr("strg_sppl_cd"),
						S0_T.pr("mfg_sppl_cd"),
						S0_T.pr("mfg_maker_cd"),
						S0_T.pr("rqst_lg_grp_cd"),
						S0_T.pr(S1_T2.not_fix_flg),
						S0_T.pr(S1_T2.for_scheduler_frozen_flg),
						S0_T.pr("chk_not_fix_flg"),
						S0_T.pr("chk_itm_stop_flg"),
						S0_T.pr("chk_order_stop_dt"),
						S0_T.pr("chk_sppl_stop_flg"),
						S0_T.pr("chk_sppl_stop_dt"),
						decode(
							S0_M9.bp_cd,
							nullValue(),
							value(false),
							value(true)
						).as("chk_mfg_sppl_stop_flg"),
						decode(
							S0_M9.bp_cd,
							nullValue(),
							value((MCDate) null),
							S0_M9.order_stop_dt
						).as("chk_mfg_sppl_stop_dt"),
						S0_T.pr("chk_sche_ord_flg"),
						S0_T.pr(S1_M1.lot_mng_typ),
						S0_T.pr(S1_M1.sublot_mng_typ),
						S0_T.pr("m_itm_cd")
					)
					.from(
						subQuery()
						.select(
							S1_T1.peg_no,
							S1_T1.itm_ord_no,
							S1_T2.itm_ord_sts_typ.as("b_itm_ord_sts_typ"),
							S1_T2.itm_ord_sts_typ,
							S1_T2.itm_ord_typ,
							S1_T2.ord_gnrt_typ,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.ver_no,
							S1_T2.strg_loc_cd,
							S1_T2.mfg_loc_cd,
							S1_T2.mst_mfg_loc_cd,
							S1_T2.sppl_cd,
							S1_T2.maker_cd,
							S1_T2.rqst_loc_cd,
							coalesce(
								S1_M5.wg_cd,
								S1_T2.rqst_wg_cd,
								S1_M2.rqst_wg_cd
							).as("rqst_wg_cd"),
							S1_T2.bom_ptn,
							S1_T2.oper_ptn,
							S1_T2.inst_qty,
							S1_T2.yield_schd_qty,
							S1_T2.nmr_qty,
							S1_T2.dnm_qty,
							S1_T2.fxd_yield_qty,
							S1_T2.po_schd_dt,
							S1_T2.purc_lt,
							S1_T2.mfg_st_schd_dt,
							S1_T2.mfg_end_schd_dt,
							S1_T2.mfg_lt,
							S1_T2.gi_schd_dt,
							S1_T2.strg_schd_dt,
							S1_T2.xfr_lt,
							S1_T2.accpt_schd_dt,
							S1_T2.accpt_insp_lt,
							S1_T2.insp_st_schd_dt,
							S1_T2.insp_end_schd_dt,
							S1_T2.insp_lt,
							S1_T2.insp_offst,
							S1_T2.avl_schd_dt,
							S1_T2.master_dt,
							S1_T2.sno1,
							S1_T2.sno_typ1,
							S1_T2.sno2,
							S1_T2.sno_typ2,
							S1_T2.sno3,
							S1_T2.sno_typ3,
							S1_T2.sno4,
							S1_T2.sno_typ4,
							S1_T2.lmt_dt,
							S1_T2.wg_cd,
							S1_T2.rqmt_no,
							S1_T2.inst_po_cnt_rmrks,
							S1_T2.sim_mrp_no,
							S1_T2.io_schd_pr_no,
							S1_M1.unit_cd,
							S1_M1.lot_mng_typ,
							S1_M1.sublot_mng_typ,
							S1_M3.lg_grp_cd.as("strg_lg_grp_cd"),
							S1_M3.sppl_cd.as("strg_sppl_cd"),
							S1_M4.sppl_cd.as("mfg_sppl_cd"),
							S1_M4.maker_cd.as("mfg_maker_cd"),
							S1_M5.lg_grp_cd.as("rqst_lg_grp_cd"),
							S1_T2.not_fix_flg,
							S1_T2.for_scheduler_frozen_flg,
							decode(
								S1_M6.itm_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_not_fix_flg"),
							decode(
								S1_M7.itm_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_itm_stop_flg"),
							decode(
								S1_M7.itm_cd,
								nullValue(),
								value((MCDate) null),
								S1_M7.order_stop_dt
							).as("chk_order_stop_dt"),
							decode(
								S1_M8.bp_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_sppl_stop_flg"),
							decode(
								S1_M8.bp_cd,
								nullValue(),
								value((MCDate) null),
								S1_M8.order_stop_dt
							).as("chk_sppl_stop_dt"),
							decode(
								S1_T3.wg_cd,
								nullValue(),
								value(false),
								value(true)
							).as("chk_sche_ord_flg"),
							S1_M1.itm_cd.as("m_itm_cd")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.itm_ord_no.eq(S1_T2.itm_ord_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T2.itm_ord_no.eq(S1_T3.itm_ord_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.itm_cd.eq(S1_M1.itm_cd))
									.and(S1_T2.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.itm_cd.eq(S1_M2.itm_cd))
									.and(S1_T2.itm_sub1.eq(S1_M2.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M2.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M2.itm_sub3))
									.and(S1_T2.bom_ptn.eq(S1_M2.bom_ptn))
									.and(S1_T2.mfg_loc_cd.eq(S1_M2.mfg_loc_cd))
									.and(S1_T2.sppl_cd.eq(S1_M2.sppl_cd))
									.and(S1_T2.maker_cd.eq(S1_M2.maker_cd))
									.and(S1_T2.rqst_loc_cd.eq(S1_M2.rqst_loc_cd))
									.and(S1_T2.wg_cd.eq(S1_M2.wg_cd))
									.and(S1_T2.master_dt.between(S1_M2.st_dt, S1_M2.end_dt))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T2.strg_loc_cd.eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.mfg_loc_cd.eq(S1_M4.loc_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T2.rqst_loc_cd.eq(S1_M5.loc_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.itm_cd.eq(S1_M6.itm_cd))
									.and(S1_T2.itm_sub1.eq(S1_M6.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M6.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M6.itm_sub3))
									.and(S1_T2.sno1.eq(S1_M6.sno1))
									.and(S1_T2.sno2.eq(S1_M6.sno2))
									.and(S1_T2.sno3.eq(S1_M6.sno3))
									.and(S1_T2.sno4.eq(S1_M6.sno4))
									.and(S1_T2.wg_cd.eq(S1_M6.wg_cd))
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.itm_cd.eq(S1_M7.itm_cd))
									.and(S1_T2.itm_sub1.eq(S1_M7.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M7.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M7.itm_sub3))
									.and(S1_T2.master_dt.gte(S1_M7.order_stop_dt))
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.sppl_cd.eq(S1_M8.bp_cd))
									.and(S1_T2.master_dt.gte(S1_M8.order_stop_dt))
								)
							)
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T)
						.leftOuterJoin(S0_M9).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.pr("mfg_sppl_cd").eq(S0_M9.bp_cd))
								.and(S0_T.pr(S1_T2.master_dt).gte(S0_M9.order_stop_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S07
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S07() {
		MSW_ITM_ORDER_R S0_T = MSW_ITM_ORDER_R.create("T");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S07")
					.mainQuery()
					.select(
						S0_T.peg_no,
						S0_T.itm_ord_typ,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.ver_no,
						S0_T.strg_loc_cd,
						S0_T.mfg_loc_cd,
						S0_T.sppl_cd,
						S0_T.maker_cd,
						S0_T.rqst_loc_cd,
						S0_T.rqst_wg_cd,
						S0_T.bom_ptn,
						S0_T.oper_ptn,
						S0_T.inst_qty,
						S0_T.yield_schd_qty,
						S0_T.nmr_qty,
						S0_T.dnm_qty,
						S0_T.fxd_yield_qty,
						S0_T.itm_ord_sts_typ,
						S0_T.po_schd_dt,
						S0_T.purc_lt,
						S0_T.mfg_st_schd_dt,
						S0_T.mfg_end_schd_dt,
						S0_T.mfg_lt,
						S0_T.gi_schd_dt,
						S0_T.strg_schd_dt,
						S0_T.accpt_schd_dt,
						S0_T.mrp_accpt_schd_dt,
						S0_T.accpt_insp_lt,
						S0_T.insp_st_schd_dt,
						S0_T.insp_end_schd_dt,
						S0_T.insp_lt,
						S0_T.insp_offst,
						S0_T.avl_schd_dt,
						S0_T.master_dt,
						S0_T.sno1,
						S0_T.sno_typ1,
						S0_T.sno2,
						S0_T.sno_typ2,
						S0_T.sno3,
						S0_T.sno_typ3,
						S0_T.sno4,
						S0_T.sno_typ4,
						S0_T.wg_cd,
						S0_T.ord_fix_pd,
						S0_T.rqmt_no,
						S0_M2.unit_cd,
						S0_M2.lot_mng_typ,
						S0_M2.sublot_mng_typ,
						S0_M2.itm_nm,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_unit_cd,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.cont_fctr_dec_place,
						S0_M2.std_cont_fctr,
						// this field is appended by sql coverter.
						S0_M2.itm_typ.as("join_itm_typ_"),
						// this field is appended by sql coverter.
						S0_M2.itm_typ_d_cd.as("join_itm_typ_d_cd_"),
						S0_T.itm_ord_no
					)
					.from(
						S0_T
						.leftOuterJoin(S0_M2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.itm_cd.eq(S0_M2.itm_cd))
								.and(S0_T.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("strg_sppl_cd", m.sppl_cd());
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("strg_site_cd", m.site_cd());
							r.setStringNE("strg_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("strg_alloc_grp_cd", m.alloc_grp_cd());
							r.setStringNE("strg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_site_cd", m.site_cd());
							r.setStringNE("rqst_loc_grp_cd", m.loc_grp_cd());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
							r.setStringNE("mfg_site_cd", m.site_cd());
							r.setStringNE("mfg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("rqst_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("join_itm_typ_"),
							r.getStringNE("join_itm_typ_d_cd_")
						))
						.addSelect(m -> toArray(
							m.itm_typ,
							m.itm_typ_d_cd,
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_U01
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_U01() {
		MSW_ITM_ORDER_R S0_T = MSW_ITM_ORDER_R.create("T");
		MAM_LOC_R S1_M1 = MAM_LOC_R.create("M1");
		MAM_LOC_R S2_M2 = MAM_LOC_R.create("M2");
		MAM_ITM_R S3_M3 = MAM_ITM_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_U01")
					.update(S0_T)
					.set(S0_T.wg_cd).eq(subQuery()
						.select(S1_M1.wg_cd)
						.from(S1_M1)
						.where(
							value(0).eq(value(0))
							.and(S1_M1.loc_cd.eq(S0_T.strg_loc_cd))
						)
					)
					.set(S0_T.rqst_wg_cd).eq(nvl(
							S0_T.rqst_wg_cd,
							bracket(
								subQuery()
								.select(S2_M2.wg_cd)
								.from(S2_M2)
								.where(
									value(0).eq(value(0))
									.and(S2_M2.loc_cd.eq(S0_T.rqst_loc_cd))
								)
							)
						)
					)
					.set(S0_T.dec_place).eq(subQuery()
						.select(S3_M3.dec_place)
						.from(S3_M3)
						.where(
							value(0).eq(value(0))
							.and(S3_M3.itm_cd.eq(S0_T.itm_cd))
							.and(S3_M3.itm_sub1.eq(S0_T.itm_sub1))
							.and(S3_M3.itm_sub2.eq(S0_T.itm_sub2))
							.and(S3_M3.itm_sub3.eq(S0_T.itm_sub3))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_U02
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_U02() {
		MSW_ITM_ORDER_R S0_T = MSW_ITM_ORDER_R.create("T");
		MAM_ITM_DTL_R S1_M1 = MAM_ITM_DTL_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_U02")
					.update(S0_T)
					.set(
						S0_T.oper_ptn,
						S0_T.ord_fix_pd,
						S0_T.nmr_qty,
						S0_T.dnm_qty,
						S0_T.fxd_yield_qty
					).eq(subQuery()
						.select(
							nvl(
								S1_M1.oper_ptn,
								value(MAC_STR.NULL_VAL.value())
							),
							S1_M1.ord_fix_pd,
							S1_M1.yield_schd_qty,
							S1_M1.mfg_inst_qty,
							S1_M1.fxd_rqmt_qty
						)
						.from(S1_M1)
						.where(
							value(0).eq(value(0))
							.and(S0_T.itm_cd.eq(S1_M1.itm_cd))
							.and(S0_T.itm_sub1.eq(S1_M1.itm_sub1))
							.and(S0_T.itm_sub2.eq(S1_M1.itm_sub2))
							.and(S0_T.itm_sub3.eq(S1_M1.itm_sub3))
							.and(S0_T.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
							.and(S0_T.sppl_cd.eq(S1_M1.sppl_cd))
							.and(S0_T.maker_cd.eq(S1_M1.maker_cd))
							.and(S0_T.rqst_loc_cd.eq(S1_M1.rqst_loc_cd))
							.and(S0_T.wg_cd.eq(S1_M1.wg_cd))
							.and(S0_T.bom_ptn.eq(S1_M1.bom_ptn))
							.and(S0_T.master_dt.gte(S1_M1.st_dt))
							.and(S0_T.master_dt.lte(S1_M1.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_U03
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_U03() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_U03")
					.update(S0_T1)
					.set(S0_T1.inst_qty).eq(nvl(
							S0_T1.inst_qty,
							MAPA_CALC$F_RND(
								bracket(
									S0_T1.yield_schd_qty.multiply(S0_T1.dnm_qty).divide(S0_T1.nmr_qty).add(
												nvl(
													S0_T1.fxd_yield_qty,
													value(0)
												)
											)
								),
								S0_T1.dec_place,
								value(MAC_RND_TYP.RNDUP.value())
							)
						)
					)
					.set(S0_T1.yield_schd_qty).eq(nvl(
							S0_T1.yield_schd_qty,
							MAPA_CALC$F_RND(
								bracket(
									S0_T1.inst_qty.subtract(
										nvl(
											S0_T1.fxd_yield_qty,
											value(0)
										)
									)
								).multiply(S0_T1.nmr_qty).divide(S0_T1.dnm_qty),
								S0_T1.dec_place,
								value(MAC_RND_TYP.CUTOFF.value())
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dnm_qty.isNotNull())
						.and(S0_T1.nmr_qty.isNotNull())
						.and(
							not(
								S0_T1.yield_schd_qty.isNull()
								.and(S0_T1.inst_qty.isNull())
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_U04
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_U04() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		MAM_ITM_R S1_M = MAM_ITM_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_U04")
					.update(S0_T1)
					.set(S0_T1.ver_no).eq(MSPA_ORD$F_GET_VER_NO1(
							S0_T1.itm_cd,
							S0_T1.itm_sub1,
							S0_T1.itm_sub2,
							S0_T1.itm_sub3,
							S0_T1.strg_loc_cd,
							S0_T1.strg_schd_dt
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ver_no.isNull())
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M)
								.where(
									value(0).eq(value(0))
									.and(S1_M.itm_cd.eq(S0_T1.itm_cd))
									.and(S1_M.itm_sub1.eq(S0_T1.itm_sub1))
									.and(S1_M.itm_sub2.eq(S0_T1.itm_sub2))
									.and(S1_M.itm_sub3.eq(S0_T1.itm_sub3))
									.and(S1_M.ver_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_U05
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_U05() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		MAM_ITM_OPER_R S1_M1 = MAM_ITM_OPER_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_U05")
					.update(S0_T1)
					.set(S0_T1.mst_mfg_loc_cd).eq(S0_T1.mfg_loc_cd)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.itm_cd.eq(S1_M1.itm_cd))
									.and(S0_T1.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S0_T1.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S0_T1.itm_sub3.eq(S1_M1.itm_sub3))
									.and(S0_T1.oper_ptn.eq(S1_M1.oper_ptn))
									.and(S0_T1.mfg_loc_cd.eq(S1_M1.loc_cd))
									.and(S1_M1.del_flg.eq(value(false)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_ITM_ORDER_Query_S08
	 */
	static MCQueryPlan MSBCL5010_MSW_ITM_ORDER_S08() {
		MSW_ITM_ORDER_R S0_T = MSW_ITM_ORDER_R.create("T");
		MAM_ITM_DTL_R S0_M1 = MAM_ITM_DTL_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_ITM_ORDER_Query_S08")
					.mainQuery()
					.selectDistinct(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.mfg_loc_cd,
						S0_T.sppl_cd,
						S0_T.maker_cd,
						S0_T.rqst_loc_cd,
						S0_T.wg_cd,
						S0_T.master_dt,
						S0_M1.prio,
						S0_M1.bom_ptn
					)
					.from(
						S0_T
						.innerJoin(S0_M1).on(
							bracket(
								S0_T.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_T.mfg_loc_cd.eq(S0_M1.mfg_loc_cd))
								.and(S0_T.sppl_cd.eq(S0_M1.sppl_cd))
								.and(S0_T.maker_cd.eq(S0_M1.maker_cd))
								.and(S0_T.rqst_loc_cd.eq(S0_M1.rqst_loc_cd))
								.and(S0_T.wg_cd.eq(S0_M1.wg_cd))
								.and(S0_T.master_dt.gte(S0_M1.st_dt))
								.and(S0_T.master_dt.lte(S0_M1.end_dt))
							)
						)
					)
					.where(
						S0_T.itm_ord_typ.in(
							value(MSC_ITM_ORD_TYP.OUTSRC.value()),
							value(MSC_ITM_ORD_TYP.MFG.value())
						)
						.and(
							S0_T.bom_ptn.isNull()
							.or(S0_T.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_OPER_ORDER_KEY_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MSW_OPER_ORDER_KEY_S01() {
		MSW_ITM_ORDER_KEY_R S0_T1 = MSW_ITM_ORDER_KEY_R.create("T1");
		MST_OPER_ORDER_R S0_T2 = MST_OPER_ORDER_R.create("T2");
		MST_OPER_INST_R S0_T5 = MST_OPER_INST_R.create("T5");
		MSVT_OPER_INST_PR_R S0_T6 = MSVT_OPER_INST_PR_R.create("T6");
		MST_OPER_ACT_R S0_T7 = MST_OPER_ACT_R.create("T7");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MST_ITM_ORDER_R S0_T8 = MST_ITM_ORDER_R.create("T8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_OPER_ORDER_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_ord_no,
						min(S0_T8.itm_ord_sts_typ).as("itm_ord_sts_typ"),
						min(S0_T2.oper_ord_sts_typ).as("oper_ord_sts_typ"),
						max(S0_T2.not_oper_schd_qty).as("not_oper_schd_qty"),
						min(S0_T6.mfg_sts_typ).as("mfg_sts_typ"),
						max(S0_T6.mfg_sts_typ).as("max_mfg_sts_typ"),
						min(S0_T5.st_schd_tm).as("inst_st_schd_tm"),
						min(S0_T7.st_act_tm).as("act_st_tm"),
						max(S0_T5.end_schd_tm).as("inst_end_schd_tm"),
						max(S0_T7.end_act_tm).as("act_end_tm"),
						max(S0_M1.cal_cd).as("mfg_cal_cd")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.oper_ord_no.eq(S0_T5.oper_ord_no)
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.oper_inst_no.eq(S0_T6.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.oper_inst_no.eq(S0_T7.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T8.itm_ord_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.oper_ptn.neq(value(MAC_STR.NULL_VAL.value())))
					)
					.groupBy(S0_T2.oper_ord_no)
			);
	}
	
	/**
	 * -- MSBCL5010_MSW_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5010_MSW_OPER_ORDER_S01() {
		MSW_ITM_ORDER_R S0_T1 = MSW_ITM_ORDER_R.create("T1");
		MSW_OPER_ORDER_R S0_T2 = MSW_OPER_ORDER_R.create("T2");
		MAM_ITM_OPER_R S0_M1 = MAM_ITM_OPER_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5010_MSW_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T2.peg_no,
						S0_T2.itm_ord_no,
						S0_T2.oper_ord_no,
						S0_T2.st_schd_tm,
						S0_T2.end_schd_tm,
						S0_T2.oper_lt,
						S0_T2.oper_offst_typ,
						S0_T2.oper_offst,
						S0_T2.oper_schd_qty,
						S0_T2.disp_seq,
						S0_T2.oper_ptn,
						S0_T2.oper_cd,
						S0_T2.oper_seq,
						S0_T2.loc_cd,
						S0_T2.oper_ord_sts_typ,
						S0_T2.itm_ord_sts_typ,
						S0_T2.wg_cd,
						S0_T2.yield_oper_flg,
						cases()
							.when(
								S0_T2.oper_cd.isNull()
								.or(S0_M1.oper_cd.isNull())
							)
								.then(value(true))
							.otherwise(value(false)).as("chk_oper_cd_seq_flg"),
						cases()
							.when(
								S0_T1.mfg_loc_cd.neq(S0_T2.loc_cd)
								.or(S0_T2.loc_cd.neq(S0_M1.oper_loc_cd))
							)
								.then(value(true))
							.otherwise(value(false)).as("chk_oper_loc_cd_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.peg_no.eq(S0_T2.peg_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M1.loc_cd))
								.and(S0_T1.oper_ptn.eq(S0_M1.oper_ptn))
								.and(S0_T2.oper_cd.eq(S0_M1.oper_cd))
								.and(S0_T2.oper_seq.eq(S0_M1.oper_seq))
								.and(S0_T2.loc_cd.eq(S0_M1.loc_cd))
								.and(S0_T2.st_schd_tm.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							MSC_ITM_ORD_TYP$IS_OUTSRC(S0_T1.itm_ord_typ).eq(value(true))
							.or(MSC_ITM_ORD_TYP$IS_MFG(S0_T1.itm_ord_typ).eq(value(true)))
						)
					)
			);
	}
}