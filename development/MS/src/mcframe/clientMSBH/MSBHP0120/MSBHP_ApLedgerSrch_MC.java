package mcframe.clientMSBH.MSBHP0120;

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
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;
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
import mcframe.clientMSUC.MSUCP0050.MSUCP_ClUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_ApLedgerSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_ApLedgerSrch_MC extends MSBHP_ApLedgerSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** ページング情報 */
	FXBAP_PagingParam _dtlApBtnPp = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApLedgerSrch_MC() {
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
	public MSBHP_ApLedgerSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0120_Srch01Caller<P extends MSBHP_ApLedgerSrch, B extends MS_MSBHL0120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0120_Srch01Caller(P p, B b) {
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
		protected void show() {
			super.show();
			if (!isNewSrch()) {
				return;
			}
			// 検索条件をヘッダにコピー
			copyCndToHdr();
			// 為替差損益のクリア
			clearExcGainLoss();
		}
		
		/**
		 * 検索条件として入力された情報を、合計欄にコピーします
		 */
		protected void copyCndToHdr() {
			getHdrR().ac_ym(getCndR().ac_ym());
			getHdrR().trd_cur_cd(getCndR().trd_cur_cd());
			getHdrR().trd_cur_nm(getCndR().trd_cur_nm());
			getHdrR().ap_typ(getCndR().ap_typ());
			getHdrR().ap_typ_nm(getCndR().ap_typ_nm());
			getHdrR().asppl_cd(getCndR().asppl_cd());
			getHdrR().asppl_nm(getCndR().asppl_nm());
			getHdrR().ap_dpt_cd(getCndR().ap_dpt_cd());
			getHdrR().ap_dpt_nm(getCndR().ap_dpt_nm());
			getHdrR().wg_cd(getCndR().wg_cd());
			getHdrR().wg_nm(getCndR().wg_nm());
			getHdrR().rcpt_iv_no(getCndR().rcpt_iv_no());
			getHdrR().rcpt_iv_mng_no(getCndR().rcpt_iv_mng_no());
			getHdrR().purc_act_no(getCndR().purc_act_no());
			getHdrR().wrk_no(getCndR().wrk_no());
			getHdrR().wrk_nm(getCndR().wrk_nm());
		}
		
		/**
		 * 為替差損益をクリアします
		 */
		protected void clearExcGainLoss() {
			if (Cnd_ope_TRD.isSelected()) {
				getHdrR().exc_gain_loss(null);
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			if (!isNewSrch()) {
				return;
			}
			// ステータス制御
			setREFStatus();
			// 検索枠の制御
			cngExpand();
			
			if (Cnd_ope_TRD.isSelected()) {
				// 取引通貨での情報を表示
				columnDtl1_trd_cur_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_inc_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_dscnt_amt.setMode(MCMode.READ_ONLY);
				columnDtl2_trd_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_proc_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_onr_prov_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_proc_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_onr_prov_upri.setMode(MCMode.READ_ONLY);
				// 基準通貨での情報は非表示
				columnDtl1_base_cur_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_inc_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_dscnt_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_proc_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_onr_prov_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_proc_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_onr_prov_upri.setMode(MCMode.INVISIBLE);
				columnDtl2_base_cur_amt.setMode(MCMode.INVISIBLE);
			}
			else if (Cnd_ope_BASE.isSelected()) {
				// 取引通貨での情報は非表示
				columnDtl1_trd_cur_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_inc_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_dscnt_amt.setMode(MCMode.INVISIBLE);
				columnDtl2_trd_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_proc_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_onr_prov_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_proc_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_onr_prov_upri.setMode(MCMode.INVISIBLE);
				// 基準通貨での情報を表示
				columnDtl1_base_cur_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_inc_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_dscnt_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_proc_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_onr_prov_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_proc_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_onr_prov_upri.setMode(MCMode.READ_ONLY);
				columnDtl2_base_cur_amt.setMode(MCMode.READ_ONLY);
			}
			
			// 入金枠が3行になるように調整
			getSplitPane(Dtl1Panel).setDividerLocation(0.65);
		}
		
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			// 通信処理後にページング部品の表示を更新する
			Dtl1_Btn_paging_PPanel.dispUpdate();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			// ステータス制御
			setSRCHStatus();
			// 検索枠制御
			cngExpand();
			// 検索枠の通貨のモード制御
			setModeTrdCurCd();
		}
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			// 通信処理後にページング部品の表示を更新する
			Dtl1_Btn_paging_PPanel.dispUpdate();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		// 検索時のページング対象指定
		setPagingParam(_dtlApBtnPp);
		callMS_MSBHL0120_Srch01();
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_init_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_purc_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ret_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_sw_to_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_cash_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_note_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_account_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_sw_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_end_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_exc_gain_loss_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);

		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl1_trd_unit_cd, columnDtl1_trd_unit_dec_place);
		Dtl1_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_upri_dec_place);
		Dtl1_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);

		Dtl1_base_unit_qty_p_PPanel.setRelateBeans(columnDtl1_base_unit_cd, columnDtl1_base_unit_dec_place);
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_upri_dec_place);
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_proc_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_proc_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_upri_dec_place);
		Dtl1_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_upri_dec_place);
		Dtl1_base_cur_proc_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_proc_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_upri_dec_place);
		Dtl1_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_upri_dec_place);

		Dtl2_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_base_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);

		// ページング部品の設定
		setPaginParam();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
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
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_ac_ym, MSUCP_ClUtil.getApClYm(this).addMonth(1));
		setStatusColumn();
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(ScreenOpePanel);
		}
	}

	protected void setStatusColumn() {
		Dtl1Table.setStatusColumnVisible(false);
		Dtl2Table.setStatusColumnVisible(false);
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 結果をクリア
		clear(getHdrR());
		clear(Dtl1Table);
		clear(Dtl2Table);
		setValueEx(Cnd_trd_cur_cd, null);
		// 検索枠の通貨のモード制御 
		setModeTrdCurCd();
		// 検索枠の制御
		cngExpand();
	}
	
	/**
	 * 検索枠の通貨のモード制御
	 */
	protected void setModeTrdCurCd() {
		if (Cnd_ope_BASE.isSelected()) {
			Cnd_trd_cur_cd.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_TRD.isSelected()) {
			setDefaultMode(Cnd_trd_cur_cd);
		}
	}
	
	/**
	 * 検索枠を開閉します。
	 */
	protected void cngExpand() {
		if (!isNull(getHdrR().ac_ym())) {
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(createDtl1CellConfig());
	}

	protected Dtl1CellConfig createDtl1CellConfig() {
		return new Dtl1CellConfig();
	}

	/**
	 * セル設定クラス
	 */
	public class Dtl1CellConfig extends MAUDP_CellConfig {

		@Override
		protected String getRowNumberColumnValue(int index,
				MCColumnConfig column, MCTable<?> table, boolean selected) {

			// 一覧テーブルの行番号として、全体の行番号を格納する項目の値を返す
			return getDtl1L().get(index).row_num().toString();
		}
	}
	
	/**
	 * ページング情報をページング部品に設定
	 */
	protected void setPaginParam() {
		// ページング対象の通信処理クラスとブロックを指定してページング情報を作成
		Class clazz =  createMS_MSBHL0120_Srch01().getClass();
		_dtlApBtnPp = new FXBAP_PagingParam(getBlockId(getDtl1L()), clazz);
		// 対象とするページング情報をページング部品に設定
		Dtl1_Btn_paging_PPanel.setPagingParam(_dtlApBtnPp);
	}
	
	@Override
	public void callPagingSearcher(FXBAP_PanelBase eventPanel) {
		super.callPagingSearcher(eventPanel);
		if (eventPanel == Dtl1_Btn_paging_PPanel) {
			callMS_MSBHL0120_Srch01();
		}
	}
	
	@Override
	public boolean isPagingAgentHolder() {
		return true;
	}

}