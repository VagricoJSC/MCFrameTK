package mcframe.clientMSBG.MSBGP0220;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
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
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_ArDtlApplReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_ArDtlApplReg_MC extends MSBGP_ArDtlApplReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 売掛消込画面と連携するための消込明細リスト
	protected MCList<MCRow> _billDL;

	// 引数（売掛消込登録画面の選択行）
	protected MCRow _dtlR;

	// 引数のバインド(ヘッダ情報)
	protected MCRow _bind;

	// 引数の検索条件リスト
	protected MCList<MCRow> _srchCndP;

	// 親画面の消込フラグ
	protected MCColumnConfig _applFlg;

	// 本画面の検索条件
	protected MCRow _srchCnd;

	// 親画面の入金額
	protected MCColumnConfig _amt1;

	// 親画面の相殺額
	protected MCColumnConfig _amt2;

	// 親画面の相殺額（その他相殺）
	protected MCColumnConfig _amt4;

	// 売掛消込登録画面の取引パタン区分
	protected String _trdPtnTyp;

	// 売掛消込登録画面の消込明細の債権決済区分
	protected String _ar_sttl_typ;

	//　最後に検索した際の検索条件
	protected CndR _lastSrchCnd;

	// 売掛消込画面から起動された場合はtrue
	protected MCNumber _grpSeq = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArDtlApplReg_MC() {
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
	public MSBGP_ArDtlApplReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 確定前チェック
	 * 
	 * @return 確定しても良い状態の場合にtrue
	 */
	protected boolean checkForUpd() {
		// 確定前確認
		if (confirm(MSBGP0008) != MCMessageBox.YES_OPTION) {
			return false;
		}
		return true;
	}

	/**
	 * 確定前チェック(明細無し)
	 * 
	 * @return 確定しても良い状態の場合にtrue
	 */
	protected boolean checkForUpdNoDtl() {
		// 確定前確認
		if (confirm(MSBGP0009) != MCMessageBox.YES_OPTION) {
			return false;
		}
		return true;
	}

	/**
	 * [MS_MSBGL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0220_Srch01Caller<P extends MSBGP_ArDtlApplReg, B extends MS_MSBGL0220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0220_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (!isNull(_grpSeq)) {
				// 検索条件を保持する
				saveSrchCnd();
			}
		}

		@Override
		protected void clear() {
			if (!isNull(_grpSeq)) {
				getApplDtlL().clear();
			}
			else {
				super.clear();
			}
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			afterCallArAppl();
		}

		/**
		 * 売掛消込の子画面として起動した場合の処理
		 */
		protected void afterCallArAppl(){
			// 売掛消込登録の子画面として起動された場合の引継ぎ項目を表示用に移し変える
			// 通常起動して検索した場合は検索結果となる項目
			if(!isNull(_grpSeq)){
				setRcvActD(bridge.down0());
			}
		}

		/**
		 * 検索条件を保持する。売掛消込との連携で検索条件の初期値として利用する。
		 */
		protected void saveSrchCnd() {
			if(isNull(_lastSrchCnd)){
				_lastSrchCnd = CndR.create();
			}
			MCRow.copyall(_lastSrchCnd, getCndR());
		}

		@Override
		protected void show() {
			super.show();
			// 売掛消込の子画面として起動した場合
			if (!isNull(_grpSeq)) {
				showArApplMode();
			}
			else {
				//通常起動の場合
				for (ApplDtlR r : getApplDtlL()) {
					showSub(r);
				}
			}
		}

		/**
		 * 売掛消込の子画面として起動した場合の表示処理<BR>
		 * 保持している明細消込情報と、検索結果の明細消込情報をマージする。検索結果のうち、保持している情報
		 * とマッチするものは、消込額に保持している情報をセットする。
		 */
		protected void showArApplMode(){
			MCList<MCRow> applL = _billDL.subList("grp_seq", _grpSeq);
			MCIndexKey key = applL.createIndex("bill_d_no", "parent_bill_d_no");
			MCIndexKey key2 = _billDL.createIndex("bill_d_no", "parent_bill_d_no");

			for (ApplDtlR r : getApplDtlL()) {
				showSub(r);
				MCList<MCRow> tgtApplL = applL.subList(key, r.bill_d_no(), r.parent_bill_d_no());

				// 全明細消込情報の消込金額を取得
				MCList<MCRow> allApplL = _billDL.subList(key2, r.bill_d_no(), r.parent_bill_d_no());
				MCNumber allApplAmt = allApplL.isEmpty() ? MCNumber.ZERO : allApplL.sum("appl_amt");
				MCNumber orgAllApplAmt = allApplL.isEmpty() ? MCNumber.ZERO : allApplL.sum("org_appl_amt");

				//キーでsubListするので0件か1件の想定。1件の場合は売掛消込との連携で消込額を保持している状態
				//なので、検索結果に反映する
				if(tgtApplL.size() == 1){
					// 裏で保持しているMCRow
					MCRow tgtR = tgtApplL.get(0);
					r.appl_amt(tgtR.getNumber("appl_amt"));
					// DBの消込累計額　＋　（保持している消込額　－　DBの消込額）
					r.ttl_appl_amt(r.ttl_appl_amt().add(allApplAmt.subtract(orgAllApplAmt)));

					r.not_appl_amt(r.appl_tgt_amt().subtract(r.ttl_appl_amt()));
					if (!r.appl_amt().isZero()) {
						r.check(true);
					}
					else {
						r.check(false);
					}
					if (!isNull(tgtR)) {
						r.setStatus(tgtR.getStatus());
					}
				}
				else if (!allApplL.isEmpty()) {
					// DBの消込累計額　＋　（保持している消込額　－　DBの消込額）
					r.ttl_appl_amt(r.ttl_appl_amt().add(allApplAmt.subtract(orgAllApplAmt)));

					r.not_appl_amt(r.appl_tgt_amt().subtract(r.ttl_appl_amt()));
					if (!r.appl_amt().isZero()) {
						r.check(true);
					}
					else {
						r.check(false);
					}
				}
			}

			// 消込額計の設定
			getRcvActDR().ttl_appl_amt(getApplDtlL().sum(ApplDtlR.$appl_amt));
			setAmtForSlipDR();
		}

		/**
		 * 検索後の後処理
		 * 
		 * @param r 検索結果のコンテナ
		 */
		protected void showSub(ApplDtlR r) {

			// NULL文字を空白に置き換え
			nullValToNull(r, ApplDtlR.$bill_ym);
			nullValToNull(r, ApplDtlR.$wrk_no);

			// 定数
			MAC_SLIP_STS_TYP.putNameNE(r, ApplDtlR.$slip_sts_typ, ApplDtlR.$slip_sts_typ_nm);
			MAC_AR_TYP.putNameNE(r, ApplDtlR.$ar_typ, ApplDtlR.$ar_typ_nm);

			// その他
			r.org_appl_amt(r.appl_amt());
			r.org_ttl_appl_amt(r.ttl_appl_amt());
			r.org_check(r.check());
		}

		@Override
		protected void setMode() {

			if (Cnd_ope_UPD.isSelected()) {
				if (!isNull(_grpSeq)) {
					setUPD_APPLStatus();
				}
				else {
					setUPDStatus();
				}
			}
			else {
				setREFStatus();
			}
		}

		@Override
		protected void setModeNoDown() {
			if (Cnd_ope_UPD.isSelected()) {
				setSRCHStatus();
			}
			else if(Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
		}
	}

	/**
	 * [MS_MSBGL0220_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0220_Upd01Caller<P extends MSBGP_ArDtlApplReg, B extends MS_MSBGL0220_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0220_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			setFIX_UStatus();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0220_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		if (ApplDtlTable.getViewRows().isEmpty()) {
			return;
		}
		applAllAmt();
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		if (ApplDtlTable.getViewRows().isEmpty()) {
			return;
		}
		clearAllAmt();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0220_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_appl]の押下時の処理
	 */
	@Override
	public void doBtn_upd_appl(MCEventInfo info) {
		if (!checkForUpd()) {
			return;
		}
		// 保持している情報をクリアして現在の情報で上書きする
		_billDL.removeAll(_billDL.subList("grp_seq", _grpSeq));

		for (ApplDtlR r : getApplDtlL()) {
			if (r.check()) {
				MCRow dest = _billDL.createRow();
				dest.setStringNE("bill_d_no", r.bill_d_no());
				dest.setStringNE("parent_bill_d_no", r.parent_bill_d_no());
				dest.setStringNE("bill_mng_no", r.bill_mng_no());
				dest.setNumberNE("appl_tgt_amt", r.appl_tgt_amt());
				dest.setNumberNE("ttl_appl_amt", r.ttl_appl_amt());
				dest.setNumberNE("appl_amt", r.appl_amt());
				dest.setNumberNE("org_appl_amt", r.org_appl_amt());
				dest.setNumberNE("bill_d_upd_cntr", r.bill_d_upd_cntr());
				dest.setNumberNE("bill_d_appl_bal_upd_cntr", r.bill_d_appl_bal_upd_cntr());
				dest.setNumberNE("grp_seq", _grpSeq);
				dest.setStatus(r.getStatus());

				_billDL.add(dest);
			}
		}

		if (!getApplDtlL().isEmpty()) {
			// 明細消込の合計金額を売掛消込画面の明細に反映する
			// その他相殺の場合
			if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(_trdPtnTyp)) {
				MCTable<?> base = _amt4.getBaseTable();
				int i = base.getMCSelectedRow();
				setValueEx(_amt4, i, getRcvActDR().ttl_appl_amt());
			}
			else {
				// 入金額＋相殺額が消込額計に引き継がれているので、売掛消込の入金額には相殺額を
				// 除いた金額を設定する
				MCTable<?> base = _amt4.getBaseTable();
				int i = base.getMCSelectedRow();
				if (MAC_AR_STTL_TYP.isWTAX(_ar_sttl_typ)) {
					setValueEx(_amt2, i, getRcvActDR().ttl_appl_amt());
				}
				else {
					setValueEx(_amt1, i, getRcvActDR().ttl_appl_amt().subtract(
							nvl(_dtlR.getNumber("amt2"), MCNumber.ZERO)));
				}
			}
		}
		else {
			if (!checkForUpdNoDtl()) {
				return;
			}
		}

		addSrchCnd();
		statusClear();
		requestCloseWindow();
	}

	protected void addSrchCnd() {

		if (isNull(_srchCnd)) {
			_srchCnd = _srchCndP.createRow();
			_srchCndP.add(_srchCnd);
		}
		_srchCnd.setNumber("grp_seq", _grpSeq);
		_srchCnd.setDate("ac_dt_fr", _lastSrchCnd.ac_dt_fr());
		_srchCnd.setDate("ac_dt_to", _lastSrchCnd.ac_dt_to());
		_srchCnd.setString("slo_no", _lastSrchCnd.slo_no());
		_srchCnd.setString("ar_appl_schd_no", _lastSrchCnd.ar_appl_schd_no());
		_srchCnd.setBoolean("inc_not_bill_flg", _lastSrchCnd.inc_not_bill_flg());
		_srchCnd.setBoolean("inc_otr_slo_flg", _lastSrchCnd.inc_otr_slo_flg());
	}

	/**
	 * 全ての消し込まれた金額を戻す
	 * 
	 */
	protected void clearAllAmt() {
		// 明細単位の処理
		for (ApplDtlR applDR : ApplDtlTable.getViewRows()) {
			applDR.check(false);
			setAmtByApplFlg(applDR);
			setBillDRStatus(applDR);
		}

		// ヘッダ情報の更新
		setAmtForSlipDR();
	}

	/**
	 * 残額を全て明細に振り分ける<br>
	 * 処理順はデータセットの並び順
	 * 
	 */
	protected void applAllAmt() {

		clearAllAmt(); // 明細の消込金額を一旦初期化する

		// 売掛消込との連携で消込対象額が決定していない場合で消込額計が0の場合(売掛消込で金額が指定されていない）
		// すべての明細のチェックをオンにする
		if (!isNull(_grpSeq) && getRcvActDR().appl_tgt_amt().isZero()) {
			for (ApplDtlR r : ApplDtlTable.getViewRows()) {
				setValueEx(columnApplDtl_check, r.getGUIIndex(), true);
				setAmtByApplFlg(r);
				setBillDRStatus(r);
				setAmtForSlipDR();
			}
			return;
		}

		MCList<ApplDtlR> applL = getApplTgtL();

		MCNumber ttlAmt = getRcvActDR().appl_tgt_amt().subtract(getRcvActDR().ttl_appl_amt()); // 消込額の合計
		MCNumber notApplAmt = getApplDtlL().sum(ApplDtlR.$not_appl_amt);
		applL.addNumberColumn("temp");

		for (ApplDtlR applR : applL) {
			MCNumber amt = getAmtToBeFilled(applR);
			applR.setNumber("temp", amt);
		}

		if (notApplAmt.lte(ttlAmt)) {
			for (ApplDtlR r : applL) {
				r.appl_amt(r.getNumberNE("temp"));
			}
		}
		else {
			FXUCC_Divide.inSeq(applL, ttlAmt, "temp", ApplDtlR.$appl_amt); // 振り分け
		}

		// 割り振った金額により明細の、消込累計額、消込残高とフラグを更新
		for (ApplDtlR applR : applL) {

			setSubAmt(applR);

			if (!applR.appl_amt().isZero()) {
				applR.check(true);
			}
			setBillDRStatus(applR);
		}

		// ヘッダ情報の更新
		setAmtForSlipDR();

		// 消込済みを最初にソート
		if (getBtnR().prio_can_red_flg()) {
			getApplDtlL().sort(ApplDtlTable.getSortPolicy());
		}
		ApplDtlTable.adjustWidth();
	}

	/**
	 * 消込対象の請求明細を取得する<br>
	 * 赤黒のセットは優先的に消し込まれるようにソート順を変更する
	 * 
	 * @return 消込対象の請求明細
	 */
	protected MCList<ApplDtlR> getApplTgtL() {
		MCList<ApplDtlR> viewBilldL = ApplDtlTable.getViewRows();

		if (!getBtnR().prio_can_red_flg()) {
			return viewBilldL;
		}

		viewBilldL.setBooleanNE("pair", false);

		MCList<ApplDtlR> applDL = MCList.create(ApplDtlR.class);
		MCList<ApplDtlR> pairDL = MCList.create(ApplDtlR.class);
		MCNumber ttlAmt = getRcvActDR().appl_tgt_amt().subtract(getRcvActDR().ttl_appl_amt());

		MCIndexKey idxKey = viewBilldL.createIndex(ApplDtlR.$act_d_no, ApplDtlR.$act_d_seq);
		for (ApplDtlR viewBilldR : viewBilldL) {

			// 取消の場合はセットの赤伝を探してペアリストに追加
			if (MAC_SLIP_STS_TYP.isDIS(viewBilldR.slip_sts_typ())) {

				// 他の伝票で取消伝票の明細が消込されている場合は自動消込の対象外とする
				if (!viewBilldR.ttl_appl_amt().isZero()) {
					continue;
				}

				MCList<ApplDtlR> redL = viewBilldL
										.subList(idxKey, viewBilldR.act_d_no(), viewBilldR.act_d_seq().add(1));

				if (!redL.isEmpty()) {
					// 他の伝票で赤伝の明細が消込されている場合は自動消込の対象外とする
					if (!redL.get(0).ttl_appl_amt().isZero()) {
						continue;
					}

					// 残高振替で一部金額のみ振替されている場合は自動消込の対象外とする
					if (!redL.get(0).appl_tgt_amt().add(viewBilldR.appl_tgt_amt()).isZero()) {
						continue;
					}

					boolean isRedFirst = redL.get(0).appl_tgt_amt().multiply(ttlAmt).isNegative();

					// 入金額と符号違いの明細が先に配置されるようにする
					pairDL.add(isRedFirst ? redL.get(0) : viewBilldR); // 入金額と符号違いの明細を追加
					pairDL.add(isRedFirst ? viewBilldR : redL.get(0)); // 入金額と符号が同じ明細を追加

					redL.get(0).setBoolean("pair", true);
					viewBilldR.setBoolean("pair", true);

					continue;
				}
			}
		}

		// 最初に取消伝票と赤伝票のセットを追加
		applDL.addAll(pairDL);
		applDL.addAll(viewBilldL.subList("pair", false));

		return applDL;

	}

	/**
	 * 消込情報の行のステータスを設定する
	 * 
	 * @param applDR ステータス設定対象行
	 */
	protected void setBillDRStatus(ApplDtlR applDR) {

		// 変更が無ければフラグをクリア
		if ((applDR.check() == applDR.org_check())
				&& isSame(applDR.appl_amt(), applDR.org_appl_amt())) {

			applDR.setStatus(Status.NONE);
		}
		// 変更があれば変更フラグを立てる
		else {
			applDR.setStatus(Status.MODIFY);
		}
	}

	/**
	 * 消込選択フラグに基づいて消込額を設定する
	 * 
	 * @param applDR 処理対象行
	 */
	protected void setAmtByApplFlg(ApplDtlR applDR) {
		setApplAmt(applDR, applDR.check() ? getAmtToBeFilled(applDR) : MCNumber.ZERO);
	}

	/**
	 * 金額フィールドの設定
	 * 
	 */
	protected void setAmtForSlipDR() {
		MCNumber total = getApplDtlL().sum(ApplDtlR.$appl_amt);
		getRcvActDR().ttl_appl_amt(total);
		getRcvActDR().not_appl_amt(getRcvActDR().appl_tgt_amt().subtract(total));
	}

	/**
	 * 消し込まれるべき金額を取得する<br>
	 * 現在画面上で消しこまれている金額は考慮しない
	 * 
	 * @param applDR 対象行
	 * @return 消し込まれるべき金額
	 */
	protected MCNumber getAmtToBeFilled(ApplDtlR applDR) {
		// 消込対象額 - (元消込累計額 - 元消込額)
		MCNumber tgt = applDR.appl_tgt_amt().subtract(
				applDR.org_ttl_appl_amt().subtract(applDR.org_appl_amt()));
		return tgt;
	}

	/**
	 * 指定行に消込額を設定する
	 * 
	 * @param applDR 消込対象行
	 * @param amt 消込額
	 */
	protected void setApplAmt(ApplDtlR applDR, MCNumber amt) {
		applDR.appl_amt(amt);
		setSubAmt(applDR);
		setBillDRStatus(applDR);
	}

	/**
	 * 消込累計額および消込残高を設定する
	 * 
	 * @param billdR 計算対象行
	 */
	protected void setSubAmt(ApplDtlR applDR) {

		MCList<MCRow> oApplL = MCList.create(MCRow.class);

		if (!isNull(_billDL)) {
			MCIndexKey key = _billDL.createIndex("bill_d_no", "parent_bill_d_no");
			// 全明細消込情報の消込金額を取得
			oApplL = _billDL.subList(key, applDR.bill_d_no(), applDR.parent_bill_d_no());
			oApplL.remove(oApplL.getFirst("grp_seq", _grpSeq));
		}

		MCNumber oApplAmt = oApplL.isEmpty() ? MCNumber.ZERO : oApplL.sum("appl_amt");
		MCNumber orgOApplAmt = oApplL.isEmpty() ? MCNumber.ZERO : oApplL.sum("org_appl_amt");

		// 金額がnullの場合は計算時に0として扱う
		MCNumber applAmt = isNull(applDR.appl_amt()) ? MCNumber.ZERO : applDR.appl_amt();
		// 消込累計額 = 元消込累計額 + (当消込額 - 当元消込額)+ (他消込額 - 他元消込額)
		applDR.ttl_appl_amt(applDR.org_ttl_appl_amt().add(applAmt.subtract(applDR.org_appl_amt()).add(oApplAmt.subtract(orgOApplAmt))));

		// 消込残高 = 消込対象 - 消込累計額
		applDR.not_appl_amt(applDR.appl_tgt_amt().subtract(applDR.ttl_appl_amt()));
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		RcvActD_appl_tgt_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		RcvActD_ttl_appl_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		RcvActD_not_appl_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		ApplDtl_appl_tgt_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		ApplDtl_ttl_appl_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		ApplDtl_appl_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		ApplDtl_not_appl_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_amt_dec_place);
		ApplDtl_trd_unit_qty_p_PPanel.setRelateBeans(columnApplDtl_trd_unit_cd, columnApplDtl_qty_dec_place);
		ApplDtl_trd_cur_upri_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_upri_dec_place);
		ApplDtl_trd_cur_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_upri_dec_place);
		ApplDtl_trd_cur_tax_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_upri_dec_place);
		ApplDtl_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(RcvActD_trd_cur_cd, RcvActD_upri_dec_place);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnApplDtl_appl_amt.addNCListener(this);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getBtnR().prio_can_red_flg(true);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		ApplDtlTable.addSortColumn(columnApplDtl_check, MCList.SortType.DESC);
		ApplDtlTable.addSortColumn(columnApplDtl_ac_dt, MCList.SortType.ASC);
		ApplDtlTable.addSortColumn(columnApplDtl_bill_no, MCList.SortType.ASC);
		ApplDtlTable.addSortColumn(columnApplDtl_act_no, MCList.SortType.ASC);
		ApplDtlTable.addSortColumn(columnApplDtl_act_seq, MCList.SortType.ASC);
		ApplDtlTable.addSortColumn(columnApplDtl_act_d_no, MCList.SortType.ASC);
}
	// //////////////////////モード設定/////////////////////////////

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setDefFocus();
		
	}

	@Override
	public void setSRCHStatus() {
		if (isNull(_grpSeq)) {
			super.setSRCHStatus();
			clearContainers(getRcvActDR(), getApplDtlL());
		}
		else {
			setSRCH_APPLStatus();
			clearContainers(getCndR(), getRcvActDR(), getApplDtlL());
		}
		setDefFocus();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		ApplDtlTable.selectLeftmostColumn(0);
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {

		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			// ヘッダ情報
			_bind = bind;
			// 請求残高
			_dtlR = (MCRow) args[0];
			// 明細消込情報
			_billDL = (MCList<MCRow>) args[1];
			_srchCndP = (MCList<MCRow>) args[2];
			_applFlg = (MCColumnConfig) args[3];
			_amt1 = (MCColumnConfig) args[4];
			_amt2 = (MCColumnConfig) args[5];
			_amt4 = (MCColumnConfig) args[6];

			_trdPtnTyp = bind.getString("trd_ptn_typ");
			_grpSeq = _dtlR.getNumber("grp_seq");
			_ar_sttl_typ = bind.getString("ar_sttl_typ");

			// 保持している検索条件の設定
			MCList<MCRow> srchCndL = _srchCndP.subList("grp_seq", _grpSeq);
			if (!srchCndL.isEmpty()) {
				// 保持されている場合は1件のみ存在するはず
				_srchCnd = srchCndL.get(0);
			}

			// 検索条件設定
			setSrchCnd();
			getBtnR().prio_can_red_flg(true);
			setSRCH_APPLStatus();
			addDoBehind(Cnd_srch);
		}
	}

	protected void setSrchCnd(){
		setCnd();
		setRcvActD(getRcvActDR());
	}

	protected void setCnd() {
		CndR cndR = getCndR();
		cndR.ar_appl_schd_no(_bind.getStringNE("ar_appl_schd_no"));
		cndR.rcv_act_d_no(_bind.getStringNE("rcv_act_d_no"));
		cndR.slo_no(_bind.getStringNE("slo_no"));

		// 保持している検索条件の設定
		if (!isNull(_srchCnd)) {
			cndR.ac_dt_fr(_srchCnd.getDate("ac_dt_fr"));
			cndR.ac_dt_to(_srchCnd.getDate("ac_dt_to"));
			cndR.slo_no(_srchCnd.getString("slo_no"));
			cndR.ar_appl_schd_no(_srchCnd.getString("ar_appl_schd_no"));
			cndR.inc_not_bill_flg(_srchCnd.getBoolean("inc_not_bill_flg"));
			cndR.inc_otr_slo_flg(_srchCnd.getBoolean("inc_otr_slo_flg"));
		}

		// 未請求含むの設定
		if (MAC_STR.isNULL_VAL(_dtlR.getStringNE("bill_no"))) {
			cndR.inc_not_bill_flg(true);
		}

		// 他の受注含むの設定
		if (!isNull(_bind.getStringNE("slo_no")) && _dtlR.getBooleanNE("other_slo_flg")) {
			cndR.inc_otr_slo_flg(true);
		}
	}

	protected void setRcvActD(RcvActDR r) {
		// 入金実績明細情報に引き継ぐ情報を設定
		r.trd_cd(_bind.getStringNE("trd_cd"));
		r.trd_nm(_bind.getStringNE("trd_nm"));
		r.ac_ym(_bind.getDateNE("ac_ym"));
		r.ac_dt(_bind.getDateNE("ac_dt"));
		r.rcst_cd(_bind.getStringNE("rcst_cd"));
		r.rcst_nm(_bind.getStringNE("rcst_nm"));
		r.bcst_cd(_bind.getStringNE("bcst_cd"));
		r.bcst_nm(_bind.getStringNE("bcst_nm"));
		r.bill_dpt_cd(_bind.getStringNE("bill_dpt_cd"));
		r.bill_dpt_nm(_bind.getStringNE("bill_dpt_nm"));
		r.rcv_mtd_cd(_bind.getStringNE("ar_sttl_cd1"));
		r.rcv_mtd_nm(_bind.getStringNE("ar_sttl_nm1"));
		r.trd_cur_cd(_bind.getStringNE("trd_cur_cd"));
		r.trd_cur_nm(_bind.getStringNE("trd_cur_nm"));
		r.rcv_dt(_bind.getDateNE("rcv_dt"));
		r.amt_dec_place(_bind.getNumberNE("amt_dec_place"));
		r.upri_dec_place(_bind.getNumberNE("upri_dec_place"));
		r.trd_ptn_typ(_bind.getStringNE("trd_ptn_typ"));

		r.acst_cd(_dtlR.getStringNE("acst_cd"));
		r.acst_nm(_dtlR.getStringNE("acst_nm"));
		r.ar_dpt_cd(_dtlR.getStringNE("ar_dpt_cd"));
		r.ar_dpt_nm(_dtlR.getStringNE("ar_dpt_nm"));
		r.wg_cd(_dtlR.getStringNE("wg_cd"));
		r.wg_nm(_dtlR.getStringNE("wg_nm"));
		r.wrk_no(_dtlR.getStringNE("wrk_no"));
		r.wrk_nm(_dtlR.getStringNE("wrk_nm"));
		r.ar_typ(_dtlR.getStringNE("ar_typ"));
		r.ar_typ_nm(_dtlR.getStringNE("ar_typ_nm"));
		r.iv_no(_dtlR.getStringNE("iv_no"));
		// その他相殺の場合
		if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(_trdPtnTyp)) {
			r.appl_tgt_amt(nvl(_dtlR.getNumberNE("amt4"), MCNumber.ZERO));
		}
		else {
			// 売掛消込から参考情報として入金額と相殺額の合計を引き継ぐ。入力されていない場合は0とみなす。
			r.appl_tgt_amt(sum(nvl(_dtlR.getNumberNE("amt1"), MCNumber.ZERO),
					nvl(_dtlR.getNumberNE("amt2"), MCNumber.ZERO)));
		}
	}

	// ------------------------------------- CellConfig -------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		ApplDtlTable.setCellConfig(createApplDtlTableCellConfig());
	}

	protected MCCellConfig createApplDtlTableCellConfig() {
		return new ApplDtlTableCellConfig();
	}

	/**
	 * セルコンフィグ(明細テーブル)
	 */
	public class ApplDtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public Boolean getPriorMinusEnable(int index, MCColumnConfig column, MCTable table) {
			if (column == columnApplDtl_appl_amt) {
				return true;
			}

			return super.getPriorMinusEnable(index, column, table);
		}
	}

	@Override
	public void screenClearSetDefault() {
		super.screenClearSetDefault();
		// 売掛消込の子画面として起動した場合は画面クリアをしても非表示の検索条件、伝票明細情報を保持する。
		if (!isNull(_grpSeq)) {
			setRcvActD(getRcvActDR());
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnApplDtl_appl_amt) {
			doApplDtl_appl_amt_NC(info);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (Cnd_ope_UPD.isSelected()) {
			setSRCHStatus();
		}
		else if(Cnd_ope_REF.isSelected()) {
			setREFStatus();
			clearContainers(getRcvActDR(), getApplDtlL());
			// クリアする項目を設定する
			clearCnd();
		}
	}
	
	/**
	 * クリアする項目を設定する
	 */
	protected void clearCnd() {
		setValueEx(Cnd_ac_dt_fr, null);
		setValueEx(Cnd_ac_dt_to, null);
		setValueEx(Cnd_inc_not_bill_flg, false);
		setValueEx(Cnd_inc_otr_slo_flg, false);
	}

	@Override
	public void doApplDtl_check_NC(MCEventInfo info) {
		super.doApplDtl_check_NC(info);
		ApplDtlR r = ApplDtlTable.getRow(info.getEventIndex());
		if (isNull(r)) {
			return;
		}

		setAmtByApplFlg(r);
		setAmtForSlipDR();
	}

	public void doApplDtl_appl_amt_NC(MCEventInfo info) {
		ApplDtlR r = ApplDtlTable.getRow(info.getEventIndex());
		if (isNull(r)) {
			return;
		}

		setCheck(r);
		setSubAmt(r);
		setBillDRStatus(r);
		setAmtForSlipDR();
	}

	protected void setCheck(ApplDtlR applDR) {
		if (isNull(applDR.appl_amt()) || applDR.appl_amt().isZero()) {
			applDR.check(false);
		}
		else {
			applDR.check(true);
		}
	}

	protected void setDefFocus() {
		CndPanel.focusFirstComponent();
	}

	@Override
	protected MCPanel getOpeHdrPanel() {
		return HdrTabPanel;
	}

}