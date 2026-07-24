package mcframe.clientMGUC.MGUCP0060;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

abstract public class MGUCP_CostListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMGUC.MGUCL0060.MGUCL_CostListLogic";
	}
	
	/**
	 * 原価計算ＮＯを年月別原価計算ＮＯ情報（MGT_YM_NO）から取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param calc_grp_cd 計算グループCD
	 * @param ym 年月
	 * @return 原価計算ＮＯ（calc_no）、またはnull
	 */
	protected static MCRow getCalcNoByYm(String calc_grp_cd, MCDate ym, MCRootPanel panel) {
		return create(panel)._getCalcNoByYm(calc_grp_cd, ym, panel);
	}
		
	protected MCRow _getCalcNoByYm(String calc_grp_cd, MCDate ym, MCRootPanel panel) {
		if (isNullOr(calc_grp_cd, ym)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("calc_grp_cd", calc_grp_cd);
		up.addDateColumn("ym", ym);
		
		return getRow(up, panel, "_getCalcNoByYm");
	}
	
	protected static MGUCP_CostListLogic create(MCRootPanel panel) {
		return (MGUCP_CostListLogic) MCListLogic.create(MGUCP_CostListLogic.class.getName(), panel);
	}
		
}
