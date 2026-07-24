package mcframe.serverMAUD.MAUDL6020;

import mcframe.commonCore.container.MCList;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter;
import static mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil.*;

abstract public class MAUDL_LCLRLDeleter_MC extends MAUDL_RLDeleter {

	@Override
	protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(MCQueryApiBuilder builder,
			MCList<R> list, boolean updChk) {

		if (builder.getBaseDbc().tableName().endsWith("_LCL")) {
			dbDelLcl(builder, list);
		}
		else {
			super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
		}
	}

	/**
	 * 名称マスタを一括削除する
	 * 
	 * @param builder 削除対象名称マスタのクエリAPIビルダー
	 */
	protected <R extends MCDBContainer> void dbDelLcl(MCQueryApiBuilder builder, MCList<R> list) {

		// lcl_cd の条件を除いた delete を実行
		builder.addWhereWithAnd(defaultWhere(builder.getBaseDbc()));
		builder.buildDelete(
				createSqlId("MAUDL6020", builder.getBaseDbc(), "MAUDL_LCLRLDeleter_D01"))
				.executeBatchUpdate(list);
	}

}
