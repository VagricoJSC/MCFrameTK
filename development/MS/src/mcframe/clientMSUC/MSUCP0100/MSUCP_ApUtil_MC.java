package mcframe.clientMSUC.MSUCP0100;

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
 * 画面"MSUCP_ApUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_ApUtil_MC extends MSUCP_ApUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * static メソッドのアクセス用フィールド
	 */
	protected static MSUCP_ApUtil _util = new MSUCP_ApUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_ApUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 支払予定管理先締日の設定<br />
	 * 
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出し、設定する。
	 * 
	 * @param r　
	 * @param bsppl_cd_col 支払予定管理先ＣＤのカラム名
	 * @param pay_basis_dt_col　支払起算日のカラム名
	 * @param pay_crryovr_times_col 支払繰越回数のカラム名
	 * @param bsppl_cl_dt_col 支払予定管理先締年月日のカラム名
	 * @param bsppl_cl_ym_col 支払予定管理先年月のカラム名
	 * @param bsppl_cl_day_col 支払予定管理先締日のカラム名
	 * @param panel
	 */
	public static void setBspplClDt(MCRow r, String bsppl_cd_col,
			String pay_basis_dt_col, String pay_crryovr_times_col, String bsppl_cl_dt_col,
			String bsppl_cl_ym_col, String bsppl_cl_day_col, MCRootPanel panel) {
		_util._setBspplClDt(r, bsppl_cd_col, pay_basis_dt_col, pay_crryovr_times_col,
				bsppl_cl_dt_col, bsppl_cl_ym_col, bsppl_cl_day_col, panel);
	}

	protected void _setBspplClDt(MCRow r, String bsppl_cd_col,
			String pay_basis_dt_col, String pay_crryovr_times_col, String bsppl_cl_dt_col,
			String bsppl_cl_ym_col, String bsppl_cl_day_col, MCRootPanel panel) {
		
		String bsppl_cd = r.getStringNE(bsppl_cd_col);
		MCDate pay_basis_dt = r.getDateNE(pay_basis_dt_col);
		MCNumber pay_crryovr_times = r.getNumberNE(pay_crryovr_times_col);
		
		if (isNullOr(bsppl_cd, pay_basis_dt)) {
			return;
		}
		
		MCRow bspplClDt = MSUCP_ApListLogic.getBspplClDt(bsppl_cd, pay_basis_dt, pay_crryovr_times, panel);

		if (!isNull(bsppl_cl_dt_col)) {
			r.setDateNE(bsppl_cl_dt_col, bspplClDt.getDate("bsppl_cl_dt"));
		}
		if (!isNull(bsppl_cl_ym_col)) {
			r.setDateNE(bsppl_cl_ym_col, bspplClDt.getDate("bsppl_cl_ym"));
		}
		if (!isNull(bsppl_cl_day_col)) {
			r.setNumberNE(bsppl_cl_day_col, bspplClDt.getNumber("bsppl_cl_day"));
		}
	}
	/**
	 * 締年月日の設定<br />
	 * 締年月／締日から、締年月日を算出し、設定する。<br />
	 * 
	 * 入力例<br />
	 * 2019/02, 20 -> 2019/02/20<br />
	 * 2019/02, 30 -> 2019/02/28　※ 2/30は存在しないので月末<br />
	 * 2019/02, 99 -> 2019/02/28　※ 2/99は存在しないので月末<br />
	 * 
	 * @param ym 締年月
	 * @param day 締日
	 **/
	
	public static MCDate getClDt(MCDate ym, MCNumber day) {
		return _util._getClDt(ym, day);
	}
	protected MCDate _getClDt(MCDate ym, MCNumber day) {
		if(isNull(ym) || isNull(day)) {
			return null;
		}
		int clDay = day.intValue();
		int lastDay = ym.endOfMonth().getDay();
		
		if(clDay > lastDay) {
			return ym.endOfMonth();
		}
		else {
			return ym.addDay(clDay-1);
		}
	}
	
	/**
	 * 手数料税ＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param base_dt 
	 * @param panel 画面
	 * @return 手数料税ＣＤ、またはnull
	 */
	public static String getComPaidTaxCd(MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(base_dt)) {
			return null;
		}
		
		return MSUCP_ApListLogic.getComPaidTaxCd(base_dt, panel).getString("tax_cd");
	}

}