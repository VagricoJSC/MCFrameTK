package mcframe.serverMAUC.MAUCL5090;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
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
import java.util.Arrays;
import java.util.List;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.queryapi.MCQueryApiBuilder.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_StEndYmUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_StEndYmUtil_MC extends MAUCL_StEndYmUtil_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MAUCL_StEndYmUtil> CLAZZ = MAUCL_StEndYmUtil.class;

	/**
	 * 開始年月終了年月制御対象の画面かどうかを返します。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return 開始年月終了年月制御対象の画面の場合true
	 */
	public static boolean isStEndYm(MCDBContainer cond) {
		return object(CLAZZ)._isStEndYm(cond);
	}

	/**
	 * ベースキーの配列を取得します。ベースキーは開始年月以外のKey項目の配列です。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return ベースキーの配列
	 */
	public static String[] getBaseKey(MCDBContainer cond) {
		return object(CLAZZ)._getBaseKey(cond);
	}

	/**
	 * 開始年月終了年月のオーバラップをチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndYmValid(MCDBContainer cond,
			String[] base_keys, MCMessageList ml) {
		object(CLAZZ)._checkStEndYmValid(cond, base_keys, ml);
	}

	/**
	 * 開始年月終了年月の連続性をチェックします。<p>
	 * 開始年月終了年月はオーバラップしていないことを前提としています。
	 * @param chkList 連続性をチェックするDBコンテナ
	 * @param trg_st_ym チェック適用開始年月
	 * @param trg_end_ym チェック適用停止年月
	 */
	public static <R extends MCDBContainer, L extends MCList<R>> boolean checkStEndYmContinuity(
			L chkList, MCDate trg_st_ym, MCDate trg_end_ym) {
		return object(CLAZZ)._checkStEndYmContinuity(chkList, trg_st_ym, trg_end_ym);
	}

	/**
	 * 開始年月の項目名
	 * 
	 */
	protected static final String $ST_YM_CLM = "st_ym";

	/**
	 * 終了年月の項目名
	 * 
	 */
	protected static final String $END_YM_CLM = "end_ym";

	/**
	 * 開始年月の項目名
	 * 
	 */
	protected static final String $ST_YM_CLM_PATH_SUFIX = ".st_ym";

	/**
	 * 終了年月の項目名
	 * 
	 */
	protected static final String $END_YM_CLM_PATH_SUFIX = ".end_ym";

	protected String getStYmClm() {
		return $ST_YM_CLM;
	}

	protected String getEndYmClm() {
		return $END_YM_CLM;
	}

	protected String getStYmClmPathSufix() {
		return $ST_YM_CLM_PATH_SUFIX;
	}

	protected String getEndYmClmPathSufix() {
		return $END_YM_CLM_PATH_SUFIX;
	}

	/**
	 * 開始年月終了年月制御対象の画面かどうかを返します。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return 開始年月終了年月制御対象の画面の場合true
	 */
	protected boolean _isStEndYm(MCDBContainer cond) {
		return !(isNull(_getStYmClmPath(cond)) || isNull(_getEndYmClmPath(cond)));
	}

	/**
	 * ベースキーの配列を取得します。ベースキーは開始年月以外のKey項目の配列です。
	 * 
	 * @param cond ＤＢコンテナ
	 * @return ベースキーの配列
	 */
	protected String[] _getBaseKey(MCDBContainer cond) {
		String[] clms = cond.getKeyColumn();
		List<String> ret = new ArrayList<String>(Arrays.asList(clms));
		ret.remove(_getStYmClmPath(cond));
		return ret.toArray(new String[0]);
	}

	/**
	 * 開始年月終了年月のオーバラップをチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndYmValid(MCDBContainer cond,
			String[] base_keys, MCMessageList ml) {
		// 全体で重複チェックをする場合
		if (base_keys.length == 0) {
			_checkStEndYmValidByAll(cond, ml);
		}
		// ベースキーごとに重複チェックをする場合
		else {
			_checkStEndYmValidByBaseKey(cond, base_keys, ml);
		}
	}

	/**
	 * 開始年月終了年月のオーバラップをベースキーごとにチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndYmValidByBaseKey(MCDBContainer cond,
			String[] base_keys, MCMessageList ml) {
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(cond);
		
		MCPermColumn[] base_keycols = Arrays.stream(base_keys)
				.map(k -> cond.getColumn$(k))
				.toArray(MCPermColumn[]::new);
		String sqlid = createSqlId(LOGIC_ID, cond, "S02");
		MCMainQuery query = builder.setSelectForUpdate(cond.getKeyColumn$())
				.setSelect(cond.getKeyColumn$())
				// 開始年月違いのレコードを抽出
				.addWhereNullable(base_keycols)
				.addWhereWithAnd(makeNeq(cond.getColumn$(getStYmClm()), bind(getStYmClm())))
				.addWhereWithAnd(makeGte(cond.getColumn$(getEndYmClm()), bind(getStYmClm())))
				.addWhereWithAnd(makeLte(cond.getColumn$(getStYmClm()), bind(getEndYmClm())))
				.buildSelect(sqlid);

		int cnt;
		try {
			cnt = query.executeQuery(cond, cond);
		}
		catch (MCException e) {
			if (!e.getID().equals(Core_Msg.FCBCC0039)) {
				throw e;
			}
			// 2件以上検出された場合は、2とする
			cnt = 2;
		}
		if (cnt > 0) {
			ml.add(new MCMessage(cond, null, MAUCL0029));
		}
	}

	/**
	 * 開始年月終了年月のオーバラップを全体でチェックします。
	 * 
	 * @param cond ＤＢコンテナ
	 * @param ml メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndYmValidByAll(MCDBContainer cond,
			MCMessageList ml) {
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(cond);

		builder.setSelect(cond.getBaseColumns$());
		// 主キー違いのレコードを抽出
		MCPredicate predicate = null;
		for (String key : cond.getKeyColumn()) {
			MCPredicate predInParen = makeNeq(cond.getColumn$(key), bind(key));
			if (cond.isNullableColumn(key)) {
				predInParen = predInParen
						.and(makeIsNotNull(cond.getColumn$(key))
								.or(bind(key).isNotNull()));
			}
			predicate = (predicate == null) ?
					predInParen : predicate.or(predInParen);
		}
		builder.setWhere(predicate);

		// 期間重複条件
		String sqlid = createSqlId(LOGIC_ID, cond, "S01");
		MCMainQuery query = builder
				.addWhereWithAnd(makeGte(cond.getColumn$(getEndYmClm()), bind(getStYmClm())))
				.addWhereWithAnd(makeLte(cond.getColumn$(getStYmClm()), bind(getEndYmClm())))
				.buildSelect(sqlid);

		int cnt;
		try {
			cnt = query.executeQuery(cond, cond);
		}
		catch (MCException e) {
			if (!e.getID().equals(Core_Msg.FCBCC0039)) {
				throw e;
			}
			// 2件以上検出された場合は、2とする
			cnt = 2;
		}
		if (cnt > 0) {
			ml.add(new MCMessage(cond, null, MAUCL0029));
		}
	}

	/**
	 * 指定期間内で使用開始年月停止年月の連続性をチェックします。
	 * 開始年月終了年月はオーバラップしていないことを前提としています。
	 * @param chkList 連続性をチェックするDBコンテナ
	 * @param trg_st_ym チェック適用開始年月
	 * @param trg_end_ym チェック適用停止年月
	 * @return
	 */
	protected <R extends MCDBContainer, L extends MCList<R>> boolean _checkStEndYmContinuity(
			L chkList, MCDate trg_st_ym, MCDate trg_end_ym) {

		if (isNullOr(trg_st_ym, trg_end_ym) || chkList.isEmpty()) {
			return false;
		}

		if (isStEndYm(chkList.createRow())) {
			chkList.sort(SortType.ASC, getStYmClm());
			MCDate old_end_ym;
			MCDate next_st_ym;
			// チェック適用開始年月の確認
			old_end_ym = trg_st_ym.addMonth(-1);

			for (R r : chkList) {
				next_st_ym = r.getDateNE(getStYmClm());
				if (!isContinue(old_end_ym, next_st_ym)) {
					return false;
				}
				old_end_ym = r.getDateNE(getEndYmClm());
			}

			// チェック適用停止年月の確認
			if (!isContinue(old_end_ym, trg_end_ym.addMonth(1))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 日付の連続性をチェックします。<p>
	 * old + 1日 >= next なら連続していると見なします。
	 * @param old
	 * @param next
	 * @return
	 */
	protected boolean isContinue(MCDate old, MCDate next) {
		return old.addMonth(1).gteDate(next);
	}

	// 　以降、分割用ユーティリティ
	/**
	 * 補正ロジック用項目：Rowステータスのソート順を表すカラム
	 */
	public static final String ROW_STATUS_NO_COL_NAME = "_row_status_no_column_name";

	/**
	 * コンテナの開始年月のカラムパスを返します。
	 * 
	 * @param cond コンテナ
	 * @return 開始年月のカラムパス
	 */
	protected String _getStYmClmPath(MCDBContainer cond) {
		String[] arr = cond.getColumnPathArray();
		for (String s : arr) {
			if (isSame(s, getStYmClm()) || s.endsWith(getStYmClmPathSufix())) {
				return s;
			}
		}
		return null;
	}

	/**
	 * コンテナの終了年月のカラムパスを返します。
	 * 
	 * @param cond コンテナ
	 * @return 終了年月のカラムパス
	 */
	protected String _getEndYmClmPath(MCDBContainer cond) {
		String[] arr = cond.getColumnPathArray();
		for (String s : arr) {
			if (isSame(s, getEndYmClm()) || s.endsWith(getEndYmClmPathSufix())) {
				return s;
			}
		}
		return null;
	}
	//FMCB CUSTOM END
}