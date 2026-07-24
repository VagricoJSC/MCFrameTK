package mcframe.clientMSUC.MSUCP0070;

import mcframe.clientCore.beans.MCListLogic;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;

import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

public abstract class MSUCP_StkUtilListLogic_MC extends mcframe.clientMAUD.MAUDP0130.MAUDP_ListLogicBase {

	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtilListLogic";
	}

	/**
	 * 支給単価マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、支給先、通貨、ワーキンググループコード、基準日の
	 * いずれかが null または空文字の場合は null を返す。
	 * 支給単価マスタがない、または、有償支給でない場合は、支給区分を無償支給として返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param prsppl_cd 支給先
	 * @param cur_cd 通貨
	 * @param wg_cd ワーキンググループ
	 * @param dt 基準日
	 * @param panel 画面
	 * @return 支給単価マスタの情報、または null
	 */
	protected static MCRow getProvUpri(String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, String prsppl_cd,
			String cur_cd, String wg_cd, MCDate dt, MCRootPanel panel) {
		return create(panel)._getProvUpri(itm_cd, itm_sub1, itm_sub2, itm_sub3,
				prsppl_cd, cur_cd, wg_cd, dt, panel);
	}

	protected MCRow _getProvUpri(String itm_cd, String itm_sub1, 
			String itm_sub2, String itm_sub3, String prsppl_cd,
			String cur_cd, String wg_cd, MCDate dt, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd,
				cur_cd, wg_cd, dt)) {
			return null;
		}

		MCRow up = MCRow.create();
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("prsppl_cd", prsppl_cd);
		up.addStringColumn("cur_cd", cur_cd);
		up.addStringColumn("wg_cd", wg_cd);
		up.addDateColumn("dt", dt);

		MCRow provR = getRow(up, panel, "_getProvUpri");
		if (isNull(provR) || !MAC_PROV_TYP.isONR_PROV(provR.getStringNE("prov_typ"))) {
			provR = MCRow.create();
			provR.addStringColumn("prov_typ", MAC_PROV_TYP.FFR_PROV.value());
		}
		return getRow(up, panel, "_getProvUpri");
	}

	/**
	 * 支給税ＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param prsppl_cd 支給先ＣＤ
	 * @param dt 基準日
	 * @param panel 画面
	 * @return 支給税ＣＤ、またはnull
	 */
	protected static MCRow getProvTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String prsppl_cd, MCDate dt, MCRootPanel panel) {
		return create(panel)._getProvTaxCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd, dt, panel);
	}
		
	protected MCRow _getProvTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String prsppl_cd, MCDate dt, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd, dt)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("prsppl_cd", prsppl_cd);
		up.addDateColumn("dt", dt);
		
		return getRow(up, panel, "_getProvTaxCd");
	}
	/**
	 * 物流標準場所のＷＧＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param lg_grp_cd 物流ＧＣＤ
	 * @param panel 画面
	 * @return ＷＧＣＤ、またはnull
	 */
	protected static MCRow getDefLocWgCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String lg_grp_cd, MCRootPanel panel) {
		return create(panel)._getDefLocWgCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, lg_grp_cd, panel);
	}
		
	protected MCRow _getDefLocWgCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String lg_grp_cd, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, lg_grp_cd)) {
			return null;
		}
		
		MCRow up = MCRow.create();
		
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("lg_grp_cd", lg_grp_cd);
		
		return getRow(up, panel, "_getDefLocWgCd");
	}

	/**
	 * 出荷予定日時、納品予定日時を取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param ship_to_id_typ 送付先識別区分
	 * @param ship_to_id_cd 送付先識別ＣＤ
	 * @param ship_to_lg_grp_cd 出荷先物流グループＣＤ
	 * @param ship_fr_lg_grp_cd　出荷元物流グループＣＤ
	 * @param ship_term_cd 出荷条件ＣＤ
	 * @param base_dt 基準日
	 * @param dlv_rqst_tm 納品希望日時
	 * @param ship_rqst_tm 出荷希望日時
	 * @param ship_inst_typ 出荷指図区分
	 * @param panel 画面
	 * @return 出荷予定日時、納品予定日時またはnull
	 */
	protected static MCRow getShipDlvSchdTm(String ship_to_id_typ, String ship_to_id_cd,
			String ship_to_lg_grp_cd, String ship_fr_lg_grp_cd, String ship_term_cd,
			MCDate base_dt, MCDate dlv_rqst_tm, MCDate ship_rqst_tm, String ship_inst_typ,
			MCRootPanel panel) {
		return create(panel)._getShipDlvSchdTm(ship_to_id_typ, ship_to_id_cd,
			ship_to_lg_grp_cd, ship_fr_lg_grp_cd, ship_term_cd,
			base_dt, dlv_rqst_tm, ship_rqst_tm, ship_inst_typ, panel);
		
	}

	protected MCRow _getShipDlvSchdTm(String ship_to_id_typ, String ship_to_id_cd,
			String ship_to_lg_grp_cd, String ship_fr_lg_grp_cd, String ship_term_cd,
			MCDate base_dt, MCDate dlv_rqst_tm, MCDate ship_rqst_tm, String ship_inst_typ,
			MCRootPanel panel) {

		if (isNullOr(ship_to_id_typ, ship_to_id_cd, ship_to_lg_grp_cd, ship_fr_lg_grp_cd,
				ship_inst_typ) || isNullAnd(dlv_rqst_tm, ship_rqst_tm)) {
			return null;
		}

		MCRow up = MCRow.create();
		up.addStringColumn("ship_to_id_typ", ship_to_id_typ);
		up.addStringColumn("ship_to_id_cd", ship_to_id_cd);
		up.addStringColumn("ship_to_lg_grp_cd", ship_to_lg_grp_cd);
		up.addStringColumn("ship_fr_lg_grp_cd", ship_fr_lg_grp_cd);
		up.addStringColumn("ship_term_cd", ship_term_cd);
		up.addDateColumn("base_dt", base_dt);
		up.addDateColumn("dlv_rqst_tm", dlv_rqst_tm);
		up.addDateColumn("ship_rqst_tm", ship_rqst_tm);
		up.addStringColumn("ship_inst_typ", ship_inst_typ);

		return getRow(up, panel, "_getShipDlvSchdTm");
	}

	/**
	 * 送付先識別区分、輸出完了予定日、配送先ＣＤ、を取得する。
	 * <p>
	 * @param gi_lg_grp_cd 出庫物流グループＣＤ
	 * @param gr_lg_grp_cd 入庫物流グループＣＤ
	 * @param ship_term_cd 出荷条件ＣＤ 
	 * @param panel 画面
	 */
	protected static MCRow getXfrEx(String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {
		return create(panel)._getXfrEx(gi_lg_grp_cd, gr_lg_grp_cd, ship_term_cd, panel);
		
	}

	protected MCRow _getXfrEx(String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {

		if (isNullOr(gi_lg_grp_cd, gr_lg_grp_cd)) {
			return null;
		}

		MCRow up = MCRow.create();
		up.addStringColumn("gi_lg_grp_cd", gi_lg_grp_cd);
		up.addStringColumn("gr_lg_grp_cd", gr_lg_grp_cd);
		up.addStringColumn("ship_term_cd", ship_term_cd);

		return getRow(up, panel, "_getXfrEx");
	}
	protected static MCRow getXfrEx(String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3, String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {
		return create(panel)._getXfrEx(itm_cd, itm_sub1, itm_sub2, itm_sub3, gi_lg_grp_cd,
				gr_lg_grp_cd, ship_term_cd, panel);
	}

	protected MCRow _getXfrEx(String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3, String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {
		if (isNullOr(gi_lg_grp_cd, gr_lg_grp_cd)) {
			return null;
		}
		MCRow up = MCRow.create();
		up.addStringColumn("itm_cd", itm_cd);
		up.addStringColumn("itm_sub1", itm_sub1);
		up.addStringColumn("itm_sub2", itm_sub2);
		up.addStringColumn("itm_sub3", itm_sub3);
		up.addStringColumn("gi_lg_grp_cd", gi_lg_grp_cd);
		up.addStringColumn("gr_lg_grp_cd", gr_lg_grp_cd);
		up.addStringColumn("ship_term_cd", ship_term_cd);

		return getRow(up, panel, "_getXfrEx");
	}

	protected static MSUCP_StkUtilListLogic create(MCRootPanel panel) {
		return (MSUCP_StkUtilListLogic) MCListLogic.create(MSUCP_StkUtilListLogic.class.getName(), panel);
	}

}
