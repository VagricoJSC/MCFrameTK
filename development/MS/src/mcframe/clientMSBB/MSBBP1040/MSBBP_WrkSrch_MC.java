package mcframe.clientMSBB.MSBBP1040;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;

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
 * 画面"MSBBP_WrkSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_WrkSrch_MC extends MSBBP_WrkSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_WrkSrch_MC() {
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
	public MSBBP_WrkSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1040_Srch01Caller<P extends MSBBP_WrkSrch, B extends MS_MSBBL1040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {

			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_st_dt_fr, Cnd_st_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_end_dt_fr, Cnd_end_dt_to));
			msgList.addAll(checkSmallLarge(Cnd_budget_fr, Cnd_budget_to));
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFocus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setFocus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1040_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBBL1040_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_MSBBP1030(r);
	}
	
	protected void doBtn_open_MSBBP1030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1030");	
		aso.putCnd(crtOpenMSBBP1030CndR(aso, r));
		aso.putSearchAction();
		aso.show();	
	}
	
	/**
	 * 遷移先[MSBBP1010]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1030.CndR crtOpenMSBBP1030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg p = (mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1030.CndR to = mcframe.clientMSBB.MSBBP1030.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.wrk_no(r.wrk_no());
		
		return to;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_budget_fr_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		Cnd_budget_to_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);

		Rslt_budget_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
	}

	protected void setFocus() {
		
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}else{
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	@Override			
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {			
		super.doDCEvent(compo, info);		
		if (compo == RsltTable) {		
			RsltR r = getRsltL().get(info.getEventIndex());	
			if (r == null) {	
				return;
			}	
			doBtn_open_MSBBP1030(r);
		}		
	}	

}