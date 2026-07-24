package mcframe.clientMSBB.MSBBP1240;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5400.*;

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
import java.util.Map;
import java.util.HashMap;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_DlvInstRcptReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_DlvInstRcptReg_MC extends MSBBP_DlvInstRcptReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 受注明細ＮＯと出荷予定を格納するマップ
	 */
	protected Map<String, MCList<ShipSchdRsltR>> _sloShipSchdMap = new HashMap<String, MCList<ShipSchdRsltR>>();
	
	/**
	 * 受注明細ＮＯと納入指示受領を格納するマップ
	 */
	protected Map<String, MCList<DlvInstRcptRsltR>> _sloDlvInstRcptMap = new HashMap<String, MCList<DlvInstRcptRsltR>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_DlvInstRcptReg_MC() {
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
	public MSBBP_DlvInstRcptReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1240_Srch01Caller<P extends MSBBP_DlvInstRcptReg, B extends MS_MSBBL1240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1240_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		public boolean isDownBlockChanged() {
			
			if (Cnd_ope_UPD.isSelected()) {
				
				boolean isChanged = super.isDownBlockChanged();
				
				if (isChanged) {
					return true;
				}
				else {
					return isChanged();
				}
			}
			else {
				return false;
			}
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			clearAll();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(checkAtLeastOne(SlsStsTypPanel));
			msgList.addAll(checkAtLeastOne(EdiPanel));
			msgList.addAll(checkBeforeAfter(Cnd_slo_dt_fr, Cnd_slo_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_dlv_inst_rcpt_dt_fr, Cnd_dlv_inst_rcpt_dt_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			
			setSloShipSchdMap(bridge.down0(), bridge.down1());
			setSloDlvInstRcptMap(bridge.down0(), bridge.down2());
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			SloRsltTable.selectLeftmostColumn(0);
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
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			
			_sloShipSchdMap.clear();
			_sloDlvInstRcptMap.clear();
		}
	}

	/**
	 * [MS_MSBBL1240_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1240_Upd01Caller<P extends MSBBP_DlvInstRcptReg, B extends MS_MSBBL1240_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<DlvInstRcptRsltR> _dlvInstRcptLForCall = null;
				
		protected MS_MSBBL1240_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_dlvInstRcptLForCall = MCList.create(DlvInstRcptRsltR.class);
			
			for (Comparable<String> key : _sloDlvInstRcptMap.keySet()) {
				if (!isNull(key)){
					_dlvInstRcptLForCall.addAll(exceptGuiCreate(_sloDlvInstRcptMap.get(key)));
				}
			}
			MAUCP_DateUtil.setYmdHm(_dlvInstRcptLForCall, DlvInstRcptRsltR.$dlv_rqst_dt, DlvInstRcptRsltR.$dlv_rqst_hm);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up0().setAll(_dlvInstRcptLForCall);
		}
		
		@Override
		protected boolean checkForCall() {
			
			boolean chkRslt = super.checkForCall();
			
			if (!chkRslt) {
				return chkRslt;
			}
			
			int index = SloRsltTable.getMCSelectedRow();
			MCColumnConfig colConfig = SloRsltTable.getLastSelectedColumnConfig();
			
			for (SloRsltR sloR: getSloRsltL()) {
				
				if (colConfig != null) {
					SloRsltTable.focusCellAt(sloR.getGUIIndex(), colConfig);
				}
				else {
					SloRsltTable.selectRowNoFocus(sloR.getGUIIndex());
				}
				
				chkRslt = super.checkForCall();
				
				if (!chkRslt) {
					return chkRslt;
				}
			}
			
			if (colConfig != null) {
				SloRsltTable.focusCellAt(index, colConfig);
			}
			else {
				SloRsltTable.selectRowNoFocus(index);
			}
			
			return chkRslt;
		}
		
		@Override
		protected void checkReqSub(MCMessageList msgList, MCContainer c) {
			
			if (c == DlvInstRcptRsltTable.getList()) {
				
				super.checkReqSub(msgList, exceptGuiCreate(DlvInstRcptRsltTable.getList()));
			}
			else {
				
				super.checkReqSub(msgList, c);
			}
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			
			return true;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
		
		@Override
		protected void show() {
			
			// 納入指示受領のマージ
			for (DlvInstRcptRsltR down0R : bridge.down0()) {
				
				MCList<DlvInstRcptRsltR> dlvInstRcptL = _sloDlvInstRcptMap.get(down0R.slo_d_no());
				DlvInstRcptRsltR dlvInstRcptR = dlvInstRcptL.getFirst(DlvInstRcptRsltR.$param_row_index, down0R.param_row_index());
				
				merge(dlvInstRcptR, down0R, getDownItemNames(0));
			}
			
			// 出荷予定のマージ
			mergeSloShipSchdMap(getSloRsltL(), bridge.down1());
			
			SloRsltR sloR = SloRsltTable.getSelectedMCRow();
			
			getDlvInstRcptRsltL().setAll(_sloDlvInstRcptMap.get(sloR.slo_d_no()));
			
			getShipSchdRsltL().setAll(_sloShipSchdMap.get(sloR.slo_d_no()));
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		SloRslt_trd_unit_qty_p_PPanel.setRelateBeans(columnSloRslt_trd_unit_cd, columnSloRslt_trd_unit_dec_place);
		SloRslt_base_unit_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_prms_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_dlv_inst_rcpt_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_dlv_inst_prms_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_alloc_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_wait_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_ship_inst_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_ship_act_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_iv_schd_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_iv_act_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_sls_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_ship_ret_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_re_ship_schd_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_ship_schd_abort_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);
		SloRslt_sls_schd_abort_qty_p_PPanel.setRelateBeans(columnSloRslt_base_unit_cd, columnSloRslt_base_unit_dec_place);

		ShipSchdRslt_trd_unit_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_trd_unit_cd, columnShipSchdRslt_trd_unit_dec_place);
		ShipSchdRslt_base_unit_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_alloc_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_wait_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_ship_inst_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_ship_act_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_iv_schd_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_iv_act_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_sls_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_ship_ret_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);
		ShipSchdRslt_abort_qty_p_PPanel.setRelateBeans(columnShipSchdRslt_base_unit_cd, columnShipSchdRslt_base_unit_dec_place);

		DlvInstRcptRslt_trd_unit_qty_p_PPanel.setRelateBeans(columnDlvInstRcptRslt_trd_unit_cd, columnDlvInstRcptRslt_trd_unit_dec_place);
		DlvInstRcptRslt_base_unit_qty_p_PPanel.setRelateBeans(
				columnDlvInstRcptRslt_base_unit_cd, 
				columnDlvInstRcptRslt_base_unit_dec_place, 
				columnDlvInstRcptRslt_base_unit_rnd_typ, 
				columnDlvInstRcptRslt_trd_unit_qty, 
				columnDlvInstRcptRslt_trd_unit_conv_base_qty, 
				columnDlvInstRcptRslt_trd_unit_conv_qty);
		DlvInstRcptRslt_dlv_p_PPanel.setRelateBeans(columnSloRslt_cst_cd);
		DlvInstRcptRslt_tdlv_p_PPanel.setTdlvMode(true);
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDlvInstRcptRslt_dlv_cd || beans == columnDlvInstRcptRslt_tdlv_cd) {
			setSloDtBind(row);
		}
		return row;
	}
	
	protected void setSloDtBind(MCRow bind) {
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		bind.setDateNE(BpCols.$i_dt, sloR.slo_dt());
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnDlvInstRcptRslt_dlv_cd.addLCListener(this);
		columnDlvInstRcptRslt_tdlv_cd.addLCListener(this);
		
		getDlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter().setColumns(
				DayWeekTypCols.$o_day_week_typ_nm, DayWeekTypCols.$o_day_week_typ);
	}
	
	@Override
	public MCList<?> getListForIS(MCEventBeans compo, MCRow row, MCEventInfo info) {
		if (compo == columnDlvInstRcptRslt_dlv_cd && compo instanceof MCLinkBeans) {
			setSloDtBind(row);
			return super.getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd(
					getBindRowForISCustom(row, (MCLinkBeans) compo,info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}
	
	@Override
	public MCList<?> getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		row.setStringNE(BpCols.$i_cst_cd, sloR.cst_cd());
		row.setDateNE(BpCols.$i_dt, sloR.slo_dt());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public MCList<?> getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		row.setDateNE(BpCols.$i_dt, sloR.slo_dt());
		return super.getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 初期化処理を行う。
	 */
	protected void valueInitSub() {
		
		setBoolean(SlsStsTypPanel, false);
		Cnd_slo_flg.setValue(true);
		Cnd_prms_flg.setValue(true);
		Cnd_dlv_inst_rcpt_flg.setValue(true);
		Cnd_dlv_inst_prms_flg.setValue(true);
		Cnd_sls_flg.setValue(true);
		
		if (Cnd_ope_REF.isSelected()) {
			Cnd_edi_flg.setValue(true);
		}
		else {
			Cnd_edi_flg.setValue(false);
		}
		Cnd_not_edi_flg.setValue(true);
	}
	
	/**
	 * 画面をクリアする。
	 */
	protected void clearAll() {
		
		clearContainers(getSloRsltL(),
				getShipSchdRsltL(),
				getDlvInstRcptRsltL());
		
		_sloShipSchdMap.clear();
		_sloDlvInstRcptMap.clear();
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getDlvInstRcptRsltL()) {
			
			list.add(DlvInstRcptRsltR.$edi_flg);
			list.add(DlvInstRcptRsltR.$dlv_inst_rcpt_no);
			list.add(DlvInstRcptRsltR.$dlv_inst_rcpt_rev);
			
			list.remove(DlvInstRcptRsltR.$ship_pr_upd_cntr);
			list.remove(DlvInstRcptRsltR.$slo_upd_cntr);
		}

		return list;
	}
	
	/**
	 * 検索後ステータスを設定する。
	 */
	protected void setRefStatus() {
		
		if (Cnd_ope_UPD.isSelected()) {
			
			setUPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			
			setREFStatus();
		}
		
		Ctrl_ctrl_PPanel.expand(false);
		
		// 出荷予定枠、納入指示受領枠の領域を2行確保する
		getSplitPane(SloPanel).setDividerLocation(0.48);
		getSplitPane(ShipSchdPanel).setDividerLocation(0.40);
		getSplitPane(DlvInstRcptPanel).setDividerLocation(0.45);
	}
	
	/**
	 * 検索前ステータスを設定する。
	 */
	protected void setSrchStatus() {
			
		setSRCHStatus();
		
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearContainers(getSloRsltL(), getShipSchdRsltL(), getDlvInstRcptRsltL());
		
		_sloShipSchdMap.clear();
		
		_sloDlvInstRcptMap.clear();
		
		valueInitSub();
		
		setSrchStatus();
	}
	
	@Override
	public void doSloRslt_NC(MCEventInfo info) {
		super.doSloRslt_NC(info);

		SloRsltR sloR = SloRsltTable.getSelectedMCRow();

		clearContainers(getShipSchdRsltL(), getDlvInstRcptRsltL());
		
		if (!isNull(sloR) && !sloR.isEmpty()) {
			
			setDlvInstRcptBtnMode(sloR);
			
			MCList<ShipSchdRsltR> shipSchdL = _sloShipSchdMap.get(sloR.slo_d_no());
			getShipSchdRsltL().setAll(shipSchdL);
			
			ShipSchdRsltTable.selectLeftmostColumn(0);
			ShipSchdRsltTable.adjustAllWidth();
			
			MCList<DlvInstRcptRsltR> dlvInstRcptL = _sloDlvInstRcptMap.get(sloR.slo_d_no());
			getDlvInstRcptRsltL().setAll(dlvInstRcptL);
			
			if (isUPDStatus(getStatus()) && !MAC_SHIP_INST_TYP.isNO_PICK(sloR.ship_inst_typ())) {
				
				DlvInstRcptRsltTable.fillSpace();
				for (DlvInstRcptRsltR recptR : getDlvInstRcptRsltL()) {
					
					setRcptDefValue(recptR, sloR);
				}
			}
			
			replaceSloDlvInstRcptMap(sloR);
			
			DlvInstRcptRsltTable.selectLeftmostColumn(0);
			DlvInstRcptRsltTable.adjustAllWidth();
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnDlvInstRcptRslt_dlv_cd) doDlvInstRcptRslt_dlv_cd_LC(info);
		if (lc == columnDlvInstRcptRslt_tdlv_cd) doDlvInstRcptRslt_tdlv_cd_LC(info);
	}
	
	/**
	 * 明細の配送先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doDlvInstRcptRslt_tdlv_cd_LC(MCEventInfo info) {
		
		DlvInstRcptRsltR r = getDlvInstRcptRsltL().get(info.getEventIndex());
		
		setViaDlvTyp(r, r.mst_via_dlv_typ(), info.getEventIndex());
	}
	
	/**
	 * 得意先のインボイス対象取引がオフの場合は、配送先を入力しても、全明細の配送先経由区分を「経由しない」で固定する。
	 * 手配区分が仕入直送の場合も同様。
	 * @param dtlR 納入指示受領明細
	 * @param viaDlvtyp 配送先経由区分
	 * @param index インデックス
	 */
	protected void setViaDlvTyp(DlvInstRcptRsltR dtlR, String viaDlvtyp, int index) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		if (isNull(dtlR.tdlv_cd())) {
			dtlR.mst_via_dlv_typ(null);
			setValueEx(columnDlvInstRcptRslt_via_dlv_typ, index, null);
		}
		else {
			if (!sloR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(sloR.proc_typ())) {
				setValueEx(columnDlvInstRcptRslt_via_dlv_typ, index, MAC_VIA_DLV_TYP.NOT_VIA.value());
			}
			else {
				setValueEx(columnDlvInstRcptRslt_via_dlv_typ, index, viaDlvtyp);
			}
		}
	}
	
	@Override
	public void doDlvInstRcptRslt_via_dlv_typ_LC(MCEventInfo info) {
		super.doDlvInstRcptRslt_via_dlv_typ_LC(info);
		
		DlvInstRcptRsltR r = getDlvInstRcptRsltL().get(info.getEventIndex());
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()) 
				|| (isNull(r.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(sloR.via_dlv_typ()))) {
			setValueEx(columnDlvInstRcptRslt_dlv_day_week_typ_nm, info.getEventIndex(), null);
		}
	}
	
	/**
	 * 明細の納品先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doDlvInstRcptRslt_dlv_cd_LC(MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		if (MAC_TRD_PTN_TYP.isSHIP(sloR.trd_ptn_typ())
				|| sloR.vmi_flg()) {
			
			setValueEx(columnDlvInstRcptRslt_pri_prnt_flg, info.getEventIndex(), false);
		}
	}
	
	@Override
	public boolean isChanged() {
		
		boolean isChangedFlg = super.isChanged();
		
		if (isChangedFlg) {
			return isChangedFlg;
		}
		
		MCColumnConfig colConfig = SloRsltTable.getLastSelectedColumnConfig();
		
		for (SloRsltR sloR: getSloRsltL()) {
			
			if (colConfig != null) {
				SloRsltTable.focusCellAt(sloR.getGUIIndex(), colConfig);
			}
			else {
				SloRsltTable.selectRowNoFocus(sloR.getGUIIndex());
			}
			
			if (UPD == getStatus() && !getDlvInstRcptRsltL().isStatusNone()) {
				isChangedFlg = true;
			}
			
			if (isChangedFlg) {
				break;
			}
		}
		
		return isChangedFlg;
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1240_Srch01();
	}
	
	/**
	 * Panel[DlvInstRcptBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDlvInstRcptBtn_radd(MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		if (sloR == null) {
			dialog(msgNoSelectedRow());
			return;
		}
			
		DlvInstRcptRsltR insR = insertRow(DlvInstRcptRsltTable);
		
		setRcptDefValue(insR, sloR);
		
		replaceSloDlvInstRcptMap(sloR);
		
		DlvInstRcptRsltTable.adjustWidth();
	}
	
	/**
	 * Panel[DlvInstRcptBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDlvInstRcptBtn_rdel(MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		deleteRow(DlvInstRcptRsltTable);
		
		replaceSloDlvInstRcptMap(sloR);
	}
	
	/**
	 * Panel[DlvInstRcptBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDlvInstRcptBtn_rcopy(MCEventInfo info) {
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		DlvInstRcptRsltR srcR = DlvInstRcptRsltTable.getSelectedMCRow();
		DlvInstRcptRsltR dlvInstRcptRsltR = copyRow(DlvInstRcptRsltTable);
		
		if (!isNull(dlvInstRcptRsltR) && !dlvInstRcptRsltR.isEmpty()) {
			
			if (srcR.isStatusGUICreate()) {
				dlvInstRcptRsltR.setStatus(Status.GUICREATE);
			}
		}
		
		replaceSloDlvInstRcptMap(sloR);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1230(MCEventInfo info) {
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		if (sloR == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
		aso.putCnd(crtOpenMSBBP1230CndR(aso));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 販売納期調整画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1230.CndR crtOpenMSBBP1230CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = (mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();
		
		SloRsltR sloR = SloRsltTable.getSelectedMCRow();
		
		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.slo_no(sloR.slo_no());
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1240_Upd01();
	}
	
	/**
	 * 納入指示受領のボタンの制御を行う。
	 * @param sloR 受注明細
	 */
	protected void setDlvInstRcptBtnMode(SloRsltR sloR) {
		
		if (isUPDStatus(getStatus()) && MAC_SHIP_INST_TYP.isNO_PICK(sloR.ship_inst_typ())) {
			
			DlvInstRcptBtn_radd.setMode(MCMode.DISABLE);
			DlvInstRcptBtn_rdel.setMode(MCMode.DISABLE);
			DlvInstRcptBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(DlvInstRcptBtn_radd);
			setDefaultMode(DlvInstRcptBtn_rdel);
			setDefaultMode(DlvInstRcptBtn_rcopy);
		}
	}
	
	/**
	 * 納入指示受領の初期値を設定する。
	 * @param dlvInstRcptR 納入指示受領
	 * @param sloR 受注
	 */
	protected void setRcptDefValue(DlvInstRcptRsltR dlvInstRcptR, SloRsltR sloR) {
		
		if (dlvInstRcptR.isStatusGUICreate()) {
			
			dlvInstRcptR.slo_d_no(sloR.slo_d_no());
			dlvInstRcptR.trd_unit_cd(sloR.trd_unit_cd());
			dlvInstRcptR.trd_unit_nm(sloR.trd_unit_nm());
			dlvInstRcptR.trd_unit_dec_place(sloR.trd_unit_dec_place());
			dlvInstRcptR.trd_unit_conv_base_qty(sloR.trd_unit_conv_base_qty());
			dlvInstRcptR.trd_unit_conv_qty(sloR.trd_unit_conv_qty());
			dlvInstRcptR.base_unit_cd(sloR.base_unit_cd());
			dlvInstRcptR.base_unit_nm(sloR.base_unit_nm());
			dlvInstRcptR.base_unit_dec_place(sloR.base_unit_dec_place());
			dlvInstRcptR.base_unit_rnd_typ(sloR.base_unit_rnd_typ());
			dlvInstRcptR.ship_pr_upd_cntr(sloR.ship_pr_upd_cntr());
			dlvInstRcptR.slo_upd_cntr(sloR.slo_upd_cntr());
		}
	}
	
	/**
	 * 受注明細に紐付く出荷予定情報をマップに格納する。
	 * @param sloL 受注明細リスト
	 * @param shipSchdL 受注納期回答リスト
	 */
	protected void mergeSloShipSchdMap(MCList<SloRsltR> sloL, MCList<ShipSchdRsltR> shipSchdL) {
		
		MCIndexKey idxkey = shipSchdL.createIndex(ShipSchdRsltR.$slo_d_no);
		
		for (SloRsltR sloR : sloL) {
			
			MCList<ShipSchdRsltR> newShipSchdL = shipSchdL.subList(idxkey, sloR.slo_d_no());
			
			if (!isNull(newShipSchdL) && !newShipSchdL.isEmpty()) {
				_sloShipSchdMap.put(sloR.slo_d_no(), newShipSchdL);
			}
		}
	}
	
	/**
	 * 受注明細に紐付く出荷予定情報をマップに格納する。
	 * @param sloL 受注明細リスト
	 * @param shipSchdL 受注納期回答リスト
	 */
	protected void setSloShipSchdMap(MCList<SloRsltR> sloL, MCList<ShipSchdRsltR> shipSchdL) {
		
		_sloShipSchdMap.clear();
		
		MCIndexKey idxkey = shipSchdL.createIndex(ShipSchdRsltR.$slo_d_no);
		
		for (SloRsltR sloR : sloL) {
			
			_sloShipSchdMap.put(sloR.slo_d_no(), shipSchdL.subList(idxkey, sloR.slo_d_no()));
		}
	}
	
	/**
	 * 受注明細に紐付く納入指示受領情報をマップに格納する。
	 * @param sloL 受注明細リスト
	 * @param shipSchdL 納入指示受領リスト
	 */
	protected void setSloDlvInstRcptMap(MCList<SloRsltR> sloL, MCList<DlvInstRcptRsltR> dlvInstRcptL) {

		_sloDlvInstRcptMap.clear();
		
		MCIndexKey idxkey = dlvInstRcptL.createIndex(DlvInstRcptRsltR.$slo_d_no);
		
		for (SloRsltR sloR : sloL) {
			
			_sloDlvInstRcptMap.put(sloR.slo_d_no(), dlvInstRcptL.subList(idxkey, sloR.slo_d_no()));
		}
	}
	
	/**
	 * 指定した受注明細の納入指示受領マップを上書きする。
	 * @param sloR 受注明細
	 */
	protected void replaceSloDlvInstRcptMap(SloRsltR sloR) {
		
		_sloDlvInstRcptMap.replace(sloR.slo_d_no(), getDlvInstRcptRsltL().clone());
		
		int index = DlvInstRcptRsltTable.getMCSelectedRow();
		MCColumnConfig colConfig = DlvInstRcptRsltTable.getLastSelectedColumnConfig();
		
		MCList<DlvInstRcptRsltR> dlvInstRcptL = _sloDlvInstRcptMap.get(sloR.slo_d_no());
		getDlvInstRcptRsltL().setAll(dlvInstRcptL);
		
		if (index > -1) {
			
			if (colConfig != null) {
				DlvInstRcptRsltTable.focusCellAt(index, colConfig);
			}
			else {
				DlvInstRcptRsltTable.selectRowNoFocus(index);
			}
		}
	}
	
	// エラーメッセージのフォーカス用
	@Override
	public void setFocus(MCMessage msg) {
		
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof DlvInstRcptRsltR) {
			for (SloRsltR r : getSloRsltL()) {
				if (isSame(((DlvInstRcptRsltR) msg.getCauseRow()).slo_d_no(), r.slo_d_no())) {
					SloRsltTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		
		super.setFocus(msg);
	}
	
	/**
	 * 対象のリストから 「ステータスがGUICREATE」を取り除いたリストを返します。<br>
	 * 
	 * @param <R>
	 * @param list 対象のリスト
	 * @return 取り除いたリスト
	 */
	protected <R extends MCConstRow> MCList<R> exceptGuiCreate(MCList<R> list) {

		MCList<R> ans = list.createInstance();
		
		if ( !list.statusChangedList().isEmpty()) {
			
			for (R row : list) {
				if (!row.isStatusGUICreate()) {
					row.setValueNE("param_row_index", MCNumber.valueOf(row.getGUIIndex()));
					ans.add(row);
				}
			}
		}

		return ans;
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		
		DlvInstRcptRsltTable.setCellConfig(createDlvInstRcptRsltCellConfig());
	}
	
	protected MCCellConfig createDlvInstRcptRsltCellConfig() {

		return new DlvInstRcptRsltCellConfig();
	}
	
	public class DlvInstRcptRsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			SloRsltR sloR = SloRsltTable.getSelectedMCRow();
			
			DlvInstRcptRsltR dlvInstRcptRsltR = getDlvInstRcptRsltL().get(index);
			if (dlvInstRcptRsltR.after_exec_flg()) {
				if (column != columnDlvInstRcptRslt_dlv_show_dtl && column != columnDlvInstRcptRslt_tdlv_show_dtl) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (isSame(getStatus(), UPD) && !isNull(sloR)) {
				
				if (MSC_SHIP_ASSORT_TYP.isAST(sloR.assort_typ())
						|| !isNull(sloR.set_itm_grp_no())) {
					if (column == columnDlvInstRcptRslt_dlv_cd
							|| column == columnDlvInstRcptRslt_pri_prnt_flg
							|| column == columnDlvInstRcptRslt_tdlv_cd
							|| column == columnDlvInstRcptRslt_via_dlv_typ
							|| column == columnDlvInstRcptRslt_dlv_day_week_typ_nm) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDlvInstRcptRslt_tdlv_cd) {
					if ((MAC_VIA_DLV_TYP.isVIA(dlvInstRcptRsltR.via_dlv_typ()) || dlvInstRcptRsltR.tdlv_req_flg()) 
							&& isNull(sloR.tdlv_cd())) {
						return MCMode.REQUIRED;
					}
				}
				
				if (column == columnDlvInstRcptRslt_pri_prnt_flg) {
					if (isNull(dlvInstRcptRsltR.dlv_cd()) || MAC_TRD_PTN_TYP.isSHIP(sloR.trd_ptn_typ()) || sloR.vmi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDlvInstRcptRslt_via_dlv_typ) {
					if (!sloR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(sloR.proc_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDlvInstRcptRslt_dlv_day_week_typ_nm) {
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloR.proc_typ())
							|| MAC_VIA_DLV_TYP.isVIA(dlvInstRcptRsltR.via_dlv_typ())
							|| (isNull(dlvInstRcptRsltR.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(sloR.via_dlv_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

}