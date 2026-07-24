package mcframe.clientMAUC.MAUCP0130;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_StEndYmUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_StEndYmUtil_MC extends MAUCP_StEndYmUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final MAUCP_StEndYmUtil _util = new MAUCP_StEndYmUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_StEndYmUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 開始年月終了年月制御対象の画面かどうかを返します。
	 * 
	 * @param panel パネル
	 * @return 開始年月終了年月制御対象の画面の場合true
	 */
	public static boolean isStEndYm(MAUDP_RLBase panel) {
		return _util._isStEndYm(panel);
	}

	/**
	 * ベースキーの配列を取得します。ベースキーは開始年月以外のKey項目の配列です。
	 * 
	 * @param panel パネル
	 * @return ベースキーの配列
	 */
	public static String[] getBaseKey(MAUDP_RLBase panel) {
		return _util._getBaseKey(panel);
	}

	/**
	 * 開始年月終了年月の重複をチェックします。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndYmValid(MCList<R> l,
			String[] base_keys, MCMessageList ml) {
		_util._checkStEndYmValid(l, base_keys, ml, false);
	}

	/**
	 * 開始年月終了年月の重複をチェックし、補正します。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndYmValidAutoMod(MCList<R> l,
			String[] base_keys, MCMessageList ml) {
		_util._checkStEndYmValid(l, base_keys, ml, true);
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
	 * @param panel パネル
	 * @return 開始年月終了年月制御対象の画面の場合true
	 */
	protected boolean _isStEndYm(MAUDP_RLBase panel) {
		MCConstRow r = panel.getDtlL().createRow();
		return !(isNull(_getStYmClmPath(r)) || isNull(_getEndYmClmPath(r)));
	}

	/**
	 * ベースキーの配列を取得します。ベースキーは開始年月以外のKey項目の配列です。
	 * 
	 * @param panel パネル
	 * @return ベースキーの配列
	 */
	protected String[] _getBaseKey(MAUDP_RLBase panel) {
		String[] clms = panel.getDtlRKeyColumns();
		List<String> ret = new ArrayList<String>(Arrays.asList(clms));
		ret.remove(_getStYmClmPath(panel.getDtlL().createRow()));
		return ret.toArray(new String[0]);
	}

	/**
	 * 開始年月終了年月の重複をチェックします。
	 * チェックした上で補正します。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 * @param  メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndYmValid(MCList<R> l, String[] base_keys,
			MCMessageList ml, boolean auto_mod) {
		String st_ym_clm = _getStYmClmPath(l.createRow());
		String end_ym_clm = _getEndYmClmPath(l.createRow());
		Set<List<Comparable>> val_set = _getBaseKeySet(l, base_keys);
		MCIndexKey idx = l.createIndex(base_keys);
		for (List<Comparable> val : val_set) {
			_checkStEndYmValid(l.subList(idx, val.toArray(new Comparable[0])), st_ym_clm,
					end_ym_clm, ml, auto_mod);
		}
	}

	/**
	 * ベースキーの値のセットを取得します。
	 * 
	 * @param l リスト
	 * @param base_keys ベースキー
	 * @return ベースキーの値のセット
	 */
	protected <R extends MCRow> Set<List<Comparable>> _getBaseKeySet(MCList<R> l,
			String[] base_keys) {
		Set<List<Comparable>> val_set = new HashSet<List<Comparable>>();
		for (MCRow r : l) {
			List<Comparable> vals = new ArrayList<Comparable>();
			for (String key : base_keys) {
				vals.add(r.getValue(key));
			}
			val_set.add(vals);
		}
		return val_set;
	}

	/**
	 * 開始年月終了年月の重複をチェックします。
	 * 
	 * @param l Listコンテナ
	 * @param st_dt_clm 開始年月のカラムパス
	 * @param end_dt_clm 終了年月のカラムパス
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 */
	protected <R extends MCRow> void _checkStEndYmValid(MCList<R> l, String st_ym_clm,
			String end_ym_clm, MCMessageList ml, boolean auto_mod) {
		if (l.size() < 2) {
			return;
		}
		l.sort(st_ym_clm);
		for (int i = 0; i < l.size(); i++) {
			MCRow r = l.get(i);
			for (int j = i + 1; j < l.size(); j++) {
				MCRow s = l.get(j);
				_checkStEndYmValid(r, s, st_ym_clm, end_ym_clm, ml, auto_mod);
			}
		}
	}

	/**
	 * 開始年月終了年月の重複をチェックします。
	 * 
	 * @param r 比較対象１
	 * @param s 比較対象２
	 * @param st_dt_clm 開始年月のカラムパス
	 * @param end_dt_clm 終了年月のカラムパス
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 */
	protected <R extends MCRow> void _checkStEndYmValid(R r, R s, String st_ym_clm,
			String end_ym_clm, MCMessageList ml, boolean auto_mod) {
		MCDate st_ym1 = r.getDate(st_ym_clm);
		MCDate end_ym1 = r.getDate(end_ym_clm);
		MCDate st_ym2 = s.getDate(st_ym_clm);
		MCDate end_ym2 = s.getDate(end_ym_clm);

		// nullの場合はチェックしない
		if (isNull(st_ym1) || isNull(end_ym1) || isNull(st_ym2) || isNull(end_ym2)) {
			return;
		}
		if (end_ym2.ltDate(st_ym1) || st_ym2.gtDate(end_ym1)) {
			return;
		}

		// 自動調整
		else if (auto_mod) {
			// 開始年月が同じ場合は何もしない
			if (isSame(r.getDate(st_ym_clm), s.getDate(st_ym_clm))) {
				ml.add(new MCMessage(r, null, MAUCP0064, r.getGUIIndex() + 1, s
						.getGUIIndex() + 1));
			}
			// 開始年月が違う場合は、前レコードの終了年月を開始年月の1月前にし、ステータス変更
			else {
				r.setDate(end_ym_clm, s.getDate(st_ym_clm).addMonth(-1));
				if (r.isStatusNone()) {
					r.setStatus(MCRow.MODIFY);
				}
				ml.add(new MCMessage(r, null, MAUCP0063, r.getGUIIndex() + 1, s
						.getGUIIndex() + 1));
			}
		}
		// 自動調整なし
		else {
			ml.add(new MCMessage(r, null, MAUCP0062, r.getGUIIndex() + 1,
					s.getGUIIndex() + 1));
		}
	}

	/**
	 * コンテナの開始年月のカラムパスを返します。
	 * 
	 * @param r コンテナ
	 * @return 開始年月のカラムパス
	 */
	protected String _getStYmClmPath(MCRow r) {
		String[] arr = r.getColumnPathArray();
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
	 * @param r コンテナ
	 * @return 終了年月のカラムパス
	 */
	protected String _getEndYmClmPath(MCRow r) {
		String[] arr = r.getColumnPathArray();
		for (String s : arr) {
			if (isSame(s, getEndYmClm()) || s.endsWith(getEndYmClmPathSufix())) {
				return s;
			}
		}
		return null;
	}

}