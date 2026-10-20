package mcframe.serverMSBB.MSBBLA0010;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class Query extends Query_MC  {

	/**
	 * -- MSBBLA0010_MST_SLS_SCHD_D_S01
	 */
	public static MCQueryPlan MSBBLA0010_MST_SLS_SCHD_D_S01() {
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_D_R t1 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_D_R.create("T1");
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R t2 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R.create("T2");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_D_S01")
				.mainQuery()
				.select(
						t2.zoho_sls_schd_no
						, t2.deal_cd
						, t2.deal_nm
						, t2.cst_cd
						, t2.bcst_cd
						, t2.sls_dpt_cd
						, t2.mrkt_cd
						, t2.prod_itm_cd
						, t2.ord_dlv_dt
						, t2.post_inst_sls_dt
						, t2.amt.as("prd_amt")
						, t2.qty.as("prd_qty")
						, t2.cur_cd
						, t1.itm_cd
						, t1.qty
						, t1.upri
					)
				.from(
						t1.innerJoin(t2)
						.on(t1.zoho_sls_schd_no.eq(t2.zoho_sls_schd_no))
						)
				
				);
	}


	/**
	 * -- MSBBLA0010_MST_SLS_SCHD_S01
	 */
	public static MCQueryPlan MSBBLA0010_MST_SLS_SCHD_S01() {
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R t1 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R.create("T1");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_S01")
				.mainQuery()
				.select(t1.getAllColumn$())
				.from(t1)
				);

	}
	
	
}
