package mcframe.clientMSBE.MSBEP1730;

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

import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP5020.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.commonMA.meta.MA_META;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IvReg_MC extends MSBEP_IvReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	/** 検索結果の順番を変更したらtrue */
	protected boolean _isChanged = false;
	
	/** MSBEP1710からの遷移時の一時保管用 */
	protected MCTable<mcframe.clientMSBE.MSBEP1710.RsltR> _msbep1710RsltTable;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvReg_MC() {
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
	public MSBEP_IvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1730_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Sprt01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;

		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;

		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBEL1730_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_tgtList = getSrchL();
			//更新ボタンイベントのときは同期にする
			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
			
			_error_flg = false;
		}
		
		/**
		 * 更新ボタンイベントからの呼び出しかどうかを設定する。
		 */
		protected void setUpdBtnEventFlg(boolean updBtnEventFlg) {
			_upd_btn_event_flg = updBtnEventFlg;
		}

		/**
		 * 続行不可能かどうかを返す。
		 */
		protected boolean getErrorFlg() {
			return _error_flg;
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			//単価再取得ボタンイベントのときは必要に応じてメッセージを表示
			if (!_upd_btn_event_flg) {
				if (_tgtList.isEmpty()) {
					msgList.add(new MCMessage(MSBBP0010));
				}
			}
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setAll(bridge.up0(), getSrchL(), createMap_UpriSrchR_DtlR());
		}

		@Override
		protected void show() {

			//Ins01,Upd01用に変更前の値をキャッシュ
			_tgtList.forEach(dr -> cacheUpri(dr));

			getUpriSrchL().clear();

			showMerge();
			for (UpriSrchR r : getUpriSrchL()) {
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), r.sls_upri());
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), r.interim_flg());
			}
		}

		@Override
		protected MCMessage msgExecConfirm() {
			if (!_upd_btn_event_flg) {
				return new MCMessage(MSBBP0011);
			}
			return null;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			
			// 単価取得に最低限必要な必須チェックのみ実施する
			msgList.addAll(panel.checkReq(Hdr_iv_dt));
			msgList.addAll(panel.checkReq(Hdr_ship_rqst_id_cd));
			msgList.addAll(panel.checkReq(Hdr_trd_cur_cd));
			for (DtlR r : getSrchL()) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_sls_dpt_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
			}

			if (!msgList.isEmpty()) {
				_error_flg = true;
			}
		}
		
		/**
		 * 検索対象の明細を取得する
		 * @return
		 */
		protected MCList<DtlR> getSrchL() {
			MCList<DtlR> srchL = MCList.create(DtlR.class);
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				for (DtlR srchR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)){
					if (srchR.sls_acxfr_flg()) {
						continue;
					}
					srchL.add(srchR);
				}
			}
			return srchL;
		}
		
		protected Map_UpriSrchR_DtlR<UpriSrchR, DtlR> createMap_UpriSrchR_DtlR() {
			return new Map_UpriSrchR_DtlR<UpriSrchR, DtlR>();
		}
		
		/**
		 * 単価をキャッシュする。
		 */
		protected void cacheUpri(DtlR dtlR) {
			dtlR.old_trd_cur_upri(dtlR.trd_cur_upri());
		}

		public class Map_UpriSrchR_DtlR<D extends UpriSrchR, S extends DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpriSrchR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(UpriSrchR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(UpriSrchR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(UpriSrchR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(UpriSrchR.$trd_unit_cd, DtlR.$trd_unit_cd);
				addColumnPathMap(UpriSrchR.$trd_unit_qty, DtlR.$trd_unit_qty);
				addColumnPathMap(UpriSrchR.$wg_cd, DtlR.$sls_dpt_wg_cd);
				addColumnPathMap(UpriSrchR.$dest_cd1, DtlR.$dest_cd1);
				addColumnPathMap(UpriSrchR.$dest_cd2, DtlR.$dest_cd2);
				addColumnPathMap(UpriSrchR.$dest_cd3, DtlR.$dest_cd3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dt(getHdrR().iv_dt());
				dest.dlv_cd(getHdrR().dlv_id_cd());
				dest.cst_cd(getHdrR().ship_rqst_id_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
			}
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt(MCEventInfo info) {
		callMS_MSBEL1730_Sprt01();
	}
	/**
	 * [MS_MSBEL1730_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch04Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1730_Srch04Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
						
			setThisMode();
			setFocus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			Cnd_srch_tgt_no.mcRequestFocus();
		}

		@Override
		protected void show() {

			super.show();

			_isChanged = false;

			setHdrXrateRelateValue();
			setTtlAmt();
			setDtl();
			setUpriQty();
		}
		
		/**
		 * 明細の設定
		 * 
		 */
		protected void setDtl() {
			
			setDtlStatus();
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				DtlTable.fillSpace();
			}
		}
		
		/**
		 * 明細のステータスを設定する
		 * 
		 */
		protected void setDtlStatus() {
			for (DtlR dR : getDtlL()) {
				dR.setStatus(MCRow.CREATE);
			}
		}
	}

	/**
	 * [MS_MSBEL1730_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Prnt01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1730_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[move_top]の押下時の処理
	 */
	public void doBtn_move_top(MCEventInfo info) {
		if (moveTop(DtlTable)) {
			rowMoved();
		}
	}

	/**
	 * Panel[Btn]のボタン[move_up]の押下時の処理
	 */
	public void doBtn_move_up(MCEventInfo info) {
		if (moveUp(DtlTable)) {
			rowMoved();
		}
	}

	/**
	 * Panel[Btn]のボタン[move_down]の押下時の処理
	 */
	public void doBtn_move_down(MCEventInfo info) {
		if (moveDown(DtlTable)) {
			rowMoved();
		}
	}
	/**
	 * Panel[Btn]のボタン[move_bottom]の押下時の処理<br>
	 * 最下行に移動する
	 */
	public void doBtn_move_bottom(MCEventInfo info) {

		MCList<DtlR> subL = getDtlL();
		
		if (subL.isEmpty()) {
			return;
		}
		int btmIdx = subL.get(subL.size() - 1).getGUIIndex();
		MCList<DtlR> dL = DtlTable.getList();
		
		int remFr = btmIdx + 1;
		int remTo = dL.size();
		
		if (remFr < remTo) {
			dL.remove(remFr, remTo);
		}

		if (moveBottom(DtlTable)) {
			rowMoved();
		}
	}

	protected void rowMoved() {
		_isChanged = true;
	}

	/**
	 * 行追加・行削除、上下ボタン押下可・不可の設定
	 */
	protected void setAddDelUpDownBtnMode() {

		MCList<DtlR> exceptEmpL = exceptEmpty(getDtlL());
		if (exceptEmpL.size() == 0) {
			return;
		}
		DtlR r = DtlTable.getSelectedMCRow();
		if(isNull(r)) {
			return;
		}
		if(!(getStatus() == INS || getStatus() == UPD1 || getStatus() == UPD2)) {
			return;
		}
		
		if(getHdrR().pl_reg_flg()) {
			if(r.existed_flg() && !r.manual_add_flg()) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_move_bottom.setMode(MCMode.DISABLE);
				Btn_move_down.setMode(MCMode.DISABLE);
				Btn_move_up.setMode(MCMode.DISABLE);
				Btn_move_top.setMode(MCMode.DISABLE);
			}
			else {
				Btn_rdel.setMode(MCMode.ENABLE);
				Btn_move_bottom.setMode(MCMode.ENABLE);
				Btn_move_down.setMode(MCMode.ENABLE);
				Btn_move_up.setMode(MCMode.ENABLE);
				Btn_move_top.setMode(MCMode.ENABLE);
			}
		}
		else {
			if(getStatus() != INS && getHdrR().iv_ship_flg()) {
				Btn_rdel.setMode(MCMode.ENABLE);

				if(r.existed_flg() && !r.manual_add_flg()) {
					if(!r.bndl_flg()) {
						if(!isNull(r.ship_inst_qty()) && r.ship_inst_qty().gt(MCNumber.ZERO) 
								|| !isNull(r.ship_act_qty()) && r.ship_act_qty().gt(MCNumber.ZERO)) {
							Btn_rdel.setMode(MCMode.DISABLE);
						}
					}
					else {
						for (MapDtlR mapR : getMapDtlL()) {
							if(isSame(mapR.index(), r.index())) {
								if(!isNull(mapR.ship_inst_qty()) && mapR.ship_inst_qty().gt(MCNumber.ZERO) 
										|| !isNull(mapR.ship_act_qty()) && mapR.ship_act_qty().gt(MCNumber.ZERO)) {
									Btn_rdel.setMode(MCMode.DISABLE);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBEL1730_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1730_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
						
			setThisMode();
			setFocus();
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().ref_ope_flg(Cnd_ope_REF.isSelected());
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			Cnd_srch_tgt_no.mcRequestFocus();
		}

		@Override
		protected void show() {

			super.show();

			_isChanged = false;

			setHdrXrateRelateValue();
			setTtlAmt();
			setUpriQty();
		}
	}

	/**
	 * [MS_MSBEL1730_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch02Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1730_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setThisMode();
			setIvNoModeByNumFlg();
			DtlTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSRCHStatus();
		}

		@Override
		protected void show() {
			super.show();
			
			_isChanged = false;
			
			setPlSkipFlg();
			setIvShipFlg();
			setHdrXrateRelateValue();
			setHdrXrate();
			
			setTtlAmt();
			setDtl();
			setUpriQty();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			//インボイス登録対象選択画面から遷移してくるときに、必須チェックをしない
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			MCMessageList tmpMsgL = new MCMessageList();
			tmpMsgL.addAll(panel.checkReq(Hdr_dlv_cntry_cd));
			
			if (!tmpMsgL.isEmpty()) {
				setFIX_DStatus();
			}
			
			msgList.addAll(tmpMsgL);
		}
		
		/**
		 * ヘッダの為替レート、納税為替レートを設定する
		 */
		protected void setHdrXrate() {
			if (!getHdrR().xrate_inpt_flg()) {
				getHdrR().xrate(getDefXrate(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd(), getHdrR().xrate_cd(), getHdrR().iv_dt(), panel));
			}
			if (!isNull(getHdrR().ptax_cur_cd()) && !getHdrR().ptax_xrate_inpt_flg()) {
				getHdrR().ptax_xrate(getDefXrate(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd(), getHdrR().xrate_cd(), getHdrR().iv_dt(), panel));
			}
		}

		/**
		 * 全てのインボイス明細の出荷指図区分が２：ピッキングなしの場合、ヘッダのＰ/Ｌ省略ＦＬＧをtrueに設定する。
		 */
		protected void setPlSkipFlg() {
			MCList<DtlR> tmpL = bridge.down0().groupBy(DtlR.$ship_inst_typ);
			if(tmpL.size() == 1) {
				if(MAC_SHIP_INST_TYP.isNO_PICK(tmpL.get(0).ship_inst_typ())) {
					getHdrR().pl_skip_flg(true);
				}
			}
		}
		
		/**
		 * インボイス単位出荷を設定する。
		 */
		protected void setIvShipFlg() {
			if ((MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()))
					&& existsShip()) {
				getHdrR().iv_ship_flg(false);
			}
		}

		/**
		 * 明細の設定
		 * 
		 */
		protected void setDtl() {
			
			setDtlStatus();
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				DtlTable.fillSpace();
			}
		}
		
		/**
		 * 明細のステータスを設定する
		 * 
		 */
		protected void setDtlStatus() {
			for (DtlR dR : getDtlL()) {
				dR.setStatus(MCRow.CREATE);
			}
		}
	}

	protected void setThisMode() {
		
		setRefStatus();
		
		if(Hdr_iv_immed_prnt_flg.getMode() == MCMode.READ_ONLY) {
			getHdrR().iv_immed_prnt_flg(false);
		}
		else {
			getHdrR().iv_immed_prnt_flg(true);
		}
		
		if (Cnd_ope_DEL.isSelected() || getHdrR().cmpl_flg()) {
			return;
		}

		//ボタン：Ｐ／Ｌ登録の制御
		setBtn_Open_MSBEP1750Mode();
		
		//ボタン：Ｉ／Ｖの制御
		setBtnPrntMode();
		
		if (!Cnd_ope_REF.isSelected() && !isSlsCstStkSlsCmpl()) {
			//インボイス関連項目の制御
			setIvMode();
			
			//ヘッダ：入荷予定日／売上予定日の制御
			setTrdSchdDtMode();
	
			//ヘッダ：請求起算日の制御
			setBillBasisDtMode();
			
			//ヘッダ：入金予定日の制御
			setRcvSchdDtMode();
			
			//ボタン：Ｉ／Ｖ明細、Ｐ／Ｌ登録、Ｉ／Ｖ選択の制御
			setBtnMode();
			
			//ボタン：行追加の制御
			setRaddMode();
	
			//為替レート指定ＦＬＧの制御
			setXrateInptFlgMode();
			
			//通貨ＣＤの制御
			setCurCdMode();
			
			//取引条件ＣＤ１～３の制御
			seTttermCdMode();
		}
		setShipInstMode();
		
		setShipActMode();
	}
	
	/**
	 * 作成元区分が「出荷指図」の場合、明細の出荷指図関連項目を表示する。
	 */
	protected void setShipInstMode() {
		if (MSC_IV_SRC_TYP.isSHIP_INST(getHdrR().iv_src_typ())
				|| MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
			columnDtl_ship_inst_no.setMode(MCMode.READ_ONLY);
			columnDtl_ship_inst_d_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(columnDtl_ship_inst_no);
			setDefaultMode(columnDtl_ship_inst_d_no);
		}
	}
	
	/**
	 * 作成元区分が「出荷実績」の場合、明細の出荷実績関連項目を表示する。
	 */
	protected void setShipActMode() {
		if (MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
			columnDtl_ship_act_no.setMode(MCMode.READ_ONLY);
			columnDtl_ship_act_d_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(columnDtl_ship_act_no);
			setDefaultMode(columnDtl_ship_act_d_no);
		}
	}
	
	/**
	 * [MS_MSBEL1730_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Ins01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 *  販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;
		protected MS_MSBEL1730_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
			_trd_cur_upri_chng_flg = false;
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurUpriChng(upriChngMsgList);
			
			if (!upriChngMsgList.isEmpty()) {
				_trd_cur_upri_chng_flg = true;
			}
			
			msgList.addAll(upriChngMsgList);
		}
		
		@Override
		protected boolean confirmForCall() {

			if (callMS_MSBEL1730_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();
			
			if (_trd_cur_upri_chng_flg && !confirmRslt) {
				
				restoreTrdCurUpri();
			}
			
			return confirmRslt;
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setDefaultamt(bridge.up1());
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			
			truncateMSBEP1710RsltTable();
		}
		
		/**
		 * MSBEP1710のテーブルのための後処理<p>
		 * 
		 * 更新処理した_dtlForCallのex_schd_d_idと一致するものが_msbep1710RsltTableに存在した場合は行削除する
		 */
		protected void truncateMSBEP1710RsltTable() {

			if (_msbep1710RsltTable == null) {
				return;
			}
			
			// _msbep1710RsltTableに存在した場合は行削除する
			for (MapDtlR mapDR : getMapDtlL()) {
				for (int i = 0; i < _msbep1710RsltTable.getRowCount(); i++) {
					if (isSame(mapDR.ship_schd_no(), _msbep1710RsltTable.getRow(i).ship_schd_no())) {
						_msbep1710RsltTable.truncateRow(i);
						break;
					}
				}
			}
			
			// インボイス登録した結果、全行引き継いだら、インボイス登録対象選択画面の選択チェックを編集可能にする
			MCList<mcframe.clientMSBE.MSBEP1710.RsltR> msbep1710List = _msbep1710RsltTable.getList();
			int size = msbep1710List.subList(mcframe.clientMSBE.MSBEP1710.RsltR.$check, true).size();
			if (size == 0) {
				msbep1710List.setBoolean(mcframe.clientMSBE.MSBEP1710.RsltR.$selectable_flg, true);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(checkHdr());
			msgList.addAll(checkDtl());
		}
	}

	/**
	 * [MS_MSBEL1730_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Upd01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 *  販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;
		protected MS_MSBEL1730_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			setPrint(true);
			_trd_cur_upri_chng_flg = false;
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurUpriChng(upriChngMsgList);
			
			if (!upriChngMsgList.isEmpty()) {
				_trd_cur_upri_chng_flg = true;
			}
			
			msgList.addAll(upriChngMsgList);
		}
		
		@Override
		protected boolean confirmForCall() {

			if (callMS_MSBEL1730_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();
			
			if (_trd_cur_upri_chng_flg && !confirmRslt) {
				
				restoreTrdCurUpri();
			}
			
			return confirmRslt;
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setDefaultamt(bridge.up1());
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {

			// ヘッダチェック
			if (!getHdrR().isStatusNone()) {
				return false;
			}
			// 明細チェック
			if (!_isChanged && exceptEmpty(getDtlL()).isStatusNone()) {
				return true;
			}

			return false;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(checkHdr());
			msgList.addAll(checkDtl());
		}
	}
	
	/**
	 * 単価が変更された場合、確認メッセージを表示する。
	 * @param msgList メッセージリスト
	 */
	protected void confirmForTrdCurUpriChng(MCMessageList msgList) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {
			
			if (!isNull(dtlR.old_trd_cur_upri()) 
					&& !isNull(dtlR.trd_cur_upri()) 
					&& !isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri()) ) {
				
				msgList.add(new MCMessage(dtlR, DtlR.$trd_cur_upri, MSBBP0012, dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
			}
		}
	}
	
	/**
	 * 単価を変更前に戻す。
	 */
	protected void restoreTrdCurUpri() {

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {
			
			if (!isNull(dtlR.old_trd_cur_upri())) {
				
				setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), dtlR.old_trd_cur_upri());
			}
		}
	}
	
	/**
	 * 更新前に単価再所得処理を実行する。
	 * @return 実行結果がエラーの場合はtrue
	 */
	protected boolean callMS_MSBEL1730_Sprt01_Before_Upd() {

		if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			return false;
		}
		
		MSBEP_IvReg.MS_MSBEL1730_Sprt01Caller caller = createMS_MSBEL1730_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		
		return caller.getErrorFlg();
	}

	/**
	 * ヘッダの登録前チェック
	 */
	protected MCMessageList checkHdr() {
		
		MCMessageList msgList = new MCMessageList();

		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			// インボイス日付≦完了予定日≦売上予定日
			msgList.addAll(check3Dt(Hdr_iv_dt, Hdr_cmpl_schd_dt, Hdr_sls_schd_dt));
		}
		else if (!MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			// インボイス日付≦完了予定日≦入荷予定日
			msgList.addAll(check3Dt(Hdr_iv_dt, Hdr_cmpl_schd_dt, Hdr_arr_schd_dt));
		}

		if (!getHdrR().pl_reg_flg()) {
			if (isNull(getHdrR().via_schd_dt())) {
				// 船積予定日≦船卸予定日
				msgList.addAll(checkBeforeAfter(Hdr_etd_dt, Hdr_eta_dt));
			}
			else {
				// 船積予定日≦経由予定日≦船卸予定日
				msgList.addAll(check3Dt(Hdr_etd_dt, Hdr_via_schd_dt, Hdr_eta_dt));
			}
		}

		checkPort(msgList);

		return msgList;
	}

	/**
	 * 港の重複チェック
	 * 
	 * @param msgList
	 */
	protected void checkPort(MCMessageList msgList) {
		
		if (!isNullOr(getHdrR().load_port_cd(), getHdrR().dschrg_port_cd())
				&& isSame(getHdrR().load_port_cd(), getHdrR().dschrg_port_cd())) {

			MCMessage msg = new MCMessage(MSBEP0014);
			msgList.add(msg);
		}
		else if (!isNullOr(getHdrR().load_port_cd(), getHdrR().via_port_cd())
				&& isSame(getHdrR().load_port_cd(), getHdrR().via_port_cd())) {
			
			MCMessage msg = new MCMessage(MSBEP0014);
			msgList.add(msg);
		}
		else if (!isNullOr(getHdrR().dschrg_port_cd(), getHdrR().via_port_cd())
				&& isSame(getHdrR().dschrg_port_cd(), getHdrR().via_port_cd())) {
			
			MCMessage msg = new MCMessage(MSBEP0014);
			msgList.add(msg);
		}
	}

	/**
	 * 明細の登録前チェック
	 */
	protected MCMessageList checkDtl() {
		MCList<DtlR> dL = exceptDeleteAndEmpty(getDtlL());
		
		MCMessageList msgList = new MCMessageList();

		boolean isOK = false;
		for(DtlR r : dL) {
			if(r.existed_flg() && !r.manual_add_flg()) {
				isOK = true;
				break;
			}
		}
		if(!isOK) {
			msgList.add(new MCMessage(MSBEP0015));
		}
		else {
			if(!getHdrR().pl_reg_flg() && !getHdrR().iv_ship_flg() && isNull(getHdrR().rcpt_iv_mng_no())) {
				for(DtlR r : dL) {
					if(!r.bndl_flg() && r.existed_flg() && !r.manual_add_flg()) {
						if(r.base_unit_qty().gt(r.max_base_unit_qty())) {
							if (MSC_IV_SRC_TYP.isSHIP_SCHD(getHdrR().iv_src_typ())) {
								msgList.add(new MCMessage(r, DtlR.$trd_unit_qty, MSBEP0029, r.max_trd_unit_qty(), toDispGUIIndex(r)));
							}
							else if (MSC_IV_SRC_TYP.isSHIP_INST(getHdrR().iv_src_typ())) {
								msgList.add(new MCMessage(r, DtlR.$trd_unit_qty, MSBEP0101, r.max_trd_unit_qty(), toDispGUIIndex(r)));
							}
							else if (MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
								msgList.add(new MCMessage(r, DtlR.$trd_unit_qty, MSBEP0102, r.max_trd_unit_qty(), toDispGUIIndex(r)));
							}
						}
					}
				}
			}
		}
		return msgList;
	}

	protected void setDefaultamt(MCList<DtlR> DtlL) {
		for(DtlR r : DtlL) {
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				continue;
			}
			if(isNull(r.trd_cur_upri())) {
				r.trd_cur_upri(0);
			}
			if(isNull(r.trd_cur_amt())) {
				r.trd_cur_amt(0);
			}
			if(isNull(r.trd_cur_tax_amt())) {
				r.trd_cur_tax_amt(0);
			}
		}
	}
	
	/**
	 * [MS_MSBEL1730_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Del01Caller<P extends MSBEP_IvReg, B extends MS_MSBEL1730_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1730_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			confirmForCallStackSub(msgList);
		}
		
		protected void confirmForCallStackSub(MCMessageList msgList) {
			checkSchdAct(msgList);
		}
		
		/**
		 * 出荷後の取消前に、確認メッセージを出す。
		 */
		protected void checkSchdAct(MCMessageList msgList) {
			MCList<DtlR> dL = exceptEmpty(getDtlL());
			
			if ((getHdrR().iv_ship_flg() || MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ()))
					||MAC_VIA_DLV_TYP.isNOT_VIA(getHdrR().via_dlv_typ())) {
				return;
			}
P:			for(DtlR r : dL) {
				if(r.manual_add_flg()) {
					continue;
				}

				if(!r.bndl_flg()) {
					if(r.ship_act_qty().gt(MCNumber.ZERO)) {
						msgList.add(new MCMessage(MSBEP0032));
						break;
					}
				}
				else {
					for (MapDtlR mapR : getMapDtlL()) {
						if(isSame(mapR.index(), r.index())) {
							if(mapR.ship_act_qty().gt(MCNumber.ZERO)) {
								msgList.add(new MCMessage(MSBEP0032));
								break P;
							}
						}
					}
				}
			}
		}
	}

	protected void setAmtD(DtlR dR) {
		
		// インボイス表記金額
		if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
			dR.iv_upri(dR.trd_cur_upri());
			dR.iv_amt(dR.trd_cur_amt());
		}
		else if(isNull(dR.iv_upri())) {
			dR.iv_upri(0);
			dR.iv_amt(0);
		}
		else {
			dR.iv_amt(
					getAmt(dR.iv_upri(), 
							dR.upri_qty(), 
							getHdrR().trd_cur_amt_dec_place(), 
							getHdrR().trd_amt_rnd_typ()));
		}
	}
	
	protected void setCurCdMode() {
		if(isNull(getHdrR().trd_cur_cd())) {
			Hdr_trd_cur_cd.setMode(MCMode.REQUIRED);
		}
	}

	protected void seTttermCdMode() {
		if (getHdrR().pl_reg_flg()) {
			Hdr_tterm_cd1.setMode(MCMode.READ_ONLY);
			Hdr_tterm_cd2.setMode(MCMode.READ_ONLY);
			Hdr_tterm_cd3.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_tterm_cd1);
			setDefaultMode(Hdr_tterm_cd2);
			setDefaultMode(Hdr_tterm_cd3);
		}
	}

	protected void setHdrXrateRelateValue() {
		HdrR hR = getHdrR();

		hR.base_cur_cd(getBaseCur().cur_cd());
		hR.base_cur_nm(getBaseCur().cur_nm());
		
		hR.ptax_cur_cd(getPtaxCur().cur_cd());
		hR.ptax_cur_nm(getPtaxCur().cur_nm());
		
		if (MAC_TRD_PTN_TYP.isSLS(hR.trd_ptn_typ())) {
			hR.xrate_cd(getCo().sls_xrate_cd());
		}
		else if (MAC_TRD_PTN_TYP.isPROV(hR.trd_ptn_typ())) {
			hR.xrate_cd(getCo().prov_xrate_cd());
		}
	}
	
	/**
	 * 諸合計金額の設定
	 * 
	 */
	protected void setTtlAmt() {

		HdrR hdrR = getHdrR();
		TtlR ttlR = getTtlR();
		MCList<DtlR> ivDL = getDtlL();

		// ivDLが空かどうかのチェック
		MCList<DtlR> subL = exceptDeleteAndEmpty(ivDL);

		if (!subL.isEmpty()) {
			
			// 明細のインボイス金額の合計値がNULLの場合
			if (isNull(subL.sum(DtlR.$iv_amt))) {
				clearTtlAmt();
				return;
			}

			//取引金額計
			MCNumber ttlTrdCurAmt = getTtlAmt(subL, DtlR.$trd_cur_amt);
			hdrR.trd_cur_amt(ttlTrdCurAmt);
			hdrR.trd_cur_amt_inc_tax(getTtlAmt(subL, DtlR.$trd_cur_inc_tax_amt));

			ttlR.ttl_iv_amt(getTtlAmt(subL, DtlR.$iv_amt)); 						//Ｉ／Ｖ計
			ttlR.ttl_ncv_amt(ttlR.ttl_iv_amt().subtract(ttlTrdCurAmt));				//無償計（＝Ｉ／Ｖ計－取引金額計）

			// 取引金額を輸出入諸掛区分ごとに集計
			MCList<DtlR> baseL = subL.subList(DtlR.$exim_xpns_typ, null);
			ttlR.ttl_base_amt(getTtlAmt(baseL, DtlR.$trd_cur_amt));					//本体（＝「輸出入諸掛区分」が未設定の取引金額の合算値）
			
			MCList<DtlR> freightL = subL.subList(DtlR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.FREIGHT.value());
			ttlR.ttl_freight_amt(getTtlAmt(freightL, DtlR.$trd_cur_amt));		//運賃
			
			MCList<DtlR> insuranceL = subL.subList(DtlR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.INSURANCE.value());
			ttlR.ttl_insurance_amt(getTtlAmt(insuranceL, DtlR.$trd_cur_amt));	//保険料
			
			ttlR.ttl_other_amt(ttlTrdCurAmt
					.subtract(ttlR.ttl_base_amt())
					.subtract(ttlR.ttl_freight_amt())
					.subtract(ttlR.ttl_insurance_amt()));							//その他経費（＝取引金額計－本体－運賃－保険料）
		}
		else {
			clearTtlAmt();
		}
	}
	
	/**
	 * 合計金額を取得する
	 * 
	 * @param subL：空行を除くリスト
	 * @param col：集計するカラム名
	 * @return
	 */
	protected MCNumber getTtlAmt(MCList<DtlR> subL, String col) {
		
		MCNumber ttlAmt = MCNumber.ZERO;
		for (DtlR subR : subL) {
			MCNumber amt = subR.getNumberNE(col);
			if (isNull(amt)) {
				continue;
			}
			if (subR.dscnt_itm_flg()) {
				ttlAmt = ttlAmt.subtract(amt);
			}
			else {
				ttlAmt = ttlAmt.add(amt);
			}
		}
		return ttlAmt;
	}

	/**
	 * 諸合計金額のクリア
	 * 
	 */
	protected void clearTtlAmt() {
		TtlR ttlR = getTtlR();
		
		ttlR.ttl_iv_amt(null);			//Ｉ／Ｖ計
		ttlR.ttl_ncv_amt(null);			//無償計
		ttlR.ttl_base_amt(null);		//本体
		ttlR.ttl_freight_amt(null);		//運賃
		ttlR.ttl_insurance_amt(null);	//保険料
		ttlR.ttl_other_amt(null);		//その他経費
	}
	
	/**
	 * 単価数量を設定する
	 */
	protected void setUpriQty() {
		
		for (DtlR dtlR : getDtlL()) {
			setUpriQty(dtlR, false);
		}
	}
	
	/**
	 * 単価数量を設定する
	 * 
	 * @param dtlR
	 * @param gui
	 */
	protected void setUpriQty(DtlR dtlR, boolean gui) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			if (gui) {
				setValueEx(columnDtl_upri_qty, dtlR.getGUIIndex(), dtlR.trd_unit_qty());
			}
			else {
				dtlR.upri_qty(dtlR.trd_unit_qty());
			}
		}
		else {
			if (gui) {
				setValueEx(columnDtl_upri_qty, dtlR.getGUIIndex(), dtlR.base_unit_qty());
			}
			else {
				dtlR.upri_qty(dtlR.base_unit_qty());
			}
		}
	}

	/**
	 * 入荷予定日／売上予定日の制御。
	 * 取引パタンが「売上」 の場合、売上予定日が入力可、入荷予定日が入力不可とする。
	 * 以外（取引パタンが「移動・移送、移動・移送返品、支給」 の場合）、
	 * 売上予定日が入力不可、入荷予定日が入力可とする。
	 * 
	 */
	protected void setTrdSchdDtMode() {

		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			Hdr_sls_schd_dt.setMode(MCMode.REQUIRED);
			Hdr_arr_schd_dt.setMode(MCMode.READ_ONLY);
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			Hdr_sls_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr_arr_schd_dt.setMode(MCMode.READ_ONLY);
		}
		else {
			Hdr_sls_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr_arr_schd_dt.setMode(MCMode.REQUIRED);
		}
	}

	/**
	 * インボイス関連項目の制御。
	 * 販売側で事前に発番したインボイスＮＯの場合、インボイスＮＯ、自動、インボイス単位出荷を入力不可とする
	 * 完了対象外の場合、インボイス単位出荷を入力不可とする（インボイス単位出荷がオン固定）
	 * 三国間の場合、インボイス単位出荷を入力不可とする（インボイス単位出荷がオフ固定）
	 * 
	 */
	protected void setIvMode() {

		if ((getHdrR().is_slo_iv_no())) {
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_num_flg.setMode(MCMode.READ_ONLY);
			Hdr_iv_ship_flg.setMode(MCMode.READ_ONLY);
		}
		
		if ((getHdrR().non_cmpl_flg())) {
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
				if (!MSC_IV_SRC_TYP.isSHIP_SCHD(getHdrR().iv_src_typ()) || existsShip() || MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())) {
					Hdr_iv_ship_flg.setMode(MCMode.READ_ONLY);
				}
			}
			else {
				Hdr_iv_ship_flg.setMode(MCMode.READ_ONLY);
			}
		}
		
		if (!isNull(getHdrR().rcpt_iv_mng_no())) {
			Hdr_iv_ship_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 輸出に関連する項目のモードを設定する。
	 */
	protected void setExMode() {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			
			Hdr_trnspt_cd.setMode(MCMode.ENABLE);
			Hdr_vssl_flght.setMode(MCMode.ENABLE);
			Hdr_load_port_cd.setMode(MCMode.ENABLE);
			Hdr_etd_dt.setMode(MCMode.ENABLE);
			Hdr_dschrg_port_cd.setMode(MCMode.ENABLE);
			Hdr_eta_dt.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * パッキングリスト省略のモードを設定する。
	 */
	protected void setSlsCstStkSlsCmplMode() {
		if (!getHdrR().pl_reg_flg()) {
			Hdr_pl_skip_flg.setMode(MCMode.REQUIRED);
			Btn_upd.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * 出荷指図または出荷の明細が存在するか判定する。
	 * @return 存在する場合はtrue
	 */
	protected boolean existsShip() {
		
		boolean existsShip = false;
		
		for (DtlR r : getDtlL().groupBy(DtlR.$pr_sts_typ)) {
			if(MSC_PR_STS_TYP.isINST(r.pr_sts_typ()) 
					|| MSC_PR_STS_TYP.isPART_SHIP(r.pr_sts_typ()) 
					|| MSC_PR_STS_TYP.isSHIP(r.pr_sts_typ())) {
				existsShip = true;
				break;
			}
		}
		
		return existsShip;
	}
	
	/**
	 * 請求起算日の制御。
	 * 取引パタンが「売上」 かつ 請求締区分が「売上都度請求」以外の場合に
	 * 入力可能(完了対象外の場合、必須入力)。
	 * 
	 */
	protected void setBillBasisDtMode() {

		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && 
				!MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			if(getHdrR().non_cmpl_flg()) {
				Hdr_bill_basis_dt.setMode(MCMode.REQUIRED);
			}
			else {
				Hdr_bill_basis_dt.setMode(MCMode.ENABLE);
			}
		}
		else if (getHdrR().pl_reg_flg()) {
			Hdr_bill_basis_dt.setMode(MCMode.ENABLE);
		}
		else {
			Hdr_bill_basis_dt.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 入金予定日の制御。
	 * 取引パタンが「売上」 かつ請求締区分が「売上都度請求」の場合に入力可能
	 * (売上計上区分が「出荷基準」かつ完了対象外の場合、必須入力)。
	 * 
	 */
	protected void setRcvSchdDtMode() {

		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) &&  
				MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			if(MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ()) && getHdrR().non_cmpl_flg()) {
				Hdr_rcv_schd_dt.setMode(MCMode.REQUIRED);
			}
			else {
				Hdr_rcv_schd_dt.setMode(MCMode.ENABLE);
			}
		}
		else {
			Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 三国間の場合、Ｉ／Ｖ明細選択ボタンの押下不可とする。
	 * また、三国間の場合、新規登録時にＰ／Ｌ登録、Ｉ／Ｖの押下不可とする。
	 * 
	 */
	protected void setBtnMode() {
		if (!isNull(getHdrR().rcpt_iv_mng_no())) {
			Btn_open_MSBEP1740.setMode(MCMode.DISABLE);

			if (Cnd_ope_INS.isSelected()) {
				Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
				Btn_prnt.setMode(MCMode.DISABLE);
			}
		}
		if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			Btn_sprt.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * Ｐ/Ｌ省略がオン、またはインボイス未登録の場合、Ｐ／Ｌ登録の押下不可とする。
	 * 
	 */
	protected void setBtn_Open_MSBEP1750Mode() {

		if (getHdrR().pl_skip_flg()) {
			Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
		}
		else {
			if (Cnd_ope_INS.isSelected()) {
				Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
			}
			else {
				Btn_open_MSBEP1750.setMode(MCMode.ENABLE);
			}
		}
	}
	
	/**
	 * 登録・訂正後に、Ｐ／Ｌ登録のボタンの制御を行う。
	 */
	protected void setBtn_Open_MSBEP1750ModeForFix() {

		if (getHdrR().pl_skip_flg() || getHdrR().cmpl_flg()) {
			Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP1750);
		}
	}

	/**
	 * インボイス未登録の場合、Ｉ／Ｖの押下不可とする。
	 * 
	 */
	protected void setBtnPrntMode() {

		if (Cnd_ope_INS.isSelected()) {
			Btn_prnt.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 取引パタンが売上以外の場合、行追加ボタンを押下不可とする。
	 * 
	 */
	protected void setRaddMode() {
		
		if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			Btn_radd.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 取引パタンが売上以外の場合、行削除ボタンを押下不可とする。
	 * 
	 */
	protected void setRdelBtnMode() {
		
		if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 取引パタンが売上以外の場合、最上行へ移動ボタン、一つ上の行に移動ボタン、
	 * 一つ下の行に移動ボタン、最下行へ移動ボタンを押下不可とする。
	 */
	protected void setMoveBtnMode() {
		
		if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			Btn_move_top.setMode(MCMode.DISABLE);
			Btn_move_up.setMode(MCMode.DISABLE);
			Btn_move_down.setMode(MCMode.DISABLE);
			Btn_move_bottom.setMode(MCMode.DISABLE);
		}
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				DtlTable.fillSpace();
			}
			DtlTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
				if (!isSlsCstStkSlsCmpl()) {
					DtlTable.fillSpace();
				}
			}
			DtlTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
			DtlTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			setBtn_Open_MSBEP1750Mode();
		}
	}

	@Override
	protected void opePanelFillSpace() {
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		if(MSC_STK_SRCH_TGT_TYP.isSHIP_INST_NO(getCndR().srch_tgt_typ())
				|| MSC_STK_SRCH_TGT_TYP.isSHIP_ACT_NO(getCndR().srch_tgt_typ())) {
			callMS_MSBEL1730_Srch04();
		}
		else {
			callMS_MSBEL1730_Srch01();
		}
	}
	/**
	 * Panel[Cnd]のボタン[srch_2]の押下時の処理
	 */
	@Override
	public void doCnd_srch_2(MCEventInfo info) {
		callMS_MSBEL1730_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1740]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1740(MCEventInfo info) {
		MCRow bind = MCRow.create();

		HdrR hR = getHdrR();
		
		// [バインド値１] MSBEP1740：検索項目
		bind.addStringColumn("iv_src_typ", hR.iv_src_typ());
		bind.addBooleanColumn("sls_cststk_flg", hR.sls_cststk_flg());
		bind.addStringColumn("trd_ptn_typ", hR.trd_ptn_typ());			//取引パタン区分
		bind.addBooleanColumn("is_slo_iv_no", hR.is_slo_iv_no());		//インボイス単位出荷なのか
		bind.addStringColumn("iv_no", hR.iv_no());						//インボイスＮＯ
		bind.addStringColumn("dlv_id_typ", hR.dlv_id_typ());			//納品先識別区分
		bind.addStringColumn("sls_basis_typ", hR.sls_basis_typ());		//売上計上区分
		bind.addStringColumn("prov_basis_typ", hR.prov_basis_typ());	//支給計上区分
		bind.addDateColumn("iv_dt", hR.iv_dt());						//インボイス日付
		bind.addStringColumn("ship_rqst_id_cd", hR.ship_rqst_id_cd());	//出荷依頼先ＣＤ
		bind.addStringColumn("dlv_id_cd", hR.dlv_id_cd());				//納品先ＣＤ
		bind.addStringColumn("dlv_id_nm", hR.dlv_id_nm());				//納品先名
		bind.addStringColumn("dlv_zip_cd", hR.dlv_zip_cd());			//納品先郵便番号
		bind.addStringColumn("dlv_addr1", hR.dlv_addr1());				//納品先住所１
		bind.addStringColumn("dlv_addr2", hR.dlv_addr2());				//納品先住所２
		bind.addStringColumn("dlv_addr3", hR.dlv_addr3());				//納品先住所３
		bind.addStringColumn("dlv_addr4", hR.dlv_addr4());				//納品先住所４
		bind.addStringColumn("dlv_cntct_dpt", hR.dlv_cntct_dpt());		//納品先部署
		bind.addStringColumn("dlv_cntct_psn", hR.dlv_cntct_psn());		//納品先担当者
		bind.addStringColumn("dlv_tel", hR.dlv_tel());					//納品先ＴＥＬ
		bind.addStringColumn("dlv_fax", hR.dlv_fax());					//納品先ＦＡＸ
		bind.addStringColumn("tdlv_cd", hR.tdlv_cd());					//配送先ＣＤ
		bind.addStringColumn("tdlv_nm", hR.tdlv_nm());					//配送先名
		bind.addStringColumn("tdlv_zip_cd", hR.tdlv_zip_cd());			//配送先郵便番号
		bind.addStringColumn("tdlv_addr1", hR.tdlv_addr1());			//配送先住所１
		bind.addStringColumn("tdlv_addr2", hR.tdlv_addr2());			//配送先住所２
		bind.addStringColumn("tdlv_addr3", hR.tdlv_addr3());			//配送先住所３
		bind.addStringColumn("tdlv_addr4", hR.tdlv_addr4());			//配送先住所４
		bind.addStringColumn("tdlv_cntct_dpt", hR.tdlv_cntct_dpt());	//配送先部署
		bind.addStringColumn("tdlv_cntct_psn", hR.tdlv_cntct_psn());	//配送先担当者
		bind.addStringColumn("tdlv_tel", hR.tdlv_tel());				//配送先ＴＥＬ
		bind.addStringColumn("tdlv_fax", hR.tdlv_fax());				//配送先ＦＡＸ
		bind.addStringColumn("via_dlv_typ", hR.via_dlv_typ());			//配送先経由区分
		bind.addStringColumn("trd_cur_cd", hR.trd_cur_cd());			//通貨ＣＤ
		bind.addBooleanColumn("purc_ddlv_flg", hR.purc_ddlv_flg());		//仕入直送ＦＬＧ

		// [バインド値２] MSBEP1740：明細比較項目
		bind.addStringColumn("trnspt_cd", hR.trnspt_cd());				//輸出方法
		bind.addStringColumn("trnspt_nm", hR.trnspt_nm());				//輸出方法名
		bind.addStringColumn("vssl_flght", hR.vssl_flght());			//船名／便名
		bind.addStringColumn("load_port_cd", hR.load_port_cd());		//船積港ＣＤ
		bind.addStringColumn("load_port_nm", hR.load_port_nm());		//船積港名
		bind.addDateColumn("etd_dt", hR.etd_dt());						//船積予定日
		bind.addStringColumn("dschrg_port_cd", hR.dschrg_port_cd());	//船卸港ＣＤ
		bind.addStringColumn("dschrg_port_nm", hR.dschrg_port_nm());	//船卸港名
		bind.addDateColumn("eta_dt", hR.eta_dt());						//船卸予定日
		bind.addStringColumn("via_port_cd", hR.via_port_cd());			//経由地ＣＤ
		bind.addStringColumn("via_port_nm", hR.via_port_nm());			//経由地名
		bind.addDateColumn("via_schd_dt", hR.via_schd_dt());			//経由予定日
		bind.addStringColumn("tterm_cd1", hR.tterm_cd1());				//取引条件ＣＤ１
		bind.addStringColumn("tterm_nm1", hR.tterm_nm1());				//取引条件名１
		bind.addStringColumn("tterm_rmrks1", hR.tterm_rmrks1());		//取引条件備考１
		bind.addStringColumn("tterm_cd2", hR.tterm_cd2());				//取引条件ＣＤ２
		bind.addStringColumn("tterm_nm2", hR.tterm_nm2());				//取引条件名２
		bind.addStringColumn("tterm_rmrks2", hR.tterm_rmrks2());		//取引条件備考２
		bind.addStringColumn("tterm_cd3", hR.tterm_cd3());				//取引条件ＣＤ３
		bind.addStringColumn("tterm_nm3", hR.tterm_nm3());				//取引条件名３
		bind.addStringColumn("tterm_rmrks3", hR.tterm_rmrks3());		//取引条件備考３
		bind.addNumberColumn("xrate", hR.xrate());						//為替レート
		bind.addNumberColumn("ptax_xrate", hR.ptax_xrate());			//納税為替レート

		List<String> aL = new ArrayList<String>();
		 if (MSC_IV_SRC_TYP.isSHIP_SCHD(bind.getString("iv_src_typ"))) {
				for (MapDtlR mapR : getMapDtlL()) {
				for (DtlR dR : exceptDeleteAndEmpty(getDtlL())) {
					if(isSame(dR.index(), mapR.index())) {
						aL.add(mapR.ship_schd_no());
						break;
					}
				}
			}
		}
		 else if (MSC_IV_SRC_TYP.isSHIP_INST(bind.getString("iv_src_typ"))) {
				for (ShipInstMapDtlR mapR : getShipInstMapDtlL()) {
					for (DtlR dR : exceptDeleteAndEmpty(getDtlL())) {
						if(isSame(dR.index(), mapR.index())) {
							aL.add(mapR.ship_inst_d_no());
							break;
						}
					}
				}
		}
		else if (MSC_IV_SRC_TYP.isSHIP_ACT(bind.getString("iv_src_typ"))) {
			for (ShipActMapDtlR mapR : getShipActMapDtlL()) {
				for (DtlR dR : exceptDeleteAndEmpty(getDtlL())) {
					if(isSame(dR.index(), mapR.index())) {
						aL.add(mapR.ship_act_d_no());
						break;
					}
				}
			}
		}

		openModalPanel("MS", "MSBEP1740", T1, bind, aL, this);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1750]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1750(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1750");
		aso.putCnd(crtOpenMSBEP1750CndR(aso, getHdrR()));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1750.CndR crtOpenMSBEP1750CndR(MAUCP_AppScreenOpener aso, HdrR r) {	
		mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg p = (mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1750.CndR to = mcframe.clientMSBE.MSBEP1750.CndR.create();

		if(!r.pl_reg_flg()) {
			to.ope(p.Cnd_ope_INS.getActionCommand());		//操作種別＠登録する
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				to.ope(p.Cnd_ope_UPD.getActionCommand());	//操作種別＠訂正する
			}
			else if (Cnd_ope_DEL.isSelected()) {
				to.ope(p.Cnd_ope_DEL.getActionCommand());	//操作種別＠取り消す
			}
			else {
				to.ope(p.Cnd_ope_SRCH.getActionCommand());	//操作種別＠参照する
			}
		}
		to.iv_no(r.iv_no());
		
		return to;
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		// インボイス登録対象選択(MSBEP1710)からの遷移
		if (T1 == openTyp) {

			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());

			HdrR h1R = getHdrR();

			setINSStatus();
			setUserSrchCnd();
			if (isNull(h1R.cmpl_schd_dt())) {
				h1R.cmpl_schd_dt(getToday());								//完了予定日
			}
			if (isNull(h1R.iv_dt())) {
				h1R.iv_dt(getToday());										//ＩＶ日付
			}

			h1R.iv_no(bind.getString("slo_iv_no"));							//インボイスＮＯ
			if(!isNull(h1R.iv_no())) {
				h1R.is_slo_iv_no(true);
				h1R.iv_ship_flg(true);
			}
			else {
				h1R.is_slo_iv_no(false);
				h1R.iv_ship_flg(false);
			}
			h1R.trd_ptn_typ(bind.getString("trd_ptn_typ"));					//取引パタン区分
			h1R.iv_src_typ(bind.getString("iv_src_typ"));
			h1R.iv_src_typ_nm(MSC_IV_SRC_TYP.getNE(bind.getString("iv_src_typ")).name());
			h1R.sls_upri_cng_flg(bind.getBooleanNE("sls_upri_cng_flg"));
			h1R.sls_cststk_flg(bind.getBooleanNE("sls_cststk_flg"));
			h1R.sls_basis_typ(bind.getString("sls_basis_typ"));				//売上計上区分
			h1R.prov_basis_typ(bind.getString("prov_basis_typ"));			//支給計上区分
			h1R.dlv_id_typ(bind.getString("dlv_id_typ"));					//納品先識別区分
			h1R.dlv_id_typ_nm(bind.getString("dlv_id_typ_nm"));				//納品先識別区分名
			h1R.dlv_id_cd(bind.getString("dlv_id_cd"));						//納品先ＣＤ
			h1R.dlv_id_nm(bind.getString("dlv_id_nm"));						//納品先名
			h1R.dlv_cntry_cd(bind.getString("dlv_cntry_cd"));				//納品先国ＣＤ
			h1R.dlv_sundry_flg(bind.getBoolean("dlv_sundry_flg"));			//納品先国諸口ＦＬＧ
			h1R.dlv_cntry_nm(bind.getString("dlv_cntry_nm"));				//納品先国名
			h1R.dlv_zip_cd(bind.getString("dlv_zip_cd"));					//納品先郵便番号
			h1R.dlv_addr1(bind.getString("dlv_addr1"));						//納品先住所１
			h1R.dlv_addr2(bind.getString("dlv_addr2"));						//納品先住所２
			h1R.dlv_addr3(bind.getString("dlv_addr3"));						//納品先住所３
			h1R.dlv_addr4(bind.getString("dlv_addr4"));						//納品先住所４
			h1R.dlv_cntct_dpt(bind.getString("dlv_cntct_dpt"));				//納品先ＴＥＬ
			h1R.dlv_cntct_psn(bind.getString("dlv_cntct_psn"));				//納品先ＦＡＸ
			h1R.dlv_tel(bind.getString("dlv_tel"));							//納品先部署
			h1R.dlv_fax(bind.getString("dlv_fax"));							//納品先担当者
			
			h1R.ship_rqst_id_typ(bind.getString("ship_rqst_id_typ"));		//出荷依頼先区分
			h1R.ship_rqst_id_typ_nm(bind.getString("ship_rqst_id_typ_nm"));	//出荷依頼先区分名
			h1R.ship_rqst_id_cd(bind.getString("ship_rqst_id_cd"));			//出荷依頼先ＣＤ
			h1R.ship_rqst_id_nm(bind.getString("ship_rqst_id_nm"));			//出荷依頼先名
			
			h1R.via_dlv_typ(bind.getString("via_dlv_typ"));					//配送先経由区分
			h1R.via_dlv_typ_nm(bind.getString("via_dlv_typ_nm"));			//配送先経由区分名
			h1R.tdlv_cd(bind.getString("tdlv_cd"));							//配送先ＣＤ
			h1R.tdlv_nm(bind.getString("tdlv_nm"));							//配送先名
			h1R.tdlv_sundry_flg(bind.getBoolean("tdlv_sundry_flg"));		//配送先国諸口ＦＬＧ 
			h1R.tdlv_cntct_dpt(bind.getString("tdlv_cntct_dpt"));			//配送先部署
			h1R.tdlv_cntct_psn(bind.getString("tdlv_cntct_psn"));			//配送先担当者
			h1R.tdlv_zip_cd(bind.getString("tdlv_zip_cd"));					//配送先郵便番号
			h1R.tdlv_addr1(bind.getString("tdlv_addr1"));					//配送先住所１
			h1R.tdlv_addr2(bind.getString("tdlv_addr2"));					//配送先住所２
			h1R.tdlv_addr3(bind.getString("tdlv_addr3"));					//配送先住所３
			h1R.tdlv_addr4(bind.getString("tdlv_addr4"));					//配送先住所４
			h1R.tdlv_tel(bind.getString("tdlv_tel"));						//配送先ＴＥＬ
			h1R.tdlv_fax(bind.getString("tdlv_fax"));						//配送先ＦＡＸ
			h1R.tdlv_lg_grp_cd(bind.getString("tdlv_lg_grp_cd"));			//配送先物流グループＣＤ

			//配送先経由しない場合は、輸出しないので、必ずインボイス単位出荷とする
			if(!MAC_VIA_DLV_TYP.isVIA(h1R.via_dlv_typ())) {
				h1R.non_cmpl_flg(true);
				if (bind.getBoolean("purc_ddlv_flg")) {
					h1R.iv_ship_flg(false); // 仕入直送の場合は、三国間と同様にインボイス単位出荷はオフとする
				}
				else if (MSC_IV_SRC_TYP.isSHIP_INST(bind.getString("iv_src_typ"))
						|| MSC_IV_SRC_TYP.isSHIP_ACT(bind.getString("iv_src_typ"))) {
					h1R.iv_ship_flg(false);
				}
				else {
					h1R.iv_ship_flg(true);
				}
			}
			
			h1R.trnspt_cd(bind.getString("trnspt_cd"));						//輸出方法ＣＤ
			h1R.trnspt_nm(bind.getString("trnspt_nm"));						//輸出方法名
			h1R.vssl_flght(bind.getString("vssl_flght"));					//船名／便名
			h1R.load_port_cd(bind.getString("load_port_cd"));				//船積港ＣＤ
			h1R.load_port_nm(bind.getString("load_port_nm"));				//船積港名
			h1R.etd_dt(bind.getDate("etd_dt"));								//船積予定日
			h1R.dschrg_port_cd(bind.getString("dschrg_port_cd"));			//船卸港ＣＤ
			h1R.dschrg_port_nm(bind.getString("dschrg_port_nm"));			//船卸港名
			h1R.eta_dt(bind.getDate("eta_dt"));								//船卸予定日

			h1R.via_port_cd(bind.getString("via_port_cd"));					//経由地ＣＤ
			h1R.via_port_nm(bind.getString("via_port_nm"));					//経由地名
			h1R.via_schd_dt(bind.getDate("via_schd_dt"));					//経由予定日
			h1R.tterm_cd1(bind.getString("tterm_cd1"));						//取引条件ＣＤ１
			h1R.tterm_nm1(bind.getString("tterm_nm1"));						//取引条件名１
			h1R.tterm_rmrks1(bind.getString("tterm_rmrks1"));				//取引条件備考１
			h1R.tterm_cd2(bind.getString("tterm_cd2"));						//取引条件ＣＤ２
			h1R.tterm_nm2(bind.getString("tterm_nm2"));						//取引条件名２
			h1R.tterm_rmrks2(bind.getString("tterm_rmrks2"));				//取引条件備考２
			h1R.trd_cur_cd(bind.getString("trd_cur_cd"));					//通貨ＣＤ
			h1R.trd_cur_nm(bind.getString("trd_cur_nm"));					//通貨名
			h1R.xrate_inpt_flg(bind.getBoolean("xrate_inpt_flg"));			//為替レート指定
			h1R.xrate(bind.getNumber("xrate"));								//為替レート
			h1R.tterm_cd3(bind.getString("tterm_cd3"));						//取引条件ＣＤ３
			h1R.tterm_nm3(bind.getString("tterm_nm3"));						//取引条件名３
			h1R.tterm_rmrks3(bind.getString("tterm_rmrks3"));				//取引条件備考３
			h1R.trd_cur_upri_dec_place(bind.getNumber("upri_dec_place"));	//単価小数部有効桁数
			h1R.trd_cur_amt_dec_place(bind.getNumber("amt_dec_place"));		//金額小数部有効桁数
			h1R.trd_amt_rnd_typ(bind.getString("amt_rnd_typ"));				//金額端数処理区分
			h1R.trd_tax_rnd_typ(bind.getString("tax_rnd_typ"));				//税額端数処理区分

			h1R.ptax_xrate_inpt_flg(bind.getBoolean("ptax_xrate_inpt_flg"));//納税為替レート指定
			h1R.ptax_xrate(bind.getNumber("ptax_xrate"));					//納税為替レート

			h1R.bill_cl_typ(bind.getString("bill_cl_typ"));					//請求締区分
			h1R.purc_ddlv_flg(bind.getBoolean("purc_ddlv_flg"));			//仕入直送ＦＬＧ
			h1R.ar_dpt_typ(bind.getString("ar_dpt_typ"));					//債権部門区分
			h1R.lnk_ar_dpt_cd(bind.getString("lnk_ar_dpt_cd"));				//債権部門ＣＤ
			h1R.prnt_lcl_cd(bind.getString("prnt_lcl_cd"));					//帳票出力ロケールＣＤ

			// param[0] からship_schd_noのList取得
			List<String> aL = (List<String>) param[0];
			for (int i = 0; i < aL.size(); i++) {

				Cnd2R c2R = Cnd2R.create();
				 if (MSC_IV_SRC_TYP.isSHIP_SCHD(bind.getString("iv_src_typ"))) {
					 c2R.ship_schd_no(aL.get(i));
				}
				 else if (MSC_IV_SRC_TYP.isSHIP_INST(bind.getString("iv_src_typ"))) {
					 c2R.ship_inst_d_no(aL.get(i));
				}
				else if (MSC_IV_SRC_TYP.isSHIP_ACT(bind.getString("iv_src_typ"))) {
					c2R.ship_act_d_no(aL.get(i));
				}
				getCnd2L().add(c2R);
			}
			// param[1] からHGP0030.MCList<RsltR>を取得
			_msbep1710RsltTable = (MCTable<mcframe.clientMSBE.MSBEP1710.RsltR>) param[1];

			addDoBehind(Cnd_srch_2);
			setSrchTgtTyp();
		}
		
		//インボイス一覧照会(MSBEP1770)からの遷移
		if (T2 == openTyp) {
			CndR cndR = getCndR();
			
			String rcpt_iv_mng_no = bind.getString("rcpt_iv_mng_no");
			String srch_tgt_no = bind.getString("srch_tgt_no");

			if(isNull(rcpt_iv_mng_no)) {
				setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
				cndR.srch_tgt_no(srch_tgt_no);
				cndR.srch_tgt_rev(bind.getNumberNE("srch_tgt_rev"));
				cndR.iv_mng_no(bind.getStringNE("iv_mng_no"));
				cndR.latest_flg(false);
			}
			else {
				cndR.srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO.name());
				cndR.rcpt_iv_mng_no(rcpt_iv_mng_no);
				cndR.srch_tgt_no(srch_tgt_no);
			}
			
			addDoBehind(Cnd_srch);
		}
		
		// 受領インボイス一覧照会(MSBEP2250)からの遷移
		if (T3 == openTyp) {
			CndR cndR = getCndR();
			String ivNo = bind.getString("iv_no");
			if (isSame(ivNo, MAC_STR.NULL_VAL.value())) {
				setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
				cndR.srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO.name());
				cndR.rcpt_iv_mng_no(bind.getString("rcpt_iv_mng_no"));
				cndR.srch_tgt_no(bind.getString("srch_tgt_no"));
			}
			else {
				setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
				cndR.srch_tgt_no(ivNo);
			}

			addDoBehind(Cnd_srch);
		}
	}

	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg rootP = (mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg)panel;
		
		if(!MSC_DLV_ID_TYP.isDLV(rootP.Hdr_dlv_id_typ.getValue())) {
			dialog(MSBEP0105);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL1730_Prnt01();
	}
	
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		DtlR delR = deleteRow(DtlTable);
		
		// 追加対象行を削除した場合のみ、Mapテーブルの行も削除する
		if (delR != null && delR.isStatusCreate()) {
			MCList<MapDtlR> mapL = getMapDtlL().subList(MapDtlR.$index, delR.index());
			getMapDtlL().removeAll(mapL);
			MCList<ShipInstMapDtlR> shipInstMapL = getShipInstMapDtlL().subList(ShipInstMapDtlR.$index, delR.index());
			getShipInstMapDtlL().removeAll(shipInstMapL);
			
			MCList<ShipActMapDtlR> shipActMapL = getShipActMapDtlL().subList(ShipActMapDtlR.$index, delR.index());
			getShipActMapDtlL().removeAll(shipActMapL);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		setSlsAcxfrAmt();
		callMS_MSBEL1730_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1730_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1730_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_dlv_addr_p_PPanel.setRelateBeans(Hdr_dlv_id_cd, Hdr_dlv_id_nm, Hdr_dlv_sundry_flg);
		Hdr_tdlv_addr_p_PPanel.setRelateBeans(Hdr_tdlv_cd, Hdr_tdlv_nm, Hdr_tdlv_sundry_flg);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_iv_dt, true, Hdr_xrate_inpt_flg);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_xrate_cd, Hdr_iv_dt, true, Hdr_ptax_xrate_inpt_flg);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_amt_inc_tax_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);

		// 単価数量に応じて金額を計算する（単位はクリアにしか使用していないので、取引単位ＣＤのまま）
		Dtl_trd_cur_upri_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ship_rqst_id_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, 
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_upri_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place, 
				Hdr_trd_amt_rnd_typ, Hdr_trd_tax_rnd_typ, Hdr_sls_upri_cng_flg, columnDtl_sls_upri_cng_flg, columnDtl_dscnt_itm_flg);
		Dtl_trd_cur_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl_trd_cur_upri_amt_p_PPanel.setSchd(false);
		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);

		Dtl_iv_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_iv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_sno_wrk_p_PPanel.setRelateBeans(
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
				columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);

		Dtl_usr_dpt_p_PPanel.setRelateBeans(Hdr_iv_dt, columnDtl_ship_pr_no);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_iv_upri.addLCListener(this);
		columnDtl_sls_usr_cd.addLCListener(this);
		columnDtl_sls_dpt_cd.addLCListener(this);
	
		setListListener(DtlTable, createDtlRowListener());
		DtlTable.addListListener(createDtlListListener());
	}

	protected DtlListListener createDtlListListener() {
		return new DtlListListener();
	}

	/**
	 * DtlTableのリストリスナークラス
	 */
	public class DtlListListener extends MAUDP_ListListener {

		@Override
		protected void setSum(MCListEvent event) {
			super.setSum(event);
			
			setTtlAmt();
		}
	}
	
	protected DtlRowListener createDtlRowListener() {
		return new DtlRowListener();
	}

	/**
	 * 明細に対するリスナークラス
	 */
	protected class DtlRowListener implements MCRowListener, MCRowStatusListener {

		public void valueChanged(MCRowEvent event) {
			if (isIvAmtEventCols(event)) {
				setTtlAmt();
			}
		}

		public void statusChanged(MCRowStatusEvent event) {
			if (event.getOldStatus() == MCRow.Status.DELETE
					|| event.getNewStatus() == MCRow.Status.DELETE) {
				setTtlAmt();
			}
		}
	}

	/**
	 * 値変更時にインボイス計算にかかわるカラムかどうかを判断する
	 * 
	 * @param event イベント情報
	 * @return インボイス計算にかかわるカラムの場合にtrue
	 */
	protected boolean isIvAmtEventCols(MCRowEvent event) {

		return event.getColumn().equals(DtlR.$iv_amt)
					|| event.getColumn().equals(DtlR.$trd_cur_amt)
					|| event.getColumn().equals(DtlR.$trd_cur_inc_tax_amt);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlTable.setCellConfig(createMSBEP1730CellConfig());
	}

	// イベント
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_iv_upri) doDtl_iv_upri_LC(info);
		if (Dtl_itm_p_PPanel.isItm(lc)) dpDtl_itm_LC(info);
		if (lc == columnDtl_sls_dpt_cd) dpDtl_sls_dpt_cd_LC(info);
	}
	
	protected void doDtl_trd_unit_qty_LC(MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		doDtl_trd_unit_qty_LC(r);
	}
	
	/**
	 * 数量変更時のＬＣイベントで実行する処理
	 * 
	 * @param r
	 */
	protected void doDtl_trd_unit_qty_LC(DtlR r) {
		
		setUpriQty(r, true);
		//値引額を計算
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			calcDscntAmt(r);
		}
		calcIvAmt(r);
	}
	
	
	protected void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (isNull(r.trd_cur_upri())){
			setValueEx(columnDtl_iv_upri, info.getEventIndex(), null);
			if(r.manual_add_flg() || !r.existed_flg()) {
				setValueEx(columnDtl_rsn_cd, info.getEventIndex(), null);
			}
		}
		else {
			if (!isSame(r.trd_cur_upri(), 0)){
				setValueEx(columnDtl_iv_upri, info.getEventIndex(), r.trd_cur_upri());
				if (r.sls_acxfr_flg()) {
					setValueEx(columnDtl_rsn_cd, info.getEventIndex(), null);
				}
			}
		}
	}
	
	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		calcIvAmt(r);
		clearDscntInfo(r);
	}
	
	protected void doDtl_iv_upri_LC(MCEventInfo info) {
		calcIvAmt(getDtlL().get(info.getEventIndex()));
	}
	
	protected void dpDtl_sls_dpt_cd_LC(MCEventInfo info) {
		//債権部門ＣＤの設定（債権部門区分＝1：売上部門の場合）
		setArDptCd(getDtlL().get(info.getEventIndex()));
	}
	
	protected void dpDtl_itm_LC(MCEventInfo info) {
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			DtlR r = getDtlL().get(info.getEventIndex());
			
			//インボイス表記品名の設定
			setIvItmNm(r);
			
			//値引品目の初期値設定
			setColByDscntItm(r);
			
			//デフォールト税ＣＤの設定
			setDefaultTaxCd(r);

			//マニュアル追加行の場合、売上担当者ＣＤ、売上部門ＣＤの設定
			setSlsUserCdDptCd(r);

			//債権部門ＣＤの設定（債権部門区分＝2：債権部門の場合）
			setArDptCd(r);
		}
		else{
			DtlR r = getDtlL().get(info.getEventIndex());
			r.iv_itm_nm(null);
			r.tax_cd(null);
			r.tax_nm(null);
			r.tax_rate(null);
			r.sls_usr_cd(null);
			r.sls_usr_nm(null);
			r.sls_dpt_cd(null);
			r.sls_dpt_nm(null);
			r.ar_dpt_cd(null);
			r.ar_dpt_nm(null);
		}
	}
	/**
	 * 値引品目が入力された場合の固定値を設定する
	 * 
	 * @param dtlR
	 */
	protected void setColByDscntItm(DtlR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}

	/**
	 * デフォルト税ＣＤを設定する
	 * @param index
	 */
	protected void setDefaultTaxCd(DtlR r) {

		String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
				r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), 
				getHdrR().ship_rqst_id_cd(), 
				getHdrR().iv_dt(), 
				this);
		setValueEx(columnDtl_tax_cd, r.getGUIIndex(), tax_cd);
	}

	/**
	 * 値引額を計算する
	 */
	protected void calcDscntAmt(DtlR r) {

		if(r.manual_add_flg() || !r.existed_flg()) {
			return;
		}

		if (!isNullOr(r.schd_trd_cur_dscnt_amt(), getHdrR().trd_cur_amt_dec_place(),
				r.base_unit_qty(), r.schd_base_unit_qty())) {
			
			MCNumber dscntQty = r.base_unit_qty().divide(r.schd_base_unit_qty(), MA_META.QTY.scale(), MAC_RND_TYP.RNDOFF.toMC());
			MCNumber tmpDscntAmt = getAmt(r.schd_trd_cur_dscnt_amt(), dscntQty,
					getHdrR().trd_cur_amt_dec_place(), getHdrR().trd_amt_rnd_typ());

			setValueEx(columnDtl_trd_cur_dscnt_amt, r.getGUIIndex(), tmpDscntAmt);
		}
	}

	/**
	 * マニュアル追加行の場合、受注インボイスＮＯ指定のインボイスの場合は受注の売上担当者・売上部門を設定する
	 */
	protected void setSlsUserCdDptCd(DtlR r) {
		if(getHdrR().is_slo_iv_no()) {
			String sls_usr_cd = null;
			String sls_dpt_cd = null;
			MCList<DtlR> dL = exceptEmpty(getDtlL());
			for (DtlR dR : dL) {
				if(dR.existed_flg()) {
					sls_usr_cd = dR.sls_usr_cd();
					sls_dpt_cd = dR.sls_dpt_cd();

					break;
				}
			}

			setValueEx(columnDtl_sls_usr_cd, r.getGUIIndex(), sls_usr_cd);
			setValueEx(columnDtl_sls_dpt_cd, r.getGUIIndex(), sls_dpt_cd);
		}
	}

	/**
	 * 債権部門ＣＤの設定
	 * @param r
	 */
	protected void setArDptCd(DtlR r) {
		if(!isNull(r.ar_dpt_cd())) {
			return;
		}
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			if(MAC_AR_DPT_TYP.isAR(getHdrR().ar_dpt_typ())) { //得意先の債権部門区分＝2：債権部門の場合
				if(isNull(r.itm_cd())) {
					return;
				}
				setValueEx(columnDtl_ar_dpt_cd, r.getGUIIndex(), getHdrR().lnk_ar_dpt_cd());
			}
			else if(MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())) { //得意先の債権部門区分＝1：売上部門の場合
				// 売上部門を債権部門に設定できないケースがあるため、setValueExを使わない
				columnDtl_ar_dpt_cd.setValue(r.getGUIIndex(), r.sls_dpt_cd());
			}
		}
	}

	/**
	 * インボイス表記品名を設定する。
	 * @param r
	 */
	protected void setIvItmNm(DtlR r) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			if(isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
				setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), null);
			}
			else {
				MCRow row = MAUCP_ItmUtil.getItmLcl(
						getHdrR().prnt_lcl_cd(), 
						r.itm_cd(), 
						r.itm_sub1(), 
						r.itm_sub2(), 
						r.itm_sub3(), 
						this);
				if (!isNull(row.getStringNE("lcl_cd"))) {
					setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), row.getStringNE("itm_nm"));
				}
				else {
					setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), r.getStringNE("itm_nm"));
				}
			}
		}
	}

	/**
	 * インボイス金額を計算する
	 */
	protected void calcIvAmt(DtlR r) {

		MCNumber amt = null;
		if (!isNull(r.iv_upri()) && r.iv_upri().isZero()) {
			amt = MCNumber.ZERO;
		}

		if (!isNullOr(r.iv_upri(), r.trd_unit_qty(), getHdrR().trd_cur_amt_dec_place(),
				getHdrR().trd_amt_rnd_typ())) {
			
			if (isSame(r.trd_cur_upri(), r.iv_upri())) {
				amt = r.trd_cur_amt();
			}
			else {
				amt = getAmt(r.iv_upri(), r.upri_qty(), getHdrR().trd_cur_amt_dec_place(), getHdrR().trd_amt_rnd_typ());
			}
		}
		setValueEx(columnDtl_iv_amt, r.getGUIIndex(), amt);
	}

	protected void clearDscntInfo(DtlR r) {
		if (isNull(r.trd_cur_amt()) || r.trd_cur_amt().isZero()) {
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
		}
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		
		getHdrR().xrate_inpt_flg(false);
		getHdrR().ptax_xrate_inpt_flg(false);
		setXrateInptFlgMode();
		
	}
	
	/**
	 * 為替レート指定ＦＬＧ、納税為替レート指定ＦＬＧのモードを設定する
	 */
	protected void setXrateInptFlgMode() {
		
		// 金額計算しない取引（インボイス単価のみ指定する取引）は、
		// インボイスの為替レートが実績および受払には影響しないので、レートの入力は不可とする。
		if (isNoAmtTrd()) {
			Hdr_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else if (isNullOr(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd()) 
				|| isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd())) {
			Hdr_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_xrate_inpt_flg);
		}
		
		if (isNoAmtTrd()) {
			Hdr_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else if (isNullOr(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd())
				|| isSame(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd())) {
			Hdr_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_ptax_xrate_inpt_flg);
		}
	}
	
	/**
	 * 金額計算しない取引か
	 * 
	 * @return
	 */
	protected boolean isNoAmtTrd() {
		
		if (MAC_TRD_PTN_TYP.isXFR(getHdrR().trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isXFR_RTN(getHdrR().trd_ptn_typ())) {
			return true;
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			return true;
		}
		else if (MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ()) 
				&& (MAC_PROV_BASIS_TYP.isINPT(getHdrR().prov_basis_typ()) || isNull(getHdrR().prov_basis_typ()))) {
			return true;
		}
		return false;
	}
	
	@Override
	public void doHdr_sls_schd_dt_LC(MCEventInfo info) {
		super.doHdr_sls_schd_dt_LC(info);
		setValueEx(Hdr_bill_basis_dt, getHdrR().sls_schd_dt());
		setDefaultTaxCd();
	}
	
	/**
	 *  売上税の初期値を設定する。
	 */
	protected void setDefaultTaxCd() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultTaxCd(dtlR.getGUIIndex());
		}
	}
	
	/**
	 * 売上税の初期値を設定する。
	 * @param index インデックス
	 */
	protected void setDefaultTaxCd (int index) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().sls_schd_dt())) {
			
			DtlR r = getDtlL().get(index);
			if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) || r.tax_fix_flg()) {
				return;
			}
			
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().ship_rqst_id_cd(), getHdrR().sls_schd_dt(), this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
		}
	}
	
	@Override
	public void doHdr_pl_skip_flg_NC(MCEventInfo info) {
		
		super.doHdr_pl_skip_flg_NC(info);
		
		setBtn_Open_MSBEP1750Mode();
	}

	@Override
	public void doHdr_num_flg_NC(MCEventInfo info) {
		
		super.doHdr_num_flg_NC(info);
		
		setValueEx(Hdr_iv_no, null);
		setIvNoModeByNumFlg();
		
	}
	
	@Override
	public boolean doHdr_iv_no_VC(MCEventInfo info) {
		
		String s = (String)info.getNewValue();
		
		if (MAC_STR.isNULL_VAL(s)) {
			return false;
		}
		
		return super.doHdr_iv_no_VC(info);
		
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		setAddDelUpDownBtnMode();
	}

	protected void setIvNoModeByNumFlg() {
		
		if (getHdrR().num_flg()) {
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_iv_no);
		}
	}
	
	@Override
	public void doDtl_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_rsn_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (!r.sls_acxfr_flg()) {
			
			r.bd_dpt_cd(null);
			r.bd_dpt_nm(null);
		}
	}
	
	@Override
	public void doCnd_srch_tgt_no_LC(MCEventInfo info){
		super.doCnd_srch_tgt_no_LC(info);
		
		getCndR().iv_mng_no(null);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
		Cnd_srch_tgt_no.mcRequestFocus();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setSrchTgtTyp();
	}
	
	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		setRevNoMode();
	}
	
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		setSrchCndMode();
		setRevNoMode();
	}
	
	/**
	 * 検索条件のモードを設定する。
	 */
	protected void setSrchCndMode() {
		
		if (Cnd_ope_INS.isSelected()) {
			Cnd_srch_tgt_typ_nm.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cnd_srch_tgt_typ_nm);
		}
	}

	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO.name());
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.IV_NO.name());
		}
	}

// ListBox
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(	row,
				new MSC_STK_SRCH_TGT_TYP[]{
					MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO,
					MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO,
					MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO
				}
			);
		}
		else {
			addListLogicCnd(	row,
				new MSC_STK_SRCH_TGT_TYP[]{
					MSC_STK_SRCH_TGT_TYP.IV_NO
				}
			);
		}

		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		getDtl_ar_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_iv_dt);
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_iv_dt);
		getDtl_trd_cd_ListPutter().putBind(TrdCols.$i_trd_ptn_typ, Hdr_trd_ptn_typ);
	}

	@Override
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE("dt", Hdr_iv_dt.getValue());
		return super.getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
	}
	
	@Override
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info) {
		
		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		
		if (!isNull(dtlR.trd_cur_upri()) && dtlR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getDtl_rsn_cd(row, info);
	}

	@Override
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE("dt", Hdr_iv_dt.getValue());
		return super.getDtl_bd_dpt_cd(row, info);
	}

// IfOpePanel
	/**
	 * 操作種別のボタングループを取得する
	 *
	 */
	public MCButtonGroup getOpeButtonGroup () {
		return Cnd_ope_Group;
	}

	/**
	 * 登録用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> arr = new ArrayList<>();
		arr.add(getHdrR());
		arr.add(getDtlL());
		arr.add(getTtlR());
		return arr;
	}

	/**
	 * 検索条件用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> arr = new ArrayList<>();
		arr.add(getCndR());
		return arr;
	}
	
	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_srch_tgt_rev;
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}
	
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		setSrchTgtTyp();
		_msbep1710RsltTable = null;
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand())) {
			//参照登録させない
			if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
				setSRCHStatus();
				getHdrR().clear();
				getHdrR().setStatus(Status.NONE);
				getDtlL().clear();
				getDtlL().setStatus(Status.NONE);
				getTtlR().clear();
				Cnd_srch_tgt_no.clear();
			}
			if (isSame(afOpe, Cnd_ope_UPD.getActionCommand())) {
				if (!isNull(getHdrR().trd_ptn_typ()) && !getHdrR().cmpl_flg()) {
					setTrdSchdDtMode();
					getHdrR().iv_immed_prnt_flg(true);
				}
			}
		}
		else {
			setSRCHStatus();
		}

		Cnd_srch_tgt_no.mcRequestFocus();

		if (!isNull(getDtlL())) {
			DtlTable.selectRowNoFocus(0);
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			
			getCndR().srch_tgt_no(getHdrR().iv_no());
		}
	}

	/**
	 * フォーカスを設定する
	 */
	protected void setFocus() {
		String st = getStatus();
		if (isSRCHStatus(st) || isREFStatus(st) || isDELStatus(st)
				|| isUPD3Status(st) || isFIX_IStatus(st) 
				|| isFIX_UStatus(st) || isFIX_DStatus(st)) {
			Cnd_srch_tgt_no.mcRequestFocus();
		}
		else if (isINSStatus(st) || isUPD1Status(st) || isUPD2Status(st)) {
			HdrPanel.focusFirstComponent();
		}
	}

	protected boolean isUPD1Status(String status) {
		return isSame(status, "UPD1");
	}

	protected boolean isUPD2Status(String status) {
		return isSame(status, "UPD2");
	}

	protected boolean isUPD3Status(String status) {
		return isSame(status, "UPD3");
	}
	
	/**
	 * 預り売上かつ売上済か判定する。
	 * @return 預り売上かつ売上済はtrue
	 */
	protected boolean isSlsCstStkSlsCmpl() {
		 return getHdrR().sls_cststk_flg() && getHdrR().sls_cmpl_flg();
	}
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		
		_msbep1710RsltTable = null;
	}

// IfRowMoveBase
	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	// - CellConfig ----------------------------------------//
	protected MCCellConfig createMSBEP1730CellConfig() {
		return new MSBEP1730CellConfig();
	}

	/**
	 * DtlTableのCellConfig
	 */
	public class MSBEP1730CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (isREFStatus(getStatus())
					|| isDELStatus(getStatus())
					|| isFIX_IStatus(getStatus())
					|| isFIX_UStatus(getStatus())
					|| isFIX_DStatus(getStatus())
					|| getHdrR().cmpl_flg())
			{
				return super.getPriorMode(index, column, table);
			}
			
			DtlR activeR = DtlTable.getRow(index);

			if(activeR.isEmpty()) {
				//取引区分：売上以外の場合、空行の入力を不可にする
				if (!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// マニュアル追加でない場合、一部の項目のみ（数量、原産地、備考など）入力できるように制御
			if (!activeR.manual_add_flg() && activeR.existed_flg()) {
				if(isINSStatus(getStatus()) || isUPD1Status(getStatus())) {
					if (isNonManualEnablePriorColumns(column)) {
						//まとめＦＬＧがオン、またはインボイス単位出荷の場合、数量の入力不可
						if(column == columnDtl_trd_unit_qty) {
							if(activeR.bndl_flg() || getHdrR().iv_ship_flg() || getHdrR().sls_cststk_flg() 
									|| !isNull(getHdrR().rcpt_iv_mng_no()) || !isNull(activeR.purc_schd_no()) || activeR.dscnt_itm_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						//単価が未設定または「0」の場合、ＩＶ単価は入力必須
						if (column == columnDtl_iv_upri) {
							if ((!MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && isNull(activeR.trd_cur_upri()))
									|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && activeR.sls_acxfr_flg())
									|| (!isNull(activeR.trd_cur_upri()) && activeR.trd_cur_upri().isZero())) {
								return MCMode.REQUIRED;
							}
							else {
								return MCMode.READ_ONLY;
							}
						}
						else if (column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
							if (!activeR.upri_not_tgt_flg() || activeR.sls_acxfr_flg() || !activeR.sls_upri_cng_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						else if  (column == columnDtl_trd_cur_upri
							||  column == columnDtl_interim_flg
							||  column == columnDtl_upri_not_tgt_flg
							||  column == columnDtl_tax_fix_flg
							||  column == columnDtl_tax_cd
							||  column == columnDtl_trd_cur_dscnt_amt
							||  column == columnDtl_dscnt_rsn_cd) {
							if (activeR.sls_acxfr_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						else if (column == columnDtl_ar_dpt_cd) {
							if (!activeR.uplnd_flg()) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.ENABLE;
							}
						}
						else if (column == columnDtl_trd_unit_qty ) {
							if (activeR.dscnt_itm_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						return super.getPriorMode(index, column, table);
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if(isUPD2Status(getStatus())) {
					if (isNonManualEnablePriorColumnsPL(column)) {
						return super.getPriorMode(index, column, table);
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
			}
			else {
				if(column == columnDtl_sls_usr_cd || column == columnDtl_sls_dpt_cd) {
					if(getHdrR().is_slo_iv_no()) {
						return MCMode.READ_ONLY;
					}
					else {
						return super.getPriorMode(index, column, table);
					}
				}
				if (column == columnDtl_rsn_cd){
					if (isSame(activeR.trd_cur_upri(),0)){
						if (isINSStatus(getStatus()) || isUPD1Status(getStatus()) || isUPD2Status(getStatus())) {
							return MCMode.REQUIRED;
						}
					}
				}
				if (column == columnDtl_bd_dpt_cd){
					if (activeR.sls_acxfr_flg()){
						if (isINSStatus(getStatus()) || isUPD1Status(getStatus()) || isUPD2Status(getStatus())) {
							return MCMode.REQUIRED;
						}
					}
				}
				if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty ) {
					if (activeR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
					if (!activeR.upri_not_tgt_flg() || !activeR.sls_upri_cng_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			if(column == columnDtl_iv_itm_nm) {
				//マニュアル追加かつ諸口品の場合、Ｉ／Ｖ品名を入力必須にする
				if ((activeR.manual_add_flg() || !activeR.existed_flg()) && activeR.sundry_itm_flg()) {
					if (isINSStatus(getStatus()) || isUPD1Status(getStatus()) || isUPD2Status(getStatus())) {
						return MCMode.REQUIRED;
					}
				}
			}
			
			if(column == columnDtl_iv_upri) {
				if (isNull(activeR.trd_cur_upri()) || activeR.trd_cur_upri().isZero()) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}

		/**
		 * マニュアル追加以外の行で入力可能カラムかどうか（ＰＬ登録済み以外の場合）
		 * 
		 * @param column 判断するカラム
		 * @return 
		 */
		protected boolean isNonManualEnablePriorColumns(MCColumnConfig column) {

			return column == columnDtl_trd_unit_qty
					|| column == columnDtl_iv_upri
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_trd_cur_upri)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_trd_cur_amt)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_trd_cur_inc_tax_amt)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_interim_flg)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_upri_not_tgt_flg)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_tax_fix_flg)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_tax_cd)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_trd_cur_dscnt_amt)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_dscnt_rsn_cd)
					|| (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && column == columnDtl_ar_dpt_cd)
					|| column == columnDtl_trd_rmrks
					|| column == columnDtl_trd_d_rmrks
					|| column == columnDtl_intr_d_rmrks
					|| column == columnDtl_iv_d_rmrks
					|| column == columnDtl_dtl_sub_char1
					|| column == columnDtl_dtl_sub_char2
					|| column == columnDtl_dtl_sub_char3;
		}
		
		/**
		 * マニュアル追加以外の行で入力可能カラムかどうか（ＰＬ登録済みの場合）
		 * 
		 * @param column 判断するカラム
		 * @return 
		 */
		protected boolean isNonManualEnablePriorColumnsPL(MCColumnConfig column) {

			return column == columnDtl_trd_rmrks
					|| column == columnDtl_trd_d_rmrks
					|| column == columnDtl_intr_d_rmrks;
		}
	}

	/**
	 * UPDStatus 実装仕様書でUPD1、UPD2、UPD3を作成した為<br>
	 * UPD1:PL未登録の場合<br>
	 * UPD2:PL登録済みの場合<br>
	 * UPD3:完了済みの場合<br>
	 */
	@Override
	public void setUPDStatus() {

		// 完了済の場合
		if (getHdrR().cmpl_flg()) {
			setUPD3Status();
		}
		// 預り売上かつ売上済の場合
		else if (isSlsCstStkSlsCmpl()) {
			setUPD3Status();
			setSlsCstStkSlsCmplMode();
		}
		// PL未登録の場合
		else if (!getHdrR().pl_reg_flg()) {
			setUPD1Status();

			//インボイス関連項目の制御
			setIvMode();
			//ヘッダ：請求起算日の制御
			setBillBasisDtMode();
			//ヘッダ：入金予定日の制御
			setRcvSchdDtMode();
			//ボタン:画面遷移、インボイス再発行の制御
			setBtnMode();
			//ボタン：行追加の制御
			setRaddMode();
			//為替レート指定ＦＬＧの制御
			setXrateInptFlgMode();
			//取引条件ＣＤ１～３の制御
			seTttermCdMode();
			//輸出関連項目の制御
			setExMode();

			setBtn_Open_MSBEP1750Mode();
		}
		// PL登録済みの場合
		else {
			setUPD2Status();

			//インボイス関連項目の制御
			setIvMode();
			//ヘッダ：入金予定日の制御
			setRcvSchdDtMode();
			//ボタン:画面遷移、インボイス再発行の制御
			setBtnMode();
			//ボタン：行追加の制御
			setRaddMode();
			//ボタン：行削除の制御
			setRdelBtnMode();
			//ボタン：移動ボタンの制御
			setMoveBtnMode();
		}
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		//輸出関連項目の制御
		setExMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		
		setBtn_Open_MSBEP1750ModeForFix();
		setShipInstMode();
		setShipActMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		
		setBtn_Open_MSBEP1750ModeForFix();
		setShipInstMode();
		setShipActMode();
	}
	
	@Override
	public boolean isUPDStatus(String status) {
		return isSame(status, UPD1)
				|| isSame(status, UPD2)
				|| isSame(status, UPD3);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setBtn_Open_MSBEP1750Mode();
		if (getHdrR().cmpl_flg() || isSlsCstStkSlsCmpl()) {
			setUPD3Status();
		}
		setShipInstMode();
		setShipActMode();
	}
	
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setShipInstMode();
		setShipActMode();
	}

	/**
	 * インボイス明細追加選択画面で選択された明細Listを、既存の明細Listにまとめて表示する。
	 * インボイス明細追加選択画面から実行するためのメソッド
	 * 
	 * @param addL　インボイス明細選択画面で選択された明細List
	 */
	public void mergeDtl(MCList<DtlR> addL) {
		int index;
		
		MCList<DtlR> tmpAddL = MCList.create(DtlR.class);
		tmpAddL.setAll(addL);
		tmpAddL.sort(DtlR.$slo_no, DtlR.$ship_rqst_no, DtlR.$purc_schd_no, DtlR.$trd_unit_cd, DtlR.$purc_act_d_no, DtlR.$dlv_slip_d_no);
		
		MCList<DtlR> dL = exceptEmpty(getDtlL());
		if(isNull(dL)) {
			dL = MCList.create(DtlR.class);
		}
		index = dL.size() > 0 ? ((MCNumber)dL.max(DtlR.$index)).intValue() : 1;

		MCList<DtlR> newDL = MCList.create(DtlR.class);
		
		//１．遷移先（インボイス明細追加選択）のデータを遷移元（インボイス登録）のデータにまとめる
		for (DtlR dR : dL) {

			newDL.add(dR);

			if(dR.isStatusDelete()) {
				continue;
			}

			if(isNull(dR.index())) {//マニュアル追加明細データの想定
				continue;
			}

			for (int i = 0; i < tmpAddL.size(); i ++) {
				DtlR addR = tmpAddL.get(i);
					if(((!dR.uplnd_flg() && !addR.uplnd_flg() 
							&& !getHdrR().sls_cststk_flg()
							&& isSame(dR.slo_no(), addR.slo_no()) 
							&& isSame(dR.ship_rqst_no(), addR.ship_rqst_no()) 
							&& isSame(dR.purc_schd_no(), addR.purc_schd_no()) 
							&& isSame(dR.purc_act_d_no(), addR.purc_act_d_no()))
							|| (dR.uplnd_flg() && addR.uplnd_flg() 
									&& isSame(dR.dlv_slip_d_no(), addR.dlv_slip_d_no())))
							&& isSame(dR.trd_unit_cd(), addR.trd_unit_cd())) 
				{
					if(dR.isStatusNone()) {
						dR.setStatus(MCRow.MODIFY);
					}

					//取引単位数量、基準単位数量、値引額をまとめる
					sum2(dR, addR, true);
					dR.bndl_flg(true);
					dR.iv_d_sel_bndl_flg(true);
					
					if (!isSame(dR.ship_fr_lg_grp_cd(), addR.ship_fr_lg_grp_cd())) {
						dR.multi_ship_fr_lg_grp_flg(true);
						dR.ship_fr_lg_grp_cd(null);
						dR.ship_fr_lg_grp_nm(null);
					}

					if (!addR.uplnd_flg()) {
						addIvMap(dR.index(), addR);
					}
					
					if (MSC_IV_SRC_TYP.isSHIP_INST(getHdrR().iv_src_typ())) {
						addIvShipInstMap(dR.index(), addR);
						dR.ship_inst_no(null);
						dR.ship_inst_d_no(null);
					}
					else if (MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
						addIvShipActMap(dR.index(), addR);
						dR.ship_act_no(null);
						dR.ship_act_d_no(null);
					}
					
					tmpAddL.remove(i);
					i--;
				}
			}
			setAmtD(dR);
		}

		//２．上記１．で纏められなくて残った遷移先（インボイス明細追加選択）のデータ同士間をまとめる
		for(int i = 0; i < tmpAddL.size(); i ++) {
			DtlR dR = tmpAddL.get(i);
			dR.setStatus(MCRow.CREATE);
			index++;
			dR.index(index);

			if (!dR.uplnd_flg()) {
				addIvMap(dR.index(), dR);
			}
			if (MSC_IV_SRC_TYP.isSHIP_INST(getHdrR().iv_src_typ())) {
				addIvShipInstMap(dR.index(), dR);
			}
			if (MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
				addIvShipActMap(MCNumber.valueOf(index), dR);
			}
			
			for(int j = i + 1; j < tmpAddL.size(); j ++) {
				DtlR d2R = tmpAddL.get(j);
				if(((!dR.uplnd_flg() && !d2R.uplnd_flg() 
						&& isSame(dR.slo_no(), d2R.slo_no()) 
						&& isSame(dR.ship_rqst_no(), d2R.ship_rqst_no()) 
						&& isSame(dR.purc_schd_no(), d2R.purc_schd_no()) 
						&& isSame(dR.purc_act_d_no(), d2R.purc_act_d_no()))
						|| (dR.uplnd_flg() && d2R.uplnd_flg() 
								&& isSame(dR.dlv_slip_d_no(), d2R.dlv_slip_d_no())))
						&& isSame(dR.trd_unit_cd(), d2R.trd_unit_cd()))
				{
					//取引単位数量、基準単位数量をまとめる
					sum2(dR, d2R, false);
					dR.bndl_flg(true);
					dR.iv_d_sel_bndl_flg(true);

					if (!d2R.uplnd_flg()) {
						addIvMap(dR.index(), d2R);
					}
					if (MSC_IV_SRC_TYP.isSHIP_INST(getHdrR().iv_src_typ())) {
						addIvShipInstMap(dR.index(), d2R);
						dR.ship_inst_no(null);
						dR.ship_inst_d_no(null);
					}
					else if (MSC_IV_SRC_TYP.isSHIP_ACT(getHdrR().iv_src_typ())) {
						addIvShipActMap(dR.index(), d2R);
						dR.ship_act_no(null);
						dR.ship_act_d_no(null);
					}

					tmpAddL.remove(j);
					j--;
				}
				else {
					break;
				}
			}
			
			setAmtD(dR);

			newDL.add(dR);
		}
		getDtlL().setAll(newDL);
		
		// 3.明細追加選択によりまとめになった行に対して、金額計算をする
		for (DtlR dR : getDtlL()) {
			if (dR.iv_d_sel_bndl_flg()) {
				Dtl_trd_cur_upri_amt_p_PPanel.setTrdCurAmt(dR.getGUIIndex());
				doDtl_trd_unit_qty_LC(dR);
				dR.iv_d_sel_bndl_flg(false);
			}
		}
		
		DtlTable.selectRowNoFocus(0);
	}
	/**
	 * 販売他勘定の単価と金額を設定する。
	 */
	protected void setSlsAcxfrAmt() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if ( dtlR.uplnd_flg() && dtlR.sls_acxfr_flg() && isNull(dtlR.trd_cur_upri())) {
				setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), MCNumber.ZERO);
			}
		}
	}
	
	protected void addIvMap(MCNumber index, DtlR addR) {
		
		MapDtlR mapR = MapDtlR.create();
		mapR.index(index);
		mapR.ship_schd_no(addR.ship_schd_no());
		mapR.trd_unit_qty(addR.trd_unit_qty());
		mapR.base_unit_qty(addR.base_unit_qty());
		mapR.pr_sts_typ(addR.pr_sts_typ());
		mapR.ship_inst_typ(addR.ship_inst_typ());
		getMapDtlL().add(mapR);
	}
	
	protected void addIvShipInstMap(MCNumber index, DtlR addR) {
		
		ShipInstMapDtlR mapR = ShipInstMapDtlR.create();
		mapR.index(index);
		mapR.ship_inst_d_no(addR.ship_inst_d_no());
		mapR.ship_schd_no(nvl(addR.ship_schd_no(), MAC_STR.NULL_VAL.value()));
		mapR.ship_alloc_sts_no(nvl(addR.ship_alloc_sts_no(), MAC_STR.NULL_VAL.value()));
		mapR.base_unit_qty(addR.base_unit_qty());
		getShipInstMapDtlL().add(mapR);
	}
	
	protected void addIvShipActMap(MCNumber index, DtlR addR) {
		
		ShipActMapDtlR mapR = ShipActMapDtlR.create();
		mapR.index(index);
		mapR.ship_act_d_no(addR.ship_act_d_no());
		mapR.ship_schd_no(nvl(addR.ship_schd_no(), MAC_STR.NULL_VAL.value()));
		mapR.ship_alloc_sts_no(nvl(addR.ship_alloc_sts_no(), MAC_STR.NULL_VAL.value()));
		mapR.base_unit_qty(addR.base_unit_qty());
		getShipActMapDtlL().add(mapR);
	}

	/**
	 * d2Rの取引単位数量、基準単位数量を、dRにまとめる。
	 * @param dR
	 * @param d2R
	 * @param flg
	 */
	protected void sum2(DtlR dR, DtlR d2R, boolean flg) {

		//インボイス登録可能数量を超えた場合、インボイス登録可能数量でまとめる。
		if(flg && !dR.bndl_flg() && dR.base_unit_qty().gt(dR.max_base_unit_qty())) {
			dR.trd_unit_qty(dR.max_trd_unit_qty());
			dR.base_unit_qty(dR.max_base_unit_qty());
		}

		//取引単位数量、基準単位数量をまとめる
		dR.trd_unit_qty(dR.trd_unit_qty().add(d2R.trd_unit_qty()));
		dR.base_unit_qty(dR.base_unit_qty().add(d2R.base_unit_qty()));
		
		//単価数量を洗い替える
		setUpriQty(dR, false);
	}

}