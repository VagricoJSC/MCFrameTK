package mcframe.serverMBBB.MBBBL0120;

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
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBBL0120_MBT_JOURNAL_Query_S01
	 */
	static MCQueryPlan MBBBL0120_MBT_JOURNAL_S01() {
		MCDynamicSQLID DX1D = createDynamicSQLID("DX1D");
		MCTempView S0_T0 = createTempView("T0");
		MBT_JOURNAL_R S0_T1 = MBT_JOURNAL_R.create("T1");
		MAM_AC_DPT_R S0_M2 = MAM_AC_DPT_R.create("M2");
		MAM_AC_DPT_R S0_M14 = MAM_AC_DPT_R.create("M14");
		MBT_JOURNAL_R S1_T = MBT_JOURNAL_R.create("T");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_AC_DPT_R S1_AC_DPT = MAM_AC_DPT_R.create("AC_DPT");
		MAM_ACCOUNT_R S1_AC = MAM_ACCOUNT_R.create("AC");
		MAM_SUB_ACCOUNT_R S1_SUB_AC = MAM_SUB_ACCOUNT_R.create("SUB_AC");
		MAM_AC_TAX_R S1_AC_TAX = MAM_AC_TAX_R.create("AC_TAX");
		MAM_BP_GRP_R S1_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S1_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S1_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S1_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S1_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S1_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S1_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S1_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S1_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S1_MM110 = MAM_BP_GRP_R.create("MM110");
		
		MCDynamicSQLID DS1C_BP_GRP = createDynamicSQLID("DS1C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL0120_MBT_JOURNAL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.jnl_grp_no,
						S0_T1.ac_ym,
						S0_T1.ac_if_typ,
						S0_T1.slip_cnt_id,
						S0_T1.jnl_no,
						S0_T1.jnl_no_seq,
						S0_T1.dc_typ,
						S0_T1.ac_slip_dt,
						S0_T1.ac_dt,
						S0_T1.slip_no,
						S0_T1.slip_seq_no,
						S0_T1.dpt_cd,
						S0_M2.ac_dpt_nm.as("dpt_nm"),
						S0_T1.ac_cd,
						S0_T1.sub_ac_cd,
						S0_T1.project_cd,
						S0_T1.summary_cd0,
						S0_T1.summary_cd1,
						S0_T1.summary_cd2,
						S0_T1.summary_cd3,
						S0_T1.summary_cd4,
						S0_T1.summary_cd5,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.bp_typ,
						S0_T1.bp_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_sum_amt,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_sum_amt,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_cd,
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_sum_amt,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_typ,
						S0_T1.tax_cd,
						S0_T1.foreign_flg,
						S0_T1.xrate,
						S0_T1.xrate_cd,
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_cd,
						S0_T1.iv_no,
						S0_T1.bill_no,
						S0_T1.slo_no,
						S0_T1.po_no,
						S0_T1.usr_cd,
						S0_T1.cls_jnl_typ,
						S0_T1.alloc_jnl_flg,
						S0_T1.spot_flg,
						S0_T1.sttl_schd_dt,
						S0_T1.sttl_cd,
						S0_T1.bank_ac_cd,
						S0_T1.other_ac_cd,
						S0_T1.other_sub_ac_cd,
						S0_T1.other_dpt_cd,
						S0_M14.ac_dpt_nm.as("other_dpt_nm"),
						S0_T1.abstract1,
						S0_T1.abstract2,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.sub_char4,
						S0_T1.sub_char5,
						S0_T1.sub_char6,
						S0_T1.sub_char7,
						S0_T1.sub_char8,
						S0_T1.sub_char9,
						S0_T1.sub_char10,
						S0_T1.sub_num1,
						S0_T1.sub_num2,
						S0_T1.sub_num3,
						S0_T1.sub_dt1,
						S0_T1.sub_dt2,
						S0_T1.sub_dt3,
						S0_T1.send_flg,
						S0_T1.jnl_ptn,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						subQuery()
						.selectDistinct(
							S1_T.jnl_grp_no,
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no
						)
						.from(
							S1_T
							.addDynamicView(DX1D)
							.addDynamicView(DS1C_BP_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.jnl_grp_no.eq(bind("jnl_grp_no")))
							.cutoff$and(S1_T.ac_ym.eq(bind("ac_ym")))
							.cutoff$and(S1_T.ac_if_typ.like(bind("ac_if_typ")))
							.cutoff$and(S1_T.slip_cnt_id.like(bind("slip_cnt_id")))
							.cutoff$and(S1_T.jnl_no.like(bind("jnl_no")))
							.cutoff$and(S1_T.tax_cd.like(bind("tax_cd")))
							.cutoff$and(S1_T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S1_T.ac_cd.like(bind("ac_cd")))
							.cutoff$and(S1_T.sub_ac_cd.like(bind("sub_ac_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_AC_DPT.ac_dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(S1_AC.ac_nm.like(bind("ac_nm")))
							.cutoff$and(S1_SUB_AC.sub_ac_nm.like(bind("sub_ac_nm")))
							.addDynamicPredicate()
							.cutoff$and(S1_AC_TAX.ac_tax_nm.like(bind("tax_nm")))
							.addDynamicPredicate(DS1C_BP_GRP)
						).view(S0_T0)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.jnl_grp_no.eq(S0_T0.pr(S1_T.jnl_grp_no))
								.and(S0_T1.ac_ym.eq(S0_T0.pr(S1_T.ac_ym)))
								.and(S0_T1.ac_if_typ.eq(S0_T0.pr(S1_T.ac_if_typ)))
								.and(S0_T1.slip_cnt_id.eq(S0_T0.pr(S1_T.slip_cnt_id)))
								.and(S0_T1.jnl_no.eq(S0_T0.pr(S1_T.jnl_no)))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.ac_dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.ac_dpt_cd.eq(S0_T1.other_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
					)
					.orderBy(
						S0_T1.ac_ym.asc(),
						S0_T1.ac_if_typ.asc(),
						S0_T1.slip_cnt_id.asc(),
						S0_T1.jnl_no.asc(),
						S0_T1.dc_typ.asc(),
						S0_T1.jnl_no_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dpt_nm"))
					.view(DX1D, v -> v.leftOuterJoin(S1_AC_DPT).on(bracket(S1_AC_DPT.ac_dpt_cd.eq(S1_T.dpt_cd).and(S1_T.ac_dt.between(S1_AC_DPT.st_dt, S1_AC_DPT.end_dt)).and(bind("dpt_nm").isNotNull())))),
				when(boundOr("ac_nm"))
					.view(DX1D, v -> v.leftOuterJoin(S1_AC).on(bracket(S1_AC.ac_cd.eq(S1_T.ac_cd).and(bind("ac_nm").isNotNull())))),
				when(boundOr("sub_ac_nm"))
					.view(DX1D, v -> v.leftOuterJoin(S1_SUB_AC).on(bracket(S1_SUB_AC.ac_cd.eq(S1_T.ac_cd).and(S1_SUB_AC.sub_ac_cd.eq(S1_T.sub_ac_cd)).and(bind("sub_ac_nm").isNotNull())))),
				when(boundOr("tax_nm"))
					.view(DX1D, v -> v.leftOuterJoin(S1_AC_TAX).on(bracket(S1_AC_TAX.ac_tax_cd.eq(S1_T.tax_cd).and(bind("tax_nm").isNotNull())))),
				when(boundOr("bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm"))
					.view(DX1D, v -> v.leftOuterJoin(S1_BP).on(bracket(S1_BP.bp_cd.eq(S1_T.bp_cd))))
					.predicate(DX1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM11).on(S1_BP.bp_grp_cd1.eq(S1_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM11.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_MM11.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM12).on(S1_BP.bp_grp_cd2.eq(S1_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM12.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_MM12.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM13).on(S1_BP.bp_grp_cd3.eq(S1_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM13.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_MM13.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM14).on(S1_BP.bp_grp_cd4.eq(S1_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM14.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_MM14.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM15).on(S1_BP.bp_grp_cd5.eq(S1_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM15.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_MM15.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM16).on(S1_BP.bp_grp_cd6.eq(S1_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM16.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_MM16.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM17).on(S1_BP.bp_grp_cd7.eq(S1_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM17.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_MM17.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM18).on(S1_BP.bp_grp_cd8.eq(S1_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM18.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_MM18.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM19).on(S1_BP.bp_grp_cd9.eq(S1_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM19.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_MM19.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM110).on(S1_BP.bp_grp_cd10.eq(S1_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM110.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_MM110.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ACCOUNT_R.class, r -> toCondition(
							r.getStringNE("ac_cd")
						))
						.addSelect(m -> toArray(
							m.ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ac_nm", m.ac_nm());
					}),
					j -> j
						.add(MAM_SUB_ACCOUNT_R.class, r -> toCondition(
							r.getStringNE("ac_cd"),
							r.getStringNE("sub_ac_cd")
						))
						.addSelect(m -> toArray(
							m.sub_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sub_ac_nm", m.sub_ac_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_XRATE_R.class, r -> toCondition(
							r.getStringNE("xrate_cd")
						))
						.addSelect(m -> toArray(
							m.xrate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xrate_nm", m.xrate_nm());
					}),
					j -> j
						.add(MAM_XRATE_R.class, r -> toCondition(
							r.getStringNE("ptax_xrate_cd")
						))
						.addSelect(m -> toArray(
							m.xrate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_xrate_nm", m.xrate_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ACCOUNT_R.class, r -> toCondition(
							r.getStringNE("other_ac_cd")
						))
						.addSelect(m -> toArray(
							m.ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("other_ac_nm", m.ac_nm());
					}),
					j -> j
						.add(MAM_SUB_ACCOUNT_R.class, r -> toCondition(
							r.getStringNE("other_ac_cd"),
							r.getStringNE("other_sub_ac_cd")
						))
						.addSelect(m -> toArray(
							m.sub_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("other_sub_ac_nm", m.sub_ac_nm());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
					}),
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
						.add(MAM_AC_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.ac_tax_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.ac_tax_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("sttl_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sttl_nm", m.sttl_nm());
					})
				)
			);
	}
}