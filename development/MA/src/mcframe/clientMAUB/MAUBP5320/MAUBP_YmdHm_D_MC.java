package mcframe.clientMAUB.MAUBP5320;

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
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_YmdHm_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_YmdHm_D_MC extends MAUBP_YmdHm_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_YmdHm_D_MC() {
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
	public MAUBP_YmdHm_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected boolean _afCompInvalid = false;
	
	/**
	 * 通信後に補完するかどうかを指定する。
	 * 補完しない場合はtrueを渡す。
	 * デフォルトは補完する（false）。
	 * 
	 * @param b 通信後に補完するかどうか
	 */
	public void setAfCompInvalid(boolean b) {
		_afCompInvalid = b;
	}

	@Override
	public void beforeCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.beforeCallParts(matcher, caller);
		
		for (YmdHmR r : getYmdHmL().subList((MCRowMatcher<YmdHmR>)matcher)) {
			if (!isNull(r.ymd())) {
				setYmdHm(r, columnYmdHm_ymd.getRowColumnName(), columnYmdHm_hm.getRowColumnName());
			}
		}
	}

	@Override
	public void afterCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.afterCallParts(matcher, caller);

		if (_afCompInvalid) {
			return;
		}
		
		// ファイル入力の場合、下り電文で日時が一つのカラムになっているため、時刻項目または日付項目で他方を補完する
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter) {
			int blockIdx = caller.getDownParamBlockIndex(YmdHmTable);
			MCList downL = caller.getDownParamList(blockIdx);
			String ymd_col = columnYmdHm_ymd.getBaseRowColumnName();
			String hm_col = columnYmdHm_hm.getBaseRowColumnName();
			MCList subDownL = downL.subList(matcher);
			for (Object o :subDownL) {
				MCRow downR = (MCRow)o;
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
	}

	public void doYmdHm_ymd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index >= 0) {
			if (isNull(YmdHmTable.getRow(index).ymd())) {
				setValueEx(columnYmdHm_hm, index, null);
			}
		}
	}

	public void doYmdHm_hm_LC(MCEventInfo info){
		int index = info.getEventIndex();
		if (index >= 0) {
			YmdHmR dt = YmdHmTable.getRow(index);
			if (!isNull(dt.hm())) {
				setYmdHm(dt, columnYmdHm_ymd.getRowColumnName(), columnYmdHm_hm.getRowColumnName());
				setValueEx(columnYmdHm_hm, index, dt.ymd());
			}
			else {
				setYmdHm(dt, columnYmdHm_ymd.getRowColumnName(), columnYmdHm_hm.getRowColumnName());
			}
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isDefaultModeEditable(column)) {
			if (column == columnYmdHm_hm) {
				MCDate ymd = YmdHmTable.getRow(index).ymd();
				if (isNull(ymd)) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getCellMode(index, column);
	}

}