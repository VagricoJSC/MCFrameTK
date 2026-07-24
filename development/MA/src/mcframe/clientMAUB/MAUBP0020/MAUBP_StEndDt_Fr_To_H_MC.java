package mcframe.clientMAUB.MAUBP0020;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_StEndDt_Fr_To_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_StEndDt_Fr_To_H_MC extends MAUBP_StEndDt_Fr_To_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StEndDt_Fr_To_H_MC() {
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
	protected MAUBP_StEndDt_Fr_To_H_MC(mcframe.clientMAUB.MAUBP0020.StEndDtR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_StEndDt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_StEndDt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		StEndDt_srch_typ_Group.setValue(StEndDt_srch_typ_POINT.getActionCommand());
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		setModeWithSrchTyp();
	}

	@Override
	public void doStEndDt_srch_typ_NC(MCEventInfo info) {
		super.doStEndDt_srch_typ_NC(info);
		setModeWithSrchTyp();
		boolean isRange = StEndDt_srch_typ_RANGE.isSelected();
		setCheckBeforeAfter(isRange);
		if (isRange) {
			setValueEx(StEndDt_dt, null);
		}
		else {
			setValueEx(StEndDt_st_dt_fr, null);
			setValueEx(StEndDt_st_dt_to, StEndDt_dt.getValue());
			setValueEx(StEndDt_end_dt_fr, StEndDt_dt.getValue());
			setValueEx(StEndDt_end_dt_to, null);
		}
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		setModeWithSrchTyp();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		setModeWithSrchTyp();
	}

	protected void setModeWithSrchTyp() {
		if (StEndDt_srch_typ_POINT.isSelected()) {
			if (MCMode.ENABLE_STATUS ==
				StEndDt_st_dt_fr.getModeInfo().getStatus()){
				StEndDt_st_dt_fr.setMode(MCMode.READ_ONLY);
			}
			if (MCMode.ENABLE_STATUS ==
				StEndDt_st_dt_to.getModeInfo().getStatus()){
				StEndDt_st_dt_to.setMode(MCMode.READ_ONLY);
			}
			if (MCMode.ENABLE_STATUS ==
				StEndDt_end_dt_fr.getModeInfo().getStatus()){
				StEndDt_end_dt_fr.setMode(MCMode.READ_ONLY);
			}
			if (MCMode.ENABLE_STATUS ==
				StEndDt_end_dt_to.getModeInfo().getStatus()){
				StEndDt_end_dt_to.setMode(MCMode.READ_ONLY);
			}
			setDefaultMode(StEndDt_dt);
		}
		else {
			setDefaultMode(StEndDt_st_dt_fr);
			setDefaultMode(StEndDt_st_dt_to);
			setDefaultMode(StEndDt_end_dt_fr);
			setDefaultMode(StEndDt_end_dt_to);
			if (MCMode.ENABLE_STATUS ==
				StEndDt_dt.getModeInfo().getStatus()){
				StEndDt_dt.setMode(MCMode.READ_ONLY);
			}
		}
	}

	@Override
	public void doStEndDt_dt_NC(MCEventInfo info) {
		super.doStEndDt_dt_NC(info);
		setValueEx(StEndDt_st_dt_fr, null);
		setValueEx(StEndDt_st_dt_to, StEndDt_dt.getValue());
		setValueEx(StEndDt_end_dt_fr, StEndDt_dt.getValue());
		setValueEx(StEndDt_end_dt_to, null);
		
	}

	@Override
	public void doStEndDt_st_dt_to_NC(MCEventInfo info) {
		super.doStEndDt_st_dt_to_NC(info);

		MCDate d = (MCDate)info.getNewValue();
		if (!isNull(d)) {
			d = d.endTimeOfDay();
			getStEndDtR().st_dt_to(d);
		}
	}

	@Override
	public void doStEndDt_end_dt_to_NC(MCEventInfo info) {
		super.doStEndDt_end_dt_to_NC(info);

		MCDate d = (MCDate)info.getNewValue();
		if (!isNull(d)) {
			d = d.endTimeOfDay();
			getStEndDtR().end_dt_to(d);
		}
	}

	protected boolean _checkBeforeAfter = false;

	/**日付の前後チェックを行わない場合はfalseを設定してください。*/
	public void setCheckBeforeAfter(boolean b) {
		_checkBeforeAfter = b;
	}

	protected boolean isCheckBeforeAfter() {
		return _checkBeforeAfter;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void checkForCallStack(MCMessageList list, MCCaller caller) {
		super.checkForCallStack(list, caller);

		checkForCallStackCustom(list, caller);
	}

	@SuppressWarnings("rawtypes")
	public void checkForCallStackCustom(MCMessageList list, MCCaller caller) {
		if (isCheckBeforeAfter()) {
			list.addAll(checkBeforeAfter(StEndDt_st_dt_fr, StEndDt_st_dt_to));
			list.addAll(checkBeforeAfter(StEndDt_end_dt_fr, StEndDt_end_dt_to));
		}
	}

}