package mcframe.clientMABS.MABSP0450;

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
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ShipWkGrpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ShipWkGrpReg_MC extends MABSP_ShipWkGrpReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**行ＮＯ（Dtl行とDtlWkJdg行の関連付け）*/
	protected static final String DTL_ROW_NO_COL_NM = "dtl_row_no";
	
	/**行ＮＯ（Dtl行とDtlWkJdg行の関連付け）*/
	protected MCNumber _dtlRowNo;
	
	protected final String DUMMY_YMD = "19000101";

	protected final String DUMMY_YMD_F = "yyyyMMdd";

	protected final String DUMMY_SEC = "01";

	protected final String DUMMY_SEC_F = "ss";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ShipWkGrpReg_MC() {
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
	public MABSP_ShipWkGrpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0450_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Srch01Caller<P extends MABSP_ShipWkGrpReg, B extends MA_MABSL0450_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABSL0450_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			getDtlWkJdgL().clear();
			_dtlRowNo = MCNumber.ZERO;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void show() {
			// 納入締切時刻,出荷予定時刻の表示値を設定する
			for (DtlR dtlRow : bridge.down0()) {
				setValueToDispDtlR(dtlRow);
			}
			for (DtlWkJdgR dtlWkJdgRow : bridge.down1()) {
				setValueToDispDtlWkJdgR(dtlWkJdgRow);
			}
			super.show();
		}
	}

	/**
	 * [MA_MABSL0450_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Upd01Caller<P extends MABSP_ShipWkGrpReg, B extends MA_MABSL0450_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABSL0450_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, DtlWkJdgTable);
		}
		
		@Override
		protected void setPickedListMap() {
			refreshDtlWkJdgAllL();
			super.setPickedListMap();
		}
		
		@Override
		protected void statusClear() {
			super.statusClear();
			DtlWkJdgTable.getList().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABSL0450_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Del01Caller<P extends MABSP_ShipWkGrpReg, B extends MA_MABSL0450_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABSL0450_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0450_Srch01();
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
	 * Panel[DtlBtnWkJdg]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnWkJdg_select_all(MCEventInfo info) {
		doSelectAll(DtlWkJdgTable);
	}
	/**
	 * Panel[DtlBtnWkJdg]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnWkJdg_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlWkJdgTable);
	}
	/**
	 * Panel[DtlBtnWkJdg]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtnWkJdg_radd(MCEventInfo info) {
		insertRow(DtlWkJdgTable);
	}
	/**
	 * Panel[DtlBtnWkJdg]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtnWkJdg_rdel(MCEventInfo info) {
		deleteRow(DtlWkJdgTable);
	}
	/**
	 * Panel[DtlBtnWkJdg]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtnWkJdg_rcopy(MCEventInfo info) {
		copyRow(DtlWkJdgTable);
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
		callMA_MABSL0450_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0450_Del01();
	}
	
	// 代替グループを変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	
	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		if (isDtlRowNoColumn(event)) {
			return ;
		}
		super.dtlRowValueChanged(event);
		if (!isCheckColumn(event)) {
			setKeyChangeToDtlWkJdg(event);
		}
		else {
			setAllDtlWkJdgCheckOff(event);
		}
	}
	
	/* 代替グループ ⇒ 代替品目の対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、DtlWkJdgの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlWkJdg(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow WkJdgR : getWkJdgListForDtlR(dtlR)) {
				WkJdgR.setValueNE(col, dtlR.getValueNE(col));
				if (WkJdgR.isStatusNone() && !isNull(WkJdgR.getValueNE(getUpdCntrColumn()))) {
					WkJdgR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての DtlWkJdg の「選択」項目をオフにする
	 */
	protected void setAllDtlWkJdgCheckOff(MCRowEvent event) {
		
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getDtlWkJdgL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getWkJdgListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	
	/**
	 * Dtl行に関連付けられたLocSubcreateIndex行のリストを返す。
	 */
	protected MCList<DtlWkJdgR> getWkJdgListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getDtlWkJdgAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlWkJdgR> WkJdgL = getDtlWkJdgAllL().subList(idxkey, no);
		return WkJdgL;
	}
	// 代替グループを変更した際のイベント処理（ここまで） /////////////////////////////////////////////
	// 代替品目を変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	protected MCRowListener createWkJdgRowListener() {
		return new WkJdgRowListener();
	}
	
	protected class WkJdgRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			
			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			if (isDtlRowNoColumn(event)) {
				return ;
			}
			addCheckedDtlWkJdgRowToAll(event);
			setCheckValueDtlWkJdg(event);
		}
	}
	/**
	 * イベント行(DtlWkJdg)がオンになったとき、対応する行の「選択」項目をオンにする
	 */
	protected void setCheckValueDtlWkJdg(MCRowEvent event) {
		MCConstRow wkJdgR = event.getSourceRow();
		if (wkJdgR.getBoolean(getCheckColumn())) {

			MCConstRow r = DtlWkJdgTable.getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}
	/**
	 * WkJdgイベント行の選択がオンのとき、DtlWkJdgAllL に存在しないものを追加する
	 * その際、dtlWkJdgR のキー項目をコピーする
	 */
	protected void addCheckedDtlWkJdgRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlWkJdgR)){
			return;
		}
		DtlWkJdgR WkJdgR = (DtlWkJdgR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (WkJdgR.getBooleanNE(getCheckColumn())) {
			if (!getDtlWkJdgAllL().contains(WkJdgR)) {
				getDtlWkJdgAllL().add(WkJdgR);
				WkJdgR.ship_wk_grp_cd(dtlR.ship_wk_grp_cd());
				WkJdgR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	
	// 代替品目を変更した際のイベント処理（ここまで） ////////////////////////////////////////////////
	// -- ボタン処理 -------------------------------------------

	/**
	 * Dtlの行削除のとき、DtlWkJdgAllから関連する行を全て削除する
	 * DtlWkJdgの行削除のとき、DtlWkJdgAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			DtlWkJdgTable.clear();
			LclTable.clear();
		}		
		E delR = super.deleteRow(table);
		if (table == getDtlTable() && delR != null) {
			getDtlWkJdgAllL().removeAll(getWkJdgListForDtlR(delR));
		}
		if (table == DtlWkJdgTable && delR != null) {
			getDtlWkJdgAllL().remove(delR);
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーで代替品目一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, DtlWkJdgTable, getWkJdgRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたDtlWkJdg行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getDtlL().contains(dest)) {
			MCNumber no = getCntDtlRowNo();
			row.setNumberNE(DTL_ROW_NO_COL_NM, no);
			DtlBtnWkJdg_rdel.setMode(this, getStatus());
			DtlWkJdgTable.clear();
			DtlWkJdgTable.fillSpace();
			DtlWkJdgTable.selectLeftmostColumn(0);
		}
		return dest;
	}	

	// -- イベント処理 -------------------------------------------
	/*
	 * @see mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW#listenerInit()
	 */
	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlWkJdgTable, createWkJdgRowListener());

	}
	@Override
	protected void tableInit() {
		super.tableInit();
		getDtlWkJdgAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		setDividerPos(TopDtlPanel, 0.6);
	}
	/**
	 * 各テーブル間の紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	protected void setDtlRowNoAll() {
		String[] keyCols = null;
		if (getDtlL().size() > 0) {
			keyCols = getAliasCols(getDtlRKeyColumns(), getDtlL().get(0));
		}
		MCIndexKey idxkey = getDtlWkJdgAllL().createIndex(keyCols);
		MCIndexKey lclIdxkey = getLclAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			
			dtlR.setBoolean(getCheckColumn(), false);

			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getDtlWkJdgAllL().subList(idxkey, binds);
			for (MCConstRow WkJdgR : l) {
				WkJdgR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			//Lcl項目
			l = getLclAllL().subList(lclIdxkey, binds);
			for (MCConstRow LclR : l) {
				LclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	/**
	 * 指定したカラムの配列中ににエイリアスが設定されているカラムがあればエイリアス名に変換して返す。
	 */
	protected String[] getAliasCols(String[] cols, MCRow row) {
		ArrayList<String> l = new ArrayList<String>();
		for (String col : cols) {
			l.add(getAliasCol(col, row));
		}
		return (String[])l.toArray(new String[0]);
	}

	@Override
	public void doDtlWkJdg_NC(MCEventInfo info) {
		super.doDtlWkJdg_NC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getDtlWkJdgL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			DtlBtnWkJdg_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			DtlBtnWkJdg_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtnWkJdg_rdel.setMode(this, getStatus());
		}
	}
	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshDtlWkJdgAllL();
		
		DtlR r = DtlTable.getSelectedMCRow();
		

		// Dtl の選択行のキー項目と一致するレコードを DtlWkJdgAllL から取得して DtlWkJdgTableに表示
		MCList<DtlWkJdgR> l1 = getWkJdgListForDtlR(r);
		getDtlWkJdgL().setAll(l1);
		sort(DtlWkJdgTable);
		DtlWkJdgTable.fillSpace();
		DtlWkJdgTable.adjustWidth();
		DtlWkJdgTable.selectRowNoFocus(0);
		DtlWkJdgTable.selectLeftmostColumn(0);

	}
	/**
	 * DtlWkJdgテーブルの現状をWkJdgAllに反映する
	 */
	protected void refreshDtlWkJdgAllL() {
		if (getDtlWkJdgL().size() == 0) {
			return ;
		}
		MCList<DtlWkJdgR> l = MCList.create(DtlWkJdgR.class);
		for (DtlWkJdgR r : getDtlWkJdgL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlWkJdgR> removeL = getDtlWkJdgAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getDtlWkJdgAllL().removeAll(removeL);
			getDtlWkJdgAllL().addAll(l);
		}
	}
	
	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getDtlWkJdgL().subList(getCheckColumn(), true);

		if (!l1.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}


		// DtlWkJdgL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlWkJdgTable, l1));
		// DtlWkJdgL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlWkJdgTable, getWkJdgRKeyColumns());

		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}
	
	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlTable.fillSpace();
		DtlWkJdgTable.fillSpace();
		LclTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe() || isUpdAdminOpe() || isModOpe()) {
			DtlWkJdgTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DtlWkJdgTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getDtlWkJdgL().clear();
		getDtlWkJdgAllL().clear();
	}
	
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		DtlWkJdgTable.addSortColumn(columnDtlWkJdg_dlv_ded_time_disp, MCList.SortType.ASC);
	}
	
	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	@Override
	protected boolean checkAllTableClear() {
		if (DtlTable == null) {
			return false;
		}
		if (DtlWkJdgTable == null) {
			return false;
		}
		
		return ((getDtlL().isStatusNone() && getDtlWkJdgL().isStatusNone() || confirmTableClear()));
	}
	
	// -----時刻関連処理-----
	@Override
	public void doDtl_ship_schd_time_disp_NC(MCEventInfo info){
		super.doDtl_ship_schd_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		DtlR dtlR = getDtlL().get(idx);
		if (!isNull(dtlR.ship_schd_time_disp())) {
			String hm = dtlR.ship_schd_time_disp().toString(getDispAndValueFormatDtlShipSchdTime());
			dtlR.ship_schd_time_disp(getConstYmdssDate(hm, DtlR.$ship_schd_time_disp, true));
		}
		
		int index = dtlR.getGUIIndex();

		if (!isNull(dtlR.ship_schd_time_disp())) {
			String hm = dtlR.ship_schd_time_disp().toString(getDispAndValueFormatDtlShipSchdTime());
			getDtlL().get(index).ship_schd_time(hm);
		}
		else {
			getDtlL().get(index).ship_schd_time(null);
		}
	}
	
	@Override
	public void doDtlWkJdg_dlv_ded_time_disp_NC(MCEventInfo info){
		super.doDtlWkJdg_dlv_ded_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		DtlWkJdgR dtlWkJdgR = getDtlWkJdgL().get(idx);
		convDispDtl(dtlWkJdgR);
		setDispToValueDtl(dtlWkJdgR);
	}
	
	@Override
	public void doDtlWkJdg_ship_schd_time_disp_NC(MCEventInfo info){
		super.doDtlWkJdg_ship_schd_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		DtlWkJdgR dtlWkJdgR = getDtlWkJdgL().get(idx);
		convDispDtl(dtlWkJdgR);
		setDispToValueDtl(dtlWkJdgR);
	}
	
	protected void convDispDtl(DtlWkJdgR r) {
		if (!isNull(r.dlv_ded_time_disp())) {
			String hm = r.dlv_ded_time_disp().toString(getDispAndValueFormatDtlWkJdgDlvDedTime());
			r.dlv_ded_time_disp(getConstYmdssDate(hm, DtlWkJdgR.$dlv_ded_time_disp, false));
		}
		if (!isNull(r.ship_schd_time_disp())) {
			String hm = r.ship_schd_time_disp().toString(getDispAndValueFormatDtlWkJdgDlvDedTime());
			r.ship_schd_time_disp(getConstYmdssDate(hm, DtlWkJdgR.$ship_schd_time_disp, false));
		}
	}

	protected void setDispToValueDtl(DtlWkJdgR r) {

		int idx = r.getGUIIndex();

		if (!isNull(r.dlv_ded_time_disp())) {
			String hm = r.dlv_ded_time_disp().toString(getDispAndValueFormatDtlWkJdgDlvDedTime());
			getDtlWkJdgL().get(idx).dlv_ded_time(hm);
		}
		else {
			getDtlWkJdgL().get(idx).dlv_ded_time_disp(null);
		}
		
		if (!isNull(r.ship_schd_time_disp())) {
			String hm = r.ship_schd_time_disp().toString(getDispAndValueFormatDtlWkJdgShipSchdTime());
			getDtlWkJdgL().get(idx).ship_schd_time(hm);
		}
		else {
			getDtlWkJdgL().get(idx).ship_schd_time(null);
		}
	}
	
	protected String getDispAndValueFormatDtlWkJdgDlvDedTime() {
		return columnDtlWkJdg_dlv_ded_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}
	
	protected String getDispAndValueFormatDtlWkJdgShipSchdTime() {
		return columnDtlWkJdg_ship_schd_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}
	
	protected String getDispAndValueFormatDtlShipSchdTime() {
		return columnDtl_ship_schd_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}
	
	
	/**
	 * valueフィールドの値に固定値の年月日、秒を追加した値を、Dispフィールドに設定します。
	 * 
	 * @param r 設定対象のRow
	 */
	protected void setValueToDispDtlR(DtlR r) {
		
		if (!isNull(r.ship_schd_time())) {
			r.ship_schd_time_disp(getConstYmdssDate(r.ship_schd_time(), DtlWkJdgR.$ship_schd_time_disp, true));
		}
	}
	
	protected void setValueToDispDtlWkJdgR(DtlWkJdgR r) {

		if (!isNull(r.dlv_ded_time())) {
			r.dlv_ded_time_disp(getConstYmdssDate(r.dlv_ded_time(), DtlWkJdgR.$dlv_ded_time_disp, false));
		}
		
		if (!isNull(r.ship_schd_time())) {
			r.ship_schd_time_disp(getConstYmdssDate(r.ship_schd_time(), DtlWkJdgR.$ship_schd_time_disp, false));
		}
	}
	
	/**
	 * 引数の時刻文字列に、固定値の年月日、秒を追加したMCDateを返します。
	 * 
	 * @param hm 時刻文字列
	 * @param column 判断用項目名
	 * @param dtlFlg 画面上段と下段の区別フラグ 上段：true 下段:false
	 */
	protected MCDate getConstYmdssDate(String hm, String column, boolean dtlFlg) {

		StringBuilder d = new StringBuilder();
		StringBuilder f = new StringBuilder();
		
		String dispFormat = new String();
		if(isSame(column, DtlWkJdgR.$dlv_ded_time_disp) && !dtlFlg) {
			dispFormat = getDispAndValueFormatDtlWkJdgDlvDedTime();
		}
		else if (isSame(column, DtlWkJdgR.$ship_schd_time_disp) && !dtlFlg) {
			dispFormat = getDispAndValueFormatDtlWkJdgShipSchdTime();
		}
		else if (isSame(column, DtlR.$ship_schd_time_disp) && dtlFlg) {
			dispFormat = getDispAndValueFormatDtlWkJdgShipSchdTime();
		}
		
		d.append(DUMMY_YMD).append(hm).append(DUMMY_SEC);
		f.append(DUMMY_YMD_F).append(dispFormat).append(DUMMY_SEC_F);

		return MCDate.valueOf(d.toString(), f.toString());
	}
	
	// -----時刻関連処理ここまで-----
	//　キー項目関連（ここから） ///////////////////////////////////////////////
	/** WkJdgTableのキー項目を返します。 */
	protected String[] _WkJdg_keys;

	public String[] getWkJdgRKeyColumns() {
		if (_WkJdg_keys == null) {
			DtlWkJdgR r = getDtlWkJdgL().createRow();
			_WkJdg_keys = r.getKeys().toArray(new String[0]);
		}
		return _WkJdg_keys;
	}
	//　キー項目関連（ここまで） ///////////////////////////////////////////////

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlWkJdgTable.setCellConfig(createDtlWkJdgConf());
	}

	protected MCCellConfig createDtlWkJdgConf() {
		return new DtlWkJdgConf(this);
	}
	
	public class DtlWkJdgConf extends MAUDP_LCLRLBaseCellConfig {

		public DtlWkJdgConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlWkJdgR r = (DtlWkJdgR) table.getBaseTable().getRow(index);
			if (getStatus() == UPD && !isNull(r.upd_cntr())) {
				if (column == columnDtlWkJdg_dlv_ded_time_disp) {
					 return MCMode.READ_ONLY;
				 }
			}

			return super.getPriorMode(index, column, table);
		}
	}

}