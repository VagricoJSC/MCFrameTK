package mcframe.serverMBBC.MBBCL0020;

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
	 * -- MBBCL0020_MBT_ATTACHMENT_Query_S01
	 */
	static MCQueryPlan MBBCL0020_MBT_ATTACHMENT_S01() {
		MBT_ATTACHMENT_R S0_T1 = MBT_ATTACHMENT_R.create("T1");
		MAM_BP_R S0_T2 = MAM_BP_R.create("T2");
		MAM_CUR_R S0_T3 = MAM_CUR_R.create("T3");
		MBT_ATTACHMENT_R S1_W = MBT_ATTACHMENT_R.create("W");

		return createQueryPlan()
			.setQuery(
				sql("MBBCL0020_MBT_ATTACHMENT_Query_S01")
					.mainQuery()
					.select(
							S0_T1.data_no,
							S0_T1.edition,
							S0_T1.biz_typ,
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
							S0_T1.cur_cd,
							S0_T3.cur_nm,
							S0_T1.amt,
							S0_T1.bp_cd,
							S0_T2.bp_nm,
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
							S0_T1.upd_srv_req_no,
							S0_T1.data_crud_typ
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
						)
						.where(
							value(0).eq(value(0))
							.and(S0_T1.biz_typ.eq(bind("biz_typ")))
							.and(S0_T1.edition.eq(subQuery()
									.select(max(S1_W.edition))
									.from(S1_W)
									.where(
											S1_W.data_no.eq(S0_T1.data_no)
											)
									))
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
						)
			);
	}
}