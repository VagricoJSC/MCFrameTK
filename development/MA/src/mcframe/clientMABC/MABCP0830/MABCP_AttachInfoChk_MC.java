package mcframe.clientMABC.MABCP0830;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonCore.sys.MCExec;
import java.io.File;
import java.awt.Desktop;
import java.net.URI;
import java.lang.NullPointerException;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.net.URISyntaxException;
import mcframe.clientCore.requester.MCDownloader;
import mcframe.clientCore.beans.popup.MCImagePanelInfo;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_AttachInfoChk"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_AttachInfoChk_MC extends MABCP_AttachInfoChk_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AttachInfoChk_MC() {
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
	public MABCP_AttachInfoChk_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0830_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0830_Srch01Caller<P extends MABCP_AttachInfoChk, B extends MA_MABCL0830_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0830_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0830_Srch01();
	}
	
	/**
	 * Panel[DtlBtn]のボタン[open]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open(MCEventInfo info) {
		
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(new MCMessage(MAUDP0038));
			return;
		}
		if (!isNull(r.attach_info_path())) {
			try {
				Desktop desktop = Desktop.getDesktop();
				if (r.attach_info_path().toLowerCase().startsWith("http:") ||
					r.attach_info_path().toLowerCase().startsWith("https:")) {

					if (!isNull(getDtlBtnR().file())) {
						String execCmd = getDtlBtnR().file() + " " + r.attach_info_path();
						MCExec exec = new MCExec();
						exec.setWait(false);
						exec.setCommand(execCmd);
						exec.execute();
					}
					else {
						desktop.browse(new URI(r.attach_info_path()));
					}
				}
				else {
					desktop.open(new File(r.attach_info_path()));
				}
			}
			catch (NullPointerException ex) {
				dialog(new MCMessage(MABCP0020, r.attach_info_path()));
			}
			catch (IllegalArgumentException ex) {
				dialog(new MCMessage(MABCP0020, r.attach_info_path()));
			}
			catch (IOException ex) {
				dialog(new MCMessage(MABCP0020, r.attach_info_path()));
			}
			catch (URISyntaxException ex) {
				dialog(new MCMessage(MABCP0020, r.attach_info_path()));
			}
			catch (MCException ex) {
				dialog(new MCMessage(MABCP0020, r.attach_info_path()));
			}
		}
		else {
			if (!isNull(r.attach_info_bin())) {
				doOpenImage(r);
			}
		}
	}
	
	/**
	 * Panel[DtlBtn]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doDtlBtn_dwnld(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(new MCMessage(MAUDP0038));
			return;
		}
		if (isNull(r.attach_info_bin()) || r.attach_info_bin().isLocalFile()) {
			return;
		}
		else {
			doDownload(r);
		}
	}
	
	/**
	 * Panel[DtlBtn]のボタン[select_file]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_file(MCEventInfo info) {
		File f = MCFileChooser.showLoadDialog(null, this);
		if (f != null) {
			getDtlBtnR().file(f.getAbsolutePath());
		}
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getDtlBtnR().file(MCConfig.client.getBrowserFilePath());
	}

	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);
		if (info.getEventIndex() < 0) return ;
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r.attach_info_bin())) {
			DtlBtn_dwnld.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtn_dwnld.setMode(MCMode.ENABLE);
		}
	}
	
	@Override
	protected void setStatusByOpe() {
		// 何もなし
	}

	@Override
	public void setMode(String status) {
		super.setMode(status);
		// ステータスの設定
		DtlTable.setStatusColumnVisible(false);
	}
	
	protected void doOpenImage(DtlR dtl) {
		MCImagePanelInfo o = new MCImagePanelInfo();
		o.setLinkComponent(columnDtl_attach_info_bin, dtl.getGUIIndex());
		o.setEditable(false);
		openModalPanel("FS", "FSBAP0220", T1, null, o);
	}

	protected void doDownload(DtlR dtl) {
		
		// 確認ダイアログ
		if (confirm(new MCMessage(MAUDP0401)) != MCMessageBox.YES_OPTION) {
			return;
		}
		// ダウンロードFileChooser設定
		// 環境設定で指定した初期表示ディレクトリで起動（指定がなければデフォルト設定）
		MCFileChooser filechooser = new MCFileChooser(MCFileChooser.getDefaultDirectory());
		// 初期ファイル名としてダウンロードファイル名をセット
		filechooser.setSelectedFile(new File(dtl.attach_info_bin_nm()));
		int selected = filechooser.showSaveDialog(this);
		if (selected != MCFileChooser.APPROVE_OPTION) {
			return;
		}
		File path = filechooser.getSelectedFile();

		if (path != null) {
			// MCDownLoaderにダウンロード対象ファイル名をセット
			MCDownloader dl = new MCDownloader(dtl.attach_info_bin());
			try{
				// 指定したファイルパス、ファイル名でダウンロード
				dl.exec(path.getParentFile(), path.getName());
			}
			catch (MCException ex) {
				// ダウンロード失敗（対象ファイル起動の可能性）
				if (ex.getID().equals("FCBGC0079")) {
					dialog(new MCMessage(MAUDP0408, ex.getBind(2).concat("\\").concat(ex.getBind(3))));
					return;
				}
				throw ex;
			}
			dialog(new MCMessage(MAUDP0404, getScreenName(), path.getPath(), path.getName()));
		}
	}

}