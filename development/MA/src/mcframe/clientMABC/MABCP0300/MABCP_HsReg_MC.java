package mcframe.clientMABC.MABCP0300;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_HsReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_HsReg_MC extends MABCP_HsReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 最後に選択されたのがLclTableかDtlTableか判定するフラグ
	 * trueの場合LclTable、falseの場合DtlTable
	 */
	protected boolean _lclFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_HsReg_MC() {
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
	public MABCP_HsReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0300_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0300_Srch01Caller<P extends MABCP_HsReg, B extends MA_MABCL0300_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0300_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRowR());
		}
	
		@Override
		protected boolean isDownBlockChanged() {

			if (panel.isDtlChanged() || panel.isLclChanged()) {
				return true;
			}
			return super.isDownBlockChanged();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.hs_grp_nm_disp(r.hs_grp_nm());
				r.hs_nm_disp(r.hs_nm());

			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0300_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0300_Upd01Caller<P extends MABCP_HsReg, B extends MA_MABCL0300_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0300_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getRowR()));
		}
	}

	/**
	 * [MA_MABCL0300_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0300_Del01Caller<P extends MABCP_HsReg, B extends MA_MABCL0300_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0300_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0300_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0300_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0300_Del01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// ＨＳ内容をトリムせずそのまま一覧にセットするための設定
		columnDtl_hs_nm_disp.setTrimPattern("NONE");
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Row_hs_cd.addNCListener(this);
		Row_hs_nm.addNCListener(this);
		Row_hs_grp_cd.addNCListener(this);
		Row_hs_grp_nm.addNCListener(this);
		Row_memo1.addNCListener(this);
		Row_memo2.addNCListener(this);
		Row_memo3.addNCListener(this);
		Row_lcl_cd.addLCListener(this);
	}

	/**
	 * NCイベント時のイベント処理です。
	 */
	@Override
	public void doRow_hs_cd_NC(MCEventInfo info) {
		super.doRow_hs_cd_NC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnDtl_hs_cd, r.getGUIIndex(), getRowR().hs_cd());
			}
		}
	}

	@Override
	public void doRow_hs_nm_NC(MCEventInfo info) {
		super.doRow_hs_nm_NC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				r.hs_nm(getRowR().hs_nm());
				setValueEx(columnDtl_hs_nm_disp, r.getGUIIndex(), getRowR().hs_nm());
			}
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnLcl_hs_nm, r.getGUIIndex(), getRowR().hs_nm());
			}
		}
	}

	@Override
	public void doRow_memo1_NC(MCEventInfo info) {
		super.doRow_memo1_NC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnDtl_memo1, r.getGUIIndex(), getRowR().memo1());
			}
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnLcl_memo1, r.getGUIIndex(), getRowR().memo1());
			}
		}
	}

	@Override
	public void doRow_memo2_NC(MCEventInfo info) {
		super.doRow_memo2_NC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnDtl_memo2, r.getGUIIndex(), getRowR().memo2());
			}
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnLcl_memo2, r.getGUIIndex(), getRowR().memo2());
			}
		}
	}

	@Override
	public void doRow_memo3_NC(MCEventInfo info) {
		super.doRow_memo3_NC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnDtl_memo3, r.getGUIIndex(), getRowR().memo3());
			}
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnLcl_memo3, r.getGUIIndex(), getRowR().memo3());
			}
		}
	}

	/**
	 * LCイベント時のイベント処理です。
	 */
	@Override
	public void doRow_hs_grp_cd_LC(MCEventInfo info) {
		super.doRow_hs_grp_cd_LC(info);
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnDtl_hs_grp_cd, r.getGUIIndex() , getRowR().hs_grp_cd());
				r.hs_grp_nm(getRowR().hs_grp_nm());
				setValueEx(columnDtl_hs_grp_nm_disp, r.getGUIIndex() , getRowR().hs_grp_nm());
			}
		}
	}

	@Override
	public void doRow_lcl_cd_LC(MCEventInfo info) {
		super.doRow_lcl_cd_LC(info);
		if (_lclFlg) {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				setValueEx(columnLcl_lcl_cd, r.getGUIIndex(), getRowR().lcl_cd());
				r.lcl_nm(getRowR().lcl_nm());
			}
		}
	}

	/**選択行変更時のイベント*/
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRow();
	}

	/**選択行変更時のイベント（ロケール）*/
	@Override
	public void doLcl_NC(MCEventInfo info) {
		super.doLcl_NC(info);
		setRow();
	}

	protected void setRow() {
		if (!_lclFlg) {
			getRowR().clear();
			DtlR r = DtlTable.getSelectedMCRow();
			if (!isNull(r)) {
				copy(getRowR(), r, createMap_RowR_DtlR());
			}
		}
		else {
			String hs_cd = getRowR().hs_cd();
			String hs_grp_cd = getRowR().hs_grp_cd();
			getRowR().clear();
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				copy(getRowR(), r, createMap_RowR_LclR());
			}
			getRowR().hs_cd(hs_cd);
			getRowR().hs_grp_cd(hs_grp_cd);
		}

		setRowMode();
	}

	protected void setRowMode() {
		if (!_lclFlg) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (isNull(r) || r.isStatusDelete()) {
				setFix(RowPanel);

			}
			else {
				setStatus(_lclFlg);
				if (r.isStatusNone() && !isNull(r.hs_cd()) || r.isStatusModify()) {
					Row_hs_cd.setMode(MCMode.READ_ONLY);
				}
			}
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (isNull(r) ||r.isStatusDelete()) {
				setFix(RowPanel);
				
			}
			else {
				setStatus(_lclFlg);
			}

			ctrlLclMode();
		}
	}

	protected void ctrlLclMode() {
		if (getStatus() == FIX) {
			Row_lcl_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			LclR r = LclTable.getSelectedMCRow();
			if (!isNull(r)) {
				if (!(r.isStatusCreate() || isNull(r.lcl_cd()))) {
					Row_lcl_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Row_lcl_cd.setMode(MCMode.REQUIRED);
				}
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getRowR().clearAll();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setRowMode();
	}

	@Override
	public boolean isChanged() {
		
		if (isDtlChanged()) {
			return true;
		}
		else if (isLclChanged()) {
			return true;
		}
		return super.isChanged();
	}

	public boolean isDtlChanged() {
		return UPD == getStatus() && !getDtlL().isStatusNone();
		
	}

	public boolean isLclChanged() {
		return UPD == getStatus() && !getLclL().isStatusNone();
		
	}

	protected Map_RowR_DtlR<RowR,DtlR> createMap_RowR_DtlR() {
		return new Map_RowR_DtlR<RowR, DtlR>();
	}

	public class Map_RowR_DtlR<D extends RowR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RowR.$hs_grp_cd, DtlR.$hs_grp_cd);
			addColumnPathMap(RowR.$hs_grp_nm, DtlR.$hs_grp_nm);
			addColumnPathMap(RowR.$hs_cd, DtlR.$hs_cd);
			addColumnPathMap(RowR.$hs_nm, DtlR.$hs_nm);
			addColumnPathMap(RowR.$memo1, DtlR.$memo1);
			addColumnPathMap(RowR.$memo2, DtlR.$memo2);
			addColumnPathMap(RowR.$memo3, DtlR.$memo3);

		}
	}

	protected Map_RowR_LclR<RowR,LclR> createMap_RowR_LclR() {
		return new Map_RowR_LclR<RowR, LclR>();
	}

	public class Map_RowR_LclR<D extends RowR, S extends LclR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RowR.$lcl_cd, LclR.$lcl_cd);
			addColumnPathMap(RowR.$lcl_nm, LclR.$lcl_nm);
			addColumnPathMap(RowR.$hs_cd, LclR.$hs_cd);
			addColumnPathMap(RowR.$hs_nm, LclR.$hs_nm);
			addColumnPathMap(RowR.$memo1, LclR.$memo1);
			addColumnPathMap(RowR.$memo2, LclR.$memo2);
			addColumnPathMap(RowR.$memo3, LclR.$memo3);

		}
	}	

	@Override
	public void doDtl_NE(MCEventInfo info) {
		super.doDtl_NE(info);
		_lclFlg = false;
		setRow();
	}

	@Override
	public void doLcl_NE(MCEventInfo info) {
		super.doLcl_NE(info);
		_lclFlg = true;
		setRow();
	}

	protected void setStatus(boolean _lclFlg) {
		if (_lclFlg) {
			Row_lcl_cd.setMode(MCMode.REQUIRED);
			Row_hs_grp_cd.setMode(MCMode.READ_ONLY);
			Row_hs_cd.setMode(MCMode.READ_ONLY);
			Row_hs_nm.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(RowPanel);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_HS));
	}

}