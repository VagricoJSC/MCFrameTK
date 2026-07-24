package mcframe.clientMGBD.MGBDP0210;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_AlcCalcErrSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_AlcCalcErrSrch_MC extends MGBDP_AlcCalcErrSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Color _ttlColor = getVTtlColor(this);
	protected Color _othColor = getBgOtherColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_AlcCalcErrSrch_MC() {
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
	public MGBDP_AlcCalcErrSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0210_Srch01Caller<P extends MGBDP_AlcCalcErrSrch, B extends MG_MGBDL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			if(Cnd_ope_INS.isSelected()) {
				if(arrayValueSplit(getCndR().calc_no()).length > 1) {
					msgList.add(new MCMessage(MGBDP0005));
				}
			}
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			if(Cnd_ope_REF.isSelected()) {
				addTtlRow();
			}
		}
		
		/**
		 * 合計行の追加
		 */
		protected void addTtlRow() {
			RsltR addR = RsltR.create();
			addR.amt(bridge.down0().sum(RsltR.$amt));
			bridge.down0().add(addR);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_INS.isSelected()) {
				setInsCndR();
				setUPD_AStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected void setInsCndR() {
			getInsCndR().calc_grp_cd(getCndR().calc_grp_cd());
			getInsCndR().calc_grp_nm(getCndR().calc_grp_nm());
			getInsCndR().sa_typ(getCndR().sa_typ());
			getInsCndR().calc_no(getCndR().calc_no());
			getInsCndR().rmrks(getCndR().rmrks());
			getInsCndR().term(getCndR().term());
			getInsCndR().end_ym(getCndR().end_ym());
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_INS.isSelected()) {
				setUPDStatus();
				panel.clear(getInsCndR());
			}
		}
		
		@Override
		protected void moveFocus() {
			
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void moveFocusNoDown() {
			
			super.moveFocusNoDown();
			FoldTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MG_MGBDL0210_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0210_Ins01Caller<P extends MGBDP_AlcCalcErrSrch, B extends MG_MGBDL0210_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0210_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			FoldTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MG_MGBDL0210_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0210_Del01Caller<P extends MGBDP_AlcCalcErrSrch, B extends MG_MGBDL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0210_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}
		
		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0210_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0010(MCEventInfo info) {
		doBtn_open_MGBGP0010();
	}
	protected void doBtn_open_MGBGP0010() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0010");
		mcframe.clientMGBG.MGBGP0010.MGBGP_PlnAlcAmtSrch p = (mcframe.clientMGBG.MGBGP0010.MGBGP_PlnAlcAmtSrch) aso.getPanel();
		mcframe.clientMGBG.MGBGP0010.CndR to = mcframe.clientMGBG.MGBGP0010.CndR.create();
		
		if (Cnd_ope_DEL.isSelected()) {
			to.trd_calc_grp_cd(getDelCndR().calc_grp_cd());
			to.trd_calc_no(getDelCndR().calc_no());
			to.trd_wg_cd(getDelCndR().wg_cd());
			if (!isNull(getDelCndR().end_ym())) {
				to.ym_fr(getDelCndR().end_ym().addMonth(1));
				to.ym_to(getDelCndR().end_ym().addMonth(1));
			}
			to.calc_ctg_cd(getDelCndR().calc_ctg_cd());
		}
		else if (Cnd_ope_INS.isSelected()) {
			if (isNull(getInsCndR().calc_ctg_cd())) {
				to.trd_calc_grp_cd(getCndR().calc_grp_cd());
				to.trd_calc_no(getCndR().calc_no());
				to.trd_wg_cd(getCndR().wg_cd());
				if (!isNull(getCndR().end_ym())) {
					to.ym_fr(getCndR().end_ym().addMonth(1));
					to.ym_to(getCndR().end_ym().addMonth(1));
				}
			}
			else {
				to.trd_calc_grp_cd(getInsCndR().calc_grp_cd());
				to.trd_calc_no(getInsCndR().calc_no());
				to.trd_wg_cd(getCndR().wg_cd());
				if (!isNull(getInsCndR().end_ym())) {
					to.ym_fr(getInsCndR().end_ym().addMonth(1));
					to.ym_to(getInsCndR().end_ym().addMonth(1));
				}
			}
			to.calc_ctg_cd(getInsCndR().calc_ctg_cd());
		}
		to.pre_alc_typ(p.Cnd_pre_alc_typ_BEFORE.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0020(MCEventInfo info) {
		doBtn_open_MGBGP0020();
	}
	protected void doBtn_open_MGBGP0020() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0020");
		mcframe.clientMGBG.MGBGP0020.MGBGP_ActAlcAmtSrch p = (mcframe.clientMGBG.MGBGP0020.MGBGP_ActAlcAmtSrch) aso.getPanel();
		mcframe.clientMGBG.MGBGP0020.CndR to = mcframe.clientMGBG.MGBGP0020.CndR.create();
		
		if (Cnd_ope_DEL.isSelected()) {
			to.trd_calc_grp_cd(getDelCndR().calc_grp_cd());
			to.trd_calc_no(getDelCndR().calc_no());
			to.trd_wg_cd(getDelCndR().wg_cd());
			if (!isNull(getDelCndR().end_ym())) {
				to.ym_fr(getDelCndR().end_ym().addMonth(1));
				to.ym_to(getDelCndR().end_ym().addMonth(1));
			}
			to.calc_ctg_cd(getDelCndR().calc_ctg_cd());
		}
		else if (Cnd_ope_INS.isSelected()) {
			if (isNull(getInsCndR().calc_ctg_cd())) {
				to.trd_calc_grp_cd(getCndR().calc_grp_cd());
				to.trd_calc_no(getCndR().calc_no());
				to.trd_wg_cd(getCndR().wg_cd());
				if (!isNull(getCndR().end_ym())) {
					to.ym_fr(getCndR().end_ym().addMonth(1));
					to.ym_to(getCndR().end_ym().addMonth(1));
				}
			}
			else {
				to.trd_calc_grp_cd(getInsCndR().calc_grp_cd());
				to.trd_calc_no(getInsCndR().calc_no());
				to.trd_wg_cd(getCndR().wg_cd());
				if (!isNull(getInsCndR().end_ym())) {
					to.ym_fr(getInsCndR().end_ym().addMonth(1));
					to.ym_to(getInsCndR().end_ym().addMonth(1));
				}
			}
			to.calc_ctg_cd(getInsCndR().calc_ctg_cd());
		}
		to.pre_alc_typ(p.Cnd_pre_alc_typ_BEFORE.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0210_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0210_Del01();
	}
	
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		DelCnd_calc_no_p_PPanel.setRelateBeans(DelCnd_calc_grp_cd);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}
	
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected boolean useDelMsg() {
		return false;
	}
	
	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(InsCnd_calc_ctg_cd);
		}
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setStatusCom();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setUPD_AStatus() {
		super.setUPD_AStatus();
		setStatusCom();
		initCalcCtg();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}
	
	protected void setStatusCom() {
		setTabMode();
		setStatusColumn();
		setFocus();
		setBtnMode();
		if (!Cnd_ope_INS.isSelected()) {
			clear(getInsCndR());
		}
	}
	
	protected void setTabMode() {
		if(Cnd_ope_DEL.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
	}
	
	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}
	
	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_INS.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	
	protected void setBtnMode() {
		setDefaultMode(Btn_open_MGBGP0010);
		setDefaultMode(Btn_open_MGBGP0020);
		
		if(Cnd_ope_INS.isSelected()) {
			if (MAC_SA_TYP.isPLN(getCndR().sa_typ())) {
				Btn_open_MGBGP0010.setMode(MCMode.ENABLE);
			}
			else if (MAC_SA_TYP.isACT(getCndR().sa_typ())) {
				Btn_open_MGBGP0020.setMode(MCMode.ENABLE);
			}
		}
		else if(Cnd_ope_DEL.isSelected()) {
			if (MAC_SA_TYP.isPLN(getDelCndR().sa_typ())) {
				Btn_open_MGBGP0010.setMode(MCMode.ENABLE);
			}
			else if (MAC_SA_TYP.isACT(getDelCndR().sa_typ())) {
				Btn_open_MGBGP0020.setMode(MCMode.ENABLE);
			}
		}
	}
	
	protected boolean isEnableBtn_open_MGBGP0010() {
		return (MAC_SA_TYP.isPLN(getCndR().sa_typ()) && Btn_open_MGBGP0010.isEnabled());
	}
	
	protected boolean isEnableBtn_open_MGBGP0020() {
		return (MAC_SA_TYP.isACT(getCndR().sa_typ()) && Btn_open_MGBGP0020.isEnabled());
	}
	
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_A);
	}
	
	protected boolean isRegStatus() {
		return isUpdStatus();
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		if (lc == DelCnd_calc_grp_cd) {
			doDelCnd_calc_grp_cd_LC();
		}
		super.doLCEvent(lc, info);
	}
	
	protected void doDelCnd_calc_grp_cd_LC() {
		setBtnMode();
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		setSrchStatus();
		
		if (Cnd_ope_DEL.isSelected()) {
			copyComboValue(Cnd_calc_grp_cd, DelCnd_calc_grp_cd);
			copyComboValue(Cnd_calc_no, DelCnd_calc_no);
		}
	}
	
	protected void copyComboValue(MCTextComboBox from, MCTextComboBox to) {
		if (to.checkValue(from.getValue()).size() == 0) {
			setValueEx(to, from.getValue());
		}
		else {
			setValueEx(to, null);
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			if (isEnableBtn_open_MGBGP0010()) {
				doBtn_open_MGBGP0010();
			}
			else if (isEnableBtn_open_MGBGP0020()) {
				doBtn_open_MGBGP0020();
			}
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	protected RsltTableCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}
	
	protected class RsltTableCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if(Cnd_ope_REF.isSelected()) {
				if (index == getRsltL().size() - 1) {
					return _ttlColor;
				}
				else {
					return _othColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

}