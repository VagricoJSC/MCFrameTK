package mcframe.clientMAUC.MAUCP0010;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;

public class MAUCP_ItmUnitListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMAUC.MAUCL0010.MAUCL_ItmUnitListLogic";
	}

	/**
	 * 品目単位マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、単位ＣＤのいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param unit_cd 単位ＣＤ
	 * @param panel 画面
	 * @return 品目単位マスタの情報、または null
	 */
	protected static MCRow getItmUnit(String itm_cd, String itm_sub1, 
		String itm_sub2, String itm_sub3, String unit_cd, MCRootPanel panel) {

		return create(panel)._getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd, null, panel);
	}

	/**
	 * 品目単位マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、単位ＣＤのいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param unit_cd 単位ＣＤ
	 * @param add_unit_cd 追加単位ＣＤ
	 * @param panel 画面
	 * @return 品目単位マスタの情報、または null
	 */
	protected static MCRow getItmUnit(String itm_cd, String itm_sub1, 
		String itm_sub2, String itm_sub3, String unit_cd, String add_unit_cd, MCRootPanel panel) {

		return create(panel)._getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd, add_unit_cd, panel);
	}

	protected MCRow _getItmUnit(String itm_cd, String itm_sub1, 
		String itm_sub2, String itm_sub3, String unit_cd, String add_unit_cd, MCRootPanel panel) {

		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd)) {
			return null;
		}

		MCRow up = MCRow.create();
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("unit_cd", unit_cd);
		up.addStringColumn("add_unit_cd", add_unit_cd);

		return getRow(up, panel, "_getItmUnit");
	}
	
	protected static MAUCP_ItmUnitListLogic create(MCRootPanel panel) {
		return (MAUCP_ItmUnitListLogic) MCListLogic.create(MAUCP_ItmUnitListLogic.class.getName(), panel);
	}

}
