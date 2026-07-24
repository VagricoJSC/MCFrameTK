package mcframe.clientMABC.MABCP0600;

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
import mcframe.clientMAUB.MAUBP5010.*;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_DlvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_DlvReg_MC extends MABCP_DlvReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_DlvReg_MC() {
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
	public MABCP_DlvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0600_Upd01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0600_Srch01();
	}
	/**
	 * [MA_MABCL0600_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0600_Srch01Caller<P extends MABCP_DlvReg, B extends MA_MABCL0600_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0600_Srch01Caller(P p, B b) {
			super(p, b);
		}

		protected void adjustList() {
			super.adjustList();
			DtlBpSubTable.adjustWidth();
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlBpSubL().clear();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkAtLeastOneCndDelFlg(msgList);
		}
		
		/**
		 * ＦＬＧの検索条件項目のチェックボックスのどちらかが選択されているかチェックする
		 */
		protected void checkAtLeastOneCndDelFlg(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_off_dlv_sundry_flg, Cnd_on_dlv_sundry_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_tdlv_flg, Cnd_on_tdlv_flg));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$org_tdlv_flg, bridge.down0(), DtlR.$tdlv_flg);
		}
	}

	/**
	 * [MA_MABCL0600_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0600_Upd01Caller<P extends MABCP_DlvReg, B extends MA_MABCL0600_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0600_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, DtlBpSubTable);
		}	

		@Override
		protected void setPickedListMap() {
			refreshDtlBpSubAllL();
			super.setPickedListMap();
		}

		@Override
		protected void statusClear() {
			super.statusClear();
			DtlBpSubTable.getList().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABCL0600_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0600_Del01Caller<P extends MABCP_DlvReg, B extends MA_MABCL0600_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0600_Del01Caller(P p, B b) {
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
	 * Panel[BpSubBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlBpSubTable);
	}
	/**
	 * Panel[BpSubBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlBpSubTable);
	}
	/**
	 * Panel[BpSubBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_radd(MCEventInfo info) {
		insertRow(DtlBpSubTable);
	}
	/**
	 * Panel[BpSubBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_rdel(MCEventInfo info) {
		deleteRow(DtlBpSubTable);
	}
	/**
	 * Panel[BpSubBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_rcopy(MCEventInfo info) {
		copyRow(DtlBpSubTable);
	}
	/**
	 * Panel[BpSubBtn]のボタン[set_data]の押下時の処理
	 */
	@Override
	public void doBpSubBtn_set_data(MCEventInfo info) {
		DtlR src = DtlTable.getSelectedMCRow();
		DtlBpSubR dest = DtlBpSubTable.getSelectedMCRow();
		if (!isNullOr(dest, src) && (dest.isEmpty() || confirmRegDataClear())) {
			copyValue(dest, src, createMap_DtlBpSubR_DtlR());
			if (!dest.isEmpty()) {
				if (isNull(dest.upd_cntr())) {
					dest.setStatus(MCRow.CREATE);
				}
				else {
					dest.setStatus(MCRow.MODIFY);
				}
			}
		}
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
		callMA_MABCL0600_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0600_Del01();
	}
	
	// 取引先のセルコンフィグ（ここから） ///////////////////////////////////////////////
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createBpTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 取引先セルコンフィグ
	 */
	protected BpTableCellConfig createBpTableCellConfig() {

		return new BpTableCellConfig(this);
	}

	/**
	 * 取引先のセルコンフィグクラス
	 */
	protected class BpTableCellConfig extends MAUDP_RLBaseCellConfig {

		public BpTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				if (column == columnDtl_via_dlv_typ) {
					if (r.tdlv_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_tdlv_req_flg) {
					if (!r.tdlv_flg()) {
						return MCMode.ENABLE;
					}
				}
				
				if (getStatus() == UPD && !isNull(r.upd_cntr())) {
					if (column == columnDtl_tdlv_flg) {
						if (r.org_tdlv_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	// 取引先のセルコンフィグ（ここまで） ///////////////////////////////////////////////
	
	// 取引先の値クリア処理（ここから） ///////////////////////////////////////////////
	@Override
	public void doDtl_tdlv_flg_NC(MCEventInfo info) {
		super.doDtl_tdlv_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!r.tdlv_flg()) {
			r.via_dlv_typ(null);
			r.via_dlv_typ_nm(null);
		}
		else {
			r.tdlv_req_flg(false);
		}
	}
	// 取引先の値クリア処理（ここまで） ///////////////////////////////////////////////
	
	// 取引先を変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		if (!isCheckColumn(event)) {
			// DtlBpSub
			setKeyChangeToDtlBpSub(event);
		}
		else {
			// DtlBpSub
			setAllDtlBpSubCheckOff(event);
		}
	}
	
	/* 取引先 ⇒ 取引先補助の対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、DtlBpSubの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlBpSub(MCRowEvent event) {
		String eventCol = event.getColumn();

		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow bpSubR : getBpSubListForDtlR(dtlR)) {
				bpSubR.setValueNE(col, dtlR.getValueNE(col));
				if (bpSubR.isStatusNone() && !isNull(bpSubR.getValueNE(getUpdCntrColumn()))) {
					bpSubR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * DtlBp のイベント行の「選択」項目がオフのとき、対応する全ての bpSub の「選択」項目をオフにする
	 */
	protected void setAllDtlBpSubCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == DtlBpSubTable.getSelectedMCRow()) {
			getDtlBpSubAllL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getBpSubListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	/**
	 * Dtl行に関連付けられたBpSubcreateIndex行のリストを返す。
	 */
	protected MCList<DtlBpSubR> getBpSubListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getDtlBpSubAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlBpSubR> BpSubL = getDtlBpSubAllL().subList(idxkey, no);
		return BpSubL;
	}
	// 取引先を変更した際のイベント処理（ここまで） ///////////////////////////////////////////////
	// 取引先補助変更時の対応（ここから） ///////////////////////////////////////////////
	protected MCRowListener createBpSubRowListener() {
		return new BpSubRowListener();
	}
	
	protected class BpSubRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			
			addCheckedDtlBpSubRowToAll(event);
			setCheckValueDtl(event);
		}
	}
	/**
	 * BpSubイベント行の選択がオンのとき、BpSubAllL に存在しないものを追加する
	 * その際、dtlR のキー項目をコピーする
	 */
	protected void addCheckedDtlBpSubRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlBpSubR)){
			return;
		}
		DtlBpSubR bpSubR = (DtlBpSubR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);
		MCList<DtlBpSubR> bpSubAllL = getDtlBpSubAllL();

		if (bpSubR.getBooleanNE(getCheckColumn())) {
			if (!getDtlBpSubAllL().contains(bpSubR)) {
				bpSubAllL.add(bpSubR);
				bpSubR.bp_cd(dtlR.bp_cd());
				bpSubR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	// 取引先補助変更時の対応（ここまで） ///////////////////////////////////////////////
	// -- ボタン処理 -------------------------------------------
	/**
	 * DtlStrLnの行削除のとき、LclStrLnAllから関連する行を全て削除する
	 * LclStrLnの行削除のとき、LclStrLnAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			DtlBpSubTable.clear();
			LclTable.clear();
		}
		E delR = super.deleteRow(table);
		if (table == getDtlTable() && delR != null) {
			getDtlBpSubAllL().removeAll(getBpSubListForDtlR(delR));
		}
		if (table == DtlBpSubTable && delR != null) {
			getDtlBpSubAllL().remove(delR);
			
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーで場所一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getLclRKeyColumns());
			checkDuplicate(msgList, DtlBpSubTable, getBpSubRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたDtlStrLn行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getDtlBpSubL().contains(dest)) {
			BpSubBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			DtlBpSubTable.clear();
			DtlBpSubTable.fillSpace();
			DtlBpSubTable.adjustWidth();
			DtlBpSubTable.selectLeftmostColumn(0);
		}
		return dest;
	}
	//　キー項目関連（ここから） ///////////////////////////////////////////////
	/** BpSubTableのキー項目を返します。 */
	protected String[] _BpSub_keys;

	public String[] getBpSubRKeyColumns() {
		if (_BpSub_keys == null) {
			DtlBpSubR r = getDtlBpSubL().createRow();
			_BpSub_keys = r.getKeys().toArray(new String[0]);
		}
		return _BpSub_keys;
	}
	//　キー項目関連（ここまで） ///////////////////////////////////////////////
	// -- イベント処理 -------------------------------------------
	/*
	 * @see mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW#listenerInit()
	 */
	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlBpSubTable, createBpSubRowListener());
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		getDtlBpSubAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
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
		MCIndexKey subIndexKey= getDtlBpSubAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			// 取引先（ロケール）
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// 取引先補助
			l = getDtlBpSubAllL().subList(subIndexKey, binds);
			for (MCConstRow bpSubR : l) {
				bpSubR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	@Override
	public void doDtlBpSub_NC(MCEventInfo info) {
		super.doDtlBpSub_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getDtlBpSubL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			BpSubBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			BpSubBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			BpSubBtn_rdel.setMode(this, getStatus());
		}
	}
	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);
		
		if (info.getEventIndex() < 0) return ;
		refreshDtlBpSubAllL();
		
		DtlR r = DtlTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを DtlBpSubAllL から取得して DtlBpSubTableに表示
		MCList<DtlBpSubR> l = getBpSubListForDtlR(r);
		
		getDtlBpSubL().setAll(l);
		sort(DtlBpSubTable);
		DtlBpSubTable.fillSpace();
		DtlBpSubTable.adjustWidth();
		DtlBpSubTable.selectRowNoFocus(0);
	}

	/**
	 * DtlBpSubテーブルの現状をDtlBpSubAllに反映する
	 */
	protected void refreshDtlBpSubAllL() {
		if (getDtlBpSubL().size() == 0) {
			return ;
		}
		MCList<DtlBpSubR> l = MCList.create(DtlBpSubR.class);
		for (DtlBpSubR r : getDtlBpSubL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlBpSubR> removeL = getDtlBpSubAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getDtlBpSubAllL().removeAll(removeL);
			getDtlBpSubAllL().addAll(l);
		}
	}

	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l2 = getDtlBpSubL().subList(getCheckColumn(), true);

		if (!l1.isEmpty() || !l2.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// lclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getLclRKeyColumns());

		// DtlStrLnL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlBpSubTable, l2));
		// DtlStrLnL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlBpSubTable, getBpSubRKeyColumns());

		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}
		return true;
	}
	
	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlBpSubTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe() || isUpdAdminOpe()) {
			DtlBpSubTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DtlBpSubTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getDtlBpSubL().clear();
		getDtlBpSubAllL().clear();
	}
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();
		for (MCColumnConfig c : getColumnConfigs(DtlBpSubTable, getBpSubRKeyColumns())) {
			DtlBpSubTable.addSortColumn(c, MCList.SortType.ASC);
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
		if (DtlBpSubTable == null) {
			return false;
		}
		
		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() && getDtlBpSubL().isStatusNone())
				 || confirmTableClear());
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().setBooleanNE(CndR.$off_dlv_sundry_flg, true);
		getCndR().setBooleanNE(CndR.$on_dlv_sundry_flg, true);
		getCndR().setBooleanNE(CndR.$off_tdlv_flg, true);
		getCndR().setBooleanNE(CndR.$on_tdlv_flg, true);
		
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));
	}

	// ロウマッパー
	protected Map_DtlBpSubR_DtlR<DtlBpSubR,DtlR> createMap_DtlBpSubR_DtlR() {
		return new Map_DtlBpSubR_DtlR<DtlBpSubR, DtlR>();
	}

	public class Map_DtlBpSubR_DtlR<D extends DtlBpSubR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlBpSubR.$zip_cd, DtlR.$zip_cd);
			addColumnPathMap(DtlBpSubR.$addr1, DtlR.$addr1);
			addColumnPathMap(DtlBpSubR.$addr2, DtlR.$addr2);
			addColumnPathMap(DtlBpSubR.$addr3, DtlR.$addr3);
			addColumnPathMap(DtlBpSubR.$addr4, DtlR.$addr4);
			addColumnPathMap(DtlBpSubR.$tel, DtlR.$tel);
			addColumnPathMap(DtlBpSubR.$fax, DtlR.$fax);
			addColumnPathMap(DtlBpSubR.$dlv_cntct_dpt, DtlR.$dlv_cntct_dpt);
			addColumnPathMap(DtlBpSubR.$dlv_cntct_psn, DtlR.$dlv_cntct_psn);
			addColumnPathMap(DtlBpSubR.$dlv_cntct_psn_title, DtlR.$dlv_cntct_psn_title);
		}
	}

}