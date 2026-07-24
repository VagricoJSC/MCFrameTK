package mcframe.clientMABC.MABCP0020;

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
import mcframe.clientCore.sys.MCSys;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_CoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_CoReg_MC extends MABCP_CoReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CoReg_MC() {
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
	public MABCP_CoReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected MCPanel getOpeHdrPanel() {
		return TabPanel;
	}
	
	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return TabPanel;
	}

	/**
	 * [MA_MABCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0020_Srch01Caller<P extends MABCP_CoReg, B extends MA_MABCL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			addDownContainer(getBaseR());
		}

	    @Override
		protected void show() {
			super.show();
			
			getLclL().setAll(getLclAllL());
			LclTable.fillSpace();
			downCnv();
		}
	    
	    @Override
	    protected void setMode() {
	    	super.setMode();

			DtlTable.selectRowNoFocus(0);
			DtlSubTable.selectRowNoFocus(0);
			if (isUpdOpe()) {
				Base_base_cur_cd.setMode(MCMode.READ_ONLY);
				Base_ptax_cur_cd.setMode(MCMode.READ_ONLY);
				Base_ac_cl_day.setMode(MCMode.READ_ONLY);
				Base_ac_cl_mon_base.setMode(MCMode.READ_ONLY);
				Base_xfr_stk_mng_typ.setMode(MCMode.READ_ONLY);
				Base_outsrc_upri_typ.setMode(MCMode.READ_ONLY);
			}
	    }

	    @Override
	    protected void moveFocus() {
	    	TabTab.focusActiveFirstComponent();
	    }

		/**
	     * 検索結果のリストを編集します。
	     */
	    protected void downCnv(){
			for (DtlR r: bridge.down0()){
				// Dtl行ＮＯを再セットする
				if (r.getNumberNE(DTL_ROW_NO_COL_NM) != null) {
					r.setNumberNE(DTL_ROW_NO_COL_NM, MCNumber.ZERO);
				}
				downRowCnv(r);
			}
			// LclAll行ＮＯを再セットする
			for (LclR lclRow: getLclAllL()){
				if (lclRow.getNumberNE(DTL_ROW_NO_COL_NM) != null) {
					lclRow.setNumberNE(DTL_ROW_NO_COL_NM, MCNumber.ZERO);
				}
			}
	    }

	    /**
	     * 検索結果の行を編集します。
	     * @param r 編集対象のRow
	     */
	    protected void downRowCnv(DtlR r){
			if (isNull(r)) {
				r = DtlR.create();
			}
			
			BaseR br = getBaseR();
			copy(br, r, createMap_BaseR_DtlR());
			
			DtlTable.selectLeftmostColumn(0);
	    }
	}

	/**
	 * [MA_MABCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0020_Upd01Caller<P extends MABCP_CoReg, B extends MA_MABCL0020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0020_Upd01Caller(P p, B b) {
			super(p, b);
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
		
		/**更新状況に応じたBaseRからDtlＬ へのデータコピーを行います。*/
		protected void setDtlBlock(){

			MCList<DtlR> d = getDtlL();
			BaseR br = getBaseR();
			DtlR dr = d.createRow();

			copy(dr, br, createMap_DtlR_BaseR());
			d.clear();
			d.add(dr);
			if (!isNull(dr.co_cd())) {
				dr.setStatus(Status.MODIFY);
			} else {
				dr.co_cd(getCoCd());
				dr.setStatus(Status.CREATE);
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getBaseR()));
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0020_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0020_Upd01();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL0020_Srch01();
	}
	/**
	 * Panel[DtlSubBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlSubBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlSubTable);
	}
	/**
	 * Panel[DtlSubBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlSubBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlSubTable);
	}
	/**
	 * Panel[DtlSubBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlSubBtn_radd(MCEventInfo info) {
		insertRow(DtlSubTable);
	}
	/**
	 * Panel[DtlSubBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlSubBtn_rdel(MCEventInfo info) {
		deleteRow(DtlSubTable);
	}
	/**
	 * Panel[DtlSubBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlSubBtn_rcopy(MCEventInfo info) {
		copyRow(DtlSubTable);
		DtlSubBtn_rdel.setMode(this, getStatus());
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
	
	@Override
	public void screenClearSetMode(){
		setFIXStatus();
	}


	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		// 登録２タブの入力制御
		setClMode();
		// その他の入力制御
		setOthMode();
	}

	@Override
	public void setUPD_ADMINStatus() {
		super.setUPD_ADMINStatus();
		// 登録２タブの入力制御
		setClMode();
		// その他の入力制御
		setOthMode();
	}

	protected void setClMode() {
		// 登録２タブの入力制御
		setBillClMode();
		setBillXrateMode();
		setSlsClMode();
		setRcvClMode();
		setPurcClMode();
		setPayClMode();
		setStkClMode();
		setPaySchdClMode();
		setPayXrateMode();
	}
	protected void setOthMode() {
		setBillBasisTypMode();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setVisible(false);
	}

	@Override
	protected void valueInit(){
		super.valueInit();
		getCndR().co_cd(getCoCd());
		getCndR().co_nm_lcl(getCoNm());
		addDoBehind(Cnd_srch);
	}

	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlSubTable.addSortColumn(columnDtlSub_st_dt);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlSubTable, createDtlSubRowListener());
	}

	protected MCRowListener createDtlSubRowListener() {
		return new DtlSubRowListener();
	}

	protected class DtlSubRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
				// 補助画面のKey項目を設定する
				MCConstRow r = event.getSourceRow();
				if (r != null) {
					DtlSubR subR = (DtlSubR) r;
					if (isNull(subR.co_cd())) {
						subR.co_cd(getCoCd());
					}
				}
			}
		}
	}
	
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		//何もしない
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBaseR().clearAll();
		DtlSubTable.clear();
		if (getStatus() == REF) {
			setREFStatus();
		}
		else {
			setFIXStatus();
		}
	}

	@Override
	protected void refreshLclAllL() {
		getLclAllL().setAll(getLclL().subList("check", true));
		for(LclR r: getLclAllL()) {
			if (isNull(r.co_cd())) {
				r.co_cd(getCoCd());
			}
		}
	}

	@Override
	public void doBase_ar_no_use_flg_NC(MCEventInfo info) {
		super.doBase_ar_no_use_flg_NC(info);
		// 請求・入金関連の表示制御
		setBillClMode();
		setRcvClMode();
		setBillXrateMode();
	}
	
	@Override
	public void doBase_ap_no_use_flg_NC(MCEventInfo info) {
		super.doBase_ap_no_use_flg_NC(info);
		//支払関連の制御
		setPayClMode();
		setPaySchdClMode();
		setPayXrateMode();
	}

	@Override
	public void doBase_sls_cl_flg_NC(MCEventInfo info) {
		super.doBase_sls_cl_flg_NC(info);
		// カレンダＣＤ、締日遅延日数、締日前後区分の表示制御
		setSlsClMode();
		setXrateRevFlgMode();
	}
	
	@Override
	public void doBase_rcv_cl_flg_NC(MCEventInfo info) {
		super.doBase_rcv_cl_flg_NC(info);
		// カレンダＣＤ、締日遅延日数、締日前後区分の表示制御
		setRcvClMode();
		setXrateRevFlgMode();
	}
	
	@Override
	public void doBase_purc_cl_flg_NC(MCEventInfo info) {
		super.doBase_purc_cl_flg_NC(info);
		// カレンダＣＤ、締日遅延日数、締日前後区分の表示制御
		setPurcClMode();
		setXrateRevFlgMode();
	}
	
	@Override
	public void doBase_pay_cl_flg_NC(MCEventInfo info) {
		super.doBase_pay_cl_flg_NC(info);
		// カレンダＣＤ、締日遅延日数、締日前後区分の表示制御
		setPayClMode();
		setXrateRevFlgMode();
	}

	@Override
	public void doBase_bill_xrate_conv_flg_NC(MCEventInfo info) {
		super.doBase_bill_xrate_conv_flg_NC(info);
		// 請求為替レートCDのモード設定
		setBillXrateMode();
	}
	@Override
	public void doBase_pay_xrate_conv_flg_NC(MCEventInfo info) {
		super.doBase_pay_xrate_conv_flg_NC(info);
		// 支払照合為替レートCDのモード設定
		setPayXrateMode();
	}

	// 請求締カレンダＣＤの表示制御
	protected void setBillClMode() {
    	if(Base_ar_no_use_flg.getValue()){
    		((MCModeBeans)Base_bill_cl_cal_cd).setMode(MCMode.READ_ONLY);
    		setValueEx(Base_bill_cl_cal_cd, null);
    	}
    	else{
    		setDefaultMode((MCModeBeans)Base_bill_cl_cal_cd);
    	}
	}

	// 請求為替レートCDの表示制御
	protected void setBillXrateMode() {
		if (Base_ar_no_use_flg.getValue()) {
			setValueEx(Base_bill_xrate_conv_flg, false);
			((MCModeBeans)Base_bill_xrate_conv_flg).setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode((MCModeBeans)Base_bill_xrate_conv_flg);
		}
		if (!Base_bill_xrate_conv_flg.getValue()) {
			setValueEx(Base_bill_xrate_cd, null);
			((MCModeBeans)Base_bill_xrate_cd).setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode((MCModeBeans)Base_bill_xrate_cd);
		}
	}
	// 支払照合為替レートCDの表示制御
	protected void setPayXrateMode() {
		if (Base_ap_no_use_flg.getValue()) {
			setValueEx(Base_pay_xrate_conv_flg, false);
			((MCModeBeans)Base_pay_xrate_conv_flg).setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode((MCModeBeans)Base_pay_xrate_conv_flg);
		}
		if (!Base_pay_xrate_conv_flg.getValue()) {
			setValueEx(Base_pay_xrate_cd, null);
			((MCModeBeans)Base_pay_xrate_cd).setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode((MCModeBeans)Base_pay_xrate_cd);
		}
	}

	// 支払予定締カレンダＣＤの表示制御
	protected void setPaySchdClMode() {
    	if(Base_ap_no_use_flg.getValue()){
    		((MCModeBeans)Base_pay_schd_cl_cal_cd).setMode(MCMode.READ_ONLY);
    		setValueEx(Base_pay_schd_cl_cal_cd, null);
    	}
    	else{
    		setDefaultMode((MCModeBeans)Base_pay_schd_cl_cal_cd);
    	}
	}
	
	// 在庫締日遅延日数、在庫締日前後区分の表示制御
	protected void setStkClMode() {
	    setBaTypMode(Base_stk_cl_delay_days.getValue(), Base_stk_cl_ba_typ);
	}

	// 売上フラグから、売上締カレンダＣＤ、売上締日遅延日数、売上締日前後区分の表示制御
	protected void setSlsClMode() {
		setClFlgMode(Base_sls_cl_flg.getValue(), Base_sls_cl_cal_cd, Base_sls_cl_cal_nm, Base_sls_cl_delay_days,Base_sls_cl_ba_typ);
	    setBaTypMode(Base_sls_cl_delay_days.getValue(), Base_sls_cl_ba_typ);
	}
	
	// 入金フラグから、入金締カレンダＣＤ、入金締日遅延日数、入金締日前後区分の表示制御
	protected void setRcvClMode() {
		if(Base_ar_no_use_flg.getValue()) {
			((MCModeBeans)Base_rcv_cl_flg).setMode(MCMode.READ_ONLY);
			if (Base_rcv_cl_flg.getValue()){
				setValueEx(Base_rcv_cl_flg, false);
			}
    	}
		else {
			setDefaultMode((MCModeBeans)Base_rcv_cl_flg);
		}
		setClFlgMode(Base_rcv_cl_flg.getValue(), Base_rcv_cl_cal_cd, Base_rcv_cl_cal_nm, Base_rcv_cl_delay_days,Base_rcv_cl_ba_typ);
	    setBaTypMode(Base_rcv_cl_delay_days.getValue(), Base_rcv_cl_ba_typ);
	}
	
	// 仕入フラグから、仕入締カレンダＣＤ、仕入締日遅延日数、仕入締日前後区分の表示制御
	protected void setPurcClMode() {
		setClFlgMode(Base_purc_cl_flg.getValue(), Base_purc_cl_cal_cd, Base_purc_cl_cal_nm, Base_purc_cl_delay_days, Base_purc_cl_ba_typ);
		setBaTypMode(Base_purc_cl_delay_days.getValue(), Base_purc_cl_ba_typ);
	}

	// 支払フラグから、支払締カレンダＣＤ、支払締日遅延日数、支払締日前後区分の表示制御
	protected void setPayClMode() {
		if(Base_ap_no_use_flg.getValue()) {
			((MCModeBeans)Base_pay_cl_flg).setMode(MCMode.READ_ONLY);
			if (Base_pay_cl_flg.getValue()){
				setValueEx(Base_pay_cl_flg, false);
			}
    	}
		else {
			setDefaultMode((MCModeBeans)Base_pay_cl_flg);
		}
		setClFlgMode(Base_pay_cl_flg.getValue(), Base_pay_cl_cal_cd, Base_pay_cl_cal_nm, Base_pay_cl_delay_days, Base_pay_cl_ba_typ);
	    setBaTypMode(Base_pay_cl_delay_days.getValue(), Base_pay_cl_ba_typ);
	}

	// 請求起算区分区分の表示制御
	protected void setBillBasisTypMode() {
		if ((MAC_SLS_BASIS_TYP.isIN_BASIS(getBaseR().sls_basis_typ())
				&& MAC_BILL_BASIS_TYP.isSLS_AC(getBaseR().bill_basis_typ()))
				|| (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getBaseR().sls_basis_typ())
						&& MAC_BILL_BASIS_TYP.isARRV(getBaseR().bill_basis_typ()))) {
			Base_bill_basis_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Base_bill_basis_typ);
		}
	}

	protected void setXrateRevFlgMode() {
		boolean flg = getBaseR().sls_cl_flg() && getBaseR().rcv_cl_flg() || getBaseR().purc_cl_flg() && getBaseR().pay_cl_flg();
		setFlgMode(Base_mon01_xrate_rev_flg, flg);
		setFlgMode(Base_mon02_xrate_rev_flg, flg);
		setFlgMode(Base_mon03_xrate_rev_flg, flg);
		setFlgMode(Base_mon04_xrate_rev_flg, flg);
		setFlgMode(Base_mon05_xrate_rev_flg, flg);
		setFlgMode(Base_mon06_xrate_rev_flg, flg);
		setFlgMode(Base_mon07_xrate_rev_flg, flg);
		setFlgMode(Base_mon08_xrate_rev_flg, flg);
		setFlgMode(Base_mon09_xrate_rev_flg, flg);
		setFlgMode(Base_mon10_xrate_rev_flg, flg);
		setFlgMode(Base_mon11_xrate_rev_flg, flg);
		setFlgMode(Base_mon12_xrate_rev_flg, flg);
	}

	protected void setFlgMode(MCCheckBox cb, boolean flg) {
		if (flg) {
			setDefaultMode(cb);
		}
		else {
			cb.setMode(MCMode.READ_ONLY);
			setValueEx(cb, false);
		}
	}

	/**
	 * 登録２タブでフラグをより、カレンダＣＤ、締日遅延日数の制御を行う
	 * @param clFlg 売上、入金、仕入、支払フラグ
	 * @param calCd 各カレンダＣＤ
	 * @param calNm 各カレンダ名
	 * @param delayDays 各締日遅延日数
	 * @param baTyp 各締日前後区分
	 */
    protected void setClFlgMode(Boolean clFlg, MCRowBeans calCd, MCRowBeans calNm, MCRowBeans delayDays, MCRowBeans baTyp) {
    	// フラグはオンの場合
    	if(clFlg){
    		setDefaultMode((MCModeBeans)calCd);
    		setDefaultMode((MCModeBeans)delayDays);
    		setDefaultMode((MCModeBeans)baTyp);
    	}
    	else{
    		((MCModeBeans)calCd).setMode(MCMode.READ_ONLY);
    		((MCModeBeans)delayDays).setMode(MCMode.READ_ONLY);
    		((MCModeBeans)baTyp).setMode(MCMode.READ_ONLY);
    		setValueEx(calCd, null);
    		setValueEx(calNm, null);
    		setValueEx(delayDays, null);
    		setValueEx(baTyp, null);
    	}
    }
	
	@Override
	public void doBase_sls_cl_delay_days_NC(MCEventInfo info) {
		super.doBase_sls_cl_delay_days_NC(info);
		// 締日前後区分の入力制御
	    setBaTypMode(Base_sls_cl_delay_days.getValue(), Base_sls_cl_ba_typ);
	}
	
	@Override
	public void doBase_rcv_cl_delay_days_NC(MCEventInfo info) {
		super.doBase_rcv_cl_delay_days_NC(info);
		// 締日前後区分の入力制御
	    setBaTypMode(Base_rcv_cl_delay_days.getValue(), Base_rcv_cl_ba_typ);
	}
	
	@Override
	public void doBase_purc_cl_delay_days_NC(MCEventInfo info) {
		super.doBase_purc_cl_delay_days_NC(info);
		// 締日前後区分の入力制御
	    setBaTypMode(Base_purc_cl_delay_days.getValue(), Base_purc_cl_ba_typ);
	}

	@Override
	public void doBase_pay_cl_delay_days_NC(MCEventInfo info) {
		super.doBase_pay_cl_delay_days_NC(info);
		// 締日前後区分の入力制御
	    setBaTypMode(Base_pay_cl_delay_days.getValue(), Base_pay_cl_ba_typ);
	}
	
	@Override
	public void doBase_stk_cl_delay_days_NC(MCEventInfo info) {
		super.doBase_stk_cl_delay_days_NC(info);
		// 締日前後区分の入力制御
		setStkClMode();
	}
		
	/**
	 * 締日前後区分の入力制御を行う
	 * @param delayDays 各締日遅延日数
	 * @param b 各締日前後区分
	 */
    protected void setBaTypMode(MCNumber delayDays, MCRowBeans b) {
		if (!isNull(delayDays)) {
			// 締日前後日数に０が設定されている場合に入力可能（必須）となる
			if(delayDays.isZero()) {
				setDefaultMode((MCModeBeans)b);
			}
			else {
				((MCModeBeans)b).setMode(MCMode.READ_ONLY);
				setValueEx(b, null);
			}
		}
		else {
			((MCModeBeans)b).setMode(MCMode.READ_ONLY);
			setValueEx(b, null);
		}
    }

    @Override
    public void doBase_sls_basis_typ_NC(MCEventInfo info) {
    	super.doBase_sls_basis_typ_NC(info);
		if (!MAC_SLS_BASIS_TYP.isSHIP_BASIS(getBaseR().sls_basis_typ())) {
			Base_bill_basis_typ.setMode(MCMode.READ_ONLY);
			if (MAC_SLS_BASIS_TYP.isIN_BASIS(getBaseR().sls_basis_typ())) {
				setValueEx(Base_bill_basis_typ, MAC_BILL_BASIS_TYP.SLS_AC.value());
			}
			else {
				setValueEx(Base_bill_basis_typ, MAC_BILL_BASIS_TYP.ARRV.value());
			}
		}
		else {
			Base_bill_basis_typ.setMode(MCMode.REQUIRED);
		}
    }

    @Override
    public void doDtlSub_NC(MCEventInfo info) {
    	super.doDtlSub_NC(info);
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getDtlSubL().get(info.getEventIndex());

		if (row == null) {
			DtlSubBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			DtlSubBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlSubBtn_rdel.setMode(this, getStatus());
		}
    }
    
	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlSubTable.fillSpace();
	}

	/** ログインユーザの会社コードを返す。*/
	protected String getCoCd() {
		return MCSys.user.coCD();
	}
    
	/** ログインユーザの会社名を返す。*/
	protected String getCoNm() {
		return MCSys.user.coNm();
	}

	protected Map_BaseR_DtlR<BaseR,DtlR> createMap_BaseR_DtlR() {
		return new Map_BaseR_DtlR<BaseR, DtlR>();
	}

	public class Map_BaseR_DtlR<D extends BaseR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(BaseR.$co_cd, DtlR.$co_cd);
			addColumnPathMap(BaseR.$co_alt_nm1, DtlR.$co_alt_nm1);
			addColumnPathMap(BaseR.$co_alt_nm2, DtlR.$co_alt_nm2);
			addColumnPathMap(BaseR.$co_alt_nm3, DtlR.$co_alt_nm3);
			addColumnPathMap(BaseR.$co_alt_nm4, DtlR.$co_alt_nm4);
			addColumnPathMap(BaseR.$zip_cd, DtlR.$zip_cd);
			addColumnPathMap(BaseR.$addr1, DtlR.$addr1);
			addColumnPathMap(BaseR.$addr2, DtlR.$addr2);
			addColumnPathMap(BaseR.$addr3, DtlR.$addr3);
			addColumnPathMap(BaseR.$addr4, DtlR.$addr4);
			addColumnPathMap(BaseR.$tel, DtlR.$tel);
			addColumnPathMap(BaseR.$fax, DtlR.$fax);
			addColumnPathMap(BaseR.$co_repl_nm, DtlR.$co_repl_nm);
			addColumnPathMap(BaseR.$cntry_cd, DtlR.$cntry_cd);
			addColumnPathMap(BaseR.$cntry_nm, DtlR.$cntry_nm);
			addColumnPathMap(BaseR.$area_cd, DtlR.$area_cd);
			addColumnPathMap(BaseR.$area_nm, DtlR.$area_nm);
			addColumnPathMap(BaseR.$base_cur_cd, DtlR.$base_cur_cd);
			addColumnPathMap(BaseR.$base_cur_nm, DtlR.$base_cur_nm);
			addColumnPathMap(BaseR.$ptax_cur_cd, DtlR.$ptax_cur_cd);
			addColumnPathMap(BaseR.$ptax_cur_nm, DtlR.$ptax_cur_nm);
			addColumnPathMap(BaseR.$ac_cl_day, DtlR.$ac_cl_day);
			addColumnPathMap(BaseR.$ac_cl_mon_base, DtlR.$ac_cl_mon_base);
			addColumnPathMap(BaseR.$st_mon, DtlR.$st_mon);
			addColumnPathMap(BaseR.$dt_switch_time, DtlR.$dt_switch_time);
			addColumnPathMap(BaseR.$ein, DtlR.$ein);
			addColumnPathMap(BaseR.$biz_co_no, DtlR.$biz_co_no);
			addColumnPathMap(BaseR.$std_co_cd, DtlR.$std_co_cd);
			addColumnPathMap(BaseR.$std_cal_cd, DtlR.$std_cal_cd);
			addColumnPathMap(BaseR.$std_cal_nm, DtlR.$std_cal_nm);
			addColumnPathMap(BaseR.$bill_cl_cal_cd, DtlR.$bill_cl_cal_cd);
			addColumnPathMap(BaseR.$bill_cl_cal_nm, DtlR.$bill_cl_cal_nm);
			addColumnPathMap(BaseR.$ar_no_use_flg, DtlR.$ar_no_use_flg);
			addColumnPathMap(BaseR.$ap_no_use_flg, DtlR.$ap_no_use_flg);
			addColumnPathMap(BaseR.$temp_ap_use_flg, DtlR.$temp_ap_use_flg);
			addColumnPathMap(BaseR.$stk_cl_cal_cd, DtlR.$stk_cl_cal_cd);
			addColumnPathMap(BaseR.$stk_cl_cal_nm, DtlR.$stk_cl_cal_nm);
			addColumnPathMap(BaseR.$stk_cl_delay_days, DtlR.$stk_cl_delay_days);
			addColumnPathMap(BaseR.$stk_cl_ba_typ, DtlR.$stk_cl_ba_typ);
			addColumnPathMap(BaseR.$stk_cl_ba_typ_nm, DtlR.$stk_cl_ba_typ_nm);
			addColumnPathMap(BaseR.$sls_cl_flg, DtlR.$sls_cl_flg);
			addColumnPathMap(BaseR.$sls_cl_cal_cd, DtlR.$sls_cl_cal_cd);
			addColumnPathMap(BaseR.$sls_cl_cal_nm, DtlR.$sls_cl_cal_nm);
			addColumnPathMap(BaseR.$sls_cl_delay_days, DtlR.$sls_cl_delay_days);
			addColumnPathMap(BaseR.$sls_cl_ba_typ, DtlR.$sls_cl_ba_typ);
			addColumnPathMap(BaseR.$sls_cl_ba_typ_nm, DtlR.$sls_cl_ba_typ_nm);
			addColumnPathMap(BaseR.$rcv_cl_flg, DtlR.$rcv_cl_flg);
			addColumnPathMap(BaseR.$rcv_cl_cal_cd, DtlR.$rcv_cl_cal_cd);
			addColumnPathMap(BaseR.$rcv_cl_cal_nm, DtlR.$rcv_cl_cal_nm);
			addColumnPathMap(BaseR.$rcv_cl_delay_days, DtlR.$rcv_cl_delay_days);
			addColumnPathMap(BaseR.$rcv_cl_ba_typ, DtlR.$rcv_cl_ba_typ);
			addColumnPathMap(BaseR.$rcv_cl_ba_typ_nm, DtlR.$rcv_cl_ba_typ_nm);
			addColumnPathMap(BaseR.$purc_cl_flg, DtlR.$purc_cl_flg);
			addColumnPathMap(BaseR.$purc_cl_cal_cd, DtlR.$purc_cl_cal_cd);
			addColumnPathMap(BaseR.$purc_cl_cal_nm, DtlR.$purc_cl_cal_nm);
			addColumnPathMap(BaseR.$purc_cl_delay_days, DtlR.$purc_cl_delay_days);
			addColumnPathMap(BaseR.$purc_cl_ba_typ, DtlR.$purc_cl_ba_typ);
			addColumnPathMap(BaseR.$purc_cl_ba_typ_nm, DtlR.$purc_cl_ba_typ_nm);
			addColumnPathMap(BaseR.$pay_cl_flg, DtlR.$pay_cl_flg);
			addColumnPathMap(BaseR.$pay_cl_cal_cd, DtlR.$pay_cl_cal_cd);
			addColumnPathMap(BaseR.$pay_cl_cal_nm, DtlR.$pay_cl_cal_nm);
			addColumnPathMap(BaseR.$pay_cl_delay_days, DtlR.$pay_cl_delay_days);
			addColumnPathMap(BaseR.$pay_cl_ba_typ, DtlR.$pay_cl_ba_typ);
			addColumnPathMap(BaseR.$pay_cl_ba_typ_nm, DtlR.$pay_cl_ba_typ_nm);
			addColumnPathMap(BaseR.$pay_schd_cl_cal_cd, DtlR.$pay_schd_cl_cal_cd);
			addColumnPathMap(BaseR.$pay_schd_cl_cal_nm, DtlR.$pay_schd_cl_cal_nm);
			addColumnPathMap(BaseR.$sls_xrate_cd, DtlR.$sls_xrate_cd);
			addColumnPathMap(BaseR.$sls_xrate_nm, DtlR.$sls_xrate_nm);
			addColumnPathMap(BaseR.$purc_xrate_cd, DtlR.$purc_xrate_cd);
			addColumnPathMap(BaseR.$purc_xrate_nm, DtlR.$purc_xrate_nm);
			addColumnPathMap(BaseR.$prov_xrate_cd, DtlR.$prov_xrate_cd);
			addColumnPathMap(BaseR.$prov_xrate_nm, DtlR.$prov_xrate_nm);
			addColumnPathMap(BaseR.$bill_xrate_conv_flg, DtlR.$bill_xrate_conv_flg);
			addColumnPathMap(BaseR.$bill_xrate_cd, DtlR.$bill_xrate_cd);
			addColumnPathMap(BaseR.$bill_xrate_nm, DtlR.$bill_xrate_nm);
			addColumnPathMap(BaseR.$pay_xrate_conv_flg, DtlR.$pay_xrate_conv_flg);
			addColumnPathMap(BaseR.$pay_xrate_cd, DtlR.$pay_xrate_cd);
			addColumnPathMap(BaseR.$pay_xrate_nm, DtlR.$pay_xrate_nm);
			addColumnPathMap(BaseR.$mon01_xrate_rev_flg, DtlR.$mon01_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon02_xrate_rev_flg, DtlR.$mon02_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon03_xrate_rev_flg, DtlR.$mon03_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon04_xrate_rev_flg, DtlR.$mon04_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon05_xrate_rev_flg, DtlR.$mon05_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon06_xrate_rev_flg, DtlR.$mon06_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon07_xrate_rev_flg, DtlR.$mon07_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon08_xrate_rev_flg, DtlR.$mon08_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon09_xrate_rev_flg, DtlR.$mon09_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon10_xrate_rev_flg, DtlR.$mon10_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon11_xrate_rev_flg, DtlR.$mon11_xrate_rev_flg);
			addColumnPathMap(BaseR.$mon12_xrate_rev_flg, DtlR.$mon12_xrate_rev_flg);
			addColumnPathMap(BaseR.$sls_upri_req_typ, DtlR.$sls_upri_req_typ);
			addColumnPathMap(BaseR.$sls_upri_req_typ_nm, DtlR.$sls_upri_req_typ_nm);
			addColumnPathMap(BaseR.$purc_upri_req_typ, DtlR.$purc_upri_req_typ);
			addColumnPathMap(BaseR.$purc_upri_req_typ_nm, DtlR.$purc_upri_req_typ_nm);
			addColumnPathMap(BaseR.$outsrc_upri_typ, DtlR.$outsrc_upri_typ);
			addColumnPathMap(BaseR.$outsrc_upri_typ_nm, DtlR.$outsrc_upri_typ_nm);
			addColumnPathMap(BaseR.$sls_basis_typ, DtlR.$sls_basis_typ);
			addColumnPathMap(BaseR.$sls_basis_typ_nm, DtlR.$sls_basis_typ_nm);
			addColumnPathMap(BaseR.$bill_basis_typ, DtlR.$bill_basis_typ);
			addColumnPathMap(BaseR.$bill_basis_typ_nm, DtlR.$bill_basis_typ_nm);
			addColumnPathMap(BaseR.$ship_schd_split_typ, DtlR.$ship_schd_split_typ);
			addColumnPathMap(BaseR.$ship_schd_split_typ_nm, DtlR.$ship_schd_split_typ_nm);
			addColumnPathMap(BaseR.$xfr_stk_mng_typ, DtlR.$xfr_stk_mng_typ);
			addColumnPathMap(BaseR.$xfr_stk_mng_typ_nm, DtlR.$xfr_stk_mng_typ_nm);
			addColumnPathMap(BaseR.$xrate_rnd_typ, DtlR.$xrate_rnd_typ);
			addColumnPathMap(BaseR.$xrate_rnd_typ_nm, DtlR.$xrate_rnd_typ_nm);
			addColumnPathMap(BaseR.$setoff_tax_rnd_typ, DtlR.$setoff_tax_rnd_typ);
			addColumnPathMap(BaseR.$setoff_tax_rnd_typ_nm, DtlR.$setoff_tax_rnd_typ_nm);
			addColumnPathMap(BaseR.$com_paid_tax_rnd_typ, DtlR.$com_paid_tax_rnd_typ);
			addColumnPathMap(BaseR.$com_paid_tax_rnd_typ_nm, DtlR.$com_paid_tax_rnd_typ_nm);
			addColumnPathMap(BaseR.$wtax_rnd_typ, DtlR.$wtax_rnd_typ);
			addColumnPathMap(BaseR.$wtax_rnd_typ_nm, DtlR.$wtax_rnd_typ_nm);
			addColumnPathMap(BaseR.$stk_amt_rnd_typ, DtlR.$stk_amt_rnd_typ);
			addColumnPathMap(BaseR.$stk_amt_rnd_typ_nm, DtlR.$stk_amt_rnd_typ_nm);
			addColumnPathMap(BaseR.$stk_amt_dec_place, DtlR.$stk_amt_dec_place);
			addColumnPathMap(BaseR.$sls_bdj_rnd_typ, DtlR.$sls_bdj_rnd_typ);
			addColumnPathMap(BaseR.$sls_bdj_rnd_typ_nm, DtlR.$sls_bdj_rnd_typ_nm);
			addColumnPathMap(BaseR.$po_print_cd, DtlR.$po_print_cd);
			addColumnPathMap(BaseR.$po_print_nm, DtlR.$po_print_nm);
			addColumnPathMap(BaseR.$stk_lst_cnf_num, DtlR.$stk_lst_cnf_num);
			addColumnPathMap(BaseR.$stk_lst_limit_num, DtlR.$stk_lst_limit_num);
			addColumnPathMap(BaseR.$early_ship_dt_add_days, DtlR.$early_ship_dt_add_days);
			addColumnPathMap(BaseR.$gm_std_upri_typ, DtlR.$gm_std_upri_typ);
			addColumnPathMap(BaseR.$gm_std_upri_typ_nm, DtlR.$gm_std_upri_typ_nm);
			addColumnPathMap(BaseR.$stk_std_upri_typ, DtlR.$stk_std_upri_typ);
			addColumnPathMap(BaseR.$stk_std_upri_typ_nm, DtlR.$stk_std_upri_typ_nm);
			addColumnPathMap(BaseR.$ac_slip_digit, DtlR.$ac_slip_digit);
			addColumnPathMap(BaseR.$ac_slip_seq_flg, DtlR.$ac_slip_seq_flg);
			addColumnPathMap(BaseR.$ins_usr_id, DtlR.$ins_usr_id);
			addColumnPathMap(BaseR.$ins_usr_nm, DtlR.$ins_usr_nm);
			addColumnPathMap(BaseR.$ins_ts, DtlR.$ins_ts);
			addColumnPathMap(BaseR.$ins_func_id, DtlR.$ins_func_id);
			addColumnPathMap(BaseR.$ins_func_nm, DtlR.$ins_func_nm);
			addColumnPathMap(BaseR.$upd_cntr, DtlR.$upd_cntr);
			addColumnPathMap(BaseR.$upd_usr_id, DtlR.$upd_usr_id);
			addColumnPathMap(BaseR.$upd_usr_nm, DtlR.$upd_usr_nm);
			addColumnPathMap(BaseR.$upd_ts, DtlR.$upd_ts);
			addColumnPathMap(BaseR.$upd_func_id, DtlR.$upd_func_id);
			addColumnPathMap(BaseR.$upd_func_nm, DtlR.$upd_func_nm);
			addColumnPathMap(BaseR.$upd_srv_req_no, DtlR.$upd_srv_req_no);
			addColumnPathMap(BaseR.$rpt_strg_ext_sys_cd, DtlR.$rpt_strg_ext_sys_cd);
			addColumnPathMap(BaseR.$rpt_strg_ext_sys_nm, DtlR.$rpt_strg_ext_sys_nm);
			addColumnPathMap(BaseR.$cst_prnt_typ, DtlR.$cst_prnt_typ);
			addColumnPathMap(BaseR.$cst_prnt_typ_nm, DtlR.$cst_prnt_typ_nm);
			addColumnPathMap(BaseR.$acst_prnt_typ, DtlR.$acst_prnt_typ);
			addColumnPathMap(BaseR.$acst_prnt_typ_nm, DtlR.$acst_prnt_typ_nm);
			addColumnPathMap(BaseR.$bcst_prnt_typ, DtlR.$bcst_prnt_typ);
			addColumnPathMap(BaseR.$bcst_prnt_typ_nm, DtlR.$bcst_prnt_typ_nm);
			addColumnPathMap(BaseR.$rcst_prnt_typ, DtlR.$rcst_prnt_typ);
			addColumnPathMap(BaseR.$rcst_prnt_typ_nm, DtlR.$rcst_prnt_typ_nm);
			addColumnPathMap(BaseR.$dlv_prnt_typ, DtlR.$dlv_prnt_typ);
			addColumnPathMap(BaseR.$dlv_prnt_typ_nm, DtlR.$dlv_prnt_typ_nm);
			addColumnPathMap(BaseR.$sppl_prnt_typ, DtlR.$sppl_prnt_typ);
			addColumnPathMap(BaseR.$sppl_prnt_typ_nm, DtlR.$sppl_prnt_typ_nm);
			addColumnPathMap(BaseR.$asppl_prnt_typ, DtlR.$asppl_prnt_typ);
			addColumnPathMap(BaseR.$asppl_prnt_typ_nm, DtlR.$asppl_prnt_typ_nm);
			addColumnPathMap(BaseR.$bsppl_prnt_typ, DtlR.$bsppl_prnt_typ);
			addColumnPathMap(BaseR.$bsppl_prnt_typ_nm, DtlR.$bsppl_prnt_typ_nm);
			addColumnPathMap(BaseR.$psppl_prnt_typ, DtlR.$psppl_prnt_typ);
			addColumnPathMap(BaseR.$psppl_prnt_typ_nm, DtlR.$psppl_prnt_typ_nm);
		}
	}

	protected Map_DtlR_BaseR<DtlR,BaseR> createMap_DtlR_BaseR() {
		return new Map_DtlR_BaseR<DtlR, BaseR>();
	}

	public class Map_DtlR_BaseR<D extends DtlR, S extends BaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$co_cd, BaseR.$co_cd);
			addColumnPathMap(DtlR.$co_alt_nm1, BaseR.$co_alt_nm1);
			addColumnPathMap(DtlR.$co_alt_nm2, BaseR.$co_alt_nm2);
			addColumnPathMap(DtlR.$co_alt_nm3, BaseR.$co_alt_nm3);
			addColumnPathMap(DtlR.$co_alt_nm4, BaseR.$co_alt_nm4);
			addColumnPathMap(DtlR.$zip_cd, BaseR.$zip_cd);
			addColumnPathMap(DtlR.$addr1, BaseR.$addr1);
			addColumnPathMap(DtlR.$addr2, BaseR.$addr2);
			addColumnPathMap(DtlR.$addr3, BaseR.$addr3);
			addColumnPathMap(DtlR.$addr4, BaseR.$addr4);
			addColumnPathMap(DtlR.$tel, BaseR.$tel);
			addColumnPathMap(DtlR.$fax, BaseR.$fax);
			addColumnPathMap(DtlR.$co_repl_nm, BaseR.$co_repl_nm);
			addColumnPathMap(DtlR.$ein, BaseR.$ein);
			addColumnPathMap(DtlR.$biz_co_no, BaseR.$biz_co_no);
			addColumnPathMap(DtlR.$std_co_cd, BaseR.$std_co_cd);
			addColumnPathMap(DtlR.$cntry_cd, BaseR.$cntry_cd);
			addColumnPathMap(DtlR.$area_cd, BaseR.$area_cd);
			addColumnPathMap(DtlR.$base_cur_cd, BaseR.$base_cur_cd);
			addColumnPathMap(DtlR.$ptax_cur_cd, BaseR.$ptax_cur_cd);
			addColumnPathMap(DtlR.$st_mon, BaseR.$st_mon);
			addColumnPathMap(DtlR.$dt_switch_time, BaseR.$dt_switch_time);
			addColumnPathMap(DtlR.$ac_cl_day, BaseR.$ac_cl_day);
			addColumnPathMap(DtlR.$ac_cl_mon_base, BaseR.$ac_cl_mon_base);
			addColumnPathMap(DtlR.$std_cal_cd, BaseR.$std_cal_cd);
			addColumnPathMap(DtlR.$bill_cl_cal_cd, BaseR.$bill_cl_cal_cd);
			addColumnPathMap(DtlR.$ar_no_use_flg, BaseR.$ar_no_use_flg);
			addColumnPathMap(DtlR.$ap_no_use_flg, BaseR.$ap_no_use_flg);
			addColumnPathMap(DtlR.$temp_ap_use_flg, BaseR.$temp_ap_use_flg);
			addColumnPathMap(DtlR.$sls_cl_flg, BaseR.$sls_cl_flg);
			addColumnPathMap(DtlR.$rcv_cl_flg, BaseR.$rcv_cl_flg);
			addColumnPathMap(DtlR.$purc_cl_flg, BaseR.$purc_cl_flg);
			addColumnPathMap(DtlR.$pay_cl_flg, BaseR.$pay_cl_flg);
			addColumnPathMap(DtlR.$stk_cl_cal_cd, BaseR.$stk_cl_cal_cd);
			addColumnPathMap(DtlR.$sls_cl_cal_cd, BaseR.$sls_cl_cal_cd);
			addColumnPathMap(DtlR.$rcv_cl_cal_cd, BaseR.$rcv_cl_cal_cd);
			addColumnPathMap(DtlR.$purc_cl_cal_cd, BaseR.$purc_cl_cal_cd);
			addColumnPathMap(DtlR.$pay_cl_cal_cd, BaseR.$pay_cl_cal_cd);
			addColumnPathMap(DtlR.$stk_cl_delay_days, BaseR.$stk_cl_delay_days);
			addColumnPathMap(DtlR.$stk_cl_ba_typ, BaseR.$stk_cl_ba_typ);
			addColumnPathMap(DtlR.$sls_cl_delay_days, BaseR.$sls_cl_delay_days);
			addColumnPathMap(DtlR.$sls_cl_ba_typ, BaseR.$sls_cl_ba_typ);
			addColumnPathMap(DtlR.$rcv_cl_delay_days, BaseR.$rcv_cl_delay_days);
			addColumnPathMap(DtlR.$rcv_cl_ba_typ, BaseR.$rcv_cl_ba_typ);
			addColumnPathMap(DtlR.$purc_cl_delay_days, BaseR.$purc_cl_delay_days);
			addColumnPathMap(DtlR.$purc_cl_ba_typ, BaseR.$purc_cl_ba_typ);
			addColumnPathMap(DtlR.$pay_cl_delay_days, BaseR.$pay_cl_delay_days);
			addColumnPathMap(DtlR.$pay_cl_ba_typ, BaseR.$pay_cl_ba_typ);
			addColumnPathMap(DtlR.$pay_schd_cl_cal_cd, BaseR.$pay_schd_cl_cal_cd);
			addColumnPathMap(DtlR.$pay_schd_cl_cal_nm, BaseR.$pay_schd_cl_cal_nm);
			addColumnPathMap(DtlR.$sls_xrate_cd, BaseR.$sls_xrate_cd);
			addColumnPathMap(DtlR.$purc_xrate_cd, BaseR.$purc_xrate_cd);
			addColumnPathMap(DtlR.$prov_xrate_cd, BaseR.$prov_xrate_cd);
			addColumnPathMap(DtlR.$bill_xrate_conv_flg, BaseR.$bill_xrate_conv_flg);
			addColumnPathMap(DtlR.$bill_xrate_cd, BaseR.$bill_xrate_cd);
			addColumnPathMap(DtlR.$pay_xrate_conv_flg, BaseR.$pay_xrate_conv_flg);
			addColumnPathMap(DtlR.$pay_xrate_cd, BaseR.$pay_xrate_cd);
			addColumnPathMap(DtlR.$mon01_xrate_rev_flg, BaseR.$mon01_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon02_xrate_rev_flg, BaseR.$mon02_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon03_xrate_rev_flg, BaseR.$mon03_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon04_xrate_rev_flg, BaseR.$mon04_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon05_xrate_rev_flg, BaseR.$mon05_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon06_xrate_rev_flg, BaseR.$mon06_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon07_xrate_rev_flg, BaseR.$mon07_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon08_xrate_rev_flg, BaseR.$mon08_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon09_xrate_rev_flg, BaseR.$mon09_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon10_xrate_rev_flg, BaseR.$mon10_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon11_xrate_rev_flg, BaseR.$mon11_xrate_rev_flg);
			addColumnPathMap(DtlR.$mon12_xrate_rev_flg, BaseR.$mon12_xrate_rev_flg);
			addColumnPathMap(DtlR.$sls_upri_req_typ, BaseR.$sls_upri_req_typ);
			addColumnPathMap(DtlR.$purc_upri_req_typ, BaseR.$purc_upri_req_typ);
			addColumnPathMap(DtlR.$outsrc_upri_typ, BaseR.$outsrc_upri_typ);
			addColumnPathMap(DtlR.$sls_basis_typ, BaseR.$sls_basis_typ);
			addColumnPathMap(DtlR.$bill_basis_typ, BaseR.$bill_basis_typ);
			addColumnPathMap(DtlR.$ship_schd_split_typ, BaseR.$ship_schd_split_typ);
			addColumnPathMap(DtlR.$xfr_stk_mng_typ, BaseR.$xfr_stk_mng_typ);
			addColumnPathMap(DtlR.$setoff_tax_rnd_typ, BaseR.$setoff_tax_rnd_typ);
			addColumnPathMap(DtlR.$xrate_rnd_typ, BaseR.$xrate_rnd_typ);
			addColumnPathMap(DtlR.$com_paid_tax_rnd_typ, BaseR.$com_paid_tax_rnd_typ);
			addColumnPathMap(DtlR.$wtax_rnd_typ, BaseR.$wtax_rnd_typ);
			addColumnPathMap(DtlR.$stk_amt_rnd_typ, BaseR.$stk_amt_rnd_typ);
			addColumnPathMap(DtlR.$stk_amt_dec_place, BaseR.$stk_amt_dec_place);
			addColumnPathMap(DtlR.$po_print_cd, BaseR.$po_print_cd);
			addColumnPathMap(DtlR.$stk_lst_cnf_num, BaseR.$stk_lst_cnf_num);
			addColumnPathMap(DtlR.$stk_lst_limit_num, BaseR.$stk_lst_limit_num);
			addColumnPathMap(DtlR.$early_ship_dt_add_days, BaseR.$early_ship_dt_add_days);
			addColumnPathMap(DtlR.$gm_std_upri_typ, BaseR.$gm_std_upri_typ);
			addColumnPathMap(DtlR.$stk_std_upri_typ, BaseR.$stk_std_upri_typ);
			addColumnPathMap(DtlR.$ac_slip_digit, BaseR.$ac_slip_digit);
			addColumnPathMap(DtlR.$ac_slip_seq_flg, BaseR.$ac_slip_seq_flg);
			addColumnPathMap(DtlR.$sls_bdj_rnd_typ, BaseR.$sls_bdj_rnd_typ);
			addColumnPathMap(DtlR.$upd_cntr, BaseR.$upd_cntr);
			addColumnPathMap(DtlR.$rpt_strg_ext_sys_cd, BaseR.$rpt_strg_ext_sys_cd);
			addColumnPathMap(DtlR.$cst_prnt_typ, BaseR.$cst_prnt_typ);
			addColumnPathMap(DtlR.$acst_prnt_typ, BaseR.$acst_prnt_typ);
			addColumnPathMap(DtlR.$bcst_prnt_typ, BaseR.$bcst_prnt_typ);
			addColumnPathMap(DtlR.$rcst_prnt_typ, BaseR.$rcst_prnt_typ);
			addColumnPathMap(DtlR.$dlv_prnt_typ, BaseR.$dlv_prnt_typ);
			addColumnPathMap(DtlR.$sppl_prnt_typ, BaseR.$sppl_prnt_typ);
			addColumnPathMap(DtlR.$asppl_prnt_typ, BaseR.$asppl_prnt_typ);
			addColumnPathMap(DtlR.$bsppl_prnt_typ, BaseR.$bsppl_prnt_typ);
			addColumnPathMap(DtlR.$psppl_prnt_typ, BaseR.$psppl_prnt_typ);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			super.valueCopy(dest, src);
			
			if (!isStatusNone(getBaseR())) {
				dest.check(true);
				dest.setNumberNE(DTL_ROW_NO_COL_NM, MCNumber.ZERO);
			}
		}
	}

}