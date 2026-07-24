package mcframe.clientMAUC.MAUCP0080;

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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;
import mcframe.clientCore.beans.text.MCDateFormat;
import mcframe.commonCore.param.MCParam;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.sys.MCSys;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_StdUpriUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_StdUpriUtil_MC extends MAUCP_StdUpriUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static MAUCP_StdUpriUtil _stdUpriUtil = new MAUCP_StdUpriUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_StdUpriUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * サーバ通信用のCallerを返します。
	 *
	 * @param p MCParam
	 * @param panel パネル
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p,
			MCRootPanel panel) {

		return new MAUDP_CallerNoPanel(p);

	}

	/**
	 * 対象の品目、日付、ＷＧ ＣＤに紐付く標準単価を取得します。
	 *
	 * @return 標準単価
	 */
	public static MCNumber getStdCost(
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		MCDate dt,
		String wg_cd,
		String std_upri_sel_typ
	) {
		return _stdUpriUtil._getStdCost(itm_cd, itm_sub1, itm_sub2, itm_sub3, dt, wg_cd, std_upri_sel_typ);
	}

	/**
	 * 対象の品目、日付、ＷＧ ＣＤに紐付く標準単価を取得します。
	 *
	 * @return 標準単価
	 */
	protected MCNumber _getStdCost(
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		MCDate dt,
		String wg_cd,
		String std_upri_sel_typ
	) {

		StdCostR stdCostR = StdCostR.create();
		stdCostR.itm_cd(itm_cd);
		stdCostR.itm_sub1(itm_sub1);
		stdCostR.itm_sub2(itm_sub2);
		stdCostR.itm_sub3(itm_sub3);
		stdCostR.dt(dt);
		stdCostR.wg_cd(wg_cd);
		stdCostR.std_upri_sel_typ(std_upri_sel_typ);

		MCParam p = new MCParam(PDef.MA_MAUCL0080_Srch01_INFO);
		p.addUpBlock(stdCostR);
		p.addDownBlock(stdCostR);
		_createCaller(p, null).exec();

		return stdCostR.std_upri();
	}

	/**
	 * 対象の品目、日付、ＷＧ ＣＤに紐付く標準単価を一括で取得します。
	 *
	 */
	public static void getStdCostL(
		String stdUpriCol,
		MCList<? extends MCRow> tgtL,
		String itmCdCol,
		String itmSub1Col,
		String itmSub2Col,
		String itmSub3Col,
		String dtCol,
		String wgCdCol,
		String stdUpriSelTypCol
	) {
		_stdUpriUtil._getStdCostL(stdUpriCol, tgtL, itmCdCol, itmSub1Col, itmSub2Col, itmSub3Col, dtCol, wgCdCol, stdUpriSelTypCol);
	}

	/**
	 * 対象の品目、日付、ＷＧ ＣＤに紐付く標準単価を一括で取得します。
	 *
	 */
	protected void _getStdCostL(
		String stdUpriCol,
		MCList<? extends MCRow> tgtL,
		String itmCdCol,
		String itmSub1Col,
		String itmSub2Col,
		String itmSub3Col,
		String dtCol,
		String wgCdCol,
		String stdUpriSelTypCol
	) {

		MCList<StdCostListR> stdCostL = MCList.create(StdCostListR.class);
		for (MCRow r : tgtL) {
			StdCostListR stdCostR = StdCostListR.create();
			stdCostR.peg_no(r.getGUIIndex());
			stdCostR.itm_cd(r.getStringNE(itmCdCol));
			stdCostR.itm_sub1(r.getStringNE(itmSub1Col));
			stdCostR.itm_sub2(r.getStringNE(itmSub2Col));
			stdCostR.itm_sub3(r.getStringNE(itmSub3Col));
			stdCostR.dt(r.getDateNE(dtCol));
			stdCostR.wg_cd(r.getStringNE(wgCdCol));
			stdCostR.std_upri_sel_typ(r.getStringNE(stdUpriSelTypCol));
			stdCostL.add(stdCostR);
		}

		MCParam p = new MCParam(PDef.MA_MAUCL0080_Srch02_INFO);
		p.addUpBlock(stdCostL);
		p.addDownBlock(stdCostL);
		_createCaller(p, null).exec();
		
		MCIndexKey idx = stdCostL.createIndex(StdCostListR.$peg_no);
		for (MCRow r : tgtL) {
			StdCostListR stdCostR = stdCostL.getFirst(idx, MCNumber.valueOf(r.getGUIIndex()));
			if (!isNull(stdCostR)) {
				r.setNumberNE(stdUpriCol, stdCostR.std_upri());
			}
		}
	}

}