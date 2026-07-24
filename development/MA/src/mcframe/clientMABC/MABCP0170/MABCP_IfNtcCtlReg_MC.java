package mcframe.clientMABC.MABCP0170;

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
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import mcframe.clientCore.resource.MCConst;
import mcframe.commonFS.constant.FSC_MODULE_ID;

import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_IfNtcCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_IfNtcCtlReg_MC extends MABCP_IfNtcCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**行ＮＯ（Dtl行とLcl行の関連付け）*/
	protected static final String DTL_ROW_NO_COL_NM = "dtl_row_no";
	
	/**行ＮＯ（Dtl行とLcl行の関連付け）*/
	protected MCNumber _dtlRowNo;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfNtcCtlReg_MC() {
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
	public MABCP_IfNtcCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0170_Srch01Caller<P extends MABCP_IfNtcCtlReg, B extends MA_MABCL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0170_Srch01Caller(P p, B b) {
			super(p, b);
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

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				FSC_MODULE_ID.putNameNE(r, DtlR.$module_id, DtlR.$module_id_nm);
				r.logic_id_nm(MCConst.lgclbl.getLabel(r.module_id(), r.logic_id(), null));
			}
		}
	}

	/**
	 * [MA_MABCL0170_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0170_Upd01Caller<P extends MABCP_IfNtcCtlReg, B extends MA_MABCL0170_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0170_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setPickedListMap() {
			refreshLclAllL();
			super.setPickedListMap();
		}
	}

	/**
	 * [MA_MABCL0170_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0170_Del01Caller<P extends MABCP_IfNtcCtlReg, B extends MA_MABCL0170_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0170_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0170_Srch01();
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
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, LclTable, columnLcl_st_dt, columnLcl_end_dt);
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
		callMA_MABCL0170_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0170_Del01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setDividerPos(TopDtlPanel, 0.6);
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

	@Override
	public void doDtl_module_id_LC(MCEventInfo info){
		super.doDtl_module_id_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.module_id())) {
			setValueEx(columnDtl_logic_id, idx, null);
		}
	}

	@Override
	public MCList getLcl_msg_lvl(MCRow row, MCEventInfo info) {
		return getMsgLvlList();
	}
	@Override
	public MCList getDtl_msg_lvl(MCRow row, MCEventInfo info) {
		return getMsgLvlList();
	}

	protected MCList<MCRow> _msgLvlList;

	protected MCList<MCRow> getMsgLvlList() {
		if (_msgLvlList == null) {
			MCMessageLevel[] levels = {
					MCMessageLevel.FATAL,
					MCMessageLevel.ERROR,
					MCMessageLevel.PROBLEM,
					MCMessageLevel.WARN,
					MCMessageLevel.INFO,
			};
			final String view_col = MCListLogic.getViewColumnName();	// コンボリスト表示カラム
			MCList<MCRow> list = MCList.create(MCRow.class);
			for (MCMessageLevel level : levels) {
				String lvl = String.valueOf(level.getOmission());
				LclR dtl2R = LclR.create();
				dtl2R.msg_lvl(lvl);
				dtl2R.setStringNE(view_col, lvl);
				list.add(dtl2R);
			}
			_msgLvlList = list;
		}
		return _msgLvlList;
	}

	@Override
	public void doDtl_biz_usr_ntc_flg_NC(MCEventInfo info) {
		super.doDtl_biz_usr_ntc_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!r.biz_usr_ntc_flg()) {
			setValueEx(columnDtl_msg_lvl, idx, null);
		}
	}
	// ------------CellConfig------------

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
		LclTable.setCellConfig(createLclCellConfig());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}

	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (getStatus() == UPD) {
				if (column == columnDtl_logic_id) {
					if(isNull(r.module_id())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_msg_lvl) {
					if (!r.biz_usr_ntc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected LclCellConfig createLclCellConfig() {
		return new LclCellConfig(this);
	}
	protected class LclCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public LclCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}
	
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				if (column == columnLcl_st_dt) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	// モジュールＩＤ、ロジックＩＤ、ワーキンググループＣＤを変更した際のイベント処理（ここから） ///////////////////////////////////////////////
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
			
			setKeyChangeToLcl(event);
		}
		else {
			setAllLclCheckOff(event);
		}
	}
	
	/* ＩＦ通知制御マスタ ⇒ＩＦ通知先マスタの対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、Lclの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToLcl(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow IfNtcR : getIfNtcListForDtlR(dtlR)) {
				IfNtcR.setValueNE(col, dtlR.getValueNE(col));
				if (IfNtcR.isStatusNone() && !isNull(IfNtcR.getValueNE(getUpdCntrColumn()))) {
					IfNtcR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * 指定したカラムにエイリアスが設定されている場合にエイリアス名を返す。
	 */
	protected String getAliasCol(String col, MCRow row) {
		String[] cols = row.getAlias(col);
		return cols.length == 0 ? col : cols[0];
	}
	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての Lcl の「選択」項目をオフにする
	 */
	protected void setAllLclCheckOff(MCRowEvent event) {
		
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getLclL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getIfNtcListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	
	/**
	 * Dtl行に関連付けられたLocSubcreateIndex行のリストを返す。
	 */
	protected MCList<LclR> getIfNtcListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getLclAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<LclR> IfNtcL = getLclAllL().subList(idxkey, no);
		return IfNtcL;
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

	// ＩＦ通知制御マスタを変更した際のイベント処理（ここまで） ///////////////////////////////////////////////
	// ＩＦ通知先マスタを変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	protected MCRowListener createIfNtcRowListener() {
		return new IfNtcRowListener();
	}
	
	protected class IfNtcRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			
			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			if (isDtlRowNoColumn(event)) {
				return ;
			}
			addCheckedLclRowToAll(event);
			setCheckValueLcl(event);
		}
	}
	/**
	 * イベント発生項目が「Dtl行番号」項目のときtrueを返す
	 */
	protected boolean isDtlRowNoColumn(MCRowEvent event) {
		return event.getColumn().equals(DTL_ROW_NO_COL_NM);
	}
	/**
	 * イベント行(Lcl)がオンになったとき、対応する行の「選択」項目をオンにする
	 */
	protected void setCheckValueLcl(MCRowEvent event) {
		MCConstRow IfNtcR = event.getSourceRow();
		if (IfNtcR.getBoolean(getCheckColumn())) {

			MCConstRow r = LclTable.getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}

	/**
	 * IfNtcイベント行の選択がオンのとき、LclAllL に存在しないものを追加する
	 * その際、LclR のキー項目をコピーする
	 */
	protected void addCheckedLclRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof LclR)){
			return;
		}
		LclR IfNtcR = (LclR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (IfNtcR.getBooleanNE(getCheckColumn())) {
			if (!getLclAllL().contains(IfNtcR)) {
				getLclAllL().add(IfNtcR);
				IfNtcR.module_id(dtlR.module_id());
				IfNtcR.logic_id(dtlR.logic_id());
				IfNtcR.wg_cd(dtlR.wg_cd());
				IfNtcR.bp_cd(dtlR.bp_cd());
				IfNtcR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	// ＩＦ通知先マスタを変更した際のイベント処理（ここまで） ///////////////////////////////////4////////////

	// -- ボタン処理 -------------------------------------------
	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーでＩＦ通知先マスタ一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getIfNtcRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたLcl行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getDtlL().contains(dest)) {
			MCNumber no = getCntDtlRowNo();
			row.setNumberNE(DTL_ROW_NO_COL_NM, no);
			LclBtn_rdel.setMode(this, getStatus());
			LclTable.clear();
			LclTable.fillSpace();
			LclTable.selectLeftmostColumn(0);
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
		setListListener(LclTable, createIfNtcRowListener());
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
		MCIndexKey idxkey = getLclAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			dtlR.setBoolean(getCheckColumn(), false);
			
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow IfNtcR : l) {
				IfNtcR.setNumberNE(DTL_ROW_NO_COL_NM, no);
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
	public void doLcl_NC(MCEventInfo info) {
		super.doLcl_NC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getLclL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			LclBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			LclBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			LclBtn_rdel.setMode(this, getStatus());
		}
	}


	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshLclAllL();
		
		DtlR r = DtlTable.getSelectedMCRow();
		

		// Dtl の選択行のキー項目と一致するレコードを LclAllL から取得して LclTableに表示
		MCList<LclR> l1 = getIfNtcListForDtlR(r);
		getLclL().setAll(l1);
		sort(LclTable);
		LclTable.fillSpace();
		LclTable.adjustWidth();
		LclTable.selectRowNoFocus(0);
		LclTable.selectLeftmostColumn(0);
	}

	
	/**
	 * Lclテーブルの現状をLclAllに反映する
	 */
	protected void refreshLclAllL() {
		if (getLclL().size() == 0) {
			return ;
		}
		MCList<LclR> l = MCList.create(LclR.class);
		for (LclR r : getLclL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<LclR> removeL = getLclAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getLclAllL().removeAll(removeL);
			getLclAllL().addAll(l);
		}
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

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);

		if (!l1.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// LclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// LclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getIfNtcRKeyColumns());

		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}

	@Override
	public void fillSpace() {
		super.fillSpace();
		LclTable.fillSpace();
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
	
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(LclTable, getIfNtcRKeyColumns())) {
			LclTable.addSortColumn(c, MCList.SortType.ASC);
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
		
		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() || confirmTableClear()));
	}

	//　キー項目関連（ここから） ///////////////////////////////////////////////
	/** LclTableのキー項目を返します。 */
	protected String[] _IfNtc_keys;

	public String[] getIfNtcRKeyColumns() {
		if (_IfNtc_keys == null) {
			LclR r = getLclL().createRow();
			_IfNtc_keys = r.getKeys().toArray(new String[0]);
		}
		return _IfNtc_keys;
	}
	//　キー項目関連（ここまで） ///////////////////////////////////////////////
	
	@Override
	public MCList getCnd_module_id(MCRow row, MCEventInfo info) {
		MCList<MCRow> moduleL = super.getCnd_module_id(row, info);
		return delUnnecessaryModule(moduleL);
	}
	
	@Override
	public MCList getCnd_logic_id(MCRow row, MCEventInfo info) {
		MCList<MCRow> logicL = super.getCnd_logic_id(row, info);
		return delUnnecessaryModule(logicL);
	}
	
	@Override
	public MCList getDtl_module_id(MCRow row, MCEventInfo info) {
		MCList<MCRow> moduleL = super.getDtl_module_id(row, info);
		return delUnnecessaryModule(moduleL);
	}
	
	protected MCList delUnnecessaryModule(MCList<MCRow> moduleL) {
		if (isNull(moduleL)) return moduleL;
		MCList<MCRow> removeL = MCList.create(MCRow.class);
		for (MCRow r : moduleL) {
			FSC_MODULE_ID type = FSC_MODULE_ID.getNE(r.getStringNE(FSC_MODULE_ID.$VALUE));
			if(isUnnecessaryModule(type)) {
				removeL.add(r);
			}
		}
		moduleL.removeAll(removeL);
		return moduleL;
	}
	
	protected boolean isUnnecessaryModule(FSC_MODULE_ID type) {
		return FSC_MODULE_ID.isFramework(type) || FSC_MODULE_ID.isSystemAdmin(type) || FSC_MODULE_ID.isxApps(type) || 
				FSC_MODULE_ID.isTrial(type) || FSC_MODULE_ID.isFrameManager(type);
	}

}