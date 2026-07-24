package mcframe.clientMAUC.MAUCP0160;

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
 * 画面"MAUCP_ItmUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_ItmUtil_MC extends MAUCP_ItmUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_ItmUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 品目マスタ(ロケール別情報)のロケール別情報を取得する。
	 * <p>
	 * ロケールＣＤ、品目ＣＤ、枝番１、枝番２、枝番３のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param lcl_cd ロケールＣＤ
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param panel 画面
	 * @return ロケール別情報、または null
	 */
	public static MCRow getItmLcl(String lcl_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCRootPanel panel) {
		return MAUCP_ItmListLogic.getItmLcl(lcl_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, panel);
	}

	/**
	 * 取引先品目情報を取得する。
	 * <p>
	 * 取引先ＣＤ、品目ＣＤ、枝番１、枝番２、枝番３、基準日のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param bp_cd 取引先ＣＤ
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param dt 基準日
	 * @param panel 画面
	 * @return ロケール別情報、または null
	 */
	public static MCRow getBpItm(String bp_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCDate dt, MCRootPanel panel) {
		return MAUCP_ItmListLogic.getBpItm(bp_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, dt, panel);
	}
	
	/**
	 * 源泉税率を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、基準日のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param dt 基準日
	 * @param panel 画面
	 * @return 源泉税率、または null
	 */
	public static MCNumber getWtaxRate(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, 
			MCDate dt, MCRootPanel panel) {
		return MAUCP_ItmListLogic.getWtaxRate(itm_cd, itm_sub1, itm_sub2, itm_sub3, dt, panel);
	}

}