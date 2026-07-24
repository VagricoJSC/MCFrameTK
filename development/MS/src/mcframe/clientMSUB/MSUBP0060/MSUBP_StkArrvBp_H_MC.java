package mcframe.clientMSUB.MSUBP0060;

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
 * 画面"MSUBP_StkArrvBp_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_StkArrvBp_H_MC extends MSUBP_StkArrvBp_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkArrvBp_H_MC() {
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
	protected MSUBP_StkArrvBp_H_MC(mcframe.clientMSUB.MSUBP0060.StkArrvBpR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_StkArrvBp START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_StkArrvBp END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _loc;
	protected MCRowBeans _sppl;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param loc 場所ＣＤ
	 * @param sppl 発注先ＣＤ
	 */
	public void setRelateBeans(MCRowBeans loc, MCRowBeans sppl) {
		_loc = loc;
		_sppl = sppl;
	}
	protected MCRowBeans getLoc() {
		return _loc;
	}
	protected MCRowBeans getSppl() {
		return _sppl;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getLoc() != null) {
			((MCLCBeans) getLoc()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getLoc()) {
			doBeans_loc_cd_LC(info);
		}
	}

	/**
	 * 場所ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 在庫着荷先をクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_loc_cd_LC(MCEventInfo info) {
		setValueEx(StkArrvBp_stk_arrv_bp_cd, null);

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
	 * 在庫着荷先部品が入力可能なモードでも、連携する場所ＣＤがnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == StkArrvBp_stk_arrv_bp_cd && isDefaultModeEditable(compo)) {
			if (isNull(getLoc().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}
	
	@Override
	public MCList getStkArrvBp_stk_arrv_bp_cd(MCRow row, MCEventInfo info) {

		// 入力補助画面を開かずに手入力したときに参照する動的なバインド値の設定
		setDynamicBind(row, info.getEventIndex());

		return super.getStkArrvBp_stk_arrv_bp_cd(row, info);
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

		if (getLoc() == null || isNull(getLoc().getRowValue()) || getSppl() == null) {
			return null;
		}

		String cd = (String) getSppl().getRowValue();

		// 自社場所
		if (isNull(cd)) {
			return MAC_BP_IS_SRCH_TYP.DLV.value();
		}
		// 外注場所
		else {
			return MAC_BP_IS_SRCH_TYP.SPPL.value();
		}
	}

}