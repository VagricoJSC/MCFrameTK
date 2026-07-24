package mcframe.clientMABC.MABCP0900;

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
import mcframe.clientCore.acl.MCACLManager;
import mcframe.clientCore.container.MCRowEvent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_GpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_GpReg_MC extends MABCP_GpReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_GpReg_MC() {
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
	public MABCP_GpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0900_Srch01();
	}
	/**
	 * [MA_MABCL0900_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Srch01Caller<P extends MABCP_GpReg, B extends MA_MABCL0900_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0900_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0900_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Upd01Caller<P extends MABCP_GpReg, B extends MA_MABCL0900_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0900_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0900_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Del01Caller<P extends MABCP_GpReg, B extends MA_MABCL0900_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0900_Del01Caller(P p, B b) {
			super(p, b);
		}
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
		callMA_MABCL0900_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0900_Del01();
	}

	// -- 個別実装　（ここから）

	@Override
	protected void setStatusByOpe() {
		if (isSrchOpe()) {
			// 操作種別が「参照」対応
			setFIXStatus();
		}
		else if (isUpdOpe() && isNull(getCndR().gp_grp_cd())) {
			// 操作種別が「登録」でも、汎用分類ＣＤが未入力の場合は入力不可
			setFIXStatus();
		}
		else {
			super.setStatusByOpe();
		}
	}
	/**
	 * 操作種別が「参照」のときtrueを返す
	 */
	protected boolean isSrchOpe() {
		return Cnd_ope_REF.isSelected();
	}

	@Override
	public void moveFocusCndPanel() {
		GpGrpPanel.focusFirstComponent();
	}

	@Override
	public void doCnd_gp_grp_cd_LC(MCEventInfo info) {
		super.doCnd_gp_grp_cd_LC(info);

		// 汎用分類ＣＤを変更したとき、一覧をクリアする
		clearAll();
		setStatusByOpe();
	}

	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		// 変更があったタイミングで、対象枠の汎用分類ＣＤをイベント行にセットする
		DtlR dtlR = (DtlR) event.getSourceRow();
		dtlR.gp_grp_cd(getCndR().gp_grp_cd());
	}

	//--------------------リストロジック表示制御Start-----------------------

	/**
	 * 汎用分類のうち、権限のあるものをリストに表示する
	 */
	@SuppressWarnings("unchecked")
	@Override
	public MCList getCnd_gp_grp_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getCnd_gp_grp_cd(row, info);
		MCList<MCRow> newL = MCList.create(MCRow.class);
		for (MCRow r : l) {
			String typ = r.getStringNE(getAuthStrColNm());
			if (isNull(typ)
					|| MCACLManager.authorize(getModuleID(), getScreenID(), typ, null)) {
				newL.add(r);
			}
		}
		return newL;
	}

	/**
	 * 操作種別に対応した権限文字列の項目名を返す
	 */
	protected String getAuthStrColNm() {
		if (Cnd_ope_UPD.isSelected()) {
			return "auth_str_upd";
		}
		else if (Cnd_ope_DEL.isSelected()) {
			return "auth_str_del";
		}
		return "auth_str_srch";
	}

	//--------------------リストロジック表示制御End-----------------------

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// コンボリストに存在しない値であればクリアする
		if (getCndR().gp_grp_cd() != null
				&& Cnd_gp_grp_cd.checkValue(getCndR().gp_grp_cd()).size() != 0) {
			setValueEx(Cnd_gp_grp_cd, null);
		}
	}

}