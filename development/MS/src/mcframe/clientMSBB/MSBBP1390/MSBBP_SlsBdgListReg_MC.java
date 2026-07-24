package mcframe.clientMSBB.MSBBP1390;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientCore.beans.text.MCBigNumberFormatInfo;
import mcframe.clientCore.beans.text.MCNumberFormat;
import mcframe.commonMA.constant.MAC_BIG_NUM_RND_TYP;
import mcframe.commonMA.constant.MAC_RND_TYP;
import mcframe.commonMA.meta.MA_META;
import mcframe.clientMAUD.MAUDP0010.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsBdgListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsBdgListReg_MC extends MSBBP_SlsBdgListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsBdgListReg_MC() {
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
	public MSBBP_SlsBdgListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBBL1390_Srch01().execDL();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1390_Srch01();
	}

	/**
	 * [MS_MSBBL1390_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Imp01Caller<P extends MSBBP_SlsBdgListReg, B extends MS_MSBBL1390_Imp01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBBL1390_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(DtlR.$rtn_sts_typ,
					MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void handleMCEx(MCException ex) {
			super.handleMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBBL1390_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Srch01Caller<P extends MSBBP_SlsBdgListReg, B extends MS_MSBBL1390_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1390_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}

		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkAtLeastOne(NotSumPanel));
			msgList.addAll(checkAtLeastOne(SlsItmGrpNotSumPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}

	}

	/**
	 * [MS_MSBBL1390_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Upd01Caller<P extends MSBBP_SlsBdgListReg, B extends MS_MSBBL1390_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1390_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
	}

	/**
	 * [MS_MSBBL1390_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Del01Caller<P extends MSBBP_SlsBdgListReg, B extends MS_MSBBL1390_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1390_Del01Caller(P p, B b) {
			super(p, b);
		}

	}
			
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1390_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1390_Del01();
	}

	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Dtl_BpGrp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
		Dtl_SlsAmt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_amt_dec_place);
		Dtl_SlsProfAmt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_amt_dec_place);
		Dtl_BpGrp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		Cnd_not_sum_flg.setValue(true);
		Cnd_sum_flg.setValue(true);
		Cnd_sls_itm_grp_not_sum_flg.setValue(true);
		Cnd_sls_itm_grp_sum_flg.setValue(true);
		setValueEx(Cmmn_big_num_rnd_typ, getCo().sls_bdj_rnd_typ());
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			DtlTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setMeshMode();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setMeshMode();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setMeshMode();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setMeshMode();
		setBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setMeshMode();
		setBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (r.isStatusCreate() || isNull(r.upd_cntr())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
	}

	protected void setMeshMode() {
		if (!getCndR().mesh_srch_flg()) {
			Cnd_mesh_sls_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_mesh_sls_itm_grp_flg.setMode(MCMode.READ_ONLY);
			Cnd_mesh_cst_flg.setMode(MCMode.READ_ONLY);
			Cnd_mesh_sls_usr_flg.setMode(MCMode.READ_ONLY);
			Cnd_mesh_wrk_no_flg.setMode(MCMode.READ_ONLY);
			clearMeshFlg();
		}
		else {
			setDefaultMode(Cnd_mesh_sls_dpt_flg);
			setDefaultMode(Cnd_mesh_sls_itm_grp_flg);
			setDefaultMode(Cnd_mesh_cst_flg);
			setDefaultMode(Cnd_mesh_sls_usr_flg);
			setDefaultMode(Cnd_mesh_wrk_no_flg);
		}
	}

	protected void clearMeshFlg() {
		getCndR().mesh_sls_dpt_flg(false);
		getCndR().mesh_sls_itm_grp_flg(false);
		getCndR().mesh_cst_flg(false);
		getCndR().mesh_sls_usr_flg(false);
		getCndR().mesh_wrk_no_flg(false);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// setModeNoDownや種別切替時の処理を共通化するため
		// 種別に応じてとり得る検索前ステータスの設定はメソッドとして切り出す

		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// setModeNoDownの処理を共通化するため
		// 種別に応じてとり得る検索後ステータスの設定はメソッドとして切り出す
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			DtlTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（登録直後）、REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getDtlL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には一覧をクリアする
		clearContainers(getDtlL());
		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();
		// 一覧をクリアしているためfillSpaceする
		fillSpace();
		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		// Do Nothing
	}

	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。取消種別では非表示、それ以外は表示
		if (Cnd_ope_DEL.isSelected()) {
			DtlTable.setStatusColumnVisible(false);
		}
		else {
			DtlTable.setStatusColumnVisible(true);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_bdg_sls_prof_amt.addLCListener(this);
		columnDtl_bdg_sls_amt.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_bdg_sls_prof_amt) doDtl_bdg_sls_prof_amt_LC(info);
		if (lc == columnDtl_bdg_sls_amt) doDtl_bdg_sls_amt_LC(info);
	}
	

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTableCellConfig cc = createDtlTableCellConfig();
		DtlTable.setCellConfig(cc);

	}

	protected MCNumberFormat _bigNumFormat = new MCNumberFormat();

	@Override
	public void doCmmn_big_num_rnd_typ_LC(MCEventInfo info) {
		super.doCmmn_big_num_rnd_typ_LC(info);

		MCBigNumberFormatInfo finfo = null;
		if (!isNull(getCmmnR().big_num_rnd_typ())) {
			finfo = new MCBigNumberFormatInfo();
			MAC_BIG_NUM_RND_TYP typ = MAC_BIG_NUM_RND_TYP.get(getCmmnR()
					.big_num_rnd_typ());
			finfo.multiple(typ.multiple());
			finfo.dec_place(typ.dec_place());
			finfo.rounding_mode(MAC_RND_TYP.toMC(typ.rnd_typ()));
		}
		_bigNumFormat.setBigNumberFormatInfo(finfo);
	}

	protected DtlTableCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	protected class DtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (getStatus() == UPD || getStatus() == DEL) {
		
				DtlR r = (DtlR) table.getBaseTable().getRow(index);

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				if (column == columnDtl_wg_cd) {
					if (!isNull(r.sls_dpt_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_sls_itm_grp_not_sum_flg) {
					if (!r.not_sum_flg() || isNull(r.sls_itm_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				// キー項目をロックする
				if (r.getKeys().contains(column.getBaseRowColumnName())) {
					if (!isNull(r.ym())
							&& (r.getStatus() == MCRow.NONE || r.getStatus() == MCRow.MODIFY)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		public MCNumberFormat getPriorNumberFormat(int index, MCColumnConfig column,
				MCTable table, MCMode mode) {
			// 金額用のセルの場合は特別なフォーマットを返す
			if (isAmtColumn(column)) {
				return _bigNumFormat;
			}
			else {
				return super.getPriorNumberFormat(index, column, table, mode);
			}
		}

		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			if (isAmtColumn(column)) {
				MAC_BIG_NUM_RND_TYP rnd_typ = MAC_BIG_NUM_RND_TYP.getNE(getCmmnR()
						.big_num_rnd_typ());
				if (rnd_typ != null) {
					return (rnd_typ.dec_place() != null) ? rnd_typ.dec_place().intValue()
							: 0;
				}
			}
			return super.getPriorScale(index, column, table);
		}
		@Override
		public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
			if (isAmtColumn(column)) {
				if (_bigNumFormat != null) {
					MCBigNumberFormatInfo info = _bigNumFormat.getBigNumberFormatInfo();
					if (info != null) {
						return column.getMeta().length() - column.getMeta().scale() + getPriorScale(index, column, table);
					}
				}
			}
			return super.getPriorLength(index, column, table);
		}

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			return column == columnDtl_bdg_sls_amt
					|| column == columnDtl_bdg_sls_prof_amt;
		}

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			return column == columnDtl_bdg_sls_prof_rate;
		}

		@Override
		protected MCNumber getUnitDecPlace(int index, MCColumnConfig config) {
			return new MCNumber(MA_META.PER.scale());
		}
		
	}

	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == DtlTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBBL1390_Imp01();
	}

	@Override
	public void doCnd_mesh_srch_flg_NC(MCEventInfo info) {
		super.doCnd_mesh_srch_flg_NC(info);
		setMeshMode();
	}

	@Override
	public void doDtl_sls_itm_grp_cd_LC(MCEventInfo info) {
		super.doDtl_sls_itm_grp_cd_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_sls_itm_grp_not_sum_flg, index, false);
	}

	@Override
	public void doDtl_ym_LC(MCEventInfo info) {
		super.doDtl_ym_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_sls_dpt_cd, index, null);
	}

	@Override
	public void doDtl_trd_cur_cd_LC(MCEventInfo info) {
		super.doDtl_trd_cur_cd_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_bdg_sls_amt, index, null);
	}

	@Override
	public void doDtl_not_sum_flg_NC(MCEventInfo info) {
		super.doDtl_not_sum_flg_NC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_sls_itm_grp_not_sum_flg, index, false);
	}

	public void doDtl_bdg_sls_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setValueEx(columnDtl_bdg_sls_prof_rate, index, null);
		setValueEx(columnDtl_bdg_sls_prof_amt, index, null);
	}

	@Override
	public void doDtl_bdg_sls_prof_rate_LC(MCEventInfo info) {
		super.doDtl_bdg_sls_prof_rate_NC(info);
		int index = info.getEventIndex();
		setBdgSlsProfAmt(index);
	}

	public void doDtl_bdg_sls_prof_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setBdgSlsProfRate(index);
	}
	
	
	@Override
    public MCMessage msgDeleteConfirm() {
        return new MCMessage(FXBAP0005);
    }

    @Override
    public MCMessage msgDeleted() {
        return new MCMessage(FXBAP0022);
    }

    @Override
    public MCMessage msgDeleteFailed() {
        return new MCMessage(FXBAP0097);
    }
	
	
	
	
	/**
	 * 売上粗利額の計算処理
	 * @param i
	 */
	protected void setBdgSlsProfAmt(int i) {
		DtlR r = getDtlL().get(i);
		MCNumber amt = r.bdg_sls_amt();
		MCNumber rate = r.bdg_sls_prof_rate();
		MCNumber dec_place = r.amt_dec_place();
		if (isNullOr(amt, rate, dec_place)) {
			r.bdg_sls_prof_amt(null);
			return;
		}
		MCNumber prof_amt = amt.multiply(rate.divide(100), dec_place.intValue(),
				MAC_RND_TYP.RNDUP.toMC());

		r.bdg_sls_prof_amt(prof_amt);
	}

	/**
	 * 売上粗利率の計算処理
	 * @param i
	 */
	protected void setBdgSlsProfRate(int i) {
		DtlR r = getDtlL().get(i);
		MCNumber amt = r.bdg_sls_amt();
		MCNumber prof_amt = r.bdg_sls_prof_amt();
		if (isNullOr(amt, prof_amt)) {
			r.bdg_sls_prof_rate(null);
			return;
		}
		if (amt.isZero()) {
			r.bdg_sls_prof_rate(null);
			return;
		}
		MCNumber rate = prof_amt.multiply(100).divide(amt, MA_META.PER.scale(),
				MAC_RND_TYP.RNDUP.toMC());

		r.bdg_sls_prof_rate(rate);
	}

}