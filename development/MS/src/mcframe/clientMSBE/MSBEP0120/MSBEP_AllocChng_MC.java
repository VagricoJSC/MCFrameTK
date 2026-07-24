package mcframe.clientMSBE.MSBEP0120;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMSUB.MSUBP0040.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
 * 画面"MSBEP_AllocChng"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AllocChng_MC extends MSBEP_AllocChng_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocChng_MC() {
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
	public MSBEP_AllocChng_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0120_Srch01Caller<P extends MSBEP_AllocChng, B extends MS_MSBEL0120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down1().setValueNE(ShipAllocRsltR.$itm_cd, bridge.down0().itm_cd());
			bridge.down1().setValueNE(ShipAllocRsltR.$itm_sub1, bridge.down0().itm_sub1());
			bridge.down1().setValueNE(ShipAllocRsltR.$itm_sub2, bridge.down0().itm_sub2());
			bridge.down1().setValueNE(ShipAllocRsltR.$itm_sub3, bridge.down0().itm_sub3());
			bridge.down1().setValueNE(ShipAllocRsltR.$ver_flg, bridge.down0().ver_flg());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0120_Upd01Caller<P extends MSBEP_AllocChng, B extends MS_MSBEL0120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL0120_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		protected MCList<ShipAllocRsltR> _dtlLForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_dtlLForCall = getShipAllocRsltL().statusChangedList();
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 更新行のみ必須チェック対象にするため、superを呼ばない
			
			msgList.addAll(panel.checkReq(_dtlLForCall));
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().setAll(_dtlLForCall);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
			
		ShipSchdRslt_trd_unit_qty_p_PPanel.setRelateBeans(ShipSchdRslt_trd_unit_cd, ShipSchdRslt_trd_unit_dec_place);
		ShipSchdRslt_base_unit_qty_p_PPanel.setRelateBeans(ShipSchdRslt_base_unit_cd, ShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_alloc_qty_p_PPanel.setRelateBeans(ShipSchdRslt_base_unit_cd, ShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_wait_qty_p_PPanel.setRelateBeans(ShipSchdRslt_base_unit_cd, ShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_wait_rem_qty_p_PPanel.setRelateBeans(ShipSchdRslt_base_unit_cd, ShipSchdRslt_base_unit_dec_place);
		
		ShipAllocRslt_alloc_abl_qty_p_PPanel.setRelateBeans(columnShipAllocRslt_pack_unit_cd, columnShipAllocRslt_pack_unit_dec_place);
		ShipAllocRslt_alloc_chng_qty_p_PPanel.setRelateBeans(columnShipAllocRslt_pack_unit_cd, columnShipAllocRslt_pack_unit_dec_place);
		ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.setRelateBeans(columnShipAllocRslt_base_unit_cd, columnShipAllocRslt_base_unit_dec_place);
		ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.setRelateBeans(columnShipAllocRslt_base_unit_cd, columnShipAllocRslt_base_unit_dec_place);
		
		ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.setRelateBeans(
				columnShipAllocRslt_base_unit_cd, 
				columnShipAllocRslt_base_unit_dec_place, 
				columnShipAllocRslt_base_unit_rnd_typ, 
				columnShipAllocRslt_alloc_chng_qty, 
				columnShipAllocRslt_pack_unit_conv_base_qty, 
				columnShipAllocRslt_pack_unit_conv_qty);
		
		ShipSchdRslt_sno_p_PPanel.setEnableSnoNullFlg(true);
		
		ShipSchdRslt_ver_no_p_PPanel.setRelateBeans(
				ShipSchdRslt_itm_cd, 
				ShipSchdRslt_itm_sub1, 
				ShipSchdRslt_itm_sub2, 
				ShipSchdRslt_itm_sub3, 
				ShipSchdRslt_site_cd, 
				ShipSchdRslt_ver_flg);
		
		ShipAllocRslt_ver_no_p_PPanel.setRelateBeans(
				columnShipAllocRslt_itm_cd, 
				columnShipAllocRslt_itm_sub1, 
				columnShipAllocRslt_itm_sub2, 
				columnShipAllocRslt_itm_sub3, 
				columnShipAllocRslt_site_cd, 
				columnShipAllocRslt_ver_flg);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnShipAllocRslt_alloc_chng_qty.addLCListener(this);
	}
	
	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return ShipSchdRsltPanel;
	}

	@Override
	protected MCPanel getOpeHdrPanel() {
		return ShipSchdRsltPanel;
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnShipAllocRslt_alloc_chng_qty) {
			doShipAllocRslt_alloc_chng_qty_LC(info);
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 検索後ステータスを設定する。
	 */
	protected void setRefStatus() {
		
		if (Cnd_ope_CHNG.isSelected()) {
			
			setUPDStatus();
			
		}
		else if (Cnd_ope_REF.isSelected()) {
			
			setREFStatus();
		}
		
		ShipAllocRsltTable.adjustAllWidth();
	}
	
	/**
	 * 検索前ステータスを設定する。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_ope_CHNG.isSelected()) {
			
			setUPDStatus();
			CndPanel.focusFirstComponent();
		}
		else if (Cnd_ope_REF.isSelected()) {
			
			setREFStatus();
		}
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isSame(getStatus(), UPD) || isStatusNone(getShipAllocRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearContainers(getShipSchdRsltR(), getShipAllocRsltL());
		
		setSrchStatus();
	}
	
	/**
	 * 引当振替数量のListChangedイベント。
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_chng_qty_LC(MCEventInfo info) {
		
		ShipAllocRsltR shipAllocR = getShipAllocRsltL().get(info.getEventIndex());
		
		if (isNull(shipAllocR.alloc_chng_qty())) {
			
			shipAllocR.setStatus(Status.NONE);
		}
		
		setWaitRemQty();
	}
	
	/**
	 * 保留残数を設定する。
	 */
	protected void setWaitRemQty() {
		
		if (!getShipAllocRsltL().isEmpty()) {
			
			ShipSchdRslt_wait_rem_qty.setValue(
					MCNumber.sum(getShipSchdRsltR().base_unit_qty(), 
							getShipSchdRsltR().alloc_qty().negate(), 
							nvl(getShipAllocRsltL().sum(ShipAllocRsltR.$alloc_chng_base_unit_qty), MCNumber.ZERO).negate()));
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBEL0120_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL0120_Upd01();
	}

}