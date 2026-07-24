package mcframe.clientMAUC.MAUCP0160;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;

public class MAUCP_ItmListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMAUC.MAUCL0160.MAUCL_ItmListLogic";
	}
		
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
	protected static MCRow getItmLcl(String lcl_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCRootPanel panel) {
		return create(panel)._getItmLcl(lcl_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, panel);
	}
		
	protected MCRow _getItmLcl(String lcl_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCRootPanel panel) {
		if (isNullOr(lcl_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("lcl_cd", lcl_cd);
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		
		return getRow(up, panel, "_getItmLcl");
	}
	
	protected static MAUCP_ItmListLogic create(MCRootPanel panel) {
		return (MAUCP_ItmListLogic) MCListLogic.create(MAUCP_ItmListLogic.class.getName(), panel);
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
	 * @return 取引先品目情報、または null
	 */
	protected static MCRow getBpItm(String bp_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCDate dt, MCRootPanel panel) {
		return create(panel)._getBpItm(bp_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, dt, panel);
	}
	
	protected MCRow _getBpItm(String bp_cd, String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, MCDate dt, MCRootPanel panel) {
		if (isNullOr(bp_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("bp_cd", bp_cd);
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addDateColumn("dt", dt);
		
		return getRow(up, panel, "_getBpItm");
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
	protected static MCNumber getWtaxRate(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, 
			MCDate dt, MCRootPanel panel) {
		return create(panel)._getWtaxRate(itm_cd, itm_sub1, itm_sub2, itm_sub3, dt, panel);
	}
	
	protected MCNumber _getWtaxRate(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, 
			MCDate dt, MCRootPanel panel) {
		if (!isWtaxEnabled((IfMAUDP_PanelBase)panel)) {
			return null;
		}
		
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addDateColumn("dt", dt);
		
		MCRow r = getRow(up, panel, "_getWtaxRate");
		if (isNull(r)){
			return null;
		}
		return r.getNumber("wtax_rate");
	}
}
