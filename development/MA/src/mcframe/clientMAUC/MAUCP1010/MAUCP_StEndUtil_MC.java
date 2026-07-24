package mcframe.clientMAUC.MAUCP1010;

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
import java.util.HashSet;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.commonCore.container.MCIndexKey;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_StEndUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_StEndUtil_MC extends MAUCP_StEndUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final MAUCP_StEndUtil _util = new MAUCP_StEndUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_StEndUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 開始日終了日制御対象のマスタ画面かどうかを返します。
	 * 
	 * @param panel パネル
	 * @return 開始日終了日制御対象のマスタ画面の場合true
	 */
	public static boolean isStEndDt(MAUDP_RLBase panel) {
		return _util._isStEndDt(panel);
	}
	
	/**
	 * ベースキーの配列を取得します。ベースキーは開始日以外のKey項目の配列です。
	 * 
	 * @param panel パネル
	 * @return ベースキーの配列
	 */
	public static String[] getBaseKey(MAUDP_RLBase panel) {
		return _util._getBaseKey(panel);
	}
	
	/**
	 * 開始日終了日の重複をチェックします。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndDtValid(MCList<R> l, String[] base_keys, MCMessageList ml) {
		_util._checkStEndDtValid(l, base_keys, ml, false);
	}
	
	/**
	 * 開始日終了日の重複をチェックし、補正します。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 */
	public static <R extends MCRow> void checkStEndDtValidAutoMod(MCList<R> l, String[] base_keys, MCMessageList ml) {
		_util._checkStEndDtValid(l, base_keys, ml, true);
	}
	
	/**
	 * 開始日の項目名
	 * 
	 */
	protected static final String $ST_DT_CLM = "st_dt";
	
	/**
	 * 終了日の項目名
	 * 
	 */
	protected static final String $END_DT_CLM = "end_dt";
	
	/**
	 * 開始日の項目名
	 * 
	 */
	protected static final String $ST_DT_CLM_PATH_SUFIX = ".st_dt";
	
	/**
	 * 終了日の項目名
	 * 
	 */
	protected static final String $END_DT_CLM_PATH_SUFIX = ".end_dt";
	
	
	/**
	 * 開始日終了日制御対象のマスタ画面かどうかを返します。
	 * 
	 * @param panel パネル
	 * @return 開始日終了日制御対象のマスタ画面の場合true
	 */
	protected boolean _isStEndDt(MAUDP_RLBase panel) {
		MCConstRow r = panel.getDtlL().createRow();
		String[] arr = r.getColumnPathArray();
		boolean boo = false;
		for (String s :arr) {
			if (isSame(s, $ST_DT_CLM) || s.endsWith($ST_DT_CLM_PATH_SUFIX)) {
				boo = true;
			}
		}
		if (!boo) {
			return false;
		}
		
		for (String s :arr) {
			if (isSame(s, $END_DT_CLM) || s.endsWith($END_DT_CLM_PATH_SUFIX)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * ベースキーの配列を取得します。ベースキーは開始日以外のKey項目の配列です。
	 * 
	 * @param panel パネル
	 * @return ベースキーの配列
	 */
	protected String[] _getBaseKey(MAUDP_RLBase panel) {
		String[] clms = panel.getDtlRKeyColumns();
		List<String> ret = new ArrayList<String>();
		for (String clm :clms) {
			if (!(isSame(clm, $ST_DT_CLM) || clm.endsWith($ST_DT_CLM_PATH_SUFIX))) {
				ret.add(clm);
			}
		}
		return ret.toArray(new String[0]);
	}
	
	/**
	 * 開始日終了日の重複をチェックします。
	 * チェックした上で補正します。
	 * 
	 * @param l Listコンテナ
	 * @param base_keys ベースキー
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 * @param  メッセージリスト
	 */
	protected <R extends MCRow> void _checkStEndDtValid(MCList<R> l, String[] base_keys, MCMessageList ml, boolean auto_mod) {
		String st_dt_clm = _getStDtClmPath(l.createRow());
		String end_dt_clm = _getEndDtClmPath(l.createRow());
		Set<List<Comparable>> val_set = _getModifyCreateBaseKeySet(l, base_keys);
		if (val_set.isEmpty()) {
			return;
		}
		MCIndexKey idx = l.createIndex(base_keys);
		for (List<Comparable> val :val_set) {
			_checkStEndDtValid(l.subList(idx, val.toArray(new Comparable[0])), st_dt_clm, end_dt_clm, ml, auto_mod);
		}
	}
	
	/**
	 * Modify と Create の Row のベースキーの値のセットを取得します。
	 * 
	 * @param l リスト
	 * @param base_keys ベースキー
	 * @return ベースキーの値のセット
	 */
	protected <R extends MCRow> Set<List<Comparable>> _getModifyCreateBaseKeySet(MCList<R> l, String[] base_keys) {
		Set<List<Comparable>> val_set = new HashSet<List<Comparable>>();
		for (MCRow r : l) {
			if (r.isStatusNone()) {
				continue;
			}
			List<Comparable> vals = new ArrayList<Comparable>();
			for (String key :base_keys) {
				// key項目のNULL_VAL文字項目がnullだった場合にNULL文字を設定する
//				if (r.getValue(key) == null) {
//					r.setValue(key, MAC_STR.NULL_VAL.value());
//				}
				vals.add(r.getValue(key));
			}
			val_set.add(vals);
		}
		return val_set;
	}
	
	/**
	 * 開始日終了日の重複をチェックします。
	 * 
	 * @param l Listコンテナ
	 * @param st_dt_clm 開始日のカラムパス
	 * @param end_dt_clm 終了日のカラムパス
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 */
	protected <R extends MCRow> void _checkStEndDtValid(MCList<R> l
		, String st_dt_clm, String end_dt_clm, MCMessageList ml, boolean auto_mod) {
		if (l.size() < 2) {
			return;
		}
		l.sort(st_dt_clm);
		for (int i = 0; i < l.size(); i++) {
			MCRow r = l.get(i);
			for (int j = i + 1; j < l.size(); j++) {
				MCRow s = l.get(j);
				_checkStEndDtValid(r, s, st_dt_clm, end_dt_clm, ml, auto_mod);
			}
		}
	}
	
	/**
	 * 開始日終了日の重複をチェックします。
	 * 
	 * @param r 比較対象１
	 * @param s 比較対象２
	 * @param st_dt_clm 開始日のカラムパス
	 * @param end_dt_clm 終了日のカラムパス
	 * @param ml メッセージリスト
	 * @param auto_mod 自動調整する場合はtrue
	 */
	protected <R extends MCRow> void _checkStEndDtValid(R r, R s, String st_dt_clm, String end_dt_clm, MCMessageList ml, boolean auto_mod) {
		MCDate st_dt1 = r.getDate(st_dt_clm);
		MCDate end_dt1 = r.getDate(end_dt_clm);
		MCDate st_dt2 = s.getDate(st_dt_clm);
		MCDate end_dt2 = s.getDate(end_dt_clm);
		
		// nullの場合はチェックしない
		if (isNull(st_dt1) || isNull(end_dt1) || isNull(st_dt2) || isNull(end_dt2)) {
			return;
		}
		if (end_dt2.ltDate(st_dt1) || st_dt2.gtDate(end_dt1)) {
			return;
		}
		
		// 自動調整
		else if (auto_mod) {
			// 開始日が同じ場合は何もしない
			if (isSame(r.getDate(st_dt_clm), s.getDate(st_dt_clm))) {
				ml.add(new MCMessage(r, null, MAUCP0333, r.getGUIIndex() + 1, s.getGUIIndex() + 1));
			}
			// 開始日が違う場合は、前レコードの終了日を開始日の1日前にし、ステータス変更
			else {
				r.setDate(end_dt_clm, s.getDate(st_dt_clm).addDay(-1));
				if (r.isStatusNone()) {
					r.setStatus(MCRow.MODIFY);
				}
				ml.add(new MCMessage(r, null, MAUCP0332, r.getGUIIndex() + 1, s.getGUIIndex() + 1));
			}
		}
		// 自動調整なし
		else {
			ml.add(new MCMessage(r, null, MAUCP0331, r.getGUIIndex() + 1, s.getGUIIndex() + 1));
		}
	}
	
	/**
	 * コンテナの開始日のカラムパスを返します。
	 * 
	 * @param r コンテナ
	 * @return 開始日のカラムパス
	 */
	protected String _getStDtClmPath(MCRow r) {
		String[] arr = r.getColumnPathArray();
		for (String s :arr) {
			if (isSame(s, $ST_DT_CLM) || s.endsWith($ST_DT_CLM_PATH_SUFIX)) {
				return s;
			}
		}
		return null;
	}
	
	/**
	 * コンテナの終了日のカラムパスを返します。
	 * 
	 * @param r コンテナ
	 * @return 終了日のカラムパス
	 */
	protected String _getEndDtClmPath(MCRow r) {
		String[] arr = r.getColumnPathArray();
		for (String s :arr) {
			if (isSame(s, $END_DT_CLM) || s.endsWith($END_DT_CLM_PATH_SUFIX)) {
				return s;
			}
		}
		return null;
	}

}