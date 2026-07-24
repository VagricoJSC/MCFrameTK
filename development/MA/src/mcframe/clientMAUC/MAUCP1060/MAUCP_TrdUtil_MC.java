package mcframe.clientMAUC.MAUCP1060;

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
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_TrdUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_TrdUtil_MC extends MAUCP_TrdUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static MAUCP_TrdUtil _trdUtil = new MAUCP_TrdUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_TrdUtil_MC() {
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
	
	// ///////////////////////////////////////////////
	// 取引関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 指定された取引パタン区分で自動時採用ＦＬＧがオンのものをデフォルト取引ＣＤとして取得します。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @return デフォルト取引ＣＤ
	 */
	public static String getDefaultTrdCdNoCache(String trd_ptn_typ) {
		return _trdUtil._getDefaultTrdCdNoCache(trd_ptn_typ);
	}

	/**
	 * 指定された取引パタン区分で自動時採用ＦＬＧがオンのものをデフォルト取引ＣＤとして取得します。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @return デフォルト取引ＣＤ
	 */
	protected String _getDefaultTrdCdNoCache(String trd_ptn_typ) {
		
		DeftrdR deftrdR = DeftrdR.create();
		deftrdR.trd_ptn_typ(trd_ptn_typ);
		
		MCParam p = new MCParam(PDef.MA_MAUCL1060_Srch01_INFO);
		p.addUpBlock(deftrdR);
		p.addDownBlock(deftrdR);
		_createCaller(p, null).exec();
		return deftrdR.trd_cd();
	}

	/**
	 * 指定された取引ＣＤに応じた取引情報を取得します。
	 *
	 * @param trd_cd 取引ＣＤ
	 * @return 取引情報
	 */
	public static TrdR getTrdNoCache(String trd_cd) {
		return _trdUtil._getTrdNoCache(trd_cd);
	}

	/**
	 * 指定された取引ＣＤに応じた取引情報を取得します。
	 *
	 * @param trd_cd 取引ＣＤ
	 * @return 取引情報
	 */
	protected TrdR _getTrdNoCache(String trd_cd) {
		
		TrdR trdR = TrdR.create();
		trdR.trd_cd(trd_cd);
		
		MCParam p = new MCParam(PDef.MA_MAUCL1060_Srch02_INFO);
		p.addUpBlock(trdR);
		p.addDownBlock(trdR);
		_createCaller(p, null).exec();
		return trdR;
	}
	// ///////////////////////////////////////////////
	// 取引関連（ここまで）
	// ///////////////////////////////////////////////

}