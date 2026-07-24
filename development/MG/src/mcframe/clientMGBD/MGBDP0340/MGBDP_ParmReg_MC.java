package mcframe.clientMGBD.MGBDP0340;

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
import mcframe.clientMAUB.MAUBP5310.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ParmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ParmReg_MC extends MGBDP_ParmReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ParmReg_MC() {
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
	public MGBDP_ParmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0340_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0340_Srch01Caller<P extends MGBDP_ParmReg, B extends MG_MGBDL0340_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0340_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 検索時の消去対象として追加する
			addDownContainer(getRareaR());
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
	 * [MG_MGBDL0340_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0340_Upd01Caller<P extends MGBDP_ParmReg, B extends MG_MGBDL0340_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0340_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0340_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0340_Del01Caller<P extends MGBDP_ParmReg, B extends MG_MGBDL0340_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0340_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0340_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0340_Imp01Caller<P extends MGBDP_ParmReg, B extends MG_MGBDL0340_Imp01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0340_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (hasErr()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}

			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasErr() {
			return !isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ,
					MAC_RTN_STS_TYP.ERR.value()));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			for (RsltR rsltR : bridge.down0()) {
				rsltR.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);

			setFIX_UStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0340_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
		setBtnMode();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0340_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0340_Del01();
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();

		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();

		Rarea_parm_remark.setLineWrap(true);
	}

	// ///////////////////// Validation Change ////////////////////////////////
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		// FIX（登録直後）、REF（参照種別）では、クリア確認出さない
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	/** 更新（登録・更新ステータス、削除（検索後）ステータス）ステータスであるかどうかを返す */
	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	/** 登録・更新ステータスであるかどうかを返す */
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	/** 削除（検索後）ステータスであるかどうかを返す */
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	// ///////////////////// Notification Change //////////////////////////////
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		clearContainers(getRareaR());
		setSrchStatus();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setTextArea();
		setBtnMode();
	}

	@Override
	public void doRslt_calc_grp_nm_NC(MCEventInfo info) {
		super.doRslt_calc_grp_nm_NC(info);

		setTextArea();
	}

	@Override
	public void doRslt_parm_remark_NC(MCEventInfo info) {
		super.doRslt_parm_remark_NC(info);

		setTextArea();
	}

	// ///////////////////// Status ///////////////////////////////////////////
	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}

		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータスに設定する */
	protected void setRefStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}

		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setStatusCom() {
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setTextArea() {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		if (isNull(rsltR)) {
			return;
		}

		getRareaR().clear();
		copy(getRareaR(), rsltR, createMap_RareaR_RsltR());
	}

	protected void setBtnMode() {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (rsltR == null) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行と空行のみ、行削除可能
				if (!isNull(rsltR.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}

				// 現在のステータスにおける実装仕様書のモードとする場合は、setDefaultModeメソッドを呼ぶ
				setDefaultMode(Btn_rcopy);
			}
		}
	}

	//参照（検索前）
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();

		setStatusCom();
	}

	// 削除（検索前）
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();

		setStatusCom();
	}

	// 登録・更新
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setStatusCom();
	}

	// ファイル取り込み
	@Override
	public void setINSStatus() {
		super.setINSStatus();

		setStatusCom();
	}

	// 参照（検索後）
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setStatusCom();
	}

	// 削除（検索後）
	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setStatusCom();
	}

	// 登録後
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setStatusCom();
	}

	// ///////////////////// File Input ///////////////////////////////////////
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}

		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);

		// ファイル入力後の処理
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBDL0340_Imp01();
		}
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);

		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

	// ///////////////////// CellConfig ///////////////////////////////////////
	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR rsltR = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (!isNull(rsltR.upd_cntr()) && isKeyColumn(column, rsltR)) {
				return MCMode.READ_ONLY;
			}

			return super.getPriorMode(index, column, table);
		}
	}

	// ///////////////////// IfListRegPanel ///////////////////////////////////
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	// ///////////////////// RowMapperAssist //////////////////////////////////
	protected Map_RareaR_RsltR<RareaR, RsltR> createMap_RareaR_RsltR() {
		return new Map_RareaR_RsltR<RareaR, RsltR>();
	}

	public class Map_RareaR_RsltR<D extends RareaR, S extends RsltR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RareaR.$calc_grp_cd, RsltR.$calc_grp_cd);
			addColumnPathMap(RareaR.$calc_grp_nm, RsltR.$calc_grp_nm);
			addColumnPathMap(RareaR.$parm_key, RsltR.$parm_key);
			addColumnPathMap(RareaR.$parm_biz_grp, RsltR.$parm_biz_grp);
			addColumnPathMap(RareaR.$parm_remark, RsltR.$parm_remark);

		}
	}

}