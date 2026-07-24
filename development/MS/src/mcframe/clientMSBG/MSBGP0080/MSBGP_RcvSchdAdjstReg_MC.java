package mcframe.clientMSBG.MSBGP0080;

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
import mcframe.clientMSUB.MSUBP0010.*;

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
 * 画面"MSBGP_RcvSchdAdjstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_RcvSchdAdjstReg_MC extends MSBGP_RcvSchdAdjstReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvSchdAdjstReg_MC() {
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
	public MSBGP_RcvSchdAdjstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0080_Srch01Caller<P extends MSBGP_RcvSchdAdjstReg, B extends MS_MSBGL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			addDownContainer(getDtl2L());
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			if (Cnd_ope_UPD.isSelected()) {

				setUPDStatus();
				Dtl2Panel.focusFirstComponent();
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setREFStatus();
		}

		@Override
		protected void show() {
			super.show();

			if (!Cnd_ope_REF.isSelected()) {
				addAllValue(getDtl2L(), getDtl1L(), createMap_Dtl2R_Dtl1R());
				setDtl2Row();
			}
		}
	}

	/**
	 * [MS_MSBGL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0080_Upd01Caller<P extends MSBGP_RcvSchdAdjstReg, B extends MS_MSBGL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		protected MS_MSBGL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList){
			
			super.checkForCallStack(msgList);
			
			if(getHdrR().prnt_flg() && getHdrR().bfw_bal_disp_flg()){
				msgList.add(new MCMessage(MSBGP0023));
			}
		}

		
		//源泉税のデータを上り電文から除く
		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<Dtl2R> get = MCList.create(Dtl2R.class);
			for(Dtl2R r : getDtl2L()){
				if(!MAC_AR_STTL_TYP.isWTAX(r.rcv_typ())){
					get.add(r);
				}
			}
			bridge.up1().setAll(get);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0080_Srch01();
	}
	/**
	 * Panel[Dtl2Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_radd(MCEventInfo info) {
		insertRow(Dtl2Table);
	}
	/**
	 * Panel[Dtl2Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rdel(MCEventInfo info) {
		deleteRow(Dtl2Table);
		setDtl2Row();
	}
	/**
	 * Panel[Dtl2Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rcopy(MCEventInfo info) {
		Dtl2R r = copyRow(Dtl2Table);
		if (isNull(r)) {
			return;
		}
		
		r.rcv_schd_no(null);
		setDtl2Row();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0080_Upd01();	
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_sls_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_ret_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_dscnt_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_sw_to_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcv_schd_amt_total_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcv_act_amt_total_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcv_schd_amt_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_rcv_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl2_rcv_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl2Btn_schd_amt_ttl_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl2Btn_schd_amt_diff_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl3_rcv_act_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
	}

	/**選択行変更時のイベント*/
	@Override
	public void doDtl2_NC(MCEventInfo info) {
		super.doDtl2_NC(info);
		setDtl2Btn(info);
	}

	protected void setDtl2Btn(MCEventInfo info) {
		if (0 <= info.getEventIndex()) {

			Dtl2R r = getDtl2L().get(info.getEventIndex());

			if (MAC_AR_STTL_TYP.isWTAX(r.rcv_typ())) {
				Dtl2Btn_rdel.setMode(MCMode.DISABLE);
				Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				Dtl2Btn_rdel.setMode(MCMode.ENABLE);
				Dtl2Btn_rcopy.setMode(MCMode.ENABLE);
			}
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl2Table.setCellConfig(createDtl2TableCellConfig());
	}

	/**
	 * Dtl2Table用のセルコンフィグ
	 */
	protected MCCellConfig createDtl2TableCellConfig() {
		return new Dtl2TableCellConfig();
	}

	/**
	 * Dtl2Table用のセルコンフィグ
	 */
	public class Dtl2TableCellConfig extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl2R dtl = (Dtl2R) table.getBaseTable().getRow(index);

			if (isSame(getStatus(), UPD)) {
				if (MAC_AR_STTL_TYP.isWTAX(dtl.rcv_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl2_rcv_schd_amt_p_PPanel.columnAmt_amt.addNCListener(this);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if(nc == Dtl2_rcv_schd_amt_p_PPanel.columnAmt_amt) doDtl2_rcv_schd_amt_NC(info);
	}

	public void doDtl2_rcv_schd_amt_NC(MCEventInfo info) {

		setDtl2Row();
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	public void setDtl2Row() {

		MCNumber sum = MCNumber.ZERO;
		for (Dtl2R r : getDtl2L().subList(Status.NONE, Status.CREATE, Status.MODIFY)) {
			if (!isNull(r.rcv_schd_amt())) {
				sum = sum.add(r.rcv_schd_amt());
			}
		}

		getDtl2BtnR().schd_amt_ttl(getHdrR().rcv_schd_amt_total());
		getDtl2BtnR().schd_amt_diff(getHdrR().rcv_schd_amt_total().subtract(sum));
	}

	@Override
	public void doDtl2_rcv_schd_dt_NC(MCEventInfo info) {
		super.doDtl2_rcv_schd_dt_NC(info);
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	@Override
	public void doDtl2_rcv_cd_NC(MCEventInfo info) {
		super.doDtl2_rcv_cd_NC(info);
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	@Override
	public void doDtl2_sub_char1_NC(MCEventInfo info) {
		super.doDtl2_sub_char1_NC(info);
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	@Override
	public void doDtl2_sub_char2_NC(MCEventInfo info) {
		super.doDtl2_sub_char2_NC(info);
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	@Override
	public void doDtl2_sub_char3_NC(MCEventInfo info) {
		super.doDtl2_sub_char3_NC(info);
		setValueEx(Hdr_rcv_schd_adjst_flg, true);
	}

	protected Map_Dtl2R_Dtl1R<Dtl2R,Dtl1R> createMap_Dtl2R_Dtl1R() {
		return new Map_Dtl2R_Dtl1R<Dtl2R, Dtl1R>();
	}

	public class Map_Dtl2R_Dtl1R<D extends Dtl2R, S extends Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Dtl2R.$rcv_schd_dt, Dtl1R.$rcv_schd_dt);
			addColumnPathMap(Dtl2R.$rcv_cd, Dtl1R.$rcv_cd);
			addColumnPathMap(Dtl2R.$rcv_nm, Dtl1R.$rcv_nm);
			addColumnPathMap(Dtl2R.$rcv_typ, Dtl1R.$rcv_typ);
			addColumnPathMap(Dtl2R.$rcv_schd_amt, Dtl1R.$rcv_schd_amt);
			addColumnPathMap(Dtl2R.$rcv_schd_no, Dtl1R.$rcv_schd_no);
			addColumnPathMap(Dtl2R.$sub_char1, Dtl1R.$sub_char1);
			addColumnPathMap(Dtl2R.$sub_char2, Dtl1R.$sub_char2);
			addColumnPathMap(Dtl2R.$sub_char3, Dtl1R.$sub_char3);

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
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		if (Cnd_ope_UPD.isSelected()) {
			if (getHdrR().isEmpty()) {
				setSRCHStatus();
			}
			else {
				setUPDStatus();
				addAllValue(getDtl2L(), getDtl1L(), createMap_Dtl2R_Dtl1R());
				Dtl2Table.adjustAllWidth();
				setDtl2Row();
			}
		}
		else {
			clearContainers(getHdrR(), getDtl1L(), getDtl2L(), getDtl2BtnR(), getDtl3L());	
			setREFStatus();
		}
	}

}