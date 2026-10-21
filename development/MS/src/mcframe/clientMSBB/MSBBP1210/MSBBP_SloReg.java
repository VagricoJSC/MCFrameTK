// FMSE PANEL_EI
package mcframe.clientMSBB.MSBBP1210;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0210.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
 * 画面"MSBBP_SloReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBP_SloReg extends MSBBP_SloReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SloReg(String name) {
		super(name);
	}

	public class MS_MSBBL1210_Srch01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch01Bridge {
	}
	public class MS_MSBBL1210_Srch02Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch02Bridge {
	}
	public class MS_MSBBL1210_Ins01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Ins01Bridge {
	}
	public class MS_MSBBL1210_Upd01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Upd01Bridge {
	}
	public class MS_MSBBL1210_Del01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Del01Bridge {
	}
	public class MS_MSBBL1210_Sprt01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Sprt01Bridge {
	}

//FMCB CUSTOM START
	/**
	 * Panel[Hdr]のボタン[bom_exp_btn]の押下時の処理
	 */
	@Override
	public void doHdr_bom_exp_btn(MCEventInfo info) {
	}

	/**
	 * [MS_MSBBL1210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch01Caller<P, B> {

		protected MS_MSBBL1210_Srch01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch02Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch02Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch02Caller<P, B> {

		protected MS_MSBBL1210_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Ins01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Ins01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Ins01Caller<P, B> {

		protected MS_MSBBL1210_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Upd01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Upd01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Upd01Caller<P, B> {

		protected MS_MSBBL1210_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Del01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Del01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Del01Caller<P, B> {

		protected MS_MSBBL1210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Sprt01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Sprt01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Sprt01Caller<P, B> {

		protected MS_MSBBL1210_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}
//FMCB CUSTOM END
}