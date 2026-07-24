package mcframe.clientMAUB.MAUBP5010;

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
import mcframe.clientFXBA.FXBAP0010.FXBAP_Caller;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_StDt_EndDt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_StDt_EndDt_D_MC extends MAUBP_StDt_EndDt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StDt_EndDt_D_MC() {
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
	public MAUBP_StDt_EndDt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 適用開始日、適用終了日のチェックメソッド<p>
	 */
	public MCMessageList checkBeforeAfter(MCRow r) {
		return checkBeforeAfter(columnDt_st_dt, columnDt_end_dt, r);
	}

	/** 適用終了日の時分秒を23:59:59に設定しなおします。 */
	@Override
	public void doDt_end_dt_NC(MCEventInfo info) {
		super.doDt_end_dt_NC(info);

		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}

//		if (cnvEndDayTime()) {
			MCDate d = (MCDate)info.getNewValue();
			if (!isNull(d)) {
				d = d.endTimeOfDay();
				getDtL().get(idx).end_dt(d);
			}
//		}
	}

//	protected boolean _cnvEndDayTime = true;

//	/** 適用終了日の時分秒を23:59:59に設定しなおさない場合falseを設定してください。 */
//	public void setEndTimeOfDay(boolean b) {
//		_cnvEndDayTime = b;
//	}

//	protected boolean cnvEndDayTime() {
//		return _cnvEndDayTime;
//	}

}