package mcframe.clientMSUA.MSUAP1020;

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
import mcframe.clientMAUB.MAUBP5320.*;
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
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.MfgInstNoCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_MfgInstNo"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_MfgInstNo_MC extends MSUAP_MfgInstNo_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_MfgInstNo_MC() {
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
	public MSUAP_MfgInstNo_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}


	@Override
	public void doCnd_mi_po_d_no_req_flg_NC(MCEventInfo info){
		if (getCndR().sav_flg()) {
			Cnd_mi_po_d_no.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cnd_mi_po_d_no);
		}
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);

		if (row != null) {
			if (GET_LIST == mode) {
				getCndR().mfg_inst_no_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().mfg_inst_no(row.getStringNE($INPUT_VAL));
			}
		};
		
		setCndMode();
	}

	
	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				MfgInstNoCols.$i_imi_mfg_mtd_typ, MfgInstNoCols.$i_sav_flg, MfgInstNoCols.$i_ord_flg, MfgInstNoCols.$i_stt_flg, MfgInstNoCols.$i_cmpl_flg,
				"mi_po_d_no","mi_po_d_no_req_flg"
		};
	}
	
	@Override
	public void valueInit() {
		super.valueInit();
		setCndMode();
	}
	
	
//	入力補助画面の起動時に引継がれた値によって検索条件の入力制御を行う。
	protected void setCndMode() {
		if (!isNull(getCndR().getStringNE(MfgInstNoCols.$i_imi_mfg_mtd_typ))) {
			Cnd_imi_mfg_mtd_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_imi_mfg_mtd_typ);
		}
		;

		if (!isNull(getCndR().getStringNE(MfgInstNoCols.$i_mi_po_d_no))) {
			Cnd_mi_po_d_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_mi_po_d_no);
		}
		;

		if (!getCndR().getBooleanNE(MfgInstNoCols.$i_sav_flg)) {
			Cnd_sav_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_sav_flg);
		}
		;
		if (!getCndR().getBooleanNE(MfgInstNoCols.$i_ord_flg)) {
			Cnd_ord_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_ord_flg);
		}
		;
		if (!getCndR().getBooleanNE(MfgInstNoCols.$i_stt_flg)) {
			Cnd_stt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_stt_flg);
		}
		;
		if (!getCndR().getBooleanNE(MfgInstNoCols.$i_cmpl_flg)) {
			Cnd_cmpl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_cmpl_flg);
		}
		;

	}
	
	@Override
	public void setOpenFocus() {
		// タブがある場合はこのメソッドを呼ばないとフィールドにフォーカスされない
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected void checkForCallStack(mcframe.commonCore.notice.MCMessageList msgList) {
		super.checkForCallStack(msgList);

		msgList.addAll(checkAtLeastOne(Cnd_sav_flg, Cnd_ord_flg, Cnd_stt_flg, Cnd_cmpl_flg));
	}

}