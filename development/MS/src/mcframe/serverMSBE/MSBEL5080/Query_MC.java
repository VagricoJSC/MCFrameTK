package mcframe.serverMSBE.MSBEL5080;

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
	 * -- MSBEL5080_MST_INPT_STK_RPL_LST_Query_D01
	 */
	static MCQueryPlan MSBEL5080_MST_INPT_STK_RPL_LST_D01() {
		MST_INPT_STK_RPL_LST_R S0_T1 = MST_INPT_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S1_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_INPT_STK_RPL_LST_Query_D01")
					.delete(S0_T1)
					.where(
						exists(
							subQuery()
							.select(value(0))
							.from(S1_W1)
							.where(
								S0_T1.loc_cd.eq(S1_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S1_W1.str_ln_cd))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_INPT_STK_RPL_LST_Query_S01
	 */
	static MCQueryPlan MSBEL5080_MST_INPT_STK_RPL_LST_S01() {
		MST_INPT_STK_RPL_LST_R S0_T1 = MST_INPT_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_INPT_STK_RPL_LST_Query_S01")
					.mainQuery()
					.select(S0_T1.batch_data_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
					)
					.orderBy(S0_T1.batch_data_no.asc())
					.forUpdate(S0_T1.batch_data_no)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_INPT_STK_RPL_LST_Query_S02
	 */
	static MCQueryPlan MSBEL5080_MST_INPT_STK_RPL_LST_S02() {
		MST_INPT_STK_RPL_LST_R S0_T1 = MST_INPT_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_INPT_STK_RPL_LST_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
					)
			);
	}
	/**
	 * -- MSBEL5080_MST_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5080_MST_IO_SCHD_S01() {
		MST_IO_SCHD_R S0_T1 = MST_IO_SCHD_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.alt_grp_cd,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						countAll().as("total_cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.schd_dt.lte(bind("dt_to")))
						.and(S0_T1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT.value())))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_fix")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_schd")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_mfg_sav")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_stt")))
						)
						.and(S0_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.SLF_SUPPRT.value())))
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.alt_grp_cd,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd
					)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_IO_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5080_MST_IO_SCHD_S02() {
		MST_IO_SCHD_R S0_T1 = MST_IO_SCHD_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MSW_INPT_STK_RPL_ITM_LOC_R S0_W1 = MSW_INPT_STK_RPL_ITM_LOC_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_IO_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.io_schd_typ,
						S0_T1.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.alloc_flg,
						S0_T1.io_schd_no,
						S0_T1.io_schd_seq,
						S0_T1.io_schd_sub_typ1,
						S0_T1.io_schd_sub_no1,
						S0_T1.io_schd_sub_typ2,
						S0_T1.io_schd_sub_no2,
						S0_T1.io_schd_sub_typ3,
						S0_T1.io_schd_sub_no3,
						S0_T1.io_schd_sub_typ4,
						S0_T1.io_schd_sub_no4,
						S0_T1.io_schd_pr_no,
						S0_T1.schd_dt,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.gd_cd,
						S0_T1.base_unit_cd,
						S0_T1.quality_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						nvl2(
							S0_T1.alt_grp_cd,
							S0_T1.alt_qty,
							S0_T1.base_unit_qty
						).as("short_qty"),
						S0_T1.vld_dt_fr,
						S0_T1.oper_ord_no,
						S0_T1.oper_inst_no,
						S0_T1.alt_grp_cd,
						S0_T1.alt_grp_seq,
						S0_T1.alt_itm_typ,
						S0_T1.alt_alloc_prio,
						S0_T1.inpt_ctl_typ,
						decode(
							MAC_LOT_MNG_TYP$IS_NOT_MNG(S0_M1.lot_mng_typ), value(true),
							value(false),
							decode(
								S0_T3.lot_mix_flg,
								value(false),
								value(true),
								value(false)
							)
						).as("not_lot_mix_flg"),
						decode(
							MAC_SUBLOT_MNG_TYP$IS_NOT_MNG(S0_M1.sublot_mng_typ), value(true),
							value(false),
							decode(
								S0_T3.sublot_mix_flg,
								value(false),
								value(true),
								value(false)
							)
						).as("not_sublot_mix_flg"),
						S0_M1.dec_place.as("base_dec_place"),
						S0_M1.rnd_typ.as("base_rnd_typ"),
						decode(
							S0_M1.cont_fctr_flg,
							value(true),
							nvl(
								S0_T3.std_cont_fctr,
								S0_M1.std_cont_fctr
							),
							nullValue()
						).as("std_cont_fctr"),
						decode(
							S0_M1.cont_fctr_flg,
							value(true),
							S0_T3.act_cont_fctr,
							nullValue()
						).as("act_cont_fctr"),
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.io_schd_sub_no1.eq(S0_T2.itm_ord_no)
								.and(
									S0_T1.io_schd_sts_typ.in(
										value(MSC_IO_SCHD_STS_TYP.FIX.value()),
										value(MSC_IO_SCHD_STS_TYP.SCHD.value())
									)
								)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.io_schd_no.eq(S0_T3.inpt_schd_no)
								.and(
									S0_T1.io_schd_sts_typ.in(
										value(MSC_IO_SCHD_STS_TYP.MFG_SAV.value()),
										value(MSC_IO_SCHD_STS_TYP.ORD.value()),
										value(MSC_IO_SCHD_STS_TYP.STT.value())
									)
								)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
								.and(S0_T1.itm_cd.eq(S0_W1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.schd_dt.lte(bind("dt_to")))
						.and(S0_T1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT.value())))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_fix")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_schd")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_mfg_sav")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_stt")))
						)
						.and(S0_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.SLF_SUPPRT.value())))
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_ORD_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5080_MST_ORD_IO_SCHD_S01() {
		MST_ORD_IO_SCHD_R S0_T1 = MST_ORD_IO_SCHD_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_ORD_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.alt_grp_cd,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						countAll().as("total_cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.schd_dt.lte(bind("dt_to")))
						.and(S0_T1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT_PLN.value())))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_opn")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord_sav")))
						)
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.alt_grp_cd,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd
					)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_ORD_IO_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5080_MST_ORD_IO_SCHD_S02() {
		MST_ORD_IO_SCHD_R S0_T1 = MST_ORD_IO_SCHD_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MSW_INPT_STK_RPL_ITM_LOC_R S0_W1 = MSW_INPT_STK_RPL_ITM_LOC_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_PROV_UPRI_R S1_TA1 = MAM_PROV_UPRI_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_ORD_IO_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.io_schd_typ,
						S0_T1.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.io_schd_no,
						S0_T1.io_schd_seq,
						S0_T1.io_schd_sub_typ1,
						S0_T1.io_schd_sub_no1,
						S0_T1.io_schd_sub_typ2,
						S0_T1.io_schd_sub_no2,
						S0_T1.io_schd_sub_typ3,
						S0_T1.io_schd_sub_no3,
						S0_T1.io_schd_sub_typ4,
						S0_T1.io_schd_sub_no4,
						S0_T1.io_schd_pr_no,
						S0_T1.schd_dt,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.gd_cd,
						S0_T1.base_unit_cd,
						S0_T1.quality_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						nvl2(
							S0_T1.alt_grp_cd,
							S0_T1.alt_qty,
							S0_T1.base_unit_qty
						).as("short_qty"),
						S0_T1.vld_dt_fr,
						S0_T1.oper_ord_no,
						S0_T1.oper_inst_no,
						S0_T1.alt_grp_cd,
						S0_T1.alt_grp_seq,
						S0_T1.alt_itm_typ,
						S0_T1.alt_alloc_prio,
						S0_T1.inpt_ctl_typ,
						S0_M1.dec_place.as("base_dec_place"),
						S0_M1.rnd_typ.as("base_rnd_typ"),
						decode(
							S0_M1.cont_fctr_flg,
							value(true),
							S0_M1.std_cont_fctr,
							nullValue()
						).as("std_cont_fctr"),
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						nvl2(
							S0_T1.sppl_cd,
							nvl(
								bracket(
									subQuery()
									.select(S1_TA1.prov_typ)
									.from(S1_TA1)
									.where(
										S0_T1.itm_cd.eq(S1_TA1.itm_cd)
										.and(S0_T1.itm_sub1.eq(S1_TA1.itm_sub1))
										.and(S0_T1.itm_sub2.eq(S1_TA1.itm_sub2))
										.and(S0_T1.itm_sub3.eq(S1_TA1.itm_sub3))
										.and(S0_T2.mfg_st_schd_dt.gte(S1_TA1.st_dt))
										.and(S0_T2.mfg_st_schd_dt.lte(S1_TA1.end_dt))
										.and(S0_T1.wg_cd.eq(S1_TA1.wg_cd))
										.and(S0_T1.sppl_cd.eq(S1_TA1.prsppl_cd))
										.and(S0_M2.cur_cd.eq(S1_TA1.cur_cd))
									)
								),
								value(MAC_PROV_TYP.FFR_PROV.value())
							),
							nullValue()
						).as("prov_typ")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.io_schd_no.eq(S0_T2.itm_ord_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
								.and(S0_T1.itm_cd.eq(S0_W1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.sppl_cd.eq(S0_M2.bp_cd)
								.and(S0_M2.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.schd_dt.gte(bind("dt_fr")))
						.and(S0_T1.schd_dt.lte(bind("dt_to")))
						.and(S0_T1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT_PLN.value())))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_opn")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord_sav")))
						)
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
			);
	}
	
	
	/**
	 * -- MSBEL5080_MST_XFR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5080_MST_XFR_SCHD_S01() {
		MST_XFR_SCHD_R S0_T1 = MST_XFR_SCHD_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_XFR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.gr_wg_cd.as("wg_cd"),
						S0_T1.gr_loc_cd.as("loc_cd"),
						S0_T1.gr_str_ln_cd.as("str_ln_cd"),
						countAll().as("total_cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.gr_str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.gr_rqst_tm.gte(bind("tm_fr")))
						.and(S0_T1.gr_rqst_tm.lte(bind("tm_to")))
						.and(S0_T1.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.INPT_RPL.value())))
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.gr_wg_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd
					)
			);
	}
	
	/**
	 * -- MSBEL5080_MST_XFR_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5080_MST_XFR_SCHD_S02() {
		MST_XFR_SCHD_R S0_T1 = MST_XFR_SCHD_R.create("T1");
		MSW_INPT_STK_RPL_ITM_LOC_R S0_W1 = MSW_INPT_STK_RPL_ITM_LOC_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5080_MST_XFR_SCHD_Query_S02")
					.mainQuery()
					.select(S0_T1.xfr_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.gr_str_ln_cd.eq(S0_W1.str_ln_cd))
								.and(S0_T1.itm_cd.eq(S0_W1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.gr_rqst_tm.gte(bind("tm_fr")))
						.and(S0_T1.gr_rqst_tm.lte(bind("tm_to")))
						.and(S0_T1.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.INPT_RPL.value())))
					)
					.orderBy(S0_T1.xfr_schd_no.asc())
			);
	}
}