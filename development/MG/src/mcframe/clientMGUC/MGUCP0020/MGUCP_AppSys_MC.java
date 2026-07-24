package mcframe.clientMGUC.MGUCP0020;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.param.MCParam;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGUCP_AppSys"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGUCP_AppSys_MC extends MGUCP_AppSys_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** staticメソッドでのアクセス用フィールド */
	protected static MGUCP_AppSys _appSys = new MGUCP_AppSys();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGUCP_AppSys_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * サーバ通信用のCallerを返します。
	 *
	 * @param p MCParam
	 * @param panel パネル
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p,
			MCRootPanel panel) {
		return new MAUDP_CallerNoPanel(p);
	}

	// -----------------------------------------------
	// 原価費目マスタ（ここから）
	/**
	 * 原価費目情報を取得します。
	 *
	 * @return 原価費目情
	 */
	public static MCList<ExpnsR> getExpnsNoCache() {
		return _appSys._getExpnsNoCache();

	}

	/**
	 * 原価費目情報を取得します。
	 *
	 * @return 原価費目情報
	 */
	protected MCList<ExpnsR> _getExpnsNoCache() {
		MCList<ExpnsR> expnsL = MCList.create(ExpnsR.class);

		MCParam p = new MCParam(PDef.MG_MGUCL0020_Srch01_INFO);
		p.addDownBlock(expnsL);
		_createCaller(p, null).exec();

		return expnsL;
	}
	// 原価費目マスタ（ここまで）
	// -----------------------------------------------

}