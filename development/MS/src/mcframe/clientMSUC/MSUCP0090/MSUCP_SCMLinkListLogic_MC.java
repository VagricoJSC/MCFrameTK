package mcframe.clientMSUC.MSUCP0090;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;

public class MSUCP_SCMLinkListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0090.MSUCL_SCMLinkListLogic";
	}

	/**
	 * SCM IF制御マスタ情報を取得する。
	 * 
	 * @param if_proc_typ
	 * @param loc_cd
	 * @param lg_grp_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @param oper_cd
	 * @param dlv_cd
	 * @param gr_loc_cd
	 * @param master_dt
	 * @return SCM IF制御マスタ情報 または null
	 */
	public static MCRow getScmIfCtrl(
			String if_proc_typ, String loc_cd, String lg_grp_cd,
			String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String oper_cd,
			String dlv_cd, String gr_loc_cd, MCDate master_dt, MCRootPanel panel) {
		return
			create(panel)._getScmIfCtrl(
				if_proc_typ, loc_cd, lg_grp_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3, oper_cd,
				dlv_cd, gr_loc_cd, master_dt, panel);
	}
	public MCRow _getScmIfCtrl(
			String if_proc_typ, String loc_cd, String lg_grp_cd,
			String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String oper_cd,
			String dlv_cd, String gr_loc_cd, MCDate master_dt, MCRootPanel panel) {

		MCRow up = MCRow.create();
		up.addStringColumn("if_proc_typ", if_proc_typ);
		up.addStringColumn("loc_cd", loc_cd);
		up.addStringColumn("lg_grp_cd", lg_grp_cd);
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("oper_cd", oper_cd);
		up.addStringColumn("dlv_cd", dlv_cd);
		up.addStringColumn("gr_loc_cd", gr_loc_cd);
		up.addDateColumn("master_dt", master_dt);

		return getRow(up, panel, "_getScmIfCtrl");
	}

	/**
	 * MESフラグを取得する。
	 * 
	 * @param loc_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @param oper_cd
	 * @param master_dt
	 * @return MESフラグ または null
	 */
	public static MCRow getScmIfCtrlForMes(
			String loc_cd, String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3,
			String oper_cd, MCDate master_dt, MCRootPanel panel) {
		return create(panel)._getScmIfCtrlForMes(loc_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, oper_cd, master_dt, panel);
	}
	public MCRow _getScmIfCtrlForMes(
			String loc_cd, String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3,
			String oper_cd, MCDate master_dt, MCRootPanel panel) {

		MCRow up = MCRow.create();
		up.addStringColumn("loc_cd", loc_cd);
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("oper_cd", oper_cd);
		up.addDateColumn("master_dt", master_dt);

		return getRow(up, panel, "_getScmIfCtrlForMes");
	}

	protected static MSUCP_SCMLinkListLogic create(MCRootPanel panel) {
		return (MSUCP_SCMLinkListLogic) MCListLogic.create(MSUCP_SCMLinkListLogic.class.getName(), panel);
	}
}
