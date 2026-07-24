package mcframe.clientMGBG.MGBGP0140;

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
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5160.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_PreAlcRateLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_PreAlcRateLst_MC extends MGBGP_PreAlcRateLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateLst_MC() {
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
	public MGBGP_PreAlcRateLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0140_Srch01Caller<P extends MGBGP_PreAlcRateLst, B extends MG_MGBGL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
		setBtnMode();			
		}
		
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0140_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0110(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBGP0110(r);
	}

	protected void doBtn_open_MGBGP0110(RsltR r) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0110");
		mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg panel = (mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg) so
				.getPanel();

		if (r.exist_flg()) {
			mcframe.clientMGBG.MGBGP0110.CndR cnd = mcframe.clientMGBG.MGBGP0110.CndR
					.create();
			cnd.ope(panel.Cnd_ope_REF.getActionCommand());
			cnd.calc_ctg_cd(r.calc_ctg_cd());
			cnd.term(r.term());
			cnd.wg_cd(r.wg_cd());
			cnd.pre_alc_rate_cd(r.pre_alc_rate_cd());
			so.putCnd(cnd);
		}
		else {
			mcframe.clientMGBG.MGBGP0110.HdrR hdr = mcframe.clientMGBG.MGBGP0110.HdrR
					.create();
			hdr.calc_ctg_cd(r.calc_ctg_cd());
			hdr.term(r.term());
			hdr.wg_cd(r.wg_cd());
			hdr.pre_alc_rate_cd(r.pre_alc_rate_cd());
			so.putCnd(hdr);
			so.putCndBlockNm("Hdr");
		}
		so.runValueInit();
		if (r.exist_flg()) {
			so.putSearchAction();
		}
		so.show();

	}

	/**
	 * Panel[Btn]のボタン[open_MGBGP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBGP0120(r);
	}
	
	protected void doBtn_open_MGBGP0120(RsltR r) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0120");
		mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg panel = (mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg) so
				.getPanel();

		if (r.exist_flg()) {
			mcframe.clientMGBG.MGBGP0120.CndR cnd = mcframe.clientMGBG.MGBGP0120.CndR
					.create();
			cnd.ope(panel.Cnd_ope_REF.getActionCommand());
			if (Cnd_srch_typ_PLN.isSelected()) {
				cnd.sa_typ(MAC_SA_TYP.PLN.value());
			}
			else {
				cnd.sa_typ(MAC_SA_TYP.ACT.value());
			}
			cnd.calc_ctg_cd(r.calc_ctg_cd());
			cnd.ym(r.ym());
			cnd.wg_cd(r.wg_cd());
			cnd.pre_alc_rate_cd(r.pre_alc_rate_cd());
			so.putCnd(cnd);
		}
		else {
			mcframe.clientMGBG.MGBGP0120.HdrR hdr = mcframe.clientMGBG.MGBGP0120.HdrR
					.create();
			if (Cnd_srch_typ_PLN.isSelected()) {
				hdr.sa_typ(MAC_SA_TYP.PLN.value());
			}
			else {
				hdr.sa_typ(MAC_SA_TYP.ACT.value());
			}
			hdr.calc_ctg_cd(r.calc_ctg_cd());
			hdr.ym(r.ym());
			hdr.wg_cd(r.wg_cd());
			hdr.pre_alc_rate_cd(r.pre_alc_rate_cd());
			so.putCnd(hdr);
			so.putCndBlockNm("Hdr");
		}
		so.runValueInit();
		if (r.exist_flg()) {
			so.putSearchAction();
		}
		so.show();
		
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void valueInit() {
		super.valueInit();
		setCndMode();
		setBtnMode();
		initCalcCtg();
		setDefWg();
	}
	
	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_calc_ctg_cd);
	}
	protected void setDefWg() {
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg)) {
			getCndR().wg_cd(wg);
		}
	}

	
	// -----------------------------------------------
	// status
	
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}
	
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}



	protected void setCndMode(){
		if (Cnd_srch_typ_TERM.isSelected()) {
			Cnd_ym_fr.setMode(MCMode.INVISIBLE);
			Cnd_ym_to.setMode(MCMode.INVISIBLE);
			setValueEx(Cnd_ym_fr, null);
			setValueEx(Cnd_ym_to, null);
			setTermVisible(true);
			setYmVisible(false);
		}
		else {
			setDefaultMode(Cnd_ym_fr);
			setDefaultMode(Cnd_ym_to);
			resetCndValue();
			setTermVisible(false);
			setYmVisible(true);
		}
	}
	
	protected void setBtnMode(){
		if (isNull(RsltTable.getSelectedMCRow())) {
			Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
			Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
		}
		else {
			if (Cnd_srch_typ_TERM.isSelected()) {
				setDefaultMode(Btn_open_MGBGP0110);
				Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
			}
			else {
				Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
				setDefaultMode(Btn_open_MGBGP0120);
			}
		}
	}
	
	protected void resetCndValue(){
		if (isNull(getCndR().term_p().term()) == false) {
			setValueEx(Cnd_ym_fr, getCndR().term_p().term());
			
			if (isNull(getCndR().term_p().term_end_ym())) {
				setValueEx(Cnd_ym_to, getCndR().term_p().term());
			}
			else {
				setValueEx(Cnd_ym_to, getCndR().term_p().term_end_ym().addMonth(-1));
			}
		}
	}

	protected void setTermVisible(boolean boo) {
		setColVisible(columnRslt_term,boo);
		setColVisible(columnRslt_term_nm,boo);
	}
	protected void setYmVisible(boolean boo) {
		setColVisible(columnRslt_ym,boo);
	}
	protected void setColVisible(MCColumnConfig col, boolean boo) {
		if (boo) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}


	
	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_srch_typ_NC(MCEventInfo info) {
		super.doCnd_srch_typ_NC(info);
		
		RsltTable.clear();
		setCndMode();
		setBtnMode();		
	}
	
	
	@Override
	public void doRslt_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();		
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_term.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(mcframe.clientCore.event.MCLCBeans lc,
			mcframe.clientCore.event.MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_term) doCnd_term_LC(info);
	}
	protected void doCnd_term_LC(MCEventInfo info) {
		resetCndValue();
	}

}