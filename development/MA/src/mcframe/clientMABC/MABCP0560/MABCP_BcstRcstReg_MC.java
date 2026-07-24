package mcframe.clientMABC.MABCP0560;

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
import mcframe.clientMAUB.MAUBP5050.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_BcstRcstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BcstRcstReg_MC extends MABCP_BcstRcstReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BcstRcstReg_MC() {
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
	public MABCP_BcstRcstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Wrk7Hdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk7Hdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk7Hdr_st_dt, Wrk7Hdr_end_dt, Wrk7DtlTable, columnWrk7Dtl_st_dt, columnWrk7Dtl_end_dt);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0560_Srch01();
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk5DtlTable);
	}

	/**
	 * Panel[Wrk6Hdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk6Hdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk6Hdr_st_dt, Wrk6Hdr_end_dt, Wrk6DtlTable, columnWrk6Dtl_st_dt, columnWrk6Dtl_end_dt);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0510(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0510");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0510CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABCP0510]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0510.CndR crtOpenMABCP0510CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0510.CndR to = mcframe.clientMABC.MABCP0510.CndR.create();
		mcframe.clientMABC.MABCP0510.MABCP_BpReg p = (mcframe.clientMABC.MABCP0510.MABCP_BpReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.bp_cd(getHdrR().bp_cd());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0560_Upd01();
	}
	/**
	 * [MA_MABCL0560_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0560_Srch01Caller<P extends MABCP_BcstRcstReg, B extends MA_MABCL0560_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0560_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getHdrR(), getHdrAllL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkAtLeastOneCndDelFlg(msgList);
		}

		@Override
		protected void show() {
			super.show();
			
			copy(getHdrR(), getHdrAllL().get(0), createMap_HdrR_HdrAllR());
			setValueEx(Hdr_bp_cd, getHdrR().bp_cd());
			setValueEx(Wrk4Hdr_bill_cl_day1, getHdrR().bill_cl_day1());
			setValueEx(Wrk4Hdr_bill_cl_day2, getHdrR().bill_cl_day2());
			setValueEx(Wrk4Hdr_bill_cl_day3, getHdrR().bill_cl_day3());
			setValueEx(Wrk4Hdr_bill_cl_day4, getHdrR().bill_cl_day4());
			setValueEx(Wrk4Hdr_bill_cl_day5, getHdrR().bill_cl_day5());

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			getHdrR().check_bcst_dpt_cd(getHdrR().bcst_dpt_cd());
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();

			Wrk4DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);
			Wrk6DtlTable.selectRowNoFocus(0);
			Wrk7DtlTable.selectRowNoFocus(0);

			DtlTabTab.focusActiveFirstComponent();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
				chkBcstRcstFlg();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		protected void chkBcstRcstFlg() {
			setBillClDelayDaysMode();
			setBcstDptMode();
			chkBillClDay1();
			chkBillClDay2();
			chkBillClDay3();
			chkBillClDay4();
			chkBillClDay5();
			setBillTaxRndTypMode();
			setBillClBaTypMode();
			setCalcComPaidFlgMode();
			setRcvBaTypMode();
			setBillDtlAdvFlgMode();
			setBillPrntMode();

			// 上記メソッドで値のクリアをしているため、変更ステータスになるのでクリア
			statusClear();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MA_MABCL0560_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0560_Upd01Caller<P extends MABCP_BcstRcstReg, B extends MA_MABCL0560_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0560_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			// エラーメッセージから「行番号」を消すため
			if (!bridge.up0().isEmpty()) {
				bridge.up0().get(0).setGUIIndex(-1);
			}
		}

		@Override
		protected boolean execConfirm() {
			
			//共通処理
			if(super.execConfirm()){
				setDtlBlock();
				return true;
			}

			return false;	
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getHdrR()));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
		
		/**更新状況に応じたHdrからHdrAll へのデータコピーを行います。*/
		protected void setDtlBlock(){
			HdrR br = getHdrR();
			if (isStatusNone(br)) {
				return;
			}

			// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
			setCheckDpt(br, HdrAllR.$bcst_dpt_cd, HdrAllR.$check_bcst_dpt_cd);

			MCList<HdrAllR> d = getHdrAllL();
			HdrAllR dr = d.createRow();
			MCRow.copyall(dr, d.get(0));
			copy(dr, br, createMap_HdrAllR_HdrR());
			d.clear();
			d.add(dr);
			if (!isNull(dr.bp_cd())) {
				dr.setStatus(Status.MODIFY);
			} else {
				dr.bp_cd(getHdrR().bp_cd());
				dr.setStatus(Status.CREATE);
			}
		}

		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(MCRow r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void checkStEndDtValid(MCMessageList list) {
			// 何もしない
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}

		@Override
		protected void handleMCEx(MCException ex) {
			if (isOperationMightBeSuccess(ex)) {
				handleOperationMightBeSuccessMCEx(ex);
			}
			if (isAddFailedMsg(ex)) {
				throw addFailedMsg(ex);
			}
			throw ex;
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Wrk4Dtl_amt_p_PPanel.setRelateBeans(columnWrk4Dtl_cur_cd, columnWrk4Dtl_amt_dec_place);
		Wrk5Dtl_min_amt_p_PPanel.setRelateBeans(columnWrk5Dtl_cur_cd, columnWrk5Dtl_amt_dec_place);
		Wrk5Dtl_max_amt_p_PPanel.setRelateBeans(columnWrk5Dtl_cur_cd, columnWrk5Dtl_amt_dec_place);
		Wrk5Dtl_com_paid_p_PPanel.setRelateBeans(columnWrk5Dtl_cur_cd, columnWrk5Dtl_amt_dec_place);
	}

	@Override
	public MCList<? extends MCConstRow> getDtlL() {
		return null;
	}
	@Override
	public MCTable getDtlTable() {
		return null;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		for (MCTable<?> tbl : getDtlTables()) {
			setListListener(tbl, createRLRowListener());
			// 部品を想定
			for (MCColumnConfig c : tbl.getColumnConfigs()) {
				for (String str : getDtlRKeyColumns(tbl.getList())) {
					if (c.getRowColumnName().equals(str)) {
						c.addVCListener(this);
					}
				}
			}
		}
	}
	
	@Override
	public void fillSpace() {
		Wrk4DtlTable.fillSpace();
		Wrk5DtlTable.fillSpace();
		Wrk6DtlTable.fillSpace();
		Wrk7DtlTable.fillSpace();
	}
	@Override
	public void setSortColumn() {
		for (MCColumnConfig c : getColumnConfigs(Wrk4DtlTable, getWrk4DtlKeyColumns())) {
			Wrk4DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(Wrk5DtlTable, getWrk5DtlKeyColumns())) {
			Wrk5DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(Wrk6DtlTable, getWrk6DtlKeyColumns())) {
			Wrk6DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(Wrk7DtlTable, getWrk7DtlKeyColumns())) {
			Wrk7DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
	}
	/** Wrk4DtlTableのキー項目を返します。 */
	protected String[] _Wrk4Dtl_keys;

	public String[] getWrk4DtlKeyColumns() {
		if (_Wrk4Dtl_keys == null) {
			Wrk4DtlR r = getWrk4DtlL().createRow();
			_Wrk4Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk4Dtl_keys;
	}
	/** Wrk5DtlTableのキー項目を返します。 */
	protected String[] _Wrk5Dtl_keys;

	public String[] getWrk5DtlKeyColumns() {
		if (_Wrk5Dtl_keys == null) {
			Wrk5DtlR r = getWrk5DtlL().createRow();
			_Wrk5Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk5Dtl_keys;
	}
	/** Wrk6DtlTableのキー項目を返します。 */
	protected String[] _Wrk6Dtl_keys;

	public String[] getWrk6DtlKeyColumns() {
		if (_Wrk6Dtl_keys == null) {
			Wrk6DtlR r = getWrk6DtlL().createRow();
			_Wrk6Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk6Dtl_keys;
	}
	/** Wrk6DtlTableのキー項目を返します。 */
	protected String[] _Wrk7Dtl_keys;

	public String[] getWrk7DtlKeyColumns() {
		if (_Wrk7Dtl_keys == null) {
			Wrk7DtlR r = getWrk7DtlL().createRow();
			_Wrk7Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk7Dtl_keys;
	}
	//------------------ 種別制御 Start ------------------//
	// 種別
	public boolean isUpdOpe() {
		return true;
	};
	public boolean isDelOpe() {
		return false;
	};
	public boolean isUpdAdminOpe() {
		return false;
	};
	public boolean isRefOpe() {
		return false;
	};
	public boolean isModOpe() {
		return false;
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}

		if (isUpdSts() && !isStatusNone(getHdrR(), getWrk4DtlL(), getWrk5DtlL(), getWrk6DtlL(), getWrk7DtlL())) {
			return confirmRegDataClear();
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		getHdrR().clear();
		
		getWrk4DtlL().clear();
		getWrk5DtlL().clear();
		getWrk6DtlL().clear();
		getWrk7DtlL().clear();
		getHdrAllL().clear();
		
		setSRCHStatus();
	}
	
	//------------------ 種別制御 End ------------------//
	//------------------ テーブル関連 Start ------------------//
	
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
		
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			// 新規登録の場合、key項目請求先、入金先、取引先が登録枠に設定された値から設定する
			if (r.contains("bcst_cd")) {
				if (isNull(r.getStringNE("bcst_cd"))) {
					r.setStringNE("bcst_cd", getHdrR().bp_cd());
				}
			}
			if (r.contains("rcst_cd")) {
				if (isNull(r.getStringNE("rcst_cd"))) {
					r.setStringNE("rcst_cd", getHdrR().bp_cd());
				}
			}
			
			if (r.contains("bp_cd")) {
				if (isNull(r.getStringNE("bp_cd"))) {
					r.setStringNE("bp_cd", getHdrR().bp_cd());
				}
			}
		}
	}

	/**
	 * イベント発生項目が「選択」項目のときtrueを返す
	 */
	protected boolean isCheckColumn(MCRowEvent event) {
		return event.getColumn().equals(getCheckColumn());
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
	
	//------------------ テーブル関連 End ------------------//
	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] {Wrk4DtlTable, Wrk5DtlTable, Wrk6DtlTable, Wrk7DtlTable};	
	}
	protected String[] _dummyStringArray = {};
	
	/**
	 * キー項目を返します。
	 * @param list
	 * @return
	 */
	protected String[] getDtlRKeyColumns(MCList<? extends MCConstRow> list) {
		MCConstRow r = list.createRow();
		return r.getKeys().toArray(_dummyStringArray);
	}
	
	boolean isDtlKey(MCColumnConfig column, MCTable tbl) {
		for (String str : getDtlRKeyColumns(tbl.getList())) {
			if (column.getRowColumnName().equals(str)) {
				return true;
			}
		}
		return false;
	}

	//------------------ 汎用メソッド End ------------------//
	//------------------ イベント Start ------------------//
	@Override
	public void doHdr_bill_dpt_typ_LC(MCEventInfo info) {
		super.doHdr_bill_dpt_typ_LC(info);

		setValueEx(Hdr_bcst_dpt_cd, null);

		setBcstDptMode();
	}

	@Override
	public void doHdr_bill_cl_day1_LC(MCEventInfo info) {
		super.doHdr_bill_cl_day1_LC(info);
		if (isNull(getHdrR().bill_cl_day1())) {
			setValueEx(Hdr_bill_cl_day2, null);
		}

		chkBillClDay1();
		setValueEx(Wrk4Hdr_bill_cl_day1, getHdrR().bill_cl_day1());
	}
	@Override
	public void doHdr_bill_cl_day2_LC(MCEventInfo info) {
		super.doHdr_bill_cl_day2_LC(info);

		if (isNull(getHdrR().bill_cl_day2())) {
			setValueEx(Hdr_bill_cl_day3, null);
		}

		setValueEx(Wrk4Hdr_bill_cl_day2, getHdrR().bill_cl_day2());
		for (Wrk4DtlR r : exceptBaseEmpty(Wrk4DtlTable)){
			setValueEx(columnWrk4Dtl_rcv_day2, r.getGUIIndex(), null);
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons2, r.getGUIIndex(), null);
		}

		chkBillClDay2();
	}
	@Override
	public void doHdr_bill_cl_day3_LC(MCEventInfo info) {
		super.doHdr_bill_cl_day3_LC(info);

		if (isNull(getHdrR().bill_cl_day3())) {
			setValueEx(Hdr_bill_cl_day4, null);
		}

		setValueEx(Wrk4Hdr_bill_cl_day3, getHdrR().bill_cl_day3());
		for (Wrk4DtlR r : exceptBaseEmpty(Wrk4DtlTable)){
			setValueEx(columnWrk4Dtl_rcv_day3, r.getGUIIndex(), null);
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons3, r.getGUIIndex(), null);
		}

		chkBillClDay3();
	}
	@Override
	public void doHdr_bill_cl_day4_LC(MCEventInfo info) {
		super.doHdr_bill_cl_day4_LC(info);

		setValueEx(Wrk4Hdr_bill_cl_day4, getHdrR().bill_cl_day4());
		if (isNull(getHdrR().bill_cl_day4())) {
			setValueEx(Hdr_bill_cl_day5, null);
		}

		for (Wrk4DtlR r : exceptBaseEmpty(Wrk4DtlTable)){
			setValueEx(columnWrk4Dtl_rcv_day4, r.getGUIIndex(), null);
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons4, r.getGUIIndex(), null);
		}

		chkBillClDay4();
	}
	@Override
	public void doHdr_bill_cl_day5_LC(MCEventInfo info) {
		super.doHdr_bill_cl_day5_LC(info);

		setValueEx(Wrk4Hdr_bill_cl_day5, getHdrR().bill_cl_day5());
		if (isNull(getHdrR().bill_cl_day5())) {
			for (Wrk4DtlR r : exceptBaseEmpty(Wrk4DtlTable)){
				setValueEx(columnWrk4Dtl_rcv_day5, r.getGUIIndex(), null);
				setValueEx(columnWrk4Dtl_rcv_crryovr_mons5, r.getGUIIndex(), null);
			}
		}
		
		chkBillClDay5();
	}
	
	@Override
	public void doHdr_tax_on_bill_flg_NC(MCEventInfo info) {
		super.doHdr_tax_on_bill_flg_NC(info);

		if (!getHdrR().tax_on_bill_flg()) {
			setValueEx(Hdr_bill_tax_rnd_typ, null);
		}

		setBillTaxRndTypMode();
	}
	@Override
	public void doHdr_bill_cl_typ_LC(MCEventInfo info) {
		super.doHdr_bill_cl_typ_LC(info);

		if (!MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())) {
			setValueEx(Hdr_bill_cl_delay_days, null);

			if (!MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
				setValueEx(Hdr_bill_cl_day1, null);

				if (!MAC_BILL_CL_TYP.isSEL(getHdrR().bill_cl_typ())) {
					setValueEx(Hdr_bfw_bal_disp_flg, false);
					setValueEx(Hdr_sls_dtl_outp_typ, null);
				}
			}
		}

		if (!MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())
				&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			setValueEx(Hdr_bill_dtl_adv_flg, true);
		}
		else {
			setValueEx(Hdr_bill_dtl_adv_flg, false);
		}

		chkBillClDay1();
		setSlsDtlOutpTypMode();
		setBillClDelayDaysMode();
		setBfw_bal_disp_flgMode();
		setBillDtlAdvFlgMode();
	}
	@Override
	public void doHdr_bill_cl_delay_days_LC(MCEventInfo info) {
		super.doHdr_bill_cl_delay_days_LC(info);

		if (isNull(getHdrR().bill_cl_delay_days()) || !MCNumber.ZERO.eq(getHdrR().bill_cl_delay_days())) {
			setValueEx(Hdr_bill_cl_ba_typ, null);
		}

		setBillClBaTypMode();
	}
	@Override
	public void doHdr_bill_prnt_typ_LC(MCEventInfo info) {
		super.doHdr_bill_prnt_typ_LC(info);

		if (MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			setValueEx(Hdr_bill_zip_cd, null);
			setValueEx(Hdr_bill_addr1, null);
			setValueEx(Hdr_bill_addr2, null);
			setValueEx(Hdr_bill_addr3, null);
			setValueEx(Hdr_bill_addr4, null);
			setValueEx(Hdr_bill_tel, null);
			setValueEx(Hdr_bill_bcst_nm, null);
			setValueEx(Hdr_bill_bcst_dpt, null);
			setValueEx(Hdr_bill_bcst_psn, null);
			setValueEx(Hdr_bill_bcst_psn_title, null);
			setValueEx(Hdr_sls_dtl_outp_typ, null);
			setValueEx(Hdr_bill_dtl_outp_flg, false);
			setValueEx(Hdr_bfw_bal_disp_flg, false);
			setValueEx(Hdr_bill_dtl_rcv_flg, false);
			setValueEx(Hdr_bill_dtl_subttl_typ, null);
			setValueEx(Hdr_bill_dtl_brk_typ, null);
			setValueEx(Hdr_bill_dtl_sort_typ, null);
			setValueEx(Hdr_bill_can_slip_typ, null);

			setValueEx(Hdr_bill_dtl_adv_flg, false);
		}
		else if (!MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			setValueEx(Hdr_bill_dtl_adv_flg, true);
		}
		setBillPrntMode();
	}
	@Override
	public void doHdr_rcv_amt_match_flg_NC(MCEventInfo info) {
		super.doHdr_rcv_amt_match_flg_NC(info);

		if (!getHdrR().rcv_amt_match_flg()) {
			setValueEx(Hdr_calc_com_paid_flg, false);
		}

		setCalcComPaidFlgMode();
	}
	@Override
	public void doHdr_bill_cal_cd_LC(MCEventInfo info) {
		super.doHdr_bill_cal_cd_LC(info);

		if (isNull(getHdrR().bill_cal_cd())) {
			setValueEx(Hdr_rcv_ba_typ, null);
		}

		setRcvBaTypMode();
	}
	
	@Override
	public void doWrk7Dtl_if_proc_typ_LC(MCEventInfo info) {
		super.doWrk7Dtl_if_proc_typ_LC(info);
		
		Wrk7DtlR r = getWrk7DtlL().get(info.getEventIndex());
		if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
			setValueEx(columnWrk7Dtl_ext_sys_cd, r.getGUIIndex(), null);
		}
		if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
			setValueEx(columnWrk7Dtl_not_onr_prov_flg, r.getGUIIndex(), false);
		}
	}
	//------------------ NC End ------------------//
	//------------------ モード制御 Start ------------------//
	/**
	 * 請求締遅延日数のモード制御
	 */
	protected void setBillClDelayDaysMode() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())) {
			setDefaultMode(Hdr_bill_cl_delay_days);
		}
		else {
			Hdr_bill_cl_delay_days.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求先担当部門ＣＤのモード制御
	 */
	protected void setBcstDptMode() {
		if (MAC_BILL_DPT_TYP.isBILL(getHdrR().bill_dpt_typ())) {
			setDefaultMode(Hdr_bcst_dpt_cd);
		}
		else {
			Hdr_bcst_dpt_cd.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求締日１の画面モード制御
	 */
	protected void chkBillClDay1() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
			setDefaultMode(Hdr_bill_cl_day1);
			
			if (isNull(getHdrR().bill_cl_day1())) {
				Hdr_bill_cl_day2.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_bill_cl_day2);
			}
		}
		else {
			Hdr_bill_cl_day1.setMode(MCMode.READ_ONLY);
			Hdr_bill_cl_day2.setMode(MCMode.READ_ONLY);
			Hdr_bill_cl_day3.setMode(MCMode.READ_ONLY);
			Hdr_bill_cl_day4.setMode(MCMode.READ_ONLY);
			Hdr_bill_cl_day5.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求締日2の画面モード制御
	 */
	protected void chkBillClDay2() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
			if (isNull(getHdrR().bill_cl_day2())) {
				Hdr_bill_cl_day3.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_bill_cl_day3);
			}
		}
		else {
				Hdr_bill_cl_day2.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求締日3の画面モード制御
	 */
	protected void chkBillClDay3() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
			if (isNull(getHdrR().bill_cl_day3())) {
				Hdr_bill_cl_day4.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_bill_cl_day4);
			}
		}
		else {
			Hdr_bill_cl_day3.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求締日4の画面モード制御
	 */
	protected void chkBillClDay4() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
			if (isNull(getHdrR().bill_cl_day4())) {
				Hdr_bill_cl_day5.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_bill_cl_day5);
			}
		}
		else {
			Hdr_bill_cl_day4.setMode(MCMode.READ_ONLY);
		}		
	}
	/**
	 * 請求締日５の画面モード制御
	 */
	protected void chkBillClDay5() {
		if (MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())) {
			if (!isNull(getHdrR().bill_cl_day4())) {
				setDefaultMode(Hdr_bill_cl_day5);
			}
			else {
				Hdr_bill_cl_day5.setMode(MCMode.READ_ONLY);
			}
		}
		else {
				Hdr_bill_cl_day5.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 請求税額端数処理区分のモード制御
	 */
	protected void setBillTaxRndTypMode() {
		if (getHdrR().tax_on_bill_flg()) {
			Hdr_bill_tax_rnd_typ.setMode(MCMode.REQUIRED);
		}
		else {
			Hdr_bill_tax_rnd_typ.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求締前後区分のモード制御
	 */
	protected void setBillClBaTypMode() {
		if (!MCNumber.ZERO.eq(getHdrR().bill_cl_delay_days())) {
			Hdr_bill_cl_ba_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_bill_cl_ba_typ);
		}
	}
	/**
	 * 入金予定前後区分のモード制御
	 */
	protected void setRcvBaTypMode() {
		if (!isNull(getHdrR().bill_cal_cd())) {
			setDefaultMode(Hdr_rcv_ba_typ);
		}
		else {
			Hdr_rcv_ba_typ.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 売上明細書出力区分のモード制御
	 */
	protected void setSlsDtlOutpTypMode() {
		if ((MAC_BILL_CL_TYP.isBATCH(getHdrR().bill_cl_typ())
				|| MAC_BILL_CL_TYP.isMANUAL(getHdrR().bill_cl_typ())
				|| MAC_BILL_CL_TYP.isSEL(getHdrR().bill_cl_typ()))
				&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			setDefaultMode(Hdr_sls_dtl_outp_typ);
		}
		else {
			Hdr_sls_dtl_outp_typ.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 手数料計算のモード制御
	 */
	protected void setCalcComPaidFlgMode() {
		if (getHdrR().rcv_amt_match_flg()) {
			setDefaultMode(Hdr_calc_com_paid_flg);
		}
		else {
			Hdr_calc_com_paid_flg.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求書前月残高表示ＦＬＧのモード制御
	 */
	protected void setBfw_bal_disp_flgMode() {
		if (!MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())
				&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			setDefaultMode(Hdr_bfw_bal_disp_flg);
		}
		else {
			Hdr_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求書前受金表示フラグのモード制御
	 */
	protected void setBillDtlAdvFlgMode() {
		if (!MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())
				&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			setDefaultMode(Hdr_bill_dtl_adv_flg);
		}
		else {
			Hdr_bill_dtl_adv_flg.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 請求書発行関連項目のモード制御
	 */
	protected void setBillPrntMode() {
		setSlsDtlOutpTypMode();
		setBfw_bal_disp_flgMode();
		setBillDtlAdvFlgMode();
		if (MAC_BILL_PRNT_TYP.isNOT_PRNT(getHdrR().bill_prnt_typ())) {
			Hdr_bill_zip_cd.setMode(MCMode.READ_ONLY);
			Hdr_bill_addr1.setMode(MCMode.READ_ONLY);
			Hdr_bill_addr2.setMode(MCMode.READ_ONLY);
			Hdr_bill_addr3.setMode(MCMode.READ_ONLY);
			Hdr_bill_addr4.setMode(MCMode.READ_ONLY);
			Hdr_bill_tel.setMode(MCMode.READ_ONLY);
			Hdr_bill_bcst_nm.setMode(MCMode.READ_ONLY);
			Hdr_bill_bcst_dpt.setMode(MCMode.READ_ONLY);
			Hdr_bill_bcst_psn.setMode(MCMode.READ_ONLY);
			Hdr_bill_bcst_psn_title.setMode(MCMode.READ_ONLY);
			Hdr_bill_dtl_outp_flg.setMode(MCMode.READ_ONLY);
			Hdr_bill_dtl_rcv_flg.setMode(MCMode.READ_ONLY);
			Hdr_bill_dtl_subttl_typ.setMode(MCMode.READ_ONLY);
			Hdr_bill_dtl_brk_typ.setMode(MCMode.READ_ONLY);
			Hdr_bill_dtl_sort_typ.setMode(MCMode.READ_ONLY);
			Hdr_bill_can_slip_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_bill_zip_cd);
			setDefaultMode(Hdr_bill_addr1);
			setDefaultMode(Hdr_bill_addr2);
			setDefaultMode(Hdr_bill_addr3);
			setDefaultMode(Hdr_bill_addr4);
			setDefaultMode(Hdr_bill_tel);
			setDefaultMode(Hdr_bill_bcst_nm);
			setDefaultMode(Hdr_bill_bcst_dpt);
			setDefaultMode(Hdr_bill_bcst_psn);
			setDefaultMode(Hdr_bill_bcst_psn_title);
			setDefaultMode(Hdr_bill_dtl_outp_flg);
			setDefaultMode(Hdr_bill_dtl_rcv_flg);
			setDefaultMode(Hdr_bill_dtl_subttl_typ);
			setDefaultMode(Hdr_bill_dtl_brk_typ);
			setDefaultMode(Hdr_bill_dtl_sort_typ);
			setDefaultMode(Hdr_bill_can_slip_typ);
		}
	}
	//------------------ モード制御 End ------------------//
	//------------------ 入金予定制御・振込手数料・ＦＢ ＩＦ制御画面処理 Start ------------------//
	
	// セルコンフィグStart
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk4DtlTable.setCellConfig(createAppCellConfig());
		Wrk5DtlTable.setCellConfig(createAppCellConfig());
		Wrk6DtlTable.setCellConfig(createAppCellConfig());
		Wrk7DtlTable.setCellConfig(createAppCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 支払予定制御・振込手数料・ＦＢ ＩＦ制御明細用のセルコンフィグ
	 */
	protected AppCellConfig createAppCellConfig() {

		return new AppCellConfig(this);
	}

	/**
	 * 支払予定制御・振込手数料・ＦＢ ＩＦ制御明細用のセルコンフィグクラス
	 */
	protected class AppCellConfig extends MAUDP_RLBaseCellConfig {

		public AppCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdSts()) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}

				if (table.getBaseTable() == Wrk4DtlTable) {
					Wrk4DtlR r = Wrk4DtlTable.getRow(index);

					if (column == columnWrk4Dtl_rcv_day1) {
						if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_day2) {
						if (!isNull(r.rcv_day2())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.rcv_day1())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day2())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_day3) {
						if (!isNull(r.rcv_day3())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.rcv_day2())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day3())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_day4) {
						if (!isNull(r.rcv_day4())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.rcv_day3())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day4())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_day5) {
						if (!isNull(r.rcv_day5())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.rcv_day4())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day5())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_crryovr_mons2) {
						if (!isNull(r.rcv_crryovr_mons2())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.rcv_crryovr_mons1())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day2())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_crryovr_mons3) {
						if (!isNull(r.rcv_crryovr_mons3())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.rcv_crryovr_mons2())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day3())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_crryovr_mons4) {
						if (!isNull(r.rcv_crryovr_mons4())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.rcv_crryovr_mons3())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day4())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk4Dtl_rcv_crryovr_mons5) {
						if (!isNull(r.rcv_crryovr_mons5())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.rcv_crryovr_mons4())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().bill_cl_day5())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
				}

				if (table.getBaseTable() == Wrk6DtlTable) {
					Wrk6DtlR r = Wrk6DtlTable.getRow(index);

					if (column == columnWrk6Dtl_bank_cd) {
						if (isNull(r.ar_sttl_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (!MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(r.bank_ac_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk6Dtl_bank_ac_cd) {
						if (isNull(r.ar_sttl_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (!MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(r.bank_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (table.getBaseTable() == Wrk7DtlTable) {
					Wrk7DtlR r = Wrk7DtlTable.getRow(index);
					if (column == columnWrk7Dtl_ext_sys_cd) {
						if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk7Dtl_not_onr_prov_flg) {
						if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}
	// セルコンフィグEnd
	// リスナーイベントStart
	@Override
	public void doWrk4Dtl_crryovr_mons_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_crryovr_mons_typ_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk4Dtl_rcv_day1, idx, null);
	}
	
	@Override
	public void doWrk4Dtl_rcv_day1_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_day1_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_day1())) {
			setValueEx(columnWrk4Dtl_rcv_day2, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_day2_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_day2_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_day2())) {
			setValueEx(columnWrk4Dtl_rcv_day3, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_day3_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_day3_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_day3())) {
			setValueEx(columnWrk4Dtl_rcv_day4, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_day4_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_day4_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_day4())) {
			setValueEx(columnWrk4Dtl_rcv_day5, idx, null);
		}
	}
	
	@Override
	public boolean doWrk4Dtl_rcv_day1_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk4Dtl_rcv_day1_VC(info);
	}

	@Override
	public boolean doWrk4Dtl_rcv_day2_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk4Dtl_rcv_day2_VC(info);
	}

	@Override
	public boolean doWrk4Dtl_rcv_day3_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk4Dtl_rcv_day3_VC(info);
	}

	@Override
	public boolean doWrk4Dtl_rcv_day4_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk4Dtl_rcv_day4_VC(info);
	}

	@Override
	public boolean doWrk4Dtl_rcv_day5_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk4Dtl_rcv_day5_VC(info);
	}

	protected boolean checkDay(MCNumber val) {
		MCNumber min = MCNumber.ONE;
		MCNumber max = new MCNumber(31);
		MCNumber last = new MCNumber(99);
		return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
	}
	
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		// 行削除ボタンの制御
		if (dest != null && getWrk4DtlL().contains(dest)) {
			Wrk4DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk5DtlL().contains(dest)) {
			Wrk5DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk6DtlL().contains(dest)) {
			Wrk6DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk7DtlL().contains(dest)) {
			Wrk7DtlBtn_rdel.setMode(this, getStatus());
		}
		return dest;
	}
	
	@Override
	public void doWrk4Dtl_NC(MCEventInfo info) {
		super.doWrk4Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk4DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk4DtlBtn_rdel);
	}

	@Override
	public void doWrk5Dtl_NC(MCEventInfo info) {
		super.doWrk5Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk5DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk5DtlBtn_rdel);
	}

	@Override
	public void doWrk6Dtl_NC(MCEventInfo info) {
		super.doWrk6Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk6DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk6DtlBtn_rdel);
	}

	@Override
	public void doWrk7Dtl_NC(MCEventInfo info) {
		super.doWrk7Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk7DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk7DtlBtn_rdel);
	}
	
	@Override
	public void doWrk4Dtl_rcv_crryovr_mons1_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_crryovr_mons1_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_crryovr_mons1())) {
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons2, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_crryovr_mons2_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_crryovr_mons2_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_crryovr_mons2())) {
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons3, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_crryovr_mons3_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_crryovr_mons3_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_crryovr_mons3())) {
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons4, idx, null);
		}
	}
	@Override
	public void doWrk4Dtl_rcv_crryovr_mons4_LC(MCEventInfo info) {
		super.doWrk4Dtl_rcv_crryovr_mons4_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.rcv_crryovr_mons4())) {
			setValueEx(columnWrk4Dtl_rcv_crryovr_mons5, idx, null);
		}
	}
	@Override
	public void doWrk6Hdr_st_dt_NC(MCEventInfo info) {
		super.doWrk6Hdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk6Hdr_end_dt_NC(MCEventInfo info) {
		super.doWrk6Hdr_end_dt_NC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doWrk7Hdr_st_dt_NC(MCEventInfo info) {
		super.doWrk7Hdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk7Hdr_end_dt_NC(MCEventInfo info) {
		super.doWrk7Hdr_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getWrk6HdrR().st_dt())
				|| !isNull(getWrk6HdrR().end_dt())) {
			Wrk6Hdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk6Hdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk7HdrR().st_dt())
				|| !isNull(getWrk7HdrR().end_dt())) {
			Wrk7Hdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk7Hdr_set_dt.setMode(MCMode.DISABLE);
		}

	}
	@Override
	public void doWrk6Dtl_ar_sttl_typ_LC(MCEventInfo info) {
		super.doWrk6Dtl_ar_sttl_typ_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk6Dtl_bank_cd, idx, null);
		setValueEx(columnWrk6Dtl_bank_ac_cd, idx, null);
	}
	// リスナーイベントEnd
	//------------------ 入金予定制御・振込手数料・ＦＢ ＩＦ制御画面処理 End ------------------//
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));
	}
	
	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null || !(getStatus().equals(getUPDStatus()))) {
			btn.setMode(this, getStatus());
		} else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		} else {
			btn.setMode(this, getStatus());
		}
	}
	
	protected Map_HdrR_HdrAllR<HdrR,HdrAllR> createMap_HdrR_HdrAllR() {
		return new Map_HdrR_HdrAllR<HdrR, HdrAllR>();
	}

	public class Map_HdrR_HdrAllR<D extends HdrR, S extends HdrAllR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(HdrR.$bp_cd, HdrAllR.$bp_cd);
			addColumnPathMap(HdrR.$bp_nm, HdrAllR.$bp_nm);
			addColumnPathMap(HdrR.$bcst_flg, HdrAllR.$bcst_flg);
			addColumnPathMap(HdrR.$rcst_flg, HdrAllR.$rcst_flg);
			addColumnPathMap(HdrR.$rcst_cd, HdrAllR.$rcst_cd);
			addColumnPathMap(HdrR.$rcst_nm, HdrAllR.$rcst_nm);
			addColumnPathMap(HdrR.$ar_cred_cd, HdrAllR.$ar_cred_cd);
			addColumnPathMap(HdrR.$ar_cred_nm, HdrAllR.$ar_cred_nm);
			addColumnPathMap(HdrR.$bill_dpt_typ, HdrAllR.$bill_dpt_typ);
			addColumnPathMap(HdrR.$bill_dpt_typ_nm, HdrAllR.$bill_dpt_typ_nm);
			addColumnPathMap(HdrR.$bcst_dpt_cd, HdrAllR.$bcst_dpt_cd);
			addColumnPathMap(HdrR.$bcst_dpt_nm, HdrAllR.$bcst_dpt_nm);
			addColumnPathMap(HdrR.$bill_cl_typ, HdrAllR.$bill_cl_typ);
			addColumnPathMap(HdrR.$bill_cl_typ_nm, HdrAllR.$bill_cl_typ_nm);
			addColumnPathMap(HdrR.$bill_cl_day1, HdrAllR.$bill_cl_day1);
			addColumnPathMap(HdrR.$bill_cl_day2, HdrAllR.$bill_cl_day2);
			addColumnPathMap(HdrR.$bill_cl_day3, HdrAllR.$bill_cl_day3);
			addColumnPathMap(HdrR.$bill_cl_day4, HdrAllR.$bill_cl_day4);
			addColumnPathMap(HdrR.$bill_cl_day5, HdrAllR.$bill_cl_day5);
			addColumnPathMap(HdrR.$tax_on_bill_flg, HdrAllR.$tax_on_bill_flg);
			addColumnPathMap(HdrR.$bill_tax_rnd_typ, HdrAllR.$bill_tax_rnd_typ);
			addColumnPathMap(HdrR.$bill_tax_rnd_typ_nm, HdrAllR.$bill_tax_rnd_typ_nm);
			addColumnPathMap(HdrR.$bill_cl_delay_days, HdrAllR.$bill_cl_delay_days);
			addColumnPathMap(HdrR.$bill_cl_ba_typ, HdrAllR.$bill_cl_ba_typ);
			addColumnPathMap(HdrR.$bill_cl_ba_typ_nm, HdrAllR.$bill_cl_ba_typ_nm);
			addColumnPathMap(HdrR.$bill_cal_cd, HdrAllR.$bill_cal_cd);
			addColumnPathMap(HdrR.$bill_cal_nm, HdrAllR.$bill_cal_nm);
			addColumnPathMap(HdrR.$rcv_ba_typ, HdrAllR.$rcv_ba_typ);
			addColumnPathMap(HdrR.$rcv_ba_typ_nm, HdrAllR.$rcv_ba_typ_nm);
			addColumnPathMap(HdrR.$auto_line_appl_flg, HdrAllR.$auto_line_appl_flg);
			addColumnPathMap(HdrR.$sls_interim_cl_flg, HdrAllR.$sls_interim_cl_flg);
			addColumnPathMap(HdrR.$ar_setoff_grp_cd, HdrAllR.$ar_setoff_grp_cd);
			addColumnPathMap(HdrR.$ar_setoff_grp_nm, HdrAllR.$ar_setoff_grp_nm);
			addColumnPathMap(HdrR.$bill_zip_cd, HdrAllR.$bill_zip_cd);
			addColumnPathMap(HdrR.$bill_addr1, HdrAllR.$bill_addr1);
			addColumnPathMap(HdrR.$bill_addr2, HdrAllR.$bill_addr2);
			addColumnPathMap(HdrR.$bill_addr3, HdrAllR.$bill_addr3);
			addColumnPathMap(HdrR.$bill_addr4, HdrAllR.$bill_addr4);
			addColumnPathMap(HdrR.$bill_tel, HdrAllR.$bill_tel);
			addColumnPathMap(HdrR.$bill_bcst_nm, HdrAllR.$bill_bcst_nm);
			addColumnPathMap(HdrR.$bill_bcst_dpt, HdrAllR.$bill_bcst_dpt);
			addColumnPathMap(HdrR.$bill_bcst_psn, HdrAllR.$bill_bcst_psn);
			addColumnPathMap(HdrR.$bill_bcst_psn_title, HdrAllR.$bill_bcst_psn_title);
			addColumnPathMap(HdrR.$bill_prnt_typ, HdrAllR.$bill_prnt_typ);
			addColumnPathMap(HdrR.$bill_prnt_typ_nm, HdrAllR.$bill_prnt_typ_nm);
			addColumnPathMap(HdrR.$sls_dtl_outp_typ, HdrAllR.$sls_dtl_outp_typ);
			addColumnPathMap(HdrR.$sls_dtl_outp_typ_nm, HdrAllR.$sls_dtl_outp_typ_nm);
			addColumnPathMap(HdrR.$bill_dtl_outp_flg, HdrAllR.$bill_dtl_outp_flg);
			addColumnPathMap(HdrR.$bfw_bal_disp_flg, HdrAllR.$bfw_bal_disp_flg);
			addColumnPathMap(HdrR.$bill_dtl_rcv_flg, HdrAllR.$bill_dtl_rcv_flg);
			addColumnPathMap(HdrR.$bill_dtl_subttl_typ, HdrAllR.$bill_dtl_subttl_typ);
			addColumnPathMap(HdrR.$bill_dtl_subttl_typ_nm, HdrAllR.$bill_dtl_subttl_typ_nm);
			addColumnPathMap(HdrR.$bill_dtl_brk_typ, HdrAllR.$bill_dtl_brk_typ);
			addColumnPathMap(HdrR.$bill_dtl_brk_typ_nm, HdrAllR.$bill_dtl_brk_typ_nm);
			addColumnPathMap(HdrR.$bill_dtl_sort_typ, HdrAllR.$bill_dtl_sort_typ);
			addColumnPathMap(HdrR.$bill_dtl_sort_typ_nm, HdrAllR.$bill_dtl_sort_typ_nm);
			addColumnPathMap(HdrR.$bill_can_slip_typ, HdrAllR.$bill_can_slip_typ);
			addColumnPathMap(HdrR.$bill_can_slip_typ_nm, HdrAllR.$bill_can_slip_typ_nm);
			addColumnPathMap(HdrR.$rcv_auto_appl_tgt_flg, HdrAllR.$rcv_auto_appl_tgt_flg);
			addColumnPathMap(HdrR.$rcv_amt_match_flg, HdrAllR.$rcv_amt_match_flg);
			addColumnPathMap(HdrR.$ar_sttl_typ_match_flg, HdrAllR.$ar_sttl_typ_match_flg);
			addColumnPathMap(HdrR.$calc_com_paid_flg, HdrAllR.$calc_com_paid_flg);
			addColumnPathMap(HdrR.$auto_appl_delay_days, HdrAllR.$auto_appl_delay_days);
			addColumnPathMap(HdrR.$xfr_psn, HdrAllR.$xfr_psn);
			addColumnPathMap(HdrR.$ins_usr_id, HdrAllR.$ins_usr_id);
			addColumnPathMap(HdrR.$ins_usr_nm, HdrAllR.$ins_usr_nm);
			addColumnPathMap(HdrR.$ins_ts, HdrAllR.$ins_ts);
			addColumnPathMap(HdrR.$ins_func_id, HdrAllR.$ins_func_id);
			addColumnPathMap(HdrR.$ins_func_nm, HdrAllR.$ins_func_nm);
			addColumnPathMap(HdrR.$upd_cntr, HdrAllR.$upd_cntr);
			addColumnPathMap(HdrR.$upd_usr_id, HdrAllR.$upd_usr_id);
			addColumnPathMap(HdrR.$upd_usr_nm, HdrAllR.$upd_usr_nm);
			addColumnPathMap(HdrR.$upd_ts, HdrAllR.$upd_ts);
			addColumnPathMap(HdrR.$upd_func_id, HdrAllR.$upd_func_id);
			addColumnPathMap(HdrR.$upd_func_nm, HdrAllR.$upd_func_nm);
			addColumnPathMap(HdrR.$upd_srv_req_no, HdrAllR.$upd_srv_req_no);
			addColumnPathMap(HdrR.$del_usr_id, HdrAllR.$del_usr_id);
			addColumnPathMap(HdrR.$del_usr_nm, HdrAllR.$del_usr_nm);
			addColumnPathMap(HdrR.$del_ts, HdrAllR.$del_ts);
			addColumnPathMap(HdrR.$bcst_prnt_typ, HdrAllR.$bcst_prnt_typ);
			addColumnPathMap(HdrR.$bcst_prnt_typ_nm, HdrAllR.$bcst_prnt_typ_nm);
			addColumnPathMap(HdrR.$rcst_prnt_typ, HdrAllR.$rcst_prnt_typ);
			addColumnPathMap(HdrR.$rcst_prnt_typ_nm, HdrAllR.$rcst_prnt_typ_nm);
			addColumnPathMap(HdrR.$bill_dtl_adv_flg, HdrAllR.$bill_dtl_adv_flg);

		}
	}
	protected Map_HdrAllR_HdrR<HdrAllR,HdrR> createMap_HdrAllR_HdrR() {
		return new Map_HdrAllR_HdrR<HdrAllR, HdrR>();
	}

	public class Map_HdrAllR_HdrR<D extends HdrAllR, S extends HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(HdrAllR.$bp_cd, HdrR.$bp_cd);
			addColumnPathMap(HdrAllR.$bp_nm, HdrR.$bp_nm);
			addColumnPathMap(HdrAllR.$bcst_flg, HdrR.$bcst_flg);
			addColumnPathMap(HdrAllR.$rcst_flg, HdrR.$rcst_flg);
			addColumnPathMap(HdrAllR.$rcst_cd, HdrR.$rcst_cd);
			addColumnPathMap(HdrAllR.$rcst_nm, HdrR.$rcst_nm);
			addColumnPathMap(HdrAllR.$ar_cred_cd, HdrR.$ar_cred_cd);
			addColumnPathMap(HdrAllR.$ar_cred_nm, HdrR.$ar_cred_nm);
			addColumnPathMap(HdrAllR.$bill_dpt_typ, HdrR.$bill_dpt_typ);
			addColumnPathMap(HdrAllR.$bill_dpt_typ_nm, HdrR.$bill_dpt_typ_nm);
			addColumnPathMap(HdrAllR.$bcst_dpt_cd, HdrR.$bcst_dpt_cd);
			addColumnPathMap(HdrAllR.$bcst_dpt_nm, HdrR.$bcst_dpt_nm);
			addColumnPathMap(HdrAllR.$check_bcst_dpt_cd, HdrR.$check_bcst_dpt_cd);
			addColumnPathMap(HdrAllR.$bill_cl_typ, HdrR.$bill_cl_typ);
			addColumnPathMap(HdrAllR.$bill_cl_typ_nm, HdrR.$bill_cl_typ_nm);
			addColumnPathMap(HdrAllR.$bill_cl_day1, HdrR.$bill_cl_day1);
			addColumnPathMap(HdrAllR.$bill_cl_day2, HdrR.$bill_cl_day2);
			addColumnPathMap(HdrAllR.$bill_cl_day3, HdrR.$bill_cl_day3);
			addColumnPathMap(HdrAllR.$bill_cl_day4, HdrR.$bill_cl_day4);
			addColumnPathMap(HdrAllR.$bill_cl_day5, HdrR.$bill_cl_day5);
			addColumnPathMap(HdrAllR.$tax_on_bill_flg, HdrR.$tax_on_bill_flg);
			addColumnPathMap(HdrAllR.$bill_tax_rnd_typ, HdrR.$bill_tax_rnd_typ);
			addColumnPathMap(HdrAllR.$bill_tax_rnd_typ_nm, HdrR.$bill_tax_rnd_typ_nm);
			addColumnPathMap(HdrAllR.$bill_cl_delay_days, HdrR.$bill_cl_delay_days);
			addColumnPathMap(HdrAllR.$bill_cl_ba_typ, HdrR.$bill_cl_ba_typ);
			addColumnPathMap(HdrAllR.$bill_cl_ba_typ_nm, HdrR.$bill_cl_ba_typ_nm);
			addColumnPathMap(HdrAllR.$bill_cal_cd, HdrR.$bill_cal_cd);
			addColumnPathMap(HdrAllR.$bill_cal_nm, HdrR.$bill_cal_nm);
			addColumnPathMap(HdrAllR.$rcv_ba_typ, HdrR.$rcv_ba_typ);
			addColumnPathMap(HdrAllR.$rcv_ba_typ_nm, HdrR.$rcv_ba_typ_nm);
			addColumnPathMap(HdrAllR.$auto_line_appl_flg, HdrR.$auto_line_appl_flg);
			addColumnPathMap(HdrAllR.$sls_interim_cl_flg, HdrR.$sls_interim_cl_flg);
			addColumnPathMap(HdrAllR.$ar_setoff_grp_cd, HdrR.$ar_setoff_grp_cd);
			addColumnPathMap(HdrAllR.$ar_setoff_grp_nm, HdrR.$ar_setoff_grp_nm);
			addColumnPathMap(HdrAllR.$bill_zip_cd, HdrR.$bill_zip_cd);
			addColumnPathMap(HdrAllR.$bill_addr1, HdrR.$bill_addr1);
			addColumnPathMap(HdrAllR.$bill_addr2, HdrR.$bill_addr2);
			addColumnPathMap(HdrAllR.$bill_addr3, HdrR.$bill_addr3);
			addColumnPathMap(HdrAllR.$bill_addr4, HdrR.$bill_addr4);
			addColumnPathMap(HdrAllR.$bill_tel, HdrR.$bill_tel);
			addColumnPathMap(HdrAllR.$bill_bcst_nm, HdrR.$bill_bcst_nm);
			addColumnPathMap(HdrAllR.$bill_bcst_dpt, HdrR.$bill_bcst_dpt);
			addColumnPathMap(HdrAllR.$bill_bcst_psn, HdrR.$bill_bcst_psn);
			addColumnPathMap(HdrAllR.$bill_bcst_psn_title, HdrR.$bill_bcst_psn_title);
			addColumnPathMap(HdrAllR.$bill_prnt_typ, HdrR.$bill_prnt_typ);
			addColumnPathMap(HdrAllR.$bill_prnt_typ_nm, HdrR.$bill_prnt_typ_nm);
			addColumnPathMap(HdrAllR.$sls_dtl_outp_typ, HdrR.$sls_dtl_outp_typ);
			addColumnPathMap(HdrAllR.$sls_dtl_outp_typ_nm, HdrR.$sls_dtl_outp_typ_nm);
			addColumnPathMap(HdrAllR.$bill_dtl_outp_flg, HdrR.$bill_dtl_outp_flg);
			addColumnPathMap(HdrAllR.$bfw_bal_disp_flg, HdrR.$bfw_bal_disp_flg);
			addColumnPathMap(HdrAllR.$bill_dtl_rcv_flg, HdrR.$bill_dtl_rcv_flg);
			addColumnPathMap(HdrAllR.$bill_dtl_subttl_typ, HdrR.$bill_dtl_subttl_typ);
			addColumnPathMap(HdrAllR.$bill_dtl_subttl_typ_nm, HdrR.$bill_dtl_subttl_typ_nm);
			addColumnPathMap(HdrAllR.$bill_dtl_brk_typ, HdrR.$bill_dtl_brk_typ);
			addColumnPathMap(HdrAllR.$bill_dtl_brk_typ_nm, HdrR.$bill_dtl_brk_typ_nm);
			addColumnPathMap(HdrAllR.$bill_dtl_sort_typ, HdrR.$bill_dtl_sort_typ);
			addColumnPathMap(HdrAllR.$bill_dtl_sort_typ_nm, HdrR.$bill_dtl_sort_typ_nm);
			addColumnPathMap(HdrAllR.$bill_can_slip_typ, HdrR.$bill_can_slip_typ);
			addColumnPathMap(HdrAllR.$bill_can_slip_typ_nm, HdrR.$bill_can_slip_typ_nm);
			addColumnPathMap(HdrAllR.$rcv_auto_appl_tgt_flg, HdrR.$rcv_auto_appl_tgt_flg);
			addColumnPathMap(HdrAllR.$rcv_amt_match_flg, HdrR.$rcv_amt_match_flg);
			addColumnPathMap(HdrAllR.$ar_sttl_typ_match_flg, HdrR.$ar_sttl_typ_match_flg);
			addColumnPathMap(HdrAllR.$calc_com_paid_flg, HdrR.$calc_com_paid_flg);
			addColumnPathMap(HdrAllR.$auto_appl_delay_days, HdrR.$auto_appl_delay_days);
			addColumnPathMap(HdrAllR.$xfr_psn, HdrR.$xfr_psn);
			addColumnPathMap(HdrAllR.$ins_usr_id, HdrR.$ins_usr_id);
			addColumnPathMap(HdrAllR.$ins_usr_nm, HdrR.$ins_usr_nm);
			addColumnPathMap(HdrAllR.$ins_ts, HdrR.$ins_ts);
			addColumnPathMap(HdrAllR.$ins_func_id, HdrR.$ins_func_id);
			addColumnPathMap(HdrAllR.$ins_func_nm, HdrR.$ins_func_nm);
			addColumnPathMap(HdrAllR.$upd_cntr, HdrR.$upd_cntr);
			addColumnPathMap(HdrAllR.$upd_usr_id, HdrR.$upd_usr_id);
			addColumnPathMap(HdrAllR.$upd_usr_nm, HdrR.$upd_usr_nm);
			addColumnPathMap(HdrAllR.$upd_ts, HdrR.$upd_ts);
			addColumnPathMap(HdrAllR.$upd_func_id, HdrR.$upd_func_id);
			addColumnPathMap(HdrAllR.$upd_func_nm, HdrR.$upd_func_nm);
			addColumnPathMap(HdrAllR.$upd_srv_req_no, HdrR.$upd_srv_req_no);
			addColumnPathMap(HdrAllR.$del_usr_id, HdrR.$del_usr_id);
			addColumnPathMap(HdrAllR.$del_usr_nm, HdrR.$del_usr_nm);
			addColumnPathMap(HdrAllR.$del_ts, HdrR.$del_ts);
			addColumnPathMap(HdrAllR.$bcst_prnt_typ, HdrR.$bcst_prnt_typ);
			addColumnPathMap(HdrAllR.$bcst_prnt_typ_nm, HdrR.$bcst_prnt_typ_nm);
			addColumnPathMap(HdrAllR.$rcst_prnt_typ, HdrR.$rcst_prnt_typ);
			addColumnPathMap(HdrAllR.$rcst_prnt_typ_nm, HdrR.$rcst_prnt_typ_nm);
			addColumnPathMap(HdrAllR.$bill_dtl_adv_flg, HdrR.$bill_dtl_adv_flg);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			super.valueCopy(dest, src);
			
			if (!isStatusNone(getHdrR())) {
				dest.check(true);
			}
		}
	}

	//------------------ ステータス Start ------------------//
	protected void setTabMode() {
		if (getHdrR().bcst_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk1HdrPanel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk2HdrPanel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4Panel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk1HdrPanel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk2HdrPanel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4Panel), false);
		}
		if (getHdrR().rcst_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3HdrPanel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk6Panel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3HdrPanel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk6Panel), false);
		}
		if (getHdrR().bcst_flg() || getHdrR().rcst_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk7Panel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk7Panel), false);
		}
		// 表示中のタブが非表示になったら別のタブに切り替える
		if (!DtlTabTab.isEnabledAt(DtlTabTab.getSelectedIndex())) {
			for (int i=0; i < DtlTabTab.getTabCount(); i++) {
				if (DtlTabTab.isEnabledAt(i)) {
					DtlTabTab.setSelectedIndex(i);
					break;
				}
			}
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		setTabMode();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setTabMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setTabMode();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();

		setTabMode();
	}
	//------------------ ステータス End ------------------//
	//------------------ リストロジック表示制御 Start ------------------//

	@Override	
	public MCList getWrk6Dtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getWrk6Dtl_if_proc_typ(row, info);
	}
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_fb()) {
				l.add(ifProcTyp);
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	@Override	
	public MCList getWrk6Dtl_ar_sttl_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getArSttlTyp(info));
		return super.getWrk6Dtl_ar_sttl_typ(row, info);
	}
	/**
	 * 表示する債権決済区分を取得する
	 */
	protected MAC_AR_STTL_TYP[] getArSttlTyp(MCEventInfo info) {
		return new MAC_AR_STTL_TYP[] { MAC_AR_STTL_TYP.CASH, MAC_AR_STTL_TYP.BANK, MAC_AR_STTL_TYP.NOTE};
	}
	//------------------ リストロジック表示制御 End ------------------//

}