package mcframe.clientMABC.MABCP1500;

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
import mcframe.clientMAUB.MAUBP5010.*;

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
import java.util.Arrays;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;

import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ExtSysReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ExtSysReg_MC extends MABCP_ExtSysReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ExtSysReg_MC() {
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
	public MABCP_ExtSysReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1500_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Srch01Caller<P extends MABCP_ExtSysReg, B extends MA_MABCL1500_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL1500_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			// 検索時の消去対象として追加する
			addDownContainer(getRareaR());
		}

		@Override
		protected boolean isDownBlockChanged() {

			if(panel.isProtoDtlChanged()){
				return true;
			}
			return super.isDownBlockChanged();
		}

		protected void adjustList() {
			super.adjustList();
			ProtoDtlTable.adjustWidth();
			AdapDtlTable.adjustWidth();
			HttpHeaderDtlTable.adjustWidth();
			ExtSysUsrDtlTable.adjustAllWidth();
		}

		@Override
		protected void clear() {
			super.clear();
			getProtoDtlL().clear();
			getAdapDtlL().clear();
			getRareaR().clear();
			getHttpHeaderDtlL().clear();
			getExtSysUsrDtlL().clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
	}

	/**
	 * [MA_MABCL1500_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Upd01Caller<P extends MABCP_ExtSysReg, B extends MA_MABCL1500_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL1500_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, ProtoDtlTable);
			checkDuplicateMain(msgList, AdapDtlTable);
			checkDuplicateMain(msgList, HttpHeaderDtlTable);
			checkDuplicateMain(msgList, ExtSysUsrDtlTable);
		}
		@Override
		protected void setPickedListMap() {
			refreshProtoDtlL();
			refreshAdapDtlL();
			refreshHttpHeaderDtlL();
			refreshExtSysUsrDtlL();
			super.setPickedListMap();
		}
		@Override
		protected void statusClear() {
			super.statusClear();
			ProtoDtlTable.getList().setStatus(MCRow.NONE);
			AdapDtlTable.getList().setStatus(MCRow.NONE);
			HttpHeaderDtlTable.getList().setStatus(MCRow.NONE);
			ExtSysUsrDtlTable.getList().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABCL1500_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Del01Caller<P extends MABCP_ExtSysReg, B extends MA_MABCL1500_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL1500_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1500_Srch01();
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
	 * Panel[ProtoDtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doProtoDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(ProtoDtlTable);
	}
	/**
	 * Panel[ProtoDtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doProtoDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(ProtoDtlTable);
	}
	/**
	 * Panel[ProtoDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doProtoDtlBtn_radd(MCEventInfo info) {
		insertRow(ProtoDtlTable);
	}
	/**
	 * Panel[ProtoDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doProtoDtlBtn_rdel(MCEventInfo info) {
		deleteRow(ProtoDtlTable);
	}
	/**
	 * Panel[ProtoDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doProtoDtlBtn_rcopy(MCEventInfo info) {
		copyRow(ProtoDtlTable);
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, AdapDtlTable, columnAdapDtl_st_dt, columnAdapDtl_end_dt);
	}
	/**
	 * Panel[AdapDtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doAdapDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(AdapDtlTable);
	}
	/**
	 * Panel[AdapDtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doAdapDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(AdapDtlTable);
	}
	/**
	 * Panel[AdapDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doAdapDtlBtn_radd(MCEventInfo info) {
		insertRow(AdapDtlTable);
	}
	/**
	 * Panel[AdapDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doAdapDtlBtn_rdel(MCEventInfo info) {
		deleteRow(AdapDtlTable);
	}
	/**
	 * Panel[AdapDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doAdapDtlBtn_rcopy(MCEventInfo info) {
		copyRow(AdapDtlTable);
	}
	/**
	 * Panel[HttpHeaderDtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doHttpHeaderDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(HttpHeaderDtlTable);
	}
	/**
	 * Panel[HttpHeaderDtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doHttpHeaderDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(HttpHeaderDtlTable);
	}
	/**
	 * Panel[HttpHeaderDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doHttpHeaderDtlBtn_radd(MCEventInfo info) {
		insertRow(HttpHeaderDtlTable);
	}
	/**
	 * Panel[HttpHeaderDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doHttpHeaderDtlBtn_rdel(MCEventInfo info) {
		deleteRow(HttpHeaderDtlTable);
	}
	/**
	 * Panel[HttpHeaderDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doHttpHeaderDtlBtn_rcopy(MCEventInfo info) {
		copyRow(HttpHeaderDtlTable);
	}
	/**
	 * Panel[ExtSysUsrDtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doExtSysUsrDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(ExtSysUsrDtlTable);
	}
	/**
	 * Panel[ExtSysUsrDtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doExtSysUsrDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(ExtSysUsrDtlTable);
	}
	/**
	 * Panel[ExtSysUsrDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doExtSysUsrDtlBtn_radd(MCEventInfo info) {
		insertRow(ExtSysUsrDtlTable);
	}
	/**
	 * Panel[ExtSysUsrDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doExtSysUsrDtlBtn_rdel(MCEventInfo info) {
		deleteRow(ExtSysUsrDtlTable);
	}
	/**
	 * Panel[ExtSysUsrDtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doExtSysUsrDtlBtn_rcopy(MCEventInfo info) {
		copyRow(ExtSysUsrDtlTable);
		
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
		callMA_MABCL1500_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL1500_Del01();
	}
	
	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void fillSpace() {
		super.fillSpace();
		ProtoDtlTable.fillSpace();
		AdapDtlTable.fillSpace();
		HttpHeaderDtlTable.fillSpace();
		ExtSysUsrDtlTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe()) {
			ProtoDtlTable.setStatusColumnVisible(true);
			AdapDtlTable.setStatusColumnVisible(true);
			HttpHeaderDtlTable.setStatusColumnVisible(true);
			ExtSysUsrDtlTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			ProtoDtlTable.setStatusColumnVisible(false);
			AdapDtlTable.setStatusColumnVisible(false);
			HttpHeaderDtlTable.setStatusColumnVisible(false);
			ExtSysUsrDtlTable.setStatusColumnVisible(false);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		Rarea_if_ctl_typ_nm.setLineWrap(true);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		ProtoDtlTable.setCellConfig(createAppCellConfig());
		AdapDtlTable.setCellConfig(createAppCellConfig());
		HttpHeaderDtlTable.setCellConfig(createAppCellConfig());
		ExtSysUsrDtlTable.setCellConfig(createAppCellConfig());
		DtlTable.setCellConfig(createAppCellConfig());
	}

	/**
	 * ProtoDtl, AdapDtlテーブル制御用セルコンフィグを返す
	 */
	protected AppCellConfig createAppCellConfig() {
		return new AppCellConfig(this);
	}
	protected class AppCellConfig extends MAUDP_RLBaseCellConfig {
		public AppCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// 登録済レコードのキー項目は変更不可
			if (isUpdOpe() && isExistingKey(index, column, table)) {
				return MCMode.READ_ONLY;
			}
			if (table == DtlTable) {
				DtlR r = DtlTable.getRow(index);
				if (column == columnDtl_not_dup_imp_flg
						|| column == columnDtl_if_upd_typ
						|| column == columnDtl_dlv_slip_split_flg) {
					if (!MAC_EXT_SYS_TYP.isSCM(r.ext_sys_typ())
							&& !MAC_EXT_SYS_TYP.isSCM_MD(r.ext_sys_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_not_send_upd_flg) {
					if (!MAC_EXT_SYS_TYP.isSCM(r.ext_sys_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_null_val_if_flg) {
					if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
							&& !MAC_EXT_SYS_TYP.isSCM(r.ext_sys_typ())
							&& !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_upri_not_chk_flg
						|| column == columnDtl_amt_not_chk_flg
						|| column == columnDtl_tax_not_chk_flg) {
					if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
							&& !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_web_api_flg) {
					if (r.cmd_exec_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_cmd_exec_flg) {
					if (r.web_api_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (table == AdapDtlTable) {
				DtlR r = DtlTable.getSelectedMCRow();
				if (!isNull(r)) {
					if (column == columnAdapDtl_file_io_ope) {
						if (r.web_api_flg() || r.cmd_exec_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnAdapDtl_web_api_ope) {
						if (!r.web_api_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnAdapDtl_cmd_exec_ope) {
						if (!r.cmd_exec_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getProtoDtlL().clear();
		getProtoAllL().clear();
		getAdapDtlL().clear();
		getAdapAllL().clear();
		getHttpHeaderDtlL().clear();
		getHttpHeaderAllL().clear();
		getExtSysUsrDtlL().clear();
		getExtSysUsrAllL().clear();
		getRareaR().clear();
	}

	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(ProtoDtlTable, getProtoRKeyColumns())) {
			ProtoDtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(AdapDtlTable, getAdapRKeyColumns())) {
			AdapDtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(HttpHeaderDtlTable, getHttpHeaderRKeyColumns())) {
			HttpHeaderDtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(ExtSysUsrDtlTable, getExtSysUsrRKeyColumns())) {
			ExtSysUsrDtlTable.addSortColumn(c, MCList.SortType.ASC);
		}
	}

	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	@Override
	protected boolean checkAllTableClear() {
		if (DtlTable == null) {
			return false;
		}
		if (LclTable == null) {
			return false;
		}
		if (ProtoDtlTable == null) {
			return false;
		}
		if (AdapDtlTable == null) {
			return false;
		}
		if (HttpHeaderDtlTable == null) {
			return false;
		}
		if (ExtSysUsrDtlTable == null) {
			return false;
		}
		
		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() && getProtoDtlL().isStatusNone() 
				&& getAdapDtlL().isStatusNone() && getHttpHeaderDtlL().isStatusNone() && getExtSysUsrDtlL().isStatusNone()) || confirmTableClear());		
	}

	protected MCRowListener createProtoRowListener() {
		return new ProtoRowListener();
	}
	
	protected class ProtoRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			ProtoRowValueChanged(event);
		}
	}
	
	/**
	 * ＩＦ通信ルール のRowListennerに変更があったときの処理
	 */
	protected void ProtoRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedProtoRowToAll(event);
		setCheckValueDtl(event);
	}
	
	/**
	 * Protoイベント行の選択がオンのとき、ProtoAllL に存在しないものを追加する
	 * その際、ProtoDtlR のキー項目をコピーする
	 */
	protected void addCheckedProtoRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof ProtoDtlR)){
			return;
		}
		ProtoDtlR ProtoR = (ProtoDtlR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (ProtoR.getBooleanNE(getCheckColumn())) {
			if (!getProtoAllL().contains(ProtoR)) {
				getProtoAllL().add(ProtoR);
				ProtoR.ext_sys_cd(dtlR.ext_sys_cd());
				ProtoR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	protected MCRowListener createAdapRowListener() {
		return new AdapRowListener();
	}
	
	protected class AdapRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			AdapRowValueChanged(event);
		}
	}
	
	/**
	 * ＩＦアダプタ のRowListennerに変更があったときの処理
	 */
	protected void AdapRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedAdapRowToAll(event);
		setCheckValueDtl(event);
	}

	/**
	 * Adapイベント行の選択がオンのとき、AdapAllL に存在しないものを追加する
	 * その際、AdapDtlR のキー項目をコピーする
	 */
	protected void addCheckedAdapRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof AdapDtlR)){
			return;
		}
		AdapDtlR AdapR = (AdapDtlR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (AdapR.getBooleanNE(getCheckColumn())) {
			if (!getAdapAllL().contains(AdapR)) {
				getAdapAllL().add(AdapR);
				AdapR.ext_sys_cd(dtlR.ext_sys_cd());
				AdapR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	protected MCRowListener createHttpHeaderRowListener() {
		return new HttpHeaderRowListener();
	}
	
	protected class HttpHeaderRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			HttpHeaderRowValueChanged(event);
		}
	}
	
	/**
	 * HTTPヘッダ のRowListennerに変更があったときの処理
	 */
	protected void HttpHeaderRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedHttpHeaderRowToAll(event);
		setCheckValueDtl(event);
	}

	/**
	 * HttpHeaderイベント行の選択がオンのとき、HttpHeaderAllL に存在しないものを追加する
	 * その際、HttpHeaderDtlR のキー項目をコピーする
	 */
	protected void addCheckedHttpHeaderRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof HttpHeaderDtlR)){
			return;
		}
		HttpHeaderDtlR HttpHeaderR = (HttpHeaderDtlR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (HttpHeaderR.getBooleanNE(getCheckColumn())) {
			if (!getHttpHeaderAllL().contains(HttpHeaderR)) {
				getHttpHeaderAllL().add(HttpHeaderR);
				HttpHeaderR.ext_sys_cd(dtlR.ext_sys_cd());
				HttpHeaderR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	protected MCRowListener createExtSysUsrRowListener() {
		return new ExtSysUsrRowListener();
	}
	
	protected class ExtSysUsrRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			ExtSysUsrRowValueChanged(event);
		}
	}
	/** 
	 * 外部システムユーザ のRowListenerに変更があった時の処理
	 */
	protected void ExtSysUsrRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}

		addCheckedExtSysUsrRowToAll(event);
		setCheckValueDtl(event);
	}

	/**
	 * ExtSysUsrイベント行の選択がオンのとき、ExtSysUsrAllL に存在しないものを追加する
	 * その際、ExtSysUsrDtlR のキー項目をコピーする
	 */
	protected void addCheckedExtSysUsrRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof ExtSysUsrDtlR)){
			return;
		}
		ExtSysUsrDtlR ExtSysUsrR = (ExtSysUsrDtlR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (ExtSysUsrR.getBooleanNE(getCheckColumn())) {
			if (!getExtSysUsrAllL().contains(ExtSysUsrR)) {
				getExtSysUsrAllL().add(ExtSysUsrR);
				ExtSysUsrR.ext_sys_cd(dtlR.ext_sys_cd());
				ExtSysUsrR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(ProtoDtlTable, createProtoRowListener());
		setListListener(AdapDtlTable, createAdapRowListener());
		setListListener(HttpHeaderDtlTable, createHttpHeaderRowListener());
		setListListener(ExtSysUsrDtlTable, createExtSysUsrRowListener());
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		getProtoAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getAdapAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getHttpHeaderAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getExtSysUsrAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
	}

	/**
	 * 各テーブル間の紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	@Override
	protected void setDtlRowNoAll() {
		String[] keyCols = null;
		if (getDtlL().size() > 0) {
			keyCols = getAliasCols(getDtlRKeyColumns(), getDtlL().get(0));
		}
		MCIndexKey idxkey = getLclAllL().createIndex(keyCols);
		MCIndexKey protoIdxkey = getProtoAllL().createIndex(keyCols);
		MCIndexKey adapIdxkey = getAdapAllL().createIndex(keyCols);
		MCIndexKey httpHeaderIdxkey = getHttpHeaderAllL().createIndex(keyCols);
		MCIndexKey extSysUsrIdxkey = getExtSysUsrAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			// 外部システム（ロケール）
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// ＩＦ通信ルール
			l = getProtoAllL().subList(protoIdxkey, binds);
			for (MCConstRow ProtoR : l) {
				ProtoR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// ＩＦアダプタ
			l = getAdapAllL().subList(adapIdxkey, binds);
			for (MCConstRow AdapR : l) {
				AdapR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// HTTPヘッダ
			l = getHttpHeaderAllL().subList(httpHeaderIdxkey, binds);
			for (MCConstRow HttpHeaderR : l) {
				HttpHeaderR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// 外部システムユーザ
			l = getExtSysUsrAllL().subList(extSysUsrIdxkey, binds);
			for (MCConstRow ExtSysUsrR : l) {
				ExtSysUsrR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		if (!isCheckColumn(event)) {
			setKeyChangeToDtlSub(event);
		}
		else {
			setAllDtlSubCheckOff(event);
		}
	}
	
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、ProtoDtl,AdapDtl,HttpHeaderDtl,ExtSysUsrDtlの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlSub(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow ProtoR : getProtoListForDtlR(dtlR)) {
				ProtoR.setValueNE(col, dtlR.getValueNE(col));
				if (ProtoR.isStatusNone() && !isNull(ProtoR.getValueNE(getUpdCntrColumn()))) {
					ProtoR.setStatus(MCRow.MODIFY);
				}
			}
			for (MCConstRow AdapR : getAdapListForDtlR(dtlR)) {
				AdapR.setValueNE(col, dtlR.getValueNE(col));
				if (AdapR.isStatusNone() && !isNull(AdapR.getValueNE(getUpdCntrColumn()))) {
					AdapR.setStatus(MCRow.MODIFY);
				}
			}
			for (MCConstRow HttpHeaderR : getHttpHeaderListForDtlR(dtlR)) {
				HttpHeaderR.setValueNE(col, dtlR.getValueNE(col));
				if (HttpHeaderR.isStatusNone() && !isNull(HttpHeaderR.getValueNE(getUpdCntrColumn()))) {
					HttpHeaderR.setStatus(MCRow.MODIFY);
				}
			}
			for (MCConstRow ExtSysUsrR : getExtSysUsrListForDtlR(dtlR)) {
				ExtSysUsrR.setValueNE(col, dtlR.getValueNE(col));
				if (ExtSysUsrR.isStatusNone() && !isNull(ExtSysUsrR.getValueNE(getUpdCntrColumn()))) {
					ExtSysUsrR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての ProtoDtl,AdapDtl,HttpHeaderDtl,ExtSysUsrDtl の「選択」項目をオフにする
	 */
	protected void setAllDtlSubCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getProtoDtlL().setBoolean(getCheckColumn(), false);
			getAdapDtlL().setBoolean(getCheckColumn(), false);
			getHttpHeaderDtlL().setBoolean(getCheckColumn(), false);
			getExtSysUsrDtlL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l1 = getProtoListForDtlR(r);
			l1.setBoolean(getCheckColumn(), false);
			MCList<? extends MCConstRow> l2 = getAdapListForDtlR(r);
			l2.setBoolean(getCheckColumn(), false);
			MCList<? extends MCConstRow> l3 = getHttpHeaderListForDtlR(r);
			l3.setBoolean(getCheckColumn(), false);
			MCList<? extends MCConstRow> l4 = getExtSysUsrListForDtlR(r);
			l4.setBoolean(getCheckColumn(), false);
		}
	}

	/**
	 * Dtlの行削除のとき、ProtoAll、AdapAll、HttpHeaderAll、ExtSysUsrAllから関連する行を全て削除する
	 * Proto、Adap、HttpHeader、ExtSysUsrの行削除のとき、ProtoAll、AdapAll、HttpHeaderAll、ExtSysUsrAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			ProtoDtlTable.clear();
			AdapDtlTable.clear();
			HttpHeaderDtlTable.clear();
			ExtSysUsrDtlTable.clear();
			LclTable.clear();
		}
		E delR = super.deleteRow(table);
		if (table == getDtlTable() && delR != null) {
			getProtoAllL().removeAll(getProtoListForDtlR(delR));
			getAdapAllL().removeAll(getAdapListForDtlR(delR));
			getHttpHeaderAllL().removeAll(getHttpHeaderListForDtlR(delR));
			getExtSysUsrAllL().removeAll(getExtSysUsrListForDtlR(delR));
		}
		if (table == ProtoDtlTable && delR != null) {
			getProtoAllL().remove(delR);
		}
		if (table == AdapDtlTable && delR != null) {
			getAdapAllL().remove(delR);
		}
		if (table == HttpHeaderDtlTable && delR != null) {
			getHttpHeaderAllL().remove(delR);
		}
		if (table == ExtSysUsrDtlTable && delR != null) {
			getExtSysUsrAllL().remove(delR);
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == getDtlTable()) {
			// 行コピーで外部システム一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getLclRKeyColumns());
			checkDuplicate(msgList, ProtoDtlTable, getProtoRKeyColumns());
			checkDuplicate(msgList, AdapDtlTable, getAdapRKeyColumns());
			checkDuplicate(msgList, HttpHeaderDtlTable, getHttpHeaderRKeyColumns());
			checkDuplicate(msgList, ExtSysUsrDtlTable, getExtSysUsrRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたDtl行ＮＯをセットする
	 * 下部の一覧をクリアする
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getProtoDtlL().contains(dest)) {
			ProtoDtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getAdapDtlL().contains(dest)) {
			AdapDtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getHttpHeaderDtlL().contains(dest)) {
			HttpHeaderDtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getExtSysUsrDtlL().contains(dest)) {
			ExtSysUsrDtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			AdapDtlBtn_rdel.setMode(this, getStatus());
			// ＩＦアダプタ一覧をクリアする
			AdapDtlTable.clear();
			AdapDtlTable.fillSpace();
			AdapDtlTable.adjustWidth();
			AdapDtlTable.selectLeftmostColumn(0);
			ProtoDtlBtn_rdel.setMode(this, getStatus());
			// ＩＦ通信ルール一覧をクリアする
			ProtoDtlTable.clear();
			ProtoDtlTable.fillSpace();
			ProtoDtlTable.adjustWidth();
			ProtoDtlTable.selectLeftmostColumn(0);
			// HTTPヘッダ一覧をクリアする
			HttpHeaderDtlTable.clear();
			HttpHeaderDtlTable.fillSpace();
			HttpHeaderDtlTable.adjustWidth();
			HttpHeaderDtlTable.selectLeftmostColumn(0);
			// 外部システムユーザ一覧をクリアする
			ExtSysUsrDtlTable.clear();
			ExtSysUsrDtlTable.fillSpace();
			ExtSysUsrDtlTable.adjustWidth();
			ExtSysUsrDtlTable.selectLeftmostColumn(0);
		}
		return dest;
	}

	@Override
	public boolean isChanged() {
		
		if (isProtoDtlChanged()) {
			return true;
		}
		return super.isChanged();
	}

	/**
	 * 一覧枠のステータスが変更されているか
	 * 
	 * @return
	 */
	public boolean isProtoDtlChanged() {
		return UPD == getStatus() && !getProtoDtlL().isStatusNone();
	}

	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l2 = getProtoDtlL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l3 = getAdapDtlL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l4 = getHttpHeaderDtlL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l5 = getExtSysUsrDtlL().subList(getCheckColumn(), true);


		if (!l1.isEmpty() || !l2.isEmpty() || !l3.isEmpty() || !l4.isEmpty() || !l5.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// lclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getLclRKeyColumns());

		// ProtoDtlL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(ProtoDtlTable, l2));
		// ProtoDtlL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, ProtoDtlTable, getProtoRKeyColumns());

		// AdapDtlL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(AdapDtlTable, l3));
		// AdapDtlL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, AdapDtlTable, getAdapRKeyColumns());
		
		// HttpHeaderDtlL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(HttpHeaderDtlTable, l4));
		// HttpHeaderDtlL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, HttpHeaderDtlTable, getHttpHeaderRKeyColumns());
		
		// ExtSysUsrDtlL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(ExtSysUsrDtlTable, l5));
		// ExtSysUsrDtlL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, ExtSysUsrDtlTable, getExtSysUsrRKeyColumns());
		
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}
		return true;
	}
	

	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshProtoDtlL();
		refreshAdapDtlL();
		refreshHttpHeaderDtlL();
		refreshExtSysUsrDtlL();
		DtlR r = DtlTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを ProtoAllL から取得してProtoDtlTableに表示
		MCList<ProtoDtlR> l1 = getProtoListForDtlR(r);
		getProtoDtlL().setAll(l1);
		sort(ProtoDtlTable);
		// Dtl の選択行のキー項目と一致するレコードを AdapAllL から取得してAdapDtlTableに表示
		MCList<AdapDtlR> l2 = getAdapListForDtlR(r);
		getAdapDtlL().setAll(l2);
		sort(AdapDtlTable);
		// Dtl の選択行のキー項目と一致するレコードを HttpHeaderAllL から取得してHttpHeaderDtlTableに表示
		MCList<HttpHeaderDtlR> l3 = getHttpHeaderListForDtlR(r);
		getHttpHeaderDtlL().setAll(l3);
		sort(HttpHeaderDtlTable);
		// Dtl の選択行のキー項目と一致するレコードを ExtSysUsrAllL から取得してExtSysUsrDtlTableに表示
		MCList<ExtSysUsrDtlR> l4 = getExtSysUsrListForDtlR(r);
		getExtSysUsrDtlL().setAll(l4);
		sort(ExtSysUsrDtlTable);
		
		if(isUpdSts()) {
			ProtoDtlTable.fillSpace();
			AdapDtlTable.fillSpace();
			HttpHeaderDtlTable.fillSpace();
			ExtSysUsrDtlTable.fillSpace();
		}

		ProtoDtlTable.adjustWidth();
		ProtoDtlTable.selectRowNoFocus(0);
		AdapDtlTable.adjustWidth();
		AdapDtlTable.selectRowNoFocus(0);
		HttpHeaderDtlTable.adjustWidth();
		HttpHeaderDtlTable.selectRowNoFocus(0);
		ExtSysUsrDtlTable.adjustWidth();
		ExtSysUsrDtlTable.selectRowNoFocus(0);
	}
	@Override
	public MCList getDtl_if_upd_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDtl_if_upd_typ(row, info);
		MCList<MCRow> newL = MCList.create(MCRow.class);
		for (MCRow r : l) {
			String typ = r.getString(IfUpdTypCols.$o_if_upd_typ);
			if (!MAC_IF_UPD_TYP.isALL_ERROR(typ)) {
				newL.add(r);
			}
		}
		return newL;
	}

	@Override
	public void doDtl_web_api_flg_NC(MCEventInfo info) {
		super.doDtl_web_api_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		for (MCConstRow AdapR : getAdapListForDtlR(r)) {
			if (r.web_api_flg()) {
				AdapR.setValueNE("file_io_ope", null);
				AdapR.setValueNE("cmd_exec_ope", null);
			}
			else {
				AdapR.setValueNE("web_api_ope", null);
			}
			if (AdapR.isStatusNone() && !isNull(AdapR.getValueNE(getUpdCntrColumn()))) {
				AdapR.setStatus(MCRow.MODIFY);
			}
		}
	}
	
	@Override
	public void doDtl_cmd_exec_flg_NC(MCEventInfo info) {
		super.doDtl_cmd_exec_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		for (MCConstRow AdapR : getAdapListForDtlR(r)) {
			if (r.cmd_exec_flg()) {
				AdapR.setValueNE("file_io_ope", null);
				AdapR.setValueNE("web_api_ope", null);
			}
			else {
				AdapR.setValueNE("cmd_exec_ope", null);
			}
			if (AdapR.isStatusNone() && !isNull(AdapR.getValueNE(getUpdCntrColumn()))) {
				AdapR.setStatus(MCRow.MODIFY);
			}
		}
	}

	@Override
	public void doDtl_ext_sys_typ_LC(MCEventInfo info) {
		super.doDtl_ext_sys_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (MAC_EXT_SYS_TYP.isSCM_MD(r.ext_sys_typ())) {
			setValueEx(columnDtl_not_send_upd_flg, idx, true);
			setValueEx(columnDtl_null_val_if_flg, idx, true);
		}
		else if (!MAC_EXT_SYS_TYP.isSCM(r.ext_sys_typ())) {
			setValueEx(columnDtl_not_dup_imp_flg, idx, false);
			setValueEx(columnDtl_if_upd_typ, idx, null);
			setValueEx(columnDtl_dlv_slip_split_flg, idx, false);
			setValueEx(columnDtl_not_send_upd_flg, idx, false);
			if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
					&& !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
				setValueEx(columnDtl_null_val_if_flg, idx, false);
			}
		}
		if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
				&& !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
			setValueEx(columnDtl_upri_not_chk_flg, idx, false);
			setValueEx(columnDtl_amt_not_chk_flg, idx, false);
			setValueEx(columnDtl_tax_not_chk_flg, idx, false);
		}
	}
	
	@Override
	public void doProtoDtl_NC(MCEventInfo info) {
		super.doProtoDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getProtoDtlL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			ProtoDtlBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			ProtoDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			ProtoDtlBtn_rdel.setMode(this, getStatus());
		}
		setTestArea();
	}
	
	@Override
	public void doAdapDtl_NC(MCEventInfo info) {
		super.doAdapDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getAdapDtlL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			AdapDtlBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			AdapDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			AdapDtlBtn_rdel.setMode(this, getStatus());
		}
	}
	
	@Override
	public void doHttpHeaderDtl_NC(MCEventInfo info) {
		super.doHttpHeaderDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;

		MCConstRow row = getHttpHeaderDtlL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			HttpHeaderDtlBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			HttpHeaderDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			HttpHeaderDtlBtn_rdel.setMode(this, getStatus());
		}
	}
	@Override
	public void doProtoDtl_if_ctl_typ_LC(MCEventInfo info) {
		super.doProtoDtl_if_ctl_typ_LC(info);
		
		if (info.getEventIndex() < 0) return;
		setTestArea();
	}
	
	@Override
	public void doExtSysUsrDtl_NC(MCEventInfo info) {
		super.doExtSysUsrDtl_NC(info);

		if (info.getEventIndex() < 0) return;

		MCConstRow row = getExtSysUsrDtlL().get(info.getEventIndex());

		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			ExtSysUsrDtlBtn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			ExtSysUsrDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			ExtSysUsrDtlBtn_rdel.setMode(this, getStatus());
		}
	}

	/**
	 * テキストエリアの設定
	 */
	protected void setTestArea() {
		getRareaR().clear();
		ProtoDtlR r = ProtoDtlTable.getSelectedMCRow();
		if (r == null) {
			getRareaR().clear();
		}
		else {
			copy(getRareaR(), r, createMap_RareaR_ProtoDtlR());
		}
	}
	
	/**
	 * ProtoDtlテーブルの現状をProtoAllに反映する
	 */
	protected void refreshProtoDtlL() {
		if (getProtoDtlL().size() == 0) {
			return ;
		}
		MCList<ProtoDtlR> l = MCList.create(ProtoDtlR.class);
		for (ProtoDtlR r : getProtoDtlL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<ProtoDtlR> removeL = getProtoAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getProtoAllL().removeAll(removeL);
			getProtoAllL().addAll(l);
		}
	}
	
	/**
	 * Dtl行に関連付けられたProtoAll行のリストを返す。
	 */
	protected MCList<ProtoDtlR> getProtoListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCList<ProtoDtlR> strLnL = getProtoAllL().subList(DTL_ROW_NO_COL_NM, no);
		return strLnL;
	}
	
	/**
	 * AdapDtlテーブルの現状をAdapAllに反映する
	 */
	protected void refreshAdapDtlL() {
		if (getAdapDtlL().size() == 0) {
			return ;
		}
		MCList<AdapDtlR> l = MCList.create(AdapDtlR.class);
		for (AdapDtlR r : getAdapDtlL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<AdapDtlR> removeL = getAdapAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getAdapAllL().removeAll(removeL);
			getAdapAllL().addAll(l);
		}
	}

	/**
	 * Dtl行に関連付けられたAdapAll行のリストを返す。
	 */
	protected MCList<AdapDtlR> getAdapListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCList<AdapDtlR> strLnL = getAdapAllL().subList(DTL_ROW_NO_COL_NM, no);
		return strLnL;
	}

	/**
	 * HttpHeaderDtlテーブルの現状をHttpHeaderAllに反映する
	 */
	protected void refreshHttpHeaderDtlL() {
		if (getHttpHeaderDtlL().size() == 0) {
			return ;
		}
		MCList<HttpHeaderDtlR> l = MCList.create(HttpHeaderDtlR.class);
		for (HttpHeaderDtlR r : getHttpHeaderDtlL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<HttpHeaderDtlR> removeL = getHttpHeaderAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getHttpHeaderAllL().removeAll(removeL);
			getHttpHeaderAllL().addAll(l);
		}
	}
	
	/**
	 * Dtl行に関連付けられたHttpHeaderAll行のリストを返す。
	 */
	protected MCList<HttpHeaderDtlR> getHttpHeaderListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCList<HttpHeaderDtlR> strLnL = getHttpHeaderAllL().subList(DTL_ROW_NO_COL_NM, no);
		return strLnL;
	}

	/** ExtSysUsrDtlテーブルの現状をExtSysUsrAllに反映する*/
	protected void refreshExtSysUsrDtlL() {
		if (getExtSysUsrDtlL().size() == 0) {
			return;
		}
		MCList<ExtSysUsrDtlR> l = MCList.create(ExtSysUsrDtlR.class);
		for (ExtSysUsrDtlR r : getExtSysUsrDtlL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<ExtSysUsrDtlR> removeL = getExtSysUsrAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getExtSysUsrAllL().removeAll(removeL);
			getExtSysUsrAllL().addAll(l);
		}
	}
	
	/**
	 * Dtl行に関連付けられたExtSysUsrAll行のリストを返す。
	 */
	protected MCList<ExtSysUsrDtlR> getExtSysUsrListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCList<ExtSysUsrDtlR> strLnL = getExtSysUsrAllL().subList(DTL_ROW_NO_COL_NM, no);
		return strLnL;
	}

	/** ProtoDtlTableのキー項目を返します。 */
	protected String[] _Proto_keys;

	public String[] getProtoRKeyColumns() {
		if (_Proto_keys == null) {
			ProtoDtlR r = getProtoDtlL().createRow();
			_Proto_keys = r.getKeys().toArray(new String[0]);
		}
		return _Proto_keys;
	}
	/** AdapDtlTableのキー項目を返します。 */
	protected String[] _Adap_keys;

	public String[] getAdapRKeyColumns() {
		if (_Adap_keys == null) {
			AdapDtlR r = getAdapDtlL().createRow();
			_Adap_keys = r.getKeys().toArray(new String[0]);
		}
		return _Adap_keys;
	}
	
	/** HttpHeaderDtlTableのキー項目を返します。 */
	protected String[] _Http_Header_keys;

	public String[] getHttpHeaderRKeyColumns() {
		if (_Http_Header_keys == null) {
			HttpHeaderDtlR r = getHttpHeaderDtlL().createRow();
			_Http_Header_keys = r.getKeys().toArray(new String[0]);
		}
		return _Http_Header_keys;
	}

	/** ExtSysUsrDtlTableのキー項目を返します。 */
	protected String[] _Ext_Sys_Usr_keys;
	
	public String[] getExtSysUsrRKeyColumns() {
		if (_Ext_Sys_Usr_keys == null) {
			ExtSysUsrDtlR r = getExtSysUsrDtlL().createRow();
			_Ext_Sys_Usr_keys = r.getKeys().toArray(new String[0]);
		}
		return _Ext_Sys_Usr_keys;
	}

	/**
	 * ProtoDtl⇒Rarea
	 * 
	 * @return
	 */
	protected Map_RareaR_ProtoDtlR<RareaR, ProtoDtlR> createMap_RareaR_ProtoDtlR() {
		return new Map_RareaR_ProtoDtlR<RareaR, ProtoDtlR>();
	}

	public class Map_RareaR_ProtoDtlR<D extends RareaR, S extends ProtoDtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RareaR.$if_ctl_typ_nm, ProtoDtlR.$if_ctl_typ_nm);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_EXT_SYS));
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getProtoDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getProtoDtl_if_proc_typ(row, info);
	}
	@Override
	public MCList getAdapDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getAdapDtl_if_proc_typ(row, info);
	}
	@Override
	public MCList getHttpHeaderDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getHttpHeaderDtl_if_proc_typ(row, info);
	}
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			String extSysTyp = r.ext_sys_typ();
	
			for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
				if (MAC_EXT_SYS_TYP.isEDI(extSysTyp) || MAC_EXT_SYS_TYP.isEDI_MCF(extSysTyp)) {
					if (ifProcTyp.is_edi()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isPLM(extSysTyp)) {
					if (ifProcTyp.is_plm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isAC(extSysTyp)) {
					if (ifProcTyp.is_ac()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isSCM(extSysTyp) || MAC_EXT_SYS_TYP.isSCM_MD(extSysTyp)) {
					if (ifProcTyp.is_scm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isFB(extSysTyp)) {
					if (ifProcTyp.is_fb()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if (ifProcTyp.is_bi()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isAC_SAP(extSysTyp)) {
					if (ifProcTyp.is_sap()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isSCM_PCM(extSysTyp)) {
					if (ifProcTyp.is_pcm()) {
						l.add(ifProcTyp);
					}
				}
				if (!MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if(ifProcTyp.is_all()) {
						l.add(ifProcTyp);
					}
				}
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}