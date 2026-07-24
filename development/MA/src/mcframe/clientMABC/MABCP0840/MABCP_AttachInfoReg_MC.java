package mcframe.clientMABC.MABCP0840;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5070.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.File;
import mcframe.clientCore.requester.MCDownloader;
import static mcframe.commonCore.notice.Core_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_AttachInfoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_AttachInfoReg_MC extends MABCP_AttachInfoReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AttachInfoReg_MC() {
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
	public MABCP_AttachInfoReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[RPnl]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MA_MABCL0840_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Srch01Caller<P extends MABCP_AttachInfoReg, B extends MA_MABCL0840_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0840_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(mcframe.commonCore.notice.MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	/**
	 * [MA_MABCL0840_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Upd01Caller<P extends MABCP_AttachInfoReg, B extends MA_MABCL0840_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0840_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0840_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Del01Caller<P extends MABCP_AttachInfoReg, B extends MA_MABCL0840_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0840_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0840_Srch01();
	}
	/**
	 * Panel[Row]のボタン[select_file]の押下時の処理
	 */
	@Override
	public void doRow_select_file(MCEventInfo info) {

		doSelectFile();
		doAdd();

		if (!isNull(getRowR().attach_info_bin())) {

			Row_attach_info_path.setMode(MCMode.READ_ONLY);
			Row_attach_info_bin_nm.setMode(MCMode.REQUIRED);
		}
	}
	/**
	 * Panel[Row]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRow_dwnld(MCEventInfo info) {
		doDownload();
	}
	/**
	 * Panel[Row]のボタン[clear_file]の押下時の処理
	 */
	@Override
	public void doRow_clear_file(MCEventInfo info) {

		doClearFile();

		if (isNull(getRowR().attach_info_bin())) {

			Row_attach_info_path.setMode(MCMode.ENABLE);
			Row_attach_info_bin_nm.setMode(MCMode.READ_ONLY);
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
	 * Panel[DtlBtn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_cmn(MCEventInfo info) {
		callMA_MABCL0840_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_wg(MCEventInfo info) {
		callMA_MABCL0840_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_cmn(MCEventInfo info) {
		callMA_MABCL0840_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_wg(MCEventInfo info) {
		callMA_MABCL0840_Del01();
	}


	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			if (getCndR().cmn_flg()) {

				if (getCndR().wg_flg()) {
					setValueEx(Cnd_wg_cd, null);
				}

				getCndR().wg_flg(false);
			}
		}

		clearAll();
		DtlTable.fillSpace();
		DtlTable.selectLeftmostColumn(0);
		getRowR().clearAll();
		setModeChgFlg();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			if (getCndR().wg_flg()) {
				getCndR().cmn_flg(false);
			}
		}

		clearAll();
		DtlTable.fillSpace();
		DtlTable.selectLeftmostColumn(0);
		getRowR().clear();
		setModeChgFlg();
	}

	protected void setModeChgFlg() {

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {

			if (getCndR().cmn_flg()) {

				Cnd_wg_cd.setMode(MCMode.READ_ONLY);
				Cnd_wg_nm.setMode(MCMode.READ_ONLY);
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			else {
				Cnd_wg_cd.setMode(MCMode.ENABLE);
				Cnd_wg_nm.setMode(MCMode.ENABLE);
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}

			if (getCndR().wg_flg()) {

				if (Cnd_ope_UPD.isSelected()) {
					DtlBtn_upd_cmn.setMode(MCMode.INVISIBLE);
					DtlBtn_upd_wg.setMode(MCMode.ENABLE);
				}
				else if (Cnd_ope_DEL.isSelected()) {
					DtlBtn_del_cmn.setMode(MCMode.INVISIBLE);
					DtlBtn_del_wg.setMode(MCMode.ENABLE);
				}
			}
			else {

				if (Cnd_ope_UPD.isSelected()) {
					DtlBtn_upd_cmn.setMode(MCMode.ENABLE);
					DtlBtn_upd_wg.setMode(MCMode.INVISIBLE);
				}
				else if (Cnd_ope_DEL.isSelected()) {
					DtlBtn_del_cmn.setMode(MCMode.ENABLE);
					DtlBtn_del_wg.setMode(MCMode.INVISIBLE);
				}
			}
		}

		if (Cnd_ope_REF.isSelected()) {

			if (getCndR().cmn_flg() && !getCndR().wg_flg()) {

				Cnd_wg_cd.setMode(MCMode.READ_ONLY);
				Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			}
			else {
				Cnd_wg_cd.setMode(MCMode.ENABLE);
				Cnd_wg_nm.setMode(MCMode.ENABLE);
			}
		}
	}

	@Override
	public void doRow_attach_info_path_NC(MCEventInfo info) {
		super.doRow_attach_info_path_NC(info);

		setValueEx(columnDtl_attach_info_path, DtlTable.getSelectedMCRow().getGUIIndex(), getRowR().attach_info_path());

		if (!isNull(getRowR().attach_info_path())) {

			Row_select_file.setMode(MCMode.DISABLE);
			Row_dwnld.setMode(MCMode.DISABLE);
			Row_clear_file.setMode(MCMode.DISABLE);
		}
		else {

			Row_select_file.setMode(MCMode.ENABLE);
			Row_dwnld.setMode(MCMode.ENABLE);
			Row_clear_file.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void doRow_attach_info_bin_nm_NC(MCEventInfo info) {
		super.doRow_attach_info_bin_nm_NC(info);

		setValueEx(columnDtl_attach_info_bin_nm, DtlTable.getSelectedMCRow().getGUIIndex(), getRowR().attach_info_bin_nm());

		if (!isNull(getRowR().attach_info_bin())) {

			Row_attach_info_path.setMode(MCMode.READ_ONLY);
			Row_attach_info_bin_nm.setMode(MCMode.REQUIRED);
		}
		else {
			getRowR().file(null);
			Row_attach_info_path.setMode(MCMode.ENABLE);
			Row_attach_info_bin_nm.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doRow_attach_info_rmrks_NC(MCEventInfo info) {
		super.doRow_attach_info_rmrks_NC(info);

		setValueEx(columnDtl_attach_info_rmrks, DtlTable.getSelectedMCRow().getGUIIndex(), getRowR().attach_info_rmrks());
	}

	/**選択行変更時のイベント*/
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRow(info);
	}

	protected void setRow(MCEventInfo info) {
		
		if (info.getEventIndex() < 0) {
			return;
		}
		DtlR r = getDtlL().get(info.getEventIndex());

		getRowR().clear();
		getRowR().attach_info_bin(r.attach_info_bin());
		getRowR().attach_info_rmrks(r.attach_info_rmrks());
		getRowR().attach_info_path(r.attach_info_path());
		getRowR().attach_info_bin_nm(r.attach_info_bin_nm());
		if (isUpdOpe()) {
			if (!isNull(getRowR().attach_info_path())) {

				Row_attach_info_path.setMode(MCMode.ENABLE);
				Row_attach_info_bin_nm.setMode(MCMode.READ_ONLY);
				Row_select_file.setMode(MCMode.DISABLE);
				Row_dwnld.setMode(MCMode.DISABLE);
				Row_clear_file.setMode(MCMode.DISABLE);
			}
			else {

				Row_attach_info_path.setMode(MCMode.READ_ONLY);
				if (isNull(getRowR().attach_info_bin_nm())) {
					Row_attach_info_path.setMode(MCMode.ENABLE);
					Row_attach_info_bin_nm.setMode(MCMode.READ_ONLY);
				}
				Row_select_file.setMode(MCMode.ENABLE);
				Row_dwnld.setMode(MCMode.ENABLE);
				Row_clear_file.setMode(MCMode.ENABLE);
			}
		}
	}

	@Override
	public void doDtl_attach_info_typ_NC(MCEventInfo info) {
		super.doDtl_attach_info_typ_NC(info);
		
		int idx = info.getEventIndex();
		if (info.getEventIndex() < 0) return;
		
		DtlR dtlR = getDtlL().get(idx);
		
		if (MAC_ATTACH_INFO_TYP.isPLM(dtlR.attach_info_typ())) {
			setValueEx(columnDtl_attach_info_id, idx, "0");
		}
		else {
			setValueEx(columnDtl_attach_info_id, idx, null);
		}
	}
	
	protected void doDownload() {

		if (isNull(getRowR().attach_info_bin())
				|| getRowR().attach_info_bin().isLocalFile()) {
			return;
		}
		
		// ダウンロードFileChooser設定
		// 環境設定で指定した初期表示ディレクトリで起動（指定がなければデフォルト設定）
		MCFileChooser filechooser = new MCFileChooser(MCFileChooser.getDefaultDirectory());
		// 初期ファイル名としてダウンロードファイル名をセット
		filechooser.setSelectedFile(new File(getRowR().attach_info_bin_nm()));
		int selected = filechooser.showSaveDialog(this);
		if (selected != MCFileChooser.APPROVE_OPTION) {
			return;
		}
		File path = filechooser.getSelectedFile();

		if (path != null) {
			// MCDownLoaderにダウンロード対象ファイル名をセット
			MCDownloader dl = new MCDownloader(getRowR().attach_info_bin());
			try{
				// 指定したファイルパス、ファイル名でダウンロード
				dl.exec(path.getParentFile(), path.getName());
			}
			catch (MCException ex) {
				// ダウンロード失敗（対象ファイル起動の可能性）
				if (ex.getID().equals(FCBGC0079)) {
					dialog(new MCMessage(MAUDP0408, ex.getBind(2).concat("\\").concat(ex.getBind(3))));
					return;
				}
				throw ex;
			}
			dialog(new MCMessage(MAUDP0404, getScreenName(), path.getPath(), path.getName()));
		}
	}

	protected void doSelectFile() {
		File f = MCFileChooser.showLoadDialog(null, this);
		if (f != null) {
			getRowR().file(f.getAbsolutePath());
		}
	}

	protected void doAdd() {

		if (isNull(getRowR().file())) {

			getRowR().attach_info_bin(null);
			DtlTable.getSelectedMCRow().attach_info_bin(null);
			setValueEx(Row_attach_info_bin_nm, null);
			
			return;
		}
		File f = new File(getRowR().file());
		if (f.exists() && f.isFile()) {

			getRowR().attach_info_bin(MCBinary.valueOf(f));
			DtlTable.getSelectedMCRow().attach_info_bin(MCBinary.valueOf(f));
			setValueEx(Row_attach_info_bin_nm, f.getName());
		}
		else {

			getRowR().attach_info_bin(null);
			DtlTable.getSelectedMCRow().attach_info_bin(null);
			setValueEx(Row_attach_info_bin_nm, null);
		}
	}

	protected void doClearFile() {

		getRowR().attach_info_bin(null);
		DtlTable.getSelectedMCRow().attach_info_bin(null);
		setValueEx(Row_attach_info_bin_nm, null);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		getRowR().clear();
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {

			if (getCndR().cmn_flg() && getCndR().wg_flg()) {
				getCndR().cmn_flg(true);
				getCndR().wg_flg(false);
			}
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setModeChgFlg();
		setRegTgtMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setModeChgFlg();
		setRegTgtMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setModeChgFlg();
		setRegTgtMode();
	}
	protected void setRegTgtMode() {
		if (RPnl_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (RPnl_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		else if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E newRow = super.copyRowSub(row);
		if (newRow == null) return null;
		// コピー対象外
		if (!MAC_ATTACH_INFO_TYP.isPLM(newRow.getStringNE("attach_info_typ"))) {
			newRow.setStringNE("attach_info_id", null);
		}
		return newRow;
	}

}