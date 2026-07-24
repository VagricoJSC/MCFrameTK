package mcframe.clientMAUB.MAUBP0110;

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
 * 画面"MAUBP_YmdHm_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_YmdHm_H_MC extends MAUBP_YmdHm_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_YmdHm_H_MC() {
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
	protected MAUBP_YmdHm_H_MC(mcframe.clientMAUB.MAUBP0110.YmdHmR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_YmdHm START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_YmdHm END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public void beforeCallParts(MCCaller caller) {
		super.beforeCallParts(caller);

		if (!isNull(getYmdHmR().ymd())) {
			getYmdHmR().ymd(getYmdHm(getYmdHmR().ymd(), getYmdHmR().hm()));
		}
	}

	@Override
	public void afterCallParts(MCCaller caller) {
		super.afterCallParts(caller);

		// ファイル入力の場合、下り電文で日時が一つのカラムになっているため、時刻項目または日付項目で他方を補完する
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter) {
			int blockIdx = caller.getDownParamBlockIndex(YmdHm_ymd);
			MCRow downR = caller.getDownParamRow(blockIdx);
			String ymd_col = YmdHm_ymd.getBaseRowColumnName();
			String hm_col = YmdHm_hm.getBaseRowColumnName();
			if (isNull(downR.getDateNE(hm_col)) && !isNull(downR.getDateNE(ymd_col))) {
				downR.setDateNE(hm_col, downR.getDateNE(ymd_col));
				mcframe.clientFXBA.FXBAP0010.FXBAP_Caller fc = (mcframe.clientFXBA.FXBAP0010.FXBAP_Caller)caller;
				fc.addDownItemNames(blockIdx, hm_col);
			}
			else if (!isNull(downR.getDateNE(hm_col)) && isNull(downR.getDateNE(ymd_col))) {
				downR.setDateNE(ymd_col, downR.getDateNE(hm_col));
				mcframe.clientFXBA.FXBAP0010.FXBAP_Caller fc = (mcframe.clientFXBA.FXBAP0010.FXBAP_Caller)caller;
				fc.addDownItemNames(blockIdx, ymd_col);
			}
		}
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

		setHmMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setHmMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();

		setHmMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();

		setHmMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setHmMode();
	}

	public void doYmdHm_ymd_LC(MCEventInfo info) {
		super.doYmdHm_ymd_LC(info);

		if (isNull(getYmdHmR().ymd())) {
			setValueEx(YmdHm_hm, null);
		}
		setHmMode();
	}

	public void doYmdHm_hm_LC(MCEventInfo info) {
		super.doYmdHm_hm_LC(info);

		if (!isNull(getYmdHmR().hm())) {
			getYmdHmR().ymd(getYmdHm(getYmdHmR().ymd(), getYmdHmR().hm()));
			getYmdHmR().hm(getYmdHm(getYmdHmR().ymd(), getYmdHmR().hm()));
		}
		else {
			getYmdHmR().ymd(getYmdHm(getYmdHmR().ymd(), getYmdHmR().hm()));
		}
	}

	/**
	 * 時刻の日付を設定する。
	 *
	 * @param ymd 日付
	 * @param hm 時刻
	 */
	protected MCDate getYmdHm(MCDate ymd, MCDate hm) {
		if (isNull(ymd)) {
			return null;
		}
		MCDate dt = ymd.startTimeOfDay();
		if (isNull(hm)) {
			return dt;
		}
		return dt.addHour(hm.getHour()).addMinute(hm.getMinute());
	}

	/**
	 * 時刻のモードを設定する。
	 */
	protected void setHmMode() {
		//時刻のモード設定
		if (isDefaultModeEditable(YmdHm_hm)) {
			if (isNull(getYmdHmR().ymd())) {
				YmdHm_hm.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(YmdHm_hm);
			}
		}
	}

}