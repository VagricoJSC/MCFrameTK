package mcframe.serverMAUC.MAUCL7080;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.ArrayList;
import java.util.List;

import mcframe.commonCore.meta.MCMeta;
import mcframe.commonMA.meta.MA_META;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.sys.MCFactory;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_DbUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_DbUtil_MC extends MAUCL_DbUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * 排他チェックのユーティリティメソッド（メイン）<p>
	 */
	public static MCMessageList checkUpdCntrNE(MCRow updR, String upd_cntr_col, MCRow lockedR) {
		MCMessageList msgL = new MCMessageList();
		try {
			mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil.checkUpdCntr(updR, upd_cntr_col, lockedR);
		}
		catch(MCAppException e) {
			msgL.add(e.getMCMessage());
		}
		return msgL;
	}
	
	/**
	 * 対応するキーのデータが存在しない場合のエラーメッセージを返す<p>
	 */
	public static MCMessageList getRecordNotFoundMsg(String module_id, String dbname, String[] keyCols, Comparable<?>[] keyVals, MCRow causeRow) {
		MCMessageList msgL = new MCMessageList();
		
		String[] vals = new String[keyCols.length];
		for (int i = 0; i < keyCols.length; i++) {
			String lbl = MCConst.dblbl.getLabel(dbname, keyCols[i].toUpperCase(), MCSys.user.locale());
			String key = isNull(lbl) ? keyCols[i] : lbl;
			String val = isNull(keyVals[i]) ? "" : keyVals[i].toString();
			vals[i] = key + "=" + val;
		}
		String tblName = MCConst.dblbl.getLabel(dbname, null, MCSys.user.locale());

		msgL.add(new MCMessage(causeRow, null, MAUCL0010, module_id, tblName, MCStringUtil.join(",", vals), toDispGUIIndex(causeRow)));
		
		return msgL;
	}
	/**
	 * 対応するキーのデータが存在しない場合のエラーメッセージを返す<p>
	 * 品目・年月・年月日がキー情報にあった場合、表示用に変換
	 */
	public static <E extends MCDBContainer> MCMessageList getRecordNotFoundMsg(String module_id, E dbc, MCRow causeRow) {
		MCMessageList msgL = new MCMessageList();

		String[] keyInfo = getKeyInfoArray(dbc, causeRow);
		String tblName = MCConst.dblbl.getLabel(dbc.tableName(), null, MCSys.user.locale());

		msgL.add(new MCMessage(causeRow, null, MAUCL0010, module_id, tblName, MCStringUtil.join(",", keyInfo), toDispGUIIndex(causeRow)));
		
		return msgL;
	}
	
	/**
	 * 対応するキーのデータが既に登録済みの場合のエラーメッセージを返す<p>
	 */
	public static MCMessageList getRecordFoundMsg(String module_id, String dbname, String[] keyCols, Comparable<?>[] keyVals, MCRow causeRow) {
		MCMessageList msgL = new MCMessageList();
		
		String[] vals = new String[keyCols.length];
		for (int i = 0; i < keyCols.length; i++) {
			String lbl = MCConst.dblbl.getLabel(dbname, keyCols[i].toUpperCase(), MCSys.user.locale());
			String key = isNull(lbl) ? keyCols[i] : lbl;
			String val = isNull(keyVals[i]) ? "" : keyVals[i].toString();
			vals[i] = key + "=" + val;
		}
		String tblName = MCConst.dblbl.getLabel(dbname, null, MCSys.user.locale());

		msgL.add(new MCMessage(causeRow, null, MAUCL0036, module_id, tblName, MCStringUtil.join(",", vals), toDispGUIIndex(causeRow)));
		
		return msgL;
	}
	/**
	 * 対応するキーのデータが既に登録済みの場合のエラーメッセージを返す<p>
	 * 品目・年月・年月日がキー情報にあった場合、表示用に変換
	 */
	public static <E extends MCDBContainer> MCMessageList getRecordFoundMsg(String module_id, E dbc, MCRow causeRow) {
		MCMessageList msgL = new MCMessageList();

		String[] keyInfo = getKeyInfoArray(dbc, causeRow);
		String tblName = MCConst.dblbl.getLabel(dbc.tableName(), null, MCSys.user.locale());

		msgL.add(new MCMessage(causeRow, null, MAUCL0036, module_id, tblName, MCStringUtil.join(",", keyInfo), toDispGUIIndex(causeRow)));
		
		return msgL;
	}
	
	/**
	 * 対応するデータが保持するキーが上り電文と一致しない場合のエラーメッセージを返す<p>
	 */
	public static MCMessageList getRecordInvalidMsg(String upCol, Comparable<?> dbVal, MCRow causeRow) {
		MCMessageList msgL = new MCMessageList();
		msgL.add(new MCMessage(causeRow, null, MAUCL0011, upCol, causeRow.getValueNE(upCol), dbVal));
		return msgL;
	}

	/**
	 * キー情報を返す<p>
	 * 品目・年月・年月日・手配ＮＯ１～４がキー情報にあった場合、表示用に変換
	 */
	protected static <E extends MCDBContainer> String[] getKeyInfoArray(E dbc, MCRow causeRow) {
		String[] keyCols = dbc.getKeyColumn();
		List<String> valL = new ArrayList<String>();

		for (int i = 0; i < keyCols.length; i++) {
			String lbl = MCConst.dblbl.getLabel(dbc.tableName(), keyCols[i].toUpperCase(), MCSys.user.locale());
			String key = isNull(lbl) ? keyCols[i] : lbl;
			String val = isNull(causeRow.getValue(keyCols[i])) ? "" : causeRow.getValue(keyCols[i]).toString();

			MCMeta m = dbc.getMeta(keyCols[i]);
			if (m != null) {
				if (isSame(MA_META.ITM_CD.ID(), m.ID())) {
					val = toDispItm(causeRow.getString(keyCols[i]), causeRow.getString(keyCols[i + 1]),
							causeRow.getString(keyCols[i + 2]), causeRow.getString(keyCols[i + 3]));

					key = MAC_STR.DISP_ITM_PREFIX.name(MCSys.user.locale());

					i = i + 3;
				}
				else if (isSame(MA_META.YM.ID(), m.ID())) {
					val = toYMString(causeRow.getDate(keyCols[i]));
				}
				else if (isSame(MA_META.DT.ID(), m.ID())) {
					val = toYMDString(causeRow.getDate(keyCols[i]));
				}
				else if (isSame(MA_META.SNO1.ID(), m.ID())) {
					if (chkSno234(dbc, keyCols, i)) {
						val = toDispSno(causeRow.getString(keyCols[i]), causeRow.getString(keyCols[i + 1]),
								causeRow.getString(keyCols[i + 2]), causeRow.getString(keyCols[i + 3]));

						key = MAC_STR.DISP_SNO_PREFIX.name(MCSys.user.locale());

						i = i + 3;
					}
				}
			}
			valL.add(key + "=" + val);
		}
		return valL.toArray(new String[0]);
	}
	protected static <E extends MCDBContainer> boolean chkSno234(E dbc, String[] keyCols, int sno1Idx) {
		String[] sno234 = new String[]{MA_META.SNO2.ID(), MA_META.SNO3.ID(), MA_META.SNO4.ID()};
		if (sno1Idx+sno234.length >= keyCols.length) {
			return false;
		}
		for (int i = 0; i < sno234.length; i++) {
			MCMeta m = dbc.getMeta(keyCols[sno1Idx+1+i]);
			if (m == null || !isSame(sno234[i], m.ID())) {
				return false;
			}
		}
		return true;
	}

	public static void executeBatchUpdate(MCQueryPlan plan, MCRow bind, MCList<? extends MCRow> binds, MCRow exBind) {
		if (binds == null) {
			executeBatchUpdate(plan, bind, binds, (MCList<? extends MCRow>)null);
		}
		else {
			MCList<MCRow> exBinds = MCList.create(MCRow.class);
			for (int i = 0; i < binds.size(); i++) {
				exBinds.add(exBind);
			}
			executeBatchUpdate(plan, bind, binds, exBinds);
		}
	}

	protected static String sqlID(String... ids) {
		return String.join("_", ids);
	}

	/**
	 * SQL_IDを作成します。
	 * @param prefix 接頭辞
	 * @param tbl テーブル名
	 * @param crud CRUD文字列
	 * @return SQL_ID
	 */
	public static String createSqlId(String prefix, String tbl, String crud) {
		return MAUCL_DbUtil.sqlID(prefix, tbl, crud);
	}
	
	/**
	 * SQL_IDを作成します。
	 * @param prefix 接頭辞
	 * @param tbl DBコンテナ
	 * @param crud CRUD文字列
	 * @return SQL_ID
	 */
	public static String createSqlId(String prefix, MCDBContainer tbl, String crud) {
		return MAUCL_DbUtil.sqlID(prefix, tbl.tableName(), crud);
	}
	
	/**
	 * SQL_IDを作成します。
	 * @param ope オペレーション
	 * @param tbl テーブル名
	 * @param crud CRUD文字列
	 * @return SQL_ID
	 */
	public static String createSqlId(MCOperation ope, String tbl, String crud) {
		return MAUCL_DbUtil.sqlID(ope.getOperationInfo().logicId, tbl, crud);
	}
	
	/**
	 * SQL_IDを作成します。
	 * @param ope オペレーション
	 * @param tbl DBコンテナ
	 * @param crud CRUD文字列
	 * @return SQL_ID
	 */
	public static String createSqlId(MCOperation ope, MCDBContainer tbl, String crud) {
		return MAUCL_DbUtil.sqlID(ope.getOperationInfo().logicId, tbl.tableName(), crud);
	}

	/**
	 * ストアドプロシージャを実行します。<p>
	 * プロシージャIDは{@link #getProcStr(String, String)}の仕様に従いプロシージャ名に変換されます。<br>
	 * @param sqlId SQLID
	 * @param procId プロシージャID 
	 */
	public static void execProc(String sqlId, String procId) {
		
		MAUCL_DbUtil.execProc(sqlId, procId, null, null);
	}
	
	/**
	 * ストアドプロシージャを実行します。
	 * プロシージャIDは{@link #getProcStr(String, String)}の仕様に従いプロシージャ名に変換されます。<br>
	 * @param sqlId SQLID
	 * @param procId プロシージャID
	 * @param inRow IN引数のバインド値のRow。null可
	 * @param bindcols 引数のバインドキーの文字列。例：":bindcol1, :bindcol2"。null可
	 */
	public static void execProc(String sqlId, String procId, MCRow inRow, String bindcols) {
		MAUCL_DbUtil.execProc(sqlId, procId, inRow, null, bindcols, (String[])null);
	}
	
	/**
	 * ストアドプロシージャを実行します。<p>
	 * プロシージャIDは{@link #getProcStr(String, String)}の仕様に従いプロシージャ名に変換されます。<br>
	 * @param sqlId SQLID
	 * @param procId プロシージャID
	 * @param inRow IN引数のバインド値のRow。null可
	 * @param outRow OUT引数のバインド値のRow。null可
	 * @param bindcols 引数のバインドキーの文字列。例：":bindcol1, :bindcol2"。null可
	 * @param outbindkeys  OUT引数のバインド変数名。bindcolsに含まれるものを指定する。例："bindcol2"。null可
	 * @see #getProcStr(String, String)
	 */
	public static void execProc(String sqlId, String procId, MCRow inRow, MCRow outRow, String bindcols, String... outbindkeys) {
		StringBuilder sb = new StringBuilder();
		if (MCDatabaseManager.isOracle()) {
			sb.append(procId.replaceFirst("\\$","."));
			sb.append("(");
			if (!MCStringUtil.isNull(bindcols)) {
				sb.append(bindcols);
			}
			sb.append(")");
		}
		else {
			sb.append(procId);
			sb.append("(");
			if (!MCStringUtil.isNull(bindcols)) {
				sb.append(bindcols);
			}
			sb.append(")");
		}
		if (!isNull(sqlId)) {
			sb.append(" -- ").append(sqlId);
			sb.append("\n");
		}

		MCTransactionManager.dbTran().statement().execProc(sb.toString(), inRow, outRow, outbindkeys);
	}

	/**
	 * オートコミット:ONのデータベーストランザクションでストアドプロシージャを実行します。<p>
	 * オートコミット:ONのデータベーストランザクションを使用する以外は{@link #execProc(String, String)}
	 * と同じです。
	 */
	public static void execProcWithAutoCommitDbTran(String sqlId, String procId) {
		MAUCL_DbUtil.execProcWithAutoCommitDbTran(sqlId, procId, null, null);
	}

	/**
	 * オートコミット:ONのデータベーストランザクションでストアドプロシージャを実行します。<p>
	 * オートコミット:ONのデータベーストランザクションを使用する以外は{@link #execProc(String, String, MCRow, String)}
	 * と同じです。
	 */
	public static void execProcWithAutoCommitDbTran(String sqlId, String procId, MCRow inRow, String bindcols) {
		MAUCL_DbUtil.execProcWithAutoCommitDbTran(sqlId, procId, inRow, null, bindcols, (String[])null);
	}

	/**
	 * オートコミット:ONのデータベーストランザクションでストアドプロシージャを実行します。<p>
	 * オートコミット:ONのデータベーストランザクションを使用する以外は{@link #execProc(String, String, MCRow, MCRow, String, String...)}
	 * と同じです。
	 */
	public static void execProcWithAutoCommitDbTran(String sqlId, String procId, MCRow inRow, MCRow outRow, String bindcols, String... outbindkeys) {
		StringBuilder sb = new StringBuilder();
		if (MCDatabaseManager.isOracle()) {
			sb.append(procId.replaceFirst("\\$","."));
			sb.append("(");
			if (!MCStringUtil.isNull(bindcols)) {
				sb.append(bindcols);
			}
			sb.append(")");
		}
		else {
			sb.append(procId);
			sb.append("(");
			if (!MCStringUtil.isNull(bindcols)) {
				sb.append(bindcols);
			}
			sb.append(")");
		}
		if (!isNull(sqlId)) {
			sb.append(" -- ").append(sqlId);
			sb.append("\n");
		}

		MCTransactionManager.autoCommitDBTran().statement().execProc(sb.toString(), inRow, outRow, outbindkeys);
	}

	/**
	 * プロシージャ実行用の文字列を返します。<p>
	 * 以下の前提で、Oracle Database利用の場合に、プロシージャIDの1つ目の$を.に変更します。<br>
	 * 例）MAPA_XXX$P_$YYY>MAPA_XXX.P_$YYY
	 * 
	 * <li>OracleDatabaseでは MAPA_XXX.P_YYY
	 * <li>Postgressでは MAPA_XXX$P_YYY
	 * <li>DB定義書のプロシージャIDはPostgressのプロシージャ名
	 * <br>
	 * @param procId プロシージャID
	 * @param bindcols 引数のバインドキーの文字列。null可
	 * @return
	 */
	protected static String getProcStr(String procId, String bindcols) {
		String sql = procId;

		// $>.
		if (MCDatabaseManager.isOracle()) {
			sql = sql.replaceFirst("\\$",".");
		}
		
		// 引数追加
		StringBuilder sb = new StringBuilder();
		sb.append(sql);
		sb.append("(");
		if (!MCStringUtil.isNull(bindcols)) {
			sb.append(bindcols);
		}
		sb.append(")");
		return sb.toString();
	}
	
	/**
	 * 項目属性 DBC（文字列）からＤＢコンテナClassを生成します<p>
	 * @param tbl テーブル名
	 * @return 対応するDBコンテナClass
	 */
	@SuppressWarnings("unchecked")	// Class#castに対する処置
	public static <R extends MCDBContainer> Class<R> createDbcClass(String tbl) {
		int idx = tbl.indexOf("#");
		if (idx > 0) {
			// テーブル名にはエイリアスが付けられるのでエイリアスを除外する（MAM_ITM#ITM のように）
			tbl = tbl.substring(0, idx);
		}
		tbl = tbl.replace("”", "");
		// tbl はテーブル名を設定してもらう（例えば品目マスタなら MAM_ITM とする）
		String classNm = MCFactory.createClassName("mcframe", "server" + tbl.substring(0, 2), "dbc", tbl + "_R");
		Class<?> clazz = MCFactory.getClass(MCDBContainer.class, classNm);

		return (Class<R>) clazz;
	}
	
	/**
	 * テーブル名（文字列）とエイリアスからＤＢコンテナを生成します<p>
	 * @param tbl テーブル名
	 * @param alias エイリアス
	 * @return 対応するDBコンテナ
	 */
	public static <R extends MCDBContainer> R createDbcWithAlias(String tbl, String alias) {
		R dbc = MCList.create(MAUCL_DbUtil.<R>createDbcClass(tbl)).add();
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		builder.setBaseDbcAlias(alias);
		return dbc;
	}
	//FMCB CUSTOM END
}