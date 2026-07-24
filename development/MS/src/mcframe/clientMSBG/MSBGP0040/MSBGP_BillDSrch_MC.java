package mcframe.clientMSBG.MSBGP0040;

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

import mcframe.clientFXUC.FXUCP0130.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0010.*;
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
import mcframe.clientFXBA.FXBAP0010.FXBAP_PagingParam;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_BillDSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_BillDSrch_MC extends MSBGP_BillDSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillDSrch_MC() {
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
	public MSBGP_BillDSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Srch01Caller<P extends MSBGP_BillDSrch, B extends MS_MSBGL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {

			// 請求管理ＮＯ に値がある場合は画面遷移時の検索のため請求書Ｎｏがnullの場合も検索する
			if (!isNull(getCndR().bill_mng_no())) {
				Cnd_bill_no.setMode(MCMode.ENABLE);
			}

			super.checkReq(msgList);

			// 請求管理ＮＯ に値がある場合は変更した請求管理Ｎｏのステータスを元に戻す
			if (!isNull(getCndR().bill_mng_no())) {
				Cnd_bill_no.setMode(Cnd_bill_no.getMode());
			}
		}

		@Override
		protected void clear() {
			super.clear();
			
			if (isNewSrch()) {
				getDtl1_SubL().clear();
			}
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			if (!isNewSrch()) {
				copyDtlSub();
			}
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			// 「次へ」「前へ」ボタン押下時
			if (!isNewSrch()) {

				for (Dtl1R dtl1R : bridge.down1()) {
					Dtl1R dtlSubR = getDtl1_SubL().getFirst(Dtl1R.$row_num, dtl1R.row_num());
					if (!isNull(dtlSubR)) {
						int guiIndex = dtl1R.getGUIIndex();
						MCRow.copyall(dtl1R, dtlSubR);
						dtl1R.setGUIIndex(guiIndex);
					}
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			
			if (!isNewSrch()) {
				getCndR().bill_no(MAC_STR.isNULL_VAL(bridge.down0().bill_no()) ? null : bridge.down0().bill_no()); // NULL文字の置き換え
			}

		}

		@Override
		protected void setMode() {
			super.setMode();

			if (!isNewSrch()) {
				return;
			}
			
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setDELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();

			if (!isNewSrch()) {
				return;
			}

			if (getDtl1L().size() > 0) {
				Dtl1Table.selectLeftmostColumn(0);
			}
			else if (getDtl2L().size() > 0) {
				Dtl2Table.selectLeftmostColumn(0);
			}
			else {
				CndPanel.focusFirstComponent();
			}

		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSRCHStatus();
			getCndR().bill_mng_no(null); // 画面遷移の際にセットされている請求管理ＮＯをクリア
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();

			Dtl1_Btn_paging_PPanel.dispUpdate();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();

			Dtl1_Btn_paging_PPanel.dispUpdate();
			
			if (isNewSrch()) {
				// 入金枠が3行になるための調整
				getSplitPane(Dtl1Panel).setDividerLocation(0.65);
			}
		}

		@Override
		protected void initCaller() {
			super.initCaller();
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
		
		
	}

	/**
	 * [MS_MSBGL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Upd01Caller<P extends MSBGP_BillDSrch, B extends MS_MSBGL0040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0040_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			copyDtlSub();

			for (Dtl1R row : getDtl1_SubL()) {	
				row.setGUIIndex(row.row_num().intValue() - 1);
			}

			getRsltL().clear();
			addAll(getRsltL(), getDtl1_SubL().subList(Dtl1R.$check, true), createMap_RsltR_Dtl1R());
			addAll(getRsltL(), getDtl2L().subList(Dtl2R.$check, true), createMap_RsltR_Dtl2R());
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			
			msgList.addAll(panel.checkReq(getDtl1L().subList(Dtl1R.$check, true), getDtl2L().subList(Dtl2R.$check, true)));
			
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

		protected Map_RsltR_Dtl1R<RsltR,Dtl1R> createMap_RsltR_Dtl1R() {
			return new Map_RsltR_Dtl1R<RsltR, Dtl1R>();
		}
		public class Map_RsltR_Dtl1R<D extends RsltR, S extends Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RsltR.$row_num, Dtl1R.$row_num);
				addColumnPathMap(RsltR.$bill_d_typ, Dtl1R.$bill_d_typ);
				addColumnPathMap(RsltR.$act_no, Dtl1R.$act_no);
				addColumnPathMap(RsltR.$act_rev, Dtl1R.$act_rev);
				addColumnPathMap(RsltR.$act_seq, Dtl1R.$act_seq);
				addColumnPathMap(RsltR.$act_d_no, Dtl1R.$act_d_no);
				addColumnPathMap(RsltR.$act_d_seq, Dtl1R.$act_d_seq);
				addColumnPathMap(RsltR.$bill_crryovr_times, Dtl1R.$bill_crryovr_times);
				addColumnPathMap(RsltR.$bill_mng_no, Dtl1R.$bill_mng_no);
				addColumnPathMap(RsltR.$bill_d_no, Dtl1R.$bill_d_no);
				addColumnPathMap(RsltR.$upd_cntr, Dtl1R.$upd_cntr);

			}
		}

		protected Map_RsltR_Dtl2R<RsltR,Dtl2R> createMap_RsltR_Dtl2R() {
			return new Map_RsltR_Dtl2R<RsltR, Dtl2R>();
		}
		public class Map_RsltR_Dtl2R<D extends RsltR, S extends Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RsltR.$bill_d_typ, Dtl2R.$bill_d_typ);
				addColumnPathMap(RsltR.$act_no, Dtl2R.$act_no);
				addColumnPathMap(RsltR.$act_rev, Dtl2R.$act_rev);
				addColumnPathMap(RsltR.$act_seq, Dtl2R.$act_seq);
				addColumnPathMap(RsltR.$act_d_no, Dtl2R.$act_d_no);
				addColumnPathMap(RsltR.$act_d_seq, Dtl2R.$act_d_seq);
				addColumnPathMap(RsltR.$bill_crryovr_times, Dtl2R.$bill_crryovr_times);
				addColumnPathMap(RsltR.$bill_mng_no, Dtl2R.$bill_mng_no);
				addColumnPathMap(RsltR.$bill_d_no, Dtl2R.$bill_d_no);
				addColumnPathMap(RsltR.$upd_cntr, Dtl2R.$upd_cntr);

			}
		}
	}

	/**
	 * [MS_MSBGL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Del01Caller<P extends MSBGP_BillDSrch, B extends MS_MSBGL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBGL0040_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			getCndR().bill_mng_no(null);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}
	}

	/**
	 * [MS_MSBGL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Prnt01Caller<P extends MSBGP_BillDSrch, B extends MS_MSBGL0040_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBGL0040_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
		
		@Override
		protected void showEndMsg() {
			if (getHdrR().edi_flg()) {
				panel.dialog(new MCMessage(MSLAL0761));
			}
		}

		@Override
		protected void showNoDownPrintDataMsg() {
			if (getHdrR().edi_flg()) {
				panel.dialog(new MCMessage(MSLAL0761));
			}
			else {
				super.showNoDownPrintDataMsg();
			}
		}
	}

	/**
	 * 変更のあった行を非表示リストにコピーする
	 */
	protected void copyDtlSub() {
		MCList<Dtl1R> changed = getDtl1L().statusChangedList();
		for (Dtl1R row : changed) {
			// 既に同じ行が非表示リストに存在する場合
			if (getDtl1_SubL().subList(Dtl1R.$row_num, row.row_num()).size() > 0) {
				MCRow.copyall(getDtl1_SubL().getFirst(Dtl1R.$row_num, row.row_num()), row);
			}
			// 同じ行が非表示リストに存在しない場合	
			else {
				Dtl1R dtlSubR = Dtl1R.create();
				MCRow.copyall(dtlSubR, row);
				getDtl1_SubL().add(dtlSubR);
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {

		//検索時のページング対象指定
		setPagingParam(_dtlArBtnPp);

		callMS_MSBGL0040_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBGL0040_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0040_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBGL0040_Del01();
	}


	FXBAP_PagingParam _dtlArBtnPp = null;

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_lastBillAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcvAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_setoffAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_bfwAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_slsAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_retAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_dscntAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_taxAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_swToAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_billAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		
		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl1_trd_unit_cd, columnDtl1_trd_dec_place);
		Dtl1_trdCurUpri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_upri_dec_place);
		Dtl1_trdCurAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_trdIncCtax_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,  Hdr_amt_dec_place);
		Dtl1_trdCurTax_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,  Hdr_amt_dec_place);
		Dtl1_trdCurDscnt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,  Hdr_amt_dec_place);
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl1_trd_cur_amt, columnDtl1_xrate);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl1_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);

		Dtl2_trdCur_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl2_setoffAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl2_setoffTaxAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl3_trdCur_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl3_setoffAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl3_setoffTaxAmt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);

		// ページング対象の通信処理クラスとブロックを指定してページング情報を作成
		Class clazz =  createMS_MSBGL0040_Srch01().getClass();
		_dtlArBtnPp = new FXBAP_PagingParam(getBlockId(getDtl1L()), clazz);

		//対象とするページング情報をページング部品に設定
		Dtl1_Btn_paging_PPanel.setPagingParam(_dtlArBtnPp);
	}

	@Override
	public void callPagingSearcher(FXBAP_PanelBase eventPanel) {
		super.callPagingSearcher(eventPanel);
		if (eventPanel == Dtl1_Btn_paging_PPanel) {
			callMS_MSBGL0040_Srch01();
		}
	}

	@Override
	public boolean isPagingAgentHolder() {
		return true;
	}

	/**
	 * 値が変更された行の情報を非表示ブロックにコピーする
	 * 
	 * @param dtl1r
	 */
	protected void copyDtlSub(Dtl1R dtl1r) {
		// 既に同じ行が非表示ブロックに存在する場合
		if (getDtl1_SubL().subList(Dtl1R.$row_num, dtl1r.row_num()).size() > 0) {
			MCRow.copyall(getDtl1_SubL().getFirst(Dtl1R.$row_num, dtl1r.row_num()), dtl1r);
		}
		// 同じ行が非表示ブロックに存在しない場合
		else {
			Dtl1R dtl1SubR = Dtl1R.create();
			MCRow.copyall(dtl1SubR, dtl1r);
			getDtl1_SubL().add(dtl1SubR);
		}
	}

	// /////////////////////オープン時の処理実装/////////////////////

	@Override
	protected void valueInit(){
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {

		getCndR().ope(Cnd_ope_REF.getActionCommand());
		setCndOpeMode();
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>起動タイプ：T1 （検索）<br>
	 * バインド値<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>bill_no</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <tr>
	 * <td>bill_id</td>
	 * <td>String</td>
	 * <td>任意</td>
	 * </tr>
	 * <td>
	 * </table>
	 * <br>
	 * その他の引数：なし</li>
	 * </P>
	 * 
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {

		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {

			// 検索条件の設定
			getCndR().bill_no(nullValToNull(bind.getStringNE("bill_no")));
			getCndR().bill_mng_no(bind.getStringNE("bill_mng_no"));
			if (!isNull(getCndR().bill_no())) {
				getCndR().ope(Cnd_ope_DEL.getActionCommand());
			}

			addDoBehind(Cnd_srch);

		}
		
	}
	// /////////////////////モードの設定/////////////////////

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		CndPanel.focusFirstComponent();
		setCndOpeMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setCndOpeMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setCndOpeMode();
		setDelBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setCndOpeMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setCndOpeMode();
	}
	
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();

		setCndOpeMode();
	}

	protected void setCndOpeMode() {
		if (Cnd_ope_UPD.isSelected()) {
			Cnd_ope_UPD.setMode(MCMode.ENABLE);
			Cnd_bill_no.setMode(MCMode.READ_ONLY);
		} 
		else {
			Cnd_ope_UPD.setMode(MCMode.READ_ONLY);
			Cnd_bill_no.setMode(MCMode.REQUIRED);	
		}
		if (Hdr_edi_flg.getValue() && Hdr_prnt_flg.getValue()) {
			Btn_prnt.setMode(MCMode.DISABLE);
		}
	}

	protected void setDelBtnMode() {

		// 請求書発行済
		if (!isNull(getCndR().bill_no())) {
			// 都度請求の場合、取消不可
			if (MSC_BILL_CL_STS_TYP.isEACH_SLS((getHdrR().bill_cl_sts_typ()))){
				Btn_del.setMode(MCMode.DISABLE);
			}
		}
	}
	
	
	// /////////////////////種別変更時の処理実装/////////////////////

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		String beforeOpe = info.getOldValue().toString();
		String afterOpe = info.getNewValue().toString();
		
		if (isSame(beforeOpe, Cnd_ope_UPD.getActionCommand()) 
			|| isSame(beforeOpe, Cnd_ope_DEL.getActionCommand())
			|| (isSame(beforeOpe, Cnd_ope_REF.getActionCommand()) && isSame(getStatus(), FIX_U))) {
			clearContainers(getHdrR(), getDtl1L(), getDtl2L(),getRsltL());
		}
		
		if (isSame(getStatus(),REF) && isSame(afterOpe, Cnd_ope_DEL.getActionCommand())) {
			setDELStatus();
		}
		else {
			setSRCHStatus();
		}
		
		getCndR().bill_mng_no(null);
		setCndOpeMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isSame(getStatus(), UPD) && (!isStatusNone(getDtl1L()) || !isStatusNone(getDtl2L()))) {
				return confirmRegDataClear();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public boolean doCnd_bill_no_VC(MCEventInfo info) {
		if (!super.doCnd_bill_no_VC(info)) {
			return false;
		}
		String billNo = (String) info.getNewValue();
		if (MAC_STR.isNULL_VAL(billNo)) {
			return false;
		}
		return true;
	}

	@Override
	public void doCnd_bill_no_NC(MCEventInfo info) {
		super.doCnd_bill_no_NC(info);
		getCndR().bill_mng_no(null);
	}

	@Override
	public void doDtl1_bill_crryovr_times_NC(MCEventInfo info) {
		super.doDtl1_bill_crryovr_times_NC(info);

		Dtl1R r = getDtl1L().get(info.getEventIndex());

		if (!isNull(r.bill_crryovr_times())) {
			r.check(true);
		}
	}

	@Override
	public void doDtl2_bill_crryovr_times_NC(MCEventInfo info) {
		super.doDtl2_bill_crryovr_times_NC(info);

		Dtl2R r = getDtl2L().get(info.getEventIndex());

		if (!isNull(r.bill_crryovr_times())) {
			r.check(true);
		}
	}

	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);

		R row = list.get(0);
		if (isNull(row)) {
			return;
		}

		if (MAC_BIZ_TYP.isPAY_NTC_RCPT(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {
			return;
		}
		if (MAC_BIZ_TYP.isBILL(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {

			String bizTyp = getHdrR().getBoolean(HdrR.$edi_flg)
															? MAC_BIZ_TYP.BILL_EDI.value()
															: MAC_BIZ_TYP.BILL.value();
			row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
			return;
		}
	}
	

	// /////////////////////セルコンフィグ/////////////////////

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(createDtl1CellConfig());
		Dtl2Table.setCellConfig(createDtl2CellConfig());
	}

	protected Dtl1CellConfig createDtl1CellConfig() {
		return new Dtl1CellConfig();
	}

	/**
	 * 売上テーブル用のセルコンフィグ
	 * 
	 */
	public class Dtl1CellConfig extends MAUDP_CellConfig {

		@Override
		protected String getRowNumberColumnValue(int index,
				MCColumnConfig column, MCTable<?> table, boolean selected) {

			return getDtl1L().get(index).row_num().toString();
		}
		
		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			
			if (column == columnDtl1_trd_cur_upri) {
				return getHdrR().upri_dec_place();
			}
			if (column == columnDtl1_trd_cur_amt
					|| column == columnDtl1_trd_inc_tax_amt
					|| column == columnDtl1_trd_cur_tax_amt) {
				return getHdrR().amt_dec_place();
			}
			
			return super.getAmtDecPlace(index, column);
			
		}

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			
			if (column == columnDtl1_trd_cur_upri
					|| column == columnDtl1_trd_cur_amt
					|| column == columnDtl1_trd_inc_tax_amt
					|| column == columnDtl1_trd_cur_tax_amt) {
				return true;
			}
			
			return super.isAmtColumn(column);
			
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (getStatus() == FIX_U) {
				return super.getPriorMode(index, column, table);
			}
			
			// 請求サイトの設定
			if (column == columnDtl1_bill_crryovr_times || column == columnDtl1_check) {
				
				// 締日なし
				if (isNull(getHdrR().bill_cl_day())) {
					return MCMode.READ_ONLY;
				}
				
				String trdTyp = getDtl1L().get(index).trd_ptn_typ();
				// 消費税差額
				if (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(trdTyp)) {
					return MCMode.READ_ONLY;
				}
				// 残高振替
				if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL((trdTyp))) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
			
		}
		
	}
	
	protected Dtl2CellConfig createDtl2CellConfig() {
		return new Dtl2CellConfig();
	}
	
	/**
	 * 入金テーブル用のセルコンフィグ
	 * 
	 */
	public class Dtl2CellConfig extends MAUDP_CellConfig {


		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			
			if (column == columnDtl2_trd_cur_amt) {
				return getHdrR().upri_dec_place();
			}
			
			return super.getAmtDecPlace(index, column);
			
		}

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			
			if (column == columnDtl2_trd_cur_amt) {
				return true;
			}

			return super.isAmtColumn(column);
			
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (getStatus() == FIX_U) {
				return super.getPriorMode(index, column, table);
			}
			
			// 請求サイトの設定
			if (column == columnDtl2_bill_crryovr_times || column == columnDtl2_check) {
				
				// 締日なし
				if (isNull(getHdrR().bill_cl_day())) {
					return MCMode.READ_ONLY;
				}
				
				String trdTyp = getDtl2L().get(index).trd_ptn_typ();
				// 残高振替
				if (MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(trdTyp)) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

}