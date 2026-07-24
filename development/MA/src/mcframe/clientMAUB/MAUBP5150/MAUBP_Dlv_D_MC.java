package mcframe.clientMAUB.MAUBP5150;

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
import javax.swing.ToolTipManager;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Dlv_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Dlv_D_MC extends MAUBP_Dlv_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Dlv_D_MC() {
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
	public MAUBP_Dlv_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	boolean _tdlv_flg = false;
	
	public void setTdlvMode(boolean tdlv_flg) {
		_tdlv_flg = tdlv_flg;
		setComponentInvisibleAllStatus(columnDlv_pri_prnt_flg);
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
	 * Panel[Dlv]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doDlv_show_dtl(MCEventInfo info) {
		DlvR r = getDlvL().get(info.getEventIndex());
		if (r == null) {
			return;
		}
		DlvR tmpR = r.clone();
		tmpR.setStringNE("some_cd", tmpR.bp_cd());
		tmpR.setStringNE("some_nm", tmpR.bp_nm());
		tmpR.setStringNE("cntct_dpt", tmpR.dlv_cntct_dpt());
		tmpR.setStringNE("cntct_psn", tmpR.dlv_cntct_psn());
		openChildPanel("MA", "MAUBP0430", T1, tmpR, columnDlv_bp_cd, columnDlv_bp_nm);
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		// 部品の値を入力補助画面へ引き継ぐ
		bind.setValueNE(DlvR.$bp_nm, DlvTable.getValue(eventIndex, columnDlv_bp_nm));
		bind.setValueNE(DlvR.$dlv_sundry_flg, DlvTable.getValue(eventIndex, columnDlv_dlv_sundry_flg));
		bind.setValueNE(DlvR.$pri_prnt_flg, DlvTable.getValue(eventIndex, columnDlv_pri_prnt_flg));
		bind.setValueNE(DlvR.$zip_cd, DlvTable.getValue(eventIndex, columnDlv_zip_cd));
		bind.setValueNE(DlvR.$addr1, DlvTable.getValue(eventIndex, columnDlv_addr1));
		bind.setValueNE(DlvR.$addr2, DlvTable.getValue(eventIndex, columnDlv_addr2));
		bind.setValueNE(DlvR.$addr3, DlvTable.getValue(eventIndex, columnDlv_addr3));
		bind.setValueNE(DlvR.$addr4, DlvTable.getValue(eventIndex, columnDlv_addr4));
		bind.setValueNE(DlvR.$cntry_cd, DlvTable.getValue(eventIndex, columnDlv_cntry_cd));
		bind.setValueNE(DlvR.$cntry_nm, DlvTable.getValue(eventIndex, columnDlv_cntry_nm));
		bind.setValueNE(DlvR.$tel, DlvTable.getValue(eventIndex, columnDlv_tel));
		bind.setValueNE(DlvR.$fax, DlvTable.getValue(eventIndex, columnDlv_fax));
		bind.setValueNE(DlvR.$dlv_cntct_dpt, DlvTable.getValue(eventIndex, columnDlv_dlv_cntct_dpt));
		bind.setValueNE(DlvR.$dlv_cntct_psn, DlvTable.getValue(eventIndex, columnDlv_dlv_cntct_psn));

		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}
	
	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isSame(getStatus(), ENABLE) || isSame(getStatus(), REQUIRED)) {
			DlvR r = getDlvL().get(index);
			if (!r.dlv_sundry_flg()) {
				if (column == columnDlv_bp_nm
						|| column == columnDlv_lg_grp_cd
						|| column == columnDlv_zip_cd
						|| column == columnDlv_addr1
						|| column == columnDlv_addr2
						|| column == columnDlv_addr3
						|| column == columnDlv_addr4
						|| column == columnDlv_cntry_cd
						|| column == columnDlv_tel
						|| column == columnDlv_fax
						|| column == columnDlv_dlv_cntct_dpt
						|| column == columnDlv_dlv_cntct_psn
						) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getCellMode(index, column);
	}

}