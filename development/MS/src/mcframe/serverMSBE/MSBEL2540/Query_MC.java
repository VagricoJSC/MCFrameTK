package mcframe.serverMSBE.MSBEL2540;

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
	 * -- MSBEL2540_MAW_BOM_EX_Query_S01
	 */
	static MCQueryPlan MSBEL2540_MAW_BOM_EX_S01() {
		MAW_BOM_EX_R S0_W1 = MAW_BOM_EX_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_ALT_GRP_R S0_M5 = MAM_ALT_GRP_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2540_MAW_BOM_EX_Query_S01")
					.mainQuery()
					.select(
						S0_W1.bom_lvl,
						nullValue().as("extno"),
						nullValue().as("par_extno"),
						S0_W1.loop_flg,
						S0_W1.wg_cd,
						S0_W1.itm_cd,
						S0_W1.itm_sub1,
						S0_W1.itm_sub2,
						S0_W1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.not_new_lot_flg,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.cont_fctr_flg,
						S0_M1.stk_mng_typ,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M3.unit_nm.as("base_unit_nm"),
						S0_M2.dec_place.as("base_unit_dec_place"),
						S0_M2.rnd_typ.as("base_unit_conv_rnd_typ"),
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M4.unit_nm.as("cont_fctr_unit_nm"),
						S0_M4.rnd_typ.as("cont_fctr_rnd_typ"),
						S0_M4.dec_place.as("cont_fctr_dec_place"),
						S0_M1.std_cont_fctr,
						S0_W1.par_inst_qty,
						S0_W1.chd_rqmt_qty,
						S0_W1.fxd_chd_rqmt_qty,
						S0_W1.bom_ptn,
						S0_W1.st_dt,
						S0_W1.end_dt,
						S0_W1.alt_grp_cd,
						S0_M5.alt_grp_nm,
						S0_W1.alloc_ctl_typ,
						S0_W1.byprod_flg,
						S0_W1.sno_typ1,
						S0_W1.max_sno1,
						S0_W1.min_sno1,
						S0_W1.sno_typ2,
						S0_W1.max_sno2,
						S0_W1.min_sno2,
						S0_W1.sno_typ3,
						S0_W1.max_sno3,
						S0_W1.min_sno3,
						S0_W1.sno_typ4,
						S0_W1.max_sno4,
						S0_W1.min_sno4
					)
					.from(
						S0_W1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_M1.unit_cd.eq(S0_M2.unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(S0_M1.unit_cd.eq(S0_M3.unit_cd))
						.leftOuterJoin(S0_M4).on(S0_M1.cont_fctr_unit_cd.eq(S0_M4.unit_cd))
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_W1.alt_grp_cd.eq(S0_M5.alt_grp_cd)
								.and(S0_W1.wg_cd.eq(S0_M5.wg_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_W1.bom_lvl.gt(value(0)))
					)
					.orderBy(S0_W1.sort_no.asc())
			);
	}
}