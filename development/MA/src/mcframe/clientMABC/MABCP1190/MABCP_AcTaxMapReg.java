// FMSE PANEL_EI
package mcframe.clientMABC.MABCP1190;

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
import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP5010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


/**
 * 画面"MABCP_AcTaxMapReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MABCP_AcTaxMapReg extends MABCP_AcTaxMapReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AcTaxMapReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_AcTaxMapReg(String name) {
		super(name);
	}

	public class MA_MABCL1190_Srch01Bridge extends MABCP_AcTaxMapReg_MC.MA_MABCL1190_Srch01Bridge {
	}
	public class MA_MABCL1190_Sprt01Bridge extends MABCP_AcTaxMapReg_MC.MA_MABCL1190_Sprt01Bridge {
	}
	public class MA_MABCL1190_Upd01Bridge extends MABCP_AcTaxMapReg_MC.MA_MABCL1190_Upd01Bridge {
	}
	public class MA_MABCL1190_Del01Bridge extends MABCP_AcTaxMapReg_MC.MA_MABCL1190_Del01Bridge {
	}

}