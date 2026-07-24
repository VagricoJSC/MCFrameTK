package mcframe.clientMBBE.MBBEP0090;

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


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.commonCore.report.MCExcelFile;
import mcframe.clientCore.requester.MCDownloader;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.FileInfo;
import static mcframe.commonFS.notice.FS_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_BulkImpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_BulkImpReg_MC extends MBBEP_BulkImpReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 入力ディレクトリのキャッシュ */
	protected String _cacheInDir = null;
	/** 出力ディレクトリ */
	protected String _outDir = null;
	/** 実行開始時間 （画面遷移用）*/
	protected MCDate _startDt = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BulkImpReg_MC() {
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
	public MBBEP_BulkImpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Srch01Caller<P extends MBBEP_BulkImpReg, B extends MB_MBBEL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			setFileNm();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setStatusForUpd();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatusForSrch();
		}

	}

	/**
	 * [MB_MBBEL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Upd01Caller<P extends MBBEP_BulkImpReg, B extends MB_MBBEL0090_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0090_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void call() {
			_startDt = MCDate.now();
			super.call();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			getCnd2R().ins_only_flg(Cnd2_proc_typ_INS.isSelected());
			getCnd2R().remake_flg(Cnd2_proc_typ_DELINS.isSelected());
			getCnd2R().crud_flg(Cnd2_proc_typ_CRUD.isSelected());
			getCnd2R().err_continue_flg(Cnd2_err_typ_SKIP.isSelected());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if(msgList.isEmpty()) {
				MCList<DtlR> chkL = (MCList<DtlR>)getCheckedRows(panel);
				panel.checkForCallStackCom(msgList, chkL);
			}
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			getCheckedRows(panel).setDate(DtlR.$start_dt, _startDt);
		}

	}

	/**
	 * [MB_MBBEL0090_Upd02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Upd02Caller<P extends MBBEP_BulkImpReg, B extends MB_MBBEL0090_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0090_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void call() {
			_startDt = MCDate.now();
			super.call();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			getCnd2R().ins_only_flg(Cnd2_proc_typ_INS.isSelected());
			getCnd2R().remake_flg(Cnd2_proc_typ_DELINS.isSelected());
			getCnd2R().crud_flg(Cnd2_proc_typ_CRUD.isSelected());
			//チェックのみの場合は強制true
			getCnd2R().err_continue_flg(true);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if(msgList.isEmpty()) {
				MCList<DtlR> chkL = (MCList<DtlR>)getCheckedRows(panel);
				panel.checkForCallStackCom(msgList, chkL);
			}
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			getCheckedRows(panel).setDate(DtlR.$start_dt, _startDt);
		}

	}

	/**
	 * [MB_MBBEL0090_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Prnt01Caller<P extends MBBEP_BulkImpReg, B extends MB_MBBEL0090_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0090_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean execConfirm() {
			//beforeExecMainで実行
			return true;
		}

		@Override
		protected boolean beforeExecMain() {
			if (super.beforeExecMain()) {
				return beforeExecMainSub();
			}
			return false;
		}

		/** 出力ディレクトリの指定、ファイルの上書確認 */
		protected boolean beforeExecMainSub() {
			File f = MCFileChooser.showSelectDirDialog(null, panel);
			if (f == null) {
				return false;
			}
			_outDir = f.getPath();
			if(!checkFileOverWride((MCList<DtlR>)getCheckedRows(panel))) {
				return false;
			}
			return execConfirmCustom();
		}

		protected boolean execConfirmCustom() {
			if(panel.confirm(new MCMessage(MAUDP0401)) != MCMessageBox.YES_OPTION){
				return false;
			}
			return true;
		}

		@Override
		protected void show() {
			super.show();
			dlFile();
		}

		/** サーバに出力されたファイルをダウンロードする */
		protected void dlFile() {
			MCList<DtlR> dlTgtL = bridge.down0().subList(r -> !isNull(r.file_path()));
			for (DtlR r: dlTgtL) {
				DtlR dtlR = bridge.up0().getFirst(DtlR.$table_id, r.table_id());
				if(dtlR != null) {
					r.file_nm(dtlR.file_nm());
				}
			}

			if(!dlTgtL.isEmpty()) {
				panel.dlFile(dlTgtL);
			}
		}

		@Override
		protected void showEndMsg() {
			//dlFile()で出力
		}

	}

	/**
	 * [MB_MBBEL0090_Prnt02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Prnt02Caller<P extends MBBEP_BulkImpReg, B extends MB_MBBEL0090_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0090_Prnt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void call() {
			_startDt = MCDate.now();
			super.call();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);
		}

		@Override
		protected void showDownMsg() {
			MCMessageList msgList = getMessages();
			panel.sortMessageList(msgList);
			msgList.add(new MCMessage(MBBEP0011));
			msgList.add(0, msgUpdatedWithMessages());
			panel.messageNoSort(msgList);
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			getCheckedRows(panel).setDate(DtlR.$start_dt, _startDt);
		}

	}

	/** 登録処理の共通チェック処理 */
	protected void checkForCallStackCom(MCMessageList msgList, MCList<DtlR> chkL) {
		try {
			//ファイルのエンコード待ち
			MCBeansUtil.setMouseCursorWait();
			checkFile(msgList, chkL);
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBEL0090_Srch01();
	}

	/**
	 * Panel[Cnd2]のボタン[select_dir]の押下時の処理
	 */
	@Override
	public void doCnd2_select_dir(MCEventInfo info) {
		File f = MCFileChooser.showSelectDirDialog(null, this);
		if (f != null) {
			setValueEx(Cnd2_dir,f.getAbsolutePath());
		}
	}

	/**
	 * Panel[Btn]のボタン[open_FSBGP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_FSBGP0160(MCEventInfo info) {
		// バッチログ確認
		createBatchLogScreenOpener().show();
	}

	/** バッチログ確認への画面遷移情報 */
	protected MAUCP_AppScreenOpener createBatchLogScreenOpener() {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("FS", "FSBGP0160");
		mcframe.clientFSBG.FSBGP0160.CndR cnd = mcframe.clientFSBG.FSBGP0160.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if(r != null && !isNull(r.start_dt())) {
			cnd.start_ts_fr(MCTimestamp.valueOf(r.start_dt()));
		}

		so.putCnd(cnd);
		so.runValueInit();
		if(!isNull(cnd.start_ts_fr())) {
			so.putSearchAction();	
		}

		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_FSBGP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_FSBGP0140(MCEventInfo info) {
		// サーバ処理確認
		createSeverProcScreenOpener().show();
	}

	/** サーバ処理確認への画面遷移情報 */
	protected MAUCP_AppScreenOpener createSeverProcScreenOpener() {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("FS", "FSBGP0140");
		mcframe.clientFSBG.FSBGP0140.CndR cnd = mcframe.clientFSBG.FSBGP0140.CndR.create();
		cnd.call_pg_id(this.getScreenID());
		DtlR r = DtlTable.getSelectedMCRow();
		if(r != null) {
			cnd.start_dt_fr(r.start_dt());
		}

		so.putCnd(cnd);
		so.runValueInit();
		if(!isNull(cnd.start_dt_fr())) {
			so.putSearchAction();	
		}

		return so;
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBEL0090_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_chk]の押下時の処理
	 */
	@Override
	public void doBtn_upd_chk(MCEventInfo info) {
		callMB_MBBEL0090_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[prnt_fmt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_fmt(MCEventInfo info) {
		callMB_MBBEL0090_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[prnt_dat]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dat(MCEventInfo info) {
		callMB_MBBEL0090_Prnt02();
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setFocus();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		valueInitDataStartRow();
	}
	
	protected void valueInitDataStartRow() {
		if (Cnd2_file_ext_typ_XLSX.isSelected()) {
			setValueEx(Cnd2_data_start_row, getDefaultDataStartLine());
		}
		else {
			setValueEx(Cnd2_data_start_row, null);
		}
	}
	
	protected void setModeDataStartRow() {
		if (Cnd2_file_ext_typ_XLSX.isSelected()) {
			if (!isEditable(Cnd2_data_start_row)) {
				Cnd2_data_start_row.setMode(MCMode.ENABLE);
			}
		}
		else {
			if (isEditable(Cnd2_data_start_row)) {
				Cnd2_data_start_row.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	protected MCNumber getDefaultDataStartLine() {
		String val = getSysParm("BULK_IMP_ROW_NUM");
		if (!isNull(val)) {
			try {
				int i = Integer.parseInt(val);
				if (i >= 3) {
					return MCNumber.valueOf(i);
				}
			}
			catch (NumberFormatException ex) {
				// nullとみす
			}
		}
		return null;
	}

	// ///////////////////// Validation Change ////////////////////////////////
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getDtlL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	// ///////////////////// Notification Change //////////////////////////////
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getDtlL());
		setStatusForSrch();

		if(!isInFileStatus()) {
			getCnd2R().dir(null);
		}
		else if(isNull(getCnd2R().dir())) {
			getCnd2R().dir(_cacheInDir);
		}
	}

	@Override
	public void doCnd2_dir_NC(MCEventInfo info){
		super.doCnd2_dir_NC(info);
		if(!isNull(getCnd2R().dir())) {
			_cacheInDir = getCnd2R().dir();
		}
	}

	@Override
	public void doCnd2_file_ext_typ_NC(MCEventInfo info){
		super.doCnd2_file_ext_typ_NC(info);
		setFileNm();
		valueInitDataStartRow();
		setModeDataStartRow();
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info){
		super.doDtl_check_NC(info);

		int idx = info.getEventIndex();
		if (!Cnd_ope_CHK.isSelected()
				|| idx < 0
				|| !(boolean)info.getNewValue()) {
			return;
		}
		DtlR r = getDtlL().get(idx);
		for(DtlR o: getDtlL()) {
			if(o.check() & !isSame(o, r)) {
				o.check(false);
				//break;
			}
		}
	}

	// ///////////////////// Status ///////////////////////////////////////////
	/** 検索前ステータスに設定する */
	protected void setStatusForSrch() {
		if (Cnd_ope_CHK.isSelected()) {
			setSRCH_CHKStatus();
		}
		else if (Cnd_ope_PR_FMT.isSelected()) {
			setSRCH_FMTStatus();
		}
		else if (Cnd_ope_PR_DAT.isSelected()) {
			setSRCH_DATStatus();
		}
		else {
			setSRCHStatus();
		}
		setModeDataStartRow();

		setFocus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータスに設定する */
	protected void setStatusForUpd() {
		if (Cnd_ope_CHK.isSelected()) {
			setUPD_CHKStatus();
		}
		else if (Cnd_ope_PR_FMT.isSelected()) {
			setPRNT_FMTStatus();
		}
		else if (Cnd_ope_PR_DAT.isSelected()) {
			setPRNT_DATStatus();
		}
		else {
			setUPDStatus();
		}
		setModeDataStartRow();

		setFocus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 更新(検索後)ステータスであるかどうかを返す */
	protected boolean isRegStatus() {
		return isSame(getStatus(), UPD)
				|| isSame(getStatus(), UPD_CHK)
				|| isSame(getStatus(), PRNT_FMT)
				|| isSame(getStatus(), PRNT_DAT);
	}

	/** ファイル入力系ステータスであるかどうかを返す */
	protected boolean isInFileStatus() {
		return isSame(getStatus(), SRCH)
				|| isSame(getStatus(), SRCH_CHK)
				|| isSame(getStatus(), UPD)
				|| isSame(getStatus(), UPD_CHK);
	}

	/** 一覧があれば１行目、なければ検索枠の入力可項目にフォーカスする */
	protected void setFocus() {
		if (!getDtlL().isEmpty()) {
			DtlTable.selectLeftmostColumn(0);
		}
		else {
			FoldPanel.focusFirstComponent();
		}
	}

	// ///////////////////// File関連 ///////////////////////////////////////////
	/** 指定されたファイル（サーバ側パス）のダウンロードを実行する */
	protected void dlFile(MCList<DtlR> fileL) {
		MCMessageList mL = new MCMessageList();
		File dir = new File(_outDir);
		for(DtlR r : fileL){
			MCDownloader dl = new MCDownloader(MCBinary.valueOf(r.file_path()));
			try {
				dl.exec(dir, r.file_nm());
			}
			catch (MCException e) {
				MCLog.write(e);
				mL.add(new MCMessage(FSBHC0024, dir.getAbsolutePath(), r.file_path()));
			}
		}
		if (mL.isEmpty()) {
			dialog(FSBHC0022, dir.getAbsolutePath());
		}
		else {
			if (mL.size() < fileL.size()) {
				//一部は成功
				mL.add(0, new MCMessage(FSBHC0022, dir.getAbsolutePath()));
			}
			messageNoSort(mL);
		}
	}

	/** ファイル形式に応じてファイル名を設定する */
	protected void setFileNm() {
		String ext = getExt();
		String sep = "_";
		getDtlL().forEach(r -> r.file_nm(r.table_id() + sep + r.table_nm() + ext));
	}

	/** ファイル形式に応じてファイル拡張子(.csv/.xlsx)を取得する */
	protected String getExt() {
		String ext;
		if(Cnd2_file_ext_typ_XLSX.isSelected()) {
			ext = FileInfo.SEP + FileInfo.XLSX;
		}
		else {
			ext = FileInfo.SEP + FileInfo.CSV;
		}
		return ext;
	}

	/** ファイルの存在チェック、およびBase64エンコード処理を実行する */
	protected void checkFile(MCMessageList msgList, MCList<DtlR> chkL) {
		MCMessageList mL = checkFileExist(chkL);
		//１ファイルでも存在しない場合は変換処理はしない
		if(mL.isEmpty()) {
			mL.addAll(convertFile(chkL));
		}
		msgList.addAll(mL);
	}

	/** ファイルの存在チェック */
	protected MCMessageList checkFileExist(MCList<DtlR> chkL) {
		MCMessageList mL = new MCMessageList();
		File dir = new File(getCnd2R().dir());
		for (DtlR dtl : chkL) {
			File f = new File(dir, dtl.file_nm());
			if (!f.exists()) {
				mL.add(new MCMessage(MAUDP0004, f.getAbsolutePath()));
			}
		}
		return mL;
	}

	/** ファイルのBASE64エンコード処理 */
	protected MCMessageList convertFile(MCList<DtlR> chkL) {
		MCMessageList mL = new MCMessageList();
		for (DtlR dtl : chkL) {
			encBase64(dtl, mL);
		}
		return mL;
	}

	/**
	 * ファイルのBASE64エンコードを行う。
	 */
	protected void encBase64(DtlR r, MCMessageList msgList) {
		FileInputStream in = null;
		File file = new File(getCnd2R().dir(), r.file_nm());
		boolean del = false;
		try {
			if(Cnd2_file_ext_typ_XLSX.isSelected()){
				BulkImpExcelFile ef = new BulkImpExcelFile();
				file = ef.excelToCSV(file.getAbsolutePath());
				del = true;
			}
			in = new FileInputStream(file);
			r.file_dat(MCDataConvUtil.encodeBase64(in));
		}
		catch (FileNotFoundException ex) {
			MCLog.write(ex);
			msgList.add(new MCMessage(r, null, MBBEP0010, r.file_nm()));
		}
		finally {
			if (in != null) {
				try {
					in.close();
					if(del && file.exists()) {
						file.delete();
					}
				}
				catch (IOException ex) {
					MCLog.write(ex);
				}
			}
		}
	}

	/** ファイルの上書チェック */
	protected boolean checkFileOverWride(MCList<DtlR> chkL) {
		MCMessageList mL = new MCMessageList();
		File dir = new File(_outDir);
		for (DtlR dtl : chkL) {
			File f = new File(dir, dtl.file_nm());
			if (f.exists()) {
				mL.add(new MCMessage(FSBHC0023, dir.getAbsolutePath(), dtl.file_nm()));
			}
		}
		if (!mL.isEmpty()) {
			if (confirm(mL) != MCMessageBox.YES_OPTION) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ExcelファイルをCSVファイルに変換するクラス
	 */
	protected class BulkImpExcelFile extends MCExcelFile {
		/** ExcelファイルをCSVファイルに変換する */
		public File excelToCSV(String fileName) {
			initReadExcel(fileName);
			String tmpName = text2CSV(fileName, null);
			return new File(tmpName);
		}
	}

	// ///////////////////// IfListRegPanel ///////////////////////////////////
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

}