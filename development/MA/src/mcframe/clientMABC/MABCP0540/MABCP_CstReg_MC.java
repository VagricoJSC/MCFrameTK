package mcframe.clientMABC.MABCP0540;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_CstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_CstReg_MC extends MABCP_CstReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CstReg_MC() {
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
	public MABCP_CstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0540_Upd01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0540_Srch01();
	}
	/**
	 * [MA_MABCL0540_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0540_Srch01Caller<P extends MABCP_CstReg, B extends MA_MABCL0540_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0540_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getHdrR(), getWrk1HdrR(), getWrk1HdrAllL());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkAtLeastOneCndDelFlg(msgList);
		}
		
		@Override
		protected void show() {
			super.show();

			copy(getWrk1HdrR(), getWrk1HdrAllL().get(0), createMap_Wrk1HdrR_Wrk1HdrAllR());
			setValueEx(Hdr_bp_cd, getWrk1HdrR().bp_cd());
			setValueEx(Hdr_acst_flg, getWrk1HdrR().acst_flg());

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			getWrk1HdrR().check_ar_dpt_cd(getWrk1HdrR().ar_dpt_cd());
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();

			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void moveFocus() {
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk4DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);
			Wrk6DtlTable.selectRowNoFocus(0);
			Wrk7DtlTable.selectRowNoFocus(0);
			Wrk8DtlTable.selectRowNoFocus(0);

			DtlTabTab.focusActiveFirstComponent();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MA_MABCL0540_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0540_Upd01Caller<P extends MABCP_CstReg, B extends MA_MABCL0540_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0540_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			// エラーメッセージから「行番号」を消すため
			if (!bridge.up0().isEmpty()) {
				bridge.up0().get(0).setGUIIndex(-1);
			}
		}

		@Override
		protected boolean execConfirm() {
			
			//共通処理
			if(super.execConfirm()){
				setDtlBlock();
				return true;
			}

			return false;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getWrk1HdrR()));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
		
		/**更新状況に応じたWrk1HdrからWrk1HdrAll へのデータコピーを行います。*/
		protected void setDtlBlock(){
			Wrk1HdrR br = getWrk1HdrR().clone();
			if (isStatusNone(br)) {
				return;
			}

			// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
			setCheckDpt(br, Wrk1HdrAllR.$ar_dpt_cd, Wrk1HdrAllR.$check_ar_dpt_cd);

			MCList<Wrk1HdrAllR> d = getWrk1HdrAllL();
			Wrk1HdrAllR dr = d.createRow();
			MCRow.copyall(dr, d.get(0));
			copy(dr, br, createMap_Wrk1HdrAllR_Wrk1HdrR());
			d.clear();
			d.add(dr);
			if (!isNull(dr.bp_cd())) {
				dr.setStatus(Status.MODIFY);
			} else {
				dr.bp_cd(getHdrR().bp_cd());
				dr.setStatus(Status.CREATE);
			}
		}

		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(MCRow r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}

	/**
	 * Panel[Wrk2SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk2SetDtHdr_set_dt(MCEventInfo info) {
		MCMessageList msgList = checkBeforeAfter(Wrk2SetDtHdr_st_dt, Wrk2SetDtHdr_end_dt);
		if(!msgList.isEmpty()){
			message(msgList);
		}
		
		for (Wrk2DtlR dtlR : getWrk2DtlL()) {
			if (dtlR.check()){
				if (!isNull(getWrk2SetDtHdrR().st_dt())) {
					dtlR.setDateNE(Wrk2DtlR.$st_dt, getWrk2SetDtHdrR().st_dt());
				}
				if (!isNull(getWrk2SetDtHdrR().end_dt())) {
					dtlR.setDateNE(Wrk2DtlR.$end_dt, getWrk2SetDtHdrR().end_dt());
				}
			}
		}
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk3SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk3SetDtHdr_set_dt(MCEventInfo info) {
		MCMessageList msgList = checkBeforeAfter(Wrk3SetDtHdr_st_dt, Wrk3SetDtHdr_end_dt);
		if(!msgList.isEmpty()){
			message(msgList);
		}
		
		for (Wrk3DtlR dtlR : getWrk3DtlL()) {
			if (dtlR.check()){
				if (!isNull(getWrk3SetDtHdrR().st_dt())) {
					dtlR.setDateNE(Wrk3DtlR.$st_dt, getWrk3SetDtHdrR().st_dt());
				}
				if (!isNull(getWrk3SetDtHdrR().end_dt())) {
					dtlR.setDateNE(Wrk3DtlR.$end_dt, getWrk3SetDtHdrR().end_dt());
				}
			}
		}
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk4SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk4SetDtHdr_set_dt(MCEventInfo info) {
		MCMessageList msgList = checkBeforeAfter(Wrk4SetDtHdr_st_dt, Wrk4SetDtHdr_end_dt);
		if(!msgList.isEmpty()){
			message(msgList);
		}
		
		for (Wrk4DtlR dtlR : getWrk4DtlL()) {
			if (dtlR.check()){
				if (!isNull(getWrk4SetDtHdrR().st_dt())) {
					dtlR.setDateNE(Wrk4DtlR.$st_dt, getWrk4SetDtHdrR().st_dt());
				}
				if (!isNull(getWrk4SetDtHdrR().end_dt())) {
					dtlR.setDateNE(Wrk4DtlR.$end_dt, getWrk4SetDtHdrR().end_dt());
				}
			}
		}
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk7SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk7SetDtHdr_set_dt(MCEventInfo info) {
		MCMessageList msgList = checkBeforeAfter(Wrk7SetDtHdr_st_dt, Wrk7SetDtHdr_end_dt);
		if(!msgList.isEmpty()){
			message(msgList);
		}
		
		for (Wrk7DtlR dtlR : getWrk7DtlL()) {
			if (dtlR.check()){
				if (!isNull(getWrk7SetDtHdrR().st_dt())) {
					dtlR.setDateNE(Wrk7DtlR.$st_dt, getWrk7SetDtHdrR().st_dt());
				}
				if (!isNull(getWrk7SetDtHdrR().end_dt())) {
					dtlR.setDateNE(Wrk7DtlR.$end_dt, getWrk7SetDtHdrR().end_dt());
				}
			}
		}
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk8SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk8SetDtHdr_set_dt(MCEventInfo info) {
		MCMessageList msgList = checkBeforeAfter(Wrk8SetDtHdr_st_dt, Wrk8SetDtHdr_end_dt);
		if(!msgList.isEmpty()){
			message(msgList);
		}
		
		for (Wrk8DtlR dtlR : getWrk8DtlL()) {
			if (dtlR.check()){
				if (!isNull(getWrk8SetDtHdrR().st_dt())) {
					dtlR.setDateNE(Wrk8DtlR.$st_dt, getWrk8SetDtHdrR().st_dt());
				}
				if (!isNull(getWrk8SetDtHdrR().end_dt())) {
					dtlR.setDateNE(Wrk8DtlR.$end_dt, getWrk8SetDtHdrR().end_dt());
				}
			}
		}
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0510(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0510");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0510CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABCP0510]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0510.CndR crtOpenMABCP0510CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0510.CndR to = mcframe.clientMABC.MABCP0510.CndR.create();
		mcframe.clientMABC.MABCP0510.MABCP_BpReg p = (mcframe.clientMABC.MABCP0510.MABCP_BpReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.bp_cd(getHdrR().bp_cd());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0540_Upd01();
	}
	
	//------------------ 初期化 Start ------------------//
	@Override
	protected void valueInit() {
		super.valueInit();
		setCndDelFlgOn();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));
	}

	@Override
	public void fillSpace() {
		Wrk2DtlTable.fillSpace();
		Wrk3DtlTable.fillSpace();
		Wrk4DtlTable.fillSpace();
		Wrk5DtlTable.fillSpace();
		Wrk6DtlTable.fillSpace();
		Wrk7DtlTable.fillSpace();
		Wrk8DtlTable.fillSpace();
	}
	@Override
	public void setSortColumn() {
		for (MCTable<?> tbl : getDtlTables()) {
			for (MCColumnConfig c : getColumnConfigs(tbl,
					tbl.getList().createRow().getKeys().toArray(_dummyStringArray))) {
				tbl.addSortColumn(c, MCList.SortType.ASC);
			}
		}
	}
	
	public MCList<? extends MCConstRow> getDtlL() {
		// メインとなるテーブルが存在しないので、ダミー設定
		return getWrk4DtlL();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		for (MCTable<?> tbl : getDtlTables()) {
			setListListener(tbl, createRLRowListener());
			// 部品を想定
			for (MCColumnConfig c : tbl.getColumnConfigs()) {
				for (String str : getDtlRKeyColumns(tbl.getList())) {
					if (c.getRowColumnName().equals(str)) {
						c.addVCListener(this);
					}
				}
			}
		}
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (hasStkGdDefCd(this)) {
			setComponentInvisibleAllStatus(Wrk6Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk6Panel.setLayoutPosition(null);
		}
	}
	
	//------------------ 初期化 End ------------------//

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if (isUpdSts() && !isStatusNone(getWrk1HdrR(), getWrk2DtlL(), getWrk3DtlL(), getWrk4DtlL(), getWrk5DtlL(),
				getWrk6DtlL(), getWrk7DtlL(), getWrk8DtlL())) {
			return confirmRegDataClear();
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		getHdrR().clear();
		getWrk1HdrR().clear();
		getWrk2DtlL().clear();
		getWrk3DtlL().clear();
		getWrk4DtlL().clear();
		getWrk5DtlL().clear();
		getWrk6DtlL().clear();
		getWrk7DtlL().clear();
		getWrk8DtlL().clear();
		
		getWrk2SetDtHdrR().clear();
		getWrk3SetDtHdrR().clear();
		getWrk4SetDtHdrR().clear();
		getWrk7SetDtHdrR().clear();
		getWrk8SetDtHdrR().clear();
		
		setSRCHStatus();

		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCstSundryFlgMode();
		setArDptTypMode();
		setSlsBasisTypMode();
		setStkLstFormCdMode();
		setBcstCdMode();
		chkSrchBtnMode();
	}
	@Override
	public void setUPD_ADMINStatus() {
		super.setUPD_ADMINStatus();
		setCstSundryFlgMode();
		setArDptTypMode();
		setSlsBasisTypMode();
		setStkLstFormCdMode();
		setBcstCdMode();
		chkSrchBtnMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
	}

	protected void setCstSundryFlgMode() {
		if (getWrk1HdrR().cst_sundry_flg()) {
			Wrk1Hdr_acst_cd.setMode(MCMode.ENABLE);
			Wrk1Hdr_ar_dpt_typ.setMode(MCMode.ENABLE);
			Wrk1Hdr_sls_upri_rnd_typ.setMode(MCMode.ENABLE);
			Wrk1Hdr_sls_tax_calc_typ.setMode(MCMode.ENABLE);
			Wrk1Hdr_lot_back_stop_typ.setMode(MCMode.ENABLE);
			Wrk1Hdr_bill_crryovr_times.setMode(MCMode.ENABLE);
			Wrk1Hdr_slip_each_lot_typ.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Wrk1Hdr_acst_cd);
			setDefaultMode(Wrk1Hdr_ar_dpt_typ);
			setDefaultMode(Wrk1Hdr_sls_upri_rnd_typ);
			setDefaultMode(Wrk1Hdr_sls_tax_calc_typ);
			setDefaultMode(Wrk1Hdr_lot_back_stop_typ);
			setDefaultMode(Wrk1Hdr_bill_crryovr_times);
			setDefaultMode(Wrk1Hdr_slip_each_lot_typ);
		}
	}

	protected void setArDptTypMode() {
		if (MAC_AR_DPT_TYP.isAR(getWrk1HdrR().ar_dpt_typ())) {
			setDefaultMode(Wrk1Hdr_ar_dpt_cd);
		}
		else {
			Wrk1Hdr_ar_dpt_cd.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setSlsBasisTypMode() {
		if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getWrk1HdrR().sls_basis_typ())) {
			setDefaultMode(Wrk1Hdr_bill_basis_typ);
		}
		else {
			Wrk1Hdr_bill_basis_typ.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setStkLstFormCdMode() {
		if (!getWrk1HdrR().stk_lst_issue_flg()) {
			Wrk1Hdr_stk_lst_form_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Wrk1Hdr_stk_lst_form_cd);
		}
	}
	protected void setBcstCdMode() {
		if (!getWrk1HdrR().acst_flg()) {
			Wrk1Hdr_bcst_cd.setMode(MCMode.READ_ONLY);
		}
		else if (getCo().ar_no_use_flg()) {
			Wrk1Hdr_bcst_cd.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Wrk1Hdr_bcst_cd);
		}
	}

	//------------------ イベント Start ------------------//
	@Override
	public void doWrk1Hdr_cst_sundry_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_cst_sundry_flg_NC(info);
		setCstSundryFlgMode();
	}

	@Override
	public void doWrk1Hdr_ar_dpt_typ_LC(MCEventInfo info) {
		super.doWrk1Hdr_ar_dpt_typ_LC(info);

		setValueEx(Wrk1Hdr_ar_dpt_cd, null);

		setArDptTypMode();
	}
	
	@Override
	public void doWrk1Hdr_sls_basis_typ_LC(MCEventInfo info) {
		super.doWrk1Hdr_sls_basis_typ_LC(info);

		if (MAC_SLS_BASIS_TYP.isIN_BASIS(getWrk1HdrR().sls_basis_typ())){
			setValueEx(Wrk1Hdr_bill_basis_typ, MAC_BILL_BASIS_TYP.SLS_AC.value());
		}
		else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getWrk1HdrR().sls_basis_typ())){
			setValueEx(Wrk1Hdr_bill_basis_typ, MAC_BILL_BASIS_TYP.ARRV.value());
		}
		else if (isNull(getWrk1HdrR().sls_basis_typ())) {
			setValueEx(Wrk1Hdr_bill_basis_typ, null);
		}

		setSlsBasisTypMode();
	}
	
	@Override
	public void doWrk1Hdr_stk_lst_issue_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_stk_lst_issue_flg_NC(info);

		if (!getWrk1HdrR().stk_lst_issue_flg()) {
			setValueEx(Wrk1Hdr_stk_lst_form_cd, null);
		}

		setStkLstFormCdMode() ;
	}

	@Override
	public void doWrk3Dtl_dest_cd1_LC(MCEventInfo info) {
		super.doWrk3Dtl_dest_cd1_LC(info);
		
		Wrk3DtlR r = getWrk3DtlL().get(info.getEventIndex());

		if(isNull(info.getNewValue())){
			r.dest_cd2(null);
			r.dest_nm2(null);
			r.dest_cd3(null);
			r.dest_nm3(null);
		}
	}
	
	@Override
	public void doWrk3Dtl_dest_cd2_LC(MCEventInfo info) {
		super.doWrk3Dtl_dest_cd2_LC(info);
		Wrk3DtlR r = getWrk3DtlL().get(info.getEventIndex());

		if(isNull(info.getNewValue())){
			r.dest_cd3(null);
			r.dest_nm3(null);
		}
	}
	
	@Override
	public void doWrk7Dtl_if_proc_typ_LC(MCEventInfo info) {
		super.doWrk7Dtl_if_proc_typ_LC(info);
		
		Wrk7DtlR r = getWrk7DtlL().get(info.getEventIndex());
		if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
			setValueEx(columnWrk7Dtl_ext_sys_cd, r.getGUIIndex(), null);
		}
		if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
			setValueEx(columnWrk7Dtl_not_onr_prov_flg, r.getGUIIndex(), false);
		}
	}

	//------------------ イベント End ------------------//
	
	//------------------ テーブル関連 Start ------------------//
	
	protected MCRowListener createRLRowListener() {
		return new RLRowListener();
	}
	
	protected class RLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			dtlRowValueChanged(event);
		}
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 「選択」項目以外に変更があった場合に「選択」項目をオンにする
		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}
		
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			// 新規登録の場合、key項目得意先、取引先が登録枠に設定された値から設定する
			if (r.contains("cst_cd")) {
				if (isNull(r.getStringNE("cst_cd"))) {
					r.setStringNE("cst_cd", getHdrR().bp_cd());
				}
			}
			if (r.contains("bp_cd")) {
				if (isNull(r.getStringNE("bp_cd"))) {
					r.setStringNE("bp_cd", getHdrR().bp_cd());
				}
			}
		}
	}

	/**
	 * イベント発生項目が「選択」項目のときtrueを返す
	 */
	protected boolean isCheckColumn(MCRowEvent event) {
		return event.getColumn().equals(getCheckColumn());
	}

	/**
	 * イベント行の「選択」項目に値（boo）をセットする
	 */
	protected void setCheckValue(MCRowEvent event, boolean boo) {
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			r.setBoolean(getCheckColumn(), boo);
		}
	}
	
	//------------------ テーブル関連 End ------------------//
	
	//------------------ 汎用メソッド Start ------------------//

	/**
	 * 全選択
	 * 指定テーブルの既存行・変更行を全選択する
	 */
	protected void doSelectAll(MCTable t) {
		for(Object obj : t.getViewRows()) {
			if (obj instanceof MCRow) {
				MCRow row = (MCRow) obj;
				int i = row.getGUIIndex();
				MCColumnConfig chkCol = getCheckColumnConfig(t);
				// 空かどうかは固定カラムのみで判定
				if (chkCol != null && isEditable(chkCol, i) && !row.isEmpty(row.getConstNameArray())) {
					setValueEx(chkCol, i, true);
				}
			}
		}
	}

	/**
	 * 全選択解除
	 * 指定テーブルの全選択を解除する
	 */
	protected void doDeselectAll(MCTable t) {
		for(Object obj : t.getViewRows() ){
			if (obj instanceof MCRow) {
				MCRow row = (MCRow) obj;
				MCColumnConfig chkCol = getCheckColumnConfig(t);
				if (chkCol != null) {
					setValueEx(chkCol, row.getGUIIndex() , false);
				}
			}
		}
	}

	protected MCColumnConfig getCheckColumnConfig(MCTable t) {
		for (MCColumnConfig c : t.getColumnConfigs()) {
			if (c.getRowColumnName().equals(getCheckColumn())) {
				return c;
			}
		}
		return null;
	}

	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] {Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable, Wrk5DtlTable,
				Wrk6DtlTable, Wrk7DtlTable, Wrk8DtlTable};
	}
	
	protected String[] _dummyStringArray = {};
	
	/**
	 * キー項目を返します。
	 * @param list
	 * @return
	 */
	protected String[] getDtlRKeyColumns(MCList<? extends MCConstRow> list) {
		MCConstRow r = list.createRow();
		return r.getKeys().toArray(_dummyStringArray);
	}
	
	//------------------ 汎用メソッド End ------------------//
	
	// //////////////////////////////////////////////
	// セルコンフィグ/////////////////////////////////////
	// //////////////////////////////////////////////
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk2DtlTable.setCellConfig(createBaseDtlConf());
		Wrk3DtlTable.setCellConfig(createBaseDtlConf());
		Wrk4DtlTable.setCellConfig(createBaseDtlConf());
		Wrk5DtlTable.setCellConfig(createBaseDtlConf());
		Wrk6DtlTable.setCellConfig(createBaseDtlConf());
		Wrk7DtlTable.setCellConfig(createBaseDtlConf());
		Wrk8DtlTable.setCellConfig(createBaseDtlConf());
	}
	
	protected BaseDtlConf createBaseDtlConf() {
		return new BaseDtlConf(this);
	}

	protected class BaseDtlConf extends MAUDP_RLBaseCellConfig {

		public BaseDtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdSts()) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}

				if (table.getBaseTable() == Wrk2DtlTable) {
					Wrk2DtlR r = (Wrk2DtlR)table.getBaseTable().getRow(index);
					
					// 部門が入力された場合、担当者ＣＤは入力不可
					if (column == columnWrk2Dtl_usr_cd) {
						if (!isNull(r.dpt_cd()) && isNull(r.usr_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					// 担当者ＣＤが入力された場合、部門ＣＤは入力不可
					if (column == columnWrk2Dtl_dpt_cd) {
						if (!isNull(r.usr_cd()) && isNull(r.dpt_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR Wrk3Row = Wrk3DtlTable.getRow(index);
					if (column == columnWrk3Dtl_dest_cd2) {
						if (isNull(Wrk3Row.dest_cd1())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_dest_cd3) {
						if (isNull(Wrk3Row.dest_cd2())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk7DtlTable) {
					Wrk7DtlR row = Wrk7DtlTable.getRow(index);

					if (column == columnWrk7Dtl_ext_sys_cd) {
						if (!MAC_IF_PROC_TYP.is_send(row.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk7Dtl_not_onr_prov_flg) {
						if (!MAC_IF_PROC_TYP.isBILL_SEND(row.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk8DtlTable) {
					Wrk8DtlR row = Wrk8DtlTable.getRow(index);

					if (!isNull(row.upd_cntr()) 
							&& (column == columnWrk8Dtl_itm_cd
							|| column == columnWrk8Dtl_itm_sub1
							|| column == columnWrk8Dtl_itm_sub2
							|| column == columnWrk8Dtl_itm_sub3)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected Map_Wrk1HdrR_Wrk1HdrAllR<Wrk1HdrR,Wrk1HdrAllR> createMap_Wrk1HdrR_Wrk1HdrAllR() {
		return new Map_Wrk1HdrR_Wrk1HdrAllR<Wrk1HdrR, Wrk1HdrAllR>();
	}

	public class Map_Wrk1HdrR_Wrk1HdrAllR<D extends Wrk1HdrR, S extends Wrk1HdrAllR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Wrk1HdrR.$bp_cd, Wrk1HdrAllR.$bp_cd);
			addColumnPathMap(Wrk1HdrR.$acst_cd, Wrk1HdrAllR.$acst_cd);
			addColumnPathMap(Wrk1HdrR.$acst_nm, Wrk1HdrAllR.$acst_nm);
			addColumnPathMap(Wrk1HdrR.$ar_dpt_typ, Wrk1HdrAllR.$ar_dpt_typ);
			addColumnPathMap(Wrk1HdrR.$ar_dpt_typ_nm, Wrk1HdrAllR.$ar_dpt_typ_nm);
			addColumnPathMap(Wrk1HdrR.$ar_dpt_cd, Wrk1HdrAllR.$ar_dpt_cd);
			addColumnPathMap(Wrk1HdrR.$ar_dpt_nm, Wrk1HdrAllR.$ar_dpt_nm);
			addColumnPathMap(Wrk1HdrR.$cst_cntct_dpt, Wrk1HdrAllR.$cst_cntct_dpt);
			addColumnPathMap(Wrk1HdrR.$cst_cntct_psn, Wrk1HdrAllR.$cst_cntct_psn);
			addColumnPathMap(Wrk1HdrR.$cst_cntct_psn_title, Wrk1HdrAllR.$cst_cntct_psn_title);
			addColumnPathMap(Wrk1HdrR.$cst_sundry_flg, Wrk1HdrAllR.$cst_sundry_flg);
			addColumnPathMap(Wrk1HdrR.$sls_upri_req_typ, Wrk1HdrAllR.$sls_upri_req_typ);
			addColumnPathMap(Wrk1HdrR.$sls_upri_req_typ_nm, Wrk1HdrAllR.$sls_upri_req_typ_nm);
			addColumnPathMap(Wrk1HdrR.$sls_upri_cng_flg, Wrk1HdrAllR.$sls_upri_cng_flg);
			addColumnPathMap(Wrk1HdrR.$sls_upri_rnd_typ, Wrk1HdrAllR.$sls_upri_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$sls_upri_rnd_typ_nm, Wrk1HdrAllR.$sls_upri_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$sls_amt_rnd_typ, Wrk1HdrAllR.$sls_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$sls_amt_rnd_typ_nm, Wrk1HdrAllR.$sls_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$sls_tax_calc_typ, Wrk1HdrAllR.$sls_tax_calc_typ);
			addColumnPathMap(Wrk1HdrR.$sls_tax_calc_typ_nm, Wrk1HdrAllR.$sls_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrR.$sls_tax_rnd_typ, Wrk1HdrAllR.$sls_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$sls_tax_rnd_typ_nm, Wrk1HdrAllR.$sls_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$sls_basis_typ, Wrk1HdrAllR.$sls_basis_typ);
			addColumnPathMap(Wrk1HdrR.$sls_basis_typ_nm, Wrk1HdrAllR.$sls_basis_typ_nm);
			addColumnPathMap(Wrk1HdrR.$ship_schd_split_typ, Wrk1HdrAllR.$ship_schd_split_typ);
			addColumnPathMap(Wrk1HdrR.$ship_schd_split_typ_nm, Wrk1HdrAllR.$ship_schd_split_typ_nm);
			addColumnPathMap(Wrk1HdrR.$bill_basis_typ, Wrk1HdrAllR.$bill_basis_typ);
			addColumnPathMap(Wrk1HdrR.$bill_basis_typ_nm, Wrk1HdrAllR.$bill_basis_typ_nm);
			addColumnPathMap(Wrk1HdrR.$bill_crryovr_times, Wrk1HdrAllR.$bill_crryovr_times);
			addColumnPathMap(Wrk1HdrR.$lot_back_stop_typ, Wrk1HdrAllR.$lot_back_stop_typ);
			addColumnPathMap(Wrk1HdrR.$lot_back_stop_typ_nm, Wrk1HdrAllR.$lot_back_stop_typ_nm);
			addColumnPathMap(Wrk1HdrR.$slip_each_lot_typ, Wrk1HdrAllR.$slip_each_lot_typ);
			addColumnPathMap(Wrk1HdrR.$slip_each_lot_typ_nm, Wrk1HdrAllR.$slip_each_lot_typ_nm);
			addColumnPathMap(Wrk1HdrR.$cst_ship_form_cd, Wrk1HdrAllR.$cst_ship_form_cd);
			addColumnPathMap(Wrk1HdrR.$cst_ship_form_nm, Wrk1HdrAllR.$cst_ship_form_nm);
			addColumnPathMap(Wrk1HdrR.$stk_lst_issue_flg, Wrk1HdrAllR.$stk_lst_issue_flg);
			addColumnPathMap(Wrk1HdrR.$stk_lst_form_cd, Wrk1HdrAllR.$stk_lst_form_cd);
			addColumnPathMap(Wrk1HdrR.$stk_lst_form_nm, Wrk1HdrAllR.$stk_lst_form_nm);
			addColumnPathMap(Wrk1HdrR.$sls_tax_cd, Wrk1HdrAllR.$sls_tax_cd);
			addColumnPathMap(Wrk1HdrR.$sls_tax_nm, Wrk1HdrAllR.$sls_tax_nm);
			addColumnPathMap(Wrk1HdrR.$sls_tax_cd_prio_flg, Wrk1HdrAllR.$sls_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrR.$wrk_ar_flg, Wrk1HdrAllR.$wrk_ar_flg);
			addColumnPathMap(Wrk1HdrR.$cst_iv_flg, Wrk1HdrAllR.$cst_iv_flg);
			addColumnPathMap(Wrk1HdrR.$ship_lt, Wrk1HdrAllR.$ship_lt);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_cd1, Wrk1HdrAllR.$cst_tterm_cd1);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_nm1, Wrk1HdrAllR.$cst_tterm_nm1);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_cd2, Wrk1HdrAllR.$cst_tterm_cd2);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_nm2, Wrk1HdrAllR.$cst_tterm_nm2);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_cd3, Wrk1HdrAllR.$cst_tterm_cd3);
			addColumnPathMap(Wrk1HdrR.$cst_tterm_nm3, Wrk1HdrAllR.$cst_tterm_nm3);
			addColumnPathMap(Wrk1HdrR.$sls_anly_cd1, Wrk1HdrAllR.$sls_anly_cd1);
			addColumnPathMap(Wrk1HdrR.$sls_anly_nm1, Wrk1HdrAllR.$sls_anly_nm1);
			addColumnPathMap(Wrk1HdrR.$sls_anly_cd2, Wrk1HdrAllR.$sls_anly_cd2);
			addColumnPathMap(Wrk1HdrR.$sls_anly_nm2, Wrk1HdrAllR.$sls_anly_nm2);
			addColumnPathMap(Wrk1HdrR.$sls_anly_cd3, Wrk1HdrAllR.$sls_anly_cd3);
			addColumnPathMap(Wrk1HdrR.$sls_anly_nm3, Wrk1HdrAllR.$sls_anly_nm3);
			addColumnPathMap(Wrk1HdrR.$not_lg_mix_flg, Wrk1HdrAllR.$not_lg_mix_flg);
			addColumnPathMap(Wrk1HdrR.$not_lot_mix_flg, Wrk1HdrAllR.$not_lot_mix_flg);
			addColumnPathMap(Wrk1HdrR.$not_sublot_mix_flg, Wrk1HdrAllR.$not_sublot_mix_flg);
			addColumnPathMap(Wrk1HdrR.$acst_flg, Wrk1HdrAllR.$acst_flg);
			addColumnPathMap(Wrk1HdrR.$bcst_flg, Wrk1HdrAllR.$bcst_flg);
			addColumnPathMap(Wrk1HdrR.$bcst_cd, Wrk1HdrAllR.$bcst_cd);
			addColumnPathMap(Wrk1HdrR.$bcst_nm, Wrk1HdrAllR.$bcst_nm);
			addColumnPathMap(Wrk1HdrR.$ins_usr_id, Wrk1HdrAllR.$ins_usr_id);
			addColumnPathMap(Wrk1HdrR.$ins_usr_nm, Wrk1HdrAllR.$ins_usr_nm);
			addColumnPathMap(Wrk1HdrR.$ins_ts, Wrk1HdrAllR.$ins_ts);
			addColumnPathMap(Wrk1HdrR.$ins_func_id, Wrk1HdrAllR.$ins_func_id);
			addColumnPathMap(Wrk1HdrR.$ins_func_nm, Wrk1HdrAllR.$ins_func_nm);
			addColumnPathMap(Wrk1HdrR.$upd_cntr, Wrk1HdrAllR.$upd_cntr);
			addColumnPathMap(Wrk1HdrR.$upd_usr_id, Wrk1HdrAllR.$upd_usr_id);
			addColumnPathMap(Wrk1HdrR.$upd_usr_nm, Wrk1HdrAllR.$upd_usr_nm);
			addColumnPathMap(Wrk1HdrR.$upd_ts, Wrk1HdrAllR.$upd_ts);
			addColumnPathMap(Wrk1HdrR.$upd_func_id, Wrk1HdrAllR.$upd_func_id);
			addColumnPathMap(Wrk1HdrR.$upd_func_nm, Wrk1HdrAllR.$upd_func_nm);
			addColumnPathMap(Wrk1HdrR.$upd_srv_req_no, Wrk1HdrAllR.$upd_srv_req_no);
			addColumnPathMap(Wrk1HdrR.$del_usr_id, Wrk1HdrAllR.$del_usr_id);
			addColumnPathMap(Wrk1HdrR.$del_usr_nm, Wrk1HdrAllR.$del_usr_nm);
			addColumnPathMap(Wrk1HdrR.$del_ts, Wrk1HdrAllR.$del_ts);
			addColumnPathMap(Wrk1HdrR.$cst_prnt_typ, Wrk1HdrAllR.$cst_prnt_typ);
			addColumnPathMap(Wrk1HdrR.$cst_prnt_typ_nm, Wrk1HdrAllR.$cst_prnt_typ_nm);
		}
	}

	protected Map_Wrk1HdrAllR_Wrk1HdrR<Wrk1HdrAllR,Wrk1HdrR> createMap_Wrk1HdrAllR_Wrk1HdrR() {
		return new Map_Wrk1HdrAllR_Wrk1HdrR<Wrk1HdrAllR, Wrk1HdrR>();
	}

	public class Map_Wrk1HdrAllR_Wrk1HdrR<D extends Wrk1HdrAllR, S extends Wrk1HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Wrk1HdrAllR.$bp_cd, Wrk1HdrR.$bp_cd);
			addColumnPathMap(Wrk1HdrAllR.$acst_cd, Wrk1HdrR.$acst_cd);
			addColumnPathMap(Wrk1HdrAllR.$acst_nm, Wrk1HdrR.$acst_nm);
			addColumnPathMap(Wrk1HdrAllR.$ar_dpt_typ, Wrk1HdrR.$ar_dpt_typ);
			addColumnPathMap(Wrk1HdrAllR.$ar_dpt_typ_nm, Wrk1HdrR.$ar_dpt_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$ar_dpt_cd, Wrk1HdrR.$ar_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$ar_dpt_nm, Wrk1HdrR.$ar_dpt_nm);
			addColumnPathMap(Wrk1HdrAllR.$check_ar_dpt_cd, Wrk1HdrR.$check_ar_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$cst_cntct_dpt, Wrk1HdrR.$cst_cntct_dpt);
			addColumnPathMap(Wrk1HdrAllR.$cst_cntct_psn, Wrk1HdrR.$cst_cntct_psn);
			addColumnPathMap(Wrk1HdrAllR.$cst_cntct_psn_title, Wrk1HdrR.$cst_cntct_psn_title);
			addColumnPathMap(Wrk1HdrAllR.$cst_sundry_flg, Wrk1HdrR.$cst_sundry_flg);
			addColumnPathMap(Wrk1HdrAllR.$sls_upri_req_typ, Wrk1HdrR.$sls_upri_req_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_upri_req_typ_nm, Wrk1HdrR.$sls_upri_req_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_upri_cng_flg, Wrk1HdrR.$sls_upri_cng_flg);
			addColumnPathMap(Wrk1HdrAllR.$sls_upri_rnd_typ, Wrk1HdrR.$sls_upri_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_upri_rnd_typ_nm, Wrk1HdrR.$sls_upri_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_amt_rnd_typ, Wrk1HdrR.$sls_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_amt_rnd_typ_nm, Wrk1HdrR.$sls_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_calc_typ, Wrk1HdrR.$sls_tax_calc_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_calc_typ_nm, Wrk1HdrR.$sls_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_rnd_typ, Wrk1HdrR.$sls_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_rnd_typ_nm, Wrk1HdrR.$sls_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_basis_typ, Wrk1HdrR.$sls_basis_typ);
			addColumnPathMap(Wrk1HdrAllR.$sls_basis_typ_nm, Wrk1HdrR.$sls_basis_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$ship_schd_split_typ, Wrk1HdrR.$ship_schd_split_typ);
			addColumnPathMap(Wrk1HdrAllR.$ship_schd_split_typ_nm, Wrk1HdrR.$ship_schd_split_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$bill_basis_typ, Wrk1HdrR.$bill_basis_typ);
			addColumnPathMap(Wrk1HdrAllR.$bill_basis_typ_nm, Wrk1HdrR.$bill_basis_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$bill_crryovr_times, Wrk1HdrR.$bill_crryovr_times);
			addColumnPathMap(Wrk1HdrAllR.$lot_back_stop_typ, Wrk1HdrR.$lot_back_stop_typ);
			addColumnPathMap(Wrk1HdrAllR.$lot_back_stop_typ_nm, Wrk1HdrR.$lot_back_stop_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$slip_each_lot_typ, Wrk1HdrR.$slip_each_lot_typ);
			addColumnPathMap(Wrk1HdrAllR.$slip_each_lot_typ_nm, Wrk1HdrR.$slip_each_lot_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$cst_ship_form_cd, Wrk1HdrR.$cst_ship_form_cd);
			addColumnPathMap(Wrk1HdrAllR.$cst_ship_form_nm, Wrk1HdrR.$cst_ship_form_nm);
			addColumnPathMap(Wrk1HdrAllR.$stk_lst_issue_flg, Wrk1HdrR.$stk_lst_issue_flg);
			addColumnPathMap(Wrk1HdrAllR.$stk_lst_form_cd, Wrk1HdrR.$stk_lst_form_cd);
			addColumnPathMap(Wrk1HdrAllR.$stk_lst_form_nm, Wrk1HdrR.$stk_lst_form_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_cd, Wrk1HdrR.$sls_tax_cd);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_nm, Wrk1HdrR.$sls_tax_nm);
			addColumnPathMap(Wrk1HdrAllR.$sls_tax_cd_prio_flg, Wrk1HdrR.$sls_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrAllR.$wrk_ar_flg, Wrk1HdrR.$wrk_ar_flg);
			addColumnPathMap(Wrk1HdrAllR.$cst_iv_flg, Wrk1HdrR.$cst_iv_flg);
			addColumnPathMap(Wrk1HdrAllR.$ship_lt, Wrk1HdrR.$ship_lt);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_cd1, Wrk1HdrR.$cst_tterm_cd1);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_nm1, Wrk1HdrR.$cst_tterm_nm1);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_cd2, Wrk1HdrR.$cst_tterm_cd2);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_nm2, Wrk1HdrR.$cst_tterm_nm2);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_cd3, Wrk1HdrR.$cst_tterm_cd3);
			addColumnPathMap(Wrk1HdrAllR.$cst_tterm_nm3, Wrk1HdrR.$cst_tterm_nm3);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_cd1, Wrk1HdrR.$sls_anly_cd1);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_nm1, Wrk1HdrR.$sls_anly_nm1);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_cd2, Wrk1HdrR.$sls_anly_cd2);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_nm2, Wrk1HdrR.$sls_anly_nm2);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_cd3, Wrk1HdrR.$sls_anly_cd3);
			addColumnPathMap(Wrk1HdrAllR.$sls_anly_nm3, Wrk1HdrR.$sls_anly_nm3);
			addColumnPathMap(Wrk1HdrAllR.$not_lg_mix_flg, Wrk1HdrR.$not_lg_mix_flg);
			addColumnPathMap(Wrk1HdrAllR.$not_lot_mix_flg, Wrk1HdrR.$not_lot_mix_flg);
			addColumnPathMap(Wrk1HdrAllR.$not_sublot_mix_flg, Wrk1HdrR.$not_sublot_mix_flg);
			addColumnPathMap(Wrk1HdrAllR.$acst_flg, Wrk1HdrR.$acst_flg);
			addColumnPathMap(Wrk1HdrAllR.$bcst_flg, Wrk1HdrR.$bcst_flg);
			addColumnPathMap(Wrk1HdrAllR.$bcst_cd, Wrk1HdrR.$bcst_cd);
			addColumnPathMap(Wrk1HdrAllR.$bcst_nm, Wrk1HdrR.$bcst_nm);
			addColumnPathMap(Wrk1HdrAllR.$ins_usr_id, Wrk1HdrR.$ins_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$ins_usr_nm, Wrk1HdrR.$ins_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$ins_ts, Wrk1HdrR.$ins_ts);
			addColumnPathMap(Wrk1HdrAllR.$ins_func_id, Wrk1HdrR.$ins_func_id);
			addColumnPathMap(Wrk1HdrAllR.$ins_func_nm, Wrk1HdrR.$ins_func_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_cntr, Wrk1HdrR.$upd_cntr);
			addColumnPathMap(Wrk1HdrAllR.$upd_usr_id, Wrk1HdrR.$upd_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$upd_usr_nm, Wrk1HdrR.$upd_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_ts, Wrk1HdrR.$upd_ts);
			addColumnPathMap(Wrk1HdrAllR.$upd_func_id, Wrk1HdrR.$upd_func_id);
			addColumnPathMap(Wrk1HdrAllR.$upd_func_nm, Wrk1HdrR.$upd_func_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_srv_req_no, Wrk1HdrR.$upd_srv_req_no);
			addColumnPathMap(Wrk1HdrAllR.$del_usr_id, Wrk1HdrR.$del_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$del_usr_nm, Wrk1HdrR.$del_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$del_ts, Wrk1HdrR.$del_ts);
			addColumnPathMap(Wrk1HdrAllR.$cst_prnt_typ, Wrk1HdrR.$cst_prnt_typ);
			addColumnPathMap(Wrk1HdrAllR.$cst_prnt_typ_nm, Wrk1HdrR.$cst_prnt_typ_nm);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			super.valueCopy(dest, src);
			
			if (!isStatusNone(getWrk1HdrR())) {
				dest.check(true);
			}
		}
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		// 行削除ボタンの制御
		if (dest != null && getWrk2DtlL().contains(dest)) {
			Wrk2DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk3DtlL().contains(dest)) {
			Wrk3DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk4DtlL().contains(dest)) {
			Wrk4DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk5DtlL().contains(dest)) {
			Wrk5DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk6DtlL().contains(dest)) {
			Wrk6DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk7DtlL().contains(dest)) {
			Wrk7DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk8DtlL().contains(dest)) {
			Wrk8DtlBtn_rdel.setMode(this, getStatus());
		}
		return dest;
	}
	
	@Override
	public void doWrk2Dtl_NC(MCEventInfo info) {
		super.doWrk2Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk2DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk2DtlBtn_rdel);
	}
	
	@Override
	public void doWrk3Dtl_NC(MCEventInfo info) {
		super.doWrk3Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk3DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk3DtlBtn_rdel);
	}
	
	@Override
	public void doWrk4Dtl_NC(MCEventInfo info) {
		super.doWrk4Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk4DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk4DtlBtn_rdel);
	}
	
	@Override
	public void doWrk5Dtl_NC(MCEventInfo info) {
		super.doWrk5Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk5DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk5DtlBtn_rdel);
	}
	
	@Override
	public void doWrk6Dtl_NC(MCEventInfo info) {
		super.doWrk6Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk6DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk6DtlBtn_rdel);
	}
	
	@Override
	public void doWrk7Dtl_NC(MCEventInfo info) {
		super.doWrk7Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk7DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk7DtlBtn_rdel);
	}
	
	@Override
	public void doWrk8Dtl_NC(MCEventInfo info) {
		super.doWrk8Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk8DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk8DtlBtn_rdel);
	}
	
	@Override
	public void doWrk2SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk2SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk2SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk2SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk3SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk3SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk4SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk4SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk4SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk4SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk7SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk7SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk7SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk7SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk8SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk8SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk8SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk8SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	public void chkSrchBtnMode() {
		if (!isNull(getWrk2SetDtHdrR().st_dt())
				|| !isNull(getWrk2SetDtHdrR().end_dt())) {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk3SetDtHdrR().st_dt())
				|| !isNull(getWrk3SetDtHdrR().end_dt())) {
			Wrk3SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk3SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk4SetDtHdrR().st_dt())
				|| !isNull(getWrk4SetDtHdrR().end_dt())) {
			Wrk4SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk4SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk7SetDtHdrR().st_dt())
				|| !isNull(getWrk7SetDtHdrR().end_dt())) {
			Wrk7SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk7SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk8SetDtHdrR().st_dt())
				|| !isNull(getWrk8SetDtHdrR().end_dt())) {
			Wrk8SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk8SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
	}

	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null
				|| !(getStatus().equals(getUPDStatus())
				|| getStatus().equals(getUPD_ADMINStatus()))) {
			btn.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		}
		else {
			btn.setMode(this, getStatus());
		}
	}


	//--------------------リストロジック表示制御Start-----------------------

	@Override	
	public MCList<?> getWrk7Dtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getWrk7Dtl_if_proc_typ(row, info);
	}
	
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_edi()) {
				l.add(ifProcTyp);
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}