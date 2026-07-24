package mcframe.serverMSUC.MSUCL0050;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverCore.requester.MCRequestObject.object;
import static mcframe.serverMSUC.MSUCL0050.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_ClUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_ClUtil_MC extends MSUCL_ClUtil_MC_A{
	//FMCB CUSTOM START
	
	protected static final Class<MSUCL_ClUtil> CLAZZ = MSUCL_ClUtil.class;
	
	protected MCRow _closeR;
	
	/**
	 * 売上締年月を取得する。
	 * 
	 * @return 売上締年月
	 */
	public static MCDate getSlsClYm() {
		return object(CLAZZ)._getSlsClYm();
	}
	
	protected MCDate _getSlsClYm() {
		MCDate tmp = _getClose().getDate("sls_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0007);
		}
		return _getClose().getDate("sls_cl_ym");
	}
	
	/**
	 * 仕入締年月を取得する。
	 * 
	 * @return 仕入締年月
	 */
	public static MCDate getPurcClYm() {
		return object(CLAZZ)._getPurcClYm();
	}
	
	protected MCDate _getPurcClYm() {
		MCDate tmp = _getClose().getDate("purc_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0005);
		}
		return _getClose().getDate("purc_cl_ym");
	}
	
	/**
	 * 入金締年月を取得する。
	 * 
	 * @return 入金締年月
	 */
	public static MCDate getRcvClYm() {
		return object(CLAZZ)._getRcvClYm();
	}
	
	protected MCDate _getRcvClYm() {
		MCDate tmp = _getClose().getDate("rcv_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0006);
		}
		return _getClose().getDate("rcv_cl_ym");
	}

	/**
	 * 支払締年月を取得する。
	 * 
	 * @return 支払締年月
	 */
	public static MCDate getPayClYm() {
		return object(CLAZZ)._getPayClYm();
	}
	
	protected MCDate _getPayClYm() {
		MCDate tmp = _getClose().getDate("pay_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0004);
		}
		return _getClose().getDate("pay_cl_ym");
	}
	
	/**
	 * 在庫締年月を取得する。
	 * 
	 * @return 在庫締年月
	 */
	public static MCDate getStkClYm() {
		return object(CLAZZ)._getStkClYm();
	}
	
	protected MCDate _getStkClYm() {
		MCDate tmp = _getClose().getDate("stk_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0008);
		}
		return _getClose().getDate("stk_cl_ym");
	}
	
	/**
	 * 売掛締年月を取得する。
	 * 
	 * @return 売掛締年月
	 */
	public static MCDate getArClYm() {
		return object(CLAZZ)._getArClYm();
	}
	
	protected MCDate _getArClYm() {
		MCDate tmp = _getClose().getDate("ar_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0003);
		}		
		return _getClose().getDate("ar_cl_ym");
	}
	
	/**
	 * 買掛締年月を取得する。
	 * 
	 * @return 買掛締年月
	 */
	public static MCDate getApClYm() {
		return object(CLAZZ)._getApClYm();
	}
	
	protected MCDate _getApClYm() {
		MCDate tmp = _getClose().getDate("ap_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCL0002);
		}	
		return _getClose().getDate("ap_cl_ym");
	}

	/**
	 * 締処理情報を取得する。
	 * 
	 * @return
	 */
	public static MCRow getClose() {
		return object(CLAZZ)._getClose();
	}
	
	protected MCRow _getClose() {
		if (_closeR == null) {
			_closeR = MST_CLOSE_R.create();
			
			// 各締年月の設定
			executeQuery(_closeR, MSUCL0050_MST_CLOSE_S01());
			
			MCDate slsClYm = _closeR.getDate("sls_cl_ym");
			MCDate rcvClYm = _closeR.getDate("rcv_cl_ym");
			MCDate purcClYm = _closeR.getDate("purc_cl_ym");
			MCDate payClYm = _closeR.getDate("pay_cl_ym");
			
			// 売掛締年月の設定
			if (isNullOr(slsClYm, rcvClYm)) {
				_closeR.addDateColumn("ar_cl_ym");
			}
			else if (slsClYm.gtDate(rcvClYm)) {
				_closeR.addDateColumn("ar_cl_ym", rcvClYm);
			}
			else {
				_closeR.addDateColumn("ar_cl_ym", slsClYm);
			}
			
			// 買掛締年月の設定
			if (isNullOr(purcClYm, payClYm)) {
				_closeR.addDateColumn("ap_cl_ym");
			}
			else if (purcClYm.gtDate(payClYm)) {
				_closeR.addDateColumn("ap_cl_ym", payClYm);
			}
			else {
				_closeR.addDateColumn("ap_cl_ym", purcClYm);
			}
		}
		
		return _closeR;
	}
	//FMCB CUSTOM END
}