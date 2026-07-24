// FMSE PANEL_EI
package mcframe.clientMSBE.MSBEP1400;

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
import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5050.*;

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
 * 画面"MSBEP_ShipInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBEP_ShipInstReg extends MSBEP_ShipInstReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipInstReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipInstReg(String name) {
		super(name);
	}

	public class MS_MSBEL1400_Srch01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch01Bridge {
	}
	public class MS_MSBEL1400_Srch02Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch02Bridge {
	}
	public class MS_MSBEL1400_Sprt01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt01Bridge {
	}
	public class MS_MSBEL1400_Ins01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Ins01Bridge {
	}
	public class MS_MSBEL1400_Upd01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Upd01Bridge {
	}
	public class MS_MSBEL1400_Del01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Del01Bridge {
	}
	public class MS_MSBEL1400_Prnt01Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Prnt01Bridge {
	}
	public class MS_MSBEL1400_Sprt02Bridge extends MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt02Bridge {
	}

}