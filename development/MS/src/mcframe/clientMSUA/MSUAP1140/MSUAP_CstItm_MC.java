package mcframe.clientMSUA.MSUAP1140;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;

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
 * 画面"MSUAP_CstItm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_CstItm_MC extends MSUAP_CstItm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_CstItm_MC() {
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
	public MSUAP_CstItm_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
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
	protected String[] getInitValueCols() {
		return new String[] {
				CstItmCols.$i_bp_cd,CstItmCols.$i_bp_nm,
				CstItmCols.$i_dt,
				CstItmCols.$i_itm_cd,CstItmCols.$i_itm_sub1,CstItmCols.$i_itm_sub2,CstItmCols.$i_itm_sub3,
				CstItmCols.$i_itm_nm,CstItmCols.$i_itm_typ,CstItmCols.$i_itm_typ_d_cd,CstItmCols.$i_itm_typ_d_nm,
				CstItmCols.$i_sundry_itm_flg_on,CstItmCols.$i_sundry_itm_flg_off,CstItmCols.$i_stk_mng_typ,CstItmCols.$i_asset_mng_typ,
				CstItmCols.$i_cst_itm_is_srch_typ
		};
	}
	
	@Override
	protected void checkForCallStack(mcframe.commonCore.notice.MCMessageList msgList) {
		super.checkForCallStack(msgList);

		msgList.addAll(checkAtLeastOne(Cnd_sundry_itm_flg_on, Cnd_sundry_itm_flg_off));
	}
	
	@Override
	public void valueInit() {
		super.valueInit();
		
		setSundryItmFlg();
		setBpCdDtMode();
		setSrchTypNm();
	}
	
	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row ,mode);
		if (row != null) {
			if (GET_LIST == mode) {
				getCndR().bp_itm_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().bp_itm_cd(row.getStringNE($INPUT_VAL));
			}
			setBpCdDtMode();
		}
		setSrchTypNm();
	}
	
	/**
	 * 得意先・リリース・適用日のデフォルトモードを設定する
	 */
	protected void setBpCdDtMode() {
		if (!isNull(getCndR().dt())) {
			Cnd_bp_cd.setMode(MCMode.READ_ONLY);
			Cnd_bp_nm.setMode(MCMode.READ_ONLY);
			Cnd_dt.setMode(MCMode.READ_ONLY);
			columnRslt_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bp_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(Cnd_bp_cd);
			setDefaultMode(Cnd_bp_nm);
			setDefaultMode(Cnd_dt);
			columnRslt_bp_cd.setMode(MCMode.READ_ONLY);
			columnRslt_bp_nm.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override
	protected void saveInitValue(MCRow row) {
		if (isNull(row.getStringNE(CstItmCols.$i_cst_itm_is_srch_typ))) {
			row.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
		}
		super.saveInitValue(row);
	}
	
	/**
	 * 諸口品ＦＬＧのデフォルト値を設定する
	 */
	protected void setSundryItmFlg() {
		getCndR().sundry_itm_flg_on(true);
		getCndR().sundry_itm_flg_off(true);
	}
	/**
	 * 検索区分を設定する
	 */
	protected void setSrchTypNm() {
		MAC_ITM_IS_SRCH_TYP.putNameNE(getCndR(), CndR.$cst_itm_is_srch_typ, CndR.$cst_itm_is_srch_typ_nm);
	}

}