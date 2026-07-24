package mcframe.serverMSBC.MSBCL0160;

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
	 * -- MABCL0160_MST_ITM_ORDER_Query_I01
	 */
	static MCQueryPlan MABCL0160_MST_ITM_ORDER_I01() {
		MST_ITM_ORDER_R S0 = MST_ITM_ORDER_R.create();
		MST_SIM_ITM_ORDER_R S1_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL0160_MST_ITM_ORDER_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_ord_no,
						S0.itm_ord_typ,
						S0.ord_gnrt_typ,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.ver_no,
						S0.strg_loc_cd,
						S0.mfg_loc_cd,
						S0.sppl_cd,
						S0.maker_cd,
						S0.rqst_loc_cd,
						S0.rqst_wg_cd,
						S0.bom_ptn,
						S0.oper_ptn,
						S0.inst_qty,
						S0.yield_schd_qty,
						S0.not_inst_qty,
						S0.mfg_inst_unit_typ,
						S0.inst_yield_schd_qty,
						S0.yield_act_qty,
						S0.purc_act_qty,
						S0.insp_act_qty,
						S0.nmr_qty,
						S0.dnm_qty,
						S0.fxd_yield_qty,
						S0.itm_ord_sts_typ,
						S0.fix_dt,
						S0.blk_flg,
						S0.po_schd_dt,
						S0.mrp_po_schd_dt,
						S0.po_dt,
						S0.mrp_purc_lt,
						S0.purc_lt,
						S0.act_purc_lt,
						S0.mfg_st_schd_dt,
						S0.mrp_mfg_st_schd_dt,
						S0.inst_mfg_st_schd_dt,
						S0.mfg_st_act_dt,
						S0.mfg_end_schd_dt,
						S0.mrp_mfg_end_schd_dt,
						S0.inst_mfg_end_schd_dt,
						S0.mfg_end_act_dt,
						S0.mrp_mfg_lt,
						S0.mfg_lt,
						S0.act_mfg_lt,
						S0.gi_schd_dt,
						S0.mrp_gi_schd_dt,
						S0.inst_gi_schd_dt,
						S0.gi_act_dt,
						S0.strg_schd_dt,
						S0.mrp_strg_schd_dt,
						S0.inst_strg_schd_dt,
						S0.strg_act_dt,
						S0.xfr_lt,
						S0.accpt_schd_dt,
						S0.mrp_accpt_schd_dt,
						S0.inst_accpt_schd_dt,
						S0.accpt_act_dt,
						S0.accpt_insp_lt,
						S0.insp_st_schd_dt,
						S0.mrp_insp_st_schd_dt,
						S0.inst_insp_st_schd_dt,
						S0.insp_st_act_dt,
						S0.insp_end_schd_dt,
						S0.mrp_insp_end_schd_dt,
						S0.inst_insp_end_schd_dt,
						S0.insp_end_act_dt,
						S0.insp_lt,
						S0.insp_offst,
						S0.mrp_avl_schd_dt,
						S0.avl_schd_dt,
						S0.master_dt,
						S0.sno1,
						S0.sno_typ1,
						S0.sno2,
						S0.sno_typ2,
						S0.sno3,
						S0.sno_typ3,
						S0.sno4,
						S0.sno_typ4,
						S0.lmt_dt,
						S0.wg_cd,
						S0.not_fix_flg,
						S0.ord_fix_pd,
						S0.rqmt_no,
						S0.inst_po_cnt_rmrks,
						S0.sim_mrp_no,
						S0.io_schd_pr_no,
						S0.intr_rmrks,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3
					)
					.query(
						subQuery()
						.select(
							S1_T1.itm_ord_no,
							S1_T1.itm_ord_typ,
							S1_T1.ord_gnrt_typ,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.ver_no,
							S1_T1.strg_loc_cd,
							S1_T1.mfg_loc_cd,
							S1_T1.sppl_cd,
							S1_T1.maker_cd,
							S1_T1.rqst_loc_cd,
							S1_T1.rqst_wg_cd,
							S1_T1.bom_ptn,
							S1_T1.oper_ptn,
							S1_T1.inst_qty,
							S1_T1.yield_schd_qty,
							S1_T1.not_inst_qty,
							S1_T1.mfg_inst_unit_typ,
							S1_T1.inst_yield_schd_qty,
							S1_T1.yield_act_qty,
							S1_T1.purc_act_qty,
							S1_T1.insp_act_qty,
							S1_T1.nmr_qty,
							S1_T1.dnm_qty,
							S1_T1.fxd_yield_qty,
							value(MSC_ITM_ORD_STS_TYP.SAV.value()),
							S1_T1.fix_dt,
							S1_T1.blk_flg,
							S1_T1.po_schd_dt,
							S1_T1.mrp_po_schd_dt,
							S1_T1.po_dt,
							S1_T1.mrp_purc_lt,
							S1_T1.purc_lt,
							S1_T1.act_purc_lt,
							S1_T1.mfg_st_schd_dt,
							S1_T1.mrp_mfg_st_schd_dt,
							S1_T1.inst_mfg_st_schd_dt,
							S1_T1.mfg_st_act_dt,
							S1_T1.mfg_end_schd_dt,
							S1_T1.mrp_mfg_end_schd_dt,
							S1_T1.inst_mfg_end_schd_dt,
							S1_T1.mfg_end_act_dt,
							S1_T1.mrp_mfg_lt,
							S1_T1.mfg_lt,
							S1_T1.act_mfg_lt,
							S1_T1.gi_schd_dt,
							S1_T1.mrp_gi_schd_dt,
							S1_T1.inst_gi_schd_dt,
							S1_T1.gi_act_dt,
							S1_T1.strg_schd_dt,
							S1_T1.mrp_strg_schd_dt,
							S1_T1.inst_strg_schd_dt,
							S1_T1.strg_act_dt,
							S1_T1.xfr_lt,
							S1_T1.accpt_schd_dt,
							S1_T1.mrp_accpt_schd_dt,
							S1_T1.inst_accpt_schd_dt,
							S1_T1.accpt_act_dt,
							S1_T1.accpt_insp_lt,
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
							S1_T1.ord_fix_pd,
							S1_T1.rqmt_no,
							S1_T1.inst_po_cnt_rmrks,
							S1_T1.sim_mrp_no,
							S1_T1.io_schd_pr_no,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_ord_no.eq(bind("itm_ord_no")))
						)
					)
			);
	}
	
	/**
	 * -- MABCL0160_MST_OPER_ORDER_Query_I01
	 */
	static MCQueryPlan MABCL0160_MST_OPER_ORDER_I01() {
		MST_OPER_ORDER_R S0 = MST_OPER_ORDER_R.create();
		MST_SIM_OPER_ORDER_R S1_T1 = MST_SIM_OPER_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL0160_MST_OPER_ORDER_Query_I01")
					.insert(S0)
					.columns(
						S0.oper_ord_no,
						S0.st_schd_tm,
						S0.inst_st_schd_tm,
						S0.act_st_tm,
						S0.end_schd_tm,
						S0.inst_end_schd_tm,
						S0.act_end_tm,
						S0.oper_lt,
						S0.act_oper_lt,
						S0.oper_offst_typ,
						S0.oper_offst,
						S0.oper_schd_qty,
						S0.not_oper_schd_qty,
						S0.itm_ord_no,
						S0.disp_seq,
						S0.oper_ptn,
						S0.oper_cd,
						S0.oper_seq,
						S0.loc_cd,
						S0.oper_ord_sts_typ,
						S0.itm_ord_sts_typ,
						S0.wg_cd,
						S0.yield_oper_flg,
						S0.sim_mrp_no,
						S0.intr_rmrks,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3
					)
					.query(
						subQuery()
						.select(
							S1_T1.oper_ord_no,
							S1_T1.st_schd_tm,
							S1_T1.inst_st_schd_tm,
							S1_T1.act_st_tm,
							S1_T1.end_schd_tm,
							S1_T1.inst_end_schd_tm,
							S1_T1.act_end_tm,
							S1_T1.oper_lt,
							S1_T1.act_oper_lt,
							S1_T1.oper_offst_typ,
							S1_T1.oper_offst,
							S1_T1.oper_schd_qty,
							S1_T1.not_oper_schd_qty,
							S1_T1.itm_ord_no,
							S1_T1.disp_seq,
							S1_T1.oper_ptn,
							S1_T1.oper_cd,
							S1_T1.oper_seq,
							S1_T1.loc_cd,
							value(MSC_OPER_ORD_STS_TYP.SAV.value()),
							value(MSC_ITM_ORD_STS_TYP.SAV.value()),
							S1_T1.wg_cd,
							S1_T1.yield_oper_flg,
							S1_T1.sim_mrp_no,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_ord_no.eq(bind("itm_ord_no")))
						)
					)
			);
	}
	
	/**
	 * -- MABCL0160_MST_ORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MABCL0160_MST_ORD_IO_SCHD_I01() {
		MST_ORD_IO_SCHD_R S0 = MST_ORD_IO_SCHD_R.create();
		MST_SIM_IO_SCHD_R S1_T1 = MST_SIM_IO_SCHD_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL0160_MST_ORD_IO_SCHD_Query_I01")
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
							S1_T1.slip_schd_no,
							S1_T1.io_schd_typ,
							S1_T1.io_typ,
							value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()),
							S1_T1.io_schd_no,
							S1_T1.io_schd_seq,
							S1_T1.io_schd_sub_typ1,
							S1_T1.io_schd_sub_no1,
							S1_T1.io_schd_sub_seq1,
							S1_T1.io_schd_sub_typ2,
							S1_T1.io_schd_sub_no2,
							S1_T1.io_schd_sub_seq2,
							S1_T1.io_schd_sub_typ3,
							S1_T1.io_schd_sub_no3,
							S1_T1.io_schd_sub_seq3,
							S1_T1.io_schd_sub_typ4,
							S1_T1.io_schd_sub_no4,
							S1_T1.io_schd_sub_seq4,
							S1_T1.io_schd_pr_no,
							S1_T1.schd_dt,
							S1_T1.accpt_schd_dt,
							S1_T1.avl_schd_dt,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.ver_no,
							S1_T1.alt_grp_cd,
							S1_T1.alt_grp_seq,
							S1_T1.oper_inst_no,
							S1_T1.oper_ord_no,
							S1_T1.alt_qty,
							S1_T1.alt_itm_typ,
							S1_T1.alt_itm_ratio,
							S1_T1.alt_alloc_prio,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno1_null_flg,
							S1_T1.sno2,
							S1_T1.sno2_null_flg,
							S1_T1.sno3,
							S1_T1.sno3_null_flg,
							S1_T1.sno4,
							S1_T1.sno4_null_flg,
							S1_T1.pack_unit_cd,
							S1_T1.pack_unit_qty,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_qty,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.asst_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							S1_T1.alloc_tgt_flg,
							S1_T1.alloc_scope_typ,
							S1_T1.alloc_flg,
							S1_T1.alloc_wait_flg,
							S1_T1.wg_cd,
							S1_T1.sppl_cd,
							S1_T1.vld_dt_fr,
							S1_T1.vld_dt_to,
							S1_T1.inpt_ctl_typ,
							S1_T1.gi_loc_cd,
							S1_T1.gr_loc_cd,
							S1_T1.org_wg_cd,
							S1_T1.sim_mrp_no,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.sub_char4,
							S1_T1.sub_char5,
							S1_T1.sub_num1,
							S1_T1.sub_num2,
							S1_T1.sub_num3,
							S1_T1.sub_dt1,
							S1_T1.sub_dt2,
							S1_T1.sub_dt3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.io_schd_pr_no.eq(bind("itm_ord_no")))
							.and(S1_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
						)
					)
			);
	}
	
	/**
	 * -- MABCL0160_MST_SAVORD_IO_SCHD_Query_I01
	 */
	static MCQueryPlan MABCL0160_MST_SAVORD_IO_SCHD_I01() {
		MST_SAVORD_IO_SCHD_R S0 = MST_SAVORD_IO_SCHD_R.create();
		MST_SIM_IO_SCHD_R S1_T1 = MST_SIM_IO_SCHD_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL0160_MST_SAVORD_IO_SCHD_Query_I01")
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
							S1_T1.slip_schd_no,
							S1_T1.io_schd_typ,
							S1_T1.io_typ,
							value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()),
							S1_T1.io_schd_no,
							S1_T1.io_schd_seq,
							S1_T1.io_schd_sub_typ1,
							S1_T1.io_schd_sub_no1,
							S1_T1.io_schd_sub_seq1,
							S1_T1.io_schd_sub_typ2,
							S1_T1.io_schd_sub_no2,
							S1_T1.io_schd_sub_seq2,
							S1_T1.io_schd_sub_typ3,
							S1_T1.io_schd_sub_no3,
							S1_T1.io_schd_sub_seq3,
							S1_T1.io_schd_sub_typ4,
							S1_T1.io_schd_sub_no4,
							S1_T1.io_schd_sub_seq4,
							S1_T1.io_schd_pr_no,
							S1_T1.schd_dt,
							S1_T1.accpt_schd_dt,
							S1_T1.avl_schd_dt,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.ver_no,
							S1_T1.alt_grp_cd,
							S1_T1.alt_grp_seq,
							S1_T1.oper_inst_no,
							S1_T1.oper_ord_no,
							S1_T1.alt_qty,
							S1_T1.alt_itm_typ,
							S1_T1.alt_itm_ratio,
							S1_T1.alt_alloc_prio,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno1_null_flg,
							S1_T1.sno2,
							S1_T1.sno2_null_flg,
							S1_T1.sno3,
							S1_T1.sno3_null_flg,
							S1_T1.sno4,
							S1_T1.sno4_null_flg,
							S1_T1.pack_unit_cd,
							S1_T1.pack_unit_qty,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_qty,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.asst_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							S1_T1.alloc_tgt_flg,
							S1_T1.alloc_scope_typ,
							S1_T1.alloc_flg,
							S1_T1.alloc_wait_flg,
							S1_T1.wg_cd,
							S1_T1.sppl_cd,
							S1_T1.vld_dt_fr,
							S1_T1.vld_dt_to,
							S1_T1.inpt_ctl_typ,
							S1_T1.gi_loc_cd,
							S1_T1.gr_loc_cd,
							S1_T1.org_wg_cd,
							S1_T1.sim_mrp_no,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.sub_char4,
							S1_T1.sub_char5,
							S1_T1.sub_num1,
							S1_T1.sub_num2,
							S1_T1.sub_num3,
							S1_T1.sub_dt1,
							S1_T1.sub_dt2,
							S1_T1.sub_dt3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.io_schd_pr_no.eq(bind("itm_ord_no")))
							.and(S1_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL0160_MST_SIM_IO_SCHD_Query_U01
	 */
	static MCQueryPlan MSBCL0160_MST_SIM_IO_SCHD_U01() {
		MST_SIM_IO_SCHD_R S0_T = MST_SIM_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0160_MST_SIM_IO_SCHD_Query_U01")
					.update(S0_T)
					.set(S0_T.io_schd_sts_typ).eq(value(MSC_IO_SCHD_STS_TYP.FIX.value()))
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_pr_no.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL0160_MST_SIM_IO_SCHD_Query_U02
	 */
	static MCQueryPlan MSBCL0160_MST_SIM_IO_SCHD_U02() {
		MST_SIM_IO_SCHD_R S0_T = MST_SIM_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0160_MST_SIM_IO_SCHD_Query_U02")
					.update(S0_T)
					.set(S0_T.io_schd_sts_typ).eq(value(MSC_IO_SCHD_STS_TYP.OPN.value()))
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_pr_no.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL0160_MST_SIM_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0160_MST_SIM_ITM_ORDER_S01() {
		MCTempView S0_T = createTempView("T");
		MST_SIM_MRP_R S0_T4 = MST_SIM_MRP_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_ITM_TYP_D_R S0_M19 = MAM_ITM_TYP_D_R.create("M19");
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
		MST_SIM_ITM_ORDER_R S1_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		MST_ITM_ORDER_R S1_T3 = MST_ITM_ORDER_R.create("T3");
		MSVT_WRK_SNO_R S1_T2 = MSVT_WRK_SNO_R.create("T2");
		MAVM_RD_LOC_R S1_M = MAVM_RD_LOC_R.create("M");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_SITE_R S1_M5 = MAM_SITE_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S1_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S1_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_LOC_R S1_M9 = MAM_LOC_R.create("M9");
		MAM_SITE_R S1_M10 = MAM_SITE_R.create("M10");
		MAM_LOC_GRP_R S1_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S1_M13 = MAM_BP_R.create("M13");
		MAM_LOC_R S1_M14 = MAM_LOC_R.create("M14");
		MAM_SITE_R S1_M15 = MAM_SITE_R.create("M15");
		MAM_LOC_GRP_R S1_M16 = MAM_LOC_GRP_R.create("M16");
		MAM_WG_R S1_M17 = MAM_WG_R.create("M17");
		MAM_WG_R S1_M18 = MAM_WG_R.create("M18");
		MAM_ITM_NOT_FIX_R S1_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0160_MST_SIM_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T.pr(S1_T1.itm_ord_no),
						S0_T.pr(S1_T1.itm_ord_typ),
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						nvl(
							S0_M20.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T.pr(S1_T1.ver_no),
						S0_T.pr(S1_T1.inst_qty),
						S0_T.pr(S1_T1.yield_schd_qty),
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_T.pr(S1_T1.oper_ptn),
						S0_T.pr(S1_T1.bom_ptn),
						S0_T.pr(S1_T1.nmr_qty),
						S0_T.pr(S1_T1.dnm_qty),
						S0_T.pr(S1_T1.fxd_yield_qty),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T.pr(S1_T1.master_dt),
						S0_T.pr(S1_T1.po_schd_dt),
						S0_T.pr(S1_T1.purc_lt),
						S0_T.pr(S1_T1.mfg_st_schd_dt),
						S0_T.pr(S1_T1.mfg_lt),
						S0_T.pr(S1_T1.mfg_end_schd_dt),
						S0_T.pr(S1_T1.gi_schd_dt),
						S0_T.pr(S1_T1.xfr_lt),
						S0_T.pr(S1_T1.strg_schd_dt),
						S0_T.pr(S1_T1.accpt_insp_lt),
						S0_T.pr(S1_T1.accpt_schd_dt),
						S0_T.pr(S1_T1.insp_st_schd_dt),
						S0_T.pr(S1_T1.insp_lt),
						S0_T.pr(S1_T1.insp_offst),
						S0_T.pr(S1_T1.insp_end_schd_dt),
						S0_T.pr(S1_T1.avl_schd_dt),
						S0_T.pr("strg_site_cd"),
						S0_T.pr("strg_site_nm"),
						S0_T.pr("strg_loc_grp_cd"),
						S0_T.pr("strg_loc_grp_nm"),
						S0_T.pr(S1_T1.strg_loc_cd),
						S0_T.pr("strg_loc_nm"),
						S0_T.pr("strg_lg_grp_cd"),
						S0_T.pr("strg_lg_grp_nm"),
						S0_T.pr("strg_alloc_grp_cd"),
						S0_T.pr("strg_alloc_grp_nm"),
						S0_T.pr("mfg_site_cd"),
						S0_T.pr("mfg_site_nm"),
						S0_T.pr("mfg_loc_grp_cd"),
						S0_T.pr("mfg_loc_grp_nm"),
						S0_T.pr(S1_T1.mfg_loc_cd),
						S0_T.pr("mfg_loc_nm"),
						S0_T.pr(S1_T1.sppl_cd),
						S0_T.pr("sppl_nm"),
						S0_T.pr(S1_T1.maker_cd),
						S0_T.pr("maker_nm"),
						S0_T.pr("rqst_site_cd"),
						S0_T.pr("rqst_site_nm"),
						S0_T.pr("rqst_loc_grp_cd"),
						S0_T.pr("rqst_loc_grp_nm"),
						S0_T.pr(S1_T1.rqst_loc_cd),
						S0_T.pr("rqst_loc_nm"),
						S0_T.pr(S1_T1.rqst_wg_cd),
						S0_T.pr("rqst_wg_nm"),
						S0_T.pr(S1_T1.rqmt_no),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr(S1_T2.wrk_no),
						S0_T.pr(S1_T2.wrk_nm),
						S0_T.pr(S1_T1.ord_gnrt_typ),
						S0_T.pr(S1_T1.sim_mrp_no),
						S0_T.pr(S1_T1.io_schd_pr_no),
						S0_T.pr(S1_T1.wg_cd),
						S0_T.pr(S1_M17.wg_nm),
						S0_T.pr("not_fix_flg"),
						S0_T.pr(S1_T1.intr_rmrks),
						S0_T.pr(S1_T1.sub_char1),
						S0_T.pr(S1_T1.sub_char2),
						S0_T.pr(S1_T1.sub_char3),
						S0_T.pr(S1_T1.ins_usr_id),
						S0_T.pr(S1_T1.ins_usr_nm),
						S0_T.pr(S1_T1.ins_func_id),
						S0_T.pr(S1_T1.ins_ts),
						S0_T.pr("itm_ord_upd_cntr"),
						S0_T.pr(S1_T1.upd_usr_id),
						S0_T.pr(S1_T1.upd_usr_nm),
						S0_T.pr(S1_T1.upd_func_id),
						S0_T.pr(S1_T1.upd_ts),
						S0_T.pr(S1_T1.upd_srv_req_no),
						S0_T.pr("exp_flg"),
						S0_T.pr("fix_flg"),
						S0_T4.upd_cntr.as("sim_mrp_upd_cntr"),
						decode(
							S0_T4.sim_mrp_typ,
							value(MSC_SIM_MRP_TYP.GP_SIM.value()),
							value(true),
							value(false)
						).as("can_exp_flg"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_ord_no,
							S1_T1.itm_ord_typ,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.ver_no,
							S1_T1.inst_qty,
							S1_T1.yield_schd_qty,
							S1_T1.oper_ptn,
							S1_T1.bom_ptn,
							S1_T1.nmr_qty,
							S1_T1.dnm_qty,
							S1_T1.fxd_yield_qty,
							S1_T1.master_dt,
							S1_T1.po_schd_dt,
							S1_T1.purc_lt,
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_lt,
							S1_T1.mfg_end_schd_dt,
							S1_T1.gi_schd_dt,
							S1_T1.xfr_lt,
							S1_T1.strg_schd_dt,
							S1_T1.accpt_insp_lt,
							S1_T1.accpt_schd_dt,
							S1_T1.insp_st_schd_dt,
							S1_T1.insp_lt,
							S1_T1.insp_offst,
							S1_T1.insp_end_schd_dt,
							S1_T1.avl_schd_dt,
							S1_T1.strg_loc_cd,
							S1_M4.loc_nm.as("strg_loc_nm"),
							S1_M4.site_cd.as("strg_site_cd"),
							S1_M5.site_nm.as("strg_site_nm"),
							S1_T1.wg_cd,
							S1_M17.wg_nm,
							S1_M4.lg_grp_cd.as("strg_lg_grp_cd"),
							S1_M6.lg_grp_nm.as("strg_lg_grp_nm"),
							S1_M4.alloc_grp_cd.as("strg_alloc_grp_cd"),
							S1_M7.alloc_grp_nm.as("strg_alloc_grp_nm"),
							S1_M4.loc_grp_cd.as("strg_loc_grp_cd"),
							S1_M8.loc_grp_nm.as("strg_loc_grp_nm"),
							S1_T1.mfg_loc_cd,
							S1_M9.loc_nm.as("mfg_loc_nm"),
							S1_M9.site_cd.as("mfg_site_cd"),
							S1_M10.site_nm.as("mfg_site_nm"),
							S1_M9.loc_grp_cd.as("mfg_loc_grp_cd"),
							S1_M11.loc_grp_nm.as("mfg_loc_grp_nm"),
							S1_T1.sppl_cd,
							S1_M12.bp_nm.as("sppl_nm"),
							S1_T1.maker_cd,
							S1_M13.bp_nm.as("maker_nm"),
							S1_T1.rqst_loc_cd,
							S1_M14.loc_nm.as("rqst_loc_nm"),
							S1_M14.site_cd.as("rqst_site_cd"),
							S1_M15.site_nm.as("rqst_site_nm"),
							S1_T1.rqst_wg_cd,
							S1_M18.wg_nm.as("rqst_wg_nm"),
							S1_M14.loc_grp_cd.as("rqst_loc_grp_cd"),
							S1_M16.loc_grp_nm.as("rqst_loc_grp_nm"),
							S1_T1.rqmt_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T2.wrk_no,
							S1_T2.wrk_nm,
							S1_T1.ord_gnrt_typ,
							S1_T1.sim_mrp_no,
							S1_T1.io_schd_pr_no,
							decode(
								S1_M20.itm_cd,
								nullValue(),
								S1_T1.not_fix_flg,
								value(true)
							).as("not_fix_flg"),
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							S1_T1.ins_ts,
							S1_T1.upd_cntr.as("itm_ord_upd_cntr"),
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							decode(
								S1_T1.exp_dt,
								nullValue(),
								value(false),
								value(true)
							).as("exp_flg"),
							decode(
								S1_T3.itm_ord_sts_typ,
								nullValue(),
								value(false),
								value(MSC_ITM_ORD_STS_TYP.OPN.value()),
								value(false),
								value(MSC_ITM_ORD_STS_TYP.SAV.value()),
								value(false),
								value(true)
							).as("fix_flg")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T1.itm_ord_no.eq(S1_T3.itm_ord_no)
								)
							)
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.sno1.eq(S1_T1.sno1)
								)
							)
							.innerJoin(S1_M).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M4.loc_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M4.site_cd.eq(S1_M5.site_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M4.lg_grp_cd.eq(S1_M6.lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_M4.alloc_grp_cd.eq(S1_M7.alloc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_M4.loc_grp_cd.eq(S1_M8.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T1.mfg_loc_cd.eq(S1_M9.loc_cd)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_M9.site_cd.eq(S1_M10.site_cd)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									S1_M9.loc_grp_cd.eq(S1_M11.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M12).on(
								bracket(
									S1_T1.sppl_cd.eq(S1_M12.bp_cd)
								)
							)
							.leftOuterJoin(S1_M13).on(
								bracket(
									S1_T1.maker_cd.eq(S1_M13.bp_cd)
								)
							)
							.leftOuterJoin(S1_M14).on(
								bracket(
									S1_T1.rqst_loc_cd.eq(S1_M14.loc_cd)
								)
							)
							.leftOuterJoin(S1_M15).on(
								bracket(
									S1_M14.site_cd.eq(S1_M15.site_cd)
								)
							)
							.leftOuterJoin(S1_M16).on(
								bracket(
									S1_M14.loc_grp_cd.eq(S1_M16.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M17).on(
								bracket(
									S1_T1.wg_cd.eq(S1_M17.wg_cd)
								)
							)
							.leftOuterJoin(S1_M18).on(
								bracket(
									S1_T1.rqst_wg_cd.eq(S1_M18.wg_cd)
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.itm_cd.eq(S1_M20.itm_cd))
									.and(S1_T1.itm_sub1.eq(S1_M20.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M20.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M20.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M20.sno1))
									.and(S1_T1.sno2.eq(S1_M20.sno2))
									.and(S1_T1.sno3.eq(S1_M20.sno3))
									.and(S1_T1.sno4.eq(S1_M20.sno4))
									.and(S1_T1.wg_cd.eq(S1_M20.wg_cd))
									.and(S1_M20.del_flg.eq(value(false)))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.itm_ord_typ.in(
									bind("wk_mfg"),
									bind("wk_purc"),
									bind("wk_outsrc"),
									bind("wk_xfr"),
									bind("wk_wg_xfr")
								)
							)
							.cutoff$and(S1_T1.po_schd_dt.gte(bind("po_schd_dt_fr")))
							.cutoff$and(S1_T1.po_schd_dt.lte(bind("po_schd_dt_to")))
							.cutoff$and(S1_T1.mfg_st_schd_dt.gte(bind("mfg_st_schd_dt_fr")))
							.cutoff$and(S1_T1.mfg_st_schd_dt.lte(bind("mfg_st_schd_dt_to")))
							.cutoff$and(S1_T1.mfg_end_schd_dt.gte(bind("mfg_end_schd_dt_fr")))
							.cutoff$and(S1_T1.mfg_end_schd_dt.lte(bind("mfg_end_schd_dt_to")))
							.cutoff$and(S1_T1.gi_schd_dt.gte(bind("gi_schd_dt_fr")))
							.cutoff$and(S1_T1.gi_schd_dt.lte(bind("gi_schd_dt_to")))
							.cutoff$and(S1_T1.strg_schd_dt.gte(bind("strg_schd_dt_fr")))
							.cutoff$and(S1_T1.strg_schd_dt.lte(bind("strg_schd_dt_to")))
							.cutoff$and(S1_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
							.cutoff$and(S1_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
							.cutoff$and(S1_T1.insp_st_schd_dt.gte(bind("insp_st_schd_dt_fr")))
							.cutoff$and(S1_T1.insp_st_schd_dt.lte(bind("insp_st_schd_dt_to")))
							.cutoff$and(S1_T1.insp_end_schd_dt.gte(bind("insp_end_schd_dt_fr")))
							.cutoff$and(S1_T1.insp_end_schd_dt.lte(bind("insp_end_schd_dt_to")))
							.cutoff$and(S1_T1.avl_schd_dt.gte(bind("avl_schd_dt_fr")))
							.cutoff$and(S1_T1.avl_schd_dt.lte(bind("avl_schd_dt_to")))
							.cutoff$and(S1_T1.strg_loc_cd.like(bind("strg_loc_cd")))
							.cutoff$and(S1_M4.loc_nm.like(bind("strg_loc_nm")))
							.cutoff$and(S1_M4.site_cd.like(bind("strg_site_cd")))
							.cutoff$and(S1_M5.site_nm.like(bind("strg_site_nm")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M17.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M4.lg_grp_cd.like(bind("strg_lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("strg_lg_grp_nm")))
							.cutoff$and(S1_M4.alloc_grp_cd.like(bind("strg_alloc_grp_cd")))
							.cutoff$and(S1_M7.alloc_grp_nm.like(bind("strg_alloc_grp_nm")))
							.cutoff$and(S1_M4.loc_grp_cd.like(bind("strg_loc_grp_cd")))
							.cutoff$and(S1_M8.loc_grp_nm.like(bind("strg_loc_grp_nm")))
							.cutoff$and(S1_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
							.cutoff$and(S1_M9.loc_nm.like(bind("mfg_loc_nm")))
							.cutoff$and(S1_M9.site_cd.like(bind("mfg_site_cd")))
							.cutoff$and(S1_M10.site_nm.like(bind("mfg_site_nm")))
							.cutoff$and(S1_M9.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
							.cutoff$and(S1_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))
							.cutoff$and(S1_T1.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_M12.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(S1_T1.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_M13.bp_nm.like(bind("maker_nm")))
							.cutoff$and(S1_T1.rqst_loc_cd.like(bind("rqst_loc_cd")))
							.cutoff$and(S1_M14.loc_nm.like(bind("rqst_loc_nm")))
							.cutoff$and(S1_M14.site_cd.like(bind("rqst_site_cd")))
							.cutoff$and(S1_M15.site_nm.like(bind("rqst_site_nm")))
							.cutoff$and(S1_T1.rqst_wg_cd.like(bind("rqst_wg_cd")))
							.cutoff$and(S1_M18.wg_nm.like(bind("rqst_wg_nm")))
							.cutoff$and(S1_M14.loc_grp_cd.like(bind("rqst_loc_grp_cd")))
							.cutoff$and(S1_M16.loc_grp_nm.like(bind("rqst_loc_grp_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T2.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T2.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T1.ord_gnrt_typ.like(bind("ord_gnrt_typ")))
							.cutoff$and(S1_T1.itm_ord_no.like(bind("itm_ord_no")))
							.cutoff$and(S1_T1.rqmt_no.like(bind("rqmt_no")))
							.cutoff$and(S1_T1.sim_mrp_no.like(bind("sim_mrp_no")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.cutoff$and(
								decode(
									S1_M20.itm_cd,
									nullValue(),
									S1_T1.not_fix_flg,
									value(true)
								).eq(bind("wk_not_fix_flg"))
							)
						).view(S0_T)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T.pr(S1_T1.sim_mrp_no).eq(S0_T4.sim_mrp_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T.pr(S1_T1.itm_cd).eq(S0_M1.itm_cd))
								.and(S0_T.pr(S1_T1.itm_sub1).eq(S0_M1.itm_sub1))
								.and(S0_T.pr(S1_T1.itm_sub2).eq(S0_M1.itm_sub2))
								.and(S0_T.pr(S1_T1.itm_sub3).eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T.pr(S1_T1.itm_cd).eq(S0_M20.itm_cd)
								.and(S0_T.pr(S1_T1.itm_sub1).eq(S0_M20.itm_sub1))
								.and(S0_T.pr(S1_T1.itm_sub2).eq(S0_M20.itm_sub2))
								.and(S0_T.pr(S1_T1.itm_sub3).eq(S0_M20.itm_sub3))
								.and(S0_T.pr(S1_T1.sno1).eq(S0_M20.sno1))
								.and(S0_T.pr(S1_T1.sno2).eq(S0_M20.sno2))
								.and(S0_T.pr(S1_T1.sno3).eq(S0_M20.sno3))
								.and(S0_T.pr(S1_T1.sno4).eq(S0_M20.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.pr("exp_flg").in(
								bind("wk_expflg_false"),
								bind("wk_expflg_true")
							)
						)
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(
							nvl(
								S0_M20.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T.pr(S1_T1.sim_mrp_no).asc(),
						S0_T.pr(S1_T1.itm_ord_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M1.itm_typ.eq(S0_M19.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M19.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
					})
				)
			);
	}
}