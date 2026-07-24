package mcframe.clientMSBB.MSBBP1420;

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
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
 * 画面"MSBBP_SlsSlipPrnt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsSlipPrnt_MC extends MSBBP_SlsSlipPrnt_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsSlipPrnt_MC() {
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
	public MSBBP_SlsSlipPrnt_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1420_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1420_Srch01Caller<P extends MSBBP_SlsSlipPrnt, B extends MS_MSBBL1420_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1420_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			// 売上日ＦＲＯＭ・ＴＯチェック
			msgList.addAll(checkBeforeAfter(Cnd_sls_dt_fr, Cnd_sls_dt_to));
			// 計上日ＦＲＯＭ・ＴＯチェック
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			// 新規発行
			if (isSame(Cnd_ope_PRNT1.getActionCommand(), Cnd_ope_Group.getValue())) {
				bridge.up0().prnt_flg(false);
			}
			// 再発行
			else if (isSame(Cnd_ope_PRNT2.getActionCommand(), Cnd_ope_Group.getValue())) {
				bridge.up0().prnt_flg(true);
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setPRNTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MS_MSBBL1420_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1420_Prnt01Caller<P extends MSBBP_SlsSlipPrnt, B extends MS_MSBBL1420_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1420_Prnt01Caller(P p, B b) {
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
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isSame(getStatus(), SRCH) || isStatusNone(getRsltL())) {
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

		clearContainers(getRsltL());
		setSRCHStatus();
		setIndivPrnt();
	}
	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1420_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBBL1420_Prnt01();
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

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setFocus();
	}

	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		setFocus();
	}

	protected void setFocus() {

		if(getRsltL().size() > 0) {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			FoldTab.focusActiveFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

}