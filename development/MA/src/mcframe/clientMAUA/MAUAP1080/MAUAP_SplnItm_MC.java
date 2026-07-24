package mcframe.clientMAUA.MAUAP1080;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5170.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.SplnItmCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_SplnItm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_SplnItm_MC extends MAUAP_SplnItm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_SplnItm_MC() {
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
	public MAUAP_SplnItm_MC(String name) {
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
		Rslt_itm_grp_p_PPanel.afterCallParts_sub();
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
	public void setOpenFocus() {
		// タブがある場合はこのメソッドを呼ばないとフィールドにフォーカスされない
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				SplnItmCols.$i_mode_nullval_flg
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();

		setItmGrpFlg();
		setItmGrpCdNmMode();
	}

	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().spln_itm_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().spln_itm_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setItmGrpFlg();
		setItmGrpCdNmMode();
	}

	/**
	 * 品目分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setItmGrpFlg() {
		getCndR().itm_grp_flg1(false);
		getCndR().itm_grp_flg2(false);
		getCndR().itm_grp_flg3(false);
		getCndR().itm_grp_flg4(false);
		getCndR().itm_grp_flg5(false);
		getCndR().itm_grp_flg6(false);
		getCndR().itm_grp_flg7(false);
		getCndR().itm_grp_flg8(false);
		getCndR().itm_grp_flg9(false);
		getCndR().itm_grp_flg10(false);
	}

	/**
	 * 品目分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setItmGrpCdNmMode() {
		setItmGrpCdNmMode(Cnd_itm_grp_cd1, Cnd_itm_grp_nm1, getCndR().itm_grp_flg1());
		setItmGrpCdNmMode(Cnd_itm_grp_cd2, Cnd_itm_grp_nm2, getCndR().itm_grp_flg2());
		setItmGrpCdNmMode(Cnd_itm_grp_cd3, Cnd_itm_grp_nm3, getCndR().itm_grp_flg3());
		setItmGrpCdNmMode(Cnd_itm_grp_cd4, Cnd_itm_grp_nm4, getCndR().itm_grp_flg4());
		setItmGrpCdNmMode(Cnd_itm_grp_cd5, Cnd_itm_grp_nm5, getCndR().itm_grp_flg5());
		setItmGrpCdNmMode(Cnd_itm_grp_cd6, Cnd_itm_grp_nm6, getCndR().itm_grp_flg6());
		setItmGrpCdNmMode(Cnd_itm_grp_cd7, Cnd_itm_grp_nm7, getCndR().itm_grp_flg7());
		setItmGrpCdNmMode(Cnd_itm_grp_cd8, Cnd_itm_grp_nm8, getCndR().itm_grp_flg8());
		setItmGrpCdNmMode(Cnd_itm_grp_cd9, Cnd_itm_grp_nm9, getCndR().itm_grp_flg9());
		setItmGrpCdNmMode(Cnd_itm_grp_cd10, Cnd_itm_grp_nm10, getCndR().itm_grp_flg10());
	}

	/**
	 * 品目分類フラグの値に応じて、品目分類ＣＤ・名のデフォルトモードを設定する
	 * @param cdBeans 品目分類ＣＤの部品
	 * @param nmBeans 品目分類名の部品
	 * @param flg 品目分類フラグの値(true/false)
	 */
	protected void setItmGrpCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
		if (flg) {
			setDefaultMode(cdBeans);
			setDefaultMode(nmBeans);
		}
		else {
			cdBeans.setMode(MCMode.READ_ONLY);
			nmBeans.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

}