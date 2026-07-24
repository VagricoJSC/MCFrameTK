package mcframe.clientMABS.MABSP0080;

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
import mcframe.clientMAUB.MAUBP5250.*;

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
import mcframe.commonCore.util.MCCollectionUtil;

import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_AltItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_AltItmReg_MC extends MABSP_AltItmReg_MC_A {

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
	public MABSP_AltItmReg_MC() {
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
	public MABSP_AltItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[RPnl]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MA_MABSL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0080_Srch01Caller<P extends MABSP_AltItmReg, B extends MA_MABSL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABSL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
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
	 * [MA_MABSL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0080_Upd01Caller<P extends MABSP_AltItmReg, B extends MA_MABSL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABSL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setPickedListMap() {
			refreshLclAllL();
			super.setPickedListMap();
		}
	}

	/**
	 * [MA_MABSL0080_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0080_Del01Caller<P extends MABSP_AltItmReg, B extends MA_MABSL0080_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABSL0080_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0080_Srch01();
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
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0080_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0080_Del01();
	}

	//----------画面起動時Start----------
	@Override
	protected void tableInit() {
		super.tableInit();
		setDividerPos(TopDtlPanel, 0.6);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Lcl_fxd_chd_rqmt_qty_p_PPanel.setRelateBeans(columnLcl_unit_cd, columnLcl_dec_place);
		Lcl_ver_no_p_PPanel.setRelateBeans(Lcl_chd_itm_p_PPanel.columnItm_itm_cd, 
						Lcl_chd_itm_p_PPanel.columnItm_itm_sub1, 
						Lcl_chd_itm_p_PPanel.columnItm_itm_sub2, 
						Lcl_chd_itm_p_PPanel.columnItm_itm_sub3, 
						null, columnLcl_ver_flg);
	}
	//----------画面起動時End------------
	//----------種別変更Start------------
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
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setRegTgtValue(info);
		setModeByRegTgt();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (info.getComponent() == Cnd_ope_Group) {
			if (!ref && getCndR().cmn_flg() && getCndR().wg_flg()) {
				initRegTgt();
			}
		}
		else if (info.getComponent() == Cnd_cmn_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().wg_flg(false);
			}
		}
		else if (info.getComponent() == Cnd_wg_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().cmn_flg(false);
			}
		}
	}

	protected void setModeByRegTgt() {
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setRegTgtMode();
		setModeByRegTgt();
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}
	//----------種別変更End--------------
	//----------ステータス変更Start----------
	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
	}

	protected void setRegTgtMode() {
		if (RPnl_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (RPnl_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	//----------ステータス変更End------------

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
			
			setKeyChangeToLcl(event);
		}
		else {
			setAllLclCheckOff(event);
		}
	}
	
	/* 代替グループ ⇒ 代替品目の対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、Lclの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToLcl(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow ItmR : getItmListForDtlR(dtlR)) {
				ItmR.setValueNE(col, dtlR.getValueNE(col));
				if (ItmR.isStatusNone() && !isNull(ItmR.getValueNE(getUpdCntrColumn()))) {
					ItmR.setStatus(MCRow.MODIFY);
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
			MCList<? extends MCConstRow> l = getItmListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	
	/**
	 * Dtl行に関連付けられたLocSubcreateIndex行のリストを返す。
	 */
	protected MCList<LclR> getItmListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getLclAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<LclR> ItmL = getLclAllL().subList(idxkey, no);
		return ItmL;
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

	// 代替グループを変更した際のイベント処理（ここまで） ///////////////////////////////////////////////
	// 代替品目を変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	protected MCRowListener createItmRowListener() {
		return new ItmRowListener();
	}
	
	protected class ItmRowListener implements MCRowListener {
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
		MCConstRow itmR = event.getSourceRow();
		if (itmR.getBoolean(getCheckColumn())) {

			MCConstRow r = LclTable.getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}

	/**
	 * Itmイベント行の選択がオンのとき、LclAllL に存在しないものを追加する
	 * その際、LclR のキー項目をコピーする
	 */
	protected void addCheckedLclRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof LclR)){
			return;
		}
		LclR ItmR = (LclR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (ItmR.getBooleanNE(getCheckColumn())) {
			if (!getLclAllL().contains(ItmR)) {
				getLclAllL().add(ItmR);
				ItmR.alt_grp_cd(dtlR.alt_grp_cd());
				ItmR.wg_cd(dtlR.wg_cd());
				ItmR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	// 代替品目を変更した際のイベント処理（ここまで） ///////////////////////////////////4////////////

	// -- ボタン処理 -------------------------------------------
	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーで代替品目一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getItmRKeyColumns());
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
		setListListener(LclTable, createItmRowListener());

		Lcl_chd_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Lcl_chd_itm_p_PPanel.isItm(lc)) {
			doLcl_chd_itm_cd_LC(info);
		}
	}
	/**
	 * [Lcl]パネルの[chd_itm_cd]のListChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	protected void doLcl_chd_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		LclR r = getLclL().get(idx);

		if (!isNull(r.chd_itm_cd())) {
			if (!isNull(r.dec_place()) && isNull(r.fxd_chd_rqmt_qty())){
				setValueEx(columnLcl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
		}
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
			for (MCConstRow ItmR : l) {
				ItmR.setNumberNE(DTL_ROW_NO_COL_NM, no);
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
		MCList<LclR> l1 = getItmListForDtlR(r);
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
		checkDuplicate(msgList, LclTable, getItmRKeyColumns());

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
	 * 操作種別によってステータスをセットする
	 */
	@Override
	protected void setStatusByOpe() {
		super.setStatusByOpe();

		setRegTgtMode();
		setModeByRegTgt();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe() || isUpdAdminOpe() || isModOpe()) {
			LclTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			LclTable.setStatusColumnVisible(false);
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
	
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(LclTable, getItmRKeyColumns())) {
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
		
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		LclTable.setCellConfig(createLclCellConfig());
	}

	/**
	 * Lclテーブル制御用セルコンフィグを返す
	 */
	protected LclCellConfig createLclCellConfig() {
		return new LclCellConfig(this);
	}
	protected class LclCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public LclCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			LclR r =  LclTable.getRow(index);
			DtlR dtlR = DtlTable.getSelectedMCRow();
			if (getStatus() == UPD) {
				if (column == columnLcl_st_dt) {
					return MCMode.REQUIRED;
				}
				else if (column == columnLcl_fxd_chd_rqmt_qty) {
					if (MAC_ALT_ITM_TYP.isMIX(dtlR.alt_itm_typ())
							&& !isNull(r.fxd_chd_rqmt_qty()) && r.fxd_chd_rqmt_qty().isZero()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	//　キー項目関連（ここから） ///////////////////////////////////////////////
	/** ItmTableのキー項目を返します。 */
	protected String[] _Itm_keys;

	public String[] getItmRKeyColumns() {
		if (_Itm_keys == null) {
			LclR r = getLclL().createRow();
			_Itm_keys = r.getKeys().toArray(new String[0]);
		}
		return _Itm_keys;
	}
	//　キー項目関連（ここまで） ///////////////////////////////////////////////

}