package mcframe.clientMSBD.MSBDP0140;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5330.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;

import java.util.Map;
import java.util.HashMap;

import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import mcframe.clientMAUC.MAUCP0050.*;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientMAUC.MAUCP0020.*;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.commonCore.container.MCRow.Status.*;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import mcframe.clientFXUC.FXUCP0170.FXUCP_ValidaterUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcReg_MC extends MSBDP_PurcReg_MC_A implements IfOpePanel, IfRowMoveBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _maxDtlPegNo = 1;
	protected int _maxIoPegNo = 1;

	/** 詳細行を一括でキャッシュするリスト */
	public Map<MCNumber, MCList<Dtl2R>> _dtl2L = new HashMap<MCNumber, MCList<Dtl2R>>();

	// 明細反映ボタン実行中フラグ
	protected boolean _updDtlBtnExecFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcReg_MC() {
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
	public MSBDP_PurcReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Dtl1Btn]のボタン[radd_no_schd]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_radd_no_schd(MCEventInfo info) {
		insertRow(Dtl1Table);
	}
	/**
	 * Panel[Dtl1Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_radd(MCEventInfo info) {
		insertRow(Dtl1Table);
	}
	/**
	 * Panel[Btn]のボタン[ins_noschd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_noschd(MCEventInfo info) {
		callMS_MSBDL0140_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_noschd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_noschd(MCEventInfo info) {
		callMS_MSBDL0140_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_noschd]の押下時の処理
	 */
	@Override
	public void doBtn_del_noschd(MCEventInfo info) {
		callMS_MSBDL0140_Del01();
	}
	/**
	 * Panel[Dtl1Btn]のボタン[open_MSBEP2240]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_open_MSBEP2240(MCEventInfo info) {
		// MSBEP2210に実装
	}
	/**
	 * [MS_MSBDL0140_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Sprt01Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/**
		 *  更新ボタンのイベントかどうかを表すフラグ
		 */
		protected boolean _upd_btn_event_flg = false;
		/**
		 * 続行不可能かどうかを表すフラグ
		 */
		protected boolean _error_flg = false;
		
		MCList<Dtl1R> _tgtList;
		
		protected MS_MSBDL0140_Sprt01Caller(P p, B b) {
			super(p, b);
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
		protected void initCaller() {
			super.initCaller();
			getHdr1R().xrate_base_dt(getHdr1R().purc_dt());
			
			_tgtList = getSprtTgtDtl1L(_upd_btn_event_flg);
			
			// 明細行のＷＧＣＤがＮＵＬＬの場合、詳細行の1行目から補完する
			for (Dtl1R tgtRow : _tgtList) {

				if (isNull(tgtRow.po_d_no())) {
					tgtRow.upri_trd_unit_qty(tgtRow.trd_unit_qty());
				}
				else {
					if (isSame(tgtRow.src_trd_unit_cd(), tgtRow.trd_unit_cd())) {
						tgtRow.upri_trd_unit_qty(tgtRow.src_trd_unit_qty());
					}
					else {
						tgtRow.upri_trd_unit_qty(tgtRow.trd_unit_qty());
					}
				}

				if (isNull(tgtRow.dlv_loc_wg_cd())) {
					MCList<Dtl2R> chdIoL = _dtl2L.get(tgtRow.peg_no());
					if (isNull(chdIoL)) {
						continue;
					}
					Dtl2R ioRow = chdIoL.get(0);
					tgtRow.dlv_loc_wg_cd(ioRow.dlv_loc_wg_cd());
				}
			}
			
			//更新ボタンイベントのときは同期にする
			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().setAll(_tgtList);
			
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			//単価再取得ボタンイベントのときは必要に応じてメッセージを表示
			if (!_upd_btn_event_flg) {
				if (_tgtList.isEmpty()) {
					msgList.add(new MCMessage(MSBDP0013));
				}				
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			
			//　単価取得に最低限必要な必須チェックのみ実施する
			checkReqDt(msgList);
			msgList.addAll(
					MSUCP_PurcUtil.chkForUpriExptDt(
						panel, _tgtList, 
						Hdr1_sppl_cd, 
						Hdr1_trd_cur_cd, 
						columnDtl1_dlv_loc_wg_cd,
						columnDtl1_itm_cd,
						columnDtl1_itm_sub1,
						columnDtl1_itm_sub2,
						columnDtl1_itm_sub3,
						columnDtl1_trd_unit_cd,
						columnDtl1_trd_unit_qty,
						columnDtl1_base_unit_qty)
					);
			
			
			if (!msgList.isEmpty()) {
				_error_flg = true;
			}
		}
		protected void checkReqDt(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(
					Hdr1_purc_dt
					));
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			//単価再取得ボタンイベントのときは確認メッセージを表示
		if (!_upd_btn_event_flg) {
				return new MCMessage(MSBDP0014);
			}
			return null;
		}
		
		@Override
		protected void show() {
			//Ins01,Upd01用に変更前の値をキャッシュ
			_tgtList.forEach(dr -> cacheUpri(dr));
			super.show();
			//単価イベントを実行
			MCMessageList msgL = new MCMessageList();
			_tgtList.forEach(dr -> {
				doUpriEvent(dr, msgL);
			});
			if (!msgL.isEmpty()) {
				_error_flg = true;
				message(msgL);
			}
		}

		
	}

	protected MCList<Dtl1R> getSprtTgtDtl1L(boolean updBtnEventFlg) {
		MCList<Dtl1R> upL = MCList.create(Dtl1R.class);
		for (Dtl1R r : getDtl1L()) {
			if (isTgt(r, updBtnEventFlg)){
				upL.add(r);
			}
		}
		return upL;
	}
	protected boolean isTgt(Dtl1R r, boolean updBtnEventFlg) {
		if (r.upri_not_tgt_flg() 
				|| r.isStatusDelete() || r.isEmpty() || !hasCost(r)) {
			return false;
		}
		else if (updBtnEventFlg && hasSchd(r)) {
			return false;
		}
		else {
			return true;
		}
	}
	protected boolean hasSchd(Dtl1R r) {
		if (isNull(r.po_d_no())){
			return false;
		}
		return true;
	}
	
	/**
	 * 単価をキャッシュする。
	 */
	protected void cacheUpri(Dtl1R dr) {
		dr.old_trd_cur_upri(dr.trd_cur_upri());
		dr.old_trd_cur_proc_upri(dr.trd_cur_proc_upri());
		dr.old_trd_cur_onr_prov_upri(dr.trd_cur_onr_prov_upri());
	}
	
	/**
	 * 単価をキャッシュした値に戻す。
	 */
	protected void restoreUpri(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		MCNumber u = dr.old_trd_cur_upri();
		MCNumber pu = dr.old_trd_cur_proc_upri();
		MCNumber opu = dr.old_trd_cur_onr_prov_upri();
		setValueEx(columnDtl1_trd_cur_upri, idx, u);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, pu);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, opu);
	}

	/**
	 * 単価のイベントを発生させる。
	 */
	protected void doUpriEvent(Dtl1R dr, MCMessageList msgL) {
		int idx = dr.getGUIIndex();
		MCNumber u = dr.trd_cur_upri();
		MCNumber pu = dr.trd_cur_proc_upri();
		MCNumber opu = dr.trd_cur_onr_prov_upri();
		// 一度単価をクリアするとイベントで値引額がクリアされるので保持する
		MCNumber dscntAmt = dr.trd_cur_dscnt_amt();
		String dscntRsnCd = dr.dscnt_rsn_cd();
		String dscntRsnNm = dr.dscnt_rsn_nm();
		
		// 同一値でイベントを発生させるために一度クリアする
		setValueEx(columnDtl1_trd_cur_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, null);
		// イベントを発生させる
		setValueEx(columnDtl1_trd_cur_upri, idx, u);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, pu);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, opu);
		
		if ((!isNull(dr.trd_cur_amt()) && !isNull(dscntAmt) && dr.trd_cur_amt().lt(dscntAmt))
				|| (isNull(u) && !isNull(dscntAmt))) {
			// 金額<値引額のときと、元々は単価・値引額が入力されていたがマスタ単価が取得できず値引額が残ってしまった場合は、値引額をクリアする
			msgL.add(new MCMessage(dr, null, MSBDP0036, dscntAmt, dscntRsnCd, dscntRsnNm, toDispGUIIndex(dr)));
			setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, null);
			setValueEx(columnDtl1_dscnt_rsn_cd, idx, null);
		}
		else {
			setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, dscntAmt);
			setValueEx(columnDtl1_dscnt_rsn_cd, idx, dscntRsnCd);
		}
	}
	
	/**
	 * 単価再取得処理を実行します。
	 * @return 正常に終了した場合true
	 */
	protected boolean doSprt() {
		MSBDP_PurcReg.MS_MSBDL0140_Sprt01Caller caller = createMS_MSBDL0140_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		return !caller.getErrorFlg();
	}
	
	
	/**
	 * Panel[Btn]のボタン[srch_upri]の押下時の処理
	 */
	@Override
	public void doBtn_srch_upri(MCEventInfo info) {
		callMS_MSBDL0140_Sprt01();
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		columnDtl1_itm_cd.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub1.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub2.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub3.addIgnoreListBeans(columnDtl1_maker_cd);
	}
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr1_ac_dt.addLCListener(this);		
		columnDtl1_itm_cd.addLCListener(this);
		columnDtl1_itm_sub1.addLCListener(this);
		columnDtl1_itm_sub2.addLCListener(this);
		columnDtl1_itm_sub3.addLCListener(this);
		columnDtl2_itm_sub3.addLCListener(this);
		columnDtl1_str_ln_cd.addLCListener(this);
		columnDtl1_sno1.addLCListener(this);
		columnDtl1_sno2.addLCListener(this);
		columnDtl1_sno3.addLCListener(this);
		columnDtl1_sno4.addLCListener(this);
		columnDtl1_lot_no.addLCListener(this);
		columnDtl1_sublot_no.addLCListener(this);
		columnDtl1_ver_no.addLCListener(this);
		columnDtl1_trd_unit_qty.addNCListener(this);
		columnDtl1_trd_unit_qty.addLCListener(this);
		columnDtl1_purc_cont_qty.addLCListener(this);
		columnDtl2_purc_cont_qty.addLCListener(this);
		columnDtl1_str_ln_cd_none_flg.addNCListener(this);
		columnDtl1_crt_lot_flg.addNCListener(this);
		columnDtl1_trd_unit_re_arr_qty.addNCListener(this);
		columnDtl1_re_arr_rqst_dt.addNCListener(this);
		columnDtl1_ptax_cur_tax_amt.addLCListener(this);
		columnDtl1_base_cur_tax_amt.addLCListener(this);
		columnDtl1_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl2_trd_unit_qty.addNCListener(this);
		columnDtl1_trd_cur_upri.addLCListener(this);
		columnDtl1_trd_cur_tax_amt.addLCListener(this);
		columnDtl1_trd_cur_proc_upri.addLCListener(this);
		columnDtl1_trd_cur_proc_amt.addLCListener(this);
		columnDtl1_trd_cur_onr_prov_upri.addLCListener(this);
		columnDtl1_trd_cur_onr_prov_amt.addLCListener(this);
		columnDtl1_tax_cd.addLCListener(this);
		columnDtl1_trd_cur_amt.addLCListener(this);
		columnDtl1_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl1_trd_unit_cd.removeLCListener(this);
		columnDtl1_trd_unit_cd.addLCListener(this);
		columnDtl2_lot_no.addLCListener(this);
		columnDtl2_sublot_no.addLCListener(this);
		Hdr1_purc_dpt_cd.addLCListener(this);
		getDtl1L().addListListener(createListListener(createDtlRowListener()));
	}
	
	protected MCRowStatusListener createDtlRowListener() {
		return new Dtl1RowListener();
	}

	public class Dtl1RowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent mcrowstatusevent) {
			if (mcrowstatusevent.getNewStatus() == MCRow.CREATE) {
				Dtl1R r = (Dtl1R)mcrowstatusevent.getSourceRow();
				setDefaultApDptCd(r);
			}
		}
	}
	
	/**
	 * 明細行の選択行変更イベント
	 */
	@Override
	public void doDtl1_NC(MCEventInfo info) {
		super.doDtl1_NC(info);
		
		int idx = info.getEventIndex();
		if (idx >= 0) {
			Dtl1R row = getDtl1L().get(idx);
			showIo(row);
		}
		// 検索結果を取得した時点でソートされているため、ソートは不要
		Dtl2Table.adjustWidth();
		
		// ボタン・モード制御
		setBtnMode();

	}

	/**
	 * 詳細行の選択イベント
	 */
	@Override
	public void doDtl2_NC(MCEventInfo info) {
		super.doDtl2_NC(info);
		
		// ボタン・モード制御
		setBtnMode();
	}
	
	@Override
	public void doDtl1_dlv_loc_cd_LC(MCEventInfo info) {
		super.doDtl1_dlv_loc_cd_LC(info);
		int idx = info.getEventIndex();
		Dtl1R dr = getDtl1L().get(idx);
		setDrctDlvTyp(dr);
	
	}/**
	 * 直納区分を設定します
	 * @param dr
	 */
	protected void setDrctDlvTyp(Dtl1R dr) {
		if (isNullAnd(dr.dlv_loc_cd(), dr.scst_cd())) {
			setValueEx(columnDtl1_drct_dlv_typ, dr.getGUIIndex(), null);
		}
		else if (isNullAnd(dr.dlv_loc_sppl_cd(), dr.scst_cd())) {
			setValueEx(columnDtl1_drct_dlv_typ, dr.getGUIIndex(), MSC_DRCT_DLV_TYP.VIA.value());
		} 
		else {
			setValueEx(columnDtl1_drct_dlv_typ, dr.getGUIIndex(), MSC_DRCT_DLV_TYP.DDLV.value());
		}
		
	}

	protected void doDtl1_itm_LC(MCEventInfo info){
		
		int idx = info.getEventIndex();
		Dtl1R dtlRow = getDtl1L().get(idx);

		// 計画外の値引品目、または非在庫品の場合にデフォルト格付ＣＤを設定する
		if (isNull(dtlRow.po_d_no()) && (dtlRow.dscnt_itm_flg() || MAC_STK_MNG_TYP.isNOT_MNG(dtlRow.stk_mng_typ()))) {
			setValueEx(columnDtl1_gd_cd, idx, getDefaultFeedStkGd().gd_cd());
		}
		
		if (isNull(info.getNewValue())) {
			// 購買識別区分
			setValueEx(columnDtl1_purc_id_typ, idx, null);
			
			if (havIoRows(dtlRow)) {
				MCList<Dtl2R> tgtIoList = _dtl2L.get(dtlRow.peg_no());
				for (Dtl2R tgtIoRow : tgtIoList) {
					setValueEx(columnDtl2_itm_cd, tgtIoRow.getGUIIndex(), null);
				}
				_dtl2L.put(dtlRow.peg_no(), tgtIoList);
			}
		}
		else {
			// 紐付NOセット
			if (isNull(dtlRow.peg_no())) {
				setDtlPegNo(dtlRow);
			}
			
			// 購買識別区分
			setValueEx(columnDtl1_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value());
			
			
			// 支払繰越回数
			if (!isNull(dtlRow.itm_pay_crryovr_times())) {
				setValueEx(columnDtl1_pay_crryovr_times, idx, dtlRow.itm_pay_crryovr_times());
			}
			else if (!isNull(getHdr1R().pay_crryovr_times())) {
				setValueEx(columnDtl1_pay_crryovr_times, idx, getHdr1R().pay_crryovr_times());
			}
			else {
				setValueEx(columnDtl1_pay_crryovr_times, idx, null);
			}
			
			// 購買単価変更許可ＦＬＧ
			if (!dtlRow.purc_upri_cng_flg() && getHdr1R().purc_upri_cng_flg()) {
				dtlRow.purc_upri_cng_flg(true);
			}
			
			if (!havIoRows(dtlRow)) {
				insIoRowInExPo(dtlRow);
			}
			else {
				// 明細の品目を詳細全行にコピー
				MCList<Dtl2R> tgtIoList = _dtl2L.get(dtlRow.peg_no());
				copyValFrDtlRowToIoList(dtlRow, tgtIoList);
				_dtl2L.put(dtlRow.peg_no(), tgtIoList);
			}
		}
		setColByDscntItm(dtlRow);
		setDefaultTaxCd(dtlRow, true);
		setIvItmNm(dtlRow);
		setSpplItm(dtlRow);
		setWtaxRate(dtlRow);
		setLotCrtFlg(dtlRow);
		setSyncFlg(dtlRow);
		setDefStrLnCd(dtlRow);
	}

	protected void doDtl2_itm_LC(MCEventInfo info){
		Dtl1R dr = Dtl1Table.getSelectedMCRow();
		int idx = info.getEventIndex();
		Dtl2R ir = getDtl2L().get(idx);
		if (isNull(dr.po_d_no()) && dr.dscnt_itm_flg()) {
			setValueEx(columnDtl2_gd_cd, idx, getDefaultFeedStkGd().gd_cd());
			
		}
		setColByDscntItm(ir, dr);
		
	}
	
	/**
	 * 品目の変更、またはクリアによる、明細行の初期化を行います。
	 * @param info イベント情報
	 */
	protected void initDtlAtItmCngOrClr(MCEventInfo info) {
		int idx = info.getEventIndex();
		
		// 明細行の値を初期化する
		setValueEx(columnDtl1_sync_flg, idx, false);
		setValueEx(columnDtl1_accpt_dfct_flg, idx, false);
		setValueEx(columnDtl1_gd_cd, idx, null);
		setValueEx(columnDtl1_crt_lot_flg, idx, false);
		setValueEx(columnDtl1_bp_lot_no, idx, null);
		setValueEx(columnDtl1_bp_dlv_slip_no, idx, null);
		setValueEx(columnDtl1_bp_dlv_slip_d_no, idx, null);
		setValueEx(columnDtl1_ship_fr_valid_dt, idx, null);
		setValueEx(columnDtl1_upri_not_tgt_flg, idx, false);
		setValueEx(columnDtl1_tax_cd, idx, null);
		setValueEx(columnDtl1_sppl_itm_cd, idx, null);
		setValueEx(columnDtl1_sppl_itm_nm, idx, null);
		setValueEx(columnDtl1_purc_id_typ, idx, null);
		setValueEx(columnDtl1_purc_rsn_cd, idx, null);
		setValueEx(columnDtl1_pay_crryovr_times, idx, null);
		
	}
	
	/**
	 * 詳細行の品目をクリアします。
	 * @param info イベント情報
	 */
	protected void clearDtl2_Itm(MCEventInfo info) {
		Dtl1R dtlRow = getDtl1L().get(info.getEventIndex());
		if (!havIoRows(dtlRow)) {
			return;
		}
		MCList<Dtl2R> tgtIoL = _dtl2L.get(dtlRow.peg_no());
		for (Dtl2R ioRow : tgtIoL) {
			int idxIo = ioRow.getGUIIndex();
			ioRow.clear(Dtl2R.$itm_cd, Dtl2R.$itm_sub1, Dtl2R.$itm_sub2);
			setValueEx(columnDtl2_itm_sub3, idxIo, null);
		}
		
	}
	
	@Override
	public void doDtl1_re_arr_purc_schd_dt_NC(MCEventInfo info) {
		super.doDtl1_re_arr_purc_schd_dt_NC(info);
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		
		// 仕入直送、または仕入計上区分が入荷基準の場合、再入荷希望日＝再入荷仕入予定日とする
		if (dtlRow.purc_ddlv_flg() || MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			dtlRow.re_arr_rqst_dt(dtlRow.re_arr_purc_schd_dt());
		}
		setReArrSyncFlg(info);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (Dtl1_itm_p_PPanel.isItm(lc)) {
			// 品目ＣＤ・枝番１～３変更時
			if (Dtl1_itm_p_PPanel.isItmFix(info.getEventIndex())) {
				doDtl1_itm_LC(info);
			}
			else {
				// 品目情報をクリアした場合、関連する値を初期化する
				initDtlAtItmCngOrClr(info);
				// 詳細の品目情報をクリアする
				clearDtl2_Itm(info);
			}
		}
		if (Dtl2_itm_p_PPanel.isItm(lc) && Dtl2_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			doDtl2_itm_LC(info);
		}
		if (lc == columnDtl1_ptax_cur_tax_amt) {
			doDtl1_ptax_cur_tax_amt_LC(info);
		}
		if (lc == columnDtl1_base_cur_tax_amt) {
			doDtl1_base_cur_tax_amt_LC(info);
		}
		if (lc == columnDtl1_trd_cur_amt) {
			doDtl1_trd_cur_amt_LC(info);
		}
		if (lc == columnDtl1_trd_cur_inc_tax_amt) {
			doDtl1_trd_cur_inc_tax_amt_LC(info);
		}
		if (lc == columnDtl1_lot_no
				|| lc == columnDtl1_sublot_no) {
			doDtl1_lot_no(info);
		}
		if (lc == columnDtl2_lot_no
				|| lc == columnDtl2_sublot_no) {
			doDtl2_lot_no(info);
		}
		// 上段の場所、単位、数量、ロット等の変更時
		if (lc == columnDtl1_trd_unit_cd 
				|| lc == columnDtl1_trd_unit_qty
				|| lc == columnDtl1_quality_typ
				|| lc == columnDtl1_gd_cd
				|| lc == columnDtl1_dlv_loc_cd
				|| lc == columnDtl1_str_ln_cd
				|| lc == columnDtl1_lot_no
				|| lc == columnDtl1_sublot_no
				|| lc == columnDtl1_ver_no
				|| lc == columnDtl1_bp_lot_no
				|| lc == columnDtl1_bp_dlv_slip_no
				|| lc == columnDtl1_bp_dlv_slip_d_no
				|| lc == columnDtl1_ship_fr_valid_dt
				|| lc == columnDtl1_purc_cont_qty) {
			copyColValFromDtl1ToDtl2(lc, info);
		}
		if (lc == columnDtl1_trd_unit_qty) {
			doDtl1_trd_unit_qty_LC(info);
		}
		if (lc == columnDtl1_trd_cur_dscnt_amt) {
			doDtl1_trd_cur_dscnt_amt_LC(info);
		}
		if (lc == columnDtl1_trd_cur_upri) {
			doDtl1_trd_cur_upri_LC(info);
		}
		if (lc == columnDtl1_trd_cur_tax_amt) {
			doDtl1_trd_cur_tax_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_proc_upri) {
			doDtl1_trd_cur_proc_upri_LC(info);
		}
		if(lc == columnDtl1_trd_cur_proc_amt) {
			doDtl1_trd_cur_proc_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_onr_prov_upri) {
			doDtl1_trd_cur_onr_prov_upri_LC(info);
		}
		if(lc == columnDtl1_trd_cur_onr_prov_amt) {
			doDtl1_trd_cur_onr_prov_amt_LC(info);
		}
		if (lc == columnDtl1_tax_cd) {
			doDtl1_tax_cd_LC(info);
		}
		if (lc == Hdr1_purc_dpt_cd) {
			doHdr_purc_dpt_cd_LC(info);
		}
	}

	public void doHdr_purc_dpt_cd_LC(MCEventInfo info) {
		String apDptCd = getHdr1R().ap_dpt_cd();
		 setApDptCd();
		if (!isSame(apDptCd, getHdr1R().ap_dpt_cd())) {
			for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
				setDefaultApDptCd(r);
			}
		}
	}
	
	public void doDtl1_lot_no(MCEventInfo info) {
		Dtl1R r = getDtl1L().get(info.getEventIndex());
		if (r.ver_flg()) {
			if (!r.crt_lot_flg()) {
				setValueEx(columnDtl1_ver_no, r.getGUIIndex(), r.org_ver_no());
			}
		}
	}
	
	public void doDtl2_lot_no(MCEventInfo info) {
		Dtl2R r = getDtl2L().get(info.getEventIndex());
		if (r.ver_flg()) {
			if (!r.crt_lot_flg()) {
				setValueEx(columnDtl2_ver_no, r.getGUIIndex(), r.org_ver_no());
			}
		}
	}
	
	@Override
	public MCList getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row,
			MCEventInfo info) {
		return getDtl1VerNoList(row, info);
	}
	
	protected MCList getDtl1VerNoList(MCRow row, MCEventInfo info) {
		Dtl1R r = getDtl1L().get(info.getEventIndex());
		if (r.crt_lot_flg()) {
			// ロット作成時は工場・物流倉庫で絞り込む
			row.addStringColumn(ItmVerCols.$i_site_cd, r.site_cd());
		}
		return super.getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
	}
	
	@Override
	public MCList getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row,
			MCEventInfo info) {
		return getDtl2VerNoList(row, info);
	}
	
	protected MCList getDtl2VerNoList(MCRow row, MCEventInfo info) {
		Dtl2R r = getDtl2L().get(info.getEventIndex());
		if (r.crt_lot_flg()) {
			// ロット作成時は工場・物流倉庫で絞り込む
			row.addStringColumn(ItmVerCols.$i_site_cd, r.site_cd());
		}
		return super.getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
	}
	
	public void doDtl1_trd_cur_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		Hdr1R hdrR = getHdr1R();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_upri(dtlR.trd_cur_upri());
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(hdrR, dtlR);
			setPtaxCurAmt(hdrR, dtlR);
		}
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(hdrR, dtlR);
		}
		clearDscntAmt(dtlR);
	}

	protected void clearDscntAmt(Dtl1R dtlR) {
		if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
			columnDtl1_trd_cur_dscnt_amt.setValue(dtlR.getGUIIndex(), null);
		}
	}
	
	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param dtlR
	 */
	protected void setRepurcObliTax(Dtl1R dtlR) {
		Hdr1R hdr = getHdr1R();
		if(isNull(hdr.trd_cur_cd()) || (isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri()))) {
			return;
		}
		MCNumber amt = null;
		if (Dtl1Table.getEditingColumnConfig() == columnDtl1_trd_cur_proc_amt
				|| Dtl1Table.getEditingColumnConfig() == columnDtl1_trd_cur_onr_prov_amt) {
			amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		}
		else {
			// 金額 = (単価:加工単価 + 有償支給単価)×数量
			amt = getAmt(dtlR.trd_cur_upri(),
					dtlR.trd_unit_qty(),
					hdr.trd_cur_amt_dec_place(),
					hdr.purc_amt_rnd_typ(),
					dtlR.trd_cur_dscnt_amt()
					);
			if(dtlR.inc_tax_flg()) {
				// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
				MCNumber proc_inc_tax_amt = getAmt(dtlR.trd_cur_proc_upri(),
						dtlR.trd_unit_qty(),
						hdr.trd_cur_amt_dec_place(),
						hdr.purc_amt_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
				dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
				// 有償支給金額は金額-加工金額
				dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
			}else {
				dtlR.trd_cur_amt(amt);
				// 外税の場合は金額を案分
				setOutsrcAmt(hdr, dtlR);
			}
		}
		// 加工金額を元に税額を取得(有償支給金額は税額に含めない)
		// 値引額は共通処理で考慮済なので計算に含めない
		MCNumber tax_amt = getTaxAmt(
				dtlR.trd_cur_proc_amt(),
				dtlR.tax_rate(),
				hdr.trd_cur_amt_dec_place(),
				hdr.purc_tax_rnd_typ(),
				dtlR.inc_tax_flg()
				);
		if(dtlR.inc_tax_flg()) {
			amt = (amt != null) ? amt.subtract(tax_amt) : null;
			MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(tax_amt) : null;
			dtlR.trd_cur_proc_amt(proc_amt);
		}
		MCNumber inc_tax_amt = (amt != null) ? amt.add(tax_amt) : null;
		
		dtlR.trd_cur_amt(amt);
		dtlR.trd_cur_tax_amt(tax_amt);
		dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(hdr, dtlR);
		setPtaxCurAmt(hdr, dtlR);
	}
	/**
	 * 金額を案分して加工金額・有償支給金額を導出します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setOutsrcAmt(Hdr1R hdrR, Dtl1R dtlR) {
		if(!dtlR.outsrc_flg()) {
			return;
		}
		MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
				dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
		dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
		dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
		setBaseCurAmt(hdrR, dtlR);
		setPtaxCurAmt(hdrR, dtlR);
	}
	/**
	 * 基準通貨項目に取引通貨項目を元に値を設定します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setBaseCurAmt(Hdr1R hdrR, Dtl1R dtlR) {
		dtlR.base_cur_onr_prov_upri(convToBaseCur(dtlR.trd_cur_onr_prov_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_upri(convToBaseCur(dtlR.trd_cur_proc_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	/**
	 * 納税通貨項目に取引通貨項目を元に値を設定します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setPtaxCurAmt(Hdr1R hdrR, Dtl1R dtlR) {
		dtlR.ptax_cur_onr_prov_upri(convCur(dtlR.trd_cur_onr_prov_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_upri(convCur(dtlR.trd_cur_proc_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}

	protected void doDtl1_ptax_cur_tax_amt_LC(MCEventInfo info) {

		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_ptax_cur_tax_amt) {
			return;
		}
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		Hdr1R hdrR = getHdr1R();
		
		if (isNull(dtlR.ptax_cur_amt())
				|| isNull(dtlR.ptax_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.ptax_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(基準通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を基準通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.ptax_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.ptax_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
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
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.ptax_cur_amt().add(taxAmt);
			dtlR.ptax_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxPtaxXRate(dtlR, taxAmt, dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_inc_tax_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
		setDispAmt();
	}

	protected void doDtl1_base_cur_tax_amt_LC(MCEventInfo info) {

		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_base_cur_tax_amt) {
			return;
		}
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		Hdr1R hdrR = getHdr1R();
		
		if (isNull(dtlR.base_cur_amt())
				|| isNull(isNull(dtlR.base_cur_inc_tax_amt()))) {
			return;
		}
		
		MCNumber taxAmt = dtlR.base_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(基準通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を基準通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.base_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.base_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
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
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber repurcIncTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(repurcIncTaxAmt) ? repurcIncTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.base_cur_amt().add(taxAmt);
			dtlR.base_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				MCRow row = getAmtAndTaxXRate(dtlR, taxAmt, dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_inc_tax_amt(row.getNumber("amt"));
				dtlR.trd_cur_tax_amt(row.getNumber("taxAmt"));
			}
		}
		
		setDispAmt();
	}
	protected MCRow getAmtAndTaxXRate(Dtl1R dtlR, MCNumber baseTaxAmt, MCNumber baseAmt) {
		return 
			getAmtAndTaxCmn(
				"xrate",
				baseTaxAmt,
				baseAmt,
				getHdr1R().base_cur_amt_dec_place(),
				dtlR);
	}
	protected MCRow getAmtAndTaxPtaxXRate(Dtl1R dtlR, MCNumber baseTaxAmt, MCNumber baseAmt) {
		return
			getAmtAndTaxCmn(
				"ptax_xrate",
				baseTaxAmt,
				baseAmt,
				getHdr1R().ptax_cur_amt_dec_place(),
				dtlR);
	}
	protected MCRow getAmtAndTaxCmn(String xrateCol, MCNumber baseTaxAmt, MCNumber baseAmt, MCNumber baseAmtDecPlace, Dtl1R dtlR) {

		int hdr_peg_no = 1;
		ConvQtyAmtUtil_HdrR utlHdrR = createUtilHdr(getHdr1R(), dtlR, hdr_peg_no).get(0);

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
			
			trdAmt = baseAmt.divide(actXRate, getHdr1R().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())); 
			trdTaxAmt = baseTaxAmt.divide(actXRate, getHdr1R().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ()));
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
	
	protected void doDtl1_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dtlRow = getDtl1L().get(idx);
		if (!hasCost(dtlRow)) {
			// 金額表示対象でない場合、値引額は常にnullにする
			setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, null);
		}
		else {
			if(dtlRow.outsrc_flg()) {
				if(dtlRow.repurc_obli_flg()) {
					setRepurcObliTax(dtlRow);
				}
				else {
					setOutsrcAmt(getHdr1R(), dtlRow);
				}
			}
		}
	}
	
	/**
	 * 税額変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_tax_amt_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if (Dtl1Table.getEditingColumnConfig() == columnDtl1_trd_cur_tax_amt) {
			// 埋め込み画面側のイベント処理で、税額から先に値がセットされ、値引額側がエラーにならないので、税額にイベントを実装
			chkProcAmtMinus(dtlR);
			// 埋め込み画面側のイベントで、数量の変更後に税額が上書きされてしまうので、税額のイベントで値を変えるようにする。
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(getHdr1R(), dtlR);
			}
		}
		setDispAmt();
	}
	
	/**
	 * 税CD変更イベント
	 * @param info
	 */
	public void doDtl1_tax_cd_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		setValueForMoneyCols(getHdr1R(), dtlR);
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(getHdr1R(), dtlR);
		}
	}
	
	/**
	 * 取引通貨金額変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_amt_LC(MCEventInfo info) {
		setDispAmt();
		Hdr1R hdrR = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(hdrR, dtlR);
			setPtaxCurAmt(hdrR, dtlR);
		}
	}
	
	/**
	 * 取引通貨税込金額変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setDispAmt();
	}
	
	/**
	 * 取引通貨加工単価変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_proc_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		// 加工単価がnullの場合は値引額をクリアする
		if(isNull(dtlR.trd_cur_proc_upri())) {
			dtlR.trd_cur_dscnt_amt(null);
			setValueEx(columnDtl1_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
		}
		chkProcAmtMinus(dtlR);
		MCNumber onr_prov_upri = dtlR.trd_cur_onr_prov_upri();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			onr_prov_upri = null;
		}
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), onr_prov_upri);
		setValueEx(columnDtl1_trd_cur_upri, info.getEventIndex(), upri);
	}
	
	/**
	 * 取引通貨加工金額変更イベント
	 * @param info
	 */
	protected void doDtl1_trd_cur_proc_amt_LC(MCEventInfo info) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_proc_amt) {
			return;
		}
		Hdr1R hdrR = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if(isNull(dtlR.trd_cur_proc_amt())) {
			dtlR.trd_cur_dscnt_amt(null);
			setValueEx(columnDtl1_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
		}
		if (isNull(dtlR.trd_cur_proc_upri())
				|| (!isNull(dtlR.trd_cur_proc_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl1_trd_cur_proc_upri))) {
			MCNumber trdCurProcAmt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().add(nvl(dtlR.trd_cur_dscnt_amt(), MCNumber.ZERO)) : null;
			MCNumber trdCurProcUpri = getUpri(trdCurProcAmt, dtlR.trd_unit_qty(), hdrR.trd_cur_upri_dec_place());
			dtlR.trd_cur_proc_upri(trdCurProcUpri);
			setOutsrcUpriAndAmt(hdrR, dtlR);
		}
	}
	
	/**
	 * 取引通貨有償支給単価変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_onr_prov_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri());
		setValueEx(columnDtl1_trd_cur_upri, info.getEventIndex(), upri);
	}
	
	/**
	 * 取引通貨有償支給金額変更イベント
	 * @param info
	 */
	protected void doDtl1_trd_cur_onr_prov_amt_LC(MCEventInfo info) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_onr_prov_amt) {
			return;
		}
		Hdr1R hdrR = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if (isNull(dtlR.trd_cur_onr_prov_upri())
				|| (!isNull(dtlR.trd_cur_onr_prov_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl1_trd_cur_onr_prov_upri))) {
			MCNumber trdCurOnrProvUpri = MAUCP_AmtUtil.getUpri(dtlR.trd_cur_onr_prov_amt(), dtlR.trd_unit_qty(), hdrR.trd_cur_upri_dec_place());
			dtlR.trd_cur_onr_prov_upri(trdCurOnrProvUpri);
			setOutsrcUpriAndAmt(hdrR, dtlR);
		}
	}
	protected void setOutsrcUpriAndAmt(Hdr1R hdrR, Dtl1R dtlR) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_proc_amt
				&& Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_onr_prov_amt) {
			return;
		}
		
		dtlR.trd_cur_upri(getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri()));
		
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmtAndTax(hdrR, dtlR);
		}
		clearDscntAmt(dtlR);
	}
	protected void setOutsrcAmtAndTax(Hdr1R hdrR, Dtl1R dtlR) {
		MCNumber amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(amt, dtlR.tax_rate(), hdrR.trd_cur_amt_dec_place(), hdrR.purc_tax_rnd_typ(), dtlR.inc_tax_flg());
		if(dtlR.inc_tax_flg()) {
			amt = !isNull(amt) ? amt.subtract(tax_amt) : null;
		}
		MCNumber inc_tax_amt = !isNull(amt) ? amt.add(tax_amt) : null;
		dtlR.trd_cur_amt(amt);
		dtlR.trd_cur_tax_amt(tax_amt);
		dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(hdrR, dtlR);
		setPtaxCurAmt(hdrR, dtlR);
	}
	protected MCNumber getOutsrcAmt(MCNumber trdCurProcAmt, MCNumber trdCurOnrProvAmt) {
		if(isNull(trdCurProcAmt) && isNull(trdCurOnrProvAmt)) {
			return null;
		}
		return nvl(trdCurProcAmt, MCNumber.ZERO).add(nvl(trdCurOnrProvAmt, MCNumber.ZERO));
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
	
	/**
	 * 値引額の値により、加工金額がマイナスとならないようにチェックする。
	 * 加工金額を計算して設定することで、マイナス値を設定した際にエラーを発生させる。
	 * 
	 * @param dtlR
	 */
	protected void chkProcAmtMinus(Dtl1R dtlR) {
		if(!dtlR.outsrc_flg() || isNull(dtlR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = getAmt(dtlR.trd_cur_proc_upri(),
				dtlR.trd_unit_qty(),
				getHdr1R().trd_cur_amt_dec_place(),
				getHdr1R().purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		if(!isNull(procAmt) && procAmt.isNegative()) {
			setValueEx(columnDtl1_trd_cur_proc_amt, dtlR.getGUIIndex(), procAmt);
		}
	}
	
	/**
	 * 明細行から詳細行に特定のカラムの値をコピーする
	 */
	protected void copyColValFromDtl1ToDtl2(MCBeans beans, MCEventInfo info) {
		// 明細反映ボタン押下時は何もしない
		if (_updDtlBtnExecFlg) {
			return;
		}

		// イベント明細行を取得
		Dtl1R dtlRow = getDtl1L().get(info.getEventIndex());

		// 紐付NOセット
		if (isNull(dtlRow.peg_no())) {
			setDtlPegNo(dtlRow);
		}
		
		// 紐付く詳細行がない場合、新たに詳細行を1行追加する。
		// 紐付く詳細行が1行のみ存在する場合は、明細行に入力された値と同じ値を詳細行の対応するカラムに設定する。
		if (!havIoRows(dtlRow) && !isNull(info.getNewValue())) {
			insIoRowInExPo(dtlRow);
		}
		else if (havOnlyOneIoRows(dtlRow)) {
			
			MCList<Dtl2R> tgtIoList = _dtl2L.get(dtlRow.peg_no());
			Dtl2R tgtIoRow = tgtIoList.get(0);
			
			// 明細の品目情報を詳細に反映してからイベントを起こす
			tgtIoRow.itm_cd(dtlRow.itm_cd());
			tgtIoRow.itm_sub1(dtlRow.itm_sub1());
			tgtIoRow.itm_sub2(dtlRow.itm_sub2());
			setValueEx(columnDtl2_itm_sub3, tgtIoRow.getGUIIndex(), dtlRow.itm_sub3());
			
			if (beans == columnDtl1_trd_unit_cd) {
				if (isCopyTrdUnitCdFromDtl1ToDtl2(info, tgtIoRow, dtlRow)) {
					setValueEx(columnDtl2_trd_unit_cd, tgtIoRow.getGUIIndex(), dtlRow.trd_unit_cd());
				}
			}
			if (beans == columnDtl1_trd_unit_qty) {
				// 取引単位数量を変更した場合は、詳細行に取引単位をコピー後に、数量を設定する
				if (isCopyTrdUnitQtyFromDtl1ToDtl2(info, tgtIoRow, dtlRow)) {
					setValueEx(columnDtl2_trd_unit_cd, tgtIoRow.getGUIIndex(), dtlRow.trd_unit_cd());
					setValueEx(columnDtl2_trd_unit_qty, tgtIoRow.getGUIIndex(), dtlRow.trd_unit_qty());
				}
			}
			if (beans == columnDtl1_quality_typ) {
				setValueEx(columnDtl2_quality_typ, tgtIoRow.getGUIIndex(), dtlRow.quality_typ());
			}
			if (beans == columnDtl1_gd_cd) {
				setValueEx(columnDtl2_gd_cd, tgtIoRow.getGUIIndex(), dtlRow.gd_cd());
			}
			if (beans == columnDtl1_dlv_loc_cd) {
				setValueEx(columnDtl2_dlv_loc_cd, tgtIoRow.getGUIIndex(), dtlRow.dlv_loc_cd());
			}
			if (beans == columnDtl1_str_ln_cd) {
				if (isSame(tgtIoRow.dlv_loc_cd(), dtlRow.dlv_loc_cd())) {
					setValueEx(columnDtl2_str_ln_cd, tgtIoRow.getGUIIndex(), dtlRow.str_ln_cd());
				}
			}
			if (beans == columnDtl1_str_ln_cd_none_flg) {
				if (isSame(tgtIoRow.dlv_loc_cd(), dtlRow.dlv_loc_cd())) {
					setValueEx(columnDtl2_str_ln_cd_none_flg, tgtIoRow.getGUIIndex(), dtlRow.str_ln_cd_none_flg());
				}
			}
			if (beans == columnDtl1_crt_lot_flg) {
				setValueEx(columnDtl2_crt_lot_flg, tgtIoRow.getGUIIndex(), dtlRow.crt_lot_flg());
			}
			if (beans == columnDtl1_lot_no) {
				if (isNull(dtlRow.sublot_no())) {
					setValueEx(columnDtl2_crt_lot_flg, tgtIoRow.getGUIIndex(), dtlRow.crt_lot_flg());
					setValueEx(columnDtl2_lot_no, tgtIoRow.getGUIIndex(), dtlRow.lot_no());
				}
			}
			if (beans == columnDtl1_sublot_no) {
				setValueEx(columnDtl2_crt_lot_flg, tgtIoRow.getGUIIndex(), dtlRow.crt_lot_flg());
				setValueEx(columnDtl2_lot_no, tgtIoRow.getGUIIndex(), dtlRow.lot_no());
				setValueEx(columnDtl2_sublot_no, tgtIoRow.getGUIIndex(), dtlRow.sublot_no());
			}
			if (beans == columnDtl1_ver_no) {
				setValueEx(columnDtl2_ver_no, tgtIoRow.getGUIIndex(), dtlRow.ver_no());
			}
			if (beans == columnDtl1_bp_lot_no) {
				setValueEx(columnDtl2_bp_lot_no, tgtIoRow.getGUIIndex(), dtlRow.bp_lot_no());
			}
			if (beans == columnDtl1_bp_dlv_slip_no) {
				setValueEx(columnDtl2_bp_dlv_slip_no, tgtIoRow.getGUIIndex(), dtlRow.bp_dlv_slip_no());
			}
			if (beans == columnDtl1_bp_dlv_slip_d_no) {
				setValueEx(columnDtl2_bp_dlv_slip_d_no, tgtIoRow.getGUIIndex(), dtlRow.bp_dlv_slip_d_no());
			}
			if (beans == columnDtl1_ship_fr_valid_dt) {
				setValueEx(columnDtl2_ship_fr_valid_dt, tgtIoRow.getGUIIndex(), dtlRow.ship_fr_valid_dt());
			}
			if (beans == columnDtl1_purc_cont_qty) {
				setValueEx(columnDtl2_purc_cont_qty, tgtIoRow.getGUIIndex(), dtlRow.purc_cont_qty());
			}
		}
	}
	
	protected boolean isCopyTrdUnitCdFromDtl1ToDtl2(MCEventInfo info, Dtl2R tgtIoRow, Dtl1R dtlRow) {
		return true;
	}
	
	protected boolean isCopyTrdUnitQtyFromDtl1ToDtl2(MCEventInfo info, Dtl2R tgtIoRow, Dtl1R dtlRow) {
		return !isNull(info.getNewValue());
	}
	
	@Override
	public void doHdr1_sppl_cd_LC(MCEventInfo info) {

		super.doHdr1_sppl_cd_LC(info);
		
		MCMessageList msgL = new MCMessageList();
		
		// 下請対象チェック
		msgL.addAll(checkSubCon());
		
		// インボイス取引対象チェック
		msgL.addAll(checkSpplIv());
		
		if (msgL.size() > 0) {
			message(msgL);
			setValueEx(Hdr1_sppl_cd, null);
		}
		else {
			setDefaultTaxCd(true);	
			for (Dtl1R dtlR : exceptDeleteAndEmpty(getDtl1L())) {
				if (dtlR.abort_flg()) {
					continue;
				}
				setDefaultApDptCd(dtlR);
				setSpplItm(dtlR);
			}
		}
		String purcDptCd = getHdr1R().purc_dpt_cd();
		setValueEx(Hdr1_purc_usr_cd, null);
		setValueEx(Hdr1_purc_dpt_cd, null);
		if (!isNull(getHdr1R().def_purc_usr_cd())) {
			setValueEx(Hdr1_purc_usr_cd, getHdr1R().def_purc_usr_cd());
		}
		else if (!isNull(getHdr1R().def_purc_dpt_cd())) {
			setValueEx(Hdr1_purc_dpt_cd, getHdr1R().def_purc_dpt_cd());
		}
		if (isNull(Hdr1_sppl_cd.getValue())) {
			// 発注先クリア時
			getHdr1R().ap_dpt_cd(null);
		}
		else {
			if (!isNull(getHdr1R().mst_ap_dpt_cd())) {
				// 変更後の発注先に対しマスタで債務部門が設定されていた場合
				getHdr1R().ap_dpt_cd(getHdr1R().mst_ap_dpt_cd());
			}
			else if (isNullAnd(purcDptCd, getHdr1R().purc_dpt_cd())) {
				// 購買部門の変更イベントが起きない場合はここでクリア
				getHdr1R().ap_dpt_cd(null);
			}
		}
		
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			setDefaultApDptCd(r);
		}
		
		setDispAmt();
	
	}
	/**
	 * 計画外で下請対象の発注先を選択した場合
	 * @param hdr1R
	 * @return
	 */
	protected MCMessageList checkSubCon() {
		MCMessageList msgL = new MCMessageList();
		if (isNull(getHdr1R().po_no()) && getHdr1R().subcon_flg()) {
			// 計画外で下請対象の発注先を選択した場合
			msgL.add(new MCMessage(MSBDP0030, getHdr1R().sppl_cd()));
		}
		return msgL;
	}
	
	protected MCMessageList checkSpplIv() {
		MCMessageList msgL = new MCMessageList();
		if (getHdr1R().sppl_iv_flg()) {
			// インボイス取引対象の発注先を選択した場合
			msgL.add(new MCMessage(MSBDP0031, getHdr1R().sppl_cd()));
		}
		return msgL;
	}
	
	@Override
	public void doHdr1_purc_dt_LC(MCEventInfo info) {
		super.doHdr1_purc_dt_LC(info);
		setValueEx(Hdr1_ac_dt, getHdr1R().purc_dt());
		setWtaxRate();
		setDefaultTaxCd(false);
		for (Dtl1R dtlR : exceptDeleteAndEmpty(getDtl1L())) {
			if (!dtlR.abort_flg() && isNull(dtlR.po_d_no())) {
				setSpplItm(dtlR);
			}
		}
	}

	@Override
	public void doHdr1_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr1_trd_cur_cd_LC(info);
		setWtaxRate();
	}
	@Override
	public void doDtl1_abort_flg_NC(MCEventInfo info) {
		Dtl1R r = getDtl1L().get(info.getEventIndex());
		setDispAmt();
		// 仕入予定単位にフラグ制御する
		getDtl1L().forEach(rr -> {
			if (rr != r && isSame(rr.purc_schd_no(), r.purc_schd_no())) {
				setValueEx(columnDtl1_abort_flg, rr.getGUIIndex(), r.abort_flg());
			}
		});
	}
	
	@Override
	public void doDtl1_ncv_flg_NC(MCEventInfo info) {
		super.doDtl1_ncv_flg_NC(info);
		int idx = info.getEventIndex();
		Dtl1R dtlRow = getDtl1L().get(idx);

		initUpriAmt(dtlRow);
		if (dtlRow.ncv_flg()) {
			setValueEx(columnDtl1_accpt_dfct_flg, idx, false);
		}
		setDispAmt();
	}
	
	
	@Override
	public void doDtl1_accpt_dfct_flg_NC(MCEventInfo info) {
		super.doDtl1_accpt_dfct_flg_NC(info);
		int idx = info.getEventIndex();
		Dtl1R dtlRow = getDtl1L().get(idx);

		initUpriAmt(dtlRow);
		
		if (dtlRow.accpt_dfct_flg()) {
			// 検収不良にしたら支払繰越回数はクリアする
			setValueEx(columnDtl1_pay_crryovr_times, idx, null);
			// 検収不良にしたら負担項目はクリア
			Dtl1_bd_p_PPanel.clearBdItem(idx);
		}
		else {
			// 検収不良解除時、再入荷も解除する
			setValueEx(columnDtl1_re_arr_flg, idx, false);
		}
		
		setDispAmt();
	}
	
	@Override
	public void doDtl1_re_arr_flg_NC(MCEventInfo info) {
		super.doDtl1_re_arr_flg_NC(info);
		int idx = info.getEventIndex();
		Dtl1R dtlRow = getDtl1L().get(idx);
		if (dtlRow.re_arr_flg()) {
			setValueEx(columnDtl1_trd_unit_re_arr_qty, idx, dtlRow.trd_unit_qty());
			setValueEx(columnDtl1_re_arr_loc_cd, idx, dtlRow.dlv_loc_cd());
			setValueEx(columnDtl1_re_arr_str_ln_cd_none_flg, idx, dtlRow.str_ln_cd_none_flg());
			if (!dtlRow.str_ln_cd_none_flg()) {
				setValueEx(columnDtl1_re_arr_str_ln_cd, idx, dtlRow.str_ln_cd());
			}
		}
		else {
			setValueEx(columnDtl1_trd_unit_re_arr_qty, idx, null);
			setValueEx(columnDtl1_re_arr_loc_cd, idx, null);
			setValueEx(columnDtl1_re_arr_str_ln_cd, idx, null);
			setValueEx(columnDtl1_re_arr_str_ln_cd_none_flg, idx, false);
			setValueEx(columnDtl1_re_arr_rqst_dt, idx, null);
			setValueEx(columnDtl1_re_arr_purc_schd_dt, idx, null);
			setValueEx(columnDtl1_re_arr_sync_flg, idx, false);
		}
	}

	protected void initUpriAmt(Dtl1R dtlRow) {
		int idx = dtlRow.getGUIIndex();
		
		if (hasCost(dtlRow)) {
			setValueForMoneyCols(getHdr1R(), dtlRow);
		}
		else {
			// 単価再取得対象外
			if (isNull(dtlRow.purc_schd_no())) {
				setValueEx(columnDtl1_upri_not_tgt_flg, idx, true);
			}
			// 金額情報に0をセット
			setValueEx(columnDtl1_trd_cur_upri, idx, MCNumber.ZERO);
			setValueEx(columnDtl1_interim_flg, idx, false);
			if (!isNull(dtlRow.trd_cur_proc_upri())) {
				setValueEx(columnDtl1_trd_cur_proc_upri, idx, MCNumber.ZERO);	
			}
			if (!isNull(dtlRow.trd_cur_onr_prov_upri())) {
				setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, MCNumber.ZERO);
			}
			if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
				setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, null);	
			}
			// 債務部門クリア
			setValueEx(columnDtl1_ap_dpt_cd, idx, null);
		}
	}

	/**
	 * 良品区分初期値を設定します。（行指定）
	 * @param dtlR 
	 */
	protected void setDefaultQualityTyp(Dtl1R dtlR) {
		setValueEx(columnDtl1_quality_typ, dtlR.getGUIIndex(), MAC_QUALITY_TYP.GOOD.value());
	}
	/**
	 * 良品区分初期値を設定します。（行指定）
	 * @param ioR 
	 */
	protected void setDefaultQualityTyp(Dtl2R ioR) {
		setValueEx(columnDtl2_quality_typ, ioR.getGUIIndex(), MAC_QUALITY_TYP.GOOD.value());		
	}
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(Dtl1R dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl1_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl1_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}
	protected void setColByDscntItm(Dtl2R dtl2R, Dtl1R dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl2_trd_unit_cd, dtl2R.getGUIIndex(), dtl2R.base_unit_cd());
			setValueEx(columnDtl2_trd_unit_qty, dtl2R.getGUIIndex(), MCNumber.ONE);
		}
	}
	/**
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 * @param setTaxFixFlg
	 */
	protected void setDefaultTaxCd(Dtl1R dtlR, boolean setTaxFixFlg) {

		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				Hdr1_sppl_cd.getValue(), 
				Hdr1_purc_dt.getValue(),
				this);
		setValueEx(columnDtl1_tax_cd, dtlR.getGUIIndex(), taxCd);
		if (setTaxFixFlg) {
			dtlR.tax_fix_flg(false);
		}
	}

	/**
	 * 税初期値を設定します。（全行）
	 * @param setTaxFixFlg
	 */
	protected void setDefaultTaxCd(boolean setTaxFixFlg) {
		for (Dtl1R r : getDtl1L()) {
			if (!r.isEmpty()) {
				if (r.abort_flg()) {
					continue;
				}
				if (r.tax_fix_flg() && !setTaxFixFlg) {
					continue;
				}
				setDefaultTaxCd(r, setTaxFixFlg);
			}
		}
	}
	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR
	 */
	protected void setIvItmNm(Dtl1R dtlR) {
		if (!Hdr1_sppl_iv_flg.getValue()){
			setValueEx(columnDtl1_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(Hdr1_prnt_lcl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl1_iv_itm_nm, dtlR.getGUIIndex(), null);
			}
			else {
				setValueEx(columnDtl1_iv_itm_nm, dtlR.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	
	/**
	 * 債務部門を設定します（行指定）
	 */
	protected void setDefaultApDptCd(Dtl1R dtlR) {
		setValueEx(columnDtl1_ap_dpt_cd, dtlR.getGUIIndex(), Hdr1_ap_dpt_cd.getValue());
	}
	//----------------------------------
	// 源泉税率
	//----------------------------------
	/**
	 * 源泉税率取得(行指定)
	 * @param r
	 */
	protected void setWtaxRate(Dtl1R r) {
		if (canEditWtaxRate(r)) {
			if (isNull(r.src_wtax_rate())) {
				// 源泉税率取得
				MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						getHdr1R().purc_dt(),
						this);
				setValueEx(columnDtl1_wtax_rate, r.getGUIIndex(), wtaxRate);	
			}
		}
		else {
			clearWtaxRate(r);
		}
	}
	/**
	 * 源泉税率取得(全行)
	 * @param r
	 */
	protected void setWtaxRate() {
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			if (!r.isEmpty()) {
				if (r.abort_flg()) {
					continue;
				}
				setWtaxRate(r);
			}
		}
	}
	
	/**
	 * 源泉税率をクリアします
	 * @param dtlR
	 */
	protected void clearWtaxRate(Dtl1R dtlR) {
		if (!canEditWtaxRate(dtlR)) {
			setValueEx(columnDtl1_wtax_rate, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(Dtl1R dtlR) {
		String purcIdTyp = dtlR.purc_id_typ();
		String trdCurCd = getHdr1R().trd_cur_cd();
		String baseCurCd = getHdr1R().base_cur_cd();
		String ptaxCurCd = getHdr1R().ptax_cur_cd();
		
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
	//----------------------------------
	
	/**
	 * 発注先品目・品名を設定します
	 * @param dtlR
	 */
	protected void setSpplItm(Dtl1R dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(Hdr1_sppl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(),
				Hdr1_purc_dt.getValue(), this);
		if (isNull(row)) {
			setValueEx(columnDtl1_sppl_itm_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl1_sppl_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl1_sppl_itm_cd, dtlR.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnDtl1_sppl_itm_nm, dtlR.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	
	/**
	 * ロット作成ＦＬＧを設定します
	 * @param dtlR
	 */
	protected void setLotCrtFlg(Dtl1R dtlR) {
		if (isNull(dtlR.purc_schd_no())) {
			if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
				setValueEx(columnDtl1_crt_lot_flg, dtlR.getGUIIndex(), false);
			}
			else {
				setValueEx(columnDtl1_crt_lot_flg, dtlR.getGUIIndex(), true);
			}
		}
	}
	
	/**
	 * 計画外の明細行の入荷同時計上ＦＬＧを設定します。<br>
	 * 明細行の入荷不要ＦＬＧがオンの場合、同時計上ＦＬＧをオフにします。<br>
	 * 入荷不要がオフの場合は、同時計上ＦＬＧをオンにします。<br>
	 * @param dtlR
	 */
	protected void setSyncFlg(Dtl1R dtlR) {
		if (isNull(dtlR.purc_schd_no())) {
			if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
				dtlR.sync_flg(false);
			}
			else {
				dtlR.sync_flg(true);
			}
		}
	}
	
	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(Dtl1R dtlR) {
		if (isNull(dtlR.dlv_loc_cd()) || !dtlR.str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.dlv_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtl1_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl1_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}
	
	/**
	 * ヘッダの金額合計を設定する。
	 */
	protected void setDispAmt() {
		MCNumber trdCurAmt = MCNumber.ZERO;
		MCNumber trdCurIncTaxAmt = MCNumber.ZERO;
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			if (!isNull(r.trd_cur_amt())) {
				trdCurAmt = trdCurAmt.add(r.dscnt_itm_flg() ? r.trd_cur_amt().negate() : r.trd_cur_amt());
			}
			if (!isNull(r.trd_cur_inc_tax_amt())) {
				trdCurIncTaxAmt = trdCurIncTaxAmt.add(r.dscnt_itm_flg() ? r.trd_cur_inc_tax_amt().negate() : r.trd_cur_inc_tax_amt());
			}
		}
		getHdr1R().trd_cur_amt(trdCurAmt);
		getHdr1R().trd_cur_inc_tax_amt(trdCurIncTaxAmt);
	}
	
	protected void setApDptCd() {
		if (isNull(getHdr1R().mst_ap_dpt_cd())) {
			if (isNull(getHdr1R().purc_dpt_cd())) {
				getHdr1R().ap_dpt_cd(null);
			}
			else {
				 if (getHdr1R().ap_dpt_flg()) {
					getHdr1R().ap_dpt_cd(getHdr1R().purc_dpt_cd());
				}
				else {
					getHdr1R().ap_dpt_cd(null);
				}	
			}
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		if (nc == columnDtl1_str_ln_cd_none_flg) {
			doDtl1_str_ln_cd_none_flg_NC(nc, info);
		}
		if (nc == columnDtl1_crt_lot_flg) {
			doDtl1_crt_lot_flg_NC(nc, info);
		}
		if (nc == columnDtl1_re_arr_rqst_dt) {
			doDtl1_re_arr_rqst_dt(info);
		}
		if (nc == columnDtl1_trd_unit_qty) {
			doDtl1_trd_unit_qty_NC(info);
		}

		if (nc == columnDtl2_trd_unit_qty) {
			doDtl2_trd_unit_qty_NC(info);
		}

	}

	/**
	 * 再入荷予定の仕入予定日を設定します
	 * @param info イベント情報
	 */
	protected void setReArrPurcSchdDt(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		
		// 仕入直送、または発注先が下請対象、または仕入計上区分が入荷基準の場合、再入荷希望日＝再入荷仕入予定日とする
		if (dtlRow.purc_ddlv_flg() || getHdr1R().subcon_flg() || MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			setValueEx(columnDtl1_re_arr_purc_schd_dt, idx, dtlRow.re_arr_rqst_dt());
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
			spplCd = getHdr1R().sppl_cd();
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
				dtlRow.scst_cd(),
				dtlRow.re_arr_loc_cd(),
				dtlRow.re_arr_loc_site_cd(),
				dtlRow.re_arr_loc_sppl_cd(),
				dtlRow.re_arr_loc_sppl_cal_cd(),
				dtlRow.re_arr_loc_cal_cd(),
				dtlRow.scst_cal_cd(),
				dtlRow.re_arr_loc_site_cd(),
				baseUnitReArrQty,
				isSame(sysParm, "1") ? getHdr1R().ac_dt() : null,
				this);
		
		if (!isNull(rslt)) {
			setValueEx(columnDtl1_re_arr_purc_schd_dt, idx, rslt.getDateNE("purc_schd_dt"));
		}
		
	}
	
	/**
	 * 再入荷予定数量を取引単位数量から基準単位数量に換算した数量を返します
	 * @param dtlRow 明細行
	 * @return 再入荷予定数量（基準単位）
	 */
	protected MCNumber getBaseUnitReArrQty(Dtl1R dtlRow) {
		return convToBaseUnit(dtlRow.trd_unit_re_arr_qty(), dtlRow.trd_unit_conv_base_qty(), 
				dtlRow.trd_unit_conv_qty(),dtlRow.base_unit_dec_place(), dtlRow.base_unit_rnd_typ());
	}
	
	/**
	 * 再入荷予定の入荷同時計上チェックを設定します<br>
	 * 対象行の再入荷納入希望日と再入荷仕入予定日が同じ日付の場合に、同時計上をオンにします
	 * @param info イベント情報
	 */
	protected void setReArrSyncFlg(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		
		if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
			// 仕入計上区分：入荷基準
			setValueEx(columnDtl1_re_arr_sync_flg, idx, true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(dtlRow.purc_basis_typ())) {
			// 仕入計上区分：検収基準
			setValueEx(columnDtl1_re_arr_sync_flg, idx, false);
		}
		else if (!isNull(dtlRow.re_arr_purc_schd_dt()) && !isNull(dtlRow.re_arr_rqst_dt())
				&&isSame(dtlRow.re_arr_purc_schd_dt(), dtlRow.re_arr_rqst_dt())) {
			setValueEx(columnDtl1_re_arr_sync_flg, idx, true);
		}
		else {
			setValueEx(columnDtl1_re_arr_sync_flg, idx, false);
		}
	}
	//doLCEventはチェックボックスでは実行されないため独自にcopyColValFromDtl1ToDtl2を実行する必要がある
	protected void doDtl1_str_ln_cd_none_flg_NC(MCNCBeans nc, MCEventInfo info) {
		copyColValFromDtl1ToDtl2(nc, info);		
	}
	protected void doDtl1_crt_lot_flg_NC(MCNCBeans nc, MCEventInfo info) {
		if (Dtl1_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			copyColValFromDtl1ToDtl2(nc, info);
		}
	}

	protected void doDtl1_re_arr_rqst_dt(MCEventInfo info) {
		// 納入希望日から仕入予定を算出
		setReArrPurcSchdDt(info);
		
		// 納入希望日と仕入予定日で判断して、同時計上チェックをセットする
		setReArrSyncFlg(info);
	}
	
	
	protected void doDtl1_trd_unit_qty_NC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		if (isNull(dtlRow.purc_schd_no()) && isNull(dtlRow.purc_act_d_no())) {
			setValueEx(columnDtl1_trd_cur_dscnt_amt, dtlRow.getGUIIndex(), null);
		}
	}
	protected void doDtl1_trd_unit_qty_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		setValueForMoneyCols(getHdr1R(), dtlRow);
	}
	
	@Override
	public void doDtl1_trd_unit_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl1_trd_unit_cd_LC(info);
		int idx = info.getEventIndex();
		Dtl1R dtlRow = Dtl1Table.getRow(idx);
		setValueForMoneyCols(getHdr1R(), dtlRow);
		
	}
	
	protected MCList<ConvQtyAmtUtil_HdrR> createUtilHdr(Hdr1R hdr, Dtl1R dtl, int hdrPegNo) {
		
		MCList<ConvQtyAmtUtil_HdrR> l = MCList.create(ConvQtyAmtUtil_HdrR.class);
		ConvQtyAmtUtil_HdrR utlHdr = 
		ConvQtyAmtUtil_HdrR.create();
		utlHdr.peg_no(hdrPegNo);
		utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
		utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
		utlHdr.trd_cur_cd(hdr.trd_cur_cd());
		utlHdr.act_tax_rate(dtl.tax_rate());
		utlHdr.act_inc_tax_flg(dtl.inc_tax_flg());
		utlHdr.amt_dec_place(hdr.trd_cur_amt_dec_place());
		utlHdr.upri_dec_place(hdr.trd_cur_upri_dec_place());
		utlHdr.amt_rnd_typ(hdr.purc_amt_rnd_typ());
		utlHdr.tax_rnd_typ(hdr.purc_tax_rnd_typ());
		utlHdr.wtax_rnd_typ(getCo().wtax_rnd_typ());
		utlHdr.schd_base_unit_qty(dtl.src_base_unit_qty());
		utlHdr.setNumberNE("act_xrate", hdr.xrate());
		utlHdr.setNumberNE("act_ptax_xrate", hdr.ptax_xrate());
		utlHdr.setNumberNE("xrate", hdr.src_xrate());
		utlHdr.setNumberNE("ptax_xrate", hdr.src_ptax_xrate());
		boolean useDbVal = dtl.purc_dtl_upd_flg() && isSame(dtl.db_trd_unit_cd(), dtl.trd_unit_cd());
		if (useDbVal) {
			utlHdr.trd_unit_cd(dtl.db_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.db_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.db_trd_cur_upri());
			if (isSame(dtl.db_trd_unit_qty(), dtl.trd_unit_qty())) {
				// 明細訂正後で、単位も数量も同じである場合は与えられた金額をそのまま返すため、発注時の値引額に戻さないようにする
				utlHdr.trd_cur_dscnt_amt(dtl.db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_dscnt_amt(dtl.src_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_proc_upri(dtl.db_trd_cur_proc_upri());
			utlHdr.trd_cur_onr_prov_upri(dtl.db_trd_cur_onr_prov_upri());
			utlHdr.trd_cur_amt(dtl.db_trd_cur_amt());
			utlHdr.trd_cur_proc_amt(dtl.db_trd_cur_proc_amt());
			utlHdr.trd_cur_onr_prov_amt(dtl.db_trd_cur_onr_prov_amt());
			utlHdr.trd_cur_tax_amt(dtl.db_trd_cur_tax_amt());
			utlHdr.trd_cur_inc_tax_amt(dtl.db_trd_cur_amt().add(dtl.db_trd_cur_tax_amt()));
			utlHdr.trd_unit_conv_qty(dtl.db_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.db_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.db_tax_rate());
			utlHdr.inc_tax_flg(dtl.db_inc_tax_flg());
		}
		else {
			// 発注明細の取引単位情報・金額情報を連携する
			utlHdr.trd_unit_cd(dtl.src_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.src_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.src_trd_cur_upri());
			utlHdr.trd_cur_dscnt_amt(dtl.src_trd_cur_dscnt_amt());
			utlHdr.trd_cur_proc_upri(dtl.src_trd_cur_proc_upri());
			utlHdr.trd_cur_onr_prov_upri(dtl.src_trd_cur_onr_prov_upri());
			utlHdr.trd_cur_amt(dtl.src_trd_cur_amt());
			utlHdr.trd_cur_proc_amt(dtl.src_trd_cur_proc_amt());
			utlHdr.trd_cur_onr_prov_amt(dtl.src_trd_cur_onr_prov_amt());
			utlHdr.trd_cur_tax_amt(dtl.src_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(dtl.src_trd_cur_upri(), dtl.src_trd_unit_qty(), dtl.tax_rate(), 
					dtl.inc_tax_flg(), hdr.trd_cur_amt_dec_place(), hdr.purc_amt_rnd_typ(), 
					hdr.purc_tax_rnd_typ(), dtl.src_trd_cur_dscnt_amt());
			utlHdr.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
			utlHdr.trd_unit_conv_qty(dtl.src_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.src_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.src_tax_rate());
			utlHdr.inc_tax_flg(dtl.src_inc_tax_flg());
		}
		l.add(utlHdr);
		return l;
	}
	
	
	protected MCList<ConvQtyAmtUtil_DtlR> createUtilDtl(Hdr1R hdr, Dtl1R dtl, int hdrPegNo) {
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL
		= MCList.create(ConvQtyAmtUtil_DtlR.class);

			ConvQtyAmtUtil_DtlR utlDtlR
				= ConvQtyAmtUtil_DtlR.create();
			
			utlDtlR.peg_no(dtl.peg_no());
			utlDtlR.hdr_peg_no(hdrPegNo);
			utlDtlR.trd_unit_qty(dtl.trd_unit_qty());
			utlDtlR.trd_unit_cd(dtl.trd_unit_cd());
			utlDtlR.trd_unit_conv_qty(dtl.trd_unit_conv_qty());
			utlDtlR.trd_unit_conv_base_qty(dtl.trd_unit_conv_base_qty());
			utlDtlR.wtax_rate(dtl.wtax_rate());
			utlDtlR.trd_cur_dscnt_amt(dtl.trd_cur_dscnt_amt());
			utlDtlL.add(utlDtlR);
			return utlDtlL;
		
	}
	/**
	 * 予定引継ぎの場合に数量、金額系項目に値をセットする
	 */
	protected void setValueForMoneyCols(Hdr1R hdr, Dtl1R dtl) {
		
		if (isNull(dtl.purc_schd_no())
			|| isNull(dtl.trd_unit_cd())
			|| isNull(dtl.trd_unit_qty())
			|| isNull(dtl.trd_cur_upri())
			|| !hasCost(dtl)) {
			return;
		}
			
		//金額計算
		
		// 紐付NO
		int hdr_peg_no = 1;
		
		// ユーティリティ実行用ヘッダ
		MCList<ConvQtyAmtUtil_HdrR> utlHdrL = createUtilHdr(hdr, dtl, hdr_peg_no);
		
		// ユーティリティ実行用明細（上段）
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL	= createUtilDtl(hdr, dtl, hdr_peg_no);
		
		// 明細の金額項目計算用ユーティリティ実行
		setAmtToDtlL(utlHdrL, utlDtlL);
		
		// ユーティリティの計算結果を明細に反映する
		ConvQtyAmtUtil_DtlR calcR = utlDtlL.get(0);
		dtl.trd_cur_upri(calcR.trd_cur_upri());
		dtl.trd_cur_dscnt_amt(calcR.trd_cur_dscnt_amt());
		dtl.trd_cur_amt(calcR.trd_cur_amt());
		dtl.trd_cur_tax_amt(calcR.trd_cur_tax_amt());
		dtl.trd_cur_inc_tax_amt(calcR.trd_cur_inc_tax_amt());
		dtl.trd_unit_conv_qty(calcR.trd_unit_conv_qty());
		dtl.trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());
		dtl.trd_cur_proc_upri(calcR.trd_cur_proc_upri());
		dtl.trd_cur_onr_prov_upri(calcR.trd_cur_onr_prov_upri());
		dtl.trd_cur_proc_amt(calcR.trd_cur_proc_amt());
		dtl.trd_cur_onr_prov_amt(calcR.trd_cur_onr_prov_amt());
		dtl.trd_cur_wtax_amt(calcR.wtax_amt());

		// 基準通貨・納税通貨に換算
	
		// 単価・値引額・金額・税額
		dtl.base_cur_upri(convToBaseCur(dtl.trd_cur_upri(), hdr.xrate(), hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_dscnt_amt(convToBaseCur(dtl.trd_cur_dscnt_amt(), hdr.xrate(), hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_amt(convToBaseCur(dtl.trd_cur_amt(), hdr.xrate(), hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_tax_amt(convToBaseCur(dtl.trd_cur_tax_amt(), hdr.xrate(), hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		if (!isNull(hdr.xrate())) {
			dtl.base_cur_inc_tax_amt(dtl.base_cur_amt().add(dtl.base_cur_tax_amt()));
		}

		// 加工単価・金額
		dtl.base_cur_proc_upri(convToBaseCur(dtl.trd_cur_proc_upri(), hdr.xrate(), hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_proc_amt(convToBaseCur(dtl.trd_cur_proc_amt(), hdr.xrate(), hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		// 有償支給単価・金額
		dtl.base_cur_onr_prov_upri(convToBaseCur(dtl.trd_cur_onr_prov_upri(), hdr.xrate(), hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_onr_prov_amt(convToBaseCur(dtl.trd_cur_onr_prov_amt(), hdr.xrate(), hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		
		if (!isNull(hdr.ptax_cur_cd())) {
			dtl.ptax_cur_upri(convCur(dtl.trd_cur_upri(), hdr.ptax_xrate(), hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_dscnt_amt(convCur(dtl.trd_cur_dscnt_amt(), hdr.ptax_xrate(), hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_amt(convCur(dtl.trd_cur_amt(), hdr.ptax_xrate(), hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_tax_amt(convCur(dtl.trd_cur_tax_amt(), hdr.ptax_xrate(), hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(hdr.ptax_xrate())) {
				dtl.ptax_cur_inc_tax_amt(dtl.ptax_cur_amt().add(dtl.ptax_cur_tax_amt()));
			}
			
			// 加工単価・金額
			dtl.ptax_cur_proc_upri(convCur(dtl.trd_cur_proc_upri(), hdr.ptax_xrate(), hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_proc_amt(convCur(dtl.trd_cur_proc_amt(), hdr.ptax_xrate(), hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));

			// 有償支給単価・金額
			dtl.ptax_cur_onr_prov_upri(convCur(dtl.trd_cur_onr_prov_upri(), hdr.ptax_xrate(), hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_onr_prov_amt(convCur(dtl.trd_cur_onr_prov_amt(), hdr.ptax_xrate(), hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		if(dtl.repurc_obli_flg()) {
			setRepurcObliTax(dtl);
		}
	
		setDispAmt();
	}
	protected void doDtl2_trd_unit_qty_NC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl2R row = Dtl2Table.getRow(idx);

		if (isNull(row.trd_unit_qty())) {
			setValueEx(columnDtl2_base_unit_qty, idx, null);
		}
		else {
			// 取引単位数量 ⇒ 基準単位数へ換算してセット
			MCNumber baseUnitQty = convToBaseUnit(row.trd_unit_qty(), row.trd_unit_conv_base_qty(), row.trd_unit_conv_qty(),
					row.base_unit_dec_place(), row.base_unit_rnd_typ());
			setValueEx(columnDtl2_base_unit_qty, idx, baseUnitQty);
		}
	}
	
	/**
	 * 明細行に詳細行があるか
	 * @param dtlRow 明細行
	 * @return true:詳細行あり<br>false:なし
	 */
	protected boolean havIoRows(Dtl1R dtlRow) {
		if (!isNull(_dtl2L.get(dtlRow.peg_no()))) {
			return true;
		}
		return false;
	}
	
	/**
	 * 明細行に紐付く詳細行が1行のみか
	 * @param dtlRow
	 * @return true:1行のみ<br>false:詳細行なし、または2行以上の詳細行がある
	 */
	protected boolean havOnlyOneIoRows(Dtl1R dtlRow) {
		if (_dtl2L.containsKey(dtlRow.peg_no())) {
			if (_dtl2L.get(dtlRow.peg_no()).size() == 1) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 明細行に紐付く詳細行を1行取得する</p>
	 * 明細行に紐付く詳細行が1行のみの場合に使用する
	 * @param dtlRow
	 * @return 詳細行
	 */
	protected Dtl2R getOnlyOneIoRow(Dtl1R dtlRow) {
		return _dtl2L.get(dtlRow.peg_no()).get(0);
	}
	
	/**
	 * 計画外仕入時に明細行の内容をコピーして、詳細行を作成する</p>
	 * ただし、明細行に対応する詳細行が1レコードも存在しない場合に限る
	 * @param dtlRow 明細行
	 */
	protected void insIoRowInExPo(Dtl1R dtlRow) {
		// 輸入諸掛の場合、仕入予定は作成されるので、計画外かは発注明細ＮＯで判断する
		if (!isNull(dtlRow.po_d_no())) {
			return;
		}
		
		if (!havIoRows(dtlRow)) {
			Dtl2R ioRow = createDtl2R();
			// 対応する明細行の明細紐付NOをセット
			ioRow.dtl_peg_no(dtlRow.peg_no());
			// 詳細紐付NOを発番
			setIoPegNo(ioRow);
			// 詳細枠に行追加
			insertRowNoFocus(Dtl2Table, ioRow);
			
			MCList<Dtl2R> addIoLst = MCList.create(Dtl2R.class);
			addIoLst.add(ioRow);

			copyValFrDtlRowToIoList(dtlRow, addIoLst);
			
			// キャッシュにセット
			_dtl2L.put(dtlRow.peg_no(), addIoLst);
			
		}
		
	}
	
	/**
	 * 明細行の値を、詳細行のリストにコピーする
	 * @param dtlRow 明細行
	 * @param ioList 詳細行のリスト
	 */
	protected void copyValFrDtlRowToIoList(Dtl1R dtlRow, MCList<Dtl2R> ioList) {
		
		for (Dtl2R ioRow : ioList) {
			int idx = ioRow.getGUIIndex();
			
			// 明細行の品目情報をコピー
			ioRow.itm_cd(dtlRow.itm_cd());
			ioRow.itm_sub1(dtlRow.itm_sub1());
			ioRow.itm_sub2(dtlRow.itm_sub2());
			setValueEx(columnDtl2_itm_sub3, idx, null);
			setValueEx(columnDtl2_itm_sub3, idx, dtlRow.itm_sub3());
			// 単位
			setValueEx(columnDtl2_trd_unit_cd, idx, dtlRow.trd_unit_cd());
			setValueEx(columnDtl2_trd_unit_qty, idx, dtlRow.trd_unit_qty());
			// 場所情報をコピー
			setValueEx(columnDtl2_dlv_loc_cd, idx, dtlRow.dlv_loc_cd());
			// 在庫情報
			setValueEx(columnDtl2_gd_cd, idx, dtlRow.gd_cd());
			setValueEx(columnDtl2_quality_typ, idx, dtlRow.quality_typ());
			if (!dtlRow.str_ln_cd_none_flg()) {
				setValueEx(columnDtl2_str_ln_cd, idx, dtlRow.str_ln_cd());
			}
			setValueEx(columnDtl2_str_ln_cd_none_flg, idx, dtlRow.str_ln_cd_none_flg());
			setValueEx(columnDtl2_crt_lot_flg, idx, dtlRow.crt_lot_flg());
			if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlRow.lot_mng_typ())) {
				setValueEx(columnDtl2_lot_no, idx, dtlRow.lot_no());
			}
			if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtlRow.sublot_mng_typ())) {
				setValueEx(columnDtl2_sublot_no, idx, dtlRow.sublot_no());
			}
			setValueEx(columnDtl2_ver_no, idx, dtlRow.ver_no());
			// その他
			setValueEx(columnDtl2_bp_lot_no, idx, dtlRow.bp_lot_no());
			setValueEx(columnDtl2_bp_dlv_slip_no, idx, dtlRow.bp_dlv_slip_no());
			setValueEx(columnDtl2_bp_dlv_slip_d_no, idx, dtlRow.bp_dlv_slip_d_no());
			setValueEx(columnDtl2_ship_fr_valid_dt, idx, dtlRow.ship_fr_valid_dt());
			setValueEx(columnDtl2_purc_cont_qty, idx, dtlRow.purc_cont_qty());

		}
		
	}
	
	/**
	 * 指定されたRowに格納されている税込金額を取得する
	 * @param row
	 */
	protected MCNumber getIncTaxAmt(MCRow row) {
		return row.getNumberNE("inc_tax_amt");
	}
	
	/**
	 * 予定の単位及び、詳細の数量の合計を予定の単位に換算した数量を、上段にセットする。
	 * @param dtlL 対象行
	 */
	protected void setValueForTrdUnitCols(MCList<Dtl1R> dtlL) {
		
		// 発注明細(予定情報)でグループ
		MCList<Dtl1R> dtlLByPoD = dtlL.groupBy(Dtl1R.$po_d_no);
		
		// 紐付NO
		int hdr_peg_no = 1;
		// ユーティリティ実行用のヘッダリスト
		MCList<ConvQtyAmtUtil_HdrR> hdrList = MCList.create(ConvQtyAmtUtil_HdrR.class);
		
		// ユーティリティ実行用の明細リスト
		MCList<ConvQtyAmtUtil_DtlR> dtlList
			= MCList.create(ConvQtyAmtUtil_DtlR.class);

		// ユーティリティ実行用の詳細リスト
		MCList<ConvQtyAmtUtil_Dtl2R> dtl2List
			= MCList.create(ConvQtyAmtUtil_Dtl2R.class);
		
		for (Dtl1R row : dtlLByPoD) {
			
			Dtl1R hdr = dtlL.getFirst(Dtl1R.$po_d_no, row.po_d_no());
			
			// ユーティリティ実行用ヘッダ
			ConvQtyAmtUtil_HdrR utlHdr = ConvQtyAmtUtil_HdrR.create();
			utlHdr.peg_no(hdr_peg_no++);
			utlHdr.base_unit_dec_place(hdr.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(hdr.base_unit_rnd_typ());
			
			hdrList.add(utlHdr);
			
			// ユーティリティ実行用明細（上段）
			MCList<Dtl1R> dtl = dtlL.subList(Dtl1R.$po_d_no, hdr.po_d_no());
			MCList<ConvQtyAmtUtil_DtlR> utlDtlL
				= MCList.create(ConvQtyAmtUtil_DtlR.class);
			MCList<ConvQtyAmtUtil_Dtl2R> utlDtl2L
			= MCList.create(ConvQtyAmtUtil_Dtl2R.class);
			
			for (Dtl1R dr : dtl) {
				ConvQtyAmtUtil_DtlR utlDtlR	= ConvQtyAmtUtil_DtlR.create();
				
				utlDtlR.peg_no(dr.peg_no());
				utlDtlR.hdr_peg_no(utlHdr.peg_no());
				
				utlDtlL.add(utlDtlR);
				
				MCList<Dtl2R> d2l = _dtl2L.get(dr.peg_no());
				
				if (isNull(d2l)) {
					return;
				}
				
				d2l.forEach(ir -> {
					ConvQtyAmtUtil_Dtl2R uir = utlDtl2L.createRow();
					uir.dtl_peg_no(dr.peg_no());
					uir.peg_no(ir.peg_no());
					uir.trd_unit_cd(ir.trd_unit_cd());
					uir.trd_unit_qty(ir.trd_unit_qty());
					uir.trd_unit_conv_base_qty(ir.trd_unit_conv_base_qty());
					uir.trd_unit_conv_qty(ir.trd_unit_conv_qty());
					//発注時情報
					uir.schd_trd_unit_cd(hdr.src_trd_unit_cd());
					uir.schd_trd_unit_conv_qty(hdr.src_trd_unit_conv_qty());
					uir.schd_trd_unit_conv_base_qty(hdr.src_trd_unit_conv_base_qty());
					uir.schd_trd_unit_dec_place(hdr.src_trd_unit_dec_place());
					uir.schd_trd_unit_rnd_typ(hdr.src_trd_unit_rnd_typ());
					dtl2List.add(uir);
				});
			}

			dtlList.addAll(utlDtlL);
			
		}
		
		// 明細の数量、金額項目計算用ユーティリティ実行
		calcDtlQty(hdrList, dtlList, dtl2List);
		
		// ユーティリティの計算結果を明細に反映する
		for (ConvQtyAmtUtil_DtlR dtlR : dtlList) {
			Dtl1R row = getDtl1L().getFirst(Dtl1R.$peg_no, dtlR.peg_no());
			setValueEx(columnDtl1_trd_unit_cd, row.getGUIIndex(), dtlR.trd_unit_cd());
			setValueEx(columnDtl1_trd_unit_qty, row.getGUIIndex(), dtlR.trd_unit_qty());
		}

	}

	protected void setValueForContCols(MCList<Dtl1R> dtl) {
		for (Dtl1R dr : dtl) {
			
			MCList<Dtl2R> d2l = _dtl2L.get(dr.peg_no());
			
			if (isNull(d2l)) {
				return;
			}
			
			//明細の有効成分を再計算
			dr.purc_cont_qty(null);
			dr.std_cont_qty(null);
			
			d2l.forEach(ir ->  {
				MSUCP_PurcUtil.setCont(ir);
				MSUCP_PurcUtil.addCont(dr, ir);
			});
		}
			
	}
	
	/**
	 * 明細行の品目情報を、詳細行にコピーする
	 * @param dtlRow コピー元明細行
	 * @param ioRow コピー先詳細行
	 */
	protected void copyItmInfo(Dtl1R dtlRow, Dtl2R ioRow) {
		
		ioRow.itm_cd(dtlRow.itm_cd());
		ioRow.itm_sub1(dtlRow.itm_sub1());
		ioRow.itm_sub2(dtlRow.itm_sub2());
		
		// 品目リストロジックのイベントを発生させて、在庫管理区分など画面制御に必要な項目を設定する
		setValueEx(columnDtl2_itm_sub3, ioRow.getGUIIndex(), dtlRow.itm_sub3());
		
	}
	
	
	/**
	 * リストから最大値+1を取得する
	 * @param dtl 対象のMCList
	 * @param noName 対象のカラム名
	 * @return 最大値+1
	 */
	protected MCNumber getNextNo(MCList<?> dtl, String noName) {
		
		// Listが空、もしくはNullなら1を固定で返す
		if (isNull(dtl) || dtl.size() == 0) {
			return MCNumber.valueOf(1);
		}
		
		// List内の指定カラムの最大値が取れない場合も1を固定で返す
		MCNumber nextNo = (MCNumber)dtl.max(noName);
		if (isNull(nextNo)) {
			return MCNumber.valueOf(0);
		}
		
		// 最大値が取れたら、1を加算して返す
		return nextNo.add(1);
		
	}
	
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdr1R());
		ret.add(getDtl1L());
		ret.add(getDtl2L());
		
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	/**
	 * 種別を「登録」に変更した時に実行されるFillSpaceのイベント
	 */
	@Override
	protected void opePanelFillSpace() {
		// 紐付NO初期化
		initMaxPegNo();
		
		// 登録枠でも詳細枠はFillSpaceしない
		for (MCTable<?> tbl : opePanelFillSpaceTables()) {
			if (tbl != Dtl2Table) {
				tbl.fillSpace();
			}
		}
		
	}

	// IfRowMoveBaseの実装
	@Override
	public MCTable<?> getRowMoveTable() {
		return Dtl1Table;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}
	/**
	 * [MS_MSBDL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Srch01Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_SCHDStatus();
			setHdrPanelMode();
			setHdrPanelInitValue();
			setBtnMode();
			setSrchUpriBtnMode();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			Dtl1Table.selectLeftmostColumn(0);
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			Hdr1R hr = bridge.down0();
			hr.inherited_src_no(hr.po_no());
			hr.src_xrate(hr.xrate());
			hr.src_ptax_xrate(hr.ptax_xrate());
			
			//部門担当者部品の入力制御のため、setModeよりも前に設定する
			bridge.down0().purc_dt(getToday());
			bridge.down0().ac_dt(getToday());
			bridge.down0().pay_basis_dt(getToday());
			
			// 行ステータスを「新規」にセット
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);
			
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
			
			// 画面に表示する前に電文をhiddenListに格納してしまう
			setHiddenList(bridge.down2());
			MCIndexKey idxDown1 = bridge.down1().createIndex(Dtl2R.$peg_no);
			MCIndexKey idxDown2 = bridge.down2().createIndex(Dtl2R.$dtl_peg_no);
			// 検索直後の入荷同時計上ＦＬＧ,格付ＣＤ(入荷予定の格付),良品区分を退避する
			bridge.down1().forEach(r -> {
				MCList<Dtl2R> subL = bridge.down2().subList(idxDown2, r.peg_no());
				if (subL.size() == 1 && isNull(subL.get(0).arr_act_no())) {
					if (!r.sync_flg()) {
						// 未入荷で同時計上予定でない場合は、格付の初期値はnullとする
						r.tmp_gd_cd(r.gd_cd());
						r.gd_cd(null);
						r.gd_nm(null);
					}
					// 未入荷の場合は在庫がまだないため、良品区分をnullで表示する
					r.tmp_quality_typ(r.quality_typ());
					r.quality_typ(null);
					r.quality_typ_nm(null);
				}
				r.old_sync_flg(r.sync_flg());
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
			});
			// 検索直後の格付ＣＤ,良品区分を退避
			bridge.down2().forEach(r -> {
				if (isNull(r.arr_act_no())) {
					Dtl1R dtl1R = bridge.down1().getFirst(idxDown1, r.dtl_peg_no());
					if (!dtl1R.sync_flg()) {
						// 未入荷で同時計上予定でない場合は格付はnullとする
						r.gd_cd(null);
						r.gd_nm(null);
					}
					// 未入荷の場合は在庫がまだ無いため、在庫検査区分と在庫識別区分、良品区分をnullで表示する
					r.tmp_stk_insp_typ(r.stk_insp_typ());
					r.tmp_stk_id_typ(r.stk_id_typ());
					r.tmp_quality_typ(r.quality_typ());
					r.stk_insp_typ(null);
					r.stk_insp_typ_nm(null);
					r.stk_id_typ(null);
					r.stk_id_typ_nm(null);
					r.quality_typ(null);
					r.quality_typ_nm(null);
				}
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
			});
			bridge.down0().purc_xrate_cd(getCo().purc_xrate_cd());
			setCrtLotFlg(bridge.down1(), bridge.down2());
		}
		@Override
		protected void show() {
			super.show();
			setOrgAmt();
			setDispAmt();
		}
	}

	/**
	 * [MS_MSBDL0140_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Srch02Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0140_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setSrchUpriBtnMode();
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			Hdr1R hr = bridge.down0();
			hr.inherited_src_no(hr.po_no());
			hr.src_xrate(hr.xrate());
			hr.src_ptax_xrate(hr.ptax_xrate());
			
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
			
			// 画面に表示する前に電文をhiddenListに格納してしまう
			setHiddenList(bridge.down2());
			
			// 検索直後の入荷同時計上ＦＬＧ,格付ＣＤ（入荷予定の格付ＣＤ）,良品区分を退避
			bridge.down1().forEach(r -> {
				r.old_sync_flg(r.sync_flg());
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
			});
			// 検索直後の格付ＣＤ（入荷予定または現状在庫の格付ＣＤ）,良品区分を退避
			bridge.down2().forEach(r -> {
				r.old_gd_cd(r.gd_cd());
				r.old_quality_typ(r.quality_typ());
			});
			hr.can_ac_dt(hr.ac_dt());
			hr.purc_xrate_cd(getCo().purc_xrate_cd());
		}
		@Override
		protected void show() {
			super.show();
			copyAmtData();
			setOrgAmt();
			setDispAmt();
		}
	}
	
	/**
	 * 変更前の金額情報を行に設定する
	 */
	protected void copyAmtData() {
		for(Dtl1R r :exceptDeleteAndEmpty(getDtl1L())) {
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
	
	/***
	 * 変更前金額情報を部品に連携します。
	 */
	protected void setOrgAmt() {
		for(Dtl1R r :getDtl1L()) {
			r.trd_cur_upri_p().org_trd_cur_dscnt_amt(r.src_trd_cur_dscnt_amt());
			r.trd_cur_upri_p().org_qty(r.src_trd_unit_qty());
		}
	}

	protected void setSrchUpriBtnMode() {
		if (getHdr1R().subcon_flg()) {
			Btn_srch_upri.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_srch_upri);
		}
	}
	
	/**
	 * ヘッダ枠のGUI項目のモード制御
	 */
	protected void setHdrPanelMode() {
		// 納税通貨 
		if (isNull(getHdr1R().ptax_cur_cd())) {
			// 納税通貨CD設定なしの場合は、読取専用
			Hdr1_ptax_xrate.setMode(MCMode.READ_ONLY);
		}
		else if (isSame(getHdr1R().trd_cur_cd(), getHdr1R().ptax_cur_cd())) {
			// 取引通貨と納税通貨が同じ通貨CDの場合は読取専用
			Hdr1_ptax_xrate.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * ヘッダ枠の項目に検索後の初期値をセット
	 */
	protected void setHdrPanelInitValue() {
		
		// 仕入日・計上日・支払起算日
		getHdr1R().purc_dt(getToday());
		getHdr1R().ac_dt(getToday());
		getHdr1R().pay_basis_dt(getToday());
		
		// 納税通貨 
		if (isSame(getHdr1R().trd_cur_cd(), getHdr1R().ptax_cur_cd())) {
			// 取引通貨と納税通貨が同じ通貨CDの場合はレートは"1"に固定
			setValueEx(Hdr1_ptax_xrate, MCNumber.valueOf(1));
		}
	}

	
	/**
	 * 対象カラムの最大値を取得する
	 * @param list 対象リスト
	 * @param colNm 対象カラム
	 * @return 最大値
	 */
	protected int getMaxValue(MCList<?> list, String colNm) {
		Comparable<?> maxNo = list.max(colNm);
		return ((MCNumber)maxNo).intValue();
	}
	
	/**
	 * キャッシュをクリアする
	 */
	protected void clearHiddenList() {
		_dtl2L = new HashMap<MCNumber, MCList<Dtl2R>>();
	}
	
	/**
	 * 詳細行の検索結果をキャッシュに設定する。
	 * @param dtl2L　検索した詳細行
	 */
	protected void setHiddenList(MCList<Dtl2R> dtl2L) {
		MCIndexKey idxKey = dtl2L.createIndex(Dtl2R.$dtl_peg_no);
		for(Dtl2R r: dtl2L.groupBy(Dtl2R.$dtl_peg_no)) {
			MCList<Dtl2R> val = dtl2L.subList(idxKey, r.dtl_peg_no());
			_dtl2L.put(r.dtl_peg_no(), val);
		}
	}
	
	/**
	 * 明細行に対する詳細行を表示する。
	 * @param row 対象の明細行
	 */
	protected void showIo(Dtl1R row) {
		if (!isNull(row)){
			getDtl2L().setAll(_dtl2L.get(row.peg_no()));
			showSub(Dtl2Table);
		}
		else {
			getDtl2L().clear();
		}
	}
	
	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
			tbl.selectLeftmostColumn(0);
		}
	}
	

	/**
	 * [MS_MSBDL0140_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Ins01Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;
		
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<Dtl1R> _tgtList;

		protected MS_MSBDL0140_Ins01Caller(P p, B b) {
			super(p, b);
		}

		/** 登録対象のリスト */
		protected MCList<Dtl1R> _dtl1LForCall = MCList.create(Dtl1R.class);
		protected MCList<Dtl2R> _dtl2LForCall = MCList.create(Dtl2R.class);

		@Override
		protected void initCaller() {
			super.initCaller();
			
			// 明細行・詳細行ともに空行以外は通信対象
			_dtl1LForCall = exceptEmpty(getDtl1L());

			for (Dtl1R dtl : _dtl1LForCall) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}
			getDownBlocks();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtl1L(true);
			
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtl1LForCall);
			bridge.up2().setAll(_dtl2LForCall);
		}
		
		@Override
		protected boolean confirmForCall() {
			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_tgtList.forEach(dr ->	restoreUpri(dr));
			}
			return confirmRslt;
			
		}

		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			Hdr1R hr = getHdr1R();
			MCIndexKey idx = _dtl2LForCall.createIndex(Dtl2R.$dtl_peg_no);
			for (Dtl1R dr : _dtl1LForCall) {
				msgList.addAll(cmnChkDtl(hr, dr));
				
				MCList<Dtl2R> tgtIoL = _dtl2LForCall.subList(idx, dr.peg_no());
				msgList.addAll(cmmChkIo(dr, exceptDeleteAndEmpty(tgtIoL)));
			}
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			msgList.addAll(arrPtnChk());
			msgList.addAll(qualityTypChk());
			msgList.addAll(inptChk());
			
			_tgtList.forEach(dr ->
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
			msgList.addAll(_upriChngMsgList);

		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			// 入荷パタン
			for (Dtl1R upDtlRow : bridge.up1()) {
				if (!isNull(upDtlRow.arr_schd_no())) {
					if (upDtlRow.arr_qty().isZero() && !upDtlRow.sync_flg()) {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
					}
					else {
						upDtlRow.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
					}
				}
			}
		}
		
		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
				l.set(2, _dtl2LForCall);
				return l;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getHdr1R());
			checkReqSub(msgList, getDtl1L());
		}

		
		
	}

	/**
	 * [MS_MSBDL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Upd01Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;
		
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<Dtl1R> _tgtList;

		protected MCList<Dtl1R> _dtl1LForCall = MCList.create(Dtl1R.class);
		protected MCList<Dtl2R> _dtl2LForCall = MCList.create(Dtl2R.class);
		
		protected MS_MSBDL0140_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			// 明細行・詳細行ともに空行以外は通信対象
			_dtl1LForCall = exceptEmpty(getDtl1L());

			for (Dtl1R dtl : _dtl1LForCall) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}
			
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtl1L(true);

		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtl1LForCall);
			bridge.up2().setAll(_dtl2LForCall);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			Hdr1R hr = getHdr1R();
			MCIndexKey idx = _dtl2LForCall.createIndex(Dtl2R.$dtl_peg_no);
			for (Dtl1R dr : _dtl1LForCall) {
				msgList.addAll(cmnChkDtl(hr, dr));
				
				MCList<Dtl2R> tgtIoL = _dtl2LForCall.subList(idx, dr.peg_no());
				msgList.addAll(cmmChkIo(dr, exceptDeleteAndEmpty(tgtIoL)));
			}
			
		}
		
		@Override
		protected boolean confirmForCall() {
			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_tgtList.forEach(dr ->	restoreUpri(dr));
			}
			return confirmRslt;
			
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			msgList.addAll(qualityTypChk());
			msgList.addAll(inptChk());
			
			_tgtList.forEach(dr ->
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
			msgList.addAll(_upriChngMsgList);

		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
			l.set(2, _dtl2LForCall);
			return l;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqSub(msgList, getHdr1R());
			checkReqSub(msgList, getDtl1L());
		}
		
	}

	/**
	 * 入荷パタンチェック
	 * @return メッセージリスト
	 */
	protected MCMessageList arrPtnChk() {
		MCMessageList msgL = new MCMessageList();
		
		for (Dtl1R r : getDtl1L()) {
			// 入荷不要の入荷予定、入荷予定なし、入荷済、または仕入対象外の場合、チェックしない
			if (isNull(r.arr_schd_no())	|| !r.arr_qty().isZero() || r.arr_skip_flg() || r.non_purc_flg()) {
				continue;
			}

			if (r.sync_flg()) {
				if (!r.schd_sync_flg()) {
					msgL.add(new MCMessage(r, Dtl1R.$sync_flg, MSBEP0031));
				}
			}
			else {
				if (r.arr_schd_dt().lte(r.purc_schd_dt()) && !r.schd_sync_flg()) {
					msgL.add(new MCMessage(r, Dtl1R.$sync_flg, MSBEP0033));
				}
				else if (r.schd_sync_flg()) {
					msgL.add(new MCMessage(r, Dtl1R.$sync_flg, MSBEP0030));
				}
			}
			
		}

		return msgL;
	}
	
	/**
	 * 明細行が更新対象か判定する
	 * @param dtlRow 対象の明細行
	 * @return true:更新対象
	 */
	protected boolean isUpdTgtDtlRow(Dtl1R dtlRow) {
		
		if (isSame(dtlRow.getStatus(), CREATE) || isSame(dtlRow.getStatus(), MODIFY)
				|| (isSame(dtlRow.getStatus(), NONE) && !isNull(dtlRow.purc_act_d_no())) ) {
			return true;
		}
		return false;
	}
	
	/**
	 * 良品区分チェック
	 * @return メッセージリスト
	 */
	protected MCMessageList qualityTypChk() {
		MCMessageList msgL = new MCMessageList();
		
		for (Dtl1R dtlRow : getDtl1L()) {
			
			if (!isUpdTgtDtlRow(dtlRow)) {
				continue;
			}
				
			MCList<Dtl2R> ioList = _dtl2L.get(dtlRow.peg_no());
			for (Dtl2R ioRow : ioList) {
				if (isSame(ioRow.getStatus(), CREATE) || isSame(ioRow.getStatus(), MODIFY)) {
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(ioRow.stk_id_typ())
							&& MAC_QUALITY_TYP.isDFCT_INSP(ioRow.quality_typ())
							&& hasCost(dtlRow)) {
						// 仕入検収前で検査不良の在庫を仕入計上しようとした場合
						msgL.add(new MCMessage(ioRow, Dtl2R.$quality_typ, MSBDP0011, toDispGUIIndex(dtlRow)));
					}
				}
				if (isSame(ioRow.getStatus(), CREATE)) {
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(ioRow.stk_id_typ())
							&& !MSC_STK_INSP_TYP.isFIN(ioRow.stk_insp_typ())) {
						// 仕入検収前で検査済でない在庫を仕入計上しようとした場合
						msgL.add(new MCMessage(ioRow, Dtl2R.$stk_insp_typ, MSBDP0037, toDispGUIIndex(dtlRow)));
					}
				}
			}
				
		}		
		return msgL;
	}
	
	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {
		MCMessageList msgL = new MCMessageList();
		
		// 予定NO毎に入力値チェックを行う
		MCGroupByPolicy grpKey = new MCGroupByPolicy(Dtl1R.$purc_schd_no, Dtl1R.$purc_schd_qty, Dtl1R.$purc_qty,
				Dtl1R.$itm_cd, Dtl1R.$itm_sub1, Dtl1R.$itm_sub2, Dtl1R.$itm_sub3);
		
		grpKey.sum(Dtl1R.$base_unit_qty);
		
		MCList<Dtl1R> purcSchdGroup = getDtl1L().groupBy(grpKey);
		for (Dtl1R psGrpRow : purcSchdGroup) {
			
			if (isNull(psGrpRow.purc_schd_no())) {
				continue;
			}
			
			MCList<Dtl1R> purcActDL = getDtl1L().subList(Dtl1R.$purc_schd_no, psGrpRow.purc_schd_no());
			msgL.addAll(doInptChk(MAC_FUNC_TYP.PURC.value(),
					columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3,
					columnDtl1_purc_act_d_no, columnDtl1_base_unit_qty_bf_cng,
					columnDtl1_base_unit_qty, columnDtl1_purc_act_qty, columnDtl1_purc_schd_qty,
					purcActDL, columnDtl1_trd_unit_qty, columnDtl1_purc_schd_no));
		}
		
		return msgL;
	}
	
	/**
	 * 異なる単価の明細が含まれるかどうかを判定します。
	 */
	protected void setDiffLatestUpriMsg(MCMessageList ml, Dtl1R dr) {
		if (isNullOr(dr.old_trd_cur_upri(), dr.trd_cur_upri())) {
			return;
		}
		if (!isSame(dr.old_trd_cur_upri(), dr.trd_cur_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_upri.getLabelByLocale(), 
					dr.old_trd_cur_upri(), dr.trd_cur_upri(), toDispGUIIndex(dr)));
		}
		if (!isSame(dr.old_trd_cur_proc_upri(), dr.trd_cur_proc_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_proc_upri.getLabelByLocale(), 
					dr.old_trd_cur_proc_upri(), dr.trd_cur_proc_upri(), toDispGUIIndex(dr)));
		}
		if (!isSame(dr.old_trd_cur_onr_prov_upri(), dr.trd_cur_onr_prov_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_onr_prov_upri.getLabelByLocale(), 
					dr.old_trd_cur_onr_prov_upri(), dr.trd_cur_onr_prov_upri(), toDispGUIIndex(dr)));
		}
	}
	
	/**
	 * [MS_MSBDL0140_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0140_Del01Caller<P extends MSBDP_PurcReg, B extends MS_MSBDL0140_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MCList<Dtl2R> _dtl2LForCall = MCList.create(Dtl2R.class);

		protected MS_MSBDL0140_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			
			for (Dtl1R dtl : getDtl1L()) {
				if (_dtl2L.containsKey(dtl.peg_no())) {
					_dtl2LForCall.addAll(exceptEmpty(_dtl2L.get(dtl.peg_no())));
				}
			}
			
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(_dtl2LForCall);
			
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr1_can_ac_dt_for_input));
		}

	}


	
	/**
	 * 画面クリア処理
	 */
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearHiddenList();
	}
	
	@Override
	protected void clearContainers(List<MCContainer> containers) {
		super.clearContainers(containers);
		if (containers.contains(getDtl2L())) {
			clearHiddenList();
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 登録種別から別種別に変更時、仕入実績NOを検索NOにコピー
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdr1R().purc_act_no());
		}
		
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			setRefToInsInit();
		}
		else if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_UPD.getActionCommand())) {
			setBtnMode();
		}

	}

	/**
	 * 参照種別から登録種別変更時に、引継がない項目を初期化する
	 */
	protected void setRefToInsInit() {
		
		// ヘッダ
		getHdr1R().po_no(null);
		getHdr1R().purc_act_no(null);
		getHdr1R().purc_act_seq(null);
		getHdr1R().purc_act_rev(null);
		getHdr1R().purc_dt(getToday());
		getHdr1R().ac_dt(getToday());
		getHdr1R().pay_basis_dt(getToday());
		getHdr1R().xrate_inpt_flg(false);
		getHdr1R().ptax_xrate_inpt_flg(false);
		getHdr1R().po_print_rmrks(null);
		getHdr1R().latest_flg(false);
		getHdr1R().can_flg(false);
		Hdr1_can_ac_dt_for_input.clear();
		Hdr1_can_ac_dt.clear();
		Hdr1_ac_dt_after_srch.clear();
		
		// 明細
		for (Dtl1R dtlRow : getDtl1L()) {
			
			if (dtlRow.isEmpty()) {
				continue;
			}
			dtlRow.arr_ptn_typ(null);
			// 品目が入荷不要でない場合、は同時計上をオンにする
			if (dtlRow.arr_skip_flg()) {
				dtlRow.sync_flg(false);
			}
			else {
				dtlRow.sync_flg(true);
			}
			dtlRow.purc_basis_typ(null);
			dtlRow.purc_basis_typ_nm(null);
			dtlRow.purc_schd_dt(null);
			dtlRow.po_d_no(null);
			dtlRow.mfg_inst_no(null);
			dtlRow.purc_schd_no(null);
			dtlRow.arr_schd_no(null);
			dtlRow.purc_act_d_no(null);
			dtlRow.purc_act_d_seq(null);
			dtlRow.re_arr_flg(false);
			dtlRow.trd_unit_re_arr_qty(null);
			dtlRow.re_arr_loc_wg_cd(null);
			dtlRow.re_arr_loc_wg_nm(null);
			dtlRow.re_arr_loc_cd(null);
			dtlRow.re_arr_loc_nm(null);
			dtlRow.re_arr_str_ln_cd(null);
			dtlRow.re_arr_str_ln_nm(null);
			dtlRow.re_arr_str_ln_cd_none_flg(false);
			dtlRow.re_arr_rqst_dt(null);
			dtlRow.re_arr_rqst_hm(null);
			dtlRow.re_arr_purc_schd_dt(null);
			dtlRow.re_arr_sync_flg(false);
			dtlRow.abort_flg(false);
			dtlRow.src_base_unit_qty(null);
			dtlRow.arr_qty(null);
			dtlRow.purc_schd_qty(null);
			dtlRow.purc_qty(null);
			dtlRow.accpt_dfct_qty(null);
			dtlRow.lot_no(null);
			dtlRow.sublot_no(null);
			if (MSC_PURC_UNFIX_STR.isUNFIXED(dtlRow.gd_cd())) {
				dtlRow.gd_cd(getDefaultFeedStkGd().gd_cd());
			}
			dtlRow.purc_dtl_upd_flg(false);
			dtlRow.tax_fix_flg(false);
			dtlRow.sno1(MAC_STR.isNULL_VAL(dtlRow.sno1()) ? null : dtlRow.sno1());
			dtlRow.sno2(MAC_STR.isNULL_VAL(dtlRow.sno2()) ? null : dtlRow.sno2());
			dtlRow.sno3(MAC_STR.isNULL_VAL(dtlRow.sno3()) ? null : dtlRow.sno3());
			dtlRow.sno4(MAC_STR.isNULL_VAL(dtlRow.sno4()) ? null : dtlRow.sno4());
			dtlRow.po_print_d_rmrks(null);
			dtlRow.outsrc_flg(false);	// 計画外で外注はない
			dtlRow.ship_fr_valid_dt(null);
			dtlRow.slo_d_no(null);
			dtlRow.slo_no(null);
			dtlRow.purc_dtl_upd_flg(false);
			dtlRow.db_trd_unit_cd(null);
			dtlRow.db_trd_unit_conv_qty(null);
			dtlRow.db_trd_unit_conv_base_qty(null);
			dtlRow.db_trd_unit_dec_place(null);
			dtlRow.db_trd_unit_rnd_typ(null);
			dtlRow.db_trd_unit_qty(null);
			dtlRow.db_trd_cur_amt(null);
			dtlRow.db_trd_cur_dscnt_amt(null);
			dtlRow.db_trd_cur_onr_prov_amt(null);
			dtlRow.db_trd_cur_onr_prov_upri(null);
			dtlRow.db_trd_cur_proc_amt(null);
			dtlRow.db_trd_cur_proc_upri(null);
			dtlRow.db_trd_cur_tax_amt(null);
			dtlRow.db_trd_cur_upri(null);
			dtlRow.db_wtax_rate(null);
			dtlRow.db_tax_rate(null);
			dtlRow.db_inc_tax_flg(false);
			// 詳細
			MCList<Dtl2R> tgtDtl2L = _dtl2L.get(dtlRow.peg_no());
			for (Dtl2R ioRow : tgtDtl2L) {
				ioRow.arr_act_no(null);
				ioRow.purc_act_io_no(null);
				ioRow.lot_no(null);
				ioRow.sublot_no(null);
				if (MSC_PURC_UNFIX_STR.isUNFIXED(ioRow.gd_cd())) {
					ioRow.gd_cd(getDefaultFeedStkGd().gd_cd());
				}
				ioRow.ship_fr_valid_dt(null);
				ioRow.setStatus(MCRow.CREATE);
				
			}
		}
	}
	
	/**
	 * 画面起動時の初期値設定
	 */
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_purc_schd_dt_to, getToday());

	}
	
	/**
	 * 明細行の明細紐付NOを設定する<br>
	 * @param list 明細行リスト
	 */
	protected void setDtlPegNo(MCList<Dtl1R> list) {
		for (Dtl1R row : list) {
			setDtlPegNo(row);
		}
	}
	
	/**
	 * 明細行の明細紐付NOを設定する<br>
	 * @param row 明細行
	 */
	protected void setDtlPegNo(Dtl1R row) {
		row.peg_no(_maxDtlPegNo++);
	}
	
	/**
	 * 詳細行の受払紐付NOを設定する<br>
	 * @param list 詳細行リスト
	 */
	protected void setIoPegNo(MCList<Dtl2R> list) {
		for (Dtl2R row : list) {
			setIoPegNo(row);
		}
	}
	
	
	/**
	 * 詳細行の受払紐付NOを設定する<br>
	 * @param row 詳細行
	 * @param editDtl1 明細行の値を修正するかどうか
	 */
	protected void setIoPegNo(Dtl2R row) {
		row.peg_no(_maxIoPegNo++);
	}
	
	/**
	 * 明細紐付NO・受払紐付NOの最大値を初期化
	 */
	protected void initMaxPegNo() {
		
		// 明細枠に値のある行が存在する場合は、1に初期化するのではなく、明細行の最大値+1に初期化する
		MCList<Dtl1R> NoEmptyDtl1L = MCList.create(Dtl1R.class);
		MCList<Dtl2R> NoEmptyDtl2L = MCList.create(Dtl2R.class);
		for (Dtl1R dtlRow : getDtl1L()) {
			if (!dtlRow.isEmpty()) {
				NoEmptyDtl1L.add(dtlRow);
				NoEmptyDtl2L.addAll(_dtl2L.get(dtlRow.peg_no()));
			}
		}

		if (NoEmptyDtl1L.size() > 0) {
			_maxDtlPegNo = getMaxValue(NoEmptyDtl1L, Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(NoEmptyDtl2L, Dtl2R.$peg_no) + 1;
		}
		else {
			_maxDtlPegNo = 1;
			_maxIoPegNo = 1;
		}
		
	}

	@Override
	public void setSRCHStatus() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			setSRCH_UPDStatus();
			getCndR().purc_schd_dt_to(null);
		}
		else {
			if(Cnd_ope_REF.isSelected()) {
				getCndR().purc_schd_dt_to(null);
			}
			super.setSRCHStatus();
		}
		setSrchTgtTyp();
		
		// 検索枠の仕入実績NOにフォーカスセット
		setFocus(getCndR(), CndR.$srch_tgt_no);
		
		// ボタン・モード制御
		setBtnMode();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setSrchTgtTyp();
		
		// 仕入日・計上日・支払起算日のセット
		setValueEx(Hdr1_purc_dt, getToday());
		setValueEx(Hdr1_ac_dt, getToday());
		setValueEx(Hdr1_pay_basis_dt, getToday());
		
		// 仕入為替レートＣＤ
		getHdr1R().purc_xrate_cd(getCo().purc_xrate_cd());
		
		// 基準通貨情報の設定
		BaseCurR baseCur = getBaseCur();
		getHdr1R().base_cur_cd(baseCur.cur_cd());
		getHdr1R().base_cur_nm(baseCur.cur_nm());
		getHdr1R().base_cur_upri_dec_place(baseCur.upri_dec_place());
		getHdr1R().base_cur_amt_dec_place(baseCur.amt_dec_place());
		// 納税通貨情報の設定
		PtaxCurR ptaxCur = getPtaxCur();
		if (!isNull(ptaxCur)) {
			getHdr1R().ptax_cur_cd(ptaxCur.cur_cd());
			getHdr1R().ptax_cur_nm(ptaxCur.cur_nm());
			getHdr1R().ptax_cur_upri_dec_place(ptaxCur.upri_dec_place());
			getHdr1R().ptax_cur_amt_dec_place(ptaxCur.amt_dec_place());
		}
		
		// 検索枠の発注NOにフォーカスセット
		setFocus(getCndR(), CndR.$srch_tgt_no);
		
		getHdr1R().setStatus(NONE);
		
		// ボタン・モード制御
		setBtnMode();
		
		setSrchUpriBtnMode();
	}
	
	@Override
	public void setUPD_SCHDStatus() {
		super.setUPD_SCHDStatus();
		Dtl1Table.selectLeftmostColumn(0);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setRevNoMode();
		Dtl1Table.selectLeftmostColumn(0);
	}

	@Override
	public void setUPDStatus() {
		if (!isNull(getHdr1R().po_no())) {
			setUPD_SCHDStatus();
		}
		else {
			super.setUPDStatus();
		}
		setRevNoMode();
		setSrchUpriBtnMode();
		Dtl1Table.selectLeftmostColumn(0);
	}
	
	@Override
	public void setDELStatus() {
		if (!isNull(getHdr1R().po_no())) {
			setDEL_SCHDStatus();
		}
		else {
			super.setDELStatus();
		}
		Dtl1Table.selectLeftmostColumn(0);
	}

	/**
	 * 検索前ステータス設定<br>
	 */
	public void setSrchStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else {
			setSRCHStatus();
		}
	}
	
	/**
	 * 検索処理後のステータス制御
	 * ※SearcherのsetMode以外で呼出す想定なし
	 */
	protected void ctlStsAftrSrch() {
		
		if (Cnd_ope_INS.isSelected()) {
			setINS_SCHDStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			if (isNull(getHdr1R().po_no())) {
				setUPDStatus();
			}
			else {
				setUPD_SCHDStatus();
			}
		}
	}
	
	/**
	 * 入荷同時計上チェックボックス
	 */
	@Override
	public void doDtl1_sync_flg_NC(MCEventInfo info) {
		super.doDtl1_sync_flg_NC(info);
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		
		boolean oldVal = (boolean) info.getOldValue();		
		boolean newVal = (boolean) info.getNewValue();
		
		// チェックをＯＮからＯＦＦに変更した場合
		if (oldVal && !newVal) {
			
			if (!existsArr(dtlR)) {
				setValueEx(columnDtl1_crt_lot_flg, dtlR.getGUIIndex(), false);
				setValueEx(columnDtl1_lot_no, dtlR.getGUIIndex(), null);
				setValueEx(columnDtl1_sublot_no, dtlR.getGUIIndex(), null);
			}
			
			// 格付ＣＤ、良品区分を検索時の状態に戻す
			if (Cnd_ope_INS.isSelected()) {
				// 登録時に同時計上を変更できるのは、未入荷の場合である。未入荷の場合は在庫がないためnullにする。
				setValueEx(columnDtl1_gd_cd, dtlR.getGUIIndex(), null);
				setValueEx(columnDtl1_quality_typ, dtlR.getGUIIndex(), null);
			}
			else {
				setValueEx(columnDtl1_gd_cd, dtlR.getGUIIndex(), dtlR.old_gd_cd());
				setValueEx(columnDtl1_quality_typ, dtlR.getGUIIndex(), dtlR.old_quality_typ());
			}
			MCList<Dtl2R> ioL = _dtl2L.get(dtlR.peg_no());
			ioL.forEach(r -> {
				if (Cnd_ope_INS.isSelected()) {
					// 登録時に同時計上を変更できるのは、未入荷の場合である。未入荷の場合は在庫がないためnullにする。
					setValueEx(columnDtl2_gd_cd, r.getGUIIndex(), null);
					setValueEx(columnDtl2_quality_typ, r.getGUIIndex(), null);
				}
				else {
					// 更新時に同時計上を変更できるのは、入荷パタンが通常の場合である。検索時の状態に戻す。
					setValueEx(columnDtl2_gd_cd, r.getGUIIndex(), r.old_gd_cd());
					setValueEx(columnDtl2_quality_typ, r.getGUIIndex(), r.old_quality_typ());
				}
			});
			
			// 検収不良FLG
			for (Dtl2R r : ioL) {
				if (isNull(r.arr_act_no())) {
					setValueEx(columnDtl1_accpt_dfct_flg, dtlR.getGUIIndex(), false);
					break;
				}
			}
			
		}
		// チェックをＯＦＦからＯＮに変更した場合
		else {
			if (!isNull(dtlR.tmp_gd_cd())) {
				// 同時計上しない予定だったが、同時計上で仕入する場合
				setValueEx(columnDtl1_gd_cd, dtlR.getGUIIndex(), dtlR.tmp_gd_cd());
			}
			else {
				setValueEx(columnDtl1_gd_cd, dtlR.getGUIIndex(), dtlR.old_gd_cd());
			}
		}
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr1_latest_flg;
	}
	
	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_newest_flg;
	}
	
	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_purc_act_rev;
	}
	
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr1_can_flg;		
	}

	/**
	 * 検索対象区分を設定する
	 */
	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_PURC_SRCH_TGT_TYP.PO_NO.name());
			setValueEx(Cnd_newest_flg, false);
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			setValueEx(Cnd_newest_flg, true);
		}
	}
	
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispSrchTgtTyp());		
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}
	
	public MSC_PURC_SRCH_TGT_TYP[] getDispSrchTgtTyp() {
		
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.PO_NO
			};
		}
		else {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO
			};
		}

	}
	
	/**
	 * Panel[Btn1]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_rdel(MCEventInfo info) {

		Dtl1R dr = Dtl1Table.getSelectedMCRow();
		
		//行削除はフォーカス移動を伴うため、詳細行から先に処理すること
		
		//詳細行
		Dtl2Table.deleteRows(getDtl2L().subList(r -> {
			//削除復帰の場合は削除行を対象とする
			if (dr.isStatusDelete()) {
				return r.isStatusDelete();
			}
			//削除の場合は削除行以外を対象とする
			else {
				return !r.isStatusDelete();
			}
		}));
		_dtl2L.replace(dr.peg_no(), getDtl2L().shallowClone());
		
		//明細行
		deleteRow(Dtl1Table);
		setBtnMode();
		setDispAmt();
	}

	/**
	 * Panel[Btn1]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_rcopy(MCEventInfo info) {
		
		// コピー元行
		Dtl1R selectedRow = Dtl1Table.getSelectedMCRow();
		
		// コピー先行
		Dtl1R copyDtlRow = copyRow(Dtl1Table);
		
		if (!isNull(copyDtlRow)) {
			// 行コピーで追加された明細行に紐付NOを設定
			setDtlPegNo(copyDtlRow);
			// 仕入実績明細NO,SEQ,表示順をクリア
			copyDtlRow.clear(Dtl1R.$purc_act_d_no, Dtl1R.$purc_act_d_seq
					, Dtl1R.$disp_seq, Dtl1R.$purc_dtl_upd_flg
					, Dtl1R.$db_trd_unit_cd, Dtl1R.$db_trd_unit_conv_qty
					, Dtl1R.$db_trd_unit_conv_base_qty, Dtl1R.$db_trd_unit_dec_place
					, Dtl1R.$db_trd_unit_rnd_typ, Dtl1R.$db_trd_unit_qty
					, Dtl1R.$db_trd_cur_amt, Dtl1R.$db_trd_cur_dscnt_amt
					, Dtl1R.$db_trd_cur_onr_prov_amt, Dtl1R.$db_trd_cur_onr_prov_upri
					, Dtl1R.$db_trd_cur_proc_amt, Dtl1R.$db_trd_cur_proc_upri
					, Dtl1R.$db_trd_cur_tax_amt, Dtl1R.$db_trd_cur_upri
					, Dtl1R.$db_wtax_rate, Dtl1R.$db_tax_rate
					, Dtl1R.$db_inc_tax_flg
					);
			// 行ステータス：新規
			copyDtlRow.setStatus(CREATE);
			
			// 入荷不要の場合、仕入直送の場合のみ、同時計上をオンにする
			if (copyDtlRow.arr_skip_flg()) {
				if (copyDtlRow.purc_ddlv_flg()) {
					copyDtlRow.sync_flg(true);
				}
				else {
					copyDtlRow.sync_flg(false);
				}
			}
			
			
			// コピー元の明細行に紐付く詳細行を複製して、コピー先の明細行に紐付ける
			MCList<Dtl2R> tgtIoList = _dtl2L.get(selectedRow.peg_no());
			MCList<Dtl2R> destIoList = MCList.create(Dtl2R.class);
			if (isNull(tgtIoList)) {
				return;
			}
			for (Dtl2R ioRow : tgtIoList) {
				Dtl2R addIoRow = createDtl2R();
				MCRow.copyall(addIoRow, ioRow);
				// コピー先明細行への紐付け
				addIoRow.dtl_peg_no(copyDtlRow.peg_no());
				// 紐付NO設定
				setIoPegNo(addIoRow);
				// 入荷実績ＮＯを詳細行にコピーするか判断
				if (havPurcSchd(addIoRow)) {	
					if (Cnd_ope_UPD.isSelected()) {
						if (!isNull(ioRow.arr_act_no())) {
							if (getSrchedArrSync(addIoRow)) {
								addIoRow.arr_act_no(null);
							}
						}
					}
				}
				// 仕入実績受払NO,SEQをクリア
				addIoRow.clear(Dtl2R.$purc_act_io_no, Dtl2R.$purc_act_io_seq);
				// 行ステータスを新規
				addIoRow.setStatus(CREATE);
				
				destIoList.add(addIoRow);
			}
			if (destIoList.size() > 0) {
				_dtl2L.put(copyDtlRow.peg_no(), destIoList);
			}
			
			// 詳細枠を再表示
			showIo(copyDtlRow);
		}
		setValueForMoneyCols(getHdr1R(), copyDtlRow);
		setDispAmt();
	}

	/**
	 * 詳細行が属する明細行を取得します
	 * @param ioRow 詳細行
	 * @return 明細行
	 */
	protected Dtl1R getDtlRow(Dtl2R ioRow) {
		return getDtl1L().getFirst(Dtl1R.$peg_no, ioRow.dtl_peg_no());
	}
	
	/**
	 * 詳細行が属する明細行に仕入予定ＮＯが設定されているかチェックします
	 * @param ioRow 詳細行
	 * @return 明細行に仕入予定ＮＯが設定されている場合、trueを返します
	 */
	protected boolean havPurcSchd(Dtl2R ioRow) {
		
		if (!isNull(getDtlRow(ioRow).purc_schd_no())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 検索直後の入荷同時計上FLGを取得します
	 * @return 検索直後に明細行に設定された入荷同時計上FLG
	 */
	protected boolean getSrchedArrSync(Dtl2R ioRow) {
		return getDtlRow(ioRow).old_sync_flg();
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		
		if (table == Dtl1Table) {
			setDtlPegNo((Dtl1R)row);
		}
		
		return super.copyRowSub(table, row);
	}

	/**
	 * Panel[Btn2]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_radd(MCEventInfo info) {
		
		// 明細の選択行を取得する
		Dtl1R selDtlRow = Dtl1Table.getSelectedMCRow();
		
		// 紐付NOセット
		if (isNull(selDtlRow.peg_no())) {
			setDtlPegNo(selDtlRow);
		}
		
		// 詳細行を追加し、明細紐付NOをセットする
		Dtl2R addIoRow = insertRow(Dtl2Table);
		addIoRow.dtl_peg_no(selDtlRow.peg_no());

		// 受払紐付NOセット
		setIoPegNo(addIoRow);

		// 品目情報(非表示項目)をコピー
		if (!isNull(selDtlRow.itm_cd())) {
			copyItmInfo(selDtlRow, addIoRow);
		}

		//明細のデータを追加行に設定
		MCList<Dtl2R> addIoLst = MCList.create(Dtl2R.class);
		addIoLst.add(addIoRow);
		copyValFrDtlRowToIoList(selDtlRow, addIoLst);

		// キャッシュに格納
		MCList<Dtl2R> tgtIoList = _dtl2L.get(addIoRow.dtl_peg_no());
		if (isNull(tgtIoList)) {
			tgtIoList = MCList.create(Dtl2R.class);
		}
		tgtIoList.add(addIoRow);
		_dtl2L.put(addIoRow.dtl_peg_no(), tgtIoList);
		
	}
	
	/**
	 * Panel[Btn2]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rdel(MCEventInfo info) {
		
		Dtl2R ioRow = deleteRow(Dtl2Table);
		if (!isNull(ioRow)) {
			MCList<Dtl2R> dtl2CloneL = getDtl2L().shallowClone();
			_dtl2L.replace(ioRow.dtl_peg_no(), dtl2CloneL);
		}

	}
	
	/**
	 * Panel[Btn2]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rcopy(MCEventInfo info) {
		Dtl2R ioRow = copyRow(Dtl2Table);
		
		if (!isNull(ioRow)) {

			Dtl1R dtlRow = Dtl1Table.getSelectedMCRow();

			// 入荷実績ＮＯを詳細行にコピーするか判断
			if (havPurcSchd(ioRow)) {	
				if (Cnd_ope_UPD.isSelected()) {
					if (!isNull(ioRow.arr_act_no())) {
						if (getSrchedArrSync(ioRow)) {
							ioRow.arr_act_no(null);
						}
					}
				}
			}
			else {
				// 計画外の場合、入荷実績NOをコピーしない
				ioRow.arr_act_no(null);
			}
			
			// 仕入実績受払NOをコピーしない
			ioRow.clear(Dtl2R.$purc_act_io_no, Dtl2R.$purc_act_io_seq);
			// 紐付NO
			setIoPegNo(ioRow);

			MCList<Dtl2R> tgtIoList = _dtl2L.get(dtlRow.peg_no());
			tgtIoList.add(ioRow);
			
		}
	}
	
	/**
	 * Panel[Btn2]のボタン[upd_dtl]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_upd_dtl(MCEventInfo info) {
		_updDtlBtnExecFlg = true;
		setValueForTrdUnitCols(exceptDeleteAndViewEmpty(Dtl1Table));
		setValueForContCols(exceptDeleteAndViewEmpty(Dtl1Table));
		_updDtlBtnExecFlg = false;
	}
	
	/**
	 * Panel[Cnd]のボタン[srch_po]の押下時の処理
	 */
	@Override
	public void doCnd_srch_po(MCEventInfo info) {
		callMS_MSBDL0140_Srch01();
	}

	/**
	 * Panel[Cnd]のボタン[srch_purc]の押下時の処理
	 */
	@Override
	public void doCnd_srch_purc(MCEventInfo info) {
		callMS_MSBDL0140_Srch02();
	}
	
	/**
	 * Panel[Btn3]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0140_Ins01();
	}
	
	/**
	 * Panel[Btn3]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0140_Upd01();
	}
	
	/**
	 * Panel[Btn3]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0140_Del01();
	}
	
	/**
	 * ボタン制御
	 */
	protected void setBtnMode() {
		
		// 明細行のボタン制御
		if (getDtl1L().size() == 0) {
			// 行がない場合、行コピー・行削除を押下不可にする
			Dtl1Btn_rcopy.setMode(MCMode.DISABLE);
			Dtl1Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			// 明細行がある場合は、ステータスの設定の状態にする
			setDefaultMode(Dtl1Btn_rcopy);
			setDefaultMode(Dtl1Btn_rdel);
		}

		// 詳細行のボタン制御
		Dtl1R dtlRow  = Dtl1Table.getSelectedMCRow();
		if (isNull(dtlRow) || isSame(dtlRow.getStatus(), DELETE)) {
			Dtl2Btn_radd.setMode(MCMode.DISABLE);
			Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
			Dtl2Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if (!isNull(dtlRow.purc_schd_no())) {
			// 仕入予定のある明細行の場合は、下段での行追加を許可しない
			Dtl2Btn_radd.setMode(MCMode.DISABLE);
			setDefaultMode(Dtl2Btn_rcopy);
			setDefaultMode(Dtl2Btn_rdel);
		}
		else {
			setDefaultMode(Dtl2Btn_radd);
			setDefaultMode(Dtl2Btn_rcopy);
			setDefaultMode(Dtl2Btn_rdel);
		}
		
	}
	
	/**
	 * 部品設定
	 */
	@Override
	protected void setupParts() {
		super.setupParts();
		
		// 登録枠
		Hdr1_purc_usr_dpt_p_PPanel.setRelateBeans(Hdr1_ac_dt, Hdr1_inherited_src_no);
	
		Hdr1_xrate_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_base_cur_cd, Hdr1_purc_xrate_cd, Hdr1_purc_dt, true, Hdr1_xrate_inpt_flg, true);
		Hdr1_ptax_xrate_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_ptax_cur_cd, Hdr1_purc_xrate_cd, Hdr1_purc_dt, true, Hdr1_ptax_xrate_inpt_flg, true);
		Hdr1_trd_cur_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place);
		Hdr1_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place);
		Hdr1_sppl_addr_p_PPanel.setRelateBeans(Hdr1_in_to_id_cd, Hdr1_in_to_id_nm);
		
		// 明細枠
		Dtl1_tdlv_p_PPanel.setTdlvMode(true);
		Dtl1_itm_p_PPanel.setRelateBeans(columnDtl1_sundry_itm_flg);
		Dtl1_str_ln_p_PPanel.setRelateBeans(columnDtl1_dlv_loc_cd, columnDtl1_str_ln_tgt_flg);
		Dtl1_re_arr_str_ln_p_PPanel.setRelateBeans(columnDtl1_re_arr_loc_cd, columnDtl1_re_arr_str_ln_tgt_flg);
		Dtl1_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, 
				columnDtl1_sno1_mng_typ, columnDtl1_sno2_mng_typ, columnDtl1_sno3_mng_typ, columnDtl1_sno4_mng_typ);
		Dtl1_lot_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, 
				columnDtl1_lot_mng_typ,	columnDtl1_lot_no_typ, columnDtl1_sublot_mng_typ, columnDtl1_sublot_no_typ, true);
		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(Dtl1_itm_p_PPanel.columnItm_itm_cd, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub1, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub2, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub3,
				columnDtl1_trd_unit_cd, columnDtl1_trd_unit_dec_place,
				columnDtl1_trd_unit_rnd_typ, 
				columnDtl1_trd_unit_conv_base_qty, columnDtl1_trd_unit_conv_qty, 
				columnDtl1_base_unit_cd);
		Dtl1_trd_unit_re_arr_qty_p_PPanel.setRelateBeans(Dtl1_itm_p_PPanel.columnItm_itm_cd, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub1, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub2, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub3,
				columnDtl1_trd_unit_cd, columnDtl1_trd_unit_dec_place,
				columnDtl1_trd_unit_rnd_typ, 
				columnDtl1_trd_unit_conv_base_qty, columnDtl1_trd_unit_conv_qty, 
				columnDtl1_base_unit_cd);		
		Dtl1_base_unit_qty_p_PPanel.setRelateBeans(columnDtl1_base_unit_cd, columnDtl1_base_unit_dec_place, columnDtl1_base_unit_rnd_typ,
				columnDtl1_trd_unit_qty, columnDtl1_trd_unit_conv_base_qty, columnDtl1_trd_unit_conv_qty);

		// 取引通貨単価・金額
		Dtl1_trd_cur_upri_p_PPanel.setSchd(false);
		Dtl1_trd_cur_upri_p_PPanel.setAmtToUpri(true);
		Dtl1_trd_cur_upri_p_PPanel.setRelateBeans(
				Hdr1_trd_cur_cd, Hdr1_sppl_cd, columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, 
				columnDtl1_itm_sub3, columnDtl1_trd_unit_cd, columnDtl1_trd_unit_qty, Hdr1_trd_cur_amt_dec_place, 
				Hdr1_trd_cur_upri_dec_place, 
				Hdr1_purc_amt_rnd_typ, Hdr1_purc_tax_rnd_typ, 
				Hdr1_purc_upri_cng_flg, columnDtl1_purc_upri_cng_flg, columnDtl1_dscnt_itm_flg,
				columnDtl1_purc_schd_no,
				columnDtl1_trd_unit_conv_base_qty,
				columnDtl1_trd_unit_conv_qty,
				columnDtl1_src_trd_unit_conv_base_qty,
				columnDtl1_src_trd_unit_conv_qty,
				columnDtl1_base_unit_dec_place,
				columnDtl1_base_unit_rnd_typ
				);
		// 取引通貨加工単価・金額
		Dtl1_trd_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_upri_dec_place);
		Dtl1_trd_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place, columnDtl1_trd_unit_qty, 
				columnDtl1_trd_cur_proc_upri, Hdr1_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl1_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_upri_dec_place);
		Dtl1_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place, columnDtl1_trd_unit_qty, 
				columnDtl1_trd_cur_onr_prov_upri, Hdr1_purc_amt_rnd_typ, null);
		
		// 基準通貨単価・金額
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, columnDtl1_trd_cur_upri, Hdr1_xrate);
		Dtl1_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_dscnt_amt, Hdr1_xrate);
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_amt, Hdr1_xrate);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_inc_tax_amt, Hdr1_xrate);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd,Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_tax_amt, Hdr1_xrate);
		// 基準通貨加工単価・金額
		Dtl1_base_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, columnDtl1_trd_cur_proc_upri, Hdr1_xrate);
		Dtl1_base_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_proc_amt, Hdr1_xrate);
		// 基準通貨有償支給単価・金額
		Dtl1_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, columnDtl1_trd_cur_onr_prov_upri, Hdr1_xrate);
		Dtl1_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_trd_cur_onr_prov_amt, Hdr1_xrate);
		
		// 納税通貨単価・金額
		Dtl1_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_upri, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_dscnt_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd,Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_inc_tax_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd,Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_tax_amt, Hdr1_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl1_ptax_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_proc_upri, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_proc_amt, Hdr1_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl1_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_onr_prov_upri, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_onr_prov_amt, Hdr1_ptax_xrate);
		// 源泉税額
		Dtl1_wtax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_base_cur_amt, columnDtl1_wtax_rate, true);
		
		// 負担項目
		Dtl1_bd_p_PPanel.setRelateBeans(
				columnDtl1_asset_mng_typ,
				columnDtl1_bd_lot_mng_typ, columnDtl1_bd_sublot_mng_typ, columnDtl1_bd_sno1_mng_typ, 
				columnDtl1_bd_sno2_mng_typ, columnDtl1_bd_sno3_mng_typ, columnDtl1_bd_sno4_mng_typ);
		
		// 有効成分部品
		Dtl1_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_std_cont_fctr,
				null, columnDtl1_cont_fctr_dec_place, columnDtl1_cont_fctr_rnd_typ);
		Dtl1_std_cont_qty_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_std_cont_fctr, 
				null, columnDtl1_cont_fctr_dec_place, columnDtl1_cont_fctr_rnd_typ);
		Dtl1_purc_cont_fctr_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_purc_cont_qty,
				columnDtl1_cont_fctr_dec_place);
		
		// 詳細枠
		Dtl2_str_ln_p_PPanel.setRelateBeans(columnDtl2_dlv_loc_cd, columnDtl2_str_ln_tgt_flg);
		Dtl2_lot_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3, 
				columnDtl2_lot_mng_typ, columnDtl2_lot_no_typ, columnDtl2_sublot_mng_typ, columnDtl2_sublot_no_typ, true);
		Dtl2_trd_unit_qty_p_PPanel.setRelateBeans(Dtl2_itm_p_PPanel.columnItm_itm_cd, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub1, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub2, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub3,
				columnDtl2_trd_unit_cd, columnDtl2_trd_unit_dec_place,
				columnDtl2_trd_unit_rnd_typ, 
				columnDtl2_trd_unit_conv_base_qty, columnDtl2_trd_unit_conv_qty, 
				columnDtl2_base_unit_cd);
		Dtl2_base_unit_qty_p_PPanel.setRelateBeans(columnDtl2_base_unit_cd, columnDtl2_base_unit_dec_place);
		
		// 有効成分部品
		Dtl2_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_std_cont_fctr,
				null, columnDtl2_cont_fctr_dec_place, columnDtl2_cont_fctr_rnd_typ);
		Dtl2_std_cont_qty_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_std_cont_fctr,
				null, columnDtl2_cont_fctr_dec_place, columnDtl2_cont_fctr_rnd_typ);
		Dtl2_purc_cont_fctr_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_purc_cont_qty,
				columnDtl2_cont_fctr_dec_place);

		Dtl1_ver_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, null,
				columnDtl1_ver_flg, columnDtl1_crt_lot_flg);
		Dtl2_ver_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3, null,
				columnDtl2_ver_flg, columnDtl2_crt_lot_flg);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_purc_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_purc_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_purc_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_purc_dt);
		getDtl1_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_ac_dt);
		getDtl1_maker_cd_ListPutter().putBind(ItmDtlMakerCols.$i_master_dt, Hdr1_purc_dt);
		getDtl1_maker_cd_ListPutter().putBind(ItmDtlMakerCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_ac_dt);
		getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_purc_dt);
		
	}

	@Override
	public void layoutInit() {
		// コンテナ属性によって受領Ｉ／Ｖ登録用の項目を隠す
		MCBeans[] items = getInvisibleBeans();
		setComponentInvisibleAllStatus(items);
		setInvisibleOther();
		super.layoutInit();
	}
	/**
	 * 非表示用の項目を返す
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		List<MCBeans> l = new ArrayList<>();
		for (MCContainer c : this.getContainers()) {
			if (c instanceof MCConstRow) {
				MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
				Map<String, String> m = r.getExtMap(getInvisibleKey());
				if (m == null || m.isEmpty()) {
					continue;
				}
				for (Map.Entry<String, String> e : m.entrySet()) {
					l.add((MCBeans)this.getComponent((MCRow)c, e.getKey()));
				}
			}
			else if (c instanceof MCList) {
				MCConstRow r = (MCConstRow)((MCList)c).createRow();
				Map<String, String> m = r.getExtMap(getInvisibleKey());
				if (m == null || m.isEmpty()) {
					continue;
				}
				
				MCTable table = null;
				for (MCTable t : MCBeansUtil.getComponents(MCTable.class, this)) {
					if (t.getList() == c) {
						table = t;
						break;
					}
				}
				if (table == null) {
					continue;
				}
				
				for (Map.Entry<String, String> e : m.entrySet()) {
					for (MCColumnConfig cc : table.getColumnConfigs()) {
						if (isSame(cc.getBaseRowColumnName(), e.getKey())) {
							l.add(cc);
						}
					}
				}
			}
		}
		return l.toArray(new MCBeans[0]);
	}
	/**
	 * コンテナ属性のキーを返す
	 * @return
	 */
	protected String getInvisibleKey() {
		return "IV_ONLY_ITEM";
	}
	
	/**
	 * 枠などを独自に非表示にする
	 */
	protected void setInvisibleOther() {
		setComponentInvisibleAllStatus(Hdr2Panel);
		setComponentInvisibleAllStatus(Hdr1_sppl_show_dtl);
		setComponentInvisibleAllStatus(Dtl1Btn_open_MSBEP2240);
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(crtDtl1CellConfig());
		Dtl2Table.setCellConfig(crtDtl2CellConfig());
	}
	
	protected Dtl1CellConfig crtDtl1CellConfig() {
		return new Dtl1CellConfig();
	}
	
	protected Dtl2CellConfig crtDtl2CellConfig() {
		return new Dtl2CellConfig();
	}
	
	protected class Dtl1CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl1R dtlRow = getDtl1L().get(index);
			if (isSame(getStatus(), REF) || isSame(getStatus(), DEL) || isSame(getStatus(), DEL_SCHD)
					|| isSame(getStatus(), FIX_I) || isSame(getStatus(), FIX_U) || isSame(getStatus(), FIX_D)) {
				return super.getPriorMode(index, column, table);
			}
			
			if (Dtl1_itm_p_PPanel.isItm(column)) {
				if (!isNull(dtlRow.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlRow.purc_act_d_no())) {
					return MCMode.READ_ONLY;
				}
			}

			if (column == columnDtl1_itm_nm) {
				if (isNull(dtlRow.purc_schd_no()) && dtlRow.sundry_itm_flg()) {
					return MCMode.REQUIRED;
				}
			}
			if (column == columnDtl1_trd_cur_dscnt_amt) {
				if (isNull(dtlRow.trd_cur_upri()) || dtlRow.trd_cur_upri().isZero()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_sync_flg) {
				// 仕入予定なし(計画外)、下請対象、入荷不要
				if (isNull(dtlRow.purc_schd_no()) || getHdr1R().subcon_flg()
						|| dtlRow.arr_skip_flg()) {
					return MCMode.READ_ONLY;
				}
				else {
					// 発注あり仕入れの訂正時で、入荷パタンが未着の場合、変更不可
					if (Cnd_ope_UPD.isSelected() && MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
					// 新規登録時、既に入荷実績がある場合は変更不可
					if (Cnd_ope_INS.isSelected() 
							&& hasArrActNo(dtlRow)) {
						return MCMode.READ_ONLY;
					}
				}
				if (!isNull(dtlRow.purc_act_d_no())) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlRow.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlRow.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (dtlRow.dscnt_itm_flg() && !isDscntItmEditableColumn(column)) {
				return MCMode.READ_ONLY;
			}
			
			
			// 打切ＦＬＧ
			if (column == columnDtl1_abort_flg) {
				if (isNull(dtlRow.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl1_accpt_dfct_flg) {
				if (dtlRow.ncv_flg()) {
					return MCMode.READ_ONLY;
				}
				// 未着の検収不良は不可
				if (!dtlRow.sync_flg()) {
					if (_dtl2L.containsKey(dtlRow.peg_no())) {
						MCList<Dtl2R> dtl2L = _dtl2L.get(dtlRow.peg_no());
						for (Dtl2R r : dtl2L) {
							if (isNull(r.arr_act_no())) {
								return MCMode.READ_ONLY;
							}
						}
					}
				}
				
				// 通貨ＣＤなし
				if (isNull(getHdr1R().trd_cur_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 再入荷
			if (column == columnDtl1_re_arr_flg) {
				if (!dtlRow.accpt_dfct_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 再入荷数量・場所・納入希望日・仕入予定日
			if (column == columnDtl1_trd_unit_re_arr_qty
					|| column == columnDtl1_re_arr_loc_cd
					|| column == columnDtl1_re_arr_str_ln_cd
					|| column == columnDtl1_re_arr_str_ln_cd_none_flg
					|| column == columnDtl1_re_arr_rqst_dt
					|| column == columnDtl1_re_arr_rqst_hm
					|| column == columnDtl1_re_arr_purc_schd_dt) {

				if (!dtlRow.re_arr_flg()) {
					return MCMode.READ_ONLY;
				}

			}
			if (column == columnDtl1_re_arr_str_ln_cd) {
				if (dtlRow.re_arr_flg() && dtlRow.re_arr_str_ln_tgt_flg() && !dtlRow.re_arr_str_ln_cd_none_flg()) {
					return MCMode.REQUIRED;
				}
			}
			if (column == columnDtl1_re_arr_str_ln_cd_none_flg) {
				if (dtlRow.re_arr_flg() && dtlRow.re_arr_str_ln_tgt_flg()) {
					return MCMode.ENABLE;
				}
			}
			
			// 再入荷・入荷同時計上FLG
			if (column == columnDtl1_re_arr_sync_flg) {
				if (!dtlRow.re_arr_flg() || isNull(dtlRow.re_arr_rqst_dt()) || isNull(dtlRow.re_arr_purc_schd_dt())
						|| !isSame(dtlRow.re_arr_rqst_dt(), dtlRow.re_arr_purc_schd_dt())) {
					return MCMode.READ_ONLY;
				}
				if (getHdr1R().subcon_flg()) {
					return MCMode.READ_ONLY;
				}
				if (dtlRow.purc_ddlv_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(dtlRow.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlRow.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 再入荷仕入予定日
			if (column == columnDtl1_re_arr_purc_schd_dt) {
				if (getHdr1R().subcon_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlRow.purc_basis_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			// 納入場所, 再入荷場所
			if (column == columnDtl1_dlv_loc_cd || column == columnDtl1_re_arr_loc_cd ) {
				//仕入直送（納品先が入力されている）場合
				if (!isNull(dtlRow.scst_cd())) {
					return MCMode.READ_ONLY;
				}
				
				// 外注場所を指定した場合
				if (!isNull(dtlRow.dlv_loc_sppl_cd())) {
					if (!isNull(dtlRow.purc_schd_no())) {
						// 発注あり仕入時は常に読取専用
						return MCMode.READ_ONLY;
					}
					else {
						// 計画外時、登録以外では読取専用
						if (!Cnd_ope_INS.isSelected()) {
							return MCMode.READ_ONLY;
						}
					}
					
				}
				if (_dtl2L.containsKey(dtlRow.peg_no())) {
					if (!(_dtl2L.get(dtlRow.peg_no()).size() >= 2)) {
						return MCMode.REQUIRED;
					}
				}
				if(column == columnDtl1_dlv_loc_cd && !_dtl2L.containsKey(dtlRow.peg_no())){
					return MCMode.REQUIRED;
				}
			}
			
			// 版ＮＯ
			if (column == columnDtl1_ver_no) {
				if (_dtl2L.containsKey(dtlRow.peg_no())
					&& _dtl2L.get(dtlRow.peg_no()).size() >= 2
					&& dtlRow.ver_flg()) {
					
					// 版管理対象の品目で、明細行に紐付く詳細行が２行以上ある場合は、明細行の版ＮＯを任意入力にする
					if (isSame(getStatus(), INS) || isSame(getStatus(), INS_SCHD)
							|| isSame(getStatus(), UPD) || isSame(getStatus(), UPD_SCHD)) {
						return MCMode.ENABLE;
					}
					
				}
			}
			
			// 無償ＦＬＧ
			if (column == columnDtl1_ncv_flg) {
				if (isNull(dtlRow.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// 棚・ライン
			if (column == columnDtl1_str_ln_cd) {
				if (dtlRow.str_ln_tgt_flg() && !dtlRow.str_ln_cd_none_flg()) {
					if (_dtl2L.containsKey(dtlRow.peg_no())) {
						if (!(_dtl2L.get(dtlRow.peg_no()).size() >= 2)) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			
			// 値引理由ＣＤ
			if (column == columnDtl1_dscnt_rsn_cd) {
				if(!isNull(dtlRow.trd_cur_dscnt_amt())) {
					return MCMode.REQUIRED;
				}
			}
			
			// 仕入理由
			if (column == columnDtl1_purc_rsn_cd) {

				// 品目ＣＤが未設定
				if (isNull(dtlRow.itm_cd())) {
					return MCMode.READ_ONLY;
				}
				// 取引パタン区分が「経費購買」
				if (isPurcXpns(getHdr1R(), dtlRow)) {
					return MCMode.REQUIRED;
				}

			}
			
			if (column == columnDtl1_tax_cd ||
					column == columnDtl1_tax_fix_flg ||
					column == columnDtl1_upri_not_tgt_flg ||
					column == columnDtl1_trd_cur_upri ||
					column == columnDtl1_interim_flg ||
					column == columnDtl1_trd_cur_dscnt_amt ||
					column == columnDtl1_ptax_cur_tax_amt ||
					column == columnDtl1_ap_dpt_cd ||
					column == columnDtl1_pay_crryovr_times) {
				if (!hasCost(dtlRow)) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_upri_not_tgt_flg ||
					column == columnDtl1_interim_flg) {
				if (getHdr1R().subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 取引通貨単価、取引通貨金額、取引通貨税額
			if (column == columnDtl1_trd_cur_upri
				|| column == columnDtl1_trd_cur_amt
				|| column == columnDtl1_trd_cur_inc_tax_amt) {
				if (!dtlRow.upri_not_tgt_flg() || (!dtlRow.purc_upri_cng_flg() && !getHdr1R().purc_upri_cng_flg())) {
					return MCMode.READ_ONLY;
				}
				// 外注単価区分:加工単価+有償支給単価の場合は入力不可
				if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(dtlRow.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
				if (getHdr1R().subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 加工単価・金額、有償支給単価・金額
			if (column == columnDtl1_trd_cur_proc_upri
					|| column == columnDtl1_trd_cur_proc_amt
					|| column == columnDtl1_trd_cur_onr_prov_upri
					|| column == columnDtl1_trd_cur_onr_prov_amt) {
				if (!dtlRow.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!dtlRow.purc_upri_cng_flg() && !getHdr1R().purc_upri_cng_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!dtlRow.upri_not_tgt_flg()) {
					return MCMode.READ_ONLY;
				}
				if (getHdr1R().subcon_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 有償支給単価・有償支給金額
			if(column == columnDtl1_trd_cur_onr_prov_upri
				|| column == columnDtl1_trd_cur_onr_prov_amt) {
				if (MAC_OUTSRC_UPRI_TYP.isPROC(dtlRow.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 加工金額・有償支給金額
			if(column == columnDtl1_trd_cur_proc_amt
				|| column == columnDtl1_trd_cur_onr_prov_amt) {
				if(dtlRow.inc_tax_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl1_purc_cont_qty) {
				if (!dtlRow.sync_flg()) {
					return MCMode.READ_ONLY;
				}	
			}
			
			if (column == columnDtl1_crt_lot_flg
					|| column == columnDtl1_lot_no
					|| column == columnDtl1_sublot_no) { 
				MCList<Dtl2R> d2l = _dtl2L.get(dtlRow.peg_no());
				if (!dtlRow.sync_flg()) {
					return MCMode.READ_ONLY;
				}

				else {
					if (isNull(d2l) && _dtl2L.get(dtlRow.peg_no()).size() >= 2) {
						return MCMode.ENABLE;
					}
				}
			}
			
			if (column == columnDtl1_gd_cd) {
				// 仕入計上のみの場合、格付は入力不可
				if (!dtlRow.sync_flg()) {
					return MCMode.READ_ONLY;
				}
				// 同時計上の場合、下段が２行以上ない（１行、またはなし)場合、入力必須
				if (_dtl2L.containsKey(dtlRow.peg_no())) {
					if (!(_dtl2L.get(dtlRow.peg_no()).size() >= 2)) {
						return MCMode.REQUIRED;
					}
				}
			}
			
			if (column == columnDtl1_sno1
					|| column == columnDtl1_sno2
					|| column == columnDtl1_sno3
					|| column == columnDtl1_sno4) {
				if (!isNull(dtlRow.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl1_wtax_rate) {
				if (!canEditWtaxRate(dtlRow)) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_ship_fr_valid_dt) {
				if (!dtlRow.sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}			
			if (column == columnDtl1_bp_lot_no
					|| column == columnDtl1_bp_dlv_slip_no
					|| column == columnDtl1_bp_dlv_slip_d_no) {
				
				if (!dtlRow.sync_flg()) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(dtlRow.stk_mng_typ())
							&& !dtlRow.arr_skip_flg() && hasArrActNo(dtlRow)) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl1_bp_lot_no) {
					if (!dtlRow.bp_lot_flg()) {
						return MCMode.ENABLE;
					}
					if (_dtl2L.containsKey(dtlRow.peg_no()) && _dtl2L.get(dtlRow.peg_no()).size() >= 2) {
						return MCMode.ENABLE;
					}
				}
			}		
			
			// 購買識別区分
			if (column == columnDtl1_purc_id_typ) {
				if (!isNull(dtlRow.purc_schd_no())) {
					return MCMode.READ_ONLY;
				}
			}

			
			if (column == columnDtl1_ptax_cur_tax_amt) {
				if (isNull(getHdr1R().ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlRow.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlRow.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(getHdr1R().ptax_xrate())) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(getHdr1R().purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlRow.trd_cur_upri())
						|| dtlRow.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(getHdr1R().ptax_xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_base_cur_tax_amt) {
				if (!isNull(getHdr1R().ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlRow.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dtlRow.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(getHdr1R().purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dtlRow.trd_cur_upri())
						|| dtlRow.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(getHdr1R().xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(getHdr1R().xrate())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (Dtl1_bd_p_PPanel.isBdColumn(column)
					&& dtlRow.accpt_dfct_flg()) {
				return MCMode.READ_ONLY;
			}
			
			if (column == columnDtl1_trd_unit_qty || column == columnDtl1_trd_unit_cd) {
				if (dtlRow.sls_sync_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
			
		}

		protected boolean isDscntItmEditableColumn(MCBeans column) {
			return !(column == columnDtl1_ncv_flg ||
					column == columnDtl1_accpt_dfct_flg ||
					column == columnDtl1_trd_unit_cd ||
					column == columnDtl1_trd_unit_qty ||
					column == columnDtl1_gd_cd
					);
		}
	}

	/**
	 * 金額表示対象かどうか
	 */
	protected boolean hasCost(Dtl1R dtlR) {
		return !dtlR.ncv_flg() && !dtlR.accpt_dfct_flg();
	}
	protected class Dtl2CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl1R d1r = Dtl1Table.getSelectedMCRow();
			Dtl2R d2r = getDtl2L().get(index);
			if (d1r != null) {
				if (d1r.dscnt_itm_flg() && !isDscntItmEditableColumn(column)) {
					return MCMode.READ_ONLY;
				}
				if (column == columnDtl2_crt_lot_flg
						|| column == columnDtl2_lot_no
						|| column == columnDtl2_sublot_no
						|| column == columnDtl2_gd_cd) {
					if (!d1r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				//業者ロット、納品書、出荷元期限
				else if (column == columnDtl2_bp_lot_no) {
					if (d1r.sync_flg() && isEditableMode(column)){
						if( d1r.bp_lot_flg()) {
							//必須
						}
						else {
							return MCMode.ENABLE;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl2_bp_dlv_slip_no ||
						column == columnDtl2_bp_dlv_slip_d_no||
						column == columnDtl2_ship_fr_valid_dt) {
					if (!d1r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl2_purc_cont_qty) {
					if (!d1r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
					
				}
				
				// 納入場所が社外の場合、読取専用
				if (column == columnDtl2_dlv_loc_cd) {
					//仕入直送（納品先が入力されている）場合
					if (!isNull(d1r.scst_cd())) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(d2r.dlv_loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl2_trd_unit_qty || column == columnDtl2_trd_unit_cd) {
					if (d2r.sls_sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
			
		}

		protected boolean isDscntItmEditableColumn(MCBeans column) {
			return !(column == columnDtl2_trd_unit_cd ||
					column == columnDtl2_trd_unit_qty ||
					column == columnDtl2_gd_cd
					);
		}
	}

	/**
	 * 仕入理由のリストロジック
	 */
	@Override
	public MCList getDtl1_purc_rsn_cd(MCRow row, MCEventInfo info) {
		
		return getDtl1PurcRsnCdList(row, info);
	}
	protected MCList getDtl1PurcRsnCdList(MCRow row, MCEventInfo info) {
		Dtl1R dr = getDtl1L().get(info.getEventIndex());

		if (isPurcXpns(getHdr1R(), dr)) {
			row.setBooleanNE("xpns_purc_flg", true);
		} 
		else {
			row.setBooleanNE("not_xpns_purc_flg", true);
		}
		
		return super.getDtl1_purc_rsn_cd(row, info);
	}

	/**
	 * 購買識別区分のリストロジック
	 */
	@Override
	public MCList getDtl1_purc_id_typ(MCRow row, MCEventInfo info) {
		
		return getDtl1PurcIdTypList(row, info);
	}
	protected MCList getDtl1PurcIdTypList(MCRow row, MCEventInfo info) {
		Dtl1R dtlRow = getDtl1L().get(info.getEventIndex());
		
		MCList<MCRow> tmpL = MCList.create(MCRow.class);

		// 計画外仕入の場合は常に通常購買、または有償受給を選択可能にする
		// 発注あり仕入の場合は発注時の購買識別区分で固定
		MCList<?> l = super.getDtl1_purc_id_typ(row, info);
		if (isNull(dtlRow.purc_schd_no())) {
			for (MCRow r : l) {
				String purcIdTyp = r.getStringNE("purc_id_typ");
				if (dtlRow.dscnt_itm_flg()) {
					if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)) {
						tmpL.add(r);
					}
				}
				else {
					if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)
							|| MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp) ) {
						tmpL.add(r);
					}
				}
			}
			l = tmpL;
		}
		
		return l;
		
	}

	protected MCMessageList cmnChkDtl(Hdr1R hr, Dtl1R dr) {
		MCMessageList msgL = new MCMessageList();
		return msgL;
	}
	
	protected MCMessageList cmmChkIo(Dtl1R dr, MCList<Dtl2R> il) {
		MCMessageList msgL = new MCMessageList();
		
		// 詳細リストのＷＧ、物流グループが一致しているか
		Dtl2R preRow = null;
		for (Dtl2R r : il) {
			if (isNull(preRow)) {
				preRow = r;
			}
			else {
				if (!isSame(preRow.dlv_loc_wg_cd(), r.dlv_loc_wg_cd())
						|| !isSame(preRow.site_cd(), r.site_cd())) {
					// ＷＧＣＤまたは、物流倉庫ＣＤが異なる詳細行が存在する場合エラーにする
					msgL.add(new MCMessage(dr, Dtl1R.$dlv_loc_wg_cd, MSBDP0032, toDispGUIIndex(r)));
					break;
				}
			}
		}
		// 棚・ラインの必須チェック
		for (Dtl2R r : il) {
			if (r.str_ln_tgt_flg() && isNull(r.str_ln_cd()) && !r.str_ln_cd_none_flg()) {
				msgL.add(FXUCP_ValidaterUtil.msgNoDataAtReq(
						r,
						Dtl2R.$str_ln_cd,
						columnDtl2_str_ln_cd.getMessageByLocale(),
						r.getGUIIndex()));
			}
		}
		
		return msgL;
	}
	
	/**
	 * 直納区分を取得します
	 */
	protected String getDrctDlvTyp(Dtl1R dtlR) {
		if (!isNull(dtlR.drct_dlv_typ())) {
			return dtlR.drct_dlv_typ();
		}
		if (isNullAnd(dtlR.dlv_loc_sppl_cd(), dtlR.scst_cd())) {
			return MSC_DRCT_DLV_TYP.VIA.value();
		}
		else {
			return MSC_DRCT_DLV_TYP.DDLV.value();
		}
	}
	/**
	 * 経費購買か否かを判定します
	 * @param r
	 * @return
	 */
	protected boolean isPurcXpns(Hdr1R hdrR, Dtl1R dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(hdrR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	
	@Override
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(getHdr1R().trd_ptn_typ())) {
			row.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
		}
		return super.getDtl1_itm_p_PPanel_columnItm_itm_cd(row, info);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl1_itm_cd) {
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(getHdr1R().trd_ptn_typ())) {
				bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
			}
		}
		else if (beans == columnDtl1_dlv_loc_cd || beans == columnDtl1_re_arr_loc_cd) {
				setLocBind(bind, eventIndex, Dtl1Table);
		}
		else if (beans == columnDtl2_dlv_loc_cd) {
			setLocBind(bind, eventIndex, Dtl2Table);
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);

	}
	@Override
	public MCList getDtl1_dlv_loc_cd(
			MCRow row,
			MCEventInfo info) {
		setLocBind(row, info.getEventIndex(), Dtl1Table);
		return super.getDtl1_dlv_loc_cd(row, info);
	}

	@Override
	public MCList getDtl2_dlv_loc_cd(
			MCRow row,
			MCEventInfo info) {
		setLocBind(row, info.getEventIndex(), Dtl2Table);
		return super.getDtl1_dlv_loc_cd(row, info);
	}
	protected void setLocBind(MCRow row, int eventIndex, MCTable table) {
		if (table == Dtl1Table) {
			Dtl1R r = getDtl1L().get(eventIndex);
			//予定引継ぎの場合の場所の制限
			if (hasSchd(r) && isNull(r.dlv_loc_sppl_cd())) {
				row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
			}
		}
		else if (table == Dtl2Table) {
			Dtl1R r = Dtl1Table.getSelectedMCRow();
			//予定引継ぎの場合の場所の制限
			if (hasSchd(r) && isNull(r.dlv_loc_sppl_cd())) {
				row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
			}
		}
	}

	@Override
	public void setFocus(MCMessage msg) {
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Dtl2R) {
			for (Dtl1R r : getDtl1L()) {
				if (isSame(((Dtl2R) msg.getCauseRow()).dtl_peg_no(), r.peg_no())) {
					Dtl1Table.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

	@Override
	public void doDtl1_purc_rsn_cd_LC(MCEventInfo info) {
		super.doDtl1_purc_rsn_cd_LC(info);
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if (!dtlR.xpns_purc_flg()) {
			Dtl1_bd_p_PPanel.clearBdItem(info.getEventIndex());
		}
	}
	
	protected void setCrtLotFlg(MCList<Dtl1R> dtl1L, MCList<Dtl2R> dtl2L) {
		MCIndexKey key = dtl2L.createIndex(Dtl2R.$dtl_peg_no);
		for (Dtl1R dtl1R : dtl1L) {
			dtl1R.crt_lot_flg(getDefCrtLotFlg(dtl1R));
			MCList<Dtl2R> subDtl2L = dtl2L.subList(key, dtl1R.peg_no());
			for (Dtl2R dtl2R : subDtl2L) {
				dtl2R.crt_lot_flg(getDefCrtLotFlg(dtl1R, dtl2R));
			}
		}
	}

	protected boolean getDefCrtLotFlg(Dtl1R r, Dtl2R r2) {
		if (isNull(r.itm_cd())) {
			return false;
		}
		if (!existsArr(r) && !r.sync_flg()) {
			return false;
		}
		return MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ()) && isNull(r2.lot_no());
	}

	protected boolean getDefCrtLotFlg(Dtl1R r) {
		if (isNull(r.itm_cd())) {
			return false;
		}
		if (!existsArr(r) && !r.sync_flg()) {
			return false;
		}
		return MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ()) && isNull(r.lot_no());
	}

	protected boolean existsArr(Dtl1R r) {
		return !isSame(r.arr_qty(), MCNumber.ZERO);
	}
	protected boolean hasArrActNo(Dtl1R dtl1R) {
		if (_dtl2L.containsKey(dtl1R.peg_no())) {
			MCList<Dtl2R> dtl2L = _dtl2L.get(dtl1R.peg_no());
			for (Dtl2R r : dtl2L) {
				if (!isNull(r.arr_act_no())) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return Hdr1_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}
	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {
		// 参照新規時
		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())
				&& isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isREFStatus(bfSt)) {
			boolean canRefToInsFlg = true;
			for (Dtl1R dtlR : getDtl1L()) {
				if (dtlR.outsrc_flg()) {
					canRefToInsFlg = false;
					dialog(MSBDP0012);
					break;
				}
			}
			if (!canRefToInsFlg) {
				return false;
			}
		}
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}

}