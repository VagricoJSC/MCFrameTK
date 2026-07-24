package mcframe.serverMAUD.MAUDL5010;

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
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.commonFX.constant.FX_Const;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueJoin;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverCore.list.MCListLogicUtil;
import static mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase.*;
import mcframe.commonCore.meta.MCMeta;
import static mcframe.commonMA.meta.MA_META.*;
import mcframe.serverCore.push.MCServerPushManager;
import mcframe.commonCore.push.MCPushMessage;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverCore.requester.MCRequestObject.*;

import mcframe.serverCore.cache.MCJoinerList;
import mcframe.serverCore.dbc.FCM_PUSHMSG_SETTING_R;
import mcframe.serverCore.dbc.FCT_PUSHMSG_R;
import mcframe.serverCore.dbc.FCT_PUSHMSG_SEND_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUDL_LogicBase_MC extends MAUDL_LogicBase_MC_A{
	//FMCB CUSTOM START

	public static final String ERR_FLG_COL = "err_flg";
	
	protected static final String PUSH_LOG_KEY = "push_log";

	// ///////////////////////////////////////////////
	// 操作種別関連の実装（ここから）
	// ///////////////////////////////////////////////
	protected static final String OPE_INS = "0";
	protected static final String OPE_UPD = "1";
	protected static final String OPE_DEL = "2";
	protected static final String OPE_REF = "3";
	// ///////////////////////////////////////////////
	// 操作種別関連の実装（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ロケール、言語関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ロケール情報から言語ＣＤを返す。
	 */
	public String toLangCd(Locale lcl) {
		// 言語ＣＤはMCFrame上で定義している言語ＣＤを返す。
		// 現状は Locale#getLanguage() と同値だが、変更される可能性もある。
		if (lcl == null) return null;
		return lcl.getLanguage();
	}

	/**
	 * 言語ＣＤからをロケール情報返す。
	 */
	public Locale toLocaleFromLangCd(String langCd) {
		// 言語ＣＤはMCFrame上で定義している言語ＣＤを返す。
		// 現状は Locale#getLanguage() と同値だが、変更される可能性もある。
		if (langCd == null) return null;
		return new Locale(langCd);
	}

	/**
	 * ロケール情報からロケールＣＤを返す。
	 */
	public String toLclCd(Locale lcl) {
		// ロケールＣＤはMCFrame上で定義しているロケールＣＤを返す。
		// 現状は Locale#toString() と同値だが、変更される可能性もある。
		if (lcl == null) return null;
		return lcl.toString();
	}

	/**
	 * ロケールＣＤからをロケール情報返す。
	 */
	public Locale toLocaleFromLclCd(String lclCd) {
		// ロケールＣＤはMCFrame上で定義しているロケールＣＤを返す。
		// 現状は Locale#toString() と同値だが、変更される可能性もある。
		if (lclCd == null) return null;
		Locale ans;
		int idx = lclCd.indexOf('_');
		if (idx < 0) {
			ans = new Locale(lclCd);
		}
		else if (idx == lclCd.length() - 1) {
			ans = new Locale(lclCd);
		}
		else {
			String lang = lclCd.substring(0, idx);
			String cntry = lclCd.substring(idx + 1, lclCd.length());
			ans = new Locale(lang, cntry);
		}
		return ans;
	}

	/**
	 * ログインユーザのロケール
	 */
	public Locale getUsrLocale() {
		return MCSys.user.locale();
	}

	/**
	 * ログインユーザの言語ＣＤ
	 */
	public String getUsrLangCd() {
		return toLangCd(MCSys.user.locale());
	}

	/**
	 * ログインユーザのロケールＣＤ
	 */
	public String getUsrLclCd() {
		return toLclCd(MCSys.user.locale());
	}

	// ///////////////////////////////////////////////
	// ロケール、言語関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 帳票メソッド（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 「コンテナに持っている数値の表示形式」と引数の「小数部有効桁数」を元に
	 * 数値の文字列表現を指定のカラムにセットします。
	 *
	 * @param <R>
	 * @param rpt レポートセット
	 * @param list 変換対象のlist。レポートセットに格納可能なRowであること。
	 * @param intStrCol 数値の整数部の文字列表現を格納するためのカラム
	 * @param decimalStrCol 数値の小数部の文字列表現を格納するためのカラム
	 * @param numCol 変換対象の数値が格納されているカラム
	 * @param decPlaceCol 変換時に使用する数値の小数部有効桁数を格納しているカラム
	 * @param roundingMode 有効桁数以下の丸め方法
	 */
	protected <R extends MCRow, L extends MCList<R>> void putNumStr(MCReportSet rpt,
			L list, String intStrCol, String decimalStrCol, String numCol,
			String decPlaceCol, RoundingMode roundingMode) {
		if (list == null || list.size() == 0) {
			return;
		}
		// 小数部込で文字列化し intStrCol に仮保存
		putNumStr(rpt, list, intStrCol, numCol, decPlaceCol, roundingMode);
		Locale lcl = rpt.getLocale();
		R proto = list.get(0);
		String fmtId = getRptFormatId(rpt, proto, numCol);
		java.text.DecimalFormatSymbols dfs = null;
		DecimalFormat decFmt = createDecimalFormat(lcl, fmtId);
		if (decFmt != null) {
			dfs = decFmt.getDecimalFormatSymbols();
		}
		if (dfs == null) {
			dfs = new java.text.DecimalFormatSymbols();
		}
		char decSep = dfs.getDecimalSeparator();

		for (R r : list) {
			// 仮保存した文字列を分割する
			String fullNum = r.getString(intStrCol);
			if (fullNum == null || fullNum.length() < 0) {
				continue;
			}
			StringBuilder intNumStr = new StringBuilder();
			StringBuilder decNumStr = new StringBuilder();
			boolean hasDec = false;
			int length = fullNum.length();
			for (int i = 0; i < length; i++) {
				char c = fullNum.charAt(i);
				if (decSep == c) {
					hasDec = true;
				}
				if (hasDec) {
					decNumStr.append(c);
				}
				else {
					intNumStr.append(c);
				}
			}
			r.setStringNE(intStrCol, intNumStr.toString());
			if (hasDec) {
				r.setStringNE(decimalStrCol, decNumStr.toString());
			}
		}
	}

	/**
	 * 「コンテナに持っている数値の表示形式」と引数の「小数部有効桁数」を元に
	 * 数値の文字列表現を指定のカラムにセットします。<br>
	 * 有効桁数以下の丸めはしません。
	 *
	 * @param <R>
	 * @param rpt レポートセット
	 * @param list 変換対象のlist。レポートセットに格納可能なRowであること。
	 * @param intStrCol 数値の整数部の文字列表現を格納するためのカラム
	 * @param decimalStrCol 数値の小数部の文字列表現を格納するためのカラム
	 * @param numCol 変換対象の数値が格納されているカラム
	 * @param decPlaceCol 変換時に使用する数値の小数部有効桁数を格納しているカラム
	 */
	protected <R extends MCRow, L extends MCList<R>> void putNumStr(MCReportSet rpt,
			L list, String intStrCol, String decimalStrCol, String numCol,
			String decPlaceCol) {

		putNumStr(rpt, list, intStrCol, decimalStrCol, numCol, decPlaceCol, null);
	}

	// ///////////////////////////////////////////////
	// 帳票メソッド（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// メッセージ関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 印刷対象のデータが存在しない場合のメッセージを返す。
	 */
	public MCMessage msgNoPrintData() {
		return new MCMessage(MAUDL0029);
	}

	/**
	 * メッセージプールを見て、エラーメッセージがある場合に、「更新できませんでした。」というメッセージで例外をスローします。<br>
	 * メッセージプールに保持されたメッセージは全て例外のcauseMessageに保持します。
	 */
	protected void throwUpdErr() {
		throwErr(msgUpdErr());
	}

	/**
	 * メッセージプールを見て、エラーメッセージがある場合に、「取り消しできませんでした。」というメッセージで例外をスローします。<br>
	 * メッセージプールに保持されたメッセージは全て例外のcauseMessageに保持します。
	 */
	protected void throwCanErr() {
		throwErr(msgCanErr());
	}

	/**
	 * メッセージプールを見て、エラーメッセージがある場合に、「削除できませんでした。」というメッセージで例外をスローします。<br>
	 * メッセージプールに保持されたメッセージは全て例外のcauseMessageに保持します。
	 */
	protected void throwDelErr() {
		throwErr(msgDelErr());
	}

	/**
	 * 「更新できませんでした。」のメッセージを返す。
	 */
	protected MCMessage msgUpdErr() {
		return new MCMessage(MAUDL0004);
	}

	/**
	 * 「取り消しできませんでした。」のメッセージを返す。
	 */
	protected MCMessage msgCanErr() {
		return new MCMessage(MAUDL0005);
	}

	/**
	 * 「削除できませんでした。」のメッセージを返す。
	 */
	protected MCMessage msgDelErr() {
		return new MCMessage(MAUDL0006);
	}

	/**
	 * 「処理中にエラーが発生しました。」のメッセージを返す。
	 */
	protected MCMessage msgOpeErr() {
		return new MCMessage(MAUDL0010);
	}

	/**
	 * 「発行できませんでした。」のメッセージを返す。
	 */
	protected MCMessage msgPrintErr() {
		return new MCMessage(MAUDL0011);
	}

	/**
	 * メッセージプールを見て、エラーメッセージがある場合に、引数のメッセージＩＤで例外をスローします。<br>
	 * メッセージプールに保持されたメッセージは全て例外のcauseMessageに保持します。<br>
	 * 本ユーティリティは単票画面と対になるロジックのみでの使用を推奨します。<br>
	 * 一覧登録画面と対になるロジックで使用すると、分割実行時に他の行で発生したエラーメッセージにより本来正常処理すべき行が例外になってしまいます。<br>
	 * また、サービスで使用すると、一覧登録画面と対になるロジックで利用できなくなります。
	 *
	 * @param msg メッセージ
	 */
	protected void throwErr(MCMessage msg) {
		if (hasErrMsg()) {
			MCAppException ex = new MCAppException(msg);
			ex.addCauseMessageList(MCMessagePool.getMessageList());
			throw ex;
		}
	}

	/**
	 * メッセージプールを見て、エラーメッセージがあるかどうかを返す。
	 */
	protected boolean hasErrMsg() {
		MCMessageList msgL = MCMessagePool.getMessageList();
		for (MCMessage msg :msgL) {
			if (isErrMsg(msg)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 「関連する行にエラーフラグを設定し、メッセージを追加する。
	 * メッセージはmsgRelateRowErrで取得できるメッセージを追加する。
	 * @param list
	 * @param grpKeys
	 * @param errFlgCol
	 */
	protected <T extends MCRow> void setGrpErrFlgByKey(MCList<T> list, String[] grpKeys, String errFlgCol) {
		MCList<T>[] grpL = list.groupList(grpKeys);
		for (MCList<T> grp : grpL) {
			boolean err_flg = false;
			T relatedR = null;
			for (T r :grp) {
				if (r.getBoolean(errFlgCol)) {
					err_flg = true;
					relatedR = r;
					break;
				}
			}
			if (err_flg) {
				for (T errR :grp) {
					if (!errR.getBoolean(errFlgCol)) {
						errR.setBoolean(errFlgCol, true);
						MCMessagePool.add(msgRelateRowErr(errR, relatedR));
					}
				}
			}
		}
	}

	/**
	 * 「関連する行でエラーになりました。」のメッセージを返す。
	 *
	 * @param errorRow エラー行
	 * @param relateRow 関連する行
	 * @return メッセージ
	 */
	protected MCMessage msgRelateRowErr(MCRow errorRow, MCRow relateRow) {
		return new MCMessage(errorRow, null, MAUDL0013, errorRow.getGUIIndex() + 1, relateRow.getGUIIndex() + 1);
	}

	// ///////////////////////////////////////////////
	// メッセージ関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// マルチスレッド関連リソース取得共通処理（ここから）
	// ///////////////////////////////////////////////
	/**
	 * バッチサイズ（１スレッドあたりの処理数）をMCConfigServerリソースから取得する。</br>
	 * <P>
	 * リソースキー：[mid].[lid].[oid].thread.batchSize</br>
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * リソースの設定が無い場合や0以下の値が指定されていた場合は、
	 * 分割対象の上り電文のリストのサイズをスレッド数で割った値を返す（端数切り上げ）</br>
	 * ※100件を4スレッドで処理する場合、25となる
	 * </P>
	 * @param upListSize 分割対象の上り電文のリストのサイズ
	 */
	protected int getThreadBatchSize(int upListSize) {
		int batchSize = getResourceThreadBatchSize();
		if (batchSize > 0) {
			return batchSize;
		}

		int thread = MCServerThreadManager.getThreadCount(upListSize);
		if (thread > 0) {
			MCNumber upSize = MCNumber.valueOf(upListSize);
			return upSize.divide(thread, 0, java.math.RoundingMode.UP).intValue();
		}
		else {
			return -1;
		}
	}

	/**
	 * バッチサイズ（１スレッドあたりの処理数）をMCConfigServerリソースから取得する。</br>
	 * <P>
	 * リソースキー：[mid].[lid].[oid].thread.batchSize</br>
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * リソースの設定が無い場合や0以下の値が指定されていた場合は、</br>
	 * <B>CUL_Cacheのキャッシュ機能のキャッシュサイズ</B>をリソースより取得して返す。
	 * </P>
	 */
	protected int getThreadBatchSize() {
		int batchSize = getResourceThreadBatchSize();
		if (batchSize > 0) {
			return batchSize;
		}
		return getCacheSize();
	}

	/**
	 * バッチサイズ（１スレッドあたりの処理数）をMCConfigServerリソースから取得する。</br>
	 * <P>
	 * リソースキー：[mid].[lid].[oid].thread.batchSize</br>
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * リソースの設定が無い場合はデフォルト値(-1)を返す</br>
	 * </P>
	 */
	protected int getResourceThreadBatchSize() {
		String mid = MCSys.request.moduleId();
		String lid = MCSys.request.logicId();
		String oid = MCSys.request.operationId();
		String key = MCConfig.server.findHierarchy(mid, lid, oid, "thread.batchSize");
		if (MCStringUtil.isNull(key)) {
			return -1;
		}
		return MCConfig.server.getInteger(key, -1);
	}

	/**
	 * CUL_Cacheのキャッシュ機能のキャッシュサイズの最大値をMCAppServerリソースから取得する。
	 * <P>
	 * 以下の順にキーを探索し最初に合致した物の値を採用する。</br>
	 * cache_size.[mid].[lid].[oid]</br>
	 * cache_size.[mid].[lid]</br>
	 * cache_size.[mid]</br>
	 * cache_size</br>
	 * いずれの方法でもキャッシュサイズが設定されていない場合はデフォルト値（1000）を返す。
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * </P>
	 */
	protected int getCacheSize() {
		String mid = MCSys.request.moduleId();
		String lid = MCSys.request.logicId();
		String oid = MCSys.request.operationId();
		String[] keys = new String[] {
				"cache_size", mid, lid, oid
		};
		for (int i = keys.length; i > 0; i--) {
			String[] k = MCCollectionUtil.subArray(keys, 0, i, String.class);
			int cacheSize = MCConst.app.getInteger(MCConst.createKey(k), -1);
			if (cacheSize > 0) {
				return cacheSize;
			}
		}
		return 1000;
	}

	// ///////////////////////////////////////////////
	// マルチスレッド関連リソース取得共通処理（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 表示順ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 表示順を設定するユーティリティです。<br>
	 * 表示順にはGUIインデックスを設定します。<br>
	 * 表示順の項目名はdisp_seq固定です。
	 *
	 * @param l Listコンテナ
	 */
	protected void setDispSeq(MCList l) {
		setDispSeq(l, "disp_seq");
	}

	/**
	 * 表示順を設定するユーティリティです。<br>
	 * 表示順にはGUIインデックスを設定します。
	 *
	 * @param l Listコンテナ
	 * @param disp_seq_col 表示順を格納するカラム名
	 */
	protected void setDispSeq(MCList l, String disp_seq_col) {
		l.sort(new MCRowComparator<MCRow>() {
			public int compare(MCRow r1, MCRow r2) {
				return r1.getGUIIndex() - r2.getGUIIndex();
			}
		});
		int disp_seq_cntr = 1;
		for (int i = 0; i < l.size(); i++) {
			MCRow r = (MCRow)l.get(i);
			if (r.isStatusCreate() || r.isStatusModify()) {
				r.setNumber(disp_seq_col, disp_seq_cntr++);
			}
			else if (r.isStatusNone()) {
				if (!isSame(r.getNumber(disp_seq_col), new MCNumber(disp_seq_cntr))) {
					r.setStatus(MCRow.MODIFY);
				}
				r.setNumber(disp_seq_col, disp_seq_cntr++);
			}
			else {
				r.setNumber(disp_seq_col, null);
			}
		}
	}
	// ///////////////////////////////////////////////
	// 表示順ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 明細0件チェックのユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 明細0件チェックのユーティリティメソッド（メイン）<p>
	 * @param hdrR ヘッダ
	 * @param dtlL 明細
	 * @return　メッセージリスト
	 */
	protected MCMessageList checkAtLeastOneDtl(MCRow hdrR, MCList dtlL) {
		MCMessageList msgL = new MCMessageList();
		int cnt = dtlL.subList(MCRow.Status.CREATE).size()
				+ dtlL.subList(MCRow.Status.MODIFY).size()
				+ dtlL.subList(MCRow.Status.NONE).size();

		if (isSame(cnt, 0)) {
			msgL.add(new MCMessage(hdrR, null, MAUDL0007));
		}
		return msgL;
	}
	// ///////////////////////////////////////////////
	// 明細0件チェックのユーティリティ（ここまで）
	// ///////////////////////////////////////////////

	/**
	 * 対象コンテナから指定されたステータスで、エラーＦＬＧがオフの行を抽出します。
	 *
	 * @param container
	 * @param status
	 * @return　指定されたステータスのRowを格納したリスト
	 */
	protected <R extends MCRow> MCList<R> getChkList(MCContainer container, MCRow.Status... status) {
		MCList<R> l = getChkList(container);
		l = l.subList(status);
		return l;
	}
	/**
	 * 対象コンテナから指定されたステータスで、エラーＦＬＧがオフの行を抽出します。
	 *
	 * @param container
	 * @param status
	 * @return　指定されたステータスのRowを格納したリスト
	 */
	protected <R extends MCRow> MCList<R> getChkList(MCContainer container) {
		MCList<R> l = null;
		if (container instanceof MCRow) {
			l = MCList.create((R)container);
			l.add((R)container);
		}
		else if (container instanceof MCList) {
			l = (MCList<R>) container;
		}
		if (l.createRow().contains(ERR_FLG_COL)) {
			return l.subList(ERR_FLG_COL, false);
		}
		else {
			return l;
		}
	}

	/**
	 * peg_noの値とコンテナ属性をコピーします。
	 * コピー先のMCListに行を追加し、コピー元のMCListのpeg_noとコンテナ属性をコピーします。
	 * <p>
	 * このメソッドを利用する場合は、コピー元とコピー先のMCListのRowコンテナにpeg_noの数値カラムが存在する必要があります。
	 * 
	 * @param dest コピー先のMCList
	 * @param src コピー元のMCList
	 */
	protected void copyPegNoAndAttr(MCList dest, MCList src) {
		// レプリカにpeg_noと電文属性を設定する
		for (int i = 0; i < src.size(); i++) {
			MCRow r = src.get(i);
			MCRow s = dest.createRow();
			s.setNumber("peg_no", r.getNumber("peg_no"));
			s.setAttributes(r);
			dest.add(s);
		}
	}
	
	// ///////////////////////////////////////////////
	// サーバチェック関連（ここから）
	// ///////////////////////////////////////////////
	/** マスタ存在チェック用オペレーショングループ */
	protected static final String CHK_EXISTS = "EXISTS";

	/**
	 * Checkerオペレーション.<p>
	 *
	 * アプリ共通のサーバチェッカークラスです。<br>
	 */
	public class Checker extends MAUDL_LogicBase_MC_A.Checker {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();

			initUp();
			initUpSub();
		}
		protected void initUp() {
			// NULL文字設定
			int i = 0;
			while(up(i) != null) {
				doTruncDate(up(i));
				setNullVal(up(i));
				setSysVal(up(i++));
			}
		}
		/**
		 * 個別処理のカスタマイズ用です。<p>
		 */
		protected void initUpSub() {
		}

		@Override
		protected void doIt() {
			// 更新カウンタ必須チェック
			MCMessageList updCntChkReqMsgL = new MCMessageList();
			updCntChkReqMsgL.addAll(updCntChkReq());
			addChkErrUpperLimitMsg(updCntChkReqMsgL);
			setErrFlg(updCntChkReqMsgL);

			// マスタで使用している更新カウンタチェックメソッド。業務アプリでは何もしない。チェックでエラーになった場合は例外がスローされる想定
			updCntChk();

			// 更新カウンタチェック含む基本となるチェックおよび補完（updCntChkで更新カウンタチェックしない場合）
			MCMessageList doServerCheckBaseMsgL = new MCMessageList();
			doServerCheckBaseMsgL.addAll(doServerCheckBase());
			addChkErrUpperLimitMsg(doServerCheckBaseMsgL);
			setErrFlg(doServerCheckBaseMsgL);

			putListLogicCheckBind();

			// 必須チェックなどの定型チェック
			MCMessageList doServerCheckMsgL = new MCMessageList();
			doServerCheckMsgL.addAll(doServerCheck());
			addChkErrUpperLimitMsg(doServerCheckMsgL);
			setErrFlg(doServerCheckMsgL);

			// その他のチェック
			MCMessageList doServerCheckSubMsgL = new MCMessageList();
			doServerCheckSubMsgL.addAll(doServerCheckSub());
			addChkErrUpperLimitMsg(doServerCheckSubMsgL);
			setErrFlg(doServerCheckSubMsgL);

			// エラーのあった行に対して処理結果状況区分設定
			setErrToRtnStsTyp();

			MCMessagePool.addAll(updCntChkReqMsgL);
			MCMessagePool.addAll(doServerCheckBaseMsgL);
			MCMessagePool.addAll(doServerCheckMsgL);
			MCMessagePool.addAll(doServerCheckSubMsgL);
		}

		/**
		 * 更新カウンタチェック含む、基本となるチェック<p>
		 */
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = new MCMessageList();
			return msgL;
		}

		/**
		 * 排他チェック用メソッド<p>
		 * 本メソッドはマスタの親クラスのみで使っており、業務画面のチェックロジックではオーバライドしない。
		 */
		@Deprecated
		protected void updCntChk() {
			return;
		}
		/**
		 * 排他必須チェック
		 */
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = new MCMessageList();
			// 排他必須チェック
			int i = 0;
			while(up(i) != null) {
				msgL.addAll(updCntReqChk(up(i)));
				i++;
			}
			return msgL;
		}
		/** 排他必須チェック用項目属性ＩＤ */
		protected static final String CHK_REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
		/**
		 * 排他必須チェック<p>
		 */
		protected MCMessageList updCntReqChk(MCContainer container) {
			MCMessageList msgL = new MCMessageList();

			MCList<? extends MCConstRow> l = getChkList(container);
			if (l == null) {
				return msgL;
			}

			Map<String, String> reqMap = l.createRow().getExtMap(CHK_REQ_UPD_CNT_CHK);
			if (reqMap == null) {
				return msgL;
			}

			for (String col : reqMap.keySet()) {
				Set<MCRow.Status> set = new HashSet<>();
				for (String status : reqMap.get(col).split(",")) {
					if ("I".equals(status)) {
						set.add(MCRow.CREATE);
					}
					else if ("U".equals(status)) {
						set.add(MCRow.MODIFY);
					}
					else if ("D".equals(status)) {
						set.add(MCRow.DELETE);
					}
					else if ("N".equals(status)) {
						set.add(MCRow.NONE);
					}
					// Eの場合は新規行以外チェックする
					else if ("E".equals(status)) {
						set.add(MCRow.MODIFY);
						set.add(MCRow.DELETE);
						set.add(MCRow.NONE);
					}
				}

				MCList<? extends MCConstRow> target = l.subList(set.toArray(new MCRow.Status[0]));
				msgL.addAll(check(target, col, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}


		/**
		 * サーバチェック処理
		 * <P>
		 * チェック対象コンテナからステータスがCREATE, MODIFYのRowを抽出して
		 * サーバチェック処理メインを実行します。
		 * </P>
		 */
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = new MCMessageList();
			try {
				// 共通チェック
				int i = 0;
				while (up(i) != null) {
					msgL.addAll(doServerCheck(up(i)));
					afterDoServerCheck(MCNumber.valueOf(i));
					i++;
				}
			}
			catch (MCAppException ex) {
				if (isSame(ex.getID(), MAUDL0408)) {
					msgL.addAll(ex.getCauseMessageList());
					setErrFlg();
				}
				else {
					throw ex;
				}
			}
			return msgL;
		}

		/**
		 * ブロックのサーバチェックが完了した後に実行されます。
		 *
		 * @param paramIndex チェックが完了したブロック番号
		 */
		protected void afterDoServerCheck(MCNumber paramIndex) {

		}

		/**
		 * サーバチェック処理
		 * <P>
		 * チェック対象コンテナからステータスがCREATE, MODIFYのRowを抽出して
		 * サーバチェック処理メインを実行します。
		 * </P>
		 * @param container チェック対象コンテナ
		 */
		protected MCMessageList doServerCheck(MCContainer block) {
			MCMessageList msgL = new MCMessageList();

			// 通常のチェックは削除行は対象としない
			MCList<? extends MCConstRow> l = getChkList(block, MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
			MCNumber paramIndex;
			if (l != null && l.size() != 0) {
				paramIndex = getParamIndex(block);
				msgL.addAll(doServerCheck(paramIndex, l, getSubOpes(CHK_EXISTS)));
			}

			// 複数行にまたがるチェックは削除行も対象とする
			l = getChkList(block);
			if (l != null && l.size() != 0) {
				paramIndex = getParamIndex(block);
				msgL.addAll(doServerCheckRows(paramIndex, getChkList(block)));
			}

			return msgL;
		}
		/**
		 * 対象コンテナから指定されたステータスで、エラーＦＬＧがオフの行を抽出します。
		 *
		 * @param container
		 * @param status
		 * @return　指定されたステータスのRowを格納したリスト
		 */
		protected <R extends MCRow> MCList<R> getChkList(MCContainer container, MCRow.Status... status) {
			MCList<R> l = getChkList(container);
			l = l.subList(status);
			return l;
		}
		/**
		 * 対象コンテナから指定されたステータスで、エラーＦＬＧがオフの行を抽出します。
		 *
		 * @param container
		 * @param status
		 * @return　指定されたステータスのRowを格納したリスト
		 */
		protected <R extends MCRow> MCList<R> getChkList(MCContainer container) {
			MCList<R> l = null;
			if (container instanceof MCRow) {
				l = MCList.create((R)container);
				l.add((R)container);
			}
			else if (container instanceof MCList) {
				l = (MCList<R>) container;
			}
			if (l.createRow().contains(ERR_FLG_COL)) {
				return l.subList(ERR_FLG_COL, false);
			}
			else {
				return l;
			}
		}

		/**
		 * サーバチェック処理メイン（リスト用）
		 * <P>
		 * 以下のチェックを実行する。</br>
		 * ・汎用チェック（必須・桁数・定数等）</br>
		 * ・マスタ存在チェック</br>
		 * </P>
		 * @param paramIndex ブロック番号
		 * @param up チェック対象のリスト
		 * @param opes マスタ存在チェックに使用するサブオペレーションのリスト（オペレーショングループ名は「EXISTS」）
		 */
		protected MCMessageList doServerCheck(MCNumber paramIndex, MCList<? extends MCConstRow> chkTarL, List<MCController> opes) {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(doSvrChkValue(chkTarL));
			throwChkErrUpperLimitErr(msgL);
			msgL.addAll(doSvrChkValues(chkTarL));
			throwChkErrUpperLimitErr(msgL);
			
			// 必須チェック、値の正／不正チェックが終わったら、エラー行を除き、後続のチェック処理をする
			setErrFlg(msgL);
			MCList<? extends MCConstRow> notErrL = getChkList(chkTarL);

			
			msgL.addAll(doSvrChkListLogic(paramIndex, notErrL));
			throwChkErrUpperLimitErr(msgL);
			msgL.addAll(doSvrChkExists(notErrL, opes));
			throwChkErrUpperLimitErr(msgL);
			msgL.addAll(doServerCheckExistsKey(notErrL));
			throwChkErrUpperLimitErr(msgL);
			msgL.addAll(doSvrChkLocale(notErrL));
			throwChkErrUpperLimitErr(msgL);

			return msgL;
		}

		/**
		 * 複数行にまたがるチェックを実行する。
		 * <P>
		 * 以下のチェックを実行する。</br>
		 * ・重複チェック</br>
		 * </P>
		 * @param paramIndex ブロック番号
		 * @param up チェック対象のリスト
		 */
		protected MCMessageList doServerCheckRows(MCNumber paramIndex, MCList<? extends MCConstRow> chkTarL) {
			MCMessageList msgL = new MCMessageList();
			MCConstRow proto = chkTarL.createRow();
			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_DUPLICATE)).entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(chkTarL, cols, getDuplicateValidater(cols)));
			}
			return msgL;
		}

		/** 必須チェック用項目属性ＩＤ */
		protected static final String CHK_REQUIRED = "REQUIRED";
		/** 数値チェック用項目属性ＩＤ */
		protected static final String CHK_NUM = "CHK_NUM";
		protected static final String CHK_NUM_POSITIVE = "positive";
		protected static final String CHK_NUM_NOT_ZERO = "notZero";
		/** 日付チェック用項目属性ＩＤ */
		protected static final String CHK_DT = "CHK_DT";
		protected static final String CHK_DT_BF_TODAY = "bfToday";
		protected static final String CHK_DT_AF_TODAY = "afToday";
		protected static final String CHK_DT_TM_BF_TODAY = "tmBfToday";
		/** 定数存在チェック用項目属性ＩＤ */
		protected static final String CHK_CONST = "CONST";
		/** 文字列パタンマッチチェック用項目属性ＩＤ */
		protected static final String CHK_PTN = "CHK_PTN";

		/**
		 * 汎用チェック（単一項目が対象のチェック）
		 * <P>
		 * 以下のチェックを実行して、メッセージリストを返す。</br>
		 * ・メタ情報桁チェック</br>
		 * ・必須チェック</br>
		 * ・マスタ項目必須チェック</br>
		 * ・数値チェック（正数・０以外）</br>
		 * ・日付チェック（運用日付以前・運用日付以降・時分秒カットした日付が運用日付以前）</br>
		 * ・定数チェック</br>
		 * </P>
		 * @param up チェック対象のリスト
		 */
		protected MCMessageList doSvrChkValue(MCList<? extends MCConstRow> up) {
			MCConstRow proto = up.createRow();
			MCMessageList msgL = new MCMessageList();

			Map<String, String> reqMap = proto.getExtMap(CHK_REQUIRED);
			Map<String, String> numMap = proto.getExtMap(CHK_NUM);
			Map<String, String> dtMap = proto.getExtMap(CHK_DT);
			Map<String, String> cstMap = proto.getExtMap(CHK_CONST);
			Map<String, String> ptnMap = proto.getExtMap(CHK_PTN);
			Map<String, String> slMap = proto.getExtMap(CHK_SMALL_LARGE);

			for (String column : proto.getColumnPathArray()) {
				List<IfValidater> valL = new ArrayList<IfValidater>();

				// メタ情報桁チェックバリデータ（常に実施）
				valL.add(getScaleAndLengthValidater(column));

				// 必須チェックバリデータ
				if (reqMap != null && !isNull(reqMap.get(column))) {
					valL.add(getReqValidater(column));
				}
				// 数値チェックバリデータ
				if (numMap != null && !isNull(numMap.get(column))) {
					if (numMap.get(column).equals(CHK_NUM_POSITIVE)) {
						valL.add(getPositiveValidater(column));
					}
					else if (numMap.get(column).equals(CHK_NUM_NOT_ZERO)) {
						valL.add(getNotZeroValidater(column));
					}
				}
				// 数値範囲チェックバリデータ
				if (slMap != null && !isNull(slMap.get(column))) {
					String[] strs = slMap.get(column).split(",");
					for(String str : strs) {
						if (str.matches("^[\\d:\\-]*$")) {
							String[] numStrs = str.split(":");
							if (numStrs.length == 2) {
								MCNumber min = isNull(numStrs[0]) ? null : MCNumber.valueOf(numStrs[0]);
								MCNumber max = isNull(numStrs[1]) ? null : MCNumber.valueOf(numStrs[1]);
								valL.add(getSmallLargeValidater(column, min, max));
							}
							else if(numStrs.length == 1) {
								MCNumber min = isNull(numStrs[0]) ? null : MCNumber.valueOf(numStrs[0]);
								MCNumber max = null;
								valL.add(getSmallLargeValidater(column, min, max));
							}
						}
					}
				}
				// 日付チェックバリデータ
				if (dtMap != null && !isNull(dtMap.get(column))) {
					if (dtMap.get(column).equals(CHK_DT_BF_TODAY)) {
						valL.add(getBeforeTodayValidater(column));
					}
					else if (dtMap.get(column).equals(CHK_DT_AF_TODAY)) {
						valL.add(getAfterTodayValidater(column));
					}
					else if (dtMap.get(column).equals(CHK_DT_TM_BF_TODAY)) {
						valL.add(getTmBeforeTodayValidater(column));
					}
				}
				// 定数チェックバリデータ
				if (cstMap != null && !isNull(cstMap.get(column))) {
					MCAppConst[] tmp = getConstArray(cstMap.get(column));
					if (tmp != null) {
						valL.add(getConstExistValidater(column, tmp));
					}
				}
				// パタンマッチバリデータ
				if (ptnMap != null && !isNull(ptnMap.get(column))) {
					MAC_CHK_PTN_TYP typ = getChkPtnTyp(ptnMap.get(column));
					valL.add(getPatternMatchValidater(column, typ.value(), typ.name()));
				}

				// チェック実行
				if (!valL.isEmpty()) {
					msgL.addAll(check(up, column, valL));
				}
			}
			return msgL;
		}
		/** 重複チェック用項目属性ＩＤ */
		protected static final String CHK_DUPLICATE = "DUPLICATE";
		/** 一つだけ入力チェック用項目属性ＩＤ */
		protected static final String CHK_TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
		/** 一つ以上入力チェック用項目属性ＩＤ */
		protected static final String CHK_AT_LEAST_ONE = "AT_LEAST_ONE";
		/** 一つだけ必須入力チェック用項目属性ＩＤ */
		protected static final String CHK_ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
		/** 日付前後チェック用項目属性ＩＤ */
		protected static final String CHK_BEFORE_AFTER = "BEFORE_AFTER";
		/** 数値大小チェック用項目属性ＩＤ */
		protected static final String CHK_SMALL_LARGE = "SMALL_LARGE";

		/**
		 * 汎用チェック（複数項目が対象のチェック）
		 * <P>
		 * 以下のチェックを実行して、メッセージリストを返す。</br>
		 * ・重複チェック</br>
		 * ・一つだけ入力チェック</br>
		 * ・一つ以上入力チェック</br>
		 * ・一つだけ必須入力チェック</br>
		 * ・日付前後チェック</br>
		 * ・数値大小チェック</br>
		 * </P>
		 * @param up チェック対象のリスト
		 */
		protected MCMessageList doSvrChkValues(MCList<? extends MCConstRow> up) {
			MCConstRow proto = up.createRow();
			MCMessageList msgL = new MCMessageList();

			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_TOO_MANY_INPUTS)).entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(up, cols, getTooManyInputsValidater(cols)));
			}
			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_AT_LEAST_ONE)).entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(up, cols, getAtLeastOneValidater(cols)));
			}
			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_ONLY_ONE_INPUT)).entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(up, cols, getOnlyOneInputValidater(cols)));
			}
			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_BEFORE_AFTER),"BF","AF").entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(up, cols, getBeforeAfterValidater(cols)));
			}
			for (Map.Entry<String, List<String>> e : getGrpColList(proto.getExtMap(CHK_SMALL_LARGE),"S","L").entrySet()) {
				String[] cols = (String[])e.getValue().toArray(new String[0]);
				msgL.addAll(check(up, cols, getSmallLargeValidater(cols)));
			}
			return msgL;
		}
		/**
		 * 引数の map[column, group] から同一 group の column をリストにまとめて<br>
		 * map[group, List[column]] として返す。
		 * <P>
		 * group の文字列に関しては特に決まりは無い。
		 * </P>
		 * @param map 実装仕様書に定義された項目（column）と属性値（group）のマップ
		 */
		protected Map<String, List<String>> getGrpColList(Map<String, String> map) {
			Map<String, List<String>> m = new HashMap<String, List<String>>();
			if (map != null) {
				for (Map.Entry<String, String> e : map.entrySet()) {
					if (!m.containsKey(e.getValue())) {
						m.put(e.getValue(), new ArrayList<String>());
					}
					m.get(e.getValue()).add(e.getKey());
				}
			}
			return m;
		}
		/**
		 * 引数の map[column, group:mark] から同一 group の column をリストにまとめて<br>
		 * map[group, List[column]] として返す。
		 * <P>
		 * mark によって、before->after の順番でリストに格納する。
		 * </P>
		 * @param map 実装仕様書に定義された項目（column）と属性値（group）のマップ
		 * @param before 先に指定する項目の目印
		 * @param after 後に指定する項目の目印
		 */
		protected Map<String, List<String>> getGrpColList(Map<String, String> map, String before, String after) {

			Map<String, List<String>> m = new HashMap<String, List<String>>();
			if (map != null) {
				Map<String, String> b = new HashMap<String, String>();
				Map<String, String> a = new HashMap<String, String>();

				for (Map.Entry<String, String> e : map.entrySet()) {

					String[] strs = e.getValue().split(",");

					for (String getVal : strs) {
						int i = getVal.indexOf(":");
						if (i < 0) {
							continue;
						}
						String key = getVal.substring(0, i);

						if (getVal.endsWith(before)) {
							if (!b.containsKey(key)) {
								b.put(key, e.getKey());
							}
						}
						else if (getVal.endsWith(after)) {
							if (!a.containsKey(key)) {
								a.put(key, e.getKey());
							}
						}
					}
				}
				for (Map.Entry<String, String> e : b.entrySet()) {
					if (a.containsKey(e.getKey())) {
						m.put(e.getKey(), new ArrayList<String>());
						m.get(e.getKey()).add(e.getValue());
						m.get(e.getKey()).add(a.get(e.getKey()));
					}
				}
			}
			return m;
		}

		/**
		 * メタ情報桁チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getScaleAndLengthValidater(String col) {
			return new FXUCL_ScaleAndLengthValidater();
		}
		/**
		 * 必須チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * 例：<br>
		 * if (col.equals("xx_cd")) {<br>
		 * 		return new FXUCL_RequiredValidater(r -> r.getBoolean("check"));<br>
		 * }<br>
		 * return super.getReqValidater(col);<br><br>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getReqValidater(String col) {
			return new MAUDL_RequiredValidater_Status();
		}
		/**
		 * 正数チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getPositiveValidater(String col) {
			return new FXUCL_PositiveValidater();
		}
		/**
		 * ０以外チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getNotZeroValidater(String col) {
			return new FXUCL_NotZeroValidater();
		}
		/**
		 * 運用日付以前チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getBeforeTodayValidater(String col) {
			return new FXUCL_BeforeTodayValidater();
		}
		/**
		 * 運用日付以降チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getAfterTodayValidater(String col) {
			return new FXUCL_AfterTodayValidater();
		}
		/**
		 * 時分秒を切り捨てた日付が運用日付以前チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getTmBeforeTodayValidater(String col) {
			return new MAUDL_TmBeforeTodayValidater();
		}
		/**
		 * 文字列パタンマッチチェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param col チェック対象のカラム
		 * @param regex 正規表現
		 * @param label パタンの名称（郵便番号、電話番号等）
		 */
		protected IfValidater getPatternMatchValidater(String col, String regex, String label) {
			return new FXUCL_PatternMatchValidater(regex, label);
		}
		/**
		 * チェックパタン区分のうち指定されたkeyのチェックパタン区分を返す。
		 * @param key チェックパタン区分のキー
		 * @return 定数オブジェクト
		 */
		protected MAC_CHK_PTN_TYP getChkPtnTyp(String key) {
			MAC_CHK_PTN_TYP typ = MCFactory.getFieldValue(MAC_CHK_PTN_TYP.class, MAC_CHK_PTN_TYP.class, key);
			return typ;
		}
		/**
		 * 定数存在チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param constArr 定数オブジェクトの配列
		 * @param col チェック対象のカラム
		 */
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			return new FXUCL_ConstValidater(constArr);
		}
		/**
		 * 定数（区分）のＩＤに対応する定数オブジェクトの配列を返す。
		 * @param typeId 定数（区分）のＩＤ
		 * @return 定数オブジェクトの配列
		 */
		protected MCAppConst[] getConstArray(String typeId) {
			String mdlId = typeId.substring(0, 2);
			Class cls = MCFactory.getClass(FX_Const.class, "mcframe.common" + mdlId + ".constant." + typeId);
			MCAppConst[] arr = (MCAppConst[]) MCFactory.invokeStatic(cls, "array", null, null);
			return arr;
		}
		/**
		 * 定数（区分）のＩＤに対応する定数オブジェクトの配列を返す。
		 * @param typeId 定数（区分）のＩＤ
		 * @return 定数オブジェクトの配列
		 */
		protected String getConstValue(String typeId, String typeNm) {
			String mdlId = typeId.substring(0, 2);
			Class cls = MCFactory.getClass(FX_Const.class, "mcframe.common" + mdlId + ".constant." + typeId);
			MCAppConst cst = MCFactory.getFieldValue(cls, MCAppConst.class, typeNm);
			return (String) cst.value();
		}
		/**
		 * 数値範囲チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラム
		 * @param min 最小値
		 * @param max 最大値
		 */
		protected IfValidater getSmallLargeValidater(String col, MCNumber min, MCNumber max) {
			return new FXUCL_SmallLargeValidater(min, max);
		}
		/**
		 * 重複チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater();
		}
		/**
		 * 一つだけ入力チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getTooManyInputsValidater(String[] cols) {
			return new MAUDL_TooManyInputsValidater_NULL_VAL();
		}
		/**
		 * 一つ以上入力チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getAtLeastOneValidater(String[] cols) {
			return new MAUDL_AtLeastOneValidater_NULL_VAL();
		}
		/**
		 * 一つだけ必須入力チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getOnlyOneInputValidater(String[] cols) {
			return new MAUDL_OnlyOneInputValidater_NULL_VAL();
		}
		/**
		 * 日付前後チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getBeforeAfterValidater(String[] cols) {
			return new MAUDL_BeforeAfterValidater();
		}
		/**
		 * 数値大小チェックバリデータを返す
		 * <P>
		 * 条件付チェックを行う場合はオーバーライドしてfilterを指定したバリデータを返す
		 * </P>
		 * @param cols チェック対象のカラムの配列
		 */
		protected IfValidater getSmallLargeValidater(String[] cols) {
			return new FXUCL_SmallLargeValidater();
		}

		/** リストロジック存在チェック用項目属性ＩＤ */
		protected static final String CHK_LIST_LOGIC = "LIST_LOGIC";
		/** リストロジック出力（補完）対象項目属性ＩＤ */
		protected static final String CHK_LIST_OUT = "LIST_OUT";
		/** リストロジック出力（補完）対象項目に対応するベース項目名属性ＩＤ */
		protected static final String CHK_LIST_OUT_BASE = "LIST_OUT_BASE";

		/**
		 * リストロジック存在チェック
		 * <P>
		 * チェックを実行して、メッセージリストを返す。
		 * </P>
		 * @param paramIndex ブロック番号
		 * @param up チェック対象のリスト
		 */
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogic(MCNumber paramIndex, MCList<E> chkTarL) {
			MCMessageList msgLst = new MCMessageList();

			MCConstRow proto = chkTarL.createRow();
			Map<String, String> listLogicIdMap = proto.getExtMap(CHK_LIST_LOGIC);
			Map<String, String> listInMap = proto.getExtMap(CHK_LIST_IN);
			Map<String, String> listInBaseMap = proto.getExtMap(CHK_LIST_IN_BASE);
			Map<String, String> listOutMap = proto.getExtMap(CHK_LIST_OUT);
			Map<String, String> listOutBaseMap = proto.getExtMap(CHK_LIST_OUT_BASE);

			if (listLogicIdMap == null) {
				return msgLst;
			}

			for (String chkTarCol : proto.getColumnPathArray()) {
				String listLogicId = listLogicIdMap.get(chkTarCol);
				
				// リストロジックが定義されていない場合はチェックしない
				if (isNull(listLogicId)) {
					continue;
				}
				// リストロジックチェックをスキップする場合はチェックしない
				if (skipListLogicCheck(up(paramIndex.intValue()), chkTarCol)) {
					continue;
				}
				

				// マスタかつ論理削除ＦＬＧがオンの場合、項目の値がnullの行はチェックと補完をしない。
				MCList<E> chkTarSubL = chkTarL.subList(new MCRowMatcher<E>() {
					@Override
					public boolean match(E row) {
						if (isSame(getModuleID(), "MA") && row.getBooleanNE("del_flg")) {
							return false;
						}
						if (isNull(row.getValueNE(chkTarCol))) {
							return false;
						}
						return true;
					}
				});
				if (chkTarSubL.isEmpty()) {
					continue;
				}
				
				// LIST_IN、LIST_IN_BASE、LIST_OUT、LIST_OUT_BASEの値の取得
				String listIn;
				String listInBase;
				if (listInMap == null) {
					listIn = null;
				}
				else {
					listIn = listInMap.get(chkTarCol);
				}
				// LIST_IN_BASEの定義がない場合は、LIST_INと同じとみなす
				if (listInBaseMap == null || isNull(listInBaseMap.get(chkTarCol))) {
					listInBase = listIn;
				}
				else {
					listInBase = listInBaseMap.get(chkTarCol);
					if (isNull(listInBase)) {
						listInBase = listIn;
					}
				}
				String listOut;
				String listOutBase;
				if (listOutMap == null) {
					listOut = null;
				}
				else {
					listOut = listOutMap.get(chkTarCol);
				}
				// LIST_OUT_BASEの定義がない場合は、LIST_OUTと同じとみなす
				if (listOutBaseMap == null || isNull(listOutBaseMap.get(chkTarCol))) {
					listOutBase = listOut;
				}
				else {
					listOutBase = listOutBaseMap.get(chkTarCol);
					if (isNull(listOutBase)) {
						listOutBase = listOut;
					}
				}
				
				msgLst.addAll(doSvrChkListLogicMain(paramIndex, chkTarSubL, chkTarCol
						, listLogicId, listIn, listInBase, listOut, listOutBase));
			}
			return msgLst;
		}

		protected boolean skipListLogicCheck(MCContainer container, String column) {
			return false;
		}

		/**
		 * リストロジック存在チェック
		 * <P>
		 * チェックを実行して、メッセージリストを返す。
		 * </P>
		 * @param paramIndex ブロック番号
		 * @param chkTarL チェック対象のリスト
		 * @param chkTarCol チェック対象のカラム
		 * @param listLogicId リストロジックＩＤ
		 * @param listIn LIST_IN
		 * @param listInBase LIST_IN_BASE
		 * @param listIOut LIST_OUT
		 * @param listOutBase LIST_OUT_BASE
		 * @return
		 */
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol,
				String listLogicId, String listIn, String listInBase, String listOut, String listOutBase) {
			MCMessageList msgLst = new MCMessageList();

			ListLogicBind bind = getListLogicBind(paramIndex, chkTarCol);
			MCLogicBase lstLgc = MCListLogicUtil.getServerClass(listLogicId);
			String lstLgcMtd = MCConst.ll.getServerMethod(listLogicId);
			String firstKeyCol = getFirstKeyCol(listLogicId);
			List<String> otherKeyCols = getOtherKeyCols(listLogicId);
			// チェック対象行ごとの固定条件のマップを作成
			Map<MCRow, MCRow> constBindRowMap = doSvrChkListLogicMain_crtConstBindRowMap(chkTarL, bind);
			// チェック対象行ごとの動的条件のマップを作成
			Map<MCRow, MCRow> varBindRowMap = doSvrChkListLogicMain_crtVarBindRowMap(paramIndex, chkTarL, chkTarCol, bind, firstKeyCol);
			
			// リストロジックを使ってリストを取得
			MCList<MCRow> listLogicRsltL = doSvrChkListLogicMain_doListLogic(chkTarL,
					lstLgc, lstLgcMtd,
					constBindRowMap, varBindRowMap,
					firstKeyCol, otherKeyCols);

			// チェック＋補完
			doSvrChkListLogicMain_checkAndCompl(paramIndex, chkTarL, chkTarCol, lstLgc, lstLgcMtd, listLogicId,
					constBindRowMap, varBindRowMap,
					firstKeyCol, otherKeyCols, listOut, listOutBase,
					msgLst, listLogicRsltL);
			
			return msgLst;
		}
		
		/**
		 * 固定条件のマップを作成するdoSvrChkListLogicMainのサブルーチン
		 * 
		 * @param chkTarL チェック対象のリスト
		 * @param bind リストロジックの引数情報
		 * @return
		 */
		protected <E extends MCConstRow> Map<MCRow, MCRow> doSvrChkListLogicMain_crtConstBindRowMap(MCList<E> chkTarL, ListLogicBind bind) {
			Map<MCRow, MCRow> constBindRowMap = new HashMap<MCRow, MCRow>();
			for (MCConstRow chkTarR :chkTarL) {
				MCRow bindRow = MCRow.create();

				// 固定条件の設定
				if (bind != null) { // LIST_INの指定がなければbindはnull。この場合はbindRowは空のままとする
					Map<String, Comparable<?>> bindValMap = bind.getBindValMap();
					for (String listLogicCol : bindValMap.keySet()) {
						bindRow.setValueNE(listLogicCol, bindValMap.get(listLogicCol));
					}
				}
				constBindRowMap.put(chkTarR, bindRow);
			}
			return constBindRowMap;
		}

		/**
		 * 動的条件のマップを作成するdoSvrChkListLogicMainのサブルーチン
		 * 
		 * @param paramIndex 電文ブロック番号
		 * @param chkTarL チェック対象のリスト
		 * @param chkTarCol チェック対象のカラム
		 * @param bind リストロジックの引数情報
		 * @param firstKeyCol 第一キー
		 * @return
		 */
		protected <E extends MCConstRow> Map<MCRow, MCRow> doSvrChkListLogicMain_crtVarBindRowMap(MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol, ListLogicBind bind, String firstKeyCol) {
			Map<MCRow, MCRow> varBindRowMap = new HashMap<MCRow, MCRow>();
			for (MCConstRow chkTarR :chkTarL) {
				MCRow bindRow = MCRow.create();
				// 動的条件の設定
				// 第一キー
				bindRow.setValueNE(firstKeyCol, chkTarR.getValue(chkTarCol));
				
				// bindに保持している動的条件
				if (bind != null) { // LIST_INの指定がなければbindはnull。この場合はbindRowは空のままとする
					Map<String, MCContainer> bindContMap = bind.getBindContMap();
					Map<String, String> bindColMap = bind.getBindColMap();
					for (String listLogicCol : bindColMap.keySet()) {
						MCContainer block = bindContMap.get(listLogicCol);
						String col = bindColMap.get(listLogicCol);
						Comparable val;
						MCDataType type;
						// チェック対象のブロックと同じなら、chkTarRから値を取得する
						if (isSame(getParamIndex(block), paramIndex)) {
							val = chkTarR.getValueNE(col);
							type = chkTarR.getDataType(col);
						}
						// チェック対象と別のブロックならばRowコンテナとみなし、値を取得する（別のList型のブロックとは連携できない仕様のため）
						else {
							val = ((MCRow)block).getValueNE(col);
							type = ((MCRow)block).getDataType(col);
						}
						
						switch (type) { // 値がnullの場合、setvValueNEだと型が判定できず、カラムが追加されないため、型でごとにswitsch文で設定
							case DATE:
								bindRow.setDateNE(listLogicCol, (MCDate)val);
								break;
							case NUMBER:
								bindRow.setNumberNE(listLogicCol, (MCNumber)val);
								break;
							case TIMESTAMP:
								bindRow.setTimestampNE(listLogicCol, (MCTimestamp)val);
								break;
							case BOOLEAN:
								bindRow.setBooleanNE(listLogicCol, (Boolean)val);
								break;
							default:
								bindRow.setStringNE(listLogicCol, (String)val);
						}
					}
				}
				// 固定条件のmode_today_flgがオンの場合にdtに運用日付を設定
				if (bind != null) { // LIST_INの指定がなければbindはnull。この場合はbindRowは空のままとする
					Comparable mode_today_flg = bind.getBindValMap().get("mode_today_flg");
					if (isSame(mode_today_flg, true)) {
						bindRow.setDateNE("dt", getToday());
					}
				}

				// 固定条件のmode_this_month_flgがオンの場合にymに運用年月を設定(ymの値が設定されている場合はそのままとする)
				if (bind != null) { // LIST_INの指定がなければbindはnull。この場合はbindRowは空のままとする
					Comparable mode_this_month_flg = bind.getBindValMap().get("mode_this_month_flg");
					if (bindRow.contains("ym") && isNull(bindRow.getDateNE("ym"))) {
						if (isSame(mode_this_month_flg, true)) {
							bindRow.setDateNE("ym",
									getToday().trunc(MCDateFieldType.MONTH));
						}
					}
				}

				
				// 固定条件のmode_this_term_flgがオンの場合にtermに運用年月を設定
				if (bind != null) { // LIST_INの指定がなければbindはnull。この場合はbindRowは空のままとする
					Comparable mode_this_term_flg = bind.getBindValMap().get("mode_this_term_flg");
					if (isSame(mode_this_term_flg, true)) {
						bindRow.setDateNE("term", getToday().trunc(MCDateFieldType.MONTH));
					}
				}

				// customListLogicCndによるカスタマイズ分
				Map<String, Comparable<?>> customVarBind = new LinkedHashMap<>();
				customListLogicCnd(chkTarCol, paramIndex, chkTarR, customVarBind);
				for (String listLogicCol : customVarBind.keySet()) {
					bindRow.setValueNE(listLogicCol, customVarBind.get(listLogicCol));
				}
				varBindRowMap.put(chkTarR, bindRow);
			}
			return varBindRowMap;
		}

		/**
		 * リストロジックを実行し、リストを取得するdoSvrChkListLogicMainのサブルーチン。
		 * 処理手順は以下のとおり。<br/>
		 * 1.重複を省いたキー条件のリストを作成<br/>
		 * 2.キー条件のリストを一定件数（デフォルト500件）ごとににループ<br/>
		 * 3.固定条件、キー条件をリストロジックに渡す引数のRowに設定<br/>
		 *   固定条件は通常のリストロジック呼び出し時と同様に設定するが、キー条件は特別な項目名で「^」区切りで値を指定する<br/>
		 * 4.リストロジックを呼び出し、リストを取得する
		 * 5.取得したリストを返す
		 * 
		 * @param chkTarL チェック対象のリスト
		 * @param lstLgc リストロジック
		 * @param lstLgcMthd リストロジックjメソッド
		 * @param constBindRowMap 固定条件のマップ
		 * @param varBindRowMap 動的条件のマップ
		 * @param firstKeyCol 第一キー
		 * @param otherKeyCols OTHERキー
		 * @return
		 */
		protected <E extends MCConstRow> MCList doSvrChkListLogicMain_doListLogic(MCList<E> chkTarL,
				MCLogicBase lstLgc, String lstLgcMtd, 
				Map<MCRow, MCRow> constBindRowMap, Map<MCRow, MCRow> varBindRowMap,
				String firstKeyCol, List<String> otherKeyCols) {
			
			MCList<MCRow> listLogicRsltL = MCList.create(MCRow.class);
			
			// 1.重複を省いたキー条件のリストを作成
			// リストロジックチェックの条件となるリストを作成
			MCList<MCRow> bindList = null;
			MCRow protoConstBindRow = constBindRowMap.get(chkTarL.get(0));
			for (MCRow varBindRow :varBindRowMap.values()) {
				MCRow bindRow = varBindRow.clone();
				for (String listLogicCol :protoConstBindRow.getColumnPathArray()) {
					bindRow.setValueNE(listLogicCol, protoConstBindRow.getValue(listLogicCol));
				}
				
				if (bindList == null) {
					bindList = createListFromProtoRow(bindRow);
				}
				bindList.add(bindRow);
			}
			// キーでグループ化
			// エラーが多く、ブレークポイントがおきやすいようにtry-catch
			// MCList<MCRow> keyGroupList = keyBindList.groupBy(keyCols.toArray(new String[0]));
			MCList<MCRow> groupList = null;
			try {
				groupList = bindList.groupBy(bindList.getColumnPathArray());
			}
			catch (MCException e) {
				throw e;
			}
			
			// 2.キー条件のリストを一定件数（デフォルト500件）ごとににループ
			int divSize = MCConst.app.getInteger("div_size."+lstLgcMtd, MCConst.app.getInteger("div_size", 500));
			if (divSize <= 0) {
				divSize = 500;
			}
			
			int groupSize = groupList.size();
			for (int i = 0; i < groupSize; i+=divSize) {
				// 3.固定条件、キー条件をリストロジックに渡す引数のRowに設定
				// リストロジックの引数とするためRow型のバインドを作成。バインドのカラム仕様は以下のとおり（キー条件は複数値で、固定条件は単一値）
				// |キー条件１   |キー条件２   |...|固定条件１|固定条件２：|...
				// |型^A^B^C　　|型^X^Y^Z   　|...|1       |2        |...
				// 固定条件の設定
				MCRow listLogicBindRow = MCRow.create();
				MCRow constBindRow = constBindRowMap.get(chkTarL.get(0));
				for (String listLogicCol :constBindRow.getColumnPathArray()) {
					listLogicBindRow.setValueNE(listLogicCol, constBindRow.getValue(listLogicCol));
				}
				// 固定条件、動的条件をリストロジックチェック専用のカラムに保持
				MCRow protoBindRow = groupList.get(0);
				for (String listLogicCol :protoBindRow.getColumnPathArray()) {
					// リストロジックチェック用の項目名とする。先頭のキーかOTHERキーかでカラム名が違う
					String bindCol;
					if (isSame(listLogicCol, firstKeyCol)) {
						bindCol = $LIST_LOGIC_VAL;
					}
					else {
						bindCol = getLLBindNm(listLogicCol);
					}
					
					List<String> vals = new ArrayList<String>();
					// 型
					vals.add(protoBindRow.getDataType(listLogicCol).name());
					// 値（文字列化する）
					MCList<MCRow> subKeyGroupList = groupList.subList(i, i + divSize > groupSize? groupSize : i + divSize);
					for (MCRow keyGroupR :subKeyGroupList) {
						switch (protoBindRow.getDataType(listLogicCol)) {
							case DATE:
								vals.add(Optional.ofNullable((MCDate)keyGroupR.getValue(listLogicCol)).map(d -> d.toString("yyyyMMddHHmmss")).orElse(null));
								break;
							case NUMBER:
								vals.add(Optional.ofNullable((MCNumber)keyGroupR.getValue(listLogicCol)).map(n -> n.toString()).orElse(null));
								break;
							case TIMESTAMP:
								vals.add(Optional.ofNullable((MCTimestamp)keyGroupR.getValue(listLogicCol)).map(t -> t.toString("yyyyMMddHHmmssSSS")).orElse(null));
								break;
							case BOOLEAN:
								vals.add((Boolean)keyGroupR.getValue(listLogicCol) ? "1" : "0");
								break;
							default:
								vals.add((String)keyGroupR.getValue(listLogicCol));
						}
					}
					// リストロジックチェック用の項目名で値を保持する
					listLogicBindRow.setStringNE(bindCol, arrayValueJoin(vals.toArray(new String[0])));
				}
				
				// 4.リストロジックを呼び出し、リストを取得する
				listLogicRsltL.addAll((MCList<MCRow>)MCFactory.invoke(lstLgc, lstLgcMtd, new Class[] {MCRow.class}, new Object[] {listLogicBindRow}));
			}
			// 5.取得したリストを返す
			return listLogicRsltL;
		}

		/**
		 * リストロジックの結果を元にチェックおよび補完をするdoSvrChkListLogicMainのサブルーチン。
		 * 処理手順は以下のとおり。<br/>
		 * 1.動的条件を元にインデックスの作成<br/>
		 * 2.チェック対象の行ごとにループ<br/>
		 * 3.固定条件、動的条件のマップからリストロジックの引数となるRowを作成<br/>
		 * 4.mode_nullval_flg、適用日を加味してリストロジックの結果から結果を抽出<br/>
		 *  抽出できれば補完し、抽出できなければエラーメッセージを追加する
		 * 
		 * @param paramIndex 電文ブロック番号
		 * @param chkTarL チェック対象のリスト
		 * @param chkTarCol チェック対象のカラム
		 * @param lstLgc リストロジック
		 * @param lstLgcMtd リストロジックメソッド
		 * @param listLogicId リストロジックＩＤ
		 * @param constBindRowMap 固定条件のマップ
		 * @param varBindRowMap 動的条件のマップ
		 * @param firstKeyCol 第一キー
		 * @param otherKeyCols OTHERキー
		 * @param listOut LIST_OUT
		 * @param listOutBase LIST_OUT_BASE
		 * @param msgLst メッセージリスト
		 * @param listLogicRsltL リストロジックの結果
		 */
		protected <E extends MCConstRow> void doSvrChkListLogicMain_checkAndCompl(MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol,
				MCLogicBase lstLgc, String lstLgcMtd, String listLogicId, 
				Map<MCRow, MCRow> constBindRowMap, Map<MCRow, MCRow> varBindRowMap,
				String firstKeyCol, List<String> otherKeyCols, String listOut, String listOutBase, MCMessageList msgLst, MCList listLogicRsltL) {
			
			// 動的条件（キー条件含む。ただしOUT項目に含まれる条件値）の一致する行を抽出する。
			// 固定条件についてはリストロジック実行時に抽出条件としているため、ここでは条件としない。
			// 抽出した行をカスタマイズ用のチェック処理が定義されている場合（リストロジッククラスget???_SrvChkメソッドが定義されている場合）、それを実行しさらに抽出する。
			// 抽出した結果、対象行が得られなければエラーメッセージを追加し、得られれた場合は抽出行を元に補完する。
			// 1.動的条件を元にインデックスの作成
			MCIndexKey idxkey = null;
			boolean hasStEnd = false;
			if (!listLogicRsltL.isEmpty()) {
				MCRow protoRsltRow = listLogicRsltL.get(0);
				// 動的条件で抽出用のカラム。適用日は個別に抽出するため除く
				List<String> chkCols = new ArrayList<String>();
				MCRow protoVarBindRow = varBindRowMap.get(chkTarL.get(0));
				for (String varBindCol :protoVarBindRow.getColumnPathArray()) {
					if (isSame(varBindCol, "dt") && protoRsltRow.contains("st_dt") && protoRsltRow.contains("end_dt")) {
						hasStEnd = true;
						continue;
					}
					if (protoRsltRow.contains(varBindCol)) {
						chkCols.add(varBindCol);
					}
				}
				idxkey = listLogicRsltL.createIndex(chkCols.toArray(new String[0]));
			}
			// 2.チェック対象の行ごとにループ
			for (MCRow chkTarR : chkTarL) {
				// 3.固定条件、動的条件のマップからリストロジックの引数となるRowを作成
				MCRow varBindRow = varBindRowMap.get(chkTarR);
				MCRow bindRow = varBindRow.clone();
				MCRow constBindRow = constBindRowMap.get(chkTarR);
				bindRow.setValuesNE(constBindRow.getColumnPathArray(), constBindRow, constBindRow.getColumnPathArray());
				
				// 4.mode_nullval_flg、適用日を加味してリストロジックの結果から結果を抽出
				//   抽出できれば補完し、抽出できなければエラーメッセージを追加する
				
				
				// リストロジックの結果が0件（idxkey == null）
				if (idxkey == null) {
					doSvrChkListLogicMain_addMsgOrNullValCompl(paramIndex, chkTarR, chkTarCol, lstLgc, lstLgcMtd, listLogicId, bindRow, constBindRow, varBindRow, firstKeyCol, listOut, listOutBase, msgLst);
					continue;
				}
				
				// 動的条件（適用日以外）での抽出
				MCList<MCRow> subListLogicRsltL = listLogicRsltL.subList(idxkey, varBindRow.toArray(idxkey.getKeys()));
				if (subListLogicRsltL == null || subListLogicRsltL.size() == 0) {
					doSvrChkListLogicMain_addMsgOrNullValCompl(paramIndex, chkTarR, chkTarCol, lstLgc, lstLgcMtd, listLogicId, bindRow, constBindRow, varBindRow, firstKeyCol, listOut, listOutBase, msgLst);
					continue;
				}
				
				// 適用日での抽出。適用日の条件がnullの場合は抽出しない。
				// mode_today_flgを指定する場合も適用日はnullの想定で、リストロジック実行時に固定条件として抽出するため、ここでは抽出条件としない
				if (hasStEnd) {
					MCDate dtVal = varBindRow.getDateNE("dt");
					if (isNull(dtVal)) {
						continue;
					}
					// st_dt、end_dtの値が取得できない場合は、抽出しない
					// 同じリストロジックでもst_dt、end_dtがリストロジックの結果として取得できるかどうかが、検索区分によって違う場合がある
					subListLogicRsltL = subListLogicRsltL.subList(
							matcher -> isNullOr(matcher.getDateNE("st_dt"), matcher.getDateNE("end_dt"))
								|| (dtVal.gte(matcher.getDateNE("st_dt"))
									&& dtVal.lte(matcher.getDateNE("end_dt"))));
					if (subListLogicRsltL == null || subListLogicRsltL.size() == 0) {
						doSvrChkListLogicMain_addMsgOrNullValCompl(paramIndex, chkTarR, chkTarCol, lstLgc, lstLgcMtd, listLogicId, bindRow, constBindRow, varBindRow, firstKeyCol, listOut, listOutBase, msgLst);
						continue;
					}
				}
				
				// カスタマイズ用のチェック処理での抽出
				subListLogicRsltL = filterListLogicChkCustom(lstLgc, lstLgcMtd, listLogicId, bindRow, subListLogicRsltL);
				if (subListLogicRsltL == null || subListLogicRsltL.size() == 0) {
					doSvrChkListLogicMain_addMsgOrNullValCompl(paramIndex, chkTarR, chkTarCol, lstLgc, lstLgcMtd, listLogicId, bindRow, constBindRow, varBindRow, firstKeyCol, listOut, listOutBase, msgLst);
					continue;
				}
				
				// 補完
				MCRow listLogicRsltR = subListLogicRsltL.get(0);
				String[] listOutArry = MCStringUtil.split(";", listOut);
				String[] listOutBaseArry = MCStringUtil.split(";", listOutBase);
				if (!isSame(listOutArry.length, listOutBaseArry.length)) {
					MCLog.developDebug("▲ サーバリストロジックチェック");
					MCLog.developDebug("▲ LIST_OUT と LIST_OUT_BASE の項目数が一致していません。");
					MCLog.developDebug("▲ 対象項目：" + chkTarCol);
					MCLog.developDebug("▲ LIST_OUT：" + Arrays.asList(listOutArry));
					MCLog.developDebug("▲ LIST_OUT_BASE：" + Arrays.asList(listOutBaseArry));
				}
				MCLog.developDebug("▲ サーバリストロジックチェック");
				MCLog.developDebug("▲ 補完");
				MCLog.developDebug("▲ 対象項目：" + chkTarCol);
				for (int i = 0; i < listOutArry.length; i++) {
					if (isSetListLogicValue(paramIndex, chkTarR, listOutArry[i]) && !isNull(listOutArry[i])) {
						setListLogicValue(paramIndex, chkTarR, listOutArry[i], listLogicRsltR.getValueNE(listOutBaseArry[i]));
						MCLog.developDebug("▲ 補完項目/リストロジック項目/値：" + listOutArry[i] + "/"  + listOutBaseArry[i] + "/" + listLogicRsltR.getValueNE(listOutBaseArry[i]));
					}
				}
			}
		}
		
		/**
		 * リストロジックの結果をマッチングした結果、リストが取得できなかった場合の処理。
		 * doSvrChkListLogicMain_checkAndComplのサブルーチン。
		 * 固定条件のmode_nullval_flgがオンの場合かつ値がNULL文字の場合は、OUT項目をnullで補完する。
		 * なお、枝番３のように、マスタ値としてNULL文字が定義されているケースは、マッチングしてリストが取得できるので、ここの処理は通らない想定。
		 * 
		 * @param paramIndex 電文ブロック番号
		 * @param chkTarR チェック対象の行
		 * @param chkTarCol チェック対象のカラム
		 * @param lstLgc リストロジック
		 * @param lstLgcMtd メソッド
		 * @param listLogicId リストロジックID
		 * @param bindRow リストロジックのBindRow
		 * @param constBindRow 固定条件
		 * @param varBindRow 動的条件
		 * @param firstKeyCol 第一キー
		 * @param listOut LIST_OUT
		 * @param listOutBase LIST_OUT_BASE
		 * @param msgLst メッセージリスト
		 */
		protected void doSvrChkListLogicMain_addMsgOrNullValCompl(MCNumber paramIndex, MCRow chkTarR, String chkTarCol, MCLogicBase lstLgc, String lstLgcMtd, String listLogicId, MCRow bindRow,
				MCRow constBindRow, MCRow varBindRow, String firstKeyCol, String listOut, String listOutBase, MCMessageList msgLst) {
			// mode_nullval_flgがオンの場合は、エラーとせずout項目すべてにnullを補完する
			if (constBindRow.getBooleanNE("mode_nullval_flg")
					&& doSvrChkListLogicMain_isNullVal(lstLgc, lstLgcMtd, bindRow, varBindRow, firstKeyCol)) {
				// nullを補完
				String[] listOutArry = MCStringUtil.split(";", listOut);
				String[] listOutBaseArry = MCStringUtil.split(";", listOutBase);
				if (!isSame(listOutArry.length, listOutBaseArry.length)) {
					MCLog.developDebug("▲ サーバリストロジックチェック");
					MCLog.developDebug("▲ LIST_OUT と LIST_OUT_BASE の項目数が一致していません。");
					MCLog.developDebug("▲ 対象項目：" + chkTarCol);
					MCLog.developDebug("▲ LIST_OUT：" + Arrays.asList(listOutArry));
					MCLog.developDebug("▲ LIST_OUT_BASE：" + Arrays.asList(listOutBaseArry));
				}
				MCLog.developDebug("▲ サーバリストロジックチェック");
				MCLog.developDebug("▲ 補完");
				MCLog.developDebug("▲ 対象項目：" + chkTarCol);
				for (int i = 0; i < listOutArry.length; i++) {
					if (isSetListLogicValue(paramIndex, chkTarR, listOutArry[i]) && !isNull(listOutArry[i])) {
						setListLogicValue(paramIndex, chkTarR, listOutArry[i], null);
						MCLog.developDebug("▲ 補完項目/リストロジック項目/値：" + listOutArry[i] + "/"  + listOutBaseArry[i] + "/ null");
					}
				}
				return;
			}
			msgLst.add(doSvrChkListLogicMain_crtMsg(lstLgc, lstLgcMtd, listLogicId, chkTarR, chkTarCol, bindRow));
		}
		
		/**
		 * 入力した値がNULL文字かどうかを判定する処理。
		 * doSvrChkListLogicMain_checkAndComplのサブルーチン。
		 * 基本的には第一キーがNULL文字であればtrueだが、複数項目で判定が必要な場合など特殊な条件がある場合は
		 * get[リストロジックID]_isNullVal（枝番３であればgetItmSub3_isNullVal）をリストロジックに定義し、実装する。
		 * 
		 * @param lstLgc リストロジック
		 * @param lstLgcMtd メソッド
		 * @param bindRow リストロジックのBindRow
		 * @param varBindRow 動的条件
		 * @param firstKeyCol 第一キー
		 */
		protected boolean doSvrChkListLogicMain_isNullVal(MCLogicBase lstLgc, String lstLgcMtd, MCRow bindRow,
				MCRow varBindRow, String firstKeyCol) {
			try {
				boolean boo = (boolean) MCFactory.invoke(lstLgc, lstLgcMtd + "_IsNullVal",
						new Class[] { MCRow.class},
						new Object[] {bindRow});
				return boo;
			}
			catch (MCException e) {
				throwWhenMethodExist(e);
				return MAC_STR.isNULL_VAL(varBindRow.getStringNE(firstKeyCol));
			}
		}

		/**
		 * リストロジックチェックエラーのメッセージを作るdoSvrChkListLogicMain_checkAndComplのサブルーチン
		 * 
		 * @param lstLgc リストロジック
		 * @param lstLgcMtd メソッド
		 * @param listLogicId リストロジックID
		 * @param chkTarR チェック対象の行
		 * @param chkTarCol チェック対象のカラム
		 * @param bindRow リストロジックのBindRow
		 * @return
		 */
		protected MCMessage doSvrChkListLogicMain_crtMsg(MCLogicBase lstLgc, String lstLgcMtd, String listLogicId, MCRow chkTarR, String chkTarCol, MCRow bindRow) {
			String info = getKeyInfoMsgLabel(chkTarR, chkTarCol);
			MCMessage msg = getListLogicChkMsg(lstLgc, lstLgcMtd, chkTarR, chkTarCol, bindRow, info);
			if (msg == null) {
				msg = new MCMessage(getListMsg(listLogicId), info);
				msg.setCauseRow(chkTarR, chkTarCol);
			}
			return msg;
		}
		
		/**
		 * 引数のRowの一時カラムを持つMCListを作成する
		 * 
		 * @param protoR Row
		 */
		protected MCList createListFromProtoRow(MCRow protoR) {
			MCList retL = MCList.create(MCRow.class);
			for (String col :protoR.getColumnPathArray()) {
				switch (protoR.getDataType(col)) {
					case DATE:
						retL.addDateColumn(col);
						break;
					case NUMBER:
						retL.addNumberColumn(col);
						break;
					case TIMESTAMP:
						retL.addTimestampColumn(col);
						break;
					case BOOLEAN:
						retL.addBooleanColumn(col);
						break;
					default:
						retL.addStringColumn(col);
				}
			}
			return retL;
		}

		/**
		 * Rowコンテナにリストロジックで取得した値を設定する場合は true を返します。
		 * ロジッククラスのオーバライド用のメソッドです。
		 * <p>
		 * デフォルトでは常に true を返します。
		 *
		 * @param paramIndex ブロック番号
		 * @param row Rowコンテナ
		 * @param column 項目名
		 * @return Rowコンテナにリストロジックで取得した値を設定しない場合は false
		 */
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			return true;
		}

		/**
		 * Rowコンテナにリストロジックで取得した値を設定します。
		 * ロジッククラスのオーバライド用のメソッドです。
		 *
		 * @param paramIndex ブロック番号
		 * @param row Rowコンテナ
		 * @param column 項目名
		 * @param value リストロジックで取得した値
		 */
		protected void setListLogicValue(MCNumber paramIndex, MCRow row, String column, Comparable<?> value) {
			if (row.getDataType(column) == MCDataType.BOOLEAN && value == null) {
				row.setValueNE(column, false);
			}
			else {
				row.setValueNE(column, value);
			}
		}

		/**
		 * リストロジックチェックの検索条件を設定します。
		 * 独自に検索条件を追加する場合は、このメソッドをオーバーライドし、cndオブジェクトにリストロジックのIN項目に対する値を追加してください。
		 *
		 * LIST_INやLIST_IN_BASEに固定値を定義している項目については、検索条件を変更することはできません。
		 *
		 * @param column チェック対象の項目
		 * @param paramIndex ブロック番号
		 * @param data チェック対象のRow
		 * @param cnd リストロジックチェックの検索条件
		 */
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
		}

		// リストロジックのカラム名クラスに定義されているリスロトロジック存在チェックエラーメッセージＩＤを取得するフィールド名
		protected static final String LL_PARAM_CHK_MSG = "$p_chk_msg";

		/**
		 * リストロジック存在チェックエラー時に表示するメッセージIDを返す
		 * @param llid リストロジックＩＤ（例：MA.MAUAL0010.Loc）
		 * @return メッセージＩＤ
		 */
		protected String getListMsg(String llid) {
			Class<?> cls = MCListLogicUtil.getColsClass(llid);
			return MCFactory.getFieldValue(cls, String.class, LL_PARAM_CHK_MSG);
		}

		/**
		 * サーバのリストロジッククラスに定義されたエラーメッセージを返すメソッドを実行して返します。<br>
		 * メソッドが定義されていなければnullを返します。<br>
		 * メソッド例：getLoc_Msg(MCRow bind)<br>
		 *
		 * @param obj サーバリストロジック
		 * @param mtd リストロジックのメソッド文字列（例：getLoc）
		 * @param causeRow メッセージのCauseRow
		 * @param causeCol メッセージのCauseColumn
		 * @param bind エラーメッセージ取得メソッドに渡す引数のバインドRow
		 * @param info 行情報とキー情報を合わせたメッセージ用の文字列
		 * @return メッセージ
		 */
		protected MCMessage getListLogicChkMsg(MCLogicBase obj, String mtd, MCRow causeRow, String causeCol,
				MCRow bind, String info) {
			try {
				MCMessage msg = (MCMessage) MCFactory.invoke(obj, mtd + "_Msg",
						new Class[] { MCRow.class, String.class, MCRow.class, String.class },
						new Object[] { causeRow, causeCol, bind, info });
				return msg;
			}
			catch (MCException e) {
				throwWhenMethodExist(e);
				return null;
			}
		}

		/**
		 * カスタマイズしたリストロジックチェックメソッドを実行して結果を返します。<br>
		 * メソッドが定義されていなければ引数に受けたリストをそのまま返します。<br>
		 * メソッド例：getLoc_SrvChk(MCRow bind, MCList listLogicChkRslt)<br>
		 *
		 * @param obj サーバリストロジック
		 * @param mtd リストロジックのメソッド文字列（例：getLoc）
		 * @param llid リストロジックＩＤ（例：MA.MAUAL0010.Loc）
		 * @param bind リスト取得の条件となるバインドRow
		 * @param info 行情報とキー情報を合わせたメッセージ用の文字列
		 * @return メッセージ
		 */
		protected MCList filterListLogicChkCustom(MCLogicBase obj, String mtd, String llid, MCRow bind, MCList listLogicChkRslt) {
			try {
				MCList ret = (MCList) MCFactory.invoke(obj, mtd + "_SrvChk",
						new Class[] { MCRow.class, MCList.class },
						new Object[] { bind, listLogicChkRslt });
				return ret;
			}
			catch (MCException e) {
				throwWhenMethodExist(e);
				return listLogicChkRslt;
			}
		}

		protected MCMeta[] _itmMetas = {
			ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3
		};

		protected MCMeta[] geItmMetas() {
			return _itmMetas;
		}

		protected MCMeta[] _snoMetas = {
				SNO1, SNO2, SNO3, SNO4
			};

		protected MCMeta[] geSnoMetas() {
			return _snoMetas;
		}

		protected MCMeta[] _dtMetas = {
			DT
		};

		protected MCMeta[] geDtMeta() {
			return _dtMetas;
		}

		protected MCMeta[] _ymMetas = {
			YM
		};

		protected MCMeta[] geYmMeta() {
			return _ymMetas;
		}

		/**
		 * キー項目のメタが指定メタと同じ場合、<br>
		 * trueを返し、それ以外は、falseを返します。<br>
		 *
		 * @param metas 指定メタ
		 * @param keyMetas キー項目のメタ
		 * @return キー項目のメタが指定メタと同じ場合、true
		 */
		protected boolean isSameMeta(MCMeta[] metas, MCMeta[] keyMetas, int idx) {
			for (int i = 0; i < metas.length; i++) {
				if (!metas[i].metaEquals(keyMetas[idx++])) {
					return false;
				}
			}
			return true;
		}

		/**
		 * <p>
		 * 行情報とキー情報を合わせたメッセージ用の文字列を返す。
		 * getGUIIndexがマイナスなら行情報は表示しない。
		 * </p>
		 *
		 * @param row チェック対象の行
		 * @param colName 表示カラム
		 */
		protected String getKeyInfoMsgLabel(MCRow row, String... colName) {
			MCMeta[] metaName = new MCMeta[colName.length];
			for (int i = 0; i < colName.length; i++) {
				metaName[i] = row.getMeta(colName[i]);
			}

			String keyInfo = "";
			for (int i = 0; i < metaName.length;) {
				if (isSameMeta(geItmMetas(), metaName, i)) {
					keyInfo = keyInfo + MAC_STR.DISP_ITM_PREFIX.name(getUsrLocale()) + " : " + toDispItm(
						(String)row.getValueNE(colName[i]),
						(String)row.getValueNE(colName[i+1]),
						(String)row.getValueNE(colName[i+2]),
						(String)row.getValueNE(colName[i+3]));
					if (i+3 < metaName.length - 1) {
						keyInfo = keyInfo + MCStringUtil.LF_CODE;
					}
					i += geItmMetas().length;
				}
				else if (isSameMeta(geSnoMetas(), metaName, i)) {
					keyInfo = keyInfo + MAC_STR.DISP_SNO_PREFIX.name(getUsrLocale()) + " : " + toDispSno(
						(String)row.getValueNE(colName[i]),
						(String)row.getValueNE(colName[i+1]),
						(String)row.getValueNE(colName[i+2]),
						(String)row.getValueNE(colName[i+3]));
					if (i+3 < metaName.length - 1) {
						keyInfo = keyInfo + MCStringUtil.LF_CODE;
					}
					i += geSnoMetas().length;
				}
				else if (isSameMeta(geDtMeta(), metaName, i)) {
					keyInfo = keyInfo + getLabel(row, colName[i]) + " : " + toYMDString(
						(MCCalendarDate<?>)row.getValueNE(colName[i]));
					if (i < metaName.length - 1) {
						keyInfo = keyInfo + MCStringUtil.LF_CODE;
					}
					i++;
				}
				else if (isSameMeta(geYmMeta(), metaName, i)) {
					keyInfo = keyInfo + getLabel(row, colName[i]) + " : " + toYMString(
						(MCCalendarDate<?>)row.getValueNE(colName[i]));
					if (i < metaName.length - 1) {
						keyInfo = keyInfo + MCStringUtil.LF_CODE;
					}
					i++;
				}
				else {
					String wrkColName = colName[i];
					keyInfo = keyInfo + toStringWithMsgLabel(row, wrkColName);
					if (i < metaName.length - 1) {
						keyInfo = keyInfo + MCStringUtil.LF_CODE;
					}
					i++;
				}
			}

			if (row.getGUIIndex() < 0) {
				return keyInfo;
			}
			String rowInfo = new MCMessage(MAUDL0002, row.getGUIIndex() + 1)
					.toString(MCLocaleConst.message(getUsrLocale()));
			return MCStringUtil.join(MCStringUtil.LF_CODE, keyInfo, rowInfo);
		}

		/**
		 * マスタ存在チェック
		 * <P>
		 * チェックを実行して、メッセージリストを返す。
		 * </P>
		 * @param up チェック対象のリスト
		 * @param opes マスタ存在チェックに使用するサブオペレーションのリスト（オペレーショングループ名は「EXISTS」）
		 */
		@SuppressWarnings({"rawtypes"})
		protected MCMessageList doSvrChkExists(MCList<? extends MCConstRow> up,
				List<MCController> opes) {
			MCMessageList msgL = new MCMessageList();
			if (opes == null) {
				return msgL;
			}

			for (MCController ctrl : opes) {
				if (ctrl instanceof MCDBSubOperation) {
					MCDBContainer d = ((MCDBSubOperation<?>) ctrl).dbc();

					// チェック実行
					msgL.addAll(check(up, d.getKeyColumn(), getDbExistValidater(d)));
				}
			}
			return msgL;
		}

		protected <R extends MCDBContainer> IfValidater getDbExistValidater(R d) {
			return new FXUCL_DBCValidater<R>(d);
		}

		protected <R extends MCDBContainer> IfValidater getDbExistValidater(MCQueryApiBuilder builder) {
			return new FXUCL_DBCValidater<R>(builder);
		}
		
		/**
		 * 同一キー存在チェック
		 * <P>
		 * 新規行に対して、同一キーのレコードがすでに存在していないかチェックする。
		 * </P>
		 * @param up チェック対象のリスト
		 */
		protected MCMessageList doServerCheckExistsKey(MCList<? extends MCConstRow> up) {
			MCMessageList msgLst = new MCMessageList();

			if (!up.isEmpty() && up.get(0) instanceof MCDBContainer) {
				MCDBContainer r = (MCDBContainer) up.get(0);
				MCDBContainer dbc = (MCDBContainer) r.createInstance();
				for (MCConstRow bind : up) {
					if (bind.isStatusCreate()) {
						int cnt = dbSelectKey("MAUDL5010:" + dbc.tableName() + ":select", dbc, dbc, bind);
						if (cnt > 0) {
							msgLst.add(new MCMessage(bind, dbc.getKeyColumn()[0], MAUDL0003, getKeyInfoMsgLabel(bind, dbc.getKeyColumn())));
						}
					}
				}
			}
			return msgLst;
		}

		/**
		 * サーバチェック処理（引数なし版）
		 * <P>
		 * チェック対象コンテナからステータスがCREATE, MODIFYのRowを抽出して
		 * サーバチェック処理メインを実行します。
		 * </P>
		 */
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = new MCMessageList();
			// 共通チェック
			int i = 0;
			while(up(i) != null) {
				msgL.addAll(doServerCheckSub(up(i)));
				i++;
			}
			return msgL;
		}

		/**
		 * サーバチェック処理
		 * <P>
		 * チェック対象コンテナからステータスがCREATE, MODIFYのRowを抽出して
		 * サーバチェック処理メインを実行します。
		 * 本メソッドはマスタの親クラスのみで使っており、業務画面のチェックロジックではオーバライドしない。
		 * </P>
		 * @param container チェック対象コンテナ
		 */
		@Deprecated
		protected MCMessageList doServerCheckSub(MCContainer container) {
			MCMessageList msgL = new MCMessageList();
			// 削除行はチェックしない
			MCList<? extends MCConstRow> l = getChkList(container, MCRow.CREATE, MCRow.MODIFY);
			if (l == null) {
				return msgL;
			}
			return doServerCheckSub(l);
		}

		/**
		 * その他チェック
		 * <P>
		 * その他のチェックはこのメソッドをオーバーライドして、実装する。
		 * </P>
		 * @param up チェック対象のリスト
		 */
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			return new MCMessageList();
		}

		protected Map<List<Object>, ListLogicBind> _listLogicBindMap = new HashMap<>();
		/**
		 * リストロジックにバインドする条件を格納するオブジェクトを生成します。<br>
		 * 電文のブロック以外を渡した場合はnullを返します。
		 *
		 * @param block 対象の電文のブロック（コンテナ）
		 * @param col 対象のカラム
		 * @return リストロジックバインド条件格納オブジェクト
		 */
		protected ListLogicBind getListLogicBind(MCContainer block, String col) {
			List<Object> keyL = createListLogicBindKey(getParamIndex(block), col);
			ListLogicBind ret;
			if ((ret = _listLogicBindMap.get(keyL)) == null) {
				ListLogicBind bind = new ListLogicBind(block, col);
				_listLogicBindMap.put(keyL, bind);
				ret = bind;
			}
			return ret;
		}

		protected ListLogicBind getListLogicBind(MCNumber paramIndex, String col) {
			List<Object> keyL = createListLogicBindKey(paramIndex, col);
			return _listLogicBindMap.get(keyL);
		}

		protected List<Object> createListLogicBindKey(MCNumber paramIndex, String col) {
			List<Object> keyL = new ArrayList<>();
			keyL.add(paramIndex);
			keyL.add(col);
			return keyL;
		}

		protected MCNumber getParamIndex(MCContainer block) {
			boolean boo = false;
			int i = 0;
			while(up(i) != null) {
				if (up(i) == block) {
					boo = true;
					break;
				}
				i++;
			}
			if (!boo) {
				return null;
			}
			return new MCNumber(i);
		}

		/** リストロジックバインド用項目属性ＩＤ */
		protected static final String CHK_LIST_IN = "LIST_IN";
		/** リストロジックバインド用項目に対応するベース項目名属性ＩＤ */
		protected static final String CHK_LIST_IN_BASE = "LIST_IN_BASE";


		/**
		 * リストロジックにバインドする条件を設定するためのオーバライド用メソッドです。<br>
		 * getListLogicBind(block, column)で戻されるクラスに対してputBindを実行して設定します。<br>
		 * <br>
		 * サンプル：<br>
		 * ListLogicBind b = getListLogicBind(up(1), "asst_dpt_cd");<br>
		 * b.putBind("dt", up(0), "app_dt"); // ヘッダ（別コンテナ）の日付をバインド
		 */
		protected void putListLogicCheckBind() {
			
			// 実装仕様書の内容に従い、_listLogicBindMap（getListLogicBindで取得する）に対して、
			// リストロジックの引数の情報を保持する。実装仕様書状ではLIST_IN_BASEが省略されたり、リテラル、定数
			// がLIST_INの値として指定されるので、それらをオブジェクト化し、_listLogicBindMapに格納する
			int i = 0;
			while(up(i) != null) {
				MCConstRow proto;
				if (up(i) instanceof MCRow) {
					proto = (MCConstRow)((MCRow)up(i)).createInstance();
				}
				else {
					proto = (MCConstRow)((MCList)up(i)).createRow();
				}
				Map<String, String> inMap = proto.getExtMap(CHK_LIST_IN);
				Map<String, String> inBaseMap = proto.getExtMap(CHK_LIST_IN_BASE);

				if (inMap == null) {
					i++;
					continue;
				}
				// getListLogicBindの実行
				for (String chkTarCol : inMap.keySet()) {
					String[] listInVals = MCStringUtil.split(";", inMap.get(chkTarCol));
					
					// LIST_IN_BASEを省略した場合はLIST_INをLIST_IN_BASEとして利用する
					String[] listInBaseVals;
					if (inBaseMap == null) {
						listInBaseVals = listInVals;
					}
					else {
						listInBaseVals = MCStringUtil.split(";", inBaseMap.get(chkTarCol));
						if (listInBaseVals.length == 0) {
							listInBaseVals = listInVals;
						}
					}
					
					if (!isSame(listInVals.length, listInBaseVals.length)) {
						MCLog.developDebug("▲ サーバリストロジックチェック");
						MCLog.developDebug("▲ LIST_IN と LIST_IN_BASE の項目数が一致していません。");
						MCLog.developDebug("▲ 対象項目：" + chkTarCol);
						MCLog.developDebug("▲ LIST_IN：" + Arrays.asList(listInVals));
						MCLog.developDebug("▲ LIST_IN_BASE：" + Arrays.asList(listInBaseVals));
						continue;
					}

					ListLogicBind b = getListLogicBind(up(i), chkTarCol);
					for (int j = 0; j < listInBaseVals.length; j++) {
						if (isListInTrue(listInVals[j])) {
							b.putBind(listInBaseVals[j], true);
						}
						else if (isListInFalse(listInVals[j])) {
							b.putBind(listInBaseVals[j], false);
						}
						else if (isListInConst(listInVals[j])) {
							// 定数
							String typ = listInVals[j].substring(0, listInVals[j].indexOf("."));
							String key = listInVals[j].substring(listInVals[j].indexOf(".")+1);
							String val = getConstValue(typ, key);
							b.putBind(listInBaseVals[j], (Comparable<?>) val);
						}
						else if (isListInLiteral(listInVals[j])) {
							// リテラル
							String val = listInVals[j].replaceAll("\"", "");
							b.putBind(listInBaseVals[j], (Comparable<?>) val);
						}
						else {
							b.putBind(listInBaseVals[j], listInVals[j]);

						}
					}
				}
				i++;
			}
		}

		protected boolean isListInTrue(String listIn) {
			return isSame(listIn, "true");
		}

		protected boolean isListInFalse(String listIn) {
			return isSame(listIn, "false");
		}

		protected boolean isListInConst(String listIn) {
			return listIn.indexOf(".") >= 0;
		}

		protected boolean isListInLiteral(String listIn) {
			return listIn.matches("^\".*\"$");
		}

		/**
		 * エラーＦＬＧがオンの行が存在するかどうかを返すユーティリティです。
		 *
		 * @return boolean エラーＦＬＧがオンの行があればtrueを返します。
		 */
		protected boolean hasErrFlgOn(MCContainer ...conts) {
			for (MCContainer cont :conts) {
				if (cont instanceof MCRow) {
					MCRow r = (MCRow) cont;
					if (r.getBoolean("err_flg")) {
						return true;
					}
				}
				else {
					MCList l = (MCList)cont;
					for (int i = 0; i < l.size(); i++) {
						MCRow r = l.get(i);
						if (r.getBoolean("err_flg")) {
							return true;
						}
					}
				}
			}
			return false;
		}

		/**
		 * メッセージプールを見て、エラーメッセージがあるかどうかを返す。
		 */
		protected boolean hasErr() {
			return hasErrMsg();
		}

		/**
		 * メッセージプールを見てエラーフラグを設定するユーティリティです。<br>
		 * エラーＦＬＧの項目名はerr_flg固定です。
		 *
		 * @param r Rowコンテナ
		 */
		protected void setErrFlg(MCMessageList msgL) {
			int i = 0;
			while (up(i) != null) {
				MCContainer c = up(i);
				if (up(i) instanceof MCList) {
					MCList l = (MCList) c;
					for (int j = 0; j < l.size(); j++) {
						setErrFlg(l.get(j), msgL);
					}
				}
				else {
					setErrFlg((MCRow) c, msgL);
				}
				i++;
			}
		}

		/**
		 * 全レコードのエラーフラグにtrueを設定するユーティリティです。<br>
		 * エラーＦＬＧの項目名はerr_flg固定です。
		 */
		protected void setErrFlg() {
			int i = 0;
			while (up(i) != null) {
				MCContainer c = up(i);
				if (up(i) instanceof MCList) {
					MCList<MCRow> l = (MCList<MCRow>) c;
					for (MCRow r : l) {
						r.setBooleanNE(ERR_FLG_COL, true);
					}
				}
				else {
					MCRow r = (MCRow) c;
					r.setBooleanNE(ERR_FLG_COL, true);
				}
				i++;
			}
		}

		/**
		 * メッセージプールを見てエラーフラグを設定するユーティリティです。<br>
		 * エラーＦＬＧの項目名はerr_flg固定です。
		 *
		 * @param l Listコンテナ
		 */
		protected void setErrFlg(MCList l) {
			setErrFlgCmm(l);
		}

		/**
		 * メッセージプールを見てエラーフラグを設定するユーティリティです。<br>
		 * エラーＦＬＧの項目名はerr_flg固定です。
		 *
		 * @param r Rowコンテナ
		 */
		protected void setErrFlg(MCRow r) {
			setErrFlgCmm(r);
		}

		/**
		 * メッセージリストを見てエラーフラグを設定するユーティリティです。<br>
		 * エラーＦＬＧの項目名はerr_flg固定です。
		 *
		 * @param r Rowコンテナ
		 * @param msgL メッセージリスト
		 */
		protected void setErrFlg(MCRow r, MCMessageList msgL) {
			setErrFlgCmm(r, msgL);
		}

		/**
		 * エラーフラグがオンの行の処理結果状況区分に「MAC_RTN_STS_TYP.ERR」を設定するユーティリティです。<br>
		 * エラーフラグの項目名はerr_flg固定です。
		 * 処理結果状況区分の項目名はrtn_sts_typ固定です。
		 */
		protected void setErrToRtnStsTyp() {
			int i = 0;
			while (up(i) != null) {
				MCContainer c = up(i);
				if (up(i) instanceof MCList) {
					MCList l = (MCList) c;
					for (int j = 0; j < l.size(); j++) {
						setRtnStsTypErr(l.get(j));
					}
				}
				else {
					setRtnStsTypErr((MCRow) c);
				}
				i++;
			}
		}

		/**
		 * エラーフラグがオンの行の処理結果状況区分に「MAC_RTN_STS_TYP.ERR」を設定するユーティリティです。<br>
		 * エラーフラグの項目名はerr_flg固定です。
		 * 処理結果状況区分の項目名はrtn_sts_typ固定です。
		 */
		protected void setRtnStsTypErr(MCRow r) {
			if (r.getBooleanNE(ERR_FLG_COL)) {
				r.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * エラーメッセージの合計数。
		 */
		int _ttlChkErrMsgCnt;

		/**
		 * 「エラー件数が上限を超えたので、チェック処理を中断しました。」というメッセージを既に追加したかどうか。
		 */
		boolean _chkErrUpperLimitMsgAddedFlg;

		/**
		 * msgListを追加することでエラーメッセージの件数が上限に達する場合、その旨のメッセージを<tt>msgList</tt>へ追加します。</br>
		 * 
		 * @param msgList メッセージリスト
		 */
		protected void addChkErrUpperLimitMsg(MCMessageList msgList) {
			_ttlChkErrMsgCnt += getErrMsgSize(msgList);
			if (!_chkErrUpperLimitMsgAddedFlg && isOverChkErrUpperLimit()) {
				msgList.add(new MCMessage(MAUDL0408, getChkErrUpperLimitSize(), _ttlChkErrMsgCnt));
				_chkErrUpperLimitMsgAddedFlg = true;
			}
		}

		/**
		 * msgListを追加することでエラーメッセージの件数が上限に達する場合に、「エラー件数が上限を超えたので、チェック処理を中断しました。」というメッセージで例外をスローします。<br>
		 * msgListに保持されたメッセージは全て例外のcauseMessageListに保持します。
		 */
		protected void throwChkErrUpperLimitErr(MCMessageList msgList) {
			if (isOverChkErrUpperLimit(msgList)) {
				MCAppException ex = new MCAppException(new MCMessage(MAUDL0408));
				ex.addCauseMessageList(msgList);
				throw ex;
			}
		}

		/**
		 * エラー件数が既に上限に達している場合<tt>true</tt>、上限に達していない場合<tt>false</tt>を返します。
		 * 
		 * @return エラー件数が既に上限に達している場合<tt>true</tt>、上限に達していない場合<tt>false</tt>を返します。
		 */
		protected boolean isOverChkErrUpperLimit() {
			return isOverChkErrUpperLimit(null);
		}

		/**
		 * msgListを追加することでエラー件数が上限に達する場合<tt>true</tt>、上限に達しない場合<tt>false</tt>を返します。
		 * 
		 * @return エラー件数が上限に達する場合<tt>true</tt>、上限に達しない場合<tt>false</tt>を返します。
		 */
		protected boolean isOverChkErrUpperLimit(MCMessageList msgList) {
			if (!useChkErrUpperLimit()) {
				return false;
			}
			if (msgList == null) {
				return getChkErrUpperLimitSize() <= _ttlChkErrMsgCnt;
			}
			return getChkErrUpperLimitSize() <= _ttlChkErrMsgCnt + getErrMsgSize(msgList);
		}

		/**
		 * エラー件数が上限値を超えた場合に、以下の機能を有効にするかどうか。
		 * <p>
		 * ・ エラー件数が上限値を超えた旨のメッセージを追加する。</br>
		 * ・ エラーＦＬＧを全てオンにする。</br>
		 * ・ doServerCheckを、チェック処理単位（汎用チェック・リストロジック存在チェック ・マスタ存在チェック ・同一キー存在チェック）で中断する。</br>
		 * </p>
		 * 
		 * @return 有効にする場合は<tt>true</tt>、無効にする場合は<tt>false</tt>（デフォルト値：<tt>false</tt>）
		 */
		protected boolean useChkErrUpperLimit() {
			return false;
		}

		/**
		 * チェックのエラー上限値をMCAppServerリソースから取得します。
		 * <P>
		 * 以下の順にキーを探索し最初に合致した物の値を採用します。</br>
		 * chk_err_upper_limit.[mid].[lid].[oid]</br>
		 * chk_err_upper_limit.[mid].[lid]</br>
		 * chk_err_upper_limit.[mid]</br>
		 * chk_err_upper_limit</br>
		 * いずれの方法でもチェックのエラー上限値が設定されていない場合はデフォルト値（100）を返します。
		 * ※[mid].[lid].[oid]はMCSys.requestから取得します。</br>
		 * </P>
		 */
		protected int getChkErrUpperLimitSize() {
			String mid = MCSys.request.moduleId();
			String lid = MCSys.request.logicId();
			String oid = MCSys.request.operationId();
			String[] keys = new String[] {
					"chk_err_upper_limit", mid, lid, oid
			};

			for (int i = keys.length; i > 0; i--) {
				String[] k = MCCollectionUtil.subArray(keys, 0, i, String.class);
				int chkErrUpperLimitSize = MCConst.app.getInteger(MCConst.createKey(k), -1);
				if (chkErrUpperLimitSize > 0) {
					return chkErrUpperLimitSize;
				}
			}
			return 100;
		}

		boolean _chkLcl = false;
		public void doChkLcl(boolean flg) {
			_chkLcl = flg;
		}
		/**
		 * ロケールＣＤ存在チェック
		 * <P>
		 * チェックを実行して、メッセージリストを返す。
		 * </P>
		 * @param up チェック対象のリスト
		 */
		@SuppressWarnings("deprecation")
		protected MCMessageList doSvrChkLocale(MCList<? extends MCConstRow> up) {
			MCMessageList msgL = new MCMessageList();
			if (!_chkLcl) {
				return msgL;
			}
			String lclCol = containsLocaleCol(up);
			if (isNull(lclCol)) {
				return msgL;
			}
			for (MCConstRow r : up) {
				msgL.addAll(checkLocaleEntry(r, lclCol));
			}
			return msgL;
		}
		/**
		 * ロケールＣＤ有無チェック
		 * <P>
		 * ロケールＣＤの有無をメタでチェックし、あればカラム名を返す。
		 * </P>
		 * @param up チェック対象のリスト
		 */
		protected String containsLocaleCol(MCList<? extends MCConstRow> up) {
			for (String nm : up.getNameArray()) {
				MCMeta m = up.getMeta(nm);
				if (m != null && isSame(m.ID(), "LCL_CD")) {
					return nm;
				}
			}
			return null;
		}
	}

	/**
	 * NULL文字をnullとして扱います。
	 * その他は {@link FXUCL_TooManyInputsValidater} と同じです。
	 */
	protected class MAUDL_TooManyInputsValidater_NULL_VAL extends FXUCL_TooManyInputsValidater {

		public MAUDL_TooManyInputsValidater_NULL_VAL() {
			super();
		}

		public MAUDL_TooManyInputsValidater_NULL_VAL(Predicate<MCRow> filter) {
			super(filter);
		}

		@Override
		protected boolean isInput(Comparable<?> v) {
			// NULL文字をnullとしてチェックする
			if (isSame(v, MAC_STR.NULL_VAL.value())) {
				v = null;
			}
			return super.isInput(v);
		}

	}

	/**
	 * NULL文字をnullとして扱います。
	 * その他は {@link FXUCL_AtLeastOneValidater} と同じです。
	 */
	protected class MAUDL_AtLeastOneValidater_NULL_VAL extends FXUCL_AtLeastOneValidater {

		public MAUDL_AtLeastOneValidater_NULL_VAL() {
			super();
		}

		public MAUDL_AtLeastOneValidater_NULL_VAL(Predicate<MCRow> filter) {
			super(filter);
		}

		@Override
		protected boolean isInput(Comparable<?> v) {
			// NULL文字をnullとしてチェックする
			if (isSame(v, MAC_STR.NULL_VAL.value())) {
				v = null;
			}
			return super.isInput(v);
		}

	}

	/**
	 * NULL文字をnullとして扱います。
	 * その他は {@link FXUCL_OnlyOneInputValidater} と同じです。
	 */
	protected class MAUDL_OnlyOneInputValidater_NULL_VAL extends FXUCL_OnlyOneInputValidater {

		public MAUDL_OnlyOneInputValidater_NULL_VAL() {
			super();
		}

		public MAUDL_OnlyOneInputValidater_NULL_VAL(Predicate<MCRow> filter) {
			super(filter);
		}

		@Override
		protected boolean isInput(Comparable<?> v) {
			// NULL文字をnullとしてチェックする
			if (isSame(v, MAC_STR.NULL_VAL.value())) {
				v = null;
			}
			return super.isInput(v);
		}

	}

	/**
	 * 日付の前後チェック。
	 * 日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	 * その他は {@link FXUCL_BeforeAfterValidater} と同じです。
	 */
	protected class MAUDL_BeforeAfterValidater extends FXUCL_BeforeAfterValidater {

		public MAUDL_BeforeAfterValidater() {
			super();
		}

		public MAUDL_BeforeAfterValidater(Predicate<MCRow> filter) {
			super(filter);
		}

		@Override
		protected boolean isBeforeAfter(MCDate d1, MCDate d2) {
			return mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.isBeforeAfter(d1, d2);
		}

	}
	/**
	 * 日付切替時間を考慮した日付の運用日付以前チェックバリデータ
	 */
	protected class MAUDL_TmBeforeTodayValidater extends FXUCL_TmBeforeTodayValidater {

		public MAUDL_TmBeforeTodayValidater() {
			super();
		}

		public MAUDL_TmBeforeTodayValidater(Predicate<MCRow> filter) {
			super(filter);
		}

		@Override
		protected boolean isBeforeAfter(Comparable<?>[] vals) {
			// 日付切替時間を考慮した日付に変換
			for (int i = 0; i < vals.length; i++) {
				vals[i] = mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.getAcDt((MCDate) vals[i]);
			}
			return super.isBeforeAfter(vals);
		}

		@Override
		protected MCMessage getMessage(MCRow row, String... colName) {
			if (colName.length == 1) {
				MCMessage msg;
				if (row.getGUIIndex() > -1) {
					msg = mcframe.commonFXUC.FXUCC0170.FXUCC_ValidaterUtil.msgNotBeforeToday(
							getLabel(row, colName[0]), toMsgString(row.getDate(colName[0])),
							toYMDString(getToday()), row.getGUIIndex(), equals);
				}
				else {
					msg = mcframe.commonFXUC.FXUCC0170.FXUCC_ValidaterUtil.msgNotBeforeToday(
							getLabel(row, colName[0]), toMsgString(row.getDate(colName[0])),
							toYMDString(getToday()), equals);
				}
				msg.setCauseRow(row, colName[0]);
				return msg;
			}
			return super.getMessage(row, colName);
		}

		/** 元の日時とチェックに使用した日付 */
		protected String toMsgString(MCDate dt) {
			return toYMDHMString(dt) 
					+ "("
					+ toYMDString(mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.getAcDt(dt))
					+ ")";
		}

	}

	/**
	 * コンテナ属性「REQUIRED」で指定されたステータスのRowのみチェックします。
	 * その他は {@link FXUCL_RequiredValidater} と同じです。
	 */
	protected class MAUDL_RequiredValidater_Status extends FXUCL_RequiredValidater {

		public MAUDL_RequiredValidater_Status() {
			super();
		}

		public MAUDL_RequiredValidater_Status(Predicate<MCRow> filter) {
			super(filter);
		}

		protected Set<MCRow.Status> _statusList;

		@Override
		protected boolean isInvalid(MCRow row, String... colName) {
			Set<MCRow.Status> set = getStatusSet(row, colName[0]);

			if (!set.contains(row.getStatus())) {
				return false;
			}
			return super.isInvalid(row, colName);
		}

		/**
		 * 必須チェック対象のステータスを返す。
		 *
		 * @param row チェック対象のRow
		 * @param colName チェック対象の項目
		 * @return 必須チェック対象のステータス
		 */
		protected Set<MCRow.Status> getStatusSet(MCRow row, String colName) {
			if (_statusList == null) {
				_statusList = new HashSet<>();

				if (row instanceof MCConstRow) {
					MCConstRow o = (MCConstRow)row;
					for (String status : o.getExtMap(Checker.CHK_REQUIRED).get(colName).split(",")) {
						if ("I".equals(status)) {
							_statusList.add(MCRow.CREATE);
						}
						else if ("U".equals(status)) {
							_statusList.add(MCRow.MODIFY);
						}
						else if ("N".equals(status)) {
							_statusList.add(MCRow.NONE);
						}
						// Eの場合は削除行以外チェックする
						else if ("E".equals(status)) {
							_statusList.add(MCRow.CREATE);
							_statusList.add(MCRow.MODIFY);
							_statusList.add(MCRow.NONE);
						}
					}
				}
			}
			return _statusList;
		}

	}

	protected class ListLogicBind {
		MCContainer _block;
		String _col;
		Map<String, MCContainer> _bindContMap;
		Map<String, String> _bindColMap;
		Map<String, Comparable<?>> _bindValMap;

		public ListLogicBind(MCContainer block, String col) {
			_block = block;
			_col = col;
			_bindContMap = new LinkedHashMap<>();
			_bindColMap = new LinkedHashMap<>();
			_bindValMap = new LinkedHashMap<>();
		}

		/**
		 * リストロジックチェックのインプット値の取得元がチェック対象のコンテナと同じで、
		 * リストロジックに定義している入力の項目名と同じ場合に使用する。
		 * @param listLogicCol リストロジック項目名
		 */
		public void putBind(String listLogicCol) {
			_bindContMap.put(listLogicCol, _block);
			_bindColMap.put(listLogicCol, listLogicCol);
		}

		/**
		 * リストロジックチェックのインプット値の取得元がチェック対象のコンテナと同じで、
		 * リストロジックに定義している入力の項目名と違う場合に使用する。
		 * @param listLogicCol リストロジック項目名
		 * @param col 取得元項目名
		 */
		public void putBind(String listLogicCol, String col) {
			_bindContMap.put(listLogicCol, _block);
			_bindColMap.put(listLogicCol, col);
		}

		/**
		 * リストロジックチェックのインプット値の取得元がチェック対象のコンテナが違い、
		 * リストロジックに定義している入力の項目名と同じ場合に使用する。
		 * @param listLogicCol リストロジック項目名
		 * @param block 取得元コンテナ
		 */
		public void putBind(String listLogicCol, MCRow block) {
			_bindContMap.put(listLogicCol, block);
			_bindColMap.put(listLogicCol, listLogicCol);
		}

		/**
		 * リストロジックチェックのインプット値の取得元がチェック対象のコンテナが違い、
		 * リストロジックに定義している入力の項目名と違う場合に使用する。
		 * @param listLogicCol リストロジック項目名
		 * @param block 取得元コンテナ
		 * @param col 取得元項目名
		 */
		public void putBind(String listLogicCol, MCRow block, String col) {
			_bindContMap.put(listLogicCol, block);
			_bindColMap.put(listLogicCol, col);
		}

		/**
		 * リストロジックチェックのインプット値が定数の場合に使用する。
		 * @param listLogicCol リストロジック項目名
		 * @param val 定数値
		 */
		public void putBind(String listLogicCol, Comparable<?> val) {
			_bindValMap.put(listLogicCol, val);
		}

		Map<String, MCContainer> getBindContMap() {
			return _bindContMap;
		}
		Map<String, String> getBindColMap() {
			return _bindColMap;
		}
		Map<String, Comparable<?>> getBindValMap() {
			return _bindValMap;
		}
	}
	
	/**
	 * 呼び出されたメソッドが存在する場合で、メソッドの処理内でおきたエラーであればスローする。
	 * 
	 * @param e 例外
	 */
	protected void throwWhenMethodExist(MCException e) {
		if (isSame(e.getID(), "FCBEC0014") || isSame(e.getID(), "FCBEC0015")) {
			return;
		}
		throw e;
	}

	/**
	 * メッセージプールを見てエラーフラグを設定するユーティリティです。<br>
	 * エラーＦＬＧの項目名はerr_flg固定です。
	 *
	 * @param l Listコンテナ
	 */
	protected void setErrFlgCmm(MCList l) {
		for (int i = 0; i < l.size(); i++) {
			setErrFlgCmm(l.get(i));
		}
	}

	/**
	 * メッセージプールを見てエラーフラグを設定するユーティリティです。<br>
	 * エラーＦＬＧの項目名はerr_flg固定です。
	 *
	 * @param r Rowコンテナ
	 */
	protected void setErrFlgCmm(MCRow r) {
		setErrFlgCmm(r, MCMessagePool.getMessageList());
	}

	/**
	 * メッセージリストを見てエラーフラグを設定するユーティリティです。<br>
	 * エラーＦＬＧの項目名はerr_flg固定です。
	 *
	 * @param r Rowコンテナ
	 * @param msgL メッセージリスト
	 */
	protected void setErrFlgCmm(MCRow r, MCMessageList msgL) {
		if (r.getBooleanNE(ERR_FLG_COL)) {
			return;
		}
		for (MCMessage msg : msgL) {
			if (isErrMsg(msg)) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null || (causeRow.getParamIndex() == r.getParamIndex() && causeRow.getParamRowIndex() == r.getParamRowIndex())) {
					r.setBooleanNE(ERR_FLG_COL, true);
					break;
				}
			}
		}
	}


	/**
	 * エラーメッセージかどうかを判定します。
	 * メッセージレベルがERROR、FATAL、PROBLEM、WARNのいずれかの場合にエラーとみなします。
	 * 
	 * @param msg メッセージ
	 */
	protected boolean isErrMsg(MCMessage msg) {
		return msg.getLevel() == MCMessageLevel.ERROR || msg.getLevel() == MCMessageLevel.FATAL || msg.getLevel() == MCMessageLevel.PROBLEM || msg.getLevel() == MCMessageLevel.WARN;
	}

	/**
	 * msgListに含まれるエラーメッセージ数を返します。
	 * メッセージレベルがERROR、FATAL、PROBLEM、WARNのいずれかの場合にエラーとみなします。
	 * 
	 * @param msgList メッセージリスト
	 */
	protected int getErrMsgSize(MCMessageList msgList) {
		int errMsgSize = 0;
		if (msgList == null) {
			return errMsgSize;
		}
		for (MCMessage msg : msgList) {
			if (isErrMsg(msg)) {
				errMsgSize++;
			}
		}
		return errMsgSize;
	}

	// ///////////////////////////////////////////////
	// サーバチェック関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// プッシュ通知関連（ここから）
	// ///////////////////////////////////////////////
	public void pushStartLog(FXBAL_BatchLogger logger) {
		pushLog(logger, MAUCL0114);
	}

	public void pushEndLog(FXBAL_BatchLogger logger) {
		pushLog(logger, MAUCL0115);
	}

	public void pushErrorLog(FXBAL_BatchLogger logger) {
		pushLog(logger, MAUCL0116);
	}

	public void pushLog(FXBAL_BatchLogger logger, String msgId) {
		String gpBatchGrpCd = MCTransactionManager.getGpBatchGrpCd();
		
		String batchGrpNm = execFuncString(
				createSqlId(LOGIC_ID, "FCPA_GP_BATCH_GRP$F_GET_GP_BATCH_GRP_NM1", "pushLog"),
				FCPA_GP_BATCH_GRP$F_GET_GP_BATCH_GRP_NM1(value(gpBatchGrpCd))
				);
		
		String mdl = MCSys.request.moduleId();
		String lgc = MCSys.request.logicId();
		String ope = MCSys.request.operationId();

		MCServerPushManager pushMgr = MCServerPushManager.getManager();

		// メッセージ作成
		MCMessage msg = new MCMessage(msgId, batchGrpNm, logger.getBatchLogNo(),
				getLogicLabel(mdl, lgc, null),
				getLogicLabel(mdl, lgc, ope));
		// プッシュメッセージ作成
		MCPushMessage pushMsg = new MCPushMessage(msg, isSame(msgId, MAUCL0116) ? true : false);

		// 遷移先の設定
		setPushScreenPC(pushMsg, logger.getBatchLogNo(), msgId);

		// プッシュ通知実行
		MCList<MAM_BATCH_PUSH_NTC_R> list = getBatchPushNtcL(gpBatchGrpCd);
		MCList<MAM_BATCH_PUSH_NTC_R>[] listArr = list.groupList(MAT_PUSH_NTC_USR_R.$push_typ);
		for (MCList<MAM_BATCH_PUSH_NTC_R> l : listArr) {
			String pushTyp = l.get(0).push_typ();
			String[] usrs = l.getString(MAM_BATCH_PUSH_NTC_R.$usr_cd).toArray(new String[0]);

			if (MAC_PUSH_TYP.isNON(pushTyp)) {
				pushMgr.storeMessage(pushMsg, mdl, lgc, ope, usrs);
				continue;
			}
			if (MAC_PUSH_TYP.isSCREEN(pushTyp)) {
				pushMgr.pushMessage(pushMsg, mdl, lgc, ope, usrs);
				continue;
			}
			if (MAC_PUSH_TYP.isMAIL(pushTyp)) {
				pushMgr.mailMessage(pushMsg, mdl, lgc, ope, usrs);
				continue;
			}
			if (MAC_PUSH_TYP.isSCREEN_MAIL(pushTyp)) {
				pushMgr.sendMessage(pushMsg, mdl, lgc, ope, usrs);
				continue;
			}
		}
	}
	
	protected static final String TTL_CO_CD = "{CO_CD}";
	protected static final String TTL_CHNG_NO = "{CHNG_NO}";
	protected static final String TTL_WG_CD = "{WG_CD}";
	protected static final String NULL_VAL = "*";
	protected static final String BLANK = " ";
	protected static final int BLANK_CNT = 2;
	
	/**
	 * メッセージリスト送信を行います。
	 * 
	 * @param chngNo 変更ＮＯ（メールタイトル用）
	 * @param wgCd ワーキンググループＣＤ（メールタイトル用、ＩＦ通知制御マスタ検索用）
	 * @param mdlId モジュールＩＤ
	 * @param lgcId ロジックＩＤ
	 * @param opeId オペレーションＩＤ
	 * @param msgL メッセージリスト
	 * @param logger ロガー
	 * @param msgId メール本文メッセージＩＤ
	 * @param binds メール本文メッセージバインド（最後のバインドを含めない）
	 */
	public void pushAlert(String chngNo, String wgCd, String mdlId, String lgcId, String opeId,
			MCMessageList msgL, FXBAL_BatchLogger logger, String msgId, Object... binds) {

		pushAlert(chngNo, wgCd, null, null, mdlId, lgcId, opeId, msgL, logger, msgId, binds);
	}
	
	protected String getPushMsgLvl(String usrCd) {
		FCM_PUSHMSG_SETTING_R r = getPushMsgSetR(usrCd, NULL_VAL, 
				NULL_VAL, NULL_VAL, MCServerPushManager.PARAM_LEVEL);
		
		return r.param_val();
	}
	
	protected String convertToTxt(MCMessageList msgL) {
		String chgLine = System.getProperty("line.separator");
		String txt = "";
		for(MCMessage msg : msgL) {
			String msgId = msg.getID();
			String pre1 = "";
			for(int i = 1; i <= BLANK_CNT; i++) {
				pre1 += BLANK;
			}
			String pre2 = "";
			for(int i = 1; i <= msgId.length() + BLANK_CNT * 2; i++) {
				pre2 += BLANK;
			}
			String msgStr = msg.toString().replace(chgLine, chgLine + pre2);
			txt += chgLine + pre1 + msg.getID() + pre1 + msgStr;
		}

		return txt;
	}

	protected MAC_PUSH_TYP getPushTyp(String usrCd, String mdlId, String lgcId, String opeId, String msgId) {
		FCM_PUSHMSG_SETTING_R r = getPushMsgSetR(usrCd, mdlId, lgcId, opeId, msgId);
		if(r.isEmpty()) {
			return MAC_PUSH_TYP.SCREEN_MAIL;
		}
		
		return MAC_PUSH_TYP.get(r.param_val());
	}
	
	protected List<Object> appendList(Object[] objArr, Object... appendObj) {
		List<Object> retL = new ArrayList<>();
		for(Object o : objArr) {
			retL.add(o);
		}
		for(Object o : appendObj) {
			retL.add(o);
		}
		return retL;
	}
	
	protected boolean isNewPushMsgId(String usrCd, String mdlId, String lgcId, String opeId, String msgId) {
		FCT_PUSHMSG_R T1 = FCT_PUSHMSG_R.create("T1");
		String sqlid = createSqlId(LOGIC_ID, T1, "S01");
		
		FCT_PUSHMSG_SEND_R T2 = FCT_PUSHMSG_SEND_R.create("T2");
		
		//送信対象ユーザの通知履歴に対象のメッセージIDが保存されているかどうかを確認する。
		MCRow bindR = MCRow.create();
		String c_co_cd = "co_cd";
		String c_module_id = "module_id";
		String c_logic_id = "logic_id";
		String c_operation_id = "operation_id";
		String c_msg_id = "msg_id";
		String c_usr_cd = "usr_cd";
		bindR.setStringNE(c_co_cd, getCo().co_cd());
		bindR.setStringNE(c_module_id, mdlId);
		bindR.setStringNE(c_logic_id, lgcId);
		bindR.setStringNE(c_operation_id, opeId);
		bindR.setStringNE(c_msg_id, msgId);
		bindR.setStringNE(c_usr_cd, usrCd);
		
		MCRow cntR = MCRow.create();
		sql(sqlid).mainQuery()
		.select(COUNT_COL)
		// メッセージ履歴が存在する
		.where(exists(subQuery()
				.select(T1.prAll())
				.from(T1)
				.where(
					T1.co_cd.eq(bind(c_co_cd))
					.and(T1.module_id.eq(bind(c_module_id)))
					.and(T1.logic_id.eq(bind(c_logic_id)))
					.and(T1.operation_id.eq(bind(c_operation_id)))
					.and(T1.msg_id.eq(bind(c_msg_id)))
					// 送信対象ユーザとして登録済み
					.and(exists(subQuery()
							.select(T2.prAll())
							.from(T2)
							.where(
								T2.push_id.eq(T1.push_id)
								.and(T2.user_id.eq(bind(c_usr_cd)))
							)
						))
				)
			))
		.executeQuery(bindR, cntR);
		return cntR.getNumber(COUNT_NAME).intValue() <= 0;
	}
	
	protected void pushLog(String usrCd, String mdlId, String lgcId, String opeId, String bpCd,
			MCMessage ttlMsg, MCMessage mainMsg, boolean iptFlg, MAC_PUSH_TYP pushTyp, FXBAL_BatchLogger logger) {
		boolean msgTooLong = false;
		// メッセージバインドの長さはＤＢ定義より大きい場合、最後のバインド文字を変える。
		String msgBindForDB = MCServerPushManager.createMessageBindForDB(mainMsg);
		if(!isNull(msgBindForDB) && msgBindForDB.length() > FCT_PUSHMSG_R.msg_bind_META.length()) {
			mainMsg.setBind(mainMsg.getBindArray().length, new MCMessage(MAUDL0410).toString());
			msgTooLong = true;
		}
		
		MCServerPushManager pushMgr = MCServerPushManager.getManager();
		MCPushMessage pushMsg = new MCPushMessage(mainMsg, ttlMsg, iptFlg);
		
		// 遷移先の設定
		setPushScreenPC(mdlId, lgcId, opeId, bpCd, pushMsg, logger.getBatchLogNo(), mainMsg.getID(), msgTooLong);
		
		if (MAC_PUSH_TYP.isNON(pushTyp)) {
			pushMgr.storeMessage(pushMsg, mdlId, lgcId, opeId, usrCd);
		}
		if (MAC_PUSH_TYP.isSCREEN(pushTyp)) {
			pushMgr.pushMessage(pushMsg, mdlId, lgcId, opeId, usrCd);
		}
		if (MAC_PUSH_TYP.isMAIL(pushTyp)) {
			pushMgr.mailMessage(pushMsg, mdlId, lgcId, opeId, usrCd);
		}
		if (MAC_PUSH_TYP.isSCREEN_MAIL(pushTyp)) {
			pushMgr.sendMessage(pushMsg, mdlId, lgcId, opeId, usrCd);
		}
	}
	
	protected void setPushScreenPC(String mdlId, String lgcId, String opeId, String bpCd,
			MCPushMessage pushMsg, String batchLogNo, String msgId, boolean msgTooLong) {
		String base_key = null;
		String mid = null;
		String sid = null;
		
		// メッセージが長い場合はバッチログ確認へ遷移
		if (!msgTooLong) {
			// モジュールＩＤ＋ロジックＩＤ＋オペレーションＩＤ
			base_key = MCConst.createKey(mdlId, lgcId, opeId, PUSH_LOG_KEY);
			mid = MCConst.app.getString(MCConst.createKey(base_key, "module_id"), null);
			sid = MCConst.app.getString(MCConst.createKey(base_key, "screen_id"), null);
			
			// モジュールＩＤ＋ロジックＩＤ
			if (isNullOr(mid, sid)) {
				base_key = MCConst.createKey(mdlId, lgcId, PUSH_LOG_KEY);
				mid = MCConst.app.getString(MCConst.createKey(base_key, "module_id"), null);
				sid = MCConst.app.getString(MCConst.createKey(base_key, "screen_id"), null);
			}
			// モジュールＩＤ
			if (isNullOr(mid, sid)) {
				base_key = MCConst.createKey(mdlId, PUSH_LOG_KEY);
				mid = MCConst.app.getString(MCConst.createKey(base_key, "module_id"), null);
				sid = MCConst.app.getString(MCConst.createKey(base_key, "screen_id"), null);
			}
			// 指定なし
			if (isNullOr(mid, sid)) {
				base_key = MCConst.createKey(PUSH_LOG_KEY);
				mid = MCConst.app.getString(MCConst.createKey(base_key, "module_id"), null);
				sid = MCConst.app.getString(MCConst.createKey(base_key, "screen_id"), null);
			}
		}
		if (isNullOr(mid, sid)) {
			setPushScreenPCDef(pushMsg, batchLogNo);
		}
		else {
			pushMsg.setScreenPC(mid, sid);
			String openType = MCConst.app.getString(MCConst.createKey(base_key, "open_type"), null);
			if (!isNull(openType)) {
				List<String> list = new ArrayList<String>();
				list.add(openType);
				if (isSame(sid, "MBBEP0080")) {
					String tableName = MCConst.app.getString(MCConst.createKey(base_key, "table_name"), null);
					list.add(null);
					list.add(tableName);
					
					String batchLogNoCol = MCConst.app.getString(MCConst.createKey(base_key, "batch_log_no_col"), null);
					if (!isNull(batchLogNoCol)) {
						list.add("batch_log_no");
						list.add(batchLogNo);
					}
					
					String updSrvReqNoCol = MCConst.app.getString(MCConst.createKey(base_key, "upd_srv_req_no_col"), null);
					if (!isNull(updSrvReqNoCol)) {
						list.add("upd_srv_req_no");
						list.add(MCSys.request.serverRequestNo());
					}
					
					String bpCdCol = MCConst.app.getString(MCConst.createKey(base_key, "bp_cd_col"), null);
					if (!isNull(bpCdCol)) {
						list.add(bpCdCol);
						list.add(bpCd);
					}
					
					boolean srchErrFlg = MCConst.app.getBoolean(MCConst.createKey(base_key, "srch_error_flg"), false);
					if (srchErrFlg) {
						list.add("exe_sts_typ");
						list.add(MAC_EXE_STS_TYP.ERR.value());
					}
					
					boolean srchSendConvErrFlg = MCConst.app.getBoolean(MCConst.createKey(base_key, "srch_send_conv_error_flg"), false);
					if (srchSendConvErrFlg) {
						list.add("sdrv_sts_typ");
						list.add(MAC_SDRV_STS_TYP.SEND_CONV_ERR.value());
					}
					
					boolean srchRecvConvErrFlg = MCConst.app.getBoolean(MCConst.createKey(base_key, "srch_recv_conv_error_flg"), false);
					if (srchRecvConvErrFlg) {
						list.add("sdrv_sts_typ");
						list.add(MAC_SDRV_STS_TYP.RECV_CONV_ERR.value());
					}

				}
				pushMsg.setScreenInitParamPC(list.toArray(new String[0]));
			}
			boolean defActionFlg = MCConst.app.getBoolean(MCConst.createKey(base_key, "scr_action_default_flg"), false);
			if (defActionFlg) {
				pushMsg.setScreenActionPC(MCServerPushManager.SCR_ACTION_DEFAULT);
			}
			else {
				String action = MCConst.app.getString(MCConst.createKey(base_key, "action"), null);
				if (!isNull(action)) {
					pushMsg.setScreenActionPC(action);
				}
			}
			String batchNo = MCConst.app.getString(MCConst.createKey(base_key, "cnd_batch_no"), null);
			if (!isNull(batchNo)) {
				pushMsg.addScreenParamPC(batchNo, batchLogNo);
			}
			String srvReqNo = MCConst.app.getString(MCConst.createKey(base_key, "cnd_srv_req_no"), null);
			if (!isNull(srvReqNo)) {
				pushMsg.addScreenParamPC(srvReqNo, MCSys.request.serverRequestNo());
			}
		}
	}
	
	protected FCM_PUSHMSG_SETTING_R getPushMsgSetR(String usrCd, String mdlId, String lgcId, String opeId, String msgId) {
		FCM_PUSHMSG_SETTING_R dbc = FCM_PUSHMSG_SETTING_R.create();
		String sqlId = createSqlId(LOGIC_ID, dbc, "S01");
		dbc.user_id(usrCd);
		dbc.module_id(mdlId);
		dbc.logic_id(lgcId);
		dbc.operation_id(opeId);
		dbc.param_key(msgId);
		dbSelectKey(sqlId, dbc, dbc, dbc);
		return dbc;
	}
	/**
	 * メッセージリスト送信を行います。
	 * 
	 * @param chngNo 変更ＮＯ（メールタイトル用。省略可）
	 * @param wgCd ワーキンググループＣＤ（メールタイトル用、ＩＦ通知制御マスタ検索用。省略可）
	 * @param bpCd（メールタイトル用、ＩＦ通知制御マスタ検索用。省略可）
	 * @param usrCd 担当者ＣＤ（業務担当者通知がオンの場合にプッシュ通知する担当者。省略可）
	 * @param mdlId モジュールＩＤ
	 * @param lgcId ロジックＩＤ
	 * @param opeId オペレーションＩＤ
	 * @param msgL メッセージリスト
	 * @param logger ロガー
	 * @param msgId メール本文メッセージＩＤ
	 * @param binds メール本文メッセージバインド（最後のバインドを含めない）
	 */
	public void pushAlert(String chngNo, String wgCd, String bpCd, String usrCd, String mdlId, String lgcId, String opeId,
			MCMessageList msgL, FXBAL_BatchLogger logger, String msgId, Object... binds) {
		if(msgL == null || msgL.isEmpty()) {
			return;
		}
		
		// ＩＦ通知制御マスタでタイトルを取得
		MAM_IF_NTC_CTL_R ntcCtlR = getNtcCtl(mdlId, lgcId, wgCd, bpCd);
		if(ntcCtlR.isEmpty()) {
			return;
		}
		
		// ＩＦ通知先マスタで担当者を取得
		MCList<MAM_IF_NTC_R> ntcL = getNtc(ntcCtlR, usrCd);
		
		// 担当者ごとに通知送信を行う
		for(MAM_IF_NTC_R ntcR : ntcL) {
			// 受信レベル
			MCMessageLevel recvLvl = MCMessageLevel.INFO;
			String lvl = getPushMsgLvl(ntcR.usr_cd());
			if(isNull(lvl)) {
				lvl = ntcR.msg_lvl();
			}
			if(!isNull(lvl)) {
				recvLvl = MCMessageLevel.valueOf(lvl.charAt(0));
			}
			
			// プッシュ対象メッセージ
			MCMessageList tgtL = new MCMessageList();
			for(MCMessage msg : msgL) {
				if(msg.getLevel().compareTo(recvLvl) >= 0) {
					tgtL.add(msg);
				}
			}
			
			// メール対象メッセージ
			
			// 通知対象の個別メッセージが存在しない場合は終了。
			if (MCCollectionUtil.isEmpty(tgtL)) {
				continue;
			}
			
			// 警告メッセージ本文の作成
			// メール通知対象の個別メッセージを使用して警告メッセージの本文を作成する。
			MCMessageList tgtMailL = new MCMessageList();
			HashMap<String, MAC_PUSH_TYP> usertyp = new HashMap<>();
			
			for(MCMessage msg : tgtL) {
				String mid = msg.getID();
				// メッセージIDをキーとする。オペレーションIDなどその他のキーは、このループ内では変更されないので不要。
				MAC_PUSH_TYP pushTyp = usertyp.get(mid);
				if (pushTyp == null) {
					pushTyp = getPushTyp(ntcR.usr_cd(), mdlId, lgcId, opeId, mid);
					usertyp.put(mid, pushTyp);
				}
				
				if(MAC_PUSH_TYP.isMAIL(pushTyp) || MAC_PUSH_TYP.isSCREEN_MAIL(pushTyp)) {
					tgtMailL.add(msg);
				}
			}
			String msgTxt = convertToTxt(tgtMailL);
			
			// 警告メッセージの通知
			// 本メソッド引数「msgId」のメッセージを通知する。
			MAC_PUSH_TYP pushTypMail = getPushTyp(ntcR.usr_cd(), mdlId, lgcId, opeId, msgId);
			String ttlTxt = getTitle(ntcCtlR, chngNo, wgCd, bpCd);
			MCMessage mailTtlMsg = new MCMessage(MAUDL0409, ttlTxt);
			MCMessage mailTxtMsg = new MCMessage(msgId, appendList(binds, msgTxt));
			pushLog(ntcR.usr_cd(), mdlId, lgcId, opeId, bpCd, mailTtlMsg, mailTxtMsg, true, pushTypMail, logger);

			// 個別メッセージの通知
			// 【プッシュメッセージ確認】画面でメッセージIDごとにメール通知対象を制限できるようにするために、個別のメッセージを保存する。
			// 同一メッセージIDを複数保存する必要はないため、同一メッセージIDのメッセージは１件のみを通知する。
			HashSet<String> checkedMids = new HashSet<>();
			for(MCMessage msg : tgtL) {
				String mid = msg.getID();
				
				if (checkedMids.contains(mid)) {
					continue;
				}
				checkedMids.add(mid);
				
				if(isNewPushMsgId(ntcR.usr_cd(), mdlId, lgcId, opeId, msg.getID())) {
					pushLog(ntcR.usr_cd(), mdlId, lgcId, opeId, bpCd, null, msg, true, MAC_PUSH_TYP.NON, logger);
				}
			}
		}
	}

	protected MAM_IF_NTC_CTL_R getNtcCtl(String mdlId, String lgcId, String wgCd, String bpCd) {
		MCList<MAM_IF_NTC_CTL_R> l = MCList.create(MAM_IF_NTC_CTL_R.class);
		MAM_IF_NTC_CTL_R M1 = MAM_IF_NTC_CTL_R.create("M1");
		String sqlid = createSqlId(LOGIC_ID, M1, "S01");
		MCRow bind = MCRow.create();
		bind.addStringColumn("module_id", mdlId);
		bind.addStringColumn("logic_id", lgcId);
		bind.addStringColumn("wg_cd", wgCd);
		bind.addStringColumn("bp_cd", bpCd);
		
		sql(sqlid)
			.mainQuery()
			.select(M1.prAll())
			.from(M1)
			.where(
					M1.module_id.eq(bind(MAM_IF_NTC_CTL_R.$module_id))
					.or(M1.module_id.eq(value(MAC_STR.NULL_VAL.value()))	)
					.and(
							M1.logic_id.eq(bind(MAM_IF_NTC_CTL_R.$logic_id))
							.or(M1.logic_id.eq(value(MAC_STR.NULL_VAL.value())))
					)
					.and(
							M1.wg_cd.eq(bind(MAM_IF_NTC_CTL_R.$wg_cd))
							.or(M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
					)
					.and(
							M1.bp_cd.eq(bind(MAM_IF_NTC_CTL_R.$bp_cd))
							.or(M1.bp_cd.eq(value(MAC_STR.NULL_VAL.value())))
					)
			)
			.executeQuery(bind, l);

		MCIndexKey ik = l.createIndex(MAM_IF_NTC_CTL_R.$module_id, MAM_IF_NTC_CTL_R.$logic_id,
				MAM_IF_NTC_CTL_R.$wg_cd, MAM_IF_NTC_CTL_R.$bp_cd);
		
		MAM_IF_NTC_CTL_R r;
		
		// １．モジュールＩＤ＋ロジックＩＤ＋ワーキンググループ＋取引先
		r = l.getFirst(ik, mdlId, lgcId, wgCd, bpCd);
		if (!isNull(r)) {
			return r;
		}
		// ２．モジュールＩＤ＋ロジックＩＤ＋ワーキンググループ＋NULL文字
		r = l.getFirst(ik, mdlId, lgcId, wgCd, MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}
		// ３．モジュールＩＤ＋ロジックＩＤ＋NULL文字＋取引先
		r = l.getFirst(ik, mdlId, lgcId, MAC_STR.NULL_VAL.value(), bpCd);
		if (!isNull(r)) {
			return r;
		}
		// ４．モジュールＩＤ＋ロジックＩＤ＋NULL文字＋NULL文字
		r = l.getFirst(ik, mdlId, lgcId, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}
		// ５．モジュールＩＤ＋NULL文字＋ワーキンググループ＋取引先
		r = l.getFirst(ik, mdlId, MAC_STR.NULL_VAL.value(), wgCd, bpCd);
		if (!isNull(r)) {
			return r;
		}
		// ６．モジュールＩＤ＋NULL文字＋ワーキンググループ＋NULL文字
		r = l.getFirst(ik, mdlId, MAC_STR.NULL_VAL.value(), wgCd, MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}
		// ７．モジュールＩＤ＋NULL文字＋NULL文字＋取引先
		r = l.getFirst(ik, mdlId, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), bpCd);
		if (!isNull(r)) {
			return r;
		}
		// ８．モジュールＩＤ＋NULL文字＋NULL文字＋NULL文字
		r = l.getFirst(ik, mdlId, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}
		// ９．NULL文字＋NULL文字＋ワーキンググループ＋取引先
		r = l.getFirst(ik, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), wgCd, bpCd);
		if (!isNull(r)) {
			return r;
		}
		// １０．NULL文字＋NULL文字＋ワーキンググループ＋NULL文字
		r = l.getFirst(ik, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), wgCd, MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}
		// １１．NULL文字＋NULL文字＋NULL文字＋取引先
		r = l.getFirst(ik, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), bpCd);
		if (!isNull(r)) {
			return r;
		}
		// １２．NULL文字＋NULL文字＋NULL文字＋NULL文字
		r = l.getFirst(ik, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r)) {
			return r;
		}

		return MAM_IF_NTC_CTL_R.create();
	}

	protected MCList<MAM_IF_NTC_R> getNtc(MAM_IF_NTC_CTL_R ntcCtlR, String usrCd) {
		MCList<MAM_IF_NTC_R> l = MCList.create(MAM_IF_NTC_R.class);
		MAM_IF_NTC_R M1 = MAM_IF_NTC_R.create("M1");
		String sqlid = createSqlId(LOGIC_ID, M1, "S01");
		
		sql(sqlid)
			.mainQuery()
			.select(M1.prAll())
			.from(M1)
			.where(
					M1.module_id.eq(bind(MAM_IF_NTC_R.$module_id))
					.and(M1.logic_id.eq(bind(MAM_IF_NTC_R.$logic_id))
					.and(M1.wg_cd.eq(bind(MAM_IF_NTC_R.$wg_cd))
					.and(M1.bp_cd.eq(bind(MAM_IF_NTC_R.$bp_cd))
					.and(value(getToday()).between(M1.st_dt, M1.end_dt)))))
			)
			.executeQuery(ntcCtlR, l);

		// 業務担当者通知の場合、引数の担当者もプッシュ通知対象にする
		if (ntcCtlR.biz_usr_ntc_flg() && !isNull(usrCd)) {
			MAM_IF_NTC_R r = MAM_IF_NTC_R.create();
			r.module_id(ntcCtlR.module_id());
			r.logic_id(ntcCtlR.logic_id());
			r.wg_cd(ntcCtlR.wg_cd());
			r.bp_cd(ntcCtlR.bp_cd());
			r.usr_cd(usrCd);
			r.msg_lvl(ntcCtlR.msg_lvl());
			l.add(r);
		}
		
		return l;
	}
	
	protected static final String TTL_BP_CD = "{BP_CD}";
	
	protected String getTitle(MAM_IF_NTC_CTL_R ntcCtlR, String... values) {
		
		String chngNo = values[0];
		String wgCd = values[1];
		String bpCd = values[2];
		
		String ttlTxt = ntcCtlR.ntc_title();
		ttlTxt = ttlTxt.replace(TTL_CO_CD, getCo().co_cd());
		if (!isNull(chngNo)) ttlTxt = ttlTxt.replace(TTL_CHNG_NO, chngNo);
		if (!isNull(wgCd)) ttlTxt = ttlTxt.replace(TTL_WG_CD, wgCd);
		if (!isNull(bpCd)) ttlTxt = ttlTxt.replace(TTL_BP_CD, bpCd);
		
		return ttlTxt;
	}
	protected void setPushScreenPC(MCPushMessage pushMsg, String batchLogNo, String msgId) {
		String base_key = MCConst.createKey(MCSys.request.moduleId(), MCSys.request.logicId(), MCSys.request.operationId(), PUSH_LOG_KEY);
		String mid = MCConst.app.getString(MCConst.createKey(base_key, "module_id"), null);
		String sid = MCConst.app.getString(MCConst.createKey(base_key, "screen_id"), null);
		if (isNullOr(mid, sid)) {
			setPushScreenPCDef(pushMsg, batchLogNo);
		}
		else {
			pushMsg.setScreenPC(mid, sid);
			boolean defActionFlg = MCConst.app.getBoolean(MCConst.createKey(base_key, "scr_action_default_flg"), false);
			if (defActionFlg) {
				pushMsg.setScreenActionPC(MCServerPushManager.SCR_ACTION_DEFAULT);
			}
			else {
				String action = MCConst.app.getString(MCConst.createKey(base_key, "action"), null);
				if (!isNull(action)) {
					pushMsg.setScreenActionPC(action);
				}
			}
			String batchNo = MCConst.app.getString(MCConst.createKey(base_key, "cnd_batch_no"), null);
			if (!isNull(batchNo)) {
				pushMsg.addScreenParamPC(batchNo, batchLogNo);
			}
			String srvReqNo = MCConst.app.getString(MCConst.createKey(base_key, "cnd_srv_req_no"), null);
			if (!isNull(srvReqNo)) {
				pushMsg.addScreenParamPC(srvReqNo, MCSys.request.serverRequestNo());
			}
		}
	}
	
	protected void setPushScreenPCDef(MCPushMessage pushMsg, String batchLogNo) {
		pushMsg.setScreenPC("FS", "FSBGP0160");
		pushMsg.setScreenActionPC(MCServerPushManager.SCR_ACTION_DEFAULT);
		// 遷移先の検索条件
		pushMsg.addScreenParamPC("Cnd.batch_log_no", batchLogNo);
		pushMsg.addScreenParamPC("Cnd.start_ts_fr", MCDate.now().trunc(MCDateFieldType.DAY));
	}

	protected Map<String, MCList<MAM_BATCH_PUSH_NTC_R>> _batchPushMap = new HashMap<>();
	protected MCList<MAM_BATCH_PUSH_NTC_R> getBatchPushNtcL(String gpBatchGrpCd) {
		if (!_batchPushMap.containsKey(gpBatchGrpCd)) {
			_batchPushMap.put(gpBatchGrpCd, selectBatchPushNtcL(gpBatchGrpCd));
		}
		return _batchPushMap.get(gpBatchGrpCd);
	}
	protected MCList<MAM_BATCH_PUSH_NTC_R> selectBatchPushNtcL(String gpBatchGrpCd) {
		MAM_BATCH_PUSH_NTC_R M1 = MAM_BATCH_PUSH_NTC_R.create("M1");
		String sqlid = createSqlId(LOGIC_ID, M1, "S01");
		
		MCList<MAM_BATCH_PUSH_NTC_R> ret = MCList.create(MAM_BATCH_PUSH_NTC_R.class);
		sql(sqlid)
			.mainQuery()
			.select(M1.prAll())
			.from(M1)
			.where(
					M1.gp_batch_grp_cd.eq(value(gpBatchGrpCd))
					.and(value(getToday()).between(M1.st_dt, M1.end_dt))
			)
			.executeQuery(ret);
		return ret;
	}

	// ///////////////////////////////////////////////
	// プッシュ通知関連（ここまで）
	// ///////////////////////////////////////////////
	// ///////////////////////////////////////////////
	// -- ロガーのAPI(ここから)
	// ///////////////////////////////////////////////
	
	/**
	 * ロガーを生成し、引数dbtranにロガーを引き継ぎます。<p>
	 * 指定されたデータ参照制御用文字列でLoggerが未作成の場合はLoggerを新規作成します。<br>
	 *  取得したLoggerはカレントLoggerにセットします。
	 * 引数dbtranにロガーを引き継ぐ処理はDBアクセスを伴います。<br>
	 * ロガーを取得するだけの場合は{@link #getBatchLogger(String)}を使用してください。
	 * @param dataRefCt　データ参照制御用文字列
	 * @param dbtran ＤＢトランザクション
	 * @return ロガー
	 */
	protected FXBAL_BatchLogger initBatchLogger(String dataRefCt, MCDBTransaction dbtran) {
		return initBatchLoggerImpl(dataRefCt, dbtran);
	}

	/**
	 * ロガーを生成し、引数dbtranにロガーを引き継ぎます。<p>
	 * データ参照制御用文字列には空文字を使用します。データ参照制御用文字列のLoggerが未作成の場合はLoggerを新規作成します。<br>
	 * 取得したLoggerはカレントLoggerにセットします。<br>
	 * 引数dbtranにロガーを引き継ぐ処理はDBアクセスを伴います。<br>
	 * ロガーを取得するだけの場合は{@link #getBatchLogger()}を使用してください。。
	 *  
	 * @param dbtran ＤＢトランザクション
	 * @return ロガー
	 */
	protected FXBAL_BatchLogger initBatchLogger(MCDBTransaction dbtran) {
		return initBatchLoggerImpl(null, dbtran);
	}
	
	protected FXBAL_BatchLogger initBatchLoggerImpl(String dataRefCt, MCDBTransaction dbtran) {
		FXBAL_BatchLogger b = getBatchLogger(dataRefCt);
		if (dbtran != null) {
			b.inheritToPlsql(dbtran);
		}
		return b;
	}
	/**
	 * ロガーを取得します。<p>
	 * ロガー取得メソッドのラッパーです。このメソッド利用箇所のロガーを一括で変更するために用意されています。<br>
	 * 指定されたデータ参照制御用文字列のLoggerが未作成の場合はLoggerを新規作成します。<br>
	 *  取得したLoggerはカレントLoggerにセットします。
	 * @param dataRefCt　データ参照制御用文字列
	 * @return ロガー
	 * @see #initBatchLogger(String)
	 */
	protected FXBAL_BatchLogger getBatchLogger(String dataRefCt) {
		return getBatchLoggerImpl(dataRefCt);
	}

	/**
	 * ロガーを取得します。<p>
	 * ロガー取得メソッドのラッパーです。このメソッド利用箇所のロガーを一括で変更するために用意されています。<br>
	 * データ参照制御用文字列には空文字を使用します。Loggerが未作成の場合はLoggerを新規作成します。<br>
	 * 取得したLoggerはカレントLoggerにセットします。<br>
	 *  
	 * @return ロガー
	 * @see #initBatchLogger()
	 */
	protected FXBAL_BatchLogger getBatchLogger() {
		return getBatchLoggerImpl(null);
	}
	protected FXBAL_BatchLogger getBatchLoggerImpl(String dataRefCt) {
		FXBAL_BatchLogger b = null;
		if (isNull(dataRefCt)) {
			b = getConcurrentLogger();
		}
		else {
			b = getConcurrentLogger(dataRefCt);
		}
		return b;
	}
	/** カレントのバッチロガーを使用して開始ログを出力します。 <p>
	 * カレントのバッチロガーがない場合は何もしません。<br>
	 * @param stMsgId 開始メッセージＩＤ。nullの場合はデフォルトのメッセージ
	 */
	protected void writeStartLogWithLogger(String stMsgId) {
		FXBAL_BatchLogger lgr = logger();
		if (lgr == null) {
			return;
		}
		
		if (!isNull(stMsgId)) {
			lgr.writeStartLog(stMsgId);
		}
		else {
			String lgc = MCSys.request.logicId();
			String ope = MCSys.request.operationId();
			lgr.writeStartLog(new MCMessage(MAUDL0406, lgc, ope));
		}
		
		if (!isNull(MCTransactionManager.getGpBatchGrpCd())) {
			pushStartLog(lgr);
		}
	}
	/** カレントのバッチロガーを使用して終了ログを出力します。<p>
	 * このメソッド実行後、例外画発生したかどうかを判定するflgはfalseになります
	 * （{@link #exHandled()}はfalseを返します）。<br>
	 * カレントのバッチロガーがない場合はログを出力しません。<br>
	 * 
	 * @param endMsgId 終了メッセージＩＤ。nullの場合はデフォルトのメッセージ
	 */
	protected void writeEndLogWithLogger(String endMsgId) {
		FXBAL_BatchLogger lgr = loggerNE();
		if (lgr == null) {
			object(RsltParamClazz)._hasExceptionFlg = false;
			return;
		}
		boolean push = !isNull(MCTransactionManager.getGpBatchGrpCd());
		if (exHandled()) {
			object(RsltParamClazz)._hasExceptionFlg = false;
			if (push) {
				pushErrorLog(lgr);
			}
		}

		if (!isNull(endMsgId)) {
			lgr.writeEndLog(endMsgId);
		}
		else {
			String lgc = MCSys.request.logicId();
			String ope = MCSys.request.operationId();
			lgr.writeEndLog(new MCMessage(MAUDL0407, lgc, ope));
		}
		
		if (push) {
			pushEndLog(lgr);
		}
	}
	
	protected Class<? extends MAUDL_ResultParam> RsltParamClazz = getExFlgClass();

	/** 例外発生ＦＬＧ **/
	protected  Class<? extends MAUDL_ResultParam> getExFlgClass() {
		return MAUDL_ResultParam.class;
	}
	
	/** 例外発生時の処理を行い、カレントのロガーがある場合はロガーに例外を出力します。
	 */
	protected void handleExWithLogger(Exception ex) {

		object(RsltParamClazz)._hasExceptionFlg = true;
		
		MCException mcex;
		if (ex instanceof MCException) {
			mcex = (MCException) ex;
		}
		else {
			mcex = new MCException(ex);
		}
		FXBAL_BatchLogger lgr = loggerNE();
		if (lgr != null) {
			lgr.writeProcessLog(mcex);
		}

		throw mcex;
	}
	
	/**
	 * {@link #handleExWithLogger(Exception)}実行済の場合trueを返します。
	 * @return {@link #handleExWithLogger(Exception)}実行済の場合true
	 */
	protected boolean exHandled() {
		return object(RsltParamClazz)._hasExceptionFlg;
	}

	
	// ///////////////////////////////////////////////
	// -- ロガーのAPI(ここまで)
	// ///////////////////////////////////////////////
	// ///////////////////////////////////////////////
	// ファイル入力関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * リソースの設定に基づき、ファイル入力時の補完処理を行う。
	 * @param item 項目
	 * @param inputFile ファイル入力値
	 * @param complValue 補完値
	 * @return リソースが未設定またはtrueの場合、引数で指定された補完値を返す。ただし、引数で指定されたファイル入力値がnullではないまたはtrueの場合、そのまま返す。<br>
	 * リソースがfalseの場合、引数で指定されたファイル入力値を返す。
	 */
	protected Comparable<?> complInputFileValue(String item, Comparable<?> inputFile, Comparable<?> complValue) {
		
		if ((inputFile instanceof Boolean && (Boolean)inputFile) 
				|| (!(inputFile instanceof Boolean) && !isNull(inputFile))) {
			return inputFile;
		}
		
		if (doComplInputFileValue(item)) {
			return complValue;
		}
		else {
			return inputFile;
		}
	}
	
	/**
	 * 引数で指定された項目がファイル入力時に補完対象かどうか。
	 * @param item 項目
	 * @return 補完対象の場合はtrue
	 */
	protected boolean doComplInputFileValue(String item) {
		
		String baseKey = MCConst.createKey(MCSys.request.moduleId(), MCSys.request.logicId(), MCSys.request.operationId(), item);
		String Key = baseKey;
	
		if (MCConst.app.containsKey(MCConst.createKey(baseKey, getCo().co_cd()))) {
			Key = MCConst.createKey(baseKey, getCo().co_cd());
		}
		
		return  MCConst.app.getBoolean(Key, true);
	}
	// ///////////////////////////////////////////////
	// ファイル入力関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// -- JoinUtility関連(ここから)
	// ///////////////////////////////////////////////
	protected void setValuesDbc(MCJoinerList<? extends MCRow> joinerList, MCRow upR, MCList<? extends MCConstRow> down) {
		_join(joinerList, down);
	}

	private <R extends MCRow> void _join(MCJoinerList<?> joinerList, MCList<?> down) {
		((MCJoinerList<R>) joinerList).join((MCList<R>) down);
	}
	// ///////////////////////////////////////////////
	// -- JoinUtility関連(ここまで)
	// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}