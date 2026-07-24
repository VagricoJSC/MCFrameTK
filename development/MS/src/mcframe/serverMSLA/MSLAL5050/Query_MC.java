package mcframe.serverMSLA.MSLAL5050;

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
	 * -- MSLAL5050_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSLAL5050_MST_PURC_ACT_S01() {
		MST_PURC_ACT_R PURC_ACT1 = MST_PURC_ACT_R.create("PURC_ACT1");
		MST_PURC_ACT_D_R PURC_ACT_D1 = MST_PURC_ACT_D_R.create("PURC_ACT_D1");
		MST_PURC_ACT_D_R PURC_ACT_D2 = MST_PURC_ACT_D_R.create("PURC_ACT_D2");
		MST_PURC_ACT_IO_R PURC_ACT_IO1 = MST_PURC_ACT_IO_R.create("PURC_ACT_IO1");
		MST_ARR_ACT_R ARR_ACT1 = MST_ARR_ACT_R.create("ARR_ACT1");
		MST_ARR_ACT_R ARR_ACT2 = MST_ARR_ACT_R.create("ARR_ACT2");
		MCTempView VIEW1 = createTempView("VIEW1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5050_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						VIEW1.prAll(),
						nvl2(ARR_ACT1.arr_act_no, ARR_ACT1.ext_sys_cd, ARR_ACT2.ext_sys_cd).as("ext_sys_cd"),
						nvl2(ARR_ACT1.arr_act_no, ARR_ACT1.ext_arr_act_no, ARR_ACT2.ext_arr_act_no).as("ext_arr_act_no")
					)
					.from(
						subQuery()
						.select(
							PURC_ACT1.purc_act_no,
							PURC_ACT1.purc_act_seq,
							PURC_ACT1.purc_act_rev,
							PURC_ACT1.slip_sts_typ,
							PURC_ACT1.wg_cd,
							PURC_ACT1.sppl_cd,
							PURC_ACT1.trd_cur_cd,
							sum(PURC_ACT_D2.trd_cur_amt).add(sum(PURC_ACT_D2.trd_cur_tax_amt)).as("trd_cur_amt_inc_tax")
						)
						.from(PURC_ACT1
							.innerJoin(PURC_ACT_D2).on(
								PURC_ACT_D2.purc_act_no.eq(PURC_ACT1.purc_act_no)
								.and(PURC_ACT_D2.purc_act_seq.eq(PURC_ACT1.purc_act_seq))
							)
						)
						.groupBy(
							PURC_ACT1.purc_act_no,
							PURC_ACT1.purc_act_seq,
							PURC_ACT1.purc_act_rev,
							PURC_ACT1.slip_sts_typ,
							PURC_ACT1.wg_cd,
							PURC_ACT1.sppl_cd,
							PURC_ACT1.trd_cur_cd
						)
						.view(VIEW1)
						.innerJoin(PURC_ACT_D1).on(
							PURC_ACT_D1.purc_act_no.eq(VIEW1.pr(PURC_ACT1.purc_act_no))
							.and(VIEW1.pr(PURC_ACT1.slip_sts_typ).eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.innerJoin(PURC_ACT_IO1).on(
							PURC_ACT_IO1.purc_act_d_no.eq(PURC_ACT_D1.purc_act_d_no)
							.and(PURC_ACT_IO1.purc_act_d_seq.eq(PURC_ACT_D1.purc_act_d_seq))
						)
						.leftOuterJoin(ARR_ACT1).on(
							ARR_ACT1.purc_act_io_no.eq(PURC_ACT_IO1.purc_act_io_no)
						)
						.leftOuterJoin(ARR_ACT2).on(
							ARR_ACT2.arr_act_no.eq(PURC_ACT_IO1.arr_act_no)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								ARR_ACT1.ext_sys_cd.eq(bind("ext_sys_cd"))
								.and(ARR_ACT1.ext_arr_act_no.eq(bind("ext_arr_act_no")))
							).or(
								ARR_ACT2.ext_sys_cd.eq(bind("ext_sys_cd"))
								.and(ARR_ACT2.ext_arr_act_no.eq(bind("ext_arr_act_no")))
							)
						)
					)
			);
	}
}