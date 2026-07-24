package mcframe.serverMAUD.MAUDL5010;

import java.util.HashSet;
import java.util.Set;

import mcframe.commonCore.container.MCList;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.mining.task.MCPushDestPlugin;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class MAUDL_PushDestWg_MC implements MCPushDestPlugin {

	/**
	 * 渡された各種IDに対するユーザIDの配列を返します。
	 *
	 * @param ids IDの配列
	 * @return ユーザIDの配列
	 */
	@Override
	public String[] getUsers(String... ids) {
		Set<String> set = new HashSet<>();
		if(ids.length > 0) {
			MCList<MAM_USR_R> list = getUsrByWg(ids);
			for (MAM_USR_R usr : list) {
				set.add(usr.usr_cd());
			}
		}

		return set.toArray(new String[set.size()]);
	}

	/**
	 * ＷＧに属する担当者を返します。
	 * 
	 */
	protected MCList<MAM_USR_R> getUsrByWg(String... wgCds) {
		
		insertMAW_WG_KEY(wgCds);

		MCList<MAM_USR_R> usrL = MCList.create(MAM_USR_R.class);
		selectMAM_USR(usrL);

		deleteMAW_WG_KEY();

		return usrL;
	}

	protected void insertMAW_WG_KEY(String... wgCds) {
		MCList<MAM_WG_R> wk = MCList.create(MAM_WG_R.class);
		for(String wgCd: wgCds) {
			MAM_WG_R d = MAM_WG_R.create();
			d.wg_cd(wgCd);
			wk.add(d);
		}
		wk.groupBy(MAM_WG_R.$wg_cd);
		
		deleteMAW_WG_KEY();
		
		MAM_WG_R t = MAM_WG_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t.getPkWorkDbc(), "MAUDL_PushDestWg_I01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		dbWkInsert(sqlid, wk, builder.getBaseDbc());

	}

	protected void selectMAM_USR(MCList<MAM_USR_R> usrL) {

		MAW_WG_KEY_R w = MAW_WG_KEY_R.create("W");
		MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
		MAVM_USR_DPT_R usrdpt = MAVM_USR_DPT_R.create("USRDPT");
		MAM_USR_R t = MAM_USR_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t, "MAUDL_PushDestWg_S01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setDistinct();
		builder.setSelect(t.usr_cd);
		builder.addInnerJoin(usrdpt, t.usr_cd.eq(usrdpt.usr_cd));
		builder.addInnerJoin(dpt, usrdpt.dpt_cd.eq(dpt.dpt_cd));
		builder.addInnerJoin(w, dpt.wg_cd.eq(w.wg_cd));
		builder.addWhereWithAnd(usrdpt.st_dt.lte(bind("1"))
						.and(usrdpt.end_dt.gte(bind("1")))
						.and(dpt.st_dt.lte(bind("1")))
						.and(dpt.end_dt.gte(bind("1"))), getToday());
		dbSelect(sqlid, usrL, builder);
	}

	protected void deleteMAW_WG_KEY() {
		MAM_WG_R t = MAM_WG_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t.getPkWorkDbc(), "MAUDL_PushDestWg_D01");
		dbWkDelete(sqlid, t);
	}
}
