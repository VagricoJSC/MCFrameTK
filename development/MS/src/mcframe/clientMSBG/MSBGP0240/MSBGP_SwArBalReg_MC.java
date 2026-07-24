package mcframe.clientMSBG.MSBGP0240;

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
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0320.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_SwArBalReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_SwArBalReg_MC extends MSBGP_SwArBalReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_SwArBalReg_MC() {
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
	public MSBGP_SwArBalReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0240_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Upd01Caller<P extends MSBGP_SwArBalReg, B extends MS_MSBGL0240_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0240_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected boolean checkForCall() {
			if (!super.checkForCall()) {
				return false;
			}
			if (!checkForUpd((MCList<SwFrR>)getCheckedRows(panel))) {
				return false;
			}
			return true;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

	}
	
	/**
	 * [MS_MSBGL0240_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Upd02Caller<P extends MSBGP_SwArBalReg, B extends MS_MSBGL0240_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0240_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected boolean checkForCall() {
			if (!super.checkForCall()) {
				return false;
			}
			if (!checkForUpd((MCList<SwFrR>)getCheckedRows(panel))) {
				return false;
			}
			return true;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}


	/**
	 * [MS_MSBGL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Srch01Caller<P extends MSBGP_SwArBalReg, B extends MS_MSBGL0240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0240_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			if (getSwFrL().isEmpty()) {
				return;
			}
			
			showVal();
			setTrdCur();
			
			setValueEx(Sw_sw_dt, getToday());
			setValueEx(Sw_ac_dt, getToday());
			setValueEx(Sw_bill_basis_dt, getToday());
			
			getSwR().setStatus(Status.NONE);	
			getSwToR().setStatus(Status.NONE);
			
		}
		
		@Override
		protected void setMode() {
			setUPDStatus();
		}		
		
		@Override
		protected void setModeNoDown() {
			clearWhenNoDown();
			setSRCHStatus();
		}
	}
	
	/**
	 * 登録前チェック
	 * 
	 * @param チェック対象の明細（選択チェックされた行のみを渡すこと）
	 * @return 登録可否
	 */
	protected boolean checkForUpd(MCList<SwFrR> chkL) {
		for (SwFrR r : chkL) {

			// 振替元と振替先の売掛先、売掛部門、案件が同じ場合
			// 案件が同一であるかは以下の判定を行う
			// ・案件処理区分が「案件別債権管理する」かつ振替元、振替先の案件が等しい
			// ・案件処理区分が「案件別債権管理しない」かつ振替元の案件がNULL文字
			// ・案件処理区分がNULL
			if (isSame(r.acst_cd(), getSwToR().acst_cd())
					&& isSame(r.ar_dpt_cd(), getSwToR().ar_dpt_cd())
					&& isSame(r.bill_dpt_cd(), getSwToR().bill_dpt_cd())
					&& (MSC_WRK_OPE_TYP.isWRK(getSwToR().wrk_ope_typ())
							// この時点では通信用の案件ＣＤに値がないので表示用でチェック
							&& isSame(r.wrk_no(), getSwToR().wrk_no())
							|| MSC_WRK_OPE_TYP.isNOT_WRK(getSwToR().wrk_ope_typ())
							&& MAC_STR.isNULL_VAL(r.wrk_no()) || isNull(getSwToR()
							.wrk_ope_typ()))) {
				
				// ダイアログで確認
				if (confirm(MSBGP0010) != MCMessageBox.YES_OPTION) {
					SwFrTable.focusCellAt(r.getGUIIndex(), columnSwFr_check);
					return false;
				}
				else {
					break;
				}				
			}
			
		}
		return true;
		
	}
	
	/**
	 * [MS_MSBGL0240_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Srch02Caller<P extends MSBGP_SwArBalReg, B extends MS_MSBGL0240_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0240_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			if (getSwFrL().isEmpty()) {
				return;
			}
			
			showVal();
			setTrdCur();
			setValueEx(Sw_sw_dt, getToday());
			setValueEx(Sw_ac_dt, getToday());

			getSwR().setStatus(Status.NONE);	
			getSwToR().setStatus(Status.NONE);
		}
		
		@Override
		protected void setMode() {
			setUPDStatus();
			Sw_bill_basis_dt.setMode(MCMode.READ_ONLY);
		}
		
		@Override
		protected void setModeNoDown() {
			clearWhenNoDown();
			setSRCHStatus();
		}
	}

	public void setTrdCur(){
		getSwToR().trd_cur_cd(getCndR().trd_cur_cd());
		getSwToR().trd_cur_nm(getCndR().trd_cur_nm());
		getSwToR().amt_dec_place(getCndR().amt_dec_place());
		
	}
	

	protected void showVal() {
		clearSwToRExceptTrd();
		clearSwToR();
	}
	
	/**
	 * SwRの取引以外をクリアする
	 * 
	 */
	protected void clearSwToRExceptTrd() {
		String tmpTrd = getSwR().trd_cd();
		
		getSwR().clear();
		setValueEx(Sw_trd_cd, tmpTrd);
	}
	
	protected void clearSwToR() {
		setValueEx(SwTo_acst_cd, null);
		setValueEx(SwTo_ar_dpt_cd, null);
		setValueEx(SwTo_bill_dpt_cd, null);
		setValueEx(SwTo_wrk_no, null);
		setValueEx(SwTo_wrk_ope_typ, null);
		setValueEx(SwTo_tgt_sw_amt, null);
		setValueEx(SwTo_trd_cur_cd, null);
		setValueEx(SwTo_trd_cur_nm, null);
	}
	
	protected void clearWhenNoDown() {
		getSwR().clear();
		clearSwToR();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Sw_usr_dpt_p_PPanel.setRelateBeans(Sw_ac_dt);

		SwFr_inc_tax_amt_p_PPanel.setRelateBeans(columnSwFr_trd_cur_cd, columnSwFr_amt_dec_place);
		SwFr_tgt_sw_amt_p_PPanel.setRelateBeans(columnSwFr_trd_cur_cd, columnSwFr_amt_dec_place);
		SwFr_not_appl_wtax_amt_p_PPanel.setRelateBeans(columnSwFr_trd_cur_cd, columnSwFr_amt_dec_place);

		SwTo_tgt_sw_amt_p_PPanel.setRelateBeans(SwTo_trd_cur_cd, SwTo_amt_dec_place);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getSwTo_ar_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Sw_ac_dt);
		getSwTo_bill_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Sw_ac_dt);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Typ_typ_Group, Typ_typ_bill_bal.getActionCommand());
		setCurVal();
		setAvailTrd();
		setSwMode();
	}

	protected void setCurVal() {
		setValueEx(Cnd_trd_cur_cd, getBaseCur().cur_cd());
	}
	
	/**
	 * 請求残高振替と未請求残高振替の表示を切り替える
	 */
	protected void setSwMode() {
		// 請求残高振替
		if (isSame(Typ_typ_Group.getValue(), Typ_typ_bill_bal.getActionCommand())) {
			setBillBalMode();
		}
		// 未請求残高振替
		else {
			setNotBillMode();
		}
	}
	
	/**
	 * 未請求残高振替の表示設定
	 */
	protected void setNotBillMode() {
		Cnd_not_bill_inc_flg.setMode(MCMode.READ_ONLY);
		
		columnSwFr_bill_flg.setMode(MCMode.INVISIBLE);
		columnSwFr_tgt_sw_amt.setMode(MCMode.INVISIBLE);
		columnSwFr_not_appl_wtax_amt.setMode(MCMode.INVISIBLE);
		columnSwFr_bill_dt.setMode(MCMode.INVISIBLE);
		columnSwFr_bill_no.setMode(MCMode.INVISIBLE);		
	}

	/**
	 * 請求残高振替の表示設定
	 */
	protected void setBillBalMode() {
		Cnd_not_bill_inc_flg.setMode(getDefaultMode(Cnd_not_bill_inc_flg));
		
		columnSwFr_bill_flg.setMode(getDefaultMode(columnSwFr_bill_flg));
		columnSwFr_tgt_sw_amt.setMode(getDefaultMode(columnSwFr_tgt_sw_amt));
		columnSwFr_bill_dt.setMode(getDefaultMode(columnSwFr_bill_dt));
		columnSwFr_bill_no.setMode(getDefaultMode(columnSwFr_bill_no));
		columnSwFr_iv_no.setMode(getDefaultMode(columnSwFr_iv_no));

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Typ_typ_bill_bal.isSelected()) {
			callMS_MSBGL0240_Srch01();
		}
		if (Typ_typ_not_bill.isSelected()) {
			callMS_MSBGL0240_Srch02();
		}
	}
	
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (SwFrR row : SwFrTable.getViewRows()) {
			if (isEditable(columnSwFr_check, row.getGUIIndex())) {
				row.check(true);
			}
		}
		setAmtFields();
	}
	
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (SwFrR row : SwFrTable.getViewRows()) {
			if (isEditable(columnSwFr_check, row.getGUIIndex())) {
				row.check(false);
			}
		}
		setAmtFields();
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Typ_typ_bill_bal.isSelected()) {
			callMS_MSBGL0240_Upd01();
		}
		if (Typ_typ_not_bill.isSelected()) {
			callMS_MSBGL0240_Upd02();
		}
	}
	
	///////////////////////イベント実装/////////////////////
	
	@Override
	public void doSwTo_wrk_ope_typ_LC(MCEventInfo info){
		super.doSwTo_wrk_ope_typ_LC(info);
		if (MSC_WRK_OPE_TYP.isWRK(getSwToR().wrk_ope_typ())) {
			// 指定した案件に振替
			SwTo_wrk_no.setMode(MCMode.REQUIRED);
		}
		else if (MSC_WRK_OPE_TYP.isNOT_WRK(getSwToR().wrk_ope_typ())) {
			setValueEx(SwTo_wrk_no, null);
			SwTo_wrk_no.setMode(MCMode.READ_ONLY);
		}
		else {
			// 案件は振替しない
			setValueEx(SwTo_wrk_no, null);
			SwTo_wrk_no.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override
	public boolean doTyp_typ_VC(MCEventInfo info) {
		// 登録枠編集後、ラジオボタンを移動させた場合にダイアログを表示する
		if (getStatus() == UPD
				&& (!isStatusNone(getSwFrL()) || !isStatusNone(getSwR()) || !isStatusNone(getSwToR()))) {
			return confirmRegDataClear();
		}
		return super.doTyp_typ_VC(info);
	}
	
	@Override
	public void doSwFr_check_NC(MCEventInfo info) {
		super.doSwFr_check_NC(info);
		setAmtFields();
	}
	
	@Override
	public void doSw_sw_dt_NC(MCEventInfo info) {
		super.doSw_sw_dt_NC(info);
		setValueEx(Sw_ac_dt, getSwR().sw_dt());
	}
	

	
	/**
	 * 各種金額フィールドの設定
	 */
	protected void setAmtFields() {
		if (getSwFrL().size() == 0) {
			getSwToR().tgt_sw_amt(null);
			return;
		}
		MCNumber sum = MCNumber.ZERO;
		// 請求残高振替
		if (isSame(Typ_typ_Group.getValue(), Typ_typ_bill_bal.getActionCommand())) {
			sum = getSwFrL().subList(SwFrR.$check, true).sum(SwFrR.$tgt_sw_amt);
		}
		// 未請求明細振替
		else {
			sum = getSwFrL().subList(SwFrR.$check, true).sum(SwFrR.$inc_tax_amt);
		}
		getSwToR().tgt_sw_amt(sum);
	}
	
	@Override
	public void doTyp_typ_NC(MCEventInfo info) {
		super.doTyp_typ_NC(info);

		// 画面表示切替
		setSRCHStatus();
		setSwMode();
		getSwFrL().clear();
		getSwR().clear();
		setAvailTrd();

		// 通貨以外をクリア
		setValueEx(SwTo_acst_cd, null);
		setValueEx(SwTo_ar_dpt_cd, null);
		setValueEx(SwTo_bill_dpt_cd, null);
		setValueEx(SwTo_wrk_ope_typ, null);
		setValueEx(SwTo_wrk_no, null);
		setValueEx(SwTo_trd_cur_cd, null);
		setValueEx(SwTo_trd_cur_nm, null);
		
		setValueEx(SwTo_tgt_sw_amt, null);
		setValueEx(Cnd_not_bill_inc_flg, false);

		setValueEx(Cnd_not_bill_inc_flg, false);
		
		// コンテナ「SwTo」だけはclear()メソッドでクリアしておらず
		// ステータスが変更されていた場合残ってしまうためクリアする
		getSwToR().setStatus(Status.NONE);
	}
	
	/**
	 * 取引ＣＤに選択可能な値をセットする
	 * 
	 */
	protected void setAvailTrd(){
		
		// 伝票部品に取引区分を渡して、選択されているラジオボタンで選択可能な
		// 取引区分のみを選択可能にする
		if (Typ_typ_Group.getSelectedButton() == Typ_typ_bill_bal) {
			getSw_trd_cd_ListPutter().putBind(TrdCols.$i_trd_ptn_typ, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value());
		}
		else if (Typ_typ_Group.getSelectedButton() == Typ_typ_not_bill) {
			getSw_trd_cd_ListPutter().putBind(TrdCols.$i_trd_ptn_typ, MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.value());
		}
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setSwMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setSwMode();
		SwFrTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setSwMode();
		CndPanel.focusFirstComponent();
	}
	
	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		SwFrTable.setCellConfig(crtHdrTableCellConfig());
	}

	protected HdrTableCellConfig crtHdrTableCellConfig() {
		return new HdrTableCellConfig();
	}

	protected class HdrTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(Typ_typ_Group.getValue(), Typ_typ_not_bill.getActionCommand())) {
				if (column == columnSwFr_check) {
					SwFrR r = getSwFrL().getFirst(SwFrR.$check, true);
					// 選択済みの明細と異なる計上年月の行は選択できない
					if (!isNull(r) && !isSame(getSwFrL().get(index).ac_ym(), r.ac_ym())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	public MCTable getListRegTable() {
		return SwFrTable;
	}

}