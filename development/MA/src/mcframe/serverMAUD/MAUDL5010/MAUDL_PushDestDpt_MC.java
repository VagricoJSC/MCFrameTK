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

public class MAUDL_PushDestDpt_MC implements MCPushDestPlugin {

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
			MCList<MAM_USR_R> list = getUsrByDpt(ids);
			for (MAM_USR_R usr : list) {
				set.add(usr.usr_cd());
			}
		}

		return set.toArray(new String[set.size()]);
	}

	/**
	 * 部門に属する担当者を返します。
	 * 
	 */
	protected MCList<MAM_USR_R> getUsrByDpt(String... dptCds) {
		insertMAW_DPT_KEY(dptCds);

		MCList<MAM_USR_R> usrL = MCList.create(MAM_USR_R.class);
		selectMAM_USR(usrL);

		deleteMAW_DPT_KEY();

		return usrL;
	}
	
	protected void insertMAW_DPT_KEY(String... dptCds) {
		MCList<MAM_DPT_R> wk = MCList.create(MAM_DPT_R.class);
		for(String dptCd: dptCds) {
			MAM_DPT_R d = MAM_DPT_R.create();
			d.dpt_cd(dptCd);
			wk.add(d);
		}
		wk.groupBy(MAM_DPT_R.$dpt_cd);

		deleteMAW_DPT_KEY();
		
		MAM_DPT_R t = MAM_DPT_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t.getPkWorkDbc(), "MAUDL_PushDestDpt_I01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSet(t.dpt_cd);
		dbWkInsert(sqlid, wk, builder.getBaseDbc());

	}

	protected void selectMAM_USR(MCList<MAM_USR_R> usrL) {

		MAW_DPT_KEY_R w = MAW_DPT_KEY_R.create("W");
		MAVM_USR_DPT_R usrdpt = MAVM_USR_DPT_R.create("USRDPT");
		MAM_USR_R t = MAM_USR_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t, "MAUDL_PushDestDpt_S01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setDistinct();
		builder.setSelect(t.usr_cd);
		builder.addInnerJoin(usrdpt, t.usr_cd.eq(usrdpt.usr_cd));
		builder.addInnerJoin(w, usrdpt.dpt_cd.eq(w.dpt_cd));
		builder.addWhereWithAnd(usrdpt.st_dt.lte(bind("1")).
						and(usrdpt.end_dt.gte(bind("1"))), getToday());
		dbSelect(sqlid, usrL, builder);
	}

	protected void deleteMAW_DPT_KEY() {
		MAM_DPT_R t = MAM_DPT_R.create("T");
		String sqlid = createSqlId("MAUDL5010", t.getPkWorkDbc(), "MAUDL_PushDestDpt_D01");
		dbWkDelete(sqlid, t);
	}
}
