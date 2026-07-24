package mcframe.clientMABS.MABSP1060;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.container.MCRowEvent;
import java.util.*;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_SetItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_SetItmReg_MC extends MABSP_SetItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**行ＮＯ（仕様項目行と仕様項目名称行の関連付け）*/
	protected static final String _SET_ITM_DTL_ROW_NO_COL_NM = "desc_dtl_row_no";

	/**行ＮＯ（仕様項目行と仕様項目名称行の関連付け）*/
	protected MCNumber _SetItmDtlRowNo;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SetItmReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_SetItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Srch01Caller<P extends MABSP_SetItmReg, B extends MA_MABSL1060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABSL1060_Srch01Caller(P p, B b) {
			super(p, b);
		}

		protected void adjustList() {
			super.adjustList();
			DtlSetItmTable.adjustWidth();
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlSetItmL().clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
	}

	/**
	 * [MA_MABSL1060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Upd01Caller<P extends MABSP_SetItmReg, B extends MA_MABSL1060_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABSL1060_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, DtlSetItmTable);
		}

		@Override
		protected void setPickedListMap() {
			refreshDtlDtlSetItmAllL();
			super.setPickedListMap();
		}

		@Override
		protected void statusClear() {
			super.statusClear();
			DtlSetItmTable.getList().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABSL1060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Del01Caller<P extends MABSP_SetItmReg, B extends MA_MABSL1060_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABSL1060_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL1060_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtnSetItm]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnSetItm_select_all(MCEventInfo info) {
		doSelectAll(DtlSetItmTable);
	}
	/**
	 * Panel[DtlBtnSetItm]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnSetItm_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlSetItmTable);
	}
	/**
	 * Panel[DtlBtnSetItm]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtnSetItm_radd(MCEventInfo info) {
		insertRow(DtlSetItmTable);
	}
	/**
	 * Panel[DtlBtnSetItm]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtnSetItm_rdel(MCEventInfo info) {
		deleteRow(DtlSetItmTable);
	}
	/**
	 * Panel[DtlBtnSetItm]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtnSetItm_rcopy(MCEventInfo info) {
		copyRow(DtlSetItmTable);
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABSL1060_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL1060_Del01();
	}


	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {

		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

	/**
	 * DtlのRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		if (!isCheckColumn(event)) {
			setKeyChangeToDtlSetItm(event);
		}
		else {
			setAllDtlSetItmCheckOff(event);
		}
	}
	
	/* 品揃G ⇒ 品揃の対応  */
	/**
	 * Dtlのイベント行のキー項目に変更があった場合、DtlSetItmの選択カラムがオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlSetItm(MCRowEvent event) {
		String eventCol = event.getColumn();

		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow SetItmR : getSetItmListForDtlR(dtlR)) {
				SetItmR.setValueNE(col, dtlR.getValueNE(col));
				if (SetItmR.isStatusNone() && !isNull(SetItmR.getValueNE(getUpdCntrColumn()))) {
					SetItmR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	/**
	 * Dtlのイベント行の「選択」項目がオフのとき、対応する全ての DtlSetItmの「選択」項目をオフにする
	 */
	protected void setAllDtlSetItmCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getDtlSetItmL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getSetItmListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}

	/**
	 * Dtl行に関連付けられたSetItmCreateIndex行のリストを返す。
	 */
	protected MCList<DtlSetItmR> getSetItmListForDtlR(MCConstRow dtlR) {

		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getDtlSetItmAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlSetItmR> strLnL = getDtlSetItmAllL().subList(idxkey, no);
		return strLnL;
	}

	protected MCRowListener createDtlSetItmRowListener() {
		return new DtlSetItmRowListener();
	}

	protected class DtlSetItmRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			if (isDtlSetItmDtlRowNoColumn(event)) {
				return ;
			}

			DtlSetItmRowValueChanged(event);
		}
	}

	/**
	 * DtlSetItmのRowListennerに変更があったときの処理
	 */
	protected void DtlSetItmRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedDtlSetItmRowToAll(event);
		setCheckValueDtl(event);
	}

	/* 品揃 ⇒ 品揃(All)の対応 */
	/**
	 * DtlSetItmイベント行の選択がオンのとき、DtlSetItmAllLに存在しないものを追加する
	 * その際、dtlSetItmRのキー項目をコピーする
	 */
	protected void addCheckedDtlSetItmRowToAll(MCRowEvent event) {

		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlSetItmR)){
			return;
		}
		DtlSetItmR DtlSetItmR = (DtlSetItmR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();

		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (DtlSetItmR.getBooleanNE(getCheckColumn())) {
			if (!getDtlSetItmAllL().contains(DtlSetItmR)) {
				getDtlSetItmAllL().add(DtlSetItmR);
				DtlSetItmR.set_grp_cd(dtlR.set_grp_cd());
				DtlSetItmR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	/**
	 * DtlSetItmの行削除のとき、DtlSetItmAllから関連する行を全て削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			DtlSetItmTable.clear();
			LclTable.clear();
		}

		E delR = super.deleteRow(table);

		if (table == getDtlTable() && delR != null) {
			getDtlSetItmAllL().removeAll(getSetItmListForDtlR(delR));
		}
		if (table == DtlSetItmTable && delR != null) {
			getDtlSetItmAllL().remove(delR);
		}

		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {

		if (t == DtlTable) {
			// 行コピーで品揃G一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getLclRKeyColumns());
			checkDuplicate(msgList, DtlSetItmTable, getSetItmRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}

		return super.copyRow(t);
	}

	/**
	 * 行コピー時にカウントアップしたDtlSetItm行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);

		if (dest != null && getDtlSetItmL().contains(dest)) {

			MCNumber no = getCntDtlSetItmRowNo();
			row.setNumberNE(_SET_ITM_DTL_ROW_NO_COL_NM, no);
			DtlBtnSetItm_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			DtlBtnSetItm_rdel.setMode(this, getStatus());
		}

		return dest;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlSetItmTable, createDtlSetItmRowListener());
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		getDtlSetItmAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		setDividerPos(TopDtlPanel, 0.5);
	}

	/**
	 * 各テーブル間の紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	@Override
	protected void setDtlRowNoAll() {

		String[] keyCols = null;
		if (getDtlL().size() > 0) {
			keyCols = getAliasCols(getDtlRKeyColumns(), getDtlL().get(0));
		}
		MCIndexKey idxkey = getLclAllL().createIndex(keyCols);
		MCIndexKey setItmIdxkey = getDtlSetItmAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {

			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			// 品揃G（ロケール）
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}

			// 品揃
			l = getDtlSetItmAllL().subList(setItmIdxkey, binds);
			for (MCConstRow SetItmR : l) {
				SetItmR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	@Override
	public void doDtlSetItm_NC(MCEventInfo info) {
		super.doDtlSetItm_NC(info);

		if (info.getEventIndex() < 0) return;

		MCConstRow row = getDtlSetItmL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			DtlBtnSetItm_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			DtlBtnSetItm_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtnSetItm_rdel.setMode(this, getStatus());
		}
	}

	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshDtlDtlSetItmAllL();

		DtlR r = DtlTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを DtlDtlSetItmAllL から取得して DtlSetItmTableに表示
		MCList<DtlSetItmR> l1 = getSetItmListForDtlR(r);
		getDtlSetItmL().setAll(l1);
		DtlSetItmTable.fillSpace();
		DtlSetItmTable.adjustWidth();
		DtlSetItmTable.selectRowNoFocus(0);
	}

	/**
	 * DtlSetItmテーブルの現状をDtlSetItmAllに反映する
	 */
	protected void refreshDtlDtlSetItmAllL() {
		if (getDtlSetItmL().size() == 0) {
			return ;
		}
		MCList<DtlSetItmR> l = MCList.create(DtlSetItmR.class);
		for (DtlSetItmR r : getDtlSetItmL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlSetItmR> removeL = getDtlSetItmAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getDtlSetItmAllL().removeAll(removeL);
			getDtlSetItmAllL().addAll(l);
		}
	}

	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();

		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l2 = getDtlSetItmL().subList(getCheckColumn(), true);

		if (!l1.isEmpty() || !l2.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// lclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getLclRKeyColumns());

		// DtlSetItmL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlSetItmTable, l2));
		// DtlSetItmL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlSetItmTable, getSetItmRKeyColumns());

		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}

	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlSetItmTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe()) {
			DtlSetItmTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DtlSetItmTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();

		getDtlSetItmL().clear();
		getDtlSetItmAllL().clear();
	}

	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(DtlSetItmTable, getSetItmRKeyColumns())) {
			DtlSetItmTable.addSortColumn(c, MCList.SortType.ASC);
		}
	}

	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	@Override
	protected boolean checkAllTableClear() {
		if (DtlTable == null) {
			return false;
		}
		if (LclTable == null) {
			return false;
		}
		if (DtlSetItmTable == null) {
			return false;
		}

		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() && getDtlSetItmL().isStatusNone()) || confirmTableClear());
	}	

	/**
	 * イベント発生項目が「Dtl行番号」項目のときtrueを返す
	 */
	protected boolean isDtlSetItmDtlRowNoColumn(MCRowEvent event) {
		return event.getColumn().equals(_SET_ITM_DTL_ROW_NO_COL_NM);
	}

	/**
	 * DtlSetItm行ＮＯをカウントアップして返す。
	 */
	protected MCNumber getCntDtlSetItmRowNo() {

		if (_SetItmDtlRowNo == null) {
			_SetItmDtlRowNo = MCNumber.ZERO;
		}
		else {
			_SetItmDtlRowNo = _SetItmDtlRowNo.add(1);
		}
		return _SetItmDtlRowNo;
	}

	/** SetItmTableのキー項目を返します。 */
	protected String[] _SetItm_keys;

	public String[] getSetItmRKeyColumns() {
		if (_SetItm_keys == null) {
			DtlSetItmR r = getDtlSetItmL().createRow();
			_SetItm_keys = r.getKeys().toArray(new String[0]);
		}
		return _SetItm_keys;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		DtlSetItm_main_itm_qty_p_PPanel.setRelateBeans(columnDtlSetItm_main_itm_unit_cd, columnDtlSetItm_main_itm_dec_place);
		DtlSetItm_set_itm_qty_p_PPanel.setRelateBeans(columnDtlSetItm_set_itm_unit_cd, columnDtlSetItm_set_itm_dec_place);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlSetItmTable.setCellConfig(createDtlSetItmCellConfig());
	}

	/**
	 * DtlSetItmテーブル制御用セルコンフィグを返す
	 */
	protected DtlSetItmCellConfig createDtlSetItmCellConfig() {
		return new DtlSetItmCellConfig(this);
	}

	protected class DtlSetItmCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlSetItmCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlSetItmR r = getDtlSetItmL().get(index);

			if(!isNull(r.upd_cntr())) {
				if (column == columnDtlSetItm_main_itm_cd ||
						column == columnDtlSetItm_main_itm_sub1 ||
						column == columnDtlSetItm_main_itm_sub2 ||
						column == columnDtlSetItm_main_itm_sub3 ||
						column == columnDtlSetItm_set_itm_cd ||
						column == columnDtlSetItm_set_itm_sub1 ||
						column == columnDtlSetItm_set_itm_sub2 ||
						column == columnDtlSetItm_set_itm_sub3 ||
						column == columnDtlSetItm_main_itm_unit_cd ||
						column == columnDtlSetItm_set_itm_unit_cd) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

}