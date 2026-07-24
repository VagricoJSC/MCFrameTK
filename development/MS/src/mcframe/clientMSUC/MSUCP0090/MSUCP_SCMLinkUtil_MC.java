package mcframe.clientMSUC.MSUCP0090;

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
 * 画面"MSUCP_SCMLinkUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_SCMLinkUtil_MC extends MSUCP_SCMLinkUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * static メソッドでのアクセス用フィールド
	 */
	protected static MSUCP_SCMLinkUtil _util = new MSUCP_SCMLinkUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_SCMLinkUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * ＷＭＳフラグを取得する。
	 * 
	 * @param if_proc_typ
	 * @param loc_cd
	 * @param lg_grp_cd
	 * @param dlv_cd
	 * @param gr_loc_cd
	 * @param master_dt
	 * @return ＷＭＳフラグ
	 */
	public static boolean getWmsFlg(
			String if_proc_typ, String loc_cd, String lg_grp_cd, String dlv_cd, String gr_loc_cd, MCDate master_dt, MCRootPanel panel) {
		if (isNullOr(if_proc_typ, master_dt) 
			|| isNullAnd(loc_cd, lg_grp_cd)) {
			return false;
		}
		String extSysCd =
			MSUCP_SCMLinkListLogic.getScmIfCtrl(
				if_proc_typ, loc_cd, lg_grp_cd,
				null, null, null, null, null,
				dlv_cd, gr_loc_cd, master_dt, panel).getString("ext_sys_cd");
		return !isNull(extSysCd);
	}

	/**
	 * ＭＥＳフラグを取得する。
	 * 
	 * @param loc_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @param oper_cd
	 * @param master_dt
	 * @return ＭＥＳフラグ
	 */
	public static boolean getMesFlg(
			String loc_cd, String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3,
			String oper_cd, MCDate master_dt, MCRootPanel panel) {
		if (isNull(master_dt)) {
			return false;
		}
		return
			MSUCP_SCMLinkListLogic.getScmIfCtrlForMes(
				loc_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, oper_cd, master_dt, panel).getBoolean("mes_flg");
	}

}