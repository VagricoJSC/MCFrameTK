package mcframe.serverMSBF.MSBFL5220;

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
	 * -- MSBFL5220_MST_ITM_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBFL5220_MST_ITM_MFG_INST_S01() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOT_INH_DEST_R S0_M2 = MAM_LOT_INH_DEST_R.create("M2");
		MAM_LOT_INH_SRC_R S0_M3 = MAM_LOT_INH_SRC_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5220_MST_ITM_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						decode(
							S0_M1.sublot_mng_typ,
							value(MAC_SUBLOT_MNG_TYP.STK.value()),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.sublot_no
						).as("sublot_no"),
						S0_T1.bom_ptn,
						S0_M2.wg_cd,
						S0_T2.mfg_inst_unit_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M2.lot_inh_col_typ,
						S0_M2.lot_inh_typ,
						S0_M2.add_concat_col,
						S0_M2.overflow_err_flg,
						S0_M3.chd_itm_cd,
						S0_M3.chd_itm_sub1,
						S0_M3.chd_itm_sub2,
						S0_M3.chd_itm_sub3,
						S0_M3.prio
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.frst_mfg_inst_no.eq(S0_T2.mfg_inst_no))
						.innerJoin(S0_W1).on(S0_T1.itm_mfg_inst_no.eq(S0_W1.itm_mfg_inst_no))
						.innerJoin(S0_M1).on(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.innerJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.par_itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.par_itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.par_itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.par_itm_sub3))
							.and(S0_T1.bom_ptn.eq(S0_M2.bom_ptn))
							.and(
								S0_T1.wg_cd.eq(S0_M2.wg_cd)
								.or(S0_M2.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_M3).on(
							S0_M2.par_itm_cd.eq(S0_M3.par_itm_cd)
							.and(S0_M2.par_itm_sub1.eq(S0_M3.par_itm_sub1))
							.and(S0_M2.par_itm_sub2.eq(S0_M3.par_itm_sub2))
							.and(S0_M2.par_itm_sub3.eq(S0_M3.par_itm_sub3))
							.and(S0_M2.bom_ptn.eq(S0_M3.bom_ptn))
							.and(S0_M2.wg_cd.eq(S0_M3.wg_cd))
							.and(S0_M2.lot_inh_col_typ.eq(S0_M3.lot_inh_col_typ))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.lot_mng_typ.neq(value(MAC_LOT_MNG_TYP.NOT_MNG.value())))
					)
			);
	}
	
	/**
	 * -- MSBFL5220_MST_LOT_Query_S01
	 */
	static MCQueryPlan MSBFL5220_MST_LOT_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MST_INPT_SCHD_R S1_V1 = MST_INPT_SCHD_R.create("V1");
		MSVT_INPT_SCHD_PR_R S1_V2 = MSVT_INPT_SCHD_PR_R.create("V2");
		MST_ITM_MFG_INST_R S1_V3 = MST_ITM_MFG_INST_R.create("V3");
		MSW_ITM_MFG_INST_KEY_R S1_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_LOT_INH_SRC_R S2_K1 = MAM_LOT_INH_SRC_R.create("K1");
		MST_INPT_ACT_R S3_V1 = MST_INPT_ACT_R.create("V1");
		MST_ITM_MFG_INST_R S3_V2 = MST_ITM_MFG_INST_R.create("V2");
		MSW_ITM_MFG_INST_KEY_R S3_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MAM_ITM_R S3_M1 = MAM_ITM_R.create("M1");
		MST_LOSS_ACT_R S4_W1 = MST_LOSS_ACT_R.create("W1");
		MAM_BIZ_RSN_R S4_W2 = MAM_BIZ_RSN_R.create("W2");
		MAM_LOT_INH_SRC_R S5_K1 = MAM_LOT_INH_SRC_R.create("K1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5220_MST_LOT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.prAll(),
						S0_T1.pr(S1_V1.itm_mfg_inst_no),
						S0_T1.pr("mfg_act_no")
					)
					.from(
						subQuery()
						.select(
							S1_V1.itm_cd,
							S1_V1.itm_sub1,
							S1_V1.itm_sub2,
							S1_V1.itm_sub3,
							S1_V1.lot_no,
							decode(
								S1_M1.sublot_mng_typ,
								value(MAC_SUBLOT_MNG_TYP.STK.value()),
								value(MAC_STR.NULL_VAL.value()),
								S1_V1.sublot_no
							).as("sublot_no"),
							S1_V1.itm_mfg_inst_no,
							nullValue().as("mfg_act_no")
						)
						.from(
							S1_V1
							.innerJoin(S1_V2).on(S1_V1.inpt_schd_no.eq(S1_V2.inpt_schd_no))
							.innerJoin(S1_V3).on(S1_V1.itm_mfg_inst_no.eq(S1_V3.itm_mfg_inst_no))
							.innerJoin(S1_W1).on(S1_V1.itm_mfg_inst_no.eq(S1_W1.itm_mfg_inst_no))
							.innerJoin(S1_M1).on(
								S1_V1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_V1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_V1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_V1.itm_sub3.eq(S1_M1.itm_sub3))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_V1.base_unit_inpt_qty.neq(value(0))
								.or(S1_V1.base_unit_rqmt_qty.neq(value(0)))
							)
							.and(S1_V1.can_flg.eq(value(false)))
							.and(S1_V1.lot_no.isNotNull())
							.and(S1_V1.sublot_no.isNotNull())
							.and(S1_V1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
							.and(
								S1_V2.mfg_sts_typ.in(
									value(MSC_MFG_STS_TYP.YET.value()),
									value(MSC_MFG_STS_TYP.SAV.value()),
									value(MSC_MFG_STS_TYP.ORD.value()),
									value(MSC_MFG_STS_TYP.STT.value())
								)
							)
							.and(
								exists(
									subQuery()
									.select(value(0))
									.from(S2_K1)
									.where(
										value(0).eq(value(0))
										.and(S2_K1.par_itm_cd.eq(S1_V3.itm_cd))
										.and(S2_K1.par_itm_sub1.eq(S1_V3.itm_sub1))
										.and(S2_K1.par_itm_sub2.eq(S1_V3.itm_sub2))
										.and(S2_K1.par_itm_sub3.eq(S1_V3.itm_sub3))
										.and(S2_K1.bom_ptn.eq(S1_V3.bom_ptn))
										.and(
											S2_K1.wg_cd.eq(S1_V3.wg_cd)
											.or(S2_K1.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
										)
										.and(S2_K1.chd_itm_cd.eq(S1_V1.itm_cd))
										.and(S2_K1.chd_itm_sub1.eq(S1_V1.itm_sub1))
										.and(S2_K1.chd_itm_sub2.eq(S1_V1.itm_sub2))
										.and(S2_K1.chd_itm_sub3.eq(S1_V1.itm_sub3))
									)
								)
							)
						)
						.union(
							subQuery()
							.select(
								S3_V1.itm_cd,
								S3_V1.itm_sub1,
								S3_V1.itm_sub2,
								S3_V1.itm_sub3,
								S3_V1.lot_no,
								decode(
									S3_M1.sublot_mng_typ,
									value(MAC_SUBLOT_MNG_TYP.STK.value()),
									value(MAC_STR.NULL_VAL.value()),
									S3_V1.sublot_no
								).as("sublot_no"),
								S3_V1.itm_mfg_inst_no,
								S3_V1.mfg_act_no
							)
							.from(
								S3_V1
								.innerJoin(S3_V2).on(S3_V1.itm_mfg_inst_no.eq(S3_V2.itm_mfg_inst_no))
								.innerJoin(S3_W1).on(S3_V1.itm_mfg_inst_no.eq(S3_W1.itm_mfg_inst_no))
								.innerJoin(S3_M1).on(
									S3_V1.itm_cd.eq(S3_M1.itm_cd)
									.and(S3_V1.itm_sub1.eq(S3_M1.itm_sub1))
									.and(S3_V1.itm_sub2.eq(S3_M1.itm_sub2))
									.and(S3_V1.itm_sub3.eq(S3_M1.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_V1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
								.and(
									S3_V1.base_unit_inpt_qty.neq(value(0))
									.or(S3_V1.base_unit_loss_qty.neq(value(0)))
									.or(S3_V1.base_unit_fxd_loss_qty.neq(value(0)))
								)
								.and(
									S3_V1.base_unit_inpt_qty.gt(value(0))
									.or(
										exists(
											subQuery()
											.select(value(0))
											.from(
												S4_W1
												.innerJoin(S4_W2).on(S4_W1.loss_rsn_cd.eq(S4_W2.biz_rsn_cd))
											)
											.where(
												value(0).eq(value(0))
												.and(S4_W1.inpt_act_no.eq(S3_V1.inpt_act_no))
												.and(S4_W1.base_unit_qty.gt(value(0)))
												.and(S4_W2.not_lot_trace_flg.eq(value(false)))
											)
										)
									)
								)
								.and(
									exists(
										subQuery()
										.select(value(0))
										.from(S5_K1)
										.where(
											value(0).eq(value(0))
											.and(S5_K1.par_itm_cd.eq(S3_V2.itm_cd))
											.and(S5_K1.par_itm_sub1.eq(S3_V2.itm_sub1))
											.and(S5_K1.par_itm_sub2.eq(S3_V2.itm_sub2))
											.and(S5_K1.par_itm_sub3.eq(S3_V2.itm_sub3))
											.and(S5_K1.bom_ptn.eq(S3_V2.bom_ptn))
											.and(
												S5_K1.wg_cd.eq(S3_V2.wg_cd)
												.or(S5_K1.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
											)
											.and(S5_K1.chd_itm_cd.eq(S3_V1.itm_cd))
											.and(S5_K1.chd_itm_sub1.eq(S3_V1.itm_sub1))
											.and(S5_K1.chd_itm_sub2.eq(S3_V1.itm_sub2))
											.and(S5_K1.chd_itm_sub3.eq(S3_V1.itm_sub3))
										)
									)
								)
							)
						).view(S0_T1)
						.innerJoin(S0_T2).on(
							S0_T1.pr(S1_V1.itm_cd).eq(S0_T2.itm_cd)
							.and(S0_T1.pr(S1_V1.itm_sub1).eq(S0_T2.itm_sub1))
							.and(S0_T1.pr(S1_V1.itm_sub2).eq(S0_T2.itm_sub2))
							.and(S0_T1.pr(S1_V1.itm_sub3).eq(S0_T2.itm_sub3))
							.and(S0_T1.pr(S1_V1.lot_no).eq(S0_T2.lot_no))
							.and(S0_T1.pr("sublot_no").eq(S0_T2.sublot_no))
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBFL5220_MSVT_YIELD_ACT_LOT_Query_S01
	 */
	static MCQueryPlan MSBFL5220_MSVT_YIELD_ACT_LOT_S01() {
		MSVT_YIELD_ACT_LOT_R S0_T1 = MSVT_YIELD_ACT_LOT_R.create("T1");
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5220_MSVT_YIELD_ACT_LOT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						decode(
							S0_M1.sublot_mng_typ,
							value(MAC_SUBLOT_MNG_TYP.STK.value()),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.sublot_no
						).as("sublot_no"),
						S0_T1.itm_mfg_inst_no,
						S0_T1.mfg_act_no
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(S0_T1.itm_mfg_inst_no.eq(S0_W1.itm_mfg_inst_no))
						.innerJoin(S0_M1).on(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
}