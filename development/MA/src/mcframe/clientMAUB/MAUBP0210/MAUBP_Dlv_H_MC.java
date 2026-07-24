package mcframe.clientMAUB.MAUBP0210;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.LinkedHashMap;

import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW.ISPanelLinker;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;

import javax.swing.ToolTipManager;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Dlv_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Dlv_H_MC extends MAUBP_Dlv_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Dlv_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Dlv_H_MC(mcframe.clientMAUB.MAUBP0210.DlvR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Dlv START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Dlv END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	boolean _tdlv_flg = false;
	
	public void setTdlvMode(boolean tdlv_flg) {
		_tdlv_flg = tdlv_flg;
		setComponentInvisibleAllStatus(Dlv_pri_prnt_flg);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		if (_tdlv_flg) {
			getDlv_bp_cd_ListPutter().putBind(BpCols.$i_bp_is_srch_typ , MAC_BP_IS_SRCH_TYP.TDLV.value()); 
		}
		else {
			getDlv_bp_cd_ListPutter().putBind(BpCols.$i_bp_is_srch_typ , MAC_BP_IS_SRCH_TYP.DLV.value()); 
		}
	}

	/**
	 * 納品先諸口ＦＬＧが変更されたときに実行される。<br>
	 * <br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 */
	@Override
	public void doDlv_dlv_sundry_flg_NC(MCEventInfo info) {
		setGUIMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		
		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		
		setGUIMode();
	}
	
	/**
	 * Panel[Dlv]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doDlv_show_dtl(MCEventInfo info) {
		DlvR tmpR = getDlvR().clone();
		tmpR.setStringNE("some_cd", tmpR.bp_cd());
		tmpR.setStringNE("some_nm", tmpR.bp_nm());
		tmpR.setStringNE("cntct_dpt", tmpR.dlv_cntct_dpt());
		tmpR.setStringNE("cntct_psn", tmpR.dlv_cntct_psn());
		openChildPanel("MA", "MAUBP0430", T1, tmpR, Dlv_bp_cd, Dlv_bp_nm);
	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		// 部品の値を入力補助画面へ引き継ぐ
		bind.setStringNE(DlvR.$bp_nm, Dlv_bp_nm.getValue());
		bind.setBooleanNE(DlvR.$dlv_sundry_flg, Dlv_dlv_sundry_flg.getValue());
		bind.setBooleanNE(DlvR.$pri_prnt_flg, Dlv_pri_prnt_flg.getValue());
		bind.setStringNE(DlvR.$zip_cd, Dlv_zip_cd.getValue());
		bind.setStringNE(DlvR.$addr1, Dlv_addr1.getValue());
		bind.setStringNE(DlvR.$addr2, Dlv_addr2.getValue());
		bind.setStringNE(DlvR.$addr3, Dlv_addr3.getValue());
		bind.setStringNE(DlvR.$addr4, Dlv_addr4.getValue());
		bind.setStringNE(DlvR.$cntry_cd, Dlv_cntry_cd.getValue());
		bind.setStringNE(DlvR.$cntry_nm, Dlv_cntry_nm.getValue());
		bind.setStringNE(DlvR.$tel, Dlv_tel.getValue());
		bind.setStringNE(DlvR.$fax, Dlv_fax.getValue());
		bind.setStringNE(DlvR.$dlv_cntct_dpt, Dlv_dlv_cntct_dpt.getValue());
		bind.setStringNE(DlvR.$dlv_cntct_psn, Dlv_dlv_cntct_psn.getValue());

		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (isSame(getStatus(), ENABLE) || isSame(getStatus(), REQUIRED)) {
			if (!getDlvR().dlv_sundry_flg()) {
				if (compo == Dlv_bp_nm
						|| compo == Dlv_lg_grp_cd
						|| compo == Dlv_zip_cd
						|| compo == Dlv_addr1
						|| compo == Dlv_addr2
						|| compo == Dlv_addr3
						|| compo == Dlv_addr4
						|| compo == Dlv_cntry_cd
						|| compo == Dlv_tel
						|| compo == Dlv_fax
						|| compo == Dlv_dlv_cntct_dpt
						|| compo == Dlv_dlv_cntct_psn
						) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getGUIMode(compo);
	}

}