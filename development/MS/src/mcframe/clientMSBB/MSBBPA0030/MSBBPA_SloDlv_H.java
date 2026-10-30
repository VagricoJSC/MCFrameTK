// FMSE PANEL_EI
package mcframe.clientMSBB.MSBBPA0030;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.commonCore.annotation.EI;
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

//FMCB IMPORT START

//FMCB IMPORT END

/**
 * 画面"MSBBPA_SloDlv_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBPA_SloDlv_H extends MSBBPA_SloDlv_H_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBPA_SloDlv_H() {
		super();
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSBBPA_SloDlv_H(mcframe.clientMSBB.MSBBPA0030.SloDlvR row){
		super(row);
	}


//FMCB CUSTOM START
	/**
	 * Panel[SloDlv]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doSloDlv_show_dtl(MCEventInfo info) {
	}

	/**
	 * Panel[Dlv]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doDlv_show_dtl(MCEventInfo info) {
	}
//FMCB CUSTOM END
}