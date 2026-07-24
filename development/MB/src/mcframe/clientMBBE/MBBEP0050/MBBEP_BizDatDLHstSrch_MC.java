package mcframe.clientMBBE.MBBEP0050;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.File;
import java.io.IOException;

import mcframe.clientCore.resource.MCConfig;
import mcframe.clientCore.report.MCClientReportInfoR;
import mcframe.clientCore.report.MCClientReportManager;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportType;
import mcframe.commonCore.sys.MCExec;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_BizDatDLHstSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_BizDatDLHstSrch_MC extends MBBEP_BizDatDLHstSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 出力先のキャッシュ */
	protected String _dlDir = MCConfig.client.getString("beans.filechooser.initdir");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDLHstSrch_MC() {
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
	public MBBEP_BizDatDLHstSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0050_Srch01Caller<P extends MBBEP_BizDatDLHstSrch, B extends MB_MBBEL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_running_flg, Cnd_success_flg, Cnd_download_flg, Cnd_error_flg));
			msgList.addAll(checkAtLeastOne(Cnd_excel_flg, Cnd_csv_flg, Cnd_screen_flg, Cnd_report_flg));
			msgList.addAll(checkBeforeAfter(Cnd_proc_st_tm_fr, Cnd_proc_st_tm_to));
			msgList.addAll(checkBeforeAfter(Cnd_proc_end_tm_fr, Cnd_proc_end_tm_to));
			msgList.addAll(checkBeforeAfter(Cnd_dl_tm_fr, Cnd_dl_tm_to));
			msgList.addAll(checkSmallLarge(Cnd_file_size_fr, Cnd_file_size_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

	}

	/**
	 * [MB_MBBEL0050_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0050_Del01Caller<P extends MBBEP_BizDatDLHstSrch, B extends MB_MBBEL0050_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MB_MBBEL0050_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			setFIXStatus();
		}

	}

	@Override
	public MCMessage msgDeleted() {
		return new MCMessage(FXBAP0022);
	}

	@Override
	public MCMessage msgDeleteConfirm() {
		return new MCMessage(FXBAP0005);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBEL0050_Srch01();
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
	 * Panel[Btn]のボタン[select_dir]の押下時の処理
	 */
	@Override
	public void doBtn_select_dir(MCEventInfo info) {
		File f = MCFileChooser.showSelectDirDialog(null, this);
		if (f != null) {
			setValueEx(Btn_dl_file_path, f.getAbsolutePath());
		}
	}

	/**
	 * Panel[Btn]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doBtn_dwnld(MCEventInfo info) {
		if (confirm(new MCMessage(MAUDP0401)) != MCMessageBox.YES_OPTION) {
			return;
		}
		dlFile();
	}

	/**
	 * Panel[Btn]のボタン[open_dir]の押下時の処理
	 */
	@Override
	public void doBtn_open_dir(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			return ;
		}
		if (!new File(r.dl_file_path()).exists()) {
			return ;
		}

		MCExec exec = new MCExec();
		exec.setCommand("explorer.exe " + r.dl_file_path());
		exec.execute();
	}

	/**
	 * Panel[Btn]のボタン[open_file]の押下時の処理
	 */
	@Override
	public void doBtn_open_file(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			return ;
		}
		File file = new File(r.dl_file_path(), r.dl_file_nm());
		if (!file.exists()) {
			return ;
		}

		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.open(file);
		}
		catch (IOException e) {
			dialog(new MCMessage(MABCP0020, file.getPath()));
		}
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMB_MBBEL0050_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setDlStsTyp();
		setDlFileTyp();
		setUsr();
		setDlDir();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RsltTable.setCellConfig(createRsltCellConfig());
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		setSrchStatus();
		setDlStsTyp();
		setDlFileTyp();
		setUsr();
		setDlDir();
	}

	protected void setUsr() {
		if (Cnd_ope_DL.isSelected()) {
			getCndR().usr_cd(mcframe.clientCore.sys.MCSys.user.ID());
			getCndR().usr_nm(mcframe.clientCore.sys.MCSys.user.name());
		}
		else {
			setValueEx(Cnd_usr_cd, null);
		}
	}

	protected void setDlStsTyp() {
		if (Cnd_ope_DL.isSelected()) {
			getCndR().running_flg(false);
			getCndR().success_flg(true);
			getCndR().download_flg(false);
			getCndR().error_flg(false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			getCndR().running_flg(true);
			getCndR().success_flg(true);
			getCndR().download_flg(true);
			getCndR().error_flg(true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			getCndR().running_flg(true);
			getCndR().success_flg(true);
			getCndR().download_flg(true);
			getCndR().error_flg(true);
		}
	}

	protected void setDlFileTyp() {
		if (Cnd_ope_DL.isSelected()) {
			getCndR().excel_flg(false);
			getCndR().csv_flg(true);
			getCndR().screen_flg(false);
			getCndR().report_flg(false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			getCndR().excel_flg(true);
			getCndR().csv_flg(true);
			getCndR().screen_flg(true);
			getCndR().report_flg(true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			getCndR().excel_flg(true);
			getCndR().csv_flg(true);
			getCndR().screen_flg(true);
			getCndR().report_flg(true);
		}
	}

	protected void setDlDir() {
		getBtnR().dl_file_path(Cnd_ope_DL.isSelected() ? _dlDir : null);
	}

	protected void setSrchStatus() {
		if (Cnd_ope_DL.isSelected()) {
			setSRCH_DLStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}

	protected void setRefStatus() {
		if (Cnd_ope_DL.isSelected()) {
			setDLStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		if (info.getEventIndex() < 0) {
			getRmrksR().biz_dat_rmrks1(null);
			getRmrksR().biz_dat_rmrks2(null);
			getRmrksR().biz_dat_rmrks3(null);
		}
		else {
			RsltR r = getRsltL().get(info.getEventIndex());
			getRmrksR().biz_dat_rmrks1(r.biz_dat_rmrks1());
			getRmrksR().biz_dat_rmrks2(r.biz_dat_rmrks2());
			getRmrksR().biz_dat_rmrks3(r.biz_dat_rmrks3());
		}
	}

	@Override
	public void doBtn_dl_file_path_LC(MCEventInfo info) {
		super.doBtn_dl_file_path_LC(info);
		if (!isNull(getBtnR().dl_file_path()) && new File(getBtnR().dl_file_path()).exists()) {
			_dlDir = getBtnR().dl_file_path();
		}
	}

	protected void dlFile() {
		MCList<RsltR> l = getRsltL().subList(RsltR.$check, true);
		if(!canDl(l)) {
			return ;
		}

		List<MCClientReportInfoR> infoL = new ArrayList<MCClientReportInfoR>();
		for (RsltR r : l) {
			MAUDC_BizDatDLEnv.DownDLInfo dlInfo = MAUDC_BizDatDLEnv.getDownDLInfo();
			dlInfo.setFuncName(r.biz_dat_nm());
			dlInfo.setHstNo(r.biz_dat_dl_hst_no());
			dlInfo.overWrite(false);
			dlInfo.setReqSrcId(getScreenID());

			MCReportInfoR ri = MCReportInfoR.create();
			ri.reportType(MCReportType.CLIENT_SERVER);
			ri.cartridge(CltDLInfo.CRTG);
			ri.data_file(r.file_bin());
			ri.save_file_name(new File(getBtnR().dl_file_path(), r.dl_file_nm()).getPath());
			ri.locale(getUsrLocale().toString());
			ri.print_exec(false);
			ri.save_file(true);
			ri.option(dlInfo.getParam());

			MCClientReportInfoR cri = new MCClientReportInfoR(ri);
			infoL.add(cri);
		}

		//非同期実行
		MCClientReportManager.request(infoL);

		setFIXStatus();

	}

	protected boolean canDl(MCList<RsltR> l) {
		if (l.isEmpty()) {
			dialog(new MCMessage(MAUDP0038));
			return false;
		}

		MCMessageList msgList = checkReq(getBtnR());
		if (0 < msgList.size()) {
			message(msgList);
			return false;
		}
		if (!new File(getBtnR().dl_file_path()).exists()) {
			dialog(new MCMessage(getBtnR(), BtnR.$dl_file_path, MAUDP0405, getBtnR().dl_file_path()));
			return false;
		}
		return true;
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (RsltTable == table) {
				RsltR r = getRsltL().get(index);
				if (columnRslt_check == column) {
					if (!Cnd_ope_DEL.isSelected() && !MAC_BIZ_DAT_DL_STS_TYP.isSUCCESS(r.biz_dat_dl_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}