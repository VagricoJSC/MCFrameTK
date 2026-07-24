package mcframe.clientMSBC.MSBCP0210;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
 * 画面"MSBCP_SimOperOrdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_SimOperOrdSrch_MC extends MSBCP_SimOperOrdSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimOperOrdSrch_MC() {
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
	public MSBCP_SimOperOrdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0210_Srch01Caller<P extends MSBCP_SimOperOrdSrch, B extends MS_MSBCL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0210_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0210_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0160(MCEventInfo info) {
		//シミュレーション用オーダ確認画面
		openMsbcp0160();
	}
	
	//DCと画面遷移ボタンで共有
	protected void openMsbcp0160() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0160ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	/** 遷移先(シミュレーション用オーダ確認)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0160ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0160");
		mcframe.clientMSBC.MSBCP0160.CndR cnd = mcframe.clientMSBC.MSBCP0160.CndR.create();
		mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch p =
				(mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch)so.getPanel();

//		to.opn(true);
//		to.exp(true);
//		
//		to.mfg_flg(true);
//		to.purc_flg(true);
//		to.outsrc_flg(true);
//		to.xfr_flg(true);
//		to.wg_xfr_flg(true);
//		
//		to.true_not_fix_flg(true);
//		to.false_not_fix_flg(true);
		
		cnd.ope(p.Cnd_ope_REF.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());
		
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			openMsbcp0160();
		}
	}

	// 画面起動時の定型処理ここから
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_oper_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_oper_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_oper_dec_place);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// モード設定ここから
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
		else {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

}