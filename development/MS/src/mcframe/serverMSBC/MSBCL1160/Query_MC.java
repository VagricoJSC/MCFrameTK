package mcframe.serverMSBC.MSBCL1160;

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
	 * -- MSBCL1160_MST_VER_CHG_Query_S01
	 */
	static MCQueryPlan MSBCL1160_MST_VER_CHG_S01() {
		MST_VER_CHG_R S0_T1 = MST_VER_CHG_R.create("T1");
		MST_MFG_ACT_R S0_T2 = MST_MFG_ACT_R.create("T2");
		MST_MFG_ACT_R S0_T3 = MST_MFG_ACT_R.create("T3");
		MST_ITM_MFG_INST_R S0_T4 = MST_ITM_MFG_INST_R.create("T4");
		MAM_ITM_VER_R S0_M1 = MAM_ITM_VER_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_M3 = MAM_SUNDRY_ITM_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_SUNDRY_ITM_R S0_M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAM_SITE_R S0_M6 = MAM_SITE_R.create("M6");
		MAM_ITM_TYP_D_R S0_M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_ITM_TYP_D_R S0_M8 = MAM_ITM_TYP_D_R.create("M8");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAVM_RD_WG_R S0_V1 = MAVM_RD_WG_R.create("V1");
		MAM_ITM_GRP_R S0_CM1 = MAM_ITM_GRP_R.create("CM1");
		MAM_ITM_GRP_R S0_CM2 = MAM_ITM_GRP_R.create("CM2");
		MAM_ITM_GRP_R S0_CM3 = MAM_ITM_GRP_R.create("CM3");
		MAM_ITM_GRP_R S0_CM4 = MAM_ITM_GRP_R.create("CM4");
		MAM_ITM_GRP_R S0_CM5 = MAM_ITM_GRP_R.create("CM5");
		MAM_ITM_GRP_R S0_CM6 = MAM_ITM_GRP_R.create("CM6");
		MAM_ITM_GRP_R S0_CM7 = MAM_ITM_GRP_R.create("CM7");
		MAM_ITM_GRP_R S0_CM8 = MAM_ITM_GRP_R.create("CM8");
		MAM_ITM_GRP_R S0_CM9 = MAM_ITM_GRP_R.create("CM9");
		MAM_ITM_GRP_R S0_CM10 = MAM_ITM_GRP_R.create("CM10");
		MAM_ITM_GRP_R S0_PM1 = MAM_ITM_GRP_R.create("PM1");
		MAM_ITM_GRP_R S0_PM2 = MAM_ITM_GRP_R.create("PM2");
		MAM_ITM_GRP_R S0_PM3 = MAM_ITM_GRP_R.create("PM3");
		MAM_ITM_GRP_R S0_PM4 = MAM_ITM_GRP_R.create("PM4");
		MAM_ITM_GRP_R S0_PM5 = MAM_ITM_GRP_R.create("PM5");
		MAM_ITM_GRP_R S0_PM6 = MAM_ITM_GRP_R.create("PM6");
		MAM_ITM_GRP_R S0_PM7 = MAM_ITM_GRP_R.create("PM7");
		MAM_ITM_GRP_R S0_PM8 = MAM_ITM_GRP_R.create("PM8");
		MAM_ITM_GRP_R S0_PM9 = MAM_ITM_GRP_R.create("PM9");
		MAM_ITM_GRP_R S0_PM10 = MAM_ITM_GRP_R.create("PM10");
		
		MCDynamicSQLID DS0C_CHD_ITM_GRP = createDynamicSQLID("DS0C_CHD_ITM_GRP");
		MCDynamicSQLID DS0C_PAR_ITM_GRP = createDynamicSQLID("DS0C_PAR_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1160_MST_VER_CHG_Query_S01")
					.mainQuery()
					.select(
						S0_T1.chd_itm_cd,
						S0_T1.chd_itm_sub1,
						S0_T1.chd_itm_sub2,
						S0_T1.chd_itm_sub3,
						nvl(
							S0_M3.itm_nm,
							S0_M2.itm_nm
						).as("chd_itm_nm"),
						S0_T1.ver_no,
						S0_T1.par_itm_cd,
						S0_T1.par_itm_sub1,
						S0_T1.par_itm_sub2,
						S0_T1.par_itm_sub3,
						nvl(
							S0_M5.itm_nm,
							S0_M4.itm_nm
						).as("par_itm_nm"),
						S0_T1.bom_ptn,
						S0_T4.sno1,
						S0_T4.sno2,
						S0_T4.sno3,
						S0_T4.sno4,
						S0_T1.ver_chg_sts_typ,
						S0_M1.cmpl_flg,
						trunc(
							S0_T1.first_inst_st_tm,
							MCDateFmt.DD
						).as("first_inst_st_dt"),
						S0_T1.first_inst_st_tm.as("first_inst_st_hm"),
						S0_T1.first_inst_lot_no,
						S0_T1.first_inst_sublot_no,
						trunc(
							S0_T1.first_act_st_tm,
							MCDateFmt.DD
						).as("first_act_st_dt"),
						S0_T1.first_act_st_tm.as("first_act_st_hm"),
						S0_T1.first_act_lot_no,
						S0_T1.first_act_sublot_no,
						trunc(
							S0_T1.last_act_st_tm,
							MCDateFmt.DD
						).as("last_act_st_dt"),
						S0_T1.last_act_st_tm.as("last_act_st_hm"),
						S0_T1.last_act_lot_no,
						S0_T1.last_act_sublot_no,
						S0_M1.itm_ver_vld_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.site_cd,
						S0_M6.site_nm,
						S0_T1.wg_cd,
						S0_M9.wg_nm,
						S0_M1.purc_st_dt,
						S0_T1.first_mfg_inst_no,
						S0_T2.mfg_inst_no.as("first_act_mfg_inst_no"),
						S0_T1.first_mfg_act_no,
						S0_T3.mfg_inst_no.as("last_mfg_inst_no"),
						S0_T1.last_mfg_act_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_M2.itm_typ.as("chd_itm_typ"),
						S0_M7.itm_typ_d_cd.as("chd_itm_typ_d_cd"),
						S0_M7.itm_typ_d_nm.as("chd_itm_typ_d_nm"),
						S0_M4.itm_typ.as("par_itm_typ"),
						S0_M8.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						S0_M8.itm_typ_d_nm.as("par_itm_typ_d_nm"),
						addDynamicSelect(DS0C_CHD_ITM_GRP),
						addDynamicSelect(DS0C_PAR_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.first_mfg_act_no.eq(S0_T2.mfg_act_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.last_mfg_act_no.eq(S0_T3.mfg_act_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T4.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.chd_itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.chd_itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.chd_itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.chd_itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_T1.ver_no.eq(S0_M1.ver_no))
								.and(S0_T1.site_cd.eq(S0_M1.site_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M1.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M3.sno1))
								.and(S0_T4.sno2.eq(S0_M3.sno2))
								.and(S0_T4.sno3.eq(S0_M3.sno3))
								.and(S0_T4.sno4.eq(S0_M3.sno4))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.par_itm_cd.eq(S0_M4.itm_cd)
								.and(S0_T1.par_itm_sub1.eq(S0_M4.itm_sub1))
								.and(S0_T1.par_itm_sub2.eq(S0_M4.itm_sub2))
								.and(S0_T1.par_itm_sub3.eq(S0_M4.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M1.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_M5.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M5.sno1))
								.and(S0_T4.sno2.eq(S0_M5.sno2))
								.and(S0_T4.sno3.eq(S0_M5.sno3))
								.and(S0_T4.sno4.eq(S0_M5.sno4))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.site_cd.eq(S0_M6.site_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M2.itm_typ.eq(S0_M7.itm_typ)
								.and(S0_M2.itm_typ_d_cd.eq(S0_M7.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M4.itm_typ.eq(S0_M8.itm_typ)
								.and(S0_M4.itm_typ_d_cd.eq(S0_M8.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M9.wg_cd)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.wg_cd.eq(S0_V1.wg_cd)
							)
						)
						.addDynamicView(DS0C_CHD_ITM_GRP)
						.addDynamicView(DS0C_PAR_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.cmpl_flg.eq(bind("w_cmpl_flg_str")))
						.cutoff$and(S0_M2.itm_typ.like(bind("chd_itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
						.cutoff$and(S0_M7.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))
						.cutoff$and(S0_M1.itm_cd.like(bind("chd_itm_cd")))
						.cutoff$and(S0_M1.itm_sub1.like(bind("chd_itm_sub1")))
						.cutoff$and(S0_M1.itm_sub2.like(bind("chd_itm_sub2")))
						.cutoff$and(S0_M1.itm_sub3.like(bind("chd_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M3.itm_nm,
								S0_M2.itm_nm
							).like(bind("chd_itm_nm"))
						)
						.cutoff$and(S0_M1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_M1.purc_st_dt.gte(bind("purc_st_dt_fr")))
						.cutoff$and(S0_M1.purc_st_dt.lte(bind("purc_st_dt_to")))
						.cutoff$and(S0_M4.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_M8.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))
						.cutoff$and(S0_M4.itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_M4.itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_M4.itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_M4.itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M5.itm_nm,
								S0_M4.itm_nm
							).like(bind("par_itm_nm"))
						)
						.cutoff$and(S0_T1.par_itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T4.sno1.like(bind("sno1")))
						.cutoff$and(S0_T4.sno2.like(bind("sno2")))
						.cutoff$and(S0_T4.sno3.like(bind("sno3")))
						.cutoff$and(S0_T4.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M6.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T1.ver_chg_sts_typ.like(bind("ver_chg_sts_typ")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M9.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T1.first_inst_st_tm.gte(bind("first_inst_st_hm_fr")))
						.cutoff$and(S0_T1.first_inst_st_tm.lte(bind("first_inst_st_hm_to")))
						.cutoff$and(S0_T1.first_act_st_tm.gte(bind("first_act_st_hm_fr")))
						.cutoff$and(S0_T1.first_act_st_tm.lte(bind("first_act_st_hm_to")))
						.cutoff$and(S0_T1.last_act_st_tm.gte(bind("last_act_st_hm_fr")))
						.cutoff$and(S0_T1.last_act_st_tm.lte(bind("last_act_st_hm_to")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_CHD_ITM_GRP)
						.addDynamicPredicate(DS0C_PAR_ITM_GRP)
					)
					.orderBy(
						S0_T1.wg_cd.asc(),
						S0_T1.site_cd.asc(),
						S0_T1.chd_itm_cd.asc(),
						S0_T1.chd_itm_sub1.asc(),
						S0_T1.chd_itm_sub2.asc(),
						S0_T1.chd_itm_sub3.asc(),
						S0_T1.first_inst_st_tm.desc(),
						S0_T1.par_itm_cd.asc(),
						S0_T1.par_itm_sub1.asc(),
						S0_T1.par_itm_sub2.asc(),
						S0_T1.par_itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd1.as("chd_itm_grp_cd1"), S0_CM1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM1).on(S0_M2.itm_grp_cd1.eq(S0_CM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_CM1.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("chd_itm_grp_cd1"))).cutoff$and(S0_CM1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd2.as("chd_itm_grp_cd2"), S0_CM2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM2).on(S0_M2.itm_grp_cd2.eq(S0_CM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_CM2.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("chd_itm_grp_cd2"))).cutoff$and(S0_CM2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd3.as("chd_itm_grp_cd3"), S0_CM3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM3).on(S0_M2.itm_grp_cd3.eq(S0_CM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_CM3.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("chd_itm_grp_cd3"))).cutoff$and(S0_CM3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd4.as("chd_itm_grp_cd4"), S0_CM4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM4).on(S0_M2.itm_grp_cd4.eq(S0_CM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_CM4.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("chd_itm_grp_cd4"))).cutoff$and(S0_CM4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd5.as("chd_itm_grp_cd5"), S0_CM5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM5).on(S0_M2.itm_grp_cd5.eq(S0_CM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_CM5.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("chd_itm_grp_cd5"))).cutoff$and(S0_CM5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd6.as("chd_itm_grp_cd6"), S0_CM6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM6).on(S0_M2.itm_grp_cd6.eq(S0_CM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_CM6.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("chd_itm_grp_cd6"))).cutoff$and(S0_CM6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd7.as("chd_itm_grp_cd7"), S0_CM7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM7).on(S0_M2.itm_grp_cd7.eq(S0_CM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_CM7.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("chd_itm_grp_cd7"))).cutoff$and(S0_CM7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd8.as("chd_itm_grp_cd8"), S0_CM8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM8).on(S0_M2.itm_grp_cd8.eq(S0_CM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_CM8.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("chd_itm_grp_cd8"))).cutoff$and(S0_CM8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd9.as("chd_itm_grp_cd9"), S0_CM9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM9).on(S0_M2.itm_grp_cd9.eq(S0_CM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_CM9.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("chd_itm_grp_cd9"))).cutoff$and(S0_CM9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0C_CHD_ITM_GRP, S0_M2.itm_grp_cd10.as("chd_itm_grp_cd10"), S0_CM10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CM10).on(S0_M2.itm_grp_cd10.eq(S0_CM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_CM10.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("chd_itm_grp_cd10"))).cutoff$and(S0_CM10.itm_grp_nm.like(bind("chd_itm_grp_nm10")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd1.as("par_itm_grp_cd1"), S0_PM1.itm_grp_nm.as("par_itm_grp_nm1"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM1).on(S0_M4.itm_grp_cd1.eq(S0_PM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PM1.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd1.like(bind("par_itm_grp_cd1"))).cutoff$and(S0_PM1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd2.as("par_itm_grp_cd2"), S0_PM2.itm_grp_nm.as("par_itm_grp_nm2"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM2).on(S0_M4.itm_grp_cd2.eq(S0_PM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PM2.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd2.like(bind("par_itm_grp_cd2"))).cutoff$and(S0_PM2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd3.as("par_itm_grp_cd3"), S0_PM3.itm_grp_nm.as("par_itm_grp_nm3"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM3).on(S0_M4.itm_grp_cd3.eq(S0_PM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PM3.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd3.like(bind("par_itm_grp_cd3"))).cutoff$and(S0_PM3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd4.as("par_itm_grp_cd4"), S0_PM4.itm_grp_nm.as("par_itm_grp_nm4"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM4).on(S0_M4.itm_grp_cd4.eq(S0_PM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PM4.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd4.like(bind("par_itm_grp_cd4"))).cutoff$and(S0_PM4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd5.as("par_itm_grp_cd5"), S0_PM5.itm_grp_nm.as("par_itm_grp_nm5"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM5).on(S0_M4.itm_grp_cd5.eq(S0_PM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PM5.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd5.like(bind("par_itm_grp_cd5"))).cutoff$and(S0_PM5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd6.as("par_itm_grp_cd6"), S0_PM6.itm_grp_nm.as("par_itm_grp_nm6"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM6).on(S0_M4.itm_grp_cd6.eq(S0_PM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PM6.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd6.like(bind("par_itm_grp_cd6"))).cutoff$and(S0_PM6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd7.as("par_itm_grp_cd7"), S0_PM7.itm_grp_nm.as("par_itm_grp_nm7"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM7).on(S0_M4.itm_grp_cd7.eq(S0_PM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PM7.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd7.like(bind("par_itm_grp_cd7"))).cutoff$and(S0_PM7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd8.as("par_itm_grp_cd8"), S0_PM8.itm_grp_nm.as("par_itm_grp_nm8"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM8).on(S0_M4.itm_grp_cd8.eq(S0_PM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PM8.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd8.like(bind("par_itm_grp_cd8"))).cutoff$and(S0_PM8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd9.as("par_itm_grp_cd9"), S0_PM9.itm_grp_nm.as("par_itm_grp_nm9"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM9).on(S0_M4.itm_grp_cd9.eq(S0_PM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PM9.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd9.like(bind("par_itm_grp_cd9"))).cutoff$and(S0_PM9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0C_PAR_ITM_GRP, S0_M4.itm_grp_cd10.as("par_itm_grp_cd10"), S0_PM10.itm_grp_nm.as("par_itm_grp_nm10"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PM10).on(S0_M4.itm_grp_cd10.eq(S0_PM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PM10.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd10.like(bind("par_itm_grp_cd10"))).cutoff$and(S0_PM10.itm_grp_nm.like(bind("par_itm_grp_nm10"))))
			);
	}
}