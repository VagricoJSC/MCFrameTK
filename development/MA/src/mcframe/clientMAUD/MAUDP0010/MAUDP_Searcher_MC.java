package mcframe.clientMAUD.MAUDP0010;

import java.io.File;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.report.MCClientReportInfoR;
import mcframe.clientCore.report.MCClientReportManager;
import mcframe.clientCore.report.MCReportJob;
import mcframe.clientCore.resource.MCConfig;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Searcher;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.commonCore.container.MCContainer;
import mcframe.clientMAUD.MAUDP0010.IfDPartsForMACaller;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class MAUDP_Searcher_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends FXBAP_Searcher<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Searcher_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void sort() {
		MCLog.write(MAUDP0157);
		super.sort();
		MCLog.write(MAUDP0158);
	}

	@Override
	protected void setupParam() {
		MCLog.write(MAUDP0110);
		super.setupParam();
		MCLog.write(MAUDP0111);
	}
	
	@Override
	protected void beforeCall() {
		MCLog.write(MAUDP0112);
		super.beforeCall();
		MCLog.write(MAUDP0113);
	}
	
	@Override
	protected void setLimitParamSize() {
		MCLog.write(MAUDP0114);
		super.setLimitParamSize();
		MCLog.write(MAUDP0115);
	}
	
	@Override
	protected boolean checkLimitULSize() {
		MCLog.write(MAUDP0166);
		boolean r = super.checkLimitULSize();
		MCLog.write(MAUDP0167);
		return r;
	}
	
	@Override
	protected boolean checkInvisibleRowInUpParam() {
		MCLog.write(MAUDP0068);
		boolean r = super.checkInvisibleRowInUpParam();
		MCLog.write(MAUDP0069);
		return r;
	}
	
	@Override
	protected void call() {
		MCLog.write(MAUDP0118);
		super.call();
		MCLog.write(MAUDP0119);
	}
	
	@Override
	protected void handleMCEx(MCException ex) {
		MCLog.write(MAUDP0120);
		super.handleMCEx(ex);
	}

	@Override
	protected void moveFocusNoDown() {
		MCLog.write(MAUDP0123);
		super.moveFocusNoDown();
		MCLog.write(MAUDP0124);
	}
	
	@Override
	protected void afterCapError() {
		MCLog.write(MAUDP0125);
		super.afterCapError();
		MCLog.write(MAUDP0126);
	}
	
	@Override
	protected void showCanceledMsg() {
		MCLog.write(MAUDP0164);
		super.showCanceledMsg();
		MCLog.write(MAUDP0165);
	}

	@Override
	protected void print() {
		MCLog.write(MAUDP0139);
		super.print();
		MCLog.write(MAUDP0140);
	}
	
	@Override
	protected void resultSuccess() {
		MCLog.write(MAUDP0141);
		super.resultSuccess();
		MCLog.write(MAUDP0142);
	}
	
	@Override
	protected void showNoDownDataMsg() {
		MCLog.write(MAUDP0147);
		super.showNoDownDataMsg();
		MCLog.write(MAUDP0148);
	}
	
	@Override
	protected void afterCall() {
		MCLog.write(MAUDP0127);
		super.afterCall();
		MCLog.write(MAUDP0128);
	}

	@Override
	protected void adjustList() {
		MCLog.write(MAUDP0131);
		super.adjustList();
		MCLog.write(MAUDP0132);
	}
	
	@Override
	protected void moveFocus() {
		MCLog.write(MAUDP0135);
		super.moveFocus();
		MCLog.write(MAUDP0136);
	}
	
	@Override
	protected MCCallBackType callPanelUpdateAction() {
		preShow();
		return super.callPanelUpdateAction();
	}

	protected void preShow() {
		if (!isDownParamEmpty()) {
			List<MCContainer> downs = getAllDownBlocks();
			for (int i = 0; i < downs.size(); i++) {
				MCContainer cont = downs.get(i);
				for (MCRootPanel parts : getRelatePartsPanels(cont)) {
					if (parts instanceof IfDPartsForMACaller) {
						IfDPartsForMACaller dParts = (IfDPartsForMACaller) parts;
						dParts.preShow(this);
					}
				}
			}
		}
	}

	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void setMode() {
		MCLog.write(MAUDP0133);
		super.setMode();
		if (panel instanceof IfOpePanel) {
			IfOpePanel p = (IfOpePanel)panel;
			String ope = p.getOpeButtonGroup().getSelectedButton().getActionCommand();
			if (p.isUPDOpe(ope)) {
				p.setUPDStatus();
			}
			else if (p.isDELOpe(ope)) {
				p.setDELStatus();
			}
			else if (p.isREFOpe(ope)) {
				p.setREFStatus();
			}
		}
		MCLog.write(MAUDP0134);
	}

	@Override
	protected void setModeNoDown() {
		MCLog.write(MAUDP0121);
		super.setModeNoDown();
		if (panel instanceof IfOpePanel) {
			((IfOpePanel)panel).setSRCHStatus();
		}
		MCLog.write(MAUDP0122);
	}

	@Override
	protected void show() {
		MCLog.write(MAUDP0129);
		super.show();
		if (panel instanceof IfOpePanel) {
			IfOpePanel p = (IfOpePanel)panel;
			String ope = p.getOpeButtonGroup().getSelectedButton().getActionCommand();
			if (p.isUPDOpe(ope)) {
				panel.opePanelFillSpace();
			}
		}
		MCLog.write(MAUDP0130);
	}
	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// ファイルダウンロード対応（ここから）
	// ///////////////////////////////////////////////

	/**
	 * ファイルダウンロード方式で検索を実行するかの設定を保持します。
	 */
	protected boolean _shouldDL;

	/**
	 * 検索からファイルダウンロードへの切替を可能とするかの設定を保持します。
	 */
	protected boolean _canDL;

	/**
	 * ファイルダウンロード方式で検索を実行します。
	 */
	public void execDL() {
		_shouldDL = true;
		exec();
	}

	/**
	 * 検索からファイルダウンロードへの切替を可能とします。
	 */
	protected void setDLMode() {
		_canDL = true;
	}

	@Override
	protected boolean beforeExecMain() {
		// インフラがボタン経由でgetMiningCaller()の呼出を行う等、
		// exec()内のイベントディスパッチスレッドチェックは通過可の想定。
		if (panel.isMining()) {
			// initCaller()内でのsetDLMode()の実行を想定。
			initCaller();
			setupParam();
			if (_canDL) {
				panel.setMiningCaller(this);
			}
			return false;
		}
		else {
			boolean ret = super.beforeExecMain();
			if (ret) {
				if (_shouldDL) {
					ret = beforeExecMainWhenShouldDL();
				}
				else if (_canDL) {
					ret = beforeExecMainWhenCanDL();
				}
			}
			return ret;
		}
	}

	@Override
	protected boolean execConfirm() {
		if (_shouldDL) {
			return true;
		}
		else {
			return super.execConfirm();
		}
	}

	/**
	 * ファイルダウンロード方式で検索を実行する場合の前処理を行います。
	 */
	protected boolean beforeExecMainWhenShouldDL() {
		File f = MCFileChooser.showSaveDialog(
				getDLInitPath(), panel, getDLAvlTypsSort());
		if (f == null) {
			return false;
		}
		param().getArgs().put(UpDLInfo.PATH, f.getPath());
		param().getArgs().put(UpDLInfo.FUNC, getDLFuncName());
		return true;
	}

	/**
	 * ファイルダウンロードの拡張子を取得します。配列の末尾のものが、初期値です。
	 */
	protected String[] getDLAvlTypsSort() {
		// 拡張子の初期値を取得する
		String fileTypDef = getDLAvlTyp();

		// 初期値として扱われるように、配列の末尾に並び替える
		ArrayList<String> typL = new ArrayList<>();
		for (String typ : CltDLInfo.getAvlTyps()) {
			if (!isSame(typ, fileTypDef)) {
				typL.add(typ);
			}
		}
		if (typL.size() != CltDLInfo.getAvlTyps().length) {
			typL.add(fileTypDef);
		}
		return typL.toArray(new String[0]);
	}

	/**
	 * 業務データIDを取得します。
	 */
	protected String getDLBziDatDlId() {
		return null;
	}

	/**
	 * 業務データ名を取得します。
	 */
	protected String getDLBziDatDlNm() {
		return null;
	}

	/**
	 * ファイルダウンロードのファイル名の初期値を取得します。
	 */
	protected String getDLInitFilename() {
		String fileNmDef = null;
		//ファイル名の初期値を取得
		if (isNull(getDLBziDatDlId())) {
			fileNmDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_SCREEN, panel.getModuleID(), panel.getScreenID(), CltDLInfo.FILE_NM));
			if (isNull(fileNmDef)) {
				fileNmDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_SCREEN, CltDLInfo.FILE_NM));
			}
		}
		else {
			fileNmDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.DWNLD, getDLBziDatDlId(), CltDLInfo.FILE_NM));
			if (isNull(fileNmDef)) {
				fileNmDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.DWNLD, CltDLInfo.FILE_NM));
			}
			if (isNull(fileNmDef)) {
				fileNmDef = "{biz_dat_dl_nm}_{timestamp}";
			}
		}
		
		if (isNull(fileNmDef)) {
			fileNmDef = getDLFuncName() + "_" + MCDate.now();
		}

		//タイムスタンプのフォーマットの取得
		String dateFormatDef =null;
		if (isNull(getDLBziDatDlId())) {
			dateFormatDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_SCREEN, CltDLInfo.TIMESTAMP_FORMAT));
		}
		else {
			dateFormatDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.DWNLD, CltDLInfo.TIMESTAMP_FORMAT));
		}
		
		if (isNull(dateFormatDef)) {
			dateFormatDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_DAT_DL, CltDLInfo.TIMESTAMP_FORMAT));
		}
		
		//置き換え前の文字列の取得
		String repBfStr = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_DAT_DL, CltDLInfo.REP_BF_STR));

		
		//置き換え後の文字列の取得
		String repAfStr = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_DAT_DL, CltDLInfo.REP_AF_STR));

		//置換処理実行
		if (!isNull(getDLBziDatDlId())) {
			fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_DAT_DL_ID, Matcher.quoteReplacement(getDLBziDatDlId()));
			if (!isNull(getDLBziDatDlNm())) {
				fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_DAT_DL_NM, Matcher.quoteReplacement(getDLBziDatDlNm()));
			}
		}
		fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_SCREEN_ID, Matcher.quoteReplacement(panel.getScreenID()));
		fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_SCREEN_NM, Matcher.quoteReplacement(panel.getScreenName()));
		if (!isNull(dateFormatDef)) {
			fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_TIMESTAMP, MCDate.now().toString(dateFormatDef));
		}
		else {
			fileNmDef = fileNmDef.replaceAll(CltDLInfo.PH_TIMESTAMP, MCDate.now().toString());
		}
		
		if (!isNull(repBfStr)) {
			fileNmDef = fileNmDef.replaceAll(repBfStr, Matcher.quoteReplacement(repAfStr));
		}

		return fileNmDef;
	}

	/**
	 * ファイルダウンロードパスの初期値を取得します。
	 */
	protected File getDLInitPath() {
		String dir = MCConfig.client.getString("beans.filechooser.initdir");
		String name = getDLInitFilename();
		return new File(dir, name);
	}

	/**
	 * ファイルダウンロード対象機能名を取得します。
	 */
	protected String getDLFuncName() {
		return panel.getScreenName();
	}

	/**
	 * ファイルダウンロードへの切替を可能として検索を実行する場合の前処理を行います。
	 */
	protected boolean beforeExecMainWhenCanDL() {
		String typ = getDLAvlTyp();
		if(isNull(typ)) {
			typ = MCConfig.client.getString(CltDLInfo.DEF_FILE_TYP, CltDLInfo.getDefTyp());
		}

		param().getArgs().put(UpDLInfo.EXT, FileInfo.SEP + typ);
		param().getArgs().put(UpDLInfo.FUNC, getDLFuncName());
		return true;
	}

	/**
	 * ファイルダウンロードのファイルのタイプの初期値を取得します。
	 * 
	 */
	protected String getDLAvlTyp() {
		String fileTypDef = null;
		if (isNull(getDLBziDatDlId())) {
			// 画面IDをもとにリソース値を取得
			fileTypDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_SCREEN, panel.getModuleID(), panel.getScreenID(), CltDLInfo.FILE_TYP));
			if (isNull(fileTypDef)) {
				fileTypDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.BIZ_SCREEN, CltDLInfo.FILE_TYP));
			}

		}
		else {
			// 業務データIDをもとにリソース値を取得
			fileTypDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.DWNLD, getDLBziDatDlId(), CltDLInfo.FILE_TYP));
			if (isNull(fileTypDef)) {
				fileTypDef = MCConst.label.getLabel(MCConst.createKey(CltDLInfo.DWNLD, CltDLInfo.FILE_TYP));
			}
		}
		for (String str : CltDLInfo.getAvlTyps()) {
			if (isSame(fileTypDef.toUpperCase(), str)) {
				return str;
			}
		}
		return null;
	}

	@Override
	protected void clear() {
		MCLog.write(MAUDP0106);
		super.clear();
		MCLog.write(MAUDP0107);
	}

	@Override
	public void execMain() {
		if (_shouldDL) {
			if (confirmRequestWhenShouldDL()) {
				requestWhenShouldDL();
			}
		}
		else if (_canDL) {
			setPrint(true);
			super.execMain();
		}
		else {
			super.execMain();
		}
	}

	/**
	 * ファイルダウンロード方式で別スレッドへの処理の依頼が確認された場合にtrueが返ります。
	 */
	protected boolean confirmRequestWhenShouldDL() {
		MCMessage msg = getConfirmRequestWhenShouldDLMsg();
		return panel.confirm(msg) == MCMessageBox.YES_OPTION;
	}

	/**
	 * ファイルダウンロード方式で別スレッドへの処理の依頼を確認するメッセージを取得します。
	 */
	protected MCMessage getConfirmRequestWhenShouldDLMsg() {
		return new MCMessage(MAUDP0401);
	}

	/**
	 * ファイルダウンロード方式で別スレッドへの処理の依頼を行います。
	 */
	protected void requestWhenShouldDL() {
		MCReportJob job = MCReportJob.createServerUp(param());
		job.setConfirmMsg(getCancelDLMsg());
		MCClientReportManager.request(job, true);
		showBackgroundDLMsg();
	}

	/**
	 * ファイルダウンロードを中断する場合のメッセージを取得します。
	 */
	protected MCMessage getCancelDLMsg() {
		return new MCMessage(MAUDP0403, getDLFuncName());
	}

	/**
	 * ファイルダウンロードをバックグラウンドで実行していることを表すメッセージを表示します。
	 */
	protected void showBackgroundDLMsg() {
		MCMessage msg = getBackgroundDLMsg();
		panel.dialog(msg);
	}

	/**
	 * ファイルダウンロードをバックグラウンドで実行していることを表すメッセージを取得します。
	 */
	protected MCMessage getBackgroundDLMsg() {
		return new MCMessage(MAUDP0402);
	}

	@Override
	protected void showMsg() {
		MCLog.write(MAUDP0137);
		MCMessage msg = getOverDownLimitMsg();
		super.showMsg();
		showOverDownLimitMsg(msg);
		MCLog.write(MAUDP0138);
	}

	/**
	 * 受信上限量の超過を表すメッセージを取得します。
	 */
	protected MCMessage getOverDownLimitMsg() {
		MCMessage ret = null;
		MCMessageList msgL = new MCMessageList();
		for (MCMessage msg : getMessages()) {
			if (isSame(msg.getID(), getOverDownLimitMsgID())) {
				msgL.add(msg);
			}
		}
		if (msgL.size() == 1) {
			ret = msgL.get(0);
			getMessages().remove(ret);
		}
		return ret;
	}

	/**
	 * 受信上限量の超過を表すメッセージのIDを取得します。
	 */
	protected String getOverDownLimitMsgID() {
		return MAUDL0405;
	}

	/**
	 * 受信上限量の超過を表すメッセージを表示します。
	 */
	protected void showOverDownLimitMsg(MCMessage msg) {
		if (msg != null) {
			Object[] binds = msg.getBindArray();
			panel.dialog(new MCMessage(MAUDP0407, binds));
		}
	}

	@Override
	protected void printSub() {
		if (_canDL) {
			if (confirmRequestWhenCanDL()) {
				requestWhenCanDL();
			}
		}
		else {
			super.printSub();
		}
	}

	/**
	 * ファイルダウンロードへの切替で別スレッドへの処理の依頼を確認するメッセージを取得します。
	 */
	protected boolean confirmRequestWhenCanDL() {
		if (isDownClientPrintDataEmpty()) {
			return false;
		}
		MCClientReportInfoR infoR = _reportInfo.get(0);
		if (confirmSwitchToDL(infoR)) {
			MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
					MAUDC_BizDatDLEnv.getDownDLInfo(infoR.option());
			String typ = FileInfo.getTyp(dlInfo.getFileName());
			File f = MCFileChooser.showSaveDialog(
					getDLInitPath(), panel, typ.toUpperCase());
			if (f == null) {
				return false;
			}
			for (MCClientReportInfoR r : _reportInfo) {
				dlInfo = MAUDC_BizDatDLEnv.getDownDLInfo(infoR.option());
				String name = FileInfo.getRevPath(
						f.getName(), dlInfo.getFileSeq());
				r.save_file_name(new File(f.getParent(), name).getPath());
			}
			return true;
		}
		return false;
	}

	/**
	 * ファイルダウンロードへの切替が確認された場合にtrueが返ります。
	 */
	protected boolean confirmSwitchToDL(MCClientReportInfoR infoR) {
		MCMessage msg = getConfirmSwitchToDLMsg(infoR);
		return panel.confirm(msg) == MCMessageBox.YES_OPTION;
	}

	/**
	 * ファイルダウンロードへの切替を確認するメッセージを取得します。
	 */
	protected MCMessage getConfirmSwitchToDLMsg(MCClientReportInfoR infoR) {
		MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
				MAUDC_BizDatDLEnv.getDownDLInfo(infoR.option());
		int lim = dlInfo.getLimRowCnt();
		String limStr = lim < 0 ? "-" : String.valueOf(lim);
		return new MCMessage(MAUDP0406, limStr, dlInfo.getTtlCnt());
	}

	/**
	 * ファイルダウンロードへの切替で別スレッドへの処理の依頼を行います。
	 */
	protected void requestWhenCanDL() {
		MCClientReportManager.request(_reportInfo);
		showBackgroundDLMsg();
	}

	@Override
	protected void resultNoDataFound() {
		MCLog.write(MAUDP0149);
		printNoDown();
		super.resultNoDataFound();
		MCLog.write(MAUDP0150);
	}

	/**
	 * 検索結果が存在しない場合の印刷処理を行います。
	 */
	protected void printNoDown() {
		if (_canDL) {
			printSub();
		}
	}

	// ///////////////////////////////////////////////
	// ファイルダウンロード対応（ここまで）
	// ///////////////////////////////////////////////

}
