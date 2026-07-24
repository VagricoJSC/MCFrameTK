package mcframe.clientPFBZ.PFBZP0010;

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
import static mcframe.commonPF.notice.PF_Msg.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;
import javax.swing.JComponent;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"PFBZP_SendIfSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class PFBZP_SendIfSrch_MC extends PFBZP_SendIfSrch_MC_A implements MCResultViewerNoParam {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// MsgのキャッシュとMsgテーブルの更新
	protected Map<DtlR, MCList<BatchLogMsgR>> _msgLCache;

	/**
	 * 種別：変換(CNV) を表す値
	 */
	protected String CNV;

	/**
	 * 種別：送信取消(DEL) を表す値
	 */
	protected String DEL;

	/**
	 * 種別：新規(UPD) を表す値
	 */
	protected String UPD;

	/**
	 * 表示単位：明細(DTL) を表す値
	 */
	protected String DTL;

	/**
	 * 表示単位：ファイル(FLE) を表す値
	 */
	protected String FLE;

	/**
	 * 検索結果を格納<br>
	 * （表示単位が「ファイル」のときのみ使用）
	 */
	protected MCList<DtlR> _orgL = MCList.create(DtlR.class);
	
	/**
	 * _orgLに対するINDEX（file_id, seq）を格納<br>
	 * （表示単位が「ファイル」のときのみ使用）
	 */
	protected MCIndexKey _idx = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public PFBZP_SendIfSrch_MC() {
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
	public PFBZP_SendIfSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * MCResultViewerの実装
	 * 
	 * サーバ処理確認画面からの画面遷移対応
	 */
	@Override
	public boolean notificationResultInfo(MCResultInfo info) {
		//検索処理を実行させるために別インスタンスで表示する。
		showPFBZP0010(info);
		return false;
	}

	protected void showPFBZP0010(MCResultInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("PF", "PFBZP0010");
		setupPFBZP0010AsoParam(aso, info);
		aso.show();
	}

	protected void setupPFBZP0010AsoParam(MAUCP_AppScreenOpener aso, MCResultInfo info) {
		aso.putCnd(crtOpenPFBZP0010CndR(aso, info), crtOpenPFBZP0010CndRNullCols(aso, info));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected List<String> crtOpenPFBZP0010CndRNullCols(MAUCP_AppScreenOpener aso,
			MCResultInfo info) {
		return null;
	}

	protected mcframe.clientPFBZ.PFBZP0010.CndR crtOpenPFBZP0010CndR(
			MAUCP_AppScreenOpener aso, MCResultInfo info) {
		mcframe.clientPFBZ.PFBZP0010.CndR to = mcframe.clientPFBZ.PFBZP0010.CndR.create();
		to.ins_srv_req_no(info.srvReqNo());
		to.send_ok_flg(true);
		return to;
	}

	
	/**
	 * [PF_PFBZL0010_Srch01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0010_Srch01Caller<P extends PFBZP_SendIfSrch, B extends PF_PFBZL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected PF_PFBZL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			
			addDownContainer(getMsgL(), getMsgAreaR());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(KndPanel));
			msgList.addAll(checkSmallLarge(Cnd_data_no_fr, Cnd_data_no_to));
			msgList.addAll(checkBeforeAfter(Cnd_ins_ts_fr, Cnd_ins_ts_to));
			msgList.addAll(checkBeforeAfter(Cnd_sdrv_tm_fr, Cnd_sdrv_tm_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt1_fr, Cnd_attr_dt1_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt2_fr, Cnd_attr_dt2_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt3_fr, Cnd_attr_dt3_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt4_fr, Cnd_attr_dt4_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt5_fr, Cnd_attr_dt5_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm1_fr, Cnd_attr_tm1_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm2_fr, Cnd_attr_tm2_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm3_fr, Cnd_attr_tm3_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm4_fr, Cnd_attr_tm4_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm5_fr, Cnd_attr_tm5_to));
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			for (DtlR dtlR : bridge.down0()) {
				dtlR.send_flg(!dtlR.not_send_flg());
			}
		}

		@Override
		protected void show() {
			super.show();

			// 表示単位：ファイル用に退避
			_orgL.setAll(getDtlL());
			_idx = _orgL.createIndex(DtlR.$file_id);

			showFileInfo();
		}

		@Override
		protected void setMode() {
			super.setMode();
			changeStatus(getCndR().mode_val(), getCndR().disp_val());
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			changeStatus(getCndR().mode_val(), getCndR().disp_val());
		}

	}

	/**
	 * [PF_PFBZL0010_Srch02]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0010_Srch02Caller<P extends PFBZP_SendIfSrch, B extends PF_PFBZL0010_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected PF_PFBZL0010_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [PF_PFBZL0010_Upd01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0010_Upd01Caller<P extends PFBZP_SendIfSrch, B extends PF_PFBZL0010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected PF_PFBZL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(PFBZP0004);
		}

		@Override
		public MCMessage msgUpdated() {
			return new MCMessage(PFBZP0005);
		}

		@Override
		public MCMessage msgNoUpdateData() {
			return new MCMessage(PFBZP0006);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getDtlL().subList(DtlR.$chk_flg, true));
		}

	}

	/**
	 * [PF_PFBZL0010_Conv01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0010_Conv01Caller<P extends PFBZP_SendIfSrch, B extends PF_PFBZL0010_Conv01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected PF_PFBZL0010_Conv01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(PFBZP0001);
		}

		@Override
		public MCMessage msgUpdated() {
			return new MCMessage(PFBZP0002);
		}

		@Override
		public MCMessage msgNoUpdateData() {
			return new MCMessage(PFBZP0003);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getDtlL().subList(DtlR.$chk_flg, true));
		}

	}

	/**
	 * [PF_PFBZL0010_Del01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0010_Del01Caller<P extends PFBZP_SendIfSrch, B extends PF_PFBZL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected PF_PFBZL0010_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(PFBZP0007);
		}

		@Override
		public MCMessage msgDeleted() {
			return new MCMessage(PFBZP0008);
		}

		@Override
		public MCMessage msgNoDeleteData() {
			return new MCMessage(PFBZP0009);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			bridge.up0().clear();
			for (DtlR dtlR : getDtlL().subList(DtlR.$chk_flg, true)) {
				if (isNull(dtlR.file_id())) {
					bridge.up0().add(dtlR);
				}
				else {
					bridge.up0().addAll(_orgL.subList(_idx, dtlR.toArray(_idx.getKeys())));
				}
			}
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callPF_PFBZL0010_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_chk_flg, true);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_chk_flg, false);
	}

	/**
	 * Panel[Btn]のボタン[send_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_send_select_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_send_flg, true);
	}

	/**
	 * Panel[Btn]のボタン[send_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_send_deselect_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_send_flg, false);
	}

	/**
	 * Panel[Btn]のボタン[not_send_upd_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_not_send_upd_select_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_not_send_upd_flg, true);
	}
	/**
	 * Panel[Btn]のボタン[not_send_upd_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_not_send_upd_deselect_all(MCEventInfo info) {
		setCheckBoxValue(columnDtl_not_send_upd_flg, false);
	}
	/**
	 * Panel[Btn]のボタン[conv]の押下時の処理
	 */
	@Override
	public void doBtn_conv(MCEventInfo info) {
		callPF_PFBZL0010_Conv01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callPF_PFBZL0010_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callPF_PFBZL0010_Del01();
	}

	/**
	 * チェックボックスに値を設定します
	 * 
	 * @param col
	 * @param value
	 */
	protected void setCheckBoxValue(MCColumnConfig col, boolean value) {
		for (DtlR row : DtlTable.getViewRows()) {
			if (isEditable(col, row.getGUIIndex())) {
				setValueEx(col, row.getGUIIndex(), value);
			}
		}
	}

	@Override
	protected void customInit() {
		super.customInit();
		CNV = Cnd_mode_val_CNV.getActionCommand();
		DEL = Cnd_mode_val_DEL.getActionCommand();
		UPD = Cnd_mode_val_UPD.getActionCommand();
		DTL = Cnd_disp_val_DTL.getActionCommand();
		FLE = Cnd_disp_val_FLE.getActionCommand();
	}

	public boolean isCNV_D(String scrMode, String dispMode) {
		return isSame(scrMode, CNV) && isSame(dispMode, DTL);
	}
	public boolean isCNV_F(String scrMode, String dispMode) {
		return isSame(scrMode, CNV) && isSame(dispMode, FLE);
	}
	public boolean isDEL(String scrMode) {
		return isSame(scrMode, DEL);
	}
	public boolean isUPD(String scrMode) {
		return isSame(scrMode, UPD);
	}
	public boolean isDTL(String dispMode) {
		return isSame(dispMode, DTL);
	}
	public boolean isFLE(String dispMode) {
		return isSame(dispMode, FLE);
	}

	@Override
	public boolean doCnd_mode_val_VC(MCEventInfo info) {
		if (getStatus() != FIX_U
		 && getStatus() != FIX_D
		 && !isStatusNone(getDtlL())) {
			 return confirmRegDataClear();
		}
		return super.doCnd_mode_val_VC(info);	
	}

	@Override
	public void doCnd_mode_val_NC(MCEventInfo info) {
		getDtlL().clear();
		_orgL.clear();
		getMsgL().clear();
		getMsgAreaR().clear();
		changeStsValue((String)info.getNewValue());
		changeStatus((String)info.getNewValue(), getCndR().disp_val());
	}

	@Override
	public void doCnd_disp_val_NC(MCEventInfo info) {
		changeStatus(getCndR().mode_val(), (String)info.getNewValue());
		showFileInfo();
	}

	@Override
	public void doCnd_ins_ts_to_NC(MCEventInfo info){
		super.doCnd_ins_ts_to_NC(info);
		MCTimestamp ts = (MCTimestamp)info.getNewValue();
		if (!isNull(getCndR().ins_ts_to())) {
			getCndR().ins_ts_to(ts.addMilliSecond(999));
		}
	}

	@Override
	public void doCnd_sdrv_tm_to_NC(MCEventInfo info){
		super.doCnd_sdrv_tm_to_NC(info);
		MCDate ts = (MCDate)info.getNewValue();
		if (!isNull(getCndR().sdrv_tm_to())) {
			getCndR().sdrv_tm_to(ts.addSecond(59));
		}
	}

	@Override
	public void doDtl_send_flg_NC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		dtlR.not_send_flg(!dtlR.send_flg());
		dtlR.chk_flg(true);	// 更新対象にする
	}

	@Override
	public void doDtl_not_send_upd_flg_NC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		dtlR.chk_flg(true);	// 更新対象にする
	}
	@Override
	public void doDtl_rmrks_t_NC(MCEventInfo info){
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		dtlR.chk_flg(true);	// 更新対象にする
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().notyet_flg(true);
		getCndR().send_conv_err_flg(true);
		getCndR().send_conv_ok_flg(true);
		getCndR().send_err_flg(true);
		getCndR().send_ok_flg(false);	// デフォルトOFF

		setValueEx(Filter_disp_warn, true);
		setValueEx(Filter_disp_not_warn, true);
		setValueEx(Filter_disp_start_log, true);
		setValueEx(Filter_disp_data_log, true);
		setValueEx(Filter_disp_proc_log, true);
		setValueEx(Filter_disp_end_log, true);
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(openTyp, T1)) {
			String batchLogNo = bind.getStringNE("batch_log_no");
			if (!isNull(batchLogNo)) {
				MCTextField comp = getBatchLogNoBeans();
				if (comp != null) {
					setValueEx(comp, batchLogNo);
					valueInit();
					getCndR().send_ok_flg(true);
					callPF_PFBZL0010_Srch01();
				}
			}
		}
	}

	protected MCTextField getBatchLogNoBeans() {
		JComponent comp = getComponent(getCndR(), "batch_log_no");
		if (comp instanceof MCTextField) {
			return (MCTextField) comp;
		}
		return null;
	}

	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlTable.addSortColumn(columnDtl_if_proc_typ, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_ext_sys_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_data_no, SortType.ASC);
	}


	protected void changeStatus(String scrMode, String dispMode) {
		if (isCNV_D(scrMode, dispMode)) {
			setCNV_DStatus();
		}
		else if (isCNV_F(scrMode, dispMode)) {
			setCNV_FStatus();
		}
		else if (isDEL(scrMode)) {
			setDELStatus();
		}
		else {
			setUPDStatus();
		}
		
		if (getDtlL().isEmpty()) {
			if (isDEL(scrMode)) {
				Btn_del.setMode(MCMode.DISABLE);
			}
			else {
				Btn_conv.setMode(MCMode.DISABLE);
			}
			Btn_select_all.setMode(MCMode.DISABLE);
			Btn_deselect_all.setMode(MCMode.DISABLE);
			Btn_send_select_all.setMode(MCMode.DISABLE);
			Btn_send_deselect_all.setMode(MCMode.DISABLE);
			Btn_upd.setMode(MCMode.DISABLE);
		}
	}
	
	protected void changeStsValue(String scrMode) {

		boolean isDel = isDEL(scrMode);

		CndR cndR = getCndR();
		cndR.notyet_flg(!isDel);
		cndR.send_conv_err_flg(!isDel);
		cndR.send_conv_ok_flg(true);
		cndR.send_err_flg(!isDel);
		cndR.send_ok_flg(isDel);
		cndR.disp_val(isDel ? FLE : DTL);
	}
	
	protected void showFileInfo() {

		if (_orgL.isEmpty()) {
			return;
		}

		if (!isFLE(getCndR().disp_val())) {
			setDtlL(_orgL);
		}
		else {
			getDtlL().clear();
			for (DtlR grpR : _orgL.groupBy(_idx.getKeys())) {
				if (isNull(grpR.file_id())) {
					getDtlL().addAll(_orgL.subList(_idx, grpR.toArray(_idx.getKeys())));
				}
				else {
					getDtlL().add(_orgL.getFirst(_idx, grpR.toArray(_idx.getKeys())));
				}
			}
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setCNV_DStatus() {
		super.setCNV_DStatus();
		if (getDtlL().size() > 0) {
			Ctrl_ctrl_PPanel.expand(false);
			DtlTable.selectLeftmostColumn(0);
		}
	}

	@Override
	public void setCNV_FStatus() {
		super.setCNV_FStatus();
		if (getDtlL().size() > 0) {
			Ctrl_ctrl_PPanel.expand(false);
			DtlTable.selectLeftmostColumn(0);
		}
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		if (getDtlL().size() > 0) {
			Ctrl_ctrl_PPanel.expand(false);
			DtlTable.selectLeftmostColumn(0);
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		if (getDtlL().size() > 0) {
			Ctrl_ctrl_PPanel.expand(false);
			DtlTable.selectLeftmostColumn(0);
		}
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		// FIXステータスではフォーカスを飛ばさない
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		// FIXステータスではフォーカスを飛ばさない
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected DtlTableCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	protected class DtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
	
			CndR cndR = getCndR();
			DtlR dtlR = getDtlL().get(index);
			if (column == columnDtl_chk_flg) {
				if (isDEL(cndR.mode_val())
					&& !MAC_SDRV_STS_TYP.isSEND_CONV_OK(dtlR.sdrv_sts_typ())
					&& !MAC_SDRV_STS_TYP.isSEND_OK(dtlR.sdrv_sts_typ())
					|| isCNV_D(cndR.mode_val(), cndR.disp_val())
				 	&& (!dtlR.send_flg()
					 || !execCallSendIf(dtlR)
					 || (isNull(dtlR.file_io_ope()) && isNull(dtlR.web_api_ope())&& isNull(dtlR.cmd_exec_ope())))) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_send_flg
			 && !execCallSendIf(dtlR)) {
				return MCMode.READ_ONLY;
			}
			if (column == columnDtl_rmrks_t
			 && MAC_SDRV_STS_TYP.isSEND_OK(dtlR.sdrv_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected boolean execCallSendIf(DtlR dtlR) {
		return MAC_SDRV_STS_TYP.isNOTYET(dtlR.sdrv_sts_typ())	
			|| MAC_SDRV_STS_TYP.isSEND_CONV_ERR(dtlR.sdrv_sts_typ())
			|| MAC_SDRV_STS_TYP.isSEND_ERR(dtlR.sdrv_sts_typ());
	}

	// Msgを選択した時にメッセージエリアを更新する
	@Override
	public void doMsg_NC(MCEventInfo info) {
		super.doMsg_NC(info);
		updateMsgArea();
	}

	protected void updateMsgArea() {
		MCTextArea ta = MsgArea_msg;
		if (ta == null) {
			return;
		}
		BatchLogMsgR r = MsgTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}
		String v = null;
		v = r.msg_txt();
		ta.setValue(v);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_data_log_NC(MCEventInfo info) {
		super.doFilter_disp_data_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());

	}

	@Override
	public void doFilter_disp_start_log_NC(MCEventInfo info) {
		super.doFilter_disp_start_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_proc_log_NC(MCEventInfo info) {
		super.doFilter_disp_proc_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_end_log_NC(MCEventInfo info) {
		super.doFilter_disp_end_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_warn_NC(MCEventInfo info) {
		super.doFilter_disp_warn_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_not_warn_NC(MCEventInfo info) {
		super.doFilter_disp_not_warn_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	protected Map<DtlR, MCList<BatchLogMsgR>> msgLCache() {
		if (_msgLCache == null) {
			_msgLCache = new HashMap<DtlR, MCList<BatchLogMsgR>>();
		}
		return _msgLCache;
	}

	protected void updateMsgL(MCList<DtlR> cnds) {
		BatchLogMsgR selected = MsgTable.getSelectedMCRow();

		// クリア
		getMsgL().clear();
		getMsgAreaR().clear();

		// チェック
		if (cnds == null || cnds.isEmpty()) {
			return;
		}

		Map<DtlR, MCList<BatchLogMsgR>> cache = msgLCache();
		MCList<DtlR> noCache = MCList.create(DtlR.class);
		MCList<BatchLogMsgR> msgs = MCList.create(BatchLogMsgR.class);

		// キャッシュから取得
		for (DtlR cnd : cnds) {
			if (cache.containsKey(cnd)) {
				msgs.addAll(cache.get(cnd));
			}
			else {
				noCache.add(cnd);
			}
		}
		// 検索
		if (!noCache.isEmpty()) {
			MCList<BatchLogMsgR> blm = doSrch(noCache);
			Map<DtlR, MCList<BatchLogMsgR>> m;
			m = toMap(noCache, blm);
			cache.putAll(m);
			for (MCList<BatchLogMsgR> l : m.values()) {
				msgs.addAll(l);
			}
		}

		msgs = filter(msgs);

		// 結果をセット
		getMsgL().setAll(msgs);
		sort(MsgTable);
		MsgTable.adjustWidth();

		if (getMsgL().size() > 0) {
			int newIndex = -1;
			if (selected != null && !isNull(selected.batch_log_no())
					&& !isNull(selected.seq())) {
				String[] keys = MsgTable.getSortColumns();
				if (keys == null || keys.length == 0) {
					keys = new String[] {
							BatchLogMsgR.$batch_log_no, BatchLogMsgR.$seq
					};
				}

				int i = 0;
				while (i < getMsgL().size()) {
					BatchLogMsgR tarRow = getMsgL().get(i);
					int matchCnt = 0;
					for (int j = 0; j < keys.length; j++) {
						Comparable tarVal = tarRow.getValue(keys[j]);
						Comparable slctVal = selected.getValue(keys[j]);
						if (tarVal == null && slctVal == null) {
							matchCnt++;
						}
						else if (tarVal.compareTo(slctVal) >= 0) {
							matchCnt++;
						}
						if (matchCnt >= keys.length) {
							newIndex = i;
							break;
						}
					}
					if (newIndex >= 0) {
						break;
					}
					i++;
				}
			}
			if (newIndex < 0) {
				MsgTable.selectRowNoFocus(getMsgL().size() - 1);
			}
			else {
				MsgTable.selectRowNoFocus(newIndex);
			}
		}
	}

	protected MCList<BatchLogMsgR> doSrch(MCList<DtlR> cnds) {
		if (cnds == null || cnds.isEmpty()) {
			return null;
		}
		MCList<BatchLogKeyR> keys = MCList.create(BatchLogKeyR.class);
		for (DtlR cnd : cnds) {
			BatchLogKeyR key = BatchLogKeyR.create();
			key.batch_log_no(cnd.batch_log_no());
			keys.add(key);
		}
		
		return _read(keys);
	}

	protected MCList<BatchLogMsgR> _read(MCList<BatchLogKeyR> keys) {
		if (keys == null || keys.isEmpty()) {
			MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);
			return ret;
		}
		MCParam p = new MCParam(PDef.PF_PFBZL0010_Srch02_INFO);

		MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);

		p.addUpBlock(keys);
		p.addDownBlock(ret);
		createCaller(p).exec();

		return ret;
	}

	private mcframe.clientCore.requester.MCCaller createCaller(MCParam p) {
		return new mcframe.clientCore.requester.MCCaller(p);
	}

	protected Map<DtlR, MCList<BatchLogMsgR>> toMap(MCList<DtlR> keys,
			MCList<BatchLogMsgR> values) {
		
		Map<DtlR, MCList<BatchLogMsgR>> ret = new HashMap<>();
		if (isNull(values)) {
			for (DtlR key : keys) {
				ret.put(key, null);
			}
		}
		MCJoinKey<MCList<BatchLogMsgR>> jk;
		jk = keys.join(DtlR.$batch_log_no, values, BatchLogMsgR.$batch_log_no);
		for (DtlR key : keys) {
			ret.put(key, key.getJoined(jk));
		}
		return ret;
	}

	protected MCList<BatchLogMsgR> filter(MCList<BatchLogMsgR> list) {
		MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);
		if (isNull(list)) {
			return ret;
		}
		for (BatchLogMsgR r : list) {
			if (filter_msgLvl(r)) {
				if (filter_batchLogTyp(r)) {
					ret.add(r);
				}
			}
		}
		return ret;
	}

	/**
	 * @param r 対象行
	 * @return 対象行を表示する場合 true
	 */
	protected boolean filter_msgLvl(BatchLogMsgR r) {
		if (r == null) {
			return false;
		}
		if (isNull(r.msg_lvl())) {
			return true;
		}
		FilterR f = getFilterR();
		if (f.disp_not_warn() && f.disp_warn()) {
			return true;
		}
		if (isWarn(r)) {
			return f.disp_warn();
		}
		else {
			return f.disp_not_warn();
		}
	}

	protected Map<String, Boolean> _map_msglvl_warn;

	protected Map<String, Boolean> map_msglvl_warn() {
		if (_map_msglvl_warn == null) {
			_map_msglvl_warn = new HashMap<String, Boolean>();
			for (MCMessageLevel lvl : MCMessageLevel.values()) {
				String lvlStr = lvl.name().substring(0, 1);
				boolean isWarn = (MCMessageLevel.WARN.compareTo(lvl) <= 0);
				_map_msglvl_warn.put(lvlStr, isWarn);
			}
		}
		return _map_msglvl_warn;
	}

	protected boolean isWarn(BatchLogMsgR r) {
		if (r.msg_lvl() == null) {
			return true;
		}
		return map_msglvl_warn().get(r.msg_lvl());
	}

	/**
	 * @param r 対象行
	 * @return 対象行を表示する場合 true
	 */
	protected boolean filter_batchLogTyp(BatchLogMsgR r) {
		if (r == null) {
			return false;
		}
		MAC_BATCH_LOG_TYP type = MAC_BATCH_LOG_TYP.getNE(r.batch_log_typ());
		if (type == null) {
			return true;
		}
		FilterR f = getFilterR();
		if (MAC_BATCH_LOG_TYP.isSTART_LOG(type)) {
			return f.disp_start_log();
		}
		if (MAC_BATCH_LOG_TYP.isDATA_LOG(type)) {
			return f.disp_data_log();
		}
		if (MAC_BATCH_LOG_TYP.isPROC_LOG(type)) {
			return f.disp_proc_log();
		}
		if (MAC_BATCH_LOG_TYP.isEND_LOG(type)) {
			return f.disp_end_log();
		}
		return true;
	}

}