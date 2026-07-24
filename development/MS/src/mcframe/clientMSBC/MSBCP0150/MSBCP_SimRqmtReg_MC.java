package mcframe.clientMSBC.MSBCP0150;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import java.util.*;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.sys.MCSys;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMSUC.MSUCP0030.MSUCP_ProdListLogic;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_SimRqmtReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_SimRqmtReg_MC extends MSBCP_SimRqmtReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Map<MCNumber, MCList<RsltRqmtR>> _rsltRqmtMap = new HashMap<MCNumber, MCList<RsltRqmtR>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimRqmtReg_MC() {
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
	public MSBCP_SimRqmtReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[BtnSim]のボタン[open_FSBGP0140]の押下時の処理
	 */
	@Override
	public void doBtnSim_open_FSBGP0140(MCEventInfo info) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("FS", "FSBGP0140");
			mcframe.clientFSBG.FSBGP0140.CndR to = mcframe.clientFSBG.FSBGP0140.CndR.create();
			to.start_dt_fr(MCDate.now().trunc(MCDateFieldType.DAY));
			aso.putCnd(to);
			aso.putSearchAction();
			aso.show();
	}

	@Override
	public boolean useFileIn(MCTable table) {
		if (Cnd_ope_UPD.isSelected()) {
			if (table == RsltRqmtTable) {
				RsltSimR simR = RsltSimTable.getSelectedMCRow();
				
				if (!isNull(simR)) {
					if (!isPrmsOrAdjst(simR)
							&& !simR.exp_flg()
							&& !MAC_RTN_STS_TYP.isOK(simR.rtn_sts_typ())
					){
						return true;
					}
				}
			}
		}
		return super.useFileIn(table);	
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBCL0150_Imp01();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltRqmtTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

	@Override
	protected void changeFileInRowStatus() {
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		
		for (RsltRqmtR r : getRsltRqmtL()) {
			
			r.peg_no1(simR.peg_no1());
			if (!isNull(r.rqmt_no())) {
				r.setStatus(MCRow.MODIFY);
			}
		}
	}

	/**
	 * RsltRqmtの結果にひとつでもERRがあったらRsltSimの結果にERRをセットする
	 */
	protected void setSimRtnStsTyp() {
		boolean rtnOkFlg = true;
		for (RsltRqmtR r : getRsltRqmtL()) {
			if (MAC_RTN_STS_TYP.isERR(r.rqmt_rtn_sts_typ())) {
				rtnOkFlg = false;
				break;
			}
		}
		RsltSimR Simr = RsltSimTable.getSelectedMCRow();
		if (!rtnOkFlg) {
			Simr.rts_msg_p().rtn_sts_typ_nm(MAC_RTN_STS_TYP.ERR.name());
		}
	}
	
	/**
	 * Panel[BtnRqmt]のボタン[sno_select_all]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_sno_select_all(MCEventInfo info) {
		for (RsltRqmtR r : RsltRqmtTable.getViewRows()) {
			int i = r.getGUIIndex();
			if (isEditable(columnRsltRqmt_sno_sprt_flg, i)) {
				setValueEx(columnRsltRqmt_sno_sprt_flg, i, r.check());
			}
		}
	}
	/**
	 * Panel[BtnRqmt]のボタン[sno_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_sno_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltRqmtTable, columnRsltRqmt_sno_sprt_flg);
	}

	/**
	 * 明細行IDカウンタをリセット
	 */
	protected void resetCnt() {
		_dtl_row_id = 0;
	}

	/**
	 * 	明細の最大の明細行IDをカウンタに設定する
	 * <p>
	 * 	検索結果で明細と詳細の親子のペアで同一の明細行ＩＤが連番で設定される前提。
	 * </p>
	 */
	protected void setCnt() {
		_dtl_row_id = 0;
		MCNumber max_dtl_row_id = (MCNumber) getRsltSimL().max(RsltSimR.$peg_no1);
		_dtl_row_id = max_dtl_row_id.intValue();
		_dtl_row_id++;
	}

	protected int nextCnt() {
		return _dtl_row_id++;
	}

	/**
	 * 明細行紐付けID
	 * <p>
	 * 	明細と紐づく日次生産依頼情報を関連付けする揮発性のID<br>
	 * 	サーバ通信処理までは連携するがDB登録はしない
	 * </p>
	 */
	protected int _dtl_row_id = 0;

	/**
	 * 	明細(親)にぶら下がっている詳細(子)のリストを取得する
	 */
	protected MCList<RsltRqmtR> getChildRsltRqmtL(RsltSimR parRsltSimR) {
		MCList<RsltRqmtR> l = MCList.create(RsltRqmtR.class);
		l.addAll(_rsltRqmtMap.get(parRsltSimR.peg_no1()));
		return l;
	}

	/**
	 * 	選択された管理情報に紐づく依頼情報のリストを画面上に表示する
	 */
	protected void showChildL() {
		getRsltRqmtL().clear();
		
		RsltSimR selectedRow = RsltSimTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			// マッパから子の詳細データのみを抽出
			MCList<RsltRqmtR> chdL = getChildRsltRqmtL(selectedRow);
			getRsltRqmtL().setAll(chdL);
		}
	}

	/**
	 *シミュレーションNOのない 明細行を削除する
	 */
	protected void delRqmtAll(RsltSimR r1){
		if (getRsltRqmtL().size() == 0) {
			return;
		}
		MCList<RsltRqmtR> tmp = MCList.create(RsltRqmtR.class);
		for (RsltRqmtR r : getChildRsltRqmtL(r1)) {
			if (isNull(r.rqmt_no())) {
				tmp.add(r);
			}
		}
		if (!tmp.isEmpty()) {
			getRsltRqmtL().removeAll(tmp);
			_rsltRqmtMap.get(r1.peg_no1()).removeAll(tmp);
		}
	}
	
	/**
	 * [MS_MSBCL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Srch01Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_mrp_proc_dt_from, Cnd_mrp_proc_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}

		@Override
		protected void show(){
			super.show();
			setCnt();
			setHiddenList(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			resetCnt();
		}
	}

	/**
	 * [MS_MSBCL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Sprt01Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL0150_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP0001);
		}
		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			return getRsltRqmtL().subList(RsltRqmtR.$sno_sprt_flg, true);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			MCList<RsltRqmtR> RsltRqmtL = getRsltRqmtL().subList(RsltRqmtR.$sno_sprt_flg, true);
			
			for (RsltRqmtR RsltRqmtR : RsltRqmtL) {
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_due_dt));
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_itm_cd));
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_itm_sub1));
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_itm_sub2));
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_itm_sub3));
				msgList.addAll(panel.checkReq(RsltRqmtR.getGUIIndex(), columnRsltRqmt_strg_loc_cd));
			}
		}
	}

	/**
	 * [MS_MSBCL0150_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Imp01Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL0150_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			
			RsltSimR simR = RsltSimTable.getSelectedMCRow();

			getRsltRqmtL().setValue(RsltRqmtR.$sim_mrp_typ, simR.sim_mrp_typ());
			if (!isNull(simR)) {
				getRsltRqmtL().setValue(RsltRqmtR.$sim_mrp_no, simR.sim_mrp_no());
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setUPD_FIXStatus();
			}
			else {
				RsltSimR simR = RsltSimTable.getSelectedMCRow();
				_rsltRqmtMap.get(simR.peg_no1()).removeAll(getChildRsltRqmtL(simR));
				_rsltRqmtMap.get(simR.peg_no1()).addAll(getRsltRqmtL());
				setUPD_DTLStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasNg() {
			if (bridge.down0().subList(RsltRqmtR.$rqmt_rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()).size() > 0) {
				return true;
			}
			return false;
		}

		@Override
		protected void setModeMCEx(MCException ex){
			super.setModeMCEx(ex);
			setUPD_FIXStatus();
		}

		@Override
		protected void show() {
			super.show();

			RsltSimR simR = RsltSimTable.getSelectedMCRow();
			if (!isNull(simR)) {
				simR.check(true);
				if (!isNull(simR.sim_mrp_no())){
					simR.setStatus(Status.MODIFY);
				}
				for (RsltRqmtR r : getRsltRqmtL()) {
					r.check(true);
					r.peg_no1(simR.peg_no1());
				}
			}
			_rsltRqmtMap.get(simR.peg_no1()).addAll(getRsltRqmtL());
			setSimRtnStsTyp();
		}
	}

	/**
	 * 該当行のシミュレーションMRP区分が需給調整用または納期回答用か否かを返す
	 * @param val
	 * @return
	 */
	protected Boolean isPrmsOrAdjst(RsltSimR row){
		if (MSC_SIM_MRP_TYP.isPRMS(row.sim_mrp_typ())
				|| MSC_SIM_MRP_TYP.isSD_ADJST(row.sim_mrp_typ())) {
			return true;
		}
		return false;
	}

	/**
	 * [MS_MSBCL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Upd01Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0150_Upd01Caller(P p, B b) {
			super(p, b);
		}

		// チェック対象のリスト
		protected MCList<RsltSimR> _RsltSimLForCall = MCList.create(RsltSimR.class);
		protected MCList<RsltRqmtR> _RsltRqmtLForCall = MCList.create(RsltRqmtR.class);

		@Override
		protected void initCaller() {
			super.initCaller();

			//シミュレーションMRP区分が需給調整用・納期回答用の場合は、
			//紐付くシュミレーション日次生産依頼情報を削除する。
			_RsltSimLForCall = getRsltSimL().subList(RsltSimR.$check,true);
			for (RsltSimR r : _RsltSimLForCall) {
				if (isPrmsOrAdjst(r)) {
					delRqmtAll(r);
					MCList<RsltRqmtR> rqmtL =  getChildRsltRqmtL(r);
					rqmtL.setStatus(Status.DELETE);
					rqmtL.setBoolean(RsltRqmtR.$check, true);
				}
			}

			for(RsltSimR r : _RsltSimLForCall){
				MCList<RsltRqmtR> list = _rsltRqmtMap.get(r.peg_no1());
				if (!isNull(list)) {
					MCList<RsltRqmtR> subL = list.subList(RsltRqmtR.$check, true);
					if (!isNull(subL)) {
						_RsltRqmtLForCall.addAll(subL);
					}
				}
			}

			// 非表示リストのブロックにGUIIndexを連番で設定
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(_RsltSimLForCall);
			bridge.up1().setAll(_RsltRqmtLForCall);
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(1, _RsltRqmtLForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(1, _RsltRqmtLForCall);
			return result;
		}

		@Override
		protected void show() {
			super.show();

			setRtnMsg();
			setUnEditableFlg();
			setBtnRqmtMode();
		}
		protected void setRtnMsg() {
			String[] downCols = {RsltSimR.$peg_no1};
			String[] causeRowCols = {RsltRqmtR.$peg_no1};
			RsltSim_rts_msg_p_PPanel.setMsgByKeyCols(_RsltSimLForCall, downCols, getMessages(), causeRowCols);
		}

		/*
		 * 結果を元に下段の変更不可ＦＬＧをオンにする
		 */
		protected void setUnEditableFlg() {
			for(RsltSimR simR : bridge.down0()) {
				if (MAC_RTN_STS_TYP.isOK(simR.rtn_sts_typ())) {
					MCList<RsltRqmtR> chdL = getChildRsltRqmtL(simR);
					for (RsltRqmtR chdR : chdL) {
						chdR.un_editable_flg(true);
					}
				}
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getRsltSimL());
		}
	}

	@Override
	public void setFocus(MCMessage msg) {
		// 下部一覧でエラーが発生した場合は、上部一覧にフォーカスを飛ばす
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof RsltRqmtR) {
			for (RsltSimR r : getRsltSimL()) {
				if (isSame(((RsltRqmtR) msg.getCauseRow()).peg_no1(), r.peg_no1())) {
					RsltSimTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

	/**
	 * [MS_MSBCL0150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Del01Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0150_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0150_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Upd02Caller<P extends MSBCP_SimRqmtReg, B extends MS_MSBCL0150_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0150_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0150_Srch01();
	}

	//画面遷移実装 Start	
	/**
	 * Panel[BtnSim]のボタン[open_MSBCP0160]の押下時の処理
	 */
	@Override
	public void doBtnSim_open_MSBCP0160(MCEventInfo info) {
		RsltSimR r = RsltSimTable.getSelectedMCRow();
		if (isEnableBtn_open_MSBCP0160(r)) {
			doBtn_open_MSBCP0160(r);
		}
	}

	/**
	 * Panel[BtnSim]のボタン[open_MSBCP0170]の押下時の処理
	 */
	@Override
	public void doBtnSim_open_MSBCP0170(MCEventInfo info) {
		RsltSimR r = RsltSimTable.getSelectedMCRow();
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0170");
		mcframe.clientMSBC.MSBCP0170.CndR to = mcframe.clientMSBC.MSBCP0170.CndR.create();
		to.sim_mrp_no(r.sim_mrp_no());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}

	/**
	 * Panel[BtnSim]のボタン[open_MSBCP0180]の押下時の処理
	 */
	@Override
	public void doBtnSim_open_MSBCP0180(MCEventInfo info) {
		RsltSimR r = RsltSimTable.getSelectedMCRow();
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0180");
		mcframe.clientMSBC.MSBCP0180.CndR to = mcframe.clientMSBC.MSBCP0180.CndR.create();
		to.sim_mrp_no(r.sim_mrp_no());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}

	/**
	 * Panel[BtnRqmt]のボタン[open_MSBCP0190]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_open_MSBCP0190(MCEventInfo info) {
		RsltRqmtR r = RsltRqmtTable.getSelectedMCRow();
		if (isEnableBtn_open_MSBCP0190(r)) {
			doBtn_open_MSBCP0190(r);
		}
	}

	/** ダブルクリック */
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltRqmtTable) {
			int index = info.getEventIndex();
			RsltRqmtR r = getRsltRqmtL().get(index);
			if (isEnableBtn_open_MSBCP0190(r)) {
				doBtn_open_MSBCP0190(r);
			}
		}	else if (compo == RsltSimTable) {
			int index = info.getEventIndex();
			RsltSimR r = getRsltSimL().get(index);
			if (isEnableBtn_open_MSBCP0160(r)) {
				doBtn_open_MSBCP0160(r);
			}
		}
	}

	/**
	 * オーダ確認画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBCP0160(RsltSimR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.mrp_proc_dt());
	}

	/**
	 * オーダ展開画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBCP0190(RsltRqmtR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.rqmt_no()) ;
	}

	protected void doBtn_open_MSBCP0160(RsltSimR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0160");
		aso.putCnd(crtOpenMSBCP0160CndR(aso,r));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0160.CndR crtOpenMSBCP0160CndR(MAUCP_AppScreenOpener aso, RsltSimR r){
		mcframe.clientMSBC.MSBCP0160.CndR to = mcframe.clientMSBC.MSBCP0160.CndR.create();
		to.sim_mrp_no(r.sim_mrp_no());
		return to;
	}

	protected void doBtn_open_MSBCP0190(RsltRqmtR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0190");
		aso.putCnd(crtOpenMSBCP0190CndR(aso,r));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0190.CndR crtOpenMSBCP0190CndR(MAUCP_AppScreenOpener aso, RsltRqmtR r){
		mcframe.clientMSBC.MSBCP0190.CndR to = mcframe.clientMSBC.MSBCP0190.CndR.create();
		to.rqmt_no(r.rqmt_no());
		to.sim_mrp_no(r.sim_mrp_no());
		return to;
	}

	//画面遷移実装 End	
	
	/**
	 * Panel[BtnSim]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtnSim_select_all(MCEventInfo info) {
		doSelectAll(RsltSimTable);		
	}

	/**
	 * Panel[BtnSim]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtnSim_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltSimTable);
	}

	/**
	 * Panel[BtnSim]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtnSim_radd(MCEventInfo info) {
		RsltSimR insR = insertRow(RsltSimTable);

		insR.peg_no1(nextCnt());
		setValueEx(columnRsltSim_sim_usr_cd, insR.getGUIIndex(), mcframe.clientCore.sys.MCSys.user.ID());
		insR.check(true);
		_rsltRqmtMap.put(insR.peg_no1(), MCList.create(RsltRqmtR.class));
	}

	/**
	 * Panel[BtnSim]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtnSim_rdel(MCEventInfo info) {
		RsltSimR delR = deleteRow(RsltSimTable);
		if (delR == null) {
			return;
		}

		// キャッシュの更新
		if (_rsltRqmtMap.containsKey(delR.peg_no1())) {
			_rsltRqmtMap.remove(delR.peg_no1());
		}
	}

	/**
	 * Panel[BtnSim]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtnSim_rcopy(MCEventInfo info) {
		RsltSimR copyR = copyRow(RsltSimTable);
		copyR.peg_no1(nextCnt());
		copyR.sim_mrp_no(null);
		copyR.mrp_proc_dt(null);
		copyR.exp_flg(false);

		setBtnSimMode();
		RsltRqmtTable.clear();
		_rsltRqmtMap.put(copyR.peg_no1(), MCList.create(RsltRqmtR.class));
		if (!isPrmsOrAdjst(copyR)) {
			showChildL();
			rsltRqmtFillSpace();
		}
		setBtnRqmtMode();
	}

	/**
	 * Panel[BtnRqmt]のボタン[sprt_sno]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_sprt_sno(MCEventInfo info) {
		callMS_MSBCL0150_Sprt01();
	}

	/**
	 * Panel[BtnRqmt]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_select_all(MCEventInfo info) {
		// 行追加処理時の自動設定項目除くカラム　ref:doBtnRqmt_radd
		String[] cols = MCCollectionUtil.remove(RsltRqmtR.colnames(), new String[0], 
				RsltRqmtR.$wg_cd, RsltRqmtR.$wg_nm,
				RsltRqmtR.$peg_no1, RsltRqmtR.$sim_mrp_no
				);
		for (RsltRqmtR row : RsltRqmtTable.getViewRows()) {
			int i = row.getGUIIndex();
			// 編集可能かつ固定カラムが一つでも空でない行を選択チェック
			if (isEditable(columnRsltRqmt_check, i) && !row.isEmpty(cols)) {
				setValueEx(columnRsltRqmt_check, i, true);
			}
		}
	}

	/**
	 * Panel[BtnRqmt]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltRqmtTable);
	}

	/**
	 * Panel[BtnRqmt]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_radd(MCEventInfo info) {
		RsltRqmtR RsltRqmtR = insertRow(RsltRqmtTable);
		RsltSimR RsltSimR = RsltSimTable.getSelectedMCRow();
		// 明細一覧の選択行の品目情報を追加行へコピー
		copyRsltSim2RsltRqmtInfo(RsltRqmtR, RsltSimR);
		RsltRqmtR.check(true);
		syncUpdSts(RsltSimTable.getSelectedMCRow());
	}

	/**
	 * Panel[BtnRqmt]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_rdel(MCEventInfo info) {

		int cntBfr = getRsltRqmtL().size();
		RsltRqmtR delRsltRqmtR = deleteRow(RsltRqmtTable);
		int cntAft = getRsltRqmtL().size();

		if (cntBfr > cntAft) {
			// 詳細の削除行が一覧から削除された場合（DELETEステータスで残らない場合）、マップからも削除
			if (delRsltRqmtR.isStatusCreate()){
				_rsltRqmtMap.get(delRsltRqmtR.peg_no1()).remove(delRsltRqmtR);
			}
		}
		syncUpdSts(RsltSimTable.getSelectedMCRow());
	}

	/**
	 * Panel[BtnRqmt]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_rcopy(MCEventInfo info) {
		RsltRqmtR RsltRqmtR = copyRow(RsltRqmtTable);
		if (RsltRqmtR == null) {
			return;
		}

		RsltRqmtR.check(true);
		RsltRqmtR.rqmt_no(null);

		_rsltRqmtMap.get(RsltRqmtR.peg_no1()).add(RsltRqmtR);

		syncUpdSts(RsltSimTable.getSelectedMCRow());
	}

	/**
	 * Panel[BtnRqmt]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_upd(MCEventInfo info) {
		callMS_MSBCL0150_Upd01();
	}

	/**
	 *	明細の品目情報を入力予定の指定行へコピーする
	 * @param dest
	 * @param src
	 */
	protected void copyRsltSim2RsltRqmtInfo(RsltRqmtR dest, RsltSimR src) {
		dest.wg_cd(src.wg_cd());
		dest.wg_nm(src.wg_nm());
		dest.peg_no1(src.peg_no1());
		dest.sim_mrp_no(src.sim_mrp_no());
	}

	/**
	 * Panel[BtnRqmt]のボタン[upd02]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_upd02(MCEventInfo info) {
		callMS_MSBCL0150_Upd02();
	}

	/**
	 * Panel[BtnRqmt]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtnRqmt_del(MCEventInfo info) {
		callMS_MSBCL0150_Del01();
	}

	// -----------------------------------------------
		// init-screen
	protected void rsltRqmtFillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltRqmtTable.fillSpace();
			for (RsltRqmtR r : getRsltRqmtL()) {
				if (isNull(r.peg_no1())) {
					RsltSimR row = RsltSimTable.getSelectedMCRow();
					r.peg_no1(row.peg_no1());
					r.wg_cd(row.wg_cd());
				}
			}
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (getSnoTyp(this) == 0) {
			setComponentInvisibleAllStatus(BtnRqmt_label_sno, BtnRqmt_sno_select_all, BtnRqmt_sno_deselect_all, BtnRqmt_sprt_sno);
		}
	}
	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltSimTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		RsltRqmt_rqmt_qty_p_PPanel.setRelateBeans(columnRsltRqmt_unit_cd, columnRsltRqmt_dec_place);
		RsltRqmt_sno_wrkno_p_PPanel.setRelateBeans(columnRsltRqmt_itm_cd, columnRsltRqmt_itm_sub1,
				columnRsltRqmt_itm_sub2, columnRsltRqmt_itm_sub3, columnRsltRqmt_sno1_mng_typ,
				columnRsltRqmt_sno2_mng_typ, columnRsltRqmt_sno3_mng_typ,
				columnRsltRqmt_sno4_mng_typ, columnRsltRqmt_sno1_num_typ,
				columnRsltRqmt_sno2_num_typ, columnRsltRqmt_sno3_num_typ,
				columnRsltRqmt_sno4_num_typ, columnRsltRqmt_rqmt_sno1_flg,
				columnRsltRqmt_rqmt_sno2_flg, columnRsltRqmt_rqmt_sno3_flg,
				columnRsltRqmt_rqmt_sno4_flg);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		getRsltRqmt_strg_loc_cd_ListPutter().putBind(LocCols.$m_rd_flg , MCMode.READ_ONLY.getName());
		getRsltRqmt_strg_loc_cd_ListPutter().putBind(LocCols.$m_wr_flg , MCMode.READ_ONLY.getName());
		getRsltSim_sim_usr_cd_ListPutter().putBind(UsrCols.$i_dt, getToday());
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind,
			mcframe.clientCore.beans.list.MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);

		if (beans == columnRsltRqmt_itm_cd) {
			RsltRqmtR rqmtR = getRsltRqmtL().get(eventIndex);
			MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
			RsltSimR simR = getRsltSimL().getFirst(idxKey, rqmtR.peg_no1());
			if (MSC_SIM_MRP_TYP.isMST_CHK(simR.sim_mrp_typ())) {
				row.setBooleanNE(ItmCols.$i_release_flg_on, true);
				row.setBooleanNE(ItmCols.$i_release_flg_off, true);
			}
		}

		return row;
	}

	@Override
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		RsltRqmtR rqmtR = getRsltRqmtL().get(info.getEventIndex());
		MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
		RsltSimR simR = getRsltSimL().getFirst(idxKey, rqmtR.peg_no1());

		if (MSC_SIM_MRP_TYP.isMST_CHK(simR.sim_mrp_typ())) {
			row.setBooleanNE(ItmCols.$i_release_flg_on, true);
			row.setBooleanNE(ItmCols.$i_release_flg_off, true);
		}

		return super.getRsltRqmt_itm_p_PPanel_columnItm_itm_cd(row, info);
	}

	@Override
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1(MCRow row,
			MCEventInfo info) {
		RsltRqmtR rqmtR = getRsltRqmtL().get(info.getEventIndex());
		MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
		RsltSimR simR = getRsltSimL().getFirst(idxKey, rqmtR.peg_no1());

		if (MSC_SIM_MRP_TYP.isMST_CHK(simR.sim_mrp_typ())) {
			row.setBooleanNE(ItmSub1Cols.$i_release_flg_on, true);
			row.setBooleanNE(ItmSub1Cols.$i_release_flg_off, true);
		}

		return super.getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1(row, info);
	}

	@Override
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2(MCRow row,
			MCEventInfo info) {
		RsltRqmtR rqmtR = getRsltRqmtL().get(info.getEventIndex());
		MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
		RsltSimR simR = getRsltSimL().getFirst(idxKey, rqmtR.peg_no1());

		if (MSC_SIM_MRP_TYP.isMST_CHK(simR.sim_mrp_typ())) {
			row.setBooleanNE(ItmSub2Cols.$i_release_flg_on, true);
			row.setBooleanNE(ItmSub2Cols.$i_release_flg_off, true);
		}

		return super.getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2(row, info);
	}

	@Override
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3(MCRow row,
			MCEventInfo info) {
		RsltRqmtR rqmtR = getRsltRqmtL().get(info.getEventIndex());
		MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
		RsltSimR simR = getRsltSimL().getFirst(idxKey, rqmtR.peg_no1());

		if (MSC_SIM_MRP_TYP.isMST_CHK(simR.sim_mrp_typ())) {
			row.setBooleanNE(ItmSub3Cols.$i_release_flg_on, true);
			row.setBooleanNE(ItmSub3Cols.$i_release_flg_off, true);
		}

		return super.getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3(row, info);
	}

	/**
	 * 登録種別時の初期値設定
	 */
	protected void insInit() {
		CndPanel.focusFirstComponent();
	}
		// -----------------------------------------------
	// status
	
	@Override
	public void setUPD_HDRStatus() {
		super.setUPD_HDRStatus();
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		insInit();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
	}

	@Override
	public void setUPD_DTLStatus() {
		super.setUPD_DTLStatus();
		if (getRsltRqmtL().size()>0){
			RsltRqmtTable.selectRowNoFocus(0);
		}
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
		if (isPrmsOrAdjst(simR)) {
			delRqmtAll(simR);
		}
		else {
			rsltRqmtFillSpace();
		}
		setBtnRqmtMode();
	}

	@Override
	public void setUPD_FIXStatus() {
		super.setUPD_FIXStatus();
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
	}

	@Override
	public void setINSTStatus() {
		super.setINSTStatus();
		RsltRqmtR rqR = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simR = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(rqR);
		simLinkBtnMode(simR);
		setBtnSimMode();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			CndPanel.focusFirstComponent();
			setUPD_HDRStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_INT.isSelected()) {
			setSRCH_INSTStatus();
		}
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			RsltSimTable.selectLeftmostColumn(0);
			setUPD_DTLStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			RsltSimTable.selectLeftmostColumn(0);
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			RsltSimTable.selectLeftmostColumn(0);
			setREFStatus();
		}
		else if (Cnd_ope_INT.isSelected()) {
			RsltSimTable.selectLeftmostColumn(0);
			setINSTStatus();
		}
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_DTL) || isSame(getStatus(), UPD_HDR);
	}

	protected boolean isInstStatus() {
		return isSame(getStatus(), INST);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected void simLinkBtnMode(RsltSimR row){
		if (!isNull(row)) {
			if (!isNull(row.mrp_proc_dt())) {
				BtnSim_open_MSBCP0160.setMode(MCMode.ENABLE);
				BtnSim_open_MSBCP0170.setMode(MCMode.ENABLE);
				BtnSim_open_MSBCP0180.setMode(MCMode.ENABLE);
				return;
			}
		}
		BtnSim_open_MSBCP0160.setMode(MCMode.DISABLE);
		BtnSim_open_MSBCP0170.setMode(MCMode.DISABLE);
		BtnSim_open_MSBCP0180.setMode(MCMode.DISABLE);
	}

	protected void rqmtLinkBtnMode(RsltRqmtR row){
		if (!isNull(row)) {
			if (!isNull(row.rqmt_no())) {
				BtnRqmt_open_MSBCP0190.setMode(MCMode.ENABLE);
				return;
			}
		}
		BtnRqmt_open_MSBCP0190.setMode(MCMode.DISABLE);
	}

	// -----------------------------------------------
	// event/listener
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getRsltRqmtL()) || isStatusNone(getRsltSimL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doRsltSim_NC(MCEventInfo info) {
		super.doRsltSim_NC(info);
		RsltSimR r = null;
		int idx = info.getEventIndex();
		if (idx >= 0) {
			r = getRsltSimL().get(idx);
		}
		setBtnSimMode();
		showChildL();
		if (r != null && !isNull(r.sim_mrp_typ()) && !isPrmsOrAdjst(r)) {
			rsltRqmtFillSpace();
		}
		RsltRqmtTable.selectLeftmostColumn(0);
		setBtnRqmtMode();
	}

	protected void setBtnSimMode() {
		RsltSimR r = RsltSimTable.getSelectedMCRow();
		simLinkBtnMode(r);

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				BtnSim_rdel.setMode(MCMode.DISABLE);
				BtnSim_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (r.isStatusCreate() || isNull(r.upd_cntr())) {
					setDefaultMode(BtnSim_rdel);
				}
				else {
					BtnSim_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(BtnSim_rcopy);
			}
		}
	}

	@Override
	public void doRsltRqmt_NC(MCEventInfo info) {
		super.doRsltRqmt_NC(info);
		setBtnRqmtMode();
	}

	protected void setBtnRqmtMode() {
		RsltRqmtR r = RsltRqmtTable.getSelectedMCRow();
		RsltSimR simr = RsltSimTable.getSelectedMCRow();
		rqmtLinkBtnMode(r);

		if (isUpdStatus()) {
			if (r == null
					|| simr == null
					|| simr.exp_flg()
					|| MAC_RTN_STS_TYP.isOK(simr.rtn_sts_typ())) {
				// テーブル操作ボタン
				BtnRqmt_rdel.setMode(MCMode.DISABLE);
				BtnRqmt_rcopy.setMode(MCMode.DISABLE);
				BtnRqmt_select_all.setMode(MCMode.DISABLE);
				BtnRqmt_deselect_all.setMode(MCMode.DISABLE);
				BtnRqmt_sno_select_all.setMode(MCMode.DISABLE);
				BtnRqmt_sno_deselect_all.setMode(MCMode.DISABLE);
				BtnRqmt_sprt_sno.setMode(MCMode.DISABLE);
				if (simr == null || simr.exp_flg() || MAC_RTN_STS_TYP.isOK(simr.rtn_sts_typ())
						|| isNull(simr.sim_mrp_typ()) || isPrmsOrAdjst(simr)) {
					BtnRqmt_radd.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(BtnRqmt_radd);
				}
				BtnRqmt_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (!r.un_editable_flg()) {
					setDefaultMode(BtnRqmt_rdel);
				}
				else {
					BtnRqmt_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(BtnRqmt_rcopy);
				setDefaultMode(BtnRqmt_select_all);
				setDefaultMode(BtnRqmt_deselect_all);
				setDefaultMode(BtnRqmt_sno_select_all);
				setDefaultMode(BtnRqmt_sno_deselect_all);
				setDefaultMode(BtnRqmt_sprt_sno);
				setDefaultMode(BtnRqmt_radd);
			}
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_DEL.isSelected()) {
			RsltSimTable.setStatusColumnVisible(false);
			RsltRqmtTable.setStatusColumnVisible(false);
		}
		else {
			RsltSimTable.setStatusColumnVisible(true);
			RsltRqmtTable.setStatusColumnVisible(true);
		}
	}

	// ------------Notification Change------------

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltRqmtL());
		clearContainers(getRsltSimL());
		setSrchStatus();
		setStatusColumn();
	}

	/**
	 * [RsltRqmt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doRsltRqmt_check_NC(MCEventInfo info){
		RsltSimR selectedRow = RsltSimTable.getSelectedMCRow();
		if ((boolean)info.getNewValue()) {
			selectedRow.check(true);
		}
		else if (getRsltRqmtL().subList(RsltRqmtR.$check, true).isEmpty()) {
			selectedRow.check(false);
		}
	}

	/**
	 * [RsltSim]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public void doRsltSim_check_NC(MCEventInfo info){
		MCList<RsltRqmtR> rqmtL = getChildRsltRqmtL(RsltSimTable.getSelectedMCRow());
		for (RsltRqmtR r : rqmtL) {
			r.check(false);
		}
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doRsltSim_sim_mrp_typ_NC(MCEventInfo info){
		RsltSimR r = getRsltSimL().get(info.getEventIndex());
		if (!isNull(getSysParm("DEF_WG_CD"))) {
			if(!r.exp_flg()) {
				showChildL();
			}else {
				delRqmtAll(r);
			}
			setUPD_DTLStatus();
		}
		if (isPrmsOrAdjst(r)){
			BtnRqmt_radd.setMode(MCMode.DISABLE);
			BtnRqmt_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			BtnRqmt_radd.setMode(MCMode.ENABLE);
			BtnRqmt_rcopy.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void doRsltSim_wg_cd_NC(MCEventInfo info){
		super.doRsltSim_wg_cd_NC(info);
		int idx = info.getEventIndex();
		if (idx >= 0) {
			RsltSimR row = getRsltSimL().get(idx);
			if (!isNull(row.wg_cd()) && !row.exp_flg()) {
				if (getRsltRqmtL().size()>0) {
					if (!isSame(getRsltRqmtL().get(0).wg_cd(),row.wg_cd())) {
						delRqmtAll(row);
					}
				}
				showChildL();
				setUPD_DTLStatus();
				return;
			}
			delRqmtAll(row);
		}
		setUPD_DTLStatus();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		RsltRqmt_itm_p_PPanel.addItmLCListner(this);
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(RsltRqmtTable, createRsltRqmtListListener());
	}

	protected MAUDP_RowListener createRsltRqmtListListener() {
		return new RsltRqmtListRowListener();
	}

	protected class RsltRqmtListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			//値を変更した詳細に紐付く明細にチェックをつける
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				r.setValue(RsltRqmtR.$check, true);
				RsltRqmtR rsltRqmtR = (RsltRqmtR)r;
				MCIndexKey idxKey = getRsltSimL().createIndex(RsltSimR.$peg_no1);
				RsltSimR rsltSimR = getRsltSimL().getFirst(idxKey, rsltRqmtR.peg_no1());
				rsltSimR.check(true);
				rsltRqmtR.check(true);
				syncUpdSts(rsltSimR);

				if (r.isStatusCreate()) {
					_rsltRqmtMap.get(rsltSimR.peg_no1()).add(rsltRqmtR);
				}
			}
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (RsltRqmt_itm_p_PPanel.isItm(lc)) {
			doRsltRqmt_itm_LC(info);
		}
	}

	@Override
	public void doRsltSim_sim_mrp_typ_LC(MCEventInfo info) {
		super.doRsltSim_sim_mrp_typ_LC(info);
		RsltSimR r = getRsltSimL().get(info.getEventIndex());
		if (isPrmsOrAdjst(r)) {
			delRqmtAll(r);
			showChildL();
		}
		else {
			rsltRqmtFillSpace();
		}
		setBtnRqmtMode();
	}

	protected void doRsltRqmt_itm_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		setValueEx(columnRsltRqmt_mfg_loc_cd, idx, null);
		setValueEx(columnRsltRqmt_sppl_cd, idx, null);
		setValueEx(columnRsltRqmt_rqst_loc_cd, idx, null);
		setValueEx(columnRsltRqmt_rqmt_qty, idx, null);
		setRqmtTyp(idx);
	}

	@Override
	public void doRsltRqmt_wg_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		setValueEx(columnRsltRqmt_mfg_loc_cd, idx, null);
		setValueEx(columnRsltRqmt_sppl_cd, idx, null);
		setValueEx(columnRsltRqmt_rqst_loc_cd, idx, null);
		setRqmtTyp(idx);
	}
	protected void setRqmtTyp(int idx) {
		RsltRqmtR r = getRsltRqmtL().get(idx);
		MCRow ret = MSUCP_ProdListLogic.getRqmtTyp(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd(), this);
		setValueEx(columnRsltRqmt_rqmt_typ, idx, ret.getStringNE("rqmt_typ"));
	}

	@Override
	public void doRsltRqmt_mfg_loc_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRsltRqmt_sppl_cd, idx, null);
			setValueEx(columnRsltRqmt_rqst_loc_cd, idx, null);
		}
	}

	@Override
	public void doRsltRqmt_sppl_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRsltRqmt_mfg_loc_cd, idx, null);
			setValueEx(columnRsltRqmt_rqst_loc_cd, idx, null);
		}
	}

	@Override
	public void doRsltRqmt_rqst_loc_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRsltRqmt_mfg_loc_cd, idx, null);
			setValueEx(columnRsltRqmt_sppl_cd, idx, null);
		}
	}

	protected void clearHiddenList() {
		_rsltRqmtMap.clear();
	}

	/**
	 * 一覧（シミュレーション一覧、日次生産依頼一覧）の検索結果を設定する。
	 */
	protected void setHiddenList(MCList<RsltSimR> rsltSimL, MCList<RsltRqmtR> rsltRqmtL) {
		MCIndexKey idxKey = rsltRqmtL.createIndex(RsltRqmtR.$peg_no1);
		for (RsltSimR r : rsltSimL) {
			MCList<RsltRqmtR> val = rsltRqmtL.subList(idxKey, r.peg_no1());
			_rsltRqmtMap.put(r.peg_no1(), val);
		}
	}

	protected void syncUpdStsNC(MCEventInfo info){
		int idx = info.getEventIndex();
		if (idx >= 0) {
			RsltRqmtR row = getRsltRqmtL().get(idx);
			if (!row.isStatusNone()) {
				RsltSimR r = RsltSimTable.getSelectedMCRow();
				syncUpdSts(r);
			}
		}
	}

	/**
	 * Simテーブルと所要テーブルの更新ステータスを同期させる
	 */
	protected void syncUpdSts(RsltSimR simRow){
		// Sim行が追加行・削除行の場合、そのまま
		if (simRow.isStatusCreate() || simRow.isStatusDelete()) {
			return;
		}

		// Sim行は対応する所要行に１件でも更新・追加・削除が存在する場合に更新ステータスとする
		for (RsltRqmtR rqmtR : getRsltRqmtL().subList(RsltRqmtR.$peg_no1, simRow.peg_no1())) {
			if (!rqmtR.isStatusNone()) {
				if (isNull(simRow.sim_mrp_no())) {
					simRow.setStatus(MCRow.CREATE);
					break;
				}
				else {
					simRow.setStatus(MCRow.MODIFY);
					break;
				}
			}
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltRqmtTable.setCellConfig(crtRsltRqmtCellConfig());
		RsltSimTable.setCellConfig(crtRsltSimCellConfig());
	}

	protected RsltRqmtCellConfig crtRsltRqmtCellConfig() {
		return new RsltRqmtCellConfig();
	}

	protected class RsltRqmtCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (isSame(getStatus(), UPD_DTL)) {
				RsltRqmtR r = (RsltRqmtR) table.getBaseTable().getRow(index);
				RsltSimR simR = getRsltSimL().getFirst(RsltSimR.$peg_no1, r.peg_no1());

				if (r.un_editable_flg() || simR == null || MAC_RTN_STS_TYP.isOK(simR.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				// 製造場所
				if (columnRsltRqmt_mfg_loc_cd == column) {
					if (!RsltRqmt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				// 発注先
				if (columnRsltRqmt_sppl_cd == column) {
					if (!RsltRqmt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 依頼先場所
				if (columnRsltRqmt_rqst_loc_cd == column) {
					if (!RsltRqmt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				if (RsltSimTable.getSelectedMCRow().exp_flg()) {
					if (columnRsltRqmt_check == column
							 || columnRsltRqmt_itm_cd == column
							 || columnRsltRqmt_itm_sub1 == column
							 || columnRsltRqmt_itm_sub2 == column
							 || columnRsltRqmt_itm_sub3 == column
							 || columnRsltRqmt_rqmt_typ == column
							 || columnRsltRqmt_sno1 == column
							 || columnRsltRqmt_sno2 == column
							 || columnRsltRqmt_sno3 == column
							 || columnRsltRqmt_sno4 == column
							 || columnRsltRqmt_sno_sprt_flg == column
							 || columnRsltRqmt_strg_loc_cd == column
							 || columnRsltRqmt_mfg_loc_cd == column
							 || columnRsltRqmt_rqmt_qty == column
							 || columnRsltRqmt_rqst_loc_cd == column
							 || columnRsltRqmt_sppl_cd == column
							 || columnRsltRqmt_due_dt == column
							 || columnRsltRqmt_intr_rmrks == column
							 || columnRsltRqmt_sub_char1 == column
							 || columnRsltRqmt_sub_char2 == column
							 || columnRsltRqmt_sub_char3 == column) {
							return MCMode.READ_ONLY;
					}
					else {
						return null;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected RsltSimCellConfig crtRsltSimCellConfig() {
		return new RsltSimCellConfig();
	}

	protected class RsltSimCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltSimR r = (RsltSimR) table.getBaseTable().getRow(index);

			if (isUpdStatus()) {

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (r.exp_flg()) {
					if (columnRsltSim_check == column 
							 || columnRsltSim_dly_rqmt_flg == column
							 || columnRsltSim_gi_flg == column
							 || columnRsltSim_gr_flg == column
							 || columnRsltSim_mrp_proc_dt == column
							 || columnRsltSim_ship_flg == column
							 || columnRsltSim_sim_mrp_intr_rmrks == column
							 || columnRsltSim_sim_mrp_sub_char1 == column
							 || columnRsltSim_sim_mrp_sub_char2 == column
							 || columnRsltSim_sim_mrp_sub_char3 == column
							 || columnRsltSim_sim_usr_cd == column
							 || columnRsltSim_stk_flg == column
							 || columnRsltSim_wg_cd == column
							 || columnRsltSim_sim_mrp_typ == column
							 || columnRsltSim_tree_lvl == column
							) {
						return MCMode.READ_ONLY;
					}
				}
				// FLG群
				if (columnRsltSim_dly_rqmt_flg == column
						 || columnRsltSim_gi_flg == column
						 || columnRsltSim_gr_flg == column
						 || columnRsltSim_ship_flg == column
						 || columnRsltSim_stk_flg == column
						) {
					if (MSC_SIM_MRP_TYP.isGP_SIM(r.sim_mrp_typ())) {
						return MCMode.ENABLE;
					}
					else {
						r.dly_rqmt_flg(false);
						r.gi_flg(false);
						r.gr_flg(false);
						r.ship_flg(false);
						r.stk_flg(false);
						return MCMode.READ_ONLY;
					}
				}
				//階層
				if (columnRsltSim_tree_lvl == column) {
					if (MSC_SIM_MRP_TYP.isPRMS(r.sim_mrp_typ())) {
						return MCMode.ENABLE;
					}
					else {
						r.tree_lvl(null);
						return MCMode.READ_ONLY;
					}
				}
				if (columnRsltSim_wg_cd == column) {
					if (!isNull(r.sim_mrp_no())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (isInstStatus()) {
				if (r.exp_flg()) {
					if (columnRsltSim_check == column ) {
						 return MCMode.READ_ONLY;
					}
					else {
						return null;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}