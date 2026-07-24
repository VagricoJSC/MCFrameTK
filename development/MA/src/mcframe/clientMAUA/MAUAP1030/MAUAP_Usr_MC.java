package mcframe.clientMAUA.MAUAP1030;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.UsrCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_Usr"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_Usr_MC extends MAUAP_Usr_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Usr_MC() {
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
	public MAUAP_Usr_MC(String name) {
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
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
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
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().usr_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().usr_cd(row.getStringNE($INPUT_VAL));
			}
		}
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				UsrCols.$i_referring_usr_acl_flg, UsrCols.$i_dt
		};
	}

	@Override
	public void doCnd_referring_usr_acl_flg_NC(MCEventInfo info) {
		if (getCndR().referring_usr_acl_flg()) {
			Cnd_dt.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cnd_dt);
		}
		
		super.doCnd_referring_usr_acl_flg_NC(info);
	}

	@Override
	public void doCnd_dt_NC(MCEventInfo info) {
		if (isNull(getCndR().dt())) {
			Cnd_dpt_cd.clear();
			Cnd_dpt_nm.clear();
			Cnd_aff_dpt_cd.clear();
			Cnd_aff_dpt_nm.clear();
			setDefaultMode(Cnd_dpt_cd);
			setDefaultMode(Cnd_dpt_nm);
			setDefaultMode(Cnd_aff_dpt_cd);
			setDefaultMode(Cnd_aff_dpt_nm);
		}
		else {
			Cnd_dpt_cd.setMode(MCMode.ENABLE);
			Cnd_dpt_nm.setMode(MCMode.ENABLE);
			Cnd_aff_dpt_cd.setMode(MCMode.ENABLE);
			Cnd_aff_dpt_nm.setMode(MCMode.ENABLE);
		}
		
		super.doCnd_dt_NC(info);
	}

}