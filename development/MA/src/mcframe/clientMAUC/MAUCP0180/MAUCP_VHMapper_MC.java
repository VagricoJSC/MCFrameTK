package mcframe.clientMAUC.MAUCP0180;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import mcframe.clientCore.beans.MCCheckBox;
import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.event.MCEventInfo;
import mcframe.clientCore.event.MCLCBeans;
import mcframe.clientCore.event.MCLCListener;
import mcframe.clientCore.event.MCNCBeans;
import mcframe.clientCore.event.MCNCListener;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCSortPolicy;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.util.MCCollectionUtil;

/**
 * 縦横変換処理を実行する共通クラスです。
 * 
 * Vは縦リスト（通信用非表示リスト）のロウ、Hは横テーブル（画面表示テーブル）のリストのロウです。
 */
public abstract class MAUCP_VHMapper_MC<V extends MCConstRow, H extends MCConstRow> {

	/**
	 * 実装仕様書に定義する属性「VH_KEY」です。
	 */
	protected static final String VH_KEY = "VH_KEY";

	/**
	 * 実装仕様書に定義する属性「VH_SUM」です。
	 */
	protected static final String VH_SUM = "VH_SUM";

	/**
	 * 実装仕様書に定義する属性「VH_SUM_ORDER」です。
	 */
	protected static final String VH_SUM_ORDER = "VH_SUM_ORDER";

	/**
	 * 実装仕様書に定義する属性「VH_DISP_COL」です。
	 */
	protected static final String VH_DISP_COL = "VH_DISP_COL";

	/**
	 * 実装仕様書に定義する属性「VH_DISP_GRP」です。
	 */
	protected static final String VH_DISP_GRP = "VH_DISP_GRP";

	/**
	 * 実装仕様書に定義する属性「VH_DISP_IDX」です。
	 */
	protected static final String VH_DISP_IDX = "VH_DISP_IDX";

	/**
	 * 実装仕様書に定義する属性値「ELM」です。
	 */
	protected static final String ELM = "ELM";

	/**
	 * 実装仕様書に定義する属性値「HVAL」です。
	 */
	protected static final String HVAL = "HVAL";

	/**
	 * 実装仕様書に定義する属性値「HKEY」です。
	 */
	protected static final String HKEY = "HKEY";

	/**
	 * 横リストのレコードＩＤの項目名です。
	 */
	public static final String RECORD_ID = "record_id";

	/**
	 * 横リストのレコードグループＩＤの項目名です。
	 */
	public static final String RECORD_GRP_ID = "record_grp_id";

	/**
	 * 横リストのrow_title_colカラムの項目名です。
	 */
	public static final String ROW_TITLE_COL = "row_title_col";

	/**
	 * 横リストのrow_title_nmカラムの項目名です。
	 */
	public static final String ROW_TITLE_NM = "row_title_nm";

	/**
	 * 合計行のレコードグループＩＤの値です。
	 */
	protected static final int REC_GRP_ID_SUM_VAL = 999999;
	
	/**
	 * 可変カラムのラベル名を取得するための項目名です。
	 */
	public static final String ELM_LABEL = "elm_label";

	/**
	 * 可変カラムのメッセージ用名称を取得するための項目名です。
	 */
	public static final String ELM_MSG = "elm_msg";

	/**
	 * 画面です。
	 */
	protected IfVHMapperPanel _panel;

	/**
	 * 横テーブルです。
	 */
	protected MCTable<H> _hTable;

	/**
	 * 縦リストです。
	 */
	protected MCList<V> _vList;
	
	/**
	 * キー項目です。
	 */
	protected String[] _keys;

	/**
	 * 横テーブルのrow_title_colに使用する、縦リストの項目名です。
	 */
	protected String[] _rtVCols;

	/**
	 * 横テーブルのrow_title_nmに使用する、縦リストの項目名です。
	 */
	protected String[] _rtVLbls;

	/**
	 * 可変カラム（col_00～col_??）の項目です。
	 */
	protected String[] _elmCols;

	/**
	 * 可変カラムに対応する縦リストの項目です。
	 * この配列の要素数を利用中の可変カラム数とみなします。
	 */
	protected Comparable<?>[] _elmVals;
	
	/**
	 * 可変カラムのラベル名です。
	 */
	protected String[] _elmLabels;

	/**
	 * 可変カラムのメッセージ用名称です。
	 */
	protected String[] _elmMsgs;

	/**
	 * 集計項目と集計対象項目のマップです。
	 */
	protected Map<String, List<String>> _hSumMap;

	/**
	 * 可変カラムです。
	 */
	protected MCColumnConfig[] _elmColumns;

	/**
	 * 横展開キーです。
	 */
	protected String _elmCol;

	/**
	 * 横展開キーを設定します。
	 *
	 * @param col 横展開キー
	 */
	public void setElmCol(String col) {
		_elmCol = col;
	}

	/**
	 * Key項目を設定する
	 * 
	 * @param keys 可変長引数
	 */
	public void setKeys(String... keys) {
		_keys = keys;
	}

	/**
	 * 指定されたロウの属性値が設定されている項目を返します。
	 *
	 * @param row ロウ
	 * @param grp 属性
	 * @param val 属性値
	 * @return 項目名
	 */
	protected String[] getExtCols(MCConstRow row, String grp, String val) {
		if (row.getExtGroups().contains(grp)) {
			Map<String, String> map = row.getExtMap(grp);
			return row.getKeys(grp).stream().filter(k -> val.equals(map.get(k)))
					.collect(Collectors.toList()).toArray(new String[0]);
		}
		return new String[0];
	}
	
	/**
	 * 画面、横テーブル、縦リストを設定します。
	 * 横テーブルや縦リストのロウでグルーピングされている項目の設定を行います。
	 *
	 * @param panel 画面
	 * @param hTable 横テーブル
	 * @param vList 縦リスト
	 */
	public void initColGroup(IfVHMapperPanel panel, MCTable<H> hTable,
			MCList<V> vList) {
		_panel = panel;
		_hTable = hTable;
		_vList = vList;

		_cacheHAllL = _hTable.getList().createInstance();

		V v = _vList.createRow();
		setElmCol(getExtCols(v, VH_KEY, ELM)[0]);
		_rtVCols = getExtCols(v, VH_KEY, HVAL);
		setKeys(getExtCols(v, VH_KEY, HKEY));

		// 横リストの情報
		H h = _hTable.getList().createRow();

		// 可変カラムの項目名
		_elmCols = getExtCols(h, VH_KEY, ELM);

		// 可変カラム
		MCColumnConfig[] elmColumns = new MCColumnConfig[_elmCols.length];
		for (int i = 0; i < _elmCols.length; i++) {
			elmColumns[i] = getColumnConfig(_elmCols[i]);
		}
		_elmColumns = elmColumns;

		setReflectHVWhenElmColValueChanged(true);

		// 集計カラム
		initSumColInfo(h);

		// キーの表示用項目
		initDispColInfo(h);
	}
	
	protected MCColumnConfig getColumnConfig(String baseRowColumnName) {
		for (MCColumnConfig column : _hTable.getColumnConfigs()) {
			if (baseRowColumnName.equals(column.getBaseRowColumnName())) {
				return column;
			}
		}
		return null;
	}
	
	/**
	 * 縦横変換のカラム情報の初期設定を行います。
	 * 引数 list のロウには以下の項目を設定してください。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td> {@link #getElmCol()} </td><td>横展開キーの値</td></tr>
	 * <tr><td> {@link #ELM_LABEL} </td><td>可変カラムのラベル名</td></tr>
	 * <tr><td> {@link #ELM_MSG} </td><td>可変カラムのメッセージ用名称。未設定時は {@link #ELM_LABEL} が採用される。</td></tr>
	 * </table>
	 *
	 * @param list 横展開キーのリスト
	 */
	public void initColInfo(MCList<? extends MCRow> list) {
		int size = list.size();
		Comparable<?>[] elmVal = new Comparable<?>[size];
		String[] elmLabels = new String[size];
		String[] elmMsgs = new String[size];
		for (int i = 0; i < size; i++) {
			MCRow o = list.get(i);

			// 横展開キー
			elmVal[i] = o.getValueNE(_elmCol);
			// 可変カラムのラベル名
			elmLabels[i] = MCStringUtil.nullToBlank(o.getStringNE(ELM_LABEL));
			// 可変カラムのメッセージ用名称
			if (o.contains(ELM_MSG)) {
				elmMsgs[i] = MCStringUtil.nullToBlank(o.getStringNE(ELM_MSG));
			}
			else {
				elmMsgs[i] = elmLabels[i];
			}
		}

		_elmVals = elmVal;
		_elmLabels = elmLabels;
		_elmMsgs = elmMsgs;
	}
	
	/**
	 * 集計項目に関する情報を初期化します。
	 *
	 * @param tempH 初期化で使用する横リストの情報
	 */
	protected void initSumColInfo(H tempH) {
		_hSumMap = new LinkedHashMap<>();

		if (!tempH.getExtGroups().contains(VH_SUM)) {
			return;
		}
		Map<String, String> vhSumMap = tempH.getExtMap(VH_SUM);
		if (vhSumMap.isEmpty()) {
			return;
		}

		Map<String, List<String>> tempSumMap = new LinkedHashMap<>();
		for (String k : tempH.getKeys(VH_SUM)) {
			String val = vhSumMap.get(k);
			if (!tempSumMap.containsKey(val)) {
				tempSumMap.put(val, new ArrayList<>());
			}
			tempSumMap.get(val).add(k);
		}

		String[] tempSumCols = new String[tempSumMap.size()];
		int[] tempSumOrders = new int[tempSumMap.size()];
		if (tempH.getExtGroups().contains(VH_SUM_ORDER)) {
			for (int i = 0; i < tempSumOrders.length; i++) {
				tempSumOrders[i] = -1;
			}
			
			Map<String, String> vhSumOrderMap = tempH.getExtMap(VH_SUM_ORDER);
			for (String k : tempSumMap.keySet()) {
				int order = 0;
				if (vhSumOrderMap.containsKey(k)) {
					try {
						order = Math.max(0, Integer.parseInt(vhSumOrderMap.get(k)));
					}
					catch (NumberFormatException e) {
						order = 0;
					}
				}
				
				int pos = 0;
				for (; pos < tempSumOrders.length; pos++) {
					int o = tempSumOrders[pos];
					if (o < 0 || o > order) {
						break;
					}
				}
				tempSumOrders[pos] = order;
				tempSumCols[pos] = k;
			}
		}
		else {
			tempSumCols = tempSumMap.keySet().toArray(new String[0]);
			for (int i = 0; i < tempSumOrders.length; i++) {
				tempSumOrders[i] = 0;
			}
		}
		
		for (String k : tempSumCols) {
			_hSumMap.put(k, tempSumMap.get(k));
		}
	}
	
	/**
	 * キーの表示用項目に関する情報を初期化します。
	 *
	 * @param tempH 初期化で使用する横リストの情報
	 */
	protected void initDispColInfo(H tempH) {
		_hDispMap = new HashMap<>();
		
		Map<String, String> vhRTColMap = tempH.getExtMap(VH_DISP_COL);
		if (vhRTColMap == null || vhRTColMap.isEmpty()) {
			return;
		}
		
		Map<String, List<String>> tempDispMap = new LinkedHashMap<>();
		
		for (String k : tempH.getKeys(VH_DISP_COL)) {
			String val = vhRTColMap.get(k);
			if (!tempDispMap.containsKey(val)) {
				tempDispMap.put(val, new ArrayList<>());
			}
			tempDispMap.get(val).add(k);
		}
		
		Map<String, String> vhRTGrpMap = tempH.getExtMap(VH_DISP_GRP);
		Map<String, String> vhRTIdxMap = tempH.getExtMap(VH_DISP_IDX);
		MCKeyList grpCols = tempH.getKeys(VH_DISP_GRP);
		MCKeyList idxCols = tempH.getKeys(VH_DISP_IDX);
		for (String k : tempDispMap.keySet()) {
			List<DispColInfo> dispColInfos = new ArrayList<>();
			if (grpCols != null && !grpCols.isEmpty()) {
				for (String col : tempDispMap.get(k)) {
					int grp = 0;
					if (grpCols.contains(col)) {
						try {
							// 負数を指定された場合は0とみなす
							grp = Math.max(0,
									Integer.parseInt(vhRTGrpMap.get(col)));
						}
						catch (NumberFormatException e) {
							// 数値以外を指定された場合は0とみなす
							grp = 0;
						}
					}
					int idx = 0;
					if (idxCols != null && idxCols.contains(col)) {
						try {
							// 負数を指定された場合は0とみなす
							idx = Math.max(0,
									Integer.parseInt(vhRTIdxMap.get(col)));
						}
						catch (NumberFormatException e) {
							// 数値以外を指定された場合は0とみなす
							idx = 0;
						}
					}
					dispColInfos.add(new DispColInfo(col, grp, idx));
				}
			}
			else {
				for (String col : tempDispMap.get(k)) {
					dispColInfos.add(new DispColInfo(col, 0, 0));
				}
			}

			dispColInfos.sort(createDispColInfoSortComparator());

			List<String[]> dispCols = new ArrayList<>();
			List<String> sameGrpCols = new ArrayList<>();
			int grp = -1;
			for (DispColInfo info : dispColInfos) {
				if (grp != info._disp_grp) {
					if (!sameGrpCols.isEmpty()) {
						dispCols.add(sameGrpCols.toArray(new String[0]));
						sameGrpCols.clear();
					}

					sameGrpCols.add(info._disp_col);
					grp = info._disp_grp;
				}
				else {
					sameGrpCols.add(info._disp_col);
				}
			}

			if (!sameGrpCols.isEmpty()) {
				dispCols.add(sameGrpCols.toArray(new String[0]));
				sameGrpCols.clear();
			}

			_hDispMap.put(k, dispCols);
		}
	}
	
	/**
	 * 画面表示テーブルのRowTitleに使用するカラム名とラベル名を設定します。
	 *
	 * @param map 画面表示テーブルのRowTitleに使用するカラム名とラベル名のマップ
	 */
	public void setRowTitles(LinkedHashMap<String, String> map) {
		_rtVCols = map.keySet().toArray(new String[0]);
		_rtVLbls = map.values().toArray(new String[0]);
	}

	/**
	 * 横ロウに対応する縦ロウを返します。
	 *
	 * @param h 横ロウ
	 * @param elmCol 横ロウの値が変更されたカラム名
	 * @param vL 縦リスト
	 * @return 縦ロウ。縦ロウが見つからなかった場合は null
	 */
	public V getVRow(H h, String elmCol, MCList<V> vL) {
		// 値が変更された横ロウの日付から対応する縦ロウを見つける
		Comparable<?> elmVal = elmColToElmVal(elmCol);
		for (V v : vL.subList(_keys, h)) {
			if (isSame(elmVal, v.getValue(_elmCol))) {
				return v;
			}
		}
		return null;
	}

	/**
	 * 可変カラムにラベル名とメッセージ用名称を設定します。
	 */
	protected void setElmColsLabel() {
		for (int i = 0; i < _elmLabels.length; i++) {
			_elmColumns[i].setHeaderName(_elmLabels[i]);
			_elmColumns[i].setMessageName(_elmMsgs[i]);
		}
	}
	
	/**
	 * 可変カラムのラベル名とメッセージ用名称をクリアします。
	 */
	public void clearElmColsLabel() {
		for (MCColumnConfig c : _elmColumns) {
			c.setHeaderName("");
			c.setMessageName("");
		}
	}

	/**
	 * 縦横変換を行います。
	 * 縦リストのデータを横リストにコピーします（テーブルデータの初期化とデータ作成）。
	 *
	 * @param vL 縦リスト
	 * @param hL 横リスト
	 */
	public void convertVH(MCList<V> vL, MCList<H> hL) {
		V prevVRow = null;
		MCIndexKey idx = vL.createIndex(_keys);
		MCList<H> tempHL = hL.createInstance();
		int recGrpNum = 0;
		for (Iterator<V> i = vL.iterator(idx); i.hasNext();) {
			V v = i.next();
			// キー項目の変更あり
			// 編集していた値を結果のインスタンスへ移動させる
			if (!v.equalColumns(prevVRow, _keys)) {
				hL.addAll(tempHL);
				// 新しいkeyにする
				initTempHL(tempHL, v, recGrpNum++);
			}
			putElms(tempHL, v);
			prevVRow = v;
		}
		// 最後のkeyのListを追加
		hL.addAll(tempHL);

		setElmColsLabel();
	}
	
	/**
	 * 横ロウの情報です。
	 */
	public class HRowInfo {
		
		protected H _h;
		protected String _col;
		
		protected HRowInfo(H h, String col) {
			_h = h;
			_col = col;
		}
		
		/**
		 * 横ロウを返します。
		 * 
		 * @return 横ロウ
		 */
		public H row() {
			return _h;
		}
		
		/**
		 * 横ロウのカラム名を返します。
		 * 
		 * @return 横ロウのカラム名
		 */
		public String col() {
			return _col;
		}
	}
	
	/**
	 * 縦ロウに対応する横ロウの情報を返します。
	 * 
	 * @param v 縦ロウ
	 * @param col カラム名
	 * @param hL 横リスト
	 * @return 縦ロウに対応する横ロウの情報。横ロウが見つからなかった場合は null
	 */
	public HRowInfo getHRow(V v, String col, MCList<H> hL) {
		for (int i = 0; i < _elmVals.length; i++) {
			// 横展開キーで絞り込む
			if (isSame(v.getValue(_elmCol), _elmVals[i])) {
				// キー項目で絞り込む
				MCList<H> grp = hL.subList(_keys, v);
				for (H h : grp) {
					// ROW_TITLE_COLをチェックする
					if (isSame(col, h.getString(ROW_TITLE_COL))) {
						return new HRowInfo(h, _elmCols[i]);
					}
				}
			}
		}
		return null;
	}

	/**
	 * 横リストの編集されたセルの値を縦リストにコピーします。
	 *
	 * @param vL 縦リスト
	 * @param editH 横リストの編集されたロウ
	 * @param editCol 横リストの編集されたカラム名
	 */
	public void reflectHV(MCList<V> vL, H editH, String editCol) {
		// 横リストの編集されたセルに対応する縦ロウを取得する
		V v = getVRow(editH, editCol, vL);

		// 横リストの編集された値を縦リストのセルにコピーする
		String name = editH.getString(ROW_TITLE_COL);
		if (MCCollectionUtil.contains(name, _rtVCols)) {
			v.setValue(name, editH.getValue(editCol));
			if (v.isStatusGUICreate()) {
				v.setStatus(MCConstRow.CREATE);
			}
			else if (!v.isStatusCreate()) {
				v.setStatus(MCConstRow.MODIFY);
			}
		}
	}

	/**
	 * 縦リストの特定の項目の情報（キー項目で絞り込み）を横リストにコピーします。
	 * このメソッドはイベント処理で使用されることを前提としています。
	 *
	 * @param vL 縦リスト
	 * @param hL　横リスト
	 * @param editH 編集対象のキーの値が格納された横ロウ
	 * @param tgCols 縦リストのコピー対象のカラム名
	 */
	public void reflectVH(MCList<V> vL, MCList<H> hL, H editH, String... tgCols) {
		// editHに対応する縦リストを取得する
		MCList<V> editedVList = vL.subList(_keys, editH);

		for (String n : tgCols) {
			// コピー対象の横リストを取得する
			// (editHのkey項目と一致することが前提。record_grp_cdが一致するものでもよい。)
			MCIndexKey idx = hL.createIndex(RECORD_GRP_ID, ROW_TITLE_COL);
			H h = hL.getFirst(idx, editH.getNumber(RECORD_GRP_ID), n);

			for (V v : editedVList) {
				for (int i = 0; i < _elmVals.length; i++) {
					if (isSame(v.getValue(_elmCol), _elmVals[i])) {
						h.setNumber(_elmCols[i], v.getNumber(n));
					}
				}
			}
		}
	}

	/**
	 * 横リストに行を追加します。縦の行の値をコピーするための行を追加します。
	 *
	 * @param tempHL 横リスト
	 * @param v 縦の行
	 * @param recGrpNum レコードグループＩＤ
	 */
	protected void initTempHL(MCList<H> tempHL, V v, int recGrpNum) {
		tempHL.clear();

		for (int i = 0; i < _rtVCols.length; i++) {
			H h = tempHL.createRow();
			// row_title_colがnullの場合はKey項目を設定しない
			if (!isNull(_rtVCols[i])) {
				for (String k : _keys) {
					h.setValueNE(k, v.getValue(k));
				}
			}
			h.setNumberNE(RECORD_GRP_ID, recGrpNum);
			h.setNumberNE(RECORD_ID, i);
			h.setStringNE(ROW_TITLE_COL, _rtVCols[i]);
			h.setStringNE(ROW_TITLE_NM, _rtVLbls[i]);
			tempHL.add(h);
		}
	}

	/**
	 * 横リストに縦の行の値をコピーします。
	 *
	 * @param tempHL 横リスト
	 * @param v 縦の行
	 */
	protected void putElms(MCList<H> tempHL, V v) {
		String elmCol = elmValToElmCol(v.getValue(_elmCol));
		if (elmCol == null) {
			return;
		}

		for (int i = 0; i < _rtVCols.length; i++) {
			H h = tempHL.get(i);
			String col = h.getString(ROW_TITLE_COL);
			// 空行はスキップする
			if (col != null) {
				h.setValueNE(elmCol, v.getValue(col));
			}
		}
	}

	/**
	 * 画面表示テーブルの可変カラムのカラム名を取得します。
	 *
	 * @param elmVal 画面表示テーブルの可変カラムのラベル名
	 * @return 画面表示テーブルの可変カラムのカラム名、または null
	 */
	protected String elmValToElmCol(Comparable<?> elmVal) {
		for (int i = 0; i < _elmVals.length; i++) {
			if (isSame(_elmVals[i], elmVal)) {
				return _elmCols[i];
			}
		}
		return null;
	}

	/**
	 * 画面表示テーブルの可変カラムのラベル名を取得します。
	 *
	 * @param elmCol 画面表示テーブルの可変カラムのカラム名
	 * @return elmVal 画面表示テーブルの可変カラムのラベル名、または null
	 */
	protected Comparable<?> elmColToElmVal(String elmCol) {
		for (int i = 0; i < _elmVals.length; i++) {
			if (isSame(_elmCols[i], elmCol)) {
				return _elmVals[i];
			}
		}
		return null;
	}

	/**
	 * 可変カラムの使用部分のモードを設定します。
	 * 未使用部分のモードを {@link MCMode#INVISIBLE} に設定します。
	 */
	public void setUsedElmColumnMode(MCMode mode) {
		for (int i = 0; i < _elmVals.length; i++) {
			_elmColumns[i].setMode(mode);
		}
		setUnusedElmColumnModeInvisible();
	}
	
	/**
	 * 可変カラムの未使用部分のモードを {@link MCMode#INVISIBLE} に設定します。
	 */
	public void setUnusedElmColumnModeInvisible() {
		for (int i = _elmVals.length; i < _elmCols.length; i++) {
			_elmColumns[i].setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 全ての可変カラムのモードを {@link MCMode#INVISIBLE} に設定します。
	 */
	public void setAllElmColumnModeInvisible() {
		for (MCColumnConfig c : _elmColumns) {
			c.setMode(MCMode.INVISIBLE);
		}
	}
	
	/**
	 * 指定されたカラムが可変カラムかどうか判定します。
	 *
	 * @param column カラム
	 * @return 指定されたカラムが可変カラムの場合は true。可変カラムではない場合は false。
	 */
	public boolean isElmCol(MCColumnConfig column) {
		return MCCollectionUtil.contains(column, _elmColumns);
	}

	public void setReflectHVWhenElmColValueChanged(boolean sync) {
		MCLCListener listener = getElmColLCListener();
		for (MCColumnConfig c : _hTable.getColumnConfigs()) {
			if (isElmCol(c)) {
				c.removeLCListener(listener);
				if (sync) {
					MCLCListener[] lca = c.getLCListeners();
					for (MCLCListener lc : lca) {
						c.removeLCListener(lc);
					}
					c.addLCListener(listener);
					for (MCLCListener lc : lca) {
						c.addLCListener(lc);
					}
				}
			}
		}
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナです。
	 */
	protected MCLCListener _elm_col_lc;

	/**
	 * 可変カラムのLCイベントを検知するためのリスナを返します。
	 *
	 * @return 可変カラムのLCイベントを検知するためのリスナ
	 */
	protected MCLCListener getElmColLCListener() {
		return _elm_col_lc != null ? _elm_col_lc : (_elm_col_lc = createElmColLCListener());
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナを作成します。
	 *
	 * @return 可変カラムのLCイベントを検知するためのリスナ
	 */
	protected MCLCListener createElmColLCListener() {
		return new FXUCP_ElmColLCListener();
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナです。
	 */
	public class FXUCP_ElmColLCListener implements MCLCListener {

		@Override
		public void doLCEvent(MCLCBeans compo, MCEventInfo info) {
			elmColValueChanged(_hTable.getRow(info.getEventIndex()),
					(MCColumnConfig) compo);
		}

	}

	/**
	 * 可変カラムの値が変更された時の処理を実行します。
	 *
	 * @param h 値が変更された行
	 * @param column 可変カラム
	 */
	protected void elmColValueChanged(H h, MCColumnConfig column) {
		// 横テーブルの編集内容を縦リストに反映する
		reflectHV(_vList, h, column.getBaseRowColumnName());

		// 利用画面に変更を通知する
		// 合計行の有無によって集計処理の内容が変わるため、
		// 集計処理は利用画面側で実装する
		_panel.elmColValueChanged(h, column);
	}

	/**
	 * 横リストの縦方向の集計をします。
	 *
	 * @param hL 横リスト
	 * @param grpCols グループ化項目（レコードＩＤを除く）。レコードＩＤは無条件でグループ化項目となる。
	 * @return 集計結果を格納したリスト
	 */
	public MCList<H> getHSumList(MCList<H> hL, String... grpCols) {
		// 縦方向の合計を計算する
		MCGroupByPolicy gp = new MCGroupByPolicy(getGpColsForVSumList(hL, grpCols));
		gp.sum(_elmCols);
		MCList<H> hSumL = hL.groupBy(gp);

		// パラメータを設定する
		setSumLParam(hSumL);

		return hSumL;
	}

	/**
	 * 横リストの縦方向の集計をするためのグループ化項目を返します。
	 * groCols に指定された項目についてグループ化項目にできるかチェックし、
	 * グループ化項目にできる場合はグループ化項目に追加します。
	 *
	 * @param hL 横リスト
	 * @param grpCols グループ化項目（レコードＩＤを除く）
	 * @return 横リストの縦方向の集計をするためのグループ化項目
	 */
	protected String[] getGpColsForVSumList(MCList<H> hL, String... grpCols) {
		List<String> gpCols = new ArrayList<>();

		// レコードＩＤをグループ化項目に追加する
		gpCols.add(RECORD_ID);

		// 指定された項目は、横Listに項目が存在する、かつ、値が１種類の場合にグループ化項目に追加する
		for (String col : grpCols) {
			if (hasColAndOneVal(hL, col)) {
				gpCols.add(col);
			}
		}

		return gpCols.toArray(new String[0]);
	}

	/**
	 * 項目の存在チェックと値が１種類（nullは除く）であることのチェックを行います。
	 *
	 * @param hL 横リスト
	 * @param col カラム名
	 * @return 横リストに項目が存在する、かつ、項目の値が１種類（nullは除く）の場合は true。それ以外の場合は false。
	 */
	protected boolean hasColAndOneVal(MCList<H> hL, String col) {
		// 項目の存在をチェックする
		boolean found = false;
		for (String n : hL.getNameArray()) {
			if (isSame(n, col)) {
				found = true;
				break;
			}
		}
		if (!found) {
			return false;
		}

		// 項目の値が１種類であることをチェックする
		MCList<H> dpL = hL.clone();
		dpL.removeAll(dpL.subList(col, null));
		return dpL.groupBy(col).size() == 1;
	}

	/**
	 * 横リストに各種パラメータを設定します。
	 *
	 * @param sumL 横リスト
	 */
	protected void setSumLParam(MCList<H> sumL) {
		for (int i = 0; i < sumL.size(); i++) {
			H hR = sumL.get(i);

			// row_title_col, row_title_nm, レコードＩＤ, レコードグループＩＤを設定する
			// 合計行のレコードグループＩＤは 999999 とする
			hR.setString(ROW_TITLE_COL, _rtVCols[i]);
			hR.setString(ROW_TITLE_NM, _rtVLbls[i]);
			hR.setNumber(RECORD_ID, i);
			hR.setNumber(RECORD_GRP_ID, REC_GRP_ID_SUM_VAL);
		}
	}

	/**
	 * 横リストの縦方向の集計をします。
	 * 全ての可変カラムの項目について、縦方向の集計をします。
	 *
	 * @param hL 計算対象の横リスト
	 * @param hSumL 合計値を設定する横リスト
	 * @param rtHCol row_title_col
	 */
	public void calcVSum(MCList<H> hL, MCList<H> hSumL, String rtHCol) {
		// rowTitleが同じものを抽出
		MCList<H> sameRecIdL = hL.subList(ROW_TITLE_COL, rtHCol);

		// 抽出したListの合計を計算
		MCGroupByPolicy gp = new MCGroupByPolicy(ROW_TITLE_COL);
		gp.sum(_elmCols);
		H newSumR = sameRecIdL.groupBy(gp).get(0);

		// 合計用のListに変更された合計値を反映
		H oldSumR = hSumL.getFirst(ROW_TITLE_COL, rtHCol);
		for (int i = 0; i < _elmVals.length; i++) {
			oldSumR.setValue(_elmCols[i], newSumR.getNumber(_elmCols[i]));
		}
	}

	/**
	 * 横リストの縦方向の集計をします。
	 * editCol に指定された項目について、縦方向の集計をします。
	 *
	 * @param hL 計算対象の横リスト
	 * @param hSumL 合計値を設定する横リスト
	 * @param editH 編集したセルが属する行
	 * @param editCol 計算対象のカラム名
	 */
	public void calcVSum(MCList<H> hL, MCList<H> hSumL, H editH, String editCol) {
		// 編集されたRowTitleColを取得
		String rtHCol = editH.getString(ROW_TITLE_COL);

		List<MCNumber> nums = hL.subList(ROW_TITLE_COL, rtHCol).getNumber(editCol);
		MCNumber sum = MCNumber.sum(nums.toArray(new MCNumber[nums.size()]));

		// 合計用のListに変更された合計値を反映
		hSumL.getFirst(ROW_TITLE_COL, rtHCol).setNumber(editCol, sum);
	}

	/**
	 * 横リストの横方向の集計をします。
	 *
	 * @param hL 集計対象のリスト
	 * @param skipCols 集計対象外のrow_title_col
	 */
	public void calcHSum(MCList<H> hL, String... skipCols) {
		MCList<H> target = (skipCols == null || skipCols.length == 0) ? hL : hL
				.subList(createExceptRowMatcher(skipCols));
		for (H h : target) {
			if (!isNull(h.getString(ROW_TITLE_COL))) {
				calcHSumRow(h);
			}
		}
	}

	/**
	 * 指定された行の横方向の集計をします。
	 *
	 * @param h 集計対象行
	 */
	protected void calcHSumRow(H h) {
		for (String k : _hSumMap.keySet()) {
			MCNumber sum = MCNumber.ZERO;
			for (String v : _hSumMap.get(k)) {
				sum = sum.add(nvl(h.getNumber(v), MCNumber.ZERO));
			}
			h.setNumber(k, sum);
		}
	}

	/**
	 * 指定された行の横方向の集計をします。
	 * 合わせて、対応する合計行の集計も行います。
	 *
	 * @param hSumL 合計行のリスト
	 * @param h 集計対象行
	 */
	public void calcHSum(MCList<H> hSumL, H h) {
		calcHSumRow(h);
		calcHSumRow(hSumL.getFirst(RECORD_ID, h.getNumber(RECORD_ID)));
	}

	/**
	 * 横リストの集計対象行を評価するためのMatcherを作成します。
	 *
	 * @param skipCols 集計対象から除外するrow_title_col
	 * @return 横リストの集計対象行を評価するためのMatcher
	 */
	protected ExceptRowMatcher createExceptRowMatcher(String... skipCols) {
		return new ExceptRowMatcher(skipCols);
	}

	/**
	 * 横リストの集計対象行を評価します。
	 * 横集計で利用します。
	 */
	public class ExceptRowMatcher implements MCRowMatcher<H> {

		/**
		 * 集計対象から除外するrow_title_colです。
		 */
		protected String[] _skipCols;

		/**
		 * コンストラクタです。
		 *
		 * @param skipCols 集計対象から除外するrow_title_col
		 */
		protected ExceptRowMatcher(String... skipCols) {
			_skipCols = skipCols != null ? skipCols : new String[0];
		}

		@Override
		public boolean match(H h) {
			for (String n : _skipCols) {
				if (isSame(h.getString(ROW_TITLE_COL), n)) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * 横テーブルをソートします。
	 *
	 * @param policy ソートの優先順位
	 * @return 横テーブルがソートされた場合は true。ソートされなかった場合は false。
	 */
	public boolean sortHTable(MCSortPolicy policy) {
		if (_hTable.getList().isEmpty()) {
			return false;
		}

		// 空行対策（ソート対象のカラムは１行前の値をセットしておく）
		List<H> emptyRows = new ArrayList<>();
		// ソート対象のカラム
		String[] orgSortCols = policy.nameArray();

		String[] dispCols = _hDispMap.keySet().toArray(new String[0]);
		Map<String, String[]> sortColMap = getSortColMap(orgSortCols);
		
		// ソート前処理
		beforeTableSort(dispCols, emptyRows, orgSortCols, sortColMap);

		// Policyの置換(disp_00カラム用)
		// ソート
		boolean result = _panel.sortHTable(_hTable,
				createTableSortPolicy(dispCols, policy, sortColMap));

		// ソート後処理
		afterTableSort(dispCols, emptyRows, orgSortCols, sortColMap);

		return result;
	}

	/**
	 * キーの表示用項目でソートするときに実際にソート対象となる項目のマップを返します。
	 *
	 * @param cols キーの表示用項目
	 * @return キー：キーの表示用項目。値：実際にソート対象となる項目。
	 */
	protected Map<String, String[]> getSortColMap(String... cols) {
		Map<String, String[]> result = new HashMap<>();
		for (String col : cols) {
			if (_hDispMap.containsKey(col)) {
				List<String> l = new ArrayList<>();
				for (String[] a : _hDispMap.get(col)) {
					l.addAll(Arrays.asList(a));
				}
				result.put(col, l.toArray(new String[0]));
			}
		}
		return result;
	}
	
	/**
	 * ソート前処理を実行します。
	 * 空行のソート対象項目に対して一つ上の行の値を設定します。
	 *
	 * @param dispCols キーの表示用項目
	 * @param emptyRows 空行
	 * @param orgSortCols ソート対象項目
	 * @param cols キーの表示用項目でソートするときに実際にソート対象となる項目
	 */
	protected void beforeTableSort(String[] dispCols, List<H> emptyRows,
			String[] orgSortCols, Map<String, String[]> sortColMap) {
		MCList<H> hL = _hTable.getList();

		// 空行対策
		// -> 空行のソート対象カラムにひとつ上の行の値をセットする
		// -> _afterPlnSortでセットしたカラムにNULLをセットする
		for (int idx = 0; idx < hL.size(); idx++) {
			H h = hL.get(idx);

			if (!isNull(h.getStringNE(ROW_TITLE_COL))) {
				continue;
			}

			// row_title_colがNULLの行を空行とみなす

			// 注：先頭行が「空行」はありえない
			H prev = hL.get(idx - 1);
			for (String col : orgSortCols) {
				if (sortColMap.containsKey(col)) {
					for (String c : sortColMap.get(col)) {
						h.setValue(c, prev.getValue(c));
					}
				}
				else {
					h.setValue(col, prev.getValue(col));
				}
			}
			emptyRows.add(h);
		}
	}

	/**
	 * 横テーブルをソートするためのMCSortPolicyを作成します。
	 *
	 * @param dispCols キーの表示用項目
	 * @param policy オリジナルのMCSortPolicy
	 * @param cols キーの表示用項目でソートするときに実際にソート対象となる項目
	 * @return 横テーブルをソートするためのMCSortPolicy
	 */
	protected MCSortPolicy createTableSortPolicy(String[] dispCols, MCSortPolicy policy,
			Map<String, String[]> sortColMap) {
		MCSortPolicy result = new MCSortPolicy();
		String[] na = policy.nameArray();
		SortType[] ya = policy.typeArray();
		for (int i = 0; i < policy.size(); i++) {
			String n = na[i];
			SortType y = ya[i];
			if (sortColMap.containsKey(n)) {
				for (String c : sortColMap.get(n)) {
					result.add(y, c);
				}
			}
			else {
				result.add(y, n);
			}
		}

		// 「１つのかたまり」で順番が狂わないようにする
		policy.add(MCList.SortType.ASC, RECORD_ID);

		return result;
	}

	/**
	 * ソート後処理を実行します。
	 * ソート前処理で空行に設定した値を null に戻します。
	 *
	 * @param dispCols キーの表示用項目
	 * @param emptyRows 空行
	 * @param orgSortCols ソート対象項目
	 * @param cols キーの表示用項目でソートするときに実際にソート対象となる項目
	 */
	protected void afterTableSort(String[] dispCols, List<H> emptyRows,
			String[] orgSortCols, Map<String, String[]> sortColMap) {
		// 空行対策（空行で値をセットしたところをクリア）
		for (H h : emptyRows) {
			for (String col : orgSortCols) {
				if (h.getDataType(col) == MCDataType.BOOLEAN) {
					h.setBoolean(col, false);
				}
				else if (sortColMap.containsKey(col)) {
					for (String c : sortColMap.get(col)) {
						h.setValue(c, null);
					}
				}
				else {
					h.setValue(col, null);
				}
			}
		}
	}
	
	/**
	 * 横テーブルの表示行を評価するためのMatcherを作成します。
	 *
	 * @param dispCols 行を表示するrow_title_col
	 * @return 横テーブルの表示行を評価するためのMatcher
	 */
	protected DispRowMatcher createDispRowMatcher(String... dispCols) {
		return new DispRowMatcher(dispCols);
	}

	/**
	 * 横テーブルの表示行を評価するためのMatcherです。
	 */
	public class DispRowMatcher implements MCRowMatcher<H> {

		/**
		 * 行を表示するrow_title_colです。
		 */
		protected String[] _dispCols;

		/**
		 * コンストラクタです。
		 *
		 * @param dispCols 行を表示するrow_title_col
		 */
		protected DispRowMatcher(String[] dispCols) {
			_dispCols = dispCols;
		}

		@Override
		public boolean match(H h) {
			for (String s : _dispCols) {
				if (isSame(h.getStringNE(ROW_TITLE_COL), s)) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * 横リストのキャッシュです。
	 * 全行をキャッシュします。
	 */
	protected MCList<H> _cacheHAllL;

	/**
	 * 横リストのキャッシュを返します。
	 *
	 * @return 横リストのキャッシュ
	 */
	public MCList<H> getCachedHAllL() {
		return _cacheHAllL;
	}

	/**
	 * 行の表示/非表示を切り替えるチェックボックス
	 */
	protected MCCheckBox[] _checks;

	/**
	 * 1番目の要素は全表示用
	 * 2番目の要素は基本表示用
	 * 3番目以降の要素はチェックボックスのON/OFFで表示/非表示が切り替わる
	 */
	protected List<String[]> _dispCols;

	/**
	 * チェックボックスの選択によって横テーブルの表示行を変更する場合の設定です。
	 * 
	 * 引数 dispCols には以下の要素を指定してください。
	 * <ul>
	 * <li>第一要素には全表示用の項目を指定してください。<li>
	 * <li>第二要素にはチェックボックスのON/OFFで表示/非表示を切り替えない項目を指定してください。</li>
	 * <li>第三要素以降にはチェックボックスのON/OFFで表示/非表示を切り替える項目を指定してください。</li>
	 * </ul>
	 *
	 * @param checks チェックボックス
	 * @param dispCols row_title_colの値
	 */
	public void setDispInfo(MCCheckBox[] checks, List<String[]> dispCols) {
		_checks = checks;
		_dispCols = dispCols;

		MCNCListener listener = createCheckBoxNCListener();
		for (MCCheckBox c : _checks) {
			MCNCListener[] nca = c.getNCListeners();
			for (MCNCListener nc : nca) {
				c.removeNCListener(nc);
			}
			c.addNCListener(listener);
			for (MCNCListener nc : nca) {
				c.addNCListener(nc);
			}
		}
	}
	
	/**
	 * チェックボックスの選択によって横テーブルの表示行を変更しない場合の設定です。
	 * 
	 * 引数 dispCols には以下の要素を指定してください。
	 * <ul>
	 * <li>第一要素には全表示用の項目を指定してください。<li>
	 * <li>第二要素にはチェックボックスのON/OFFで表示/非表示を切り替えない項目を指定してください。</li>
	 * </ul>
	 *
	 * @param dispCols row_title_colの値
	 */
	public void setDispInfo(List<String[]> dispCols) {
		_checks = new MCCheckBox[0];
		_dispCols = dispCols;
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナを作成します。
	 *
	 * @return 可変カラムのLCイベントを検知するためのリスナ
	 */
	protected MCNCListener createCheckBoxNCListener() {
		return new FXUCP_CheckBoxNCListener();
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナです。
	 */
	public class FXUCP_CheckBoxNCListener implements MCNCListener {

		@Override
		public void doNCEvent(MCNCBeans compo, MCEventInfo info) {
			if (_hTable.getList().isEmpty()) {
				return;
			}

			doTableDispChange();

			_hTable.selectLeftmostColumn(0);
			_hTable.adjustWidth();
		}

	}

	/**
	 * 横リストのキャッシュをクリアします。
	 */
	public void clearCachedList() {
		_cacheHAllL.clear();
	}

	/**
	 * チェックボックスの選択状態によって、横テーブルの表示内容を変更します。
	 */
	public void doTableDispChange() {
		String[] strDisp = getDispRowTitle();
		DispRowMatcher dispMatcher = createDispRowMatcher(strDisp);

		_hTable.getList().setAll(_cacheHAllL.subList(dispMatcher));

		setDispColsVal();

		_panel.sort(_hTable);
	}

	/**
	 * 表示行のrow_title_colを配列にして返します。
	 *
	 * @return 表示行のrow_title_col
	 */
	protected String[] getDispRowTitle() {
		int flgCnt = _checks.length;

		// [1] 引数の取込
		// Listの取得
		String[] strDispAll = _dispCols.get(0);// 全表示用
		String[] strDispChng0 = _dispCols.get(1);// 基本表示用

		// [2] 画面表示するRow数の取得
		int len = strDispChng0.length;

		// strDispChgの可変長部分
		for (int i = 0; i < flgCnt; i++) {
			if (_checks[i].isSelected()) {
				len += _dispCols.get(i + 2).length;
			}
		}

		// [3] strDisp(戻り)に値をセット
		String[] strDisp = new String[len];
		int cnt = 0;

		// 全表示でループ
		for (String s : strDispAll) {

			int end = 0;

			// 基本表示
			for (String s0 : strDispChng0) {
				if (isSame(s, s0)) {
					strDisp[cnt] = s;
					cnt++;
					end++;
					break;
				}
			}

			if (end != 0) {
				continue;
			}

			// strDispChngの可変長部分
			for (int i = 0; i < flgCnt; i++) {
				if (_checks[i].isSelected()) {
					for (String s1 : _dispCols.get(i + 2)) {
						if (isSame(s, s1)) {
							strDisp[cnt] = s;
							cnt++;
							end++;
							break;
						}
					}
				}
				if (end != 0) {
					break;
				}
			}
			if (end != 0) {
				continue;
			}
		}

		return strDisp;

	}
	
	protected Map<String, List<String[]>> _hDispMap;

	public void setDispCols(LinkedHashMap<String, List<String[]>> map) {
		_hDispMap = map;
	}

	/**
	 * 実装仕様書に定義された属性「VH_DISP_GRP」「VH_DISP_IDX」を利用して項目を順序付けするためのクラスです。
	 */
	public class DispColInfo {

		protected String _disp_col;

		protected int _disp_grp;

		protected int _disp_idx;

		protected DispColInfo(String col, int grp, int idx) {
			_disp_col = col;
			_disp_grp = grp;
			_disp_idx = idx;
		}

	}

	/**
	 * DispColInfoをソートするためのクラスを作成します。
	 *
	 * @return DispColInfoをソートするためのクラス
	 */
	protected DispColInfoSortComparator createDispColInfoSortComparator() {
		return new DispColInfoSortComparator();
	}

	/**
	 * DispColInfoをソートするためのクラスです。
	 */
	public class DispColInfoSortComparator implements Comparator<DispColInfo> {

		@Override
		public int compare(DispColInfo o1, DispColInfo o2) {
			// グループで比較する
			if (o1._disp_grp < o2._disp_grp) {
				return -1;
			}
			if (o1._disp_grp > o2._disp_grp) {
				return 1;
			}

			// グループが同じ場合は順番で比較する
			if (o1._disp_idx < o2._disp_idx) {
				return -1;
			}
			if (o1._disp_idx > o2._disp_idx) {
				return 1;
			}

			// グループと順番が同じ場合
			return 0;
		}

	}

	/**
	 * 横テーブルのキーの表示用項目に値を設定します。
	 */
	public void setDispColsVal() {
		DispColController<H> controller = getDispColController();

		// row_title_colがnullの行と合計行を除外する
		MCList<H> tempHList = _hTable.getList().createInstance();
		for (H h : _hTable.getList()) {
			if (controller.isTargetRow(h)) {
				tempHList.add(h);
			}
		}

		// 表示行のレコードＩＤ
		int[] recordIds = getDispRecordIds(tempHList);
		
		// disp項目名、レコードＩＤ、項目名のマップ
		Map<String, Map<Integer, List<String[]>>> dispMap = new HashMap<>();
		for (String k : _hDispMap.keySet()) {
			dispMap.put(k, controller.getDispCols(k, _hDispMap.get(k), recordIds));
		}
		
		String colSep = controller.getColSeparator();
		String grpSep = controller.getGrpSeparator();
		for (H h : tempHList) {
			int pos = h.getNumber(RECORD_ID).intValue();
			for (String col : _hDispMap.keySet()) {
				List<String[]> cols = dispMap.get(col).get(pos);
				String[] vals = new String[cols.size()];
				for (int i = 0; i < cols.size(); i++) {
					String[] sameGrpCols = cols.get(i);
					String[] sameGrpVals = new String[sameGrpCols.length];
					for (int j = 0; j < sameGrpCols.length; j++) {
						sameGrpVals[j] = controller.toDispString(h, sameGrpCols[j]);
					}
					vals[i] = MCStringUtil.join(colSep, sameGrpVals);
				}
				h.setString(col, MCStringUtil.join(grpSep, vals));
			}
		}
	}

	/**
	 * 表示行のレコードＩＤを配列で返します。
	 *
	 * @param dispHL 表示行のリスト
	 * @return レコードＩＤの配列
	 */
	protected int[] getDispRecordIds(MCList<H> dispHL) {
		// 表示行のレコードＩＤを取得する
		List<MCNumber> l = dispHL.groupBy(RECORD_ID).getNumber(RECORD_ID);
		// レコードＩＤをintに変換する
		int[] result = new int[l.size()];
		for (int i = 0;i < l.size(); i++) {
			result[i] = l.get(i).intValue();
		}
		return result;
	}
	
	/**
	 * キーの表示用項目に表示する項目を制御するためのクラスです。
	 */
	protected DispColController<H> _dispColController;

	/**
	 * キーの表示用項目に表示する項目を制御するためのクラスを設定します。
	 *
	 * @param controller キーの表示用項目に表示する項目を制御するためのクラス
	 */
	public void setDispColController(DispColController<H> controller) {
		_dispColController = controller;
	}

	/**
	 * キーの表示用項目に表示する項目を制御するためのクラスを返します。
	 *
	 * @return キーの表示用項目に表示する項目を制御するためのクラス
	 */
	protected DispColController<H> getDispColController() {
		return _dispColController != null ? _dispColController
				: (_dispColController = new DispColController<H>());
	}

	/**
	 * キーの表示用項目に表示する項目を制御するためのクラスです。
	 */
	public static class DispColController<H extends MCConstRow> {

		/**
		 * 項目の区切り文字を返します。
		 */
		protected String getColSeparator() {
			return " ";
		}

		/**
		 * グループの区切り文字を返します。
		 */
		protected String getGrpSeparator() {
			return " / ";
		}
		
		/**
		 * キーの表示用項目に項目名を表示する行の場合は true を返します。
		 * デフォルトでは「row_title_colが null の場合」「合計行の場合」に false を返します。
		 *
		 * @param h　横ロウ
		 * @return キーの表示用項目に項目名を表示しない行の場合は false
		 */
		protected boolean isTargetRow(H h) {
			return !isNull(h.getString(ROW_TITLE_COL)) 
					&& h.getNumber(RECORD_ID).intValue() != REC_GRP_ID_SUM_VAL;
		}

		/**
		 * キーの表示用項目に表示する項目名を返します。
		 *
		 * @param dispCol キーの表示用項目
		 * @param cols キーの表示用項目に表示する項目
		 * @param dispRecordIds 横テーブルに表示するレコードＩＤ
		 * @return キー：レコードＩＤ、値：キーの表示用項目に表示する項目
		 */
		protected Map<Integer, List<String[]>> getDispCols(String dispCol,
				List<String[]> cols, int[] dispRecordIds) {
			Map<Integer, List<String[]>> map = new HashMap<>();
			for (int i = 0; i < dispRecordIds.length; i++) {
				List<String[]> list = new ArrayList<>();
				int div = cols.size() / dispRecordIds.length;
				int rem = cols.size() % dispRecordIds.length;
				int start;
				int count;
				if (i < rem) {
					start = (div + 1) * i;
					count = div + 1;
				}
				else if (i == rem) {
					start = (div + 1) * i;
					count = div;
				}
				else {
					start = (div + 1) * rem + div * (i - rem);
					count = div;
				}

				for (int j = start; j < start + count; j++) {
					list.add(cols.get(j));
				}

				map.put(dispRecordIds[i], list);
			}

			return map;
		}
		
		/**
		 * 項目の値を変換します。
		 * キーの表示用項目に表示するための値に変換します。
		 *
		 * @param h 横リストの行
		 * @param col 項目名
		 * @return 値
		 */
		protected String toDispString(H h, String col) {
			return h.getString(col);
		}

	}
	
	/**
	 * メッセージのCauseRowとCauseColumnを縦ロウの情報から連携する横ロウの情報に変換します。
	 * 横ロウの情報が見つからなかった場合は変換しません。
	 * 
	 * @param hL 横リスト
	 * @param msgL メッセージリスト
	 */
	public void cnvCauseRowVH(MCList<H> hL, MCMessageList msgL) {
		Class<V> clazz = (Class<V>) _vList.createRow().getClass();

		// 行番号：XXとなるバインド値を文字列置換する。
		// アプリルール：行番号は一番最後のバインド値
		MCRow tmp = MCRow.create();
		tmp.setGUIIndex(0);
		String rowLabel = toDispGUIIndex(tmp);
		rowLabel = rowLabel.replace("1", "");

		for (MCMessage msg : msgL) {
			HRowInfo info = getHRowInfo(clazz, msg, hL);
			if (info == null) {
				continue;
			}
			msg.setCauseRow(info.row(), info.col());

			String[] amsg = msg.getBindArray();
			if (amsg.length > 0 && !isNull(amsg[amsg.length - 1])
					&& amsg[amsg.length - 1].matches(rowLabel + "\\d+")) {
				msg.setBind(amsg.length, toDispGUIIndex(info.row()));
			}
		}
	}
	
	protected HRowInfo getHRowInfo(Class<V> clazz, MCMessage msg, MCList<H> dtlDispL) {
		MCRow causeRow = msg.getCauseRow();
		if (causeRow != null && clazz.isInstance(causeRow)) {
			V vRow = (V)causeRow;
			// causeColumnで横ロウを特定できない場合は、_rtVColsの先頭の行にする
			String causeCol = nvl(msg.getCauseColumn(), _rtVCols[0]);
			if (!isNull(causeCol)) {
				return getHRow(vRow, causeCol, dtlDispL);
			}
		}
		return null;
	}
	
}
