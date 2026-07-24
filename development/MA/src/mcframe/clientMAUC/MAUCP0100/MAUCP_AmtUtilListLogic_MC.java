package mcframe.clientMAUC.MAUCP0100;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;

public class MAUCP_AmtUtilListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtilListLogic";
	}
		
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 * @return デフォルトの為替レート
	 */
	protected static MCRow getDefXrate(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		return create(panel)._getDefXrate(cur_cd_fr, cur_cd_to, xrate_cd, base_dt, panel);
	}
		
	protected MCRow _getDefXrate(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(cur_cd_fr, cur_cd_to)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", null);
			return r;
		}
		if (isSame(cur_cd_fr, cur_cd_to)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", MCNumber.ONE);
			return r;
		}
		if (isNullOr(xrate_cd, base_dt)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", null);
			return r;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("cur_cd_fr", cur_cd_fr);
		up.addStringColumn("cur_cd_to", cur_cd_to);
		up.addStringColumn("xrate_cd", xrate_cd);
		up.addDateColumn("base_dt", base_dt);
		
		return getRow(up, panel, "_getDefXrate");
	}
	
	protected static MAUCP_AmtUtilListLogic create(MCRootPanel panel) {
		return (MAUCP_AmtUtilListLogic) MCListLogic.create(MAUCP_AmtUtilListLogic.class.getName(), panel);
	}
	
	/**
	 * デフォルトの為替レートを取得します。<br>
	 * 取得できない場合は、NULLを返します。
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 * @return デフォルトの為替レートまたはNULL
	 */
	protected static MCRow getDefXrateNE(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		return create(panel)._getDefXrateNE(cur_cd_fr, cur_cd_to, xrate_cd, base_dt, panel);
	}
		
	protected MCRow _getDefXrateNE(String cur_cd_fr, String cur_cd_to, String xrate_cd, MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(cur_cd_fr, cur_cd_to)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", null);
			return r;
		}
		if (isSame(cur_cd_fr, cur_cd_to)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", MCNumber.ONE);
			return r;
		}
		if (isNullOr(xrate_cd, base_dt)) {
			MCRow r = MCRow.create();
			r.setNumberNE("xrate", null);
			return r;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("cur_cd_fr", cur_cd_fr);
		up.addStringColumn("cur_cd_to", cur_cd_to);
		up.addStringColumn("xrate_cd", xrate_cd);
		up.addDateColumn("base_dt", base_dt);
		
		return getRow(up, panel, "_getDefXrateNE");
	}
}
