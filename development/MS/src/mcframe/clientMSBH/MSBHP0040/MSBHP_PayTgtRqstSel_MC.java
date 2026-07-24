package mcframe.clientMSBH.MSBHP0040;

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
import mcframe.clientFXUC.FXUCP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0010.*;
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
import mcframe.clientFXBA.FXBAP0010.FXBAP_PagingParam;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_PayTgtRqstSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PayTgtRqstSel_MC extends MSBHP_PayTgtRqstSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	//遷移元画面
	protected IfPayRqstBase _parentScr;
	//まとめ可能リスト
	protected String[] _hdrCols;
	//ページング情報
	FXBAP_PagingParam _rsltPp = null;
	//親画面から遷移時に支払予定管理先が指定されているか
	protected boolean _cndBsppl = false;
	/** 呼び出し元画面（キャッシュ用） */
	protected String _openTyp = null;
	/** 呼び出し元から渡された検索条件（キャッシュ用） */
	protected MCRow _bind = null;
	/** 呼び出し元から渡されたその他パラメータ（キャッシュ用） */
	protected Object[] _args = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PayTgtRqstSel_MC() {
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
	public MSBHP_PayTgtRqstSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0040_Srch01Caller<P extends MSBHP_PayTgtRqstSel, B extends MS_MSBHL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			// 「次へ」「前へ」の通信処理を同期処理にします。
			if (!isNewSrch()) {
				setScreenAsync(false);
			}
		}
		@Override
		protected boolean isDownBlockChanged() {
			if (isNewSrch()) {
				super.isDownBlockChanged();
			}
			return false;
		}
		@Override
		protected void clear() {
			super.clear();
			// 検索前に退避用非表示リストをクリアします。
			if (isNewSrch()) {
				getRslt_SubL().clear();
			}
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			setUpdModeFlg();
		}
		/**
		 * upd_mode_flgを設定する。
		 */
		protected void setUpdModeFlg() {
			if (isSelectedUpd()) {
				bridge.up0().upd_mode_flg(true);
			}
			else {
				bridge.up0().upd_mode_flg(false);
			}
			setUp1(bridge.up1());
		}
		/**
		 * up1にrowを追加する。
		 */
		protected void setUp1(MCList<RqstNoCndR> list) {
			String[] arr = _parentScr.getExceptPayRqstNoArr();

			for (String rqstNo : arr) {
				RqstNoCndR r = RqstNoCndR.create();
				r.ap_d_no(rqstNo);
				list.add(r);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_pay_schd_dt_fr, Cnd_pay_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_bsppl_cl_dt_fr, Cnd_bsppl_cl_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_act_dt_fr, Cnd_act_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			if (!isNewSrch()) {
				replaceRslt(bridge.down0());
			}
			
			Boolean paySpotFlg = bridge.up0().m_pay_spot_flg();
			if (isSelectedUpd()) {
				paySpotFlg = bridge.up0().pay_spot_flg();
			}
			
			for (RsltR r : bridge.down0()) {
				r.add_flg(true);
				r.pay_spot_flg(paySpotFlg);
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (!isNewSrch()) {
				return;
			}
			setRefStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			Paging_paging_PPanel.dispUpdate();
		}
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			Paging_paging_PPanel.dispUpdate();
		}
		/**
		 * 非表示リストに格納した行を再表示しようとしたとき、表示行を非表示リストの内容に差し替える
		 * @param rsltL
		 */
		protected void replaceRslt(MCList<RsltR> rsltL) {
			for (RsltR rsltR : rsltL) {
				RsltR rsltSubR = getRslt_SubL().getFirst(RsltR.$row_num, rsltR.row_num());
				if (!isNull(rsltSubR)) {
					int guiIndex = rsltR.getGUIIndex();
					MCRow.copyall(rsltR, rsltSubR);
					rsltR.setGUIIndex(guiIndex);
				}
			}
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		// 検索時のページング対象指定
		setPagingParam(_rsltPp);
		callMS_MSBHL0040_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			row.check(true);
			row.setStatus(Status.MODIFY);
		}
		copyRsltSub();
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			row.check(false);
		}
		copyRsltSub();
	}
	/**
	 * Panel[Btn]のボタン[rgst]の押下時の処理
	 */
	@Override
	public void doBtn_rgst(MCEventInfo info) {
		MCList<RsltR> list = getRslt_SubL().subList(RsltR.$check, true);
		if (list.size() < 1) {
			throw new MCAppException(msgNoCheckedRow());
		}
		chkCollect(list);
		setParentList();
		requestCloseWindow();
	}
	
	/**
	 * まとめ不可能な買掛明細が選択されている場合、
	 * MCAppExceptionをthrowする。
	 */
	protected void chkCollect(MCList<RsltR> list) {
		RsltR base = list.get(0);
		String[] reqHdrCols = null;
		
		if (!base.pay_spot_flg()) {
			reqHdrCols = getReqHdrCols1();
		} else if (MAC_STR.isNULL_VAL(base.rcpt_iv_mng_no())){
			reqHdrCols = getReqHdrCols2();
		} else {
			reqHdrCols = getReqHdrCols3();
		}
		
		for (RsltR r : list) {
			if (!isColSame(base, r, reqHdrCols)) {
				throw new MCAppException(r, null, MSBHP0009);
			}
		}
	}
	
	/**
	 * 親画面に反映するための処理を実行する。
	 */
	protected void setParentList() {
		List<IfPayRqstBaseRow> list = new ArrayList<IfPayRqstBaseRow>();
		
		for (RsltR r : getRslt_SubL().subList(RsltR.$check, true)) {
			list.add(r);
		}

		if (isSelectedIns()) {
			_parentScr.addPayRqstListIns(list);
		}
		else if (isSelectedUpd()) {
			_parentScr.addPayRqstListUpd(list);
		}
	}
	
	/**
	 * ボタンコンテナの初期化処理
	 */
	protected void btnContainerInit() {
		BtnR r = getBtnR();
		r.collect_flg(true);
	}
	
	// /////////////////////モード設定/////////////////////	
	@Override
	public void setSRCH_INSStatus() {
		super.setSRCH_INSStatus();
		if (_cndBsppl) {
			Cnd_bsppl_cd.setMode(MCMode.READ_ONLY);
		}
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 種別に応じてSRCHステータスを切り替える
	 */
	protected void setSrchStatus() {
		if (isSelectedIns()) {
			setSRCH_INSStatus();
		}
		else if (isSelectedUpd()) {
			setSRCH_UPDStatus();
		}
	}
	
	@Override
	public void setREF_INSStatus() {
		super.setREF_INSStatus();
		if (_cndBsppl) {
			Cnd_bsppl_cd.setMode(MCMode.READ_ONLY);
		}
		RsltTable.selectLeftmostColumn(0);
	}


	@Override
	public void setREF_UPDStatus() {
		super.setREF_UPDStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	
	/**
	 * 種別に応じてREFステータスを切り替える
	 */
	protected void setRefStatus() {
		if (isSelectedIns()) {
			setREF_INSStatus();
		}
		else if (isSelectedUpd()) {
			setREF_UPDStatus();
		}
	}
	
	/**
	 * 登録する種別を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedIns() {
		return Cnd_ope_INS.isSelected();
	}
	
	/**
	 * 訂正する種別を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedUpd() {
		return Cnd_ope_UPD.isSelected();
	}
	
	// /////////////////////画面遷移設定/////////////////////

	/**
	 * <P>
	 * <li>起動タイプ：T1 <br>
	 * バインド値 ＜任意＞<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>bsppl_cd</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>bsppl_dpt_cd</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * </table><br>
	 * その他の引数：argsの第一要素に呼び出し元画面のインスタンスを設定すること<br>
	 * 新規モードで起動する。
	 * </li>
	 * <li>起動タイプ：T2 <br>
	 * バインド値 ＜必須＞<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>bsppl_cd</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <tr>
	 * <td>bsppl_dpt_cd</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>trd_cur_cd</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <tr>
	 * <td>purc_act_no</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>rcpt_iv_no</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <td>rcpt_iv_mng_no</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>wrk_no</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>bsppl_cl_dt_to</td>
	 * <td>MCDate</td>
	 * <td>任意</td>
	 * </tr>
	 * <td>pay_spot_flg</td>
	 * <td>Boolean</td>
	 * <td>任意</td>
	 * </tr>
	 * </table><br>
	 * その他の引数：argsの第一要素に呼び出し元画面のインスタンスを設定すること<br>
	 * 更新モードで起動する。
	 * </li>
	 * </P>
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		
		// OpenTypeの記憶
		if ( this._openTyp == null ) {
			this._openTyp = openTyp;
		}
		// 検索条件などをキャッシュする。
		if (this._bind == null) {
			this._bind = bind;
		}
		if (this._args == null) {
			this._args = args;
		}
		
		// 親画面の支払予定管理先が指定されていた場合_cndBspplにtrueをセットする。
		if (!isNull(this._bind.getString("bsppl_cd"))) {
			_cndBsppl = true;
		}
		
		// 初期化処理
		valueInit();
		
		// 支払予定管理先は必須なので、値が入っていたら検索する。
		if (!isNull(getCndR().bsppl_cd())) {
			addDoBehind(Ctrl_ctrl_PPanel.Ope_srch);
		}
	}
	
	/**
	 * 親画面をインスタンス変数に格納する。
	 * @param args
	 */
	protected void setParentScr(Object... args) {
		if (args[0] instanceof IfPayRqstBase) {
			_parentScr = (IfPayRqstBase)args[0];
		}
		else {
			throw new MCAppException(msgUnknownClass(args[0]));
		}
	}
	
	protected void setBindToDisp(MCRow bind) {
		
		if (isSame(this._openTyp, T1)) {
			setBindIns(bind.getStringNE("bsppl_cd"), 
					bind.getStringNE("bsppl_dpt_cd"));
		} else {
			setBindUpd(bind.getString("bsppl_cd"), 
					bind.getStringNE("bsppl_dpt_cd"), 
					bind.getString("trd_cur_cd"),
					bind.getStringNE("purc_act_no"),
					bind.getStringNE("rcpt_iv_no"),
					bind.getStringNE("rcpt_iv_mng_no"),
					bind.getStringNE("wrk_no"),
					bind.getDateNE("bsppl_cl_dt_to"),
					bind.getBoolean("pay_spot_flg"));
		}
		
	}
	
	/**
	 * 種別：登録する
	 * バインド値を検索条件のコンテナに設定する。
	 * @param bSpplCd
	 * @param bspplDptCd
	 */
	protected void setBindIns(String bSpplCd, String bspplDptCd) {
		setValueEx(Cnd_bsppl_cd, bSpplCd);
		setValueEx(Cnd_bsppl_dpt_cd, bspplDptCd);
	}
	
	/**
	 * 種別：訂正する
	 * バインド値を検索条件のコンテナに設定する。
	 * @param bSpplCd
	 * @param bspplDptCd
	 * @param trdCurCd
	 * @param purcActNo
	 * @param rcptIvNo
	 * @param rcptIvMngNo
	 * @param wrkNo
	 * @param bspplClDtTo
	 * @param paySpotFlg
	 */
	protected void setBindUpd(String bSpplCd, String bspplDptCd, String trdCurCd,
			String purcActNo, String rcptIvNo, String rcptIvMngNo, String wrkNo, MCDate bspplClDtTo,
			Boolean paySpotFlg) {
		setValueEx(Cnd_bsppl_cd, bSpplCd);
		setValueEx(Cnd_bsppl_dpt_cd, bspplDptCd);
		setValueEx(Cnd_trd_cur_cd, trdCurCd);
		setValueEx(Cnd_wrk_no, wrkNo);
		setValueEx(Cnd_bsppl_cl_dt_to, bspplClDtTo);
		setValueEx(Cnd_pay_spot_flg, paySpotFlg);
		if (!paySpotFlg) {
			setValueEx(Cnd_purc_act_no, null);
			setValueEx(Cnd_rcpt_iv_no, null);
			setValueEx(Cnd_rcpt_iv_mng_no, null);
		} else if (isNullOrNullVal(rcptIvMngNo)) {
			setValueEx(Cnd_purc_act_no, purcActNo);
			setValueEx(Cnd_rcpt_iv_no, null);
			setValueEx(Cnd_rcpt_iv_mng_no, null);
		} else {
			setValueEx(Cnd_purc_act_no, null);
			setValueEx(Cnd_rcpt_iv_no, rcptIvNo);
			setValueEx(Cnd_rcpt_iv_mng_no, rcptIvMngNo);
		}
	}
	
	//********************** 画面起動時の初期設定 **************************
	@Override
	protected void setupParts() {
		super.setupParts();
		// 検索
		Cnd_max_amt_p_PPanel.setRelateBeans(Cnd_trd_cur_cd, Cnd_trd_cur_amt_dec_place);
		
		// 一覧
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_proc_amt, columnRslt_xrate);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_onr_prov_amt, columnRslt_xrate);
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		
		Rslt_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		setPaginParam();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		btnContainerInit();
		setParentScr(this._args);

		// 起動オプションチェック
		if (isSame(this._openTyp, T1)) {
			Cnd_ope_Group.setValue(Cnd_ope_INS.getActionCommand());
		} else {
			Cnd_ope_Group.setValue(Cnd_ope_UPD.getActionCommand());
		}
		
		setSrchStatus();
		setUserSrchCnd();
		
		setBindToDisp(this._bind);
	}
	
	/**
	 * ページング情報をページング部品に設定
	 */
	protected void setPaginParam() {
		// ページング対象の通信処理クラスとブロックを指定してページング情報を作成
		Class clazz =  createMS_MSBHL0040_Srch01().getClass();
		_rsltPp = new FXBAP_PagingParam(getBlockId(getRsltL()), clazz);
		// 対象とするページング情報をページング部品に設定
		Paging_paging_PPanel.setPagingParam(_rsltPp);
	}
	
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
		protected String getRowNumberColumnValue(int index,
				MCColumnConfig column, MCTable<?> table, boolean selected) {
			// 一覧テーブルの行番号として、全体の行番号を格納する項目の値を返す	
			return getRsltL().get(index).row_num().toString();
		}
	}
	// /////////////////////まとめ/////////////////////
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		
		RsltR r = getRsltL().get(info.getEventIndex());
		if (getBtnR().collect_flg()) {
			selectSameHeader(r, RsltTable.getViewRows());
			selectSameHeader(r, getRslt_SubL());
		}
		copyRsltSub();
	}
	
	@Override
	public void doBtn_collect_same_dt_flg_NC(MCEventInfo info) {
		super.doBtn_collect_same_dt_flg_NC(info);
	}

	/**
	 * 指定された行とまとめ可能な行を選択する。<br>
	 * それ以外の行の選択を解除する。
	 * 
	 * @param r 選択チェックのイベントを起こした行
	 * @see #hdrCols()
	 */
	protected void selectSameHeader(RsltR r, MCList<RsltR> list) {
		for (RsltR data : list) {
			//イベントを起こした行は評価しない
			if (!(isSame(r.getGUIIndex(), data.getGUIIndex())
					&& isSame(r.row_num(), data.row_num()))) {
				if (r.check()) {
					if (!r.pay_spot_flg()) {
						if (isColSame(r, data, getHdrCols1())) {
							data.check(true);
						}
						else {
							data.check(false);
						}
					} else if (MAC_STR.isNULL_VAL(r.rcpt_iv_mng_no())){
						if (isColSame(r, data, getHdrCols2())) {
							data.check(true);
						}
						else {
							data.check(false);
						}
					} else {
						if (isColSame(r, data, getHdrCols3())) {
							data.check(true);
						}
						else {
							data.check(false);
						}
					}
				} else {
					if (!r.pay_spot_flg()) {
						if (isColSame(r, data, getHdrCols1())) {
							data.check(false);
						}
					} else if (MAC_STR.isNULL_VAL(r.rcpt_iv_mng_no())){
						if (isColSame(r, data, getHdrCols2())) {
							data.check(false);
						}
					} else {
						if (isColSame(r, data, getHdrCols3())) {
							data.check(false);
						}
					}
				}
				
				if (data.check() && data.isStatusNone()) {
					data.setStatus(Status.MODIFY);
				}
			}
		}
	}
	
	/**
	 * まとめ可能な項目名リストを返す。
	 * 選択した行の都度支払がオフのとき
	 * @return
	 */
	protected String[] getHdrCols1() {
		setHdrCols1();
		return _hdrCols;
	}
	
	/**
	 * まとめ可能な項目名リストを返す。
	 * 選択した行の都度支払がオンかつ受領Ｉ／Ｖ管理ＮＯがＮＵＬＬ文字のとき
	 * @return
	 */
	protected String[] getHdrCols2() {
		setHdrCols2();
		return _hdrCols;
	}
	
	/**
	 * まとめ可能な項目名リストを返す。
	 * 選択した行の都度支払がオンかつ受領Ｉ／Ｖ管理ＮＯがＮＵＬＬ文字でないとき
	 * @return
	 */
	protected String[] getHdrCols3() {
		setHdrCols3();
		return _hdrCols;
	}
	
	/**
	* まとめ可能な項目名リストを設定する。
	*/
	protected void setHdrCols1() {
		if (getBtnR().collect_same_dt_flg()) {
			_hdrCols = new String[]{
					RsltR.$bsppl_cd,
					RsltR.$trd_cur_cd,
					RsltR.$wrk_no,
					//ここまでgetReqHdrCols1と同様。
					RsltR.$pay_schd_dt,
					RsltR.$bsppl_cl_dt
			};
		}
		else {
			_hdrCols = getReqHdrCols1();
		}
	}
	protected String[] getReqHdrCols1() {
		return new String[]{
				RsltR.$bsppl_cd,
				RsltR.$trd_cur_cd,
				RsltR.$wrk_no
		};
	};
	
	protected void setHdrCols2() {
		if (getBtnR().collect_same_dt_flg()) {
			_hdrCols = new String[]{
					RsltR.$bsppl_cd,
					RsltR.$trd_cur_cd,
					RsltR.$wrk_no,
					RsltR.$purc_act_no,
					//ここまでgetReqHdrCols2と同様。
					RsltR.$pay_schd_dt,
					RsltR.$bsppl_cl_dt
			};
		}
		else {
			_hdrCols = getReqHdrCols2();
		}
	}
	protected String[] getReqHdrCols2() {
		return new String[]{
				RsltR.$bsppl_cd,
				RsltR.$trd_cur_cd,
				RsltR.$wrk_no,
				RsltR.$purc_act_no
		};
	};
	
	protected void setHdrCols3() {
		if (getBtnR().collect_same_dt_flg()) {
			_hdrCols = new String[]{
					RsltR.$bsppl_cd,
					RsltR.$trd_cur_cd,
					RsltR.$wrk_no,
					RsltR.$rcpt_iv_mng_no,
					//ここまでgetReqHdrCols3と同様。
					RsltR.$pay_schd_dt,
					RsltR.$bsppl_cl_dt
			};
		}
		else {
			_hdrCols = getReqHdrCols3();
		}
	}
	protected String[] getReqHdrCols3() {
		return new String[]{
				RsltR.$bsppl_cd,
				RsltR.$trd_cur_cd,
				RsltR.$wrk_no,
				RsltR.$rcpt_iv_mng_no
		};
	};
	
	// /////////////////////ページング/////////////////////
	@Override
	public void callPagingSearcher(FXBAP_PanelBase eventPanel) {
		super.callPagingSearcher(eventPanel);
		if (eventPanel == Paging_paging_PPanel) {
			callMS_MSBHL0040_Srch01();
		}
	}
	@Override
	public boolean isPagingAgentHolder() {
		return true;
	}
	/**
	 * 変更のあった行を非表示リストにコピーする
	 */
	protected void copyRsltSub() {
		MCList<RsltR> changed = getRsltL().statusChangedList();
		for (RsltR row : changed) {
			// 既に同じ行が非表示リストに存在する場合
			if (getRslt_SubL().subList(RsltR.$row_num, row.row_num()).size() > 0) {
				MCRow.copyall(getRslt_SubL().getFirst(RsltR.$row_num, row.row_num()), row);
			}
			// 同じ行が非表示リストに存在しない場合	
			else {
				RsltR rsltR = RsltR.create();
				MCRow.copyall(rsltR, row);
				getRslt_SubL().add(rsltR);
			}
		}
	}

}