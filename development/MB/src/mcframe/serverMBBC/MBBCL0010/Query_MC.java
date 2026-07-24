package mcframe.serverMBBC.MBBCL0010;

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
	 * -- MBBCL0010_MBT_ATTACHMENT_Query_S01
	 */
	static MCQueryPlan MBBCL0010_MBT_ATTACHMENT_S01() {
		MBT_ATTACHMENT_R S0_T1 = MBT_ATTACHMENT_R.create("T1");
		MAM_BP_R S0_T2 = MAM_BP_R.create("T2");
		MAM_CUR_R S0_T3 = MAM_CUR_R.create("T3");
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
				sql("MBBCL0010_MBT_ATTACHMENT_Query_S01")
					.mainQuery()
					.select(
							S0_T1.data_no,
							S0_T1.edition,
							S0_T1.biz_typ,
							S0_T1.report_id,
							S0_T1.biz_key1,
							S0_T1.biz_key2,
							S0_T1.biz_key3,
							S0_T1.biz_key4,
							S0_T1.biz_key5,
							S0_T1.biz_key6,
							S0_T1.biz_key7,
							S0_T1.biz_key8,
							S0_T1.biz_key9,
							S0_T1.biz_key10,
							S0_T1.data_crud_typ,
							S0_T1.dt,
							S0_T1.amt,
							S0_T1.bp_cd,
							S0_T2.bp_nm,
							S0_T1.cur_cd,
							S0_T3.cur_nm,
							S0_T1.rmrks1,
							S0_T1.rmrks2,
							S0_T1.rmrks3,
							S0_T1.rmrks4,
							S0_T1.rmrks5,
							S0_T1.rpt_attr1,
							S0_T1.rpt_attr2,
							S0_T1.rpt_attr3,
							S0_T1.rpt_attr4,
							S0_T1.rpt_attr5,
							S0_T1.rpt_attr6,
							S0_T1.rpt_attr7,
							S0_T1.rpt_attr8,
							S0_T1.rpt_attr9,
							S0_T1.rpt_attr10,
							S0_T1.rpt_attr11,
							S0_T1.rpt_attr12,
							S0_T1.rpt_attr13,
							S0_T1.rpt_attr14,
							S0_T1.rpt_attr15,
							S0_T1.rpt_attr16,
							S0_T1.rpt_attr17,
							S0_T1.rpt_attr18,
							S0_T1.rpt_attr19,
							S0_T1.rpt_attr20,
							S0_T1.doc_id,
							S0_T1.file_path,
							S0_T1.file_nm,
							S0_T1.archive_flg,
							S0_T1.msg_queue_id,
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
							S0_T1
							.leftOuterJoin(S0_T2).on(
								bracket(
									S0_T2.bp_cd.eq(S0_T1.bp_cd)
								)
							)
							.leftOuterJoin(S0_T3).on(
								bracket(
									S0_T3.cur_cd.eq(S0_T1.cur_cd)
								)
							)
							.addDynamicView(DS1C_BP_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S0_T1.biz_typ.eq(bind("biz_typ")))
							.and(S0_T1.archive_flg.eq(value(true)))
							.cutoff$and(S0_T1.report_id.like(bind("report_id")))
							.cutoff$and(S0_T1.file_nm.like(bind("file_nm")))
							.cutoff$and(S0_T1.dt.gte(bind("dt_fr")))
							.cutoff$and(S0_T1.dt.lte(bind("dt_to")))
							.cutoff$and(S0_T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S0_T2.bp_nm.like(bind("bp_nm")))
							.cutoff$and(S0_T1.amt.gte(bind("amt_fr")))
							.cutoff$and(S0_T1.amt.lte(bind("amt_to")))
							.cutoff$and(S0_T1.cur_cd.like(bind("cur_cd")))
							.cutoff$and(S0_T1.data_no.like(bind("data_no")))
							.cutoff$and(S0_T1.data_crud_typ.like(bind("data_crud_typ")))
							.cutoff$and(
								bracket(
									bind("exclude_del_flg").eq(value(true))
									.and(S0_T1.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value())))
								)
							)
							.cutoff$and(S0_T1.biz_key1.like(bind("biz_key1")))
							.cutoff$and(S0_T1.biz_key2.like(bind("biz_key2")))
							.cutoff$and(S0_T1.biz_key3.like(bind("biz_key3")))
							.cutoff$and(S0_T1.biz_key4.like(bind("biz_key4")))
							.cutoff$and(S0_T1.biz_key5.like(bind("biz_key5")))
							.cutoff$and(S0_T1.biz_key6.like(bind("biz_key6")))
							.cutoff$and(S0_T1.biz_key7.like(bind("biz_key7")))
							.cutoff$and(S0_T1.biz_key8.like(bind("biz_key8")))
							.cutoff$and(S0_T1.biz_key9.like(bind("biz_key9")))
							.cutoff$and(S0_T1.biz_key10.like(bind("biz_key10")))
							.cutoff$and(S0_T1.rmrks1.like(bind("rmrks1")))
							.cutoff$and(S0_T1.rmrks2.like(bind("rmrks2")))
							.cutoff$and(S0_T1.rmrks3.like(bind("rmrks3")))
							.cutoff$and(S0_T1.rmrks4.like(bind("rmrks4")))
							.cutoff$and(S0_T1.rmrks5.like(bind("rmrks5")))
							.cutoff$and(S0_T1.rpt_attr1.like(bind("rpt_attr1")))
							.cutoff$and(S0_T1.rpt_attr2.like(bind("rpt_attr2")))
							.cutoff$and(S0_T1.rpt_attr3.like(bind("rpt_attr3")))
							.cutoff$and(S0_T1.rpt_attr4.like(bind("rpt_attr4")))
							.cutoff$and(S0_T1.rpt_attr5.like(bind("rpt_attr5")))
							.cutoff$and(S0_T1.rpt_attr6.like(bind("rpt_attr6")))
							.cutoff$and(S0_T1.rpt_attr7.like(bind("rpt_attr7")))
							.cutoff$and(S0_T1.rpt_attr8.like(bind("rpt_attr8")))
							.cutoff$and(S0_T1.rpt_attr9.like(bind("rpt_attr9")))
							.cutoff$and(S0_T1.rpt_attr10.like(bind("rpt_attr10")))
							.cutoff$and(S0_T1.rpt_attr11.like(bind("rpt_attr11")))
							.cutoff$and(S0_T1.rpt_attr12.like(bind("rpt_attr12")))
							.cutoff$and(S0_T1.rpt_attr13.like(bind("rpt_attr13")))
							.cutoff$and(S0_T1.rpt_attr14.like(bind("rpt_attr14")))
							.cutoff$and(S0_T1.rpt_attr15.like(bind("rpt_attr15")))
							.cutoff$and(S0_T1.rpt_attr16.like(bind("rpt_attr16")))
							.cutoff$and(S0_T1.rpt_attr17.like(bind("rpt_attr17")))
							.cutoff$and(S0_T1.rpt_attr18.like(bind("rpt_attr18")))
							.cutoff$and(S0_T1.rpt_attr19.like(bind("rpt_attr19")))
							.cutoff$and(S0_T1.rpt_attr20.like(bind("rpt_attr20")))
							.addDynamicPredicate(DS1C_BP_GRP)
						)
						.orderBy(
							S0_T1.biz_typ.asc(),
							S0_T1.biz_key1.asc(),
							S0_T1.biz_key2.asc(),
							S0_T1.biz_key3.asc(),
							S0_T1.biz_key4.asc(),
							S0_T1.biz_key5.asc(),
							S0_T1.biz_key6.asc(),
							S0_T1.biz_key7.asc(),
							S0_T1.biz_key8.asc(),
							S0_T1.biz_key9.asc(),
							S0_T1.biz_key10.asc(),
							S0_T1.report_id.asc(),
							S0_T1.data_no.asc(),
							S0_T1.edition.asc()
						)
			)
			.setDynamicSQLInfo(
				when(boundOr("bp_grp_flg1"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM11).on(S0_T2.bp_grp_cd1.eq(S1_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM11.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_MM11.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM12).on(S0_T2.bp_grp_cd2.eq(S1_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM12.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_MM12.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM13).on(S0_T2.bp_grp_cd3.eq(S1_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM13.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_MM13.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM14).on(S0_T2.bp_grp_cd4.eq(S1_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM14.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_MM14.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM15).on(S0_T2.bp_grp_cd5.eq(S1_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM15.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_MM15.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM16).on(S0_T2.bp_grp_cd6.eq(S1_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM16.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_MM16.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM17).on(S0_T2.bp_grp_cd7.eq(S1_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM17.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_MM17.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM18).on(S0_T2.bp_grp_cd8.eq(S1_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM18.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_MM18.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM19).on(S0_T2.bp_grp_cd9.eq(S1_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM19.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_MM19.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_MM110).on(S0_T2.bp_grp_cd10.eq(S1_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM110.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S0_T2.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_MM110.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
}