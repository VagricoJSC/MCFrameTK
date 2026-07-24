package mcframe.clientMSUC.MSUCP0050;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;

public class MSUCP_ClListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0050.MSUCL_ClListLogic";
	}
		
	/**
	 * 締処理情報を取得する。
	 * <p>
	 * 締処理情報のうち、各締年月の情報を返す。
	 * 
	 * @param panel 画面
	 * @return 締処理情報、または null
	 */
	protected static MCRow getClose(MCRootPanel panel) {
		return create(panel)._getClose(panel);
	}
		
	protected MCRow _getClose(MCRootPanel panel) {
		
		MCRow up = MCRow.create();
		
		return getRow(up, panel, "_getClose");
	}
	
	protected static MSUCP_ClListLogic create(MCRootPanel panel) {
		return (MSUCP_ClListLogic) MCListLogic.create(MSUCP_ClListLogic.class.getName(), panel);
	}
}
