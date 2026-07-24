package mcframe.clientMSBH.MSBHP0090;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5050.*;
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
import mcframe.clientCore.container.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFXBA.FXBAP0110.FXBAP_ListListener;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUD.MAUDP0110.*;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import java.util.Arrays;
import mcframe.clientMSUC.MSUCP0100.MSUCP_ApUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_PayActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PayActReg_MC extends MSBHP_PayActReg_MC_A implements IfOpePanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PayActReg_MC() {
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
	public MSBHP_PayActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Srch01Caller<P extends MSBHP_PayActReg, B extends MS_MSBHL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBHL0090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			setOldVal();
			valueInitSub();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
			setFocus();
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setStatus(UPD);
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setStatus(DEL);
			}
			else {
				setStatus(REF);
			}
			setFocus();
		}
	}

	/**
	 * [MS_MSBHL0090_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Srch02Caller<P extends MSBHP_PayActReg, B extends MS_MSBHL0090_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBHL0090_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			showMerge();
			setOldVal();
		}

		@Override
		protected String[] getDownItemNames(int blockNum) {
			String[] itms = super.getDownItemNames(blockNum);
			if (blockNum != 0) {
				return itms;
			}

			// ヘッダの下り電文は画面側がNULLの項目のみ下り電文の値を反映する
			List<String> arr = new ArrayList<>();
			for (String s : itms) {
				if (isNull(getHdrR().getValueNE(s))) {
					arr.add(s);
				}
			}
			return arr.toArray(new String[arr.size()]);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_INS.isSelected()) {
				setStatus(INS_SRCH);
			}
			else {
				setStatus(UPD);
			}
			setFocus();
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_INS.isSelected()) {
				setStatus(INS);
			}
			else {
				setStatus(UPD);
			}
			setFocus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			// 誤作動防止
			getPaySchdTgtL().clear();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 手形関連の項目が必須の時があるので自前でチェックする
			//super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_pay_act_dt));
			msgList.addAll(panel.checkReq(Hdr_ac_dt));
			msgList.addAll(panel.checkReq(Hdr_pay_dpt_cd));
			msgList.addAll(panel.checkReq(Hdr_psppl_cd));
			msgList.addAll(panel.checkReq(Hdr_trd_cur_cd));
		}
	}

	/**
	 * [MS_MSBHL0090_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Ins01Caller<P extends MSBHP_PayActReg, B extends MS_MSBHL0090_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBHL0090_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			//super.checkReq(msgList);
			super.checkReqSub(msgList, getHdrR());
			super.checkReqSub(msgList, getDtlL().subList(r -> r.check()));
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 新規時は消込チェックがオンのみ
			bridge.up1().setAll(getDtlL().subList(r -> r.check()));
		}
	}

	/**
	 * [MS_MSBHL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Upd01Caller<P extends MSBHP_PayActReg, B extends MS_MSBHL0090_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBHL0090_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			//super.checkReq(msgList);
			super.checkReqSub(msgList, getHdrR());
			super.checkReqSub(msgList, getDtlL().subList(r -> r.check()));
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 更新時は消込チェックが変更された明細のみ
			// オフ⇒オフのみ対象外。オン⇒オンはどこかの項目が変更されているかもなので対象
			bridge.up1().clear();
			for (DtlR r : getDtlL()) {
				if (!r.old_check() && !r.check()) {
					continue;
				}
				else if (r.old_check() && r.check()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.old_check()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				bridge.up1().add(r);
			}
		}
	}

	/**
	 * [MS_MSBHL0090_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Del01Caller<P extends MSBHP_PayActReg, B extends MS_MSBHL0090_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
		protected MS_MSBHL0090_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * 検索時の値を保持する。
	 */
	protected void setOldVal() {
		// 債務決済方法の変更で使用される
		for(DtlR r :getDtlL() ){
			r.old_check(r.check());
			r.old_pay_schd_dt(r.pay_schd_dt());
			r.old_pay_schd_amt(r.pay_schd_amt());
			r.old_appl_ttl_amt(r.appl_ttl_amt());
			r.old_trd_cur_amt(r.trd_cur_amt());
			r.old_pay_chk_no(r.pay_chk_no());
			r.old_pay_chk_mng_no(r.pay_chk_mng_no());
			r.old_pay_schd_no(r.pay_schd_no());
			r.old_ap_appl_schd_no(r.ap_appl_schd_no());
			r.old_schd_ap_sttl_cd(r.schd_ap_sttl_cd());
			r.old_schd_ap_sttl_nm(r.schd_ap_sttl_nm());
			r.old_schd_ap_sttl_typ(r.schd_ap_sttl_typ());
			r.old_schd_ap_sttl_typ_nm(r.schd_ap_sttl_typ_nm());
		}
	}
	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBHL0090_Srch01();
	}

	/**
	 * Panel[Hdr]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doHdr_srch(MCEventInfo info) {
		callMS_MSBHL0090_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		if (isNull(getTotalR().pay_amt())) {
			doSelectAll(DtlTable);
		}
		else {
			// 一旦全解除してから再割り当てを行う
			doDeselectAll(DtlTable);
			
			MCNumber ttlAmt = getTotalR().pay_amt();
			for (DtlR r : DtlTable.getViewRows()) {
				int i = r.getGUIIndex();
				if (!isEditable(columnDtl_check, i) || r.isEmpty(r.getConstNameArray())) {
					// 編集可能でない、または固定カラムのすべてが空の行は対象外
					continue;
				}
				// 合計枠の支払額を明細の上から順に割り当てる
				MCNumber amt = null;
				if (!isNull(r.pay_schd_amt()) && !ttlAmt.isZero()) {
					// 手数料の行は支払額に割り当てない
					if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
						amt = r.pay_schd_amt();
					}
					else {
						MCNumber tmpAmt = null;
						if (!isNull(r.pay_act_d_no())) {
							tmpAmt = r.appl_ttl_amt().subtract(r.old_trd_cur_amt());
						}
						else {
							tmpAmt = nvl(r.appl_ttl_amt(), MCNumber.ZERO);
						}
						amt = r.pay_schd_amt().subtract(nvl(tmpAmt, MCNumber.ZERO));
						if (ttlAmt.lt(amt)) {
							amt = ttlAmt;
						}
						ttlAmt = ttlAmt.subtract(amt);
					}
				}
				// 金額がセットできる場合、消込をオン
				if (amt != null) {
					setValueEx(columnDtl_trd_cur_amt, i, amt);
					r.check(true);
				}
			}
		}
		setNoteMode();
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBHL0090_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBHL0090_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBHL0090_Del01();
	}

	@Override
	protected void opePanelFillSpace() {
		// フィルスペースしない
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_pay_act_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_pay_act_dt, true);

		Total_pay_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_not_appl_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_s_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_s_com_paid_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_s_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_a_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_a_com_paid_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Total_ttl_a_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_pay_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_old_pay_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_pay_schd_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_appl_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_old_appl_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_old_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_com_paid_tax_amt, Hdr_xrate);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub () {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Hdr_pay_act_dt, getToday());
			setValueEx(Hdr_ac_dt, getToday());
			setValueEx(Hdr_pay_basis_dt, getToday());

			// 基準通貨、為替レートＣＤ
			setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
			setValueEx(Hdr_base_cur_nm, getBaseCur().cur_nm());
			setValueEx(Hdr_base_cur_amt_dec_place, getBaseCur().amt_dec_place());
			setValueEx(Hdr_xrate_cd, getCo().purc_xrate_cd());
		}

		setValueEx(Hdr_pay_dpt_narrow_down_flg, true);
		setValueEx(Hdr_ap_sttl_narrow_down_flg, true);
		setValueEx(Hdr_pay_schd_dt, getToday());

		getHdrR().setStatus(MCRow.NONE);
	}

	@Override
	protected List<java.lang.String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = new ArrayList<>();

		if (cont instanceof MCList) {
			MCList<?> ls = (MCList<?>) cont;
			l = Arrays.asList(ls.createRow().getColumnPathArray());
		}
		else if (cont instanceof MCRow) {
			MCRow row = (MCRow) cont;
			l = Arrays.asList(row.getColumnPathArray());
		}

		List<String> colL = new ArrayList<>();
		// システム情報
		for (String col : getSystemInfoCols()) {
			if (l.contains(col)) {
				colL.add(col);
			}
		}
		// 更新カウンタ（支払照合更新カウンタは行コピー対象）
		for (String col : l) {
			if (cont.getMeta(col).metaEquals(mcframe.commonMA.meta.MA_META.UPD_CNT) && !(isSame(col, DtlR.$pay_chk_upd_cntr))) {
				colL.add(col);
			}
		}
		
		if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
			// 行コピーで引き継がない項目
			if (cont == getDtlL()) {
				colL.add(DtlR.$old_check);
				colL.add(DtlR.$pay_act_d_no);
				colL.add(DtlR.$pay_act_d_seq);
			}
		}
		return colL;
	}



	// -----------------------------------------------
	// リスナ
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();

		Hdr_pay_dpt_cd.addVCListener(this);
		Hdr_pay_dpt_cd.addLCListener(this);
		Total_pay_amt.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);

		setListListener(DtlTable, createDtlRowListener());
	}
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == Hdr_pay_dpt_cd
			|| vc == Hdr_psppl_cd
			|| vc == Hdr_trd_cur_cd
			|| vc == Hdr_ap_sttl_cd) {
			return confirmClearDtlTable();
		}
	
		return super.doVCEvent(vc, info);
	}

	protected boolean confirmClearDtlTable() {
		if (isStatusNone(getDtlL())) {
			return true;
		}
		return confirmRegDataClear();
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnDtl_trd_cur_amt) {
			doDtlSchd_trd_cur_amt_LC(info);
		}

		if (lc == Hdr_pay_dpt_cd
			|| lc == Hdr_psppl_cd
			|| lc == Hdr_trd_cur_cd
			|| lc == Hdr_ap_sttl_cd) {
			clearDtlTable();
		}
		else if (lc == Hdr_ap_sttl_typ
			|| lc == Hdr_ap_setoff_typ
			|| lc == Hdr_setoff_cd
			|| lc == Hdr_setoff_nm
			|| lc == Hdr_note_typ) {

			// モード切替
			setStatus(getStatus());
		}

		if (lc == Total_pay_amt) {
			setTtlAmt();
		}
	}

	protected void clearDtlTable() {
		Total_pay_amt.clear();
		clearContainers(getDtlL());
		if (Cnd_ope_INS.isSelected()) {
			setStatus(INS_SRCH);
		}
		else {
			setStatus(UPD);
		}
	}

	@Override
	protected FXBAP_ListListener createFXBAP_ListListener(MCTable tl) {
		if (tl == DtlTable) {
			return createDtlListListener();
		}
		return super.createFXBAP_ListListener(tl);
	}

	protected DtlRowListener createDtlRowListener() {
		return new DtlRowListener();
	}
	protected class DtlRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			if (isAmtEventCols(event)) {
				setTtlAmt();
			}
		}
		@Override
		public void statusChanged(MCRowStatusEvent event) {	
			setTtlAmt();
		}
	}
	protected DtlListListener createDtlListListener() {
		return new DtlListListener();
	}
	protected class DtlListListener extends MAUDP_ListListener {
		@Override
		protected void setSum(MCListEvent event) {
			setTtlAmt();
		}	
		@Override
		protected void clearSum(MCListEvent event) {
			setTtlAmt();
		}
	}
	protected boolean isAmtEventCols(MCRowEvent event) {
		String col = event.getColumn();
		return isSame(col, columnDtl_schd_ap_sttl_typ.getBaseRowColumnName())
				|| isSame(col, columnDtl_pay_schd_amt.getBaseRowColumnName())
				|| isSame(col, columnDtl_pay_schd_com_paid_tax_amt.getBaseRowColumnName())
				|| isSame(col, columnDtl_ap_sttl_typ.getBaseRowColumnName())
				|| isSame(col, columnDtl_trd_cur_amt.getBaseRowColumnName())
				|| isSame(col, columnDtl_trd_cur_com_paid_tax_amt.getBaseRowColumnName());
	}

	protected void setTtlAmt() {
		MCNumber[] amt = getTtlAmt();
		TotalR ttlR = getTotalR();
		ttlR.ttl_s_amt(amt[0]);
		ttlR.ttl_s_com_paid_amt(amt[1]);
		ttlR.ttl_s_com_paid_tax_amt(amt[2]);
		ttlR.ttl_a_amt(amt[3]);
		ttlR.ttl_a_com_paid_amt(amt[4]);
		ttlR.ttl_a_com_paid_tax_amt(amt[5]);
		ttlR.not_appl_bal(amt[6]);
	}

	protected MCNumber[] getTtlAmt() {
		MCNumber[] amt = new MCNumber[]{
			null,	// 0 予定額計
			null,	// 1 予定手数料額計
			null,	// 2 予定手数料税額計
			null,	// 3 実績額計
			null,	// 4 実績手数料額計
			null,	// 5 実績手数料税額計
			null,	// 6 未消込額
		};

		java.util.function.BiFunction<MCNumber, MCNumber, MCNumber> add = (x, y) -> {
			return nvl(x, MCNumber.ZERO).add(y);
		};
		
		MCNumber notAddAmt = MCNumber.ZERO;
		for (MCList<DtlR> list : getDtlL().subList(r -> !r.isStatusDelete()).groupList(DtlR.$ap_appl_schd_no)) {

			MCNumber applBal = MCNumber.ZERO;
			for (DtlR r : list) {
				if (!isNull(r.trd_cur_amt())) {
					if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
						// 実績手数料額計
						amt[4] = add.apply(amt[4], r.trd_cur_amt());
	
						if (!isNull(r.trd_cur_com_paid_tax_amt())) {
							// 実績手数料税額計
							amt[5] = add.apply(amt[5], r.trd_cur_com_paid_tax_amt());
						}
					}
					else {
						// 実績額計
						amt[3] = add.apply(amt[3], r.trd_cur_amt());
					}
				}

				// 消込額（消込累計額＋金額）
				String sttlTyp = nvl(getHdrR().ap_sttl_typ(), r.schd_ap_sttl_typ());
				if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					// 含めない
				}
				else if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
					if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
						applBal = add.apply(r.appl_ttl_amt(), applBal);
						applBal = add.apply(r.trd_cur_amt(), applBal);
					}
					else if (MAC_AP_STTL_TYP.isACNT(sttlTyp)
							|| MAC_AP_STTL_TYP.isCASH(sttlTyp)
							|| MAC_AP_STTL_TYP.isNOTE(sttlTyp)) {
						notAddAmt = notAddAmt.add(nvl(r.trd_cur_amt(), MCNumber.ZERO));
					}
				}
				else {
					if (MAC_AP_STTL_TYP.isACNT(sttlTyp)
						|| MAC_AP_STTL_TYP.isCASH(sttlTyp)
						|| MAC_AP_STTL_TYP.isNOTE(sttlTyp)) {
						applBal = add.apply(r.appl_ttl_amt(), applBal);
						applBal = add.apply(r.trd_cur_amt(), applBal);
					}
				}
			}

			if (!isNull(list.get(0).ap_appl_schd_no())) {
				DtlR r = list.get(0);
				if (!isNull(r.pay_schd_amt())) {
					if (MAC_AP_STTL_TYP.is_com_paid(r.schd_ap_sttl_typ())) {
						// 予定手数料額計
						amt[1] = add.apply(amt[1], r.pay_schd_amt());
	
						if (!isNull(r.pay_schd_com_paid_tax_amt())) {
							// 予定手数料税額計
							amt[2] = add.apply(amt[2], r.pay_schd_com_paid_tax_amt());
						}
					}
					else {
						// 予定額計
						amt[0] = add.apply(amt[0], r.pay_schd_amt());
					}

					// 未消込額（支払額－（実績額計－含めない額））
					if (!isNull(getTotalR().pay_amt())) {
						amt[6] = getTotalR().pay_amt().subtract(nvl(amt[3], MCNumber.ZERO).subtract(notAddAmt));
					}
				}
			}
		}
		return amt;
	}


	// -----------------------------------------------
	// イベント
	// -----------------------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		Total_pay_amt.clear();
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void doHdr_pay_act_dt_LC(MCEventInfo info) {
		super.doHdr_pay_act_dt_LC(info);
		
		for (DtlR r : getDtlL()) {
			setComPaidTaxCd(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_bank_ac_cd_LC(MCEventInfo info) {
		super.doHdr_bank_ac_cd_LC(info);
		for (DtlR r : getDtlL()) {
			setBankAcCd(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_pay_bank_ac_cd_LC(MCEventInfo info) {
		super.doHdr_pay_bank_ac_cd_LC(info);
		for (DtlR r : getDtlL()) {
			setPayBankAcCd(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_ap_sttl_cd_LC(MCEventInfo info) {
		super.doHdr_ap_sttl_cd_LC(info);

		String apSttlTyp = getHdrR().ap_sttl_typ();
		if (!canEditBankAcCd(apSttlTyp)) {
			setValueEx(Hdr_bank_ac_cd, null);
		}
		if (!canEditPayBankAcCd(apSttlTyp) && !reqPayBankAcCd(apSttlTyp)) {
			setValueEx(Hdr_pay_bank_ac_cd, null);
		}
		if (!canEditApSetoffTyp(apSttlTyp)) {
			setValueEx(Hdr_ap_setoff_typ, null);
		}
		if (!canEditNote(apSttlTyp)) {
			for (MCBeans c : getNoteParts()) {
				setValueEx((MCRowBeans)c, null);
			}
		}
	}

	@Override
	public void doHdr_ap_setoff_typ_LC(MCEventInfo info){
		super.doHdr_ap_setoff_typ_LC(info);

		for (DtlR r : getDtlL()) {
			setApSetoffTyp(r.getGUIIndex());
		}
		setValueEx(Hdr_setoff_cd, null);
		setValueEx(Hdr_so_dpt_cd, null);
	}

	@Override
	public void doHdr_setoff_cd_LC(MCEventInfo info) {
		super.doHdr_setoff_cd_LC(info);

		for (DtlR r : getDtlL()) {
			setSetoffCd(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_setoff_nm_LC(MCEventInfo info) {
		super.doHdr_setoff_nm_LC(info);

		for (DtlR r : getDtlL()) {
			setSetoffNm(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_so_dpt_cd_LC(MCEventInfo info) {
		super.doHdr_so_dpt_cd_LC(info);

		for (DtlR r : getDtlL()) {
			setSoDptCd(r.getGUIIndex());
		}
	}

	@Override
	public void doHdr_note_typ_LC(MCEventInfo info) {
		super.doHdr_note_typ_LC(info);

		if (isSetAccptrRo()) {
			setValueEx(Hdr_accptr, null);
		}
	}

	@Override
	public void doHdr_draw_dt_LC(MCEventInfo info) {
		super.doHdr_draw_dt_LC(info);

		HdrR hdrR = getHdrR();
		if (isNull(hdrR.draw_dt())) {
			Hdr_note_days.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_note_days, null);
		}
		else {
			setDefaultMode(Hdr_note_days);
			if (!isNull(hdrR.note_days())) {
				setDueDt();
			}
			else if (!isNull(hdrR.due_dt())) {
				setNoteDays();
			}
			
		}
	}

	@Override
	public void doHdr_due_dt_LC(MCEventInfo info) {
		super.doHdr_due_dt_LC(info);

		if (!isNull(getHdrR().due_dt())) {
			setNoteDays();
		}
	}

	@Override
	public void doHdr_note_days_LC(MCEventInfo info) {
		super.doHdr_note_days_LC(info);

		setDueDt();
	}

	@Override
	public void doHdr_draw_bank_cd_LC(MCEventInfo info) {
		super.doHdr_draw_bank_cd_LC(info);
		
		setValueEx(Hdr_draw_branch_cd, null);
	}


	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		MCNumber amt = null;
		if (r.check() && !isNull(r.pay_schd_amt())) {
			if (isNull(r.trd_cur_amt())) {
				MCNumber tmpAmt = null;
				if (!isNull(r.pay_act_d_no())) {
					tmpAmt = r.old_appl_ttl_amt().subtract(r.old_trd_cur_amt());
				}
				else {
					tmpAmt = nvl(r.appl_ttl_amt(), MCNumber.ZERO);
				}
				amt = r.pay_schd_amt().subtract(nvl(tmpAmt, MCNumber.ZERO));
			}
			else {
				amt = r.trd_cur_amt();
			}
		}
		setValueEx(columnDtl_trd_cur_amt, info.getEventIndex(), amt);

		if (r.check()) {
			HdrR hdrR = getHdrR();
			int idx = info.getEventIndex();
			if (!isNull(hdrR.bank_ac_cd())) {
				setBankAcCd(idx);
			}
			if (!isNull(hdrR.pay_bank_ac_cd())) {
				setPayBankAcCd(idx);
			}
			if (!isNull(hdrR.ap_setoff_typ())) {
				setApSetoffTyp(idx);
			}
			if (!isNull(hdrR.setoff_cd())) {
				setSetoffCd(idx);
			}
			if (!isNull(hdrR.setoff_nm())) {
				setSetoffNm(idx);
			}
			if (!isNull(hdrR.so_dpt_cd())) {
				setSoDptCd(idx);
			}
		}

		setNoteMode();
	}

	@Override
	public void doDtl_ap_sttl_typ_LC(MCEventInfo info) {
		super.doDtl_ap_sttl_typ_LC(info);

		// 手数料から手数料以外、またはその逆の場合は、合計枠を再計算する
		String newVal = (String)info.getNewValue(), oldVal = (String)info.getOldValue();
		if (!isSame(MAC_AP_STTL_TYP.is_com_paid(newVal), MAC_AP_STTL_TYP.is_com_paid(oldVal))) {
			setTtlAmt();
		}

		DtlR r = getDtlL().get(info.getEventIndex());
		// 手数料以外から手数料に変更した場合、支払予定ＮＯなどはクリアする（予定と紐付かない支払実績とする）
		if (!MAC_AP_STTL_TYP.is_com_paid(oldVal) && MAC_AP_STTL_TYP.is_com_paid(newVal)) {
			r.pay_schd_dt(null);
			r.pay_schd_amt(null);
			r.appl_ttl_amt(null);
			r.pay_chk_no(null);
			r.pay_chk_mng_no(null);
			r.pay_schd_no(null);
			r.ap_appl_schd_no(null);
			r.schd_ap_sttl_cd(null);
			r.schd_ap_sttl_nm(null);
			r.schd_ap_sttl_typ(null);
			r.schd_ap_sttl_typ_nm(null);
		}
		// 変更前に値を戻した場合は、予定ＮＯを復活させる
		else if (MAC_AP_STTL_TYP.is_com_paid(oldVal) && !MAC_AP_STTL_TYP.is_com_paid(newVal)) {
			r.pay_schd_dt(r.old_pay_schd_dt());
			r.pay_schd_amt(r.old_pay_schd_amt());
			r.appl_ttl_amt(r.old_appl_ttl_amt());
			r.pay_chk_no(r.old_pay_chk_no());
			r.pay_chk_mng_no(r.old_pay_chk_mng_no());
			r.pay_schd_no(r.old_pay_schd_no());
			r.ap_appl_schd_no(r.old_ap_appl_schd_no());
			r.schd_ap_sttl_cd(r.old_schd_ap_sttl_cd());
			r.schd_ap_sttl_nm(r.old_schd_ap_sttl_nm());
			r.schd_ap_sttl_typ(r.old_schd_ap_sttl_typ());
			r.schd_ap_sttl_typ_nm(r.old_schd_ap_sttl_typ_nm());
			setApplTtlAmt(info.getEventIndex());
		}
		
		// 債務決済区分が相殺以外の場合、支払通知書明細備考をクリアする
		if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
			r.pay_ntc_d_print_rmrks(null);
		}
		
		setComPaidTaxCd(info.getEventIndex());
		
		setBankAcCd(info.getEventIndex());
		
		setPayBankAcCd(info.getEventIndex());
		
		setBtnMode();
	}
	
	/**
	 * 手数料税ＣＤの初期値を設定する。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setComPaidTaxCd(int index) {
		
		DtlR r = getDtlL().get(index);
		
		if (!isNull(getHdrR().pay_act_dt()) && canEditTaxCd(r.ap_sttl_typ())) {
			setValueEx(columnDtl_trd_cur_com_paid_tax_cd, index, MSUCP_ApUtil.getComPaidTaxCd(getHdrR().pay_act_dt(), this));
		}
		else {
			setValueEx(columnDtl_trd_cur_com_paid_tax_cd, index, null);
		}
	}
	
	/**
	 * 債務決済区分を基づき、口座をクリアする。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setBankAcCd(int index) {
		
		DtlR r = getDtlL().get(index);
		
		if (!canEditBankAcCd(r.ap_sttl_typ())) {
			setValueEx(columnDtl_bank_ac_cd, index, null);
		}
		else {
			setValueEx(columnDtl_bank_ac_cd, index, getHdrR().bank_ac_cd());
		}
	}
	
	/**
	 * 債務決済区分を基づき、支払先口座をクリアする。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setPayBankAcCd(int index) {
		
		DtlR r = getDtlL().get(index);
		
		if (!canEditPayBankAcCd(r.ap_sttl_typ()) && !reqPayBankAcCd(r.ap_sttl_typ())) {
			setValueEx(columnDtl_pay_bank_ac_cd, index, null);
		}
		else {
			setValueEx(columnDtl_pay_bank_ac_cd, index, getHdrR().pay_bank_ac_cd());
		}
	}

	public void doDtlSchd_trd_cur_amt_LC(MCEventInfo info) {
		// 変更後の金額がnull以外の場合、消込フラグにチェックを入れる
		int index = info.getEventIndex();
		DtlR dtlR = DtlTable.getRow(index);
		if (!isNull(dtlR) && !isNull(dtlR.trd_cur_amt())) {
			dtlR.check(true);
			setNoteMode();
		}
		else {
			dtlR.check(false);
		}
		setTaxAmt(info.getEventIndex());
		setApplTtlAmt(info.getEventIndex());
	}
	
	/**
	 * 買掛消込予定ＮＯ IS NOT NULLの場合は、消込累計額に値を反映する。<br>
	 * 買掛消込予定ＮＯ IS NULL（行コピーした手数料）の場合は消込累計額に反映しない。
	 * @param index イベント対象の行のインデックス値
	 */
	protected void setApplTtlAmt(int index) {
		
		DtlR r = getDtlL().get(index);
		
		if (!isNull(r.ap_appl_schd_no())) {
			
			if (isNull(r.trd_cur_amt())) {
				if (!isNull(r.pay_act_d_no())) {
					r.appl_ttl_amt(r.old_appl_ttl_amt().subtract(r.old_trd_cur_amt()));
				}
				else {
					r.appl_ttl_amt(r.old_appl_ttl_amt());
				}
			}
			else {
				r.appl_ttl_amt(sum(nvl(r.old_appl_ttl_amt(), MCNumber.ZERO),
						r.trd_cur_amt().subtract(nvl(r.old_trd_cur_amt(), MCNumber.ZERO))));
			}
		}
	}

	@Override
	public void doDtl_trd_cur_com_paid_tax_cd_LC(MCEventInfo info) {
		super.doDtl_trd_cur_com_paid_tax_cd_LC(info);
		setTaxAmt(info.getEventIndex());
	}

	@Override
	public void doDtl_ap_setoff_typ_LC(MCEventInfo info){
		super.doDtl_ap_setoff_typ_LC(info);

		setSetoffCd(info.getEventIndex());
		setSoDptCd(info.getEventIndex());
	}

	/**
	 * 税込み金額から税金額を設定する。<br>
	 * 指定された行の税金額を設定する。
	 */
	protected void setTaxAmt(int index) {
		String apSttlTyp = getDtlL().get(index).ap_sttl_typ();

		if (canEditTaxCd(apSttlTyp)) {
			DtlR r = getDtlL().get(index);
			MCNumber amt = 
				MAUCP_AmtUtil.getIncTaxAmt(
					r.trd_cur_amt(), r.trd_cur_com_paid_tax_rate(),
					getHdrR().trd_cur_amt_dec_place(), getCo().com_paid_tax_rnd_typ());
			setValueEx(columnDtl_trd_cur_com_paid_tax_amt, index, amt);
		}
		else {
			setValueEx(columnDtl_trd_cur_com_paid_tax_amt, index, null);
		}
	}

	/**
	 * 口座が入力可能かどうか
	 * @param apSttlTyp
	 * @return
	 */
	protected boolean canEditBankAcCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.is_req_bank_ac(apSttlTyp);
	}
	
	/**
	 * 支払先口座が必須かどうか。
	 * @param apSttlTyp 債務決済区分 
	 * @return 入力可能の場合はture
	 */
	protected boolean reqPayBankAcCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.is_req_bank_ac(apSttlTyp);
	}
	
	/**
	 * 支払先口座が入力可能かどうか。
	 * @param apSttlTyp 債務決済区分 
	 * @return 入力可能の場合はture
	 */
	protected boolean canEditPayBankAcCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isCASH(apSttlTyp)  
				|| MAC_AP_STTL_TYP.isCASH_COM_PAID(apSttlTyp);
	}

	/**
	 * 税ＣＤが入力可能かどうか
	 */
	protected boolean canEditTaxCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.is_com_paid(apSttlTyp) || MAC_AP_STTL_TYP.isSETOFF(apSttlTyp);
	}

	/**
	 * 債務相殺先区分が入力可能かどうか
	 */
	protected boolean canEditApSetoffTyp(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isSETOFF(apSttlTyp) && isNull(getHdrR().ap_setoff_typ());
	}

	/**
	 * 相殺先ＣＤが入力可能かどうか
	 */
	protected boolean canEditSetoffCd(String apSetoffTyp) {
		return MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp)  && isNull(getHdrR().ap_setoff_typ()) && isNull(getHdrR().setoff_cd());
	}

	/**
	 * 相殺先名が入力可能かどうか
	 */
	protected boolean canEditSetoffBpNm(String apSetoffTyp) {
		if (canEditSetoffCd(apSetoffTyp)) {
			return MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp)  && isNull(getHdrR().ap_setoff_typ());
		}
		else {
			return false;
		}
	}

	/**
	 * 相殺部門ＣＤが入力可能かどうか
	 */
	protected boolean canEditSoDptCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isSETOFF(apSttlTyp) && isNull(getHdrR().so_dpt_cd());
	}

	/**
	 * 手形関連が入力可能かどうか
	 */
	protected boolean canEditNote(String apSttlTyp) {
		return MAC_AP_STTL_TYP.isNOTE(apSttlTyp);
	}

	/**
	 * 手形関連のカラムかどうか
	 */
	protected MCBeans[] _noteParts;
	protected MCBeans[] getNoteParts() {
		if (_noteParts == null) {
			_noteParts = new MCModeBeans[]{
				Hdr_note_no,
				Hdr_note_typ,
				Hdr_draw_dt,
				Hdr_note_days,
				Hdr_due_dt,
				Hdr_drawer_nm,
				Hdr_endrsr,
				Hdr_accptr,
				Hdr_draw_bank_cd,
				Hdr_draw_branch_cd,
				Hdr_note_rsn_cd,
				Hdr_note_sub_char1,
				Hdr_note_sub_char2,
				Hdr_note_sub_char3
			};
		}
		return _noteParts;
	}

	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setDueDt() {
		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.draw_dt()) && !isNull(hdrR.note_days())) {
			// 支払期日＝振出日＋手形サイト
			setValueEx(Hdr_due_dt, hdrR.draw_dt().addDay(hdrR.note_days()));
		}
	}

	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setNoteDays() {
		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.draw_dt()) && !isNull(hdrR.due_dt())) {
			// 手形サイト＝（支払期日－振出日）＋１
			MCNumber noteDays = MCNumber.valueOf(hdrR.due_dt().diffDay(hdrR.draw_dt()));
			if (noteDays.isNegative()) {
				setValueEx(Hdr_note_days, null);
			}
			else {
				setValueEx(Hdr_note_days, noteDays);
			}
		}
	}

	/**
	 * 債務相殺先区分を設定する。
	 */
	protected void setApSetoffTyp(int idx) {
		DtlR r = getDtlL().get(idx);
		if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
			if (!canEditApSetoffTyp(r.ap_setoff_typ()) || isNull(r.ap_setoff_typ())) {
				// 明細にヘッダと同値が設定されているとイベントが発生しないので、発生させるためにいったんクリアする
				setValueEx(columnDtl_ap_setoff_typ, idx, null);
				setValueEx(columnDtl_ap_setoff_typ, idx, getHdrR().ap_setoff_typ());
			}
		}
	}

	/**
	 * 相殺先ＣＤを設定する。
	 */
	protected void setSetoffCd(int idx) {
		DtlR r = getDtlL().get(idx);
		if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
			setValueEx(columnDtl_setoff_cd, idx, r.bsppl_cd());
		}
		else if (MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
			if (!canEditSetoffCd(r.ap_setoff_typ()) || isNull(r.setoff_cd())) {
				setValueEx(columnDtl_setoff_cd, idx, getHdrR().setoff_cd());
			}
		}
		else {
			setValueEx(columnDtl_setoff_cd, idx, null);
		}
	}

	/**
	 * 相殺先名を設定する。
	 */
	protected void setSetoffNm(int idx) {
		DtlR r = getDtlL().get(idx);
		if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
			// コンボ連携で設定されるので何もしない
		}
		else if (MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
			if (!canEditSetoffBpNm(r.ap_setoff_typ()) || isNull(r.setoff_nm())) {
				setValueEx(columnDtl_setoff_nm, idx, getHdrR().setoff_nm());
			}
		}
		else {
			setValueEx(columnDtl_setoff_cd, idx, null);
		}
	}

	/**
	 * 相殺部門ＣＤを設定する。
	 */
	protected void setSoDptCd(int idx) {
		DtlR r = getDtlL().get(idx);
		if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())
			|| MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
			if (!isNull(getHdrR().so_dpt_cd())) {
				if (!canEditSoDptCd(r.ap_setoff_typ()) || isNull(r.so_dpt_cd())) {
					setValueEx(columnDtl_so_dpt_cd, idx, getHdrR().so_dpt_cd());
				}
			}
			else if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
				setValueEx(columnDtl_so_dpt_cd, idx, r.ap_dpt_cd());
			}
			else {
				setValueEx(columnDtl_so_dpt_cd, idx, null);
			}
		}
		else {
			setValueEx(columnDtl_so_dpt_cd, idx, null);
		}
	}


	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		if (isINSStatus(status)
			|| isSame(status, INS_SRCH)
			|| isUPDStatus(status)) {
			setBankAcMode();
			setSetoffMode();
		}
		if (isINSStatus(status)
			|| isUPDStatus(status)) {
			setNoteMode();
		}
		
		setPayActRevMode();
		
		setStatusColumn();
		setBtnMode();
	}
	
	/**
	 * 支払実績改定番号、最新ＦＬＧの入力制御
	 */
	protected void setPayActRevMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_pay_act_rev.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 口座、支払先口座関連項目の入力制御
	 */
	protected void setBankAcMode() {
		if (isSetBankAcRo()) {
			Hdr_bank_ac_cd.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_bank_ac_cd, null);
		}
		else {
			setDefaultMode(Hdr_bank_ac_cd);
		}
		
		if (isSetPayBankAcRo()) {
			Hdr_pay_bank_ac_cd.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_pay_bank_ac_cd, null);
		}
		else {
			setDefaultMode(Hdr_pay_bank_ac_cd);
		}
	}

	/**
	 * 口座関連項目をREAD_ONLYにするか
	 */
	protected boolean isSetBankAcRo() {
		String sttlTyp = getHdrR().ap_sttl_typ();
		if (isNull(sttlTyp)) {
			for (MAC_AP_STTL_TYP typ : new MAC_AP_STTL_TYP[]{MAC_AP_STTL_TYP.ACNT, MAC_AP_STTL_TYP.ACNT_COM_PAID}) {
				DtlR r = getDtlL().getFirst(DtlR.$ap_sttl_typ, typ.value());
				if (!isNull(r)) {
					sttlTyp = r.ap_sttl_typ();
					break;
				}
			}
		}
		if (isNull(sttlTyp)) {
			return true;
		}
		return !(MAC_AP_STTL_TYP.isACNT(sttlTyp) || MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp));
	}
	
	/**
	 * 支払口座関連項目をREAD_ONLYにするか
	 */
	protected boolean isSetPayBankAcRo() {
		String sttlTyp = getHdrR().ap_sttl_typ();
		if (isNull(sttlTyp)) {
			for (MAC_AP_STTL_TYP typ : new MAC_AP_STTL_TYP[]{
					MAC_AP_STTL_TYP.ACNT, MAC_AP_STTL_TYP.ACNT_COM_PAID, MAC_AP_STTL_TYP.CASH, MAC_AP_STTL_TYP.CASH_COM_PAID}) {
				DtlR r = getDtlL().getFirst(DtlR.$ap_sttl_typ, typ.value());
				if (!isNull(r)) {
					sttlTyp = r.ap_sttl_typ();
					break;
				}
			}
		}
		if (isNull(sttlTyp)) {
			return true;
		}
		return !(MAC_AP_STTL_TYP.isACNT(sttlTyp) || MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp)
				|| MAC_AP_STTL_TYP.isCASH(sttlTyp) || MAC_AP_STTL_TYP.isCASH_COM_PAID(sttlTyp));
	}

	/**
	 * 相殺関連項目の入力制御
	 */
	protected void setSetoffMode() {
		if (isSetSetoffRo()) {
			Hdr_ap_setoff_typ.setMode(MCMode.READ_ONLY);
			Hdr_setoff_cd.setMode(MCMode.READ_ONLY);
			Hdr_setoff_nm.setMode(MCMode.READ_ONLY);
			Hdr_so_dpt_cd.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_ap_setoff_typ, null);
			setValueEx(Hdr_setoff_cd, null);
			setValueEx(Hdr_setoff_nm, null);
			setValueEx(Hdr_so_dpt_cd, null);
		}
		else {
			setDefaultMode(Hdr_ap_setoff_typ);
			if (MAC_AP_SETOFF_TYP.isBSPPL(getHdrR().ap_setoff_typ()) || isNull(getHdrR().ap_setoff_typ())) {
				Hdr_setoff_cd.setMode(MCMode.READ_ONLY);
				Hdr_setoff_nm.setMode(MCMode.READ_ONLY);
			}
			else {
				MCList<DtlR> list = getDtlL().subList(r -> MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ()));
				if (!isNull(list.getFirst(DtlR.$setoff_cd, null))) {
					Hdr_setoff_cd.setMode(MCMode.REQUIRED);
				}
				else {
					setDefaultMode(Hdr_setoff_cd);
				}
				if (!isNull(list.getFirst(DtlR.$setoff_nm, null))) {
					Hdr_setoff_nm.setMode(MCMode.REQUIRED);
				}
				else {
					setDefaultMode(Hdr_setoff_nm);
				}
			}
			setDefaultMode(Hdr_so_dpt_cd);
		}
	}

	/**
	 * 相殺関連項目をREAD_ONLYにするか
	 */
	protected boolean isSetSetoffRo() {
		String sttlTyp = getHdrR().ap_sttl_typ();
		if (isNull(sttlTyp)) {
			DtlR r = getDtlL().getFirst(DtlR.$ap_sttl_typ, MAC_AP_STTL_TYP.SETOFF.value());
			if (!isNull(r)) {
				sttlTyp = r.ap_sttl_typ();
			}
		}
		if (isNull(sttlTyp)) {
			return true;
		}
		return !MAC_AP_STTL_TYP.isSETOFF(sttlTyp);
	}

	/**
	 * 手形関連項目の入力制御
	 */
	protected void setNoteMode() {
		if (isSetNoteRo()) {
			for (MCBeans c : getNoteParts()) {
				((MCModeBeans)c).setMode(MCMode.READ_ONLY);
			}
		}
		else {
			Hdr_note_no.setMode(MCMode.REQUIRED);
			Hdr_note_typ.setMode(MCMode.REQUIRED);
			Hdr_draw_dt.setMode(MCMode.REQUIRED);
			Hdr_due_dt.setMode(MCMode.REQUIRED);
			Hdr_drawer_nm.setMode(MCMode.REQUIRED);
			Hdr_endrsr.setMode(MCMode.ENABLE);
			Hdr_draw_bank_cd.setMode(MCMode.REQUIRED);
			Hdr_draw_branch_cd.setMode(MCMode.REQUIRED);
			Hdr_note_rsn_cd.setMode(MCMode.ENABLE);
			Hdr_note_sub_char1.setMode(MCMode.ENABLE);
			Hdr_note_sub_char2.setMode(MCMode.ENABLE);
			Hdr_note_sub_char3.setMode(MCMode.ENABLE);
			
			if (isSetAccptrRo()) {
				Hdr_accptr.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_accptr.setMode(MCMode.REQUIRED);
			}
			
			if (isSetNoteDaysRo()) {
				Hdr_note_days.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_note_days.setMode(MCMode.REQUIRED);
			}
		}
	}

	/**
	 * 手形関連項目をREAD_ONLYにするか
	 */
	protected boolean isSetNoteRo() {
		String sttlTyp = getHdrR().ap_sttl_typ();
		MCIndexKey noteIdx = getDtlL().createIndex(DtlR.$check, DtlR.$ap_sttl_typ);
		if (isNull(sttlTyp)) {
			DtlR r = getDtlL().getFirst(noteIdx, true, MAC_AP_STTL_TYP.NOTE.value());
			if (!isNull(r)) {
				sttlTyp = r.ap_sttl_typ();
			}
		}
		if (isNull(sttlTyp)) {
			return true;
		}
		return !MAC_AP_STTL_TYP.isNOTE(sttlTyp);
	}

	/**
	 * 引受人をREAD_ONLYにするか
	 */
	protected boolean isSetAccptrRo() {
		return !MAC_NOTE_TYP.isXCHNG(getHdrR().note_typ());
	}
	
	/**
	 * 手形サイトをREAD_ONLYにするか
	 */
	protected boolean isSetNoteDaysRo() {
		return isNull(getHdrR().draw_dt());
	}

	/**
	 * 行ステータスの表示・非表示を設定する
	 */
	protected void setStatusColumn() {
		boolean boo = Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected();
		DtlTable.setStatusColumnVisible(boo);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setFocus();
	}

	/**
	 * フォーカスを設定する
	 */
	protected void setFocus() {
		String st = getStatus();
		if (isSRCHStatus(st) || isFIX_IStatus(st) || isFIX_UStatus(st) || isFIX_DStatus(st)) {
			CndPanel.focusFirstComponent();
		}
		else if (isSame(st, INS_SRCH)) {
			HdrPanel.focusFirstComponent();
		}
		else {
			DtlTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * 支払予定枠のボタン制御
	 */
	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)
			&& !r.sw_flg()
			&& (MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ())
				|| MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ())
				|| MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())
				|| MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ()))) {
			setDefaultMode(Btn_rcopy);
		}
		else {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		if (!isNull(r) && r.isStatusCreate()) {
			setDefaultMode(Btn_rdel);
		}
		else {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void setINS_SRCHStatus() {
		super.setINS_SRCHStatus();
		Total_pay_amt.setMinusEnable(
			MAC_AP_STTL_TYP.isSETOFF(getHdrR().ap_sttl_typ())
		);
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		if (!isNull(getDtlL().getFirst(DtlR.$sw_flg, true))) {
			Btn_del.setMode(MCMode.DISABLE);
		}
	}

	// -----------------------------------------------
	// リストロジック・入力補助
	// -----------------------------------------------
	@Override
	public MCList getHdr_ap_sttl_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getHdr_ap_sttl_cd(row, info), rList = list.createInstance();
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isWTAX(sttlTyp)) {
				rList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
				if (!r.getBooleanNE("ap_setoff_act_flg")) {
					rList.add(r);
				}
			}
			else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(sttlTyp)) {
				rList.add(r);
			}
		}
		if (!rList.isEmpty()) {
			list.removeAll(rList);
		}
		return list;
	}

	@Override
	public MCList getHdr_ap_setoff_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getHdr_ap_setoff_typ(row, info), rList = list.createInstance();
		for (MCRow r : list) {
			String setoffTyp = r.getStringNE("ap_setoff_typ");
			if (MAC_AP_SETOFF_TYP.isBSPPL(setoffTyp)
				|| MAC_AP_SETOFF_TYP.isFLEX(setoffTyp)) {
				rList.add(r);
			}
		}
		return rList;
	}

	@Override
	public MCList getHdr_setoff_cd(MCRow row, MCEventInfo info) {
		if (MAC_AP_SETOFF_TYP.isFLEX(getHdrR().ap_setoff_typ())) {
			row.addStringColumn(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.COMM.value());
		}
		return super.getHdr_setoff_cd(row, info);
	}

	@Override
	public MCList getHdr_so_dpt_cd(MCRow row, MCEventInfo info) {
		row.addDateColumn(DptCols.$i_dt, getHdrR().ac_dt());
		if (MAC_AP_SETOFF_TYP.isBSPPL(getHdrR().ap_setoff_typ())) {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
		}
		else if (MAC_AP_SETOFF_TYP.isFLEX(getHdrR().ap_setoff_typ())) {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
		}
		return super.getHdr_so_dpt_cd(row, info);
	}

	@Override
	public MCList getDtl_ap_sttl_cd(MCRow row, MCEventInfo info) {
		HdrR hdrR = getHdrR();
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		row.addDateColumn(SttlCols.$i_dt, hdrR.pay_act_dt());

		MCList<MCRow> list = super.getDtl_ap_sttl_cd(row, info), rList = list.createInstance();
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			String hdrSttlTyp = nvl(hdrR.ap_sttl_typ(), dtlR.old_schd_ap_sttl_typ());

			if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp) && !r.getBooleanNE("ap_setoff_act_flg")) {
				// 実績計上フラグがオフの相殺は対象外
				continue;
			}
			if (MAC_AP_STTL_TYP.isACNT(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isACNT(sttlTyp)
					|| MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp)
					|| MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
					rList.add(r);
				}
			}
			else if (MAC_AP_STTL_TYP.isACNT_COM_PAID(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp)) {
					rList.add(r);
				}
			}
			if (MAC_AP_STTL_TYP.isCASH(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isCASH(sttlTyp)
					|| MAC_AP_STTL_TYP.isCASH_COM_PAID(sttlTyp)
					|| MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
					rList.add(r);
				}
			}
			else if (MAC_AP_STTL_TYP.isCASH_COM_PAID(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isCASH_COM_PAID(sttlTyp)) {
					rList.add(r);
				}
			}
			else if (MAC_AP_STTL_TYP.isNOTE(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isNOTE(sttlTyp)
					|| MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
					rList.add(r);
				}
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(hdrSttlTyp)) {
				if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
					rList.add(r);
				}
			}
		}
		return rList;
	}

	@Override
	public MCList getDtl_ap_setoff_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getDtl_ap_setoff_typ(row, info), rList = list.createInstance();
		for (MCRow r : list) {
			String setoffTyp = r.getStringNE("ap_setoff_typ");
			if (MAC_AP_SETOFF_TYP.isBSPPL(setoffTyp)
				|| MAC_AP_SETOFF_TYP.isFLEX(setoffTyp)) {
				rList.add(r);
			}
		}
		return rList;
	}

	@Override
	public MCList getDtl_setoff_cd(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		row.addStringColumn(BpCols.$i_bp_is_srch_typ, MAC_AP_SETOFF_TYP.bp_is_srch_typ(r.ap_setoff_typ()));
		return super.getDtl_setoff_cd(row, info);
	}

	@Override
	public MCList getDtl_so_dpt_cd(MCRow row, MCEventInfo info) {
		row.addDateColumn(DptCols.$i_dt, getHdrR().ac_dt());
		DtlR r = getDtlL().get(info.getEventIndex());
		if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
		}
		else if (MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
		}
		return super.getHdr_so_dpt_cd(row, info);
	}

	/**
	 * 入力補助を起動する際の引数をセットする
	 */
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		if (beans == Hdr_setoff_cd
			|| beans == columnDtl_setoff_cd) {
			String setoffTyp = (beans == Hdr_setoff_cd) ? getHdrR().ap_setoff_typ() : getDtlL().get(eventIndex).ap_setoff_typ();
			bind.addStringColumn(BpCols.$i_bp_is_srch_typ, MAC_AP_SETOFF_TYP.bp_is_srch_typ(setoffTyp));
		}
		if (beans == Hdr_so_dpt_cd
			|| beans == columnDtl_so_dpt_cd) {
			String setoffTyp = (beans == Hdr_so_dpt_cd) ? getHdrR().ap_setoff_typ() : getDtlL().get(eventIndex).ap_setoff_typ();
			if (MAC_AP_SETOFF_TYP.isBSPPL(setoffTyp)) {
				bind.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
			}
			else if (MAC_AP_SETOFF_TYP.isFLEX(setoffTyp)) {
				bind.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
			}
			bind.addDateColumn(DptCols.$i_dt, getHdrR().ac_dt());
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}


	// -----------------------------------------------
	// インタフェース(IfOpePanel)
	// -----------------------------------------------
	@Override
	public MCButtonGroup getOpeButtonGroup () {
		return Cnd_ope_Group;
	}
	
	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		return ret;
	}
	
	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}
	
	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_pay_act_rev;
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().pay_act_no(getHdrR().pay_act_no());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe,
			String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (isINSOpe(afOpe)) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				// 参照登録はしない
				clearContainers(getHdrR(), getDtlL());
			}
			setStatus(INS_SRCH);
		}
		else if (isUPDOpe(afOpe)) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				setStatus(UPD);
			}
		}
		valueInit();
		setFocus();
	}

	// -----------------------------------------------
	// インタフェース(IfCanAcDtBase)
	// -----------------------------------------------
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return Hdr_ac_dt;
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


	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(crtDtlCellConfig());
	}
	protected DtlCellConfig crtDtlCellConfig() {
		return new DtlCellConfig();
	}
	protected class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = getDtlL().get(index);
			if (r.sw_flg()) {
				return MCMode.READ_ONLY;
			}
			if (column == columnDtl_ap_sttl_cd) {
				if (!isEditApSttlCd(r)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_trd_cur_com_paid_tax_cd) {
				if (!canEditTaxCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
				else if (canEditTaxCd(r.ap_sttl_typ())
						&& MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())
						&& isEditableMode(columnDtl_trd_cur_com_paid_tax_cd)) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnDtl_trd_cur_com_paid_tax_amt) {
				if (isNull(r.trd_cur_com_paid_tax_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_bank_ac_cd) {
				if (!canEditBankAcCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_pay_bank_ac_cd) {
				if (!canEditPayBankAcCd(r.ap_sttl_typ()) && !reqPayBankAcCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isEditableMode(columnDtl_pay_bank_ac_cd) && canEditPayBankAcCd(r.ap_sttl_typ())) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnDtl_ap_setoff_typ) {
				if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_setoff_cd) {
				if (!canEditSetoffCd(r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_setoff_nm) {
				if (!canEditSetoffBpNm(r.ap_setoff_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_so_dpt_cd) {
				if (!canEditSoDptCd(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_pay_ntc_d_print_rmrks) {
				if (!canEditApSetoffTyp(r.ap_sttl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 決済方法が入力可能か
	 */
	protected boolean isEditApSttlCd(DtlR r) {
		return r.isStatusCreate();
	}


	// -----------------------------------------------
	// 画面遷移（支払一覧登録からヘッダ情報引き継ぎ）
	// -----------------------------------------------
	/**
	 * @param openTyp 起動タイプ T1のみ許容
	 * @param bind 支払部門、支払先、通貨、が設定されたロウ（それぞれコードと名称、通貨は金額小数部有効桁数も）
	 * @param args args[0]：支払予定ＮＯが設定されたリスト
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(openTyp, T1)) {
			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			valueInit();

			setT1Bind(bind, args);
			if (isExecSrch()) {
				addDoBehind(Hdr_srch);
			}
		}
	}
	/**
	 * T1で起動された場合のバインド値設定
	 * @param bind
	 */
	protected void setT1Bind(MCRow bind, Object... args) {
		setValueEx(Hdr_pay_dpt_cd, bind.getStringNE("pay_dpt_cd"));
		setValueEx(Hdr_psppl_cd, bind.getStringNE("psppl_cd"));
		setValueEx(Hdr_trd_cur_cd, bind.getStringNE("trd_cur_cd"));
		setValueEx(Hdr_pay_dpt_narrow_down_flg, false);
		setValueEx(Hdr_ap_sttl_narrow_down_flg, false);
		setValueEx(Hdr_pay_schd_dt, null);

		if (args == null || !(args[0] instanceof MCList)) {
			return;
		}
		getPaySchdTgtL().clear();

		@SuppressWarnings("rawtypes")
		MCList list = (MCList)args[0];
		for (int i=0; i<list.size(); i++) {
			getPaySchdTgtL().add().pay_schd_no(list.getStringNE(i, "pay_schd_no"));
		}
	}

	/**
	 * Srch02を実行するかどうか
	 */
	protected boolean isExecSrch() {
		HdrR r = getHdrR();
		return !isNullOr(r.pay_dpt_cd(), r.psppl_cd(), r.trd_cur_cd());
	}

}