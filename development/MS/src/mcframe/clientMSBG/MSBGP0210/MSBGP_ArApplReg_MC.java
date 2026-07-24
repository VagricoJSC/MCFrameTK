package mcframe.clientMSBG.MSBGP0210;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0420.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_ArApplReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_ArApplReg_MC extends MSBGP_ArApplReg_MC_A implements IfOpePanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	//入金検索時に上書きされないフィールドが変更された場合にコンテナのステータスがNONE
	//になるのを防ぐフラグ
	protected boolean _isRmrksChange = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArApplReg_MC() {
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
	public MSBGP_ArApplReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Upd01Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0210_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getHdrR()));
			msgList.addAll(panel.checkReq(getRcvR()));
			msgList.addAll(panel.checkReq(getBillDL()));
			for (DtlR r : getDtlL().subList(DtlR.$check, true)){
				msgList.addAll(panel.checkReq(r));
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(resetUp(bridge.up2()));
		}
	}

	/**
	 * [MS_MSBGL0210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Del01Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBGL0210_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * [MS_MSBGL0210_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Ins01Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0210_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getHdrR()));
			msgList.addAll(panel.checkReq(getRcvR()));
			msgList.addAll(panel.checkReq(getBillDL()));
			for (DtlR r : getDtlL().subList(DtlR.$check, true)){
				msgList.addAll(panel.checkReq(r));
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(resetUp(bridge.up2()));
		}
	}

	protected MCList<DtlR> resetUp(MCList <DtlR> dtlL) {
		MCList<DtlR> upL = MCList.create(DtlR.class);
		for (DtlR dtlR : dtlL) {
			if (!dtlR.isStatusNone() || dtlR.check()) {
				upL.add(dtlR);
			}
		}
		return upL;
	}

	/**
	 * [MS_MSBGL0210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch02Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		String _arSttlCd2;	// 相殺方法CD
		String _trdRmrks;	// 取引備考
		String _subChar1;	// 予備１
		String _subChar2;	// 予備２
		String _subChar3;	// 予備３
		String _bdDptCd;	// 負担部門
		String _bdDptNm;	// 負担部門名
		protected boolean hasErr = false;// 取引ＣＤと入金情報の組み合わせエラーがある場合、true

		protected MS_MSBGL0210_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			// HdrRの入金実績情報をRcvRにコピーする。
			bridge.up0().rcv_act_no(getHdrR().rcv_act_no());
			bridge.up0().rcv_act_seq(getHdrR().rcv_act_seq());
			bridge.up0().ac_dt(getHdrR().ac_dt());

			// 検索前の値を取得
			_arSttlCd2 = getRcvR().ar_sttl_cd2();
			_trdRmrks = getRcvR().trd_rmrks();
			_bdDptCd = getRcvR().bd_dpt_cd();
			_bdDptNm = getRcvR().bd_dpt_nm();
			_subChar1 = getRcvR().sub_char1();
			_subChar2 = getRcvR().sub_char2();
			_subChar3 = getRcvR().sub_char3();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Rcv_rcv_no));
			msgList.addAll(panel.checkReq(Hdr_ac_dt));
		}

		@Override
		protected void show() {

			if (!checkAvailTrd(getHdrR().trd_ptn_typ(), bridge.down0().rcv_dat_typ())) {
				afterErrTrd();
				return;
			}

			setDown();

			// 相殺方法に変更がある場合、相殺額をクリアする
			if (!isSame(bridge.down0().ar_sttl_cd2(), _arSttlCd2)) {
				setValueEx(columnDtl_amt2, null);
			}
			// 相殺方法がNULLの場合、相殺額をクリアする
			if (isNull(bridge.down0().ar_sttl_cd2())) {
				setValueEx(columnDtl_amt2, null);
			}

			super.show();

			// 入金先が設定されていない入金の場合、消込明細をクリアする
			if (isNull(getRcvR().rcst_cd())) {
				getDtlL().clear();
			}
		}

		protected void afterErrTrd() {
			doRcv_rcv_no_sub_NC();
			bridge.down0().clear();
			bridge.down0().rcv_no(getRcvR().rcv_no());
			Hdr_trd_cd.mcRequestFocus();
			hasErr = true;
		}

		protected void setDown() {
			bridge.down0().trd_rmrks(_trdRmrks); // 伝票備考は入金検索で取得していないので、元の値を保持する
			bridge.down0().sub_char1(_subChar1);
			bridge.down0().sub_char2(_subChar2);
			bridge.down0().sub_char3(_subChar3);
			if (!isNull(bridge.down0().ar_sttl_cd2())) {
				bridge.down0().bd_dpt_cd(_bdDptCd);
				bridge.down0().bd_dpt_nm(_bdDptNm);
			}
			bridge.down0().old_rcst_cd(bridge.down0().rcst_cd());
			bridge.down0().old_bcst_cd(bridge.down0().bcst_cd());
			bridge.down0().old_bill_dpt_cd(bridge.down0().bill_dpt_cd());
		}

		@Override
		protected void setMode() {
			//ステータスを戻す
			if(_isRmrksChange){
				getHdrR().setStatus(Status.MODIFY);
				getRcvR().setStatus(Status.MODIFY);
			}
			if (!hasErr) {
				setModeByTrdTyp();
				setRefRcvMode();
				setAmt2Mode();
				setBankAcMode();
				setAmountFields();
				setModeArSttl2();
				setModeBySloNo();
			}
			else {
				if (Cnd_ope_INS.isSelected()) {
					setINS_SRCH_RCVStatus();
				}
				else if (Cnd_ope_UPD.isSelected()) {
					setUPD_SRCH_RCVStatus();
				}
			}
		}

		@Override
		protected void setModeNoDown() {
			clearWhenRcvNoNC();
			getRcvR().rcv_dat_typ(null);
			if (Cnd_ope_INS.isSelected()) {
				setINS_SRCH_RCVStatus();
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setUPD_SRCH_RCVStatus();
			}
		}

		@Override
		protected void moveFocus() {
			if (!hasErr) {
				RcvPanel.focusFirstComponent();
			}
		}
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			RcvPanel.focusFirstComponent();
		}

		/**
		 * 入金情報検索時、各種項目が設定されていない入金情報を参照していた場合は、各項目は入力できる。
		 */
		protected void setRefRcvMode() {
			if (isNull(getRcvR().rcst_cd())) {
				Rcv_rcst_cd.setMode(MCMode.REQUIRED);
				Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
				Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
			}
			else {
				if (isNull(getRcvR().bcst_cd())) {
					Rcv_bcst_cd.setMode(MCMode.ENABLE);
				}
				if (isNull(getRcvR().bill_dpt_cd())) {
					Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
				}
			}
		}
	}

	/**
	 * [MS_MSBGL0210_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch03Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0210_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			copy(bridge.up0(), getRcvR(), getHdrR(), createMap_DtlCndR_RcvR());
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			// 相殺の場合
			if (isSetoff()) {
				msgList.addAll(panel.checkReq(Rcv_setoff_bcst_cd));
				msgList.addAll(panel.checkReq(Rcv_setoff_trd_cur_cd));
			}
			else {
				msgList.addAll(panel.checkReq(Rcv_rcst_cd));
				msgList.addAll(panel.checkReq(Rcv_trd_cur_cd));
			}

		}

		@Override
		protected void afterCall() {
			super.afterCall();

			// 売掛明細消込登録の明細と売掛消込登録の明細を紐付ける
			setGrpSeq(bridge.down0());

			// 売掛明細消込登録と連携していた情報はクリアする
			getBillDL().clear();
			getSrch_CndL().clear();
			// 相殺方法がNULLの場合、相殺額をクリアする
			if (isNull(getRcvR().ar_sttl_cd2())) {
				bridge.down0().setValue(DtlR.$amt2, null);
			}
		}

		@Override
		protected void show() {
			super.show();
			copyAmt1ToAmt4();
			if (Cnd_ope_UPD.isSelected()) {
				// 伝票明細が登録されている行のチェックをONにする
				checkCheck();
			}
			setAmountFields();
		}


		/**
		 *入金実績明細が登録されている行の消込フラグをオンにする 
		 */
		protected void checkCheck() {
			for (DtlR r : getDtlL()) {
				if (!isNull(r.rcv_act_d_no())) {
					r.check(true);
				}
			}
		}

		@Override
		protected void setMode() {
			setDtlAmtModeREQ();
			setBtnMode();
			setModeArSttl2();
			setModeDebtNm();
		}

		@Override
		protected void setModeNoDown() {
			// モード変更なし
		}

		@Override
		protected void moveFocus() {
			if (!isSetoff()) {
				DtlTable.focusCellAt(0, columnDtl_amt1);
			}
			else {
				DtlTable.focusCellAt(0, columnDtl_amt4);
			}
		}

		/**
		 * ブロック間データコピー　HdrR、RcvR >  DtlCndR
		 * 
		 * @return
		 */
		protected Map_DtlCndR_RcvR<DtlCndR,RcvR,HdrR> createMap_DtlCndR_RcvR() {
			return new Map_DtlCndR_RcvR<DtlCndR, RcvR, HdrR>();
		}

		public class Map_DtlCndR_RcvR<D extends DtlCndR, S extends RcvR, W extends HdrR> extends MAUCC_RowMapperWith<D,S,W>{

			protected W _hR;

			@Override
			public void setWith(W _hR) {
				this._hR = _hR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlCndR.$rcv_act_no, RcvR.$rcv_act_no);
				addColumnPathMap(DtlCndR.$rcv_act_seq, RcvR.$rcv_act_seq);
				addColumnPathMap(DtlCndR.$slo_no, RcvR.$slo_no);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_no(_hR.rcv_act_no());
				dest.rcv_act_seq(_hR.rcv_act_seq());
				dest.trd_ptn_typ(_hR.trd_ptn_typ());

				// 売掛金その他相殺以外
				if (!MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(_hR.trd_ptn_typ())) {
					dest.rcst_cd(src.rcst_cd());
					dest.bcst_cd(src.bcst_cd());
					dest.bill_dpt_cd(src.bill_dpt_cd());
					dest.trd_cur_cd(src.trd_cur_cd());
					dest.ar_sttl_cd1(src.ar_sttl_cd1());
				}
				// 売掛金その他相殺
				else {
					dest.setoff_rcv_no(src.setoff_rcv_no());
					dest.setoff_bcst_cd(src.setoff_bcst_cd());
					dest.setoff_trd_cur_cd(src.setoff_trd_cur_cd());
					dest.setoff_sttl_cd1(src.setoff_sttl_cd1());
				}
			}
		}
	}

	/**
	 * 明細のamt1をamt4にコピーする<BR>
	 * 検索時、その他相殺の明細金額はamt1として取得してくるので、表示するために<BR>
	 * amt4へ値をコピーする。
	 */
	protected void copyAmt1ToAmt4() {
		for (DtlR r : getDtlL()) {
			r.amt4(r.amt1());
		}
	}

	/**
	 * 売掛消込の明細と売掛明細消込の明細を紐付ける連番を付与する
	 * 
	 */
	protected void setGrpSeq(MCList<DtlR> dtlL) {
		MCNumber num = MCNumber.ONE;
		for (DtlR dtlR : dtlL) {
			dtlR.grp_seq(num);
			num = num.add(MCNumber.ONE);
		}
	}

	/**
	 * [MS_MSBGL0210_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch04Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		String _setoffTrdRmrks;	// 相殺取引備考
		String _setoffSubChar1;	// 相殺予備１
		String _setoffSubChar2;	// 相殺予備２
		String _setoffSubChar3;	// 相殺予備３
		protected boolean hasErr = false;	// 取引ＣＤと入金情報の組み合わせエラーがある場合、true

		protected MS_MSBGL0210_Srch04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Rcv_setoff_rcv_no));
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			// HdrRの入金実績情報をRcvRにコピーする。
			bridge.up0().rcv_act_no(getHdrR().rcv_act_no());
			bridge.up0().rcv_act_seq(getHdrR().rcv_act_seq());

			// 検索前の値を取得
			_setoffTrdRmrks = getRcvR().setoff_trd_rmrks();
			_setoffSubChar1 = getRcvR().setoff_sub_char1();
			_setoffSubChar2 = getRcvR().setoff_sub_char2();
			_setoffSubChar3 = getRcvR().setoff_sub_char3();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

		}

		@Override
		protected void show() {

			if (!checkAvailTrd(getHdrR().trd_ptn_typ(), bridge.down0()
					.setoff_rcv_dat_typ())) {

				// クリアする
				
				bridge.down0().clear();
				// 入金ＮＯだけ残す
				bridge.down0().setoff_rcv_no(getRcvR().setoff_rcv_no());
				Hdr_trd_cd.mcRequestFocus();
				hasErr = true;

				return;
			}

			// 伝票備考は入金検索で取得していないので、元の値を保持する
			bridge.down0().setoff_trd_rmrks(_setoffTrdRmrks);
			// 伝票の計上日に入金の計上日をセットする
			getHdrR().ac_dt(bridge.down0().ac_dt());
			// 予備１～３は入金検索で取得していないので、元の値を保持する
			bridge.down0().setoff_sub_char1(_setoffSubChar1);
			bridge.down0().setoff_sub_char2(_setoffSubChar2);
			bridge.down0().setoff_sub_char3(_setoffSubChar3);
			bridge.down0().old_setoff_bcst_cd(bridge.down0().setoff_bcst_cd());
			bridge.down0().setoff_not_proc_bal_w(bridge.down0().setoff_not_proc_bal());

			super.show();
		}

		@Override
		protected void moveFocus() {
			if (!hasErr) {
				RcvPanel.focusFirstComponent();
			}
		}

		@Override
		protected void setMode() {
			// ステータスを戻す
			if (_isRmrksChange) {
				getRcvR().setStatus(Status.MODIFY);
			}
			if (!hasErr) {
				copySetoffCurToRcvCur();
				setRefRcvMode();
				setModeByTrdTyp();
				setAmt2Mode();
				setAmountFields();
				setModeBySloNo();
			}
			else {
				if (Cnd_ope_INS.isSelected()) {
					setINS_SRCH_RCV_SETOFFStatus();
				}
				else if (Cnd_ope_UPD.isSelected()) {
					setUPD_SRCH_RCV_SETOFFStatus();
				}
			}
		}

		@Override
		protected void setModeNoDown() {
			clearWhenSetoffRcvRcvNoNC();
			getRcvR().setoff_rcv_dat_typ(null);
			if (Cnd_ope_INS.isSelected()) {
				setINS_SRCH_RCV_SETOFFStatus();
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setUPD_SRCH_RCV_SETOFFStatus();
			}
		}

		/**
		 * 入金情報検索時、各種項目が設定されていない入金情報を参照していた場合は、各項目は入力できる。
		 */
		protected void setRefRcvMode() {
			if (isNull(getRcvR().setoff_bcst_cd())) {
				Rcv_setoff_bcst_cd.setMode(MCMode.REQUIRED);
			}
		}
	}

	/**
	 * [MS_MSBGL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch01Caller<P extends MSBGP_ArApplReg, B extends MS_MSBGL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getHdrR(), getRcvR(), getDtlL(), getTotalR());
		}

		@Override
		protected void setMode() {
			super.setMode();

			setModeByTrdCd();
			setDtlAmtModeREQ();
			setBillDRmrksMode();

			// 売掛金その他相殺のモード設定
			if (isSetoff()) {
				setSetoffTabMode();
				setSettoffTaxMode();
			}
			else{
				setTaxMode();
				setModeBySloNo();
				setNoteMode();
			}
			setModeDebtNm();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			bridge.down0().can_ac_dt(bridge.down0().ac_dt());

			// 伝票備考の変更フラグをリセット
			_isRmrksChange = false;

			// 売掛明細消込対象の明細と売掛消込の明細との紐付け
			setGrpSeq(bridge.down2());
			getBillDL().clear();
			getSrch_CndL().clear();

			// 相殺方法がNULLの場合、相殺額をクリアする
			if (isNull(bridge.down1().ar_sttl_cd2())) {
				bridge.down2().setValue(DtlR.$amt2, null);
			}
		}

		@Override
		protected void show() {
			super.show();

			// 検索結果の明細は、伝票明細登録済みなので、全行の消込フラグをオンにする
			for (DtlR r : getDtlL()) {
					r.check(true);
			}
			setDefaultSrch();
			getRcvR().base_cur_cd(getBaseCur().cur_cd());
			copyAmt1ToAmt4();
			setAmountFields();
			getRcvR().xrate_cd(getCo().sls_xrate_cd());
			getRcvR().setoff_xrate_cd(getCo().sls_xrate_cd());
			statusClear();
		}
	}

	/**
	 * Panel[Rcv]のボタン[setoff_srch]の押下時の処理
	 */
	@Override
	public void doRcv_setoff_srch(MCEventInfo info) {
		callMS_MSBGL0210_Srch04();
	}
	/**
	 * Panel[DtlCnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doDtlCnd_srch(MCEventInfo info) {
		callMS_MSBGL0210_Srch03();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0210_Srch01();
	}
	/**
	 * Panel[Rcv]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doRcv_srch(MCEventInfo info) {
		callMS_MSBGL0210_Srch02();
	}
//	/**
//	 * Panel[Rcv]のボタン[setoff_srch]の押下時の処理
//	 */
//	@Override
//	public void doRcv_setoff_srch(MCEventInfo info) {
//		callMS_MSBGL0210_Srch04();
//	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		if (DtlTable.getViewRows().isEmpty()) {
			return;
		}
		if (isSetoff()) {
			// 金額未入力時は処理しない
			if (isNull(getRcvR().setoff_rcv_amt())) {
				return;
			}
			if (getRcvR().setoff_rcv_amt().multiply(
					getDtlL().sum(DtlR.$appl_tgt_amt)).isNegative()) {
				dialog(new MCMessage(MSBGP0022, Rcv_setoff_rcv_amt.getLabelByLocale()));
				return;
			}
		}
		else {
			// 金額未入力時は処理しない
			if (isNull(getRcvR().rcv_amt())) {
				return;
			}
			if (getRcvR().rcv_amt().multiply(getDtlL().sum(DtlR.$appl_tgt_amt))
					.isNegative()) {
				dialog(new MCMessage(MSBGP0022, Rcv_rcv_amt.getLabelByLocale()));
				return;
			}
		}
		divide();
	}

	protected void divide() {
		clearDtlAmt();
		MCList<DtlR> viewList = DtlTable.getViewRows();
		if (isSetoff()) {
			// 相殺の場合、相殺の未処理残高をトータル金額とする。
			FXUCC_Divide.inSeq(viewList, getRcvR().setoff_not_proc_bal(),
					DtlR.$not_appl_bal, DtlR.$amt4);
			for (DtlR r : viewList) {
				if (!r.amt4().isZero()) {
					r.check(true);
					r.setStatus(Status.MODIFY);
				}
				r.amt1(r.amt4());
			}
		}
		else {
			// 入金の場合は、入金の未処理残高をトータル金額とする。
			MCList<DtlR> viewListSub = viewList.subList(createNotWtaxMatcher());
			FXUCC_Divide.inSeq(viewListSub, getRcvR().not_proc_bal_w(), DtlR.$not_appl_bal, DtlR.$amt1);
			for (DtlR r : viewListSub) {
				if (!isNull(r.amt1()) && isNull(r.amt2())) {
					r.amt2(0);
				}
				if (!r.amt1().isZero()) {
					r.check(true);
					r.setStatus(Status.MODIFY);
				}
			}
		}
		setAmountFields();
	}

	protected MCRowMatcher<DtlR> createNotWtaxMatcher() {
		return new NotWtaxMatcher<DtlR>();
	}
	public class NotWtaxMatcher<T extends DtlR> implements MCRowMatcher<T> {
		@Override
		public boolean match(T row) {

			if (MAC_AR_STTL_TYP.isWTAX(row.ar_sttl_typ1())) {
				return false;
			}
			return true;
		}
	}

	protected void clearDtlAmt() {
		if (!isSetoff()) {
			for (DtlR r : DtlTable.getViewRows()) {
				setValueEx(columnDtl_amt1, r.getGUIIndex(), null);
				r.check(false);
			}
		}
		else {
			for (DtlR r : DtlTable.getViewRows()) {
				setValueEx(columnDtl_amt4, r.getGUIIndex(), null);
				r.check(false);
			}
		}
		setAmountFields();
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		clearDtlAmt();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBGL0210_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0210_Upd01();
	}
	
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBGL0210_Del01();
	}
	protected mcframe.clientMSBG.MSBGP0220.CndR crtOpenMSBGP0220CndR(MAUCP_AppScreenOpener aso, DtlR r, RcvR rcv) {
		mcframe.clientMSBG.MSBGP0220.CndR to = mcframe.clientMSBG.MSBGP0220.CndR.create();
		to.rcv_act_d_no(r.rcv_act_d_no());
		to.slo_no(rcv.slo_no());
		to.ar_appl_schd_no(r.ar_appl_schd_no());
		if (MAC_STR.isNULL_VAL(r.bill_no())) {
			to.inc_not_bill_flg(true);
		}
		if (!isNull(rcv.slo_no()) && r.other_slo_flg()) {
			to.inc_otr_slo_flg(true);
		}
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0220]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0220(MCEventInfo info) {
		openMSBGP0220(info);
	}
	
	protected void openMSBGP0220(MCEventInfo info){
		DtlR r = DtlTable.getSelectedMCRow();

		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		if(isSame(REF, getStatus()) || isSame(FIX_I, getStatus()) || isSame(FIX_U, getStatus()) ||
				isSame(DEL, getStatus()) || isSame(FIX_D, getStatus())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0220");
			aso.runValueInit();
			aso.putCnd(crtOpenMSBGP0220CndR(aso, r, getRcvR()));
			aso.putSearchAction();
			aso.show();
		}
		else {
			bind.addStringColumn("rcv_act_d_no", r.rcv_act_d_no());
			bind.addStringColumn("ar_appl_schd_no", r.ar_appl_schd_no());
			bind.addStringColumn("ar_sttl_typ", r.ar_sttl_typ1());
			bind.addStringColumn("slo_no", getRcvR().slo_no());
			// 相殺
			if (isSetoff()) {
				bind.addStringColumn("bcst_cd", getRcvR().setoff_bcst_cd());
				bind.addStringColumn("bcst_nm", getRcvR().setoff_bcst_nm());
				bind.addStringColumn("trd_cur_cd", getRcvR().setoff_trd_cur_cd());
				bind.addStringColumn("trd_cur_nm", getRcvR().setoff_trd_cur_nm());
				bind.addDateColumn("setoff_dt", getRcvR().setoff_dt());
				bind.addNumberColumn("amt_dec_place", getRcvR().amt_dec_place());
				bind.addNumberColumn("upri_dec_place", getRcvR().upri_dec_place());
			}
			// 相殺以外
			else {
				bind.addStringColumn("rcst_cd", getRcvR().rcst_cd());
				bind.addStringColumn("rcst_nm", getRcvR().rcst_nm());
				bind.addStringColumn("bcst_cd", getRcvR().bcst_cd());
				bind.addStringColumn("bcst_nm", getRcvR().bcst_nm());
				bind.addStringColumn("bill_dpt_cd", getRcvR().bill_dpt_cd());
				bind.addStringColumn("bill_dpt_nm", getRcvR().bill_dpt_nm());
				bind.addStringColumn("ar_sttl_cd1", getRcvR().ar_sttl_cd1());
				bind.addStringColumn("ar_sttl_nm1", getRcvR().ar_sttl_nm1());
				bind.addStringColumn("trd_cur_cd", getRcvR().trd_cur_cd());
				bind.addStringColumn("trd_cur_nm", getRcvR().trd_cur_nm());
				bind.addNumberColumn("amt_dec_place", getRcvR().amt_dec_place());
				bind.addNumberColumn("upri_dec_place", getRcvR().upri_dec_place());
				bind.addDateColumn("rcv_dt", getRcvR().rcv_dt());
			}

			bind.addStringColumn("trd_cd", getHdrR().trd_cd());
			bind.addStringColumn("trd_nm", getHdrR().trd_nm());
			bind.addStringColumn("trd_ptn_typ", getHdrR().trd_ptn_typ());
			bind.addDateColumn("ac_ym", getHdrR().ac_ym());
			bind.addDateColumn("ac_dt", getHdrR().ac_dt());
			
			openModalPanel("MS", "MSBGP0220", T1, bind, r, getBillDL(), getSrch_CndL(),
					columnDtl_check, columnDtl_amt1, columnDtl_amt2, columnDtl_amt4);
		}
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		// 入金Ｎｏでの検索
		if (T1 == openTyp) {

			valueInit();

			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			getHdrR().setStatus(Status.NONE);
			setValueEx(Hdr_trd_cd, getInitSlip(bind.getStringNE("dat_typ")));
			if (MSC_RCV_DAT_TYP.isAP(bind.getStringNE("dat_typ"))) {
				getRcvR().setoff_rcv_no(bind.getStringNE("rcv_no"));
				
				addDoBehind(Rcv_setoff_srch);
				return;
			}
			getRcvR().rcv_no(bind.getStringNE("rcv_no"));
			
			addDoBehind(Rcv_srch);
			
		}
		// 入金予定一覧照会からの遷移
		else if (T2 == openTyp) {
			// 債権決済区分が「4：相殺（借方）」、「6：源泉税」の場合
			if (MAC_AR_STTL_TYP.isWTAX(bind.getStringNE("ar_sttl_typ1")) ||
					MAC_AR_STTL_TYP.isSETOFF_DR(bind.getStringNE("ar_sttl_typ1"))) {

				setValueEx(Hdr_trd_cd, getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value()));
				setValueEx(Rcv_setoff_dt, bind.getDateNE("rcv_dt"));
				setValueEx(Rcv_setoff_bcst_cd, bind.getStringNE("bcst_cd"));
				setValueEx(Rcv_setoff_trd_cur_cd, bind.getStringNE("trd_cur_cd"));
				setValueEx(Rcv_setoff_rcv_amt, bind.getNumberNE("rcv_amt"));
				setValueEx(Rcv_setoff_sttl_cd1, bind.getStringNE("ar_sttl_cd1"));
			}
			// 債権決済区分が「1：現金」、「2：振込」、「3：手形」の場合
			else {

				setValueEx(Hdr_trd_cd, getDefaultTrdCd(MAC_TRD_PTN_TYP.RCV_AR.value()));
				setValueEx(Rcv_rcv_dt, bind.getDateNE("rcv_dt"));
				setValueEx(Rcv_rcst_cd, bind.getStringNE("rcst_cd"));
				setValueEx(Rcv_bcst_cd, bind.getStringNE("bcst_cd"));
				setValueEx(Rcv_bill_dpt_cd, bind.getStringNE("bill_dpt_cd"));
				setValueEx(Rcv_trd_cur_cd, bind.getStringNE("trd_cur_cd"));
				setValueEx(Rcv_rcv_amt, bind.getNumberNE("rcv_amt"));
				setValueEx(Rcv_ar_sttl_cd1, bind.getStringNE("ar_sttl_cd1"));
			}
		}
	}

	protected String getInitSlip(String datTyp) {

		// 仮受
		if (MSC_RCV_DAT_TYP.isSUSP(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value());
		}
		// 入金
		else if (MSC_RCV_DAT_TYP.isRCV(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.RCV_AR.value());
		}
		// 前受
		else if (MSC_RCV_DAT_TYP.isADV(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value());
		}
		// 買掛
		else if (MSC_RCV_DAT_TYP.isAP(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value());
		}
		return null;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);

		Rcv_xrate_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_base_cur_cd, Rcv_xrate_cd, Hdr_ac_dt, true);
		Rcv_setoff_xrate_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_base_cur_cd, Rcv_setoff_xrate_cd, Hdr_ac_dt, true);

		Rcv_rcv_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Rcv_not_proc_bal_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Rcv_setoff_rcv_amt_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_amt_dec_place);
		Rcv_setoff_not_proc_bal_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_amt_dec_place);

		Total_total_rcv_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Total_total_setoff_rcv_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Total_total_setoff_rcv_amt2_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_amt_dec_place);
		Total_total_appl_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);

		Dtl_appl_ttl_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Dtl_appl_tgt_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Dtl_amt1_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Dtl_amt2_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_amt_dec_place);
		Dtl_amt4_p_PPanel.setRelateBeans(Rcv_setoff_trd_cur_cd, Rcv_amt_dec_place);
		Dtl_not_appl_bal_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
	}

	@Override
	protected void opePanelFillSpace() {
		// フィルスペースしない
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		clearWhenNoTrdCd();
		setModeByTrdCd();
		setDefaultValues();
	}

	@Override
	protected void listInit() {
		super.listInit();
		getRcv_bill_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getRcv_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getRcv_setoff_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rcv_rcv_amt.addNCListener(this);
		Rcv_setoff_rcv_amt.addNCListener(this);
		Total_total_rcv_amt.addNCListener(this);
		columnDtl_amt1.addNCListener(this);
		columnDtl_amt2.addNCListener(this);
		columnDtl_amt4.addNCListener(this);
		Hdr_dpt_cd.addLCListener(this);
	}

	@Override
	public MCList getRcv_tax_cd(MCRow row, MCEventInfo info) {

		MCRow bindR = MCRow.create();
		if (getRcvR().purc_flg()) bindR.addBooleanColumn(RcvR.$purc_flg, true);
		if (getRcvR().sls_flg()) bindR.addBooleanColumn(RcvR.$sls_flg, true);
		bindR.addBooleanColumn("inc_tax_flg", true);

		return super.getRcv_tax_cd(bindR, info);
	}

	@Override
	public MCList getRcv_setoff_tax_cd(MCRow row, MCEventInfo info) {

		MCRow bindR = MCRow.create();
		if (getRcvR().setoff_purc_flg()) bindR.addBooleanColumn(RcvR.$purc_flg, true);
		if (getRcvR().setoff_sls_flg()) bindR.addBooleanColumn(RcvR.$sls_flg, true);
		bindR.addBooleanColumn("inc_tax_flg", true);

		return super.getRcv_setoff_tax_cd(bindR, info);
	}

	/**
	 * 検索時に変更を確認するダイアログ出力対象となるコンテナの状態をNONEにする。
	 */
	protected void setAllStatusNone() {

		getCndR().setStatus(Status.NONE);
		getHdrR().setStatus(Status.NONE);
		getRcvR().setStatus(Status.NONE);
		getDtlL().setStatus(Status.NONE);
		getTotalR().setStatus(Status.NONE);
	}

	/**
	 * 各フィールドにデフォルト値を設定する
	 * 
	 */
	protected void setDefaultValues() {

		setValueEx(Hdr_rcv_act_no, null);
		setValueEx(Hdr_rcv_act_rev, null);
		setValueEx(Hdr_ac_dt, getToday());
		setValueEx(Hdr_bill_basis_dt, getToday());
		setDefaultSrch();
		setBaseCurValues();
	}

	protected void setDefaultSrch() {
		setValueEx(DtlCnd_narrow_down_flg, true);
		setValueEx(DtlCnd_not_bill_flg, false);
		setValueEx(DtlCnd_zero_flg, false);
		setValueEx(DtlCnd_incl_appl_flg, false);
		setValueEx(DtlCnd_slo_flg, true);
		setValueEx(DtlCnd_rcv_schd_dt, getToday());
	}

	/**
	 * 基準通貨、為替レートＣＤのデフォルト値を設定する
	 * 
	 */
	protected void setBaseCurValues() {
		setValueEx(Rcv_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Rcv_xrate_cd, getCo().sls_xrate_cd());
		setValueEx(Rcv_setoff_xrate_cd, getCo().sls_xrate_cd());
	}

	protected boolean checkAvailTrd(String trdPtnTyp, String datTyp) {
		// 入金ＮＯが入力済みで、入金検索済みの場合のみチェックを行う。
		if (isNull(trdPtnTyp) || isNull(datTyp)) {
			return true;
		}

		MCMessage m = _checkAvailTrd(trdPtnTyp, datTyp);
		if (m != null) {
			dialog(m);
			return false;
		}
		return true;
	}

	/**
	 * 取引区分と入金情報の組み合わせをチェックする。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param datTyp 入金データ区分
	 * @return
	 */
	protected MCMessage _checkAvailTrd(String trdPtnTyp, String datTyp) {
		// 取引区分と入金情報の整合性チェック
		// 売掛消込（売上代金入金）の場合、入金の入金情報が使用できる
		if (MAC_TRD_PTN_TYP.isRCV_AR(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isRCV(datTyp)) {
				return new MCMessage(MSBGP0016);
			}
		}
		// 売掛消込（前受金相殺）の場合、前受の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isADV(datTyp)) {
				return new MCMessage(MSBGP0017);
			}
		}
		// 仮受金相殺（売掛金）の場合、仮受の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isSUSP(datTyp)) {
				return new MCMessage(MSBGP0018);
			}
		}
		// その他勘定売掛金相殺の場合、買掛金相殺の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isAP(datTyp)) {
				return new MCMessage(MSBGP0019);
			}
		}
		return null;
	}

	/**
	 * 各種金額フィールドの設定<BR>
	 * その他相殺の場合、明細の画面表示はamt4が表示されているが、計算方法を統一するため<BR>
	 * amt1にamt4の値がコピーされている前提で計算を行う。
	 */
	public void setAmountFields() {

		MCNumber sum1 = MCNumber.ZERO;
		MCNumber sum2 = MCNumber.ZERO;
		MCNumber _ttl_amt_w = null;
		MCNumber _amt1 = null;
		MCNumber _amt1_w = null;
		MCNumber _amt2 = null;
		MCNumber _amt2_w = null;
		MCNumber _not_proc_bal_w = nvl(getRcvR().not_proc_bal_w(), MCNumber.ZERO);
		MCNumber _setoff_not_proc_bal_w = nvl(getRcvR().setoff_not_proc_bal_w(), MCNumber.ZERO);
		boolean isAllAmt1Null = true;
		boolean isAllAmt2Null = true;
		// 明細の金額を合計する。
		for (DtlR r : getDtlL()) {

			// null対応
			_ttl_amt_w = nvl(r.appl_ttl_amt_w(), MCNumber.ZERO);
			_amt1 = nvl(r.amt1(), MCNumber.ZERO);
			_amt1_w = nvl(r.amt1_w(), MCNumber.ZERO);
			if (isAllAmt1Null && null != r.amt1()) {
				isAllAmt1Null = false;
			}
			_amt2 = nvl(r.amt2(), MCNumber.ZERO);
			_amt2_w = nvl(r.amt2_w(), MCNumber.ZERO);
			if (isAllAmt2Null && null != r.amt2()) {
				isAllAmt2Null = false;
			}

			r.appl_ttl_amt(_ttl_amt_w.add(_amt1.subtract(_amt1_w)).add(_amt2.subtract(_amt2_w)));
			r.not_appl_bal(nvl(r.appl_tgt_amt(), MCNumber.ZERO).subtract(r.appl_ttl_amt()));
			sum1 = sum1.add(_amt1);
			sum2 = sum2.add(_amt2);
		}

		// ヘッダに対する値の設定
		// 相殺
		if (isSetoff()) {
			if (!isNull(getRcvR().setoff_rcv_amt()) && 0 < getDtlL().size()) {
				getRcvR().setoff_not_proc_bal(_setoff_not_proc_bal_w.subtract(sum1));
			}
			else {
				// 相殺額未入力か、明細検索前は未処理金額をnullにする
				getRcvR().setoff_not_proc_bal(null);
			}
		}
		else {
			// 入金
			// 入金額未入力の場合、未処理金額を計算しない
			if (!isNull(getRcvR().rcv_amt()) && 0 < getDtlL().size()) {
				getRcvR().not_proc_bal(_not_proc_bal_w.subtract(sum1));
			}
			else {
				// 入金額がnullか、明細検索前は未処理金額をnullにする
				getRcvR().not_proc_bal(null);
			}
		}

		// TotalRの表示
		if (0 < getDtlL().size()) {
			if (isAllAmt2Null) {
				getTotalR().total_setoff_rcv_amt(null);
			}
			else {
				getTotalR().total_setoff_rcv_amt(sum2);
			}

			if (!isSetoff() && isAllAmt1Null && isAllAmt2Null || isSetoff()
					&& isAllAmt1Null) {
				getTotalR().total_appl_amt(null);
			}
			else {
				getTotalR().total_appl_amt(sum1.add(sum2));
			}
			if (isAllAmt1Null) {
				// 注意：この時点では金額小数部有効桁数が設定されていないため
				// setValueExを使うと金額小数部有効桁数がおかしな値となる
				// そのため、setValueExは使わない
				getTotalR().total_rcv_amt(null);
			}
			else {
				getTotalR().total_rcv_amt(sum1);
				if (isSetoff()) {
					getTotalR().total_setoff_rcv_amt2(getTotalR().total_rcv_amt());
				}
			}
		}
		else {
			// 明細検索前は、SumRの金額に「0」を表示しない。
			getTotalR().total_setoff_rcv_amt(null);
			getTotalR().total_appl_amt(null);
			setValueEx(Total_total_rcv_amt, null);
		}
	}

	/**
	 * 画面で選択されている取引パタン区分が取引区分がその他相殺であるかを判定する。
	 * 
	 * @return 画面で選択されている取引パタン区分がその他相殺の場合、true。それ以外はfalse。
	 */
	protected boolean isSetoff() {
		return MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(getHdrR().trd_ptn_typ()) ? true : false;
	}
	// /////////////////////画面モードカスタマイズ/////////////////////

	/**
	 * 明細の金額表示を取引区分により変更する。<BR>
	 * 金額は入力必須,非表示のどちらかの状態となる。
	 */
	protected void setDtlAmtModeREQ() {

		if (isSetoff()) {
			Total_total_rcv_amt.setMode(MCMode.INVISIBLE);
			Total_total_setoff_rcv_amt.setMode(MCMode.INVISIBLE);
			Total_total_setoff_rcv_amt2.setMode(MCMode.READ_ONLY);

			columnDtl_amt1.setMode(MCMode.INVISIBLE);
			columnDtl_amt2.setMode(MCMode.INVISIBLE);

			if (Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected() || isSame(FIX_I, getStatus()) || isSame(FIX_U, getStatus())) {
				columnDtl_amt4.setMode(MCMode.READ_ONLY);
			}
			else {
				columnDtl_amt4.setMode(MCMode.REQUIRED);
			}
		}
		else {
			Total_total_rcv_amt.setMode(MCMode.READ_ONLY);
			Total_total_setoff_rcv_amt.setMode(MCMode.READ_ONLY);
			Total_total_setoff_rcv_amt2.setMode(MCMode.INVISIBLE);

			if (Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected() || isSame(FIX_I, getStatus()) || isSame(FIX_U, getStatus())) {
				columnDtl_amt1.setMode(MCMode.READ_ONLY);
			}
			else {
				columnDtl_amt1.setMode(MCMode.REQUIRED);
			}
			// amt2はさらにar_sttl_cd2の状態により判定する。
			setAmt2Mode();

			columnDtl_amt4.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 選択された取引ＣＤの取引パタン区分により画面のモードを設定する
	 * 
	 */
	protected void setModeByTrdCd() {

		// 取引ＣＤ未入力時
		if (isNull(getHdrR().trd_cd())) {
			setNO_SLIP_CDStatus();
			Hdr_trd_cd.mcRequestFocus();
			return;
		}

		setTabPaneMode(getHdrR().trd_ptn_typ());

		if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			Cnd_rcv_act_no.mcRequestFocus();
			return;
		}

		if (Cnd_ope_DEL.isSelected()) {
			Cnd_rcv_act_no.mcRequestFocus();
			return;
		}

		// 売掛金その他相殺のモード設定
		if (isSetoff()) {
			setSetoffTabMode();
		}
		// それ以外
		else {
			setRcvTabMode();
			setAdditionalMode();
		}
	}

	/**
	 * 売掛金その他相殺の時のモード設定を行う。
	 * 
	 */
	protected void setSetoffTabMode() {
		String rcvNo = getRcvR().setoff_rcv_no();
		String rcvDatTyp = getRcvR().setoff_rcv_dat_typ();

		// 検索前、入金ＮＯの入力ない時は、入金情報は入力可
		if (isNull(rcvNo)) {
			// 新規
			if (Cnd_ope_INS.isSelected()) {
				setINS_SETOFFStatus();
			}
			// 更新
			if (Cnd_ope_UPD.isSelected()) {
				setUPD_SETOFFStatus();
			}
		}
		// 検索前で、入金ＮＯの入力があるときは、入金情報は入力不可
		else if (isNull(rcvDatTyp)) {
			// 新規
			if (Cnd_ope_INS.isSelected()) {
				setINS_SRCH_RCV_SETOFFStatus();
			}
			// 更新
			if (Cnd_ope_UPD.isSelected()) {
				setUPD_SRCH_RCV_SETOFFStatus();
			}
		}
		//　検索後
		else {
			// 新規
			if (Cnd_ope_INS.isSelected()) {
				setINS_REF_RCV_SETOFFStatus();
				setArSttlModeForNewSetoffSusp();
			}
			// 更新
			if (Cnd_ope_UPD.isSelected()) {
				setUPD_REF_RCV_SETOFFStatus();
			}
		}
		if (isNull(getRcvR().setoff_debt_cred_id_typ())) {
			Rcv_setoff_debt_cred_id_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Rcv_setoff_debt_cred_id_cd);
		}
		setModeNarrowDownFlg();
	}

	/**
	 * 売掛金その他相殺以外の時のモード設定を行う。
	 * 
	 */
	protected void setRcvTabMode() {
		String rcvNo = getRcvR().rcv_no();
		String rcvDatTyp = getRcvR().rcv_dat_typ();
		
		if (!(MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isRCV_AR(getHdrR().trd_ptn_typ()))) {
			return;
		}

		// 検索前で売上代金入金以外の時、入金ＮＯ必須で入金情報入力不可
		if (isNull(rcvDatTyp)
				&& (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(getHdrR().trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(getHdrR().trd_ptn_typ()))) {
			// 新規
			if (Cnd_ope_INS.isSelected()) {
				setINS_SRCH_RCVStatus();
			}
			// 更新
			if (Cnd_ope_UPD.isSelected()) {
				setUPD_SRCH_RCVStatus();
			}
		}
		// 検索前で売上代金入金の時、入金ＮＯ指定任意、または入金ＮＯ指定必須で検索後
		else {
			// 入金ＮＯが未入力
			if (isNull(rcvNo)) {
				if (Cnd_ope_INS.isSelected()) {
					setINSStatus();
					// 請求部門の入力制御
					setBcstDptMode();
				}
				if (Cnd_ope_UPD.isSelected()) {
					setUPDStatus();
					// 請求部門の入力制御
					setBcstDptMode();
				}
			}
			// 入金を検索済の状態
			else if (!isNull(rcvDatTyp)) {
				if (Cnd_ope_INS.isSelected()) {
					setINS_REF_RCVStatus();
				}
				if (Cnd_ope_UPD.isSelected()) {
					setUPD_REF_RCVStatus();
				}
			}
			// 入金ＮＯが入力済で検索待ちの状態
			else {
				// 新規
				if (Cnd_ope_INS.isSelected()) {
					setINS_SRCH_RCVStatus();
				}
				// 更新
				if (Cnd_ope_UPD.isSelected()) {
					setUPD_SRCH_RCVStatus();
				}
			}
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDtlAmtModeREQ();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setDtlAmtModeREQ();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setNO_SLIP_CDStatus() {
		super.setNO_SLIP_CDStatus();
		setDtlAmtModeREQ();
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setDtlAmtModeREQ();
	}

	/**
	 * タブの制御を行う
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 */
	protected void setTabPaneMode(String trdPtnTyp) {
		
		if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)) {
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(RcvPanel), false);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(NotePanel), false);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(SetoffPanel), true);
			RcvTabTab.setSelectedComponent(SetoffPanel);
			Rcv_setoff_rcv_no.mcRequestFocus();
		}
		else {
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(RcvPanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(NotePanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(SetoffPanel), false);
			RcvTabTab.setSelectedComponent(RcvPanel);
			Rcv_rcv_no.mcRequestFocus();
		}
	}

	/**
	 * 請求先、請求部門のモード設定
	 * 
	 */
	protected void setBcstDptMode() {
		if (isNull(getRcvR().rcst_cd())) {
			Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
			Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			Rcv_bcst_cd.setMode(MCMode.ENABLE);
			Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 新規で、仮受金その他相殺用の設定
	 */
	protected void setArSttlModeForNewSetoffSusp() {
		setValueEx(Rcv_ar_sttl_cd2, null);
		Rcv_ar_sttl_cd1.setMode(MCMode.READ_ONLY);
		Rcv_ar_sttl_cd2.setMode(MCMode.READ_ONLY);
		Rcv_tax_cd.setMode(MCMode.READ_ONLY);
	}

	/**
	 * 個別にモード設定が必要な項目の設定を行う。
	 */
	protected void setAdditionalMode() {
		// 入金先が入力できる状態
		if (!isSame(UPD_SRCH_RCV, getStatus()) && !isSame(INS_SRCH_RCV, getStatus())) {

			/*  入金先の入力制御 */
			// 入金ＮＯ入力済みで、入金先も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().rcst_cd())) {
				if (!isNull(getRcvR().old_rcst_cd())) {
					Rcv_rcst_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_rcst_cd.setMode(MCMode.REQUIRED);
				}
			}
			else {
				Rcv_rcst_cd.setMode(getDefaultMode(Rcv_rcst_cd));
			}
			/*  請求先の入力制御 */
			// 入金ＮＯ入力済みで、請求先も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().bcst_cd())) {
				if (!isNull(getRcvR().old_bcst_cd())) {
					Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_bcst_cd.setMode(MCMode.ENABLE);
				}
			}
			else {
				if (isNull(getRcvR().rcst_cd())) {
					Rcv_bcst_cd.setMode(getDefaultMode(Rcv_bcst_cd));
				}
				else {
					Rcv_bcst_cd.setMode(MCMode.ENABLE);
				}
			}
			/*  請求部門の入力制御 */
			// 入金ＮＯ入力済みで、請求部門も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().bill_dpt_cd())) {
				if (!isNull(getRcvR().old_bill_dpt_cd())) {
					Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
				}
			}
			else {
				if (isNull(getRcvR().rcst_cd())) {
					Rcv_bill_dpt_cd.setMode(getDefaultMode(Rcv_bill_dpt_cd));
				}
				else {
					Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
				}
			}

			/*  相殺先の入力制御 */
			// 入金ＮＯ入力済みで、相殺先も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().setoff_rcv_no()) && !isNull(getRcvR().setoff_bcst_cd())) {
				if (!isNull(getRcvR().old_setoff_bcst_cd())) {
					Rcv_setoff_bcst_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_setoff_bcst_cd.setMode(MCMode.REQUIRED);
				}
			}
			else {
				Rcv_setoff_bcst_cd.setMode(getDefaultMode(Rcv_setoff_bcst_cd));
			}
		}

		// 前受金相殺、仮受金相殺の場合、入金ＮＯを必須とする
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(getHdrR().trd_ptn_typ())) {
			Rcv_rcv_no.setMode(MCMode.REQUIRED);
		}
		else if (!isNull(getHdrR().trd_ptn_typ())) {
			Rcv_rcv_no.setMode(MCMode.ENABLE);
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {	
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// REF →　INS
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setRefToInsInit(bfSt);
		}

		// UPD →　INS or DEL → INS
		if ((isSame(bfOpe, Cnd_ope_UPD.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))
				|| (isSame(bfOpe, Cnd_ope_DEL.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setUpdToInsInit();
		}

		// REF →　UPD or REF → DEL
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_UPD.getActionCommand()))
				|| (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_DEL.getActionCommand()))) {
			setRefToUpdInit(bfSt);
		}

		// →UPD ,→DEL
		if (isSame(afOpe, Cnd_ope_UPD.getActionCommand()) || isSame(afOpe, Cnd_ope_DEL.getActionCommand())){
			Cnd_rcv_act_rev.setMode(MCMode.READ_ONLY);
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setRefToInsInit(String bfSt) {
		clearContainers(getHdrR(), getRcvR(), getTotalR(), getDtlL(), getBillDL());
		setDefaultValues();
		setBaseCurValues();
		statusClear();
		HdrPanel.focusFirstComponent();
	}

	protected void setUpdToInsInit() {
		setDefaultValues();
		setBaseCurValues();
		statusClear();
		HdrPanel.focusFirstComponent();
	}

	protected void setRefToUpdInit(String bfSt) {
		// 参照（検索前）→ 更新の場合は画面のモードを変更しない。
		if (bfSt == SRCH) {
			return;
		}
		HdrPanel.focusFirstComponent();
	}

	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		// 画面初期化時に伝票部品のsetDefaultValueから飛んできた場合に-1となるため。
		if (info.getNewListIndex() < 0) {
			return true;
		}
		// 売掛金その他勘定相殺に変更した場合は入金ＮＯが空なので入金情報と伝票ＣＤの組み合わせチェックをしない
		if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(Hdr_trd_cd.getList()
				.get(info.getNewListIndex()).getString(HdrR.$trd_ptn_typ))) {
			return true;
		}
		return checkAvailTrd(Hdr_trd_cd.getList().get(info.getNewListIndex())
				.getString(HdrR.$trd_ptn_typ), getRcvR().rcv_dat_typ());
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Rcv_setoff_rcv_amt) {
			doRcv_setoff_rcv_amt_NC(info);
		}
		else if (nc == Rcv_rcv_amt) {
			doRcv_rcv_amt_NC();
		}
		else if (nc == Total_total_rcv_amt) {
			doTotal_total_rcv_amt_NC(info);
		}
		else if (nc == columnDtl_amt1) {
			doDtl_amt1_NC(info);
		}
		else if (nc == columnDtl_amt2) {
			doDtl_amt2_NC(info);
		}
		else if (nc == columnDtl_amt4) {
			doDtl_amt4_NC(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_dpt_cd) {
			doHdr_dpt_cd_LC(info);
		}
	}

	protected void doHdr_dpt_cd_LC(MCEventInfo info) {
		setDefaultAc();
	}

	@Override
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info) {
		super.doHdr_trd_ptn_typ_NC(info);
		// 取引ＣＤが変更され、取引区分が変わった場合のクリア処理は取引ＣＤがnullの場合のクリア処理と同じ
		clearWhenNoTrdCd();
		setModeByTrdCd();
		setDefaultValues();
	}

	public void doRcv_setoff_rcv_amt_NC(MCEventInfo info) {
		// 入力された値を金額計算の為の項目へコピー
		if (isNull(getRcvR().setoff_rcv_no())) {
			getRcvR().setoff_not_proc_bal_w(getRcvR().setoff_rcv_amt());
		}
		setAmountFields();
	}

	public void doRcv_rcv_amt_NC() {
		// 入力された値を金額計算の為の項目へコピー
		if (isNull(getRcvR().rcv_no())) {
			getRcvR().not_proc_bal_w(getRcvR().rcv_amt());
		}
		setAmountFields();
	}

	@Override
	public void doRcv_ar_sttl_typ1_NC(MCEventInfo info) {
		super.doRcv_ar_sttl_typ1_NC(info);
		clearWhenArSttlTyp1NC();
		setNoteMode();
		setBankAcMode();
		setDefaultAc();
		getDtlL().clear();
		setBtnMode();
		setAmountFields();
	}

	@Override
	public void doRcv_ar_sttl_cd2_NC(MCEventInfo info) {
		super.doRcv_ar_sttl_cd2_NC(info);
		clearWhenArSttlCd2NC();
		setModeArSttl2();

		// 債権決済方法２が変更された場合、明細の相殺額をクリアし、金額カラムを再計算する
		setValueEx(columnDtl_amt2, null);

		setAmountFields();
		setAmt2Mode();

		// 債権決済方法２が入力されていない場合、請求書明細備考をクリアする
		if (isNull(getRcvR().ar_sttl_cd2())) {
			setValueEx(columnDtl_bill_d_rmrks, null);
		}
		setBillDRmrksMode();
	}

	@Override
	public void doRcv_ar_sttl_cd2_LC(MCEventInfo info) {
		super.doRcv_ar_sttl_cd2_LC(info);
		setTaxMode();
		Rcv_tax_cd.setValue(getRcvR().tax_cd_sub());
	}

	@Override
	public void doRcv_ar_sttl_typ2_NC(MCEventInfo info) {
		super.doRcv_ar_sttl_typ2_NC(info);

		if (!MAC_AR_STTL_TYP.isWTAX(getRcvR().ar_sttl_typ2())) {
			int index = 0;
			for (DtlR r : getDtlL()) {
				if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
					setValueEx(columnDtl_check, index, false);
					setValueEx(columnDtl_amt1, index, null);
				}
				index++;
			}
		}

		DtlR r = DtlTable.getSelectedMCRow();
		setBtnModeForMSBGP0220(r);
	}

	protected void setTaxMode() {
		if (MAC_SLS_PURC_TYP.isPURC(getRcvR().sls_purc_typ2())) {
			getRcvR().purc_flg(true);
			getRcvR().sls_flg(false);
		}
		else if (MAC_SLS_PURC_TYP.isSLS(getRcvR().sls_purc_typ2())) {
			getRcvR().purc_flg(false);
			getRcvR().sls_flg(true);
		}
		else {
			getRcvR().purc_flg(false);
			getRcvR().sls_flg(false);
		}
	}

	@Override
	public void doRcv_setoff_sttl_cd1_NC(MCEventInfo info) {
		super.doRcv_setoff_sttl_cd1_NC(info);
		clearWhenSetoffSttlCd1NC();
	}

	@Override
	public void doRcv_setoff_sttl_cd1_LC(MCEventInfo info) {
		super.doRcv_setoff_sttl_cd1_LC(info);
		setSettoffTaxMode();
		Rcv_setoff_tax_cd.setValue(getRcvR().setoff_tax_cd_sub());
		getDtlL().clear();
		setModeNarrowDownFlg();
	}



	protected void setSettoffTaxMode() {
		if (MAC_SLS_PURC_TYP.isPURC(getRcvR().setoff_sls_purc_typ())) {
			getRcvR().setoff_purc_flg(true);
			getRcvR().setoff_sls_flg(false);
		}
		else if (MAC_SLS_PURC_TYP.isSLS(getRcvR().setoff_sls_purc_typ())) {
			getRcvR().setoff_purc_flg(false);
			getRcvR().setoff_sls_flg(true);
		}
		else {
			getRcvR().setoff_purc_flg(false);
			getRcvR().setoff_sls_flg(false);
		}
	}

	protected void setAmt2Mode() {
		// 相殺の場合はamt2を見せないので処理しない
		if (!isSetoff()) {
			// 債権決済方法２が入力されている場合のみ金額２を入力必須とする
			if (!isNull(getRcvR().ar_sttl_cd2()) && !(Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected() || isSame(FIX_I, getStatus()) || isSame(FIX_U, getStatus()))) {
				columnDtl_amt2.setMode(MCMode.REQUIRED);
			}
			else {
				columnDtl_amt2.setMode(MCMode.READ_ONLY);
			}
		}
	}

	protected void setBillDRmrksMode() {
		// 相殺の場合は常に入力可能なので処理しない
		if (!isSetoff()) {
			// 債権決済方法２が入力されている場合のみ請求書明細備考を入力可能とする
			if (!isNull(getRcvR().ar_sttl_cd2()) && !(Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected() || isSame(FIX_I, getStatus()) || isSame(FIX_U, getStatus()))) {
				columnDtl_bill_d_rmrks.setMode(MCMode.ENABLE);
			}
			else {
				columnDtl_bill_d_rmrks.setMode(MCMode.READ_ONLY);
			}
		}
	}

	protected void setModeNarrowDownFlg() {
		if (MAC_AR_STTL_TYP.isWTAX(getRcvR().setoff_sttl_typ1())) {
			DtlCnd_narrow_down_flg.setMode(MCMode.READ_ONLY);
			DtlCnd_narrow_down_flg.setValue(true);
		}
		else {
			setDefaultMode(DtlCnd_narrow_down_flg);
			DtlCnd_narrow_down_flg.setValue(false);
		}
	}

	@Override
	public void doRcv_rcv_no_NC(MCEventInfo info) {
		super.doRcv_rcv_no_NC(info);
		doRcv_rcv_no_sub_NC();
	}

	protected void doRcv_rcv_no_sub_NC() {
		clearWhenRcvNoNC();
		setModeByTrdTyp();
		setModeBySloNo();

		// 入金NOは検索条件でもあるので、変更時にComRのステータスを変えないようにする
		getRcvR().setStatus(Status.NONE);
	}

	@Override
	public void doRcv_bcst_cd_NC(MCEventInfo info) {
		super.doRcv_bcst_cd_NC(info);
		setDefaultAc();
		getDtlL().clear();
		setValueEx(Rcv_bill_dpt_cd, null);
		setBtnMode();
		setAmountFields();
		setDebtCred();
	}

	@Override
	public void doRcv_bill_dpt_cd_LC(MCEventInfo info) {
		super.doRcv_bill_dpt_cd_LC(info);
		getDtlL().clear();
		setBtnMode();
		setAmountFields();
	}

	@Override
	public void doRcv_draw_bank_cd_NC(MCEventInfo info) {
		super.doRcv_draw_bank_cd_NC(info);
		getRcvR().draw_branch_cd(null);
		getRcvR().draw_branch_nm(null);
	}

	@Override
	public void doRcv_note_typ_NC(MCEventInfo info) {
		super.doRcv_note_typ_NC(info);
		// 為替手形の場合
		if (MAC_NOTE_TYP.isXCHNG(getRcvR().note_typ())) {
			Rcv_accptr.setMode(MCMode.REQUIRED);
		}
		// 約束手形の場合
		else {
			setValueEx(Rcv_accptr, null);
			Rcv_accptr.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doRcv_setoff_bcst_cd_NC(MCEventInfo info) {
		super.doRcv_setoff_bcst_cd_NC(info);
		getDtlL().clear();
		setBtnMode();
		setAmountFields();
		setSetoffDebtCred();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		DtlR r = DtlTable.getSelectedMCRow();
		setBtnModeForMSBGP0220(r);
	}

	// 売掛明細消込ボタンの制御
	// 相殺方法に源泉税が選択されていない場合、源泉税の行は押下不可
	protected void setBtnModeForMSBGP0220(DtlR r) {
		if (isNull(r) || r.isEmpty()) {
			return;
		}
		if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(getHdrR().trd_ptn_typ())) {
			if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
					!MAC_AR_STTL_TYP.isWTAX(getRcvR().setoff_sttl_typ1())) {
				Btn_open_MSBGP0220.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBGP0220);
			}
		}
		else {
			if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
					!MAC_AR_STTL_TYP.isWTAX(getRcvR().ar_sttl_typ2())) {
				Btn_open_MSBGP0220.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBGP0220);
			}
		}
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		DtlR r = DtlTable.getRow(info.getEventIndex());
		if (!isSetoff()) {
			if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
				setValueEx(columnDtl_amt2, r.getGUIIndex(), r.check() ? r.not_appl_bal() : null);
			}
			else {
				setValueEx(columnDtl_amt1, r.getGUIIndex(), r.check() ? r.not_appl_bal() : null);
			}
		}
		else {
			setValueEx(columnDtl_amt4, r.getGUIIndex(), r.check() ? r.not_appl_bal() : null);
		}
	}

	public void doTotal_total_rcv_amt_NC(MCEventInfo info) {
		// ///その他相殺の場合
		// 明細のtotal_setoff_rcv_amt2が入力されると明細のtotal_rcv_amt(Invisible)に値がコピーされ、
		// total_rcv_amt,total_setoff_rcv_amtの値で明細の合計を計算する。計算した結果はtotal_rcv_amt,total_setoff_rcv_amtにコピーされる。
		// total_rcv_amtにコピーする際はsetValueExによりセットされており、その際のイベントで
		// 本メソッドが呼び出されている状態なので、計算用として使用したtotal_rcv_amt(Invisible)の
		// 値を実際の表示項目であるtotal_setoff_rcv_amt2にコピーする。
		if (isSetoff()) {
			getTotalR().total_setoff_rcv_amt2(getTotalR().total_rcv_amt());
		}
	}

	public void doDtl_amt1_NC(MCEventInfo info) {
		// 変更後の金額がnull以外の場合、消込フラグにチェックを入れる
		int index = info.getEventIndex();
		DtlR dtlR = DtlTable.getRow(index);
		if (!isNull(dtlR) && !isNull(dtlR.amt1())) {
			dtlR.check(true);
			// amt1に値が入力された場合、amt2(相殺額）を0にする。
			if (isNull(dtlR.amt2())) {
				dtlR.amt2(0);
			}
		}
		else {
			dtlR.check(false);
			dtlR.amt2(null);
		}
		setAmountFields();
	}

	public void doDtl_amt2_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR dtlR = DtlTable.getRow(index);
		if (!isNull(dtlR) && !isNull(dtlR.amt2())
				&& !dtlR.amt2().isZero()) {
			dtlR.check(true);

			if (isNull(dtlR.amt1())) {
				dtlR.amt1(0);
			}
		}
		setAmountFields();
	}

	/**
	 * amt4は相殺時に見せているだけなので、常にamt1と同期させる。
	 * 
	 * @param info
	 */
	public void doDtl_amt4_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		setValueEx(columnDtl_amt1, index, DtlTable.getRow(
				index).amt4());
		setAmountFields();
	}

	/**
	 * 入金検索により値の変更が行われていないことになるので、<BR>
	 * 伝票備考のNCイベントが発生した場合は変更があったことを保持しておく。
	 */
	@Override
	public void doRcv_trd_rmrks_NC(MCEventInfo info) {
		super.doRcv_trd_rmrks_NC(info);
		_isRmrksChange = true;
	}

	@Override
	public void doRcv_setoff_rcv_no_NC(MCEventInfo info) {
		super.doRcv_setoff_rcv_no_NC(info);
		clearWhenSetoffRcvRcvNoNC();
		setModeByTrdTyp();
		setModeBySloNo();
	}

	@Override
	public void doRcv_rcst_cd_LC(MCEventInfo info) {
		super.doRcv_rcst_cd_LC(info);
		setBcstDptMode();
		setValueEx(Rcv_bcst_cd, null);
		setValueEx(Rcv_bill_dpt_cd, null);
		getDtlL().clear();
		setBtnMode();
		setAmountFields();
		setXfrPsn();
	}

	protected void setXfrPsn() {
		if (!MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())) {
			getRcvR().xfr_psn(null);
		}
	}
	
	@Override
	public void doRcv_trd_cur_cd_NC(MCEventInfo info) {
		super.doRcv_trd_cur_cd_NC(info);
		setValueEx(Rcv_rcv_amt, null);
		getDtlL().clear();
		setAmountFields();
		if (!isNull(getRcvR().trd_cur_cd())) {
			Rcv_rcv_amt.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_rcv_amt.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doRcv_debt_cred_id_typ_LC(MCEventInfo info) {
		super.doRcv_debt_cred_id_typ_LC(info);

		if (isNull(getRcvR().debt_cred_id_typ())) {
			Rcv_debt_cred_id_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Rcv_debt_cred_id_cd);
		}

		setValueEx(Rcv_debt_cred_id_cd, null);
		setDebtCred();

		if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().debt_cred_id_typ())) {
			Rcv_debt_cred_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.FREE);
			setDefaultMode(Rcv_debt_cred_id_cd);
			Rcv_debt_cred_nm.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_debt_cred_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.STRICT);
			Rcv_debt_cred_nm.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doRcv_setoff_debt_cred_id_typ_LC(MCEventInfo info) {
		super.doRcv_setoff_debt_cred_id_typ_LC(info);

		if (isNull(getRcvR().setoff_debt_cred_id_typ())) {
			Rcv_setoff_debt_cred_id_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Rcv_setoff_debt_cred_id_cd);
		}

		setValueEx(Rcv_setoff_debt_cred_id_cd, null);
		setSetoffDebtCred();

		if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().setoff_debt_cred_id_typ())) {
			Rcv_setoff_debt_cred_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.FREE);
			setDefaultMode(Rcv_setoff_debt_cred_id_cd);
			Rcv_setoff_debt_cred_nm.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_setoff_debt_cred_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.STRICT);
			Rcv_setoff_debt_cred_nm.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setDebtCred() {
		if (MAC_DEBT_CRED_ID_TYP.isBCST(getRcvR().debt_cred_id_typ())) {
			setValueEx(Rcv_debt_cred_id_cd, getRcvR().bcst_cd());
		}
	}

	protected void setSetoffDebtCred() {
		if (MAC_DEBT_CRED_ID_TYP.isBCST(getRcvR().setoff_debt_cred_id_typ())) {
			setValueEx(Rcv_setoff_debt_cred_id_cd, getRcvR().setoff_bcst_cd());
		}
	}

	@Override
	public void doRcv_setoff_trd_cur_cd_LC(MCEventInfo info) {
		super.doRcv_setoff_trd_cur_cd_LC(info);
		getDtlL().clear();
		// 金額計算に入金額のフィールドを使用するので、相殺の通貨と入金の通貨を同期させる
		copySetoffCurToRcvCur();
		setAmountFields();
		getRcvR().setoff_rcv_amt(null);
		if (!isNull(getRcvR().trd_cur_cd())) {
			Rcv_setoff_rcv_amt.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_setoff_rcv_amt.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doRcv_rcv_dt_LC(MCEventInfo info) {
		super.doRcv_rcv_dt_LC(info);
		if (isNull(info.getNewValue())) {
			setValueEx(Rcv_tax_cd, null);
			return;
		}
	}

	@Override
	public void doRcv_setoff_dt_LC(MCEventInfo info) {
		super.doRcv_setoff_dt_LC(info);
		if (isNull(info.getNewValue())) {
			setValueEx(Rcv_setoff_tax_cd, null);
			return;
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) {
			DtlR r = getDtlL().get(info.getEventIndex());
			if (isNull(r) || r.isEmpty()) {
				return;
			}
			// 相殺方法に源泉税が選択されていない場合、源泉税の行はダブルクリックを無効化
			if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(getHdrR().trd_ptn_typ())) {
				if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
						!MAC_AR_STTL_TYP.isWTAX(getRcvR().setoff_sttl_typ1())) {
					return;
				}
				else {
					openMSBGP0220(info);
				}
			}
			else {
				if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
						!MAC_AR_STTL_TYP.isWTAX(getRcvR().ar_sttl_typ2())) {
					return;
				}
				else {
					openMSBGP0220(info);
				}
			}
		}
	}

	/**
	 * デフォルトの口座を設定する
	 * 
	 */
	protected void setDefaultAc() {

		if (isNull(getRcvR().rcv_no())) {
			if (MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())) {
				setValueEx(Rcv_bank_ac_cd, getHdrR().def_bank_ac_cd());
			}
		}
	}

	@Override
	public void setMode(String status) {
		super.setMode(status);
		setBankAcMode();
		setModeArSttl2();
	}

	/**
	 * 入金方法が「振込」以外の場合、口座・振込人名を入力不可にする
	 * 
	 */
	protected void setBankAcMode() {
		if (sruiffIsINSStatus() || sruiffIsUPDStatus()) {
			// 振込でない場合
			if (!MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())) {
				Rcv_bank_ac_cd.setMode(MCMode.READ_ONLY);
				Rcv_xfr_psn.setMode(MCMode.READ_ONLY);
			}
			// 振込の場合
			else {
				Rcv_bank_ac_cd.setMode(MCMode.REQUIRED);
				Rcv_xfr_psn.setMode(MCMode.ENABLE);
			}
		}
	}

	protected void setModeArSttl2() {
		if (isNull(getRcvR().ar_sttl_cd2())) {
			Rcv_tax_cd.setMode(MCMode.READ_ONLY);
			Rcv_debt_cred_id_typ.setMode(MCMode.READ_ONLY);
			Rcv_debt_cred_id_cd.setMode(MCMode.READ_ONLY);
			Rcv_debt_cred_nm.setMode(MCMode.READ_ONLY);
			Rcv_bd_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Rcv_tax_cd);
			setDefaultMode(Rcv_debt_cred_id_typ);
			setDefaultMode(Rcv_debt_cred_nm);
			setDefaultMode(Rcv_bd_dpt_cd);
			if (isNull(getRcvR().debt_cred_id_typ())) {
				Rcv_debt_cred_id_cd.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Rcv_debt_cred_id_cd);
			}
		}
	}

	public boolean sruiffIsINSStatus() {
		return getStatus() == INS;
	}

	public boolean sruiffIsUPDStatus() {
		return getStatus() == UPD;
	}

	/**
	 * 相殺の通貨ＣＤを 入金の通貨にコピーする。
	 */
	protected void copySetoffCurToRcvCur() {
		if (isSetoff()) {
			getRcvR().trd_cur_cd(getRcvR().setoff_trd_cur_cd());
		}
	}

	/**
	 * 伝票ＣＤ未入力時のクリア処理を行う
	 */
	protected void clearWhenNoTrdCd() {
		getRcvR().clear();
		getDtlL().clear();
		getTotalR().clear();
		getDtlCndR().clear();
		getBillDL().clear();
	}

	/**
	 * 入金ＮＯ変更時フィールドクリア
	 */
	protected void clearWhenRcvNoNC() {
		String rcvNo = getRcvR().rcv_no();
		String rmrks = getRcvR().trd_rmrks();
		String subChar1 = getRcvR().sub_char1();
		String subChar2 = getRcvR().sub_char2();
		String subChar3 = getRcvR().sub_char3();
		getRcvR().clear();
		getDtlL().clear();
		getTotalR().clear();
		getRcvR().rcv_no(rcvNo);
		getRcvR().trd_rmrks(rmrks);
		getRcvR().sub_char1(subChar1);
		getRcvR().sub_char2(subChar2);
		getRcvR().sub_char3(subChar3);

		setBaseCurValues();
	}

	/**
	 * 相殺入金ＮＯ変更時フィールドクリア
	 */
	protected void clearWhenSetoffRcvRcvNoNC() {
		String rcvNo = getRcvR().setoff_rcv_no();
		String rmrks = getRcvR().setoff_trd_rmrks();
		String subChar1 = getRcvR().setoff_sub_char1();
		String subChar2 = getRcvR().setoff_sub_char2();
		String subChar3 = getRcvR().setoff_sub_char3();
		getRcvR().clear();
		getDtlL().clear();
		getTotalR().clear();
		getRcvR().setoff_rcv_no(rcvNo);
		getRcvR().setoff_trd_rmrks(rmrks);
		getRcvR().setoff_sub_char1(subChar1);
		getRcvR().setoff_sub_char2(subChar2);
		getRcvR().setoff_sub_char3(subChar3);

		setBaseCurValues();
	}

	/**
	 * 入金区分変更時フィールドクリア
	 */
	protected void clearWhenArSttlTyp1NC() {
		clearNote();
		clearBank();
		clearSetOff();
	}

	/**
	 * 相殺方法変更時フィールドクリア（入金タブ）
	 */
	protected void clearWhenArSttlCd2NC() {
		clearSetOff();
	}

	/**
	 * 相殺方法変更時フィールドクリア（相殺タブ）
	 */
	protected void clearWhenSetoffSttlCd1NC() {
		clearSetOffForSetoffSttlCd1();
	}

	/**
	 * 手形項目クリア
	 */
	protected void clearNote() {
		Rcv_note_no.clear();
		Rcv_note_typ.clear();
		Rcv_note_typ_nm.clear();
		Rcv_draw_dt.clear();
		Rcv_due_dt.clear();
		Rcv_drawer_nm.clear();
		Rcv_endrsr.clear();
		Rcv_accptr.clear();
		Rcv_draw_bank_cd.clear();
		Rcv_draw_bank_nm.clear();
		Rcv_draw_branch_cd.clear();
		Rcv_draw_branch_nm.clear();
		Rcv_note_rsn_cd.clear();
		Rcv_note_rsn_nm.clear();
		Rcv_note_sub_char1.clear();
		Rcv_note_sub_char2.clear();
		Rcv_note_sub_char3.clear();
	}

	/**
	 * 振込項目クリア
	 */
	protected void clearBank() {
		Rcv_bank_ac_cd.clear();
		Rcv_bank_ac_nm.clear();
		Rcv_xfr_psn.clear();
	}

	/**
	 * 相殺方法項目クリア
	 */
	protected void clearSetOff() {
		Rcv_tax_cd.clear();
		Rcv_tax_nm.clear();
		Rcv_tax_rate.clear();
		Rcv_debt_cred_id_typ.clear();
		Rcv_debt_cred_id_typ_nm.clear();
		Rcv_debt_cred_id_cd.clear();
		Rcv_debt_cred_nm.clear();
		if (isNull(getRcvR().ar_sttl_cd2())) {
			Rcv_bd_dpt_cd.clear();
			Rcv_bd_dpt_nm.clear();
		}
	}

	protected void clearSetOffForSetoffSttlCd1() {
		Rcv_setoff_tax_cd.clear();
		Rcv_setoff_tax_nm.clear();
		Rcv_setoff_tax_rate.clear();
		Rcv_setoff_debt_cred_id_typ.clear();
		Rcv_setoff_debt_cred_id_typ_nm.clear();
		Rcv_setoff_debt_cred_id_cd.clear();
		Rcv_setoff_debt_cred_nm.clear();
		if (isNull(getRcvR().setoff_sttl_cd1())) {
			Rcv_setoff_bd_dpt_cd.clear();
			Rcv_setoff_bd_dpt_nm.clear();
		}
	}

	protected void setNoteMode() {

		// 取消、参照種別の場合、入金ＮＯが設定されている場合はモード制御しない
		if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected() || !isNull(getRcvR().rcv_no())) {
			return;
		}

		if (MAC_AR_STTL_TYP.isNOTE(getRcvR().ar_sttl_typ1())) {
			Rcv_note_no.setMode(MCMode.REQUIRED);
			Rcv_note_typ.setMode(MCMode.REQUIRED);
			Rcv_draw_dt.setMode(MCMode.REQUIRED);
			Rcv_due_dt.setMode(MCMode.REQUIRED);
			Rcv_drawer_nm.setMode(MCMode.REQUIRED);
			Rcv_endrsr.setMode(MCMode.ENABLE);
			Rcv_accptr.setMode(MCMode.READ_ONLY);
			Rcv_draw_bank_cd.setMode(MCMode.REQUIRED);
			Rcv_draw_branch_cd.setMode(MCMode.REQUIRED);
			Rcv_note_rsn_cd.setMode(MCMode.ENABLE);
			Rcv_note_sub_char1.setMode(MCMode.ENABLE);
			Rcv_note_sub_char2.setMode(MCMode.ENABLE);
			Rcv_note_sub_char3.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Rcv_note_no);
			setDefaultMode(Rcv_note_typ);
			setDefaultMode(Rcv_draw_dt);
			setDefaultMode(Rcv_due_dt);
			setDefaultMode(Rcv_drawer_nm);
			setDefaultMode(Rcv_endrsr);
			setDefaultMode(Rcv_accptr);
			setDefaultMode(Rcv_draw_bank_cd);
			setDefaultMode(Rcv_draw_branch_cd);
			setDefaultMode(Rcv_note_rsn_cd);
			setDefaultMode(Rcv_note_sub_char1);
			setDefaultMode(Rcv_note_sub_char2);
			setDefaultMode(Rcv_note_sub_char3);
		}

		// 為替手形の場合
		if (MAC_NOTE_TYP.isXCHNG(getRcvR().note_typ())) {
			Rcv_accptr.setMode(MCMode.REQUIRED);
		}
		// 約束手形、選択なしの場合
		else {
			Rcv_accptr.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 新規、更新、削除ボタンの表示を制御する。<b>
	 */
	protected void setBtnMode() {
		if (Cnd_ope_INS.isSelected()) {
			Btn_upd.setMode(MCMode.INVISIBLE);
			if (0 < getDtlL().size()) {
				Btn_ins.setMode(MCMode.ENABLE);
				Btn_select_all.setMode(MCMode.ENABLE);
				Btn_deselect_all.setMode(MCMode.ENABLE);
			}
			else {
				Btn_ins.setMode(MCMode.DISABLE);
				Btn_select_all.setMode(MCMode.DISABLE);
				Btn_deselect_all.setMode(MCMode.DISABLE);
			}
		}
		// 更新時
		else {
			Btn_ins.setMode(MCMode.INVISIBLE);
			if (0 < getDtlL().size()) {
				setUpdDelBtnEnable();
				Btn_select_all.setMode(MCMode.ENABLE);
				Btn_deselect_all.setMode(MCMode.ENABLE);
			}
			else {
				Btn_upd.setMode(MCMode.DISABLE);
				Btn_select_all.setMode(MCMode.DISABLE);
				Btn_deselect_all.setMode(MCMode.DISABLE);
			}
		}
	}

	/**
	 * 更新、削除ボタンをenableにする。
	 */
	protected void setUpdDelBtnEnable() {
		Btn_upd.setMode(MCMode.ENABLE);
		Btn_del.setMode(MCMode.ENABLE);
	}

	/**
	 * 1.タブの制御を行う。<BR>
	 * 2.取引区分によりモードの設定を行う。<BR>
	 * 3.その他、個別にモード設定が必要な項目のモードを設定する。
	 */
	protected void setModeByTrdTyp() {
		setTabPaneMode(getHdrR().trd_ptn_typ());
		setModeByTrdCd();
	}

	protected void setModeBySloNo() {
		if (isNull(getRcvR().slo_no())) {
			setValueEx(DtlCnd_slo_flg, true);
			setDefaultMode(DtlCnd_slo_flg);
		}
		else {
			setValueEx(DtlCnd_slo_flg, false);
			if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
				DtlCnd_slo_flg.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(DtlCnd_slo_flg);
			}
		}
	}

	protected void setModeDebtNm() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			if (isSetoff()) {
				if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().setoff_debt_cred_id_typ())) {
					Rcv_setoff_debt_cred_nm.setMode(MCMode.REQUIRED);
				}
			}
			else {
				if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().debt_cred_id_typ())) {
					Rcv_debt_cred_nm.setMode(MCMode.REQUIRED);
				}
			}
		}
	}

	// ------------------------------------- CellConfig -------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * セルコンフィグ(明細テーブル)
	 */
	public class DtlTableCellConfig extends MAUDP_CellConfig {
		@Override
		public Boolean getPriorMinusEnable(int index, MCColumnConfig column, MCTable table) {
			if (column == columnDtl_amt1) {
				return true;
			}
			if (column == columnDtl_amt2) {
				return true;
			}
			if (column == columnDtl_amt4) {
				return true;
			}
			
			return super.getPriorMinusEnable(index, column, table);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR)table.getBaseTable().getRow(index);

			if (column == columnDtl_check) {
				if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(getHdrR().trd_ptn_typ())) {
					if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
							!MAC_AR_STTL_TYP.isWTAX(getRcvR().setoff_sttl_typ1())) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1()) &&
							!MAC_AR_STTL_TYP.isWTAX(getRcvR().ar_sttl_typ2())) {
						return MCMode.READ_ONLY;
					}
				}

			}
			if (column == columnDtl_amt1) {
				// 消込情報の源泉税行は入金額を読取専用とする
				if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_amt2) {
				// 入金タブの相殺方法が源泉税の場合
				if (MAC_AR_STTL_TYP.isWTAX(getRcvR().ar_sttl_typ2())) {
					// 明細の源泉税行以外は相殺額を読取専用
					if (!MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
						return MCMode.READ_ONLY;
					}
				}
				// 入金タブの相殺方法が源泉税以外の場合
				else {
					// 明細の源泉税行は相殺額を読取専用
					if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getRcvR());
		ret.add(getTotalR());
		ret.add(getDtlL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		ret.add(getDtlCndR());
		return ret;
	}

	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	public MCRowBeans getCndRevNo() {
		return Cnd_rcv_act_rev;
	}

	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRevNoMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {

		if (!super.doCnd_ope_VC(info)) {
			return false;
		}

		String beforMode = this.getStatus();
		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();

		// 参照種別から訂正、取り消しの種別に遷移するときは、過去リビジョンの場合は遷移できないようにする
		if ((isREFOpe(beforeOpe) && isREFStatus(beforMode)) && (isUPDOpe(afterOpe) || isDELOpe(afterOpe))) {
			if (!Hdr_latest_flg.getValue()) {
				dialog(msgPastRevisionCannotChanged());
				return false;
			}
		}
		return true;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 登録するに変更された場合
		if (Cnd_ope_INS.isSelected()) {
			// 取引ＣＤ未入力時
			if (isNull(getHdrR().trd_cd())) {
				setNO_SLIP_CDStatus();
				Hdr_trd_cd.mcRequestFocus();
			}
		}

		// 訂正するに変更された場合
		if (Cnd_ope_UPD.isSelected()) {
			setRcvTabMode();
			setAdditionalMode();
			setDtlAmtModeREQ();
			setBillDRmrksMode();
			
			// 売掛金その他相殺のモード設定
			if (isSetoff()) {
				setSetoffTabMode();
				setSettoffTaxMode();
			}
			else{
				setTaxMode();
				setModeBySloNo();
				setNoteMode();
			}
			setModeDebtNm();
		}

		// 最新ＦＬＧ、改訂番号のモード制御
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_rcv_act_rev.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_latest_flg);
			setDefaultMode(Cnd_rcv_act_rev);
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			// 種別切り替え時に検索区分が変わる場合は、種別変更後の検索区分とNOの整合性を考え、適切なNOを検索条件に設定する
			// 検索区分とNOの整合性が取れない場合は、検索条件のNOを設定しない
			getCndR().rcv_act_no(getHdrR().rcv_act_no());
		}
	}
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

}