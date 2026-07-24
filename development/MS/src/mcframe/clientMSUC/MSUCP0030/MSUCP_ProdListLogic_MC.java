package mcframe.clientMSUC.MSUCP0030;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

public class MSUCP_ProdListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0030.MSUCL_ProdListLogic";
	}
	
	/**
	 * 引数の品目で利用可能なロス理由のリストを取得する。
	 * <p>
	 * 引数のいずれかが nullの場合は空のリストを返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @return ロス理由のリスト　(値が格納されているカラム名：ross_rsn_cd, ross_rsn_nm, fxd_loss_flg, def_disp_flg)
	 */
	public static MCList<MCRow> getLossRsnList(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, MCRootPanel panel) {
		return create(panel)._getLossRsnList(itm_cd, itm_sub1, itm_sub2, itm_sub3, panel);
	}
		
	protected MCList<MCRow> _getLossRsnList(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3)) {
			return MCList.create(MCRow.class);
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		return getList("_getLossRsnList", up, null, getListCacheTyp(up, panel));
	}
	/**
	 * 引数の品目＋ＷＧから所要区分を取得する。
	 * <p>
	 * 引数のいずれかが nullの場合は空のロウを返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param wg_cd ワーキンググループＣＤ
	 * @return 所要区分　(値が格納されているカラム名：rqmt_typ)
	 */
	public static MCRow getRqmtTyp(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String wg_cd, MCRootPanel panel) {
		return create(panel)._getRqmtTyp(itm_cd, itm_sub1, itm_sub2, itm_sub3, wg_cd, panel);
	}
		
	protected MCRow _getRqmtTyp(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String wg_cd, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, wg_cd)) {
			return MCRow.create();
		}

		MCRow up = MCRow.create();

		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("wg_cd", wg_cd);

		return getRow(up, panel, "_getRqmtTyp");
	}
	
	protected static MSUCP_ProdListLogic create(MCRootPanel panel) {
		return (MSUCP_ProdListLogic) MCListLogic.create(MSUCP_ProdListLogic.class.getName(), panel);
	}
		
}
