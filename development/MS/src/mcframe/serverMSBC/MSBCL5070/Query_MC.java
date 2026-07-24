package mcframe.serverMSBC.MSBCL5070;

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
	 * -- MSBCL5070_MST_MLY_RQMT_UP01
	 */
	static MCQueryPlan MSBCL5070_MST_MLY_RQMT_UP01() {
		MST_MLY_RQMT_R S0_T = MST_MLY_RQMT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5070_MST_MLY_RQMT_UP01")
					.update(S0_T)
					.set(S0_T.ym).eq(bind("ym"))
					.set(S0_T.prod_ym).eq(bind("prod_ym"))
					.set(S0_T.mps_grp_cd).eq(bind("mps_grp_cd"))
					.set(S0_T.itm_cd).eq(bind("itm_cd"))
					.set(S0_T.itm_sub1).eq(bind("itm_sub1"))
					.set(S0_T.itm_sub2).eq(bind("itm_sub2"))
					.set(S0_T.itm_sub3).eq(bind("itm_sub3"))
					.set(S0_T.strg_loc_cd).eq(bind("strg_loc_cd"))
					.set(S0_T.mfg_loc_cd).eq(bind("mfg_loc_cd"))
					.set(S0_T.sppl_cd).eq(bind("sppl_cd"))
					.set(S0_T.rqst_loc_cd).eq(bind("rqst_loc_cd"))
					.set(S0_T.qty).eq(bind("qty"))
					.set(S0_T.wg_cd).eq(bind("wg_cd"))
					.set(S0_T.intr_rmrks).eq(bind("intr_rmrks"))
					.set(S0_T.sub_char1).eq(bind("sub_char1"))
					.set(S0_T.sub_char2).eq(bind("sub_char2"))
					.set(S0_T.sub_char3).eq(bind("sub_char3"))
					.where(
						value(0).eq(value(0))
						.and(S0_T.ym.eq(bind("ym_key")))
						.and(S0_T.prod_ym.eq(bind("prod_ym_key")))
						.and(S0_T.mps_grp_cd.eq(bind("mps_grp_cd_key")))
						.and(S0_T.itm_cd.eq(bind("itm_cd_key")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1_key")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2_key")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3_key")))
					)
			);
	}
}