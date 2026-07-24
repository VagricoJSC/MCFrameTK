package mcframe.clientMAUB.MAUBP0330;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_CanAcDt_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_CanAcDt_H_MC extends MAUBP_CanAcDt_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_CanAcDt_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_CanAcDt_H_MC(mcframe.clientMAUB.MAUBP0330.CanAcDtR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_CanAcDt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_CanAcDt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		MAUDP_PanelBase p = (MAUDP_PanelBase) getBaseRootPanel();
		boolean cl_usr_flg = p.getUsrAcl().cl_usr_flg();

		if (!cl_usr_flg) {
			setComponentInvisibleAllStatus(CanAcDt_can_ac_dt_for_input);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getCanAcDtBase().getScreenOpeBeans(this) != null) {
			((MCNCBeans) getCanAcDtBase().getScreenOpeBeans(this)).addNCListener(this);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getCanAcDtBase().getScreenOpeBeans(this)) {
			doBeans_screen_ope_NC(info);
		}
	}

	protected void doBeans_screen_ope_NC(MCEventInfo info) {
		if (getCanAcDtBase().isCanAcDtValueInitOpe(this)) {
			MCRow r = CanAcDt_can_ac_dt_for_input.getBaseRow();
			canAcDtValueInit(r);
		}
	}

	@Override
	public void doCanAcDt_can_ac_dt_for_input_LC(MCEventInfo info) {
		super.doCanAcDt_can_ac_dt_for_input_LC(info);

		setValueEx(CanAcDt_can_ac_dt_for_call, info.getNewValue());
	}

	@Override
	public void afterCallParts(MCCaller caller) {
		super.afterCallParts(caller);
		int blockIdx = caller.getDownParamBlockIndex(CanAcDt_can_ac_dt_for_input);
		MCRow downR = caller.getDownParamRow(blockIdx);
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher
				|| caller instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLSearcher) {

			downR.setDateNE(CanAcDt_ac_dt_after_srch.getRowColumnName(),
					downR.getDateNE(
							((MCRowBeans) getCanAcDtBase().getAcDtBeans(this))
									.getRowColumnName()));
			canAcDtValueInit(downR);
		}
	}

	public void canAcDtValueInit(MCRow r) {
		String acDtAfterSrchCol = CanAcDt_ac_dt_after_srch.getBaseRowColumnName();
		String canAcDtForInputCol = CanAcDt_can_ac_dt_for_input.getBaseRowColumnName();
		if (!getCanAcDtBase().isCanAcDtValueInitOpe(this)) {
			return;
		}
		if (isNull(r.getDateNE(acDtAfterSrchCol))) {
			return;
		}
		if (!isNull(r.getDateNE(canAcDtForInputCol))) {
			return;
		}
		if (getCanAcDtBase().getAcDtBeans(this) == null) {
			return;
		}

		r.setDateNE(canAcDtForInputCol, r.getDateNE(acDtAfterSrchCol));
	}

	/**
	 * ベース画面を取得する。
	 * 
	 * @return ベース画面
	 */
	protected IfCanAcDtBase getCanAcDtBase() {
		return getLinkPartsPanelNE(IfCanAcDtBase.class);
	}
	// モード設定
	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		setGUIMode();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		setGUIMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		setGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		setGUIMode();
	}
	
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == CanAcDt_can_ac_dt_for_input && isDefaultModeEditable(compo)) {
			if (isNull(getCanAcDtR().ac_dt_after_srch())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}