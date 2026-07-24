package mcframe.clientMSBD.MSBDP0250;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5190.*;

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
 * 画面"MSBDP_PurcDlvSlipPrnt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcDlvSlipPrnt_MC extends MSBDP_PurcDlvSlipPrnt_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDlvSlipPrnt_MC() {
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
	public MSBDP_PurcDlvSlipPrnt_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0250_Srch01Caller<P extends MSBDP_PurcDlvSlipPrnt, B extends MS_MSBDL0250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0250_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(
				mcframe.commonCore.notice.MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_dlv_rqst_dt_fr, Cnd_dlv_rqst_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_dlv_prnt_flg, Cnd_not_dlv_prnt_flg));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (isSame(Cnd_ope_DLVSLIP.getActionCommand(), Cnd_ope_Group.getValue())) {
				setPRNT_DLV_SLIPStatus();
			}
			else if (isSame(Cnd_ope_PURCDDLVSLIP.getActionCommand(), Cnd_ope_Group.getValue())) {
				setPRNT_PURC_DDLV_SLIPStatus();
			}

			setLatestFlgMode();
			setInvNonPrntFlgMode();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			setLatestFlgMode();
			setInvNonPrntFlgMode();
		}
	}

	/**
	 * [MS_MSBDL0250_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0250_Prnt01Caller<P extends MSBDP_PurcDlvSlipPrnt, B extends MS_MSBDL0250_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0250_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setSRCHStatus();
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().forEach(r -> {
				r.ope(getCndR().ope());
			});
		}
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().dlv_prnt_flg(true);
		getCndR().not_dlv_prnt_flg(true);
		setLatestFlgMode();
	}
	@Override
	protected void initByScreenParam(java.lang.String openTyp,
			mcframe.commonCore.container.MCRow bind, java.lang.Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		getCndR().dlv_prnt_flg(true);
		getCndR().not_dlv_prnt_flg(true);
		setLatestFlgMode();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBDL0250_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0250_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 取引先分類
		Dtl_bp_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
			if (!super.doCnd_ope_VC(info)) {
				return false;
			}
			else {
				if (isSame(getStatus(), SRCH) || isStatusNone(getDtlL())) {
					return true;
				}
				else {
					return confirmRegDataClear();
				}
			}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getDtlL());
		setSRCHStatus();
		setIndivPrnt();
		setLatestFlgMode();
	}

	@Override
	public void doCnd_inv_can_flg_NC(MCEventInfo info) {
		super.doCnd_inv_can_flg_NC(info);
		
		setLatestFlgMode();
	}
	
	@Override
	public void doCnd_not_dlv_prnt_flg_NC(MCEventInfo info) {
		super.doCnd_not_dlv_prnt_flg_NC(info);
		setInvNonPrntFlgMode();
	}

	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}
	
	/**
	 * 最新のみの制御を設定する。
	 */
	protected void setLatestFlgMode(){
		if(Cnd_inv_can_flg.getValue()) {
			Cnd_latest_flg.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			setValueEx(Cnd_latest_flg, true);
		}
	}
	/**
	 * 発行対象外含むの制御を行う
	 */
	protected void setInvNonPrntFlgMode () {
		if (!getCndR().not_dlv_prnt_flg()) {
			setValueEx(Cnd_inv_non_prnt_flg, false);
			Cnd_inv_non_prnt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_inv_non_prnt_flg);
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setFocus();
	}
	@Override
	public void setPRNT_DLV_SLIPStatus() {
		super.setPRNT_DLV_SLIPStatus();
		setFocus();
	}
	@Override
	public void setPRNT_PURC_DDLV_SLIPStatus() {
		super.setPRNT_PURC_DDLV_SLIPStatus();;
		setFocus();
	}
	protected void setFocus() {
		if(getDtlL().size() > 0) {
			DtlTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			FoldTab.focusActiveFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

}