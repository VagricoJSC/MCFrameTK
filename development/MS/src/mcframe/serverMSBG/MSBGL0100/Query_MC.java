package mcframe.serverMSBG.MSBGL0100;

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
	 * -- MSBGL0100_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL0100_MST_BILL_D_S01() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R S0_T3 = MST_BILL_ACST_R.create("T3");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAVM_RD_DPT_R S0_M13 = MAVM_RD_DPT_R.create("M13");
		MAM_BP_R S0_M16 = MAM_BP_R.create("M16");
		MAM_ITM_R S0_M17 = MAM_ITM_R.create("M17");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0100_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ac_dt,
						S0_T1.bill_d_typ,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.ar_typ,
						S0_T1.act_no,
						S0_T1.act_rev,
						S0_T1.act_seq,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T1.iv_no,
						S0_T2.wrk_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M17.itm_nm
						).as("itm_nm"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.wrk_no.as("sls_wrk_no"),
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M17.dscnt_itm_flg,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						bracket(
							S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						bracket(
							S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.rcv_mtd_cd,
						S0_T3.acst_cd,
						S0_T3.ar_dpt_cd,
						S0_M5.dpt_nm.as("ar_dpt_nm"),
						S0_T3.wg_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						nvl(
							S0_T1.dlv_nm,
							S0_M16.bp_nm
						).as("dlv_nm"),
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.sls_dpt_cd,
						S0_M11.dpt_nm.as("sls_dpt_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.ship_dlv_slip_d_no,
						S0_T1.ship_dlv_slip_multi_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.bill_d_no,
						S0_T1.crryovr_src_bill_d_no,
						S0_T1.valid_flg,
						addDynamicSelect(DS0C_ACST_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.bill_acst_no.eq(S0_T3.bill_acst_no)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T3.ar_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.innerJoin(S0_M13).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_M13.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M16.bp_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M17.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M17.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M17.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M17.itm_sub3))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ACST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_d_typ.eq(bind("bill_d_typ")))
						.and(S0_T1.ac_ym.eq(bind("ac_ym")))
						.cutoff$and(
							bracket(
								bind("wrk_null_flg_str").eq(bind("wrk_null_flg_str"))
								.and(S0_T2.wrk_no.isNull())
							)
						)
						.cutoff$and(S0_T2.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ar_typ.like(bind("ar_typ")))
						.cutoff$and(S0_T3.acst_cd.like(bind("acst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no")))
						.addDynamicPredicate(DS0C_ACST_GRP)
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.act_no.asc(),
						S0_T1.act_seq.asc(),
						S0_T1.act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T2.wrk_no.eq(S0_T5.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T3.acst_cd.eq(S0_M4.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("acst_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T3.wg_cd.eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("wg_nm")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd1.as("acst_grp_cd1"), S0_MM1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M4.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd2.as("acst_grp_cd2"), S0_MM2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M4.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd3.as("acst_grp_cd3"), S0_MM3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M4.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd4.as("acst_grp_cd4"), S0_MM4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M4.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd5.as("acst_grp_cd5"), S0_MM5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M4.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd6.as("acst_grp_cd6"), S0_MM6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M4.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd7.as("acst_grp_cd7"), S0_MM7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M4.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd8.as("acst_grp_cd8"), S0_MM8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M4.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd9.as("acst_grp_cd9"), S0_MM9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M4.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_M4.bp_grp_cd10.as("acst_grp_cd10"), S0_MM10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M4.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("acst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("sls_wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("rcv_mtd_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_mtd_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0100_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL0100_MST_MLY_AR_BAL_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_CUR_R S0_M1 = MAM_CUR_R.create("M1");
		MAM_CUR_R S0_M2 = MAM_CUR_R.create("M2");
		MST_MLY_AR_BAL_R S1_TA1 = MST_MLY_AR_BAL_R.create("TA1");
		MST_WRK_R S1_TA2 = MST_WRK_R.create("TA2");
		MAM_CUR_R S1_MA1 = MAM_CUR_R.create("MA1");
		MAM_BP_R S1_MA2 = MAM_BP_R.create("MA2");
		MAM_DPT_R S1_MA3 = MAM_DPT_R.create("MA3");
		MAM_WG_R S1_MA4 = MAM_WG_R.create("MA4");
		MAM_CUR_R S1_MA5 = MAM_CUR_R.create("MA5");
		MAVM_RD_DPT_R S1_MA6 = MAVM_RD_DPT_R.create("MA6");
		MAM_BP_GRP_R S1_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S1_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S1_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S1_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S1_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S1_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S1_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S1_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S1_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S1_MM10 = MAM_BP_GRP_R.create("MM10");
		MST_RCV_ACT_D_R S2_TB1 = MST_RCV_ACT_D_R.create("TB1");
		MST_RCV_ACT_R S2_TB2 = MST_RCV_ACT_R.create("TB2");
		MST_NOTE_R S2_TB3 = MST_NOTE_R.create("TB3");
		MST_RCV_ACT_D_R S3_TB4 = MST_RCV_ACT_D_R.create("TB4");
		MST_RCV_ACT_R S3_TB5 = MST_RCV_ACT_R.create("TB5");
		MST_NOTE_R S3_TB6 = MST_NOTE_R.create("TB6");
		MST_MLY_AR_BAL_R S4_TC1 = MST_MLY_AR_BAL_R.create("TC1");
		MST_WRK_R S4_TC2 = MST_WRK_R.create("TC2");
		MAM_CUR_R S4_MB1 = MAM_CUR_R.create("MB1");
		MAM_BP_R S4_MB2 = MAM_BP_R.create("MB2");
		MAM_DPT_R S4_MB3 = MAM_DPT_R.create("MB3");
		MAM_WG_R S4_MB4 = MAM_WG_R.create("MB4");
		MAM_CUR_R S4_MB5 = MAM_CUR_R.create("MB5");
		MAVM_RD_DPT_R S4_MB6 = MAVM_RD_DPT_R.create("MB6");
		MAM_BP_GRP_R S4_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S4_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S4_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S4_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S4_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S4_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S4_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S4_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S4_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S4_MM10 = MAM_BP_GRP_R.create("MM10");
		MST_RCV_ACT_D_R S5_TD1 = MST_RCV_ACT_D_R.create("TD1");
		MST_RCV_ACT_R S5_TD2 = MST_RCV_ACT_R.create("TD2");
		MST_NOTE_R S5_TD3 = MST_NOTE_R.create("TD3");
		MST_RCV_ACT_D_R S6_TD4 = MST_RCV_ACT_D_R.create("TD4");
		MST_RCV_ACT_R S6_TD5 = MST_RCV_ACT_R.create("TD5");
		MST_NOTE_R S6_TD6 = MST_NOTE_R.create("TD6");
		MST_MLY_AR_BAL_R S7_TE1 = MST_MLY_AR_BAL_R.create("TE1");
		MST_MLY_AR_BAL_R S8_TF1 = MST_MLY_AR_BAL_R.create("TF1");
		
		MCDynamicSQLID DS1C_ACST_GRP = createDynamicSQLID("DS1C_ACST_GRP");
		MCDynamicSQLID DS4C_ACST_GRP = createDynamicSQLID("DS4C_ACST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0100_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_VA1.pr("base_cur_cd"),
						S0_M2.cur_nm.as("base_cur_nm"),
						nvl2(
							bind("trd_cur_cd"),
							S0_VA1.pr("trd_cur_cd"),
							S0_VA1.pr("base_cur_cd")
						).as("cur_cd"),
						nvl2(
							bind("trd_cur_cd"),
							S0_M1.amt_dec_place,
							S0_M2.amt_dec_place
						).as("amt_dec_place"),
						nvl2(
							bind("trd_cur_cd"),
							S0_M1.upri_dec_place,
							S0_M2.upri_dec_place
						).as("upri_dec_place"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.init_bal),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_init_bal),
									value(0)
								)
							)
						).as("init_bal"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr("mly_rcv_amt"),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr("base_cur_mly_rcv_amt"),
									value(0)
								)
							)
						).as("rcv_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr("setoff_amt"),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr("base_cur_setoff_amt"),
									value(0)
								)
							)
						).as("setoff_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.sls_amt),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_sls_amt),
									value(0)
								)
							)
						).as("sls_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.ret_amt),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_ret_amt),
									value(0)
								)
							)
						).as("ret_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.dscnt_amt),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_dscnt_amt),
									value(0)
								)
							)
						).as("dscnt_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.tax_amt),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_tax_amt),
									value(0)
								)
							)
						).as("tax_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.sw_to_amt),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_sw_to_amt),
									value(0)
								)
							)
						).as("sw_to_amt"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.end_bal),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.base_cur_end_bal),
									value(0)
								)
							)
						).as("end_bal"),
						nvl2(
							bind("trd_cur_cd"),
							sum(
								nvl(
									S0_VA1.pr("not_appl_note"),
									value(0)
								)
							),
							sum(
								nvl(
									S0_VA1.pr("base_cur_not_appl_note"),
									value(0)
								)
							)
						).as("not_appl_note_amt"),
						nvl2(
							bind("trd_cur_cd"),
							value(0),
							sum(
								nvl(
									S0_VA1.pr(S1_TA1.exc_gain_loss),
									value(0)
								)
							)
						).as("exc_gain_loss")
					)
					.from(
						subQuery()
						.select(
							nvl2(
								bind("trd_cur_cd"),
								S1_TA1.trd_cur_cd,
								nullValue()
							).as("trd_cur_cd"),
							nvl2(
								bind("trd_cur_cd"),
								nullValue(),
								S1_TA1.base_cur_cd
							).as("base_cur_cd"),
							S1_TA1.init_bal,
							S1_TA1.cash_amt.add(S1_TA1.note_amt).add(S1_TA1.xfr_amt).add(S1_TA1.sw_amt).as("mly_rcv_amt"),
							S1_TA1.setoff_amt,
							S1_TA1.sls_amt,
							S1_TA1.ret_amt,
							S1_TA1.dscnt_amt,
							S1_TA1.tax_amt,
							S1_TA1.sw_to_amt,
							S1_TA1.end_bal,
							bracket(
								subQuery()
								.select(
									nvl(
										sum(S2_TB1.trd_cur_amt1),
										value(0)
									)
								)
								.from(
									S2_TB1
									.innerJoin(S2_TB2).on(
										bracket(
											S2_TB1.rcv_act_no.eq(S2_TB2.rcv_act_no)
										)
									)
									.innerJoin(S2_TB3).on(
										bracket(
											S2_TB2.note_mng_no.eq(S2_TB3.note_mng_no)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_TA1.acst_cd.eq(S2_TB1.acst_cd))
									.and(S1_TA1.trd_cur_cd.eq(S2_TB2.trd_cur_cd))
									.and(S1_TA1.ar_dpt_cd.eq(S2_TB1.ar_dpt_cd))
									.and(S1_TA1.iv_no.eq(S2_TB1.iv_no))
									.and(
										S1_TA1.wrk_no.eq(S2_TB1.wrk_no)
										.or(
											S1_TA1.wrk_no.isNull()
											.and(S2_TB1.wrk_no.isNull())
										)
									)
									.and(S1_TA1.ar_typ.eq(S2_TB1.ar_typ))
									.and(S1_TA1.ac_ym.gte(S2_TB2.ac_ym))
									.and(
										S2_TB3.due_dt.gt(decode(
												trunc(
													S1_TA1.ac_ym,
													MCDateFmt.MM
												),
												trunc(
													bind("today"),
													MCDateFmt.MM
												),
												bind("today"),
												lastDay(S1_TA1.ac_ym)
											)
										)
									)
									.and(S2_TB2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							).as("not_appl_note"),
							S1_TA1.base_cur_init_bal,
							S1_TA1.base_cur_cash_amt.add(S1_TA1.base_cur_note_amt).add(S1_TA1.base_cur_xfr_amt).add(S1_TA1.base_cur_sw_amt).as("base_cur_mly_rcv_amt"),
							S1_TA1.base_cur_setoff_amt,
							S1_TA1.base_cur_sls_amt,
							S1_TA1.base_cur_ret_amt,
							S1_TA1.base_cur_dscnt_amt,
							S1_TA1.base_cur_tax_amt,
							S1_TA1.base_cur_sw_to_amt,
							S1_TA1.base_cur_end_bal,
							bracket(
								subQuery()
								.select(
									nvl(
										sum(S3_TB4.base_cur_amt1),
										value(0)
									)
								)
								.from(
									S3_TB4
									.innerJoin(S3_TB5).on(
										bracket(
											S3_TB4.rcv_act_no.eq(S3_TB5.rcv_act_no)
										)
									)
									.innerJoin(S3_TB6).on(
										bracket(
											S3_TB5.note_mng_no.eq(S3_TB6.note_mng_no)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_TA1.acst_cd.eq(S3_TB4.acst_cd))
									.and(S1_TA1.trd_cur_cd.eq(S3_TB5.trd_cur_cd))
									.and(S1_TA1.ar_dpt_cd.eq(S3_TB4.ar_dpt_cd))
									.and(S1_TA1.iv_no.eq(S3_TB4.iv_no))
									.and(
										S1_TA1.wrk_no.eq(S3_TB4.wrk_no)
										.or(
											S1_TA1.wrk_no.isNull()
											.and(S3_TB4.wrk_no.isNull())
										)
									)
									.and(S1_TA1.ar_typ.eq(S3_TB4.ar_typ))
									.and(S1_TA1.ac_ym.gte(S3_TB5.ac_ym))
									.and(
										S3_TB6.due_dt.gt(decode(
												trunc(
													S1_TA1.ac_ym,
													MCDateFmt.MM
												),
												trunc(
													bind("today"),
													MCDateFmt.MM
												),
												bind("today"),
												lastDay(S1_TA1.ac_ym)
											)
										)
									)
									.and(S3_TB5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							).as("base_cur_not_appl_note"),
							S1_TA1.exc_gain_loss,
							S1_MA3.dpt_nm.as("ar_dpt_nm")
						)
						.from(
							S1_TA1
							.leftOuterJoin(S1_TA2).on(
								bracket(
									S1_TA1.wrk_no.eq(S1_TA2.wrk_no)
								)
							)
							.leftOuterJoin(S1_MA1).on(
								bracket(
									S1_TA1.trd_cur_cd.eq(S1_MA1.cur_cd)
								)
							)
							.leftOuterJoin(S1_MA2).on(
								bracket(
									S1_TA1.acst_cd.eq(S1_MA2.bp_cd)
								)
							)
							.leftOuterJoin(S1_MA3).on(
								bracket(
									S1_TA1.ar_dpt_cd.eq(S1_MA3.dpt_cd)
									.and(S1_TA1.ac_ym.between(S1_MA3.st_dt, S1_MA3.end_dt))
								)
							)
							.leftOuterJoin(S1_MA4).on(
								bracket(
									S1_MA3.wg_cd.eq(S1_MA4.wg_cd)
								)
							)
							.leftOuterJoin(S1_MA5).on(
								bracket(
									S1_TA1.base_cur_cd.eq(S1_MA5.cur_cd)
								)
							)
							.innerJoin(S1_MA6).on(
								bracket(
									S1_TA1.ar_dpt_cd.eq(S1_MA6.dpt_cd)
								)
							)
							.addDynamicView(DS1C_ACST_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_TA1.ac_ym.eq(bind("ac_ym")))
							.cutoff$and(
								bracket(
									bind("wrk_null_flg_str").eq(bind("wrk_null_flg_str"))
									.and(S1_TA1.wrk_no.isNull())
								)
							)
							.cutoff$and(S1_TA1.trd_cur_cd.eq(bind("trd_cur_cd")))
							.cutoff$and(S1_TA1.ar_typ.like(bind("ar_typ")))
							.cutoff$and(S1_TA1.acst_cd.like(bind("acst_cd")))
							.cutoff$and(S1_MA2.bp_nm.like(bind("acst_nm")))
							.cutoff$and(S1_TA1.ar_dpt_cd.like(bind("ar_dpt_cd")))
							.cutoff$and(S1_MA3.dpt_nm.like(bind("ar_dpt_nm")))
							.cutoff$and(S1_MA3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_MA4.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_TA1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_TA1.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_TA2.wrk_nm.like(bind("wrk_nm")))
							.addDynamicPredicate(DS1C_ACST_GRP)
						)
						.unionAll(
							subQuery()
							.select(
								nvl2(
									bind("trd_cur_cd"),
									S4_TC1.trd_cur_cd,
									nullValue()
								).as("trd_cur_cd"),
								nvl2(
									bind("trd_cur_cd"),
									nullValue(),
									S4_TC1.base_cur_cd
								).as("base_cur_cd"),
								S4_TC1.end_bal.as("init_bal"),
								value(0).as("mly_rcv_amt"),
								value(0).as("setoff_amt"),
								value(0).as("sls_amt"),
								value(0).as("ret_amt"),
								value(0).as("dscnt_amt"),
								value(0).as("tax_amt"),
								value(0).as("sw_to_amt"),
								S4_TC1.end_bal,
								bracket(
									subQuery()
									.select(
										nvl(
											sum(S5_TD1.trd_cur_amt1),
											value(0)
										)
									)
									.from(
										S5_TD1
										.innerJoin(S5_TD2).on(
											bracket(
												S5_TD1.rcv_act_no.eq(S5_TD2.rcv_act_no)
											)
										)
										.innerJoin(S5_TD3).on(
											bracket(
												S5_TD2.note_mng_no.eq(S5_TD3.note_mng_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S4_TC1.acst_cd.eq(S5_TD1.acst_cd))
										.and(S4_TC1.trd_cur_cd.eq(S5_TD2.trd_cur_cd))
										.and(S4_TC1.ar_dpt_cd.eq(S5_TD1.ar_dpt_cd))
										.and(S4_TC1.iv_no.eq(S5_TD1.iv_no))
										.and(
											S4_TC1.wrk_no.eq(S5_TD1.wrk_no)
											.or(
												S4_TC1.wrk_no.isNull()
												.and(S5_TD1.wrk_no.isNull())
											)
										)
										.and(S4_TC1.ar_typ.eq(S5_TD1.ar_typ))
										.and(bind("ac_ym").gte(S5_TD2.ac_ym))
										.and(
											S5_TD3.due_dt.gt(decode(
													trunc(
														bind("ac_ym"),
														MCDateFmt.MM
													),
													trunc(
														bind("today"),
														MCDateFmt.MM
													),
													bind("today"),
													lastDay(bind("ac_ym"))
												)
											)
										)
										.and(S5_TD2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									)
								).as("not_appl_note"),
								S4_TC1.base_cur_end_bal.as("base_cur_init_bal"),
								value(0).as("base_cur_mly_rcv_amt"),
								value(0).as("base_cur_setoff_amt"),
								value(0).as("base_cur_sls_amt"),
								value(0).as("base_cur_ret_amt"),
								value(0).as("base_cur_dscnt_amt"),
								value(0).as("base_cur_tax_amt"),
								value(0).as("base_cur_sw_to_amt"),
								S4_TC1.base_cur_end_bal,
								bracket(
									subQuery()
									.select(
										nvl(
											sum(S6_TD4.base_cur_amt1),
											value(0)
										)
									)
									.from(
										S6_TD4
										.innerJoin(S6_TD5).on(
											bracket(
												S6_TD4.rcv_act_no.eq(S6_TD5.rcv_act_no)
											)
										)
										.innerJoin(S6_TD6).on(
											bracket(
												S6_TD5.note_mng_no.eq(S6_TD6.note_mng_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S4_TC1.acst_cd.eq(S6_TD4.acst_cd))
										.and(S4_TC1.trd_cur_cd.eq(S6_TD5.trd_cur_cd))
										.and(S4_TC1.ar_dpt_cd.eq(S6_TD4.ar_dpt_cd))
										.and(S4_TC1.iv_no.eq(S6_TD4.iv_no))
										.and(S4_TC1.ar_typ.eq(S6_TD4.ar_typ))
										.and(
											S4_TC1.wrk_no.eq(S6_TD4.wrk_no)
											.or(
												S4_TC1.wrk_no.isNull()
												.and(S6_TD4.wrk_no.isNull())
											)
										)
										.and(bind("ac_ym").gte(S6_TD5.ac_ym))
										.and(
											S6_TD6.due_dt.gt(decode(
													trunc(
														bind("ac_ym"),
														MCDateFmt.MM
													),
													trunc(
														bind("today"),
														MCDateFmt.MM
													),
													bind("today"),
													lastDay(bind("ac_ym"))
												)
											)
										)
										.and(S6_TD5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									)
								).as("base_cur_not_appl_note"),
								value(0).as("exc_gain_loss"),
								S4_MB3.dpt_nm.as("ar_dpt_nm")
							)
							.from(
								S4_TC1
								.leftOuterJoin(S4_TC2).on(
									bracket(
										S4_TC1.wrk_no.eq(S4_TC2.wrk_no)
									)
								)
								.leftOuterJoin(S4_MB1).on(
									bracket(
										S4_TC1.trd_cur_cd.eq(S4_MB1.cur_cd)
									)
								)
								.leftOuterJoin(S4_MB2).on(
									bracket(
										S4_TC1.acst_cd.eq(S4_MB2.bp_cd)
									)
								)
								.leftOuterJoin(S4_MB3).on(
									bracket(
										S4_TC1.ar_dpt_cd.eq(S4_MB3.dpt_cd)
										.and(S4_TC1.ac_ym.between(S4_MB3.st_dt, S4_MB3.end_dt))
									)
								)
								.leftOuterJoin(S4_MB4).on(
									bracket(
										S4_MB3.wg_cd.eq(S4_MB4.wg_cd)
									)
								)
								.leftOuterJoin(S4_MB5).on(
									bracket(
										S4_TC1.base_cur_cd.eq(S4_MB5.cur_cd)
									)
								)
								.innerJoin(S4_MB6).on(
									bracket(
										S4_TC1.ar_dpt_cd.eq(S4_MB6.dpt_cd)
									)
								)
								.addDynamicView(DS4C_ACST_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S7_TE1)
										.where(
											value(0).eq(value(0))
											.and(S7_TE1.ac_ym.eq(bind("ac_ym")))
											.and(S7_TE1.acst_cd.eq(S4_TC1.acst_cd))
											.and(S7_TE1.trd_cur_cd.eq(S4_TC1.trd_cur_cd))
											.and(S7_TE1.iv_no.eq(S4_TC1.iv_no))
											.and(S7_TE1.ar_dpt_cd.eq(S4_TC1.ar_dpt_cd))
											.and(S7_TE1.ar_typ.eq(S4_TC1.ar_typ))
											.and(
												nvl(
													S7_TE1.wrk_no,
													value(MAC_STR.NULL_VAL.value())
												).eq(nvl(
														S4_TC1.wrk_no,
														value(MAC_STR.NULL_VAL.value())
													)
												)
											)
										)
									)
								)
								.and(
									S4_TC1.ac_ym.eq(subQuery()
										.select(max(S8_TF1.ac_ym))
										.from(S8_TF1)
										.where(
											value(0).eq(value(0))
											.and(S8_TF1.ac_ym.lt(bind("ac_ym")))
											.and(S8_TF1.acst_cd.eq(S4_TC1.acst_cd))
											.and(S8_TF1.trd_cur_cd.eq(S4_TC1.trd_cur_cd))
											.and(S8_TF1.iv_no.eq(S4_TC1.iv_no))
											.and(S8_TF1.ar_dpt_cd.eq(S4_TC1.ar_dpt_cd))
											.and(S8_TF1.ar_typ.eq(S4_TC1.ar_typ))
											.and(
												nvl(
													S8_TF1.wrk_no,
													value(MAC_STR.NULL_VAL.value())
												).eq(nvl(
														S4_TC1.wrk_no,
														value(MAC_STR.NULL_VAL.value())
													)
												)
											)
										)
									)
								)
								.and(S4_TC1.ac_ym.lt(bind("ac_ym")))
								.cutoff$and(
									bracket(
										bind("wrk_null_flg_str").eq(bind("wrk_null_flg_str"))
										.and(S4_TC1.wrk_no.isNull())
									)
								)
								.cutoff$and(S4_TC1.trd_cur_cd.eq(bind("trd_cur_cd")))
								.cutoff$and(S4_TC1.ar_typ.like(bind("ar_typ")))
								.cutoff$and(S4_TC1.acst_cd.like(bind("acst_cd")))
								.cutoff$and(S4_MB2.bp_nm.like(bind("acst_nm")))
								.cutoff$and(S4_TC1.ar_dpt_cd.like(bind("ar_dpt_cd")))
								.cutoff$and(S4_MB3.dpt_nm.like(bind("ar_dpt_nm")))
								.cutoff$and(S4_MB3.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S4_MB4.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S4_TC1.iv_no.like(bind("iv_no")))
								.cutoff$and(S4_TC1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S4_TC2.wrk_nm.like(bind("wrk_nm")))
								.addDynamicPredicate(DS4C_ACST_GRP)
							)
						).view(S0_VA1)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_VA1.pr("trd_cur_cd").eq(S0_M1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_VA1.pr("base_cur_cd").eq(S0_M2.cur_cd)
							)
						)
					)
					.groupBy(
						S0_VA1.pr("base_cur_cd"),
						S0_M2.cur_nm,
						S0_M2.amt_dec_place,
						S0_M2.upri_dec_place,
						S0_VA1.pr("trd_cur_cd"),
						S0_M1.amt_dec_place,
						S0_M1.upri_dec_place
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("acst_grp_flg1"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM1).on(S1_MA2.bp_grp_cd1.eq(S1_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM1.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S1_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM2).on(S1_MA2.bp_grp_cd2.eq(S1_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM2.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S1_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM3).on(S1_MA2.bp_grp_cd3.eq(S1_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM3.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S1_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM4).on(S1_MA2.bp_grp_cd4.eq(S1_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM4.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S1_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM5).on(S1_MA2.bp_grp_cd5.eq(S1_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM5.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S1_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM6).on(S1_MA2.bp_grp_cd6.eq(S1_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM6.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S1_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM7).on(S1_MA2.bp_grp_cd7.eq(S1_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM7.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S1_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM8).on(S1_MA2.bp_grp_cd8.eq(S1_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM8.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S1_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM9).on(S1_MA2.bp_grp_cd9.eq(S1_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM9.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S1_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.view(DS1C_ACST_GRP, v -> v.leftOuterJoin(S1_MM10).on(S1_MA2.bp_grp_cd10.eq(S1_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM10.bp_grp_typ))))
					.predicate(DS1C_ACST_GRP, p -> p.cutoff$and(S1_MA2.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S1_MM10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("acst_grp_flg1"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM1).on(S4_MB2.bp_grp_cd1.eq(S4_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S4_MM1.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S4_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM2).on(S4_MB2.bp_grp_cd2.eq(S4_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S4_MM2.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S4_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM3).on(S4_MB2.bp_grp_cd3.eq(S4_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S4_MM3.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S4_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM4).on(S4_MB2.bp_grp_cd4.eq(S4_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S4_MM4.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S4_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM5).on(S4_MB2.bp_grp_cd5.eq(S4_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S4_MM5.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S4_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM6).on(S4_MB2.bp_grp_cd6.eq(S4_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S4_MM6.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S4_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM7).on(S4_MB2.bp_grp_cd7.eq(S4_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S4_MM7.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S4_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM8).on(S4_MB2.bp_grp_cd8.eq(S4_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S4_MM8.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S4_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM9).on(S4_MB2.bp_grp_cd9.eq(S4_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S4_MM9.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S4_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.view(DS4C_ACST_GRP, v -> v.leftOuterJoin(S4_MM10).on(S4_MB2.bp_grp_cd10.eq(S4_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S4_MM10.bp_grp_typ))))
					.predicate(DS4C_ACST_GRP, p -> p.cutoff$and(S4_MB2.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S4_MM10.bp_grp_nm.like(bind("acst_grp_nm10"))))
			);
	}
	/**
	 * -- MSBGL0100_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0100_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0100_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_act_d_no.as("act_d_no"),
						S0_T1.rcv_act_d_seq.as("act_d_seq"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(value(0))
								.otherwise(S0_T1.trd_cur_amt1)
						).as("trd_cur_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T1.trd_cur_amt1)
								.otherwise(S0_T1.trd_cur_amt2)
						).as("setoff_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(value(0))
								.otherwise(S0_T1.base_cur_amt1)
						).as("base_cur_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T1.base_cur_amt1)
								.otherwise(S0_T1.base_cur_amt2)
						).as("base_cur_setoff_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.rcv_act_no.eq(S0_T1.rcv_act_no)
								.and(S0_T2.rcv_act_seq.eq(S0_T1.rcv_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_d_no.eq(bind("act_d_no")))
						.and(S0_T1.rcv_act_d_seq.eq(bind("act_d_seq")))
					)
			);
	}
}