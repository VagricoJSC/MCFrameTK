package mcframe.clientMSUC.MSUCP0100;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;

import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

public class MSUCP_ApListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0100.MSUCL_ApListLogic";
	}
		
	/**
	 * 支払予定管理先締日を取得する。<br/>
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出し、設定する。
	 * <p>
	 * 支払予定管理先ＣＤ、支払起算日のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param bsppl_cd 支払予定管理先ＣＤ
	 * @param pay_basis_dt 支払起算日
	 * @param pay_crryovr_times 支払繰越回数
	 * @param panel 画面
	 * @return 支払予定管理先締日、または null
	 */
	protected static MCRow getBspplClDt(String bsppl_cd, MCDate pay_basis_dt,
			MCNumber pay_crryovr_times, MCRootPanel panel) {
		return create(panel)._getBspplClDt(bsppl_cd, pay_basis_dt, pay_crryovr_times,
				panel);
	}

	protected MCRow _getBspplClDt(String bsppl_cd, MCDate pay_basis_dt,
			MCNumber pay_crryovr_times, MCRootPanel panel) {
		if (isNullOr(bsppl_cd, pay_basis_dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("bsppl_cd", bsppl_cd);
		up.addDateColumn("pay_basis_dt", pay_basis_dt);
		up.addNumberColumn("pay_crryovr_times", pay_crryovr_times);
		
		return getRow(up, panel, "_getBspplClDt");
	}
	
	protected static MSUCP_ApListLogic create(MCRootPanel panel) {
		return (MSUCP_ApListLogic) MCListLogic.create(MSUCP_ApListLogic.class.getName(), panel);
	}
	
	/**
	 * 手数料税ＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param base_dt 基準日
	 * @param panel 画面
	 * @return 手数料税ＣＤ、またはnull
	 */
	protected static MCRow getComPaidTaxCd(MCDate base_dt, MCRootPanel panel) {
		return create(panel)._getComPaidTaxCd(base_dt, panel);
	}
		
	protected MCRow _getComPaidTaxCd(MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(base_dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addDateColumn("base_dt", base_dt);
		
		return getRow(up, panel, "_getComPaidTaxCd");
	}
}
