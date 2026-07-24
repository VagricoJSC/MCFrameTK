package mcframe.clientMSBD.MSBDP0130;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import mcframe.clientMAUC.MAUCP0050.*;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcActListReg_MC extends MSBDP_PurcActListReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String _$schd_xrate = "_schd_xrate";
	protected static final String _$schd_ptax_xrate = "_schd_ptax_xrate";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcActListReg_MC() {
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
	public MSBDP_PurcActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0130_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Del01Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0130_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnRslt_can_ac_dt_for_input));
				}
			}
		}
	}


	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0130_Del01();
	}
	/**
	 * [MS_MSBDL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Upd01Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0130_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			MCList<RsltR> up = RsltTable.getList().subList(r -> r.check());
			msgList.addAll(qualityTypChk(up));
			msgList.addAll(inptChk(up));
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()
						&& !isEditable(columnRslt_can_ac_dt_for_input, r.getGUIIndex())) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(),
							columnRslt_can_ac_dt_for_input));
				}
			}
		}

	}

	protected void setHdrReadOnlyFlg(MCList<RsltR> tgt, String... cols) {
		RsltR bef = null;
		
		for(RsltR r : tgt) {
			if (bef == null) {
				bef = r;
			}
			else {
				if (isHdrReadOnlyTgt(bef, r, cols)) {
					r.hdr_readonly_flg(true);
				}
				bef = r;
			}
		}
	}
	
	protected boolean isHdrReadOnlyTgt(RsltR bef, RsltR r, String... cols) {
		for (String c : cols) {
			String rv = r.getString(c);
			if (isNull(rv)) {
				return false;
			}
			if (!rv.equals(bef.getString(c))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0130_Upd01();
	}
	/**
	 * [MS_MSBDL0130_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Ins01Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0130_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<RsltR> _rsltForCall = null;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			_rsltForCall = getRsltL().subList(r -> r.check());
		}


		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			_rsltForCall.forEach(r -> {
				cmnChkRslt(r);
			});
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			MCList<RsltR> up = _rsltForCall;
			msgList.addAll(arrPtnChk(up));
			msgList.addAll(qualityTypChk(up));
			msgList.addAll(inptChk(up));
			

		}

		/**
		 * 入荷パタンチェック
		 * @return メッセージリスト
		 */
		protected MCMessageList arrPtnChk(MCList<RsltR> up) {
			MCMessageList msgL = new MCMessageList();
			
			for (RsltR r : up) {

				// 仕入諸掛、入荷実績済み、または入荷不要の場合はチェックしない
				if (isRcptIvPurcXpns(r) || !r.arr_qty().isZero() || r.arr_skip_flg()) {
					continue;
				}
				
				if (r.sync_flg()) {
					if (!r.schd_sync_flg()) {
						msgL.add(new MCMessage(r, RsltR.$sync_flg, MSBEP0031,
								toYMDString(r.arr_schd_dt()), toYMDString(r.purc_schd_dt())));
					}
				}
				else {
					if (r.arr_schd_dt().lte(r.purc_schd_dt()) && !r.schd_sync_flg()) {
						msgL.add(new MCMessage(r, RsltR.$sync_flg, MSBEP0033,
								toYMDString(r.arr_schd_dt()), toYMDString(r.purc_schd_dt())));
					}
					else if (r.schd_sync_flg()) {
						msgL.add(new MCMessage(r, RsltR.$sync_flg, MSBEP0030,
								toYMDString(r.arr_schd_dt()), toYMDString(r.purc_schd_dt())));
					}
				}
				
			}

			return msgL;
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			// 入荷パタン
			setArrPtnTyp(bridge.up0());
		}
	}

	protected void setArrPtnTyp(MCList<RsltR> rl) {
		// 入荷パタン
		for (RsltR r : rl) {
			r.arr_ptn_typ(getArrPtnTyp(r));
		}
	}
	
	protected String getArrPtnTyp(RsltR r) {
		if (!isNull(r.arr_schd_no())) {
			if (r.arr_qty().isZero() && !r.sync_flg()) {
				return MSC_ARR_PTN_TYP.N_YET_ARR.value();
			}
			else {
				return MSC_ARR_PTN_TYP.NRML.value();
			}					
		}
		return null;
	}
	
	/**
	 * 受領インボイス登録で追加した仕入諸掛か
	 */
	protected boolean isRcptIvPurcXpns(RsltR r) {
		return !isNull(r.rcpt_iv_no()) && isNull(r.po_d_no());
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0130_Ins01();
	}
	/**
	 * [MS_MSBDL0130_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Srch03Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0130_Srch03Caller(P p, B b) {
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
		
		/**
		 * チェック処理を行います
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(cmnChkCnd());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSrchedStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			MCList<RsltR> d = bridge.down0();
			setDtlPegNo(d);
			setHdrReadOnly(d);
			setCrtLotFlg(d);
			setBefValue(d);
			for (RsltR r : d) {
				if (isNull(r.arr_act_no())) {
					if (!r.sync_flg()) {
						// 未入荷で同時計上予定でない場合は、格付の初期値はnullとする
						r.tmp_gd_cd(r.gd_cd());
						r.gd_cd(null);
						r.gd_nm(null);
					}
					// 未入荷の場合は在庫がまだないため、良品区分をnullで表示する
					r.tmp_quality_typ(r.quality_typ());
					r.tmp_stk_id_typ(r.stk_id_typ());
					r.tmp_stk_insp_typ(r.stk_insp_typ());
					r.quality_typ(null);
					r.quality_typ_nm(null);
					r.stk_id_typ(null);
					r.stk_id_typ_nm(null);
					r.stk_insp_typ(null);
					r.stk_insp_typ_nm(null);
				}
			}
		}
		
		protected void setCrtLotFlg(MCList<RsltR> down) {
			down.forEach(dr -> dr.crt_lot_flg(getDefCrtLotFlg(dr)));
		}
		
		protected void setBefValue(MCList<RsltR> down) {
			down.forEach(dr -> {
				dr.bef_abort_flg(dr.abort_flg());
				if (dr.xrate_inpt_flg()) {
					dr.setNumberNE(_$schd_xrate, dr.xrate());
				}
				if (dr.ptax_xrate_inpt_flg()) {
					dr.setNumberNE(_$schd_ptax_xrate, dr.ptax_xrate());
				}
				dr.src_xrate(dr.xrate());
				dr.src_ptax_xrate(dr.ptax_xrate());
			});
		}
		protected void setHdrReadOnly(MCList<RsltR> down) {
			//初期表示時のグループ内の1行目のみヘッダを編集可能とする。
			//サーバで、受領I/Vでソートされている前提の実装。
			MCList<RsltR> ivTgt = down.createInstance();
			down.forEach(r -> {
				if (isNull(r.rcpt_iv_mng_no())) {
				}
				else {
					ivTgt.add(r);
				}
			});

			
			//受領I/V単位
			setHdrReadOnlyFlg(ivTgt, RsltR.$rcpt_iv_mng_no);
			
		}
		
		
		@Override
		protected void show() {
			super.show();
			setOrgAmt();
		}
	}
	

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
	}
	@Override
	protected List<String> getNotInheritCols(String type,
			MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			l.add(RsltR.$purc_act_no);
			l.add(RsltR.$purc_act_seq);
			l.add(RsltR.$abort_flg);

		}
		return l;
	}	
	/**
	 * [MS_MSBDL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Srch01Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0130_Srch01Caller(P p, B b) {
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
		
		/**
		 * チェック処理を行います
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(cmnChkCnd());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchedStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MS_MSBDL0130_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0130_Srch02Caller<P extends MSBDP_PurcActListReg, B extends MS_MSBDL0130_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0130_Srch02Caller(P p, B b) {
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
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().expt_unplan_flg(
					isSrch2ExptUnplan()
					);
		}
		
		/**
		 * チェック処理を行います
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(cmnChkCnd());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchedStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			MCList<RsltR> d = bridge.down0();
			setDtlPegNo(d);
			setHdrReadOnly(d);
			setCanAcDt(d);
			setBefValue(d);
		}
		
		protected void setBefValue(MCList<RsltR> down) {
			down.forEach(dr -> {
				dr.bef_abort_flg(dr.abort_flg());
				dr.src_xrate(dr.xrate());
				dr.src_ptax_xrate(dr.ptax_xrate());
			});
		}
		
		protected void setHdrReadOnly(MCList<RsltR> down) {
			//初期表示時のグループ内の1行目のみヘッダを編集可能とする。
			//サーバで、受領I/V、仕入実績ＮＯ、表示順でソートされている前提の実装。
			MCList<RsltR> ivTgt = down.createInstance();
			MCList<RsltR> otherTgt = down.createInstance();
			down.forEach(r -> {
				if (isNull(r.rcpt_iv_mng_no())) {
					otherTgt.add(r);
				}
				else {
					ivTgt.add(r);
				}
			});

			
			//受領I/V単位
			setHdrReadOnlyFlg(ivTgt, RsltR.$rcpt_iv_mng_no, RsltR.$rcpt_iv_no);
			
			//仕入実績単位
			setHdrReadOnlyFlg(otherTgt, RsltR.$purc_act_no);
		}
		@Override
		protected void show() {
			super.show();
			copyAmtData();
			setOrgAmt();
		}
		protected void copyAmtData() {
			for(RsltR r :exceptDeleteAndEmpty(getRsltL())) {
				r.db_trd_unit_cd(r.trd_unit_cd());
				r.db_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.db_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.db_trd_unit_dec_place(r.trd_unit_dec_place());
				r.db_trd_unit_rnd_typ(r.trd_unit_rnd_typ());
				r.db_trd_unit_qty(r.trd_unit_qty());
				r.db_trd_cur_amt(r.trd_cur_amt());
				r.db_trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
				r.db_trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt());
				r.db_trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri());
				r.db_trd_cur_proc_amt(r.trd_cur_proc_amt());
				r.db_trd_cur_proc_upri(r.trd_cur_proc_upri());
				r.db_trd_cur_tax_amt(r.trd_cur_tax_amt());
				r.db_trd_cur_upri(r.trd_cur_upri());
				r.db_wtax_rate(r.wtax_rate());
				r.db_tax_rate(r.tax_rate());
				r.db_inc_tax_flg(r.inc_tax_flg());
			}
		}
	}


	protected void setDtlPegNo(MCList<RsltR> down) {
		int i = 0;
		for (RsltR dr : down) {
			dr.peg_no(i++);
		}
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD.isSelected()) {
			callMS_MSBDL0130_Srch01();
		}
		else if (Cnd_ope_SRCH_ACT.isSelected() ||
				Cnd_ope_UPD.isSelected() ||
				Cnd_ope_DEL.isSelected()) {
			callMS_MSBDL0130_Srch02();
		}
		else if (Cnd_ope_INS.isSelected()){
			callMS_MSBDL0130_Srch03();
		}
	}
	
	protected boolean isSrch2ExptUnplan() {
		if (Cnd_ope_SRCH_ACT.isSelected()) {
			return false;
		}
		return true;
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD.isSelected()) {
			createMS_MSBDL0130_Srch01().execDL();
		}
		else if (Cnd_ope_SRCH_ACT.isSelected() ||
				Cnd_ope_UPD.isSelected() ||
				Cnd_ope_DEL.isSelected()) {
			createMS_MSBDL0130_Srch02().execDL();
		}
		else if (Cnd_ope_INS.isSelected()){
			createMS_MSBDL0130_Srch03().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP2000]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2000(MCEventInfo info) {
		openMSBE2000(info);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBDP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0140(MCEventInfo info) {
		openMSBD0140(info);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBDP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0150(MCEventInfo info) {
		openMSBD0150(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0160(MCEventInfo info) {
		openMSBD0160(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0180]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0180(MCEventInfo info) {
		openMSBD0180(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1360]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1360(MCEventInfo info) {
		openMSBBP1360(info);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_purc_dt);
		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_purc_dt);
		
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd, columnRslt_xrate_cd, columnRslt_purc_dt, true, columnRslt_xrate_inpt_flg, true);
		Rslt_prax_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_ptax_cur_cd, columnRslt_xrate_cd, columnRslt_purc_dt, true, columnRslt_ptax_xrate_inpt_flg, true);

		Rslt_itm_p_PPanel.setRelateBeans(columnRslt_sundry_itm_flg);

		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Rslt_ver_no_p_PPanel.setRelateBeans(Rslt_itm_p_PPanel.columnItm_itm_cd, 
					Rslt_itm_p_PPanel.columnItm_itm_sub1, 
					Rslt_itm_p_PPanel.columnItm_itm_sub2,
					Rslt_itm_p_PPanel.columnItm_itm_sub3, 
					null, columnRslt_ver_flg, columnRslt_crt_lot_flg);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(Rslt_itm_p_PPanel.columnItm_itm_cd, 
				Rslt_itm_p_PPanel.columnItm_itm_sub1, 
				Rslt_itm_p_PPanel.columnItm_itm_sub2, 
				Rslt_itm_p_PPanel.columnItm_itm_sub3,
				columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place,
				columnRslt_trd_unit_rnd_typ, 
				columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, 
				columnRslt_base_unit_cd);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(
				columnRslt_base_unit_cd, columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ
				, columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);
		Rslt_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Rslt_trd_upri_amt_p_PPanel.setRelateBeans(
				columnRslt_trd_cur_cd, columnRslt_sppl_cd, 
				columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				columnRslt_trd_unit_cd,
				columnRslt_trd_unit_qty, columnRslt_trd_cur_amt_dec_place, columnRslt_trd_cur_upri_dec_place, 
				columnRslt_purc_amt_rnd_typ, columnRslt_purc_tax_rnd_typ, 
				columnRslt_purc_upri_cng_flg, columnRslt_itm_purc_upri_cng_flg, columnRslt_dscnt_itm_flg,
				columnRslt_purc_schd_no,
				columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty,
				columnRslt_src_trd_unit_conv_base_qty,
				columnRslt_src_trd_unit_conv_qty,
				columnRslt_base_unit_dec_place,
				columnRslt_base_unit_rnd_typ);
		
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place, columnRslt_trd_unit_qty, 
					columnRslt_trd_cur_proc_upri, columnRslt_trd_unit_rnd_typ, null);
		
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place,columnRslt_trd_unit_qty, 
				columnRslt_trd_cur_onr_prov_upri, columnRslt_trd_unit_rnd_typ, null);
		// 基準通貨単価・金額・税込金額・値引額
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place, columnRslt_trd_cur_upri, columnRslt_xrate);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_tax_amt, columnRslt_xrate);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_inc_tax_amt, columnRslt_xrate);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_dscnt_amt, columnRslt_xrate);
		// 基準通貨加工単価・金額
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place, columnRslt_trd_cur_proc_upri,
				columnRslt_xrate);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_proc_amt,
				columnRslt_xrate);
		// 基準通貨有償支給単価・金額
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place, columnRslt_trd_cur_onr_prov_upri,
				columnRslt_xrate);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_onr_prov_amt,
				columnRslt_xrate);

		// 納税通貨単価・金額・税込金額・値引額
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_upri_dec_place, columnRslt_trd_cur_upri,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_amt,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_tax_amt,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_inc_tax_amt,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_dscnt_amt,
				columnRslt_ptax_xrate);
		// 納税通貨加工単価・金額
		Rslt_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_upri_dec_place, columnRslt_trd_cur_proc_upri,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_proc_amt,
				columnRslt_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Rslt_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_upri_dec_place, columnRslt_trd_cur_onr_prov_upri,
				columnRslt_ptax_xrate);
		Rslt_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_onr_prov_amt,
				columnRslt_ptax_xrate);
		
		// 源泉税額
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_base_cur_amt, columnRslt_wtax_rate, true);
		
		Rslt_po_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_arr_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_purc_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_purc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_accpt_dfct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_re_arr_qty_p_PPanel.setRelateBeans(Rslt_itm_p_PPanel.columnItm_itm_cd, 
				Rslt_itm_p_PPanel.columnItm_itm_sub1, 
				Rslt_itm_p_PPanel.columnItm_itm_sub2, 
				Rslt_itm_p_PPanel.columnItm_itm_sub3,
				columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place,
				columnRslt_trd_unit_rnd_typ, 
				columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, 
				columnRslt_base_unit_cd);
	
		Rslt_base_unit_qty_bef_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		// 取引先分類
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		//　納入場所
		Rslt_sppl_addr_p_PPanel.setRelateBeans(columnRslt_sppl_cd, columnRslt_sppl_nm);
		// 配送先
		Rslt_tdlv_p_PPanel.setTdlvMode(true);
		
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3, 
				columnRslt_lot_mng_typ,	columnRslt_lot_no_typ, columnRslt_sublot_mng_typ, columnRslt_sublot_no_typ, 
				true, columnRslt_asset_mng_typ, columnRslt_xpns_purc_flg);
		//　購買部門
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt, columnRslt_purc_schd_no);
	
		
		// 棚・ライン
		Rslt_re_arr_str_ln_p_PPanel.setRelateBeans(columnRslt_re_arr_loc_cd, columnRslt_re_arr_str_ln_tgt_flg);
		Rslt_in_to_str_ln_p_PPanel.setRelateBeans(columnRslt_in_to_loc_cd, columnRslt_in_to_str_ln_tgt_flg);
	

		Rslt_purc_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty,
				Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_purc_cont_fctr_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_purc_cont_qty,
				columnRslt_cont_fctr_dec_place);
		
		Rslt_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty,
				Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);

		Rslt_bditm_p_PPanel.setRelateBeans(
				columnRslt_asset_mng_typ,
				columnRslt_bd_lot_mng_typ, columnRslt_bd_sublot_mng_typ, columnRslt_bd_sno1_mng_typ, 
				columnRslt_bd_sno2_mng_typ, columnRslt_bd_sno3_mng_typ, columnRslt_bd_sno4_mng_typ);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(columnRslt_in_to_loc_cd);
	}
	
	// -----------------------------------------------
	// チェック処理
	// -----------------------------------------------
	protected MCMessageList cmnChkCnd() {
		MCMessageList msgList = new MCMessageList();
		msgList.addAll(checkBeforeAfter(Cnd_purc_schd_dt_fr, Cnd_purc_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_purc_dt_fr, Cnd_purc_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkAtLeastOne(ArrPtnTypPanel));
		msgList.addAll(checkAtLeastOne(ArrStsPanel));
		msgList.addAll(checkAtLeastOne(PurcStsPanel));
		msgList.addAll(checkAtLeastOne(SpplIvStsPanel));
		msgList.addAll(checkAtLeastOne(EdiStsPanel));
		return msgList;
	}
	
	protected MCMessageList cmnChkRslt(RsltR dtlR) {
		MCMessageList msgL = new MCMessageList();
				
		// VMI・無償受給意外の場合単価は必須
		if (!MAC_PURC_ID_TYP.isVMI(dtlR.purc_id_typ()) && !MAC_PURC_ID_TYP.isFFR_RCV(dtlR.purc_id_typ()) ) {
			msgL.addAll(checkReq(dtlR.getGUIIndex(), columnRslt_trd_cur_upri));
		}
		msgL.addAll(checkTooManyInputs(dtlR, columnRslt_accpt_dfct_flg, columnRslt_ncv_flg));
		msgL.addAll(checkPositive(dtlR, columnRslt_trd_unit_qty));
		
		return msgL;
	}

	// -----------------------------------------------
	// 画面遷移(入荷実績一覧登録)
	// -----------------------------------------------
	
	protected void openMSBE2000 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2000");
		aso.putCnd(crtOpenMSBEP2000CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP2000.CndR crtOpenMSBEP2000CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg p = (mcframe.clientMSBE.MSBEP2000.MSBEP_ArrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();
		to.arr_act_no(r.arr_act_no());
		String ope = null;
		ope = p.Cnd_ope_REF.getActionCommand();
		to.ope(ope);
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(仕入実績登録)
	// -----------------------------------------------
	
	protected void openMSBD0140 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0140");
		aso.putCnd(crtOpenMSBDP0140CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0140.CndR crtOpenMSBDP0140CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg p = (mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0140.CndR to = mcframe.clientMSBD.MSBDP0140.CndR.create();
		if (isSchdSrch()) {
			to.srch_tgt_no(r.po_no());
		}
		else {
			to.srch_tgt_no(r.purc_act_no());
			
		}
		String ope = null;
		if (Cnd_ope_SRCH_ACT.isSelected()) {
			ope = p.Cnd_ope_REF.getActionCommand();
		}
		else if (Cnd_ope_INS.isSelected()) {
			ope = p.Cnd_ope_INS.getActionCommand();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			ope = p.Cnd_ope_UPD.getActionCommand();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			ope = p.Cnd_ope_DEL.getActionCommand();
		}
		else {
			// 予定参照種別選択時
			ope = p.Cnd_ope_INS.getActionCommand();
		}
		to.ope(ope);
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(仕入返品予定登録)
	// -----------------------------------------------
	
	protected void openMSBD0150 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0150");
		aso.putCnd(crtOpenMSBDP0150CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0150.CndR crtOpenMSBDP0150CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg p = (mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0150.CndR to = mcframe.clientMSBD.MSBDP0150.CndR.create();
		if (Cnd_mode_DTL.isSelected()) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO.name());
			to.srch_tgt_no(r.purc_act_d_no());
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
		}
		String ope = null;
		ope = p.Cnd_ope_INS.getActionCommand();
		to.ope(ope);
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(仕入返品実績登録)
	// -----------------------------------------------
	
	protected void openMSBD0160 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0160");
		aso.putCnd(crtOpenMSBDP0160CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0160.CndR crtOpenMSBDP0160CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg p = (mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0160.CndR to = mcframe.clientMSBD.MSBDP0160.CndR.create();
		if (Cnd_mode_DTL.isSelected()) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO.name());
			to.srch_tgt_no(r.purc_act_d_no());
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
		}
		String ope = null;
		ope = p.Cnd_ope_INS.getActionCommand();
		to.ope(ope);
		return to;
	}	
	// -----------------------------------------------
	// 画面遷移(仕入値引登録)
	// -----------------------------------------------
	
	protected void openMSBD0180 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0180");
		aso.putCnd(crtOpenMSBDP0180CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0180.CndR crtOpenMSBDP0180CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg p = (mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0180.CndR to = mcframe.clientMSBD.MSBDP0180.CndR.create();
		to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
		to.srch_tgt_no(r.purc_act_no());
		String ope = null;
		ope = p.Cnd_ope_INS.getActionCommand();
		to.ope(ope);
		return to;
	}	
	// -----------------------------------------------
	// 画面遷移(仕入直送売上登録)
	// -----------------------------------------------

	protected void openMSBBP1360 (MCEventInfo info) {
		RsltR dtlR = RsltTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1360");
		aso.putCnd(crtOpenMSBBP1360CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();	
	}
	protected mcframe.clientMSBB.MSBBP1360.CndR crtOpenMSBBP1360CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg p = (mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1360.CndR to = mcframe.clientMSBB.MSBBP1360.CndR.create();
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
		to.srch_tgt_no(r.slo_no());
		String ope = null;
		ope = p.Cnd_ope_INS.getActionCommand();
		to.ope(ope);
		return to;
	}
	
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		
		// 操作種別によるモードの設定
		setSrchStatus();
		// 操作種別によるボタンの入力制御設定
		setBtnModeByOpe();
		// 初期値の設定
		setValueEx(BulkSet_purc_dt, getToday());
		setValueEx(BulkSet_pay_basis_dt, getToday());
		initFlg();
	}

	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnRslt_trd_unit_qty.addAllListener(this);
		columnRslt_ptax_cur_tax_amt.addLCListener(this);
		columnRslt_base_cur_tax_amt.addLCListener(this);
		columnRslt_purc_cont_qty.addLCListener(this);
		columnRslt_re_arr_rqst_dt.addNCListener(this);
		columnRslt_trd_cur_dscnt_amt.addLCListener(this);
		columnRslt_trd_cur_upri.addLCListener(this);
		columnRslt_tax_cd.addLCListener(this);
		columnRslt_trd_cur_tax_amt.addLCListener(this);
		columnRslt_trd_unit_cd.removeLCListener(this);
		columnRslt_trd_unit_cd.addLCListener(this);
		columnRslt_lot_no.addLCListener(this);
		columnRslt_sublot_no.addLCListener(this);
		columnRslt_purc_dpt_cd.addLCListener(this);
		columnRslt_trd_cur_amt.addLCListener(this);
		columnRslt_trd_cur_proc_amt.addLCListener(this);
		columnRslt_trd_cur_onr_prov_amt.addLCListener(this);
		columnRslt_trd_cur_proc_upri.addLCListener(this);
		columnRslt_trd_cur_onr_prov_upri.addLCListener(this);
		BulkSet_ac_dt.addNCListener(this);
		//複数行でヘッダを同期するために埋込画面にリスナを設定
		for(MCColumnConfig c : getHdrEditableColumn() ) {
			if (c.getRootPanel() != this) {
				c.addLCListener(this);
			}
		}
		
	}
	
	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		
		//埋込画面のイベントを先に実行する様に変更する
		//同一カラムの値を変更する処理よりも前に埋め込み画面の処理を実行させる必要がある
		for(MCColumnConfig c : getRevEvent()){
			MCLCListener[] ls = c.getLCListeners();
			for (MCLCListener l : ls) {
				c.removeLCListener(l);
			}
			for (int i = ls.length-1 ; i >= 0 ; i-- ) {
				c.addLCListener(ls[i]);
			}
		}
	}
	
	private MCColumnConfig[] _revEventCols = null;
	/**
	 * 部品のイベントとベース画面のイベントの呼び出し順を逆転する対象を返す
	 */
	protected MCColumnConfig[] getRevEvent() {
		if (_revEventCols == null) {
			_revEventCols = new MCColumnConfig[]{columnRslt_purc_dt};
		}
		return _revEventCols;
		
	}
	
	// -----------------------------------------------
	// VCEvent
	// -----------------------------------------------
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}
	@Override
	public boolean doCnd_mode_VC(MCEventInfo info) {
		if (!super.doCnd_mode_VC(info)) {
			return false;
		}
		if (isChanged()) {
			return confirmRegDataClear();
		}
		return true;
	}
	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
	}
	/**
	 * NCイベント処理
	 */
	protected void doCnd_ope_NCSub() {
		// 一覧クリア
		clearContainers(getRsltL());
		// 操作種別によるモードの設定
		setSrchStatus();
		// 操作種別によるボタンの入力制御設定
		setBtnModeByOpe();
		initFlg();
		// 発注未承認含むチェックボックスのクリア
		if (!Cnd_ope_INS.isSelected() && !Cnd_ope_SRCH_SCHD.isSelected()) {
			getCndR().incl_not_aprv_flg(false);
		}
	}
	
	protected void initFlg() {

		if (Cnd_ope_INS.isSelected()) {
			initCndFlgOn(Cnd_purc_cmpl_flg);
			setValueEx(Cnd_arr_done_not_insp_fin_flg, true);
			setValueEx(Cnd_dfct_insp_flg, false);
		}
		else {
			initCndFlgOn();
			setValueEx(Cnd_arr_done_not_insp_fin_flg, false);
			setValueEx(Cnd_dfct_insp_flg, false);
		}
		if (Cnd_ope_SRCH_ACT.isSelected() || Cnd_ope_SRCH_SCHD.isSelected()) {
			setValueEx(Cnd_iv_flg, true);
		}
		else {
			setValueEx(Cnd_iv_flg, false);
		}
		setValueEx(Cnd_incl_temp_ap_flg, false);
	}
	
	protected void setEnableToNull(MCRowBeans b) {
		if (((MCModeBeans)b).getModeInfo().getStatus() != MCMode.ENABLE_STATUS) {
			return;
		}
		if (b instanceof MCCheckBox) {
			setValueEx(b, false);
		}
		else {
			setValueEx(b, null);
		}
	}
	
	/**
	 * ヘッダ検索で使用しない検索条件をクリアします。
	 */
	protected void clearNotActHdrCond() {
		for(MCRowBeans b : getNotActHdrCond()) {
			setEnableToNull(b);
		}
	}
	
	protected MCRowBeans[] _notActHdrConds = null;
	protected MCRowBeans[] getNotActHdrCond() {
		if (_notActHdrConds == null) {
			ArrayList<MCRowBeans> l = new ArrayList<>();
			l.addAll(java.util.Arrays.asList(MCBeansUtil.getAllComponents(MCRowBeans.class, Cnd_itm_typ_p_PPanel)));
			l.addAll(java.util.Arrays.asList(MCBeansUtil.getAllComponents(MCRowBeans.class, Cnd_itm_p_PPanel)));
			l.addAll(java.util.Arrays.asList(MCBeansUtil.getAllComponents(MCRowBeans.class, Cnd_ver_no_p_PPanel)));
			l.add(Cnd_sppl_itm_cd);
			l.add(Cnd_sppl_itm_nm);
			l.add(Cnd_lot_no);
			l.add(Cnd_sublot_no);
			l.add(Cnd_bp_lot_no);
			l.addAll(java.util.Arrays.asList(MCBeansUtil.getAllComponents(MCRowBeans.class, Cnd_sno_p_PPanel)));
			l.add(Cnd_maker_cd);
			l.add(Cnd_ap_dpt_cd);
			l.add(Cnd_po_schd_no);
			l.add(Cnd_po_d_no);
			l.add(Cnd_rcpt_iv_d_no);
			l.add(Cnd_purc_act_d_no);
			l.add(Cnd_mfg_inst_no);
			l.add(Cnd_purc_id_typ);
			l.add(Cnd_drct_dlv_typ);
			l.add(Cnd_site_cd);
			l.add(Cnd_in_to_loc_wg_cd);
			l.add(Cnd_in_to_loc_cd);
			l.add(Cnd_str_ln_cd);
			l.add(Cnd_purc_prgrs_fr);
			l.add(Cnd_purc_prgrs_to);
			l.add(Cnd_cont_abort_flg);
			l.add(Cnd_s_sub_char1);
			l.add(Cnd_s_sub_char2);
			l.add(Cnd_s_sub_char3);
			l.add(Cnd_trd_d_rmrks);
			l.add(Cnd_intr_d_rmrks);
			l.add(Cnd_dtl_sub_char1);
			l.add(Cnd_dtl_sub_char2);
			l.add(Cnd_dtl_sub_char3);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9);
			l.add(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10);
			_notActHdrConds = l.toArray(new MCRowBeans[l.size()]);
		}
		
		return _notActHdrConds;
	}
	

	/**
	 * 明細検索で使用しない検索条件をクリアします。
	 */
	protected void clearNotActDtlCond() {
		for(MCRowBeans b : getNotActDtlCond()) {
			setEnableToNull(b);
		}
	}
	
	protected MCRowBeans[] _notActDtlConds = null;
	protected MCRowBeans[] getNotActDtlCond() {
		if (_notActDtlConds == null) {
			_notActDtlConds = new MCRowBeans[]{
					Cnd_s_sub_char1,
					Cnd_s_sub_char2,
					Cnd_s_sub_char3

			};
		}
		
		return _notActDtlConds;
	}

	/**
	 * 予定検索(登録)で使用しない検索条件をクリアします。
	 */
	protected void clearNotSchdCondForIns() {
		for(MCRowBeans b : getNotSchdCond()) {
			setEnableToNull(b);
		}
		setEnableToNull(Cnd_cont_abort_flg);
	}
	/**
	 * 予定検索(参照)で使用しない検索条件をクリアします。
	 */
	protected void clearNotSchdCond() {
		for(MCRowBeans b : getNotSchdCond()) {
			setEnableToNull(b);
		}
	}
	
	protected MCRowBeans[] _notSchdConds = null;
	protected MCRowBeans[] getNotSchdCond() {
		if (_notSchdConds == null) {
			_notSchdConds = new MCRowBeans[]{
					Cnd_purc_dt_fr,
					Cnd_purc_dt_to,
					Cnd_ac_dt_fr,
					Cnd_ac_dt_to,
					Cnd_purc_act_no,
					Cnd_purc_act_d_no,
					Cnd_mfg_inst_no,
					Cnd_trd_rmrks,
					Cnd_intr_rmrks,
					Cnd_trd_d_rmrks,
					Cnd_intr_d_rmrks,
					Cnd_sub_char1,
					Cnd_sub_char2,
					Cnd_sub_char3,
					Cnd_dtl_sub_char1,
					Cnd_dtl_sub_char2,
					Cnd_dtl_sub_char3

			};
		}
		
		return _notSchdConds;
	}

	/**
	 * 参照検索でのみ使用する検索条件をクリアします。
	 */
	protected void clearSrchCond() {
		for(MCRowBeans b : getSrchCond()) {
			setEnableToNull(b);
		}
	}
	
	protected MCRowBeans[] _srchConds = null;
	protected MCRowBeans[] getSrchCond() {
		if (_srchConds == null) {
			_srchConds = new MCRowBeans[]{
					Cnd_rcpt_iv_no,
					Cnd_rcpt_iv_d_no
			};
		}
		
		return _srchConds;
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		
		// 一括設定枠の項目の値を設定する
		if (dtlR.check()) {
			bulkSet(dtlR, true);
		}
		
		// 同一I/V管理NOのフラグを同期する
		String ivMngNo = dtlR.rcpt_iv_mng_no();
		if (!isNull(ivMngNo)) {
			MCList<RsltR> l = 
					getRsltL().subList(RsltR.$rcpt_iv_mng_no, ivMngNo);
			l.forEach(r -> {
				setValueEx(columnRslt_check, r.getGUIIndex(), dtlR.check());
				Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
			});
		}
	}
	
	@Override
	public void doRslt_abort_flg_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		// 仕入予定単位にフラグ制御する
		getRsltL().forEach(rr -> {
			if (rr != r && isSame(rr.purc_schd_no(), r.purc_schd_no())) {
				setValueEx(columnRslt_abort_flg, rr.getGUIIndex(), r.abort_flg());
			}
		});
	}

	@Override
	public void doRslt_sync_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_sync_flg_NC(info);
		int i = info.getEventIndex();
		RsltR dtlR = getRsltL().get(i);
		
		if (!dtlR.sync_flg() && isSame(dtlR.arr_qty(), MCNumber.ZERO)) {
			setValueEx(columnRslt_crt_lot_flg, i, false);
			setValueEx(columnRslt_lot_no, i, null);
			setValueEx(columnRslt_sublot_no, i, null);
		}
		
		if (dtlR.ncv_flg() || !MSC_ARR_PTN_TYP.isNRML(getArrPtnTyp(dtlR))) {
			setValueEx(columnRslt_accpt_dfct_flg, i, false);
		}
		if (!dtlR.sync_flg() && isNull(dtlR.gd_cd())) {
		}
		boolean oldVal = (boolean) info.getOldValue();		
		boolean newVal = (boolean) info.getNewValue();
		
		if (oldVal && !newVal) {
			// チェックをＯＮからＯＦＦに変更した場合
			setValueEx(columnRslt_gd_cd, dtlR.getGUIIndex(), null);
		}
		else {
			// チェックをＯＦＦからＯＮに変更した場合
			if (!isNull(dtlR.tmp_gd_cd())) {
				// 同時計上しない予定だったが、同時計上で仕入する場合
				setValueEx(columnRslt_gd_cd, dtlR.getGUIIndex(), dtlR.tmp_gd_cd());
			}
			else {
				setValueEx(columnRslt_gd_cd, dtlR.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
			}
		}
	}
	
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);
		setSrchStatus();
		// 一覧クリア
		clearContainers(getRsltL());
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnRslt_ptax_cur_tax_amt) {
			doRslt_ptax_cur_tax_amt_LC(info);
		}
		
		if (lc == columnRslt_base_cur_tax_amt) {
			doRslt_base_cur_tax_amt_LC(info);
		}
		
		//イベント情報はカラムで1つのため、同一行のイベントを全て終わらせてから実行しないと、後続のイベントのイベント情報が正しくならない。
		//そのため、イベントの最後に同一カラムの値を設定する処理を実行する。
		//計上日埋込画面で設定される仕入日のイベントは、同一行の値を変更するため、
		//この仕入日イベントよりも先に実行するようにしなければならない(参照：beansAttrInit)。
		if (isHdrEditableColumn(lc)) {
			RsltR dtlR = getRsltL().get(info.getEventIndex());
			if (!dtlR.hdr_readonly_flg()) {
				expandHdrValue(dtlR, (MCColumnConfig) lc);
			}
		}
		
		if (lc == columnRslt_trd_cur_dscnt_amt) {
			doRslt_trd_cur_dscnt_amt_LC(info);
		}
		if(lc == columnRslt_trd_cur_upri){
			doRslt_trd_cur_upri_LC(info);
		}
		if(lc == columnRslt_trd_unit_qty){
			doRslt_trd_unit_qty_LC(info);
		}
		if (lc == columnRslt_lot_no 
				|| lc == columnRslt_sublot_no) {
			doRslt_lot_no(info);
		}
		if (lc == columnRslt_tax_cd) {
			doRslt_tax_cd_LC(info);
		}
		if (lc == columnRslt_trd_cur_tax_amt) {
			doRslt_trd_cur_tax_amt_LC(info);
		}
		if (lc == columnRslt_trd_cur_proc_amt) {
			doRslt_trd_cur_proc_amt_LC(info);
		}
		if (lc == columnRslt_trd_cur_onr_prov_amt) {
			doRslt_trd_cur_onr_prov_amt_LC(info);
		}
		if (lc == columnRslt_trd_cur_amt) {
			doRslt_trd_cur_amt_LC(info);
		}
		if (lc == columnRslt_trd_cur_proc_upri) {
			doRslt_trd_cur_proc_upri_LC(info);
		}
		if (lc == columnRslt_trd_cur_onr_prov_upri) {
			doRslt_trd_cur_onr_prov_upri_LC(info);
		}
		if (lc == columnRslt_purc_dpt_cd) {
			doRslt_purc_dpt_cd_LC(info);
		}
	}
	
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setApDptCd(r); 
	}
	
	public void doRslt_trd_cur_upri_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		clearDscntAmt(rsltR);
		if(rsltR.outsrc_flg()) {
			if(MAC_OUTSRC_UPRI_TYP.isPROC(rsltR.outsrc_upri_typ())) {
				rsltR.trd_cur_proc_upri(rsltR.trd_cur_upri());
				rsltR.trd_cur_proc_amt(rsltR.trd_cur_amt());
				setBaseCurAmt(rsltR);
				setPtaxCurAmt(rsltR);
			}
			if(rsltR.repurc_obli_flg()) {
				setRepurcObliTax(rsltR);
			}
			else {
				setOutsrcAmt(rsltR);
			}
		}
	}

	public void doRslt_lot_no(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.ver_flg()) {
			if (!r.crt_lot_flg()) {
				setValueEx(columnRslt_ver_no, r.getGUIIndex(), r.org_ver_no());
			}
		}
	}
	/**
	 * 税CD変更イベント
	 * @param info
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setValueForMoneyCols(r);
		if(r.repurc_obli_flg()) {
			setRepurcObliTax(r);
		}
		else {
			setOutsrcAmt(r);
		}
	}
	/**
	 * 税額変更イベント
	 * @param info
	 */
	public void doRslt_trd_cur_tax_amt_LC(MCEventInfo info) {
		if (RsltTable.getEditingColumnConfig() == columnRslt_trd_cur_tax_amt) {
			RsltR dtlR = getRsltL().get(info.getEventIndex());
			// 埋め込み画面側のイベント処理で、税額から先に値がセットされ、値引額側がエラーにならないので、税額にイベントを実装
			chkProcAmtMinus(dtlR);
			// 埋め込み画面側のイベントで、数量の変更後に税額が上書きされてしまうので、税額のイベントで値を変えるようにする。
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(dtlR);
			}
		}
	}
	/**
	 * 値引額の値により、加工金額がマイナスとならないようにチェックする。
	 * 加工金額を計算して設定することで、マイナス値を設定した際にエラーを発生させる。
	 * 
	 * @param dtlR
	 */
	protected void chkProcAmtMinus(RsltR rsltR) {
		if(!rsltR.outsrc_flg() || isNull(rsltR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = getAmt(rsltR.trd_cur_proc_upri(),
				rsltR.trd_unit_qty(),
				rsltR.trd_cur_amt_dec_place(),
				rsltR.purc_amt_rnd_typ(),
				rsltR.trd_cur_dscnt_amt());
		setValueEx(columnRslt_trd_cur_proc_amt, rsltR.getGUIIndex(), procAmt);
	}
	@Override
	public MCList getRslt_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row,
			MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.crt_lot_flg()) {
			// ロット作成時は工場・物流倉庫で絞り込む
			row.addStringColumn(ItmVerCols.$i_site_cd, r.site_cd());
		}
		return super.getRslt_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
	}
	protected void clearDscntAmt(RsltR rsltR) {
		if (isNull(rsltR.trd_cur_upri()) || rsltR.trd_cur_upri().isZero()) {
			columnRslt_trd_cur_dscnt_amt.setValue(rsltR.getGUIIndex(), null);
		}
	}

	protected boolean getDefCrtLotFlg(RsltR r) {
		if (isNull(r.itm_cd())) {
			return false;
		}
		if (!existsArr(r) && !r.sync_flg()) {
			return false;
		}
		return MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ()) && isNull(r.lot_no());
	}

	protected boolean existsArr(RsltR r) {
		return !isSame(r.arr_qty(), MCNumber.ZERO);
	}
	@Override
	public void doBulkSet_purc_dt_NC(MCEventInfo info) {
		super.doBulkSet_purc_dt_NC(info);
		RsltTable.getViewRows().forEach(r -> {
			if (r.check()) {
				setValueEx(columnRslt_purc_dt, r.getGUIIndex(), getBulkSetR().purc_dt());
			}
		});
	}
	protected void doBulkSet_ac_dt_NC(MCEventInfo info) {
		RsltTable.getViewRows().forEach(r -> {
			if (r.check()) {
				r.ac_dt(getBulkSetR().ac_dt());
			}
		});
	}
	@Override
	public void doBulkSet_pay_basis_dt_NC(MCEventInfo info) {
		super.doBulkSet_pay_basis_dt_NC(info);
		RsltTable.getViewRows().forEach(r -> {
			if (r.check()) {
				r.pay_basis_dt(getBulkSetR().pay_basis_dt());
			}
		});
	}
	
	@Override
	public void doRslt_trd_cd_LC(MCEventInfo info) {
		super.doRslt_trd_cd_LC(info);
	}
	
	@Override
	public void doRslt_accpt_dfct_flg_NC(MCEventInfo info) {
		super.doRslt_accpt_dfct_flg_NC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		int i = info.getEventIndex();
		if (!dtlR.accpt_dfct_flg()) {
			setValueEx(columnRslt_re_arr_flg, i, false);
		}
		else {
			setValueEx(columnRslt_pay_crryovr_times, i, null);
			Rslt_bditm_p_PPanel.clearBdItem(i);
		}
		initUpriAmt(dtlR);
	}
	
	@Override
	public void doRslt_re_arr_flg_NC(MCEventInfo info) {
		super.doRslt_re_arr_flg_NC(info);
		int i = info.getEventIndex();

		RsltR r = getRsltL().get(i);
		if (r.re_arr_flg()) {
			setValueEx(columnRslt_trd_unit_re_arr_qty, i, r.trd_unit_qty());
			setValueEx(columnRslt_re_arr_loc_cd, i, r.in_to_loc_cd());
			setValueEx(columnRslt_re_arr_str_ln_cd, i, r.in_to_str_ln_cd());
			setValueEx(columnRslt_re_arr_str_ln_cd_none_flg, i, r.in_to_str_ln_cd_none_flg());
		}
		else {
			for (MCColumnConfig c : RsltTable.getViewColumnConfigs()) {
				if (isReArrColumn(c)) {
					setValueEx(c, i, null);
				}
			}
		}

	}
	
	@Override
	public void doRslt_purc_dt_LC(MCEventInfo info) {
		super.doRslt_purc_dt_LC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		setDefaultTaxCd(dtlR);
		setWtaxRate(dtlR);
	}

	protected void doRslt_ptax_cur_tax_amt_LC(MCEventInfo info) {
		
		if (RsltTable.getEditingColumnConfig() != columnRslt_ptax_cur_tax_amt) {
			return;
		}
		
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		if (isNull(dtlR.ptax_cur_amt())
				|| isNull(dtlR.ptax_cur_inc_tax_amt())) {
			return;
		}
		MCNumber taxAmt = dtlR.ptax_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(納税通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を納税通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.ptax_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.ptax_cur_amt(exTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxPtaxXRate(dtlR, taxAmt, dtlR.ptax_cur_amt());
				dtlR.trd_cur_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
			if(dtlR.outsrc_flg()) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), dtlR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.ptax_cur_amt().add(taxAmt);
			dtlR.ptax_cur_inc_tax_amt(incTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxPtaxXRate(dtlR, taxAmt, dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_inc_tax_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
	}
	
	protected void doRslt_base_cur_tax_amt_LC(MCEventInfo info) {
		
		if (RsltTable.getEditingColumnConfig() != columnRslt_base_cur_tax_amt) {
			return;
		}
		
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		
		if (isNull(dtlR.base_cur_amt())
				|| isNull(dtlR.base_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.base_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額を計算する。
			// 税込金額 から手入力した税額を除いた値を金額に反映する。
			MCNumber exTaxAmt = dtlR.base_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.base_cur_amt(exTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.base_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxXRate(dtlR, taxAmt, dtlR.base_cur_amt());
				dtlR.trd_cur_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
			if(dtlR.outsrc_flg()) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), dtlR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		else {
			// 外税の場合、税込金額を計算する。
			// 税抜金額に手入力した税額を加算した値を税込金額に反映する。
			MCNumber incTaxAmt = dtlR.base_cur_amt().add(taxAmt);
			dtlR.base_cur_inc_tax_amt(incTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxXRate(dtlR, taxAmt, dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_inc_tax_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
		}
		
	}
	protected MCRow getAmtAndTaxXRate(RsltR dtlR, MCNumber baseTaxAmt, MCNumber baseAmt) {
		return 
			getAmtAndTaxCmn(
				"xrate",
				baseTaxAmt,
				baseAmt,
				dtlR.base_cur_amt_dec_place(),
				dtlR);
	}
	protected MCRow getAmtAndTaxPtaxXRate(RsltR dtlR, MCNumber baseTaxAmt, MCNumber baseAmt) {
		return
			getAmtAndTaxCmn(
				"ptax_xrate",
				baseTaxAmt,
				baseAmt,
				dtlR.ptax_cur_amt_dec_place(),
				dtlR);
	}
	protected MCRow getAmtAndTaxCmn(String xrateCol, MCNumber baseTaxAmt, MCNumber baseAmt, MCNumber baseAmtDecPlace, RsltR dtlR) {

		int hdr_peg_no = 1;
		ConvQtyAmtUtil_HdrR utlHdrR = createUtilHdr(dtlR, hdr_peg_no).get(0);

		MCNumber
			xrate = utlHdrR.getNumberNE(xrateCol),
			actXRate = utlHdrR.getNumberNE("act_" + xrateCol);
		
		// 発注時もしくは変更前の基準単位数量
		MCNumber hdrBaseUnitQty = convToBaseUnit(utlHdrR.trd_unit_qty(), utlHdrR.trd_unit_conv_base_qty(), utlHdrR.trd_unit_conv_qty(),
				utlHdrR.base_unit_dec_place(), utlHdrR.base_unit_rnd_typ());
		// 発注時もしくは変更前の、基準通貨金額もしくは納税通貨金額
		MCNumber hdrBaseTaxAmt = convToBaseCur(utlHdrR.trd_cur_tax_amt(), xrate, baseAmtDecPlace, getCo().xrate_rnd_typ());
		
		MCNumber trdAmt = MCNumber.ZERO, trdTaxAmt = MCNumber.ZERO;
		if (!isSame(dtlR.trd_cur_dscnt_amt(), utlHdrR.trd_cur_dscnt_amt())
			|| !isNull(utlHdrR.act_tax_rate())
				&& (!isSame(utlHdrR.act_tax_rate(), utlHdrR.tax_rate()) ||  !isSame(utlHdrR.act_inc_tax_flg(), utlHdrR.inc_tax_flg()))
			|| !isSame(actXRate, xrate)
			|| !isSame(hdrBaseUnitQty, dtlR.base_unit_qty())
			|| !isSame(hdrBaseTaxAmt, baseTaxAmt)) {
			
			trdAmt = baseAmt.divide(actXRate, dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())); 
			trdTaxAmt = baseTaxAmt.divide(actXRate, dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ()));
		}
		else {
			trdAmt = dtlR.inc_tax_flg() ? utlHdrR.trd_cur_amt() : utlHdrR.trd_cur_inc_tax_amt();
			trdTaxAmt = utlHdrR.trd_cur_tax_amt();
		}
		
		MCRow row = MCRow.create();
		row.setNumberNE("amt", trdAmt);
		row.setNumberNE("taxAmt" , trdTaxAmt);
		return row;
	}
	
	protected void doRslt_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		RsltR dtlR = getRsltL().get(idx);
		if (!hasCost(dtlR)) {
			// 金額表示対象でない場合、値引額は常にnullにする
			setValueEx(columnRslt_trd_cur_dscnt_amt, idx, null);
		}
		else {
			if(dtlR.outsrc_flg()) {
				if(dtlR.repurc_obli_flg()) {
					setRepurcObliTax(dtlR);
				}
				else {
					setOutsrcAmt(dtlR);
				}
			}
		}
	}
	
	protected void expandHdrValue(RsltR r, MCColumnConfig col) {
		
		MCList<RsltR> tgt = null;
		if (!isNull(r.rcpt_iv_mng_no())) {
			tgt = getRsltL().subList(rr -> 
					r.rcpt_iv_mng_no().equals(rr.rcpt_iv_mng_no()));
		}
		else if (!isNull(r.purc_act_no())){
			tgt = getRsltL().subList(rr -> 
				r.purc_act_no().equals(rr.purc_act_no()));
		}
		if (tgt != null) {
			Comparable<?> val = r.getValue(col.getBaseRowColumnName());
			tgt.forEach(tr -> {
				if (tr.getGUIIndex() != r.getGUIIndex()) {
					setValueEx(col, tr.getGUIIndex(), val);
				}
			});
			if (1 < tgt.size()) {
				setValueEx(col, r.getGUIIndex(), val);
			}
		}
	}
	
	/**
	 * 直納区分を設定します
	 * @param info
	 */
	@Override
	public void doRslt_in_to_loc_cd_LC(MCEventInfo info) {
		super.doRslt_in_to_loc_cd_LC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		clearVerNo(dtlR);
		setDrctDlvTyp(dtlR);
	}
	


	protected void doRslt_trd_unit_qty_NC(MCEventInfo info) {
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(dtlR);
		}
	}
	
	public void doRslt_trd_unit_qty_LC(mcframe.clientCore.event.MCEventInfo info) {
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		setValueForMoneyCols(dtlR);
	}
	@Override
	public void doRslt_trd_unit_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_trd_unit_cd_LC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		setValueForMoneyCols(dtlR);
	}
	@Override
	public void doRslt_purc_rsn_cd_LC(MCEventInfo info) {
		super.doRslt_purc_rsn_cd_LC(info);
		RsltR dtlR = getRsltL().get(info.getEventIndex());
		if (!dtlR.xpns_purc_flg()) {
			Rslt_bditm_p_PPanel.clearBdItem(info.getEventIndex());
		}
	}
	
	@Override
	public void doRslt_purc_id_typ_LC(MCEventInfo info) {
		super.doRslt_purc_id_typ_LC(info);
	}
	
	/**
	 * 取引通貨加工単価変更イベント
	 * @param info
	 */
	public void doRslt_trd_cur_proc_upri_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		clearDscntAmt(rsltR);
		chkProcAmtMinus(rsltR);
		MCNumber onr_prov_upri = rsltR.trd_cur_onr_prov_upri();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(rsltR.outsrc_upri_typ())) {
			onr_prov_upri = null;
		}
		MCNumber upri = getOutsrcUpri(rsltR.trd_cur_proc_upri(), onr_prov_upri);
		setValueEx(columnRslt_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 取引通貨有償支給単価変更イベント
	 * @param info
	 */
	public void doRslt_trd_cur_onr_prov_upri_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCNumber upri = getOutsrcUpri(rsltR.trd_cur_proc_upri(), rsltR.trd_cur_onr_prov_upri());
		setValueEx(columnRslt_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 取引通貨加工金額変更イベント
	 * @param info
	 */
	protected void doRslt_trd_cur_proc_amt_LC(MCEventInfo info) {
		if (RsltTable.getEditingColumnConfig() != columnRslt_trd_cur_proc_amt) {
			return;
		}
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (isNull(rsltR.trd_cur_proc_upri())
				|| (!isNull(rsltR.trd_cur_proc_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnRslt_trd_cur_proc_upri))) {
			MCNumber trdCurProcAmt = !isNull(rsltR.trd_cur_proc_amt()) ? rsltR.trd_cur_proc_amt().add(nvl(rsltR.trd_cur_dscnt_amt(), MCNumber.ZERO)) : null;
			MCNumber trdCurProcUpri = MAUCP_AmtUtil.getUpri(trdCurProcAmt, rsltR.trd_unit_qty(), rsltR.trd_cur_upri_dec_place());
			rsltR.trd_cur_proc_upri(trdCurProcUpri);
			setOutsrcUpriAndAmt(rsltR);
		}
	}
	/**
	 * 取引通貨有償支給金額変更イベント
	 * @param info
	 */
	protected void doRslt_trd_cur_onr_prov_amt_LC(MCEventInfo info) {
		if (RsltTable.getEditingColumnConfig() != columnRslt_trd_cur_onr_prov_amt) {
			return;
		}
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (isNull(rsltR.trd_cur_onr_prov_upri())
				|| (!isNull(rsltR.trd_cur_onr_prov_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnRslt_trd_cur_onr_prov_upri))) {
			MCNumber trdCurOnrProvUpri = MAUCP_AmtUtil.getUpri(rsltR.trd_cur_onr_prov_amt(), rsltR.trd_unit_qty(), rsltR.trd_cur_upri_dec_place());
			rsltR.trd_cur_onr_prov_upri(trdCurOnrProvUpri);
			setOutsrcUpriAndAmt(rsltR);
		}
	}
	protected void setOutsrcUpriAndAmt(RsltR rsltR) {
		if (RsltTable.getEditingColumnConfig() != columnRslt_trd_cur_proc_amt
				&& RsltTable.getEditingColumnConfig() != columnRslt_trd_cur_onr_prov_amt) {
			return;
		}
		
		rsltR.trd_cur_upri(getOutsrcUpri(rsltR.trd_cur_proc_upri(), rsltR.trd_cur_onr_prov_upri()));
		
		if(rsltR.repurc_obli_flg()) {
			setRepurcObliTax(rsltR);
		}
		else {
			setOutsrcAmtAndTax(rsltR);
		}
		clearDscntAmt(rsltR);
	}
	protected void setOutsrcAmtAndTax(RsltR rsltR) {
		MCNumber amt = getOutsrcAmt(rsltR.trd_cur_proc_amt(), rsltR.trd_cur_onr_prov_amt());
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(amt, rsltR.tax_rate(), rsltR.trd_cur_amt_dec_place(), rsltR.purc_tax_rnd_typ(), rsltR.inc_tax_flg());
		if(rsltR.inc_tax_flg()) {
			amt = !isNull(amt) ? amt.subtract(tax_amt) : null;
		}
		MCNumber inc_tax_amt = !isNull(amt) ? amt.add(tax_amt) : null;
		rsltR.trd_cur_amt(amt);
		rsltR.trd_cur_tax_amt(tax_amt);
		rsltR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(rsltR);
		setPtaxCurAmt(rsltR);
	}
	protected MCNumber getOutsrcAmt(MCNumber trdCurProcAmt, MCNumber trdCurOnrProvAmt) {
		if(isNull(trdCurProcAmt) && isNull(trdCurOnrProvAmt)) {
			return null;
		}
		return nvl(trdCurProcAmt, MCNumber.ZERO).add(nvl(trdCurOnrProvAmt, MCNumber.ZERO));
	}
	/**
	 * 取引通貨金額変更イベント
	 * @param info
	 */
	protected void doRslt_trd_cur_amt_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if(MAC_OUTSRC_UPRI_TYP.isPROC(rsltR.outsrc_upri_typ())) {
			rsltR.trd_cur_proc_amt(rsltR.trd_cur_amt());
			setBaseCurAmt(rsltR);
			setPtaxCurAmt(rsltR);
		}
	}
	/**
	 * 外注時の単価(加工単価+有償支給単価)を取得する
	 * @param trd_cur_proc_upri 取引通貨加工単価
	 * @param trd_cur_onr_prov_upri 取引通貨有償支給単価
	 * @return
	 */
	protected MCNumber getOutsrcUpri(MCNumber trd_cur_proc_upri, MCNumber trd_cur_onr_prov_upri) {
		if(isNull(trd_cur_proc_upri) && isNull(trd_cur_onr_prov_upri)) {
			return null;
		}
		return nvl(trd_cur_proc_upri, MCNumber.ZERO).add(nvl(trd_cur_onr_prov_upri, MCNumber.ZERO));
	}
	
	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}
	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}
	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR dtlR = (RsltR) table.getBaseTable().getRow(index);
			
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtlR.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			
			//複数詳細の場合
			if (dtlR.multi_io_flg() &&
					!isMultiIoUpdTgtColumn(column) &&
					//住所表示ボタンは対象外
					column.getColumnType() != MCColumnType.BUTTON) {
				return MCMode.READ_ONLY;
			}

			if (column == columnRslt_trd_cur_dscnt_amt) {
				if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
					return MCMode.READ_ONLY;
				}
			}
			
			//受領I/Vの場合
			if (!isNull(dtlR.rcpt_iv_mng_no())) {
				if (!isRcptIoUpdTgtColumn(column) &&
						//住所表示ボタンは対象外
						column.getColumnType() != MCColumnType.BUTTON) {
						return MCMode.READ_ONLY;
				}
				else {
					// 仕入諸掛
					if (isNull(dtlR.po_d_no())) {
						if (column == columnRslt_sync_flg) {
							return MCMode.READ_ONLY;
						}
					}
					if (dtlR.pay_spot_flg()) {
						if (column == columnRslt_pay_basis_dt) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						if (column == columnRslt_pay_schd_dt) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			else {
				if (column == columnRslt_pay_schd_dt) {
					return MCMode.READ_ONLY;
				}
			}

			//再入荷OFF
			if(!dtlR.re_arr_flg()) {
				if (isReArrColumn(column)) {
					return MCMode.READ_ONLY;
				}
				
			}
			else {
				if (column == columnRslt_re_arr_str_ln_cd) {
					if (dtlR.re_arr_str_ln_tgt_flg() && !dtlR.re_arr_str_ln_cd_none_flg()
							&& !isSame(getStatus(), DEL) && !isSame(getStatus(), SRCH_ACT_DTL)) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnRslt_re_arr_str_ln_cd_none_flg) {
					if (dtlR.re_arr_str_ln_tgt_flg()
							&& !isSame(getStatus(), DEL) && !isSame(getStatus(), SRCH_ACT_DTL)) {
						return MCMode.ENABLE;
					}
				}
			}
			//ヘッダ
			if (dtlR.hdr_readonly_flg() && isHdrEditableColumn(column)) {
				return MCMode.READ_ONLY;
			}

			// 納税通貨 
			if (isNull(dtlR.ptax_cur_cd()) || isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
				// 取引通貨と納税通貨が同じ通貨CDの場合は読取専用
				if (column == columnRslt_ptax_xrate ) {
					return MCMode.READ_ONLY;
				}
			}
			
			//値引品
			if (dtlR.dscnt_itm_flg() && !isDscntItmEditableColumn(column)) {
				return MCMode.READ_ONLY;
			}
			
			// 発注先
			if (column == columnRslt_sppl_cd) {
				if (dtlR.outsrc_flg() || isNull(dtlR.itm_sub3())) {
					return MCMode.READ_ONLY;
				}
			}
			// メーカ
			else if (column == columnRslt_maker_cd) {
				if (dtlR.outsrc_flg() || isNull(dtlR.itm_sub3())) {
					return MCMode.READ_ONLY;
				}
			}
			
			else if (column == columnRslt_crt_lot_flg
					|| column == columnRslt_lot_no
					|| column == columnRslt_sublot_no) {
				if (!dtlR.sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			//業者ロット、納品書、出荷元期限
			else if (column == columnRslt_slip_fr_valid_dt) {
				if (!dtlR.sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}			
			else if (column == columnRslt_bp_lot_no
					|| column == columnRslt_bp_dlv_slip_no
					|| column == columnRslt_bp_dlv_slip_d_no) {
				
				if (!dtlR.sync_flg()) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ()) 
							&& !dtlR.arr_skip_flg() && !isNull(dtlR.arr_act_no())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_bp_lot_no) {
					if (!dtlR.bp_lot_flg()
							&& isEditableMode(columnRslt_bp_lot_no)) {
						return MCMode.ENABLE;
					}
				}
			}
			
			// 源泉徴収税率
			else if (column == columnRslt_wtax_rate) {
				// 基準通貨＝取引通貨＝納税通貨のとき、源泉税率の編集が可能
				if (!canEditWtaxRate(dtlR)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnRslt_tax_cd ||
					column == columnRslt_trd_cur_dscnt_amt ||
					column == columnRslt_ptax_cur_tax_amt ||
					column == columnRslt_ap_dpt_cd ||
					column == columnRslt_pay_crryovr_times) {
				if (!hasCost(dtlR)) {
					return MCMode.READ_ONLY;
				}
			}
			// 納入場所
			else if (column == columnRslt_in_to_loc_cd || column == columnRslt_re_arr_loc_cd) {
				//仕入直送（納品先が入力されている）場合
				if (!isNull(dtlR.dlv_cd())) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlR.outsrc_sppl_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 仕入理由
			else if (column == columnRslt_purc_rsn_cd) {
				if (!Rslt_itm_p_PPanel.isItmFixLight(dtlR.getGUIIndex())) {
					return MCMode.READ_ONLY;
				}
				if (isEditableMode(column) && 
						(!dtlR.ncv_flg() &&
						!isPurcXpns(dtlR))) {
					return MCMode.ENABLE;
				}
			}

			else if (column == columnRslt_sync_flg) {
				if (dtlR.subcon_flg()
						|| dtlR.arr_skip_flg()
						|| dtlR.purc_ddlv_flg()
						|| !isNull(dtlR.purc_act_d_no())) {
					return MCMode.READ_ONLY;
				}
				if (Cnd_ope_INS.isSelected()
						&& !isNull(dtlR.arr_act_no())) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlR.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 打切ＦＬＧ
			else if (column == columnRslt_abort_flg) {
				if (isNull(dtlR.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}

			else if (column == columnRslt_accpt_dfct_flg) {
				if (dtlR.ncv_flg() || !MSC_ARR_PTN_TYP.isNRML(getArrPtnTyp(dtlR))) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnRslt_re_arr_flg) {
				if (!dtlR.accpt_dfct_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			

			// 再入荷・入荷同時計上FLG
			if (column == columnRslt_re_arr_sync_flg) {
				if (!dtlR.re_arr_flg() || isNull(dtlR.re_arr_rqst_dt()) || isNull(dtlR.re_arr_purc_schd_dt())
						|| !isSame(dtlR.re_arr_rqst_dt(), dtlR.re_arr_purc_schd_dt())) {
					return MCMode.READ_ONLY;
				}
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
				if (dtlR.purc_ddlv_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlR.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 再入荷仕入予定日
			else if (column == columnRslt_re_arr_purc_schd_dt) {
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			else if (column == columnRslt_purc_cont_qty) {
				if (!dtlR.sync_flg()) {
					return MCMode.READ_ONLY;
				}
				
			}
			else if (column == columnRslt_gd_cd) {
				if (!dtlR.sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 仮単価ＦＬＧ
			if (column == columnRslt_interim_flg) {
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 取引通貨単価・金額・税込金額
			if (column == columnRslt_trd_cur_upri
					|| column == columnRslt_trd_cur_amt
					|| column == columnRslt_trd_cur_inc_tax_amt) {
				if(!dtlR.purc_upri_cng_flg() && !dtlR.itm_purc_upri_cng_flg()) {
					return MCMode.READ_ONLY;
				}
				// 外注単価区分:加工単価+有償支給単価の場合は入力不可
				if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(dtlR.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isRcptIv(dtlR)) {
					return MCMode.READ_ONLY;
				}
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 加工単価・金額
			if (column == columnRslt_trd_cur_proc_upri
					|| column == columnRslt_trd_cur_proc_amt) {
				if (!dtlR.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!dtlR.purc_upri_cng_flg() && !dtlR.itm_purc_upri_cng_flg()) {
					return MCMode.READ_ONLY;
				}
				if (isRcptIv(dtlR)) {
					return MCMode.READ_ONLY;
				}
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 有償支給単価・金額
			if (column == columnRslt_trd_cur_onr_prov_upri
					|| column == columnRslt_trd_cur_onr_prov_amt) {
				if (!dtlR.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!dtlR.purc_upri_cng_flg() && !dtlR.itm_purc_upri_cng_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isRcptIv(dtlR)) {
					return MCMode.READ_ONLY;
				}
				if (dtlR.subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 加工金額・有償支給金額
			if(column == columnRslt_trd_cur_proc_amt
				|| column == columnRslt_trd_cur_onr_prov_amt) {
				if(dtlR.inc_tax_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnRslt_base_cur_tax_amt) {
				if (!isNull(dtlR.ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlR.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(dtlR.purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.trd_cur_upri())
						|| dtlR.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlR.xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.xrate())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnRslt_ptax_cur_tax_amt) {
				if (isNull(dtlR.ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlR.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.ptax_xrate())) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(dtlR.purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlR.trd_cur_upri())
						|| dtlR.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlR.ptax_xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (Rslt_bditm_p_PPanel.isBdColumn(column)
					&& dtlR.accpt_dfct_flg()) {
				return MCMode.READ_ONLY;
			}
			
			if (column == columnRslt_trd_unit_qty || column == columnRslt_trd_unit_cd) {
				if (dtlR.sls_sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 複数詳細の更新可能項目
	 */
	protected boolean isMultiIoUpdTgtColumn(MCColumnConfig column) {
		return column == columnRslt_check ||
				column == columnRslt_abort_flg ||
				column == columnRslt_purc_dt ||
				column == columnRslt_ac_dt ||
				column == columnRslt_can_ac_dt_for_input ||
				column == columnRslt_pay_basis_dt ||
				column == columnRslt_pay_schd_dt ||
				column == columnRslt_ptax_dt ||
				isAcDtDptColumn(column) ||
				isActRmrksColumn(column) ||
				isTtermColumn(column);
	}
	
	/**
	 * 受領インボイス対象の更新可能項目
	 */
	protected boolean isRcptIoUpdTgtColumn(MCColumnConfig column) {
		return column == columnRslt_check ||
				column == columnRslt_purc_dt ||
				column == columnRslt_ac_dt ||
				column == columnRslt_can_ac_dt_for_input ||
				column == columnRslt_pay_basis_dt ||
				column == columnRslt_pay_schd_dt ||
				column == columnRslt_ptax_dt ||
				column == columnRslt_sync_flg ||
				column == columnRslt_xrate ||
				column == columnRslt_ptax_xrate ||
				column == columnRslt_iv_itm_nm ||
				column == columnRslt_gd_cd ||
				column == columnRslt_dscnt_rsn_cd ||
				column == columnRslt_purc_rsn_cd ||
				column == columnRslt_in_to_loc_cd ||
				column == columnRslt_in_to_str_ln_cd ||
				column == columnRslt_slip_fr_valid_dt ||
				column == columnRslt_ver_no ||				
				isAcDtDptColumn(column) ||
				isActRmrksColumn(column) ||
				column.getRootPanel() == Rslt_lot_no_p_PPanel ||
				column.getRootPanel() == Rslt_bditm_p_PPanel ||
				column == columnRslt_bp_lot_no ||
				column == columnRslt_bp_dlv_slip_no ||
				column == columnRslt_bp_dlv_slip_d_no ||
				column == columnRslt_purc_cont_qty;
	}
	

	/**
	 * 仕入実績ヘッダ備考項目
	 */
	protected boolean isActHdrRmrksColumn(MCBeans column) {
		for(MCColumnConfig c : getActHdrRmrksColumn()) {
			if (c == column) {
				return true;
			}
		}
		return false;
	}
	
	protected MCColumnConfig[] _actHdrRmrksCol;
	protected MCColumnConfig[] getActHdrRmrksColumn() {
		if (_actHdrRmrksCol == null) {
			_actHdrRmrksCol = new MCColumnConfig[]{columnRslt_trd_rmrks,
					columnRslt_intr_rmrks,
					columnRslt_tterm_cd1,
					columnRslt_tterm_rmrks1,
					columnRslt_tterm_cd2,
					columnRslt_tterm_rmrks2,
					columnRslt_tterm_cd3,
					columnRslt_tterm_rmrks3,
					columnRslt_sub_char1,
					columnRslt_sub_char2,
					columnRslt_sub_char3};
		}
		return _actHdrRmrksCol;
	}
	/**
	 * 仕入実績明細備考項目
	 */
	protected boolean isActDtlRmrksColumn(MCBeans column) {
		return column == columnRslt_trd_d_rmrks ||
				column == columnRslt_intr_d_rmrks ||
				column == columnRslt_dtl_sub_char1 ||
				column == columnRslt_dtl_sub_char2 ||
				column == columnRslt_dtl_sub_char3;
	}
	/**
	 * 仕入実績ヘッダ、明細備考項目
	 */
	protected boolean isActRmrksColumn(MCBeans column) {
		return isActHdrRmrksColumn(column) ||
				isActDtlRmrksColumn(column);
	}
	
	/**
	 * 計上日に依存する部門関係項目
	 */
	protected boolean isAcDtDptColumn(MCColumnConfig column) {
		return column == columnRslt_purc_usr_cd ||
				column == columnRslt_purc_dpt_cd ||
				column == columnRslt_ap_dpt_cd ||
				column == columnRslt_bd_dpt_cd;
	}
	
	protected boolean isTtermColumn(MCColumnConfig column) {
		return column == columnRslt_tterm_cd1 ||
				column == columnRslt_tterm_cd2 ||
				column == columnRslt_tterm_cd3 ||
				column == columnRslt_tterm_rmrks1 ||
				column == columnRslt_tterm_rmrks2 ||
				column == columnRslt_tterm_rmrks3;		
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == BulkSet_ac_dt) {
			doBulkSet_ac_dt_NC(info);
		}
		if (nc == columnRslt_trd_unit_qty) {
			doRslt_trd_unit_qty_NC(info);
		}
		else if (nc == columnRslt_re_arr_rqst_dt) {
			doRslt_re_arr_rqst_dt_NC(info);
		}
	}
	
	@Override
	public void doRslt_re_arr_purc_schd_dt_NC(MCEventInfo info) {
		super.doRslt_re_arr_purc_schd_dt_NC(info);
		int idx = info.getEventIndex();
		RsltR dtlRow = getRsltL().get(idx);
		
		// 仕入直送、または仕入計上区分が入荷基準の場合、再入荷希望日＝再入荷仕入予定日とする
		if (dtlRow.purc_ddlv_flg() || MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			dtlRow.re_arr_rqst_dt(dtlRow.re_arr_purc_schd_dt());
		}
		setReArrSyncFlg(info);
	}

	protected void doRslt_re_arr_rqst_dt_NC(MCEventInfo info) {
		setReArrPurcSchdDt(info);
		setReArrSyncFlg(info);
	}
	
	/**
	 * 再入荷予定の仕入予定日を設定します
	 * @param info イベント情報
	 */
	protected void setReArrPurcSchdDt(MCEventInfo info) {
		int idx = info.getEventIndex();
		RsltR dtlRow = getRsltL().get(idx);
		
		// 仕入直送、または発注先が下請対象、または仕入計上区分が入荷基準の場合、再入荷希望日＝再入荷仕入予定日とする
		if (dtlRow.purc_ddlv_flg() || dtlRow.subcon_flg() || MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			setValueEx(columnRslt_re_arr_purc_schd_dt, idx, dtlRow.re_arr_rqst_dt());
			return;
		}
		
		// 再入荷数量が未入力の場合は処理しない
		if (isNull(dtlRow.trd_unit_re_arr_qty())) {
			return;
		}
		
		// 再入荷数量の基準単位数量を求める
		MCNumber baseUnitReArrQty = getBaseUnitReArrQty(dtlRow);
		
		// 外注でない場合は、発注先ＣＤは連携しない
		String spplCd;
		if (dtlRow.outsrc_flg()) {
			spplCd = MAC_STR.NULL_VAL.value();
		}
		else {
			spplCd = dtlRow.sppl_cd();
		}
		String sysParm = getSysParm("MASTER_DT_BASE");
		
		MCRow rslt = MSUCP_PurcUtil.getSchdDt(
				dtlRow.peg_no(), 
				null, 
				dtlRow.re_arr_rqst_dt(), 
				null, 
				null, 
				spplCd, 
				dtlRow.itm_cd(),
				dtlRow.itm_sub1(),
				dtlRow.itm_sub2(),
				dtlRow.itm_sub3(),
				dtlRow.mfg_loc_cd(),
				dtlRow.maker_cd(),
				dtlRow.re_arr_loc_wg_cd(),
				dtlRow.bom_ptn(),
				dtlRow.dlv_cd(),
				dtlRow.re_arr_loc_cd(),
				dtlRow.re_arr_loc_site_cd(),
				dtlRow.re_arr_loc_sppl_cd(),
				dtlRow.re_arr_loc_sppl_cal_cd(),
				dtlRow.re_arr_loc_cal_cd(),
				dtlRow.scst_cal_cd(),
				dtlRow.re_arr_loc_site_cd(),
				baseUnitReArrQty,
				isSame(sysParm, "1") ? dtlRow.ac_dt() : null,
				this);
		
		if (!isNull(rslt)) {
			setValueEx(columnRslt_re_arr_purc_schd_dt, idx, rslt.getDateNE("purc_schd_dt"));
		}
		
	}
	
	/**
	 * 再入荷予定数量を取引単位数量から基準単位数量に換算した数量を返します
	 * @param dtlRow 明細行
	 * @return 再入荷予定数量（基準単位）
	 */
	protected MCNumber getBaseUnitReArrQty(RsltR dtlRow) {
		return convToBaseUnit(dtlRow.trd_unit_re_arr_qty(), dtlRow.trd_unit_conv_base_qty(), 
				dtlRow.trd_unit_conv_qty(),dtlRow.base_unit_dec_place(), dtlRow.base_unit_rnd_typ());
	}

	protected void setReArrSyncFlg(MCEventInfo info) {
		int idx = info.getEventIndex();
		RsltR dtlRow = getRsltL().get(idx);
		
		if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			// 仕入計上区分：入荷基準
			setValueEx(columnRslt_re_arr_sync_flg, idx, true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(dtlRow.purc_basis_typ())) {
			// 仕入計上区分：検収基準
			setValueEx(columnRslt_re_arr_sync_flg, idx, false);
		}
		else if (!isNull(dtlRow.re_arr_purc_schd_dt()) && !isNull(dtlRow.re_arr_rqst_dt())
				&&isSame(dtlRow.re_arr_purc_schd_dt(), dtlRow.re_arr_rqst_dt())) {
			setValueEx(columnRslt_re_arr_sync_flg, idx, true);
		}
		else {
			setValueEx(columnRslt_re_arr_sync_flg, idx, false);
		}
	}
	protected boolean isHdrEditableColumn(MCBeans column) {
		for (MCColumnConfig c : getHdrEditableColumn()) {
			if (c == column) {
				return true;
			}
		}
		return false;
	}

	protected MCColumnConfig[] _actHdrEditableCol;
	protected MCColumnConfig[] getHdrEditableColumn() {
		if (_actHdrEditableCol == null) {
			_actHdrEditableCol = mcframe.commonCore.util.MCCollectionUtil.concat(
					getActHdrRmrksColumn(), new MCColumnConfig[]{
							columnRslt_purc_dt,
							columnRslt_ac_dt,
							columnRslt_can_ac_dt_for_input,
							columnRslt_pay_basis_dt,
							columnRslt_pay_schd_dt,
							columnRslt_ptax_dt,
							columnRslt_trd_cur_cd,
							columnRslt_purc_usr_cd,
							columnRslt_purc_dpt_cd,
							columnRslt_xrate,
							columnRslt_ptax_xrate
					});
		}
		return _actHdrEditableCol;
	}
	
	protected boolean isDscntItmEditableColumn(MCBeans column) {
		return !(column == columnRslt_ncv_flg ||
				column == columnRslt_accpt_dfct_flg ||
				column == columnRslt_trd_unit_cd ||
				column == columnRslt_trd_unit_qty ||
				column == columnRslt_quality_typ ||
				column == columnRslt_gd_cd
				);
	}
	
	protected boolean isReArrColumn(MCColumnConfig column) {
		String cn = column.getBaseRowColumnName();
		return column != columnRslt_re_arr_flg &&
				!isNull(cn) && cn.contains("re_arr_");
	}

	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	
	/**
	 * ボタンの押下制御をします。
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		setBtnRcopyMode(r);
		setBtnOpen(r);
	}
	/**
	 * 行コピーボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRcopyMode(RsltR r) {
		if (r == null || !isNull(r.rcpt_iv_mng_no())) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	/**
	 * 画面遷移ボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnOpen(RsltR r) {
//		入荷実績一覧登録
		if (r == null || isNull(r.arr_act_no())) {
			Btn_open_MSBEP2000.setMode(MCMode.DISABLE);
			}
		else {
			setDefaultMode(Btn_open_MSBEP2000);
		}
		
//		仕入実績登録
		if (isSchdSrch()) {
			if (r == null || isNull(r.po_no()) || r.sppl_iv_flg()) {
				Btn_open_MSBDP0140.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBDP0140);
			}
		}
		else {
			if (r == null || isNull(r.purc_act_no()) || r.sppl_iv_flg()) {
				Btn_open_MSBDP0140.setMode(MCMode.DISABLE);
				}
			else {
				setDefaultMode(Btn_open_MSBDP0140);
			}
		}
		
//		仕入返品予定登録
//		仕入返品登録
		if (r == null || isNull(r.purc_act_no())) {
			Btn_open_MSBDP0150.setMode(MCMode.DISABLE);
			Btn_open_MSBDP0160.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBDP0150);
			setDefaultMode(Btn_open_MSBDP0160);
		}
		
//		仕入値引登録
		if (r == null || isNull(r.purc_act_no())) {
			Btn_open_MSBDP0180.setMode(MCMode.DISABLE);
			}
		else {
			setDefaultMode(Btn_open_MSBDP0180);
		}

//		仕入直送売上登録
		if (r == null || isNull(r.dlv_cd()) || isNull(r.slo_no()) || r.cst_iv_flg()) {
			Btn_open_MSBBP1360.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1360);
		}
		
	}
	
	protected boolean isSchdSrch() {
		return Cnd_ope_INS.isSelected() || Cnd_ope_SRCH_SCHD.isSelected();
	}
	
	/**
	 * 検索ボタンの入力制御を設定する
	 */
	public void setBtnModeByOpe() {
		// 何もしない
	}
	/**
	 * 操作種別に対応するステータスを設定します。（検索前）
	 */
	public void setSrchStatus() {
		setScrStatus() ;
		
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 操作種別に対応するステータスを設定します。（検索後）
	 */
	public void setSrchedStatus() {
		setScrStatus() ;
		Ctrl_ctrl_PPanel.expand(false);
		RsltTable.selectLeftmostColumn(0);
	}
	
	protected void setScrStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else {
			if (Cnd_ope_SRCH_SCHD.isSelected()){
				setSRCH_SCHDStatus();
			}
			else if ( Cnd_ope_SRCH_ACT.isSelected() ) {
				if (Cnd_mode_DTL.isSelected()) {
					setSRCH_ACT_DTLStatus();
				}
				else {
					setSRCH_ACT_HDRStatus();
				}
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setDELStatus();
			}
		}
	}
	@Override
	public void setINSStatus(){
		clearNotSchdCondForIns();
		clearSrchCond();
		super.setINSStatus();
		initSrchMode();
		setBtnMode();
	}
	@Override
	public void setUPDStatus(){
		clearNotActDtlCond();
		clearSrchCond();
		super.setUPDStatus();
		initSrchMode();
		setBtnMode();
	}
	@Override
	public void setDELStatus(){
		clearNotActDtlCond();
		clearSrchCond();
		super.setDELStatus();
		initSrchMode();
		setBtnMode();
	}
	@Override
	public void setFIX_DStatus(){
		super.setFIX_DStatus();
		setBtnMode();
	}
	@Override
	public void setFIX_IStatus(){
		super.setFIX_IStatus();
		setBtnMode();
	}
	@Override
	public void setFIX_UStatus(){
		super.setFIX_UStatus();
		setBtnMode();
	}
	@Override
	public void setSRCH_ACT_HDRStatus(){
		clearNotActHdrCond();
		super.setSRCH_ACT_HDRStatus();
		setBtnMode();
	}
	@Override
	public void setSRCH_ACT_DTLStatus(){
		clearNotActDtlCond();
		super.setSRCH_ACT_DTLStatus();
		setBtnMode();
	}
	@Override
	public void setSRCH_SCHDStatus(){
		clearNotSchdCond();
		super.setSRCH_SCHDStatus();
		initSrchMode();

		setBtnMode();
	}

	
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------

	protected void initSrchMode() {
		setValueEx(Cnd_mode_Group, Cnd_mode_DTL.getActionCommand());
	}
	
	protected List<MCCheckBox> _cndFlgs;
	/**
	 * 検索枠のフラグをtrueで初期化します。<p>
	 * @param excepts falseで初期化したいGUI部品
	 */
	protected void initCndFlgOn(MCCheckBox... excepts) {
			if (_cndFlgs == null) {
				_cndFlgs = new ArrayList<MCCheckBox>();
				_cndFlgs.add(Cnd_arr_flg);
				_cndFlgs.add(Cnd_not_yet_arr_flg);
				_cndFlgs.add(Cnd_arr_not_cmpl_flg);
				_cndFlgs.add(Cnd_arr_cmpl_flg);
				_cndFlgs.add(Cnd_purc_not_cmpl_flg);
				_cndFlgs.add(Cnd_purc_cmpl_flg);
				_cndFlgs.add(Cnd_cont_abort_flg);
				_cndFlgs.add(Cnd_not_iv_flg);
				_cndFlgs.add(Cnd_edi_flg);
				_cndFlgs.add(Cnd_not_edi_flg);
			}
			
			_cndFlgs.forEach(c -> {
				boolean v = true;
				//対象外項目はfalse
				if (excepts != null) {
					for(MCCheckBox f: excepts) {
						if (f == c) {
							v = false;
							break;
						}
					}
				}
				setValueEx(c, v);
			});
			

	}
	
	/**
	 * 一括設定内容を反映します。
	 */
	protected void bulkSet(RsltR r, boolean isCheckEvent) {
		if (!r.isGUIVisible()) {
			return;
		}
		if (!r.check()) {
			return;
		}

		if (!isNull(r.purc_act_no())) {
			return;
		}
		int idx = r.getGUIIndex();
		if (isCheckEvent || isNull(r.purc_dt())) {
			bulkSetDt(columnRslt_purc_dt, idx, getBulkSetR().purc_dt());
		}
		if (isCheckEvent || isNull(r.ac_dt())) {
			//選択チェックイベントではなく仕入日がある場合は仕入日イベントに任せる
			if ((!isCheckEvent && isNull(getBulkSetR().purc_dt())) || isCheckEvent) {
				bulkSetDt(columnRslt_ac_dt, idx, getBulkSetR().ac_dt());
			}
		}
		if (isCheckEvent || isNull(r.pay_basis_dt())) {
			bulkSetDt(columnRslt_pay_basis_dt, idx, getBulkSetR().pay_basis_dt());
		}

	}
	
	/**
	 * 入力可能なセルに日付を設定します。
	 */
	protected void bulkSetDt(MCColumnConfig tgt, int idx, MCDate dt) {
		if (isEditable(tgt, idx)) {
			if (isNull(dt)) {
				return;
			}
			setValueEx(tgt, idx, dt);
			
		}
	}
	
	/**
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 */
	protected void setDefaultTaxCd(RsltR dtlR) {
		if (dtlR.tax_fix_flg()) {
			return;
		}
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.sppl_cd(), 
				dtlR.purc_dt(), 
				this);
		setValueEx(columnRslt_tax_cd, dtlR.getGUIIndex(), taxCd);
	}
	
	/**
	 * 支払繰越回数初期値を設定します
	 */
	protected void setDefaultPayCrryovrTimes(RsltR dtlR) {
		if (isNull(dtlR.pay_crryovr_times())) {
			if (!isNull(dtlR.itm_pay_crryovr_times())) {
				setValueEx(columnRslt_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.itm_pay_crryovr_times());
			}
			else {
				setValueEx(columnRslt_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.pay_crryovr_times());
			}
		}
	}
	/**
	 * 直納区分を設定します
	 * @param dtlR
	 */
	protected void setDrctDlvTyp(RsltR dtlR) {
		if (isNullAnd(dtlR.in_to_loc_cd(), dtlR.dlv_cd())) {
			setValueEx(columnRslt_drct_dlv_typ, dtlR.getGUIIndex(), null);
		}
		else if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			setValueEx(columnRslt_drct_dlv_typ, dtlR.getGUIIndex(), MSC_DRCT_DLV_TYP.VIA.value());
		} 
		else {
			setValueEx(columnRslt_drct_dlv_typ, dtlR.getGUIIndex(), MSC_DRCT_DLV_TYP.DDLV.value());
		}
	}
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(RsltR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnRslt_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnRslt_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}
	protected void setApDptCd(RsltR dtlR) {
		if (isNull(dtlR.mst_ap_dpt_cd())) {
			if (isNull(dtlR.purc_dpt_cd())) {
				setValueEx(columnRslt_ap_dpt_cd, dtlR.getGUIIndex(), null);
			}
			else {
				 if (dtlR.ap_dpt_flg()) {
					 setValueEx(columnRslt_ap_dpt_cd, dtlR.getGUIIndex(), dtlR.purc_dpt_cd());
				}
				else {
					setValueEx(columnRslt_ap_dpt_cd, dtlR.getGUIIndex(), null);
				}	
			}
		}
	}
	@Override
	public void doRslt_ncv_flg_NC(MCEventInfo info) {
		super.doRslt_ncv_flg_NC(info);
		int idx = info.getEventIndex();
		RsltR dtlRow = getRsltL().get(idx);
		if (dtlRow.ncv_flg()) {
			// 明細行と詳細行の検収不良FLGを全てオフにする
			setValueEx(columnRslt_accpt_dfct_flg, idx, false);
		}
		initUpriAmt(dtlRow);
	}

	protected void initUpriAmt(RsltR dtlRow) {
		int idx = dtlRow.getGUIIndex();
		if (hasCost(dtlRow)) {
			setValueForMoneyCols(dtlRow);
		}
		else {
			// 金額情報に0をセット
			setValueEx(columnRslt_trd_cur_upri, idx, MCNumber.ZERO);
			setValueEx(columnRslt_interim_flg, idx, false);
			if (!isNull(dtlRow.trd_cur_proc_upri())) {
				setValueEx(columnRslt_trd_cur_proc_upri, idx, MCNumber.ZERO);	
			}
			if (!isNull(dtlRow.trd_cur_onr_prov_upri())) {
				setValueEx(columnRslt_trd_cur_onr_prov_upri, idx, MCNumber.ZERO);
			}
			if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
				setValueEx(columnRslt_trd_cur_dscnt_amt, idx, null);	
			}
			// 債務部門をクリア
			setValueEx(columnRslt_ap_dpt_cd, idx, null);
		}
	}
	
	@Override
	public MCList getRslt_purc_rsn_cd(
			MCRow row,
			MCEventInfo info) {
		RsltR dr = getRsltL().get(info.getEventIndex());
		
		if (isPurcXpns(dr)) {
			row.addBooleanColumn(PurcBizRsnCols.$i_xpns_purc_flg, true);
		}
		else {
			row.addBooleanColumn(PurcBizRsnCols.$i_not_xpns_purc_flg, true);
		}
		return super.getRslt_purc_rsn_cd(row, info);
	}
	
	/**
	 * 版ＮＯをクリアします。
	 */
	protected void clearVerNo(RsltR dtlR) {
		setValueEx(columnRslt_ver_no, dtlR.getGUIIndex(), null);
	}
	/**
	 * 仕入理由をクリアします。
	 * @param dtlR
	 */
	protected void clearPurcRsnCd(RsltR dtlR) {
		if (!isSame(isPurcXpns(dtlR), dtlR.xpns_purc_flg())) {
			setValueEx(columnRslt_purc_rsn_cd, dtlR.getGUIIndex(), null);
		}
	}

	protected MCList<ConvQtyAmtUtil_HdrR> createUtilHdr(RsltR hdr, int hdrPegNo) {
		MCList<ConvQtyAmtUtil_HdrR> l = MCList.create(ConvQtyAmtUtil_HdrR.class);
		ConvQtyAmtUtil_HdrR utlHdr = 
		ConvQtyAmtUtil_HdrR.create();
		utlHdr.peg_no(hdrPegNo);
		// 発注明細の取引単位情報・金額情報を連携する
		utlHdr.base_unit_dec_place(hdr.base_unit_dec_place());
		utlHdr.base_unit_rnd_typ(hdr.base_unit_rnd_typ());
		utlHdr.trd_cur_cd(hdr.trd_cur_cd());
		utlHdr.act_inc_tax_flg(hdr.inc_tax_flg());
		utlHdr.act_tax_rate(hdr.tax_rate());
		utlHdr.amt_dec_place(hdr.trd_cur_amt_dec_place());
		utlHdr.upri_dec_place(hdr.trd_cur_upri_dec_place());
		utlHdr.amt_rnd_typ(hdr.purc_amt_rnd_typ());
		utlHdr.tax_rnd_typ(hdr.purc_tax_rnd_typ());
		utlHdr.wtax_rnd_typ(getCo().wtax_rnd_typ());
		MCNumber poBaseUnitQty = convToBaseUnit(hdr.src_trd_unit_qty(), hdr.src_trd_unit_conv_base_qty(), hdr.trd_unit_conv_qty(),
				hdr.base_unit_dec_place(), hdr.base_unit_rnd_typ());
		utlHdr.schd_base_unit_qty(poBaseUnitQty);
		utlHdr.setNumberNE("act_xrate", hdr.xrate());
		utlHdr.setNumberNE("act_ptax_xrate", hdr.ptax_xrate());
		utlHdr.setNumberNE("xrate", hdr.src_xrate());
		utlHdr.setNumberNE("ptax_xrate", hdr.src_ptax_xrate());
		boolean useDbVal = hdr.purc_dtl_upd_flg() && isSame(hdr.db_trd_unit_cd(), hdr.trd_unit_cd());
		if (useDbVal) {
			utlHdr.trd_unit_cd(hdr.db_trd_unit_cd());
			utlHdr.trd_unit_qty(hdr.db_trd_unit_qty());
			utlHdr.trd_cur_upri(hdr.db_trd_cur_upri());
			if (isSame(hdr.db_trd_unit_qty(), hdr.trd_unit_qty())) {
				// 明細訂正後で、単位も数量も同じである場合は与えられた金額をそのまま返すため、発注時の値引額に戻さないようにする
				utlHdr.trd_cur_dscnt_amt(hdr.db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_dscnt_amt(hdr.src_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_proc_upri(hdr.db_trd_cur_proc_upri());
			utlHdr.trd_cur_onr_prov_upri(hdr.db_trd_cur_onr_prov_upri());
			utlHdr.trd_cur_amt(hdr.db_trd_cur_amt());
			utlHdr.trd_cur_proc_amt(hdr.db_trd_cur_proc_amt());
			utlHdr.trd_cur_onr_prov_amt(hdr.db_trd_cur_onr_prov_amt());
			utlHdr.trd_cur_tax_amt(hdr.db_trd_cur_tax_amt());
			utlHdr.trd_cur_inc_tax_amt(hdr.db_trd_cur_amt().add(hdr.db_trd_cur_tax_amt()));
			utlHdr.trd_unit_conv_qty(hdr.db_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(hdr.db_trd_unit_conv_base_qty());
			utlHdr.tax_rate(hdr.db_tax_rate());
			utlHdr.inc_tax_flg(hdr.db_inc_tax_flg());
		}
		else {
			// 発注明細の取引単位情報・金額情報を連携する
			utlHdr.trd_unit_cd(hdr.src_trd_unit_cd());
			utlHdr.trd_unit_qty(hdr.src_trd_unit_qty());
			utlHdr.trd_cur_upri(hdr.src_trd_cur_upri());
			utlHdr.trd_cur_dscnt_amt(hdr.src_trd_cur_dscnt_amt());
			utlHdr.trd_cur_proc_upri(hdr.src_trd_cur_proc_upri());
			utlHdr.trd_cur_onr_prov_upri(hdr.src_trd_cur_onr_prov_upri());
			utlHdr.trd_cur_amt(hdr.src_trd_cur_amt());
			utlHdr.trd_cur_proc_amt(hdr.src_trd_cur_proc_amt());
			utlHdr.trd_cur_onr_prov_amt(hdr.src_trd_cur_onr_prov_amt());
			utlHdr.trd_cur_tax_amt(hdr.src_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(hdr.src_trd_cur_upri(), hdr.src_trd_unit_qty(), hdr.tax_rate(), 
					hdr.inc_tax_flg(), hdr.trd_cur_amt_dec_place(), hdr.purc_amt_rnd_typ(), 
					hdr.purc_tax_rnd_typ(), hdr.src_trd_cur_dscnt_amt());
			utlHdr.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			utlHdr.trd_unit_conv_qty(hdr.src_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(hdr.src_trd_unit_conv_base_qty());
			utlHdr.inc_tax_flg(hdr.src_inc_tax_flg());
			utlHdr.tax_rate(hdr.src_tax_rate());
		}
		l.add(utlHdr);
		return l;
	}
	
	
	protected MCList<ConvQtyAmtUtil_DtlR> createUtilDtl(RsltR hdr, int hdrPegNo) {
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL
		= MCList.create(ConvQtyAmtUtil_DtlR.class);

			ConvQtyAmtUtil_DtlR utlDtlR
				= ConvQtyAmtUtil_DtlR.create();
			
			utlDtlR.peg_no(hdr.peg_no());
			utlDtlR.hdr_peg_no(hdrPegNo);
			utlDtlR.trd_unit_qty(hdr.trd_unit_qty());
			utlDtlR.trd_unit_cd(hdr.trd_unit_cd());
			utlDtlR.trd_unit_conv_qty(hdr.trd_unit_conv_qty());
			utlDtlR.trd_unit_conv_base_qty(hdr.trd_unit_conv_base_qty());
			utlDtlR.wtax_rate(hdr.wtax_rate());
			utlDtlR.trd_cur_dscnt_amt(hdr.trd_cur_dscnt_amt());
			utlDtlL.add(utlDtlR);
			return utlDtlL;
		
	}
	/**
	 * 数量、金額系項目に値をセットする
	 * @param dtlL 対象行
	 */
	protected void setValueForMoneyCols(RsltR rslt) {

		if (isNull(rslt.purc_schd_no()) || isNull(rslt.trd_unit_qty()) || isNull(rslt.trd_cur_upri()) || !hasCost(rslt)) {
			return ;
		}
		
		
		//金額計算
		
		// 紐付NO
		int hdr_peg_no = 1;
		
		// ユーティリティ実行用ヘッダ
		MCList<ConvQtyAmtUtil_HdrR> utlHdrL = createUtilHdr(rslt, hdr_peg_no);
		
		// ユーティリティ実行用明細（上段）
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL	= createUtilDtl(rslt, hdr_peg_no);
		
		// 明細の金額項目計算用ユーティリティ実行
		setAmtToDtlL(utlHdrL, utlDtlL);
		
		// ユーティリティの計算結果を明細に反映する
		ConvQtyAmtUtil_DtlR calcR = utlDtlL.get(0);
		rslt.trd_cur_upri(calcR.trd_cur_upri());
		rslt.trd_cur_dscnt_amt(calcR.trd_cur_dscnt_amt());
		rslt.trd_cur_amt(calcR.trd_cur_amt());
		rslt.trd_cur_tax_amt(calcR.trd_cur_tax_amt());
		rslt.trd_cur_inc_tax_amt(calcR.trd_cur_inc_tax_amt());
		rslt.trd_unit_conv_qty(calcR.trd_unit_conv_qty());
		rslt.trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());
		rslt.trd_cur_proc_upri(calcR.trd_cur_proc_upri());
		rslt.trd_cur_onr_prov_upri(calcR.trd_cur_onr_prov_upri());
		rslt.trd_cur_proc_amt(calcR.trd_cur_proc_amt());
		rslt.trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());
		rslt.trd_cur_onr_prov_amt(calcR.trd_cur_onr_prov_amt());
		rslt.wtax_amt(calcR.wtax_amt());
	
		// 基準通貨・納税通貨に換算
	
		// 単価・値引額・金額・税額
		rslt.base_cur_upri(convToBaseCur(rslt.trd_cur_upri(), rslt.xrate(), rslt.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_dscnt_amt(convToBaseCur(rslt.trd_cur_dscnt_amt(), rslt.xrate(), rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_amt(convToBaseCur(rslt.trd_cur_amt(), rslt.xrate(), rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_tax_amt(convToBaseCur(rslt.trd_cur_tax_amt(), rslt.xrate(), rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		if (!isNull(rslt.xrate())) {
			rslt.base_cur_inc_tax_amt(rslt.base_cur_amt().add(rslt.base_cur_tax_amt()));
		}

		// 加工単価・金額
		rslt.base_cur_proc_upri(convToBaseCur(rslt.trd_cur_proc_upri(), rslt.xrate(), rslt.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_proc_amt(convToBaseCur(rslt.trd_cur_proc_amt(), rslt.xrate(), rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		// 有償支給単価・金額
		rslt.base_cur_onr_prov_upri(convToBaseCur(rslt.trd_cur_onr_prov_upri(), rslt.xrate(), rslt.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_onr_prov_amt(convToBaseCur(rslt.trd_cur_onr_prov_amt(), rslt.xrate(), rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		
		if (!isNull(rslt.ptax_cur_cd())) {
			rslt.ptax_cur_upri(convCur(rslt.trd_cur_upri(), rslt.ptax_xrate(), rslt.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_dscnt_amt(convCur(rslt.trd_cur_dscnt_amt(), rslt.ptax_xrate(), rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_amt(convCur(rslt.trd_cur_amt(), rslt.ptax_xrate(), rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_tax_amt(convCur(rslt.trd_cur_tax_amt(), rslt.ptax_xrate(), rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(rslt.ptax_xrate())) {
				rslt.ptax_cur_inc_tax_amt(rslt.ptax_cur_amt().add(rslt.ptax_cur_tax_amt()));
			}
			
			// 加工単価・金額
			rslt.ptax_cur_proc_upri(convCur(rslt.trd_cur_proc_upri(), rslt.ptax_xrate(), rslt.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_proc_amt(convCur(rslt.trd_cur_proc_amt(), rslt.ptax_xrate(), rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));

			// 有償支給単価・金額
			rslt.ptax_cur_onr_prov_upri(convCur(rslt.trd_cur_onr_prov_upri(), rslt.ptax_xrate(), rslt.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_onr_prov_amt(convCur(rslt.trd_cur_onr_prov_amt(), rslt.ptax_xrate(), rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		if(rslt.repurc_obli_flg()) {
			setRepurcObliTax(rslt);
		}
	
		
	}
	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param rsltR
	 */
	protected void setRepurcObliTax(RsltR rsltR) {
		if(isNull(rsltR.trd_cur_cd()) || (isNull(rsltR.trd_cur_proc_upri()) && isNull(rsltR.trd_cur_onr_prov_upri()))) {
			return;
		}
		MCNumber amt = null;
		if (RsltTable.getEditingColumnConfig() == columnRslt_trd_cur_proc_amt
				|| RsltTable.getEditingColumnConfig() == columnRslt_trd_cur_onr_prov_amt) {
			amt = getOutsrcAmt(rsltR.trd_cur_proc_amt(), rsltR.trd_cur_onr_prov_amt());
		}
		else {
			// 金額 = (単価:加工単価 + 有償支給単価)×数量
			amt = getAmt(rsltR.trd_cur_upri(),
					rsltR.trd_unit_qty(),
					rsltR.trd_cur_amt_dec_place(),
					rsltR.purc_amt_rnd_typ(),
					rsltR.trd_cur_dscnt_amt()
					);
			if(rsltR.inc_tax_flg()) {
				// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
				MCNumber proc_inc_tax_amt = getAmt(rsltR.trd_cur_proc_upri(),
						rsltR.trd_unit_qty(),
						rsltR.trd_cur_amt_dec_place(),
						rsltR.purc_amt_rnd_typ(),
						rsltR.trd_cur_dscnt_amt());
				rsltR.trd_cur_proc_amt(proc_inc_tax_amt);
				// 有償支給金額は金額-加工金額
				rsltR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
			}else {
				rsltR.trd_cur_amt(amt);
				// 外税の場合は金額を案分
				setOutsrcAmt(rsltR);
			}
		}
		// 加工金額を元に税額を取得(有償支給金額は税額に含めない)
		// 値引額は共通処理で考慮済なので計算に含めない
		MCNumber tax_amt = getTaxAmt(
				rsltR.trd_cur_proc_amt(),
				rsltR.tax_rate(),
				rsltR.trd_cur_amt_dec_place(),
				rsltR.purc_tax_rnd_typ(),
				rsltR.inc_tax_flg()
				);
		if(rsltR.inc_tax_flg()) {
			amt = (amt != null) ? amt.subtract(tax_amt) : null;
			MCNumber proc_amt = !isNull(rsltR.trd_cur_proc_amt()) ? rsltR.trd_cur_proc_amt().subtract(tax_amt) : null;
			rsltR.trd_cur_proc_amt(proc_amt);
		}		MCNumber inc_tax_amt = (amt != null) ? amt.add(tax_amt) : null;
		
		rsltR.trd_cur_amt(amt);
		rsltR.trd_cur_tax_amt(tax_amt);
		rsltR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(rsltR);
		setPtaxCurAmt(rsltR);
	}
	/**
	 * 金額を案分して加工金額・有償支給金額を導出します
	 * @param rsltR
	 */
	protected void setOutsrcAmt(RsltR rsltR) {
		if(!rsltR.outsrc_flg()) {
			return;
		}
		MCList<MCRow> retL = calcPropOutSrcUpri(rsltR.trd_cur_amt(), rsltR.trd_cur_amt_dec_place(),
				rsltR.trd_cur_onr_prov_upri(), rsltR.trd_cur_proc_upri(), rsltR.trd_cur_dscnt_amt());
		rsltR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
		rsltR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
		setBaseCurAmt(rsltR);
		setPtaxCurAmt(rsltR);
	}
	/**
	 * 基準通貨項目に取引通貨項目を元に値を設定します
	 * @param rsltR
	 */
	protected void setBaseCurAmt(RsltR rsltR) {
		rsltR.base_cur_onr_prov_upri(convToBaseCur(rsltR.trd_cur_onr_prov_upri(), rsltR.xrate(), rsltR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_onr_prov_amt(convToBaseCur(rsltR.trd_cur_onr_prov_amt(), rsltR.xrate(), rsltR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_proc_upri(convToBaseCur(rsltR.trd_cur_proc_upri(), rsltR.xrate(), rsltR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_proc_amt(convToBaseCur(rsltR.trd_cur_proc_amt(), rsltR.xrate(), rsltR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_upri(convToBaseCur(rsltR.trd_cur_upri(), rsltR.xrate(), rsltR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_amt(convToBaseCur(rsltR.trd_cur_amt(), rsltR.xrate(), rsltR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_tax_amt(convToBaseCur(rsltR.trd_cur_tax_amt(), rsltR.xrate(), rsltR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.base_cur_inc_tax_amt(convToBaseCur(rsltR.trd_cur_inc_tax_amt(), rsltR.xrate(), rsltR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	/**
	 * 納税通貨項目に取引通貨項目を元に値を設定します
	 * @param rsltR
	 */
	protected void setPtaxCurAmt(RsltR rsltR) {
		rsltR.ptax_cur_onr_prov_upri(convCur(rsltR.trd_cur_onr_prov_upri(), rsltR.ptax_xrate(), rsltR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_onr_prov_amt(convCur(rsltR.trd_cur_onr_prov_amt(), rsltR.ptax_xrate(), rsltR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_proc_upri(convCur(rsltR.trd_cur_proc_upri(), rsltR.ptax_xrate(), rsltR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_proc_amt(convCur(rsltR.trd_cur_proc_amt(), rsltR.ptax_xrate(), rsltR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_upri(convCur(rsltR.trd_cur_upri(), rsltR.ptax_xrate(), rsltR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_amt(convCur(rsltR.trd_cur_amt(), rsltR.ptax_xrate(), rsltR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_tax_amt(convCur(rsltR.trd_cur_tax_amt(), rsltR.ptax_xrate(), rsltR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rsltR.ptax_cur_inc_tax_amt(convCur(rsltR.trd_cur_inc_tax_amt(), rsltR.ptax_xrate(), rsltR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	// -----------------------------------------------
	// リスト取得
	// -----------------------------------------------
	@Override
	public MCList getRslt_in_to_loc_cd(
			MCRow row,
			MCEventInfo info) {
		setLocBind(row, info.getEventIndex());
		return super.getRslt_in_to_loc_cd(row, info);
	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnRslt_in_to_loc_cd || beans == columnRslt_re_arr_loc_cd) {
			setLocBind(row, eventIndex);
		}
		return row;
	}
	
	protected void setLocBind(MCRow row, int eventIndex) {
		if (isNull(getRsltL().get(eventIndex).outsrc_sppl_cd())) {
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
	}
	
	// -----------------------------------------------
	// その他
	// -----------------------------------------------
		
	/**
	 * 経費購買か否かを判定します
	 * @param r
	 * @return
	 */
	protected boolean isPurcXpns(RsltR dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	/**
	 * 対象のレコードが取り消し不可か否かを判定します。
	 * @param dtlR
	 * @return
	 */
	protected boolean canDel(RsltR dtlR) {
		
		return true;
	}
		
	protected void setDispList(MCList<RsltR> rsltL) {
		if (Cnd_mode_HDR.isSelected()) {
			MCList<RsltR> hdrL = MCList.create(RsltR.class);
			for (MCList<RsltR> list : rsltL.groupList(RsltR.$po_no)) {
				hdrL.add(list.get(0));
			}
			getRsltL().setAll(hdrL);
		}
		else {
			getRsltL().setAll(rsltL);
		}
	}

	// -----------------------------------------------
		// 単価再取得
		// -----------------------------------------------
		/**
		 * 単価再取得対象の明細を取得します。
		 */
		protected MCList<RsltR> getSprtTgtRsltL() {
			MCList<RsltR> upL = MCList.create(RsltR.class);
			for (RsltR r : getRsltL()) {
				if (isTgt(r)){
					upL.add(r);
				}
			}
			return upL;
		}
		/**
		 * 単価再取得対象かどうかを判定します。
		 * @param r
		 * @return
		 */
		protected boolean isTgt(RsltR r) {
			return  r.check() &&
					!r.upri_not_tgt_flg() && 
					!r.isStatusDelete() && 
					!r.isEmpty();
		}
		
		/**
		 * 単価をキャッシュする。
		 */
		protected void cacheUpri(RsltR dtlR) {
			dtlR.old_trd_cur_upri(dtlR.trd_cur_upri());
			dtlR.old_trd_cur_proc_upri(dtlR.trd_cur_proc_upri());
			dtlR.old_trd_cur_onr_prov_upri(dtlR.trd_cur_onr_prov_upri());
			dtlR.old_interim_flg(dtlR.interim_flg());
		}
		/**
		 * 単価をキャッシュした値に戻す。
		 */
		protected void restoreUpri(RsltR dtlR) {
			int idx = dtlR.getGUIIndex();
			MCNumber upri = dtlR.old_trd_cur_upri();
			MCNumber procUpri = dtlR.old_trd_cur_proc_upri();
			MCNumber onrProvUpri = dtlR.old_trd_cur_onr_prov_upri();
			boolean interimFlg = dtlR.old_interim_flg();
			setValueEx(columnRslt_trd_cur_upri, idx, upri);
			setValueEx(columnRslt_trd_cur_proc_upri, idx, procUpri);
			setValueEx(columnRslt_trd_cur_onr_prov_upri, idx, onrProvUpri);
			setValueEx(columnRslt_interim_flg, idx, interimFlg);
		}
		/**
		 * 単価のイベントを発生させる。
		 */
		protected void doUpriEvent(RsltR dtlR) {
			int idx = dtlR.getGUIIndex();
			MCNumber upri = dtlR.trd_cur_upri();
			MCNumber procUpri = dtlR.trd_cur_proc_upri();
			MCNumber onrProvUpri = dtlR.trd_cur_onr_prov_upri();
			// 同一値でイベントを発生させるために一度クリアする
			setValueEx(columnRslt_trd_cur_upri, idx, null);
			setValueEx(columnRslt_trd_cur_proc_upri, idx, null);
			setValueEx(columnRslt_trd_cur_onr_prov_upri, idx, null);
			// イベントを発生させる
			setValueEx(columnRslt_trd_cur_upri, idx, upri);
			setValueEx(columnRslt_trd_cur_proc_upri, idx, procUpri);
			setValueEx(columnRslt_trd_cur_onr_prov_upri, idx, onrProvUpri);
		}
		/**
		 * 異なる単価の明細が含まれるかどうかを判定します。
		 */
		protected void setDiffLatestUpriMsg(MCMessageList msgL, RsltR dtlR) {
			if (isNullOr(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
				return;
			}
			if (!isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
				msgL.add(new MCMessage(dtlR, null, MSBDP0005,
						columnRslt_trd_cur_upri.getLabelByLocale(), 
						dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
			}
			if (!isSame(dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri())) {
				msgL.add(new MCMessage(dtlR, null, MSBDP0005,
						columnRslt_trd_cur_proc_upri.getLabelByLocale(), 
						dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri(), toDispGUIIndex(dtlR)));
			}
			if (!isSame(dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri())) {
				msgL.add(new MCMessage(dtlR, null, MSBDP0005,
						columnRslt_trd_cur_onr_prov_upri.getLabelByLocale(), 
						dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri(), toDispGUIIndex(dtlR)));
			}
		}
	// -----------------------------------------------
	// fillspace
	// -----------------------------------------------
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		bulkSet(r, false);
		Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
	}
	@Override
	public MCTable<RsltR> getListRegTable() {
		return RsltTable;
	}		

	/**
	 * 取消計上日を設定する<br>
	 * 取消計上日は、検索時点の計上日が設定される
	 */
	protected void setCanAcDt(MCList<RsltR> down) {
		down.forEach(r -> r.can_ac_dt(r.ac_dt()));
	}

	/**
	 * 良品区分チェック
	 * @return メッセージリスト
	 */
	protected MCMessageList qualityTypChk(MCList<RsltR> up) {
		MCMessageList msgL = new MCMessageList();
		
		for (RsltR dr : up) {
			
			if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(dr.stk_id_typ())
					&& MAC_QUALITY_TYP.isDFCT_INSP(dr.quality_typ())
					&& hasCost(dr)) {
				// 仕入検収前で検査不良の在庫を仕入計上しようとした場合
				msgL.add(new MCMessage(dr, RsltR.$quality_typ, MSBDP0011, toDispGUIIndex(dr)));
			}
		}		
		return msgL;
	}
	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk(MCList<RsltR> up) {
		MCMessageList msgL = new MCMessageList();
		
		// 予定NO毎に入力値チェックを行う
		MCGroupByPolicy grpKey = new MCGroupByPolicy(RsltR.$purc_schd_no, RsltR.$purc_schd_qty, RsltR.$purc_qty,
				RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3);
		
		grpKey.sum(RsltR.$base_unit_qty);
		
		MCIndexKey purcIdxKey =getRsltL().createIndex(RsltR.$check, RsltR.$purc_schd_no);
		
		MCList<RsltR> purcSchdGroup = up.groupBy(grpKey);
		for (RsltR psGrpRow : purcSchdGroup) {
			
			if (isNull(psGrpRow.purc_schd_no())) {
				continue;
			}
			
			MCList<RsltR> purcActDL = getRsltL().subList(purcIdxKey, true, psGrpRow.purc_schd_no());
			if (!purcActDL.isEmpty()) {
				msgL.addAll(doInptChk(MAC_FUNC_TYP.PURC.value(),
						columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
						columnRslt_purc_act_no, columnRslt_base_unit_qty_bef,
						columnRslt_base_unit_qty, columnRslt_purc_act_qty, columnRslt_purc_schd_qty,
						purcActDL, columnRslt_trd_unit_qty, columnRslt_purc_schd_no));
			}
		}
		
		return msgL;
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			MCButton b = getDCOpenTgt();
			if (b.isEnabled()) {
				b.doAP();
			}	
		}	
	}
	
	/**
	 * DCイベントで実行するボタンを返す。
	 */
	protected MCButton getDCOpenTgt() {
		return Btn_open_MSBDP0140;
	}
	//----------------------------------
	// 源泉税率関連
	//----------------------------------
	/**
	 * 源泉税率取得
	 * @param r
	 */
	protected void setWtaxRate(RsltR r) {
		if (canEditWtaxRate(r)) {
			if (isNull(r.src_wtax_rate())) {
				// 源泉税率取得
				MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						r.purc_dt(),
						this);
				setValueEx(columnRslt_wtax_rate, r.getGUIIndex(), wtaxRate);
			}
		}
		else {
			clearWtaxRate(r);
		}
	}
	/**
	 * 源泉税率をクリアします
	 * @param dtlR
	 */
	protected void clearWtaxRate(RsltR dtlR) {
		if (!canEditWtaxRate(dtlR)) {
			setValueEx(columnRslt_wtax_rate, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(RsltR dtlR) {
		String purcIdTyp = dtlR.purc_id_typ();
		String trdCurCd = dtlR.trd_cur_cd();
		String baseCurCd = dtlR.base_cur_cd();
		String ptaxCurCd = dtlR.ptax_cur_cd();
		
		if (MAC_PURC_ID_TYP.isVMI(purcIdTyp)
				|| MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
			return false;
		}
		else {
			if (isSame(trdCurCd, baseCurCd)
					&& (isSame(trdCurCd, ptaxCurCd) || isNull(ptaxCurCd))) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/**
	 * 金額表示対象かどうか
	 */
	protected boolean hasCost(RsltR dtlR) {
		return !dtlR.ncv_flg() && !dtlR.accpt_dfct_flg();
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnRslt_ac_dt;
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
		return columnRslt_check;
	}
	/***
	 * 変更前金額情報を部品に連携します。
	 */
	protected void setOrgAmt() {
		for(RsltR r :getRsltL()) {
			r.trd_upri_amt_p().org_trd_cur_dscnt_amt(r.src_trd_cur_dscnt_amt());
			r.trd_upri_amt_p().org_qty(r.src_trd_unit_qty());
		}
	}
	/**
	 * 受領インボイス対象か否かを判定します。
	 * @return
	 */
	protected boolean isRcptIv (RsltR r) {
		if (r.sppl_iv_flg() && (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))) {
			return true;
		}
		return false;
	}

}