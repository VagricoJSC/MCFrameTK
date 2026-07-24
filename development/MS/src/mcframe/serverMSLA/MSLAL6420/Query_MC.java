package mcframe.serverMSLA.MSLAL6420;

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
	 * -- MSLAL6420_MST_STK_S01
	 */
	static MCQueryPlan MSLAL6420_MST_STK_S01() {
		MST_INSP_INST_R S0_INSPINST = MST_INSP_INST_R.create("INSPINST");
		MST_INSP_SCHD_R S0_INSPSCHD = MST_INSP_SCHD_R.create("INSPSCHD");
		MCTempView S0_INSPSCHD2 = createTempView("INSPSCHD2");
		MST_STK_R S0_STK = MST_STK_R.create("STK");
		MST_INSP_SCHD_R S1_INSPSCHD_TMP = MST_INSP_SCHD_R.create("INSPSCHD_TMP");


		return createQueryPlan()
				.setQuery(
						sql("MSLAL6420_MST_STK_S01")
								.mainQuery()
								.select(
									S0_INSPINST.insp_no,
									S0_INSPSCHD.insp_schd_no,
									S0_STK.itm_cd,
									S0_STK.itm_sub1,
									S0_STK.itm_sub2,
									S0_STK.itm_sub3,
									S0_STK.lot_no,
									S0_STK.sublot_no,
									S0_STK.loc_cd,
									S0_STK.str_ln_cd,
									S0_STK.sno1,
									S0_STK.sno2,
									S0_STK.sno3,
									S0_STK.sno4,
									S0_STK.fix_no_typ,
									S0_STK.fix_no,
									S0_STK.pack_unit_cd,
									S0_STK.gd_cd,
									S0_STK.quality_typ,
									S0_STK.stk_insp_typ,
									S0_STK.stk_id_typ,
									S0_STK.stk_bp_cd,
									S0_STK.stk_arrv_bp_cd,
									S0_STK.pack_unit_qty,
									S0_STK.pack_unit_cd,
									S0_STK.base_unit_qty
								)
								.from(
										S0_INSPINST
												.innerJoin(S0_INSPSCHD).on(S0_INSPINST.insp_no.eq(S0_INSPSCHD.insp_no))
												.innerJoin(
														subQuery()
																.select(
																		S1_INSPSCHD_TMP.insp_schd_no,
																		bracket(
																				cases()
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
																						.then(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value()))
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
																						.then(value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value()))
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.LOT.value())))
																						.then(value(MSC_FIX_NO_TYP.INSP_SCHD_NO.value()))
																						.otherwise(nullValue())
																		).as("fix_no_typ"),
																		bracket(
																				cases()
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
																						.then(S1_INSPSCHD_TMP.src_no4)
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
																						.then(S1_INSPSCHD_TMP.src_no4)
																						.when(S1_INSPSCHD_TMP.insp_typ.eq(value(MSC_INSP_TYP.LOT.value())))
																						.then(S1_INSPSCHD_TMP.insp_schd_no)
																						.otherwise(nullValue())
																		).as("fix_no")
																)
																.from(S1_INSPSCHD_TMP).view(S0_INSPSCHD2)
												).on(S0_INSPSCHD.insp_schd_no.eq(S0_INSPSCHD2.pr(S1_INSPSCHD_TMP.insp_schd_no)))
												.innerJoin(S0_STK).on(
														S0_INSPSCHD2.pr("fix_no_typ").eq(S0_STK.fix_no_typ)
																.and(S0_INSPSCHD2.pr("fix_no").eq(S0_STK.fix_no))
												)
								)
								.where(
										S0_INSPINST.insp_no.eq(bind("insp_no"))
								)
				);
	}
}
