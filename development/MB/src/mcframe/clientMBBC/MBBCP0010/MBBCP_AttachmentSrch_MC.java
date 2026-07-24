package mcframe.clientMBBC.MBBCP0010;

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
import mcframe.clientMAUB.MAUBP0260.*;

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


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Arrays;
import java.io.File;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBCP_AttachmentSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBCP_AttachmentSrch_MC extends MBBCP_AttachmentSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected List<MCColumnConfig> _varColConfig = null;
	protected List<MCTextField> _varCndConfig = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBCP_AttachmentSrch_MC() {
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
	public MBBCP_AttachmentSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBCL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0010_Srch01Caller<P extends MBBCP_AttachmentSrch, B extends MB_MBBCL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBCL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dt_fr, Cnd_dt_to));
			msgList.addAll(checkSmallLarge(Cnd_amt_fr, Cnd_amt_to));
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
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBCL0010_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_file]の押下時の処理
	 */
	@Override
	public void doBtn_open_file(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (null == r) {
			return ;
		}
		
		String path = null;
		try {
			Desktop desktop = Desktop.getDesktop();
			if (r.fs_flg()) {
				File f = new File(r.file_path(), r.file_nm());
				path = f.getAbsolutePath();
				desktop.open(f);
			}
			else {
				path = r.preview_url();
				desktop.browse(new URI(path));
			}
		}
		catch (NullPointerException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (IllegalArgumentException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (IOException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (URISyntaxException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (MCException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
	}

	/**
	 * Panel[Btn]のボタン[open_screen]の押下時の処理
	 */
	@Override
	public void doBtn_open_screen(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (null == r) {
			return ;
		}

		if (MAC_BIZ_TYP.isSLO(r.biz_typ())) {
			openMSBBP1220(r);
		}
		else if (MAC_BIZ_TYP.isPO(r.biz_typ())) {
			openMSBDP0090(r);
		}
		else if (MAC_BIZ_TYP.isSLS_RET(r.biz_typ())) {
			openMSBBP1340(r);
		}
		else if (MAC_BIZ_TYP.isPURC_RET(r.biz_typ())) {
			openMSBDP0160(r);
		}
		else if (MAC_BIZ_TYP.isIV(r.biz_typ())) {
			openMSBEP1730(r);
		}
		else if (MAC_BIZ_TYP.isRCPT_IV(r.biz_typ())) {
			openMSBEP2210(r);
		}
		else if (MAC_BIZ_TYP.isDLV_SLIP_SLS(r.biz_typ())) {
			openMSBEP1490(r, true);
		}
		else if (MAC_BIZ_TYP.isDLV_SLIP_PURC(r.biz_typ())) {
			openMSBEP1490(r, false);
		}
		else if (MAC_BIZ_TYP.isBILL(r.biz_typ())) {
			openMSBGP0290(r);
		}
		else if (MAC_BIZ_TYP.isBILL_RCPT(r.biz_typ())) {
			openMSBHP0190(r);
		}
		else if (MAC_BIZ_TYP.isPAY_NTC(r.biz_typ())) {
			openMSBHP0190(r);
		}
		else if (MAC_BIZ_TYP.isQTN(r.biz_typ())) {
			openMSBBP1110(r);
		}
		else if (MAC_BIZ_TYP.isPAY_NTC_RCPT(r.biz_typ())) {
			openMSBGP0290(r);
		}
		else if (MAC_BIZ_TYP.isSLO_EDI(r.biz_typ())) {
			openMSBBP1220(r);
		}
		else if (MAC_BIZ_TYP.isARR_EDI(r.biz_typ())) {
			openMSBEP2000(r);
		}
		else if (MAC_BIZ_TYP.isACCPT_SLS_EDI(r.biz_typ())) {
			openMSBBP1320(r);
		}
		else if (MAC_BIZ_TYP.isBILL_RCPT_EDI(r.biz_typ())) {
			openMSBHP0180(r);
		}
		else if (MAC_BIZ_TYP.isPO_EDI(r.biz_typ())) {
			openMSBDP0090(r);
		}
		else if (MAC_BIZ_TYP.isSHIP_ACT_EDI(r.biz_typ())) {
			openMSBEP1490(r, true);
		}
		else if (MAC_BIZ_TYP.isSHIP_ACT_IV_EDI(r.biz_typ())) {
			openMSBEP1730(r);
		}
		else if (MAC_BIZ_TYP.isPURC_ACCPT_EDI(r.biz_typ())) {
			openMSBDP0190(r);
		}
		else if (MAC_BIZ_TYP.isBILL_EDI(r.biz_typ())) {
			openMSBGP0290(r);
		}
		else if (MAC_BIZ_TYP.isDLV_SLIP_SLS_EDI(r.biz_typ())) {
			openMSBEP1490(r, true);
		}
		else if (MAC_BIZ_TYP.isDLV_SLIP_RCPT(r.biz_typ())) {
			openMSBDP0190(r);
		}
		else if (MAC_BIZ_TYP.isINSP_INST(r.biz_typ())) {
			openMSBFP0040(r);
		}
		else if (MAC_BIZ_TYP.isINSP_ACT(r.biz_typ())) {
			openMSBFP0060(r);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_dt_fr, getToday().startOfMonth());
		setValueEx(Cnd_dt_to, getToday().endOfMonth());
	}

	protected void setSrchStatus() {
		setSRCHStatus();
	}

	protected void setRefStatus() {
		setREFStatus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		displayCndBizKey();
		setFocus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		displayCndBizKey();
		setFocus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void displayColumn() {
		int i = 0;
		int max = isNull(getCndR().biz_typ()) ? 0 : MAC_BIZ_TYP.key_num(getCndR().biz_typ()).intValue();
		for (MCColumnConfig c : getVarColConfig()) {
			setColModeByFlg(c, i++ < max);
		}
	}

	protected void setColModeByFlg(MCColumnConfig col, boolean isVisible) {
		if (isVisible) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}

	protected List<MCColumnConfig> getVarColConfig() {
		if (_varColConfig == null) {
			MCColumnConfig[] arr = new MCColumnConfig[] {
					columnRslt_biz_key1, columnRslt_biz_key2, columnRslt_biz_key3,
					columnRslt_biz_key4, columnRslt_biz_key5, columnRslt_biz_key6,
					columnRslt_biz_key7, columnRslt_biz_key8, columnRslt_biz_key9,
					columnRslt_biz_key10
			};
			_varColConfig = Arrays.asList(arr);
		}
		return _varColConfig;
	}

	@Override
	public void doCnd_biz_typ_LC(MCEventInfo info) {
		super.doCnd_biz_typ_LC(info);
		displayCndBizKey();
	}
	
	protected void displayCndBizKey() {
		int i = 0;
		int max = isNull(getCndR().biz_typ()) ? 0 : MAC_BIZ_TYP.key_num(getCndR().biz_typ()).intValue();
		for (MCTextField c : getVarCndConfig()) {
			setCndModeByFlg(c, i++ < max);
		}
	}

	protected void setCndModeByFlg(MCTextField cnd, boolean isVisible) {
		if (isVisible) {
			setDefaultMode(cnd);
		}
		else {
			setValueEx(cnd, null);
			cnd.setMode(MCMode.READ_ONLY);
		}
	}

	protected List<MCTextField> getVarCndConfig() {
		if (_varCndConfig == null) {
			MCTextField[] arr = new MCTextField[] {
					Cnd_biz_key1, Cnd_biz_key2, Cnd_biz_key3,
					Cnd_biz_key4, Cnd_biz_key5, Cnd_biz_key6,
					Cnd_biz_key7, Cnd_biz_key8, Cnd_biz_key9,
					Cnd_biz_key10
			};
			_varCndConfig = Arrays.asList(arr);
		}
		return _varCndConfig;
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (null == r || !r.fs_flg() && isNull(r.preview_url())) {
			Btn_open_file.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_file);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		int idx = info.getEventIndex();
		if (compo == RsltTable && idx > -1) {
			doRslt_DC(info);
		}
	}

	protected void doRslt_DC(MCEventInfo info) {
		doBtn_open_file(info);
	}
	
	/** 受注一覧照会画面に遷移 */
	protected void openMSBBP1220(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1220");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("slo_no", row.biz_key1());
		cndR.setStringNE("ope", "0");
		cndR.setStringNE("disp_unit", "1");
		cndR.setBooleanNE("inc_past_flg", true);
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 発注一覧照会画面に遷移 */
	protected void openMSBDP0090(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0090");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("po_no", row.biz_key1());
		cndR.setStringNE("ope", "3");
		cndR.setStringNE("disp_unit", "1");
		cndR.setBooleanNE("inc_past_flg", true);
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 売上返品登録画面に遷移 */
	protected void openMSBBP1340(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1340");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("srch_tgt_no", row.biz_key1());
		cndR.setNumberNE("srch_tgt_rev", MCNumber.valueOf(row.biz_key2()));
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 仕入返品登録画面に遷移 */
	protected void openMSBDP0160(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0160");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("srch_tgt_no", row.biz_key1());
		cndR.setNumberNE("srch_tgt_rev", MCNumber.valueOf(row.biz_key2()));
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** インボイス登録画面に遷移 */
	protected void openMSBEP1730(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1730");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("srch_tgt_no", row.biz_key1());
		cndR.setNumberNE("srch_tgt_rev", MCNumber.valueOf(row.biz_key2()));
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 受領インボイス登録画面に遷移 */
	protected void openMSBEP2210(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2210");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("rcpt_iv_no", row.biz_key1());
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 納品伝票一覧照会画面に遷移 */
	protected void openMSBEP1490(RsltR row, boolean slsFlg) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1490");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("dlv_slip_no", row.biz_key1());
		cndR.setStringNE("ope", slsFlg ? "1" : "2");
		cndR.setBooleanNE("inc_past_flg", true);
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 請求書保存履歴照会画面に遷移 */
	protected void openMSBGP0290(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0290");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("bill_no", row.biz_key1());
		cndR.setNumberNE("bill_rev", MCNumber.valueOf(row.biz_key2()));
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 支払通知書保存履歴照会画面に遷移 */
	protected void openMSBHP0190(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0190");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("pay_chk_no", row.biz_key1());
		cndR.setNumberNE("pay_ntc_rev", MCNumber.valueOf(row.biz_key2()));
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 見積登録画面に遷移 */
	protected void openMSBBP1110(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1110");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("qtn_no", row.biz_key1());
		cndR.setNumberNE("qtn_rev", MCNumber.valueOf(row.biz_key2()));
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 入荷実績一覧登録画面に遷移 */
	protected void openMSBEP2000(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2000");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("purc_act_no", row.biz_key1());
		cndR.setStringNE("ope", "3");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 売上実績一覧登録画面に遷移 */
	protected void openMSBBP1320(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1320");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("sls_act_no", row.biz_key1());
		cndR.setStringNE("ope", "REF");
		cndR.setStringNE("mode", "HDR");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 請求受領明細照会画面に遷移 */
	protected void openMSBHP0180(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0180");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("bill_rcpt_no", row.biz_key1());
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 仕入明細訂正登録画面に遷移 */
	protected void openMSBDP0190(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0190");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("purc_act_no", row.biz_key1());
		cndR.setStringNE("ope", "1");
		cndR.setStringNE("disp_unit", "2");
		cndR.setBooleanNE("inc_past_flg", true);
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();	
	}

	/** 検査指図登録画面に遷移 */
	protected void openMSBFP0040(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0040");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("srch_tgt_no", row.biz_key1());
		cndR.setStringNE("ope", "4");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
		
	/** 検査実績一覧登録画面に遷移 */
	protected void openMSBFP0060(RsltR row) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0060");
		MCRow cndR = MCRow.create();
		cndR.setStringNE("insp_act_no", row.biz_key1());
		cndR.setStringNE("ope", "REF");
		aso.putCnd(cndR);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

}