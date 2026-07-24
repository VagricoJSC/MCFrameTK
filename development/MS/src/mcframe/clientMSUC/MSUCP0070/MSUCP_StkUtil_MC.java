package mcframe.clientMSUC.MSUCP0070;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUCP_StkUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_StkUtil_MC extends MSUCP_StkUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_StkUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 支給単価マスタの情報を取得する。
	 * <p>
	 * 品目ＣＤ、枝番１、枝番２、枝番３、支給先、通貨、ワーキンググループコード、基準日の
	 * いずれかが null または空文字の場合は null を返す。
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
	public static MCRow getProvUpri(String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3, String prsppl_cd, String cur_cd, String wg_cd, MCDate dt,
			MCRootPanel panel) {
		return MSUCP_StkUtilListLogic.getProvUpri(itm_cd, itm_sub1, itm_sub2, itm_sub3,
				prsppl_cd, cur_cd, wg_cd, dt, panel);
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
	public static String getProvTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String prsppl_cd, MCDate dt, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd, dt)) {
			return null;
		}
		return MSUCP_StkUtilListLogic.getProvTaxCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, prsppl_cd, dt, panel).getString("tax_cd");
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
	public static String getDefLocWgCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String lg_grp_cd, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, lg_grp_cd)) {
			return null;
		}
		return MSUCP_StkUtilListLogic.getDefLocWgCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, lg_grp_cd, panel).getString("wg_cd");
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
	public static MCRow getShipDlvSchdTm(String ship_to_id_typ, String ship_to_id_cd,
			String ship_to_lg_grp_cd, String ship_fr_lg_grp_cd, String ship_term_cd,
			MCDate base_dt, MCDate dlv_rqst_tm, MCDate ship_rqst_tm, String ship_inst_typ,
			MCRootPanel panel) {
		return MSUCP_StkUtilListLogic.getShipDlvSchdTm(ship_to_id_typ, ship_to_id_cd,
			ship_to_lg_grp_cd, ship_fr_lg_grp_cd, ship_term_cd,
			base_dt, dlv_rqst_tm, ship_rqst_tm, ship_inst_typ, panel);
	}

	/**
	 * 送付先識別区分、輸出完了予定日、配送先ＣＤ、を取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * @param gi_lg_grp_cd 出庫物流グループＣＤ
	 * @param gr_lg_grp_cd 入庫物流グループＣＤ
	 * @param ship_term_cd 出庫条件ＣＤ 
	 * @param panel 画面
	 * @return 関連事項を参照のこと
	 * @see mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtilListLogic#_getXfrEx(MCRow)
	 */
	public static MCRow getXfrEx(String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {
		return MSUCP_StkUtilListLogic.getXfrEx(gi_lg_grp_cd, gr_lg_grp_cd, ship_term_cd, panel);
	}
	public static MCRow getXfrEx(String itm_cd,String itm_sub1,String itm_sub2,String itm_sub3,String gi_lg_grp_cd, String gr_lg_grp_cd,
			String ship_term_cd, MCRootPanel panel) {
		return MSUCP_StkUtilListLogic.getXfrEx(itm_cd,itm_sub1,itm_sub2,itm_sub3,gi_lg_grp_cd, gr_lg_grp_cd, ship_term_cd, panel);
	}

}