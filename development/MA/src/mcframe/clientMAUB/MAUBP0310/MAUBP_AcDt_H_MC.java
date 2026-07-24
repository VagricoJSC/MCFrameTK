package mcframe.clientMAUB.MAUBP0310;

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
 * 画面"MAUBP_AcDt_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_AcDt_H_MC extends MAUBP_AcDt_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_AcDt_H_MC() {
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
	protected MAUBP_AcDt_H_MC(mcframe.clientMAUB.MAUBP0310.AcDtR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_AcDt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_AcDt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _actDt;

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param actDt 実績日
	 */
	public void setRelateBeans(MCRowBeans actDt) {
		_actDt = actDt;
	}
	protected MCRowBeans getActDt() {
		return _actDt;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getActDt() != null) {
			((MCLCBeans) getActDt()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getActDt()) {
			doBeans_act_dt_LC(info);
		}
	}

	/**
	 * 実績日が変更されたときに実行される。<br>
	 * <br>
	 * 実績日を計上日にコピーする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_act_dt_LC(MCEventInfo info) {
		setValueEx(AcDt_ac_dt, getActDt().getRowValue());
	}

}