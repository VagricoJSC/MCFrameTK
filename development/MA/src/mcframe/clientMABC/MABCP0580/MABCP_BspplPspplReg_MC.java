package mcframe.clientMABC.MABCP0580;

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
 * 画面"MABCP_BspplPspplReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BspplPspplReg_MC extends MABCP_BspplPspplReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BspplPspplReg_MC() {
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
	public MABCP_BspplPspplReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Wrk5Hdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk5Hdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk5Hdr_st_dt, Wrk5Hdr_end_dt, Wrk5DtlTable, columnWrk5Dtl_st_dt, columnWrk5Dtl_end_dt);
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

	@Override
	public void doWrk5Hdr_st_dt_NC(MCEventInfo info) {
		super.doWrk5Hdr_st_dt_NC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doWrk5Hdr_end_dt_NC(MCEventInfo info) {
		super.doWrk5Hdr_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getWrk5HdrR().st_dt()) || !isNull(getWrk5HdrR().end_dt())) {
			Wrk5Hdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk5Hdr_set_dt.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0580_Srch01();
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk3DtlTable);
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
		callMA_MABCL0580_Upd01();
	}
	/**
	 * [MA_MABCL0580_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0580_Srch01Caller<P extends MABCP_BspplPspplReg, B extends MA_MABCL0580_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0580_Srch01Caller(P p, B b) {
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
			setValueEx(Wrk3Hdr_psppl_cl_day1, getHdrR().psppl_cl_day1());
			setValueEx(Wrk3Hdr_psppl_cl_day2, getHdrR().psppl_cl_day2());
			setValueEx(Wrk3Hdr_psppl_cl_day3, getHdrR().psppl_cl_day3());
			setValueEx(Wrk3Hdr_psppl_cl_day4, getHdrR().psppl_cl_day4());
			setValueEx(Wrk3Hdr_psppl_cl_day5, getHdrR().psppl_cl_day5());

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			getHdrR().check_bsppl_dpt_cd(getHdrR().bsppl_dpt_cd());
			getHdrR().check_pay_dpt_cd(getHdrR().pay_dpt_cd());
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();

			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);


			DtlTabTab.focusActiveFirstComponent();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
				chkBspplPspplFlg();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		protected void chkBspplPspplFlg() {
			chkPaySpotFlg();
			chkPspplClDay1();
			chkPspplClDay2();
			chkPspplClDay3();
			chkPspplClDay4();
			chkTaxOnPayFlg();
			chkBatchPaySchdClFlg();
			chkPaySchdClDelayDays();
			chkPayNtcPrntFlg();

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
	 * [MA_MABCL0580_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0580_Upd01Caller<P extends MABCP_BspplPspplReg, B extends MA_MABCL0580_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0580_Upd01Caller(P p, B b) {
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
			setCheckDpt(br, HdrAllR.$bsppl_dpt_cd, HdrAllR.$check_bsppl_dpt_cd);
			setCheckDpt(br, HdrAllR.$pay_dpt_cd, HdrAllR.$check_pay_dpt_cd);

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
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Wrk3Dtl_amt_p_PPanel.setRelateBeans(columnWrk3Dtl_cur_cd, columnWrk3Dtl_amt_dec_place);
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
		Wrk3DtlTable.fillSpace();
		Wrk5DtlTable.fillSpace();
	}
	@Override
	public void setSortColumn() {
		for (MCColumnConfig c : getColumnConfigs(Wrk3DtlTable, getWrk3DtlKeyColumns())) {
			Wrk3DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(Wrk5DtlTable, getWrk5DtlKeyColumns())) {
			Wrk5DtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
	}
	/** Wrk3DtlTableのキー項目を返します。 */
	protected String[] _Wrk3Dtl_keys;

	public String[] getWrk3DtlKeyColumns() {
		if (_Wrk3Dtl_keys == null) {
			Wrk3DtlR r = getWrk3DtlL().createRow();
			_Wrk3Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk3Dtl_keys;
	}
	/** Wrk6DtlTableのキー項目を返します。 */
	protected String[] _Wrk5Dtl_keys;
		public String[] getWrk5DtlKeyColumns() {
		if (_Wrk5Dtl_keys == null) {
			Wrk5DtlR r = getWrk5DtlL().createRow();
			_Wrk5Dtl_keys = r.getKeys().toArray(new String[0]);
		}
		return _Wrk5Dtl_keys;
	}
	//------------------ 操作種別制御 Start ------------------//
	// 操作種別
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
		if (isUpdSts() && !isStatusNone(getHdrR(), getWrk3DtlL(), getWrk5DtlL())) {

			return confirmRegDataClear();
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		getHdrR().clear();
		
		getWrk3DtlL().clear();

		getWrk5DtlL().clear();

		getHdrAllL().clear();
		
		setSRCHStatus();
	}

	//------------------ 操作種別制御 End ------------------//
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
			// 新規登録の場合、key項目支払予定管理先、支払先、取引先が登録枠に設定された値から設定する
			if (r.contains("bsppl_cd")) {
				if (isNull(r.getStringNE("bsppl_cd"))) {
					r.setStringNE("bsppl_cd", getHdrR().bp_cd());
				}
			}
			if (r.contains("psppl_cd")) {
				if (isNull(r.getStringNE("psppl_cd"))) {
					r.setStringNE("psppl_cd", getHdrR().bp_cd());
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
		return new MCTable<?>[] {Wrk3DtlTable, Wrk5DtlTable};
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
	public void doHdr_pay_spot_flg_NC(MCEventInfo info) {
		super.doHdr_pay_spot_flg_NC(info);

		if (getHdrR().pay_spot_flg()) {
			setValueEx(Hdr_psppl_cl_day1, null);
			setValueEx(Hdr_batch_pay_schd_cl_flg, false);
			setValueEx(Hdr_pay_ntc_bfw_bal_disp_flg, false);
			setValueEx(Hdr_pay_ntc_adv_pay_flg, false);
		}
		else if(getHdrR().pay_ntc_prnt_flg()) {
			setValueEx(Hdr_pay_ntc_adv_pay_flg, true);
		}
		chkPaySpotFlg();
	}
	@Override
	public void doHdr_psppl_cl_day1_LC(MCEventInfo info) {
		super.doHdr_psppl_cl_day1_LC(info);

		if (isNull(getHdrR().psppl_cl_day1())) {
			setValueEx(Hdr_psppl_cl_day2, null);
		}
		chkPspplClDay1();
		setValueEx(Wrk3Hdr_psppl_cl_day1, getHdrR().psppl_cl_day1());
	}
	@Override
	public void doHdr_psppl_cl_day2_LC(MCEventInfo info) {
		super.doHdr_psppl_cl_day2_LC(info);

		if (isNull(getHdrR().psppl_cl_day2())) {
			setValueEx(Hdr_psppl_cl_day3, null);
		}
		setValueEx(Wrk3Hdr_psppl_cl_day2, getHdrR().psppl_cl_day2());
		for (Wrk3DtlR r : exceptBaseEmpty(Wrk3DtlTable)){
			setValueEx(columnWrk3Dtl_pay_day2, r.getGUIIndex(), null);
			setValueEx(columnWrk3Dtl_pay_crryovr_mons2, r.getGUIIndex(), null);
		}
		chkPspplClDay2();
	}
	@Override
	public void doHdr_psppl_cl_day3_LC(MCEventInfo info) {
		super.doHdr_psppl_cl_day3_LC(info);

		if (isNull(getHdrR().psppl_cl_day3())) {
			setValueEx(Hdr_psppl_cl_day4, null);
		}
		setValueEx(Wrk3Hdr_psppl_cl_day3, getHdrR().psppl_cl_day3());
		for (Wrk3DtlR r : exceptBaseEmpty(Wrk3DtlTable)){
			setValueEx(columnWrk3Dtl_pay_day3, r.getGUIIndex(), null);
			setValueEx(columnWrk3Dtl_pay_crryovr_mons3, r.getGUIIndex(), null);
		}
		chkPspplClDay3();
	}
	@Override
	public void doHdr_psppl_cl_day4_LC(MCEventInfo info) {
		super.doHdr_psppl_cl_day4_LC(info);

		setValueEx(Wrk3Hdr_psppl_cl_day4, getHdrR().psppl_cl_day4());
		if (isNull(getHdrR().psppl_cl_day4())) {
			setValueEx(Hdr_psppl_cl_day5, null);
		}
		for (Wrk3DtlR r : exceptBaseEmpty(Wrk3DtlTable)){
			setValueEx(columnWrk3Dtl_pay_day4, r.getGUIIndex(), null);
			setValueEx(columnWrk3Dtl_pay_crryovr_mons4, r.getGUIIndex(), null);
		}
		chkPspplClDay4();
	}
	@Override
	public void doHdr_psppl_cl_day5_LC(MCEventInfo info) {
		super.doHdr_psppl_cl_day5_LC(info);

		setValueEx(Wrk3Hdr_psppl_cl_day5, getHdrR().psppl_cl_day5());
		if (isNull(getHdrR().psppl_cl_day5())) {
			for (Wrk3DtlR r : exceptBaseEmpty(Wrk3DtlTable)){
				setValueEx(columnWrk3Dtl_pay_day5, r.getGUIIndex(), null);
				setValueEx(columnWrk3Dtl_pay_crryovr_mons5, r.getGUIIndex(), null);
			}
		}
	}
	@Override
	public void doHdr_tax_on_pay_flg_NC(MCEventInfo info) {
		super.doHdr_tax_on_pay_flg_NC(info);
		if (!getHdrR().tax_on_pay_flg()) {
			setValueEx(Hdr_pay_tax_rnd_typ, null);
		}
		chkTaxOnPayFlg();
	}

	@Override
	public void doHdr_batch_pay_schd_cl_flg_NC(MCEventInfo info) {
		super.doHdr_batch_pay_schd_cl_flg_NC(info);
		if (!getHdrR().batch_pay_schd_cl_flg()) {
			setValueEx(Hdr_pay_schd_cl_delay_days, null);
		}
		chkBatchPaySchdClFlg();
	}

	@Override
	public void doHdr_pay_schd_cl_delay_days_LC(MCEventInfo info) {
		super.doHdr_pay_schd_cl_delay_days_LC(info);
		if (!MCNumber.ZERO.eq(getHdrR().pay_schd_cl_delay_days())) {
			setValueEx(Hdr_pay_schd_cl_ba_typ, null);
		}
		chkPaySchdClDelayDays();
	}
	@Override
	public void doHdr_pay_ntc_prnt_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr_pay_ntc_prnt_flg_NC(info);
		if (!getHdrR().pay_ntc_prnt_flg()) {
			setValueEx(Hdr_pay_ntc_zip_cd, null);
			setValueEx(Hdr_pay_ntc_addr1, null);
			setValueEx(Hdr_pay_ntc_addr2, null);
			setValueEx(Hdr_pay_ntc_addr3, null);
			setValueEx(Hdr_pay_ntc_addr4, null);
			setValueEx(Hdr_pay_ntc_tel, null);
			setValueEx(Hdr_pay_ntc_bsppl_nm, null);
			setValueEx(Hdr_pay_ntc_bsppl_dpt, null);
			setValueEx(Hdr_pay_ntc_bsppl_psn, null);
			setValueEx(Hdr_pay_ntc_bsppl_psn_title, null);
			setValueEx(Hdr_pay_ntc_dtl_outp_flg, false);
			setValueEx(Hdr_pay_ntc_bfw_bal_disp_flg, false);
			setValueEx(Hdr_pay_ntc_adv_pay_flg, false);
			setValueEx(Hdr_pay_ntc_dtl_pay_flg, false);
			setValueEx(Hdr_pay_ntc_dtl_subttl_typ, null);
			setValueEx(Hdr_pay_ntc_dtl_brk_typ, null);
			setValueEx(Hdr_pay_ntc_dtl_sort_typ, null);
			setValueEx(Hdr_pay_ntc_can_slip_typ, null);
		}
		else if (!getHdrR().pay_spot_flg()) {
			setValueEx(Hdr_pay_ntc_adv_pay_flg, true);
		}
		chkPayNtcPrntFlg();
	}

	//------------------ イベント End ------------------//
	//------------------ モード制御 Start ------------------//
	/**
	 * 都度支払の画面モード制御
	 */
	protected void chkPaySpotFlg() {
		if (getHdrR().pay_spot_flg()) {
			Hdr_psppl_cl_day1.setMode(MCMode.READ_ONLY);
			Hdr_batch_pay_schd_cl_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_psppl_cl_day1);
			setDefaultMode(Hdr_tax_on_pay_flg);
			setDefaultMode(Hdr_batch_pay_schd_cl_flg);
			if (getHdrR().pay_ntc_prnt_flg()) {
				setDefaultMode(Hdr_pay_ntc_bfw_bal_disp_flg);
				setDefaultMode(Hdr_pay_ntc_adv_pay_flg);
			}
			else {
				Hdr_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
				Hdr_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
			}
		}
	}
	/**
	 * 支払締日１の画面モード制御
	 */
	protected void chkPspplClDay1() {
		if (isNull(getHdrR().psppl_cl_day1())) {
			Hdr_psppl_cl_day2.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_psppl_cl_day2);
		}
	}
	/**
	 * 支払締日2の画面モード制御
	 */
	protected void chkPspplClDay2() {
		if (isNull(getHdrR().psppl_cl_day2())) {
			Hdr_psppl_cl_day3.setMode(MCMode.READ_ONLY);
		}
		else { 
			setDefaultMode(Hdr_psppl_cl_day3);
		}
	}
	/**
	 * 支払締日3の画面モード制御
	 */
	protected void chkPspplClDay3() {
		if (isNull(getHdrR().psppl_cl_day3())) {
			Hdr_psppl_cl_day4.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_psppl_cl_day4);
		}
	}
	/**
	 * 支払締日4の画面モード制御
	 */
	protected void chkPspplClDay4() {
		if (isNull(getHdrR().psppl_cl_day4())) {
			Hdr_psppl_cl_day5.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_psppl_cl_day5);
		}
	}
	/**
	 * 支払税計算ＦＬＧの画面モード制御
	 */
	protected void chkTaxOnPayFlg() {
		if (!getHdrR().tax_on_pay_flg()) {
			Hdr_pay_tax_rnd_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_pay_tax_rnd_typ);
		}
	}
	/**
	 * バッチ支払予定締ＦＬＧの画面モード制御
	 */
	protected void chkBatchPaySchdClFlg() {
		if (!getHdrR().batch_pay_schd_cl_flg()) {
			Hdr_pay_schd_cl_delay_days.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_pay_schd_cl_delay_days);
		}
	}
	/**
	 * 支払予定締遅延日数の画面モード制御
	 */
	protected void chkPaySchdClDelayDays() {
		if (isNull(getHdrR().pay_schd_cl_delay_days()) || !MCNumber.ZERO.eq(getHdrR().pay_schd_cl_delay_days())) {
			Hdr_pay_schd_cl_ba_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_pay_schd_cl_ba_typ);
		}
	}
	/**
	 * 支払通知書発行対象ＦＬＧの画面モード制御
	 */
	protected void chkPayNtcPrntFlg() {
		if (getHdrR().pay_ntc_prnt_flg()) {
			if (getHdrR().pay_spot_flg()) {
				Hdr_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
				Hdr_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_pay_ntc_bfw_bal_disp_flg);
				setDefaultMode(Hdr_pay_ntc_adv_pay_flg);
			}
			setDefaultMode(Hdr_pay_ntc_zip_cd);
			setDefaultMode(Hdr_pay_ntc_addr1);
			setDefaultMode(Hdr_pay_ntc_addr2);
			setDefaultMode(Hdr_pay_ntc_addr3);
			setDefaultMode(Hdr_pay_ntc_addr4);
			setDefaultMode(Hdr_pay_ntc_tel);
			setDefaultMode(Hdr_pay_ntc_bsppl_nm);
			setDefaultMode(Hdr_pay_ntc_bsppl_dpt);
			setDefaultMode(Hdr_pay_ntc_bsppl_psn);
			setDefaultMode(Hdr_pay_ntc_bsppl_psn_title);
			setDefaultMode(Hdr_pay_ntc_dtl_outp_flg);
			setDefaultMode(Hdr_pay_ntc_dtl_pay_flg);
			setDefaultMode(Hdr_pay_ntc_dtl_subttl_typ);
			setDefaultMode(Hdr_pay_ntc_dtl_brk_typ);
			setDefaultMode(Hdr_pay_ntc_dtl_sort_typ);
			setDefaultMode(Hdr_pay_ntc_can_slip_typ);
		}
		else {
			Hdr_pay_ntc_zip_cd.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_addr1.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_addr2.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_addr3.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_addr4.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_tel.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bsppl_nm.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bsppl_dpt.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bsppl_psn.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bsppl_psn_title.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_dtl_outp_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_dtl_pay_flg.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_dtl_subttl_typ.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_dtl_brk_typ.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_dtl_sort_typ.setMode(MCMode.READ_ONLY);
			Hdr_pay_ntc_can_slip_typ.setMode(MCMode.READ_ONLY);
		}
	}

	//------------------ 支払予定制御画面処理 Start ------------------//
	
	// セルコンフィグStart
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk3DtlTable.setCellConfig(createAppCellConfig());
		Wrk5DtlTable.setCellConfig(createAppCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 支払予定制御明細用のセルコンフィグ
	 */
	protected AppCellConfig createAppCellConfig() {

		return new AppCellConfig(this);
	}

	/**
	 * 支払予定制御明細用のセルコンフィグクラス
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

				if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR r = Wrk3DtlTable.getRow(index);

					if (column == columnWrk3Dtl_rate) {
						if (MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isCASH_COM_PAID(r.ap_sttl_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_day1) {
						if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_day2) {
						if (!isNull(r.pay_day2())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.pay_day1())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day2())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_day3) {
						if (!isNull(r.pay_day3())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.pay_day2())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day3())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_day4) {
						if (!isNull(r.pay_day4())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.pay_day3())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day4())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_day5) {
						if (!isNull(r.pay_day5())) {
							return MCMode.ENABLE;
						}
						else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
							return MCMode.READ_ONLY;
						}
						else if (isNull(r.pay_day4())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day5())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_crryovr_mons2) {
						if (!isNull(r.pay_crryovr_mons2())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.pay_crryovr_mons1())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day2())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_crryovr_mons3) {
						if (!isNull(r.pay_crryovr_mons3())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.pay_crryovr_mons2())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day3())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_crryovr_mons4) {
						if (!isNull(r.pay_crryovr_mons4())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.pay_crryovr_mons3())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day4())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pay_crryovr_mons5) {
						if (!isNull(r.pay_crryovr_mons5())) {
							return MCMode.ENABLE;
						}
						else if (isNull(r.pay_crryovr_mons4())) {
							return MCMode.READ_ONLY;
						}
						else if (!isNull(getHdrR().psppl_cl_day5())){
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (table.getBaseTable() == Wrk5DtlTable) {
					Wrk5DtlR r = Wrk5DtlTable.getRow(index);
					if (column == columnWrk5Dtl_ext_sys_cd) {
						if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk5Dtl_not_onr_prov_flg) {
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
	public void doWrk3Dtl_sttl_cd_LC(MCEventInfo info) {
		super.doWrk3Dtl_sttl_cd_LC(info);
		Wrk3DtlR r = getWrk3DtlL().get(info.getEventIndex());

		if (MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isCASH_COM_PAID(r.ap_sttl_typ())) {
			r.rate(MCNumber.ZERO);
		}
		else if (MCNumber.ZERO.eq(r.rate())) {
			r.rate(null);
		}
	}

	@Override
	public void doWrk3Dtl_crryovr_mons_typ_LC(MCEventInfo info) {
		super.doWrk3Dtl_crryovr_mons_typ_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk3Dtl_pay_day1, idx, null);
	}
	
	@Override
	public void doWrk3Dtl_pay_day1_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_day1_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_day1())) {
			setValueEx(columnWrk3Dtl_pay_day2, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_day2_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_day2_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_day2())) {
			setValueEx(columnWrk3Dtl_pay_day3, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_day3_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_day3_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_day3())) {
			setValueEx(columnWrk3Dtl_pay_day4, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_day4_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_day4_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_day4())) {
			setValueEx(columnWrk3Dtl_pay_day5, idx, null);
		}
	}
	
	@Override
	public boolean doWrk3Dtl_pay_day1_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk3Dtl_pay_day1_VC(info);
	}

	@Override
	public boolean doWrk3Dtl_pay_day2_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk3Dtl_pay_day2_VC(info);
	}

	@Override
	public boolean doWrk3Dtl_pay_day3_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk3Dtl_pay_day3_VC(info);
	}

	@Override
	public boolean doWrk3Dtl_pay_day4_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk3Dtl_pay_day4_VC(info);
	}

	@Override
	public boolean doWrk3Dtl_pay_day5_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doWrk3Dtl_pay_day5_VC(info);
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
		if (dest != null && getWrk3DtlL().contains(dest)) {
			Wrk3DtlBtn_rdel.setMode(this, getStatus());
		}

		if (dest != null && getWrk5DtlL().contains(dest)) {
			Wrk5DtlBtn_rdel.setMode(this, getStatus());
		}


		return dest;
	}
	
	@Override
	public void doWrk3Dtl_NC(MCEventInfo info) {
		super.doWrk3Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk3DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk3DtlBtn_rdel);
	}

	@Override
	public void doWrk5Dtl_NC(MCEventInfo info) {
		super.doWrk5Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk5DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk5DtlBtn_rdel);
	}
	
	
	@Override
	public void doWrk3Dtl_pay_crryovr_mons1_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_crryovr_mons1_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_crryovr_mons1())) {
			setValueEx(columnWrk3Dtl_pay_crryovr_mons2, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_crryovr_mons2_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_crryovr_mons2_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_crryovr_mons2())) {
			setValueEx(columnWrk3Dtl_pay_crryovr_mons3, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_crryovr_mons3_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_crryovr_mons3_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_crryovr_mons3())) {
			setValueEx(columnWrk3Dtl_pay_crryovr_mons4, idx, null);
		}
	}
	@Override
	public void doWrk3Dtl_pay_crryovr_mons4_LC(MCEventInfo info) {
		super.doWrk3Dtl_pay_crryovr_mons4_LC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (isNull(r.pay_crryovr_mons4())) {
			setValueEx(columnWrk3Dtl_pay_crryovr_mons5, idx, null);
		}
	}

	@Override
	public void doWrk5Dtl_if_proc_typ_LC(MCEventInfo info) {
		super.doWrk5Dtl_if_proc_typ_LC(info);
		
		Wrk5DtlR r = getWrk5DtlL().get(info.getEventIndex());
		if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
			setValueEx(columnWrk5Dtl_ext_sys_cd, r.getGUIIndex(), null);
		}
		if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
			setValueEx(columnWrk5Dtl_not_onr_prov_flg, r.getGUIIndex(), false);
		}
	}
	// リスナーイベントEnd
	//------------------ 支払予定制御画面処理 End ------------------//
	
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
			addColumnPathMap(HdrR.$bsppl_flg, HdrAllR.$bsppl_flg);
			addColumnPathMap(HdrR.$psppl_flg, HdrAllR.$psppl_flg);
			addColumnPathMap(HdrR.$psppl_cd, HdrAllR.$psppl_cd);
			addColumnPathMap(HdrR.$psppl_nm, HdrAllR.$psppl_nm);
			addColumnPathMap(HdrR.$bsppl_dpt_cd, HdrAllR.$bsppl_dpt_cd);
			addColumnPathMap(HdrR.$bsppl_dpt_nm, HdrAllR.$bsppl_dpt_nm);
			addColumnPathMap(HdrR.$check_bsppl_dpt_cd, HdrAllR.$check_bsppl_dpt_cd);
			addColumnPathMap(HdrR.$ap_cred_cd, HdrAllR.$ap_cred_cd);
			addColumnPathMap(HdrR.$ap_cred_nm, HdrAllR.$ap_cred_nm);
			addColumnPathMap(HdrR.$purc_interim_cl_flg, HdrAllR.$purc_interim_cl_flg);
			addColumnPathMap(HdrR.$pay_bank_ac_cd, HdrAllR.$pay_bank_ac_cd);
			addColumnPathMap(HdrR.$pay_bank_ac_nm, HdrAllR.$pay_bank_ac_nm);
			addColumnPathMap(HdrR.$pay_spot_flg, HdrAllR.$pay_spot_flg);
			addColumnPathMap(HdrR.$psppl_cl_day1, HdrAllR.$psppl_cl_day1);
			addColumnPathMap(HdrR.$psppl_cl_day2, HdrAllR.$psppl_cl_day2);
			addColumnPathMap(HdrR.$psppl_cl_day3, HdrAllR.$psppl_cl_day3);
			addColumnPathMap(HdrR.$psppl_cl_day4, HdrAllR.$psppl_cl_day4);
			addColumnPathMap(HdrR.$psppl_cl_day5, HdrAllR.$psppl_cl_day5);
			addColumnPathMap(HdrR.$ap_setoff_grp_cd, HdrAllR.$ap_setoff_grp_cd);
			addColumnPathMap(HdrR.$ap_setoff_grp_nm, HdrAllR.$ap_setoff_grp_nm);
			addColumnPathMap(HdrR.$tax_on_pay_flg, HdrAllR.$tax_on_pay_flg);
			addColumnPathMap(HdrR.$pay_tax_rnd_typ, HdrAllR.$pay_tax_rnd_typ);
			addColumnPathMap(HdrR.$pay_tax_rnd_typ_nm, HdrAllR.$pay_tax_rnd_typ_nm);
			addColumnPathMap(HdrR.$pay_schd_ba_typ, HdrAllR.$pay_schd_ba_typ);
			addColumnPathMap(HdrR.$pay_schd_ba_typ_nm, HdrAllR.$pay_schd_ba_typ_nm);
			addColumnPathMap(HdrR.$batch_pay_schd_cl_flg, HdrAllR.$batch_pay_schd_cl_flg);
			addColumnPathMap(HdrR.$pay_schd_cl_delay_days, HdrAllR.$pay_schd_cl_delay_days);
			addColumnPathMap(HdrR.$pay_schd_cl_ba_typ, HdrAllR.$pay_schd_cl_ba_typ);
			addColumnPathMap(HdrR.$pay_schd_cl_ba_typ_nm, HdrAllR.$pay_schd_cl_ba_typ_nm);
			addColumnPathMap(HdrR.$psppl_rmrks, HdrAllR.$psppl_rmrks);
			addColumnPathMap(HdrR.$note_days, HdrAllR.$note_days);
			addColumnPathMap(HdrR.$pay_dpt_cd, HdrAllR.$pay_dpt_cd);
			addColumnPathMap(HdrR.$pay_dpt_nm, HdrAllR.$pay_dpt_nm);
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
			addColumnPathMap(HdrR.$bsppl_prnt_typ, HdrAllR.$bsppl_prnt_typ);
			addColumnPathMap(HdrR.$bsppl_prnt_typ_nm, HdrAllR.$bsppl_prnt_typ_nm);
			addColumnPathMap(HdrR.$psppl_prnt_typ, HdrAllR.$psppl_prnt_typ);
			addColumnPathMap(HdrR.$psppl_prnt_typ_nm, HdrAllR.$psppl_prnt_typ_nm);
			addColumnPathMap(HdrR.$pay_ntc_prnt_flg, HdrAllR.$pay_ntc_prnt_flg);
			addColumnPathMap(HdrR.$pay_ntc_zip_cd, HdrAllR.$pay_ntc_zip_cd);
			addColumnPathMap(HdrR.$pay_ntc_addr1, HdrAllR.$pay_ntc_addr1);
			addColumnPathMap(HdrR.$pay_ntc_addr2, HdrAllR.$pay_ntc_addr2);
			addColumnPathMap(HdrR.$pay_ntc_addr3, HdrAllR.$pay_ntc_addr3);
			addColumnPathMap(HdrR.$pay_ntc_addr4, HdrAllR.$pay_ntc_addr4);
			addColumnPathMap(HdrR.$pay_ntc_tel, HdrAllR.$pay_ntc_tel);
			addColumnPathMap(HdrR.$pay_ntc_bsppl_nm, HdrAllR.$pay_ntc_bsppl_nm);
			addColumnPathMap(HdrR.$pay_ntc_bsppl_dpt, HdrAllR.$pay_ntc_bsppl_dpt);
			addColumnPathMap(HdrR.$pay_ntc_bsppl_psn, HdrAllR.$pay_ntc_bsppl_psn);
			addColumnPathMap(HdrR.$pay_ntc_bsppl_psn_title, HdrAllR.$pay_ntc_bsppl_psn_title);
			addColumnPathMap(HdrR.$pay_ntc_dtl_outp_flg, HdrAllR.$pay_ntc_dtl_outp_flg);
			addColumnPathMap(HdrR.$pay_ntc_bfw_bal_disp_flg, HdrAllR.$pay_ntc_bfw_bal_disp_flg);
			addColumnPathMap(HdrR.$pay_ntc_adv_pay_flg, HdrAllR.$pay_ntc_adv_pay_flg);
			addColumnPathMap(HdrR.$pay_ntc_dtl_pay_flg, HdrAllR.$pay_ntc_dtl_pay_flg);
			addColumnPathMap(HdrR.$pay_ntc_dtl_subttl_typ, HdrAllR.$pay_ntc_dtl_subttl_typ);
			addColumnPathMap(HdrR.$pay_ntc_dtl_subttl_typ_nm, HdrAllR.$pay_ntc_dtl_subttl_typ_nm);
			addColumnPathMap(HdrR.$pay_ntc_dtl_brk_typ, HdrAllR.$pay_ntc_dtl_brk_typ);
			addColumnPathMap(HdrR.$pay_ntc_dtl_brk_typ_nm, HdrAllR.$pay_ntc_dtl_brk_typ_nm);
			addColumnPathMap(HdrR.$pay_ntc_dtl_sort_typ, HdrAllR.$pay_ntc_dtl_sort_typ);
			addColumnPathMap(HdrR.$pay_ntc_dtl_sort_typ_nm, HdrAllR.$pay_ntc_dtl_sort_typ_nm);
			addColumnPathMap(HdrR.$pay_ntc_can_slip_typ, HdrAllR.$pay_ntc_can_slip_typ);
			addColumnPathMap(HdrR.$pay_ntc_can_slip_typ_nm, HdrAllR.$pay_ntc_can_slip_typ_nm);
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
			addColumnPathMap(HdrAllR.$bsppl_flg, HdrR.$bsppl_flg);
			addColumnPathMap(HdrAllR.$psppl_flg, HdrR.$psppl_flg);
			addColumnPathMap(HdrAllR.$psppl_cd, HdrR.$psppl_cd);
			addColumnPathMap(HdrAllR.$psppl_nm, HdrR.$psppl_nm);
			addColumnPathMap(HdrAllR.$bsppl_dpt_cd, HdrR.$bsppl_dpt_cd);
			addColumnPathMap(HdrAllR.$bsppl_dpt_nm, HdrR.$bsppl_dpt_nm);
			addColumnPathMap(HdrAllR.$check_bsppl_dpt_cd, HdrR.$check_bsppl_dpt_cd);
			addColumnPathMap(HdrAllR.$ap_cred_cd, HdrR.$ap_cred_cd);
			addColumnPathMap(HdrAllR.$ap_cred_nm, HdrR.$ap_cred_nm);
			addColumnPathMap(HdrAllR.$purc_interim_cl_flg, HdrR.$purc_interim_cl_flg);
			addColumnPathMap(HdrAllR.$pay_bank_ac_cd, HdrR.$pay_bank_ac_cd);
			addColumnPathMap(HdrAllR.$pay_bank_ac_nm, HdrR.$pay_bank_ac_nm);
			addColumnPathMap(HdrAllR.$pay_spot_flg, HdrR.$pay_spot_flg);
			addColumnPathMap(HdrAllR.$psppl_cl_day1, HdrR.$psppl_cl_day1);
			addColumnPathMap(HdrAllR.$psppl_cl_day2, HdrR.$psppl_cl_day2);
			addColumnPathMap(HdrAllR.$psppl_cl_day3, HdrR.$psppl_cl_day3);
			addColumnPathMap(HdrAllR.$psppl_cl_day4, HdrR.$psppl_cl_day4);
			addColumnPathMap(HdrAllR.$psppl_cl_day5, HdrR.$psppl_cl_day5);
			addColumnPathMap(HdrAllR.$ap_setoff_grp_cd, HdrR.$ap_setoff_grp_cd);
			addColumnPathMap(HdrAllR.$ap_setoff_grp_nm, HdrR.$ap_setoff_grp_nm);
			addColumnPathMap(HdrAllR.$tax_on_pay_flg, HdrR.$tax_on_pay_flg);
			addColumnPathMap(HdrAllR.$pay_tax_rnd_typ, HdrR.$pay_tax_rnd_typ);
			addColumnPathMap(HdrAllR.$pay_tax_rnd_typ_nm, HdrR.$pay_tax_rnd_typ_nm);
			addColumnPathMap(HdrAllR.$pay_schd_ba_typ, HdrR.$pay_schd_ba_typ);
			addColumnPathMap(HdrAllR.$pay_schd_ba_typ_nm, HdrR.$pay_schd_ba_typ_nm);
			addColumnPathMap(HdrAllR.$batch_pay_schd_cl_flg, HdrR.$batch_pay_schd_cl_flg);
			addColumnPathMap(HdrAllR.$pay_schd_cl_delay_days, HdrR.$pay_schd_cl_delay_days);
			addColumnPathMap(HdrAllR.$pay_schd_cl_ba_typ, HdrR.$pay_schd_cl_ba_typ);
			addColumnPathMap(HdrAllR.$pay_schd_cl_ba_typ_nm, HdrR.$pay_schd_cl_ba_typ_nm);
			addColumnPathMap(HdrAllR.$psppl_rmrks, HdrR.$psppl_rmrks);
			addColumnPathMap(HdrAllR.$note_days, HdrR.$note_days);
			addColumnPathMap(HdrAllR.$pay_dpt_cd, HdrR.$pay_dpt_cd);
			addColumnPathMap(HdrAllR.$pay_dpt_nm, HdrR.$pay_dpt_nm);
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
			addColumnPathMap(HdrAllR.$bsppl_prnt_typ, HdrR.$bsppl_prnt_typ);
			addColumnPathMap(HdrAllR.$bsppl_prnt_typ_nm, HdrR.$bsppl_prnt_typ_nm);
			addColumnPathMap(HdrAllR.$psppl_prnt_typ, HdrR.$psppl_prnt_typ);
			addColumnPathMap(HdrAllR.$psppl_prnt_typ_nm, HdrR.$psppl_prnt_typ_nm);
			addColumnPathMap(HdrAllR.$pay_ntc_prnt_flg, HdrR.$pay_ntc_prnt_flg);
			addColumnPathMap(HdrAllR.$pay_ntc_zip_cd, HdrR.$pay_ntc_zip_cd);
			addColumnPathMap(HdrAllR.$pay_ntc_addr1, HdrR.$pay_ntc_addr1);
			addColumnPathMap(HdrAllR.$pay_ntc_addr2, HdrR.$pay_ntc_addr2);
			addColumnPathMap(HdrAllR.$pay_ntc_addr3, HdrR.$pay_ntc_addr3);
			addColumnPathMap(HdrAllR.$pay_ntc_addr4, HdrR.$pay_ntc_addr4);
			addColumnPathMap(HdrAllR.$pay_ntc_tel, HdrR.$pay_ntc_tel);
			addColumnPathMap(HdrAllR.$pay_ntc_bsppl_nm, HdrR.$pay_ntc_bsppl_nm);
			addColumnPathMap(HdrAllR.$pay_ntc_bsppl_dpt, HdrR.$pay_ntc_bsppl_dpt);
			addColumnPathMap(HdrAllR.$pay_ntc_bsppl_psn, HdrR.$pay_ntc_bsppl_psn);
			addColumnPathMap(HdrAllR.$pay_ntc_bsppl_psn_title, HdrR.$pay_ntc_bsppl_psn_title);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_outp_flg, HdrR.$pay_ntc_dtl_outp_flg);
			addColumnPathMap(HdrAllR.$pay_ntc_bfw_bal_disp_flg, HdrR.$pay_ntc_bfw_bal_disp_flg);
			addColumnPathMap(HdrAllR.$pay_ntc_adv_pay_flg, HdrR.$pay_ntc_adv_pay_flg);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_pay_flg, HdrR.$pay_ntc_dtl_pay_flg);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_subttl_typ, HdrR.$pay_ntc_dtl_subttl_typ);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_subttl_typ_nm, HdrR.$pay_ntc_dtl_subttl_typ_nm);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_brk_typ, HdrR.$pay_ntc_dtl_brk_typ);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_brk_typ_nm, HdrR.$pay_ntc_dtl_brk_typ_nm);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_sort_typ, HdrR.$pay_ntc_dtl_sort_typ);
			addColumnPathMap(HdrAllR.$pay_ntc_dtl_sort_typ_nm, HdrR.$pay_ntc_dtl_sort_typ_nm);
			addColumnPathMap(HdrAllR.$pay_ntc_can_slip_typ, HdrR.$pay_ntc_can_slip_typ);
			addColumnPathMap(HdrAllR.$pay_ntc_can_slip_typ_nm, HdrR.$pay_ntc_can_slip_typ_nm);
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
		if (getHdrR().bsppl_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk1HdrPanel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3Panel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4HdrPanel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk1HdrPanel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3Panel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4HdrPanel), false);
		}
		if (getHdrR().psppl_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk2HdrPanel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk2HdrPanel), false);
		}
		if (getHdrR().bsppl_flg() || getHdrR().psppl_flg()) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), false);
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

}