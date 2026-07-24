package mcframe.clientMABC.MABCP0890;

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
import java.util.Arrays;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_SpecReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SpecReg_MC extends MABCP_SpecReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**行ＮＯ（仕様項目行と仕様項目名称行の関連付け）*/
	protected static final String _DESC_DTL_ROW_NO_COL_NM = "desc_dtl_row_no";

	/**行ＮＯ（仕様項目行と仕様項目名称行の関連付け）*/
	protected MCNumber _DescDtlRowNo;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SpecReg_MC() {
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
	public MABCP_SpecReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0890_Srch01();
	}
	/**
	 * [MA_MABCL0890_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Srch01Caller<P extends MABCP_SpecReg, B extends MA_MABCL0890_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0890_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		protected void adjustList() {
			super.adjustList();
			DtlDescTable.adjustWidth();
			LclDescTable.adjustWidth();
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlDescL().clear();
			getLclDescL().clear();
		}

		@Override
		protected void show() {
			super.show();
			setDtlDescRowNoAll();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0890_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Upd01Caller<P extends MABCP_SpecReg, B extends MA_MABCL0890_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0890_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, DtlDescTable);
			checkDuplicateMain(msgList, LclDescTable);
		}
		@Override
		protected void setPickedListMap() {
			refreshDtlDescAllL();
			refreshLclDescAllL();
			super.setPickedListMap();
		}
		@Override
		protected void statusClear() {
			super.statusClear();
			DtlDescTable.getList().setStatus(MCRow.NONE);
			LclDescTable.getList().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABCL0890_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Del01Caller<P extends MABCP_SpecReg, B extends MA_MABCL0890_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0890_Del01Caller(P p, B b) {
			super(p, b);
		}
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
	 * Panel[DtlBtnDesc]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnDesc_select_all(MCEventInfo info) {
		doSelectAll(DtlDescTable);
	}
	/**
	 * Panel[DtlBtnDesc]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnDesc_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlDescTable);
	}
	/**
	 * Panel[DtlBtnDesc]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtnDesc_radd(MCEventInfo info) {
		insertRow(DtlDescTable);
	}
	/**
	 * Panel[DtlBtnDesc]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtnDesc_rdel(MCEventInfo info) {
		deleteRow(DtlDescTable);
	}
	/**
	 * Panel[DtlBtnDesc]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtnDesc_rcopy(MCEventInfo info) {
		copyRow(DtlDescTable);
	}
	/**
	 * Panel[LclBtnDesc]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtnDesc_select_all(MCEventInfo info) {
		doSelectAll(LclDescTable);
	}
	/**
	 * Panel[LclBtnDesc]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtnDesc_deselect_all(MCEventInfo info) {
		doDeselectAll(LclDescTable);
	}
	/**
	 * Panel[LclBtnDesc]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtnDesc_radd(MCEventInfo info) {
		insertRow(LclDescTable);
	}
	/**
	 * Panel[LclBtnDesc]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtnDesc_rdel(MCEventInfo info) {
		deleteRow(LclDescTable);
	}
	/**
	 * Panel[LclBtnDesc]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtnDesc_rcopy(MCEventInfo info) {
		copyRow(LclDescTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0890_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0890_Del01();
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		if (!isCheckColumn(event)) {
			// DtlDesc
			setKeyChangeToDtlDesc(event);
		}
		else {
			// DtlDesc
			setAllDtlDescCheckOff(event);
		}
	}
	
	/* 仕様 ⇒ 仕様項目の対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、DtlDescの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlDesc(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow DescR : getDescListForDtlR(dtlR)) {
				DescR.setValueNE(col, dtlR.getValueNE(col));
				if (DescR.isStatusNone() && !isNull(DescR.getValueNE(getUpdCntrColumn()))) {
					DescR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての DtlDesc の「選択」項目をオフにする
	 */
	protected void setAllDtlDescCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getDtlDescL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getDescListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}

	/**
	 * Dtl行に関連付けられたDescCreateIndex行のリストを返す。
	 */
	protected MCList<DtlDescR> getDescListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getDescAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlDescR> strLnL = getDescAllL().subList(idxkey, no);
		return strLnL;
	}

	protected MCRowListener createDescRowListener() {
		return new DescRowListener();
	}
	
	protected class DescRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			if (isDescDtlRowNoColumn(event)) {
				return ;
			}
			DescRowValueChanged(event);
		}
	}

	/**
	 * 仕様項目 のRowListennerに変更があったときの処理
	 */
	protected void DescRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
			// 仕様項目（ロケール）
			setKeyChangeToLclDesc(event);
		}
		else {
			// 仕様項目（ロケール）
			setAllLclDescCheckOff(event);
		}

		addCheckedDtlDescRowToAll(event);
		setKeyChangeToLclDesc(event);
		setCheckValueDtl(event);
	}

	
	/* 仕様項目 ⇒ 仕様項目(All)の対応 */

	/**
	 * LclDescイベント行の選択がオンのとき、LclDescAllL に存在しないものを追加する
	 * その際、dtlDescR のキー項目をコピーする
	 */
	protected void addCheckedDtlDescRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlDescR)){
			return;
		}
		DtlDescR DescR = (DtlDescR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (DescR.getBooleanNE(getCheckColumn())) {
			if (!getDescAllL().contains(DescR)) {
				getDescAllL().add(DescR);
				DescR.spec_cd(dtlR.spec_cd());
				DescR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	/* 仕様項目 ⇒仕様項目(ロケール)対応 */



	/**
	 * Dtl のイベント行のキー項目に変更があった場合、LclDescの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToLclDesc(MCRowEvent event) {
		String eventCol = event.getColumn();

		if (Arrays.asList(getDescRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow lclR : getLclDescListForDtlR(dtlR)) {
				lclR.setValueNE(col, dtlR.getValueNE(col));
				if (lclR.isStatusNone() && !isNull(lclR.getValueNE(getUpdCntrColumn()))) {
					lclR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * DtlDesc のイベント行の「選択」項目がオフのとき、対応する全ての LclDesc の「選択」項目をオフにする
	 */
	protected void setAllLclDescCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == LclDescTable.getSelectedMCRow()) {
			getLclDescAllL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getLclDescListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	/**
	 * Dtl行に関連付けられたLclDesccreateIndex行のリストを返す。
	 */
	protected MCList<LclDescR> getLclDescListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlDescRowNo(dtlR);
		MCIndexKey idxkey = getLclDescAllL().createIndex(_DESC_DTL_ROW_NO_COL_NM);
		MCList<LclDescR> LclDescL = getLclDescAllL().subList(idxkey, no);
		return LclDescL;
	}

	protected MCRowListener createLclDescRowListener() {
		return new LclDescRLRowListener();
	}
		protected class LclDescRLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			
			addCheckedLclDescRowToAll(event);
			setCheckValueDtlDesc(event);
		}
	}
	
	/**
	 * LclDescイベント行の選択がオンのとき、LclDescAllL に存在しないものを追加する
	 * その際、dtlDescR のキー項目をコピーする
	 */
	protected void addCheckedLclDescRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof LclDescR)){
			return;
		}
		LclDescR lclR = (LclDescR) sourceR;

		DtlDescR dtlR = DtlDescTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlDescRowNo(dtlR);
		MCList<LclDescR> lclDescAllL = getLclDescAllL();

		if (lclR.getBooleanNE(getCheckColumn())) {
			if (!getLclDescAllL().contains(lclR)) {
				lclDescAllL.add(lclR);
				lclR.spec_cd(dtlR.spec_cd());
				lclR.spec_desc_cd(dtlR.spec_desc_cd());
				lclR.setNumberNE(_DESC_DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	/**
	 * イベント行(LclDesc)がオンになったとき、対応する行(DtlDesc)が未登録なら「選択」項目をオンにする
	 */
	protected void setCheckValueDtlDesc(MCRowEvent event) {
		MCConstRow lclR = event.getSourceRow();
		if (lclR.getBoolean(getCheckColumn())) {

			MCConstRow r = DtlDescTable.getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}

	/**
	 * DtlDescの行削除のとき、LclDescAllから関連する行を全て削除する
	 * LclDescの行削除のとき、LclDescAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			DtlDescTable.clear();
			LclTable.clear();
			LclDescTable.clear();
		}
		if (table == DtlDescTable) {
			LclDescTable.clear();
		}

		E delR = super.deleteRow(table);

		if (table == getDtlTable() && delR != null) {
			MCList<DtlDescR> l = getDescListForDtlR(delR);
			for (DtlDescR r : l) {
				getLclDescAllL().removeAll(getLclDescListForDtlR(r));
			}
			getDescAllL().removeAll(getDescListForDtlR(delR));
		}
		if (table == DtlDescTable && delR != null) {
			getDescAllL().remove(delR);
			getLclDescAllL().removeAll(getLclDescListForDtlR(delR));
		}
		if (table == LclDescTable && delR != null) {
			getLclDescAllL().remove(delR);
			
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーで仕様一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getLclRKeyColumns());
			checkDuplicate(msgList, DtlDescTable, getDescRKeyColumns());
			checkDuplicate(msgList, LclDescTable, getLclDescRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		if (t == DtlDescTable) {
			// 行コピーで仕様項目一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclDescTable, getLclDescRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたDtlDesc行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getDtlDescL().contains(dest)) {
			MCNumber no = getCntDtlDescRowNo();
			row.setNumberNE(_DESC_DTL_ROW_NO_COL_NM, no);
			DtlBtnDesc_rdel.setMode(this, getStatus());
			LclDescTable.clear();
			LclDescTable.fillSpace();
			LclDescTable.adjustWidth();
			LclDescTable.selectLeftmostColumn(0);
		}
		if (dest != null && getLclDescL().contains(dest)) {
			LclBtnDesc_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			DtlBtnDesc_rdel.setMode(this, getStatus());
			LclBtnDesc_rdel.setMode(this, getStatus());
			DtlDescTable.clear();
			DtlDescTable.fillSpace();
			DtlDescTable.adjustWidth();
			DtlDescTable.selectLeftmostColumn(0);
		}
		return dest;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlDescTable, createDescRowListener());
		setListListener(LclDescTable, createLclDescRowListener());
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		getDescAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getLclDescAllL().setNumberNE(_DESC_DTL_ROW_NO_COL_NM, null);
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

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			// 仕様（ロケール）
			MCIndexKey idxkey = getLclAllL().createIndex(keyCols);
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// 仕様項目
			idxkey = getDescAllL().createIndex(keyCols);
			l = getDescAllL().subList(idxkey, binds);
			for (MCConstRow DescR : l) {
				DescR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	/**
	 * 仕様項目とそのLCLの紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	protected void setDtlDescRowNoAll() {
		String[] keyCols = null;
		if (getDescAllL().size() > 0) {
			keyCols = getAliasCols(getDescRKeyColumns(), getDescAllL().get(0));
		}

		for (MCConstRow dtlR : getDescAllL()) {
			MCNumber no = getCntDtlDescRowNo();
			dtlR.setNumberNE(_DESC_DTL_ROW_NO_COL_NM, no);

			MCIndexKey idxkey = getLclDescAllL().createIndex(keyCols);
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclDescAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(_DESC_DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	@Override
	public void doDtlDesc_NC(MCEventInfo info) {
		super.doDtlDesc_NC(info);
		
		doDtlDescTableNC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getDtlDescL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			DtlBtnDesc_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			DtlBtnDesc_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtnDesc_rdel.setMode(this, getStatus());
		}
	}
	@Override
	public void doLclDesc_NC(MCEventInfo info) {
		super.doLclDesc_NC(info);

		if (info.getEventIndex() < 0) return;

		MCConstRow row = getLclDescL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			LclBtnDesc_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			LclBtnDesc_rdel.setMode(MCMode.DISABLE);
		}
		else {
			LclBtnDesc_rdel.setMode(this, getStatus());
		}
	}

	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshDtlDescAllL();
		
		DtlR r = DtlTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを DtlDescAllL から取得して DtlDescTableに表示
		MCList<DtlDescR> l1 = getDescListForDtlR(r);
		getDtlDescL().setAll(l1);
		sort(DtlDescTable);
		DtlDescTable.fillSpace();
		DtlDescTable.adjustWidth();
		DtlDescTable.selectRowNoFocus(0);
	}
	
	/**
	 * DtlDescテーブル変更時の処理
	 */
	protected void doDtlDescTableNC(MCEventInfo info) {

		if (info.getEventIndex() < 0) return ;
		refreshLclDescAllL();
		
		MCConstRow r = DtlDescTable.getSelectedMCRow();

		// DtlDesc の選択行のキー項目と一致するレコードを LclDescL から取得して LclDescTableに表示
		MCList<LclDescR> l2 = getLclDescListForDtlR(r);
		getLclDescL().setAll(l2);
		sort(LclDescTable);
		LclDescTable.fillSpace();
		LclDescTable.adjustWidth();
		LclDescTable.selectRowNoFocus(0);
	}
	
	/**
	 * DtlDescテーブルの現状をDescAllに反映する
	 */
	protected void refreshDtlDescAllL() {
		if (getDtlDescL().size() == 0) {
			return ;
		}
		MCList<DtlDescR> l = MCList.create(DtlDescR.class);
		for (DtlDescR r : getDtlDescL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlDescR> removeL = getDescAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getDescAllL().removeAll(removeL);
			getDescAllL().addAll(l);
		}
	}

	/**
	 * LclDescテーブルの現状をLclDescAllに反映する
	 */
	protected void refreshLclDescAllL() {
		if (getLclDescL().size() == 0) {
			return ;
		}
		MCList<LclDescR> l = MCList.create(LclDescR.class);
		for (LclDescR r : getLclDescL()) {
			if (!isNull(r.getNumberNE(_DESC_DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<LclDescR> removeL = getLclDescAllL().subList(_DESC_DTL_ROW_NO_COL_NM, l.get(0).getNumber(_DESC_DTL_ROW_NO_COL_NM));
			getLclDescAllL().removeAll(removeL);
			getLclDescAllL().addAll(l);
		}
	}

	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l2 = getDtlDescL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l3 = getLclDescL().subList(getCheckColumn(), true);

		if (!l1.isEmpty() || !l2.isEmpty() || !l3.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// lclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getLclRKeyColumns());

		// DtlDescL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlDescTable, l2));
		// DtlDescL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlDescTable, getDescRKeyColumns());

		// lclDescL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclDescTable, l3));
		// lclDescL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclDescTable, getLclDescRKeyColumns());
		
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}
	
	@Override
	public boolean doDtlDesc_VC(MCEventInfo info) {
		// DtlDescL の選択行を切り替える前に必須チェックを行う
		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l = getLclDescL().subList(getCheckColumn(), true);

		if (!l.isEmpty()) {
			msgList.addAll(checkReq(DtlDescTable.getSelectedMCRow()));
		}

		// lclDescL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclDescTable, l));
		// lclDescL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclDescTable, getLclDescRKeyColumns());

		
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}

	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlDescTable.fillSpace();
		LclDescTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe()) {
			DtlDescTable.setStatusColumnVisible(true);
			LclDescTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DtlDescTable.setStatusColumnVisible(false);
			LclDescTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getDtlDescL().clear();
		getDescAllL().clear();
		getLclDescL().clear();
		getLclDescAllL().clear();
	}
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(DtlDescTable, getDescRKeyColumns())) {
			DtlDescTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(LclDescTable, getLclDescRKeyColumns())) {
			LclDescTable.addSortColumn(c, MCList.SortType.ASC);
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
		if (DtlDescTable == null) {
			return false;
		}
		if (LclDescTable == null) {
			return false;
		}
		
		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() && getDtlDescL().isStatusNone() 
				&& getLclDescL().isStatusNone()) || confirmTableClear());
	}	

	/**
	 * イベント発生項目が「Dtl行番号」項目のときtrueを返す
	 */
	protected boolean isDescDtlRowNoColumn(MCRowEvent event) {
		return event.getColumn().equals(_DESC_DTL_ROW_NO_COL_NM);
	}
	/**
	 * DtlDesc行ＮＯをカウントアップして返す。
	 */
	protected MCNumber getCntDtlDescRowNo() {
		if (_DescDtlRowNo == null) {
			_DescDtlRowNo = MCNumber.ZERO;
		}
		else {
			_DescDtlRowNo = _DescDtlRowNo.add(1);
		}
		return _DescDtlRowNo;
	}
	/**
	 * DtlDesc行のDtl行ＮＯを返す。
	 * DtlDesc行ＮＯカラムが無い場合は追加して返す。
	 */
	protected MCNumber getDtlDescRowNo(MCConstRow dtlR) {
		MCNumber no = dtlR.getNumberNE(_DESC_DTL_ROW_NO_COL_NM);
		if (no == null) {
			no = getCntDtlDescRowNo();
			dtlR.setNumberNE(_DESC_DTL_ROW_NO_COL_NM, no);
		}
		return no;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlDescTable.setCellConfig(createDtlDescCellConfig());
		LclDescTable.setCellConfig(createLclDescCellConfig());
	}

	/**
	 * ＤｔｌDescテーブル制御用セルコンフィグを返す
	 */
	protected DtlDescCellConfig createDtlDescCellConfig() {
		return new DtlDescCellConfig(this);
	}
	protected class DtlDescCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlDescCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdOpe()) {
				if (!isNull(getDtlDescL().get(index).ins_ts())) {
					// Key項目入力不可
					if (column == columnDtlDesc_spec_desc_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	/**
	 * LclDescテーブル制御用セルコンフィグを返す
	 */
	protected LclDescCellConfig createLclDescCellConfig() {
		return new LclDescCellConfig(this);
	}	
	protected class LclDescCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public LclDescCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdOpe()) {
				if (!isNull(getLclDescL().get(index).ins_ts())) {
					// Key項目入力不可
					if (column == columnLclDesc_lcl_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/** DescTableのキー項目を返します。 */
	protected String[] _Desc_keys;

	public String[] getDescRKeyColumns() {
		if (_Desc_keys == null) {
			DtlDescR r = getDtlDescL().createRow();
			_Desc_keys = r.getKeys().toArray(new String[0]);
		}
		return _Desc_keys;
	}
	/** LclDescTableのキー項目を返します。 */
	protected String[] _LclDesc_keys;

	public String[] getLclDescRKeyColumns() {
		if (_LclDesc_keys == null) {
			LclDescR r = getLclDescL().createRow();
			_LclDesc_keys = r.getKeys().toArray(new String[0]);
		}
		return _LclDesc_keys;
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_SPEC));
	}

}