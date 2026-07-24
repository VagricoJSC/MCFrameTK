package mcframe.clientMSBG.MSBGP0280;

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
 * 画面"MSBGP_CredDtlSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_CredDtlSrch_MC extends MSBGP_CredDtlSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_CredDtlSrch_MC() {
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
	public MSBGP_CredDtlSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0280_Srch01Caller<P extends MSBGP_CredDtlSrch, B extends MS_MSBGL0280_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0280_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setREFStatus();
			calcCredAmt();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		
		callMS_MSBGL0280_Srch01();
	}
	
	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		
		Hdr_inc_qtn_flg.setIgnoreStatus(true);
		Hdr_exc_backord_flg.setIgnoreStatus(true);
		Hdr_exc_po_backord_flg.setIgnoreStatus(true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Hdr_cred_limit_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_cred_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_cred_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_init_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_end_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_sls_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_rcv_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_adv_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_not_appl_note_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_not_appl_adv_note_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_backord_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_qtn_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_init_bal_ap_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_purc_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_pay_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_adv_pay_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ttl_po_backord_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);

		Dtl_init_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_sls_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_cash_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_note_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_xfr_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_sw_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_end_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_not_appl_no_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_backord_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_cred_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl_qtn_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_init_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_purc_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_cash_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_note_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_xfr_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_sw_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_end_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_backord_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		DtlAp_cred_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
	}

	@Override
	public void doHdr_exc_backord_flg_NC(MCEventInfo info) {
		super.doHdr_exc_backord_flg_NC(info);
		
		calcCredAmt();
	}

	@Override
	public void doHdr_inc_qtn_flg_NC(MCEventInfo info) {
		super.doHdr_inc_qtn_flg_NC(info);
		
		calcCredAmt();
	}
	
	@Override
	public void doHdr_exc_po_backord_flg_NC(MCEventInfo info) {
		super.doHdr_exc_po_backord_flg_NC(info);
		
		calcCredAmt();
	}
	/**
	 * 与信枠残高を算出する。
	 */
	protected void calcCredAmt() {
		
		MCNumber credAmt = MCNumber.sum(
				getHdrR().ttl_end_bal(),
				getHdrR().not_appl_note(),
				getHdrR().not_appl_adv_note());
		
		// 金額がnullの場合（検索前）は何もしない
		if (isNull(credAmt)) {
			return;
		}
		
		if (!getHdrR().exc_backord_flg()) {
			credAmt = credAmt.add(getHdrR().ttl_backord());
		}
		if (getHdrR().inc_qtn_flg()) {
			credAmt = credAmt.add(getHdrR().ttl_qtn());
		}
		if (!getHdrR().exc_po_backord_flg()) {
			credAmt = credAmt.subtract(getHdrR().ttl_po_backord());
		}
		
		getHdrR().ttl_cred_amt(credAmt);
		//与信限度額マスタが設定されていない場合、与信限度額、与信枠残は空白とする
		if (!isNull(getHdrR().cred_limit())) {
			getHdrR().cred_bal(getHdrR().cred_limit().subtract(credAmt));
		}
		else {
			getHdrR().cred_bal(null);
		}	
	}

}