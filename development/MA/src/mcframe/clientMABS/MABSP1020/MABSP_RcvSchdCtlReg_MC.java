package mcframe.clientMABS.MABSP1020;

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
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_RcvSchdCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_RcvSchdCtlReg_MC extends MABSP_RcvSchdCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_RcvSchdCtlReg_MC() {
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
	public MABSP_RcvSchdCtlReg_MC(String name) {
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
	 * [MA_MABSL1020_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1020_Srch01Caller<P extends MABSP_RcvSchdCtlReg, B extends MA_MABSL1020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1020_Srch01Caller(P p, B b) {
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
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL1020_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1020_Upd01Caller<P extends MABSP_RcvSchdCtlReg, B extends MA_MABSL1020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1020_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL1020_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1020_Del01Caller<P extends MABSP_RcvSchdCtlReg, B extends MA_MABSL1020_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL1020_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL1020_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL1020_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL1020_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL1020_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABSL1020_Del01();
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
	protected void setStatusByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			setStatus(UPD);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setStatus(DEL);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setStatus(REF);
		}
		setModeByRegTgt();
	}

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
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_min_amt_p_PPanel.setRelateBeans(columnDtl_cur_cd, columnDtl_amt_dec_place);
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createRcvTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 支払予定制御明細用のセルコンフィグ
	 */
	protected RcvTableCellConfig createRcvTableCellConfig() {

		return new RcvTableCellConfig(this);
	}

	/**
	 * 支払予定制御明細用のセルコンフィグクラス
	 */
	protected class RcvTableCellConfig extends MAUDP_RLBaseCellConfig {

		public RcvTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = DtlTable.getRow(index);
				if (column == columnDtl_rcv_day1) {
					if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_day2) {
					if (!isNull(r.rcv_day2())) {
						return MCMode.ENABLE;
					}
					else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isNull(r.rcv_day1())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day2())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
						
				}
				else if (column == columnDtl_rcv_day3) {
					if (!isNull(r.rcv_day3())) {
						return MCMode.ENABLE;
					}
					else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isNull(r.rcv_day2())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day3())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_day4) {
					if (!isNull(r.rcv_day4())) {
						return MCMode.ENABLE;
					}
					else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isNull(r.rcv_day3())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day4())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_day5) {
					if (!isNull(r.rcv_day5())) {
						return MCMode.ENABLE;
					}
					else if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isNull(r.rcv_day4())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day5())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_crryovr_mons2) {
					if (!isNull(r.rcv_crryovr_mons2())) {
						return MCMode.ENABLE;
					}
					else if (isNull(r.rcv_crryovr_mons1())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day2())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_crryovr_mons3) {
					if (!isNull(r.rcv_crryovr_mons3())) {
						return MCMode.ENABLE;
					}
					else if (isNull(r.rcv_crryovr_mons2())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day3())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_crryovr_mons4) {
					if (!isNull(r.rcv_crryovr_mons4())) {
						return MCMode.ENABLE;
					}
					else if (isNull(r.rcv_crryovr_mons3())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day4())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_crryovr_mons5) {
					if (!isNull(r.rcv_crryovr_mons5())) {
						return MCMode.ENABLE;
					}
					else if (isNull(r.rcv_crryovr_mons4())) {
						return MCMode.READ_ONLY;
					}
					else if (!isNull(r.bill_cl_day5())){
						return MCMode.REQUIRED;
					}
					else if (!isNull(r.bcst_cd())){
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	public void doDtl_crryovr_mons_typ_LC(MCEventInfo info) {
		super.doDtl_crryovr_mons_typ_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		r.rcv_day1(null);
		r.rcv_day2(null);
		r.rcv_day3(null);
		r.rcv_day4(null);
		r.rcv_day5(null);
	}
	
	@Override
	public void doDtl_rcv_day1_LC(MCEventInfo info) {
		super.doDtl_rcv_day1_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_day1())) {
			r.rcv_day2(null);
			r.rcv_day3(null);
			r.rcv_day4(null);
			r.rcv_day5(null);
		}
	}
	@Override
	public void doDtl_rcv_day2_LC(MCEventInfo info) {
		super.doDtl_rcv_day2_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_day2())) {
			r.rcv_day3(null);
			r.rcv_day4(null);
			r.rcv_day5(null);
		}
	}
	@Override
	public void doDtl_rcv_day3_LC(MCEventInfo info) {
		super.doDtl_rcv_day3_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_day3())) {
			r.rcv_day4(null);
			r.rcv_day5(null);
		}
	}
	@Override
	public void doDtl_rcv_day4_LC(MCEventInfo info) {
		super.doDtl_rcv_day4_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_day4())) {
			r.rcv_day5(null);
		}
	}
	
	@Override
	public boolean doDtl_rcv_day1_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doDtl_rcv_day1_VC(info);
	}

	@Override
	public boolean doDtl_rcv_day2_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doDtl_rcv_day2_VC(info);
	}

	@Override
	public boolean doDtl_rcv_day3_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doDtl_rcv_day3_VC(info);
	}

	@Override
	public boolean doDtl_rcv_day4_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doDtl_rcv_day4_VC(info);
	}

	@Override
	public boolean doDtl_rcv_day5_VC(MCEventInfo info) {
		if (!checkDay((MCNumber) info.getNewValue())) {
			return false;
		}
		return super.doDtl_rcv_day5_VC(info);
	}

	protected boolean checkDay(MCNumber val) {
		MCNumber min = MCNumber.ONE;
		MCNumber max = new MCNumber(31);
		MCNumber last = new MCNumber(99);
		return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
	}
	
	@Override
	public void doDtl_rcv_crryovr_mons1_LC(MCEventInfo info) {
		super.doDtl_rcv_crryovr_mons1_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_crryovr_mons1())) {
			r.rcv_crryovr_mons2(null);
			r.rcv_crryovr_mons3(null);
			r.rcv_crryovr_mons4(null);
			r.rcv_crryovr_mons5(null);
		}
	}
	@Override
	public void doDtl_rcv_crryovr_mons2_LC(MCEventInfo info) {
		super.doDtl_rcv_crryovr_mons2_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_crryovr_mons2())) {
			r.rcv_crryovr_mons3(null);
			r.rcv_crryovr_mons4(null);
			r.rcv_crryovr_mons5(null);
		}
	}
	@Override
	public void doDtl_rcv_crryovr_mons3_LC(MCEventInfo info) {
		super.doDtl_rcv_crryovr_mons3_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_crryovr_mons3())) {
			r.rcv_crryovr_mons4(null);
			r.rcv_crryovr_mons5(null);
		}
	}
	@Override
	public void doDtl_rcv_crryovr_mons4_LC(MCEventInfo info) {
		super.doDtl_rcv_crryovr_mons4_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.rcv_crryovr_mons4())) {
			r.rcv_crryovr_mons5(null);
		}
	}

}