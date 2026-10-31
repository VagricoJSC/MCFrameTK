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
		mcframe.serverMA.dbc.MAM_BP_R m1 = mcframe.serverMA.dbc.MAM_BP_R.create("M1");
		mcframe.serverMA.dbc.MAM_BP_R m2 = mcframe.serverMA.dbc.MAM_BP_R.create("M2");
		mcframe.serverMA.dbc.MAM_DPT_R m3 = mcframe.serverMA.dbc.MAM_DPT_R.create("M3");
		mcframe.serverMA.dbc.MAM_ITM_R m4 = mcframe.serverMA.dbc.MAM_ITM_R.create("M4");
		mcframe.serverMA.dbc.MAM_USR_R m5 = mcframe.serverMA.dbc.MAM_USR_R.create("M5");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_D_S01")
				.mainQuery()
				.select(
						t2.zoho_sls_schd_no
						, t2.deal_cd
						, t2.deal_nm
						, t2.cst_cd
						, m1.bp_nm.as("cst_nm")
						, t2.bcst_cd
						, m2.bp_nm.as("bcst_nm")
						, t2.sls_dpt_cd
						, m3.dpt_nm.as("sls_dpt_nm")
						, t2.mrkt_cd
						, t2.prod_itm_cd
						, t2.prod_itm_sub1
						, t2.prod_itm_sub2
						, t2.prod_itm_sub3
						, m4.itm_nm.as("par_itm_nm")
						, t2.sls_usr_cd.as("frcst_usr_cd")
						, m5.usr_nm.as("frcst_usr_nm")
						, t2.ord_dlv_dt
						, t2.post_inst_sls_dt
						, t2.amt.as("prd_amt")
						, t2.qty.as("prd_qty")
						, t2.cur_cd
						, t1.itm_cd
						, t1.itm_sub1
						, t1.itm_sub2
						, t1.itm_sub3
						, t1.qty
						, t1.upri
					)
				.from(
						t1.innerJoin(t2)
						.on(t1.zoho_sls_schd_no.eq(t2.zoho_sls_schd_no))
						.innerJoin(m1).on(t2.cst_cd.eq(m1.bp_cd))
						.innerJoin(m2).on(t2.bcst_cd.eq(m2.bp_cd))
						.innerJoin(m3).on(t2.sls_dpt_cd.eq(m3.dpt_cd))
						.innerJoin(m4).on(t2.prod_itm_cd.eq(m4.itm_cd))
						.innerJoin(m5).on(t2.sls_usr_cd.eq(m5.usr_cd))
					)
				);
	}


	/**
	 * -- MSBBLA0010_MST_SLS_SCHD_S01
	 */
	public static MCQueryPlan MSBBLA0010_MST_SLS_SCHD_S01() {
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R t2 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R.create("T2");
		mcframe.serverMA.dbc.MAM_BP_R m1 = mcframe.serverMA.dbc.MAM_BP_R.create("M1");
		mcframe.serverMA.dbc.MAM_BP_R m2 = mcframe.serverMA.dbc.MAM_BP_R.create("M2");
		mcframe.serverMA.dbc.MAM_DPT_R m3 = mcframe.serverMA.dbc.MAM_DPT_R.create("M3");
		mcframe.serverMA.dbc.MAM_ITM_R m4 = mcframe.serverMA.dbc.MAM_ITM_R.create("M4");
		mcframe.serverMA.dbc.MAM_USR_R m5 = mcframe.serverMA.dbc.MAM_USR_R.create("M5");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_S01")
				.mainQuery()
				.select(
						t2.zoho_sls_schd_no
						, t2.deal_cd
						, t2.deal_nm
						, t2.cst_cd
						, m1.bp_nm.as("cst_nm")
						, t2.bcst_cd
						, m2.bp_nm.as("bcst_nm")
						, t2.sls_dpt_cd
						, m3.dpt_nm.as("sls_dpt_nm")
						, t2.mrkt_cd
						, t2.prod_itm_cd
						, t2.prod_itm_sub1
						, t2.prod_itm_sub2
						, t2.prod_itm_sub3
						, m4.itm_nm.as("par_itm_nm")
						, t2.sls_usr_cd.as("frcst_usr_cd")
						, m5.usr_nm.as("frcst_usr_nm")
						, t2.ord_dlv_dt
						, t2.post_inst_sls_dt
						, t2.amt.as("prd_amt")
						, t2.qty.as("prd_qty")
						, t2.cur_cd
					)
				.from(
						t2
						.innerJoin(m1).on(t2.cst_cd.eq(m1.bp_cd))
						.innerJoin(m2).on(t2.bcst_cd.eq(m2.bp_cd))
						.innerJoin(m3).on(t2.sls_dpt_cd.eq(m3.dpt_cd))
						.innerJoin(m4).on(t2.prod_itm_cd.eq(m4.itm_cd))
						.innerJoin(m5).on(t2.sls_usr_cd.eq(m5.usr_cd))						
					)
				);

	}
	
	
}
