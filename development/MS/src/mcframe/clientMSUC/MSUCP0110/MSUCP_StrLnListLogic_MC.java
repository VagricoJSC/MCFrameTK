package mcframe.clientMSUC.MSUCP0110;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;

public class MSUCP_StrLnListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnListLogic";
	}

	/**
	 * 品目と入庫場所を基に標準の棚・ラインＣＤを取得する。
	 * 入庫場所を制限する用途で使用しない。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param loc_cd 場所ＣＤ
	 * @return 棚・ラインＣＤ または null
	 */
	protected static MCRow getDefStrLnCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String loc_cd, MCRootPanel panel) {
		return create(panel)._getDefStrLnCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, loc_cd, panel);
	}

	protected MCRow _getDefStrLnCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String loc_cd, MCRootPanel panel) {

		MCRow up = MCRow.create();

		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("loc_cd", loc_cd);

		return getRow(up, panel, "_getDefStrLnCd");
	}

	protected static MSUCP_StrLnListLogic create(MCRootPanel panel) {
		return (MSUCP_StrLnListLogic) MCListLogic
				.create(MSUCP_StrLnListLogic.class.getName(), panel);
	}
}
