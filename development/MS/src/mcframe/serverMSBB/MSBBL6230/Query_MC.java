package mcframe.serverMSBB.MSBBL6230;

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
	 * -- MSBBL6230_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL6230_MST_SLO_D_S01() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MSW_SLO_KEY_R S0_WK = MSW_SLO_KEY_R.create("WK");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SHIP_SCHD_R S0_T3 = MST_SHIP_SCHD_R.create("T3");
		MST_SLO_D_R S1_ST1 = MST_SLO_D_R.create("ST1");
		MST_SHIP_PR_R S1_ST2 = MST_SHIP_PR_R.create("ST2");
		MST_SHIP_SCHD_R S1_ST3 = MST_SHIP_SCHD_R.create("ST3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6230_MST_SLO_D_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_cd,
						S0_T1.tdlv_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(S0_T1.slo_no.eq(S0_WK.slo_no))
						.innerJoin(S0_T2).on(S0_T1.slo_d_no.eq(S0_T2.slo_d_no))
						.innerJoin(S0_T3).on(S0_T2.ship_pr_no.eq(S0_T3.ship_pr_no))
					)
					.where(
						S0_T1.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NO_PICK.value()))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T3.abort_flg.eq(value(false)))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S1_ST1
									.innerJoin(S1_ST2).on(S1_ST1.slo_d_no.eq(S1_ST2.slo_d_no))
									.innerJoin(S1_ST3).on(S1_ST2.ship_pr_no.eq(S1_ST3.ship_pr_no))
								)
								.where(
									S1_ST1.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.PICK.value()))
									.and(S1_ST1.can_flg.eq(value(false)))
									.and(S1_ST3.abort_flg.eq(value(false)))
									.and(S1_ST1.slo_no.eq(S0_T1.slo_no))
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S1_ST2.ship_to_id_typ
										).eq(S0_T2.ship_to_id_typ)
									)
									.and(
										nvl(
											nvl(
												S1_ST3.tdlv_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S1_ST3.dlv_cd,
													nullValue()
												)
											),
											S1_ST2.ship_to_id_cd
										).eq(S0_T2.ship_to_id_cd)
									)
									.and(
										bracket(
											cases()
												.when(
													S1_ST3.tdlv_cd.isNotNull()
													.and(S1_ST3.tdlv_sundry_flg.eq(value(true)))
												)
													.then(S1_ST3.tdlv_nm)
												.when(
													S1_ST3.tdlv_cd.isNull()
													.and(S1_ST3.dlv_cd.isNotNull())
													.and(S1_ST2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.DLV.value())))
													.and(S1_ST3.dlv_sundry_flg.eq(value(true)))
												)
													.then(S1_ST3.dlv_nm)
												.when(
													S1_ST3.tdlv_cd.isNull()
													.and(
														S1_ST2.ship_to_id_typ.neq(value(MSC_SHIP_TO_ID_TYP.DLV.value()))
														.or(S1_ST3.dlv_cd.isNull())
														.or(S1_ST3.dlv_sundry_flg.eq(value(false)))
													)
													.and(S1_ST2.ship_to_sundry_flg.eq(value(true)))
												)
													.then(S1_ST2.ship_to_id_nm)
												.otherwise(nullValue())
										).eq(S0_T2.ship_to_id_nm)
										.or(
											bracket(
												cases()
													.when(
														S1_ST3.tdlv_cd.isNotNull()
														.and(S1_ST3.tdlv_sundry_flg.eq(value(true)))
													)
														.then(S1_ST3.tdlv_nm)
													.when(
														S1_ST3.tdlv_cd.isNull()
														.and(S1_ST3.dlv_cd.isNotNull())
														.and(S1_ST2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.DLV.value())))
														.and(S1_ST3.dlv_sundry_flg.eq(value(true)))
													)
														.then(S1_ST3.dlv_nm)
													.when(
														S1_ST3.tdlv_cd.isNull()
														.and(
															S1_ST2.ship_to_id_typ.neq(value(MSC_SHIP_TO_ID_TYP.DLV.value()))
															.or(S1_ST3.dlv_cd.isNull())
															.or(S1_ST3.dlv_sundry_flg.eq(value(false)))
														)
														.and(S1_ST2.ship_to_sundry_flg.eq(value(true)))
													)
														.then(S1_ST2.ship_to_id_nm)
													.otherwise(nullValue())
											).isNull()
											.and(S0_T2.ship_to_id_nm.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_zip_cd,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_zip_cd,
													S1_ST2.ship_to_zip_cd
												),
												S1_ST2.ship_to_zip_cd
											)
										).eq(S0_T2.ship_to_zip_cd)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_zip_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_zip_cd,
														S1_ST2.ship_to_zip_cd
													),
													S1_ST2.ship_to_zip_cd
												)
											).isNull()
											.and(S0_T2.ship_to_zip_cd.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr1,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr1,
													S1_ST2.ship_to_addr1
												),
												S1_ST2.ship_to_addr1
											)
										).eq(S0_T2.ship_to_addr1)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr1,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr1,
														S1_ST2.ship_to_addr1
													),
													S1_ST2.ship_to_addr1
												)
											).isNull()
											.and(S0_T2.ship_to_addr1.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr2,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr2,
													S1_ST2.ship_to_addr2
												),
												S1_ST2.ship_to_addr2
											)
										).eq(S0_T2.ship_to_addr2)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr2,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr2,
														S1_ST2.ship_to_addr2
													),
													S1_ST2.ship_to_addr2
												)
											).isNull()
											.and(S0_T2.ship_to_addr2.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr3,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr3,
													S1_ST2.ship_to_addr3
												),
												S1_ST2.ship_to_addr3
											)
										).eq(S0_T2.ship_to_addr3)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr3,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr3,
														S1_ST2.ship_to_addr3
													),
													S1_ST2.ship_to_addr3
												)
											).isNull()
											.and(S0_T2.ship_to_addr3.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr4,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr4,
													S1_ST2.ship_to_addr4
												),
												S1_ST2.ship_to_addr4
											)
										).eq(S0_T2.ship_to_addr4)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr4,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr4,
														S1_ST2.ship_to_addr4
													),
													S1_ST2.ship_to_addr4
												)
											).isNull()
											.and(S0_T2.ship_to_addr4.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_cntct_dpt,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_cntct_dpt,
													S1_ST2.ship_to_cntct_dpt
												),
												S1_ST2.ship_to_cntct_dpt
											)
										).eq(S0_T2.ship_to_cntct_dpt)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_cntct_dpt,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_cntct_dpt,
														S1_ST2.ship_to_cntct_dpt
													),
													S1_ST2.ship_to_cntct_dpt
												)
											).isNull()
											.and(S0_T2.ship_to_cntct_dpt.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_cntct_psn,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_cntct_psn,
													S1_ST2.ship_to_cntct_psn
												),
												S1_ST2.ship_to_cntct_psn
											)
										).eq(S0_T2.ship_to_cntct_psn)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_cntct_psn,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_cntct_psn,
														S1_ST2.ship_to_cntct_psn
													),
													S1_ST2.ship_to_cntct_psn
												)
											).isNull()
											.and(S0_T2.ship_to_cntct_psn.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_tel,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_tel,
													S1_ST2.ship_to_tel
												),
												S1_ST2.ship_to_tel
											)
										).eq(S0_T2.ship_to_tel)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_tel,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_tel,
														S1_ST2.ship_to_tel
													),
													S1_ST2.ship_to_tel
												)
											).isNull()
											.and(S0_T2.ship_to_tel.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_fax,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_fax,
													S1_ST2.ship_to_fax
												),
												S1_ST2.ship_to_fax
											)
										).eq(S0_T2.ship_to_fax)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_fax,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_fax,
														S1_ST2.ship_to_fax
													),
													S1_ST2.ship_to_fax
												)
											).isNull()
											.and(S0_T2.ship_to_fax.isNull())
										)
									)
									.and(
										nvl(
											S1_ST3.via_dlv_typ,
											S1_ST2.via_dlv_typ
										).eq(S0_T2.via_dlv_typ)
										.or(
											nvl(
												S1_ST3.via_dlv_typ,
												S1_ST2.via_dlv_typ
											).isNull()
											.and(S0_T2.via_dlv_typ.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_lg_grp_cd,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_lg_grp_cd,
													S1_ST2.ship_to_lg_grp_cd
												),
												S1_ST2.ship_to_lg_grp_cd
											)
										).eq(S0_T2.ship_to_lg_grp_cd)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_lg_grp_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_lg_grp_cd,
														S1_ST2.ship_to_lg_grp_cd
													),
													S1_ST2.ship_to_lg_grp_cd
												)
											).isNull()
											.and(S0_T2.ship_to_lg_grp_cd.isNull())
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL6230_MST_SLO_PRMS_Query_S01
	 */
	static MCQueryPlan MSBBL6230_MST_SLO_PRMS_S01() {
		MST_SLO_PRMS_H_R sloPrmsH = MST_SLO_PRMS_H_R.create("SLOPRMSH");
		MST_SLO_PRMS_P_R sloPrmsP = MST_SLO_PRMS_P_R.create("SLOPRMSP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6230_MST_SLO_PRMS_Query_S01")
					.mainQuery()
					.select(max(sloPrmsP.slo_prms_rev).as("slo_prms_rev"))
					.from(sloPrmsH
					.innerJoin(sloPrmsP).on(
						bracket(
							sloPrmsP.slo_prms_h_no.eq(sloPrmsH.slo_prms_h_no)
							.and(sloPrmsP.can_flg.eq(value(false)))
						)
					))
					.where(
						value(0).eq(value(0))
						.and(sloPrmsH.slo_d_no.eq(bind("slo_d_no")))
						.and(sloPrmsH.can_flg.eq(value(false)))
					)
			);
	}
}