package mcframe.clientMAUC.MAUCP0050;

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
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_InptChkUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_InptChkUtil_MC extends MAUCP_InptChkUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static MAUCP_InptChkUtil _util = new MAUCP_InptChkUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_InptChkUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 入力値チェックを行います。
	 * 
	 * @param func_typ 機能区分
	 * @param tarL 入力チェックのリスト
	 */
	public static void doInptChkNoCache(String func_typ, MCList<Srch02_DtlR> tarL) {
		_util._doInptChkNoCache(func_typ, tarL);
	}

	/**
	 * 入力値チェックを行います。
	 * 
	 * @param func_typ 機能区分
	 * @param tarL 入力チェックのリスト
	 */
	protected void _doInptChkNoCache(String func_typ, MCList<Srch02_DtlR> tarL) {
		
		tarL.setString(Srch02_DtlR.$func_typ, func_typ);
		
		MCParam p = new MCParam(PDef.MA_MAUCL0050_Srch02_INFO);
		MCList<Srch02_DtlR> rsltL = MCList.create(Srch02_DtlR.class);
		p.addUpBlock(tarL);
		p.addDownBlock(rsltL);
		_createCaller(p).exec();
		
		// 結果をマージ
		for (Srch02_DtlR r :tarL) {
			for (Srch02_DtlR s :rsltL) {
				if (r.getParamRowIndex() == s.getParamRowIndex()) {
					r.up_rate_lmt(s.up_rate_lmt());
					r.up_lmt_rslt_flg(s.up_lmt_rslt_flg());
					r.low_rate_lmt(s.low_rate_lmt());
					r.low_lmt_rslt_flg(s.low_lmt_rslt_flg());
					break;
				}
			}
		}
	}

	/**
	 * 入力値チェック対象機能のリストを返します。
	 * 
	 * @param func_typ 機能区分
	 * @return 入力値チェック対象の機能リスト
	 */
	public static MCList<Srch01_RsltR> getInptChkFunc(String func_typ) {
		return _util._getInptChkFunc(func_typ);
	}

	/**
	 * 入力値チェック対象機能のリストを返します。
	 * 
	 * @param func_typ 機能区分
	 * @return 入力値チェック対象の機能リスト
	 */
	protected MCList<Srch01_RsltR> _getInptChkFunc(String func_typ) {
		
		MCParam p = new MCParam(PDef.MA_MAUCL0050_Srch01_INFO);
		Srch01_CndR up0 = Srch01_CndR.create();
		MCList<Srch01_RsltR> down0 = MCList.create(Srch01_RsltR.class);
		p.addUpBlock(up0);
		p.addDownBlock(down0);
		_createCaller(p).exec();
		
		return down0;
	}

	/**
	 * サーバ通信用のCallerを返します。
	 * 
	 * @param p MCParam
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p) {
		return new MAUDP_CallerNoPanel(p);
	}

}