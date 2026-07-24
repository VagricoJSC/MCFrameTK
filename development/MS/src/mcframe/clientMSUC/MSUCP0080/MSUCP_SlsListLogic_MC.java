package mcframe.clientMSUC.MSUCP0080;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

public class MSUCP_SlsListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0080.MSUCL_SlsListLogic";
	}
	
	/**
	 * 売上消費税ＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param cst_cd 得意先ＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 * @return 売上消費税ＣＤ、またはnull
	 */
	protected static MCRow getSlsTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String cst_cd, MCDate base_dt, MCRootPanel panel) {
		return create(panel)._getSlsTaxCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, cst_cd, base_dt, panel);
	}
		
	protected MCRow _getSlsTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String cst_cd, MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, cst_cd, base_dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("cst_cd", cst_cd);
		up.addDateColumn("base_dt", base_dt);
		
		return getRow(up, panel, "_getSlsTaxCd");
	}
	
	/**
	 * 売上部門CDを元に仕入直送中継場所のワーキンググループを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param dptCd 売上部門
	 * @param baseDt 基準日
	 * @param panel 画面
	 * @return 仕入直送中継場所のワーキンググループＣＤ、またはnull
	 */
	protected static MCRow getMidLocWgCd(String dptCd, MCDate baseDt, MCRootPanel panel) {
		return create(panel)._getMidLocCd(dptCd, baseDt, panel);
	}
		
	protected MCRow _getMidLocCd(String dptCd, MCDate baseDt, MCRootPanel panel) {
		
		if (isNullOr(dptCd, baseDt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("dpt_cd", dptCd);
		up.addDateColumn("base_dt", baseDt);
		
		return getRow(up, panel, "_getMidLocWgCd");
	}
	
	protected static MSUCP_SlsListLogic create(MCRootPanel panel) {
		return (MSUCP_SlsListLogic) MCListLogic.create(MSUCP_SlsListLogic.class.getName(), panel);
	}
		
}
