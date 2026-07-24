package mcframe.clientMSUC.MSUCP0050;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUCP_ClUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_ClUtil_MC extends MSUCP_ClUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_ClUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 売上締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getSlsClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("sls_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0008);
		}
		return tmp;
	
	}
	
	/**
	 * 仕入締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getPurcClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("purc_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0006);
		}
		return tmp;
	}
	
	/**
	 * 入金締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getRcvClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("rcv_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0007);
		}
		return tmp;
	}
	
	/**
	 * 支払締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getPayClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("pay_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0005);
		}
		return tmp;
	}
	
	/**
	 * 在庫締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getStkClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("stk_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0009);
		}
		return tmp;
	}
	
	/**
	 * 売掛締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getArClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("ar_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0004);
		}
		return tmp;
	}
	
	/**
	 * 買掛締年月を取得する
	 * 
	 * @param panel
	 * @return
	 */
	public static MCDate getApClYm(MCRootPanel panel) {
		MCDate tmp = MSUCP_ClListLogic.getClose(panel).getDate("ap_cl_ym");
		if(isNull(tmp)){
			throw new MCAppException(MSUCP0003);
		}
		return tmp;
	}

}