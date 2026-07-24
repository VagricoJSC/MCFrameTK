package mcframe.clientMSBG.MSBGP0100;

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
import mcframe.clientMSUC.MSUCP0050.MSUCP_ClUtil;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PagingParam;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_ArLedgerSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_ArLedgerSrch_MC extends MSBGP_ArLedgerSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArLedgerSrch_MC() {
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
	public MSBGP_ArLedgerSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0100_Srch01Caller<P extends MSBGP_ArLedgerSrch, B extends MS_MSBGL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0100_Srch01Caller(P p, B b) {
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
		protected void setMode() {
			super.setMode();

			if (!isNewSrch()) {
				return;
			}
			setREFStatus();
			cngExpand();

			if (Cnd_ope_TRD.isSelected()) {
				columnDtl1_base_cur_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_inc_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_base_cur_dscnt_amt.setMode(MCMode.INVISIBLE);
				columnDtl2_base_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl2_base_cur_setoff_amt.setMode(MCMode.INVISIBLE);

				columnDtl1_trd_cur_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_inc_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_trd_cur_dscnt_amt.setMode(MCMode.READ_ONLY);
				columnDtl2_trd_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl2_setoff_amt.setMode(MCMode.READ_ONLY);
			}
			else if (Cnd_ope_BASE.isSelected()) {
				columnDtl1_trd_cur_upri.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_inc_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_tax_amt.setMode(MCMode.INVISIBLE);
				columnDtl1_trd_cur_dscnt_amt.setMode(MCMode.INVISIBLE);
				columnDtl2_trd_cur_amt.setMode(MCMode.INVISIBLE);
				columnDtl2_setoff_amt.setMode(MCMode.INVISIBLE);

				columnDtl1_base_cur_upri.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_inc_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_tax_amt.setMode(MCMode.READ_ONLY);
				columnDtl1_base_cur_dscnt_amt.setMode(MCMode.READ_ONLY);
				columnDtl2_base_cur_amt.setMode(MCMode.READ_ONLY);
				columnDtl2_base_cur_setoff_amt.setMode(MCMode.READ_ONLY);
			}
			// 入金枠が3行になるための調整
			getSplitPane(Dtl1Panel).setDividerLocation(0.65);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			cngExpand();
			setModeTrdCurCd();
		}

		protected void copyCndToHdr() {
			getHdrR().ac_ym(getCndR().ac_ym());
			getHdrR().trd_cur_cd(getCndR().trd_cur_cd());
			getHdrR().trd_cur_nm(getCndR().trd_cur_nm());
			getHdrR().ar_typ(getCndR().ar_typ());
			getHdrR().ar_typ_nm(getCndR().ar_typ_nm());
			getHdrR().acst_cd(getCndR().acst_cd());
			getHdrR().acst_nm(getCndR().acst_nm());
			getHdrR().ar_dpt_cd(getCndR().ar_dpt_cd());
			getHdrR().ar_dpt_nm(getCndR().ar_dpt_nm());
			getHdrR().wg_cd(getCndR().wg_cd());
			getHdrR().wg_nm(getCndR().wg_nm());
			getHdrR().iv_no(getCndR().iv_no());
			getHdrR().wrk_no(getCndR().wrk_no());
			getHdrR().wrk_nm(getCndR().wrk_nm());
		}

		protected void clearExcGainLoss() {
			if (Cnd_ope_TRD.isSelected()) {
				getHdrR().exc_gain_loss(null);
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

		// 検索処理（Searcher）の実装
		// 検索処理（Searcher）の実装を修正します。
		// 通信処理後は、ページング部品の表示を更新するためにdispUpdateメソッドを実行します。
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();

			Dtl1_Btn_paging_PPanel.dispUpdate();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();

			Dtl1_Btn_paging_PPanel.dispUpdate();
		}

		@Override
		protected void clear() {
			super.clear();
			// 検索前に退避用非表示リストをクリアします。
			if (isNewSrch()) {
				getDtl1_SubL().clear();
			}
		}

		// 検索ボタン押下時に編集中かどうかの判定を行う。
		// 「次へ」「前へ」の検索時は値を保持したまま編集中の状態が残るので常にfalseを返却する。
		// 検索ボタン押下時は親クラスのisDownBlockChanged()を呼び出す
		@Override
		protected boolean isDownBlockChanged() {
			if (isNewSrch()) {
				super.isDownBlockChanged();
			}
			return false;
		}
	}

	FXBAP_PagingParam _dtlArBtnPp = null;
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {

		// ページング処理用に検索ボタンの実装を修正します。
		// 通信処理呼び出し前に、setPagingParamメソッドを使用してページング情報を設定します。
		
		//検索時のページング対象指定
		setPagingParam(_dtlArBtnPp);

		callMS_MSBGL0100_Srch01();
	}

	// --------------------画面起動時イベント START--------------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_init_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_sls_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_ret_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_sw_to_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_rcv_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_end_bal_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_not_appl_note_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Hdr_exc_gain_loss_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);

		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl1_trd_unit_cd, columnDtl1_trd_dec_place);
		Dtl1_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_upri_dec_place);
		Dtl1_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);

		Dtl1_base_unit_qty_p_PPanel.setRelateBeans(columnDtl1_base_unit_cd, columnDtl1_base_dec_place);
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_upri_dec_place);
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);

		Dtl2_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_base_cur_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_base_cur_setoff_amt_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl2_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);

		// ページング部品（FXUCP0130）と対象ブロック間の関連付けを実装します。
		// setupPartsメソッド内で、ページング情報（XPP_PagingParam）を作成し、ページング部品に設定します。

		// ページング対象の通信処理クラスとブロックを指定してページング情報を作成
		Class clazz =  createMS_MSBGL0100_Srch01().getClass();
		_dtlArBtnPp = new FXBAP_PagingParam(getBlockId(getDtl1L()), clazz);

		//対象とするページング情報をページング部品に設定
		Dtl1_Btn_paging_PPanel.setPagingParam(_dtlArBtnPp);
	}

	// ページング部品の「次へ」「前へ」ボタンで実行される検索処理
	// ページング部品の「次へ」「前へ」ボタンで実行される検索処理を実装します。
	// 「次へ」「前へ」ボタンはcallPagingSearcherメソッドを実行します。このメソッド内で通信処理を実行します。
	@Override
	public void callPagingSearcher(FXBAP_PanelBase eventPanel) {
		super.callPagingSearcher(eventPanel);
		if (eventPanel == Dtl1_Btn_paging_PPanel) {
			callMS_MSBGL0100_Srch01();
		}
	}

	// 実装クラスがページングエージェントを保持するクラスとして有効にする
	@Override
	public boolean isPagingAgentHolder() {
		return true;
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

		setValueEx(Cnd_ac_ym, MSUCP_ClUtil.getArClYm(this).addMonth(1));
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(ScreenOpePanel);
		}
	}
	// --------------------画面起動時イベント END----------------------
	// --------------------画面イベント START----------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clear(getHdrR());
		clear(Dtl1Table);
		clear(Dtl2Table);
		setValueEx(Cnd_trd_cur_cd, null);
		setModeTrdCurCd();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setModeTrdCurCd() {
		if (Cnd_ope_BASE.isSelected()) {
			Cnd_trd_cur_cd.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_TRD.isSelected()) {
			setDefaultMode(Cnd_trd_cur_cd);
		}
	}

	protected void cngExpand() {
		if (!isNull(getHdrR().ac_ym())) {
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	@Override
	public void doCnd_wrk_null_flg_NC(MCEventInfo info) {
		super.doCnd_wrk_null_flg_NC(info);
		
		if(Cnd_wrk_null_flg.getValue()) {
			Cnd_wrk_no.clear();
			Cnd_wrk_nm.clear();
			Cnd_wrk_no.setMode(MCMode.READ_ONLY);
			Cnd_wrk_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_wrk_no.setMode(MCMode.ENABLE);
			Cnd_wrk_nm.setMode(MCMode.ENABLE);
		}
	}
	// --------------------画面イベント END------------------------
	// --------------------セルコンフィグ START------------------------
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
	// --------------------セルコンフィグ END------------------------

}