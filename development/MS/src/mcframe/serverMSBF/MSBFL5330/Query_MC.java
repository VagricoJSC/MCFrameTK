package mcframe.serverMSBF.MSBFL5330;

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
	 * -- MSBFL5330_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL5330_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAM_INSP_PTN_R S0_M3 = MAM_INSP_PTN_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5330_MST_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_lst_no,
						S0_T1.inst_dt,
						S0_T1.insp_no,
						S0_T1.insp_freq,
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.sublot_no.as("sublot_no_data"),
						S0_T1.bp_lot_no,
						S0_T1.base_unit_qty,
						S0_T1.insp_typ,
						S0_T1.insp_mtd_typ,
						S0_T1.insp_std_no,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.st_tm,
						S0_T1.end_tm,
						S0_T1.std_req_flg,
						S0_T1.std_cnf_req_flg,
						S0_T2.ver_no,
						S0_M2.unit_nm.as("base_unit_nm"),
						S0_M3.insp_ptn_nm,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T2.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M2.unit_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.insp_ptn_cd.eq(S0_M3.insp_ptn_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_lst_no.eq(bind("insp_lst_no")))
					)
			);
	}
	
	/**
	 * -- MSBFL5330_MST_INSP_INST_Query_S02
	 */
	static MCQueryPlan MSBFL5330_MST_INSP_INST_S02() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MST_INSP_ACT_R S0_T2 = MST_INSP_ACT_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T3 = MST_LOT_R.create("T3");
		MAM_INSP_PTN_R S0_M2 = MAM_INSP_PTN_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_ITM_SITE_R S0_M5 = MAM_ITM_SITE_R.create("M5");
		MAM_SITE_R S0_M6 = MAM_SITE_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5330_MST_INSP_INST_Query_S02")
					.mainQuery()
					.select(
						S0_T1.insp_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_M5.ntfy_nm,
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.sublot_no.as("sublot_no_data"),
						S0_T1.insp_std_no,
						nvl(
							S0_T2.vld_dt,
							S0_T3.vld_dt
						).as("vld_dt"),
						nvl(
							S0_T2.lmt_dt,
							S0_T3.lmt_dt
						).as("lmt_dt"),
						S0_T2.judg_dt,
						S0_T2.insp_judg_rslt_typ,
						S0_T2.judg_rsn,
						S0_T3.ver_no,
						S0_M2.insp_ptn_nm,
						S0_M3.usr_nm.as("judg_usr_nm"),
						S0_M4.dpt_nm.as("judg_dpt_nm"),
						S0_M6.site_cd,
						S0_M6.site_nm,
						S0_M1.lmt_ctl_categ.as("lmt_ctl_categ_nm"),
						S0_T1.insp_typ,
						S0_T1.insp_ptn_cd,
						S0_T2.judg_usr_cd,
						S0_T2.judg_dpt_cd
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.insp_no.eq(S0_T2.insp_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T3.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T3.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.insp_ptn_cd.eq(S0_M2.insp_ptn_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.judg_usr_cd.eq(S0_M3.usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.judg_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T2.judg_dt.gte(S0_M4.st_dt))
								.and(S0_T2.judg_dt.lte(S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M5.itm_sub3))
								.and(S0_T1.to_site_cd.eq(S0_M5.site_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.to_site_cd.eq(S0_M6.site_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
					)
			);
	}
	
	/**
	 * -- MSBFL5330_MST_MRKT_JUDG_Query_S01
	 */
	static MCQueryPlan MSBFL5330_MST_MRKT_JUDG_S01() {
		MST_MRKT_JUDG_R S0_T1 = MST_MRKT_JUDG_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_SITE_R S0_M2 = MAM_ITM_SITE_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_SITE_R S0_M6 = MAM_SITE_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5330_MST_MRKT_JUDG_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mrkt_judg_no,
						S0_M1.itm_nm,
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_M2.ntfy_nm,
						S0_T1.mrkt_judg_sts_typ,
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.base_unit_qty,
						S0_T1.judg_dt,
						S0_T1.judg_usr_cd,
						S0_T1.judg_dpt_cd,
						S0_T1.mfg_so_aprv_typ,
						S0_T1.quality_mng_typ,
						S0_T1.mfg_mng_typ,
						S0_T1.deviant_typ,
						S0_T1.deviant_msr_typ,
						S0_T1.prod_itm_info_typ,
						S0_T1.chd_itm_info_typ,
						S0_T1.judg_rsn,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.site_cd,
						S0_M3.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_dec_place"),
						S0_M4.usr_nm.as("judg_usr_nm"),
						S0_M5.dpt_nm.as("judg_dpt_nm"),
						S0_M6.site_nm
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.site_cd.eq(S0_M2.site_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M3.unit_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.judg_usr_cd.eq(S0_M4.usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.judg_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.judg_dt.gte(S0_M5.st_dt))
								.and(S0_T1.judg_dt.lte(S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.site_cd.eq(S0_M6.site_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mrkt_judg_no.eq(bind("mrkt_judg_no")))
					)
			);
	}
	
	/**
	 * -- MSBFL5330_MST_PLNT_APRV_Query_S01
	 */
	static MCQueryPlan MSBFL5330_MST_PLNT_APRV_S01() {
		MST_PLNT_APRV_R S0_T1 = MST_PLNT_APRV_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_SITE_R S0_M2 = MAM_ITM_SITE_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_SITE_R S0_M5 = MAM_SITE_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5330_MST_PLNT_APRV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.plnt_aprv_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no.as("lot_no_data"),
						S0_T1.sublot_no.as("sublot_no_data"),
						S0_T1.plnt_aprv_sts_typ,
						S0_T1.aprv_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_dpt_cd,
						S0_T1.aprv_rsn,
						S0_T1.site_cd,
						S0_M1.itm_nm,
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_M2.ntfy_nm,
						S0_M3.usr_nm.as("aprv_usr_nm"),
						S0_M4.dpt_nm.as("aprv_dpt_nm"),
						S0_M5.site_nm
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.site_cd.eq(S0_M2.site_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.aprv_usr_cd.eq(S0_M3.usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.aprv_dt.gte(S0_M4.st_dt))
								.and(S0_T1.aprv_dt.lte(S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.site_cd.eq(S0_M5.site_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.plnt_aprv_no.eq(bind("plnt_aprv_no")))
					)
			);
	}
	
	/**
	 * -- MSBFL5330_MST_STD_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL5330_MST_STD_INSP_INST_S01() {
		MST_STD_INSP_INST_R S0_T1 = MST_STD_INSP_INST_R.create("T1");
		MST_STD_INSP_ACT_R S0_T2 = MST_STD_INSP_ACT_R.create("T2");
		MAM_UNIT_R S0_M1 = MAM_UNIT_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_INSP_POINT_R S0_M4 = MAM_INSP_POINT_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5330_MST_STD_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_seq,
						S0_T1.insp_qlqn_typ,
						S0_T1.insp_point_cd,
						S0_M4.insp_point_nm,
						S0_T1.ql_std_val,
						S0_T1.qn_out_min,
						S0_T1.qn_out_max,
						S0_T1.qn_in_min,
						S0_T1.qn_in_max,
						S0_T1.sign_out_min_typ,
						S0_T1.sign_out_max_typ,
						S0_T1.sign_in_min_typ,
						S0_T1.sign_in_max_typ,
						S0_T1.qn_int_frac,
						S0_T2.qn_insp_val,
						S0_T2.ql_insp_val,
						S0_T2.std_insp_rslt_typ,
						S0_T2.end_tm.as("insp_end_tm"),
						S0_T1.trd_unit_cd,
						S0_M1.unit_nm.as("trd_unit_nm"),
						S0_T2.usr_cd.as("insp_usr_cd"),
						S0_M2.usr_nm.as("insp_usr_nm"),
						S0_T2.cnf_usr_cd,
						S0_M3.usr_nm.as("cnf_usr_nm"),
						S0_T1.sub_char1.as("inst_sub_char1"),
						S0_T1.sub_char2.as("inst_sub_char2"),
						S0_T1.sub_char3.as("inst_sub_char3"),
						S0_T2.sub_char1.as("act_sub_char1"),
						S0_T2.sub_char2.as("act_sub_char2"),
						S0_T2.sub_char3.as("act_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.std_insp_inst_no.eq(S0_T2.std_insp_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.usr_cd.eq(S0_M2.usr_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.cnf_usr_cd.eq(S0_M3.usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.insp_point_cd.eq(S0_M4.insp_point_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
					)
					.orderBy(S0_T1.insp_seq.asc())
			);
	}
}