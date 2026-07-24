package mcframe.clientMGUA.MGUAP1010;

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
import mcframe.clientMAUB.MAUBP0240.*;

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
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.CalcNoCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGUAP_CalcNoSrc"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGUAP_CalcNoSrc_MC extends MGUAP_CalcNoSrc_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGUAP_CalcNoSrc_MC() {
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
	public MGUAP_CalcNoSrc_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

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
	protected String[] getInitValueCols() {
		return new String[] {
				CalcNoCols.$i_calc_no, CalcNoCols.$i_calc_grp_cd,
				CalcNoCols.$i_calc_grp_nm
		};
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);
		if (row != null) {
			if(GET_LIST == mode){
				getCndR().calc_no_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().calc_no(row.getStringNE($INPUT_VAL));
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_term_p_PPanel.setDefault(false);
	}

	@Override
	public boolean doCnd_y_fr_VC(MCEventInfo info) {
		if (!super.doCnd_y_fr_VC(info)) {
			return false;
		}
		return checkYear((MCNumber)info.getNewValue());
	}

	@Override
	public boolean doCnd_y_to_VC(MCEventInfo info) {
		if (!super.doCnd_y_to_VC(info)) {
			return false;
		}
		return checkYear((MCNumber)info.getNewValue());
	}

	/**
	 * 年を表す数値として妥当かどうかを判断する。
	 * nullの場合はtrueを返す。
	 *
	 * @param year
	 * @return
	 */
	protected boolean checkYear(MCNumber year) {
		if (year == null) {
			return true;
		}
		if (year.lt(1900)) {
			return false;
		}
		if (year.gt(3000)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean doCnd_m_fr_VC(MCEventInfo info) {
		if (!super.doCnd_m_fr_VC(info)) {
			return false;
		}
		return checkMonth((MCNumber)info.getNewValue());
	}

	@Override
	public boolean doCnd_m_to_VC(MCEventInfo info) {
		if (!super.doCnd_m_to_VC(info)) {
			return false;
		}
		return checkMonth((MCNumber)info.getNewValue());
	}

	/**
	 * 月を表す数値として妥当かどうかを判断する。
	 * nullの場合はtrueを返す。
	 *
	 * @param mon
	 * @return
	 */
	protected boolean checkMonth(MCNumber mon) {
		if (mon == null) {
			return true;
		}
		if (mon.lt(1)) {
			return false;
		}
		if (mon.gt(12)) {
			return false;
		}
		return true;
	}

	@Override
	protected void checkForCallStack(MCMessageList msgList) {
		super.checkForCallStack(msgList);
		msgList.addAll(checkSmallLarge(Cnd_y_fr, Cnd_y_to));
		msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
	}

}