package mcframe.clientMSBD.MSBDP0120;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP5020.*;
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
import java.util.Map;
import java.util.HashMap;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcDlvDtAdjstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcDlvDtAdjstReg_MC extends MSBDP_PurcDlvDtAdjstReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	Map<String, MCList<ArrPurcSchdR>> _arrPurcSchdL = new HashMap<String, MCList<ArrPurcSchdR>>();
	Map<String, MCList<ArrActR>> _arrActL = new HashMap<String, MCList<ArrActR>>();
	Map<String, MCList<PurcActR>> _purcActL = new HashMap<String, MCList<PurcActR>>();
	Map<String, MCList<DlvInstHdrDataR>> _dlvInstHdrDataL = new HashMap<String, MCList<DlvInstHdrDataR>>();
	Map<MCNumber, MCList<DlvInstDtlDataR>> _dlvInstDtlDataL = new HashMap<MCNumber, MCList<DlvInstDtlDataR>>();
	Map<String, MCList<PrmsHdrDataR>> _prmsHdrDataL = new HashMap<String, MCList<PrmsHdrDataR>>();
	Map<MCNumber, MCList<PrmsDtlDataR>> _prmsDtlDataL = new HashMap<MCNumber, MCList<PrmsDtlDataR>>();
	
	protected int _dlvInstHdrPegNo = 0;
	protected int _prmsHdrPegNo = 0;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDlvDtAdjstReg_MC() {
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
	public MSBDP_PurcDlvDtAdjstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[DlvInstDtlBtn]のボタン[srchDlvInstRecv]の押下時の処理
	 */
	@Override
	public void doDlvInstDtlBtn_srchDlvInstRecv(MCEventInfo info) {
		callMS_MSBDL0120_Srch02();
	}
	/**
	 * [MS_MSBDL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0120_Srch01Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearPegNo();
			clearHiddenList();
		}
	
		@Override
		protected void show() {
			super.show();
			
			setHiddenList(bridge.down2(), bridge.down3(), bridge.down4(), bridge.down5(), bridge.down6(), bridge.down7(), bridge.down8());
			// 未入荷数が残っているか
			bridge.down1().addBooleanColumn("compl_flg");
			for (PodR r : bridge.down1()) {
				r.setBoolean("compl_flg", !isRemainQtyExists(r));
				if (Cnd_ope_UPD_DLVINST.isSelected()) {
					r.setBoolean(PodR.$crnt_edi_dlv_inst_flg, r.edi_tgt_flg());
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}


	/**
	 * [MS_MSBDL0120_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0120_Srch02Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
	
		protected MS_MSBDL0120_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			setHiddenList(bridge.down0());
		}
	}


	/**
	 * [MS_MSBDL0120_Upd01]の定型処理のInnerClass
	 * 納入指示更新
	 */
	protected class MS_MSBDL0120_Upd01Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBDL0120_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		// チェック対象のリスト
		protected MCList<DlvInstHdrDataR> _DlvInstHdrDataLForCall = MCList.create(DlvInstHdrDataR.class);
		protected MCList<DlvInstDtlDataR> _DlvInstDtlDataLForCall = MCList.create(DlvInstDtlDataR.class);
		
		@Override
		protected void initCaller() {
			super.initCaller();
						
			setPrint(true);
			
			getBtnR().setStatus(Status.NONE);
			
			// 裏リストを差し替える
			setHiddenList();

			for(PodR poDR : getPodL()) {
				MCList<DlvInstHdrDataR> dlvInstHdrDataL = _dlvInstHdrDataL.get(poDR.po_d_no());
				if(isNull(dlvInstHdrDataL)) {
					continue;
				}
				
				for(DlvInstHdrDataR dlvInstHdrDataR : dlvInstHdrDataL) {
					if (dlvInstHdrDataR.can_flg() || dlvInstHdrDataR.isStatusNone()) {
						continue;
					}
					dlvInstHdrDataR.crnt_edi_dlv_inst_flg(poDR.crnt_edi_dlv_inst_flg());
					dlvInstHdrDataR.dlv_inst_ext_sys_typ(poDR.dlv_inst_ext_sys_typ());
					_DlvInstHdrDataLForCall.add(dlvInstHdrDataR);
						
					MCList<DlvInstDtlDataR> dlvInstDtlDataL = _dlvInstDtlDataL.get(dlvInstHdrDataR.peg_no());
					if(isNull(dlvInstDtlDataL)) {
						continue;
					}
					for(DlvInstDtlDataR dlvInstDtlDataR : dlvInstDtlDataL) {
						if (!isDlvInstExistsAct(dlvInstDtlDataR) || !dlvInstDtlDataR.isStatusNone()) {
							_DlvInstDtlDataLForCall.add(dlvInstDtlDataR);
						}
					}
				}
				MAUCP_DateUtil.setYmdHm(_DlvInstDtlDataLForCall, DlvInstDtlDataR.$dlv_rqst_dt, DlvInstDtlDataR.$dlv_rqst_hm);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			PoR poR = getPoL().get(0);
			for (DlvInstHdrDataR r : exceptDeleteAndEmpty(_DlvInstHdrDataLForCall)) {
				if(poR.po_dt().gt(r.dlv_inst_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnDlvInstHdrData_dlv_inst_dt.getMessageByLocale());
					msg.setCauseRow(r, columnDlvInstHdrData_dlv_inst_dt.getMessageByLocale());
					msgList.add(msg);
				}
			}
			for (DlvInstDtlDataR r : exceptDeleteAndEmpty(_DlvInstDtlDataLForCall)) {
				if(poR.po_dt().gt(r.dlv_rqst_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnDlvInstDtlData_dlv_rqst_dt.getMessageByLocale());
					msg.setCauseRow(r, columnDlvInstDtlData_dlv_rqst_dt.getMessageByLocale());
					msgList.add(msg);
				}
				if(poR.po_dt().gt(r.purc_schd_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnDlvInstDtlData_purc_schd_dt.getMessageByLocale());
					msg.setCauseRow(r, columnDlvInstDtlData_purc_schd_dt.getMessageByLocale());
					msgList.add(msg);
				}
			}
		}
	
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 非表示リストのため、サーバのチェックでチェックする
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().setAll(_DlvInstHdrDataLForCall);
			bridge.up2().setAll(_DlvInstDtlDataLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(1, _DlvInstHdrDataLForCall);
			result.set(2, _DlvInstDtlDataLForCall);
			return result;
		}
	
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(0, _DlvInstHdrDataLForCall);
			result.set(1, _DlvInstDtlDataLForCall);
			return result;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
		
		@Override
		protected void showMerge() {
			super.showMerge();
			MCList<DlvInstHdrDataR> showInstHdrL = getDlvInstHdrDataL();
			
			for (DlvInstHdrDataR downHdrR : _DlvInstHdrDataLForCall) {
				for (DlvInstHdrDataR showHdrR : showInstHdrL) {
					if (isSame(downHdrR.peg_no(), showHdrR.peg_no())) {
						showHdrR.dlv_inst_no(downHdrR.dlv_inst_no());
						showHdrR.dlv_inst_rev(downHdrR.dlv_inst_rev());
						showHdrR.dlv_inst_grp_no(downHdrR.dlv_inst_grp_no());
					}
				}
			}
			
			int idx = DlvInstHdrDataTable.getMCSelectedRow();
			if (idx >= 0) {
				DlvInstHdrDataR row = getDlvInstHdrDataL().get(idx);
				showDlvInstDtl(row);
			}
		}
	}


	/**
	 * [MS_MSBDL0120_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0120_Upd02Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
	
		protected MS_MSBDL0120_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		// チェック対象のリスト
		protected MCList<PrmsHdrDataR> _PrmsHdrDataLForCall = MCList.create(PrmsHdrDataR.class);
		protected MCList<PrmsDtlDataR> _PrmsDtlDataLForCall = MCList.create(PrmsDtlDataR.class);
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
			
			// 裏リストを差し替える
			setHiddenList();
			
			for(PodR poDR : getPodL()) {
				MCList<PrmsHdrDataR> prmsHdrDataL = _prmsHdrDataL.get(poDR.po_d_no());
				if(isNull(prmsHdrDataL)) {
					continue;
				}
				
				for(PrmsHdrDataR prmsHdrDataR : prmsHdrDataL) {
					if(!isStatusNone(prmsHdrDataR)) {
						_PrmsHdrDataLForCall.add(prmsHdrDataR);
						
						MCList<PrmsDtlDataR> prmsDtlDataL = _prmsDtlDataL.get(prmsHdrDataR.peg_no());
						if(isNull(prmsDtlDataL)) {
							continue;
						}
						for(PrmsDtlDataR prmsDtlDataR : prmsDtlDataL) {
							if(!isStatusNone(prmsDtlDataR)) {
								_PrmsDtlDataLForCall.add(prmsDtlDataR);
							}
						}
					}
				}
				MAUCP_DateUtil.setYmdHm(_PrmsDtlDataLForCall, PrmsDtlDataR.$prms_dlv_dt, PrmsDtlDataR.$prms_dlv_hm);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			PoR poR = getPoL().get(0);
			for (PrmsHdrDataR r : exceptDeleteAndEmpty(_PrmsHdrDataLForCall)) {
				if(poR.po_dt().gt(r.prms_rcpt_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnPrmsHdrData_prms_rcpt_dt.getMessageByLocale());
					msg.setCauseRow(r, columnPrmsHdrData_prms_rcpt_dt.getMessageByLocale());
					msgList.add(msg);
				}
				msgList.addAll(checkBeforeAfter(columnPrmsHdrData_prms_rcpt_dt, columnPrmsHdrData_arr_schd_refl_dt, r));
			}
			for (PrmsDtlDataR r : exceptDeleteAndEmpty(_PrmsDtlDataLForCall)) {
				if(poR.po_dt().gt(r.prms_dlv_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnPrmsDtlData_prms_dlv_dt.getMessageByLocale());
					msg.setCauseRow(r, columnPrmsDtlData_prms_dlv_dt.getMessageByLocale());
					msgList.add(msg);
				}
				if(poR.po_dt().gt(r.purc_schd_dt())) {
					MCMessage msg = msgNotBefore(columnPo_po_dt.getMessageByLocale(), columnPrmsDtlData_purc_schd_dt.getMessageByLocale());
					msg.setCauseRow(r, columnPrmsDtlData_purc_schd_dt.getMessageByLocale());
					msgList.add(msg);
				}
			}
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 非表示リストのため、サーバのチェックでチェックする
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up0().setAll(_PrmsHdrDataLForCall);
			bridge.up1().setAll(_PrmsDtlDataLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(0, _PrmsHdrDataLForCall);
			result.set(1, _PrmsDtlDataLForCall);
			return result;
		}
	
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(0, _PrmsHdrDataLForCall);
			result.set(1, _PrmsDtlDataLForCall);
			return result;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
		
		@Override
		protected void showMerge() {
			super.showMerge();
			MCList<PrmsHdrDataR> showPrmsHdrL = getPrmsHdrDataL();
			
			for (PrmsHdrDataR downHdrR : _PrmsHdrDataLForCall) {
				for (PrmsHdrDataR showHdrR : showPrmsHdrL) {
					if (isSame(downHdrR.peg_no(), showHdrR.peg_no())) {
						showHdrR.prms_rcpt_grp_no(downHdrR.prms_rcpt_grp_no());
					}
				}
			}
			
			int idx = PrmsHdrDataTable.getMCSelectedRow();
			if (idx >= 0) {
				PrmsHdrDataR row = getPrmsHdrDataL().get(idx);
				showPrmsRcptDtl(row);
			}
		}
	}



	/**
	 * [MS_MSBDL0120_Upd05]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0120_Upd05Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Upd05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
	
		protected MS_MSBDL0120_Upd05Caller(P p, B b) {
			super(p, b);
		}
		
		// チェック対象のリスト
		protected MCList<ArrPurcSchdR> _ArrPurcSchdLForCall = MCList.create(ArrPurcSchdR.class);
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
			
			for(PodR poDR : getPodL()) {
				MCList<ArrPurcSchdR> arrPurcSchdL = _arrPurcSchdL.get(poDR.po_d_no());
				if(isNull(arrPurcSchdL)) {
					continue;
				}
				
				for(ArrPurcSchdR arrPurcSchdR : arrPurcSchdL) {
					if(arrPurcSchdR.check()) {
						_ArrPurcSchdLForCall.add(arrPurcSchdR);
					}
				}
			}
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 非表示リストのため、サーバのチェックでチェックする
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up0().setAll(_ArrPurcSchdLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(0, _ArrPurcSchdLForCall);
			return result;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(0, _ArrPurcSchdLForCall);
			return result;
		}
	}


	/**
	 * [MS_MSBDL0120_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0120_Prnt01Caller<P extends MSBDP_PurcDlvDtAdjstReg, B extends MS_MSBDL0120_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0120_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Btn_dlv_inst_print_flg, Btn_dlv_slip_print_flg, Btn_purc_ddlv_dlv_slip_print_flg));
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().clear();
			bridge.up2().clear();
			for (PodR poDR : getPodL()) {
				MCList<DlvInstHdrDataR> dlvInstHdrDataL = _dlvInstHdrDataL.get(poDR.po_d_no());
				MCList<ArrPurcSchdR> arrPurcSchdL = _arrPurcSchdL.get(poDR.po_d_no());
				
				if (!isNull(dlvInstHdrDataL)) {
					for (DlvInstHdrDataR dlvInstHdrDataR : dlvInstHdrDataL) {
						dlvInstHdrDataR.crnt_edi_dlv_inst_flg(poDR.crnt_edi_dlv_inst_flg());
						bridge.up1().add(dlvInstHdrDataR);
					}
				}
				if (!isNull(arrPurcSchdL)) {
					for (ArrPurcSchdR arrPurcSchdR : arrPurcSchdL) {
						bridge.up2().add(arrPurcSchdR);
					}
				}
			}
		}
	}

	@Override
	public void doPrmsDtlData_dlv_inst_d_no_LC(MCEventInfo info) {
		// 納入指示明細ＮＯ入力時、納入指示明細に存在する明細から仕入実績明細ＮＯを補完する
		PrmsDtlDataR prmsDtlR = PrmsDtlDataTable.getSelectedMCRow();
		if (!isNull(prmsDtlR) && !isNull(prmsDtlR.dlv_inst_d_no())) {
			DlvInstDtlDataR dlvR = getDlvInstDtlDataL().getFirst(DlvInstDtlDataR.$dlv_inst_d_no, prmsDtlR.dlv_inst_d_no());
			if (!isNull(dlvR)) {
				prmsDtlR.purc_act_d_no(dlvR.purc_act_d_no());
			}
			else {
				prmsDtlR.purc_act_d_no(null);
			}
		}
		else {
			prmsDtlR.purc_act_d_no(null);
		}
		super.doPrmsDtlData_dlv_inst_d_no_LC(info);
	}

	/**
	 * Panel[PrmsHdrBtn]のボタン[arrSchdCopyAll]の押下時の処理
	 */
	@Override
	public void doPrmsHdrBtn_arrSchdCopyAll(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			PoR poR = PoTable.getSelectedMCRow();
			for (PodR poDR : getPodL()) {
				PodTable.selectRowNoFocus(poDR.getGUIIndex());
				getArrPurcSchdL().setAll(_arrPurcSchdL.get(poDR.po_d_no()));
				MCList<PrmsHdrDataR> crtHdrL = MCList.create(PrmsHdrDataR.class);
				if (_prmsHdrDataL.size() > 0) {
					MCList<PrmsHdrDataR> tmpHdrL = getPrmsHdrDataL().subList(PrmsHdrDataR.$po_d_no, poDR.po_d_no());
					if (!isNull(tmpHdrL) && !tmpHdrL.isEmpty()) {
						for(PrmsHdrDataR tmpR : tmpHdrL) {
							if (tmpR.isStatusCreate()) {
								crtHdrL.add(tmpR);
							}
						}
					}
					// 以下の条件に当てはまる場合は入荷予定コピーの対象外
					// ・納期回答受領ヘッダに新規行がある場合
					if(crtHdrL.size() > 0) {
						continue;
					}
					if (!isNull(tmpHdrL) && !tmpHdrL.isEmpty()) {
						MCIndexKey arrIdx = getArrPurcSchdL().createIndex(ArrPurcSchdR.$prms_rcpt_d_no);
						for (PrmsHdrDataR tmpHdrR : tmpHdrL) {
							boolean actFlg = false;
							if (!tmpHdrR.can_flg() && tmpHdrR.arr_schd_refl_flg()) {
								MCList<PrmsDtlDataR> tmpDtlL = _prmsDtlDataL.get(tmpHdrR.peg_no());
								if (!isNull(tmpDtlL) && !tmpDtlL.isEmpty()) {
									for (PrmsDtlDataR tmpDtlR : tmpDtlL) {
										ArrPurcSchdR schdR = getArrPurcSchdL().getFirst(arrIdx, tmpDtlR.prms_rcpt_d_no());
										// 入荷実績未反映の明細は削除する
										if (!isNull(schdR) && !schdR.isEmpty()) {
											actFlg = actFlg || isAct(schdR);
											if (!isAct(schdR)) {
												tmpDtlR.setStatus(Status.DELETE);
											}
										}
									}
									// 入荷実績反映済の行が存在しない場合は、入荷予定反映をオフにする。
									if (!actFlg) {
										tmpHdrR.arr_schd_refl_flg(false);
										tmpHdrR.setStatus(Status.DELETE);
									}
								}
								else {
									tmpHdrR.arr_schd_refl_flg(false);
									tmpHdrR.setStatus(Status.DELETE);
								}
							}
							reMapPrmsDtlDataList(tmpHdrR);
						}
					}
				}
				
				prmsHdrAdd(poR, poDR);
				getPrmsDtlDataL().clear();
				PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();
				arrSchdCopyToPrmsDtl(poDR, prmsHdrR);
				if (isNull(getPrmsDtlDataL()) || getPrmsDtlDataL().isEmpty()) {
					deleteRow(PrmsHdrDataTable);
				}
			}
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}
	
	protected void reMapPrmsDtlDataList(PrmsHdrDataR tmpHdrR) {
		if (tmpHdrR.isStatusDelete()) {
			MCList<PrmsDtlDataR> targetPrmsDtlL = _prmsDtlDataL.get(tmpHdrR.peg_no());
			MCList<PrmsDtlDataR> reMapPrmsDtlL = MCList.create(PrmsDtlDataR.class);
			for (PrmsDtlDataR targetPrmsDtlR : targetPrmsDtlL) {
				if (!targetPrmsDtlR.isStatusCreate()) {
					targetPrmsDtlR.setStatus(MCRow.DELETE);
					reMapPrmsDtlL.add(targetPrmsDtlR);
				}
			}
			if (!isNull(reMapPrmsDtlL) && !reMapPrmsDtlL.isEmpty()) {
				_prmsDtlDataL.put(tmpHdrR.peg_no(), reMapPrmsDtlL);
			}
		}
	}
	
	/**
	 * 入荷・仕入予定を実績計上しているか
	 * @param schdR 入荷仕入予定
	 * @return true:実績計上済 false:実績未計上
	 */
	protected boolean isAct(ArrPurcSchdR schdR) {
		return (!isNull(schdR.arr_qty()) && !schdR.arr_qty().isZero())
		|| (!isNull(schdR.purc_act_qty()) && !schdR.purc_act_qty().isZero())
		|| (!isNull(schdR.rcpt_iv_qty()) && !schdR.rcpt_iv_qty().isZero())
		|| (!isNull(schdR.accpt_dfct_qty()) && !schdR.accpt_dfct_qty().isZero());
	}
	
	/**
	 * Panel[PrmsHdrBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doPrmsHdrBtn_radd(MCEventInfo info) {
		PodR poDR = PodTable.getSelectedMCRow();
		PoR poR = PoTable.getSelectedMCRow();
		if(!isNull(poDR)) {
			prmsHdrAdd(poR, poDR);
			
			getPrmsDtlDataL().clear();
		}
		setBtnMode();
	}
	
	/**
	 * 納期回答受領ヘッダ行を追加する。
	 * @param poR 発注行
	 * @param poDR 発注明細行
	 */
	protected void prmsHdrAdd(PoR poR, PodR poDR) {
		PrmsHdrDataR insR = insertRow(PrmsHdrDataTable);
		insR.peg_no(_prmsHdrPegNo++);
		insR.po_d_no(poDR.po_d_no());
		insR.arr_pr_no(poDR.arr_pr_no());
		insR.arr_pr_upd_cntr(poDR.arr_pr_upd_cntr());
		setValueEx(columnPrmsHdrData_prms_rcpt_dt, insR.getGUIIndex(), getToday());
		if(!isNull(poR)) {
			if(!poR.prms_recv_flg()) {
				insR.arr_schd_refl_flg(true);
				insR.arr_schd_refl_dt(getToday());
			}
		}
		insR.setStatus(MCRow.CREATE);
		
		MCList<PrmsHdrDataR> tmpL = _prmsHdrDataL.get(insR.po_d_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(PrmsHdrDataR.class);
		}
		tmpL.add(insR);
		_prmsHdrDataL.put(insR.po_d_no(), tmpL);
	}
	
	/**
	 * Panel[PrmsHdrBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doPrmsHdrBtn_rdel(MCEventInfo info) {
		if(!getPrmsDtlDataL().isEmpty()) {
			deleteRows(PrmsDtlDataTable, getPrmsDtlDataL());
						
			PrmsHdrDataR tgtR = PrmsHdrDataTable.getSelectedMCRow();
			if(!isNull(tgtR)) {
				if(!tgtR.isStatusDelete()) {
					for(PrmsDtlDataR r : getPrmsDtlDataL()) {
						r.setStatus(MCRow.DELETE);
					}
				}
				else {
					for(PrmsDtlDataR r : getPrmsDtlDataL()) {
						if(r.isStatusDelete()) {
							deleteRow(PrmsDtlDataTable, r.getGUIIndex());
						}
					}
				}

				_prmsDtlDataL.put(tgtR.peg_no(), getPrmsDtlDataL().clone());
				getPrmsDtlDataL().setAll(_prmsDtlDataL.get(tgtR.peg_no()));
			}
		}

		deleteRow(PrmsHdrDataTable);
		setBtnMode();
	}
	/**
	 * Panel[PrmsHdrBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doPrmsHdrBtn_rcopy(MCEventInfo info) {
		PrmsHdrDataR selR = PrmsHdrDataTable.getSelectedMCRow();
		PrmsHdrDataR copyR = copyRow(PrmsHdrDataTable);
		copyR.peg_no(_prmsHdrPegNo++);
		copyR.prms_rcpt_no(null);
		copyR.prms_rcpt_grp_no(null);
		copyR.can_flg(false);
		
		MCList<PrmsHdrDataR> tmpL = _prmsHdrDataL.get(copyR.po_d_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(PrmsHdrDataR.class);
		}
		tmpL.add(copyR);
		_prmsHdrDataL.put(copyR.po_d_no(), tmpL);
		
		MCList<PrmsDtlDataR> tmp2L = _prmsDtlDataL.get(selR.peg_no());
		MCList<PrmsDtlDataR> destDtlList = MCList.create(PrmsDtlDataR.class);
		if(!isNull(tmp2L)) {
			for (PrmsDtlDataR tmp2R : tmp2L) {
				PrmsDtlDataR addDtlR = PrmsDtlDataR.create();
				MCRow.copyall(addDtlR, tmp2R);
				// コピー先明細行への紐付け
				addDtlR.hdr_peg_no(copyR.peg_no());
				// コピー元の項目をクリア
				addDtlR.prms_rcpt_no(null);
				addDtlR.prms_rcpt_d_no(null);
				addDtlR.arr_qty(null);
				addDtlR.act_abort_qty(null);
				addDtlR.purc_act_qty(null);
				addDtlR.purc_abort_qty(null);
				addDtlR.accpt_dfct_qty(null);
				addDtlR.rcpt_iv_no(null);
				addDtlR.arr_cmpl_flg(false);
				addDtlR.purc_cmpl_flg(false);
				addDtlR.setStatus(Status.CREATE);
				
				destDtlList.add(addDtlR);
			}
		}
		if (destDtlList.size() > 0) {
			_prmsDtlDataL.put(copyR.peg_no(), destDtlList);
		}
		showPrmsRcptDtl(copyR);
		setBtnMode();
	}
	/**
	 * Panel[PrmsDtlBtn]のボタン[arrSchdCopy]の押下時の処理
	 */
	@Override
	public void doPrmsDtlBtn_arrSchdCopy(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			PodR poDR = PodTable.getSelectedMCRow();
			PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();
			arrSchdCopyToPrmsDtl(poDR, prmsHdrR);
			setBtnMode();
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}
	
	/**
	 * 納期回答受領明細へ入荷予定をコピーする
	 */
	protected void arrSchdCopyToPrmsDtl(PodR poDR, PrmsHdrDataR prmsHdrR) {
		_prmsDtlDataL.put(prmsHdrR.peg_no(), getPrmsDtlDataL().clone());		
		MCList<ArrPurcSchdR> arrSchdL = getArrPurcSchdL();
		MCList<PrmsDtlDataR> tmpL = _prmsDtlDataL.get(prmsHdrR.peg_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(PrmsDtlDataR.class);
		}
		
		for(ArrPurcSchdR r : arrSchdL) {
			PrmsDtlDataR prmsDtlR = PrmsDtlDataR.create();
			prmsDtlR.hdr_peg_no(prmsHdrR.peg_no());
			prmsDtlR.po_d_no(prmsHdrR.po_d_no());
			prmsDtlR.itm_cd(r.itm_cd());
			prmsDtlR.itm_sub1(r.itm_sub1());
			prmsDtlR.itm_sub2(r.itm_sub2());
			prmsDtlR.itm_sub3(r.itm_sub3());
			prmsDtlR.trd_unit_cd(r.schd_unit_cd());
			prmsDtlR.trd_unit_nm(r.schd_unit_nm());
			prmsDtlR.trd_unit_dec_place(r.schd_unit_dec_place());
			prmsDtlR.trd_unit_rnd_typ(r.schd_unit_rnd_typ());
			prmsDtlR.conv_base_qty(r.schd_unit_conv_base_qty());
			prmsDtlR.conv_qty(r.schd_unit_conv_qty());
			prmsDtlR.base_unit_cd(r.base_unit_cd());
			prmsDtlR.base_unit_nm(r.base_unit_nm());
			
			// 入荷不要、仕入対象外を考慮し、予定数量の大きいほうを取得
			MCNumber baseUnitSchdQty = MCNumber.max(r.base_unit_qty(), r.base_unit_purc_schd_qty());
			MCNumber arrQty = MCNumber.max(r.arr_qty(), r.rcpt_iv_qty());
			
			// 残数分の基準単位数量の設定
			if ((arrQty.add(r.act_abort_qty())).gt(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty()))) {
				if (baseUnitSchdQty.lte(arrQty.add(r.act_abort_qty()))) {
					continue;
				}
				else {
					prmsDtlR.base_unit_qty(baseUnitSchdQty.subtract(arrQty.add(r.act_abort_qty())));
				}
		}
			else {
				if (baseUnitSchdQty.lte(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty())) || !isNull(r.rcpt_iv_no())) {
					continue;
				}
				else {
					prmsDtlR.base_unit_qty(baseUnitSchdQty.subtract(r.purc_act_qty()).subtract(r.accpt_dfct_qty()).subtract(r.purc_abort_qty()));
				}
			}
			
			// 取引単位数量の設定
			if (isSame(r.schd_unit_cd(), r.base_unit_cd())) {
				prmsDtlR.trd_unit_qty(prmsDtlR.base_unit_qty());
			}
			else {
				prmsDtlR.trd_unit_qty(rvrsBaseUnitConv(prmsDtlR.base_unit_qty(),
						prmsDtlR.conv_base_qty(), prmsDtlR.conv_qty(),
						prmsDtlR.trd_unit_dec_place(), prmsDtlR.trd_unit_rnd_typ()));
			}

			prmsDtlR.base_unit_dec_place(r.base_unit_dec_place());
			prmsDtlR.base_unit_rnd_typ(r.base_unit_rnd_typ());
			prmsDtlR.prms_dlv_dt(r.arr_schd_dt());
			prmsDtlR.prms_dlv_hm(r.arr_schd_hm());
			prmsDtlR.purc_schd_dt(r.purc_schd_dt());
			prmsDtlR.sync_flg(r.sync_flg());
			prmsDtlR.outsrc_flg(r.outsrc_flg());
			prmsDtlR.purc_id_typ(poDR.purc_id_typ());
			prmsDtlR.dlv_cd(poDR.dlv_cd());
			prmsDtlR.dlv_inst_d_no(r.dlv_inst_d_no());
			prmsDtlR.purc_act_d_no(r.purc_act_d_no());
			prmsDtlR.mfg_inst_no(r.mfg_inst_no());
			prmsDtlR.setStatus(MCRow.CREATE);
			tmpL.add(prmsDtlR);
		}
		_prmsDtlDataL.put(prmsHdrR.peg_no(), tmpL);
		showPrmsRcptDtl(prmsHdrR);
	}
	
	// 納入指示あるいは納期回答受領可能な予定かを返す
	protected boolean isRemainQtyExists() {
		boolean ret = false;
		PodR r = PodTable.getSelectedMCRow();
		if(isNull(r)){
			return false;
		}
		
		for (ArrPurcSchdR schdR : _arrPurcSchdL.get(r.po_d_no())) {
			if(isNotUpd(schdR)){
				continue;
			}
			return true;
		}
		return ret;
	}
	
	protected boolean isRemainQtyExists(PodR r) {
		boolean ret = false;
		for (ArrPurcSchdR schdR : _arrPurcSchdL.get(r.po_d_no())) {
			if(isNotUpd(schdR)){
				continue;
			}
			return true;
		}
		return ret;
	}
	
	/**
	 * 変更不可の予定かを返す。
	 * 入荷完了 or 仕入完了 or 受領インボイス完了
	 */
	protected boolean isNotUpd(ArrPurcSchdR r) {
		return !r.arr_skip_flg() && r.arr_cmpl_flg() || !r.non_purc_flg() && r.purc_cmpl_flg() || r.rcpt_iv_cmpl_flg();
	}
	
	/**
	 * Panel[DlvInstHdrBtn]のボタン[arrSchdCopyAll]の押下時の処理
	 */
	@Override
	public void doDlvInstHdrBtn_arrSchdCopyAll(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			for (PodR poDR : getPodL()) {
				PodTable.selectRowNoFocus(poDR.getGUIIndex());
				getArrPurcSchdL().setAll(_arrPurcSchdL.get(poDR.po_d_no()));
				MCList<DlvInstHdrDataR> crtHdrL = MCList.create(DlvInstHdrDataR.class);
				if (_dlvInstHdrDataL.size() > 0) {
					MCList<DlvInstHdrDataR> tmpHdrL = getDlvInstHdrDataL().subList(DlvInstHdrDataR.$po_d_no, poDR.po_d_no());
					if (!isNull(tmpHdrL) && !tmpHdrL.isEmpty()) {
						for(DlvInstHdrDataR tmpR : tmpHdrL) {
							if (tmpR.isStatusCreate()) {
								crtHdrL.add(tmpR);
							}
						}
					}
					// 以下の条件に当てはまる場合は入荷予定コピーの対象外
					// ・納入指示ヘッダに新規行がある場合
					if(crtHdrL.size() > 0) {
						continue;
					}
					if (!isNull(tmpHdrL) && !tmpHdrL.isEmpty()) {
						MCIndexKey arrIdx = getArrPurcSchdL().createIndex(ArrPurcSchdR.$dlv_inst_d_no);
						for (DlvInstHdrDataR tmpHdrR : tmpHdrL) {
							boolean actFlg = false;
							if (!tmpHdrR.can_flg()) {
								MCList<DlvInstDtlDataR> tmpDtlL = _dlvInstDtlDataL.get(tmpHdrR.peg_no());
								if (!isNull(tmpDtlL) && !tmpDtlL.isEmpty()) {
									for (DlvInstDtlDataR tmpDtlR : tmpDtlL) {
										ArrPurcSchdR schdR = getArrPurcSchdL().getFirst(arrIdx, tmpDtlR.dlv_inst_d_no());
										// 入荷実績未反映の明細は削除する
										if (!isNull(schdR) && !schdR.isEmpty()) {
											actFlg = actFlg || isAct(schdR);
											if (!isAct(schdR)) {
												tmpDtlR.setStatus(Status.DELETE);
											}
										}
									}
									// 入荷実績反映済の行が存在しない場合は、行削除する
									if (!actFlg) {
										tmpHdrR.setStatus(Status.DELETE);
									}
								}
								else {
									tmpHdrR.setStatus(Status.DELETE);
								}
							}
							reMapDlvInstDtlDataList(tmpHdrR);
						}
					}
				}
				
				dlvInstHdrAdd(poDR);
				getPrmsDtlDataL().clear();
				DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
				arrSchdCopyToDlvInstDtl(poDR, dlvInstHdrR);
				if (isNull(getDlvInstDtlDataL()) || getDlvInstDtlDataL().isEmpty()) {
					deleteRow(DlvInstHdrDataTable);
				}
			}
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}
	
	protected void reMapDlvInstDtlDataList(DlvInstHdrDataR tmpHdrR) {
		if (tmpHdrR.isStatusDelete()) {
			MCList<DlvInstDtlDataR> targetDlvInstDtlL = _dlvInstDtlDataL.get(tmpHdrR.peg_no());
			MCList<DlvInstDtlDataR> reMapDlvInstDtlL = MCList.create(DlvInstDtlDataR.class);
			for (DlvInstDtlDataR targetDlvInstDtlR : targetDlvInstDtlL) {
				if (!targetDlvInstDtlR.isStatusCreate()) {
					reMapDlvInstDtlL.add(targetDlvInstDtlR);
				}
			}
			if (!isNull(reMapDlvInstDtlL) && !reMapDlvInstDtlL.isEmpty()) {
				_dlvInstDtlDataL.put(tmpHdrR.peg_no(), reMapDlvInstDtlL);
			}
		}
	}
	
	/**
	 * Panel[DlvInstHdrBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDlvInstHdrBtn_radd(MCEventInfo info) {
		PodR poDR = PodTable.getSelectedMCRow();
		if(!isNull(poDR)) {
			dlvInstHdrAdd(poDR);
			
			setBtnMode();
		}
	}
	
	/**
	 * 納入指示ヘッダに行を追加する
	 * @param poDR 発注明細行
	 */
	protected void dlvInstHdrAdd(PodR poDR) {
		DlvInstHdrDataR insR = insertRow(DlvInstHdrDataTable);
		insR.peg_no(_dlvInstHdrPegNo++);
		insR.po_d_no(poDR.po_d_no());
		insR.slo_d_no(poDR.slo_d_no());
		insR.dlv_cd(poDR.dlv_cd());
		insR.arr_pr_no(poDR.arr_pr_no());
		insR.arr_pr_upd_cntr(poDR.arr_pr_upd_cntr());
		setValueEx(columnDlvInstHdrData_dlv_inst_dt, insR.getGUIIndex(), getToday());
		insR.setStatus(MCRow.CREATE);
		
		MCList<DlvInstHdrDataR> tmpL = _dlvInstHdrDataL.get(insR.po_d_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(DlvInstHdrDataR.class);
		}
		tmpL.add(insR);
		_dlvInstHdrDataL.put(insR.po_d_no(), tmpL);
	}
	
	/**
	 * Panel[DlvInstHdrBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDlvInstHdrBtn_rdel(MCEventInfo info) {
		if(!getDlvInstDtlDataL().isEmpty()) {
			deleteRows(DlvInstDtlDataTable, getDlvInstDtlDataL());
			
			DlvInstHdrDataR tgtR = DlvInstHdrDataTable.getSelectedMCRow();
			if(!isNull(tgtR)) {
				if(!tgtR.isStatusDelete()) {
					for(DlvInstDtlDataR r : getDlvInstDtlDataL()) {
						r.setStatus(MCRow.DELETE);
					}
				}
				else {
					for(DlvInstDtlDataR r : getDlvInstDtlDataL()) {
						if(r.isStatusDelete()) {
							deleteRow(DlvInstDtlDataTable, r.getGUIIndex());
						}
					}
				}
				
				_dlvInstDtlDataL.put(tgtR.peg_no(), getDlvInstDtlDataL().clone());
				getDlvInstDtlDataL().setAll(_dlvInstDtlDataL.get(tgtR.peg_no()));
			}
		}
		
		deleteRow(DlvInstHdrDataTable);
		setBtnMode();
	}
	/**
	 * Panel[DlvInstHdrBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDlvInstHdrBtn_rcopy(MCEventInfo info) {
		DlvInstHdrDataR selR = DlvInstHdrDataTable.getSelectedMCRow();
		DlvInstHdrDataR copyR = copyRow(DlvInstHdrDataTable);
		copyR.peg_no(_dlvInstHdrPegNo++);
		copyR.dlv_inst_print_flg(false);
		copyR.dlv_inst_print_dt(null);
		copyR.dlv_inst_no(null);
		copyR.dlv_inst_rev(null);
		copyR.upd_cntr(null);
		copyR.dlv_inst_grp_no(null);
		copyR.can_flg(false);
		copyR.edi_flg(false);
		
		MCList<DlvInstHdrDataR> tmpL = _dlvInstHdrDataL.get(copyR.po_d_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(DlvInstHdrDataR.class);
		}
		tmpL.add(copyR);
		_dlvInstHdrDataL.put(copyR.po_d_no(), tmpL);
		
		MCList<DlvInstDtlDataR> tmp2L = _dlvInstDtlDataL.get(selR.peg_no());
		MCList<DlvInstDtlDataR> destDtlList = MCList.create(DlvInstDtlDataR.class);
		if(!isNull(tmp2L)) {
			for (DlvInstDtlDataR tmp2R : tmp2L) {
				DlvInstDtlDataR addDtlR = DlvInstDtlDataR.create();
				MCRow.copyall(addDtlR, tmp2R);
				// コピー先明細行への紐付け
				addDtlR.hdr_peg_no(copyR.peg_no());
				// コピー元の項目をクリア
				addDtlR.dlv_inst_no(null);
				addDtlR.dlv_inst_d_no(null);
				addDtlR.act_abort_qty(null);
				addDtlR.purc_act_qty(null);
				addDtlR.purc_abort_qty(null);
				addDtlR.accpt_dfct_qty(null);
				addDtlR.rcpt_iv_no(null);
				addDtlR.arr_cmpl_flg(false);
				addDtlR.purc_cmpl_flg(false);
				addDtlR.can_flg(false);
				addDtlR.ins_func_id(null);
				addDtlR.setStatus(Status.CREATE);
				
				destDtlList.add(addDtlR);
			}
		}
		if (destDtlList.size() > 0) {
			_dlvInstDtlDataL.put(copyR.peg_no(), destDtlList);
		}
		showDlvInstDtl(copyR);
		setBtnMode();
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBDL0120_Srch01();
	}
	
		/**
		 * Panel[DlvInstDtlBtn]のボタン[arrSchdCopy]の押下時の処理
		 */
		@Override
		public void doDlvInstDtlBtn_arrSchdCopy(MCEventInfo info) {
			try {
				MCBeansUtil.setMouseCursorWait();
				PodR poDR = PodTable.getSelectedMCRow();
				DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
				arrSchdCopyToDlvInstDtl(poDR, dlvInstHdrR);
				setBtnMode();
			}
			finally {
				MCBeansUtil.setMouseCursorDefault();
			}
		}
		/**
		 * 納入指示明細へ入荷予定をコピーする
		 */
		protected void arrSchdCopyToDlvInstDtl(PodR poDR, DlvInstHdrDataR dlvInstHdrR) {
			_dlvInstDtlDataL.put(dlvInstHdrR.peg_no(), getDlvInstDtlDataL().clone());		
			MCList<ArrPurcSchdR> arrSchdL = getArrPurcSchdL();
			MCList<DlvInstDtlDataR> tmpL = _dlvInstDtlDataL.get(dlvInstHdrR.peg_no());
			if(isNull(tmpL)) {
				tmpL = MCList.create(DlvInstDtlDataR.class);
			}
			
			for(ArrPurcSchdR r : arrSchdL) {
				// 納期回答受領済の行は対象外
				if (!isNull(r.prms_rcpt_d_no())) {
					continue;
				}
				DlvInstDtlDataR dlvInstDtlR = DlvInstDtlDataR.create();
				dlvInstDtlR.hdr_peg_no(dlvInstHdrR.peg_no());
				dlvInstDtlR.po_d_no(dlvInstHdrR.po_d_no());
				dlvInstDtlR.itm_cd(r.itm_cd());
				dlvInstDtlR.itm_sub1(r.itm_sub1());
				dlvInstDtlR.itm_sub2(r.itm_sub2());
				dlvInstDtlR.itm_sub3(r.itm_sub3());
				dlvInstDtlR.trd_unit_cd(r.schd_unit_cd());
				dlvInstDtlR.trd_unit_nm(r.schd_unit_nm());
				dlvInstDtlR.trd_unit_dec_place(r.schd_unit_dec_place());
				dlvInstDtlR.trd_unit_rnd_typ(r.schd_unit_rnd_typ());
				dlvInstDtlR.conv_base_qty(r.schd_unit_conv_base_qty());
				dlvInstDtlR.conv_qty(r.schd_unit_conv_qty());
				dlvInstDtlR.base_unit_cd(r.base_unit_cd());
				dlvInstDtlR.base_unit_nm(r.base_unit_nm());
				
				// 入荷不要、仕入対象外を考慮し、予定数量の大きいほうを取得
				MCNumber baseUnitSchdQty = MCNumber.max(r.base_unit_qty(), r.base_unit_purc_schd_qty());
				
				// 残数分の基準単位数量の設定
				MCNumber arrQty = mcframe.commonCore.lang.MCNumber.max(r.arr_qty(), r.rcpt_iv_qty());
				if ((arrQty.add(r.act_abort_qty())).gt(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty()))) {
					if (baseUnitSchdQty.lte(arrQty.add(r.act_abort_qty()))) {
						continue;
					}
					else {
						dlvInstDtlR.base_unit_qty(baseUnitSchdQty.subtract(arrQty.add(r.act_abort_qty())));
					}
				}
				else {
					if (baseUnitSchdQty.lte(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty())) || !isNull(r.rcpt_iv_no())) {
						continue;
					}
					else {
						dlvInstDtlR.base_unit_qty(baseUnitSchdQty.subtract(r.purc_act_qty()).subtract(r.accpt_dfct_qty()).subtract(r.purc_abort_qty()));
					}
				}
				
				// 取引単位数量の設定
				if (isSame(r.schd_unit_cd(), r.base_unit_cd())) {
					dlvInstDtlR.trd_unit_qty(dlvInstDtlR.base_unit_qty());
				}
				else {
					dlvInstDtlR.trd_unit_qty(rvrsBaseUnitConv(dlvInstDtlR.base_unit_qty(),
							dlvInstDtlR.conv_base_qty(), dlvInstDtlR.conv_qty(),
							dlvInstDtlR.trd_unit_dec_place(), dlvInstDtlR.trd_unit_rnd_typ()));
				}
				dlvInstDtlR.dlv_slip_d_rmrks(r.dlv_slip_d_rmrks());
				dlvInstDtlR.in_to_loc_cd(r.arr_loc_cd());
				dlvInstDtlR.in_to_loc_nm(r.arr_loc_nm());
				dlvInstDtlR.in_to_str_ln_tgt_flg(!isNull(r.str_ln_cd()));
				dlvInstDtlR.in_to_str_ln_cd(r.str_ln_cd());
				dlvInstDtlR.in_to_str_ln_nm(r.str_ln_nm());
				dlvInstDtlR.base_unit_dec_place(r.base_unit_dec_place());
				dlvInstDtlR.base_unit_rnd_typ(r.base_unit_rnd_typ());
				dlvInstDtlR.dlv_rqst_dt(r.arr_schd_dt());
				dlvInstDtlR.dlv_rqst_hm(r.arr_schd_hm());
				dlvInstDtlR.purc_schd_dt(r.purc_schd_dt());
				dlvInstDtlR.sync_flg(r.sync_flg());
				dlvInstDtlR.outsrc_flg(r.outsrc_flg());
				dlvInstDtlR.purc_id_typ(poDR.purc_id_typ());
				dlvInstDtlR.dlv_cd(poDR.dlv_cd());
				dlvInstDtlR.purc_act_d_no(r.purc_act_d_no());
				dlvInstDtlR.mfg_inst_no(r.mfg_inst_no());
				dlvInstDtlR.setStatus(MCRow.CREATE);
				tmpL.add(dlvInstDtlR);
			}
			if (!isNull(tmpL) && !tmpL.isEmpty()) {
				_dlvInstDtlDataL.put(dlvInstHdrR.peg_no(), tmpL);
				showDlvInstDtl(dlvInstHdrR);
			}
		}
		
	/**
	 * Panel[DlvInstDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDlvInstDtlBtn_radd(MCEventInfo info) {
		PodR poDR = PodTable.getSelectedMCRow();
		if(!isNull(poDR)) {
			DlvInstHdrDataR hdrR = DlvInstHdrDataTable.getSelectedMCRow();
			DlvInstDtlDataR insR = insertRow(DlvInstDtlDataTable);
			insR.hdr_peg_no(hdrR.peg_no());
			insR.dlv_cd(poDR.dlv_cd());
			insR.itm_cd(poDR.itm_cd());
			insR.itm_sub1(poDR.itm_sub1());
			insR.itm_sub2(poDR.itm_sub2());
			insR.itm_sub3(poDR.itm_sub3());
			insR.dscnt_itm_flg(poDR.dscnt_itm_flg());
			setValueEx(columnDlvInstDtlData_trd_unit_cd, insR.getGUIIndex(), poDR.trd_unit_cd());
			if(insR.dscnt_itm_flg()) {
				insR.trd_unit_qty(poDR.trd_unit_qty());
				insR.base_unit_qty(poDR.base_unit_qty());
			}
			insR.base_unit_cd(poDR.base_unit_cd());
			insR.base_unit_nm(poDR.base_unit_nm());
			insR.base_unit_dec_place(poDR.base_unit_dec_place());
			insR.base_unit_rnd_typ(poDR.base_unit_rnd_typ());
			insR.in_to_loc_cd(poDR.in_to_loc_cd());
			insR.in_to_loc_nm(poDR.in_to_loc_nm());
			insR.in_to_str_ln_tgt_flg(poDR.in_to_str_ln_tgt_flg());
			insR.in_to_str_ln_cd(poDR.str_ln_cd());
			insR.in_to_str_ln_nm(poDR.str_ln_nm());
			insR.in_to_loc_wg_cd(poDR.in_to_loc_wg_cd());
			insR.site_cd(poDR.site_cd());
			insR.outsrc_sppl_cd(poDR.outsrc_sppl_cd());
			insR.lg_grp_cd(poDR.in_to_loc_lg_grp_cd());
			insR.in_to_loc_cal_cd(poDR.in_to_loc_cal_cd());
			insR.po_d_no(poDR.po_d_no());
			insR.outsrc_flg(poDR.outsrc_flg());
			insR.purc_id_typ(poDR.purc_id_typ());
			boolean ArrSkipFlg = getArrPurcSchdL().subList(ArrPurcSchdR.$po_d_no, poDR.po_d_no()).get(0).arr_skip_flg();
			insR.arr_skip_flg(ArrSkipFlg);
			setValueEx(columnDlvInstDtlData_mfg_inst_no, insR.getGUIIndex(), getMfgInstNo(poDR.po_d_no()));
			insR.setStatus(MCRow.CREATE);
			
			MCList<DlvInstDtlDataR> tmpL = _dlvInstDtlDataL.get(insR.hdr_peg_no());
			if(isNull(tmpL)) {
				tmpL = MCList.create(DlvInstDtlDataR.class);
			}
			tmpL.add(insR);
			_dlvInstDtlDataL.put(insR.hdr_peg_no(), tmpL);
		}
	}
	/**
	 * Panel[DlvInstDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDlvInstDtlBtn_rdel(MCEventInfo info) {
		DlvInstDtlDataR dtlRow = deleteRow(DlvInstDtlDataTable);
		if (!isNull(dtlRow)) {
			MCList<DlvInstDtlDataR> dlvInstDataCloneL = getDlvInstDtlDataL().shallowClone();
			_dlvInstDtlDataL.replace(dtlRow.hdr_peg_no(), dlvInstDataCloneL);
		}
		setBtnMode();
	}
	/**
	 * Panel[DlvInstDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDlvInstDtlBtn_rcopy(MCEventInfo info) {
		DlvInstDtlDataR copyR = copyRow(DlvInstDtlDataTable);
		copyR.dlv_inst_no(null);
		copyR.dlv_inst_d_no(null);
		copyR.arr_qty(null);
		copyR.act_abort_qty(null);
		copyR.purc_act_qty(null);
		copyR.purc_abort_qty(null);
		copyR.accpt_dfct_qty(null);
		copyR.rcpt_iv_no(null);
		copyR.arr_cmpl_flg(false);
		copyR.purc_cmpl_flg(false);
		copyR.setStatus(MCRow.NONE);
		copyR.setStatus(MCRow.CREATE);
		
		MCList<DlvInstDtlDataR> tmpL = _dlvInstDtlDataL.get(copyR.hdr_peg_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(DlvInstDtlDataR.class);
		}
		tmpL.add(copyR);
		_dlvInstDtlDataL.put(copyR.hdr_peg_no(), tmpL);
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> cols = super.getNotInheritCols(type, cont);
		cols.remove(DlvInstHdrDataR.$arr_pr_upd_cntr);
		cols.remove(PrmsHdrDataR.$arr_pr_upd_cntr);
		if (cont == getPrmsHdrDataL()) {
			cols.add(PrmsHdrDataR.$edi_flg);
		}
		return cols;
	}
	
	/**
	 * Panel[PrmsDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doPrmsDtlBtn_radd(MCEventInfo info) {
		PodR poDR = PodTable.getSelectedMCRow();
		if(!isNull(poDR)) {
			PrmsHdrDataR hdrR = PrmsHdrDataTable.getSelectedMCRow();
			PrmsDtlDataR insR = insertRow(PrmsDtlDataTable);
			insR.hdr_peg_no(hdrR.peg_no());
			insR.itm_cd(poDR.itm_cd());
			insR.itm_sub1(poDR.itm_sub1());
			insR.itm_sub2(poDR.itm_sub2());
			insR.itm_sub3(poDR.itm_sub3());
			insR.dscnt_itm_flg(poDR.dscnt_itm_flg());
			setValueEx(columnPrmsDtlData_trd_unit_cd, insR.getGUIIndex(), poDR.trd_unit_cd());
			if(insR.dscnt_itm_flg()) {
				insR.trd_unit_qty(poDR.trd_unit_qty());
				insR.base_unit_qty(poDR.base_unit_qty());
			}
			insR.base_unit_cd(poDR.base_unit_cd());
			insR.base_unit_nm(poDR.base_unit_nm());
			insR.base_unit_dec_place(poDR.base_unit_dec_place());
			insR.base_unit_rnd_typ(poDR.base_unit_rnd_typ());
			insR.po_d_no(poDR.po_d_no());
			insR.outsrc_flg(poDR.outsrc_flg());
			insR.dlv_cd(poDR.dlv_cd());
			insR.purc_id_typ(poDR.purc_id_typ());
			boolean ArrSkipFlg = getArrPurcSchdL().subList(ArrPurcSchdR.$po_d_no, poDR.po_d_no()).get(0).arr_skip_flg();
			insR.arr_skip_flg(ArrSkipFlg);
			setValueEx(columnPrmsDtlData_mfg_inst_no, insR.getGUIIndex(), getMfgInstNo(poDR.po_d_no()));
			insR.setStatus(MCRow.CREATE);
			
			MCList<PrmsDtlDataR> tmpL = _prmsDtlDataL.get(insR.hdr_peg_no());
			if(isNull(tmpL)) {
				tmpL = MCList.create(PrmsDtlDataR.class);
			}
			tmpL.add(insR);
			_prmsDtlDataL.put(insR.hdr_peg_no(), tmpL);
		}
	}
	/**
	 * Panel[PrmsDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doPrmsDtlBtn_rdel(MCEventInfo info) {
		PrmsDtlDataR dtlRow = deleteRow(PrmsDtlDataTable);
		if (!isNull(dtlRow)) {
			MCList<PrmsDtlDataR> prmsDataCloneL = getPrmsDtlDataL().shallowClone();
			_prmsDtlDataL.replace(dtlRow.hdr_peg_no(), prmsDataCloneL);
		}
		setBtnMode();
	}
	/**
	 * Panel[PrmsDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doPrmsDtlBtn_rcopy(MCEventInfo info) {
		PrmsDtlDataR copyR = copyRow(PrmsDtlDataTable);
		copyR.prms_rcpt_no(null);
		copyR.prms_rcpt_d_no(null);
		copyR.arr_qty(null);
		copyR.act_abort_qty(null);
		copyR.purc_act_qty(null);
		copyR.purc_abort_qty(null);
		copyR.accpt_dfct_qty(null);
		copyR.rcpt_iv_no(null);
		copyR.arr_cmpl_flg(false);
		copyR.purc_cmpl_flg(false);
		copyR.setStatus(MCRow.NONE);
		copyR.setStatus(MCRow.CREATE);
		MCList<PrmsDtlDataR> tmpL = _prmsDtlDataL.get(copyR.hdr_peg_no());
		if(isNull(tmpL)) {
			tmpL = MCList.create(PrmsDtlDataR.class);
		}
		tmpL.add(copyR);
		_prmsDtlDataL.put(copyR.hdr_peg_no(), tmpL);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBDP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0250(MCEventInfo info) {
		openMSBDP0250(info);
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0120_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[upd_dlv_inst]の押下時の処理
	 */
	@Override
	public void doBtn_upd_dlv_inst(MCEventInfo info) {
		callMS_MSBDL0120_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_prms]の押下時の処理
	 */
	@Override
	public void doBtn_upd_prms(MCEventInfo info) {
		callMS_MSBDL0120_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[upd_purc_arr_schd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_purc_arr_schd(MCEventInfo info) {
		callMS_MSBDL0120_Upd05();
	}
	@Override
	protected void setupParts() {
		super.setupParts();

		// 数量
		Pod_qty_p_PPanel.setRelateBeans(columnPod_trd_unit_cd, columnPod_trd_unit_dec_place);
		Pod_base_unit_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_cont_qty_p_PPanel.setRelateBeans(columnPod_cont_fctr_flg, columnPod_base_unit_qty, columnPod_std_cont_fctr, null, columnPod_cont_fctr_dec_place, columnPod_cont_fctr_rnd_typ);
		Pod_dlv_inst_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_prms_rcpt_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_prms_refl_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_dlv_inst_prms_rcpt_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_dlv_inst_prms_refl_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		Pod_rcpt_iv_qty_p_PPanel.setRelateBeans(columnPod_base_unit_cd, columnPod_base_unit_dec_place);
		
		ArrPurcSchd_schd_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_schd_unit_cd, columnArrPurcSchd_schd_unit_dec_place);
		ArrPurcSchd_purc_schd_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_schd_unit_cd, columnArrPurcSchd_schd_unit_dec_place);
		ArrPurcSchd_base_unit_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_base_unit_purc_schd_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_rcpt_iv_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_arr_act_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_arr_act_abort_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_purc_act_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_purc_abort_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		ArrPurcSchd_accpt_dfct_qty_p_PPanel.setRelateBeans(columnArrPurcSchd_base_unit_cd, columnArrPurcSchd_base_unit_dec_place);
		PurcAct_base_unit_qty_p_PPanel.setRelateBeans(columnPurcAct_base_unit_cd, columnPurcAct_base_unit_dec_place);
		PurcAct_trd_unit_re_arr_qty_p_PPanel.setRelateBeans(columnPurcAct_trd_unit_cd, columnPurcAct_trd_unit_dec_place);
		PurcAct_qty_p_PPanel.setRelateBeans(columnPurcAct_trd_unit_cd, columnPurcAct_trd_unit_dec_place);
		ArrAct_qty_p_PPanel.setRelateBeans(columnArrAct_trd_unit_cd, columnArrAct_trd_unit_dec_place);
		ArrAct_base_unit_qty_p_PPanel.setRelateBeans(columnArrAct_base_unit_cd, columnArrAct_base_unit_dec_place);
		DlvInstDtlData_trd_unit_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_itm_cd, columnDlvInstDtlData_itm_sub1, 
				columnDlvInstDtlData_itm_sub2, columnDlvInstDtlData_itm_sub3, columnDlvInstDtlData_trd_unit_cd, columnDlvInstDtlData_trd_unit_dec_place, 
				columnDlvInstDtlData_trd_unit_rnd_typ, columnDlvInstDtlData_conv_base_qty, columnDlvInstDtlData_conv_qty, columnDlvInstDtlData_base_unit_cd);
		DlvInstDtlData_base_unit_qty_p_PPanel.setRelateBeans(
				columnDlvInstDtlData_base_unit_cd,
				columnDlvInstDtlData_base_unit_dec_place,
				columnDlvInstDtlData_base_unit_rnd_typ, columnDlvInstDtlData_trd_unit_qty,
				columnDlvInstDtlData_conv_base_qty, columnDlvInstDtlData_conv_qty);
		DlvInstDtlData_arr_act_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		DlvInstDtlData_arr_act_abort_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		DlvInstDtlData_purc_act_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		DlvInstDtlData_purc_abort_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		DlvInstDtlData_accpt_dfct_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		DlvInstDtlData_rcpt_iv_qty_p_PPanel.setRelateBeans(columnDlvInstDtlData_base_unit_cd, columnDlvInstDtlData_base_unit_dec_place);
		
		PrmsDtlData_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_itm_cd,columnPrmsDtlData_itm_sub1,
				columnPrmsDtlData_itm_sub2,columnPrmsDtlData_itm_sub3,columnPrmsDtlData_trd_unit_cd, columnPrmsDtlData_trd_unit_dec_place, 
				columnPrmsDtlData_trd_unit_rnd_typ, columnPrmsDtlData_conv_base_qty, columnPrmsDtlData_conv_qty, columnPrmsDtlData_base_unit_cd);
		PrmsDtlData_base_unit_qty_p_PPanel.setRelateBeans(
				columnPrmsDtlData_base_unit_cd,
				columnPrmsDtlData_base_unit_dec_place,
				columnPrmsDtlData_base_unit_rnd_typ, columnPrmsDtlData_trd_unit_qty,
				columnPrmsDtlData_conv_base_qty, columnPrmsDtlData_conv_qty);
		PrmsDtlData_arr_act_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		PrmsDtlData_arr_act_abort_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		PrmsDtlData_purc_act_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		PrmsDtlData_purc_abort_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		PrmsDtlData_accpt_dfct_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		PrmsDtlData_rcpt_iv_qty_p_PPanel.setRelateBeans(columnPrmsDtlData_base_unit_cd, columnPrmsDtlData_base_unit_dec_place);
		
		//単価・金額
		PurcAct_trd_cur_upri_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_upri_dec_place);
		PurcAct_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_upri_dec_place);
		PurcAct_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_upri_dec_place);
		PurcAct_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		PurcAct_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		PurcAct_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		PurcAct_trd_cur_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		PurcAct_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		PurcAct_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_amt_dec_place);
		
		PurcAct_base_cur_upri_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_upri_dec_place);
		PurcAct_base_cur_proc_upri_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_upri_dec_place);
		PurcAct_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_upri_dec_place);
		PurcAct_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		PurcAct_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		PurcAct_base_cur_proc_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		PurcAct_base_cur_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		PurcAct_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		PurcAct_base_cur_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_base_cur_cd, columnPurcAct_base_cur_amt_dec_place);
		
		PurcAct_ptax_cur_upri_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_upri_dec_place);
		PurcAct_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_upri_dec_place);
		PurcAct_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_upri_dec_place);
		PurcAct_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		PurcAct_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		PurcAct_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		PurcAct_ptax_cur_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		PurcAct_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		PurcAct_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnPurcAct_ptax_cur_cd, columnPurcAct_ptax_cur_amt_dec_place);
		
		PurcAct_wtax_amt_p_PPanel.setRelateBeans(columnPurcAct_trd_cur_cd, columnPurcAct_trd_cur_upri_dec_place);
		
		//　納入場所
		Pod_in_to_loc_addr_p_PPanel.setRelateBeans(columnPod_in_to_loc_cd, columnPod_in_to_loc_nm);
		// 発注先
		Po_sppl_addr_p_PPanel.setRelateBeans(columnPo_sppl_cd, columnPo_sppl_nm);
		
		// 棚・ライン
		DlvInstDtlData_str_ln_p_PPanel.setRelateBeans(columnDlvInstDtlData_in_to_loc_cd, columnDlvInstDtlData_in_to_str_ln_tgt_flg);
		
		// ロットＮＯ・サブロットＮＯ
		ArrPurcSchd_lot_no_p_PPanel.setRelateBeans(columnArrPurcSchd_itm_cd, columnArrPurcSchd_itm_sub1, columnArrPurcSchd_itm_sub2, columnArrPurcSchd_itm_sub3, columnArrPurcSchd_lot_mng_typ, columnArrPurcSchd_lot_no_typ, columnArrPurcSchd_sublot_mng_typ, columnArrPurcSchd_sublot_no_typ, true);
		DlvInstDtlData_dlv_p_PPanel.setRelateBeans(columnPod_cst_cd);
		DlvInstDtlData_tdlv_p_PPanel.setTdlvMode(true);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(columnDlvInstDtlData_in_to_loc_cd);
	}
	
	/**
	 * 購買納品伝票発行画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBDP0250 (MCEventInfo info) {
		ArrPurcSchdR arrPurcSchdR = ArrPurcSchdTable.getSelectedMCRow();
		if (isNull(arrPurcSchdR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0250");
		aso.putCnd(crtOpenMSBDP0250CndR(aso, arrPurcSchdR));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBD.MSBDP0250.CndR crtOpenMSBDP0250CndR(MAUCP_AppScreenOpener aso, ArrPurcSchdR r) {	
		mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt p = (mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt) aso.getPanel();
		mcframe.clientMSBD.MSBDP0250.CndR to = mcframe.clientMSBD.MSBDP0250.CndR.create();
		to.dlv_slip_no(r.dlv_slip_no());
		to.dlv_slip_seq(r.dlv_slip_seq());
		to.ope(p.Cnd_ope_DLVSLIP.getActionCommand());
		return to;
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setStatusColumn();
		
		getBtnR().dlv_inst_print_flg(true);
		getBtnR().dlv_slip_print_flg(true);
		setBtnMode();
	}
	
	
	@Override
	public void afterOpen() {
		super.afterOpen();
		setDividerLocation("DlvInstHdrPanel", 120);
		setDividerLocation("PrmsHdrPanel", 120);
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		// 予定日
		columnDlvInstDtlData_dlv_rqst_dt.addLCListener(this);
		columnDlvInstDtlData_purc_schd_dt.addLCListener(this);
		columnPrmsDtlData_prms_dlv_dt.addLCListener(this);
		columnPrmsDtlData_purc_schd_dt.addLCListener(this);

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(ArrPurcSchdTable, createArrPurcSchdListListener());
		setListListener(DlvInstDtlDataTable, createDlvInstDtlDataListListener());
		setListListener(PrmsDtlDataTable, createPrmsDtlDataListListener());
		columnDlvInstDtlData_tdlv_cd.addLCListener(this);
	}
	
	@Override
	public MCList<?> getDlvInstDtlData_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		PodR podR = PodTable.getSelectedMCRow();
		
		row.setStringNE(BpCols.$i_cst_cd, podR.cst_cd());
		row.setDateNE(BpCols.$i_dt, podR.slo_dt());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDlvInstDtlData_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public MCList<?> getDlvInstDtlData_tdlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		PodR podR = PodTable.getSelectedMCRow();
		
		row.setDateNE(BpCols.$i_dt, podR.slo_dt());
		return super.getDlvInstDtlData_tdlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	protected MAUDP_RowListener createArrPurcSchdListListener() {
		return new ArrPurcSchdListRowListener();
	}
	
	protected class ArrPurcSchdListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);

			MCConstRow r = event.getSourceRow();
			if (r != null) {
				ArrPurcSchdR arrPurcSchdR = (ArrPurcSchdR)r;
				arrPurcSchdR.check(true);
			}
		}
	}

	protected MAUDP_RowListener createDlvInstDtlDataListListener() {
		return new DlvInstDtlDataListRowListener();
	}
	
	protected class DlvInstDtlDataListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			//値を変更した詳細に紐付くヘッダのステータスを変更する
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				DlvInstDtlDataR dlvInstDtlDataR = (DlvInstDtlDataR)r;
				MCIndexKey idxKey = getDlvInstHdrDataL().createIndex(DlvInstHdrDataR.$peg_no);
				DlvInstHdrDataR dlvInstHdrDataR = getDlvInstHdrDataL().getFirst(idxKey, dlvInstDtlDataR.hdr_peg_no());
				if(dlvInstHdrDataR.isStatusNone()) {
					dlvInstHdrDataR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	protected MAUDP_RowListener createPrmsDtlDataListListener() {
		return new PrmsDtlDataListRowListener();
	}
	
	protected class PrmsDtlDataListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			//値を変更した詳細に紐付くヘッダのステータスを変更する
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				PrmsDtlDataR prmsDtlDataR = (PrmsDtlDataR)r;
				MCIndexKey idxKey = getPrmsHdrDataL().createIndex(PrmsHdrDataR.$peg_no);
				PrmsHdrDataR prmsHdrDataR = getPrmsHdrDataL().getFirst(idxKey, prmsDtlDataR.hdr_peg_no());
				if(prmsHdrDataR.isStatusNone()) {
					prmsHdrDataR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	
	
	@Override
	public void doPod_NC(MCEventInfo info) {
		super.doPod_NC(info);
		
		int idx = info.getOldIndex();
		if (idx >= 0) {
			PodR row = getPodL().get(idx);
			_dlvInstHdrDataL.put(row.po_d_no(), getDlvInstHdrDataL().clone());
			_prmsHdrDataL.put(row.po_d_no(), getPrmsHdrDataL().clone());
			DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
			if(!isNull(dlvInstHdrR)) {
				_dlvInstDtlDataL.put(dlvInstHdrR.peg_no(), getDlvInstDtlDataL().clone());
			}
			PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();
			if(!isNull(prmsHdrR)) {
				_prmsDtlDataL.put(prmsHdrR.peg_no(), getPrmsDtlDataL().clone());
			}
		}
		
		idx = info.getEventIndex();
		if (idx >= 0) {
			PodR row = getPodL().get(idx);
			showDatas(row);
		}
		setBtnMode();
	}

	@Override
	public void doDlvInstHdrData_NC(MCEventInfo info) {
		super.doDlvInstHdrData_NC(info);

		int idx = info.getEventIndex();
		if (idx >= 0) {
			// 関連する明細データを表示する
			DlvInstHdrDataR row = getDlvInstHdrDataL().get(idx);
			showDlvInstDtl(row);
		}
		setBtnMode();
	}

	@Override
	public void doDlvInstDtlData_NC(MCEventInfo info) {
		super.doDlvInstDtlData_NC(info);
		setBtnMode();
	}

	@Override
	public void doPrmsHdrData_NC(MCEventInfo info) {
		super.doPrmsHdrData_NC(info);
		
		int idx = info.getEventIndex();
		if (idx >= 0) {
			// 関連する明細データを表示する
			PrmsHdrDataR row = getPrmsHdrDataL().get(idx);
			showPrmsRcptDtl(row);
		}
		setBtnMode();
	}
	
	@Override
	public void doPrmsDtlData_NC(MCEventInfo info) {
		super.doPrmsDtlData_NC(info);
		setBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isChanged(DlvInstHdrDataTable) || isChanged(DlvInstDtlDataTable)
					|| isChanged(PrmsHdrDataTable) || isChanged(PrmsDtlDataTable)
					|| isChanged(ArrPurcSchdTable)) {

				return confirmRegDataClear();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getPoL(), getPodL(), getArrPurcSchdL(), getArrActL(),
				getPurcActL(), getDlvInstHdrDataL(), getDlvInstDtlDataL(),
				getPrmsHdrDataL(), getPrmsDtlDataL());
		clearHiddenList();
		setSRCHStatus();
		setStatusColumn();
		setBtnMode();
		setFooterMode();
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD_DLVINST.isSelected()) {
			ArrPurcSchdTable.setStatusColumnVisible(false);
			PrmsHdrDataTable.setStatusColumnVisible(false);
			PrmsDtlDataTable.setStatusColumnVisible(false);
			DlvInstHdrDataTable.setStatusColumnVisible(true);
			DlvInstDtlDataTable.setStatusColumnVisible(true);
		}
		else if (Cnd_ope_UPD_PRMS.isSelected()) {
			ArrPurcSchdTable.setStatusColumnVisible(false);
			PrmsHdrDataTable.setStatusColumnVisible(true);
			PrmsDtlDataTable.setStatusColumnVisible(true);
			DlvInstHdrDataTable.setStatusColumnVisible(false);
			DlvInstDtlDataTable.setStatusColumnVisible(false);
		}
		else if (Cnd_ope_UPD_SCHD.isSelected()) {
			ArrPurcSchdTable.setStatusColumnVisible(true);
			PrmsHdrDataTable.setStatusColumnVisible(false);
			PrmsDtlDataTable.setStatusColumnVisible(false);
			DlvInstHdrDataTable.setStatusColumnVisible(false);
			DlvInstDtlDataTable.setStatusColumnVisible(false);
		}
	}


	//********************** コンボボックスの絞込 **************************

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setInitFocus();
	}
	
	protected void setInitFocus() {
		CndPanel.focusFirstComponent();
	}

	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD_DLVINST.isSelected()) {
			setUPD_DLVINSTStatus();
		}
		else if (Cnd_ope_UPD_PRMS.isSelected()) {
			setUPD_PRMSStatus();
		}
		else if (Cnd_ope_UPD_SCHD.isSelected()) {
			setUPD_SCHDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		
		PoTable.selectLeftmostColumn(0);
		PodTable.selectLeftmostColumn(0);
		DlvInstHdrDataTable.selectLeftmostColumn(0);
		PrmsHdrDataTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFooterMode();
		setDlvInstPrntBtnMode();
	}
	
	@Override
	public void setUPD_PRMSStatus() {
		super.setUPD_PRMSStatus();
		setFooterMode();
	}
	
	@Override
	public void setUPD_SCHDStatus() {
		super.setUPD_SCHDStatus();
		setFooterMode();
	}
	
	@Override
	public void setUPD_DLVINSTStatus() {
		super.setUPD_DLVINSTStatus();
		setFooterMode();
		setDlvInstPrntBtnMode();
	}

	protected void setFooterMode() {
		setDlvInstPrntFlgMode();
		setDlvSlipPrntFlgMode();
		setPurcDdlvDlvSlipPrntFlgMode();
	}

	protected void setDlvInstPrntBtnMode() {
		
		PodR dtlR = getPodL().get(0);
		
		if(Cnd_ope_UPD_DLVINST.isSelected()) {
			if(dtlR.crnt_edi_dlv_inst_flg()) {
				getBtnR().dlv_inst_print_flg(false);
				Btn_dlv_inst_print_flg.setMode(MCMode.ENABLE);
			}
			else {
				getBtnR().dlv_inst_print_flg(true);
				Btn_dlv_inst_print_flg.setMode(MCMode.REQUIRED);
			}
		}
		else if(Cnd_ope_REF.isSelected()) {
			if(dtlR.edi_dlv_inst_flg()) {
				getBtnR().dlv_inst_print_flg(false);
				Btn_dlv_inst_print_flg.setMode(MCMode.ENABLE);
			}
			else {
				getBtnR().dlv_inst_print_flg(true);
				Btn_dlv_inst_print_flg.setMode(MCMode.REQUIRED);
			}
		}
	}
	
	protected void setDlvInstPrntFlgMode() {
		if (getPoL().isEmpty()) {
			getBtnR().dlv_inst_print_flg(false);
			Btn_dlv_inst_print_flg.setMode(MCMode.READ_ONLY);
			return;
		}
		if (Cnd_ope_UPD_PRMS.isSelected() || Cnd_ope_UPD_SCHD.isSelected()) {
			getBtnR().dlv_inst_print_flg(false);
			Btn_dlv_inst_print_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			getBtnR().dlv_inst_print_flg(true);
			Btn_dlv_inst_print_flg.setMode(MCMode.REQUIRED);
		}
	}

	protected void setDlvSlipPrntFlgMode() {
		if (getPoL().isEmpty()) {
			getBtnR().dlv_slip_print_flg(false);
			Btn_dlv_slip_print_flg.setMode(MCMode.READ_ONLY);
			return;
		}
		PoR poR = getPoL().get(0);
		if (isNull(poR.sppl_ship_form_cd())) {
			getBtnR().dlv_slip_print_flg(false);
			Btn_dlv_slip_print_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			getBtnR().dlv_slip_print_flg(getDefDlvSlipPrntFlg());
			Btn_dlv_slip_print_flg.setMode(MCMode.REQUIRED);
		}
	}
	
	protected void setPurcDdlvDlvSlipPrntFlgMode() {
		if (existPurcDdlv()) {
			getBtnR().purc_ddlv_dlv_slip_print_flg(getDefDlvSlipPrntFlg());
			Btn_purc_ddlv_dlv_slip_print_flg.setMode(MCMode.REQUIRED);
		}
		else {
			getBtnR().purc_ddlv_dlv_slip_print_flg(false);
			Btn_purc_ddlv_dlv_slip_print_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected boolean existPurcDdlv() {
		for (PodR r : getPodL()) {
			if (MSC_DRCT_DLV_TYP.isDDLV(r.drct_dlv_typ())
				&& !isNull(r.slo_no())) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean getDefDlvSlipPrntFlg() {
		if (getPoL().isEmpty()) {
			return false;
		}
		PoR poR = getPoL().get(0);
		return
			Cnd_ope_UPD_DLVINST.isSelected() && poR.dlv_inst_dlv_slip_flg() ? true :
			Cnd_ope_UPD_PRMS.isSelected() && poR.prms_rcpt_dlv_slip_flg() ? true :
			Cnd_ope_UPD_SCHD.isSelected() ? true :
			Cnd_ope_REF.isSelected() && (poR.dlv_inst_dlv_slip_flg() || poR.prms_rcpt_dlv_slip_flg()) ? true : false;
	}
	
	
	protected void setBtnMode() {
		PodR r = PodTable.getSelectedMCRow();
		
		// 行追加、行削除、行コピーボタン
		if (Cnd_ope_UPD_DLVINST.isSelected()) {
			if (r == null || !isRemainQtyExists()) {
				DlvInstHdrBtn_radd.setMode(MCMode.DISABLE);
				DlvInstHdrBtn_rdel.setMode(MCMode.DISABLE);
				DlvInstHdrBtn_rcopy.setMode(MCMode.DISABLE);
				DlvInstDtlBtn_srchDlvInstRecv.setMode(MCMode.DISABLE);
				DlvInstDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
				DlvInstDtlBtn_radd.setMode(MCMode.DISABLE);
				DlvInstDtlBtn_rdel.setMode(MCMode.DISABLE);
				DlvInstDtlBtn_rcopy.setMode(MCMode.DISABLE);
				// 実績がない明細行は操作可能
				if (r != null) {
					DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
					if (dlvInstHdrR != null) {
						DlvInstDtlDataR dlvInstDtlR = DlvInstDtlDataTable.getSelectedMCRow();
						if (dlvInstDtlR != null) {
							if (!isDlvInstExistsAct(dlvInstDtlR) && !isDlvInstExistsIvPart(dlvInstDtlR)) {
								setDefaultMode(DlvInstDtlBtn_rdel);
								setDefaultMode(DlvInstHdrBtn_rdel);
							}
						}
					}
				}
			}
			else {
				DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
				
				setDefaultMode(DlvInstHdrBtn_radd);
				if (dlvInstHdrR == null) {
					DlvInstHdrBtn_rdel.setMode(MCMode.DISABLE);
					DlvInstHdrBtn_rcopy.setMode(MCMode.DISABLE);
					DlvInstDtlBtn_radd.setMode(MCMode.DISABLE);
					DlvInstDtlBtn_srchDlvInstRecv.setMode(MCMode.DISABLE);
					DlvInstDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
					
					DlvInstDtlDataR dlvInstDtlR = DlvInstDtlDataTable.getSelectedMCRow();
					if (dlvInstDtlR == null) {
						DlvInstDtlBtn_rdel.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(DlvInstDtlBtn_rdel);
						setDefaultMode(DlvInstDtlBtn_rcopy);
					}
				}
				else {
					if (dlvInstHdrR.can_flg()) {
						DlvInstHdrBtn_rdel.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_radd.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_rdel.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(DlvInstHdrBtn_rdel);
						setDefaultMode(DlvInstDtlBtn_arrSchdCopy);
						setDefaultMode(DlvInstDtlBtn_radd);
						setDefaultMode(DlvInstDtlBtn_rdel);
						setDefaultMode(DlvInstDtlBtn_rcopy);
					}
					setDefaultMode(DlvInstHdrBtn_rcopy);
					
					if(isNull(dlvInstHdrR.dlv_cd()) || dlvInstHdrR.can_flg()) {
						DlvInstDtlBtn_srchDlvInstRecv.setMode(MCMode.DISABLE);	
					}
					else {
						if(getDlvInstDtlDataL().size() == 0) {
							setDefaultMode(DlvInstDtlBtn_srchDlvInstRecv);
						}
						else {
							DlvInstDtlBtn_srchDlvInstRecv.setMode(MCMode.DISABLE);
						}
					}
					if (dlvInstHdrR.isStatusDelete() || dlvInstHdrR.can_flg()) {
						DlvInstDtlBtn_radd.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(DlvInstDtlBtn_radd);
					}

					DlvInstDtlDataR dlvInstDtlR = DlvInstDtlDataTable.getSelectedMCRow();
					if (dlvInstHdrR.can_flg() || dlvInstDtlR == null) {
						DlvInstDtlBtn_rdel.setMode(MCMode.DISABLE);
						DlvInstDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						if (isDlvInstExistsAct(dlvInstDtlR) || isDlvInstExistsIvPart(dlvInstDtlR) || dlvInstHdrR.isStatusDelete()) {
							DlvInstDtlBtn_rdel.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(DlvInstDtlBtn_rdel);
						}
						if (dlvInstHdrR.isStatusDelete()) {
							DlvInstDtlBtn_rcopy.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(DlvInstDtlBtn_rcopy);
						}
					}
					if (getDlvInstDtlDataL().size() == 0 && !dlvInstHdrR.can_flg()) {
						setDefaultMode(DlvInstDtlBtn_arrSchdCopy);
					}
					else {
						DlvInstDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
					}
				}
			}
		}
		else if (Cnd_ope_UPD_PRMS.isSelected()) {
			if (r == null  || !isRemainQtyExists()) {
				PrmsHdrBtn_radd.setMode(MCMode.DISABLE);
				PrmsHdrBtn_rdel.setMode(MCMode.DISABLE);
				PrmsHdrBtn_rcopy.setMode(MCMode.DISABLE);
				PrmsDtlBtn_radd.setMode(MCMode.DISABLE);
				PrmsDtlBtn_rdel.setMode(MCMode.DISABLE);
				PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
				PrmsDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
				// 実績がない明細行は操作可能
				if (r != null) {
					PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();
					if (prmsHdrR != null) {
						PrmsDtlDataR prmsDtlR = PrmsDtlDataTable.getSelectedMCRow();
						if (prmsDtlR != null) {
							if (!isPrmsExistsAct(prmsDtlR) && !isPrmsExistsIvPart(prmsDtlR)) {
								setDefaultMode(PrmsDtlBtn_rdel);
								setDefaultMode(PrmsHdrBtn_rdel);
							}
						}
					}
				}
			}
			else {
				PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();

				setDefaultMode(PrmsHdrBtn_radd);
				if(prmsHdrR == null) {
					PrmsHdrBtn_rdel.setMode(MCMode.DISABLE);
					PrmsHdrBtn_rcopy.setMode(MCMode.DISABLE);
					PrmsDtlBtn_radd.setMode(MCMode.DISABLE);
					PrmsDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
					
					PrmsDtlDataR prmsDtlR = PrmsDtlDataTable.getSelectedMCRow();
					if(prmsDtlR == null) {
						PrmsDtlBtn_rdel.setMode(MCMode.DISABLE);
						PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(PrmsDtlBtn_rdel);
						setDefaultMode(PrmsDtlBtn_rcopy);
					}
				}
				else {
					if (prmsHdrR.can_flg()) {
						PrmsHdrBtn_rdel.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(PrmsHdrBtn_rdel);
					}
					setDefaultMode(PrmsHdrBtn_rcopy);
					if (!prmsHdrR.isStatusDelete()) {
						setDefaultMode(PrmsHdrBtn_rcopy);
						setDefaultMode(PrmsDtlBtn_radd);
						setDefaultMode(PrmsDtlBtn_rdel);
					}
					else {
						PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
						PrmsDtlBtn_radd.setMode(MCMode.DISABLE);
					}
					
					PrmsDtlDataR prmsDtlR = PrmsDtlDataTable.getSelectedMCRow();
					if(prmsDtlR == null) {
						PrmsDtlBtn_rdel.setMode(MCMode.DISABLE);
						PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else if (prmsHdrR.can_flg()) {
						PrmsDtlBtn_radd.setMode(MCMode.DISABLE);
						PrmsDtlBtn_rdel.setMode(MCMode.DISABLE);
						PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						if (isPrmsExistsAct(prmsDtlR) || isPrmsExistsIvPart(prmsDtlR) || prmsHdrR.isStatusDelete()) {
							PrmsDtlBtn_rdel.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(PrmsDtlBtn_rdel);
						}
						
						if (!prmsHdrR.isStatusDelete()) {
							setDefaultMode(PrmsDtlBtn_rcopy);
						}
						else {
							PrmsDtlBtn_rcopy.setMode(MCMode.DISABLE);
						}
					}

					if(getPrmsDtlDataL().size() == 0 && !prmsHdrR.can_flg()) {
						setDefaultMode(PrmsDtlBtn_arrSchdCopy);
					}
					else {
						PrmsDtlBtn_arrSchdCopy.setMode(MCMode.DISABLE);
					}
				}
			}
		}
	}
	
	/**
	 * 検索時に裏リストをクリアする
	 */
	protected void clearHiddenList() {
		_arrPurcSchdL = new HashMap<String, MCList<ArrPurcSchdR>>();
		_arrActL = new HashMap<String, MCList<ArrActR>>();
		_purcActL = new HashMap<String, MCList<PurcActR>>();
		_dlvInstHdrDataL = new HashMap<String, MCList<DlvInstHdrDataR>>();
		_dlvInstDtlDataL = new HashMap<MCNumber, MCList<DlvInstDtlDataR>>();
		_prmsHdrDataL = new HashMap<String, MCList<PrmsHdrDataR>>();
		_prmsDtlDataL = new HashMap<MCNumber, MCList<PrmsDtlDataR>>();
	}
	
	/**
	 * 裏リストを作成する
	 * @param down2
	 * @param down3
	 * @param down4
	 * @param down5
	 * @param down6
	 * @param down7
	 * @param down8
	 */
	protected void setHiddenList(MCList<ArrPurcSchdR> down2, MCList<ArrActR> down3,
			MCList<PurcActR> down4, MCList<DlvInstHdrDataR> down5,
			MCList<DlvInstDtlDataR> down6, MCList<PrmsHdrDataR> down7,
			MCList<PrmsDtlDataR> down8) {

		// 入荷・仕入予定の裏リスト
		MCIndexKey idxKey = down2.createIndex(ArrPurcSchdR.$po_d_no);
		for(ArrPurcSchdR r : down2.groupBy(ArrPurcSchdR.$po_d_no)) {
			MCList<ArrPurcSchdR> tmpL = down2.subList(idxKey, r.po_d_no());
			_arrPurcSchdL.put(r.po_d_no(), tmpL);
		}
		
		// 入荷実績の裏リスト
		idxKey = down3.createIndex(ArrActR.$po_d_no);
		for(ArrActR r : down3.groupBy(ArrActR.$po_d_no)) {
			MCList<ArrActR> tmpL = down3.subList(idxKey, r.po_d_no());
			_arrActL.put(r.po_d_no(), tmpL);
		}

		// 仕入実績の裏リスト
		idxKey = down4.createIndex(PurcActR.$po_d_no);
		for(PurcActR r : down4.groupBy(PurcActR.$po_d_no)) {
			MCList<PurcActR> tmpL = down4.subList(idxKey, r.po_d_no());
			_purcActL.put(r.po_d_no(), tmpL);
		}

		// 納入指示ヘッダに紐付ＮＯを設定
		for(DlvInstHdrDataR r : down5) {
			r.peg_no(_dlvInstHdrPegNo++);
		}

		// 納入指示ヘッダの裏リスト
		idxKey = down5.createIndex(DlvInstHdrDataR.$po_d_no);
		for(DlvInstHdrDataR r : down5.groupBy(DlvInstHdrDataR.$po_d_no)) {
			MCList<DlvInstHdrDataR> tmpL = down5.subList(idxKey, r.po_d_no());
			_dlvInstHdrDataL.put(r.po_d_no(), tmpL);
		}
		
		// 納入指示明細の裏リスト
		idxKey = down6.createIndex(DlvInstDtlDataR.$dlv_inst_no);
		MCIndexKey dlvInstHdrDataKey = down5.createIndex(DlvInstHdrDataR.$dlv_inst_no);
		for(DlvInstDtlDataR r : down6.groupBy(DlvInstDtlDataR.$dlv_inst_no)) {
			MCList<DlvInstDtlDataR> tmpL = down6.subList(idxKey, r.dlv_inst_no());
			DlvInstHdrDataR dlvInstHdrDataR = down5.getFirst(dlvInstHdrDataKey, r.dlv_inst_no());
			tmpL.setValueNE(DlvInstDtlDataR.$hdr_peg_no, dlvInstHdrDataR.peg_no());
			_dlvInstDtlDataL.put(dlvInstHdrDataR.peg_no(), tmpL);
		}
		
		// 納期回答受領ヘッダに紐付ＮＯを設定
		for(PrmsHdrDataR r : down7) {
			r.peg_no(_prmsHdrPegNo++);
		}
		
		// 納期回答受領ヘッダの裏リスト
		idxKey = down7.createIndex(PrmsHdrDataR.$po_d_no);
		for(PrmsHdrDataR r : down7.groupBy(PrmsHdrDataR.$po_d_no)) {
			MCList<PrmsHdrDataR> tmpL = down7.subList(idxKey, r.po_d_no());
			_prmsHdrDataL.put(r.po_d_no(), tmpL);
		}

		// 納期回答受領明細の裏リスト
		idxKey = down8.createIndex(PrmsDtlDataR.$prms_rcpt_no);
		MCIndexKey PrmsHdrDataKey = down7.createIndex(PrmsDtlDataR.$prms_rcpt_no);
		for(PrmsDtlDataR r : down8.groupBy(PrmsDtlDataR.$prms_rcpt_no)) {
			MCList<PrmsDtlDataR> tmpL = down8.subList(idxKey, r.prms_rcpt_no());
			PrmsHdrDataR prmsHdrDataR = down7.getFirst(PrmsHdrDataKey, r.prms_rcpt_no());
			tmpL.setValueNE(PrmsDtlDataR.$hdr_peg_no, prmsHdrDataR.peg_no());
			_prmsDtlDataL.put(prmsHdrDataR.peg_no(), tmpL);
		}
	}

	/**
	 * 裏リストを作成する
	 * @param down0
	 */
	protected void setHiddenList(MCList<DlvInstDtlDataR> down0) {

		DlvInstHdrDataR dlvInstHdrDataR = DlvInstHdrDataTable.getSelectedMCRow();
		
		PodR podR = PodTable.getSelectedMCRow();
		String mfgInstNo = getMfgInstNo(podR.po_d_no());
		for(DlvInstDtlDataR r : down0) {
			r.hdr_peg_no(dlvInstHdrDataR.peg_no());
			r.in_to_loc_cd(podR.in_to_loc_cd());
			r.in_to_loc_nm(podR.in_to_loc_nm());
			r.in_to_loc_wg_cd(podR.in_to_loc_wg_cd());
			r.site_cd(podR.site_cd());
			r.lg_grp_cd(podR.in_to_loc_lg_grp_cd());
			r.in_to_loc_cal_cd(podR.in_to_loc_cal_cd());
			r.in_to_str_ln_tgt_flg(podR.in_to_str_ln_tgt_flg());
			r.in_to_str_ln_cd(podR.str_ln_cd());
			r.in_to_str_ln_nm(podR.str_ln_nm());
			if (!isNull(r.inst_dlv_cd())) {
				r.dlv_cd(r.inst_dlv_cd());
			}
			else {
				r.dlv_cd(podR.dlv_cd());
			}
			r.purc_schd_dt(r.dlv_rqst_dt());
			r.sync_flg(true);
			r.outsrc_flg(podR.outsrc_flg());
			r.mfg_inst_no(mfgInstNo);
			r.setStatus(MCRow.CREATE);
		}
		
		// 納入指示明細の裏リスト
		MCList<DlvInstDtlDataR> tmpL = down0;
		_dlvInstDtlDataL.put(dlvInstHdrDataR.peg_no(), tmpL);
		
		showDlvInstDtl(dlvInstHdrDataR);
		setBtnMode();
	}
	
	protected String getMfgInstNo(String poDNo) {
		MCList<ArrPurcSchdR> purcSchdL = getArrPurcSchdL().subList(ArrPurcSchdR.$po_d_no, poDNo);
		
		if (isSame(purcSchdL.groupBy(ArrPurcSchdR.$mfg_inst_no).size(), 1)) {
			return purcSchdL.getString(0, ArrPurcSchdR.$mfg_inst_no);
		}
		return null;
	}
	
	/**
	 * 選択している発注明細ＮＯを元に裏リストを差し替える
	 */
	protected void setHiddenList() {
		PodR row = PodTable.getSelectedMCRow();
		if(!isNull(row)) {
			_dlvInstHdrDataL.put(row.po_d_no(), getDlvInstHdrDataL().clone());
			_prmsHdrDataL.put(row.po_d_no(), getPrmsHdrDataL().clone());
			DlvInstHdrDataR dlvInstHdrR = DlvInstHdrDataTable.getSelectedMCRow();
			if(!isNull(dlvInstHdrR)) {
				_dlvInstDtlDataL.put(dlvInstHdrR.peg_no(), getDlvInstDtlDataL().clone());
			}
			PrmsHdrDataR prmsHdrR = PrmsHdrDataTable.getSelectedMCRow();
			if(!isNull(prmsHdrR)) {
				_prmsDtlDataL.put(prmsHdrR.peg_no(), getPrmsDtlDataL().clone());
			}
		}
	}

	/**
	 * 納入指示ヘッダ、納期回答受領ヘッダの紐付ＮＯをクリア
	 */
	protected void clearPegNo() {
		_dlvInstHdrPegNo = 0;
		_prmsHdrPegNo = 0;
	}
	
	/**
	 * 発注明細に対する入荷予定などを表示する
	 * @param row 対象の発注明細
	 */
	protected void showDatas(PodR row) {
		if (!isNull(row)){
			getArrPurcSchdL().setAll(_arrPurcSchdL.get(row.po_d_no()));
			getArrActL().setAll(_arrActL.get(row.po_d_no()));
			getPurcActL().setAll(_purcActL.get(row.po_d_no()));
			getDlvInstHdrDataL().setAll(_dlvInstHdrDataL.get(row.po_d_no()));
			getPrmsHdrDataL().setAll(_prmsHdrDataL.get(row.po_d_no()));
			getDlvInstDtlDataL().clear();
			getPrmsDtlDataL().clear();
			
			DlvInstHdrDataTable.selectRowNoFocus(0);
			PrmsHdrDataTable.selectRowNoFocus(0);
			
			ArrPurcSchdTable.adjustWidth();
			ArrActTable.adjustWidth();
			PurcActTable.adjustWidth();
			DlvInstHdrDataTable.adjustWidth();
			PrmsHdrDataTable.adjustWidth();
		}
		else {
			getArrPurcSchdL().clear();
			getArrActL().clear();
			getPurcActL().clear();
			getDlvInstHdrDataL().clear();
			getDlvInstDtlDataL().clear();
			getPrmsHdrDataL().clear();
			getPrmsDtlDataL().clear();
		}
	}

	/**
	 * 納入指示ヘッダに対する納入指示明細を表示する
	 * @param row 対象の納入指示ヘッダ
	 */
	protected void showDlvInstDtl(DlvInstHdrDataR row) {
		if (!isNull(row)){
			getDlvInstDtlDataL().setAll(_dlvInstDtlDataL.get(row.peg_no()));
			DlvInstDtlDataTable.adjustWidth();
		}
		else {
			getDlvInstDtlDataL().clear();
		}
	}

	/**
	 * 納期回答受領ヘッダに対する納期回答受領明細を表示する
	 * @param row 対象の納期回答受領ヘッダ
	 */
	protected void showPrmsRcptDtl(PrmsHdrDataR row) {
		if (!isNull(row)){
			getPrmsDtlDataL().setAll(_prmsDtlDataL.get(row.peg_no()));
			PrmsDtlDataTable.adjustWidth();
		}
		else {
			getPrmsDtlDataL().clear();
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnPrmsHdrData_arr_schd_refl_flg) {
			PrmsHdrDataR prmsHdrDataR = getPrmsHdrDataL().get(info.getEventIndex());
			if(!prmsHdrDataR.arr_schd_refl_flg()) {
				prmsHdrDataR.arr_schd_refl_dt(null);
			}
			else {
				prmsHdrDataR.arr_schd_refl_dt(getToday());
				for (PrmsDtlDataR prmsDtlDataR : getPrmsDtlDataL()) {
					if (prmsDtlDataR.isStatusNone()) {
						prmsDtlDataR.setStatus(Status.MODIFY);
					}
				}
			}
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		// 予定日の反映
		if (lc == columnDlvInstDtlData_dlv_rqst_dt) {
			DlvInstDtlDataR dlvInstDtlDataR = getDlvInstDtlDataL().get(info.getEventIndex());
			MCIndexKey podKey = getPodL().createIndex(PodR.$po_d_no);
			PodR podR = getPodL().getFirst(podKey, dlvInstDtlDataR.po_d_no());
			// 仕入直送でない、下請対象の発注先でない、VMI、無償受給以外、入荷基準でない場合のみ日付計算
			PoR poR = getPoL().get(0);
			if (isNull(dlvInstDtlDataR.dlv_cd())
					&& !poR.subcon_flg()
					&& !MAC_PURC_ID_TYP.isVMI(dlvInstDtlDataR.purc_id_typ())
					&& !MAC_PURC_ID_TYP.isFFR_RCV(dlvInstDtlDataR.purc_id_typ())
					&& !MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
				setSchdDt(dlvInstDtlDataR, callGetSchdDt(getSchdDtEditCnd(dlvInstDtlDataR, MSUCP_PurcUtil.$dlv_rqst_dt), podR));
			}
			else {
				if(!MAC_PURC_ID_TYP.isVMI(dlvInstDtlDataR.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(dlvInstDtlDataR.purc_id_typ())) {
					
					dlvInstDtlDataR.purc_schd_dt(dlvInstDtlDataR.dlv_rqst_dt());
				}
			}
			setSyncFlg(dlvInstDtlDataR);
		}
		else if (lc == columnDlvInstDtlData_purc_schd_dt) {
			DlvInstDtlDataR dlvInstDtlDataR = getDlvInstDtlDataL().get(info.getEventIndex());
			// 仕入直送の場合のみ日付を連携
			if(!isNull(dlvInstDtlDataR.dlv_cd())) {
				dlvInstDtlDataR.dlv_rqst_dt(dlvInstDtlDataR.purc_schd_dt());
			}
			setSyncFlg(dlvInstDtlDataR);
		}
		else if (lc == columnPrmsDtlData_prms_dlv_dt) {
			PrmsDtlDataR prmsDtlDataR = getPrmsDtlDataL().get(info.getEventIndex());
			MCIndexKey podKey = getPodL().createIndex(PodR.$po_d_no);
			PodR podR = getPodL().getFirst(podKey, prmsDtlDataR.po_d_no());
			// 仕入直送でない、下請対象の発注先でない、VMI、無償受給以外、入荷基準でない場合のみ日付計算
			PoR poR = getPoL().get(0);
			if (isNull(prmsDtlDataR.dlv_cd())
					&& !poR.subcon_flg()
					&& !MAC_PURC_ID_TYP.isVMI(prmsDtlDataR.purc_id_typ())
					&& !MAC_PURC_ID_TYP.isFFR_RCV(prmsDtlDataR.purc_id_typ())
					&& !MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
				setSchdDt(prmsDtlDataR, callGetSchdDt(getSchdDtEditCnd(prmsDtlDataR, MSUCP_PurcUtil.$dlv_rqst_dt), podR));
			}
			else {
				if(!MAC_PURC_ID_TYP.isVMI(prmsDtlDataR.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(prmsDtlDataR.purc_id_typ())) {
					
					prmsDtlDataR.purc_schd_dt(prmsDtlDataR.prms_dlv_dt());
				}
			}
			setSyncFlg(prmsDtlDataR);
		}
		else if (lc == columnPrmsDtlData_purc_schd_dt) {
			PrmsDtlDataR prmsDtlDataR = getPrmsDtlDataL().get(info.getEventIndex());
			// 仕入直送の場合のみ日付を連携
			if(!isNull(prmsDtlDataR.dlv_cd())) {
				prmsDtlDataR.prms_dlv_dt(prmsDtlDataR.purc_schd_dt());
			}
			setSyncFlg(prmsDtlDataR);
		}
	}
	// -----------------------------------------------
	// ユーティリティ使用準備
	// -----------------------------------------------
	protected DlvInstDtlDataR getSchdDtEditCnd(DlvInstDtlDataR dlvInstDtlDataR, String columnNm) {
		DlvInstDtlDataR cnd = dlvInstDtlDataR.clone();
		if (isSame(columnNm, MSUCP_PurcUtil.$dlv_rqst_dt)) {
			cnd.purc_schd_dt(null);
		}
		else if (isSame(columnNm, MSUCP_PurcUtil.$purc_schd_dt)) {
			cnd.dlv_rqst_dt(null);
		}
		return cnd;
	}
	protected MCRow callGetSchdDt(DlvInstDtlDataR dlvInstDtlDataR, PodR podR) {
		if (isNullAnd(dlvInstDtlDataR.dlv_rqst_dt(), dlvInstDtlDataR.purc_schd_dt())) {
			return MCRow.create();
		}
		String sysParm = getSysParm("MASTER_DT_BASE");
		PoR poR = getPoL().get(0);
		return MSUCP_PurcUtil.getSchdDt(
				MCNumber.ONE,
				null,		// rqst_dlv_rqst_dt
				dlvInstDtlDataR.dlv_rqst_dt(), 
				null,
				dlvInstDtlDataR.purc_schd_dt(), 
				poR.sppl_cd(), 
				dlvInstDtlDataR.itm_cd(), 
				dlvInstDtlDataR.itm_sub1(), 
				dlvInstDtlDataR.itm_sub2(), 
				dlvInstDtlDataR.itm_sub3(), 
				podR.mfg_loc_cd(),
				podR.maker_cd(),
				dlvInstDtlDataR.in_to_loc_wg_cd(),
				podR.bom_ptn(),
				podR.dlv_cd(),
				dlvInstDtlDataR.in_to_loc_cd(),
				dlvInstDtlDataR.site_cd(),
				dlvInstDtlDataR.outsrc_sppl_cd(),
				poR.sppl_cal_cd(),
				dlvInstDtlDataR.in_to_loc_cal_cd(),
				podR.dlv_cal_cd(),
				dlvInstDtlDataR.lg_grp_cd(),
				dlvInstDtlDataR.base_unit_qty(), 
				isSame(sysParm, "1") ? poR.po_dt() : null,
				this);
	}
	/**
	 * 予定日反映
	 * @param dlvInstDtlDataR
	 * @param src
	 */
	protected void setSchdDt(DlvInstDtlDataR dlvInstDtlDataR, MCRow src) {
		if (isNull(src)) {
			return;
		}
		dlvInstDtlDataR.purc_schd_dt(src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
		if (isNull(dlvInstDtlDataR.dlv_rqst_dt())) {
			dlvInstDtlDataR.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
		}
	}

	protected PrmsDtlDataR getSchdDtEditCnd(PrmsDtlDataR prmsDtlDataR, String columnNm) {
		PrmsDtlDataR cnd = prmsDtlDataR.clone();
		if (isSame(columnNm, MSUCP_PurcUtil.$dlv_rqst_dt)) {
			cnd.purc_schd_dt(null);
		}
		else if (isSame(columnNm, MSUCP_PurcUtil.$purc_schd_dt)) {
			cnd.prms_dlv_dt(null);
		}
		return cnd;
	}
	protected MCRow callGetSchdDt(PrmsDtlDataR prmsDtlDataR, PodR podR) {
		if (isNullAnd(prmsDtlDataR.prms_dlv_dt(), prmsDtlDataR.purc_schd_dt())) {
			return MCRow.create();
		}
		String sysParm = getSysParm("MASTER_DT_BASE");
		PoR poR = getPoL().get(0);
		return MSUCP_PurcUtil.getSchdDt(
				MCNumber.ONE,
				null,
				prmsDtlDataR.prms_dlv_dt(), 
				null,
				prmsDtlDataR.purc_schd_dt(), 
				poR.sppl_cd(),
				prmsDtlDataR.itm_cd(),
				prmsDtlDataR.itm_sub1(),
				prmsDtlDataR.itm_sub2(), 
				prmsDtlDataR.itm_sub3(), 
				podR.mfg_loc_cd(),
				podR.maker_cd(),
				podR.in_to_loc_wg_cd(),
				podR.bom_ptn(),
				podR.dlv_cd(),
				podR.in_to_loc_cd(),
				podR.site_cd(),
				podR.outsrc_sppl_cd(),
				poR.sppl_cal_cd(),
				podR.in_to_loc_cal_cd(),
				podR.dlv_cal_cd(),
				podR.in_to_loc_lg_grp_cd(),
				prmsDtlDataR.base_unit_qty(), 
				isSame(sysParm, "1") ? poR.po_dt() : null,
				this);
	}
	/**
	 * 予定日反映
	 * @param dlvInstDtlDataR
	 * @param src
	 */
	protected void setSchdDt(PrmsDtlDataR prmsDtlDataR, MCRow src) {
		if (isNull(src)) {
			return;
		}
		prmsDtlDataR.purc_schd_dt(src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
		if (isNull(prmsDtlDataR.prms_dlv_dt())) {
			prmsDtlDataR.prms_dlv_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
		}
	}

	/**
	 * 同時計上ＦＬＧ
	 * @param r
	 */
	protected void setSyncFlg(DlvInstDtlDataR r) {
		MCIndexKey podKey = getPodL().createIndex(PodR.$po_d_no);
		PodR podR = getPodL().getFirst(podKey, r.po_d_no());
		if (isNullOr(r.dlv_rqst_dt(), r.purc_schd_dt())) {
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if (!isPurcDdlv() && r.arr_skip_flg()) {
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
			// 仕入計上区分：入荷基準
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(podR.purc_basis_typ())) {
			// 仕入計上区分：検収基準
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if(r.dlv_rqst_dt().eqDate(r.purc_schd_dt())) {
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDlvInstDtlData_sync_flg, r.getGUIIndex(), false);
		}
	}

	/**
	 * 同時計上ＦＬＧ
	 * @param r
	 */
	protected void setSyncFlg(PrmsDtlDataR r) {
		MCIndexKey podKey = getPodL().createIndex(PodR.$po_d_no);
		PodR podR = getPodL().getFirst(podKey, r.po_d_no());
		if (isNullOr(r.prms_dlv_dt(), r.purc_schd_dt())) {
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if (!isPurcDdlv() && r.arr_skip_flg()) {
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
			// 仕入計上区分：入荷基準
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(podR.purc_basis_typ())) {
			// 仕入計上区分：検収基準
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), false);
		}
		else if(r.prms_dlv_dt().eqDate(r.purc_schd_dt())) {
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnPrmsDtlData_sync_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void setFocus(MCMessage msg) {
		// 入荷・仕入予定でエラーがあった場合
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof ArrPurcSchdR) {
			for (PodR r : getPodL()) {
				if (isSame(((ArrPurcSchdR) msg.getCauseRow()).po_d_no(), r.po_d_no())) {
					PodTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		// 納入指示ヘッダでエラーがあった場合
		else if (msg.getCauseRow() != null && msg.getCauseRow() instanceof DlvInstHdrDataR) {
			for (PodR r : getPodL()) {
				if (isSame(((DlvInstHdrDataR) msg.getCauseRow()).po_d_no(), r.po_d_no())) {
					PodTable.selectLeftmostColumn(r.getGUIIndex());
					DlvInstHdrDataTable.selectLeftmostColumn(msg.getCauseRow().getGUIIndex());
					break;
				}
			}
		}
		// 納入指示明細でエラーがあった場合
		else if (msg.getCauseRow() != null && msg.getCauseRow() instanceof DlvInstDtlDataR) {
			for (PodR r : getPodL()) {
				if (isSame(((DlvInstDtlDataR) msg.getCauseRow()).po_d_no(), r.po_d_no())) {
					PodTable.selectLeftmostColumn(r.getGUIIndex());
					for (DlvInstHdrDataR hdrR : getDlvInstHdrDataL()) {
						if (isSame(((DlvInstDtlDataR) msg.getCauseRow()).hdr_peg_no(), hdrR.peg_no())) {
							DlvInstHdrDataTable.selectLeftmostColumn(hdrR.getGUIIndex());
							DlvInstDtlDataTable.selectLeftmostColumn(msg.getCauseRow().getGUIIndex());
						}
					}
					break;
				}
			}
		}
		// 納期回答受領ヘッダでエラーがあった場合
		else if (msg.getCauseRow() != null && msg.getCauseRow() instanceof PrmsHdrDataR) {
			for (PodR r : getPodL()) {
				if (isSame(((PrmsHdrDataR) msg.getCauseRow()).po_d_no(), r.po_d_no())) {
					PodTable.selectLeftmostColumn(r.getGUIIndex());
					PrmsHdrDataTable.selectLeftmostColumn(msg.getCauseRow().getGUIIndex());
					break;
				}
			}
		}
		// 納期回答受領明細でエラーがあった場合
		else if (msg.getCauseRow() != null && msg.getCauseRow() instanceof PrmsDtlDataR) {
			for (PodR r : getPodL()) {
				if (isSame(((PrmsDtlDataR) msg.getCauseRow()).po_d_no(), r.po_d_no())) {
					PodTable.selectLeftmostColumn(r.getGUIIndex());
					for (PrmsHdrDataR hdrR : getPrmsHdrDataL()) {
						if (isSame(((PrmsDtlDataR) msg.getCauseRow()).hdr_peg_no(), hdrR.peg_no())) {
							PrmsHdrDataTable.selectLeftmostColumn(hdrR.getGUIIndex());
							PrmsDtlDataTable.selectLeftmostColumn(msg.getCauseRow().getGUIIndex());
						}
					}
					break;
				}
			}
		}
		else {
			super.setFocus(msg);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		ArrPurcSchdTable.setCellConfig(crtArrPurcSchdCellConfig());
		DlvInstHdrDataTable.setCellConfig(crtDlvInstHdrDataCellConfig());
		DlvInstDtlDataTable.setCellConfig(crtDlvInstDtlDataCellConfig());
		PrmsHdrDataTable.setCellConfig(crtPrmsHdrDataCellConfig());
		PrmsDtlDataTable.setCellConfig(crtPrmsDtlDataCellConfig());
		PodTable.setCellConfig(crtPoDCellConfig());
	}
	
	protected ArrPurcSchdCellConfig crtArrPurcSchdCellConfig() {
		return new ArrPurcSchdCellConfig();
	}

	protected class ArrPurcSchdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_SCHD)) {
				ArrPurcSchdR r = (ArrPurcSchdR) table.getBaseTable().getRow(index);
				
				
				// ロットＮＯ部品
				if(column == columnArrPurcSchd_lot_no
						|| column == columnArrPurcSchd_sublot_no
						|| column == columnArrPurcSchd_crt_lot_flg
				) {
					if (!isLotEditable(r)) {
						return MCMode.READ_ONLY;
					}

				}

				// 業者ロットＮＯ
				if(column == columnArrPurcSchd_bp_lot_no) {
					if(!isBpLotEditable(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 入荷打切
				if(column == columnArrPurcSchd_arr_abort_flg) {
					if(!isArrAbortEditable(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕入打切
				if(column == columnArrPurcSchd_purc_abort_flg) {
					if(!isPurcAbortEditable(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnArrPurcSchd_check) {
					if (!isLotEditable(r) && !isArrAbortEditable(r) && !isPurcAbortEditable(r)) {
						return MCMode.READ_ONLY;
					}
				}	
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isPurcAbortEditable(ArrPurcSchdR r) {
		PoR poR = getPoL().get(0);
		return !(r.base_unit_purc_schd_qty().lte(r.purc_act_qty().add(r.accpt_dfct_qty()))
				|| poR.sppl_iv_flg() && (
						r.rcpt_iv_qty().gt(MCNumber.ZERO) && (
							r.purc_act_qty().add(r.accpt_dfct_qty()).isZero()
								&& r.arr_qty().isZero()
						)
					)
				|| r.arr_pr_abort_flg());
	}
	
	protected boolean isArrAbortEditable(ArrPurcSchdR r) {
		PoR poR = getPoL().get(0);
		return !(r.base_unit_qty().lte(r.arr_qty())
				|| poR.sppl_iv_flg() && (
						r.rcpt_iv_qty().gt(MCNumber.ZERO) && (
							r.purc_act_qty().add(r.accpt_dfct_qty()).isZero()
								&& r.arr_qty().isZero()
						)
					)
				|| r.arr_pr_abort_flg());
	}
	
	/**
	 * 仕入直送かどうかを判定する。
	 */
	protected boolean isPurcDdlv() {
		PodR pr = PodTable.getSelectedMCRow();
		return pr != null && !isNull(pr.dlv_cd());
	}
	
	protected boolean isLotEditable(ArrPurcSchdR r) {
		return !(r.outsrc_flg() || (!isNull(r.arr_qty()) && r.arr_qty().gt(MCNumber.ZERO))
				|| (!isNull(r.act_abort_qty()) && r.act_abort_qty().gt(MCNumber.ZERO)));
	}
	
	protected boolean isBpLotEditable(ArrPurcSchdR r) {
		return !((!isNull(r.arr_qty()) && r.arr_qty().gt(MCNumber.ZERO))
				|| (!isNull(r.act_abort_qty()) && r.act_abort_qty().gt(MCNumber.ZERO))
				|| (!isNull(r.purc_act_qty()) && r.purc_act_qty().gt(MCNumber.ZERO))
				|| (!isNull(r.purc_abort_qty()) && r.purc_abort_qty().gt(MCNumber.ZERO)));
	}
	protected boolean isDlvInstExistsAct(DlvInstDtlDataR r) {
		return (r.rcpt_iv_cmpl_flg()) || (!isNull(r.act_abort_qty()) && !r.act_abort_qty().isZero())
				|| (!isNull(r.purc_abort_qty()) && !r.purc_abort_qty().isZero())
				|| (!r.non_purc_flg() && r.purc_cmpl_flg()) || (!r.arr_skip_flg() && r.arr_cmpl_flg());
	}
	
	protected boolean isDlvInstExistsIvPart(DlvInstDtlDataR r) {
		return !isNull(r.rcpt_iv_qty()) && !r.rcpt_iv_qty().isZero() && !r.rcpt_iv_cmpl_flg();
	}

	protected DlvInstHdrDataCellConfig crtDlvInstHdrDataCellConfig() {
		return new DlvInstHdrDataCellConfig();
	}

	protected class DlvInstHdrDataCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_DLVINST)) {
				DlvInstHdrDataR r = (DlvInstHdrDataR) table.getBaseTable().getRow(index);
				// 取消ＦＬＧがオンの場合、行を読み取り専用に制御する。
				if (r.can_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected DlvInstDtlDataCellConfig crtDlvInstDtlDataCellConfig() {
		return new DlvInstDtlDataCellConfig();
	}
	
	protected class DlvInstDtlDataCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_DLVINST)) {
				DlvInstDtlDataR r = (DlvInstDtlDataR) table.getBaseTable().getRow(index);
				PodR podR = PodTable.getSelectedMCRow();
				DlvInstHdrDataR hdrR = DlvInstHdrDataTable.getSelectedMCRow();

				// 取消ＦＬＧがオンの場合、行を読み取り専用に制御する。
				if (hdrR.can_flg()) {
					return MCMode.READ_ONLY;
				}
				// 訂正で仕入実績明細ＮＯをセット・クリアする操作は更新処理が対応していないので読み取り専用
				// この場合は行削除、行追加で対応する
				if (column == columnDlvInstDtlData_purc_act_d_no && !r.isStatusCreate()) {
					return MCMode.READ_ONLY;
				}
				if (column == columnDlvInstDtlData_mfg_inst_no && !r.isStatusCreate()) {
					return MCMode.READ_ONLY;
				}
				
				if (column != columnDlvInstDtlData_dlv_show_dtl && column !=  columnDlvInstDtlData_tdlv_show_dtl) {
					// 受領インボイス登録済、打切済、完了の場合、対象行は変更不可
					if (isDlvInstExistsAct(r)) {
						return MCMode.READ_ONLY;
					}
					
					if (isDlvInstExistsIvPart(r)) {
						if (column != columnDlvInstDtlData_trd_unit_qty) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				// 実績済の場合
				if ((!isNull(r.arr_qty()) && !r.arr_qty().isZero())
						|| (!isNull(r.purc_act_qty()) && !r.purc_act_qty().isZero())
						|| (!isNull(r.accpt_dfct_qty()) && !r.accpt_dfct_qty().isZero())) {
					
					if(column == columnDlvInstDtlData_mfg_inst_no
							|| column == columnDlvInstDtlData_purc_act_d_no
							|| column == columnDlvInstDtlData_in_to_loc_cd
							|| column == columnDlvInstDtlData_in_to_str_ln_cd
							|| column == columnDlvInstDtlData_in_to_str_ln_cd_none_flg
							|| column == columnDlvInstDtlData_dlv_rqst_dt
							|| column == columnDlvInstDtlData_dlv_rqst_hm
							|| column == columnDlvInstDtlData_purc_schd_dt
							|| column == columnDlvInstDtlData_sync_flg
					) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 製造指図ＮＯ
				if(column == columnDlvInstDtlData_mfg_inst_no) {
					if(!r.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 納入場所
				if (column == columnDlvInstDtlData_in_to_loc_cd) {
					if (!isNull(r.dlv_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 仕入予定日
				if (column == columnDlvInstDtlData_purc_schd_dt) {
					if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						return MCMode.READ_ONLY;
					}
					if (getPoL().get(0).subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 同時計上ＦＬＧ
				if (column == columnDlvInstDtlData_sync_flg) {
					if (isNullOr(r.dlv_rqst_dt(), r.purc_schd_dt())
							|| !r.dlv_rqst_dt().eqDate(r.purc_schd_dt())
					) {
						return MCMode.READ_ONLY;
					}
					if(!isNull(r.dlv_cd())) {
						return MCMode.READ_ONLY;
					}
					if (getPoL().get(0).subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(podR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(podR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 取引単位、取引単位数量
				if (column == columnDlvInstDtlData_trd_unit_cd
						|| column == columnDlvInstDtlData_trd_unit_qty
				) {
					if(r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (isNull(podR.dlv_cd()) 
						|| MSC_SHIP_ASSORT_TYP.isAST(podR.assort_typ()) 
						|| !isNull(podR.set_itm_grp_no())) {
					// 仕入直送ではない または 品揃の場合、納品先、配送先を変更不可とする
					if (column == columnDlvInstDtlData_inst_dlv_cd
							|| column == columnDlvInstDtlData_pri_prnt_flg
							|| column == columnDlvInstDtlData_tdlv_cd) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDlvInstDtlData_pri_prnt_flg) {
					if (isNull(r.inst_dlv_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDlvInstDtlData_tdlv_cd) {
					if (r.tdlv_req_flg() && isNull(podR.tdlv_cd())) {
						return MCMode.REQUIRED;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected boolean isPrmsExistsAct(PrmsDtlDataR r) {
		return (r.rcpt_iv_cmpl_flg()) || (!isNull(r.act_abort_qty()) && !r.act_abort_qty().isZero())
				|| (!isNull(r.purc_abort_qty()) && !r.purc_abort_qty().isZero())
				|| (!r.non_purc_flg() && r.purc_cmpl_flg()) || (!r.arr_skip_flg() && r.arr_cmpl_flg());
	}
	
	protected boolean isPrmsExistsIvPart(PrmsDtlDataR r) {
		return !isNull(r.rcpt_iv_qty()) && !r.rcpt_iv_qty().isZero() && !r.rcpt_iv_cmpl_flg();
	}
	
	protected PrmsDtlDataCellConfig crtPrmsDtlDataCellConfig() {
		return new PrmsDtlDataCellConfig();
	}

	protected class PrmsDtlDataCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_PRMS)) {
				PrmsDtlDataR r = (PrmsDtlDataR) table.getBaseTable().getRow(index);
				PodR podR = PodTable.getSelectedMCRow();
				PrmsHdrDataR hdrR = PrmsHdrDataTable.getSelectedMCRow();
				
				// 取消ＦＬＧがオンの場合、行を読み取り専用に制御する。
				if (hdrR.can_flg()) {
					return MCMode.READ_ONLY;
				}
				// 訂正で納入指示明細ＮＯあるいは仕入実績明細ＮＯをセット・クリアする操作は更新処理が対応していないので読み取り専用
				// この場合は行削除、行追加で対応する
				if ((column == columnPrmsDtlData_purc_act_d_no || column == columnPrmsDtlData_dlv_inst_d_no) && !r.isStatusCreate()) {
					return MCMode.READ_ONLY;
				}
				if (column == columnPrmsDtlData_mfg_inst_no && !r.isStatusCreate()) {
					return MCMode.READ_ONLY;
				}
				
				// 受領インボイス登録済、打切済、完了の場合、対象行は変更不可
				if (isPrmsExistsAct(r)) {
					return MCMode.READ_ONLY;
				}
				if (isPrmsExistsIvPart(r)) {
					if (column != columnPrmsDtlData_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				// 実績済の場合
				if ((!isNull(r.arr_qty()) && !r.arr_qty().isZero())
						|| (!isNull(r.purc_act_qty()) && !r.purc_act_qty().isZero())
						|| (!isNull(r.accpt_dfct_qty()) && !r.accpt_dfct_qty().isZero())) {
					
					if(column == columnPrmsDtlData_mfg_inst_no
							|| column == columnPrmsDtlData_purc_act_d_no
							|| column == columnPrmsDtlData_prms_dlv_dt
							|| column == columnPrmsDtlData_prms_dlv_hm
							|| column == columnPrmsDtlData_purc_schd_dt
							|| column == columnPrmsDtlData_sync_flg
							|| column == columnPrmsDtlData_dlv_inst_d_no
					) {
						return MCMode.READ_ONLY;
					}
				}

				// 製造指図ＮＯ
				if(column == columnPrmsDtlData_mfg_inst_no) {
					if(!r.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 仕入予定日
				if (column == columnPrmsDtlData_purc_schd_dt) {
					if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						return MCMode.READ_ONLY;
					}
					if (getPoL().get(0).subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 同時計上ＦＬＧ
				if (column == columnPrmsDtlData_sync_flg) {
					if (isNullOr(r.prms_dlv_dt(), r.purc_schd_dt())
							|| !r.prms_dlv_dt().eqDate(r.purc_schd_dt())
					) {
						return MCMode.READ_ONLY;
					}
					if(!isNull(r.dlv_cd())) {
						return MCMode.READ_ONLY;
					}
					if (getPoL().get(0).subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(podR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(podR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 取引単位、取引単位数量
				if (column == columnPrmsDtlData_trd_unit_cd
						|| column == columnPrmsDtlData_trd_unit_qty
				) {
					if(r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	protected PrmsHdrDataCellConfig crtPrmsHdrDataCellConfig() {
		return new PrmsHdrDataCellConfig();
	}

	protected class PrmsHdrDataCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_PRMS)) {
				PrmsHdrDataR r = (PrmsHdrDataR) table.getBaseTable().getRow(index);
				// 取消ＦＬＧがオンの場合、行を読み取り専用に制御する。
				if (r.can_flg()) {
					return MCMode.READ_ONLY;
				}
				PodR pr = PodTable.getSelectedMCRow();
				if(column == columnPrmsHdrData_arr_schd_refl_dt) {
					if(!r.arr_schd_refl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnPrmsHdrData_arr_schd_refl_flg) {
					if (pr.getBooleanNE("compl_flg")) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected PoDCellConfig crtPoDCellConfig() {
		return new PoDCellConfig();
	}

	protected class PoDCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD_DLVINST)) {
				PodR r = (PodR) table.getBaseTable().getRow(index);
				// ＥＤＩ対象フラグがオンの場合、今回ＥＤＩ納入指示フラグを入力可能に制御する
				if (r.edi_tgt_flg() ) {
					if (column == columnPod_crnt_edi_dlv_inst_flg) {
						return MCMode.ENABLE;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}