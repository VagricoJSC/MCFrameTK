package mcframe.clientMGBF.MGBFP0320;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_CostReportPrnt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_CostReportPrnt_MC extends MGBFP_CostReportPrnt_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostReportPrnt_MC() {
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
	public MGBFP_CostReportPrnt_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMG_MGBFL0320_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(ReportTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(ReportTable);
	}
	/**
	 * [MG_MGBFL0320_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0320_Srch01Caller<P extends MGBFP_CostReportPrnt, B extends MG_MGBFL0320_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0320_Srch01Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBFL0320_Prnt01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0320_Prnt01Caller<P extends MGBFP_CostReportPrnt, B extends MG_MGBFL0320_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MG_MGBFL0320_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Tgt_ym_fr, Tgt_ym_to));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setPRNTStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0320_Srch01();
	}

	@SuppressWarnings("rawtypes")//MCTableのジェネリクス
	@Override
	public MCTable getListRegTable() {
		return ReportTable;
	}

	@Override
	public void doTgt_no_bp_flg_NC(MCEventInfo info) {
		super.doTgt_no_bp_flg_NC(info);
		if (getTgtR().no_bp_flg()) {
			setValueEx(Tgt_bp_cd, null);
			setValueEx(Tgt_bp_nm, null);
		}
	}
	@Override
	public void doTgt_bp_cd_LC(MCEventInfo info) {
		super.doTgt_bp_cd_LC(info);
		if (!isNull(getTgtR().bp_cd()) || !isNull(getTgtR().bp_nm())) {
			getTgtR().no_bp_flg(false);
		}	
	}
	@Override
	public void doTgt_bp_nm_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doTgt_bp_nm_NC(info);
		if (!isNull(getTgtR().bp_nm())) {
			getTgtR().no_bp_flg(false);
		}
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		Ctrl_ctrl_PPanel.expand(false);
		TgtPanel.focusFirstComponent();
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getTgt_asst_typ_ListPutter().putBind(MAC_ASST_TYP.CO_PROD.key(), true);
		getTgt_asst_typ_ListPutter().putBind(MAC_ASST_TYP.CO_SLS.key(), true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

}