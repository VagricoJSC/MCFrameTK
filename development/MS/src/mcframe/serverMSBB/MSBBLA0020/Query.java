package mcframe.serverMSBB.MSBBLA0020;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class Query extends Query_MC  {


	/**
	 * -- MSBBLA0020_SHIP_ITM_COMP_SRCH_S01
	 */
	public static MCQueryPlan MSBBLA0020_SHIP_ITM_COMP_SRCH_S01() {
		mcframe.serverMA.dbc.MAM_ITEM_SHIP_COMP_R t1 = mcframe.serverMA.dbc.MAM_ITEM_SHIP_COMP_R.create("T1");
		mcframe.serverMA.dbc.MAM_ITM_R m1 = mcframe.serverMA.dbc.MAM_ITM_R.create("M1");
		mcframe.serverMA.dbc.MAM_ITM_R m2 = mcframe.serverMA.dbc.MAM_ITM_R.create("M2");
		mcframe.serverMA.dbc.MAM_UNIT_R m3 = mcframe.serverMA.dbc.MAM_UNIT_R.create("M3");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0020_SHIP_ITM_COMP_SRCH_S01")
				.mainQuery()
				.select(
						t1.prod_itm_cd
						, t1.prod_itm_sub1
						, t1.prod_itm_sub2
						, t1.prod_itm_sub3
						, m1.itm_nm.as("prod_itm_nm")
						, t1.surv_line_qty
						, t1.diameter
						, t1.itm_cd
						, t1.itm_sub1
						, t1.itm_sub2
						, t1.itm_sub3
						, m2.itm_nm.as("itm_nm")
						, m2.unit_cd.as("base_unit_cd")
						, m3.unit_nm.as("base_unit_nm")
						, t1.qty
						, t1.spec_cd
						, t1.body_flg
						, t1.comp_flg
						, t1.ship_prnt_flg
				)
				.from(
						t1.innerJoin(m1)
						.on(
								t1.prod_itm_cd.eq(m1.itm_cd)
								.and(t1.prod_itm_sub1.eq(m1.itm_sub1))
								.and(t1.prod_itm_sub2.eq(m1.itm_sub2))
								.and(t1.prod_itm_sub3.eq(m1.itm_sub3))
						)
						.innerJoin(m2)
						.on(
								t1.itm_cd.eq(m2.itm_cd)
								.and(t1.itm_sub1.eq(m2.itm_sub1))
								.and(t1.itm_sub2.eq(m2.itm_sub2))
								.and(t1.itm_sub3.eq(m2.itm_sub3))
						)
						.innerJoin(m3)
						.on(
								m2.unit_cd.eq(m3.unit_cd)
						)
					)
				.where(t1.prod_itm_cd.eq(bind("prod_itm_cd")))
				.orderBy(t1.body_flg.desc())
				.orderBy(t1.comp_flg.desc())
				.orderBy(t1.itm_cd.asc())
			);

	}
	
	
}
