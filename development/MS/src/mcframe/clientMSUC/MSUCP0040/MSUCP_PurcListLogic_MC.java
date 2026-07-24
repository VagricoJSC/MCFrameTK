package mcframe.clientMSUC.MSUCP0040;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;

public class MSUCP_PurcListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0040.MSUCL_PurcListLogic";
	}
	
	protected static MSUCP_PurcListLogic create(MCRootPanel panel) {
		return (MSUCP_PurcListLogic) MCListLogic.create(MSUCP_PurcListLogic.class.getName(), panel);
	}
	
	/**
	 * 予定日を取得する。
	 * <p>
	 * 
	 * @param  peg_no   紐付けＮＯ
	 * @param  rqst_dlv_rqst_dt   依頼元納入希望日
	 * @param  dlv_rqst_dt   納入希望日
	 * @param  po_schd_dt   発注予定日
	 * @param  purc_schd_dt   仕入予定日
	 * @param  sppl_cd   発注先ＣＤ
	 * @param  itm_cd   品目ＣＤ
	 * @param  itm_sub1   枝番１
	 * @param  itm_sub2   枝番２
	 * @param  itm_sub3   枝番３
	 * @param  mfg_loc_cd   製造場所ＣＤ
	 * @param  maker_cd   メーカＣＤ
	 * @param  wg_cd   ＷＧ　ＣＤ
	 * @param  bom_ptn   構成パタン
	 * @param  dlv_cd   納品先ＣＤ
	 * @param  in_to_loc_cd   納入場所ＣＤ
	 * @param  site_cd   工場・物流倉庫ＣＤ
	 * @param  outsrc_sppl_cd 外注発注先ＣＤ
	 * @param  sppl_cal_cd   発注先カレンダＣＤ
	 * @param  in_to_loc_cal_cd   納入場所カレンダＣＤ
	 * @param  dlv_cal_cd   納品先カレンダＣＤ
	 * @param  lg_grp_cd   物流グループＣＤ
	 * @param  base_unit_qty   基準単位数量
	 * @param panel 画面
	 * @return 予定日情報、または null
	 */
	protected static MCRow getSchdDt(
			MCNumber peg_no, 
			MCDate rqst_dlv_rqst_dt,
			MCDate dlv_rqst_dt,
			MCDate po_schd_dt,
			MCDate purc_schd_dt,
			String sppl_cd,
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String mfg_loc_cd,
			String maker_cd,
			String wg_cd,
			String bom_ptn,
			String dlv_cd,
			String in_to_loc_cd,
			String site_cd,
			String outsrc_sppl_cd,
			String sppl_cal_cd,
			String in_to_loc_cal_cd,
			String dlv_cal_cd,
			String lg_grp_cd,
			MCNumber base_unit_qty,
			MCDate base_dt,
			MCRootPanel panel) {
		return create(panel)._getSchdDt(
				peg_no,
				rqst_dlv_rqst_dt,
				dlv_rqst_dt,
				po_schd_dt,
				purc_schd_dt,
				sppl_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				mfg_loc_cd,
				maker_cd,
				wg_cd,
				bom_ptn,
				dlv_cd,
				in_to_loc_cd,
				site_cd,
				outsrc_sppl_cd,
				sppl_cal_cd,
				in_to_loc_cal_cd,
				dlv_cal_cd,
				lg_grp_cd,
				base_unit_qty,
				base_dt,
				panel);
	}
		
	protected MCRow _getSchdDt(
			MCNumber peg_no, 
			MCDate rqst_dlv_rqst_dt,
			MCDate dlv_rqst_dt,
			MCDate po_schd_dt,
			MCDate purc_schd_dt,
			String sppl_cd,
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String mfg_loc_cd,
			String maker_cd,
			String wg_cd,
			String bom_ptn,
			String dlv_cd,
			String in_to_loc_cd,
			String site_cd,
			String outsrc_sppl_cd,
			String sppl_cal_cd,
			String in_to_loc_cal_cd,
			String dlv_cal_cd,
			String lg_grp_cd,
			MCNumber base_unit_qty,
			MCDate base_dt,
			MCRootPanel panel) {
		
		if (isNullOr(peg_no, sppl_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, in_to_loc_cd, site_cd, wg_cd)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addNumberColumn("peg_no", peg_no);
		up.addDateColumn("rqst_dlv_rqst_dt", rqst_dlv_rqst_dt);
		up.addDateColumn("dlv_rqst_dt", dlv_rqst_dt);
		up.addDateColumn("po_schd_dt", po_schd_dt);
		up.addDateColumn("purc_schd_dt", purc_schd_dt);
		up.addStringColumn("sppl_cd", sppl_cd);
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("mfg_loc_cd", mfg_loc_cd);
		up.addStringColumn("maker_cd", maker_cd);
		up.addStringColumn("wg_cd", wg_cd);
		up.addStringColumn("bom_ptn", bom_ptn);
		up.addStringColumn("dlv_cd", dlv_cd);
		up.addStringColumn("in_to_loc_cd", in_to_loc_cd);
		up.addStringColumn("site_cd", site_cd);
		up.addStringColumn("outsrc_sppl_cd", outsrc_sppl_cd);
		up.addStringColumn("sppl_cal_cd", sppl_cal_cd);
		up.addStringColumn("in_to_loc_cal_cd", in_to_loc_cal_cd);
		up.addStringColumn("dlv_cal_cd", dlv_cal_cd);
		up.addStringColumn("lg_grp_cd", lg_grp_cd);
		up.addNumberColumn("base_unit_qty", base_unit_qty);
		up.addDateColumn("base_dt", base_dt);
		return getRow(up, panel, "_getSchdDt");
	}
	
	/**
	 * 税を取得する。
	 * <p>
	 * @param   グループＮＯ
	 * @param panel 画面
	 * @return 単価情報、または null
	 */
	protected static String getPurcTaxCd(
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String sppl_cd,
			MCDate base_dt,
			MCRootPanel panel) {
		return create(panel)._getPurcTaxCd(
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				sppl_cd,
				base_dt,
				panel);
	}
	
	protected String _getPurcTaxCd(
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String sppl_cd,
			MCDate base_dt,
			MCRootPanel panel) {
		
		if (isNull(base_dt)) {
			return null;
		}
		
		if (isNullAnd(itm_cd, itm_sub1, itm_sub2, itm_sub3, sppl_cd)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("sppl_cd", sppl_cd);
		up.addDateColumn("base_dt", base_dt);
		MCRow rslt = getRow(up, panel, "_getPurcTaxCd");
		return rslt.getString("tax_cd");
	}
}
