package mcframe.clientMGUC.MGUCP0030;

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
import mcframe.clientCore.beans.MCPanel;
import mcframe.clientCore.beans.MCRowBeans;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCColumnGroup;
import mcframe.clientCore.beans.table.MCColumnGroupTable;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.event.MCEventInfo;
import mcframe.clientCore.event.MCLCBeans;
import mcframe.clientCore.event.MCLCListener;
import mcframe.clientCore.event.MCNCBeans;
import mcframe.clientCore.event.MCNCListener;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase;
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

import mcframe.commonMA.constant.*;

/**
 * カラムの表示・非表示を制御するクラスです。<br>
 * 
 * Vは縦リスト（通信用非表示リスト）のロウ、Hは横テーブル（画面表示テーブル）のリストのロウです。<br>
 * <br>
 * 修正後は以下の画面でチェックする。<br>
 * MGBBP0210 通常の費目系画面<br>
 * MGBBP0220 １費目に対して複数カラムが割り当てられている画面（入力できるか）<br>
 * MGBEP0070 操作種別の切り替えで表示する費目が切り替わる画面<br>
 */
abstract public class MGUCP_CCtrl_MC<R extends MCConstRow> {

	/**
	 * 実装仕様書に定義する属性「SHOW」です。
	 */
	protected static final String SHOW = "SHOW";

	/**
	 * 実装仕様書に定義する属性値「ELM」です。
	 */
	protected static final String ELM = "ELM";

	/**
	 * 画面です。
	 */
	MGUDP_PanelBase _panel;

	/**
	 * テーブルです。
	 */
	protected MCTable<R> _table;

	/**
	 * ロウです。
	 */
	protected R _row;

	/**
	 * 可変カラム（col_00～col_??）の項目です。
	 */
	protected String[] _elmCols;

	/**
	 * 可変カラムです。
	 */
	protected MCColumnConfig[] _elmColumns;

	/**
	 * 初期化
	 */
	protected void initMain(MGUDP_PanelBase panel, MCTable<R> table) {
		_panel = panel;
		_table = table;
		_row = _table.getList().createRow();

		_elmCols = getExtCols(_row, SHOW, ELM);

		// 可変カラム
		MCColumnConfig[] elmColumns = new MCColumnConfig[_elmCols.length];
		for (int i = 0; i < _elmCols.length; i++) {
			elmColumns[i] = getColumnConfig(_elmCols[i]);
		}
		_elmColumns = elmColumns;
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
					.toArray(size -> new String[size]);
		}
		return new String[0];
	}

	protected MCColumnConfig getColumnConfig(String baseRowColumnName) {
		for (MCColumnConfig column : _table.getColumnConfigs()) {
			if (baseRowColumnName.equals(column.getBaseRowColumnName())) {
				return column;
			}
		}
		return null;
	}

	/**
	 * 費目のリストです。
	 */
	protected MCList<ExpnsR> _expns;

	/** １費目に割り当てられる動的カラムの数 */
	protected int _num;

	protected MCColumnConfig[] _expnsGColumns;
	protected MCColumnConfig[] _expnsColumns;

	protected List<MCColumnConfig> _expnsAmtColumns;
	protected List<MCColumnConfig> _expnsUpriColumns;

	/**
	 * マップ（キー：費目Ｇカラム、値：費目Ｇに属する費目カラム配列）です。
	 */
	protected Map<MCColumnConfig, MCColumnConfig[]> _expnsGMap;

	/**
	 * マップ（キー：費目Ｇカラム、値：費目Ｇに属する費目カラム配列）です。（単価用）
	 */
	protected Map<MCColumnConfig, MCColumnConfig[]> _expnsGMapUpri;

	/**
	 * マップ（キー：ステータス、値：モード）です。（費目用）
	 */
	protected Map<String, MCMode[]> _expnsModeMap;

	/**
	 * 有効な（表示する）カラムのインデックスです。
	 */
	protected int _validColIdx;

	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 */
	protected void setExpnsMain(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg) {
		setExpnsMain(expns, expnsFlg, expnsGFlg, null, 1);
	}
	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 * @param upriFlg 単価表示フラグ部品
	 */
	protected void setExpnsMain(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg, MCRowBeans upriFlg, int num) {
		_expns = expns.clone();
		_expns.sort(ExpnsR.$expns_grp_seq, ExpnsR.$expns_grp_cd,
				ExpnsR.$expns_seq, ExpnsR.$expns_cd);
		_num = num;

		// 費目Ｇマップ作成
		_expnsGMap = new LinkedHashMap<MCColumnConfig, MCColumnConfig[]>();
		List<MCColumnConfig> keyL = new ArrayList<MCColumnConfig>();
		List<List<MCColumnConfig>> listL = new ArrayList<List<MCColumnConfig>>();
		resetList(listL, num);

		_expnsGMapUpri = new LinkedHashMap<MCColumnConfig, MCColumnConfig[]>();
		List<MCColumnConfig> ukeyL = new ArrayList<MCColumnConfig>();
		List<List<MCColumnConfig>> ulistL = new ArrayList<List<MCColumnConfig>>();
		resetList(ulistL, num);

		MCColumnGroup[] cgs = null;
		if (num > 1 && _table instanceof MCColumnGroupTable) {
			cgs = ((MCColumnGroupTable)_table).getAllColumnGroups();
		}

		List<MCColumnConfig> expnsGL = new ArrayList<MCColumnConfig>();
		List<MCColumnConfig> expnsL = new ArrayList<MCColumnConfig>();
		List<MCColumnConfig> amtL = new ArrayList<MCColumnConfig>();
		List<MCColumnConfig> upriL = new ArrayList<MCColumnConfig>();
		String expnsGCd = null;
		int elmIdx = 0;

		for (int i = 0; i < _expns.size(); i++) {
			ExpnsR r = _expns.get(i);
			if (i == 0 || !isSame(expnsGCd, r.expns_grp_cd())) {
				if (i > 0) {
					setMap(_expnsGMap, keyL, listL, num);
					keyL = new ArrayList<MCColumnConfig>();
					listL = new ArrayList<List<MCColumnConfig>>();
					resetList(listL, num);
					if (upriFlg != null) {
						setMap(_expnsGMapUpri, ukeyL, ulistL, num);
						ukeyL = new ArrayList<MCColumnConfig>();
						ulistL = new ArrayList<List<MCColumnConfig>>();
						resetList(ulistL, num);
					}
				}

				elmIdx = addKeyCol(keyL, _elmColumns, elmIdx, num, expnsGL, amtL, r.expns_grp_nm());

				expnsGCd = r.expns_grp_cd();

				if (upriFlg != null) {
					elmIdx = addKeyCol(ukeyL, _elmColumns, elmIdx, num, expnsGL, upriL, r.expns_grp_nm());
				}

				setCGLabel(cgs, r.expns_grp_nm());
			}

			elmIdx = addListCol(listL, _elmColumns, elmIdx, num, expnsL, amtL, r.expns_nm());


			if (upriFlg != null) {
				elmIdx = addListCol(ulistL, _elmColumns, elmIdx, num, expnsL, upriL, r.expns_nm());
			}
			
			setCGLabel(cgs, r.expns_nm());

			if (i == _expns.size() - 1) {
				setMap(_expnsGMap, keyL, listL, num);
				if (upriFlg != null) {
					setMap(_expnsGMapUpri, ukeyL, ulistL, num);
				}
			}
		}
		_expnsGColumns = expnsGL.toArray(new MCColumnConfig[0]);
		_expnsColumns = expnsL.toArray(new MCColumnConfig[0]);
		_expnsAmtColumns = amtL;
		_expnsUpriColumns = upriL;
		_validColIdx = elmIdx - 1;

		// 費目Ｇを読取専用
		for (int i = 0; i < _expnsGColumns.length; i++) {
			for (String status : _panel.getStatusSet()) {
				_expnsGColumns[i].putMode(_panel, status, MCMode.READ_ONLY);
			}
		}

		_expnsModeMap = new HashMap<String, MCMode[]>();
		for (String status : _panel.getStatusSet()) {
			MCMode[] modes = new MCMode[num];
			for (int i = 0; i < num; i++) {
				modes[i] = _expnsColumns.length == 0 ? MCMode.INVISIBLE : _expnsColumns[i].getMode(_panel, status);
			}
			_expnsModeMap.put(status, modes);
		}

		// 無効なカラムを非表示
		for (int i = _validColIdx + 1; i < _elmColumns.length; i++) {
			for (String status : _panel.getStatusSet()) {
				_elmColumns[i].putMode(_panel, status, MCMode.INVISIBLE);

			}
			_elmColumns[i].setMode(MCMode.INVISIBLE);
		}
	}
	protected void resetList(List<List<MCColumnConfig>> listL, int num) {
		for(int i = 0; i < num; i++) {
			listL.add(new ArrayList<MCColumnConfig>());
		}
	}
	protected void setMap(Map<MCColumnConfig, MCColumnConfig[]> map, List<MCColumnConfig> keyL, List<List<MCColumnConfig>> listL, int num) {
		for(int i = 0; i < num; i++) {
			map.put(keyL.get(i), listL.get(i).toArray(new MCColumnConfig[0]));
		}
	}
	protected int addKeyCol(List<MCColumnConfig> keyL, MCColumnConfig[] elmColumns, int idx, int num, List<MCColumnConfig> list1, List<MCColumnConfig> list2, String label) {
		int index = idx;
		for (int i = 0; i < num; i++) {
			MCColumnConfig cc = elmColumns[index++];
			keyL.add(cc);
			list1.add(cc);
			list2.add(cc);
			if (num == 1) {
				cc.setHeaderName(label);
				cc.setHeaderMessage(label);
			}
		}
		return index;
	}
	protected int addListCol(List<List<MCColumnConfig>> listL, MCColumnConfig[] elmColumns, int idx, int num, List<MCColumnConfig> list1, List<MCColumnConfig> list2, String label) {
		int index = idx;
		for (int i = 0; i < num; i++) {
			MCColumnConfig cc = elmColumns[index++];
			listL.get(i).add(cc);
			list1.add(cc);
			list2.add(cc);
			if (num == 1) {
				cc.setHeaderName(label);
				cc.setHeaderMessage(label);
			}
		}
		return index;
	}
	protected void setCGLabel(MCColumnGroup[] cgs, String label) {
		if (cgs != null) {
			for(MCColumnGroup cg : cgs) {
				if (isNull(cg.getHeaderName())) {
					cg.setHeaderName(label);
					cg.setHeaderMessage(label);
					break;
				}
			}
		}
	}


	/**
	 * 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナです。
	 */
	protected MCNCListener _flg_nc;

	/**
	 * 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナを返します。
	 *
	 * @return 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナ
	 */
	protected MCNCListener getFlgNCListener() {
		return _flg_nc != null ? _flg_nc : (_flg_nc = createFlgNCListener());
	}

	/**
	 * 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナを作成します。
	 *
	 * @return 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナ
	 */
	protected MCNCListener createFlgNCListener() {
		return new FXUCP_FlgNCListener();
	}

	/**
	 * 費目・費目Ｇ表示ＦＬＧのNCイベントを検知するためのリスナです。
	 */
	public class FXUCP_FlgNCListener implements MCNCListener {
		@Override
		public void doNCEvent(MCNCBeans compo, MCEventInfo info) {
			displayColumn();
		}
	}

	/**
	 * 費目のリストを返します。
	 */
	protected MCList<ExpnsR> getExpnsMain(){
		return _expns.clone();
	}

	protected void displayColumnMain(boolean dispExpns, boolean dispExpnsG, MCRowBeans upriFlg) {
		if (dispExpns) {
			for (int i = 0; i < _expnsColumns.length; i++) {
				MCColumnConfig cc = _expnsColumns[i];
				if (upriFlg == null) {
					cc.setMode(_expnsModeMap.get(_panel.getStatus())[i%_num]);
				}
				else {
					if ((boolean)upriFlg.getRowValue()) {
						if (_expnsAmtColumns.contains(cc)) {
							cc.setMode(MCMode.INVISIBLE);
						}
						else {
							cc.setMode(_expnsModeMap.get(_panel.getStatus())[i%_num]);
						}
					}
					else {
						if (_expnsAmtColumns.contains(cc)) {
							cc.setMode(_expnsModeMap.get(_panel.getStatus())[i%_num]);
						}
						else {
							cc.setMode(MCMode.INVISIBLE);
						}
					}
				}
			}
		}
		else {
			for (MCColumnConfig cc : _expnsColumns) {
				cc.setMode(MCMode.INVISIBLE);
			}
		}
		if (dispExpnsG) {
			for (MCColumnConfig cc : _expnsGColumns) {
				if (upriFlg == null) {
					cc.setMode(MCMode.READ_ONLY);
				}
				else {
					if ((boolean)upriFlg.getRowValue()) {
						if (_expnsAmtColumns.contains(cc)) {
							cc.setMode(MCMode.INVISIBLE);
						}
						else {
							cc.setMode(MCMode.READ_ONLY);
						}
					}
					else {
						if (_expnsAmtColumns.contains(cc)) {
							cc.setMode(MCMode.READ_ONLY);
						}
						else {
							cc.setMode(MCMode.INVISIBLE);
						}
					}
				}
			}
		}
		else {
			for (MCColumnConfig cc : _expnsGColumns) {
				cc.setMode(MCMode.INVISIBLE);
			}
		}
		if (_table != null) {
			_table.adjustWidth();
		}
	}

	protected MCColumnConfig[] getExpnsGColumnConfigsMain() {
		return _expnsGColumns;
	}

	protected MCColumnConfig[] getExpnsColumnConfigsMain() {
		return _expnsColumns;
	}

	/**
	 * 単価計算を実行します。
	 * <p>
	 * @param row 計算結果を格納するコンテナ
	 * @param qty 単価を求める数量
	 * @param zeroFlg 単価＝ゼロを表示する場合TRUE（費目Ｇ項目は常に表示）
	 */
	protected void calcUnitMain(MCRow row, MCNumber qty, boolean zeroFlg) {
		List<MCColumnConfig> gL = Arrays.asList(getExpnsGColumnConfigsMain());

		for (int i = 0; i < _expnsAmtColumns.size(); i++) {
			MCColumnConfig amtCol = _expnsAmtColumns.get(i);
			MCColumnConfig upriCol = _expnsUpriColumns.get(i);
			row.setValue(upriCol.getBaseRowColumnName(), calcUnit(row.getNumber(amtCol.getBaseRowColumnName()), qty,
					getDefaultScale(), gL.contains(upriCol) || zeroFlg));
		}
	}
	protected int getDefaultScale() {
		return _expnsColumns[0].getMeta().scale();
	}
	protected MCNumber calcUnit(MCNumber amt, MCNumber qty, int scale, boolean zeroFlg) {
		MCNumber unit = null;
		if (MCNumber.ZERO.eq(qty)) {
			if (zeroFlg) {
				unit = MCNumber.ZERO;
			}
		}
		else {
			if (!isNull(amt)) {
				unit = amt.divide(qty, scale, MAC_RND_TYP.RNDOFF.toMC());
			}
		}
		return unit;
	}

	protected String[] _ttlCols;

	protected void setSumMain(String... ttlCols) {
		_ttlCols = ttlCols;
		initSum();
	}
	protected void initSum() {
		for (MCColumnConfig c : getExpnsColumnConfigsMain()) {
			c.addLCListener(getColLCListener());
		}
	}

	protected String _qtyCol;
	protected String _upriCol;

	protected void setUpriMain(String qtyCol, String upriCol) {
		_qtyCol = qtyCol;
		_upriCol = upriCol;
	}

	protected int _subttlColIdx;
	protected int[] _ttlElmColsIdx;

	protected void setSubttlMain(int subttlColIdx, int...ttlElmColsIdx) {
		_subttlColIdx = subttlColIdx;
		_ttlElmColsIdx = ttlElmColsIdx;
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナです。
	 */
	protected MCLCListener _col_lc;

	/**
	 * 可変カラムのLCイベントを検知するためのリスナを返します。
	 *
	 * @return 可変カラムのLCイベントを検知するためのリスナ
	 */
	protected MCLCListener getColLCListener() {
		return _col_lc != null ? _col_lc : (_col_lc = createColLCListener());
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナを作成します。
	 *
	 * @return 可変カラムのLCイベントを検知するためのリスナ
	 */
	protected MCLCListener createColLCListener() {
		return new ColLCListener();
	}

	/**
	 * 可変カラムのLCイベントを検知するためのリスナです。
	 */
	public class ColLCListener implements MCLCListener {
		@Override
		public void doLCEvent(MCLCBeans compo, MCEventInfo info) {

			if (_ttlCols == null || _ttlCols.length == 0) {
				return ;
			}

			List<MCNumber> ttlL = new ArrayList<MCNumber>();
			for (int i = 0; i < _ttlCols.length; i++) {
				ttlL.add(MCNumber.ZERO);
			}

			int idx = info.getEventIndex();
			R r = _table.getList().get(idx);

			// 小計の計算
			if (_ttlElmColsIdx != null) {
				for (int i = 0; i < getExpnsColumnConfigsMain().length; i = i+_num) {
					if (incEditCol(info, i)) {
						MCNumber sum = MCNumber.ZERO;
						for (int x : _ttlElmColsIdx) {
							MCNumber n = (MCNumber)getExpnsColumnConfigsMain()[i+x].getRowValue(idx);
							if (!isNull(n)) {
								sum = nvl(sum, MCNumber.ZERO).add(n);
							}
						}
						getExpnsColumnConfigsMain()[i+_subttlColIdx].setValue(idx, sum);
						break;
					}
				}
			}

			// 費目Ｇ計・合計の計算
			int cnt = 0;
			for (Map.Entry<MCColumnConfig, MCColumnConfig[]> entry : _expnsGMap.entrySet()) {
				MCNumber sum = MCNumber.ZERO;
				for (MCColumnConfig c : entry.getValue()) {
					MCNumber n = (MCNumber) c.getRowValue(idx);
					if (!isNull(n)) {
						sum = nvl(sum,MCNumber.ZERO).add(n);
					}
				}

				ttlL.set(cnt % _ttlCols.length, sum(ttlL.get(cnt % _ttlCols.length), sum));

				entry.getKey().setValue(idx, sum);
				cnt++;
			}

			// 合計の設定
			for (int i = 0; i < _ttlCols.length; i++) {
				r.setNumber(_ttlCols[i], ttlL.get(i));
				// 単価計算
				if (i == 0 && !isNullOr(_qtyCol, _upriCol)) {
					r.setNumber(_upriCol, calcUnit(ttlL.get(i), r.getNumberNE(_qtyCol), getDefaultScale(), false));
				}
			}
			if (_table != null) {
				_table.adjustWidth();
			}
		}
		protected boolean incEditCol(MCEventInfo info, int idx) {
			for (int j = 0; j < _num; j++) {
				if (getExpnsColumnConfigsMain()[idx+j] == info.getComponent()) {
					return true;
				}
			}
			return false;
		}
	}

	LinkedHashMap<MCTable<R>, MGUCP_CCtrl<R>> _tabMap = new LinkedHashMap<MCTable<R>, MGUCP_CCtrl<R>>();

	protected MCRowBeans _expnsFlg;
	protected MCRowBeans _expnsGFlg;
	protected MCRowBeans _upriFlg;

	// -----------------------------------------------
	// 共通
	public void init(MGUDP_PanelBase panel, MCTable... tables) {
		for (MCTable<R> table : tables) {
			MGUCP_CCtrl<R> cc = new MGUCP_CCtrl<>();
			cc.initMain(panel, table);
			_tabMap.put(table, cc);
		}
	}
	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 */
	public void setExpns(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg) {
		setExpns(expns, expnsFlg, expnsGFlg, null, 1);
	}
	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 * @param upriFlg 単価表示フラグ部品
	 */
	public void setExpns(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg, MCRowBeans upriFlg) {
		setExpns(expns, expnsFlg, expnsGFlg, upriFlg, 1);
	}
	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 * @param num １費目に対して割り当てるカラムの数
	 */
	public void setExpns(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg, int num) {
		setExpns(expns, expnsFlg, expnsGFlg, null, num);
	}
	/**
	 * 費目のリストをセットします。セットされたリストは表示順（費目Ｇ）、費目Ｇ、表示順（費目）、費目でソートされます。
	 * @param expns 費目情報
	 * @param expnsFlg 費目表示フラグ部品
	 * @param expnsGFlg 費目Ｇ表示フラグ部品
	 * @param upriFlg 単価表示フラグ部品
	 * @param num １費目に対して割り当てるカラムの数
	 */
	public void setExpns(MCList<ExpnsR> expns, MCRowBeans expnsFlg, MCRowBeans expnsGFlg, MCRowBeans upriFlg, int num) {
		_expnsFlg = expnsFlg;
		_expnsGFlg = expnsGFlg;
		_upriFlg = upriFlg;

		((MCNCBeans)_expnsFlg).removeNCListener(getFlgNCListener());
		((MCNCBeans)_expnsGFlg).removeNCListener(getFlgNCListener());

		((MCNCBeans)_expnsFlg).addNCListener(getFlgNCListener());
		((MCNCBeans)_expnsGFlg).addNCListener(getFlgNCListener());

		if (_upriFlg != null) {
			((MCNCBeans)_upriFlg).removeNCListener(getFlgNCListener());
			((MCNCBeans)_upriFlg).addNCListener(getFlgNCListener());
		}

		for (MGUCP_CCtrl<R> cc : _tabMap.values()) {
			cc.setExpnsMain(expns, expnsFlg, expnsGFlg, upriFlg, num);
		}
	}
	/**
	 * 費目のリストを返します。
	 */
	public MCList<ExpnsR> getExpns(){
		for (MCTable<R> table : _tabMap.keySet()) {
			MGUCP_CCtrl<R> cc = _tabMap.get(table);
			if (cc != null) {
				return cc.getExpnsMain();
			}
		}
		return null;
	}

	// -----------------------------------------------
	// テーブル単位
	/**
	 * 費目Ｇのカラムコンフィグの配列を返します。<br>
	 * initで一番目に指定したテーブルが対象です。
	 */
	public MCColumnConfig[] getExpnsGColumnConfigs() {
		for (MCTable<R> table : _tabMap.keySet()) {
			return getExpnsGColumnConfigs(table);
		}
		return new MCColumnConfig[0];
	}
	/**
	 * 費目Ｇのカラムコンフィグの配列を返します。<br>
	 */
	public MCColumnConfig[] getExpnsGColumnConfigs(MCTable table) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			return cc.getExpnsGColumnConfigsMain();
		}
		return new MCColumnConfig[0];
	}

	/**
	 * 費目のカラムコンフィグの配列を返します。<br>
	 * initで一番目に指定したテーブルが対象です。
	 */
	public MCColumnConfig[] getExpnsColumnConfigs() {
		for (MCTable<R> table : _tabMap.keySet()) {
			return getExpnsColumnConfigs(table);
		}
		return new MCColumnConfig[0];
	}
	/**
	 * 費目のカラムコンフィグの配列を返します。<br>
	 */
	public MCColumnConfig[] getExpnsColumnConfigs(MCTable table) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			return cc.getExpnsColumnConfigsMain();
		}
		return new MCColumnConfig[0];
	}

	/**
	 * 費目・費目Ｇのカラム名の配列を返します。<br>
	 * initで一番目に指定したテーブルが対象です。
	 */
	public String[] getViewColumns() {
		for (MCTable<R> table : _tabMap.keySet()) {
			return getViewColumns(table);
		}
		return new String[0];
	}
	/**
	 * 費目・費目Ｇのカラム名の配列を返します。<br>
	 */
	public String[] getViewColumns(MCTable table) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		List<String> l = new ArrayList<String>();
		if (cc != null) {
			for (MCColumnConfig c : cc.getExpnsGColumnConfigsMain()) {
				l.add(c.getBaseRowColumnName());
			}
			for (MCColumnConfig c : cc.getExpnsColumnConfigsMain()) {
				l.add(c.getBaseRowColumnName());
			}
		}
		return l.toArray(new String[0]);
	}

	/**
	 * 費目・費目Ｇの再表示を行います。<br>
	 * initで指定した全てテーブルが対象です。
	 */
	public void displayColumn() {
		boolean dispExpns = _expnsFlg != null && (boolean)_expnsFlg.getRowValue();
		boolean dispExpnsG = _expnsGFlg != null && (boolean)_expnsGFlg.getRowValue();
		for (MCTable<R> table : _tabMap.keySet()) {
			displayColumn(table, dispExpns, dispExpnsG);
		}
	}
	/**
	 * 費目・費目Ｇの再表示を行います。<br>
	 */
	public void displayColumn(MCTable<R> table, boolean dispExpns, boolean dispExpnsG) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			cc.displayColumnMain(dispExpns, dispExpnsG, _upriFlg);
		}
	}

	/**
	 * 単価計算を実行します。<br>
	 * initで指定した全てテーブルが対象です。
	 */
	public void calcUnit(MCRow row, MCNumber qty, boolean zeroFlg) {
		for (MCTable<R> table : _tabMap.keySet()) {
			calcUnit(table, row, qty, zeroFlg);
		}
	}
	/**
	 * 単価計算を実行します。<br>
	 */
	public void calcUnit(MCTable<R> table, MCRow row, MCNumber qty, boolean zeroFlg) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			cc.calcUnitMain(row, qty, zeroFlg);
		}
	}

	/**
	 * 集計機能を有効にします。<br>
	 * 費目に数値を入力すると、費目Ｇ、合計に数値が加算されます。<br>
	 * initで指定した全てテーブルが対象です。
	 */
	public void setSum(String... ttlCols) {
		for (MCTable<R> table : _tabMap.keySet()) {
			setSum(table, ttlCols);
		}
	}
	/**
	 * 集計機能を有効にします。<br>
	 * 費目に数値を入力すると、費目Ｇ、合計に数値が加算されます。<br>
	 */
	public void setSum(MCTable<R> table, String... ttlCols) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			cc.setSumMain(ttlCols);
		}
	}

	/**
	 * 単価計算機能を有効にします。<br>
	 * 合計計算後に単価を計算します。<br>
	 * ※setSumで集計機能を有効にしている必要があります<br>
	 * initで指定した全てテーブルが対象です。
	 */
	public void setUpri(String qtyCol, String upriCol) {
		for (MCTable<R> table : _tabMap.keySet()) {
			setUpri(table, qtyCol, upriCol);
		}
	}
	/**
	 * 単価計算機能を有効にします。<br>
	 * 合計計算後に単価を計算します。<br>
	 * ※setSumで集計機能を有効にしている必要があります<br>
	 */
	public void setUpri(MCTable<R> table, String qtyCol, String upriCol) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			cc.setUpriMain(qtyCol, upriCol);
		}
	}

	/**
	 * 小計機能を有効にします。<br>
	 * １費目に複数カラムが指定されている場合に、そのカラム間で小計の計算・設定を行います。<br>
	 * initで指定した全てテーブルが対象です。
	 */
	public void setSubttl(int subttlColIdx, int...ttlElmColsIdx) {
		for (MCTable<R> table : _tabMap.keySet()) {
			setSubttl(table, subttlColIdx, ttlElmColsIdx);
		}
	}
	/**
	 * 小計機能を有効にします。<br>
	 * １費目に複数カラムが指定されている場合に、そのカラム間で小計の計算・設定を行います。<br>
	 */
	public void setSubttl(MCTable<R> table, int subttlColIdx, int...ttlElmColsIdx) {
		MGUCP_CCtrl<R> cc = _tabMap.get(table);
		if (cc != null) {
			cc.setSubttlMain(subttlColIdx, ttlElmColsIdx);
		}
	}

}
