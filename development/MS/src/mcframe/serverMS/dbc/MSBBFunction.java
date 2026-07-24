package mcframe.serverMS.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;

/**
 * MSBBファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MSBBFunction extends MCFunctionFactory {
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		return null;
	}
}
