package mcframe.clientMBBE.MBBEP0030;

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


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_BizDatDL"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_BizDatDL_MC extends MBBEP_BizDatDL_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDL_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BizDatDL_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0030_Srch01Caller<P extends MBBEP_BizDatDL, B extends MB_MBBEL0030_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setOpenButtonMode();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenButtonMode();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMB_MBBEL0030_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MBBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		openPanel("MB", "MBBEP0040", T1, r);
	}

	/**
	 * Panel[Btn]のボタン[open_MBBEP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBEP0060(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBEP0060");
		aso.putCnd(crtOpenMBBEP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMBBE.MBBEP0060.CndR crtOpenMBBEP0060CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMBBE.MBBEP0060.CndR to = mcframe.clientMBBE.MBBEP0060.CndR.create();
		to.biz_dat_id(r.biz_dat_id());
		to.ope("3");
		return to;
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		// 折り返し設定
		Tab1_biz_dat_rmrks1.setLineWrap(true);
		Tab2_biz_dat_rmrks2.setLineWrap(true);
		Tab3_biz_dat_rmrks3.setLineWrap(true);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		RsltTable.addSortColumn(columnRslt_biz_dat_id);
	}

	public void doRslt_NC(MCEventInfo info) {
		if (info.getEventIndex() >= 0) {
			RsltR r = getRsltL().get(info.getEventIndex());
			getTab1R().biz_dat_rmrks1(r.biz_dat_rmrks1());
			getTab2R().biz_dat_rmrks2(r.biz_dat_rmrks2());
			getTab3R().biz_dat_rmrks3(r.biz_dat_rmrks3());
		}
		setOpenButtonMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setOpenButtonMode();
	}

	protected void setOpenButtonMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			Btn_open_MBBEP0040.setMode(MCMode.DISABLE);
			Btn_open_MBBEP0060.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MBBEP0040);
			if (MAC_BIZ_DAT_GET_TYP.isSQL_REG(r.biz_dat_get_typ())) {
				setDefaultMode(Btn_open_MBBEP0060);
			}
			else {
				Btn_open_MBBEP0060.setMode(MCMode.DISABLE);
			}
		}
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		CndPanel.focusFirstComponent();
	}

	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doRsltBtn_open(info);
		}
	}

	protected void doRsltBtn_open(MCEventInfo info) {
		doBtn_open_MBBEP0040(info);
	}

}