package mcframe.clientMAUC.MAUCP1040;

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
import mcframe.clientCore.resource.MCConst;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_YearUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_YearUtil_MC extends MAUCP_YearUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String $MIN_YEAR = "min_year";

	protected static final String $MAX_YEAR = "max_year";

	protected static final MAUCP_YearUtil _util = new MAUCP_YearUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_YearUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 年月の入力可能最小値、最大値のチェックを行います。
	 * 各画面でリソースを設定していない場合はCMP9100のリソースが採用されます。
	 */
	public static MCMessageList checkMinMax(MCNumber year, FXBAP_PanelBase p,
			MCRow causeRow, String causeColumn) {
		return _util._checkMinMax(year, p, causeRow, causeColumn);
	}

	/**
	 * 年月の入力可能最小値、最大値のチェックを行います。
	 * 各画面でリソースを設定していない場合はCMP9100のリソースが採用されます。
	 */
	public static MCMessageList checkMinMax(MCDate year, FXBAP_PanelBase p, MCRow causeRow,
			String causeColumn) {
		return _util._checkMinMax(year, p, causeRow, causeColumn);
	}

	public static MCNumber getEnableMinYear(FXBAP_PanelBase p) {
		return _util._getEnableMinYear(p);
	}

	public static MCNumber getEnableMaxYear(FXBAP_PanelBase p) {
		return _util._getEnableMaxYear(p);
	}

	/**
	 * 年の入力可能最小値、最大値のチェックを行います。
	 * 各画面でリソースを設定していない場合はCMP9100のリソースが採用されます。
	 */
	protected MCMessageList _checkMinMax(MCNumber year, FXBAP_PanelBase p, MCRow causeRow,
			String causeColumn) {
		MCNumber min = getEnableMinYear(p);
		MCNumber max = getEnableMaxYear(p);
		MCMessageList m = new MCMessageList();
		MCMessage msg = null;

		boolean minErr = !isNull(year) && min.gt(year);
		boolean maxErr = !isNull(year) && max.lt(year);

		if (minErr || maxErr) {
			msg = new MCMessage(causeRow, causeColumn, MAUCP0307, min, max);
		}

		if (msg != null) {
			m.add(msg);
		}
		return m;

	}

	/**
	 * 年の入力可能最小値、最大値のチェックを行います。
	 * 各画面でリソースを設定していない場合はCMP9100のリソースが採用されます。
	 */
	protected MCMessageList _checkMinMax(MCDate year, FXBAP_PanelBase p, MCRow causeRow,
			String causeColumn) {
		MCNumber y = null;
		if (!isNull(year)) {
			y = new MCNumber(year.getYear());
		}

		return _checkMinMax(y, p, causeRow, causeColumn);

	}

	protected MCNumber MIN_YEAR;

	protected MCNumber MAX_YEAR;

	/**指定可能年ＦＲＯＭを取得します。*/
	protected MCNumber _getEnableMinYear(FXBAP_PanelBase p) {
		if (isNull(MIN_YEAR)) {
			MCRootPanel rp = p.getBaseRootPanel();
			
			String key = MCConst.createKey(rp.getModuleID(), rp.getScreenID(), $MIN_YEAR);
			if(MCConst.app.containsKey(key)){
				MIN_YEAR =MCConst.app.getNumber(key);
			}
			else{
				key = MCConst.createKey(getModuleID(), getScreenID(), $MIN_YEAR);
				MIN_YEAR = MCConst.app.getNumber(key);
			}
		}
		return MIN_YEAR;
	}

	/**指定可能年ＴＯを取得します。*/
	protected MCNumber _getEnableMaxYear(FXBAP_PanelBase p) {
		if (isNull(MAX_YEAR)) {
			MCRootPanel rp = p.getBaseRootPanel();
			String key = MCConst.createKey(rp.getModuleID(), rp.getScreenID(), $MAX_YEAR);
			if(MCConst.app.containsKey(key)){
				MAX_YEAR =MCConst.app.getNumber(key);
			}
			else{
				key = MCConst.createKey(getModuleID(), getScreenID(), $MAX_YEAR);
				MAX_YEAR = MCConst.app.getNumber(key);
			}
		}
		return MAX_YEAR;
	}

}