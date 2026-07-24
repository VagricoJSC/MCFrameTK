package mcframe.clientMSBF.MSBFP0060;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5370.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowStatusEvent;

import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_InspActLstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_InspActLstReg_MC extends MSBFP_InspActLstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	// 全数実績明細キャッシュ
	Map<String, MCList<RsltTtlR>> _rsltTtlL = new HashMap<String, MCList<RsltTtlR>>();
	// 抜取明細キャッシュ
	Map<String, MCList<RsltSmplR>> _rsltSmplL = new HashMap<String, MCList<RsltSmplR>>();
	protected boolean _allSetFlg = false;
	// 検索時の有効期限更新フラグをキャッシュ
	Map<String, Boolean> _vldDtUpdFlgL = new HashMap<String, Boolean>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspActLstReg_MC() {
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
	public MSBFP_InspActLstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Srch01Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0060_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(InspStsTypPanel));
			msgList.addAll(checkAtLeastOne(InspRsltPrntFlgPanel));
			if (isNull(getCndR().insp_mtd_typ()) || MAC_INSP_MTD_TYP.isSPEC(getCndR().insp_mtd_typ())) {
				msgList.addAll(checkAtLeastOne(CnfCmpPanel));
			}
			msgList.addAll(checkAtLeastOne(LimsTrgtPanel));
			msgList.addAll(checkBeforeAfter(Cnd_inst_dt_fr, Cnd_inst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_judg_dt_fr, Cnd_judg_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_upd_ts_fr, Cnd_upd_ts_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_rslt_prnt_tm_fr, Cnd_insp_rslt_prnt_tm_to));
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			setHiddenTtlList(bridge.down1());
			setHiddenSmplList(bridge.down2());
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
		protected void show() {
			super.show();

			setValidDtUpdFlg();
		}

		/**
		 * 使用期限を更新するフラグを設定する。
		 */
		protected void setValidDtUpdFlg() {
			for (RsltR r : getRsltL()) {
				if (isValidDtUpdFlgTrue(r)) {
					r.vld_dt_upd_flg(true);
				}
				_vldDtUpdFlgL.put(r.insp_act_no(), r.vld_dt_upd_flg());
			}
		}

		/**
		 * 使用期限を更新するフラグをtrueにすべきかどうか
		 * @return
		 */
		protected boolean isValidDtUpdFlgTrue(RsltR r) {
			boolean ret = false;
			String ope = getCndR().ope();
			
			if (!r.lmt_ctl_flg()) {
				// 期限管理対象外の場合はfalse
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())
					|| MSC_INSP_TYP.isPRDCT(r.insp_typ())
					|| MSC_INSP_TYP.isACCPT(r.insp_typ())) {
				
				if (!isNull(r.quality_typ()) && !MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
					// 良品区分が良品でない場合はfalse
				}
				else if (isSame(ope, Cnd_ope_UPD.getActionCommand())
						&& !isNull(r.insp_aprv_sts_typ())) {
					// 判定対象で操作種別が登録・訂正するの場合はfalse
				}
				else if (r.lmt_up_flg()) {
					ret = true;
				}
				else {
					ret = isNull(r.vld_dt_now());
				}
			}
			
			return ret;
		}
	}

	/**
	 * [MS_MSBFL0060_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Srch02Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0060_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			//何もしない
		}
		@Override
		protected boolean isDownParamEmpty() {
			// 下り電文の値が空の場合でもそのまま上書きする
			return false;
		}
		@Override
		protected void show() {
			super.show();
			
			for (VldLmtDtSrchR dtR : getVldLmtDtSrchL()) {
				RsltR r = RsltTable.getRow(dtR.row_idx().intValue());
				
				r.lmt_dt_frm(dtR.lmt_dt_frm());
				r.vld_dt(dtR.vld_dt());
				r.lmt_dt(dtR.lmt_dt());
			}
		}
	}

	/**
	 * [MS_MSBFL0060_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Upd01Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		// チェック対象のリスト
		protected MCList<RsltR> _RsltLForCall = MCList.create(RsltR.class);
		protected MCList<RsltSmplR> _RsltSmplLForCall = MCList.create(RsltSmplR.class);
		protected MCList<RsltTtlR> _RsltTtlLForCall = MCList.create(RsltTtlR.class);

		protected MS_MSBFL0060_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_RsltLForCall = getRsltL().subList(RsltR.$check, true);
			for(RsltR r : _RsltLForCall) {
				if (_rsltSmplL.containsKey(r.insp_no())) {
					for (RsltSmplR smplR : _rsltSmplL.get(r.insp_no())) {
						if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
							continue;
						}
						if (isNull(smplR.insp_smpl_act_no())) {
							if (smplR.isStatusNone()) {
								continue;
							}
							else if (smplR.isStatusModify()){
								smplR.setStatus(Status.CREATE);
							}
						}
						_RsltSmplLForCall.add(smplR);
					}
				}
				if (_rsltTtlL.containsKey(r.insp_no())) {
					for (RsltTtlR ttlR : _rsltTtlL.get(r.insp_no())) {
						if (isNull(ttlR.insp_act_d_no())) {
							if (ttlR.isStatusNone()) {
								continue;
							}
							else if (ttlR.isStatusModify()){
								ttlR.setStatus(Status.CREATE);
							}
						}
						_RsltTtlLForCall.add(ttlR);
					}
				}
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, _RsltLForCall);
			// テーブルに設定されていないと必須チェックされないため、必須チェック対象のデータを、抜取・全数テーブルのリストに設定
			getRsltSmplL().setAll(_RsltSmplLForCall);
			getRsltTtlL().setAll(_RsltTtlLForCall);
			// 抜取・全数の必須チェック
			checkReqSub(msgList, _RsltSmplLForCall);
			checkReqSub(msgList, _RsltTtlLForCall);
			// 抜取・全数の表示データを再設定。
			RsltR row = RsltTable.getSelectedMCRow();
			showRsltTtl(row);
			showRsltSmpl(row);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up0().setAll(_RsltLForCall);
			bridge.up1().setAll(_RsltTtlLForCall);
			bridge.up2().setAll(_RsltSmplLForCall);
		}
		
		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(1, _RsltTtlLForCall);
			result.set(2, _RsltSmplLForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(1, _RsltTtlLForCall);
			result.set(2, _RsltSmplLForCall);
			return result;
		}

		@Override
		protected void afterCallParts() {
			super.afterCallParts();
			MCMessageList msgL = getParamMessage();
			MCList downL = getDownParamList(0);
			if (msgL != null && !msgL.isEmpty()) {
				for (MCRow r : (MCList<MCRow>)downL) {
					for (MCMessage msg : msgL) {
						MCRow causeRow = msg.getCauseRow();
						if (causeRow == null) {
							continue;
						}
						String inspNo = causeRow.getStringNE("INSP_NO");
						if (!isNull(inspNo) && isSame(inspNo, r.getStringNE("INSP_NO"))) {
							r.setString(Rslt_rts_msg_p_PPanel.columnRtnMsg_msg_id.getBaseRowColumnName(), msg.getID());
							r.setString(Rslt_rts_msg_p_PPanel.columnRtnMsg_msg.getBaseRowColumnName(), msg.toString());
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0060_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Upd02Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0060_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);

			for (RsltR r : getRsltL().subList(RsltR.$check, true)) {
				if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
					if (MSC_INSP_JUDG_RSLT_TYP.isOK(r.insp_judg_rslt_typ())) {
						if (r.std_insp_ng_flg()) {
							msgList.add(new MCMessage(r, null, MSBFP0006, r.insp_no()));
						}
						if (r.std_insp_sp_flg()) {
							msgList.add(new MCMessage(r, null, MSBFP0007, r.insp_no()));
						}
					}
					else if (MSC_INSP_JUDG_RSLT_TYP.isSP(r.insp_judg_rslt_typ())) {
						if (r.std_insp_ng_flg()) {
							msgList.add(new MCMessage(r, null, MSBFP0006, r.insp_no()));
						}
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0060_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Del01Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0060_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0060_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Del02Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0060_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getJudgBulkSetR()));
		}
	}

	/**
	 * [MS_MSBFL0060_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0060_Prnt01Caller<P extends MSBFP_InspActLstReg, B extends MS_MSBFL0060_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0060_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBFL0060_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBFL0060_Srch01().execDL();
	}
	/**
	 * Panel[BtnTtl]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtnTtl_rdel(MCEventInfo info) {
		RsltTtlR delR = deleteRow(RsltTtlTable);
		MCList<RsltTtlR> subL = _rsltTtlL.get(delR.insp_no());
		if (delR.isStatusCreate()) {
			if (subL.contains(delR)) {
				subL.remove(delR);
			}
		}
	}
	/**
	 * Panel[BtnTtl]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtnTtl_rcopy(MCEventInfo info) {
		RsltTtlR copyR = copyRow(RsltTtlTable);
		if (!isNull(copyR)) {
			copyR.insp_act_d_no(null);
			copyR.can_ac_dt(null);
			copyR.lims_flg(false);
			copyR.ext_sys_cd(null);
			copyR.ext_sys_nm(null);
			copyR.ext_insp_act_d_no(null);
			MCList<RsltTtlR> subL = _rsltTtlL.get(copyR.insp_no());
			subL.add(copyR);
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0040(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0050(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0070(r);
	}

	protected void doBtn_open_MSBFP0040(RsltR r) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("insp_no", r.insp_no());
		openPanel("MS", "MSBFP0040", T2, bind);
	}

	protected void doBtn_open_MSBFP0050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0050");
		aso.putCnd(crtOpenMSBFP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0050.CndR crtOpenMSBFP0050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg p = (mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0050.CndR to = mcframe.clientMSBF.MSBFP0050.CndR.create();
		if (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		to.insp_no(r.insp_no());
		return to;
	}

	protected void doBtn_open_MSBFP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0070");
		aso.putCnd(crtOpenMSBFP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0070.CndR crtOpenMSBFP0070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg p = (mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0070.CndR to = mcframe.clientMSBF.MSBFP0070.CndR.create();
		if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		else if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.insp_no(r.insp_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[prnt_insp_rslt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_insp_rslt(MCEventInfo info) {
		callMS_MSBFL0060_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0060_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_judg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_judg(MCEventInfo info) {
		callMS_MSBFL0060_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del_inst]の押下時の処理
	 */
	@Override
	public void doBtn_del_inst(MCEventInfo info) {
		callMS_MSBFL0060_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBFL0060_Del02();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		_allSetFlg = true;
		doSelectAll(RsltTable);
		setAllLmtDtFrmVals();
		_allSetFlg = false;
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 登録項目の担当者・部門部品は、必ず日付を連携する
		ActBulkSet_act_usr_dpt_p_PPanel.setRelateBeans(ActBulkSet_st_dt);
		JudgBulkSet_judg_usr_dpt_p_PPanel.setRelateBeans(JudgBulkSet_judg_dt);

		Rslt_act_usr_cd_p_PPanel.setRelateBeans(columnRslt_st_dt);
		Rslt_judg_usr_cd_p_PPanel.setRelateBeans(columnRslt_judg_dt);

		Rslt_inst_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_inst_pack_unit_cd, columnRslt_inst_pack_unit_dec_place);
		Rslt_inst_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_inst_base_unit_cd, columnRslt_inst_base_unit_dec_place);
		Rslt_act_ttl_qty_p_PPanel.setRelateBeans(columnRslt_inst_base_unit_cd, columnRslt_inst_base_unit_dec_place);
		Rslt_rem_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_inst_base_unit_cd, columnRslt_inst_base_unit_dec_place);
		Rslt_good_qty_p_PPanel.setRelateBeans(columnRslt_inst_base_unit_cd, columnRslt_inst_base_unit_dec_place);
		Rslt_dfct_qty_p_PPanel.setRelateBeans(columnRslt_inst_base_unit_cd, columnRslt_inst_base_unit_dec_place);
		Rslt_smpl_inst_qty_p_PPanel.setRelateBeans(columnRslt_smpl_inst_unit_cd, columnRslt_smpl_inst_unit_dec_place);

		RsltTtl_stk_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltTtl_stk_pack_unit_cd, columnRsltTtl_stk_pack_unit_dec_place);
		RsltTtl_stk_base_unit_qty_p_PPanel.setRelateBeans(columnRsltTtl_stk_base_unit_cd, columnRsltTtl_stk_base_unit_dec_place);
		RsltTtl_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltTtl_pack_unit_cd, columnRsltTtl_pack_unit_dec_place);
		RsltTtl_base_unit_qty_p_PPanel.setRelateBeans(
				columnRsltTtl_base_unit_cd, columnRsltTtl_base_unit_dec_place, columnRsltTtl_base_unit_rnd_typ,
				columnRsltTtl_pack_unit_qty, columnRsltTtl_pack_unit_dmn_qty, columnRsltTtl_pack_unit_conv_qty);
		RsltTtl_pack_xfr_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltTtl_pack_xfr_pack_unit_cd, columnRsltTtl_pack_xfr_pack_unit_dec_place);
		RsltTtl_pack_xfr_base_unit_qty_p_PPanel.setRelateBeans(
				columnRsltTtl_pack_xfr_base_unit_cd, columnRsltTtl_pack_xfr_base_unit_dec_place, columnRsltTtl_pack_xfr_base_unit_rnd_typ,
				columnRsltTtl_pack_xfr_pack_unit_qty, columnRsltTtl_pack_xfr_pack_unit_dmn_qty, columnRsltTtl_pack_xfr_pack_unit_conv_qty);

		RsltSmpl_smpl_qty_p_PPanel.setRelateBeans(columnRsltSmpl_base_unit_cd, columnRsltSmpl_base_unit_dec_place);
		RsltSmpl_pack_xfr_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltSmpl_pack_xfr_pack_unit_cd, columnRsltSmpl_pack_xfr_pack_unit_dec_place);
		RsltSmpl_pack_xfr_base_unit_qty_p_PPanel.setRelateBeans(columnRsltSmpl_pack_xfr_base_unit_cd, columnRsltSmpl_pack_xfr_base_unit_dec_place,
				columnRsltSmpl_pack_xfr_base_unit_rnd_typ, columnRsltSmpl_pack_xfr_pack_unit_qty, 
				columnRsltSmpl_pack_xfr_pack_unit_dmn_qty, columnRsltSmpl_pack_xfr_pack_unit_conv_qty);
		RsltSmpl_so_qty_p_PPanel.setRelateBeans(columnRsltSmpl_base_unit_cd, columnRsltSmpl_base_unit_dec_place);
		RsltSmpl_str_ln_p_PPanel.setRelateBeans(columnRsltSmpl_loc_cd, columnRsltSmpl_str_ln_tgt_flg);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {

		// 検査状況
		Cnd_ord_flg.setValue(true);
		Cnd_stt_flg.setValue(true);
		Cnd_cmpl_flg.setValue(true);
		// 検査成績書
		Cnd_insp_rslt_not_prnt_flg.setValue(true);
		Cnd_insp_rslt_prnt_flg.setValue(true);
		// 規格検査
		Cnd_cnf_not_cmpl_flg.setValue(true);
		Cnd_cnf_cmpl_flg.setValue(true);
		// LIMS
		clearCndLimsTrgt();
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}

	/**
	 * 非表示判定情報を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_JUDG, Cnd_ope_DEL_JUDG, JudgBulkSetPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, JudgBulkSetPanel));
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	
	@Override
	public void setFocus(MCMessage msg) {
		// 全数検査一覧でエラーが発生した場合は、上部一覧にフォーカスを飛ばす
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof RsltTtlR) {
			for (RsltR r : getRsltL()) {
				if (isSame(((RsltTtlR) msg.getCauseRow()).insp_no(), r.insp_no())) {
					RsltTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		// 下部一覧でエラーが発生した場合は、上部一覧にフォーカスを飛ばす
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof RsltSmplR) {
			for (RsltR r : getRsltL()) {
				if (isSame(((RsltSmplR) msg.getCauseRow()).insp_no(), r.insp_no())) {
					RsltTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();

		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		ActBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_JUDGStatus() {
		super.setSRCH_JUDGStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setJUDGStatus() {
		super.setJUDGStatus();

		setJudgDptUsrDftVal();
		setJudgDptUsrMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		ActBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_JUDGStatus() {
		super.setSRCH_DEL_JUDGStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDEL_JUDGStatus() {
		super.setDEL_JUDGStatus();
		JudgBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_PRNT_RSLTStatus() {
		super.setSRCH_PRNT_RSLTStatus();

		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setPRNT_RSLTStatus() {
		super.setPRNT_RSLTStatus();

		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	/**
	 * 一括設定の判定者、判定部門の初期値を設定する。
	 */
	protected void setJudgDptUsrDftVal() {
		JudgBulkSet_judg_dt.setValue(getToday());
		if (isNull(getJudgBulkSetR().judg_usr_cd())) {
			JudgBulkSet_judg_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
		}
		JudgBulkSetPanel.focusFirstComponent();
	}

	/**
	 * 一括設定の判定者、判定部門を制御する。
	 */
	protected void setJudgDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			JudgBulkSet_judg_dt.setMode(MCMode.READ_ONLY);
			JudgBulkSet_judg_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		// 検査指図登録
		if (isEnableBtn_open_MSBFP0040(r)) {
			setDefaultMode(Btn_open_MSBFP0040);
		}
		else {
			Btn_open_MSBFP0040.setMode(MCMode.DISABLE);
		}
		// 規格検査実績登録
		if (isEnableBtn_open_MSBFP0050(r)) {
			setDefaultMode(Btn_open_MSBFP0050);
		}
		else {
			Btn_open_MSBFP0050.setMode(MCMode.DISABLE);
		}
		// 検査実績登録
		if (isEnableBtn_open_MSBFP0070(r)) {
			setDefaultMode(Btn_open_MSBFP0070);
		}
		else {
			Btn_open_MSBFP0070.setMode(MCMode.DISABLE);
		}
	}
	
	protected void setRsltTtlBtnMode() {
		if (!isRegStatus()) {
			return ;
		}

		if (getRsltTtlL().isEmpty()) {
			
			BtnTtl_rdel.setMode(MCMode.READ_ONLY);
			BtnTtl_rcopy.setMode(MCMode.READ_ONLY);
			return;
		}

		RsltTtlR ttlR = RsltTtlTable.getSelectedMCRow();
		if (isNull(ttlR)) {
			BtnTtl_rdel.setMode(MCMode.READ_ONLY);
			BtnTtl_rcopy.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!isNull(ttlR.insp_act_d_no()) || ttlR.isStatusCreate()) {
				setDefaultMode(BtnTtl_rdel);
			}
			else {
				BtnTtl_rdel.setMode(MCMode.READ_ONLY);
			}
			setDefaultMode(BtnTtl_rcopy);
		}
	}
	/**
	 * 検査指図登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		
		return !isNullAnd(r.insp_no());
	}

	/**
	 * 規格検査実績登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0050(RsltR r) {
		if (r == null) {
			return false;
		}
		if (MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ()) 
				|| MSC_INSP_STS_TYP.isYET(r.insp_sts_typ()) 
				|| !MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
			return false;
		}
		return !isNull(r.insp_no());
	}

	/**
	 * 検査実績登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.insp_no());
	}
	/**
	 * 操作種別の指図を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedUpd(){
		return Cnd_ope_UPD.isSelected();
	}
	/**
	 * 操作種別の判定を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedJudg(){
		return Cnd_ope_JUDG.isSelected();
	}
	/**操作種別が実績取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDel() {
		return Cnd_ope_DEL.isSelected();
	}
	/**操作種別が判定取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelJudg() {
		return Cnd_ope_DEL_JUDG.isSelected();
	}
	/**
	 * 操作種別の参照を選択しているかどうか
	 * @return 
	 */	
	protected boolean isSelectedRef(){
		return Cnd_ope_REF.isSelected();
	}
	/**操作種別が成績書発行を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedPrntRslt() {
		return Cnd_ope_PRNT_RSLT.isSelected();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isJudgStatus() {
		return isSame(getStatus(), JUDG);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isDelJudgStatus() {
		return isSame(getStatus(), DEL_JUDG);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (isSelectedUpd()) {
			setSRCH_UPDStatus();
		}
		else if (isSelectedJudg()) {
			setSRCH_JUDGStatus();
		}
		else if (isSelectedDel()) {
			setSRCH_DELStatus();
		}
		else if (isSelectedDelJudg()) {
			setSRCH_DEL_JUDGStatus();
		}
		else if (isSelectedRef()) {
			setSRCH_REFStatus();
		}
		else if (isSelectedPrntRslt()) {
			setSRCH_PRNT_RSLTStatus();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (isSelectedUpd()) {
			setUPDStatus();
		}
		else if (isSelectedJudg()) {
			setJUDGStatus();
		}
		else if (isSelectedDel()) {
			setDELStatus();
		}
		else if (isSelectedDelJudg()) {
			setDEL_JUDGStatus();
		}
		else if (isSelectedRef()) {
			setREFStatus();
		}
		else if (isSelectedPrntRslt()) {
			setPRNT_RSLTStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltR row = getRsltL().get(idx);
		showRsltTtl(row);
		showRsltSmpl(row);
		setBtnMode();
		setRsltTtlBtnMode();
	}
	
	@Override
	public void doRsltTtl_NC(MCEventInfo info) {
		super.doRsltTtl_NC(info);

		setRsltTtlBtnMode();
	}

	@Override
	public void doRsltTtl_base_flg_NC(MCEventInfo info) {
		super.doRsltTtl_base_flg_NC(info);
		
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		
		RsltTtlR ttlR = getRsltTtlL().get(idx);
		
		if (ttlR.base_flg()) {
			setValueEx(columnRsltTtl_pack_unit_cd, idx, ttlR.base_unit_cd());
		}
		else {
			setValueEx(columnRsltTtl_pack_unit_cd, idx, ttlR.pack_xfr_pack_unit_cd());
			setValueEx(columnRsltTtl_pack_xfr_pack_unit_qty, idx, null);
		}
	}

	@Override
	public void doRsltTtl_quality_typ_NC(MCEventInfo info) {
		super.doRsltTtl_quality_typ_NC(info);
		
		int idx = info.getEventIndex();
		RsltTtlR ttlR = getRsltTtlL().get(idx);
		
		if (isNull(ttlR.quality_typ()) || !MAC_QUALITY_TYP.isDFCT_INSP(ttlR.quality_typ())) {
			setValueEx(columnRsltTtl_dfct_rsn_cd, idx, null);
		}
	}

	/**
	 * 明細キャッシュ初期化
	 */
	protected void clearHiddenList() {
		_rsltTtlL = new HashMap<String, MCList<RsltTtlR>>();
		_rsltSmplL = new HashMap<String, MCList<RsltSmplR>>();
		_vldDtUpdFlgL = new HashMap<String, Boolean>();
	}

	/**
	 * 全数実績明細の検索結果を設定する。
	 * @param prms　検索した結果の抜取明細
	 */
	protected void setHiddenTtlList(MCList<RsltTtlR> prms) {
		MCIndexKey idxKey = prms.createIndex(RsltTtlR.$insp_no);
		for(RsltTtlR r: prms.groupBy(RsltTtlR.$insp_no)) {
			MCList<RsltTtlR> val = prms.subList(idxKey, r.insp_no());
			editTtlL(val);
			_rsltTtlL.put(r.insp_no(), val);
		}
	}

	/**
	 * 抜取明細の検索結果を設定する。
	 * @param prms　検索した結果の抜取明細
	 */
	protected void setHiddenSmplList(MCList<RsltSmplR> prms) {
		MCIndexKey idxKey = prms.createIndex(RsltSmplR.$insp_no);
		for(RsltSmplR r: prms.groupBy(RsltSmplR.$insp_no)) {
			MCList<RsltSmplR> val = prms.subList(idxKey, r.insp_no());
			editSmplL(val);
			_rsltSmplL.put(r.insp_no(), val);
		}
	}

	/**
	 * 全数実績明細を編集する。
	 * 
	 * @param ttlL
	 */
	protected void editTtlL(MCList<RsltTtlR> ttlL) {
		for (RsltTtlR ttlR : ttlL) {
			ttlR.can_ac_dt(ttlR.ac_dt());
			if (!isNull(ttlR.pack_xfr_pack_unit_qty())) {
				ttlR.base_flg(true);
			}
		}
	}

	/**
	 * 抜取実績明細を編集する。
	 * 
	 * @param smplL
	 */
	protected void editSmplL(MCList<RsltSmplR> smplL) {
		for (RsltSmplR smplR : smplL) {
			smplR.can_ac_dt(smplR.ac_dt());

			if (isNull(smplR.pack_xfr_base_unit_cd())) {
				smplR.pack_xfr_base_unit_cd(smplR.base_unit_cd());
				smplR.pack_xfr_base_unit_dec_place(smplR.base_unit_dec_place());
				smplR.pack_xfr_base_unit_rnd_typ(smplR.base_unit_rnd_typ());
			}
		}
	}

	protected void showRsltTtl(RsltR row) {
		if (!isNull(row.insp_no())) {
			getRsltTtlL().setAll(_rsltTtlL.get(row.insp_no()));
			showSub(RsltTtlTable);
		}
		else {
			getRsltTtlL().clear();
		}
	}

	protected void showRsltSmpl(RsltR row) {
		if (!isNull(row.insp_no())) {
			getRsltSmplL().setAll(_rsltSmplL.get(row.insp_no()));
			showSub(RsltSmplTable);
		}
		else {
			getRsltSmplL().clear();
		}
	}
	
	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
			tbl.selectLeftmostColumn(0);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getActBulkSetR(), getJudgBulkSetR(), getRsltL(), getRsltSmplL(), getRsltTtlL());
		clearCnd();
		setSrchStatus();
	}

	protected void clearCnd() {
		// 登録・訂正
		if (isSelectedUpd()) {
			valueInitSub();
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, null);
			// 判定日
			setValueEx(Cnd_judg_dt_fr, null);
			setValueEx(Cnd_judg_dt_to, null);
			// 判定者
			setValueEx(Cnd_judg_usr_cd, null);
			// 判定部門
			setValueEx(Cnd_judg_dpt_cd, null);
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, null);
		}
		// 判定
		else if (isSelectedJudg()) {
			// 検査状況
			Cnd_ord_flg.setValue(false);
			Cnd_stt_flg.setValue(false);
			Cnd_cmpl_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 規格検査
			Cnd_cnf_not_cmpl_flg.setValue(true);
			Cnd_cnf_cmpl_flg.setValue(true);
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, MSC_INSP_APRV_STS_TYP.JUDG_OPN.value());
			// 判定日
			setValueEx(Cnd_judg_dt_fr, null);
			setValueEx(Cnd_judg_dt_to, null);
			// 判定者
			setValueEx(Cnd_judg_usr_cd, null);
			// 判定部門
			setValueEx(Cnd_judg_dpt_cd, null);
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, null);
			// LIMS
			clearCndLimsTrgt();
		}
		// 実績取消
		else if (isSelectedDel()) {
			// 検査状況
			Cnd_ord_flg.setValue(false);
			Cnd_stt_flg.setValue(true);
			Cnd_cmpl_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 規格検査
			Cnd_cnf_not_cmpl_flg.setValue(true);
			Cnd_cnf_cmpl_flg.setValue(true);
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, null);
			// 判定日
			setValueEx(Cnd_judg_dt_fr, null);
			setValueEx(Cnd_judg_dt_to, null);
			// 判定者
			setValueEx(Cnd_judg_usr_cd, null);
			// 判定部門
			setValueEx(Cnd_judg_dpt_cd, null);
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, null);
			// LIMS
			clearCndLimsTrgt();
		}
		// 判定取消
		else if (isSelectedDelJudg()) {
			// 検査状況
			Cnd_ord_flg.setValue(false);
			Cnd_stt_flg.setValue(false);
			Cnd_cmpl_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 規格検査
			Cnd_cnf_not_cmpl_flg.setValue(true);
			Cnd_cnf_cmpl_flg.setValue(true);
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value());
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, null);
			// LIMS
			clearCndLimsTrgt();
		}
		// 参照
		else if (isSelectedRef()) {
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, null);
			// 検査状況
			Cnd_ord_flg.setValue(true);
			Cnd_stt_flg.setValue(true);
			Cnd_cmpl_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 規格検査
			Cnd_cnf_not_cmpl_flg.setValue(true);
			Cnd_cnf_cmpl_flg.setValue(true);
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, null);
			// LIMS
			clearCndLimsTrgt();
		}
		// 検査成績書発行
		else if (isSelectedPrntRslt()) {
			// 検査状況
			Cnd_ord_flg.setValue(true);
			Cnd_stt_flg.setValue(true);
			Cnd_cmpl_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(false);
			// 規格検査
			Cnd_cnf_not_cmpl_flg.setValue(true);
			Cnd_cnf_cmpl_flg.setValue(true);
			// 検査方法区分
			setValueEx(Cnd_insp_mtd_typ, MAC_INSP_MTD_TYP.SPEC.value());
			// 承認状況区分
			setValueEx(Cnd_insp_aprv_sts_typ, null);
			// LIMS
			clearCndLimsTrgt();
		}
	}

	/**
	 * 操作種別によるLIMS対象の初期値を設定する
	 */
	protected void clearCndLimsTrgt() {
		if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT_RSLT.isSelected()) {
			setValueEx(Cnd_lims_flg, true);
			setValueEx(Cnd_not_lims_flg, true);
		}
		else {
			setValueEx(Cnd_lims_flg, false);
			setValueEx(Cnd_not_lims_flg, true);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		ActBulkSet_st_dt.addLCListener(this);
		ActBulkSet_st_hm.addLCListener(this);
		ActBulkSet_end_dt.addLCListener(this);
		ActBulkSet_end_hm.addLCListener(this);

		ActBulkSet_act_usr_cd.addLCListener(this);
		ActBulkSet_act_dpt_cd.addLCListener(this);
		
		JudgBulkSet_judg_usr_cd.addLCListener(this);
		JudgBulkSet_judg_dpt_cd.addLCListener(this);
		JudgBulkSet_judg_rsn.addLCListener(this);

		columnRslt_end_dt.addLCListener(this);

		columnRsltSmpl_pack_xfr_pack_unit_qty.addLCListener(this);
		columnRsltSmpl_act_dt.addLCListener(this);

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(RsltSmplTable, createRsltSmplListListener());
		setListListener(RsltTtlTable, createRsltTtlListListener());
	}
	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		RsltSmplTable.addSortColumn(columnRsltSmpl_ac_dt, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_loc_cd, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_str_ln_cd, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_stk_arrv_bp_cd, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_quality_typ, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_gd_cd, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_stk_insp_typ, SortType.ASC);
		RsltSmplTable.addSortColumn(columnRsltSmpl_stk_id_typ, SortType.ASC);

		RsltTtlTable.addSortColumn(columnRsltTtl_ac_dt, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_loc_cd, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_str_ln_cd, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_stk_arrv_bp_cd, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_quality_typ, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_gd_cd, SortType.ASC);
		RsltTtlTable.addSortColumn(columnRsltTtl_dfct_rsn_cd, SortType.ASC);
	}

	protected MAUDP_RowListener createRsltSmplListListener() {
		return new RsltSmplListRowListener();
	}
	
	protected class RsltSmplListRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			super.valueChanged(event);
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				RsltSmplR rsltSmplR = (RsltSmplR)r;
				RsltR rsltR = RsltTable.getSelectedMCRow();
				if (!isNull(rsltR) && !MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ()) && !rsltR.check()) {
					setValueEx(columnRslt_check, rsltR.getGUIIndex(), true);
					if (isNull(rsltSmplR.insp_no())) {
						rsltSmplR.insp_no(rsltR.insp_no());
					}
				}
			}
		}
	}

	protected MAUDP_RowListener createRsltTtlListListener() {
		return new RsltTtlListRowListener();
	}
	
	protected class RsltTtlListRowListener extends MAUDP_RowListener {
		
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			RsltR rsltR = RsltTable.getSelectedMCRow();
			if (!isNull(rsltR) && isEditable(columnRslt_check, rsltR.getGUIIndex()) && !rsltR.check()) {
				setValueEx(columnRslt_check, rsltR.getGUIIndex(), true);
			}
		}

		@Override
		public void valueChanged(MCRowEvent event) {
			super.valueChanged(event);
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				RsltTtlR rsltTtlR = (RsltTtlR)r;
				RsltR rsltR = RsltTable.getSelectedMCRow();
				if (!isNull(rsltR) && !MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ()) && !rsltR.check()) {
					setValueEx(columnRslt_check, rsltR.getGUIIndex(), true);
					if (isNull(rsltTtlR.insp_no())) {
						rsltTtlR.insp_no(rsltR.insp_no());
					}
				}
			}
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == ActBulkSet_st_dt) {
			bulkSet(ActBulkSet_st_dt);
		}
		else if (lc == ActBulkSet_st_hm) {
			bulkSet(ActBulkSet_st_hm);
		}
		else if (lc == ActBulkSet_end_dt) {
			_allSetFlg = true;
			bulkSet(ActBulkSet_end_dt);
			_allSetFlg = false;
		}
		else if (lc == ActBulkSet_end_hm) {
			bulkSet(ActBulkSet_end_hm);
		}
		else if (lc == ActBulkSet_act_usr_cd) {
			bulkSet(ActBulkSet_act_usr_cd);
		}
		else if (lc == ActBulkSet_act_dpt_cd) {
			bulkSet(ActBulkSet_act_dpt_cd);
		}
		else if (lc == JudgBulkSet_judg_dt) {
			_allSetFlg = true;
			bulkSet(JudgBulkSet_judg_dt);
			_allSetFlg = false;
		}
		else if (lc == JudgBulkSet_judg_usr_cd) {
			bulkSet(JudgBulkSet_judg_usr_cd);
		}
		else if (lc == JudgBulkSet_judg_dpt_cd) {
			bulkSet(JudgBulkSet_judg_dpt_cd);
		}
		else if (lc == JudgBulkSet_judg_rsn) {
			bulkSet(JudgBulkSet_judg_rsn);
		}
		else if (lc == columnRslt_end_dt) {
			doRslt_end_dt_LC(info);
		}
		else if (lc == columnRsltSmpl_act_dt) {
			doRsltSmpl_act_dt_LC(info);
		}
	}
	
	//一括設定処理 ＊ 一括設定項目がある場合のみ
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) { // 選択チェックオン後に呼出される。行ステータスがNONEからNONE以外に変わった場合のみ呼出される。
		if (srcRow instanceof RsltR) {
			RsltR r = (RsltR)srcRow;
			// 登録・訂正
			if (isSelectedUpd()) {
				if (isNull(r.st_dt())) {
					bulkSet(ActBulkSet_st_dt, r);
				}
				if (isNull(r.st_hm())) {
					bulkSet(ActBulkSet_st_hm, r);
				}
				if (isNull(r.end_dt())) {
					bulkSet(ActBulkSet_end_dt, r);
				}
				if (isNull(r.end_hm())) {
					bulkSet(ActBulkSet_end_hm, r);
				}
				if (isNull(r.act_usr_cd())) {
					bulkSet(ActBulkSet_act_usr_cd, r);
				}
				if (isNull(r.judg_dpt_cd())) {
					bulkSet(ActBulkSet_act_dpt_cd, r);
				}
			}
			// 判定
			else if (isSelectedJudg()) {
				if (isNull(r.judg_dt())) {
					bulkSet(JudgBulkSet_judg_dt, r);
				}
				if (isNull(r.judg_usr_cd())) {
					bulkSet(JudgBulkSet_judg_usr_cd, r);
				}
				if (isNull(r.judg_dpt_cd())) {
					bulkSet(JudgBulkSet_judg_dpt_cd, r);
				}
				if (isNull(r.judg_rsn())) {
					bulkSet(JudgBulkSet_judg_rsn, r);
				}
			}
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			if (isSelectedUpd()) {
				bulkSet(ActBulkSet_st_dt, r);
				bulkSet(ActBulkSet_st_hm, r);
				bulkSet(ActBulkSet_end_dt, r);
				bulkSet(ActBulkSet_end_hm, r);
				bulkSet(ActBulkSet_act_usr_cd, r);
				bulkSet(ActBulkSet_act_dpt_cd, r);
			}
			else if (isSelectedJudg()) {
				bulkSet(JudgBulkSet_judg_dt, r);
				bulkSet(JudgBulkSet_judg_usr_cd, r);
				bulkSet(JudgBulkSet_judg_dpt_cd, r);
				bulkSet(JudgBulkSet_judg_rsn, r);
				if (!_allSetFlg) {
					setLmtDtFrm(r);
				}
			}
			else if (isSelectedDelJudg()) {
				bulkSet(JudgBulkSet_judg_rsn, r);
			}
		}
	}

	protected void setLmtDtFrm(RsltR r) {
		if (r.vld_dt_upd_flg() && !isNull(r.insp_aprv_sts_typ())) {
			if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
				setValueEx(columnRslt_lmt_dt_frm, r.getGUIIndex(), r.judg_dt());
			}
			else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
				setValueEx(columnRslt_lmt_dt_frm, r.getGUIIndex(), r.vld_dt_now());
			}
		}
	}

	@Override
	public void doRslt_quality_typ_NC(MCEventInfo info) {
		super.doRslt_quality_typ_NC(info);
		
		RsltR r = getRsltL().get(info.getEventIndex());
		setVldDtUpdFlg(r, MAC_QUALITY_TYP.isGOOD(r.quality_typ()));
		if (MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
			setValueEx(columnRslt_gd_cd, r.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
			setValueEx(columnRslt_dfct_rsn_cd, r.getGUIIndex(), null);
		}
		else if (MAC_QUALITY_TYP.isDFCT_INSP(r.quality_typ())) {
			setValueEx(columnRslt_gd_cd, r.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
		}
		else if (MAC_QUALITY_TYP.isSSPND(r.quality_typ())) {
			setValueEx(columnRslt_gd_cd, r.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
			setValueEx(columnRslt_dfct_rsn_cd, r.getGUIIndex(), null);
		}
		else  {
			setValueEx(columnRslt_gd_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_dfct_rsn_cd, r.getGUIIndex(), null);
		}
	}
	
	protected void setVldDtUpdFlg(RsltR r, boolean vldDtUpdFlg) {
		if (r.lmt_ctl_flg()
			&& (
				MSC_INSP_TYP.isLOT(r.insp_typ())
				|| MSC_INSP_TYP.isPRDCT(r.insp_typ())
				|| MSC_INSP_TYP.isACCPT(r.insp_typ())
			)
		) {
			if (isUpdStatus() && !isNull(r.insp_aprv_sts_typ())) {
				// 判定対象で操作種別が登録・訂正する場合は何もしない
			}
			else if (r.lmt_up_flg()) {
				setValueEx(columnRslt_vld_dt_upd_flg, r.getGUIIndex(), vldDtUpdFlg);
			}
			else {
				if(isNull(r.vld_dt_now())) {
					setValueEx(columnRslt_vld_dt_upd_flg, r.getGUIIndex(), vldDtUpdFlg);
				}
			}
		}
	}

	@Override
	public MCList getRslt_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getRslt_quality_typ(row, info);
	}

	@Override
	public MCList getRsltTtl_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getRsltTtl_quality_typ(row, info);
	}
	
	public MAC_QUALITY_TYP[] getDispQualityTyp() {
		return new MAC_QUALITY_TYP[] {
				MAC_QUALITY_TYP.GOOD, MAC_QUALITY_TYP.DFCT_INSP,
				MAC_QUALITY_TYP.SSPND
		};
	}

	/**
	 * 一括項目設定
	 * @param b
	 */
	protected void bulkSet(MCBeans b) {

		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
		if (_allSetFlg) {
			setAllLmtDtFrmVals();
		}
	}

	/**
	 * 指定した行の項目設定
	 * @param b
	 * @param r
	 */
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isUpdStatus()) {
			if (b == ActBulkSet_st_dt && isEditable(columnRslt_st_dt, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().st_dt())) {
					r.st_dt(getActBulkSetR().st_dt());
				}
			}
			else if (b == ActBulkSet_st_hm && isEditable(columnRslt_st_hm, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().st_hm())) {
					r.st_hm(getActBulkSetR().st_hm());
				}
			}
			else if (b == ActBulkSet_end_dt && isEditable(columnRslt_end_dt, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().end_dt())) {
					if (_allSetFlg) {
						r.end_dt(getActBulkSetR().end_dt());
					}
					else {
						setValueEx(columnRslt_end_dt, r.getGUIIndex(), getActBulkSetR().end_dt());
					}
				}
			}
			else if (b == ActBulkSet_end_hm && isEditable(columnRslt_end_hm, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().end_hm())) {
					r.end_hm(getActBulkSetR().end_hm());
				}
			}
			else if (b == ActBulkSet_act_usr_cd
					&& isEditable(columnRslt_act_usr_cd, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().act_usr_cd())) {
					r.act_usr_cd(getActBulkSetR().act_usr_cd());
					r.act_usr_nm(getActBulkSetR().act_usr_nm());
				}
			}
			else if (b == ActBulkSet_act_dpt_cd
					&& isEditable(columnRslt_act_dpt_cd, r.getGUIIndex())) {
				if (!isNull(getActBulkSetR().act_dpt_cd())) {
					r.act_dpt_cd(getActBulkSetR().act_dpt_cd());
					r.act_dpt_nm(getActBulkSetR().act_dpt_nm());
				}
			}
		}
		else if (isJudgStatus()) {
			if (b == JudgBulkSet_judg_dt) {
				r.judg_dt(getJudgBulkSetR().judg_dt());
			}
			else if (b == JudgBulkSet_judg_usr_cd) {
				r.judg_usr_cd(getJudgBulkSetR().judg_usr_cd());
				r.judg_usr_nm(getJudgBulkSetR().judg_usr_nm());
			}
			else if (b == JudgBulkSet_judg_dpt_cd) {
				r.judg_dpt_cd(getJudgBulkSetR().judg_dpt_cd());
				r.judg_dpt_nm(getJudgBulkSetR().judg_dpt_nm());
			}
			else if (b == JudgBulkSet_judg_rsn) {
				r.judg_rsn(getJudgBulkSetR().judg_rsn());
			}
		} 
		else if (isDelJudgStatus()) {
			if (b == JudgBulkSet_judg_rsn) {
				r.judg_rsn(getJudgBulkSetR().judg_rsn());
			}
		}
	}

	public void doRslt_end_dt_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		if (_allSetFlg) {
			return;
		}

		RsltR r = getRsltL().get(idx);

		if (r.vld_dt_upd_flg() && isNull(r.insp_aprv_sts_typ())) {
			if (isNull(r.end_dt())) {
				r.lmt_dt_frm(null);
				r.vld_dt(null);
				if (!(MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg() && !isNull(r.vld_dt_now()))) {
					// 期限再検査、かつ現有効期限設定済みでなければ使用期限もクリアする
					r.lmt_dt(null);
				}
			}
			else if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
				setValueEx(columnRslt_lmt_dt_frm, idx, r.end_dt());
			}
			else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
				setValueEx(columnRslt_lmt_dt_frm, idx, r.vld_dt_now());
			}
		}
	}
	
	protected void setAllLmtDtFrmVals() {
		MCList<RsltR> rsltL = getRsltL().subList(r -> isCalcLmtDtFrmRow(r));
		if (rsltL.isEmpty()) {
			return ;
		}

		getVldLmtDtSrchL().clear();
		if (isSelectedUpd()) {
			if (isNull(getActBulkSetR().end_dt())) {
				return;
			}
			for (RsltR r : rsltL) {
				if (isNull(r.insp_aprv_sts_typ())) {
					if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
						r.lmt_dt_frm(r.end_dt());
					}
					else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
						r.lmt_dt_frm(r.vld_dt_now());
					}
				}
				VldLmtDtSrchR dtR = VldLmtDtSrchR.create();
				dtR.row_idx(r.getGUIIndex());
				dtR.insp_no(r.insp_no());
				dtR.lmt_dt_frm(r.lmt_dt_frm());
				getVldLmtDtSrchL().add(dtR);
			}
		}
		else if (isSelectedJudg()) {
			if (isNull(getJudgBulkSetR().judg_dt())) {
				return;
			}
			for (RsltR r : rsltL) {
				if (!isNull(r.insp_aprv_sts_typ())) {
					if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
						r.lmt_dt_frm(r.judg_dt());
					}
					else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
						r.lmt_dt_frm(r.vld_dt_now());
					}
				}
				VldLmtDtSrchR dtR = VldLmtDtSrchR.create();
				dtR.row_idx(r.getGUIIndex());
				dtR.insp_no(r.insp_no());
				dtR.lmt_dt_frm(r.lmt_dt_frm());
				getVldLmtDtSrchL().add(dtR);
			}
		}
		// 起算日により、期限を一括取得する
		callMS_MSBFL0060_Srch02();
	}

	/**
	 * 起算日の計算可能行を判定する
	 * @param r
	 * @return
	 */
	protected boolean isCalcLmtDtFrmRow(RsltR r) {
		if (r.check() && r.vld_dt_upd_flg()) {
			return true;
		}
		return false;
	}

	@Override
	public void doRslt_insp_judg_rslt_typ_LC(MCEventInfo info) {
		super.doRslt_insp_judg_rslt_typ_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltR r = getRsltL().get(idx);
		if (isNull(r.insp_judg_rslt_typ())) {
			setVldDtUpdFlg(r, _vldDtUpdFlgL.get(r.insp_act_no()));
		}
		else {
			setVldDtUpdFlg(r, MSC_INSP_JUDG_RSLT_TYP.isOK(r.insp_judg_rslt_typ())
					|| MSC_INSP_JUDG_RSLT_TYP.isSP(r.insp_judg_rslt_typ()));
			setLmtDtFrm(r);
		}
	}

	@Override
	public void doRslt_act_intr_rmrks_LC(MCEventInfo info) {
		super.doRslt_act_intr_rmrks_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		RsltR r = getRsltL().get(idx);
		setLmtDtFrm(r);
		}
	@Override
	public void doRslt_lot_rmrks_LC(MCEventInfo info) {
		super.doRslt_lot_rmrks_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		RsltR r = getRsltL().get(idx);
		setLmtDtFrm(r);
		}
	@Override
	public void doRslt_sub_char1_LC(MCEventInfo info) {
		super.doRslt_sub_char1_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		RsltR r = getRsltL().get(idx);
		setLmtDtFrm(r);
		}
	@Override
	public void doRslt_sub_char2_LC(MCEventInfo info) {
		super.doRslt_sub_char2_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		RsltR r = getRsltL().get(idx);
		setLmtDtFrm(r);
		}
	@Override
	public void doRslt_sub_char3_LC(MCEventInfo info) {
		super.doRslt_sub_char3_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		RsltR r = getRsltL().get(idx);
		setLmtDtFrm(r);
		}

	@Override
	public void doRslt_vld_dt_upd_flg_NC(MCEventInfo info) {
		super.doRslt_vld_dt_upd_flg_NC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltR r = getRsltL().get(idx);
		
		if (r.vld_dt_upd_flg()) {
			if (MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())) {
				setValueEx(columnRslt_lmt_dt_frm, idx, r.vld_dt_now());
			}
			else if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
				if (isNull(r.insp_aprv_sts_typ())) {
					setValueEx(columnRslt_lmt_dt_frm, idx, r.end_dt());
				}
				else {
					setValueEx(columnRslt_lmt_dt_frm, idx, r.judg_dt());
				}
			}
			else {
				getVldLmtDt(r);
			}
		}
		else {
			r.vld_dt(null);
			r.lmt_dt(null);
			
			//期限取得イベントを起こさないようにするためsetValueExしない
			r.lmt_dt_frm(null);
		}
	}

	@Override
	public void doRslt_lmt_dt_frm_NC(MCEventInfo info) {
		super.doRslt_lmt_dt_frm_NC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		if (_allSetFlg) {
			return;
		}

		RsltR r = getRsltL().get(idx);

		getVldLmtDt(r);
	}

	/**
	 * 期限を取得する
	 * 
	 * @param r
	 */
	protected void getVldLmtDt(RsltR r) {
		if (r.vld_dt_upd_flg()) {
			getVldLmtDtSrchL().clear();

			VldLmtDtSrchR dtR = VldLmtDtSrchR.create();
			dtR.row_idx(r.getGUIIndex());
			dtR.insp_no(r.insp_no());
			dtR.lmt_dt_frm(r.lmt_dt_frm());

			getVldLmtDtSrchL().add(dtR);
			callMS_MSBFL0060_Srch02();
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_MSBFP0070(info);
		}
	}

	protected void doRsltSmpl_act_dt_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltSmplR r = getRsltSmplL().get(idx);

		if (isNull(r.act_dt())) {
			setValueEx(columnRsltSmpl_ac_dt, idx, r.act_dt());
		}
		else {
			setValueEx(columnRsltSmpl_ac_dt, idx, r.act_dt().trunc(MCDateFieldType.DAY));
		}
	}

	@Override
	public void doRsltSmpl_ac_dt_NC(MCEventInfo info) {
		super.doRsltSmpl_ac_dt_NC(info);

		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltSmplR r = getRsltSmplL().get(idx);
		
		if (isNull(r.ac_dt())) {
			setValueEx(columnRsltSmpl_bd_dpt_cd, idx, null);
		}
	}

	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
		RsltSmplTable.setCellConfig(crtRsltSmplCellConfig());
		RsltTtlTable.setCellConfig(createRsltTtlTableCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isUpdStatus()) {
				if (MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ()) 
						|| MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				// 全数検査の場合
				if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					if (isSmplItms(column)) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if (column == columnRslt_quality_typ
							|| column == columnRslt_end_dt
							|| column == columnRslt_gd_cd) {
						if (!isNullAnd(r.quality_typ(), r.end_dt(), r.gd_cd())) {
							return MCMode.REQUIRED;
						}
					}
					if (column == columnRslt_dfct_rsn_cd) {
						if (isNull(r.quality_typ()) || !MAC_QUALITY_TYP.isDFCT_INSP(r.quality_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			else if (isJudgStatus()) {
				if (!MSC_INSP_APRV_STS_TYP.isJUDG_OPN(r.insp_aprv_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isDelStatus()) {
				if (!isNull(r.insp_aprv_sts_typ()) &&
						(!MSC_INSP_APRV_STS_TYP.isJUDG_OPN(r.insp_aprv_sts_typ()) && !MSC_INSP_APRV_STS_TYP.isINST_ACPT(r.insp_aprv_sts_typ()))) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isDelJudgStatus()) {
				if (!isNull(r.insp_aprv_sts_typ()) && !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			if (column == columnRslt_vld_dt_upd_flg) {
				if ((isUpdStatus() || isJudgStatus()) && r.lmt_ctl_flg()) {
					if (MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg()) {
						return MCMode.READ_ONLY;
					}
					if (isNull(r.vld_dt_now())) {
						return MCMode.READ_ONLY;
					}
					if (isRegStatus() && !isNull(r.insp_aprv_sts_typ())) {
						return MCMode.READ_ONLY;
					}
					if (isJudgStatus() && isNull(r.insp_aprv_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
			if (isUpdStatus() || isJudgStatus()) {
				if (column == columnRslt_act_cont_fctr) {
					if (!r.cont_fctr_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_lmt_dt_frm || column == columnRslt_vld_dt) {
					if (!r.vld_dt_upd_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						if (isNull(r.insp_aprv_sts_typ())) {
							if (isNull(r.end_dt())) {
								return MCMode.READ_ONLY;
							}
							else {
								if (!MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ()) && !isQualityGood(r)) {
									return MCMode.ENABLE;
								}
							}
						}
						else {
							if (isRegStatus() && isNull(r.insp_judg_rslt_typ())) {
								return MCMode.READ_ONLY;
							}
							if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(r.insp_judg_rslt_typ())) {
								return MCMode.ENABLE;
							}
						}
						if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) && (MAC_LMT_DT_FRM_TYP
								.isMFG_ST(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(r.lmt_dt_frm_typ()))) {
							return MCMode.ENABLE;
						}
						// 子品目引継の場合は任意入力とする
						// 製造検査の場合：出来高実績前検査は子品目が決まっていないため
						// 受入検査の場合：投入実績未登録で入荷・仕入後検査が可能なため
						if ((MSC_INSP_TYP.isPRDCT(r.insp_typ())
								|| MSC_INSP_TYP.isACCPT(r.insp_typ()))
								&& (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(r.lmt_dt_frm_typ())
										|| MAC_LMT_DT_FRM_TYP
												.isDPND_CHLD_FR_DT(r.lmt_dt_frm_typ()))) {
							return MCMode.ENABLE;
						}
					}
				}
				if (column == columnRslt_lmt_dt) {
					if (!r.vld_dt_upd_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
							if (!isNull(r.lmt_dt_now())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (isNull(r.insp_aprv_sts_typ())) {
							if (isNull(r.end_dt())) {
								return MCMode.READ_ONLY;
							}
							else {
								if (!MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ()) && !isQualityGood(r)) {
									return MCMode.ENABLE;
								}
							}
						}
						else {
							if (isRegStatus() && isNull(r.insp_judg_rslt_typ())) {
								return MCMode.READ_ONLY;
							}
							if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(r.insp_judg_rslt_typ())) {
								return MCMode.ENABLE;
							}
						}
						if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) && (MAC_LMT_DT_FRM_TYP
								.isMFG_ST(r.lmt_dt_frm_typ())
								|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(r.lmt_dt_frm_typ()))) {
							return MCMode.ENABLE;
						}
						// 子品目引継の場合は任意入力とする
						// 製造検査の場合：出来高実績前検査は子品目が決まっていないため
						// 受入検査の場合：投入実績未登録で入荷・仕入後検査が可能なため
						if ((MSC_INSP_TYP.isPRDCT(r.insp_typ())
								|| MSC_INSP_TYP.isACCPT(r.insp_typ()))
								&& (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(r.lmt_dt_frm_typ())
										|| MAC_LMT_DT_FRM_TYP
												.isDPND_CHLD_FR_DT(r.lmt_dt_frm_typ()))) {
							return MCMode.ENABLE;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 良品、保留品かどうか判定する。
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isQualityGood(RsltR r) {
			if (MAC_QUALITY_TYP.isGOOD(r.quality_typ()) || MAC_QUALITY_TYP.isSSPND(r.quality_typ())) {
				return true;
			}
			return false;
		}

		/**
		 * 抜取検査の項目判定する。
		 * @param column
		 * @return
		 */
		protected boolean isSmplItms(MCColumnConfig column) {
			if (column == columnRslt_quality_typ
					|| column == columnRslt_gd_cd
					|| column == columnRslt_dfct_rsn_cd
					|| column == columnRslt_smpl_inst_qty
					|| column == columnRslt_smpl_inst_unit_cd
					|| column == columnRslt_smpl_inst_unit_nm
					|| column == columnRslt_std_cont_fctr
					|| column == columnRslt_act_cont_fctr) {
				return true;
			}
			
			return false;
		}
	}

	protected RsltSmplCellConfig crtRsltSmplCellConfig() {
		return new RsltSmplCellConfig();
	}

	protected class RsltSmplCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltSmplR r = (RsltSmplR) table.getBaseTable().getRow(index);
			RsltR rsltR = RsltTable.getSelectedMCRow();
			if (isNull(rsltR) 
					|| MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ()) 
					|| MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(rsltR.insp_aprv_sts_typ())
					|| !isEditable(columnRslt_check, rsltR.getGUIIndex())) {
				return MCMode.READ_ONLY;
			}

			if (isUpdStatus()) {
				if (column == columnRsltSmpl_act_dt
						|| column == columnRsltSmpl_ac_dt
						|| column == columnRsltSmpl_loc_cd
						|| column == columnRsltSmpl_smpl_qty) {
					return MCMode.REQUIRED;
				}
				if (column == columnRsltSmpl_bd_dpt_cd) {
					if (isNull(r.ac_dt())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(r.so_qty())) {
							return MCMode.REQUIRED;
						}
					}
				}
				if (column == columnRsltSmpl_pack_xfr_pack_unit_qty) {
					if (isSame(r.pack_xfr_pack_unit_cd(), r.pack_xfr_base_unit_cd())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(r.so_qty())) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * RsltTtlTable用のセルコンフィグ
	 */
	protected MCCellConfig createRsltTtlTableCellConfig() {
		return new RsltTtlTableCellConfig();
	}

	/**
	 * RsltTtlTable用のセルコンフィグ
	 */
	public class RsltTtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltTtlR ttlR = (RsltTtlR) table.getBaseTable().getRow(index);
			RsltR hdrR = RsltTable.getSelectedMCRow();

			if (isNull(hdrR) || !isEditable(columnRslt_check, hdrR.getGUIIndex())) {
				return MCMode.READ_ONLY;
			}
			
			if (isUpdStatus()) {
				if (column == columnRsltTtl_ac_dt
						|| column == columnRsltTtl_gd_cd
						|| column == columnRsltTtl_quality_typ
						|| column == columnRsltTtl_pack_unit_qty) {
					return MCMode.REQUIRED;
				}
				if (column == columnRsltTtl_base_flg) {
					if (isSame(ttlR.pack_xfr_pack_unit_cd(), ttlR.pack_xfr_base_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltTtl_pack_xfr_pack_unit_qty) {
					if (!ttlR.base_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRsltTtl_dfct_rsn_cd) {
					if (!MAC_QUALITY_TYP.isDFCT_INSP(ttlR.quality_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

}