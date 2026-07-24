// FMSE PANEL_EI
package mcframe.clientMSBC.MSBCP1100;

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
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5340.*;
import mcframe.clientMSBC.MSBCP1120.*;
import mcframe.clientMSUB.MSUBP0040.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
 * 画面"MSBCP_MfgActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBCP_MfgActReg extends MSBCP_MfgActReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgActReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MfgActReg(String name) {
		super(name);
	}

	public class MS_MSBCL1100_Srch01Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Srch01Bridge {
	}
	public class MS_MSBCL1100_Upd01Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Upd01Bridge {
	}
	public class MS_MSBCL1100_Del01Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Del01Bridge {
	}
	public class MS_MSBCL1100_Upd02Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Upd02Bridge {
	}
	public class MS_MSBCL1100_Del02Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Del02Bridge {
	}
	public class MS_MSBCL1100_Prnt01Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Prnt01Bridge {
	}
	public class MS_MSBCL1100_Sprt01Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt01Bridge {
	}
	public class MS_MSBCL1100_Sprt02Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt02Bridge {
	}
	public class MS_MSBCL1100_Sprt03Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt03Bridge {
	}
	public class MS_MSBCL1100_Sprt04Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt04Bridge {
	}
	public class MS_MSBCL1100_Sprt06Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt06Bridge {
	}
	public class MS_MSBCL1100_Sprt07Bridge extends MSBCP_MfgActReg_MC.MS_MSBCL1100_Sprt07Bridge {
	}

}