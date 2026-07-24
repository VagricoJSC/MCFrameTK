package mcframe.clientMSBG.MSBGP0160;

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
import mcframe.clientMAUB.MAUBP5050.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_RcvDivReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_RcvDivReg_MC extends MSBGP_RcvDivReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvDivReg_MC() {
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
	public MSBGP_RcvDivReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0160_Upd01Caller<P extends MSBGP_RcvDivReg, B extends MS_MSBGL0160_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0160_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
		
	}


	/**
	 * [MS_MSBGL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0160_Srch01Caller<P extends MSBGP_RcvDivReg, B extends MS_MSBGL0160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0160_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else {
				setREFStatus();
			}
			
			if (getRcvDivL().isEmpty()) {
				CndPanel.focusFirstComponent();
			}
			else {
				RcvDivTable.selectLeftmostColumn(0);
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			// 新規モード
			if (Cnd_ope_UPD.isSelected()) {
				setSRCHStatus();
			}
		}
		
		@Override
		protected void show() {
			super.show();
			
			// 検索時の金額保持
			Hdr1R hdr = getHdr1R();
			hdr.org_rcv_proc_amt(nvl(hdr.rcv_proc_amt(), MCNumber.ZERO));
			hdr.org_com_paid(nvl(hdr.com_paid(), MCNumber.ZERO));
			for (RcvDivR r : getRcvDivL()) {
				r.org_rcv_amt(nvl(r.rcv_amt(), MCNumber.ZERO));
				r.org_com_paid(nvl(r.com_paid(), MCNumber.ZERO));
			}
			setAmountFields();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_rcv_schd_dt_fr, Cnd_rcv_schd_dt_to));
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0160_Srch01();
	}
	
	/**
	 * Panel[Btn1]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn1_select_all(MCEventInfo info) {
		doSelectAll(RcvSchdTable);
	}
	/**
	 * Panel[Btn1]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn1_deselect_all(MCEventInfo info) {
		doDeselectAll(RcvSchdTable);
	}
	/**
	 * Panel[Btn1]のボタン[reflection]の押下時の処理
	 */
	@Override
	public void doBtn1_reflection(MCEventInfo info) {
		MCList<RcvSchdR> schdL = getRcvSchdL().subList(RcvSchdR.$check, true);
		
		if (schdL.isEmpty()) {
			return;
		}
		
		MCList<RcvDivR> divL = getRcvDivL();
		MCList<RcvDivR> addDivL = MCList.create(RcvDivR.class);
		
		MCList<RcvSchdR> grpL = schdL.groupBy(RcvSchdR.$bcst_cd, RcvSchdR.$bill_dpt_cd);
		MCIndexKey idxkey1 = divL.createIndex(RcvDivR.$bcst_cd, RcvDivR.$bill_dpt_cd);
		MCIndexKey idxkey2 = schdL.createIndex(RcvDivR.$bcst_cd, RcvDivR.$bill_dpt_cd);
		for (RcvSchdR grpR :grpL) {
			RcvDivR r = divL.getFirst(idxkey1, grpR.bcst_cd(), grpR.bill_dpt_cd());
			MCList<RcvSchdR> subSchdL = schdL.subList(idxkey2, grpR.bcst_cd(), grpR.bill_dpt_cd());
			MCNumber tRcvSchdAmt = subSchdL.sum(RcvSchdR.$rcv_schd_amt);
			
			// 入金分割枠に請求先、請求部門が同じレコードがある場合は金額のみ差し替える
			if (!isNull(r)) {
				setValueEx(columnRcvDiv_rcv_amt, r.getGUIIndex(), tRcvSchdAmt);
			}
			// レコードがない場合は行追加
			else {
				RcvDivR tmpDivR = RcvDivR.create();
				copy(tmpDivR ,subSchdL.get(0) ,createMap_RcvDivR_RcvSchdR());
				tmpDivR.rcv_amt(tRcvSchdAmt);
				tmpDivR.setStatus(Status.CREATE);
				addDivL.add(tmpDivR);
				tmpDivR.not_proc_bal(tmpDivR.rcv_amt().subtract(nvl(tmpDivR.rcv_proc_amt(), MCNumber.ZERO)));
				tmpDivR.rcv_proc_amt(0);
			}	
		}
		divL.addAll(addDivL);
		setAmountFields();
			
	}
	
	/**
	 * Panel[Btn2]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn2_radd(MCEventInfo info) {
		RcvDivR r = insertRow(RcvDivTable);
		if (!isNull(getHdr1R().bcst_cd())) {
			setValueEx(columnRcvDiv_bcst_cd, r.getGUIIndex(), getHdr1R().bcst_cd());
		}
	}
	
	/**
	 * Panel[Btn2]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn2_rdel(MCEventInfo info) {
		deleteRow(RcvDivTable);
		setAmountFields();
	}
	
	/**
	 * Panel[Btn2]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn2_rcopy(MCEventInfo info) {
		RcvDivR r = copyRow(RcvDivTable);
		if (isNull(r)) {
			return;
		}
		
		r.rcv_no(null);
		r.rcv_proc_amt(null);
		r.not_proc_bal(null);
		r.com_paid(null);
		
		setAmountFields();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBGP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0070(MCEventInfo info) {
		RcvSchdR r = RcvSchdTable.getSelectedMCRow();
		
		if (isNull(r)) {
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0070");
		
		mcframe.clientMSBG.MSBGP0070.CndR to = mcframe.clientMSBG.MSBGP0070.CndR.create();
		
		to.bcst_cd(r.bcst_cd());
		to.bill_dpt_cd(r.bill_dpt_cd());
		to.schd_act_rcv_dt_fr(r.rcv_schd_dt());
		to.schd_act_rcv_dt_to(r.rcv_schd_dt());
		to.bill_no(r.bill_no());
		to.trd_cur_cd(r.trd_cur_cd());
		
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
		
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0160_Upd01();
	}

	
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr1_rcv_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		Hdr1_rcv_proc_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		Hdr1_not_proc_bal_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		Hdr1_com_paid_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);

		RcvSchd_rcv_schd_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		RcvDiv_rcv_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		RcvDiv_rcv_proc_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		RcvDiv_not_proc_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
		RcvDiv_com_paid_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_amt_dec_place);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getRcvDiv_bcst_cd_ListPutter().putBind(BpCols.$i_in_rcst_cd, Hdr1_rcst_cd);
		getRcvDiv_bill_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_rcv_dt);
	}
	
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRcvDiv_rcv_amt.addNCListener(this);
		columnRcvDiv_com_paid.addNCListener(this);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();

		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_rcv_schd_dt_fr, getToday().startOfMonth());
	}
	
	// モード設定
	/**選択行変更時のイベント*/
	@Override
	public void doRcvDiv_NC(MCEventInfo info) {
		super.doRcvDiv_NC(info);
		RcvDivR r = RcvDivTable.getRow(info.getEventIndex());
		
		if (isNull(r)) {
			return;
		}
		
		if (isSame(getStatus(), UPD)) {
			// 入金処理額がある入金は削除できない。
			if (!r.isStatusCreate() && !isNull(r.rcv_proc_amt()) && r.rcv_proc_amt().isPositive()) {
				Btn2_rdel.setMode(MCMode.DISABLE);
			}
			else {
				Btn2_rdel.setMode(MCMode.ENABLE);
			}
		}
	}
	
	@Override
	public void doRcvSchd_NC(MCEventInfo info) {
		super.doRcvSchd_NC(info);
		RcvSchdR r = RcvSchdTable.getRow(info.getEventIndex());
		if (!isNull(r)) {
			Btn_open_MSBGP0070.setMode(MCMode.ENABLE);
		}
		else {
			Btn_open_MSBGP0070.setMode(MCMode.DISABLE);
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnRcvDiv_rcv_amt) {
			doRcvDiv_rcv_amt_NC(info);
		}
		if (nc == columnRcvDiv_com_paid) {
			doRcvDiv_com_paid_NC(info);
		}
	}
	
	
	public void doRcvDiv_rcv_amt_NC(MCEventInfo info) {
		setAmountFields();
		int index = info.getEventIndex();
		setNotProcBal(index);
		
	}
	
	//分割先の未処理残高を更新する。
	protected void setNotProcBal(int i){
		RcvDivR r = getRcvDivL().get(i);
		r.not_proc_bal(nvl(r.rcv_amt(), MCNumber.ZERO).subtract(nvl(r.rcv_proc_amt(), MCNumber.ZERO)));
	}

	public void doRcvDiv_com_paid_NC(MCEventInfo info) {
		setAmountFields();
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (Cnd_ope_UPD.isSelected()) {
			if (getHdr1R().isEmpty()) {
				setSRCHStatus();
			}
			else {
				setUPDStatus();
			}
		}
		else {
			clearContainers(getHdr1R(), getRcvSchdL(), getRcvDivL());
			setREFStatus();
		}
	}
	
	/**
	 * 分割元入金情報の金額フィールドを編集する。
	 */
	protected void setAmountFields() {
		
		MCNumber tRcvAmt = MCNumber.ZERO;
		MCNumber tComPaid = MCNumber.ZERO;
		MCNumber rcvAmtTmp;
		MCNumber comPaidTmp;
		
		for (RcvDivR r : getRcvDivL()) {
			// 更新行とNON行は検索時の金額データを基準に分割元の入金処理額等を計算する。
			if (r.isStatusModify() || r.isStatusNone()) {
				rcvAmtTmp = nvl(r.rcv_amt(), MCNumber.ZERO).subtract(r.org_rcv_amt());
				comPaidTmp = nvl(r.com_paid(), MCNumber.ZERO).subtract(r.org_com_paid());
			}
			else if (r.isStatusCreate()){
				rcvAmtTmp = r.rcv_amt();
				comPaidTmp = r.com_paid();
			}
			// 削除行
			else {
				rcvAmtTmp = r.org_rcv_amt().negate();
				comPaidTmp = r.org_com_paid().negate();
			}
			tRcvAmt = tRcvAmt.add(nvl(rcvAmtTmp,  MCNumber.ZERO));
			tComPaid = tComPaid.add(nvl(comPaidTmp,  MCNumber.ZERO));
			
		}
		
		getHdr1R().rcv_proc_amt(getHdr1R().org_rcv_proc_amt().add(tRcvAmt));
		getHdr1R().not_proc_bal(getHdr1R().rcv_amt().subtract(getHdr1R().rcv_proc_amt()));
		getHdr1R().com_paid(getHdr1R().org_com_paid().subtract(tComPaid));

	}
	
	@Override
	public void setSRCHStatus() {

		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {

		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RcvDivTable.setCellConfig(createRcvDivTableCellConfig());
	}

	/**
	 * RcvDivTable用のセルコンフィグ
	 */
	protected MCCellConfig createRcvDivTableCellConfig() {
		return new RcvDivTableCellConfig();
	}

	/**
	 * RcvDivTable用のセルコンフィグ
	 */
	public class RcvDivTableCellConfig
			extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RcvDivR rcvDivR = (RcvDivR) table.getBaseTable().getRow(index);
			
			if (isNull(rcvDivR)) {
				return super.getPriorMode(index, column, table);
			}

			if (isSame(getStatus(), UPD)) {
				if (column == columnRcvDiv_bcst_cd) {
					if (!isNull(rcvDivR.rcv_proc_amt()) && rcvDivR.rcv_proc_amt().isPositive()) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(getHdr1R().bcst_cd())) {
							return MCMode.READ_ONLY;
						}
						else {
							return MCMode.REQUIRED;
						}
					}
				}
				if (column == columnRcvDiv_bill_dpt_cd) {
					if (!isNull(rcvDivR.rcv_proc_amt()) && rcvDivR.rcv_proc_amt().isPositive()) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(getHdr1R().bcst_cd())) {
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.ENABLE;
						}
					}
				}
				
				if (column == columnRcvDiv_com_paid) {
					if (getHdr1R().com_paid().isZero()) {
						if(isNull(rcvDivR.com_paid())){
							return MCMode.READ_ONLY;
						}
						else if(rcvDivR.com_paid().isPositive()){
							return MCMode.ENABLE;
						}
						return MCMode.READ_ONLY;
					}
					else if (MSC_AUTO_APPL_STS_TYP.isCMPL_INC_COMP(getHdr1R().auto_appl_sts_typ())){
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.ENABLE;
					}
				}
				
				
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected Map_RcvDivR_RcvSchdR<RcvDivR,RcvSchdR> createMap_RcvDivR_RcvSchdR() {
		return new Map_RcvDivR_RcvSchdR<RcvDivR, RcvSchdR>();
	}

	public class Map_RcvDivR_RcvSchdR<D extends RcvDivR, S extends RcvSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvDivR.$bcst_cd, RcvSchdR.$bcst_cd);
			addColumnPathMap(RcvDivR.$bcst_nm, RcvSchdR.$bcst_nm);
			addColumnPathMap(RcvDivR.$bill_dpt_cd, RcvSchdR.$bill_dpt_cd);
			addColumnPathMap(RcvDivR.$bill_dpt_nm, RcvSchdR.$bill_dpt_nm);
			addColumnPathMap(RcvDivR.$rcv_amt, RcvSchdR.$rcv_schd_amt);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.setStatus(Status.CREATE);
		}
	}

}