package mcframe.clientMAUB.MAUBP0400;

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
 * 画面"MAUBP_YmdHm_Fr_To_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_YmdHm_Fr_To_H_MC extends MAUBP_YmdHm_Fr_To_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_YmdHm_Fr_To_H_MC() {
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
	protected MAUBP_YmdHm_Fr_To_H_MC(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_YmdHmFrTo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_YmdHmFrTo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public void beforeCallParts(MCCaller caller) {
		super.beforeCallParts(caller);

		if (!isNull(getYmdHmFrToR().ymd_fr())) {
			getYmdHmFrToR().ymd_fr(setYmdHm(getYmdHmFrToR().ymd_fr(), getYmdHmFrToR().hm_fr()));
		}

		if (!isNull(getYmdHmFrToR().ymd_to())) {
			getYmdHmFrToR().ymd_to(setYmdHm(getYmdHmFrToR().ymd_to(), getYmdHmFrToR().hm_to()));
		}
	}

	@Override
	protected void partsInit() {
		super.partsInit();
		//メッセージ用名称をセット
		YmdHmFrTo_ymdhm_fr.setMessageName(YmdHmFrTo_ymd_fr.getMessageByLocale());
		YmdHmFrTo_ymdhm_to.setMessageName(YmdHmFrTo_ymd_to.getMessageByLocale());
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void checkForCallStack(MCMessageList list, MCCaller caller) {
		super.checkForCallStack(list, caller);

		checkForCallStackCustom(list, caller);
	}

	@SuppressWarnings("rawtypes")
	public void checkForCallStackCustom(MCMessageList list, MCCaller caller) {
		MCMessageList tmpList = checkBeforeAfter(YmdHmFrTo_ymdhm_fr, YmdHmFrTo_ymdhm_to);
		// 原因のカラムを年月日ＦＲＯＭにする
		for (MCMessage m :tmpList) {
			m.setCauseRow(YmdHmFrTo_ymd_fr.getBaseRow(), YmdHmFrTo_ymd_fr.getBaseRowColumnName());
		}
		list.addAll(tmpList);
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

		setStEndHmMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setStEndHmMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();

		setStEndHmMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();

		setStEndHmMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setStEndHmMode();
	}

	@Override
	public void doYmdHmFrTo_ymd_fr_LC(MCEventInfo info) {
		super.doYmdHmFrTo_ymd_fr_LC(info);

		if (isNull(getYmdHmFrToR().ymd_fr())) {
			setValueEx(YmdHmFrTo_hm_fr, null);
		}
		setStEndHmMode();
		backupYmdhmFr();
	}

	@Override
	public void doYmdHmFrTo_hm_fr_LC(MCEventInfo info) {
		super.doYmdHmFrTo_hm_fr_LC(info);

		if (!isNull(getYmdHmFrToR().hm_fr())) {
			getYmdHmFrToR().hm_fr(setYmdHm(getYmdHmFrToR().ymd_fr(),
				getYmdHmFrToR().hm_fr()));
		}
		setStEndHmMode();
		backupYmdhmFr();
	}

	@Override
	public void doYmdHmFrTo_ymd_to_LC(MCEventInfo info) {
		super.doYmdHmFrTo_ymd_to_LC(info);

		if (isNull(getYmdHmFrToR().ymd_to())) {
			setValueEx(YmdHmFrTo_hm_to, null);
		}
		setStEndHmMode();
		backupYmdhmTo();
	}

	@Override
	public void doYmdHmFrTo_hm_to_LC(MCEventInfo info) {
		super.doYmdHmFrTo_hm_to_LC(info);

		if (!isNull(getYmdHmFrToR().hm_to())) {
			getYmdHmFrToR().hm_to(setYmdHm(getYmdHmFrToR().ymd_to(),
				getYmdHmFrToR().hm_to()));
		}
		setStEndHmMode();
		backupYmdhmTo();
	}

	/**
	 * 時刻ＦＲＯＭ、時刻ＴＯの日付を設定する。
	 *
	 * @param ymd 日付ＦＲＯＭ、又は、日付ＴＯ
	 * @param hm 時刻ＦＲＯＭ、又は、時刻ＴＯ
	 */
	protected MCDate setYmdHm(MCDate ymd, MCDate hm) {
		MCDate dt = ymd.startTimeOfDay();
		if (isNull(hm)) {
			return dt;
		}
		return dt.addHour(hm.getHour()).addMinute(hm.getMinute());
	}

	/**
	 * 時刻ＦＲＯＭ、時刻ＴＯのモードを設定する。
	 */
	protected void setStEndHmMode() {
		YmdHmFrToR dt = getYmdHmFrToR();

		//時刻ＦＲＯＭのモード設定
		if (isDefaultModeEditable(YmdHmFrTo_hm_fr)) {
			if (isNull(dt.ymd_fr())) {
				YmdHmFrTo_hm_fr.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(YmdHmFrTo_hm_fr);
			}
		}

		//時刻ＴＯのモード設定
		if (isDefaultModeEditable(YmdHmFrTo_hm_to)) {
			if (isNull(dt.ymd_to())) {
				YmdHmFrTo_hm_to.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(YmdHmFrTo_hm_to);
			}
		}
	}

	protected void backupYmdhmFr() {
		if (isNull(getYmdHmFrToR().ymd_fr())) {
			setValueEx(YmdHmFrTo_ymdhm_fr, null);
		}
		else {
			getYmdHmFrToR().ymdhm_fr(
				setYmdHm(getYmdHmFrToR().ymd_fr(), getYmdHmFrToR().hm_fr()));
		}
	}

	protected void backupYmdhmTo() {
		if (isNull(getYmdHmFrToR().ymd_to())) {
			setValueEx(YmdHmFrTo_ymdhm_to, null);
		}
		else {
			getYmdHmFrToR().ymdhm_to(
				setYmdHm(getYmdHmFrToR().ymd_to(), getYmdHmFrToR().hm_to()));
		}
	}

}