package mcframe.clientMAUD.MAUDP1020;

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

import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import javax.swing.JComponent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_LCLRLBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_LCLRLBase_MC extends MAUDP_LCLRLBase_MC_A implements IfLCLRLBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**ロケールＣＤの項目名*/
	protected static final String $LCL_CD_COL_PATH_SUFIX = ".lcl_cd";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_LCLRLBase_MC() {
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
	protected MAUDP_LCLRLUtil _LCLRLUtil;

	protected MAUDP_LCLRLUtil getLCLRLUtil() {
		if (_LCLRLUtil == null) {
			_LCLRLUtil = createInputSupportUtil();
		}
		return _LCLRLUtil;
	}

	protected MAUDP_LCLRLUtil createInputSupportUtil() {
		MAUDP_LCLRLUtil p = new MAUDP_LCLRLUtil();
		p.setPanel(this);
		return p;
	}

	// IfRLBase 関連（ここから） ///////////////////////////////////////////////

	/**
	 * 全ての検索結果を格納するリスト。非表示。
	 */
	@Override
	public abstract MCList<? extends MCConstRow> getLclAllL();

	/**
	 * 検索結果を表示し、値の編集を行うリスト。
	 * <P>テーブルに紐づくリストを指定する必要がある。</P>
	 */
	@Override
	public abstract MCList<? extends MCConstRow> getLclL();

	protected MCTable _lclTable = null;
	/**
	 * リストDtlLに関連付けられるTableを返します。
	 */
	@Override
	// 戻り値のMCTableのジェネリクス
	public MCTable getLclTable() {
		if (_lclTable == null) {
			_lclTable = getLCLRLUtil().defGetLclTable();
		}
		return _lclTable;
	}


	@Override
	public String[] getLclRKeyColumns() {
		return getLCLRLUtil().defGetLclRKeyColumns();
	}

	// IfRLBase 関連（ここまで） ///////////////////////////////////////////////


	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();
		getLCLRLUtil().defSetSortColumn();
	}

	/**Dtl行ＮＯ（Dtl行とLcl行の関連付け）*/
	protected static final String DTL_ROW_NO_COL_NM = "dtl_row_no";
	protected MCNumber _dtlRowNo;

	@Override
	protected void tableInit() {
		super.tableInit();
		getLclAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getLclL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getDtlL().setNumberNE(DTL_ROW_NO_COL_NM, null);
	}
	
	/**
	 * Dtl行ＮＯのセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	protected void setDtlRowNoAll() {
		String[] keyCols = null;
		if (getDtlL().size() > 0) {
			keyCols = getAliasCols(getDtlRKeyColumns(), getDtlL().get(0));
		}
		MCIndexKey idxkey = getLclAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			setDtlRowNo(dtlR, no);

			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				setDtlRowNo(lclR, no);
			}
		}
	}
	/**
	 * Dtl行ＮＯをカウントアップして返す。
	 */
	protected MCNumber getCntDtlRowNo() {
		if (_dtlRowNo == null) {
			_dtlRowNo = MCNumber.ZERO;
		}
		else {
			_dtlRowNo = _dtlRowNo.add(1);
		}
		return _dtlRowNo;
	}
	protected void setDtlRowNo(MCRow row, MCNumber no) {
		row.setNumberNE(DTL_ROW_NO_COL_NM, no);
	}
	/**
	 * Dtl行のDtl行ＮＯを返す。
	 * Dtl行ＮＯカラムが無い場合は追加して返す。
	 */
	protected MCNumber getDtlRowNo(MCConstRow dtlR) {
		MCNumber no = dtlR.getNumberNE(DTL_ROW_NO_COL_NM);
		if (no == null) {
			no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);
		}
		return no;
	}
	/**
	 * Dtl行に関連付けられたLcl行のリストを返す。
	 */
	protected MCList<? extends MCConstRow> getLclListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getLclAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<? extends MCConstRow> lclL = getLclAllL().subList(idxkey, no);
		return lclL;
	}

	/**
	 * Dtlの行削除のとき、LclAllから関連する行を全て削除する
	 * Lclの行削除のとき、LclAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(
			MCTable<E> table) {
		if (table == getDtlTable()) {
			getLclTable().clear();
		}
		E delR = super.deleteRow(table);
		if (table == getDtlTable() && delR != null) {
			getLclAllL().removeAll(getLclListForDtlR(delR));
		}
		if (table == getLclTable() && delR != null) {
			getLclAllL().remove(delR);
			
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == getDtlTable()) {
			// 行コピーで上一覧の選択行が変更される前に、下一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, getLclTable(), getLclRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}

		E r = super.copyRow(t);

		if (r != null) {
			int i = t.getList().indexOf(r);
			if (i >= 0) {
				t.selectRow(t.getList().indexOf(r));
			}
		}
		
		return r;
	}
	
	/**
	 * 行コピー時にカウントアップしたDtl行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getLclL().contains(dest)) {
			getLclRdelBtn().setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			MCNumber no = getCntDtlRowNo();
			setDtlRowNo(row, no);
			getDtlRdelBtn().setMode(this, getStatus());
			getLclTable().clear();
			getLclTable().fillSpace();
			getLclTable().adjustWidth();
			getLclTable().selectLeftmostColumn(0);
		}
		return dest;
	}

	/**
	 * イベント発生項目が「Dtl行番号」項目のときtrueを返す
	 */
	protected boolean isDtlRowNoColumn(MCRowEvent event) {
		return event.getColumn().equals(DTL_ROW_NO_COL_NM);
	}
	
	// -- イベント処理 -------------------------------------------
	/* (非 Javadoc)
	 * @see mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW#listenerInit()
	 */
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		MCTable<?> t = getLclTable();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(t, createLCLRLRowListener());

		// ベース画面が保持しているＧＵＩ部品に対してはListernerが
		// 自動的にaddされているが、キー項目が部品の場合は、リスナー
		// がaddされていないので、addする必要がある
		for (MCColumnConfig c : getColumnConfigs(t, getLclRKeyColumns())) {
			c.addVCListener(this);
		}
	}

	@Override
	protected MCRowListener createRLRowListener() {
		return new RLRowListener();
	}

	protected class RLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			dtlRowValueChanged(event);
		}
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 変更があった場合に「選択」項目をオンにする
		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
			setKeyChangeToLcl(event);
		}
		else {
			setAllLclCheckOff(event);
		}
	}

	/**
	 * Dtl のイベント行のキー項目に変更があった場合、Lclの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToLcl(MCRowEvent event) {
		String eventCol = event.getColumn();
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow lclR : getLclListForDtlR(dtlR)) {
				lclR.setValueNE(col, dtlR.getValueNE(col));
				if (lclR.isStatusNone() && !isNull(lclR.getValueNE(getUpdCntrColumn()))) {
					lclR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての Lcl の「選択」項目をオフにする
	 */
	protected void setAllLclCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getLclL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getLclListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	
	protected MCRowListener createLCLRLRowListener() {
		return new LCLRLRowListener();
	}
	
	protected class LCLRLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			lclRowValueChanged(event);
		}
	}

	/**
	 * Lcl のRowListennerに変更があったときの処理
	 */
	protected void lclRowValueChanged(MCRowEvent event) {
		// 変更があった場合に「選択」項目をオンにする
		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedLclRowToAll(event);
		setCheckValueDtl(event);
	}

	/**
	 * Lclイベント行の選択がオンのとき、lclAllL に存在しないものを追加する
	 * その際、dtlR のキー項目をコピーする
	 */
	protected void addCheckedLclRowToAll(MCRowEvent event) {
		MCConstRow lclR = event.getSourceRow();
		MCConstRow dtlR = getDtlTable().getSelectedMCRow();
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);
		MCList<MCConstRow> lclAllL = (MCList<MCConstRow>) getLclAllL();

		if (lclR.getBooleanNE(getCheckColumn())) {
			if (!getLclAllL().contains(lclR)) {
				// ここで行追加（最後にやると、値の設定時にリストリスナが走って、そのたびにこのメソッドが呼ばれて、行が増殖する
				lclAllL.add(lclR);
				for (String c : getDtlRKeyColumns()) {
					String col = getAliasCol(c, dtlR);
					lclR.setValueNE(col, dtlR.getValueNE(col));
				}
				setDtlRowNo(lclR, no);
			}
		}
	}
	/**
	 * 指定したカラムの配列中ににエイリアスが設定されているカラムがあればエイリアス名に変換して返す。（部品対応）
	 */
	protected String[] getAliasCols(String[] cols, MCRow row) {
		ArrayList<String> l = new ArrayList<String>();
		for (String col : cols) {
			l.add(getAliasCol(col, row));
		}
		return (String[])l.toArray(new String[0]);
	}
	/**
	 * 指定したカラムにエイリアスが設定されている場合にエイリアス名を返す。（部品対応）
	 */
	protected String getAliasCol(String col, MCRow row) {
		String[] cols = row.getAlias(col);
		return cols.length == 0 ? col : cols[0];
	}

	/**
	 * イベント行(Lcl)がオンになったとき、対応する行(Dtl)が未登録なら「選択」項目をオンにする
	 */
	protected void setCheckValueDtl(MCRowEvent event) {
		MCConstRow lclR = event.getSourceRow();
		if (lclR.getBoolean(getCheckColumn())) {

			MCConstRow r = getDtlTable().getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getLclL().clear();
		getLclAllL().clear();
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc.getName().equals("Lcl.table")) {
			doLclTableNC(info);
		}
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (!isNull(getCndR()) && getCndR().contains(getOpeColumn())) {
			JComponent c = this.getComponent(getLclL());
			if (!(c == null) && !(getLclTable() == null)) {
				if (isUpdOpe()) {
					getLclTable().setStatusColumnVisible(true);
				}
				else if (isDelOpe()) {
					getLclTable().setStatusColumnVisible(false);
				}
				else if (isUpdAdminOpe()) {
					getLclTable().setStatusColumnVisible(true);
				}
				else if (isModOpe()) {
					getLclTable().setStatusColumnVisible(true);
				}
				else if (isRefOpe()) {
					getLclTable().setStatusColumnVisible(false);
				}
			}
		}
	}

	/**
	 * Lclテーブル変更時の処理
	 */
	protected void doLclTableNC(MCEventInfo info) {
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getLclL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			getLclRdelBtn().setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			getLclRdelBtn().setMode(MCMode.DISABLE);
		}
		else {
			getLclRdelBtn().setMode(this, getStatus());
		}
	}

	protected MCButton getLclRdelBtn() {
		return getRdelBtn(getLclTable());
	}

	protected MCButton getRdelBtn(MCTable t) {
		if (t == getLclTable()) return getDefLclRdelBtn();
		return super.getRdelBtn(t);
	}

	protected MCButton _defLclRdelBtn;
	protected MCButton getDefLclRdelBtn() {
		
		if (_defLclRdelBtn == null) {
			MCButton[] a = MCBeansUtil.getAllComponents(MCButton.class, this);
			for (MCButton b : a) {
				if (b.getName().endsWith("LclBtn.rdel")) {
					_defLclRdelBtn = b;
					break;
				}
			}
		}
		return _defLclRdelBtn;
	}
	
	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshLclAllL();
		
		MCConstRow r = getDtlL().get(info.getEventIndex());

		// Dtl の選択行のキー項目と一致するレコードを LclAllL から取得して LclTableに表示
		MCList<? extends MCConstRow> l = getLclListForDtlR(r);
		getLclTable().getList().setAll(l);
		sort(getLclTable());
		getLclTable().fillSpace();
		getLclTable().adjustWidth();
		getLclTable().selectRowNoFocus(0);
	}

	/**
	 * Lclテーブルの現状をLclAllに反映する
	 */
	protected void refreshLclAllL() {
		if (getLclL().size() == 0) {
			return ;
		}
		MCNumber no = null;
		for (MCConstRow r : getLclL()) {
			if (r.getNumberNE(DTL_ROW_NO_COL_NM) != null) {
				no = r.getNumberNE(DTL_ROW_NO_COL_NM);
				break;
			}
		}
		if (no == null) {
			return ;
		}
		MCList<? extends MCConstRow> l = getLclL().subList(createDtlRowNoMatcher(no));
		if (l.size() > 0) {
			MCList<MCConstRow> lclAllL = (MCList<MCConstRow>) getLclAllL();
			MCList<? extends MCConstRow> removeL = lclAllL.subList(createDtlRowNoMatcher(no));
			lclAllL.removeAll(removeL);
			lclAllL.addAll(l);
		}
	}

	protected DtlRowNoMatcher createDtlRowNoMatcher(MCNumber no) {
		return new DtlRowNoMatcher(no);
	}

	public class DtlRowNoMatcher implements MCRowMatcher {

		protected MCNumber _no;

		protected DtlRowNoMatcher(MCNumber no) {
			_no = no;
		}

		public boolean match(MCRow r) {
			MCNumber n = r.getNumberNE(DTL_ROW_NO_COL_NM);
			return !isNull(n) && n.eq(_no);
		}
	}

	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	@Override
	protected boolean checkAllTableClear() {
		if (getDtlTable() == null) {
			return false;
		}
		if (getLclTable() == null) {
			return false;
		}
		MCList<?> dtlL = getDtlTable().getList();
		MCList<?> lclL = getLclTable().getList();
		return ((dtlL.isStatusNone() && lclL.isStatusNone()) || confirmTableClear());
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		boolean boo = super.doVCEvent(vc, info);

		if (boo) {
			if (vc.getName().equals("Dtl.table")) {
				boo = doDtlTableVC(info);
			}
		}

		return boo;
	}

	protected boolean doDtlTableVC(MCEventInfo info) {

		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l = getLclL().subList(getCheckColumn(), true);
		if (!l.isEmpty()) {
			MCMessageList msgList = checkReq(getDtlTable().getSelectedMCRow());
			if (msgList.size() > 0) {
				message(msgList);
				return false;
			}
		}

		// lclL が切り替わる前に必須チェックを行う
		MCMessageList msgList = checkReq(getLclTable(), l);
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, getLclTable(), getLclRKeyColumns());
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}

}