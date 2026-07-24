package mcframe.clientMSUB.MSUBP0050;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_StkBp_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_StkBp_H_MC extends MSUBP_StkBp_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkBp_H_MC() {
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
	protected MSUBP_StkBp_H_MC(mcframe.clientMSUB.MSUBP0050.StkBpR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_StkBp START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_StkBp END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _stkIdTyp;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param stkIdTyp 在庫識別区分
	 */
	public void setRelateBeans(MCRowBeans stkIdTyp) {
		_stkIdTyp = stkIdTyp;
	}
	protected MCRowBeans getStkIdTyp() {
		return _stkIdTyp;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getStkIdTyp() != null) {
			((MCLCBeans) getStkIdTyp()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getStkIdTyp()) {
			doBeans_stk_id_typ_LC(info);
		}
	}

	/**
	 * 在庫識別区分が変更されたときに実行される。<br>
	 * <br>
	 * 在庫取引先をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_stk_id_typ_LC(MCEventInfo info) {
		setValueEx(StkBp_stk_bp_cd, null);

		setGUIMode();
	}

	// モード設定

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		
		setGUIMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		
		setGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		
		setGUIMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		
		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		
		setGUIMode();
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 変更内容：
	 * 在庫取引先部品が入力可能なモードでも、連携する在庫識別区分がnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == StkBp_stk_bp_cd && isDefaultModeEditable(compo)) {
			String typ = (String) getStkIdTyp().getRowValue();
			if (isNull(typ) || MSC_STK_ID_TYP.isCOSTK(typ)) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}
	
	@Override
	public MCList getStkBp_stk_bp_cd(MCRow row, MCEventInfo info) {

		// 入力補助画面を開かずに手入力したときに参照する動的なバインド値の設定
		setDynamicBind(row, info.getEventIndex());
		
		return super.getStkBp_stk_bp_cd(row, info);
	}

	@Override
	protected void setDynamicBind(MCRow bind, int eventIndex) {
		super.setDynamicBind(bind, eventIndex);

		bind.setValueNE(BpCols.$i_bp_is_srch_typ, getBpIsSrchTyp());
	}
	
	/**
	 * 取引先入力補助検索区分を取得する。
	 * 
	 * @return 取引先入力補助検索区分
	 */
	public String getBpIsSrchTyp() {
		if (getStkIdTyp() == null) {
			return null;
		}

		String typ = (String) getStkIdTyp().getRowValue();

		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(typ)
				|| MSC_STK_ID_TYP.isCSTSTK(typ)) {

			return MAC_BP_IS_SRCH_TYP.CST.value();

		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(typ)
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(typ)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(typ)
				|| MSC_STK_ID_TYP.isNCV_RCV(typ)
				|| MSC_STK_ID_TYP.isONR_PROV(typ)) {

			return MAC_BP_IS_SRCH_TYP.SPPL.value();

		}
		return MAC_BP_IS_SRCH_TYP.COMM.value();
	}

}