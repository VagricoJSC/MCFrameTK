package mcframe.clientMSBC.MSBCP1100;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5340.*;
import mcframe.clientMSBC.MSBCP1120.*;
import mcframe.clientMSUB.MSUBP0040.*;
import mcframe.clientMSUB.MSUBP0070.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
import java.util.*;
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdListLogic.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MfgActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MfgActReg_MC extends MSBCP_MfgActReg_MC_A implements IfOpePanel, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Map<MCNumber, MCList<LossAct_RsltR>> _lossMap = new HashMap<MCNumber, MCList<LossAct_RsltR>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgActReg_MC() {
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
	public MSBCP_MfgActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//********************** 通信が発生するボタン処理 **************************

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL1100_Del01();
	}
	
	/**
	 * [MS_MSBCL1100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Del01Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1100_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			// 取消時は明細がなくてもエラーとしない
			return true;
		}
		
		@Override
		protected void setMode() {
			setFixStatus();
		}
	}

	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBCL1100_Del02();
	}
	
	/**
	 * [MS_MSBCL1100_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Del02Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1100_Del02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			setFixStatus();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt_act]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_act(MCEventInfo info) {
		callMS_MSBCL1100_Prnt01();
	}
	
	/**
	 * [MS_MSBCL1100_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Prnt01Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBCL1100_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	/**
	 * Panel[InptBtn]のボタン[sprt_lot_prop]の押下時の処理
	 */
	@Override
	public void doInptBtn_sprt_lot_prop(MCEventInfo info) {
		callMS_MSBCL1100_Sprt01();
	}
	
	/**
	 * [MS_MSBCL1100_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt01Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<DtlInptR> _dtlForCheck;
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1010);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlForCheck = getDtlInptL().subList(DtlInptR.$check, true);
		}

		@Override
		protected boolean checkForCall() {
			if (_dtlForCheck.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return super.checkForCall();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 処理後のソートのために全行上らせているが、ロット提案の処理対象とするのは、選択チェックがオンの行のみのため、
			// 必須チェックは選択チェックがオンの行に対してのみ実施する
			for (DtlInptR r : _dtlForCheck) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_cd));
				if (columnDtlInpt_itm_sub1.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub1));
				}
				if (columnDtlInpt_itm_sub2.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub2));
				}
				if (columnDtlInpt_itm_sub3.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub3));
				}
				if (r.ver_flg()) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_ver_no));
				}
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_base_unit_inpt_qty));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_act_dt));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_inpt_loc_cd));
			}
		}
		
		protected static final String TMP_PARAM_ROW_IDX_COL = "__tmp_param_row_idx__";
		protected static final String TMP_SORT_COL = "__tmp_sort_col__";
		
		@Override
		protected void merge(int blockNum, MCList<MCRow> destL, MCList<MCRow> srcL,
				String... cols) {
			// 本メソッドは、showMergeから呼ばれるメソッド。
			// ロットが割れた場合などに上り電文が複数行に分割されることがあるため、独自に実装している
			if (blockNum == 0) {
				// 投入実績
				destL.addBooleanColumn("sprt6flg", false);
				mergeAndAddCmn(destL, srcL, cols);
			}
			else if (blockNum == 1) {
				// ロス実績
				mergeLoss(destL, srcL, cols);
			}
			else {
				// 上記以外
				super.merge(blockNum, destL, srcL, cols);
			}
		}

		/**
		 * ロス実績コンテナのmerge処理
		 * @param destL
		 * @param srcL
		 * @param cols
		 */
		protected void mergeLoss(MCList<MCRow> destL, MCList<MCRow> srcL, String... cols) {
			if (srcL.isEmpty()) {
				return;
			}
			
			srcL.addNumberColumn(TMP_PARAM_ROW_IDX_COL);
			for (MCRow srcR : srcL) {
				srcR.setNumber(TMP_PARAM_ROW_IDX_COL, srcR.getParamRowIndex());
			}
			
			MCIndexKey idxkey = srcL.createIndex(TMP_PARAM_ROW_IDX_COL);
			MCList<LossAct_RsltR> addL = MCList.create(LossAct_RsltR.class);
			
			for (MCRow destR : destL) {
				MCList<MCRow> subSrcL = srcL.subList(idxkey, MCNumber.valueOf(destR.getParamRowIndex()));
				for (int i=0; i < subSrcL.size(); i++) {
					MCRow srcR = subSrcL.get(i);
					if (i == 0) {
						destR.setValues(cols, srcR, cols);
					}
					else {
						MCRow addR = destR.clone();
						addR.setStatus(MCRow.Status.CREATE);
						addR.setValues(cols, srcR, cols);
						addR.setString(LossAct_RsltR.$loss_act_no, null);
						addL.add((LossAct_RsltR)addR);
					}
				}
			}
			if (!addL.isEmpty()) {
				for (MCList<LossAct_RsltR> gL : addL.groupList(LossAct_RsltR.$inpt_peg_no)) {
					_lossMap.put(gL.get(0).inpt_peg_no(), gL);
					destL.addAll(gL);
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			for (DtlInptR r : getDtlInptL()) {
				if (!isNull(r.stk_id_typ()) && isNull(r.stk_id_typ_nm())) {
					MSC_STK_ID_TYP.putNameNE(r, DtlInptR.$stk_id_typ, DtlInptR.$stk_id_typ_nm);
				}
			}
		}
		
	}
	
	/**
	 * Panel[YieldBtn]のボタン[sprt_lot_no]の押下時の処理
	 */
	@Override
	public void doYieldBtn_sprt_lot_no(MCEventInfo info) {
		callMS_MSBCL1100_Sprt02();
	}

	/**
	 * [MS_MSBCL1100_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt02Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt02Caller(P p, B b) {
			super(p, b);
		}

		MCList<DtlYieldR> _dtlYieldForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlYieldForCall = getDtlYieldL().subList(r-> r.check() && !r.isStatusDelete());
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_dtlYieldForCall.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return true;
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlYieldForCall);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getYieldBtnR().lot_issue_flg() && !getYieldBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			bridge.up0().lot_issue_flg(getYieldBtnR().lot_issue_flg());
			bridge.up0().sublot_issue_flg(getYieldBtnR().sublot_issue_flg());
		}
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[sprt_lot_no]の押下時の処理
	 */
	@Override
	public void doByProdBtn_sprt_lot_no(MCEventInfo info) {
		callMS_MSBCL1100_Sprt03();
	}

	/**
	 * [MS_MSBCL1100_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt03Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt03Caller(P p, B b) {
			super(p, b);
		}

		MCList<DtlByProdR> _dtlByProdForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlByProdForCall = getDtlByProdL().subList(r-> r.check() && !r.isStatusDelete());
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_dtlByProdForCall.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return true;
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlByProdR r : _dtlByProdForCall) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_cd));
				if (columnDtlByProd_itm_sub1.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub1));
				}
				if (columnDtlByProd_itm_sub2.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub2));
				}
				if (columnDtlByProd_itm_sub3.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub3));
				}
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlByProdForCall);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getByProdBtnR().lot_issue_flg() && !getByProdBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			bridge.up0().lot_issue_flg(getByProdBtnR().lot_issue_flg());
			bridge.up0().sublot_issue_flg(getByProdBtnR().sublot_issue_flg());
		}
	}
	
	/**
	 * Panel[Hdr]のボタン[st_re_calc]の押下時の処理
	 */
	@Override
	public void doHdr_st_re_calc(MCEventInfo info) {
		// ボタンではなく着手数量のイベントで実行される想定のため何も実装しない（ボタンは非表示）	
	}
	
	/**
	 * [MS_MSBCL1100_Sprt04]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt04Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt04Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			_lossMap.clear();
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			//LCで呼ばれるので同期通信とする
			setScreenAsync(false);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			
			if (!bridge.down3().isEmpty()) {
				MCIndexKey idxkey = bridge.down2().createIndex(LossAct_RsltR.$inpt_peg_no);
				for (DtlInptR inptR : bridge.down1()) {
					MCList<LossAct_RsltR> lossSubL = bridge.down2().subList(idxkey,
							inptR.peg_no());
					_lossMap.put(inptR.peg_no(), lossSubL);
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			selectAllTable();
		}
		
		@Override
		protected void show() {
			super.showReplace();
		}
	}

	/**
	 * Panel[OperBtn]のボタン[sprt_inpt_recalc]の押下時の処理
	 */
	@Override
	public void doOperBtn_sprt_inpt_recalc(MCEventInfo info) {
		callMS_MSBCL1100_Sprt06();
	}

	/**
	 * [MS_MSBCL1100_Sprt06]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt06Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt06Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<DtlOperR> _operForCall;

		@Override
		protected void initCaller() {
			super.initCaller();
			
			_operForCall = getDtlOperL().subList(DtlOperR.$oper_re_calc_flg, true);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1011);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_operForCall.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return true;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			chkOperForReCalc(msgList, _operForCall);
		}
				
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(_operForCall);
		}
		
		@Override
		protected void merge(int blockNum, MCList<MCRow> destL, MCList<MCRow> srcL,
				String... cols) {
			if (blockNum == 0) {
				destL.addBooleanColumn("sprt6flg", true);
				mergeAndAddCmn(destL, srcL, cols);
				replaceLossMap(destL);
			}
			else if (blockNum == 1) {
				mergeLoss(destL, srcL, cols);
			}
			else {
				super.merge(blockNum, destL, srcL, cols);
			}
		}
		
		/**
		 * 再計算処理前から存在していた投入予定行に対応する、ロスの投入紐付けＮＯを置き換え、lossMapを設定しなおす
		 */
		protected void replaceLossMap(MCList<MCRow> destL) {
			Map<MCNumber, MCList<LossAct_RsltR>> newLossMap = new HashMap<MCNumber, MCList<LossAct_RsltR>>();
			
			MCList<LossAct_RsltR> addLossL = MCList.create(LossAct_RsltR.class);
			for (MCRow destR : destL) {
				DtlInptR inptR = (DtlInptR)destR;
				MCList<LossAct_RsltR> lossL = _lossMap.get(inptR.bfr_recalc_peg_no());
				if (isNull(lossL)) {
					inptR.base_unit_loss_qty(null);
					inptR.base_unit_fxd_loss_qty(null);
					inptR.cont_loss_qty(null);
					inptR.cont_fxd_loss_qty(null);
					continue;
				}
				
				for (LossAct_RsltR lossR : lossL) {
					lossR.inpt_peg_no(inptR.peg_no());
				}
				newLossMap.put(inptR.peg_no(), lossL);
				addLossL.addAll(lossL);
			}
			getDtlLossL().setAll(addLossL);
			_lossMap.clear();
			_lossMap.putAll(newLossMap);
		}
		
		/**
		 * ロス実績コンテナのmerge処理
		 */
		protected void mergeLoss(MCList<MCRow> destL, MCList<MCRow> srcL, String... cols) {
			if (srcL.isEmpty()) {
				return;
			}
			
			destL.addAll(srcL);
			//　srcLには、サーバで新たに追加した投入予定に対応するロスコンテナ（ロス理由マスタから作成）が設定されている
			MCList<LossAct_RsltR> lossL = MCList.create(LossAct_RsltR.class);
			for (MCRow row : srcL) {
				LossAct_RsltR lossR = (LossAct_RsltR)row;
				lossL.add(lossR);
			}
			
			for (MCList<LossAct_RsltR> lossGL : lossL.groupList(LossAct_RsltR.$inpt_peg_no)) {
				_lossMap.put(lossGL.get(0).inpt_peg_no(), lossGL);
			}
		}
	}
	
	protected void chkOperForReCalc(MCMessageList msgList, MCList<DtlOperR> operL) {
		MCList<DtlOperR> unCheckL = getDtlOperL().subList(DtlOperR.$check, false);
		for (DtlOperR operR : operL) {
			MCList<DtlOperR> subL = unCheckL.subList(DtlOperR.$oper_inst_no, operR.oper_inst_no());
			for (DtlOperR subR : subL) {
				msgList.add(new MCMessage(subR, DtlOperR.$check, MSBCP1004, toDispGUIIndex(subR)));
			}
		}
		
	}
	
	/**
	 * Panel[OperBtn]のボタン[sprt_wk_recalc]の押下時の処理
	 */
	@Override
	public void doOperBtn_sprt_wk_recalc(MCEventInfo info) {
		callMS_MSBCL1100_Sprt07();
	}

	/**
	 * [MS_MSBCL1100_Sprt07]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Sprt07Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Sprt07Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1100_Sprt07Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<DtlOperR> _operForCall;
		protected MCList<DtlWkR> _wkActForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_operForCall = getDtlOperL().subList(DtlOperR.$oper_re_calc_flg, true);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1011);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_operForCall.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return true;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			chkOperForReCalc(msgList, _operForCall);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(_operForCall);
		}
		
		@Override
		protected void merge(int blockNum, MCList<MCRow> destL, MCList<MCRow> srcL,
				String... cols) {
			// 本メソッドは、showMergeから呼ばれるメソッド。
			// ロットが割れた場合などに上り電文が複数行に分割されることがあるため、独自に実装している
			if (blockNum == 0) {
				mergeAndAddCmn(destL, srcL, cols);
			}
			else {
				super.merge(blockNum, destL, srcL, cols);
			}
		}
	}
	
	protected void mergeAndAddCmn(MCList<MCRow> destL, MCList<MCRow> srcL, String... cols) {
		String rowIdxCol = "__tmp_param_row_idx__";
		String sortCol = "__tmp_sort_col__";

		if (srcL.isEmpty()) {
			return;
		}
		
		srcL.addNumberColumn(rowIdxCol);
		for (MCRow srcR : srcL) {
			srcR.setNumber(rowIdxCol, srcR.getParamRowIndex());
		}
		
		MCIndexKey idxkey = srcL.createIndex(rowIdxCol);
		MCList<MCRow> addL = destL.createInstance();
		
		destL.addNumberColumn(rowIdxCol);
		destL.addNumberColumn(sortCol);
		for (MCRow destR : destL) {
			destR.setNumber(rowIdxCol, destR.getParamRowIndex());
			MCList<MCRow> subSrcL = srcL.subList(idxkey, MCNumber.valueOf(destR.getParamRowIndex()));
			
			for (int i=0; i < subSrcL.size(); i++) {
				MCRow srcR = subSrcL.get(i);
				if (i == 0) {
					if (destR.getBooleanNE("sprt6flg")) {
						setBkfUpdFlg(destR, srcR);
					}
					destR.setValues(cols, srcR, cols);
					// ソート用に一時カラムを設定
					destR.setNumber(sortCol, i);
				}
				else {
					MCRow addR = destR.clone();
					addR.setStatus(MCRow.Status.CREATE);
					addR.setValues(cols, srcR, cols);
					// ソート用に一時カラムを設定
					addR.setNumber(sortCol, i);
					addL.add(addR);
				}
			}
		}
		if (!addL.isEmpty()) {
			clearNotInheritCols(addL);
			destL.addAll(addL);
			destL.sort(rowIdxCol, sortCol);
		}
	}
	protected void setBkfUpdFlg(MCRow destR, MCRow srcR) {
		if (!isSame(destR.getNumberNE("inpt_qty_p.qty"), srcR.getNumberNE("inpt_qty_p.qty"))
				|| !isSame(destR.getNumberNE("cont_inpt_qty_p.cont_qty"), srcR.getNumberNE("cont_inpt_qty_p.cont_qty"))) {
			destR.setBooleanNE(DtlInptR.$bkf_upd_flg, false);
		}
	}
	
	protected void clearNotInheritCols(MCList<MCRow> addL) {
		for(MCRow row : addL){
			if(row instanceof DtlWkR) {
				// 工数表の引き継がないカラムをクリアする
				List<String> cols = getWkInheritCols(NOT_INHERIT_TYPE_COPY_ROW);
				cols.add(DtlWkR.$check);
				row.clear(cols.toArray(new String[0]));
			}
			else {
				// 投入表の引き継がないカラムをクリアする
				List<String> cols = getInptInheritCols(NOT_INHERIT_TYPE_COPY_ROW);
				// ロット提案時にはチェック状況を引き継ぎたいため、投入再計算時のみチェックとロット提案対象をクリア対象にする。
				if (row.getBooleanNE("sprt6flg")) {
					cols.add(DtlInptR.$check);
					cols.add(DtlInptR.$lot_prop_tgt_flg);
				}
				// listに含まれない他勘定振替関連項目を追加
				cols.add(DtlInptR.$acxfr_act_qty);
				cols.add(DtlInptR.$cont_acxfr_act_qty);
				cols.add(DtlInptR.$acxfr_act_rsn_cd);
				cols.add(DtlInptR.$acxfr_act_rsn_nm);
				cols.add(DtlInptR.$acxfr_act_bd_dpt_cd);
				cols.add(DtlInptR.$acxfr_act_bd_dpt_nm);
				row.clear(cols.toArray(new String[0]));
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBCL1100_Srch01();
	}
	
	/**
	 * [MS_MSBCL1100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Srch01Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1100_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			_lossMap.clear();
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getOperBtnR());
			addDownContainer(getInptBtnR());
			addDownContainer(getYieldBtnR());
			addDownContainer(getByProdBtnR());
			addDownContainer(getWkBtnR());
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			// 新規登録
			if (Cnd_ope_INS.isSelected()) {
				bridge.up0().inst_srch_flg(true);
			}
			else {
				bridge.up0().inst_srch_flg(false);
			}
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			if (!bridge.down7().isEmpty()) {
				MCIndexKey idxkey = bridge.down7().createIndex(LossAct_RsltR.$inpt_peg_no);
				for (DtlInptR inptR : bridge.down2()) {
					MCList<LossAct_RsltR> lossSubL = bridge.down7().subList(idxkey,
							inptR.peg_no());
					_lossMap.put(inptR.peg_no(), lossSubL);
				}
			}
		}
		
		@Override
		protected void show() {
			super.show();
			setHdrLotIssueFlg();
			setYieldSublotIssueFlg();
			setByProdLotIssueFlg();
			setByProdSublotIssueFlg();
		}

		protected void setHdrLotIssueFlg() {
			getYieldBtnR().lot_issue_flg(false);
			for (DtlYieldR r : getDtlYieldL()) {
				if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())
						&& !r.isStatusDelete() && !isNull(r.lot_no_ptn_cd())
						&& isNull(r.lot_no())) {
					getYieldBtnR().lot_issue_flg(true);
					break;
				}
			}
		}
		
		protected void setYieldSublotIssueFlg() {
			getYieldBtnR().sublot_issue_flg(false);
			for (DtlYieldR r : getDtlYieldL()) {
				if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())
						&& !r.isStatusDelete() && !isNull(r.sublot_no_ptn_cd())
						&& isNull(r.sublot_no())) {
					getYieldBtnR().sublot_issue_flg(true);
					break;
				}
			}
		}
		protected void setByProdLotIssueFlg() {
			getByProdBtnR().lot_issue_flg(false);
			for (DtlByProdR r : getDtlByProdL()) {
				if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())
						&& !r.isStatusDelete() && !isNull(r.lot_no_ptn_cd())
						&& isNull(r.lot_no())) {
					getByProdBtnR().lot_issue_flg(true);
					break;
				}
			}
		}
		
		protected void setByProdSublotIssueFlg() {
			getByProdBtnR().sublot_issue_flg(false);
			for (DtlByProdR r : getDtlByProdL()) {
				if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())
						&& !r.isStatusDelete() && !isNull(r.sublot_no_ptn_cd())
						&& isNull(r.sublot_no())) {
					getByProdBtnR().sublot_issue_flg(true);
					break;
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_INS.isSelected()) {
				setINS_ACTStatus();
			}
			selectAllTable();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_INS.isSelected()) {
				setSRCH_INSStatus();
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL1100_Upd01();
	}
	
	/**
	 * [MS_MSBCL1100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Upd01Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1100_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		protected MCList<DtlOperR> _operForCall;
		protected MCList<DtlInptR> _inptActForCall;
		protected MCList<LossAct_RsltR> _lossForCall;
		protected MCList<DtlWkR> _wkActForCall;
		protected MCList<DtlYieldR> _yieldForCall;
		protected MCList<DtlByProdR> _byProdForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (getBtnR().act_immed_prnt_flg()) {
				setPrint(true);
			}
			_operForCall = getDtlOperL().subList(DtlOperR.$check, true);
			_inptActForCall = getDtlInptL().subList(DtlInptR.$check, true);
			setLossForCall();
			_wkActForCall = getDtlWkL().subList(DtlWkR.$check, true);
			_yieldForCall = getDtlYieldL().subList(DtlYieldR.$check, true);
			_byProdForCall = getDtlByProdL().subList(DtlByProdR.$check, true);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			if (Cnd_ope_UPD.isSelected()) {
				// ヘッダの終了日や備考だけ更新することを許容するためtrueを返す
				return true;
			}
			else {
				return super.checkUpListParamEmpty();
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			chkInptAbort(msgList);
			chkWkAbort(msgList);
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			chkYieldQty(msgList);
			chkByProdQty(msgList);
			chkInptQty(msgList);
			chkYield(msgList);
		}

		protected void chkYieldQty(MCMessageList msgList) {
			MCList<DtlYieldR> chkTargetL = makeInptChkTargetListForYield();
			
			if (!chkTargetL.isEmpty()) {
				msgList.addAll(
					doInptChk(
						MAC_FUNC_TYP.YIELD.value(),
						columnDtlYield_itm_cd, columnDtlYield_itm_sub1, columnDtlYield_itm_sub2, columnDtlYield_itm_sub3,
						columnDtlYield_yield_act_no, columnDtlYield_base_unit_yield_act_qty_bef, columnDtlYield_base_unit_yield_act_qty,
						columnDtlYield_yield_act_qty, columnDtlYield_base_unit_yield_schd_qty, chkTargetL,
						columnDtlYield_trd_unit_yield_act_qty, columnDtlYield_yield_schd_no));
			}
		}
		
		protected String[] getGrpColumsForYield() {
			return new String[] {
					DtlYieldR.$yield_schd_no
			};
		}
		
		protected MCList<DtlYieldR> getAddListForYield(MCList<DtlYieldR> targetGroupL) {
			MCNumber sumYieldActQty = MCNumber.ZERO;
			MCList<DtlYieldR> addList = MCList.create(DtlYieldR.class);
			
			for (DtlYieldR targetGroupR : targetGroupL) {
				if (targetGroupR.isStatusModify()) {
					sumYieldActQty = sumYieldActQty.add(targetGroupR.base_unit_yield_act_qty_bef());
				}
				
				addList.add(targetGroupR);
			}
			
			targetGroupL.setNumber(DtlYieldR.$yield_act_qty, sumYieldActQty);
			
			return addList;
		}
		
		protected MCList<DtlYieldR> makeInptChkTargetListForYield() {
			MCList<DtlYieldR> chkTargetL = MCList.create(DtlYieldR.class);
			
			MCList<DtlYieldR> targetYieldL = getDtlYieldL()
					.subList(r -> !r.isStatusDelete() && !isNull(r.yield_schd_no()) && r.check());
			
			for (MCList<DtlYieldR> targetGroupL : targetYieldL.groupList(getGrpColumsForYield())) {
				chkTargetL.addAll(getAddListForYield(targetGroupL));
			}
			
			return chkTargetL;
		}
		
		protected void chkByProdQty(MCMessageList msgList) {
			MCList<DtlByProdR> chkTargetL = makeInptChkTargetListForByProd();
			
			if (!chkTargetL.isEmpty()) {
				msgList.addAll(
					doInptChk(
						MAC_FUNC_TYP.YIELD.value(),
						columnDtlByProd_itm_cd, columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2, columnDtlByProd_itm_sub3,
						columnDtlByProd_yield_act_no, columnDtlByProd_base_unit_yield_act_qty_bef, columnDtlByProd_base_unit_yield_act_qty,
						columnDtlByProd_yield_act_qty, columnDtlByProd_base_unit_yield_schd_qty, chkTargetL,
						columnDtlByProd_trd_unit_yield_act_qty, columnDtlByProd_yield_schd_no));
			}
		}
		
		protected String[] getGrpColumsForByProd() {
			return new String[] {
					DtlByProdR.$yield_schd_no
			};
		}
		
		protected MCList<DtlByProdR> getAddListForByProd(MCList<DtlByProdR> targetGroupL) {
			MCNumber sumYieldActQty = MCNumber.ZERO;
			MCList<DtlByProdR> addList = MCList.create(DtlByProdR.class);
			
			for (DtlByProdR targetGroupR : targetGroupL) {
				if (targetGroupR.isStatusModify()) {
					sumYieldActQty = sumYieldActQty.add(targetGroupR.base_unit_yield_act_qty_bef());
				}
				
				addList.add(targetGroupR);
			}
			
			targetGroupL.setNumber(DtlYieldR.$yield_act_qty, sumYieldActQty);
			
			return addList;
		}
		
		protected MCList<DtlByProdR> makeInptChkTargetListForByProd() {
			MCList<DtlByProdR> chkTargetL = MCList.create(DtlByProdR.class);
			
			MCList<DtlByProdR> targetByProdL = getDtlByProdL()
					.subList(r -> !r.isStatusDelete() && !isNull(r.yield_schd_no())&& r.check());
			
			for (MCList<DtlByProdR> targetGroupL : targetByProdL.groupList(getGrpColumsForByProd())) {
				chkTargetL.addAll(getAddListForByProd(targetGroupL));
			}
			
			return chkTargetL;
		}
		
		protected void chkInptQty(MCMessageList msgList) {
			MCList<DtlInptR> chkTargetForInptL = makeInptChkTargetListForInpt();
			MCList<DtlInptR> chkTargetForFxdLossL = makeInptChkTargetListForFxdLoss();
			
			if (!chkTargetForInptL.isEmpty()) {
				msgList.addAll(
					doInptChk(
						MAC_FUNC_TYP.INPT.value(),
						columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1, columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
						columnDtlInpt_inpt_act_no, columnDtlInpt_base_unit_inpt_qty_bef, columnDtlInpt_base_unit_inpt_qty,
						columnDtlInpt_inpt_act_qty, columnDtlInpt_base_unit_schd_inpt_qty, chkTargetForInptL,
						columnDtlInpt_base_unit_inpt_qty, columnDtlInpt_inpt_schd_no));
			}
			
			if (!chkTargetForFxdLossL.isEmpty()) {
				msgList.addAll(
					doInptChk(
						MAC_FUNC_TYP.INPT.value(),
						columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1, columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
						columnDtlInpt_inpt_act_no, columnDtlInpt_base_unit_fxd_loss_qty_bef, columnDtlInpt_base_unit_fxd_loss_qty,
						columnDtlInpt_fxd_loss_act_qty, columnDtlInpt_base_unit_schd_fxd_rqmt_qty, chkTargetForFxdLossL,
						columnDtlInpt_base_unit_fxd_loss_qty, columnDtlInpt_inpt_schd_no));
				}
			
		}
		
		protected String[] getGrpColumsForInpt() {
			return new String[] {
					DtlInptR.$inpt_schd_no
			};
		}
		
		protected MCList<DtlInptR> getAddListForInpt(MCList<DtlInptR> targetGroupL) {
			MCNumber sumInptActQty = MCNumber.ZERO;
			MCList<DtlInptR> addList = MCList.create(DtlInptR.class);
			
			for (DtlInptR targetGroupR : targetGroupL) {
				if (targetGroupR.isStatusModify()) {
					sumInptActQty = sumInptActQty.add(targetGroupR.base_unit_inpt_qty_bef());
				}
				
				addList.add(targetGroupR);
			}
			
			targetGroupL.setNumber(DtlInptR.$inpt_act_qty, sumInptActQty);
			
			return addList;
		}
		
		protected MCList<DtlInptR> makeInptChkTargetListForInpt() {
			MCList<DtlInptR> chkTargetL = MCList.create(DtlInptR.class);
			
			MCList<DtlInptR> targetInptL = getDtlInptL()
					.subList(r -> !r.isStatusDelete() && !isNull(r.inpt_schd_no()) && r.check());
			
			for (MCList<DtlInptR> targetGroupL : targetInptL.groupList(getGrpColumsForInpt())) {
				chkTargetL.addAll(getAddListForInpt(targetGroupL));
			}
			
			return chkTargetL;
		}
		
		protected String[] getGrpColumsForFxdLoss() {
			return new String[] {
					DtlInptR.$inpt_schd_no
			};
		}
		
		protected MCList<DtlInptR> getAddListForFxdLoss(MCList<DtlInptR> targetGroupL) {
			MCNumber sumFxdLossActQty = MCNumber.ZERO;
			MCList<DtlInptR> addList = MCList.create(DtlInptR.class);
			
			for (DtlInptR targetGroupR : targetGroupL) {
				if (targetGroupR.isStatusModify()) {
					sumFxdLossActQty = sumFxdLossActQty.add(targetGroupR.base_unit_fxd_loss_qty_bef());
				}
				
				addList.add(targetGroupR);
			}
			
			targetGroupL.setNumber(DtlInptR.$fxd_loss_act_qty, sumFxdLossActQty);
			
			return addList;
		}
		
		protected MCList<DtlInptR> makeInptChkTargetListForFxdLoss() {
			MCList<DtlInptR> chkTargetL = MCList.create(DtlInptR.class);
			
			MCList<DtlInptR> targetInptL = getDtlInptL()
					.subList(r -> !r.isStatusDelete() && !isNull(r.inpt_schd_no()) && r.check());
			
			for (DtlInptR r : targetInptL) {
				if (isNull(r.base_unit_fxd_loss_qty())) {
					r.setNumber(DtlInptR.$base_unit_fxd_loss_qty, MCNumber.ZERO);
				}
			}
			
			for (MCList<DtlInptR> targetGroupL : targetInptL.groupList(getGrpColumsForFxdLoss())) {
				chkTargetL.addAll(getAddListForFxdLoss(targetGroupL));
			}
			
			return chkTargetL;
		}
		
		protected void setLossForCall() {
			_lossForCall = MCList.create(LossAct_RsltR.class);
			for (DtlInptR inptR : _inptActForCall) {
				MCList<LossAct_RsltR> subL = _lossMap.get(inptR.peg_no());
				if(isNull(subL)) {
					continue;
				}
				for (LossAct_RsltR subR : subL) {
					if (isNull(subR.loss_qty()) && isNull(subR.loss_act_no())) {
						continue;						
					}
					else {
						_lossForCall.add(subR);
					}
				}
			}
		}

		/**
		 * 品目実際収率、工程実際収率の大小チェック
		 * @param msgList
		 */
		protected void chkYield(MCMessageList msgList) {
			HdrR hdrR = getHdrR();
			if (!isNullOr(hdrR.itm_lower_yield(), hdrR.itm_yield())) {
				if (hdrR.itm_yield().lt((hdrR.itm_lower_yield()))) {
					msgList.add(new MCMessage(hdrR, HdrR.$itm_yield, MSBCP1016,
							hdrR.itm_yield(), hdrR.itm_lower_yield(),
							toDispGUIIndex(hdrR)));
				}
			}
			if (!isNullOr(hdrR.itm_upper_yield(), hdrR.itm_yield())) {
				if (hdrR.itm_yield().gt((hdrR.itm_upper_yield()))) {
					msgList.add(new MCMessage(hdrR, HdrR.$itm_yield, MSBCP1017,
							hdrR.itm_yield(), hdrR.itm_upper_yield(),
							toDispGUIIndex(hdrR)));
				}
			}
			
			for (DtlOperR r : getDtlOperL()) {
				if (r.check() && !r.isStatusDelete()) {
					if (!isNullOr(r.oper_lower_yield(), r.oper_yield())) {
						if (r.oper_yield().lt(r.oper_lower_yield())) {
							msgList.add(new MCMessage(r, DtlOperR.$oper_yield, MSBCP1018,
									r.oper_yield(), r.oper_lower_yield(),
									toDispGUIIndex(r)));
						}
					}
					if (!isNullOr(r.oper_upper_yield(), r.oper_yield())) {
						if (r.oper_yield().gt(r.oper_upper_yield())) {
							msgList.add(new MCMessage(r, DtlOperR.$oper_yield, MSBCP1019,
									r.oper_yield(), r.oper_upper_yield(),
									toDispGUIIndex(r)));
						}
					}
				}
			}
		}

		/**
		 * 投入実績の打切フラグ混在チェック
		 * @param msgList
		 */
		protected void chkInptAbort(MCMessageList msgList) {
			// 更新対象の投入実績から削除行、計画外実績行を除去
			MCList<DtlInptR> tgtInptL = _inptActForCall
					.subList(r -> !r.isStatusDelete() && !isNull(r.inpt_schd_no()));

			// 投入実績を投入予定ＮＯ単位にグループ化
			for (MCList<DtlInptR> inptL : tgtInptL.groupList(DtlInptR.$inpt_schd_no)) {
				// 打切フラグでグループ化した結果、件数が２件以上ある場合はエラー
				if (inptL.groupBy(DtlInptR.$abort_flg).size() > 1) {
					DtlInptR inptR = inptL.getFirst(DtlInptR.$abort_flg, false);
					msgList.add(new MCMessage(inptR, DtlInptR.$abort_flg,
							MSBCP1021, toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
									inptR.itm_sub2(), inptR.itm_sub3(), panel),
							toDispGUIIndex(inptR)));
				}
			}
		}

		/**
		 * 工数実績の打切フラグ混在チェック
		 * @param msgList
		 */
		protected void chkWkAbort(MCMessageList msgList) {
			// 更新対象の工数実績から削除行、計画外実績行を除去
			MCList<DtlWkR> tgtWkL = _wkActForCall
					.subList(r -> !r.isStatusDelete() && !isNull(r.wk_schd_no()));

			// 工数実績を工数予定ＮＯ単位にグループ化
			for (MCList<DtlWkR> wkL : tgtWkL.groupList(DtlWkR.$wk_schd_no)) {
				// 打切フラグでグループ化した結果、件数が２件以上ある場合はエラー
				if (wkL.groupBy(DtlWkR.$abort_flg).size() > 1) {
					DtlWkR wkR = wkL.getFirst(DtlWkR.$abort_flg, false);
					msgList.add(new MCMessage(wkR, DtlWkR.$abort_flg, MSBCP1022,
							wkR.wk_cost_cd(), toDispGUIIndex(wkR)));
				}
			}
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(_operForCall);
			bridge.up2().setAll(_inptActForCall);
			bridge.up3().setAll(_lossForCall);
			bridge.up4().setAll(_wkActForCall);
			bridge.up5().setAll(_yieldForCall);
			bridge.up6().setAll(_byProdForCall);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			if (!isNull(getHdrR().end_act_dt())) {
				bridge.up0().act_immed_prnt_flg(getBtnR().act_immed_prnt_flg());
			}
			bridge.up0().not_pd_chk_flg(getInptBtnR().not_pd_chk_flg());
			for (DtlWkR r : getDtlWkL().subList(DtlWkR.$check, true)) {
				if (isNull(r.st_tm())) {
					r.dummy_st_dt(null);
				}
				if (isNull(r.end_tm())) {
					r.dummy_end_dt(null);
				}
			}
		}
		@Override
		protected void handleMCEx(MCException ex) {
			for (DtlWkR r : getDtlWkL()) {
				if (!isNull(r.ac_dt()) && isNull(r.dummy_st_dt())) {
					setDummyDt(r);
				}
			}
			super.handleMCEx(ex);
		}
	}

	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBCL1100_Upd02();
	}

	/**
	 * [MS_MSBCL1100_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1100_Upd02Caller<P extends MSBCP_MfgActReg, B extends MS_MSBCL1100_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1100_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}
	
	//********************** 画面遷移ボタン **************************
	
	/**
	 * Panel[InptBtn]のボタン[open_MSBEP2520]の押下時の処理
	 */
	@Override
	public void doInptBtn_open_MSBEP2520(MCEventInfo info) {
		// 在庫振替実績画面への遷移
		DtlInptR r = DtlInptTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MCRow bind = MCRow.create();
		bind.addStringColumn("loc_cd", r.inpt_loc_cd());
		bind.addStringColumn("itm_cd", r.itm_cd());
		bind.addStringColumn("itm_sub1", r.itm_sub1());
		bind.addStringColumn("itm_sub2", r.itm_sub2());
		bind.addStringColumn("itm_sub3", r.itm_sub3());
		bind.addStringColumn("lot_no", r.lot_no());
		bind.addStringColumn("sublot_no", r.sublot_no());
		bind.addStringColumn("trd_unit_cd", r.base_unit_cd());
		// 製造時に見つかった不良品在庫を投入せずに不良品に振り替える想定なので、投入数量は連携しない
		//bind.addNumberColumn("trd_unit_qty", r.base_unit_inpt_qty());
		bind.addStringColumn("quality_typ", MAC_QUALITY_TYP.GOOD.value());
		bind.addStringColumn("gd_cd", r.gd_cd());
		bind.addStringColumn("sno1", r.sno1());
		bind.addStringColumn("sno2", r.sno2());
		bind.addStringColumn("sno3", r.sno3());
		bind.addStringColumn("sno4", r.sno4());
		bind.addStringColumn("stk_id_typ", r.stk_id_typ());
		bind.addStringColumn("stk_bp_cd", r.stk_bp_cd());
		bind.addStringColumn("stk_arrv_bp_cd", r.stk_arrv_bp_cd());
		openPanel("MS", "MSBEP2520", T1, bind);
	}
	
	/**
	 * Panel[InptBtn]のボタン[open_MSBCP1120]の押下時の処理
	 */
	@Override
	public void doInptBtn_open_MSBCP1120(MCEventInfo info) {
		// ロス内訳入力画面への遷移
		DtlInptR r = DtlInptTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MCRow bind = MCRow.create();
		bind.addStringColumn("itm_cd", r.itm_cd());
		bind.addStringColumn("itm_sub1", r.itm_sub1());
		bind.addStringColumn("itm_sub2", r.itm_sub2());
		bind.addStringColumn("itm_sub3", r.itm_sub3());
		bind.addStringColumn("base_unit_cd", r.base_unit_cd());
		bind.addStringColumn("base_unit_nm", r.base_unit_nm());
		bind.addNumberColumn("base_dec_place", r.base_unit_dec_place());
		bind.addStringColumn("base_unit_conv_rnd_typ", r.base_unit_conv_rnd_typ());
		bind.addNumberColumn("inpt_qty", r.base_unit_inpt_qty());
		
		bind.addBooleanColumn("cont_fctr_flg", r.cont_fctr_flg());
		bind.addStringColumn("cont_fctr_rnd_typ", r.cont_fctr_rnd_typ());
		bind.addNumberColumn("cont_fctr_dec_place", r.cont_fctr_dec_place());
		bind.addNumberColumn("act_cont_fctr", r.act_cont_fctr());
		bind.addNumberColumn("std_cont_fctr", r.std_cont_fctr());
		bind.addNumberColumn("cont_inpt_qty", r.cont_inpt_qty());

		MCList<LossAct_RsltR> lossSubL = _lossMap.get(r.peg_no());
		MCList<LossAct_RsltR> lossSubCloneL = lossSubL.clone();
		MCIndexKey idxkey = lossSubL.createIndex(LossAct_RsltR.$loss_act_no);
		for (LossAct_RsltR cloneR : lossSubCloneL) {
			if (!isNull(cloneR.loss_act_no())) {
				// 行削除された場合にステータスを維持するための考慮
				LossAct_RsltR subR = lossSubL.getFirst(idxkey, cloneR.loss_act_no());
				cloneR.setStatus(subR.getStatus());
			}
		}
		
		Object[] args = new Object[] {
				this, lossSubCloneL, isLossActRefMode()
		};
		openPanel("MS", "MSBCP1120", T1, bind, args);
	}
	
	protected boolean isLossActRefMode() {
		if (isSame(getStatus(), UPD_ACT) || isSame(getStatus(), INS_ACT)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		// 現品票発行画面への遷移
		MCRow bind = MCRow.create();
		bind.addStringColumn("mfg_act_no", getHdrR().mfg_act_no());
		openPanel("MS", "MSBEP0110", T4, bind);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBFP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0110(MCEventInfo info) {
		// ロット情報一覧画面への遷移
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			DtlYieldR r = DtlYieldTable.getSelectedMCRow();
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			doBtn_open_MSBFP0110Sub(r.lot_no(), r.sublot_no());
		}
		else if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			String lotNo = getHdrR().lot_no();
			String sublotNo = getHdrR().sublot_no();
			DtlArrActR r = DtlArrActTable.getSelectedMCRow();
			if (r != null) {
				lotNo = r.lot_no();
				sublotNo = r.sublot_no();
			}
			doBtn_open_MSBFP0110Sub(lotNo, sublotNo);
		}
	}
	
	protected void doBtn_open_MSBFP0110Sub(String lotNo, String sublotNo) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0110");
		mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch msbcp1010 = 
				(mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch) aso.getPanel();
		mcframe.clientMSBF.MSBFP0110.CndR bind = mcframe.clientMSBF.MSBFP0110.CndR
				.create();
		bind.ope(msbcp1010.Cnd_ope_UPD.getActionCommand());
		bind.itm_cd(getHdrR().itm_cd());
		bind.itm_sub1(getHdrR().itm_sub1());
		bind.itm_sub2(getHdrR().itm_sub2());
		bind.itm_sub3(getHdrR().itm_sub3());
		bind.lot_no(lotNo);
		bind.sublot_no(sublotNo);
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		// 製造指図登録画面への遷移
		doBtn_open_MSBCP1010(getHdrR());
	}

	protected void doBtn_open_MSBCP1010(HdrR r) {
		if (!isNull(r.mfg_inst_no())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
			mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
					(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
			mcframe.clientMSBC.MSBCP1010.CndR bind = mcframe.clientMSBC.MSBCP1010.CndR
					.create();
			bind.ope(msbcp1010.Cnd_ope_REF.getActionCommand());
			bind.srch_tgt_no(r.mfg_inst_no());
			bind.latest_flg(true);
			aso.putCnd(bind);
			aso.putSearchAction();
			aso.show();
		}
	}
	
	//********************** テーブル操作（全選択・全解除・行追加・行削除・行コピー ・・・）**************************
	// 工程
	/**
	 * Panel[OperBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doOperBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlOperTable);
	}
	
	/**
	 * Panel[OperBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doOperBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlOperTable);
	}
	
	/**
	 * Panel[OperBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doOperBtn_rdel(MCEventInfo info) {
		DtlOperR r = deleteRow(DtlOperTable);
		r.check(true);
		delAllDtl(r);
		setYieldBtnMode();
		setByProdBtnMode();
		setInptBtnMode();
		setWkBtnMode();
	}
	
	protected void delAllDtl(DtlOperR operR) {
		for (DtlInptR r : getDtlInptL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (!r.isStatusDelete()) {
				deleteInptRow(r);
			}
		}
		
		for (DtlWkR r : getDtlWkL().subList(DtlWkR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (!r.isStatusDelete()) {
				deleteWkRow(r);
			}
		}
		
		for (DtlYieldR r : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (!r.isStatusDelete()) {
				deleteYieldRow(r);
			}
		}
		
		for (DtlByProdR r : getDtlByProdL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (!r.isStatusDelete()) {
				deleteByProdRow(r);
			}
		}
	}
	
	/**
	 * Panel[OperBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doOperBtn_rcopy(MCEventInfo info) {
		DtlOperR r = copyRow(DtlOperTable);

		// コピー元工程行No保持
		MCNumber oldPegNo = r.peg_no();
		
		// 新規行に新工程行Noを設定後保持
		setOperPegNo(r);
		MCNumber newPegNo = r.peg_no();
		
		// 出来高表
		for (DtlYieldR row : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, oldPegNo)) {
			// 旧工程Noと出来高表の同一工程No行をコピー
			DtlYieldR c = row.clone();
			c.oper_peg_no(newPegNo);
			c.setStatus(Status.CREATE);
			DtlYieldTable.insertRow(c);

			// 引き継がないカラムをクリアする
			List<String> cols = getNotInheritCols(NOT_INHERIT_TYPE_COPY_ROW, getDtlYieldL());
			cols.add(DtlYieldR.$oper_del_flg);
			cols.add(DtlYieldR.$oper_act_no);
			c.clear(cols.toArray(new String[0]));
			
			// 同一ロットチェックの設定
			setOrgYieldLotNo(c);
		}
		
		// 副産品表
		for (DtlByProdR row : getDtlByProdL().subList(DtlByProdR.$oper_peg_no, oldPegNo)) {
			// 旧工程Noと副産品表の同一工程No行をコピー
			DtlByProdR c = row.clone();
			c.oper_peg_no(newPegNo);
			c.setStatus(Status.CREATE);
			DtlByProdTable.insertRow(c);
			
			// 引き継がないカラムをクリアする
			List<String> cols = getNotInheritCols(NOT_INHERIT_TYPE_COPY_ROW, getDtlByProdL());
			cols.add(DtlByProdR.$oper_del_flg);
			cols.add(DtlByProdR.$oper_act_no);
			c.clear(cols.toArray(new String[0]));
			
			// 同一ロットチェックの設定
			setOrgByProdLotNo(c);
		}

		// ボタン表示制御
		setOperBtnMode();
		setYieldBtnMode();
		setByProdBtnMode();

		// 選択工程のみチェック時に、選択工程と紐づく行のみ表示する
		if (getOperBtnR().disp_select_oper_only()) {
			doSelectOperFilter();
		}
	}
	protected void setOperPegNo(DtlOperR r) {
		r.peg_no(((MCNumber)getDtlOperL().max(DtlOperR.$peg_no)).add(1));
	}
	
	// 出来高
	/**
	 * Panel[YieldBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doYieldBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlYieldTable);
	}
	
	/**
	 * Panel[YieldBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doYieldBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlYieldTable);
	}
	
	/**
	 * Panel[YieldBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doYieldBtn_rdel(MCEventInfo info) {
		deleteYieldRow(DtlYieldTable.getSelectedMCRow());
		setOperUnitQty(DtlYieldTable.getSelectedMCRow());
	}
	
	protected void deleteYieldRow(DtlYieldR r) {
		if (isYieldRDelDisable(r)) {
			r.check(false);
		}
		else {
			DtlYieldTable.deleteRowNoFocus(r.getGUIIndex());
			if (r.isStatusDelete()) {
				r.check(true);
				setDtlOperChkTrue(r.oper_peg_no());
			}
			else {
				r.check(false);
			}
		}
	}
	
	/**
	 * Panel[YieldBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doYieldBtn_rcopy(MCEventInfo info) {
		DtlYieldR yieldR = DtlYieldTable.getSelectedMCRow();
		if (yieldR.oper_del_flg()) {
			return;
		}
		DtlYieldR r = copyRow(DtlYieldTable);
		setOrgYieldLotNo(r);
		setYieldBtnMode();
		setOperUnitQty(r);
	}

	/**
	 * 出来高実績のコピー行に対してコピー元ロットＮＯを設定し、ロットＮＯをクリアする。
	 * 同一ロットのチェックをオンにすると、コピー元ロットＮＯからロットＮＯが設定される。
	 * @param r
	 */
	protected void setOrgYieldLotNo(DtlYieldR r) {
		r.org_lot_no(r.lot_no());
		r.org_sublot_no(r.sublot_no());
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			if (!r.same_lot_flg() && !isNull(r.lot_no())) {
				r.same_lot_flg(true);
			}
		}
	}
	
	// 副産品
	/**
	 * Panel[ByProdBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doByProdBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlByProdTable);
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doByProdBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlByProdTable);
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doByProdBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			return;
		}
		if (operR.isStatusDelete()) {
			return;
		}
		DtlByProdR r = insertRow(DtlByProdTable);
		r.oper_peg_no(operR.peg_no());
		r.oper_cd(operR.oper_cd());
		r.oper_nm(operR.oper_nm());
		r.oper_seq(operR.oper_seq());
		setByProdBtnMode();
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doByProdBtn_rdel(MCEventInfo info) {
		deleteByProdRow(DtlByProdTable.getSelectedMCRow());
		setByProdBtnMode();
	}
	
	protected void deleteByProdRow(DtlByProdR r) {
		if (isByProdRDelDisable(r)) {
			r.check(false);
		}
		else {
			DtlByProdTable.deleteRowNoFocus(r.getGUIIndex());
			if (r.isStatusDelete()) {
				r.check(true);
				setDtlOperChkTrue(r.oper_peg_no());
			}
			else {
				r.check(false);
			}
		}
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doByProdBtn_rcopy(MCEventInfo info) {
		DtlByProdR byProdR = DtlByProdTable.getSelectedMCRow();
		if (byProdR.oper_del_flg()) {
			return;
		}
		DtlByProdR r = copyRow(DtlByProdTable);
		setOrgByProdLotNo(r);
		setByProdBtnMode();
	}
	
	/**
	 * 副産品実績のコピー行に対してコピー元ロットＮＯを設定し、ロットＮＯをクリアする。
	 * 同一ロットのチェックをオンにすると、コピー元ロットＮＯからロットＮＯが設定される。
	 * @param r
	 */
	protected void setOrgByProdLotNo(DtlByProdR r) {
		r.org_lot_no(r.lot_no());
		r.org_sublot_no(r.sublot_no());
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			if (!r.same_lot_flg() && !isNull(r.lot_no())) {
				r.same_lot_flg(true);
			}
		}
	}
	
	// 投入
	/**
	 * Panel[InptBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doInptBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlInptTable);
	}
	
	/**
	 * Panel[InptBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doInptBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlInptTable);
	}
	
	/**
	 * Panel[InptBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doInptBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			return;
		}
		if (operR.isStatusDelete()) {
			return;
		}
		DtlInptR r = insertRow(DtlInptTable);
		r.oper_peg_no(operR.peg_no());
		r.oper_cd(operR.oper_cd());
		r.oper_nm(operR.oper_nm());
		r.oper_seq(operR.oper_seq());
		setInptPegNo(r);
		setInptBtnMode();
	}
	
	/**
	 * Panel[InptBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doInptBtn_rdel(MCEventInfo info) {
		deleteInptRow(DtlInptTable.getSelectedMCRow());
		setInptBtnMode();
	}
	
	protected void deleteInptRow(DtlInptR r) {
		if (isInptRDelDisable(r)) {
			r.check(false);
		}
		else {
			DtlInptTable.deleteRowNoFocus(r.getGUIIndex());
			if (r.isStatusDelete()) {
				r.check(true);
				setDtlOperChkTrue(r.oper_peg_no());
				delLoss(r);
			}
			else {
				r.check(false);
				delLoss(r);
			}
		}
	}
	
	/**
	 * Panel[InptBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doInptBtn_rcopy(MCEventInfo info) {
		DtlInptR inptR = DtlInptTable.getSelectedMCRow();
		if (inptR.oper_del_flg()) {
			return;
		}
		DtlInptR r = copyRow(DtlInptTable);
		clearAcXfrQty(r);
		MCNumber srcPegNo = r.peg_no();
		setInptPegNo(r);
		copyLoss(srcPegNo, r);
		setInptBtnMode();
		setMixFlg(r);
	}
	
	protected void clearAcXfrQty(DtlInptR r) {
		setValueEx(columnDtlInpt_acxfr_act_qty, r.getGUIIndex(), null);
	}
	
	protected void setInptPegNo(DtlInptR r) {
		MCNumber max = (MCNumber)getDtlInptL().max(DtlInptR.$peg_no);
		if (isNull(max)) {
			r.peg_no(MCNumber.ZERO);
		}
		else {
			r.peg_no(max.add(1));
		}
	}
	
	protected MCList<LossAct_RsltR> getLossSubL(MCNumber pegNo) {
		MCList<LossAct_RsltR> ret = _lossMap.get(pegNo);
		if (ret == null) {
			return MCList.create(LossAct_RsltR.class);
		}
		return ret;
	}
	
	protected void copyLoss(MCNumber srcPegNo, DtlInptR r) {
		MCList<LossAct_RsltR> lossSubL = getLossSubL(srcPegNo);
		if (lossSubL == null || lossSubL.isEmpty()) {
			return;
		}
		MCList<LossAct_RsltR> copyL = lossSubL.clone();
		for (LossAct_RsltR copyR : copyL) {
			copyR.inpt_peg_no(r.peg_no());
			copyR.loss_act_no(null);
			copyR.setStatus(Status.NONE);
		}
		
		r.loss_qty_enable_flg(isLossQtyEnable(copyL));
		r.fxd_loss_qty_enable_flg(isFxdLossQtyEnable(copyL));
		
		_lossMap.put(r.peg_no(), copyL);
		getDtlLossL().addAll(copyL);
	}
	
	protected void delLoss(DtlInptR r) {
		MCList<LossAct_RsltR> lossSubL = getLossSubL(r.peg_no());
		if (lossSubL == null || lossSubL.isEmpty()) {
			return;
		}
		if (r.isStatusDelete()) {
			lossSubL.setStatus(MCRow.Status.DELETE);
		}
		else {
			if (isNull(r.inpt_act_no())) {
				getDtlLossL().removeAll(lossSubL);
				_lossMap.remove(r.peg_no());
			}
			else {
				// 行削除⇒行削除解除の考慮
				lossSubL.setStatus(MCRow.Status.NONE);
			}
		}
	}
	
	// 工数
	/**
	 * Panel[WkBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWkBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlWkTable);
	}
	
	/**
	 * Panel[WkBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWkBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlWkTable);
	}
	
	/**
	 * Panel[WkBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWkBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			return;
		}
		if (operR.isStatusDelete()) {
			return;
		}
		DtlWkR r = insertRow(DtlWkTable);
		r.oper_peg_no(operR.peg_no());
		r.oper_cd(operR.oper_cd());
		r.oper_nm(operR.oper_nm());
		r.oper_seq(operR.oper_seq());
		setWkBtnMode();
	}
	
	/**
	 * Panel[WkBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWkBtn_rdel(MCEventInfo info) {
		deleteWkRow(DtlWkTable.getSelectedMCRow());
		setWkBtnMode();
	}
	
	protected void deleteWkRow(DtlWkR r) {
		if (isWkRDelDisable(r)) {
			r.check(false);
		}
		else {
			DtlWkTable.deleteRowNoFocus(r.getGUIIndex());
			if (r.isStatusDelete()) {
				r.check(true);
				setDtlOperChkTrue(r.oper_peg_no());
			}
			else {
				r.check(false);
			}
		}
	}
	
	/**
	 * Panel[WkBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWkBtn_rcopy(MCEventInfo info) {
		DtlWkR wkR = DtlWkTable.getSelectedMCRow();
		if (wkR.oper_del_flg()) {
			return;
		}
		copyRow(DtlWkTable);
		setWkBtnMode();
	}

	protected void setBtnMode() {
		setOperBtnMode();
		setYieldBtnMode();
		setByProdBtnMode();
		setInptBtnMode();
		setWkBtnMode();
		setFtrBtnMode();
	}
	
	// 工程
	protected void setOperBtnMode() {
		DtlOperR r = DtlOperTable.getSelectedMCRow();
		// 行削除
		if (isOperRDelDisable(r)) {
			OperBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(OperBtn_rdel);
		}
		// 行コピー
		if (isNull(r) || getHdrR().arr_purc_auto_reg_flg()) {
			OperBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(OperBtn_rcopy);
		}

		// 投入再計算
		if (getDtlInptL().isEmpty()) {
			OperBtn_sprt_inpt_recalc.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(OperBtn_sprt_inpt_recalc);
		}

		// 工数再計算
		if (getDtlWkL().isEmpty()) {
			OperBtn_sprt_wk_recalc.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(OperBtn_sprt_wk_recalc);
		}
	}
	
	protected boolean isOperRDelDisable(DtlOperR r) {
		if (isNull(r)) {
			return true;
		}
		if (getHdrR().arr_purc_auto_reg_flg()) {
			return true;
		}
		if (!r.isStatusCreate()) {
			if (!isNull(r.oper_inst_no()) && isNull(r.oper_act_no())) {
				// 検索で取得した予定行は行削除不可
				// ※行コピーで作成した予定行は削除可能。行コピーした場合、ステータスはCreateとなるためCreateかどうかの判断をしている
				return true;
			}
		}
		return false;
	}
	
	// 出来高
	protected void setYieldBtnMode() {
		DtlYieldR r = DtlYieldTable.getSelectedMCRow();
		// 行削除
		// 工程の行削除によって強制的に行削除された場合、個別に行削除復活を行えないようにする
		// ※isYieldRDelDisableでr.oper_del_flgを評価してしまうと、工程実績の行削除処理で不都合があるため、ここで評価する
		if (isYieldRDelDisable(r) || r.oper_del_flg()) {
			YieldBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(YieldBtn_rdel);
		}
		// 行コピー、全選択、全解除
		if (isNull(r) || getHdrR().arr_purc_auto_reg_flg()) {
			YieldBtn_rcopy.setMode(MCMode.DISABLE);
			YieldBtn_select_all.setMode(MCMode.DISABLE);
			YieldBtn_deselect_all.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(YieldBtn_rcopy);
			setDefaultMode(YieldBtn_select_all);
			setDefaultMode(YieldBtn_deselect_all);
		}
		
		// ロット発番
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			setDefaultMode(YieldBtn_sprt_lot_no);
			setDefaultMode(YieldBtn_lot_issue_flg);
			setDefaultMode(YieldBtn_sublot_issue_flg);
		}
		else {
			YieldBtn_sprt_lot_no.setMode(MCMode.DISABLE);
			YieldBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
			YieldBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected boolean isYieldRDelDisable(DtlYieldR r) {
		if (isNull(r)) {
			return true;
		}
		if (getHdrR().arr_purc_auto_reg_flg()) {
			return true;
		}
		if (!r.isStatusCreate()) {
			if (!isNull(r.yield_schd_no()) && isNull(r.yield_act_no())) {
				// 検索で取得した予定行は行削除不可
				// ※行コピーで作成した予定行は削除可能。行コピーした場合、ステータスはCreateとなるためCreateかどうかの判断をしている
				return true;
			}
		}
		return false;
	}
	
	// 副産品
	protected void setByProdBtnMode() {
		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			ByProdBtn_sprt_lot_no.setMode(MCMode.DISABLE);
			ByProdBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
			ByProdBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
			ByProdBtn_select_all.setMode(MCMode.DISABLE);
			ByProdBtn_deselect_all.setMode(MCMode.DISABLE);
			ByProdBtn_radd.setMode(MCMode.DISABLE);
			ByProdBtn_rdel.setMode(MCMode.DISABLE);
			ByProdBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			// 行追加
			DtlOperR operR = DtlOperTable.getSelectedMCRow();
			if (isNull(operR) || operR.isStatusDelete()) {
				ByProdBtn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(ByProdBtn_radd);
			}
			DtlByProdR r = DtlByProdTable.getSelectedMCRow();
			// 行削除
			// 工程の行削除によって強制的に行削除された場合、個別に行削除復活を行えないようにする
			// ※isByProdRDelDisableでr.oper_del_flgを評価してしまうと、工程実績の行削除処理で不都合があるため、ここで評価する
			if (isByProdRDelDisable(r) || r.oper_del_flg()) {
				ByProdBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(ByProdBtn_rdel);
			}
			// 行コピー
			if (isNull(r)) {
				ByProdBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(ByProdBtn_rcopy);
			}
			// ロット発番
			if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
				setDefaultMode(ByProdBtn_sprt_lot_no);
			}
			else {
				ByProdBtn_sprt_lot_no.setMode(MCMode.DISABLE);
			}
		}
	}
	
	protected boolean isDtlRAddDisable(DtlOperR r) {
		if (isNull(r)) {
			return true;
		}
		if (r.isStatusDelete()) {
			return true;
		}
		return false;
	}
	
	protected boolean isByProdRDelDisable(DtlByProdR r) {
		if (isNull(r)) {
			return true;
		}
		if (!r.isStatusCreate()) {
			if (!isNull(r.yield_schd_no()) && isNull(r.yield_act_no())) {
				// 検索で取得した予定行は行削除不可
				// ※行コピーで作成した予定行は削除可能。行コピーした場合、ステータスはCreateとなるためCreateかどうかの判断をしている
				return true;
			}
		}
		return false;
	}
	
	// 投入
	protected void setInptBtnMode() {
		// 行追加
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR) || operR.isStatusDelete()) {
			InptBtn_radd.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(InptBtn_radd);
		}
		DtlInptR r = DtlInptTable.getSelectedMCRow();
		// 行削除
		// 工程の行削除によって強制的に行削除された場合、個別に行削除復活を行えないようにする。
		// ※isInptRDelDisableでr.oper_del_flgを評価してしまうと、工程実績の行削除処理で不都合があるため、ここで評価する
		if (isInptRDelDisable(r) || r.oper_del_flg()) {
			InptBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(InptBtn_rdel);
		}
		// 行コピー
		if (isNull(r)) {
			InptBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(InptBtn_rcopy);
		}
		// ロス内訳入力
		if (!isLossActRefMode()) {
			if (isNull(r) || !r.check() || r.isStatusDelete() || isNull(getLossSubL(r.peg_no()))) {
				InptBtn_open_MSBCP1120.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(InptBtn_open_MSBCP1120);
			}
		}
		else {
			if (isNull(r) || isNull(getLossSubL(r.peg_no()))) {
				InptBtn_open_MSBCP1120.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(InptBtn_open_MSBCP1120);
			}
		}
		// 在庫情報選択
		if (!isNull(r)) {
			setDefaultMode(InptBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
		}
		else {
			InptBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
		}
	}
	
	protected boolean isInptRDelDisable(DtlInptR r) {
		if (isNull(r)) {
			return true;
		}
		if (!r.isStatusCreate()) {
			if (!isNull(r.inpt_schd_no()) && isNull(r.inpt_act_no())) {
				// 検索で取得した予定行は行削除不可
				// ※行コピーで作成した予定行は削除可能。行コピーした場合、ステータスはCreateとなるためCreateかどうかの判断をしている
				return true;
			}
		}
		return false;
	}
	
	// 工数
	protected void setWkBtnMode() {
		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			WkBtn_select_all.setMode(MCMode.DISABLE);
			WkBtn_deselect_all.setMode(MCMode.DISABLE);
			WkBtn_radd.setMode(MCMode.DISABLE);
			WkBtn_rdel.setMode(MCMode.DISABLE);
			WkBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			// 行追加
			DtlOperR operR = DtlOperTable.getSelectedMCRow();
			if (isNull(operR) || operR.isStatusDelete()) {
				WkBtn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(WkBtn_radd);
			}
			DtlWkR r = DtlWkTable.getSelectedMCRow();
			// 行削除
			// 工程の行削除によって強制的に行削除された場合、個別に行削除復活を行えないようにする
			// ※isWkRDelDisableでr.oper_del_flgを評価してしまうと、工程実績の行削除処理で不都合があるため、ここで評価する
			if (isWkRDelDisable(r) || r.oper_del_flg()) {
				WkBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(WkBtn_rdel);
			}
			// 行コピー
			if (isNull(r)) {
				WkBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(WkBtn_rcopy);
			}
		}
	}
	
	protected boolean isWkRDelDisable(DtlWkR r) {
		if (isNull(r)) {
			return true;
		}
		if (!r.isStatusCreate()) {
			if (!isNull(r.wk_schd_no()) && isNull(r.wk_act_no())) {
				// 検索で取得した予定行は行削除不可
				// ※行コピーで作成した予定行は削除可能。行コピーした場合、ステータスはCreateとなるためCreateかどうかの判断をしている
				return true;
			}
		}
		return false;
	}

	protected void setFtrBtnMode() {
		DtlYieldR r = DtlYieldTable.getSelectedMCRow();
		if (isNull(r) || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			Btn_open_MSBFP0110.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Btn_open_MSBFP0110);
		}
		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			Btn_open_MSBEP0110.setMode(MCMode.READ_ONLY);
		}
		else {
			// 現品票発行ボタンは、出来高一覧または副産品一覧に出来高実績登録済の行が存在しない場合非活性とする
			MCList<DtlYieldR> yield = DtlYieldTable.getList();
			int yieldCount = yield.subList(row -> {
					return !isNull(row.yield_act_no()) && !row.isStatusDelete();
				}).size();
			MCList<DtlByProdR> byProd = DtlByProdTable.getList();
			int byProdCount = byProd.subList(row -> {
					return !isNull(row.yield_act_no()) && !row.isStatusDelete();
				}).size();
			if(0 < yieldCount || 0 < byProdCount) {
				setDefaultMode(Btn_open_MSBEP0110);
			}
			else {
				Btn_open_MSBEP0110.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	//********************** 画面起動時の初期設定 **************************
	@Override
	protected void setupParts() {
		super.setupParts();

		// ヘッダ
		Hdr_st_ac_p_PPanel.setRelateBeans(Hdr_st_act_dt);
		Hdr_end_ac_p_PPanel.setRelateBeans(Hdr_end_act_dt);
		Hdr_st_act_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_mfg_rem_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_mfg_inst_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_yield_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_dfct_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		
		Hdr_act_usr_dpt_p_PPanel.setRelateBeans(Hdr_st_ac_dt);
		Hdr_aprv_usr_dpt_p_PPanel.setRelateBeans(Hdr_aprv_dt);
		Hdr_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);

		// 工程
		DtlOper_oper_unit_act_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd,
				columnDtlOper_oper_unit_dec_place);
		DtlOper_oper_unit_schd_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd,
				columnDtlOper_oper_unit_dec_place);
		DtlOper_oper_unit_rem_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd,
				columnDtlOper_oper_unit_dec_place);
		DtlOper_base_unit_act_qty_p_PPanel.setRelateBeans(columnDtlOper_base_unit_cd,
				columnDtlOper_base_unit_dec_place, columnDtlOper_base_unit_conv_rnd_typ,
				columnDtlOper_oper_unit_act_qty, columnDtlOper_oper_conv_qty,
				columnDtlOper_oper_std_qty);
		DtlOper_base_unit_schd_qty_p_PPanel.setRelateBeans(columnDtlOper_base_unit_cd,
				columnDtlOper_base_unit_dec_place);
		
		DtlOper_oper_str_ln_p_PPanel.setRelateBeans(columnDtlOper_oper_loc_cd,
				columnDtlOper_oper_str_ln_tgt_flg);

		// 出来高
		DtlYield_ac_dt_p_PPanel.setRelateBeans(columnDtlYield_act_dt);
		DtlYield_trd_unit_yield_act_qty_p_PPanel.setRelateBeans(columnDtlYield_itm_cd,
				columnDtlYield_itm_sub1, columnDtlYield_itm_sub2, columnDtlYield_itm_sub3,
				columnDtlYield_trd_unit_cd, columnDtlYield_trd_unit_dec_place,
				columnDtlYield_trd_unit_conv_rnd_typ, columnDtlYield_conv_base_qty,
				columnDtlYield_conv_qty, columnDtlYield_base_unit_cd);
		DtlYield_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnDtlYield_base_unit_cd, columnDtlYield_base_unit_dec_place,
				columnDtlYield_base_unit_conv_rnd_typ, columnDtlYield_trd_unit_yield_act_qty,
				columnDtlYield_conv_base_qty, columnDtlYield_conv_qty);
		DtlYield_base_unit_yield_schd_qty_p_PPanel.setRelateBeans(columnDtlYield_base_unit_cd,
				columnDtlYield_base_unit_dec_place);
		DtlYield_base_unit_yield_rem_qty_p_PPanel.setRelateBeans(columnDtlYield_base_unit_cd,
				columnDtlYield_base_unit_dec_place);

		DtlYield_lot_no_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2,
				Hdr_itm_sub3, columnDtlYield_lot_mng_typ, columnDtlYield_lot_no_typ,
				columnDtlYield_sublot_mng_typ, columnDtlYield_sublot_no_typ, false);
		
		DtlYield_strg_str_ln_p_PPanel.setRelateBeans(columnDtlYield_strg_loc_cd,
				columnDtlYield_strg_str_ln_tgt_flg);

		// 副産品
		DtlByProd_ac_dt_p_PPanel.setRelateBeans(columnDtlByProd_act_dt);
		DtlByProd_trd_unit_yield_act_qty_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_trd_unit_cd,
				columnDtlByProd_trd_unit_dec_place,
				columnDtlByProd_trd_unit_conv_rnd_typ, columnDtlByProd_conv_base_qty,
				columnDtlByProd_conv_qty, columnDtlByProd_base_unit_cd);
		DtlByProd_base_unit_yield_act_qty_p_PPanel.setRelateBeans(
				columnDtlByProd_base_unit_cd, columnDtlByProd_base_unit_dec_place,
				columnDtlByProd_base_unit_conv_rnd_typ, columnDtlByProd_trd_unit_yield_act_qty,
				columnDtlByProd_conv_base_qty, columnDtlByProd_conv_qty);
		DtlByProd_base_unit_yield_schd_qty_p_PPanel.setRelateBeans(columnDtlByProd_base_unit_cd,
				columnDtlByProd_base_unit_dec_place);
		DtlByProd_base_unit_yield_rem_qty_p_PPanel.setRelateBeans(columnDtlByProd_base_unit_cd,
				columnDtlByProd_base_unit_dec_place);

		DtlByProd_lot_no_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_lot_mng_typ,
				columnDtlByProd_lot_no_typ, columnDtlByProd_sublot_mng_typ,
				columnDtlByProd_sublot_no_typ, false);
		DtlByProd_sno_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_sno1_mng_typ,
				columnDtlByProd_sno2_mng_typ, columnDtlByProd_sno3_mng_typ,
				columnDtlByProd_sno4_mng_typ);
		
		DtlByProd_strg_str_ln_p_PPanel.setRelateBeans(columnDtlByProd_strg_loc_cd,
				columnDtlByProd_strg_str_ln_tgt_flg);

		// 入荷実績
		DtlArrAct_trd_unit_arr_qty_p_PPanel.setRelateBeans(columnDtlArrAct_trd_unit_cd,
				columnDtlArrAct_trd_unit_dec_place);
		DtlArrAct_arr_qty_p_PPanel.setRelateBeans(columnDtlArrAct_base_unit_cd,
				columnDtlArrAct_base_unit_dec_place);
		// 投入
		DtlInpt_ac_dt_p_PPanel.setRelateBeans(columnDtlInpt_act_dt);
		DtlInpt_ver_no_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd,
				columnDtlInpt_itm_sub1, columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				Hdr_site_cd, columnDtlInpt_ver_flg);
		DtlInpt_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_loss_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_fxd_loss_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_schd_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_schd_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_inpt_rem_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_acxfr_act_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_alt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);

		DtlInpt_cont_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_inpt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_cont_loss_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_loss_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_cont_fxd_loss_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_fxd_loss_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_cont_schd_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_schd_inpt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ);
		DtlInpt_cont_schd_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_schd_fxd_rqmt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ);
		DtlInpt_cont_acxfr_act_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_acxfr_act_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ);

		DtlInpt_lot_no_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd,
				columnDtlInpt_itm_sub1, columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				columnDtlInpt_lot_mng_typ, columnDtlInpt_sublot_mng_typ);
		DtlInpt_sno_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1,
				columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				columnDtlInpt_sno1_mng_typ, columnDtlInpt_sno2_mng_typ,
				columnDtlInpt_sno3_mng_typ, columnDtlInpt_sno4_mng_typ);
		DtlInpt_inpt_str_ln_p_PPanel.setRelateBeans(columnDtlInpt_inpt_loc_cd,
				columnDtlInpt_inpt_str_ln_tgt_flg);

		// 工数
		DtlWk_act_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_schd_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_rem_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_fxd_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_wk_usr_p_PPanel.setRelateBeans(columnDtlWk_ac_dt);
		
		DtlOper_oper_unit_act_qty_p_PPanel.columnQty_qty.setName("oper_unit_act_qty_p.qty");
		DtlOper_oper_unit_schd_qty_p_PPanel.columnQty_qty.setName("oper_unit_schd_qty_p.qty");
		DtlOper_oper_unit_rem_qty_p_PPanel.columnQty_qty.setName("oper_unit_rem_qty_p.qty");
		DtlOper_base_unit_act_qty_p_PPanel.columnQty_qty.setName("base_unit_act_qty_p.qty");
		DtlOper_base_unit_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_schd_qty_p.qty");
		DtlOper_st_act_tm_p_PPanel.columnYmdHm_ymd.setName("st_act_tm_p.ymd");
		DtlOper_st_act_tm_p_PPanel.columnYmdHm_hm.setName("st_act_tm_p.hm");
		DtlOper_end_act_tm_p_PPanel.columnYmdHm_ymd.setName("end_act_tm_p.ymd");
		DtlOper_end_act_tm_p_PPanel.columnYmdHm_hm.setName("end_act_tm_p.hm");
		
		DtlYield_trd_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("trd_unit_yield_act_qty_p.qty");
		DtlYield_base_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_act_qty_p.qty");
		DtlYield_base_unit_yield_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_schd_qty_p.qty");
		DtlYield_base_unit_yield_rem_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_rem_qty_p.qty");
		
		DtlByProd_trd_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("trd_unit_yield_act_qty_p.qty");
		DtlByProd_base_unit_yield_act_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_act_qty_p.qty");
		DtlByProd_base_unit_yield_schd_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_schd_qty_p.qty");
		DtlByProd_base_unit_yield_rem_qty_p_PPanel.columnQty_qty.setName("base_unit_yield_rem_qty_p.qty");
		
		DtlArrAct_trd_unit_arr_qty_p_PPanel.columnQty_qty.setName("trd_unit_arr_qty_p.qty");
		DtlArrAct_arr_qty_p_PPanel.columnQty_qty.setName("arr_qty_p.qty");
		
		DtlInpt_inpt_qty_p_PPanel.columnQty_qty.setName("inpt_qty_p.qty");
		DtlInpt_loss_qty_p_PPanel.columnQty_qty.setName("loss_qty_p.qty");
		DtlInpt_fxd_loss_qty_p_PPanel.columnQty_qty.setName("fxd_loss_qty_p.qty");
		DtlInpt_schd_inpt_qty_p_PPanel.columnQty_qty.setName("schd_inpt_qty_p.qty");
		DtlInpt_schd_fxd_rqmt_qty_p_PPanel.columnQty_qty.setName("schd_fxd_rqmt_qty_p.qty");
		DtlInpt_inpt_rem_qty_p_PPanel.columnQty_qty.setName("inpt_rem_qty_p.qty");
		DtlInpt_acxfr_act_qty_p_PPanel.columnQty_qty.setName("acxfr_act_qty_p.qty");
		DtlInpt_alt_qty_p_PPanel.columnQty_qty.setName("alt_qty_p.qty");
		DtlInpt_sno_p_PPanel.columnSno_sno1.setName("sno_p.sno1");
		DtlInpt_sno_p_PPanel.columnSno_sno1_null_flg.setName("sno_p.sno1_null_flg");
		DtlInpt_sno_p_PPanel.columnSno_sno2.setName("sno_p.sno2");
		DtlInpt_sno_p_PPanel.columnSno_sno2_null_flg.setName("sno_p.sno2_null_flg");
		DtlInpt_sno_p_PPanel.columnSno_sno3.setName("sno_p.sno3");
		DtlInpt_sno_p_PPanel.columnSno_sno3_null_flg.setName("sno_p.sno3_null_flg");
		DtlInpt_sno_p_PPanel.columnSno_sno4.setName("sno_p.sno4");
		DtlInpt_sno_p_PPanel.columnSno_sno4_null_flg.setName("sno_p.sno4_null_flg");
		DtlInpt_inst_sno_p_PPanel.columnSno_sno1.setName("inst_sno_p.sno1");
		DtlInpt_inst_sno_p_PPanel.columnSno_sno2.setName("inst_sno_p.sno2");
		DtlInpt_inst_sno_p_PPanel.columnSno_sno3.setName("inst_sno_p.sno3");
		DtlInpt_inst_sno_p_PPanel.columnSno_sno4.setName("inst_sno_p.sno4");
		DtlInpt_ver_no_p_PPanel.columnVerNo_ver_no.setName("ver_no_p.ver_no");
		DtlInpt_inst_ver_no_p_PPanel.columnVerNo_ver_no.setName("inst_ver_no_p.ver_no");
		DtlInpt_cont_inpt_qty_p_PPanel.columnContQty_cont_qty.setName("cont_inpt_qty_p.cont_qty");
		DtlInpt_cont_loss_qty_p_PPanel.columnContQty_cont_qty.setName("cont_loss_qty_p.cont_qty");
		DtlInpt_cont_fxd_loss_qty_p_PPanel.columnContQty_cont_qty.setName("cont_fxd_loss_qty_p.cont_qty");
		DtlInpt_cont_schd_inpt_qty_p_PPanel.columnContQty_cont_qty.setName("cont_schd_inpt_qty_p.cont_qty");
		DtlInpt_cont_schd_fxd_rqmt_qty_p_PPanel.columnContQty_cont_qty.setName("cont_schd_fxd_rqmt_qty_p.cont_qty");
		DtlInpt_cont_acxfr_act_qty_p_PPanel.columnContQty_cont_qty.setName("cont_acxfr_act_qty_p.cont_qty");
		
		DtlWk_st_tm_p_PPanel.columnYmdHm_hm.setName("st_tm_p.hm");
		DtlWk_end_tm_p_PPanel.columnYmdHm_hm.setName("end_tm_p.hm");
		DtlWk_act_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setName("act_wk_cost_p.wk_cost_qty");
		DtlWk_schd_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setName("schd_wk_cost_p.wk_cost_qty");
		DtlWk_rem_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setName("rem_wk_cost_p.wk_cost_qty");
		DtlWk_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setName("wk_cost_p.wk_cost_qty");
		DtlWk_fxd_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setName("fxd_wk_cost_p.wk_cost_qty");
	}
	
	@Override
	protected void listInit() {
	    super.listInit();
		
	    getCnd_div_seq_ListPutter().putBind(DivSeqCols.$i_mfg_inst_no, Cnd_srch_tgt_no);
		    
	    getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_cd, Hdr_itm_cd);
	    getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub1, Hdr_itm_sub1);
	    getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub2, Hdr_itm_sub2);
	    getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub3, Hdr_itm_sub3);
	    
	    // 版ＮＯは埋込画面の項目のため、ListPutterの取得方法が異なる
	   	MCListPutter inptVerNoPutter = columnDtlInpt_ver_no.getListConfig().getListPutter();
	   	inptVerNoPutter.putBind(ItmVerCols.$i_itm_cd, columnDtlInpt_itm_cd);
	   	inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub1, columnDtlInpt_itm_sub1);
	   	inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub2, columnDtlInpt_itm_sub2);
	   	inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub3, columnDtlInpt_itm_sub3);
	   	inptVerNoPutter.putBind(ItmVerCols.$i_site_cd, Hdr_site_cd);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setSrchTgtTyp();
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		_lossMap.clear();
	}
	
	protected void setSrchTgtTyp() {
		setValueEx(Cnd_srch_tgt_typ_nm, MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
	}
	
	@Override
	protected void linkBeansToISPanel() {
	    super.linkBeansToISPanel();
	   	MCListPutter yieldStrgLocPutter = getDtlYield_strg_loc_cd_ListPutter();
	   	yieldStrgLocPutter.putBind(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.WG.value());
	   	yieldStrgLocPutter.putBind(LocCols.$i_wg_cd , Hdr_wg_cd);
	    
	   	MCListPutter byProdStrgLocPutter = getDtlYield_strg_loc_cd_ListPutter();
	   	byProdStrgLocPutter.putBind(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.WG.value());
	   	byProdStrgLocPutter.putBind(LocCols.$i_wg_cd , Hdr_wg_cd);

	}
	
	//********************** コンボボックスの絞り込み **************************
	// 検索対象区分
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, getDispProdSrchTgtTyp());
		}
		else {
			addListLogicCnd(row, getDispProdSrchTgtTyp());
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	public MSC_PROD_SRCH_TGT_TYP[] getDispProdSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_PROD_SRCH_TGT_TYP[] {
					MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO
			};
		}
		else {
			return new MSC_PROD_SRCH_TGT_TYP[] {
				MSC_PROD_SRCH_TGT_TYP.MFG_ACT_NO,
				MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO
			};
		}
	}
	
	// 製造状況区分
	@Override
	public MCList getHdr_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getHdr_mfg_sts_typ(row, info);
	}
	
	public MSC_MFG_STS_TYP[] getDispMfgStsTyp() {
		return new MSC_MFG_STS_TYP[] {
				MSC_MFG_STS_TYP.STT, MSC_MFG_STS_TYP.CMPL
		};
	}
	
	// 出来高区分
	@Override
	public MCList getDtlYield_yield_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispYieldTyp());
		return super.getDtlYield_yield_typ(row, info);
	}
	
	public MAC_YIELD_TYP[] getDispYieldTyp() {
		return new MAC_YIELD_TYP[] {
				MAC_YIELD_TYP.GOOD, MAC_YIELD_TYP.DFCT
		};
	}
	
	// 良品区分
	@Override
	public MCList getDtlByProd_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getDtlByProd_quality_typ(row, info);
	}
	
	public MAC_QUALITY_TYP[] getDispQualityTyp() {
		return new MAC_QUALITY_TYP[] {
				MAC_QUALITY_TYP.GOOD, MAC_QUALITY_TYP.DFCT_OPER
		};
	}
	
	// 在庫識別区分
	@Override
	public MCList getDtlInpt_stk_id_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispStkIdTyp());
		return super.getDtlInpt_stk_id_typ(row, info);
	}
	
	public MSC_STK_ID_TYP[] getDispStkIdTyp() {
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			return new MSC_STK_ID_TYP[] {
					MSC_STK_ID_TYP.COSTK, MSC_STK_ID_TYP.RNT_RCV, MSC_STK_ID_TYP.NCV_RCV,
					MSC_STK_ID_TYP.ONR_PROV
			};
		}
		else if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			return new MSC_STK_ID_TYP[] {
					MSC_STK_ID_TYP.COSTK, MSC_STK_ID_TYP.RNT_RCV, MSC_STK_ID_TYP.NCV_RCV,
					MSC_STK_ID_TYP.ONR_PROV, MSC_STK_ID_TYP.SLF_SUPPRT
			};
		}
		return new MSC_STK_ID_TYP[]{};
	}
	
	@Override
	public MCList getDtlInpt_inpt_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlInpt_inpt_loc_cd(row, info);
	}
	
	@Override
	public MCList getDtlYield_strg_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlYield_strg_loc_cd(row, info);
	}

	@Override
	public MCList getDtlByProd_strg_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlByProd_strg_loc_cd(row, info);
	}
	// 工程場所、投入場所、出来高格納場所、副産品格納場所
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtlOper_oper_loc_cd
				|| beans == columnDtlInpt_inpt_loc_cd
				|| beans == columnDtlYield_strg_loc_cd
				|| beans == columnDtlByProd_strg_loc_cd) {
			setLocBind(row);
		}
		return row;
	}
	
	protected void setLocBind(MCRow row) {
		row.setStringNE(LocCols.$i_wg_cd , getHdrR().wg_cd());

		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			// 外注の場合は、同一ＷＧであれば外注場所を設定可能
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.MFG_WG.value());
		}
		else {
			// 内製の場合は、格納先に外注場所を設定できない
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.value());
		}
	}
	
	//********************** IfOpePanel関連の実装 **************************
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlOperL());
		ret.add(getOperBtnR());
		ret.add(getDtlInptL());
		ret.add(getInptBtnR());
		ret.add(getDtlWkL());
		ret.add(getWkBtnR());
		ret.add(getDtlYieldL());
		ret.add(getYieldBtnR());
		ret.add(getDtlByProdL());
		ret.add(getByProdBtnR());
		ret.add(getDtlArrActL());
		return ret;
	}
	
	@Override
	protected void opePanelFillSpace() {
		// 指図を検索してから登録するため、fillSpaceは行わない
		return;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	@Override
	public boolean isINSStatus(String status) {
		return isSame(status, INS_ACT);
	}
	
	@Override
	public boolean isUPDStatus(String status) {
		return isSame(status, UPD_ACT) || isSame(status, UPD_APRV);
	}
	
	@Override
	public boolean isDELStatus(String status) {
		return isSame(status, DEL_ACT) || isSame(status, DEL_APRV);
	}
	
	@Override
	public boolean isFIX_UStatus(String status) {
		return isSame(status, FIX_U) || isSame(status, FIX_APRV);
	}
	
	public boolean isSRCHStatus(String status) {
		return isSame(status, SRCH) || isSame(status, SRCH_INS);
	}
	
	@Override
	public boolean isINSOpe(String ope) {
		return isSame(Cnd_ope_INS.getActionCommand(), ope);
	}

	@Override
	public boolean isUPDOpe(String ope) {
		return isSame(Cnd_ope_UPD.getActionCommand(), ope)
				|| isSame(Cnd_ope_APRV.getActionCommand(), ope);
	}

	@Override
	public boolean isDELOpe(String ope) {
		return isSame(Cnd_ope_DEL.getActionCommand(), ope);
	}

	@Override
	public boolean isREFOpe(String ope) {
		return isSame(Cnd_ope_REF.getActionCommand(), ope);
	}
	
	//********************** 参照登録、行コピー **************************
	protected void setRowStatusForIns(List<MCContainer> containers) {
		// 参照登録はないため何もしない
	}

	@Override
	protected void clearNotInheritInfo(List<MCContainer> containers) {
		// 参照登録はないため画面クリア
		for (MCContainer cont : containers) {
			cont.clear();
		}
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getDtlOperL()) {
			list.addAll(getOperInheritCols(type));
		}
		else if (cont == getDtlInptL()) {
			list.addAll(getInptInheritCols(type));
		}
		else if (cont == getDtlWkL()) {
			list.addAll(getWkInheritCols(type));
		}
		else if (cont == getDtlYieldL()) {
			list.addAll(getYieldInheritCols(type));
		}
		else if (cont == getDtlByProdL()) {
			list.addAll(getByProdInheritCols(type));
		}
		return list;
	}
	
	protected List<String> getOperInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlOperR.$oper_act_no);
		list.add(DtlOperR.$mes_flg);
		list.add(DtlOperR.$ext_sys_cd);
		list.add(DtlOperR.$ext_sys_nm);
		list.add(DtlOperR.$ext_oper_act_no);
		list.add(DtlOperR.$if_auto_reg_flg);
		return list;
	}
	
	protected List<String> getInptInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlInptR.$inpt_act_no);
		list.add(DtlInptR.$can_ac_dt);
		list.add(DtlInptR.$can_ac_dt_for_input);
		list.add(DtlInptR.$ac_dt_after_srch);
		list.add(DtlInptR.$mes_flg);
		list.add(DtlInptR.$ext_sys_cd);
		list.add(DtlInptR.$ext_sys_nm);
		list.add(DtlInptR.$ext_inpt_act_no);
		list.add(DtlInptR.$if_auto_reg_flg);
		// 他勘定関連項目のクリアも行うが、クリア時のイベントを発生させたいため、本メソッドではなく行コピー後にクリアする
		return list;
	}
	
	protected List<String> getWkInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlWkR.$wk_act_no);
		list.add(DtlWkR.$mes_flg);
		list.add(DtlWkR.$ext_sys_cd);
		list.add(DtlWkR.$ext_sys_nm);
		list.add(DtlWkR.$ext_wk_act_no);
		return list;
	}
	
	protected List<String> getYieldInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlYieldR.$yield_act_no);
		list.add(DtlYieldR.$can_ac_dt);
		list.add(DtlYieldR.$can_ac_dt_for_input);
		list.add(DtlYieldR.$ac_dt_after_srch);
		list.add(DtlYieldR.$mes_flg);
		list.add(DtlYieldR.$ext_sys_cd);
		list.add(DtlYieldR.$ext_sys_nm);
		list.add(DtlYieldR.$ext_yield_act_no);
		list.add(DtlYieldR.$stk_lst_prnt_flg);
		return list;
	}
	
	protected List<String> getByProdInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlByProdR.$yield_act_no);
		list.add(DtlByProdR.$can_ac_dt);
		list.add(DtlByProdR.$can_ac_dt_for_input);
		list.add(DtlByProdR.$ac_dt_after_srch);
		list.add(DtlYieldR.$mes_flg);
		list.add(DtlYieldR.$ext_sys_cd);
		list.add(DtlYieldR.$ext_sys_nm);
		list.add(DtlYieldR.$ext_yield_act_no);
		list.add(DtlByProdR.$stk_lst_prnt_flg);
		return list;
	}
	
	//********************** ステータス設定 **************************
	public void setSRCH_INSStatus() {
		super.setSRCH_INSStatus();
		CndPanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}
	
	public void setINS_ACTStatus() {
		super.setINS_ACTStatus();
		HdrPanel.focusFirstComponent();
		selectAllTable();
		setHdrMode();
		setCmplDtMode();
		setBtnMode();
		setDivSeqMode();
	}
	
	public void setUPD_ACTStatus() {
		super.setUPD_ACTStatus();
		HdrPanel.focusFirstComponent();
		selectAllTable();
		setHdrMode();
		setCmplDtMode();
		setBtnMode();
		setCanAcDt();
		setDivSeqMode();
	}
	
	protected void setCanAcDt() {
		for (DtlYieldR r : getDtlYieldL()) {
			r.can_ac_dt(r.ac_dt());
		}
		for (DtlByProdR r : getDtlByProdL()) {
			r.can_ac_dt(r.ac_dt());
		}
		for (DtlInptR r : getDtlInptL()) {
			r.can_ac_dt(r.ac_dt());
		}		
	}
	
	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
		AprvPanel.focusFirstComponent();
		clearAprvRsn();
		selectAllTable();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setDEL_ACTStatus() {
		super.setDEL_ACTStatus();
		HdrPanel.focusFirstComponent();
		selectAllTable();
		setBtnMode();
		setCanAcDt();
		setDivSeqMode();
	}

	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		AprvPanel.focusFirstComponent();
		clearAprvRsn();
		selectAllTable();
		setBtnMode();
		setDivSeqMode();
	}

	/**
	 * 承認理由をクリアする
	 */
	protected void clearAprvRsn() {
		if (!isNull(getHdrR().aprv_rsn()) && isEditable(Hdr_aprv_rsn)) {
			getHdrR().aprv_rsn(null);
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
		selectAllTable();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}

	@Override
	public void setFIX_APRVStatus() {
		super.setFIX_APRVStatus();
		CndPanel.focusFirstComponent();
		setBtnMode();
		setDivSeqMode();
	}

	protected void selectAllTable() {
		if (getDtlOperL().size() > 0) {
			DtlOperTable.selectRowNoFocus(0);
		}
		selectTableExceptOper();
	}
	
	protected void selectTableExceptOper() {
		if (getDtlInptL().size() > 0) {
			DtlInptTable.selectRowNoFocus(0);
		}
		if (getDtlWkL().size() > 0) {
			DtlWkTable.selectRowNoFocus(0);
		}
		if (getDtlYieldL().size() > 0) {
			DtlYieldTable.selectRowNoFocus(0);
		}
		if (getDtlByProdL().size() > 0) {
			DtlByProdTable.selectRowNoFocus(0);
		}
		if (getDtlArrActL().size() > 0) {
			DtlArrActTable.selectRowNoFocus(0);
		}
	}
	
	public void setINSStatus() {
		super.setINSStatus();
		if (isNull(getHdrR().mfg_inst_no())) {
			setSRCH_INSStatus();
		}
		else {
			setINS_ACTStatus();
		}
	}
	
	public void setUPDStatus() {
		super.setUPDStatus();
		String aprvSts = getHdrR().mfg_aprv_sts_typ();
		if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(aprvSts)) {
			setREFStatus();
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				setUPD_ACTStatus();
			}
			else if (Cnd_ope_APRV.isSelected()) {
				if (MSC_MFG_APRV_STS_TYP.isACT_OPN(getHdrR().mfg_aprv_sts_typ())) {
					setUPD_APRVStatus();
				}
				else {
					setREFStatus();
				}
			}
		}
	}
	
	public void setDELStatus() {
		super.setUPDStatus();
		if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(getHdrR().mfg_aprv_sts_typ())) {
			setDEL_APRVStatus();
		}
		else {
			setDEL_ACTStatus();
		}
	}
	
	protected void setFixStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setFIX_IStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setFIX_UStatus();
		}
		else if (Cnd_ope_APRV.isSelected()) {
			setFIX_APRVStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setFIX_DStatus();
		}
	}
	//********************** 動的な入力制御 **************************
	@Override
	public void doDtlOper_NC(MCEventInfo info) {
		super.doDtlOper_NC(info);
		setOperBtnMode();
		// 行追加ボタンの押下制御が必要なため、副産品・投入・工数のモード設定も行う
		setByProdBtnMode();
		setInptBtnMode();
		setWkBtnMode();
		
		if (getOperBtnR().disp_select_oper_only()) {
			doSelectOperFilter();
		}
	}
	
	@Override
	public void doDtlYield_NC(MCEventInfo info) {
		super.doDtlYield_NC(info);
		setYieldBtnMode();
	}
	
	@Override
	public void doDtlByProd_NC(MCEventInfo info) {
		super.doDtlByProd_NC(info);
		setByProdBtnMode();
	}
	
	@Override
	public void doDtlInpt_NC(MCEventInfo info) {
		super.doDtlInpt_NC(info);
		setInptBtnMode();
	}
	
	@Override
	public void doDtlWk_NC(MCEventInfo info) {
		super.doDtlWk_NC(info);
		setWkBtnMode();
	}

	@Override
	public void doCnd_srch_tgt_typ_nm_LC(MCEventInfo info) {
		super.doCnd_srch_tgt_typ_nm_LC(info);
		setDivSeqMode();
		if (!isEditable(Cnd_div_seq)) {
			setValueEx(Cnd_div_seq, null);
		}
	}
	
	protected void setDivSeqMode() {
		if (MSC_PROD_SRCH_TGT_TYP.isMFG_INST_NO(getCndR().srch_tgt_typ())) {
			setDefaultMode(Cnd_div_seq);
		}
		else {
			Cnd_div_seq.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * ヘッダ項目の入力制御
	 */
	protected void setHdrMode() {
		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			Hdr_base_unit_st_act_qty.setMode(MCMode.READ_ONLY);
			Hdr_rem_abort_flg.setMode(MCMode.READ_ONLY);
			if (getHdrR().arr_purc_auto_reg_flg()) {
				Hdr_mfg_sts_typ.setMode(MCMode.READ_ONLY);
				Hdr_st_act_dt.setMode(MCMode.READ_ONLY);
				Hdr_st_act_hm.setMode(MCMode.READ_ONLY);
				Hdr_st_ac_dt.setMode(MCMode.READ_ONLY);
				Hdr_end_act_dt.setMode(MCMode.READ_ONLY);
				Hdr_end_act_hm.setMode(MCMode.READ_ONLY);
				Hdr_end_ac_dt.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	@Override
	public void doHdr_mfg_sts_typ_LC(MCEventInfo info) {
		super.doHdr_mfg_sts_typ_LC(info);
		setCmplDtMode();
		clearCmplDt();
	}
	
	protected void setCmplDtMode() {
		if (!getHdrR().arr_purc_auto_reg_flg()
				&& MSC_MFG_STS_TYP.isCMPL(getHdrR().mfg_sts_typ())) {
			setDefaultMode(Hdr_end_act_dt);
			setDefaultMode(Hdr_end_ac_dt);
			if (isNull(getHdrR().end_act_dt())) {
				setValueEx(Hdr_end_act_dt, getToday());
			}
		}
		else {
			Hdr_end_act_dt.setMode(MCMode.READ_ONLY);
			Hdr_end_ac_dt.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void clearCmplDt() {
		if (!MSC_MFG_STS_TYP.isCMPL(getHdrR().mfg_sts_typ())) {
			setValueEx(Hdr_end_act_dt, null);
			setValueEx(Hdr_end_ac_dt, null);
		}
	}
	
	//********************** cellConfig **************************
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlOperTable.setCellConfig(crtDtlOperCellConfig());
		DtlInptTable.setCellConfig(crtDtlInptCellConfig());
		DtlWkTable.setCellConfig(crtDtlWkCellConfig());
		DtlYieldTable.setCellConfig(crtDtlYieldCellConfig());
		DtlByProdTable.setCellConfig(crtDtlByProdCellConfig());
	}

	protected DtlOperCellConfig crtDtlOperCellConfig() {
		return new DtlOperCellConfig();
	}
	
	protected DtlInptCellConfig crtDtlInptCellConfig() {
		return new DtlInptCellConfig();
	}

	protected DtlWkCellConfig crtDtlWkCellConfig() {
		return new DtlWkCellConfig();
	}
	
	protected DtlYieldCellConfig crtDtlYieldCellConfig() {
		return new DtlYieldCellConfig();
	}

	protected DtlByProdCellConfig crtDtlByProdCellConfig() {
		return new DtlByProdCellConfig();
	}

	protected class DtlOperCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			DtlOperR r = getDtlOperL().get(index);
			if (!r.check()) {
				if (columnDtlOper_check != column) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (getHdrR().arr_purc_auto_reg_flg()) {
				// 入荷・仕入時に自動作成した行は、選択チェック、再計算対象ＦＬＧ、ＢＦ許可ＦＬＧ、ＦＧ未反映ＦＬＧ以外入力不可
				if (column != columnDtlOper_check
						&& column != columnDtlOper_oper_re_calc_flg
						&& column != columnDtlOper_bkf_upd_flg
						&& column != columnDtlOper_bkf_not_ref_flg) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtlOper_not_cmpl_flg) {
				if (!isEditable(columnDtlOper_end_act_dt, index) || isNull(r.end_act_dt())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected class DtlYieldCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlYieldR r = getDtlYieldL().get(index);
			if (r.oper_del_flg()) {
				return MCMode.READ_ONLY;
			}
			if (!r.check()) {
				if (columnDtlYield_check != column) {
					return MCMode.READ_ONLY;
				}
			}

			if (getHdrR().arr_purc_auto_reg_flg()) {
				// 入荷・仕入時に自動作成した行は全カラム入力不可
				return MCMode.READ_ONLY;
			}
			
			if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
				if (columnDtlYield_lot_no == column || columnDtlYield_sublot_no == column
						|| column == columnDtlYield_same_lot_flg
						|| column == columnDtlYield_strg_loc_cd
						|| column == columnDtlYield_strg_str_ln_cd
						|| column == columnDtlYield_strg_str_ln_cd_none_flg
						|| column == columnDtlYield_yield_rate
						|| column == columnDtlYield_gd_cd) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (columnDtlYield_yield_rsn_cd == column) {
				if (MAC_YIELD_TYP.isDFCT(r.yield_typ())) {
					return MCMode.REQUIRED;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnDtlYield_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}

	protected class DtlByProdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlByProdR r = getDtlByProdL().get(index);
			if (r.oper_del_flg()) {
				return MCMode.READ_ONLY;
			}
			if (!r.check()) {
				if (columnDtlByProd_check != column) {
					return MCMode.READ_ONLY;
				}
			}
			if (!isNull(r.yield_schd_no())) {
				if (DtlByProd_itm_p_PPanel.isItm(column)) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}

		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnDtlByProd_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}
	protected class DtlInptCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			DtlInptR r = getDtlInptL().get(index);
			if (r.oper_del_flg()) {
				return MCMode.READ_ONLY;
			}
			if (!r.check()) {
				if (columnDtlInpt_check != column) {
					return MCMode.READ_ONLY;
				}
			}
			if (r.abort_flg() && nvl(r.base_unit_inpt_qty(), MCNumber.ZERO).isZero()
					&& nvl(r.base_unit_loss_qty(), MCNumber.ZERO).isZero()
					&& nvl(r.base_unit_fxd_loss_qty(), MCNumber.ZERO).isZero()) {
				if (column == columnDtlInpt_lot_no || column == columnDtlInpt_sublot_no
						|| column == columnDtlInpt_stk_id_typ
						|| column == columnDtlInpt_stk_arrv_bp_cd
						|| column == columnDtlInpt_stk_bp_cd
						|| column == columnDtlInpt_gd_cd
						|| column == columnDtlInpt_acxfr_act_qty) {
					return MCMode.READ_ONLY;
				}
			}
			if (!isNull(r.inpt_schd_no()) || !isNull(r.inpt_act_no())) {
				if (DtlInpt_itm_p_PPanel.isItm(column)) {
					return MCMode.READ_ONLY;
				}
			}
			if (isNull(r.acxfr_act_qty())) {
				if (column == columnDtlInpt_acxfr_act_rsn_cd
						|| column == columnDtlInpt_acxfr_act_bd_dpt_cd) {
					return MCMode.READ_ONLY;
				}
			}
			if (!r.loss_qty_enable_flg()) {
				if (column == columnDtlInpt_base_unit_loss_qty
						|| column == columnDtlInpt_cont_loss_qty) {
					return MCMode.READ_ONLY;
				}
			}
			if (!r.fxd_loss_qty_enable_flg()) {
				if (column == columnDtlInpt_base_unit_fxd_loss_qty
						|| column == columnDtlInpt_cont_fxd_loss_qty) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtlInpt_stk_id_typ) {
				if (!isNull(r.inpt_act_no())) {
					// 新規登録時はサーバで自動補完するが更新時は補完する必要がないためREQUIREDとする
					return MCMode.REQUIRED;
				}
			}
			if (column == columnDtlInpt_stk_bp_cd) {
				if (isStkBpCdReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
				else if (!isNull(r.inpt_act_no())) {
					// 新規登録時はサーバで自動補完するが更新時は補完する必要がないためREQUIREDとする
					return MCMode.REQUIRED;
				}
			}
			if (column == columnDtlInpt_stk_arrv_bp_cd) {
				if (isStkArrvBpCdReadOnly(r)) {
					return MCMode.READ_ONLY;
				}
				else if (!isNull(r.inpt_act_no())) {
					// 新規登録時はサーバで自動補完するが更新時は補完する必要がないためREQUIREDとする
					return MCMode.REQUIRED;
				}
			}
			
			// 指図時に自給となっていた場合
			if (MAC_PROV_TYP.isSS(r.prov_typ())) {
				if (isNotStkOutReadOnlyColumn(column) || column == columnDtlInpt_stk_id_typ) {
					if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
				// 行追加で自給とすることも想定し、在庫識別区分でも判定
				if (isNotStkOutReadOnlyColumn(column)) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				if (isNotStkOutReadOnlyColumn(column) || column == columnDtlInpt_stk_id_typ) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
					&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				if (column == columnDtlInpt_lot_prop_tgt_flg) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtlInpt_abort_flg) {
				if (isNull(r.inpt_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
		
		protected boolean isNotStkOutReadOnlyColumn(MCColumnConfig column) {
			return getNotStkOutReadOnlyColumn().contains(column);
		}
		
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnDtlInpt_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}

	protected boolean isNotStkOut(DtlInptR r) {
		if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
			return true;
		}
		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			return true;
		}
		return false;
	}

	protected Set<MCColumnConfig> getNotStkOutReadOnlyColumn() {
		Set<MCColumnConfig> ret = new HashSet<MCColumnConfig>();
		ret.add(columnDtlInpt_lot_no);
		ret.add(columnDtlInpt_sublot_no);
		ret.add(columnDtlInpt_stk_bp_cd);
		ret.add(columnDtlInpt_stk_arrv_bp_cd);
		ret.add(columnDtlInpt_gd_cd);
		ret.add(columnDtlInpt_acxfr_act_qty);
		ret.add(columnDtlInpt_lot_prop_tgt_flg);
		return ret;
	}

	protected class DtlWkCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlWkR r = getDtlWkL().get(index);
			if (r.oper_del_flg()) {
				return MCMode.READ_ONLY;
			}
			if (!r.check()) {
				if (column != columnDtlWk_check) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtlWk_abort_flg) {
				if (isNull(r.wk_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtlWk_act_wk_cost) {
				if (isActWkCostRO(r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected boolean isActWkCostRO(DtlWkR r) {
		if (r.wk_cost_calc_upd_flg() && isNotZeroTm(r.end_tm())) {
			// サーバで自動計算するためread_only
			return true;
		}
		return false;
	}
	
	protected boolean isNotZeroTm(MCDate d) {
		if (isNull(d)) {
			return false;
		}
		return true;
	}

	//********************** 画面イベント **************************
	// 種別変更
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);	
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
			setValueEx(Cnd_srch_tgt_no, getHdrR().mfg_inst_no());
			setValueEx(Cnd_div_seq, getHdrR().div_seq());
		}
	}		
	
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (isINSOpe(afOpe)) {
			// 検索条件区分の設定
			setSrchTgtTyp();
		}
		else {
			if (isNull(getCndR().srch_tgt_typ())) {
				setSrchTgtTyp();
			}
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		setListListener(DtlWkTable, getAcDtRowListener());
		DtlWkTable.addListListener(getAcDtListListener());
		
		columnDtlOper_end_act_dt.addLCListener(this);
		Hdr_base_unit_st_act_qty.addLCListener(this);
		Hdr_base_unit_st_act_qty.addVCListener(this);
		columnDtlOper_oper_unit_act_qty.addLCListener(this);
		
		columnDtlYield_trd_unit_yield_act_qty.addLCListener(this);
		columnDtlByProd_trd_unit_yield_act_qty.addLCListener(this);
		columnDtlInpt_base_unit_inpt_qty.addLCListener(this);
		columnDtlWk_act_wk_cost.addLCListener(this);
		columnDtlWk_end_tm.addLCListener(this);
		
		columnDtlInpt_acxfr_act_qty.addLCListener(this);
		columnDtlInpt_base_unit_loss_qty.addLCListener(this);
		columnDtlInpt_base_unit_fxd_loss_qty.addLCListener(this);
		columnDtlInpt_lot_no.addLCListener(this);
		DtlInpt_itm_p_PPanel.addItmLCListner(this);
		
		columnDtlInpt_cont_inpt_qty.addLCListener(this);
		columnDtlInpt_cont_loss_qty.addLCListener(this);
		columnDtlInpt_cont_fxd_loss_qty.addLCListener(this);
		columnDtlInpt_act_cont_fctr.addLCListener(this);
		DtlByProd_itm_p_PPanel.addItmLCListner(this);
	}
	
	
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == Hdr_base_unit_st_act_qty) {
			return doHdr_base_unit_st_act_qty_VC(info);
		}
		return true;
	}

	// 着手数量
	protected boolean doHdr_base_unit_st_act_qty_VC(MCEventInfo info) {
		if (isNull(info.getNewValue()) || !((MCNumber)info.getNewValue()).isPositive()) {
			return false;
		}
		List<MCContainer> dtlCont = new ArrayList<MCContainer>();
		dtlCont.add(getDtlOperL());
		dtlCont.add(getDtlInptL());
		dtlCont.add(getDtlWkL());
		dtlCont.add(getDtlYieldL());
		dtlCont.add(getDtlByProdL());
		if (!isStatusNone(dtlCont) && !confirmRegDataClear()) {
			return false;
		}
		return super.doHdr_mfg_mtd_typ_VC(info);
	}
		
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_base_unit_st_act_qty) {
			doHdr_base_unit_st_act_qty_LC(info);
		}
		else if (lc == columnDtlOper_end_act_dt) {
			doDtlOper_end_act_dt_LC(info);
		}
		else if (lc == columnDtlOper_oper_unit_act_qty) {
			doDtlOper_oper_unit_act_qty(info);
		}
		else if (lc == columnDtlInpt_acxfr_act_qty) {
			doDtlInpt_acxfr_act_qty_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_inpt_qty) {
			doDtlInpt_base_unit_inpt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_loss_qty) {
			doDtlInpt_base_unit_loss_qty_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_fxd_loss_qty) {
			doDtlInpt_base_unit_fxd_loss_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_inpt_qty) {
			doDtlInpt_cont_inpt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_loss_qty) {
			doDtlInpt_cont_loss_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_fxd_loss_qty) {
			doDtlInpt_cont_fxd_loss_qty_LC(info);
		}
		else if (lc == columnDtlInpt_act_cont_fctr) {
			doDtlInpt_act_cont_fctr_LC(info);
		}
		else if (lc == columnDtlInpt_lot_no) {
			doDtlInpt_lot_no_LC(info);
		}
		else if (DtlInpt_itm_p_PPanel.isItm(lc)) {
			doDtlInpt_itm_LC(info);
		}
		else if (lc == columnDtlWk_end_tm) {
			doDtlWk_end_tm_LC(info);
		}
		else if (DtlByProd_itm_p_PPanel.isItm(lc)) {
			doDtlByProd_itm_LC(info);
		}
		else if (lc == columnDtlYield_trd_unit_yield_act_qty) {
			doDtlYield_trd_unit_yield_act_qty_LC(info);
		}
	}
	
	// 着手数量
	protected void doHdr_base_unit_st_act_qty_LC(MCEventInfo info) {
		if (!isNull(getHdrR().base_unit_st_act_qty())) {
			callMS_MSBCL1100_Sprt04();
		}
	}

	// -----------------------選択チェックのイベント------------------------------
	// 工程
	@Override
	public void doDtlOper_check_NC(MCEventInfo info) {
		super.doDtlOper_check_NC(info);
		DtlOperR r = getDtlOperL().get(info.getEventIndex());
		
		if (r.check()) {
			// 数量の設定
			setDtlOperQty(r);
			// 日付の設定
			if (getOperBtnR().set_st_act_dt() && isNull(r.st_act_dt())
					&& isEditable(columnDtlOper_st_act_dt, r.getGUIIndex())) {
				setValueEx(columnDtlOper_st_act_dt, r.getGUIIndex(), getToday());
			}
			if (getOperBtnR().set_end_act_dt() && isNull(r.end_act_dt())
					&& isEditable(columnDtlOper_end_act_dt, r.getGUIIndex())) {
				setValueEx(columnDtlOper_end_act_dt, r.getGUIIndex(), getToday());
			}
		}
		setValueEx(columnDtlOper_oper_re_calc_flg, r.getGUIIndex(), r.check());
	}
	
	protected void setDtlOperChkTrue(MCNumber operPegNo) {
		DtlOperR r = getDtlOperL().getFirst(DtlOperR.$peg_no, operPegNo);
		if (!r.check()) {
			setValueEx(columnDtlOper_check, r.getGUIIndex(), true);
		}
	}
	
	protected void setDtlOperQty(DtlOperR r) {
		if (isNull(r.oper_unit_act_qty())) {
			setValueEx(columnDtlOper_oper_unit_act_qty, r.getGUIIndex(),
					r.oper_unit_schd_qty());
		}
	}
	
	@Override
	public void doDtlOper_oper_re_calc_flg_NC(MCEventInfo info) {
		super.doDtlOper_oper_re_calc_flg_NC(info);
		DtlOperR r = getDtlOperL().get(info.getEventIndex());
		for (DtlOperR sameInstR : getDtlOperL().subList(DtlOperR.$oper_inst_no, r.oper_inst_no())) {
			if (r != sameInstR) {
				sameInstR.oper_re_calc_flg(r.oper_re_calc_flg());
			}
		}
	}
	protected void  doDtlOper_end_act_dt_LC(MCEventInfo info) {
		DtlOperR r = getDtlOperL().get(info.getEventIndex());
		if (isNull(r.end_act_dt())) {
			r.not_cmpl_flg(false);
		}
		else {
			setRsltNotCmplFlg(r);
		}
	}
	protected void doDtlOper_oper_unit_act_qty(MCEventInfo info) {
		DtlOperR r = getDtlOperL().get(info.getEventIndex());
		setRsltNotCmplFlg(r);
	}

	/**
	 * 未完了チェックボックスの値をセット
	 * @param r 選択中の工程行
	 */
	protected void setRsltNotCmplFlg(DtlOperR r) {
		if (!isNull(r) && isEditable(columnDtlOper_not_cmpl_flg, r.getGUIIndex())) {
			if (r.oper_unit_rem_qty().gt(r.oper_unit_act_qty())) {
				r.not_cmpl_flg(true);
			} 
			else {
				r.not_cmpl_flg(false);
			}
		}
	}

	// 出来高
	@Override
	public void doDtlYield_check_NC(MCEventInfo info) {
		super.doDtlYield_check_NC(info);
		DtlYieldR r = getDtlYieldL().get(info.getEventIndex());
		if (r.check()) {
			// 工程チェック
			setDtlOperChkTrue(r.oper_peg_no());
			// 数量の設定
			setDtlYieldQty(r);
			// 日付の設定
			setDtlYieldDt(r);
		}
	}
	
	/**
	 * 出来高数量のＬＣイベント処理
	 * @param info
	 */
	protected void doDtlYield_trd_unit_yield_act_qty_LC(MCEventInfo info) {
		DtlYieldR yieldR = DtlYieldTable.getSelectedMCRow();
		setOperUnitQty(yieldR);
	}
	
	/**
	 * 自動生成された工程の工程単位実績数量に出来高数量の換算値を設定する。
	 * @param yieldR
	 */
	protected void setOperUnitQty(DtlYieldR yieldR) {
		if (isNull(yieldR)) {
			return;
		}
		if (Cnd_ope_UPD.isSelected()) {
			DtlOperR operR = getDtlOperL().getFirst(DtlOperR.$peg_no, yieldR.oper_peg_no());
			if (isNull(operR)) {
				return;
			}
			if (operR.isStatusCreate() || operR.isStatusDelete()) {
				return;
			}
			if (!operR.if_auto_reg_flg()) {
				return;
			}
			MCNumber sumbaseQty = getDtlYieldL().subList(r -> !r.isStatusDelete() && r.oper_peg_no().eq(operR.peg_no())).sum(DtlYieldR.$base_unit_yield_act_qty);
			if(isNull(sumbaseQty)) {
				sumbaseQty = new MCNumber(0);
			}
			setValueEx(columnDtlOper_oper_unit_act_qty, operR.getGUIIndex(),
					convQtyBaseToOper(sumbaseQty, operR.oper_conv_qty(), operR.oper_std_qty(), 
							operR.oper_unit_dec_place(), operR.oper_unit_conv_rnd_typ()));
		}
	}

	protected void setDtlYieldQty(DtlYieldR r) {
		if (isNull(r.trd_unit_yield_act_qty())) {
			setValueEx(columnDtlYield_trd_unit_yield_act_qty, r.getGUIIndex(),
					rvrsBaseUnitConv(r.base_unit_yield_schd_qty(), r.conv_base_qty(), r.conv_qty(),
							r.trd_unit_dec_place(), r.trd_unit_conv_rnd_typ()));
		}
	}

	protected void setDtlYieldDt(DtlYieldR r) {
		if (isNull(r.act_dt())) {
			DtlOperR operR = getDtlOperL().getFirst(DtlOperR.$peg_no, r.oper_peg_no());
			setValueEx(columnDtlYield_act_dt, r.getGUIIndex(), operR.end_act_dt());
			setValueEx(columnDtlYield_act_hm, r.getGUIIndex(), operR.end_act_hm());
		}
	}
	
	@Override
	public void doDtlYield_same_lot_flg_NC(MCEventInfo info) {
		super.doDtlYield_same_lot_flg_NC(info);
		DtlYieldR r = getDtlYieldL().get(info.getEventIndex());
		setYieldOrgLotNo(r);
	}
	
	/**
	 * コピー元ロットＮＯからロットＮＯを設定
	 * @param r
	 */
	protected void setYieldOrgLotNo(DtlYieldR r) {
		// 同一ロットをオンにした場合、コピー元ロットＮＯを設定
		if (r.same_lot_flg()) {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(r.org_lot_no());
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(r.org_sublot_no());
			}
		}
		// コピー行に対して同一ロットをオフにした場合、ロットＮＯをクリア
		else {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(null);
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(null);
			}
		}
	}

	// 副産品
	@Override
	public void doDtlByProd_check_NC(MCEventInfo info) {
		super.doDtlByProd_check_NC(info);
		DtlByProdR r = getDtlByProdL().get(info.getEventIndex());
		if (r.check()) {
			// 工程チェック
			setDtlOperChkTrue(r.oper_peg_no());
			// 数量の設定
			setDtlByProdQty(r);
			// 日付の設定
			setDtlByProdDt(r);
		}
	}	
	
	protected void setDtlByProdQty(DtlByProdR r) {
		if (isNull(r.trd_unit_yield_act_qty())) {
			setValueEx(columnDtlByProd_trd_unit_yield_act_qty, r.getGUIIndex(),
					rvrsBaseUnitConv(r.base_unit_yield_schd_qty(), r.conv_base_qty(), r.conv_qty(),
							r.trd_unit_dec_place(), r.trd_unit_conv_rnd_typ()));
		}
	}

	protected void setDtlByProdDt(DtlByProdR r) {
		if (isNull(r.act_dt())) {
			DtlOperR operR = getDtlOperL().getFirst(DtlOperR.$peg_no, r.oper_peg_no());
			setValueEx(columnDtlByProd_act_dt, r.getGUIIndex(), operR.end_act_dt());
			setValueEx(columnDtlByProd_act_hm, r.getGUIIndex(), operR.end_act_hm());
		}
	}

	@Override
	public void doDtlByProd_same_lot_flg_NC(MCEventInfo info) {
		super.doDtlByProd_same_lot_flg_NC(info);
		DtlByProdR r = getDtlByProdL().get(info.getEventIndex());
		setByProdOrgLotNo(r);
	}

	/**
	 * コピー元ロットＮＯからロットＮＯを設定
	 * @param r
	 */
	protected void setByProdOrgLotNo(DtlByProdR r) {
		// 同一ロットをオンにした場合、コピー元ロットＮＯを設定
		if (r.same_lot_flg()) {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(r.org_lot_no());
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(r.org_sublot_no());
			}
		}
		// コピー行に対して同一ロットをオフにした場合、ロットＮＯをクリア
		else {
			if (!isNull(r.org_lot_no())) {
				r.lot_no(null);
			}
			if (!isNull(r.org_sublot_no())) {
				r.sublot_no(null);
			}
		}
	}

	// 投入
	
	// 投入場所
	@Override
	public void doDtlInpt_inpt_loc_cd_LC(MCEventInfo info) {
		super.doDtlInpt_inpt_loc_cd_LC(info);
		int idx = info.getEventIndex();
		DtlInptR inptR = getDtlInptL().get(idx);
		if (isStkArrvBpCdReadOnly(inptR)) {
			// 在庫着荷先をクリア
			setValueEx(columnDtlInpt_stk_bp_cd, idx, null);
		}
	}
	
	// 他勘定振替関連
	protected void doDtlInpt_acxfr_act_qty_LC(MCEventInfo info) {
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (isNull(r.acxfr_act_qty())) {
			setValueEx(columnDtlInpt_acxfr_act_rsn_cd, r.getGUIIndex(), null);
			setValueEx(columnDtlInpt_acxfr_act_bd_dpt_cd, r.getGUIIndex(), null);
		}
	}
	
	// 基準単位⇔有効成分関連
	// 基準単位数量と有効成分は相互にイベントが発動するため、イベントが無限ループになる可能性がある。当フラグで発動を制御する
	protected boolean _isDuringQtyChangeEvent = false;
	
	// ロス関連
	// 基準単位ロス数量
	protected void doDtlInpt_base_unit_loss_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		if (inptR.loss_qty_enable_flg()) {
			// ロス内訳への反映
			reflectNotFixedLossItems(inptR);
		}
		
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_loss_qty, inptR.getGUIIndex(),
						convBaseToCont(inptR.base_unit_loss_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	/**
	 * 固定ではないロス実績数をロス内訳に反映させる
	 * @param inptR
	 */
	protected void reflectNotFixedLossItems(DtlInptR inptR) {
		// 固定ではないロス数量をロス内訳に反映する場合、対象が複数存在する可能性がある。
		// そのため、数量は初期表示フラグがオンのロスに対してのみ実施し、オフのロスの数量はクリアする。
		// また、ロス内訳入力画面で入力し、反映すると、当メソッドが実行されてしまう。
		// そうすると複数のロス内訳を入力してもここで初期表示オンのレコードにまとめられてしまうため、
		// ロス内訳の数量の合計と入力されたロス数量が異なる場合のみ反映を行う。

		// 固定ではないロス内訳のみ抽出
		MCList<LossAct_RsltR> notFixedLossL = getLossSubL(inptR.peg_no())
				.subList(LossAct_RsltR.$fxd_loss_flg, false);

		if (notFixedLossL.isEmpty()) {
			return;
		}
		
		MCNumber sumQty = notFixedLossL.sum(LossAct_RsltR.$loss_qty);
		if (isSame(sumQty, inptR.base_unit_loss_qty())) {
			return;
		}
		
		for (LossAct_RsltR lossR : notFixedLossL) {
			if (lossR.def_disp_flg()) {
				lossR.loss_qty(inptR.base_unit_loss_qty());
			}
			else {
				lossR.loss_qty(null);
			}
		}
	}
	
	// 基準単位固定ロス数量
	protected void doDtlInpt_base_unit_fxd_loss_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		if (inptR.fxd_loss_qty_enable_flg()) {
			LossAct_RsltR lossR = getLossSubL(inptR.peg_no())
					.getFirst(LossAct_RsltR.$fxd_loss_flg, true);
			if (!isNull(lossR)) {
				lossR.loss_qty(inptR.base_unit_fxd_loss_qty());
			}
		}
		
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_fxd_loss_qty, inptR.getGUIIndex(),
						convBaseToCont(inptR.base_unit_fxd_loss_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	protected void doDtlInpt_itm_LC(MCEventInfo info) {
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (isNull(r.inpt_schd_no()) && isNull(r.inpt_act_no())) {
			setUnschdInptLossRsnList(r);
		}
		setDtlDefaultValue(info);
		setMixFlg(r);
		if (!isNull(r.itm_cd())
				&& !isNull(r.itm_sub1())
				&& !isNull(r.itm_sub2())
				&& !isNull(r.itm_sub3())
				) {
			// 工程、工程連番、品目CDを元に、同一工程、同一工程連番、同一品目の他投入Rからロット・サブロット混在FLGを設定する
			for (DtlInptR inptR : getDtlInptL()) {
				if (!isSame(r.peg_no(), inptR.peg_no())
						&& isSame(r.oper_cd(), inptR.oper_cd())
						&& isSame(r.oper_seq(), inptR.oper_seq())
						&& isSame(r.itm_cd(), inptR.itm_cd())
						&& isSame(r.itm_sub1(), inptR.itm_sub1())
						&& isSame(r.itm_sub2(), inptR.itm_sub2())
						&& isSame(r.itm_sub3(), inptR.itm_sub3())
						) {
					r.lot_mix_flg(inptR.lot_mix_flg());
					r.sublot_mix_flg(inptR.sublot_mix_flg());
					break;
				}
			}
		}
	}
	
	protected void setDtlDefaultValue(MCEventInfo info) {
		
		int index = info.getEventIndex();
		setDefaultGdCd(index);
	}

	protected void doDtlByProd_itm_LC(MCEventInfo info) {
		DtlByProdR r = getDtlByProdL().get(info.getEventIndex());
		setDefStrLnCd(r);
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlByProdR dtlByProdR) {
		if (isNull(dtlByProdR.strg_loc_cd()) || !dtlByProdR.strg_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlByProdR.itm_cd(), 
				dtlByProdR.itm_sub1(), 
				dtlByProdR.itm_sub2(), 
				dtlByProdR.itm_sub3(), 
				dtlByProdR.strg_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtlByProd_strg_str_ln_cd_none_flg, dtlByProdR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtlByProd_strg_str_ln_cd, dtlByProdR.getGUIIndex(), StrLnCd);
		}
	}

	/**
	 * 格付の初期値を設定する。
	 * @param index インデックス
	 */
	protected void setDefaultGdCd(int index) {
		
		DtlInptR r = getDtlInptL().get(index);
		
		if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
			columnDtlInpt_gd_cd.setValue(index, getDefaultFeedStkGd().gd_cd());
		}
	}
	
	/**
	 * ロット混在可・サブロット混在可フラグ設定
	 * @param r
	 */
	protected void setMixFlg(DtlInptR r) {
		// 新規行かつ投入予定NOがNULLの場合
		if (r.isStatusCreate() && isNull(r.inpt_schd_no())) {
			// ロット管理対象の場合
			if (!isNull(r.lot_mng_typ()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				r.lot_mix_flg(true);
			}
			else {
				r.lot_mix_flg(false);
			}
			// サブロット管理対象の場合
			if (!isNull(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				r.sublot_mix_flg(true);
			}
			else {
				r.sublot_mix_flg(false);
			}
		}
	}
	
	protected void setUnschdInptLossRsnList(DtlInptR r) {
		MCList<MCRow> list = getLossRsnList(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
				r.itm_sub3(), this);
		if (list.isEmpty()) {
			MCList<LossAct_RsltR> rmvL = _lossMap.get(r.peg_no());
			if (!isNull(rmvL)) {
				getDtlLossL().removeAll(rmvL);
				rmvL.clear();
			}
		}
		else {
			MCList<LossAct_RsltR> addL = MCList.create(LossAct_RsltR.class);
			for (MCRow row : list) {
				LossAct_RsltR addR = LossAct_RsltR.create();
				addR.inpt_peg_no(r.peg_no());
				addR.loss_rsn_cd(row.getString("loss_rsn_cd"));
				addR.loss_rsn_nm(row.getString("loss_rsn_nm"));
				addR.def_disp_flg(row.getBoolean("def_disp_flg"));
				addR.fxd_loss_flg(row.getBoolean("fxd_loss_flg"));
				addL.add(addR);
			}
			r.loss_qty_enable_flg(isLossQtyEnable(addL));
			r.fxd_loss_qty_enable_flg(isFxdLossQtyEnable(addL));
			
			if (!_lossMap.containsKey(r.peg_no())) {
				_lossMap.put(r.peg_no(), addL);
				getDtlLossL().addAll(addL);
			}
			setInptBtnMode();
		}
	}
	
	protected void doDtlInpt_lot_no_LC(MCEventInfo info) {
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		// ロットＮＯがクリアされた場合はロット提案対象をオンにする
		if (isNull(r.lot_no())) {
			r.lot_prop_tgt_flg(true);
		}
	}
	
	protected void doDtlInpt_base_unit_inpt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_inpt_qty, inptR.getGUIIndex(), convBaseToCont(inptR.base_unit_inpt_qty(), inptR));
				setValueEx(columnDtlInpt_bkf_upd_flg, inptR.getGUIIndex(), false);
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 有効成分（投入数量）
	protected void doDtlInpt_cont_inpt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		doDtlInpt_cont_inpt_qty_sub(inptR);
	}
	
	protected void doDtlInpt_cont_inpt_qty_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_inpt_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_inpt_qty(), inptR));
				setValueEx(columnDtlInpt_bkf_upd_flg, inptR.getGUIIndex(), false);
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 有効成分（ロス数量）
	protected void doDtlInpt_cont_loss_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		if (inptR.loss_qty_enable_flg()) {
			// ロス内訳への反映
			reflectNotFixedContLossItems(inptR);
		}
		
		doDtlInpt_cont_inpt_loss_sub(inptR);
	}
	
	/**
	 * 固定ではない有効成分（ロス実績）をロス内訳に反映させる
	 * @param inptR
	 */
	protected void reflectNotFixedContLossItems(DtlInptR inptR) {
		// reflectNotFixedLossItemsメソッドのコメント参照

		// 固定ではないロス内訳のみ抽出
		MCList<LossAct_RsltR> notFixedLossL = getLossSubL(inptR.peg_no())
				.subList(LossAct_RsltR.$fxd_loss_flg, false);

		if (notFixedLossL.isEmpty()) {
			return;
		}
		
		MCNumber sumQty = notFixedLossL.sum(LossAct_RsltR.$cont_loss_qty);
		if (isSame(sumQty, inptR.cont_loss_qty())) {
			return;
		}
		
		for (LossAct_RsltR lossR : notFixedLossL) {
			if (lossR.def_disp_flg()) {
				lossR.cont_loss_qty(inptR.cont_loss_qty());
			}
			else {
				lossR.cont_loss_qty(null);
			}
		}
	}
	
	protected void doDtlInpt_cont_inpt_loss_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_loss_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_loss_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 有効成分（固定ロス数量）
	protected void doDtlInpt_cont_fxd_loss_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		if (inptR.fxd_loss_qty_enable_flg()) {
			LossAct_RsltR lossR = getLossSubL(inptR.peg_no())
					.getFirst(LossAct_RsltR.$fxd_loss_flg, true);
			if (!isNull(lossR)) {
				lossR.cont_loss_qty(inptR.cont_fxd_loss_qty());
			}
		}
		
		doDtlInpt_cont_inpt_fxd_loss_sub(inptR);
	}
	
	protected void doDtlInpt_cont_inpt_fxd_loss_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_fxd_loss_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_fxd_loss_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 実際有効成分係数の変更（ロットが変わった場合の考慮）
	protected void doDtlInpt_act_cont_fctr_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		doDtlInpt_cont_inpt_qty_sub(inptR);
		doDtlInpt_cont_inpt_loss_sub(inptR);
		doDtlInpt_cont_inpt_fxd_loss_sub(inptR);
	}
	
	protected MCNumber convContToBase(MCNumber contQty, DtlInptR inptR) {
		// 有効成分から基準単位への変換
		if (isNull(contQty)) {
			return null;
		}
		return convToBaseUnitFromContFctrUnit(contQty,
				nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
				inptR.base_unit_dec_place(), inptR.base_unit_conv_rnd_typ());
	}
	
	protected MCNumber convBaseToCont(MCNumber baseQty, DtlInptR inptR) {
		// 基準単位から有効成分への変換
		if (isNull(baseQty)) {
			return null;
		}
		return convToContFctrUnit(baseQty,
				nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
				inptR.cont_fctr_dec_place(), inptR.cont_fctr_rnd_typ());
	}
	
	@Override
	public void doInptBtn_abort_flg_NC(MCEventInfo info) {
		super.doInptBtn_abort_flg_NC(info);
		for (DtlInptR r : DtlInptTable.getViewRows()) {
			boolean b = getInptBtnR().abort_flg();
			if (b) {
				if (!MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
					setValueEx(columnDtlInpt_check, r.getGUIIndex(), true);
					setValueEx(columnDtlInpt_abort_flg, r.getGUIIndex(), true);
				}
			}
			else {
				setValueEx(columnDtlInpt_abort_flg, r.getGUIIndex(), false);
			}
		}
	}
	
	@Override
	public void doDtlInpt_abort_flg_NC(MCEventInfo info) {
		super.doDtlInpt_abort_flg_NC(info);
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (r.abort_flg()) {
			setValueEx(columnDtlInpt_bkf_upd_flg, r.getGUIIndex(), false);
		}
	}
	
	@Override
	public void doDtlInpt_check_NC(MCEventInfo info) {
		super.doDtlInpt_check_NC(info);
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (r.check()) {
			// 工程チェック
			setDtlOperChkTrue(r.oper_peg_no());
			// 数量の設定
			setDtlInptQty(r);
			// 日付の設定
			setDtlInptDt(r);
			if (!isNull(getInptBtnR().inpt_can_ac_dt())) {
				setInptCanAcDt(r);
			}
		}
		setInptBtnMode();
		setLotPropTgtFlg(r);
	}
	
	protected void setDtlInptQty(DtlInptR r) {
		if (r.cont_fctr_flg()) {
			// 有効成分対象の場合、有効成分を予定から設定
			if (isNull(r.cont_inpt_qty())) {
				setValueEx(columnDtlInpt_cont_inpt_qty, r.getGUIIndex(),
						r.cont_schd_inpt_qty());
			}
			if (isNull(r.cont_fxd_loss_qty())) {
				setValueEx(columnDtlInpt_cont_fxd_loss_qty, r.getGUIIndex(),
						r.cont_schd_fxd_rqmt_qty());
			}
		}
		else {
			// 有効成分対象外の場合、基準単位数量を予定から設定
			if (isNull(r.base_unit_inpt_qty())) {
				setValueEx(columnDtlInpt_base_unit_inpt_qty, r.getGUIIndex(),
						r.base_unit_schd_inpt_qty());
			}
			if (isNull(r.base_unit_fxd_loss_qty())) {
				setValueEx(columnDtlInpt_base_unit_fxd_loss_qty, r.getGUIIndex(),
						r.base_unit_schd_fxd_rqmt_qty());
			}
		}
	}
	
	protected void setDtlInptDt(DtlInptR r) {
		if (isNull(r.act_dt())) {
			DtlOperR operR = getDtlOperL().getFirst(DtlOperR.$peg_no, r.oper_peg_no());
			MCDate dt = operR.end_act_dt();
			MCDate hm = operR.end_act_hm();
			if (isNull(dt)) {
				dt = operR.st_act_dt();
				hm = operR.st_act_hm();
			}
			setValueEx(columnDtlInpt_act_dt, r.getGUIIndex(), dt);
			setValueEx(columnDtlInpt_act_hm, r.getGUIIndex(), hm);
		}
	}
	
	protected void setLotPropTgtFlg(DtlInptR r) {
		if (r.check()) {
			// 選択がオンかつロット提案対象の場合、ロット提案対象フラグをオンにする
			if (isLotPropTgt(r)) {
				setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), true);
			}
		}
		else {
			// 選択がオフかつロット提案対象がオンの場合、ロット提案対象をオフにする
			if (r.lot_prop_tgt_flg()) {
				setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), false);
			}
		}
	}
	
	protected boolean isLotPropTgt(DtlInptR r) {
		// 以下のいずれかに該当する場合はロット提案対象外とする
		// ・支給区分が自給の場合
		// ・在庫識別区分が自給の場合
		// ・ロット・サブロット管理区分がロット管理しない場合
		// ・在庫管理区分が非在庫品の場合
		// ・投入数＋ロス数＋固定ロス数が０の場合
		if (MAC_PROV_TYP.isSS(r.prov_typ()) || MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())
				|| (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()))
				|| !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
				|| sum(nvl(r.base_unit_inpt_qty(), 0), nvl(r.base_unit_loss_qty(), 0),
						nvl(r.base_unit_fxd_loss_qty(), 0)).isZero()) {
			return false;
		}
		// ・ロットＮＯが入力済の場合
		if (!isNull(r.lot_no())) {
			if (!isNull(r.alt_grp_cd()) && !r.alt_itm_fix_flg()) {
				// 指図時に代替品目指定していない場合
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	// 工数
	@Override
	public void doDtlWk_check_NC(MCEventInfo info) {
		super.doDtlWk_check_NC(info);
		DtlWkR r = getDtlWkL().get(info.getEventIndex());
		if (r.check()) {
			// 工程チェック
			setDtlOperChkTrue(r.oper_peg_no());
			// 工数の設定
			setDtlWkCost(r);
			// 日付の設定
			setDtlWkDt(r);
		}
	}

	@Override
	public void doDtlWk_wk_cost_calc_upd_flg_NC(MCEventInfo info) {
		super.doDtlWk_wk_cost_calc_upd_flg_NC(info);
		int index = info.getEventIndex();
		DtlWkR r = getDtlWkL().get(index);
		if (isActWkCostRO(r)) {
			r.act_wk_cost(null);
		}
	}

	protected void doDtlWk_end_tm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlWkR r = getDtlWkL().get(index);
		if (isActWkCostRO(r)) {
			r.act_wk_cost(null);
		}
	}

	protected void setDtlWkCost(DtlWkR r) {
		if (isNull(r.act_wk_cost())) {
			setValueEx(columnDtlWk_act_wk_cost, r.getGUIIndex(),
					r.schd_wk_cost());
		}
	}

	protected void setDtlWkDt(DtlWkR r) {
		if (isNull(r.ac_dt())) {
			DtlOperR operR = getDtlOperL().getFirst(DtlOperR.$peg_no, r.oper_peg_no());
			MCDate dt = operR.end_act_dt();
			if (isNull(dt)) {
				dt = operR.st_act_dt();
			}
			setValueEx(columnDtlWk_ac_dt, r.getGUIIndex(), dt);
		}
	}
	
	@Override
	public void doWkBtn_abort_flg_NC(MCEventInfo info) {
		super.doWkBtn_abort_flg_NC(info);
		for (DtlWkR r : DtlWkTable.getViewRows()) {
			boolean b = getWkBtnR().abort_flg();
			if (b) {
				if (!MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
					setValueEx(columnDtlWk_check, r.getGUIIndex(), true);
					setValueEx(columnDtlWk_abort_flg, r.getGUIIndex(), true);
				}
			}
			else {
				setValueEx(columnDtlWk_abort_flg, r.getGUIIndex(), false);
			}
		}
	}
	
	protected boolean isStkArrvBpCdReadOnly(DtlInptR inptR) {
		// ※値はサーバのチェック処理で補完するため画面では入力不可にするのみ
		if (isNull(inptR.inpt_loc_sppl_cd())) {
			// 自社場所の在庫に着荷先はつかないためNULL文字
			return true;
		}
		else if (MAC_STK_MNG_TYP.isNOT_MNG(inptR.stk_mng_typ())) {
			// 非在庫品の場合は支給された在庫と仕様をあわせ、取引先に場所の発注先を設定する
			return true;
		}
		else if (MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ())) {
			// 自社資産の場合は使用基準の有償支給の可能性があるため何もしない
			return false;
		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())) {
			// VMI在庫は自社場所にしか存在しないためNULL文字
			return true;
		}
		if (MSC_STK_ID_TYP.isNCV_RCV(inptR.stk_id_typ())) {
			// 無償受給品は、無償受給のみ可能なため支給時に着荷先が設定される。そのため着荷先に場所の発注先を設定する
			return true;
		}
		if (MSC_STK_ID_TYP.isONR_PROV(inptR.stk_id_typ())) {
			// 既に有償支給されている場合は、支給時に着荷先が設定される。そのため取引先に場所の発注先を設定する
			return true;
		}
		if (MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
			// 自給の場合は支給された在庫と仕様をあわせ、取引先に場所の発注先を設定する
			return true;
		}
		return false;
	}
	
	// 投入の在庫識別区分
	@Override
	public void doDtlInpt_stk_id_typ_LC(MCEventInfo info) {
		super.doDtlInpt_stk_id_typ_LC(info);
		int idx = info.getEventIndex();
		DtlInptR inptR = getDtlInptL().get(idx);
		if (isStkBpCdReadOnly(inptR)) {
			// 在庫取引先をクリア
			setValueEx(columnDtlInpt_stk_bp_cd, idx, null);
		}
		
		if (MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
			// 自給の場合、在庫関連項目をクリアする
			for (MCColumnConfig c : getNotStkOutReadOnlyColumn()) {
				c.setValue(idx, null);
			}
		}
	}
	
	protected boolean isStkBpCdReadOnly(DtlInptR inptR) {
		if (isNull(inptR.stk_id_typ()) || MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ())
				|| MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
			return true;
		}
		return false;
	}
	
	@Override
	public void doDtlYield_yield_typ_LC(MCEventInfo info) {
		super.doDtlYield_yield_typ_LC(info);
		DtlYieldR r = getDtlYieldL().get(info.getEventIndex());
		setValueEx(columnDtlYield_yield_rsn_cd, r.getGUIIndex(), null);
	}

	// -----------------------------------------------
	// RowListener
	// 計上日を終了時刻入力用のダミーの日付に常に連動するために定義。
	protected AcDtRowListener getAcDtRowListener() {
		return new AcDtRowListener();
	}

	/**
	 * 計上日に設定された値を、時刻と連動するダミーの日付に設定するためのRowListener
	 */
	protected class AcDtRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			String col = event.getColumn();
			if (isSame(col, DtlWkR.$ac_dt)) {
				DtlWkR r = (DtlWkR)event.getSourceRow(); 
				setDummyDt(r);
			}
		}
	}
	
	protected AcDtListListener getAcDtListListener() {
		return new AcDtListListener();
	}
	
	/**
	 * 計上日に設定された値を、時刻と連動するダミーの日付に設定するためのListListener
	 */
	protected class AcDtListListener extends MAUDP_ListListener {
		@Override
		public void rowAdded(MCListEvent event) {
			super.rowAdded(event);
			int idx = event.getIndex();
			int cnt = event.getCount();
			for (int i=idx;i<idx + cnt;i++) {
				DtlWkR r = getDtlWkL().get(i);
				setDummyDt(r);
			}
		}
	}
	
	protected void setDummyDt(DtlWkR r) {
		r.dummy_st_dt(r.ac_dt());
		r.dummy_end_dt(r.ac_dt());
	}
	
	// -----------------------------------------------
	// ロス内訳入力画面との連動
	public void refreshLossActRslt(LossAct_HdrR hdr, MCList<LossAct_RsltR> newL) {
		if (!newL.isEmpty()) {
			MCNumber inptPegNo = newL.get(0).inpt_peg_no();
			MCList<LossAct_RsltR> oldL =_lossMap.get(inptPegNo);
			getDtlLossL().removeAll(oldL);
			_lossMap.remove(inptPegNo);
			getDtlLossL().addAll(newL);
			_lossMap.put(inptPegNo, newL);
			
			DtlInptR inptR = getDtlInptL().getFirst(DtlInptR.$peg_no, inptPegNo);
			if (isFxdLossQtyEnable(newL)) {
				inptR.fxd_loss_qty_enable_flg(true);
			}
			else {
				inptR.fxd_loss_qty_enable_flg(false);
			}
			if (isLossQtyEnable(newL)) {
				inptR.loss_qty_enable_flg(true);
			}
			else {
				inptR.loss_qty_enable_flg(false);
			}
			setValueEx(columnDtlInpt_base_unit_loss_qty, inptR.getGUIIndex(), hdr.loss_qty());
			setValueEx(columnDtlInpt_base_unit_fxd_loss_qty, inptR.getGUIIndex(), hdr.fxd_loss_qty());
		}
	}
	
	protected boolean isFxdLossQtyEnable(MCList<LossAct_RsltR> subLossL) {
		// サーバの検索処理にも同様の仕様のソースが存在するため、本メソッド修正時は注意が必要
		if (subLossL.subList(LossAct_RsltR.$fxd_loss_flg, true).size() == 1) {
			LossAct_RsltR subLossR = subLossL.get(0);
			if (!subLossR.isStatusDelete()) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean isLossQtyEnable(MCList<LossAct_RsltR> subLossL) {
		// サーバの検索処理にも同様の仕様のソースが存在するため、本メソッド修正時は注意が必要
		MCList<LossAct_RsltR> defDispL = subLossL.subList(LossAct_RsltR.$def_disp_flg, true);
		if (defDispL.isEmpty()) {
			return false;
		}
		
		MCList<LossAct_RsltR> chkL = subLossL.subList(r -> (!r.fxd_loss_flg() && !isNull(r.loss_act_no())));
		if (chkL.size() <= 1) {
			// sizeが0＝ロス実績が登録されていない
			// sizeが1＝ロス実績が登録されている
			if (!chkL.isEmpty()) {
				if (!chkL.get(0).isStatusDelete()) {
					return true;
				}
			}
			else {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "0")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
		setInvisibleCanAcDt();
	}
	/**
	 * 非表示承認情報を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_APRV, AprvPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvPanel));
	}
	/**
	 * 承認者、承認部門の初期値を設定する。
	 */
	protected void setAprvDptUsrDftVal() {
		setValueEx(Hdr_aprv_dt, getToday());
		if (isNull(getHdrR().aprv_usr_cd())) {
			setValueEx(Hdr_aprv_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		}
	}

	/**
	 * 承認者、承認部門を制御する。
	 */
	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			Hdr_aprv_dt.setMode(MCMode.READ_ONLY);
			Hdr_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doOperBtn_set_st_act_dt_NC(MCEventInfo info) {
		super.doOperBtn_set_st_act_dt_NC(info);
		if (getOperBtnR().set_st_act_dt()) {
			for (DtlOperR r : DtlOperTable.getViewRows()) {
				if (r.check() && isNull(r.st_act_dt())
						&& isEditable(columnDtlOper_st_act_dt, r.getGUIIndex())) {
					setValueEx(columnDtlOper_st_act_dt, r.getGUIIndex(), getToday());
				}
			}
		}
	}

	@Override
	public void doOperBtn_set_end_act_dt_NC(MCEventInfo info) {
		super.doOperBtn_set_end_act_dt_NC(info);
		if (getOperBtnR().set_end_act_dt()) {
			for (DtlOperR r : DtlOperTable.getViewRows()) {
				if (r.check() && isNull(r.end_act_dt())
						&& isEditable(columnDtlOper_end_act_dt, r.getGUIIndex())) {
					setValueEx(columnDtlOper_end_act_dt, r.getGUIIndex(), getToday());
				}
			}
		}
	}

	@Override
	public void doOperBtn_disp_select_oper_only_NC(MCEventInfo info) {
		super.doOperBtn_disp_select_oper_only_NC(info);
		if (getOperBtnR().disp_select_oper_only()) {
			doSelectOperFilter();
		}
		else {
			clearDtlTableFilter();
		}
	}
	
	// 選択工程のみのイベント（テーブルのフィルタ機能を利用している）
	protected void doSelectOperFilter() {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			return;
		}
		
		MCList<DtlOperR> operL = MCList.create(DtlOperR.class);
		operL.add(operR);
		doDtlTableFilter(operL);
	}
	
	protected void doDtlTableFilter(MCList<DtlOperR> operL) {
		MCRowFilterList<MCRowFilter> inptRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> wkRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> yieldRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> byProdRFL = new MCRowFilterList<MCRowFilter>();
		for (int i = 0; i < operL.size(); i++) {
			DtlOperR operR = operL.get(i);
			String logic = null;
			
			// 投入
			MCRowFilter inptRF = DtlInptTable.createRowFilter();
			inptRF.setCondition(DtlInptR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			inptRFL.add(inptRF);
			
			// 工数
			MCRowFilter wkRF = DtlWkTable.createRowFilter();
			wkRF.setCondition(DtlWkR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			wkRFL.add(wkRF);
			
			// 出来高
			MCRowFilter yieldRF = DtlYieldTable.createRowFilter();
			yieldRF.setCondition(DtlYieldR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			yieldRFL.add(yieldRF);
			
			// 副産品
			MCRowFilter byProdRF = DtlByProdTable.createRowFilter();
			byProdRF.setCondition(DtlByProdR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			byProdRFL.add(byProdRF);
		}
		
		if (!inptRFL.isEmpty()) {
			filterList(DtlInptTable, inptRFL, false);
		}
		if (!wkRFL.isEmpty()) {
			filterList(DtlWkTable, wkRFL, false);
		}
		if (!yieldRFL.isEmpty()) {
			filterList(DtlYieldTable, yieldRFL, false);
		}
		if (!byProdRFL.isEmpty()) {
			filterList(DtlByProdTable, byProdRFL, false);
		}
	}
	
	protected void clearDtlTableFilter() {
		filterList(DtlInptTable, null);
		filterList(DtlWkTable, null);
		filterList(DtlYieldTable, null);
		filterList(DtlByProdTable, null);
	}
	
	// ---------------------------------------- 在庫選択機能 START ----------------------------------------
	@Override
	public String getInptItmCdCol() {
		return DtlInptR.$itm_cd;
	}

	@Override
	public String getInptItmSub1Col() {
		return DtlInptR.$itm_sub1;
	}

	@Override
	public String getInptItmSub2Col() {
		return DtlInptR.$itm_sub2;
	}

	@Override
	public String getInptItmSub3Col() {
		return DtlInptR.$itm_sub3;
	}
	
	@Override
	public String getInptGdCdCol() {
		return DtlInptR.$gd_cd;
	}

	@Override
	public String getInptVerNoCol() {
		return DtlInptR.$ver_no;
	}

	@Override
	public String getInptLotNoCol() {
		return DtlInptR.$lot_no;
	}

	@Override
	public String getInptSublotNoCol() {
		return DtlInptR.$sublot_no;
	}

	@Override
	public String getInptLocCdCol() {
		return DtlInptR.$inpt_loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlInptR.$inpt_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlInptR.$inpt_str_ln_cd_none_flg;
	}

	@Override
	public String getInptSno1Col() {
		return DtlInptR.$sno1;
	}

	@Override
	public String getInptSno2Col() {
		return DtlInptR.$sno2;
	}

	@Override
	public String getInptSno3Col() {
		return DtlInptR.$sno3;
	}

	@Override
	public String getInptSno4Col() {
		return DtlInptR.$sno4;
	}

	@Override
	public String getInptStkIdTypCol() {
		return DtlInptR.$stk_id_typ;
	}

	@Override
	public String getInptStkBpCdCol() {
		return DtlInptR.$stk_bp_cd;
	}

	public String getInptStkArrvBpCdCol() {
		return DtlInptR.$stk_arrv_bp_cd;
	}

	public String getInptBaseStkQtyCol() {
		return DtlInptR.$base_unit_inpt_qty;
	}
	
	public String getInptBaseUnitCdCol() {
		return DtlInptR.$base_unit_cd;
	}
	
	@Override
	public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		if (InptBtn_open_MSBEP0500_p_PPanel == panel) {
			// 投入数量や単位ＣＤは受け取らない（投入は基準単位しか扱えないため受け取らない
			if (isSame(name, INPT_PACK_UNIT_CD) || isSame(name, INPT_PACK_STK_QTY)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		if (index < 0) {
			return true;
		}
		
		if (isSame(OPE_INS, ope)) {
			return false;
		}

		return true;
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (InptBtn_open_MSBEP0500_p_PPanel == panel) {
			return DtlInptTable;
		}
		return null;
	}

	// 在庫選択画面に渡す検索条件を設定する
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlInptR selR  = (DtlInptR)table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (selR != null) {
			bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD);
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, selR.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, selR.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, selR.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, selR.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, selR.itm_nm());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, selR.ver_no());
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.gd_cd());
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.gd_nm());
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.inpt_loc_cd());
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.inpt_loc_nm());
			bind.addStringColumn(IfStkInspBase.CND_SNO1, nvl(selR.sno1(), selR.inst_sno1()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, selR.sno1_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO2, nvl(selR.sno2(), selR.inst_sno2()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, selR.sno2_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO3, nvl(selR.sno3(), selR.inst_sno3()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, selR.sno3_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO4, nvl(selR.sno4(), selR.inst_sno4()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, selR.sno4_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
		}

		return bind;
	}
	
	@Override
	public boolean isCndEnable(String ope, String name) {
		if (isSame(name, IfStkInspBase.CND_ITM_CD)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB1)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB2)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB3)
				|| isSame(name, IfStkInspBase.CND_ITM_NM)) {
			return false;
		}
		return true;
	}

	// ---------------------------------------- 在庫選択機能 END ----------------------------------------
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		if (panel == DtlYield_can_ac_dt_p_PPanel) {
			return columnDtlYield_ac_dt;
		}
		else if (panel == DtlByProd_can_ac_dt_p_PPanel) {
			return columnDtlByProd_ac_dt;
		}
		else if (panel == DtlInpt_can_ac_dt_p_PPanel) {
			return columnDtlInpt_ac_dt;
		}
		
		return null;
	}

	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}

	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}

	@Override
	public void doInptBtn_inpt_can_ac_dt_LC(MCEventInfo info) {
		super.doInptBtn_inpt_can_ac_dt_LC(info);
		for (DtlInptR inptR : getDtlInptL()) {
			if (Cnd_ope_UPD.isSelected()) {
				if (inptR.check()) {
					setInptCanAcDt(inptR);
				}
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setInptCanAcDt(inptR);
			}
		}
	}

	protected void setInptCanAcDt(DtlInptR r) {
		MCDate inptCanAcDt = getInptBtnR().inpt_can_ac_dt();
		if (!isNull(r.inpt_act_no()) && (isNull(r.ac_dt_after_srch())
				|| r.ac_dt_after_srch().lt(inptCanAcDt))) {
			setValueEx(columnDtlInpt_can_ac_dt_for_input, r.getGUIIndex(), inptCanAcDt);
		}
	}
	
	protected void setInvisibleCanAcDt() {
		boolean cl_usr_flg = getUsrAcl().cl_usr_flg();

		if (!cl_usr_flg) {
			setComponentInvisibleAllStatus(InptBtn_inpt_can_ac_dt);
		}
	}

}