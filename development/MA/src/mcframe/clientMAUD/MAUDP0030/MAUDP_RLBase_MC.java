package mcframe.clientMAUD.MAUDP0030;

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
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.BoxLayout;
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUC.MAUCP0020.CoR;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.clientMAUC.MAUCP0020.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientFXUC.FXUCP0070.FXUCP_SrchCndUtil;
import mcframe.clientFXUC.FXUCP0070.SrchCndInfo;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_RLBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_RLBase_MC extends MAUDP_RLBase_MC_A implements mcframe.clientMAUD.MAUDP0030.IfRLBase, IfMAUDP_PanelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 表示制御キーに対する項目を保持します。<p>
	 * コンテナ拡張項目「DISP_CTL」未設定の項目のみ保持します。<br>
	 * 表示制御キーに対するシステムパラメータが非表示対象の場合、
	 * MAUCP_AppScreenOpenerは、表示制御キーに対する項目のモードが「入力可」の場合にのみ値を連携します。<br>
	 * @see mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener
	 */
	protected Map<String, HashSet<MCModeBeans>> _dispctl2Comps = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_RLBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * @deprecated 基本的に {@link #getRLUtil()}lを使うことを想定
	 */
	protected MAUDP_RLUtil _RLUtil;

	protected MAUDP_RLUtil getRLUtil() {
		if (_RLUtil == null) {
			_RLUtil = createInputSupportUtil();
		}
		return _RLUtil;
	}

	protected MAUDP_RLUtil createInputSupportUtil() {
		MAUDP_RLUtil p = new MAUDP_RLUtil();
		p.setPanel(this);
		return p;
	}

	// ///////////////////////////////////////////////
	// IfRLBase 関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	public void setUPDStatus() {
	};
	@Override
	public void setDELStatus() {
	};
	@Override
	public void setFIXStatus() {
	};

	@Override
	public abstract MCList<? extends MCConstRow> getDtlL();

	@Override
	public abstract MCConstRow getCndR();

	public boolean isUpdOpe() {
		return getCndR().getString(getOpeColumn()).equals(getUpdOpeValue());
	};
	public boolean isDelOpe() {
		return getCndR().getString(getOpeColumn()).equals(getDelOpeValue());
	};

	@Override
	public String getUPDStatus() {
		return getRLUtil().defGetUPDStatus();
	}
	@Override
	public String getDELStatus() {
		return getRLUtil().defGetDELStatus();
	}
	@Override
	public String getFIXStatus() {
		return getRLUtil().defGetFIXStatus();
	}

	/**
	 * 「更新カウンタ」のカラム名（デフォルトは"upd_cntr"。）
	 */
	public String getUpdCntrColumn() {
		return getRLUtil().getUpdCntrColumn();
	}

	@Override
	public void setAdjustWidth() {
		super.setAdjustWidth();
		getRLUtil().defSetAdjustWidth();
	}

	@Override
	public void afterOpen() {
		super.afterOpen();
		getRLUtil().defAfterOpen();
	}

	@Override
	public void screenClearSetDefault() {
		super.screenClearSetDefault();
		getRLUtil().defScreenClearSetDefault();

	}

	@Override
	public void setOpenFocus() {
		moveFocusCndPanel();
	}

	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (getRLUtil().defDeleteRow(table)) {
			return super.deleteRow(table);
		}
		return null;
	}

	@Override
	public boolean clear(MCTable table) {
		if (super.clear(table)) {
			return clearSub(table);
		}
		return false;
	}

	@Override
	public <E extends MCConstRow> void deleteRows(MCTable<E> table, MCList<E> list) {
		getRLUtil().defDeleteRows(table, list);
	}

	@Override
	public boolean clearSub(MCTable table) {
		return getRLUtil().defClearSub(table);
	}

	// ///////////////////////////////////////////////
	// IfRLBase 関連（ここまで）
	// ///////////////////////////////////////////////
	

	@Override
	protected void valueInit() {
		super.valueInit();

		setCndDelFlgOn();
	}

	/**
	 * 論理削除ＦＬＧの検索条件項目のチェックボックスを全てオンにする
	 */
	protected void setCndDelFlgOn() {
		for (MCCheckBox k : getCndDelFlgs()) {
			k.setValue(true);
		}
	}
	/**
	 * 論理削除ＦＬＧの検索条件項目のチェックボックスのどちらかが選択されているかチェックする
	 */
	public void checkAtLeastOneCndDelFlg(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(getCndDelFlgs()));
	}
	/**
	 * 論理削除ＦＬＧの検索条件項目のチェックボックスを返す
	 */
	protected MCCheckBox[] getCndDelFlgs() {
		List<MCCheckBox> l = new ArrayList<MCCheckBox>();
		if (getCndR() != null) {
			for (String col : getCndDelFlgCols()) {
				MCCheckBox k = (MCCheckBox)getComponent(getCndR(), col);
				if (k != null) {
					l.add(k);
				}
			}
		}
		return (MCCheckBox[])l.toArray(new MCCheckBox[0]);
	}
	/**
	 * 論理削除ＦＬＧの検索条件項目の名称を返す
	 */
	protected String[] getCndDelFlgCols() {
		return new String[]{"off_del_flg","on_del_flg"};
	}


	/**
	 * rowをコピーします。
	 * <p>
	 * キー項目及び、更新日時などはコピーされません。
	 */
	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		E dest = super.copyRow(t);
		if (dest != null) {
			dest = copyRowSub(dest);
			t.selectRowNoFocus(dest.getGUIIndex()-1);
			t.selectRowNoFocus(dest.getGUIIndex());
		}
		return dest;
	}

	/**
	 * rowを行コピー処理の後処理
	 * @param newRow 行コピーして新規に作成されたRow
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		if (isExistsTable(getDtlL())) {
			return getRLUtil().defCopyRowSub(row);
		}
		else {
			updColToNull(row);
		}
		return row;
	}

	/**
	 * listに対するテーブルが存在すればtrueを返します。
	 */
	protected boolean isExistsTable(MCList list) {
		JComponent c = getComponent(list);
		if (c instanceof MCTable) {
			return true;
		}
		return false;
	}

	/**
	 * 更新関係のカラムをクリアします。
	 */
	protected <E extends MCConstRow> void updColToNull(E dest) {
		if (dest == null) {
			return ;
		}

		String[] bkeyCols = getBeforeKeyColumns(dest.getKeys().toArray(new String[]{}));
		String[] delCols = MCCollectionUtil.concat(getRLUtil().getUpdColNames(),
				bkeyCols);
		for (String s : delCols) {
			MCMeta meta = dest.getMeta(s);
			if (meta == null) {
				continue;
			}
			else if (MCDataType.BOOLEAN == meta.type()) {
				dest.setValue(s, false);
			}
			else {
				dest.setValue(s, null);
			}
		}
	}

	/** キー変更を元に戻してよいかダイアログを出します。 */
	@Override
	public boolean confirmUndoKeyUpd() {
		return getRLUtil().defConfirmUndoKeyUpd();
	}

	// ////////////////
	// Dtlブロック関係
	// ////////////////
	/**リストDtlLに関連付けられるTableを返します。*/
	@Override
	// 戻り値のMCTableのジェネリクス
	public MCTable getDtlTable() {
		return getRLUtil().defGetDtlTable();
	}

	/**
	 * アプリケーションが使用するデフォルトのセルコンフィグ
	 * @deprecated 共通親クラスのみがオーバーライド呼び出し可能
	 */
	@Override
	public FXBAP_CellConfig createDefaultAppCellConfig() {
		return getRLUtil().defCreateDefaultAppCellConfig();
	}

	/**リストDtlLに関連付けられるTableをfillSpaceします。*/
	@Override
	public void fillSpace() {
		getRLUtil().defFillSpace();
	}

	/**
	 * @deprecated {@link #fillSpace()}で実装してください。
	 */
	@Deprecated 
	@Override
	protected void fillSpaceForOpen() {
		getRLUtil().defFillSpaceForOpen();
	}
	
	
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();
		getRLUtil().defSetSortColumn();
	}

	/** tableの項目のカラムコンフィグの配列を返します。 */
	@Override
	// MCTableのジェネリクス、MCListのジェネリクス
	public MCColumnConfig[] getColumnConfigs(MCTable t, String... cols) {
		return getRLUtil().defGetColumnConfigs(t, cols);
	}

	// -- イベント処理 -------------------------------------------
	/* (非 Javadoc)
	 * @see mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW#listenerInit()
	 */
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		MCTable<?> t = getDtlTable();

		if (t != null) {
			// Rowコンテナの値の変更を検知するためRowListnerをセットする
			setListListener(t, createRLRowListener());
	
			// ベース画面が保持しているＧＵＩ部品に対してはListernerが
			// 自動的にaddされているが、キー項目が部品の場合は、リスナー
			// がaddされていないので、addする必要がある
			for (MCColumnConfig c : getColumnConfigs(t, getDtlRKeyColumns())) {
				c.addVCListener(this);
			}
		}
	}

	protected MCRowListener createRLRowListener() {
		return new RLRowListener();
	}
	
	protected class RLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			dtlRowValueChanged(event);
		}
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 「選択」項目以外に変更があった場合に「選択」項目をオンにする
		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}
	}

	/**
	 * イベント発生項目が「選択」項目のときtrueを返す
	 */
	protected boolean isCheckColumn(MCRowEvent event) {
		return event.getColumn().equals(getCheckColumn());
	}

	/**
	 * 「選択」のカラム名（デフォルトは"check"。）
	 */
	public String getCheckColumn() {
		return "check";
	}

	/**
	 * イベント行の「選択」項目に値（boo）をセットする
	 */
	protected void setCheckValue(MCRowEvent event, boolean boo) {
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			r.setBoolean(getCheckColumn(), boo);
		}
	}

	
	// ///////////////////////////////////////////////
	// 操作種別関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		boolean boo = super.doVCEvent(vc, info);

		if (boo) {
			if (vc.getName().equals(getCndOpeName())) {
				boo = doCndOpeVC(info);
			}
		}

		return boo;
	}

	/**
	 * 「操作種別」のブロック＋項目名（デフォルトは"Cnd.ope"）
	 */
	protected String getCndOpeName() {
		return "Cnd.ope";
	}

	/**
	 * 「操作種別」の項目名（デフォルトは"ope"）
	 */
	protected String getOpeColumn() {
		return "ope";
	}

	/**
	 * 操作種別：「登録」の値（デフォルトは"0"）
	 */
	protected String getUpdOpeValue() {
		return "0";
	}
	/**
	 * 操作種別：「削除（管理者）」の値（デフォルトは"2"）
	 */
	protected String getDelOpeValue() {
		return "1";
	}

	/**
	 * 操作種別変更前の処理
	 */
	protected boolean doCndOpeVC(MCEventInfo info) {
		return checkAllTableClear();
	}

	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	protected boolean checkAllTableClear() {
		if (getDtlTable() == null) {
			return true;
		}
		MCList<?> list = getDtlTable().getList();
		return (list.isStatusNone() || confirmTableClear());
	}

	@Override
	public <R extends MCRow> MCList<R> exceptDeleteAndEmpty(MCList<R> list) {
		MCList<R> ans = list.createInstance();
		for (R row : list) {
			if (!row.isStatusDelete()) {
				// 固定カラムのみで判定
				if (!row.isEmpty(row.getConstNameArray())) {
					ans.add(row);
				}
			}
		}
		return ans;
	}

	@Override
	public <R extends MCRow> MCList<R> exceptEmpty(MCList<R> list) {
		MCList<R> ans = list.createInstance();
		for (R row : list) {
			// 固定カラムのみで判定
			if (!row.isEmpty(row.getConstNameArray())) {
				ans.add(row);
			}
		}
		return ans;
	}


	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc.getName().equals(getCndOpeName())) {
			doCndOpeNC(info);
		}
		else if (nc.getName().equals("Dtl.table")) {
			doDtlTableNC(info);
		}
	}

	/**
	 * 操作種別変更時の処理
	 */
	protected void doCndOpeNC(MCEventInfo info) {
		clearAll();
		setStatusByOpe();
		moveFocusCndPanel();
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	protected void clearAll() {
		if (getDtlL() != null) {
			getDtlL().clear();
		}
	}

	/**
	 * 画面クリアをした時のモード設定をします。
	 * <P>
	 * デフォルト実装： 実装仕様書で指定した画面ステータスにする
	 * </p>
	 */
	public void screenClearSetMode() {
		super.screenClearSetMode();
	
		setStatusColumnVisibleByStatus();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	protected void setStatusColumnVisibleByStatus() {
		if (!isNull(getCndR()) && getCndR().contains(getOpeColumn())) {
			JComponent c = this.getComponent(getDtlL());
			if (!(c == null) && !(getDtlTable() == null)) {
				if (isUpdOpe()) {
					getDtlTable().setStatusColumnVisible(true);
				}
				else if (isDelOpe()) {
					getDtlTable().setStatusColumnVisible(false);
				}
			}
		}
	}

	/**
	 * 操作種別によってステータスをセットし、ステータスカラムの表示・非表示を制御する
	 */
	protected void setStatusByOpe() {
		setStatusByOpeNotFillSpace();
		if (isUpdOpe()) {
			fillSpace();
		}
		setStatusColumnVisibleByStatus();
	}

	/**
	 * 操作種別によってステータスをセットする
	 */
	protected void setStatusByOpeNotFillSpace() {
		if (isUpdOpe()) {
			setUPDStatus();
		}
		else if (isDelOpe()) {
			setDELStatus();
		}
	}

	/** 検索枠の名称 */
	protected static final String CND_PANEL_NM = "Cnd";
	protected static final String CND_TAB_NM = "CndTab";
	protected static final String FOLD_TAB_NM = "Fold";

	/**
	 * フォーカスを検索枠に設定する
	 */
	public void moveFocusCndPanel() {
		// 検索枠がタブの場合、選択されているタブの最初にフォーカスを設定
		MCTabbedPane tab = (MCTabbedPane) getCndTab();
		if (tab == null) {
			tab = (MCTabbedPane) getTab(FOLD_TAB_NM);
		}
		if (tab != null) {
			tab.focusActiveFirstComponent();
			return ;
		}

		for (MCPanel p : getMCPanels()) {
			if (p.getName().equals(CND_PANEL_NM)) {
				p.focusFirstComponent();
			}
		}
	}

	protected Component getCndTab() {
		return getTab(CND_TAB_NM);
	}

	protected Component getTab(String tabNm) {
		for (MCPanel p : getMCPanels()) {
			if (p.getName().equals(tabNm)) {
				for (Component c : p.getComponents()) {
					if (c.getName() != null && c.getName().startsWith(tabNm)) {
						return c;
					}
				}
				return null;
			}
		}
		return null;
	}

	/**
	 * Dtlテーブル変更時の処理
	 */
	protected void doDtlTableNC(MCEventInfo info) {
		if (info.getEventIndex() < 0 || getDtlRdelBtn() == null) return;

		MCConstRow row = getDtlL().get(info.getEventIndex());

		if (row == null || !isUpdSts()) {
			getDtlRdelBtn().setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			getDtlRdelBtn().setMode(MCMode.DISABLE);
		}
		else {
			getDtlRdelBtn().setMode(this, getStatus());
		}
	}
	
	protected boolean isUpdSts() {
		return getStatus().equals(getUPDStatus());
	}

	protected MCButton getDtlRdelBtn() {
		return getRdelBtn(getDtlTable());
	}

	/**
	 * 引数のテーブルに対応する行削除ボタンを返す。
	 */
	protected MCButton getRdelBtn(MCTable t) {
		if (t == getDtlTable()) return getDefDtlRdelBtn();
		return null;
	}

	protected MCButton _defDtlRdelBtn;
	protected MCButton getDefDtlRdelBtn() {
		
		if (_defDtlRdelBtn == null) {
			MCButton[] a = MCBeansUtil.getAllComponents(MCButton.class, this);
			for (MCButton b : a) {
				if (b.getName().endsWith(".rdel")) {
					_defDtlRdelBtn = b;
					break;
				}
			}
		}
		return _defDtlRdelBtn;
	}
	// ///////////////////////////////////////////////
	// 操作種別関連（ここまで）
	// ///////////////////////////////////////////////
	
	
	// ///////////////////////////////////////////////
	// 選択チェック関連ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 全選択
	 * 指定テーブルの既存行・変更行を全選択する
	 */
	protected void doSelectAll(MCTable tab) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doSelectAll(tab, chkCol);
	}
	/**
	 * 全選択
	 * 指定テーブルの既存行・変更行を全選択する
	 */
	protected void doSelectAll(MCTable tab, MCColumnConfig chkCol) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			int i = row.getGUIIndex();
			// 空かどうかは固定カラムのみで判定
			if (isEditable(chkCol, i) && !row.isEmpty(row.getConstNameArray())) {
				setValueEx(chkCol, i, true);
			}
		}
	}

	/**
	 * 全選択解除
	 * 指定テーブルの全選択を解除する
	 */
	protected void doDeselectAll(MCTable tab) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doDeselectAll(tab, chkCol);
	}
	/**
	 * 全選択解除
	 * 指定テーブルの全選択を解除する
	 */
	protected void doDeselectAll(MCTable tab, MCColumnConfig chkCol) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			if (chkCol != null) {
				setValueEx(chkCol, row.getGUIIndex() , false);
			}
		}
	}

	protected MCColumnConfig getCheckColumnConfig(MCTable t) {
		for (MCColumnConfig c : t.getColumnConfigs()) {
			if (c.getRowColumnName().equals(getCheckColumn())) {
				return c;
			}
		}
		return null;
	}
	// ///////////////////////////////////////////////
	// 選択チェック関連ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ////////////////
	// その他
	// ////////////////
	/**
	 * DtlTableカラムのうち、指定カラムと変更前キー、更新関係のカラムを
	 * 除いたカラムコンフィグの配列を返します。
	 */
	@Override
	public MCColumnConfig[] getExptColumnConfigs(MCColumnConfig... cols) {
		return getRLUtil().defGetExptColumnConfigs(cols);
	}

	@Override
	public String[] getDtlRKeyColumns() {
		if (getDtlL() == null) {
			return new String[]{};
		}
		return getRLUtil().defGetDtlRKeyColumns();
	}

	/**
	 * 変更前キー項目名配列を返します。
	 */
	@Override
	public String[] getBeforeKeyColumns(String[] keyCols) {
		return getRLUtil().defGetBeforeKeyColumns(keyCols);
	}

	/**
	 * toStringWithMsgLabelで作成された配列を改行で連結したStringを返します。
	 */
	@Override
	public String toStringWithMsgLabelNoArray(int idx, MCColumnConfig... cols) {
		return getRLUtil().defToStringWithMsgLabelNoArray(idx, cols);
	}

	/**
	 * 指定された GUI 部品について、ＮＵＬＬ文字を確定できなくします。
	 *
	 * @param compos GUI 部品
	 */
	public void setExceptNULL_VAL(MCVCBeans... compos) {
		if (compos != null) {
			for (MCVCBeans compo : compos) {
				compo.addVCListener(getExceptVCListener());
			}
		}
	}

	/**
	 * ＮＵＬＬ文字入力制限用イベントリスナ
	 */
	protected MCVCListener _except_null_val_listener;

	/**
	 * ＮＵＬＬ文字入力制限用イベントリスナを返します。
	 *
	 * @return ＮＵＬＬ文字入力制限用イベントリスナ
	 */
	protected MCVCListener getExceptVCListener() {
		return _except_null_val_listener != null ? _except_null_val_listener
				: (_except_null_val_listener = new CPP_ExceptVCListener());
	}

	public class CPP_ExceptVCListener implements MCVCListener {

		@Override
		public boolean doVCEvent(MCVCBeans compo, MCEventInfo info) {
			Comparable<?> c = info.getNewValue();
			if (c instanceof String) {
				if (MAC_STR.NULL_VAL.value().equals((String) c)) {
					return false;
				}
			}
			return true;
		}
	}


	/**
	 * 指定されたパネルに設定されているディバイダーの位置を変更します。<br>
	 * @param panel ディバイダーの設定されているパネル
	 * @param pos ディバイダーの位置（パーセンテージ指定、0 ～ 1.0）
	 */
	protected void setDividerPos(MCPanel panel, double pos) {
		if (panel != null) {
			Container p = panel.getParent();
			while (p != null) {
				if (p instanceof MCSplitPane) {
					((MCSplitPane)p).setDividerLocation(pos);
					break;
				}
				p = p.getParent();
			}
		}
	}
	protected boolean _initSrch = false;

	@Override
	protected void setValueByScreenOpener() {
		_initSrch = false;
		setValueByScreenOpenerBefore();
		super.setValueByScreenOpener();
		setValueByScreenOpenerAfter();
	}

	/**
	 * {@link #setValueByScreenOpener()}の前処理です。
	 */
	protected void setValueByScreenOpenerBefore() {
		final MCScreenOpener so = getScreenOpener();
		if (so instanceof MAUCP_AppScreenOpener) {
			MCBehindEventInfo info = new MCBehindEventInfo() {
				@Override
				protected void doBehindEvent() {
					MAUCP_AppScreenOpener aso = (MAUCP_AppScreenOpener) so;
					if (aso.isPsnlInput()) {
						_initSrch = aso.isPsnlInputInitSrch();
						try {
							setUserSrchCndWithoutInitSrch();
						}
						catch (Exception e){
							_initSrch = false;
							throw e;
						}
					}
				}
			};
			addBehindEventInfo(info);
		}
	}

	/**
	 * パーソナライズによる検索条件を設定します。<p>
	 * この画面が埋込画面の場合は何もしません。
	 * 検索条件設定機能が無効になっている場合は何もしません。
	 *
	 * @see #ignoreSrchCnd()
	 */
	public void setUserSrchCndWithoutInitSrch() {
		if (isPartsPanel() || ignoreSrchCnd()) {
			return;
		}
		try {
			SrchCndInfo si = getSrchCndInfo();
			if (si == null) {
				si = getInitSrchCndInfo();
			}
			if (si != null) {
				_setSrchCndInfo(si);
				FXUCP_SrchCndUtil.updateCnd(this, si.getSrchCndList(), FXUCP_SrchCndUtil.getSrchCndBeans(this, true));
				FXUCP_SrchCndUtil.setInitFocus(this, si);
			}
		}
		catch (Exception e) {
			MCBeansUtil.handle(this, e);
		}
	}

	/**
	 * {@link #setValueByScreenOpener()}の後処理です。
	 */
	protected void setValueByScreenOpenerAfter() {
		MCBehindEventInfo info = new MCBehindEventInfo() {
			@Override
			protected void doBehindEvent() {
				if (_initSrch) {
					doUserSrchCndInitSrch();
				}
			}
		};
		addBehindEventInfo(info);
	}

	/**
	 * 入力値設定の初期検索に応じて検索を実行します。<p>
	 * この画面が埋込画面の場合は何もしません。
	 * 入力値設定機能が無効になっている場合は何もしません。
	 *
	 * @see #ignoreSrchCnd()
	 */
	public void doUserSrchCndInitSrch() {
		if (isPartsPanel() || ignoreSrchCnd()) {
			return;
		}
		if (!_initSrch) {
			return;
		}
		try {
			SrchCndInfo si = getSrchCndInfo();
			if (si == null) {
				si = getInitSrchCndInfo();
			}
			if (si != null) {
				_setSrchCndInfo(si);
				FXUCP_SrchCndUtil.doInitSrch(this, si);
			}
		}
		catch (Exception e) {
			MCBeansUtil.handle(this, e);
		}
		finally {
			_initSrch = false;
		}
	}

	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		linkBeansToISPanelCustom();
	}

	/**
	 * 入力補助画面の紐づけ（linkBeansToISPanel）を行います。
	 */
	protected void linkBeansToISPanelCustom() {
		for (Object[] args : MAUCP_BeansUtil.getLinkBeansToISPanelArgs(this)) {
			linkBeansToISPanel((MCLinkBeans) args[0], (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}

	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 * 
	 * @param beans GUI部品
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}

	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 * 
	 * @param beans GUI部品
	 * @param usingForInput beansに手入力した場合に入力補助画面を使って連携項目を取得する場合true
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans, boolean usingForInput) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2], usingForInput);
		}
	}
	
	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// リストロジック関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void customInit() {
		super.customInit();
		// setListLogicColumnMappingでは内部でListPutterを取得しているが、
		// ListPutterの関連付けが各アプリのオートクラスのlistInitで行われるため
		// listInitではなく、その後のcustomInitに実装しています。
		listInitCustom();
	}

	/**
	 * リストロジックのカラム名と画面のカラム名とが違う場合の関連付け<BR>
	 * ※画面実装仕様書に設定が必要。
	 */
	protected void listInitCustom() {
		MAUCP_BeansUtil.listInitCustom(this);
	}

	// ///////////////////////////////////////////////
	// リストロジック関連（ここまで）
	// ///////////////////////////////////////////////

	/**
	 * 会社情報を取得しキャッシュします。
	 *
	 * @return 会社情報
	 */
	public CoR getCo() {
		String key = "MA.MAUDP0010.CO";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getCoNoCache());
		}
		return (CoR) getCachedSysInfo(key);
	}
	
	@Override
	public String getSysParm(String parm_key) {
		String key = "MA.MAUDP0010.SYS_PARM.";
		if (!isCachedSysInfo(key + parm_key)) {
			for(SysParmR r: getSysParmAllNoCache()){
				cacheSysInfo(key + r.parm_key(), r.parm_val());
			}
		}
		return (String) getCachedSysInfo(key + parm_key);
	}
	
	/**
	 * @deprecated 各画面での使用は推奨されません。
	 */
	@Override
	public void afterInit() {

		setInvisibleBySysParam();

		super.afterInit();
	}

	/**
	 * システムパラメータによって項目を非表示にします。<br>
	 * 実装仕様書のコンテナ属性ＩＤ「DISP_CTL」に下記のキーを指定すると<br>
	 * 対応するシステムパラメータがオフの場合に項目を非表示にします。<br>
	 * 「DISP_CTL」に「_DISP」の設定がある場合は、非表示対象外とします。<br>
	 * <br>
	 * 「CONT_FCTR」（有効成分）：CONT_FCTR_ENABLE_FLG<br>
	 * 「VER_NO」（版）：VER_ENABLE_FLG<br>
	 * 「MFG_APRV」（製造承認）：MFG_APRV_ENABLE_FLG<br>
	 * 「YIELD」（収率）：YIELD_ENABLE_FLG<br>
	 */
	protected void setInvisibleBySysParam() {
		MCBeans[] a = MAUCP_BeansUtil.getInvisibleBySysParam(this);
		setComponentInvisibleAllStatus(a);
		MAUCP_BeansUtil.setModeBeansDefaultByDispCtl(this);
	}
	
	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 引数をループして、 {@link #setComponentInvisibleAllStatus(MCBeans)}
	 * を呼び出します。
	 *
	 * @see #setComponentInvisibleAllStatus(MCBeans)
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans... beans) {
		if (beans == null) {
			return;
		}
		for (MCBeans b : beans) {
			setComponentInvisibleAllStatus(b);
		}
	}

	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 注意事項<br>
	 * 引数にセットしたコンポーネントに対して {@link MCModeBeans#setMode}
	 * をすると、そのモードになります。その後、画面ステータスが変わると
	 * 非表示になります。<br>
	 * タブの構成要素であるMCPanelを引数にセットすると、タブペインからMCPanelを
	 * 除去します。結果、 {@link MCTabbedPane#indexOfComponent(Component)}が
	 * -1 を返すようになります。<br>
	 * </p>
	 *
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans beans) {
		MAUCP_BeansUtil.setComponentInvisibleAllStatus(beans, getPanelLayerList(), this);
	}



	/**
	 * 参照登録時のRowステータスを変更するメソッド
	 * containers をListに格納し直して実行（ヘッダ、明細対応）
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void setRowStatusForIns(MCContainer... containers) {
		List<MCContainer> l = new ArrayList<MCContainer>();
		for (MCContainer c :containers) {
			l.add(c);
		}
		setRowStatusForIns(l);
	}
	/**
	 * 参照登録時のRowステータスを変更するメソッド
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void setRowStatusForIns(List<MCContainer> containers) {
		for (MCContainer cont : containers) {
			if (cont instanceof MCList) {
				MCList<?> ls = (MCList<?>) cont;
				ls.removeAll(ls.subList(MCRow.DELETE));
				ls.setStatus(MCRow.CREATE);
			}
			else if (cont instanceof MCRow) {
				MCRow row = (MCRow) cont;
				if (!row.isEmpty()) {
					row.setStatus(MCRow.CREATE);
				}
			}
		}
	}

	/**
	 * 参照登録時の引き継がない項目をクリアするメソッド
	 */
	protected void clearNotInheritInfo(MCContainer cont) {
		List<String> cols = getNotInheritCols(cont);
		cont.clear(cols.toArray(new String[0]));
	}
	/**
	 * 参照登録時の引き継がない項目名を返すメソッド
	 * システム情報は追加済みです。
	 */
	protected List<String> getNotInheritCols(MCContainer cont) {
		List<String> l = new ArrayList<>();

		if (cont instanceof MCList) {
			MCList<?> ls = (MCList<?>) cont;
			l = Arrays.asList(ls.createRow().getColumnPathArray());
		}
		else if (cont instanceof MCRow) {
			MCRow row = (MCRow) cont;
			l = Arrays.asList(row.getColumnPathArray());
		}

		List<String> colL = new ArrayList<>();
		// システム情報
		for (String col : getSystemInfoCols()) {
			if (l.contains(col)) {
				colL.add(col);
			}
		}
		// 更新カウンタ
		for (String col : l) {
			if (cont.getMeta(col).metaEquals(mcframe.commonMA.meta.MA_META.UPD_CNT)) {
				colL.add(col);
			}
		}

//		colL.add(DtlR.$bom_key);
//		colL.add(DtlR.$bom_key_key);
//		colL.add(DtlR.$chng_no);
//		colL.add(DtlR.$ext_sys_no_bom);
		
		return colL;
	}
	/**
	 * システム情報の項目名を返すメソッド
	 */
	protected String[] getSystemInfoCols() {
		return new String[] {
				INS_USR_ID, INS_USR_NM, INS_TS, INS_FUNC_ID, INS_FUNC_NM, UPD_CNTR,
				UPD_USR_ID, UPD_USR_NM, UPD_TS, UPD_FUNC_ID, UPD_FUNC_NM, UPD_SRV_REQ_NO,
				DEL_USR_ID, DEL_USR_NM, DEL_TS
		};
	}

	protected final String INS_USR_ID = "ins_usr_id";
	protected final String INS_USR_NM = "ins_usr_nm";
	protected final String INS_TS = "ins_ts";
	protected final String INS_FUNC_ID = "ins_func_id";
	protected final String INS_FUNC_NM = "ins_func_nm";
	protected final String UPD_CNTR = "upd_cntr";
	protected final String UPD_USR_ID = "upd_usr_id";
	protected final String UPD_USR_NM = "upd_usr_nm";
	protected final String UPD_TS = "upd_ts";
	protected final String UPD_FUNC_ID = "upd_func_id";
	protected final String UPD_FUNC_NM = "upd_func_nm";
	protected final String UPD_SRV_REQ_NO = "upd_srv_req_no";
	protected final String DEL_USR_ID = "del_usr_id";
	protected final String DEL_USR_NM = "del_usr_nm";
	protected final String DEL_TS = "del_ts";
	/**
	 * システムパラメータDEF_WG_CDが設定されている場合、登録対象の「共通」、「WG」をREAD_ONLYの状態にします。<br>
	 * READ_ONLYになった場合、画面遷移元から対象項目に値が連携されません。<br>
	 * @param cmn_flg 共通のMCCheckBox
	 * @param wg_flg WGのMCCheckBox
	 */
	protected void setRegTgtModeByDefWgCd(MCCheckBox cmn_flg, MCCheckBox wg_flg) {
		String dispKeyWg = "WG";
		if (!isNull(getSysParm("DEF_WG_CD"))) {
			cmn_flg.setMode(MCMode.READ_ONLY);
			wg_flg.setMode(MCMode.READ_ONLY);
			if (_dispctl2Comps == null) {
				_dispctl2Comps = new HashMap<>();
				_dispctl2Comps.put(dispKeyWg, new HashSet<>());
			}
			HashSet<MCModeBeans> s = _dispctl2Comps.get(dispKeyWg);
			s.add(cmn_flg);
			s.add(wg_flg);
		}
	}

	/**
	 * システムパラメータDEF_WG_CDが設定されている場合、登録対象の「共通」をOFF、「WG」をONの状態にします。
	 * @param cmn_flg 共通のMCCheckBox
	 * @param wg_flg WGのMCCheckBox
	 */
	protected void initRegTgtByDefWgCd(MCCheckBox cmn_flg, MCCheckBox wg_flg) {
		if (!isNull(getSysParm("DEF_WG_CD"))) {
			cmn_flg.setValue(true);
			wg_flg.setValue(false);
		}
	}

	// ///////////////////////////////////////////////
	// 単票画面ヘッダスクロールバー追加関連（ここから）
	// ///////////////////////////////////////////////

	@Override
	public void layoutInit() {
		boolean initialized = isLayoutInitialized();
		
		super.layoutInit();

		MCPanel panel = getOpeHdrPanel();
		if (panel != null) {
			MCScrollPane sp = null;

			Container parent = panel.getParent();
			LayoutManager layout = parent.getLayout();
			Component[] compos = parent.getComponents();
			if (layout instanceof BorderLayout) {
				BorderLayout bl = (BorderLayout)layout;
				Object[] consts = new Object[compos.length];
				for (int i = 0; i < compos.length; i++) {
					consts[i] = bl.getConstraints(compos[i]);
				}

				parent.removeAll();

				sp = beansFactory.createScrollPane("_for_header");
				sp.setViewportView(panel);

				for (int i = 0; i < compos.length; i++) {
					parent.add(compos[i] == panel ? sp : compos[i], consts[i]);
				}
			}
			else if (layout instanceof BoxLayout) {
				parent.removeAll();

				sp = beansFactory.createScrollPane("_for_header");
				sp.setViewportView(panel);

				for (int i = 0; i < compos.length; i++) {
					parent.add(compos[i] == panel ? sp : compos[i]);
				}
			}

			if (sp != null) {
				int w = sp.getVerticalScrollBar().getPreferredSize().width;
				Dimension ps = getPreferredSize();
				setPreferredSize(new Dimension(ps.width + w, ps.height));
				
				if (!initialized) {
					Dimension fs = getFrame().getSize();
					getFrame().setSize(fs.width + w, fs.height);
				}
			}
		}

		panel = getSplitPaneTopPanel();
		if (panel != null) {
			Container p = panel.getParent();
			while (p != null) {
				if (p instanceof MCSplitPane) {
					int pos = getOpeTopPanelDividerLocation();
					if (((MCSplitPane)p).getDividerLocation() > pos) {
						((MCSplitPane)p).setDividerLocation(pos);
					}
					break;
				}
				p = p.getParent();
			}
		}

	}

	/**
	 * 単票画面のヘッダパネルを返します。
	 */
	protected MCPanel getOpeHdrPanel() {
		return null;
	}

	/**
	 * スプリットペインのTOPに配置されるパネルを返します。
	 */
	protected MCPanel getSplitPaneTopPanel() {
		return null;
	}

	/**
	 * 単票画面のヘッダと明細を分割するスプリットペインのディバイダ位置を返します。
	 * <p>
	 * デフォルトは300です。
	 * 変更する場合はMCAppClientリソースに[MODULE_ID].[SCREEN_ID].ope.top.divider.locationを設定してください。
	 */
	protected int getOpeTopPanelDividerLocation() {
		int def = 300;
		return getPgmSettingIntNE(this, def, "ope.top.divider.location");
	}

	// ///////////////////////////////////////////////
	// 単票画面ヘッダスクロールバー追加関連（ここまで）
	// ///////////////////////////////////////////////

	@Override
	public Set<String> getDispCtl2CompsKeys() {
		if (_dispctl2Comps != null) {
			return new HashSet<String>(_dispctl2Comps.keySet());
		}
		return null;
	}
	@Override
	public Set<MCModeBeans> getDispCtl2CompsValue(String sysParmKey) {
		if (_dispctl2Comps != null) {
			return new HashSet<MCModeBeans>(_dispctl2Comps.get(sysParmKey));
		}
		return null;
	}

}