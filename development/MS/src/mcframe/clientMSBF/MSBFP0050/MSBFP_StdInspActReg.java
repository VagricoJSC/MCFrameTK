// FMSE PANEL_EI
package mcframe.clientMSBF.MSBFP0050;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0380.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5350.*;

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


/**
 * 画面"MSBFP_StdInspActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBFP_StdInspActReg extends MSBFP_StdInspActReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_StdInspActReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_StdInspActReg(String name) {
		super(name);
	}

	public class MS_MSBFL0050_Srch01Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Srch01Bridge {
	}
	public class MS_MSBFL0050_Upd01Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd01Bridge {
	}
	public class MS_MSBFL0050_Upd02Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd02Bridge {
	}
	public class MS_MSBFL0050_Del01Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del01Bridge {
	}
	public class MS_MSBFL0050_Del02Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del02Bridge {
	}
	public class MS_MSBFL0050_Prnt01Bridge extends MSBFP_StdInspActReg_MC.MS_MSBFL0050_Prnt01Bridge {
	}

}