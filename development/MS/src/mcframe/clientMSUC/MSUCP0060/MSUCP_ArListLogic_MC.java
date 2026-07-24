package mcframe.clientMSUC.MSUCP0060;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

public class MSUCP_ArListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0060.MSUCL_ArListLogic";
	}
		
	/**
	 * 得意先および通貨に対応する与信情報を取得する。
	 * <p>
	 * 得意先ＣＤ、通貨ＣＤのいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param cst_cd 得意先ＣＤ
	 * @param cur_cd 通貨ＣＤ
	 * @param panel 画面
	 * @return 与信情報、または null
	 */
	protected static MCRow getCred(String cst_cd, String cur_cd, MCRootPanel panel) {
		return create(panel)._getCred(cst_cd, cur_cd, panel);
	}
		
	protected MCRow _getCred(String cst_cd, String cur_cd, MCRootPanel panel) {
		if (isNullOr(cst_cd, cur_cd)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("cst_cd", cst_cd);
		up.addStringColumn("cur_cd", cur_cd);
		
		return getRow(up, panel, "_getCred");
	}
	
	protected static MSUCP_ArListLogic create(MCRootPanel panel) {
		return (MSUCP_ArListLogic) MCListLogic.create(MSUCP_ArListLogic.class.getName(), panel);
	}
		
}
