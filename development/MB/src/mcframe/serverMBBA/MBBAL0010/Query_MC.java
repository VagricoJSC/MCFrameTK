package mcframe.serverMBBA.MBBAL0010;

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
	 * -- MBBAL0010_MBT_APRV_Query_S01
	 */
	static MCQueryPlan MBBAL0010_MBT_APRV_S01() {
		MBT_APRV_R S0_T01 = MBT_APRV_R.create("T01");
		MBT_APRV_D_R S0_T02 = MBT_APRV_D_R.create("T02");
		MAM_USR_R S0_M02 = MAM_USR_R.create("M02");
		MAM_USR_R S0_M03 = MAM_USR_R.create("M03");
		MAM_DPT_R S0_M05 = MAM_DPT_R.create("M05");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		
		MCDynamicSQLID USR_DTL = createDynamicSQLID("USR_DTL");
		
		return createQueryPlan()
			.setQuery(
				sql("MBBAL0010_MBT_APRV_Query_S01")
					.mainQuery()
					.select(
						S0_T01.aprv_no,
						S0_T01.aprv_no_seq,
						S0_T01.aprv_sts_typ,
						S0_T01.last_aprv_usr_cd,
						S0_T01.last_aprv_tm,
						S0_T01.ins_dt,
						S0_T01.biz_usr_cd,
						S0_T01.src_ins_usr_cd,
						S0_T01.aprv_func_typ,
						S0_T01.src_itm_cd,
						S0_T01.src_itm_sub1,
						S0_T01.src_itm_sub2,
						S0_T01.src_itm_sub3,
						S0_T01.src_dpt_cd,
						S0_M05.dpt_nm.as("src_dpt_nm"),
						S0_T01.src_bp_cd,
						S0_T01.src_cur_cd1,
						S0_T01.src_amt1,
						S0_T01.src_cur_cd2,
						S0_T01.src_amt2,
						S0_T01.src_cur_cd3,
						S0_T01.src_amt3,
						S0_T01.src_ext_key1,
						S0_T01.src_ext_key2,
						S0_T01.src_ext_key3,
						S0_T01.aprv_src_no1,
						S0_T01.aprv_src_no2,
						S0_T01.next_opr_flg,
						S0_T01.aprv_upd_flg,
						S0_T01.aprv_can_flg,
						S0_T01.ins_usr_id.as("aprv_h_ins_usr_id"),
						S0_T01.ins_usr_nm.as("aprv_h_ins_usr_nm"),
						S0_T01.ins_ts.as("aprv_h_ins_ts"),
						S0_T01.ins_func_id.as("aprv_h_ins_func_id"),
						S0_T01.upd_usr_id.as("aprv_h_upd_usr_id"),
						S0_T01.upd_usr_nm.as("aprv_h_upd_usr_nm"),
						S0_T01.upd_ts.as("aprv_h_upd_ts"),
						S0_T01.upd_func_id.as("aprv_h_upd_func_id"),
						S0_T01.upd_srv_req_no.as("aprv_h_upd_srv_req_no"),
						S0_T02.aprv_role_cd,
						S0_T02.aprv_usr_cd,
						S0_M11.usr_nm.as("aprv_usr_nm"),
						S0_T02.aprv_seq,
						S0_T02.aprv_d_sts_typ,
						S0_T02.aprv_d_tm,
						S0_T02.deputy_flg,
						S0_T02.deputy_usr_cd,
						S0_T02.aprv_d_rmrks,
						S0_T02.sub_char1,
						S0_T02.sub_char2,
						S0_T02.sub_char3,
						S0_T02.ins_usr_id,
						S0_T02.ins_usr_nm,
						S0_T02.ins_ts,
						S0_T02.ins_func_id,
						S0_T02.upd_usr_id,
						S0_T02.upd_usr_nm,
						S0_T02.upd_ts,
						S0_T02.upd_func_id,
						S0_T02.upd_srv_req_no,
						addDynamicSelect(USR_DTL)
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_T02).on(
							bracket(
								S0_T01.aprv_no.eq(S0_T02.aprv_no)
								.and(S0_T01.aprv_no_seq.eq(S0_T02.aprv_no_seq))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.src_dpt_cd.eq(S0_M05.dpt_cd)
								.and(S0_T01.master_dt.between(S0_M05.st_dt, S0_M05.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T02.aprv_usr_cd.eq(S0_M11.usr_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.can_flg.eq(value(false)))
						.cutoff$and(S0_T01.aprv_func_typ.like(bind("aprv_func_typ")))
						.cutoff$and(S0_T01.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T01.aprv_src_no1.like(bind("aprv_src_no1")))
						.cutoff$and(S0_T01.aprv_src_no2.like(bind("aprv_src_no2")))
						.cutoff$and(S0_T01.aprv_sts_typ.like(bind("aprv_sts_typ")))
						.cutoff$and(S0_T01.ins_dt.gte(bind("ins_dt_fr")))
						.cutoff$and(S0_T01.ins_dt.lte(bind("ins_dt_to")))
						.cutoff$and(
							bracket(
								S0_T01.src_ins_usr_cd.like(bind("ins_biz_usr_cd"))
								.or(S0_T01.biz_usr_cd.like(bind("ins_biz_usr_cd")))
							)
						)
						.addDynamicPredicate()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ins_biz_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M02).on(bracket(S0_T01.biz_usr_cd.eq(S0_M02.usr_cd))).leftOuterJoin(S0_M03).on(bracket(S0_T01.src_ins_usr_cd.eq(S0_M03.usr_cd))))
					.predicate(p -> p.cutoff$and(bracket(S0_M02.usr_nm.like(bind("ins_biz_usr_nm")).or(S0_M03.usr_nm.like(bind("ins_biz_usr_nm")))))),
				when(boundOr("usr_dtl_flg_str"))
					.select(USR_DTL, bind("usr_dtl_flg_str").as("usr_dtl_flg"), S0_M11.email1, S0_M11.email2, S0_M11.email3, S0_M11.tel1, S0_M11.tel2, S0_M11.tel3, S0_M11.th_image)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("last_aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("last_aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("biz_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("biz_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("src_ins_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_ins_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("src_itm_cd"),
							r.getStringNE("src_itm_sub1"),
							r.getStringNE("src_itm_sub2"),
							r.getStringNE("src_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("src_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("src_cur_cd1")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_cur_nm1", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("src_cur_cd2")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_cur_nm2", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("src_cur_cd3")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("src_cur_nm3", m.cur_nm());
					}),
					j -> j
						.add(MAM_APRV_ROLE_R.class, r -> toCondition(
							r.getStringNE("aprv_role_cd")
						))
						.addSelect(m -> toArray(
							m.aprv_role_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_role_nm", m.aprv_role_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("deputy_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("deputy_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
}